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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOCUMENTATION_COMMENT", "RULE_BOOLEAN_VALUE", "RULE_STRING_VALUE", "RULE_NATURAL_VALUE", "RULE_EXP_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'import'", "'::'", "'.'", "'*'", "';'", "'as'", "'package'", "'{'", "'}'", "'is'", "'Class'", "'class'", "'datatype'", "'assoc'", "'feature'", "'part'", "'port'", "'connector'", "'abstract'", "'specializes'", "','", "'end'", "'ordered'", "'nonunique'", "'='", "':'", "'compose'", "'any'", "'['", "'..'", "']'", "'subsets'", "'redefines'", "'to'", "'('", "')'", "'=>'", "'@'", "'+'", "'-'", "'/'", "'^'", "'null'", "'public'", "'private'", "'protected'", "'packaged'", "'in'", "'out'", "'inout'"
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
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_BOOLEAN_VALUE=5;
    public static final int RULE_SL_COMMENT=14;
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

            if ( ((LA5_0>=59 && LA5_0<=60)) ) {
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

                if ( (LA7_1==18) ) {
                    int LA7_3 = input.LA(3);

                    if ( ((LA7_3>=RULE_ID && LA7_3<=RULE_UNRESTRICTED_NAME)) ) {
                        alt7=3;
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
                else if ( (LA7_1==17) ) {
                    int LA7_4 = input.LA(3);

                    if ( (LA7_4==19) ) {
                        alt7=1;
                    }
                    else if ( ((LA7_4>=RULE_ID && LA7_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt7=2;
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
                    int LA7_4 = input.LA(3);

                    if ( (LA7_4==19) ) {
                        alt7=1;
                    }
                    else if ( ((LA7_4>=RULE_ID && LA7_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_2==18) ) {
                    int LA7_3 = input.LA(3);

                    if ( ((LA7_3>=RULE_ID && LA7_3<=RULE_UNRESTRICTED_NAME)) ) {
                        alt7=3;
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
    // InternalAlf.g:767:1: ruleNonFeatureDefinition returns [EObject current=null] : (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_ObjectClassDefinitionOrStub_2= ruleObjectClassDefinitionOrStub | this_ValueClassDefinitionOrStub_3= ruleValueClassDefinitionOrStub | this_AssociationDefinitionOrStub_4= ruleAssociationDefinitionOrStub ) ;
    public final EObject ruleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinitionOrStub_0 = null;

        EObject this_ClassDefinitionOrStub_1 = null;

        EObject this_ObjectClassDefinitionOrStub_2 = null;

        EObject this_ValueClassDefinitionOrStub_3 = null;

        EObject this_AssociationDefinitionOrStub_4 = null;



        	enterRule();

        try {
            // InternalAlf.g:773:2: ( (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_ObjectClassDefinitionOrStub_2= ruleObjectClassDefinitionOrStub | this_ValueClassDefinitionOrStub_3= ruleValueClassDefinitionOrStub | this_AssociationDefinitionOrStub_4= ruleAssociationDefinitionOrStub ) )
            // InternalAlf.g:774:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_ObjectClassDefinitionOrStub_2= ruleObjectClassDefinitionOrStub | this_ValueClassDefinitionOrStub_3= ruleValueClassDefinitionOrStub | this_AssociationDefinitionOrStub_4= ruleAssociationDefinitionOrStub )
            {
            // InternalAlf.g:774:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_ObjectClassDefinitionOrStub_2= ruleObjectClassDefinitionOrStub | this_ValueClassDefinitionOrStub_3= ruleValueClassDefinitionOrStub | this_AssociationDefinitionOrStub_4= ruleAssociationDefinitionOrStub )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 34:
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

            }


            }


            	leaveRule();

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
    // InternalAlf.g:823:1: entryRulePackageDefinitionOrStub returns [EObject current=null] : iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF ;
    public final EObject entryRulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDefinitionOrStub = null;


        try {
            // InternalAlf.g:823:64: (iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF )
            // InternalAlf.g:824:2: iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF
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
    // InternalAlf.g:830:1: rulePackageDefinitionOrStub returns [EObject current=null] : this_PackageDefinition_0= rulePackageDefinition[$current] ;
    public final EObject rulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:836:2: (this_PackageDefinition_0= rulePackageDefinition[$current] )
            // InternalAlf.g:837:2: this_PackageDefinition_0= rulePackageDefinition[$current]
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
    // InternalAlf.g:852:1: rulePackageDefinition[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' ) ;
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
            // InternalAlf.g:858:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' ) )
            // InternalAlf.g:859:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' )
            {
            // InternalAlf.g:859:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' )
            // InternalAlf.g:860:3: otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0());
            		
            // InternalAlf.g:864:3: ( (lv_name_1_0= ruleName ) )
            // InternalAlf.g:865:4: (lv_name_1_0= ruleName )
            {
            // InternalAlf.g:865:4: (lv_name_1_0= ruleName )
            // InternalAlf.g:866:5: lv_name_1_0= ruleName
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
            		
            // InternalAlf.g:887:3: ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )*
            loop10:
            do {
                int alt10=3;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalAlf.g:888:4: ( (lv_ownedMembership_3_0= rulePackageMember ) )
            	    {
            	    // InternalAlf.g:888:4: ( (lv_ownedMembership_3_0= rulePackageMember ) )
            	    // InternalAlf.g:889:5: (lv_ownedMembership_3_0= rulePackageMember )
            	    {
            	    // InternalAlf.g:889:5: (lv_ownedMembership_3_0= rulePackageMember )
            	    // InternalAlf.g:890:6: lv_ownedMembership_3_0= rulePackageMember
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
            	    // InternalAlf.g:908:4: ( (lv_ownedImport_4_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:908:4: ( (lv_ownedImport_4_0= rulePackageImport ) )
            	    // InternalAlf.g:909:5: (lv_ownedImport_4_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:909:5: (lv_ownedImport_4_0= rulePackageImport )
            	    // InternalAlf.g:910:6: lv_ownedImport_4_0= rulePackageImport
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
    // InternalAlf.g:936:1: entryRulePackageMember returns [EObject current=null] : iv_rulePackageMember= rulePackageMember EOF ;
    public final EObject entryRulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageMember = null;


        try {
            // InternalAlf.g:936:54: (iv_rulePackageMember= rulePackageMember EOF )
            // InternalAlf.g:937:2: iv_rulePackageMember= rulePackageMember EOF
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
    // InternalAlf.g:943:1: rulePackageMember returns [EObject current=null] : (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] ) ) ;
    public final EObject rulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject this_PackageMemberPrefix_0 = null;

        EObject this_NonFeatureMemberElement_1 = null;

        EObject this_FeaturePackageMemberElement_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:949:2: ( (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] ) ) )
            // InternalAlf.g:950:2: (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] ) )
            {
            // InternalAlf.g:950:2: (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] ) )
            // InternalAlf.g:951:3: this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] )
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
            		
            // InternalAlf.g:962:3: (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16||LA11_0==22||(LA11_0>=26 && LA11_0<=29)||LA11_0==34) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_UNRESTRICTED_NAME)||LA11_0==30) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAlf.g:963:4: this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current]
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
                    // InternalAlf.g:975:4: this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current]
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
    // InternalAlf.g:992:1: rulePackageMemberPrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? ) ;
    public final EObject rulePackageMemberPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedRelationship_0_0 = null;

        Enumerator lv_visibility_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:998:2: ( ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? ) )
            // InternalAlf.g:999:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? )
            {
            // InternalAlf.g:999:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? )
            // InternalAlf.g:1000:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )?
            {
            // InternalAlf.g:1000:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAlf.g:1001:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    {
            	    // InternalAlf.g:1001:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    // InternalAlf.g:1002:5: lv_ownedRelationship_0_0= ruleAnnotation
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

            // InternalAlf.g:1019:3: ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=59 && LA13_0<=60)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlf.g:1020:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    {
                    // InternalAlf.g:1020:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    // InternalAlf.g:1021:5: lv_visibility_1_0= rulePackageElementVisibilityIndicator
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
    // InternalAlf.g:1043:1: ruleNonFeatureMemberElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) | (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' ) | (otherlv_26= 'import' ( ( ruleQualifiedName ) ) (otherlv_28= 'as' ( (lv_memberName_29_0= ruleName ) ) )? otherlv_30= ';' ) ) ;
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
        EObject lv_ownedMemberElement_0_0 = null;

        AntlrDatatypeRuleToken lv_memberName_2_0 = null;

        AntlrDatatypeRuleToken lv_memberName_7_0 = null;

        AntlrDatatypeRuleToken lv_memberName_12_0 = null;

        AntlrDatatypeRuleToken lv_memberName_17_0 = null;

        AntlrDatatypeRuleToken lv_memberName_22_0 = null;

        AntlrDatatypeRuleToken lv_memberName_29_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1049:2: ( ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) | (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' ) | (otherlv_26= 'import' ( ( ruleQualifiedName ) ) (otherlv_28= 'as' ( (lv_memberName_29_0= ruleName ) ) )? otherlv_30= ';' ) ) )
            // InternalAlf.g:1050:2: ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) | (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' ) | (otherlv_26= 'import' ( ( ruleQualifiedName ) ) (otherlv_28= 'as' ( (lv_memberName_29_0= ruleName ) ) )? otherlv_30= ';' ) )
            {
            // InternalAlf.g:1050:2: ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) | (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' ) | (otherlv_26= 'import' ( ( ruleQualifiedName ) ) (otherlv_28= 'as' ( (lv_memberName_29_0= ruleName ) ) )? otherlv_30= ';' ) )
            int alt20=7;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalAlf.g:1051:3: ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) )
                    {
                    // InternalAlf.g:1051:3: ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) )
                    // InternalAlf.g:1052:4: (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition )
                    {
                    // InternalAlf.g:1052:4: (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition )
                    // InternalAlf.g:1053:5: lv_ownedMemberElement_0_0= ruleNonFeatureDefinition
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
                    // InternalAlf.g:1071:3: (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
                    {
                    // InternalAlf.g:1071:3: (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
                    // InternalAlf.g:1072:4: otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getNonFeatureMemberElementAccess().getPackageKeyword_1_0());
                    			
                    // InternalAlf.g:1076:4: ( (lv_memberName_2_0= ruleName ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalAlf.g:1077:5: (lv_memberName_2_0= ruleName )
                            {
                            // InternalAlf.g:1077:5: (lv_memberName_2_0= ruleName )
                            // InternalAlf.g:1078:6: lv_memberName_2_0= ruleName
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
                    			
                    // InternalAlf.g:1099:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1100:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1100:5: ( ruleQualifiedName )
                    // InternalAlf.g:1101:6: ruleQualifiedName
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
                    // InternalAlf.g:1121:3: (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    {
                    // InternalAlf.g:1121:3: (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    // InternalAlf.g:1122:4: otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getNonFeatureMemberElementAccess().getClassKeyword_2_0());
                    			
                    // InternalAlf.g:1126:4: ( (lv_memberName_7_0= ruleName ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalAlf.g:1127:5: (lv_memberName_7_0= ruleName )
                            {
                            // InternalAlf.g:1127:5: (lv_memberName_7_0= ruleName )
                            // InternalAlf.g:1128:6: lv_memberName_7_0= ruleName
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
                    			
                    // InternalAlf.g:1149:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1150:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1150:5: ( ruleQualifiedName )
                    // InternalAlf.g:1151:6: ruleQualifiedName
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
                    // InternalAlf.g:1171:3: (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' )
                    {
                    // InternalAlf.g:1171:3: (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' )
                    // InternalAlf.g:1172:4: otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';'
                    {
                    otherlv_11=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getNonFeatureMemberElementAccess().getClassKeyword_3_0());
                    			
                    // InternalAlf.g:1176:4: ( (lv_memberName_12_0= ruleName ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalAlf.g:1177:5: (lv_memberName_12_0= ruleName )
                            {
                            // InternalAlf.g:1177:5: (lv_memberName_12_0= ruleName )
                            // InternalAlf.g:1178:6: lv_memberName_12_0= ruleName
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
                    			
                    // InternalAlf.g:1199:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1200:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1200:5: ( ruleQualifiedName )
                    // InternalAlf.g:1201:6: ruleQualifiedName
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
                    // InternalAlf.g:1221:3: (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' )
                    {
                    // InternalAlf.g:1221:3: (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' )
                    // InternalAlf.g:1222:4: otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';'
                    {
                    otherlv_16=(Token)match(input,28,FOLLOW_24); 

                    				newLeafNode(otherlv_16, grammarAccess.getNonFeatureMemberElementAccess().getDatatypeKeyword_4_0());
                    			
                    // InternalAlf.g:1226:4: ( (lv_memberName_17_0= ruleName ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalAlf.g:1227:5: (lv_memberName_17_0= ruleName )
                            {
                            // InternalAlf.g:1227:5: (lv_memberName_17_0= ruleName )
                            // InternalAlf.g:1228:6: lv_memberName_17_0= ruleName
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
                    			
                    // InternalAlf.g:1249:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1250:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1250:5: ( ruleQualifiedName )
                    // InternalAlf.g:1251:6: ruleQualifiedName
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
                    // InternalAlf.g:1271:3: (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' )
                    {
                    // InternalAlf.g:1271:3: (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' )
                    // InternalAlf.g:1272:4: otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';'
                    {
                    otherlv_21=(Token)match(input,29,FOLLOW_24); 

                    				newLeafNode(otherlv_21, grammarAccess.getNonFeatureMemberElementAccess().getAssocKeyword_5_0());
                    			
                    // InternalAlf.g:1276:4: ( (lv_memberName_22_0= ruleName ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalAlf.g:1277:5: (lv_memberName_22_0= ruleName )
                            {
                            // InternalAlf.g:1277:5: (lv_memberName_22_0= ruleName )
                            // InternalAlf.g:1278:6: lv_memberName_22_0= ruleName
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
                    			
                    // InternalAlf.g:1299:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1300:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1300:5: ( ruleQualifiedName )
                    // InternalAlf.g:1301:6: ruleQualifiedName
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
                    // InternalAlf.g:1321:3: (otherlv_26= 'import' ( ( ruleQualifiedName ) ) (otherlv_28= 'as' ( (lv_memberName_29_0= ruleName ) ) )? otherlv_30= ';' )
                    {
                    // InternalAlf.g:1321:3: (otherlv_26= 'import' ( ( ruleQualifiedName ) ) (otherlv_28= 'as' ( (lv_memberName_29_0= ruleName ) ) )? otherlv_30= ';' )
                    // InternalAlf.g:1322:4: otherlv_26= 'import' ( ( ruleQualifiedName ) ) (otherlv_28= 'as' ( (lv_memberName_29_0= ruleName ) ) )? otherlv_30= ';'
                    {
                    otherlv_26=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_26, grammarAccess.getNonFeatureMemberElementAccess().getImportKeyword_6_0());
                    			
                    // InternalAlf.g:1326:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1327:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1327:5: ( ruleQualifiedName )
                    // InternalAlf.g:1328:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementElementCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:1342:4: (otherlv_28= 'as' ( (lv_memberName_29_0= ruleName ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==21) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalAlf.g:1343:5: otherlv_28= 'as' ( (lv_memberName_29_0= ruleName ) )
                            {
                            otherlv_28=(Token)match(input,21,FOLLOW_13); 

                            					newLeafNode(otherlv_28, grammarAccess.getNonFeatureMemberElementAccess().getAsKeyword_6_2_0());
                            				
                            // InternalAlf.g:1347:5: ( (lv_memberName_29_0= ruleName ) )
                            // InternalAlf.g:1348:6: (lv_memberName_29_0= ruleName )
                            {
                            // InternalAlf.g:1348:6: (lv_memberName_29_0= ruleName )
                            // InternalAlf.g:1349:7: lv_memberName_29_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_6_2_1_0());
                            						
                            pushFollow(FOLLOW_16);
                            lv_memberName_29_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNonFeatureMemberElementRule());
                            							}
                            							set(
                            								current,
                            								"memberName",
                            								lv_memberName_29_0,
                            								"org.omg.sysml.Alf.Name");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_30=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_30, grammarAccess.getNonFeatureMemberElementAccess().getSemicolonKeyword_6_3());
                    			

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
    // InternalAlf.g:1377:1: ruleFeaturePackageMemberElement[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) ) ;
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
            // InternalAlf.g:1383:2: ( ( ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) ) )
            // InternalAlf.g:1384:2: ( ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) )
            {
            // InternalAlf.g:1384:2: ( ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA24_4 = input.LA(3);

                    if ( (LA24_4==25) ) {
                        alt24=3;
                    }
                    else if ( (LA24_4==20||LA24_4==23||(LA24_4>=38 && LA24_4<=41)||LA24_4==44||(LA24_4>=47 && LA24_4<=48)) ) {
                        alt24=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA24_5 = input.LA(3);

                    if ( (LA24_5==20||LA24_5==23||(LA24_5>=38 && LA24_5<=41)||LA24_5==44||(LA24_5>=47 && LA24_5<=48)) ) {
                        alt24=1;
                    }
                    else if ( (LA24_5==25) ) {
                        alt24=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 25:
                    {
                    alt24=3;
                    }
                    break;
                case 47:
                case 48:
                    {
                    alt24=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==20||LA24_2==23||(LA24_2>=38 && LA24_2<=41)||LA24_2==44||(LA24_2>=47 && LA24_2<=48)) ) {
                    alt24=1;
                }
                else if ( (LA24_2==25) ) {
                    alt24=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA24_3 = input.LA(2);

                if ( (LA24_3==20||LA24_3==23||(LA24_3>=38 && LA24_3<=41)||LA24_3==44||(LA24_3>=47 && LA24_3<=48)) ) {
                    alt24=1;
                }
                else if ( (LA24_3==25) ) {
                    alt24=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalAlf.g:1385:3: ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1385:3: ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1386:4: (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1386:4: (otherlv_0= 'feature' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==30) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalAlf.g:1387:5: otherlv_0= 'feature'
                            {
                            otherlv_0=(Token)match(input,30,FOLLOW_26); 

                            					newLeafNode(otherlv_0, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_0_0());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1392:4: ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1393:5: (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1393:5: (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1394:6: lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:1413:3: (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1413:3: (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:1414:4: otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_1_0());
                    			
                    // InternalAlf.g:1418:4: ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:1419:5: (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:1419:5: (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:1420:6: lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition
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
                    // InternalAlf.g:1439:3: ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' )
                    {
                    // InternalAlf.g:1439:3: ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' )
                    // InternalAlf.g:1440:4: ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';'
                    {
                    // InternalAlf.g:1440:4: ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==30) ) {
                        alt23=1;
                    }
                    else if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalAlf.g:1441:5: (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? )
                            {
                            // InternalAlf.g:1441:5: (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? )
                            // InternalAlf.g:1442:6: otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )?
                            {
                            otherlv_4=(Token)match(input,30,FOLLOW_24); 

                            						newLeafNode(otherlv_4, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_2_0_0_0());
                            					
                            // InternalAlf.g:1446:6: ( (lv_memberName_5_0= ruleName ) )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // InternalAlf.g:1447:7: (lv_memberName_5_0= ruleName )
                                    {
                                    // InternalAlf.g:1447:7: (lv_memberName_5_0= ruleName )
                                    // InternalAlf.g:1448:8: lv_memberName_5_0= ruleName
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
                            // InternalAlf.g:1467:5: ( (lv_memberName_6_0= ruleName ) )
                            {
                            // InternalAlf.g:1467:5: ( (lv_memberName_6_0= ruleName ) )
                            // InternalAlf.g:1468:6: (lv_memberName_6_0= ruleName )
                            {
                            // InternalAlf.g:1468:6: (lv_memberName_6_0= ruleName )
                            // InternalAlf.g:1469:7: lv_memberName_6_0= ruleName
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
                    			
                    // InternalAlf.g:1491:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1492:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1492:5: ( ruleQualifiedName )
                    // InternalAlf.g:1493:6: ruleQualifiedName
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
    // InternalAlf.g:1517:1: ruleCategoryBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) ;
    public final EObject ruleCategoryBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_ownedMembership_2_0 = null;

        EObject lv_ownedImport_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1523:2: ( (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) )
            // InternalAlf.g:1524:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            {
            // InternalAlf.g:1524:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            else if ( (LA26_0==23) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalAlf.g:1525:3: otherlv_0= ';'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getCategoryBodyAccess().getSemicolonKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:1530:3: (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    {
                    // InternalAlf.g:1530:3: (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    // InternalAlf.g:1531:4: otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getCategoryBodyAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalAlf.g:1535:4: ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )*
                    loop25:
                    do {
                        int alt25=3;
                        alt25 = dfa25.predict(input);
                        switch (alt25) {
                    	case 1 :
                    	    // InternalAlf.g:1536:5: ( (lv_ownedMembership_2_0= ruleCategoryMember ) )
                    	    {
                    	    // InternalAlf.g:1536:5: ( (lv_ownedMembership_2_0= ruleCategoryMember ) )
                    	    // InternalAlf.g:1537:6: (lv_ownedMembership_2_0= ruleCategoryMember )
                    	    {
                    	    // InternalAlf.g:1537:6: (lv_ownedMembership_2_0= ruleCategoryMember )
                    	    // InternalAlf.g:1538:7: lv_ownedMembership_2_0= ruleCategoryMember
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
                    	    // InternalAlf.g:1556:5: ( (lv_ownedImport_3_0= rulePackageImport ) )
                    	    {
                    	    // InternalAlf.g:1556:5: ( (lv_ownedImport_3_0= rulePackageImport ) )
                    	    // InternalAlf.g:1557:6: (lv_ownedImport_3_0= rulePackageImport )
                    	    {
                    	    // InternalAlf.g:1557:6: (lv_ownedImport_3_0= rulePackageImport )
                    	    // InternalAlf.g:1558:7: lv_ownedImport_3_0= rulePackageImport
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
                    	    break loop25;
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
    // InternalAlf.g:1585:1: entryRuleCategoryMember returns [EObject current=null] : iv_ruleCategoryMember= ruleCategoryMember EOF ;
    public final EObject entryRuleCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategoryMember = null;


        try {
            // InternalAlf.g:1585:55: (iv_ruleCategoryMember= ruleCategoryMember EOF )
            // InternalAlf.g:1586:2: iv_ruleCategoryMember= ruleCategoryMember EOF
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
    // InternalAlf.g:1592:1: ruleCategoryMember returns [EObject current=null] : (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember ) ;
    public final EObject ruleCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureCategoryMember_0 = null;

        EObject this_FeatureCategoryMember_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1598:2: ( (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember ) )
            // InternalAlf.g:1599:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember )
            {
            // InternalAlf.g:1599:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember )
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalAlf.g:1600:3: this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember
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
                    // InternalAlf.g:1609:3: this_FeatureCategoryMember_1= ruleFeatureCategoryMember
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
    // InternalAlf.g:1621:1: entryRuleNonFeatureCategoryMember returns [EObject current=null] : iv_ruleNonFeatureCategoryMember= ruleNonFeatureCategoryMember EOF ;
    public final EObject entryRuleNonFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureCategoryMember = null;


        try {
            // InternalAlf.g:1621:65: (iv_ruleNonFeatureCategoryMember= ruleNonFeatureCategoryMember EOF )
            // InternalAlf.g:1622:2: iv_ruleNonFeatureCategoryMember= ruleNonFeatureCategoryMember EOF
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
    // InternalAlf.g:1628:1: ruleNonFeatureCategoryMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] ) ;
    public final EObject ruleNonFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject this_CategoryMemberPrefix_0 = null;

        EObject this_NonFeatureMemberElement_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1634:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] ) )
            // InternalAlf.g:1635:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] )
            {
            // InternalAlf.g:1635:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] )
            // InternalAlf.g:1636:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current]
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
    // InternalAlf.g:1662:1: entryRuleFeatureCategoryMember returns [EObject current=null] : iv_ruleFeatureCategoryMember= ruleFeatureCategoryMember EOF ;
    public final EObject entryRuleFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCategoryMember = null;


        try {
            // InternalAlf.g:1662:62: (iv_ruleFeatureCategoryMember= ruleFeatureCategoryMember EOF )
            // InternalAlf.g:1663:2: iv_ruleFeatureCategoryMember= ruleFeatureCategoryMember EOF
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
    // InternalAlf.g:1669:1: ruleFeatureCategoryMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) ) ;
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
            // InternalAlf.g:1675:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) ) )
            // InternalAlf.g:1676:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) )
            {
            // InternalAlf.g:1676:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) )
            // InternalAlf.g:1677:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) )
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
            		
            // InternalAlf.g:1688:3: (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt30=1;
                }
                break;
            case 63:
                {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==RULE_ID) ) {
                    int LA30_5 = input.LA(3);

                    if ( (LA30_5==25) ) {
                        alt30=3;
                    }
                    else if ( (LA30_5==20||LA30_5==23||(LA30_5>=38 && LA30_5<=41)||LA30_5==44||(LA30_5>=47 && LA30_5<=48)) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA30_2==RULE_UNRESTRICTED_NAME) ) {
                    int LA30_6 = input.LA(3);

                    if ( (LA30_6==25) ) {
                        alt30=3;
                    }
                    else if ( (LA30_6==20||LA30_6==23||(LA30_6>=38 && LA30_6<=41)||LA30_6==44||(LA30_6>=47 && LA30_6<=48)) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case 64:
                {
                int LA30_3 = input.LA(2);

                if ( (LA30_3==RULE_ID) ) {
                    int LA30_5 = input.LA(3);

                    if ( (LA30_5==25) ) {
                        alt30=3;
                    }
                    else if ( (LA30_5==20||LA30_5==23||(LA30_5>=38 && LA30_5<=41)||LA30_5==44||(LA30_5>=47 && LA30_5<=48)) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA30_3==RULE_UNRESTRICTED_NAME) ) {
                    int LA30_6 = input.LA(3);

                    if ( (LA30_6==25) ) {
                        alt30=3;
                    }
                    else if ( (LA30_6==20||LA30_6==23||(LA30_6>=38 && LA30_6<=41)||LA30_6==44||(LA30_6>=47 && LA30_6<=48)) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    throw nvae;
                }
                }
                break;
            case 65:
                {
                int LA30_4 = input.LA(2);

                if ( (LA30_4==RULE_ID) ) {
                    int LA30_5 = input.LA(3);

                    if ( (LA30_5==25) ) {
                        alt30=3;
                    }
                    else if ( (LA30_5==20||LA30_5==23||(LA30_5>=38 && LA30_5<=41)||LA30_5==44||(LA30_5>=47 && LA30_5<=48)) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA30_4==RULE_UNRESTRICTED_NAME) ) {
                    int LA30_6 = input.LA(3);

                    if ( (LA30_6==25) ) {
                        alt30=3;
                    }
                    else if ( (LA30_6==20||LA30_6==23||(LA30_6>=38 && LA30_6<=41)||LA30_6==44||(LA30_6>=47 && LA30_6<=48)) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA30_5 = input.LA(2);

                if ( (LA30_5==25) ) {
                    alt30=3;
                }
                else if ( (LA30_5==20||LA30_5==23||(LA30_5>=38 && LA30_5<=41)||LA30_5==44||(LA30_5>=47 && LA30_5<=48)) ) {
                    alt30=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA30_6 = input.LA(2);

                if ( (LA30_6==25) ) {
                    alt30=3;
                }
                else if ( (LA30_6==20||LA30_6==23||(LA30_6>=38 && LA30_6<=41)||LA30_6==44||(LA30_6>=47 && LA30_6<=48)) ) {
                    alt30=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalAlf.g:1689:4: this_FeatureMemberElement_1= ruleFeatureMemberElement[$current]
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
                    // InternalAlf.g:1701:4: ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1701:4: ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1702:5: ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1702:5: ( (lv_direction_2_0= ruleFeatureDirection ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=63 && LA28_0<=65)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalAlf.g:1703:6: (lv_direction_2_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1703:6: (lv_direction_2_0= ruleFeatureDirection )
                            // InternalAlf.g:1704:7: lv_direction_2_0= ruleFeatureDirection
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

                    // InternalAlf.g:1721:5: ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1722:6: (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1722:6: (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1723:7: lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:1742:4: ( ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' )
                    {
                    // InternalAlf.g:1742:4: ( ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' )
                    // InternalAlf.g:1743:5: ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';'
                    {
                    // InternalAlf.g:1743:5: ( (lv_direction_4_0= ruleFeatureDirection ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=63 && LA29_0<=65)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalAlf.g:1744:6: (lv_direction_4_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1744:6: (lv_direction_4_0= ruleFeatureDirection )
                            // InternalAlf.g:1745:7: lv_direction_4_0= ruleFeatureDirection
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

                    // InternalAlf.g:1762:5: ( (lv_memberName_5_0= ruleName ) )
                    // InternalAlf.g:1763:6: (lv_memberName_5_0= ruleName )
                    {
                    // InternalAlf.g:1763:6: (lv_memberName_5_0= ruleName )
                    // InternalAlf.g:1764:7: lv_memberName_5_0= ruleName
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
                    				
                    // InternalAlf.g:1785:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1786:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1786:6: ( ruleQualifiedName )
                    // InternalAlf.g:1787:7: ruleQualifiedName
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
    // InternalAlf.g:1812:1: ruleCategoryMemberPrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ) ;
    public final EObject ruleCategoryMemberPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedRelationship_0_0 = null;

        Enumerator lv_visibility_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1818:2: ( ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ) )
            // InternalAlf.g:1819:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? )
            {
            // InternalAlf.g:1819:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? )
            // InternalAlf.g:1820:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            {
            // InternalAlf.g:1820:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAlf.g:1821:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    {
            	    // InternalAlf.g:1821:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    // InternalAlf.g:1822:5: lv_ownedRelationship_0_0= ruleAnnotation
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
            	    break loop31;
                }
            } while (true);

            // InternalAlf.g:1839:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=59 && LA32_0<=62)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAlf.g:1840:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:1840:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:1841:5: lv_visibility_1_0= ruleVisibilityIndicator
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
    // InternalAlf.g:1863:1: ruleFeatureMemberElement[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) ) | (otherlv_9= 'connector' ( ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) ) ) ;
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
            // InternalAlf.g:1869:2: ( ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) ) | (otherlv_9= 'connector' ( ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) ) ) )
            // InternalAlf.g:1870:2: ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) ) | (otherlv_9= 'connector' ( ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) ) )
            {
            // InternalAlf.g:1870:2: ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) ) | (otherlv_9= 'connector' ( ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=30 && LA39_0<=32)) ) {
                alt39=1;
            }
            else if ( (LA39_0==33) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalAlf.g:1871:3: ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) )
                    {
                    // InternalAlf.g:1871:3: ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) )
                    // InternalAlf.g:1872:4: (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) )
                    {
                    // InternalAlf.g:1872:4: (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) )
                    int alt33=3;
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
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }

                    switch (alt33) {
                        case 1 :
                            // InternalAlf.g:1873:5: otherlv_0= 'feature'
                            {
                            otherlv_0=(Token)match(input,30,FOLLOW_32); 

                            					newLeafNode(otherlv_0, grammarAccess.getFeatureMemberElementAccess().getFeatureKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1878:5: ( (lv_isPart_1_0= 'part' ) )
                            {
                            // InternalAlf.g:1878:5: ( (lv_isPart_1_0= 'part' ) )
                            // InternalAlf.g:1879:6: (lv_isPart_1_0= 'part' )
                            {
                            // InternalAlf.g:1879:6: (lv_isPart_1_0= 'part' )
                            // InternalAlf.g:1880:7: lv_isPart_1_0= 'part'
                            {
                            lv_isPart_1_0=(Token)match(input,31,FOLLOW_32); 

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
                            // InternalAlf.g:1893:5: ( (lv_isPort_2_0= 'port' ) )
                            {
                            // InternalAlf.g:1893:5: ( (lv_isPort_2_0= 'port' ) )
                            // InternalAlf.g:1894:6: (lv_isPort_2_0= 'port' )
                            {
                            // InternalAlf.g:1894:6: (lv_isPort_2_0= 'port' )
                            // InternalAlf.g:1895:7: lv_isPort_2_0= 'port'
                            {
                            lv_isPort_2_0=(Token)match(input,32,FOLLOW_32); 

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

                    // InternalAlf.g:1908:4: ( (lv_direction_3_0= ruleFeatureDirection ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=63 && LA34_0<=65)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalAlf.g:1909:5: (lv_direction_3_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1909:5: (lv_direction_3_0= ruleFeatureDirection )
                            // InternalAlf.g:1910:6: lv_direction_3_0= ruleFeatureDirection
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

                    // InternalAlf.g:1927:4: ( ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) | ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) )
                    int alt36=2;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                        {
                        int LA36_1 = input.LA(2);

                        if ( (LA36_1==20||LA36_1==23||(LA36_1>=38 && LA36_1<=41)||LA36_1==44||(LA36_1>=47 && LA36_1<=48)) ) {
                            alt36=1;
                        }
                        else if ( (LA36_1==25) ) {
                            alt36=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 36, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_UNRESTRICTED_NAME:
                        {
                        int LA36_2 = input.LA(2);

                        if ( (LA36_2==25) ) {
                            alt36=2;
                        }
                        else if ( (LA36_2==20||LA36_2==23||(LA36_2>=38 && LA36_2<=41)||LA36_2==44||(LA36_2>=47 && LA36_2<=48)) ) {
                            alt36=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 36, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 47:
                    case 48:
                        {
                        alt36=1;
                        }
                        break;
                    case 25:
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
                            // InternalAlf.g:1928:5: ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) )
                            {
                            // InternalAlf.g:1928:5: ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) )
                            // InternalAlf.g:1929:6: (lv_ownedMemberFeature_4_0= ruleFeatureDefinition )
                            {
                            // InternalAlf.g:1929:6: (lv_ownedMemberFeature_4_0= ruleFeatureDefinition )
                            // InternalAlf.g:1930:7: lv_ownedMemberFeature_4_0= ruleFeatureDefinition
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
                            // InternalAlf.g:1948:5: ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' )
                            {
                            // InternalAlf.g:1948:5: ( ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' )
                            // InternalAlf.g:1949:6: ( (lv_memberName_5_0= ruleName ) )? otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';'
                            {
                            // InternalAlf.g:1949:6: ( (lv_memberName_5_0= ruleName ) )?
                            int alt35=2;
                            int LA35_0 = input.LA(1);

                            if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt35=1;
                            }
                            switch (alt35) {
                                case 1 :
                                    // InternalAlf.g:1950:7: (lv_memberName_5_0= ruleName )
                                    {
                                    // InternalAlf.g:1950:7: (lv_memberName_5_0= ruleName )
                                    // InternalAlf.g:1951:8: lv_memberName_5_0= ruleName
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
                            					
                            // InternalAlf.g:1972:6: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:1973:7: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:1973:7: ( ruleQualifiedName )
                            // InternalAlf.g:1974:8: ruleQualifiedName
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
                    // InternalAlf.g:1996:3: (otherlv_9= 'connector' ( ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) )
                    {
                    // InternalAlf.g:1996:3: (otherlv_9= 'connector' ( ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) )
                    // InternalAlf.g:1997:4: otherlv_9= 'connector' ( ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) )
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_34); 

                    				newLeafNode(otherlv_9, grammarAccess.getFeatureMemberElementAccess().getConnectorKeyword_1_0());
                    			
                    // InternalAlf.g:2001:4: ( ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) )
                    int alt38=2;
                    alt38 = dfa38.predict(input);
                    switch (alt38) {
                        case 1 :
                            // InternalAlf.g:2002:5: ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) )
                            {
                            // InternalAlf.g:2002:5: ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) )
                            // InternalAlf.g:2003:6: (lv_ownedMemberFeature_10_0= ruleConnectorDefinition )
                            {
                            // InternalAlf.g:2003:6: (lv_ownedMemberFeature_10_0= ruleConnectorDefinition )
                            // InternalAlf.g:2004:7: lv_ownedMemberFeature_10_0= ruleConnectorDefinition
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
                            // InternalAlf.g:2022:5: ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' )
                            {
                            // InternalAlf.g:2022:5: ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' )
                            // InternalAlf.g:2023:6: ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';'
                            {
                            // InternalAlf.g:2023:6: ( (lv_memberName_11_0= ruleName ) )?
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt37=1;
                            }
                            switch (alt37) {
                                case 1 :
                                    // InternalAlf.g:2024:7: (lv_memberName_11_0= ruleName )
                                    {
                                    // InternalAlf.g:2024:7: (lv_memberName_11_0= ruleName )
                                    // InternalAlf.g:2025:8: lv_memberName_11_0= ruleName
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
                            					
                            // InternalAlf.g:2046:6: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:2047:7: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:2047:7: ( ruleQualifiedName )
                            // InternalAlf.g:2048:8: ruleQualifiedName
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
    // InternalAlf.g:2073:1: entryRuleClassDefinitionOrStub returns [EObject current=null] : iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF ;
    public final EObject entryRuleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:2073:62: (iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:2074:2: iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF
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
    // InternalAlf.g:2080:1: ruleClassDefinitionOrStub returns [EObject current=null] : this_ClassDefinition_0= ruleClassDefinition[$current] ;
    public final EObject ruleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2086:2: (this_ClassDefinition_0= ruleClassDefinition[$current] )
            // InternalAlf.g:2087:2: this_ClassDefinition_0= ruleClassDefinition[$current]
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
    // InternalAlf.g:2102:1: ruleClassDefinition[EObject in_current] returns [EObject current=in_current] : (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) ;
    public final EObject ruleClassDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_ClassDeclaration_0 = null;

        EObject this_CategoryBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2108:2: ( (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) )
            // InternalAlf.g:2109:2: (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:2109:2: (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            // InternalAlf.g:2110:3: this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current]
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
    // InternalAlf.g:2137:1: ruleClassDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'Class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) ;
    public final EObject ruleClassDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        EObject this_ClassDeclarationCompletion_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2143:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'Class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) )
            // InternalAlf.g:2144:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'Class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            {
            // InternalAlf.g:2144:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'Class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            // InternalAlf.g:2145:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'Class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current]
            {
            // InternalAlf.g:2145:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==34) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAlf.g:2146:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:2146:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:2147:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,34,FOLLOW_36); 

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
    // InternalAlf.g:2179:1: ruleClassDeclarationCompletion[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= 'specializes' ( (lv_ownedRelationship_2_0= ruleSuperclassing ) ) (otherlv_3= ',' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) )* )? ) ;
    public final EObject ruleClassDeclarationCompletion(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedRelationship_2_0 = null;

        EObject lv_ownedRelationship_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2185:2: ( ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= 'specializes' ( (lv_ownedRelationship_2_0= ruleSuperclassing ) ) (otherlv_3= ',' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) )* )? ) )
            // InternalAlf.g:2186:2: ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= 'specializes' ( (lv_ownedRelationship_2_0= ruleSuperclassing ) ) (otherlv_3= ',' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) )* )? )
            {
            // InternalAlf.g:2186:2: ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= 'specializes' ( (lv_ownedRelationship_2_0= ruleSuperclassing ) ) (otherlv_3= ',' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) )* )? )
            // InternalAlf.g:2187:3: ( (lv_name_0_0= ruleName ) ) (otherlv_1= 'specializes' ( (lv_ownedRelationship_2_0= ruleSuperclassing ) ) (otherlv_3= ',' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) )* )?
            {
            // InternalAlf.g:2187:3: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:2188:4: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:2188:4: (lv_name_0_0= ruleName )
            // InternalAlf.g:2189:5: lv_name_0_0= ruleName
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

            // InternalAlf.g:2206:3: (otherlv_1= 'specializes' ( (lv_ownedRelationship_2_0= ruleSuperclassing ) ) (otherlv_3= ',' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==35) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAlf.g:2207:4: otherlv_1= 'specializes' ( (lv_ownedRelationship_2_0= ruleSuperclassing ) ) (otherlv_3= ',' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) )*
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getClassDeclarationCompletionAccess().getSpecializesKeyword_1_0());
                    			
                    // InternalAlf.g:2211:4: ( (lv_ownedRelationship_2_0= ruleSuperclassing ) )
                    // InternalAlf.g:2212:5: (lv_ownedRelationship_2_0= ruleSuperclassing )
                    {
                    // InternalAlf.g:2212:5: (lv_ownedRelationship_2_0= ruleSuperclassing )
                    // InternalAlf.g:2213:6: lv_ownedRelationship_2_0= ruleSuperclassing
                    {

                    						newCompositeNode(grammarAccess.getClassDeclarationCompletionAccess().getOwnedRelationshipSuperclassingParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_ownedRelationship_2_0=ruleSuperclassing();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassDeclarationCompletionRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelationship",
                    							lv_ownedRelationship_2_0,
                    							"org.omg.sysml.Alf.Superclassing");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:2230:4: (otherlv_3= ',' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==36) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalAlf.g:2231:5: otherlv_3= ',' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) )
                    	    {
                    	    otherlv_3=(Token)match(input,36,FOLLOW_13); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getClassDeclarationCompletionAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalAlf.g:2235:5: ( (lv_ownedRelationship_4_0= ruleSuperclassing ) )
                    	    // InternalAlf.g:2236:6: (lv_ownedRelationship_4_0= ruleSuperclassing )
                    	    {
                    	    // InternalAlf.g:2236:6: (lv_ownedRelationship_4_0= ruleSuperclassing )
                    	    // InternalAlf.g:2237:7: lv_ownedRelationship_4_0= ruleSuperclassing
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassDeclarationCompletionAccess().getOwnedRelationshipSuperclassingParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    lv_ownedRelationship_4_0=ruleSuperclassing();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassDeclarationCompletionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedRelationship",
                    	    								lv_ownedRelationship_4_0,
                    	    								"org.omg.sysml.Alf.Superclassing");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


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


    // $ANTLR start "entryRuleSuperclassing"
    // InternalAlf.g:2260:1: entryRuleSuperclassing returns [EObject current=null] : iv_ruleSuperclassing= ruleSuperclassing EOF ;
    public final EObject entryRuleSuperclassing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperclassing = null;


        try {
            // InternalAlf.g:2260:54: (iv_ruleSuperclassing= ruleSuperclassing EOF )
            // InternalAlf.g:2261:2: iv_ruleSuperclassing= ruleSuperclassing EOF
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
    // InternalAlf.g:2267:1: ruleSuperclassing returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSuperclassing() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:2273:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2274:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2274:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2275:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:2275:3: ( ruleQualifiedName )
            // InternalAlf.g:2276:4: ruleQualifiedName
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
    // InternalAlf.g:2293:1: entryRuleObjectClassDefinitionOrStub returns [EObject current=null] : iv_ruleObjectClassDefinitionOrStub= ruleObjectClassDefinitionOrStub EOF ;
    public final EObject entryRuleObjectClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:2293:68: (iv_ruleObjectClassDefinitionOrStub= ruleObjectClassDefinitionOrStub EOF )
            // InternalAlf.g:2294:2: iv_ruleObjectClassDefinitionOrStub= ruleObjectClassDefinitionOrStub EOF
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
    // InternalAlf.g:2300:1: ruleObjectClassDefinitionOrStub returns [EObject current=null] : this_ObjectClassDefinition_0= ruleObjectClassDefinition[$current] ;
    public final EObject ruleObjectClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2306:2: (this_ObjectClassDefinition_0= ruleObjectClassDefinition[$current] )
            // InternalAlf.g:2307:2: this_ObjectClassDefinition_0= ruleObjectClassDefinition[$current]
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
    // InternalAlf.g:2322:1: ruleObjectClassDefinition[EObject in_current] returns [EObject current=in_current] : (this_ObjectClassDeclaration_0= ruleObjectClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) ;
    public final EObject ruleObjectClassDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_ObjectClassDeclaration_0 = null;

        EObject this_CategoryBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2328:2: ( (this_ObjectClassDeclaration_0= ruleObjectClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) )
            // InternalAlf.g:2329:2: (this_ObjectClassDeclaration_0= ruleObjectClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:2329:2: (this_ObjectClassDeclaration_0= ruleObjectClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            // InternalAlf.g:2330:3: this_ObjectClassDeclaration_0= ruleObjectClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current]
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
    // InternalAlf.g:2357:1: ruleObjectClassDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) ;
    public final EObject ruleObjectClassDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        EObject this_ClassDeclarationCompletion_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2363:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) )
            // InternalAlf.g:2364:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            {
            // InternalAlf.g:2364:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            // InternalAlf.g:2365:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current]
            {
            // InternalAlf.g:2365:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==34) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAlf.g:2366:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:2366:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:2367:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,34,FOLLOW_39); 

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
    // InternalAlf.g:2398:1: entryRuleValueClassDefinitionOrStub returns [EObject current=null] : iv_ruleValueClassDefinitionOrStub= ruleValueClassDefinitionOrStub EOF ;
    public final EObject entryRuleValueClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:2398:67: (iv_ruleValueClassDefinitionOrStub= ruleValueClassDefinitionOrStub EOF )
            // InternalAlf.g:2399:2: iv_ruleValueClassDefinitionOrStub= ruleValueClassDefinitionOrStub EOF
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
    // InternalAlf.g:2405:1: ruleValueClassDefinitionOrStub returns [EObject current=null] : this_ValueClassDefinition_0= ruleValueClassDefinition[$current] ;
    public final EObject ruleValueClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ValueClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2411:2: (this_ValueClassDefinition_0= ruleValueClassDefinition[$current] )
            // InternalAlf.g:2412:2: this_ValueClassDefinition_0= ruleValueClassDefinition[$current]
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
    // InternalAlf.g:2427:1: ruleValueClassDefinition[EObject in_current] returns [EObject current=in_current] : (this_ValueClassDeclaration_0= ruleValueClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) ;
    public final EObject ruleValueClassDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_ValueClassDeclaration_0 = null;

        EObject this_CategoryBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2433:2: ( (this_ValueClassDeclaration_0= ruleValueClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) )
            // InternalAlf.g:2434:2: (this_ValueClassDeclaration_0= ruleValueClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:2434:2: (this_ValueClassDeclaration_0= ruleValueClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            // InternalAlf.g:2435:3: this_ValueClassDeclaration_0= ruleValueClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current]
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
    // InternalAlf.g:2462:1: ruleValueClassDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'datatype' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) ;
    public final EObject ruleValueClassDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        EObject this_ClassDeclarationCompletion_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2468:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'datatype' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] ) )
            // InternalAlf.g:2469:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'datatype' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            {
            // InternalAlf.g:2469:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'datatype' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current] )
            // InternalAlf.g:2470:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'datatype' this_ClassDeclarationCompletion_2= ruleClassDeclarationCompletion[$current]
            {
            // InternalAlf.g:2470:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==34) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAlf.g:2471:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:2471:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:2472:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,34,FOLLOW_40); 

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
    // InternalAlf.g:2503:1: entryRuleAssociationDefinitionOrStub returns [EObject current=null] : iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF ;
    public final EObject entryRuleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinitionOrStub = null;


        try {
            // InternalAlf.g:2503:68: (iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF )
            // InternalAlf.g:2504:2: iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF
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
    // InternalAlf.g:2510:1: ruleAssociationDefinitionOrStub returns [EObject current=null] : this_AssociationDefinition_0= ruleAssociationDefinition[$current] ;
    public final EObject ruleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_AssociationDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2516:2: (this_AssociationDefinition_0= ruleAssociationDefinition[$current] )
            // InternalAlf.g:2517:2: this_AssociationDefinition_0= ruleAssociationDefinition[$current]
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
    // InternalAlf.g:2532:1: ruleAssociationDefinition[EObject in_current] returns [EObject current=in_current] : (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] ) ;
    public final EObject ruleAssociationDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_AssociationDeclaration_0 = null;

        EObject this_AssociationBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2538:2: ( (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] ) )
            // InternalAlf.g:2539:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] )
            {
            // InternalAlf.g:2539:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] )
            // InternalAlf.g:2540:3: this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current]
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
    // InternalAlf.g:2567:1: ruleAssociationDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )* )? ) ;
    public final EObject ruleAssociationDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRelationship_4_0 = null;

        EObject lv_ownedRelationship_6_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2573:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )* )? ) )
            // InternalAlf.g:2574:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )* )? )
            {
            // InternalAlf.g:2574:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )* )? )
            // InternalAlf.g:2575:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )* )?
            {
            // InternalAlf.g:2575:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==34) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAlf.g:2576:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:2576:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:2577:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,34,FOLLOW_41); 

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
            		
            // InternalAlf.g:2593:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:2594:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:2594:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:2595:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_37);
            lv_name_2_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:2612:3: (otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==35) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAlf.g:2613:4: otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )*
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getAssociationDeclarationAccess().getSpecializesKeyword_3_0());
                    			
                    // InternalAlf.g:2617:4: ( (lv_ownedRelationship_4_0= ruleSuperclassing ) )
                    // InternalAlf.g:2618:5: (lv_ownedRelationship_4_0= ruleSuperclassing )
                    {
                    // InternalAlf.g:2618:5: (lv_ownedRelationship_4_0= ruleSuperclassing )
                    // InternalAlf.g:2619:6: lv_ownedRelationship_4_0= ruleSuperclassing
                    {

                    						newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getOwnedRelationshipSuperclassingParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_ownedRelationship_4_0=ruleSuperclassing();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssociationDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelationship",
                    							lv_ownedRelationship_4_0,
                    							"org.omg.sysml.Alf.Superclassing");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:2636:4: (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==36) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalAlf.g:2637:5: otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) )
                    	    {
                    	    otherlv_5=(Token)match(input,36,FOLLOW_13); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAssociationDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:2641:5: ( (lv_ownedRelationship_6_0= ruleSuperclassing ) )
                    	    // InternalAlf.g:2642:6: (lv_ownedRelationship_6_0= ruleSuperclassing )
                    	    {
                    	    // InternalAlf.g:2642:6: (lv_ownedRelationship_6_0= ruleSuperclassing )
                    	    // InternalAlf.g:2643:7: lv_ownedRelationship_6_0= ruleSuperclassing
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getOwnedRelationshipSuperclassingParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    lv_ownedRelationship_6_0=ruleSuperclassing();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssociationDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedRelationship",
                    	    								lv_ownedRelationship_6_0,
                    	    								"org.omg.sysml.Alf.Superclassing");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


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
    // $ANTLR end "ruleAssociationDeclaration"


    // $ANTLR start "ruleAssociationBody"
    // InternalAlf.g:2667:1: ruleAssociationBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) ;
    public final EObject ruleAssociationBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_ownedMembership_2_0 = null;

        EObject lv_ownedImport_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2673:2: ( (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) )
            // InternalAlf.g:2674:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            {
            // InternalAlf.g:2674:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
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
                    // InternalAlf.g:2675:3: otherlv_0= ';'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getAssociationBodyAccess().getSemicolonKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:2680:3: (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    {
                    // InternalAlf.g:2680:3: (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    // InternalAlf.g:2681:4: otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_42); 

                    				newLeafNode(otherlv_1, grammarAccess.getAssociationBodyAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalAlf.g:2685:4: ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )*
                    loop48:
                    do {
                        int alt48=3;
                        alt48 = dfa48.predict(input);
                        switch (alt48) {
                    	case 1 :
                    	    // InternalAlf.g:2686:5: ( (lv_ownedMembership_2_0= ruleAssociationMember ) )
                    	    {
                    	    // InternalAlf.g:2686:5: ( (lv_ownedMembership_2_0= ruleAssociationMember ) )
                    	    // InternalAlf.g:2687:6: (lv_ownedMembership_2_0= ruleAssociationMember )
                    	    {
                    	    // InternalAlf.g:2687:6: (lv_ownedMembership_2_0= ruleAssociationMember )
                    	    // InternalAlf.g:2688:7: lv_ownedMembership_2_0= ruleAssociationMember
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
                    	    // InternalAlf.g:2706:5: ( (lv_ownedImport_3_0= rulePackageImport ) )
                    	    {
                    	    // InternalAlf.g:2706:5: ( (lv_ownedImport_3_0= rulePackageImport ) )
                    	    // InternalAlf.g:2707:6: (lv_ownedImport_3_0= rulePackageImport )
                    	    {
                    	    // InternalAlf.g:2707:6: (lv_ownedImport_3_0= rulePackageImport )
                    	    // InternalAlf.g:2708:7: lv_ownedImport_3_0= rulePackageImport
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
    // InternalAlf.g:2735:1: entryRuleAssociationMember returns [EObject current=null] : iv_ruleAssociationMember= ruleAssociationMember EOF ;
    public final EObject entryRuleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationMember = null;


        try {
            // InternalAlf.g:2735:58: (iv_ruleAssociationMember= ruleAssociationMember EOF )
            // InternalAlf.g:2736:2: iv_ruleAssociationMember= ruleAssociationMember EOF
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
    // InternalAlf.g:2742:1: ruleAssociationMember returns [EObject current=null] : (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember ) ;
    public final EObject ruleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureCategoryMember_0 = null;

        EObject this_AssociationFeatureMember_1 = null;

        EObject this_AssociationEndFeatureMember_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2748:2: ( (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember ) )
            // InternalAlf.g:2749:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )
            {
            // InternalAlf.g:2749:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )
            int alt50=3;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // InternalAlf.g:2750:3: this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember
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
                    // InternalAlf.g:2759:3: this_AssociationFeatureMember_1= ruleAssociationFeatureMember
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
                    // InternalAlf.g:2768:3: this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember
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
    // InternalAlf.g:2780:1: entryRuleAssociationFeatureMember returns [EObject current=null] : iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF ;
    public final EObject entryRuleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationFeatureMember = null;


        try {
            // InternalAlf.g:2780:65: (iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF )
            // InternalAlf.g:2781:2: iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF
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
    // InternalAlf.g:2787:1: ruleAssociationFeatureMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] ) ;
    public final EObject ruleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject this_CategoryMemberPrefix_0 = null;

        EObject this_FeatureMemberElement_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2793:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] ) )
            // InternalAlf.g:2794:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] )
            {
            // InternalAlf.g:2794:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] )
            // InternalAlf.g:2795:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current]
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
    // InternalAlf.g:2821:1: entryRuleAssociationEndFeatureMember returns [EObject current=null] : iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF ;
    public final EObject entryRuleAssociationEndFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEndFeatureMember = null;


        try {
            // InternalAlf.g:2821:68: (iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF )
            // InternalAlf.g:2822:2: iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF
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
    // InternalAlf.g:2828:1: ruleAssociationEndFeatureMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) ) ;
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
            // InternalAlf.g:2834:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) ) )
            // InternalAlf.g:2835:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) )
            {
            // InternalAlf.g:2835:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) )
            // InternalAlf.g:2836:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )
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
            		
            // InternalAlf.g:2847:3: ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )
            int alt55=4;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // InternalAlf.g:2848:4: (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2848:4: (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) )
                    // InternalAlf.g:2849:5: otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) )
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_45); 

                    					newLeafNode(otherlv_1, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_1_0_0());
                    				
                    // InternalAlf.g:2853:5: ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )?
                    int alt51=3;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==31) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==32) ) {
                        alt51=2;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalAlf.g:2854:6: ( (lv_isPart_2_0= 'part' ) )
                            {
                            // InternalAlf.g:2854:6: ( (lv_isPart_2_0= 'part' ) )
                            // InternalAlf.g:2855:7: (lv_isPart_2_0= 'part' )
                            {
                            // InternalAlf.g:2855:7: (lv_isPart_2_0= 'part' )
                            // InternalAlf.g:2856:8: lv_isPart_2_0= 'part'
                            {
                            lv_isPart_2_0=(Token)match(input,31,FOLLOW_46); 

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
                            // InternalAlf.g:2869:6: ( (lv_isPort_3_0= 'port' ) )
                            {
                            // InternalAlf.g:2869:6: ( (lv_isPort_3_0= 'port' ) )
                            // InternalAlf.g:2870:7: (lv_isPort_3_0= 'port' )
                            {
                            // InternalAlf.g:2870:7: (lv_isPort_3_0= 'port' )
                            // InternalAlf.g:2871:8: lv_isPort_3_0= 'port'
                            {
                            lv_isPort_3_0=(Token)match(input,32,FOLLOW_46); 

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

                    // InternalAlf.g:2884:5: ( (lv_direction_4_0= ruleFeatureDirection ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( ((LA52_0>=63 && LA52_0<=65)) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalAlf.g:2885:6: (lv_direction_4_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2885:6: (lv_direction_4_0= ruleFeatureDirection )
                            // InternalAlf.g:2886:7: lv_direction_4_0= ruleFeatureDirection
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

                    // InternalAlf.g:2903:5: ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) )
                    // InternalAlf.g:2904:6: (lv_ownedMemberFeature_5_0= ruleFeatureDefinition )
                    {
                    // InternalAlf.g:2904:6: (lv_ownedMemberFeature_5_0= ruleFeatureDefinition )
                    // InternalAlf.g:2905:7: lv_ownedMemberFeature_5_0= ruleFeatureDefinition
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
                    // InternalAlf.g:2924:4: (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' )
                    {
                    // InternalAlf.g:2924:4: (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' )
                    // InternalAlf.g:2925:5: otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';'
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_48); 

                    					newLeafNode(otherlv_6, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_1_1_0());
                    				
                    // InternalAlf.g:2929:5: ( (lv_isPart_7_0= 'part' ) )
                    // InternalAlf.g:2930:6: (lv_isPart_7_0= 'part' )
                    {
                    // InternalAlf.g:2930:6: (lv_isPart_7_0= 'part' )
                    // InternalAlf.g:2931:7: lv_isPart_7_0= 'part'
                    {
                    lv_isPart_7_0=(Token)match(input,31,FOLLOW_24); 

                    							newLeafNode(lv_isPart_7_0, grammarAccess.getAssociationEndFeatureMemberAccess().getIsPartPartKeyword_1_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    							setWithLastConsumed(current, "isPart", true, "part");
                    						

                    }


                    }

                    // InternalAlf.g:2943:5: ( (lv_memberName_8_0= ruleName ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalAlf.g:2944:6: (lv_memberName_8_0= ruleName )
                            {
                            // InternalAlf.g:2944:6: (lv_memberName_8_0= ruleName )
                            // InternalAlf.g:2945:7: lv_memberName_8_0= ruleName
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
                    				
                    // InternalAlf.g:2966:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:2967:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:2967:6: ( ruleQualifiedName )
                    // InternalAlf.g:2968:7: ruleQualifiedName
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
                    // InternalAlf.g:2988:4: ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2988:4: ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:2989:5: ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:2989:5: ( (lv_direction_12_0= ruleFeatureDirection ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=63 && LA54_0<=65)) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalAlf.g:2990:6: (lv_direction_12_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2990:6: (lv_direction_12_0= ruleFeatureDirection )
                            // InternalAlf.g:2991:7: lv_direction_12_0= ruleFeatureDirection
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

                    // InternalAlf.g:3008:5: ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:3009:6: (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:3009:6: (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:3010:7: lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:3029:4: ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    {
                    // InternalAlf.g:3029:4: ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    // InternalAlf.g:3030:5: ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';'
                    {
                    // InternalAlf.g:3030:5: ( (lv_memberName_14_0= ruleName ) )
                    // InternalAlf.g:3031:6: (lv_memberName_14_0= ruleName )
                    {
                    // InternalAlf.g:3031:6: (lv_memberName_14_0= ruleName )
                    // InternalAlf.g:3032:7: lv_memberName_14_0= ruleName
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
                    				
                    // InternalAlf.g:3053:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:3054:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:3054:6: ( ruleQualifiedName )
                    // InternalAlf.g:3055:7: ruleQualifiedName
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


    // $ANTLR start "entryRuleFeatureDefinition"
    // InternalAlf.g:3079:1: entryRuleFeatureDefinition returns [EObject current=null] : iv_ruleFeatureDefinition= ruleFeatureDefinition EOF ;
    public final EObject entryRuleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDefinition = null;


        try {
            // InternalAlf.g:3079:58: (iv_ruleFeatureDefinition= ruleFeatureDefinition EOF )
            // InternalAlf.g:3080:2: iv_ruleFeatureDefinition= ruleFeatureDefinition EOF
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
    // InternalAlf.g:3086:1: ruleFeatureDefinition returns [EObject current=null] : (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) ;
    public final EObject ruleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_NamedFeatureDefinition_0 = null;

        EObject this_UnnamedFeatureDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:3092:2: ( (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) )
            // InternalAlf.g:3093:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            {
            // InternalAlf.g:3093:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=47 && LA56_0<=48)) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalAlf.g:3094:3: this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:3103:3: this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition
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
    // InternalAlf.g:3115:1: entryRuleNamedFeatureDefinition returns [EObject current=null] : iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF ;
    public final EObject entryRuleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedFeatureDefinition = null;


        try {
            // InternalAlf.g:3115:63: (iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF )
            // InternalAlf.g:3116:2: iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF
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
    // InternalAlf.g:3122:1: ruleNamedFeatureDefinition returns [EObject current=null] : (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureDeclaration_0 = null;

        EObject this_FeatureCompletion_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:3128:2: ( (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:3129:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:3129:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] )
            // InternalAlf.g:3130:3: this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getNamedFeatureDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getFeatureDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
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
    // InternalAlf.g:3156:1: entryRuleUnnamedFeatureDefinition returns [EObject current=null] : iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF ;
    public final EObject entryRuleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedFeatureDefinition = null;


        try {
            // InternalAlf.g:3156:65: (iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF )
            // InternalAlf.g:3157:2: iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF
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
    // InternalAlf.g:3163:1: ruleUnnamedFeatureDefinition returns [EObject current=null] : ( ( (this_Subsets_0= ruleSubsets[$current] this_Redefinitions_1= ruleRedefinitions[$current] ) | this_Redefinitions_2= ruleRedefinitions[$current] ) (this_TypePart_3= ruleTypePart[$current] )? ( (lv_multiplicity_4_0= ruleMultiplicity ) )? this_FeatureCompletion_5= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_Subsets_0 = null;

        EObject this_Redefinitions_1 = null;

        EObject this_Redefinitions_2 = null;

        EObject this_TypePart_3 = null;

        EObject lv_multiplicity_4_0 = null;

        EObject this_FeatureCompletion_5 = null;



        	enterRule();

        try {
            // InternalAlf.g:3169:2: ( ( ( (this_Subsets_0= ruleSubsets[$current] this_Redefinitions_1= ruleRedefinitions[$current] ) | this_Redefinitions_2= ruleRedefinitions[$current] ) (this_TypePart_3= ruleTypePart[$current] )? ( (lv_multiplicity_4_0= ruleMultiplicity ) )? this_FeatureCompletion_5= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:3170:2: ( ( (this_Subsets_0= ruleSubsets[$current] this_Redefinitions_1= ruleRedefinitions[$current] ) | this_Redefinitions_2= ruleRedefinitions[$current] ) (this_TypePart_3= ruleTypePart[$current] )? ( (lv_multiplicity_4_0= ruleMultiplicity ) )? this_FeatureCompletion_5= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:3170:2: ( ( (this_Subsets_0= ruleSubsets[$current] this_Redefinitions_1= ruleRedefinitions[$current] ) | this_Redefinitions_2= ruleRedefinitions[$current] ) (this_TypePart_3= ruleTypePart[$current] )? ( (lv_multiplicity_4_0= ruleMultiplicity ) )? this_FeatureCompletion_5= ruleFeatureCompletion[$current] )
            // InternalAlf.g:3171:3: ( (this_Subsets_0= ruleSubsets[$current] this_Redefinitions_1= ruleRedefinitions[$current] ) | this_Redefinitions_2= ruleRedefinitions[$current] ) (this_TypePart_3= ruleTypePart[$current] )? ( (lv_multiplicity_4_0= ruleMultiplicity ) )? this_FeatureCompletion_5= ruleFeatureCompletion[$current]
            {
            // InternalAlf.g:3171:3: ( (this_Subsets_0= ruleSubsets[$current] this_Redefinitions_1= ruleRedefinitions[$current] ) | this_Redefinitions_2= ruleRedefinitions[$current] )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==47) ) {
                alt57=1;
            }
            else if ( (LA57_0==48) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalAlf.g:3172:4: (this_Subsets_0= ruleSubsets[$current] this_Redefinitions_1= ruleRedefinitions[$current] )
                    {
                    // InternalAlf.g:3172:4: (this_Subsets_0= ruleSubsets[$current] this_Redefinitions_1= ruleRedefinitions[$current] )
                    // InternalAlf.g:3173:5: this_Subsets_0= ruleSubsets[$current] this_Redefinitions_1= ruleRedefinitions[$current]
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnnamedFeatureDefinitionRule());
                    					}
                    					newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getSubsetsParserRuleCall_0_0_0());
                    				
                    pushFollow(FOLLOW_27);
                    this_Subsets_0=ruleSubsets(current);

                    state._fsp--;


                    					current = this_Subsets_0;
                    					afterParserOrEnumRuleCall();
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnnamedFeatureDefinitionRule());
                    					}
                    					newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getRedefinitionsParserRuleCall_0_0_1());
                    				
                    pushFollow(FOLLOW_50);
                    this_Redefinitions_1=ruleRedefinitions(current);

                    state._fsp--;


                    					current = this_Redefinitions_1;
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:3197:4: this_Redefinitions_2= ruleRedefinitions[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getUnnamedFeatureDefinitionRule());
                    				}
                    				newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getRedefinitionsParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_50);
                    this_Redefinitions_2=ruleRedefinitions(current);

                    state._fsp--;


                    				current = this_Redefinitions_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalAlf.g:3209:3: (this_TypePart_3= ruleTypePart[$current] )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==41) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAlf.g:3210:4: this_TypePart_3= ruleTypePart[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getUnnamedFeatureDefinitionRule());
                    				}
                    				newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getTypePartParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_51);
                    this_TypePart_3=ruleTypePart(current);

                    state._fsp--;


                    				current = this_TypePart_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalAlf.g:3222:3: ( (lv_multiplicity_4_0= ruleMultiplicity ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==44) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalAlf.g:3223:4: (lv_multiplicity_4_0= ruleMultiplicity )
                    {
                    // InternalAlf.g:3223:4: (lv_multiplicity_4_0= ruleMultiplicity )
                    // InternalAlf.g:3224:5: lv_multiplicity_4_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getMultiplicityMultiplicityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_49);
                    lv_multiplicity_4_0=ruleMultiplicity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
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


            			if (current==null) {
            				current = createModelElement(grammarAccess.getUnnamedFeatureDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getFeatureCompletionParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            this_FeatureCompletion_5=ruleFeatureCompletion(current);

            state._fsp--;


            			current = this_FeatureCompletion_5;
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
    // InternalAlf.g:3257:1: ruleFeatureBodyDefinition[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_FeatureCompletion_2= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleFeatureBodyDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject this_FeatureDeclaration_1 = null;

        EObject this_FeatureCompletion_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:3263:2: ( (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_FeatureCompletion_2= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:3264:2: (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_FeatureCompletion_2= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:3264:2: (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_FeatureCompletion_2= ruleFeatureCompletion[$current] )
            // InternalAlf.g:3265:3: otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_FeatureCompletion_2= ruleFeatureCompletion[$current]
            {
            otherlv_0=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureBodyDefinitionAccess().getFeatureKeyword_0());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureBodyDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureBodyDefinitionAccess().getFeatureDeclarationParserRuleCall_1());
            		
            pushFollow(FOLLOW_49);
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
    // InternalAlf.g:3296:1: ruleFeatureDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )* ) ) ) (this_Redefinitions_6= ruleRedefinitions[$current] )? (this_Subsets_7= ruleSubsets[$current] )? ) ;
    public final EObject ruleFeatureDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isOrdered_4_0=null;
        Token lv_isNonunique_5_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject this_TypePart_1 = null;

        EObject lv_multiplicity_2_0 = null;

        EObject this_Redefinitions_6 = null;

        EObject this_Subsets_7 = null;



        	enterRule();

        try {
            // InternalAlf.g:3302:2: ( ( ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )* ) ) ) (this_Redefinitions_6= ruleRedefinitions[$current] )? (this_Subsets_7= ruleSubsets[$current] )? ) )
            // InternalAlf.g:3303:2: ( ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )* ) ) ) (this_Redefinitions_6= ruleRedefinitions[$current] )? (this_Subsets_7= ruleSubsets[$current] )? )
            {
            // InternalAlf.g:3303:2: ( ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )* ) ) ) (this_Redefinitions_6= ruleRedefinitions[$current] )? (this_Subsets_7= ruleSubsets[$current] )? )
            // InternalAlf.g:3304:3: ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )* ) ) ) (this_Redefinitions_6= ruleRedefinitions[$current] )? (this_Subsets_7= ruleSubsets[$current] )?
            {
            // InternalAlf.g:3304:3: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:3305:4: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:3305:4: (lv_name_0_0= ruleName )
            // InternalAlf.g:3306:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_52);
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

            // InternalAlf.g:3323:3: (this_TypePart_1= ruleTypePart[$current] )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==41) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalAlf.g:3324:4: this_TypePart_1= ruleTypePart[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getFeatureDeclarationRule());
                    				}
                    				newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getTypePartParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_53);
                    this_TypePart_1=ruleTypePart(current);

                    state._fsp--;


                    				current = this_TypePart_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalAlf.g:3336:3: ( (lv_multiplicity_2_0= ruleMultiplicity ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==44) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalAlf.g:3337:4: (lv_multiplicity_2_0= ruleMultiplicity )
                    {
                    // InternalAlf.g:3337:4: (lv_multiplicity_2_0= ruleMultiplicity )
                    // InternalAlf.g:3338:5: lv_multiplicity_2_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getMultiplicityMultiplicityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_54);
                    lv_multiplicity_2_0=ruleMultiplicity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFeatureDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"multiplicity",
                    						lv_multiplicity_2_0,
                    						"org.omg.sysml.Alf.Multiplicity");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:3355:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )* ) ) )
            // InternalAlf.g:3356:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )* ) )
            {
            // InternalAlf.g:3356:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )* ) )
            // InternalAlf.g:3357:5: ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3());
            				
            // InternalAlf.g:3360:5: ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )* )
            // InternalAlf.g:3361:6: ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )*
            {
            // InternalAlf.g:3361:6: ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )*
            loop62:
            do {
                int alt62=3;
                int LA62_0 = input.LA(1);

                if ( LA62_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3(), 0) ) {
                    alt62=1;
                }
                else if ( LA62_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3(), 1) ) {
                    alt62=2;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalAlf.g:3362:4: ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) )
            	    {
            	    // InternalAlf.g:3362:4: ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) )
            	    // InternalAlf.g:3363:5: {...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalAlf.g:3363:115: ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) )
            	    // InternalAlf.g:3364:6: ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalAlf.g:3367:9: ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) )
            	    // InternalAlf.g:3367:10: {...}? => ( (lv_isOrdered_4_0= 'ordered' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureDeclaration", "true");
            	    }
            	    // InternalAlf.g:3367:19: ( (lv_isOrdered_4_0= 'ordered' ) )
            	    // InternalAlf.g:3367:20: (lv_isOrdered_4_0= 'ordered' )
            	    {
            	    // InternalAlf.g:3367:20: (lv_isOrdered_4_0= 'ordered' )
            	    // InternalAlf.g:3368:10: lv_isOrdered_4_0= 'ordered'
            	    {
            	    lv_isOrdered_4_0=(Token)match(input,38,FOLLOW_54); 

            	    										newLeafNode(lv_isOrdered_4_0, grammarAccess.getFeatureDeclarationAccess().getIsOrderedOrderedKeyword_3_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getFeatureDeclarationRule());
            	    										}
            	    										setWithLastConsumed(current, "isOrdered", true, "ordered");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:3385:4: ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) )
            	    {
            	    // InternalAlf.g:3385:4: ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) )
            	    // InternalAlf.g:3386:5: {...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalAlf.g:3386:115: ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) )
            	    // InternalAlf.g:3387:6: ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalAlf.g:3390:9: ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) )
            	    // InternalAlf.g:3390:10: {...}? => ( (lv_isNonunique_5_0= 'nonunique' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureDeclaration", "true");
            	    }
            	    // InternalAlf.g:3390:19: ( (lv_isNonunique_5_0= 'nonunique' ) )
            	    // InternalAlf.g:3390:20: (lv_isNonunique_5_0= 'nonunique' )
            	    {
            	    // InternalAlf.g:3390:20: (lv_isNonunique_5_0= 'nonunique' )
            	    // InternalAlf.g:3391:10: lv_isNonunique_5_0= 'nonunique'
            	    {
            	    lv_isNonunique_5_0=(Token)match(input,39,FOLLOW_54); 

            	    										newLeafNode(lv_isNonunique_5_0, grammarAccess.getFeatureDeclarationAccess().getIsNonuniqueNonuniqueKeyword_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getFeatureDeclarationRule());
            	    										}
            	    										setWithLastConsumed(current, "isNonunique", true, "nonunique");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3());
            				

            }

            // InternalAlf.g:3415:3: (this_Redefinitions_6= ruleRedefinitions[$current] )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==48) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAlf.g:3416:4: this_Redefinitions_6= ruleRedefinitions[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getFeatureDeclarationRule());
                    				}
                    				newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getRedefinitionsParserRuleCall_4());
                    			
                    pushFollow(FOLLOW_55);
                    this_Redefinitions_6=ruleRedefinitions(current);

                    state._fsp--;


                    				current = this_Redefinitions_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalAlf.g:3428:3: (this_Subsets_7= ruleSubsets[$current] )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==47) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalAlf.g:3429:4: this_Subsets_7= ruleSubsets[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getFeatureDeclarationRule());
                    				}
                    				newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getSubsetsParserRuleCall_5());
                    			
                    pushFollow(FOLLOW_2);
                    this_Subsets_7=ruleSubsets(current);

                    state._fsp--;


                    				current = this_Subsets_7;
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
    // $ANTLR end "ruleFeatureDeclaration"


    // $ANTLR start "ruleFeatureCompletion"
    // InternalAlf.g:3446:1: ruleFeatureCompletion[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current] ) ;
    public final EObject ruleFeatureCompletion(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_valuation_1_0 = null;

        EObject this_CategoryBody_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:3452:2: ( ( (otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current] ) )
            // InternalAlf.g:3453:2: ( (otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:3453:2: ( (otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current] )
            // InternalAlf.g:3454:3: (otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current]
            {
            // InternalAlf.g:3454:3: (otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==40) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalAlf.g:3455:4: otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) )
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_56); 

                    				newLeafNode(otherlv_0, grammarAccess.getFeatureCompletionAccess().getEqualsSignKeyword_0_0());
                    			
                    // InternalAlf.g:3459:4: ( (lv_valuation_1_0= ruleFeatureValue ) )
                    // InternalAlf.g:3460:5: (lv_valuation_1_0= ruleFeatureValue )
                    {
                    // InternalAlf.g:3460:5: (lv_valuation_1_0= ruleFeatureValue )
                    // InternalAlf.g:3461:6: lv_valuation_1_0= ruleFeatureValue
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
    // InternalAlf.g:3494:1: entryRuleFeatureValue returns [EObject current=null] : iv_ruleFeatureValue= ruleFeatureValue EOF ;
    public final EObject entryRuleFeatureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureValue = null;


        try {
            // InternalAlf.g:3494:53: (iv_ruleFeatureValue= ruleFeatureValue EOF )
            // InternalAlf.g:3495:2: iv_ruleFeatureValue= ruleFeatureValue EOF
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
    // InternalAlf.g:3501:1: ruleFeatureValue returns [EObject current=null] : ( (lv_value_0_0= ruleExpression ) ) ;
    public final EObject ruleFeatureValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3507:2: ( ( (lv_value_0_0= ruleExpression ) ) )
            // InternalAlf.g:3508:2: ( (lv_value_0_0= ruleExpression ) )
            {
            // InternalAlf.g:3508:2: ( (lv_value_0_0= ruleExpression ) )
            // InternalAlf.g:3509:3: (lv_value_0_0= ruleExpression )
            {
            // InternalAlf.g:3509:3: (lv_value_0_0= ruleExpression )
            // InternalAlf.g:3510:4: lv_value_0_0= ruleExpression
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
    // InternalAlf.g:3531:1: ruleTypePart[EObject in_current] returns [EObject current=in_current] : (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) ) ;
    public final EObject ruleTypePart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_isComposite_1_0=null;
        Token otherlv_3=null;
        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3537:2: ( (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) ) )
            // InternalAlf.g:3538:2: (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )
            {
            // InternalAlf.g:3538:2: (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )
            // InternalAlf.g:3539:3: otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_57); 

            			newLeafNode(otherlv_0, grammarAccess.getTypePartAccess().getColonKeyword_0());
            		
            // InternalAlf.g:3543:3: ( (lv_isComposite_1_0= 'compose' ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==42) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalAlf.g:3544:4: (lv_isComposite_1_0= 'compose' )
                    {
                    // InternalAlf.g:3544:4: (lv_isComposite_1_0= 'compose' )
                    // InternalAlf.g:3545:5: lv_isComposite_1_0= 'compose'
                    {
                    lv_isComposite_1_0=(Token)match(input,42,FOLLOW_58); 

                    					newLeafNode(lv_isComposite_1_0, grammarAccess.getTypePartAccess().getIsCompositeComposeKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypePartRule());
                    					}
                    					setWithLastConsumed(current, "isComposite", true, "compose");
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:3557:3: ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=RULE_ID && LA67_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt67=1;
            }
            else if ( (LA67_0==43) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalAlf.g:3558:4: ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) )
                    {
                    // InternalAlf.g:3558:4: ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) )
                    // InternalAlf.g:3559:5: (lv_ownedRelationship_2_0= ruleFeatureTyping )
                    {
                    // InternalAlf.g:3559:5: (lv_ownedRelationship_2_0= ruleFeatureTyping )
                    // InternalAlf.g:3560:6: lv_ownedRelationship_2_0= ruleFeatureTyping
                    {

                    						newCompositeNode(grammarAccess.getTypePartAccess().getOwnedRelationshipFeatureTypingParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
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
                    // InternalAlf.g:3578:4: otherlv_3= 'any'
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTypePartAccess().getAnyKeyword_2_1());
                    			

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
    // $ANTLR end "ruleTypePart"


    // $ANTLR start "entryRuleFeatureTyping"
    // InternalAlf.g:3587:1: entryRuleFeatureTyping returns [EObject current=null] : iv_ruleFeatureTyping= ruleFeatureTyping EOF ;
    public final EObject entryRuleFeatureTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureTyping = null;


        try {
            // InternalAlf.g:3587:54: (iv_ruleFeatureTyping= ruleFeatureTyping EOF )
            // InternalAlf.g:3588:2: iv_ruleFeatureTyping= ruleFeatureTyping EOF
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
    // InternalAlf.g:3594:1: ruleFeatureTyping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleFeatureTyping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:3600:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:3601:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:3601:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3602:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:3602:3: ( ruleQualifiedName )
            // InternalAlf.g:3603:4: ruleQualifiedName
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
    // InternalAlf.g:3620:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalAlf.g:3620:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalAlf.g:3621:2: iv_ruleMultiplicity= ruleMultiplicity EOF
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
    // InternalAlf.g:3627:1: ruleMultiplicity returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lower_1_0 = null;

        EObject lv_upper_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3633:2: ( (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ) )
            // InternalAlf.g:3634:2: (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' )
            {
            // InternalAlf.g:3634:2: (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' )
            // InternalAlf.g:3635:3: otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAlf.g:3639:3: ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_NATURAL_VALUE) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==45) ) {
                    alt68=1;
                }
            }
            switch (alt68) {
                case 1 :
                    // InternalAlf.g:3640:4: ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..'
                    {
                    // InternalAlf.g:3640:4: ( (lv_lower_1_0= ruleNaturalLiteralExpression ) )
                    // InternalAlf.g:3641:5: (lv_lower_1_0= ruleNaturalLiteralExpression )
                    {
                    // InternalAlf.g:3641:5: (lv_lower_1_0= ruleNaturalLiteralExpression )
                    // InternalAlf.g:3642:6: lv_lower_1_0= ruleNaturalLiteralExpression
                    {

                    						newCompositeNode(grammarAccess.getMultiplicityAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_60);
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

                    otherlv_2=(Token)match(input,45,FOLLOW_59); 

                    				newLeafNode(otherlv_2, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalAlf.g:3664:3: ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:3665:4: (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:3665:4: (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:3666:5: lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression
            {

            					newCompositeNode(grammarAccess.getMultiplicityAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_61);
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

            otherlv_4=(Token)match(input,46,FOLLOW_2); 

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


    // $ANTLR start "ruleSubsets"
    // InternalAlf.g:3692:1: ruleSubsets[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'subsets' ( (lv_ownedRelationship_1_0= ruleSubset ) ) ( (lv_ownedRelationship_2_0= ruleSubset ) )* ) ;
    public final EObject ruleSubsets(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3698:2: ( (otherlv_0= 'subsets' ( (lv_ownedRelationship_1_0= ruleSubset ) ) ( (lv_ownedRelationship_2_0= ruleSubset ) )* ) )
            // InternalAlf.g:3699:2: (otherlv_0= 'subsets' ( (lv_ownedRelationship_1_0= ruleSubset ) ) ( (lv_ownedRelationship_2_0= ruleSubset ) )* )
            {
            // InternalAlf.g:3699:2: (otherlv_0= 'subsets' ( (lv_ownedRelationship_1_0= ruleSubset ) ) ( (lv_ownedRelationship_2_0= ruleSubset ) )* )
            // InternalAlf.g:3700:3: otherlv_0= 'subsets' ( (lv_ownedRelationship_1_0= ruleSubset ) ) ( (lv_ownedRelationship_2_0= ruleSubset ) )*
            {
            otherlv_0=(Token)match(input,47,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSubsetsAccess().getSubsetsKeyword_0());
            		
            // InternalAlf.g:3704:3: ( (lv_ownedRelationship_1_0= ruleSubset ) )
            // InternalAlf.g:3705:4: (lv_ownedRelationship_1_0= ruleSubset )
            {
            // InternalAlf.g:3705:4: (lv_ownedRelationship_1_0= ruleSubset )
            // InternalAlf.g:3706:5: lv_ownedRelationship_1_0= ruleSubset
            {

            					newCompositeNode(grammarAccess.getSubsetsAccess().getOwnedRelationshipSubsetParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_62);
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

            // InternalAlf.g:3723:3: ( (lv_ownedRelationship_2_0= ruleSubset ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( ((LA69_0>=RULE_ID && LA69_0<=RULE_UNRESTRICTED_NAME)) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalAlf.g:3724:4: (lv_ownedRelationship_2_0= ruleSubset )
            	    {
            	    // InternalAlf.g:3724:4: (lv_ownedRelationship_2_0= ruleSubset )
            	    // InternalAlf.g:3725:5: lv_ownedRelationship_2_0= ruleSubset
            	    {

            	    					newCompositeNode(grammarAccess.getSubsetsAccess().getOwnedRelationshipSubsetParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_62);
            	    lv_ownedRelationship_2_0=ruleSubset();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubsetsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedRelationship",
            	    						lv_ownedRelationship_2_0,
            	    						"org.omg.sysml.Alf.Subset");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
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
    // $ANTLR end "ruleSubsets"


    // $ANTLR start "entryRuleSubset"
    // InternalAlf.g:3746:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalAlf.g:3746:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalAlf.g:3747:2: iv_ruleSubset= ruleSubset EOF
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
    // InternalAlf.g:3753:1: ruleSubset returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubset() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:3759:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:3760:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:3760:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3761:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:3761:3: ( ruleQualifiedName )
            // InternalAlf.g:3762:4: ruleQualifiedName
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


    // $ANTLR start "ruleRedefinitions"
    // InternalAlf.g:3780:1: ruleRedefinitions[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) ( (lv_ownedRelationship_2_0= ruleRedefinition ) )* ) ;
    public final EObject ruleRedefinitions(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_ownedRelationship_1_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3786:2: ( (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) ( (lv_ownedRelationship_2_0= ruleRedefinition ) )* ) )
            // InternalAlf.g:3787:2: (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) ( (lv_ownedRelationship_2_0= ruleRedefinition ) )* )
            {
            // InternalAlf.g:3787:2: (otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) ( (lv_ownedRelationship_2_0= ruleRedefinition ) )* )
            // InternalAlf.g:3788:3: otherlv_0= 'redefines' ( (lv_ownedRelationship_1_0= ruleRedefinition ) ) ( (lv_ownedRelationship_2_0= ruleRedefinition ) )*
            {
            otherlv_0=(Token)match(input,48,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRedefinitionsAccess().getRedefinesKeyword_0());
            		
            // InternalAlf.g:3792:3: ( (lv_ownedRelationship_1_0= ruleRedefinition ) )
            // InternalAlf.g:3793:4: (lv_ownedRelationship_1_0= ruleRedefinition )
            {
            // InternalAlf.g:3793:4: (lv_ownedRelationship_1_0= ruleRedefinition )
            // InternalAlf.g:3794:5: lv_ownedRelationship_1_0= ruleRedefinition
            {

            					newCompositeNode(grammarAccess.getRedefinitionsAccess().getOwnedRelationshipRedefinitionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_62);
            lv_ownedRelationship_1_0=ruleRedefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRedefinitionsRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_1_0,
            						"org.omg.sysml.Alf.Redefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:3811:3: ( (lv_ownedRelationship_2_0= ruleRedefinition ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( ((LA70_0>=RULE_ID && LA70_0<=RULE_UNRESTRICTED_NAME)) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalAlf.g:3812:4: (lv_ownedRelationship_2_0= ruleRedefinition )
            	    {
            	    // InternalAlf.g:3812:4: (lv_ownedRelationship_2_0= ruleRedefinition )
            	    // InternalAlf.g:3813:5: lv_ownedRelationship_2_0= ruleRedefinition
            	    {

            	    					newCompositeNode(grammarAccess.getRedefinitionsAccess().getOwnedRelationshipRedefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_62);
            	    lv_ownedRelationship_2_0=ruleRedefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRedefinitionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedRelationship",
            	    						lv_ownedRelationship_2_0,
            	    						"org.omg.sysml.Alf.Redefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
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
    // $ANTLR end "ruleRedefinitions"


    // $ANTLR start "entryRuleRedefinition"
    // InternalAlf.g:3834:1: entryRuleRedefinition returns [EObject current=null] : iv_ruleRedefinition= ruleRedefinition EOF ;
    public final EObject entryRuleRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefinition = null;


        try {
            // InternalAlf.g:3834:53: (iv_ruleRedefinition= ruleRedefinition EOF )
            // InternalAlf.g:3835:2: iv_ruleRedefinition= ruleRedefinition EOF
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
    // InternalAlf.g:3841:1: ruleRedefinition returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleRedefinition() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:3847:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:3848:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:3848:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3849:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:3849:3: ( ruleQualifiedName )
            // InternalAlf.g:3850:4: ruleQualifiedName
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
    // InternalAlf.g:3867:1: entryRuleConnectorDefinition returns [EObject current=null] : iv_ruleConnectorDefinition= ruleConnectorDefinition EOF ;
    public final EObject entryRuleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorDefinition = null;


        try {
            // InternalAlf.g:3867:60: (iv_ruleConnectorDefinition= ruleConnectorDefinition EOF )
            // InternalAlf.g:3868:2: iv_ruleConnectorDefinition= ruleConnectorDefinition EOF
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
    // InternalAlf.g:3874:1: ruleConnectorDefinition returns [EObject current=null] : ( ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) ) this_CategoryBody_17= ruleCategoryBody[$current] ) ;
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
            // InternalAlf.g:3880:2: ( ( ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) ) this_CategoryBody_17= ruleCategoryBody[$current] ) )
            // InternalAlf.g:3881:2: ( ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) ) this_CategoryBody_17= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:3881:2: ( ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) ) this_CategoryBody_17= ruleCategoryBody[$current] )
            // InternalAlf.g:3882:3: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) ) this_CategoryBody_17= ruleCategoryBody[$current]
            {
            // InternalAlf.g:3882:3: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) )
            int alt77=2;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // InternalAlf.g:3883:4: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) )
                    {
                    // InternalAlf.g:3883:4: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) )
                    // InternalAlf.g:3884:5: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) )
                    {
                    // InternalAlf.g:3884:5: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )?
                    int alt73=2;
                    alt73 = dfa73.predict(input);
                    switch (alt73) {
                        case 1 :
                            // InternalAlf.g:3885:6: ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is'
                            {
                            // InternalAlf.g:3885:6: ( (lv_name_0_0= ruleName ) )?
                            int alt71=2;
                            int LA71_0 = input.LA(1);

                            if ( ((LA71_0>=RULE_ID && LA71_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt71=1;
                            }
                            switch (alt71) {
                                case 1 :
                                    // InternalAlf.g:3886:7: (lv_name_0_0= ruleName )
                                    {
                                    // InternalAlf.g:3886:7: (lv_name_0_0= ruleName )
                                    // InternalAlf.g:3887:8: lv_name_0_0= ruleName
                                    {

                                    								newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_0_0_0_0_0());
                                    							
                                    pushFollow(FOLLOW_63);
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

                            // InternalAlf.g:3904:6: (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )?
                            int alt72=2;
                            int LA72_0 = input.LA(1);

                            if ( (LA72_0==41) ) {
                                alt72=1;
                            }
                            switch (alt72) {
                                case 1 :
                                    // InternalAlf.g:3905:7: otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) )
                                    {
                                    otherlv_1=(Token)match(input,41,FOLLOW_13); 

                                    							newLeafNode(otherlv_1, grammarAccess.getConnectorDefinitionAccess().getColonKeyword_0_0_0_1_0());
                                    						
                                    // InternalAlf.g:3909:7: ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) )
                                    // InternalAlf.g:3910:8: (lv_ownedRelationship_2_0= ruleConnectorTyping )
                                    {
                                    // InternalAlf.g:3910:8: (lv_ownedRelationship_2_0= ruleConnectorTyping )
                                    // InternalAlf.g:3911:9: lv_ownedRelationship_2_0= ruleConnectorTyping
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

                            otherlv_3=(Token)match(input,25,FOLLOW_64); 

                            						newLeafNode(otherlv_3, grammarAccess.getConnectorDefinitionAccess().getIsKeyword_0_0_0_2());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:3934:5: ( (lv_connectorEnd_4_0= ruleConnectorEnd ) )
                    // InternalAlf.g:3935:6: (lv_connectorEnd_4_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:3935:6: (lv_connectorEnd_4_0= ruleConnectorEnd )
                    // InternalAlf.g:3936:7: lv_connectorEnd_4_0= ruleConnectorEnd
                    {

                    							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_0_0_1_0());
                    						
                    pushFollow(FOLLOW_65);
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

                    otherlv_5=(Token)match(input,49,FOLLOW_64); 

                    					newLeafNode(otherlv_5, grammarAccess.getConnectorDefinitionAccess().getToKeyword_0_0_2());
                    				
                    // InternalAlf.g:3957:5: ( (lv_connectorEnd_6_0= ruleConnectorEnd ) )
                    // InternalAlf.g:3958:6: (lv_connectorEnd_6_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:3958:6: (lv_connectorEnd_6_0= ruleConnectorEnd )
                    // InternalAlf.g:3959:7: lv_connectorEnd_6_0= ruleConnectorEnd
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
                    // InternalAlf.g:3978:4: ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' )
                    {
                    // InternalAlf.g:3978:4: ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' )
                    // InternalAlf.g:3979:5: ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')'
                    {
                    // InternalAlf.g:3979:5: ( (lv_name_7_0= ruleName ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( ((LA74_0>=RULE_ID && LA74_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalAlf.g:3980:6: (lv_name_7_0= ruleName )
                            {
                            // InternalAlf.g:3980:6: (lv_name_7_0= ruleName )
                            // InternalAlf.g:3981:7: lv_name_7_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_0_1_0_0());
                            						
                            pushFollow(FOLLOW_66);
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

                    // InternalAlf.g:3998:5: (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==41) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalAlf.g:3999:6: otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) )
                            {
                            otherlv_8=(Token)match(input,41,FOLLOW_13); 

                            						newLeafNode(otherlv_8, grammarAccess.getConnectorDefinitionAccess().getColonKeyword_0_1_1_0());
                            					
                            // InternalAlf.g:4003:6: ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) )
                            // InternalAlf.g:4004:7: (lv_ownedRelationship_9_0= ruleConnectorTyping )
                            {
                            // InternalAlf.g:4004:7: (lv_ownedRelationship_9_0= ruleConnectorTyping )
                            // InternalAlf.g:4005:8: lv_ownedRelationship_9_0= ruleConnectorTyping
                            {

                            								newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getOwnedRelationshipConnectorTypingParserRuleCall_0_1_1_1_0());
                            							
                            pushFollow(FOLLOW_67);
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

                    otherlv_10=(Token)match(input,50,FOLLOW_64); 

                    					newLeafNode(otherlv_10, grammarAccess.getConnectorDefinitionAccess().getLeftParenthesisKeyword_0_1_2());
                    				
                    // InternalAlf.g:4027:5: ( (lv_connectorEnd_11_0= ruleConnectorEnd ) )
                    // InternalAlf.g:4028:6: (lv_connectorEnd_11_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:4028:6: (lv_connectorEnd_11_0= ruleConnectorEnd )
                    // InternalAlf.g:4029:7: lv_connectorEnd_11_0= ruleConnectorEnd
                    {

                    							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_0_1_3_0());
                    						
                    pushFollow(FOLLOW_68);
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

                    otherlv_12=(Token)match(input,36,FOLLOW_64); 

                    					newLeafNode(otherlv_12, grammarAccess.getConnectorDefinitionAccess().getCommaKeyword_0_1_4());
                    				
                    // InternalAlf.g:4050:5: ( (lv_connectorEnd_13_0= ruleConnectorEnd ) )
                    // InternalAlf.g:4051:6: (lv_connectorEnd_13_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:4051:6: (lv_connectorEnd_13_0= ruleConnectorEnd )
                    // InternalAlf.g:4052:7: lv_connectorEnd_13_0= ruleConnectorEnd
                    {

                    							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_0_1_5_0());
                    						
                    pushFollow(FOLLOW_69);
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

                    // InternalAlf.g:4069:5: (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==36) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalAlf.g:4070:6: otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) )
                    	    {
                    	    otherlv_14=(Token)match(input,36,FOLLOW_64); 

                    	    						newLeafNode(otherlv_14, grammarAccess.getConnectorDefinitionAccess().getCommaKeyword_0_1_6_0());
                    	    					
                    	    // InternalAlf.g:4074:6: ( (lv_connectorEnd_15_0= ruleConnectorEnd ) )
                    	    // InternalAlf.g:4075:7: (lv_connectorEnd_15_0= ruleConnectorEnd )
                    	    {
                    	    // InternalAlf.g:4075:7: (lv_connectorEnd_15_0= ruleConnectorEnd )
                    	    // InternalAlf.g:4076:8: lv_connectorEnd_15_0= ruleConnectorEnd
                    	    {

                    	    								newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_0_1_6_1_0());
                    	    							
                    	    pushFollow(FOLLOW_69);
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
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,51,FOLLOW_35); 

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
    // InternalAlf.g:4115:1: entryRuleConnectorTyping returns [EObject current=null] : iv_ruleConnectorTyping= ruleConnectorTyping EOF ;
    public final EObject entryRuleConnectorTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorTyping = null;


        try {
            // InternalAlf.g:4115:56: (iv_ruleConnectorTyping= ruleConnectorTyping EOF )
            // InternalAlf.g:4116:2: iv_ruleConnectorTyping= ruleConnectorTyping EOF
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
    // InternalAlf.g:4122:1: ruleConnectorTyping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleConnectorTyping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:4128:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:4129:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:4129:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4130:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:4130:3: ( ruleQualifiedName )
            // InternalAlf.g:4131:4: ruleQualifiedName
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
    // InternalAlf.g:4148:1: entryRuleConnectorEnd returns [EObject current=null] : iv_ruleConnectorEnd= ruleConnectorEnd EOF ;
    public final EObject entryRuleConnectorEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorEnd = null;


        try {
            // InternalAlf.g:4148:53: (iv_ruleConnectorEnd= ruleConnectorEnd EOF )
            // InternalAlf.g:4149:2: iv_ruleConnectorEnd= ruleConnectorEnd EOF
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
    // InternalAlf.g:4155:1: ruleConnectorEnd returns [EObject current=null] : ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleConnectorEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_multiplicity_3_0 = null;

        EObject lv_multiplicity_5_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4161:2: ( ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) ) )
            // InternalAlf.g:4162:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )
            {
            // InternalAlf.g:4162:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )
            int alt81=2;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // InternalAlf.g:4163:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? )
                    {
                    // InternalAlf.g:4163:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? )
                    // InternalAlf.g:4164:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )?
                    {
                    // InternalAlf.g:4164:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )?
                    int alt78=2;
                    alt78 = dfa78.predict(input);
                    switch (alt78) {
                        case 1 :
                            // InternalAlf.g:4165:5: ( ( ruleQualifiedName ) ) otherlv_1= ':'
                            {
                            // InternalAlf.g:4165:5: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:4166:6: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:4166:6: ( ruleQualifiedName )
                            // InternalAlf.g:4167:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConnectorEndRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getConnectorEndAccess().getEndFeatureCrossReference_0_0_0_0());
                            						
                            pushFollow(FOLLOW_70);
                            ruleQualifiedName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_1=(Token)match(input,41,FOLLOW_13); 

                            					newLeafNode(otherlv_1, grammarAccess.getConnectorEndAccess().getColonKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:4186:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:4187:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:4187:5: ( ruleQualifiedName )
                    // InternalAlf.g:4188:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectorEndRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConnectorEndAccess().getFeatureFeatureCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_71);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:4202:4: ( (lv_multiplicity_3_0= ruleMultiplicity ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==44) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalAlf.g:4203:5: (lv_multiplicity_3_0= ruleMultiplicity )
                            {
                            // InternalAlf.g:4203:5: (lv_multiplicity_3_0= ruleMultiplicity )
                            // InternalAlf.g:4204:6: lv_multiplicity_3_0= ruleMultiplicity
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
                    // InternalAlf.g:4223:3: ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalAlf.g:4223:3: ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) )
                    // InternalAlf.g:4224:4: ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) )
                    {
                    // InternalAlf.g:4224:4: ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' )
                    // InternalAlf.g:4225:5: ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>'
                    {
                    // InternalAlf.g:4225:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:4226:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:4226:6: ( ruleQualifiedName )
                    // InternalAlf.g:4227:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConnectorEndRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getConnectorEndAccess().getEndFeatureCrossReference_1_0_0_0());
                    						
                    pushFollow(FOLLOW_72);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:4241:5: ( (lv_multiplicity_5_0= ruleMultiplicity ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==44) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalAlf.g:4242:6: (lv_multiplicity_5_0= ruleMultiplicity )
                            {
                            // InternalAlf.g:4242:6: (lv_multiplicity_5_0= ruleMultiplicity )
                            // InternalAlf.g:4243:7: lv_multiplicity_5_0= ruleMultiplicity
                            {

                            							newCompositeNode(grammarAccess.getConnectorEndAccess().getMultiplicityMultiplicityParserRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_73);
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

                    otherlv_6=(Token)match(input,52,FOLLOW_13); 

                    					newLeafNode(otherlv_6, grammarAccess.getConnectorEndAccess().getEqualsSignGreaterThanSignKeyword_1_0_2());
                    				

                    }

                    // InternalAlf.g:4265:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:4266:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:4266:5: ( ruleQualifiedName )
                    // InternalAlf.g:4267:6: ruleQualifiedName
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


    // $ANTLR start "entryRuleExpression"
    // InternalAlf.g:4286:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAlf.g:4286:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAlf.g:4287:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAlf.g:4293:1: ruleExpression returns [EObject current=null] : this_BinaryExpression_0= ruleBinaryExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4299:2: (this_BinaryExpression_0= ruleBinaryExpression )
            // InternalAlf.g:4300:2: this_BinaryExpression_0= ruleBinaryExpression
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
    // InternalAlf.g:4311:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalAlf.g:4311:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalAlf.g:4312:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalAlf.g:4318:1: ruleBinaryExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) ;
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
            // InternalAlf.g:4324:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) )
            // InternalAlf.g:4325:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            {
            // InternalAlf.g:4325:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            // InternalAlf.g:4326:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            {

            			newCompositeNode(grammarAccess.getBinaryExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_74);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:4334:3: ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==19||(LA83_0>=53 && LA83_0<=57)) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalAlf.g:4335:4: () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    {
                    // InternalAlf.g:4335:4: ()
                    // InternalAlf.g:4336:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:4342:4: ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==19||(LA82_0>=54 && LA82_0<=57)) ) {
                        alt82=1;
                    }
                    else if ( (LA82_0==53) ) {
                        alt82=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 0, input);

                        throw nvae;
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalAlf.g:4343:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            {
                            // InternalAlf.g:4343:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            // InternalAlf.g:4344:6: ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) )
                            {
                            // InternalAlf.g:4344:6: ( (lv_operator_2_0= ruleBinaryOperator ) )
                            // InternalAlf.g:4345:7: (lv_operator_2_0= ruleBinaryOperator )
                            {
                            // InternalAlf.g:4345:7: (lv_operator_2_0= ruleBinaryOperator )
                            // InternalAlf.g:4346:8: lv_operator_2_0= ruleBinaryOperator
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorParserRuleCall_1_1_0_0_0());
                            							
                            pushFollow(FOLLOW_56);
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

                            // InternalAlf.g:4363:6: ( (lv_operand_3_0= ruleExpression ) )
                            // InternalAlf.g:4364:7: (lv_operand_3_0= ruleExpression )
                            {
                            // InternalAlf.g:4364:7: (lv_operand_3_0= ruleExpression )
                            // InternalAlf.g:4365:8: lv_operand_3_0= ruleExpression
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
                            // InternalAlf.g:4384:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            {
                            // InternalAlf.g:4384:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            // InternalAlf.g:4385:6: ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']'
                            {
                            // InternalAlf.g:4385:6: ( (lv_operator_4_0= '@' ) )
                            // InternalAlf.g:4386:7: (lv_operator_4_0= '@' )
                            {
                            // InternalAlf.g:4386:7: (lv_operator_4_0= '@' )
                            // InternalAlf.g:4387:8: lv_operator_4_0= '@'
                            {
                            lv_operator_4_0=(Token)match(input,53,FOLLOW_75); 

                            								newLeafNode(lv_operator_4_0, grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getBinaryExpressionRule());
                            								}
                            								setWithLastConsumed(current, "operator", lv_operator_4_0, "@");
                            							

                            }


                            }

                            otherlv_5=(Token)match(input,44,FOLLOW_56); 

                            						newLeafNode(otherlv_5, grammarAccess.getBinaryExpressionAccess().getLeftSquareBracketKeyword_1_1_1_1());
                            					
                            // InternalAlf.g:4403:6: ( (lv_operand_6_0= ruleExpression ) )
                            // InternalAlf.g:4404:7: (lv_operand_6_0= ruleExpression )
                            {
                            // InternalAlf.g:4404:7: (lv_operand_6_0= ruleExpression )
                            // InternalAlf.g:4405:8: lv_operand_6_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperandExpressionParserRuleCall_1_1_1_2_0());
                            							
                            pushFollow(FOLLOW_61);
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

                            otherlv_7=(Token)match(input,46,FOLLOW_2); 

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
    // InternalAlf.g:4433:1: entryRuleBinaryOperator returns [String current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final String entryRuleBinaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperator = null;


        try {
            // InternalAlf.g:4433:54: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // InternalAlf.g:4434:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
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
    // InternalAlf.g:4440:1: ruleBinaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:4446:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) )
            // InternalAlf.g:4447:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            {
            // InternalAlf.g:4447:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            int alt84=5;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt84=1;
                }
                break;
            case 55:
                {
                alt84=2;
                }
                break;
            case 19:
                {
                alt84=3;
                }
                break;
            case 56:
                {
                alt84=4;
                }
                break;
            case 57:
                {
                alt84=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalAlf.g:4448:3: kw= '+'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:4454:3: kw= '-'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:4460:3: kw= '*'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:4466:3: kw= '/'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:4472:3: kw= '^'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getCircumflexAccentKeyword_4());
                    		

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
    // InternalAlf.g:4481:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlf.g:4481:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlf.g:4482:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalAlf.g:4488:1: ruleUnaryExpression returns [EObject current=null] : (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceAccessExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4494:2: ( (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) )
            // InternalAlf.g:4495:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            {
            // InternalAlf.g:4495:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=RULE_BOOLEAN_VALUE && LA85_0<=RULE_UNRESTRICTED_NAME)||(LA85_0>=18 && LA85_0<=19)||LA85_0==23||LA85_0==50||LA85_0==58) ) {
                alt85=1;
            }
            else if ( ((LA85_0>=54 && LA85_0<=55)) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalAlf.g:4496:3: this_SequenceAccessExpression_0= ruleSequenceAccessExpression
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
                    // InternalAlf.g:4505:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    {
                    // InternalAlf.g:4505:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    // InternalAlf.g:4506:4: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    {
                    // InternalAlf.g:4506:4: ()
                    // InternalAlf.g:4507:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:4513:4: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // InternalAlf.g:4514:5: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // InternalAlf.g:4514:5: (lv_operator_2_0= ruleUnaryOperator )
                    // InternalAlf.g:4515:6: lv_operator_2_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_76);
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

                    // InternalAlf.g:4532:4: ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    // InternalAlf.g:4533:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    {
                    // InternalAlf.g:4533:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    // InternalAlf.g:4534:6: lv_operand_3_0= ruleSequenceAccessExpression
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
    // InternalAlf.g:4556:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalAlf.g:4556:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalAlf.g:4557:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalAlf.g:4563:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:4569:2: ( (kw= '+' | kw= '-' ) )
            // InternalAlf.g:4570:2: (kw= '+' | kw= '-' )
            {
            // InternalAlf.g:4570:2: (kw= '+' | kw= '-' )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==54) ) {
                alt86=1;
            }
            else if ( (LA86_0==55) ) {
                alt86=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalAlf.g:4571:3: kw= '+'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:4577:3: kw= '-'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

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
    // InternalAlf.g:4586:1: entryRuleSequenceAccessExpression returns [EObject current=null] : iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF ;
    public final EObject entryRuleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceAccessExpression = null;


        try {
            // InternalAlf.g:4586:65: (iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF )
            // InternalAlf.g:4587:2: iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF
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
    // InternalAlf.g:4593:1: ruleSequenceAccessExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) ;
    public final EObject ruleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_index_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4599:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) )
            // InternalAlf.g:4600:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            {
            // InternalAlf.g:4600:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            // InternalAlf.g:4601:3: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            {

            			newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_71);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:4609:3: ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==44) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalAlf.g:4610:4: () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    // InternalAlf.g:4610:4: ()
            	    // InternalAlf.g:4611:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSequenceAccessExpressionAccess().getSequenceAccessExpressionPrimaryAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_56); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSequenceAccessExpressionAccess().getLeftSquareBracketKeyword_1_1());
            	    			
            	    // InternalAlf.g:4621:4: ( (lv_index_3_0= ruleExpression ) )
            	    // InternalAlf.g:4622:5: (lv_index_3_0= ruleExpression )
            	    {
            	    // InternalAlf.g:4622:5: (lv_index_3_0= ruleExpression )
            	    // InternalAlf.g:4623:6: lv_index_3_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getIndexExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_61);
            	    lv_index_3_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSequenceAccessExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"index",
            	    							lv_index_3_0,
            	    							"org.omg.sysml.Alf.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,46,FOLLOW_71); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSequenceAccessExpressionAccess().getRightSquareBracketKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop87;
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
    // InternalAlf.g:4649:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalAlf.g:4649:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalAlf.g:4650:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalAlf.g:4656:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_LiteralExpression_0 = null;

        EObject this_ElementReferenceExpression_1 = null;

        EObject this_InstanceCreationExpression_2 = null;

        EObject this_SequenceConstructionExpression_3 = null;

        EObject this_Expression_5 = null;



        	enterRule();

        try {
            // InternalAlf.g:4662:2: ( (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // InternalAlf.g:4663:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // InternalAlf.g:4663:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt88=5;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // InternalAlf.g:4664:3: this_LiteralExpression_0= ruleLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralExpression_0=ruleLiteralExpression();

                    state._fsp--;


                    			current = this_LiteralExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:4673:3: this_ElementReferenceExpression_1= ruleElementReferenceExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getElementReferenceExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ElementReferenceExpression_1=ruleElementReferenceExpression();

                    state._fsp--;


                    			current = this_ElementReferenceExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:4682:3: this_InstanceCreationExpression_2= ruleInstanceCreationExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getInstanceCreationExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstanceCreationExpression_2=ruleInstanceCreationExpression();

                    state._fsp--;


                    			current = this_InstanceCreationExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:4691:3: this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSequenceConstructionExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceConstructionExpression_3=ruleSequenceConstructionExpression();

                    state._fsp--;


                    			current = this_SequenceConstructionExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:4700:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // InternalAlf.g:4700:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // InternalAlf.g:4701:4: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_56); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_77);
                    this_Expression_5=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_5;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_6=(Token)match(input,51,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_2());
                    			

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


    // $ANTLR start "entryRuleElementReferenceExpression"
    // InternalAlf.g:4722:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // InternalAlf.g:4722:67: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // InternalAlf.g:4723:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
            {
             newCompositeNode(grammarAccess.getElementReferenceExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementReferenceExpression=ruleElementReferenceExpression();

            state._fsp--;

             current =iv_ruleElementReferenceExpression; 
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
    // $ANTLR end "entryRuleElementReferenceExpression"


    // $ANTLR start "ruleElementReferenceExpression"
    // InternalAlf.g:4729:1: ruleElementReferenceExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleElementReferenceExpression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:4735:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:4736:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:4736:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4737:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:4737:3: ( ruleQualifiedName )
            // InternalAlf.g:4738:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getElementReferenceExpressionRule());
            				}
            			

            				newCompositeNode(grammarAccess.getElementReferenceExpressionAccess().getReferentElementCrossReference_0());
            			
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
    // $ANTLR end "ruleElementReferenceExpression"


    // $ANTLR start "entryRuleInstanceCreationExpression"
    // InternalAlf.g:4755:1: entryRuleInstanceCreationExpression returns [EObject current=null] : iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF ;
    public final EObject entryRuleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceCreationExpression = null;


        try {
            // InternalAlf.g:4755:67: (iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF )
            // InternalAlf.g:4756:2: iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF
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
    // InternalAlf.g:4762:1: ruleInstanceCreationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' ) ;
    public final EObject ruleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Tuple_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4768:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' ) )
            // InternalAlf.g:4769:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' )
            {
            // InternalAlf.g:4769:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' )
            // InternalAlf.g:4770:3: ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')'
            {
            // InternalAlf.g:4770:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4771:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:4771:4: ( ruleQualifiedName )
            // InternalAlf.g:4772:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceCreationExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getClassClassCrossReference_0_0());
            				
            pushFollow(FOLLOW_67);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,50,FOLLOW_78); 

            			newLeafNode(otherlv_1, grammarAccess.getInstanceCreationExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlf.g:4790:3: (this_Tuple_2= ruleTuple[$current] )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( ((LA89_0>=RULE_BOOLEAN_VALUE && LA89_0<=RULE_UNRESTRICTED_NAME)||(LA89_0>=18 && LA89_0<=19)||LA89_0==23||LA89_0==50||(LA89_0>=54 && LA89_0<=55)||LA89_0==58) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalAlf.g:4791:4: this_Tuple_2= ruleTuple[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getInstanceCreationExpressionRule());
                    				}
                    				newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getTupleParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_77);
                    this_Tuple_2=ruleTuple(current);

                    state._fsp--;


                    				current = this_Tuple_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,51,FOLLOW_2); 

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
    // InternalAlf.g:4812:1: ruleTuple[EObject in_current] returns [EObject current=in_current] : (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] ) ;
    public final EObject ruleTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_PositionalTuple_0 = null;

        EObject this_NamedTuple_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:4818:2: ( (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] ) )
            // InternalAlf.g:4819:2: (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] )
            {
            // InternalAlf.g:4819:2: (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] )
            int alt90=2;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN_VALUE:
            case RULE_STRING_VALUE:
            case RULE_NATURAL_VALUE:
            case RULE_EXP_VALUE:
            case 18:
            case 19:
            case 23:
            case 50:
            case 54:
            case 55:
            case 58:
                {
                alt90=1;
                }
                break;
            case RULE_ID:
                {
                int LA90_2 = input.LA(2);

                if ( ((LA90_2>=17 && LA90_2<=19)||LA90_2==36||LA90_2==44||(LA90_2>=50 && LA90_2<=51)||(LA90_2>=53 && LA90_2<=57)) ) {
                    alt90=1;
                }
                else if ( (LA90_2==52) ) {
                    alt90=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA90_3 = input.LA(2);

                if ( ((LA90_3>=17 && LA90_3<=19)||LA90_3==36||LA90_3==44||(LA90_3>=50 && LA90_3<=51)||(LA90_3>=53 && LA90_3<=57)) ) {
                    alt90=1;
                }
                else if ( (LA90_3==52) ) {
                    alt90=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalAlf.g:4820:3: this_PositionalTuple_0= rulePositionalTuple[$current]
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
                    // InternalAlf.g:4832:3: this_NamedTuple_1= ruleNamedTuple[$current]
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
    // InternalAlf.g:4848:1: rulePositionalTuple[EObject in_current] returns [EObject current=in_current] : ( ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )* ) ;
    public final EObject rulePositionalTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_argument_0_0 = null;

        EObject lv_argument_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4854:2: ( ( ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )* ) )
            // InternalAlf.g:4855:2: ( ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )* )
            {
            // InternalAlf.g:4855:2: ( ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )* )
            // InternalAlf.g:4856:3: ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )*
            {
            // InternalAlf.g:4856:3: ( (lv_argument_0_0= ruleExpression ) )
            // InternalAlf.g:4857:4: (lv_argument_0_0= ruleExpression )
            {
            // InternalAlf.g:4857:4: (lv_argument_0_0= ruleExpression )
            // InternalAlf.g:4858:5: lv_argument_0_0= ruleExpression
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

            // InternalAlf.g:4875:3: (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==36) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalAlf.g:4876:4: otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,36,FOLLOW_56); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPositionalTupleAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalAlf.g:4880:4: ( (lv_argument_2_0= ruleExpression ) )
            	    // InternalAlf.g:4881:5: (lv_argument_2_0= ruleExpression )
            	    {
            	    // InternalAlf.g:4881:5: (lv_argument_2_0= ruleExpression )
            	    // InternalAlf.g:4882:6: lv_argument_2_0= ruleExpression
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
            	    break loop91;
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
    // InternalAlf.g:4905:1: ruleNamedTuple[EObject in_current] returns [EObject current=in_current] : ( ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )* ) ;
    public final EObject ruleNamedTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_argument_2_0 = null;

        EObject lv_argument_6_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4911:2: ( ( ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )* ) )
            // InternalAlf.g:4912:2: ( ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )* )
            {
            // InternalAlf.g:4912:2: ( ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )* )
            // InternalAlf.g:4913:3: ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getNamedTupleAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_73);
            ruleName();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,52,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedTupleAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalAlf.g:4924:3: ( (lv_argument_2_0= ruleExpression ) )
            // InternalAlf.g:4925:4: (lv_argument_2_0= ruleExpression )
            {
            // InternalAlf.g:4925:4: (lv_argument_2_0= ruleExpression )
            // InternalAlf.g:4926:5: lv_argument_2_0= ruleExpression
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

            // InternalAlf.g:4943:3: (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==36) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalAlf.g:4944:4: otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,36,FOLLOW_13); 

            	    				newLeafNode(otherlv_3, grammarAccess.getNamedTupleAccess().getCommaKeyword_3_0());
            	    			

            	    				newCompositeNode(grammarAccess.getNamedTupleAccess().getNameParserRuleCall_3_1());
            	    			
            	    pushFollow(FOLLOW_73);
            	    ruleName();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    otherlv_5=(Token)match(input,52,FOLLOW_56); 

            	    				newLeafNode(otherlv_5, grammarAccess.getNamedTupleAccess().getEqualsSignGreaterThanSignKeyword_3_2());
            	    			
            	    // InternalAlf.g:4959:4: ( (lv_argument_6_0= ruleExpression ) )
            	    // InternalAlf.g:4960:5: (lv_argument_6_0= ruleExpression )
            	    {
            	    // InternalAlf.g:4960:5: (lv_argument_6_0= ruleExpression )
            	    // InternalAlf.g:4961:6: lv_argument_6_0= ruleExpression
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
    // $ANTLR end "ruleNamedTuple"


    // $ANTLR start "entryRuleSequenceConstructionExpression"
    // InternalAlf.g:4983:1: entryRuleSequenceConstructionExpression returns [EObject current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
    public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionExpression = null;


        try {
            // InternalAlf.g:4983:71: (iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:4984:2: iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF
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
    // InternalAlf.g:4990:1: ruleSequenceConstructionExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4996:2: ( ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalAlf.g:4997:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalAlf.g:4997:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // InternalAlf.g:4998:3: () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalAlf.g:4998:3: ()
            // InternalAlf.g:4999:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_79); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:5009:3: ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( ((LA94_0>=RULE_BOOLEAN_VALUE && LA94_0<=RULE_UNRESTRICTED_NAME)||(LA94_0>=18 && LA94_0<=19)||LA94_0==23||LA94_0==50||(LA94_0>=54 && LA94_0<=55)||LA94_0==58) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalAlf.g:5010:4: ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:5010:4: ( (lv_element_2_0= ruleExpression ) )
                    // InternalAlf.g:5011:5: (lv_element_2_0= ruleExpression )
                    {
                    // InternalAlf.g:5011:5: (lv_element_2_0= ruleExpression )
                    // InternalAlf.g:5012:6: lv_element_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_80);
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

                    // InternalAlf.g:5029:4: (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==36) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalAlf.g:5030:5: otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,36,FOLLOW_56); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:5034:5: ( (lv_element_4_0= ruleExpression ) )
                    	    // InternalAlf.g:5035:6: (lv_element_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:5035:6: (lv_element_4_0= ruleExpression )
                    	    // InternalAlf.g:5036:7: lv_element_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_80);
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
                    	    break loop93;
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


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalAlf.g:5063:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalAlf.g:5063:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalAlf.g:5064:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalAlf.g:5070:1: ruleLiteralExpression returns [EObject current=null] : (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteralExpression_0 = null;

        EObject this_BooleanLiteralExpression_1 = null;

        EObject this_StringLiteralExpression_2 = null;

        EObject this_RealLiteralExpression_3 = null;

        EObject this_UnlimitedNaturalLiteralExpression_4 = null;



        	enterRule();

        try {
            // InternalAlf.g:5076:2: ( (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:5077:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:5077:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            int alt95=5;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt95=1;
                }
                break;
            case RULE_BOOLEAN_VALUE:
                {
                alt95=2;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt95=3;
                }
                break;
            case RULE_NATURAL_VALUE:
                {
                int LA95_4 = input.LA(2);

                if ( (LA95_4==EOF||(LA95_4>=19 && LA95_4<=20)||(LA95_4>=23 && LA95_4<=24)||LA95_4==36||LA95_4==44||LA95_4==46||LA95_4==51||(LA95_4>=53 && LA95_4<=57)) ) {
                    alt95=5;
                }
                else if ( (LA95_4==18) ) {
                    alt95=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_EXP_VALUE:
            case 18:
                {
                alt95=4;
                }
                break;
            case 19:
                {
                alt95=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalAlf.g:5078:3: this_NullLiteralExpression_0= ruleNullLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getNullLiteralExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NullLiteralExpression_0=ruleNullLiteralExpression();

                    state._fsp--;


                    			current = this_NullLiteralExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:5087:3: this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getBooleanLiteralExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteralExpression_1=ruleBooleanLiteralExpression();

                    state._fsp--;


                    			current = this_BooleanLiteralExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:5096:3: this_StringLiteralExpression_2= ruleStringLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getStringLiteralExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteralExpression_2=ruleStringLiteralExpression();

                    state._fsp--;


                    			current = this_StringLiteralExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:5105:3: this_RealLiteralExpression_3= ruleRealLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getRealLiteralExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealLiteralExpression_3=ruleRealLiteralExpression();

                    state._fsp--;


                    			current = this_RealLiteralExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:5114:3: this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getUnlimitedNaturalLiteralExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnlimitedNaturalLiteralExpression_4=ruleUnlimitedNaturalLiteralExpression();

                    state._fsp--;


                    			current = this_UnlimitedNaturalLiteralExpression_4;
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


    // $ANTLR start "entryRuleNullLiteralExpression"
    // InternalAlf.g:5126:1: entryRuleNullLiteralExpression returns [EObject current=null] : iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF ;
    public final EObject entryRuleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpression = null;


        try {
            // InternalAlf.g:5126:62: (iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF )
            // InternalAlf.g:5127:2: iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getNullLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullLiteralExpression=ruleNullLiteralExpression();

            state._fsp--;

             current =iv_ruleNullLiteralExpression; 
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
    // $ANTLR end "entryRuleNullLiteralExpression"


    // $ANTLR start "ruleNullLiteralExpression"
    // InternalAlf.g:5133:1: ruleNullLiteralExpression returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlf.g:5139:2: ( ( () otherlv_1= 'null' ) )
            // InternalAlf.g:5140:2: ( () otherlv_1= 'null' )
            {
            // InternalAlf.g:5140:2: ( () otherlv_1= 'null' )
            // InternalAlf.g:5141:3: () otherlv_1= 'null'
            {
            // InternalAlf.g:5141:3: ()
            // InternalAlf.g:5142:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullLiteralExpressionAccess().getLiteralNullAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNullLiteralExpressionAccess().getNullKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullLiteralExpression"


    // $ANTLR start "entryRuleBooleanLiteralExpression"
    // InternalAlf.g:5156:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // InternalAlf.g:5156:65: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:5157:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
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
    // InternalAlf.g:5163:1: ruleBooleanLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:5169:2: ( ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) )
            // InternalAlf.g:5170:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            {
            // InternalAlf.g:5170:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:5171:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:5171:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            // InternalAlf.g:5172:4: lv_value_0_0= RULE_BOOLEAN_VALUE
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
    // InternalAlf.g:5191:1: entryRuleStringLiteralExpression returns [EObject current=null] : iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF ;
    public final EObject entryRuleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpression = null;


        try {
            // InternalAlf.g:5191:64: (iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF )
            // InternalAlf.g:5192:2: iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF
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
    // InternalAlf.g:5198:1: ruleStringLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:5204:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalAlf.g:5205:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalAlf.g:5205:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalAlf.g:5206:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalAlf.g:5206:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalAlf.g:5207:4: lv_value_0_0= RULE_STRING_VALUE
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
    // InternalAlf.g:5226:1: entryRuleRealLiteralExpression returns [EObject current=null] : iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF ;
    public final EObject entryRuleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteralExpression = null;


        try {
            // InternalAlf.g:5226:62: (iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF )
            // InternalAlf.g:5227:2: iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF
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
    // InternalAlf.g:5233:1: ruleRealLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5239:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalAlf.g:5240:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalAlf.g:5240:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalAlf.g:5241:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalAlf.g:5241:3: (lv_value_0_0= ruleRealValue )
            // InternalAlf.g:5242:4: lv_value_0_0= ruleRealValue
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
    // InternalAlf.g:5262:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalAlf.g:5262:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalAlf.g:5263:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalAlf.g:5269:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_VALUE_0=null;
        Token kw=null;
        Token this_NATURAL_VALUE_2=null;
        Token this_EXP_VALUE_3=null;
        Token this_EXP_VALUE_4=null;


        	enterRule();

        try {
            // InternalAlf.g:5275:2: ( ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE ) )
            // InternalAlf.g:5276:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            {
            // InternalAlf.g:5276:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) ) | this_EXP_VALUE_4= RULE_EXP_VALUE )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_NATURAL_VALUE||LA98_0==18) ) {
                alt98=1;
            }
            else if ( (LA98_0==RULE_EXP_VALUE) ) {
                alt98=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // InternalAlf.g:5277:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    {
                    // InternalAlf.g:5277:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE ) )
                    // InternalAlf.g:5278:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )? kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    {
                    // InternalAlf.g:5278:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==RULE_NATURAL_VALUE) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // InternalAlf.g:5279:5: this_NATURAL_VALUE_0= RULE_NATURAL_VALUE
                            {
                            this_NATURAL_VALUE_0=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_18); 

                            					current.merge(this_NATURAL_VALUE_0);
                            				

                            					newLeafNode(this_NATURAL_VALUE_0, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,18,FOLLOW_81); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1());
                    			
                    // InternalAlf.g:5292:4: (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE | this_EXP_VALUE_3= RULE_EXP_VALUE )
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==RULE_NATURAL_VALUE) ) {
                        alt97=1;
                    }
                    else if ( (LA97_0==RULE_EXP_VALUE) ) {
                        alt97=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 97, 0, input);

                        throw nvae;
                    }
                    switch (alt97) {
                        case 1 :
                            // InternalAlf.g:5293:5: this_NATURAL_VALUE_2= RULE_NATURAL_VALUE
                            {
                            this_NATURAL_VALUE_2=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_2); 

                            					current.merge(this_NATURAL_VALUE_2);
                            				

                            					newLeafNode(this_NATURAL_VALUE_2, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:5301:5: this_EXP_VALUE_3= RULE_EXP_VALUE
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
                    // InternalAlf.g:5311:3: this_EXP_VALUE_4= RULE_EXP_VALUE
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
    // InternalAlf.g:5322:1: entryRuleNaturalLiteralExpression returns [EObject current=null] : iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF ;
    public final EObject entryRuleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:5322:65: (iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:5323:2: iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF
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
    // InternalAlf.g:5329:1: ruleNaturalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) ;
    public final EObject ruleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:5335:2: ( ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) )
            // InternalAlf.g:5336:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            {
            // InternalAlf.g:5336:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            // InternalAlf.g:5337:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:5337:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            // InternalAlf.g:5338:4: lv_value_0_0= RULE_NATURAL_VALUE
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
    // InternalAlf.g:5357:1: entryRuleUnlimitedNaturalLiteralExpression returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:5357:74: (iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:5358:2: iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF
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
    // InternalAlf.g:5364:1: ruleUnlimitedNaturalLiteralExpression returns [EObject current=null] : (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NaturalLiteralExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5370:2: ( (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) )
            // InternalAlf.g:5371:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            {
            // InternalAlf.g:5371:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==RULE_NATURAL_VALUE) ) {
                alt99=1;
            }
            else if ( (LA99_0==19) ) {
                alt99=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // InternalAlf.g:5372:3: this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression
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
                    // InternalAlf.g:5381:3: ( () otherlv_2= '*' )
                    {
                    // InternalAlf.g:5381:3: ( () otherlv_2= '*' )
                    // InternalAlf.g:5382:4: () otherlv_2= '*'
                    {
                    // InternalAlf.g:5382:4: ()
                    // InternalAlf.g:5383:5: 
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
    // InternalAlf.g:5398:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAlf.g:5398:44: (iv_ruleName= ruleName EOF )
            // InternalAlf.g:5399:2: iv_ruleName= ruleName EOF
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
    // InternalAlf.g:5405:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalAlf.g:5411:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalAlf.g:5412:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalAlf.g:5412:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==RULE_ID) ) {
                alt100=1;
            }
            else if ( (LA100_0==RULE_UNRESTRICTED_NAME) ) {
                alt100=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // InternalAlf.g:5413:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:5421:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:5432:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlf.g:5432:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlf.g:5433:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlf.g:5439:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_ColonQualifiedName_1 = null;

        AntlrDatatypeRuleToken this_DotQualifiedName_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:5445:2: ( (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) )
            // InternalAlf.g:5446:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            {
            // InternalAlf.g:5446:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            int alt101=3;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case RULE_UNRESTRICTED_NAME:
                case 19:
                case 20:
                case 21:
                case 23:
                case 24:
                case 25:
                case 36:
                case 38:
                case 39:
                case 40:
                case 41:
                case 44:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    {
                    alt101=1;
                    }
                    break;
                case 18:
                    {
                    alt101=3;
                    }
                    break;
                case 17:
                    {
                    alt101=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 101, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA101_0==RULE_UNRESTRICTED_NAME) ) {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt101=3;
                    }
                    break;
                case 17:
                    {
                    alt101=2;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_UNRESTRICTED_NAME:
                case 19:
                case 20:
                case 21:
                case 23:
                case 24:
                case 25:
                case 36:
                case 38:
                case 39:
                case 40:
                case 41:
                case 44:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    {
                    alt101=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 101, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // InternalAlf.g:5447:3: this_Name_0= ruleName
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
                    // InternalAlf.g:5458:3: this_ColonQualifiedName_1= ruleColonQualifiedName
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
                    // InternalAlf.g:5469:3: this_DotQualifiedName_2= ruleDotQualifiedName
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
    // InternalAlf.g:5483:1: entryRuleColonQualifiedName returns [String current=null] : iv_ruleColonQualifiedName= ruleColonQualifiedName EOF ;
    public final String entryRuleColonQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColonQualifiedName = null;


        try {
            // InternalAlf.g:5483:58: (iv_ruleColonQualifiedName= ruleColonQualifiedName EOF )
            // InternalAlf.g:5484:2: iv_ruleColonQualifiedName= ruleColonQualifiedName EOF
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
    // InternalAlf.g:5490:1: ruleColonQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleColonQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:5496:2: ( (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:5497:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:5497:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            // InternalAlf.g:5498:3: this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:5508:3: (kw= '::' this_Name_2= ruleName )+
            int cnt102=0;
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==17) ) {
                    int LA102_1 = input.LA(2);

                    if ( ((LA102_1>=RULE_ID && LA102_1<=RULE_UNRESTRICTED_NAME)) ) {
                        alt102=1;
                    }


                }


                switch (alt102) {
            	case 1 :
            	    // InternalAlf.g:5509:4: kw= '::' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,17,FOLLOW_13); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getColonQualifiedNameAccess().getColonColonKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_82);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt102 >= 1 ) break loop102;
                        EarlyExitException eee =
                            new EarlyExitException(102, input);
                        throw eee;
                }
                cnt102++;
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
    // InternalAlf.g:5529:1: entryRuleDotQualifiedName returns [String current=null] : iv_ruleDotQualifiedName= ruleDotQualifiedName EOF ;
    public final String entryRuleDotQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDotQualifiedName = null;


        try {
            // InternalAlf.g:5529:56: (iv_ruleDotQualifiedName= ruleDotQualifiedName EOF )
            // InternalAlf.g:5530:2: iv_ruleDotQualifiedName= ruleDotQualifiedName EOF
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
    // InternalAlf.g:5536:1: ruleDotQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleDotQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:5542:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:5543:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:5543:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            // InternalAlf.g:5544:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:5554:3: (kw= '.' this_Name_2= ruleName )+
            int cnt103=0;
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==18) ) {
                    int LA103_1 = input.LA(2);

                    if ( ((LA103_1>=RULE_ID && LA103_1<=RULE_UNRESTRICTED_NAME)) ) {
                        alt103=1;
                    }


                }


                switch (alt103) {
            	case 1 :
            	    // InternalAlf.g:5555:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,18,FOLLOW_13); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getDotQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_83);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt103 >= 1 ) break loop103;
                        EarlyExitException eee =
                            new EarlyExitException(103, input);
                        throw eee;
                }
                cnt103++;
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
    // InternalAlf.g:5575:1: rulePackageElementVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator rulePackageElementVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAlf.g:5581:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // InternalAlf.g:5582:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // InternalAlf.g:5582:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==59) ) {
                alt104=1;
            }
            else if ( (LA104_0==60) ) {
                alt104=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // InternalAlf.g:5583:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:5583:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:5584:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getPackageElementVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPackageElementVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:5591:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:5591:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:5592:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

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
    // InternalAlf.g:5602:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAlf.g:5608:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) )
            // InternalAlf.g:5609:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            {
            // InternalAlf.g:5609:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            int alt105=4;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt105=1;
                }
                break;
            case 60:
                {
                alt105=2;
                }
                break;
            case 61:
                {
                alt105=3;
                }
                break;
            case 62:
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
                    // InternalAlf.g:5610:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:5610:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:5611:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:5618:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:5618:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:5619:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:5626:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalAlf.g:5626:3: (enumLiteral_2= 'protected' )
                    // InternalAlf.g:5627:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:5634:3: (enumLiteral_3= 'packaged' )
                    {
                    // InternalAlf.g:5634:3: (enumLiteral_3= 'packaged' )
                    // InternalAlf.g:5635:4: enumLiteral_3= 'packaged'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); 

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
    // InternalAlf.g:5645:1: ruleFeatureDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFeatureDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAlf.g:5651:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalAlf.g:5652:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalAlf.g:5652:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt106=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt106=1;
                }
                break;
            case 64:
                {
                alt106=2;
                }
                break;
            case 65:
                {
                alt106=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // InternalAlf.g:5653:3: (enumLiteral_0= 'in' )
                    {
                    // InternalAlf.g:5653:3: (enumLiteral_0= 'in' )
                    // InternalAlf.g:5654:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:5661:3: (enumLiteral_1= 'out' )
                    {
                    // InternalAlf.g:5661:3: (enumLiteral_1= 'out' )
                    // InternalAlf.g:5662:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:5669:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalAlf.g:5669:3: (enumLiteral_2= 'inout' )
                    // InternalAlf.g:5670:4: enumLiteral_2= 'inout'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

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
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA88 dfa88 = new DFA88(this);
    static final String dfa_1s = "\36\uffff";
    static final String dfa_2s = "\2\4\2\20\1\11\1\uffff\1\32\5\uffff\2\21\3\11\1\4\2\21\1\24\2\22\2\24\1\11\1\4\1\11\2\24";
    static final String dfa_3s = "\2\74\2\20\1\12\1\uffff\1\35\5\uffff\2\25\2\23\1\12\1\74\2\25\1\24\2\25\2\24\1\23\1\74\1\23\2\24";
    static final String dfa_4s = "\5\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\22\uffff";
    static final String dfa_5s = "\36\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\13\uffff\1\4\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\12\1\13\3\uffff\1\6\30\uffff\1\2\1\3",
            "\1\1\13\uffff\1\4\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\12\1\13\3\uffff\1\6\30\uffff\1\2\1\3",
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
            "\1\1\13\uffff\1\4\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\12\1\13\3\uffff\1\6\30\uffff\1\2\1\3",
            "\1\31\2\uffff\1\21\1\20",
            "\1\31\2\uffff\1\21\1\20",
            "\1\32",
            "\1\33\1\uffff\1\21\1\20",
            "\1\33\1\uffff\1\21\1\20",
            "\1\21",
            "\1\21",
            "\1\22\1\23\10\uffff\1\34",
            "\1\1\13\uffff\1\4\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\12\1\13\3\uffff\1\6\30\uffff\1\2\1\3",
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
    static final String dfa_8s = "\2\4\1\uffff\2\20\1\11\2\21\2\11\1\uffff\2\21\1\uffff\2\22\2\11";
    static final String dfa_9s = "\2\74\1\uffff\2\20\1\12\2\25\2\23\1\uffff\2\25\1\uffff\2\25\2\23";
    static final String dfa_10s = "\2\uffff\1\3\7\uffff\1\2\2\uffff\1\1\4\uffff";
    static final String dfa_11s = "\22\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\13\uffff\1\5\5\uffff\1\2\3\uffff\5\2\3\uffff\1\2\30\uffff\1\3\1\4",
            "\1\1\13\uffff\1\5\5\uffff\1\2\3\uffff\5\2\3\uffff\1\2\30\uffff\1\3\1\4",
            "",
            "\1\5",
            "\1\5",
            "\1\6\1\7",
            "\1\10\1\11\1\uffff\2\12",
            "\1\10\1\11\1\uffff\2\12",
            "\1\13\1\14\10\uffff\1\15",
            "\1\16\1\17\10\uffff\1\15",
            "",
            "\1\20\2\uffff\2\12",
            "\1\20\2\uffff\2\12",
            "",
            "\1\21\1\uffff\2\12",
            "\1\21\1\uffff\2\12",
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
            return "()* loopback of 392:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )*";
        }
    }
    static final String dfa_13s = "\1\4\1\uffff\1\4\2\11\1\uffff\1\11\2\21\2\11\2\22\1\uffff\2\21\2\11";
    static final String dfa_14s = "\1\74\1\uffff\1\74\2\42\1\uffff\1\12\2\25\2\23\2\25\1\uffff\2\25\2\23";
    static final String dfa_15s = "\1\uffff\1\3\3\uffff\1\1\7\uffff\1\2\4\uffff";
    static final String[] dfa_16s = {
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\1\uffff\1\1\1\uffff\5\5\3\uffff\1\5\30\uffff\1\3\1\4",
            "",
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\5\5\3\uffff\1\5\30\uffff\1\3\1\4",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\5\5\3\uffff\1\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\5\5\3\uffff\1\5",
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
            return "()* loopback of 887:3: ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_17s = "\27\uffff";
    static final String dfa_18s = "\1\20\1\11\1\uffff\4\11\1\uffff\2\27\1\uffff\2\24\1\uffff\2\24\1\uffff\2\24\1\uffff\2\24\1\uffff";
    static final String dfa_19s = "\1\42\1\31\1\uffff\4\31\1\uffff\2\31\1\uffff\2\43\1\uffff\2\43\1\uffff\2\43\1\uffff\2\43\1\uffff";
    static final String dfa_20s = "\2\uffff\1\1\4\uffff\1\7\2\uffff\1\2\2\uffff\1\3\2\uffff\1\4\2\uffff\1\5\2\uffff\1\6";
    static final String dfa_21s = "\27\uffff}>";
    static final String[] dfa_22s = {
            "\1\7\5\uffff\1\1\3\uffff\1\3\1\4\1\5\1\6\4\uffff\1\2",
            "\1\10\1\11\16\uffff\1\12",
            "",
            "\1\13\1\14\16\uffff\1\15",
            "\1\16\1\17\16\uffff\1\20",
            "\1\21\1\22\16\uffff\1\23",
            "\1\24\1\25\16\uffff\1\26",
            "",
            "\1\2\1\uffff\1\12",
            "\1\2\1\uffff\1\12",
            "",
            "\1\2\2\uffff\1\2\1\uffff\1\15\11\uffff\1\2",
            "\1\2\2\uffff\1\2\1\uffff\1\15\11\uffff\1\2",
            "",
            "\1\2\2\uffff\1\2\1\uffff\1\20\11\uffff\1\2",
            "\1\2\2\uffff\1\2\1\uffff\1\20\11\uffff\1\2",
            "",
            "\1\2\2\uffff\1\2\1\uffff\1\23\11\uffff\1\2",
            "\1\2\2\uffff\1\2\1\uffff\1\23\11\uffff\1\2",
            "",
            "\1\2\2\uffff\1\2\1\uffff\1\26\11\uffff\1\2",
            "\1\2\2\uffff\1\2\1\uffff\1\26\11\uffff\1\2",
            ""
    };

    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_17;
            this.eof = dfa_17;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_21;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "1050:2: ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'Class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'class' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'datatype' ( (lv_memberName_17_0= ruleName ) )? otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) | (otherlv_21= 'assoc' ( (lv_memberName_22_0= ruleName ) )? otherlv_23= 'is' ( ( ruleQualifiedName ) ) otherlv_25= ';' ) | (otherlv_26= 'import' ( ( ruleQualifiedName ) ) (otherlv_28= 'as' ( (lv_memberName_29_0= ruleName ) ) )? otherlv_30= ';' ) )";
        }
    }
    static final String dfa_23s = "\1\4\1\uffff\1\4\2\11\1\uffff\1\11\2\21\2\11\1\uffff\2\21\2\22\2\11";
    static final String dfa_24s = "\1\101\1\uffff\3\101\1\uffff\1\12\2\25\2\23\1\uffff\4\25\2\23";
    static final String dfa_25s = "\1\uffff\1\3\3\uffff\1\1\5\uffff\1\2\6\uffff";
    static final String[] dfa_26s = {
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\1\uffff\1\1\1\uffff\11\5\30\uffff\1\3\1\4\5\5",
            "",
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\11\5\30\uffff\1\3\1\4\5\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\11\5\34\uffff\3\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\11\5\34\uffff\3\5",
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

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_11;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "()* loopback of 1535:4: ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_27s = "\10\uffff";
    static final String dfa_28s = "\2\4\4\11\2\uffff";
    static final String dfa_29s = "\6\101\2\uffff";
    static final String dfa_30s = "\6\uffff\1\1\1\2";
    static final String dfa_31s = "\10\uffff}>";
    static final String[] dfa_32s = {
            "\1\1\4\uffff\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\4\6\4\7\1\6\30\uffff\1\2\1\3\1\4\1\5\3\7",
            "\1\1\4\uffff\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\4\6\4\7\1\6\30\uffff\1\2\1\3\1\4\1\5\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\4\6\4\7\1\6\34\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\4\6\4\7\1\6\34\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\4\6\4\7\1\6\34\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\4\6\4\7\1\6\34\uffff\3\7",
            "",
            ""
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "1599:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember )";
        }
    }
    static final String dfa_33s = "\16\uffff";
    static final String dfa_34s = "\1\11\2\21\1\uffff\1\11\2\21\2\11\1\uffff\2\22\2\21";
    static final String dfa_35s = "\1\62\2\64\1\uffff\1\12\2\64\2\12\1\uffff\4\64";
    static final String dfa_36s = "\3\uffff\1\1\5\uffff\1\2\4\uffff";
    static final String dfa_37s = "\16\uffff}>";
    static final String[] dfa_38s = {
            "\1\1\1\2\16\uffff\1\4\17\uffff\1\3\10\uffff\1\3",
            "\2\3\6\uffff\1\4\17\uffff\1\3\2\uffff\1\3\4\uffff\2\3\1\uffff\1\3",
            "\2\3\6\uffff\1\4\17\uffff\1\3\2\uffff\1\3\4\uffff\2\3\1\uffff\1\3",
            "",
            "\1\5\1\6",
            "\1\10\1\7\1\uffff\1\11\24\uffff\1\3\2\uffff\1\3\4\uffff\1\3\2\uffff\1\3",
            "\1\10\1\7\1\uffff\1\11\24\uffff\1\3\2\uffff\1\3\4\uffff\1\3\2\uffff\1\3",
            "\1\12\1\13",
            "\1\14\1\15",
            "",
            "\1\7\1\uffff\1\11\24\uffff\1\3\2\uffff\1\3\4\uffff\1\3\2\uffff\1\3",
            "\1\7\1\uffff\1\11\24\uffff\1\3\2\uffff\1\3\4\uffff\1\3\2\uffff\1\3",
            "\1\10\2\uffff\1\11\24\uffff\1\3\2\uffff\1\3\4\uffff\1\3\2\uffff\1\3",
            "\1\10\2\uffff\1\11\24\uffff\1\3\2\uffff\1\3\4\uffff\1\3\2\uffff\1\3"
    };

    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_33;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "2001:4: ( ( (lv_ownedMemberFeature_10_0= ruleConnectorDefinition ) ) | ( ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) )";
        }
    }
    static final String dfa_39s = "\1\101\1\uffff\3\101\1\uffff\1\12\2\25\2\23\2\25\1\uffff\2\25\2\23";
    static final String[] dfa_40s = {
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\1\uffff\1\1\1\uffff\11\5\2\uffff\1\5\25\uffff\1\3\1\4\5\5",
            "",
            "\1\2\4\uffff\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\11\5\2\uffff\1\5\25\uffff\1\3\1\4\5\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\11\5\2\uffff\1\5\31\uffff\3\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\11\5\2\uffff\1\5\31\uffff\3\5",
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
    static final short[][] dfa_40 = unpackEncodedStringArray(dfa_40s);

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_39;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "()* loopback of 2685:4: ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_41s = "\11\uffff";
    static final String dfa_42s = "\2\4\4\11\3\uffff";
    static final String dfa_43s = "\6\101\3\uffff";
    static final String dfa_44s = "\6\uffff\1\1\1\2\1\3";
    static final String dfa_45s = "\11\uffff}>";
    static final String[] dfa_46s = {
            "\1\1\4\uffff\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\4\6\4\7\1\6\2\uffff\1\10\25\uffff\1\2\1\3\1\4\1\5\3\10",
            "\1\1\4\uffff\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\4\6\4\7\1\6\2\uffff\1\10\25\uffff\1\2\1\3\1\4\1\5\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\4\6\4\7\1\6\2\uffff\1\10\31\uffff\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\4\6\4\7\1\6\2\uffff\1\10\31\uffff\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\4\6\4\7\1\6\2\uffff\1\10\31\uffff\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\4\6\4\7\1\6\2\uffff\1\10\31\uffff\3\10",
            "",
            "",
            ""
    };

    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[][] dfa_46 = unpackEncodedStringArray(dfa_46s);

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_41;
            this.eof = dfa_41;
            this.min = dfa_42;
            this.max = dfa_43;
            this.accept = dfa_44;
            this.special = dfa_45;
            this.transition = dfa_46;
        }
        public String getDescription() {
            return "2749:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )";
        }
    }
    static final String dfa_47s = "\13\uffff";
    static final String dfa_48s = "\2\11\1\uffff\2\24\1\11\2\uffff\2\24\1\uffff";
    static final String dfa_49s = "\2\101\1\uffff\2\60\1\101\2\uffff\2\60\1\uffff";
    static final String dfa_50s = "\2\uffff\1\3\3\uffff\1\1\1\4\2\uffff\1\2";
    static final String dfa_51s = "\13\uffff}>";
    static final String[] dfa_52s = {
            "\1\3\1\4\32\uffff\1\1\31\uffff\3\2",
            "\2\6\24\uffff\1\5\1\6\16\uffff\2\6\16\uffff\3\6",
            "",
            "\1\2\2\uffff\1\2\1\uffff\1\7\14\uffff\4\2\2\uffff\1\2\2\uffff\2\2",
            "\1\2\2\uffff\1\2\1\uffff\1\7\14\uffff\4\2\2\uffff\1\2\2\uffff\2\2",
            "\1\10\1\11\16\uffff\1\12\25\uffff\2\6\16\uffff\3\6",
            "",
            "",
            "\1\6\2\uffff\1\6\1\uffff\1\12\14\uffff\4\6\2\uffff\1\6\2\uffff\2\6",
            "\1\6\2\uffff\1\6\1\uffff\1\12\14\uffff\4\6\2\uffff\1\6\2\uffff\2\6",
            ""
    };

    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[][] dfa_52 = unpackEncodedStringArray(dfa_52s);

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_47;
            this.eof = dfa_47;
            this.min = dfa_48;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_51;
            this.transition = dfa_52;
        }
        public String getDescription() {
            return "2847:3: ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )";
        }
    }
    static final String dfa_53s = "\1\11\2\21\1\11\2\uffff\1\11\4\21\4\11\2\22\2\21\2\22\2\21";
    static final String dfa_54s = "\1\62\2\64\1\12\2\uffff\1\12\4\62\4\12\10\62";
    static final String dfa_55s = "\4\uffff\1\1\1\2\21\uffff";
    static final String[] dfa_56s = {
            "\1\1\1\2\16\uffff\1\4\17\uffff\1\3\10\uffff\1\5",
            "\2\4\6\uffff\1\4\17\uffff\1\6\2\uffff\1\4\4\uffff\1\4\1\5\1\uffff\1\4",
            "\2\4\6\uffff\1\4\17\uffff\1\6\2\uffff\1\4\4\uffff\1\4\1\5\1\uffff\1\4",
            "\1\7\1\10",
            "",
            "",
            "\1\11\1\12",
            "\1\14\1\13\6\uffff\1\4\30\uffff\1\5",
            "\1\14\1\13\6\uffff\1\4\30\uffff\1\5",
            "\1\16\1\15\6\uffff\1\4\22\uffff\1\4\4\uffff\1\4\1\5",
            "\1\16\1\15\6\uffff\1\4\22\uffff\1\4\4\uffff\1\4\1\5",
            "\1\17\1\20",
            "\1\21\1\22",
            "\1\23\1\24",
            "\1\25\1\26",
            "\1\13\6\uffff\1\4\30\uffff\1\5",
            "\1\13\6\uffff\1\4\30\uffff\1\5",
            "\1\14\7\uffff\1\4\30\uffff\1\5",
            "\1\14\7\uffff\1\4\30\uffff\1\5",
            "\1\15\6\uffff\1\4\22\uffff\1\4\4\uffff\1\4\1\5",
            "\1\15\6\uffff\1\4\22\uffff\1\4\4\uffff\1\4\1\5",
            "\1\16\7\uffff\1\4\22\uffff\1\4\4\uffff\1\4\1\5",
            "\1\16\7\uffff\1\4\22\uffff\1\4\4\uffff\1\4\1\5"
    };
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[][] dfa_56 = unpackEncodedStringArray(dfa_56s);

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = dfa_17;
            this.eof = dfa_17;
            this.min = dfa_53;
            this.max = dfa_54;
            this.accept = dfa_55;
            this.special = dfa_21;
            this.transition = dfa_56;
        }
        public String getDescription() {
            return "3882:3: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) )";
        }
    }
    static final String dfa_57s = "\1\11\2\21\2\uffff\1\11\2\21\2\11\2\22\2\21";
    static final String dfa_58s = "\1\51\2\64\2\uffff\1\12\2\61\2\12\4\61";
    static final String dfa_59s = "\3\uffff\1\1\1\2\11\uffff";
    static final String[] dfa_60s = {
            "\1\1\1\2\16\uffff\1\3\17\uffff\1\3",
            "\2\4\6\uffff\1\3\17\uffff\1\5\2\uffff\1\4\4\uffff\1\4\2\uffff\1\4",
            "\2\4\6\uffff\1\3\17\uffff\1\5\2\uffff\1\4\4\uffff\1\4\2\uffff\1\4",
            "",
            "",
            "\1\6\1\7",
            "\1\11\1\10\6\uffff\1\3\22\uffff\1\4\4\uffff\1\4",
            "\1\11\1\10\6\uffff\1\3\22\uffff\1\4\4\uffff\1\4",
            "\1\12\1\13",
            "\1\14\1\15",
            "\1\10\6\uffff\1\3\22\uffff\1\4\4\uffff\1\4",
            "\1\10\6\uffff\1\3\22\uffff\1\4\4\uffff\1\4",
            "\1\11\7\uffff\1\3\22\uffff\1\4\4\uffff\1\4",
            "\1\11\7\uffff\1\3\22\uffff\1\4\4\uffff\1\4"
    };
    static final char[] dfa_57 = DFA.unpackEncodedStringToUnsignedChars(dfa_57s);
    static final char[] dfa_58 = DFA.unpackEncodedStringToUnsignedChars(dfa_58s);
    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final short[][] dfa_60 = unpackEncodedStringArray(dfa_60s);

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_33;
            this.eof = dfa_33;
            this.min = dfa_57;
            this.max = dfa_58;
            this.accept = dfa_59;
            this.special = dfa_37;
            this.transition = dfa_60;
        }
        public String getDescription() {
            return "3884:5: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )?";
        }
    }
    static final String dfa_61s = "\21\uffff";
    static final String dfa_62s = "\1\uffff\2\7\7\uffff\4\7\1\uffff\1\7\1\uffff";
    static final String dfa_63s = "\1\11\2\21\1\7\1\uffff\2\11\1\uffff\1\55\1\56\2\22\2\21\1\7\1\24\1\56";
    static final String dfa_64s = "\1\12\2\64\1\23\1\uffff\2\12\1\uffff\2\56\4\64\1\23\1\64\1\56";
    static final String dfa_65s = "\4\uffff\1\2\2\uffff\1\1\11\uffff";
    static final String dfa_66s = "\21\uffff}>";
    static final String[] dfa_67s = {
            "\1\1\1\2",
            "\1\6\1\5\1\uffff\1\7\2\uffff\1\7\14\uffff\1\7\4\uffff\1\7\2\uffff\1\3\4\uffff\1\7\1\uffff\1\7\1\4",
            "\1\6\1\5\1\uffff\1\7\2\uffff\1\7\14\uffff\1\7\4\uffff\1\7\2\uffff\1\3\4\uffff\1\7\1\uffff\1\7\1\4",
            "\1\10\13\uffff\1\11",
            "",
            "\1\12\1\13",
            "\1\14\1\15",
            "",
            "\1\16\1\17",
            "\1\17",
            "\1\5\1\uffff\1\7\2\uffff\1\7\14\uffff\1\7\4\uffff\1\7\2\uffff\1\3\4\uffff\1\7\1\uffff\1\7\1\4",
            "\1\5\1\uffff\1\7\2\uffff\1\7\14\uffff\1\7\4\uffff\1\7\2\uffff\1\3\4\uffff\1\7\1\uffff\1\7\1\4",
            "\1\6\2\uffff\1\7\2\uffff\1\7\14\uffff\1\7\4\uffff\1\7\2\uffff\1\3\4\uffff\1\7\1\uffff\1\7\1\4",
            "\1\6\2\uffff\1\7\2\uffff\1\7\14\uffff\1\7\4\uffff\1\7\2\uffff\1\3\4\uffff\1\7\1\uffff\1\7\1\4",
            "\1\20\13\uffff\1\11",
            "\1\7\2\uffff\1\7\14\uffff\1\7\14\uffff\1\7\1\uffff\1\7\1\4",
            "\1\17"
    };

    static final short[] dfa_61 = DFA.unpackEncodedString(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final char[] dfa_63 = DFA.unpackEncodedStringToUnsignedChars(dfa_63s);
    static final char[] dfa_64 = DFA.unpackEncodedStringToUnsignedChars(dfa_64s);
    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final short[] dfa_66 = DFA.unpackEncodedString(dfa_66s);
    static final short[][] dfa_67 = unpackEncodedStringArray(dfa_67s);

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = dfa_61;
            this.eof = dfa_62;
            this.min = dfa_63;
            this.max = dfa_64;
            this.accept = dfa_65;
            this.special = dfa_66;
            this.transition = dfa_67;
        }
        public String getDescription() {
            return "4162:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )";
        }
    }
    static final String dfa_68s = "\1\uffff\2\5\4\uffff\4\5";
    static final String dfa_69s = "\1\11\2\21\1\uffff\1\11\1\uffff\1\11\2\22\2\21";
    static final String dfa_70s = "\1\12\2\63\1\uffff\1\12\1\uffff\1\12\4\63";
    static final String dfa_71s = "\3\uffff\1\1\1\uffff\1\2\5\uffff";
    static final String[] dfa_72s = {
            "\1\1\1\2",
            "\1\6\1\4\1\uffff\1\5\2\uffff\1\5\14\uffff\1\5\4\uffff\1\3\2\uffff\1\5\4\uffff\1\5\1\uffff\1\5",
            "\1\6\1\4\1\uffff\1\5\2\uffff\1\5\14\uffff\1\5\4\uffff\1\3\2\uffff\1\5\4\uffff\1\5\1\uffff\1\5",
            "",
            "\1\7\1\10",
            "",
            "\1\11\1\12",
            "\1\4\1\uffff\1\5\2\uffff\1\5\14\uffff\1\5\4\uffff\1\3\2\uffff\1\5\4\uffff\1\5\1\uffff\1\5",
            "\1\4\1\uffff\1\5\2\uffff\1\5\14\uffff\1\5\4\uffff\1\3\2\uffff\1\5\4\uffff\1\5\1\uffff\1\5",
            "\1\6\2\uffff\1\5\2\uffff\1\5\14\uffff\1\5\4\uffff\1\3\2\uffff\1\5\4\uffff\1\5\1\uffff\1\5",
            "\1\6\2\uffff\1\5\2\uffff\1\5\14\uffff\1\5\4\uffff\1\3\2\uffff\1\5\4\uffff\1\5\1\uffff\1\5"
    };
    static final short[] dfa_68 = DFA.unpackEncodedString(dfa_68s);
    static final char[] dfa_69 = DFA.unpackEncodedStringToUnsignedChars(dfa_69s);
    static final char[] dfa_70 = DFA.unpackEncodedStringToUnsignedChars(dfa_70s);
    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final short[][] dfa_72 = unpackEncodedStringArray(dfa_72s);

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = dfa_47;
            this.eof = dfa_68;
            this.min = dfa_69;
            this.max = dfa_70;
            this.accept = dfa_71;
            this.special = dfa_51;
            this.transition = dfa_72;
        }
        public String getDescription() {
            return "4164:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )?";
        }
    }
    static final String dfa_73s = "\2\uffff\2\11\6\uffff\4\11";
    static final String dfa_74s = "\1\5\1\uffff\2\21\2\uffff\1\11\1\uffff\1\11\1\uffff\2\21\2\22";
    static final String dfa_75s = "\1\72\1\uffff\2\71\2\uffff\1\12\1\uffff\1\12\1\uffff\4\71";
    static final String dfa_76s = "\1\uffff\1\1\2\uffff\1\4\1\5\1\uffff\1\3\1\uffff\1\2\4\uffff";
    static final String[] dfa_77s = {
            "\4\1\1\2\1\3\7\uffff\2\1\3\uffff\1\4\32\uffff\1\5\7\uffff\1\1",
            "",
            "\1\6\1\10\2\11\2\uffff\2\11\13\uffff\1\11\7\uffff\1\11\1\uffff\1\11\3\uffff\1\7\1\11\1\uffff\5\11",
            "\1\6\1\10\2\11\2\uffff\2\11\13\uffff\1\11\7\uffff\1\11\1\uffff\1\11\3\uffff\1\7\1\11\1\uffff\5\11",
            "",
            "",
            "\1\12\1\13",
            "",
            "\1\14\1\15",
            "",
            "\1\6\1\uffff\2\11\2\uffff\2\11\13\uffff\1\11\7\uffff\1\11\1\uffff\1\11\3\uffff\1\7\1\11\1\uffff\5\11",
            "\1\6\1\uffff\2\11\2\uffff\2\11\13\uffff\1\11\7\uffff\1\11\1\uffff\1\11\3\uffff\1\7\1\11\1\uffff\5\11",
            "\1\10\2\11\2\uffff\2\11\13\uffff\1\11\7\uffff\1\11\1\uffff\1\11\3\uffff\1\7\1\11\1\uffff\5\11",
            "\1\10\2\11\2\uffff\2\11\13\uffff\1\11\7\uffff\1\11\1\uffff\1\11\3\uffff\1\7\1\11\1\uffff\5\11"
    };
    static final short[] dfa_73 = DFA.unpackEncodedString(dfa_73s);
    static final char[] dfa_74 = DFA.unpackEncodedStringToUnsignedChars(dfa_74s);
    static final char[] dfa_75 = DFA.unpackEncodedStringToUnsignedChars(dfa_75s);
    static final short[] dfa_76 = DFA.unpackEncodedString(dfa_76s);
    static final short[][] dfa_77 = unpackEncodedStringArray(dfa_77s);

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = dfa_33;
            this.eof = dfa_73;
            this.min = dfa_74;
            this.max = dfa_75;
            this.accept = dfa_76;
            this.special = dfa_37;
            this.transition = dfa_77;
        }
        public String getDescription() {
            return "4663:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000408000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000420000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x1800000000010012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x1800000000010010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x180000047D410610L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x180000047C410610L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x1800000000000012L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000600L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000600L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xF8000007FD410610L,0x0000000000000003L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000043C410000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x80000003C0000600L,0x0000000000000003L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x7800000000000012L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x8001800042000600L,0x0000000000000003L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001800042000600L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004020002000600L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0xF8000027FD410610L,0x0000000000000003L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x8000002040000600L,0x0000000000000003L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x80018001C0000600L,0x0000000000000003L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x8001800040000600L,0x0000000000000003L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001800040000600L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000010000900000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000130000900000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000110000900000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x000192C000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x000190C000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000180C000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x04C40000008C07E0L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x00000C0000000600L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000080000000600L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x04000000000C01E0L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000020002000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000020002000600L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0004020000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0008001000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0010100000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x03E0000000080002L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x04040000008C07E0L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x04CC0000008C07E0L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x04C40000018C07E0L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000001001000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000040002L});

}
