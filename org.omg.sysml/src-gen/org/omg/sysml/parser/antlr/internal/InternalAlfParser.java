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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOCUMENTATION_COMMENT", "RULE_BOOLEAN_VALUE", "RULE_STRING_VALUE", "RULE_NATURAL_VALUE", "RULE_EXP_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'import'", "'::'", "'.'", "'*'", "';'", "'as'", "'package'", "'{'", "'}'", "'is'", "'Class'", "'class'", "'datatype'", "'assoc'", "'behavior'", "'function'", "'feature'", "'part'", "'port'", "'connector'", "'abstract'", "'specializes'", "','", "'end'", "'('", "')'", "'redefines'", "'='", "':'", "'compose'", "'any'", "'ordered'", "'nonunique'", "'['", "'..'", "']'", "'subsets'", "'to'", "'=>'", "'@'", "'+'", "'-'", "'/'", "'**'", "'&'", "'|'", "'^'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'!'", "'~'", "'null'", "'public'", "'private'", "'protected'", "'packaged'", "'in'", "'out'", "'inout'"
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
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
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
    // InternalAlf.g:72:1: ruleUnitDefinition returns [EObject current=null] : (this_PackageUnitDefinition_0= rulePackageUnitDefinition | this_ClassUnitDefinition_1= ruleClassUnitDefinition | this_ObjectClassUnitDefinition_2= ruleObjectClassUnitDefinition | this_ValueClassUnitDefinition_3= ruleValueClassUnitDefinition | this_AssociationUnitDefinition_4= ruleAssociationUnitDefinition | this_FeatureUnitDefinition_5= ruleFeatureUnitDefinition ) ;
    public final EObject ruleUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageUnitDefinition_0 = null;

        EObject this_ClassUnitDefinition_1 = null;

        EObject this_ObjectClassUnitDefinition_2 = null;

        EObject this_ValueClassUnitDefinition_3 = null;

        EObject this_AssociationUnitDefinition_4 = null;

        EObject this_FeatureUnitDefinition_5 = null;



        	enterRule();

        try {
            // InternalAlf.g:78:2: ( (this_PackageUnitDefinition_0= rulePackageUnitDefinition | this_ClassUnitDefinition_1= ruleClassUnitDefinition | this_ObjectClassUnitDefinition_2= ruleObjectClassUnitDefinition | this_ValueClassUnitDefinition_3= ruleValueClassUnitDefinition | this_AssociationUnitDefinition_4= ruleAssociationUnitDefinition | this_FeatureUnitDefinition_5= ruleFeatureUnitDefinition ) )
            // InternalAlf.g:79:2: (this_PackageUnitDefinition_0= rulePackageUnitDefinition | this_ClassUnitDefinition_1= ruleClassUnitDefinition | this_ObjectClassUnitDefinition_2= ruleObjectClassUnitDefinition | this_ValueClassUnitDefinition_3= ruleValueClassUnitDefinition | this_AssociationUnitDefinition_4= ruleAssociationUnitDefinition | this_FeatureUnitDefinition_5= ruleFeatureUnitDefinition )
            {
            // InternalAlf.g:79:2: (this_PackageUnitDefinition_0= rulePackageUnitDefinition | this_ClassUnitDefinition_1= ruleClassUnitDefinition | this_ObjectClassUnitDefinition_2= ruleObjectClassUnitDefinition | this_ValueClassUnitDefinition_3= ruleValueClassUnitDefinition | this_AssociationUnitDefinition_4= ruleAssociationUnitDefinition | this_FeatureUnitDefinition_5= ruleFeatureUnitDefinition )
            int alt1=6;
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
                    // InternalAlf.g:125:3: this_FeatureUnitDefinition_5= ruleFeatureUnitDefinition
                    {

                    			newCompositeNode(grammarAccess.getUnitDefinitionAccess().getFeatureUnitDefinitionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureUnitDefinition_5=ruleFeatureUnitDefinition();

                    state._fsp--;


                    			current = this_FeatureUnitDefinition_5;
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
    // InternalAlf.g:137:1: entryRulePackageUnitDefinition returns [EObject current=null] : iv_rulePackageUnitDefinition= rulePackageUnitDefinition EOF ;
    public final EObject entryRulePackageUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageUnitDefinition = null;


        try {
            // InternalAlf.g:137:62: (iv_rulePackageUnitDefinition= rulePackageUnitDefinition EOF )
            // InternalAlf.g:138:2: iv_rulePackageUnitDefinition= rulePackageUnitDefinition EOF
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
    // InternalAlf.g:144:1: rulePackageUnitDefinition returns [EObject current=null] : (this_UnitPrefix_0= ruleUnitPrefix[$current] this_PackageDefinition_1= rulePackageDefinition[$current] ) ;
    public final EObject rulePackageUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_UnitPrefix_0 = null;

        EObject this_PackageDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:150:2: ( (this_UnitPrefix_0= ruleUnitPrefix[$current] this_PackageDefinition_1= rulePackageDefinition[$current] ) )
            // InternalAlf.g:151:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_PackageDefinition_1= rulePackageDefinition[$current] )
            {
            // InternalAlf.g:151:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_PackageDefinition_1= rulePackageDefinition[$current] )
            // InternalAlf.g:152:3: this_UnitPrefix_0= ruleUnitPrefix[$current] this_PackageDefinition_1= rulePackageDefinition[$current]
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
    // InternalAlf.g:178:1: entryRuleClassUnitDefinition returns [EObject current=null] : iv_ruleClassUnitDefinition= ruleClassUnitDefinition EOF ;
    public final EObject entryRuleClassUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassUnitDefinition = null;


        try {
            // InternalAlf.g:178:60: (iv_ruleClassUnitDefinition= ruleClassUnitDefinition EOF )
            // InternalAlf.g:179:2: iv_ruleClassUnitDefinition= ruleClassUnitDefinition EOF
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
    // InternalAlf.g:185:1: ruleClassUnitDefinition returns [EObject current=null] : (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ClassDefinition_1= ruleClassDefinition[$current] ) ;
    public final EObject ruleClassUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_UnitPrefix_0 = null;

        EObject this_ClassDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:191:2: ( (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ClassDefinition_1= ruleClassDefinition[$current] ) )
            // InternalAlf.g:192:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ClassDefinition_1= ruleClassDefinition[$current] )
            {
            // InternalAlf.g:192:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ClassDefinition_1= ruleClassDefinition[$current] )
            // InternalAlf.g:193:3: this_UnitPrefix_0= ruleUnitPrefix[$current] this_ClassDefinition_1= ruleClassDefinition[$current]
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
    // InternalAlf.g:219:1: entryRuleObjectClassUnitDefinition returns [EObject current=null] : iv_ruleObjectClassUnitDefinition= ruleObjectClassUnitDefinition EOF ;
    public final EObject entryRuleObjectClassUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectClassUnitDefinition = null;


        try {
            // InternalAlf.g:219:66: (iv_ruleObjectClassUnitDefinition= ruleObjectClassUnitDefinition EOF )
            // InternalAlf.g:220:2: iv_ruleObjectClassUnitDefinition= ruleObjectClassUnitDefinition EOF
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
    // InternalAlf.g:226:1: ruleObjectClassUnitDefinition returns [EObject current=null] : (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ObjectClassDefinition_1= ruleObjectClassDefinition[$current] ) ;
    public final EObject ruleObjectClassUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_UnitPrefix_0 = null;

        EObject this_ObjectClassDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:232:2: ( (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ObjectClassDefinition_1= ruleObjectClassDefinition[$current] ) )
            // InternalAlf.g:233:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ObjectClassDefinition_1= ruleObjectClassDefinition[$current] )
            {
            // InternalAlf.g:233:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ObjectClassDefinition_1= ruleObjectClassDefinition[$current] )
            // InternalAlf.g:234:3: this_UnitPrefix_0= ruleUnitPrefix[$current] this_ObjectClassDefinition_1= ruleObjectClassDefinition[$current]
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
    // InternalAlf.g:260:1: entryRuleValueClassUnitDefinition returns [EObject current=null] : iv_ruleValueClassUnitDefinition= ruleValueClassUnitDefinition EOF ;
    public final EObject entryRuleValueClassUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueClassUnitDefinition = null;


        try {
            // InternalAlf.g:260:65: (iv_ruleValueClassUnitDefinition= ruleValueClassUnitDefinition EOF )
            // InternalAlf.g:261:2: iv_ruleValueClassUnitDefinition= ruleValueClassUnitDefinition EOF
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
    // InternalAlf.g:267:1: ruleValueClassUnitDefinition returns [EObject current=null] : (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ValueClassDefinition_1= ruleValueClassDefinition[$current] ) ;
    public final EObject ruleValueClassUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_UnitPrefix_0 = null;

        EObject this_ValueClassDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:273:2: ( (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ValueClassDefinition_1= ruleValueClassDefinition[$current] ) )
            // InternalAlf.g:274:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ValueClassDefinition_1= ruleValueClassDefinition[$current] )
            {
            // InternalAlf.g:274:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ValueClassDefinition_1= ruleValueClassDefinition[$current] )
            // InternalAlf.g:275:3: this_UnitPrefix_0= ruleUnitPrefix[$current] this_ValueClassDefinition_1= ruleValueClassDefinition[$current]
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
    // InternalAlf.g:301:1: entryRuleAssociationUnitDefinition returns [EObject current=null] : iv_ruleAssociationUnitDefinition= ruleAssociationUnitDefinition EOF ;
    public final EObject entryRuleAssociationUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationUnitDefinition = null;


        try {
            // InternalAlf.g:301:66: (iv_ruleAssociationUnitDefinition= ruleAssociationUnitDefinition EOF )
            // InternalAlf.g:302:2: iv_ruleAssociationUnitDefinition= ruleAssociationUnitDefinition EOF
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
    // InternalAlf.g:308:1: ruleAssociationUnitDefinition returns [EObject current=null] : (this_UnitPrefix_0= ruleUnitPrefix[$current] this_AssociationDefinition_1= ruleAssociationDefinition[$current] ) ;
    public final EObject ruleAssociationUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_UnitPrefix_0 = null;

        EObject this_AssociationDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:314:2: ( (this_UnitPrefix_0= ruleUnitPrefix[$current] this_AssociationDefinition_1= ruleAssociationDefinition[$current] ) )
            // InternalAlf.g:315:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_AssociationDefinition_1= ruleAssociationDefinition[$current] )
            {
            // InternalAlf.g:315:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_AssociationDefinition_1= ruleAssociationDefinition[$current] )
            // InternalAlf.g:316:3: this_UnitPrefix_0= ruleUnitPrefix[$current] this_AssociationDefinition_1= ruleAssociationDefinition[$current]
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


    // $ANTLR start "entryRuleFeatureUnitDefinition"
    // InternalAlf.g:342:1: entryRuleFeatureUnitDefinition returns [EObject current=null] : iv_ruleFeatureUnitDefinition= ruleFeatureUnitDefinition EOF ;
    public final EObject entryRuleFeatureUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureUnitDefinition = null;


        try {
            // InternalAlf.g:342:62: (iv_ruleFeatureUnitDefinition= ruleFeatureUnitDefinition EOF )
            // InternalAlf.g:343:2: iv_ruleFeatureUnitDefinition= ruleFeatureUnitDefinition EOF
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
    // InternalAlf.g:349:1: ruleFeatureUnitDefinition returns [EObject current=null] : (this_UnitPrefix_0= ruleUnitPrefix[$current] this_FeatureBodyDefinition_1= ruleFeatureBodyDefinition[$current] ) ;
    public final EObject ruleFeatureUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_UnitPrefix_0 = null;

        EObject this_FeatureBodyDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:355:2: ( (this_UnitPrefix_0= ruleUnitPrefix[$current] this_FeatureBodyDefinition_1= ruleFeatureBodyDefinition[$current] ) )
            // InternalAlf.g:356:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_FeatureBodyDefinition_1= ruleFeatureBodyDefinition[$current] )
            {
            // InternalAlf.g:356:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_FeatureBodyDefinition_1= ruleFeatureBodyDefinition[$current] )
            // InternalAlf.g:357:3: this_UnitPrefix_0= ruleUnitPrefix[$current] this_FeatureBodyDefinition_1= ruleFeatureBodyDefinition[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureUnitDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureUnitDefinitionAccess().getUnitPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
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
    // InternalAlf.g:384:1: ruleUnitPrefix[EObject in_current] returns [EObject current=in_current] : ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedRelationship_2_0= ruleAnnotation ) )* ) ;
    public final EObject ruleUnitPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedImport_0_0 = null;

        EObject lv_ownedMembership_1_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:390:2: ( ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedRelationship_2_0= ruleAnnotation ) )* ) )
            // InternalAlf.g:391:2: ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedRelationship_2_0= ruleAnnotation ) )* )
            {
            // InternalAlf.g:391:2: ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedRelationship_2_0= ruleAnnotation ) )* )
            // InternalAlf.g:392:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedRelationship_2_0= ruleAnnotation ) )*
            {
            // InternalAlf.g:392:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )*
            loop2:
            do {
                int alt2=3;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalAlf.g:393:4: ( (lv_ownedImport_0_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:393:4: ( (lv_ownedImport_0_0= rulePackageImport ) )
            	    // InternalAlf.g:394:5: (lv_ownedImport_0_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:394:5: (lv_ownedImport_0_0= rulePackageImport )
            	    // InternalAlf.g:395:6: lv_ownedImport_0_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getUnitPrefixAccess().getOwnedImportPackageImportParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_ownedImport_0_0=rulePackageImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUnitPrefixRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedImport",
            	    							lv_ownedImport_0_0,
            	    							"org.omg.sysml.Alf.PackageImport");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:413:4: ( (lv_ownedMembership_1_0= ruleElementImport ) )
            	    {
            	    // InternalAlf.g:413:4: ( (lv_ownedMembership_1_0= ruleElementImport ) )
            	    // InternalAlf.g:414:5: (lv_ownedMembership_1_0= ruleElementImport )
            	    {
            	    // InternalAlf.g:414:5: (lv_ownedMembership_1_0= ruleElementImport )
            	    // InternalAlf.g:415:6: lv_ownedMembership_1_0= ruleElementImport
            	    {

            	    						newCompositeNode(grammarAccess.getUnitPrefixAccess().getOwnedMembershipElementImportParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_ownedMembership_1_0=ruleElementImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUnitPrefixRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedMembership",
            	    							lv_ownedMembership_1_0,
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

            // InternalAlf.g:433:3: ( (lv_ownedRelationship_2_0= ruleAnnotation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAlf.g:434:4: (lv_ownedRelationship_2_0= ruleAnnotation )
            	    {
            	    // InternalAlf.g:434:4: (lv_ownedRelationship_2_0= ruleAnnotation )
            	    // InternalAlf.g:435:5: lv_ownedRelationship_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getUnitPrefixAccess().getOwnedRelationshipAnnotationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
    // InternalAlf.g:456:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalAlf.g:456:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalAlf.g:457:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalAlf.g:463:1: ruleAnnotation returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleComment ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:469:2: ( ( (lv_ownedRelatedElement_0_0= ruleComment ) ) )
            // InternalAlf.g:470:2: ( (lv_ownedRelatedElement_0_0= ruleComment ) )
            {
            // InternalAlf.g:470:2: ( (lv_ownedRelatedElement_0_0= ruleComment ) )
            // InternalAlf.g:471:3: (lv_ownedRelatedElement_0_0= ruleComment )
            {
            // InternalAlf.g:471:3: (lv_ownedRelatedElement_0_0= ruleComment )
            // InternalAlf.g:472:4: lv_ownedRelatedElement_0_0= ruleComment
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
    // InternalAlf.g:492:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalAlf.g:492:48: (iv_ruleComment= ruleComment EOF )
            // InternalAlf.g:493:2: iv_ruleComment= ruleComment EOF
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
    // InternalAlf.g:499:1: ruleComment returns [EObject current=null] : ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_body_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:505:2: ( ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) ) )
            // InternalAlf.g:506:2: ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) )
            {
            // InternalAlf.g:506:2: ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) )
            // InternalAlf.g:507:3: (lv_body_0_0= RULE_DOCUMENTATION_COMMENT )
            {
            // InternalAlf.g:507:3: (lv_body_0_0= RULE_DOCUMENTATION_COMMENT )
            // InternalAlf.g:508:4: lv_body_0_0= RULE_DOCUMENTATION_COMMENT
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
    // InternalAlf.g:527:1: entryRulePackageImport returns [EObject current=null] : iv_rulePackageImport= rulePackageImport EOF ;
    public final EObject entryRulePackageImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageImport = null;


        try {
            // InternalAlf.g:527:54: (iv_rulePackageImport= rulePackageImport EOF )
            // InternalAlf.g:528:2: iv_rulePackageImport= rulePackageImport EOF
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
    // InternalAlf.g:534:1: rulePackageImport returns [EObject current=null] : ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? otherlv_2= 'import' ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) ) otherlv_13= ';' ) ;
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
            // InternalAlf.g:540:2: ( ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? otherlv_2= 'import' ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) ) otherlv_13= ';' ) )
            // InternalAlf.g:541:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? otherlv_2= 'import' ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) ) otherlv_13= ';' )
            {
            // InternalAlf.g:541:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? otherlv_2= 'import' ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) ) otherlv_13= ';' )
            // InternalAlf.g:542:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? otherlv_2= 'import' ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) ) otherlv_13= ';'
            {
            // InternalAlf.g:542:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAlf.g:543:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    {
            	    // InternalAlf.g:543:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    // InternalAlf.g:544:5: lv_ownedRelationship_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getPackageImportAccess().getOwnedRelationshipAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_11);
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

            // InternalAlf.g:561:3: ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=72 && LA5_0<=73)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAlf.g:562:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    {
                    // InternalAlf.g:562:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    // InternalAlf.g:563:5: lv_visibility_1_0= rulePackageElementVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getPackageImportAccess().getVisibilityPackageElementVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_12);
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

            otherlv_2=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageImportAccess().getImportKeyword_2());
            		
            // InternalAlf.g:584:3: ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) )
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

                if ( (LA7_2==18) ) {
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
                else if ( (LA7_2==17) ) {
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
                    // InternalAlf.g:585:4: ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' )
                    {
                    // InternalAlf.g:585:4: ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' )
                    // InternalAlf.g:586:5: ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*'
                    {
                    // InternalAlf.g:586:5: ( ( ruleName ) )
                    // InternalAlf.g:587:6: ( ruleName )
                    {
                    // InternalAlf.g:587:6: ( ruleName )
                    // InternalAlf.g:588:7: ruleName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPackageImportRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_3_0_0_0());
                    						
                    pushFollow(FOLLOW_14);
                    ruleName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:602:5: (otherlv_4= '::' | otherlv_5= '.' )
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
                            // InternalAlf.g:603:6: otherlv_4= '::'
                            {
                            otherlv_4=(Token)match(input,17,FOLLOW_15); 

                            						newLeafNode(otherlv_4, grammarAccess.getPackageImportAccess().getColonColonKeyword_3_0_1_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:608:6: otherlv_5= '.'
                            {
                            otherlv_5=(Token)match(input,18,FOLLOW_15); 

                            						newLeafNode(otherlv_5, grammarAccess.getPackageImportAccess().getFullStopKeyword_3_0_1_1());
                            					

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_16); 

                    					newLeafNode(otherlv_6, grammarAccess.getPackageImportAccess().getAsteriskKeyword_3_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:619:4: ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' )
                    {
                    // InternalAlf.g:619:4: ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' )
                    // InternalAlf.g:620:5: ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*'
                    {
                    // InternalAlf.g:620:5: ( ( ruleColonQualifiedName ) )
                    // InternalAlf.g:621:6: ( ruleColonQualifiedName )
                    {
                    // InternalAlf.g:621:6: ( ruleColonQualifiedName )
                    // InternalAlf.g:622:7: ruleColonQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPackageImportRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_3_1_0_0());
                    						
                    pushFollow(FOLLOW_17);
                    ruleColonQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_15); 

                    					newLeafNode(otherlv_8, grammarAccess.getPackageImportAccess().getColonColonKeyword_3_1_1());
                    				
                    otherlv_9=(Token)match(input,19,FOLLOW_16); 

                    					newLeafNode(otherlv_9, grammarAccess.getPackageImportAccess().getAsteriskKeyword_3_1_2());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:646:4: ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' )
                    {
                    // InternalAlf.g:646:4: ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' )
                    // InternalAlf.g:647:5: ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*'
                    {
                    // InternalAlf.g:647:5: ( ( ruleDotQualifiedName ) )
                    // InternalAlf.g:648:6: ( ruleDotQualifiedName )
                    {
                    // InternalAlf.g:648:6: ( ruleDotQualifiedName )
                    // InternalAlf.g:649:7: ruleDotQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPackageImportRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_3_2_0_0());
                    						
                    pushFollow(FOLLOW_18);
                    ruleDotQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_15); 

                    					newLeafNode(otherlv_11, grammarAccess.getPackageImportAccess().getFullStopKeyword_3_2_1());
                    				
                    otherlv_12=(Token)match(input,19,FOLLOW_16); 

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
    // InternalAlf.g:681:1: entryRuleElementImport returns [EObject current=null] : iv_ruleElementImport= ruleElementImport EOF ;
    public final EObject entryRuleElementImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementImport = null;


        try {
            // InternalAlf.g:681:54: (iv_ruleElementImport= ruleElementImport EOF )
            // InternalAlf.g:682:2: iv_ruleElementImport= ruleElementImport EOF
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
    // InternalAlf.g:688:1: ruleElementImport returns [EObject current=null] : (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleElementImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_PackageMemberPrefix_0 = null;

        AntlrDatatypeRuleToken lv_memberName_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:694:2: ( (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' ) )
            // InternalAlf.g:695:2: (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' )
            {
            // InternalAlf.g:695:2: (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' )
            // InternalAlf.g:696:3: this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';'
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getElementImportRule());
            			}
            			newCompositeNode(grammarAccess.getElementImportAccess().getPackageMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_PackageMemberPrefix_0=rulePackageMemberPrefix(current);

            state._fsp--;


            			current = this_PackageMemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getElementImportAccess().getImportKeyword_1());
            		
            // InternalAlf.g:711:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:712:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:712:4: ( ruleQualifiedName )
            // InternalAlf.g:713:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementImportRule());
            					}
            				

            					newCompositeNode(grammarAccess.getElementImportAccess().getMemberElementElementCrossReference_2_0());
            				
            pushFollow(FOLLOW_19);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:727:3: (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAlf.g:728:4: otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getElementImportAccess().getAsKeyword_3_0());
                    			
                    // InternalAlf.g:732:4: ( (lv_memberName_4_0= ruleName ) )
                    // InternalAlf.g:733:5: (lv_memberName_4_0= ruleName )
                    {
                    // InternalAlf.g:733:5: (lv_memberName_4_0= ruleName )
                    // InternalAlf.g:734:6: lv_memberName_4_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getElementImportAccess().getMemberNameNameParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
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
    // InternalAlf.g:760:1: entryRuleNonFeatureDefinition returns [EObject current=null] : iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF ;
    public final EObject entryRuleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureDefinition = null;


        try {
            // InternalAlf.g:760:61: (iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF )
            // InternalAlf.g:761:2: iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF
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
    // InternalAlf.g:767:1: ruleNonFeatureDefinition returns [EObject current=null] : (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_ObjectClassDefinitionOrStub_2= ruleObjectClassDefinitionOrStub | this_ValueClassDefinitionOrStub_3= ruleValueClassDefinitionOrStub | this_AssociationDefinitionOrStub_4= ruleAssociationDefinitionOrStub | this_BehaviorDefinitionOrStub_5= ruleBehaviorDefinitionOrStub | this_FunctionDefinitionOrStub_6= ruleFunctionDefinitionOrStub ) ;
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
            // InternalAlf.g:773:2: ( (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_ObjectClassDefinitionOrStub_2= ruleObjectClassDefinitionOrStub | this_ValueClassDefinitionOrStub_3= ruleValueClassDefinitionOrStub | this_AssociationDefinitionOrStub_4= ruleAssociationDefinitionOrStub | this_BehaviorDefinitionOrStub_5= ruleBehaviorDefinitionOrStub | this_FunctionDefinitionOrStub_6= ruleFunctionDefinitionOrStub ) )
            // InternalAlf.g:774:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_ObjectClassDefinitionOrStub_2= ruleObjectClassDefinitionOrStub | this_ValueClassDefinitionOrStub_3= ruleValueClassDefinitionOrStub | this_AssociationDefinitionOrStub_4= ruleAssociationDefinitionOrStub | this_BehaviorDefinitionOrStub_5= ruleBehaviorDefinitionOrStub | this_FunctionDefinitionOrStub_6= ruleFunctionDefinitionOrStub )
            {
            // InternalAlf.g:774:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_ObjectClassDefinitionOrStub_2= ruleObjectClassDefinitionOrStub | this_ValueClassDefinitionOrStub_3= ruleValueClassDefinitionOrStub | this_AssociationDefinitionOrStub_4= ruleAssociationDefinitionOrStub | this_BehaviorDefinitionOrStub_5= ruleBehaviorDefinitionOrStub | this_FunctionDefinitionOrStub_6= ruleFunctionDefinitionOrStub )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 36:
                {
                switch ( input.LA(2) ) {
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
                case 31:
                    {
                    alt9=7;
                    }
                    break;
                case 26:
                    {
                    alt9=2;
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
                    // InternalAlf.g:775:3: this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub
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
                    // InternalAlf.g:784:3: this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub
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
                    // InternalAlf.g:793:3: this_ObjectClassDefinitionOrStub_2= ruleObjectClassDefinitionOrStub
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
                    // InternalAlf.g:802:3: this_ValueClassDefinitionOrStub_3= ruleValueClassDefinitionOrStub
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
                    // InternalAlf.g:811:3: this_AssociationDefinitionOrStub_4= ruleAssociationDefinitionOrStub
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
                    // InternalAlf.g:820:3: this_BehaviorDefinitionOrStub_5= ruleBehaviorDefinitionOrStub
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
                    // InternalAlf.g:829:3: this_FunctionDefinitionOrStub_6= ruleFunctionDefinitionOrStub
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
    // InternalAlf.g:841:1: entryRulePackageDefinitionOrStub returns [EObject current=null] : iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF ;
    public final EObject entryRulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDefinitionOrStub = null;


        try {
            // InternalAlf.g:841:64: (iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF )
            // InternalAlf.g:842:2: iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF
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
    // InternalAlf.g:848:1: rulePackageDefinitionOrStub returns [EObject current=null] : this_PackageDefinition_0= rulePackageDefinition[$current] ;
    public final EObject rulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:854:2: (this_PackageDefinition_0= rulePackageDefinition[$current] )
            // InternalAlf.g:855:2: this_PackageDefinition_0= rulePackageDefinition[$current]
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
    // InternalAlf.g:870:1: rulePackageDefinition[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' ) ;
    public final EObject rulePackageDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedMembership_3_0 = null;

        EObject lv_ownedImport_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:876:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' ) )
            // InternalAlf.g:877:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' )
            {
            // InternalAlf.g:877:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' )
            // InternalAlf.g:878:3: otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0());
            		
            // InternalAlf.g:882:3: ( (lv_name_1_0= ruleName ) )
            // InternalAlf.g:883:4: (lv_name_1_0= ruleName )
            {
            // InternalAlf.g:883:4: (lv_name_1_0= ruleName )
            // InternalAlf.g:884:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_2=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlf.g:905:3: ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )*
            loop10:
            do {
                int alt10=3;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalAlf.g:906:4: ( (lv_ownedMembership_3_0= rulePackageMember ) )
            	    {
            	    // InternalAlf.g:906:4: ( (lv_ownedMembership_3_0= rulePackageMember ) )
            	    // InternalAlf.g:907:5: (lv_ownedMembership_3_0= rulePackageMember )
            	    {
            	    // InternalAlf.g:907:5: (lv_ownedMembership_3_0= rulePackageMember )
            	    // InternalAlf.g:908:6: lv_ownedMembership_3_0= rulePackageMember
            	    {

            	    						newCompositeNode(grammarAccess.getPackageDefinitionAccess().getOwnedMembershipPackageMemberParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_ownedMembership_3_0=rulePackageMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedMembership",
            	    							lv_ownedMembership_3_0,
            	    							"org.omg.sysml.Alf.PackageMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:926:4: ( (lv_ownedImport_4_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:926:4: ( (lv_ownedImport_4_0= rulePackageImport ) )
            	    // InternalAlf.g:927:5: (lv_ownedImport_4_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:927:5: (lv_ownedImport_4_0= rulePackageImport )
            	    // InternalAlf.g:928:6: lv_ownedImport_4_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getPackageDefinitionAccess().getOwnedImportPackageImportParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_ownedImport_4_0=rulePackageImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedImport",
            	    							lv_ownedImport_4_0,
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
    // InternalAlf.g:954:1: entryRulePackageMember returns [EObject current=null] : iv_rulePackageMember= rulePackageMember EOF ;
    public final EObject entryRulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageMember = null;


        try {
            // InternalAlf.g:954:54: (iv_rulePackageMember= rulePackageMember EOF )
            // InternalAlf.g:955:2: iv_rulePackageMember= rulePackageMember EOF
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
    // InternalAlf.g:961:1: rulePackageMember returns [EObject current=null] : (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] ) ) ;
    public final EObject rulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject this_PackageMemberPrefix_0 = null;

        EObject this_NonFeatureMemberElement_1 = null;

        EObject this_FeaturePackageMemberElement_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:967:2: ( (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] ) ) )
            // InternalAlf.g:968:2: (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] ) )
            {
            // InternalAlf.g:968:2: (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] ) )
            // InternalAlf.g:969:3: this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getPackageMemberRule());
            			}
            			newCompositeNode(grammarAccess.getPackageMemberAccess().getPackageMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_PackageMemberPrefix_0=rulePackageMemberPrefix(current);

            state._fsp--;


            			current = this_PackageMemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:980:3: (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16||LA11_0==22||(LA11_0>=26 && LA11_0<=31)||LA11_0==36) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_UNRESTRICTED_NAME)||LA11_0==32) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAlf.g:981:4: this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current]
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
                    // InternalAlf.g:993:4: this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current]
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
    // InternalAlf.g:1010:1: rulePackageMemberPrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? ) ;
    public final EObject rulePackageMemberPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedRelationship_0_0 = null;

        Enumerator lv_visibility_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1016:2: ( ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? ) )
            // InternalAlf.g:1017:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? )
            {
            // InternalAlf.g:1017:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? )
            // InternalAlf.g:1018:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )?
            {
            // InternalAlf.g:1018:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAlf.g:1019:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    {
            	    // InternalAlf.g:1019:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    // InternalAlf.g:1020:5: lv_ownedRelationship_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getPackageMemberPrefixAccess().getOwnedRelationshipAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_23);
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

            // InternalAlf.g:1037:3: ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=72 && LA13_0<=73)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlf.g:1038:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    {
                    // InternalAlf.g:1038:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    // InternalAlf.g:1039:5: lv_visibility_1_0= rulePackageElementVisibilityIndicator
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
    // InternalAlf.g:1061:1: ruleNonFeatureMemberElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) | (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' ) | (otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';' ) | (otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';' ) | (otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';' ) ) ;
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
        EObject lv_ownedMemberElement_0_0 = null;

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
            // InternalAlf.g:1067:2: ( ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) | (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' ) | (otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';' ) | (otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';' ) | (otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';' ) ) )
            // InternalAlf.g:1068:2: ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) | (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' ) | (otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';' ) | (otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';' ) | (otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';' ) )
            {
            // InternalAlf.g:1068:2: ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) | (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' ) | (otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';' ) | (otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';' ) | (otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';' ) )
            int alt22=9;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalAlf.g:1069:3: ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) )
                    {
                    // InternalAlf.g:1069:3: ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) )
                    // InternalAlf.g:1070:4: (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition )
                    {
                    // InternalAlf.g:1070:4: (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition )
                    // InternalAlf.g:1071:5: lv_ownedMemberElement_0_0= ruleNonFeatureDefinition
                    {

                    					newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getOwnedMemberElementNonFeatureDefinitionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_0_0=ruleNonFeatureDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNonFeatureMemberElementRule());
                    					}
                    					set(
                    						current,
                    						"ownedMemberElement",
                    						lv_ownedMemberElement_0_0,
                    						"org.omg.sysml.Alf.NonFeatureDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1089:3: (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
                    {
                    // InternalAlf.g:1089:3: (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
                    // InternalAlf.g:1090:4: otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getNonFeatureMemberElementAccess().getPackageKeyword_1_0());
                    			
                    // InternalAlf.g:1094:4: ( (lv_memberName_2_0= ruleName ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalAlf.g:1095:5: (lv_memberName_2_0= ruleName )
                            {
                            // InternalAlf.g:1095:5: (lv_memberName_2_0= ruleName )
                            // InternalAlf.g:1096:6: lv_memberName_2_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_25);
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

                    otherlv_3=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getNonFeatureMemberElementAccess().getIsKeyword_1_2());
                    			
                    // InternalAlf.g:1117:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1118:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1118:5: ( ruleQualifiedName )
                    // InternalAlf.g:1119:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementPackageCrossReference_1_3_0());
                    					
                    pushFollow(FOLLOW_16);
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
                    // InternalAlf.g:1139:3: (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    {
                    // InternalAlf.g:1139:3: (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    // InternalAlf.g:1140:4: otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getNonFeatureMemberElementAccess().getClassKeyword_2_0());
                    			
                    // InternalAlf.g:1144:4: ( (lv_memberName_7_0= ruleName ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalAlf.g:1145:5: (lv_memberName_7_0= ruleName )
                            {
                            // InternalAlf.g:1145:5: (lv_memberName_7_0= ruleName )
                            // InternalAlf.g:1146:6: lv_memberName_7_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_2_1_0());
                            					
                            pushFollow(FOLLOW_25);
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

                    otherlv_8=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getNonFeatureMemberElementAccess().getIsKeyword_2_2());
                    			
                    // InternalAlf.g:1167:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1168:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1168:5: ( ruleQualifiedName )
                    // InternalAlf.g:1169:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementClassCrossReference_2_3_0());
                    					
                    pushFollow(FOLLOW_16);
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
                    // InternalAlf.g:1189:3: (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' )
                    {
                    // InternalAlf.g:1189:3: (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' )
                    // InternalAlf.g:1190:4: otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';'
                    {
                    otherlv_11=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getNonFeatureMemberElementAccess().getClassKeyword_3_0());
                    			
                    // InternalAlf.g:1194:4: ( (lv_memberName_12_0= ruleName ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalAlf.g:1195:5: (lv_memberName_12_0= ruleName )
                            {
                            // InternalAlf.g:1195:5: (lv_memberName_12_0= ruleName )
                            // InternalAlf.g:1196:6: lv_memberName_12_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_3_1_0());
                            					
                            pushFollow(FOLLOW_25);
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

                    otherlv_13=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getNonFeatureMemberElementAccess().getIsKeyword_3_2());
                    			
                    // InternalAlf.g:1217:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1218:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1218:5: ( ruleQualifiedName )
                    // InternalAlf.g:1219:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementObjectClassCrossReference_3_3_0());
                    					
                    pushFollow(FOLLOW_16);
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
                    // InternalAlf.g:1239:3: (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' )
                    {
                    // InternalAlf.g:1239:3: (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' )
                    // InternalAlf.g:1240:4: otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';'
                    {
                    otherlv_16=(Token)match(input,28,FOLLOW_24); 

                    				newLeafNode(otherlv_16, grammarAccess.getNonFeatureMemberElementAccess().getDatatypeKeyword_4_0());
                    			
                    // InternalAlf.g:1244:4: ( (lv_memberName_17_0= ruleName ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalAlf.g:1245:5: (lv_memberName_17_0= ruleName )
                            {
                            // InternalAlf.g:1245:5: (lv_memberName_17_0= ruleName )
                            // InternalAlf.g:1246:6: lv_memberName_17_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_4_1_0());
                            					
                            pushFollow(FOLLOW_25);
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

                    otherlv_18=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getNonFeatureMemberElementAccess().getIsKeyword_4_2());
                    			
                    // InternalAlf.g:1267:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1268:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1268:5: ( ruleQualifiedName )
                    // InternalAlf.g:1269:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementValueClassCrossReference_4_3_0());
                    					
                    pushFollow(FOLLOW_16);
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
                    // InternalAlf.g:1289:3: (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' )
                    {
                    // InternalAlf.g:1289:3: (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' )
                    // InternalAlf.g:1290:4: otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';'
                    {
                    otherlv_21=(Token)match(input,29,FOLLOW_24); 

                    				newLeafNode(otherlv_21, grammarAccess.getNonFeatureMemberElementAccess().getAssocKeyword_5_0());
                    			
                    // InternalAlf.g:1294:4: ( (lv_memberName_22_0= ruleName ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalAlf.g:1295:5: (lv_memberName_22_0= ruleName )
                            {
                            // InternalAlf.g:1295:5: (lv_memberName_22_0= ruleName )
                            // InternalAlf.g:1296:6: lv_memberName_22_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_5_1_0());
                            					
                            pushFollow(FOLLOW_25);
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

                    otherlv_23=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_23, grammarAccess.getNonFeatureMemberElementAccess().getIsKeyword_5_2());
                    			
                    // InternalAlf.g:1317:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1318:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1318:5: ( ruleQualifiedName )
                    // InternalAlf.g:1319:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementAssociationCrossReference_5_3_0());
                    					
                    pushFollow(FOLLOW_16);
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
                    // InternalAlf.g:1339:3: (otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';' )
                    {
                    // InternalAlf.g:1339:3: (otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';' )
                    // InternalAlf.g:1340:4: otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';'
                    {
                    otherlv_26=(Token)match(input,30,FOLLOW_24); 

                    				newLeafNode(otherlv_26, grammarAccess.getNonFeatureMemberElementAccess().getBehaviorKeyword_6_0());
                    			
                    // InternalAlf.g:1344:4: ( (lv_memberName_27_0= ruleName ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalAlf.g:1345:5: (lv_memberName_27_0= ruleName )
                            {
                            // InternalAlf.g:1345:5: (lv_memberName_27_0= ruleName )
                            // InternalAlf.g:1346:6: lv_memberName_27_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_6_1_0());
                            					
                            pushFollow(FOLLOW_25);
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

                    otherlv_28=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_28, grammarAccess.getNonFeatureMemberElementAccess().getIsKeyword_6_2());
                    			
                    // InternalAlf.g:1367:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1368:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1368:5: ( ruleQualifiedName )
                    // InternalAlf.g:1369:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementBehaviorCrossReference_6_3_0());
                    					
                    pushFollow(FOLLOW_16);
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
                    // InternalAlf.g:1389:3: (otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';' )
                    {
                    // InternalAlf.g:1389:3: (otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';' )
                    // InternalAlf.g:1390:4: otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';'
                    {
                    otherlv_31=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_31, grammarAccess.getNonFeatureMemberElementAccess().getFunctionKeyword_7_0());
                    			
                    // InternalAlf.g:1394:4: ( (lv_memberName_32_0= ruleName ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalAlf.g:1395:5: (lv_memberName_32_0= ruleName )
                            {
                            // InternalAlf.g:1395:5: (lv_memberName_32_0= ruleName )
                            // InternalAlf.g:1396:6: lv_memberName_32_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_7_1_0());
                            					
                            pushFollow(FOLLOW_25);
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

                    otherlv_33=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_33, grammarAccess.getNonFeatureMemberElementAccess().getIsKeyword_7_2());
                    			
                    // InternalAlf.g:1417:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1418:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1418:5: ( ruleQualifiedName )
                    // InternalAlf.g:1419:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementFunctionCrossReference_7_3_0());
                    					
                    pushFollow(FOLLOW_16);
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
                    // InternalAlf.g:1439:3: (otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';' )
                    {
                    // InternalAlf.g:1439:3: (otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';' )
                    // InternalAlf.g:1440:4: otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';'
                    {
                    otherlv_36=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_36, grammarAccess.getNonFeatureMemberElementAccess().getImportKeyword_8_0());
                    			
                    // InternalAlf.g:1444:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1445:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1445:5: ( ruleQualifiedName )
                    // InternalAlf.g:1446:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementElementCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:1460:4: (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==21) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalAlf.g:1461:5: otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) )
                            {
                            otherlv_38=(Token)match(input,21,FOLLOW_13); 

                            					newLeafNode(otherlv_38, grammarAccess.getNonFeatureMemberElementAccess().getAsKeyword_8_2_0());
                            				
                            // InternalAlf.g:1465:5: ( (lv_memberName_39_0= ruleName ) )
                            // InternalAlf.g:1466:6: (lv_memberName_39_0= ruleName )
                            {
                            // InternalAlf.g:1466:6: (lv_memberName_39_0= ruleName )
                            // InternalAlf.g:1467:7: lv_memberName_39_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_8_2_1_0());
                            						
                            pushFollow(FOLLOW_16);
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
    // InternalAlf.g:1495:1: ruleFeaturePackageMemberElement[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) ) ;
    public final EObject ruleFeaturePackageMemberElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_ownedMemberElement_1_0 = null;

        EObject lv_ownedMemberElement_3_0 = null;

        AntlrDatatypeRuleToken lv_memberName_5_0 = null;

        AntlrDatatypeRuleToken lv_memberName_6_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1501:2: ( ( ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) ) )
            // InternalAlf.g:1502:2: ( ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) )
            {
            // InternalAlf.g:1502:2: ( ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA26_4 = input.LA(3);

                    if ( (LA26_4==25) ) {
                        alt26=3;
                    }
                    else if ( (LA26_4==20||LA26_4==23||(LA26_4>=42 && LA26_4<=44)||(LA26_4>=47 && LA26_4<=49)||LA26_4==52) ) {
                        alt26=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA26_5 = input.LA(3);

                    if ( (LA26_5==20||LA26_5==23||(LA26_5>=42 && LA26_5<=44)||(LA26_5>=47 && LA26_5<=49)||LA26_5==52) ) {
                        alt26=1;
                    }
                    else if ( (LA26_5==25) ) {
                        alt26=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 25:
                    {
                    alt26=3;
                    }
                    break;
                case 42:
                    {
                    alt26=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==25) ) {
                    alt26=3;
                }
                else if ( (LA26_2==20||LA26_2==23||(LA26_2>=42 && LA26_2<=44)||(LA26_2>=47 && LA26_2<=49)||LA26_2==52) ) {
                    alt26=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA26_3 = input.LA(2);

                if ( (LA26_3==20||LA26_3==23||(LA26_3>=42 && LA26_3<=44)||(LA26_3>=47 && LA26_3<=49)||LA26_3==52) ) {
                    alt26=1;
                }
                else if ( (LA26_3==25) ) {
                    alt26=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalAlf.g:1503:3: ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1503:3: ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1504:4: (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1504:4: (otherlv_0= 'feature' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==32) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalAlf.g:1505:5: otherlv_0= 'feature'
                            {
                            otherlv_0=(Token)match(input,32,FOLLOW_26); 

                            					newLeafNode(otherlv_0, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_0_0());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1510:4: ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1511:5: (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1511:5: (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1512:6: lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition
                    {

                    						newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getOwnedMemberElementNamedFeatureDefinitionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_1_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeaturePackageMemberElementRule());
                    						}
                    						set(
                    							current,
                    							"ownedMemberElement",
                    							lv_ownedMemberElement_1_0,
                    							"org.omg.sysml.Alf.NamedFeatureDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1531:3: (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1531:3: (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:1532:4: otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_1_0());
                    			
                    // InternalAlf.g:1536:4: ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:1537:5: (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:1537:5: (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:1538:6: lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition
                    {

                    						newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getOwnedMemberElementUnnamedFeatureDefinitionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_3_0=ruleUnnamedFeatureDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeaturePackageMemberElementRule());
                    						}
                    						set(
                    							current,
                    							"ownedMemberElement",
                    							lv_ownedMemberElement_3_0,
                    							"org.omg.sysml.Alf.UnnamedFeatureDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1557:3: ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' )
                    {
                    // InternalAlf.g:1557:3: ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' )
                    // InternalAlf.g:1558:4: ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';'
                    {
                    // InternalAlf.g:1558:4: ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==32) ) {
                        alt25=1;
                    }
                    else if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalAlf.g:1559:5: (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? )
                            {
                            // InternalAlf.g:1559:5: (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? )
                            // InternalAlf.g:1560:6: otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )?
                            {
                            otherlv_4=(Token)match(input,32,FOLLOW_24); 

                            						newLeafNode(otherlv_4, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_2_0_0_0());
                            					
                            // InternalAlf.g:1564:6: ( (lv_memberName_5_0= ruleName ) )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // InternalAlf.g:1565:7: (lv_memberName_5_0= ruleName )
                                    {
                                    // InternalAlf.g:1565:7: (lv_memberName_5_0= ruleName )
                                    // InternalAlf.g:1566:8: lv_memberName_5_0= ruleName
                                    {

                                    								newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getMemberNameNameParserRuleCall_2_0_0_1_0());
                                    							
                                    pushFollow(FOLLOW_25);
                                    lv_memberName_5_0=ruleName();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getFeaturePackageMemberElementRule());
                                    								}
                                    								set(
                                    									current,
                                    									"memberName",
                                    									lv_memberName_5_0,
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
                            // InternalAlf.g:1585:5: ( (lv_memberName_6_0= ruleName ) )
                            {
                            // InternalAlf.g:1585:5: ( (lv_memberName_6_0= ruleName ) )
                            // InternalAlf.g:1586:6: (lv_memberName_6_0= ruleName )
                            {
                            // InternalAlf.g:1586:6: (lv_memberName_6_0= ruleName )
                            // InternalAlf.g:1587:7: lv_memberName_6_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getMemberNameNameParserRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_25);
                            lv_memberName_6_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFeaturePackageMemberElementRule());
                            							}
                            							set(
                            								current,
                            								"memberName",
                            								lv_memberName_6_0,
                            								"org.omg.sysml.Alf.Name");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getFeaturePackageMemberElementAccess().getIsKeyword_2_1());
                    			
                    // InternalAlf.g:1609:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1610:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1610:5: ( ruleQualifiedName )
                    // InternalAlf.g:1611:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeaturePackageMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getMemberElementFeatureCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getFeaturePackageMemberElementAccess().getSemicolonKeyword_2_3());
                    			

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
    // InternalAlf.g:1635:1: ruleCategoryBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) ;
    public final EObject ruleCategoryBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_ownedMembership_2_0 = null;

        EObject lv_ownedImport_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1641:2: ( (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) )
            // InternalAlf.g:1642:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            {
            // InternalAlf.g:1642:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==20) ) {
                alt28=1;
            }
            else if ( (LA28_0==23) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalAlf.g:1643:3: otherlv_0= ';'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getCategoryBodyAccess().getSemicolonKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:1648:3: (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    {
                    // InternalAlf.g:1648:3: (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    // InternalAlf.g:1649:4: otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getCategoryBodyAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalAlf.g:1653:4: ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )*
                    loop27:
                    do {
                        int alt27=3;
                        alt27 = dfa27.predict(input);
                        switch (alt27) {
                    	case 1 :
                    	    // InternalAlf.g:1654:5: ( (lv_ownedMembership_2_0= ruleCategoryMember ) )
                    	    {
                    	    // InternalAlf.g:1654:5: ( (lv_ownedMembership_2_0= ruleCategoryMember ) )
                    	    // InternalAlf.g:1655:6: (lv_ownedMembership_2_0= ruleCategoryMember )
                    	    {
                    	    // InternalAlf.g:1655:6: (lv_ownedMembership_2_0= ruleCategoryMember )
                    	    // InternalAlf.g:1656:7: lv_ownedMembership_2_0= ruleCategoryMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getCategoryBodyAccess().getOwnedMembershipCategoryMemberParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_ownedMembership_2_0=ruleCategoryMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCategoryBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedMembership",
                    	    								lv_ownedMembership_2_0,
                    	    								"org.omg.sysml.Alf.CategoryMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAlf.g:1674:5: ( (lv_ownedImport_3_0= rulePackageImport ) )
                    	    {
                    	    // InternalAlf.g:1674:5: ( (lv_ownedImport_3_0= rulePackageImport ) )
                    	    // InternalAlf.g:1675:6: (lv_ownedImport_3_0= rulePackageImport )
                    	    {
                    	    // InternalAlf.g:1675:6: (lv_ownedImport_3_0= rulePackageImport )
                    	    // InternalAlf.g:1676:7: lv_ownedImport_3_0= rulePackageImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getCategoryBodyAccess().getOwnedImportPackageImportParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    lv_ownedImport_3_0=rulePackageImport();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCategoryBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedImport",
                    	    								lv_ownedImport_3_0,
                    	    								"org.omg.sysml.Alf.PackageImport");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
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


    // $ANTLR start "entryRuleCategoryMember"
    // InternalAlf.g:1703:1: entryRuleCategoryMember returns [EObject current=null] : iv_ruleCategoryMember= ruleCategoryMember EOF ;
    public final EObject entryRuleCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategoryMember = null;


        try {
            // InternalAlf.g:1703:55: (iv_ruleCategoryMember= ruleCategoryMember EOF )
            // InternalAlf.g:1704:2: iv_ruleCategoryMember= ruleCategoryMember EOF
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
    // InternalAlf.g:1710:1: ruleCategoryMember returns [EObject current=null] : (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember ) ;
    public final EObject ruleCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureCategoryMember_0 = null;

        EObject this_FeatureCategoryMember_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1716:2: ( (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember ) )
            // InternalAlf.g:1717:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember )
            {
            // InternalAlf.g:1717:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember )
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalAlf.g:1718:3: this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember
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
                    // InternalAlf.g:1727:3: this_FeatureCategoryMember_1= ruleFeatureCategoryMember
                    {

                    			newCompositeNode(grammarAccess.getCategoryMemberAccess().getFeatureCategoryMemberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureCategoryMember_1=ruleFeatureCategoryMember();

                    state._fsp--;


                    			current = this_FeatureCategoryMember_1;
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
    // InternalAlf.g:1739:1: entryRuleNonFeatureCategoryMember returns [EObject current=null] : iv_ruleNonFeatureCategoryMember= ruleNonFeatureCategoryMember EOF ;
    public final EObject entryRuleNonFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureCategoryMember = null;


        try {
            // InternalAlf.g:1739:65: (iv_ruleNonFeatureCategoryMember= ruleNonFeatureCategoryMember EOF )
            // InternalAlf.g:1740:2: iv_ruleNonFeatureCategoryMember= ruleNonFeatureCategoryMember EOF
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
    // InternalAlf.g:1746:1: ruleNonFeatureCategoryMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] ) ;
    public final EObject ruleNonFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject this_CategoryMemberPrefix_0 = null;

        EObject this_NonFeatureMemberElement_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1752:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] ) )
            // InternalAlf.g:1753:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] )
            {
            // InternalAlf.g:1753:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] )
            // InternalAlf.g:1754:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getNonFeatureCategoryMemberRule());
            			}
            			newCompositeNode(grammarAccess.getNonFeatureCategoryMemberAccess().getCategoryMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
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
    // InternalAlf.g:1780:1: entryRuleFeatureCategoryMember returns [EObject current=null] : iv_ruleFeatureCategoryMember= ruleFeatureCategoryMember EOF ;
    public final EObject entryRuleFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCategoryMember = null;


        try {
            // InternalAlf.g:1780:62: (iv_ruleFeatureCategoryMember= ruleFeatureCategoryMember EOF )
            // InternalAlf.g:1781:2: iv_ruleFeatureCategoryMember= ruleFeatureCategoryMember EOF
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
    // InternalAlf.g:1787:1: ruleFeatureCategoryMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) ) ;
    public final EObject ruleFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_CategoryMemberPrefix_0 = null;

        EObject this_FeatureMemberElement_1 = null;

        Enumerator lv_direction_2_0 = null;

        EObject lv_ownedMemberFeature_3_0 = null;

        Enumerator lv_direction_4_0 = null;

        AntlrDatatypeRuleToken lv_memberName_5_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1793:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) ) )
            // InternalAlf.g:1794:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) )
            {
            // InternalAlf.g:1794:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) )
            // InternalAlf.g:1795:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureCategoryMemberRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getCategoryMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_CategoryMemberPrefix_0=ruleCategoryMemberPrefix(current);

            state._fsp--;


            			current = this_CategoryMemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:1806:3: (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt32=1;
                }
                break;
            case 76:
                {
                int LA32_2 = input.LA(2);

                if ( (LA32_2==RULE_ID) ) {
                    int LA32_5 = input.LA(3);

                    if ( (LA32_5==20||LA32_5==23||(LA32_5>=42 && LA32_5<=44)||(LA32_5>=47 && LA32_5<=49)||LA32_5==52) ) {
                        alt32=2;
                    }
                    else if ( (LA32_5==25) ) {
                        alt32=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA32_2==RULE_UNRESTRICTED_NAME) ) {
                    int LA32_6 = input.LA(3);

                    if ( (LA32_6==20||LA32_6==23||(LA32_6>=42 && LA32_6<=44)||(LA32_6>=47 && LA32_6<=49)||LA32_6==52) ) {
                        alt32=2;
                    }
                    else if ( (LA32_6==25) ) {
                        alt32=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 2, input);

                    throw nvae;
                }
                }
                break;
            case 77:
                {
                int LA32_3 = input.LA(2);

                if ( (LA32_3==RULE_ID) ) {
                    int LA32_5 = input.LA(3);

                    if ( (LA32_5==20||LA32_5==23||(LA32_5>=42 && LA32_5<=44)||(LA32_5>=47 && LA32_5<=49)||LA32_5==52) ) {
                        alt32=2;
                    }
                    else if ( (LA32_5==25) ) {
                        alt32=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA32_3==RULE_UNRESTRICTED_NAME) ) {
                    int LA32_6 = input.LA(3);

                    if ( (LA32_6==20||LA32_6==23||(LA32_6>=42 && LA32_6<=44)||(LA32_6>=47 && LA32_6<=49)||LA32_6==52) ) {
                        alt32=2;
                    }
                    else if ( (LA32_6==25) ) {
                        alt32=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 3, input);

                    throw nvae;
                }
                }
                break;
            case 78:
                {
                int LA32_4 = input.LA(2);

                if ( (LA32_4==RULE_ID) ) {
                    int LA32_5 = input.LA(3);

                    if ( (LA32_5==20||LA32_5==23||(LA32_5>=42 && LA32_5<=44)||(LA32_5>=47 && LA32_5<=49)||LA32_5==52) ) {
                        alt32=2;
                    }
                    else if ( (LA32_5==25) ) {
                        alt32=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA32_4==RULE_UNRESTRICTED_NAME) ) {
                    int LA32_6 = input.LA(3);

                    if ( (LA32_6==20||LA32_6==23||(LA32_6>=42 && LA32_6<=44)||(LA32_6>=47 && LA32_6<=49)||LA32_6==52) ) {
                        alt32=2;
                    }
                    else if ( (LA32_6==25) ) {
                        alt32=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA32_5 = input.LA(2);

                if ( (LA32_5==20||LA32_5==23||(LA32_5>=42 && LA32_5<=44)||(LA32_5>=47 && LA32_5<=49)||LA32_5==52) ) {
                    alt32=2;
                }
                else if ( (LA32_5==25) ) {
                    alt32=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA32_6 = input.LA(2);

                if ( (LA32_6==20||LA32_6==23||(LA32_6>=42 && LA32_6<=44)||(LA32_6>=47 && LA32_6<=49)||LA32_6==52) ) {
                    alt32=2;
                }
                else if ( (LA32_6==25) ) {
                    alt32=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalAlf.g:1807:4: this_FeatureMemberElement_1= ruleFeatureMemberElement[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getFeatureCategoryMemberRule());
                    				}
                    				newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getFeatureMemberElementParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_FeatureMemberElement_1=ruleFeatureMemberElement(current);

                    state._fsp--;


                    				current = this_FeatureMemberElement_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalAlf.g:1819:4: ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1819:4: ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1820:5: ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1820:5: ( (lv_direction_2_0= ruleFeatureDirection ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=76 && LA30_0<=78)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalAlf.g:1821:6: (lv_direction_2_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1821:6: (lv_direction_2_0= ruleFeatureDirection )
                            // InternalAlf.g:1822:7: lv_direction_2_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_26);
                            lv_direction_2_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFeatureCategoryMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_2_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1839:5: ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1840:6: (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1840:6: (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1841:7: lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getOwnedMemberFeatureNamedFeatureDefinitionParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberFeature_3_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeatureCategoryMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberFeature",
                    								lv_ownedMemberFeature_3_0,
                    								"org.omg.sysml.Alf.NamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1860:4: ( ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' )
                    {
                    // InternalAlf.g:1860:4: ( ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' )
                    // InternalAlf.g:1861:5: ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';'
                    {
                    // InternalAlf.g:1861:5: ( (lv_direction_4_0= ruleFeatureDirection ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( ((LA31_0>=76 && LA31_0<=78)) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalAlf.g:1862:6: (lv_direction_4_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1862:6: (lv_direction_4_0= ruleFeatureDirection )
                            // InternalAlf.g:1863:7: lv_direction_4_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_13);
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

                    // InternalAlf.g:1880:5: ( (lv_memberName_5_0= ruleName ) )
                    // InternalAlf.g:1881:6: (lv_memberName_5_0= ruleName )
                    {
                    // InternalAlf.g:1881:6: (lv_memberName_5_0= ruleName )
                    // InternalAlf.g:1882:7: lv_memberName_5_0= ruleName
                    {

                    							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getMemberNameNameParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_25);
                    lv_memberName_5_0=ruleName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeatureCategoryMemberRule());
                    							}
                    							set(
                    								current,
                    								"memberName",
                    								lv_memberName_5_0,
                    								"org.omg.sysml.Alf.Name");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,25,FOLLOW_13); 

                    					newLeafNode(otherlv_6, grammarAccess.getFeatureCategoryMemberAccess().getIsKeyword_1_2_2());
                    				
                    // InternalAlf.g:1903:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1904:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1904:6: ( ruleQualifiedName )
                    // InternalAlf.g:1905:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFeatureCategoryMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getMemberFeatureFeatureCrossReference_1_2_3_0());
                    						
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_8=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getFeatureCategoryMemberAccess().getSemicolonKeyword_1_2_4());
                    				

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


    // $ANTLR start "ruleCategoryMemberPrefix"
    // InternalAlf.g:1930:1: ruleCategoryMemberPrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ) ;
    public final EObject ruleCategoryMemberPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedRelationship_0_0 = null;

        Enumerator lv_visibility_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1936:2: ( ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ) )
            // InternalAlf.g:1937:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? )
            {
            // InternalAlf.g:1937:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? )
            // InternalAlf.g:1938:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            {
            // InternalAlf.g:1938:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAlf.g:1939:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    {
            	    // InternalAlf.g:1939:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    // InternalAlf.g:1940:5: lv_ownedRelationship_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getCategoryMemberPrefixAccess().getOwnedRelationshipAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_31);
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
            	    break loop33;
                }
            } while (true);

            // InternalAlf.g:1957:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=72 && LA34_0<=75)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAlf.g:1958:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:1958:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:1959:5: lv_visibility_1_0= ruleVisibilityIndicator
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


    // $ANTLR start "ruleFeatureMemberElement"
    // InternalAlf.g:1981:1: ruleFeatureMemberElement[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) ) | (otherlv_9= 'connector' ( ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) ) ) ;
    public final EObject ruleFeatureMemberElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_isPart_1_0=null;
        Token lv_isPort_2_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Enumerator lv_direction_3_0 = null;

        EObject lv_ownedMemberFeature_4_0 = null;

        AntlrDatatypeRuleToken lv_memberName_5_0 = null;

        EObject lv_ownedMemberFeature_10_0 = null;

        AntlrDatatypeRuleToken lv_memberName_11_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1987:2: ( ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) ) | (otherlv_9= 'connector' ( ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) ) ) )
            // InternalAlf.g:1988:2: ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) ) | (otherlv_9= 'connector' ( ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) ) )
            {
            // InternalAlf.g:1988:2: ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) ) | (otherlv_9= 'connector' ( ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=32 && LA41_0<=34)) ) {
                alt41=1;
            }
            else if ( (LA41_0==35) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalAlf.g:1989:3: ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) )
                    {
                    // InternalAlf.g:1989:3: ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) )
                    // InternalAlf.g:1990:4: (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) )
                    {
                    // InternalAlf.g:1990:4: (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) )
                    int alt35=3;
                    switch ( input.LA(1) ) {
                    case 32:
                        {
                        alt35=1;
                        }
                        break;
                    case 33:
                        {
                        alt35=2;
                        }
                        break;
                    case 34:
                        {
                        alt35=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }

                    switch (alt35) {
                        case 1 :
                            // InternalAlf.g:1991:5: otherlv_0= 'feature'
                            {
                            otherlv_0=(Token)match(input,32,FOLLOW_32); 

                            					newLeafNode(otherlv_0, grammarAccess.getFeatureMemberElementAccess().getFeatureKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1996:5: ( (lv_isPart_1_0= 'part' ) )
                            {
                            // InternalAlf.g:1996:5: ( (lv_isPart_1_0= 'part' ) )
                            // InternalAlf.g:1997:6: (lv_isPart_1_0= 'part' )
                            {
                            // InternalAlf.g:1997:6: (lv_isPart_1_0= 'part' )
                            // InternalAlf.g:1998:7: lv_isPart_1_0= 'part'
                            {
                            lv_isPart_1_0=(Token)match(input,33,FOLLOW_32); 

                            							newLeafNode(lv_isPart_1_0, grammarAccess.getFeatureMemberElementAccess().getIsPartPartKeyword_0_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFeatureMemberElementRule());
                            							}
                            							setWithLastConsumed(current, "isPart", true, "part");
                            						

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAlf.g:2011:5: ( (lv_isPort_2_0= 'port' ) )
                            {
                            // InternalAlf.g:2011:5: ( (lv_isPort_2_0= 'port' ) )
                            // InternalAlf.g:2012:6: (lv_isPort_2_0= 'port' )
                            {
                            // InternalAlf.g:2012:6: (lv_isPort_2_0= 'port' )
                            // InternalAlf.g:2013:7: lv_isPort_2_0= 'port'
                            {
                            lv_isPort_2_0=(Token)match(input,34,FOLLOW_32); 

                            							newLeafNode(lv_isPort_2_0, grammarAccess.getFeatureMemberElementAccess().getIsPortPortKeyword_0_0_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFeatureMemberElementRule());
                            							}
                            							setWithLastConsumed(current, "isPort", true, "port");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:2026:4: ( (lv_direction_3_0= ruleFeatureDirection ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( ((LA36_0>=76 && LA36_0<=78)) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalAlf.g:2027:5: (lv_direction_3_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2027:5: (lv_direction_3_0= ruleFeatureDirection )
                            // InternalAlf.g:2028:6: lv_direction_3_0= ruleFeatureDirection
                            {

                            						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getDirectionFeatureDirectionEnumRuleCall_0_1_0());
                            					
                            pushFollow(FOLLOW_33);
                            lv_direction_3_0=ruleFeatureDirection();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFeatureMemberElementRule());
                            						}
                            						set(
                            							current,
                            							"direction",
                            							lv_direction_3_0,
                            							"org.omg.sysml.Alf.FeatureDirection");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:2045:4: ( ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) )
                    int alt38=2;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                        {
                        int LA38_1 = input.LA(2);

                        if ( (LA38_1==20||LA38_1==23||(LA38_1>=42 && LA38_1<=44)||(LA38_1>=47 && LA38_1<=49)||LA38_1==52) ) {
                            alt38=1;
                        }
                        else if ( (LA38_1==25) ) {
                            alt38=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 38, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_UNRESTRICTED_NAME:
                        {
                        int LA38_2 = input.LA(2);

                        if ( (LA38_2==20||LA38_2==23||(LA38_2>=42 && LA38_2<=44)||(LA38_2>=47 && LA38_2<=49)||LA38_2==52) ) {
                            alt38=1;
                        }
                        else if ( (LA38_2==25) ) {
                            alt38=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 38, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 42:
                        {
                        alt38=1;
                        }
                        break;
                    case 25:
                        {
                        alt38=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }

                    switch (alt38) {
                        case 1 :
                            // InternalAlf.g:2046:5: ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) )
                            {
                            // InternalAlf.g:2046:5: ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) )
                            // InternalAlf.g:2047:6: (lv_ownedMemberFeature_4_0= ruleFeatureDefinition )
                            {
                            // InternalAlf.g:2047:6: (lv_ownedMemberFeature_4_0= ruleFeatureDefinition )
                            // InternalAlf.g:2048:7: lv_ownedMemberFeature_4_0= ruleFeatureDefinition
                            {

                            							newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getOwnedMemberFeatureFeatureDefinitionParserRuleCall_0_2_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_ownedMemberFeature_4_0=ruleFeatureDefinition();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFeatureMemberElementRule());
                            							}
                            							set(
                            								current,
                            								"ownedMemberFeature",
                            								lv_ownedMemberFeature_4_0,
                            								"org.omg.sysml.Alf.FeatureDefinition");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2066:5: ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' )
                            {
                            // InternalAlf.g:2066:5: ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' )
                            // InternalAlf.g:2067:6: ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';'
                            {
                            // InternalAlf.g:2067:6: ( (lv_memberName_5_0= ruleName ) )?
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt37=1;
                            }
                            switch (alt37) {
                                case 1 :
                                    // InternalAlf.g:2068:7: (lv_memberName_5_0= ruleName )
                                    {
                                    // InternalAlf.g:2068:7: (lv_memberName_5_0= ruleName )
                                    // InternalAlf.g:2069:8: lv_memberName_5_0= ruleName
                                    {

                                    								newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getMemberNameNameParserRuleCall_0_2_1_0_0());
                                    							
                                    pushFollow(FOLLOW_25);
                                    lv_memberName_5_0=ruleName();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getFeatureMemberElementRule());
                                    								}
                                    								set(
                                    									current,
                                    									"memberName",
                                    									lv_memberName_5_0,
                                    									"org.omg.sysml.Alf.Name");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }
                                    break;

                            }

                            otherlv_6=(Token)match(input,25,FOLLOW_13); 

                            						newLeafNode(otherlv_6, grammarAccess.getFeatureMemberElementAccess().getIsKeyword_0_2_1_1());
                            					
                            // InternalAlf.g:2090:6: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:2091:7: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:2091:7: ( ruleQualifiedName )
                            // InternalAlf.g:2092:8: ruleQualifiedName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getFeatureMemberElementRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getMemberFeatureFeatureCrossReference_0_2_1_2_0());
                            							
                            pushFollow(FOLLOW_16);
                            ruleQualifiedName();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_8=(Token)match(input,20,FOLLOW_2); 

                            						newLeafNode(otherlv_8, grammarAccess.getFeatureMemberElementAccess().getSemicolonKeyword_0_2_1_3());
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2114:3: (otherlv_9= 'connector' ( ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) )
                    {
                    // InternalAlf.g:2114:3: (otherlv_9= 'connector' ( ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) )
                    // InternalAlf.g:2115:4: otherlv_9= 'connector' ( ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) )
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_34); 

                    				newLeafNode(otherlv_9, grammarAccess.getFeatureMemberElementAccess().getConnectorKeyword_1_0());
                    			
                    // InternalAlf.g:2119:4: ( ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) )
                    int alt40=2;
                    alt40 = dfa40.predict(input);
                    switch (alt40) {
                        case 1 :
                            // InternalAlf.g:2120:5: ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) )
                            {
                            // InternalAlf.g:2120:5: ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) )
                            // InternalAlf.g:2121:6: (lv_ownedMemberFeature_10_0= ruleConnectorDefinition )
                            {
                            // InternalAlf.g:2121:6: (lv_ownedMemberFeature_10_0= ruleConnectorDefinition )
                            // InternalAlf.g:2122:7: lv_ownedMemberFeature_10_0= ruleConnectorDefinition
                            {

                            							newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getOwnedMemberFeatureConnectorDefinitionParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_ownedMemberFeature_10_0=ruleConnectorDefinition();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFeatureMemberElementRule());
                            							}
                            							set(
                            								current,
                            								"ownedMemberFeature",
                            								lv_ownedMemberFeature_10_0,
                            								"org.omg.sysml.Alf.ConnectorDefinition");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2140:5: ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' )
                            {
                            // InternalAlf.g:2140:5: ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' )
                            // InternalAlf.g:2141:6: ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';'
                            {
                            // InternalAlf.g:2141:6: ( (lv_memberName_11_0= ruleName ) )?
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt39=1;
                            }
                            switch (alt39) {
                                case 1 :
                                    // InternalAlf.g:2142:7: (lv_memberName_11_0= ruleName )
                                    {
                                    // InternalAlf.g:2142:7: (lv_memberName_11_0= ruleName )
                                    // InternalAlf.g:2143:8: lv_memberName_11_0= ruleName
                                    {

                                    								newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getMemberNameNameParserRuleCall_1_1_1_0_0());
                                    							
                                    pushFollow(FOLLOW_25);
                                    lv_memberName_11_0=ruleName();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getFeatureMemberElementRule());
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

                            otherlv_12=(Token)match(input,25,FOLLOW_13); 

                            						newLeafNode(otherlv_12, grammarAccess.getFeatureMemberElementAccess().getIsKeyword_1_1_1_1());
                            					
                            // InternalAlf.g:2164:6: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:2165:7: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:2165:7: ( ruleQualifiedName )
                            // InternalAlf.g:2166:8: ruleQualifiedName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getFeatureMemberElementRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getMemberFeatureConnectorCrossReference_1_1_1_2_0());
                            							
                            pushFollow(FOLLOW_16);
                            ruleQualifiedName();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_14=(Token)match(input,20,FOLLOW_2); 

                            						newLeafNode(otherlv_14, grammarAccess.getFeatureMemberElementAccess().getSemicolonKeyword_1_1_1_3());
                            					

                            }


                            }
                            break;

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
    // $ANTLR end "ruleFeatureMemberElement"


    // $ANTLR start "entryRuleClassDefinitionOrStub"
    // InternalAlf.g:2191:1: entryRuleClassDefinitionOrStub returns [EObject current=null] : iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF ;
    public final EObject entryRuleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:2191:62: (iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:2192:2: iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF
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
    // InternalAlf.g:2198:1: ruleClassDefinitionOrStub returns [EObject current=null] : this_ClassDefinition_0= ruleClassDefinition[$current] ;
    public final EObject ruleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2204:2: (this_ClassDefinition_0= ruleClassDefinition[$current] )
            // InternalAlf.g:2205:2: this_ClassDefinition_0= ruleClassDefinition[$current]
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
    // InternalAlf.g:2220:1: ruleClassDefinition[EObject in_current] returns [EObject current=in_current] : (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) ;
    public final EObject ruleClassDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_ClassDeclaration_0 = null;

        EObject this_CategoryBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2226:2: ( (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) )
            // InternalAlf.g:2227:2: (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:2227:2: (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            // InternalAlf.g:2228:3: this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getClassDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getClassDefinitionAccess().getClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
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
    // InternalAlf.g:2255:1: ruleClassDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'Class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) ;
    public final EObject ruleClassDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        EObject this_ClassDeclarationCompletion_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2261:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'Class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) )
            // InternalAlf.g:2262:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'Class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            {
            // InternalAlf.g:2262:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'Class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            // InternalAlf.g:2263:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'Class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current]
            {
            // InternalAlf.g:2263:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAlf.g:2264:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:2264:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:2265:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,36,FOLLOW_36); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,26,FOLLOW_13); 

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
    // InternalAlf.g:2297:1: ruleClassDeclarationCompletion[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= ruleName ) ) (this_SpecializationList_1= ruleSpecializationList[$current] )? ) ;
    public final EObject ruleClassDeclarationCompletion(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject this_SpecializationList_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2303:2: ( ( ( (lv_name_0_0= ruleName ) ) (this_SpecializationList_1= ruleSpecializationList[$current] )? ) )
            // InternalAlf.g:2304:2: ( ( (lv_name_0_0= ruleName ) ) (this_SpecializationList_1= ruleSpecializationList[$current] )? )
            {
            // InternalAlf.g:2304:2: ( ( (lv_name_0_0= ruleName ) ) (this_SpecializationList_1= ruleSpecializationList[$current] )? )
            // InternalAlf.g:2305:3: ( (lv_name_0_0= ruleName ) ) (this_SpecializationList_1= ruleSpecializationList[$current] )?
            {
            // InternalAlf.g:2305:3: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:2306:4: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:2306:4: (lv_name_0_0= ruleName )
            // InternalAlf.g:2307:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getClassDeclarationCompletionAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_37);
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

            // InternalAlf.g:2324:3: (this_SpecializationList_1= ruleSpecializationList[$current] )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAlf.g:2325:4: this_SpecializationList_1= ruleSpecializationList[$current]
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
    // InternalAlf.g:2342:1: ruleSpecializationList[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'specializes' ( (lv_ownedRelationship_1_0= ruleSuperclassing ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) ) )* ) ;
    public final EObject ruleSpecializationList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject lv_ownedRelationship_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2348:2: ( (otherlv_0= 'specializes' ( (lv_ownedRelationship_1_0= ruleSuperclassing ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) ) )* ) )
            // InternalAlf.g:2349:2: (otherlv_0= 'specializes' ( (lv_ownedRelationship_1_0= ruleSuperclassing ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) ) )* )
            {
            // InternalAlf.g:2349:2: (otherlv_0= 'specializes' ( (lv_ownedRelationship_1_0= ruleSuperclassing ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) ) )* )
            // InternalAlf.g:2350:3: otherlv_0= 'specializes' ( (lv_ownedRelationship_1_0= ruleSuperclassing ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) ) )*
            {
            otherlv_0=(Token)match(input,37,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSpecializationListAccess().getSpecializesKeyword_0());
            		
            // InternalAlf.g:2354:3: ( (lv_ownedRelationship_1_0= ruleSuperclassing ) )
            // InternalAlf.g:2355:4: (lv_ownedRelationship_1_0= ruleSuperclassing )
            {
            // InternalAlf.g:2355:4: (lv_ownedRelationship_1_0= ruleSuperclassing )
            // InternalAlf.g:2356:5: lv_ownedRelationship_1_0= ruleSuperclassing
            {

            					newCompositeNode(grammarAccess.getSpecializationListAccess().getOwnedRelationshipSuperclassingParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
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

            // InternalAlf.g:2373:3: (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==38) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalAlf.g:2374:4: otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) )
            	    {
            	    otherlv_2=(Token)match(input,38,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSpecializationListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAlf.g:2378:4: ( (lv_ownedRelationship_3_0= ruleSuperclassing ) )
            	    // InternalAlf.g:2379:5: (lv_ownedRelationship_3_0= ruleSuperclassing )
            	    {
            	    // InternalAlf.g:2379:5: (lv_ownedRelationship_3_0= ruleSuperclassing )
            	    // InternalAlf.g:2380:6: lv_ownedRelationship_3_0= ruleSuperclassing
            	    {

            	    						newCompositeNode(grammarAccess.getSpecializationListAccess().getOwnedRelationshipSuperclassingParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
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
            	    break loop44;
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
    // InternalAlf.g:2402:1: entryRuleSuperclassing returns [EObject current=null] : iv_ruleSuperclassing= ruleSuperclassing EOF ;
    public final EObject entryRuleSuperclassing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperclassing = null;


        try {
            // InternalAlf.g:2402:54: (iv_ruleSuperclassing= ruleSuperclassing EOF )
            // InternalAlf.g:2403:2: iv_ruleSuperclassing= ruleSuperclassing EOF
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
    // InternalAlf.g:2409:1: ruleSuperclassing returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSuperclassing() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:2415:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2416:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2416:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2417:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:2417:3: ( ruleQualifiedName )
            // InternalAlf.g:2418:4: ruleQualifiedName
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
    // InternalAlf.g:2435:1: entryRuleObjectClassDefinitionOrStub returns [EObject current=null] : iv_ruleObjectClassDefinitionOrStub= ruleObjectClassDefinitionOrStub EOF ;
    public final EObject entryRuleObjectClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:2435:68: (iv_ruleObjectClassDefinitionOrStub= ruleObjectClassDefinitionOrStub EOF )
            // InternalAlf.g:2436:2: iv_ruleObjectClassDefinitionOrStub= ruleObjectClassDefinitionOrStub EOF
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
    // InternalAlf.g:2442:1: ruleObjectClassDefinitionOrStub returns [EObject current=null] : this_ObjectClassDefinition_0= ruleObjectClassDefinition[$current] ;
    public final EObject ruleObjectClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2448:2: (this_ObjectClassDefinition_0= ruleObjectClassDefinition[$current] )
            // InternalAlf.g:2449:2: this_ObjectClassDefinition_0= ruleObjectClassDefinition[$current]
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
    // InternalAlf.g:2464:1: ruleObjectClassDefinition[EObject in_current] returns [EObject current=in_current] : (this_ObjectClassDeclaration_0= ruleObjectClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) ;
    public final EObject ruleObjectClassDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_ObjectClassDeclaration_0 = null;

        EObject this_CategoryBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2470:2: ( (this_ObjectClassDeclaration_0= ruleObjectClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) )
            // InternalAlf.g:2471:2: (this_ObjectClassDeclaration_0= ruleObjectClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:2471:2: (this_ObjectClassDeclaration_0= ruleObjectClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            // InternalAlf.g:2472:3: this_ObjectClassDeclaration_0= ruleObjectClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getObjectClassDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getObjectClassDefinitionAccess().getObjectClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
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
    // InternalAlf.g:2499:1: ruleObjectClassDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) ;
    public final EObject ruleObjectClassDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        EObject this_ClassDeclarationCompletion_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2505:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) )
            // InternalAlf.g:2506:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            {
            // InternalAlf.g:2506:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            // InternalAlf.g:2507:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current]
            {
            // InternalAlf.g:2507:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==36) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAlf.g:2508:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:2508:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:2509:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,36,FOLLOW_39); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getObjectClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getObjectClassDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,27,FOLLOW_13); 

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
    // InternalAlf.g:2540:1: entryRuleValueClassDefinitionOrStub returns [EObject current=null] : iv_ruleValueClassDefinitionOrStub= ruleValueClassDefinitionOrStub EOF ;
    public final EObject entryRuleValueClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:2540:67: (iv_ruleValueClassDefinitionOrStub= ruleValueClassDefinitionOrStub EOF )
            // InternalAlf.g:2541:2: iv_ruleValueClassDefinitionOrStub= ruleValueClassDefinitionOrStub EOF
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
    // InternalAlf.g:2547:1: ruleValueClassDefinitionOrStub returns [EObject current=null] : this_ValueClassDefinition_0= ruleValueClassDefinition[$current] ;
    public final EObject ruleValueClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ValueClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2553:2: (this_ValueClassDefinition_0= ruleValueClassDefinition[$current] )
            // InternalAlf.g:2554:2: this_ValueClassDefinition_0= ruleValueClassDefinition[$current]
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
    // InternalAlf.g:2569:1: ruleValueClassDefinition[EObject in_current] returns [EObject current=in_current] : (this_ValueClassDeclaration_0= ruleValueClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) ;
    public final EObject ruleValueClassDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_ValueClassDeclaration_0 = null;

        EObject this_CategoryBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2575:2: ( (this_ValueClassDeclaration_0= ruleValueClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) )
            // InternalAlf.g:2576:2: (this_ValueClassDeclaration_0= ruleValueClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:2576:2: (this_ValueClassDeclaration_0= ruleValueClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            // InternalAlf.g:2577:3: this_ValueClassDeclaration_0= ruleValueClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getValueClassDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getValueClassDefinitionAccess().getValueClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
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
    // InternalAlf.g:2604:1: ruleValueClassDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'datatype' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) ;
    public final EObject ruleValueClassDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        EObject this_ClassDeclarationCompletion_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2610:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'datatype' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) )
            // InternalAlf.g:2611:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'datatype' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            {
            // InternalAlf.g:2611:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'datatype' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            // InternalAlf.g:2612:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'datatype' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current]
            {
            // InternalAlf.g:2612:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==36) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAlf.g:2613:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:2613:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:2614:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,36,FOLLOW_40); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getValueClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueClassDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,28,FOLLOW_13); 

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
    // InternalAlf.g:2645:1: entryRuleAssociationDefinitionOrStub returns [EObject current=null] : iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF ;
    public final EObject entryRuleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinitionOrStub = null;


        try {
            // InternalAlf.g:2645:68: (iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF )
            // InternalAlf.g:2646:2: iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF
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
    // InternalAlf.g:2652:1: ruleAssociationDefinitionOrStub returns [EObject current=null] : this_AssociationDefinition_0= ruleAssociationDefinition[$current] ;
    public final EObject ruleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_AssociationDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2658:2: (this_AssociationDefinition_0= ruleAssociationDefinition[$current] )
            // InternalAlf.g:2659:2: this_AssociationDefinition_0= ruleAssociationDefinition[$current]
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
    // InternalAlf.g:2674:1: ruleAssociationDefinition[EObject in_current] returns [EObject current=in_current] : (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] ) ;
    public final EObject ruleAssociationDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_AssociationDeclaration_0 = null;

        EObject this_AssociationBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2680:2: ( (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] ) )
            // InternalAlf.g:2681:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] )
            {
            // InternalAlf.g:2681:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] )
            // InternalAlf.g:2682:3: this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getAssociationDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
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
    // InternalAlf.g:2709:1: ruleAssociationDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) ;
    public final EObject ruleAssociationDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        EObject this_ClassDeclarationCompletion_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2715:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) )
            // InternalAlf.g:2716:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            {
            // InternalAlf.g:2716:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            // InternalAlf.g:2717:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current]
            {
            // InternalAlf.g:2717:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==36) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAlf.g:2718:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:2718:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:2719:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,36,FOLLOW_41); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getAssociationDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociationDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,29,FOLLOW_13); 

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
    // InternalAlf.g:2751:1: ruleAssociationBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) ;
    public final EObject ruleAssociationBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_ownedMembership_2_0 = null;

        EObject lv_ownedImport_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2757:2: ( (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) )
            // InternalAlf.g:2758:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            {
            // InternalAlf.g:2758:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==20) ) {
                alt49=1;
            }
            else if ( (LA49_0==23) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalAlf.g:2759:3: otherlv_0= ';'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getAssociationBodyAccess().getSemicolonKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:2764:3: (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    {
                    // InternalAlf.g:2764:3: (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    // InternalAlf.g:2765:4: otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_42); 

                    				newLeafNode(otherlv_1, grammarAccess.getAssociationBodyAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalAlf.g:2769:4: ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )*
                    loop48:
                    do {
                        int alt48=3;
                        alt48 = dfa48.predict(input);
                        switch (alt48) {
                    	case 1 :
                    	    // InternalAlf.g:2770:5: ( (lv_ownedMembership_2_0= ruleAssociationMember ) )
                    	    {
                    	    // InternalAlf.g:2770:5: ( (lv_ownedMembership_2_0= ruleAssociationMember ) )
                    	    // InternalAlf.g:2771:6: (lv_ownedMembership_2_0= ruleAssociationMember )
                    	    {
                    	    // InternalAlf.g:2771:6: (lv_ownedMembership_2_0= ruleAssociationMember )
                    	    // InternalAlf.g:2772:7: lv_ownedMembership_2_0= ruleAssociationMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationBodyAccess().getOwnedMembershipAssociationMemberParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
                    	    lv_ownedMembership_2_0=ruleAssociationMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssociationBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedMembership",
                    	    								lv_ownedMembership_2_0,
                    	    								"org.omg.sysml.Alf.AssociationMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAlf.g:2790:5: ( (lv_ownedImport_3_0= rulePackageImport ) )
                    	    {
                    	    // InternalAlf.g:2790:5: ( (lv_ownedImport_3_0= rulePackageImport ) )
                    	    // InternalAlf.g:2791:6: (lv_ownedImport_3_0= rulePackageImport )
                    	    {
                    	    // InternalAlf.g:2791:6: (lv_ownedImport_3_0= rulePackageImport )
                    	    // InternalAlf.g:2792:7: lv_ownedImport_3_0= rulePackageImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationBodyAccess().getOwnedImportPackageImportParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
                    	    lv_ownedImport_3_0=rulePackageImport();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssociationBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedImport",
                    	    								lv_ownedImport_3_0,
                    	    								"org.omg.sysml.Alf.PackageImport");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
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
    // InternalAlf.g:2819:1: entryRuleAssociationMember returns [EObject current=null] : iv_ruleAssociationMember= ruleAssociationMember EOF ;
    public final EObject entryRuleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationMember = null;


        try {
            // InternalAlf.g:2819:58: (iv_ruleAssociationMember= ruleAssociationMember EOF )
            // InternalAlf.g:2820:2: iv_ruleAssociationMember= ruleAssociationMember EOF
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
    // InternalAlf.g:2826:1: ruleAssociationMember returns [EObject current=null] : (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember ) ;
    public final EObject ruleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureCategoryMember_0 = null;

        EObject this_AssociationFeatureMember_1 = null;

        EObject this_AssociationEndFeatureMember_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2832:2: ( (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember ) )
            // InternalAlf.g:2833:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )
            {
            // InternalAlf.g:2833:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )
            int alt50=3;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // InternalAlf.g:2834:3: this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember
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
                    // InternalAlf.g:2843:3: this_AssociationFeatureMember_1= ruleAssociationFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getAssociationMemberAccess().getAssociationFeatureMemberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssociationFeatureMember_1=ruleAssociationFeatureMember();

                    state._fsp--;


                    			current = this_AssociationFeatureMember_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:2852:3: this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember
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


    // $ANTLR start "entryRuleAssociationFeatureMember"
    // InternalAlf.g:2864:1: entryRuleAssociationFeatureMember returns [EObject current=null] : iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF ;
    public final EObject entryRuleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationFeatureMember = null;


        try {
            // InternalAlf.g:2864:65: (iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF )
            // InternalAlf.g:2865:2: iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF
            {
             newCompositeNode(grammarAccess.getAssociationFeatureMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationFeatureMember=ruleAssociationFeatureMember();

            state._fsp--;

             current =iv_ruleAssociationFeatureMember; 
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
    // $ANTLR end "entryRuleAssociationFeatureMember"


    // $ANTLR start "ruleAssociationFeatureMember"
    // InternalAlf.g:2871:1: ruleAssociationFeatureMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] ) ;
    public final EObject ruleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject this_CategoryMemberPrefix_0 = null;

        EObject this_FeatureMemberElement_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2877:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] ) )
            // InternalAlf.g:2878:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] )
            {
            // InternalAlf.g:2878:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] )
            // InternalAlf.g:2879:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getCategoryMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            this_CategoryMemberPrefix_0=ruleCategoryMemberPrefix(current);

            state._fsp--;


            			current = this_CategoryMemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getFeatureMemberElementParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_FeatureMemberElement_1=ruleFeatureMemberElement(current);

            state._fsp--;


            			current = this_FeatureMemberElement_1;
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
    // $ANTLR end "ruleAssociationFeatureMember"


    // $ANTLR start "entryRuleAssociationEndFeatureMember"
    // InternalAlf.g:2905:1: entryRuleAssociationEndFeatureMember returns [EObject current=null] : iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF ;
    public final EObject entryRuleAssociationEndFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEndFeatureMember = null;


        try {
            // InternalAlf.g:2905:68: (iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF )
            // InternalAlf.g:2906:2: iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF
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
    // InternalAlf.g:2912:1: ruleAssociationEndFeatureMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) ) ;
    public final EObject ruleAssociationEndFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isPart_2_0=null;
        Token lv_isPort_3_0=null;
        Token otherlv_6=null;
        Token lv_isPart_7_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject this_CategoryMemberPrefix_0 = null;

        Enumerator lv_direction_4_0 = null;

        EObject lv_ownedMemberFeature_5_0 = null;

        AntlrDatatypeRuleToken lv_memberName_8_0 = null;

        Enumerator lv_direction_12_0 = null;

        EObject lv_ownedMemberFeature_13_0 = null;

        AntlrDatatypeRuleToken lv_memberName_14_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2918:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) ) )
            // InternalAlf.g:2919:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) )
            {
            // InternalAlf.g:2919:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) )
            // InternalAlf.g:2920:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getCategoryMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_CategoryMemberPrefix_0=ruleCategoryMemberPrefix(current);

            state._fsp--;


            			current = this_CategoryMemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:2931:3: ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )
            int alt55=4;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // InternalAlf.g:2932:4: (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2932:4: (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) )
                    // InternalAlf.g:2933:5: otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) )
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_45); 

                    					newLeafNode(otherlv_1, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_1_0_0());
                    				
                    // InternalAlf.g:2937:5: ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )?
                    int alt51=3;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==33) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==34) ) {
                        alt51=2;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalAlf.g:2938:6: ( (lv_isPart_2_0= 'part' ) )
                            {
                            // InternalAlf.g:2938:6: ( (lv_isPart_2_0= 'part' ) )
                            // InternalAlf.g:2939:7: (lv_isPart_2_0= 'part' )
                            {
                            // InternalAlf.g:2939:7: (lv_isPart_2_0= 'part' )
                            // InternalAlf.g:2940:8: lv_isPart_2_0= 'part'
                            {
                            lv_isPart_2_0=(Token)match(input,33,FOLLOW_46); 

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
                            // InternalAlf.g:2953:6: ( (lv_isPort_3_0= 'port' ) )
                            {
                            // InternalAlf.g:2953:6: ( (lv_isPort_3_0= 'port' ) )
                            // InternalAlf.g:2954:7: (lv_isPort_3_0= 'port' )
                            {
                            // InternalAlf.g:2954:7: (lv_isPort_3_0= 'port' )
                            // InternalAlf.g:2955:8: lv_isPort_3_0= 'port'
                            {
                            lv_isPort_3_0=(Token)match(input,34,FOLLOW_46); 

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

                    // InternalAlf.g:2968:5: ( (lv_direction_4_0= ruleFeatureDirection ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( ((LA52_0>=76 && LA52_0<=78)) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalAlf.g:2969:6: (lv_direction_4_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2969:6: (lv_direction_4_0= ruleFeatureDirection )
                            // InternalAlf.g:2970:7: lv_direction_4_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_0_2_0());
                            						
                            pushFollow(FOLLOW_47);
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

                    // InternalAlf.g:2987:5: ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) )
                    // InternalAlf.g:2988:6: (lv_ownedMemberFeature_5_0= ruleFeatureDefinition )
                    {
                    // InternalAlf.g:2988:6: (lv_ownedMemberFeature_5_0= ruleFeatureDefinition )
                    // InternalAlf.g:2989:7: lv_ownedMemberFeature_5_0= ruleFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getOwnedMemberFeatureFeatureDefinitionParserRuleCall_1_0_3_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberFeature_5_0=ruleFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberFeature",
                    								lv_ownedMemberFeature_5_0,
                    								"org.omg.sysml.Alf.FeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:3008:4: (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' )
                    {
                    // InternalAlf.g:3008:4: (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' )
                    // InternalAlf.g:3009:5: otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';'
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_48); 

                    					newLeafNode(otherlv_6, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_1_1_0());
                    				
                    // InternalAlf.g:3013:5: ( (lv_isPart_7_0= 'part' ) )
                    // InternalAlf.g:3014:6: (lv_isPart_7_0= 'part' )
                    {
                    // InternalAlf.g:3014:6: (lv_isPart_7_0= 'part' )
                    // InternalAlf.g:3015:7: lv_isPart_7_0= 'part'
                    {
                    lv_isPart_7_0=(Token)match(input,33,FOLLOW_24); 

                    							newLeafNode(lv_isPart_7_0, grammarAccess.getAssociationEndFeatureMemberAccess().getIsPartPartKeyword_1_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    							setWithLastConsumed(current, "isPart", true, "part");
                    						

                    }


                    }

                    // InternalAlf.g:3027:5: ( (lv_memberName_8_0= ruleName ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalAlf.g:3028:6: (lv_memberName_8_0= ruleName )
                            {
                            // InternalAlf.g:3028:6: (lv_memberName_8_0= ruleName )
                            // InternalAlf.g:3029:7: lv_memberName_8_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberNameNameParserRuleCall_1_1_2_0());
                            						
                            pushFollow(FOLLOW_25);
                            lv_memberName_8_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
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

                    otherlv_9=(Token)match(input,25,FOLLOW_13); 

                    					newLeafNode(otherlv_9, grammarAccess.getAssociationEndFeatureMemberAccess().getIsKeyword_1_1_3());
                    				
                    // InternalAlf.g:3050:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:3051:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:3051:6: ( ruleQualifiedName )
                    // InternalAlf.g:3052:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberFeatureFeatureCrossReference_1_1_4_0());
                    						
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_11=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(otherlv_11, grammarAccess.getAssociationEndFeatureMemberAccess().getSemicolonKeyword_1_1_5());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:3072:4: ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:3072:4: ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:3073:5: ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:3073:5: ( (lv_direction_12_0= ruleFeatureDirection ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=76 && LA54_0<=78)) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalAlf.g:3074:6: (lv_direction_12_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:3074:6: (lv_direction_12_0= ruleFeatureDirection )
                            // InternalAlf.g:3075:7: lv_direction_12_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_26);
                            lv_direction_12_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_12_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:3092:5: ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:3093:6: (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:3093:6: (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:3094:7: lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getOwnedMemberFeatureNamedFeatureDefinitionParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberFeature_13_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberFeature",
                    								lv_ownedMemberFeature_13_0,
                    								"org.omg.sysml.Alf.NamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:3113:4: ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    {
                    // InternalAlf.g:3113:4: ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    // InternalAlf.g:3114:5: ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';'
                    {
                    // InternalAlf.g:3114:5: ( (lv_memberName_14_0= ruleName ) )
                    // InternalAlf.g:3115:6: (lv_memberName_14_0= ruleName )
                    {
                    // InternalAlf.g:3115:6: (lv_memberName_14_0= ruleName )
                    // InternalAlf.g:3116:7: lv_memberName_14_0= ruleName
                    {

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberNameNameParserRuleCall_1_3_0_0());
                    						
                    pushFollow(FOLLOW_25);
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

                    otherlv_15=(Token)match(input,25,FOLLOW_13); 

                    					newLeafNode(otherlv_15, grammarAccess.getAssociationEndFeatureMemberAccess().getIsKeyword_1_3_1());
                    				
                    // InternalAlf.g:3137:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:3138:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:3138:6: ( ruleQualifiedName )
                    // InternalAlf.g:3139:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberFeatureFeatureCrossReference_1_3_2_0());
                    						
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_17=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(otherlv_17, grammarAccess.getAssociationEndFeatureMemberAccess().getSemicolonKeyword_1_3_3());
                    				

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
    // InternalAlf.g:3163:1: entryRuleBehaviorDefinitionOrStub returns [EObject current=null] : iv_ruleBehaviorDefinitionOrStub= ruleBehaviorDefinitionOrStub EOF ;
    public final EObject entryRuleBehaviorDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorDefinitionOrStub = null;


        try {
            // InternalAlf.g:3163:65: (iv_ruleBehaviorDefinitionOrStub= ruleBehaviorDefinitionOrStub EOF )
            // InternalAlf.g:3164:2: iv_ruleBehaviorDefinitionOrStub= ruleBehaviorDefinitionOrStub EOF
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
    // InternalAlf.g:3170:1: ruleBehaviorDefinitionOrStub returns [EObject current=null] : (this_BehaviorDeclaration_0= ruleBehaviorDeclaration[$current] otherlv_1= ';' ) ;
    public final EObject ruleBehaviorDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_BehaviorDeclaration_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3176:2: ( (this_BehaviorDeclaration_0= ruleBehaviorDeclaration[$current] otherlv_1= ';' ) )
            // InternalAlf.g:3177:2: (this_BehaviorDeclaration_0= ruleBehaviorDeclaration[$current] otherlv_1= ';' )
            {
            // InternalAlf.g:3177:2: (this_BehaviorDeclaration_0= ruleBehaviorDeclaration[$current] otherlv_1= ';' )
            // InternalAlf.g:3178:3: this_BehaviorDeclaration_0= ruleBehaviorDeclaration[$current] otherlv_1= ';'
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getBehaviorDefinitionOrStubRule());
            			}
            			newCompositeNode(grammarAccess.getBehaviorDefinitionOrStubAccess().getBehaviorDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_BehaviorDeclaration_0=ruleBehaviorDeclaration(current);

            state._fsp--;


            			current = this_BehaviorDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviorDefinitionOrStubAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleBehaviorDefinitionOrStub"


    // $ANTLR start "ruleBehaviorDeclaration"
    // InternalAlf.g:3198:1: ruleBehaviorDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'behavior' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] (this_SpecializationList_4= ruleSpecializationList[$current] )? ) ;
    public final EObject ruleBehaviorDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject this_ParameterList_3 = null;

        EObject this_SpecializationList_4 = null;



        	enterRule();

        try {
            // InternalAlf.g:3204:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'behavior' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] (this_SpecializationList_4= ruleSpecializationList[$current] )? ) )
            // InternalAlf.g:3205:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'behavior' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] (this_SpecializationList_4= ruleSpecializationList[$current] )? )
            {
            // InternalAlf.g:3205:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'behavior' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] (this_SpecializationList_4= ruleSpecializationList[$current] )? )
            // InternalAlf.g:3206:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'behavior' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] (this_SpecializationList_4= ruleSpecializationList[$current] )?
            {
            // InternalAlf.g:3206:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==36) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalAlf.g:3207:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:3207:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:3208:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,36,FOLLOW_49); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getBehaviorDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBehaviorDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviorDeclarationAccess().getBehaviorKeyword_1());
            		
            // InternalAlf.g:3224:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:3225:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:3225:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:3226:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getBehaviorDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_50);
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
            		
            pushFollow(FOLLOW_37);
            this_ParameterList_3=ruleParameterList(current);

            state._fsp--;


            			current = this_ParameterList_3;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3254:3: (this_SpecializationList_4= ruleSpecializationList[$current] )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==37) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalAlf.g:3255:4: this_SpecializationList_4= ruleSpecializationList[$current]
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
    // InternalAlf.g:3272:1: ruleParameterList[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '(' ( ( (lv_ownedMembership_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedMembership_3_0= ruleParameterMember ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleParameterList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedMembership_1_0 = null;

        EObject lv_ownedMembership_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3278:2: ( (otherlv_0= '(' ( ( (lv_ownedMembership_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedMembership_3_0= ruleParameterMember ) ) )* )? otherlv_4= ')' ) )
            // InternalAlf.g:3279:2: (otherlv_0= '(' ( ( (lv_ownedMembership_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedMembership_3_0= ruleParameterMember ) ) )* )? otherlv_4= ')' )
            {
            // InternalAlf.g:3279:2: (otherlv_0= '(' ( ( (lv_ownedMembership_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedMembership_3_0= ruleParameterMember ) ) )* )? otherlv_4= ')' )
            // InternalAlf.g:3280:3: otherlv_0= '(' ( ( (lv_ownedMembership_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedMembership_3_0= ruleParameterMember ) ) )* )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_0());
            		
            // InternalAlf.g:3284:3: ( ( (lv_ownedMembership_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedMembership_3_0= ruleParameterMember ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=RULE_ID && LA59_0<=RULE_UNRESTRICTED_NAME)||(LA59_0>=76 && LA59_0<=78)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalAlf.g:3285:4: ( (lv_ownedMembership_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedMembership_3_0= ruleParameterMember ) ) )*
                    {
                    // InternalAlf.g:3285:4: ( (lv_ownedMembership_1_0= ruleParameterMember ) )
                    // InternalAlf.g:3286:5: (lv_ownedMembership_1_0= ruleParameterMember )
                    {
                    // InternalAlf.g:3286:5: (lv_ownedMembership_1_0= ruleParameterMember )
                    // InternalAlf.g:3287:6: lv_ownedMembership_1_0= ruleParameterMember
                    {

                    						newCompositeNode(grammarAccess.getParameterListAccess().getOwnedMembershipParameterMemberParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_ownedMembership_1_0=ruleParameterMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterListRule());
                    						}
                    						add(
                    							current,
                    							"ownedMembership",
                    							lv_ownedMembership_1_0,
                    							"org.omg.sysml.Alf.ParameterMember");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:3304:4: (otherlv_2= ',' ( (lv_ownedMembership_3_0= ruleParameterMember ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==38) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalAlf.g:3305:5: otherlv_2= ',' ( (lv_ownedMembership_3_0= ruleParameterMember ) )
                    	    {
                    	    otherlv_2=(Token)match(input,38,FOLLOW_53); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getParameterListAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalAlf.g:3309:5: ( (lv_ownedMembership_3_0= ruleParameterMember ) )
                    	    // InternalAlf.g:3310:6: (lv_ownedMembership_3_0= ruleParameterMember )
                    	    {
                    	    // InternalAlf.g:3310:6: (lv_ownedMembership_3_0= ruleParameterMember )
                    	    // InternalAlf.g:3311:7: lv_ownedMembership_3_0= ruleParameterMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterListAccess().getOwnedMembershipParameterMemberParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_52);
                    	    lv_ownedMembership_3_0=ruleParameterMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterListRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedMembership",
                    	    								lv_ownedMembership_3_0,
                    	    								"org.omg.sysml.Alf.ParameterMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
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


    // $ANTLR start "entryRuleParameterMember"
    // InternalAlf.g:3338:1: entryRuleParameterMember returns [EObject current=null] : iv_ruleParameterMember= ruleParameterMember EOF ;
    public final EObject entryRuleParameterMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterMember = null;


        try {
            // InternalAlf.g:3338:56: (iv_ruleParameterMember= ruleParameterMember EOF )
            // InternalAlf.g:3339:2: iv_ruleParameterMember= ruleParameterMember EOF
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
    // InternalAlf.g:3345:1: ruleParameterMember returns [EObject current=null] : ( ( (lv_direction_0_0= ruleFeatureDirection ) )? ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedMemberFeature_2_0= ruleParameterDefinition ) ) ) ;
    public final EObject ruleParameterMember() throws RecognitionException {
        EObject current = null;

        Enumerator lv_direction_0_0 = null;

        AntlrDatatypeRuleToken lv_memberName_1_0 = null;

        EObject lv_ownedMemberFeature_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3351:2: ( ( ( (lv_direction_0_0= ruleFeatureDirection ) )? ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedMemberFeature_2_0= ruleParameterDefinition ) ) ) )
            // InternalAlf.g:3352:2: ( ( (lv_direction_0_0= ruleFeatureDirection ) )? ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedMemberFeature_2_0= ruleParameterDefinition ) ) )
            {
            // InternalAlf.g:3352:2: ( ( (lv_direction_0_0= ruleFeatureDirection ) )? ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedMemberFeature_2_0= ruleParameterDefinition ) ) )
            // InternalAlf.g:3353:3: ( (lv_direction_0_0= ruleFeatureDirection ) )? ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedMemberFeature_2_0= ruleParameterDefinition ) )
            {
            // InternalAlf.g:3353:3: ( (lv_direction_0_0= ruleFeatureDirection ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=76 && LA60_0<=78)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalAlf.g:3354:4: (lv_direction_0_0= ruleFeatureDirection )
                    {
                    // InternalAlf.g:3354:4: (lv_direction_0_0= ruleFeatureDirection )
                    // InternalAlf.g:3355:5: lv_direction_0_0= ruleFeatureDirection
                    {

                    					newCompositeNode(grammarAccess.getParameterMemberAccess().getDirectionFeatureDirectionEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_13);
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

            // InternalAlf.g:3372:3: ( (lv_memberName_1_0= ruleName ) )
            // InternalAlf.g:3373:4: (lv_memberName_1_0= ruleName )
            {
            // InternalAlf.g:3373:4: (lv_memberName_1_0= ruleName )
            // InternalAlf.g:3374:5: lv_memberName_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getParameterMemberAccess().getMemberNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_54);
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

            // InternalAlf.g:3391:3: ( (lv_ownedMemberFeature_2_0= ruleParameterDefinition ) )
            // InternalAlf.g:3392:4: (lv_ownedMemberFeature_2_0= ruleParameterDefinition )
            {
            // InternalAlf.g:3392:4: (lv_ownedMemberFeature_2_0= ruleParameterDefinition )
            // InternalAlf.g:3393:5: lv_ownedMemberFeature_2_0= ruleParameterDefinition
            {

            					newCompositeNode(grammarAccess.getParameterMemberAccess().getOwnedMemberFeatureParameterDefinitionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedMemberFeature_2_0=ruleParameterDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterMemberRule());
            					}
            					set(
            						current,
            						"ownedMemberFeature",
            						lv_ownedMemberFeature_2_0,
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


    // $ANTLR start "entryRuleFunctionDefinitionOrStub"
    // InternalAlf.g:3414:1: entryRuleFunctionDefinitionOrStub returns [EObject current=null] : iv_ruleFunctionDefinitionOrStub= ruleFunctionDefinitionOrStub EOF ;
    public final EObject entryRuleFunctionDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinitionOrStub = null;


        try {
            // InternalAlf.g:3414:65: (iv_ruleFunctionDefinitionOrStub= ruleFunctionDefinitionOrStub EOF )
            // InternalAlf.g:3415:2: iv_ruleFunctionDefinitionOrStub= ruleFunctionDefinitionOrStub EOF
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
    // InternalAlf.g:3421:1: ruleFunctionDefinitionOrStub returns [EObject current=null] : (this_FunctionDeclaration_0= ruleFunctionDeclaration[$current] otherlv_1= ';' ) ;
    public final EObject ruleFunctionDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_FunctionDeclaration_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3427:2: ( (this_FunctionDeclaration_0= ruleFunctionDeclaration[$current] otherlv_1= ';' ) )
            // InternalAlf.g:3428:2: (this_FunctionDeclaration_0= ruleFunctionDeclaration[$current] otherlv_1= ';' )
            {
            // InternalAlf.g:3428:2: (this_FunctionDeclaration_0= ruleFunctionDeclaration[$current] otherlv_1= ';' )
            // InternalAlf.g:3429:3: this_FunctionDeclaration_0= ruleFunctionDeclaration[$current] otherlv_1= ';'
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFunctionDefinitionOrStubRule());
            			}
            			newCompositeNode(grammarAccess.getFunctionDefinitionOrStubAccess().getFunctionDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_FunctionDeclaration_0=ruleFunctionDeclaration(current);

            state._fsp--;


            			current = this_FunctionDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionDefinitionOrStubAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleFunctionDefinitionOrStub"


    // $ANTLR start "ruleFunctionDeclaration"
    // InternalAlf.g:3449:1: ruleFunctionDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] (this_SpecializationList_5= ruleSpecializationList[$current] )? ) ;
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
            // InternalAlf.g:3455:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] (this_SpecializationList_5= ruleSpecializationList[$current] )? ) )
            // InternalAlf.g:3456:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] (this_SpecializationList_5= ruleSpecializationList[$current] )? )
            {
            // InternalAlf.g:3456:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] (this_SpecializationList_5= ruleSpecializationList[$current] )? )
            // InternalAlf.g:3457:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] (this_SpecializationList_5= ruleSpecializationList[$current] )?
            {
            // InternalAlf.g:3457:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==36) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalAlf.g:3458:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:3458:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:3459:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,36,FOLLOW_55); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getFunctionDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFunctionDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_1());
            		
            // InternalAlf.g:3475:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:3476:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:3476:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:3477:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_50);
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
            		
            pushFollow(FOLLOW_56);
            this_ParameterList_3=ruleParameterList(current);

            state._fsp--;


            			current = this_ParameterList_3;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFunctionDeclarationRule());
            			}
            			newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getReturnParameterPartParserRuleCall_4());
            		
            pushFollow(FOLLOW_37);
            this_ReturnParameterPart_4=ruleReturnParameterPart(current);

            state._fsp--;


            			current = this_ReturnParameterPart_4;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3516:3: (this_SpecializationList_5= ruleSpecializationList[$current] )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==37) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalAlf.g:3517:4: this_SpecializationList_5= ruleSpecializationList[$current]
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
    // InternalAlf.g:3534:1: ruleReturnParameterPart[EObject in_current] returns [EObject current=in_current] : ( (lv_ownedMembership_0_0= ruleReturnParameterMember ) ) ;
    public final EObject ruleReturnParameterPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedMembership_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3540:2: ( ( (lv_ownedMembership_0_0= ruleReturnParameterMember ) ) )
            // InternalAlf.g:3541:2: ( (lv_ownedMembership_0_0= ruleReturnParameterMember ) )
            {
            // InternalAlf.g:3541:2: ( (lv_ownedMembership_0_0= ruleReturnParameterMember ) )
            // InternalAlf.g:3542:3: (lv_ownedMembership_0_0= ruleReturnParameterMember )
            {
            // InternalAlf.g:3542:3: (lv_ownedMembership_0_0= ruleReturnParameterMember )
            // InternalAlf.g:3543:4: lv_ownedMembership_0_0= ruleReturnParameterMember
            {

            				newCompositeNode(grammarAccess.getReturnParameterPartAccess().getOwnedMembershipReturnParameterMemberParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedMembership_0_0=ruleReturnParameterMember();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getReturnParameterPartRule());
            				}
            				add(
            					current,
            					"ownedMembership",
            					lv_ownedMembership_0_0,
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


    // $ANTLR start "entryRuleReturnParameterMember"
    // InternalAlf.g:3563:1: entryRuleReturnParameterMember returns [EObject current=null] : iv_ruleReturnParameterMember= ruleReturnParameterMember EOF ;
    public final EObject entryRuleReturnParameterMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnParameterMember = null;


        try {
            // InternalAlf.g:3563:62: (iv_ruleReturnParameterMember= ruleReturnParameterMember EOF )
            // InternalAlf.g:3564:2: iv_ruleReturnParameterMember= ruleReturnParameterMember EOF
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
    // InternalAlf.g:3570:1: ruleReturnParameterMember returns [EObject current=null] : ( ( (lv_memberName_0_0= ruleName ) )? ( (lv_ownedMemberFeature_1_0= ruleParameterDefinition ) ) ) ;
    public final EObject ruleReturnParameterMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_memberName_0_0 = null;

        EObject lv_ownedMemberFeature_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3576:2: ( ( ( (lv_memberName_0_0= ruleName ) )? ( (lv_ownedMemberFeature_1_0= ruleParameterDefinition ) ) ) )
            // InternalAlf.g:3577:2: ( ( (lv_memberName_0_0= ruleName ) )? ( (lv_ownedMemberFeature_1_0= ruleParameterDefinition ) ) )
            {
            // InternalAlf.g:3577:2: ( ( (lv_memberName_0_0= ruleName ) )? ( (lv_ownedMemberFeature_1_0= ruleParameterDefinition ) ) )
            // InternalAlf.g:3578:3: ( (lv_memberName_0_0= ruleName ) )? ( (lv_ownedMemberFeature_1_0= ruleParameterDefinition ) )
            {
            // InternalAlf.g:3578:3: ( (lv_memberName_0_0= ruleName ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=RULE_ID && LA63_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAlf.g:3579:4: (lv_memberName_0_0= ruleName )
                    {
                    // InternalAlf.g:3579:4: (lv_memberName_0_0= ruleName )
                    // InternalAlf.g:3580:5: lv_memberName_0_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getReturnParameterMemberAccess().getMemberNameNameParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_54);
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

            // InternalAlf.g:3597:3: ( (lv_ownedMemberFeature_1_0= ruleParameterDefinition ) )
            // InternalAlf.g:3598:4: (lv_ownedMemberFeature_1_0= ruleParameterDefinition )
            {
            // InternalAlf.g:3598:4: (lv_ownedMemberFeature_1_0= ruleParameterDefinition )
            // InternalAlf.g:3599:5: lv_ownedMemberFeature_1_0= ruleParameterDefinition
            {

            					newCompositeNode(grammarAccess.getReturnParameterMemberAccess().getOwnedMemberFeatureParameterDefinitionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedMemberFeature_1_0=ruleParameterDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReturnParameterMemberRule());
            					}
            					set(
            						current,
            						"ownedMemberFeature",
            						lv_ownedMemberFeature_1_0,
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


    // $ANTLR start "entryRuleFeatureDefinition"
    // InternalAlf.g:3620:1: entryRuleFeatureDefinition returns [EObject current=null] : iv_ruleFeatureDefinition= ruleFeatureDefinition EOF ;
    public final EObject entryRuleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDefinition = null;


        try {
            // InternalAlf.g:3620:58: (iv_ruleFeatureDefinition= ruleFeatureDefinition EOF )
            // InternalAlf.g:3621:2: iv_ruleFeatureDefinition= ruleFeatureDefinition EOF
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
    // InternalAlf.g:3627:1: ruleFeatureDefinition returns [EObject current=null] : (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) ;
    public final EObject ruleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_NamedFeatureDefinition_0 = null;

        EObject this_UnnamedFeatureDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:3633:2: ( (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) )
            // InternalAlf.g:3634:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            {
            // InternalAlf.g:3634:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_ID && LA64_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt64=1;
            }
            else if ( (LA64_0==42) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalAlf.g:3635:3: this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:3644:3: this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition
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


    // $ANTLR start "entryRuleNamedFeatureDefinition"
    // InternalAlf.g:3656:1: entryRuleNamedFeatureDefinition returns [EObject current=null] : iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF ;
    public final EObject entryRuleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedFeatureDefinition = null;


        try {
            // InternalAlf.g:3656:63: (iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF )
            // InternalAlf.g:3657:2: iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF
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
    // InternalAlf.g:3663:1: ruleNamedFeatureDefinition returns [EObject current=null] : (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureDeclaration_0 = null;

        EObject this_FeatureCompletion_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:3669:2: ( (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:3670:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:3670:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] )
            // InternalAlf.g:3671:3: this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getNamedFeatureDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getFeatureDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_57);
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


    // $ANTLR start "entryRuleUnnamedFeatureDefinition"
    // InternalAlf.g:3697:1: entryRuleUnnamedFeatureDefinition returns [EObject current=null] : iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF ;
    public final EObject entryRuleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedFeatureDefinition = null;


        try {
            // InternalAlf.g:3697:65: (iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF )
            // InternalAlf.g:3698:2: iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF
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
    // InternalAlf.g:3704:1: ruleUnnamedFeatureDefinition returns [EObject current=null] : (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject this_TypePart_2 = null;

        EObject this_FeatureCompletion_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:3710:2: ( (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:3711:2: (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:3711:2: (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current] )
            // InternalAlf.g:3712:3: otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current]
            {
            otherlv_0=(Token)match(input,42,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getUnnamedFeatureDefinitionAccess().getRedefinesKeyword_0());
            		
            // InternalAlf.g:3716:3: ( (lv_ownedRelationship_1_0= ruleRedefinition ) )
            // InternalAlf.g:3717:4: (lv_ownedRelationship_1_0= ruleRedefinition )
            {
            // InternalAlf.g:3717:4: (lv_ownedRelationship_1_0= ruleRedefinition )
            // InternalAlf.g:3718:5: lv_ownedRelationship_1_0= ruleRedefinition
            {

            					newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedRelationshipRedefinitionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_58);
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
            		
            pushFollow(FOLLOW_57);
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


    // $ANTLR start "ruleFeatureBodyDefinition"
    // InternalAlf.g:3762:1: ruleFeatureBodyDefinition[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_FeatureCompletion_2= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleFeatureBodyDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject this_FeatureDeclaration_1 = null;

        EObject this_FeatureCompletion_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:3768:2: ( (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_FeatureCompletion_2= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:3769:2: (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_FeatureCompletion_2= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:3769:2: (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_FeatureCompletion_2= ruleFeatureCompletion[$current] )
            // InternalAlf.g:3770:3: otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_FeatureCompletion_2= ruleFeatureCompletion[$current]
            {
            otherlv_0=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureBodyDefinitionAccess().getFeatureKeyword_0());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureBodyDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureBodyDefinitionAccess().getFeatureDeclarationParserRuleCall_1());
            		
            pushFollow(FOLLOW_57);
            this_FeatureDeclaration_1=ruleFeatureDeclaration(current);

            state._fsp--;


            			current = this_FeatureDeclaration_1;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureBodyDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureBodyDefinitionAccess().getFeatureCompletionParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_FeatureCompletion_2=ruleFeatureCompletion(current);

            state._fsp--;


            			current = this_FeatureCompletion_2;
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
    // InternalAlf.g:3801:1: ruleFeatureDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= ruleName ) ) this_TypePart_1= ruleTypePart[$current] this_SubsettingPart_2= ruleSubsettingPart[$current] ) ;
    public final EObject ruleFeatureDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject this_TypePart_1 = null;

        EObject this_SubsettingPart_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:3807:2: ( ( ( (lv_name_0_0= ruleName ) ) this_TypePart_1= ruleTypePart[$current] this_SubsettingPart_2= ruleSubsettingPart[$current] ) )
            // InternalAlf.g:3808:2: ( ( (lv_name_0_0= ruleName ) ) this_TypePart_1= ruleTypePart[$current] this_SubsettingPart_2= ruleSubsettingPart[$current] )
            {
            // InternalAlf.g:3808:2: ( ( (lv_name_0_0= ruleName ) ) this_TypePart_1= ruleTypePart[$current] this_SubsettingPart_2= ruleSubsettingPart[$current] )
            // InternalAlf.g:3809:3: ( (lv_name_0_0= ruleName ) ) this_TypePart_1= ruleTypePart[$current] this_SubsettingPart_2= ruleSubsettingPart[$current]
            {
            // InternalAlf.g:3809:3: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:3810:4: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:3810:4: (lv_name_0_0= ruleName )
            // InternalAlf.g:3811:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_54);
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
            		
            pushFollow(FOLLOW_59);
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
    // InternalAlf.g:3855:1: ruleFeatureCompletion[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current] ) ;
    public final EObject ruleFeatureCompletion(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_valuation_1_0 = null;

        EObject this_CategoryBody_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:3861:2: ( ( (otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current] ) )
            // InternalAlf.g:3862:2: ( (otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:3862:2: ( (otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current] )
            // InternalAlf.g:3863:3: (otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current]
            {
            // InternalAlf.g:3863:3: (otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==43) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalAlf.g:3864:4: otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) )
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_60); 

                    				newLeafNode(otherlv_0, grammarAccess.getFeatureCompletionAccess().getEqualsSignKeyword_0_0());
                    			
                    // InternalAlf.g:3868:4: ( (lv_valuation_1_0= ruleFeatureValue ) )
                    // InternalAlf.g:3869:5: (lv_valuation_1_0= ruleFeatureValue )
                    {
                    // InternalAlf.g:3869:5: (lv_valuation_1_0= ruleFeatureValue )
                    // InternalAlf.g:3870:6: lv_valuation_1_0= ruleFeatureValue
                    {

                    						newCompositeNode(grammarAccess.getFeatureCompletionAccess().getValuationFeatureValueParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_valuation_1_0=ruleFeatureValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureCompletionRule());
                    						}
                    						set(
                    							current,
                    							"valuation",
                    							lv_valuation_1_0,
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


    // $ANTLR start "entryRuleFeatureValue"
    // InternalAlf.g:3903:1: entryRuleFeatureValue returns [EObject current=null] : iv_ruleFeatureValue= ruleFeatureValue EOF ;
    public final EObject entryRuleFeatureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureValue = null;


        try {
            // InternalAlf.g:3903:53: (iv_ruleFeatureValue= ruleFeatureValue EOF )
            // InternalAlf.g:3904:2: iv_ruleFeatureValue= ruleFeatureValue EOF
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
    // InternalAlf.g:3910:1: ruleFeatureValue returns [EObject current=null] : ( (lv_value_0_0= ruleExpression ) ) ;
    public final EObject ruleFeatureValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3916:2: ( ( (lv_value_0_0= ruleExpression ) ) )
            // InternalAlf.g:3917:2: ( (lv_value_0_0= ruleExpression ) )
            {
            // InternalAlf.g:3917:2: ( (lv_value_0_0= ruleExpression ) )
            // InternalAlf.g:3918:3: (lv_value_0_0= ruleExpression )
            {
            // InternalAlf.g:3918:3: (lv_value_0_0= ruleExpression )
            // InternalAlf.g:3919:4: lv_value_0_0= ruleExpression
            {

            				newCompositeNode(grammarAccess.getFeatureValueAccess().getValueExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFeatureValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
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
    // InternalAlf.g:3940:1: ruleTypePart[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )? ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleTypePart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_isComposite_1_0=null;
        Token otherlv_3=null;
        Token lv_isOrdered_6_0=null;
        Token lv_isNonunique_7_0=null;
        EObject lv_ownedRelationship_2_0 = null;

        EObject lv_multiplicity_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3946:2: ( ( (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )? ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) ) ) )
            // InternalAlf.g:3947:2: ( (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )? ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) ) )
            {
            // InternalAlf.g:3947:2: ( (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )? ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) ) )
            // InternalAlf.g:3948:3: (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )? ( (lv_multiplicity_4_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) )
            {
            // InternalAlf.g:3948:3: (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==44) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalAlf.g:3949:4: otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' )
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_61); 

                    				newLeafNode(otherlv_0, grammarAccess.getTypePartAccess().getColonKeyword_0_0());
                    			
                    // InternalAlf.g:3953:4: ( (lv_isComposite_1_0= 'compose' ) )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==45) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalAlf.g:3954:5: (lv_isComposite_1_0= 'compose' )
                            {
                            // InternalAlf.g:3954:5: (lv_isComposite_1_0= 'compose' )
                            // InternalAlf.g:3955:6: lv_isComposite_1_0= 'compose'
                            {
                            lv_isComposite_1_0=(Token)match(input,45,FOLLOW_62); 

                            						newLeafNode(lv_isComposite_1_0, grammarAccess.getTypePartAccess().getIsCompositeComposeKeyword_0_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTypePartRule());
                            						}
                            						setWithLastConsumed(current, "isComposite", true, "compose");
                            					

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:3967:4: ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( ((LA67_0>=RULE_ID && LA67_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==46) ) {
                        alt67=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalAlf.g:3968:5: ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) )
                            {
                            // InternalAlf.g:3968:5: ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) )
                            // InternalAlf.g:3969:6: (lv_ownedRelationship_2_0= ruleFeatureTyping )
                            {
                            // InternalAlf.g:3969:6: (lv_ownedRelationship_2_0= ruleFeatureTyping )
                            // InternalAlf.g:3970:7: lv_ownedRelationship_2_0= ruleFeatureTyping
                            {

                            							newCompositeNode(grammarAccess.getTypePartAccess().getOwnedRelationshipFeatureTypingParserRuleCall_0_2_0_0());
                            						
                            pushFollow(FOLLOW_63);
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
                            // InternalAlf.g:3988:5: otherlv_3= 'any'
                            {
                            otherlv_3=(Token)match(input,46,FOLLOW_63); 

                            					newLeafNode(otherlv_3, grammarAccess.getTypePartAccess().getAnyKeyword_0_2_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalAlf.g:3994:3: ( (lv_multiplicity_4_0= ruleMultiplicity ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==49) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalAlf.g:3995:4: (lv_multiplicity_4_0= ruleMultiplicity )
                    {
                    // InternalAlf.g:3995:4: (lv_multiplicity_4_0= ruleMultiplicity )
                    // InternalAlf.g:3996:5: lv_multiplicity_4_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getTypePartAccess().getMultiplicityMultiplicityParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_64);
                    lv_multiplicity_4_0=ruleMultiplicity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypePartRule());
                    					}
                    					set(
                    						current,
                    						"multiplicity",
                    						lv_multiplicity_4_0,
                    						"org.omg.sysml.Alf.Multiplicity");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:4013:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) )
            // InternalAlf.g:4014:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) )
            {
            // InternalAlf.g:4014:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) )
            // InternalAlf.g:4015:5: ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTypePartAccess().getUnorderedGroup_2());
            				
            // InternalAlf.g:4018:5: ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* )
            // InternalAlf.g:4019:6: ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )*
            {
            // InternalAlf.g:4019:6: ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )*
            loop70:
            do {
                int alt70=3;
                int LA70_0 = input.LA(1);

                if ( LA70_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 0) ) {
                    alt70=1;
                }
                else if ( LA70_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 1) ) {
                    alt70=2;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalAlf.g:4020:4: ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) )
            	    {
            	    // InternalAlf.g:4020:4: ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) )
            	    // InternalAlf.g:4021:5: {...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTypePart", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAlf.g:4021:105: ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) )
            	    // InternalAlf.g:4022:6: ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAlf.g:4025:9: ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) )
            	    // InternalAlf.g:4025:10: {...}? => ( (lv_isOrdered_6_0= 'ordered' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTypePart", "true");
            	    }
            	    // InternalAlf.g:4025:19: ( (lv_isOrdered_6_0= 'ordered' ) )
            	    // InternalAlf.g:4025:20: (lv_isOrdered_6_0= 'ordered' )
            	    {
            	    // InternalAlf.g:4025:20: (lv_isOrdered_6_0= 'ordered' )
            	    // InternalAlf.g:4026:10: lv_isOrdered_6_0= 'ordered'
            	    {
            	    lv_isOrdered_6_0=(Token)match(input,47,FOLLOW_64); 

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
            	    // InternalAlf.g:4043:4: ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) )
            	    {
            	    // InternalAlf.g:4043:4: ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) )
            	    // InternalAlf.g:4044:5: {...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTypePart", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAlf.g:4044:105: ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) )
            	    // InternalAlf.g:4045:6: ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAlf.g:4048:9: ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) )
            	    // InternalAlf.g:4048:10: {...}? => ( (lv_isNonunique_7_0= 'nonunique' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTypePart", "true");
            	    }
            	    // InternalAlf.g:4048:19: ( (lv_isNonunique_7_0= 'nonunique' ) )
            	    // InternalAlf.g:4048:20: (lv_isNonunique_7_0= 'nonunique' )
            	    {
            	    // InternalAlf.g:4048:20: (lv_isNonunique_7_0= 'nonunique' )
            	    // InternalAlf.g:4049:10: lv_isNonunique_7_0= 'nonunique'
            	    {
            	    lv_isNonunique_7_0=(Token)match(input,48,FOLLOW_64); 

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
            	    break loop70;
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
    // InternalAlf.g:4077:1: entryRuleFeatureTyping returns [EObject current=null] : iv_ruleFeatureTyping= ruleFeatureTyping EOF ;
    public final EObject entryRuleFeatureTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureTyping = null;


        try {
            // InternalAlf.g:4077:54: (iv_ruleFeatureTyping= ruleFeatureTyping EOF )
            // InternalAlf.g:4078:2: iv_ruleFeatureTyping= ruleFeatureTyping EOF
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
    // InternalAlf.g:4084:1: ruleFeatureTyping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleFeatureTyping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:4090:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:4091:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:4091:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4092:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:4092:3: ( ruleQualifiedName )
            // InternalAlf.g:4093:4: ruleQualifiedName
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
    // InternalAlf.g:4110:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalAlf.g:4110:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalAlf.g:4111:2: iv_ruleMultiplicity= ruleMultiplicity EOF
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
    // InternalAlf.g:4117:1: ruleMultiplicity returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lower_1_0 = null;

        EObject lv_upper_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4123:2: ( (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ) )
            // InternalAlf.g:4124:2: (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' )
            {
            // InternalAlf.g:4124:2: (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' )
            // InternalAlf.g:4125:3: otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_65); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAlf.g:4129:3: ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_NATURAL_VALUE) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==50) ) {
                    alt71=1;
                }
            }
            switch (alt71) {
                case 1 :
                    // InternalAlf.g:4130:4: ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..'
                    {
                    // InternalAlf.g:4130:4: ( (lv_lower_1_0= ruleNaturalLiteralExpression ) )
                    // InternalAlf.g:4131:5: (lv_lower_1_0= ruleNaturalLiteralExpression )
                    {
                    // InternalAlf.g:4131:5: (lv_lower_1_0= ruleNaturalLiteralExpression )
                    // InternalAlf.g:4132:6: lv_lower_1_0= ruleNaturalLiteralExpression
                    {

                    						newCompositeNode(grammarAccess.getMultiplicityAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_lower_1_0=ruleNaturalLiteralExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultiplicityRule());
                    						}
                    						set(
                    							current,
                    							"lower",
                    							lv_lower_1_0,
                    							"org.omg.sysml.Alf.NaturalLiteralExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,50,FOLLOW_65); 

                    				newLeafNode(otherlv_2, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalAlf.g:4154:3: ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:4155:4: (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:4155:4: (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:4156:5: lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression
            {

            					newCompositeNode(grammarAccess.getMultiplicityAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_67);
            lv_upper_3_0=ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiplicityRule());
            					}
            					set(
            						current,
            						"upper",
            						lv_upper_3_0,
            						"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,51,FOLLOW_2); 

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
    // InternalAlf.g:4182:1: ruleSubsettingPart[EObject in_current] returns [EObject current=in_current] : ( (this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )* ) | (this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )* ) )* ;
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
            // InternalAlf.g:4188:2: ( ( (this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )* ) | (this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )* ) )* )
            // InternalAlf.g:4189:2: ( (this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )* ) | (this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )* ) )*
            {
            // InternalAlf.g:4189:2: ( (this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )* ) | (this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )* ) )*
            loop74:
            do {
                int alt74=3;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==52) ) {
                    alt74=1;
                }
                else if ( (LA74_0==42) ) {
                    alt74=2;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalAlf.g:4190:3: (this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )* )
            	    {
            	    // InternalAlf.g:4190:3: (this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )* )
            	    // InternalAlf.g:4191:4: this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )*
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getSubsettingPartRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getSubsettingPartAccess().getSubsetsParserRuleCall_0_0());
            	    			
            	    pushFollow(FOLLOW_68);
            	    this_Subsets_0=ruleSubsets(current);

            	    state._fsp--;


            	    				current = this_Subsets_0;
            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalAlf.g:4202:4: (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )*
            	    loop72:
            	    do {
            	        int alt72=2;
            	        int LA72_0 = input.LA(1);

            	        if ( (LA72_0==38) ) {
            	            alt72=1;
            	        }


            	        switch (alt72) {
            	    	case 1 :
            	    	    // InternalAlf.g:4203:5: otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) )
            	    	    {
            	    	    otherlv_1=(Token)match(input,38,FOLLOW_13); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getSubsettingPartAccess().getCommaKeyword_0_1_0());
            	    	    				
            	    	    // InternalAlf.g:4207:5: ( (lv_ownedRelationship_2_0= ruleSubset ) )
            	    	    // InternalAlf.g:4208:6: (lv_ownedRelationship_2_0= ruleSubset )
            	    	    {
            	    	    // InternalAlf.g:4208:6: (lv_ownedRelationship_2_0= ruleSubset )
            	    	    // InternalAlf.g:4209:7: lv_ownedRelationship_2_0= ruleSubset
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSubsettingPartAccess().getOwnedRelationshipSubsetParserRuleCall_0_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_68);
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
            	    	    break loop72;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:4229:3: (this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )* )
            	    {
            	    // InternalAlf.g:4229:3: (this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )* )
            	    // InternalAlf.g:4230:4: this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )*
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getSubsettingPartRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getSubsettingPartAccess().getRedefinesParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_68);
            	    this_Redefines_3=ruleRedefines(current);

            	    state._fsp--;


            	    				current = this_Redefines_3;
            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalAlf.g:4241:4: (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )*
            	    loop73:
            	    do {
            	        int alt73=2;
            	        int LA73_0 = input.LA(1);

            	        if ( (LA73_0==38) ) {
            	            alt73=1;
            	        }


            	        switch (alt73) {
            	    	case 1 :
            	    	    // InternalAlf.g:4242:5: otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,38,FOLLOW_13); 

            	    	    					newLeafNode(otherlv_4, grammarAccess.getSubsettingPartAccess().getCommaKeyword_1_1_0());
            	    	    				
            	    	    // InternalAlf.g:4246:5: ( (lv_ownedRelationship_5_0= ruleRedefinition ) )
            	    	    // InternalAlf.g:4247:6: (lv_ownedRelationship_5_0= ruleRedefinition )
            	    	    {
            	    	    // InternalAlf.g:4247:6: (lv_ownedRelationship_5_0= ruleRedefinition )
            	    	    // InternalAlf.g:4248:7: lv_ownedRelationship_5_0= ruleRedefinition
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSubsettingPartAccess().getOwnedRelationshipRedefinitionParserRuleCall_1_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_68);
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
            	    	    break loop73;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
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
    // InternalAlf.g:4272:1: ruleSubsets[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'subsets' ( (lv_ownedRelationship_1_0= ruleSubset ) ) ) ;
    public final EObject ruleSubsets(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_ownedRelationship_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4278:2: ( (otherlv_0= 'subsets' ( (lv_ownedRelationship_1_0= ruleSubset ) ) ) )
            // InternalAlf.g:4279:2: (otherlv_0= 'subsets' ( (lv_ownedRelationship_1_0= ruleSubset ) ) )
            {
            // InternalAlf.g:4279:2: (otherlv_0= 'subsets' ( (lv_ownedRelationship_1_0= ruleSubset ) ) )
            // InternalAlf.g:4280:3: otherlv_0= 'subsets' ( (lv_ownedRelationship_1_0= ruleSubset ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSubsetsAccess().getSubsetsKeyword_0());
            		
            // InternalAlf.g:4284:3: ( (lv_ownedRelationship_1_0= ruleSubset ) )
            // InternalAlf.g:4285:4: (lv_ownedRelationship_1_0= ruleSubset )
            {
            // InternalAlf.g:4285:4: (lv_ownedRelationship_1_0= ruleSubset )
            // InternalAlf.g:4286:5: lv_ownedRelationship_1_0= ruleSubset
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
    // InternalAlf.g:4307:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalAlf.g:4307:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalAlf.g:4308:2: iv_ruleSubset= ruleSubset EOF
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
    // InternalAlf.g:4314:1: ruleSubset returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubset() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:4320:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:4321:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:4321:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4322:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:4322:3: ( ruleQualifiedName )
            // InternalAlf.g:4323:4: ruleQualifiedName
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
    // InternalAlf.g:4341:1: ruleRedefines[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) ) ;
    public final EObject ruleRedefines(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_ownedRelationship_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4347:2: ( (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) ) )
            // InternalAlf.g:4348:2: (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) )
            {
            // InternalAlf.g:4348:2: (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) )
            // InternalAlf.g:4349:3: otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRedefinesAccess().getRedefinesKeyword_0());
            		
            // InternalAlf.g:4353:3: ( (lv_ownedRelationship_1_0= ruleRedefinition ) )
            // InternalAlf.g:4354:4: (lv_ownedRelationship_1_0= ruleRedefinition )
            {
            // InternalAlf.g:4354:4: (lv_ownedRelationship_1_0= ruleRedefinition )
            // InternalAlf.g:4355:5: lv_ownedRelationship_1_0= ruleRedefinition
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
    // InternalAlf.g:4376:1: entryRuleRedefinition returns [EObject current=null] : iv_ruleRedefinition= ruleRedefinition EOF ;
    public final EObject entryRuleRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefinition = null;


        try {
            // InternalAlf.g:4376:53: (iv_ruleRedefinition= ruleRedefinition EOF )
            // InternalAlf.g:4377:2: iv_ruleRedefinition= ruleRedefinition EOF
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
    // InternalAlf.g:4383:1: ruleRedefinition returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleRedefinition() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:4389:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:4390:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:4390:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4391:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:4391:3: ( ruleQualifiedName )
            // InternalAlf.g:4392:4: ruleQualifiedName
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
    // InternalAlf.g:4409:1: entryRuleConnectorDefinition returns [EObject current=null] : iv_ruleConnectorDefinition= ruleConnectorDefinition EOF ;
    public final EObject entryRuleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorDefinition = null;


        try {
            // InternalAlf.g:4409:60: (iv_ruleConnectorDefinition= ruleConnectorDefinition EOF )
            // InternalAlf.g:4410:2: iv_ruleConnectorDefinition= ruleConnectorDefinition EOF
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
    // InternalAlf.g:4416:1: ruleConnectorDefinition returns [EObject current=null] : ( ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) ) this_CategoryBody_17= ruleCategoryBody[$current] ) ;
    public final EObject ruleConnectorDefinition() throws RecognitionException {
        EObject current = null;

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

        EObject lv_connectorEnd_4_0 = null;

        EObject lv_connectorEnd_6_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_ownedRelationship_9_0 = null;

        EObject lv_connectorEnd_11_0 = null;

        EObject lv_connectorEnd_13_0 = null;

        EObject lv_connectorEnd_15_0 = null;

        EObject this_CategoryBody_17 = null;



        	enterRule();

        try {
            // InternalAlf.g:4422:2: ( ( ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) ) this_CategoryBody_17= ruleCategoryBody[$current] ) )
            // InternalAlf.g:4423:2: ( ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) ) this_CategoryBody_17= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:4423:2: ( ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) ) this_CategoryBody_17= ruleCategoryBody[$current] )
            // InternalAlf.g:4424:3: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) ) this_CategoryBody_17= ruleCategoryBody[$current]
            {
            // InternalAlf.g:4424:3: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) )
            int alt81=2;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // InternalAlf.g:4425:4: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) )
                    {
                    // InternalAlf.g:4425:4: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) )
                    // InternalAlf.g:4426:5: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) )
                    {
                    // InternalAlf.g:4426:5: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )?
                    int alt77=2;
                    alt77 = dfa77.predict(input);
                    switch (alt77) {
                        case 1 :
                            // InternalAlf.g:4427:6: ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is'
                            {
                            // InternalAlf.g:4427:6: ( (lv_name_0_0= ruleName ) )?
                            int alt75=2;
                            int LA75_0 = input.LA(1);

                            if ( ((LA75_0>=RULE_ID && LA75_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt75=1;
                            }
                            switch (alt75) {
                                case 1 :
                                    // InternalAlf.g:4428:7: (lv_name_0_0= ruleName )
                                    {
                                    // InternalAlf.g:4428:7: (lv_name_0_0= ruleName )
                                    // InternalAlf.g:4429:8: lv_name_0_0= ruleName
                                    {

                                    								newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_0_0_0_0_0());
                                    							
                                    pushFollow(FOLLOW_69);
                                    lv_name_0_0=ruleName();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getConnectorDefinitionRule());
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

                            // InternalAlf.g:4446:6: (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )?
                            int alt76=2;
                            int LA76_0 = input.LA(1);

                            if ( (LA76_0==44) ) {
                                alt76=1;
                            }
                            switch (alt76) {
                                case 1 :
                                    // InternalAlf.g:4447:7: otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) )
                                    {
                                    otherlv_1=(Token)match(input,44,FOLLOW_13); 

                                    							newLeafNode(otherlv_1, grammarAccess.getConnectorDefinitionAccess().getColonKeyword_0_0_0_1_0());
                                    						
                                    // InternalAlf.g:4451:7: ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) )
                                    // InternalAlf.g:4452:8: (lv_ownedRelationship_2_0= ruleConnectorTyping )
                                    {
                                    // InternalAlf.g:4452:8: (lv_ownedRelationship_2_0= ruleConnectorTyping )
                                    // InternalAlf.g:4453:9: lv_ownedRelationship_2_0= ruleConnectorTyping
                                    {

                                    									newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getOwnedRelationshipConnectorTypingParserRuleCall_0_0_0_1_1_0());
                                    								
                                    pushFollow(FOLLOW_25);
                                    lv_ownedRelationship_2_0=ruleConnectorTyping();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getConnectorDefinitionRule());
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

                            otherlv_3=(Token)match(input,25,FOLLOW_70); 

                            						newLeafNode(otherlv_3, grammarAccess.getConnectorDefinitionAccess().getIsKeyword_0_0_0_2());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:4476:5: ( (lv_connectorEnd_4_0= ruleConnectorEnd ) )
                    // InternalAlf.g:4477:6: (lv_connectorEnd_4_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:4477:6: (lv_connectorEnd_4_0= ruleConnectorEnd )
                    // InternalAlf.g:4478:7: lv_connectorEnd_4_0= ruleConnectorEnd
                    {

                    							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_0_0_1_0());
                    						
                    pushFollow(FOLLOW_71);
                    lv_connectorEnd_4_0=ruleConnectorEnd();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConnectorDefinitionRule());
                    							}
                    							add(
                    								current,
                    								"connectorEnd",
                    								lv_connectorEnd_4_0,
                    								"org.omg.sysml.Alf.ConnectorEnd");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,53,FOLLOW_70); 

                    					newLeafNode(otherlv_5, grammarAccess.getConnectorDefinitionAccess().getToKeyword_0_0_2());
                    				
                    // InternalAlf.g:4499:5: ( (lv_connectorEnd_6_0= ruleConnectorEnd ) )
                    // InternalAlf.g:4500:6: (lv_connectorEnd_6_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:4500:6: (lv_connectorEnd_6_0= ruleConnectorEnd )
                    // InternalAlf.g:4501:7: lv_connectorEnd_6_0= ruleConnectorEnd
                    {

                    							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_0_0_3_0());
                    						
                    pushFollow(FOLLOW_35);
                    lv_connectorEnd_6_0=ruleConnectorEnd();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConnectorDefinitionRule());
                    							}
                    							add(
                    								current,
                    								"connectorEnd",
                    								lv_connectorEnd_6_0,
                    								"org.omg.sysml.Alf.ConnectorEnd");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:4520:4: ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' )
                    {
                    // InternalAlf.g:4520:4: ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' )
                    // InternalAlf.g:4521:5: ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')'
                    {
                    // InternalAlf.g:4521:5: ( (lv_name_7_0= ruleName ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( ((LA78_0>=RULE_ID && LA78_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // InternalAlf.g:4522:6: (lv_name_7_0= ruleName )
                            {
                            // InternalAlf.g:4522:6: (lv_name_7_0= ruleName )
                            // InternalAlf.g:4523:7: lv_name_7_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_0_1_0_0());
                            						
                            pushFollow(FOLLOW_72);
                            lv_name_7_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getConnectorDefinitionRule());
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

                    // InternalAlf.g:4540:5: (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==44) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalAlf.g:4541:6: otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) )
                            {
                            otherlv_8=(Token)match(input,44,FOLLOW_13); 

                            						newLeafNode(otherlv_8, grammarAccess.getConnectorDefinitionAccess().getColonKeyword_0_1_1_0());
                            					
                            // InternalAlf.g:4545:6: ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) )
                            // InternalAlf.g:4546:7: (lv_ownedRelationship_9_0= ruleConnectorTyping )
                            {
                            // InternalAlf.g:4546:7: (lv_ownedRelationship_9_0= ruleConnectorTyping )
                            // InternalAlf.g:4547:8: lv_ownedRelationship_9_0= ruleConnectorTyping
                            {

                            								newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getOwnedRelationshipConnectorTypingParserRuleCall_0_1_1_1_0());
                            							
                            pushFollow(FOLLOW_50);
                            lv_ownedRelationship_9_0=ruleConnectorTyping();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getConnectorDefinitionRule());
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

                    otherlv_10=(Token)match(input,40,FOLLOW_70); 

                    					newLeafNode(otherlv_10, grammarAccess.getConnectorDefinitionAccess().getLeftParenthesisKeyword_0_1_2());
                    				
                    // InternalAlf.g:4569:5: ( (lv_connectorEnd_11_0= ruleConnectorEnd ) )
                    // InternalAlf.g:4570:6: (lv_connectorEnd_11_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:4570:6: (lv_connectorEnd_11_0= ruleConnectorEnd )
                    // InternalAlf.g:4571:7: lv_connectorEnd_11_0= ruleConnectorEnd
                    {

                    							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_0_1_3_0());
                    						
                    pushFollow(FOLLOW_73);
                    lv_connectorEnd_11_0=ruleConnectorEnd();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConnectorDefinitionRule());
                    							}
                    							add(
                    								current,
                    								"connectorEnd",
                    								lv_connectorEnd_11_0,
                    								"org.omg.sysml.Alf.ConnectorEnd");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_12=(Token)match(input,38,FOLLOW_70); 

                    					newLeafNode(otherlv_12, grammarAccess.getConnectorDefinitionAccess().getCommaKeyword_0_1_4());
                    				
                    // InternalAlf.g:4592:5: ( (lv_connectorEnd_13_0= ruleConnectorEnd ) )
                    // InternalAlf.g:4593:6: (lv_connectorEnd_13_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:4593:6: (lv_connectorEnd_13_0= ruleConnectorEnd )
                    // InternalAlf.g:4594:7: lv_connectorEnd_13_0= ruleConnectorEnd
                    {

                    							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_0_1_5_0());
                    						
                    pushFollow(FOLLOW_52);
                    lv_connectorEnd_13_0=ruleConnectorEnd();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConnectorDefinitionRule());
                    							}
                    							add(
                    								current,
                    								"connectorEnd",
                    								lv_connectorEnd_13_0,
                    								"org.omg.sysml.Alf.ConnectorEnd");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:4611:5: (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==38) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalAlf.g:4612:6: otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) )
                    	    {
                    	    otherlv_14=(Token)match(input,38,FOLLOW_70); 

                    	    						newLeafNode(otherlv_14, grammarAccess.getConnectorDefinitionAccess().getCommaKeyword_0_1_6_0());
                    	    					
                    	    // InternalAlf.g:4616:6: ( (lv_connectorEnd_15_0= ruleConnectorEnd ) )
                    	    // InternalAlf.g:4617:7: (lv_connectorEnd_15_0= ruleConnectorEnd )
                    	    {
                    	    // InternalAlf.g:4617:7: (lv_connectorEnd_15_0= ruleConnectorEnd )
                    	    // InternalAlf.g:4618:8: lv_connectorEnd_15_0= ruleConnectorEnd
                    	    {

                    	    								newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_0_1_6_1_0());
                    	    							
                    	    pushFollow(FOLLOW_52);
                    	    lv_connectorEnd_15_0=ruleConnectorEnd();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getConnectorDefinitionRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"connectorEnd",
                    	    									lv_connectorEnd_15_0,
                    	    									"org.omg.sysml.Alf.ConnectorEnd");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,41,FOLLOW_35); 

                    					newLeafNode(otherlv_16, grammarAccess.getConnectorDefinitionAccess().getRightParenthesisKeyword_0_1_7());
                    				

                    }


                    }
                    break;

            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getConnectorDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getCategoryBodyParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_CategoryBody_17=ruleCategoryBody(current);

            state._fsp--;


            			current = this_CategoryBody_17;
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


    // $ANTLR start "entryRuleConnectorTyping"
    // InternalAlf.g:4657:1: entryRuleConnectorTyping returns [EObject current=null] : iv_ruleConnectorTyping= ruleConnectorTyping EOF ;
    public final EObject entryRuleConnectorTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorTyping = null;


        try {
            // InternalAlf.g:4657:56: (iv_ruleConnectorTyping= ruleConnectorTyping EOF )
            // InternalAlf.g:4658:2: iv_ruleConnectorTyping= ruleConnectorTyping EOF
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
    // InternalAlf.g:4664:1: ruleConnectorTyping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleConnectorTyping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:4670:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:4671:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:4671:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4672:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:4672:3: ( ruleQualifiedName )
            // InternalAlf.g:4673:4: ruleQualifiedName
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
    // InternalAlf.g:4690:1: entryRuleConnectorEnd returns [EObject current=null] : iv_ruleConnectorEnd= ruleConnectorEnd EOF ;
    public final EObject entryRuleConnectorEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorEnd = null;


        try {
            // InternalAlf.g:4690:53: (iv_ruleConnectorEnd= ruleConnectorEnd EOF )
            // InternalAlf.g:4691:2: iv_ruleConnectorEnd= ruleConnectorEnd EOF
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
    // InternalAlf.g:4697:1: ruleConnectorEnd returns [EObject current=null] : ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleConnectorEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_multiplicity_3_0 = null;

        EObject lv_multiplicity_5_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4703:2: ( ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) ) )
            // InternalAlf.g:4704:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )
            {
            // InternalAlf.g:4704:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // InternalAlf.g:4705:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? )
                    {
                    // InternalAlf.g:4705:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? )
                    // InternalAlf.g:4706:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )?
                    {
                    // InternalAlf.g:4706:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )?
                    int alt82=2;
                    alt82 = dfa82.predict(input);
                    switch (alt82) {
                        case 1 :
                            // InternalAlf.g:4707:5: ( ( ruleQualifiedName ) ) otherlv_1= ':'
                            {
                            // InternalAlf.g:4707:5: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:4708:6: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:4708:6: ( ruleQualifiedName )
                            // InternalAlf.g:4709:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConnectorEndRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getConnectorEndAccess().getEndFeatureCrossReference_0_0_0_0());
                            						
                            pushFollow(FOLLOW_74);
                            ruleQualifiedName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_1=(Token)match(input,44,FOLLOW_13); 

                            					newLeafNode(otherlv_1, grammarAccess.getConnectorEndAccess().getColonKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:4728:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:4729:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:4729:5: ( ruleQualifiedName )
                    // InternalAlf.g:4730:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectorEndRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConnectorEndAccess().getFeatureFeatureCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_75);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:4744:4: ( (lv_multiplicity_3_0= ruleMultiplicity ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==49) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // InternalAlf.g:4745:5: (lv_multiplicity_3_0= ruleMultiplicity )
                            {
                            // InternalAlf.g:4745:5: (lv_multiplicity_3_0= ruleMultiplicity )
                            // InternalAlf.g:4746:6: lv_multiplicity_3_0= ruleMultiplicity
                            {

                            						newCompositeNode(grammarAccess.getConnectorEndAccess().getMultiplicityMultiplicityParserRuleCall_0_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_multiplicity_3_0=ruleMultiplicity();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getConnectorEndRule());
                            						}
                            						set(
                            							current,
                            							"multiplicity",
                            							lv_multiplicity_3_0,
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
                    // InternalAlf.g:4765:3: ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalAlf.g:4765:3: ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) )
                    // InternalAlf.g:4766:4: ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) )
                    {
                    // InternalAlf.g:4766:4: ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' )
                    // InternalAlf.g:4767:5: ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>'
                    {
                    // InternalAlf.g:4767:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:4768:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:4768:6: ( ruleQualifiedName )
                    // InternalAlf.g:4769:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConnectorEndRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getConnectorEndAccess().getEndFeatureCrossReference_1_0_0_0());
                    						
                    pushFollow(FOLLOW_76);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:4783:5: ( (lv_multiplicity_5_0= ruleMultiplicity ) )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==49) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // InternalAlf.g:4784:6: (lv_multiplicity_5_0= ruleMultiplicity )
                            {
                            // InternalAlf.g:4784:6: (lv_multiplicity_5_0= ruleMultiplicity )
                            // InternalAlf.g:4785:7: lv_multiplicity_5_0= ruleMultiplicity
                            {

                            							newCompositeNode(grammarAccess.getConnectorEndAccess().getMultiplicityMultiplicityParserRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_77);
                            lv_multiplicity_5_0=ruleMultiplicity();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getConnectorEndRule());
                            							}
                            							set(
                            								current,
                            								"multiplicity",
                            								lv_multiplicity_5_0,
                            								"org.omg.sysml.Alf.Multiplicity");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,54,FOLLOW_13); 

                    					newLeafNode(otherlv_6, grammarAccess.getConnectorEndAccess().getEqualsSignGreaterThanSignKeyword_1_0_2());
                    				

                    }

                    // InternalAlf.g:4807:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:4808:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:4808:5: ( ruleQualifiedName )
                    // InternalAlf.g:4809:6: ruleQualifiedName
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
    // InternalAlf.g:4828:1: entryRuleParameterDefinition returns [EObject current=null] : iv_ruleParameterDefinition= ruleParameterDefinition EOF ;
    public final EObject entryRuleParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDefinition = null;


        try {
            // InternalAlf.g:4828:60: (iv_ruleParameterDefinition= ruleParameterDefinition EOF )
            // InternalAlf.g:4829:2: iv_ruleParameterDefinition= ruleParameterDefinition EOF
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
    // InternalAlf.g:4835:1: ruleParameterDefinition returns [EObject current=null] : (this_TypePart_0= ruleTypePart[$current] (this_Subsets_1= ruleSubsets[$current] | this_Redefines_2= ruleRedefines[$current] )* ) ;
    public final EObject ruleParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_TypePart_0 = null;

        EObject this_Subsets_1 = null;

        EObject this_Redefines_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4841:2: ( (this_TypePart_0= ruleTypePart[$current] (this_Subsets_1= ruleSubsets[$current] | this_Redefines_2= ruleRedefines[$current] )* ) )
            // InternalAlf.g:4842:2: (this_TypePart_0= ruleTypePart[$current] (this_Subsets_1= ruleSubsets[$current] | this_Redefines_2= ruleRedefines[$current] )* )
            {
            // InternalAlf.g:4842:2: (this_TypePart_0= ruleTypePart[$current] (this_Subsets_1= ruleSubsets[$current] | this_Redefines_2= ruleRedefines[$current] )* )
            // InternalAlf.g:4843:3: this_TypePart_0= ruleTypePart[$current] (this_Subsets_1= ruleSubsets[$current] | this_Redefines_2= ruleRedefines[$current] )*
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getParameterDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getParameterDefinitionAccess().getTypePartParserRuleCall_0());
            		
            pushFollow(FOLLOW_78);
            this_TypePart_0=ruleTypePart(current);

            state._fsp--;


            			current = this_TypePart_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:4854:3: (this_Subsets_1= ruleSubsets[$current] | this_Redefines_2= ruleRedefines[$current] )*
            loop86:
            do {
                int alt86=3;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==52) ) {
                    alt86=1;
                }
                else if ( (LA86_0==42) ) {
                    alt86=2;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalAlf.g:4855:4: this_Subsets_1= ruleSubsets[$current]
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getParameterDefinitionRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getParameterDefinitionAccess().getSubsetsParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_78);
            	    this_Subsets_1=ruleSubsets(current);

            	    state._fsp--;


            	    				current = this_Subsets_1;
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:4867:4: this_Redefines_2= ruleRedefines[$current]
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getParameterDefinitionRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getParameterDefinitionAccess().getRedefinesParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_78);
            	    this_Redefines_2=ruleRedefines(current);

            	    state._fsp--;


            	    				current = this_Redefines_2;
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop86;
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
    // $ANTLR end "ruleParameterDefinition"


    // $ANTLR start "entryRuleExpression"
    // InternalAlf.g:4883:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAlf.g:4883:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAlf.g:4884:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAlf.g:4890:1: ruleExpression returns [EObject current=null] : this_BinaryExpression_0= ruleBinaryExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4896:2: (this_BinaryExpression_0= ruleBinaryExpression )
            // InternalAlf.g:4897:2: this_BinaryExpression_0= ruleBinaryExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BinaryExpression_0=ruleBinaryExpression();

            state._fsp--;


            		current = this_BinaryExpression_0;
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


    // $ANTLR start "entryRuleBinaryExpression"
    // InternalAlf.g:4908:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalAlf.g:4908:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalAlf.g:4909:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryExpression=ruleBinaryExpression();

            state._fsp--;

             current =iv_ruleBinaryExpression; 
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
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // InternalAlf.g:4915:1: ruleBinaryExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_UnaryExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;

        EObject lv_operand_6_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4921:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) )
            // InternalAlf.g:4922:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            {
            // InternalAlf.g:4922:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            // InternalAlf.g:4923:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            {

            			newCompositeNode(grammarAccess.getBinaryExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_79);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:4931:3: ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==19||(LA88_0>=55 && LA88_0<=68)) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalAlf.g:4932:4: () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    {
                    // InternalAlf.g:4932:4: ()
                    // InternalAlf.g:4933:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:4939:4: ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==19||(LA87_0>=56 && LA87_0<=68)) ) {
                        alt87=1;
                    }
                    else if ( (LA87_0==55) ) {
                        alt87=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 0, input);

                        throw nvae;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalAlf.g:4940:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            {
                            // InternalAlf.g:4940:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            // InternalAlf.g:4941:6: ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) )
                            {
                            // InternalAlf.g:4941:6: ( (lv_operator_2_0= ruleBinaryOperator ) )
                            // InternalAlf.g:4942:7: (lv_operator_2_0= ruleBinaryOperator )
                            {
                            // InternalAlf.g:4942:7: (lv_operator_2_0= ruleBinaryOperator )
                            // InternalAlf.g:4943:8: lv_operator_2_0= ruleBinaryOperator
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorParserRuleCall_1_1_0_0_0());
                            							
                            pushFollow(FOLLOW_60);
                            lv_operator_2_0=ruleBinaryOperator();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                            								}
                            								set(
                            									current,
                            									"operator",
                            									lv_operator_2_0,
                            									"org.omg.sysml.Alf.BinaryOperator");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalAlf.g:4960:6: ( (lv_operand_3_0= ruleExpression ) )
                            // InternalAlf.g:4961:7: (lv_operand_3_0= ruleExpression )
                            {
                            // InternalAlf.g:4961:7: (lv_operand_3_0= ruleExpression )
                            // InternalAlf.g:4962:8: lv_operand_3_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperandExpressionParserRuleCall_1_1_0_1_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_operand_3_0=ruleExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                            								}
                            								add(
                            									current,
                            									"operand",
                            									lv_operand_3_0,
                            									"org.omg.sysml.Alf.Expression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:4981:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            {
                            // InternalAlf.g:4981:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            // InternalAlf.g:4982:6: ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']'
                            {
                            // InternalAlf.g:4982:6: ( (lv_operator_4_0= '@' ) )
                            // InternalAlf.g:4983:7: (lv_operator_4_0= '@' )
                            {
                            // InternalAlf.g:4983:7: (lv_operator_4_0= '@' )
                            // InternalAlf.g:4984:8: lv_operator_4_0= '@'
                            {
                            lv_operator_4_0=(Token)match(input,55,FOLLOW_80); 

                            								newLeafNode(lv_operator_4_0, grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getBinaryExpressionRule());
                            								}
                            								setWithLastConsumed(current, "operator", lv_operator_4_0, "@");
                            							

                            }


                            }

                            otherlv_5=(Token)match(input,49,FOLLOW_60); 

                            						newLeafNode(otherlv_5, grammarAccess.getBinaryExpressionAccess().getLeftSquareBracketKeyword_1_1_1_1());
                            					
                            // InternalAlf.g:5000:6: ( (lv_operand_6_0= ruleExpression ) )
                            // InternalAlf.g:5001:7: (lv_operand_6_0= ruleExpression )
                            {
                            // InternalAlf.g:5001:7: (lv_operand_6_0= ruleExpression )
                            // InternalAlf.g:5002:8: lv_operand_6_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperandExpressionParserRuleCall_1_1_1_2_0());
                            							
                            pushFollow(FOLLOW_67);
                            lv_operand_6_0=ruleExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                            								}
                            								add(
                            									current,
                            									"operand",
                            									lv_operand_6_0,
                            									"org.omg.sysml.Alf.Expression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_7=(Token)match(input,51,FOLLOW_2); 

                            						newLeafNode(otherlv_7, grammarAccess.getBinaryExpressionAccess().getRightSquareBracketKeyword_1_1_1_3());
                            					

                            }


                            }
                            break;

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
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleBinaryOperator"
    // InternalAlf.g:5030:1: entryRuleBinaryOperator returns [String current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final String entryRuleBinaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperator = null;


        try {
            // InternalAlf.g:5030:54: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // InternalAlf.g:5031:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
            {
             newCompositeNode(grammarAccess.getBinaryOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryOperator=ruleBinaryOperator();

            state._fsp--;

             current =iv_ruleBinaryOperator.getText(); 
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
    // $ANTLR end "entryRuleBinaryOperator"


    // $ANTLR start "ruleBinaryOperator"
    // InternalAlf.g:5037:1: ruleBinaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '**' | kw= '&' | kw= '|' | kw= '^' | kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:5043:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '**' | kw= '&' | kw= '|' | kw= '^' | kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // InternalAlf.g:5044:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '**' | kw= '&' | kw= '|' | kw= '^' | kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // InternalAlf.g:5044:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '**' | kw= '&' | kw= '|' | kw= '^' | kw= '==' | kw= '!=' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            int alt89=14;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt89=1;
                }
                break;
            case 57:
                {
                alt89=2;
                }
                break;
            case 19:
                {
                alt89=3;
                }
                break;
            case 58:
                {
                alt89=4;
                }
                break;
            case 59:
                {
                alt89=5;
                }
                break;
            case 60:
                {
                alt89=6;
                }
                break;
            case 61:
                {
                alt89=7;
                }
                break;
            case 62:
                {
                alt89=8;
                }
                break;
            case 63:
                {
                alt89=9;
                }
                break;
            case 64:
                {
                alt89=10;
                }
                break;
            case 65:
                {
                alt89=11;
                }
                break;
            case 66:
                {
                alt89=12;
                }
                break;
            case 67:
                {
                alt89=13;
                }
                break;
            case 68:
                {
                alt89=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // InternalAlf.g:5045:3: kw= '+'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:5051:3: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:5057:3: kw= '*'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:5063:3: kw= '/'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:5069:3: kw= '**'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getAsteriskAsteriskKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAlf.g:5075:3: kw= '&'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getAmpersandKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalAlf.g:5081:3: kw= '|'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getVerticalLineKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalAlf.g:5087:3: kw= '^'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getCircumflexAccentKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalAlf.g:5093:3: kw= '=='
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getEqualsSignEqualsSignKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalAlf.g:5099:3: kw= '!='
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getExclamationMarkEqualsSignKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalAlf.g:5105:3: kw= '<'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getLessThanSignKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalAlf.g:5111:3: kw= '>'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getGreaterThanSignKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalAlf.g:5117:3: kw= '<='
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getLessThanSignEqualsSignKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalAlf.g:5123:3: kw= '>='
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getGreaterThanSignEqualsSignKeyword_13());
                    		

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
    // $ANTLR end "ruleBinaryOperator"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalAlf.g:5132:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlf.g:5132:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlf.g:5133:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalAlf.g:5139:1: ruleUnaryExpression returns [EObject current=null] : (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceAccessExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5145:2: ( (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) )
            // InternalAlf.g:5146:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            {
            // InternalAlf.g:5146:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( ((LA90_0>=RULE_BOOLEAN_VALUE && LA90_0<=RULE_UNRESTRICTED_NAME)||(LA90_0>=18 && LA90_0<=19)||LA90_0==23||LA90_0==40||LA90_0==71) ) {
                alt90=1;
            }
            else if ( ((LA90_0>=56 && LA90_0<=57)||(LA90_0>=69 && LA90_0<=70)) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // InternalAlf.g:5147:3: this_SequenceAccessExpression_0= ruleSequenceAccessExpression
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
                    // InternalAlf.g:5156:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    {
                    // InternalAlf.g:5156:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    // InternalAlf.g:5157:4: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    {
                    // InternalAlf.g:5157:4: ()
                    // InternalAlf.g:5158:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:5164:4: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // InternalAlf.g:5165:5: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // InternalAlf.g:5165:5: (lv_operator_2_0= ruleUnaryOperator )
                    // InternalAlf.g:5166:6: lv_operator_2_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_81);
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

                    // InternalAlf.g:5183:4: ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    // InternalAlf.g:5184:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    {
                    // InternalAlf.g:5184:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    // InternalAlf.g:5185:6: lv_operand_3_0= ruleSequenceAccessExpression
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
    // InternalAlf.g:5207:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalAlf.g:5207:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalAlf.g:5208:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalAlf.g:5214:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '!' | kw= '~' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:5220:2: ( (kw= '+' | kw= '-' | kw= '!' | kw= '~' ) )
            // InternalAlf.g:5221:2: (kw= '+' | kw= '-' | kw= '!' | kw= '~' )
            {
            // InternalAlf.g:5221:2: (kw= '+' | kw= '-' | kw= '!' | kw= '~' )
            int alt91=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt91=1;
                }
                break;
            case 57:
                {
                alt91=2;
                }
                break;
            case 69:
                {
                alt91=3;
                }
                break;
            case 70:
                {
                alt91=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalAlf.g:5222:3: kw= '+'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:5228:3: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:5234:3: kw= '!'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getExclamationMarkKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:5240:3: kw= '~'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

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
    // InternalAlf.g:5249:1: entryRuleSequenceAccessExpression returns [EObject current=null] : iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF ;
    public final EObject entryRuleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceAccessExpression = null;


        try {
            // InternalAlf.g:5249:65: (iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF )
            // InternalAlf.g:5250:2: iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF
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
    // InternalAlf.g:5256:1: ruleSequenceAccessExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']' )* ) ;
    public final EObject ruleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5262:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']' )* ) )
            // InternalAlf.g:5263:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            {
            // InternalAlf.g:5263:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            // InternalAlf.g:5264:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']' )*
            {

            			newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_75);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:5272:3: ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==49) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalAlf.g:5273:4: () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    // InternalAlf.g:5273:4: ()
            	    // InternalAlf.g:5274:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getSequenceAccessExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlf.g:5280:4: ( (lv_operator_2_0= '[' ) )
            	    // InternalAlf.g:5281:5: (lv_operator_2_0= '[' )
            	    {
            	    // InternalAlf.g:5281:5: (lv_operator_2_0= '[' )
            	    // InternalAlf.g:5282:6: lv_operator_2_0= '['
            	    {
            	    lv_operator_2_0=(Token)match(input,49,FOLLOW_60); 

            	    						newLeafNode(lv_operator_2_0, grammarAccess.getSequenceAccessExpressionAccess().getOperatorLeftSquareBracketKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSequenceAccessExpressionRule());
            	    						}
            	    						setWithLastConsumed(current, "operator", lv_operator_2_0, "[");
            	    					

            	    }


            	    }

            	    // InternalAlf.g:5294:4: ( (lv_operand_3_0= ruleExpression ) )
            	    // InternalAlf.g:5295:5: (lv_operand_3_0= ruleExpression )
            	    {
            	    // InternalAlf.g:5295:5: (lv_operand_3_0= ruleExpression )
            	    // InternalAlf.g:5296:6: lv_operand_3_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getOperandExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_67);
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

            	    otherlv_4=(Token)match(input,51,FOLLOW_75); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSequenceAccessExpressionAccess().getRightSquareBracketKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop92;
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
    // $ANTLR end "ruleSequenceAccessExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalAlf.g:5322:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalAlf.g:5322:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalAlf.g:5323:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalAlf.g:5329:1: rulePrimaryExpression returns [EObject current=null] : (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InstanceCreationExpression_3= ruleInstanceCreationExpression | this_SequenceConstructionExpression_4= ruleSequenceConstructionExpression | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_NullExpression_0 = null;

        EObject this_LiteralExpression_1 = null;

        EObject this_FeatureReferenceExpression_2 = null;

        EObject this_InstanceCreationExpression_3 = null;

        EObject this_SequenceConstructionExpression_4 = null;

        EObject this_Expression_6 = null;



        	enterRule();

        try {
            // InternalAlf.g:5335:2: ( (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InstanceCreationExpression_3= ruleInstanceCreationExpression | this_SequenceConstructionExpression_4= ruleSequenceConstructionExpression | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) ) )
            // InternalAlf.g:5336:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InstanceCreationExpression_3= ruleInstanceCreationExpression | this_SequenceConstructionExpression_4= ruleSequenceConstructionExpression | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) )
            {
            // InternalAlf.g:5336:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InstanceCreationExpression_3= ruleInstanceCreationExpression | this_SequenceConstructionExpression_4= ruleSequenceConstructionExpression | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) )
            int alt93=6;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // InternalAlf.g:5337:3: this_NullExpression_0= ruleNullExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNullExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NullExpression_0=ruleNullExpression();

                    state._fsp--;


                    			current = this_NullExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:5346:3: this_LiteralExpression_1= ruleLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralExpression_1=ruleLiteralExpression();

                    state._fsp--;


                    			current = this_LiteralExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:5355:3: this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureReferenceExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureReferenceExpression_2=ruleFeatureReferenceExpression();

                    state._fsp--;


                    			current = this_FeatureReferenceExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:5364:3: this_InstanceCreationExpression_3= ruleInstanceCreationExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getInstanceCreationExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstanceCreationExpression_3=ruleInstanceCreationExpression();

                    state._fsp--;


                    			current = this_InstanceCreationExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:5373:3: this_SequenceConstructionExpression_4= ruleSequenceConstructionExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSequenceConstructionExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceConstructionExpression_4=ruleSequenceConstructionExpression();

                    state._fsp--;


                    			current = this_SequenceConstructionExpression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAlf.g:5382:3: (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' )
                    {
                    // InternalAlf.g:5382:3: (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' )
                    // InternalAlf.g:5383:4: otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_60); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_82);
                    this_Expression_6=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_6;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_7=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_2());
                    			

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleFeatureReferenceExpression"
    // InternalAlf.g:5404:1: entryRuleFeatureReferenceExpression returns [EObject current=null] : iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF ;
    public final EObject entryRuleFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureReferenceExpression = null;


        try {
            // InternalAlf.g:5404:67: (iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF )
            // InternalAlf.g:5405:2: iv_ruleFeatureReferenceExpression= ruleFeatureReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getFeatureReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureReferenceExpression=ruleFeatureReferenceExpression();

            state._fsp--;

             current =iv_ruleFeatureReferenceExpression; 
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
    // $ANTLR end "entryRuleFeatureReferenceExpression"


    // $ANTLR start "ruleFeatureReferenceExpression"
    // InternalAlf.g:5411:1: ruleFeatureReferenceExpression returns [EObject current=null] : ( (lv_ownedMembership_0_0= ruleFeatureReference ) ) ;
    public final EObject ruleFeatureReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMembership_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5417:2: ( ( (lv_ownedMembership_0_0= ruleFeatureReference ) ) )
            // InternalAlf.g:5418:2: ( (lv_ownedMembership_0_0= ruleFeatureReference ) )
            {
            // InternalAlf.g:5418:2: ( (lv_ownedMembership_0_0= ruleFeatureReference ) )
            // InternalAlf.g:5419:3: (lv_ownedMembership_0_0= ruleFeatureReference )
            {
            // InternalAlf.g:5419:3: (lv_ownedMembership_0_0= ruleFeatureReference )
            // InternalAlf.g:5420:4: lv_ownedMembership_0_0= ruleFeatureReference
            {

            				newCompositeNode(grammarAccess.getFeatureReferenceExpressionAccess().getOwnedMembershipFeatureReferenceParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedMembership_0_0=ruleFeatureReference();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFeatureReferenceExpressionRule());
            				}
            				add(
            					current,
            					"ownedMembership",
            					lv_ownedMembership_0_0,
            					"org.omg.sysml.Alf.FeatureReference");
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
    // $ANTLR end "ruleFeatureReferenceExpression"


    // $ANTLR start "entryRuleFeatureReference"
    // InternalAlf.g:5440:1: entryRuleFeatureReference returns [EObject current=null] : iv_ruleFeatureReference= ruleFeatureReference EOF ;
    public final EObject entryRuleFeatureReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureReference = null;


        try {
            // InternalAlf.g:5440:57: (iv_ruleFeatureReference= ruleFeatureReference EOF )
            // InternalAlf.g:5441:2: iv_ruleFeatureReference= ruleFeatureReference EOF
            {
             newCompositeNode(grammarAccess.getFeatureReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureReference=ruleFeatureReference();

            state._fsp--;

             current =iv_ruleFeatureReference; 
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
    // $ANTLR end "entryRuleFeatureReference"


    // $ANTLR start "ruleFeatureReference"
    // InternalAlf.g:5447:1: ruleFeatureReference returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleFeatureReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:5453:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:5454:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:5454:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:5455:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:5455:3: ( ruleQualifiedName )
            // InternalAlf.g:5456:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFeatureReferenceRule());
            				}
            			

            				newCompositeNode(grammarAccess.getFeatureReferenceAccess().getMemberFeatureFeatureCrossReference_0());
            			
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
    // $ANTLR end "ruleFeatureReference"


    // $ANTLR start "entryRuleInstanceCreationExpression"
    // InternalAlf.g:5473:1: entryRuleInstanceCreationExpression returns [EObject current=null] : iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF ;
    public final EObject entryRuleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceCreationExpression = null;


        try {
            // InternalAlf.g:5473:67: (iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF )
            // InternalAlf.g:5474:2: iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF
            {
             newCompositeNode(grammarAccess.getInstanceCreationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceCreationExpression=ruleInstanceCreationExpression();

            state._fsp--;

             current =iv_ruleInstanceCreationExpression; 
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
    // $ANTLR end "entryRuleInstanceCreationExpression"


    // $ANTLR start "ruleInstanceCreationExpression"
    // InternalAlf.g:5480:1: ruleInstanceCreationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' ) ;
    public final EObject ruleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Tuple_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:5486:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' ) )
            // InternalAlf.g:5487:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' )
            {
            // InternalAlf.g:5487:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' )
            // InternalAlf.g:5488:3: ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')'
            {
            // InternalAlf.g:5488:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:5489:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:5489:4: ( ruleQualifiedName )
            // InternalAlf.g:5490:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceCreationExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getClassClassCrossReference_0_0());
            				
            pushFollow(FOLLOW_50);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_83); 

            			newLeafNode(otherlv_1, grammarAccess.getInstanceCreationExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlf.g:5508:3: (this_Tuple_2= ruleTuple[$current] )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( ((LA94_0>=RULE_BOOLEAN_VALUE && LA94_0<=RULE_UNRESTRICTED_NAME)||(LA94_0>=18 && LA94_0<=19)||LA94_0==23||LA94_0==40||(LA94_0>=56 && LA94_0<=57)||(LA94_0>=69 && LA94_0<=71)) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalAlf.g:5509:4: this_Tuple_2= ruleTuple[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getInstanceCreationExpressionRule());
                    				}
                    				newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getTupleParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_82);
                    this_Tuple_2=ruleTuple(current);

                    state._fsp--;


                    				current = this_Tuple_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInstanceCreationExpressionAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleInstanceCreationExpression"


    // $ANTLR start "ruleTuple"
    // InternalAlf.g:5530:1: ruleTuple[EObject in_current] returns [EObject current=in_current] : (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] ) ;
    public final EObject ruleTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_PositionalTuple_0 = null;

        EObject this_NamedTuple_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:5536:2: ( (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] ) )
            // InternalAlf.g:5537:2: (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] )
            {
            // InternalAlf.g:5537:2: (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] )
            int alt95=2;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN_VALUE:
            case RULE_STRING_VALUE:
            case RULE_NATURAL_VALUE:
            case RULE_EXP_VALUE:
            case 18:
            case 19:
            case 23:
            case 40:
            case 56:
            case 57:
            case 69:
            case 70:
            case 71:
                {
                alt95=1;
                }
                break;
            case RULE_ID:
                {
                int LA95_2 = input.LA(2);

                if ( ((LA95_2>=17 && LA95_2<=19)||LA95_2==38||(LA95_2>=40 && LA95_2<=41)||LA95_2==49||(LA95_2>=55 && LA95_2<=68)) ) {
                    alt95=1;
                }
                else if ( (LA95_2==54) ) {
                    alt95=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA95_3 = input.LA(2);

                if ( ((LA95_3>=17 && LA95_3<=19)||LA95_3==38||(LA95_3>=40 && LA95_3<=41)||LA95_3==49||(LA95_3>=55 && LA95_3<=68)) ) {
                    alt95=1;
                }
                else if ( (LA95_3==54) ) {
                    alt95=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalAlf.g:5538:3: this_PositionalTuple_0= rulePositionalTuple[$current]
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
                    // InternalAlf.g:5550:3: this_NamedTuple_1= ruleNamedTuple[$current]
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
    // InternalAlf.g:5566:1: rulePositionalTuple[EObject in_current] returns [EObject current=in_current] : ( ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )* ) ;
    public final EObject rulePositionalTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_argument_0_0 = null;

        EObject lv_argument_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5572:2: ( ( ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )* ) )
            // InternalAlf.g:5573:2: ( ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )* )
            {
            // InternalAlf.g:5573:2: ( ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )* )
            // InternalAlf.g:5574:3: ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )*
            {
            // InternalAlf.g:5574:3: ( (lv_argument_0_0= ruleExpression ) )
            // InternalAlf.g:5575:4: (lv_argument_0_0= ruleExpression )
            {
            // InternalAlf.g:5575:4: (lv_argument_0_0= ruleExpression )
            // InternalAlf.g:5576:5: lv_argument_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPositionalTupleAccess().getArgumentExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_38);
            lv_argument_0_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositionalTupleRule());
            					}
            					add(
            						current,
            						"argument",
            						lv_argument_0_0,
            						"org.omg.sysml.Alf.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:5593:3: (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==38) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalAlf.g:5594:4: otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_60); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPositionalTupleAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalAlf.g:5598:4: ( (lv_argument_2_0= ruleExpression ) )
            	    // InternalAlf.g:5599:5: (lv_argument_2_0= ruleExpression )
            	    {
            	    // InternalAlf.g:5599:5: (lv_argument_2_0= ruleExpression )
            	    // InternalAlf.g:5600:6: lv_argument_2_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getPositionalTupleAccess().getArgumentExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_argument_2_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPositionalTupleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"argument",
            	    							lv_argument_2_0,
            	    							"org.omg.sysml.Alf.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop96;
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
    // InternalAlf.g:5623:1: ruleNamedTuple[EObject in_current] returns [EObject current=in_current] : ( ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )* ) ;
    public final EObject ruleNamedTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_argument_2_0 = null;

        EObject lv_argument_6_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5629:2: ( ( ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )* ) )
            // InternalAlf.g:5630:2: ( ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )* )
            {
            // InternalAlf.g:5630:2: ( ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )* )
            // InternalAlf.g:5631:3: ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getNamedTupleAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_77);
            ruleName();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,54,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedTupleAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalAlf.g:5642:3: ( (lv_argument_2_0= ruleExpression ) )
            // InternalAlf.g:5643:4: (lv_argument_2_0= ruleExpression )
            {
            // InternalAlf.g:5643:4: (lv_argument_2_0= ruleExpression )
            // InternalAlf.g:5644:5: lv_argument_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNamedTupleAccess().getArgumentExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_38);
            lv_argument_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedTupleRule());
            					}
            					add(
            						current,
            						"argument",
            						lv_argument_2_0,
            						"org.omg.sysml.Alf.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:5661:3: (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==38) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalAlf.g:5662:4: otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,38,FOLLOW_13); 

            	    				newLeafNode(otherlv_3, grammarAccess.getNamedTupleAccess().getCommaKeyword_3_0());
            	    			

            	    				newCompositeNode(grammarAccess.getNamedTupleAccess().getNameParserRuleCall_3_1());
            	    			
            	    pushFollow(FOLLOW_77);
            	    ruleName();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    otherlv_5=(Token)match(input,54,FOLLOW_60); 

            	    				newLeafNode(otherlv_5, grammarAccess.getNamedTupleAccess().getEqualsSignGreaterThanSignKeyword_3_2());
            	    			
            	    // InternalAlf.g:5677:4: ( (lv_argument_6_0= ruleExpression ) )
            	    // InternalAlf.g:5678:5: (lv_argument_6_0= ruleExpression )
            	    {
            	    // InternalAlf.g:5678:5: (lv_argument_6_0= ruleExpression )
            	    // InternalAlf.g:5679:6: lv_argument_6_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getNamedTupleAccess().getArgumentExpressionParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_argument_6_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNamedTupleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"argument",
            	    							lv_argument_6_0,
            	    							"org.omg.sysml.Alf.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop97;
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
    // InternalAlf.g:5701:1: entryRuleSequenceConstructionExpression returns [EObject current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
    public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionExpression = null;


        try {
            // InternalAlf.g:5701:71: (iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:5702:2: iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF
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
    // InternalAlf.g:5708:1: ruleSequenceConstructionExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5714:2: ( ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalAlf.g:5715:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalAlf.g:5715:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // InternalAlf.g:5716:3: () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalAlf.g:5716:3: ()
            // InternalAlf.g:5717:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_84); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:5727:3: ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( ((LA99_0>=RULE_BOOLEAN_VALUE && LA99_0<=RULE_UNRESTRICTED_NAME)||(LA99_0>=18 && LA99_0<=19)||LA99_0==23||LA99_0==40||(LA99_0>=56 && LA99_0<=57)||(LA99_0>=69 && LA99_0<=71)) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalAlf.g:5728:4: ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:5728:4: ( (lv_element_2_0= ruleExpression ) )
                    // InternalAlf.g:5729:5: (lv_element_2_0= ruleExpression )
                    {
                    // InternalAlf.g:5729:5: (lv_element_2_0= ruleExpression )
                    // InternalAlf.g:5730:6: lv_element_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_85);
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

                    // InternalAlf.g:5747:4: (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==38) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // InternalAlf.g:5748:5: otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,38,FOLLOW_60); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:5752:5: ( (lv_element_4_0= ruleExpression ) )
                    	    // InternalAlf.g:5753:6: (lv_element_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:5753:6: (lv_element_4_0= ruleExpression )
                    	    // InternalAlf.g:5754:7: lv_element_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_85);
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
                    	    break loop98;
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
    // InternalAlf.g:5781:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // InternalAlf.g:5781:55: (iv_ruleNullExpression= ruleNullExpression EOF )
            // InternalAlf.g:5782:2: iv_ruleNullExpression= ruleNullExpression EOF
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
    // InternalAlf.g:5788:1: ruleNullExpression returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlf.g:5794:2: ( ( () otherlv_1= 'null' ) )
            // InternalAlf.g:5795:2: ( () otherlv_1= 'null' )
            {
            // InternalAlf.g:5795:2: ( () otherlv_1= 'null' )
            // InternalAlf.g:5796:3: () otherlv_1= 'null'
            {
            // InternalAlf.g:5796:3: ()
            // InternalAlf.g:5797:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullExpressionAccess().getLiteralNullAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,71,FOLLOW_2); 

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
    // InternalAlf.g:5811:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalAlf.g:5811:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalAlf.g:5812:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalAlf.g:5818:1: ruleLiteralExpression returns [EObject current=null] : (this_BooleanLiteralExpression_0= ruleBooleanLiteralExpression | this_StringLiteralExpression_1= ruleStringLiteralExpression | this_RealLiteralExpression_2= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_3= ruleUnlimitedNaturalLiteralExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanLiteralExpression_0 = null;

        EObject this_StringLiteralExpression_1 = null;

        EObject this_RealLiteralExpression_2 = null;

        EObject this_UnlimitedNaturalLiteralExpression_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:5824:2: ( (this_BooleanLiteralExpression_0= ruleBooleanLiteralExpression | this_StringLiteralExpression_1= ruleStringLiteralExpression | this_RealLiteralExpression_2= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_3= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:5825:2: (this_BooleanLiteralExpression_0= ruleBooleanLiteralExpression | this_StringLiteralExpression_1= ruleStringLiteralExpression | this_RealLiteralExpression_2= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_3= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:5825:2: (this_BooleanLiteralExpression_0= ruleBooleanLiteralExpression | this_StringLiteralExpression_1= ruleStringLiteralExpression | this_RealLiteralExpression_2= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_3= ruleUnlimitedNaturalLiteralExpression )
            int alt100=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN_VALUE:
                {
                alt100=1;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt100=2;
                }
                break;
            case RULE_NATURAL_VALUE:
                {
                int LA100_3 = input.LA(2);

                if ( (LA100_3==EOF||(LA100_3>=19 && LA100_3<=20)||(LA100_3>=23 && LA100_3<=24)||LA100_3==38||LA100_3==41||LA100_3==49||LA100_3==51||(LA100_3>=55 && LA100_3<=68)) ) {
                    alt100=4;
                }
                else if ( (LA100_3==18) ) {
                    alt100=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_EXP_VALUE:
            case 18:
                {
                alt100=3;
                }
                break;
            case 19:
                {
                alt100=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // InternalAlf.g:5826:3: this_BooleanLiteralExpression_0= ruleBooleanLiteralExpression
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
                    // InternalAlf.g:5835:3: this_StringLiteralExpression_1= ruleStringLiteralExpression
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
                    // InternalAlf.g:5844:3: this_RealLiteralExpression_2= ruleRealLiteralExpression
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
                    // InternalAlf.g:5853:3: this_UnlimitedNaturalLiteralExpression_3= ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:5865:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // InternalAlf.g:5865:65: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:5866:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
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
    // InternalAlf.g:5872:1: ruleBooleanLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:5878:2: ( ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) )
            // InternalAlf.g:5879:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            {
            // InternalAlf.g:5879:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:5880:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:5880:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            // InternalAlf.g:5881:4: lv_value_0_0= RULE_BOOLEAN_VALUE
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
    // InternalAlf.g:5900:1: entryRuleStringLiteralExpression returns [EObject current=null] : iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF ;
    public final EObject entryRuleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpression = null;


        try {
            // InternalAlf.g:5900:64: (iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF )
            // InternalAlf.g:5901:2: iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF
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
    // InternalAlf.g:5907:1: ruleStringLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:5913:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalAlf.g:5914:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalAlf.g:5914:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalAlf.g:5915:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalAlf.g:5915:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalAlf.g:5916:4: lv_value_0_0= RULE_STRING_VALUE
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
    // InternalAlf.g:5935:1: entryRuleRealLiteralExpression returns [EObject current=null] : iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF ;
    public final EObject entryRuleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteralExpression = null;


        try {
            // InternalAlf.g:5935:62: (iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF )
            // InternalAlf.g:5936:2: iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF
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
    // InternalAlf.g:5942:1: ruleRealLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5948:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalAlf.g:5949:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalAlf.g:5949:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalAlf.g:5950:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalAlf.g:5950:3: (lv_value_0_0= ruleRealValue )
            // InternalAlf.g:5951:4: lv_value_0_0= ruleRealValue
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
    // InternalAlf.g:5971:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalAlf.g:5971:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalAlf.g:5972:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalAlf.g:5978:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_VALUE_0=null;
        Token kw=null;
        Token this_NATURAL_VALUE_2=null;
        Token this_EXP_VALUE_3=null;
        Token this_EXP_VALUE_4=null;


        	enterRule();

        try {
            // InternalAlf.g:5984:2: ( ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) )
            // InternalAlf.g:5985:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            {
            // InternalAlf.g:5985:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==RULE_NATURAL_VALUE||LA103_0==18) ) {
                alt103=1;
            }
            else if ( (LA103_0==RULE_EXP_VALUE) ) {
                alt103=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // InternalAlf.g:5986:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    {
                    // InternalAlf.g:5986:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    // InternalAlf.g:5987:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    {
                    // InternalAlf.g:5987:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==RULE_NATURAL_VALUE) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // InternalAlf.g:5988:5: this_NATURAL_VALUE_0= RULE_NATURAL_VALUE
                            {
                            this_NATURAL_VALUE_0=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_18); 

                            					current.merge(this_NATURAL_VALUE_0);
                            				

                            					newLeafNode(this_NATURAL_VALUE_0, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,18,FOLLOW_86); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1());
                    			
                    // InternalAlf.g:6001:4: (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==RULE_NATURAL_VALUE) ) {
                        alt102=1;
                    }
                    else if ( (LA102_0==RULE_EXP_VALUE) ) {
                        alt102=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 102, 0, input);

                        throw nvae;
                    }
                    switch (alt102) {
                        case 1 :
                            // InternalAlf.g:6002:5: this_NATURAL_VALUE_2= RULE_NATURAL_VALUE
                            {
                            this_NATURAL_VALUE_2=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_2); 

                            					current.merge(this_NATURAL_VALUE_2);
                            				

                            					newLeafNode(this_NATURAL_VALUE_2, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:6010:5: this_EXP_VALUE_3= RULE_EXP_VALUE
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
                    // InternalAlf.g:6020:3: this_EXP_VALUE_4= RULE_EXP_VALUE
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
    // InternalAlf.g:6031:1: entryRuleNaturalLiteralExpression returns [EObject current=null] : iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF ;
    public final EObject entryRuleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:6031:65: (iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:6032:2: iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF
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
    // InternalAlf.g:6038:1: ruleNaturalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) ;
    public final EObject ruleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:6044:2: ( ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) )
            // InternalAlf.g:6045:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            {
            // InternalAlf.g:6045:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            // InternalAlf.g:6046:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:6046:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            // InternalAlf.g:6047:4: lv_value_0_0= RULE_NATURAL_VALUE
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
    // InternalAlf.g:6066:1: entryRuleUnlimitedNaturalLiteralExpression returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:6066:74: (iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:6067:2: iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF
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
    // InternalAlf.g:6073:1: ruleUnlimitedNaturalLiteralExpression returns [EObject current=null] : (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NaturalLiteralExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:6079:2: ( (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) )
            // InternalAlf.g:6080:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            {
            // InternalAlf.g:6080:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==RULE_NATURAL_VALUE) ) {
                alt104=1;
            }
            else if ( (LA104_0==19) ) {
                alt104=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // InternalAlf.g:6081:3: this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression
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
                    // InternalAlf.g:6090:3: ( () otherlv_2= '*' )
                    {
                    // InternalAlf.g:6090:3: ( () otherlv_2= '*' )
                    // InternalAlf.g:6091:4: () otherlv_2= '*'
                    {
                    // InternalAlf.g:6091:4: ()
                    // InternalAlf.g:6092:5: 
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


    // $ANTLR start "entryRuleName"
    // InternalAlf.g:6107:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAlf.g:6107:44: (iv_ruleName= ruleName EOF )
            // InternalAlf.g:6108:2: iv_ruleName= ruleName EOF
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
    // InternalAlf.g:6114:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalAlf.g:6120:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalAlf.g:6121:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalAlf.g:6121:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==RULE_ID) ) {
                alt105=1;
            }
            else if ( (LA105_0==RULE_UNRESTRICTED_NAME) ) {
                alt105=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // InternalAlf.g:6122:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:6130:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:6141:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlf.g:6141:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlf.g:6142:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlf.g:6148:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_ColonQualifiedName_1 = null;

        AntlrDatatypeRuleToken this_DotQualifiedName_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:6154:2: ( (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) )
            // InternalAlf.g:6155:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            {
            // InternalAlf.g:6155:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            int alt106=3;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt106=3;
                    }
                    break;
                case 17:
                    {
                    alt106=2;
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
                case 42:
                case 43:
                case 44:
                case 47:
                case 48:
                case 49:
                case 51:
                case 52:
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
                    {
                    alt106=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA106_0==RULE_UNRESTRICTED_NAME) ) {
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
                case 42:
                case 43:
                case 44:
                case 47:
                case 48:
                case 49:
                case 51:
                case 52:
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
                    {
                    alt106=1;
                    }
                    break;
                case 18:
                    {
                    alt106=3;
                    }
                    break;
                case 17:
                    {
                    alt106=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalAlf.g:6156:3: this_Name_0= ruleName
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
                    // InternalAlf.g:6167:3: this_ColonQualifiedName_1= ruleColonQualifiedName
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
                    // InternalAlf.g:6178:3: this_DotQualifiedName_2= ruleDotQualifiedName
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
    // InternalAlf.g:6192:1: entryRuleColonQualifiedName returns [String current=null] : iv_ruleColonQualifiedName= ruleColonQualifiedName EOF ;
    public final String entryRuleColonQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColonQualifiedName = null;


        try {
            // InternalAlf.g:6192:58: (iv_ruleColonQualifiedName= ruleColonQualifiedName EOF )
            // InternalAlf.g:6193:2: iv_ruleColonQualifiedName= ruleColonQualifiedName EOF
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
    // InternalAlf.g:6199:1: ruleColonQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleColonQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:6205:2: ( (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:6206:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:6206:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            // InternalAlf.g:6207:3: this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:6217:3: (kw= '::' this_Name_2= ruleName )+
            int cnt107=0;
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==17) ) {
                    int LA107_1 = input.LA(2);

                    if ( ((LA107_1>=RULE_ID && LA107_1<=RULE_UNRESTRICTED_NAME)) ) {
                        alt107=1;
                    }


                }


                switch (alt107) {
            	case 1 :
            	    // InternalAlf.g:6218:4: kw= '::' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,17,FOLLOW_13); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getColonQualifiedNameAccess().getColonColonKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_87);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt107 >= 1 ) break loop107;
                        EarlyExitException eee =
                            new EarlyExitException(107, input);
                        throw eee;
                }
                cnt107++;
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
    // InternalAlf.g:6238:1: entryRuleDotQualifiedName returns [String current=null] : iv_ruleDotQualifiedName= ruleDotQualifiedName EOF ;
    public final String entryRuleDotQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDotQualifiedName = null;


        try {
            // InternalAlf.g:6238:56: (iv_ruleDotQualifiedName= ruleDotQualifiedName EOF )
            // InternalAlf.g:6239:2: iv_ruleDotQualifiedName= ruleDotQualifiedName EOF
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
    // InternalAlf.g:6245:1: ruleDotQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleDotQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:6251:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:6252:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:6252:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            // InternalAlf.g:6253:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:6263:3: (kw= '.' this_Name_2= ruleName )+
            int cnt108=0;
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==18) ) {
                    int LA108_1 = input.LA(2);

                    if ( ((LA108_1>=RULE_ID && LA108_1<=RULE_UNRESTRICTED_NAME)) ) {
                        alt108=1;
                    }


                }


                switch (alt108) {
            	case 1 :
            	    // InternalAlf.g:6264:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,18,FOLLOW_13); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getDotQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_88);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt108 >= 1 ) break loop108;
                        EarlyExitException eee =
                            new EarlyExitException(108, input);
                        throw eee;
                }
                cnt108++;
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
    // InternalAlf.g:6284:1: rulePackageElementVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator rulePackageElementVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAlf.g:6290:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // InternalAlf.g:6291:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // InternalAlf.g:6291:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==72) ) {
                alt109=1;
            }
            else if ( (LA109_0==73) ) {
                alt109=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // InternalAlf.g:6292:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:6292:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:6293:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getPackageElementVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPackageElementVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:6300:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:6300:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:6301:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

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
    // InternalAlf.g:6311:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAlf.g:6317:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) )
            // InternalAlf.g:6318:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            {
            // InternalAlf.g:6318:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            int alt110=4;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt110=1;
                }
                break;
            case 73:
                {
                alt110=2;
                }
                break;
            case 74:
                {
                alt110=3;
                }
                break;
            case 75:
                {
                alt110=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // InternalAlf.g:6319:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:6319:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:6320:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:6327:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:6327:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:6328:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:6335:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalAlf.g:6335:3: (enumLiteral_2= 'protected' )
                    // InternalAlf.g:6336:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:6343:3: (enumLiteral_3= 'packaged' )
                    {
                    // InternalAlf.g:6343:3: (enumLiteral_3= 'packaged' )
                    // InternalAlf.g:6344:4: enumLiteral_3= 'packaged'
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_2); 

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
    // InternalAlf.g:6354:1: ruleFeatureDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFeatureDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAlf.g:6360:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalAlf.g:6361:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalAlf.g:6361:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt111=3;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt111=1;
                }
                break;
            case 77:
                {
                alt111=2;
                }
                break;
            case 78:
                {
                alt111=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // InternalAlf.g:6362:3: (enumLiteral_0= 'in' )
                    {
                    // InternalAlf.g:6362:3: (enumLiteral_0= 'in' )
                    // InternalAlf.g:6363:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:6370:3: (enumLiteral_1= 'out' )
                    {
                    // InternalAlf.g:6370:3: (enumLiteral_1= 'out' )
                    // InternalAlf.g:6371:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:6378:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalAlf.g:6378:3: (enumLiteral_2= 'inout' )
                    // InternalAlf.g:6379:4: enumLiteral_2= 'inout'
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_2); 

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
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA85 dfa85 = new DFA85(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA93 dfa93 = new DFA93(this);
    static final String dfa_1s = "\36\uffff";
    static final String dfa_2s = "\2\4\2\20\1\11\1\uffff\1\32\5\uffff\2\21\3\11\1\4\2\21\1\24\2\22\2\24\1\11\1\4\1\11\2\24";
    static final String dfa_3s = "\2\111\2\20\1\12\1\uffff\1\35\5\uffff\2\25\2\23\1\12\1\111\2\25\1\24\2\25\2\24\1\23\1\111\1\23\2\24";
    static final String dfa_4s = "\5\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\22\uffff";
    static final String dfa_5s = "\36\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\13\uffff\1\4\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\12\2\uffff\1\13\3\uffff\1\6\43\uffff\1\2\1\3",
            "\1\1\13\uffff\1\4\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\12\2\uffff\1\13\3\uffff\1\6\43\uffff\1\2\1\3",
            "\1\4",
            "\1\4",
            "\1\14\1\15",
            "",
            "\1\7\1\10\1\11\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\16\1\17\1\uffff\1\21\1\20",
            "\1\16\1\17\1\uffff\1\21\1\20",
            "\1\22\1\23\10\uffff\1\24",
            "\1\25\1\26\10\uffff\1\24",
            "\1\27\1\30",
            "\1\1\13\uffff\1\4\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\12\2\uffff\1\13\3\uffff\1\6\43\uffff\1\2\1\3",
            "\1\31\2\uffff\1\21\1\20",
            "\1\31\2\uffff\1\21\1\20",
            "\1\32",
            "\1\33\1\uffff\1\21\1\20",
            "\1\33\1\uffff\1\21\1\20",
            "\1\21",
            "\1\21",
            "\1\22\1\23\10\uffff\1\34",
            "\1\1\13\uffff\1\4\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\12\2\uffff\1\13\3\uffff\1\6\43\uffff\1\2\1\3",
            "\1\25\1\26\10\uffff\1\35",
            "\1\32",
            "\1\32"
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
            return "79:2: (this_PackageUnitDefinition_0= rulePackageUnitDefinition | this_ClassUnitDefinition_1= ruleClassUnitDefinition | this_ObjectClassUnitDefinition_2= ruleObjectClassUnitDefinition | this_ValueClassUnitDefinition_3= ruleValueClassUnitDefinition | this_AssociationUnitDefinition_4= ruleAssociationUnitDefinition | this_FeatureUnitDefinition_5= ruleFeatureUnitDefinition )";
        }
    }
    static final String dfa_7s = "\22\uffff";
    static final String dfa_8s = "\2\4\1\uffff\2\20\1\11\2\21\2\11\2\uffff\2\22\2\21\2\11";
    static final String dfa_9s = "\2\111\1\uffff\2\20\1\12\2\25\2\23\2\uffff\4\25\2\23";
    static final String dfa_10s = "\2\uffff\1\3\7\uffff\1\2\1\1\6\uffff";
    static final String dfa_11s = "\22\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\13\uffff\1\5\5\uffff\1\2\3\uffff\4\2\2\uffff\1\2\3\uffff\1\2\43\uffff\1\3\1\4",
            "\1\1\13\uffff\1\5\5\uffff\1\2\3\uffff\4\2\2\uffff\1\2\3\uffff\1\2\43\uffff\1\3\1\4",
            "",
            "\1\5",
            "\1\5",
            "\1\6\1\7",
            "\1\11\1\10\1\uffff\2\12",
            "\1\11\1\10\1\uffff\2\12",
            "\1\14\1\15\10\uffff\1\13",
            "\1\16\1\17\10\uffff\1\13",
            "",
            "",
            "\1\20\1\uffff\2\12",
            "\1\20\1\uffff\2\12",
            "\1\21\2\uffff\2\12",
            "\1\21\2\uffff\2\12",
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
            return "()* loopback of 392:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )*";
        }
    }
    static final String dfa_13s = "\1\4\1\uffff\1\4\2\11\1\uffff\1\11\2\21\2\11\2\21\1\uffff\2\22\2\11";
    static final String dfa_14s = "\1\111\1\uffff\1\111\2\44\1\uffff\1\12\2\25\2\23\2\25\1\uffff\2\25\2\23";
    static final String dfa_15s = "\1\uffff\1\3\3\uffff\1\1\7\uffff\1\2\4\uffff";
    static final String[] dfa_16s = {
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\1\uffff\1\1\1\uffff\7\5\3\uffff\1\5\43\uffff\1\3\1\4",
            "",
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\7\5\3\uffff\1\5\43\uffff\1\3\1\4",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\7\5\3\uffff\1\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\7\5\3\uffff\1\5",
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
            return "()* loopback of 905:3: ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_17s = "\37\uffff";
    static final String dfa_18s = "\1\20\1\11\1\uffff\6\11\1\uffff\2\27\1\uffff\2\24\1\uffff\2\24\1\uffff\2\24\1\uffff\2\24\1\uffff\2\31\1\uffff\2\31\1\uffff";
    static final String dfa_19s = "\1\44\1\31\1\uffff\6\31\1\uffff\2\31\1\uffff\2\45\1\uffff\2\45\1\uffff\2\45\1\uffff\2\45\1\uffff\2\50\1\uffff\2\50\1\uffff";
    static final String dfa_20s = "\2\uffff\1\1\6\uffff\1\11\2\uffff\1\2\2\uffff\1\3\2\uffff\1\4\2\uffff\1\5\2\uffff\1\6\2\uffff\1\7\2\uffff\1\10";
    static final String dfa_21s = "\37\uffff}>";
    static final String[] dfa_22s = {
            "\1\11\5\uffff\1\1\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\4\uffff\1\2",
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
            return "1068:2: ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) | (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' ) | (otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';' ) | (otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';' ) | (otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';' ) )";
        }
    }
    static final String dfa_23s = "\1\4\1\uffff\1\4\2\11\1\uffff\1\11\2\21\2\11\1\uffff\2\21\2\22\2\11";
    static final String dfa_24s = "\1\116\1\uffff\3\116\1\uffff\1\12\2\25\2\23\1\uffff\4\25\2\23";
    static final String dfa_25s = "\1\uffff\1\3\3\uffff\1\1\5\uffff\1\2\6\uffff";
    static final String[] dfa_26s = {
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\1\uffff\1\1\1\uffff\13\5\43\uffff\1\3\1\4\5\5",
            "",
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\43\uffff\1\3\1\4\5\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\47\uffff\3\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\47\uffff\3\5",
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
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_11;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "()* loopback of 1653:4: ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_27s = "\10\uffff";
    static final String dfa_28s = "\2\4\4\11\2\uffff";
    static final String dfa_29s = "\6\116\2\uffff";
    static final String dfa_30s = "\6\uffff\1\1\1\2";
    static final String dfa_31s = "\10\uffff}>";
    static final String[] dfa_32s = {
            "\1\1\4\uffff\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\4\7\1\6\43\uffff\1\2\1\3\1\4\1\5\3\7",
            "\1\1\4\uffff\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\4\7\1\6\43\uffff\1\2\1\3\1\4\1\5\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\4\7\1\6\47\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\4\7\1\6\47\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\4\7\1\6\47\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\4\7\1\6\47\uffff\3\7",
            "",
            ""
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "1717:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember )";
        }
    }
    static final String dfa_33s = "\16\uffff";
    static final String dfa_34s = "\1\11\2\21\1\uffff\1\11\2\21\2\11\1\uffff\2\21\2\22";
    static final String dfa_35s = "\1\54\2\66\1\uffff\1\12\2\66\2\12\1\uffff\4\66";
    static final String dfa_36s = "\3\uffff\1\1\5\uffff\1\2\4\uffff";
    static final String dfa_37s = "\16\uffff}>";
    static final String[] dfa_38s = {
            "\1\1\1\2\16\uffff\1\4\16\uffff\1\3\3\uffff\1\3",
            "\2\3\6\uffff\1\4\16\uffff\1\3\3\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "\2\3\6\uffff\1\4\16\uffff\1\3\3\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "",
            "\1\5\1\6",
            "\1\7\1\10\1\uffff\1\11\27\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "\1\7\1\10\1\uffff\1\11\27\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "\1\12\1\13",
            "\1\14\1\15",
            "",
            "\1\7\2\uffff\1\11\27\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "\1\7\2\uffff\1\11\27\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "\1\10\1\uffff\1\11\27\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "\1\10\1\uffff\1\11\27\uffff\1\3\4\uffff\1\3\3\uffff\2\3"
    };

    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_33;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "2119:4: ( ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) )";
        }
    }
    static final String dfa_39s = "\1\4\1\uffff\1\4\2\11\1\uffff\1\11\2\21\2\11\2\22\1\uffff\2\21\2\11";
    static final String dfa_40s = "\1\116\1\uffff\3\116\1\uffff\1\12\2\25\2\23\2\25\1\uffff\2\25\2\23";
    static final String[] dfa_41s = {
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\1\uffff\1\1\1\uffff\13\5\2\uffff\1\5\40\uffff\1\3\1\4\5\5",
            "",
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\2\uffff\1\5\40\uffff\1\3\1\4\5\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\2\uffff\1\5\44\uffff\3\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\2\uffff\1\5\44\uffff\3\5",
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
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[][] dfa_41 = unpackEncodedStringArray(dfa_41s);

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_41;
        }
        public String getDescription() {
            return "()* loopback of 2769:4: ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_42s = "\11\uffff";
    static final String dfa_43s = "\2\4\4\11\3\uffff";
    static final String dfa_44s = "\6\116\3\uffff";
    static final String dfa_45s = "\6\uffff\1\1\1\2\1\3";
    static final String dfa_46s = "\11\uffff}>";
    static final String[] dfa_47s = {
            "\1\1\4\uffff\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\4\7\1\6\2\uffff\1\10\40\uffff\1\2\1\3\1\4\1\5\3\10",
            "\1\1\4\uffff\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\4\7\1\6\2\uffff\1\10\40\uffff\1\2\1\3\1\4\1\5\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\4\7\1\6\2\uffff\1\10\44\uffff\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\4\7\1\6\2\uffff\1\10\44\uffff\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\4\7\1\6\2\uffff\1\10\44\uffff\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\4\7\1\6\2\uffff\1\10\44\uffff\3\10",
            "",
            "",
            ""
    };

    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[][] dfa_47 = unpackEncodedStringArray(dfa_47s);

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_42;
            this.eof = dfa_42;
            this.min = dfa_43;
            this.max = dfa_44;
            this.accept = dfa_45;
            this.special = dfa_46;
            this.transition = dfa_47;
        }
        public String getDescription() {
            return "2833:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )";
        }
    }
    static final String dfa_48s = "\13\uffff";
    static final String dfa_49s = "\2\11\1\uffff\2\24\1\11\2\uffff\2\24\1\uffff";
    static final String dfa_50s = "\2\116\1\uffff\2\64\1\116\2\uffff\2\64\1\uffff";
    static final String dfa_51s = "\2\uffff\1\3\3\uffff\1\1\1\4\2\uffff\1\2";
    static final String dfa_52s = "\13\uffff}>";
    static final String[] dfa_53s = {
            "\1\3\1\4\34\uffff\1\1\44\uffff\3\2",
            "\2\6\26\uffff\1\5\1\6\7\uffff\1\6\41\uffff\3\6",
            "",
            "\1\2\2\uffff\1\2\1\uffff\1\7\20\uffff\3\2\2\uffff\3\2\2\uffff\1\2",
            "\1\2\2\uffff\1\2\1\uffff\1\7\20\uffff\3\2\2\uffff\3\2\2\uffff\1\2",
            "\1\10\1\11\16\uffff\1\12\20\uffff\1\6\41\uffff\3\6",
            "",
            "",
            "\1\6\2\uffff\1\6\1\uffff\1\12\20\uffff\3\6\2\uffff\3\6\2\uffff\1\6",
            "\1\6\2\uffff\1\6\1\uffff\1\12\20\uffff\3\6\2\uffff\3\6\2\uffff\1\6",
            ""
    };

    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final char[] dfa_50 = DFA.unpackEncodedStringToUnsignedChars(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[][] dfa_53 = unpackEncodedStringArray(dfa_53s);

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_48;
            this.eof = dfa_48;
            this.min = dfa_49;
            this.max = dfa_50;
            this.accept = dfa_51;
            this.special = dfa_52;
            this.transition = dfa_53;
        }
        public String getDescription() {
            return "2931:3: ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )";
        }
    }
    static final String dfa_54s = "\27\uffff";
    static final String dfa_55s = "\1\11\2\21\1\11\2\uffff\1\11\4\21\4\11\2\22\4\21\2\22";
    static final String dfa_56s = "\1\54\2\66\1\12\2\uffff\1\12\2\50\2\65\4\12\4\50\4\65";
    static final String dfa_57s = "\4\uffff\1\1\1\2\21\uffff";
    static final String dfa_58s = "\27\uffff}>";
    static final String[] dfa_59s = {
            "\1\1\1\2\16\uffff\1\4\16\uffff\1\5\3\uffff\1\3",
            "\2\4\6\uffff\1\4\16\uffff\1\5\3\uffff\1\6\4\uffff\1\4\3\uffff\2\4",
            "\2\4\6\uffff\1\4\16\uffff\1\5\3\uffff\1\6\4\uffff\1\4\3\uffff\2\4",
            "\1\7\1\10",
            "",
            "",
            "\1\11\1\12",
            "\1\14\1\13\6\uffff\1\4\16\uffff\1\5",
            "\1\14\1\13\6\uffff\1\4\16\uffff\1\5",
            "\1\15\1\16\6\uffff\1\4\16\uffff\1\5\10\uffff\1\4\3\uffff\1\4",
            "\1\15\1\16\6\uffff\1\4\16\uffff\1\5\10\uffff\1\4\3\uffff\1\4",
            "\1\17\1\20",
            "\1\21\1\22",
            "\1\23\1\24",
            "\1\25\1\26",
            "\1\13\6\uffff\1\4\16\uffff\1\5",
            "\1\13\6\uffff\1\4\16\uffff\1\5",
            "\1\14\7\uffff\1\4\16\uffff\1\5",
            "\1\14\7\uffff\1\4\16\uffff\1\5",
            "\1\15\7\uffff\1\4\16\uffff\1\5\10\uffff\1\4\3\uffff\1\4",
            "\1\15\7\uffff\1\4\16\uffff\1\5\10\uffff\1\4\3\uffff\1\4",
            "\1\16\6\uffff\1\4\16\uffff\1\5\10\uffff\1\4\3\uffff\1\4",
            "\1\16\6\uffff\1\4\16\uffff\1\5\10\uffff\1\4\3\uffff\1\4"
    };

    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final char[] dfa_56 = DFA.unpackEncodedStringToUnsignedChars(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final short[][] dfa_59 = unpackEncodedStringArray(dfa_59s);

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = dfa_54;
            this.eof = dfa_54;
            this.min = dfa_55;
            this.max = dfa_56;
            this.accept = dfa_57;
            this.special = dfa_58;
            this.transition = dfa_59;
        }
        public String getDescription() {
            return "4424:3: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) )";
        }
    }
    static final String dfa_60s = "\1\11\2\21\2\uffff\1\11\2\21\2\11\2\22\2\21";
    static final String dfa_61s = "\1\54\2\66\2\uffff\1\12\2\65\2\12\4\65";
    static final String dfa_62s = "\3\uffff\1\1\1\2\11\uffff";
    static final String[] dfa_63s = {
            "\1\1\1\2\16\uffff\1\3\22\uffff\1\3",
            "\2\4\6\uffff\1\3\22\uffff\1\5\4\uffff\1\4\3\uffff\2\4",
            "\2\4\6\uffff\1\3\22\uffff\1\5\4\uffff\1\4\3\uffff\2\4",
            "",
            "",
            "\1\6\1\7",
            "\1\11\1\10\6\uffff\1\3\27\uffff\1\4\3\uffff\1\4",
            "\1\11\1\10\6\uffff\1\3\27\uffff\1\4\3\uffff\1\4",
            "\1\12\1\13",
            "\1\14\1\15",
            "\1\10\6\uffff\1\3\27\uffff\1\4\3\uffff\1\4",
            "\1\10\6\uffff\1\3\27\uffff\1\4\3\uffff\1\4",
            "\1\11\7\uffff\1\3\27\uffff\1\4\3\uffff\1\4",
            "\1\11\7\uffff\1\3\27\uffff\1\4\3\uffff\1\4"
    };
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final char[] dfa_61 = DFA.unpackEncodedStringToUnsignedChars(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final short[][] dfa_63 = unpackEncodedStringArray(dfa_63s);

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = dfa_33;
            this.eof = dfa_33;
            this.min = dfa_60;
            this.max = dfa_61;
            this.accept = dfa_62;
            this.special = dfa_37;
            this.transition = dfa_63;
        }
        public String getDescription() {
            return "4426:5: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )?";
        }
    }
    static final String dfa_64s = "\21\uffff";
    static final String dfa_65s = "\1\uffff\2\4\7\uffff\4\4\1\uffff\1\4\1\uffff";
    static final String dfa_66s = "\1\11\2\21\1\7\1\uffff\2\11\1\uffff\1\62\1\63\2\22\2\21\1\7\1\24\1\63";
    static final String dfa_67s = "\1\12\2\66\1\23\1\uffff\2\12\1\uffff\2\63\4\66\1\23\1\66\1\63";
    static final String dfa_68s = "\4\uffff\1\1\2\uffff\1\2\11\uffff";
    static final String dfa_69s = "\21\uffff}>";
    static final String[] dfa_70s = {
            "\1\1\1\2",
            "\1\6\1\5\1\uffff\1\4\2\uffff\1\4\16\uffff\1\4\2\uffff\1\4\2\uffff\1\4\4\uffff\1\3\3\uffff\1\4\1\7",
            "\1\6\1\5\1\uffff\1\4\2\uffff\1\4\16\uffff\1\4\2\uffff\1\4\2\uffff\1\4\4\uffff\1\3\3\uffff\1\4\1\7",
            "\1\10\13\uffff\1\11",
            "",
            "\1\12\1\13",
            "\1\14\1\15",
            "",
            "\1\16\1\17",
            "\1\17",
            "\1\5\1\uffff\1\4\2\uffff\1\4\16\uffff\1\4\2\uffff\1\4\2\uffff\1\4\4\uffff\1\3\3\uffff\1\4\1\7",
            "\1\5\1\uffff\1\4\2\uffff\1\4\16\uffff\1\4\2\uffff\1\4\2\uffff\1\4\4\uffff\1\3\3\uffff\1\4\1\7",
            "\1\6\2\uffff\1\4\2\uffff\1\4\16\uffff\1\4\2\uffff\1\4\2\uffff\1\4\4\uffff\1\3\3\uffff\1\4\1\7",
            "\1\6\2\uffff\1\4\2\uffff\1\4\16\uffff\1\4\2\uffff\1\4\2\uffff\1\4\4\uffff\1\3\3\uffff\1\4\1\7",
            "\1\20\13\uffff\1\11",
            "\1\4\2\uffff\1\4\16\uffff\1\4\2\uffff\1\4\13\uffff\1\4\1\7",
            "\1\17"
    };

    static final short[] dfa_64 = DFA.unpackEncodedString(dfa_64s);
    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final char[] dfa_66 = DFA.unpackEncodedStringToUnsignedChars(dfa_66s);
    static final char[] dfa_67 = DFA.unpackEncodedStringToUnsignedChars(dfa_67s);
    static final short[] dfa_68 = DFA.unpackEncodedString(dfa_68s);
    static final short[] dfa_69 = DFA.unpackEncodedString(dfa_69s);
    static final short[][] dfa_70 = unpackEncodedStringArray(dfa_70s);

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = dfa_64;
            this.eof = dfa_65;
            this.min = dfa_66;
            this.max = dfa_67;
            this.accept = dfa_68;
            this.special = dfa_69;
            this.transition = dfa_70;
        }
        public String getDescription() {
            return "4704:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )";
        }
    }
    static final String dfa_71s = "\1\uffff\2\3\4\uffff\4\3";
    static final String dfa_72s = "\1\11\2\21\1\uffff\2\11\1\uffff\2\22\2\21";
    static final String dfa_73s = "\1\12\2\65\1\uffff\2\12\1\uffff\4\65";
    static final String dfa_74s = "\3\uffff\1\2\2\uffff\1\1\4\uffff";
    static final String[] dfa_75s = {
            "\1\1\1\2",
            "\1\5\1\4\1\uffff\1\3\2\uffff\1\3\16\uffff\1\3\2\uffff\1\3\2\uffff\1\6\4\uffff\1\3\3\uffff\1\3",
            "\1\5\1\4\1\uffff\1\3\2\uffff\1\3\16\uffff\1\3\2\uffff\1\3\2\uffff\1\6\4\uffff\1\3\3\uffff\1\3",
            "",
            "\1\7\1\10",
            "\1\11\1\12",
            "",
            "\1\4\1\uffff\1\3\2\uffff\1\3\16\uffff\1\3\2\uffff\1\3\2\uffff\1\6\4\uffff\1\3\3\uffff\1\3",
            "\1\4\1\uffff\1\3\2\uffff\1\3\16\uffff\1\3\2\uffff\1\3\2\uffff\1\6\4\uffff\1\3\3\uffff\1\3",
            "\1\5\2\uffff\1\3\2\uffff\1\3\16\uffff\1\3\2\uffff\1\3\2\uffff\1\6\4\uffff\1\3\3\uffff\1\3",
            "\1\5\2\uffff\1\3\2\uffff\1\3\16\uffff\1\3\2\uffff\1\3\2\uffff\1\6\4\uffff\1\3\3\uffff\1\3"
    };
    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final char[] dfa_72 = DFA.unpackEncodedStringToUnsignedChars(dfa_72s);
    static final char[] dfa_73 = DFA.unpackEncodedStringToUnsignedChars(dfa_73s);
    static final short[] dfa_74 = DFA.unpackEncodedString(dfa_74s);
    static final short[][] dfa_75 = unpackEncodedStringArray(dfa_75s);

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = dfa_48;
            this.eof = dfa_71;
            this.min = dfa_72;
            this.max = dfa_73;
            this.accept = dfa_74;
            this.special = dfa_52;
            this.transition = dfa_75;
        }
        public String getDescription() {
            return "4706:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )?";
        }
    }
    static final String dfa_76s = "\17\uffff";
    static final String dfa_77s = "\3\uffff\2\10\6\uffff\4\10";
    static final String dfa_78s = "\1\5\2\uffff\2\21\2\uffff\1\11\1\uffff\1\11\1\uffff\2\21\2\22";
    static final String dfa_79s = "\1\107\2\uffff\2\104\2\uffff\1\12\1\uffff\1\12\1\uffff\4\104";
    static final String dfa_80s = "\1\uffff\1\1\1\2\2\uffff\1\5\1\6\1\uffff\1\3\1\uffff\1\4\4\uffff";
    static final String dfa_81s = "\17\uffff}>";
    static final String[] dfa_82s = {
            "\4\2\1\3\1\4\7\uffff\2\2\3\uffff\1\5\20\uffff\1\6\36\uffff\1\1",
            "",
            "",
            "\1\7\1\11\2\10\2\uffff\2\10\15\uffff\1\10\1\uffff\1\12\1\10\7\uffff\1\10\1\uffff\1\10\3\uffff\16\10",
            "\1\7\1\11\2\10\2\uffff\2\10\15\uffff\1\10\1\uffff\1\12\1\10\7\uffff\1\10\1\uffff\1\10\3\uffff\16\10",
            "",
            "",
            "\1\13\1\14",
            "",
            "\1\15\1\16",
            "",
            "\1\7\1\uffff\2\10\2\uffff\2\10\15\uffff\1\10\1\uffff\1\12\1\10\7\uffff\1\10\1\uffff\1\10\3\uffff\16\10",
            "\1\7\1\uffff\2\10\2\uffff\2\10\15\uffff\1\10\1\uffff\1\12\1\10\7\uffff\1\10\1\uffff\1\10\3\uffff\16\10",
            "\1\11\2\10\2\uffff\2\10\15\uffff\1\10\1\uffff\1\12\1\10\7\uffff\1\10\1\uffff\1\10\3\uffff\16\10",
            "\1\11\2\10\2\uffff\2\10\15\uffff\1\10\1\uffff\1\12\1\10\7\uffff\1\10\1\uffff\1\10\3\uffff\16\10"
    };

    static final short[] dfa_76 = DFA.unpackEncodedString(dfa_76s);
    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final char[] dfa_78 = DFA.unpackEncodedStringToUnsignedChars(dfa_78s);
    static final char[] dfa_79 = DFA.unpackEncodedStringToUnsignedChars(dfa_79s);
    static final short[] dfa_80 = DFA.unpackEncodedString(dfa_80s);
    static final short[] dfa_81 = DFA.unpackEncodedString(dfa_81s);
    static final short[][] dfa_82 = unpackEncodedStringArray(dfa_82s);

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = dfa_76;
            this.eof = dfa_77;
            this.min = dfa_78;
            this.max = dfa_79;
            this.accept = dfa_80;
            this.special = dfa_81;
            this.transition = dfa_82;
        }
        public String getDescription() {
            return "5336:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_InstanceCreationExpression_3= ruleInstanceCreationExpression | this_SequenceConstructionExpression_4= ruleSequenceConstructionExpression | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001008000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001010000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010012L,0x0000000000000300L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010010L,0x0000000000000300L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000011FD410610L,0x0000000000000300L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000011FC410610L,0x0000000000000300L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000300L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000600L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000600L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001FFD410610L,0x0000000000007F00L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000010FC410000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000F00000600L,0x0000000000007000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000F00L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040102000600L,0x0000000000007000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040102000600L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000110002000600L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000009FFD410610L,0x0000000000007F00L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008100000600L,0x0000000000007000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040700000600L,0x0000000000007000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000040100000600L,0x0000000000007000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000040100000600L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000020000000600L,0x0000000000007000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000600L,0x0000000000007000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0013940000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0013940000000600L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000080000900000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0003980000900000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0010040000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x03000100008C07E0L,0x00000000000000E0L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000600000000600L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000400000000600L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0003800000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x00000000000C01E0L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0010044000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000100002000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000100002000600L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0042000000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0010040000000002L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0xFF80000000080002L,0x000000000000001FL});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x00000100008C07E0L,0x0000000000000080L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x03000300008C07E0L,0x00000000000000E0L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x03000100018C07E0L,0x00000000000000E0L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000004001000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000040002L});

}
