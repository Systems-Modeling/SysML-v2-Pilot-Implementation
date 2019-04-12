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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOCUMENTATION_COMMENT", "RULE_BOOLEAN_VALUE", "RULE_STRING_VALUE", "RULE_NATURAL_VALUE", "RULE_EXP_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'import'", "'::'", "'.'", "'*'", "';'", "'as'", "'package'", "'{'", "'}'", "'is'", "'Class'", "'class'", "'datatype'", "'assoc'", "'behavior'", "'function'", "'feature'", "'abstract'", "'part'", "'port'", "'connector'", "'specializes'", "','", "'end'", "'('", "')'", "'redefines'", "'='", "':'", "'compose'", "'any'", "'ordered'", "'nonunique'", "'['", "'..'", "']'", "'subsets'", "'to'", "'=>'", "'|'", "'^'", "'&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'/'", "'**'", "'@'", "'!'", "'~'", "'null'", "'public'", "'private'", "'protected'", "'packaged'", "'in'", "'out'", "'inout'"
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
    // InternalAlf.g:384:1: ruleUnitPrefix[EObject in_current] returns [EObject current=in_current] : ( ( ( (lv_ownedRelationship_0_0= rulePackageImport ) ) | ( (lv_ownedRelationship_1_0= ruleElementImport ) ) )* ( (lv_ownedRelationship_2_0= ruleAnnotation ) )* ) ;
    public final EObject ruleUnitPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_1_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:390:2: ( ( ( ( (lv_ownedRelationship_0_0= rulePackageImport ) ) | ( (lv_ownedRelationship_1_0= ruleElementImport ) ) )* ( (lv_ownedRelationship_2_0= ruleAnnotation ) )* ) )
            // InternalAlf.g:391:2: ( ( ( (lv_ownedRelationship_0_0= rulePackageImport ) ) | ( (lv_ownedRelationship_1_0= ruleElementImport ) ) )* ( (lv_ownedRelationship_2_0= ruleAnnotation ) )* )
            {
            // InternalAlf.g:391:2: ( ( ( (lv_ownedRelationship_0_0= rulePackageImport ) ) | ( (lv_ownedRelationship_1_0= ruleElementImport ) ) )* ( (lv_ownedRelationship_2_0= ruleAnnotation ) )* )
            // InternalAlf.g:392:3: ( ( (lv_ownedRelationship_0_0= rulePackageImport ) ) | ( (lv_ownedRelationship_1_0= ruleElementImport ) ) )* ( (lv_ownedRelationship_2_0= ruleAnnotation ) )*
            {
            // InternalAlf.g:392:3: ( ( (lv_ownedRelationship_0_0= rulePackageImport ) ) | ( (lv_ownedRelationship_1_0= ruleElementImport ) ) )*
            loop2:
            do {
                int alt2=3;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalAlf.g:393:4: ( (lv_ownedRelationship_0_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:393:4: ( (lv_ownedRelationship_0_0= rulePackageImport ) )
            	    // InternalAlf.g:394:5: (lv_ownedRelationship_0_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:394:5: (lv_ownedRelationship_0_0= rulePackageImport )
            	    // InternalAlf.g:395:6: lv_ownedRelationship_0_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getUnitPrefixAccess().getOwnedRelationshipPackageImportParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
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
            	    // InternalAlf.g:413:4: ( (lv_ownedRelationship_1_0= ruleElementImport ) )
            	    {
            	    // InternalAlf.g:413:4: ( (lv_ownedRelationship_1_0= ruleElementImport ) )
            	    // InternalAlf.g:414:5: (lv_ownedRelationship_1_0= ruleElementImport )
            	    {
            	    // InternalAlf.g:414:5: (lv_ownedRelationship_1_0= ruleElementImport )
            	    // InternalAlf.g:415:6: lv_ownedRelationship_1_0= ruleElementImport
            	    {

            	    						newCompositeNode(grammarAccess.getUnitPrefixAccess().getOwnedRelationshipElementImportParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
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
            case 33:
                {
                switch ( input.LA(2) ) {
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
    // InternalAlf.g:870:1: rulePackageDefinition[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedRelationship_3_0= rulePackageMember ) ) | ( (lv_ownedRelationship_4_0= rulePackageImport ) ) )* otherlv_5= '}' ) ;
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
            // InternalAlf.g:876:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedRelationship_3_0= rulePackageMember ) ) | ( (lv_ownedRelationship_4_0= rulePackageImport ) ) )* otherlv_5= '}' ) )
            // InternalAlf.g:877:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedRelationship_3_0= rulePackageMember ) ) | ( (lv_ownedRelationship_4_0= rulePackageImport ) ) )* otherlv_5= '}' )
            {
            // InternalAlf.g:877:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedRelationship_3_0= rulePackageMember ) ) | ( (lv_ownedRelationship_4_0= rulePackageImport ) ) )* otherlv_5= '}' )
            // InternalAlf.g:878:3: otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedRelationship_3_0= rulePackageMember ) ) | ( (lv_ownedRelationship_4_0= rulePackageImport ) ) )* otherlv_5= '}'
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
            		
            // InternalAlf.g:905:3: ( ( (lv_ownedRelationship_3_0= rulePackageMember ) ) | ( (lv_ownedRelationship_4_0= rulePackageImport ) ) )*
            loop10:
            do {
                int alt10=3;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalAlf.g:906:4: ( (lv_ownedRelationship_3_0= rulePackageMember ) )
            	    {
            	    // InternalAlf.g:906:4: ( (lv_ownedRelationship_3_0= rulePackageMember ) )
            	    // InternalAlf.g:907:5: (lv_ownedRelationship_3_0= rulePackageMember )
            	    {
            	    // InternalAlf.g:907:5: (lv_ownedRelationship_3_0= rulePackageMember )
            	    // InternalAlf.g:908:6: lv_ownedRelationship_3_0= rulePackageMember
            	    {

            	    						newCompositeNode(grammarAccess.getPackageDefinitionAccess().getOwnedRelationshipPackageMemberParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
            	    // InternalAlf.g:926:4: ( (lv_ownedRelationship_4_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:926:4: ( (lv_ownedRelationship_4_0= rulePackageImport ) )
            	    // InternalAlf.g:927:5: (lv_ownedRelationship_4_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:927:5: (lv_ownedRelationship_4_0= rulePackageImport )
            	    // InternalAlf.g:928:6: lv_ownedRelationship_4_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getPackageDefinitionAccess().getOwnedRelationshipPackageImportParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
    // InternalAlf.g:1061:1: ruleNonFeatureMemberElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelatedElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) | (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' ) | (otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';' ) | (otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';' ) | (otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';' ) ) ;
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
            // InternalAlf.g:1067:2: ( ( ( (lv_ownedRelatedElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) | (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' ) | (otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';' ) | (otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';' ) | (otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';' ) ) )
            // InternalAlf.g:1068:2: ( ( (lv_ownedRelatedElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) | (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' ) | (otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';' ) | (otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';' ) | (otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';' ) )
            {
            // InternalAlf.g:1068:2: ( ( (lv_ownedRelatedElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) | (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' ) | (otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';' ) | (otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';' ) | (otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';' ) )
            int alt22=9;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalAlf.g:1069:3: ( (lv_ownedRelatedElement_0_0= ruleNonFeatureDefinition ) )
                    {
                    // InternalAlf.g:1069:3: ( (lv_ownedRelatedElement_0_0= ruleNonFeatureDefinition ) )
                    // InternalAlf.g:1070:4: (lv_ownedRelatedElement_0_0= ruleNonFeatureDefinition )
                    {
                    // InternalAlf.g:1070:4: (lv_ownedRelatedElement_0_0= ruleNonFeatureDefinition )
                    // InternalAlf.g:1071:5: lv_ownedRelatedElement_0_0= ruleNonFeatureDefinition
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
    // InternalAlf.g:1495:1: ruleFeaturePackageMemberElement[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= 'feature' )? ( (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'abstract' (otherlv_3= 'feature' )? ( (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition ) ) ) | (otherlv_5= 'feature' ( (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_7= 'abstract' otherlv_8= 'feature' ( (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? ) | ( (lv_memberName_12_0= ruleName ) ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) ) ;
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
            // InternalAlf.g:1501:2: ( ( ( (otherlv_0= 'feature' )? ( (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'abstract' (otherlv_3= 'feature' )? ( (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition ) ) ) | (otherlv_5= 'feature' ( (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_7= 'abstract' otherlv_8= 'feature' ( (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? ) | ( (lv_memberName_12_0= ruleName ) ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) ) )
            // InternalAlf.g:1502:2: ( ( (otherlv_0= 'feature' )? ( (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'abstract' (otherlv_3= 'feature' )? ( (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition ) ) ) | (otherlv_5= 'feature' ( (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_7= 'abstract' otherlv_8= 'feature' ( (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? ) | ( (lv_memberName_12_0= ruleName ) ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) )
            {
            // InternalAlf.g:1502:2: ( ( (otherlv_0= 'feature' )? ( (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'abstract' (otherlv_3= 'feature' )? ( (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition ) ) ) | (otherlv_5= 'feature' ( (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_7= 'abstract' otherlv_8= 'feature' ( (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? ) | ( (lv_memberName_12_0= ruleName ) ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) )
            int alt27=5;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalAlf.g:1503:3: ( (otherlv_0= 'feature' )? ( (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1503:3: ( (otherlv_0= 'feature' )? ( (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1504:4: (otherlv_0= 'feature' )? ( (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition ) )
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

                    // InternalAlf.g:1510:4: ( (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1511:5: (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1511:5: (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1512:6: lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:1531:3: (otherlv_2= 'abstract' (otherlv_3= 'feature' )? ( (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1531:3: (otherlv_2= 'abstract' (otherlv_3= 'feature' )? ( (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1532:4: otherlv_2= 'abstract' (otherlv_3= 'feature' )? ( (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getFeaturePackageMemberElementAccess().getAbstractKeyword_1_0());
                    			
                    // InternalAlf.g:1536:4: (otherlv_3= 'feature' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==32) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalAlf.g:1537:5: otherlv_3= 'feature'
                            {
                            otherlv_3=(Token)match(input,32,FOLLOW_26); 

                            					newLeafNode(otherlv_3, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_1_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1542:4: ( (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition ) )
                    // InternalAlf.g:1543:5: (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1543:5: (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition )
                    // InternalAlf.g:1544:6: lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition
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
                    // InternalAlf.g:1563:3: (otherlv_5= 'feature' ( (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1563:3: (otherlv_5= 'feature' ( (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:1564:4: otherlv_5= 'feature' ( (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_27); 

                    				newLeafNode(otherlv_5, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_2_0());
                    			
                    // InternalAlf.g:1568:4: ( (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:1569:5: (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:1569:5: (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:1570:6: lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition
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
                    // InternalAlf.g:1589:3: (otherlv_7= 'abstract' otherlv_8= 'feature' ( (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1589:3: (otherlv_7= 'abstract' otherlv_8= 'feature' ( (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:1590:4: otherlv_7= 'abstract' otherlv_8= 'feature' ( (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_28); 

                    				newLeafNode(otherlv_7, grammarAccess.getFeaturePackageMemberElementAccess().getAbstractKeyword_3_0());
                    			
                    otherlv_8=(Token)match(input,32,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_3_1());
                    			
                    // InternalAlf.g:1598:4: ( (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition ) )
                    // InternalAlf.g:1599:5: (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:1599:5: (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition )
                    // InternalAlf.g:1600:6: lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition
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
                    // InternalAlf.g:1619:3: ( ( (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? ) | ( (lv_memberName_12_0= ruleName ) ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' )
                    {
                    // InternalAlf.g:1619:3: ( ( (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? ) | ( (lv_memberName_12_0= ruleName ) ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' )
                    // InternalAlf.g:1620:4: ( (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? ) | ( (lv_memberName_12_0= ruleName ) ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';'
                    {
                    // InternalAlf.g:1620:4: ( (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? ) | ( (lv_memberName_12_0= ruleName ) ) )
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
                            // InternalAlf.g:1621:5: (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? )
                            {
                            // InternalAlf.g:1621:5: (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? )
                            // InternalAlf.g:1622:6: otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )?
                            {
                            otherlv_10=(Token)match(input,32,FOLLOW_24); 

                            						newLeafNode(otherlv_10, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_4_0_0_0());
                            					
                            // InternalAlf.g:1626:6: ( (lv_memberName_11_0= ruleName ) )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // InternalAlf.g:1627:7: (lv_memberName_11_0= ruleName )
                                    {
                                    // InternalAlf.g:1627:7: (lv_memberName_11_0= ruleName )
                                    // InternalAlf.g:1628:8: lv_memberName_11_0= ruleName
                                    {

                                    								newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getMemberNameNameParserRuleCall_4_0_0_1_0());
                                    							
                                    pushFollow(FOLLOW_25);
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
                            // InternalAlf.g:1647:5: ( (lv_memberName_12_0= ruleName ) )
                            {
                            // InternalAlf.g:1647:5: ( (lv_memberName_12_0= ruleName ) )
                            // InternalAlf.g:1648:6: (lv_memberName_12_0= ruleName )
                            {
                            // InternalAlf.g:1648:6: (lv_memberName_12_0= ruleName )
                            // InternalAlf.g:1649:7: lv_memberName_12_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getMemberNameNameParserRuleCall_4_0_1_0());
                            						
                            pushFollow(FOLLOW_25);
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

                    otherlv_13=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getFeaturePackageMemberElementAccess().getIsKeyword_4_1());
                    			
                    // InternalAlf.g:1671:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1672:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1672:5: ( ruleQualifiedName )
                    // InternalAlf.g:1673:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeaturePackageMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getMemberElementFeatureCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_16);
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
    // InternalAlf.g:1697:1: ruleCategoryBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) ;
    public final EObject ruleCategoryBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_ownedRelationship_2_0 = null;

        EObject lv_ownedRelationship_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1703:2: ( (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) )
            // InternalAlf.g:1704:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            {
            // InternalAlf.g:1704:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
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
                    // InternalAlf.g:1705:3: otherlv_0= ';'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getCategoryBodyAccess().getSemicolonKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:1710:3: (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    {
                    // InternalAlf.g:1710:3: (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    // InternalAlf.g:1711:4: otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_29); 

                    				newLeafNode(otherlv_1, grammarAccess.getCategoryBodyAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalAlf.g:1715:4: ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )*
                    loop28:
                    do {
                        int alt28=3;
                        alt28 = dfa28.predict(input);
                        switch (alt28) {
                    	case 1 :
                    	    // InternalAlf.g:1716:5: ( (lv_ownedRelationship_2_0= ruleCategoryMember ) )
                    	    {
                    	    // InternalAlf.g:1716:5: ( (lv_ownedRelationship_2_0= ruleCategoryMember ) )
                    	    // InternalAlf.g:1717:6: (lv_ownedRelationship_2_0= ruleCategoryMember )
                    	    {
                    	    // InternalAlf.g:1717:6: (lv_ownedRelationship_2_0= ruleCategoryMember )
                    	    // InternalAlf.g:1718:7: lv_ownedRelationship_2_0= ruleCategoryMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getCategoryBodyAccess().getOwnedRelationshipCategoryMemberParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
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
                    	    // InternalAlf.g:1736:5: ( (lv_ownedRelationship_3_0= rulePackageImport ) )
                    	    {
                    	    // InternalAlf.g:1736:5: ( (lv_ownedRelationship_3_0= rulePackageImport ) )
                    	    // InternalAlf.g:1737:6: (lv_ownedRelationship_3_0= rulePackageImport )
                    	    {
                    	    // InternalAlf.g:1737:6: (lv_ownedRelationship_3_0= rulePackageImport )
                    	    // InternalAlf.g:1738:7: lv_ownedRelationship_3_0= rulePackageImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getCategoryBodyAccess().getOwnedRelationshipPackageImportParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
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
    // InternalAlf.g:1766:1: ruleAbstractCategoryBody[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= ';' ) ) | ( ( (lv_isAbstract_1_0= '{' ) ) ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) ;
    public final EObject ruleAbstractCategoryBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token lv_isAbstract_1_0=null;
        Token otherlv_4=null;
        EObject lv_ownedRelationship_2_0 = null;

        EObject lv_ownedRelationship_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1772:2: ( ( ( (lv_isAbstract_0_0= ';' ) ) | ( ( (lv_isAbstract_1_0= '{' ) ) ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) )
            // InternalAlf.g:1773:2: ( ( (lv_isAbstract_0_0= ';' ) ) | ( ( (lv_isAbstract_1_0= '{' ) ) ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            {
            // InternalAlf.g:1773:2: ( ( (lv_isAbstract_0_0= ';' ) ) | ( ( (lv_isAbstract_1_0= '{' ) ) ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
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
                    // InternalAlf.g:1774:3: ( (lv_isAbstract_0_0= ';' ) )
                    {
                    // InternalAlf.g:1774:3: ( (lv_isAbstract_0_0= ';' ) )
                    // InternalAlf.g:1775:4: (lv_isAbstract_0_0= ';' )
                    {
                    // InternalAlf.g:1775:4: (lv_isAbstract_0_0= ';' )
                    // InternalAlf.g:1776:5: lv_isAbstract_0_0= ';'
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
                    // InternalAlf.g:1789:3: ( ( (lv_isAbstract_1_0= '{' ) ) ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    {
                    // InternalAlf.g:1789:3: ( ( (lv_isAbstract_1_0= '{' ) ) ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    // InternalAlf.g:1790:4: ( (lv_isAbstract_1_0= '{' ) ) ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}'
                    {
                    // InternalAlf.g:1790:4: ( (lv_isAbstract_1_0= '{' ) )
                    // InternalAlf.g:1791:5: (lv_isAbstract_1_0= '{' )
                    {
                    // InternalAlf.g:1791:5: (lv_isAbstract_1_0= '{' )
                    // InternalAlf.g:1792:6: lv_isAbstract_1_0= '{'
                    {
                    lv_isAbstract_1_0=(Token)match(input,23,FOLLOW_29); 

                    						newLeafNode(lv_isAbstract_1_0, grammarAccess.getAbstractCategoryBodyAccess().getIsAbstractLeftCurlyBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAbstractCategoryBodyRule());
                    						}
                    						setWithLastConsumed(current, "isAbstract", true, "{");
                    					

                    }


                    }

                    // InternalAlf.g:1804:4: ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )*
                    loop30:
                    do {
                        int alt30=3;
                        alt30 = dfa30.predict(input);
                        switch (alt30) {
                    	case 1 :
                    	    // InternalAlf.g:1805:5: ( (lv_ownedRelationship_2_0= ruleCategoryMember ) )
                    	    {
                    	    // InternalAlf.g:1805:5: ( (lv_ownedRelationship_2_0= ruleCategoryMember ) )
                    	    // InternalAlf.g:1806:6: (lv_ownedRelationship_2_0= ruleCategoryMember )
                    	    {
                    	    // InternalAlf.g:1806:6: (lv_ownedRelationship_2_0= ruleCategoryMember )
                    	    // InternalAlf.g:1807:7: lv_ownedRelationship_2_0= ruleCategoryMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getAbstractCategoryBodyAccess().getOwnedRelationshipCategoryMemberParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
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
                    	    // InternalAlf.g:1825:5: ( (lv_ownedRelationship_3_0= rulePackageImport ) )
                    	    {
                    	    // InternalAlf.g:1825:5: ( (lv_ownedRelationship_3_0= rulePackageImport ) )
                    	    // InternalAlf.g:1826:6: (lv_ownedRelationship_3_0= rulePackageImport )
                    	    {
                    	    // InternalAlf.g:1826:6: (lv_ownedRelationship_3_0= rulePackageImport )
                    	    // InternalAlf.g:1827:7: lv_ownedRelationship_3_0= rulePackageImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getAbstractCategoryBodyAccess().getOwnedRelationshipPackageImportParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
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
    // InternalAlf.g:1854:1: entryRuleCategoryMember returns [EObject current=null] : iv_ruleCategoryMember= ruleCategoryMember EOF ;
    public final EObject entryRuleCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategoryMember = null;


        try {
            // InternalAlf.g:1854:55: (iv_ruleCategoryMember= ruleCategoryMember EOF )
            // InternalAlf.g:1855:2: iv_ruleCategoryMember= ruleCategoryMember EOF
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
    // InternalAlf.g:1861:1: ruleCategoryMember returns [EObject current=null] : (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember ) ;
    public final EObject ruleCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureCategoryMember_0 = null;

        EObject this_FeatureCategoryMember_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1867:2: ( (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember ) )
            // InternalAlf.g:1868:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember )
            {
            // InternalAlf.g:1868:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember )
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalAlf.g:1869:3: this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember
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
                    // InternalAlf.g:1878:3: this_FeatureCategoryMember_1= ruleFeatureCategoryMember
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
    // InternalAlf.g:1890:1: entryRuleNonFeatureCategoryMember returns [EObject current=null] : iv_ruleNonFeatureCategoryMember= ruleNonFeatureCategoryMember EOF ;
    public final EObject entryRuleNonFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureCategoryMember = null;


        try {
            // InternalAlf.g:1890:65: (iv_ruleNonFeatureCategoryMember= ruleNonFeatureCategoryMember EOF )
            // InternalAlf.g:1891:2: iv_ruleNonFeatureCategoryMember= ruleNonFeatureCategoryMember EOF
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
    // InternalAlf.g:1897:1: ruleNonFeatureCategoryMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] ) ;
    public final EObject ruleNonFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject this_CategoryMemberPrefix_0 = null;

        EObject this_NonFeatureMemberElement_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1903:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] ) )
            // InternalAlf.g:1904:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] )
            {
            // InternalAlf.g:1904:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] )
            // InternalAlf.g:1905:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getNonFeatureCategoryMemberRule());
            			}
            			newCompositeNode(grammarAccess.getNonFeatureCategoryMemberAccess().getCategoryMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
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
    // InternalAlf.g:1931:1: entryRuleFeatureCategoryMember returns [EObject current=null] : iv_ruleFeatureCategoryMember= ruleFeatureCategoryMember EOF ;
    public final EObject entryRuleFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCategoryMember = null;


        try {
            // InternalAlf.g:1931:62: (iv_ruleFeatureCategoryMember= ruleFeatureCategoryMember EOF )
            // InternalAlf.g:1932:2: iv_ruleFeatureCategoryMember= ruleFeatureCategoryMember EOF
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
    // InternalAlf.g:1938:1: ruleFeatureCategoryMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'abstract' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_6_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_direction_7_0= ruleFeatureDirection ) )? ( (lv_memberName_8_0= ruleName ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) ) ;
    public final EObject ruleFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_CategoryMemberPrefix_0 = null;

        EObject this_FeatureMemberElement_1 = null;

        Enumerator lv_direction_2_0 = null;

        EObject lv_ownedRelatedElement_3_0 = null;

        Enumerator lv_direction_5_0 = null;

        EObject lv_ownedRelatedElement_6_0 = null;

        Enumerator lv_direction_7_0 = null;

        AntlrDatatypeRuleToken lv_memberName_8_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1944:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'abstract' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_6_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_direction_7_0= ruleFeatureDirection ) )? ( (lv_memberName_8_0= ruleName ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) ) )
            // InternalAlf.g:1945:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'abstract' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_6_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_direction_7_0= ruleFeatureDirection ) )? ( (lv_memberName_8_0= ruleName ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) )
            {
            // InternalAlf.g:1945:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'abstract' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_6_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_direction_7_0= ruleFeatureDirection ) )? ( (lv_memberName_8_0= ruleName ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) )
            // InternalAlf.g:1946:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'abstract' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_6_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_direction_7_0= ruleFeatureDirection ) )? ( (lv_memberName_8_0= ruleName ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureCategoryMemberRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getCategoryMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_CategoryMemberPrefix_0=ruleCategoryMemberPrefix(current);

            state._fsp--;


            			current = this_CategoryMemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:1957:3: (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'abstract' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_6_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_direction_7_0= ruleFeatureDirection ) )? ( (lv_memberName_8_0= ruleName ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) )
            int alt36=4;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // InternalAlf.g:1958:4: this_FeatureMemberElement_1= ruleFeatureMemberElement[$current]
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
                    // InternalAlf.g:1970:4: ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_3_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1970:4: ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_3_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1971:5: ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_3_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1971:5: ( (lv_direction_2_0= ruleFeatureDirection ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=76 && LA33_0<=78)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalAlf.g:1972:6: (lv_direction_2_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1972:6: (lv_direction_2_0= ruleFeatureDirection )
                            // InternalAlf.g:1973:7: lv_direction_2_0= ruleFeatureDirection
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

                    // InternalAlf.g:1990:5: ( (lv_ownedRelatedElement_3_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1991:6: (lv_ownedRelatedElement_3_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1991:6: (lv_ownedRelatedElement_3_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1992:7: lv_ownedRelatedElement_3_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getOwnedRelatedElementNamedFeatureDefinitionParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedRelatedElement_3_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeatureCategoryMemberRule());
                    							}
                    							add(
                    								current,
                    								"ownedRelatedElement",
                    								lv_ownedRelatedElement_3_0,
                    								"org.omg.sysml.Alf.NamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:2011:4: (otherlv_4= 'abstract' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_6_0= ruleAbstractNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2011:4: (otherlv_4= 'abstract' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_6_0= ruleAbstractNamedFeatureDefinition ) ) )
                    // InternalAlf.g:2012:5: otherlv_4= 'abstract' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_6_0= ruleAbstractNamedFeatureDefinition ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_32); 

                    					newLeafNode(otherlv_4, grammarAccess.getFeatureCategoryMemberAccess().getAbstractKeyword_1_2_0());
                    				
                    // InternalAlf.g:2016:5: ( (lv_direction_5_0= ruleFeatureDirection ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=76 && LA34_0<=78)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalAlf.g:2017:6: (lv_direction_5_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2017:6: (lv_direction_5_0= ruleFeatureDirection )
                            // InternalAlf.g:2018:7: lv_direction_5_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_2_1_0());
                            						
                            pushFollow(FOLLOW_26);
                            lv_direction_5_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFeatureCategoryMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_5_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:2035:5: ( (lv_ownedRelatedElement_6_0= ruleAbstractNamedFeatureDefinition ) )
                    // InternalAlf.g:2036:6: (lv_ownedRelatedElement_6_0= ruleAbstractNamedFeatureDefinition )
                    {
                    // InternalAlf.g:2036:6: (lv_ownedRelatedElement_6_0= ruleAbstractNamedFeatureDefinition )
                    // InternalAlf.g:2037:7: lv_ownedRelatedElement_6_0= ruleAbstractNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getOwnedRelatedElementAbstractNamedFeatureDefinitionParserRuleCall_1_2_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedRelatedElement_6_0=ruleAbstractNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeatureCategoryMemberRule());
                    							}
                    							add(
                    								current,
                    								"ownedRelatedElement",
                    								lv_ownedRelatedElement_6_0,
                    								"org.omg.sysml.Alf.AbstractNamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:2056:4: ( ( (lv_direction_7_0= ruleFeatureDirection ) )? ( (lv_memberName_8_0= ruleName ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' )
                    {
                    // InternalAlf.g:2056:4: ( ( (lv_direction_7_0= ruleFeatureDirection ) )? ( (lv_memberName_8_0= ruleName ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' )
                    // InternalAlf.g:2057:5: ( (lv_direction_7_0= ruleFeatureDirection ) )? ( (lv_memberName_8_0= ruleName ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';'
                    {
                    // InternalAlf.g:2057:5: ( (lv_direction_7_0= ruleFeatureDirection ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>=76 && LA35_0<=78)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalAlf.g:2058:6: (lv_direction_7_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2058:6: (lv_direction_7_0= ruleFeatureDirection )
                            // InternalAlf.g:2059:7: lv_direction_7_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_3_0_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_direction_7_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFeatureCategoryMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_7_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:2076:5: ( (lv_memberName_8_0= ruleName ) )
                    // InternalAlf.g:2077:6: (lv_memberName_8_0= ruleName )
                    {
                    // InternalAlf.g:2077:6: (lv_memberName_8_0= ruleName )
                    // InternalAlf.g:2078:7: lv_memberName_8_0= ruleName
                    {

                    							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getMemberNameNameParserRuleCall_1_3_1_0());
                    						
                    pushFollow(FOLLOW_25);
                    lv_memberName_8_0=ruleName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeatureCategoryMemberRule());
                    							}
                    							set(
                    								current,
                    								"memberName",
                    								lv_memberName_8_0,
                    								"org.omg.sysml.Alf.Name");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_9=(Token)match(input,25,FOLLOW_13); 

                    					newLeafNode(otherlv_9, grammarAccess.getFeatureCategoryMemberAccess().getIsKeyword_1_3_2());
                    				
                    // InternalAlf.g:2099:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:2100:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:2100:6: ( ruleQualifiedName )
                    // InternalAlf.g:2101:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFeatureCategoryMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getMemberFeatureFeatureCrossReference_1_3_3_0());
                    						
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_11=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(otherlv_11, grammarAccess.getFeatureCategoryMemberAccess().getSemicolonKeyword_1_3_4());
                    				

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
    // InternalAlf.g:2126:1: ruleCategoryMemberPrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ) ;
    public final EObject ruleCategoryMemberPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedRelationship_0_0 = null;

        Enumerator lv_visibility_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2132:2: ( ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ) )
            // InternalAlf.g:2133:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? )
            {
            // InternalAlf.g:2133:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? )
            // InternalAlf.g:2134:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            {
            // InternalAlf.g:2134:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAlf.g:2135:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    {
            	    // InternalAlf.g:2135:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    // InternalAlf.g:2136:5: lv_ownedRelationship_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getCategoryMemberPrefixAccess().getOwnedRelationshipAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop37;
                }
            } while (true);

            // InternalAlf.g:2153:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=72 && LA38_0<=75)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAlf.g:2154:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:2154:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:2155:5: lv_visibility_1_0= ruleVisibilityIndicator
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
    // InternalAlf.g:2177:1: ruleFeatureMemberElement[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedRelatedElement_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) ) | (otherlv_9= 'abstract' (otherlv_10= 'feature' | ( (lv_isPart_11_0= 'part' ) ) | ( (lv_isPort_12_0= 'port' ) ) ) ( (lv_direction_13_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_14_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_15= 'connector' ( ( (lv_ownedRelatedElement_16_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) ) | (otherlv_21= 'abstract' otherlv_22= 'connector' ( (lv_ownedRelatedElement_23_0= ruleAbstractConnectorDefinition ) ) ) ) ;
    public final EObject ruleFeatureMemberElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_isPart_1_0=null;
        Token lv_isPort_2_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_isPart_11_0=null;
        Token lv_isPort_12_0=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Enumerator lv_direction_3_0 = null;

        EObject lv_ownedRelatedElement_4_0 = null;

        AntlrDatatypeRuleToken lv_memberName_5_0 = null;

        Enumerator lv_direction_13_0 = null;

        EObject lv_ownedRelatedElement_14_0 = null;

        EObject lv_ownedRelatedElement_16_0 = null;

        AntlrDatatypeRuleToken lv_memberName_17_0 = null;

        EObject lv_ownedRelatedElement_23_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2183:2: ( ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedRelatedElement_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) ) | (otherlv_9= 'abstract' (otherlv_10= 'feature' | ( (lv_isPart_11_0= 'part' ) ) | ( (lv_isPort_12_0= 'port' ) ) ) ( (lv_direction_13_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_14_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_15= 'connector' ( ( (lv_ownedRelatedElement_16_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) ) | (otherlv_21= 'abstract' otherlv_22= 'connector' ( (lv_ownedRelatedElement_23_0= ruleAbstractConnectorDefinition ) ) ) ) )
            // InternalAlf.g:2184:2: ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedRelatedElement_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) ) | (otherlv_9= 'abstract' (otherlv_10= 'feature' | ( (lv_isPart_11_0= 'part' ) ) | ( (lv_isPort_12_0= 'port' ) ) ) ( (lv_direction_13_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_14_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_15= 'connector' ( ( (lv_ownedRelatedElement_16_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) ) | (otherlv_21= 'abstract' otherlv_22= 'connector' ( (lv_ownedRelatedElement_23_0= ruleAbstractConnectorDefinition ) ) ) )
            {
            // InternalAlf.g:2184:2: ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedRelatedElement_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) ) | (otherlv_9= 'abstract' (otherlv_10= 'feature' | ( (lv_isPart_11_0= 'part' ) ) | ( (lv_isPort_12_0= 'port' ) ) ) ( (lv_direction_13_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_14_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_15= 'connector' ( ( (lv_ownedRelatedElement_16_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) ) | (otherlv_21= 'abstract' otherlv_22= 'connector' ( (lv_ownedRelatedElement_23_0= ruleAbstractConnectorDefinition ) ) ) )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 32:
            case 34:
            case 35:
                {
                alt47=1;
                }
                break;
            case 33:
                {
                int LA47_2 = input.LA(2);

                if ( (LA47_2==32||(LA47_2>=34 && LA47_2<=35)) ) {
                    alt47=2;
                }
                else if ( (LA47_2==36) ) {
                    alt47=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 2, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalAlf.g:2185:3: ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedRelatedElement_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) )
                    {
                    // InternalAlf.g:2185:3: ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedRelatedElement_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) )
                    // InternalAlf.g:2186:4: (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedRelatedElement_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) )
                    {
                    // InternalAlf.g:2186:4: (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) )
                    int alt39=3;
                    switch ( input.LA(1) ) {
                    case 32:
                        {
                        alt39=1;
                        }
                        break;
                    case 34:
                        {
                        alt39=2;
                        }
                        break;
                    case 35:
                        {
                        alt39=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }

                    switch (alt39) {
                        case 1 :
                            // InternalAlf.g:2187:5: otherlv_0= 'feature'
                            {
                            otherlv_0=(Token)match(input,32,FOLLOW_34); 

                            					newLeafNode(otherlv_0, grammarAccess.getFeatureMemberElementAccess().getFeatureKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2192:5: ( (lv_isPart_1_0= 'part' ) )
                            {
                            // InternalAlf.g:2192:5: ( (lv_isPart_1_0= 'part' ) )
                            // InternalAlf.g:2193:6: (lv_isPart_1_0= 'part' )
                            {
                            // InternalAlf.g:2193:6: (lv_isPart_1_0= 'part' )
                            // InternalAlf.g:2194:7: lv_isPart_1_0= 'part'
                            {
                            lv_isPart_1_0=(Token)match(input,34,FOLLOW_34); 

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
                            // InternalAlf.g:2207:5: ( (lv_isPort_2_0= 'port' ) )
                            {
                            // InternalAlf.g:2207:5: ( (lv_isPort_2_0= 'port' ) )
                            // InternalAlf.g:2208:6: (lv_isPort_2_0= 'port' )
                            {
                            // InternalAlf.g:2208:6: (lv_isPort_2_0= 'port' )
                            // InternalAlf.g:2209:7: lv_isPort_2_0= 'port'
                            {
                            lv_isPort_2_0=(Token)match(input,35,FOLLOW_34); 

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

                    // InternalAlf.g:2222:4: ( (lv_direction_3_0= ruleFeatureDirection ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=76 && LA40_0<=78)) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalAlf.g:2223:5: (lv_direction_3_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2223:5: (lv_direction_3_0= ruleFeatureDirection )
                            // InternalAlf.g:2224:6: lv_direction_3_0= ruleFeatureDirection
                            {

                            						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getDirectionFeatureDirectionEnumRuleCall_0_1_0());
                            					
                            pushFollow(FOLLOW_35);
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

                    // InternalAlf.g:2241:4: ( ( (lv_ownedRelatedElement_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) )
                    int alt42=2;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                        {
                        int LA42_1 = input.LA(2);

                        if ( (LA42_1==20||LA42_1==23||(LA42_1>=42 && LA42_1<=44)||(LA42_1>=47 && LA42_1<=49)||LA42_1==52) ) {
                            alt42=1;
                        }
                        else if ( (LA42_1==25) ) {
                            alt42=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 42, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_UNRESTRICTED_NAME:
                        {
                        int LA42_2 = input.LA(2);

                        if ( (LA42_2==20||LA42_2==23||(LA42_2>=42 && LA42_2<=44)||(LA42_2>=47 && LA42_2<=49)||LA42_2==52) ) {
                            alt42=1;
                        }
                        else if ( (LA42_2==25) ) {
                            alt42=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 42, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 42:
                        {
                        alt42=1;
                        }
                        break;
                    case 25:
                        {
                        alt42=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }

                    switch (alt42) {
                        case 1 :
                            // InternalAlf.g:2242:5: ( (lv_ownedRelatedElement_4_0= ruleFeatureDefinition ) )
                            {
                            // InternalAlf.g:2242:5: ( (lv_ownedRelatedElement_4_0= ruleFeatureDefinition ) )
                            // InternalAlf.g:2243:6: (lv_ownedRelatedElement_4_0= ruleFeatureDefinition )
                            {
                            // InternalAlf.g:2243:6: (lv_ownedRelatedElement_4_0= ruleFeatureDefinition )
                            // InternalAlf.g:2244:7: lv_ownedRelatedElement_4_0= ruleFeatureDefinition
                            {

                            							newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getOwnedRelatedElementFeatureDefinitionParserRuleCall_0_2_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_ownedRelatedElement_4_0=ruleFeatureDefinition();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFeatureMemberElementRule());
                            							}
                            							add(
                            								current,
                            								"ownedRelatedElement",
                            								lv_ownedRelatedElement_4_0,
                            								"org.omg.sysml.Alf.FeatureDefinition");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2262:5: ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' )
                            {
                            // InternalAlf.g:2262:5: ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' )
                            // InternalAlf.g:2263:6: ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';'
                            {
                            // InternalAlf.g:2263:6: ( (lv_memberName_5_0= ruleName ) )?
                            int alt41=2;
                            int LA41_0 = input.LA(1);

                            if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt41=1;
                            }
                            switch (alt41) {
                                case 1 :
                                    // InternalAlf.g:2264:7: (lv_memberName_5_0= ruleName )
                                    {
                                    // InternalAlf.g:2264:7: (lv_memberName_5_0= ruleName )
                                    // InternalAlf.g:2265:8: lv_memberName_5_0= ruleName
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
                            					
                            // InternalAlf.g:2286:6: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:2287:7: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:2287:7: ( ruleQualifiedName )
                            // InternalAlf.g:2288:8: ruleQualifiedName
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
                    // InternalAlf.g:2310:3: (otherlv_9= 'abstract' (otherlv_10= 'feature' | ( (lv_isPart_11_0= 'part' ) ) | ( (lv_isPort_12_0= 'port' ) ) ) ( (lv_direction_13_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_14_0= ruleAbstractFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2310:3: (otherlv_9= 'abstract' (otherlv_10= 'feature' | ( (lv_isPart_11_0= 'part' ) ) | ( (lv_isPort_12_0= 'port' ) ) ) ( (lv_direction_13_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_14_0= ruleAbstractFeatureDefinition ) ) )
                    // InternalAlf.g:2311:4: otherlv_9= 'abstract' (otherlv_10= 'feature' | ( (lv_isPart_11_0= 'part' ) ) | ( (lv_isPort_12_0= 'port' ) ) ) ( (lv_direction_13_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_14_0= ruleAbstractFeatureDefinition ) )
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_36); 

                    				newLeafNode(otherlv_9, grammarAccess.getFeatureMemberElementAccess().getAbstractKeyword_1_0());
                    			
                    // InternalAlf.g:2315:4: (otherlv_10= 'feature' | ( (lv_isPart_11_0= 'part' ) ) | ( (lv_isPort_12_0= 'port' ) ) )
                    int alt43=3;
                    switch ( input.LA(1) ) {
                    case 32:
                        {
                        alt43=1;
                        }
                        break;
                    case 34:
                        {
                        alt43=2;
                        }
                        break;
                    case 35:
                        {
                        alt43=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }

                    switch (alt43) {
                        case 1 :
                            // InternalAlf.g:2316:5: otherlv_10= 'feature'
                            {
                            otherlv_10=(Token)match(input,32,FOLLOW_37); 

                            					newLeafNode(otherlv_10, grammarAccess.getFeatureMemberElementAccess().getFeatureKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2321:5: ( (lv_isPart_11_0= 'part' ) )
                            {
                            // InternalAlf.g:2321:5: ( (lv_isPart_11_0= 'part' ) )
                            // InternalAlf.g:2322:6: (lv_isPart_11_0= 'part' )
                            {
                            // InternalAlf.g:2322:6: (lv_isPart_11_0= 'part' )
                            // InternalAlf.g:2323:7: lv_isPart_11_0= 'part'
                            {
                            lv_isPart_11_0=(Token)match(input,34,FOLLOW_37); 

                            							newLeafNode(lv_isPart_11_0, grammarAccess.getFeatureMemberElementAccess().getIsPartPartKeyword_1_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFeatureMemberElementRule());
                            							}
                            							setWithLastConsumed(current, "isPart", true, "part");
                            						

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAlf.g:2336:5: ( (lv_isPort_12_0= 'port' ) )
                            {
                            // InternalAlf.g:2336:5: ( (lv_isPort_12_0= 'port' ) )
                            // InternalAlf.g:2337:6: (lv_isPort_12_0= 'port' )
                            {
                            // InternalAlf.g:2337:6: (lv_isPort_12_0= 'port' )
                            // InternalAlf.g:2338:7: lv_isPort_12_0= 'port'
                            {
                            lv_isPort_12_0=(Token)match(input,35,FOLLOW_37); 

                            							newLeafNode(lv_isPort_12_0, grammarAccess.getFeatureMemberElementAccess().getIsPortPortKeyword_1_1_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFeatureMemberElementRule());
                            							}
                            							setWithLastConsumed(current, "isPort", true, "port");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:2351:4: ( (lv_direction_13_0= ruleFeatureDirection ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( ((LA44_0>=76 && LA44_0<=78)) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalAlf.g:2352:5: (lv_direction_13_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2352:5: (lv_direction_13_0= ruleFeatureDirection )
                            // InternalAlf.g:2353:6: lv_direction_13_0= ruleFeatureDirection
                            {

                            						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getDirectionFeatureDirectionEnumRuleCall_1_2_0());
                            					
                            pushFollow(FOLLOW_37);
                            lv_direction_13_0=ruleFeatureDirection();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFeatureMemberElementRule());
                            						}
                            						set(
                            							current,
                            							"direction",
                            							lv_direction_13_0,
                            							"org.omg.sysml.Alf.FeatureDirection");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:2370:4: ( (lv_ownedRelatedElement_14_0= ruleAbstractFeatureDefinition ) )
                    // InternalAlf.g:2371:5: (lv_ownedRelatedElement_14_0= ruleAbstractFeatureDefinition )
                    {
                    // InternalAlf.g:2371:5: (lv_ownedRelatedElement_14_0= ruleAbstractFeatureDefinition )
                    // InternalAlf.g:2372:6: lv_ownedRelatedElement_14_0= ruleAbstractFeatureDefinition
                    {

                    						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getOwnedRelatedElementAbstractFeatureDefinitionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedRelatedElement_14_0=ruleAbstractFeatureDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureMemberElementRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelatedElement",
                    							lv_ownedRelatedElement_14_0,
                    							"org.omg.sysml.Alf.AbstractFeatureDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:2391:3: (otherlv_15= 'connector' ( ( (lv_ownedRelatedElement_16_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) )
                    {
                    // InternalAlf.g:2391:3: (otherlv_15= 'connector' ( ( (lv_ownedRelatedElement_16_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) )
                    // InternalAlf.g:2392:4: otherlv_15= 'connector' ( ( (lv_ownedRelatedElement_16_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) )
                    {
                    otherlv_15=(Token)match(input,36,FOLLOW_38); 

                    				newLeafNode(otherlv_15, grammarAccess.getFeatureMemberElementAccess().getConnectorKeyword_2_0());
                    			
                    // InternalAlf.g:2396:4: ( ( (lv_ownedRelatedElement_16_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) )
                    int alt46=2;
                    alt46 = dfa46.predict(input);
                    switch (alt46) {
                        case 1 :
                            // InternalAlf.g:2397:5: ( (lv_ownedRelatedElement_16_0= ruleConnectorDefinition ) )
                            {
                            // InternalAlf.g:2397:5: ( (lv_ownedRelatedElement_16_0= ruleConnectorDefinition ) )
                            // InternalAlf.g:2398:6: (lv_ownedRelatedElement_16_0= ruleConnectorDefinition )
                            {
                            // InternalAlf.g:2398:6: (lv_ownedRelatedElement_16_0= ruleConnectorDefinition )
                            // InternalAlf.g:2399:7: lv_ownedRelatedElement_16_0= ruleConnectorDefinition
                            {

                            							newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getOwnedRelatedElementConnectorDefinitionParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_ownedRelatedElement_16_0=ruleConnectorDefinition();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFeatureMemberElementRule());
                            							}
                            							add(
                            								current,
                            								"ownedRelatedElement",
                            								lv_ownedRelatedElement_16_0,
                            								"org.omg.sysml.Alf.ConnectorDefinition");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2417:5: ( ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' )
                            {
                            // InternalAlf.g:2417:5: ( ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' )
                            // InternalAlf.g:2418:6: ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';'
                            {
                            // InternalAlf.g:2418:6: ( (lv_memberName_17_0= ruleName ) )?
                            int alt45=2;
                            int LA45_0 = input.LA(1);

                            if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt45=1;
                            }
                            switch (alt45) {
                                case 1 :
                                    // InternalAlf.g:2419:7: (lv_memberName_17_0= ruleName )
                                    {
                                    // InternalAlf.g:2419:7: (lv_memberName_17_0= ruleName )
                                    // InternalAlf.g:2420:8: lv_memberName_17_0= ruleName
                                    {

                                    								newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getMemberNameNameParserRuleCall_2_1_1_0_0());
                                    							
                                    pushFollow(FOLLOW_25);
                                    lv_memberName_17_0=ruleName();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getFeatureMemberElementRule());
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

                            						newLeafNode(otherlv_18, grammarAccess.getFeatureMemberElementAccess().getIsKeyword_2_1_1_1());
                            					
                            // InternalAlf.g:2441:6: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:2442:7: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:2442:7: ( ruleQualifiedName )
                            // InternalAlf.g:2443:8: ruleQualifiedName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getFeatureMemberElementRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getMemberFeatureConnectorCrossReference_2_1_1_2_0());
                            							
                            pushFollow(FOLLOW_16);
                            ruleQualifiedName();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_20=(Token)match(input,20,FOLLOW_2); 

                            						newLeafNode(otherlv_20, grammarAccess.getFeatureMemberElementAccess().getSemicolonKeyword_2_1_1_3());
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:2465:3: (otherlv_21= 'abstract' otherlv_22= 'connector' ( (lv_ownedRelatedElement_23_0= ruleAbstractConnectorDefinition ) ) )
                    {
                    // InternalAlf.g:2465:3: (otherlv_21= 'abstract' otherlv_22= 'connector' ( (lv_ownedRelatedElement_23_0= ruleAbstractConnectorDefinition ) ) )
                    // InternalAlf.g:2466:4: otherlv_21= 'abstract' otherlv_22= 'connector' ( (lv_ownedRelatedElement_23_0= ruleAbstractConnectorDefinition ) )
                    {
                    otherlv_21=(Token)match(input,33,FOLLOW_39); 

                    				newLeafNode(otherlv_21, grammarAccess.getFeatureMemberElementAccess().getAbstractKeyword_3_0());
                    			
                    otherlv_22=(Token)match(input,36,FOLLOW_38); 

                    				newLeafNode(otherlv_22, grammarAccess.getFeatureMemberElementAccess().getConnectorKeyword_3_1());
                    			
                    // InternalAlf.g:2474:4: ( (lv_ownedRelatedElement_23_0= ruleAbstractConnectorDefinition ) )
                    // InternalAlf.g:2475:5: (lv_ownedRelatedElement_23_0= ruleAbstractConnectorDefinition )
                    {
                    // InternalAlf.g:2475:5: (lv_ownedRelatedElement_23_0= ruleAbstractConnectorDefinition )
                    // InternalAlf.g:2476:6: lv_ownedRelatedElement_23_0= ruleAbstractConnectorDefinition
                    {

                    						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getOwnedRelatedElementAbstractConnectorDefinitionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedRelatedElement_23_0=ruleAbstractConnectorDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureMemberElementRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelatedElement",
                    							lv_ownedRelatedElement_23_0,
                    							"org.omg.sysml.Alf.AbstractConnectorDefinition");
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
    // $ANTLR end "ruleFeatureMemberElement"


    // $ANTLR start "entryRuleClassDefinitionOrStub"
    // InternalAlf.g:2498:1: entryRuleClassDefinitionOrStub returns [EObject current=null] : iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF ;
    public final EObject entryRuleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:2498:62: (iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:2499:2: iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF
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
    // InternalAlf.g:2505:1: ruleClassDefinitionOrStub returns [EObject current=null] : this_ClassDefinition_0= ruleClassDefinition[$current] ;
    public final EObject ruleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2511:2: (this_ClassDefinition_0= ruleClassDefinition[$current] )
            // InternalAlf.g:2512:2: this_ClassDefinition_0= ruleClassDefinition[$current]
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
    // InternalAlf.g:2527:1: ruleClassDefinition[EObject in_current] returns [EObject current=in_current] : (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) ;
    public final EObject ruleClassDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_ClassDeclaration_0 = null;

        EObject this_CategoryBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2533:2: ( (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) )
            // InternalAlf.g:2534:2: (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:2534:2: (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            // InternalAlf.g:2535:3: this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getClassDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getClassDefinitionAccess().getClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
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
    // InternalAlf.g:2562:1: ruleClassDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'Class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) ;
    public final EObject ruleClassDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        EObject this_ClassDeclarationCompletion_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2568:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'Class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) )
            // InternalAlf.g:2569:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'Class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            {
            // InternalAlf.g:2569:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'Class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            // InternalAlf.g:2570:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'Class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current]
            {
            // InternalAlf.g:2570:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==33) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAlf.g:2571:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:2571:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:2572:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,33,FOLLOW_41); 

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
    // InternalAlf.g:2604:1: ruleClassDeclarationCompletion[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= ruleName ) ) (this_SpecializationList_1= ruleSpecializationList[$current] )? ) ;
    public final EObject ruleClassDeclarationCompletion(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject this_SpecializationList_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2610:2: ( ( ( (lv_name_0_0= ruleName ) ) (this_SpecializationList_1= ruleSpecializationList[$current] )? ) )
            // InternalAlf.g:2611:2: ( ( (lv_name_0_0= ruleName ) ) (this_SpecializationList_1= ruleSpecializationList[$current] )? )
            {
            // InternalAlf.g:2611:2: ( ( (lv_name_0_0= ruleName ) ) (this_SpecializationList_1= ruleSpecializationList[$current] )? )
            // InternalAlf.g:2612:3: ( (lv_name_0_0= ruleName ) ) (this_SpecializationList_1= ruleSpecializationList[$current] )?
            {
            // InternalAlf.g:2612:3: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:2613:4: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:2613:4: (lv_name_0_0= ruleName )
            // InternalAlf.g:2614:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getClassDeclarationCompletionAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_42);
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

            // InternalAlf.g:2631:3: (this_SpecializationList_1= ruleSpecializationList[$current] )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==37) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAlf.g:2632:4: this_SpecializationList_1= ruleSpecializationList[$current]
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
    // InternalAlf.g:2649:1: ruleSpecializationList[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'specializes' ( (lv_ownedRelationship_1_0= ruleSuperclassing ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) ) )* ) ;
    public final EObject ruleSpecializationList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject lv_ownedRelationship_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2655:2: ( (otherlv_0= 'specializes' ( (lv_ownedRelationship_1_0= ruleSuperclassing ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) ) )* ) )
            // InternalAlf.g:2656:2: (otherlv_0= 'specializes' ( (lv_ownedRelationship_1_0= ruleSuperclassing ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) ) )* )
            {
            // InternalAlf.g:2656:2: (otherlv_0= 'specializes' ( (lv_ownedRelationship_1_0= ruleSuperclassing ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) ) )* )
            // InternalAlf.g:2657:3: otherlv_0= 'specializes' ( (lv_ownedRelationship_1_0= ruleSuperclassing ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) ) )*
            {
            otherlv_0=(Token)match(input,37,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSpecializationListAccess().getSpecializesKeyword_0());
            		
            // InternalAlf.g:2661:3: ( (lv_ownedRelationship_1_0= ruleSuperclassing ) )
            // InternalAlf.g:2662:4: (lv_ownedRelationship_1_0= ruleSuperclassing )
            {
            // InternalAlf.g:2662:4: (lv_ownedRelationship_1_0= ruleSuperclassing )
            // InternalAlf.g:2663:5: lv_ownedRelationship_1_0= ruleSuperclassing
            {

            					newCompositeNode(grammarAccess.getSpecializationListAccess().getOwnedRelationshipSuperclassingParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalAlf.g:2680:3: (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==38) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalAlf.g:2681:4: otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleSuperclassing ) )
            	    {
            	    otherlv_2=(Token)match(input,38,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSpecializationListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAlf.g:2685:4: ( (lv_ownedRelationship_3_0= ruleSuperclassing ) )
            	    // InternalAlf.g:2686:5: (lv_ownedRelationship_3_0= ruleSuperclassing )
            	    {
            	    // InternalAlf.g:2686:5: (lv_ownedRelationship_3_0= ruleSuperclassing )
            	    // InternalAlf.g:2687:6: lv_ownedRelationship_3_0= ruleSuperclassing
            	    {

            	    						newCompositeNode(grammarAccess.getSpecializationListAccess().getOwnedRelationshipSuperclassingParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
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
    // InternalAlf.g:2709:1: entryRuleSuperclassing returns [EObject current=null] : iv_ruleSuperclassing= ruleSuperclassing EOF ;
    public final EObject entryRuleSuperclassing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperclassing = null;


        try {
            // InternalAlf.g:2709:54: (iv_ruleSuperclassing= ruleSuperclassing EOF )
            // InternalAlf.g:2710:2: iv_ruleSuperclassing= ruleSuperclassing EOF
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
    // InternalAlf.g:2716:1: ruleSuperclassing returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSuperclassing() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:2722:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2723:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2723:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2724:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:2724:3: ( ruleQualifiedName )
            // InternalAlf.g:2725:4: ruleQualifiedName
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
    // InternalAlf.g:2742:1: entryRuleObjectClassDefinitionOrStub returns [EObject current=null] : iv_ruleObjectClassDefinitionOrStub= ruleObjectClassDefinitionOrStub EOF ;
    public final EObject entryRuleObjectClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:2742:68: (iv_ruleObjectClassDefinitionOrStub= ruleObjectClassDefinitionOrStub EOF )
            // InternalAlf.g:2743:2: iv_ruleObjectClassDefinitionOrStub= ruleObjectClassDefinitionOrStub EOF
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
    // InternalAlf.g:2749:1: ruleObjectClassDefinitionOrStub returns [EObject current=null] : this_ObjectClassDefinition_0= ruleObjectClassDefinition[$current] ;
    public final EObject ruleObjectClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2755:2: (this_ObjectClassDefinition_0= ruleObjectClassDefinition[$current] )
            // InternalAlf.g:2756:2: this_ObjectClassDefinition_0= ruleObjectClassDefinition[$current]
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
    // InternalAlf.g:2771:1: ruleObjectClassDefinition[EObject in_current] returns [EObject current=in_current] : (this_ObjectClassDeclaration_0= ruleObjectClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) ;
    public final EObject ruleObjectClassDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_ObjectClassDeclaration_0 = null;

        EObject this_CategoryBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2777:2: ( (this_ObjectClassDeclaration_0= ruleObjectClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) )
            // InternalAlf.g:2778:2: (this_ObjectClassDeclaration_0= ruleObjectClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:2778:2: (this_ObjectClassDeclaration_0= ruleObjectClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            // InternalAlf.g:2779:3: this_ObjectClassDeclaration_0= ruleObjectClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getObjectClassDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getObjectClassDefinitionAccess().getObjectClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
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
    // InternalAlf.g:2806:1: ruleObjectClassDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) ;
    public final EObject ruleObjectClassDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        EObject this_ClassDeclarationCompletion_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2812:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) )
            // InternalAlf.g:2813:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            {
            // InternalAlf.g:2813:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            // InternalAlf.g:2814:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current]
            {
            // InternalAlf.g:2814:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==33) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAlf.g:2815:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:2815:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:2816:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,33,FOLLOW_44); 

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
    // InternalAlf.g:2847:1: entryRuleValueClassDefinitionOrStub returns [EObject current=null] : iv_ruleValueClassDefinitionOrStub= ruleValueClassDefinitionOrStub EOF ;
    public final EObject entryRuleValueClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:2847:67: (iv_ruleValueClassDefinitionOrStub= ruleValueClassDefinitionOrStub EOF )
            // InternalAlf.g:2848:2: iv_ruleValueClassDefinitionOrStub= ruleValueClassDefinitionOrStub EOF
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
    // InternalAlf.g:2854:1: ruleValueClassDefinitionOrStub returns [EObject current=null] : this_ValueClassDefinition_0= ruleValueClassDefinition[$current] ;
    public final EObject ruleValueClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ValueClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2860:2: (this_ValueClassDefinition_0= ruleValueClassDefinition[$current] )
            // InternalAlf.g:2861:2: this_ValueClassDefinition_0= ruleValueClassDefinition[$current]
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
    // InternalAlf.g:2876:1: ruleValueClassDefinition[EObject in_current] returns [EObject current=in_current] : (this_ValueClassDeclaration_0= ruleValueClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) ;
    public final EObject ruleValueClassDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_ValueClassDeclaration_0 = null;

        EObject this_CategoryBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2882:2: ( (this_ValueClassDeclaration_0= ruleValueClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) )
            // InternalAlf.g:2883:2: (this_ValueClassDeclaration_0= ruleValueClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:2883:2: (this_ValueClassDeclaration_0= ruleValueClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            // InternalAlf.g:2884:3: this_ValueClassDeclaration_0= ruleValueClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getValueClassDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getValueClassDefinitionAccess().getValueClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
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
    // InternalAlf.g:2911:1: ruleValueClassDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'datatype' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) ;
    public final EObject ruleValueClassDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        EObject this_ClassDeclarationCompletion_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2917:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'datatype' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) )
            // InternalAlf.g:2918:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'datatype' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            {
            // InternalAlf.g:2918:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'datatype' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            // InternalAlf.g:2919:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'datatype' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current]
            {
            // InternalAlf.g:2919:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==33) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAlf.g:2920:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:2920:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:2921:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,33,FOLLOW_45); 

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
    // InternalAlf.g:2952:1: entryRuleAssociationDefinitionOrStub returns [EObject current=null] : iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF ;
    public final EObject entryRuleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinitionOrStub = null;


        try {
            // InternalAlf.g:2952:68: (iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF )
            // InternalAlf.g:2953:2: iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF
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
    // InternalAlf.g:2959:1: ruleAssociationDefinitionOrStub returns [EObject current=null] : this_AssociationDefinition_0= ruleAssociationDefinition[$current] ;
    public final EObject ruleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_AssociationDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2965:2: (this_AssociationDefinition_0= ruleAssociationDefinition[$current] )
            // InternalAlf.g:2966:2: this_AssociationDefinition_0= ruleAssociationDefinition[$current]
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
    // InternalAlf.g:2981:1: ruleAssociationDefinition[EObject in_current] returns [EObject current=in_current] : (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] ) ;
    public final EObject ruleAssociationDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_AssociationDeclaration_0 = null;

        EObject this_AssociationBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2987:2: ( (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] ) )
            // InternalAlf.g:2988:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] )
            {
            // InternalAlf.g:2988:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] )
            // InternalAlf.g:2989:3: this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getAssociationDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
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
    // InternalAlf.g:3016:1: ruleAssociationDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) ;
    public final EObject ruleAssociationDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        EObject this_ClassDeclarationCompletion_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:3022:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) )
            // InternalAlf.g:3023:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            {
            // InternalAlf.g:3023:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            // InternalAlf.g:3024:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current]
            {
            // InternalAlf.g:3024:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==33) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalAlf.g:3025:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:3025:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:3026:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,33,FOLLOW_46); 

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
    // InternalAlf.g:3058:1: ruleAssociationBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleAssociationMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) ;
    public final EObject ruleAssociationBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_ownedRelationship_2_0 = null;

        EObject lv_ownedRelationship_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3064:2: ( (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleAssociationMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) )
            // InternalAlf.g:3065:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleAssociationMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            {
            // InternalAlf.g:3065:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleAssociationMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
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
                    // InternalAlf.g:3066:3: otherlv_0= ';'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getAssociationBodyAccess().getSemicolonKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3071:3: (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleAssociationMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    {
                    // InternalAlf.g:3071:3: (otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleAssociationMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    // InternalAlf.g:3072:4: otherlv_1= '{' ( ( (lv_ownedRelationship_2_0= ruleAssociationMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )* otherlv_4= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_47); 

                    				newLeafNode(otherlv_1, grammarAccess.getAssociationBodyAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalAlf.g:3076:4: ( ( (lv_ownedRelationship_2_0= ruleAssociationMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )*
                    loop54:
                    do {
                        int alt54=3;
                        alt54 = dfa54.predict(input);
                        switch (alt54) {
                    	case 1 :
                    	    // InternalAlf.g:3077:5: ( (lv_ownedRelationship_2_0= ruleAssociationMember ) )
                    	    {
                    	    // InternalAlf.g:3077:5: ( (lv_ownedRelationship_2_0= ruleAssociationMember ) )
                    	    // InternalAlf.g:3078:6: (lv_ownedRelationship_2_0= ruleAssociationMember )
                    	    {
                    	    // InternalAlf.g:3078:6: (lv_ownedRelationship_2_0= ruleAssociationMember )
                    	    // InternalAlf.g:3079:7: lv_ownedRelationship_2_0= ruleAssociationMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationBodyAccess().getOwnedRelationshipAssociationMemberParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
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
                    	    // InternalAlf.g:3097:5: ( (lv_ownedRelationship_3_0= rulePackageImport ) )
                    	    {
                    	    // InternalAlf.g:3097:5: ( (lv_ownedRelationship_3_0= rulePackageImport ) )
                    	    // InternalAlf.g:3098:6: (lv_ownedRelationship_3_0= rulePackageImport )
                    	    {
                    	    // InternalAlf.g:3098:6: (lv_ownedRelationship_3_0= rulePackageImport )
                    	    // InternalAlf.g:3099:7: lv_ownedRelationship_3_0= rulePackageImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationBodyAccess().getOwnedRelationshipPackageImportParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
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
    // InternalAlf.g:3126:1: entryRuleAssociationMember returns [EObject current=null] : iv_ruleAssociationMember= ruleAssociationMember EOF ;
    public final EObject entryRuleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationMember = null;


        try {
            // InternalAlf.g:3126:58: (iv_ruleAssociationMember= ruleAssociationMember EOF )
            // InternalAlf.g:3127:2: iv_ruleAssociationMember= ruleAssociationMember EOF
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
    // InternalAlf.g:3133:1: ruleAssociationMember returns [EObject current=null] : (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember ) ;
    public final EObject ruleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureCategoryMember_0 = null;

        EObject this_AssociationFeatureMember_1 = null;

        EObject this_AssociationEndFeatureMember_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:3139:2: ( (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember ) )
            // InternalAlf.g:3140:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )
            {
            // InternalAlf.g:3140:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )
            int alt56=3;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // InternalAlf.g:3141:3: this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember
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
                    // InternalAlf.g:3150:3: this_AssociationFeatureMember_1= ruleAssociationFeatureMember
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
                    // InternalAlf.g:3159:3: this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember
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
    // InternalAlf.g:3171:1: entryRuleAssociationFeatureMember returns [EObject current=null] : iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF ;
    public final EObject entryRuleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationFeatureMember = null;


        try {
            // InternalAlf.g:3171:65: (iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF )
            // InternalAlf.g:3172:2: iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF
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
    // InternalAlf.g:3178:1: ruleAssociationFeatureMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] ) ;
    public final EObject ruleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject this_CategoryMemberPrefix_0 = null;

        EObject this_FeatureMemberElement_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:3184:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] ) )
            // InternalAlf.g:3185:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] )
            {
            // InternalAlf.g:3185:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] )
            // InternalAlf.g:3186:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getCategoryMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
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
    // InternalAlf.g:3212:1: entryRuleAssociationEndFeatureMember returns [EObject current=null] : iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF ;
    public final EObject entryRuleAssociationEndFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEndFeatureMember = null;


        try {
            // InternalAlf.g:3212:68: (iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF )
            // InternalAlf.g:3213:2: iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF
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
    // InternalAlf.g:3219:1: ruleAssociationEndFeatureMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'abstract' otherlv_7= 'end' ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )? ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_12= 'end' ( (lv_isPart_13_0= 'part' ) ) ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | ( ( (lv_direction_18_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_20= 'abstract' ( (lv_direction_21_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_23_0= ruleName ) ) otherlv_24= 'is' ( ( ruleQualifiedName ) ) otherlv_26= ';' ) ) ) ;
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
            // InternalAlf.g:3225:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'abstract' otherlv_7= 'end' ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )? ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_12= 'end' ( (lv_isPart_13_0= 'part' ) ) ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | ( ( (lv_direction_18_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_20= 'abstract' ( (lv_direction_21_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_23_0= ruleName ) ) otherlv_24= 'is' ( ( ruleQualifiedName ) ) otherlv_26= ';' ) ) ) )
            // InternalAlf.g:3226:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'abstract' otherlv_7= 'end' ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )? ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_12= 'end' ( (lv_isPart_13_0= 'part' ) ) ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | ( ( (lv_direction_18_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_20= 'abstract' ( (lv_direction_21_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_23_0= ruleName ) ) otherlv_24= 'is' ( ( ruleQualifiedName ) ) otherlv_26= ';' ) ) )
            {
            // InternalAlf.g:3226:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'abstract' otherlv_7= 'end' ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )? ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_12= 'end' ( (lv_isPart_13_0= 'part' ) ) ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | ( ( (lv_direction_18_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_20= 'abstract' ( (lv_direction_21_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_23_0= ruleName ) ) otherlv_24= 'is' ( ( ruleQualifiedName ) ) otherlv_26= ';' ) ) )
            // InternalAlf.g:3227:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'abstract' otherlv_7= 'end' ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )? ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_12= 'end' ( (lv_isPart_13_0= 'part' ) ) ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | ( ( (lv_direction_18_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_20= 'abstract' ( (lv_direction_21_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_23_0= ruleName ) ) otherlv_24= 'is' ( ( ruleQualifiedName ) ) otherlv_26= ';' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getCategoryMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_CategoryMemberPrefix_0=ruleCategoryMemberPrefix(current);

            state._fsp--;


            			current = this_CategoryMemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3238:3: ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'abstract' otherlv_7= 'end' ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )? ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_12= 'end' ( (lv_isPart_13_0= 'part' ) ) ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | ( ( (lv_direction_18_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_20= 'abstract' ( (lv_direction_21_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_23_0= ruleName ) ) otherlv_24= 'is' ( ( ruleQualifiedName ) ) otherlv_26= ';' ) )
            int alt64=6;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // InternalAlf.g:3239:4: (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:3239:4: (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) )
                    // InternalAlf.g:3240:5: otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) )
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_50); 

                    					newLeafNode(otherlv_1, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_1_0_0());
                    				
                    // InternalAlf.g:3244:5: ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )?
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
                            // InternalAlf.g:3245:6: ( (lv_isPart_2_0= 'part' ) )
                            {
                            // InternalAlf.g:3245:6: ( (lv_isPart_2_0= 'part' ) )
                            // InternalAlf.g:3246:7: (lv_isPart_2_0= 'part' )
                            {
                            // InternalAlf.g:3246:7: (lv_isPart_2_0= 'part' )
                            // InternalAlf.g:3247:8: lv_isPart_2_0= 'part'
                            {
                            lv_isPart_2_0=(Token)match(input,34,FOLLOW_37); 

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
                            // InternalAlf.g:3260:6: ( (lv_isPort_3_0= 'port' ) )
                            {
                            // InternalAlf.g:3260:6: ( (lv_isPort_3_0= 'port' ) )
                            // InternalAlf.g:3261:7: (lv_isPort_3_0= 'port' )
                            {
                            // InternalAlf.g:3261:7: (lv_isPort_3_0= 'port' )
                            // InternalAlf.g:3262:8: lv_isPort_3_0= 'port'
                            {
                            lv_isPort_3_0=(Token)match(input,35,FOLLOW_37); 

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

                    // InternalAlf.g:3275:5: ( (lv_direction_4_0= ruleFeatureDirection ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( ((LA58_0>=76 && LA58_0<=78)) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalAlf.g:3276:6: (lv_direction_4_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:3276:6: (lv_direction_4_0= ruleFeatureDirection )
                            // InternalAlf.g:3277:7: lv_direction_4_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_0_2_0());
                            						
                            pushFollow(FOLLOW_51);
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

                    // InternalAlf.g:3294:5: ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) )
                    // InternalAlf.g:3295:6: (lv_ownedRelatedElement_5_0= ruleFeatureDefinition )
                    {
                    // InternalAlf.g:3295:6: (lv_ownedRelatedElement_5_0= ruleFeatureDefinition )
                    // InternalAlf.g:3296:7: lv_ownedRelatedElement_5_0= ruleFeatureDefinition
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
                    // InternalAlf.g:3315:4: (otherlv_6= 'abstract' otherlv_7= 'end' ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )? ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:3315:4: (otherlv_6= 'abstract' otherlv_7= 'end' ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )? ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) ) )
                    // InternalAlf.g:3316:5: otherlv_6= 'abstract' otherlv_7= 'end' ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )? ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_52); 

                    					newLeafNode(otherlv_6, grammarAccess.getAssociationEndFeatureMemberAccess().getAbstractKeyword_1_1_0());
                    				
                    otherlv_7=(Token)match(input,39,FOLLOW_50); 

                    					newLeafNode(otherlv_7, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_1_1_1());
                    				
                    // InternalAlf.g:3324:5: ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )?
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
                            // InternalAlf.g:3325:6: ( (lv_isPart_8_0= 'part' ) )
                            {
                            // InternalAlf.g:3325:6: ( (lv_isPart_8_0= 'part' ) )
                            // InternalAlf.g:3326:7: (lv_isPart_8_0= 'part' )
                            {
                            // InternalAlf.g:3326:7: (lv_isPart_8_0= 'part' )
                            // InternalAlf.g:3327:8: lv_isPart_8_0= 'part'
                            {
                            lv_isPart_8_0=(Token)match(input,34,FOLLOW_37); 

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
                            // InternalAlf.g:3340:6: ( (lv_isPort_9_0= 'port' ) )
                            {
                            // InternalAlf.g:3340:6: ( (lv_isPort_9_0= 'port' ) )
                            // InternalAlf.g:3341:7: (lv_isPort_9_0= 'port' )
                            {
                            // InternalAlf.g:3341:7: (lv_isPort_9_0= 'port' )
                            // InternalAlf.g:3342:8: lv_isPort_9_0= 'port'
                            {
                            lv_isPort_9_0=(Token)match(input,35,FOLLOW_37); 

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

                    // InternalAlf.g:3355:5: ( (lv_direction_10_0= ruleFeatureDirection ) )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( ((LA60_0>=76 && LA60_0<=78)) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalAlf.g:3356:6: (lv_direction_10_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:3356:6: (lv_direction_10_0= ruleFeatureDirection )
                            // InternalAlf.g:3357:7: lv_direction_10_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_1_3_0());
                            						
                            pushFollow(FOLLOW_37);
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

                    // InternalAlf.g:3374:5: ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) )
                    // InternalAlf.g:3375:6: (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition )
                    {
                    // InternalAlf.g:3375:6: (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition )
                    // InternalAlf.g:3376:7: lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition
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
                    // InternalAlf.g:3395:4: (otherlv_12= 'end' ( (lv_isPart_13_0= 'part' ) ) ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    {
                    // InternalAlf.g:3395:4: (otherlv_12= 'end' ( (lv_isPart_13_0= 'part' ) ) ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    // InternalAlf.g:3396:5: otherlv_12= 'end' ( (lv_isPart_13_0= 'part' ) ) ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';'
                    {
                    otherlv_12=(Token)match(input,39,FOLLOW_53); 

                    					newLeafNode(otherlv_12, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_1_2_0());
                    				
                    // InternalAlf.g:3400:5: ( (lv_isPart_13_0= 'part' ) )
                    // InternalAlf.g:3401:6: (lv_isPart_13_0= 'part' )
                    {
                    // InternalAlf.g:3401:6: (lv_isPart_13_0= 'part' )
                    // InternalAlf.g:3402:7: lv_isPart_13_0= 'part'
                    {
                    lv_isPart_13_0=(Token)match(input,34,FOLLOW_24); 

                    							newLeafNode(lv_isPart_13_0, grammarAccess.getAssociationEndFeatureMemberAccess().getIsPartPartKeyword_1_2_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    							setWithLastConsumed(current, "isPart", true, "part");
                    						

                    }


                    }

                    // InternalAlf.g:3414:5: ( (lv_memberName_14_0= ruleName ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalAlf.g:3415:6: (lv_memberName_14_0= ruleName )
                            {
                            // InternalAlf.g:3415:6: (lv_memberName_14_0= ruleName )
                            // InternalAlf.g:3416:7: lv_memberName_14_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_2_0());
                            						
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
                            break;

                    }

                    otherlv_15=(Token)match(input,25,FOLLOW_13); 

                    					newLeafNode(otherlv_15, grammarAccess.getAssociationEndFeatureMemberAccess().getIsKeyword_1_2_3());
                    				
                    // InternalAlf.g:3437:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:3438:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:3438:6: ( ruleQualifiedName )
                    // InternalAlf.g:3439:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberFeatureFeatureCrossReference_1_2_4_0());
                    						
                    pushFollow(FOLLOW_16);
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
                    // InternalAlf.g:3459:4: ( ( (lv_direction_18_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:3459:4: ( ( (lv_direction_18_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:3460:5: ( (lv_direction_18_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:3460:5: ( (lv_direction_18_0= ruleFeatureDirection ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( ((LA62_0>=76 && LA62_0<=78)) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalAlf.g:3461:6: (lv_direction_18_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:3461:6: (lv_direction_18_0= ruleFeatureDirection )
                            // InternalAlf.g:3462:7: lv_direction_18_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_3_0_0());
                            						
                            pushFollow(FOLLOW_26);
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

                    // InternalAlf.g:3479:5: ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:3480:6: (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:3480:6: (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:3481:7: lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:3500:4: (otherlv_20= 'abstract' ( (lv_direction_21_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:3500:4: (otherlv_20= 'abstract' ( (lv_direction_21_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) ) )
                    // InternalAlf.g:3501:5: otherlv_20= 'abstract' ( (lv_direction_21_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) )
                    {
                    otherlv_20=(Token)match(input,33,FOLLOW_32); 

                    					newLeafNode(otherlv_20, grammarAccess.getAssociationEndFeatureMemberAccess().getAbstractKeyword_1_4_0());
                    				
                    // InternalAlf.g:3505:5: ( (lv_direction_21_0= ruleFeatureDirection ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( ((LA63_0>=76 && LA63_0<=78)) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalAlf.g:3506:6: (lv_direction_21_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:3506:6: (lv_direction_21_0= ruleFeatureDirection )
                            // InternalAlf.g:3507:7: lv_direction_21_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_4_1_0());
                            						
                            pushFollow(FOLLOW_26);
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

                    // InternalAlf.g:3524:5: ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) )
                    // InternalAlf.g:3525:6: (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition )
                    {
                    // InternalAlf.g:3525:6: (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition )
                    // InternalAlf.g:3526:7: lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition
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
                    // InternalAlf.g:3545:4: ( ( (lv_memberName_23_0= ruleName ) ) otherlv_24= 'is' ( ( ruleQualifiedName ) ) otherlv_26= ';' )
                    {
                    // InternalAlf.g:3545:4: ( ( (lv_memberName_23_0= ruleName ) ) otherlv_24= 'is' ( ( ruleQualifiedName ) ) otherlv_26= ';' )
                    // InternalAlf.g:3546:5: ( (lv_memberName_23_0= ruleName ) ) otherlv_24= 'is' ( ( ruleQualifiedName ) ) otherlv_26= ';'
                    {
                    // InternalAlf.g:3546:5: ( (lv_memberName_23_0= ruleName ) )
                    // InternalAlf.g:3547:6: (lv_memberName_23_0= ruleName )
                    {
                    // InternalAlf.g:3547:6: (lv_memberName_23_0= ruleName )
                    // InternalAlf.g:3548:7: lv_memberName_23_0= ruleName
                    {

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberNameNameParserRuleCall_1_5_0_0());
                    						
                    pushFollow(FOLLOW_25);
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

                    otherlv_24=(Token)match(input,25,FOLLOW_13); 

                    					newLeafNode(otherlv_24, grammarAccess.getAssociationEndFeatureMemberAccess().getIsKeyword_1_5_1());
                    				
                    // InternalAlf.g:3569:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:3570:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:3570:6: ( ruleQualifiedName )
                    // InternalAlf.g:3571:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberFeatureFeatureCrossReference_1_5_2_0());
                    						
                    pushFollow(FOLLOW_16);
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
    // InternalAlf.g:3595:1: entryRuleBehaviorDefinitionOrStub returns [EObject current=null] : iv_ruleBehaviorDefinitionOrStub= ruleBehaviorDefinitionOrStub EOF ;
    public final EObject entryRuleBehaviorDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorDefinitionOrStub = null;


        try {
            // InternalAlf.g:3595:65: (iv_ruleBehaviorDefinitionOrStub= ruleBehaviorDefinitionOrStub EOF )
            // InternalAlf.g:3596:2: iv_ruleBehaviorDefinitionOrStub= ruleBehaviorDefinitionOrStub EOF
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
    // InternalAlf.g:3602:1: ruleBehaviorDefinitionOrStub returns [EObject current=null] : (this_BehaviorDeclaration_0= ruleBehaviorDeclaration[$current] otherlv_1= ';' ) ;
    public final EObject ruleBehaviorDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_BehaviorDeclaration_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3608:2: ( (this_BehaviorDeclaration_0= ruleBehaviorDeclaration[$current] otherlv_1= ';' ) )
            // InternalAlf.g:3609:2: (this_BehaviorDeclaration_0= ruleBehaviorDeclaration[$current] otherlv_1= ';' )
            {
            // InternalAlf.g:3609:2: (this_BehaviorDeclaration_0= ruleBehaviorDeclaration[$current] otherlv_1= ';' )
            // InternalAlf.g:3610:3: this_BehaviorDeclaration_0= ruleBehaviorDeclaration[$current] otherlv_1= ';'
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
    // InternalAlf.g:3630:1: ruleBehaviorDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'behavior' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] (this_SpecializationList_4= ruleSpecializationList[$current] )? ) ;
    public final EObject ruleBehaviorDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject this_ParameterList_3 = null;

        EObject this_SpecializationList_4 = null;



        	enterRule();

        try {
            // InternalAlf.g:3636:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'behavior' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] (this_SpecializationList_4= ruleSpecializationList[$current] )? ) )
            // InternalAlf.g:3637:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'behavior' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] (this_SpecializationList_4= ruleSpecializationList[$current] )? )
            {
            // InternalAlf.g:3637:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'behavior' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] (this_SpecializationList_4= ruleSpecializationList[$current] )? )
            // InternalAlf.g:3638:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'behavior' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] (this_SpecializationList_4= ruleSpecializationList[$current] )?
            {
            // InternalAlf.g:3638:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==33) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalAlf.g:3639:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:3639:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:3640:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,33,FOLLOW_54); 

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
            		
            // InternalAlf.g:3656:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:3657:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:3657:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:3658:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getBehaviorDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_55);
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
            		
            pushFollow(FOLLOW_42);
            this_ParameterList_3=ruleParameterList(current);

            state._fsp--;


            			current = this_ParameterList_3;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3686:3: (this_SpecializationList_4= ruleSpecializationList[$current] )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==37) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalAlf.g:3687:4: this_SpecializationList_4= ruleSpecializationList[$current]
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
    // InternalAlf.g:3704:1: ruleParameterList[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '(' ( ( (lv_ownedRelationship_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleParameterMember ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleParameterList(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject lv_ownedRelationship_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3710:2: ( (otherlv_0= '(' ( ( (lv_ownedRelationship_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleParameterMember ) ) )* )? otherlv_4= ')' ) )
            // InternalAlf.g:3711:2: (otherlv_0= '(' ( ( (lv_ownedRelationship_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleParameterMember ) ) )* )? otherlv_4= ')' )
            {
            // InternalAlf.g:3711:2: (otherlv_0= '(' ( ( (lv_ownedRelationship_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleParameterMember ) ) )* )? otherlv_4= ')' )
            // InternalAlf.g:3712:3: otherlv_0= '(' ( ( (lv_ownedRelationship_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleParameterMember ) ) )* )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_56); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_0());
            		
            // InternalAlf.g:3716:3: ( ( (lv_ownedRelationship_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleParameterMember ) ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=RULE_ID && LA68_0<=RULE_UNRESTRICTED_NAME)||(LA68_0>=76 && LA68_0<=78)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalAlf.g:3717:4: ( (lv_ownedRelationship_1_0= ruleParameterMember ) ) (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleParameterMember ) ) )*
                    {
                    // InternalAlf.g:3717:4: ( (lv_ownedRelationship_1_0= ruleParameterMember ) )
                    // InternalAlf.g:3718:5: (lv_ownedRelationship_1_0= ruleParameterMember )
                    {
                    // InternalAlf.g:3718:5: (lv_ownedRelationship_1_0= ruleParameterMember )
                    // InternalAlf.g:3719:6: lv_ownedRelationship_1_0= ruleParameterMember
                    {

                    						newCompositeNode(grammarAccess.getParameterListAccess().getOwnedRelationshipParameterMemberParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_57);
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

                    // InternalAlf.g:3736:4: (otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleParameterMember ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==38) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalAlf.g:3737:5: otherlv_2= ',' ( (lv_ownedRelationship_3_0= ruleParameterMember ) )
                    	    {
                    	    otherlv_2=(Token)match(input,38,FOLLOW_58); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getParameterListAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalAlf.g:3741:5: ( (lv_ownedRelationship_3_0= ruleParameterMember ) )
                    	    // InternalAlf.g:3742:6: (lv_ownedRelationship_3_0= ruleParameterMember )
                    	    {
                    	    // InternalAlf.g:3742:6: (lv_ownedRelationship_3_0= ruleParameterMember )
                    	    // InternalAlf.g:3743:7: lv_ownedRelationship_3_0= ruleParameterMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterListAccess().getOwnedRelationshipParameterMemberParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_57);
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


    // $ANTLR start "entryRuleParameterMember"
    // InternalAlf.g:3770:1: entryRuleParameterMember returns [EObject current=null] : iv_ruleParameterMember= ruleParameterMember EOF ;
    public final EObject entryRuleParameterMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterMember = null;


        try {
            // InternalAlf.g:3770:56: (iv_ruleParameterMember= ruleParameterMember EOF )
            // InternalAlf.g:3771:2: iv_ruleParameterMember= ruleParameterMember EOF
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
    // InternalAlf.g:3777:1: ruleParameterMember returns [EObject current=null] : ( ( (lv_direction_0_0= ruleFeatureDirection ) )? ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleParameterDefinition ) ) ) ;
    public final EObject ruleParameterMember() throws RecognitionException {
        EObject current = null;

        Enumerator lv_direction_0_0 = null;

        AntlrDatatypeRuleToken lv_memberName_1_0 = null;

        EObject lv_ownedRelatedElement_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3783:2: ( ( ( (lv_direction_0_0= ruleFeatureDirection ) )? ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleParameterDefinition ) ) ) )
            // InternalAlf.g:3784:2: ( ( (lv_direction_0_0= ruleFeatureDirection ) )? ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleParameterDefinition ) ) )
            {
            // InternalAlf.g:3784:2: ( ( (lv_direction_0_0= ruleFeatureDirection ) )? ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleParameterDefinition ) ) )
            // InternalAlf.g:3785:3: ( (lv_direction_0_0= ruleFeatureDirection ) )? ( (lv_memberName_1_0= ruleName ) ) ( (lv_ownedRelatedElement_2_0= ruleParameterDefinition ) )
            {
            // InternalAlf.g:3785:3: ( (lv_direction_0_0= ruleFeatureDirection ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=76 && LA69_0<=78)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalAlf.g:3786:4: (lv_direction_0_0= ruleFeatureDirection )
                    {
                    // InternalAlf.g:3786:4: (lv_direction_0_0= ruleFeatureDirection )
                    // InternalAlf.g:3787:5: lv_direction_0_0= ruleFeatureDirection
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

            // InternalAlf.g:3804:3: ( (lv_memberName_1_0= ruleName ) )
            // InternalAlf.g:3805:4: (lv_memberName_1_0= ruleName )
            {
            // InternalAlf.g:3805:4: (lv_memberName_1_0= ruleName )
            // InternalAlf.g:3806:5: lv_memberName_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getParameterMemberAccess().getMemberNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_59);
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

            // InternalAlf.g:3823:3: ( (lv_ownedRelatedElement_2_0= ruleParameterDefinition ) )
            // InternalAlf.g:3824:4: (lv_ownedRelatedElement_2_0= ruleParameterDefinition )
            {
            // InternalAlf.g:3824:4: (lv_ownedRelatedElement_2_0= ruleParameterDefinition )
            // InternalAlf.g:3825:5: lv_ownedRelatedElement_2_0= ruleParameterDefinition
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


    // $ANTLR start "entryRuleFunctionDefinitionOrStub"
    // InternalAlf.g:3846:1: entryRuleFunctionDefinitionOrStub returns [EObject current=null] : iv_ruleFunctionDefinitionOrStub= ruleFunctionDefinitionOrStub EOF ;
    public final EObject entryRuleFunctionDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinitionOrStub = null;


        try {
            // InternalAlf.g:3846:65: (iv_ruleFunctionDefinitionOrStub= ruleFunctionDefinitionOrStub EOF )
            // InternalAlf.g:3847:2: iv_ruleFunctionDefinitionOrStub= ruleFunctionDefinitionOrStub EOF
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
    // InternalAlf.g:3853:1: ruleFunctionDefinitionOrStub returns [EObject current=null] : (this_FunctionDeclaration_0= ruleFunctionDeclaration[$current] otherlv_1= ';' ) ;
    public final EObject ruleFunctionDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_FunctionDeclaration_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3859:2: ( (this_FunctionDeclaration_0= ruleFunctionDeclaration[$current] otherlv_1= ';' ) )
            // InternalAlf.g:3860:2: (this_FunctionDeclaration_0= ruleFunctionDeclaration[$current] otherlv_1= ';' )
            {
            // InternalAlf.g:3860:2: (this_FunctionDeclaration_0= ruleFunctionDeclaration[$current] otherlv_1= ';' )
            // InternalAlf.g:3861:3: this_FunctionDeclaration_0= ruleFunctionDeclaration[$current] otherlv_1= ';'
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
    // InternalAlf.g:3881:1: ruleFunctionDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] (this_SpecializationList_5= ruleSpecializationList[$current] )? ) ;
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
            // InternalAlf.g:3887:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] (this_SpecializationList_5= ruleSpecializationList[$current] )? ) )
            // InternalAlf.g:3888:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] (this_SpecializationList_5= ruleSpecializationList[$current] )? )
            {
            // InternalAlf.g:3888:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] (this_SpecializationList_5= ruleSpecializationList[$current] )? )
            // InternalAlf.g:3889:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'function' ( (lv_name_2_0= ruleName ) ) this_ParameterList_3= ruleParameterList[$current] this_ReturnParameterPart_4= ruleReturnParameterPart[$current] (this_SpecializationList_5= ruleSpecializationList[$current] )?
            {
            // InternalAlf.g:3889:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==33) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalAlf.g:3890:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:3890:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:3891:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,33,FOLLOW_60); 

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
            		
            // InternalAlf.g:3907:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:3908:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:3908:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:3909:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_55);
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
            		
            pushFollow(FOLLOW_61);
            this_ParameterList_3=ruleParameterList(current);

            state._fsp--;


            			current = this_ParameterList_3;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFunctionDeclarationRule());
            			}
            			newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getReturnParameterPartParserRuleCall_4());
            		
            pushFollow(FOLLOW_42);
            this_ReturnParameterPart_4=ruleReturnParameterPart(current);

            state._fsp--;


            			current = this_ReturnParameterPart_4;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3948:3: (this_SpecializationList_5= ruleSpecializationList[$current] )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==37) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalAlf.g:3949:4: this_SpecializationList_5= ruleSpecializationList[$current]
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
    // InternalAlf.g:3966:1: ruleReturnParameterPart[EObject in_current] returns [EObject current=in_current] : ( (lv_ownedRelationship_0_0= ruleReturnParameterMember ) ) ;
    public final EObject ruleReturnParameterPart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedRelationship_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3972:2: ( ( (lv_ownedRelationship_0_0= ruleReturnParameterMember ) ) )
            // InternalAlf.g:3973:2: ( (lv_ownedRelationship_0_0= ruleReturnParameterMember ) )
            {
            // InternalAlf.g:3973:2: ( (lv_ownedRelationship_0_0= ruleReturnParameterMember ) )
            // InternalAlf.g:3974:3: (lv_ownedRelationship_0_0= ruleReturnParameterMember )
            {
            // InternalAlf.g:3974:3: (lv_ownedRelationship_0_0= ruleReturnParameterMember )
            // InternalAlf.g:3975:4: lv_ownedRelationship_0_0= ruleReturnParameterMember
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


    // $ANTLR start "entryRuleReturnParameterMember"
    // InternalAlf.g:3995:1: entryRuleReturnParameterMember returns [EObject current=null] : iv_ruleReturnParameterMember= ruleReturnParameterMember EOF ;
    public final EObject entryRuleReturnParameterMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnParameterMember = null;


        try {
            // InternalAlf.g:3995:62: (iv_ruleReturnParameterMember= ruleReturnParameterMember EOF )
            // InternalAlf.g:3996:2: iv_ruleReturnParameterMember= ruleReturnParameterMember EOF
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
    // InternalAlf.g:4002:1: ruleReturnParameterMember returns [EObject current=null] : ( ( (lv_memberName_0_0= ruleName ) )? ( (lv_ownedRelatedElement_1_0= ruleParameterDefinition ) ) ) ;
    public final EObject ruleReturnParameterMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_memberName_0_0 = null;

        EObject lv_ownedRelatedElement_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4008:2: ( ( ( (lv_memberName_0_0= ruleName ) )? ( (lv_ownedRelatedElement_1_0= ruleParameterDefinition ) ) ) )
            // InternalAlf.g:4009:2: ( ( (lv_memberName_0_0= ruleName ) )? ( (lv_ownedRelatedElement_1_0= ruleParameterDefinition ) ) )
            {
            // InternalAlf.g:4009:2: ( ( (lv_memberName_0_0= ruleName ) )? ( (lv_ownedRelatedElement_1_0= ruleParameterDefinition ) ) )
            // InternalAlf.g:4010:3: ( (lv_memberName_0_0= ruleName ) )? ( (lv_ownedRelatedElement_1_0= ruleParameterDefinition ) )
            {
            // InternalAlf.g:4010:3: ( (lv_memberName_0_0= ruleName ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=RULE_ID && LA72_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalAlf.g:4011:4: (lv_memberName_0_0= ruleName )
                    {
                    // InternalAlf.g:4011:4: (lv_memberName_0_0= ruleName )
                    // InternalAlf.g:4012:5: lv_memberName_0_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getReturnParameterMemberAccess().getMemberNameNameParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_59);
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

            // InternalAlf.g:4029:3: ( (lv_ownedRelatedElement_1_0= ruleParameterDefinition ) )
            // InternalAlf.g:4030:4: (lv_ownedRelatedElement_1_0= ruleParameterDefinition )
            {
            // InternalAlf.g:4030:4: (lv_ownedRelatedElement_1_0= ruleParameterDefinition )
            // InternalAlf.g:4031:5: lv_ownedRelatedElement_1_0= ruleParameterDefinition
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


    // $ANTLR start "entryRuleFeatureDefinition"
    // InternalAlf.g:4052:1: entryRuleFeatureDefinition returns [EObject current=null] : iv_ruleFeatureDefinition= ruleFeatureDefinition EOF ;
    public final EObject entryRuleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDefinition = null;


        try {
            // InternalAlf.g:4052:58: (iv_ruleFeatureDefinition= ruleFeatureDefinition EOF )
            // InternalAlf.g:4053:2: iv_ruleFeatureDefinition= ruleFeatureDefinition EOF
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
    // InternalAlf.g:4059:1: ruleFeatureDefinition returns [EObject current=null] : (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) ;
    public final EObject ruleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_NamedFeatureDefinition_0 = null;

        EObject this_UnnamedFeatureDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:4065:2: ( (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) )
            // InternalAlf.g:4066:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            {
            // InternalAlf.g:4066:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=RULE_ID && LA73_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt73=1;
            }
            else if ( (LA73_0==42) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalAlf.g:4067:3: this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:4076:3: this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition
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
    // InternalAlf.g:4088:1: entryRuleAbstractFeatureDefinition returns [EObject current=null] : iv_ruleAbstractFeatureDefinition= ruleAbstractFeatureDefinition EOF ;
    public final EObject entryRuleAbstractFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractFeatureDefinition = null;


        try {
            // InternalAlf.g:4088:66: (iv_ruleAbstractFeatureDefinition= ruleAbstractFeatureDefinition EOF )
            // InternalAlf.g:4089:2: iv_ruleAbstractFeatureDefinition= ruleAbstractFeatureDefinition EOF
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
    // InternalAlf.g:4095:1: ruleAbstractFeatureDefinition returns [EObject current=null] : (this_AbstractNamedFeatureDefinition_0= ruleAbstractNamedFeatureDefinition | this_AbstractUnnamedFeatureDefinition_1= ruleAbstractUnnamedFeatureDefinition ) ;
    public final EObject ruleAbstractFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractNamedFeatureDefinition_0 = null;

        EObject this_AbstractUnnamedFeatureDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:4101:2: ( (this_AbstractNamedFeatureDefinition_0= ruleAbstractNamedFeatureDefinition | this_AbstractUnnamedFeatureDefinition_1= ruleAbstractUnnamedFeatureDefinition ) )
            // InternalAlf.g:4102:2: (this_AbstractNamedFeatureDefinition_0= ruleAbstractNamedFeatureDefinition | this_AbstractUnnamedFeatureDefinition_1= ruleAbstractUnnamedFeatureDefinition )
            {
            // InternalAlf.g:4102:2: (this_AbstractNamedFeatureDefinition_0= ruleAbstractNamedFeatureDefinition | this_AbstractUnnamedFeatureDefinition_1= ruleAbstractUnnamedFeatureDefinition )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=RULE_ID && LA74_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt74=1;
            }
            else if ( (LA74_0==42) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalAlf.g:4103:3: this_AbstractNamedFeatureDefinition_0= ruleAbstractNamedFeatureDefinition
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
                    // InternalAlf.g:4112:3: this_AbstractUnnamedFeatureDefinition_1= ruleAbstractUnnamedFeatureDefinition
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
    // InternalAlf.g:4124:1: entryRuleNamedFeatureDefinition returns [EObject current=null] : iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF ;
    public final EObject entryRuleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedFeatureDefinition = null;


        try {
            // InternalAlf.g:4124:63: (iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF )
            // InternalAlf.g:4125:2: iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF
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
    // InternalAlf.g:4131:1: ruleNamedFeatureDefinition returns [EObject current=null] : (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureDeclaration_0 = null;

        EObject this_FeatureCompletion_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:4137:2: ( (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:4138:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:4138:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] )
            // InternalAlf.g:4139:3: this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getNamedFeatureDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getFeatureDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_62);
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
    // InternalAlf.g:4165:1: entryRuleAbstractNamedFeatureDefinition returns [EObject current=null] : iv_ruleAbstractNamedFeatureDefinition= ruleAbstractNamedFeatureDefinition EOF ;
    public final EObject entryRuleAbstractNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNamedFeatureDefinition = null;


        try {
            // InternalAlf.g:4165:71: (iv_ruleAbstractNamedFeatureDefinition= ruleAbstractNamedFeatureDefinition EOF )
            // InternalAlf.g:4166:2: iv_ruleAbstractNamedFeatureDefinition= ruleAbstractNamedFeatureDefinition EOF
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
    // InternalAlf.g:4172:1: ruleAbstractNamedFeatureDefinition returns [EObject current=null] : (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_AbstractFeatureCompletion_1= ruleAbstractFeatureCompletion[$current] ) ;
    public final EObject ruleAbstractNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureDeclaration_0 = null;

        EObject this_AbstractFeatureCompletion_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:4178:2: ( (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_AbstractFeatureCompletion_1= ruleAbstractFeatureCompletion[$current] ) )
            // InternalAlf.g:4179:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_AbstractFeatureCompletion_1= ruleAbstractFeatureCompletion[$current] )
            {
            // InternalAlf.g:4179:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_AbstractFeatureCompletion_1= ruleAbstractFeatureCompletion[$current] )
            // InternalAlf.g:4180:3: this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_AbstractFeatureCompletion_1= ruleAbstractFeatureCompletion[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAbstractNamedFeatureDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getAbstractNamedFeatureDefinitionAccess().getFeatureDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_62);
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
    // InternalAlf.g:4206:1: entryRuleUnnamedFeatureDefinition returns [EObject current=null] : iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF ;
    public final EObject entryRuleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedFeatureDefinition = null;


        try {
            // InternalAlf.g:4206:65: (iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF )
            // InternalAlf.g:4207:2: iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF
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
    // InternalAlf.g:4213:1: ruleUnnamedFeatureDefinition returns [EObject current=null] : (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject this_TypePart_2 = null;

        EObject this_FeatureCompletion_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:4219:2: ( (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:4220:2: (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:4220:2: (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current] )
            // InternalAlf.g:4221:3: otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current]
            {
            otherlv_0=(Token)match(input,42,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getUnnamedFeatureDefinitionAccess().getRedefinesKeyword_0());
            		
            // InternalAlf.g:4225:3: ( (lv_ownedRelationship_1_0= ruleRedefinition ) )
            // InternalAlf.g:4226:4: (lv_ownedRelationship_1_0= ruleRedefinition )
            {
            // InternalAlf.g:4226:4: (lv_ownedRelationship_1_0= ruleRedefinition )
            // InternalAlf.g:4227:5: lv_ownedRelationship_1_0= ruleRedefinition
            {

            					newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedRelationshipRedefinitionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_63);
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
            		
            pushFollow(FOLLOW_62);
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
    // InternalAlf.g:4270:1: entryRuleAbstractUnnamedFeatureDefinition returns [EObject current=null] : iv_ruleAbstractUnnamedFeatureDefinition= ruleAbstractUnnamedFeatureDefinition EOF ;
    public final EObject entryRuleAbstractUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractUnnamedFeatureDefinition = null;


        try {
            // InternalAlf.g:4270:73: (iv_ruleAbstractUnnamedFeatureDefinition= ruleAbstractUnnamedFeatureDefinition EOF )
            // InternalAlf.g:4271:2: iv_ruleAbstractUnnamedFeatureDefinition= ruleAbstractUnnamedFeatureDefinition EOF
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
    // InternalAlf.g:4277:1: ruleAbstractUnnamedFeatureDefinition returns [EObject current=null] : (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_AbstractFeatureCompletion_3= ruleAbstractFeatureCompletion[$current] ) ;
    public final EObject ruleAbstractUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject this_TypePart_2 = null;

        EObject this_AbstractFeatureCompletion_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:4283:2: ( (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_AbstractFeatureCompletion_3= ruleAbstractFeatureCompletion[$current] ) )
            // InternalAlf.g:4284:2: (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_AbstractFeatureCompletion_3= ruleAbstractFeatureCompletion[$current] )
            {
            // InternalAlf.g:4284:2: (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_AbstractFeatureCompletion_3= ruleAbstractFeatureCompletion[$current] )
            // InternalAlf.g:4285:3: otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) this_TypePart_2= ruleTypePart[$current] this_AbstractFeatureCompletion_3= ruleAbstractFeatureCompletion[$current]
            {
            otherlv_0=(Token)match(input,42,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractUnnamedFeatureDefinitionAccess().getRedefinesKeyword_0());
            		
            // InternalAlf.g:4289:3: ( (lv_ownedRelationship_1_0= ruleRedefinition ) )
            // InternalAlf.g:4290:4: (lv_ownedRelationship_1_0= ruleRedefinition )
            {
            // InternalAlf.g:4290:4: (lv_ownedRelationship_1_0= ruleRedefinition )
            // InternalAlf.g:4291:5: lv_ownedRelationship_1_0= ruleRedefinition
            {

            					newCompositeNode(grammarAccess.getAbstractUnnamedFeatureDefinitionAccess().getOwnedRelationshipRedefinitionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_63);
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
            		
            pushFollow(FOLLOW_62);
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
    // InternalAlf.g:4335:1: ruleFeatureBodyDefinition[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'feature' this_FeatureDeclaration_2= ruleFeatureDeclaration[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleFeatureBodyDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        EObject this_FeatureDeclaration_2 = null;

        EObject this_FeatureCompletion_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:4341:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'feature' this_FeatureDeclaration_2= ruleFeatureDeclaration[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:4342:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'feature' this_FeatureDeclaration_2= ruleFeatureDeclaration[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:4342:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'feature' this_FeatureDeclaration_2= ruleFeatureDeclaration[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current] )
            // InternalAlf.g:4343:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'feature' this_FeatureDeclaration_2= ruleFeatureDeclaration[$current] this_FeatureCompletion_3= ruleFeatureCompletion[$current]
            {
            // InternalAlf.g:4343:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==33) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalAlf.g:4344:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:4344:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:4345:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,33,FOLLOW_28); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getFeatureBodyDefinitionAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureBodyDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureBodyDefinitionAccess().getFeatureKeyword_1());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureBodyDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureBodyDefinitionAccess().getFeatureDeclarationParserRuleCall_2());
            		
            pushFollow(FOLLOW_62);
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
    // InternalAlf.g:4388:1: ruleFeatureDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= ruleName ) ) this_TypePart_1= ruleTypePart[$current] this_SubsettingPart_2= ruleSubsettingPart[$current] ) ;
    public final EObject ruleFeatureDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject this_TypePart_1 = null;

        EObject this_SubsettingPart_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4394:2: ( ( ( (lv_name_0_0= ruleName ) ) this_TypePart_1= ruleTypePart[$current] this_SubsettingPart_2= ruleSubsettingPart[$current] ) )
            // InternalAlf.g:4395:2: ( ( (lv_name_0_0= ruleName ) ) this_TypePart_1= ruleTypePart[$current] this_SubsettingPart_2= ruleSubsettingPart[$current] )
            {
            // InternalAlf.g:4395:2: ( ( (lv_name_0_0= ruleName ) ) this_TypePart_1= ruleTypePart[$current] this_SubsettingPart_2= ruleSubsettingPart[$current] )
            // InternalAlf.g:4396:3: ( (lv_name_0_0= ruleName ) ) this_TypePart_1= ruleTypePart[$current] this_SubsettingPart_2= ruleSubsettingPart[$current]
            {
            // InternalAlf.g:4396:3: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:4397:4: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:4397:4: (lv_name_0_0= ruleName )
            // InternalAlf.g:4398:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_59);
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
            		
            pushFollow(FOLLOW_64);
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
    // InternalAlf.g:4442:1: ruleFeatureCompletion[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current] ) ;
    public final EObject ruleFeatureCompletion(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject this_CategoryBody_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4448:2: ( ( (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current] ) )
            // InternalAlf.g:4449:2: ( (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:4449:2: ( (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current] )
            // InternalAlf.g:4450:3: (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current]
            {
            // InternalAlf.g:4450:3: (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==43) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalAlf.g:4451:4: otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) )
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_65); 

                    				newLeafNode(otherlv_0, grammarAccess.getFeatureCompletionAccess().getEqualsSignKeyword_0_0());
                    			
                    // InternalAlf.g:4455:4: ( (lv_ownedRelationship_1_0= ruleFeatureValue ) )
                    // InternalAlf.g:4456:5: (lv_ownedRelationship_1_0= ruleFeatureValue )
                    {
                    // InternalAlf.g:4456:5: (lv_ownedRelationship_1_0= ruleFeatureValue )
                    // InternalAlf.g:4457:6: lv_ownedRelationship_1_0= ruleFeatureValue
                    {

                    						newCompositeNode(grammarAccess.getFeatureCompletionAccess().getOwnedRelationshipFeatureValueParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_40);
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
    // InternalAlf.g:4491:1: ruleAbstractFeatureCompletion[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )? this_AbstractCategoryBody_2= ruleAbstractCategoryBody[$current] ) ;
    public final EObject ruleAbstractFeatureCompletion(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject this_AbstractCategoryBody_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4497:2: ( ( (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )? this_AbstractCategoryBody_2= ruleAbstractCategoryBody[$current] ) )
            // InternalAlf.g:4498:2: ( (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )? this_AbstractCategoryBody_2= ruleAbstractCategoryBody[$current] )
            {
            // InternalAlf.g:4498:2: ( (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )? this_AbstractCategoryBody_2= ruleAbstractCategoryBody[$current] )
            // InternalAlf.g:4499:3: (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )? this_AbstractCategoryBody_2= ruleAbstractCategoryBody[$current]
            {
            // InternalAlf.g:4499:3: (otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==43) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalAlf.g:4500:4: otherlv_0= '=' ( (lv_ownedRelationship_1_0= ruleFeatureValue ) )
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_65); 

                    				newLeafNode(otherlv_0, grammarAccess.getAbstractFeatureCompletionAccess().getEqualsSignKeyword_0_0());
                    			
                    // InternalAlf.g:4504:4: ( (lv_ownedRelationship_1_0= ruleFeatureValue ) )
                    // InternalAlf.g:4505:5: (lv_ownedRelationship_1_0= ruleFeatureValue )
                    {
                    // InternalAlf.g:4505:5: (lv_ownedRelationship_1_0= ruleFeatureValue )
                    // InternalAlf.g:4506:6: lv_ownedRelationship_1_0= ruleFeatureValue
                    {

                    						newCompositeNode(grammarAccess.getAbstractFeatureCompletionAccess().getOwnedRelationshipFeatureValueParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_62);
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
    // InternalAlf.g:4539:1: entryRuleFeatureValue returns [EObject current=null] : iv_ruleFeatureValue= ruleFeatureValue EOF ;
    public final EObject entryRuleFeatureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureValue = null;


        try {
            // InternalAlf.g:4539:53: (iv_ruleFeatureValue= ruleFeatureValue EOF )
            // InternalAlf.g:4540:2: iv_ruleFeatureValue= ruleFeatureValue EOF
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
    // InternalAlf.g:4546:1: ruleFeatureValue returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleExpression ) ) ;
    public final EObject ruleFeatureValue() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4552:2: ( ( (lv_ownedRelatedElement_0_0= ruleExpression ) ) )
            // InternalAlf.g:4553:2: ( (lv_ownedRelatedElement_0_0= ruleExpression ) )
            {
            // InternalAlf.g:4553:2: ( (lv_ownedRelatedElement_0_0= ruleExpression ) )
            // InternalAlf.g:4554:3: (lv_ownedRelatedElement_0_0= ruleExpression )
            {
            // InternalAlf.g:4554:3: (lv_ownedRelatedElement_0_0= ruleExpression )
            // InternalAlf.g:4555:4: lv_ownedRelatedElement_0_0= ruleExpression
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
    // InternalAlf.g:4576:1: ruleTypePart[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )? ( (lv_ownedRelationship_4_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) ) ) ;
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
            // InternalAlf.g:4582:2: ( ( (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )? ( (lv_ownedRelationship_4_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) ) ) )
            // InternalAlf.g:4583:2: ( (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )? ( (lv_ownedRelationship_4_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) ) )
            {
            // InternalAlf.g:4583:2: ( (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )? ( (lv_ownedRelationship_4_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) ) )
            // InternalAlf.g:4584:3: (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )? ( (lv_ownedRelationship_4_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) )
            {
            // InternalAlf.g:4584:3: (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==44) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalAlf.g:4585:4: otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' )
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_66); 

                    				newLeafNode(otherlv_0, grammarAccess.getTypePartAccess().getColonKeyword_0_0());
                    			
                    // InternalAlf.g:4589:4: ( (lv_isComposite_1_0= 'compose' ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==45) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // InternalAlf.g:4590:5: (lv_isComposite_1_0= 'compose' )
                            {
                            // InternalAlf.g:4590:5: (lv_isComposite_1_0= 'compose' )
                            // InternalAlf.g:4591:6: lv_isComposite_1_0= 'compose'
                            {
                            lv_isComposite_1_0=(Token)match(input,45,FOLLOW_67); 

                            						newLeafNode(lv_isComposite_1_0, grammarAccess.getTypePartAccess().getIsCompositeComposeKeyword_0_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTypePartRule());
                            						}
                            						setWithLastConsumed(current, "isComposite", true, "compose");
                            					

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:4603:4: ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' )
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( ((LA79_0>=RULE_ID && LA79_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt79=1;
                    }
                    else if ( (LA79_0==46) ) {
                        alt79=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalAlf.g:4604:5: ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) )
                            {
                            // InternalAlf.g:4604:5: ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) )
                            // InternalAlf.g:4605:6: (lv_ownedRelationship_2_0= ruleFeatureTyping )
                            {
                            // InternalAlf.g:4605:6: (lv_ownedRelationship_2_0= ruleFeatureTyping )
                            // InternalAlf.g:4606:7: lv_ownedRelationship_2_0= ruleFeatureTyping
                            {

                            							newCompositeNode(grammarAccess.getTypePartAccess().getOwnedRelationshipFeatureTypingParserRuleCall_0_2_0_0());
                            						
                            pushFollow(FOLLOW_68);
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
                            // InternalAlf.g:4624:5: otherlv_3= 'any'
                            {
                            otherlv_3=(Token)match(input,46,FOLLOW_68); 

                            					newLeafNode(otherlv_3, grammarAccess.getTypePartAccess().getAnyKeyword_0_2_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalAlf.g:4630:3: ( (lv_ownedRelationship_4_0= ruleMultiplicity ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==49) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalAlf.g:4631:4: (lv_ownedRelationship_4_0= ruleMultiplicity )
                    {
                    // InternalAlf.g:4631:4: (lv_ownedRelationship_4_0= ruleMultiplicity )
                    // InternalAlf.g:4632:5: lv_ownedRelationship_4_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getTypePartAccess().getOwnedRelationshipMultiplicityParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_69);
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

            // InternalAlf.g:4649:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) )
            // InternalAlf.g:4650:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) )
            {
            // InternalAlf.g:4650:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) )
            // InternalAlf.g:4651:5: ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTypePartAccess().getUnorderedGroup_2());
            				
            // InternalAlf.g:4654:5: ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* )
            // InternalAlf.g:4655:6: ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )*
            {
            // InternalAlf.g:4655:6: ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )*
            loop82:
            do {
                int alt82=3;
                int LA82_0 = input.LA(1);

                if ( LA82_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 0) ) {
                    alt82=1;
                }
                else if ( LA82_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 1) ) {
                    alt82=2;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalAlf.g:4656:4: ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) )
            	    {
            	    // InternalAlf.g:4656:4: ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) )
            	    // InternalAlf.g:4657:5: {...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTypePart", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAlf.g:4657:105: ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) )
            	    // InternalAlf.g:4658:6: ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAlf.g:4661:9: ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) )
            	    // InternalAlf.g:4661:10: {...}? => ( (lv_isOrdered_6_0= 'ordered' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTypePart", "true");
            	    }
            	    // InternalAlf.g:4661:19: ( (lv_isOrdered_6_0= 'ordered' ) )
            	    // InternalAlf.g:4661:20: (lv_isOrdered_6_0= 'ordered' )
            	    {
            	    // InternalAlf.g:4661:20: (lv_isOrdered_6_0= 'ordered' )
            	    // InternalAlf.g:4662:10: lv_isOrdered_6_0= 'ordered'
            	    {
            	    lv_isOrdered_6_0=(Token)match(input,47,FOLLOW_69); 

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
            	    // InternalAlf.g:4679:4: ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) )
            	    {
            	    // InternalAlf.g:4679:4: ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) )
            	    // InternalAlf.g:4680:5: {...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTypePart", "getUnorderedGroupHelper().canSelect(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAlf.g:4680:105: ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) )
            	    // InternalAlf.g:4681:6: ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTypePartAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAlf.g:4684:9: ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) )
            	    // InternalAlf.g:4684:10: {...}? => ( (lv_isNonunique_7_0= 'nonunique' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTypePart", "true");
            	    }
            	    // InternalAlf.g:4684:19: ( (lv_isNonunique_7_0= 'nonunique' ) )
            	    // InternalAlf.g:4684:20: (lv_isNonunique_7_0= 'nonunique' )
            	    {
            	    // InternalAlf.g:4684:20: (lv_isNonunique_7_0= 'nonunique' )
            	    // InternalAlf.g:4685:10: lv_isNonunique_7_0= 'nonunique'
            	    {
            	    lv_isNonunique_7_0=(Token)match(input,48,FOLLOW_69); 

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
            	    break loop82;
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
    // InternalAlf.g:4713:1: entryRuleFeatureTyping returns [EObject current=null] : iv_ruleFeatureTyping= ruleFeatureTyping EOF ;
    public final EObject entryRuleFeatureTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureTyping = null;


        try {
            // InternalAlf.g:4713:54: (iv_ruleFeatureTyping= ruleFeatureTyping EOF )
            // InternalAlf.g:4714:2: iv_ruleFeatureTyping= ruleFeatureTyping EOF
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
    // InternalAlf.g:4720:1: ruleFeatureTyping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleFeatureTyping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:4726:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:4727:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:4727:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4728:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:4728:3: ( ruleQualifiedName )
            // InternalAlf.g:4729:4: ruleQualifiedName
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
    // InternalAlf.g:4746:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalAlf.g:4746:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalAlf.g:4747:2: iv_ruleMultiplicity= ruleMultiplicity EOF
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
    // InternalAlf.g:4753:1: ruleMultiplicity returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_ownedRelatedElement_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedRelatedElement_1_0 = null;

        EObject lv_ownedRelatedElement_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4759:2: ( (otherlv_0= '[' ( ( (lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_ownedRelatedElement_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ) )
            // InternalAlf.g:4760:2: (otherlv_0= '[' ( ( (lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_ownedRelatedElement_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' )
            {
            // InternalAlf.g:4760:2: (otherlv_0= '[' ( ( (lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_ownedRelatedElement_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' )
            // InternalAlf.g:4761:3: otherlv_0= '[' ( ( (lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_ownedRelatedElement_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_70); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAlf.g:4765:3: ( ( (lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_NATURAL_VALUE) ) {
                int LA83_1 = input.LA(2);

                if ( (LA83_1==50) ) {
                    alt83=1;
                }
            }
            switch (alt83) {
                case 1 :
                    // InternalAlf.g:4766:4: ( (lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..'
                    {
                    // InternalAlf.g:4766:4: ( (lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression ) )
                    // InternalAlf.g:4767:5: (lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression )
                    {
                    // InternalAlf.g:4767:5: (lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression )
                    // InternalAlf.g:4768:6: lv_ownedRelatedElement_1_0= ruleNaturalLiteralExpression
                    {

                    						newCompositeNode(grammarAccess.getMultiplicityAccess().getOwnedRelatedElementNaturalLiteralExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_71);
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

                    otherlv_2=(Token)match(input,50,FOLLOW_70); 

                    				newLeafNode(otherlv_2, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalAlf.g:4790:3: ( (lv_ownedRelatedElement_3_0= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:4791:4: (lv_ownedRelatedElement_3_0= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:4791:4: (lv_ownedRelatedElement_3_0= ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:4792:5: lv_ownedRelatedElement_3_0= ruleUnlimitedNaturalLiteralExpression
            {

            					newCompositeNode(grammarAccess.getMultiplicityAccess().getOwnedRelatedElementUnlimitedNaturalLiteralExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_72);
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
    // InternalAlf.g:4818:1: ruleSubsettingPart[EObject in_current] returns [EObject current=in_current] : ( (this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )* ) | (this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )* ) )* ;
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
            // InternalAlf.g:4824:2: ( ( (this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )* ) | (this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )* ) )* )
            // InternalAlf.g:4825:2: ( (this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )* ) | (this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )* ) )*
            {
            // InternalAlf.g:4825:2: ( (this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )* ) | (this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )* ) )*
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
            	    // InternalAlf.g:4826:3: (this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )* )
            	    {
            	    // InternalAlf.g:4826:3: (this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )* )
            	    // InternalAlf.g:4827:4: this_Subsets_0= ruleSubsets[$current] (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )*
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getSubsettingPartRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getSubsettingPartAccess().getSubsetsParserRuleCall_0_0());
            	    			
            	    pushFollow(FOLLOW_73);
            	    this_Subsets_0=ruleSubsets(current);

            	    state._fsp--;


            	    				current = this_Subsets_0;
            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalAlf.g:4838:4: (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) ) )*
            	    loop84:
            	    do {
            	        int alt84=2;
            	        int LA84_0 = input.LA(1);

            	        if ( (LA84_0==38) ) {
            	            alt84=1;
            	        }


            	        switch (alt84) {
            	    	case 1 :
            	    	    // InternalAlf.g:4839:5: otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleSubset ) )
            	    	    {
            	    	    otherlv_1=(Token)match(input,38,FOLLOW_13); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getSubsettingPartAccess().getCommaKeyword_0_1_0());
            	    	    				
            	    	    // InternalAlf.g:4843:5: ( (lv_ownedRelationship_2_0= ruleSubset ) )
            	    	    // InternalAlf.g:4844:6: (lv_ownedRelationship_2_0= ruleSubset )
            	    	    {
            	    	    // InternalAlf.g:4844:6: (lv_ownedRelationship_2_0= ruleSubset )
            	    	    // InternalAlf.g:4845:7: lv_ownedRelationship_2_0= ruleSubset
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSubsettingPartAccess().getOwnedRelationshipSubsetParserRuleCall_0_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_73);
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
            	    	    break loop84;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:4865:3: (this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )* )
            	    {
            	    // InternalAlf.g:4865:3: (this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )* )
            	    // InternalAlf.g:4866:4: this_Redefines_3= ruleRedefines[$current] (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )*
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getSubsettingPartRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getSubsettingPartAccess().getRedefinesParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_73);
            	    this_Redefines_3=ruleRedefines(current);

            	    state._fsp--;


            	    				current = this_Redefines_3;
            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalAlf.g:4877:4: (otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) ) )*
            	    loop85:
            	    do {
            	        int alt85=2;
            	        int LA85_0 = input.LA(1);

            	        if ( (LA85_0==38) ) {
            	            alt85=1;
            	        }


            	        switch (alt85) {
            	    	case 1 :
            	    	    // InternalAlf.g:4878:5: otherlv_4= ',' ( (lv_ownedRelationship_5_0= ruleRedefinition ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,38,FOLLOW_13); 

            	    	    					newLeafNode(otherlv_4, grammarAccess.getSubsettingPartAccess().getCommaKeyword_1_1_0());
            	    	    				
            	    	    // InternalAlf.g:4882:5: ( (lv_ownedRelationship_5_0= ruleRedefinition ) )
            	    	    // InternalAlf.g:4883:6: (lv_ownedRelationship_5_0= ruleRedefinition )
            	    	    {
            	    	    // InternalAlf.g:4883:6: (lv_ownedRelationship_5_0= ruleRedefinition )
            	    	    // InternalAlf.g:4884:7: lv_ownedRelationship_5_0= ruleRedefinition
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getSubsettingPartAccess().getOwnedRelationshipRedefinitionParserRuleCall_1_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_73);
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
            	    	    break loop85;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
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
    // InternalAlf.g:4908:1: ruleSubsets[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'subsets' ( (lv_ownedRelationship_1_0= ruleSubset ) ) ) ;
    public final EObject ruleSubsets(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_ownedRelationship_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4914:2: ( (otherlv_0= 'subsets' ( (lv_ownedRelationship_1_0= ruleSubset ) ) ) )
            // InternalAlf.g:4915:2: (otherlv_0= 'subsets' ( (lv_ownedRelationship_1_0= ruleSubset ) ) )
            {
            // InternalAlf.g:4915:2: (otherlv_0= 'subsets' ( (lv_ownedRelationship_1_0= ruleSubset ) ) )
            // InternalAlf.g:4916:3: otherlv_0= 'subsets' ( (lv_ownedRelationship_1_0= ruleSubset ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSubsetsAccess().getSubsetsKeyword_0());
            		
            // InternalAlf.g:4920:3: ( (lv_ownedRelationship_1_0= ruleSubset ) )
            // InternalAlf.g:4921:4: (lv_ownedRelationship_1_0= ruleSubset )
            {
            // InternalAlf.g:4921:4: (lv_ownedRelationship_1_0= ruleSubset )
            // InternalAlf.g:4922:5: lv_ownedRelationship_1_0= ruleSubset
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
    // InternalAlf.g:4943:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalAlf.g:4943:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalAlf.g:4944:2: iv_ruleSubset= ruleSubset EOF
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
    // InternalAlf.g:4950:1: ruleSubset returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubset() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:4956:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:4957:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:4957:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4958:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:4958:3: ( ruleQualifiedName )
            // InternalAlf.g:4959:4: ruleQualifiedName
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
    // InternalAlf.g:4977:1: ruleRedefines[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) ) ;
    public final EObject ruleRedefines(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_ownedRelationship_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4983:2: ( (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) ) )
            // InternalAlf.g:4984:2: (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) )
            {
            // InternalAlf.g:4984:2: (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) )
            // InternalAlf.g:4985:3: otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRedefinesAccess().getRedefinesKeyword_0());
            		
            // InternalAlf.g:4989:3: ( (lv_ownedRelationship_1_0= ruleRedefinition ) )
            // InternalAlf.g:4990:4: (lv_ownedRelationship_1_0= ruleRedefinition )
            {
            // InternalAlf.g:4990:4: (lv_ownedRelationship_1_0= ruleRedefinition )
            // InternalAlf.g:4991:5: lv_ownedRelationship_1_0= ruleRedefinition
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
    // InternalAlf.g:5012:1: entryRuleRedefinition returns [EObject current=null] : iv_ruleRedefinition= ruleRedefinition EOF ;
    public final EObject entryRuleRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefinition = null;


        try {
            // InternalAlf.g:5012:53: (iv_ruleRedefinition= ruleRedefinition EOF )
            // InternalAlf.g:5013:2: iv_ruleRedefinition= ruleRedefinition EOF
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
    // InternalAlf.g:5019:1: ruleRedefinition returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleRedefinition() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:5025:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:5026:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:5026:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:5027:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:5027:3: ( ruleQualifiedName )
            // InternalAlf.g:5028:4: ruleQualifiedName
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
    // InternalAlf.g:5045:1: entryRuleConnectorDefinition returns [EObject current=null] : iv_ruleConnectorDefinition= ruleConnectorDefinition EOF ;
    public final EObject entryRuleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorDefinition = null;


        try {
            // InternalAlf.g:5045:60: (iv_ruleConnectorDefinition= ruleConnectorDefinition EOF )
            // InternalAlf.g:5046:2: iv_ruleConnectorDefinition= ruleConnectorDefinition EOF
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
    // InternalAlf.g:5052:1: ruleConnectorDefinition returns [EObject current=null] : (this_ConnectorDeclaration_0= ruleConnectorDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) ;
    public final EObject ruleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ConnectorDeclaration_0 = null;

        EObject this_CategoryBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:5058:2: ( (this_ConnectorDeclaration_0= ruleConnectorDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) )
            // InternalAlf.g:5059:2: (this_ConnectorDeclaration_0= ruleConnectorDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:5059:2: (this_ConnectorDeclaration_0= ruleConnectorDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            // InternalAlf.g:5060:3: this_ConnectorDeclaration_0= ruleConnectorDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getConnectorDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
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
    // InternalAlf.g:5086:1: entryRuleAbstractConnectorDefinition returns [EObject current=null] : iv_ruleAbstractConnectorDefinition= ruleAbstractConnectorDefinition EOF ;
    public final EObject entryRuleAbstractConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractConnectorDefinition = null;


        try {
            // InternalAlf.g:5086:68: (iv_ruleAbstractConnectorDefinition= ruleAbstractConnectorDefinition EOF )
            // InternalAlf.g:5087:2: iv_ruleAbstractConnectorDefinition= ruleAbstractConnectorDefinition EOF
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
    // InternalAlf.g:5093:1: ruleAbstractConnectorDefinition returns [EObject current=null] : (this_ConnectorDeclaration_0= ruleConnectorDeclaration[$current] this_AbstractCategoryBody_1= ruleAbstractCategoryBody[$current] ) ;
    public final EObject ruleAbstractConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ConnectorDeclaration_0 = null;

        EObject this_AbstractCategoryBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:5099:2: ( (this_ConnectorDeclaration_0= ruleConnectorDeclaration[$current] this_AbstractCategoryBody_1= ruleAbstractCategoryBody[$current] ) )
            // InternalAlf.g:5100:2: (this_ConnectorDeclaration_0= ruleConnectorDeclaration[$current] this_AbstractCategoryBody_1= ruleAbstractCategoryBody[$current] )
            {
            // InternalAlf.g:5100:2: (this_ConnectorDeclaration_0= ruleConnectorDeclaration[$current] this_AbstractCategoryBody_1= ruleAbstractCategoryBody[$current] )
            // InternalAlf.g:5101:3: this_ConnectorDeclaration_0= ruleConnectorDeclaration[$current] this_AbstractCategoryBody_1= ruleAbstractCategoryBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAbstractConnectorDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getAbstractConnectorDefinitionAccess().getConnectorDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_62);
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
    // InternalAlf.g:5128:1: ruleConnectorDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_ownedRelationship_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_ownedRelationship_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_ownedRelationship_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_ownedRelationship_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) ) ;
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
            // InternalAlf.g:5134:2: ( ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_ownedRelationship_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_ownedRelationship_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_ownedRelationship_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_ownedRelationship_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) ) )
            // InternalAlf.g:5135:2: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_ownedRelationship_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_ownedRelationship_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_ownedRelationship_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_ownedRelationship_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) )
            {
            // InternalAlf.g:5135:2: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_ownedRelationship_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_ownedRelationship_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_ownedRelationship_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_ownedRelationship_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) )
            int alt93=2;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // InternalAlf.g:5136:3: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_ownedRelationship_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_ownedRelationship_6_0= ruleConnectorEnd ) ) )
                    {
                    // InternalAlf.g:5136:3: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_ownedRelationship_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_ownedRelationship_6_0= ruleConnectorEnd ) ) )
                    // InternalAlf.g:5137:4: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_ownedRelationship_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_ownedRelationship_6_0= ruleConnectorEnd ) )
                    {
                    // InternalAlf.g:5137:4: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )?
                    int alt89=2;
                    alt89 = dfa89.predict(input);
                    switch (alt89) {
                        case 1 :
                            // InternalAlf.g:5138:5: ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is'
                            {
                            // InternalAlf.g:5138:5: ( (lv_name_0_0= ruleName ) )?
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( ((LA87_0>=RULE_ID && LA87_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt87=1;
                            }
                            switch (alt87) {
                                case 1 :
                                    // InternalAlf.g:5139:6: (lv_name_0_0= ruleName )
                                    {
                                    // InternalAlf.g:5139:6: (lv_name_0_0= ruleName )
                                    // InternalAlf.g:5140:7: lv_name_0_0= ruleName
                                    {

                                    							newCompositeNode(grammarAccess.getConnectorDeclarationAccess().getNameNameParserRuleCall_0_0_0_0());
                                    						
                                    pushFollow(FOLLOW_74);
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

                            // InternalAlf.g:5157:5: (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )?
                            int alt88=2;
                            int LA88_0 = input.LA(1);

                            if ( (LA88_0==44) ) {
                                alt88=1;
                            }
                            switch (alt88) {
                                case 1 :
                                    // InternalAlf.g:5158:6: otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) )
                                    {
                                    otherlv_1=(Token)match(input,44,FOLLOW_13); 

                                    						newLeafNode(otherlv_1, grammarAccess.getConnectorDeclarationAccess().getColonKeyword_0_0_1_0());
                                    					
                                    // InternalAlf.g:5162:6: ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) )
                                    // InternalAlf.g:5163:7: (lv_ownedRelationship_2_0= ruleConnectorTyping )
                                    {
                                    // InternalAlf.g:5163:7: (lv_ownedRelationship_2_0= ruleConnectorTyping )
                                    // InternalAlf.g:5164:8: lv_ownedRelationship_2_0= ruleConnectorTyping
                                    {

                                    								newCompositeNode(grammarAccess.getConnectorDeclarationAccess().getOwnedRelationshipConnectorTypingParserRuleCall_0_0_1_1_0());
                                    							
                                    pushFollow(FOLLOW_25);
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

                            otherlv_3=(Token)match(input,25,FOLLOW_75); 

                            					newLeafNode(otherlv_3, grammarAccess.getConnectorDeclarationAccess().getIsKeyword_0_0_2());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:5187:4: ( (lv_ownedRelationship_4_0= ruleConnectorEnd ) )
                    // InternalAlf.g:5188:5: (lv_ownedRelationship_4_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:5188:5: (lv_ownedRelationship_4_0= ruleConnectorEnd )
                    // InternalAlf.g:5189:6: lv_ownedRelationship_4_0= ruleConnectorEnd
                    {

                    						newCompositeNode(grammarAccess.getConnectorDeclarationAccess().getOwnedRelationshipConnectorEndParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_76);
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

                    otherlv_5=(Token)match(input,53,FOLLOW_75); 

                    				newLeafNode(otherlv_5, grammarAccess.getConnectorDeclarationAccess().getToKeyword_0_2());
                    			
                    // InternalAlf.g:5210:4: ( (lv_ownedRelationship_6_0= ruleConnectorEnd ) )
                    // InternalAlf.g:5211:5: (lv_ownedRelationship_6_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:5211:5: (lv_ownedRelationship_6_0= ruleConnectorEnd )
                    // InternalAlf.g:5212:6: lv_ownedRelationship_6_0= ruleConnectorEnd
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
                    // InternalAlf.g:5231:3: ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_ownedRelationship_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_ownedRelationship_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' )
                    {
                    // InternalAlf.g:5231:3: ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_ownedRelationship_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_ownedRelationship_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' )
                    // InternalAlf.g:5232:4: ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_ownedRelationship_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_ownedRelationship_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')'
                    {
                    // InternalAlf.g:5232:4: ( (lv_name_7_0= ruleName ) )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( ((LA90_0>=RULE_ID && LA90_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // InternalAlf.g:5233:5: (lv_name_7_0= ruleName )
                            {
                            // InternalAlf.g:5233:5: (lv_name_7_0= ruleName )
                            // InternalAlf.g:5234:6: lv_name_7_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getConnectorDeclarationAccess().getNameNameParserRuleCall_1_0_0());
                            					
                            pushFollow(FOLLOW_77);
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

                    // InternalAlf.g:5251:4: (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==44) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // InternalAlf.g:5252:5: otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) )
                            {
                            otherlv_8=(Token)match(input,44,FOLLOW_13); 

                            					newLeafNode(otherlv_8, grammarAccess.getConnectorDeclarationAccess().getColonKeyword_1_1_0());
                            				
                            // InternalAlf.g:5256:5: ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) )
                            // InternalAlf.g:5257:6: (lv_ownedRelationship_9_0= ruleConnectorTyping )
                            {
                            // InternalAlf.g:5257:6: (lv_ownedRelationship_9_0= ruleConnectorTyping )
                            // InternalAlf.g:5258:7: lv_ownedRelationship_9_0= ruleConnectorTyping
                            {

                            							newCompositeNode(grammarAccess.getConnectorDeclarationAccess().getOwnedRelationshipConnectorTypingParserRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_55);
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

                    otherlv_10=(Token)match(input,40,FOLLOW_75); 

                    				newLeafNode(otherlv_10, grammarAccess.getConnectorDeclarationAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalAlf.g:5280:4: ( (lv_ownedRelationship_11_0= ruleConnectorEnd ) )
                    // InternalAlf.g:5281:5: (lv_ownedRelationship_11_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:5281:5: (lv_ownedRelationship_11_0= ruleConnectorEnd )
                    // InternalAlf.g:5282:6: lv_ownedRelationship_11_0= ruleConnectorEnd
                    {

                    						newCompositeNode(grammarAccess.getConnectorDeclarationAccess().getOwnedRelationshipConnectorEndParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_78);
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

                    otherlv_12=(Token)match(input,38,FOLLOW_75); 

                    				newLeafNode(otherlv_12, grammarAccess.getConnectorDeclarationAccess().getCommaKeyword_1_4());
                    			
                    // InternalAlf.g:5303:4: ( (lv_ownedRelationship_13_0= ruleConnectorEnd ) )
                    // InternalAlf.g:5304:5: (lv_ownedRelationship_13_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:5304:5: (lv_ownedRelationship_13_0= ruleConnectorEnd )
                    // InternalAlf.g:5305:6: lv_ownedRelationship_13_0= ruleConnectorEnd
                    {

                    						newCompositeNode(grammarAccess.getConnectorDeclarationAccess().getOwnedRelationshipConnectorEndParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_57);
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

                    // InternalAlf.g:5322:4: (otherlv_14= ',' ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) ) )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==38) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // InternalAlf.g:5323:5: otherlv_14= ',' ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) )
                    	    {
                    	    otherlv_14=(Token)match(input,38,FOLLOW_75); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getConnectorDeclarationAccess().getCommaKeyword_1_6_0());
                    	    				
                    	    // InternalAlf.g:5327:5: ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) )
                    	    // InternalAlf.g:5328:6: (lv_ownedRelationship_15_0= ruleConnectorEnd )
                    	    {
                    	    // InternalAlf.g:5328:6: (lv_ownedRelationship_15_0= ruleConnectorEnd )
                    	    // InternalAlf.g:5329:7: lv_ownedRelationship_15_0= ruleConnectorEnd
                    	    {

                    	    							newCompositeNode(grammarAccess.getConnectorDeclarationAccess().getOwnedRelationshipConnectorEndParserRuleCall_1_6_1_0());
                    	    						
                    	    pushFollow(FOLLOW_57);
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
                    	    break loop92;
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
    // InternalAlf.g:5356:1: entryRuleConnectorTyping returns [EObject current=null] : iv_ruleConnectorTyping= ruleConnectorTyping EOF ;
    public final EObject entryRuleConnectorTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorTyping = null;


        try {
            // InternalAlf.g:5356:56: (iv_ruleConnectorTyping= ruleConnectorTyping EOF )
            // InternalAlf.g:5357:2: iv_ruleConnectorTyping= ruleConnectorTyping EOF
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
    // InternalAlf.g:5363:1: ruleConnectorTyping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleConnectorTyping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:5369:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:5370:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:5370:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:5371:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:5371:3: ( ruleQualifiedName )
            // InternalAlf.g:5372:4: ruleQualifiedName
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
    // InternalAlf.g:5389:1: entryRuleConnectorEnd returns [EObject current=null] : iv_ruleConnectorEnd= ruleConnectorEnd EOF ;
    public final EObject entryRuleConnectorEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorEnd = null;


        try {
            // InternalAlf.g:5389:53: (iv_ruleConnectorEnd= ruleConnectorEnd EOF )
            // InternalAlf.g:5390:2: iv_ruleConnectorEnd= ruleConnectorEnd EOF
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
    // InternalAlf.g:5396:1: ruleConnectorEnd returns [EObject current=null] : ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleConnectorEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_ownedRelationship_3_0 = null;

        EObject lv_ownedRelationship_5_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5402:2: ( ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) ) )
            // InternalAlf.g:5403:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )
            {
            // InternalAlf.g:5403:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )
            int alt97=2;
            alt97 = dfa97.predict(input);
            switch (alt97) {
                case 1 :
                    // InternalAlf.g:5404:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_3_0= ruleMultiplicity ) )? )
                    {
                    // InternalAlf.g:5404:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_3_0= ruleMultiplicity ) )? )
                    // InternalAlf.g:5405:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_3_0= ruleMultiplicity ) )?
                    {
                    // InternalAlf.g:5405:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )?
                    int alt94=2;
                    alt94 = dfa94.predict(input);
                    switch (alt94) {
                        case 1 :
                            // InternalAlf.g:5406:5: ( ( ruleQualifiedName ) ) otherlv_1= ':'
                            {
                            // InternalAlf.g:5406:5: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:5407:6: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:5407:6: ( ruleQualifiedName )
                            // InternalAlf.g:5408:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConnectorEndRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getConnectorEndAccess().getEndFeatureCrossReference_0_0_0_0());
                            						
                            pushFollow(FOLLOW_79);
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

                    // InternalAlf.g:5427:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:5428:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:5428:5: ( ruleQualifiedName )
                    // InternalAlf.g:5429:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectorEndRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConnectorEndAccess().getFeatureFeatureCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_80);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:5443:4: ( (lv_ownedRelationship_3_0= ruleMultiplicity ) )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==49) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // InternalAlf.g:5444:5: (lv_ownedRelationship_3_0= ruleMultiplicity )
                            {
                            // InternalAlf.g:5444:5: (lv_ownedRelationship_3_0= ruleMultiplicity )
                            // InternalAlf.g:5445:6: lv_ownedRelationship_3_0= ruleMultiplicity
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
                    // InternalAlf.g:5464:3: ( ( ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalAlf.g:5464:3: ( ( ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) )
                    // InternalAlf.g:5465:4: ( ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) )
                    {
                    // InternalAlf.g:5465:4: ( ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )? otherlv_6= '=>' )
                    // InternalAlf.g:5466:5: ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )? otherlv_6= '=>'
                    {
                    // InternalAlf.g:5466:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:5467:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:5467:6: ( ruleQualifiedName )
                    // InternalAlf.g:5468:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConnectorEndRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getConnectorEndAccess().getEndFeatureCrossReference_1_0_0_0());
                    						
                    pushFollow(FOLLOW_81);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:5482:5: ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==49) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // InternalAlf.g:5483:6: (lv_ownedRelationship_5_0= ruleMultiplicity )
                            {
                            // InternalAlf.g:5483:6: (lv_ownedRelationship_5_0= ruleMultiplicity )
                            // InternalAlf.g:5484:7: lv_ownedRelationship_5_0= ruleMultiplicity
                            {

                            							newCompositeNode(grammarAccess.getConnectorEndAccess().getOwnedRelationshipMultiplicityParserRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_82);
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

                    otherlv_6=(Token)match(input,54,FOLLOW_13); 

                    					newLeafNode(otherlv_6, grammarAccess.getConnectorEndAccess().getEqualsSignGreaterThanSignKeyword_1_0_2());
                    				

                    }

                    // InternalAlf.g:5506:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:5507:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:5507:5: ( ruleQualifiedName )
                    // InternalAlf.g:5508:6: ruleQualifiedName
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
    // InternalAlf.g:5527:1: entryRuleParameterDefinition returns [EObject current=null] : iv_ruleParameterDefinition= ruleParameterDefinition EOF ;
    public final EObject entryRuleParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDefinition = null;


        try {
            // InternalAlf.g:5527:60: (iv_ruleParameterDefinition= ruleParameterDefinition EOF )
            // InternalAlf.g:5528:2: iv_ruleParameterDefinition= ruleParameterDefinition EOF
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
    // InternalAlf.g:5534:1: ruleParameterDefinition returns [EObject current=null] : (this_TypePart_0= ruleTypePart[$current] (this_Subsets_1= ruleSubsets[$current] | this_Redefines_2= ruleRedefines[$current] )* ) ;
    public final EObject ruleParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_TypePart_0 = null;

        EObject this_Subsets_1 = null;

        EObject this_Redefines_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:5540:2: ( (this_TypePart_0= ruleTypePart[$current] (this_Subsets_1= ruleSubsets[$current] | this_Redefines_2= ruleRedefines[$current] )* ) )
            // InternalAlf.g:5541:2: (this_TypePart_0= ruleTypePart[$current] (this_Subsets_1= ruleSubsets[$current] | this_Redefines_2= ruleRedefines[$current] )* )
            {
            // InternalAlf.g:5541:2: (this_TypePart_0= ruleTypePart[$current] (this_Subsets_1= ruleSubsets[$current] | this_Redefines_2= ruleRedefines[$current] )* )
            // InternalAlf.g:5542:3: this_TypePart_0= ruleTypePart[$current] (this_Subsets_1= ruleSubsets[$current] | this_Redefines_2= ruleRedefines[$current] )*
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getParameterDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getParameterDefinitionAccess().getTypePartParserRuleCall_0());
            		
            pushFollow(FOLLOW_83);
            this_TypePart_0=ruleTypePart(current);

            state._fsp--;


            			current = this_TypePart_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:5553:3: (this_Subsets_1= ruleSubsets[$current] | this_Redefines_2= ruleRedefines[$current] )*
            loop98:
            do {
                int alt98=3;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==52) ) {
                    alt98=1;
                }
                else if ( (LA98_0==42) ) {
                    alt98=2;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalAlf.g:5554:4: this_Subsets_1= ruleSubsets[$current]
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getParameterDefinitionRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getParameterDefinitionAccess().getSubsetsParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_83);
            	    this_Subsets_1=ruleSubsets(current);

            	    state._fsp--;


            	    				current = this_Subsets_1;
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:5566:4: this_Redefines_2= ruleRedefines[$current]
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getParameterDefinitionRule());
            	    				}
            	    				newCompositeNode(grammarAccess.getParameterDefinitionAccess().getRedefinesParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_83);
            	    this_Redefines_2=ruleRedefines(current);

            	    state._fsp--;


            	    				current = this_Redefines_2;
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop98;
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
    // InternalAlf.g:5582:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAlf.g:5582:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAlf.g:5583:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAlf.g:5589:1: ruleExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5595:2: (this_OrExpression_0= ruleOrExpression )
            // InternalAlf.g:5596:2: this_OrExpression_0= ruleOrExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;


            		current = this_OrExpression_0;
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


    // $ANTLR start "entryRuleOrExpression"
    // InternalAlf.g:5607:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalAlf.g:5607:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalAlf.g:5608:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // InternalAlf.g:5614:1: ruleOrExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XorExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5620:2: ( (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )* ) )
            // InternalAlf.g:5621:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )* )
            {
            // InternalAlf.g:5621:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )* )
            // InternalAlf.g:5622:3: this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_84);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;


            			current = this_XorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:5630:3: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==55) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalAlf.g:5631:4: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_operand_3_0= ruleXorExpression ) )
            	    {
            	    // InternalAlf.g:5631:4: ()
            	    // InternalAlf.g:5632:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getOrExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlf.g:5638:4: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // InternalAlf.g:5639:5: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // InternalAlf.g:5639:5: (lv_operator_2_0= ruleOrOperator )
            	    // InternalAlf.g:5640:6: lv_operator_2_0= ruleOrOperator
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_65);
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

            	    // InternalAlf.g:5657:4: ( (lv_operand_3_0= ruleXorExpression ) )
            	    // InternalAlf.g:5658:5: (lv_operand_3_0= ruleXorExpression )
            	    {
            	    // InternalAlf.g:5658:5: (lv_operand_3_0= ruleXorExpression )
            	    // InternalAlf.g:5659:6: lv_operand_3_0= ruleXorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getOperandXorExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_84);
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
            	    break loop99;
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
    // InternalAlf.g:5681:1: entryRuleOrOperator returns [String current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final String entryRuleOrOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrOperator = null;


        try {
            // InternalAlf.g:5681:50: (iv_ruleOrOperator= ruleOrOperator EOF )
            // InternalAlf.g:5682:2: iv_ruleOrOperator= ruleOrOperator EOF
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
    // InternalAlf.g:5688:1: ruleOrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '|' ;
    public final AntlrDatatypeRuleToken ruleOrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:5694:2: (kw= '|' )
            // InternalAlf.g:5695:2: kw= '|'
            {
            kw=(Token)match(input,55,FOLLOW_2); 

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
    // InternalAlf.g:5703:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalAlf.g:5703:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalAlf.g:5704:2: iv_ruleXorExpression= ruleXorExpression EOF
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
    // InternalAlf.g:5710:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5716:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* ) )
            // InternalAlf.g:5717:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* )
            {
            // InternalAlf.g:5717:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )* )
            // InternalAlf.g:5718:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_85);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:5726:3: ( () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==56) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalAlf.g:5727:4: () ( (lv_operator_2_0= ruleXorOperator ) ) ( (lv_operand_3_0= ruleAndExpression ) )
            	    {
            	    // InternalAlf.g:5727:4: ()
            	    // InternalAlf.g:5728:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getXorExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlf.g:5734:4: ( (lv_operator_2_0= ruleXorOperator ) )
            	    // InternalAlf.g:5735:5: (lv_operator_2_0= ruleXorOperator )
            	    {
            	    // InternalAlf.g:5735:5: (lv_operator_2_0= ruleXorOperator )
            	    // InternalAlf.g:5736:6: lv_operator_2_0= ruleXorOperator
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getOperatorXorOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_65);
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

            	    // InternalAlf.g:5753:4: ( (lv_operand_3_0= ruleAndExpression ) )
            	    // InternalAlf.g:5754:5: (lv_operand_3_0= ruleAndExpression )
            	    {
            	    // InternalAlf.g:5754:5: (lv_operand_3_0= ruleAndExpression )
            	    // InternalAlf.g:5755:6: lv_operand_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getOperandAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_85);
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
            	    break loop100;
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
    // InternalAlf.g:5777:1: entryRuleXorOperator returns [String current=null] : iv_ruleXorOperator= ruleXorOperator EOF ;
    public final String entryRuleXorOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXorOperator = null;


        try {
            // InternalAlf.g:5777:51: (iv_ruleXorOperator= ruleXorOperator EOF )
            // InternalAlf.g:5778:2: iv_ruleXorOperator= ruleXorOperator EOF
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
    // InternalAlf.g:5784:1: ruleXorOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '^' ;
    public final AntlrDatatypeRuleToken ruleXorOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:5790:2: (kw= '^' )
            // InternalAlf.g:5791:2: kw= '^'
            {
            kw=(Token)match(input,56,FOLLOW_2); 

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
    // InternalAlf.g:5799:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalAlf.g:5799:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalAlf.g:5800:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalAlf.g:5806:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualityExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5812:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalAlf.g:5813:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalAlf.g:5813:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )* )
            // InternalAlf.g:5814:3: this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_86);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;


            			current = this_EqualityExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:5822:3: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==57) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // InternalAlf.g:5823:4: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_operand_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalAlf.g:5823:4: ()
            	    // InternalAlf.g:5824:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAndExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlf.g:5830:4: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // InternalAlf.g:5831:5: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // InternalAlf.g:5831:5: (lv_operator_2_0= ruleAndOperator )
            	    // InternalAlf.g:5832:6: lv_operator_2_0= ruleAndOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_65);
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

            	    // InternalAlf.g:5849:4: ( (lv_operand_3_0= ruleEqualityExpression ) )
            	    // InternalAlf.g:5850:5: (lv_operand_3_0= ruleEqualityExpression )
            	    {
            	    // InternalAlf.g:5850:5: (lv_operand_3_0= ruleEqualityExpression )
            	    // InternalAlf.g:5851:6: lv_operand_3_0= ruleEqualityExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getOperandEqualityExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_86);
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
            	    break loop101;
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
    // InternalAlf.g:5873:1: entryRuleAndOperator returns [String current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final String entryRuleAndOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAndOperator = null;


        try {
            // InternalAlf.g:5873:51: (iv_ruleAndOperator= ruleAndOperator EOF )
            // InternalAlf.g:5874:2: iv_ruleAndOperator= ruleAndOperator EOF
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
    // InternalAlf.g:5880:1: ruleAndOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&' ;
    public final AntlrDatatypeRuleToken ruleAndOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:5886:2: (kw= '&' )
            // InternalAlf.g:5887:2: kw= '&'
            {
            kw=(Token)match(input,57,FOLLOW_2); 

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
    // InternalAlf.g:5895:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalAlf.g:5895:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalAlf.g:5896:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
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
    // InternalAlf.g:5902:1: ruleEqualityExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5908:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleRelationalExpression ) ) )* ) )
            // InternalAlf.g:5909:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleRelationalExpression ) ) )* )
            {
            // InternalAlf.g:5909:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleRelationalExpression ) ) )* )
            // InternalAlf.g:5910:3: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleRelationalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_87);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;


            			current = this_RelationalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:5918:3: ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleRelationalExpression ) ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( ((LA102_0>=58 && LA102_0<=59)) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // InternalAlf.g:5919:4: () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_operand_3_0= ruleRelationalExpression ) )
            	    {
            	    // InternalAlf.g:5919:4: ()
            	    // InternalAlf.g:5920:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getEqualityExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlf.g:5926:4: ( (lv_operator_2_0= ruleEqualityOperator ) )
            	    // InternalAlf.g:5927:5: (lv_operator_2_0= ruleEqualityOperator )
            	    {
            	    // InternalAlf.g:5927:5: (lv_operator_2_0= ruleEqualityOperator )
            	    // InternalAlf.g:5928:6: lv_operator_2_0= ruleEqualityOperator
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_65);
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

            	    // InternalAlf.g:5945:4: ( (lv_operand_3_0= ruleRelationalExpression ) )
            	    // InternalAlf.g:5946:5: (lv_operand_3_0= ruleRelationalExpression )
            	    {
            	    // InternalAlf.g:5946:5: (lv_operand_3_0= ruleRelationalExpression )
            	    // InternalAlf.g:5947:6: lv_operand_3_0= ruleRelationalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOperandRelationalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_87);
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
            	    break loop102;
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
    // InternalAlf.g:5969:1: entryRuleEqualityOperator returns [String current=null] : iv_ruleEqualityOperator= ruleEqualityOperator EOF ;
    public final String entryRuleEqualityOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqualityOperator = null;


        try {
            // InternalAlf.g:5969:56: (iv_ruleEqualityOperator= ruleEqualityOperator EOF )
            // InternalAlf.g:5970:2: iv_ruleEqualityOperator= ruleEqualityOperator EOF
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
    // InternalAlf.g:5976:1: ruleEqualityOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleEqualityOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:5982:2: ( (kw= '==' | kw= '!=' ) )
            // InternalAlf.g:5983:2: (kw= '==' | kw= '!=' )
            {
            // InternalAlf.g:5983:2: (kw= '==' | kw= '!=' )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==58) ) {
                alt103=1;
            }
            else if ( (LA103_0==59) ) {
                alt103=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // InternalAlf.g:5984:3: kw= '=='
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:5990:3: kw= '!='
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

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
    // InternalAlf.g:5999:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalAlf.g:5999:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalAlf.g:6000:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
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
    // InternalAlf.g:6006:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:6012:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalAlf.g:6013:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalAlf.g:6013:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )* )
            // InternalAlf.g:6014:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_88);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:6022:3: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) ) )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( ((LA104_0>=60 && LA104_0<=63)) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // InternalAlf.g:6023:4: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_operand_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalAlf.g:6023:4: ()
            	    // InternalAlf.g:6024:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getRelationalExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlf.g:6030:4: ( (lv_operator_2_0= ruleRelationalOperator ) )
            	    // InternalAlf.g:6031:5: (lv_operator_2_0= ruleRelationalOperator )
            	    {
            	    // InternalAlf.g:6031:5: (lv_operator_2_0= ruleRelationalOperator )
            	    // InternalAlf.g:6032:6: lv_operator_2_0= ruleRelationalOperator
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorRelationalOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_65);
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

            	    // InternalAlf.g:6049:4: ( (lv_operand_3_0= ruleAdditiveExpression ) )
            	    // InternalAlf.g:6050:5: (lv_operand_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalAlf.g:6050:5: (lv_operand_3_0= ruleAdditiveExpression )
            	    // InternalAlf.g:6051:6: lv_operand_3_0= ruleAdditiveExpression
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperandAdditiveExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_88);
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
            	    break loop104;
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
    // InternalAlf.g:6073:1: entryRuleRelationalOperator returns [String current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final String entryRuleRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOperator = null;


        try {
            // InternalAlf.g:6073:58: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // InternalAlf.g:6074:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
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
    // InternalAlf.g:6080:1: ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:6086:2: ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) )
            // InternalAlf.g:6087:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            {
            // InternalAlf.g:6087:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            int alt105=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt105=1;
                }
                break;
            case 61:
                {
                alt105=2;
                }
                break;
            case 62:
                {
                alt105=3;
                }
                break;
            case 63:
                {
                alt105=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // InternalAlf.g:6088:3: kw= '<'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:6094:3: kw= '>'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:6100:3: kw= '<='
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:6106:3: kw= '>='
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

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
    // InternalAlf.g:6115:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalAlf.g:6115:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalAlf.g:6116:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalAlf.g:6122:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:6128:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalAlf.g:6129:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalAlf.g:6129:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalAlf.g:6130:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_89);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:6138:3: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) ) )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( ((LA106_0>=64 && LA106_0<=65)) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // InternalAlf.g:6139:4: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_operand_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalAlf.g:6139:4: ()
            	    // InternalAlf.g:6140:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAdditiveExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlf.g:6146:4: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // InternalAlf.g:6147:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // InternalAlf.g:6147:5: (lv_operator_2_0= ruleAdditiveOperator )
            	    // InternalAlf.g:6148:6: lv_operator_2_0= ruleAdditiveOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_65);
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

            	    // InternalAlf.g:6165:4: ( (lv_operand_3_0= ruleMultiplicativeExpression ) )
            	    // InternalAlf.g:6166:5: (lv_operand_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalAlf.g:6166:5: (lv_operand_3_0= ruleMultiplicativeExpression )
            	    // InternalAlf.g:6167:6: lv_operand_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperandMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_89);
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
            	    break loop106;
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
    // InternalAlf.g:6189:1: entryRuleAdditiveOperator returns [String current=null] : iv_ruleAdditiveOperator= ruleAdditiveOperator EOF ;
    public final String entryRuleAdditiveOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAdditiveOperator = null;


        try {
            // InternalAlf.g:6189:56: (iv_ruleAdditiveOperator= ruleAdditiveOperator EOF )
            // InternalAlf.g:6190:2: iv_ruleAdditiveOperator= ruleAdditiveOperator EOF
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
    // InternalAlf.g:6196:1: ruleAdditiveOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAdditiveOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:6202:2: ( (kw= '+' | kw= '-' ) )
            // InternalAlf.g:6203:2: (kw= '+' | kw= '-' )
            {
            // InternalAlf.g:6203:2: (kw= '+' | kw= '-' )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==64) ) {
                alt107=1;
            }
            else if ( (LA107_0==65) ) {
                alt107=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // InternalAlf.g:6204:3: kw= '+'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAdditiveOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:6210:3: kw= '-'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

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
    // InternalAlf.g:6219:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalAlf.g:6219:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalAlf.g:6220:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalAlf.g:6226:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnitsExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:6232:2: ( (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )* ) )
            // InternalAlf.g:6233:2: (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )* )
            {
            // InternalAlf.g:6233:2: (this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )* )
            // InternalAlf.g:6234:3: this_UnitsExpression_0= ruleUnitsExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnitsExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_90);
            this_UnitsExpression_0=ruleUnitsExpression();

            state._fsp--;


            			current = this_UnitsExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:6242:3: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) ) )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==19||(LA108_0>=66 && LA108_0<=67)) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // InternalAlf.g:6243:4: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_operand_3_0= ruleUnitsExpression ) )
            	    {
            	    // InternalAlf.g:6243:4: ()
            	    // InternalAlf.g:6244:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getOperatorExpressionOperandAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalAlf.g:6250:4: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // InternalAlf.g:6251:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // InternalAlf.g:6251:5: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // InternalAlf.g:6252:6: lv_operator_2_0= ruleMultiplicativeOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_65);
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

            	    // InternalAlf.g:6269:4: ( (lv_operand_3_0= ruleUnitsExpression ) )
            	    // InternalAlf.g:6270:5: (lv_operand_3_0= ruleUnitsExpression )
            	    {
            	    // InternalAlf.g:6270:5: (lv_operand_3_0= ruleUnitsExpression )
            	    // InternalAlf.g:6271:6: lv_operand_3_0= ruleUnitsExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperandUnitsExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_90);
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
            	    break loop108;
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
    // InternalAlf.g:6293:1: entryRuleMultiplicativeOperator returns [String current=null] : iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF ;
    public final String entryRuleMultiplicativeOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicativeOperator = null;


        try {
            // InternalAlf.g:6293:62: (iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF )
            // InternalAlf.g:6294:2: iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF
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
    // InternalAlf.g:6300:1: ruleMultiplicativeOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '**' ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicativeOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:6306:2: ( (kw= '*' | kw= '/' | kw= '**' ) )
            // InternalAlf.g:6307:2: (kw= '*' | kw= '/' | kw= '**' )
            {
            // InternalAlf.g:6307:2: (kw= '*' | kw= '/' | kw= '**' )
            int alt109=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt109=1;
                }
                break;
            case 66:
                {
                alt109=2;
                }
                break;
            case 67:
                {
                alt109=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // InternalAlf.g:6308:3: kw= '*'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:6314:3: kw= '/'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:6320:3: kw= '**'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

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
    // InternalAlf.g:6329:1: entryRuleUnitsExpression returns [EObject current=null] : iv_ruleUnitsExpression= ruleUnitsExpression EOF ;
    public final EObject entryRuleUnitsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitsExpression = null;


        try {
            // InternalAlf.g:6329:56: (iv_ruleUnitsExpression= ruleUnitsExpression EOF )
            // InternalAlf.g:6330:2: iv_ruleUnitsExpression= ruleUnitsExpression EOF
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
    // InternalAlf.g:6336:1: ruleUnitsExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@' ) ) otherlv_3= '[' ( (lv_operand_4_0= ruleExpression ) ) otherlv_5= ']' )? ) ;
    public final EObject ruleUnitsExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_operand_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:6342:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@' ) ) otherlv_3= '[' ( (lv_operand_4_0= ruleExpression ) ) otherlv_5= ']' )? ) )
            // InternalAlf.g:6343:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@' ) ) otherlv_3= '[' ( (lv_operand_4_0= ruleExpression ) ) otherlv_5= ']' )? )
            {
            // InternalAlf.g:6343:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@' ) ) otherlv_3= '[' ( (lv_operand_4_0= ruleExpression ) ) otherlv_5= ']' )? )
            // InternalAlf.g:6344:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= '@' ) ) otherlv_3= '[' ( (lv_operand_4_0= ruleExpression ) ) otherlv_5= ']' )?
            {

            			newCompositeNode(grammarAccess.getUnitsExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_91);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:6352:3: ( () ( (lv_operator_2_0= '@' ) ) otherlv_3= '[' ( (lv_operand_4_0= ruleExpression ) ) otherlv_5= ']' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==68) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalAlf.g:6353:4: () ( (lv_operator_2_0= '@' ) ) otherlv_3= '[' ( (lv_operand_4_0= ruleExpression ) ) otherlv_5= ']'
                    {
                    // InternalAlf.g:6353:4: ()
                    // InternalAlf.g:6354:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getUnitsExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:6360:4: ( (lv_operator_2_0= '@' ) )
                    // InternalAlf.g:6361:5: (lv_operator_2_0= '@' )
                    {
                    // InternalAlf.g:6361:5: (lv_operator_2_0= '@' )
                    // InternalAlf.g:6362:6: lv_operator_2_0= '@'
                    {
                    lv_operator_2_0=(Token)match(input,68,FOLLOW_92); 

                    						newLeafNode(lv_operator_2_0, grammarAccess.getUnitsExpressionAccess().getOperatorCommercialAtKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnitsExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_2_0, "@");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,49,FOLLOW_65); 

                    				newLeafNode(otherlv_3, grammarAccess.getUnitsExpressionAccess().getLeftSquareBracketKeyword_1_2());
                    			
                    // InternalAlf.g:6378:4: ( (lv_operand_4_0= ruleExpression ) )
                    // InternalAlf.g:6379:5: (lv_operand_4_0= ruleExpression )
                    {
                    // InternalAlf.g:6379:5: (lv_operand_4_0= ruleExpression )
                    // InternalAlf.g:6380:6: lv_operand_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getUnitsExpressionAccess().getOperandExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_72);
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

                    otherlv_5=(Token)match(input,51,FOLLOW_2); 

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
    // InternalAlf.g:6406:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlf.g:6406:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlf.g:6407:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalAlf.g:6413:1: ruleUnaryExpression returns [EObject current=null] : (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceAccessExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:6419:2: ( (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) )
            // InternalAlf.g:6420:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            {
            // InternalAlf.g:6420:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( ((LA111_0>=RULE_BOOLEAN_VALUE && LA111_0<=RULE_UNRESTRICTED_NAME)||(LA111_0>=18 && LA111_0<=19)||LA111_0==23||LA111_0==40||LA111_0==71) ) {
                alt111=1;
            }
            else if ( ((LA111_0>=64 && LA111_0<=65)||(LA111_0>=69 && LA111_0<=70)) ) {
                alt111=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // InternalAlf.g:6421:3: this_SequenceAccessExpression_0= ruleSequenceAccessExpression
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
                    // InternalAlf.g:6430:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    {
                    // InternalAlf.g:6430:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    // InternalAlf.g:6431:4: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    {
                    // InternalAlf.g:6431:4: ()
                    // InternalAlf.g:6432:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:6438:4: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // InternalAlf.g:6439:5: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // InternalAlf.g:6439:5: (lv_operator_2_0= ruleUnaryOperator )
                    // InternalAlf.g:6440:6: lv_operator_2_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_93);
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

                    // InternalAlf.g:6457:4: ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    // InternalAlf.g:6458:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    {
                    // InternalAlf.g:6458:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    // InternalAlf.g:6459:6: lv_operand_3_0= ruleSequenceAccessExpression
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
    // InternalAlf.g:6481:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalAlf.g:6481:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalAlf.g:6482:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalAlf.g:6488:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '!' | kw= '~' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:6494:2: ( (kw= '+' | kw= '-' | kw= '!' | kw= '~' ) )
            // InternalAlf.g:6495:2: (kw= '+' | kw= '-' | kw= '!' | kw= '~' )
            {
            // InternalAlf.g:6495:2: (kw= '+' | kw= '-' | kw= '!' | kw= '~' )
            int alt112=4;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt112=1;
                }
                break;
            case 65:
                {
                alt112=2;
                }
                break;
            case 69:
                {
                alt112=3;
                }
                break;
            case 70:
                {
                alt112=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // InternalAlf.g:6496:3: kw= '+'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:6502:3: kw= '-'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:6508:3: kw= '!'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getExclamationMarkKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:6514:3: kw= '~'
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
    // InternalAlf.g:6523:1: entryRuleSequenceAccessExpression returns [EObject current=null] : iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF ;
    public final EObject entryRuleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceAccessExpression = null;


        try {
            // InternalAlf.g:6523:65: (iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF )
            // InternalAlf.g:6524:2: iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF
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
    // InternalAlf.g:6530:1: ruleSequenceAccessExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']' )? ) ;
    public final EObject ruleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:6536:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']' )? ) )
            // InternalAlf.g:6537:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']' )? )
            {
            // InternalAlf.g:6537:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']' )? )
            // InternalAlf.g:6538:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']' )?
            {

            			newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_80);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:6546:3: ( () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==49) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalAlf.g:6547:4: () ( (lv_operator_2_0= '[' ) ) ( (lv_operand_3_0= ruleExpression ) ) otherlv_4= ']'
                    {
                    // InternalAlf.g:6547:4: ()
                    // InternalAlf.g:6548:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getSequenceAccessExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:6554:4: ( (lv_operator_2_0= '[' ) )
                    // InternalAlf.g:6555:5: (lv_operator_2_0= '[' )
                    {
                    // InternalAlf.g:6555:5: (lv_operator_2_0= '[' )
                    // InternalAlf.g:6556:6: lv_operator_2_0= '['
                    {
                    lv_operator_2_0=(Token)match(input,49,FOLLOW_65); 

                    						newLeafNode(lv_operator_2_0, grammarAccess.getSequenceAccessExpressionAccess().getOperatorLeftSquareBracketKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSequenceAccessExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_2_0, "[");
                    					

                    }


                    }

                    // InternalAlf.g:6568:4: ( (lv_operand_3_0= ruleExpression ) )
                    // InternalAlf.g:6569:5: (lv_operand_3_0= ruleExpression )
                    {
                    // InternalAlf.g:6569:5: (lv_operand_3_0= ruleExpression )
                    // InternalAlf.g:6570:6: lv_operand_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getOperandExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_72);
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

                    otherlv_4=(Token)match(input,51,FOLLOW_2); 

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
    // InternalAlf.g:6596:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalAlf.g:6596:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalAlf.g:6597:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalAlf.g:6603:1: rulePrimaryExpression returns [EObject current=null] : (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_NameExpression_2= ruleNameExpression | this_InvocationExpression_3= ruleInvocationExpression | this_SequenceConstructionExpression_4= ruleSequenceConstructionExpression | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
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
            // InternalAlf.g:6609:2: ( (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_NameExpression_2= ruleNameExpression | this_InvocationExpression_3= ruleInvocationExpression | this_SequenceConstructionExpression_4= ruleSequenceConstructionExpression | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) ) )
            // InternalAlf.g:6610:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_NameExpression_2= ruleNameExpression | this_InvocationExpression_3= ruleInvocationExpression | this_SequenceConstructionExpression_4= ruleSequenceConstructionExpression | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) )
            {
            // InternalAlf.g:6610:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_NameExpression_2= ruleNameExpression | this_InvocationExpression_3= ruleInvocationExpression | this_SequenceConstructionExpression_4= ruleSequenceConstructionExpression | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) )
            int alt114=6;
            alt114 = dfa114.predict(input);
            switch (alt114) {
                case 1 :
                    // InternalAlf.g:6611:3: this_NullExpression_0= ruleNullExpression
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
                    // InternalAlf.g:6620:3: this_LiteralExpression_1= ruleLiteralExpression
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
                    // InternalAlf.g:6629:3: this_NameExpression_2= ruleNameExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNameExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameExpression_2=ruleNameExpression();

                    state._fsp--;


                    			current = this_NameExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:6638:3: this_InvocationExpression_3= ruleInvocationExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getInvocationExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_InvocationExpression_3=ruleInvocationExpression();

                    state._fsp--;


                    			current = this_InvocationExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:6647:3: this_SequenceConstructionExpression_4= ruleSequenceConstructionExpression
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
                    // InternalAlf.g:6656:3: (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' )
                    {
                    // InternalAlf.g:6656:3: (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' )
                    // InternalAlf.g:6657:4: otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_65); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_94);
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


    // $ANTLR start "entryRuleNameExpression"
    // InternalAlf.g:6678:1: entryRuleNameExpression returns [EObject current=null] : iv_ruleNameExpression= ruleNameExpression EOF ;
    public final EObject entryRuleNameExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpression = null;


        try {
            // InternalAlf.g:6678:55: (iv_ruleNameExpression= ruleNameExpression EOF )
            // InternalAlf.g:6679:2: iv_ruleNameExpression= ruleNameExpression EOF
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
    // InternalAlf.g:6685:1: ruleNameExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleNameExpression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:6691:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:6692:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:6692:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:6693:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:6693:3: ( ruleQualifiedName )
            // InternalAlf.g:6694:4: ruleQualifiedName
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
    // InternalAlf.g:6711:1: entryRuleInvocationExpression returns [EObject current=null] : iv_ruleInvocationExpression= ruleInvocationExpression EOF ;
    public final EObject entryRuleInvocationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvocationExpression = null;


        try {
            // InternalAlf.g:6711:61: (iv_ruleInvocationExpression= ruleInvocationExpression EOF )
            // InternalAlf.g:6712:2: iv_ruleInvocationExpression= ruleInvocationExpression EOF
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
    // InternalAlf.g:6718:1: ruleInvocationExpression returns [EObject current=null] : ( ( (lv_ownedRelationship_0_0= ruleFeatureTyping ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' ) ;
    public final EObject ruleInvocationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject this_Tuple_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:6724:2: ( ( ( (lv_ownedRelationship_0_0= ruleFeatureTyping ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' ) )
            // InternalAlf.g:6725:2: ( ( (lv_ownedRelationship_0_0= ruleFeatureTyping ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' )
            {
            // InternalAlf.g:6725:2: ( ( (lv_ownedRelationship_0_0= ruleFeatureTyping ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' )
            // InternalAlf.g:6726:3: ( (lv_ownedRelationship_0_0= ruleFeatureTyping ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')'
            {
            // InternalAlf.g:6726:3: ( (lv_ownedRelationship_0_0= ruleFeatureTyping ) )
            // InternalAlf.g:6727:4: (lv_ownedRelationship_0_0= ruleFeatureTyping )
            {
            // InternalAlf.g:6727:4: (lv_ownedRelationship_0_0= ruleFeatureTyping )
            // InternalAlf.g:6728:5: lv_ownedRelationship_0_0= ruleFeatureTyping
            {

            					newCompositeNode(grammarAccess.getInvocationExpressionAccess().getOwnedRelationshipFeatureTypingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_55);
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

            otherlv_1=(Token)match(input,40,FOLLOW_95); 

            			newLeafNode(otherlv_1, grammarAccess.getInvocationExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlf.g:6749:3: (this_Tuple_2= ruleTuple[$current] )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( ((LA115_0>=RULE_BOOLEAN_VALUE && LA115_0<=RULE_UNRESTRICTED_NAME)||(LA115_0>=18 && LA115_0<=19)||LA115_0==23||LA115_0==40||(LA115_0>=64 && LA115_0<=65)||(LA115_0>=69 && LA115_0<=71)) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalAlf.g:6750:4: this_Tuple_2= ruleTuple[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getInvocationExpressionRule());
                    				}
                    				newCompositeNode(grammarAccess.getInvocationExpressionAccess().getTupleParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_94);
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
    // InternalAlf.g:6771:1: ruleTuple[EObject in_current] returns [EObject current=in_current] : (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] ) ;
    public final EObject ruleTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_PositionalTuple_0 = null;

        EObject this_NamedTuple_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:6777:2: ( (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] ) )
            // InternalAlf.g:6778:2: (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] )
            {
            // InternalAlf.g:6778:2: (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] )
            int alt116=2;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN_VALUE:
            case RULE_STRING_VALUE:
            case RULE_NATURAL_VALUE:
            case RULE_EXP_VALUE:
            case 18:
            case 19:
            case 23:
            case 40:
            case 64:
            case 65:
            case 69:
            case 70:
            case 71:
                {
                alt116=1;
                }
                break;
            case RULE_ID:
                {
                int LA116_2 = input.LA(2);

                if ( ((LA116_2>=17 && LA116_2<=19)||LA116_2==38||(LA116_2>=40 && LA116_2<=41)||LA116_2==49||(LA116_2>=55 && LA116_2<=68)) ) {
                    alt116=1;
                }
                else if ( (LA116_2==54) ) {
                    alt116=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 116, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA116_3 = input.LA(2);

                if ( ((LA116_3>=17 && LA116_3<=19)||LA116_3==38||(LA116_3>=40 && LA116_3<=41)||LA116_3==49||(LA116_3>=55 && LA116_3<=68)) ) {
                    alt116=1;
                }
                else if ( (LA116_3==54) ) {
                    alt116=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 116, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // InternalAlf.g:6779:3: this_PositionalTuple_0= rulePositionalTuple[$current]
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
                    // InternalAlf.g:6791:3: this_NamedTuple_1= ruleNamedTuple[$current]
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
    // InternalAlf.g:6807:1: rulePositionalTuple[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleExpressionMember ) ) )* ) ;
    public final EObject rulePositionalTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:6813:2: ( ( ( (lv_ownedRelationship_0_0= ruleExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleExpressionMember ) ) )* ) )
            // InternalAlf.g:6814:2: ( ( (lv_ownedRelationship_0_0= ruleExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleExpressionMember ) ) )* )
            {
            // InternalAlf.g:6814:2: ( ( (lv_ownedRelationship_0_0= ruleExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleExpressionMember ) ) )* )
            // InternalAlf.g:6815:3: ( (lv_ownedRelationship_0_0= ruleExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleExpressionMember ) ) )*
            {
            // InternalAlf.g:6815:3: ( (lv_ownedRelationship_0_0= ruleExpressionMember ) )
            // InternalAlf.g:6816:4: (lv_ownedRelationship_0_0= ruleExpressionMember )
            {
            // InternalAlf.g:6816:4: (lv_ownedRelationship_0_0= ruleExpressionMember )
            // InternalAlf.g:6817:5: lv_ownedRelationship_0_0= ruleExpressionMember
            {

            					newCompositeNode(grammarAccess.getPositionalTupleAccess().getOwnedRelationshipExpressionMemberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalAlf.g:6834:3: (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleExpressionMember ) ) )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==38) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // InternalAlf.g:6835:4: otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleExpressionMember ) )
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_65); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPositionalTupleAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalAlf.g:6839:4: ( (lv_ownedRelationship_2_0= ruleExpressionMember ) )
            	    // InternalAlf.g:6840:5: (lv_ownedRelationship_2_0= ruleExpressionMember )
            	    {
            	    // InternalAlf.g:6840:5: (lv_ownedRelationship_2_0= ruleExpressionMember )
            	    // InternalAlf.g:6841:6: lv_ownedRelationship_2_0= ruleExpressionMember
            	    {

            	    						newCompositeNode(grammarAccess.getPositionalTupleAccess().getOwnedRelationshipExpressionMemberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
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
    // $ANTLR end "rulePositionalTuple"


    // $ANTLR start "ruleNamedTuple"
    // InternalAlf.g:6864:1: ruleNamedTuple[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )* ) ;
    public final EObject ruleNamedTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_ownedRelationship_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:6870:2: ( ( ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )* ) )
            // InternalAlf.g:6871:2: ( ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )* )
            {
            // InternalAlf.g:6871:2: ( ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )* )
            // InternalAlf.g:6872:3: ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) ) (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )*
            {
            // InternalAlf.g:6872:3: ( (lv_ownedRelationship_0_0= ruleNamedExpressionMember ) )
            // InternalAlf.g:6873:4: (lv_ownedRelationship_0_0= ruleNamedExpressionMember )
            {
            // InternalAlf.g:6873:4: (lv_ownedRelationship_0_0= ruleNamedExpressionMember )
            // InternalAlf.g:6874:5: lv_ownedRelationship_0_0= ruleNamedExpressionMember
            {

            					newCompositeNode(grammarAccess.getNamedTupleAccess().getOwnedRelationshipNamedExpressionMemberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalAlf.g:6891:3: (otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) ) )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==38) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // InternalAlf.g:6892:4: otherlv_1= ',' ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) )
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_65); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNamedTupleAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalAlf.g:6896:4: ( (lv_ownedRelationship_2_0= ruleNamedExpressionMember ) )
            	    // InternalAlf.g:6897:5: (lv_ownedRelationship_2_0= ruleNamedExpressionMember )
            	    {
            	    // InternalAlf.g:6897:5: (lv_ownedRelationship_2_0= ruleNamedExpressionMember )
            	    // InternalAlf.g:6898:6: lv_ownedRelationship_2_0= ruleNamedExpressionMember
            	    {

            	    						newCompositeNode(grammarAccess.getNamedTupleAccess().getOwnedRelationshipNamedExpressionMemberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
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
    // $ANTLR end "ruleNamedTuple"


    // $ANTLR start "entryRuleSequenceConstructionExpression"
    // InternalAlf.g:6920:1: entryRuleSequenceConstructionExpression returns [EObject current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
    public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionExpression = null;


        try {
            // InternalAlf.g:6920:71: (iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:6921:2: iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF
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
    // InternalAlf.g:6927:1: ruleSequenceConstructionExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:6933:2: ( ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalAlf.g:6934:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalAlf.g:6934:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // InternalAlf.g:6935:3: () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalAlf.g:6935:3: ()
            // InternalAlf.g:6936:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_96); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:6946:3: ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( ((LA120_0>=RULE_BOOLEAN_VALUE && LA120_0<=RULE_UNRESTRICTED_NAME)||(LA120_0>=18 && LA120_0<=19)||LA120_0==23||LA120_0==40||(LA120_0>=64 && LA120_0<=65)||(LA120_0>=69 && LA120_0<=71)) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalAlf.g:6947:4: ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:6947:4: ( (lv_element_2_0= ruleExpression ) )
                    // InternalAlf.g:6948:5: (lv_element_2_0= ruleExpression )
                    {
                    // InternalAlf.g:6948:5: (lv_element_2_0= ruleExpression )
                    // InternalAlf.g:6949:6: lv_element_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_97);
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

                    // InternalAlf.g:6966:4: (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==38) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // InternalAlf.g:6967:5: otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,38,FOLLOW_65); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:6971:5: ( (lv_element_4_0= ruleExpression ) )
                    	    // InternalAlf.g:6972:6: (lv_element_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:6972:6: (lv_element_4_0= ruleExpression )
                    	    // InternalAlf.g:6973:7: lv_element_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_97);
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
                    	    break loop119;
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
    // InternalAlf.g:7000:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // InternalAlf.g:7000:55: (iv_ruleNullExpression= ruleNullExpression EOF )
            // InternalAlf.g:7001:2: iv_ruleNullExpression= ruleNullExpression EOF
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
    // InternalAlf.g:7007:1: ruleNullExpression returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlf.g:7013:2: ( ( () otherlv_1= 'null' ) )
            // InternalAlf.g:7014:2: ( () otherlv_1= 'null' )
            {
            // InternalAlf.g:7014:2: ( () otherlv_1= 'null' )
            // InternalAlf.g:7015:3: () otherlv_1= 'null'
            {
            // InternalAlf.g:7015:3: ()
            // InternalAlf.g:7016:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullExpressionAccess().getNullExpressionAction_0(),
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
    // InternalAlf.g:7030:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalAlf.g:7030:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalAlf.g:7031:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalAlf.g:7037:1: ruleLiteralExpression returns [EObject current=null] : (this_BooleanLiteralExpression_0= ruleBooleanLiteralExpression | this_StringLiteralExpression_1= ruleStringLiteralExpression | this_RealLiteralExpression_2= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_3= ruleUnlimitedNaturalLiteralExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanLiteralExpression_0 = null;

        EObject this_StringLiteralExpression_1 = null;

        EObject this_RealLiteralExpression_2 = null;

        EObject this_UnlimitedNaturalLiteralExpression_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:7043:2: ( (this_BooleanLiteralExpression_0= ruleBooleanLiteralExpression | this_StringLiteralExpression_1= ruleStringLiteralExpression | this_RealLiteralExpression_2= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_3= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:7044:2: (this_BooleanLiteralExpression_0= ruleBooleanLiteralExpression | this_StringLiteralExpression_1= ruleStringLiteralExpression | this_RealLiteralExpression_2= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_3= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:7044:2: (this_BooleanLiteralExpression_0= ruleBooleanLiteralExpression | this_StringLiteralExpression_1= ruleStringLiteralExpression | this_RealLiteralExpression_2= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_3= ruleUnlimitedNaturalLiteralExpression )
            int alt121=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN_VALUE:
                {
                alt121=1;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt121=2;
                }
                break;
            case RULE_NATURAL_VALUE:
                {
                int LA121_3 = input.LA(2);

                if ( (LA121_3==EOF||(LA121_3>=19 && LA121_3<=20)||(LA121_3>=23 && LA121_3<=24)||LA121_3==38||LA121_3==41||LA121_3==49||LA121_3==51||(LA121_3>=55 && LA121_3<=68)) ) {
                    alt121=4;
                }
                else if ( (LA121_3==18) ) {
                    alt121=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 121, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_EXP_VALUE:
            case 18:
                {
                alt121=3;
                }
                break;
            case 19:
                {
                alt121=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // InternalAlf.g:7045:3: this_BooleanLiteralExpression_0= ruleBooleanLiteralExpression
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
                    // InternalAlf.g:7054:3: this_StringLiteralExpression_1= ruleStringLiteralExpression
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
                    // InternalAlf.g:7063:3: this_RealLiteralExpression_2= ruleRealLiteralExpression
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
                    // InternalAlf.g:7072:3: this_UnlimitedNaturalLiteralExpression_3= ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:7084:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // InternalAlf.g:7084:65: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:7085:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
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
    // InternalAlf.g:7091:1: ruleBooleanLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:7097:2: ( ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) )
            // InternalAlf.g:7098:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            {
            // InternalAlf.g:7098:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:7099:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:7099:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            // InternalAlf.g:7100:4: lv_value_0_0= RULE_BOOLEAN_VALUE
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
    // InternalAlf.g:7119:1: entryRuleStringLiteralExpression returns [EObject current=null] : iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF ;
    public final EObject entryRuleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpression = null;


        try {
            // InternalAlf.g:7119:64: (iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF )
            // InternalAlf.g:7120:2: iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF
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
    // InternalAlf.g:7126:1: ruleStringLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:7132:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalAlf.g:7133:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalAlf.g:7133:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalAlf.g:7134:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalAlf.g:7134:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalAlf.g:7135:4: lv_value_0_0= RULE_STRING_VALUE
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
    // InternalAlf.g:7154:1: entryRuleRealLiteralExpression returns [EObject current=null] : iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF ;
    public final EObject entryRuleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteralExpression = null;


        try {
            // InternalAlf.g:7154:62: (iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF )
            // InternalAlf.g:7155:2: iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF
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
    // InternalAlf.g:7161:1: ruleRealLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:7167:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalAlf.g:7168:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalAlf.g:7168:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalAlf.g:7169:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalAlf.g:7169:3: (lv_value_0_0= ruleRealValue )
            // InternalAlf.g:7170:4: lv_value_0_0= ruleRealValue
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
    // InternalAlf.g:7190:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalAlf.g:7190:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalAlf.g:7191:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalAlf.g:7197:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_VALUE_0=null;
        Token kw=null;
        Token this_NATURAL_VALUE_2=null;
        Token this_EXP_VALUE_3=null;
        Token this_EXP_VALUE_4=null;


        	enterRule();

        try {
            // InternalAlf.g:7203:2: ( ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) )
            // InternalAlf.g:7204:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            {
            // InternalAlf.g:7204:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==RULE_NATURAL_VALUE||LA124_0==18) ) {
                alt124=1;
            }
            else if ( (LA124_0==RULE_EXP_VALUE) ) {
                alt124=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // InternalAlf.g:7205:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    {
                    // InternalAlf.g:7205:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    // InternalAlf.g:7206:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    {
                    // InternalAlf.g:7206:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )?
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==RULE_NATURAL_VALUE) ) {
                        alt122=1;
                    }
                    switch (alt122) {
                        case 1 :
                            // InternalAlf.g:7207:5: this_NATURAL_VALUE_0= RULE_NATURAL_VALUE
                            {
                            this_NATURAL_VALUE_0=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_18); 

                            					current.merge(this_NATURAL_VALUE_0);
                            				

                            					newLeafNode(this_NATURAL_VALUE_0, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,18,FOLLOW_98); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1());
                    			
                    // InternalAlf.g:7220:4: (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    int alt123=2;
                    int LA123_0 = input.LA(1);

                    if ( (LA123_0==RULE_NATURAL_VALUE) ) {
                        alt123=1;
                    }
                    else if ( (LA123_0==RULE_EXP_VALUE) ) {
                        alt123=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 123, 0, input);

                        throw nvae;
                    }
                    switch (alt123) {
                        case 1 :
                            // InternalAlf.g:7221:5: this_NATURAL_VALUE_2= RULE_NATURAL_VALUE
                            {
                            this_NATURAL_VALUE_2=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_2); 

                            					current.merge(this_NATURAL_VALUE_2);
                            				

                            					newLeafNode(this_NATURAL_VALUE_2, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:7229:5: this_EXP_VALUE_3= RULE_EXP_VALUE
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
                    // InternalAlf.g:7239:3: this_EXP_VALUE_4= RULE_EXP_VALUE
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
    // InternalAlf.g:7250:1: entryRuleNaturalLiteralExpression returns [EObject current=null] : iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF ;
    public final EObject entryRuleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:7250:65: (iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:7251:2: iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF
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
    // InternalAlf.g:7257:1: ruleNaturalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) ;
    public final EObject ruleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:7263:2: ( ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) )
            // InternalAlf.g:7264:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            {
            // InternalAlf.g:7264:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            // InternalAlf.g:7265:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:7265:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            // InternalAlf.g:7266:4: lv_value_0_0= RULE_NATURAL_VALUE
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
    // InternalAlf.g:7285:1: entryRuleUnlimitedNaturalLiteralExpression returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:7285:74: (iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:7286:2: iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF
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
    // InternalAlf.g:7292:1: ruleUnlimitedNaturalLiteralExpression returns [EObject current=null] : (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NaturalLiteralExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:7298:2: ( (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) )
            // InternalAlf.g:7299:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            {
            // InternalAlf.g:7299:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==RULE_NATURAL_VALUE) ) {
                alt125=1;
            }
            else if ( (LA125_0==19) ) {
                alt125=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // InternalAlf.g:7300:3: this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression
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
                    // InternalAlf.g:7309:3: ( () otherlv_2= '*' )
                    {
                    // InternalAlf.g:7309:3: ( () otherlv_2= '*' )
                    // InternalAlf.g:7310:4: () otherlv_2= '*'
                    {
                    // InternalAlf.g:7310:4: ()
                    // InternalAlf.g:7311:5: 
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


    // $ANTLR start "entryRuleExpressionMember"
    // InternalAlf.g:7326:1: entryRuleExpressionMember returns [EObject current=null] : iv_ruleExpressionMember= ruleExpressionMember EOF ;
    public final EObject entryRuleExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionMember = null;


        try {
            // InternalAlf.g:7326:57: (iv_ruleExpressionMember= ruleExpressionMember EOF )
            // InternalAlf.g:7327:2: iv_ruleExpressionMember= ruleExpressionMember EOF
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
    // InternalAlf.g:7333:1: ruleExpressionMember returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleExpression ) ) ;
    public final EObject ruleExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:7339:2: ( ( (lv_ownedRelatedElement_0_0= ruleExpression ) ) )
            // InternalAlf.g:7340:2: ( (lv_ownedRelatedElement_0_0= ruleExpression ) )
            {
            // InternalAlf.g:7340:2: ( (lv_ownedRelatedElement_0_0= ruleExpression ) )
            // InternalAlf.g:7341:3: (lv_ownedRelatedElement_0_0= ruleExpression )
            {
            // InternalAlf.g:7341:3: (lv_ownedRelatedElement_0_0= ruleExpression )
            // InternalAlf.g:7342:4: lv_ownedRelatedElement_0_0= ruleExpression
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


    // $ANTLR start "entryRuleNamedExpressionMember"
    // InternalAlf.g:7362:1: entryRuleNamedExpressionMember returns [EObject current=null] : iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF ;
    public final EObject entryRuleNamedExpressionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedExpressionMember = null;


        try {
            // InternalAlf.g:7362:62: (iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF )
            // InternalAlf.g:7363:2: iv_ruleNamedExpressionMember= ruleNamedExpressionMember EOF
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
    // InternalAlf.g:7369:1: ruleNamedExpressionMember returns [EObject current=null] : ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedRelatedElement_2_0= ruleExpression ) ) ) ;
    public final EObject ruleNamedExpressionMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_memberName_0_0 = null;

        EObject lv_ownedRelatedElement_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:7375:2: ( ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedRelatedElement_2_0= ruleExpression ) ) ) )
            // InternalAlf.g:7376:2: ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedRelatedElement_2_0= ruleExpression ) ) )
            {
            // InternalAlf.g:7376:2: ( ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedRelatedElement_2_0= ruleExpression ) ) )
            // InternalAlf.g:7377:3: ( (lv_memberName_0_0= ruleName ) ) otherlv_1= '=>' ( (lv_ownedRelatedElement_2_0= ruleExpression ) )
            {
            // InternalAlf.g:7377:3: ( (lv_memberName_0_0= ruleName ) )
            // InternalAlf.g:7378:4: (lv_memberName_0_0= ruleName )
            {
            // InternalAlf.g:7378:4: (lv_memberName_0_0= ruleName )
            // InternalAlf.g:7379:5: lv_memberName_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getNamedExpressionMemberAccess().getMemberNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_82);
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

            otherlv_1=(Token)match(input,54,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedExpressionMemberAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalAlf.g:7400:3: ( (lv_ownedRelatedElement_2_0= ruleExpression ) )
            // InternalAlf.g:7401:4: (lv_ownedRelatedElement_2_0= ruleExpression )
            {
            // InternalAlf.g:7401:4: (lv_ownedRelatedElement_2_0= ruleExpression )
            // InternalAlf.g:7402:5: lv_ownedRelatedElement_2_0= ruleExpression
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


    // $ANTLR start "entryRuleName"
    // InternalAlf.g:7423:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAlf.g:7423:44: (iv_ruleName= ruleName EOF )
            // InternalAlf.g:7424:2: iv_ruleName= ruleName EOF
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
    // InternalAlf.g:7430:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalAlf.g:7436:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalAlf.g:7437:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalAlf.g:7437:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==RULE_ID) ) {
                alt126=1;
            }
            else if ( (LA126_0==RULE_UNRESTRICTED_NAME) ) {
                alt126=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // InternalAlf.g:7438:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:7446:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:7457:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlf.g:7457:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlf.g:7458:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlf.g:7464:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_ColonQualifiedName_1 = null;

        AntlrDatatypeRuleToken this_DotQualifiedName_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:7470:2: ( (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) )
            // InternalAlf.g:7471:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            {
            // InternalAlf.g:7471:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            int alt127=3;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt127=3;
                    }
                    break;
                case 17:
                    {
                    alt127=2;
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
                    alt127=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA127_0==RULE_UNRESTRICTED_NAME) ) {
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
                    alt127=1;
                    }
                    break;
                case 18:
                    {
                    alt127=3;
                    }
                    break;
                case 17:
                    {
                    alt127=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // InternalAlf.g:7472:3: this_Name_0= ruleName
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
                    // InternalAlf.g:7483:3: this_ColonQualifiedName_1= ruleColonQualifiedName
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
                    // InternalAlf.g:7494:3: this_DotQualifiedName_2= ruleDotQualifiedName
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
    // InternalAlf.g:7508:1: entryRuleColonQualifiedName returns [String current=null] : iv_ruleColonQualifiedName= ruleColonQualifiedName EOF ;
    public final String entryRuleColonQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColonQualifiedName = null;


        try {
            // InternalAlf.g:7508:58: (iv_ruleColonQualifiedName= ruleColonQualifiedName EOF )
            // InternalAlf.g:7509:2: iv_ruleColonQualifiedName= ruleColonQualifiedName EOF
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
    // InternalAlf.g:7515:1: ruleColonQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleColonQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:7521:2: ( (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:7522:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:7522:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            // InternalAlf.g:7523:3: this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:7533:3: (kw= '::' this_Name_2= ruleName )+
            int cnt128=0;
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==17) ) {
                    int LA128_1 = input.LA(2);

                    if ( ((LA128_1>=RULE_ID && LA128_1<=RULE_UNRESTRICTED_NAME)) ) {
                        alt128=1;
                    }


                }


                switch (alt128) {
            	case 1 :
            	    // InternalAlf.g:7534:4: kw= '::' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,17,FOLLOW_13); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getColonQualifiedNameAccess().getColonColonKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_99);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt128 >= 1 ) break loop128;
                        EarlyExitException eee =
                            new EarlyExitException(128, input);
                        throw eee;
                }
                cnt128++;
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
    // InternalAlf.g:7554:1: entryRuleDotQualifiedName returns [String current=null] : iv_ruleDotQualifiedName= ruleDotQualifiedName EOF ;
    public final String entryRuleDotQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDotQualifiedName = null;


        try {
            // InternalAlf.g:7554:56: (iv_ruleDotQualifiedName= ruleDotQualifiedName EOF )
            // InternalAlf.g:7555:2: iv_ruleDotQualifiedName= ruleDotQualifiedName EOF
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
    // InternalAlf.g:7561:1: ruleDotQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleDotQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:7567:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:7568:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:7568:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            // InternalAlf.g:7569:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:7579:3: (kw= '.' this_Name_2= ruleName )+
            int cnt129=0;
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==18) ) {
                    int LA129_1 = input.LA(2);

                    if ( ((LA129_1>=RULE_ID && LA129_1<=RULE_UNRESTRICTED_NAME)) ) {
                        alt129=1;
                    }


                }


                switch (alt129) {
            	case 1 :
            	    // InternalAlf.g:7580:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,18,FOLLOW_13); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getDotQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_100);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt129 >= 1 ) break loop129;
                        EarlyExitException eee =
                            new EarlyExitException(129, input);
                        throw eee;
                }
                cnt129++;
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
    // InternalAlf.g:7600:1: rulePackageElementVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator rulePackageElementVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAlf.g:7606:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // InternalAlf.g:7607:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // InternalAlf.g:7607:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==72) ) {
                alt130=1;
            }
            else if ( (LA130_0==73) ) {
                alt130=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }
            switch (alt130) {
                case 1 :
                    // InternalAlf.g:7608:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:7608:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:7609:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getPackageElementVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPackageElementVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:7616:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:7616:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:7617:4: enumLiteral_1= 'private'
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
    // InternalAlf.g:7627:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAlf.g:7633:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) )
            // InternalAlf.g:7634:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            {
            // InternalAlf.g:7634:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            int alt131=4;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt131=1;
                }
                break;
            case 73:
                {
                alt131=2;
                }
                break;
            case 74:
                {
                alt131=3;
                }
                break;
            case 75:
                {
                alt131=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }

            switch (alt131) {
                case 1 :
                    // InternalAlf.g:7635:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:7635:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:7636:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:7643:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:7643:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:7644:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:7651:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalAlf.g:7651:3: (enumLiteral_2= 'protected' )
                    // InternalAlf.g:7652:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:7659:3: (enumLiteral_3= 'packaged' )
                    {
                    // InternalAlf.g:7659:3: (enumLiteral_3= 'packaged' )
                    // InternalAlf.g:7660:4: enumLiteral_3= 'packaged'
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
    // InternalAlf.g:7670:1: ruleFeatureDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFeatureDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAlf.g:7676:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalAlf.g:7677:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalAlf.g:7677:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt132=3;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt132=1;
                }
                break;
            case 77:
                {
                alt132=2;
                }
                break;
            case 78:
                {
                alt132=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }

            switch (alt132) {
                case 1 :
                    // InternalAlf.g:7678:3: (enumLiteral_0= 'in' )
                    {
                    // InternalAlf.g:7678:3: (enumLiteral_0= 'in' )
                    // InternalAlf.g:7679:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:7686:3: (enumLiteral_1= 'out' )
                    {
                    // InternalAlf.g:7686:3: (enumLiteral_1= 'out' )
                    // InternalAlf.g:7687:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:7694:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalAlf.g:7694:3: (enumLiteral_2= 'inout' )
                    // InternalAlf.g:7695:4: enumLiteral_2= 'inout'
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
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA93 dfa93 = new DFA93(this);
    protected DFA89 dfa89 = new DFA89(this);
    protected DFA97 dfa97 = new DFA97(this);
    protected DFA94 dfa94 = new DFA94(this);
    protected DFA114 dfa114 = new DFA114(this);
    static final String dfa_1s = "\36\uffff";
    static final String dfa_2s = "\2\4\2\20\1\11\1\uffff\1\32\5\uffff\2\21\3\11\1\4\2\21\1\24\2\22\2\24\1\11\1\4\1\11\2\24";
    static final String dfa_3s = "\2\111\2\20\1\12\1\uffff\1\40\5\uffff\2\25\2\23\1\12\1\111\2\25\1\24\2\25\2\24\1\23\1\111\1\23\2\24";
    static final String dfa_4s = "\5\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\22\uffff";
    static final String dfa_5s = "\36\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\13\uffff\1\4\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\12\2\uffff\1\13\1\6\46\uffff\1\2\1\3",
            "\1\1\13\uffff\1\4\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\12\2\uffff\1\13\1\6\46\uffff\1\2\1\3",
            "\1\4",
            "\1\4",
            "\1\14\1\15",
            "",
            "\1\7\1\10\1\11\1\12\2\uffff\1\13",
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
            "\1\1\13\uffff\1\4\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\12\2\uffff\1\13\1\6\46\uffff\1\2\1\3",
            "\1\31\2\uffff\1\21\1\20",
            "\1\31\2\uffff\1\21\1\20",
            "\1\32",
            "\1\33\1\uffff\1\21\1\20",
            "\1\33\1\uffff\1\21\1\20",
            "\1\21",
            "\1\21",
            "\1\22\1\23\10\uffff\1\34",
            "\1\1\13\uffff\1\4\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\12\2\uffff\1\13\1\6\46\uffff\1\2\1\3",
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
    static final String dfa_8s = "\2\4\1\uffff\2\20\1\11\2\21\1\11\1\uffff\1\11\2\21\1\uffff\2\22\2\11";
    static final String dfa_9s = "\2\111\1\uffff\2\20\1\12\2\25\1\23\1\uffff\1\23\2\25\1\uffff\2\25\2\23";
    static final String dfa_10s = "\2\uffff\1\3\6\uffff\1\2\3\uffff\1\1\4\uffff";
    static final String dfa_11s = "\22\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\13\uffff\1\5\5\uffff\1\2\3\uffff\4\2\2\uffff\2\2\46\uffff\1\3\1\4",
            "\1\1\13\uffff\1\5\5\uffff\1\2\3\uffff\4\2\2\uffff\2\2\46\uffff\1\3\1\4",
            "",
            "\1\5",
            "\1\5",
            "\1\6\1\7",
            "\1\10\1\12\1\uffff\2\11",
            "\1\10\1\12\1\uffff\2\11",
            "\1\13\1\14\10\uffff\1\15",
            "",
            "\1\16\1\17\10\uffff\1\15",
            "\1\20\2\uffff\2\11",
            "\1\20\2\uffff\2\11",
            "",
            "\1\21\1\uffff\2\11",
            "\1\21\1\uffff\2\11",
            "\1\13\1\14\10\uffff\1\15",
            "\1\16\1\17\10\uffff\1\15"
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
            return "()* loopback of 392:3: ( ( (lv_ownedRelationship_0_0= rulePackageImport ) ) | ( (lv_ownedRelationship_1_0= ruleElementImport ) ) )*";
        }
    }
    static final String dfa_13s = "\1\4\1\uffff\1\4\2\11\1\uffff\1\11\2\21\2\11\2\21\1\uffff\2\22\2\11";
    static final String dfa_14s = "\1\111\1\uffff\1\111\2\41\1\uffff\1\12\2\25\2\23\2\25\1\uffff\2\25\2\23";
    static final String dfa_15s = "\1\uffff\1\3\3\uffff\1\1\7\uffff\1\2\4\uffff";
    static final String[] dfa_16s = {
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\1\uffff\1\1\1\uffff\10\5\46\uffff\1\3\1\4",
            "",
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\10\5\46\uffff\1\3\1\4",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\10\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\10\5",
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
            return "()* loopback of 905:3: ( ( (lv_ownedRelationship_3_0= rulePackageMember ) ) | ( (lv_ownedRelationship_4_0= rulePackageImport ) ) )*";
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
            return "1068:2: ( ( (lv_ownedRelatedElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) | (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' ) | (otherlv_26= 'behavior' ( (lv_memberName_27_0= ruleName ) )? otherlv_28= 'is' ( ( ruleQualifiedName ) ) otherlv_30= ';' ) | (otherlv_31= 'function' ( (lv_memberName_32_0= ruleName ) )? otherlv_33= 'is' ( ( ruleQualifiedName ) ) otherlv_35= ';' ) | (otherlv_36= 'import' ( ( ruleQualifiedName ) ) (otherlv_38= 'as' ( (lv_memberName_39_0= ruleName ) ) )? otherlv_40= ';' ) )";
        }
    }
    static final String dfa_23s = "\15\uffff";
    static final String dfa_24s = "\2\11\2\24\1\11\2\24\3\uffff\1\11\2\uffff";
    static final String dfa_25s = "\1\41\1\52\2\64\1\40\2\64\3\uffff\1\52\2\uffff";
    static final String dfa_26s = "\7\uffff\1\3\1\5\1\1\1\uffff\1\2\1\4";
    static final String dfa_27s = "\15\uffff}>";
    static final String[] dfa_28s = {
            "\1\2\1\3\25\uffff\1\1\1\4",
            "\1\5\1\6\16\uffff\1\10\20\uffff\1\7",
            "\1\11\2\uffff\1\11\1\uffff\1\10\20\uffff\3\11\2\uffff\3\11\2\uffff\1\11",
            "\1\11\2\uffff\1\11\1\uffff\1\10\20\uffff\3\11\2\uffff\3\11\2\uffff\1\11",
            "\2\13\25\uffff\1\12",
            "\1\11\2\uffff\1\11\1\uffff\1\10\20\uffff\3\11\2\uffff\3\11\2\uffff\1\11",
            "\1\11\2\uffff\1\11\1\uffff\1\10\20\uffff\3\11\2\uffff\3\11\2\uffff\1\11",
            "",
            "",
            "",
            "\2\13\37\uffff\1\14",
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
            return "1502:2: ( ( (otherlv_0= 'feature' )? ( (lv_ownedRelatedElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'abstract' (otherlv_3= 'feature' )? ( (lv_ownedRelatedElement_4_0= ruleAbstractNamedFeatureDefinition ) ) ) | (otherlv_5= 'feature' ( (lv_ownedRelatedElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_7= 'abstract' otherlv_8= 'feature' ( (lv_ownedRelatedElement_9_0= ruleAbstractUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_10= 'feature' ( (lv_memberName_11_0= ruleName ) )? ) | ( (lv_memberName_12_0= ruleName ) ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) )";
        }
    }
    static final String dfa_29s = "\1\116\1\uffff\3\116\1\uffff\1\12\2\25\2\23\2\25\1\uffff\2\25\2\23";
    static final String[] dfa_30s = {
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\1\uffff\1\1\1\uffff\13\5\43\uffff\1\3\1\4\5\5",
            "",
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\43\uffff\1\3\1\4\5\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\47\uffff\3\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\47\uffff\3\5",
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
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_29;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "()* loopback of 1715:4: ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )*";
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_29;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "()* loopback of 1804:4: ( ( (lv_ownedRelationship_2_0= ruleCategoryMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_31s = "\11\uffff";
    static final String dfa_32s = "\2\4\4\11\1\uffff\1\11\1\uffff";
    static final String dfa_33s = "\6\116\1\uffff\1\116\1\uffff";
    static final String dfa_34s = "\6\uffff\1\1\1\uffff\1\2";
    static final String dfa_35s = "\11\uffff}>";
    static final String[] dfa_36s = {
            "\1\1\4\uffff\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\43\uffff\1\2\1\3\1\4\1\5\3\10",
            "\1\1\4\uffff\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\43\uffff\1\2\1\3\1\4\1\5\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\47\uffff\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\47\uffff\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\47\uffff\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\47\uffff\3\10",
            "",
            "\2\10\17\uffff\6\6\1\10\1\uffff\3\10\47\uffff\3\10",
            ""
    };

    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[][] dfa_36 = unpackEncodedStringArray(dfa_36s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_31;
            this.eof = dfa_31;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "1868:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember )";
        }
    }
    static final String dfa_37s = "\13\uffff";
    static final String dfa_38s = "\1\11\1\uffff\4\11\2\24\3\uffff";
    static final String dfa_39s = "\1\116\1\uffff\1\116\3\12\2\64\3\uffff";
    static final String dfa_40s = "\1\uffff\1\1\6\uffff\1\3\1\4\1\2";
    static final String dfa_41s = "\13\uffff}>";
    static final String[] dfa_42s = {
            "\1\6\1\7\25\uffff\1\1\1\2\3\1\47\uffff\1\3\1\4\1\5",
            "",
            "\2\10\25\uffff\1\1\1\uffff\3\1\47\uffff\3\10",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\12\2\uffff\1\12\1\uffff\1\11\20\uffff\3\12\2\uffff\3\12\2\uffff\1\12",
            "\1\12\2\uffff\1\12\1\uffff\1\11\20\uffff\3\12\2\uffff\3\12\2\uffff\1\12",
            "",
            "",
            ""
    };

    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[][] dfa_42 = unpackEncodedStringArray(dfa_42s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_37;
            this.eof = dfa_37;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_41;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "1957:3: (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'abstract' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_6_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_direction_7_0= ruleFeatureDirection ) )? ( (lv_memberName_8_0= ruleName ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) )";
        }
    }
    static final String dfa_43s = "\16\uffff";
    static final String dfa_44s = "\1\11\2\21\1\uffff\1\11\2\21\2\11\1\uffff\2\22\2\21";
    static final String dfa_45s = "\1\54\2\66\1\uffff\1\12\2\66\2\12\1\uffff\4\66";
    static final String dfa_46s = "\3\uffff\1\1\5\uffff\1\2\4\uffff";
    static final String dfa_47s = "\16\uffff}>";
    static final String[] dfa_48s = {
            "\1\1\1\2\16\uffff\1\4\16\uffff\1\3\3\uffff\1\3",
            "\2\3\6\uffff\1\4\16\uffff\1\3\3\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "\2\3\6\uffff\1\4\16\uffff\1\3\3\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "",
            "\1\5\1\6",
            "\1\10\1\7\1\uffff\1\11\27\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "\1\10\1\7\1\uffff\1\11\27\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "\1\12\1\13",
            "\1\14\1\15",
            "",
            "\1\7\1\uffff\1\11\27\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "\1\7\1\uffff\1\11\27\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "\1\10\2\uffff\1\11\27\uffff\1\3\4\uffff\1\3\3\uffff\2\3",
            "\1\10\2\uffff\1\11\27\uffff\1\3\4\uffff\1\3\3\uffff\2\3"
    };

    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[][] dfa_48 = unpackEncodedStringArray(dfa_48s);

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_43;
            this.eof = dfa_43;
            this.min = dfa_44;
            this.max = dfa_45;
            this.accept = dfa_46;
            this.special = dfa_47;
            this.transition = dfa_48;
        }
        public String getDescription() {
            return "2396:4: ( ( (lv_ownedRelatedElement_16_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) )";
        }
    }
    static final String[] dfa_49s = {
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\1\uffff\1\1\1\uffff\13\5\2\uffff\1\5\40\uffff\1\3\1\4\5\5",
            "",
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\2\uffff\1\5\40\uffff\1\3\1\4\5\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\2\uffff\1\5\44\uffff\3\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\13\5\2\uffff\1\5\44\uffff\3\5",
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
    static final short[][] dfa_49 = unpackEncodedStringArray(dfa_49s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_29;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "()* loopback of 3076:4: ( ( (lv_ownedRelationship_2_0= ruleAssociationMember ) ) | ( (lv_ownedRelationship_3_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_50s = "\12\uffff";
    static final String dfa_51s = "\2\4\4\11\1\uffff\1\11\2\uffff";
    static final String dfa_52s = "\6\116\1\uffff\1\116\2\uffff";
    static final String dfa_53s = "\6\uffff\1\1\1\uffff\1\2\1\3";
    static final String dfa_54s = "\12\uffff}>";
    static final String[] dfa_55s = {
            "\1\1\4\uffff\2\11\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\2\uffff\1\11\40\uffff\1\2\1\3\1\4\1\5\3\11",
            "\1\1\4\uffff\2\11\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\2\uffff\1\11\40\uffff\1\2\1\3\1\4\1\5\3\11",
            "\2\11\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\2\uffff\1\11\44\uffff\3\11",
            "\2\11\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\2\uffff\1\11\44\uffff\3\11",
            "\2\11\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\2\uffff\1\11\44\uffff\3\11",
            "\2\11\5\uffff\1\6\5\uffff\1\6\3\uffff\6\6\1\10\1\7\3\10\2\uffff\1\11\44\uffff\3\11",
            "",
            "\2\11\17\uffff\6\6\1\10\1\uffff\3\10\2\uffff\1\11\44\uffff\3\11",
            "",
            ""
    };

    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final char[] dfa_51 = DFA.unpackEncodedStringToUnsignedChars(dfa_51s);
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[][] dfa_55 = unpackEncodedStringArray(dfa_55s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_50;
            this.eof = dfa_50;
            this.min = dfa_51;
            this.max = dfa_52;
            this.accept = dfa_53;
            this.special = dfa_54;
            this.transition = dfa_55;
        }
        public String getDescription() {
            return "3140:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )";
        }
    }
    static final String dfa_56s = "\3\11\1\uffff\2\24\1\11\4\uffff\2\24\1\uffff";
    static final String dfa_57s = "\3\116\1\uffff\2\64\1\116\4\uffff\2\64\1\uffff";
    static final String dfa_58s = "\3\uffff\1\4\3\uffff\1\1\1\5\1\2\1\6\2\uffff\1\3";
    static final String[] dfa_59s = {
            "\1\4\1\5\26\uffff\1\2\5\uffff\1\1\44\uffff\3\3",
            "\2\7\27\uffff\1\6\1\7\6\uffff\1\7\41\uffff\3\7",
            "\2\10\34\uffff\1\11\44\uffff\3\10",
            "",
            "\1\3\2\uffff\1\3\1\uffff\1\12\20\uffff\3\3\2\uffff\3\3\2\uffff\1\3",
            "\1\3\2\uffff\1\3\1\uffff\1\12\20\uffff\3\3\2\uffff\3\3\2\uffff\1\3",
            "\1\13\1\14\16\uffff\1\15\20\uffff\1\7\41\uffff\3\7",
            "",
            "",
            "",
            "",
            "\1\7\2\uffff\1\7\1\uffff\1\15\20\uffff\3\7\2\uffff\3\7\2\uffff\1\7",
            "\1\7\2\uffff\1\7\1\uffff\1\15\20\uffff\3\7\2\uffff\3\7\2\uffff\1\7",
            ""
    };
    static final char[] dfa_56 = DFA.unpackEncodedStringToUnsignedChars(dfa_56s);
    static final char[] dfa_57 = DFA.unpackEncodedStringToUnsignedChars(dfa_57s);
    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final short[][] dfa_59 = unpackEncodedStringArray(dfa_59s);

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_43;
            this.eof = dfa_43;
            this.min = dfa_56;
            this.max = dfa_57;
            this.accept = dfa_58;
            this.special = dfa_47;
            this.transition = dfa_59;
        }
        public String getDescription() {
            return "3238:3: ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'abstract' otherlv_7= 'end' ( ( (lv_isPart_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )? ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_11_0= ruleAbstractFeatureDefinition ) ) ) | (otherlv_12= 'end' ( (lv_isPart_13_0= 'part' ) ) ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | ( ( (lv_direction_18_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_19_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_20= 'abstract' ( (lv_direction_21_0= ruleFeatureDirection ) )? ( (lv_ownedRelatedElement_22_0= ruleAbstractNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_23_0= ruleName ) ) otherlv_24= 'is' ( ( ruleQualifiedName ) ) otherlv_26= ';' ) )";
        }
    }
    static final String dfa_60s = "\27\uffff";
    static final String dfa_61s = "\1\11\2\21\1\11\2\uffff\1\11\4\21\4\11\2\22\2\21\2\22\2\21";
    static final String dfa_62s = "\1\54\2\66\1\12\2\uffff\1\12\2\50\2\65\4\12\4\50\4\65";
    static final String dfa_63s = "\4\uffff\1\1\1\2\21\uffff";
    static final String dfa_64s = "\27\uffff}>";
    static final String[] dfa_65s = {
            "\1\1\1\2\16\uffff\1\4\16\uffff\1\5\3\uffff\1\3",
            "\2\4\6\uffff\1\4\16\uffff\1\5\3\uffff\1\6\4\uffff\1\4\3\uffff\2\4",
            "\2\4\6\uffff\1\4\16\uffff\1\5\3\uffff\1\6\4\uffff\1\4\3\uffff\2\4",
            "\1\7\1\10",
            "",
            "",
            "\1\11\1\12",
            "\1\14\1\13\6\uffff\1\4\16\uffff\1\5",
            "\1\14\1\13\6\uffff\1\4\16\uffff\1\5",
            "\1\16\1\15\6\uffff\1\4\16\uffff\1\5\10\uffff\1\4\3\uffff\1\4",
            "\1\16\1\15\6\uffff\1\4\16\uffff\1\5\10\uffff\1\4\3\uffff\1\4",
            "\1\17\1\20",
            "\1\21\1\22",
            "\1\23\1\24",
            "\1\25\1\26",
            "\1\13\6\uffff\1\4\16\uffff\1\5",
            "\1\13\6\uffff\1\4\16\uffff\1\5",
            "\1\14\7\uffff\1\4\16\uffff\1\5",
            "\1\14\7\uffff\1\4\16\uffff\1\5",
            "\1\15\6\uffff\1\4\16\uffff\1\5\10\uffff\1\4\3\uffff\1\4",
            "\1\15\6\uffff\1\4\16\uffff\1\5\10\uffff\1\4\3\uffff\1\4",
            "\1\16\7\uffff\1\4\16\uffff\1\5\10\uffff\1\4\3\uffff\1\4",
            "\1\16\7\uffff\1\4\16\uffff\1\5\10\uffff\1\4\3\uffff\1\4"
    };

    static final short[] dfa_60 = DFA.unpackEncodedString(dfa_60s);
    static final char[] dfa_61 = DFA.unpackEncodedStringToUnsignedChars(dfa_61s);
    static final char[] dfa_62 = DFA.unpackEncodedStringToUnsignedChars(dfa_62s);
    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final short[] dfa_64 = DFA.unpackEncodedString(dfa_64s);
    static final short[][] dfa_65 = unpackEncodedStringArray(dfa_65s);

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = dfa_60;
            this.eof = dfa_60;
            this.min = dfa_61;
            this.max = dfa_62;
            this.accept = dfa_63;
            this.special = dfa_64;
            this.transition = dfa_65;
        }
        public String getDescription() {
            return "5135:2: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_ownedRelationship_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_ownedRelationship_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_ownedRelationship_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_ownedRelationship_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_ownedRelationship_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) )";
        }
    }
    static final String dfa_66s = "\1\11\2\21\2\uffff\1\11\2\21\2\11\2\22\2\21";
    static final String dfa_67s = "\1\54\2\66\2\uffff\1\12\2\65\2\12\4\65";
    static final String dfa_68s = "\3\uffff\1\1\1\2\11\uffff";
    static final String[] dfa_69s = {
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
    static final char[] dfa_66 = DFA.unpackEncodedStringToUnsignedChars(dfa_66s);
    static final char[] dfa_67 = DFA.unpackEncodedStringToUnsignedChars(dfa_67s);
    static final short[] dfa_68 = DFA.unpackEncodedString(dfa_68s);
    static final short[][] dfa_69 = unpackEncodedStringArray(dfa_69s);

    class DFA89 extends DFA {

        public DFA89(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 89;
            this.eot = dfa_43;
            this.eof = dfa_43;
            this.min = dfa_66;
            this.max = dfa_67;
            this.accept = dfa_68;
            this.special = dfa_47;
            this.transition = dfa_69;
        }
        public String getDescription() {
            return "5137:4: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )?";
        }
    }
    static final String dfa_70s = "\21\uffff";
    static final String dfa_71s = "\1\uffff\2\7\5\uffff\4\7\3\uffff\1\7\1\uffff";
    static final String dfa_72s = "\1\11\2\21\2\11\1\7\2\uffff\2\21\2\22\1\62\1\63\1\7\1\24\1\63";
    static final String dfa_73s = "\1\12\2\66\2\12\1\23\2\uffff\4\66\2\63\1\23\1\66\1\63";
    static final String dfa_74s = "\6\uffff\1\2\1\1\11\uffff";
    static final String dfa_75s = "\21\uffff}>";
    static final String[] dfa_76s = {
            "\1\1\1\2",
            "\1\3\1\4\1\uffff\1\7\2\uffff\1\7\16\uffff\1\7\2\uffff\1\7\2\uffff\1\7\4\uffff\1\5\3\uffff\1\7\1\6",
            "\1\3\1\4\1\uffff\1\7\2\uffff\1\7\16\uffff\1\7\2\uffff\1\7\2\uffff\1\7\4\uffff\1\5\3\uffff\1\7\1\6",
            "\1\10\1\11",
            "\1\12\1\13",
            "\1\14\13\uffff\1\15",
            "",
            "",
            "\1\3\2\uffff\1\7\2\uffff\1\7\16\uffff\1\7\2\uffff\1\7\2\uffff\1\7\4\uffff\1\5\3\uffff\1\7\1\6",
            "\1\3\2\uffff\1\7\2\uffff\1\7\16\uffff\1\7\2\uffff\1\7\2\uffff\1\7\4\uffff\1\5\3\uffff\1\7\1\6",
            "\1\4\1\uffff\1\7\2\uffff\1\7\16\uffff\1\7\2\uffff\1\7\2\uffff\1\7\4\uffff\1\5\3\uffff\1\7\1\6",
            "\1\4\1\uffff\1\7\2\uffff\1\7\16\uffff\1\7\2\uffff\1\7\2\uffff\1\7\4\uffff\1\5\3\uffff\1\7\1\6",
            "\1\16\1\17",
            "\1\17",
            "\1\20\13\uffff\1\15",
            "\1\7\2\uffff\1\7\16\uffff\1\7\2\uffff\1\7\13\uffff\1\7\1\6",
            "\1\17"
    };

    static final short[] dfa_70 = DFA.unpackEncodedString(dfa_70s);
    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final char[] dfa_72 = DFA.unpackEncodedStringToUnsignedChars(dfa_72s);
    static final char[] dfa_73 = DFA.unpackEncodedStringToUnsignedChars(dfa_73s);
    static final short[] dfa_74 = DFA.unpackEncodedString(dfa_74s);
    static final short[] dfa_75 = DFA.unpackEncodedString(dfa_75s);
    static final short[][] dfa_76 = unpackEncodedStringArray(dfa_76s);

    class DFA97 extends DFA {

        public DFA97(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 97;
            this.eot = dfa_70;
            this.eof = dfa_71;
            this.min = dfa_72;
            this.max = dfa_73;
            this.accept = dfa_74;
            this.special = dfa_75;
            this.transition = dfa_76;
        }
        public String getDescription() {
            return "5403:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_ownedRelationship_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )";
        }
    }
    static final String dfa_77s = "\1\uffff\2\6\4\uffff\4\6";
    static final String dfa_78s = "\1\11\2\21\2\11\2\uffff\2\21\2\22";
    static final String dfa_79s = "\1\12\2\65\2\12\2\uffff\4\65";
    static final String dfa_80s = "\5\uffff\1\1\1\2\4\uffff";
    static final String[] dfa_81s = {
            "\1\1\1\2",
            "\1\3\1\4\1\uffff\1\6\2\uffff\1\6\16\uffff\1\6\2\uffff\1\6\2\uffff\1\5\4\uffff\1\6\3\uffff\1\6",
            "\1\3\1\4\1\uffff\1\6\2\uffff\1\6\16\uffff\1\6\2\uffff\1\6\2\uffff\1\5\4\uffff\1\6\3\uffff\1\6",
            "\1\7\1\10",
            "\1\11\1\12",
            "",
            "",
            "\1\3\2\uffff\1\6\2\uffff\1\6\16\uffff\1\6\2\uffff\1\6\2\uffff\1\5\4\uffff\1\6\3\uffff\1\6",
            "\1\3\2\uffff\1\6\2\uffff\1\6\16\uffff\1\6\2\uffff\1\6\2\uffff\1\5\4\uffff\1\6\3\uffff\1\6",
            "\1\4\1\uffff\1\6\2\uffff\1\6\16\uffff\1\6\2\uffff\1\6\2\uffff\1\5\4\uffff\1\6\3\uffff\1\6",
            "\1\4\1\uffff\1\6\2\uffff\1\6\16\uffff\1\6\2\uffff\1\6\2\uffff\1\5\4\uffff\1\6\3\uffff\1\6"
    };
    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final char[] dfa_78 = DFA.unpackEncodedStringToUnsignedChars(dfa_78s);
    static final char[] dfa_79 = DFA.unpackEncodedStringToUnsignedChars(dfa_79s);
    static final short[] dfa_80 = DFA.unpackEncodedString(dfa_80s);
    static final short[][] dfa_81 = unpackEncodedStringArray(dfa_81s);

    class DFA94 extends DFA {

        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = dfa_37;
            this.eof = dfa_77;
            this.min = dfa_78;
            this.max = dfa_79;
            this.accept = dfa_80;
            this.special = dfa_41;
            this.transition = dfa_81;
        }
        public String getDescription() {
            return "5405:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )?";
        }
    }
    static final String dfa_82s = "\17\uffff";
    static final String dfa_83s = "\3\uffff\2\11\6\uffff\4\11";
    static final String dfa_84s = "\1\5\2\uffff\2\21\3\uffff\1\11\1\uffff\1\11\2\22\2\21";
    static final String dfa_85s = "\1\107\2\uffff\2\104\3\uffff\1\12\1\uffff\1\12\4\104";
    static final String dfa_86s = "\1\uffff\1\1\1\2\2\uffff\1\5\1\6\1\4\1\uffff\1\3\5\uffff";
    static final String dfa_87s = "\17\uffff}>";
    static final String[] dfa_88s = {
            "\4\2\1\3\1\4\7\uffff\2\2\3\uffff\1\5\20\uffff\1\6\36\uffff\1\1",
            "",
            "",
            "\1\12\1\10\2\11\2\uffff\2\11\15\uffff\1\11\1\uffff\1\7\1\11\7\uffff\1\11\1\uffff\1\11\3\uffff\16\11",
            "\1\12\1\10\2\11\2\uffff\2\11\15\uffff\1\11\1\uffff\1\7\1\11\7\uffff\1\11\1\uffff\1\11\3\uffff\16\11",
            "",
            "",
            "",
            "\1\13\1\14",
            "",
            "\1\15\1\16",
            "\1\10\2\11\2\uffff\2\11\15\uffff\1\11\1\uffff\1\7\1\11\7\uffff\1\11\1\uffff\1\11\3\uffff\16\11",
            "\1\10\2\11\2\uffff\2\11\15\uffff\1\11\1\uffff\1\7\1\11\7\uffff\1\11\1\uffff\1\11\3\uffff\16\11",
            "\1\12\1\uffff\2\11\2\uffff\2\11\15\uffff\1\11\1\uffff\1\7\1\11\7\uffff\1\11\1\uffff\1\11\3\uffff\16\11",
            "\1\12\1\uffff\2\11\2\uffff\2\11\15\uffff\1\11\1\uffff\1\7\1\11\7\uffff\1\11\1\uffff\1\11\3\uffff\16\11"
    };

    static final short[] dfa_82 = DFA.unpackEncodedString(dfa_82s);
    static final short[] dfa_83 = DFA.unpackEncodedString(dfa_83s);
    static final char[] dfa_84 = DFA.unpackEncodedStringToUnsignedChars(dfa_84s);
    static final char[] dfa_85 = DFA.unpackEncodedStringToUnsignedChars(dfa_85s);
    static final short[] dfa_86 = DFA.unpackEncodedString(dfa_86s);
    static final short[] dfa_87 = DFA.unpackEncodedString(dfa_87s);
    static final short[][] dfa_88 = unpackEncodedStringArray(dfa_88s);

    class DFA114 extends DFA {

        public DFA114(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 114;
            this.eot = dfa_82;
            this.eof = dfa_83;
            this.min = dfa_84;
            this.max = dfa_85;
            this.accept = dfa_86;
            this.special = dfa_87;
            this.transition = dfa_88;
        }
        public String getDescription() {
            return "6610:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_NameExpression_2= ruleNameExpression | this_InvocationExpression_3= ruleInvocationExpression | this_SequenceConstructionExpression_4= ruleSequenceConstructionExpression | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000300000000L});
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
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000003FD410610L,0x0000000000000300L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000003FC410610L,0x0000000000000300L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000300L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000600L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000600L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001FFD410610L,0x0000000000007F00L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000002FC410000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001F00000600L,0x0000000000007000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000600L,0x0000000000007000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000F00L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040102000600L,0x0000000000007000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040102000600L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000D00000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040100000600L,0x0000000000007000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000110002000600L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000009FFD410610L,0x0000000000007F00L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000001F00000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000008300000600L,0x0000000000007000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000040D00000600L,0x0000000000007000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000040100000600L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000020000000600L,0x0000000000007000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000600L,0x0000000000007000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0013940000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0013940000000600L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000080000900000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0003980000900000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0010040000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x00000100008C07E0L,0x00000000000000E3L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000600000000600L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000400000000600L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0003800000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x00000000000C01E0L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0010044000000002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000100002000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000100002000600L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0042000000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0010040000000002L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0xF000000000000002L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000080002L,0x000000000000000CL});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x00000100008C07E0L,0x0000000000000080L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x00000300008C07E0L,0x00000000000000E3L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x00000100018C07E0L,0x00000000000000E3L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000004001000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000040002L});

}
