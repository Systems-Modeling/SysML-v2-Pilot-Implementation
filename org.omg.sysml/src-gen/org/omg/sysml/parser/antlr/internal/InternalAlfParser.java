package org.omg.sysml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.omg.sysml.services.AlfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlfParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOCUMENTATION_COMMENT", "RULE_BOOLEAN_VALUE", "RULE_STRING_VALUE", "RULE_NATURAL_VALUE", "RULE_EXP_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'import'", "'::'", "'.'", "'*'", "';'", "'as'", "'package'", "'{'", "'}'", "'is'", "'Class'", "'class'", "'datatype'", "'assoc'", "'behavior'", "'function'", "'feature'", "'abstract'", "'part'", "'port'", "'connector'", "'specializes'", "','", "'end'", "'('", "')'", "'step'", "'expr'", "'redefines'", "'='", "':'", "'compose'", "'any'", "'ordered'", "'nonunique'", "'['", "'..'", "']'", "'subsets'", "'to'", "'=>'", "'?'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'/'", "'**'", "'@'", "'!'", "'~'", "'->'", "'null'", "'public'", "'private'", "'protected'", "'packaged'", "'in'", "'out'", "'inout'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_STATEMENT_ANNOTATION=11;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_DOCUMENTATION_COMMENT=4;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=9;
    public static final int RULE_NATURAL_VALUE=7;
    public static final int RULE_INLINE_STATEMENT=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int RULE_BOOLEAN_VALUE=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=15;
    public static final int RULE_UNRESTRICTED_NAME=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_STRING_VALUE=6;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int RULE_EXP_VALUE=8;
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

        public InternalAlfParser(TokenStream input, AlfGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "UnitDefinition";
       	}

       	@Override
       	protected AlfGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUnitDefinition"
    // InternalAlf.g:65:1: entryRuleUnitDefinition returns [EObject current=null] : iv_ruleUnitDefinition= ruleUnitDefinition EOF ;
    public final EObject entryRuleUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitDefinition = null;


        try {
            // InternalAlf.g:65:55: (iv_ruleUnitDefinition= ruleUnitDefinition EOF )
            // InternalAlf.g:66:2: iv_ruleUnitDefinition= ruleUnitDefinition EOF
            {
             newCompositeNode(grammarAccess.getUnitDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnitDefinition=ruleUnitDefinition();

            state._fsp--;

             current =iv_ruleUnitDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnitDefinition"


    // $ANTLR start "ruleUnitDefinition"
    // InternalAlf.g:72:1: ruleUnitDefinition returns [EObject current=null] : (this_PackageUnitDefinition_0= rulePackageUnitDefinition | this_ClassUnitDefinition_1= ruleClassUnitDefinition | this_ObjectClassUnitDefinition_2= ruleObjectClassUnitDefinition | this_ValueClassUnitDefinition_3= ruleValueClassUnitDefinition | this_AssociationUnitDefinition_4= ruleAssociationUnitDefinition | this_BehaviorUnitDefinition_5= ruleBehaviorUnitDefinition | this_FunctionUnitDefinition_6= ruleFunctionUnitDefinition | this_FeatureUnitDefinition_7= ruleFeatureUnitDefinition ) ;
    public final EObject ruleUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageUnitDefinition_0 = null;

        EObject this_ClassUnitDefinition_1 = null;

        EObject this_ObjectClassUnitDefinition_2 = null;

        EObject this_ValueClassUnitDefinition_3 = null;

        EObject this_AssociationUnitDefinition_4 = null;

        EObject this_BehaviorUnitDefinition_5 = null;

        EObject this_FunctionUnitDefinition_6 = null;

        EObject this_FeatureUnitDefinition_7 = null;



        	enterRule();

        try {
            // InternalAlf.g:78:2: ( (this_PackageUnitDefinition_0= rulePackageUnitDefinition | this_ClassUnitDefinition_1= ruleClassUnitDefinition | this_ObjectClassUnitDefinition_2= ruleObjectClassUnitDefinition | this_ValueClassUnitDefinition_3= ruleValueClassUnitDefinition | this_AssociationUnitDefinition_4= ruleAssociationUnitDefinition | this_BehaviorUnitDefinition_5= ruleBehaviorUnitDefinition | this_FunctionUnitDefinition_6= ruleFunctionUnitDefinition | this_FeatureUnitDefinition_7= ruleFeatureUnitDefinition ) )
            // InternalAlf.g:79:2: (this_PackageUnitDefinition_0= rulePackageUnitDefinition | this_ClassUnitDefinition_1= ruleClassUnitDefinition | this_ObjectClassUnitDefinition_2= ruleObjectClassUnitDefinition | this_ValueClassUnitDefinition_3= ruleValueClassUnitDefinition | this_AssociationUnitDefinition_4= ruleAssociationUnitDefinition | this_BehaviorUnitDefinition_5= ruleBehaviorUnitDefinition | this_FunctionUnitDefinition_6= ruleFunctionUnitDefinition | this_FeatureUnitDefinition_7= ruleFeatureUnitDefinition )
            {
            // InternalAlf.g:79:2: (this_PackageUnitDefinition_0= rulePackageUnitDefinition | this_ClassUnitDefinition_1= ruleClassUnitDefinition | this_ObjectClassUnitDefinition_2= ruleObjectClassUnitDefinition | this_ValueClassUnitDefinition_3= ruleValueClassUnitDefinition | this_AssociationUnitDefinition_4= ruleAssociationUnitDefinition | this_BehaviorUnitDefinition_5= ruleBehaviorUnitDefinition | this_FunctionUnitDefinition_6= ruleFunctionUnitDefinition | this_FeatureUnitDefinition_7= ruleFeatureUnitDefinition )
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalAlf.g:80:3: this_PackageUnitDefinition_0= rulePackageUnitDefinition
                    {

                    			newCompositeNode(grammarAccess.getUnitDefinitionAccess().getPackageUnitDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackageUnitDefinition_0=rulePackageUnitDefinition();

                    state._fsp--;


                    			current = this_PackageUnitDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:89:3: this_ClassUnitDefinition_1= ruleClassUnitDefinition
                    {

                    			newCompositeNode(grammarAccess.getUnitDefinitionAccess().getClassUnitDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassUnitDefinition_1=ruleClassUnitDefinition();

                    state._fsp--;


                    			current = this_ClassUnitDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:98:3: this_ObjectClassUnitDefinition_2= ruleObjectClassUnitDefinition
                    {

                    			newCompositeNode(grammarAccess.getUnitDefinitionAccess().getObjectClassUnitDefinitionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectClassUnitDefinition_2=ruleObjectClassUnitDefinition();

                    state._fsp--;


                    			current = this_ObjectClassUnitDefinition_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:107:3: this_ValueClassUnitDefinition_3= ruleValueClassUnitDefinition
                    {

                    			newCompositeNode(grammarAccess.getUnitDefinitionAccess().getValueClassUnitDefinitionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueClassUnitDefinition_3=ruleValueClassUnitDefinition();

                    state._fsp--;


                    			current = this_ValueClassUnitDefinition_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:116:3: this_AssociationUnitDefinition_4= ruleAssociationUnitDefinition
                    {

                    			newCompositeNode(grammarAccess.getUnitDefinitionAccess().getAssociationUnitDefinitionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssociationUnitDefinition_4=ruleAssociationUnitDefinition();

                    state._fsp--;


                    			current = this_AssociationUnitDefinition_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAlf.g:125:3: this_BehaviorUnitDefinition_5= ruleBehaviorUnitDefinition
                    {

                    			newCompositeNode(grammarAccess.getUnitDefinitionAccess().getBehaviorUnitDefinitionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_BehaviorUnitDefinition_5=ruleBehaviorUnitDefinition();

                    state._fsp--;


                    			current = this_BehaviorUnitDefinition_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAlf.g:134:3: this_FunctionUnitDefinition_6= ruleFunctionUnitDefinition
                    {

                    			newCompositeNode(grammarAccess.getUnitDefinitionAccess().getFunctionUnitDefinitionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionUnitDefinition_6=ruleFunctionUnitDefinition();

                    state._fsp--;


                    			current = this_FunctionUnitDefinition_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalAlf.g:143:3: this_FeatureUnitDefinition_7= ruleFeatureUnitDefinition
                    {

                    			newCompositeNode(grammarAccess.getUnitDefinitionAccess().getFeatureUnitDefinitionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureUnitDefinition_7=ruleFeatureUnitDefinition();

                    state._fsp--;


                    			current = this_FeatureUnitDefinition_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnitDefinition"


    // $ANTLR start "entryRulePackageUnitDefinition"
    // InternalAlf.g:155:1: entryRulePackageUnitDefinition returns [EObject current=null] : iv_rulePackageUnitDefinition= rulePackageUnitDefinition EOF ;
    public final EObject entryRulePackageUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageUnitDefinition = null;


        try {
            // InternalAlf.g:155:62: (iv_rulePackageUnitDefinition= rulePackageUnitDefinition EOF )
            // InternalAlf.g:156:2: iv_rulePackageUnitDefinition= rulePackageUnitDefinition EOF
            {
             newCompositeNode(grammarAccess.getPackageUnitDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageUnitDefinition=rulePackageUnitDefinition();

            state._fsp--;

             current =iv_rulePackageUnitDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageUnitDefinition"


    // $ANTLR start "rulePackageUnitDefinition"
    // InternalAlf.g:162:1: rulePackageUnitDefinition returns [EObject current=null] : (this_UnitPrefix_0= ruleUnitPrefix[$current] this_PackageDefinition_1= rulePackageDefinition[$current] ) ;
    public final EObject rulePackageUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_UnitPrefix_0 = null;

        EObject this_PackageDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:168:2: ( (this_UnitPrefix_0= ruleUnitPrefix[$current] this_PackageDefinition_1= rulePackageDefinition[$current] ) )
            // InternalAlf.g:169:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_PackageDefinition_1= rulePackageDefinition[$current] )
            {
            // InternalAlf.g:169:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_PackageDefinition_1= rulePackageDefinition[$current] )
            // InternalAlf.g:170:3: this_UnitPrefix_0= ruleUnitPrefix[$current] this_PackageDefinition_1= rulePackageDefinition[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getPackageUnitDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getPackageUnitDefinitionAccess().getUnitPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            this_UnitPrefix_0=ruleUnitPrefix(current);

            state._fsp--;


            			current = this_UnitPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getPackageUnitDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getPackageUnitDefinitionAccess().getPackageDefinitionParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_PackageDefinition_1=rulePackageDefinition(current);

            state._fsp--;


            			current = this_PackageDefinition_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageUnitDefinition"


    // $ANTLR start "entryRuleClassUnitDefinition"
    // InternalAlf.g:196:1: entryRuleClassUnitDefinition returns [EObject current=null] : iv_ruleClassUnitDefinition= ruleClassUnitDefinition EOF ;
    public final EObject entryRuleClassUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassUnitDefinition = null;


        try {
            // InternalAlf.g:196:60: (iv_ruleClassUnitDefinition= ruleClassUnitDefinition EOF )
            // InternalAlf.g:197:2: iv_ruleClassUnitDefinition= ruleClassUnitDefinition EOF
            {
             newCompositeNode(grammarAccess.getClassUnitDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassUnitDefinition=ruleClassUnitDefinition();

            state._fsp--;

             current =iv_ruleClassUnitDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassUnitDefinition"


    // $ANTLR start "ruleClassUnitDefinition"
    // InternalAlf.g:203:1: ruleClassUnitDefinition returns [EObject current=null] : (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ClassDefinition_1= ruleClassDefinition[$current] ) ;
    public final EObject ruleClassUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_UnitPrefix_0 = null;

        EObject this_ClassDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:209:2: ( (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ClassDefinition_1= ruleClassDefinition[$current] ) )
            // InternalAlf.g:210:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ClassDefinition_1= ruleClassDefinition[$current] )
            {
            // InternalAlf.g:210:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ClassDefinition_1= ruleClassDefinition[$current] )
            // InternalAlf.g:211:3: this_UnitPrefix_0= ruleUnitPrefix[$current] this_ClassDefinition_1= ruleClassDefinition[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getClassUnitDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getClassUnitDefinitionAccess().getUnitPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_UnitPrefix_0=ruleUnitPrefix(current);

            state._fsp--;


            			current = this_UnitPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getClassUnitDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getClassUnitDefinitionAccess().getClassDefinitionParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_ClassDefinition_1=ruleClassDefinition(current);

            state._fsp--;


            			current = this_ClassDefinition_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassUnitDefinition"


    // $ANTLR start "entryRuleObjectClassUnitDefinition"
    // InternalAlf.g:237:1: entryRuleObjectClassUnitDefinition returns [EObject current=null] : iv_ruleObjectClassUnitDefinition= ruleObjectClassUnitDefinition EOF ;
    public final EObject entryRuleObjectClassUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectClassUnitDefinition = null;


        try {
            // InternalAlf.g:237:66: (iv_ruleObjectClassUnitDefinition= ruleObjectClassUnitDefinition EOF )
            // InternalAlf.g:238:2: iv_ruleObjectClassUnitDefinition= ruleObjectClassUnitDefinition EOF
            {
             newCompositeNode(grammarAccess.getObjectClassUnitDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectClassUnitDefinition=ruleObjectClassUnitDefinition();

            state._fsp--;

             current =iv_ruleObjectClassUnitDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectClassUnitDefinition"


    // $ANTLR start "ruleObjectClassUnitDefinition"
    // InternalAlf.g:244:1: ruleObjectClassUnitDefinition returns [EObject current=null] : (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ObjectClassDefinition_1= ruleObjectClassDefinition[$current] ) ;
    public final EObject ruleObjectClassUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_UnitPrefix_0 = null;

        EObject this_ObjectClassDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:250:2: ( (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ObjectClassDefinition_1= ruleObjectClassDefinition[$current] ) )
            // InternalAlf.g:251:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ObjectClassDefinition_1= ruleObjectClassDefinition[$current] )
            {
            // InternalAlf.g:251:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ObjectClassDefinition_1= ruleObjectClassDefinition[$current] )
            // InternalAlf.g:252:3: this_UnitPrefix_0= ruleUnitPrefix[$current] this_ObjectClassDefinition_1= ruleObjectClassDefinition[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getObjectClassUnitDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getObjectClassUnitDefinitionAccess().getUnitPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_UnitPrefix_0=ruleUnitPrefix(current);

            state._fsp--;


            			current = this_UnitPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getObjectClassUnitDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getObjectClassUnitDefinitionAccess().getObjectClassDefinitionParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_ObjectClassDefinition_1=ruleObjectClassDefinition(current);

            state._fsp--;


            			current = this_ObjectClassDefinition_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectClassUnitDefinition"


    // $ANTLR start "entryRuleValueClassUnitDefinition"
    // InternalAlf.g:278:1: entryRuleValueClassUnitDefinition returns [EObject current=null] : iv_ruleValueClassUnitDefinition= ruleValueClassUnitDefinition EOF ;
    public final EObject entryRuleValueClassUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueClassUnitDefinition = null;


        try {
            // InternalAlf.g:278:65: (iv_ruleValueClassUnitDefinition= ruleValueClassUnitDefinition EOF )
            // InternalAlf.g:279:2: iv_ruleValueClassUnitDefinition= ruleValueClassUnitDefinition EOF
            {
             newCompositeNode(grammarAccess.getValueClassUnitDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueClassUnitDefinition=ruleValueClassUnitDefinition();

            state._fsp--;

             current =iv_ruleValueClassUnitDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueClassUnitDefinition"


    // $ANTLR start "ruleValueClassUnitDefinition"
    // InternalAlf.g:285:1: ruleValueClassUnitDefinition returns [EObject current=null] : (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ValueClassDefinition_1= ruleValueClassDefinition[$current] ) ;
    public final EObject ruleValueClassUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_UnitPrefix_0 = null;

        EObject this_ValueClassDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:291:2: ( (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ValueClassDefinition_1= ruleValueClassDefinition[$current] ) )
            // InternalAlf.g:292:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ValueClassDefinition_1= ruleValueClassDefinition[$current] )
            {
            // InternalAlf.g:292:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ValueClassDefinition_1= ruleValueClassDefinition[$current] )
            // InternalAlf.g:293:3: this_UnitPrefix_0= ruleUnitPrefix[$current] this_ValueClassDefinition_1= ruleValueClassDefinition[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getValueClassUnitDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getValueClassUnitDefinitionAccess().getUnitPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_UnitPrefix_0=ruleUnitPrefix(current);

            state._fsp--;


            			current = this_UnitPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getValueClassUnitDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getValueClassUnitDefinitionAccess().getValueClassDefinitionParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_ValueClassDefinition_1=ruleValueClassDefinition(current);

            state._fsp--;


            			current = this_ValueClassDefinition_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueClassUnitDefinition"


    // $ANTLR start "entryRuleAssociationUnitDefinition"
    // InternalAlf.g:319:1: entryRuleAssociationUnitDefinition returns [EObject current=null] : iv_ruleAssociationUnitDefinition= ruleAssociationUnitDefinition EOF ;
    public final EObject entryRuleAssociationUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationUnitDefinition = null;


        try {
            // InternalAlf.g:319:66: (iv_ruleAssociationUnitDefinition= ruleAssociationUnitDefinition EOF )
            // InternalAlf.g:320:2: iv_ruleAssociationUnitDefinition= ruleAssociationUnitDefinition EOF
            {
             newCompositeNode(grammarAccess.getAssociationUnitDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationUnitDefinition=ruleAssociationUnitDefinition();

            state._fsp--;

             current =iv_ruleAssociationUnitDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociationUnitDefinition"


    // $ANTLR start "ruleAssociationUnitDefinition"
    // InternalAlf.g:326:1: ruleAssociationUnitDefinition returns [EObject current=null] : (this_UnitPrefix_0= ruleUnitPrefix[$current] this_AssociationDefinition_1= ruleAssociationDefinition[$current] ) ;
    public final EObject ruleAssociationUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_UnitPrefix_0 = null;

        EObject this_AssociationDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:332:2: ( (this_UnitPrefix_0= ruleUnitPrefix[$current] this_AssociationDefinition_1= ruleAssociationDefinition[$current] ) )
            // InternalAlf.g:333:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_AssociationDefinition_1= ruleAssociationDefinition[$current] )
            {
            // InternalAlf.g:333:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_AssociationDefinition_1= ruleAssociationDefinition[$current] )
            // InternalAlf.g:334:3: this_UnitPrefix_0= ruleUnitPrefix[$current] this_AssociationDefinition_1= ruleAssociationDefinition[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationUnitDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationUnitDefinitionAccess().getUnitPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_UnitPrefix_0=ruleUnitPrefix(current);

            state._fsp--;


            			current = this_UnitPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationUnitDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationUnitDefinitionAccess().getAssociationDefinitionParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_AssociationDefinition_1=ruleAssociationDefinition(current);

            state._fsp--;


            			current = this_AssociationDefinition_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociationUnitDefinition"


    // $ANTLR start "entryRuleBehaviorUnitDefinition"
    // InternalAlf.g:360:1: entryRuleBehaviorUnitDefinition returns [EObject current=null] : iv_ruleBehaviorUnitDefinition= ruleBehaviorUnitDefinition EOF ;
    public final EObject entryRuleBehaviorUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorUnitDefinition = null;


        try {
            // InternalAlf.g:360:63: (iv_ruleBehaviorUnitDefinition= ruleBehaviorUnitDefinition EOF )
            // InternalAlf.g:361:2: iv_ruleBehaviorUnitDefinition= ruleBehaviorUnitDefinition EOF
            {
             newCompositeNode(grammarAccess.getBehaviorUnitDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorUnitDefinition=ruleBehaviorUnitDefinition();

            state._fsp--;

             current =iv_ruleBehaviorUnitDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviorUnitDefinition"


    // $ANTLR start "ruleBehaviorUnitDefinition"
    // InternalAlf.g:367:1: ruleBehaviorUnitDefinition returns [EObject current=null] : (this_UnitPrefix_0= ruleUnitPrefix[$current] this_BehaviorDefinition_1= ruleBehaviorDefinition[$current] ) ;
    public final EObject ruleBehaviorUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_UnitPrefix_0 = null;

        EObject this_BehaviorDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:373:2: ( (this_UnitPrefix_0= ruleUnitPrefix[$current] this_BehaviorDefinition_1= ruleBehaviorDefinition[$current] ) )
            // InternalAlf.g:374:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_BehaviorDefinition_1= ruleBehaviorDefinition[$current] )
            {
            // InternalAlf.g:374:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_BehaviorDefinition_1= ruleBehaviorDefinition[$current] )
            // InternalAlf.g:375:3: this_UnitPrefix_0= ruleUnitPrefix[$current] this_BehaviorDefinition_1= ruleBehaviorDefinition[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getBehaviorUnitDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getBehaviorUnitDefinitionAccess().getUnitPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_UnitPrefix_0=ruleUnitPrefix(current);

            state._fsp--;


            			current = this_UnitPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getBehaviorUnitDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getBehaviorUnitDefinitionAccess().getBehaviorDefinitionParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_BehaviorDefinition_1=ruleBehaviorDefinition(current);

            state._fsp--;


            			current = this_BehaviorDefinition_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviorUnitDefinition"


    // $ANTLR start "entryRuleFunctionUnitDefinition"
    // InternalAlf.g:401:1: entryRuleFunctionUnitDefinition returns [EObject current=null] : iv_ruleFunctionUnitDefinition= ruleFunctionUnitDefinition EOF ;
    public final EObject entryRuleFunctionUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionUnitDefinition = null;


        try {
            // InternalAlf.g:401:63: (iv_ruleFunctionUnitDefinition= ruleFunctionUnitDefinition EOF )
            // InternalAlf.g:402:2: iv_ruleFunctionUnitDefinition= ruleFunctionUnitDefinition EOF
            {
             newCompositeNode(grammarAccess.getFunctionUnitDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionUnitDefinition=ruleFunctionUnitDefinition();

            state._fsp--;

             current =iv_ruleFunctionUnitDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionUnitDefinition"


    // $ANTLR start "ruleFunctionUnitDefinition"
    // InternalAlf.g:408:1: ruleFunctionUnitDefinition returns [EObject current=null] : (this_UnitPrefix_0= ruleUnitPrefix[$current] this_FunctionDefinition_1= ruleFunctionDefinition[$current] ) ;
    public final EObject ruleFunctionUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_UnitPrefix_0 = null;

        EObject this_FunctionDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:414:2: ( (this_UnitPrefix_0= ruleUnitPrefix[$current] this_FunctionDefinition_1= ruleFunctionDefinition[$current] ) )
            // InternalAlf.g:415:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_FunctionDefinition_1= ruleFunctionDefinition[$current] )
            {
            // InternalAlf.g:415:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_FunctionDefinition_1= ruleFunctionDefinition[$current] )
            // InternalAlf.g:416:3: this_UnitPrefix_0= ruleUnitPrefix[$current] this_FunctionDefinition_1= ruleFunctionDefinition[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFunctionUnitDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getFunctionUnitDefinitionAccess().getUnitPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_UnitPrefix_0=ruleUnitPrefix(current);

            state._fsp--;


            			current = this_UnitPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFunctionUnitDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getFunctionUnitDefinitionAccess().getFunctionDefinitionParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_FunctionDefinition_1=ruleFunctionDefinition(current);

            state._fsp--;


            			current = this_FunctionDefinition_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionUnitDefinition"


    // $ANTLR start "entryRuleFeatureUnitDefinition"
    // InternalAlf.g:442:1: entryRuleFeatureUnitDefinition returns [EObject current=null] : iv_ruleFeatureUnitDefinition= ruleFeatureUnitDefinition EOF ;
    public final EObject entryRuleFeatureUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureUnitDefinition = null;


        try {
            // InternalAlf.g:442:62: (iv_ruleFeatureUnitDefinition= ruleFeatureUnitDefinition EOF )
            // InternalAlf.g:443:2: iv_ruleFeatureUnitDefinition= ruleFeatureUnitDefinition EOF
            {
             newCompositeNode(grammarAccess.getFeatureUnitDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureUnitDefinition=ruleFeatureUnitDefinition();

            state._fsp--;

             current =iv_ruleFeatureUnitDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureUnitDefinition"


    // $ANTLR start "ruleFeatureUnitDefinition"
    // InternalAlf.g:449:1: ruleFeatureUnitDefinition returns [EObject current=null] : (this_UnitPrefix_0= ruleUnitPrefix[$current] this_FeatureBodyDefinition_1= ruleFeatureBodyDefinition[$current] ) ;
    public final EObject ruleFeatureUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_UnitPrefix_0 = null;

        EObject this_FeatureBodyDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:455:2: ( (this_UnitPrefix_0= ruleUnitPrefix[$current] this_FeatureBodyDefinition_1= ruleFeatureBodyDefinition[$current] ) )
            // InternalAlf.g:456:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_FeatureBodyDefinition_1= ruleFeatureBodyDefinition[$current] )
            {
            // InternalAlf.g:456:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_FeatureBodyDefinition_1= ruleFeatureBodyDefinition[$current] )
            // InternalAlf.g:457:3: this_UnitPrefix_0= ruleUnitPrefix[$current] this_FeatureBodyDefinition_1= ruleFeatureBodyDefinition[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureUnitDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureUnitDefinitionAccess().getUnitPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_UnitPrefix_0=ruleUnitPrefix(current);

            state._fsp--;


            			current = this_UnitPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureUnitDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureUnitDefinitionAccess().getFeatureBodyDefinitionParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_FeatureBodyDefinition_1=ruleFeatureBodyDefinition(current);

            state._fsp--;


            			current = this_FeatureBodyDefinition_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureUnitDefinition"


    // $ANTLR start "ruleUnitPrefix"
    // InternalAlf.g:484:1: ruleUnitPrefix[EObject in_current] returns [EObject current=in_current] : ( ( ( (lv_ownedRelationship_0_0= rulePackageImport ) ) | ( (lv_ownedRelationship_1_0= ruleElementImport ) ) )* ( (lv_ownedRelationship_2_0= ruleAnnotation ) )* ) ;
    public final EObject ruleUnitPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_1_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:490:2: ( ( ( ( (lv_ownedRelationship_0_0= rulePackageImport ) ) | ( (lv_ownedRelationship_1_0= ruleElementImport ) ) )* ( (lv_ownedRelationship_2_0= ruleAnnotation ) )* ) )
            // InternalAlf.g:491:2: ( ( ( (lv_ownedRelationship_0_0= rulePackageImport ) ) | ( (lv_ownedRelationship_1_0= ruleElementImport ) ) )* ( (lv_ownedRelationship_2_0= ruleAnnotation ) )* )
            {
            // InternalAlf.g:491:2: ( ( ( (lv_ownedRelationship_0_0= rulePackageImport ) ) | ( (lv_ownedRelationship_1_0= ruleElementImport ) ) )* ( (lv_ownedRelationship_2_0= ruleAnnotation ) )* )
            // InternalAlf.g:492:3: ( ( (lv_ownedRelationship_0_0= rulePackageImport ) ) | ( (lv_ownedRelationship_1_0= ruleElementImport ) ) )* ( (lv_ownedRelationship_2_0= ruleAnnotation ) )*
            {
            // InternalAlf.g:492:3: ( ( (lv_ownedRelationship_0_0= rulePackageImport ) ) | ( (lv_ownedRelationship_1_0= ruleElementImport ) ) )*
            loop2:
            do {
                int alt2=3;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalAlf.g:493:4: ( (lv_ownedRelationship_0_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:493:4: ( (lv_ownedRelationship_0_0= rulePackageImport ) )
            	    // InternalAlf.g:494:5: (lv_ownedRelationship_0_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:494:5: (lv_ownedRelationship_0_0= rulePackageImport )
            	    // InternalAlf.g:495:6: lv_ownedRelationship_0_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getUnitPrefixAccess().getOwnedRelationshipPackageImportParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_ownedRelationship_0_0=rulePackageImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUnitPrefixRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedRelationship",
            	    							lv_ownedRelationship_0_0,
            	    							"org.omg.sysml.Alf.PackageImport");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:513:4: ( (lv_ownedRelationship_1_0= ruleElementImport ) )
            	    {
            	    // InternalAlf.g:513:4: ( (lv_ownedRelationship_1_0= ruleElementImport ) )
            	    // InternalAlf.g:514:5: (lv_ownedRelationship_1_0= ruleElementImport )
            	    {
            	    // InternalAlf.g:514:5: (lv_ownedRelationship_1_0= ruleElementImport )
            	    // InternalAlf.g:515:6: lv_ownedRelationship_1_0= ruleElementImport
            	    {

            	    						newCompositeNode(grammarAccess.getUnitPrefixAccess().getOwnedRelationshipElementImportParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_ownedRelationship_1_0=ruleElementImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUnitPrefixRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedRelationship",
            	    							lv_ownedRelationship_1_0,
            	    							"org.omg.sysml.Alf.ElementImport");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalAlf.g:533:3: ( (lv_ownedRelationship_2_0= ruleAnnotation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAlf.g:534:4: (lv_ownedRelationship_2_0= ruleAnnotation )
            	    {
            	    // InternalAlf.g:534:4: (lv_ownedRelationship_2_0= ruleAnnotation )
            	    // InternalAlf.g:535:5: lv_ownedRelationship_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getUnitPrefixAccess().getOwnedRelationshipAnnotationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_ownedRelationship_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUnitPrefixRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedRelationship",
            	    						lv_ownedRelationship_2_0,
            	    						"org.omg.sysml.Alf.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnitPrefix"


    // $ANTLR start "entryRuleAnnotation"
    // InternalAlf.g:556:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalAlf.g:556:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalAlf.g:557:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalAlf.g:563:1: ruleAnnotation returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleComment ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:569:2: ( ( (lv_ownedRelatedElement_0_0= ruleComment ) ) )
            // InternalAlf.g:570:2: ( (lv_ownedRelatedElement_0_0= ruleComment ) )
            {
            // InternalAlf.g:570:2: ( (lv_ownedRelatedElement_0_0= ruleComment ) )
            // InternalAlf.g:571:3: (lv_ownedRelatedElement_0_0= ruleComment )
            {
            // InternalAlf.g:571:3: (lv_ownedRelatedElement_0_0= ruleComment )
            // InternalAlf.g:572:4: lv_ownedRelatedElement_0_0= ruleComment
            {

            				newCompositeNode(grammarAccess.getAnnotationAccess().getOwnedRelatedElementCommentParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_0_0=ruleComment();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAnnotationRule());
            				}
            				add(
            					current,
            					"ownedRelatedElement",
            					lv_ownedRelatedElement_0_0,
            					"org.omg.sysml.Alf.Comment");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleComment"
    // InternalAlf.g:592:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalAlf.g:592:48: (iv_ruleComment= ruleComment EOF )
            // InternalAlf.g:593:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalAlf.g:599:1: ruleComment returns [EObject current=null] : ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_body_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:605:2: ( ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) ) )
            // InternalAlf.g:606:2: ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) )
            {
            // InternalAlf.g:606:2: ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) )
            // InternalAlf.g:607:3: (lv_body_0_0= RULE_DOCUMENTATION_COMMENT )
            {
            // InternalAlf.g:607:3: (lv_body_0_0= RULE_DOCUMENTATION_COMMENT )
            // InternalAlf.g:608:4: lv_body_0_0= RULE_DOCUMENTATION_COMMENT
            {
            lv_body_0_0=(Token)match(input,RULE_DOCUMENTATION_COMMENT,FOLLOW_2); 

            				newLeafNode(lv_body_0_0, grammarAccess.getCommentAccess().getBodyDOCUMENTATION_COMMENTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCommentRule());
            				}
            				setWithLastConsumed(
            					current,
            					"body",
            					lv_body_0_0,
            					"org.omg.sysml.Alf.DOCUMENTATION_COMMENT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRulePackageImport"
    // InternalAlf.g:627:1: entryRulePackageImport returns [EObject current=null] : iv_rulePackageImport= rulePackageImport EOF ;
    public final EObject entryRulePackageImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageImport = null;


        try {
            // InternalAlf.g:627:54: (iv_rulePackageImport= rulePackageImport EOF )
            // InternalAlf.g:628:2: iv_rulePackageImport= rulePackageImport EOF
            {
             newCompositeNode(grammarAccess.getPackageImportRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageImport=rulePackageImport();

            state._fsp--;

             current =iv_rulePackageImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageImport"


    // $ANTLR start "rulePackageImport"
    // InternalAlf.g:634:1: rulePackageImport returns [EObject current=null] : ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? otherlv_2= 'import' ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) ) otherlv_13= ';' ) ;
    public final EObject rulePackageImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_ownedRelationship_0_0 = null;

        Enumerator lv_visibility_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:640:2: ( ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? otherlv_2= 'import' ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) ) otherlv_13= ';' ) )
            // InternalAlf.g:641:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? otherlv_2= 'import' ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) ) otherlv_13= ';' )
            {
            // InternalAlf.g:641:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? otherlv_2= 'import' ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) ) otherlv_13= ';' )
            // InternalAlf.g:642:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? otherlv_2= 'import' ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) ) otherlv_13= ';'
            {
            // InternalAlf.g:642:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAlf.g:643:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    {
            	    // InternalAlf.g:643:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    // InternalAlf.g:644:5: lv_ownedRelationship_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getPackageImportAccess().getOwnedRelationshipAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_ownedRelationship_0_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageImportRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedRelationship",
            	    						lv_ownedRelationship_0_0,
            	    						"org.omg.sysml.Alf.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalAlf.g:661:3: ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=78 && LA5_0<=79)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAlf.g:662:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    {
                    // InternalAlf.g:662:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    // InternalAlf.g:663:5: lv_visibility_1_0= rulePackageElementVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getPackageImportAccess().getVisibilityPackageElementVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_visibility_1_0=rulePackageElementVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPackageImportRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_1_0,
                    						"org.omg.sysml.Alf.PackageElementVisibilityIndicator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageImportAccess().getImportKeyword_2());
            		
            // InternalAlf.g:684:3: ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==17) ) {
                    int LA7_3 = input.LA(3);

                    if ( ((LA7_3>=RULE_ID && LA7_3<=RULE_UNRESTRICTED_NAME)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_3==19) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==18) ) {
                    int LA7_4 = input.LA(3);

                    if ( ((LA7_4>=RULE_ID && LA7_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt7=3;
                    }
                    else if ( (LA7_4==19) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_UNRESTRICTED_NAME) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==17) ) {
                    int LA7_3 = input.LA(3);

                    if ( ((LA7_3>=RULE_ID && LA7_3<=RULE_UNRESTRICTED_NAME)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_3==19) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_2==18) ) {
                    int LA7_4 = input.LA(3);

                    if ( ((LA7_4>=RULE_ID && LA7_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt7=3;
                    }
                    else if ( (LA7_4==19) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlf.g:685:4: ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' )
                    {
                    // InternalAlf.g:685:4: ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' )
                    // InternalAlf.g:686:5: ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*'
                    {
                    // InternalAlf.g:686:5: ( ( ruleName ) )
                    // InternalAlf.g:687:6: ( ruleName )
                    {
                    // InternalAlf.g:687:6: ( ruleName )
                    // InternalAlf.g:688:7: ruleName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPackageImportRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_3_0_0_0());
                    						
                    pushFollow(FOLLOW_16);
                    ruleName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:702:5: (otherlv_4= '::' | otherlv_5= '.' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==17) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==18) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalAlf.g:703:6: otherlv_4= '::'
                            {
                            otherlv_4=(Token)match(input,17,FOLLOW_17); 

                            						newLeafNode(otherlv_4, grammarAccess.getPackageImportAccess().getColonColonKeyword_3_0_1_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:708:6: otherlv_5= '.'
                            {
                            otherlv_5=(Token)match(input,18,FOLLOW_17); 

                            						newLeafNode(otherlv_5, grammarAccess.getPackageImportAccess().getFullStopKeyword_3_0_1_1());
                            					

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_18); 

                    					newLeafNode(otherlv_6, grammarAccess.getPackageImportAccess().getAsteriskKeyword_3_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:719:4: ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' )
                    {
                    // InternalAlf.g:719:4: ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' )
                    // InternalAlf.g:720:5: ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*'
                    {
                    // InternalAlf.g:720:5: ( ( ruleColonQualifiedName ) )
                    // InternalAlf.g:721:6: ( ruleColonQualifiedName )
                    {
                    // InternalAlf.g:721:6: ( ruleColonQualifiedName )
                    // InternalAlf.g:722:7: ruleColonQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPackageImportRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_3_1_0_0());
                    						
                    pushFollow(FOLLOW_19);
                    ruleColonQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_17); 

                    					newLeafNode(otherlv_8, grammarAccess.getPackageImportAccess().getColonColonKeyword_3_1_1());
                    				
                    otherlv_9=(Token)match(input,19,FOLLOW_18); 

                    					newLeafNode(otherlv_9, grammarAccess.getPackageImportAccess().getAsteriskKeyword_3_1_2());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:746:4: ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' )
                    {
                    // InternalAlf.g:746:4: ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' )
                    // InternalAlf.g:747:5: ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*'
                    {
                    // InternalAlf.g:747:5: ( ( ruleDotQualifiedName ) )
                    // InternalAlf.g:748:6: ( ruleDotQualifiedName )
                    {
                    // InternalAlf.g:748:6: ( ruleDotQualifiedName )
                    // InternalAlf.g:749:7: ruleDotQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPackageImportRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_3_2_0_0());
                    						
                    pushFollow(FOLLOW_20);
                    ruleDotQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_17); 

                    					newLeafNode(otherlv_11, grammarAccess.getPackageImportAccess().getFullStopKeyword_3_2_1());
                    				
                    otherlv_12=(Token)match(input,19,FOLLOW_18); 

                    					newLeafNode(otherlv_12, grammarAccess.getPackageImportAccess().getAsteriskKeyword_3_2_2());
                    				

                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getPackageImportAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageImport"


    // $ANTLR start "entryRuleElementImport"
    // InternalAlf.g:781:1: entryRuleElementImport returns [EObject current=null] : iv_ruleElementImport= ruleElementImport EOF ;
    public final EObject entryRuleElementImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementImport = null;


        try {
            // InternalAlf.g:781:54: (iv_ruleElementImport= ruleElementImport EOF )
            // InternalAlf.g:782:2: iv_ruleElementImport= ruleElementImport EOF
            {
             newCompositeNode(grammarAccess.getElementImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementImport=ruleElementImport();

            state._fsp--;

             current =iv_ruleElementImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementImport"


    // $ANTLR start "ruleElementImport"
    // InternalAlf.g:788:1: ruleElementImport returns [EObject current=null] : (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleElementImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_PackageMemberPrefix_0 = null;

        AntlrDatatypeRuleToken lv_memberName_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:794:2: ( (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' ) )
            // InternalAlf.g:795:2: (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' )
            {
            // InternalAlf.g:795:2: (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' )
            // InternalAlf.g:796:3: this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';'
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getElementImportRule());
            			}
            			newCompositeNode(grammarAccess.getElementImportAccess().getPackageMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_PackageMemberPrefix_0=rulePackageMemberPrefix(current);

            state._fsp--;


            			current = this_PackageMemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getElementImportAccess().getImportKeyword_1());
            		
            // InternalAlf.g:811:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:812:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:812:4: ( ruleQualifiedName )
            // InternalAlf.g:813:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementImportRule());
            					}
            				

            					newCompositeNode(grammarAccess.getElementImportAccess().getMemberElementElementCrossReference_2_0());
            				
            pushFollow(FOLLOW_21);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:827:3: (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAlf.g:828:4: otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getElementImportAccess().getAsKeyword_3_0());
                    			
                    // InternalAlf.g:832:4: ( (lv_memberName_4_0= ruleName ) )
                    // InternalAlf.g:833:5: (lv_memberName_4_0= ruleName )
                    {
                    // InternalAlf.g:833:5: (lv_memberName_4_0= ruleName )
                    // InternalAlf.g:834:6: lv_memberName_4_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getElementImportAccess().getMemberNameNameParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_memberName_4_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementImportRule());
                    						}
                    						set(
                    							current,
                    							"memberName",
                    							lv_memberName_4_0,
                    							"org.omg.sysml.Alf.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getElementImportAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementImport"


    // $ANTLR start "entryRuleNonFeatureDefinition"
    // InternalAlf.g:860:1: entryRuleNonFeatureDefinition returns [EObject current=null] : iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF ;
    public final EObject entryRuleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureDefinition = null;


        try {
            // InternalAlf.g:860:61: (iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF )
            // InternalAlf.g:861:2: iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF
            {
             newCompositeNode(grammarAccess.getNonFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonFeatureDefinition=ruleNonFeatureDefinition();

            state._fsp--;

             current =iv_ruleNonFeatureDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonFeatureDefinition"


    // $ANTLR start "ruleNonFeatureDefinition"
    // InternalAlf.g:867:1: ruleNonFeatureDefinition returns [EObject current=null] : (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_ObjectClassDefinitionOrStub_2= ruleObjectClassDefinitionOrStub | this_ValueClassDefinitionOrStub_3= ruleValueClassDefinitionOrStub | this_AssociationDefinitionOrStub_4= ruleAssociationDefinitionOrStub | this_BehaviorDefinitionOrStub_5= ruleBehaviorDefinitionOrStub | this_FunctionDefinitionOrStub_6= ruleFunctionDefinitionOrStub ) ;
    public final EObject ruleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinitionOrStub_0 = null;

        EObject this_ClassDefinitionOrStub_1 = null;

        EObject this_ObjectClassDefinitionOrStub_2 = null;

        EObject this_ValueClassDefinitionOrStub_3 = null;

        EObject this_AssociationDefinitionOrStub_4 = null;

        EObject this_BehaviorDefinitionOrStub_5 = null;

        EObject this_FunctionDefinitionOrStub_6 = null;



        	enterRule();

        try {
            // InternalAlf.g:873:2: ( (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_ObjectClassDefinitionOrStub_2= ruleObjectClassDefinitionOrStub | this_ValueClassDefinitionOrStub_3= ruleValueClassDefinitionOrStub | this_AssociationDefinitionOrStub_4= ruleAssociationDefinitionOrStub | this_BehaviorDefinitionOrStub_5= ruleBehaviorDefinitionOrStub | this_FunctionDefinitionOrStub_6= ruleFunctionDefinitionOrStub ) )
            // InternalAlf.g:874:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_ObjectClassDefinitionOrStub_2= ruleObjectClassDefinitionOrStub | this_ValueClassDefinitionOrStub_3= ruleValueClassDefinitionOrStub | this_AssociationDefinitionOrStub_4= ruleAssociationDefinitionOrStub | this_BehaviorDefinitionOrStub_5= ruleBehaviorDefinitionOrStub | this_FunctionDefinitionOrStub_6= ruleFunctionDefinitionOrStub )
            {
            // InternalAlf.g:874:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_ObjectClassDefinitionOrStub_2= ruleObjectClassDefinitionOrStub | this_ValueClassDefinitionOrStub_3= ruleValueClassDefinitionOrStub | this_AssociationDefinitionOrStub_4= ruleAssociationDefinitionOrStub | this_BehaviorDefinitionOrStub_5= ruleBehaviorDefinitionOrStub | this_FunctionDefinitionOrStub_6= ruleFunctionDefinitionOrStub )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 33:
                {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt9=2;
                    }
                    break;
                case 31:
                    {
                    alt9=7;
                    }
                    break;
                case 29:
                    {
                    alt9=5;
                    }
                    break;
                case 28:
                    {
                    alt9=4;
                    }
                    break;
                case 27:
                    {
                    alt9=3;
                    }
                    break;
                case 30:
                    {
                    alt9=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }

                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            case 28:
                {
                alt9=4;
                }
                break;
            case 29:
                {
                alt9=5;
                }
                break;
            case 30:
                {
                alt9=6;
                }
                break;
            case 31:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAlf.g:875:3: this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureDefinitionAccess().getPackageDefinitionOrStubParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackageDefinitionOrStub_0=rulePackageDefinitionOrStub();

                    state._fsp--;


                    			current = this_PackageDefinitionOrStub_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:884:3: this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureDefinitionAccess().getClassDefinitionOrStubParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassDefinitionOrStub_1=ruleClassDefinitionOrStub();

                    state._fsp--;


                    			current = this_ClassDefinitionOrStub_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:893:3: this_ObjectClassDefinitionOrStub_2= ruleObjectClassDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureDefinitionAccess().getObjectClassDefinitionOrStubParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectClassDefinitionOrStub_2=ruleObjectClassDefinitionOrStub();

                    state._fsp--;


                    			current = this_ObjectClassDefinitionOrStub_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:902:3: this_ValueClassDefinitionOrStub_3= ruleValueClassDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureDefinitionAccess().getValueClassDefinitionOrStubParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueClassDefinitionOrStub_3=ruleValueClassDefinitionOrStub();

                    state._fsp--;


                    			current = this_ValueClassDefinitionOrStub_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:911:3: this_AssociationDefinitionOrStub_4= ruleAssociationDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureDefinitionAccess().getAssociationDefinitionOrStubParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssociationDefinitionOrStub_4=ruleAssociationDefinitionOrStub();

                    state._fsp--;


                    			current = this_AssociationDefinitionOrStub_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAlf.g:920:3: this_BehaviorDefinitionOrStub_5= ruleBehaviorDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureDefinitionAccess().getBehaviorDefinitionOrStubParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_BehaviorDefinitionOrStub_5=ruleBehaviorDefinitionOrStub();

                    state._fsp--;


                    			current = this_BehaviorDefinitionOrStub_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAlf.g:929:3: this_FunctionDefinitionOrStub_6= ruleFunctionDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureDefinitionAccess().getFunctionDefinitionOrStubParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionDefinitionOrStub_6=ruleFunctionDefinitionOrStub();

                    state._fsp--;


                    			current = this_FunctionDefinitionOrStub_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonFeatureDefinition"


    // $ANTLR start "entryRulePackageDefinitionOrStub"
    // InternalAlf.g:941:1: entryRulePackageDefinitionOrStub returns [EObject current=null] : iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF ;
    public final EObject entryRulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDefinitionOrStub = null;


        try {
            // InternalAlf.g:941:64: (iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF )
            // InternalAlf.g:942:2: iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF
            {
             newCompositeNode(grammarAccess.getPackageDefinitionOrStubRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDefinitionOrStub=rulePackageDefinitionOrStub();

            state._fsp--;

             current =iv_rulePackageDefinitionOrStub; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDefinitionOrStub"


    // $ANTLR start "rulePackageDefinitionOrStub"
    // InternalAlf.g:948:1: rulePackageDefinitionOrStub returns [EObject current=null] : this_PackageDefinition_0= rulePackageDefinition[$current] ;
    public final EObject rulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:954:2: (this_PackageDefinition_0= rulePackageDefinition[$current] )
            // InternalAlf.g:955:2: this_PackageDefinition_0= rulePackageDefinition[$current]
            {

            		if (current==null) {
            			current = createModelElement(grammarAccess.getPackageDefinitionOrStubRule());
            		}
            		newCompositeNode(grammarAccess.getPackageDefinitionOrStubAccess().getPackageDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PackageDefinition_0=rulePackageDefinition(current);

            state._fsp--;


            		current = this_PackageDefinition_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDefinitionOrStub"


    // $ANTLR start "rulePackageDefinition"
    // InternalAlf.g:970:1: rulePackageDefinition[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedRelationship_3_0= rulePackageMember ) ) | ( (lv_ownedRelationship_4_0= rulePackageImport ) ) )* otherlv_5= '}' ) ;
    public final EObject rulePackageDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRelationship_3_0 = null;

        EObject lv_ownedRelationship_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:976:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedRelationship_3_0= rulePackageMember ) ) | ( (lv_ownedRelationship_4_0= rulePackageImport ) ) )* otherlv_5= '}' ) )
            // InternalAlf.g:977:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedRelationship_3_0= rulePackageMember ) ) | ( (lv_ownedRelationship_4_0= rulePackageImport ) ) )* otherlv_5= '}' )
            {
            // InternalAlf.g:977:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedRelationship_3_0= rulePackageMember ) ) | ( (lv_ownedRelationship_4_0= rulePackageImport ) ) )* otherlv_5= '}' )
            // InternalAlf.g:978:3: otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedRelationship_3_0= rulePackageMember ) ) | ( (lv_ownedRelationship_4_0= rulePackageImport ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0());
            		
            // InternalAlf.g:982:3: ( (lv_name_1_0= ruleName ) )
            // InternalAlf.g:983:4: (lv_name_1_0= ruleName )
            {
            // InternalAlf.g:983:4: (lv_name_1_0= ruleName )
            // InternalAlf.g:984:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlf.g:1005:3: ( ( (lv_ownedRelationship_3_0= rulePackageMember ) ) | ( (lv_ownedRelationship_4_0= rulePackageImport ) ) )*
            loop10:
            do {
                int alt10=3;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalAlf.g:1006:4: ( (lv_ownedRelationship_3_0= rulePackageMember ) )
            	    {
            	    // InternalAlf.g:1006:4: ( (lv_ownedRelationship_3_0= rulePackageMember ) )
            	    // InternalAlf.g:1007:5: (lv_ownedRelationship_3_0= rulePackageMember )
            	    {
            	    // InternalAlf.g:1007:5: (lv_ownedRelationship_3_0= rulePackageMember )
            	    // InternalAlf.g:1008:6: lv_ownedRelationship_3_0= rulePackageMember
            	    {

            	    						newCompositeNode(grammarAccess.getPackageDefinitionAccess().getOwnedRelationshipPackageMemberParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_ownedRelationship_3_0=rulePackageMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedRelationship",
            	    							lv_ownedRelationship_3_0,
            	    							"org.omg.sysml.Alf.PackageMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:1026:4: ( (lv_ownedRelationship_4_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:1026:4: ( (lv_ownedRelationship_4_0= rulePackageImport ) )
            	    // InternalAlf.g:1027:5: (lv_ownedRelationship_4_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:1027:5: (lv_ownedRelationship_4_0= rulePackageImport )
            	    // InternalAlf.g:1028:6: lv_ownedRelationship_4_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getPackageDefinitionAccess().getOwnedRelationshipPackageImportParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_ownedRelationship_4_0=rulePackageImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedRelationship",
            	    							lv_ownedRelationship_4_0,
            	    							"org.omg.sysml.Alf.PackageImport");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDefinition"


    // $ANTLR start "entryRulePackageMember"
    // InternalAlf.g:1054:1: entryRulePackageMember returns [EObject current=null] : iv_rulePackageMember= rulePackageMember EOF ;
    public final EObject entryRulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageMember = null;


        try {
            // InternalAlf.g:1054:54: (iv_rulePackageMember= rulePackageMember EOF )
            // InternalAlf.g:1055:2: iv_rulePackageMember= rulePackageMember EOF
            {
             newCompositeNode(grammarAccess.getPackageMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageMember=rulePackageMember();

            state._fsp--;

             current =iv_rulePackageMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageMember"


    // $ANTLR start "rulePackageMember"
    // InternalAlf.g:1061:1: rulePackageMember returns [EObject current=null] : (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] ) ) ;
    public final EObject rulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject this_PackageMemberPrefix_0 = null;

        EObject this_NonFeatureMemberElement_1 = null;

        EObject this_FeaturePackageMemberElement_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:1067:2: ( (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] ) ) )
            // InternalAlf.g:1068:2: (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] ) )
            {
            // InternalAlf.g:1068:2: (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] ) )
            // InternalAlf.g:1069:3: this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getPackageMemberRule());
            			}
            			newCompositeNode(grammarAccess.getPackageMemberAccess().getPackageMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_PackageMemberPrefix_0=rulePackageMemberPrefix(current);

            state._fsp--;


            			current = this_PackageMemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:1080:3: (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] )
            int alt11=2;
            switch ( input.LA(1) ) {
            case 16:
            case 22:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                {
                alt11=1;
                }
                break;
            case 33:
                {
                int LA11_2 = input.LA(2);

                if ( ((LA11_2>=26 && LA11_2<=31)) ) {
                    alt11=1;
                }
                else if ( ((LA11_2>=RULE_ID && LA11_2<=RULE_UNRESTRICTED_NAME)||LA11_2==32) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 32:
                {
                alt11=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAlf.g:1081:4: this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getPackageMemberRule());
                    				}
                    				newCompositeNode(grammarAccess.getPackageMemberAccess().getNonFeatureMemberElementParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_NonFeatureMemberElement_1=ruleNonFeatureMemberElement(current);

                    state._fsp--;


                    				current = this_NonFeatureMemberElement_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalAlf.g:1093:4: this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getPackageMemberRule());
                    				}
                    				newCompositeNode(grammarAccess.getPackageMemberAccess().getFeaturePackageMemberElementParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_FeaturePackageMemberElement_2=ruleFeaturePackageMemberElement(current);

                    state._fsp--;


                    				current = this_FeaturePackageMemberElement_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageMember"


    // $ANTLR start "rulePackageMemberPrefix"
    // InternalAlf.g:1110:1: rulePackageMemberPrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? ) ;
    public final EObject rulePackageMemberPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedRelationship_0_0 = null;

        Enumerator lv_visibility_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1116:2: ( ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? ) )
            // InternalAlf.g:1117:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? )
            {
            // InternalAlf.g:1117:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? )
            // InternalAlf.g:1118:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )?
            {
            // InternalAlf.g:1118:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAlf.g:1119:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    {
            	    // InternalAlf.g:1119:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    // InternalAlf.g:1120:5: lv_ownedRelationship_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getPackageMemberPrefixAccess().getOwnedRelationshipAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_ownedRelationship_0_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageMemberPrefixRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedRelationship",
            	    						lv_ownedRelationship_0_0,
            	    						"org.omg.sysml.Alf.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalAlf.g:1137:3: ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=78 && LA13_0<=79)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlf.g:1138:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    {
                    // InternalAlf.g:1138:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    // InternalAlf.g:1139:5: lv_visibility_1_0= rulePackageElementVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getPackageMemberPrefixAccess().getVisibilityPackageElementVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_visibility_1_0=rulePackageElementVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPackageMemberPrefixRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_1_0,
                    						"org.omg.sysml.Alf.PackageElementVisibilityIndicator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageMemberPrefix"


    // $ANTLR start "ruleNonFeatureMemberElement"
    // InternalAlf.g:1161:1: ruleNonFeatureMemberElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelatedElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) | (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' ) | (otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';' ) | (otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';' ) | (otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';' ) ) ;
    public final EObject ruleNonFeatureMemberElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        EObject lv_ownedRelatedElement_0_0 = null;

        AntlrDatatypeRuleToken lv_memberName_2_0 = null;

        AntlrDatatypeRuleToken lv_memberName_7_0 = null;

        AntlrDatatypeRuleToken lv_memberName_12_0 = null;

        AntlrDatatypeRuleToken lv_memberName_17_0 = null;

        AntlrDatatypeRuleToken lv_memberName_22_0 = null;

        AntlrDatatypeRuleToken lv_memberName_27_0 = null;

        AntlrDatatypeRuleToken lv_memberName_32_0 = null;

        AntlrDatatypeRuleToken lv_memberName_39_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1167:2: ( ( ( (lv_ownedRelatedElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) | (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' ) | (otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';' ) | (otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';' ) | (otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';' ) ) )
            // InternalAlf.g:1168:2: ( ( (lv_ownedRelatedElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) | (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' ) | (otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';' ) | (otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';' ) | (otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';' ) )
            {
            // InternalAlf.g:1168:2: ( ( (lv_ownedRelatedElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) | (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' ) | (otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';' ) | (otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';' ) | (otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';' ) )
            int alt22=9;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalAlf.g:1169:3: ( (lv_ownedRelatedElement_0_0= ruleNonFeatureDefinition ) )
                    {
                    // InternalAlf.g:1169:3: ( (lv_ownedRelatedElement_0_0= ruleNonFeatureDefinition ) )
                    // InternalAlf.g:1170:4: (lv_ownedRelatedElement_0_0= ruleNonFeatureDefinition )
                    {
                    // InternalAlf.g:1170:4: (lv_ownedRelatedElement_0_0= ruleNonFeatureDefinition )
                    // InternalAlf.g:1171:5: lv_ownedRelatedElement_0_0= ruleNonFeatureDefinition
                    {

                    					newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getOwnedRelatedElementNonFeatureDefinitionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ownedRelatedElement_0_0=ruleNonFeatureDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNonFeatureMemberElementRule());
                    					}
                    					add(
                    						current,
                    						"ownedRelatedElement",
                    						lv_ownedRelatedElement_0_0,
                    						"org.omg.sysml.Alf.NonFeatureDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1189:3: (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
                    {
                    // InternalAlf.g:1189:3: (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
                    // InternalAlf.g:1190:4: otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getNonFeatureMemberElementAccess().getPackageKeyword_1_0());
                    			
                    // InternalAlf.g:1194:4: ( (lv_memberName_2_0= ruleName ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalAlf.g:1195:5: (lv_memberName_2_0= ruleName )
                            {
                            // InternalAlf.g:1195:5: (lv_memberName_2_0= ruleName )
                            // InternalAlf.g:1196:6: lv_memberName_2_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_27);
                            lv_memberName_2_0=ruleName();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getNonFeatureMemberElementRule());
                            						}
                            						set(
                            							current,
                            							"memberName",
                            							lv_memberName_2_0,
                            							"org.omg.sysml.Alf.Name");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getNonFeatureMemberElementAccess().getIsKeyword_1_2());
                    			
                    // InternalAlf.g:1217:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1218:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1218:5: ( ruleQualifiedName )
                    // InternalAlf.g:1219:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementPackageCrossReference_1_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getNonFeatureMemberElementAccess().getSemicolonKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1239:3: (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    {
                    // InternalAlf.g:1239:3: (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    // InternalAlf.g:1240:4: otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26); 

                    				newLeafNode(otherlv_6, grammarAccess.getNonFeatureMemberElementAccess().getClassKeyword_2_0());
                    			
                    // InternalAlf.g:1244:4: ( (lv_memberName_7_0= ruleName ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalAlf.g:1245:5: (lv_memberName_7_0= ruleName )
                            {
                            // InternalAlf.g:1245:5: (lv_memberName_7_0= ruleName )
                            // InternalAlf.g:1246:6: lv_memberName_7_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_2_1_0());
                            					
                            pushFollow(FOLLOW_27);
                            lv_memberName_7_0=ruleName();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getNonFeatureMemberElementRule());
                            						}
                            						set(
                            							current,
                            							"memberName",
                            							lv_memberName_7_0,
                            							"org.omg.sysml.Alf.Name");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getNonFeatureMemberElementAccess().getIsKeyword_2_2());
                    			
                    // InternalAlf.g:1267:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1268:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1268:5: ( ruleQualifiedName )
                    // InternalAlf.g:1269:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementClassCrossReference_2_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getNonFeatureMemberElementAccess().getSemicolonKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1289:3: (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' )
                    {
                    // InternalAlf.g:1289:3: (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' )
                    // InternalAlf.g:1290:4: otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';'
                    {
                    otherlv_11=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_11, grammarAccess.getNonFeatureMemberElementAccess().getClassKeyword_3_0());
                    			
                    // InternalAlf.g:1294:4: ( (lv_memberName_12_0= ruleName ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalAlf.g:1295:5: (lv_memberName_12_0= ruleName )
                            {
                            // InternalAlf.g:1295:5: (lv_memberName_12_0= ruleName )
                            // InternalAlf.g:1296:6: lv_memberName_12_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_3_1_0());
                            					
                            pushFollow(FOLLOW_27);
                            lv_memberName_12_0=ruleName();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getNonFeatureMemberElementRule());
                            						}
                            						set(
                            							current,
                            							"memberName",
                            							lv_memberName_12_0,
                            							"org.omg.sysml.Alf.Name");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_13, grammarAccess.getNonFeatureMemberElementAccess().getIsKeyword_3_2());
                    			
                    // InternalAlf.g:1317:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1318:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1318:5: ( ruleQualifiedName )
                    // InternalAlf.g:1319:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementObjectClassCrossReference_3_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getNonFeatureMemberElementAccess().getSemicolonKeyword_3_4());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAlf.g:1339:3: (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' )
                    {
                    // InternalAlf.g:1339:3: (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' )
                    // InternalAlf.g:1340:4: otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';'
                    {
                    otherlv_16=(Token)match(input,28,FOLLOW_26); 

                    				newLeafNode(otherlv_16, grammarAccess.getNonFeatureMemberElementAccess().getDatatypeKeyword_4_0());
                    			
                    // InternalAlf.g:1344:4: ( (lv_memberName_17_0= ruleName ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalAlf.g:1345:5: (lv_memberName_17_0= ruleName )
                            {
                            // InternalAlf.g:1345:5: (lv_memberName_17_0= ruleName )
                            // InternalAlf.g:1346:6: lv_memberName_17_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_4_1_0());
                            					
                            pushFollow(FOLLOW_27);
                            lv_memberName_17_0=ruleName();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getNonFeatureMemberElementRule());
                            						}
                            						set(
                            							current,
                            							"memberName",
                            							lv_memberName_17_0,
                            							"org.omg.sysml.Alf.Name");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_18=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_18, grammarAccess.getNonFeatureMemberElementAccess().getIsKeyword_4_2());
                    			
                    // InternalAlf.g:1367:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1368:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1368:5: ( ruleQualifiedName )
                    // InternalAlf.g:1369:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementValueClassCrossReference_4_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_20=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_20, grammarAccess.getNonFeatureMemberElementAccess().getSemicolonKeyword_4_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAlf.g:1389:3: (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' )
                    {
                    // InternalAlf.g:1389:3: (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' )
                    // InternalAlf.g:1390:4: otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';'
                    {
                    otherlv_21=(Token)match(input,29,FOLLOW_26); 

                    				newLeafNode(otherlv_21, grammarAccess.getNonFeatureMemberElementAccess().getAssocKeyword_5_0());
                    			
                    // InternalAlf.g:1394:4: ( (lv_memberName_22_0= ruleName ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalAlf.g:1395:5: (lv_memberName_22_0= ruleName )
                            {
                            // InternalAlf.g:1395:5: (lv_memberName_22_0= ruleName )
                            // InternalAlf.g:1396:6: lv_memberName_22_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_5_1_0());
                            					
                            pushFollow(FOLLOW_27);
                            lv_memberName_22_0=ruleName();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getNonFeatureMemberElementRule());
                            						}
                            						set(
                            							current,
                            							"memberName",
                            							lv_memberName_22_0,
                            							"org.omg.sysml.Alf.Name");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_23, grammarAccess.getNonFeatureMemberElementAccess().getIsKeyword_5_2());
                    			
                    // InternalAlf.g:1417:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1418:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1418:5: ( ruleQualifiedName )
                    // InternalAlf.g:1419:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementAssociationCrossReference_5_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_25, grammarAccess.getNonFeatureMemberElementAccess().getSemicolonKeyword_5_4());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAlf.g:1439:3: (otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';' )
                    {
                    // InternalAlf.g:1439:3: (otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';' )
                    // InternalAlf.g:1440:4: otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';'
                    {
                    otherlv_26=(Token)match(input,30,FOLLOW_26); 

                    				newLeafNode(otherlv_26, grammarAccess.getNonFeatureMemberElementAccess().getBehaviorKeyword_6_0());
                    			
                    // InternalAlf.g:1444:4: ( (lv_memberName_27_0= ruleName ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalAlf.g:1445:5: (lv_memberName_27_0= ruleName )
                            {
                            // InternalAlf.g:1445:5: (lv_memberName_27_0= ruleName )
                            // InternalAlf.g:1446:6: lv_memberName_27_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_6_1_0());
                            					
                            pushFollow(FOLLOW_27);
                            lv_memberName_27_0=ruleName();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getNonFeatureMemberElementRule());
                            						}
                            						set(
                            							current,
                            							"memberName",
                            							lv_memberName_27_0,
                            							"org.omg.sysml.Alf.Name");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_28=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_28, grammarAccess.getNonFeatureMemberElementAccess().getIsKeyword_6_2());
                    			
                    // InternalAlf.g:1467:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1468:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1468:5: ( ruleQualifiedName )
                    // InternalAlf.g:1469:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementBehaviorCrossReference_6_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_30=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_30, grammarAccess.getNonFeatureMemberElementAccess().getSemicolonKeyword_6_4());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalAlf.g:1489:3: (otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';' )
                    {
                    // InternalAlf.g:1489:3: (otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';' )
                    // InternalAlf.g:1490:4: otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';'
                    {
                    otherlv_31=(Token)match(input,31,FOLLOW_26); 

                    				newLeafNode(otherlv_31, grammarAccess.getNonFeatureMemberElementAccess().getFunctionKeyword_7_0());
                    			
                    // InternalAlf.g:1494:4: ( (lv_memberName_32_0= ruleName ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalAlf.g:1495:5: (lv_memberName_32_0= ruleName )
                            {
                            // InternalAlf.g:1495:5: (lv_memberName_32_0= ruleName )
                            // InternalAlf.g:1496:6: lv_memberName_32_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_7_1_0());
                            					
                            pushFollow(FOLLOW_27);
                            lv_memberName_32_0=ruleName();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getNonFeatureMemberElementRule());
                            						}
                            						set(
                            							current,
                            							"memberName",
                            							lv_memberName_32_0,
                            							"org.omg.sysml.Alf.Name");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_33=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_33, grammarAccess.getNonFeatureMemberElementAccess().getIsKeyword_7_2());
                    			
                    // InternalAlf.g:1517:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1518:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1518:5: ( ruleQualifiedName )
                    // InternalAlf.g:1519:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementFunctionCrossReference_7_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_35=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_35, grammarAccess.getNonFeatureMemberElementAccess().getSemicolonKeyword_7_4());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalAlf.g:1539:3: (otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';' )
                    {
                    // InternalAlf.g:1539:3: (otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';' )
                    // InternalAlf.g:1540:4: otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';'
                    {
                    otherlv_36=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_36, grammarAccess.getNonFeatureMemberElementAccess().getImportKeyword_8_0());
                    			
                    // InternalAlf.g:1544:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1545:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1545:5: ( ruleQualifiedName )
                    // InternalAlf.g:1546:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementElementCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:1560:4: (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==21) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalAlf.g:1561:5: otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) )
                            {
                            otherlv_38=(Token)match(input,21,FOLLOW_15); 

                            					newLeafNode(otherlv_38, grammarAccess.getNonFeatureMemberElementAccess().getAsKeyword_8_2_0());
                            				
                            // InternalAlf.g:1565:5: ( (lv_memberName_39_0= ruleName ) )
                            // InternalAlf.g:1566:6: (lv_memberName_39_0= ruleName )
                            {
                            // InternalAlf.g:1566:6: (lv_memberName_39_0= ruleName )
                            // InternalAlf.g:1567:7: lv_memberName_39_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_8_2_1_0());
                            						
                            pushFollow(FOLLOW_18);
                            lv_memberName_39_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNonFeatureMemberElementRule());
                            							}
                            							set(
                            								current,
                            								"memberName",
                            								lv_memberName_39_0,
                            								"org.omg.sysml.Alf.Name");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_40=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_40, grammarAccess.getNonFeatureMemberElementAccess().getSemicolonKeyword_8_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonFeatureMemberElement"


    // $ANTLR start "ruleFeaturePackageMemberElement"
    // InternalAlf.g:1595:1: ruleFeaturePackageMemberElement[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= 'feature' )? ( (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'abstract' (otherlv_3= 'feature' )? ( (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition ) ) ) | (otherlv_5= 'feature' ( (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_7= 'abstract' otherlv_8= 'feature' ( (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? ) | ( (lv_memberName_12_0= ruleName ) ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) ) ;
    public final EObject ruleFeaturePackageMemberElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_ownedRelatedElement_1_0 = null;

        EObject lv_ownedRelatedElement_4_0 = null;

        EObject lv_ownedRelatedElement_6_0 = null;

        EObject lv_ownedRelatedElement_9_0 = null;

        AntlrDatatypeRuleToken lv_memberName_11_0 = null;

        AntlrDatatypeRuleToken lv_memberName_12_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1601:2: ( ( ( (otherlv_0= 'feature' )? ( (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'abstract' (otherlv_3= 'feature' )? ( (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition ) ) ) | (otherlv_5= 'feature' ( (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_7= 'abstract' otherlv_8= 'feature' ( (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? ) | ( (lv_memberName_12_0= ruleName ) ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) ) )
            // InternalAlf.g:1602:2: ( ( (otherlv_0= 'feature' )? ( (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'abstract' (otherlv_3= 'feature' )? ( (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition ) ) ) | (otherlv_5= 'feature' ( (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_7= 'abstract' otherlv_8= 'feature' ( (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? ) | ( (lv_memberName_12_0= ruleName ) ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) )
            {
            // InternalAlf.g:1602:2: ( ( (otherlv_0= 'feature' )? ( (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'abstract' (otherlv_3= 'feature' )? ( (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition ) ) ) | (otherlv_5= 'feature' ( (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_7= 'abstract' otherlv_8= 'feature' ( (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? ) | ( (lv_memberName_12_0= ruleName ) ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) )
            int alt27=5;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalAlf.g:1603:3: ( (otherlv_0= 'feature' )? ( (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1603:3: ( (otherlv_0= 'feature' )? ( (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1604:4: (otherlv_0= 'feature' )? ( (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1604:4: (otherlv_0= 'feature' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==32) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalAlf.g:1605:5: otherlv_0= 'feature'
                            {
                            otherlv_0=(Token)match(input,32,FOLLOW_28); 

                            					newLeafNode(otherlv_0, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_0_0());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1610:4: ( (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1611:5: (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1611:5: (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1612:6: lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition
                    {

                    						newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getOwnedRelatedElementNamedFeatureDefinitionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedRelatedElement_1_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeaturePackageMemberElementRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelatedElement",
                    							lv_ownedRelatedElement_1_0,
                    							"org.omg.sysml.Alf.NamedFeatureDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1631:3: (otherlv_2= 'abstract' (otherlv_3= 'feature' )? ( (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1631:3: (otherlv_2= 'abstract' (otherlv_3= 'feature' )? ( (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1632:4: otherlv_2= 'abstract' (otherlv_3= 'feature' )? ( (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getFeaturePackageMemberElementAccess().getAbstractKeyword_1_0());
                    			
                    // InternalAlf.g:1636:4: (otherlv_3= 'feature' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==32) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalAlf.g:1637:5: otherlv_3= 'feature'
                            {
                            otherlv_3=(Token)match(input,32,FOLLOW_28); 

                            					newLeafNode(otherlv_3, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_1_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1642:4: ( (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition ) )
                    // InternalAlf.g:1643:5: (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1643:5: (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition )
                    // InternalAlf.g:1644:6: lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition
                    {

                    						newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getOwnedRelatedElementAbstractNamedFeatureDefinitionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedRelatedElement_4_0=ruleAbstractNamedFeatureDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeaturePackageMemberElementRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelatedElement",
                    							lv_ownedRelatedElement_4_0,
                    							"org.omg.sysml.Alf.AbstractNamedFeatureDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1663:3: (otherlv_5= 'feature' ( (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1663:3: (otherlv_5= 'feature' ( (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:1664:4: otherlv_5= 'feature' ( (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_29); 

                    				newLeafNode(otherlv_5, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_2_0());
                    			
                    // InternalAlf.g:1668:4: ( (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:1669:5: (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:1669:5: (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:1670:6: lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition
                    {

                    						newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getOwnedRelatedElementUnnamedFeatureDefinitionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedRelatedElement_6_0=ruleUnnamedFeatureDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeaturePackageMemberElementRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelatedElement",
                    							lv_ownedRelatedElement_6_0,
                    							"org.omg.sysml.Alf.UnnamedFeatureDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1689:3: (otherlv_7= 'abstract' otherlv_8= 'feature' ( (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1689:3: (otherlv_7= 'abstract' otherlv_8= 'feature' ( (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:1690:4: otherlv_7= 'abstract' otherlv_8= 'feature' ( (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_30); 

                    				newLeafNode(otherlv_7, grammarAccess.getFeaturePackageMemberElementAccess().getAbstractKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,32,FOLLOW_29); 

                    				newLeafNode(otherlv_8, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_3_1());
                    			
                    // InternalAlf.g:1698:4: ( (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition ) )
                    // InternalAlf.g:1699:5: (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:1699:5: (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition )
                    // InternalAlf.g:1700:6: lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition
                    {

                    						newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getOwnedRelatedElementAbstractUnnamedFeatureDefinitionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedRelatedElement_9_0=ruleAbstractUnnamedFeatureDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeaturePackageMemberElementRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelatedElement",
                    							lv_ownedRelatedElement_9_0,
                    							"org.omg.sysml.Alf.AbstractUnnamedFeatureDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAlf.g:1719:3: ( ( (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? ) | ( (lv_memberName_12_0= ruleName ) ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' )
                    {
                    // InternalAlf.g:1719:3: ( ( (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? ) | ( (lv_memberName_12_0= ruleName ) ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' )
                    // InternalAlf.g:1720:4: ( (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? ) | ( (lv_memberName_12_0= ruleName ) ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';'
                    {
                    // InternalAlf.g:1720:4: ( (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? ) | ( (lv_memberName_12_0= ruleName ) ) )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==32) ) {
                        alt26=1;
                    }
                    else if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalAlf.g:1721:5: (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? )
                            {
                            // InternalAlf.g:1721:5: (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? )
                            // InternalAlf.g:1722:6: otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )?
                            {
                            otherlv_10=(Token)match(input,32,FOLLOW_26); 

                            						newLeafNode(otherlv_10, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_4_0_0_0());
                            					
                            // InternalAlf.g:1726:6: ( (lv_memberName_11_0= ruleName ) )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // InternalAlf.g:1727:7: (lv_memberName_11_0= ruleName )
                                    {
                                    // InternalAlf.g:1727:7: (lv_memberName_11_0= ruleName )
                                    // InternalAlf.g:1728:8: lv_memberName_11_0= ruleName
                                    {

                                    								newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getMemberNameNameParserRuleCall_4_0_0_1_0());
                                    							
                                    pushFollow(FOLLOW_27);
                                    lv_memberName_11_0=ruleName();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getFeaturePackageMemberElementRule());
                                    								}
                                    								set(
                                    									current,
                                    									"memberName",
                                    									lv_memberName_11_0,
                                    									"org.omg.sysml.Alf.Name");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1747:5: ( (lv_memberName_12_0= ruleName ) )
                            {
                            // InternalAlf.g:1747:5: ( (lv_memberName_12_0= ruleName ) )
                            // InternalAlf.g:1748:6: (lv_memberName_12_0= ruleName )
                            {
                            // InternalAlf.g:1748:6: (lv_memberName_12_0= ruleName )
                            // InternalAlf.g:1749:7: lv_memberName_12_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getMemberNameNameParserRuleCall_4_0_1_0());
                            						
                            pushFollow(FOLLOW_27);
                            lv_memberName_12_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFeaturePackageMemberElementRule());
                            							}
                            							set(
                            								current,
                            								"memberName",
                            								lv_memberName_12_0,
                            								"org.omg.sysml.Alf.Name");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_13, grammarAccess.getFeaturePackageMemberElementAccess().getIsKeyword_4_1());
                    			
                    // InternalAlf.g:1771:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1772:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1772:5: ( ruleQualifiedName )
                    // InternalAlf.g:1773:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeaturePackageMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getMemberElementFeatureCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getFeaturePackageMemberElementAccess().getSemicolonKeyword_4_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeaturePackageMemberElement"


    // $ANTLR start "ruleCategoryBody"
    // InternalAlf.g:1797:1: ruleCategoryBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) ;
    public final EObject ruleCategoryBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_ownedRelationship_2_0 = null;

        EObject lv_ownedRelationship_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1803:2: ( (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) )
            // InternalAlf.g:1804:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            {
            // InternalAlf.g:1804:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20) ) {
                alt29=1;
            }
            else if ( (LA29_0==23) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalAlf.g:1805:3: otherlv_0= ';'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getCategoryBodyAccess().getSemicolonKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:1810:3: (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    {
                    // InternalAlf.g:1810:3: (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    // InternalAlf.g:1811:4: otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getCategoryBodyAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalAlf.g:1815:4: ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )*
                    loop28:
                    do {
                        int alt28=3;
                        alt28 = dfa28.predict(input);
                        switch (alt28) {
                    	case 1 :
                    	    // InternalAlf.g:1816:5: ( (lv_ownedRelationship_2_0= ruleCategoryMember ) )
                    	    {
                    	    // InternalAlf.g:1816:5: ( (lv_ownedRelationship_2_0= ruleCategoryMember ) )
                    	    // InternalAlf.g:1817:6: (lv_ownedRelationship_2_0= ruleCategoryMember )
                    	    {
                    	    // InternalAlf.g:1817:6: (lv_ownedRelationship_2_0= ruleCategoryMember )
                    	    // InternalAlf.g:1818:7: lv_ownedRelationship_2_0= ruleCategoryMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getCategoryBodyAccess().getOwnedRelationshipCategoryMemberParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_ownedRelationship_2_0=ruleCategoryMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCategoryBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedRelationship",
                    	    								lv_ownedRelationship_2_0,
                    	    								"org.omg.sysml.Alf.CategoryMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAlf.g:1836:5: ( (lv_ownedRelationship_3_0= rulePackageImport ) )
                    	    {
                    	    // InternalAlf.g:1836:5: ( (lv_ownedRelationship_3_0= rulePackageImport ) )
                    	    // InternalAlf.g:1837:6: (lv_ownedRelationship_3_0= rulePackageImport )
                    	    {
                    	    // InternalAlf.g:1837:6: (lv_ownedRelationship_3_0= rulePackageImport )
                    	    // InternalAlf.g:1838:7: lv_ownedRelationship_3_0= rulePackageImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getCategoryBodyAccess().getOwnedRelationshipPackageImportParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_ownedRelationship_3_0=rulePackageImport();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCategoryBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedRelationship",
                    	    								lv_ownedRelationship_3_0,
                    	    								"org.omg.sysml.Alf.PackageImport");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getCategoryBodyAccess().getRightCurlyBracketKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategoryBody"


    // $ANTLR start "ruleAbstractCategoryBody"
    // InternalAlf.g:1866:1: ruleAbstractCategoryBody[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= ';' ) ) | ( ( (lv_isAbstract_1_0= '{' ) ) ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) ;
    public final EObject ruleAbstractCategoryBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token lv_isAbstract_1_0=null;
        Token otherlv_4=null;
        EObject lv_ownedRelationship_2_0 = null;

        EObject lv_ownedRelationship_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1872:2: ( ( ( (lv_isAbstract_0_0= ';' ) ) | ( ( (lv_isAbstract_1_0= '{' ) ) ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) )
            // InternalAlf.g:1873:2: ( ( (lv_isAbstract_0_0= ';' ) ) | ( ( (lv_isAbstract_1_0= '{' ) ) ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            {
            // InternalAlf.g:1873:2: ( ( (lv_isAbstract_0_0= ';' ) ) | ( ( (lv_isAbstract_1_0= '{' ) ) ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==20) ) {
                alt31=1;
            }
            else if ( (LA31_0==23) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalAlf.g:1874:3: ( (lv_isAbstract_0_0= ';' ) )
                    {
                    // InternalAlf.g:1874:3: ( (lv_isAbstract_0_0= ';' ) )
                    // InternalAlf.g:1875:4: (lv_isAbstract_0_0= ';' )
                    {
                    // InternalAlf.g:1875:4: (lv_isAbstract_0_0= ';' )
                    // InternalAlf.g:1876:5: lv_isAbstract_0_0= ';'
                    {
                    lv_isAbstract_0_0=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getAbstractCategoryBodyAccess().getIsAbstractSemicolonKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAbstractCategoryBodyRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, ";");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1889:3: ( ( (lv_isAbstract_1_0= '{' ) ) ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    {
                    // InternalAlf.g:1889:3: ( ( (lv_isAbstract_1_0= '{' ) ) ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    // InternalAlf.g:1890:4: ( (lv_isAbstract_1_0= '{' ) ) ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}'
                    {
                    // InternalAlf.g:1890:4: ( (lv_isAbstract_1_0= '{' ) )
                    // InternalAlf.g:1891:5: (lv_isAbstract_1_0= '{' )
                    {
                    // InternalAlf.g:1891:5: (lv_isAbstract_1_0= '{' )
                    // InternalAlf.g:1892:6: lv_isAbstract_1_0= '{'
                    {
                    lv_isAbstract_1_0=(Token)match(input,23,FOLLOW_31); 

                    						newLeafNode(lv_isAbstract_1_0, grammarAccess.getAbstractCategoryBodyAccess().getIsAbstractLeftCurlyBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAbstractCategoryBodyRule());
                    						}
                    						setWithLastConsumed(current, "isAbstract", true, "{");
                    					

                    }


                    }

                    // InternalAlf.g:1904:4: ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )*
                    loop30:
                    do {
                        int alt30=3;
                        alt30 = dfa30.predict(input);
                        switch (alt30) {
                    	case 1 :
                    	    // InternalAlf.g:1905:5: ( (lv_ownedRelationship_2_0= ruleCategoryMember ) )
                    	    {
                    	    // InternalAlf.g:1905:5: ( (lv_ownedRelationship_2_0= ruleCategoryMember ) )
                    	    // InternalAlf.g:1906:6: (lv_ownedRelationship_2_0= ruleCategoryMember )
                    	    {
                    	    // InternalAlf.g:1906:6: (lv_ownedRelationship_2_0= ruleCategoryMember )
                    	    // InternalAlf.g:1907:7: lv_ownedRelationship_2_0= ruleCategoryMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getAbstractCategoryBodyAccess().getOwnedRelationshipCategoryMemberParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_ownedRelationship_2_0=ruleCategoryMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAbstractCategoryBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedRelationship",
                    	    								lv_ownedRelationship_2_0,
                    	    								"org.omg.sysml.Alf.CategoryMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAlf.g:1925:5: ( (lv_ownedRelationship_3_0= rulePackageImport ) )
                    	    {
                    	    // InternalAlf.g:1925:5: ( (lv_ownedRelationship_3_0= rulePackageImport ) )
                    	    // InternalAlf.g:1926:6: (lv_ownedRelationship_3_0= rulePackageImport )
                    	    {
                    	    // InternalAlf.g:1926:6: (lv_ownedRelationship_3_0= rulePackageImport )
                    	    // InternalAlf.g:1927:7: lv_ownedRelationship_3_0= rulePackageImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getAbstractCategoryBodyAccess().getOwnedRelationshipPackageImportParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_ownedRelationship_3_0=rulePackageImport();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAbstractCategoryBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedRelationship",
                    	    								lv_ownedRelationship_3_0,
                    	    								"org.omg.sysml.Alf.PackageImport");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getAbstractCategoryBodyAccess().getRightCurlyBracketKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractCategoryBody"


    // $ANTLR start "entryRuleCategoryMember"
    // InternalAlf.g:1954:1: entryRuleCategoryMember returns [EObject current=null] : iv_ruleCategoryMember= ruleCategoryMember EOF ;
    public final EObject entryRuleCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategoryMember = null;


        try {
            // InternalAlf.g:1954:55: (iv_ruleCategoryMember= ruleCategoryMember EOF )
            // InternalAlf.g:1955:2: iv_ruleCategoryMember= ruleCategoryMember EOF
            {
             newCompositeNode(grammarAccess.getCategoryMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCategoryMember=ruleCategoryMember();

            state._fsp--;

             current =iv_ruleCategoryMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCategoryMember"


    // $ANTLR start "ruleCategoryMember"
    // InternalAlf.g:1961:1: ruleCategoryMember returns [EObject current=null] : (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureMember_1= ruleFeatureMember | this_FeatureCategoryMember_2= ruleFeatureCategoryMember ) ;
    public final EObject ruleCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureCategoryMember_0 = null;

        EObject this_FeatureMember_1 = null;

        EObject this_FeatureCategoryMember_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:1967:2: ( (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureMember_1= ruleFeatureMember | this_FeatureCategoryMember_2= ruleFeatureCategoryMember ) )
            // InternalAlf.g:1968:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureMember_1= ruleFeatureMember | this_FeatureCategoryMember_2= ruleFeatureCategoryMember )
            {
            // InternalAlf.g:1968:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureMember_1= ruleFeatureMember | this_FeatureCategoryMember_2= ruleFeatureCategoryMember )
            int alt32=3;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalAlf.g:1969:3: this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember
                    {

                    			newCompositeNode(grammarAccess.getCategoryMemberAccess().getNonFeatureCategoryMemberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonFeatureCategoryMember_0=ruleNonFeatureCategoryMember();

                    state._fsp--;


                    			current = this_NonFeatureCategoryMember_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:1978:3: this_FeatureMember_1= ruleFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getCategoryMemberAccess().getFeatureMemberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureMember_1=ruleFeatureMember();

                    state._fsp--;


                    			current = this_FeatureMember_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:1987:3: this_FeatureCategoryMember_2= ruleFeatureCategoryMember
                    {

                    			newCompositeNode(grammarAccess.getCategoryMemberAccess().getFeatureCategoryMemberParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureCategoryMember_2=ruleFeatureCategoryMember();

                    state._fsp--;


                    			current = this_FeatureCategoryMember_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategoryMember"


    // $ANTLR start "entryRuleNonFeatureCategoryMember"
    // InternalAlf.g:1999:1: entryRuleNonFeatureCategoryMember returns [EObject current=null] : iv_ruleNonFeatureCategoryMember= ruleNonFeatureCategoryMember EOF ;
    public final EObject entryRuleNonFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureCategoryMember = null;


        try {
            // InternalAlf.g:1999:65: (iv_ruleNonFeatureCategoryMember= ruleNonFeatureCategoryMember EOF )
            // InternalAlf.g:2000:2: iv_ruleNonFeatureCategoryMember= ruleNonFeatureCategoryMember EOF
            {
             newCompositeNode(grammarAccess.getNonFeatureCategoryMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonFeatureCategoryMember=ruleNonFeatureCategoryMember();

            state._fsp--;

             current =iv_ruleNonFeatureCategoryMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonFeatureCategoryMember"


    // $ANTLR start "ruleNonFeatureCategoryMember"
    // InternalAlf.g:2006:1: ruleNonFeatureCategoryMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] ) ;
    public final EObject ruleNonFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject this_CategoryMemberPrefix_0 = null;

        EObject this_NonFeatureMemberElement_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2012:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] ) )
            // InternalAlf.g:2013:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] )
            {
            // InternalAlf.g:2013:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] )
            // InternalAlf.g:2014:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getNonFeatureCategoryMemberRule());
            			}
            			newCompositeNode(grammarAccess.getNonFeatureCategoryMemberAccess().getCategoryMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_CategoryMemberPrefix_0=ruleCategoryMemberPrefix(current);

            state._fsp--;


            			current = this_CategoryMemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getNonFeatureCategoryMemberRule());
            			}
            			newCompositeNode(grammarAccess.getNonFeatureCategoryMemberAccess().getNonFeatureMemberElementParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_NonFeatureMemberElement_1=ruleNonFeatureMemberElement(current);

            state._fsp--;


            			current = this_NonFeatureMemberElement_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonFeatureCategoryMember"


    // $ANTLR start "entryRuleFeatureCategoryMember"
    // InternalAlf.g:2040:1: entryRuleFeatureCategoryMember returns [EObject current=null] : iv_ruleFeatureCategoryMember= ruleFeatureCategoryMember EOF ;
    public final EObject entryRuleFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCategoryMember = null;


        try {
            // InternalAlf.g:2040:62: (iv_ruleFeatureCategoryMember= ruleFeatureCategoryMember EOF )
            // InternalAlf.g:2041:2: iv_ruleFeatureCategoryMember= ruleFeatureCategoryMember EOF
            {
             newCompositeNode(grammarAccess.getFeatureCategoryMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureCategoryMember=ruleFeatureCategoryMember();

            state._fsp--;

             current =iv_ruleFeatureCategoryMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureCategoryMember"


    // $ANTLR start "ruleFeatureCategoryMember"
    // InternalAlf.g:2047:1: ruleFeatureCategoryMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( ( ( (lv_direction_1_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_2_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_3= 'abstract' ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_memberName_7_0= ruleName ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) ) ) ;
    public final EObject ruleFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_CategoryMemberPrefix_0 = null;

        Enumerator lv_direction_1_0 = null;

        EObject lv_ownedRelatedElement_2_0 = null;

        Enumerator lv_direction_4_0 = null;

        EObject lv_ownedRelatedElement_5_0 = null;

        Enumerator lv_direction_6_0 = null;

        AntlrDatatypeRuleToken lv_memberName_7_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2053:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( ( ( (lv_direction_1_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_2_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_3= 'abstract' ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_memberName_7_0= ruleName ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) ) ) )
            // InternalAlf.g:2054:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( ( ( (lv_direction_1_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_2_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_3= 'abstract' ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_memberName_7_0= ruleName ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) ) )
            {
            // InternalAlf.g:2054:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( ( ( (lv_direction_1_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_2_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_3= 'abstract' ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_memberName_7_0= ruleName ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) ) )
            // InternalAlf.g:2055:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( ( ( (lv_direction_1_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_2_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_3= 'abstract' ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_memberName_7_0= ruleName ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureCategoryMemberRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getCategoryMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_CategoryMemberPrefix_0=ruleCategoryMemberPrefix(current);

            state._fsp--;


            			current = this_CategoryMemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:2066:3: ( ( ( (lv_direction_1_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_2_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_3= 'abstract' ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_memberName_7_0= ruleName ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 82:
                {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==RULE_ID) ) {
                    int LA36_4 = input.LA(3);

                    if ( (LA36_4==20||LA36_4==23||(LA36_4>=44 && LA36_4<=46)||(LA36_4>=49 && LA36_4<=51)||LA36_4==54) ) {
                        alt36=1;
                    }
                    else if ( (LA36_4==25) ) {
                        alt36=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA36_1==RULE_UNRESTRICTED_NAME) ) {
                    int LA36_5 = input.LA(3);

                    if ( (LA36_5==20||LA36_5==23||(LA36_5>=44 && LA36_5<=46)||(LA36_5>=49 && LA36_5<=51)||LA36_5==54) ) {
                        alt36=1;
                    }
                    else if ( (LA36_5==25) ) {
                        alt36=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
                }
                break;
            case 83:
                {
                int LA36_2 = input.LA(2);

                if ( (LA36_2==RULE_ID) ) {
                    int LA36_4 = input.LA(3);

                    if ( (LA36_4==20||LA36_4==23||(LA36_4>=44 && LA36_4<=46)||(LA36_4>=49 && LA36_4<=51)||LA36_4==54) ) {
                        alt36=1;
                    }
                    else if ( (LA36_4==25) ) {
                        alt36=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA36_2==RULE_UNRESTRICTED_NAME) ) {
                    int LA36_5 = input.LA(3);

                    if ( (LA36_5==20||LA36_5==23||(LA36_5>=44 && LA36_5<=46)||(LA36_5>=49 && LA36_5<=51)||LA36_5==54) ) {
                        alt36=1;
                    }
                    else if ( (LA36_5==25) ) {
                        alt36=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 2, input);

                    throw nvae;
                }
                }
                break;
            case 84:
                {
                int LA36_3 = input.LA(2);

                if ( (LA36_3==RULE_ID) ) {
                    int LA36_4 = input.LA(3);

                    if ( (LA36_4==20||LA36_4==23||(LA36_4>=44 && LA36_4<=46)||(LA36_4>=49 && LA36_4<=51)||LA36_4==54) ) {
                        alt36=1;
                    }
                    else if ( (LA36_4==25) ) {
                        alt36=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA36_3==RULE_UNRESTRICTED_NAME) ) {
                    int LA36_5 = input.LA(3);

                    if ( (LA36_5==20||LA36_5==23||(LA36_5>=44 && LA36_5<=46)||(LA36_5>=49 && LA36_5<=51)||LA36_5==54) ) {
                        alt36=1;
                    }
                    else if ( (LA36_5==25) ) {
                        alt36=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA36_4 = input.LA(2);

                if ( (LA36_4==20||LA36_4==23||(LA36_4>=44 && LA36_4<=46)||(LA36_4>=49 && LA36_4<=51)||LA36_4==54) ) {
                    alt36=1;
                }
                else if ( (LA36_4==25) ) {
                    alt36=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA36_5 = input.LA(2);

                if ( (LA36_5==20||LA36_5==23||(LA36_5>=44 && LA36_5<=46)||(LA36_5>=49 && LA36_5<=51)||LA36_5==54) ) {
                    alt36=1;
                }
                else if ( (LA36_5==25) ) {
                    alt36=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 5, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                alt36=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalAlf.g:2067:4: ( ( (lv_direction_1_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_2_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2067:4: ( ( (lv_direction_1_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_2_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:2068:5: ( (lv_direction_1_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_2_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:2068:5: ( (lv_direction_1_0= ruleFeatureDirection ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=82 && LA33_0<=84)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalAlf.g:2069:6: (lv_direction_1_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2069:6: (lv_direction_1_0= ruleFeatureDirection )
                            // InternalAlf.g:2070:7: lv_direction_1_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_0_0_0());
                            						
                            pushFollow(FOLLOW_28);
                            lv_direction_1_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFeatureCategoryMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_1_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:2087:5: ( (lv_ownedRelatedElement_2_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:2088:6: (lv_ownedRelatedElement_2_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:2088:6: (lv_ownedRelatedElement_2_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:2089:7: lv_ownedRelatedElement_2_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getOwnedRelatedElementNamedFeatureDefinitionParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedRelatedElement_2_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeatureCategoryMemberRule());
                    							}
                    							add(
                    								current,
                    								"ownedRelatedElement",
                    								lv_ownedRelatedElement_2_0,
                    								"org.omg.sysml.Alf.NamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2108:4: (otherlv_3= 'abstract' ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleAbstractNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2108:4: (otherlv_3= 'abstract' ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleAbstractNamedFeatureDefinition ) ) )
                    // InternalAlf.g:2109:5: otherlv_3= 'abstract' ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleAbstractNamedFeatureDefinition ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_34); 

                    					newLeafNode(otherlv_3, grammarAccess.getFeatureCategoryMemberAccess().getAbstractKeyword_1_1_0());
                    				
                    // InternalAlf.g:2113:5: ( (lv_direction_4_0= ruleFeatureDirection ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=82 && LA34_0<=84)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalAlf.g:2114:6: (lv_direction_4_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2114:6: (lv_direction_4_0= ruleFeatureDirection )
                            // InternalAlf.g:2115:7: lv_direction_4_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_28);
                            lv_direction_4_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFeatureCategoryMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_4_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:2132:5: ( (lv_ownedRelatedElement_5_0= ruleAbstractNamedFeatureDefinition ) )
                    // InternalAlf.g:2133:6: (lv_ownedRelatedElement_5_0= ruleAbstractNamedFeatureDefinition )
                    {
                    // InternalAlf.g:2133:6: (lv_ownedRelatedElement_5_0= ruleAbstractNamedFeatureDefinition )
                    // InternalAlf.g:2134:7: lv_ownedRelatedElement_5_0= ruleAbstractNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getOwnedRelatedElementAbstractNamedFeatureDefinitionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedRelatedElement_5_0=ruleAbstractNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeatureCategoryMemberRule());
                    							}
                    							add(
                    								current,
                    								"ownedRelatedElement",
                    								lv_ownedRelatedElement_5_0,
                    								"org.omg.sysml.Alf.AbstractNamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:2153:4: ( ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_memberName_7_0= ruleName ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    {
                    // InternalAlf.g:2153:4: ( ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_memberName_7_0= ruleName ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    // InternalAlf.g:2154:5: ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_memberName_7_0= ruleName ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';'
                    {
                    // InternalAlf.g:2154:5: ( (lv_direction_6_0= ruleFeatureDirection ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>=82 && LA35_0<=84)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalAlf.g:2155:6: (lv_direction_6_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2155:6: (lv_direction_6_0= ruleFeatureDirection )
                            // InternalAlf.g:2156:7: lv_direction_6_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_15);
                            lv_direction_6_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFeatureCategoryMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_6_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:2173:5: ( (lv_memberName_7_0= ruleName ) )
                    // InternalAlf.g:2174:6: (lv_memberName_7_0= ruleName )
                    {
                    // InternalAlf.g:2174:6: (lv_memberName_7_0= ruleName )
                    // InternalAlf.g:2175:7: lv_memberName_7_0= ruleName
                    {

                    							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getMemberNameNameParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_27);
                    lv_memberName_7_0=ruleName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeatureCategoryMemberRule());
                    							}
                    							set(
                    								current,
                    								"memberName",
                    								lv_memberName_7_0,
                    								"org.omg.sysml.Alf.Name");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_8=(Token)match(input,25,FOLLOW_15); 

                    					newLeafNode(otherlv_8, grammarAccess.getFeatureCategoryMemberAccess().getIsKeyword_1_2_2());
                    				
                    // InternalAlf.g:2196:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:2197:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:2197:6: ( ruleQualifiedName )
                    // InternalAlf.g:2198:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFeatureCategoryMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getMemberFeatureFeatureCrossReference_1_2_3_0());
                    						
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_10=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(otherlv_10, grammarAccess.getFeatureCategoryMemberAccess().getSemicolonKeyword_1_2_4());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureCategoryMember"


    // $ANTLR start "entryRuleFeatureMember"
    // InternalAlf.g:2222:1: entryRuleFeatureMember returns [EObject current=null] : iv_ruleFeatureMember= ruleFeatureMember EOF ;
    public final EObject entryRuleFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureMember = null;


        try {
            // InternalAlf.g:2222:54: (iv_ruleFeatureMember= ruleFeatureMember EOF )
            // InternalAlf.g:2223:2: iv_ruleFeatureMember= ruleFeatureMember EOF
            {
             newCompositeNode(grammarAccess.getFeatureMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureMember=ruleFeatureMember();

            state._fsp--;

             current =iv_ruleFeatureMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureMember"


    // $ANTLR start "ruleFeatureMember"
    // InternalAlf.g:2229:1: ruleFeatureMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( ( (otherlv_1= 'feature' | ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) ) ) | (otherlv_10= 'abstract' (otherlv_11= 'feature' | ( (lv_isPart_12_0= 'part' ) ) | ( (lv_isPort_13_0= 'port' ) ) ) ( (lv_direction_14_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_15_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_16= 'connector' ( ( (lv_ownedRelatedElement_17_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_18_0= ruleName ) )? otherlv_19= 'is' ( ( ruleQualifiedName ) ) otherlv_21= ';' ) ) ) | (otherlv_22= 'abstract' otherlv_23= 'connector' ( (lv_ownedRelatedElement_24_0= ruleAbstractConnectorDefinition ) ) ) ) ) ;
    public final EObject ruleFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isPart_2_0=null;
        Token lv_isPort_3_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_isPart_12_0=null;
        Token lv_isPort_13_0=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        EObject this_CategoryMemberPrefix_0 = null;

        Enumerator lv_direction_4_0 = null;

        EObject lv_ownedRelatedElement_5_0 = null;

        AntlrDatatypeRuleToken lv_memberName_6_0 = null;

        Enumerator lv_direction_14_0 = null;

        EObject lv_ownedRelatedElement_15_0 = null;

        EObject lv_ownedRelatedElement_17_0 = null;

        AntlrDatatypeRuleToken lv_memberName_18_0 = null;

        EObject lv_ownedRelatedElement_24_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2235:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( ( (otherlv_1= 'feature' | ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) ) ) | (otherlv_10= 'abstract' (otherlv_11= 'feature' | ( (lv_isPart_12_0= 'part' ) ) | ( (lv_isPort_13_0= 'port' ) ) ) ( (lv_direction_14_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_15_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_16= 'connector' ( ( (lv_ownedRelatedElement_17_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_18_0= ruleName ) )? otherlv_19= 'is' ( ( ruleQualifiedName ) ) otherlv_21= ';' ) ) ) | (otherlv_22= 'abstract' otherlv_23= 'connector' ( (lv_ownedRelatedElement_24_0= ruleAbstractConnectorDefinition ) ) ) ) ) )
            // InternalAlf.g:2236:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( ( (otherlv_1= 'feature' | ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) ) ) | (otherlv_10= 'abstract' (otherlv_11= 'feature' | ( (lv_isPart_12_0= 'part' ) ) | ( (lv_isPort_13_0= 'port' ) ) ) ( (lv_direction_14_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_15_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_16= 'connector' ( ( (lv_ownedRelatedElement_17_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_18_0= ruleName ) )? otherlv_19= 'is' ( ( ruleQualifiedName ) ) otherlv_21= ';' ) ) ) | (otherlv_22= 'abstract' otherlv_23= 'connector' ( (lv_ownedRelatedElement_24_0= ruleAbstractConnectorDefinition ) ) ) ) )
            {
            // InternalAlf.g:2236:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( ( (otherlv_1= 'feature' | ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) ) ) | (otherlv_10= 'abstract' (otherlv_11= 'feature' | ( (lv_isPart_12_0= 'part' ) ) | ( (lv_isPort_13_0= 'port' ) ) ) ( (lv_direction_14_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_15_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_16= 'connector' ( ( (lv_ownedRelatedElement_17_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_18_0= ruleName ) )? otherlv_19= 'is' ( ( ruleQualifiedName ) ) otherlv_21= ';' ) ) ) | (otherlv_22= 'abstract' otherlv_23= 'connector' ( (lv_ownedRelatedElement_24_0= ruleAbstractConnectorDefinition ) ) ) ) )
            // InternalAlf.g:2237:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( ( (otherlv_1= 'feature' | ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) ) ) | (otherlv_10= 'abstract' (otherlv_11= 'feature' | ( (lv_isPart_12_0= 'part' ) ) | ( (lv_isPort_13_0= 'port' ) ) ) ( (lv_direction_14_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_15_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_16= 'connector' ( ( (lv_ownedRelatedElement_17_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_18_0= ruleName ) )? otherlv_19= 'is' ( ( ruleQualifiedName ) ) otherlv_21= ';' ) ) ) | (otherlv_22= 'abstract' otherlv_23= 'connector' ( (lv_ownedRelatedElement_24_0= ruleAbstractConnectorDefinition ) ) ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureMemberRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureMemberAccess().getCategoryMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_CategoryMemberPrefix_0=ruleCategoryMemberPrefix(current);

            state._fsp--;


            			current = this_CategoryMemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:2248:3: ( ( (otherlv_1= 'feature' | ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) ) ) | (otherlv_10= 'abstract' (otherlv_11= 'feature' | ( (lv_isPart_12_0= 'part' ) ) | ( (lv_isPort_13_0= 'port' ) ) ) ( (lv_direction_14_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_15_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_16= 'connector' ( ( (lv_ownedRelatedElement_17_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_18_0= ruleName ) )? otherlv_19= 'is' ( ( ruleQualifiedName ) ) otherlv_21= ';' ) ) ) | (otherlv_22= 'abstract' otherlv_23= 'connector' ( (lv_ownedRelatedElement_24_0= ruleAbstractConnectorDefinition ) ) ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 32:
            case 34:
            case 35:
                {
                alt45=1;
                }
                break;
            case 33:
                {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==36) ) {
                    alt45=4;
                }
                else if ( (LA45_2==32||(LA45_2>=34 && LA45_2<=35)) ) {
                    alt45=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalAlf.g:2249:4: ( (otherlv_1= 'feature' | ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) ) )
                    {
                    // InternalAlf.g:2249:4: ( (otherlv_1= 'feature' | ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) ) )
                    // InternalAlf.g:2250:5: (otherlv_1= 'feature' | ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) )
                    {
                    // InternalAlf.g:2250:5: (otherlv_1= 'feature' | ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )
                    int alt37=3;
                    switch ( input.LA(1) ) {
                    case 32:
                        {
                        alt37=1;
                        }
                        break;
                    case 34:
                        {
                        alt37=2;
                        }
                        break;
                    case 35:
                        {
                        alt37=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }

                    switch (alt37) {
                        case 1 :
                            // InternalAlf.g:2251:6: otherlv_1= 'feature'
                            {
                            otherlv_1=(Token)match(input,32,FOLLOW_36); 

                            						newLeafNode(otherlv_1, grammarAccess.getFeatureMemberAccess().getFeatureKeyword_1_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2256:6: ( (lv_isPart_2_0= 'part' ) )
                            {
                            // InternalAlf.g:2256:6: ( (lv_isPart_2_0= 'part' ) )
                            // InternalAlf.g:2257:7: (lv_isPart_2_0= 'part' )
                            {
                            // InternalAlf.g:2257:7: (lv_isPart_2_0= 'part' )
                            // InternalAlf.g:2258:8: lv_isPart_2_0= 'part'
                            {
                            lv_isPart_2_0=(Token)match(input,34,FOLLOW_36); 

                            								newLeafNode(lv_isPart_2_0, grammarAccess.getFeatureMemberAccess().getIsPartPartKeyword_1_0_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPart", true, "part");
                            							

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAlf.g:2271:6: ( (lv_isPort_3_0= 'port' ) )
                            {
                            // InternalAlf.g:2271:6: ( (lv_isPort_3_0= 'port' ) )
                            // InternalAlf.g:2272:7: (lv_isPort_3_0= 'port' )
                            {
                            // InternalAlf.g:2272:7: (lv_isPort_3_0= 'port' )
                            // InternalAlf.g:2273:8: lv_isPort_3_0= 'port'
                            {
                            lv_isPort_3_0=(Token)match(input,35,FOLLOW_36); 

                            								newLeafNode(lv_isPort_3_0, grammarAccess.getFeatureMemberAccess().getIsPortPortKeyword_1_0_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPort", true, "port");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:2286:5: ( (lv_direction_4_0= ruleFeatureDirection ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0>=82 && LA38_0<=84)) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalAlf.g:2287:6: (lv_direction_4_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2287:6: (lv_direction_4_0= ruleFeatureDirection )
                            // InternalAlf.g:2288:7: lv_direction_4_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_37);
                            lv_direction_4_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_4_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:2305:5: ( ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) )
                    int alt40=2;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                        {
                        int LA40_1 = input.LA(2);

                        if ( (LA40_1==25) ) {
                            alt40=2;
                        }
                        else if ( (LA40_1==20||LA40_1==23||(LA40_1>=44 && LA40_1<=46)||(LA40_1>=49 && LA40_1<=51)||LA40_1==54) ) {
                            alt40=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 40, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_UNRESTRICTED_NAME:
                        {
                        int LA40_2 = input.LA(2);

                        if ( (LA40_2==20||LA40_2==23||(LA40_2>=44 && LA40_2<=46)||(LA40_2>=49 && LA40_2<=51)||LA40_2==54) ) {
                            alt40=1;
                        }
                        else if ( (LA40_2==25) ) {
                            alt40=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 40, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 44:
                        {
                        alt40=1;
                        }
                        break;
                    case 25:
                        {
                        alt40=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }

                    switch (alt40) {
                        case 1 :
                            // InternalAlf.g:2306:6: ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) )
                            {
                            // InternalAlf.g:2306:6: ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) )
                            // InternalAlf.g:2307:7: (lv_ownedRelatedElement_5_0= ruleFeatureDefinition )
                            {
                            // InternalAlf.g:2307:7: (lv_ownedRelatedElement_5_0= ruleFeatureDefinition )
                            // InternalAlf.g:2308:8: lv_ownedRelatedElement_5_0= ruleFeatureDefinition
                            {

                            								newCompositeNode(grammarAccess.getFeatureMemberAccess().getOwnedRelatedElementFeatureDefinitionParserRuleCall_1_0_2_0_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_ownedRelatedElement_5_0=ruleFeatureDefinition();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getFeatureMemberRule());
                            								}
                            								add(
                            									current,
                            									"ownedRelatedElement",
                            									lv_ownedRelatedElement_5_0,
                            									"org.omg.sysml.Alf.FeatureDefinition");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2326:6: ( ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' )
                            {
                            // InternalAlf.g:2326:6: ( ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' )
                            // InternalAlf.g:2327:7: ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';'
                            {
                            // InternalAlf.g:2327:7: ( (lv_memberName_6_0= ruleName ) )?
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt39=1;
                            }
                            switch (alt39) {
                                case 1 :
                                    // InternalAlf.g:2328:8: (lv_memberName_6_0= ruleName )
                                    {
                                    // InternalAlf.g:2328:8: (lv_memberName_6_0= ruleName )
                                    // InternalAlf.g:2329:9: lv_memberName_6_0= ruleName
                                    {

                                    									newCompositeNode(grammarAccess.getFeatureMemberAccess().getMemberNameNameParserRuleCall_1_0_2_1_0_0());
                                    								
                                    pushFollow(FOLLOW_27);
                                    lv_memberName_6_0=ruleName();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getFeatureMemberRule());
                                    									}
                                    									set(
                                    										current,
                                    										"memberName",
                                    										lv_memberName_6_0,
                                    										"org.omg.sysml.Alf.Name");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }
                                    break;

                            }

                            otherlv_7=(Token)match(input,25,FOLLOW_15); 

                            							newLeafNode(otherlv_7, grammarAccess.getFeatureMemberAccess().getIsKeyword_1_0_2_1_1());
                            						
                            // InternalAlf.g:2350:7: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:2351:8: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:2351:8: ( ruleQualifiedName )
                            // InternalAlf.g:2352:9: ruleQualifiedName
                            {

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getFeatureMemberRule());
                            									}
                            								

                            									newCompositeNode(grammarAccess.getFeatureMemberAccess().getMemberFeatureFeatureCrossReference_1_0_2_1_2_0());
                            								
                            pushFollow(FOLLOW_18);
                            ruleQualifiedName();

                            state._fsp--;


                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            otherlv_9=(Token)match(input,20,FOLLOW_2); 

                            							newLeafNode(otherlv_9, grammarAccess.getFeatureMemberAccess().getSemicolonKeyword_1_0_2_1_3());
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2374:4: (otherlv_10= 'abstract' (otherlv_11= 'feature' | ( (lv_isPart_12_0= 'part' ) ) | ( (lv_isPort_13_0= 'port' ) ) ) ( (lv_direction_14_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_15_0= ruleAbstractFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2374:4: (otherlv_10= 'abstract' (otherlv_11= 'feature' | ( (lv_isPart_12_0= 'part' ) ) | ( (lv_isPort_13_0= 'port' ) ) ) ( (lv_direction_14_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_15_0= ruleAbstractFeatureDefinition ) ) )
                    // InternalAlf.g:2375:5: otherlv_10= 'abstract' (otherlv_11= 'feature' | ( (lv_isPart_12_0= 'part' ) ) | ( (lv_isPort_13_0= 'port' ) ) ) ( (lv_direction_14_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_15_0= ruleAbstractFeatureDefinition ) )
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_38); 

                    					newLeafNode(otherlv_10, grammarAccess.getFeatureMemberAccess().getAbstractKeyword_1_1_0());
                    				
                    // InternalAlf.g:2379:5: (otherlv_11= 'feature' | ( (lv_isPart_12_0= 'part' ) ) | ( (lv_isPort_13_0= 'port' ) ) )
                    int alt41=3;
                    switch ( input.LA(1) ) {
                    case 32:
                        {
                        alt41=1;
                        }
                        break;
                    case 34:
                        {
                        alt41=2;
                        }
                        break;
                    case 35:
                        {
                        alt41=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }

                    switch (alt41) {
                        case 1 :
                            // InternalAlf.g:2380:6: otherlv_11= 'feature'
                            {
                            otherlv_11=(Token)match(input,32,FOLLOW_39); 

                            						newLeafNode(otherlv_11, grammarAccess.getFeatureMemberAccess().getFeatureKeyword_1_1_1_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2385:6: ( (lv_isPart_12_0= 'part' ) )
                            {
                            // InternalAlf.g:2385:6: ( (lv_isPart_12_0= 'part' ) )
                            // InternalAlf.g:2386:7: (lv_isPart_12_0= 'part' )
                            {
                            // InternalAlf.g:2386:7: (lv_isPart_12_0= 'part' )
                            // InternalAlf.g:2387:8: lv_isPart_12_0= 'part'
                            {
                            lv_isPart_12_0=(Token)match(input,34,FOLLOW_39); 

                            								newLeafNode(lv_isPart_12_0, grammarAccess.getFeatureMemberAccess().getIsPartPartKeyword_1_1_1_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPart", true, "part");
                            							

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAlf.g:2400:6: ( (lv_isPort_13_0= 'port' ) )
                            {
                            // InternalAlf.g:2400:6: ( (lv_isPort_13_0= 'port' ) )
                            // InternalAlf.g:2401:7: (lv_isPort_13_0= 'port' )
                            {
                            // InternalAlf.g:2401:7: (lv_isPort_13_0= 'port' )
                            // InternalAlf.g:2402:8: lv_isPort_13_0= 'port'
                            {
                            lv_isPort_13_0=(Token)match(input,35,FOLLOW_39); 

                            								newLeafNode(lv_isPort_13_0, grammarAccess.getFeatureMemberAccess().getIsPortPortKeyword_1_1_1_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPort", true, "port");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:2415:5: ( (lv_direction_14_0= ruleFeatureDirection ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( ((LA42_0>=82 && LA42_0<=84)) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalAlf.g:2416:6: (lv_direction_14_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2416:6: (lv_direction_14_0= ruleFeatureDirection )
                            // InternalAlf.g:2417:7: lv_direction_14_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_1_2_0());
                            						
                            pushFollow(FOLLOW_39);
                            lv_direction_14_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_14_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:2434:5: ( (lv_ownedRelatedElement_15_0= ruleAbstractFeatureDefinition ) )
                    // InternalAlf.g:2435:6: (lv_ownedRelatedElement_15_0= ruleAbstractFeatureDefinition )
                    {
                    // InternalAlf.g:2435:6: (lv_ownedRelatedElement_15_0= ruleAbstractFeatureDefinition )
                    // InternalAlf.g:2436:7: lv_ownedRelatedElement_15_0= ruleAbstractFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getFeatureMemberAccess().getOwnedRelatedElementAbstractFeatureDefinitionParserRuleCall_1_1_3_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedRelatedElement_15_0=ruleAbstractFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeatureMemberRule());
                    							}
                    							add(
                    								current,
                    								"ownedRelatedElement",
                    								lv_ownedRelatedElement_15_0,
                    								"org.omg.sysml.Alf.AbstractFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:2455:4: (otherlv_16= 'connector' ( ( (lv_ownedRelatedElement_17_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_18_0= ruleName ) )? otherlv_19= 'is' ( ( ruleQualifiedName ) ) otherlv_21= ';' ) ) )
                    {
                    // InternalAlf.g:2455:4: (otherlv_16= 'connector' ( ( (lv_ownedRelatedElement_17_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_18_0= ruleName ) )? otherlv_19= 'is' ( ( ruleQualifiedName ) ) otherlv_21= ';' ) ) )
                    // InternalAlf.g:2456:5: otherlv_16= 'connector' ( ( (lv_ownedRelatedElement_17_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_18_0= ruleName ) )? otherlv_19= 'is' ( ( ruleQualifiedName ) ) otherlv_21= ';' ) )
                    {
                    otherlv_16=(Token)match(input,36,FOLLOW_40); 

                    					newLeafNode(otherlv_16, grammarAccess.getFeatureMemberAccess().getConnectorKeyword_1_2_0());
                    				
                    // InternalAlf.g:2460:5: ( ( (lv_ownedRelatedElement_17_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_18_0= ruleName ) )? otherlv_19= 'is' ( ( ruleQualifiedName ) ) otherlv_21= ';' ) )
                    int alt44=2;
                    alt44 = dfa44.predict(input);
                    switch (alt44) {
                        case 1 :
                            // InternalAlf.g:2461:6: ( (lv_ownedRelatedElement_17_0= ruleConnectorDefinition ) )
                            {
                            // InternalAlf.g:2461:6: ( (lv_ownedRelatedElement_17_0= ruleConnectorDefinition ) )
                            // InternalAlf.g:2462:7: (lv_ownedRelatedElement_17_0= ruleConnectorDefinition )
                            {
                            // InternalAlf.g:2462:7: (lv_ownedRelatedElement_17_0= ruleConnectorDefinition )
                            // InternalAlf.g:2463:8: lv_ownedRelatedElement_17_0= ruleConnectorDefinition
                            {

                            								newCompositeNode(grammarAccess.getFeatureMemberAccess().getOwnedRelatedElementConnectorDefinitionParserRuleCall_1_2_1_0_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_ownedRelatedElement_17_0=ruleConnectorDefinition();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getFeatureMemberRule());
                            								}
                            								add(
                            									current,
                            									"ownedRelatedElement",
                            									lv_ownedRelatedElement_17_0,
                            									"org.omg.sysml.Alf.ConnectorDefinition");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2481:6: ( ( (lv_memberName_18_0= ruleName ) )? otherlv_19= 'is' ( ( ruleQualifiedName ) ) otherlv_21= ';' )
                            {
                            // InternalAlf.g:2481:6: ( ( (lv_memberName_18_0= ruleName ) )? otherlv_19= 'is' ( ( ruleQualifiedName ) ) otherlv_21= ';' )
                            // InternalAlf.g:2482:7: ( (lv_memberName_18_0= ruleName ) )? otherlv_19= 'is' ( ( ruleQualifiedName ) ) otherlv_21= ';'
                            {
                            // InternalAlf.g:2482:7: ( (lv_memberName_18_0= ruleName ) )?
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt43=1;
                            }
                            switch (alt43) {
                                case 1 :
                                    // InternalAlf.g:2483:8: (lv_memberName_18_0= ruleName )
                                    {
                                    // InternalAlf.g:2483:8: (lv_memberName_18_0= ruleName )
                                    // InternalAlf.g:2484:9: lv_memberName_18_0= ruleName
                                    {

                                    									newCompositeNode(grammarAccess.getFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_1_1_0_0());
                                    								
                                    pushFollow(FOLLOW_27);
                                    lv_memberName_18_0=ruleName();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getFeatureMemberRule());
                                    									}
                                    									set(
                                    										current,
                                    										"memberName",
                                    										lv_memberName_18_0,
                                    										"org.omg.sysml.Alf.Name");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }
                                    break;

                            }

                            otherlv_19=(Token)match(input,25,FOLLOW_15); 

                            							newLeafNode(otherlv_19, grammarAccess.getFeatureMemberAccess().getIsKeyword_1_2_1_1_1());
                            						
                            // InternalAlf.g:2505:7: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:2506:8: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:2506:8: ( ruleQualifiedName )
                            // InternalAlf.g:2507:9: ruleQualifiedName
                            {

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getFeatureMemberRule());
                            									}
                            								

                            									newCompositeNode(grammarAccess.getFeatureMemberAccess().getMemberFeatureConnectorCrossReference_1_2_1_1_2_0());
                            								
                            pushFollow(FOLLOW_18);
                            ruleQualifiedName();

                            state._fsp--;


                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            otherlv_21=(Token)match(input,20,FOLLOW_2); 

                            							newLeafNode(otherlv_21, grammarAccess.getFeatureMemberAccess().getSemicolonKeyword_1_2_1_1_3());
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:2529:4: (otherlv_22= 'abstract' otherlv_23= 'connector' ( (lv_ownedRelatedElement_24_0= ruleAbstractConnectorDefinition ) ) )
                    {
                    // InternalAlf.g:2529:4: (otherlv_22= 'abstract' otherlv_23= 'connector' ( (lv_ownedRelatedElement_24_0= ruleAbstractConnectorDefinition ) ) )
                    // InternalAlf.g:2530:5: otherlv_22= 'abstract' otherlv_23= 'connector' ( (lv_ownedRelatedElement_24_0= ruleAbstractConnectorDefinition ) )
                    {
                    otherlv_22=(Token)match(input,33,FOLLOW_41); 

                    					newLeafNode(otherlv_22, grammarAccess.getFeatureMemberAccess().getAbstractKeyword_1_3_0());
                    				
                    otherlv_23=(Token)match(input,36,FOLLOW_40); 

                    					newLeafNode(otherlv_23, grammarAccess.getFeatureMemberAccess().getConnectorKeyword_1_3_1());
                    				
                    // InternalAlf.g:2538:5: ( (lv_ownedRelatedElement_24_0= ruleAbstractConnectorDefinition ) )
                    // InternalAlf.g:2539:6: (lv_ownedRelatedElement_24_0= ruleAbstractConnectorDefinition )
                    {
                    // InternalAlf.g:2539:6: (lv_ownedRelatedElement_24_0= ruleAbstractConnectorDefinition )
                    // InternalAlf.g:2540:7: lv_ownedRelatedElement_24_0= ruleAbstractConnectorDefinition
                    {

                    							newCompositeNode(grammarAccess.getFeatureMemberAccess().getOwnedRelatedElementAbstractConnectorDefinitionParserRuleCall_1_3_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedRelatedElement_24_0=ruleAbstractConnectorDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeatureMemberRule());
                    							}
                    							add(
                    								current,
                    								"ownedRelatedElement",
                    								lv_ownedRelatedElement_24_0,
                    								"org.omg.sysml.Alf.AbstractConnectorDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureMember"


    // $ANTLR start "ruleCategoryMemberPrefix"
    // InternalAlf.g:2564:1: ruleCategoryMemberPrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ) ;
    public final EObject ruleCategoryMemberPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedRelationship_0_0 = null;

        Enumerator lv_visibility_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2570:2: ( ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ) )
            // InternalAlf.g:2571:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? )
            {
            // InternalAlf.g:2571:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? )
            // InternalAlf.g:2572:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            {
            // InternalAlf.g:2572:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalAlf.g:2573:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    {
            	    // InternalAlf.g:2573:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    // InternalAlf.g:2574:5: lv_ownedRelationship_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getCategoryMemberPrefixAccess().getOwnedRelationshipAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_42);
            	    lv_ownedRelationship_0_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCategoryMemberPrefixRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedRelationship",
            	    						lv_ownedRelationship_0_0,
            	    						"org.omg.sysml.Alf.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // InternalAlf.g:2591:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=78 && LA47_0<=81)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAlf.g:2592:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:2592:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:2593:5: lv_visibility_1_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getCategoryMemberPrefixAccess().getVisibilityVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_visibility_1_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCategoryMemberPrefixRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_1_0,
                    						"org.omg.sysml.Alf.VisibilityIndicator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategoryMemberPrefix"


    // $ANTLR start "entryRuleClassDefinitionOrStub"
    // InternalAlf.g:2614:1: entryRuleClassDefinitionOrStub returns [EObject current=null] : iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF ;
    public final EObject entryRuleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:2614:62: (iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:2615:2: iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF
            {
             newCompositeNode(grammarAccess.getClassDefinitionOrStubRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDefinitionOrStub=ruleClassDefinitionOrStub();

            state._fsp--;

             current =iv_ruleClassDefinitionOrStub; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDefinitionOrStub"


    // $ANTLR start "ruleClassDefinitionOrStub"
    // InternalAlf.g:2621:1: ruleClassDefinitionOrStub returns [EObject current=null] : this_ClassDefinition_0= ruleClassDefinition[$current] ;
    public final EObject ruleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2627:2: (this_ClassDefinition_0= ruleClassDefinition[$current] )
            // InternalAlf.g:2628:2: this_ClassDefinition_0= ruleClassDefinition[$current]
            {

            		if (current==null) {
            			current = createModelElement(grammarAccess.getClassDefinitionOrStubRule());
            		}
            		newCompositeNode(grammarAccess.getClassDefinitionOrStubAccess().getClassDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ClassDefinition_0=ruleClassDefinition(current);

            state._fsp--;


            		current = this_ClassDefinition_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassDefinitionOrStub"


    // $ANTLR start "ruleClassDefinition"
    // InternalAlf.g:2643:1: ruleClassDefinition[EObject in_current] returns [EObject current=in_current] : (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) ;
    public final EObject ruleClassDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_ClassDeclaration_0 = null;

        EObject this_CategoryBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2649:2: ( (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) )
            // InternalAlf.g:2650:2: (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:2650:2: (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            // InternalAlf.g:2651:3: this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getClassDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getClassDefinitionAccess().getClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_ClassDeclaration_0=ruleClassDeclaration(current);

            state._fsp--;


            			current = this_ClassDeclaration_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getClassDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getClassDefinitionAccess().getCategoryBodyParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_CategoryBody_1=ruleCategoryBody(current);

            state._fsp--;


            			current = this_CategoryBody_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassDefinition"


    // $ANTLR start "ruleClassDeclaration"
    // InternalAlf.g:2678:1: ruleClassDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'Class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) ;
    public final EObject ruleClassDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        EObject this_ClassDeclarationCompletion_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2684:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'Class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) )
            // InternalAlf.g:2685:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'Class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            {
            // InternalAlf.g:2685:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'Class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            // InternalAlf.g:2686:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'Class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current]
            {
            // InternalAlf.g:2686:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==33) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAlf.g:2687:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:2687:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:2688:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,33,FOLLOW_44); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDeclarationAccess().getClassKeyword_1());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getClassDeclarationRule());
            			}
            			newCompositeNode(grammarAccess.getClassDeclarationAccess().getClassDeclarationCompletionParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_ClassDeclarationCompletion_2=ruleClassDeclarationCompletion(current);

            state._fsp--;


            			current = this_ClassDeclarationCompletion_2;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassDeclaration"


    // $ANTLR start "ruleClassDeclarationCompletion"
    // InternalAlf.g:2720:1: ruleClassDeclarationCompletion[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= ruleName ) ) (this_SpecializationList_1= ruleSpecializationList[$current] )? ) ;
    public final EObject ruleClassDeclarationCompletion(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject this_SpecializationList_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2726:2: ( ( ( (lv_name_0_0= ruleName ) ) (this_SpecializationList_1= ruleSpecializationList[$current] )? ) )
            // InternalAlf.g:2727:2: ( ( (lv_name_0_0= ruleName ) ) (this_SpecializationList_1= ruleSpecializationList[$current] )? )
            {
            // InternalAlf.g:2727:2: ( ( (lv_name_0_0= ruleName ) ) (this_SpecializationList_1= ruleSpecializationList[$current] )? )
            // InternalAlf.g:2728:3: ( (lv_name_0_0= ruleName ) ) (this_SpecializationList_1= ruleSpecializationList[$current] )?
            {
            // InternalAlf.g:2728:3: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:2729:4: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:2729:4: (lv_name_0_0= ruleName )
            // InternalAlf.g:2730:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getClassDeclarationCompletionAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_45);
            lv_name_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassDeclarationCompletionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:2747:3: (this_SpecializationList_1= ruleSpecializationList[$current] )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==37) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAlf.g:2748:4: this_SpecializationList_1= ruleSpecializationList[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getClassDeclarationCompletionRule());
                    				}
                    				newCompositeNode(grammarAccess.getClassDeclarationCompletionAccess().getSpecializationListParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_SpecializationList_1=ruleSpecializationList(current);

                    state._fsp--;


                    				current = this_SpecializationList_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassDeclarationCompletion"


    // $ANTLR start "ruleSpecializationList"
    // InternalAlf.g:2765:1: ruleSpecializationList[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'specializes' ( (lv_ownedRelationship_1_0= ruleSuperclassing ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) ) )* ) ;
    public final EObject ruleSpecializationList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject lv_ownedRelationship_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2771:2: ( (otherlv_0= 'specializes' ( (lv_ownedRelationship_1_0= ruleSuperclassing ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) ) )* ) )
            // InternalAlf.g:2772:2: (otherlv_0= 'specializes' ( (lv_ownedRelationship_1_0= ruleSuperclassing ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) ) )* )
            {
            // InternalAlf.g:2772:2: (otherlv_0= 'specializes' ( (lv_ownedRelationship_1_0= ruleSuperclassing ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) ) )* )
            // InternalAlf.g:2773:3: otherlv_0= 'specializes' ( (lv_ownedRelationship_1_0= ruleSuperclassing ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) ) )*
            {
            otherlv_0=(Token)match(input,37,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSpecializationListAccess().getSpecializesKeyword_0());
            		
            // InternalAlf.g:2777:3: ( (lv_ownedRelationship_1_0= ruleSuperclassing ) )
            // InternalAlf.g:2778:4: (lv_ownedRelationship_1_0= ruleSuperclassing )
            {
            // InternalAlf.g:2778:4: (lv_ownedRelationship_1_0= ruleSuperclassing )
            // InternalAlf.g:2779:5: lv_ownedRelationship_1_0= ruleSuperclassing
            {

            					newCompositeNode(grammarAccess.getSpecializationListAccess().getOwnedRelationshipSuperclassingParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_46);
            lv_ownedRelationship_1_0=ruleSuperclassing();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecializationListRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_1_0,
            						"org.omg.sysml.Alf.Superclassing");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:2796:3: (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==38) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalAlf.g:2797:4: otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) )
            	    {
            	    otherlv_2=(Token)match(input,38,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSpecializationListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAlf.g:2801:4: ( (lv_ownedRelationship_3_0= ruleSuperclassing ) )
            	    // InternalAlf.g:2802:5: (lv_ownedRelationship_3_0= ruleSuperclassing )
            	    {
            	    // InternalAlf.g:2802:5: (lv_ownedRelationship_3_0= ruleSuperclassing )
            	    // InternalAlf.g:2803:6: lv_ownedRelationship_3_0= ruleSuperclassing
            	    {

            	    						newCompositeNode(grammarAccess.getSpecializationListAccess().getOwnedRelationshipSuperclassingParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_ownedRelationship_3_0=ruleSuperclassing();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSpecializationListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedRelationship",
            	    							lv_ownedRelationship_3_0,
            	    							"org.omg.sysml.Alf.Superclassing");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecializationList"


    // $ANTLR start "entryRuleSuperclassing"
    // InternalAlf.g:2825:1: entryRuleSuperclassing returns [EObject current=null] : iv_ruleSuperclassing= ruleSuperclassing EOF ;
    public final EObject entryRuleSuperclassing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperclassing = null;


        try {
            // InternalAlf.g:2825:54: (iv_ruleSuperclassing= ruleSuperclassing EOF )
            // InternalAlf.g:2826:2: iv_ruleSuperclassing= ruleSuperclassing EOF
            {
             newCompositeNode(grammarAccess.getSuperclassingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuperclassing=ruleSuperclassing();

            state._fsp--;

             current =iv_ruleSuperclassing; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuperclassing"


    // $ANTLR start "ruleSuperclassing"
    // InternalAlf.g:2832:1: ruleSuperclassing returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSuperclassing() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:2838:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2839:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2839:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2840:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:2840:3: ( ruleQualifiedName )
            // InternalAlf.g:2841:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSuperclassingRule());
            				}
            			

            				newCompositeNode(grammarAccess.getSuperclassingAccess().getSuperclassClassCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuperclassing"


    // $ANTLR start "entryRuleObjectClassDefinitionOrStub"
    // InternalAlf.g:2858:1: entryRuleObjectClassDefinitionOrStub returns [EObject current=null] : iv_ruleObjectClassDefinitionOrStub= ruleObjectClassDefinitionOrStub EOF ;
    public final EObject entryRuleObjectClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:2858:68: (iv_ruleObjectClassDefinitionOrStub= ruleObjectClassDefinitionOrStub EOF )
            // InternalAlf.g:2859:2: iv_ruleObjectClassDefinitionOrStub= ruleObjectClassDefinitionOrStub EOF
            {
             newCompositeNode(grammarAccess.getObjectClassDefinitionOrStubRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectClassDefinitionOrStub=ruleObjectClassDefinitionOrStub();

            state._fsp--;

             current =iv_ruleObjectClassDefinitionOrStub; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectClassDefinitionOrStub"


    // $ANTLR start "ruleObjectClassDefinitionOrStub"
    // InternalAlf.g:2865:1: ruleObjectClassDefinitionOrStub returns [EObject current=null] : this_ObjectClassDefinition_0= ruleObjectClassDefinition[$current] ;
    public final EObject ruleObjectClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2871:2: (this_ObjectClassDefinition_0= ruleObjectClassDefinition[$current] )
            // InternalAlf.g:2872:2: this_ObjectClassDefinition_0= ruleObjectClassDefinition[$current]
            {

            		if (current==null) {
            			current = createModelElement(grammarAccess.getObjectClassDefinitionOrStubRule());
            		}
            		newCompositeNode(grammarAccess.getObjectClassDefinitionOrStubAccess().getObjectClassDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ObjectClassDefinition_0=ruleObjectClassDefinition(current);

            state._fsp--;


            		current = this_ObjectClassDefinition_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectClassDefinitionOrStub"


    // $ANTLR start "ruleObjectClassDefinition"
    // InternalAlf.g:2887:1: ruleObjectClassDefinition[EObject in_current] returns [EObject current=in_current] : (this_ObjectClassDeclaration_0= ruleObjectClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) ;
    public final EObject ruleObjectClassDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_ObjectClassDeclaration_0 = null;

        EObject this_CategoryBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2893:2: ( (this_ObjectClassDeclaration_0= ruleObjectClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) )
            // InternalAlf.g:2894:2: (this_ObjectClassDeclaration_0= ruleObjectClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:2894:2: (this_ObjectClassDeclaration_0= ruleObjectClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            // InternalAlf.g:2895:3: this_ObjectClassDeclaration_0= ruleObjectClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getObjectClassDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getObjectClassDefinitionAccess().getObjectClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_ObjectClassDeclaration_0=ruleObjectClassDeclaration(current);

            state._fsp--;


            			current = this_ObjectClassDeclaration_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getObjectClassDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getObjectClassDefinitionAccess().getCategoryBodyParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_CategoryBody_1=ruleCategoryBody(current);

            state._fsp--;


            			current = this_CategoryBody_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectClassDefinition"


    // $ANTLR start "ruleObjectClassDeclaration"
    // InternalAlf.g:2922:1: ruleObjectClassDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) ;
    public final EObject ruleObjectClassDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        EObject this_ClassDeclarationCompletion_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2928:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) )
            // InternalAlf.g:2929:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            {
            // InternalAlf.g:2929:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            // InternalAlf.g:2930:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current]
            {
            // InternalAlf.g:2930:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==33) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAlf.g:2931:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:2931:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:2932:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,33,FOLLOW_47); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getObjectClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getObjectClassDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectClassDeclarationAccess().getClassKeyword_1());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getObjectClassDeclarationRule());
            			}
            			newCompositeNode(grammarAccess.getObjectClassDeclarationAccess().getClassDeclarationCompletionParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_ClassDeclarationCompletion_2=ruleClassDeclarationCompletion(current);

            state._fsp--;


            			current = this_ClassDeclarationCompletion_2;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectClassDeclaration"


    // $ANTLR start "entryRuleValueClassDefinitionOrStub"
    // InternalAlf.g:2963:1: entryRuleValueClassDefinitionOrStub returns [EObject current=null] : iv_ruleValueClassDefinitionOrStub= ruleValueClassDefinitionOrStub EOF ;
    public final EObject entryRuleValueClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:2963:67: (iv_ruleValueClassDefinitionOrStub= ruleValueClassDefinitionOrStub EOF )
            // InternalAlf.g:2964:2: iv_ruleValueClassDefinitionOrStub= ruleValueClassDefinitionOrStub EOF
            {
             newCompositeNode(grammarAccess.getValueClassDefinitionOrStubRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueClassDefinitionOrStub=ruleValueClassDefinitionOrStub();

            state._fsp--;

             current =iv_ruleValueClassDefinitionOrStub; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueClassDefinitionOrStub"


    // $ANTLR start "ruleValueClassDefinitionOrStub"
    // InternalAlf.g:2970:1: ruleValueClassDefinitionOrStub returns [EObject current=null] : this_ValueClassDefinition_0= ruleValueClassDefinition[$current] ;
    public final EObject ruleValueClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ValueClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2976:2: (this_ValueClassDefinition_0= ruleValueClassDefinition[$current] )
            // InternalAlf.g:2977:2: this_ValueClassDefinition_0= ruleValueClassDefinition[$current]
            {

            		if (current==null) {
            			current = createModelElement(grammarAccess.getValueClassDefinitionOrStubRule());
            		}
            		newCompositeNode(grammarAccess.getValueClassDefinitionOrStubAccess().getValueClassDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ValueClassDefinition_0=ruleValueClassDefinition(current);

            state._fsp--;


            		current = this_ValueClassDefinition_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueClassDefinitionOrStub"


    // $ANTLR start "ruleValueClassDefinition"
    // InternalAlf.g:2992:1: ruleValueClassDefinition[EObject in_current] returns [EObject current=in_current] : (this_ValueClassDeclaration_0= ruleValueClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) ;
    public final EObject ruleValueClassDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_ValueClassDeclaration_0 = null;

        EObject this_CategoryBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2998:2: ( (this_ValueClassDeclaration_0= ruleValueClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) )
            // InternalAlf.g:2999:2: (this_ValueClassDeclaration_0= ruleValueClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:2999:2: (this_ValueClassDeclaration_0= ruleValueClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            // InternalAlf.g:3000:3: this_ValueClassDeclaration_0= ruleValueClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getValueClassDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getValueClassDefinitionAccess().getValueClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_ValueClassDeclaration_0=ruleValueClassDeclaration(current);

            state._fsp--;


            			current = this_ValueClassDeclaration_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getValueClassDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getValueClassDefinitionAccess().getCategoryBodyParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_CategoryBody_1=ruleCategoryBody(current);

            state._fsp--;


            			current = this_CategoryBody_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueClassDefinition"


    // $ANTLR start "ruleValueClassDeclaration"
    // InternalAlf.g:3027:1: ruleValueClassDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'datatype' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) ;
    public final EObject ruleValueClassDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        EObject this_ClassDeclarationCompletion_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:3033:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'datatype' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) )
            // InternalAlf.g:3034:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'datatype' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            {
            // InternalAlf.g:3034:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'datatype' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            // InternalAlf.g:3035:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'datatype' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current]
            {
            // InternalAlf.g:3035:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==33) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAlf.g:3036:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:3036:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:3037:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,33,FOLLOW_48); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getValueClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueClassDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getValueClassDeclarationAccess().getDatatypeKeyword_1());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getValueClassDeclarationRule());
            			}
            			newCompositeNode(grammarAccess.getValueClassDeclarationAccess().getClassDeclarationCompletionParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_ClassDeclarationCompletion_2=ruleClassDeclarationCompletion(current);

            state._fsp--;


            			current = this_ClassDeclarationCompletion_2;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueClassDeclaration"


    // $ANTLR start "entryRuleAssociationDefinitionOrStub"
    // InternalAlf.g:3068:1: entryRuleAssociationDefinitionOrStub returns [EObject current=null] : iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF ;
    public final EObject entryRuleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinitionOrStub = null;


        try {
            // InternalAlf.g:3068:68: (iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF )
            // InternalAlf.g:3069:2: iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF
            {
             newCompositeNode(grammarAccess.getAssociationDefinitionOrStubRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationDefinitionOrStub=ruleAssociationDefinitionOrStub();

            state._fsp--;

             current =iv_ruleAssociationDefinitionOrStub; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociationDefinitionOrStub"


    // $ANTLR start "ruleAssociationDefinitionOrStub"
    // InternalAlf.g:3075:1: ruleAssociationDefinitionOrStub returns [EObject current=null] : this_AssociationDefinition_0= ruleAssociationDefinition[$current] ;
    public final EObject ruleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_AssociationDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3081:2: (this_AssociationDefinition_0= ruleAssociationDefinition[$current] )
            // InternalAlf.g:3082:2: this_AssociationDefinition_0= ruleAssociationDefinition[$current]
            {

            		if (current==null) {
            			current = createModelElement(grammarAccess.getAssociationDefinitionOrStubRule());
            		}
            		newCompositeNode(grammarAccess.getAssociationDefinitionOrStubAccess().getAssociationDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AssociationDefinition_0=ruleAssociationDefinition(current);

            state._fsp--;


            		current = this_AssociationDefinition_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociationDefinitionOrStub"


    // $ANTLR start "ruleAssociationDefinition"
    // InternalAlf.g:3097:1: ruleAssociationDefinition[EObject in_current] returns [EObject current=in_current] : (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] ) ;
    public final EObject ruleAssociationDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_AssociationDeclaration_0 = null;

        EObject this_AssociationBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:3103:2: ( (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] ) )
            // InternalAlf.g:3104:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] )
            {
            // InternalAlf.g:3104:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] )
            // InternalAlf.g:3105:3: this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getAssociationDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_AssociationDeclaration_0=ruleAssociationDeclaration(current);

            state._fsp--;


            			current = this_AssociationDeclaration_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getAssociationBodyParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_AssociationBody_1=ruleAssociationBody(current);

            state._fsp--;


            			current = this_AssociationBody_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociationDefinition"


    // $ANTLR start "ruleAssociationDeclaration"
    // InternalAlf.g:3132:1: ruleAssociationDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) ;
    public final EObject ruleAssociationDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        EObject this_ClassDeclarationCompletion_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:3138:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) )
            // InternalAlf.g:3139:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            {
            // InternalAlf.g:3139:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            // InternalAlf.g:3140:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current]
            {
            // InternalAlf.g:3140:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==33) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalAlf.g:3141:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:3141:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:3142:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,33,FOLLOW_49); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getAssociationDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociationDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationDeclarationAccess().getAssocKeyword_1());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationDeclarationRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getClassDeclarationCompletionParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_ClassDeclarationCompletion_2=ruleClassDeclarationCompletion(current);

            state._fsp--;


            			current = this_ClassDeclarationCompletion_2;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociationDeclaration"


    // $ANTLR start "ruleAssociationBody"
    // InternalAlf.g:3174:1: ruleAssociationBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleAssociationMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) ;
    public final EObject ruleAssociationBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_ownedRelationship_2_0 = null;

        EObject lv_ownedRelationship_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3180:2: ( (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleAssociationMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) )
            // InternalAlf.g:3181:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleAssociationMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            {
            // InternalAlf.g:3181:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleAssociationMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==20) ) {
                alt55=1;
            }
            else if ( (LA55_0==23) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalAlf.g:3182:3: otherlv_0= ';'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getAssociationBodyAccess().getSemicolonKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3187:3: (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleAssociationMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    {
                    // InternalAlf.g:3187:3: (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleAssociationMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    // InternalAlf.g:3188:4: otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleAssociationMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_50); 

                    				newLeafNode(otherlv_1, grammarAccess.getAssociationBodyAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalAlf.g:3192:4: ( ( (lv_ownedRelationship_2_0= ruleAssociationMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )*
                    loop54:
                    do {
                        int alt54=3;
                        alt54 = dfa54.predict(input);
                        switch (alt54) {
                    	case 1 :
                    	    // InternalAlf.g:3193:5: ( (lv_ownedRelationship_2_0= ruleAssociationMember ) )
                    	    {
                    	    // InternalAlf.g:3193:5: ( (lv_ownedRelationship_2_0= ruleAssociationMember ) )
                    	    // InternalAlf.g:3194:6: (lv_ownedRelationship_2_0= ruleAssociationMember )
                    	    {
                    	    // InternalAlf.g:3194:6: (lv_ownedRelationship_2_0= ruleAssociationMember )
                    	    // InternalAlf.g:3195:7: lv_ownedRelationship_2_0= ruleAssociationMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationBodyAccess().getOwnedRelationshipAssociationMemberParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_50);
                    	    lv_ownedRelationship_2_0=ruleAssociationMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssociationBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedRelationship",
                    	    								lv_ownedRelationship_2_0,
                    	    								"org.omg.sysml.Alf.AssociationMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAlf.g:3213:5: ( (lv_ownedRelationship_3_0= rulePackageImport ) )
                    	    {
                    	    // InternalAlf.g:3213:5: ( (lv_ownedRelationship_3_0= rulePackageImport ) )
                    	    // InternalAlf.g:3214:6: (lv_ownedRelationship_3_0= rulePackageImport )
                    	    {
                    	    // InternalAlf.g:3214:6: (lv_ownedRelationship_3_0= rulePackageImport )
                    	    // InternalAlf.g:3215:7: lv_ownedRelationship_3_0= rulePackageImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationBodyAccess().getOwnedRelationshipPackageImportParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_50);
                    	    lv_ownedRelationship_3_0=rulePackageImport();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssociationBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedRelationship",
                    	    								lv_ownedRelationship_3_0,
                    	    								"org.omg.sysml.Alf.PackageImport");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssociationBodyAccess().getRightCurlyBracketKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociationBody"


    // $ANTLR start "entryRuleAssociationMember"
    // InternalAlf.g:3242:1: entryRuleAssociationMember returns [EObject current=null] : iv_ruleAssociationMember= ruleAssociationMember EOF ;
    public final EObject entryRuleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationMember = null;


        try {
            // InternalAlf.g:3242:58: (iv_ruleAssociationMember= ruleAssociationMember EOF )
            // InternalAlf.g:3243:2: iv_ruleAssociationMember= ruleAssociationMember EOF
            {
             newCompositeNode(grammarAccess.getAssociationMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationMember=ruleAssociationMember();

            state._fsp--;

             current =iv_ruleAssociationMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociationMember"


    // $ANTLR start "ruleAssociationMember"
    // InternalAlf.g:3249:1: ruleAssociationMember returns [EObject current=null] : (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureMember_1= ruleFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember ) ;
    public final EObject ruleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureCategoryMember_0 = null;

        EObject this_FeatureMember_1 = null;

        EObject this_AssociationEndFeatureMember_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:3255:2: ( (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureMember_1= ruleFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember ) )
            // InternalAlf.g:3256:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureMember_1= ruleFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )
            {
            // InternalAlf.g:3256:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureMember_1= ruleFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )
            int alt56=3;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // InternalAlf.g:3257:3: this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember
                    {

                    			newCompositeNode(grammarAccess.getAssociationMemberAccess().getNonFeatureCategoryMemberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonFeatureCategoryMember_0=ruleNonFeatureCategoryMember();

                    state._fsp--;


                    			current = this_NonFeatureCategoryMember_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3266:3: this_FeatureMember_1= ruleFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getAssociationMemberAccess().getFeatureMemberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureMember_1=ruleFeatureMember();

                    state._fsp--;


                    			current = this_FeatureMember_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:3275:3: this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getAssociationMemberAccess().getAssociationEndFeatureMemberParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssociationEndFeatureMember_2=ruleAssociationEndFeatureMember();

                    state._fsp--;


                    			current = this_AssociationEndFeatureMember_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociationMember"


    // $ANTLR start "entryRuleAssociationEndFeatureMember"
    // InternalAlf.g:3287:1: entryRuleAssociationEndFeatureMember returns [EObject current=null] : iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF ;
    public final EObject entryRuleAssociationEndFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEndFeatureMember = null;


        try {
            // InternalAlf.g:3287:68: (iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF )
            // InternalAlf.g:3288:2: iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF
            {
             newCompositeNode(grammarAccess.getAssociationEndFeatureMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationEndFeatureMember=ruleAssociationEndFeatureMember();

            state._fsp--;

             current =iv_ruleAssociationEndFeatureMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociationEndFeatureMember"


    // $ANTLR start "ruleAssociationEndFeatureMember"
    // InternalAlf.g:3294:1: ruleAssociationEndFeatureMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'abstract' otherlv_7= 'end' ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )? ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_12= 'end' ( (lv_isPart_13_0= 'part' ) ) ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | ( ( (lv_direction_18_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_20= 'abstract' ( (lv_direction_21_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_23_0= ruleName ) ) otherlv_24= 'is' ( ( ruleQualifiedName ) ) otherlv_26= ';' ) ) ) ;
    public final EObject ruleAssociationEndFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isPart_2_0=null;
        Token lv_isPort_3_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_isPart_8_0=null;
        Token lv_isPort_9_0=null;
        Token otherlv_12=null;
        Token lv_isPart_13_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        EObject this_CategoryMemberPrefix_0 = null;

        Enumerator lv_direction_4_0 = null;

        EObject lv_ownedRelatedElement_5_0 = null;

        Enumerator lv_direction_10_0 = null;

        EObject lv_ownedRelatedElement_11_0 = null;

        AntlrDatatypeRuleToken lv_memberName_14_0 = null;

        Enumerator lv_direction_18_0 = null;

        EObject lv_ownedRelatedElement_19_0 = null;

        Enumerator lv_direction_21_0 = null;

        EObject lv_ownedRelatedElement_22_0 = null;

        AntlrDatatypeRuleToken lv_memberName_23_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3300:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'abstract' otherlv_7= 'end' ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )? ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_12= 'end' ( (lv_isPart_13_0= 'part' ) ) ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | ( ( (lv_direction_18_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_20= 'abstract' ( (lv_direction_21_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_23_0= ruleName ) ) otherlv_24= 'is' ( ( ruleQualifiedName ) ) otherlv_26= ';' ) ) ) )
            // InternalAlf.g:3301:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'abstract' otherlv_7= 'end' ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )? ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_12= 'end' ( (lv_isPart_13_0= 'part' ) ) ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | ( ( (lv_direction_18_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_20= 'abstract' ( (lv_direction_21_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_23_0= ruleName ) ) otherlv_24= 'is' ( ( ruleQualifiedName ) ) otherlv_26= ';' ) ) )
            {
            // InternalAlf.g:3301:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'abstract' otherlv_7= 'end' ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )? ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_12= 'end' ( (lv_isPart_13_0= 'part' ) ) ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | ( ( (lv_direction_18_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_20= 'abstract' ( (lv_direction_21_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_23_0= ruleName ) ) otherlv_24= 'is' ( ( ruleQualifiedName ) ) otherlv_26= ';' ) ) )
            // InternalAlf.g:3302:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'abstract' otherlv_7= 'end' ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )? ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_12= 'end' ( (lv_isPart_13_0= 'part' ) ) ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | ( ( (lv_direction_18_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_20= 'abstract' ( (lv_direction_21_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_23_0= ruleName ) ) otherlv_24= 'is' ( ( ruleQualifiedName ) ) otherlv_26= ';' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getCategoryMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_51);
            this_CategoryMemberPrefix_0=ruleCategoryMemberPrefix(current);

            state._fsp--;


            			current = this_CategoryMemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3313:3: ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'abstract' otherlv_7= 'end' ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )? ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_12= 'end' ( (lv_isPart_13_0= 'part' ) ) ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | ( ( (lv_direction_18_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_20= 'abstract' ( (lv_direction_21_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_23_0= ruleName ) ) otherlv_24= 'is' ( ( ruleQualifiedName ) ) otherlv_26= ';' ) )
            int alt64=6;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // InternalAlf.g:3314:4: (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:3314:4: (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) )
                    // InternalAlf.g:3315:5: otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) )
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_52); 

                    					newLeafNode(otherlv_1, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_1_0_0());
                    				
                    // InternalAlf.g:3319:5: ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )?
                    int alt57=3;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==34) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==35) ) {
                        alt57=2;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalAlf.g:3320:6: ( (lv_isPart_2_0= 'part' ) )
                            {
                            // InternalAlf.g:3320:6: ( (lv_isPart_2_0= 'part' ) )
                            // InternalAlf.g:3321:7: (lv_isPart_2_0= 'part' )
                            {
                            // InternalAlf.g:3321:7: (lv_isPart_2_0= 'part' )
                            // InternalAlf.g:3322:8: lv_isPart_2_0= 'part'
                            {
                            lv_isPart_2_0=(Token)match(input,34,FOLLOW_39); 

                            								newLeafNode(lv_isPart_2_0, grammarAccess.getAssociationEndFeatureMemberAccess().getIsPartPartKeyword_1_0_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPart", true, "part");
                            							

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:3335:6: ( (lv_isPort_3_0= 'port' ) )
                            {
                            // InternalAlf.g:3335:6: ( (lv_isPort_3_0= 'port' ) )
                            // InternalAlf.g:3336:7: (lv_isPort_3_0= 'port' )
                            {
                            // InternalAlf.g:3336:7: (lv_isPort_3_0= 'port' )
                            // InternalAlf.g:3337:8: lv_isPort_3_0= 'port'
                            {
                            lv_isPort_3_0=(Token)match(input,35,FOLLOW_39); 

                            								newLeafNode(lv_isPort_3_0, grammarAccess.getAssociationEndFeatureMemberAccess().getIsPortPortKeyword_1_0_1_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPort", true, "port");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:3350:5: ( (lv_direction_4_0= ruleFeatureDirection ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( ((LA58_0>=82 && LA58_0<=84)) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalAlf.g:3351:6: (lv_direction_4_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:3351:6: (lv_direction_4_0= ruleFeatureDirection )
                            // InternalAlf.g:3352:7: lv_direction_4_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_0_2_0());
                            						
                            pushFollow(FOLLOW_53);
                            lv_direction_4_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_4_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:3369:5: ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) )
                    // InternalAlf.g:3370:6: (lv_ownedRelatedElement_5_0= ruleFeatureDefinition )
                    {
                    // InternalAlf.g:3370:6: (lv_ownedRelatedElement_5_0= ruleFeatureDefinition )
                    // InternalAlf.g:3371:7: lv_ownedRelatedElement_5_0= ruleFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getOwnedRelatedElementFeatureDefinitionParserRuleCall_1_0_3_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedRelatedElement_5_0=ruleFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    							add(
                    								current,
                    								"ownedRelatedElement",
                    								lv_ownedRelatedElement_5_0,
                    								"org.omg.sysml.Alf.FeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:3390:4: (otherlv_6= 'abstract' otherlv_7= 'end' ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )? ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:3390:4: (otherlv_6= 'abstract' otherlv_7= 'end' ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )? ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) ) )
                    // InternalAlf.g:3391:5: otherlv_6= 'abstract' otherlv_7= 'end' ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )? ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_54); 

                    					newLeafNode(otherlv_6, grammarAccess.getAssociationEndFeatureMemberAccess().getAbstractKeyword_1_1_0());
                    				
                    otherlv_7=(Token)match(input,39,FOLLOW_52); 

                    					newLeafNode(otherlv_7, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_1_1_1());
                    				
                    // InternalAlf.g:3399:5: ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )?
                    int alt59=3;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==34) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==35) ) {
                        alt59=2;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalAlf.g:3400:6: ( (lv_isPart_8_0= 'part' ) )
                            {
                            // InternalAlf.g:3400:6: ( (lv_isPart_8_0= 'part' ) )
                            // InternalAlf.g:3401:7: (lv_isPart_8_0= 'part' )
                            {
                            // InternalAlf.g:3401:7: (lv_isPart_8_0= 'part' )
                            // InternalAlf.g:3402:8: lv_isPart_8_0= 'part'
                            {
                            lv_isPart_8_0=(Token)match(input,34,FOLLOW_39); 

                            								newLeafNode(lv_isPart_8_0, grammarAccess.getAssociationEndFeatureMemberAccess().getIsPartPartKeyword_1_1_2_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPart", true, "part");
                            							

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:3415:6: ( (lv_isPort_9_0= 'port' ) )
                            {
                            // InternalAlf.g:3415:6: ( (lv_isPort_9_0= 'port' ) )
                            // InternalAlf.g:3416:7: (lv_isPort_9_0= 'port' )
                            {
                            // InternalAlf.g:3416:7: (lv_isPort_9_0= 'port' )
                            // InternalAlf.g:3417:8: lv_isPort_9_0= 'port'
                            {
                            lv_isPort_9_0=(Token)match(input,35,FOLLOW_39); 

                            								newLeafNode(lv_isPort_9_0, grammarAccess.getAssociationEndFeatureMemberAccess().getIsPortPortKeyword_1_1_2_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPort", true, "port");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:3430:5: ( (lv_direction_10_0= ruleFeatureDirection ) )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( ((LA60_0>=82 && LA60_0<=84)) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalAlf.g:3431:6: (lv_direction_10_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:3431:6: (lv_direction_10_0= ruleFeatureDirection )
                            // InternalAlf.g:3432:7: lv_direction_10_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_1_3_0());
                            						
                            pushFollow(FOLLOW_39);
                            lv_direction_10_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_10_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:3449:5: ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) )
                    // InternalAlf.g:3450:6: (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition )
                    {
                    // InternalAlf.g:3450:6: (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition )
                    // InternalAlf.g:3451:7: lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getOwnedRelatedElementAbstractFeatureDefinitionParserRuleCall_1_1_4_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedRelatedElement_11_0=ruleAbstractFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    							add(
                    								current,
                    								"ownedRelatedElement",
                    								lv_ownedRelatedElement_11_0,
                    								"org.omg.sysml.Alf.AbstractFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:3470:4: (otherlv_12= 'end' ( (lv_isPart_13_0= 'part' ) ) ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    {
                    // InternalAlf.g:3470:4: (otherlv_12= 'end' ( (lv_isPart_13_0= 'part' ) ) ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    // InternalAlf.g:3471:5: otherlv_12= 'end' ( (lv_isPart_13_0= 'part' ) ) ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';'
                    {
                    otherlv_12=(Token)match(input,39,FOLLOW_55); 

                    					newLeafNode(otherlv_12, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_1_2_0());
                    				
                    // InternalAlf.g:3475:5: ( (lv_isPart_13_0= 'part' ) )
                    // InternalAlf.g:3476:6: (lv_isPart_13_0= 'part' )
                    {
                    // InternalAlf.g:3476:6: (lv_isPart_13_0= 'part' )
                    // InternalAlf.g:3477:7: lv_isPart_13_0= 'part'
                    {
                    lv_isPart_13_0=(Token)match(input,34,FOLLOW_26); 

                    							newLeafNode(lv_isPart_13_0, grammarAccess.getAssociationEndFeatureMemberAccess().getIsPartPartKeyword_1_2_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    							setWithLastConsumed(current, "isPart", true, "part");
                    						

                    }


                    }

                    // InternalAlf.g:3489:5: ( (lv_memberName_14_0= ruleName ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalAlf.g:3490:6: (lv_memberName_14_0= ruleName )
                            {
                            // InternalAlf.g:3490:6: (lv_memberName_14_0= ruleName )
                            // InternalAlf.g:3491:7: lv_memberName_14_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_2_0());
                            						
                            pushFollow(FOLLOW_27);
                            lv_memberName_14_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"memberName",
                            								lv_memberName_14_0,
                            								"org.omg.sysml.Alf.Name");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,25,FOLLOW_15); 

                    					newLeafNode(otherlv_15, grammarAccess.getAssociationEndFeatureMemberAccess().getIsKeyword_1_2_3());
                    				
                    // InternalAlf.g:3512:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:3513:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:3513:6: ( ruleQualifiedName )
                    // InternalAlf.g:3514:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberFeatureFeatureCrossReference_1_2_4_0());
                    						
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_17=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(otherlv_17, grammarAccess.getAssociationEndFeatureMemberAccess().getSemicolonKeyword_1_2_5());
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:3534:4: ( ( (lv_direction_18_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:3534:4: ( ( (lv_direction_18_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:3535:5: ( (lv_direction_18_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:3535:5: ( (lv_direction_18_0= ruleFeatureDirection ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( ((LA62_0>=82 && LA62_0<=84)) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalAlf.g:3536:6: (lv_direction_18_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:3536:6: (lv_direction_18_0= ruleFeatureDirection )
                            // InternalAlf.g:3537:7: lv_direction_18_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_3_0_0());
                            						
                            pushFollow(FOLLOW_28);
                            lv_direction_18_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_18_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:3554:5: ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:3555:6: (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:3555:6: (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:3556:7: lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getOwnedRelatedElementNamedFeatureDefinitionParserRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedRelatedElement_19_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    							add(
                    								current,
                    								"ownedRelatedElement",
                    								lv_ownedRelatedElement_19_0,
                    								"org.omg.sysml.Alf.NamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAlf.g:3575:4: (otherlv_20= 'abstract' ( (lv_direction_21_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:3575:4: (otherlv_20= 'abstract' ( (lv_direction_21_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) ) )
                    // InternalAlf.g:3576:5: otherlv_20= 'abstract' ( (lv_direction_21_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) )
                    {
                    otherlv_20=(Token)match(input,33,FOLLOW_34); 

                    					newLeafNode(otherlv_20, grammarAccess.getAssociationEndFeatureMemberAccess().getAbstractKeyword_1_4_0());
                    				
                    // InternalAlf.g:3580:5: ( (lv_direction_21_0= ruleFeatureDirection ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( ((LA63_0>=82 && LA63_0<=84)) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalAlf.g:3581:6: (lv_direction_21_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:3581:6: (lv_direction_21_0= ruleFeatureDirection )
                            // InternalAlf.g:3582:7: lv_direction_21_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_4_1_0());
                            						
                            pushFollow(FOLLOW_28);
                            lv_direction_21_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_21_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:3599:5: ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) )
                    // InternalAlf.g:3600:6: (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition )
                    {
                    // InternalAlf.g:3600:6: (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition )
                    // InternalAlf.g:3601:7: lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getOwnedRelatedElementAbstractNamedFeatureDefinitionParserRuleCall_1_4_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedRelatedElement_22_0=ruleAbstractNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    							add(
                    								current,
                    								"ownedRelatedElement",
                    								lv_ownedRelatedElement_22_0,
                    								"org.omg.sysml.Alf.AbstractNamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAlf.g:3620:4: ( ( (lv_memberName_23_0= ruleName ) ) otherlv_24= 'is' ( ( ruleQualifiedName ) ) otherlv_26= ';' )
                    {
                    // InternalAlf.g:3620:4: ( ( (lv_memberName_23_0= ruleName ) ) otherlv_24= 'is' ( ( ruleQualifiedName ) ) otherlv_26= ';' )
                    // InternalAlf.g:3621:5: ( (lv_memberName_23_0= ruleName ) ) otherlv_24= 'is' ( ( ruleQualifiedName ) ) otherlv_26= ';'
                    {
                    // InternalAlf.g:3621:5: ( (lv_memberName_23_0= ruleName ) )
                    // InternalAlf.g:3622:6: (lv_memberName_23_0= ruleName )
                    {
                    // InternalAlf.g:3622:6: (lv_memberName_23_0= ruleName )
                    // InternalAlf.g:3623:7: lv_memberName_23_0= ruleName
                    {

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberNameNameParserRuleCall_1_5_0_0());
                    						
                    pushFollow(FOLLOW_27);
                    lv_memberName_23_0=ruleName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"memberName",
                    								lv_memberName_23_0,
                    								"org.omg.sysml.Alf.Name");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_24=(Token)match(input,25,FOLLOW_15); 

                    					newLeafNode(otherlv_24, grammarAccess.getAssociationEndFeatureMemberAccess().getIsKeyword_1_5_1());
                    				
                    // InternalAlf.g:3644:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:3645:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:3645:6: ( ruleQualifiedName )
                    // InternalAlf.g:3646:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberFeatureFeatureCrossReference_1_5_2_0());
                    						
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_26=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(otherlv_26, grammarAccess.getAssociationEndFeatureMemberAccess().getSemicolonKeyword_1_5_3());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociationEndFeatureMember"


    // $ANTLR start "entryRuleBehaviorDefinitionOrStub"
    // InternalAlf.g:3670:1: entryRuleBehaviorDefinitionOrStub returns [EObject current=null] : iv_ruleBehaviorDefinitionOrStub= ruleBehaviorDefinitionOrStub EOF ;
    public final EObject entryRuleBehaviorDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorDefinitionOrStub = null;


        try {
            // InternalAlf.g:3670:65: (iv_ruleBehaviorDefinitionOrStub= ruleBehaviorDefinitionOrStub EOF )
            // InternalAlf.g:3671:2: iv_ruleBehaviorDefinitionOrStub= ruleBehaviorDefinitionOrStub EOF
            {
             newCompositeNode(grammarAccess.getBehaviorDefinitionOrStubRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorDefinitionOrStub=ruleBehaviorDefinitionOrStub();

            state._fsp--;

             current =iv_ruleBehaviorDefinitionOrStub; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviorDefinitionOrStub"


    // $ANTLR start "ruleBehaviorDefinitionOrStub"
    // InternalAlf.g:3677:1: ruleBehaviorDefinitionOrStub returns [EObject current=null] : this_BehaviorDefinition_0= ruleBehaviorDefinition[$current] ;
    public final EObject ruleBehaviorDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_BehaviorDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3683:2: (this_BehaviorDefinition_0= ruleBehaviorDefinition[$current] )
            // InternalAlf.g:3684:2: this_BehaviorDefinition_0= ruleBehaviorDefinition[$current]
            {

            		if (current==null) {
            			current = createModelElement(grammarAccess.getBehaviorDefinitionOrStubRule());
            		}
            		newCompositeNode(grammarAccess.getBehaviorDefinitionOrStubAccess().getBehaviorDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BehaviorDefinition_0=ruleBehaviorDefinition(current);

            state._fsp--;


            		current = this_BehaviorDefinition_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviorDefinitionOrStub"


    // $ANTLR start "ruleBehaviorDefinition"
    // InternalAlf.g:3699:1: ruleBehaviorDefinition[EObject in_current] returns [EObject current=in_current] : (this_BehaviorDeclaration_0= ruleBehaviorDeclaration[$current] this_BehaviorBody_1= ruleBehaviorBody[$current] ) ;
    public final EObject ruleBehaviorDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_BehaviorDeclaration_0 = null;

        EObject this_BehaviorBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:3705:2: ( (this_BehaviorDeclaration_0= ruleBehaviorDeclaration[$current] this_BehaviorBody_1= ruleBehaviorBody[$current] ) )
            // InternalAlf.g:3706:2: (this_BehaviorDeclaration_0= ruleBehaviorDeclaration[$current] this_BehaviorBody_1= ruleBehaviorBody[$current] )
            {
            // InternalAlf.g:3706:2: (this_BehaviorDeclaration_0= ruleBehaviorDeclaration[$current] this_BehaviorBody_1= ruleBehaviorBody[$current] )
            // InternalAlf.g:3707:3: this_BehaviorDeclaration_0= ruleBehaviorDeclaration[$current] this_BehaviorBody_1= ruleBehaviorBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getBehaviorDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getBehaviorDefinitionAccess().getBehaviorDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_BehaviorDeclaration_0=ruleBehaviorDeclaration(current);

            state._fsp--;


            			current = this_BehaviorDeclaration_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getBehaviorDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getBehaviorDefinitionAccess().getBehaviorBodyParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_BehaviorBody_1=ruleBehaviorBody(current);

            state._fsp--;


            			current = this_BehaviorBody_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviorDefinition"


    // $ANTLR start "ruleBehaviorDeclaration"
    // InternalAlf.g:3734:1: ruleBehaviorDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'behavior' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] (this_SpecializationList_4= ruleSpecializationList[$current] )? ) ;
    public final EObject ruleBehaviorDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject this_ParameterList_3 = null;

        EObject this_SpecializationList_4 = null;



        	enterRule();

        try {
            // InternalAlf.g:3740:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'behavior' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] (this_SpecializationList_4= ruleSpecializationList[$current] )? ) )
            // InternalAlf.g:3741:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'behavior' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] (this_SpecializationList_4= ruleSpecializationList[$current] )? )
            {
            // InternalAlf.g:3741:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'behavior' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] (this_SpecializationList_4= ruleSpecializationList[$current] )? )
            // InternalAlf.g:3742:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'behavior' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] (this_SpecializationList_4= ruleSpecializationList[$current] )?
            {
            // InternalAlf.g:3742:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==33) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalAlf.g:3743:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:3743:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:3744:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,33,FOLLOW_56); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getBehaviorDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBehaviorDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviorDeclarationAccess().getBehaviorKeyword_1());
            		
            // InternalAlf.g:3760:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:3761:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:3761:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:3762:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getBehaviorDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_57);
            lv_name_2_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviorDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getBehaviorDeclarationRule());
            			}
            			newCompositeNode(grammarAccess.getBehaviorDeclarationAccess().getParameterListParserRuleCall_3());
            		
            pushFollow(FOLLOW_45);
            this_ParameterList_3=ruleParameterList(current);

            state._fsp--;


            			current = this_ParameterList_3;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3790:3: (this_SpecializationList_4= ruleSpecializationList[$current] )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==37) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalAlf.g:3791:4: this_SpecializationList_4= ruleSpecializationList[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getBehaviorDeclarationRule());
                    				}
                    				newCompositeNode(grammarAccess.getBehaviorDeclarationAccess().getSpecializationListParserRuleCall_4());
                    			
                    pushFollow(FOLLOW_2);
                    this_SpecializationList_4=ruleSpecializationList(current);

                    state._fsp--;


                    				current = this_SpecializationList_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviorDeclaration"


    // $ANTLR start "ruleParameterList"
    // InternalAlf.g:3808:1: ruleParameterList[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '(' ( ( (lv_ownedRelationship_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleParameterMember ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleParameterList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject lv_ownedRelationship_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3814:2: ( (otherlv_0= '(' ( ( (lv_ownedRelationship_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleParameterMember ) ) )* )? otherlv_4= ')' ) )
            // InternalAlf.g:3815:2: (otherlv_0= '(' ( ( (lv_ownedRelationship_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleParameterMember ) ) )* )? otherlv_4= ')' )
            {
            // InternalAlf.g:3815:2: (otherlv_0= '(' ( ( (lv_ownedRelationship_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleParameterMember ) ) )* )? otherlv_4= ')' )
            // InternalAlf.g:3816:3: otherlv_0= '(' ( ( (lv_ownedRelationship_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleParameterMember ) ) )* )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_58); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_0());
            		
            // InternalAlf.g:3820:3: ( ( (lv_ownedRelationship_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleParameterMember ) ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=RULE_ID && LA68_0<=RULE_UNRESTRICTED_NAME)||(LA68_0>=82 && LA68_0<=84)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalAlf.g:3821:4: ( (lv_ownedRelationship_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleParameterMember ) ) )*
                    {
                    // InternalAlf.g:3821:4: ( (lv_ownedRelationship_1_0= ruleParameterMember ) )
                    // InternalAlf.g:3822:5: (lv_ownedRelationship_1_0= ruleParameterMember )
                    {
                    // InternalAlf.g:3822:5: (lv_ownedRelationship_1_0= ruleParameterMember )
                    // InternalAlf.g:3823:6: lv_ownedRelationship_1_0= ruleParameterMember
                    {

                    						newCompositeNode(grammarAccess.getParameterListAccess().getOwnedRelationshipParameterMemberParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_ownedRelationship_1_0=ruleParameterMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterListRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelationship",
                    							lv_ownedRelationship_1_0,
                    							"org.omg.sysml.Alf.ParameterMember");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:3840:4: (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleParameterMember ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==38) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalAlf.g:3841:5: otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleParameterMember ) )
                    	    {
                    	    otherlv_2=(Token)match(input,38,FOLLOW_60); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getParameterListAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalAlf.g:3845:5: ( (lv_ownedRelationship_3_0= ruleParameterMember ) )
                    	    // InternalAlf.g:3846:6: (lv_ownedRelationship_3_0= ruleParameterMember )
                    	    {
                    	    // InternalAlf.g:3846:6: (lv_ownedRelationship_3_0= ruleParameterMember )
                    	    // InternalAlf.g:3847:7: lv_ownedRelationship_3_0= ruleParameterMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterListAccess().getOwnedRelationshipParameterMemberParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_59);
                    	    lv_ownedRelationship_3_0=ruleParameterMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterListRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedRelationship",
                    	    								lv_ownedRelationship_3_0,
                    	    								"org.omg.sysml.Alf.ParameterMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterListAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "ruleBehaviorBody"
    // InternalAlf.g:3875:1: ruleBehaviorBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) ;
    public final EObject ruleBehaviorBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_ownedRelationship_2_0 = null;

        EObject lv_ownedRelationship_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3881:2: ( (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) )
            // InternalAlf.g:3882:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            {
            // InternalAlf.g:3882:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==20) ) {
                alt70=1;
            }
            else if ( (LA70_0==23) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalAlf.g:3883:3: otherlv_0= ';'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getBehaviorBodyAccess().getSemicolonKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3888:3: (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    {
                    // InternalAlf.g:3888:3: (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    // InternalAlf.g:3889:4: otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_61); 

                    				newLeafNode(otherlv_1, grammarAccess.getBehaviorBodyAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalAlf.g:3893:4: ( ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )*
                    loop69:
                    do {
                        int alt69=3;
                        alt69 = dfa69.predict(input);
                        switch (alt69) {
                    	case 1 :
                    	    // InternalAlf.g:3894:5: ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) )
                    	    {
                    	    // InternalAlf.g:3894:5: ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) )
                    	    // InternalAlf.g:3895:6: (lv_ownedRelationship_2_0= ruleBehaviorMember )
                    	    {
                    	    // InternalAlf.g:3895:6: (lv_ownedRelationship_2_0= ruleBehaviorMember )
                    	    // InternalAlf.g:3896:7: lv_ownedRelationship_2_0= ruleBehaviorMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviorBodyAccess().getOwnedRelationshipBehaviorMemberParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_61);
                    	    lv_ownedRelationship_2_0=ruleBehaviorMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviorBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedRelationship",
                    	    								lv_ownedRelationship_2_0,
                    	    								"org.omg.sysml.Alf.BehaviorMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAlf.g:3914:5: ( (lv_ownedRelationship_3_0= rulePackageImport ) )
                    	    {
                    	    // InternalAlf.g:3914:5: ( (lv_ownedRelationship_3_0= rulePackageImport ) )
                    	    // InternalAlf.g:3915:6: (lv_ownedRelationship_3_0= rulePackageImport )
                    	    {
                    	    // InternalAlf.g:3915:6: (lv_ownedRelationship_3_0= rulePackageImport )
                    	    // InternalAlf.g:3916:7: lv_ownedRelationship_3_0= rulePackageImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviorBodyAccess().getOwnedRelationshipPackageImportParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_61);
                    	    lv_ownedRelationship_3_0=rulePackageImport();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviorBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedRelationship",
                    	    								lv_ownedRelationship_3_0,
                    	    								"org.omg.sysml.Alf.PackageImport");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getBehaviorBodyAccess().getRightCurlyBracketKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviorBody"


    // $ANTLR start "entryRuleParameterMember"
    // InternalAlf.g:3943:1: entryRuleParameterMember returns [EObject current=null] : iv_ruleParameterMember= ruleParameterMember EOF ;
    public final EObject entryRuleParameterMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterMember = null;


        try {
            // InternalAlf.g:3943:56: (iv_ruleParameterMember= ruleParameterMember EOF )
            // InternalAlf.g:3944:2: iv_ruleParameterMember= ruleParameterMember EOF
            {
             newCompositeNode(grammarAccess.getParameterMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterMember=ruleParameterMember();

            state._fsp--;

             current =iv_ruleParameterMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterMember"


    // $ANTLR start "ruleParameterMember"
    // InternalAlf.g:3950:1: ruleParameterMember returns [EObject current=null] : ( ( (lv_direction_0_0= ruleFeatureDirection ) )? ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleParameterDefinition ) ) ) ;
    public final EObject ruleParameterMember() throws RecognitionException {
        EObject current = null;

        Enumerator lv_direction_0_0 = null;

        AntlrDatatypeRuleToken lv_memberName_1_0 = null;

        EObject lv_ownedRelatedElement_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3956:2: ( ( ( (lv_direction_0_0= ruleFeatureDirection ) )? ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleParameterDefinition ) ) ) )
            // InternalAlf.g:3957:2: ( ( (lv_direction_0_0= ruleFeatureDirection ) )? ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleParameterDefinition ) ) )
            {
            // InternalAlf.g:3957:2: ( ( (lv_direction_0_0= ruleFeatureDirection ) )? ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleParameterDefinition ) ) )
            // InternalAlf.g:3958:3: ( (lv_direction_0_0= ruleFeatureDirection ) )? ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleParameterDefinition ) )
            {
            // InternalAlf.g:3958:3: ( (lv_direction_0_0= ruleFeatureDirection ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=82 && LA71_0<=84)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalAlf.g:3959:4: (lv_direction_0_0= ruleFeatureDirection )
                    {
                    // InternalAlf.g:3959:4: (lv_direction_0_0= ruleFeatureDirection )
                    // InternalAlf.g:3960:5: lv_direction_0_0= ruleFeatureDirection
                    {

                    					newCompositeNode(grammarAccess.getParameterMemberAccess().getDirectionFeatureDirectionEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_direction_0_0=ruleFeatureDirection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameterMemberRule());
                    					}
                    					set(
                    						current,
                    						"direction",
                    						lv_direction_0_0,
                    						"org.omg.sysml.Alf.FeatureDirection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:3977:3: ( (lv_memberName_1_0= ruleName ) )
            // InternalAlf.g:3978:4: (lv_memberName_1_0= ruleName )
            {
            // InternalAlf.g:3978:4: (lv_memberName_1_0= ruleName )
            // InternalAlf.g:3979:5: lv_memberName_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getParameterMemberAccess().getMemberNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_62);
            lv_memberName_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterMemberRule());
            					}
            					set(
            						current,
            						"memberName",
            						lv_memberName_1_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:3996:3: ( (lv_ownedRelatedElement_2_0= ruleParameterDefinition ) )
            // InternalAlf.g:3997:4: (lv_ownedRelatedElement_2_0= ruleParameterDefinition )
            {
            // InternalAlf.g:3997:4: (lv_ownedRelatedElement_2_0= ruleParameterDefinition )
            // InternalAlf.g:3998:5: lv_ownedRelatedElement_2_0= ruleParameterDefinition
            {

            					newCompositeNode(grammarAccess.getParameterMemberAccess().getOwnedRelatedElementParameterDefinitionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_2_0=ruleParameterDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterMemberRule());
            					}
            					add(
            						current,
            						"ownedRelatedElement",
            						lv_ownedRelatedElement_2_0,
            						"org.omg.sysml.Alf.ParameterDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterMember"


    // $ANTLR start "entryRuleBehaviorMember"
    // InternalAlf.g:4019:1: entryRuleBehaviorMember returns [EObject current=null] : iv_ruleBehaviorMember= ruleBehaviorMember EOF ;
    public final EObject entryRuleBehaviorMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorMember = null;


        try {
            // InternalAlf.g:4019:55: (iv_ruleBehaviorMember= ruleBehaviorMember EOF )
            // InternalAlf.g:4020:2: iv_ruleBehaviorMember= ruleBehaviorMember EOF
            {
             newCompositeNode(grammarAccess.getBehaviorMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorMember=ruleBehaviorMember();

            state._fsp--;

             current =iv_ruleBehaviorMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviorMember"


    // $ANTLR start "ruleBehaviorMember"
    // InternalAlf.g:4026:1: ruleBehaviorMember returns [EObject current=null] : (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureMember_1= ruleFeatureMember | this_BehaviorStepMember_2= ruleBehaviorStepMember ) ;
    public final EObject ruleBehaviorMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureCategoryMember_0 = null;

        EObject this_FeatureMember_1 = null;

        EObject this_BehaviorStepMember_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4032:2: ( (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureMember_1= ruleFeatureMember | this_BehaviorStepMember_2= ruleBehaviorStepMember ) )
            // InternalAlf.g:4033:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureMember_1= ruleFeatureMember | this_BehaviorStepMember_2= ruleBehaviorStepMember )
            {
            // InternalAlf.g:4033:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureMember_1= ruleFeatureMember | this_BehaviorStepMember_2= ruleBehaviorStepMember )
            int alt72=3;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // InternalAlf.g:4034:3: this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember
                    {

                    			newCompositeNode(grammarAccess.getBehaviorMemberAccess().getNonFeatureCategoryMemberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonFeatureCategoryMember_0=ruleNonFeatureCategoryMember();

                    state._fsp--;


                    			current = this_NonFeatureCategoryMember_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:4043:3: this_FeatureMember_1= ruleFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getBehaviorMemberAccess().getFeatureMemberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureMember_1=ruleFeatureMember();

                    state._fsp--;


                    			current = this_FeatureMember_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:4052:3: this_BehaviorStepMember_2= ruleBehaviorStepMember
                    {

                    			newCompositeNode(grammarAccess.getBehaviorMemberAccess().getBehaviorStepMemberParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BehaviorStepMember_2=ruleBehaviorStepMember();

                    state._fsp--;


                    			current = this_BehaviorStepMember_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviorMember"


    // $ANTLR start "entryRuleBehaviorStepMember"
    // InternalAlf.g:4064:1: entryRuleBehaviorStepMember returns [EObject current=null] : iv_ruleBehaviorStepMember= ruleBehaviorStepMember EOF ;
    public final EObject entryRuleBehaviorStepMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorStepMember = null;


        try {
            // InternalAlf.g:4064:59: (iv_ruleBehaviorStepMember= ruleBehaviorStepMember EOF )
            // InternalAlf.g:4065:2: iv_ruleBehaviorStepMember= ruleBehaviorStepMember EOF
            {
             newCompositeNode(grammarAccess.getBehaviorStepMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorStepMember=ruleBehaviorStepMember();

            state._fsp--;

             current =iv_ruleBehaviorStepMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviorStepMember"


    // $ANTLR start "ruleBehaviorStepMember"
    // InternalAlf.g:4071:1: ruleBehaviorStepMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( ( ( (lv_ownedRelatedElement_1_1= ruleStepDefinition | lv_ownedRelatedElement_1_2= ruleExpressionDefinition ) ) ) | (otherlv_2= 'step' ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) | (otherlv_7= 'expr' ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) ) ;
    public final EObject ruleBehaviorStepMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_CategoryMemberPrefix_0 = null;

        EObject lv_ownedRelatedElement_1_1 = null;

        EObject lv_ownedRelatedElement_1_2 = null;

        AntlrDatatypeRuleToken lv_memberName_3_0 = null;

        AntlrDatatypeRuleToken lv_memberName_8_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4077:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( ( ( (lv_ownedRelatedElement_1_1= ruleStepDefinition | lv_ownedRelatedElement_1_2= ruleExpressionDefinition ) ) ) | (otherlv_2= 'step' ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) | (otherlv_7= 'expr' ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) ) )
            // InternalAlf.g:4078:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( ( ( (lv_ownedRelatedElement_1_1= ruleStepDefinition | lv_ownedRelatedElement_1_2= ruleExpressionDefinition ) ) ) | (otherlv_2= 'step' ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) | (otherlv_7= 'expr' ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) )
            {
            // InternalAlf.g:4078:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( ( ( (lv_ownedRelatedElement_1_1= ruleStepDefinition | lv_ownedRelatedElement_1_2= ruleExpressionDefinition ) ) ) | (otherlv_2= 'step' ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) | (otherlv_7= 'expr' ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) )
            // InternalAlf.g:4079:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( ( ( (lv_ownedRelatedElement_1_1= ruleStepDefinition | lv_ownedRelatedElement_1_2= ruleExpressionDefinition ) ) ) | (otherlv_2= 'step' ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) | (otherlv_7= 'expr' ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getBehaviorStepMemberRule());
            			}
            			newCompositeNode(grammarAccess.getBehaviorStepMemberAccess().getCategoryMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_63);
            this_CategoryMemberPrefix_0=ruleCategoryMemberPrefix(current);

            state._fsp--;


            			current = this_CategoryMemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:4090:3: ( ( ( (lv_ownedRelatedElement_1_1= ruleStepDefinition | lv_ownedRelatedElement_1_2= ruleExpressionDefinition ) ) ) | (otherlv_2= 'step' ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) | (otherlv_7= 'expr' ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) )
            int alt76=3;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // InternalAlf.g:4091:4: ( ( (lv_ownedRelatedElement_1_1= ruleStepDefinition | lv_ownedRelatedElement_1_2= ruleExpressionDefinition ) ) )
                    {
                    // InternalAlf.g:4091:4: ( ( (lv_ownedRelatedElement_1_1= ruleStepDefinition | lv_ownedRelatedElement_1_2= ruleExpressionDefinition ) ) )
                    // InternalAlf.g:4092:5: ( (lv_ownedRelatedElement_1_1= ruleStepDefinition | lv_ownedRelatedElement_1_2= ruleExpressionDefinition ) )
                    {
                    // InternalAlf.g:4092:5: ( (lv_ownedRelatedElement_1_1= ruleStepDefinition | lv_ownedRelatedElement_1_2= ruleExpressionDefinition ) )
                    // InternalAlf.g:4093:6: (lv_ownedRelatedElement_1_1= ruleStepDefinition | lv_ownedRelatedElement_1_2= ruleExpressionDefinition )
                    {
                    // InternalAlf.g:4093:6: (lv_ownedRelatedElement_1_1= ruleStepDefinition | lv_ownedRelatedElement_1_2= ruleExpressionDefinition )
                    int alt73=2;
                    switch ( input.LA(1) ) {
                    case 33:
                        {
                        int LA73_1 = input.LA(2);

                        if ( (LA73_1==42) ) {
                            alt73=1;
                        }
                        else if ( (LA73_1==43) ) {
                            alt73=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 73, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 42:
                        {
                        alt73=1;
                        }
                        break;
                    case 43:
                        {
                        alt73=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }

                    switch (alt73) {
                        case 1 :
                            // InternalAlf.g:4094:7: lv_ownedRelatedElement_1_1= ruleStepDefinition
                            {

                            							newCompositeNode(grammarAccess.getBehaviorStepMemberAccess().getOwnedRelatedElementStepDefinitionParserRuleCall_1_0_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_ownedRelatedElement_1_1=ruleStepDefinition();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getBehaviorStepMemberRule());
                            							}
                            							add(
                            								current,
                            								"ownedRelatedElement",
                            								lv_ownedRelatedElement_1_1,
                            								"org.omg.sysml.Alf.StepDefinition");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:4110:7: lv_ownedRelatedElement_1_2= ruleExpressionDefinition
                            {

                            							newCompositeNode(grammarAccess.getBehaviorStepMemberAccess().getOwnedRelatedElementExpressionDefinitionParserRuleCall_1_0_0_1());
                            						
                            pushFollow(FOLLOW_2);
                            lv_ownedRelatedElement_1_2=ruleExpressionDefinition();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getBehaviorStepMemberRule());
                            							}
                            							add(
                            								current,
                            								"ownedRelatedElement",
                            								lv_ownedRelatedElement_1_2,
                            								"org.omg.sysml.Alf.ExpressionDefinition");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:4129:4: (otherlv_2= 'step' ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' )
                    {
                    // InternalAlf.g:4129:4: (otherlv_2= 'step' ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' )
                    // InternalAlf.g:4130:5: otherlv_2= 'step' ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';'
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_26); 

                    					newLeafNode(otherlv_2, grammarAccess.getBehaviorStepMemberAccess().getStepKeyword_1_1_0());
                    				
                    // InternalAlf.g:4134:5: ( (lv_memberName_3_0= ruleName ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( ((LA74_0>=RULE_ID && LA74_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalAlf.g:4135:6: (lv_memberName_3_0= ruleName )
                            {
                            // InternalAlf.g:4135:6: (lv_memberName_3_0= ruleName )
                            // InternalAlf.g:4136:7: lv_memberName_3_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getBehaviorStepMemberAccess().getMemberNameNameParserRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_27);
                            lv_memberName_3_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getBehaviorStepMemberRule());
                            							}
                            							set(
                            								current,
                            								"memberName",
                            								lv_memberName_3_0,
                            								"org.omg.sysml.Alf.Name");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_15); 

                    					newLeafNode(otherlv_4, grammarAccess.getBehaviorStepMemberAccess().getIsKeyword_1_1_2());
                    				
                    // InternalAlf.g:4157:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:4158:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:4158:6: ( ruleQualifiedName )
                    // InternalAlf.g:4159:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBehaviorStepMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getBehaviorStepMemberAccess().getMemberFeatureStepCrossReference_1_1_3_0());
                    						
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getBehaviorStepMemberAccess().getSemicolonKeyword_1_1_4());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:4179:4: (otherlv_7= 'expr' ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' )
                    {
                    // InternalAlf.g:4179:4: (otherlv_7= 'expr' ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' )
                    // InternalAlf.g:4180:5: otherlv_7= 'expr' ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';'
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_26); 

                    					newLeafNode(otherlv_7, grammarAccess.getBehaviorStepMemberAccess().getExprKeyword_1_2_0());
                    				
                    // InternalAlf.g:4184:5: ( (lv_memberName_8_0= ruleName ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( ((LA75_0>=RULE_ID && LA75_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalAlf.g:4185:6: (lv_memberName_8_0= ruleName )
                            {
                            // InternalAlf.g:4185:6: (lv_memberName_8_0= ruleName )
                            // InternalAlf.g:4186:7: lv_memberName_8_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getBehaviorStepMemberAccess().getMemberNameNameParserRuleCall_1_2_1_0());
                            						
                            pushFollow(FOLLOW_27);
                            lv_memberName_8_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getBehaviorStepMemberRule());
                            							}
                            							set(
                            								current,
                            								"memberName",
                            								lv_memberName_8_0,
                            								"org.omg.sysml.Alf.Name");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,25,FOLLOW_15); 

                    					newLeafNode(otherlv_9, grammarAccess.getBehaviorStepMemberAccess().getIsKeyword_1_2_2());
                    				
                    // InternalAlf.g:4207:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:4208:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:4208:6: ( ruleQualifiedName )
                    // InternalAlf.g:4209:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBehaviorStepMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getBehaviorStepMemberAccess().getMemberFeatureExpressionCrossReference_1_2_3_0());
                    						
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_11=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(otherlv_11, grammarAccess.getBehaviorStepMemberAccess().getSemicolonKeyword_1_2_4());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviorStepMember"


    // $ANTLR start "entryRuleFunctionDefinitionOrStub"
    // InternalAlf.g:4233:1: entryRuleFunctionDefinitionOrStub returns [EObject current=null] : iv_ruleFunctionDefinitionOrStub= ruleFunctionDefinitionOrStub EOF ;
    public final EObject entryRuleFunctionDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinitionOrStub = null;


        try {
            // InternalAlf.g:4233:65: (iv_ruleFunctionDefinitionOrStub= ruleFunctionDefinitionOrStub EOF )
            // InternalAlf.g:4234:2: iv_ruleFunctionDefinitionOrStub= ruleFunctionDefinitionOrStub EOF
            {
             newCompositeNode(grammarAccess.getFunctionDefinitionOrStubRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDefinitionOrStub=ruleFunctionDefinitionOrStub();

            state._fsp--;

             current =iv_ruleFunctionDefinitionOrStub; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDefinitionOrStub"


    // $ANTLR start "ruleFunctionDefinitionOrStub"
    // InternalAlf.g:4240:1: ruleFunctionDefinitionOrStub returns [EObject current=null] : this_FunctionDefinition_0= ruleFunctionDefinition[$current] ;
    public final EObject ruleFunctionDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4246:2: (this_FunctionDefinition_0= ruleFunctionDefinition[$current] )
            // InternalAlf.g:4247:2: this_FunctionDefinition_0= ruleFunctionDefinition[$current]
            {

            		if (current==null) {
            			current = createModelElement(grammarAccess.getFunctionDefinitionOrStubRule());
            		}
            		newCompositeNode(grammarAccess.getFunctionDefinitionOrStubAccess().getFunctionDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_FunctionDefinition_0=ruleFunctionDefinition(current);

            state._fsp--;


            		current = this_FunctionDefinition_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDefinitionOrStub"


    // $ANTLR start "ruleFunctionDefinition"
    // InternalAlf.g:4262:1: ruleFunctionDefinition[EObject in_current] returns [EObject current=in_current] : (this_FunctionDeclaration_0= ruleFunctionDeclaration[$current] this_FunctionBody_1= ruleFunctionBody[$current] ) ;
    public final EObject ruleFunctionDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_FunctionDeclaration_0 = null;

        EObject this_FunctionBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:4268:2: ( (this_FunctionDeclaration_0= ruleFunctionDeclaration[$current] this_FunctionBody_1= ruleFunctionBody[$current] ) )
            // InternalAlf.g:4269:2: (this_FunctionDeclaration_0= ruleFunctionDeclaration[$current] this_FunctionBody_1= ruleFunctionBody[$current] )
            {
            // InternalAlf.g:4269:2: (this_FunctionDeclaration_0= ruleFunctionDeclaration[$current] this_FunctionBody_1= ruleFunctionBody[$current] )
            // InternalAlf.g:4270:3: this_FunctionDeclaration_0= ruleFunctionDeclaration[$current] this_FunctionBody_1= ruleFunctionBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFunctionDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFunctionDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_FunctionDeclaration_0=ruleFunctionDeclaration(current);

            state._fsp--;


            			current = this_FunctionDeclaration_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFunctionDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFunctionBodyParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_FunctionBody_1=ruleFunctionBody(current);

            state._fsp--;


            			current = this_FunctionBody_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDefinition"


    // $ANTLR start "ruleFunctionDeclaration"
    // InternalAlf.g:4297:1: ruleFunctionDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] (this_SpecializationList_5= ruleSpecializationList[$current] )? ) ;
    public final EObject ruleFunctionDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject this_ParameterList_3 = null;

        EObject this_ReturnParameterPart_4 = null;

        EObject this_SpecializationList_5 = null;



        	enterRule();

        try {
            // InternalAlf.g:4303:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] (this_SpecializationList_5= ruleSpecializationList[$current] )? ) )
            // InternalAlf.g:4304:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] (this_SpecializationList_5= ruleSpecializationList[$current] )? )
            {
            // InternalAlf.g:4304:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] (this_SpecializationList_5= ruleSpecializationList[$current] )? )
            // InternalAlf.g:4305:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] (this_SpecializationList_5= ruleSpecializationList[$current] )?
            {
            // InternalAlf.g:4305:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==33) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalAlf.g:4306:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:4306:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:4307:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,33,FOLLOW_64); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getFunctionDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFunctionDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_1());
            		
            // InternalAlf.g:4323:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:4324:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:4324:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:4325:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_57);
            lv_name_2_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getFunctionDeclarationRule());
            			}
            			newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParameterListParserRuleCall_3());
            		
            pushFollow(FOLLOW_65);
            this_ParameterList_3=ruleParameterList(current);

            state._fsp--;


            			current = this_ParameterList_3;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFunctionDeclarationRule());
            			}
            			newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getReturnParameterPartParserRuleCall_4());
            		
            pushFollow(FOLLOW_45);
            this_ReturnParameterPart_4=ruleReturnParameterPart(current);

            state._fsp--;


            			current = this_ReturnParameterPart_4;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:4364:3: (this_SpecializationList_5= ruleSpecializationList[$current] )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==37) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalAlf.g:4365:4: this_SpecializationList_5= ruleSpecializationList[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getFunctionDeclarationRule());
                    				}
                    				newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getSpecializationListParserRuleCall_5());
                    			
                    pushFollow(FOLLOW_2);
                    this_SpecializationList_5=ruleSpecializationList(current);

                    state._fsp--;


                    				current = this_SpecializationList_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "ruleReturnParameterPart"
    // InternalAlf.g:4382:1: ruleReturnParameterPart[EObject in_current] returns [EObject current=in_current] : ( (lv_ownedRelationship_0_0= ruleReturnParameterMember ) ) ;
    public final EObject ruleReturnParameterPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4388:2: ( ( (lv_ownedRelationship_0_0= ruleReturnParameterMember ) ) )
            // InternalAlf.g:4389:2: ( (lv_ownedRelationship_0_0= ruleReturnParameterMember ) )
            {
            // InternalAlf.g:4389:2: ( (lv_ownedRelationship_0_0= ruleReturnParameterMember ) )
            // InternalAlf.g:4390:3: (lv_ownedRelationship_0_0= ruleReturnParameterMember )
            {
            // InternalAlf.g:4390:3: (lv_ownedRelationship_0_0= ruleReturnParameterMember )
            // InternalAlf.g:4391:4: lv_ownedRelationship_0_0= ruleReturnParameterMember
            {

            				newCompositeNode(grammarAccess.getReturnParameterPartAccess().getOwnedRelationshipReturnParameterMemberParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_0_0=ruleReturnParameterMember();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getReturnParameterPartRule());
            				}
            				add(
            					current,
            					"ownedRelationship",
            					lv_ownedRelationship_0_0,
            					"org.omg.sysml.Alf.ReturnParameterMember");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnParameterPart"


    // $ANTLR start "ruleFunctionBody"
    // InternalAlf.g:4412:1: ruleFunctionBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* ( (lv_ownedRelationship_4_0= ruleExpressionMember ) )? otherlv_5= '}' ) ) ;
    public final EObject ruleFunctionBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_ownedRelationship_2_0 = null;

        EObject lv_ownedRelationship_3_0 = null;

        EObject lv_ownedRelationship_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4418:2: ( (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* ( (lv_ownedRelationship_4_0= ruleExpressionMember ) )? otherlv_5= '}' ) ) )
            // InternalAlf.g:4419:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* ( (lv_ownedRelationship_4_0= ruleExpressionMember ) )? otherlv_5= '}' ) )
            {
            // InternalAlf.g:4419:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* ( (lv_ownedRelationship_4_0= ruleExpressionMember ) )? otherlv_5= '}' ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==20) ) {
                alt81=1;
            }
            else if ( (LA81_0==23) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalAlf.g:4420:3: otherlv_0= ';'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getFunctionBodyAccess().getSemicolonKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:4425:3: (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* ( (lv_ownedRelationship_4_0= ruleExpressionMember ) )? otherlv_5= '}' )
                    {
                    // InternalAlf.g:4425:3: (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* ( (lv_ownedRelationship_4_0= ruleExpressionMember ) )? otherlv_5= '}' )
                    // InternalAlf.g:4426:4: otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* ( (lv_ownedRelationship_4_0= ruleExpressionMember ) )? otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_66); 

                    				newLeafNode(otherlv_1, grammarAccess.getFunctionBodyAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalAlf.g:4430:4: ( ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )*
                    loop79:
                    do {
                        int alt79=3;
                        alt79 = dfa79.predict(input);
                        switch (alt79) {
                    	case 1 :
                    	    // InternalAlf.g:4431:5: ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) )
                    	    {
                    	    // InternalAlf.g:4431:5: ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) )
                    	    // InternalAlf.g:4432:6: (lv_ownedRelationship_2_0= ruleBehaviorMember )
                    	    {
                    	    // InternalAlf.g:4432:6: (lv_ownedRelationship_2_0= ruleBehaviorMember )
                    	    // InternalAlf.g:4433:7: lv_ownedRelationship_2_0= ruleBehaviorMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionBodyAccess().getOwnedRelationshipBehaviorMemberParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_66);
                    	    lv_ownedRelationship_2_0=ruleBehaviorMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedRelationship",
                    	    								lv_ownedRelationship_2_0,
                    	    								"org.omg.sysml.Alf.BehaviorMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAlf.g:4451:5: ( (lv_ownedRelationship_3_0= rulePackageImport ) )
                    	    {
                    	    // InternalAlf.g:4451:5: ( (lv_ownedRelationship_3_0= rulePackageImport ) )
                    	    // InternalAlf.g:4452:6: (lv_ownedRelationship_3_0= rulePackageImport )
                    	    {
                    	    // InternalAlf.g:4452:6: (lv_ownedRelationship_3_0= rulePackageImport )
                    	    // InternalAlf.g:4453:7: lv_ownedRelationship_3_0= rulePackageImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionBodyAccess().getOwnedRelationshipPackageImportParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_66);
                    	    lv_ownedRelationship_3_0=rulePackageImport();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedRelationship",
                    	    								lv_ownedRelationship_3_0,
                    	    								"org.omg.sysml.Alf.PackageImport");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    // InternalAlf.g:4471:4: ( (lv_ownedRelationship_4_0= ruleExpressionMember ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( ((LA80_0>=RULE_BOOLEAN_VALUE && LA80_0<=RULE_UNRESTRICTED_NAME)||(LA80_0>=18 && LA80_0<=19)||LA80_0==23||LA80_0==40||(LA80_0>=69 && LA80_0<=70)||(LA80_0>=74 && LA80_0<=75)||LA80_0==77) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalAlf.g:4472:5: (lv_ownedRelationship_4_0= ruleExpressionMember )
                            {
                            // InternalAlf.g:4472:5: (lv_ownedRelationship_4_0= ruleExpressionMember )
                            // InternalAlf.g:4473:6: lv_ownedRelationship_4_0= ruleExpressionMember
                            {

                            						newCompositeNode(grammarAccess.getFunctionBodyAccess().getOwnedRelationshipExpressionMemberParserRuleCall_1_2_0());
                            					
                            pushFollow(FOLLOW_67);
                            lv_ownedRelationship_4_0=ruleExpressionMember();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFunctionBodyRule());
                            						}
                            						add(
                            							current,
                            							"ownedRelationship",
                            							lv_ownedRelationship_4_0,
                            							"org.omg.sysml.Alf.ExpressionMember");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getFunctionBodyAccess().getRightCurlyBracketKeyword_1_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionBody"


    // $ANTLR start "entryRuleReturnParameterMember"
    // InternalAlf.g:4499:1: entryRuleReturnParameterMember returns [EObject current=null] : iv_ruleReturnParameterMember= ruleReturnParameterMember EOF ;
    public final EObject entryRuleReturnParameterMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnParameterMember = null;


        try {
            // InternalAlf.g:4499:62: (iv_ruleReturnParameterMember= ruleReturnParameterMember EOF )
            // InternalAlf.g:4500:2: iv_ruleReturnParameterMember= ruleReturnParameterMember EOF
            {
             newCompositeNode(grammarAccess.getReturnParameterMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnParameterMember=ruleReturnParameterMember();

            state._fsp--;

             current =iv_ruleReturnParameterMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnParameterMember"


    // $ANTLR start "ruleReturnParameterMember"
    // InternalAlf.g:4506:1: ruleReturnParameterMember returns [EObject current=null] : ( ( (lv_memberName_0_0= ruleName ) )? ( (lv_ownedRelatedElement_1_0= ruleParameterDefinition ) ) ) ;
    public final EObject ruleReturnParameterMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_memberName_0_0 = null;

        EObject lv_ownedRelatedElement_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4512:2: ( ( ( (lv_memberName_0_0= ruleName ) )? ( (lv_ownedRelatedElement_1_0= ruleParameterDefinition ) ) ) )
            // InternalAlf.g:4513:2: ( ( (lv_memberName_0_0= ruleName ) )? ( (lv_ownedRelatedElement_1_0= ruleParameterDefinition ) ) )
            {
            // InternalAlf.g:4513:2: ( ( (lv_memberName_0_0= ruleName ) )? ( (lv_ownedRelatedElement_1_0= ruleParameterDefinition ) ) )
            // InternalAlf.g:4514:3: ( (lv_memberName_0_0= ruleName ) )? ( (lv_ownedRelatedElement_1_0= ruleParameterDefinition ) )
            {
            // InternalAlf.g:4514:3: ( (lv_memberName_0_0= ruleName ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=RULE_ID && LA82_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalAlf.g:4515:4: (lv_memberName_0_0= ruleName )
                    {
                    // InternalAlf.g:4515:4: (lv_memberName_0_0= ruleName )
                    // InternalAlf.g:4516:5: lv_memberName_0_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getReturnParameterMemberAccess().getMemberNameNameParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_62);
                    lv_memberName_0_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReturnParameterMemberRule());
                    					}
                    					set(
                    						current,
                    						"memberName",
                    						lv_memberName_0_0,
                    						"org.omg.sysml.Alf.Name");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:4533:3: ( (lv_ownedRelatedElement_1_0= ruleParameterDefinition ) )
            // InternalAlf.g:4534:4: (lv_ownedRelatedElement_1_0= ruleParameterDefinition )
            {
            // InternalAlf.g:4534:4: (lv_ownedRelatedElement_1_0= ruleParameterDefinition )
            // InternalAlf.g:4535:5: lv_ownedRelatedElement_1_0= ruleParameterDefinition
            {

            					newCompositeNode(grammarAccess.getReturnParameterMemberAccess().getOwnedRelatedElementParameterDefinitionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_1_0=ruleParameterDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReturnParameterMemberRule());
            					}
            					add(
            						current,
            						"ownedRelatedElement",
            						lv_ownedRelatedElement_1_0,
            						"org.omg.sysml.Alf.ParameterDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnParameterMember"


    // $ANTLR start "entryRuleExpressionMember"
    // InternalAlf.g:4556:1: entryRuleExpressionMember returns [EObject current=null] : iv_ruleExpressionMember= ruleExpressionMember EOF ;
    public final EObject entryRuleExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionMember = null;


        try {
            // InternalAlf.g:4556:57: (iv_ruleExpressionMember= ruleExpressionMember EOF )
            // InternalAlf.g:4557:2: iv_ruleExpressionMember= ruleExpressionMember EOF
            {
             newCompositeNode(grammarAccess.getExpressionMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionMember=ruleExpressionMember();

            state._fsp--;

             current =iv_ruleExpressionMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionMember"


    // $ANTLR start "ruleExpressionMember"
    // InternalAlf.g:4563:1: ruleExpressionMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleExpression ) ) ;
    public final EObject ruleExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4569:2: ( ( (lv_ownedRelatedElement_0_0= ruleExpression ) ) )
            // InternalAlf.g:4570:2: ( (lv_ownedRelatedElement_0_0= ruleExpression ) )
            {
            // InternalAlf.g:4570:2: ( (lv_ownedRelatedElement_0_0= ruleExpression ) )
            // InternalAlf.g:4571:3: (lv_ownedRelatedElement_0_0= ruleExpression )
            {
            // InternalAlf.g:4571:3: (lv_ownedRelatedElement_0_0= ruleExpression )
            // InternalAlf.g:4572:4: lv_ownedRelatedElement_0_0= ruleExpression
            {

            				newCompositeNode(grammarAccess.getExpressionMemberAccess().getOwnedRelatedElementExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_0_0=ruleExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getExpressionMemberRule());
            				}
            				add(
            					current,
            					"ownedRelatedElement",
            					lv_ownedRelatedElement_0_0,
            					"org.omg.sysml.Alf.Expression");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionMember"


    // $ANTLR start "entryRuleFeatureDefinition"
    // InternalAlf.g:4592:1: entryRuleFeatureDefinition returns [EObject current=null] : iv_ruleFeatureDefinition= ruleFeatureDefinition EOF ;
    public final EObject entryRuleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDefinition = null;


        try {
            // InternalAlf.g:4592:58: (iv_ruleFeatureDefinition= ruleFeatureDefinition EOF )
            // InternalAlf.g:4593:2: iv_ruleFeatureDefinition= ruleFeatureDefinition EOF
            {
             newCompositeNode(grammarAccess.getFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureDefinition=ruleFeatureDefinition();

            state._fsp--;

             current =iv_ruleFeatureDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureDefinition"


    // $ANTLR start "ruleFeatureDefinition"
    // InternalAlf.g:4599:1: ruleFeatureDefinition returns [EObject current=null] : (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) ;
    public final EObject ruleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_NamedFeatureDefinition_0 = null;

        EObject this_UnnamedFeatureDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:4605:2: ( (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) )
            // InternalAlf.g:4606:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            {
            // InternalAlf.g:4606:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=RULE_ID && LA83_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt83=1;
            }
            else if ( (LA83_0==44) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalAlf.g:4607:3: this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition
                    {

                    			newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getNamedFeatureDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamedFeatureDefinition_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    			current = this_NamedFeatureDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:4616:3: this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition
                    {

                    			newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getUnnamedFeatureDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnnamedFeatureDefinition_1=ruleUnnamedFeatureDefinition();

                    state._fsp--;


                    			current = this_UnnamedFeatureDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureDefinition"


    // $ANTLR start "entryRuleAbstractFeatureDefinition"
    // InternalAlf.g:4628:1: entryRuleAbstractFeatureDefinition returns [EObject current=null] : iv_ruleAbstractFeatureDefinition= ruleAbstractFeatureDefinition EOF ;
    public final EObject entryRuleAbstractFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractFeatureDefinition = null;


        try {
            // InternalAlf.g:4628:66: (iv_ruleAbstractFeatureDefinition= ruleAbstractFeatureDefinition EOF )
            // InternalAlf.g:4629:2: iv_ruleAbstractFeatureDefinition= ruleAbstractFeatureDefinition EOF
            {
             newCompositeNode(grammarAccess.getAbstractFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractFeatureDefinition=ruleAbstractFeatureDefinition();

            state._fsp--;

             current =iv_ruleAbstractFeatureDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractFeatureDefinition"


    // $ANTLR start "ruleAbstractFeatureDefinition"
    // InternalAlf.g:4635:1: ruleAbstractFeatureDefinition returns [EObject current=null] : (this_AbstractNamedFeatureDefinition_0= ruleAbstractNamedFeatureDefinition | this_AbstractUnnamedFeatureDefinition_1= ruleAbstractUnnamedFeatureDefinition ) ;
    public final EObject ruleAbstractFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractNamedFeatureDefinition_0 = null;

        EObject this_AbstractUnnamedFeatureDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:4641:2: ( (this_AbstractNamedFeatureDefinition_0= ruleAbstractNamedFeatureDefinition | this_AbstractUnnamedFeatureDefinition_1= ruleAbstractUnnamedFeatureDefinition ) )
            // InternalAlf.g:4642:2: (this_AbstractNamedFeatureDefinition_0= ruleAbstractNamedFeatureDefinition | this_AbstractUnnamedFeatureDefinition_1= ruleAbstractUnnamedFeatureDefinition )
            {
            // InternalAlf.g:4642:2: (this_AbstractNamedFeatureDefinition_0= ruleAbstractNamedFeatureDefinition | this_AbstractUnnamedFeatureDefinition_1= ruleAbstractUnnamedFeatureDefinition )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=RULE_ID && LA84_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt84=1;
            }
            else if ( (LA84_0==44) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalAlf.g:4643:3: this_AbstractNamedFeatureDefinition_0= ruleAbstractNamedFeatureDefinition
                    {

                    			newCompositeNode(grammarAccess.getAbstractFeatureDefinitionAccess().getAbstractNamedFeatureDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbstractNamedFeatureDefinition_0=ruleAbstractNamedFeatureDefinition();

                    state._fsp--;


                    			current = this_AbstractNamedFeatureDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:4652:3: this_AbstractUnnamedFeatureDefinition_1= ruleAbstractUnnamedFeatureDefinition
                    {

                    			newCompositeNode(grammarAccess.getAbstractFeatureDefinitionAccess().getAbstractUnnamedFeatureDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbstractUnnamedFeatureDefinition_1=ruleAbstractUnnamedFeatureDefinition();

                    state._fsp--;


                    			current = this_AbstractUnnamedFeatureDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractFeatureDefinition"


    // $ANTLR start "entryRuleNamedFeatureDefinition"
    // InternalAlf.g:4664:1: entryRuleNamedFeatureDefinition returns [EObject current=null] : iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF ;
    public final EObject entryRuleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedFeatureDefinition = null;


        try {
            // InternalAlf.g:4664:63: (iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF )
            // InternalAlf.g:4665:2: iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF
            {
             newCompositeNode(grammarAccess.getNamedFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedFeatureDefinition=ruleNamedFeatureDefinition();

            state._fsp--;

             current =iv_ruleNamedFeatureDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedFeatureDefinition"


    // $ANTLR start "ruleNamedFeatureDefinition"
    // InternalAlf.g:4671:1: ruleNamedFeatureDefinition returns [EObject current=null] : (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureDeclaration_0 = null;

        EObject this_FeatureCompletion_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:4677:2: ( (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:4678:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:4678:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] )
            // InternalAlf.g:4679:3: this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getNamedFeatureDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getFeatureDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_68);
            this_FeatureDeclaration_0=ruleFeatureDeclaration(current);

            state._fsp--;


            			current = this_FeatureDeclaration_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getNamedFeatureDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getFeatureCompletionParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_FeatureCompletion_1=ruleFeatureCompletion(current);

            state._fsp--;


            			current = this_FeatureCompletion_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedFeatureDefinition"


    // $ANTLR start "entryRuleAbstractNamedFeatureDefinition"
    // InternalAlf.g:4705:1: entryRuleAbstractNamedFeatureDefinition returns [EObject current=null] : iv_ruleAbstractNamedFeatureDefinition= ruleAbstractNamedFeatureDefinition EOF ;
    public final EObject entryRuleAbstractNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNamedFeatureDefinition = null;


        try {
            // InternalAlf.g:4705:71: (iv_ruleAbstractNamedFeatureDefinition= ruleAbstractNamedFeatureDefinition EOF )
            // InternalAlf.g:4706:2: iv_ruleAbstractNamedFeatureDefinition= ruleAbstractNamedFeatureDefinition EOF
            {
             newCompositeNode(grammarAccess.getAbstractNamedFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractNamedFeatureDefinition=ruleAbstractNamedFeatureDefinition();

            state._fsp--;

             current =iv_ruleAbstractNamedFeatureDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractNamedFeatureDefinition"


    // $ANTLR start "ruleAbstractNamedFeatureDefinition"
    // InternalAlf.g:4712:1: ruleAbstractNamedFeatureDefinition returns [EObject current=null] : (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_AbstractFeatureCompletion_1= ruleAbstractFeatureCompletion[$current] ) ;
    public final EObject ruleAbstractNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureDeclaration_0 = null;

        EObject this_AbstractFeatureCompletion_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:4718:2: ( (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_AbstractFeatureCompletion_1= ruleAbstractFeatureCompletion[$current] ) )
            // InternalAlf.g:4719:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_AbstractFeatureCompletion_1= ruleAbstractFeatureCompletion[$current] )
            {
            // InternalAlf.g:4719:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_AbstractFeatureCompletion_1= ruleAbstractFeatureCompletion[$current] )
            // InternalAlf.g:4720:3: this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_AbstractFeatureCompletion_1= ruleAbstractFeatureCompletion[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAbstractNamedFeatureDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getAbstractNamedFeatureDefinitionAccess().getFeatureDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_68);
            this_FeatureDeclaration_0=ruleFeatureDeclaration(current);

            state._fsp--;


            			current = this_FeatureDeclaration_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAbstractNamedFeatureDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getAbstractNamedFeatureDefinitionAccess().getAbstractFeatureCompletionParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_AbstractFeatureCompletion_1=ruleAbstractFeatureCompletion(current);

            state._fsp--;


            			current = this_AbstractFeatureCompletion_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractNamedFeatureDefinition"


    // $ANTLR start "entryRuleUnnamedFeatureDefinition"
    // InternalAlf.g:4746:1: entryRuleUnnamedFeatureDefinition returns [EObject current=null] : iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF ;
    public final EObject entryRuleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedFeatureDefinition = null;


        try {
            // InternalAlf.g:4746:65: (iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF )
            // InternalAlf.g:4747:2: iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF
            {
             newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnnamedFeatureDefinition=ruleUnnamedFeatureDefinition();

            state._fsp--;

             current =iv_ruleUnnamedFeatureDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnnamedFeatureDefinition"


    // $ANTLR start "ruleUnnamedFeatureDefinition"
    // InternalAlf.g:4753:1: ruleUnnamedFeatureDefinition returns [EObject current=null] : (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject this_TypePart_2 = null;

        EObject this_FeatureCompletion_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:4759:2: ( (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:4760:2: (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:4760:2: (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current] )
            // InternalAlf.g:4761:3: otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current]
            {
            otherlv_0=(Token)match(input,44,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getUnnamedFeatureDefinitionAccess().getRedefinesKeyword_0());
            		
            // InternalAlf.g:4765:3: ( (lv_ownedRelationship_1_0= ruleRedefinition ) )
            // InternalAlf.g:4766:4: (lv_ownedRelationship_1_0= ruleRedefinition )
            {
            // InternalAlf.g:4766:4: (lv_ownedRelationship_1_0= ruleRedefinition )
            // InternalAlf.g:4767:5: lv_ownedRelationship_1_0= ruleRedefinition
            {

            					newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedRelationshipRedefinitionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_69);
            lv_ownedRelationship_1_0=ruleRedefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_1_0,
            						"org.omg.sysml.Alf.Redefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getUnnamedFeatureDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getTypePartParserRuleCall_2());
            		
            pushFollow(FOLLOW_68);
            this_TypePart_2=ruleTypePart(current);

            state._fsp--;


            			current = this_TypePart_2;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getUnnamedFeatureDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getFeatureCompletionParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            this_FeatureCompletion_3=ruleFeatureCompletion(current);

            state._fsp--;


            			current = this_FeatureCompletion_3;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnnamedFeatureDefinition"


    // $ANTLR start "entryRuleAbstractUnnamedFeatureDefinition"
    // InternalAlf.g:4810:1: entryRuleAbstractUnnamedFeatureDefinition returns [EObject current=null] : iv_ruleAbstractUnnamedFeatureDefinition= ruleAbstractUnnamedFeatureDefinition EOF ;
    public final EObject entryRuleAbstractUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractUnnamedFeatureDefinition = null;


        try {
            // InternalAlf.g:4810:73: (iv_ruleAbstractUnnamedFeatureDefinition= ruleAbstractUnnamedFeatureDefinition EOF )
            // InternalAlf.g:4811:2: iv_ruleAbstractUnnamedFeatureDefinition= ruleAbstractUnnamedFeatureDefinition EOF
            {
             newCompositeNode(grammarAccess.getAbstractUnnamedFeatureDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractUnnamedFeatureDefinition=ruleAbstractUnnamedFeatureDefinition();

            state._fsp--;

             current =iv_ruleAbstractUnnamedFeatureDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractUnnamedFeatureDefinition"


    // $ANTLR start "ruleAbstractUnnamedFeatureDefinition"
    // InternalAlf.g:4817:1: ruleAbstractUnnamedFeatureDefinition returns [EObject current=null] : (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_AbstractFeatureCompletion_3= ruleAbstractFeatureCompletion[$current] ) ;
    public final EObject ruleAbstractUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject this_TypePart_2 = null;

        EObject this_AbstractFeatureCompletion_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:4823:2: ( (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_AbstractFeatureCompletion_3= ruleAbstractFeatureCompletion[$current] ) )
            // InternalAlf.g:4824:2: (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_AbstractFeatureCompletion_3= ruleAbstractFeatureCompletion[$current] )
            {
            // InternalAlf.g:4824:2: (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_AbstractFeatureCompletion_3= ruleAbstractFeatureCompletion[$current] )
            // InternalAlf.g:4825:3: otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_AbstractFeatureCompletion_3= ruleAbstractFeatureCompletion[$current]
            {
            otherlv_0=(Token)match(input,44,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractUnnamedFeatureDefinitionAccess().getRedefinesKeyword_0());
            		
            // InternalAlf.g:4829:3: ( (lv_ownedRelationship_1_0= ruleRedefinition ) )
            // InternalAlf.g:4830:4: (lv_ownedRelationship_1_0= ruleRedefinition )
            {
            // InternalAlf.g:4830:4: (lv_ownedRelationship_1_0= ruleRedefinition )
            // InternalAlf.g:4831:5: lv_ownedRelationship_1_0= ruleRedefinition
            {

            					newCompositeNode(grammarAccess.getAbstractUnnamedFeatureDefinitionAccess().getOwnedRelationshipRedefinitionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_69);
            lv_ownedRelationship_1_0=ruleRedefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbstractUnnamedFeatureDefinitionRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_1_0,
            						"org.omg.sysml.Alf.Redefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getAbstractUnnamedFeatureDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getAbstractUnnamedFeatureDefinitionAccess().getTypePartParserRuleCall_2());
            		
            pushFollow(FOLLOW_68);
            this_TypePart_2=ruleTypePart(current);

            state._fsp--;


            			current = this_TypePart_2;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAbstractUnnamedFeatureDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getAbstractUnnamedFeatureDefinitionAccess().getAbstractFeatureCompletionParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            this_AbstractFeatureCompletion_3=ruleAbstractFeatureCompletion(current);

            state._fsp--;


            			current = this_AbstractFeatureCompletion_3;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractUnnamedFeatureDefinition"


    // $ANTLR start "ruleFeatureBodyDefinition"
    // InternalAlf.g:4875:1: ruleFeatureBodyDefinition[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'feature' this_FeatureDeclaration_2= ruleFeatureDeclaration[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleFeatureBodyDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        EObject this_FeatureDeclaration_2 = null;

        EObject this_FeatureCompletion_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:4881:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'feature' this_FeatureDeclaration_2= ruleFeatureDeclaration[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:4882:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'feature' this_FeatureDeclaration_2= ruleFeatureDeclaration[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:4882:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'feature' this_FeatureDeclaration_2= ruleFeatureDeclaration[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current] )
            // InternalAlf.g:4883:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'feature' this_FeatureDeclaration_2= ruleFeatureDeclaration[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current]
            {
            // InternalAlf.g:4883:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==33) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalAlf.g:4884:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:4884:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:4885:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,33,FOLLOW_30); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getFeatureBodyDefinitionAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureBodyDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,32,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureBodyDefinitionAccess().getFeatureKeyword_1());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureBodyDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureBodyDefinitionAccess().getFeatureDeclarationParserRuleCall_2());
            		
            pushFollow(FOLLOW_68);
            this_FeatureDeclaration_2=ruleFeatureDeclaration(current);

            state._fsp--;


            			current = this_FeatureDeclaration_2;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureBodyDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureBodyDefinitionAccess().getFeatureCompletionParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            this_FeatureCompletion_3=ruleFeatureCompletion(current);

            state._fsp--;


            			current = this_FeatureCompletion_3;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureBodyDefinition"


    // $ANTLR start "ruleFeatureDeclaration"
    // InternalAlf.g:4928:1: ruleFeatureDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= ruleName ) ) this_TypePart_1= ruleTypePart[$current] this_SubsettingPart_2= ruleSubsettingPart[$current] ) ;
    public final EObject ruleFeatureDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject this_TypePart_1 = null;

        EObject this_SubsettingPart_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4934:2: ( ( ( (lv_name_0_0= ruleName ) ) this_TypePart_1= ruleTypePart[$current] this_SubsettingPart_2= ruleSubsettingPart[$current] ) )
            // InternalAlf.g:4935:2: ( ( (lv_name_0_0= ruleName ) ) this_TypePart_1= ruleTypePart[$current] this_SubsettingPart_2= ruleSubsettingPart[$current] )
            {
            // InternalAlf.g:4935:2: ( ( (lv_name_0_0= ruleName ) ) this_TypePart_1= ruleTypePart[$current] this_SubsettingPart_2= ruleSubsettingPart[$current] )
            // InternalAlf.g:4936:3: ( (lv_name_0_0= ruleName ) ) this_TypePart_1= ruleTypePart[$current] this_SubsettingPart_2= ruleSubsettingPart[$current]
            {
            // InternalAlf.g:4936:3: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:4937:4: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:4937:4: (lv_name_0_0= ruleName )
            // InternalAlf.g:4938:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_70);
            lv_name_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureDeclarationRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getTypePartParserRuleCall_1());
            		
            pushFollow(FOLLOW_71);
            this_TypePart_1=ruleTypePart(current);

            state._fsp--;


            			current = this_TypePart_1;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureDeclarationRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getSubsettingPartParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_SubsettingPart_2=ruleSubsettingPart(current);

            state._fsp--;


            			current = this_SubsettingPart_2;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureDeclaration"


    // $ANTLR start "ruleFeatureCompletion"
    // InternalAlf.g:4982:1: ruleFeatureCompletion[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current] ) ;
    public final EObject ruleFeatureCompletion(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject this_CategoryBody_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4988:2: ( ( (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current] ) )
            // InternalAlf.g:4989:2: ( (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:4989:2: ( (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current] )
            // InternalAlf.g:4990:3: (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current]
            {
            // InternalAlf.g:4990:3: (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==45) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalAlf.g:4991:4: otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) )
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_72); 

                    				newLeafNode(otherlv_0, grammarAccess.getFeatureCompletionAccess().getEqualsSignKeyword_0_0());
                    			
                    // InternalAlf.g:4995:4: ( (lv_ownedRelationship_1_0= ruleFeatureValue ) )
                    // InternalAlf.g:4996:5: (lv_ownedRelationship_1_0= ruleFeatureValue )
                    {
                    // InternalAlf.g:4996:5: (lv_ownedRelationship_1_0= ruleFeatureValue )
                    // InternalAlf.g:4997:6: lv_ownedRelationship_1_0= ruleFeatureValue
                    {

                    						newCompositeNode(grammarAccess.getFeatureCompletionAccess().getOwnedRelationshipFeatureValueParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_ownedRelationship_1_0=ruleFeatureValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureCompletionRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelationship",
                    							lv_ownedRelationship_1_0,
                    							"org.omg.sysml.Alf.FeatureValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureCompletionRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureCompletionAccess().getCategoryBodyParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_CategoryBody_2=ruleCategoryBody(current);

            state._fsp--;


            			current = this_CategoryBody_2;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureCompletion"


    // $ANTLR start "ruleAbstractFeatureCompletion"
    // InternalAlf.g:5031:1: ruleAbstractFeatureCompletion[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )? this_AbstractCategoryBody_2= ruleAbstractCategoryBody[$current] ) ;
    public final EObject ruleAbstractFeatureCompletion(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject this_AbstractCategoryBody_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:5037:2: ( ( (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )? this_AbstractCategoryBody_2= ruleAbstractCategoryBody[$current] ) )
            // InternalAlf.g:5038:2: ( (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )? this_AbstractCategoryBody_2= ruleAbstractCategoryBody[$current] )
            {
            // InternalAlf.g:5038:2: ( (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )? this_AbstractCategoryBody_2= ruleAbstractCategoryBody[$current] )
            // InternalAlf.g:5039:3: (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )? this_AbstractCategoryBody_2= ruleAbstractCategoryBody[$current]
            {
            // InternalAlf.g:5039:3: (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==45) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalAlf.g:5040:4: otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) )
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_72); 

                    				newLeafNode(otherlv_0, grammarAccess.getAbstractFeatureCompletionAccess().getEqualsSignKeyword_0_0());
                    			
                    // InternalAlf.g:5044:4: ( (lv_ownedRelationship_1_0= ruleFeatureValue ) )
                    // InternalAlf.g:5045:5: (lv_ownedRelationship_1_0= ruleFeatureValue )
                    {
                    // InternalAlf.g:5045:5: (lv_ownedRelationship_1_0= ruleFeatureValue )
                    // InternalAlf.g:5046:6: lv_ownedRelationship_1_0= ruleFeatureValue
                    {

                    						newCompositeNode(grammarAccess.getAbstractFeatureCompletionAccess().getOwnedRelationshipFeatureValueParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    lv_ownedRelationship_1_0=ruleFeatureValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAbstractFeatureCompletionRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelationship",
                    							lv_ownedRelationship_1_0,
                    							"org.omg.sysml.Alf.FeatureValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getAbstractFeatureCompletionRule());
            			}
            			newCompositeNode(grammarAccess.getAbstractFeatureCompletionAccess().getAbstractCategoryBodyParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_AbstractCategoryBody_2=ruleAbstractCategoryBody(current);

            state._fsp--;


            			current = this_AbstractCategoryBody_2;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractFeatureCompletion"


    // $ANTLR start "entryRuleFeatureValue"
    // InternalAlf.g:5079:1: entryRuleFeatureValue returns [EObject current=null] : iv_ruleFeatureValue= ruleFeatureValue EOF ;
    public final EObject entryRuleFeatureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureValue = null;


        try {
            // InternalAlf.g:5079:53: (iv_ruleFeatureValue= ruleFeatureValue EOF )
            // InternalAlf.g:5080:2: iv_ruleFeatureValue= ruleFeatureValue EOF
            {
             newCompositeNode(grammarAccess.getFeatureValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureValue=ruleFeatureValue();

            state._fsp--;

             current =iv_ruleFeatureValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureValue"


    // $ANTLR start "ruleFeatureValue"
    // InternalAlf.g:5086:1: ruleFeatureValue returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleExpression ) ) ;
    public final EObject ruleFeatureValue() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5092:2: ( ( (lv_ownedRelatedElement_0_0= ruleExpression ) ) )
            // InternalAlf.g:5093:2: ( (lv_ownedRelatedElement_0_0= ruleExpression ) )
            {
            // InternalAlf.g:5093:2: ( (lv_ownedRelatedElement_0_0= ruleExpression ) )
            // InternalAlf.g:5094:3: (lv_ownedRelatedElement_0_0= ruleExpression )
            {
            // InternalAlf.g:5094:3: (lv_ownedRelatedElement_0_0= ruleExpression )
            // InternalAlf.g:5095:4: lv_ownedRelatedElement_0_0= ruleExpression
            {

            				newCompositeNode(grammarAccess.getFeatureValueAccess().getOwnedRelatedElementExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_0_0=ruleExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFeatureValueRule());
            				}
            				add(
            					current,
            					"ownedRelatedElement",
            					lv_ownedRelatedElement_0_0,
            					"org.omg.sysml.Alf.Expression");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureValue"


    // $ANTLR start "ruleTypePart"
    // InternalAlf.g:5116:1: ruleTypePart[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )? ( (lv_ownedRelationship_4_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleTypePart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_isComposite_1_0=null;
        Token otherlv_3=null;
        Token lv_isOrdered_6_0=null;
        Token lv_isNonunique_7_0=null;
        EObject lv_ownedRelationship_2_0 = null;

        EObject lv_ownedRelationship_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5122:2: ( ( (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )? ( (lv_ownedRelationship_4_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) ) ) )
            // InternalAlf.g:5123:2: ( (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )? ( (lv_ownedRelationship_4_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) ) )
            {
            // InternalAlf.g:5123:2: ( (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )? ( (lv_ownedRelationship_4_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) ) )
            // InternalAlf.g:5124:3: (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )? ( (lv_ownedRelationship_4_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) )
            {
            // InternalAlf.g:5124:3: (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==46) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalAlf.g:5125:4: otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' )
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_73); 

                    				newLeafNode(otherlv_0, grammarAccess.getTypePartAccess().getColonKeyword_0_0());
                    			
                    // InternalAlf.g:5129:4: ( (lv_isComposite_1_0= 'compose' ) )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==47) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // InternalAlf.g:5130:5: (lv_isComposite_1_0= 'compose' )
                            {
                            // InternalAlf.g:5130:5: (lv_isComposite_1_0= 'compose' )
                            // InternalAlf.g:5131:6: lv_isComposite_1_0= 'compose'
                            {
                            lv_isComposite_1_0=(Token)match(input,47,FOLLOW_74); 

                            						newLeafNode(lv_isComposite_1_0, grammarAccess.getTypePartAccess().getIsCompositeComposeKeyword_0_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTypePartRule());
                            						}
                            						setWithLastConsumed(current, "isComposite", true, "compose");
                            					

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:5143:4: ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' )
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( ((LA89_0>=RULE_ID && LA89_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt89=1;
                    }
                    else if ( (LA89_0==48) ) {
                        alt89=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 0, input);

                        throw nvae;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalAlf.g:5144:5: ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) )
                            {
                            // InternalAlf.g:5144:5: ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) )
                            // InternalAlf.g:5145:6: (lv_ownedRelationship_2_0= ruleFeatureTyping )
                            {
                            // InternalAlf.g:5145:6: (lv_ownedRelationship_2_0= ruleFeatureTyping )
                            // InternalAlf.g:5146:7: lv_ownedRelationship_2_0= ruleFeatureTyping
                            {

                            							newCompositeNode(grammarAccess.getTypePartAccess().getOwnedRelationshipFeatureTypingParserRuleCall_0_2_0_0());
                            						
                            pushFollow(FOLLOW_75);
                            lv_ownedRelationship_2_0=ruleFeatureTyping();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTypePartRule());
                            							}
                            							add(
                            								current,
                            								"ownedRelationship",
                            								lv_ownedRelationship_2_0,
                            								"org.omg.sysml.Alf.FeatureTyping");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:5164:5: otherlv_3= 'any'
                            {
                            otherlv_3=(Token)match(input,48,FOLLOW_75); 

                            					newLeafNode(otherlv_3, grammarAccess.getTypePartAccess().getAnyKeyword_0_2_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalAlf.g:5170:3: ( (lv_ownedRelationship_4_0= ruleMultiplicity ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==51) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalAlf.g:5171:4: (lv_ownedRelationship_4_0= ruleMultiplicity )
                    {
                    // InternalAlf.g:5171:4: (lv_ownedRelationship_4_0= ruleMultiplicity )
                    // InternalAlf.g:5172:5: lv_ownedRelationship_4_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getTypePartAccess().getOwnedRelationshipMultiplicityParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_76);
                    lv_ownedRelationship_4_0=ruleMultiplicity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypePartRule());
                    					}
                    					add(
                    						current,
                    						"ownedRelationship",
                    						lv_ownedRelationship_4_0,
                    						"org.omg.sysml.Alf.Multiplicity");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:5189:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) )
            // InternalAlf.g:5190:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) )
            {
            // InternalAlf.g:5190:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) )
            // InternalAlf.g:5191:5: ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTypePartAccess().getUnorderedGroup_2());
            				
            // InternalAlf.g:5194:5: ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* )
            // InternalAlf.g:5195:6: ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )*
            {
            // InternalAlf.g:5195:6: ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )*
            loop92:
            do {
                int alt92=3;
                int LA92_0 = input.LA(1);

                if ( LA92_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 0) ) {
                    alt92=1;
                }
                else if ( LA92_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 1) ) {
                    alt92=2;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalAlf.g:5196:4: ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) )
            	    {
            	    // InternalAlf.g:5196:4: ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) )
            	    // InternalAlf.g:5197:5: {...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTypePart", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAlf.g:5197:105: ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) )
            	    // InternalAlf.g:5198:6: ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAlf.g:5201:9: ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) )
            	    // InternalAlf.g:5201:10: {...}? => ( (lv_isOrdered_6_0= 'ordered' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTypePart", "true");
            	    }
            	    // InternalAlf.g:5201:19: ( (lv_isOrdered_6_0= 'ordered' ) )
            	    // InternalAlf.g:5201:20: (lv_isOrdered_6_0= 'ordered' )
            	    {
            	    // InternalAlf.g:5201:20: (lv_isOrdered_6_0= 'ordered' )
            	    // InternalAlf.g:5202:10: lv_isOrdered_6_0= 'ordered'
            	    {
            	    lv_isOrdered_6_0=(Token)match(input,49,FOLLOW_76); 

            	    										newLeafNode(lv_isOrdered_6_0, grammarAccess.getTypePartAccess().getIsOrderedOrderedKeyword_2_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getTypePartRule());
            	    										}
            	    										setWithLastConsumed(current, "isOrdered", true, "ordered");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypePartAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:5219:4: ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) )
            	    {
            	    // InternalAlf.g:5219:4: ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) )
            	    // InternalAlf.g:5220:5: {...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTypePart", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAlf.g:5220:105: ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) )
            	    // InternalAlf.g:5221:6: ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAlf.g:5224:9: ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) )
            	    // InternalAlf.g:5224:10: {...}? => ( (lv_isNonunique_7_0= 'nonunique' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTypePart", "true");
            	    }
            	    // InternalAlf.g:5224:19: ( (lv_isNonunique_7_0= 'nonunique' ) )
            	    // InternalAlf.g:5224:20: (lv_isNonunique_7_0= 'nonunique' )
            	    {
            	    // InternalAlf.g:5224:20: (lv_isNonunique_7_0= 'nonunique' )
            	    // InternalAlf.g:5225:10: lv_isNonunique_7_0= 'nonunique'
            	    {
            	    lv_isNonunique_7_0=(Token)match(input,50,FOLLOW_76); 

            	    										newLeafNode(lv_isNonunique_7_0, grammarAccess.getTypePartAccess().getIsNonuniqueNonuniqueKeyword_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getTypePartRule());
            	    										}
            	    										setWithLastConsumed(current, "isNonunique", true, "nonunique");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTypePartAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getTypePartAccess().getUnorderedGroup_2());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypePart"


    // $ANTLR start "entryRuleFeatureTyping"
    // InternalAlf.g:5253:1: entryRuleFeatureTyping returns [EObject current=null] : iv_ruleFeatureTyping= ruleFeatureTyping EOF ;
    public final EObject entryRuleFeatureTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureTyping = null;


        try {
            // InternalAlf.g:5253:54: (iv_ruleFeatureTyping= ruleFeatureTyping EOF )
            // InternalAlf.g:5254:2: iv_ruleFeatureTyping= ruleFeatureTyping EOF
            {
             newCompositeNode(grammarAccess.getFeatureTypingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureTyping=ruleFeatureTyping();

            state._fsp--;

             current =iv_ruleFeatureTyping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureTyping"


    // $ANTLR start "ruleFeatureTyping"
    // InternalAlf.g:5260:1: ruleFeatureTyping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleFeatureTyping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:5266:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:5267:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:5267:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:5268:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:5268:3: ( ruleQualifiedName )
            // InternalAlf.g:5269:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFeatureTypingRule());
            				}
            			

            				newCompositeNode(grammarAccess.getFeatureTypingAccess().getTypeCategoryCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureTyping"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalAlf.g:5286:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalAlf.g:5286:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalAlf.g:5287:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;

             current =iv_ruleMultiplicity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // InternalAlf.g:5293:1: ruleMultiplicity returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_ownedRelatedElement_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedRelatedElement_1_0 = null;

        EObject lv_ownedRelatedElement_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5299:2: ( (otherlv_0= '[' ( ( (lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_ownedRelatedElement_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ) )
            // InternalAlf.g:5300:2: (otherlv_0= '[' ( ( (lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_ownedRelatedElement_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' )
            {
            // InternalAlf.g:5300:2: (otherlv_0= '[' ( ( (lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_ownedRelatedElement_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' )
            // InternalAlf.g:5301:3: otherlv_0= '[' ( ( (lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_ownedRelatedElement_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_77); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAlf.g:5305:3: ( ( (lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_NATURAL_VALUE) ) {
                int LA93_1 = input.LA(2);

                if ( (LA93_1==52) ) {
                    alt93=1;
                }
            }
            switch (alt93) {
                case 1 :
                    // InternalAlf.g:5306:4: ( (lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..'
                    {
                    // InternalAlf.g:5306:4: ( (lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression ) )
                    // InternalAlf.g:5307:5: (lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression )
                    {
                    // InternalAlf.g:5307:5: (lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression )
                    // InternalAlf.g:5308:6: lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression
                    {

                    						newCompositeNode(grammarAccess.getMultiplicityAccess().getOwnedRelatedElementNaturalLiteralExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_78);
                    lv_ownedRelatedElement_1_0=ruleNaturalLiteralExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultiplicityRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelatedElement",
                    							lv_ownedRelatedElement_1_0,
                    							"org.omg.sysml.Alf.NaturalLiteralExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,52,FOLLOW_77); 

                    				newLeafNode(otherlv_2, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalAlf.g:5330:3: ( (lv_ownedRelatedElement_3_0= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:5331:4: (lv_ownedRelatedElement_3_0= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:5331:4: (lv_ownedRelatedElement_3_0= ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:5332:5: lv_ownedRelatedElement_3_0= ruleUnlimitedNaturalLiteralExpression
            {

            					newCompositeNode(grammarAccess.getMultiplicityAccess().getOwnedRelatedElementUnlimitedNaturalLiteralExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_79);
            lv_ownedRelatedElement_3_0=ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiplicityRule());
            					}
            					add(
            						current,
            						"ownedRelatedElement",
            						lv_ownedRelatedElement_3_0,
            						"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,53,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMultiplicityAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "ruleSubsettingPart"
    // InternalAlf.g:5358:1: ruleSubsettingPart[EObject in_current] returns [EObject current=in_current] : ( (this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )* ) | (this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )* ) )* ;
    public final EObject ruleSubsettingPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_Subsets_0 = null;

        EObject lv_ownedRelationship_2_0 = null;

        EObject this_Redefines_3 = null;

        EObject lv_ownedRelationship_5_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5364:2: ( ( (this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )* ) | (this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )* ) )* )
            // InternalAlf.g:5365:2: ( (this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )* ) | (this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )* ) )*
            {
            // InternalAlf.g:5365:2: ( (this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )* ) | (this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )* ) )*
            loop96:
            do {
                int alt96=3;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==54) ) {
                    alt96=1;
                }
                else if ( (LA96_0==44) ) {
                    alt96=2;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalAlf.g:5366:3: (this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )* )
            	    {
            	    // InternalAlf.g:5366:3: (this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )* )
            	    // InternalAlf.g:5367:4: this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )*
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getSubsettingPartRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getSubsettingPartAccess().getSubsetsParserRuleCall_0_0());
            	    			
            	    pushFollow(FOLLOW_80);
            	    this_Subsets_0=ruleSubsets(current);

            	    state._fsp--;


            	    				current = this_Subsets_0;
            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalAlf.g:5378:4: (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )*
            	    loop94:
            	    do {
            	        int alt94=2;
            	        int LA94_0 = input.LA(1);

            	        if ( (LA94_0==38) ) {
            	            alt94=1;
            	        }


            	        switch (alt94) {
            	    	case 1 :
            	    	    // InternalAlf.g:5379:5: otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) )
            	    	    {
            	    	    otherlv_1=(Token)match(input,38,FOLLOW_15); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getSubsettingPartAccess().getCommaKeyword_0_1_0());
            	    	    				
            	    	    // InternalAlf.g:5383:5: ( (lv_ownedRelationship_2_0= ruleSubset ) )
            	    	    // InternalAlf.g:5384:6: (lv_ownedRelationship_2_0= ruleSubset )
            	    	    {
            	    	    // InternalAlf.g:5384:6: (lv_ownedRelationship_2_0= ruleSubset )
            	    	    // InternalAlf.g:5385:7: lv_ownedRelationship_2_0= ruleSubset
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSubsettingPartAccess().getOwnedRelationshipSubsetParserRuleCall_0_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_80);
            	    	    lv_ownedRelationship_2_0=ruleSubset();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getSubsettingPartRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"ownedRelationship",
            	    	    								lv_ownedRelationship_2_0,
            	    	    								"org.omg.sysml.Alf.Subset");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop94;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:5405:3: (this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )* )
            	    {
            	    // InternalAlf.g:5405:3: (this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )* )
            	    // InternalAlf.g:5406:4: this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )*
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getSubsettingPartRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getSubsettingPartAccess().getRedefinesParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_80);
            	    this_Redefines_3=ruleRedefines(current);

            	    state._fsp--;


            	    				current = this_Redefines_3;
            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalAlf.g:5417:4: (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )*
            	    loop95:
            	    do {
            	        int alt95=2;
            	        int LA95_0 = input.LA(1);

            	        if ( (LA95_0==38) ) {
            	            alt95=1;
            	        }


            	        switch (alt95) {
            	    	case 1 :
            	    	    // InternalAlf.g:5418:5: otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,38,FOLLOW_15); 

            	    	    					newLeafNode(otherlv_4, grammarAccess.getSubsettingPartAccess().getCommaKeyword_1_1_0());
            	    	    				
            	    	    // InternalAlf.g:5422:5: ( (lv_ownedRelationship_5_0= ruleRedefinition ) )
            	    	    // InternalAlf.g:5423:6: (lv_ownedRelationship_5_0= ruleRedefinition )
            	    	    {
            	    	    // InternalAlf.g:5423:6: (lv_ownedRelationship_5_0= ruleRedefinition )
            	    	    // InternalAlf.g:5424:7: lv_ownedRelationship_5_0= ruleRedefinition
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSubsettingPartAccess().getOwnedRelationshipRedefinitionParserRuleCall_1_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_80);
            	    	    lv_ownedRelationship_5_0=ruleRedefinition();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getSubsettingPartRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"ownedRelationship",
            	    	    								lv_ownedRelationship_5_0,
            	    	    								"org.omg.sysml.Alf.Redefinition");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop95;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubsettingPart"


    // $ANTLR start "ruleSubsets"
    // InternalAlf.g:5448:1: ruleSubsets[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'subsets' ( (lv_ownedRelationship_1_0= ruleSubset ) ) ) ;
    public final EObject ruleSubsets(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_ownedRelationship_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5454:2: ( (otherlv_0= 'subsets' ( (lv_ownedRelationship_1_0= ruleSubset ) ) ) )
            // InternalAlf.g:5455:2: (otherlv_0= 'subsets' ( (lv_ownedRelationship_1_0= ruleSubset ) ) )
            {
            // InternalAlf.g:5455:2: (otherlv_0= 'subsets' ( (lv_ownedRelationship_1_0= ruleSubset ) ) )
            // InternalAlf.g:5456:3: otherlv_0= 'subsets' ( (lv_ownedRelationship_1_0= ruleSubset ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSubsetsAccess().getSubsetsKeyword_0());
            		
            // InternalAlf.g:5460:3: ( (lv_ownedRelationship_1_0= ruleSubset ) )
            // InternalAlf.g:5461:4: (lv_ownedRelationship_1_0= ruleSubset )
            {
            // InternalAlf.g:5461:4: (lv_ownedRelationship_1_0= ruleSubset )
            // InternalAlf.g:5462:5: lv_ownedRelationship_1_0= ruleSubset
            {

            					newCompositeNode(grammarAccess.getSubsetsAccess().getOwnedRelationshipSubsetParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_1_0=ruleSubset();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubsetsRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_1_0,
            						"org.omg.sysml.Alf.Subset");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubsets"


    // $ANTLR start "entryRuleSubset"
    // InternalAlf.g:5483:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalAlf.g:5483:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalAlf.g:5484:2: iv_ruleSubset= ruleSubset EOF
            {
             newCompositeNode(grammarAccess.getSubsetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubset=ruleSubset();

            state._fsp--;

             current =iv_ruleSubset; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubset"


    // $ANTLR start "ruleSubset"
    // InternalAlf.g:5490:1: ruleSubset returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubset() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:5496:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:5497:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:5497:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:5498:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:5498:3: ( ruleQualifiedName )
            // InternalAlf.g:5499:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSubsetRule());
            				}
            			

            				newCompositeNode(grammarAccess.getSubsetAccess().getSubsettedFeatureFeatureCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubset"


    // $ANTLR start "ruleRedefines"
    // InternalAlf.g:5517:1: ruleRedefines[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) ) ;
    public final EObject ruleRedefines(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_ownedRelationship_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5523:2: ( (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) ) )
            // InternalAlf.g:5524:2: (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) )
            {
            // InternalAlf.g:5524:2: (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) )
            // InternalAlf.g:5525:3: otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getRedefinesAccess().getRedefinesKeyword_0());
            		
            // InternalAlf.g:5529:3: ( (lv_ownedRelationship_1_0= ruleRedefinition ) )
            // InternalAlf.g:5530:4: (lv_ownedRelationship_1_0= ruleRedefinition )
            {
            // InternalAlf.g:5530:4: (lv_ownedRelationship_1_0= ruleRedefinition )
            // InternalAlf.g:5531:5: lv_ownedRelationship_1_0= ruleRedefinition
            {

            					newCompositeNode(grammarAccess.getRedefinesAccess().getOwnedRelationshipRedefinitionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedRelationship_1_0=ruleRedefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRedefinesRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_1_0,
            						"org.omg.sysml.Alf.Redefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRedefines"


    // $ANTLR start "entryRuleRedefinition"
    // InternalAlf.g:5552:1: entryRuleRedefinition returns [EObject current=null] : iv_ruleRedefinition= ruleRedefinition EOF ;
    public final EObject entryRuleRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefinition = null;


        try {
            // InternalAlf.g:5552:53: (iv_ruleRedefinition= ruleRedefinition EOF )
            // InternalAlf.g:5553:2: iv_ruleRedefinition= ruleRedefinition EOF
            {
             newCompositeNode(grammarAccess.getRedefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRedefinition=ruleRedefinition();

            state._fsp--;

             current =iv_ruleRedefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRedefinition"


    // $ANTLR start "ruleRedefinition"
    // InternalAlf.g:5559:1: ruleRedefinition returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleRedefinition() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:5565:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:5566:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:5566:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:5567:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:5567:3: ( ruleQualifiedName )
            // InternalAlf.g:5568:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRedefinitionRule());
            				}
            			

            				newCompositeNode(grammarAccess.getRedefinitionAccess().getRedefinedFeatureFeatureCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRedefinition"


    // $ANTLR start "entryRuleConnectorDefinition"
    // InternalAlf.g:5585:1: entryRuleConnectorDefinition returns [EObject current=null] : iv_ruleConnectorDefinition= ruleConnectorDefinition EOF ;
    public final EObject entryRuleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorDefinition = null;


        try {
            // InternalAlf.g:5585:60: (iv_ruleConnectorDefinition= ruleConnectorDefinition EOF )
            // InternalAlf.g:5586:2: iv_ruleConnectorDefinition= ruleConnectorDefinition EOF
            {
             newCompositeNode(grammarAccess.getConnectorDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectorDefinition=ruleConnectorDefinition();

            state._fsp--;

             current =iv_ruleConnectorDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnectorDefinition"


    // $ANTLR start "ruleConnectorDefinition"
    // InternalAlf.g:5592:1: ruleConnectorDefinition returns [EObject current=null] : (this_ConnectorDeclaration_0= ruleConnectorDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) ;
    public final EObject ruleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ConnectorDeclaration_0 = null;

        EObject this_CategoryBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:5598:2: ( (this_ConnectorDeclaration_0= ruleConnectorDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) )
            // InternalAlf.g:5599:2: (this_ConnectorDeclaration_0= ruleConnectorDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:5599:2: (this_ConnectorDeclaration_0= ruleConnectorDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            // InternalAlf.g:5600:3: this_ConnectorDeclaration_0= ruleConnectorDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getConnectorDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_ConnectorDeclaration_0=ruleConnectorDeclaration(current);

            state._fsp--;


            			current = this_ConnectorDeclaration_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getConnectorDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getCategoryBodyParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_CategoryBody_1=ruleCategoryBody(current);

            state._fsp--;


            			current = this_CategoryBody_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectorDefinition"


    // $ANTLR start "entryRuleAbstractConnectorDefinition"
    // InternalAlf.g:5626:1: entryRuleAbstractConnectorDefinition returns [EObject current=null] : iv_ruleAbstractConnectorDefinition= ruleAbstractConnectorDefinition EOF ;
    public final EObject entryRuleAbstractConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractConnectorDefinition = null;


        try {
            // InternalAlf.g:5626:68: (iv_ruleAbstractConnectorDefinition= ruleAbstractConnectorDefinition EOF )
            // InternalAlf.g:5627:2: iv_ruleAbstractConnectorDefinition= ruleAbstractConnectorDefinition EOF
            {
             newCompositeNode(grammarAccess.getAbstractConnectorDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractConnectorDefinition=ruleAbstractConnectorDefinition();

            state._fsp--;

             current =iv_ruleAbstractConnectorDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractConnectorDefinition"


    // $ANTLR start "ruleAbstractConnectorDefinition"
    // InternalAlf.g:5633:1: ruleAbstractConnectorDefinition returns [EObject current=null] : (this_ConnectorDeclaration_0= ruleConnectorDeclaration[$current] this_AbstractCategoryBody_1= ruleAbstractCategoryBody[$current] ) ;
    public final EObject ruleAbstractConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ConnectorDeclaration_0 = null;

        EObject this_AbstractCategoryBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:5639:2: ( (this_ConnectorDeclaration_0= ruleConnectorDeclaration[$current] this_AbstractCategoryBody_1= ruleAbstractCategoryBody[$current] ) )
            // InternalAlf.g:5640:2: (this_ConnectorDeclaration_0= ruleConnectorDeclaration[$current] this_AbstractCategoryBody_1= ruleAbstractCategoryBody[$current] )
            {
            // InternalAlf.g:5640:2: (this_ConnectorDeclaration_0= ruleConnectorDeclaration[$current] this_AbstractCategoryBody_1= ruleAbstractCategoryBody[$current] )
            // InternalAlf.g:5641:3: this_ConnectorDeclaration_0= ruleConnectorDeclaration[$current] this_AbstractCategoryBody_1= ruleAbstractCategoryBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAbstractConnectorDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getAbstractConnectorDefinitionAccess().getConnectorDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_68);
            this_ConnectorDeclaration_0=ruleConnectorDeclaration(current);

            state._fsp--;


            			current = this_ConnectorDeclaration_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAbstractConnectorDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getAbstractConnectorDefinitionAccess().getAbstractCategoryBodyParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_AbstractCategoryBody_1=ruleAbstractCategoryBody(current);

            state._fsp--;


            			current = this_AbstractCategoryBody_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractConnectorDefinition"


    // $ANTLR start "ruleConnectorDeclaration"
    // InternalAlf.g:5668:1: ruleConnectorDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_ownedRelationship_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_ownedRelationship_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_ownedRelationship_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_ownedRelationship_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) ) ;
    public final EObject ruleConnectorDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;

        EObject lv_ownedRelationship_4_0 = null;

        EObject lv_ownedRelationship_6_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_ownedRelationship_9_0 = null;

        EObject lv_ownedRelationship_11_0 = null;

        EObject lv_ownedRelationship_13_0 = null;

        EObject lv_ownedRelationship_15_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5674:2: ( ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_ownedRelationship_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_ownedRelationship_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_ownedRelationship_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_ownedRelationship_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) ) )
            // InternalAlf.g:5675:2: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_ownedRelationship_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_ownedRelationship_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_ownedRelationship_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_ownedRelationship_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) )
            {
            // InternalAlf.g:5675:2: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_ownedRelationship_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_ownedRelationship_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_ownedRelationship_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_ownedRelationship_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) )
            int alt103=2;
            alt103 = dfa103.predict(input);
            switch (alt103) {
                case 1 :
                    // InternalAlf.g:5676:3: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_ownedRelationship_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_ownedRelationship_6_0= ruleConnectorEnd ) ) )
                    {
                    // InternalAlf.g:5676:3: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_ownedRelationship_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_ownedRelationship_6_0= ruleConnectorEnd ) ) )
                    // InternalAlf.g:5677:4: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_ownedRelationship_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_ownedRelationship_6_0= ruleConnectorEnd ) )
                    {
                    // InternalAlf.g:5677:4: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )?
                    int alt99=2;
                    alt99 = dfa99.predict(input);
                    switch (alt99) {
                        case 1 :
                            // InternalAlf.g:5678:5: ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is'
                            {
                            // InternalAlf.g:5678:5: ( (lv_name_0_0= ruleName ) )?
                            int alt97=2;
                            int LA97_0 = input.LA(1);

                            if ( ((LA97_0>=RULE_ID && LA97_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt97=1;
                            }
                            switch (alt97) {
                                case 1 :
                                    // InternalAlf.g:5679:6: (lv_name_0_0= ruleName )
                                    {
                                    // InternalAlf.g:5679:6: (lv_name_0_0= ruleName )
                                    // InternalAlf.g:5680:7: lv_name_0_0= ruleName
                                    {

                                    							newCompositeNode(grammarAccess.getConnectorDeclarationAccess().getNameNameParserRuleCall_0_0_0_0());
                                    						
                                    pushFollow(FOLLOW_81);
                                    lv_name_0_0=ruleName();

                                    state._fsp--;


                                    							if (current==null) {
                                    								current = createModelElementForParent(grammarAccess.getConnectorDeclarationRule());
                                    							}
                                    							set(
                                    								current,
                                    								"name",
                                    								lv_name_0_0,
                                    								"org.omg.sysml.Alf.Name");
                                    							afterParserOrEnumRuleCall();
                                    						

                                    }


                                    }
                                    break;

                            }

                            // InternalAlf.g:5697:5: (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )?
                            int alt98=2;
                            int LA98_0 = input.LA(1);

                            if ( (LA98_0==46) ) {
                                alt98=1;
                            }
                            switch (alt98) {
                                case 1 :
                                    // InternalAlf.g:5698:6: otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) )
                                    {
                                    otherlv_1=(Token)match(input,46,FOLLOW_15); 

                                    						newLeafNode(otherlv_1, grammarAccess.getConnectorDeclarationAccess().getColonKeyword_0_0_1_0());
                                    					
                                    // InternalAlf.g:5702:6: ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) )
                                    // InternalAlf.g:5703:7: (lv_ownedRelationship_2_0= ruleConnectorTyping )
                                    {
                                    // InternalAlf.g:5703:7: (lv_ownedRelationship_2_0= ruleConnectorTyping )
                                    // InternalAlf.g:5704:8: lv_ownedRelationship_2_0= ruleConnectorTyping
                                    {

                                    								newCompositeNode(grammarAccess.getConnectorDeclarationAccess().getOwnedRelationshipConnectorTypingParserRuleCall_0_0_1_1_0());
                                    							
                                    pushFollow(FOLLOW_27);
                                    lv_ownedRelationship_2_0=ruleConnectorTyping();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getConnectorDeclarationRule());
                                    								}
                                    								add(
                                    									current,
                                    									"ownedRelationship",
                                    									lv_ownedRelationship_2_0,
                                    									"org.omg.sysml.Alf.ConnectorTyping");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }


                                    }
                                    break;

                            }

                            otherlv_3=(Token)match(input,25,FOLLOW_82); 

                            					newLeafNode(otherlv_3, grammarAccess.getConnectorDeclarationAccess().getIsKeyword_0_0_2());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:5727:4: ( (lv_ownedRelationship_4_0= ruleConnectorEnd ) )
                    // InternalAlf.g:5728:5: (lv_ownedRelationship_4_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:5728:5: (lv_ownedRelationship_4_0= ruleConnectorEnd )
                    // InternalAlf.g:5729:6: lv_ownedRelationship_4_0= ruleConnectorEnd
                    {

                    						newCompositeNode(grammarAccess.getConnectorDeclarationAccess().getOwnedRelationshipConnectorEndParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_83);
                    lv_ownedRelationship_4_0=ruleConnectorEnd();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectorDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelationship",
                    							lv_ownedRelationship_4_0,
                    							"org.omg.sysml.Alf.ConnectorEnd");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,55,FOLLOW_82); 

                    				newLeafNode(otherlv_5, grammarAccess.getConnectorDeclarationAccess().getToKeyword_0_2());
                    			
                    // InternalAlf.g:5750:4: ( (lv_ownedRelationship_6_0= ruleConnectorEnd ) )
                    // InternalAlf.g:5751:5: (lv_ownedRelationship_6_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:5751:5: (lv_ownedRelationship_6_0= ruleConnectorEnd )
                    // InternalAlf.g:5752:6: lv_ownedRelationship_6_0= ruleConnectorEnd
                    {

                    						newCompositeNode(grammarAccess.getConnectorDeclarationAccess().getOwnedRelationshipConnectorEndParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedRelationship_6_0=ruleConnectorEnd();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectorDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelationship",
                    							lv_ownedRelationship_6_0,
                    							"org.omg.sysml.Alf.ConnectorEnd");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:5771:3: ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_ownedRelationship_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_ownedRelationship_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' )
                    {
                    // InternalAlf.g:5771:3: ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_ownedRelationship_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_ownedRelationship_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' )
                    // InternalAlf.g:5772:4: ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_ownedRelationship_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_ownedRelationship_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')'
                    {
                    // InternalAlf.g:5772:4: ( (lv_name_7_0= ruleName ) )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( ((LA100_0>=RULE_ID && LA100_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // InternalAlf.g:5773:5: (lv_name_7_0= ruleName )
                            {
                            // InternalAlf.g:5773:5: (lv_name_7_0= ruleName )
                            // InternalAlf.g:5774:6: lv_name_7_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getConnectorDeclarationAccess().getNameNameParserRuleCall_1_0_0());
                            					
                            pushFollow(FOLLOW_84);
                            lv_name_7_0=ruleName();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getConnectorDeclarationRule());
                            						}
                            						set(
                            							current,
                            							"name",
                            							lv_name_7_0,
                            							"org.omg.sysml.Alf.Name");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:5791:4: (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==46) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // InternalAlf.g:5792:5: otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) )
                            {
                            otherlv_8=(Token)match(input,46,FOLLOW_15); 

                            					newLeafNode(otherlv_8, grammarAccess.getConnectorDeclarationAccess().getColonKeyword_1_1_0());
                            				
                            // InternalAlf.g:5796:5: ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) )
                            // InternalAlf.g:5797:6: (lv_ownedRelationship_9_0= ruleConnectorTyping )
                            {
                            // InternalAlf.g:5797:6: (lv_ownedRelationship_9_0= ruleConnectorTyping )
                            // InternalAlf.g:5798:7: lv_ownedRelationship_9_0= ruleConnectorTyping
                            {

                            							newCompositeNode(grammarAccess.getConnectorDeclarationAccess().getOwnedRelationshipConnectorTypingParserRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_57);
                            lv_ownedRelationship_9_0=ruleConnectorTyping();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getConnectorDeclarationRule());
                            							}
                            							add(
                            								current,
                            								"ownedRelationship",
                            								lv_ownedRelationship_9_0,
                            								"org.omg.sysml.Alf.ConnectorTyping");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,40,FOLLOW_82); 

                    				newLeafNode(otherlv_10, grammarAccess.getConnectorDeclarationAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalAlf.g:5820:4: ( (lv_ownedRelationship_11_0= ruleConnectorEnd ) )
                    // InternalAlf.g:5821:5: (lv_ownedRelationship_11_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:5821:5: (lv_ownedRelationship_11_0= ruleConnectorEnd )
                    // InternalAlf.g:5822:6: lv_ownedRelationship_11_0= ruleConnectorEnd
                    {

                    						newCompositeNode(grammarAccess.getConnectorDeclarationAccess().getOwnedRelationshipConnectorEndParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_85);
                    lv_ownedRelationship_11_0=ruleConnectorEnd();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectorDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelationship",
                    							lv_ownedRelationship_11_0,
                    							"org.omg.sysml.Alf.ConnectorEnd");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,38,FOLLOW_82); 

                    				newLeafNode(otherlv_12, grammarAccess.getConnectorDeclarationAccess().getCommaKeyword_1_4());
                    			
                    // InternalAlf.g:5843:4: ( (lv_ownedRelationship_13_0= ruleConnectorEnd ) )
                    // InternalAlf.g:5844:5: (lv_ownedRelationship_13_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:5844:5: (lv_ownedRelationship_13_0= ruleConnectorEnd )
                    // InternalAlf.g:5845:6: lv_ownedRelationship_13_0= ruleConnectorEnd
                    {

                    						newCompositeNode(grammarAccess.getConnectorDeclarationAccess().getOwnedRelationshipConnectorEndParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_ownedRelationship_13_0=ruleConnectorEnd();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectorDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelationship",
                    							lv_ownedRelationship_13_0,
                    							"org.omg.sysml.Alf.ConnectorEnd");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:5862:4: (otherlv_14= ',' ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) ) )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==38) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // InternalAlf.g:5863:5: otherlv_14= ',' ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) )
                    	    {
                    	    otherlv_14=(Token)match(input,38,FOLLOW_82); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getConnectorDeclarationAccess().getCommaKeyword_1_6_0());
                    	    				
                    	    // InternalAlf.g:5867:5: ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) )
                    	    // InternalAlf.g:5868:6: (lv_ownedRelationship_15_0= ruleConnectorEnd )
                    	    {
                    	    // InternalAlf.g:5868:6: (lv_ownedRelationship_15_0= ruleConnectorEnd )
                    	    // InternalAlf.g:5869:7: lv_ownedRelationship_15_0= ruleConnectorEnd
                    	    {

                    	    							newCompositeNode(grammarAccess.getConnectorDeclarationAccess().getOwnedRelationshipConnectorEndParserRuleCall_1_6_1_0());
                    	    						
                    	    pushFollow(FOLLOW_59);
                    	    lv_ownedRelationship_15_0=ruleConnectorEnd();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConnectorDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedRelationship",
                    	    								lv_ownedRelationship_15_0,
                    	    								"org.omg.sysml.Alf.ConnectorEnd");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop102;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getConnectorDeclarationAccess().getRightParenthesisKeyword_1_7());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectorDeclaration"


    // $ANTLR start "entryRuleConnectorTyping"
    // InternalAlf.g:5896:1: entryRuleConnectorTyping returns [EObject current=null] : iv_ruleConnectorTyping= ruleConnectorTyping EOF ;
    public final EObject entryRuleConnectorTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorTyping = null;


        try {
            // InternalAlf.g:5896:56: (iv_ruleConnectorTyping= ruleConnectorTyping EOF )
            // InternalAlf.g:5897:2: iv_ruleConnectorTyping= ruleConnectorTyping EOF
            {
             newCompositeNode(grammarAccess.getConnectorTypingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectorTyping=ruleConnectorTyping();

            state._fsp--;

             current =iv_ruleConnectorTyping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnectorTyping"


    // $ANTLR start "ruleConnectorTyping"
    // InternalAlf.g:5903:1: ruleConnectorTyping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleConnectorTyping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:5909:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:5910:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:5910:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:5911:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:5911:3: ( ruleQualifiedName )
            // InternalAlf.g:5912:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getConnectorTypingRule());
            				}
            			

            				newCompositeNode(grammarAccess.getConnectorTypingAccess().getTypeAssociationCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectorTyping"


    // $ANTLR start "entryRuleConnectorEnd"
    // InternalAlf.g:5929:1: entryRuleConnectorEnd returns [EObject current=null] : iv_ruleConnectorEnd= ruleConnectorEnd EOF ;
    public final EObject entryRuleConnectorEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorEnd = null;


        try {
            // InternalAlf.g:5929:53: (iv_ruleConnectorEnd= ruleConnectorEnd EOF )
            // InternalAlf.g:5930:2: iv_ruleConnectorEnd= ruleConnectorEnd EOF
            {
             newCompositeNode(grammarAccess.getConnectorEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectorEnd=ruleConnectorEnd();

            state._fsp--;

             current =iv_ruleConnectorEnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnectorEnd"


    // $ANTLR start "ruleConnectorEnd"
    // InternalAlf.g:5936:1: ruleConnectorEnd returns [EObject current=null] : ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleConnectorEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_ownedRelationship_3_0 = null;

        EObject lv_ownedRelationship_5_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5942:2: ( ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) ) )
            // InternalAlf.g:5943:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )
            {
            // InternalAlf.g:5943:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )
            int alt107=2;
            alt107 = dfa107.predict(input);
            switch (alt107) {
                case 1 :
                    // InternalAlf.g:5944:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_3_0= ruleMultiplicity ) )? )
                    {
                    // InternalAlf.g:5944:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_3_0= ruleMultiplicity ) )? )
                    // InternalAlf.g:5945:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_3_0= ruleMultiplicity ) )?
                    {
                    // InternalAlf.g:5945:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )?
                    int alt104=2;
                    alt104 = dfa104.predict(input);
                    switch (alt104) {
                        case 1 :
                            // InternalAlf.g:5946:5: ( ( ruleQualifiedName ) ) otherlv_1= ':'
                            {
                            // InternalAlf.g:5946:5: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:5947:6: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:5947:6: ( ruleQualifiedName )
                            // InternalAlf.g:5948:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConnectorEndRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getConnectorEndAccess().getEndFeatureCrossReference_0_0_0_0());
                            						
                            pushFollow(FOLLOW_86);
                            ruleQualifiedName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_1=(Token)match(input,46,FOLLOW_15); 

                            					newLeafNode(otherlv_1, grammarAccess.getConnectorEndAccess().getColonKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:5967:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:5968:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:5968:5: ( ruleQualifiedName )
                    // InternalAlf.g:5969:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectorEndRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConnectorEndAccess().getFeatureFeatureCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_87);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:5983:4: ( (lv_ownedRelationship_3_0= ruleMultiplicity ) )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==51) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // InternalAlf.g:5984:5: (lv_ownedRelationship_3_0= ruleMultiplicity )
                            {
                            // InternalAlf.g:5984:5: (lv_ownedRelationship_3_0= ruleMultiplicity )
                            // InternalAlf.g:5985:6: lv_ownedRelationship_3_0= ruleMultiplicity
                            {

                            						newCompositeNode(grammarAccess.getConnectorEndAccess().getOwnedRelationshipMultiplicityParserRuleCall_0_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_ownedRelationship_3_0=ruleMultiplicity();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getConnectorEndRule());
                            						}
                            						add(
                            							current,
                            							"ownedRelationship",
                            							lv_ownedRelationship_3_0,
                            							"org.omg.sysml.Alf.Multiplicity");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:6004:3: ( ( ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalAlf.g:6004:3: ( ( ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) )
                    // InternalAlf.g:6005:4: ( ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) )
                    {
                    // InternalAlf.g:6005:4: ( ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )? otherlv_6= '=>' )
                    // InternalAlf.g:6006:5: ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )? otherlv_6= '=>'
                    {
                    // InternalAlf.g:6006:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:6007:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:6007:6: ( ruleQualifiedName )
                    // InternalAlf.g:6008:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConnectorEndRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getConnectorEndAccess().getEndFeatureCrossReference_1_0_0_0());
                    						
                    pushFollow(FOLLOW_88);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:6022:5: ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==51) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // InternalAlf.g:6023:6: (lv_ownedRelationship_5_0= ruleMultiplicity )
                            {
                            // InternalAlf.g:6023:6: (lv_ownedRelationship_5_0= ruleMultiplicity )
                            // InternalAlf.g:6024:7: lv_ownedRelationship_5_0= ruleMultiplicity
                            {

                            							newCompositeNode(grammarAccess.getConnectorEndAccess().getOwnedRelationshipMultiplicityParserRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_89);
                            lv_ownedRelationship_5_0=ruleMultiplicity();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getConnectorEndRule());
                            							}
                            							add(
                            								current,
                            								"ownedRelationship",
                            								lv_ownedRelationship_5_0,
                            								"org.omg.sysml.Alf.Multiplicity");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,56,FOLLOW_15); 

                    					newLeafNode(otherlv_6, grammarAccess.getConnectorEndAccess().getEqualsSignGreaterThanSignKeyword_1_0_2());
                    				

                    }

                    // InternalAlf.g:6046:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:6047:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:6047:5: ( ruleQualifiedName )
                    // InternalAlf.g:6048:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectorEndRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConnectorEndAccess().getFeatureFeatureCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectorEnd"


    // $ANTLR start "entryRuleParameterDefinition"
    // InternalAlf.g:6067:1: entryRuleParameterDefinition returns [EObject current=null] : iv_ruleParameterDefinition= ruleParameterDefinition EOF ;
    public final EObject entryRuleParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDefinition = null;


        try {
            // InternalAlf.g:6067:60: (iv_ruleParameterDefinition= ruleParameterDefinition EOF )
            // InternalAlf.g:6068:2: iv_ruleParameterDefinition= ruleParameterDefinition EOF
            {
             newCompositeNode(grammarAccess.getParameterDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDefinition=ruleParameterDefinition();

            state._fsp--;

             current =iv_ruleParameterDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDefinition"


    // $ANTLR start "ruleParameterDefinition"
    // InternalAlf.g:6074:1: ruleParameterDefinition returns [EObject current=null] : this_TypePart_0= ruleTypePart[$current] ;
    public final EObject ruleParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_TypePart_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:6080:2: (this_TypePart_0= ruleTypePart[$current] )
            // InternalAlf.g:6081:2: this_TypePart_0= ruleTypePart[$current]
            {

            		if (current==null) {
            			current = createModelElement(grammarAccess.getParameterDefinitionRule());
            		}
            		newCompositeNode(grammarAccess.getParameterDefinitionAccess().getTypePartParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_TypePart_0=ruleTypePart(current);

            state._fsp--;


            		current = this_TypePart_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDefinition"


    // $ANTLR start "entryRuleStepDefinition"
    // InternalAlf.g:6095:1: entryRuleStepDefinition returns [EObject current=null] : iv_ruleStepDefinition= ruleStepDefinition EOF ;
    public final EObject entryRuleStepDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepDefinition = null;


        try {
            // InternalAlf.g:6095:55: (iv_ruleStepDefinition= ruleStepDefinition EOF )
            // InternalAlf.g:6096:2: iv_ruleStepDefinition= ruleStepDefinition EOF
            {
             newCompositeNode(grammarAccess.getStepDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStepDefinition=ruleStepDefinition();

            state._fsp--;

             current =iv_ruleStepDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStepDefinition"


    // $ANTLR start "ruleStepDefinition"
    // InternalAlf.g:6102:1: ruleStepDefinition returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'step' ( ( ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_SubsettingPart_4= ruleSubsettingPart[$current] ) | (otherlv_5= 'redefines' ( (lv_ownedRelationship_6_0= ruleRedefinition ) ) (this_ParameterList_7= ruleParameterList[$current] )? ) ) this_BehaviorBody_8= ruleBehaviorBody[$current] ) ;
    public final EObject ruleStepDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject this_ParameterList_3 = null;

        EObject this_SubsettingPart_4 = null;

        EObject lv_ownedRelationship_6_0 = null;

        EObject this_ParameterList_7 = null;

        EObject this_BehaviorBody_8 = null;



        	enterRule();

        try {
            // InternalAlf.g:6108:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'step' ( ( ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_SubsettingPart_4= ruleSubsettingPart[$current] ) | (otherlv_5= 'redefines' ( (lv_ownedRelationship_6_0= ruleRedefinition ) ) (this_ParameterList_7= ruleParameterList[$current] )? ) ) this_BehaviorBody_8= ruleBehaviorBody[$current] ) )
            // InternalAlf.g:6109:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'step' ( ( ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_SubsettingPart_4= ruleSubsettingPart[$current] ) | (otherlv_5= 'redefines' ( (lv_ownedRelationship_6_0= ruleRedefinition ) ) (this_ParameterList_7= ruleParameterList[$current] )? ) ) this_BehaviorBody_8= ruleBehaviorBody[$current] )
            {
            // InternalAlf.g:6109:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'step' ( ( ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_SubsettingPart_4= ruleSubsettingPart[$current] ) | (otherlv_5= 'redefines' ( (lv_ownedRelationship_6_0= ruleRedefinition ) ) (this_ParameterList_7= ruleParameterList[$current] )? ) ) this_BehaviorBody_8= ruleBehaviorBody[$current] )
            // InternalAlf.g:6110:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'step' ( ( ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_SubsettingPart_4= ruleSubsettingPart[$current] ) | (otherlv_5= 'redefines' ( (lv_ownedRelationship_6_0= ruleRedefinition ) ) (this_ParameterList_7= ruleParameterList[$current] )? ) ) this_BehaviorBody_8= ruleBehaviorBody[$current]
            {
            // InternalAlf.g:6110:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==33) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalAlf.g:6111:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:6111:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:6112:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,33,FOLLOW_90); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getStepDefinitionAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStepDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,42,FOLLOW_91); 

            			newLeafNode(otherlv_1, grammarAccess.getStepDefinitionAccess().getStepKeyword_1());
            		
            // InternalAlf.g:6128:3: ( ( ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_SubsettingPart_4= ruleSubsettingPart[$current] ) | (otherlv_5= 'redefines' ( (lv_ownedRelationship_6_0= ruleRedefinition ) ) (this_ParameterList_7= ruleParameterList[$current] )? ) )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( ((LA110_0>=RULE_ID && LA110_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt110=1;
            }
            else if ( (LA110_0==44) ) {
                alt110=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // InternalAlf.g:6129:4: ( ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_SubsettingPart_4= ruleSubsettingPart[$current] )
                    {
                    // InternalAlf.g:6129:4: ( ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_SubsettingPart_4= ruleSubsettingPart[$current] )
                    // InternalAlf.g:6130:5: ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_SubsettingPart_4= ruleSubsettingPart[$current]
                    {
                    // InternalAlf.g:6130:5: ( (lv_name_2_0= ruleName ) )
                    // InternalAlf.g:6131:6: (lv_name_2_0= ruleName )
                    {
                    // InternalAlf.g:6131:6: (lv_name_2_0= ruleName )
                    // InternalAlf.g:6132:7: lv_name_2_0= ruleName
                    {

                    							newCompositeNode(grammarAccess.getStepDefinitionAccess().getNameNameParserRuleCall_2_0_0_0());
                    						
                    pushFollow(FOLLOW_57);
                    lv_name_2_0=ruleName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getStepDefinitionRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_2_0,
                    								"org.omg.sysml.Alf.Name");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStepDefinitionRule());
                    					}
                    					newCompositeNode(grammarAccess.getStepDefinitionAccess().getParameterListParserRuleCall_2_0_1());
                    				
                    pushFollow(FOLLOW_92);
                    this_ParameterList_3=ruleParameterList(current);

                    state._fsp--;


                    					current = this_ParameterList_3;
                    					afterParserOrEnumRuleCall();
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStepDefinitionRule());
                    					}
                    					newCompositeNode(grammarAccess.getStepDefinitionAccess().getSubsettingPartParserRuleCall_2_0_2());
                    				
                    pushFollow(FOLLOW_43);
                    this_SubsettingPart_4=ruleSubsettingPart(current);

                    state._fsp--;


                    					current = this_SubsettingPart_4;
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:6173:4: (otherlv_5= 'redefines' ( (lv_ownedRelationship_6_0= ruleRedefinition ) ) (this_ParameterList_7= ruleParameterList[$current] )? )
                    {
                    // InternalAlf.g:6173:4: (otherlv_5= 'redefines' ( (lv_ownedRelationship_6_0= ruleRedefinition ) ) (this_ParameterList_7= ruleParameterList[$current] )? )
                    // InternalAlf.g:6174:5: otherlv_5= 'redefines' ( (lv_ownedRelationship_6_0= ruleRedefinition ) ) (this_ParameterList_7= ruleParameterList[$current] )?
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_15); 

                    					newLeafNode(otherlv_5, grammarAccess.getStepDefinitionAccess().getRedefinesKeyword_2_1_0());
                    				
                    // InternalAlf.g:6178:5: ( (lv_ownedRelationship_6_0= ruleRedefinition ) )
                    // InternalAlf.g:6179:6: (lv_ownedRelationship_6_0= ruleRedefinition )
                    {
                    // InternalAlf.g:6179:6: (lv_ownedRelationship_6_0= ruleRedefinition )
                    // InternalAlf.g:6180:7: lv_ownedRelationship_6_0= ruleRedefinition
                    {

                    							newCompositeNode(grammarAccess.getStepDefinitionAccess().getOwnedRelationshipRedefinitionParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_93);
                    lv_ownedRelationship_6_0=ruleRedefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getStepDefinitionRule());
                    							}
                    							add(
                    								current,
                    								"ownedRelationship",
                    								lv_ownedRelationship_6_0,
                    								"org.omg.sysml.Alf.Redefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:6197:5: (this_ParameterList_7= ruleParameterList[$current] )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==40) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // InternalAlf.g:6198:6: this_ParameterList_7= ruleParameterList[$current]
                            {

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getStepDefinitionRule());
                            						}
                            						newCompositeNode(grammarAccess.getStepDefinitionAccess().getParameterListParserRuleCall_2_1_2());
                            					
                            pushFollow(FOLLOW_43);
                            this_ParameterList_7=ruleParameterList(current);

                            state._fsp--;


                            						current = this_ParameterList_7;
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getStepDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getStepDefinitionAccess().getBehaviorBodyParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            this_BehaviorBody_8=ruleBehaviorBody(current);

            state._fsp--;


            			current = this_BehaviorBody_8;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStepDefinition"


    // $ANTLR start "entryRuleExpressionDefinition"
    // InternalAlf.g:6227:1: entryRuleExpressionDefinition returns [EObject current=null] : iv_ruleExpressionDefinition= ruleExpressionDefinition EOF ;
    public final EObject entryRuleExpressionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionDefinition = null;


        try {
            // InternalAlf.g:6227:61: (iv_ruleExpressionDefinition= ruleExpressionDefinition EOF )
            // InternalAlf.g:6228:2: iv_ruleExpressionDefinition= ruleExpressionDefinition EOF
            {
             newCompositeNode(grammarAccess.getExpressionDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionDefinition=ruleExpressionDefinition();

            state._fsp--;

             current =iv_ruleExpressionDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionDefinition"


    // $ANTLR start "ruleExpressionDefinition"
    // InternalAlf.g:6234:1: ruleExpressionDefinition returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'expr' ( ( ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] this_SubsettingPart_5= ruleSubsettingPart[$current] ) | (otherlv_6= 'redefines' ( (lv_ownedRelationship_7_0= ruleRedefinition ) ) (this_ParameterList_8= ruleParameterList[$current] this_ReturnParameterPart_9= ruleReturnParameterPart[$current] )? ) ) this_FunctionBody_10= ruleFunctionBody[$current] ) ;
    public final EObject ruleExpressionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject this_ParameterList_3 = null;

        EObject this_ReturnParameterPart_4 = null;

        EObject this_SubsettingPart_5 = null;

        EObject lv_ownedRelationship_7_0 = null;

        EObject this_ParameterList_8 = null;

        EObject this_ReturnParameterPart_9 = null;

        EObject this_FunctionBody_10 = null;



        	enterRule();

        try {
            // InternalAlf.g:6240:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'expr' ( ( ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] this_SubsettingPart_5= ruleSubsettingPart[$current] ) | (otherlv_6= 'redefines' ( (lv_ownedRelationship_7_0= ruleRedefinition ) ) (this_ParameterList_8= ruleParameterList[$current] this_ReturnParameterPart_9= ruleReturnParameterPart[$current] )? ) ) this_FunctionBody_10= ruleFunctionBody[$current] ) )
            // InternalAlf.g:6241:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'expr' ( ( ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] this_SubsettingPart_5= ruleSubsettingPart[$current] ) | (otherlv_6= 'redefines' ( (lv_ownedRelationship_7_0= ruleRedefinition ) ) (this_ParameterList_8= ruleParameterList[$current] this_ReturnParameterPart_9= ruleReturnParameterPart[$current] )? ) ) this_FunctionBody_10= ruleFunctionBody[$current] )
            {
            // InternalAlf.g:6241:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'expr' ( ( ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] this_SubsettingPart_5= ruleSubsettingPart[$current] ) | (otherlv_6= 'redefines' ( (lv_ownedRelationship_7_0= ruleRedefinition ) ) (this_ParameterList_8= ruleParameterList[$current] this_ReturnParameterPart_9= ruleReturnParameterPart[$current] )? ) ) this_FunctionBody_10= ruleFunctionBody[$current] )
            // InternalAlf.g:6242:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'expr' ( ( ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] this_SubsettingPart_5= ruleSubsettingPart[$current] ) | (otherlv_6= 'redefines' ( (lv_ownedRelationship_7_0= ruleRedefinition ) ) (this_ParameterList_8= ruleParameterList[$current] this_ReturnParameterPart_9= ruleReturnParameterPart[$current] )? ) ) this_FunctionBody_10= ruleFunctionBody[$current]
            {
            // InternalAlf.g:6242:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==33) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalAlf.g:6243:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:6243:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:6244:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,33,FOLLOW_94); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getExpressionDefinitionAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpressionDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,43,FOLLOW_91); 

            			newLeafNode(otherlv_1, grammarAccess.getExpressionDefinitionAccess().getExprKeyword_1());
            		
            // InternalAlf.g:6260:3: ( ( ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] this_SubsettingPart_5= ruleSubsettingPart[$current] ) | (otherlv_6= 'redefines' ( (lv_ownedRelationship_7_0= ruleRedefinition ) ) (this_ParameterList_8= ruleParameterList[$current] this_ReturnParameterPart_9= ruleReturnParameterPart[$current] )? ) )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( ((LA113_0>=RULE_ID && LA113_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt113=1;
            }
            else if ( (LA113_0==44) ) {
                alt113=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // InternalAlf.g:6261:4: ( ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] this_SubsettingPart_5= ruleSubsettingPart[$current] )
                    {
                    // InternalAlf.g:6261:4: ( ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] this_SubsettingPart_5= ruleSubsettingPart[$current] )
                    // InternalAlf.g:6262:5: ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] this_SubsettingPart_5= ruleSubsettingPart[$current]
                    {
                    // InternalAlf.g:6262:5: ( (lv_name_2_0= ruleName ) )
                    // InternalAlf.g:6263:6: (lv_name_2_0= ruleName )
                    {
                    // InternalAlf.g:6263:6: (lv_name_2_0= ruleName )
                    // InternalAlf.g:6264:7: lv_name_2_0= ruleName
                    {

                    							newCompositeNode(grammarAccess.getExpressionDefinitionAccess().getNameNameParserRuleCall_2_0_0_0());
                    						
                    pushFollow(FOLLOW_57);
                    lv_name_2_0=ruleName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getExpressionDefinitionRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_2_0,
                    								"org.omg.sysml.Alf.Name");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpressionDefinitionRule());
                    					}
                    					newCompositeNode(grammarAccess.getExpressionDefinitionAccess().getParameterListParserRuleCall_2_0_1());
                    				
                    pushFollow(FOLLOW_65);
                    this_ParameterList_3=ruleParameterList(current);

                    state._fsp--;


                    					current = this_ParameterList_3;
                    					afterParserOrEnumRuleCall();
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpressionDefinitionRule());
                    					}
                    					newCompositeNode(grammarAccess.getExpressionDefinitionAccess().getReturnParameterPartParserRuleCall_2_0_2());
                    				
                    pushFollow(FOLLOW_92);
                    this_ReturnParameterPart_4=ruleReturnParameterPart(current);

                    state._fsp--;


                    					current = this_ReturnParameterPart_4;
                    					afterParserOrEnumRuleCall();
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpressionDefinitionRule());
                    					}
                    					newCompositeNode(grammarAccess.getExpressionDefinitionAccess().getSubsettingPartParserRuleCall_2_0_3());
                    				
                    pushFollow(FOLLOW_43);
                    this_SubsettingPart_5=ruleSubsettingPart(current);

                    state._fsp--;


                    					current = this_SubsettingPart_5;
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:6316:4: (otherlv_6= 'redefines' ( (lv_ownedRelationship_7_0= ruleRedefinition ) ) (this_ParameterList_8= ruleParameterList[$current] this_ReturnParameterPart_9= ruleReturnParameterPart[$current] )? )
                    {
                    // InternalAlf.g:6316:4: (otherlv_6= 'redefines' ( (lv_ownedRelationship_7_0= ruleRedefinition ) ) (this_ParameterList_8= ruleParameterList[$current] this_ReturnParameterPart_9= ruleReturnParameterPart[$current] )? )
                    // InternalAlf.g:6317:5: otherlv_6= 'redefines' ( (lv_ownedRelationship_7_0= ruleRedefinition ) ) (this_ParameterList_8= ruleParameterList[$current] this_ReturnParameterPart_9= ruleReturnParameterPart[$current] )?
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_15); 

                    					newLeafNode(otherlv_6, grammarAccess.getExpressionDefinitionAccess().getRedefinesKeyword_2_1_0());
                    				
                    // InternalAlf.g:6321:5: ( (lv_ownedRelationship_7_0= ruleRedefinition ) )
                    // InternalAlf.g:6322:6: (lv_ownedRelationship_7_0= ruleRedefinition )
                    {
                    // InternalAlf.g:6322:6: (lv_ownedRelationship_7_0= ruleRedefinition )
                    // InternalAlf.g:6323:7: lv_ownedRelationship_7_0= ruleRedefinition
                    {

                    							newCompositeNode(grammarAccess.getExpressionDefinitionAccess().getOwnedRelationshipRedefinitionParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_93);
                    lv_ownedRelationship_7_0=ruleRedefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getExpressionDefinitionRule());
                    							}
                    							add(
                    								current,
                    								"ownedRelationship",
                    								lv_ownedRelationship_7_0,
                    								"org.omg.sysml.Alf.Redefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:6340:5: (this_ParameterList_8= ruleParameterList[$current] this_ReturnParameterPart_9= ruleReturnParameterPart[$current] )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==40) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // InternalAlf.g:6341:6: this_ParameterList_8= ruleParameterList[$current] this_ReturnParameterPart_9= ruleReturnParameterPart[$current]
                            {

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getExpressionDefinitionRule());
                            						}
                            						newCompositeNode(grammarAccess.getExpressionDefinitionAccess().getParameterListParserRuleCall_2_1_2_0());
                            					
                            pushFollow(FOLLOW_65);
                            this_ParameterList_8=ruleParameterList(current);

                            state._fsp--;


                            						current = this_ParameterList_8;
                            						afterParserOrEnumRuleCall();
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getExpressionDefinitionRule());
                            						}
                            						newCompositeNode(grammarAccess.getExpressionDefinitionAccess().getReturnParameterPartParserRuleCall_2_1_2_1());
                            					
                            pushFollow(FOLLOW_43);
                            this_ReturnParameterPart_9=ruleReturnParameterPart(current);

                            state._fsp--;


                            						current = this_ReturnParameterPart_9;
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getExpressionDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getExpressionDefinitionAccess().getFunctionBodyParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            this_FunctionBody_10=ruleFunctionBody(current);

            state._fsp--;


            			current = this_FunctionBody_10;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionDefinition"


    // $ANTLR start "entryRuleExpression"
    // InternalAlf.g:6381:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAlf.g:6381:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAlf.g:6382:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalAlf.g:6388:1: ruleExpression returns [EObject current=null] : this_ConditionalTestExpression_0= ruleConditionalTestExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalTestExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:6394:2: (this_ConditionalTestExpression_0= ruleConditionalTestExpression )
            // InternalAlf.g:6395:2: this_ConditionalTestExpression_0= ruleConditionalTestExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getConditionalTestExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ConditionalTestExpression_0=ruleConditionalTestExpression();

            state._fsp--;


            		current = this_ConditionalTestExpression_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleConditionalTestExpression"
    // InternalAlf.g:6406:1: entryRuleConditionalTestExpression returns [EObject current=null] : iv_ruleConditionalTestExpression= ruleConditionalTestExpression EOF ;
    public final EObject entryRuleConditionalTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalTestExpression = null;


        try {
            // InternalAlf.g:6406:66: (iv_ruleConditionalTestExpression= ruleConditionalTestExpression EOF )
            // InternalAlf.g:6407:2: iv_ruleConditionalTestExpression= ruleConditionalTestExpression EOF
            {
             newCompositeNode(grammarAccess.getConditionalTestExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalTestExpression=ruleConditionalTestExpression();

            state._fsp--;

             current =iv_ruleConditionalTestExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalTestExpression"


    // $ANTLR start "ruleConditionalTestExpression"
    // InternalAlf.g:6413:1: ruleConditionalTestExpression returns [EObject current=null] : (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_3_0= ruleConditionalOrExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalTestExpression ) ) )? ) ;
    public final EObject ruleConditionalTestExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_ConditionalOrExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;

        EObject lv_operand_5_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:6419:2: ( (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_3_0= ruleConditionalOrExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalTestExpression ) ) )? ) )
            // InternalAlf.g:6420:2: (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_3_0= ruleConditionalOrExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalTestExpression ) ) )? )
            {
            // InternalAlf.g:6420:2: (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_3_0= ruleConditionalOrExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalTestExpression ) ) )? )
            // InternalAlf.g:6421:3: this_ConditionalOrExpression_0= ruleConditionalOrExpression ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_3_0= ruleConditionalOrExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalTestExpression ) ) )?
            {

            			newCompositeNode(grammarAccess.getConditionalTestExpressionAccess().getConditionalOrExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_95);
            this_ConditionalOrExpression_0=ruleConditionalOrExpression();

            state._fsp--;


            			current = this_ConditionalOrExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:6429:3: ( () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_3_0= ruleConditionalOrExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalTestExpression ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==57) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalAlf.g:6430:4: () ( (lv_operator_2_0= ruleConditionalTestOperator ) ) ( (lv_operand_3_0= ruleConditionalOrExpression ) ) otherlv_4= ':' ( (lv_operand_5_0= ruleConditionalTestExpression ) )
                    {
                    // InternalAlf.g:6430:4: ()
                    // InternalAlf.g:6431:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getConditionalTestExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:6437:4: ( (lv_operator_2_0= ruleConditionalTestOperator ) )
                    // InternalAlf.g:6438:5: (lv_operator_2_0= ruleConditionalTestOperator )
                    {
                    // InternalAlf.g:6438:5: (lv_operator_2_0= ruleConditionalTestOperator )
                    // InternalAlf.g:6439:6: lv_operator_2_0= ruleConditionalTestOperator
                    {

                    						newCompositeNode(grammarAccess.getConditionalTestExpressionAccess().getOperatorConditionalTestOperatorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_72);
                    lv_operator_2_0=ruleConditionalTestOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalTestExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_2_0,
                    							"org.omg.sysml.Alf.ConditionalTestOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:6456:4: ( (lv_operand_3_0= ruleConditionalOrExpression ) )
                    // InternalAlf.g:6457:5: (lv_operand_3_0= ruleConditionalOrExpression )
                    {
                    // InternalAlf.g:6457:5: (lv_operand_3_0= ruleConditionalOrExpression )
                    // InternalAlf.g:6458:6: lv_operand_3_0= ruleConditionalOrExpression
                    {

                    						newCompositeNode(grammarAccess.getConditionalTestExpressionAccess().getOperandConditionalOrExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_86);
                    lv_operand_3_0=ruleConditionalOrExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalTestExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_3_0,
                    							"org.omg.sysml.Alf.ConditionalOrExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,46,FOLLOW_72); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionalTestExpressionAccess().getColonKeyword_1_3());
                    			
                    // InternalAlf.g:6479:4: ( (lv_operand_5_0= ruleConditionalTestExpression ) )
                    // InternalAlf.g:6480:5: (lv_operand_5_0= ruleConditionalTestExpression )
                    {
                    // InternalAlf.g:6480:5: (lv_operand_5_0= ruleConditionalTestExpression )
                    // InternalAlf.g:6481:6: lv_operand_5_0= ruleConditionalTestExpression
                    {

                    						newCompositeNode(grammarAccess.getConditionalTestExpressionAccess().getOperandConditionalTestExpressionParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_5_0=ruleConditionalTestExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalTestExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_5_0,
                    							"org.omg.sysml.Alf.ConditionalTestExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalTestExpression"


    // $ANTLR start "entryRuleConditionalTestOperator"
    // InternalAlf.g:6503:1: entryRuleConditionalTestOperator returns [String current=null] : iv_ruleConditionalTestOperator= ruleConditionalTestOperator EOF ;
    public final String entryRuleConditionalTestOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionalTestOperator = null;


        try {
            // InternalAlf.g:6503:63: (iv_ruleConditionalTestOperator= ruleConditionalTestOperator EOF )
            // InternalAlf.g:6504:2: iv_ruleConditionalTestOperator= ruleConditionalTestOperator EOF
            {
             newCompositeNode(grammarAccess.getConditionalTestOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalTestOperator=ruleConditionalTestOperator();

            state._fsp--;

             current =iv_ruleConditionalTestOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalTestOperator"


    // $ANTLR start "ruleConditionalTestOperator"
    // InternalAlf.g:6510:1: ruleConditionalTestOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '?' ;
    public final AntlrDatatypeRuleToken ruleConditionalTestOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:6516:2: (kw= '?' )
            // InternalAlf.g:6517:2: kw= '?'
            {
            kw=(Token)match(input,57,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getConditionalTestOperatorAccess().getQuestionMarkKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalTestOperator"


    // $ANTLR start "entryRuleConditionalOrExpression"
    // InternalAlf.g:6525:1: entryRuleConditionalOrExpression returns [EObject current=null] : iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF ;
    public final EObject entryRuleConditionalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalOrExpression = null;


        try {
            // InternalAlf.g:6525:64: (iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF )
            // InternalAlf.g:6526:2: iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF
            {
             newCompositeNode(grammarAccess.getConditionalOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalOrExpression=ruleConditionalOrExpression();

            state._fsp--;

             current =iv_ruleConditionalOrExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalOrExpression"


    // $ANTLR start "ruleConditionalOrExpression"
    // InternalAlf.g:6532:1: ruleConditionalOrExpression returns [EObject current=null] : (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_3_0= ruleConditionalAndExpression ) ) )* ) ;
    public final EObject ruleConditionalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalAndExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:6538:2: ( (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_3_0= ruleConditionalAndExpression ) ) )* ) )
            // InternalAlf.g:6539:2: (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_3_0= ruleConditionalAndExpression ) ) )* )
            {
            // InternalAlf.g:6539:2: (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_3_0= ruleConditionalAndExpression ) ) )* )
            // InternalAlf.g:6540:3: this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_3_0= ruleConditionalAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getConditionalOrExpressionAccess().getConditionalAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_96);
            this_ConditionalAndExpression_0=ruleConditionalAndExpression();

            state._fsp--;


            			current = this_ConditionalAndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:6548:3: ( () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_3_0= ruleConditionalAndExpression ) ) )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==58) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // InternalAlf.g:6549:4: () ( (lv_operator_2_0= ruleConditionalOrOperator ) ) ( (lv_operand_3_0= ruleConditionalAndExpression ) )
            	    {
            	    // InternalAlf.g:6549:4: ()
            	    // InternalAlf.g:6550:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getConditionalOrExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlf.g:6556:4: ( (lv_operator_2_0= ruleConditionalOrOperator ) )
            	    // InternalAlf.g:6557:5: (lv_operator_2_0= ruleConditionalOrOperator )
            	    {
            	    // InternalAlf.g:6557:5: (lv_operator_2_0= ruleConditionalOrOperator )
            	    // InternalAlf.g:6558:6: lv_operator_2_0= ruleConditionalOrOperator
            	    {

            	    						newCompositeNode(grammarAccess.getConditionalOrExpressionAccess().getOperatorConditionalOrOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_72);
            	    lv_operator_2_0=ruleConditionalOrOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConditionalOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.omg.sysml.Alf.ConditionalOrOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAlf.g:6575:4: ( (lv_operand_3_0= ruleConditionalAndExpression ) )
            	    // InternalAlf.g:6576:5: (lv_operand_3_0= ruleConditionalAndExpression )
            	    {
            	    // InternalAlf.g:6576:5: (lv_operand_3_0= ruleConditionalAndExpression )
            	    // InternalAlf.g:6577:6: lv_operand_3_0= ruleConditionalAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getConditionalOrExpressionAccess().getOperandConditionalAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_96);
            	    lv_operand_3_0=ruleConditionalAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConditionalOrExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_3_0,
            	    							"org.omg.sysml.Alf.ConditionalAndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalOrExpression"


    // $ANTLR start "entryRuleConditionalOrOperator"
    // InternalAlf.g:6599:1: entryRuleConditionalOrOperator returns [String current=null] : iv_ruleConditionalOrOperator= ruleConditionalOrOperator EOF ;
    public final String entryRuleConditionalOrOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionalOrOperator = null;


        try {
            // InternalAlf.g:6599:61: (iv_ruleConditionalOrOperator= ruleConditionalOrOperator EOF )
            // InternalAlf.g:6600:2: iv_ruleConditionalOrOperator= ruleConditionalOrOperator EOF
            {
             newCompositeNode(grammarAccess.getConditionalOrOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalOrOperator=ruleConditionalOrOperator();

            state._fsp--;

             current =iv_ruleConditionalOrOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalOrOperator"


    // $ANTLR start "ruleConditionalOrOperator"
    // InternalAlf.g:6606:1: ruleConditionalOrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleConditionalOrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:6612:2: (kw= '||' )
            // InternalAlf.g:6613:2: kw= '||'
            {
            kw=(Token)match(input,58,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getConditionalOrOperatorAccess().getVerticalLineVerticalLineKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalOrOperator"


    // $ANTLR start "entryRuleConditionalAndExpression"
    // InternalAlf.g:6621:1: entryRuleConditionalAndExpression returns [EObject current=null] : iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF ;
    public final EObject entryRuleConditionalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalAndExpression = null;


        try {
            // InternalAlf.g:6621:65: (iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF )
            // InternalAlf.g:6622:2: iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF
            {
             newCompositeNode(grammarAccess.getConditionalAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalAndExpression=ruleConditionalAndExpression();

            state._fsp--;

             current =iv_ruleConditionalAndExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalAndExpression"


    // $ANTLR start "ruleConditionalAndExpression"
    // InternalAlf.g:6628:1: ruleConditionalAndExpression returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) ) )* ) ;
    public final EObject ruleConditionalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:6634:2: ( (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) ) )* ) )
            // InternalAlf.g:6635:2: (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) ) )* )
            {
            // InternalAlf.g:6635:2: (this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) ) )* )
            // InternalAlf.g:6636:3: this_OrExpression_0= ruleOrExpression ( () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getConditionalAndExpressionAccess().getOrExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_97);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;


            			current = this_OrExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:6644:3: ( () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) ) )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==59) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // InternalAlf.g:6645:4: () ( (lv_operator_2_0= ruleConditionalAndOperator ) ) ( (lv_operand_3_0= ruleOrExpression ) )
            	    {
            	    // InternalAlf.g:6645:4: ()
            	    // InternalAlf.g:6646:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getConditionalAndExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlf.g:6652:4: ( (lv_operator_2_0= ruleConditionalAndOperator ) )
            	    // InternalAlf.g:6653:5: (lv_operator_2_0= ruleConditionalAndOperator )
            	    {
            	    // InternalAlf.g:6653:5: (lv_operator_2_0= ruleConditionalAndOperator )
            	    // InternalAlf.g:6654:6: lv_operator_2_0= ruleConditionalAndOperator
            	    {

            	    						newCompositeNode(grammarAccess.getConditionalAndExpressionAccess().getOperatorConditionalAndOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_72);
            	    lv_operator_2_0=ruleConditionalAndOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConditionalAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.omg.sysml.Alf.ConditionalAndOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAlf.g:6671:4: ( (lv_operand_3_0= ruleOrExpression ) )
            	    // InternalAlf.g:6672:5: (lv_operand_3_0= ruleOrExpression )
            	    {
            	    // InternalAlf.g:6672:5: (lv_operand_3_0= ruleOrExpression )
            	    // InternalAlf.g:6673:6: lv_operand_3_0= ruleOrExpression
            	    {

            	    						newCompositeNode(grammarAccess.getConditionalAndExpressionAccess().getOperandOrExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_97);
            	    lv_operand_3_0=ruleOrExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConditionalAndExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_3_0,
            	    							"org.omg.sysml.Alf.OrExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalAndExpression"


    // $ANTLR start "entryRuleConditionalAndOperator"
    // InternalAlf.g:6695:1: entryRuleConditionalAndOperator returns [String current=null] : iv_ruleConditionalAndOperator= ruleConditionalAndOperator EOF ;
    public final String entryRuleConditionalAndOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditionalAndOperator = null;


        try {
            // InternalAlf.g:6695:62: (iv_ruleConditionalAndOperator= ruleConditionalAndOperator EOF )
            // InternalAlf.g:6696:2: iv_ruleConditionalAndOperator= ruleConditionalAndOperator EOF
            {
             newCompositeNode(grammarAccess.getConditionalAndOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalAndOperator=ruleConditionalAndOperator();

            state._fsp--;

             current =iv_ruleConditionalAndOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalAndOperator"


    // $ANTLR start "ruleConditionalAndOperator"
    // InternalAlf.g:6702:1: ruleConditionalAndOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleConditionalAndOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:6708:2: (kw= '&&' )
            // InternalAlf.g:6709:2: kw= '&&'
            {
            kw=(Token)match(input,59,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getConditionalAndOperatorAccess().getAmpersandAmpersandKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalAndOperator"


    // $ANTLR start "entryRuleOrExpression"
    // InternalAlf.g:6717:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalAlf.g:6717:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalAlf.g:6718:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalAlf.g:6724:1: ruleOrExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XorExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:6730:2: ( (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )* ) )
            // InternalAlf.g:6731:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )* )
            {
            // InternalAlf.g:6731:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )* )
            // InternalAlf.g:6732:3: this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_98);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;


            			current = this_XorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:6740:3: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==60) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // InternalAlf.g:6741:4: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) )
            	    {
            	    // InternalAlf.g:6741:4: ()
            	    // InternalAlf.g:6742:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getOrExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlf.g:6748:4: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // InternalAlf.g:6749:5: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // InternalAlf.g:6749:5: (lv_operator_2_0= ruleOrOperator )
            	    // InternalAlf.g:6750:6: lv_operator_2_0= ruleOrOperator
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_72);
            	    lv_operator_2_0=ruleOrOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.omg.sysml.Alf.OrOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAlf.g:6767:4: ( (lv_operand_3_0= ruleXorExpression ) )
            	    // InternalAlf.g:6768:5: (lv_operand_3_0= ruleXorExpression )
            	    {
            	    // InternalAlf.g:6768:5: (lv_operand_3_0= ruleXorExpression )
            	    // InternalAlf.g:6769:6: lv_operand_3_0= ruleXorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperandXorExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_98);
            	    lv_operand_3_0=ruleXorExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_3_0,
            	    							"org.omg.sysml.Alf.XorExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleOrOperator"
    // InternalAlf.g:6791:1: entryRuleOrOperator returns [String current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final String entryRuleOrOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrOperator = null;


        try {
            // InternalAlf.g:6791:50: (iv_ruleOrOperator= ruleOrOperator EOF )
            // InternalAlf.g:6792:2: iv_ruleOrOperator= ruleOrOperator EOF
            {
             newCompositeNode(grammarAccess.getOrOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrOperator=ruleOrOperator();

            state._fsp--;

             current =iv_ruleOrOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrOperator"


    // $ANTLR start "ruleOrOperator"
    // InternalAlf.g:6798:1: ruleOrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '|' ;
    public final AntlrDatatypeRuleToken ruleOrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:6804:2: (kw= '|' )
            // InternalAlf.g:6805:2: kw= '|'
            {
            kw=(Token)match(input,60,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getOrOperatorAccess().getVerticalLineKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "entryRuleXorExpression"
    // InternalAlf.g:6813:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalAlf.g:6813:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalAlf.g:6814:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
             newCompositeNode(grammarAccess.getXorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXorExpression=ruleXorExpression();

            state._fsp--;

             current =iv_ruleXorExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalAlf.g:6820:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:6826:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* ) )
            // InternalAlf.g:6827:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* )
            {
            // InternalAlf.g:6827:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* )
            // InternalAlf.g:6828:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_99);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:6836:3: ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==61) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // InternalAlf.g:6837:4: () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) )
            	    {
            	    // InternalAlf.g:6837:4: ()
            	    // InternalAlf.g:6838:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getXorExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlf.g:6844:4: ( (lv_operator_2_0= ruleXorOperator ) )
            	    // InternalAlf.g:6845:5: (lv_operator_2_0= ruleXorOperator )
            	    {
            	    // InternalAlf.g:6845:5: (lv_operator_2_0= ruleXorOperator )
            	    // InternalAlf.g:6846:6: lv_operator_2_0= ruleXorOperator
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getOperatorXorOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_72);
            	    lv_operator_2_0=ruleXorOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXorExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.omg.sysml.Alf.XorOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAlf.g:6863:4: ( (lv_operand_3_0= ruleAndExpression ) )
            	    // InternalAlf.g:6864:5: (lv_operand_3_0= ruleAndExpression )
            	    {
            	    // InternalAlf.g:6864:5: (lv_operand_3_0= ruleAndExpression )
            	    // InternalAlf.g:6865:6: lv_operand_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getOperandAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_99);
            	    lv_operand_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXorExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_3_0,
            	    							"org.omg.sysml.Alf.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleXorOperator"
    // InternalAlf.g:6887:1: entryRuleXorOperator returns [String current=null] : iv_ruleXorOperator= ruleXorOperator EOF ;
    public final String entryRuleXorOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXorOperator = null;


        try {
            // InternalAlf.g:6887:51: (iv_ruleXorOperator= ruleXorOperator EOF )
            // InternalAlf.g:6888:2: iv_ruleXorOperator= ruleXorOperator EOF
            {
             newCompositeNode(grammarAccess.getXorOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXorOperator=ruleXorOperator();

            state._fsp--;

             current =iv_ruleXorOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXorOperator"


    // $ANTLR start "ruleXorOperator"
    // InternalAlf.g:6894:1: ruleXorOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '^' ;
    public final AntlrDatatypeRuleToken ruleXorOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:6900:2: (kw= '^' )
            // InternalAlf.g:6901:2: kw= '^'
            {
            kw=(Token)match(input,61,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getXorOperatorAccess().getCircumflexAccentKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXorOperator"


    // $ANTLR start "entryRuleAndExpression"
    // InternalAlf.g:6909:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalAlf.g:6909:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalAlf.g:6910:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalAlf.g:6916:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualityExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:6922:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalAlf.g:6923:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalAlf.g:6923:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )* )
            // InternalAlf.g:6924:3: this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_100);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;


            			current = this_EqualityExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:6932:3: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==62) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // InternalAlf.g:6933:4: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalAlf.g:6933:4: ()
            	    // InternalAlf.g:6934:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAndExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlf.g:6940:4: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // InternalAlf.g:6941:5: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // InternalAlf.g:6941:5: (lv_operator_2_0= ruleAndOperator )
            	    // InternalAlf.g:6942:6: lv_operator_2_0= ruleAndOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_72);
            	    lv_operator_2_0=ruleAndOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.omg.sysml.Alf.AndOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAlf.g:6959:4: ( (lv_operand_3_0= ruleEqualityExpression ) )
            	    // InternalAlf.g:6960:5: (lv_operand_3_0= ruleEqualityExpression )
            	    {
            	    // InternalAlf.g:6960:5: (lv_operand_3_0= ruleEqualityExpression )
            	    // InternalAlf.g:6961:6: lv_operand_3_0= ruleEqualityExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperandEqualityExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_100);
            	    lv_operand_3_0=ruleEqualityExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_3_0,
            	    							"org.omg.sysml.Alf.EqualityExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop119;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleAndOperator"
    // InternalAlf.g:6983:1: entryRuleAndOperator returns [String current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final String entryRuleAndOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAndOperator = null;


        try {
            // InternalAlf.g:6983:51: (iv_ruleAndOperator= ruleAndOperator EOF )
            // InternalAlf.g:6984:2: iv_ruleAndOperator= ruleAndOperator EOF
            {
             newCompositeNode(grammarAccess.getAndOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndOperator=ruleAndOperator();

            state._fsp--;

             current =iv_ruleAndOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndOperator"


    // $ANTLR start "ruleAndOperator"
    // InternalAlf.g:6990:1: ruleAndOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&' ;
    public final AntlrDatatypeRuleToken ruleAndOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:6996:2: (kw= '&' )
            // InternalAlf.g:6997:2: kw= '&'
            {
            kw=(Token)match(input,62,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAndOperatorAccess().getAmpersandKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalAlf.g:7005:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalAlf.g:7005:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalAlf.g:7006:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;

             current =iv_ruleEqualityExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalAlf.g:7012:1: ruleEqualityExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:7018:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleRelationalExpression ) ) )* ) )
            // InternalAlf.g:7019:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleRelationalExpression ) ) )* )
            {
            // InternalAlf.g:7019:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleRelationalExpression ) ) )* )
            // InternalAlf.g:7020:3: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleRelationalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_101);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;


            			current = this_RelationalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:7028:3: ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleRelationalExpression ) ) )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( ((LA120_0>=63 && LA120_0<=64)) ) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // InternalAlf.g:7029:4: () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleRelationalExpression ) )
            	    {
            	    // InternalAlf.g:7029:4: ()
            	    // InternalAlf.g:7030:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getEqualityExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlf.g:7036:4: ( (lv_operator_2_0= ruleEqualityOperator ) )
            	    // InternalAlf.g:7037:5: (lv_operator_2_0= ruleEqualityOperator )
            	    {
            	    // InternalAlf.g:7037:5: (lv_operator_2_0= ruleEqualityOperator )
            	    // InternalAlf.g:7038:6: lv_operator_2_0= ruleEqualityOperator
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_72);
            	    lv_operator_2_0=ruleEqualityOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.omg.sysml.Alf.EqualityOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAlf.g:7055:4: ( (lv_operand_3_0= ruleRelationalExpression ) )
            	    // InternalAlf.g:7056:5: (lv_operand_3_0= ruleRelationalExpression )
            	    {
            	    // InternalAlf.g:7056:5: (lv_operand_3_0= ruleRelationalExpression )
            	    // InternalAlf.g:7057:6: lv_operand_3_0= ruleRelationalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOperandRelationalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_101);
            	    lv_operand_3_0=ruleRelationalExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_3_0,
            	    							"org.omg.sysml.Alf.RelationalExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop120;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleEqualityOperator"
    // InternalAlf.g:7079:1: entryRuleEqualityOperator returns [String current=null] : iv_ruleEqualityOperator= ruleEqualityOperator EOF ;
    public final String entryRuleEqualityOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqualityOperator = null;


        try {
            // InternalAlf.g:7079:56: (iv_ruleEqualityOperator= ruleEqualityOperator EOF )
            // InternalAlf.g:7080:2: iv_ruleEqualityOperator= ruleEqualityOperator EOF
            {
             newCompositeNode(grammarAccess.getEqualityOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityOperator=ruleEqualityOperator();

            state._fsp--;

             current =iv_ruleEqualityOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityOperator"


    // $ANTLR start "ruleEqualityOperator"
    // InternalAlf.g:7086:1: ruleEqualityOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleEqualityOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:7092:2: ( (kw= '==' | kw= '!=' ) )
            // InternalAlf.g:7093:2: (kw= '==' | kw= '!=' )
            {
            // InternalAlf.g:7093:2: (kw= '==' | kw= '!=' )
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==63) ) {
                alt121=1;
            }
            else if ( (LA121_0==64) ) {
                alt121=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }
            switch (alt121) {
                case 1 :
                    // InternalAlf.g:7094:3: kw= '=='
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:7100:3: kw= '!='
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getExclamationMarkEqualsSignKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityOperator"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalAlf.g:7109:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalAlf.g:7109:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalAlf.g:7110:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalAlf.g:7116:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:7122:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalAlf.g:7123:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalAlf.g:7123:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )* )
            // InternalAlf.g:7124:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_102);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:7132:3: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( ((LA122_0>=65 && LA122_0<=68)) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // InternalAlf.g:7133:4: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalAlf.g:7133:4: ()
            	    // InternalAlf.g:7134:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getRelationalExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlf.g:7140:4: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // InternalAlf.g:7141:5: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // InternalAlf.g:7141:5: (lv_operator_2_0= ruleRelationalOperator )
            	    // InternalAlf.g:7142:6: lv_operator_2_0= ruleRelationalOperator
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorRelationalOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_72);
            	    lv_operator_2_0=ruleRelationalOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.omg.sysml.Alf.RelationalOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAlf.g:7159:4: ( (lv_operand_3_0= ruleAdditiveExpression ) )
            	    // InternalAlf.g:7160:5: (lv_operand_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalAlf.g:7160:5: (lv_operand_3_0= ruleAdditiveExpression )
            	    // InternalAlf.g:7161:6: lv_operand_3_0= ruleAdditiveExpression
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperandAdditiveExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_102);
            	    lv_operand_3_0=ruleAdditiveExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_3_0,
            	    							"org.omg.sysml.Alf.AdditiveExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop122;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleRelationalOperator"
    // InternalAlf.g:7183:1: entryRuleRelationalOperator returns [String current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final String entryRuleRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOperator = null;


        try {
            // InternalAlf.g:7183:58: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // InternalAlf.g:7184:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
            {
             newCompositeNode(grammarAccess.getRelationalOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalOperator=ruleRelationalOperator();

            state._fsp--;

             current =iv_ruleRelationalOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalOperator"


    // $ANTLR start "ruleRelationalOperator"
    // InternalAlf.g:7190:1: ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:7196:2: ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // InternalAlf.g:7197:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // InternalAlf.g:7197:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            int alt123=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt123=1;
                }
                break;
            case 66:
                {
                alt123=2;
                }
                break;
            case 67:
                {
                alt123=3;
                }
                break;
            case 68:
                {
                alt123=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }

            switch (alt123) {
                case 1 :
                    // InternalAlf.g:7198:3: kw= '<'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:7204:3: kw= '>'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:7210:3: kw= '<='
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:7216:3: kw= '>='
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalAlf.g:7225:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalAlf.g:7225:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalAlf.g:7226:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalAlf.g:7232:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:7238:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalAlf.g:7239:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalAlf.g:7239:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalAlf.g:7240:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_103);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:7248:3: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( ((LA124_0>=69 && LA124_0<=70)) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // InternalAlf.g:7249:4: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalAlf.g:7249:4: ()
            	    // InternalAlf.g:7250:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAdditiveExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlf.g:7256:4: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // InternalAlf.g:7257:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // InternalAlf.g:7257:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    // InternalAlf.g:7258:6: lv_operator_2_0= ruleAdditiveOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_72);
            	    lv_operator_2_0=ruleAdditiveOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.omg.sysml.Alf.AdditiveOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAlf.g:7275:4: ( (lv_operand_3_0= ruleMultiplicativeExpression ) )
            	    // InternalAlf.g:7276:5: (lv_operand_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalAlf.g:7276:5: (lv_operand_3_0= ruleMultiplicativeExpression )
            	    // InternalAlf.g:7277:6: lv_operand_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperandMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_103);
            	    lv_operand_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_3_0,
            	    							"org.omg.sysml.Alf.MultiplicativeExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop124;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleAdditiveOperator"
    // InternalAlf.g:7299:1: entryRuleAdditiveOperator returns [String current=null] : iv_ruleAdditiveOperator= ruleAdditiveOperator EOF ;
    public final String entryRuleAdditiveOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAdditiveOperator = null;


        try {
            // InternalAlf.g:7299:56: (iv_ruleAdditiveOperator= ruleAdditiveOperator EOF )
            // InternalAlf.g:7300:2: iv_ruleAdditiveOperator= ruleAdditiveOperator EOF
            {
             newCompositeNode(grammarAccess.getAdditiveOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveOperator=ruleAdditiveOperator();

            state._fsp--;

             current =iv_ruleAdditiveOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // InternalAlf.g:7306:1: ruleAdditiveOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAdditiveOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:7312:2: ( (kw= '+' | kw= '-' ) )
            // InternalAlf.g:7313:2: (kw= '+' | kw= '-' )
            {
            // InternalAlf.g:7313:2: (kw= '+' | kw= '-' )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==69) ) {
                alt125=1;
            }
            else if ( (LA125_0==70) ) {
                alt125=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // InternalAlf.g:7314:3: kw= '+'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAdditiveOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:7320:3: kw= '-'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAdditiveOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalAlf.g:7329:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalAlf.g:7329:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalAlf.g:7330:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalAlf.g:7336:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnitsExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:7342:2: ( (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )* ) )
            // InternalAlf.g:7343:2: (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )* )
            {
            // InternalAlf.g:7343:2: (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )* )
            // InternalAlf.g:7344:3: this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnitsExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_104);
            this_UnitsExpression_0=ruleUnitsExpression();

            state._fsp--;


            			current = this_UnitsExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:7352:3: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==19||(LA126_0>=71 && LA126_0<=72)) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // InternalAlf.g:7353:4: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) )
            	    {
            	    // InternalAlf.g:7353:4: ()
            	    // InternalAlf.g:7354:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlf.g:7360:4: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // InternalAlf.g:7361:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalAlf.g:7361:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // InternalAlf.g:7362:6: lv_operator_2_0= ruleMultiplicativeOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_72);
            	    lv_operator_2_0=ruleMultiplicativeOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.omg.sysml.Alf.MultiplicativeOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAlf.g:7379:4: ( (lv_operand_3_0= ruleUnitsExpression ) )
            	    // InternalAlf.g:7380:5: (lv_operand_3_0= ruleUnitsExpression )
            	    {
            	    // InternalAlf.g:7380:5: (lv_operand_3_0= ruleUnitsExpression )
            	    // InternalAlf.g:7381:6: lv_operand_3_0= ruleUnitsExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperandUnitsExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_104);
            	    lv_operand_3_0=ruleUnitsExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_3_0,
            	    							"org.omg.sysml.Alf.UnitsExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop126;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleMultiplicativeOperator"
    // InternalAlf.g:7403:1: entryRuleMultiplicativeOperator returns [String current=null] : iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF ;
    public final String entryRuleMultiplicativeOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicativeOperator = null;


        try {
            // InternalAlf.g:7403:62: (iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF )
            // InternalAlf.g:7404:2: iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeOperator=ruleMultiplicativeOperator();

            state._fsp--;

             current =iv_ruleMultiplicativeOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalAlf.g:7410:1: ruleMultiplicativeOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '**' ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicativeOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:7416:2: ( (kw= '*' | kw= '/' | kw= '**' ) )
            // InternalAlf.g:7417:2: (kw= '*' | kw= '/' | kw= '**' )
            {
            // InternalAlf.g:7417:2: (kw= '*' | kw= '/' | kw= '**' )
            int alt127=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt127=1;
                }
                break;
            case 71:
                {
                alt127=2;
                }
                break;
            case 72:
                {
                alt127=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }

            switch (alt127) {
                case 1 :
                    // InternalAlf.g:7418:3: kw= '*'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:7424:3: kw= '/'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:7430:3: kw= '**'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getAsteriskAsteriskKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "entryRuleUnitsExpression"
    // InternalAlf.g:7439:1: entryRuleUnitsExpression returns [EObject current=null] : iv_ruleUnitsExpression= ruleUnitsExpression EOF ;
    public final EObject entryRuleUnitsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitsExpression = null;


        try {
            // InternalAlf.g:7439:56: (iv_ruleUnitsExpression= ruleUnitsExpression EOF )
            // InternalAlf.g:7440:2: iv_ruleUnitsExpression= ruleUnitsExpression EOF
            {
             newCompositeNode(grammarAccess.getUnitsExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnitsExpression=ruleUnitsExpression();

            state._fsp--;

             current =iv_ruleUnitsExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnitsExpression"


    // $ANTLR start "ruleUnitsExpression"
    // InternalAlf.g:7446:1: ruleUnitsExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@' ) ) otherlv_3= '[' ( (lv_operand_4_0= ruleExpression ) ) otherlv_5= ']' )? ) ;
    public final EObject ruleUnitsExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_operand_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:7452:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@' ) ) otherlv_3= '[' ( (lv_operand_4_0= ruleExpression ) ) otherlv_5= ']' )? ) )
            // InternalAlf.g:7453:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@' ) ) otherlv_3= '[' ( (lv_operand_4_0= ruleExpression ) ) otherlv_5= ']' )? )
            {
            // InternalAlf.g:7453:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@' ) ) otherlv_3= '[' ( (lv_operand_4_0= ruleExpression ) ) otherlv_5= ']' )? )
            // InternalAlf.g:7454:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@' ) ) otherlv_3= '[' ( (lv_operand_4_0= ruleExpression ) ) otherlv_5= ']' )?
            {

            			newCompositeNode(grammarAccess.getUnitsExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_105);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:7462:3: ( () ( (lv_operator_2_0= '@' ) ) otherlv_3= '[' ( (lv_operand_4_0= ruleExpression ) ) otherlv_5= ']' )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==73) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalAlf.g:7463:4: () ( (lv_operator_2_0= '@' ) ) otherlv_3= '[' ( (lv_operand_4_0= ruleExpression ) ) otherlv_5= ']'
                    {
                    // InternalAlf.g:7463:4: ()
                    // InternalAlf.g:7464:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getUnitsExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:7470:4: ( (lv_operator_2_0= '@' ) )
                    // InternalAlf.g:7471:5: (lv_operator_2_0= '@' )
                    {
                    // InternalAlf.g:7471:5: (lv_operator_2_0= '@' )
                    // InternalAlf.g:7472:6: lv_operator_2_0= '@'
                    {
                    lv_operator_2_0=(Token)match(input,73,FOLLOW_106); 

                    						newLeafNode(lv_operator_2_0, grammarAccess.getUnitsExpressionAccess().getOperatorCommercialAtKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnitsExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_2_0, "@");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,51,FOLLOW_72); 

                    				newLeafNode(otherlv_3, grammarAccess.getUnitsExpressionAccess().getLeftSquareBracketKeyword_1_2());
                    			
                    // InternalAlf.g:7488:4: ( (lv_operand_4_0= ruleExpression ) )
                    // InternalAlf.g:7489:5: (lv_operand_4_0= ruleExpression )
                    {
                    // InternalAlf.g:7489:5: (lv_operand_4_0= ruleExpression )
                    // InternalAlf.g:7490:6: lv_operand_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getUnitsExpressionAccess().getOperandExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_79);
                    lv_operand_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnitsExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_4_0,
                    							"org.omg.sysml.Alf.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,53,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getUnitsExpressionAccess().getRightSquareBracketKeyword_1_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnitsExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalAlf.g:7516:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlf.g:7516:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlf.g:7517:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalAlf.g:7523:1: ruleUnaryExpression returns [EObject current=null] : (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceAccessExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:7529:2: ( (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) )
            // InternalAlf.g:7530:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            {
            // InternalAlf.g:7530:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( ((LA129_0>=RULE_BOOLEAN_VALUE && LA129_0<=RULE_UNRESTRICTED_NAME)||(LA129_0>=18 && LA129_0<=19)||LA129_0==23||LA129_0==40||LA129_0==77) ) {
                alt129=1;
            }
            else if ( ((LA129_0>=69 && LA129_0<=70)||(LA129_0>=74 && LA129_0<=75)) ) {
                alt129=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // InternalAlf.g:7531:3: this_SequenceAccessExpression_0= ruleSequenceAccessExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getSequenceAccessExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceAccessExpression_0=ruleSequenceAccessExpression();

                    state._fsp--;


                    			current = this_SequenceAccessExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:7540:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    {
                    // InternalAlf.g:7540:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    // InternalAlf.g:7541:4: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    {
                    // InternalAlf.g:7541:4: ()
                    // InternalAlf.g:7542:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:7548:4: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // InternalAlf.g:7549:5: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // InternalAlf.g:7549:5: (lv_operator_2_0= ruleUnaryOperator )
                    // InternalAlf.g:7550:6: lv_operator_2_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_107);
                    lv_operator_2_0=ruleUnaryOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_2_0,
                    							"org.omg.sysml.Alf.UnaryOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:7567:4: ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    // InternalAlf.g:7568:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    {
                    // InternalAlf.g:7568:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    // InternalAlf.g:7569:6: lv_operand_3_0= ruleSequenceAccessExpression
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperandSequenceAccessExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_3_0=ruleSequenceAccessExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_3_0,
                    							"org.omg.sysml.Alf.SequenceAccessExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleUnaryOperator"
    // InternalAlf.g:7591:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalAlf.g:7591:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalAlf.g:7592:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
            {
             newCompositeNode(grammarAccess.getUnaryOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOperator=ruleUnaryOperator();

            state._fsp--;

             current =iv_ruleUnaryOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOperator"


    // $ANTLR start "ruleUnaryOperator"
    // InternalAlf.g:7598:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '!' | kw= '~' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:7604:2: ( (kw= '+' | kw= '-' | kw= '!' | kw= '~' ) )
            // InternalAlf.g:7605:2: (kw= '+' | kw= '-' | kw= '!' | kw= '~' )
            {
            // InternalAlf.g:7605:2: (kw= '+' | kw= '-' | kw= '!' | kw= '~' )
            int alt130=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt130=1;
                }
                break;
            case 70:
                {
                alt130=2;
                }
                break;
            case 74:
                {
                alt130=3;
                }
                break;
            case 75:
                {
                alt130=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }

            switch (alt130) {
                case 1 :
                    // InternalAlf.g:7606:3: kw= '+'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:7612:3: kw= '-'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:7618:3: kw= '!'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getExclamationMarkKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:7624:3: kw= '~'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getTildeKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "entryRuleSequenceAccessExpression"
    // InternalAlf.g:7633:1: entryRuleSequenceAccessExpression returns [EObject current=null] : iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF ;
    public final EObject entryRuleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceAccessExpression = null;


        try {
            // InternalAlf.g:7633:65: (iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF )
            // InternalAlf.g:7634:2: iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF
            {
             newCompositeNode(grammarAccess.getSequenceAccessExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceAccessExpression=ruleSequenceAccessExpression();

            state._fsp--;

             current =iv_ruleSequenceAccessExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceAccessExpression"


    // $ANTLR start "ruleSequenceAccessExpression"
    // InternalAlf.g:7640:1: ruleSequenceAccessExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:7646:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']' )? ) )
            // InternalAlf.g:7647:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']' )? )
            {
            // InternalAlf.g:7647:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']' )? )
            // InternalAlf.g:7648:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']' )?
            {

            			newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_87);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:7656:3: ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']' )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==51) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalAlf.g:7657:4: () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']'
                    {
                    // InternalAlf.g:7657:4: ()
                    // InternalAlf.g:7658:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getSequenceAccessExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:7664:4: ( (lv_operator_2_0= '[' ) )
                    // InternalAlf.g:7665:5: (lv_operator_2_0= '[' )
                    {
                    // InternalAlf.g:7665:5: (lv_operator_2_0= '[' )
                    // InternalAlf.g:7666:6: lv_operator_2_0= '['
                    {
                    lv_operator_2_0=(Token)match(input,51,FOLLOW_72); 

                    						newLeafNode(lv_operator_2_0, grammarAccess.getSequenceAccessExpressionAccess().getOperatorLeftSquareBracketKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSequenceAccessExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_2_0, "[");
                    					

                    }


                    }

                    // InternalAlf.g:7678:4: ( (lv_operand_3_0= ruleExpression ) )
                    // InternalAlf.g:7679:5: (lv_operand_3_0= ruleExpression )
                    {
                    // InternalAlf.g:7679:5: (lv_operand_3_0= ruleExpression )
                    // InternalAlf.g:7680:6: lv_operand_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getOperandExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_79);
                    lv_operand_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceAccessExpressionRule());
                    						}
                    						add(
                    							current,
                    							"operand",
                    							lv_operand_3_0,
                    							"org.omg.sysml.Alf.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,53,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getSequenceAccessExpressionAccess().getRightSquareBracketKeyword_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceAccessExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalAlf.g:7706:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalAlf.g:7706:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalAlf.g:7707:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalAlf.g:7713:1: rulePrimaryExpression returns [EObject current=null] : (this_BaseExpression_0= ruleBaseExpression ( () otherlv_2= '->' ( (lv_operator_3_0= ruleName ) ) ( (lv_operand_4_0= ruleBodyExpression ) ) )* ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BaseExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_3_0 = null;

        EObject lv_operand_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:7719:2: ( (this_BaseExpression_0= ruleBaseExpression ( () otherlv_2= '->' ( (lv_operator_3_0= ruleName ) ) ( (lv_operand_4_0= ruleBodyExpression ) ) )* ) )
            // InternalAlf.g:7720:2: (this_BaseExpression_0= ruleBaseExpression ( () otherlv_2= '->' ( (lv_operator_3_0= ruleName ) ) ( (lv_operand_4_0= ruleBodyExpression ) ) )* )
            {
            // InternalAlf.g:7720:2: (this_BaseExpression_0= ruleBaseExpression ( () otherlv_2= '->' ( (lv_operator_3_0= ruleName ) ) ( (lv_operand_4_0= ruleBodyExpression ) ) )* )
            // InternalAlf.g:7721:3: this_BaseExpression_0= ruleBaseExpression ( () otherlv_2= '->' ( (lv_operator_3_0= ruleName ) ) ( (lv_operand_4_0= ruleBodyExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBaseExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_108);
            this_BaseExpression_0=ruleBaseExpression();

            state._fsp--;


            			current = this_BaseExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:7729:3: ( () otherlv_2= '->' ( (lv_operator_3_0= ruleName ) ) ( (lv_operand_4_0= ruleBodyExpression ) ) )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==76) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // InternalAlf.g:7730:4: () otherlv_2= '->' ( (lv_operator_3_0= ruleName ) ) ( (lv_operand_4_0= ruleBodyExpression ) )
            	    {
            	    // InternalAlf.g:7730:4: ()
            	    // InternalAlf.g:7731:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getPrimaryExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,76,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalAlf.g:7741:4: ( (lv_operator_3_0= ruleName ) )
            	    // InternalAlf.g:7742:5: (lv_operator_3_0= ruleName )
            	    {
            	    // InternalAlf.g:7742:5: (lv_operator_3_0= ruleName )
            	    // InternalAlf.g:7743:6: lv_operator_3_0= ruleName
            	    {

            	    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOperatorNameParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_operator_3_0=ruleName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_3_0,
            	    							"org.omg.sysml.Alf.Name");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAlf.g:7760:4: ( (lv_operand_4_0= ruleBodyExpression ) )
            	    // InternalAlf.g:7761:5: (lv_operand_4_0= ruleBodyExpression )
            	    {
            	    // InternalAlf.g:7761:5: (lv_operand_4_0= ruleBodyExpression )
            	    // InternalAlf.g:7762:6: lv_operand_4_0= ruleBodyExpression
            	    {

            	    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOperandBodyExpressionParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_108);
            	    lv_operand_4_0=ruleBodyExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operand",
            	    							lv_operand_4_0,
            	    							"org.omg.sysml.Alf.BodyExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop132;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleBodyExpression"
    // InternalAlf.g:7784:1: entryRuleBodyExpression returns [EObject current=null] : iv_ruleBodyExpression= ruleBodyExpression EOF ;
    public final EObject entryRuleBodyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyExpression = null;


        try {
            // InternalAlf.g:7784:55: (iv_ruleBodyExpression= ruleBodyExpression EOF )
            // InternalAlf.g:7785:2: iv_ruleBodyExpression= ruleBodyExpression EOF
            {
             newCompositeNode(grammarAccess.getBodyExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBodyExpression=ruleBodyExpression();

            state._fsp--;

             current =iv_ruleBodyExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBodyExpression"


    // $ANTLR start "ruleBodyExpression"
    // InternalAlf.g:7791:1: ruleBodyExpression returns [EObject current=null] : ( ( (lv_ownedRelationship_0_0= ruleBodyParameterMember ) ) otherlv_1= '(' ( (lv_ownedRelationship_2_0= ruleExpressionMember ) ) otherlv_3= ')' ) ;
    public final EObject ruleBodyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:7797:2: ( ( ( (lv_ownedRelationship_0_0= ruleBodyParameterMember ) ) otherlv_1= '(' ( (lv_ownedRelationship_2_0= ruleExpressionMember ) ) otherlv_3= ')' ) )
            // InternalAlf.g:7798:2: ( ( (lv_ownedRelationship_0_0= ruleBodyParameterMember ) ) otherlv_1= '(' ( (lv_ownedRelationship_2_0= ruleExpressionMember ) ) otherlv_3= ')' )
            {
            // InternalAlf.g:7798:2: ( ( (lv_ownedRelationship_0_0= ruleBodyParameterMember ) ) otherlv_1= '(' ( (lv_ownedRelationship_2_0= ruleExpressionMember ) ) otherlv_3= ')' )
            // InternalAlf.g:7799:3: ( (lv_ownedRelationship_0_0= ruleBodyParameterMember ) ) otherlv_1= '(' ( (lv_ownedRelationship_2_0= ruleExpressionMember ) ) otherlv_3= ')'
            {
            // InternalAlf.g:7799:3: ( (lv_ownedRelationship_0_0= ruleBodyParameterMember ) )
            // InternalAlf.g:7800:4: (lv_ownedRelationship_0_0= ruleBodyParameterMember )
            {
            // InternalAlf.g:7800:4: (lv_ownedRelationship_0_0= ruleBodyParameterMember )
            // InternalAlf.g:7801:5: lv_ownedRelationship_0_0= ruleBodyParameterMember
            {

            					newCompositeNode(grammarAccess.getBodyExpressionAccess().getOwnedRelationshipBodyParameterMemberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_57);
            lv_ownedRelationship_0_0=ruleBodyParameterMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBodyExpressionRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_0_0,
            						"org.omg.sysml.Alf.BodyParameterMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_72); 

            			newLeafNode(otherlv_1, grammarAccess.getBodyExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlf.g:7822:3: ( (lv_ownedRelationship_2_0= ruleExpressionMember ) )
            // InternalAlf.g:7823:4: (lv_ownedRelationship_2_0= ruleExpressionMember )
            {
            // InternalAlf.g:7823:4: (lv_ownedRelationship_2_0= ruleExpressionMember )
            // InternalAlf.g:7824:5: lv_ownedRelationship_2_0= ruleExpressionMember
            {

            					newCompositeNode(grammarAccess.getBodyExpressionAccess().getOwnedRelationshipExpressionMemberParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_109);
            lv_ownedRelationship_2_0=ruleExpressionMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBodyExpressionRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_2_0,
            						"org.omg.sysml.Alf.ExpressionMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBodyExpressionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBodyExpression"


    // $ANTLR start "entryRuleBaseExpression"
    // InternalAlf.g:7849:1: entryRuleBaseExpression returns [EObject current=null] : iv_ruleBaseExpression= ruleBaseExpression EOF ;
    public final EObject entryRuleBaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseExpression = null;


        try {
            // InternalAlf.g:7849:55: (iv_ruleBaseExpression= ruleBaseExpression EOF )
            // InternalAlf.g:7850:2: iv_ruleBaseExpression= ruleBaseExpression EOF
            {
             newCompositeNode(grammarAccess.getBaseExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseExpression=ruleBaseExpression();

            state._fsp--;

             current =iv_ruleBaseExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseExpression"


    // $ANTLR start "ruleBaseExpression"
    // InternalAlf.g:7856:1: ruleBaseExpression returns [EObject current=null] : (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_NameExpression_2= ruleNameExpression | this_InvocationExpression_3= ruleInvocationExpression | this_SequenceConstructionExpression_4= ruleSequenceConstructionExpression | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) ) ;
    public final EObject ruleBaseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_NullExpression_0 = null;

        EObject this_LiteralExpression_1 = null;

        EObject this_NameExpression_2 = null;

        EObject this_InvocationExpression_3 = null;

        EObject this_SequenceConstructionExpression_4 = null;

        EObject this_Expression_6 = null;



        	enterRule();

        try {
            // InternalAlf.g:7862:2: ( (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_NameExpression_2= ruleNameExpression | this_InvocationExpression_3= ruleInvocationExpression | this_SequenceConstructionExpression_4= ruleSequenceConstructionExpression | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) ) )
            // InternalAlf.g:7863:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_NameExpression_2= ruleNameExpression | this_InvocationExpression_3= ruleInvocationExpression | this_SequenceConstructionExpression_4= ruleSequenceConstructionExpression | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) )
            {
            // InternalAlf.g:7863:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_NameExpression_2= ruleNameExpression | this_InvocationExpression_3= ruleInvocationExpression | this_SequenceConstructionExpression_4= ruleSequenceConstructionExpression | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) )
            int alt133=6;
            alt133 = dfa133.predict(input);
            switch (alt133) {
                case 1 :
                    // InternalAlf.g:7864:3: this_NullExpression_0= ruleNullExpression
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getNullExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NullExpression_0=ruleNullExpression();

                    state._fsp--;


                    			current = this_NullExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:7873:3: this_LiteralExpression_1= ruleLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getLiteralExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralExpression_1=ruleLiteralExpression();

                    state._fsp--;


                    			current = this_LiteralExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:7882:3: this_NameExpression_2= ruleNameExpression
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getNameExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameExpression_2=ruleNameExpression();

                    state._fsp--;


                    			current = this_NameExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:7891:3: this_InvocationExpression_3= ruleInvocationExpression
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getInvocationExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_InvocationExpression_3=ruleInvocationExpression();

                    state._fsp--;


                    			current = this_InvocationExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:7900:3: this_SequenceConstructionExpression_4= ruleSequenceConstructionExpression
                    {

                    			newCompositeNode(grammarAccess.getBaseExpressionAccess().getSequenceConstructionExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceConstructionExpression_4=ruleSequenceConstructionExpression();

                    state._fsp--;


                    			current = this_SequenceConstructionExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAlf.g:7909:3: (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' )
                    {
                    // InternalAlf.g:7909:3: (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' )
                    // InternalAlf.g:7910:4: otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_72); 

                    				newLeafNode(otherlv_5, grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getBaseExpressionAccess().getExpressionParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_109);
                    this_Expression_6=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_6;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_7=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_5_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseExpression"


    // $ANTLR start "entryRuleNameExpression"
    // InternalAlf.g:7931:1: entryRuleNameExpression returns [EObject current=null] : iv_ruleNameExpression= ruleNameExpression EOF ;
    public final EObject entryRuleNameExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpression = null;


        try {
            // InternalAlf.g:7931:55: (iv_ruleNameExpression= ruleNameExpression EOF )
            // InternalAlf.g:7932:2: iv_ruleNameExpression= ruleNameExpression EOF
            {
             newCompositeNode(grammarAccess.getNameExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameExpression=ruleNameExpression();

            state._fsp--;

             current =iv_ruleNameExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameExpression"


    // $ANTLR start "ruleNameExpression"
    // InternalAlf.g:7938:1: ruleNameExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleNameExpression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:7944:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:7945:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:7945:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:7946:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:7946:3: ( ruleQualifiedName )
            // InternalAlf.g:7947:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNameExpressionRule());
            				}
            			

            				newCompositeNode(grammarAccess.getNameExpressionAccess().getReferentFeatureCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameExpression"


    // $ANTLR start "entryRuleInvocationExpression"
    // InternalAlf.g:7964:1: entryRuleInvocationExpression returns [EObject current=null] : iv_ruleInvocationExpression= ruleInvocationExpression EOF ;
    public final EObject entryRuleInvocationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocationExpression = null;


        try {
            // InternalAlf.g:7964:61: (iv_ruleInvocationExpression= ruleInvocationExpression EOF )
            // InternalAlf.g:7965:2: iv_ruleInvocationExpression= ruleInvocationExpression EOF
            {
             newCompositeNode(grammarAccess.getInvocationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInvocationExpression=ruleInvocationExpression();

            state._fsp--;

             current =iv_ruleInvocationExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvocationExpression"


    // $ANTLR start "ruleInvocationExpression"
    // InternalAlf.g:7971:1: ruleInvocationExpression returns [EObject current=null] : ( ( (lv_ownedRelationship_0_0= ruleFeatureTyping ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' ) ;
    public final EObject ruleInvocationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject this_Tuple_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:7977:2: ( ( ( (lv_ownedRelationship_0_0= ruleFeatureTyping ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' ) )
            // InternalAlf.g:7978:2: ( ( (lv_ownedRelationship_0_0= ruleFeatureTyping ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' )
            {
            // InternalAlf.g:7978:2: ( ( (lv_ownedRelationship_0_0= ruleFeatureTyping ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' )
            // InternalAlf.g:7979:3: ( (lv_ownedRelationship_0_0= ruleFeatureTyping ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')'
            {
            // InternalAlf.g:7979:3: ( (lv_ownedRelationship_0_0= ruleFeatureTyping ) )
            // InternalAlf.g:7980:4: (lv_ownedRelationship_0_0= ruleFeatureTyping )
            {
            // InternalAlf.g:7980:4: (lv_ownedRelationship_0_0= ruleFeatureTyping )
            // InternalAlf.g:7981:5: lv_ownedRelationship_0_0= ruleFeatureTyping
            {

            					newCompositeNode(grammarAccess.getInvocationExpressionAccess().getOwnedRelationshipFeatureTypingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_57);
            lv_ownedRelationship_0_0=ruleFeatureTyping();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInvocationExpressionRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_0_0,
            						"org.omg.sysml.Alf.FeatureTyping");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_110); 

            			newLeafNode(otherlv_1, grammarAccess.getInvocationExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlf.g:8002:3: (this_Tuple_2= ruleTuple[$current] )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( ((LA134_0>=RULE_BOOLEAN_VALUE && LA134_0<=RULE_UNRESTRICTED_NAME)||(LA134_0>=18 && LA134_0<=19)||LA134_0==23||LA134_0==40||(LA134_0>=69 && LA134_0<=70)||(LA134_0>=74 && LA134_0<=75)||LA134_0==77) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalAlf.g:8003:4: this_Tuple_2= ruleTuple[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getInvocationExpressionRule());
                    				}
                    				newCompositeNode(grammarAccess.getInvocationExpressionAccess().getTupleParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_109);
                    this_Tuple_2=ruleTuple(current);

                    state._fsp--;


                    				current = this_Tuple_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInvocationExpressionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvocationExpression"


    // $ANTLR start "ruleTuple"
    // InternalAlf.g:8024:1: ruleTuple[EObject in_current] returns [EObject current=in_current] : (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] ) ;
    public final EObject ruleTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_PositionalTuple_0 = null;

        EObject this_NamedTuple_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:8030:2: ( (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] ) )
            // InternalAlf.g:8031:2: (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] )
            {
            // InternalAlf.g:8031:2: (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] )
            int alt135=2;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN_VALUE:
            case RULE_STRING_VALUE:
            case RULE_NATURAL_VALUE:
            case RULE_EXP_VALUE:
            case 18:
            case 19:
            case 23:
            case 40:
            case 69:
            case 70:
            case 74:
            case 75:
            case 77:
                {
                alt135=1;
                }
                break;
            case RULE_ID:
                {
                int LA135_2 = input.LA(2);

                if ( ((LA135_2>=17 && LA135_2<=19)||LA135_2==38||(LA135_2>=40 && LA135_2<=41)||LA135_2==51||(LA135_2>=57 && LA135_2<=73)||LA135_2==76) ) {
                    alt135=1;
                }
                else if ( (LA135_2==56) ) {
                    alt135=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 135, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA135_3 = input.LA(2);

                if ( ((LA135_3>=17 && LA135_3<=19)||LA135_3==38||(LA135_3>=40 && LA135_3<=41)||LA135_3==51||(LA135_3>=57 && LA135_3<=73)||LA135_3==76) ) {
                    alt135=1;
                }
                else if ( (LA135_3==56) ) {
                    alt135=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 135, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }

            switch (alt135) {
                case 1 :
                    // InternalAlf.g:8032:3: this_PositionalTuple_0= rulePositionalTuple[$current]
                    {

                    			if (current==null) {
                    				current = createModelElement(grammarAccess.getTupleRule());
                    			}
                    			newCompositeNode(grammarAccess.getTupleAccess().getPositionalTupleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PositionalTuple_0=rulePositionalTuple(current);

                    state._fsp--;


                    			current = this_PositionalTuple_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:8044:3: this_NamedTuple_1= ruleNamedTuple[$current]
                    {

                    			if (current==null) {
                    				current = createModelElement(grammarAccess.getTupleRule());
                    			}
                    			newCompositeNode(grammarAccess.getTupleAccess().getNamedTupleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamedTuple_1=ruleNamedTuple(current);

                    state._fsp--;


                    			current = this_NamedTuple_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTuple"


    // $ANTLR start "rulePositionalTuple"
    // InternalAlf.g:8060:1: rulePositionalTuple[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleExpressionMember ) ) )* ) ;
    public final EObject rulePositionalTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:8066:2: ( ( ( (lv_ownedRelationship_0_0= ruleExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleExpressionMember ) ) )* ) )
            // InternalAlf.g:8067:2: ( ( (lv_ownedRelationship_0_0= ruleExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleExpressionMember ) ) )* )
            {
            // InternalAlf.g:8067:2: ( ( (lv_ownedRelationship_0_0= ruleExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleExpressionMember ) ) )* )
            // InternalAlf.g:8068:3: ( (lv_ownedRelationship_0_0= ruleExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleExpressionMember ) ) )*
            {
            // InternalAlf.g:8068:3: ( (lv_ownedRelationship_0_0= ruleExpressionMember ) )
            // InternalAlf.g:8069:4: (lv_ownedRelationship_0_0= ruleExpressionMember )
            {
            // InternalAlf.g:8069:4: (lv_ownedRelationship_0_0= ruleExpressionMember )
            // InternalAlf.g:8070:5: lv_ownedRelationship_0_0= ruleExpressionMember
            {

            					newCompositeNode(grammarAccess.getPositionalTupleAccess().getOwnedRelationshipExpressionMemberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_46);
            lv_ownedRelationship_0_0=ruleExpressionMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositionalTupleRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_0_0,
            						"org.omg.sysml.Alf.ExpressionMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:8087:3: (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleExpressionMember ) ) )*
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==38) ) {
                    alt136=1;
                }


                switch (alt136) {
            	case 1 :
            	    // InternalAlf.g:8088:4: otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleExpressionMember ) )
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_72); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPositionalTupleAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalAlf.g:8092:4: ( (lv_ownedRelationship_2_0= ruleExpressionMember ) )
            	    // InternalAlf.g:8093:5: (lv_ownedRelationship_2_0= ruleExpressionMember )
            	    {
            	    // InternalAlf.g:8093:5: (lv_ownedRelationship_2_0= ruleExpressionMember )
            	    // InternalAlf.g:8094:6: lv_ownedRelationship_2_0= ruleExpressionMember
            	    {

            	    						newCompositeNode(grammarAccess.getPositionalTupleAccess().getOwnedRelationshipExpressionMemberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_ownedRelationship_2_0=ruleExpressionMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPositionalTupleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedRelationship",
            	    							lv_ownedRelationship_2_0,
            	    							"org.omg.sysml.Alf.ExpressionMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop136;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePositionalTuple"


    // $ANTLR start "ruleNamedTuple"
    // InternalAlf.g:8117:1: ruleNamedTuple[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )* ) ;
    public final EObject ruleNamedTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:8123:2: ( ( ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )* ) )
            // InternalAlf.g:8124:2: ( ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )* )
            {
            // InternalAlf.g:8124:2: ( ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )* )
            // InternalAlf.g:8125:3: ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )*
            {
            // InternalAlf.g:8125:3: ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) )
            // InternalAlf.g:8126:4: (lv_ownedRelationship_0_0= ruleNamedExpressionMember )
            {
            // InternalAlf.g:8126:4: (lv_ownedRelationship_0_0= ruleNamedExpressionMember )
            // InternalAlf.g:8127:5: lv_ownedRelationship_0_0= ruleNamedExpressionMember
            {

            					newCompositeNode(grammarAccess.getNamedTupleAccess().getOwnedRelationshipNamedExpressionMemberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_46);
            lv_ownedRelationship_0_0=ruleNamedExpressionMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedTupleRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_0_0,
            						"org.omg.sysml.Alf.NamedExpressionMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:8144:3: (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )*
            loop137:
            do {
                int alt137=2;
                int LA137_0 = input.LA(1);

                if ( (LA137_0==38) ) {
                    alt137=1;
                }


                switch (alt137) {
            	case 1 :
            	    // InternalAlf.g:8145:4: otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) )
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_72); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNamedTupleAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalAlf.g:8149:4: ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) )
            	    // InternalAlf.g:8150:5: (lv_ownedRelationship_2_0= ruleNamedExpressionMember )
            	    {
            	    // InternalAlf.g:8150:5: (lv_ownedRelationship_2_0= ruleNamedExpressionMember )
            	    // InternalAlf.g:8151:6: lv_ownedRelationship_2_0= ruleNamedExpressionMember
            	    {

            	    						newCompositeNode(grammarAccess.getNamedTupleAccess().getOwnedRelationshipNamedExpressionMemberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_ownedRelationship_2_0=ruleNamedExpressionMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNamedTupleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedRelationship",
            	    							lv_ownedRelationship_2_0,
            	    							"org.omg.sysml.Alf.NamedExpressionMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop137;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedTuple"


    // $ANTLR start "entryRuleSequenceConstructionExpression"
    // InternalAlf.g:8173:1: entryRuleSequenceConstructionExpression returns [EObject current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
    public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionExpression = null;


        try {
            // InternalAlf.g:8173:71: (iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:8174:2: iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF
            {
             newCompositeNode(grammarAccess.getSequenceConstructionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceConstructionExpression=ruleSequenceConstructionExpression();

            state._fsp--;

             current =iv_ruleSequenceConstructionExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceConstructionExpression"


    // $ANTLR start "ruleSequenceConstructionExpression"
    // InternalAlf.g:8180:1: ruleSequenceConstructionExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:8186:2: ( ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalAlf.g:8187:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalAlf.g:8187:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // InternalAlf.g:8188:3: () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalAlf.g:8188:3: ()
            // InternalAlf.g:8189:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_111); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:8199:3: ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( ((LA139_0>=RULE_BOOLEAN_VALUE && LA139_0<=RULE_UNRESTRICTED_NAME)||(LA139_0>=18 && LA139_0<=19)||LA139_0==23||LA139_0==40||(LA139_0>=69 && LA139_0<=70)||(LA139_0>=74 && LA139_0<=75)||LA139_0==77) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalAlf.g:8200:4: ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:8200:4: ( (lv_element_2_0= ruleExpression ) )
                    // InternalAlf.g:8201:5: (lv_element_2_0= ruleExpression )
                    {
                    // InternalAlf.g:8201:5: (lv_element_2_0= ruleExpression )
                    // InternalAlf.g:8202:6: lv_element_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_112);
                    lv_element_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSequenceConstructionExpressionRule());
                    						}
                    						add(
                    							current,
                    							"element",
                    							lv_element_2_0,
                    							"org.omg.sysml.Alf.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:8219:4: (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==38) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // InternalAlf.g:8220:5: otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,38,FOLLOW_72); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:8224:5: ( (lv_element_4_0= ruleExpression ) )
                    	    // InternalAlf.g:8225:6: (lv_element_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:8225:6: (lv_element_4_0= ruleExpression )
                    	    // InternalAlf.g:8226:7: lv_element_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_112);
                    	    lv_element_4_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSequenceConstructionExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"element",
                    	    								lv_element_4_0,
                    	    								"org.omg.sysml.Alf.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop138;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSequenceConstructionExpressionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceConstructionExpression"


    // $ANTLR start "entryRuleNullExpression"
    // InternalAlf.g:8253:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // InternalAlf.g:8253:55: (iv_ruleNullExpression= ruleNullExpression EOF )
            // InternalAlf.g:8254:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
             newCompositeNode(grammarAccess.getNullExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;

             current =iv_ruleNullExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullExpression"


    // $ANTLR start "ruleNullExpression"
    // InternalAlf.g:8260:1: ruleNullExpression returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlf.g:8266:2: ( ( () otherlv_1= 'null' ) )
            // InternalAlf.g:8267:2: ( () otherlv_1= 'null' )
            {
            // InternalAlf.g:8267:2: ( () otherlv_1= 'null' )
            // InternalAlf.g:8268:3: () otherlv_1= 'null'
            {
            // InternalAlf.g:8268:3: ()
            // InternalAlf.g:8269:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullExpressionAccess().getNullExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,77,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNullExpressionAccess().getNullKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullExpression"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalAlf.g:8283:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalAlf.g:8283:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalAlf.g:8284:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;

             current =iv_ruleLiteralExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalAlf.g:8290:1: ruleLiteralExpression returns [EObject current=null] : (this_BooleanLiteralExpression_0= ruleBooleanLiteralExpression | this_StringLiteralExpression_1= ruleStringLiteralExpression | this_RealLiteralExpression_2= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_3= ruleUnlimitedNaturalLiteralExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanLiteralExpression_0 = null;

        EObject this_StringLiteralExpression_1 = null;

        EObject this_RealLiteralExpression_2 = null;

        EObject this_UnlimitedNaturalLiteralExpression_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:8296:2: ( (this_BooleanLiteralExpression_0= ruleBooleanLiteralExpression | this_StringLiteralExpression_1= ruleStringLiteralExpression | this_RealLiteralExpression_2= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_3= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:8297:2: (this_BooleanLiteralExpression_0= ruleBooleanLiteralExpression | this_StringLiteralExpression_1= ruleStringLiteralExpression | this_RealLiteralExpression_2= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_3= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:8297:2: (this_BooleanLiteralExpression_0= ruleBooleanLiteralExpression | this_StringLiteralExpression_1= ruleStringLiteralExpression | this_RealLiteralExpression_2= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_3= ruleUnlimitedNaturalLiteralExpression )
            int alt140=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN_VALUE:
                {
                alt140=1;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt140=2;
                }
                break;
            case RULE_NATURAL_VALUE:
                {
                int LA140_3 = input.LA(2);

                if ( (LA140_3==EOF||(LA140_3>=19 && LA140_3<=20)||(LA140_3>=23 && LA140_3<=24)||LA140_3==38||LA140_3==41||LA140_3==46||LA140_3==51||LA140_3==53||(LA140_3>=57 && LA140_3<=73)||LA140_3==76) ) {
                    alt140=4;
                }
                else if ( (LA140_3==18) ) {
                    alt140=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 140, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_EXP_VALUE:
            case 18:
                {
                alt140=3;
                }
                break;
            case 19:
                {
                alt140=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }

            switch (alt140) {
                case 1 :
                    // InternalAlf.g:8298:3: this_BooleanLiteralExpression_0= ruleBooleanLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getBooleanLiteralExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteralExpression_0=ruleBooleanLiteralExpression();

                    state._fsp--;


                    			current = this_BooleanLiteralExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:8307:3: this_StringLiteralExpression_1= ruleStringLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getStringLiteralExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteralExpression_1=ruleStringLiteralExpression();

                    state._fsp--;


                    			current = this_StringLiteralExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:8316:3: this_RealLiteralExpression_2= ruleRealLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getRealLiteralExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealLiteralExpression_2=ruleRealLiteralExpression();

                    state._fsp--;


                    			current = this_RealLiteralExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:8325:3: this_UnlimitedNaturalLiteralExpression_3= ruleUnlimitedNaturalLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getUnlimitedNaturalLiteralExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnlimitedNaturalLiteralExpression_3=ruleUnlimitedNaturalLiteralExpression();

                    state._fsp--;


                    			current = this_UnlimitedNaturalLiteralExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleBooleanLiteralExpression"
    // InternalAlf.g:8337:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // InternalAlf.g:8337:65: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:8338:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteralExpression=ruleBooleanLiteralExpression();

            state._fsp--;

             current =iv_ruleBooleanLiteralExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteralExpression"


    // $ANTLR start "ruleBooleanLiteralExpression"
    // InternalAlf.g:8344:1: ruleBooleanLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:8350:2: ( ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) )
            // InternalAlf.g:8351:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            {
            // InternalAlf.g:8351:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:8352:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:8352:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            // InternalAlf.g:8353:4: lv_value_0_0= RULE_BOOLEAN_VALUE
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN_VALUE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getBooleanLiteralExpressionAccess().getValueBOOLEAN_VALUETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleanLiteralExpressionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.omg.sysml.Alf.BOOLEAN_VALUE");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteralExpression"


    // $ANTLR start "entryRuleStringLiteralExpression"
    // InternalAlf.g:8372:1: entryRuleStringLiteralExpression returns [EObject current=null] : iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF ;
    public final EObject entryRuleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpression = null;


        try {
            // InternalAlf.g:8372:64: (iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF )
            // InternalAlf.g:8373:2: iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteralExpression=ruleStringLiteralExpression();

            state._fsp--;

             current =iv_ruleStringLiteralExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteralExpression"


    // $ANTLR start "ruleStringLiteralExpression"
    // InternalAlf.g:8379:1: ruleStringLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:8385:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalAlf.g:8386:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalAlf.g:8386:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalAlf.g:8387:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalAlf.g:8387:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalAlf.g:8388:4: lv_value_0_0= RULE_STRING_VALUE
            {
            lv_value_0_0=(Token)match(input,RULE_STRING_VALUE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralExpressionAccess().getValueSTRING_VALUETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralExpressionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.omg.sysml.Alf.STRING_VALUE");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteralExpression"


    // $ANTLR start "entryRuleRealLiteralExpression"
    // InternalAlf.g:8407:1: entryRuleRealLiteralExpression returns [EObject current=null] : iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF ;
    public final EObject entryRuleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteralExpression = null;


        try {
            // InternalAlf.g:8407:62: (iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF )
            // InternalAlf.g:8408:2: iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getRealLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteralExpression=ruleRealLiteralExpression();

            state._fsp--;

             current =iv_ruleRealLiteralExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealLiteralExpression"


    // $ANTLR start "ruleRealLiteralExpression"
    // InternalAlf.g:8414:1: ruleRealLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:8420:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalAlf.g:8421:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalAlf.g:8421:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalAlf.g:8422:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalAlf.g:8422:3: (lv_value_0_0= ruleRealValue )
            // InternalAlf.g:8423:4: lv_value_0_0= ruleRealValue
            {

            				newCompositeNode(grammarAccess.getRealLiteralExpressionAccess().getValueRealValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleRealValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRealLiteralExpressionRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.omg.sysml.Alf.RealValue");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealLiteralExpression"


    // $ANTLR start "entryRuleRealValue"
    // InternalAlf.g:8443:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalAlf.g:8443:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalAlf.g:8444:2: iv_ruleRealValue= ruleRealValue EOF
            {
             newCompositeNode(grammarAccess.getRealValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealValue=ruleRealValue();

            state._fsp--;

             current =iv_ruleRealValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealValue"


    // $ANTLR start "ruleRealValue"
    // InternalAlf.g:8450:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_VALUE_0=null;
        Token kw=null;
        Token this_NATURAL_VALUE_2=null;
        Token this_EXP_VALUE_3=null;
        Token this_EXP_VALUE_4=null;


        	enterRule();

        try {
            // InternalAlf.g:8456:2: ( ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) )
            // InternalAlf.g:8457:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            {
            // InternalAlf.g:8457:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==RULE_NATURAL_VALUE||LA143_0==18) ) {
                alt143=1;
            }
            else if ( (LA143_0==RULE_EXP_VALUE) ) {
                alt143=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }
            switch (alt143) {
                case 1 :
                    // InternalAlf.g:8458:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    {
                    // InternalAlf.g:8458:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    // InternalAlf.g:8459:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    {
                    // InternalAlf.g:8459:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )?
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==RULE_NATURAL_VALUE) ) {
                        alt141=1;
                    }
                    switch (alt141) {
                        case 1 :
                            // InternalAlf.g:8460:5: this_NATURAL_VALUE_0= RULE_NATURAL_VALUE
                            {
                            this_NATURAL_VALUE_0=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_20); 

                            					current.merge(this_NATURAL_VALUE_0);
                            				

                            					newLeafNode(this_NATURAL_VALUE_0, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,18,FOLLOW_113); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1());
                    			
                    // InternalAlf.g:8473:4: (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==RULE_NATURAL_VALUE) ) {
                        alt142=1;
                    }
                    else if ( (LA142_0==RULE_EXP_VALUE) ) {
                        alt142=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 142, 0, input);

                        throw nvae;
                    }
                    switch (alt142) {
                        case 1 :
                            // InternalAlf.g:8474:5: this_NATURAL_VALUE_2= RULE_NATURAL_VALUE
                            {
                            this_NATURAL_VALUE_2=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_2); 

                            					current.merge(this_NATURAL_VALUE_2);
                            				

                            					newLeafNode(this_NATURAL_VALUE_2, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:8482:5: this_EXP_VALUE_3= RULE_EXP_VALUE
                            {
                            this_EXP_VALUE_3=(Token)match(input,RULE_EXP_VALUE,FOLLOW_2); 

                            					current.merge(this_EXP_VALUE_3);
                            				

                            					newLeafNode(this_EXP_VALUE_3, grammarAccess.getRealValueAccess().getEXP_VALUETerminalRuleCall_0_2_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:8492:3: this_EXP_VALUE_4= RULE_EXP_VALUE
                    {
                    this_EXP_VALUE_4=(Token)match(input,RULE_EXP_VALUE,FOLLOW_2); 

                    			current.merge(this_EXP_VALUE_4);
                    		

                    			newLeafNode(this_EXP_VALUE_4, grammarAccess.getRealValueAccess().getEXP_VALUETerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealValue"


    // $ANTLR start "entryRuleNaturalLiteralExpression"
    // InternalAlf.g:8503:1: entryRuleNaturalLiteralExpression returns [EObject current=null] : iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF ;
    public final EObject entryRuleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:8503:65: (iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:8504:2: iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getNaturalLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNaturalLiteralExpression=ruleNaturalLiteralExpression();

            state._fsp--;

             current =iv_ruleNaturalLiteralExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNaturalLiteralExpression"


    // $ANTLR start "ruleNaturalLiteralExpression"
    // InternalAlf.g:8510:1: ruleNaturalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) ;
    public final EObject ruleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:8516:2: ( ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) )
            // InternalAlf.g:8517:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            {
            // InternalAlf.g:8517:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            // InternalAlf.g:8518:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:8518:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            // InternalAlf.g:8519:4: lv_value_0_0= RULE_NATURAL_VALUE
            {
            lv_value_0_0=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNaturalLiteralExpressionAccess().getValueNATURAL_VALUETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNaturalLiteralExpressionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.omg.sysml.Alf.NATURAL_VALUE");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNaturalLiteralExpression"


    // $ANTLR start "entryRuleUnlimitedNaturalLiteralExpression"
    // InternalAlf.g:8538:1: entryRuleUnlimitedNaturalLiteralExpression returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:8538:74: (iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:8539:2: iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnlimitedNaturalLiteralExpression=ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;

             current =iv_ruleUnlimitedNaturalLiteralExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnlimitedNaturalLiteralExpression"


    // $ANTLR start "ruleUnlimitedNaturalLiteralExpression"
    // InternalAlf.g:8545:1: ruleUnlimitedNaturalLiteralExpression returns [EObject current=null] : (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NaturalLiteralExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:8551:2: ( (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) )
            // InternalAlf.g:8552:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            {
            // InternalAlf.g:8552:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==RULE_NATURAL_VALUE) ) {
                alt144=1;
            }
            else if ( (LA144_0==19) ) {
                alt144=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 144, 0, input);

                throw nvae;
            }
            switch (alt144) {
                case 1 :
                    // InternalAlf.g:8553:3: this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getNaturalLiteralExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NaturalLiteralExpression_0=ruleNaturalLiteralExpression();

                    state._fsp--;


                    			current = this_NaturalLiteralExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:8562:3: ( () otherlv_2= '*' )
                    {
                    // InternalAlf.g:8562:3: ( () otherlv_2= '*' )
                    // InternalAlf.g:8563:4: () otherlv_2= '*'
                    {
                    // InternalAlf.g:8563:4: ()
                    // InternalAlf.g:8564:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getLiteralUnboundedAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getAsteriskKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnlimitedNaturalLiteralExpression"


    // $ANTLR start "entryRuleNamedExpressionMember"
    // InternalAlf.g:8579:1: entryRuleNamedExpressionMember returns [EObject current=null] : iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF ;
    public final EObject entryRuleNamedExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedExpressionMember = null;


        try {
            // InternalAlf.g:8579:62: (iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF )
            // InternalAlf.g:8580:2: iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF
            {
             newCompositeNode(grammarAccess.getNamedExpressionMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedExpressionMember=ruleNamedExpressionMember();

            state._fsp--;

             current =iv_ruleNamedExpressionMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedExpressionMember"


    // $ANTLR start "ruleNamedExpressionMember"
    // InternalAlf.g:8586:1: ruleNamedExpressionMember returns [EObject current=null] : ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedRelatedElement_2_0= ruleExpression ) ) ) ;
    public final EObject ruleNamedExpressionMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_memberName_0_0 = null;

        EObject lv_ownedRelatedElement_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:8592:2: ( ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedRelatedElement_2_0= ruleExpression ) ) ) )
            // InternalAlf.g:8593:2: ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedRelatedElement_2_0= ruleExpression ) ) )
            {
            // InternalAlf.g:8593:2: ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedRelatedElement_2_0= ruleExpression ) ) )
            // InternalAlf.g:8594:3: ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedRelatedElement_2_0= ruleExpression ) )
            {
            // InternalAlf.g:8594:3: ( (lv_memberName_0_0= ruleName ) )
            // InternalAlf.g:8595:4: (lv_memberName_0_0= ruleName )
            {
            // InternalAlf.g:8595:4: (lv_memberName_0_0= ruleName )
            // InternalAlf.g:8596:5: lv_memberName_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getNamedExpressionMemberAccess().getMemberNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_89);
            lv_memberName_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedExpressionMemberRule());
            					}
            					set(
            						current,
            						"memberName",
            						lv_memberName_0_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,56,FOLLOW_72); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedExpressionMemberAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalAlf.g:8617:3: ( (lv_ownedRelatedElement_2_0= ruleExpression ) )
            // InternalAlf.g:8618:4: (lv_ownedRelatedElement_2_0= ruleExpression )
            {
            // InternalAlf.g:8618:4: (lv_ownedRelatedElement_2_0= ruleExpression )
            // InternalAlf.g:8619:5: lv_ownedRelatedElement_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNamedExpressionMemberAccess().getOwnedRelatedElementExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedExpressionMemberRule());
            					}
            					add(
            						current,
            						"ownedRelatedElement",
            						lv_ownedRelatedElement_2_0,
            						"org.omg.sysml.Alf.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedExpressionMember"


    // $ANTLR start "entryRuleBodyParameterMember"
    // InternalAlf.g:8640:1: entryRuleBodyParameterMember returns [EObject current=null] : iv_ruleBodyParameterMember= ruleBodyParameterMember EOF ;
    public final EObject entryRuleBodyParameterMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyParameterMember = null;


        try {
            // InternalAlf.g:8640:60: (iv_ruleBodyParameterMember= ruleBodyParameterMember EOF )
            // InternalAlf.g:8641:2: iv_ruleBodyParameterMember= ruleBodyParameterMember EOF
            {
             newCompositeNode(grammarAccess.getBodyParameterMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBodyParameterMember=ruleBodyParameterMember();

            state._fsp--;

             current =iv_ruleBodyParameterMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBodyParameterMember"


    // $ANTLR start "ruleBodyParameterMember"
    // InternalAlf.g:8647:1: ruleBodyParameterMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleBodyParameter ) ) ;
    public final EObject ruleBodyParameterMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:8653:2: ( ( (lv_ownedRelatedElement_0_0= ruleBodyParameter ) ) )
            // InternalAlf.g:8654:2: ( (lv_ownedRelatedElement_0_0= ruleBodyParameter ) )
            {
            // InternalAlf.g:8654:2: ( (lv_ownedRelatedElement_0_0= ruleBodyParameter ) )
            // InternalAlf.g:8655:3: (lv_ownedRelatedElement_0_0= ruleBodyParameter )
            {
            // InternalAlf.g:8655:3: (lv_ownedRelatedElement_0_0= ruleBodyParameter )
            // InternalAlf.g:8656:4: lv_ownedRelatedElement_0_0= ruleBodyParameter
            {

            				newCompositeNode(grammarAccess.getBodyParameterMemberAccess().getOwnedRelatedElementBodyParameterParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedRelatedElement_0_0=ruleBodyParameter();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBodyParameterMemberRule());
            				}
            				add(
            					current,
            					"ownedRelatedElement",
            					lv_ownedRelatedElement_0_0,
            					"org.omg.sysml.Alf.BodyParameter");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBodyParameterMember"


    // $ANTLR start "entryRuleBodyParameter"
    // InternalAlf.g:8676:1: entryRuleBodyParameter returns [EObject current=null] : iv_ruleBodyParameter= ruleBodyParameter EOF ;
    public final EObject entryRuleBodyParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyParameter = null;


        try {
            // InternalAlf.g:8676:54: (iv_ruleBodyParameter= ruleBodyParameter EOF )
            // InternalAlf.g:8677:2: iv_ruleBodyParameter= ruleBodyParameter EOF
            {
             newCompositeNode(grammarAccess.getBodyParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBodyParameter=ruleBodyParameter();

            state._fsp--;

             current =iv_ruleBodyParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBodyParameter"


    // $ANTLR start "ruleBodyParameter"
    // InternalAlf.g:8683:1: ruleBodyParameter returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleBodyParameter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:8689:2: ( ( (lv_name_0_0= ruleName ) ) )
            // InternalAlf.g:8690:2: ( (lv_name_0_0= ruleName ) )
            {
            // InternalAlf.g:8690:2: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:8691:3: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:8691:3: (lv_name_0_0= ruleName )
            // InternalAlf.g:8692:4: lv_name_0_0= ruleName
            {

            				newCompositeNode(grammarAccess.getBodyParameterAccess().getNameNameParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleName();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBodyParameterRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.omg.sysml.Alf.Name");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBodyParameter"


    // $ANTLR start "entryRuleName"
    // InternalAlf.g:8712:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAlf.g:8712:44: (iv_ruleName= ruleName EOF )
            // InternalAlf.g:8713:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalAlf.g:8719:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalAlf.g:8725:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalAlf.g:8726:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalAlf.g:8726:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==RULE_ID) ) {
                alt145=1;
            }
            else if ( (LA145_0==RULE_UNRESTRICTED_NAME) ) {
                alt145=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }
            switch (alt145) {
                case 1 :
                    // InternalAlf.g:8727:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:8735:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
                    {
                    this_UNRESTRICTED_NAME_1=(Token)match(input,RULE_UNRESTRICTED_NAME,FOLLOW_2); 

                    			current.merge(this_UNRESTRICTED_NAME_1);
                    		

                    			newLeafNode(this_UNRESTRICTED_NAME_1, grammarAccess.getNameAccess().getUNRESTRICTED_NAMETerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAlf.g:8746:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlf.g:8746:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlf.g:8747:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalAlf.g:8753:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_ColonQualifiedName_1 = null;

        AntlrDatatypeRuleToken this_DotQualifiedName_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:8759:2: ( (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) )
            // InternalAlf.g:8760:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            {
            // InternalAlf.g:8760:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            int alt146=3;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt146=3;
                    }
                    break;
                case 17:
                    {
                    alt146=2;
                    }
                    break;
                case EOF:
                case 19:
                case 20:
                case 21:
                case 23:
                case 24:
                case 25:
                case 37:
                case 38:
                case 40:
                case 41:
                case 44:
                case 45:
                case 46:
                case 49:
                case 50:
                case 51:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 76:
                    {
                    alt146=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 146, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA146_0==RULE_UNRESTRICTED_NAME) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 19:
                case 20:
                case 21:
                case 23:
                case 24:
                case 25:
                case 37:
                case 38:
                case 40:
                case 41:
                case 44:
                case 45:
                case 46:
                case 49:
                case 50:
                case 51:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 76:
                    {
                    alt146=1;
                    }
                    break;
                case 18:
                    {
                    alt146=3;
                    }
                    break;
                case 17:
                    {
                    alt146=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 146, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }
            switch (alt146) {
                case 1 :
                    // InternalAlf.g:8761:3: this_Name_0= ruleName
                    {

                    			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Name_0=ruleName();

                    state._fsp--;


                    			current.merge(this_Name_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:8772:3: this_ColonQualifiedName_1= ruleColonQualifiedName
                    {

                    			newCompositeNode(grammarAccess.getQualifiedNameAccess().getColonQualifiedNameParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColonQualifiedName_1=ruleColonQualifiedName();

                    state._fsp--;


                    			current.merge(this_ColonQualifiedName_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:8783:3: this_DotQualifiedName_2= ruleDotQualifiedName
                    {

                    			newCompositeNode(grammarAccess.getQualifiedNameAccess().getDotQualifiedNameParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DotQualifiedName_2=ruleDotQualifiedName();

                    state._fsp--;


                    			current.merge(this_DotQualifiedName_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleColonQualifiedName"
    // InternalAlf.g:8797:1: entryRuleColonQualifiedName returns [String current=null] : iv_ruleColonQualifiedName= ruleColonQualifiedName EOF ;
    public final String entryRuleColonQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColonQualifiedName = null;


        try {
            // InternalAlf.g:8797:58: (iv_ruleColonQualifiedName= ruleColonQualifiedName EOF )
            // InternalAlf.g:8798:2: iv_ruleColonQualifiedName= ruleColonQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getColonQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColonQualifiedName=ruleColonQualifiedName();

            state._fsp--;

             current =iv_ruleColonQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColonQualifiedName"


    // $ANTLR start "ruleColonQualifiedName"
    // InternalAlf.g:8804:1: ruleColonQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleColonQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:8810:2: ( (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:8811:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:8811:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            // InternalAlf.g:8812:3: this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:8822:3: (kw= '::' this_Name_2= ruleName )+
            int cnt147=0;
            loop147:
            do {
                int alt147=2;
                int LA147_0 = input.LA(1);

                if ( (LA147_0==17) ) {
                    int LA147_1 = input.LA(2);

                    if ( ((LA147_1>=RULE_ID && LA147_1<=RULE_UNRESTRICTED_NAME)) ) {
                        alt147=1;
                    }


                }


                switch (alt147) {
            	case 1 :
            	    // InternalAlf.g:8823:4: kw= '::' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,17,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getColonQualifiedNameAccess().getColonColonKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_114);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt147 >= 1 ) break loop147;
                        EarlyExitException eee =
                            new EarlyExitException(147, input);
                        throw eee;
                }
                cnt147++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColonQualifiedName"


    // $ANTLR start "entryRuleDotQualifiedName"
    // InternalAlf.g:8843:1: entryRuleDotQualifiedName returns [String current=null] : iv_ruleDotQualifiedName= ruleDotQualifiedName EOF ;
    public final String entryRuleDotQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDotQualifiedName = null;


        try {
            // InternalAlf.g:8843:56: (iv_ruleDotQualifiedName= ruleDotQualifiedName EOF )
            // InternalAlf.g:8844:2: iv_ruleDotQualifiedName= ruleDotQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getDotQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDotQualifiedName=ruleDotQualifiedName();

            state._fsp--;

             current =iv_ruleDotQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDotQualifiedName"


    // $ANTLR start "ruleDotQualifiedName"
    // InternalAlf.g:8850:1: ruleDotQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleDotQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:8856:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:8857:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:8857:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            // InternalAlf.g:8858:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:8868:3: (kw= '.' this_Name_2= ruleName )+
            int cnt148=0;
            loop148:
            do {
                int alt148=2;
                int LA148_0 = input.LA(1);

                if ( (LA148_0==18) ) {
                    int LA148_1 = input.LA(2);

                    if ( ((LA148_1>=RULE_ID && LA148_1<=RULE_UNRESTRICTED_NAME)) ) {
                        alt148=1;
                    }


                }


                switch (alt148) {
            	case 1 :
            	    // InternalAlf.g:8869:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,18,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getDotQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_115);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt148 >= 1 ) break loop148;
                        EarlyExitException eee =
                            new EarlyExitException(148, input);
                        throw eee;
                }
                cnt148++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDotQualifiedName"


    // $ANTLR start "rulePackageElementVisibilityIndicator"
    // InternalAlf.g:8889:1: rulePackageElementVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator rulePackageElementVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAlf.g:8895:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // InternalAlf.g:8896:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // InternalAlf.g:8896:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==78) ) {
                alt149=1;
            }
            else if ( (LA149_0==79) ) {
                alt149=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;
            }
            switch (alt149) {
                case 1 :
                    // InternalAlf.g:8897:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:8897:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:8898:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getPackageElementVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPackageElementVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:8905:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:8905:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:8906:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getPackageElementVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPackageElementVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageElementVisibilityIndicator"


    // $ANTLR start "ruleVisibilityIndicator"
    // InternalAlf.g:8916:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAlf.g:8922:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) )
            // InternalAlf.g:8923:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            {
            // InternalAlf.g:8923:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            int alt150=4;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt150=1;
                }
                break;
            case 79:
                {
                alt150=2;
                }
                break;
            case 80:
                {
                alt150=3;
                }
                break;
            case 81:
                {
                alt150=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 150, 0, input);

                throw nvae;
            }

            switch (alt150) {
                case 1 :
                    // InternalAlf.g:8924:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:8924:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:8925:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:8932:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:8932:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:8933:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:8940:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalAlf.g:8940:3: (enumLiteral_2= 'protected' )
                    // InternalAlf.g:8941:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:8948:3: (enumLiteral_3= 'packaged' )
                    {
                    // InternalAlf.g:8948:3: (enumLiteral_3= 'packaged' )
                    // InternalAlf.g:8949:4: enumLiteral_3= 'packaged'
                    {
                    enumLiteral_3=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPackageEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityIndicatorAccess().getPackageEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibilityIndicator"


    // $ANTLR start "ruleFeatureDirection"
    // InternalAlf.g:8959:1: ruleFeatureDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFeatureDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAlf.g:8965:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalAlf.g:8966:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalAlf.g:8966:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt151=3;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt151=1;
                }
                break;
            case 83:
                {
                alt151=2;
                }
                break;
            case 84:
                {
                alt151=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;
            }

            switch (alt151) {
                case 1 :
                    // InternalAlf.g:8967:3: (enumLiteral_0= 'in' )
                    {
                    // InternalAlf.g:8967:3: (enumLiteral_0= 'in' )
                    // InternalAlf.g:8968:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:8975:3: (enumLiteral_1= 'out' )
                    {
                    // InternalAlf.g:8975:3: (enumLiteral_1= 'out' )
                    // InternalAlf.g:8976:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:8983:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalAlf.g:8983:3: (enumLiteral_2= 'inout' )
                    // InternalAlf.g:8984:4: enumLiteral_2= 'inout'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getInoutEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFeatureDirectionAccess().getInoutEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureDirection"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA103 dfa103 = new DFA103(this);
    protected DFA99 dfa99 = new DFA99(this);
    protected DFA107 dfa107 = new DFA107(this);
    protected DFA104 dfa104 = new DFA104(this);
    protected DFA133 dfa133 = new DFA133(this);
    static final String dfa_1s = "\40\uffff";
    static final String dfa_2s = "\2\4\2\20\1\11\1\uffff\1\32\7\uffff\2\21\2\11\1\4\1\11\1\24\2\21\2\24\2\22\1\4\2\11\2\24";
    static final String dfa_3s = "\2\117\2\20\1\12\1\uffff\1\40\7\uffff\2\25\1\23\1\12\1\117\1\23\1\24\2\25\2\24\2\25\1\117\2\23\2\24";
    static final String dfa_4s = "\5\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\22\uffff";
    static final String dfa_5s = "\40\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\13\uffff\1\4\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\6\54\uffff\1\2\1\3",
            "\1\1\13\uffff\1\4\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\6\54\uffff\1\2\1\3",
            "\1\4",
            "\1\4",
            "\1\16\1\17",
            "",
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\20\1\23\1\uffff\1\22\1\21",
            "\1\20\1\23\1\uffff\1\22\1\21",
            "\1\25\1\26\10\uffff\1\24",
            "\1\27\1\30",
            "\1\1\13\uffff\1\4\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\6\54\uffff\1\2\1\3",
            "\1\31\1\32\10\uffff\1\24",
            "\1\33",
            "\1\34\2\uffff\1\22\1\21",
            "\1\34\2\uffff\1\22\1\21",
            "\1\22",
            "\1\22",
            "\1\35\1\uffff\1\22\1\21",
            "\1\35\1\uffff\1\22\1\21",
            "\1\1\13\uffff\1\4\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\6\54\uffff\1\2\1\3",
            "\1\25\1\26\10\uffff\1\36",
            "\1\31\1\32\10\uffff\1\37",
            "\1\33",
            "\1\33"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "79:2: (this_PackageUnitDefinition_0= rulePackageUnitDefinition | this_ClassUnitDefinition_1= ruleClassUnitDefinition | this_ObjectClassUnitDefinition_2= ruleObjectClassUnitDefinition | this_ValueClassUnitDefinition_3= ruleValueClassUnitDefinition | this_AssociationUnitDefinition_4= ruleAssociationUnitDefinition | this_BehaviorUnitDefinition_5= ruleBehaviorUnitDefinition | this_FunctionUnitDefinition_6= ruleFunctionUnitDefinition | this_FeatureUnitDefinition_7= ruleFeatureUnitDefinition )";
        }
    }
    static final String dfa_7s = "\22\uffff";
    static final String dfa_8s = "\2\4\1\uffff\2\20\1\11\2\21\1\11\1\uffff\1\11\1\uffff\2\21\2\22\2\11";
    static final String dfa_9s = "\2\117\1\uffff\2\20\1\12\2\25\1\23\1\uffff\1\23\1\uffff\4\25\2\23";
    static final String dfa_10s = "\2\uffff\1\3\6\uffff\1\2\1\uffff\1\1\6\uffff";
    static final String dfa_11s = "\22\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\13\uffff\1\5\5\uffff\1\2\3\uffff\10\2\54\uffff\1\3\1\4",
            "\1\1\13\uffff\1\5\5\uffff\1\2\3\uffff\10\2\54\uffff\1\3\1\4",
            "",
            "\1\5",
            "\1\5",
            "\1\6\1\7",
            "\1\10\1\12\1\uffff\2\11",
            "\1\10\1\12\1\uffff\2\11",
            "\1\14\1\15\10\uffff\1\13",
            "",
            "\1\16\1\17\10\uffff\1\13",
            "",
            "\1\20\2\uffff\2\11",
            "\1\20\2\uffff\2\11",
            "\1\21\1\uffff\2\11",
            "\1\21\1\uffff\2\11",
            "\1\14\1\15\10\uffff\1\13",
            "\1\16\1\17\10\uffff\1\13"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 492:3: ( ( (lv_ownedRelationship_0_0= rulePackageImport ) ) | ( (lv_ownedRelationship_1_0= ruleElementImport ) ) )*";
        }
    }
    static final String dfa_13s = "\1\4\1\uffff\1\4\2\11\1\uffff\1\11\2\21\2\11\2\22\1\uffff\2\21\2\11";
    static final String dfa_14s = "\1\117\1\uffff\1\117\2\41\1\uffff\1\12\2\25\2\23\2\25\1\uffff\2\25\2\23";
    static final String dfa_15s = "\1\uffff\1\3\3\uffff\1\1\7\uffff\1\2\4\uffff";
    static final String[] dfa_16s = {
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\1\uffff\1\1\1\uffff\10\5\54\uffff\1\3\1\4",
            "",
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\10\5\54\uffff\1\3\1\4",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\10\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\10\5",
            "",
            "\1\7\1\10",
            "\1\12\1\11\1\uffff\2\5",
            "\1\12\1\11\1\uffff\2\5",
            "\1\13\1\14\10\uffff\1\15",
            "\1\16\1\17\10\uffff\1\15",
            "\1\20\1\uffff\2\5",
            "\1\20\1\uffff\2\5",
            "",
            "\1\21\2\uffff\2\5",
            "\1\21\2\uffff\2\5",
            "\1\13\1\14\10\uffff\1\15",
            "\1\16\1\17\10\uffff\1\15"
    };
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[][] dfa_16 = unpackEncodedStringArray(dfa_16s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_16;
        }
        public String getDescription() {
            return "()* loopback of 1005:3: ( ( (lv_ownedRelationship_3_0= rulePackageMember ) ) | ( (lv_ownedRelationship_4_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_17s = "\37\uffff";
    static final String dfa_18s = "\1\20\1\11\1\uffff\6\11\1\uffff\2\27\1\uffff\2\24\1\uffff\2\24\1\uffff\2\24\1\uffff\2\24\1\uffff\2\31\1\uffff\2\31\1\uffff";
    static final String dfa_19s = "\1\41\1\31\1\uffff\6\31\1\uffff\2\31\1\uffff\2\45\1\uffff\2\45\1\uffff\2\45\1\uffff\2\45\1\uffff\2\50\1\uffff\2\50\1\uffff";
    static final String dfa_20s = "\2\uffff\1\1\6\uffff\1\11\2\uffff\1\2\2\uffff\1\3\2\uffff\1\4\2\uffff\1\5\2\uffff\1\6\2\uffff\1\7\2\uffff\1\10";
    static final String dfa_21s = "\37\uffff}>";
    static final String[] dfa_22s = {
            "\1\11\5\uffff\1\1\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\2",
            "\1\12\1\13\16\uffff\1\14",
            "",
            "\1\15\1\16\16\uffff\1\17",
            "\1\20\1\21\16\uffff\1\22",
            "\1\23\1\24\16\uffff\1\25",
            "\1\26\1\27\16\uffff\1\30",
            "\1\31\1\32\16\uffff\1\33",
            "\1\34\1\35\16\uffff\1\36",
            "",
            "\1\2\1\uffff\1\14",
            "\1\2\1\uffff\1\14",
            "",
            "\1\2\2\uffff\1\2\1\uffff\1\17\13\uffff\1\2",
            "\1\2\2\uffff\1\2\1\uffff\1\17\13\uffff\1\2",
            "",
            "\1\2\2\uffff\1\2\1\uffff\1\22\13\uffff\1\2",
            "\1\2\2\uffff\1\2\1\uffff\1\22\13\uffff\1\2",
            "",
            "\1\2\2\uffff\1\2\1\uffff\1\25\13\uffff\1\2",
            "\1\2\2\uffff\1\2\1\uffff\1\25\13\uffff\1\2",
            "",
            "\1\2\2\uffff\1\2\1\uffff\1\30\13\uffff\1\2",
            "\1\2\2\uffff\1\2\1\uffff\1\30\13\uffff\1\2",
            "",
            "\1\33\16\uffff\1\2",
            "\1\33\16\uffff\1\2",
            "",
            "\1\36\16\uffff\1\2",
            "\1\36\16\uffff\1\2",
            ""
    };

    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_17;
            this.eof = dfa_17;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_21;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "1168:2: ( ( (lv_ownedRelatedElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) | (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' ) | (otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';' ) | (otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';' ) | (otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';' ) )";
        }
    }
    static final String dfa_23s = "\15\uffff";
    static final String dfa_24s = "\2\11\2\24\1\11\2\24\3\uffff\1\11\2\uffff";
    static final String dfa_25s = "\1\41\1\54\2\66\1\40\2\66\3\uffff\1\54\2\uffff";
    static final String dfa_26s = "\7\uffff\1\3\1\5\1\1\1\uffff\1\2\1\4";
    static final String dfa_27s = "\15\uffff}>";
    static final String[] dfa_28s = {
            "\1\2\1\3\25\uffff\1\1\1\4",
            "\1\5\1\6\16\uffff\1\10\22\uffff\1\7",
            "\1\11\2\uffff\1\11\1\uffff\1\10\22\uffff\3\11\2\uffff\3\11\2\uffff\1\11",
            "\1\11\2\uffff\1\11\1\uffff\1\10\22\uffff\3\11\2\uffff\3\11\2\uffff\1\11",
            "\2\13\25\uffff\1\12",
            "\1\11\2\uffff\1\11\1\uffff\1\10\22\uffff\3\11\2\uffff\3\11\2\uffff\1\11",
            "\1\11\2\uffff\1\11\1\uffff\1\10\22\uffff\3\11\2\uffff\3\11\2\uffff\1\11",
            "",
            "",
            "",
            "\2\13\41\uffff\1\14",
            "",
            ""
    };

    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_23;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "1602:2: ( ( (otherlv_0= 'feature' )? ( (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'abstract' (otherlv_3= 'feature' )? ( (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition ) ) ) | (otherlv_5= 'feature' ( (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_7= 'abstract' otherlv_8= 'feature' ( (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? ) | ( (lv_memberName_12_0= ruleName ) ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) )";
        }
    }
    static final String dfa_29s = "\1\4\1\uffff\1\4\2\11\1\uffff\1\11\2\21\2\11\2\21\1\uffff\2\22\2\11";
    static final String dfa_30s = "\1\124\1\uffff\3\124\1\uffff\1\12\2\25\2\23\2\25\1\uffff\2\25\2\23";
    static final String[] dfa_31s = {
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\1\uffff\1\1\1\uffff\13\5\51\uffff\1\3\1\4\5\5",
            "",
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\51\uffff\1\3\1\4\5\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\55\uffff\3\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\55\uffff\3\5",
            "",
            "\1\7\1\10",
            "\1\11\1\12\1\uffff\2\5",
            "\1\11\1\12\1\uffff\2\5",
            "\1\13\1\14\10\uffff\1\15",
            "\1\16\1\17\10\uffff\1\15",
            "\1\20\2\uffff\2\5",
            "\1\20\2\uffff\2\5",
            "",
            "\1\21\1\uffff\2\5",
            "\1\21\1\uffff\2\5",
            "\1\13\1\14\10\uffff\1\15",
            "\1\16\1\17\10\uffff\1\15"
    };
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "()* loopback of 1815:4: ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_32s = "\1\4\1\uffff\1\4\2\11\1\uffff\1\11\2\21\2\11\1\uffff\2\21\2\22\2\11";
    static final String dfa_33s = "\1\124\1\uffff\3\124\1\uffff\1\12\2\25\2\23\1\uffff\4\25\2\23";
    static final String dfa_34s = "\1\uffff\1\3\3\uffff\1\1\5\uffff\1\2\6\uffff";
    static final String[] dfa_35s = {
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\1\uffff\1\1\1\uffff\13\5\51\uffff\1\3\1\4\5\5",
            "",
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\51\uffff\1\3\1\4\5\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\55\uffff\3\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\55\uffff\3\5",
            "",
            "\1\7\1\10",
            "\1\11\1\12\1\uffff\2\5",
            "\1\11\1\12\1\uffff\2\5",
            "\1\14\1\15\10\uffff\1\13",
            "\1\16\1\17\10\uffff\1\13",
            "",
            "\1\20\2\uffff\2\5",
            "\1\20\2\uffff\2\5",
            "\1\21\1\uffff\2\5",
            "\1\21\1\uffff\2\5",
            "\1\14\1\15\10\uffff\1\13",
            "\1\16\1\17\10\uffff\1\13"
    };
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[][] dfa_35 = unpackEncodedStringArray(dfa_35s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_11;
            this.transition = dfa_35;
        }
        public String getDescription() {
            return "()* loopback of 1904:4: ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_36s = "\12\uffff";
    static final String dfa_37s = "\2\4\4\11\1\uffff\1\11\2\uffff";
    static final String dfa_38s = "\6\124\1\uffff\1\124\2\uffff";
    static final String dfa_39s = "\6\uffff\1\1\1\uffff\1\2\1\3";
    static final String dfa_40s = "\12\uffff}>";
    static final String[] dfa_41s = {
            "\1\1\4\uffff\2\11\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\51\uffff\1\2\1\3\1\4\1\5\3\11",
            "\1\1\4\uffff\2\11\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\51\uffff\1\2\1\3\1\4\1\5\3\11",
            "\2\11\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\55\uffff\3\11",
            "\2\11\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\55\uffff\3\11",
            "\2\11\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\55\uffff\3\11",
            "\2\11\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\55\uffff\3\11",
            "",
            "\2\11\17\uffff\6\6\1\10\1\uffff\3\10\55\uffff\3\11",
            "",
            ""
    };

    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final short[][] dfa_41 = unpackEncodedStringArray(dfa_41s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_36;
            this.eof = dfa_36;
            this.min = dfa_37;
            this.max = dfa_38;
            this.accept = dfa_39;
            this.special = dfa_40;
            this.transition = dfa_41;
        }
        public String getDescription() {
            return "1968:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureMember_1= ruleFeatureMember | this_FeatureCategoryMember_2= ruleFeatureCategoryMember )";
        }
    }
    static final String dfa_42s = "\16\uffff";
    static final String dfa_43s = "\1\11\2\21\1\uffff\1\11\2\21\2\11\1\uffff\2\21\2\22";
    static final String dfa_44s = "\1\56\2\70\1\uffff\1\12\2\70\2\12\1\uffff\4\70";
    static final String dfa_45s = "\3\uffff\1\1\5\uffff\1\2\4\uffff";
    static final String dfa_46s = "\16\uffff}>";
    static final String[] dfa_47s = {
            "\1\1\1\2\16\uffff\1\4\16\uffff\1\3\5\uffff\1\3",
            "\2\3\6\uffff\1\4\16\uffff\1\3\5\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "\2\3\6\uffff\1\4\16\uffff\1\3\5\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "",
            "\1\5\1\6",
            "\1\7\1\10\1\uffff\1\11\31\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "\1\7\1\10\1\uffff\1\11\31\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "\1\12\1\13",
            "\1\14\1\15",
            "",
            "\1\7\2\uffff\1\11\31\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "\1\7\2\uffff\1\11\31\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "\1\10\1\uffff\1\11\31\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "\1\10\1\uffff\1\11\31\uffff\1\3\4\uffff\1\3\3\uffff\2\3"
    };

    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[][] dfa_47 = unpackEncodedStringArray(dfa_47s);

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_42;
            this.eof = dfa_42;
            this.min = dfa_43;
            this.max = dfa_44;
            this.accept = dfa_45;
            this.special = dfa_46;
            this.transition = dfa_47;
        }
        public String getDescription() {
            return "2460:5: ( ( (lv_ownedRelatedElement_17_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_18_0= ruleName ) )? otherlv_19= 'is' ( ( ruleQualifiedName ) ) otherlv_21= ';' ) )";
        }
    }
    static final String[] dfa_48s = {
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\1\uffff\1\1\1\uffff\13\5\2\uffff\1\5\46\uffff\1\3\1\4\5\5",
            "",
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\2\uffff\1\5\46\uffff\1\3\1\4\5\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\2\uffff\1\5\52\uffff\3\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\2\uffff\1\5\52\uffff\3\5",
            "",
            "\1\7\1\10",
            "\1\11\1\12\1\uffff\2\5",
            "\1\11\1\12\1\uffff\2\5",
            "\1\14\1\15\10\uffff\1\13",
            "\1\16\1\17\10\uffff\1\13",
            "",
            "\1\20\2\uffff\2\5",
            "\1\20\2\uffff\2\5",
            "\1\21\1\uffff\2\5",
            "\1\21\1\uffff\2\5",
            "\1\14\1\15\10\uffff\1\13",
            "\1\16\1\17\10\uffff\1\13"
    };
    static final short[][] dfa_48 = unpackEncodedStringArray(dfa_48s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_11;
            this.transition = dfa_48;
        }
        public String getDescription() {
            return "()* loopback of 3192:4: ( ( (lv_ownedRelationship_2_0= ruleAssociationMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )*";
        }
    }
    static final String[] dfa_49s = {
            "\1\1\4\uffff\2\11\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\2\uffff\1\11\46\uffff\1\2\1\3\1\4\1\5\3\11",
            "\1\1\4\uffff\2\11\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\2\uffff\1\11\46\uffff\1\2\1\3\1\4\1\5\3\11",
            "\2\11\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\2\uffff\1\11\52\uffff\3\11",
            "\2\11\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\2\uffff\1\11\52\uffff\3\11",
            "\2\11\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\2\uffff\1\11\52\uffff\3\11",
            "\2\11\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\2\uffff\1\11\52\uffff\3\11",
            "",
            "\2\11\17\uffff\6\6\1\10\1\uffff\3\10\2\uffff\1\11\52\uffff\3\11",
            "",
            ""
    };
    static final short[][] dfa_49 = unpackEncodedStringArray(dfa_49s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_36;
            this.eof = dfa_36;
            this.min = dfa_37;
            this.max = dfa_38;
            this.accept = dfa_39;
            this.special = dfa_40;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "3256:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureMember_1= ruleFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )";
        }
    }
    static final String dfa_50s = "\3\11\1\uffff\2\24\1\11\4\uffff\2\24\1\uffff";
    static final String dfa_51s = "\3\124\1\uffff\2\66\1\124\4\uffff\2\66\1\uffff";
    static final String dfa_52s = "\3\uffff\1\4\3\uffff\1\1\1\5\1\2\1\6\2\uffff\1\3";
    static final String[] dfa_53s = {
            "\1\4\1\5\26\uffff\1\2\5\uffff\1\1\52\uffff\3\3",
            "\2\7\27\uffff\1\6\1\7\10\uffff\1\7\45\uffff\3\7",
            "\2\10\34\uffff\1\11\52\uffff\3\10",
            "",
            "\1\3\2\uffff\1\3\1\uffff\1\12\22\uffff\3\3\2\uffff\3\3\2\uffff\1\3",
            "\1\3\2\uffff\1\3\1\uffff\1\12\22\uffff\3\3\2\uffff\3\3\2\uffff\1\3",
            "\1\13\1\14\16\uffff\1\15\22\uffff\1\7\45\uffff\3\7",
            "",
            "",
            "",
            "",
            "\1\7\2\uffff\1\7\1\uffff\1\15\22\uffff\3\7\2\uffff\3\7\2\uffff\1\7",
            "\1\7\2\uffff\1\7\1\uffff\1\15\22\uffff\3\7\2\uffff\3\7\2\uffff\1\7",
            ""
    };
    static final char[] dfa_50 = DFA.unpackEncodedStringToUnsignedChars(dfa_50s);
    static final char[] dfa_51 = DFA.unpackEncodedStringToUnsignedChars(dfa_51s);
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[][] dfa_53 = unpackEncodedStringArray(dfa_53s);

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_42;
            this.eof = dfa_42;
            this.min = dfa_50;
            this.max = dfa_51;
            this.accept = dfa_52;
            this.special = dfa_46;
            this.transition = dfa_53;
        }
        public String getDescription() {
            return "3313:3: ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'abstract' otherlv_7= 'end' ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )? ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_12= 'end' ( (lv_isPart_13_0= 'part' ) ) ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | ( ( (lv_direction_18_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_20= 'abstract' ( (lv_direction_21_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_23_0= ruleName ) ) otherlv_24= 'is' ( ( ruleQualifiedName ) ) otherlv_26= ';' ) )";
        }
    }
    static final String dfa_54s = "\1\4\1\uffff\1\4\2\20\1\uffff\1\11\2\21\2\11\2\22\1\uffff\2\21\2\11";
    static final String dfa_55s = "\1\121\1\uffff\1\121\2\53\1\uffff\1\12\2\25\2\23\2\25\1\uffff\2\25\2\23";
    static final String[] dfa_56s = {
            "\1\2\13\uffff\1\6\5\uffff\1\5\1\uffff\1\1\1\uffff\13\5\5\uffff\2\5\42\uffff\1\3\1\4\2\5",
            "",
            "\1\2\13\uffff\1\6\5\uffff\1\5\3\uffff\13\5\5\uffff\2\5\42\uffff\1\3\1\4\2\5",
            "\1\6\5\uffff\1\5\3\uffff\13\5\5\uffff\2\5",
            "\1\6\5\uffff\1\5\3\uffff\13\5\5\uffff\2\5",
            "",
            "\1\7\1\10",
            "\1\12\1\11\1\uffff\2\5",
            "\1\12\1\11\1\uffff\2\5",
            "\1\13\1\14\10\uffff\1\15",
            "\1\16\1\17\10\uffff\1\15",
            "\1\20\1\uffff\2\5",
            "\1\20\1\uffff\2\5",
            "",
            "\1\21\2\uffff\2\5",
            "\1\21\2\uffff\2\5",
            "\1\13\1\14\10\uffff\1\15",
            "\1\16\1\17\10\uffff\1\15"
    };
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final short[][] dfa_56 = unpackEncodedStringArray(dfa_56s);

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_54;
            this.max = dfa_55;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_56;
        }
        public String getDescription() {
            return "()* loopback of 3893:4: ( ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_57s = "\2\4\4\20\1\uffff\1\32\2\uffff";
    static final String dfa_58s = "\2\121\4\53\1\uffff\1\53\2\uffff";
    static final String[] dfa_59s = {
            "\1\1\13\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\5\uffff\2\11\42\uffff\1\2\1\3\1\4\1\5",
            "\1\1\13\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\5\uffff\2\11\42\uffff\1\2\1\3\1\4\1\5",
            "\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\5\uffff\2\11",
            "\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\5\uffff\2\11",
            "\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\5\uffff\2\11",
            "\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\5\uffff\2\11",
            "",
            "\6\6\1\10\1\uffff\3\10\5\uffff\2\11",
            "",
            ""
    };
    static final char[] dfa_57 = DFA.unpackEncodedStringToUnsignedChars(dfa_57s);
    static final char[] dfa_58 = DFA.unpackEncodedStringToUnsignedChars(dfa_58s);
    static final short[][] dfa_59 = unpackEncodedStringArray(dfa_59s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_36;
            this.eof = dfa_36;
            this.min = dfa_57;
            this.max = dfa_58;
            this.accept = dfa_39;
            this.special = dfa_40;
            this.transition = dfa_59;
        }
        public String getDescription() {
            return "4033:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureMember_1= ruleFeatureMember | this_BehaviorStepMember_2= ruleBehaviorStepMember )";
        }
    }
    static final String dfa_60s = "\1\41\1\uffff\2\11\2\31\1\uffff\2\31\1\uffff";
    static final String dfa_61s = "\1\53\1\uffff\2\54\2\50\1\uffff\2\50\1\uffff";
    static final String dfa_62s = "\1\uffff\1\1\4\uffff\1\2\2\uffff\1\3";
    static final String[] dfa_63s = {
            "\1\1\10\uffff\1\2\1\3",
            "",
            "\1\4\1\5\16\uffff\1\6\22\uffff\1\1",
            "\1\7\1\10\16\uffff\1\11\22\uffff\1\1",
            "\1\6\16\uffff\1\1",
            "\1\6\16\uffff\1\1",
            "",
            "\1\11\16\uffff\1\1",
            "\1\11\16\uffff\1\1",
            ""
    };
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final char[] dfa_61 = DFA.unpackEncodedStringToUnsignedChars(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final short[][] dfa_63 = unpackEncodedStringArray(dfa_63s);

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = dfa_36;
            this.eof = dfa_36;
            this.min = dfa_60;
            this.max = dfa_61;
            this.accept = dfa_62;
            this.special = dfa_40;
            this.transition = dfa_63;
        }
        public String getDescription() {
            return "4090:3: ( ( ( (lv_ownedRelatedElement_1_1= ruleStepDefinition | lv_ownedRelatedElement_1_2= ruleExpressionDefinition ) ) ) | (otherlv_2= 'step' ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) | (otherlv_7= 'expr' ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) )";
        }
    }
    static final String dfa_64s = "\1\4\1\uffff\1\4\2\20\1\uffff\1\11\2\21\2\11\1\uffff\2\21\2\22\2\11";
    static final String dfa_65s = "\1\121\1\uffff\1\121\2\53\1\uffff\1\12\2\25\2\23\1\uffff\4\25\2\23";
    static final String[] dfa_66s = {
            "\1\2\6\1\5\uffff\1\6\1\uffff\2\1\2\uffff\1\5\2\1\1\uffff\13\5\3\uffff\1\1\1\uffff\2\5\31\uffff\2\1\3\uffff\2\1\1\uffff\1\1\1\3\1\4\2\5",
            "",
            "\1\2\13\uffff\1\6\5\uffff\1\5\3\uffff\13\5\5\uffff\2\5\42\uffff\1\3\1\4\2\5",
            "\1\6\5\uffff\1\5\3\uffff\13\5\5\uffff\2\5",
            "\1\6\5\uffff\1\5\3\uffff\13\5\5\uffff\2\5",
            "",
            "\1\7\1\10",
            "\1\11\1\12\1\uffff\2\5",
            "\1\11\1\12\1\uffff\2\5",
            "\1\14\1\15\10\uffff\1\13",
            "\1\16\1\17\10\uffff\1\13",
            "",
            "\1\20\2\uffff\2\5",
            "\1\20\2\uffff\2\5",
            "\1\21\1\uffff\2\5",
            "\1\21\1\uffff\2\5",
            "\1\14\1\15\10\uffff\1\13",
            "\1\16\1\17\10\uffff\1\13"
    };
    static final char[] dfa_64 = DFA.unpackEncodedStringToUnsignedChars(dfa_64s);
    static final char[] dfa_65 = DFA.unpackEncodedStringToUnsignedChars(dfa_65s);
    static final short[][] dfa_66 = unpackEncodedStringArray(dfa_66s);

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_64;
            this.max = dfa_65;
            this.accept = dfa_34;
            this.special = dfa_11;
            this.transition = dfa_66;
        }
        public String getDescription() {
            return "()* loopback of 4430:4: ( ( (lv_ownedRelationship_2_0= ruleBehaviorMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_67s = "\27\uffff";
    static final String dfa_68s = "\1\11\2\21\1\11\2\uffff\1\11\4\21\4\11\2\22\2\21\2\22\2\21";
    static final String dfa_69s = "\1\56\2\70\1\12\2\uffff\1\12\2\50\2\67\4\12\4\50\4\67";
    static final String dfa_70s = "\4\uffff\1\1\1\2\21\uffff";
    static final String dfa_71s = "\27\uffff}>";
    static final String[] dfa_72s = {
            "\1\1\1\2\16\uffff\1\4\16\uffff\1\5\5\uffff\1\3",
            "\2\4\6\uffff\1\4\16\uffff\1\5\5\uffff\1\6\4\uffff\1\4\3\uffff\2\4",
            "\2\4\6\uffff\1\4\16\uffff\1\5\5\uffff\1\6\4\uffff\1\4\3\uffff\2\4",
            "\1\7\1\10",
            "",
            "",
            "\1\11\1\12",
            "\1\14\1\13\6\uffff\1\4\16\uffff\1\5",
            "\1\14\1\13\6\uffff\1\4\16\uffff\1\5",
            "\1\16\1\15\6\uffff\1\4\16\uffff\1\5\12\uffff\1\4\3\uffff\1\4",
            "\1\16\1\15\6\uffff\1\4\16\uffff\1\5\12\uffff\1\4\3\uffff\1\4",
            "\1\17\1\20",
            "\1\21\1\22",
            "\1\23\1\24",
            "\1\25\1\26",
            "\1\13\6\uffff\1\4\16\uffff\1\5",
            "\1\13\6\uffff\1\4\16\uffff\1\5",
            "\1\14\7\uffff\1\4\16\uffff\1\5",
            "\1\14\7\uffff\1\4\16\uffff\1\5",
            "\1\15\6\uffff\1\4\16\uffff\1\5\12\uffff\1\4\3\uffff\1\4",
            "\1\15\6\uffff\1\4\16\uffff\1\5\12\uffff\1\4\3\uffff\1\4",
            "\1\16\7\uffff\1\4\16\uffff\1\5\12\uffff\1\4\3\uffff\1\4",
            "\1\16\7\uffff\1\4\16\uffff\1\5\12\uffff\1\4\3\uffff\1\4"
    };

    static final short[] dfa_67 = DFA.unpackEncodedString(dfa_67s);
    static final char[] dfa_68 = DFA.unpackEncodedStringToUnsignedChars(dfa_68s);
    static final char[] dfa_69 = DFA.unpackEncodedStringToUnsignedChars(dfa_69s);
    static final short[] dfa_70 = DFA.unpackEncodedString(dfa_70s);
    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final short[][] dfa_72 = unpackEncodedStringArray(dfa_72s);

    class DFA103 extends DFA {

        public DFA103(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 103;
            this.eot = dfa_67;
            this.eof = dfa_67;
            this.min = dfa_68;
            this.max = dfa_69;
            this.accept = dfa_70;
            this.special = dfa_71;
            this.transition = dfa_72;
        }
        public String getDescription() {
            return "5675:2: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_ownedRelationship_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_ownedRelationship_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_ownedRelationship_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_ownedRelationship_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) )";
        }
    }
    static final String dfa_73s = "\1\11\2\21\1\uffff\1\11\1\uffff\2\21\2\11\2\22\2\21";
    static final String dfa_74s = "\1\56\2\70\1\uffff\1\12\1\uffff\2\67\2\12\4\67";
    static final String dfa_75s = "\3\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String[] dfa_76s = {
            "\1\1\1\2\16\uffff\1\3\24\uffff\1\3",
            "\2\5\6\uffff\1\3\24\uffff\1\4\4\uffff\1\5\3\uffff\2\5",
            "\2\5\6\uffff\1\3\24\uffff\1\4\4\uffff\1\5\3\uffff\2\5",
            "",
            "\1\6\1\7",
            "",
            "\1\11\1\10\6\uffff\1\3\31\uffff\1\5\3\uffff\1\5",
            "\1\11\1\10\6\uffff\1\3\31\uffff\1\5\3\uffff\1\5",
            "\1\12\1\13",
            "\1\14\1\15",
            "\1\10\6\uffff\1\3\31\uffff\1\5\3\uffff\1\5",
            "\1\10\6\uffff\1\3\31\uffff\1\5\3\uffff\1\5",
            "\1\11\7\uffff\1\3\31\uffff\1\5\3\uffff\1\5",
            "\1\11\7\uffff\1\3\31\uffff\1\5\3\uffff\1\5"
    };
    static final char[] dfa_73 = DFA.unpackEncodedStringToUnsignedChars(dfa_73s);
    static final char[] dfa_74 = DFA.unpackEncodedStringToUnsignedChars(dfa_74s);
    static final short[] dfa_75 = DFA.unpackEncodedString(dfa_75s);
    static final short[][] dfa_76 = unpackEncodedStringArray(dfa_76s);

    class DFA99 extends DFA {

        public DFA99(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 99;
            this.eot = dfa_42;
            this.eof = dfa_42;
            this.min = dfa_73;
            this.max = dfa_74;
            this.accept = dfa_75;
            this.special = dfa_46;
            this.transition = dfa_76;
        }
        public String getDescription() {
            return "5677:4: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )?";
        }
    }
    static final String dfa_77s = "\21\uffff";
    static final String dfa_78s = "\1\uffff\2\4\5\uffff\4\4\2\uffff\1\4\2\uffff";
    static final String dfa_79s = "\1\11\2\21\1\11\1\uffff\1\11\1\7\1\uffff\2\22\2\21\1\64\1\65\1\24\1\7\1\65";
    static final String dfa_80s = "\1\12\2\70\1\12\1\uffff\1\12\1\23\1\uffff\4\70\2\65\1\70\1\23\1\65";
    static final String dfa_81s = "\4\uffff\1\1\2\uffff\1\2\11\uffff";
    static final String dfa_82s = "\21\uffff}>";
    static final String[] dfa_83s = {
            "\1\1\1\2",
            "\1\5\1\3\1\uffff\1\4\2\uffff\1\4\16\uffff\1\4\2\uffff\1\4\4\uffff\1\4\4\uffff\1\6\3\uffff\1\4\1\7",
            "\1\5\1\3\1\uffff\1\4\2\uffff\1\4\16\uffff\1\4\2\uffff\1\4\4\uffff\1\4\4\uffff\1\6\3\uffff\1\4\1\7",
            "\1\10\1\11",
            "",
            "\1\12\1\13",
            "\1\14\13\uffff\1\15",
            "",
            "\1\3\1\uffff\1\4\2\uffff\1\4\16\uffff\1\4\2\uffff\1\4\4\uffff\1\4\4\uffff\1\6\3\uffff\1\4\1\7",
            "\1\3\1\uffff\1\4\2\uffff\1\4\16\uffff\1\4\2\uffff\1\4\4\uffff\1\4\4\uffff\1\6\3\uffff\1\4\1\7",
            "\1\5\2\uffff\1\4\2\uffff\1\4\16\uffff\1\4\2\uffff\1\4\4\uffff\1\4\4\uffff\1\6\3\uffff\1\4\1\7",
            "\1\5\2\uffff\1\4\2\uffff\1\4\16\uffff\1\4\2\uffff\1\4\4\uffff\1\4\4\uffff\1\6\3\uffff\1\4\1\7",
            "\1\17\1\16",
            "\1\16",
            "\1\4\2\uffff\1\4\16\uffff\1\4\2\uffff\1\4\15\uffff\1\4\1\7",
            "\1\20\13\uffff\1\15",
            "\1\16"
    };

    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final short[] dfa_78 = DFA.unpackEncodedString(dfa_78s);
    static final char[] dfa_79 = DFA.unpackEncodedStringToUnsignedChars(dfa_79s);
    static final char[] dfa_80 = DFA.unpackEncodedStringToUnsignedChars(dfa_80s);
    static final short[] dfa_81 = DFA.unpackEncodedString(dfa_81s);
    static final short[] dfa_82 = DFA.unpackEncodedString(dfa_82s);
    static final short[][] dfa_83 = unpackEncodedStringArray(dfa_83s);

    class DFA107 extends DFA {

        public DFA107(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 107;
            this.eot = dfa_77;
            this.eof = dfa_78;
            this.min = dfa_79;
            this.max = dfa_80;
            this.accept = dfa_81;
            this.special = dfa_82;
            this.transition = dfa_83;
        }
        public String getDescription() {
            return "5943:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )";
        }
    }
    static final String dfa_84s = "\13\uffff";
    static final String dfa_85s = "\1\uffff\2\4\4\uffff\4\4";
    static final String dfa_86s = "\1\11\2\21\2\uffff\2\11\2\22\2\21";
    static final String dfa_87s = "\1\12\2\67\2\uffff\2\12\4\67";
    static final String dfa_88s = "\3\uffff\1\1\1\2\6\uffff";
    static final String dfa_89s = "\13\uffff}>";
    static final String[] dfa_90s = {
            "\1\1\1\2",
            "\1\6\1\5\1\uffff\1\4\2\uffff\1\4\16\uffff\1\4\2\uffff\1\4\4\uffff\1\3\4\uffff\1\4\3\uffff\1\4",
            "\1\6\1\5\1\uffff\1\4\2\uffff\1\4\16\uffff\1\4\2\uffff\1\4\4\uffff\1\3\4\uffff\1\4\3\uffff\1\4",
            "",
            "",
            "\1\7\1\10",
            "\1\11\1\12",
            "\1\5\1\uffff\1\4\2\uffff\1\4\16\uffff\1\4\2\uffff\1\4\4\uffff\1\3\4\uffff\1\4\3\uffff\1\4",
            "\1\5\1\uffff\1\4\2\uffff\1\4\16\uffff\1\4\2\uffff\1\4\4\uffff\1\3\4\uffff\1\4\3\uffff\1\4",
            "\1\6\2\uffff\1\4\2\uffff\1\4\16\uffff\1\4\2\uffff\1\4\4\uffff\1\3\4\uffff\1\4\3\uffff\1\4",
            "\1\6\2\uffff\1\4\2\uffff\1\4\16\uffff\1\4\2\uffff\1\4\4\uffff\1\3\4\uffff\1\4\3\uffff\1\4"
    };

    static final short[] dfa_84 = DFA.unpackEncodedString(dfa_84s);
    static final short[] dfa_85 = DFA.unpackEncodedString(dfa_85s);
    static final char[] dfa_86 = DFA.unpackEncodedStringToUnsignedChars(dfa_86s);
    static final char[] dfa_87 = DFA.unpackEncodedStringToUnsignedChars(dfa_87s);
    static final short[] dfa_88 = DFA.unpackEncodedString(dfa_88s);
    static final short[] dfa_89 = DFA.unpackEncodedString(dfa_89s);
    static final short[][] dfa_90 = unpackEncodedStringArray(dfa_90s);

    class DFA104 extends DFA {

        public DFA104(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 104;
            this.eot = dfa_84;
            this.eof = dfa_85;
            this.min = dfa_86;
            this.max = dfa_87;
            this.accept = dfa_88;
            this.special = dfa_89;
            this.transition = dfa_90;
        }
        public String getDescription() {
            return "5945:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )?";
        }
    }
    static final String dfa_91s = "\17\uffff";
    static final String dfa_92s = "\3\uffff\2\10\6\uffff\4\10";
    static final String dfa_93s = "\1\5\2\uffff\2\21\4\uffff\2\11\2\22\2\21";
    static final String dfa_94s = "\1\115\2\uffff\2\114\4\uffff\2\12\4\114";
    static final String dfa_95s = "\1\uffff\1\1\1\2\2\uffff\1\5\1\6\1\4\1\3\6\uffff";
    static final String dfa_96s = "\17\uffff}>";
    static final String[] dfa_97s = {
            "\4\2\1\3\1\4\7\uffff\2\2\3\uffff\1\5\20\uffff\1\6\44\uffff\1\1",
            "",
            "",
            "\1\12\1\11\2\10\2\uffff\2\10\15\uffff\1\10\1\uffff\1\7\1\10\4\uffff\1\10\4\uffff\1\10\1\uffff\1\10\3\uffff\21\10\2\uffff\1\10",
            "\1\12\1\11\2\10\2\uffff\2\10\15\uffff\1\10\1\uffff\1\7\1\10\4\uffff\1\10\4\uffff\1\10\1\uffff\1\10\3\uffff\21\10\2\uffff\1\10",
            "",
            "",
            "",
            "",
            "\1\13\1\14",
            "\1\15\1\16",
            "\1\11\2\10\2\uffff\2\10\15\uffff\1\10\1\uffff\1\7\1\10\4\uffff\1\10\4\uffff\1\10\1\uffff\1\10\3\uffff\21\10\2\uffff\1\10",
            "\1\11\2\10\2\uffff\2\10\15\uffff\1\10\1\uffff\1\7\1\10\4\uffff\1\10\4\uffff\1\10\1\uffff\1\10\3\uffff\21\10\2\uffff\1\10",
            "\1\12\1\uffff\2\10\2\uffff\2\10\15\uffff\1\10\1\uffff\1\7\1\10\4\uffff\1\10\4\uffff\1\10\1\uffff\1\10\3\uffff\21\10\2\uffff\1\10",
            "\1\12\1\uffff\2\10\2\uffff\2\10\15\uffff\1\10\1\uffff\1\7\1\10\4\uffff\1\10\4\uffff\1\10\1\uffff\1\10\3\uffff\21\10\2\uffff\1\10"
    };

    static final short[] dfa_91 = DFA.unpackEncodedString(dfa_91s);
    static final short[] dfa_92 = DFA.unpackEncodedString(dfa_92s);
    static final char[] dfa_93 = DFA.unpackEncodedStringToUnsignedChars(dfa_93s);
    static final char[] dfa_94 = DFA.unpackEncodedStringToUnsignedChars(dfa_94s);
    static final short[] dfa_95 = DFA.unpackEncodedString(dfa_95s);
    static final short[] dfa_96 = DFA.unpackEncodedString(dfa_96s);
    static final short[][] dfa_97 = unpackEncodedStringArray(dfa_97s);

    class DFA133 extends DFA {

        public DFA133(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 133;
            this.eot = dfa_91;
            this.eof = dfa_92;
            this.min = dfa_93;
            this.max = dfa_94;
            this.accept = dfa_95;
            this.special = dfa_96;
            this.transition = dfa_97;
        }
        public String getDescription() {
            return "7863:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_NameExpression_2= ruleNameExpression | this_InvocationExpression_3= ruleInvocationExpression | this_SequenceConstructionExpression_4= ruleSequenceConstructionExpression | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010012L,0x000000000000C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010010L,0x000000000000C000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000003FD410610L,0x000000000000C000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000003FC410610L,0x000000000000C000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000012L,0x000000000000C000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000600L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000600L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001FFD410610L,0x00000000001FC000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000002FC410000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000300000600L,0x00000000001C0000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000600L,0x00000000001C0000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100102000600L,0x00000000001C0000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100102000600L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000D00000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100100000600L,0x00000000001C0000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000410002000600L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000012L,0x000000000003C000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000009FFD410610L,0x00000000001FC000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000008300000600L,0x00000000001C0000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000100D00000600L,0x00000000001C0000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000100100000600L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000020000000600L,0x00000000001C0000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000600L,0x00000000001C0000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x00000C1FFD410010L,0x000000000003C000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x000E400000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x00000C0200000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x000E400000000600L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x00000D1FFDCD07F0L,0x000000000003EC60L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000200000900000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x000E600000900000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x004E500000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0040100000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x00000100008C07E0L,0x0000000000002C60L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0001800000000600L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0001000000000600L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x000E000000000002L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x00000000000C01E0L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0040104000000002L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000400002000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000400002000600L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0108000000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000100000000600L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0040100000900000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000010000900000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001EL});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000180L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x00000100008C07E0L,0x0000000000002000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x00000300008C07E0L,0x0000000000002C60L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x00000100018C07E0L,0x0000000000002C60L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000004001000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000040002L});

}
