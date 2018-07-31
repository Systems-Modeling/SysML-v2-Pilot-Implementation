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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOCUMENTATION_COMMENT", "RULE_BOOLEAN_VALUE", "RULE_STRING_VALUE", "RULE_NATURAL_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'import'", "'::'", "'.'", "'*'", "';'", "'as'", "'package'", "'{'", "'}'", "'is'", "'class'", "'assoc'", "'feature'", "'abstract'", "'specializes'", "','", "'part'", "'port'", "'connector'", "'end'", "'='", "':'", "'compose'", "'any'", "'['", "'..'", "']'", "'subsets'", "'redefines'", "'=>'", "'@'", "'+'", "'-'", "'/'", "'^'", "'('", "')'", "'null'", "'e'", "'E'", "'public'", "'private'", "'protected'", "'packaged'", "'in'", "'out'", "'inout'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_STATEMENT_ANNOTATION=10;
    public static final int T__15=15;
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
    public static final int RULE_ID=8;
    public static final int RULE_NATURAL_VALUE=7;
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
    public static final int RULE_BOOLEAN_VALUE=5;
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
    public static final int RULE_UNRESTRICTED_NAME=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_STRING_VALUE=6;
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
    // InternalAlf.g:72:1: ruleUnitDefinition returns [EObject current=null] : (this_PackageUnitDefinition_0= rulePackageUnitDefinition | this_ClassUnitDefinition_1= ruleClassUnitDefinition | this_AssociationUnitDefinition_2= ruleAssociationUnitDefinition | this_FeatureUnitDefinition_3= ruleFeatureUnitDefinition ) ;
    public final EObject ruleUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageUnitDefinition_0 = null;

        EObject this_ClassUnitDefinition_1 = null;

        EObject this_AssociationUnitDefinition_2 = null;

        EObject this_FeatureUnitDefinition_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:78:2: ( (this_PackageUnitDefinition_0= rulePackageUnitDefinition | this_ClassUnitDefinition_1= ruleClassUnitDefinition | this_AssociationUnitDefinition_2= ruleAssociationUnitDefinition | this_FeatureUnitDefinition_3= ruleFeatureUnitDefinition ) )
            // InternalAlf.g:79:2: (this_PackageUnitDefinition_0= rulePackageUnitDefinition | this_ClassUnitDefinition_1= ruleClassUnitDefinition | this_AssociationUnitDefinition_2= ruleAssociationUnitDefinition | this_FeatureUnitDefinition_3= ruleFeatureUnitDefinition )
            {
            // InternalAlf.g:79:2: (this_PackageUnitDefinition_0= rulePackageUnitDefinition | this_ClassUnitDefinition_1= ruleClassUnitDefinition | this_AssociationUnitDefinition_2= ruleAssociationUnitDefinition | this_FeatureUnitDefinition_3= ruleFeatureUnitDefinition )
            int alt1=4;
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
                    // InternalAlf.g:98:3: this_AssociationUnitDefinition_2= ruleAssociationUnitDefinition
                    {

                    			newCompositeNode(grammarAccess.getUnitDefinitionAccess().getAssociationUnitDefinitionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssociationUnitDefinition_2=ruleAssociationUnitDefinition();

                    state._fsp--;


                    			current = this_AssociationUnitDefinition_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:107:3: this_FeatureUnitDefinition_3= ruleFeatureUnitDefinition
                    {

                    			newCompositeNode(grammarAccess.getUnitDefinitionAccess().getFeatureUnitDefinitionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureUnitDefinition_3=ruleFeatureUnitDefinition();

                    state._fsp--;


                    			current = this_FeatureUnitDefinition_3;
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
    // InternalAlf.g:119:1: entryRulePackageUnitDefinition returns [EObject current=null] : iv_rulePackageUnitDefinition= rulePackageUnitDefinition EOF ;
    public final EObject entryRulePackageUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageUnitDefinition = null;


        try {
            // InternalAlf.g:119:62: (iv_rulePackageUnitDefinition= rulePackageUnitDefinition EOF )
            // InternalAlf.g:120:2: iv_rulePackageUnitDefinition= rulePackageUnitDefinition EOF
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
    // InternalAlf.g:126:1: rulePackageUnitDefinition returns [EObject current=null] : (this_UnitPrefix_0= ruleUnitPrefix[$current] this_PackageDefinition_1= rulePackageDefinition[$current] ) ;
    public final EObject rulePackageUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_UnitPrefix_0 = null;

        EObject this_PackageDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:132:2: ( (this_UnitPrefix_0= ruleUnitPrefix[$current] this_PackageDefinition_1= rulePackageDefinition[$current] ) )
            // InternalAlf.g:133:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_PackageDefinition_1= rulePackageDefinition[$current] )
            {
            // InternalAlf.g:133:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_PackageDefinition_1= rulePackageDefinition[$current] )
            // InternalAlf.g:134:3: this_UnitPrefix_0= ruleUnitPrefix[$current] this_PackageDefinition_1= rulePackageDefinition[$current]
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
    // InternalAlf.g:160:1: entryRuleClassUnitDefinition returns [EObject current=null] : iv_ruleClassUnitDefinition= ruleClassUnitDefinition EOF ;
    public final EObject entryRuleClassUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassUnitDefinition = null;


        try {
            // InternalAlf.g:160:60: (iv_ruleClassUnitDefinition= ruleClassUnitDefinition EOF )
            // InternalAlf.g:161:2: iv_ruleClassUnitDefinition= ruleClassUnitDefinition EOF
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
    // InternalAlf.g:167:1: ruleClassUnitDefinition returns [EObject current=null] : (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ClassDefinition_1= ruleClassDefinition[$current] ) ;
    public final EObject ruleClassUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_UnitPrefix_0 = null;

        EObject this_ClassDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:173:2: ( (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ClassDefinition_1= ruleClassDefinition[$current] ) )
            // InternalAlf.g:174:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ClassDefinition_1= ruleClassDefinition[$current] )
            {
            // InternalAlf.g:174:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_ClassDefinition_1= ruleClassDefinition[$current] )
            // InternalAlf.g:175:3: this_UnitPrefix_0= ruleUnitPrefix[$current] this_ClassDefinition_1= ruleClassDefinition[$current]
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


    // $ANTLR start "entryRuleAssociationUnitDefinition"
    // InternalAlf.g:201:1: entryRuleAssociationUnitDefinition returns [EObject current=null] : iv_ruleAssociationUnitDefinition= ruleAssociationUnitDefinition EOF ;
    public final EObject entryRuleAssociationUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationUnitDefinition = null;


        try {
            // InternalAlf.g:201:66: (iv_ruleAssociationUnitDefinition= ruleAssociationUnitDefinition EOF )
            // InternalAlf.g:202:2: iv_ruleAssociationUnitDefinition= ruleAssociationUnitDefinition EOF
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
    // InternalAlf.g:208:1: ruleAssociationUnitDefinition returns [EObject current=null] : (this_UnitPrefix_0= ruleUnitPrefix[$current] this_AssociationDefinition_1= ruleAssociationDefinition[$current] ) ;
    public final EObject ruleAssociationUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_UnitPrefix_0 = null;

        EObject this_AssociationDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:214:2: ( (this_UnitPrefix_0= ruleUnitPrefix[$current] this_AssociationDefinition_1= ruleAssociationDefinition[$current] ) )
            // InternalAlf.g:215:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_AssociationDefinition_1= ruleAssociationDefinition[$current] )
            {
            // InternalAlf.g:215:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_AssociationDefinition_1= ruleAssociationDefinition[$current] )
            // InternalAlf.g:216:3: this_UnitPrefix_0= ruleUnitPrefix[$current] this_AssociationDefinition_1= ruleAssociationDefinition[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationUnitDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationUnitDefinitionAccess().getUnitPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
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
    // InternalAlf.g:242:1: entryRuleFeatureUnitDefinition returns [EObject current=null] : iv_ruleFeatureUnitDefinition= ruleFeatureUnitDefinition EOF ;
    public final EObject entryRuleFeatureUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureUnitDefinition = null;


        try {
            // InternalAlf.g:242:62: (iv_ruleFeatureUnitDefinition= ruleFeatureUnitDefinition EOF )
            // InternalAlf.g:243:2: iv_ruleFeatureUnitDefinition= ruleFeatureUnitDefinition EOF
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
    // InternalAlf.g:249:1: ruleFeatureUnitDefinition returns [EObject current=null] : (this_UnitPrefix_0= ruleUnitPrefix[$current] this_FeatureBodyDefinition_1= ruleFeatureBodyDefinition[$current] ) ;
    public final EObject ruleFeatureUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_UnitPrefix_0 = null;

        EObject this_FeatureBodyDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:255:2: ( (this_UnitPrefix_0= ruleUnitPrefix[$current] this_FeatureBodyDefinition_1= ruleFeatureBodyDefinition[$current] ) )
            // InternalAlf.g:256:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_FeatureBodyDefinition_1= ruleFeatureBodyDefinition[$current] )
            {
            // InternalAlf.g:256:2: (this_UnitPrefix_0= ruleUnitPrefix[$current] this_FeatureBodyDefinition_1= ruleFeatureBodyDefinition[$current] )
            // InternalAlf.g:257:3: this_UnitPrefix_0= ruleUnitPrefix[$current] this_FeatureBodyDefinition_1= ruleFeatureBodyDefinition[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureUnitDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureUnitDefinitionAccess().getUnitPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
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
    // InternalAlf.g:284:1: ruleUnitPrefix[EObject in_current] returns [EObject current=in_current] : ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ) ;
    public final EObject ruleUnitPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedImport_0_0 = null;

        EObject lv_ownedMembership_1_0 = null;

        EObject lv_ownedElement_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:290:2: ( ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ) )
            // InternalAlf.g:291:2: ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* )
            {
            // InternalAlf.g:291:2: ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* )
            // InternalAlf.g:292:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )*
            {
            // InternalAlf.g:292:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )*
            loop2:
            do {
                int alt2=3;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalAlf.g:293:4: ( (lv_ownedImport_0_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:293:4: ( (lv_ownedImport_0_0= rulePackageImport ) )
            	    // InternalAlf.g:294:5: (lv_ownedImport_0_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:294:5: (lv_ownedImport_0_0= rulePackageImport )
            	    // InternalAlf.g:295:6: lv_ownedImport_0_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getUnitPrefixAccess().getOwnedImportPackageImportParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
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
            	    // InternalAlf.g:313:4: ( (lv_ownedMembership_1_0= ruleElementImport ) )
            	    {
            	    // InternalAlf.g:313:4: ( (lv_ownedMembership_1_0= ruleElementImport ) )
            	    // InternalAlf.g:314:5: (lv_ownedMembership_1_0= ruleElementImport )
            	    {
            	    // InternalAlf.g:314:5: (lv_ownedMembership_1_0= ruleElementImport )
            	    // InternalAlf.g:315:6: lv_ownedMembership_1_0= ruleElementImport
            	    {

            	    						newCompositeNode(grammarAccess.getUnitPrefixAccess().getOwnedMembershipElementImportParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
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

            // InternalAlf.g:333:3: ( (lv_ownedElement_2_0= ruleComment ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAlf.g:334:4: (lv_ownedElement_2_0= ruleComment )
            	    {
            	    // InternalAlf.g:334:4: (lv_ownedElement_2_0= ruleComment )
            	    // InternalAlf.g:335:5: lv_ownedElement_2_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getUnitPrefixAccess().getOwnedElementCommentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_ownedElement_2_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUnitPrefixRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedElement",
            	    						lv_ownedElement_2_0,
            	    						"org.omg.sysml.Alf.Comment");
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


    // $ANTLR start "entryRuleComment"
    // InternalAlf.g:356:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalAlf.g:356:48: (iv_ruleComment= ruleComment EOF )
            // InternalAlf.g:357:2: iv_ruleComment= ruleComment EOF
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
    // InternalAlf.g:363:1: ruleComment returns [EObject current=null] : ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_body_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:369:2: ( ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) ) )
            // InternalAlf.g:370:2: ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) )
            {
            // InternalAlf.g:370:2: ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) )
            // InternalAlf.g:371:3: (lv_body_0_0= RULE_DOCUMENTATION_COMMENT )
            {
            // InternalAlf.g:371:3: (lv_body_0_0= RULE_DOCUMENTATION_COMMENT )
            // InternalAlf.g:372:4: lv_body_0_0= RULE_DOCUMENTATION_COMMENT
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
    // InternalAlf.g:391:1: entryRulePackageImport returns [EObject current=null] : iv_rulePackageImport= rulePackageImport EOF ;
    public final EObject entryRulePackageImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageImport = null;


        try {
            // InternalAlf.g:391:54: (iv_rulePackageImport= rulePackageImport EOF )
            // InternalAlf.g:392:2: iv_rulePackageImport= rulePackageImport EOF
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
    // InternalAlf.g:398:1: rulePackageImport returns [EObject current=null] : ( ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )? otherlv_1= 'import' ( ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' ) ) otherlv_12= ';' ) ;
    public final EObject rulePackageImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Enumerator lv_visibility_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:404:2: ( ( ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )? otherlv_1= 'import' ( ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' ) ) otherlv_12= ';' ) )
            // InternalAlf.g:405:2: ( ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )? otherlv_1= 'import' ( ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' ) ) otherlv_12= ';' )
            {
            // InternalAlf.g:405:2: ( ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )? otherlv_1= 'import' ( ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' ) ) otherlv_12= ';' )
            // InternalAlf.g:406:3: ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )? otherlv_1= 'import' ( ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' ) ) otherlv_12= ';'
            {
            // InternalAlf.g:406:3: ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=55 && LA4_0<=56)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAlf.g:407:4: (lv_visibility_0_0= rulePackageElementVisibilityIndicator )
                    {
                    // InternalAlf.g:407:4: (lv_visibility_0_0= rulePackageElementVisibilityIndicator )
                    // InternalAlf.g:408:5: lv_visibility_0_0= rulePackageElementVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getPackageImportAccess().getVisibilityPackageElementVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_visibility_0_0=rulePackageElementVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPackageImportRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"org.omg.sysml.Alf.PackageElementVisibilityIndicator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageImportAccess().getImportKeyword_1());
            		
            // InternalAlf.g:429:3: ( ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==16) ) {
                    int LA6_3 = input.LA(3);

                    if ( ((LA6_3>=RULE_ID && LA6_3<=RULE_UNRESTRICTED_NAME)) ) {
                        alt6=2;
                    }
                    else if ( (LA6_3==18) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA6_1==17) ) {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4==18) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_4>=RULE_ID && LA6_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt6=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_UNRESTRICTED_NAME) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==17) ) {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4==18) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_4>=RULE_ID && LA6_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt6=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA6_2==16) ) {
                    int LA6_3 = input.LA(3);

                    if ( ((LA6_3>=RULE_ID && LA6_3<=RULE_UNRESTRICTED_NAME)) ) {
                        alt6=2;
                    }
                    else if ( (LA6_3==18) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAlf.g:430:4: ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' )
                    {
                    // InternalAlf.g:430:4: ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' )
                    // InternalAlf.g:431:5: ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*'
                    {
                    // InternalAlf.g:431:5: ( ( ruleName ) )
                    // InternalAlf.g:432:6: ( ruleName )
                    {
                    // InternalAlf.g:432:6: ( ruleName )
                    // InternalAlf.g:433:7: ruleName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPackageImportRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_2_0_0_0());
                    						
                    pushFollow(FOLLOW_11);
                    ruleName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:447:5: (otherlv_3= '::' | otherlv_4= '.' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==16) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==17) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalAlf.g:448:6: otherlv_3= '::'
                            {
                            otherlv_3=(Token)match(input,16,FOLLOW_12); 

                            						newLeafNode(otherlv_3, grammarAccess.getPackageImportAccess().getColonColonKeyword_2_0_1_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:453:6: otherlv_4= '.'
                            {
                            otherlv_4=(Token)match(input,17,FOLLOW_12); 

                            						newLeafNode(otherlv_4, grammarAccess.getPackageImportAccess().getFullStopKeyword_2_0_1_1());
                            					

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_13); 

                    					newLeafNode(otherlv_5, grammarAccess.getPackageImportAccess().getAsteriskKeyword_2_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:464:4: ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' )
                    {
                    // InternalAlf.g:464:4: ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' )
                    // InternalAlf.g:465:5: ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*'
                    {
                    // InternalAlf.g:465:5: ( ( ruleColonQualifiedName ) )
                    // InternalAlf.g:466:6: ( ruleColonQualifiedName )
                    {
                    // InternalAlf.g:466:6: ( ruleColonQualifiedName )
                    // InternalAlf.g:467:7: ruleColonQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPackageImportRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_2_1_0_0());
                    						
                    pushFollow(FOLLOW_14);
                    ruleColonQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,16,FOLLOW_12); 

                    					newLeafNode(otherlv_7, grammarAccess.getPackageImportAccess().getColonColonKeyword_2_1_1());
                    				
                    otherlv_8=(Token)match(input,18,FOLLOW_13); 

                    					newLeafNode(otherlv_8, grammarAccess.getPackageImportAccess().getAsteriskKeyword_2_1_2());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:491:4: ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' )
                    {
                    // InternalAlf.g:491:4: ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' )
                    // InternalAlf.g:492:5: ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*'
                    {
                    // InternalAlf.g:492:5: ( ( ruleDotQualifiedName ) )
                    // InternalAlf.g:493:6: ( ruleDotQualifiedName )
                    {
                    // InternalAlf.g:493:6: ( ruleDotQualifiedName )
                    // InternalAlf.g:494:7: ruleDotQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPackageImportRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_2_2_0_0());
                    						
                    pushFollow(FOLLOW_15);
                    ruleDotQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_10=(Token)match(input,17,FOLLOW_12); 

                    					newLeafNode(otherlv_10, grammarAccess.getPackageImportAccess().getFullStopKeyword_2_2_1());
                    				
                    otherlv_11=(Token)match(input,18,FOLLOW_13); 

                    					newLeafNode(otherlv_11, grammarAccess.getPackageImportAccess().getAsteriskKeyword_2_2_2());
                    				

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getPackageImportAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalAlf.g:526:1: entryRuleElementImport returns [EObject current=null] : iv_ruleElementImport= ruleElementImport EOF ;
    public final EObject entryRuleElementImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementImport = null;


        try {
            // InternalAlf.g:526:54: (iv_ruleElementImport= ruleElementImport EOF )
            // InternalAlf.g:527:2: iv_ruleElementImport= ruleElementImport EOF
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
    // InternalAlf.g:533:1: ruleElementImport returns [EObject current=null] : ( ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )? otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleElementImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_visibility_0_0 = null;

        AntlrDatatypeRuleToken lv_memberName_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:539:2: ( ( ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )? otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' ) )
            // InternalAlf.g:540:2: ( ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )? otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' )
            {
            // InternalAlf.g:540:2: ( ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )? otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' )
            // InternalAlf.g:541:3: ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )? otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';'
            {
            // InternalAlf.g:541:3: ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=55 && LA7_0<=56)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlf.g:542:4: (lv_visibility_0_0= rulePackageElementVisibilityIndicator )
                    {
                    // InternalAlf.g:542:4: (lv_visibility_0_0= rulePackageElementVisibilityIndicator )
                    // InternalAlf.g:543:5: lv_visibility_0_0= rulePackageElementVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getElementImportAccess().getVisibilityPackageElementVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_visibility_0_0=rulePackageElementVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementImportRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"org.omg.sysml.Alf.PackageElementVisibilityIndicator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getElementImportAccess().getImportKeyword_1());
            		
            // InternalAlf.g:564:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:565:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:565:4: ( ruleQualifiedName )
            // InternalAlf.g:566:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementImportRule());
            					}
            				

            					newCompositeNode(grammarAccess.getElementImportAccess().getMemberElementElementCrossReference_2_0());
            				
            pushFollow(FOLLOW_16);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:580:3: (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAlf.g:581:4: otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getElementImportAccess().getAsKeyword_3_0());
                    			
                    // InternalAlf.g:585:4: ( (lv_memberName_4_0= ruleName ) )
                    // InternalAlf.g:586:5: (lv_memberName_4_0= ruleName )
                    {
                    // InternalAlf.g:586:5: (lv_memberName_4_0= ruleName )
                    // InternalAlf.g:587:6: lv_memberName_4_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getElementImportAccess().getMemberNameNameParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
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

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

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
    // InternalAlf.g:613:1: entryRuleNonFeatureDefinition returns [EObject current=null] : iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF ;
    public final EObject entryRuleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureDefinition = null;


        try {
            // InternalAlf.g:613:61: (iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF )
            // InternalAlf.g:614:2: iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF
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
    // InternalAlf.g:620:1: ruleNonFeatureDefinition returns [EObject current=null] : (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_2= ruleAssociationDefinitionOrStub ) ;
    public final EObject ruleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinitionOrStub_0 = null;

        EObject this_ClassDefinitionOrStub_1 = null;

        EObject this_AssociationDefinitionOrStub_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:626:2: ( (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_2= ruleAssociationDefinitionOrStub ) )
            // InternalAlf.g:627:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_2= ruleAssociationDefinitionOrStub )
            {
            // InternalAlf.g:627:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_2= ruleAssociationDefinitionOrStub )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case 28:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==25) ) {
                    alt9=2;
                }
                else if ( (LA9_2==26) ) {
                    alt9=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAlf.g:628:3: this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub
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
                    // InternalAlf.g:637:3: this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub
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
                    // InternalAlf.g:646:3: this_AssociationDefinitionOrStub_2= ruleAssociationDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureDefinitionAccess().getAssociationDefinitionOrStubParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssociationDefinitionOrStub_2=ruleAssociationDefinitionOrStub();

                    state._fsp--;


                    			current = this_AssociationDefinitionOrStub_2;
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
    // InternalAlf.g:658:1: entryRulePackageDefinitionOrStub returns [EObject current=null] : iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF ;
    public final EObject entryRulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDefinitionOrStub = null;


        try {
            // InternalAlf.g:658:64: (iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF )
            // InternalAlf.g:659:2: iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF
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
    // InternalAlf.g:665:1: rulePackageDefinitionOrStub returns [EObject current=null] : this_PackageDefinition_0= rulePackageDefinition[$current] ;
    public final EObject rulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:671:2: (this_PackageDefinition_0= rulePackageDefinition[$current] )
            // InternalAlf.g:672:2: this_PackageDefinition_0= rulePackageDefinition[$current]
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
    // InternalAlf.g:687:1: rulePackageDefinition[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' ) ;
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
            // InternalAlf.g:693:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' ) )
            // InternalAlf.g:694:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' )
            {
            // InternalAlf.g:694:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' )
            // InternalAlf.g:695:3: otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0());
            		
            // InternalAlf.g:699:3: ( (lv_name_1_0= ruleName ) )
            // InternalAlf.g:700:4: (lv_name_1_0= ruleName )
            {
            // InternalAlf.g:700:4: (lv_name_1_0= ruleName )
            // InternalAlf.g:701:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlf.g:722:3: ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )*
            loop10:
            do {
                int alt10=3;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalAlf.g:723:4: ( (lv_ownedMembership_3_0= rulePackageMember ) )
            	    {
            	    // InternalAlf.g:723:4: ( (lv_ownedMembership_3_0= rulePackageMember ) )
            	    // InternalAlf.g:724:5: (lv_ownedMembership_3_0= rulePackageMember )
            	    {
            	    // InternalAlf.g:724:5: (lv_ownedMembership_3_0= rulePackageMember )
            	    // InternalAlf.g:725:6: lv_ownedMembership_3_0= rulePackageMember
            	    {

            	    						newCompositeNode(grammarAccess.getPackageDefinitionAccess().getOwnedMembershipPackageMemberParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
            	    // InternalAlf.g:743:4: ( (lv_ownedImport_4_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:743:4: ( (lv_ownedImport_4_0= rulePackageImport ) )
            	    // InternalAlf.g:744:5: (lv_ownedImport_4_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:744:5: (lv_ownedImport_4_0= rulePackageImport )
            	    // InternalAlf.g:745:6: lv_ownedImport_4_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getPackageDefinitionAccess().getOwnedImportPackageImportParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
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

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

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
    // InternalAlf.g:771:1: entryRulePackageMember returns [EObject current=null] : iv_rulePackageMember= rulePackageMember EOF ;
    public final EObject entryRulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageMember = null;


        try {
            // InternalAlf.g:771:54: (iv_rulePackageMember= rulePackageMember EOF )
            // InternalAlf.g:772:2: iv_rulePackageMember= rulePackageMember EOF
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
    // InternalAlf.g:778:1: rulePackageMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? (this_NonFeatureMemberElement_2= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_3= ruleFeaturePackageMemberElement[$current] ) ) ;
    public final EObject rulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedElement_0_0 = null;

        Enumerator lv_visibility_1_0 = null;

        EObject this_NonFeatureMemberElement_2 = null;

        EObject this_FeaturePackageMemberElement_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:784:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? (this_NonFeatureMemberElement_2= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_3= ruleFeaturePackageMemberElement[$current] ) ) )
            // InternalAlf.g:785:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? (this_NonFeatureMemberElement_2= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_3= ruleFeaturePackageMemberElement[$current] ) )
            {
            // InternalAlf.g:785:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? (this_NonFeatureMemberElement_2= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_3= ruleFeaturePackageMemberElement[$current] ) )
            // InternalAlf.g:786:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? (this_NonFeatureMemberElement_2= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_3= ruleFeaturePackageMemberElement[$current] )
            {
            // InternalAlf.g:786:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAlf.g:787:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:787:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:788:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getPackageMemberAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_ownedElement_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageMemberRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedElement",
            	    						lv_ownedElement_0_0,
            	    						"org.omg.sysml.Alf.Comment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalAlf.g:805:3: ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=55 && LA12_0<=56)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAlf.g:806:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    {
                    // InternalAlf.g:806:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    // InternalAlf.g:807:5: lv_visibility_1_0= rulePackageElementVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getPackageMemberAccess().getVisibilityPackageElementVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_visibility_1_0=rulePackageElementVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPackageMemberRule());
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

            // InternalAlf.g:824:3: (this_NonFeatureMemberElement_2= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_3= ruleFeaturePackageMemberElement[$current] )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15||LA13_0==21||(LA13_0>=25 && LA13_0<=26)||LA13_0==28) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_UNRESTRICTED_NAME)||LA13_0==27) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlf.g:825:4: this_NonFeatureMemberElement_2= ruleNonFeatureMemberElement[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getPackageMemberRule());
                    				}
                    				newCompositeNode(grammarAccess.getPackageMemberAccess().getNonFeatureMemberElementParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_NonFeatureMemberElement_2=ruleNonFeatureMemberElement(current);

                    state._fsp--;


                    				current = this_NonFeatureMemberElement_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalAlf.g:837:4: this_FeaturePackageMemberElement_3= ruleFeaturePackageMemberElement[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getPackageMemberRule());
                    				}
                    				newCompositeNode(grammarAccess.getPackageMemberAccess().getFeaturePackageMemberElementParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_FeaturePackageMemberElement_3=ruleFeaturePackageMemberElement(current);

                    state._fsp--;


                    				current = this_FeaturePackageMemberElement_3;
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


    // $ANTLR start "ruleNonFeatureMemberElement"
    // InternalAlf.g:854:1: ruleNonFeatureMemberElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' ) ) ;
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
        EObject lv_ownedMemberElement_0_0 = null;

        AntlrDatatypeRuleToken lv_memberName_2_0 = null;

        AntlrDatatypeRuleToken lv_memberName_7_0 = null;

        AntlrDatatypeRuleToken lv_memberName_12_0 = null;

        AntlrDatatypeRuleToken lv_memberName_19_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:860:2: ( ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' ) ) )
            // InternalAlf.g:861:2: ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' ) )
            {
            // InternalAlf.g:861:2: ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' ) )
            int alt18=5;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalAlf.g:862:3: ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) )
                    {
                    // InternalAlf.g:862:3: ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) )
                    // InternalAlf.g:863:4: (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition )
                    {
                    // InternalAlf.g:863:4: (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition )
                    // InternalAlf.g:864:5: lv_ownedMemberElement_0_0= ruleNonFeatureDefinition
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
                    // InternalAlf.g:882:3: (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
                    {
                    // InternalAlf.g:882:3: (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
                    // InternalAlf.g:883:4: otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getNonFeatureMemberElementAccess().getPackageKeyword_1_0());
                    			
                    // InternalAlf.g:887:4: ( (lv_memberName_2_0= ruleName ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalAlf.g:888:5: (lv_memberName_2_0= ruleName )
                            {
                            // InternalAlf.g:888:5: (lv_memberName_2_0= ruleName )
                            // InternalAlf.g:889:6: lv_memberName_2_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_21);
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

                    otherlv_3=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getNonFeatureMemberElementAccess().getIsKeyword_1_2());
                    			
                    // InternalAlf.g:910:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:911:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:911:5: ( ruleQualifiedName )
                    // InternalAlf.g:912:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementPackageCrossReference_1_3_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getNonFeatureMemberElementAccess().getSemicolonKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:932:3: (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    {
                    // InternalAlf.g:932:3: (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    // InternalAlf.g:933:4: otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getNonFeatureMemberElementAccess().getClassKeyword_2_0());
                    			
                    // InternalAlf.g:937:4: ( (lv_memberName_7_0= ruleName ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalAlf.g:938:5: (lv_memberName_7_0= ruleName )
                            {
                            // InternalAlf.g:938:5: (lv_memberName_7_0= ruleName )
                            // InternalAlf.g:939:6: lv_memberName_7_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_2_1_0());
                            					
                            pushFollow(FOLLOW_21);
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

                    otherlv_8=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getNonFeatureMemberElementAccess().getIsKeyword_2_2());
                    			
                    // InternalAlf.g:960:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:961:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:961:5: ( ruleQualifiedName )
                    // InternalAlf.g:962:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementClassCrossReference_2_3_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getNonFeatureMemberElementAccess().getSemicolonKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:982:3: (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' )
                    {
                    // InternalAlf.g:982:3: (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' )
                    // InternalAlf.g:983:4: otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';'
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_11, grammarAccess.getNonFeatureMemberElementAccess().getAssocKeyword_3_0());
                    			
                    // InternalAlf.g:987:4: ( (lv_memberName_12_0= ruleName ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalAlf.g:988:5: (lv_memberName_12_0= ruleName )
                            {
                            // InternalAlf.g:988:5: (lv_memberName_12_0= ruleName )
                            // InternalAlf.g:989:6: lv_memberName_12_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_3_1_0());
                            					
                            pushFollow(FOLLOW_21);
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

                    otherlv_13=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getNonFeatureMemberElementAccess().getIsKeyword_3_2());
                    			
                    // InternalAlf.g:1010:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1011:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1011:5: ( ruleQualifiedName )
                    // InternalAlf.g:1012:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementAssociationCrossReference_3_3_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getNonFeatureMemberElementAccess().getSemicolonKeyword_3_4());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAlf.g:1032:3: (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' )
                    {
                    // InternalAlf.g:1032:3: (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' )
                    // InternalAlf.g:1033:4: otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';'
                    {
                    otherlv_16=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_16, grammarAccess.getNonFeatureMemberElementAccess().getImportKeyword_4_0());
                    			
                    // InternalAlf.g:1037:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1038:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1038:5: ( ruleQualifiedName )
                    // InternalAlf.g:1039:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementElementCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:1053:4: (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==20) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalAlf.g:1054:5: otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) )
                            {
                            otherlv_18=(Token)match(input,20,FOLLOW_10); 

                            					newLeafNode(otherlv_18, grammarAccess.getNonFeatureMemberElementAccess().getAsKeyword_4_2_0());
                            				
                            // InternalAlf.g:1058:5: ( (lv_memberName_19_0= ruleName ) )
                            // InternalAlf.g:1059:6: (lv_memberName_19_0= ruleName )
                            {
                            // InternalAlf.g:1059:6: (lv_memberName_19_0= ruleName )
                            // InternalAlf.g:1060:7: lv_memberName_19_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_4_2_1_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_memberName_19_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNonFeatureMemberElementRule());
                            							}
                            							set(
                            								current,
                            								"memberName",
                            								lv_memberName_19_0,
                            								"org.omg.sysml.Alf.Name");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_20=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_20, grammarAccess.getNonFeatureMemberElementAccess().getSemicolonKeyword_4_3());
                    			

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
    // InternalAlf.g:1088:1: ruleFeaturePackageMemberElement[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) ) ;
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
            // InternalAlf.g:1094:2: ( ( ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) ) )
            // InternalAlf.g:1095:2: ( ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) )
            {
            // InternalAlf.g:1095:2: ( ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA22_4 = input.LA(3);

                    if ( (LA22_4==19||LA22_4==22||(LA22_4>=35 && LA22_4<=36)||LA22_4==39||(LA22_4>=42 && LA22_4<=43)) ) {
                        alt22=1;
                    }
                    else if ( (LA22_4==24) ) {
                        alt22=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA22_5 = input.LA(3);

                    if ( (LA22_5==19||LA22_5==22||(LA22_5>=35 && LA22_5<=36)||LA22_5==39||(LA22_5>=42 && LA22_5<=43)) ) {
                        alt22=1;
                    }
                    else if ( (LA22_5==24) ) {
                        alt22=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 24:
                    {
                    alt22=3;
                    }
                    break;
                case 42:
                case 43:
                    {
                    alt22=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==24) ) {
                    alt22=3;
                }
                else if ( (LA22_2==19||LA22_2==22||(LA22_2>=35 && LA22_2<=36)||LA22_2==39||(LA22_2>=42 && LA22_2<=43)) ) {
                    alt22=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA22_3 = input.LA(2);

                if ( (LA22_3==24) ) {
                    alt22=3;
                }
                else if ( (LA22_3==19||LA22_3==22||(LA22_3>=35 && LA22_3<=36)||LA22_3==39||(LA22_3>=42 && LA22_3<=43)) ) {
                    alt22=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalAlf.g:1096:3: ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1096:3: ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1097:4: (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1097:4: (otherlv_0= 'feature' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==27) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalAlf.g:1098:5: otherlv_0= 'feature'
                            {
                            otherlv_0=(Token)match(input,27,FOLLOW_22); 

                            					newLeafNode(otherlv_0, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_0_0());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1103:4: ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1104:5: (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1104:5: (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1105:6: lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:1124:3: (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1124:3: (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:1125:4: otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_1_0());
                    			
                    // InternalAlf.g:1129:4: ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:1130:5: (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:1130:5: (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:1131:6: lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition
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
                    // InternalAlf.g:1150:3: ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' )
                    {
                    // InternalAlf.g:1150:3: ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' )
                    // InternalAlf.g:1151:4: ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';'
                    {
                    // InternalAlf.g:1151:4: ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==27) ) {
                        alt21=1;
                    }
                    else if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalAlf.g:1152:5: (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? )
                            {
                            // InternalAlf.g:1152:5: (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? )
                            // InternalAlf.g:1153:6: otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )?
                            {
                            otherlv_4=(Token)match(input,27,FOLLOW_20); 

                            						newLeafNode(otherlv_4, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_2_0_0_0());
                            					
                            // InternalAlf.g:1157:6: ( (lv_memberName_5_0= ruleName ) )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // InternalAlf.g:1158:7: (lv_memberName_5_0= ruleName )
                                    {
                                    // InternalAlf.g:1158:7: (lv_memberName_5_0= ruleName )
                                    // InternalAlf.g:1159:8: lv_memberName_5_0= ruleName
                                    {

                                    								newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getMemberNameNameParserRuleCall_2_0_0_1_0());
                                    							
                                    pushFollow(FOLLOW_21);
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
                            // InternalAlf.g:1178:5: ( (lv_memberName_6_0= ruleName ) )
                            {
                            // InternalAlf.g:1178:5: ( (lv_memberName_6_0= ruleName ) )
                            // InternalAlf.g:1179:6: (lv_memberName_6_0= ruleName )
                            {
                            // InternalAlf.g:1179:6: (lv_memberName_6_0= ruleName )
                            // InternalAlf.g:1180:7: lv_memberName_6_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getMemberNameNameParserRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_21);
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

                    otherlv_7=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getFeaturePackageMemberElementAccess().getIsKeyword_2_1());
                    			
                    // InternalAlf.g:1202:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1203:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1203:5: ( ruleQualifiedName )
                    // InternalAlf.g:1204:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeaturePackageMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getMemberElementFeatureCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRuleClassDefinitionOrStub"
    // InternalAlf.g:1227:1: entryRuleClassDefinitionOrStub returns [EObject current=null] : iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF ;
    public final EObject entryRuleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:1227:62: (iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:1228:2: iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF
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
    // InternalAlf.g:1234:1: ruleClassDefinitionOrStub returns [EObject current=null] : this_ClassDefinition_0= ruleClassDefinition[$current] ;
    public final EObject ruleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1240:2: (this_ClassDefinition_0= ruleClassDefinition[$current] )
            // InternalAlf.g:1241:2: this_ClassDefinition_0= ruleClassDefinition[$current]
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
    // InternalAlf.g:1256:1: ruleClassDefinition[EObject in_current] returns [EObject current=in_current] : (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_ClassBody_1= ruleClassBody[$current] ) ;
    public final EObject ruleClassDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_ClassDeclaration_0 = null;

        EObject this_ClassBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1262:2: ( (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_ClassBody_1= ruleClassBody[$current] ) )
            // InternalAlf.g:1263:2: (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_ClassBody_1= ruleClassBody[$current] )
            {
            // InternalAlf.g:1263:2: (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_ClassBody_1= ruleClassBody[$current] )
            // InternalAlf.g:1264:3: this_ClassDeclaration_0= ruleClassDeclaration[$current] this_ClassBody_1= ruleClassBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getClassDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getClassDefinitionAccess().getClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_ClassDeclaration_0=ruleClassDeclaration(current);

            state._fsp--;


            			current = this_ClassDeclaration_0;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getClassDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getClassDefinitionAccess().getClassBodyParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_ClassBody_1=ruleClassBody(current);

            state._fsp--;


            			current = this_ClassBody_1;
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
    // InternalAlf.g:1291:1: ruleClassDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? ) ;
    public final EObject ruleClassDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedElement_5_0 = null;

        EObject lv_ownedElement_7_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1297:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? ) )
            // InternalAlf.g:1298:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? )
            {
            // InternalAlf.g:1298:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? )
            // InternalAlf.g:1299:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )?
            {
            // InternalAlf.g:1299:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAlf.g:1300:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:1300:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:1301:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,28,FOLLOW_24); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDeclarationAccess().getClassKeyword_1());
            		
            // InternalAlf.g:1317:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:1318:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:1318:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:1319:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getClassDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_name_2_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:1336:3: ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24||LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAlf.g:1337:4: (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )*
                    {
                    // InternalAlf.g:1337:4: (otherlv_3= 'is' | otherlv_4= 'specializes' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==24) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==29) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalAlf.g:1338:5: otherlv_3= 'is'
                            {
                            otherlv_3=(Token)match(input,24,FOLLOW_10); 

                            					newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getIsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1343:5: otherlv_4= 'specializes'
                            {
                            otherlv_4=(Token)match(input,29,FOLLOW_10); 

                            					newLeafNode(otherlv_4, grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1348:4: ( (lv_ownedElement_5_0= ruleGeneralization ) )
                    // InternalAlf.g:1349:5: (lv_ownedElement_5_0= ruleGeneralization )
                    {
                    // InternalAlf.g:1349:5: (lv_ownedElement_5_0= ruleGeneralization )
                    // InternalAlf.g:1350:6: lv_ownedElement_5_0= ruleGeneralization
                    {

                    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedElementGeneralizationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_ownedElement_5_0=ruleGeneralization();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"ownedElement",
                    							lv_ownedElement_5_0,
                    							"org.omg.sysml.Alf.Generalization");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:1367:4: (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==30) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalAlf.g:1368:5: otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) )
                    	    {
                    	    otherlv_6=(Token)match(input,30,FOLLOW_10); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:1372:5: ( (lv_ownedElement_7_0= ruleGeneralization ) )
                    	    // InternalAlf.g:1373:6: (lv_ownedElement_7_0= ruleGeneralization )
                    	    {
                    	    // InternalAlf.g:1373:6: (lv_ownedElement_7_0= ruleGeneralization )
                    	    // InternalAlf.g:1374:7: lv_ownedElement_7_0= ruleGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedElementGeneralizationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    lv_ownedElement_7_0=ruleGeneralization();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedElement",
                    	    								lv_ownedElement_7_0,
                    	    								"org.omg.sysml.Alf.Generalization");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
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
    // $ANTLR end "ruleClassDeclaration"


    // $ANTLR start "ruleClassBody"
    // InternalAlf.g:1398:1: ruleClassBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleClassMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleClassBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_ownedMembership_1_0 = null;

        EObject lv_ownedImport_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1404:2: ( (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleClassMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' ) )
            // InternalAlf.g:1405:2: (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleClassMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' )
            {
            // InternalAlf.g:1405:2: (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleClassMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' )
            // InternalAlf.g:1406:3: otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleClassMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getClassBodyAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAlf.g:1410:3: ( ( (lv_ownedMembership_1_0= ruleClassMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )*
            loop27:
            do {
                int alt27=3;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // InternalAlf.g:1411:4: ( (lv_ownedMembership_1_0= ruleClassMember ) )
            	    {
            	    // InternalAlf.g:1411:4: ( (lv_ownedMembership_1_0= ruleClassMember ) )
            	    // InternalAlf.g:1412:5: (lv_ownedMembership_1_0= ruleClassMember )
            	    {
            	    // InternalAlf.g:1412:5: (lv_ownedMembership_1_0= ruleClassMember )
            	    // InternalAlf.g:1413:6: lv_ownedMembership_1_0= ruleClassMember
            	    {

            	    						newCompositeNode(grammarAccess.getClassBodyAccess().getOwnedMembershipClassMemberParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_ownedMembership_1_0=ruleClassMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClassBodyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedMembership",
            	    							lv_ownedMembership_1_0,
            	    							"org.omg.sysml.Alf.ClassMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:1431:4: ( (lv_ownedImport_2_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:1431:4: ( (lv_ownedImport_2_0= rulePackageImport ) )
            	    // InternalAlf.g:1432:5: (lv_ownedImport_2_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:1432:5: (lv_ownedImport_2_0= rulePackageImport )
            	    // InternalAlf.g:1433:6: lv_ownedImport_2_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getClassBodyAccess().getOwnedImportPackageImportParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_ownedImport_2_0=rulePackageImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClassBodyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedImport",
            	    							lv_ownedImport_2_0,
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

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getClassBodyAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassBody"


    // $ANTLR start "entryRuleGeneralization"
    // InternalAlf.g:1459:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalAlf.g:1459:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalAlf.g:1460:2: iv_ruleGeneralization= ruleGeneralization EOF
            {
             newCompositeNode(grammarAccess.getGeneralizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralization=ruleGeneralization();

            state._fsp--;

             current =iv_ruleGeneralization; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralization"


    // $ANTLR start "ruleGeneralization"
    // InternalAlf.g:1466:1: ruleGeneralization returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:1472:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:1473:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:1473:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1474:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:1474:3: ( ruleQualifiedName )
            // InternalAlf.g:1475:4: ruleQualifiedName
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getGeneralizationRule());
            				}
            			

            				newCompositeNode(grammarAccess.getGeneralizationAccess().getGeneralClassCrossReference_0());
            			
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
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleClassMember"
    // InternalAlf.g:1492:1: entryRuleClassMember returns [EObject current=null] : iv_ruleClassMember= ruleClassMember EOF ;
    public final EObject entryRuleClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassMember = null;


        try {
            // InternalAlf.g:1492:52: (iv_ruleClassMember= ruleClassMember EOF )
            // InternalAlf.g:1493:2: iv_ruleClassMember= ruleClassMember EOF
            {
             newCompositeNode(grammarAccess.getClassMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassMember=ruleClassMember();

            state._fsp--;

             current =iv_ruleClassMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassMember"


    // $ANTLR start "ruleClassMember"
    // InternalAlf.g:1499:1: ruleClassMember returns [EObject current=null] : (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_FeatureClassMember_1= ruleFeatureClassMember ) ;
    public final EObject ruleClassMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureClassMember_0 = null;

        EObject this_FeatureClassMember_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1505:2: ( (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_FeatureClassMember_1= ruleFeatureClassMember ) )
            // InternalAlf.g:1506:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_FeatureClassMember_1= ruleFeatureClassMember )
            {
            // InternalAlf.g:1506:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_FeatureClassMember_1= ruleFeatureClassMember )
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalAlf.g:1507:3: this_NonFeatureClassMember_0= ruleNonFeatureClassMember
                    {

                    			newCompositeNode(grammarAccess.getClassMemberAccess().getNonFeatureClassMemberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonFeatureClassMember_0=ruleNonFeatureClassMember();

                    state._fsp--;


                    			current = this_NonFeatureClassMember_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:1516:3: this_FeatureClassMember_1= ruleFeatureClassMember
                    {

                    			newCompositeNode(grammarAccess.getClassMemberAccess().getFeatureClassMemberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureClassMember_1=ruleFeatureClassMember();

                    state._fsp--;


                    			current = this_FeatureClassMember_1;
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
    // $ANTLR end "ruleClassMember"


    // $ANTLR start "entryRuleNonFeatureClassMember"
    // InternalAlf.g:1528:1: entryRuleNonFeatureClassMember returns [EObject current=null] : iv_ruleNonFeatureClassMember= ruleNonFeatureClassMember EOF ;
    public final EObject entryRuleNonFeatureClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureClassMember = null;


        try {
            // InternalAlf.g:1528:62: (iv_ruleNonFeatureClassMember= ruleNonFeatureClassMember EOF )
            // InternalAlf.g:1529:2: iv_ruleNonFeatureClassMember= ruleNonFeatureClassMember EOF
            {
             newCompositeNode(grammarAccess.getNonFeatureClassMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonFeatureClassMember=ruleNonFeatureClassMember();

            state._fsp--;

             current =iv_ruleNonFeatureClassMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonFeatureClassMember"


    // $ANTLR start "ruleNonFeatureClassMember"
    // InternalAlf.g:1535:1: ruleNonFeatureClassMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? this_NonFeatureMemberElement_2= ruleNonFeatureMemberElement[$current] ) ;
    public final EObject ruleNonFeatureClassMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedElement_0_0 = null;

        Enumerator lv_visibility_1_0 = null;

        EObject this_NonFeatureMemberElement_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:1541:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? this_NonFeatureMemberElement_2= ruleNonFeatureMemberElement[$current] ) )
            // InternalAlf.g:1542:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? this_NonFeatureMemberElement_2= ruleNonFeatureMemberElement[$current] )
            {
            // InternalAlf.g:1542:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? this_NonFeatureMemberElement_2= ruleNonFeatureMemberElement[$current] )
            // InternalAlf.g:1543:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? this_NonFeatureMemberElement_2= ruleNonFeatureMemberElement[$current]
            {
            // InternalAlf.g:1543:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAlf.g:1544:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:1544:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:1545:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getNonFeatureClassMemberAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_ownedElement_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNonFeatureClassMemberRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedElement",
            	    						lv_ownedElement_0_0,
            	    						"org.omg.sysml.Alf.Comment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalAlf.g:1562:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=55 && LA30_0<=58)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAlf.g:1563:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:1563:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:1564:5: lv_visibility_1_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getNonFeatureClassMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_visibility_1_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNonFeatureClassMemberRule());
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


            			if (current==null) {
            				current = createModelElement(grammarAccess.getNonFeatureClassMemberRule());
            			}
            			newCompositeNode(grammarAccess.getNonFeatureClassMemberAccess().getNonFeatureMemberElementParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_NonFeatureMemberElement_2=ruleNonFeatureMemberElement(current);

            state._fsp--;


            			current = this_NonFeatureMemberElement_2;
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
    // $ANTLR end "ruleNonFeatureClassMember"


    // $ANTLR start "entryRuleFeatureClassMember"
    // InternalAlf.g:1596:1: entryRuleFeatureClassMember returns [EObject current=null] : iv_ruleFeatureClassMember= ruleFeatureClassMember EOF ;
    public final EObject entryRuleFeatureClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureClassMember = null;


        try {
            // InternalAlf.g:1596:59: (iv_ruleFeatureClassMember= ruleFeatureClassMember EOF )
            // InternalAlf.g:1597:2: iv_ruleFeatureClassMember= ruleFeatureClassMember EOF
            {
             newCompositeNode(grammarAccess.getFeatureClassMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureClassMember=ruleFeatureClassMember();

            state._fsp--;

             current =iv_ruleFeatureClassMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureClassMember"


    // $ANTLR start "ruleFeatureClassMember"
    // InternalAlf.g:1603:1: ruleFeatureClassMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) ) ;
    public final EObject ruleFeatureClassMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_isComposite_3_0=null;
        Token lv_isPort_4_0=null;
        Token otherlv_7=null;
        Token lv_isComposite_8_0=null;
        Token lv_isPort_9_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_isComposite_15_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_ownedElement_0_0 = null;

        Enumerator lv_visibility_1_0 = null;

        Enumerator lv_direction_5_0 = null;

        EObject lv_ownedMemberElement_6_0 = null;

        Enumerator lv_direction_10_0 = null;

        EObject lv_ownedMemberElement_11_0 = null;

        EObject lv_ownedMemberElement_13_0 = null;

        AntlrDatatypeRuleToken lv_memberName_16_0 = null;

        AntlrDatatypeRuleToken lv_memberName_17_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1609:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) ) )
            // InternalAlf.g:1610:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) )
            {
            // InternalAlf.g:1610:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) )
            // InternalAlf.g:1611:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) )
            {
            // InternalAlf.g:1611:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAlf.g:1612:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:1612:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:1613:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_ownedElement_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureClassMemberRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedElement",
            	    						lv_ownedElement_0_0,
            	    						"org.omg.sysml.Alf.Comment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalAlf.g:1630:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=55 && LA32_0<=58)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAlf.g:1631:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:1631:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:1632:5: lv_visibility_1_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_31);
                    lv_visibility_1_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFeatureClassMemberRule());
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

            // InternalAlf.g:1649:3: ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) )
            int alt40=4;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // InternalAlf.g:1650:4: ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1650:4: ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1651:5: (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1651:5: (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )?
                    int alt33=4;
                    switch ( input.LA(1) ) {
                        case 27:
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
                    }

                    switch (alt33) {
                        case 1 :
                            // InternalAlf.g:1652:6: otherlv_2= 'feature'
                            {
                            otherlv_2=(Token)match(input,27,FOLLOW_32); 

                            						newLeafNode(otherlv_2, grammarAccess.getFeatureClassMemberAccess().getFeatureKeyword_2_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1657:6: ( (lv_isComposite_3_0= 'part' ) )
                            {
                            // InternalAlf.g:1657:6: ( (lv_isComposite_3_0= 'part' ) )
                            // InternalAlf.g:1658:7: (lv_isComposite_3_0= 'part' )
                            {
                            // InternalAlf.g:1658:7: (lv_isComposite_3_0= 'part' )
                            // InternalAlf.g:1659:8: lv_isComposite_3_0= 'part'
                            {
                            lv_isComposite_3_0=(Token)match(input,31,FOLLOW_32); 

                            								newLeafNode(lv_isComposite_3_0, grammarAccess.getFeatureClassMemberAccess().getIsCompositePartKeyword_2_0_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getFeatureClassMemberRule());
                            								}
                            								setWithLastConsumed(current, "isComposite", true, "part");
                            							

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAlf.g:1672:6: ( (lv_isPort_4_0= 'port' ) )
                            {
                            // InternalAlf.g:1672:6: ( (lv_isPort_4_0= 'port' ) )
                            // InternalAlf.g:1673:7: (lv_isPort_4_0= 'port' )
                            {
                            // InternalAlf.g:1673:7: (lv_isPort_4_0= 'port' )
                            // InternalAlf.g:1674:8: lv_isPort_4_0= 'port'
                            {
                            lv_isPort_4_0=(Token)match(input,32,FOLLOW_32); 

                            								newLeafNode(lv_isPort_4_0, grammarAccess.getFeatureClassMemberAccess().getIsPortPortKeyword_2_0_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getFeatureClassMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPort", true, "port");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1687:5: ( (lv_direction_5_0= ruleFeatureDirection ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=59 && LA34_0<=61)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalAlf.g:1688:6: (lv_direction_5_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1688:6: (lv_direction_5_0= ruleFeatureDirection )
                            // InternalAlf.g:1689:7: lv_direction_5_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getDirectionFeatureDirectionEnumRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_22);
                            lv_direction_5_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFeatureClassMemberRule());
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

                    // InternalAlf.g:1706:5: ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1707:6: (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1707:6: (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1708:7: lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getOwnedMemberElementNamedFeatureDefinitionParserRuleCall_2_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_6_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeatureClassMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_6_0,
                    								"org.omg.sysml.Alf.NamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1727:4: ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1727:4: ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:1728:5: (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1728:5: (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )
                    int alt35=3;
                    switch ( input.LA(1) ) {
                    case 27:
                        {
                        alt35=1;
                        }
                        break;
                    case 31:
                        {
                        alt35=2;
                        }
                        break;
                    case 32:
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
                            // InternalAlf.g:1729:6: otherlv_7= 'feature'
                            {
                            otherlv_7=(Token)match(input,27,FOLLOW_33); 

                            						newLeafNode(otherlv_7, grammarAccess.getFeatureClassMemberAccess().getFeatureKeyword_2_1_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1734:6: ( (lv_isComposite_8_0= 'part' ) )
                            {
                            // InternalAlf.g:1734:6: ( (lv_isComposite_8_0= 'part' ) )
                            // InternalAlf.g:1735:7: (lv_isComposite_8_0= 'part' )
                            {
                            // InternalAlf.g:1735:7: (lv_isComposite_8_0= 'part' )
                            // InternalAlf.g:1736:8: lv_isComposite_8_0= 'part'
                            {
                            lv_isComposite_8_0=(Token)match(input,31,FOLLOW_33); 

                            								newLeafNode(lv_isComposite_8_0, grammarAccess.getFeatureClassMemberAccess().getIsCompositePartKeyword_2_1_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getFeatureClassMemberRule());
                            								}
                            								setWithLastConsumed(current, "isComposite", true, "part");
                            							

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAlf.g:1749:6: ( (lv_isPort_9_0= 'port' ) )
                            {
                            // InternalAlf.g:1749:6: ( (lv_isPort_9_0= 'port' ) )
                            // InternalAlf.g:1750:7: (lv_isPort_9_0= 'port' )
                            {
                            // InternalAlf.g:1750:7: (lv_isPort_9_0= 'port' )
                            // InternalAlf.g:1751:8: lv_isPort_9_0= 'port'
                            {
                            lv_isPort_9_0=(Token)match(input,32,FOLLOW_33); 

                            								newLeafNode(lv_isPort_9_0, grammarAccess.getFeatureClassMemberAccess().getIsPortPortKeyword_2_1_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getFeatureClassMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPort", true, "port");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1764:5: ( (lv_direction_10_0= ruleFeatureDirection ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( ((LA36_0>=59 && LA36_0<=61)) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalAlf.g:1765:6: (lv_direction_10_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1765:6: (lv_direction_10_0= ruleFeatureDirection )
                            // InternalAlf.g:1766:7: lv_direction_10_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getDirectionFeatureDirectionEnumRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_23);
                            lv_direction_10_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFeatureClassMemberRule());
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

                    // InternalAlf.g:1783:5: ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:1784:6: (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:1784:6: (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:1785:7: lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getOwnedMemberElementUnnamedFeatureDefinitionParserRuleCall_2_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_11_0=ruleUnnamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeatureClassMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_11_0,
                    								"org.omg.sysml.Alf.UnnamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1804:4: (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) )
                    {
                    // InternalAlf.g:1804:4: (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) )
                    // InternalAlf.g:1805:5: otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) )
                    {
                    otherlv_12=(Token)match(input,33,FOLLOW_34); 

                    					newLeafNode(otherlv_12, grammarAccess.getFeatureClassMemberAccess().getConnectorKeyword_2_2_0());
                    				
                    // InternalAlf.g:1809:5: ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) )
                    // InternalAlf.g:1810:6: (lv_ownedMemberElement_13_0= ruleConnectorDefinition )
                    {
                    // InternalAlf.g:1810:6: (lv_ownedMemberElement_13_0= ruleConnectorDefinition )
                    // InternalAlf.g:1811:7: lv_ownedMemberElement_13_0= ruleConnectorDefinition
                    {

                    							newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getOwnedMemberElementConnectorDefinitionParserRuleCall_2_2_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_13_0=ruleConnectorDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeatureClassMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_13_0,
                    								"org.omg.sysml.Alf.ConnectorDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1830:4: ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' )
                    {
                    // InternalAlf.g:1830:4: ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' )
                    // InternalAlf.g:1831:5: ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';'
                    {
                    // InternalAlf.g:1831:5: ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==27||LA39_0==31) ) {
                        alt39=1;
                    }
                    else if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalAlf.g:1832:6: ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? )
                            {
                            // InternalAlf.g:1832:6: ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? )
                            // InternalAlf.g:1833:7: (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )?
                            {
                            // InternalAlf.g:1833:7: (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) )
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( (LA37_0==27) ) {
                                alt37=1;
                            }
                            else if ( (LA37_0==31) ) {
                                alt37=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 37, 0, input);

                                throw nvae;
                            }
                            switch (alt37) {
                                case 1 :
                                    // InternalAlf.g:1834:8: otherlv_14= 'feature'
                                    {
                                    otherlv_14=(Token)match(input,27,FOLLOW_20); 

                                    								newLeafNode(otherlv_14, grammarAccess.getFeatureClassMemberAccess().getFeatureKeyword_2_3_0_0_0_0());
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:1839:8: ( (lv_isComposite_15_0= 'part' ) )
                                    {
                                    // InternalAlf.g:1839:8: ( (lv_isComposite_15_0= 'part' ) )
                                    // InternalAlf.g:1840:9: (lv_isComposite_15_0= 'part' )
                                    {
                                    // InternalAlf.g:1840:9: (lv_isComposite_15_0= 'part' )
                                    // InternalAlf.g:1841:10: lv_isComposite_15_0= 'part'
                                    {
                                    lv_isComposite_15_0=(Token)match(input,31,FOLLOW_20); 

                                    										newLeafNode(lv_isComposite_15_0, grammarAccess.getFeatureClassMemberAccess().getIsCompositePartKeyword_2_3_0_0_0_1_0());
                                    									

                                    										if (current==null) {
                                    											current = createModelElement(grammarAccess.getFeatureClassMemberRule());
                                    										}
                                    										setWithLastConsumed(current, "isComposite", true, "part");
                                    									

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalAlf.g:1854:7: ( (lv_memberName_16_0= ruleName ) )?
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt38=1;
                            }
                            switch (alt38) {
                                case 1 :
                                    // InternalAlf.g:1855:8: (lv_memberName_16_0= ruleName )
                                    {
                                    // InternalAlf.g:1855:8: (lv_memberName_16_0= ruleName )
                                    // InternalAlf.g:1856:9: lv_memberName_16_0= ruleName
                                    {

                                    									newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getMemberNameNameParserRuleCall_2_3_0_0_1_0());
                                    								
                                    pushFollow(FOLLOW_21);
                                    lv_memberName_16_0=ruleName();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getFeatureClassMemberRule());
                                    									}
                                    									set(
                                    										current,
                                    										"memberName",
                                    										lv_memberName_16_0,
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
                            // InternalAlf.g:1875:6: ( (lv_memberName_17_0= ruleName ) )
                            {
                            // InternalAlf.g:1875:6: ( (lv_memberName_17_0= ruleName ) )
                            // InternalAlf.g:1876:7: (lv_memberName_17_0= ruleName )
                            {
                            // InternalAlf.g:1876:7: (lv_memberName_17_0= ruleName )
                            // InternalAlf.g:1877:8: lv_memberName_17_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getMemberNameNameParserRuleCall_2_3_0_1_0());
                            							
                            pushFollow(FOLLOW_21);
                            lv_memberName_17_0=ruleName();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getFeatureClassMemberRule());
                            								}
                            								set(
                            									current,
                            									"memberName",
                            									lv_memberName_17_0,
                            									"org.omg.sysml.Alf.Name");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }

                    otherlv_18=(Token)match(input,24,FOLLOW_10); 

                    					newLeafNode(otherlv_18, grammarAccess.getFeatureClassMemberAccess().getIsKeyword_2_3_1());
                    				
                    // InternalAlf.g:1899:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1900:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1900:6: ( ruleQualifiedName )
                    // InternalAlf.g:1901:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFeatureClassMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getMemberElementFeatureCrossReference_2_3_2_0());
                    						
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_20=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_20, grammarAccess.getFeatureClassMemberAccess().getSemicolonKeyword_2_3_3());
                    				

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
    // $ANTLR end "ruleFeatureClassMember"


    // $ANTLR start "entryRuleAssociationDefinitionOrStub"
    // InternalAlf.g:1925:1: entryRuleAssociationDefinitionOrStub returns [EObject current=null] : iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF ;
    public final EObject entryRuleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinitionOrStub = null;


        try {
            // InternalAlf.g:1925:68: (iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF )
            // InternalAlf.g:1926:2: iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF
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
    // InternalAlf.g:1932:1: ruleAssociationDefinitionOrStub returns [EObject current=null] : this_AssociationDefinition_0= ruleAssociationDefinition[$current] ;
    public final EObject ruleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_AssociationDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1938:2: (this_AssociationDefinition_0= ruleAssociationDefinition[$current] )
            // InternalAlf.g:1939:2: this_AssociationDefinition_0= ruleAssociationDefinition[$current]
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
    // InternalAlf.g:1954:1: ruleAssociationDefinition[EObject in_current] returns [EObject current=in_current] : (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] ) ;
    public final EObject ruleAssociationDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_AssociationDeclaration_0 = null;

        EObject this_AssociationBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1960:2: ( (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] ) )
            // InternalAlf.g:1961:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] )
            {
            // InternalAlf.g:1961:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] )
            // InternalAlf.g:1962:3: this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getAssociationDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
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
    // InternalAlf.g:1989:1: ruleAssociationDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? ) ;
    public final EObject ruleAssociationDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedElement_5_0 = null;

        EObject lv_ownedElement_7_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1995:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? ) )
            // InternalAlf.g:1996:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? )
            {
            // InternalAlf.g:1996:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? )
            // InternalAlf.g:1997:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )?
            {
            // InternalAlf.g:1997:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==28) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAlf.g:1998:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:1998:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:1999:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,28,FOLLOW_35); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getAssociationDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociationDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationDeclarationAccess().getAssocKeyword_1());
            		
            // InternalAlf.g:2015:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:2016:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:2016:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:2017:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalAlf.g:2034:3: ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==24||LA44_0==29) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAlf.g:2035:4: (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )*
                    {
                    // InternalAlf.g:2035:4: (otherlv_3= 'is' | otherlv_4= 'specializes' )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==24) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==29) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalAlf.g:2036:5: otherlv_3= 'is'
                            {
                            otherlv_3=(Token)match(input,24,FOLLOW_10); 

                            					newLeafNode(otherlv_3, grammarAccess.getAssociationDeclarationAccess().getIsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2041:5: otherlv_4= 'specializes'
                            {
                            otherlv_4=(Token)match(input,29,FOLLOW_10); 

                            					newLeafNode(otherlv_4, grammarAccess.getAssociationDeclarationAccess().getSpecializesKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:2046:4: ( (lv_ownedElement_5_0= ruleGeneralization ) )
                    // InternalAlf.g:2047:5: (lv_ownedElement_5_0= ruleGeneralization )
                    {
                    // InternalAlf.g:2047:5: (lv_ownedElement_5_0= ruleGeneralization )
                    // InternalAlf.g:2048:6: lv_ownedElement_5_0= ruleGeneralization
                    {

                    						newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getOwnedElementGeneralizationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_ownedElement_5_0=ruleGeneralization();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssociationDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"ownedElement",
                    							lv_ownedElement_5_0,
                    							"org.omg.sysml.Alf.Generalization");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:2065:4: (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==30) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalAlf.g:2066:5: otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) )
                    	    {
                    	    otherlv_6=(Token)match(input,30,FOLLOW_10); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAssociationDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:2070:5: ( (lv_ownedElement_7_0= ruleGeneralization ) )
                    	    // InternalAlf.g:2071:6: (lv_ownedElement_7_0= ruleGeneralization )
                    	    {
                    	    // InternalAlf.g:2071:6: (lv_ownedElement_7_0= ruleGeneralization )
                    	    // InternalAlf.g:2072:7: lv_ownedElement_7_0= ruleGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getOwnedElementGeneralizationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    lv_ownedElement_7_0=ruleGeneralization();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssociationDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedElement",
                    	    								lv_ownedElement_7_0,
                    	    								"org.omg.sysml.Alf.Generalization");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
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
    // InternalAlf.g:2096:1: ruleAssociationBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleAssociationBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_ownedMembership_1_0 = null;

        EObject lv_ownedImport_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2102:2: ( (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' ) )
            // InternalAlf.g:2103:2: (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' )
            {
            // InternalAlf.g:2103:2: (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' )
            // InternalAlf.g:2104:3: otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationBodyAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAlf.g:2108:3: ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )*
            loop45:
            do {
                int alt45=3;
                alt45 = dfa45.predict(input);
                switch (alt45) {
            	case 1 :
            	    // InternalAlf.g:2109:4: ( (lv_ownedMembership_1_0= ruleAssociationMember ) )
            	    {
            	    // InternalAlf.g:2109:4: ( (lv_ownedMembership_1_0= ruleAssociationMember ) )
            	    // InternalAlf.g:2110:5: (lv_ownedMembership_1_0= ruleAssociationMember )
            	    {
            	    // InternalAlf.g:2110:5: (lv_ownedMembership_1_0= ruleAssociationMember )
            	    // InternalAlf.g:2111:6: lv_ownedMembership_1_0= ruleAssociationMember
            	    {

            	    						newCompositeNode(grammarAccess.getAssociationBodyAccess().getOwnedMembershipAssociationMemberParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_ownedMembership_1_0=ruleAssociationMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssociationBodyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedMembership",
            	    							lv_ownedMembership_1_0,
            	    							"org.omg.sysml.Alf.AssociationMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:2129:4: ( (lv_ownedImport_2_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:2129:4: ( (lv_ownedImport_2_0= rulePackageImport ) )
            	    // InternalAlf.g:2130:5: (lv_ownedImport_2_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:2130:5: (lv_ownedImport_2_0= rulePackageImport )
            	    // InternalAlf.g:2131:6: lv_ownedImport_2_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getAssociationBodyAccess().getOwnedImportPackageImportParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_ownedImport_2_0=rulePackageImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssociationBodyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedImport",
            	    							lv_ownedImport_2_0,
            	    							"org.omg.sysml.Alf.PackageImport");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationBodyAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

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
    // InternalAlf.g:2157:1: entryRuleAssociationMember returns [EObject current=null] : iv_ruleAssociationMember= ruleAssociationMember EOF ;
    public final EObject entryRuleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationMember = null;


        try {
            // InternalAlf.g:2157:58: (iv_ruleAssociationMember= ruleAssociationMember EOF )
            // InternalAlf.g:2158:2: iv_ruleAssociationMember= ruleAssociationMember EOF
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
    // InternalAlf.g:2164:1: ruleAssociationMember returns [EObject current=null] : (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember ) ;
    public final EObject ruleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureClassMember_0 = null;

        EObject this_AssociationFeatureMember_1 = null;

        EObject this_AssociationEndFeatureMember_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2170:2: ( (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember ) )
            // InternalAlf.g:2171:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )
            {
            // InternalAlf.g:2171:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )
            int alt46=3;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // InternalAlf.g:2172:3: this_NonFeatureClassMember_0= ruleNonFeatureClassMember
                    {

                    			newCompositeNode(grammarAccess.getAssociationMemberAccess().getNonFeatureClassMemberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonFeatureClassMember_0=ruleNonFeatureClassMember();

                    state._fsp--;


                    			current = this_NonFeatureClassMember_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:2181:3: this_AssociationFeatureMember_1= ruleAssociationFeatureMember
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
                    // InternalAlf.g:2190:3: this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember
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
    // InternalAlf.g:2202:1: entryRuleAssociationFeatureMember returns [EObject current=null] : iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF ;
    public final EObject entryRuleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationFeatureMember = null;


        try {
            // InternalAlf.g:2202:65: (iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF )
            // InternalAlf.g:2203:2: iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF
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
    // InternalAlf.g:2209:1: ruleAssociationFeatureMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) ) ;
    public final EObject ruleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_isComposite_3_0=null;
        Token lv_isPort_4_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_isComposite_10_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_ownedElement_0_0 = null;

        Enumerator lv_visibility_1_0 = null;

        Enumerator lv_direction_5_0 = null;

        EObject lv_ownedMemberElement_6_0 = null;

        EObject lv_ownedMemberElement_8_0 = null;

        AntlrDatatypeRuleToken lv_memberName_11_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2215:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) ) )
            // InternalAlf.g:2216:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) )
            {
            // InternalAlf.g:2216:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) )
            // InternalAlf.g:2217:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) )
            {
            // InternalAlf.g:2217:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalAlf.g:2218:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:2218:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:2219:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_ownedElement_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAssociationFeatureMemberRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedElement",
            	    						lv_ownedElement_0_0,
            	    						"org.omg.sysml.Alf.Comment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // InternalAlf.g:2236:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=55 && LA48_0<=58)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAlf.g:2237:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:2237:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:2238:5: lv_visibility_1_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_38);
                    lv_visibility_1_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssociationFeatureMemberRule());
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

            // InternalAlf.g:2255:3: ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) )
            int alt53=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA53_5 = input.LA(3);

                    if ( (LA53_5==24) ) {
                        alt53=3;
                    }
                    else if ( (LA53_5==19||LA53_5==22||(LA53_5>=35 && LA53_5<=36)||LA53_5==39||(LA53_5>=42 && LA53_5<=43)) ) {
                        alt53=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA53_6 = input.LA(3);

                    if ( (LA53_6==24) ) {
                        alt53=3;
                    }
                    else if ( (LA53_6==19||LA53_6==22||(LA53_6>=35 && LA53_6<=36)||LA53_6==39||(LA53_6>=42 && LA53_6<=43)) ) {
                        alt53=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case 24:
                    {
                    alt53=3;
                    }
                    break;
                case 42:
                case 43:
                case 59:
                case 60:
                case 61:
                    {
                    alt53=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }

                }
                break;
            case 31:
                {
                switch ( input.LA(2) ) {
                case 42:
                case 43:
                case 59:
                case 60:
                case 61:
                    {
                    alt53=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA53_5 = input.LA(3);

                    if ( (LA53_5==24) ) {
                        alt53=3;
                    }
                    else if ( (LA53_5==19||LA53_5==22||(LA53_5>=35 && LA53_5<=36)||LA53_5==39||(LA53_5>=42 && LA53_5<=43)) ) {
                        alt53=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA53_6 = input.LA(3);

                    if ( (LA53_6==24) ) {
                        alt53=3;
                    }
                    else if ( (LA53_6==19||LA53_6==22||(LA53_6>=35 && LA53_6<=36)||LA53_6==39||(LA53_6>=42 && LA53_6<=43)) ) {
                        alt53=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case 24:
                    {
                    alt53=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 2, input);

                    throw nvae;
                }

                }
                break;
            case 32:
                {
                alt53=1;
                }
                break;
            case 33:
                {
                alt53=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalAlf.g:2256:4: ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2256:4: ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) )
                    // InternalAlf.g:2257:5: (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) )
                    {
                    // InternalAlf.g:2257:5: (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )
                    int alt49=3;
                    switch ( input.LA(1) ) {
                    case 27:
                        {
                        alt49=1;
                        }
                        break;
                    case 31:
                        {
                        alt49=2;
                        }
                        break;
                    case 32:
                        {
                        alt49=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }

                    switch (alt49) {
                        case 1 :
                            // InternalAlf.g:2258:6: otherlv_2= 'feature'
                            {
                            otherlv_2=(Token)match(input,27,FOLLOW_39); 

                            						newLeafNode(otherlv_2, grammarAccess.getAssociationFeatureMemberAccess().getFeatureKeyword_2_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2263:6: ( (lv_isComposite_3_0= 'part' ) )
                            {
                            // InternalAlf.g:2263:6: ( (lv_isComposite_3_0= 'part' ) )
                            // InternalAlf.g:2264:7: (lv_isComposite_3_0= 'part' )
                            {
                            // InternalAlf.g:2264:7: (lv_isComposite_3_0= 'part' )
                            // InternalAlf.g:2265:8: lv_isComposite_3_0= 'part'
                            {
                            lv_isComposite_3_0=(Token)match(input,31,FOLLOW_39); 

                            								newLeafNode(lv_isComposite_3_0, grammarAccess.getAssociationFeatureMemberAccess().getIsCompositePartKeyword_2_0_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isComposite", true, "part");
                            							

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAlf.g:2278:6: ( (lv_isPort_4_0= 'port' ) )
                            {
                            // InternalAlf.g:2278:6: ( (lv_isPort_4_0= 'port' ) )
                            // InternalAlf.g:2279:7: (lv_isPort_4_0= 'port' )
                            {
                            // InternalAlf.g:2279:7: (lv_isPort_4_0= 'port' )
                            // InternalAlf.g:2280:8: lv_isPort_4_0= 'port'
                            {
                            lv_isPort_4_0=(Token)match(input,32,FOLLOW_39); 

                            								newLeafNode(lv_isPort_4_0, grammarAccess.getAssociationFeatureMemberAccess().getIsPortPortKeyword_2_0_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPort", true, "port");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:2293:5: ( (lv_direction_5_0= ruleFeatureDirection ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( ((LA50_0>=59 && LA50_0<=61)) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalAlf.g:2294:6: (lv_direction_5_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2294:6: (lv_direction_5_0= ruleFeatureDirection )
                            // InternalAlf.g:2295:7: lv_direction_5_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_39);
                            lv_direction_5_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAssociationFeatureMemberRule());
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

                    // InternalAlf.g:2312:5: ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) )
                    // InternalAlf.g:2313:6: (lv_ownedMemberElement_6_0= ruleFeatureDefinition )
                    {
                    // InternalAlf.g:2313:6: (lv_ownedMemberElement_6_0= ruleFeatureDefinition )
                    // InternalAlf.g:2314:7: lv_ownedMemberElement_6_0= ruleFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getOwnedMemberElementFeatureDefinitionParserRuleCall_2_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_6_0=ruleFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_6_0,
                    								"org.omg.sysml.Alf.FeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2333:4: (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) )
                    {
                    // InternalAlf.g:2333:4: (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) )
                    // InternalAlf.g:2334:5: otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_34); 

                    					newLeafNode(otherlv_7, grammarAccess.getAssociationFeatureMemberAccess().getConnectorKeyword_2_1_0());
                    				
                    // InternalAlf.g:2338:5: ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) )
                    // InternalAlf.g:2339:6: (lv_ownedMemberElement_8_0= ruleConnectorDefinition )
                    {
                    // InternalAlf.g:2339:6: (lv_ownedMemberElement_8_0= ruleConnectorDefinition )
                    // InternalAlf.g:2340:7: lv_ownedMemberElement_8_0= ruleConnectorDefinition
                    {

                    							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getOwnedMemberElementConnectorDefinitionParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_8_0=ruleConnectorDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_8_0,
                    								"org.omg.sysml.Alf.ConnectorDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:2359:4: ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' )
                    {
                    // InternalAlf.g:2359:4: ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' )
                    // InternalAlf.g:2360:5: (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';'
                    {
                    // InternalAlf.g:2360:5: (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==27) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==31) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalAlf.g:2361:6: otherlv_9= 'feature'
                            {
                            otherlv_9=(Token)match(input,27,FOLLOW_20); 

                            						newLeafNode(otherlv_9, grammarAccess.getAssociationFeatureMemberAccess().getFeatureKeyword_2_2_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2366:6: ( (lv_isComposite_10_0= 'part' ) )
                            {
                            // InternalAlf.g:2366:6: ( (lv_isComposite_10_0= 'part' ) )
                            // InternalAlf.g:2367:7: (lv_isComposite_10_0= 'part' )
                            {
                            // InternalAlf.g:2367:7: (lv_isComposite_10_0= 'part' )
                            // InternalAlf.g:2368:8: lv_isComposite_10_0= 'part'
                            {
                            lv_isComposite_10_0=(Token)match(input,31,FOLLOW_20); 

                            								newLeafNode(lv_isComposite_10_0, grammarAccess.getAssociationFeatureMemberAccess().getIsCompositePartKeyword_2_2_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isComposite", true, "part");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:2381:5: ( (lv_memberName_11_0= ruleName ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalAlf.g:2382:6: (lv_memberName_11_0= ruleName )
                            {
                            // InternalAlf.g:2382:6: (lv_memberName_11_0= ruleName )
                            // InternalAlf.g:2383:7: lv_memberName_11_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getMemberNameNameParserRuleCall_2_2_1_0());
                            						
                            pushFollow(FOLLOW_21);
                            lv_memberName_11_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAssociationFeatureMemberRule());
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

                    otherlv_12=(Token)match(input,24,FOLLOW_10); 

                    					newLeafNode(otherlv_12, grammarAccess.getAssociationFeatureMemberAccess().getIsKeyword_2_2_2());
                    				
                    // InternalAlf.g:2404:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:2405:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:2405:6: ( ruleQualifiedName )
                    // InternalAlf.g:2406:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getMemberElementFeatureCrossReference_2_2_3_0());
                    						
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_14=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_14, grammarAccess.getAssociationFeatureMemberAccess().getSemicolonKeyword_2_2_4());
                    				

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
    // $ANTLR end "ruleAssociationFeatureMember"


    // $ANTLR start "entryRuleAssociationEndFeatureMember"
    // InternalAlf.g:2430:1: entryRuleAssociationEndFeatureMember returns [EObject current=null] : iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF ;
    public final EObject entryRuleAssociationEndFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEndFeatureMember = null;


        try {
            // InternalAlf.g:2430:68: (iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF )
            // InternalAlf.g:2431:2: iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF
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
    // InternalAlf.g:2437:1: ruleAssociationEndFeatureMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) ) ;
    public final EObject ruleAssociationEndFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_ownedElement_0_0 = null;

        Enumerator lv_visibility_1_0 = null;

        Enumerator lv_direction_3_0 = null;

        EObject lv_ownedMemberElement_4_0 = null;

        Enumerator lv_direction_6_0 = null;

        EObject lv_ownedMemberElement_7_0 = null;

        AntlrDatatypeRuleToken lv_memberName_9_0 = null;

        AntlrDatatypeRuleToken lv_memberName_10_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2443:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) ) )
            // InternalAlf.g:2444:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) )
            {
            // InternalAlf.g:2444:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) )
            // InternalAlf.g:2445:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) )
            {
            // InternalAlf.g:2445:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalAlf.g:2446:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:2446:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:2447:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_40);
            	    lv_ownedElement_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedElement",
            	    						lv_ownedElement_0_0,
            	    						"org.omg.sysml.Alf.Comment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // InternalAlf.g:2464:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=55 && LA55_0<=58)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalAlf.g:2465:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:2465:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:2466:5: lv_visibility_1_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_41);
                    lv_visibility_1_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
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

            // InternalAlf.g:2483:3: ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) )
            int alt61=3;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // InternalAlf.g:2484:4: ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2484:4: ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:2485:5: (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:2485:5: (otherlv_2= 'end' )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==34) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalAlf.g:2486:6: otherlv_2= 'end'
                            {
                            otherlv_2=(Token)match(input,34,FOLLOW_32); 

                            						newLeafNode(otherlv_2, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_2_0_0());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:2491:5: ( (lv_direction_3_0= ruleFeatureDirection ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=59 && LA57_0<=61)) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalAlf.g:2492:6: (lv_direction_3_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2492:6: (lv_direction_3_0= ruleFeatureDirection )
                            // InternalAlf.g:2493:7: lv_direction_3_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_22);
                            lv_direction_3_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
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

                    // InternalAlf.g:2510:5: ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:2511:6: (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:2511:6: (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:2512:7: lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getOwnedMemberElementNamedFeatureDefinitionParserRuleCall_2_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_4_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_4_0,
                    								"org.omg.sysml.Alf.NamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2531:4: (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2531:4: (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:2532:5: otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_33); 

                    					newLeafNode(otherlv_5, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_2_1_0());
                    				
                    // InternalAlf.g:2536:5: ( (lv_direction_6_0= ruleFeatureDirection ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( ((LA58_0>=59 && LA58_0<=61)) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalAlf.g:2537:6: (lv_direction_6_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2537:6: (lv_direction_6_0= ruleFeatureDirection )
                            // InternalAlf.g:2538:7: lv_direction_6_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_23);
                            lv_direction_6_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
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

                    // InternalAlf.g:2555:5: ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:2556:6: (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:2556:6: (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:2557:7: lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getOwnedMemberElementUnnamedFeatureDefinitionParserRuleCall_2_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_7_0=ruleUnnamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_7_0,
                    								"org.omg.sysml.Alf.UnnamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:2576:4: ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' )
                    {
                    // InternalAlf.g:2576:4: ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' )
                    // InternalAlf.g:2577:5: ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';'
                    {
                    // InternalAlf.g:2577:5: ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) )
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==34) ) {
                        alt60=1;
                    }
                    else if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt60=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 0, input);

                        throw nvae;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalAlf.g:2578:6: (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? )
                            {
                            // InternalAlf.g:2578:6: (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? )
                            // InternalAlf.g:2579:7: otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )?
                            {
                            otherlv_8=(Token)match(input,34,FOLLOW_20); 

                            							newLeafNode(otherlv_8, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_2_2_0_0_0());
                            						
                            // InternalAlf.g:2583:7: ( (lv_memberName_9_0= ruleName ) )?
                            int alt59=2;
                            int LA59_0 = input.LA(1);

                            if ( ((LA59_0>=RULE_ID && LA59_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt59=1;
                            }
                            switch (alt59) {
                                case 1 :
                                    // InternalAlf.g:2584:8: (lv_memberName_9_0= ruleName )
                                    {
                                    // InternalAlf.g:2584:8: (lv_memberName_9_0= ruleName )
                                    // InternalAlf.g:2585:9: lv_memberName_9_0= ruleName
                                    {

                                    									newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberNameNameParserRuleCall_2_2_0_0_1_0());
                                    								
                                    pushFollow(FOLLOW_21);
                                    lv_memberName_9_0=ruleName();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                                    									}
                                    									set(
                                    										current,
                                    										"memberName",
                                    										lv_memberName_9_0,
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
                            // InternalAlf.g:2604:6: ( (lv_memberName_10_0= ruleName ) )
                            {
                            // InternalAlf.g:2604:6: ( (lv_memberName_10_0= ruleName ) )
                            // InternalAlf.g:2605:7: (lv_memberName_10_0= ruleName )
                            {
                            // InternalAlf.g:2605:7: (lv_memberName_10_0= ruleName )
                            // InternalAlf.g:2606:8: lv_memberName_10_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberNameNameParserRuleCall_2_2_0_1_0());
                            							
                            pushFollow(FOLLOW_21);
                            lv_memberName_10_0=ruleName();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                            								}
                            								set(
                            									current,
                            									"memberName",
                            									lv_memberName_10_0,
                            									"org.omg.sysml.Alf.Name");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,24,FOLLOW_10); 

                    					newLeafNode(otherlv_11, grammarAccess.getAssociationEndFeatureMemberAccess().getIsKeyword_2_2_1());
                    				
                    // InternalAlf.g:2628:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:2629:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:2629:6: ( ruleQualifiedName )
                    // InternalAlf.g:2630:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberElementFeatureCrossReference_2_2_2_0());
                    						
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_13=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_13, grammarAccess.getAssociationEndFeatureMemberAccess().getSemicolonKeyword_2_2_3());
                    				

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
    // InternalAlf.g:2654:1: entryRuleFeatureDefinition returns [EObject current=null] : iv_ruleFeatureDefinition= ruleFeatureDefinition EOF ;
    public final EObject entryRuleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDefinition = null;


        try {
            // InternalAlf.g:2654:58: (iv_ruleFeatureDefinition= ruleFeatureDefinition EOF )
            // InternalAlf.g:2655:2: iv_ruleFeatureDefinition= ruleFeatureDefinition EOF
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
    // InternalAlf.g:2661:1: ruleFeatureDefinition returns [EObject current=null] : (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) ;
    public final EObject ruleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_NamedFeatureDefinition_0 = null;

        EObject this_UnnamedFeatureDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2667:2: ( (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) )
            // InternalAlf.g:2668:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            {
            // InternalAlf.g:2668:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt62=1;
            }
            else if ( ((LA62_0>=42 && LA62_0<=43)) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalAlf.g:2669:3: this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:2678:3: this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition
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
    // InternalAlf.g:2690:1: entryRuleNamedFeatureDefinition returns [EObject current=null] : iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF ;
    public final EObject entryRuleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedFeatureDefinition = null;


        try {
            // InternalAlf.g:2690:63: (iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF )
            // InternalAlf.g:2691:2: iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF
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
    // InternalAlf.g:2697:1: ruleNamedFeatureDefinition returns [EObject current=null] : (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureDeclaration_0 = null;

        EObject this_FeatureCompletion_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2703:2: ( (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:2704:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:2704:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] )
            // InternalAlf.g:2705:3: this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getNamedFeatureDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getFeatureDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
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
    // InternalAlf.g:2731:1: entryRuleUnnamedFeatureDefinition returns [EObject current=null] : iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF ;
    public final EObject entryRuleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedFeatureDefinition = null;


        try {
            // InternalAlf.g:2731:65: (iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF )
            // InternalAlf.g:2732:2: iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF
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
    // InternalAlf.g:2738:1: ruleUnnamedFeatureDefinition returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? this_FeatureCompletion_3= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedElement_0_0 = null;

        EObject this_TypePart_1 = null;

        EObject this_Multiplicity_2 = null;

        EObject this_FeatureCompletion_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:2744:2: ( ( ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? this_FeatureCompletion_3= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:2745:2: ( ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? this_FeatureCompletion_3= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:2745:2: ( ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? this_FeatureCompletion_3= ruleFeatureCompletion[$current] )
            // InternalAlf.g:2746:3: ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? this_FeatureCompletion_3= ruleFeatureCompletion[$current]
            {
            // InternalAlf.g:2746:3: ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) )
            // InternalAlf.g:2747:4: (lv_ownedElement_0_0= ruleSubsetOrRedefinition )
            {
            // InternalAlf.g:2747:4: (lv_ownedElement_0_0= ruleSubsetOrRedefinition )
            // InternalAlf.g:2748:5: lv_ownedElement_0_0= ruleSubsetOrRedefinition
            {

            					newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedElementSubsetOrRedefinitionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_43);
            lv_ownedElement_0_0=ruleSubsetOrRedefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
            					}
            					add(
            						current,
            						"ownedElement",
            						lv_ownedElement_0_0,
            						"org.omg.sysml.Alf.SubsetOrRedefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:2765:3: (this_TypePart_1= ruleTypePart[$current] )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==36) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAlf.g:2766:4: this_TypePart_1= ruleTypePart[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getUnnamedFeatureDefinitionRule());
                    				}
                    				newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getTypePartParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_44);
                    this_TypePart_1=ruleTypePart(current);

                    state._fsp--;


                    				current = this_TypePart_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalAlf.g:2778:3: (this_Multiplicity_2= ruleMultiplicity[$current] )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==39) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalAlf.g:2779:4: this_Multiplicity_2= ruleMultiplicity[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getUnnamedFeatureDefinitionRule());
                    				}
                    				newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getMultiplicityParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_42);
                    this_Multiplicity_2=ruleMultiplicity(current);

                    state._fsp--;


                    				current = this_Multiplicity_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


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
    // InternalAlf.g:2807:1: ruleFeatureBodyDefinition[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_ClassBody_2= ruleClassBody[$current] ) ;
    public final EObject ruleFeatureBodyDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject this_FeatureDeclaration_1 = null;

        EObject this_ClassBody_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2813:2: ( (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_ClassBody_2= ruleClassBody[$current] ) )
            // InternalAlf.g:2814:2: (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_ClassBody_2= ruleClassBody[$current] )
            {
            // InternalAlf.g:2814:2: (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_ClassBody_2= ruleClassBody[$current] )
            // InternalAlf.g:2815:3: otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_ClassBody_2= ruleClassBody[$current]
            {
            otherlv_0=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureBodyDefinitionAccess().getFeatureKeyword_0());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureBodyDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureBodyDefinitionAccess().getFeatureDeclarationParserRuleCall_1());
            		
            pushFollow(FOLLOW_17);
            this_FeatureDeclaration_1=ruleFeatureDeclaration(current);

            state._fsp--;


            			current = this_FeatureDeclaration_1;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureBodyDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureBodyDefinitionAccess().getClassBodyParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_ClassBody_2=ruleClassBody(current);

            state._fsp--;


            			current = this_ClassBody_2;
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
    // InternalAlf.g:2846:1: ruleFeatureDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? ( (lv_ownedElement_3_0= ruleSubsetOrRedefinition ) )? ) ;
    public final EObject ruleFeatureDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject this_TypePart_1 = null;

        EObject this_Multiplicity_2 = null;

        EObject lv_ownedElement_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2852:2: ( ( ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? ( (lv_ownedElement_3_0= ruleSubsetOrRedefinition ) )? ) )
            // InternalAlf.g:2853:2: ( ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? ( (lv_ownedElement_3_0= ruleSubsetOrRedefinition ) )? )
            {
            // InternalAlf.g:2853:2: ( ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? ( (lv_ownedElement_3_0= ruleSubsetOrRedefinition ) )? )
            // InternalAlf.g:2854:3: ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? ( (lv_ownedElement_3_0= ruleSubsetOrRedefinition ) )?
            {
            // InternalAlf.g:2854:3: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:2855:4: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:2855:4: (lv_name_0_0= ruleName )
            // InternalAlf.g:2856:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_45);
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

            // InternalAlf.g:2873:3: (this_TypePart_1= ruleTypePart[$current] )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==36) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalAlf.g:2874:4: this_TypePart_1= ruleTypePart[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getFeatureDeclarationRule());
                    				}
                    				newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getTypePartParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_46);
                    this_TypePart_1=ruleTypePart(current);

                    state._fsp--;


                    				current = this_TypePart_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalAlf.g:2886:3: (this_Multiplicity_2= ruleMultiplicity[$current] )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==39) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalAlf.g:2887:4: this_Multiplicity_2= ruleMultiplicity[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getFeatureDeclarationRule());
                    				}
                    				newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getMultiplicityParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_47);
                    this_Multiplicity_2=ruleMultiplicity(current);

                    state._fsp--;


                    				current = this_Multiplicity_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalAlf.g:2899:3: ( (lv_ownedElement_3_0= ruleSubsetOrRedefinition ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=42 && LA67_0<=43)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalAlf.g:2900:4: (lv_ownedElement_3_0= ruleSubsetOrRedefinition )
                    {
                    // InternalAlf.g:2900:4: (lv_ownedElement_3_0= ruleSubsetOrRedefinition )
                    // InternalAlf.g:2901:5: lv_ownedElement_3_0= ruleSubsetOrRedefinition
                    {

                    					newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getOwnedElementSubsetOrRedefinitionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ownedElement_3_0=ruleSubsetOrRedefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFeatureDeclarationRule());
                    					}
                    					add(
                    						current,
                    						"ownedElement",
                    						lv_ownedElement_3_0,
                    						"org.omg.sysml.Alf.SubsetOrRedefinition");
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
    // $ANTLR end "ruleFeatureDeclaration"


    // $ANTLR start "ruleFeatureCompletion"
    // InternalAlf.g:2923:1: ruleFeatureCompletion[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) ) )? (otherlv_2= ';' | this_ClassBody_3= ruleClassBody[$current] ) ) ;
    public final EObject ruleFeatureCompletion(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;

        EObject this_ClassBody_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:2929:2: ( ( (otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) ) )? (otherlv_2= ';' | this_ClassBody_3= ruleClassBody[$current] ) ) )
            // InternalAlf.g:2930:2: ( (otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) ) )? (otherlv_2= ';' | this_ClassBody_3= ruleClassBody[$current] ) )
            {
            // InternalAlf.g:2930:2: ( (otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) ) )? (otherlv_2= ';' | this_ClassBody_3= ruleClassBody[$current] ) )
            // InternalAlf.g:2931:3: (otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) ) )? (otherlv_2= ';' | this_ClassBody_3= ruleClassBody[$current] )
            {
            // InternalAlf.g:2931:3: (otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==35) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalAlf.g:2932:4: otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) )
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_48); 

                    				newLeafNode(otherlv_0, grammarAccess.getFeatureCompletionAccess().getEqualsSignKeyword_0_0());
                    			
                    // InternalAlf.g:2936:4: ( (lv_value_1_0= ruleExpression ) )
                    // InternalAlf.g:2937:5: (lv_value_1_0= ruleExpression )
                    {
                    // InternalAlf.g:2937:5: (lv_value_1_0= ruleExpression )
                    // InternalAlf.g:2938:6: lv_value_1_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getFeatureCompletionAccess().getValueExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_value_1_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureCompletionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.omg.sysml.Alf.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlf.g:2956:3: (otherlv_2= ';' | this_ClassBody_3= ruleClassBody[$current] )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==19) ) {
                alt69=1;
            }
            else if ( (LA69_0==22) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalAlf.g:2957:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getFeatureCompletionAccess().getSemicolonKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalAlf.g:2962:4: this_ClassBody_3= ruleClassBody[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getFeatureCompletionRule());
                    				}
                    				newCompositeNode(grammarAccess.getFeatureCompletionAccess().getClassBodyParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_ClassBody_3=ruleClassBody(current);

                    state._fsp--;


                    				current = this_ClassBody_3;
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
    // $ANTLR end "ruleFeatureCompletion"


    // $ANTLR start "ruleTypePart"
    // InternalAlf.g:2979:1: ruleTypePart[EObject in_current] returns [EObject current=in_current] : (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_3= 'any' ) ) ;
    public final EObject ruleTypePart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_isComposite_1_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAlf.g:2985:2: ( (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_3= 'any' ) ) )
            // InternalAlf.g:2986:2: (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_3= 'any' ) )
            {
            // InternalAlf.g:2986:2: (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_3= 'any' ) )
            // InternalAlf.g:2987:3: otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_3= 'any' )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getTypePartAccess().getColonKeyword_0());
            		
            // InternalAlf.g:2991:3: ( (lv_isComposite_1_0= 'compose' ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==37) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalAlf.g:2992:4: (lv_isComposite_1_0= 'compose' )
                    {
                    // InternalAlf.g:2992:4: (lv_isComposite_1_0= 'compose' )
                    // InternalAlf.g:2993:5: lv_isComposite_1_0= 'compose'
                    {
                    lv_isComposite_1_0=(Token)match(input,37,FOLLOW_51); 

                    					newLeafNode(lv_isComposite_1_0, grammarAccess.getTypePartAccess().getIsCompositeComposeKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypePartRule());
                    					}
                    					setWithLastConsumed(current, "isComposite", true, "compose");
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:3005:3: ( ( ( ruleQualifiedName ) ) | otherlv_3= 'any' )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=RULE_ID && LA71_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt71=1;
            }
            else if ( (LA71_0==38) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalAlf.g:3006:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalAlf.g:3006:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:3007:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:3007:5: ( ruleQualifiedName )
                    // InternalAlf.g:3008:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypePartRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTypePartAccess().getReferencedTypeClassCrossReference_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:3023:4: otherlv_3= 'any'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

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


    // $ANTLR start "ruleMultiplicity"
    // InternalAlf.g:3033:1: ruleMultiplicity[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ) ;
    public final EObject ruleMultiplicity(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lower_1_0 = null;

        EObject lv_upper_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3039:2: ( (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ) )
            // InternalAlf.g:3040:2: (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' )
            {
            // InternalAlf.g:3040:2: (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' )
            // InternalAlf.g:3041:3: otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAlf.g:3045:3: ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_NATURAL_VALUE) ) {
                int LA72_1 = input.LA(2);

                if ( (LA72_1==40) ) {
                    alt72=1;
                }
            }
            switch (alt72) {
                case 1 :
                    // InternalAlf.g:3046:4: ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..'
                    {
                    // InternalAlf.g:3046:4: ( (lv_lower_1_0= ruleNaturalLiteralExpression ) )
                    // InternalAlf.g:3047:5: (lv_lower_1_0= ruleNaturalLiteralExpression )
                    {
                    // InternalAlf.g:3047:5: (lv_lower_1_0= ruleNaturalLiteralExpression )
                    // InternalAlf.g:3048:6: lv_lower_1_0= ruleNaturalLiteralExpression
                    {

                    						newCompositeNode(grammarAccess.getMultiplicityAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_53);
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

                    otherlv_2=(Token)match(input,40,FOLLOW_52); 

                    				newLeafNode(otherlv_2, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalAlf.g:3070:3: ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:3071:4: (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:3071:4: (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:3072:5: lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression
            {

            					newCompositeNode(grammarAccess.getMultiplicityAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_54);
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

            otherlv_4=(Token)match(input,41,FOLLOW_2); 

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


    // $ANTLR start "entryRuleSubsetOrRedefinition"
    // InternalAlf.g:3097:1: entryRuleSubsetOrRedefinition returns [EObject current=null] : iv_ruleSubsetOrRedefinition= ruleSubsetOrRedefinition EOF ;
    public final EObject entryRuleSubsetOrRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsetOrRedefinition = null;


        try {
            // InternalAlf.g:3097:61: (iv_ruleSubsetOrRedefinition= ruleSubsetOrRedefinition EOF )
            // InternalAlf.g:3098:2: iv_ruleSubsetOrRedefinition= ruleSubsetOrRedefinition EOF
            {
             newCompositeNode(grammarAccess.getSubsetOrRedefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubsetOrRedefinition=ruleSubsetOrRedefinition();

            state._fsp--;

             current =iv_ruleSubsetOrRedefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubsetOrRedefinition"


    // $ANTLR start "ruleSubsetOrRedefinition"
    // InternalAlf.g:3104:1: ruleSubsetOrRedefinition returns [EObject current=null] : ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition ) ) ;
    public final EObject ruleSubsetOrRedefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Subset_1 = null;

        EObject this_Redefinition_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:3110:2: ( ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition ) ) )
            // InternalAlf.g:3111:2: ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition ) )
            {
            // InternalAlf.g:3111:2: ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==42) ) {
                alt73=1;
            }
            else if ( (LA73_0==43) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalAlf.g:3112:3: (otherlv_0= 'subsets' this_Subset_1= ruleSubset )
                    {
                    // InternalAlf.g:3112:3: (otherlv_0= 'subsets' this_Subset_1= ruleSubset )
                    // InternalAlf.g:3113:4: otherlv_0= 'subsets' this_Subset_1= ruleSubset
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getSubsetOrRedefinitionAccess().getSubsetsKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getSubsetOrRedefinitionAccess().getSubsetParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Subset_1=ruleSubset();

                    state._fsp--;


                    				current = this_Subset_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:3127:3: (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition )
                    {
                    // InternalAlf.g:3127:3: (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition )
                    // InternalAlf.g:3128:4: otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition
                    {
                    otherlv_2=(Token)match(input,43,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getSubsetOrRedefinitionAccess().getRedefinesKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getSubsetOrRedefinitionAccess().getRedefinitionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Redefinition_3=ruleRedefinition();

                    state._fsp--;


                    				current = this_Redefinition_3;
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleSubsetOrRedefinition"


    // $ANTLR start "entryRuleRedefinition"
    // InternalAlf.g:3145:1: entryRuleRedefinition returns [EObject current=null] : iv_ruleRedefinition= ruleRedefinition EOF ;
    public final EObject entryRuleRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefinition = null;


        try {
            // InternalAlf.g:3145:53: (iv_ruleRedefinition= ruleRedefinition EOF )
            // InternalAlf.g:3146:2: iv_ruleRedefinition= ruleRedefinition EOF
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
    // InternalAlf.g:3152:1: ruleRedefinition returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleRedefinition() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:3158:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:3159:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:3159:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3160:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:3160:3: ( ruleQualifiedName )
            // InternalAlf.g:3161:4: ruleQualifiedName
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


    // $ANTLR start "entryRuleSubset"
    // InternalAlf.g:3178:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalAlf.g:3178:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalAlf.g:3179:2: iv_ruleSubset= ruleSubset EOF
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
    // InternalAlf.g:3185:1: ruleSubset returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubset() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:3191:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:3192:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:3192:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3193:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:3193:3: ( ruleQualifiedName )
            // InternalAlf.g:3194:4: ruleQualifiedName
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


    // $ANTLR start "entryRuleConnectorDefinition"
    // InternalAlf.g:3211:1: entryRuleConnectorDefinition returns [EObject current=null] : iv_ruleConnectorDefinition= ruleConnectorDefinition EOF ;
    public final EObject entryRuleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorDefinition = null;


        try {
            // InternalAlf.g:3211:60: (iv_ruleConnectorDefinition= ruleConnectorDefinition EOF )
            // InternalAlf.g:3212:2: iv_ruleConnectorDefinition= ruleConnectorDefinition EOF
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
    // InternalAlf.g:3218:1: ruleConnectorDefinition returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) ;
    public final EObject ruleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3224:2: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) )
            // InternalAlf.g:3225:2: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
            {
            // InternalAlf.g:3225:2: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
            // InternalAlf.g:3226:3: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';'
            {
            // InternalAlf.g:3226:3: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )?
            int alt76=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA76_1 = input.LA(2);

                    if ( (LA76_1==24||LA76_1==36) ) {
                        alt76=1;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA76_2 = input.LA(2);

                    if ( (LA76_2==24||LA76_2==36) ) {
                        alt76=1;
                    }
                    }
                    break;
                case 24:
                case 36:
                    {
                    alt76=1;
                    }
                    break;
            }

            switch (alt76) {
                case 1 :
                    // InternalAlf.g:3227:4: ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is'
                    {
                    // InternalAlf.g:3227:4: ( (lv_name_0_0= ruleName ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( ((LA74_0>=RULE_ID && LA74_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalAlf.g:3228:5: (lv_name_0_0= ruleName )
                            {
                            // InternalAlf.g:3228:5: (lv_name_0_0= ruleName )
                            // InternalAlf.g:3229:6: lv_name_0_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_0_0_0());
                            					
                            pushFollow(FOLLOW_55);
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

                    // InternalAlf.g:3246:4: (otherlv_1= ':' ( ( ruleQualifiedName ) ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==36) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalAlf.g:3247:5: otherlv_1= ':' ( ( ruleQualifiedName ) )
                            {
                            otherlv_1=(Token)match(input,36,FOLLOW_10); 

                            					newLeafNode(otherlv_1, grammarAccess.getConnectorDefinitionAccess().getColonKeyword_0_1_0());
                            				
                            // InternalAlf.g:3251:5: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:3252:6: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:3252:6: ( ruleQualifiedName )
                            // InternalAlf.g:3253:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConnectorDefinitionRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getAssociationAssociationCrossReference_0_1_1_0());
                            						
                            pushFollow(FOLLOW_21);
                            ruleQualifiedName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getConnectorDefinitionAccess().getIsKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalAlf.g:3273:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3274:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:3274:4: ( ruleQualifiedName )
            // InternalAlf.g:3275:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getSourceFeatureFeatureCrossReference_1_0());
            				
            pushFollow(FOLLOW_56);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,44,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectorDefinitionAccess().getEqualsSignGreaterThanSignKeyword_2());
            		
            // InternalAlf.g:3293:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3294:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:3294:4: ( ruleQualifiedName )
            // InternalAlf.g:3295:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getTargetFeatureFeatureCrossReference_3_0());
            				
            pushFollow(FOLLOW_13);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConnectorDefinitionAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleExpression"
    // InternalAlf.g:3317:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAlf.g:3317:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAlf.g:3318:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAlf.g:3324:1: ruleExpression returns [EObject current=null] : this_BinaryExpression_0= ruleBinaryExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3330:2: (this_BinaryExpression_0= ruleBinaryExpression )
            // InternalAlf.g:3331:2: this_BinaryExpression_0= ruleBinaryExpression
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
    // InternalAlf.g:3342:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalAlf.g:3342:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalAlf.g:3343:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalAlf.g:3349:1: ruleBinaryExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) ;
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
            // InternalAlf.g:3355:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) )
            // InternalAlf.g:3356:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            {
            // InternalAlf.g:3356:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            // InternalAlf.g:3357:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            {

            			newCompositeNode(grammarAccess.getBinaryExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_57);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3365:3: ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==18||(LA78_0>=45 && LA78_0<=49)) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalAlf.g:3366:4: () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    {
                    // InternalAlf.g:3366:4: ()
                    // InternalAlf.g:3367:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:3373:4: ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==18||(LA77_0>=46 && LA77_0<=49)) ) {
                        alt77=1;
                    }
                    else if ( (LA77_0==45) ) {
                        alt77=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }
                    switch (alt77) {
                        case 1 :
                            // InternalAlf.g:3374:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            {
                            // InternalAlf.g:3374:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            // InternalAlf.g:3375:6: ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) )
                            {
                            // InternalAlf.g:3375:6: ( (lv_operator_2_0= ruleBinaryOperator ) )
                            // InternalAlf.g:3376:7: (lv_operator_2_0= ruleBinaryOperator )
                            {
                            // InternalAlf.g:3376:7: (lv_operator_2_0= ruleBinaryOperator )
                            // InternalAlf.g:3377:8: lv_operator_2_0= ruleBinaryOperator
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorParserRuleCall_1_1_0_0_0());
                            							
                            pushFollow(FOLLOW_48);
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

                            // InternalAlf.g:3394:6: ( (lv_operand_3_0= ruleExpression ) )
                            // InternalAlf.g:3395:7: (lv_operand_3_0= ruleExpression )
                            {
                            // InternalAlf.g:3395:7: (lv_operand_3_0= ruleExpression )
                            // InternalAlf.g:3396:8: lv_operand_3_0= ruleExpression
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
                            // InternalAlf.g:3415:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            {
                            // InternalAlf.g:3415:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            // InternalAlf.g:3416:6: ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']'
                            {
                            // InternalAlf.g:3416:6: ( (lv_operator_4_0= '@' ) )
                            // InternalAlf.g:3417:7: (lv_operator_4_0= '@' )
                            {
                            // InternalAlf.g:3417:7: (lv_operator_4_0= '@' )
                            // InternalAlf.g:3418:8: lv_operator_4_0= '@'
                            {
                            lv_operator_4_0=(Token)match(input,45,FOLLOW_58); 

                            								newLeafNode(lv_operator_4_0, grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getBinaryExpressionRule());
                            								}
                            								setWithLastConsumed(current, "operator", lv_operator_4_0, "@");
                            							

                            }


                            }

                            otherlv_5=(Token)match(input,39,FOLLOW_48); 

                            						newLeafNode(otherlv_5, grammarAccess.getBinaryExpressionAccess().getLeftSquareBracketKeyword_1_1_1_1());
                            					
                            // InternalAlf.g:3434:6: ( (lv_operand_6_0= ruleExpression ) )
                            // InternalAlf.g:3435:7: (lv_operand_6_0= ruleExpression )
                            {
                            // InternalAlf.g:3435:7: (lv_operand_6_0= ruleExpression )
                            // InternalAlf.g:3436:8: lv_operand_6_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperandExpressionParserRuleCall_1_1_1_2_0());
                            							
                            pushFollow(FOLLOW_54);
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

                            otherlv_7=(Token)match(input,41,FOLLOW_2); 

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
    // InternalAlf.g:3464:1: entryRuleBinaryOperator returns [String current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final String entryRuleBinaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperator = null;


        try {
            // InternalAlf.g:3464:54: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // InternalAlf.g:3465:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
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
    // InternalAlf.g:3471:1: ruleBinaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:3477:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) )
            // InternalAlf.g:3478:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            {
            // InternalAlf.g:3478:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            int alt79=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt79=1;
                }
                break;
            case 47:
                {
                alt79=2;
                }
                break;
            case 18:
                {
                alt79=3;
                }
                break;
            case 48:
                {
                alt79=4;
                }
                break;
            case 49:
                {
                alt79=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalAlf.g:3479:3: kw= '+'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3485:3: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:3491:3: kw= '*'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:3497:3: kw= '/'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:3503:3: kw= '^'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

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
    // InternalAlf.g:3512:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlf.g:3512:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlf.g:3513:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalAlf.g:3519:1: ruleUnaryExpression returns [EObject current=null] : (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceAccessExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3525:2: ( (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) )
            // InternalAlf.g:3526:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            {
            // InternalAlf.g:3526:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=RULE_BOOLEAN_VALUE && LA80_0<=RULE_UNRESTRICTED_NAME)||(LA80_0>=17 && LA80_0<=18)||LA80_0==22||LA80_0==50||LA80_0==52) ) {
                alt80=1;
            }
            else if ( ((LA80_0>=46 && LA80_0<=47)) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalAlf.g:3527:3: this_SequenceAccessExpression_0= ruleSequenceAccessExpression
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
                    // InternalAlf.g:3536:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    {
                    // InternalAlf.g:3536:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    // InternalAlf.g:3537:4: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    {
                    // InternalAlf.g:3537:4: ()
                    // InternalAlf.g:3538:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:3544:4: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // InternalAlf.g:3545:5: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // InternalAlf.g:3545:5: (lv_operator_2_0= ruleUnaryOperator )
                    // InternalAlf.g:3546:6: lv_operator_2_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_59);
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

                    // InternalAlf.g:3563:4: ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    // InternalAlf.g:3564:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    {
                    // InternalAlf.g:3564:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    // InternalAlf.g:3565:6: lv_operand_3_0= ruleSequenceAccessExpression
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
    // InternalAlf.g:3587:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalAlf.g:3587:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalAlf.g:3588:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalAlf.g:3594:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:3600:2: ( (kw= '+' | kw= '-' ) )
            // InternalAlf.g:3601:2: (kw= '+' | kw= '-' )
            {
            // InternalAlf.g:3601:2: (kw= '+' | kw= '-' )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==46) ) {
                alt81=1;
            }
            else if ( (LA81_0==47) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalAlf.g:3602:3: kw= '+'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3608:3: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

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
    // InternalAlf.g:3617:1: entryRuleSequenceAccessExpression returns [EObject current=null] : iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF ;
    public final EObject entryRuleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceAccessExpression = null;


        try {
            // InternalAlf.g:3617:65: (iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF )
            // InternalAlf.g:3618:2: iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF
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
    // InternalAlf.g:3624:1: ruleSequenceAccessExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) ;
    public final EObject ruleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_index_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3630:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) )
            // InternalAlf.g:3631:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            {
            // InternalAlf.g:3631:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            // InternalAlf.g:3632:3: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            {

            			newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_60);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3640:3: ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==39) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalAlf.g:3641:4: () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    // InternalAlf.g:3641:4: ()
            	    // InternalAlf.g:3642:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSequenceAccessExpressionAccess().getSequenceAccessExpressionPrimaryAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_48); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSequenceAccessExpressionAccess().getLeftSquareBracketKeyword_1_1());
            	    			
            	    // InternalAlf.g:3652:4: ( (lv_index_3_0= ruleExpression ) )
            	    // InternalAlf.g:3653:5: (lv_index_3_0= ruleExpression )
            	    {
            	    // InternalAlf.g:3653:5: (lv_index_3_0= ruleExpression )
            	    // InternalAlf.g:3654:6: lv_index_3_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getIndexExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_54);
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

            	    otherlv_4=(Token)match(input,41,FOLLOW_60); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSequenceAccessExpressionAccess().getRightSquareBracketKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop82;
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
    // InternalAlf.g:3680:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalAlf.g:3680:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalAlf.g:3681:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalAlf.g:3687:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
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
            // InternalAlf.g:3693:2: ( (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // InternalAlf.g:3694:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // InternalAlf.g:3694:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt83=5;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // InternalAlf.g:3695:3: this_LiteralExpression_0= ruleLiteralExpression
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
                    // InternalAlf.g:3704:3: this_ElementReferenceExpression_1= ruleElementReferenceExpression
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
                    // InternalAlf.g:3713:3: this_InstanceCreationExpression_2= ruleInstanceCreationExpression
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
                    // InternalAlf.g:3722:3: this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression
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
                    // InternalAlf.g:3731:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // InternalAlf.g:3731:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // InternalAlf.g:3732:4: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_48); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_61);
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
    // InternalAlf.g:3753:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // InternalAlf.g:3753:67: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // InternalAlf.g:3754:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
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
    // InternalAlf.g:3760:1: ruleElementReferenceExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleElementReferenceExpression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:3766:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:3767:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:3767:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3768:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:3768:3: ( ruleQualifiedName )
            // InternalAlf.g:3769:4: ruleQualifiedName
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
    // InternalAlf.g:3786:1: entryRuleInstanceCreationExpression returns [EObject current=null] : iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF ;
    public final EObject entryRuleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceCreationExpression = null;


        try {
            // InternalAlf.g:3786:67: (iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF )
            // InternalAlf.g:3787:2: iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF
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
    // InternalAlf.g:3793:1: ruleInstanceCreationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_argument_2_0 = null;

        EObject lv_argument_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3799:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalAlf.g:3800:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalAlf.g:3800:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalAlf.g:3801:3: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalAlf.g:3801:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3802:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:3802:4: ( ruleQualifiedName )
            // InternalAlf.g:3803:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceCreationExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getClassClassCrossReference_0_0());
            				
            pushFollow(FOLLOW_62);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,50,FOLLOW_63); 

            			newLeafNode(otherlv_1, grammarAccess.getInstanceCreationExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlf.g:3821:3: ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=RULE_BOOLEAN_VALUE && LA85_0<=RULE_UNRESTRICTED_NAME)||(LA85_0>=17 && LA85_0<=18)||LA85_0==22||(LA85_0>=46 && LA85_0<=47)||LA85_0==50||LA85_0==52) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalAlf.g:3822:4: ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:3822:4: ( (lv_argument_2_0= ruleExpression ) )
                    // InternalAlf.g:3823:5: (lv_argument_2_0= ruleExpression )
                    {
                    // InternalAlf.g:3823:5: (lv_argument_2_0= ruleExpression )
                    // InternalAlf.g:3824:6: lv_argument_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_argument_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceCreationExpressionRule());
                    						}
                    						add(
                    							current,
                    							"argument",
                    							lv_argument_2_0,
                    							"org.omg.sysml.Alf.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:3841:4: (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==30) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalAlf.g:3842:5: otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FOLLOW_48); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getInstanceCreationExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:3846:5: ( (lv_argument_4_0= ruleExpression ) )
                    	    // InternalAlf.g:3847:6: (lv_argument_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:3847:6: (lv_argument_4_0= ruleExpression )
                    	    // InternalAlf.g:3848:7: lv_argument_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_64);
                    	    lv_argument_4_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInstanceCreationExpressionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"argument",
                    	    								lv_argument_4_0,
                    	    								"org.omg.sysml.Alf.Expression");
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
                    break;

            }

            otherlv_5=(Token)match(input,51,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInstanceCreationExpressionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleSequenceConstructionExpression"
    // InternalAlf.g:3875:1: entryRuleSequenceConstructionExpression returns [EObject current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
    public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionExpression = null;


        try {
            // InternalAlf.g:3875:71: (iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:3876:2: iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF
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
    // InternalAlf.g:3882:1: ruleSequenceConstructionExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3888:2: ( ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalAlf.g:3889:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalAlf.g:3889:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // InternalAlf.g:3890:3: () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalAlf.g:3890:3: ()
            // InternalAlf.g:3891:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:3901:3: ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( ((LA87_0>=RULE_BOOLEAN_VALUE && LA87_0<=RULE_UNRESTRICTED_NAME)||(LA87_0>=17 && LA87_0<=18)||LA87_0==22||(LA87_0>=46 && LA87_0<=47)||LA87_0==50||LA87_0==52) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalAlf.g:3902:4: ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:3902:4: ( (lv_element_2_0= ruleExpression ) )
                    // InternalAlf.g:3903:5: (lv_element_2_0= ruleExpression )
                    {
                    // InternalAlf.g:3903:5: (lv_element_2_0= ruleExpression )
                    // InternalAlf.g:3904:6: lv_element_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_66);
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

                    // InternalAlf.g:3921:4: (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==30) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalAlf.g:3922:5: otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FOLLOW_48); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:3926:5: ( (lv_element_4_0= ruleExpression ) )
                    	    // InternalAlf.g:3927:6: (lv_element_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:3927:6: (lv_element_4_0= ruleExpression )
                    	    // InternalAlf.g:3928:7: lv_element_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_66);
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
                    	    break loop86;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

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
    // InternalAlf.g:3955:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalAlf.g:3955:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalAlf.g:3956:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalAlf.g:3962:1: ruleLiteralExpression returns [EObject current=null] : (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteralExpression_0 = null;

        EObject this_BooleanLiteralExpression_1 = null;

        EObject this_StringLiteralExpression_2 = null;

        EObject this_RealLiteralExpression_3 = null;

        EObject this_UnlimitedNaturalLiteralExpression_4 = null;



        	enterRule();

        try {
            // InternalAlf.g:3968:2: ( (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:3969:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:3969:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            int alt88=5;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt88=1;
                }
                break;
            case RULE_BOOLEAN_VALUE:
                {
                alt88=2;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt88=3;
                }
                break;
            case RULE_NATURAL_VALUE:
                {
                int LA88_4 = input.LA(2);

                if ( (LA88_4==EOF||(LA88_4>=18 && LA88_4<=19)||(LA88_4>=22 && LA88_4<=23)||LA88_4==30||LA88_4==39||LA88_4==41||(LA88_4>=45 && LA88_4<=49)||LA88_4==51) ) {
                    alt88=5;
                }
                else if ( (LA88_4==17) ) {
                    alt88=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 4, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt88=4;
                }
                break;
            case 18:
                {
                alt88=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalAlf.g:3970:3: this_NullLiteralExpression_0= ruleNullLiteralExpression
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
                    // InternalAlf.g:3979:3: this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression
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
                    // InternalAlf.g:3988:3: this_StringLiteralExpression_2= ruleStringLiteralExpression
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
                    // InternalAlf.g:3997:3: this_RealLiteralExpression_3= ruleRealLiteralExpression
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
                    // InternalAlf.g:4006:3: this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:4018:1: entryRuleNullLiteralExpression returns [EObject current=null] : iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF ;
    public final EObject entryRuleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpression = null;


        try {
            // InternalAlf.g:4018:62: (iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF )
            // InternalAlf.g:4019:2: iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF
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
    // InternalAlf.g:4025:1: ruleNullLiteralExpression returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlf.g:4031:2: ( ( () otherlv_1= 'null' ) )
            // InternalAlf.g:4032:2: ( () otherlv_1= 'null' )
            {
            // InternalAlf.g:4032:2: ( () otherlv_1= 'null' )
            // InternalAlf.g:4033:3: () otherlv_1= 'null'
            {
            // InternalAlf.g:4033:3: ()
            // InternalAlf.g:4034:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullLiteralExpressionAccess().getLiteralNullAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_2); 

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
    // InternalAlf.g:4048:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // InternalAlf.g:4048:65: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:4049:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
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
    // InternalAlf.g:4055:1: ruleBooleanLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:4061:2: ( ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) )
            // InternalAlf.g:4062:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            {
            // InternalAlf.g:4062:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:4063:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:4063:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            // InternalAlf.g:4064:4: lv_value_0_0= RULE_BOOLEAN_VALUE
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
    // InternalAlf.g:4083:1: entryRuleStringLiteralExpression returns [EObject current=null] : iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF ;
    public final EObject entryRuleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpression = null;


        try {
            // InternalAlf.g:4083:64: (iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF )
            // InternalAlf.g:4084:2: iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF
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
    // InternalAlf.g:4090:1: ruleStringLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:4096:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalAlf.g:4097:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalAlf.g:4097:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalAlf.g:4098:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalAlf.g:4098:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalAlf.g:4099:4: lv_value_0_0= RULE_STRING_VALUE
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
    // InternalAlf.g:4118:1: entryRuleRealLiteralExpression returns [EObject current=null] : iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF ;
    public final EObject entryRuleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteralExpression = null;


        try {
            // InternalAlf.g:4118:62: (iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF )
            // InternalAlf.g:4119:2: iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF
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
    // InternalAlf.g:4125:1: ruleRealLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4131:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalAlf.g:4132:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalAlf.g:4132:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalAlf.g:4133:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalAlf.g:4133:3: (lv_value_0_0= ruleRealValue )
            // InternalAlf.g:4134:4: lv_value_0_0= ruleRealValue
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
    // InternalAlf.g:4154:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalAlf.g:4154:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalAlf.g:4155:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalAlf.g:4161:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_VALUE_0=null;
        Token kw=null;
        Token this_NATURAL_VALUE_2=null;
        Token this_NATURAL_VALUE_4=null;
        Token this_NATURAL_VALUE_9=null;


        	enterRule();

        try {
            // InternalAlf.g:4167:2: ( ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) )
            // InternalAlf.g:4168:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            {
            // InternalAlf.g:4168:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            // InternalAlf.g:4169:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            {
            // InternalAlf.g:4169:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_NATURAL_VALUE) ) {
                alt90=1;
            }
            else if ( (LA90_0==17) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // InternalAlf.g:4170:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    {
                    // InternalAlf.g:4170:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    // InternalAlf.g:4171:5: this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    {
                    this_NATURAL_VALUE_0=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_15); 

                    					current.merge(this_NATURAL_VALUE_0);
                    				

                    					newLeafNode(this_NATURAL_VALUE_0, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_0());
                    				
                    kw=(Token)match(input,17,FOLLOW_67); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_0_1());
                    				
                    // InternalAlf.g:4183:5: (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==RULE_NATURAL_VALUE) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalAlf.g:4184:6: this_NATURAL_VALUE_2= RULE_NATURAL_VALUE
                            {
                            this_NATURAL_VALUE_2=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_68); 

                            						current.merge(this_NATURAL_VALUE_2);
                            					

                            						newLeafNode(this_NATURAL_VALUE_2, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_2());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:4194:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    {
                    // InternalAlf.g:4194:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    // InternalAlf.g:4195:5: kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE
                    {
                    kw=(Token)match(input,17,FOLLOW_69); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1_0());
                    				
                    this_NATURAL_VALUE_4=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_68); 

                    					current.merge(this_NATURAL_VALUE_4);
                    				

                    					newLeafNode(this_NATURAL_VALUE_4, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:4209:3: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( ((LA93_0>=53 && LA93_0<=54)) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalAlf.g:4210:4: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE
                    {
                    // InternalAlf.g:4210:4: (kw= 'e' | kw= 'E' )
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==53) ) {
                        alt91=1;
                    }
                    else if ( (LA91_0==54) ) {
                        alt91=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 91, 0, input);

                        throw nvae;
                    }
                    switch (alt91) {
                        case 1 :
                            // InternalAlf.g:4211:5: kw= 'e'
                            {
                            kw=(Token)match(input,53,FOLLOW_70); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:4217:5: kw= 'E'
                            {
                            kw=(Token)match(input,54,FOLLOW_70); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:4223:4: (kw= '+' | kw= '-' )?
                    int alt92=3;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==46) ) {
                        alt92=1;
                    }
                    else if ( (LA92_0==47) ) {
                        alt92=2;
                    }
                    switch (alt92) {
                        case 1 :
                            // InternalAlf.g:4224:5: kw= '+'
                            {
                            kw=(Token)match(input,46,FOLLOW_69); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:4230:5: kw= '-'
                            {
                            kw=(Token)match(input,47,FOLLOW_69); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getHyphenMinusKeyword_1_1_1());
                            				

                            }
                            break;

                    }

                    this_NATURAL_VALUE_9=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_2); 

                    				current.merge(this_NATURAL_VALUE_9);
                    			

                    				newLeafNode(this_NATURAL_VALUE_9, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_1_2());
                    			

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
    // $ANTLR end "ruleRealValue"


    // $ANTLR start "entryRuleNaturalLiteralExpression"
    // InternalAlf.g:4248:1: entryRuleNaturalLiteralExpression returns [EObject current=null] : iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF ;
    public final EObject entryRuleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:4248:65: (iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:4249:2: iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF
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
    // InternalAlf.g:4255:1: ruleNaturalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) ;
    public final EObject ruleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:4261:2: ( ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) )
            // InternalAlf.g:4262:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            {
            // InternalAlf.g:4262:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            // InternalAlf.g:4263:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:4263:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            // InternalAlf.g:4264:4: lv_value_0_0= RULE_NATURAL_VALUE
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
    // InternalAlf.g:4283:1: entryRuleUnlimitedNaturalLiteralExpression returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:4283:74: (iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:4284:2: iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF
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
    // InternalAlf.g:4290:1: ruleUnlimitedNaturalLiteralExpression returns [EObject current=null] : (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NaturalLiteralExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4296:2: ( (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) )
            // InternalAlf.g:4297:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            {
            // InternalAlf.g:4297:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_NATURAL_VALUE) ) {
                alt94=1;
            }
            else if ( (LA94_0==18) ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalAlf.g:4298:3: this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression
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
                    // InternalAlf.g:4307:3: ( () otherlv_2= '*' )
                    {
                    // InternalAlf.g:4307:3: ( () otherlv_2= '*' )
                    // InternalAlf.g:4308:4: () otherlv_2= '*'
                    {
                    // InternalAlf.g:4308:4: ()
                    // InternalAlf.g:4309:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getLiteralUnboundedAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_2); 

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
    // InternalAlf.g:4324:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAlf.g:4324:44: (iv_ruleName= ruleName EOF )
            // InternalAlf.g:4325:2: iv_ruleName= ruleName EOF
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
    // InternalAlf.g:4331:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalAlf.g:4337:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalAlf.g:4338:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalAlf.g:4338:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_ID) ) {
                alt95=1;
            }
            else if ( (LA95_0==RULE_UNRESTRICTED_NAME) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalAlf.g:4339:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:4347:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:4358:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlf.g:4358:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlf.g:4359:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlf.g:4365:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_ColonQualifiedName_1 = null;

        AntlrDatatypeRuleToken this_DotQualifiedName_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4371:2: ( (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) )
            // InternalAlf.g:4372:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            {
            // InternalAlf.g:4372:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            int alt96=3;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    alt96=3;
                    }
                    break;
                case 16:
                    {
                    alt96=2;
                    }
                    break;
                case EOF:
                case 18:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 30:
                case 35:
                case 36:
                case 39:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                    {
                    alt96=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 96, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA96_0==RULE_UNRESTRICTED_NAME) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 18:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 30:
                case 35:
                case 36:
                case 39:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                    {
                    alt96=1;
                    }
                    break;
                case 17:
                    {
                    alt96=3;
                    }
                    break;
                case 16:
                    {
                    alt96=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 96, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // InternalAlf.g:4373:3: this_Name_0= ruleName
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
                    // InternalAlf.g:4384:3: this_ColonQualifiedName_1= ruleColonQualifiedName
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
                    // InternalAlf.g:4395:3: this_DotQualifiedName_2= ruleDotQualifiedName
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
    // InternalAlf.g:4409:1: entryRuleColonQualifiedName returns [String current=null] : iv_ruleColonQualifiedName= ruleColonQualifiedName EOF ;
    public final String entryRuleColonQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColonQualifiedName = null;


        try {
            // InternalAlf.g:4409:58: (iv_ruleColonQualifiedName= ruleColonQualifiedName EOF )
            // InternalAlf.g:4410:2: iv_ruleColonQualifiedName= ruleColonQualifiedName EOF
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
    // InternalAlf.g:4416:1: ruleColonQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleColonQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4422:2: ( (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:4423:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:4423:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            // InternalAlf.g:4424:3: this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:4434:3: (kw= '::' this_Name_2= ruleName )+
            int cnt97=0;
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==16) ) {
                    int LA97_1 = input.LA(2);

                    if ( ((LA97_1>=RULE_ID && LA97_1<=RULE_UNRESTRICTED_NAME)) ) {
                        alt97=1;
                    }


                }


                switch (alt97) {
            	case 1 :
            	    // InternalAlf.g:4435:4: kw= '::' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,16,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getColonQualifiedNameAccess().getColonColonKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_71);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt97 >= 1 ) break loop97;
                        EarlyExitException eee =
                            new EarlyExitException(97, input);
                        throw eee;
                }
                cnt97++;
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
    // InternalAlf.g:4455:1: entryRuleDotQualifiedName returns [String current=null] : iv_ruleDotQualifiedName= ruleDotQualifiedName EOF ;
    public final String entryRuleDotQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDotQualifiedName = null;


        try {
            // InternalAlf.g:4455:56: (iv_ruleDotQualifiedName= ruleDotQualifiedName EOF )
            // InternalAlf.g:4456:2: iv_ruleDotQualifiedName= ruleDotQualifiedName EOF
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
    // InternalAlf.g:4462:1: ruleDotQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleDotQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4468:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:4469:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:4469:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            // InternalAlf.g:4470:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:4480:3: (kw= '.' this_Name_2= ruleName )+
            int cnt98=0;
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==17) ) {
                    int LA98_1 = input.LA(2);

                    if ( ((LA98_1>=RULE_ID && LA98_1<=RULE_UNRESTRICTED_NAME)) ) {
                        alt98=1;
                    }


                }


                switch (alt98) {
            	case 1 :
            	    // InternalAlf.g:4481:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,17,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getDotQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_72);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt98 >= 1 ) break loop98;
                        EarlyExitException eee =
                            new EarlyExitException(98, input);
                        throw eee;
                }
                cnt98++;
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
    // InternalAlf.g:4501:1: rulePackageElementVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator rulePackageElementVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAlf.g:4507:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // InternalAlf.g:4508:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // InternalAlf.g:4508:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==55) ) {
                alt99=1;
            }
            else if ( (LA99_0==56) ) {
                alt99=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // InternalAlf.g:4509:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:4509:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:4510:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getPackageElementVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPackageElementVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:4517:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:4517:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:4518:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

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
    // InternalAlf.g:4528:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAlf.g:4534:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) )
            // InternalAlf.g:4535:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            {
            // InternalAlf.g:4535:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            int alt100=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt100=1;
                }
                break;
            case 56:
                {
                alt100=2;
                }
                break;
            case 57:
                {
                alt100=3;
                }
                break;
            case 58:
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
                    // InternalAlf.g:4536:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:4536:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:4537:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:4544:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:4544:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:4545:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:4552:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalAlf.g:4552:3: (enumLiteral_2= 'protected' )
                    // InternalAlf.g:4553:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:4560:3: (enumLiteral_3= 'packaged' )
                    {
                    // InternalAlf.g:4560:3: (enumLiteral_3= 'packaged' )
                    // InternalAlf.g:4561:4: enumLiteral_3= 'packaged'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); 

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
    // InternalAlf.g:4571:1: ruleFeatureDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFeatureDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAlf.g:4577:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalAlf.g:4578:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalAlf.g:4578:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt101=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt101=1;
                }
                break;
            case 60:
                {
                alt101=2;
                }
                break;
            case 61:
                {
                alt101=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // InternalAlf.g:4579:3: (enumLiteral_0= 'in' )
                    {
                    // InternalAlf.g:4579:3: (enumLiteral_0= 'in' )
                    // InternalAlf.g:4580:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:4587:3: (enumLiteral_1= 'out' )
                    {
                    // InternalAlf.g:4587:3: (enumLiteral_1= 'out' )
                    // InternalAlf.g:4588:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:4595:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalAlf.g:4595:3: (enumLiteral_2= 'inout' )
                    // InternalAlf.g:4596:4: enumLiteral_2= 'inout'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

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
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA83 dfa83 = new DFA83(this);
    static final String dfa_1s = "\34\uffff";
    static final String dfa_2s = "\1\4\2\17\1\10\1\4\1\uffff\1\31\3\uffff\2\20\2\10\1\4\1\10\2\20\3\23\2\21\1\10\1\4\1\10\2\23";
    static final String dfa_3s = "\1\70\2\17\1\11\1\34\1\uffff\1\32\3\uffff\2\24\1\22\1\11\1\70\1\22\2\24\3\23\2\24\1\22\1\70\1\22\2\23";
    static final String dfa_4s = "\5\uffff\1\1\1\uffff\1\2\1\3\1\4\22\uffff";
    static final String dfa_5s = "\34\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\12\uffff\1\3\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\6\32\uffff\1\1\1\2",
            "\1\3",
            "\1\3",
            "\1\12\1\13",
            "\1\4\20\uffff\1\5\3\uffff\1\7\1\10\1\11\1\6",
            "",
            "\1\7\1\10",
            "",
            "",
            "",
            "\1\14\1\17\1\uffff\1\16\1\15",
            "\1\14\1\17\1\uffff\1\16\1\15",
            "\1\20\1\21\10\uffff\1\22",
            "\1\23\1\24",
            "\1\4\12\uffff\1\3\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\6\32\uffff\1\1\1\2",
            "\1\25\1\26\10\uffff\1\22",
            "\1\27\2\uffff\1\16\1\15",
            "\1\27\2\uffff\1\16\1\15",
            "\1\30",
            "\1\16",
            "\1\16",
            "\1\31\1\uffff\1\16\1\15",
            "\1\31\1\uffff\1\16\1\15",
            "\1\20\1\21\10\uffff\1\32",
            "\1\4\12\uffff\1\3\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\6\32\uffff\1\1\1\2",
            "\1\25\1\26\10\uffff\1\33",
            "\1\30",
            "\1\30"
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
            return "79:2: (this_PackageUnitDefinition_0= rulePackageUnitDefinition | this_ClassUnitDefinition_1= ruleClassUnitDefinition | this_AssociationUnitDefinition_2= ruleAssociationUnitDefinition | this_FeatureUnitDefinition_3= ruleFeatureUnitDefinition )";
        }
    }
    static final String dfa_7s = "\21\uffff";
    static final String dfa_8s = "\1\4\1\uffff\2\17\1\10\2\20\2\10\1\uffff\2\20\1\uffff\2\21\2\10";
    static final String dfa_9s = "\1\70\1\uffff\2\17\1\11\2\24\2\22\1\uffff\2\24\1\uffff\2\24\2\22";
    static final String dfa_10s = "\1\uffff\1\3\7\uffff\1\2\2\uffff\1\1\4\uffff";
    static final String dfa_11s = "\21\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\12\uffff\1\4\5\uffff\1\1\3\uffff\4\1\32\uffff\1\2\1\3",
            "",
            "\1\4",
            "\1\4",
            "\1\5\1\6",
            "\1\7\1\10\1\uffff\2\11",
            "\1\7\1\10\1\uffff\2\11",
            "\1\12\1\13\10\uffff\1\14",
            "\1\15\1\16\10\uffff\1\14",
            "",
            "\1\17\2\uffff\2\11",
            "\1\17\2\uffff\2\11",
            "",
            "\1\20\1\uffff\2\11",
            "\1\20\1\uffff\2\11",
            "\1\12\1\13\10\uffff\1\14",
            "\1\15\1\16\10\uffff\1\14"
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
            return "()* loopback of 292:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )*";
        }
    }
    static final String dfa_13s = "\1\4\2\uffff\3\10\2\20\2\10\1\uffff\2\21\2\20\2\10";
    static final String dfa_14s = "\1\70\2\uffff\2\34\1\11\2\24\2\22\1\uffff\4\24\2\22";
    static final String dfa_15s = "\1\uffff\1\3\1\1\7\uffff\1\2\6\uffff";
    static final String[] dfa_16s = {
            "\1\2\3\uffff\2\2\5\uffff\1\5\5\uffff\1\2\1\uffff\1\1\1\uffff\4\2\32\uffff\1\3\1\4",
            "",
            "",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2",
            "\1\6\1\7",
            "\1\11\1\10\1\uffff\2\2",
            "\1\11\1\10\1\uffff\2\2",
            "\1\13\1\14\10\uffff\1\12",
            "\1\15\1\16\10\uffff\1\12",
            "",
            "\1\17\1\uffff\2\2",
            "\1\17\1\uffff\2\2",
            "\1\20\2\uffff\2\2",
            "\1\20\2\uffff\2\2",
            "\1\13\1\14\10\uffff\1\12",
            "\1\15\1\16\10\uffff\1\12"
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
            return "()* loopback of 722:3: ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_17s = "\41\uffff";
    static final String dfa_18s = "\1\17\1\10\1\uffff\2\10\1\uffff\2\26\1\uffff\2\26\1\uffff\2\26\1\uffff\2\10\4\20\4\10\2\20\4\21\2\20";
    static final String dfa_19s = "\1\34\1\30\1\uffff\2\30\1\uffff\2\30\1\uffff\2\35\1\uffff\2\35\1\uffff\2\11\4\36\4\11\10\36";
    static final String dfa_20s = "\2\uffff\1\1\2\uffff\1\5\2\uffff\1\2\2\uffff\1\3\2\uffff\1\4\22\uffff";
    static final String dfa_21s = "\41\uffff}>";
    static final String[] dfa_22s = {
            "\1\5\5\uffff\1\1\3\uffff\1\3\1\4\1\uffff\1\2",
            "\1\6\1\7\16\uffff\1\10",
            "",
            "\1\11\1\12\16\uffff\1\13",
            "\1\14\1\15\16\uffff\1\16",
            "",
            "\1\2\1\uffff\1\10",
            "\1\2\1\uffff\1\10",
            "",
            "\1\2\1\uffff\1\17\4\uffff\1\2",
            "\1\2\1\uffff\1\17\4\uffff\1\2",
            "",
            "\1\2\1\uffff\1\20\4\uffff\1\2",
            "\1\2\1\uffff\1\20\4\uffff\1\2",
            "",
            "\1\21\1\22",
            "\1\23\1\24",
            "\1\25\1\26\1\uffff\1\13\2\uffff\1\2\7\uffff\1\2",
            "\1\25\1\26\1\uffff\1\13\2\uffff\1\2\7\uffff\1\2",
            "\1\30\1\27\1\uffff\1\16\2\uffff\1\2\7\uffff\1\2",
            "\1\30\1\27\1\uffff\1\16\2\uffff\1\2\7\uffff\1\2",
            "\1\31\1\32",
            "\1\33\1\34",
            "\1\35\1\36",
            "\1\37\1\40",
            "\1\25\2\uffff\1\13\2\uffff\1\2\7\uffff\1\2",
            "\1\25\2\uffff\1\13\2\uffff\1\2\7\uffff\1\2",
            "\1\26\1\uffff\1\13\2\uffff\1\2\7\uffff\1\2",
            "\1\26\1\uffff\1\13\2\uffff\1\2\7\uffff\1\2",
            "\1\27\1\uffff\1\16\2\uffff\1\2\7\uffff\1\2",
            "\1\27\1\uffff\1\16\2\uffff\1\2\7\uffff\1\2",
            "\1\30\2\uffff\1\16\2\uffff\1\2\7\uffff\1\2",
            "\1\30\2\uffff\1\16\2\uffff\1\2\7\uffff\1\2"
    };

    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_17;
            this.eof = dfa_17;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_21;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "861:2: ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' ) )";
        }
    }
    static final String dfa_23s = "\1\4\2\uffff\3\10\2\20\2\10\2\20\1\uffff\2\21\2\10";
    static final String dfa_24s = "\1\75\2\uffff\2\75\1\11\2\24\2\22\2\24\1\uffff\2\24\2\22";
    static final String dfa_25s = "\1\uffff\1\3\1\1\11\uffff\1\2\4\uffff";
    static final String[] dfa_26s = {
            "\1\2\3\uffff\2\2\5\uffff\1\5\5\uffff\1\2\1\uffff\1\1\1\uffff\4\2\2\uffff\3\2\25\uffff\1\3\1\4\5\2",
            "",
            "",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2\2\uffff\3\2\31\uffff\3\2",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2\2\uffff\3\2\31\uffff\3\2",
            "\1\6\1\7",
            "\1\10\1\11\1\uffff\2\2",
            "\1\10\1\11\1\uffff\2\2",
            "\1\12\1\13\10\uffff\1\14",
            "\1\15\1\16\10\uffff\1\14",
            "\1\17\2\uffff\2\2",
            "\1\17\2\uffff\2\2",
            "",
            "\1\20\1\uffff\2\2",
            "\1\20\1\uffff\2\2",
            "\1\12\1\13\10\uffff\1\14",
            "\1\15\1\16\10\uffff\1\14"
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
            return "()* loopback of 1410:3: ( ( (lv_ownedMembership_1_0= ruleClassMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_27s = "\10\uffff";
    static final String dfa_28s = "\2\4\4\10\2\uffff";
    static final String dfa_29s = "\6\75\2\uffff";
    static final String dfa_30s = "\6\uffff\1\1\1\2";
    static final String dfa_31s = "\10\uffff}>";
    static final String[] dfa_32s = {
            "\1\1\3\uffff\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\25\uffff\1\2\1\3\1\4\1\5\3\7",
            "\1\1\3\uffff\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\25\uffff\1\2\1\3\1\4\1\5\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\31\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\31\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\31\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\31\uffff\3\7",
            "",
            ""
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "1506:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_FeatureClassMember_1= ruleFeatureClassMember )";
        }
    }
    static final String dfa_33s = "\17\uffff";
    static final String dfa_34s = "\4\10\1\uffff\2\23\1\uffff\3\10\2\23\2\uffff";
    static final String dfa_35s = "\4\75\1\uffff\2\53\1\uffff\5\53\2\uffff";
    static final String dfa_36s = "\4\uffff\1\1\2\uffff\1\3\5\uffff\1\4\1\2";
    static final String dfa_37s = "\17\uffff}>";
    static final String[] dfa_38s = {
            "\1\5\1\6\21\uffff\1\1\3\uffff\1\2\1\3\1\7\31\uffff\3\4",
            "\1\13\1\14\16\uffff\1\15\21\uffff\2\16\17\uffff\1\10\1\11\1\12",
            "\1\13\1\14\16\uffff\1\15\21\uffff\2\16\17\uffff\1\10\1\11\1\12",
            "\2\4\40\uffff\2\16\17\uffff\1\10\1\11\1\12",
            "",
            "\1\4\2\uffff\1\4\1\uffff\1\15\12\uffff\2\4\2\uffff\1\4\2\uffff\2\4",
            "\1\4\2\uffff\1\4\1\uffff\1\15\12\uffff\2\4\2\uffff\1\4\2\uffff\2\4",
            "",
            "\2\4\40\uffff\2\16",
            "\2\4\40\uffff\2\16",
            "\2\4\40\uffff\2\16",
            "\1\4\2\uffff\1\4\1\uffff\1\15\12\uffff\2\4\2\uffff\1\4\2\uffff\2\4",
            "\1\4\2\uffff\1\4\1\uffff\1\15\12\uffff\2\4\2\uffff\1\4\2\uffff\2\4",
            "",
            ""
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
            return "1649:3: ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) )";
        }
    }
    static final String dfa_39s = "\1\4\2\uffff\3\10\2\20\2\10\2\21\1\uffff\2\20\2\10";
    static final String[] dfa_40s = {
            "\1\2\3\uffff\2\2\5\uffff\1\5\5\uffff\1\2\1\uffff\1\1\1\uffff\4\2\2\uffff\4\2\24\uffff\1\3\1\4\5\2",
            "",
            "",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2\2\uffff\4\2\30\uffff\3\2",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2\2\uffff\4\2\30\uffff\3\2",
            "\1\6\1\7",
            "\1\11\1\10\1\uffff\2\2",
            "\1\11\1\10\1\uffff\2\2",
            "\1\12\1\13\10\uffff\1\14",
            "\1\15\1\16\10\uffff\1\14",
            "\1\17\1\uffff\2\2",
            "\1\17\1\uffff\2\2",
            "",
            "\1\20\2\uffff\2\2",
            "\1\20\2\uffff\2\2",
            "\1\12\1\13\10\uffff\1\14",
            "\1\15\1\16\10\uffff\1\14"
    };
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final short[][] dfa_40 = unpackEncodedStringArray(dfa_40s);

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_39;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_11;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "()* loopback of 2108:3: ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_41s = "\11\uffff";
    static final String dfa_42s = "\2\4\4\10\3\uffff";
    static final String dfa_43s = "\6\75\3\uffff";
    static final String dfa_44s = "\6\uffff\1\1\1\2\1\3";
    static final String dfa_45s = "\11\uffff}>";
    static final String[] dfa_46s = {
            "\1\1\3\uffff\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\1\10\24\uffff\1\2\1\3\1\4\1\5\3\10",
            "\1\1\3\uffff\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\1\10\24\uffff\1\2\1\3\1\4\1\5\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\1\10\30\uffff\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\1\10\30\uffff\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\1\10\30\uffff\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\1\10\30\uffff\3\10",
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

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_41;
            this.eof = dfa_41;
            this.min = dfa_42;
            this.max = dfa_43;
            this.accept = dfa_44;
            this.special = dfa_45;
            this.transition = dfa_46;
        }
        public String getDescription() {
            return "2171:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )";
        }
    }
    static final String dfa_47s = "\14\uffff";
    static final String dfa_48s = "\2\10\1\uffff\4\23\1\uffff\3\10\1\uffff";
    static final String dfa_49s = "\2\75\1\uffff\4\53\1\uffff\3\53\1\uffff";
    static final String dfa_50s = "\2\uffff\1\1\4\uffff\1\3\3\uffff\1\2";
    static final String dfa_51s = "\14\uffff}>";
    static final String[] dfa_52s = {
            "\1\3\1\4\30\uffff\1\1\30\uffff\3\2",
            "\1\5\1\6\16\uffff\1\7\21\uffff\2\13\17\uffff\1\10\1\11\1\12",
            "",
            "\1\2\2\uffff\1\2\1\uffff\1\7\12\uffff\2\2\2\uffff\1\2\2\uffff\2\2",
            "\1\2\2\uffff\1\2\1\uffff\1\7\12\uffff\2\2\2\uffff\1\2\2\uffff\2\2",
            "\1\2\2\uffff\1\2\1\uffff\1\7\12\uffff\2\2\2\uffff\1\2\2\uffff\2\2",
            "\1\2\2\uffff\1\2\1\uffff\1\7\12\uffff\2\2\2\uffff\1\2\2\uffff\2\2",
            "",
            "\2\2\40\uffff\2\13",
            "\2\2\40\uffff\2\13",
            "\2\2\40\uffff\2\13",
            ""
    };

    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[][] dfa_52 = unpackEncodedStringArray(dfa_52s);

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_47;
            this.eof = dfa_47;
            this.min = dfa_48;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_51;
            this.transition = dfa_52;
        }
        public String getDescription() {
            return "2483:3: ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) )";
        }
    }
    static final String dfa_53s = "\16\uffff";
    static final String dfa_54s = "\2\uffff\2\11\6\uffff\4\11";
    static final String dfa_55s = "\1\5\1\uffff\2\20\2\uffff\2\10\2\uffff\2\21\2\20";
    static final String dfa_56s = "\1\64\1\uffff\2\63\2\uffff\2\11\2\uffff\4\63";
    static final String dfa_57s = "\1\uffff\1\1\2\uffff\1\4\1\5\2\uffff\1\3\1\2\4\uffff";
    static final String dfa_58s = "\16\uffff}>";
    static final String[] dfa_59s = {
            "\3\1\1\2\1\3\7\uffff\2\1\3\uffff\1\4\33\uffff\1\5\1\uffff\1\1",
            "",
            "\1\7\1\6\2\11\2\uffff\2\11\6\uffff\1\11\10\uffff\1\11\1\uffff\1\11\3\uffff\5\11\1\10\1\11",
            "\1\7\1\6\2\11\2\uffff\2\11\6\uffff\1\11\10\uffff\1\11\1\uffff\1\11\3\uffff\5\11\1\10\1\11",
            "",
            "",
            "\1\12\1\13",
            "\1\14\1\15",
            "",
            "",
            "\1\6\2\11\2\uffff\2\11\6\uffff\1\11\10\uffff\1\11\1\uffff\1\11\3\uffff\5\11\1\10\1\11",
            "\1\6\2\11\2\uffff\2\11\6\uffff\1\11\10\uffff\1\11\1\uffff\1\11\3\uffff\5\11\1\10\1\11",
            "\1\7\1\uffff\2\11\2\uffff\2\11\6\uffff\1\11\10\uffff\1\11\1\uffff\1\11\3\uffff\5\11\1\10\1\11",
            "\1\7\1\uffff\2\11\2\uffff\2\11\6\uffff\1\11\10\uffff\1\11\1\uffff\1\11\3\uffff\5\11\1\10\1\11"
    };

    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final char[] dfa_56 = DFA.unpackEncodedStringToUnsignedChars(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final short[][] dfa_59 = unpackEncodedStringArray(dfa_59s);

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = dfa_53;
            this.eof = dfa_54;
            this.min = dfa_55;
            this.max = dfa_56;
            this.accept = dfa_57;
            this.special = dfa_58;
            this.transition = dfa_59;
        }
        public String getDescription() {
            return "3694:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0180000000008012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x018000001EA08310L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x018000001E208310L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000300L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000300L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000021000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x3F8000039EA08310L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0780000016208010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000016208000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x3F80000388000310L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x3800000388000300L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x3800000008000300L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x38000C0000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001001000300L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x3F8000079EA08310L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0780000388000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000388000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x38000C0008000300L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x3F80000408000310L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x3800000408000300L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000800480000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000009800480000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008800480000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000C9000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00000C8000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0014C000004603E0L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000006000000300L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000004000000300L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00100000000600E0L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000001001000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0003E00000040002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x00140000004603E0L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x001CC000004603E0L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0008000040000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0014C00000C603E0L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0060000000000082L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000C00000000080L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000020002L});

}