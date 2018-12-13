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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOCUMENTATION_COMMENT", "RULE_BOOLEAN_VALUE", "RULE_STRING_VALUE", "RULE_NATURAL_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'import'", "'::'", "'.'", "'*'", "';'", "'as'", "'package'", "'{'", "'}'", "'is'", "'class'", "'assoc'", "'feature'", "'part'", "'port'", "'connector'", "'abstract'", "'specializes'", "','", "'end'", "'='", "':'", "'compose'", "'any'", "'['", "'..'", "']'", "'ordered'", "'nonunique'", "'subsets'", "'redefines'", "'to'", "'('", "')'", "'=>'", "'@'", "'+'", "'-'", "'/'", "'^'", "'null'", "'e'", "'E'", "'public'", "'private'", "'protected'", "'packaged'", "'in'", "'out'", "'inout'"
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
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
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
    // InternalAlf.g:398:1: rulePackageImport returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? otherlv_2= 'import' ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) ) otherlv_13= ';' ) ;
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
        EObject lv_ownedElement_0_0 = null;

        Enumerator lv_visibility_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:404:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? otherlv_2= 'import' ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) ) otherlv_13= ';' ) )
            // InternalAlf.g:405:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? otherlv_2= 'import' ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) ) otherlv_13= ';' )
            {
            // InternalAlf.g:405:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? otherlv_2= 'import' ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) ) otherlv_13= ';' )
            // InternalAlf.g:406:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? otherlv_2= 'import' ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) ) otherlv_13= ';'
            {
            // InternalAlf.g:406:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAlf.g:407:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:407:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:408:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getPackageImportAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_ownedElement_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageImportRule());
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
            	    break loop4;
                }
            } while (true);

            // InternalAlf.g:425:3: ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=58 && LA5_0<=59)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAlf.g:426:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    {
                    // InternalAlf.g:426:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    // InternalAlf.g:427:5: lv_visibility_1_0= rulePackageElementVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getPackageImportAccess().getVisibilityPackageElementVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_10);
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

            otherlv_2=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageImportAccess().getImportKeyword_2());
            		
            // InternalAlf.g:448:3: ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==17) ) {
                    int LA7_3 = input.LA(3);

                    if ( ((LA7_3>=RULE_ID && LA7_3<=RULE_UNRESTRICTED_NAME)) ) {
                        alt7=3;
                    }
                    else if ( (LA7_3==18) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==16) ) {
                    int LA7_4 = input.LA(3);

                    if ( ((LA7_4>=RULE_ID && LA7_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_4==18) ) {
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

                if ( (LA7_2==16) ) {
                    int LA7_4 = input.LA(3);

                    if ( ((LA7_4>=RULE_ID && LA7_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_4==18) ) {
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
                        alt7=3;
                    }
                    else if ( (LA7_3==18) ) {
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
                    // InternalAlf.g:449:4: ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' )
                    {
                    // InternalAlf.g:449:4: ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' )
                    // InternalAlf.g:450:5: ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*'
                    {
                    // InternalAlf.g:450:5: ( ( ruleName ) )
                    // InternalAlf.g:451:6: ( ruleName )
                    {
                    // InternalAlf.g:451:6: ( ruleName )
                    // InternalAlf.g:452:7: ruleName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPackageImportRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_3_0_0_0());
                    						
                    pushFollow(FOLLOW_12);
                    ruleName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:466:5: (otherlv_4= '::' | otherlv_5= '.' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==16) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==17) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalAlf.g:467:6: otherlv_4= '::'
                            {
                            otherlv_4=(Token)match(input,16,FOLLOW_13); 

                            						newLeafNode(otherlv_4, grammarAccess.getPackageImportAccess().getColonColonKeyword_3_0_1_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:472:6: otherlv_5= '.'
                            {
                            otherlv_5=(Token)match(input,17,FOLLOW_13); 

                            						newLeafNode(otherlv_5, grammarAccess.getPackageImportAccess().getFullStopKeyword_3_0_1_1());
                            					

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_14); 

                    					newLeafNode(otherlv_6, grammarAccess.getPackageImportAccess().getAsteriskKeyword_3_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:483:4: ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' )
                    {
                    // InternalAlf.g:483:4: ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' )
                    // InternalAlf.g:484:5: ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*'
                    {
                    // InternalAlf.g:484:5: ( ( ruleColonQualifiedName ) )
                    // InternalAlf.g:485:6: ( ruleColonQualifiedName )
                    {
                    // InternalAlf.g:485:6: ( ruleColonQualifiedName )
                    // InternalAlf.g:486:7: ruleColonQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPackageImportRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_3_1_0_0());
                    						
                    pushFollow(FOLLOW_15);
                    ruleColonQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_8=(Token)match(input,16,FOLLOW_13); 

                    					newLeafNode(otherlv_8, grammarAccess.getPackageImportAccess().getColonColonKeyword_3_1_1());
                    				
                    otherlv_9=(Token)match(input,18,FOLLOW_14); 

                    					newLeafNode(otherlv_9, grammarAccess.getPackageImportAccess().getAsteriskKeyword_3_1_2());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:510:4: ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' )
                    {
                    // InternalAlf.g:510:4: ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' )
                    // InternalAlf.g:511:5: ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*'
                    {
                    // InternalAlf.g:511:5: ( ( ruleDotQualifiedName ) )
                    // InternalAlf.g:512:6: ( ruleDotQualifiedName )
                    {
                    // InternalAlf.g:512:6: ( ruleDotQualifiedName )
                    // InternalAlf.g:513:7: ruleDotQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPackageImportRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_3_2_0_0());
                    						
                    pushFollow(FOLLOW_16);
                    ruleDotQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_11=(Token)match(input,17,FOLLOW_13); 

                    					newLeafNode(otherlv_11, grammarAccess.getPackageImportAccess().getFullStopKeyword_3_2_1());
                    				
                    otherlv_12=(Token)match(input,18,FOLLOW_14); 

                    					newLeafNode(otherlv_12, grammarAccess.getPackageImportAccess().getAsteriskKeyword_3_2_2());
                    				

                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FOLLOW_2); 

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
    // InternalAlf.g:545:1: entryRuleElementImport returns [EObject current=null] : iv_ruleElementImport= ruleElementImport EOF ;
    public final EObject entryRuleElementImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementImport = null;


        try {
            // InternalAlf.g:545:54: (iv_ruleElementImport= ruleElementImport EOF )
            // InternalAlf.g:546:2: iv_ruleElementImport= ruleElementImport EOF
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
    // InternalAlf.g:552:1: ruleElementImport returns [EObject current=null] : (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleElementImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_PackageMemberPrefix_0 = null;

        AntlrDatatypeRuleToken lv_memberName_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:558:2: ( (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' ) )
            // InternalAlf.g:559:2: (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' )
            {
            // InternalAlf.g:559:2: (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' )
            // InternalAlf.g:560:3: this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';'
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getElementImportRule());
            			}
            			newCompositeNode(grammarAccess.getElementImportAccess().getPackageMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_PackageMemberPrefix_0=rulePackageMemberPrefix(current);

            state._fsp--;


            			current = this_PackageMemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getElementImportAccess().getImportKeyword_1());
            		
            // InternalAlf.g:575:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:576:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:576:4: ( ruleQualifiedName )
            // InternalAlf.g:577:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementImportRule());
            					}
            				

            					newCompositeNode(grammarAccess.getElementImportAccess().getMemberElementElementCrossReference_2_0());
            				
            pushFollow(FOLLOW_17);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:591:3: (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAlf.g:592:4: otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getElementImportAccess().getAsKeyword_3_0());
                    			
                    // InternalAlf.g:596:4: ( (lv_memberName_4_0= ruleName ) )
                    // InternalAlf.g:597:5: (lv_memberName_4_0= ruleName )
                    {
                    // InternalAlf.g:597:5: (lv_memberName_4_0= ruleName )
                    // InternalAlf.g:598:6: lv_memberName_4_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getElementImportAccess().getMemberNameNameParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
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
    // InternalAlf.g:624:1: entryRuleNonFeatureDefinition returns [EObject current=null] : iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF ;
    public final EObject entryRuleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureDefinition = null;


        try {
            // InternalAlf.g:624:61: (iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF )
            // InternalAlf.g:625:2: iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF
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
    // InternalAlf.g:631:1: ruleNonFeatureDefinition returns [EObject current=null] : (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_2= ruleAssociationDefinitionOrStub ) ;
    public final EObject ruleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinitionOrStub_0 = null;

        EObject this_ClassDefinitionOrStub_1 = null;

        EObject this_AssociationDefinitionOrStub_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:637:2: ( (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_2= ruleAssociationDefinitionOrStub ) )
            // InternalAlf.g:638:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_2= ruleAssociationDefinitionOrStub )
            {
            // InternalAlf.g:638:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_2= ruleAssociationDefinitionOrStub )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case 31:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==26) ) {
                    alt9=3;
                }
                else if ( (LA9_2==25) ) {
                    alt9=2;
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
                    // InternalAlf.g:639:3: this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub
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
                    // InternalAlf.g:648:3: this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub
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
                    // InternalAlf.g:657:3: this_AssociationDefinitionOrStub_2= ruleAssociationDefinitionOrStub
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
    // InternalAlf.g:669:1: entryRulePackageDefinitionOrStub returns [EObject current=null] : iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF ;
    public final EObject entryRulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDefinitionOrStub = null;


        try {
            // InternalAlf.g:669:64: (iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF )
            // InternalAlf.g:670:2: iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF
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
    // InternalAlf.g:676:1: rulePackageDefinitionOrStub returns [EObject current=null] : this_PackageDefinition_0= rulePackageDefinition[$current] ;
    public final EObject rulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:682:2: (this_PackageDefinition_0= rulePackageDefinition[$current] )
            // InternalAlf.g:683:2: this_PackageDefinition_0= rulePackageDefinition[$current]
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
    // InternalAlf.g:698:1: rulePackageDefinition[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' ) ;
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
            // InternalAlf.g:704:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' ) )
            // InternalAlf.g:705:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' )
            {
            // InternalAlf.g:705:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' )
            // InternalAlf.g:706:3: otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0());
            		
            // InternalAlf.g:710:3: ( (lv_name_1_0= ruleName ) )
            // InternalAlf.g:711:4: (lv_name_1_0= ruleName )
            {
            // InternalAlf.g:711:4: (lv_name_1_0= ruleName )
            // InternalAlf.g:712:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_2=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlf.g:733:3: ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )*
            loop10:
            do {
                int alt10=3;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalAlf.g:734:4: ( (lv_ownedMembership_3_0= rulePackageMember ) )
            	    {
            	    // InternalAlf.g:734:4: ( (lv_ownedMembership_3_0= rulePackageMember ) )
            	    // InternalAlf.g:735:5: (lv_ownedMembership_3_0= rulePackageMember )
            	    {
            	    // InternalAlf.g:735:5: (lv_ownedMembership_3_0= rulePackageMember )
            	    // InternalAlf.g:736:6: lv_ownedMembership_3_0= rulePackageMember
            	    {

            	    						newCompositeNode(grammarAccess.getPackageDefinitionAccess().getOwnedMembershipPackageMemberParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
            	    // InternalAlf.g:754:4: ( (lv_ownedImport_4_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:754:4: ( (lv_ownedImport_4_0= rulePackageImport ) )
            	    // InternalAlf.g:755:5: (lv_ownedImport_4_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:755:5: (lv_ownedImport_4_0= rulePackageImport )
            	    // InternalAlf.g:756:6: lv_ownedImport_4_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getPackageDefinitionAccess().getOwnedImportPackageImportParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
    // InternalAlf.g:782:1: entryRulePackageMember returns [EObject current=null] : iv_rulePackageMember= rulePackageMember EOF ;
    public final EObject entryRulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageMember = null;


        try {
            // InternalAlf.g:782:54: (iv_rulePackageMember= rulePackageMember EOF )
            // InternalAlf.g:783:2: iv_rulePackageMember= rulePackageMember EOF
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
    // InternalAlf.g:789:1: rulePackageMember returns [EObject current=null] : (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] ) ) ;
    public final EObject rulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject this_PackageMemberPrefix_0 = null;

        EObject this_NonFeatureMemberElement_1 = null;

        EObject this_FeaturePackageMemberElement_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:795:2: ( (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] ) ) )
            // InternalAlf.g:796:2: (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] ) )
            {
            // InternalAlf.g:796:2: (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] ) )
            // InternalAlf.g:797:3: this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getPackageMemberRule());
            			}
            			newCompositeNode(grammarAccess.getPackageMemberAccess().getPackageMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_PackageMemberPrefix_0=rulePackageMemberPrefix(current);

            state._fsp--;


            			current = this_PackageMemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:808:3: (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15||LA11_0==21||(LA11_0>=25 && LA11_0<=26)||LA11_0==31) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_UNRESTRICTED_NAME)||LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAlf.g:809:4: this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current]
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
                    // InternalAlf.g:821:4: this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current]
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
    // InternalAlf.g:838:1: rulePackageMemberPrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? ) ;
    public final EObject rulePackageMemberPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedElement_0_0 = null;

        Enumerator lv_visibility_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:844:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? ) )
            // InternalAlf.g:845:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? )
            {
            // InternalAlf.g:845:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? )
            // InternalAlf.g:846:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )?
            {
            // InternalAlf.g:846:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAlf.g:847:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:847:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:848:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getPackageMemberPrefixAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_ownedElement_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageMemberPrefixRule());
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
            	    break loop12;
                }
            } while (true);

            // InternalAlf.g:865:3: ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=58 && LA13_0<=59)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlf.g:866:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    {
                    // InternalAlf.g:866:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    // InternalAlf.g:867:5: lv_visibility_1_0= rulePackageElementVisibilityIndicator
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
    // InternalAlf.g:889:1: ruleNonFeatureMemberElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' ) ) ;
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
            // InternalAlf.g:895:2: ( ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' ) ) )
            // InternalAlf.g:896:2: ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' ) )
            {
            // InternalAlf.g:896:2: ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' ) )
            int alt18=5;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalAlf.g:897:3: ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) )
                    {
                    // InternalAlf.g:897:3: ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) )
                    // InternalAlf.g:898:4: (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition )
                    {
                    // InternalAlf.g:898:4: (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition )
                    // InternalAlf.g:899:5: lv_ownedMemberElement_0_0= ruleNonFeatureDefinition
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
                    // InternalAlf.g:917:3: (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
                    {
                    // InternalAlf.g:917:3: (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
                    // InternalAlf.g:918:4: otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getNonFeatureMemberElementAccess().getPackageKeyword_1_0());
                    			
                    // InternalAlf.g:922:4: ( (lv_memberName_2_0= ruleName ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalAlf.g:923:5: (lv_memberName_2_0= ruleName )
                            {
                            // InternalAlf.g:923:5: (lv_memberName_2_0= ruleName )
                            // InternalAlf.g:924:6: lv_memberName_2_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_23);
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

                    otherlv_3=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getNonFeatureMemberElementAccess().getIsKeyword_1_2());
                    			
                    // InternalAlf.g:945:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:946:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:946:5: ( ruleQualifiedName )
                    // InternalAlf.g:947:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementPackageCrossReference_1_3_0());
                    					
                    pushFollow(FOLLOW_14);
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
                    // InternalAlf.g:967:3: (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    {
                    // InternalAlf.g:967:3: (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    // InternalAlf.g:968:4: otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getNonFeatureMemberElementAccess().getClassKeyword_2_0());
                    			
                    // InternalAlf.g:972:4: ( (lv_memberName_7_0= ruleName ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalAlf.g:973:5: (lv_memberName_7_0= ruleName )
                            {
                            // InternalAlf.g:973:5: (lv_memberName_7_0= ruleName )
                            // InternalAlf.g:974:6: lv_memberName_7_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_2_1_0());
                            					
                            pushFollow(FOLLOW_23);
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

                    otherlv_8=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getNonFeatureMemberElementAccess().getIsKeyword_2_2());
                    			
                    // InternalAlf.g:995:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:996:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:996:5: ( ruleQualifiedName )
                    // InternalAlf.g:997:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementClassCrossReference_2_3_0());
                    					
                    pushFollow(FOLLOW_14);
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
                    // InternalAlf.g:1017:3: (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' )
                    {
                    // InternalAlf.g:1017:3: (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' )
                    // InternalAlf.g:1018:4: otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';'
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getNonFeatureMemberElementAccess().getAssocKeyword_3_0());
                    			
                    // InternalAlf.g:1022:4: ( (lv_memberName_12_0= ruleName ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalAlf.g:1023:5: (lv_memberName_12_0= ruleName )
                            {
                            // InternalAlf.g:1023:5: (lv_memberName_12_0= ruleName )
                            // InternalAlf.g:1024:6: lv_memberName_12_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_3_1_0());
                            					
                            pushFollow(FOLLOW_23);
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

                    otherlv_13=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getNonFeatureMemberElementAccess().getIsKeyword_3_2());
                    			
                    // InternalAlf.g:1045:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1046:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1046:5: ( ruleQualifiedName )
                    // InternalAlf.g:1047:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementAssociationCrossReference_3_3_0());
                    					
                    pushFollow(FOLLOW_14);
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
                    // InternalAlf.g:1067:3: (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' )
                    {
                    // InternalAlf.g:1067:3: (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' )
                    // InternalAlf.g:1068:4: otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';'
                    {
                    otherlv_16=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getNonFeatureMemberElementAccess().getImportKeyword_4_0());
                    			
                    // InternalAlf.g:1072:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1073:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1073:5: ( ruleQualifiedName )
                    // InternalAlf.g:1074:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNonFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberElementElementCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:1088:4: (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==20) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalAlf.g:1089:5: otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) )
                            {
                            otherlv_18=(Token)match(input,20,FOLLOW_11); 

                            					newLeafNode(otherlv_18, grammarAccess.getNonFeatureMemberElementAccess().getAsKeyword_4_2_0());
                            				
                            // InternalAlf.g:1093:5: ( (lv_memberName_19_0= ruleName ) )
                            // InternalAlf.g:1094:6: (lv_memberName_19_0= ruleName )
                            {
                            // InternalAlf.g:1094:6: (lv_memberName_19_0= ruleName )
                            // InternalAlf.g:1095:7: lv_memberName_19_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getNonFeatureMemberElementAccess().getMemberNameNameParserRuleCall_4_2_1_0());
                            						
                            pushFollow(FOLLOW_14);
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
    // InternalAlf.g:1123:1: ruleFeaturePackageMemberElement[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) ) ;
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
            // InternalAlf.g:1129:2: ( ( ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) ) )
            // InternalAlf.g:1130:2: ( ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) )
            {
            // InternalAlf.g:1130:2: ( ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA22_4 = input.LA(3);

                    if ( (LA22_4==24) ) {
                        alt22=3;
                    }
                    else if ( (LA22_4==19||LA22_4==22||(LA22_4>=35 && LA22_4<=36)||LA22_4==39||(LA22_4>=44 && LA22_4<=45)) ) {
                        alt22=1;
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

                    if ( (LA22_5==24) ) {
                        alt22=3;
                    }
                    else if ( (LA22_5==19||LA22_5==22||(LA22_5>=35 && LA22_5<=36)||LA22_5==39||(LA22_5>=44 && LA22_5<=45)) ) {
                        alt22=1;
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
                case 44:
                case 45:
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
                else if ( (LA22_2==19||LA22_2==22||(LA22_2>=35 && LA22_2<=36)||LA22_2==39||(LA22_2>=44 && LA22_2<=45)) ) {
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
                else if ( (LA22_3==19||LA22_3==22||(LA22_3>=35 && LA22_3<=36)||LA22_3==39||(LA22_3>=44 && LA22_3<=45)) ) {
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
                    // InternalAlf.g:1131:3: ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1131:3: ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1132:4: (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1132:4: (otherlv_0= 'feature' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==27) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalAlf.g:1133:5: otherlv_0= 'feature'
                            {
                            otherlv_0=(Token)match(input,27,FOLLOW_24); 

                            					newLeafNode(otherlv_0, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_0_0());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1138:4: ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1139:5: (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1139:5: (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1140:6: lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:1159:3: (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1159:3: (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:1160:4: otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_1_0());
                    			
                    // InternalAlf.g:1164:4: ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:1165:5: (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:1165:5: (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:1166:6: lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition
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
                    // InternalAlf.g:1185:3: ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' )
                    {
                    // InternalAlf.g:1185:3: ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' )
                    // InternalAlf.g:1186:4: ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';'
                    {
                    // InternalAlf.g:1186:4: ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) )
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
                            // InternalAlf.g:1187:5: (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? )
                            {
                            // InternalAlf.g:1187:5: (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? )
                            // InternalAlf.g:1188:6: otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )?
                            {
                            otherlv_4=(Token)match(input,27,FOLLOW_22); 

                            						newLeafNode(otherlv_4, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_2_0_0_0());
                            					
                            // InternalAlf.g:1192:6: ( (lv_memberName_5_0= ruleName ) )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // InternalAlf.g:1193:7: (lv_memberName_5_0= ruleName )
                                    {
                                    // InternalAlf.g:1193:7: (lv_memberName_5_0= ruleName )
                                    // InternalAlf.g:1194:8: lv_memberName_5_0= ruleName
                                    {

                                    								newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getMemberNameNameParserRuleCall_2_0_0_1_0());
                                    							
                                    pushFollow(FOLLOW_23);
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
                            // InternalAlf.g:1213:5: ( (lv_memberName_6_0= ruleName ) )
                            {
                            // InternalAlf.g:1213:5: ( (lv_memberName_6_0= ruleName ) )
                            // InternalAlf.g:1214:6: (lv_memberName_6_0= ruleName )
                            {
                            // InternalAlf.g:1214:6: (lv_memberName_6_0= ruleName )
                            // InternalAlf.g:1215:7: lv_memberName_6_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getMemberNameNameParserRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_23);
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

                    otherlv_7=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getFeaturePackageMemberElementAccess().getIsKeyword_2_1());
                    			
                    // InternalAlf.g:1237:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1238:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1238:5: ( ruleQualifiedName )
                    // InternalAlf.g:1239:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeaturePackageMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFeaturePackageMemberElementAccess().getMemberElementFeatureCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_14);
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


    // $ANTLR start "ruleCategoryBody"
    // InternalAlf.g:1263:1: ruleCategoryBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleCategoryMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleCategoryBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_ownedMembership_1_0 = null;

        EObject lv_ownedImport_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1269:2: ( (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleCategoryMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' ) )
            // InternalAlf.g:1270:2: (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleCategoryMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' )
            {
            // InternalAlf.g:1270:2: (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleCategoryMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' )
            // InternalAlf.g:1271:3: otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleCategoryMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getCategoryBodyAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAlf.g:1275:3: ( ( (lv_ownedMembership_1_0= ruleCategoryMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )*
            loop23:
            do {
                int alt23=3;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // InternalAlf.g:1276:4: ( (lv_ownedMembership_1_0= ruleCategoryMember ) )
            	    {
            	    // InternalAlf.g:1276:4: ( (lv_ownedMembership_1_0= ruleCategoryMember ) )
            	    // InternalAlf.g:1277:5: (lv_ownedMembership_1_0= ruleCategoryMember )
            	    {
            	    // InternalAlf.g:1277:5: (lv_ownedMembership_1_0= ruleCategoryMember )
            	    // InternalAlf.g:1278:6: lv_ownedMembership_1_0= ruleCategoryMember
            	    {

            	    						newCompositeNode(grammarAccess.getCategoryBodyAccess().getOwnedMembershipCategoryMemberParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_ownedMembership_1_0=ruleCategoryMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCategoryBodyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedMembership",
            	    							lv_ownedMembership_1_0,
            	    							"org.omg.sysml.Alf.CategoryMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:1296:4: ( (lv_ownedImport_2_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:1296:4: ( (lv_ownedImport_2_0= rulePackageImport ) )
            	    // InternalAlf.g:1297:5: (lv_ownedImport_2_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:1297:5: (lv_ownedImport_2_0= rulePackageImport )
            	    // InternalAlf.g:1298:6: lv_ownedImport_2_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getCategoryBodyAccess().getOwnedImportPackageImportParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_ownedImport_2_0=rulePackageImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCategoryBodyRule());
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
            	    break loop23;
                }
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCategoryBodyAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

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
    // InternalAlf.g:1324:1: entryRuleCategoryMember returns [EObject current=null] : iv_ruleCategoryMember= ruleCategoryMember EOF ;
    public final EObject entryRuleCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategoryMember = null;


        try {
            // InternalAlf.g:1324:55: (iv_ruleCategoryMember= ruleCategoryMember EOF )
            // InternalAlf.g:1325:2: iv_ruleCategoryMember= ruleCategoryMember EOF
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
    // InternalAlf.g:1331:1: ruleCategoryMember returns [EObject current=null] : (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember ) ;
    public final EObject ruleCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureCategoryMember_0 = null;

        EObject this_FeatureCategoryMember_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1337:2: ( (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember ) )
            // InternalAlf.g:1338:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember )
            {
            // InternalAlf.g:1338:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalAlf.g:1339:3: this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember
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
                    // InternalAlf.g:1348:3: this_FeatureCategoryMember_1= ruleFeatureCategoryMember
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
    // InternalAlf.g:1360:1: entryRuleNonFeatureCategoryMember returns [EObject current=null] : iv_ruleNonFeatureCategoryMember= ruleNonFeatureCategoryMember EOF ;
    public final EObject entryRuleNonFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureCategoryMember = null;


        try {
            // InternalAlf.g:1360:65: (iv_ruleNonFeatureCategoryMember= ruleNonFeatureCategoryMember EOF )
            // InternalAlf.g:1361:2: iv_ruleNonFeatureCategoryMember= ruleNonFeatureCategoryMember EOF
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
    // InternalAlf.g:1367:1: ruleNonFeatureCategoryMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] ) ;
    public final EObject ruleNonFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject this_CategoryMemberPrefix_0 = null;

        EObject this_NonFeatureMemberElement_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1373:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] ) )
            // InternalAlf.g:1374:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] )
            {
            // InternalAlf.g:1374:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] )
            // InternalAlf.g:1375:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getNonFeatureCategoryMemberRule());
            			}
            			newCompositeNode(grammarAccess.getNonFeatureCategoryMemberAccess().getCategoryMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
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
    // InternalAlf.g:1401:1: entryRuleFeatureCategoryMember returns [EObject current=null] : iv_ruleFeatureCategoryMember= ruleFeatureCategoryMember EOF ;
    public final EObject entryRuleFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCategoryMember = null;


        try {
            // InternalAlf.g:1401:62: (iv_ruleFeatureCategoryMember= ruleFeatureCategoryMember EOF )
            // InternalAlf.g:1402:2: iv_ruleFeatureCategoryMember= ruleFeatureCategoryMember EOF
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
    // InternalAlf.g:1408:1: ruleFeatureCategoryMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_4_0= ruleName ) ) otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ;
    public final EObject ruleFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_CategoryMemberPrefix_0 = null;

        EObject this_FeatureMemberElement_1 = null;

        Enumerator lv_direction_2_0 = null;

        EObject lv_ownedFeatureElement_3_0 = null;

        AntlrDatatypeRuleToken lv_memberName_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1414:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_4_0= ruleName ) ) otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            // InternalAlf.g:1415:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_4_0= ruleName ) ) otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            {
            // InternalAlf.g:1415:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_4_0= ruleName ) ) otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            // InternalAlf.g:1416:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_4_0= ruleName ) ) otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureCategoryMemberRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getCategoryMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_CategoryMemberPrefix_0=ruleCategoryMemberPrefix(current);

            state._fsp--;


            			current = this_CategoryMemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:1427:3: (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_4_0= ruleName ) ) otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt26=1;
                }
                break;
            case 62:
            case 63:
            case 64:
                {
                alt26=2;
                }
                break;
            case RULE_ID:
                {
                int LA26_3 = input.LA(2);

                if ( (LA26_3==24) ) {
                    alt26=3;
                }
                else if ( (LA26_3==19||LA26_3==22||(LA26_3>=35 && LA26_3<=36)||LA26_3==39||(LA26_3>=44 && LA26_3<=45)) ) {
                    alt26=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA26_4 = input.LA(2);

                if ( (LA26_4==24) ) {
                    alt26=3;
                }
                else if ( (LA26_4==19||LA26_4==22||(LA26_4>=35 && LA26_4<=36)||LA26_4==39||(LA26_4>=44 && LA26_4<=45)) ) {
                    alt26=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 4, input);

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
                    // InternalAlf.g:1428:4: this_FeatureMemberElement_1= ruleFeatureMemberElement[$current]
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
                    // InternalAlf.g:1440:4: ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_3_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1440:4: ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_3_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1441:5: ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_3_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1441:5: ( (lv_direction_2_0= ruleFeatureDirection ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=62 && LA25_0<=64)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalAlf.g:1442:6: (lv_direction_2_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1442:6: (lv_direction_2_0= ruleFeatureDirection )
                            // InternalAlf.g:1443:7: lv_direction_2_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_24);
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

                    // InternalAlf.g:1460:5: ( (lv_ownedFeatureElement_3_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1461:6: (lv_ownedFeatureElement_3_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1461:6: (lv_ownedFeatureElement_3_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1462:7: lv_ownedFeatureElement_3_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getOwnedFeatureElementNamedFeatureDefinitionParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedFeatureElement_3_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeatureCategoryMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedFeatureElement",
                    								lv_ownedFeatureElement_3_0,
                    								"org.omg.sysml.Alf.NamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1481:4: ( ( (lv_memberName_4_0= ruleName ) ) otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
                    {
                    // InternalAlf.g:1481:4: ( ( (lv_memberName_4_0= ruleName ) ) otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
                    // InternalAlf.g:1482:5: ( (lv_memberName_4_0= ruleName ) ) otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';'
                    {
                    // InternalAlf.g:1482:5: ( (lv_memberName_4_0= ruleName ) )
                    // InternalAlf.g:1483:6: (lv_memberName_4_0= ruleName )
                    {
                    // InternalAlf.g:1483:6: (lv_memberName_4_0= ruleName )
                    // InternalAlf.g:1484:7: lv_memberName_4_0= ruleName
                    {

                    							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getMemberNameNameParserRuleCall_1_2_0_0());
                    						
                    pushFollow(FOLLOW_23);
                    lv_memberName_4_0=ruleName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeatureCategoryMemberRule());
                    							}
                    							set(
                    								current,
                    								"memberName",
                    								lv_memberName_4_0,
                    								"org.omg.sysml.Alf.Name");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,24,FOLLOW_11); 

                    					newLeafNode(otherlv_5, grammarAccess.getFeatureCategoryMemberAccess().getIsKeyword_1_2_1());
                    				
                    // InternalAlf.g:1505:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1506:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1506:6: ( ruleQualifiedName )
                    // InternalAlf.g:1507:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFeatureCategoryMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getFeatureCategoryMemberAccess().getMemberFeatureFeatureCrossReference_1_2_2_0());
                    						
                    pushFollow(FOLLOW_14);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getFeatureCategoryMemberAccess().getSemicolonKeyword_1_2_3());
                    				

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
    // InternalAlf.g:1532:1: ruleCategoryMemberPrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ) ;
    public final EObject ruleCategoryMemberPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedElement_0_0 = null;

        Enumerator lv_visibility_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1538:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ) )
            // InternalAlf.g:1539:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? )
            {
            // InternalAlf.g:1539:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? )
            // InternalAlf.g:1540:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            {
            // InternalAlf.g:1540:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAlf.g:1541:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:1541:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:1542:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getCategoryMemberPrefixAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_ownedElement_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCategoryMemberPrefixRule());
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
            	    break loop27;
                }
            } while (true);

            // InternalAlf.g:1559:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=58 && LA28_0<=61)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAlf.g:1560:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:1560:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:1561:5: lv_visibility_1_0= ruleVisibilityIndicator
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
    // InternalAlf.g:1583:1: ruleFeatureMemberElement[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_4_0= ruleFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isPart_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'connector' ( (lv_ownedFeatureElement_12_0= ruleConnectorDefinition ) ) ) | (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) ;
    public final EObject ruleFeatureMemberElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_isPart_1_0=null;
        Token lv_isPort_2_0=null;
        Token otherlv_5=null;
        Token lv_isPart_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Enumerator lv_direction_3_0 = null;

        EObject lv_ownedFeatureElement_4_0 = null;

        AntlrDatatypeRuleToken lv_memberName_7_0 = null;

        EObject lv_ownedFeatureElement_12_0 = null;

        AntlrDatatypeRuleToken lv_memberName_14_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1589:2: ( ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_4_0= ruleFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isPart_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'connector' ( (lv_ownedFeatureElement_12_0= ruleConnectorDefinition ) ) ) | (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) )
            // InternalAlf.g:1590:2: ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_4_0= ruleFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isPart_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'connector' ( (lv_ownedFeatureElement_12_0= ruleConnectorDefinition ) ) ) | (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )
            {
            // InternalAlf.g:1590:2: ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_4_0= ruleFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isPart_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'connector' ( (lv_ownedFeatureElement_12_0= ruleConnectorDefinition ) ) ) | (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )
            int alt34=4;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalAlf.g:1591:3: ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_4_0= ruleFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1591:3: ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_4_0= ruleFeatureDefinition ) ) )
                    // InternalAlf.g:1592:4: (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_4_0= ruleFeatureDefinition ) )
                    {
                    // InternalAlf.g:1592:4: (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) )
                    int alt29=3;
                    switch ( input.LA(1) ) {
                    case 27:
                        {
                        alt29=1;
                        }
                        break;
                    case 28:
                        {
                        alt29=2;
                        }
                        break;
                    case 29:
                        {
                        alt29=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }

                    switch (alt29) {
                        case 1 :
                            // InternalAlf.g:1593:5: otherlv_0= 'feature'
                            {
                            otherlv_0=(Token)match(input,27,FOLLOW_30); 

                            					newLeafNode(otherlv_0, grammarAccess.getFeatureMemberElementAccess().getFeatureKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1598:5: ( (lv_isPart_1_0= 'part' ) )
                            {
                            // InternalAlf.g:1598:5: ( (lv_isPart_1_0= 'part' ) )
                            // InternalAlf.g:1599:6: (lv_isPart_1_0= 'part' )
                            {
                            // InternalAlf.g:1599:6: (lv_isPart_1_0= 'part' )
                            // InternalAlf.g:1600:7: lv_isPart_1_0= 'part'
                            {
                            lv_isPart_1_0=(Token)match(input,28,FOLLOW_30); 

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
                            // InternalAlf.g:1613:5: ( (lv_isPort_2_0= 'port' ) )
                            {
                            // InternalAlf.g:1613:5: ( (lv_isPort_2_0= 'port' ) )
                            // InternalAlf.g:1614:6: (lv_isPort_2_0= 'port' )
                            {
                            // InternalAlf.g:1614:6: (lv_isPort_2_0= 'port' )
                            // InternalAlf.g:1615:7: lv_isPort_2_0= 'port'
                            {
                            lv_isPort_2_0=(Token)match(input,29,FOLLOW_30); 

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

                    // InternalAlf.g:1628:4: ( (lv_direction_3_0= ruleFeatureDirection ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=62 && LA30_0<=64)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalAlf.g:1629:5: (lv_direction_3_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1629:5: (lv_direction_3_0= ruleFeatureDirection )
                            // InternalAlf.g:1630:6: lv_direction_3_0= ruleFeatureDirection
                            {

                            						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getDirectionFeatureDirectionEnumRuleCall_0_1_0());
                            					
                            pushFollow(FOLLOW_30);
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

                    // InternalAlf.g:1647:4: ( (lv_ownedFeatureElement_4_0= ruleFeatureDefinition ) )
                    // InternalAlf.g:1648:5: (lv_ownedFeatureElement_4_0= ruleFeatureDefinition )
                    {
                    // InternalAlf.g:1648:5: (lv_ownedFeatureElement_4_0= ruleFeatureDefinition )
                    // InternalAlf.g:1649:6: lv_ownedFeatureElement_4_0= ruleFeatureDefinition
                    {

                    						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getOwnedFeatureElementFeatureDefinitionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedFeatureElement_4_0=ruleFeatureDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureMemberElementRule());
                    						}
                    						set(
                    							current,
                    							"ownedFeatureElement",
                    							lv_ownedFeatureElement_4_0,
                    							"org.omg.sysml.Alf.FeatureDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1668:3: ( (otherlv_5= 'feature' | ( (lv_isPart_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    {
                    // InternalAlf.g:1668:3: ( (otherlv_5= 'feature' | ( (lv_isPart_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    // InternalAlf.g:1669:4: (otherlv_5= 'feature' | ( (lv_isPart_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';'
                    {
                    // InternalAlf.g:1669:4: (otherlv_5= 'feature' | ( (lv_isPart_6_0= 'part' ) ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==27) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==28) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalAlf.g:1670:5: otherlv_5= 'feature'
                            {
                            otherlv_5=(Token)match(input,27,FOLLOW_22); 

                            					newLeafNode(otherlv_5, grammarAccess.getFeatureMemberElementAccess().getFeatureKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1675:5: ( (lv_isPart_6_0= 'part' ) )
                            {
                            // InternalAlf.g:1675:5: ( (lv_isPart_6_0= 'part' ) )
                            // InternalAlf.g:1676:6: (lv_isPart_6_0= 'part' )
                            {
                            // InternalAlf.g:1676:6: (lv_isPart_6_0= 'part' )
                            // InternalAlf.g:1677:7: lv_isPart_6_0= 'part'
                            {
                            lv_isPart_6_0=(Token)match(input,28,FOLLOW_22); 

                            							newLeafNode(lv_isPart_6_0, grammarAccess.getFeatureMemberElementAccess().getIsPartPartKeyword_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFeatureMemberElementRule());
                            							}
                            							setWithLastConsumed(current, "isPart", true, "part");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1690:4: ( (lv_memberName_7_0= ruleName ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalAlf.g:1691:5: (lv_memberName_7_0= ruleName )
                            {
                            // InternalAlf.g:1691:5: (lv_memberName_7_0= ruleName )
                            // InternalAlf.g:1692:6: lv_memberName_7_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getMemberNameNameParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_23);
                            lv_memberName_7_0=ruleName();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFeatureMemberElementRule());
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

                    otherlv_8=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getFeatureMemberElementAccess().getIsKeyword_1_2());
                    			
                    // InternalAlf.g:1713:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1714:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1714:5: ( ruleQualifiedName )
                    // InternalAlf.g:1715:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getMemberFeatureFeatureCrossReference_1_3_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getFeatureMemberElementAccess().getSemicolonKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1735:3: (otherlv_11= 'connector' ( (lv_ownedFeatureElement_12_0= ruleConnectorDefinition ) ) )
                    {
                    // InternalAlf.g:1735:3: (otherlv_11= 'connector' ( (lv_ownedFeatureElement_12_0= ruleConnectorDefinition ) ) )
                    // InternalAlf.g:1736:4: otherlv_11= 'connector' ( (lv_ownedFeatureElement_12_0= ruleConnectorDefinition ) )
                    {
                    otherlv_11=(Token)match(input,30,FOLLOW_31); 

                    				newLeafNode(otherlv_11, grammarAccess.getFeatureMemberElementAccess().getConnectorKeyword_2_0());
                    			
                    // InternalAlf.g:1740:4: ( (lv_ownedFeatureElement_12_0= ruleConnectorDefinition ) )
                    // InternalAlf.g:1741:5: (lv_ownedFeatureElement_12_0= ruleConnectorDefinition )
                    {
                    // InternalAlf.g:1741:5: (lv_ownedFeatureElement_12_0= ruleConnectorDefinition )
                    // InternalAlf.g:1742:6: lv_ownedFeatureElement_12_0= ruleConnectorDefinition
                    {

                    						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getOwnedFeatureElementConnectorDefinitionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedFeatureElement_12_0=ruleConnectorDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureMemberElementRule());
                    						}
                    						set(
                    							current,
                    							"ownedFeatureElement",
                    							lv_ownedFeatureElement_12_0,
                    							"org.omg.sysml.Alf.ConnectorDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1761:3: (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    {
                    // InternalAlf.g:1761:3: (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    // InternalAlf.g:1762:4: otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';'
                    {
                    otherlv_13=(Token)match(input,30,FOLLOW_22); 

                    				newLeafNode(otherlv_13, grammarAccess.getFeatureMemberElementAccess().getConnectorKeyword_3_0());
                    			
                    // InternalAlf.g:1766:4: ( (lv_memberName_14_0= ruleName ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalAlf.g:1767:5: (lv_memberName_14_0= ruleName )
                            {
                            // InternalAlf.g:1767:5: (lv_memberName_14_0= ruleName )
                            // InternalAlf.g:1768:6: lv_memberName_14_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getMemberNameNameParserRuleCall_3_1_0());
                            					
                            pushFollow(FOLLOW_23);
                            lv_memberName_14_0=ruleName();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFeatureMemberElementRule());
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

                    otherlv_15=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getFeatureMemberElementAccess().getIsKeyword_3_2());
                    			
                    // InternalAlf.g:1789:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1790:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1790:5: ( ruleQualifiedName )
                    // InternalAlf.g:1791:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getMemberFeatureConnectorCrossReference_3_3_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getFeatureMemberElementAccess().getSemicolonKeyword_3_4());
                    			

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
    // InternalAlf.g:1814:1: entryRuleClassDefinitionOrStub returns [EObject current=null] : iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF ;
    public final EObject entryRuleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:1814:62: (iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:1815:2: iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF
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
    // InternalAlf.g:1821:1: ruleClassDefinitionOrStub returns [EObject current=null] : this_ClassDefinition_0= ruleClassDefinition[$current] ;
    public final EObject ruleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1827:2: (this_ClassDefinition_0= ruleClassDefinition[$current] )
            // InternalAlf.g:1828:2: this_ClassDefinition_0= ruleClassDefinition[$current]
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
    // InternalAlf.g:1843:1: ruleClassDefinition[EObject in_current] returns [EObject current=in_current] : (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) ;
    public final EObject ruleClassDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_ClassDeclaration_0 = null;

        EObject this_CategoryBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1849:2: ( (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) )
            // InternalAlf.g:1850:2: (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:1850:2: (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            // InternalAlf.g:1851:3: this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getClassDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getClassDefinitionAccess().getClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
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
    // InternalAlf.g:1878:1: ruleClassDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )? ) ;
    public final EObject ruleClassDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedElement_4_0 = null;

        EObject lv_ownedElement_6_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1884:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )? ) )
            // InternalAlf.g:1885:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )? )
            {
            // InternalAlf.g:1885:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )? )
            // InternalAlf.g:1886:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )?
            {
            // InternalAlf.g:1886:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==31) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAlf.g:1887:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:1887:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:1888:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,31,FOLLOW_32); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDeclarationAccess().getClassKeyword_1());
            		
            // InternalAlf.g:1904:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:1905:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:1905:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:1906:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getClassDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalAlf.g:1923:3: (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==32) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAlf.g:1924:4: otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )*
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0());
                    			
                    // InternalAlf.g:1928:4: ( (lv_ownedElement_4_0= ruleGeneralization ) )
                    // InternalAlf.g:1929:5: (lv_ownedElement_4_0= ruleGeneralization )
                    {
                    // InternalAlf.g:1929:5: (lv_ownedElement_4_0= ruleGeneralization )
                    // InternalAlf.g:1930:6: lv_ownedElement_4_0= ruleGeneralization
                    {

                    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedElementGeneralizationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_ownedElement_4_0=ruleGeneralization();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"ownedElement",
                    							lv_ownedElement_4_0,
                    							"org.omg.sysml.Alf.Generalization");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:1947:4: (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==33) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalAlf.g:1948:5: otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) )
                    	    {
                    	    otherlv_5=(Token)match(input,33,FOLLOW_11); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:1952:5: ( (lv_ownedElement_6_0= ruleGeneralization ) )
                    	    // InternalAlf.g:1953:6: (lv_ownedElement_6_0= ruleGeneralization )
                    	    {
                    	    // InternalAlf.g:1953:6: (lv_ownedElement_6_0= ruleGeneralization )
                    	    // InternalAlf.g:1954:7: lv_ownedElement_6_0= ruleGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedElementGeneralizationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    lv_ownedElement_6_0=ruleGeneralization();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedElement",
                    	    								lv_ownedElement_6_0,
                    	    								"org.omg.sysml.Alf.Generalization");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
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


    // $ANTLR start "entryRuleGeneralization"
    // InternalAlf.g:1977:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalAlf.g:1977:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalAlf.g:1978:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalAlf.g:1984:1: ruleGeneralization returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:1990:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:1991:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:1991:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1992:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:1992:3: ( ruleQualifiedName )
            // InternalAlf.g:1993:4: ruleQualifiedName
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


    // $ANTLR start "entryRuleAssociationDefinitionOrStub"
    // InternalAlf.g:2010:1: entryRuleAssociationDefinitionOrStub returns [EObject current=null] : iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF ;
    public final EObject entryRuleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinitionOrStub = null;


        try {
            // InternalAlf.g:2010:68: (iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF )
            // InternalAlf.g:2011:2: iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF
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
    // InternalAlf.g:2017:1: ruleAssociationDefinitionOrStub returns [EObject current=null] : this_AssociationDefinition_0= ruleAssociationDefinition[$current] ;
    public final EObject ruleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_AssociationDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2023:2: (this_AssociationDefinition_0= ruleAssociationDefinition[$current] )
            // InternalAlf.g:2024:2: this_AssociationDefinition_0= ruleAssociationDefinition[$current]
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
    // InternalAlf.g:2039:1: ruleAssociationDefinition[EObject in_current] returns [EObject current=in_current] : (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] ) ;
    public final EObject ruleAssociationDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_AssociationDeclaration_0 = null;

        EObject this_AssociationBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2045:2: ( (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] ) )
            // InternalAlf.g:2046:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] )
            {
            // InternalAlf.g:2046:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] )
            // InternalAlf.g:2047:3: this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getAssociationDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
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
    // InternalAlf.g:2074:1: ruleAssociationDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )? ) ;
    public final EObject ruleAssociationDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedElement_4_0 = null;

        EObject lv_ownedElement_6_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2080:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )? ) )
            // InternalAlf.g:2081:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )? )
            {
            // InternalAlf.g:2081:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )? )
            // InternalAlf.g:2082:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )?
            {
            // InternalAlf.g:2082:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==31) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAlf.g:2083:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:2083:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:2084:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,31,FOLLOW_35); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getAssociationDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociationDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationDeclarationAccess().getAssocKeyword_1());
            		
            // InternalAlf.g:2100:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:2101:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:2101:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:2102:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalAlf.g:2119:3: (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==32) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAlf.g:2120:4: otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )*
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getAssociationDeclarationAccess().getSpecializesKeyword_3_0());
                    			
                    // InternalAlf.g:2124:4: ( (lv_ownedElement_4_0= ruleGeneralization ) )
                    // InternalAlf.g:2125:5: (lv_ownedElement_4_0= ruleGeneralization )
                    {
                    // InternalAlf.g:2125:5: (lv_ownedElement_4_0= ruleGeneralization )
                    // InternalAlf.g:2126:6: lv_ownedElement_4_0= ruleGeneralization
                    {

                    						newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getOwnedElementGeneralizationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_ownedElement_4_0=ruleGeneralization();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssociationDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"ownedElement",
                    							lv_ownedElement_4_0,
                    							"org.omg.sysml.Alf.Generalization");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:2143:4: (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==33) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalAlf.g:2144:5: otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) )
                    	    {
                    	    otherlv_5=(Token)match(input,33,FOLLOW_11); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAssociationDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:2148:5: ( (lv_ownedElement_6_0= ruleGeneralization ) )
                    	    // InternalAlf.g:2149:6: (lv_ownedElement_6_0= ruleGeneralization )
                    	    {
                    	    // InternalAlf.g:2149:6: (lv_ownedElement_6_0= ruleGeneralization )
                    	    // InternalAlf.g:2150:7: lv_ownedElement_6_0= ruleGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getOwnedElementGeneralizationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    lv_ownedElement_6_0=ruleGeneralization();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssociationDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedElement",
                    	    								lv_ownedElement_6_0,
                    	    								"org.omg.sysml.Alf.Generalization");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
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
    // InternalAlf.g:2174:1: ruleAssociationBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleAssociationBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_ownedMembership_1_0 = null;

        EObject lv_ownedImport_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2180:2: ( (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' ) )
            // InternalAlf.g:2181:2: (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' )
            {
            // InternalAlf.g:2181:2: (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' )
            // InternalAlf.g:2182:3: otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationBodyAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAlf.g:2186:3: ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )*
            loop41:
            do {
                int alt41=3;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // InternalAlf.g:2187:4: ( (lv_ownedMembership_1_0= ruleAssociationMember ) )
            	    {
            	    // InternalAlf.g:2187:4: ( (lv_ownedMembership_1_0= ruleAssociationMember ) )
            	    // InternalAlf.g:2188:5: (lv_ownedMembership_1_0= ruleAssociationMember )
            	    {
            	    // InternalAlf.g:2188:5: (lv_ownedMembership_1_0= ruleAssociationMember )
            	    // InternalAlf.g:2189:6: lv_ownedMembership_1_0= ruleAssociationMember
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
            	    // InternalAlf.g:2207:4: ( (lv_ownedImport_2_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:2207:4: ( (lv_ownedImport_2_0= rulePackageImport ) )
            	    // InternalAlf.g:2208:5: (lv_ownedImport_2_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:2208:5: (lv_ownedImport_2_0= rulePackageImport )
            	    // InternalAlf.g:2209:6: lv_ownedImport_2_0= rulePackageImport
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
            	    break loop41;
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
    // InternalAlf.g:2235:1: entryRuleAssociationMember returns [EObject current=null] : iv_ruleAssociationMember= ruleAssociationMember EOF ;
    public final EObject entryRuleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationMember = null;


        try {
            // InternalAlf.g:2235:58: (iv_ruleAssociationMember= ruleAssociationMember EOF )
            // InternalAlf.g:2236:2: iv_ruleAssociationMember= ruleAssociationMember EOF
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
    // InternalAlf.g:2242:1: ruleAssociationMember returns [EObject current=null] : (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember ) ;
    public final EObject ruleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureCategoryMember_0 = null;

        EObject this_AssociationFeatureMember_1 = null;

        EObject this_AssociationEndFeatureMember_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2248:2: ( (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember ) )
            // InternalAlf.g:2249:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )
            {
            // InternalAlf.g:2249:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )
            int alt42=3;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalAlf.g:2250:3: this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember
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
                    // InternalAlf.g:2259:3: this_AssociationFeatureMember_1= ruleAssociationFeatureMember
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
                    // InternalAlf.g:2268:3: this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember
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
    // InternalAlf.g:2280:1: entryRuleAssociationFeatureMember returns [EObject current=null] : iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF ;
    public final EObject entryRuleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationFeatureMember = null;


        try {
            // InternalAlf.g:2280:65: (iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF )
            // InternalAlf.g:2281:2: iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF
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
    // InternalAlf.g:2287:1: ruleAssociationFeatureMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] ) ;
    public final EObject ruleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject this_CategoryMemberPrefix_0 = null;

        EObject this_FeatureMemberElement_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2293:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] ) )
            // InternalAlf.g:2294:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] )
            {
            // InternalAlf.g:2294:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] )
            // InternalAlf.g:2295:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getCategoryMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
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
    // InternalAlf.g:2321:1: entryRuleAssociationEndFeatureMember returns [EObject current=null] : iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF ;
    public final EObject entryRuleAssociationEndFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEndFeatureMember = null;


        try {
            // InternalAlf.g:2321:68: (iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF )
            // InternalAlf.g:2322:2: iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF
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
    // InternalAlf.g:2328:1: ruleAssociationEndFeatureMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) ) ;
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

        EObject lv_ownedFeatureElement_5_0 = null;

        AntlrDatatypeRuleToken lv_memberName_8_0 = null;

        Enumerator lv_direction_12_0 = null;

        EObject lv_ownedFeatureElement_13_0 = null;

        AntlrDatatypeRuleToken lv_memberName_14_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2334:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) ) )
            // InternalAlf.g:2335:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) )
            {
            // InternalAlf.g:2335:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) )
            // InternalAlf.g:2336:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getCategoryMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_CategoryMemberPrefix_0=ruleCategoryMemberPrefix(current);

            state._fsp--;


            			current = this_CategoryMemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:2347:3: ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )
            int alt47=4;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // InternalAlf.g:2348:4: (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_5_0= ruleFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2348:4: (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_5_0= ruleFeatureDefinition ) ) )
                    // InternalAlf.g:2349:5: otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_5_0= ruleFeatureDefinition ) )
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_39); 

                    					newLeafNode(otherlv_1, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_1_0_0());
                    				
                    // InternalAlf.g:2353:5: ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )?
                    int alt43=3;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==28) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==29) ) {
                        alt43=2;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalAlf.g:2354:6: ( (lv_isPart_2_0= 'part' ) )
                            {
                            // InternalAlf.g:2354:6: ( (lv_isPart_2_0= 'part' ) )
                            // InternalAlf.g:2355:7: (lv_isPart_2_0= 'part' )
                            {
                            // InternalAlf.g:2355:7: (lv_isPart_2_0= 'part' )
                            // InternalAlf.g:2356:8: lv_isPart_2_0= 'part'
                            {
                            lv_isPart_2_0=(Token)match(input,28,FOLLOW_30); 

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
                            // InternalAlf.g:2369:6: ( (lv_isPort_3_0= 'port' ) )
                            {
                            // InternalAlf.g:2369:6: ( (lv_isPort_3_0= 'port' ) )
                            // InternalAlf.g:2370:7: (lv_isPort_3_0= 'port' )
                            {
                            // InternalAlf.g:2370:7: (lv_isPort_3_0= 'port' )
                            // InternalAlf.g:2371:8: lv_isPort_3_0= 'port'
                            {
                            lv_isPort_3_0=(Token)match(input,29,FOLLOW_30); 

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

                    // InternalAlf.g:2384:5: ( (lv_direction_4_0= ruleFeatureDirection ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( ((LA44_0>=62 && LA44_0<=64)) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalAlf.g:2385:6: (lv_direction_4_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2385:6: (lv_direction_4_0= ruleFeatureDirection )
                            // InternalAlf.g:2386:7: lv_direction_4_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_0_2_0());
                            						
                            pushFollow(FOLLOW_30);
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

                    // InternalAlf.g:2403:5: ( (lv_ownedFeatureElement_5_0= ruleFeatureDefinition ) )
                    // InternalAlf.g:2404:6: (lv_ownedFeatureElement_5_0= ruleFeatureDefinition )
                    {
                    // InternalAlf.g:2404:6: (lv_ownedFeatureElement_5_0= ruleFeatureDefinition )
                    // InternalAlf.g:2405:7: lv_ownedFeatureElement_5_0= ruleFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getOwnedFeatureElementFeatureDefinitionParserRuleCall_1_0_3_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedFeatureElement_5_0=ruleFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedFeatureElement",
                    								lv_ownedFeatureElement_5_0,
                    								"org.omg.sysml.Alf.FeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2424:4: (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' )
                    {
                    // InternalAlf.g:2424:4: (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' )
                    // InternalAlf.g:2425:5: otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_40); 

                    					newLeafNode(otherlv_6, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_1_1_0());
                    				
                    // InternalAlf.g:2429:5: ( (lv_isPart_7_0= 'part' ) )
                    // InternalAlf.g:2430:6: (lv_isPart_7_0= 'part' )
                    {
                    // InternalAlf.g:2430:6: (lv_isPart_7_0= 'part' )
                    // InternalAlf.g:2431:7: lv_isPart_7_0= 'part'
                    {
                    lv_isPart_7_0=(Token)match(input,28,FOLLOW_22); 

                    							newLeafNode(lv_isPart_7_0, grammarAccess.getAssociationEndFeatureMemberAccess().getIsPartPartKeyword_1_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    							setWithLastConsumed(current, "isPart", true, "part");
                    						

                    }


                    }

                    // InternalAlf.g:2443:5: ( (lv_memberName_8_0= ruleName ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalAlf.g:2444:6: (lv_memberName_8_0= ruleName )
                            {
                            // InternalAlf.g:2444:6: (lv_memberName_8_0= ruleName )
                            // InternalAlf.g:2445:7: lv_memberName_8_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberNameNameParserRuleCall_1_1_2_0());
                            						
                            pushFollow(FOLLOW_23);
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

                    otherlv_9=(Token)match(input,24,FOLLOW_11); 

                    					newLeafNode(otherlv_9, grammarAccess.getAssociationEndFeatureMemberAccess().getIsKeyword_1_1_3());
                    				
                    // InternalAlf.g:2466:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:2467:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:2467:6: ( ruleQualifiedName )
                    // InternalAlf.g:2468:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberFeatureFeatureCrossReference_1_1_4_0());
                    						
                    pushFollow(FOLLOW_14);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_11, grammarAccess.getAssociationEndFeatureMemberAccess().getSemicolonKeyword_1_1_5());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:2488:4: ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_13_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2488:4: ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_13_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:2489:5: ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_13_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:2489:5: ( (lv_direction_12_0= ruleFeatureDirection ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( ((LA46_0>=62 && LA46_0<=64)) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalAlf.g:2490:6: (lv_direction_12_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2490:6: (lv_direction_12_0= ruleFeatureDirection )
                            // InternalAlf.g:2491:7: lv_direction_12_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_24);
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

                    // InternalAlf.g:2508:5: ( (lv_ownedFeatureElement_13_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:2509:6: (lv_ownedFeatureElement_13_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:2509:6: (lv_ownedFeatureElement_13_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:2510:7: lv_ownedFeatureElement_13_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getOwnedFeatureElementNamedFeatureDefinitionParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedFeatureElement_13_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedFeatureElement",
                    								lv_ownedFeatureElement_13_0,
                    								"org.omg.sysml.Alf.NamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:2529:4: ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    {
                    // InternalAlf.g:2529:4: ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    // InternalAlf.g:2530:5: ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';'
                    {
                    // InternalAlf.g:2530:5: ( (lv_memberName_14_0= ruleName ) )
                    // InternalAlf.g:2531:6: (lv_memberName_14_0= ruleName )
                    {
                    // InternalAlf.g:2531:6: (lv_memberName_14_0= ruleName )
                    // InternalAlf.g:2532:7: lv_memberName_14_0= ruleName
                    {

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberNameNameParserRuleCall_1_3_0_0());
                    						
                    pushFollow(FOLLOW_23);
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

                    otherlv_15=(Token)match(input,24,FOLLOW_11); 

                    					newLeafNode(otherlv_15, grammarAccess.getAssociationEndFeatureMemberAccess().getIsKeyword_1_3_1());
                    				
                    // InternalAlf.g:2553:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:2554:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:2554:6: ( ruleQualifiedName )
                    // InternalAlf.g:2555:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberFeatureFeatureCrossReference_1_3_2_0());
                    						
                    pushFollow(FOLLOW_14);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_17=(Token)match(input,19,FOLLOW_2); 

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
    // InternalAlf.g:2579:1: entryRuleFeatureDefinition returns [EObject current=null] : iv_ruleFeatureDefinition= ruleFeatureDefinition EOF ;
    public final EObject entryRuleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDefinition = null;


        try {
            // InternalAlf.g:2579:58: (iv_ruleFeatureDefinition= ruleFeatureDefinition EOF )
            // InternalAlf.g:2580:2: iv_ruleFeatureDefinition= ruleFeatureDefinition EOF
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
    // InternalAlf.g:2586:1: ruleFeatureDefinition returns [EObject current=null] : (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) ;
    public final EObject ruleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_NamedFeatureDefinition_0 = null;

        EObject this_UnnamedFeatureDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2592:2: ( (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) )
            // InternalAlf.g:2593:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            {
            // InternalAlf.g:2593:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=44 && LA48_0<=45)) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalAlf.g:2594:3: this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:2603:3: this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition
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
    // InternalAlf.g:2615:1: entryRuleNamedFeatureDefinition returns [EObject current=null] : iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF ;
    public final EObject entryRuleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedFeatureDefinition = null;


        try {
            // InternalAlf.g:2615:63: (iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF )
            // InternalAlf.g:2616:2: iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF
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
    // InternalAlf.g:2622:1: ruleNamedFeatureDefinition returns [EObject current=null] : (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureDeclaration_0 = null;

        EObject this_FeatureCompletion_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2628:2: ( (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:2629:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:2629:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] )
            // InternalAlf.g:2630:3: this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getNamedFeatureDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getFeatureDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
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
    // InternalAlf.g:2656:1: entryRuleUnnamedFeatureDefinition returns [EObject current=null] : iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF ;
    public final EObject entryRuleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedFeatureDefinition = null;


        try {
            // InternalAlf.g:2656:65: (iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF )
            // InternalAlf.g:2657:2: iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF
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
    // InternalAlf.g:2663:1: ruleUnnamedFeatureDefinition returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? this_FeatureCompletion_3= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedElement_0_0 = null;

        EObject this_TypePart_1 = null;

        EObject this_Multiplicity_2 = null;

        EObject this_FeatureCompletion_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:2669:2: ( ( ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? this_FeatureCompletion_3= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:2670:2: ( ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? this_FeatureCompletion_3= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:2670:2: ( ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? this_FeatureCompletion_3= ruleFeatureCompletion[$current] )
            // InternalAlf.g:2671:3: ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? this_FeatureCompletion_3= ruleFeatureCompletion[$current]
            {
            // InternalAlf.g:2671:3: ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) )
            // InternalAlf.g:2672:4: (lv_ownedElement_0_0= ruleSubsetOrRedefinition )
            {
            // InternalAlf.g:2672:4: (lv_ownedElement_0_0= ruleSubsetOrRedefinition )
            // InternalAlf.g:2673:5: lv_ownedElement_0_0= ruleSubsetOrRedefinition
            {

            					newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedElementSubsetOrRedefinitionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_42);
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

            // InternalAlf.g:2690:3: (this_TypePart_1= ruleTypePart[$current] )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==36) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAlf.g:2691:4: this_TypePart_1= ruleTypePart[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getUnnamedFeatureDefinitionRule());
                    				}
                    				newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getTypePartParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_43);
                    this_TypePart_1=ruleTypePart(current);

                    state._fsp--;


                    				current = this_TypePart_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalAlf.g:2703:3: (this_Multiplicity_2= ruleMultiplicity[$current] )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==39) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAlf.g:2704:4: this_Multiplicity_2= ruleMultiplicity[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getUnnamedFeatureDefinitionRule());
                    				}
                    				newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getMultiplicityParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_41);
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
    // InternalAlf.g:2732:1: ruleFeatureBodyDefinition[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_CategoryBody_2= ruleCategoryBody[$current] ) ;
    public final EObject ruleFeatureBodyDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject this_FeatureDeclaration_1 = null;

        EObject this_CategoryBody_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2738:2: ( (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_CategoryBody_2= ruleCategoryBody[$current] ) )
            // InternalAlf.g:2739:2: (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_CategoryBody_2= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:2739:2: (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_CategoryBody_2= ruleCategoryBody[$current] )
            // InternalAlf.g:2740:3: otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_CategoryBody_2= ruleCategoryBody[$current]
            {
            otherlv_0=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureBodyDefinitionAccess().getFeatureKeyword_0());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureBodyDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureBodyDefinitionAccess().getFeatureDeclarationParserRuleCall_1());
            		
            pushFollow(FOLLOW_18);
            this_FeatureDeclaration_1=ruleFeatureDeclaration(current);

            state._fsp--;


            			current = this_FeatureDeclaration_1;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureBodyDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureBodyDefinitionAccess().getCategoryBodyParserRuleCall_2());
            		
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
    // $ANTLR end "ruleFeatureBodyDefinition"


    // $ANTLR start "ruleFeatureDeclaration"
    // InternalAlf.g:2771:1: ruleFeatureDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? ( (lv_ownedElement_3_0= ruleSubsetOrRedefinition ) )? ) ;
    public final EObject ruleFeatureDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject this_TypePart_1 = null;

        EObject this_Multiplicity_2 = null;

        EObject lv_ownedElement_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2777:2: ( ( ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? ( (lv_ownedElement_3_0= ruleSubsetOrRedefinition ) )? ) )
            // InternalAlf.g:2778:2: ( ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? ( (lv_ownedElement_3_0= ruleSubsetOrRedefinition ) )? )
            {
            // InternalAlf.g:2778:2: ( ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? ( (lv_ownedElement_3_0= ruleSubsetOrRedefinition ) )? )
            // InternalAlf.g:2779:3: ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? ( (lv_ownedElement_3_0= ruleSubsetOrRedefinition ) )?
            {
            // InternalAlf.g:2779:3: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:2780:4: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:2780:4: (lv_name_0_0= ruleName )
            // InternalAlf.g:2781:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
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

            // InternalAlf.g:2798:3: (this_TypePart_1= ruleTypePart[$current] )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==36) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAlf.g:2799:4: this_TypePart_1= ruleTypePart[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getFeatureDeclarationRule());
                    				}
                    				newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getTypePartParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_45);
                    this_TypePart_1=ruleTypePart(current);

                    state._fsp--;


                    				current = this_TypePart_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalAlf.g:2811:3: (this_Multiplicity_2= ruleMultiplicity[$current] )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==39) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAlf.g:2812:4: this_Multiplicity_2= ruleMultiplicity[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getFeatureDeclarationRule());
                    				}
                    				newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getMultiplicityParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_46);
                    this_Multiplicity_2=ruleMultiplicity(current);

                    state._fsp--;


                    				current = this_Multiplicity_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalAlf.g:2824:3: ( (lv_ownedElement_3_0= ruleSubsetOrRedefinition ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=44 && LA53_0<=45)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalAlf.g:2825:4: (lv_ownedElement_3_0= ruleSubsetOrRedefinition )
                    {
                    // InternalAlf.g:2825:4: (lv_ownedElement_3_0= ruleSubsetOrRedefinition )
                    // InternalAlf.g:2826:5: lv_ownedElement_3_0= ruleSubsetOrRedefinition
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
    // InternalAlf.g:2848:1: ruleFeatureCompletion[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) ) )? (otherlv_2= ';' | this_CategoryBody_3= ruleCategoryBody[$current] ) ) ;
    public final EObject ruleFeatureCompletion(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;

        EObject this_CategoryBody_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:2854:2: ( ( (otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) ) )? (otherlv_2= ';' | this_CategoryBody_3= ruleCategoryBody[$current] ) ) )
            // InternalAlf.g:2855:2: ( (otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) ) )? (otherlv_2= ';' | this_CategoryBody_3= ruleCategoryBody[$current] ) )
            {
            // InternalAlf.g:2855:2: ( (otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) ) )? (otherlv_2= ';' | this_CategoryBody_3= ruleCategoryBody[$current] ) )
            // InternalAlf.g:2856:3: (otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) ) )? (otherlv_2= ';' | this_CategoryBody_3= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:2856:3: (otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==35) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAlf.g:2857:4: otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) )
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_47); 

                    				newLeafNode(otherlv_0, grammarAccess.getFeatureCompletionAccess().getEqualsSignKeyword_0_0());
                    			
                    // InternalAlf.g:2861:4: ( (lv_value_1_0= ruleExpression ) )
                    // InternalAlf.g:2862:5: (lv_value_1_0= ruleExpression )
                    {
                    // InternalAlf.g:2862:5: (lv_value_1_0= ruleExpression )
                    // InternalAlf.g:2863:6: lv_value_1_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getFeatureCompletionAccess().getValueExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_48);
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

            // InternalAlf.g:2881:3: (otherlv_2= ';' | this_CategoryBody_3= ruleCategoryBody[$current] )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==19) ) {
                alt55=1;
            }
            else if ( (LA55_0==22) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalAlf.g:2882:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getFeatureCompletionAccess().getSemicolonKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalAlf.g:2887:4: this_CategoryBody_3= ruleCategoryBody[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getFeatureCompletionRule());
                    				}
                    				newCompositeNode(grammarAccess.getFeatureCompletionAccess().getCategoryBodyParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_CategoryBody_3=ruleCategoryBody(current);

                    state._fsp--;


                    				current = this_CategoryBody_3;
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
    // InternalAlf.g:2904:1: ruleTypePart[EObject in_current] returns [EObject current=in_current] : (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_3= 'any' ) ) ;
    public final EObject ruleTypePart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_isComposite_1_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAlf.g:2910:2: ( (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_3= 'any' ) ) )
            // InternalAlf.g:2911:2: (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_3= 'any' ) )
            {
            // InternalAlf.g:2911:2: (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_3= 'any' ) )
            // InternalAlf.g:2912:3: otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_3= 'any' )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_49); 

            			newLeafNode(otherlv_0, grammarAccess.getTypePartAccess().getColonKeyword_0());
            		
            // InternalAlf.g:2916:3: ( (lv_isComposite_1_0= 'compose' ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==37) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalAlf.g:2917:4: (lv_isComposite_1_0= 'compose' )
                    {
                    // InternalAlf.g:2917:4: (lv_isComposite_1_0= 'compose' )
                    // InternalAlf.g:2918:5: lv_isComposite_1_0= 'compose'
                    {
                    lv_isComposite_1_0=(Token)match(input,37,FOLLOW_50); 

                    					newLeafNode(lv_isComposite_1_0, grammarAccess.getTypePartAccess().getIsCompositeComposeKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypePartRule());
                    					}
                    					setWithLastConsumed(current, "isComposite", true, "compose");
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:2930:3: ( ( ( ruleQualifiedName ) ) | otherlv_3= 'any' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt57=1;
            }
            else if ( (LA57_0==38) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalAlf.g:2931:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalAlf.g:2931:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:2932:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:2932:5: ( ruleQualifiedName )
                    // InternalAlf.g:2933:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypePartRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTypePartAccess().getTypeClassCrossReference_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2948:4: otherlv_3= 'any'
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
    // InternalAlf.g:2958:1: ruleMultiplicity[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleMultiplicity(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_isOrdered_6_0=null;
        Token lv_isNonunique_7_0=null;
        EObject lv_lower_1_0 = null;

        EObject lv_upper_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2964:2: ( (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) ) ) )
            // InternalAlf.g:2965:2: (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) ) )
            {
            // InternalAlf.g:2965:2: (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) ) )
            // InternalAlf.g:2966:3: otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAlf.g:2970:3: ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_NATURAL_VALUE) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==40) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // InternalAlf.g:2971:4: ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..'
                    {
                    // InternalAlf.g:2971:4: ( (lv_lower_1_0= ruleNaturalLiteralExpression ) )
                    // InternalAlf.g:2972:5: (lv_lower_1_0= ruleNaturalLiteralExpression )
                    {
                    // InternalAlf.g:2972:5: (lv_lower_1_0= ruleNaturalLiteralExpression )
                    // InternalAlf.g:2973:6: lv_lower_1_0= ruleNaturalLiteralExpression
                    {

                    						newCompositeNode(grammarAccess.getMultiplicityAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_52);
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

                    otherlv_2=(Token)match(input,40,FOLLOW_51); 

                    				newLeafNode(otherlv_2, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalAlf.g:2995:3: ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:2996:4: (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:2996:4: (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:2997:5: lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression
            {

            					newCompositeNode(grammarAccess.getMultiplicityAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_53);
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

            otherlv_4=(Token)match(input,41,FOLLOW_54); 

            			newLeafNode(otherlv_4, grammarAccess.getMultiplicityAccess().getRightSquareBracketKeyword_3());
            		
            // InternalAlf.g:3018:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) )
            // InternalAlf.g:3019:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) )
            {
            // InternalAlf.g:3019:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) )
            // InternalAlf.g:3020:5: ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4());
            				
            // InternalAlf.g:3023:5: ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* )
            // InternalAlf.g:3024:6: ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )*
            {
            // InternalAlf.g:3024:6: ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )*
            loop59:
            do {
                int alt59=3;
                int LA59_0 = input.LA(1);

                if ( LA59_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4(), 0) ) {
                    alt59=1;
                }
                else if ( LA59_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4(), 1) ) {
                    alt59=2;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalAlf.g:3025:4: ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) )
            	    {
            	    // InternalAlf.g:3025:4: ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) )
            	    // InternalAlf.g:3026:5: {...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMultiplicity", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalAlf.g:3026:109: ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) )
            	    // InternalAlf.g:3027:6: ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalAlf.g:3030:9: ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) )
            	    // InternalAlf.g:3030:10: {...}? => ( (lv_isOrdered_6_0= 'ordered' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiplicity", "true");
            	    }
            	    // InternalAlf.g:3030:19: ( (lv_isOrdered_6_0= 'ordered' ) )
            	    // InternalAlf.g:3030:20: (lv_isOrdered_6_0= 'ordered' )
            	    {
            	    // InternalAlf.g:3030:20: (lv_isOrdered_6_0= 'ordered' )
            	    // InternalAlf.g:3031:10: lv_isOrdered_6_0= 'ordered'
            	    {
            	    lv_isOrdered_6_0=(Token)match(input,42,FOLLOW_54); 

            	    										newLeafNode(lv_isOrdered_6_0, grammarAccess.getMultiplicityAccess().getIsOrderedOrderedKeyword_4_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMultiplicityRule());
            	    										}
            	    										setWithLastConsumed(current, "isOrdered", true, "ordered");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:3048:4: ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) )
            	    {
            	    // InternalAlf.g:3048:4: ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) )
            	    // InternalAlf.g:3049:5: {...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMultiplicity", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalAlf.g:3049:109: ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) )
            	    // InternalAlf.g:3050:6: ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalAlf.g:3053:9: ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) )
            	    // InternalAlf.g:3053:10: {...}? => ( (lv_isNonunique_7_0= 'nonunique' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiplicity", "true");
            	    }
            	    // InternalAlf.g:3053:19: ( (lv_isNonunique_7_0= 'nonunique' ) )
            	    // InternalAlf.g:3053:20: (lv_isNonunique_7_0= 'nonunique' )
            	    {
            	    // InternalAlf.g:3053:20: (lv_isNonunique_7_0= 'nonunique' )
            	    // InternalAlf.g:3054:10: lv_isNonunique_7_0= 'nonunique'
            	    {
            	    lv_isNonunique_7_0=(Token)match(input,43,FOLLOW_54); 

            	    										newLeafNode(lv_isNonunique_7_0, grammarAccess.getMultiplicityAccess().getIsNonuniqueNonuniqueKeyword_4_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMultiplicityRule());
            	    										}
            	    										setWithLastConsumed(current, "isNonunique", true, "nonunique");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4());
            				

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
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleSubsetOrRedefinition"
    // InternalAlf.g:3082:1: entryRuleSubsetOrRedefinition returns [EObject current=null] : iv_ruleSubsetOrRedefinition= ruleSubsetOrRedefinition EOF ;
    public final EObject entryRuleSubsetOrRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsetOrRedefinition = null;


        try {
            // InternalAlf.g:3082:61: (iv_ruleSubsetOrRedefinition= ruleSubsetOrRedefinition EOF )
            // InternalAlf.g:3083:2: iv_ruleSubsetOrRedefinition= ruleSubsetOrRedefinition EOF
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
    // InternalAlf.g:3089:1: ruleSubsetOrRedefinition returns [EObject current=null] : ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition ) ) ;
    public final EObject ruleSubsetOrRedefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Subset_1 = null;

        EObject this_Redefinition_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:3095:2: ( ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition ) ) )
            // InternalAlf.g:3096:2: ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition ) )
            {
            // InternalAlf.g:3096:2: ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==44) ) {
                alt60=1;
            }
            else if ( (LA60_0==45) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalAlf.g:3097:3: (otherlv_0= 'subsets' this_Subset_1= ruleSubset )
                    {
                    // InternalAlf.g:3097:3: (otherlv_0= 'subsets' this_Subset_1= ruleSubset )
                    // InternalAlf.g:3098:4: otherlv_0= 'subsets' this_Subset_1= ruleSubset
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_11); 

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
                    // InternalAlf.g:3112:3: (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition )
                    {
                    // InternalAlf.g:3112:3: (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition )
                    // InternalAlf.g:3113:4: otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_11); 

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
    // InternalAlf.g:3130:1: entryRuleRedefinition returns [EObject current=null] : iv_ruleRedefinition= ruleRedefinition EOF ;
    public final EObject entryRuleRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefinition = null;


        try {
            // InternalAlf.g:3130:53: (iv_ruleRedefinition= ruleRedefinition EOF )
            // InternalAlf.g:3131:2: iv_ruleRedefinition= ruleRedefinition EOF
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
    // InternalAlf.g:3137:1: ruleRedefinition returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleRedefinition() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:3143:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:3144:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:3144:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3145:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:3145:3: ( ruleQualifiedName )
            // InternalAlf.g:3146:4: ruleQualifiedName
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
    // InternalAlf.g:3163:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalAlf.g:3163:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalAlf.g:3164:2: iv_ruleSubset= ruleSubset EOF
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
    // InternalAlf.g:3170:1: ruleSubset returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubset() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:3176:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:3177:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:3177:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3178:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:3178:3: ( ruleQualifiedName )
            // InternalAlf.g:3179:4: ruleQualifiedName
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
    // InternalAlf.g:3196:1: entryRuleConnectorDefinition returns [EObject current=null] : iv_ruleConnectorDefinition= ruleConnectorDefinition EOF ;
    public final EObject entryRuleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorDefinition = null;


        try {
            // InternalAlf.g:3196:60: (iv_ruleConnectorDefinition= ruleConnectorDefinition EOF )
            // InternalAlf.g:3197:2: iv_ruleConnectorDefinition= ruleConnectorDefinition EOF
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
    // InternalAlf.g:3203:1: ruleConnectorDefinition returns [EObject current=null] : ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) otherlv_7= ';' ) | ( ( (lv_name_8_0= ruleName ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) )? otherlv_11= '(' ( (lv_connectorEnd_12_0= ruleConnectorEnd ) ) otherlv_13= ',' ( (lv_connectorEnd_14_0= ruleConnectorEnd ) ) (otherlv_15= ',' ( (lv_connectorEnd_16_0= ruleConnectorEnd ) ) )* otherlv_17= ')' otherlv_18= ';' ) ) ;
    public final EObject ruleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_connectorEnd_4_0 = null;

        EObject lv_connectorEnd_6_0 = null;

        AntlrDatatypeRuleToken lv_name_8_0 = null;

        EObject lv_connectorEnd_12_0 = null;

        EObject lv_connectorEnd_14_0 = null;

        EObject lv_connectorEnd_16_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3209:2: ( ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) otherlv_7= ';' ) | ( ( (lv_name_8_0= ruleName ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) )? otherlv_11= '(' ( (lv_connectorEnd_12_0= ruleConnectorEnd ) ) otherlv_13= ',' ( (lv_connectorEnd_14_0= ruleConnectorEnd ) ) (otherlv_15= ',' ( (lv_connectorEnd_16_0= ruleConnectorEnd ) ) )* otherlv_17= ')' otherlv_18= ';' ) ) )
            // InternalAlf.g:3210:2: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) otherlv_7= ';' ) | ( ( (lv_name_8_0= ruleName ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) )? otherlv_11= '(' ( (lv_connectorEnd_12_0= ruleConnectorEnd ) ) otherlv_13= ',' ( (lv_connectorEnd_14_0= ruleConnectorEnd ) ) (otherlv_15= ',' ( (lv_connectorEnd_16_0= ruleConnectorEnd ) ) )* otherlv_17= ')' otherlv_18= ';' ) )
            {
            // InternalAlf.g:3210:2: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) otherlv_7= ';' ) | ( ( (lv_name_8_0= ruleName ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) )? otherlv_11= '(' ( (lv_connectorEnd_12_0= ruleConnectorEnd ) ) otherlv_13= ',' ( (lv_connectorEnd_14_0= ruleConnectorEnd ) ) (otherlv_15= ',' ( (lv_connectorEnd_16_0= ruleConnectorEnd ) ) )* otherlv_17= ')' otherlv_18= ';' ) )
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // InternalAlf.g:3211:3: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) otherlv_7= ';' )
                    {
                    // InternalAlf.g:3211:3: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) otherlv_7= ';' )
                    // InternalAlf.g:3212:4: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) otherlv_7= ';'
                    {
                    // InternalAlf.g:3212:4: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )?
                    int alt63=2;
                    alt63 = dfa63.predict(input);
                    switch (alt63) {
                        case 1 :
                            // InternalAlf.g:3213:5: ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is'
                            {
                            // InternalAlf.g:3213:5: ( (lv_name_0_0= ruleName ) )?
                            int alt61=2;
                            int LA61_0 = input.LA(1);

                            if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt61=1;
                            }
                            switch (alt61) {
                                case 1 :
                                    // InternalAlf.g:3214:6: (lv_name_0_0= ruleName )
                                    {
                                    // InternalAlf.g:3214:6: (lv_name_0_0= ruleName )
                                    // InternalAlf.g:3215:7: lv_name_0_0= ruleName
                                    {

                                    							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_0_0_0_0());
                                    						
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

                            // InternalAlf.g:3232:5: (otherlv_1= ':' ( ( ruleQualifiedName ) ) )?
                            int alt62=2;
                            int LA62_0 = input.LA(1);

                            if ( (LA62_0==36) ) {
                                alt62=1;
                            }
                            switch (alt62) {
                                case 1 :
                                    // InternalAlf.g:3233:6: otherlv_1= ':' ( ( ruleQualifiedName ) )
                                    {
                                    otherlv_1=(Token)match(input,36,FOLLOW_11); 

                                    						newLeafNode(otherlv_1, grammarAccess.getConnectorDefinitionAccess().getColonKeyword_0_0_1_0());
                                    					
                                    // InternalAlf.g:3237:6: ( ( ruleQualifiedName ) )
                                    // InternalAlf.g:3238:7: ( ruleQualifiedName )
                                    {
                                    // InternalAlf.g:3238:7: ( ruleQualifiedName )
                                    // InternalAlf.g:3239:8: ruleQualifiedName
                                    {

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getConnectorDefinitionRule());
                                    								}
                                    							

                                    								newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getAssociationAssociationCrossReference_0_0_1_1_0());
                                    							
                                    pushFollow(FOLLOW_23);
                                    ruleQualifiedName();

                                    state._fsp--;


                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }


                                    }
                                    break;

                            }

                            otherlv_3=(Token)match(input,24,FOLLOW_56); 

                            					newLeafNode(otherlv_3, grammarAccess.getConnectorDefinitionAccess().getIsKeyword_0_0_2());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:3259:4: ( (lv_connectorEnd_4_0= ruleConnectorEnd ) )
                    // InternalAlf.g:3260:5: (lv_connectorEnd_4_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:3260:5: (lv_connectorEnd_4_0= ruleConnectorEnd )
                    // InternalAlf.g:3261:6: lv_connectorEnd_4_0= ruleConnectorEnd
                    {

                    						newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_57);
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

                    otherlv_5=(Token)match(input,46,FOLLOW_56); 

                    				newLeafNode(otherlv_5, grammarAccess.getConnectorDefinitionAccess().getToKeyword_0_2());
                    			
                    // InternalAlf.g:3282:4: ( (lv_connectorEnd_6_0= ruleConnectorEnd ) )
                    // InternalAlf.g:3283:5: (lv_connectorEnd_6_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:3283:5: (lv_connectorEnd_6_0= ruleConnectorEnd )
                    // InternalAlf.g:3284:6: lv_connectorEnd_6_0= ruleConnectorEnd
                    {

                    						newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    otherlv_7=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getConnectorDefinitionAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:3307:3: ( ( (lv_name_8_0= ruleName ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) )? otherlv_11= '(' ( (lv_connectorEnd_12_0= ruleConnectorEnd ) ) otherlv_13= ',' ( (lv_connectorEnd_14_0= ruleConnectorEnd ) ) (otherlv_15= ',' ( (lv_connectorEnd_16_0= ruleConnectorEnd ) ) )* otherlv_17= ')' otherlv_18= ';' )
                    {
                    // InternalAlf.g:3307:3: ( ( (lv_name_8_0= ruleName ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) )? otherlv_11= '(' ( (lv_connectorEnd_12_0= ruleConnectorEnd ) ) otherlv_13= ',' ( (lv_connectorEnd_14_0= ruleConnectorEnd ) ) (otherlv_15= ',' ( (lv_connectorEnd_16_0= ruleConnectorEnd ) ) )* otherlv_17= ')' otherlv_18= ';' )
                    // InternalAlf.g:3308:4: ( (lv_name_8_0= ruleName ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) )? otherlv_11= '(' ( (lv_connectorEnd_12_0= ruleConnectorEnd ) ) otherlv_13= ',' ( (lv_connectorEnd_14_0= ruleConnectorEnd ) ) (otherlv_15= ',' ( (lv_connectorEnd_16_0= ruleConnectorEnd ) ) )* otherlv_17= ')' otherlv_18= ';'
                    {
                    // InternalAlf.g:3308:4: ( (lv_name_8_0= ruleName ) )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( ((LA64_0>=RULE_ID && LA64_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalAlf.g:3309:5: (lv_name_8_0= ruleName )
                            {
                            // InternalAlf.g:3309:5: (lv_name_8_0= ruleName )
                            // InternalAlf.g:3310:6: lv_name_8_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_1_0_0());
                            					
                            pushFollow(FOLLOW_58);
                            lv_name_8_0=ruleName();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getConnectorDefinitionRule());
                            						}
                            						set(
                            							current,
                            							"name",
                            							lv_name_8_0,
                            							"org.omg.sysml.Alf.Name");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:3327:4: (otherlv_9= ':' ( ( ruleQualifiedName ) ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==36) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalAlf.g:3328:5: otherlv_9= ':' ( ( ruleQualifiedName ) )
                            {
                            otherlv_9=(Token)match(input,36,FOLLOW_11); 

                            					newLeafNode(otherlv_9, grammarAccess.getConnectorDefinitionAccess().getColonKeyword_1_1_0());
                            				
                            // InternalAlf.g:3332:5: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:3333:6: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:3333:6: ( ruleQualifiedName )
                            // InternalAlf.g:3334:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConnectorDefinitionRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getAssociationAssociationCrossReference_1_1_1_0());
                            						
                            pushFollow(FOLLOW_59);
                            ruleQualifiedName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,47,FOLLOW_56); 

                    				newLeafNode(otherlv_11, grammarAccess.getConnectorDefinitionAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalAlf.g:3353:4: ( (lv_connectorEnd_12_0= ruleConnectorEnd ) )
                    // InternalAlf.g:3354:5: (lv_connectorEnd_12_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:3354:5: (lv_connectorEnd_12_0= ruleConnectorEnd )
                    // InternalAlf.g:3355:6: lv_connectorEnd_12_0= ruleConnectorEnd
                    {

                    						newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_connectorEnd_12_0=ruleConnectorEnd();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectorDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"connectorEnd",
                    							lv_connectorEnd_12_0,
                    							"org.omg.sysml.Alf.ConnectorEnd");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,33,FOLLOW_56); 

                    				newLeafNode(otherlv_13, grammarAccess.getConnectorDefinitionAccess().getCommaKeyword_1_4());
                    			
                    // InternalAlf.g:3376:4: ( (lv_connectorEnd_14_0= ruleConnectorEnd ) )
                    // InternalAlf.g:3377:5: (lv_connectorEnd_14_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:3377:5: (lv_connectorEnd_14_0= ruleConnectorEnd )
                    // InternalAlf.g:3378:6: lv_connectorEnd_14_0= ruleConnectorEnd
                    {

                    						newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_connectorEnd_14_0=ruleConnectorEnd();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectorDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"connectorEnd",
                    							lv_connectorEnd_14_0,
                    							"org.omg.sysml.Alf.ConnectorEnd");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:3395:4: (otherlv_15= ',' ( (lv_connectorEnd_16_0= ruleConnectorEnd ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==33) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalAlf.g:3396:5: otherlv_15= ',' ( (lv_connectorEnd_16_0= ruleConnectorEnd ) )
                    	    {
                    	    otherlv_15=(Token)match(input,33,FOLLOW_56); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getConnectorDefinitionAccess().getCommaKeyword_1_6_0());
                    	    				
                    	    // InternalAlf.g:3400:5: ( (lv_connectorEnd_16_0= ruleConnectorEnd ) )
                    	    // InternalAlf.g:3401:6: (lv_connectorEnd_16_0= ruleConnectorEnd )
                    	    {
                    	    // InternalAlf.g:3401:6: (lv_connectorEnd_16_0= ruleConnectorEnd )
                    	    // InternalAlf.g:3402:7: lv_connectorEnd_16_0= ruleConnectorEnd
                    	    {

                    	    							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_1_6_1_0());
                    	    						
                    	    pushFollow(FOLLOW_61);
                    	    lv_connectorEnd_16_0=ruleConnectorEnd();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConnectorDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"connectorEnd",
                    	    								lv_connectorEnd_16_0,
                    	    								"org.omg.sysml.Alf.ConnectorEnd");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,48,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getConnectorDefinitionAccess().getRightParenthesisKeyword_1_7());
                    			
                    otherlv_18=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getConnectorDefinitionAccess().getSemicolonKeyword_1_8());
                    			

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
    // $ANTLR end "ruleConnectorDefinition"


    // $ANTLR start "entryRuleConnectorEnd"
    // InternalAlf.g:3433:1: entryRuleConnectorEnd returns [EObject current=null] : iv_ruleConnectorEnd= ruleConnectorEnd EOF ;
    public final EObject entryRuleConnectorEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorEnd = null;


        try {
            // InternalAlf.g:3433:53: (iv_ruleConnectorEnd= ruleConnectorEnd EOF )
            // InternalAlf.g:3434:2: iv_ruleConnectorEnd= ruleConnectorEnd EOF
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
    // InternalAlf.g:3440:1: ruleConnectorEnd returns [EObject current=null] : ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_3= ruleConnectorEndMultiplicity[$current] )? ) | ( ( ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleConnectorEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject this_ConnectorEndMultiplicity_3 = null;

        EObject this_ConnectorEndMultiplicity_5 = null;



        	enterRule();

        try {
            // InternalAlf.g:3446:2: ( ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_3= ruleConnectorEndMultiplicity[$current] )? ) | ( ( ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) ) )
            // InternalAlf.g:3447:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_3= ruleConnectorEndMultiplicity[$current] )? ) | ( ( ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )
            {
            // InternalAlf.g:3447:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_3= ruleConnectorEndMultiplicity[$current] )? ) | ( ( ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // InternalAlf.g:3448:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_3= ruleConnectorEndMultiplicity[$current] )? )
                    {
                    // InternalAlf.g:3448:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_3= ruleConnectorEndMultiplicity[$current] )? )
                    // InternalAlf.g:3449:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_3= ruleConnectorEndMultiplicity[$current] )?
                    {
                    // InternalAlf.g:3449:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )?
                    int alt68=2;
                    alt68 = dfa68.predict(input);
                    switch (alt68) {
                        case 1 :
                            // InternalAlf.g:3450:5: ( ( ruleQualifiedName ) ) otherlv_1= ':'
                            {
                            // InternalAlf.g:3450:5: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:3451:6: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:3451:6: ( ruleQualifiedName )
                            // InternalAlf.g:3452:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConnectorEndRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getConnectorEndAccess().getEndFeatureCrossReference_0_0_0_0());
                            						
                            pushFollow(FOLLOW_62);
                            ruleQualifiedName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_1=(Token)match(input,36,FOLLOW_11); 

                            					newLeafNode(otherlv_1, grammarAccess.getConnectorEndAccess().getColonKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:3471:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:3472:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:3472:5: ( ruleQualifiedName )
                    // InternalAlf.g:3473:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectorEndRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConnectorEndAccess().getFeatureFeatureCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_63);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:3487:4: (this_ConnectorEndMultiplicity_3= ruleConnectorEndMultiplicity[$current] )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==39) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalAlf.g:3488:5: this_ConnectorEndMultiplicity_3= ruleConnectorEndMultiplicity[$current]
                            {

                            					if (current==null) {
                            						current = createModelElement(grammarAccess.getConnectorEndRule());
                            					}
                            					newCompositeNode(grammarAccess.getConnectorEndAccess().getConnectorEndMultiplicityParserRuleCall_0_2());
                            				
                            pushFollow(FOLLOW_2);
                            this_ConnectorEndMultiplicity_3=ruleConnectorEndMultiplicity(current);

                            state._fsp--;


                            					current = this_ConnectorEndMultiplicity_3;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:3502:3: ( ( ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalAlf.g:3502:3: ( ( ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) )
                    // InternalAlf.g:3503:4: ( ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) )
                    {
                    // InternalAlf.g:3503:4: ( ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )? otherlv_6= '=>' )
                    // InternalAlf.g:3504:5: ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )? otherlv_6= '=>'
                    {
                    // InternalAlf.g:3504:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:3505:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:3505:6: ( ruleQualifiedName )
                    // InternalAlf.g:3506:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConnectorEndRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getConnectorEndAccess().getEndFeatureCrossReference_1_0_0_0());
                    						
                    pushFollow(FOLLOW_64);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:3520:5: (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==39) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalAlf.g:3521:6: this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current]
                            {

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getConnectorEndRule());
                            						}
                            						newCompositeNode(grammarAccess.getConnectorEndAccess().getConnectorEndMultiplicityParserRuleCall_1_0_1());
                            					
                            pushFollow(FOLLOW_65);
                            this_ConnectorEndMultiplicity_5=ruleConnectorEndMultiplicity(current);

                            state._fsp--;


                            						current = this_ConnectorEndMultiplicity_5;
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,49,FOLLOW_11); 

                    					newLeafNode(otherlv_6, grammarAccess.getConnectorEndAccess().getEqualsSignGreaterThanSignKeyword_1_0_2());
                    				

                    }

                    // InternalAlf.g:3538:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:3539:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:3539:5: ( ruleQualifiedName )
                    // InternalAlf.g:3540:6: ruleQualifiedName
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


    // $ANTLR start "ruleConnectorEndMultiplicity"
    // InternalAlf.g:3560:1: ruleConnectorEndMultiplicity[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ) ;
    public final EObject ruleConnectorEndMultiplicity(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lower_1_0 = null;

        EObject lv_upper_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3566:2: ( (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ) )
            // InternalAlf.g:3567:2: (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' )
            {
            // InternalAlf.g:3567:2: (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' )
            // InternalAlf.g:3568:3: otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectorEndMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAlf.g:3572:3: ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )?
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
                    // InternalAlf.g:3573:4: ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..'
                    {
                    // InternalAlf.g:3573:4: ( (lv_lower_1_0= ruleNaturalLiteralExpression ) )
                    // InternalAlf.g:3574:5: (lv_lower_1_0= ruleNaturalLiteralExpression )
                    {
                    // InternalAlf.g:3574:5: (lv_lower_1_0= ruleNaturalLiteralExpression )
                    // InternalAlf.g:3575:6: lv_lower_1_0= ruleNaturalLiteralExpression
                    {

                    						newCompositeNode(grammarAccess.getConnectorEndMultiplicityAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_lower_1_0=ruleNaturalLiteralExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectorEndMultiplicityRule());
                    						}
                    						set(
                    							current,
                    							"lower",
                    							lv_lower_1_0,
                    							"org.omg.sysml.Alf.NaturalLiteralExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,40,FOLLOW_51); 

                    				newLeafNode(otherlv_2, grammarAccess.getConnectorEndMultiplicityAccess().getFullStopFullStopKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalAlf.g:3597:3: ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:3598:4: (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:3598:4: (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:3599:5: lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression
            {

            					newCompositeNode(grammarAccess.getConnectorEndMultiplicityAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_53);
            lv_upper_3_0=ruleUnlimitedNaturalLiteralExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectorEndMultiplicityRule());
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

            			newLeafNode(otherlv_4, grammarAccess.getConnectorEndMultiplicityAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectorEndMultiplicity"


    // $ANTLR start "entryRuleExpression"
    // InternalAlf.g:3624:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAlf.g:3624:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAlf.g:3625:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAlf.g:3631:1: ruleExpression returns [EObject current=null] : this_BinaryExpression_0= ruleBinaryExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3637:2: (this_BinaryExpression_0= ruleBinaryExpression )
            // InternalAlf.g:3638:2: this_BinaryExpression_0= ruleBinaryExpression
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
    // InternalAlf.g:3649:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalAlf.g:3649:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalAlf.g:3650:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalAlf.g:3656:1: ruleBinaryExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) ;
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
            // InternalAlf.g:3662:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) )
            // InternalAlf.g:3663:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            {
            // InternalAlf.g:3663:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            // InternalAlf.g:3664:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            {

            			newCompositeNode(grammarAccess.getBinaryExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_66);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3672:3: ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==18||(LA74_0>=50 && LA74_0<=54)) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalAlf.g:3673:4: () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    {
                    // InternalAlf.g:3673:4: ()
                    // InternalAlf.g:3674:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:3680:4: ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==18||(LA73_0>=51 && LA73_0<=54)) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==50) ) {
                        alt73=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalAlf.g:3681:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            {
                            // InternalAlf.g:3681:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            // InternalAlf.g:3682:6: ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) )
                            {
                            // InternalAlf.g:3682:6: ( (lv_operator_2_0= ruleBinaryOperator ) )
                            // InternalAlf.g:3683:7: (lv_operator_2_0= ruleBinaryOperator )
                            {
                            // InternalAlf.g:3683:7: (lv_operator_2_0= ruleBinaryOperator )
                            // InternalAlf.g:3684:8: lv_operator_2_0= ruleBinaryOperator
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorParserRuleCall_1_1_0_0_0());
                            							
                            pushFollow(FOLLOW_47);
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

                            // InternalAlf.g:3701:6: ( (lv_operand_3_0= ruleExpression ) )
                            // InternalAlf.g:3702:7: (lv_operand_3_0= ruleExpression )
                            {
                            // InternalAlf.g:3702:7: (lv_operand_3_0= ruleExpression )
                            // InternalAlf.g:3703:8: lv_operand_3_0= ruleExpression
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
                            // InternalAlf.g:3722:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            {
                            // InternalAlf.g:3722:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            // InternalAlf.g:3723:6: ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']'
                            {
                            // InternalAlf.g:3723:6: ( (lv_operator_4_0= '@' ) )
                            // InternalAlf.g:3724:7: (lv_operator_4_0= '@' )
                            {
                            // InternalAlf.g:3724:7: (lv_operator_4_0= '@' )
                            // InternalAlf.g:3725:8: lv_operator_4_0= '@'
                            {
                            lv_operator_4_0=(Token)match(input,50,FOLLOW_67); 

                            								newLeafNode(lv_operator_4_0, grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getBinaryExpressionRule());
                            								}
                            								setWithLastConsumed(current, "operator", lv_operator_4_0, "@");
                            							

                            }


                            }

                            otherlv_5=(Token)match(input,39,FOLLOW_47); 

                            						newLeafNode(otherlv_5, grammarAccess.getBinaryExpressionAccess().getLeftSquareBracketKeyword_1_1_1_1());
                            					
                            // InternalAlf.g:3741:6: ( (lv_operand_6_0= ruleExpression ) )
                            // InternalAlf.g:3742:7: (lv_operand_6_0= ruleExpression )
                            {
                            // InternalAlf.g:3742:7: (lv_operand_6_0= ruleExpression )
                            // InternalAlf.g:3743:8: lv_operand_6_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperandExpressionParserRuleCall_1_1_1_2_0());
                            							
                            pushFollow(FOLLOW_53);
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
    // InternalAlf.g:3771:1: entryRuleBinaryOperator returns [String current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final String entryRuleBinaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperator = null;


        try {
            // InternalAlf.g:3771:54: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // InternalAlf.g:3772:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
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
    // InternalAlf.g:3778:1: ruleBinaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:3784:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) )
            // InternalAlf.g:3785:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            {
            // InternalAlf.g:3785:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            int alt75=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt75=1;
                }
                break;
            case 52:
                {
                alt75=2;
                }
                break;
            case 18:
                {
                alt75=3;
                }
                break;
            case 53:
                {
                alt75=4;
                }
                break;
            case 54:
                {
                alt75=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalAlf.g:3786:3: kw= '+'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3792:3: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:3798:3: kw= '*'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:3804:3: kw= '/'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:3810:3: kw= '^'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

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
    // InternalAlf.g:3819:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlf.g:3819:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlf.g:3820:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalAlf.g:3826:1: ruleUnaryExpression returns [EObject current=null] : (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceAccessExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3832:2: ( (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) )
            // InternalAlf.g:3833:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            {
            // InternalAlf.g:3833:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=RULE_BOOLEAN_VALUE && LA76_0<=RULE_UNRESTRICTED_NAME)||(LA76_0>=17 && LA76_0<=18)||LA76_0==22||LA76_0==47||LA76_0==55) ) {
                alt76=1;
            }
            else if ( ((LA76_0>=51 && LA76_0<=52)) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalAlf.g:3834:3: this_SequenceAccessExpression_0= ruleSequenceAccessExpression
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
                    // InternalAlf.g:3843:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    {
                    // InternalAlf.g:3843:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    // InternalAlf.g:3844:4: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    {
                    // InternalAlf.g:3844:4: ()
                    // InternalAlf.g:3845:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:3851:4: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // InternalAlf.g:3852:5: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // InternalAlf.g:3852:5: (lv_operator_2_0= ruleUnaryOperator )
                    // InternalAlf.g:3853:6: lv_operator_2_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_68);
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

                    // InternalAlf.g:3870:4: ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    // InternalAlf.g:3871:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    {
                    // InternalAlf.g:3871:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    // InternalAlf.g:3872:6: lv_operand_3_0= ruleSequenceAccessExpression
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
    // InternalAlf.g:3894:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalAlf.g:3894:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalAlf.g:3895:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalAlf.g:3901:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:3907:2: ( (kw= '+' | kw= '-' ) )
            // InternalAlf.g:3908:2: (kw= '+' | kw= '-' )
            {
            // InternalAlf.g:3908:2: (kw= '+' | kw= '-' )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==51) ) {
                alt77=1;
            }
            else if ( (LA77_0==52) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalAlf.g:3909:3: kw= '+'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3915:3: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

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
    // InternalAlf.g:3924:1: entryRuleSequenceAccessExpression returns [EObject current=null] : iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF ;
    public final EObject entryRuleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceAccessExpression = null;


        try {
            // InternalAlf.g:3924:65: (iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF )
            // InternalAlf.g:3925:2: iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF
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
    // InternalAlf.g:3931:1: ruleSequenceAccessExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) ;
    public final EObject ruleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_index_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3937:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) )
            // InternalAlf.g:3938:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            {
            // InternalAlf.g:3938:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            // InternalAlf.g:3939:3: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            {

            			newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_63);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3947:3: ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==39) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalAlf.g:3948:4: () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    // InternalAlf.g:3948:4: ()
            	    // InternalAlf.g:3949:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSequenceAccessExpressionAccess().getSequenceAccessExpressionPrimaryAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_47); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSequenceAccessExpressionAccess().getLeftSquareBracketKeyword_1_1());
            	    			
            	    // InternalAlf.g:3959:4: ( (lv_index_3_0= ruleExpression ) )
            	    // InternalAlf.g:3960:5: (lv_index_3_0= ruleExpression )
            	    {
            	    // InternalAlf.g:3960:5: (lv_index_3_0= ruleExpression )
            	    // InternalAlf.g:3961:6: lv_index_3_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getIndexExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_53);
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

            	    otherlv_4=(Token)match(input,41,FOLLOW_63); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSequenceAccessExpressionAccess().getRightSquareBracketKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop78;
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
    // InternalAlf.g:3987:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalAlf.g:3987:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalAlf.g:3988:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalAlf.g:3994:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
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
            // InternalAlf.g:4000:2: ( (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // InternalAlf.g:4001:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // InternalAlf.g:4001:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt79=5;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // InternalAlf.g:4002:3: this_LiteralExpression_0= ruleLiteralExpression
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
                    // InternalAlf.g:4011:3: this_ElementReferenceExpression_1= ruleElementReferenceExpression
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
                    // InternalAlf.g:4020:3: this_InstanceCreationExpression_2= ruleInstanceCreationExpression
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
                    // InternalAlf.g:4029:3: this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression
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
                    // InternalAlf.g:4038:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // InternalAlf.g:4038:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // InternalAlf.g:4039:4: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_47); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_69);
                    this_Expression_5=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_5;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_6=(Token)match(input,48,FOLLOW_2); 

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
    // InternalAlf.g:4060:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // InternalAlf.g:4060:67: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // InternalAlf.g:4061:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
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
    // InternalAlf.g:4067:1: ruleElementReferenceExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleElementReferenceExpression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:4073:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:4074:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:4074:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4075:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:4075:3: ( ruleQualifiedName )
            // InternalAlf.g:4076:4: ruleQualifiedName
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
    // InternalAlf.g:4093:1: entryRuleInstanceCreationExpression returns [EObject current=null] : iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF ;
    public final EObject entryRuleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceCreationExpression = null;


        try {
            // InternalAlf.g:4093:67: (iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF )
            // InternalAlf.g:4094:2: iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF
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
    // InternalAlf.g:4100:1: ruleInstanceCreationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' ) ;
    public final EObject ruleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Tuple_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4106:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' ) )
            // InternalAlf.g:4107:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' )
            {
            // InternalAlf.g:4107:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' )
            // InternalAlf.g:4108:3: ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')'
            {
            // InternalAlf.g:4108:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4109:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:4109:4: ( ruleQualifiedName )
            // InternalAlf.g:4110:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceCreationExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getClassClassCrossReference_0_0());
            				
            pushFollow(FOLLOW_59);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,47,FOLLOW_70); 

            			newLeafNode(otherlv_1, grammarAccess.getInstanceCreationExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlf.g:4128:3: (this_Tuple_2= ruleTuple[$current] )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=RULE_BOOLEAN_VALUE && LA80_0<=RULE_UNRESTRICTED_NAME)||(LA80_0>=17 && LA80_0<=18)||LA80_0==22||LA80_0==47||(LA80_0>=51 && LA80_0<=52)||LA80_0==55) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalAlf.g:4129:4: this_Tuple_2= ruleTuple[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getInstanceCreationExpressionRule());
                    				}
                    				newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getTupleParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_69);
                    this_Tuple_2=ruleTuple(current);

                    state._fsp--;


                    				current = this_Tuple_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,48,FOLLOW_2); 

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
    // InternalAlf.g:4150:1: ruleTuple[EObject in_current] returns [EObject current=in_current] : (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] ) ;
    public final EObject ruleTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_PositionalTuple_0 = null;

        EObject this_NamedTuple_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:4156:2: ( (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] ) )
            // InternalAlf.g:4157:2: (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] )
            {
            // InternalAlf.g:4157:2: (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] )
            int alt81=2;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN_VALUE:
            case RULE_STRING_VALUE:
            case RULE_NATURAL_VALUE:
            case 17:
            case 18:
            case 22:
            case 47:
            case 51:
            case 52:
            case 55:
                {
                alt81=1;
                }
                break;
            case RULE_ID:
                {
                int LA81_2 = input.LA(2);

                if ( ((LA81_2>=16 && LA81_2<=18)||LA81_2==33||LA81_2==39||(LA81_2>=47 && LA81_2<=48)||(LA81_2>=50 && LA81_2<=54)) ) {
                    alt81=1;
                }
                else if ( (LA81_2==49) ) {
                    alt81=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA81_3 = input.LA(2);

                if ( ((LA81_3>=16 && LA81_3<=18)||LA81_3==33||LA81_3==39||(LA81_3>=47 && LA81_3<=48)||(LA81_3>=50 && LA81_3<=54)) ) {
                    alt81=1;
                }
                else if ( (LA81_3==49) ) {
                    alt81=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalAlf.g:4158:3: this_PositionalTuple_0= rulePositionalTuple[$current]
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
                    // InternalAlf.g:4170:3: this_NamedTuple_1= ruleNamedTuple[$current]
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
    // InternalAlf.g:4186:1: rulePositionalTuple[EObject in_current] returns [EObject current=in_current] : ( ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )* ) ;
    public final EObject rulePositionalTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_argument_0_0 = null;

        EObject lv_argument_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4192:2: ( ( ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )* ) )
            // InternalAlf.g:4193:2: ( ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )* )
            {
            // InternalAlf.g:4193:2: ( ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )* )
            // InternalAlf.g:4194:3: ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )*
            {
            // InternalAlf.g:4194:3: ( (lv_argument_0_0= ruleExpression ) )
            // InternalAlf.g:4195:4: (lv_argument_0_0= ruleExpression )
            {
            // InternalAlf.g:4195:4: (lv_argument_0_0= ruleExpression )
            // InternalAlf.g:4196:5: lv_argument_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPositionalTupleAccess().getArgumentExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalAlf.g:4213:3: (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==33) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalAlf.g:4214:4: otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_47); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPositionalTupleAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalAlf.g:4218:4: ( (lv_argument_2_0= ruleExpression ) )
            	    // InternalAlf.g:4219:5: (lv_argument_2_0= ruleExpression )
            	    {
            	    // InternalAlf.g:4219:5: (lv_argument_2_0= ruleExpression )
            	    // InternalAlf.g:4220:6: lv_argument_2_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getPositionalTupleAccess().getArgumentExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
    // $ANTLR end "rulePositionalTuple"


    // $ANTLR start "ruleNamedTuple"
    // InternalAlf.g:4243:1: ruleNamedTuple[EObject in_current] returns [EObject current=in_current] : ( ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )* ) ;
    public final EObject ruleNamedTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_argument_2_0 = null;

        EObject lv_argument_6_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4249:2: ( ( ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )* ) )
            // InternalAlf.g:4250:2: ( ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )* )
            {
            // InternalAlf.g:4250:2: ( ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )* )
            // InternalAlf.g:4251:3: ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getNamedTupleAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_65);
            ruleName();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,49,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedTupleAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalAlf.g:4262:3: ( (lv_argument_2_0= ruleExpression ) )
            // InternalAlf.g:4263:4: (lv_argument_2_0= ruleExpression )
            {
            // InternalAlf.g:4263:4: (lv_argument_2_0= ruleExpression )
            // InternalAlf.g:4264:5: lv_argument_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNamedTupleAccess().getArgumentExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalAlf.g:4281:3: (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==33) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalAlf.g:4282:4: otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getNamedTupleAccess().getCommaKeyword_3_0());
            	    			

            	    				newCompositeNode(grammarAccess.getNamedTupleAccess().getNameParserRuleCall_3_1());
            	    			
            	    pushFollow(FOLLOW_65);
            	    ruleName();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    otherlv_5=(Token)match(input,49,FOLLOW_47); 

            	    				newLeafNode(otherlv_5, grammarAccess.getNamedTupleAccess().getEqualsSignGreaterThanSignKeyword_3_2());
            	    			
            	    // InternalAlf.g:4297:4: ( (lv_argument_6_0= ruleExpression ) )
            	    // InternalAlf.g:4298:5: (lv_argument_6_0= ruleExpression )
            	    {
            	    // InternalAlf.g:4298:5: (lv_argument_6_0= ruleExpression )
            	    // InternalAlf.g:4299:6: lv_argument_6_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getNamedTupleAccess().getArgumentExpressionParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
            	    break loop83;
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
    // InternalAlf.g:4321:1: entryRuleSequenceConstructionExpression returns [EObject current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
    public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionExpression = null;


        try {
            // InternalAlf.g:4321:71: (iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:4322:2: iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF
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
    // InternalAlf.g:4328:1: ruleSequenceConstructionExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4334:2: ( ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalAlf.g:4335:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalAlf.g:4335:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // InternalAlf.g:4336:3: () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalAlf.g:4336:3: ()
            // InternalAlf.g:4337:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_71); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:4347:3: ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=RULE_BOOLEAN_VALUE && LA85_0<=RULE_UNRESTRICTED_NAME)||(LA85_0>=17 && LA85_0<=18)||LA85_0==22||LA85_0==47||(LA85_0>=51 && LA85_0<=52)||LA85_0==55) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalAlf.g:4348:4: ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:4348:4: ( (lv_element_2_0= ruleExpression ) )
                    // InternalAlf.g:4349:5: (lv_element_2_0= ruleExpression )
                    {
                    // InternalAlf.g:4349:5: (lv_element_2_0= ruleExpression )
                    // InternalAlf.g:4350:6: lv_element_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_72);
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

                    // InternalAlf.g:4367:4: (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==33) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalAlf.g:4368:5: otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,33,FOLLOW_47); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:4372:5: ( (lv_element_4_0= ruleExpression ) )
                    	    // InternalAlf.g:4373:6: (lv_element_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:4373:6: (lv_element_4_0= ruleExpression )
                    	    // InternalAlf.g:4374:7: lv_element_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_72);
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
                    	    break loop84;
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
    // InternalAlf.g:4401:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalAlf.g:4401:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalAlf.g:4402:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalAlf.g:4408:1: ruleLiteralExpression returns [EObject current=null] : (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteralExpression_0 = null;

        EObject this_BooleanLiteralExpression_1 = null;

        EObject this_StringLiteralExpression_2 = null;

        EObject this_RealLiteralExpression_3 = null;

        EObject this_UnlimitedNaturalLiteralExpression_4 = null;



        	enterRule();

        try {
            // InternalAlf.g:4414:2: ( (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:4415:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:4415:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            int alt86=5;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt86=1;
                }
                break;
            case RULE_BOOLEAN_VALUE:
                {
                alt86=2;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt86=3;
                }
                break;
            case RULE_NATURAL_VALUE:
                {
                int LA86_4 = input.LA(2);

                if ( (LA86_4==EOF||(LA86_4>=18 && LA86_4<=19)||(LA86_4>=22 && LA86_4<=23)||LA86_4==33||LA86_4==39||LA86_4==41||LA86_4==48||(LA86_4>=50 && LA86_4<=54)) ) {
                    alt86=5;
                }
                else if ( (LA86_4==17) ) {
                    alt86=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 4, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt86=4;
                }
                break;
            case 18:
                {
                alt86=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // InternalAlf.g:4416:3: this_NullLiteralExpression_0= ruleNullLiteralExpression
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
                    // InternalAlf.g:4425:3: this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression
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
                    // InternalAlf.g:4434:3: this_StringLiteralExpression_2= ruleStringLiteralExpression
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
                    // InternalAlf.g:4443:3: this_RealLiteralExpression_3= ruleRealLiteralExpression
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
                    // InternalAlf.g:4452:3: this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:4464:1: entryRuleNullLiteralExpression returns [EObject current=null] : iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF ;
    public final EObject entryRuleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpression = null;


        try {
            // InternalAlf.g:4464:62: (iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF )
            // InternalAlf.g:4465:2: iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF
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
    // InternalAlf.g:4471:1: ruleNullLiteralExpression returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlf.g:4477:2: ( ( () otherlv_1= 'null' ) )
            // InternalAlf.g:4478:2: ( () otherlv_1= 'null' )
            {
            // InternalAlf.g:4478:2: ( () otherlv_1= 'null' )
            // InternalAlf.g:4479:3: () otherlv_1= 'null'
            {
            // InternalAlf.g:4479:3: ()
            // InternalAlf.g:4480:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullLiteralExpressionAccess().getLiteralNullAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_2); 

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
    // InternalAlf.g:4494:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // InternalAlf.g:4494:65: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:4495:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
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
    // InternalAlf.g:4501:1: ruleBooleanLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:4507:2: ( ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) )
            // InternalAlf.g:4508:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            {
            // InternalAlf.g:4508:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:4509:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:4509:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            // InternalAlf.g:4510:4: lv_value_0_0= RULE_BOOLEAN_VALUE
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
    // InternalAlf.g:4529:1: entryRuleStringLiteralExpression returns [EObject current=null] : iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF ;
    public final EObject entryRuleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpression = null;


        try {
            // InternalAlf.g:4529:64: (iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF )
            // InternalAlf.g:4530:2: iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF
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
    // InternalAlf.g:4536:1: ruleStringLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:4542:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalAlf.g:4543:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalAlf.g:4543:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalAlf.g:4544:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalAlf.g:4544:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalAlf.g:4545:4: lv_value_0_0= RULE_STRING_VALUE
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
    // InternalAlf.g:4564:1: entryRuleRealLiteralExpression returns [EObject current=null] : iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF ;
    public final EObject entryRuleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteralExpression = null;


        try {
            // InternalAlf.g:4564:62: (iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF )
            // InternalAlf.g:4565:2: iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF
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
    // InternalAlf.g:4571:1: ruleRealLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4577:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalAlf.g:4578:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalAlf.g:4578:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalAlf.g:4579:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalAlf.g:4579:3: (lv_value_0_0= ruleRealValue )
            // InternalAlf.g:4580:4: lv_value_0_0= ruleRealValue
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
    // InternalAlf.g:4600:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalAlf.g:4600:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalAlf.g:4601:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalAlf.g:4607:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_VALUE_0=null;
        Token kw=null;
        Token this_NATURAL_VALUE_2=null;
        Token this_NATURAL_VALUE_4=null;
        Token this_NATURAL_VALUE_9=null;


        	enterRule();

        try {
            // InternalAlf.g:4613:2: ( ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) )
            // InternalAlf.g:4614:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            {
            // InternalAlf.g:4614:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            // InternalAlf.g:4615:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            {
            // InternalAlf.g:4615:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_NATURAL_VALUE) ) {
                alt88=1;
            }
            else if ( (LA88_0==17) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalAlf.g:4616:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    {
                    // InternalAlf.g:4616:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    // InternalAlf.g:4617:5: this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    {
                    this_NATURAL_VALUE_0=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_16); 

                    					current.merge(this_NATURAL_VALUE_0);
                    				

                    					newLeafNode(this_NATURAL_VALUE_0, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_0());
                    				
                    kw=(Token)match(input,17,FOLLOW_73); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_0_1());
                    				
                    // InternalAlf.g:4629:5: (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==RULE_NATURAL_VALUE) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalAlf.g:4630:6: this_NATURAL_VALUE_2= RULE_NATURAL_VALUE
                            {
                            this_NATURAL_VALUE_2=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_74); 

                            						current.merge(this_NATURAL_VALUE_2);
                            					

                            						newLeafNode(this_NATURAL_VALUE_2, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_2());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:4640:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    {
                    // InternalAlf.g:4640:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    // InternalAlf.g:4641:5: kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE
                    {
                    kw=(Token)match(input,17,FOLLOW_75); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1_0());
                    				
                    this_NATURAL_VALUE_4=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_74); 

                    					current.merge(this_NATURAL_VALUE_4);
                    				

                    					newLeafNode(this_NATURAL_VALUE_4, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:4655:3: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( ((LA91_0>=56 && LA91_0<=57)) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalAlf.g:4656:4: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE
                    {
                    // InternalAlf.g:4656:4: (kw= 'e' | kw= 'E' )
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==56) ) {
                        alt89=1;
                    }
                    else if ( (LA89_0==57) ) {
                        alt89=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 0, input);

                        throw nvae;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalAlf.g:4657:5: kw= 'e'
                            {
                            kw=(Token)match(input,56,FOLLOW_76); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:4663:5: kw= 'E'
                            {
                            kw=(Token)match(input,57,FOLLOW_76); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:4669:4: (kw= '+' | kw= '-' )?
                    int alt90=3;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==51) ) {
                        alt90=1;
                    }
                    else if ( (LA90_0==52) ) {
                        alt90=2;
                    }
                    switch (alt90) {
                        case 1 :
                            // InternalAlf.g:4670:5: kw= '+'
                            {
                            kw=(Token)match(input,51,FOLLOW_75); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:4676:5: kw= '-'
                            {
                            kw=(Token)match(input,52,FOLLOW_75); 

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
    // InternalAlf.g:4694:1: entryRuleNaturalLiteralExpression returns [EObject current=null] : iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF ;
    public final EObject entryRuleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:4694:65: (iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:4695:2: iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF
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
    // InternalAlf.g:4701:1: ruleNaturalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) ;
    public final EObject ruleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:4707:2: ( ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) )
            // InternalAlf.g:4708:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            {
            // InternalAlf.g:4708:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            // InternalAlf.g:4709:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:4709:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            // InternalAlf.g:4710:4: lv_value_0_0= RULE_NATURAL_VALUE
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
    // InternalAlf.g:4729:1: entryRuleUnlimitedNaturalLiteralExpression returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:4729:74: (iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:4730:2: iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF
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
    // InternalAlf.g:4736:1: ruleUnlimitedNaturalLiteralExpression returns [EObject current=null] : (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NaturalLiteralExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4742:2: ( (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) )
            // InternalAlf.g:4743:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            {
            // InternalAlf.g:4743:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_NATURAL_VALUE) ) {
                alt92=1;
            }
            else if ( (LA92_0==18) ) {
                alt92=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // InternalAlf.g:4744:3: this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression
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
                    // InternalAlf.g:4753:3: ( () otherlv_2= '*' )
                    {
                    // InternalAlf.g:4753:3: ( () otherlv_2= '*' )
                    // InternalAlf.g:4754:4: () otherlv_2= '*'
                    {
                    // InternalAlf.g:4754:4: ()
                    // InternalAlf.g:4755:5: 
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
    // InternalAlf.g:4770:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAlf.g:4770:44: (iv_ruleName= ruleName EOF )
            // InternalAlf.g:4771:2: iv_ruleName= ruleName EOF
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
    // InternalAlf.g:4777:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalAlf.g:4783:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalAlf.g:4784:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalAlf.g:4784:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_ID) ) {
                alt93=1;
            }
            else if ( (LA93_0==RULE_UNRESTRICTED_NAME) ) {
                alt93=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // InternalAlf.g:4785:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:4793:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:4804:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlf.g:4804:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlf.g:4805:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlf.g:4811:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_ColonQualifiedName_1 = null;

        AntlrDatatypeRuleToken this_DotQualifiedName_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4817:2: ( (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) )
            // InternalAlf.g:4818:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            {
            // InternalAlf.g:4818:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            int alt94=3;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 18:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 33:
                case 35:
                case 36:
                case 39:
                case 41:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                    {
                    alt94=1;
                    }
                    break;
                case 17:
                    {
                    alt94=3;
                    }
                    break;
                case 16:
                    {
                    alt94=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 94, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA94_0==RULE_UNRESTRICTED_NAME) ) {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    alt94=2;
                    }
                    break;
                case EOF:
                case 18:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 33:
                case 35:
                case 36:
                case 39:
                case 41:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                    {
                    alt94=1;
                    }
                    break;
                case 17:
                    {
                    alt94=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 94, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalAlf.g:4819:3: this_Name_0= ruleName
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
                    // InternalAlf.g:4830:3: this_ColonQualifiedName_1= ruleColonQualifiedName
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
                    // InternalAlf.g:4841:3: this_DotQualifiedName_2= ruleDotQualifiedName
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
    // InternalAlf.g:4855:1: entryRuleColonQualifiedName returns [String current=null] : iv_ruleColonQualifiedName= ruleColonQualifiedName EOF ;
    public final String entryRuleColonQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColonQualifiedName = null;


        try {
            // InternalAlf.g:4855:58: (iv_ruleColonQualifiedName= ruleColonQualifiedName EOF )
            // InternalAlf.g:4856:2: iv_ruleColonQualifiedName= ruleColonQualifiedName EOF
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
    // InternalAlf.g:4862:1: ruleColonQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleColonQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4868:2: ( (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:4869:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:4869:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            // InternalAlf.g:4870:3: this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:4880:3: (kw= '::' this_Name_2= ruleName )+
            int cnt95=0;
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==16) ) {
                    int LA95_1 = input.LA(2);

                    if ( ((LA95_1>=RULE_ID && LA95_1<=RULE_UNRESTRICTED_NAME)) ) {
                        alt95=1;
                    }


                }


                switch (alt95) {
            	case 1 :
            	    // InternalAlf.g:4881:4: kw= '::' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,16,FOLLOW_11); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getColonQualifiedNameAccess().getColonColonKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_77);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt95 >= 1 ) break loop95;
                        EarlyExitException eee =
                            new EarlyExitException(95, input);
                        throw eee;
                }
                cnt95++;
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
    // InternalAlf.g:4901:1: entryRuleDotQualifiedName returns [String current=null] : iv_ruleDotQualifiedName= ruleDotQualifiedName EOF ;
    public final String entryRuleDotQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDotQualifiedName = null;


        try {
            // InternalAlf.g:4901:56: (iv_ruleDotQualifiedName= ruleDotQualifiedName EOF )
            // InternalAlf.g:4902:2: iv_ruleDotQualifiedName= ruleDotQualifiedName EOF
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
    // InternalAlf.g:4908:1: ruleDotQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleDotQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4914:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:4915:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:4915:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            // InternalAlf.g:4916:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:4926:3: (kw= '.' this_Name_2= ruleName )+
            int cnt96=0;
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==17) ) {
                    int LA96_1 = input.LA(2);

                    if ( ((LA96_1>=RULE_ID && LA96_1<=RULE_UNRESTRICTED_NAME)) ) {
                        alt96=1;
                    }


                }


                switch (alt96) {
            	case 1 :
            	    // InternalAlf.g:4927:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,17,FOLLOW_11); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getDotQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_78);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt96 >= 1 ) break loop96;
                        EarlyExitException eee =
                            new EarlyExitException(96, input);
                        throw eee;
                }
                cnt96++;
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
    // InternalAlf.g:4947:1: rulePackageElementVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator rulePackageElementVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAlf.g:4953:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // InternalAlf.g:4954:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // InternalAlf.g:4954:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==58) ) {
                alt97=1;
            }
            else if ( (LA97_0==59) ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // InternalAlf.g:4955:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:4955:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:4956:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getPackageElementVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPackageElementVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:4963:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:4963:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:4964:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

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
    // InternalAlf.g:4974:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAlf.g:4980:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) )
            // InternalAlf.g:4981:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            {
            // InternalAlf.g:4981:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            int alt98=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt98=1;
                }
                break;
            case 59:
                {
                alt98=2;
                }
                break;
            case 60:
                {
                alt98=3;
                }
                break;
            case 61:
                {
                alt98=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // InternalAlf.g:4982:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:4982:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:4983:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:4990:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:4990:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:4991:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:4998:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalAlf.g:4998:3: (enumLiteral_2= 'protected' )
                    // InternalAlf.g:4999:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:5006:3: (enumLiteral_3= 'packaged' )
                    {
                    // InternalAlf.g:5006:3: (enumLiteral_3= 'packaged' )
                    // InternalAlf.g:5007:4: enumLiteral_3= 'packaged'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_2); 

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
    // InternalAlf.g:5017:1: ruleFeatureDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFeatureDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAlf.g:5023:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalAlf.g:5024:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalAlf.g:5024:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt99=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt99=1;
                }
                break;
            case 63:
                {
                alt99=2;
                }
                break;
            case 64:
                {
                alt99=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // InternalAlf.g:5025:3: (enumLiteral_0= 'in' )
                    {
                    // InternalAlf.g:5025:3: (enumLiteral_0= 'in' )
                    // InternalAlf.g:5026:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:5033:3: (enumLiteral_1= 'out' )
                    {
                    // InternalAlf.g:5033:3: (enumLiteral_1= 'out' )
                    // InternalAlf.g:5034:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:5041:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalAlf.g:5041:3: (enumLiteral_2= 'inout' )
                    // InternalAlf.g:5042:4: enumLiteral_2= 'inout'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_2); 

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
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA79 dfa79 = new DFA79(this);
    static final String dfa_1s = "\34\uffff";
    static final String dfa_2s = "\2\4\2\17\1\10\1\uffff\1\31\3\uffff\2\20\3\10\1\4\2\20\1\23\2\21\2\23\1\10\1\4\1\10\2\23";
    static final String dfa_3s = "\2\73\2\17\1\11\1\uffff\1\32\3\uffff\2\24\2\22\1\11\1\73\2\24\1\23\2\24\2\23\1\22\1\73\1\22\2\23";
    static final String dfa_4s = "\5\uffff\1\1\1\uffff\1\2\1\3\1\4\22\uffff";
    static final String dfa_5s = "\34\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\12\uffff\1\4\5\uffff\1\5\3\uffff\1\7\1\10\1\11\3\uffff\1\6\32\uffff\1\2\1\3",
            "\1\1\12\uffff\1\4\5\uffff\1\5\3\uffff\1\7\1\10\1\11\3\uffff\1\6\32\uffff\1\2\1\3",
            "\1\4",
            "\1\4",
            "\1\12\1\13",
            "",
            "\1\7\1\10",
            "",
            "",
            "",
            "\1\14\1\15\1\uffff\1\17\1\16",
            "\1\14\1\15\1\uffff\1\17\1\16",
            "\1\20\1\21\10\uffff\1\22",
            "\1\23\1\24\10\uffff\1\22",
            "\1\25\1\26",
            "\1\1\12\uffff\1\4\5\uffff\1\5\3\uffff\1\7\1\10\1\11\3\uffff\1\6\32\uffff\1\2\1\3",
            "\1\27\2\uffff\1\17\1\16",
            "\1\27\2\uffff\1\17\1\16",
            "\1\30",
            "\1\31\1\uffff\1\17\1\16",
            "\1\31\1\uffff\1\17\1\16",
            "\1\17",
            "\1\17",
            "\1\20\1\21\10\uffff\1\32",
            "\1\1\12\uffff\1\4\5\uffff\1\5\3\uffff\1\7\1\10\1\11\3\uffff\1\6\32\uffff\1\2\1\3",
            "\1\23\1\24\10\uffff\1\33",
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
    static final String dfa_7s = "\22\uffff";
    static final String dfa_8s = "\2\4\1\uffff\2\17\1\10\2\20\2\10\1\uffff\2\20\1\uffff\2\21\2\10";
    static final String dfa_9s = "\2\73\1\uffff\2\17\1\11\2\24\2\22\1\uffff\2\24\1\uffff\2\24\2\22";
    static final String dfa_10s = "\2\uffff\1\3\7\uffff\1\2\2\uffff\1\1\4\uffff";
    static final String dfa_11s = "\22\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\12\uffff\1\5\5\uffff\1\2\3\uffff\3\2\3\uffff\1\2\32\uffff\1\3\1\4",
            "\1\1\12\uffff\1\5\5\uffff\1\2\3\uffff\3\2\3\uffff\1\2\32\uffff\1\3\1\4",
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
            return "()* loopback of 292:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )*";
        }
    }
    static final String dfa_13s = "\1\4\1\uffff\1\4\2\10\1\uffff\1\10\2\20\2\10\2\21\1\uffff\2\20\2\10";
    static final String dfa_14s = "\1\73\1\uffff\1\73\2\37\1\uffff\1\11\2\24\2\22\2\24\1\uffff\2\24\2\22";
    static final String dfa_15s = "\1\uffff\1\3\3\uffff\1\1\7\uffff\1\2\4\uffff";
    static final String[] dfa_16s = {
            "\1\2\3\uffff\2\5\5\uffff\1\6\5\uffff\1\5\1\uffff\1\1\1\uffff\3\5\3\uffff\1\5\32\uffff\1\3\1\4",
            "",
            "\1\2\3\uffff\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\3\5\3\uffff\1\5\32\uffff\1\3\1\4",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\3\5\3\uffff\1\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\3\5\3\uffff\1\5",
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
            return "()* loopback of 733:3: ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_17s = "\17\uffff";
    static final String dfa_18s = "\1\17\1\10\1\uffff\2\10\1\uffff\2\26\1\uffff\2\26\1\uffff\2\26\1\uffff";
    static final String dfa_19s = "\1\37\1\30\1\uffff\2\30\1\uffff\2\30\1\uffff\2\40\1\uffff\2\40\1\uffff";
    static final String dfa_20s = "\2\uffff\1\1\2\uffff\1\5\2\uffff\1\2\2\uffff\1\3\2\uffff\1\4";
    static final String dfa_21s = "\17\uffff}>";
    static final String[] dfa_22s = {
            "\1\5\5\uffff\1\1\3\uffff\1\3\1\4\4\uffff\1\2",
            "\1\6\1\7\16\uffff\1\10",
            "",
            "\1\11\1\12\16\uffff\1\13",
            "\1\14\1\15\16\uffff\1\16",
            "",
            "\1\2\1\uffff\1\10",
            "\1\2\1\uffff\1\10",
            "",
            "\1\2\1\uffff\1\13\7\uffff\1\2",
            "\1\2\1\uffff\1\13\7\uffff\1\2",
            "",
            "\1\2\1\uffff\1\16\7\uffff\1\2",
            "\1\2\1\uffff\1\16\7\uffff\1\2",
            ""
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
            return "896:2: ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' ) )";
        }
    }
    static final String dfa_23s = "\1\4\1\uffff\1\4\2\10\1\uffff\1\10\2\20\2\10\2\20\1\uffff\2\21\2\10";
    static final String dfa_24s = "\1\100\1\uffff\3\100\1\uffff\1\11\2\24\2\22\2\24\1\uffff\2\24\2\22";
    static final String[] dfa_25s = {
            "\1\2\3\uffff\2\5\5\uffff\1\6\5\uffff\1\5\1\uffff\1\1\1\uffff\7\5\32\uffff\1\3\1\4\5\5",
            "",
            "\1\2\3\uffff\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\7\5\32\uffff\1\3\1\4\5\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\7\5\36\uffff\3\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\7\5\36\uffff\3\5",
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
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "()* loopback of 1275:3: ( ( (lv_ownedMembership_1_0= ruleCategoryMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_26s = "\10\uffff";
    static final String dfa_27s = "\2\4\4\10\2\uffff";
    static final String dfa_28s = "\6\100\2\uffff";
    static final String dfa_29s = "\6\uffff\1\1\1\2";
    static final String dfa_30s = "\10\uffff}>";
    static final String[] dfa_31s = {
            "\1\1\3\uffff\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\4\7\1\6\32\uffff\1\2\1\3\1\4\1\5\3\7",
            "\1\1\3\uffff\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\4\7\1\6\32\uffff\1\2\1\3\1\4\1\5\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\4\7\1\6\36\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\4\7\1\6\36\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\4\7\1\6\36\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\4\7\1\6\36\uffff\3\7",
            "",
            ""
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_26;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "1338:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember )";
        }
    }
    static final String dfa_32s = "\25\uffff";
    static final String dfa_33s = "\1\33\2\10\1\uffff\1\10\2\23\1\uffff\2\20\1\10\1\uffff\2\20\1\10\1\uffff\1\10\2\21\2\20";
    static final String dfa_34s = "\1\36\2\100\1\uffff\1\57\2\55\1\uffff\2\61\1\11\1\uffff\2\61\1\11\1\uffff\1\11\4\61";
    static final String dfa_35s = "\3\uffff\1\1\3\uffff\1\2\3\uffff\1\3\3\uffff\1\4\5\uffff";
    static final String dfa_36s = "\25\uffff}>";
    static final String[] dfa_37s = {
            "\1\1\1\2\1\3\1\4",
            "\1\5\1\6\16\uffff\1\7\23\uffff\2\3\20\uffff\3\3",
            "\1\5\1\6\16\uffff\1\7\23\uffff\2\3\20\uffff\3\3",
            "",
            "\1\10\1\11\16\uffff\1\12\13\uffff\1\13\12\uffff\1\13",
            "\1\3\2\uffff\1\3\1\uffff\1\7\12\uffff\2\3\2\uffff\1\3\4\uffff\2\3",
            "\1\3\2\uffff\1\3\1\uffff\1\7\12\uffff\2\3\2\uffff\1\3\4\uffff\2\3",
            "",
            "\2\13\6\uffff\1\12\13\uffff\1\13\2\uffff\1\13\6\uffff\2\13\1\uffff\1\13",
            "\2\13\6\uffff\1\12\13\uffff\1\13\2\uffff\1\13\6\uffff\2\13\1\uffff\1\13",
            "\1\14\1\15",
            "",
            "\1\20\1\16\1\uffff\1\17\20\uffff\1\13\2\uffff\1\13\6\uffff\1\13\2\uffff\1\13",
            "\1\20\1\16\1\uffff\1\17\20\uffff\1\13\2\uffff\1\13\6\uffff\1\13\2\uffff\1\13",
            "\1\21\1\22",
            "",
            "\1\23\1\24",
            "\1\16\1\uffff\1\17\20\uffff\1\13\2\uffff\1\13\6\uffff\1\13\2\uffff\1\13",
            "\1\16\1\uffff\1\17\20\uffff\1\13\2\uffff\1\13\6\uffff\1\13\2\uffff\1\13",
            "\1\20\2\uffff\1\17\20\uffff\1\13\2\uffff\1\13\6\uffff\1\13\2\uffff\1\13",
            "\1\20\2\uffff\1\17\20\uffff\1\13\2\uffff\1\13\6\uffff\1\13\2\uffff\1\13"
    };

    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_32;
            this.eof = dfa_32;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_35;
            this.special = dfa_36;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "1590:2: ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_4_0= ruleFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isPart_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'connector' ( (lv_ownedFeatureElement_12_0= ruleConnectorDefinition ) ) ) | (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )";
        }
    }
    static final String dfa_38s = "\1\4\1\uffff\1\4\2\10\1\uffff\1\10\2\20\2\10\1\uffff\2\20\2\21\2\10";
    static final String dfa_39s = "\1\100\1\uffff\3\100\1\uffff\1\11\2\24\2\22\1\uffff\4\24\2\22";
    static final String dfa_40s = "\1\uffff\1\3\3\uffff\1\1\5\uffff\1\2\6\uffff";
    static final String[] dfa_41s = {
            "\1\2\3\uffff\2\5\5\uffff\1\6\5\uffff\1\5\1\uffff\1\1\1\uffff\7\5\2\uffff\1\5\27\uffff\1\3\1\4\5\5",
            "",
            "\1\2\3\uffff\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\7\5\2\uffff\1\5\27\uffff\1\3\1\4\5\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\7\5\2\uffff\1\5\33\uffff\3\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\7\5\2\uffff\1\5\33\uffff\3\5",
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
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final short[][] dfa_41 = unpackEncodedStringArray(dfa_41s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_11;
            this.transition = dfa_41;
        }
        public String getDescription() {
            return "()* loopback of 2186:3: ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_42s = "\11\uffff";
    static final String dfa_43s = "\2\4\4\10\3\uffff";
    static final String dfa_44s = "\6\100\3\uffff";
    static final String dfa_45s = "\6\uffff\1\1\1\2\1\3";
    static final String dfa_46s = "\11\uffff}>";
    static final String[] dfa_47s = {
            "\1\1\3\uffff\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\4\7\1\6\2\uffff\1\10\27\uffff\1\2\1\3\1\4\1\5\3\10",
            "\1\1\3\uffff\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\4\7\1\6\2\uffff\1\10\27\uffff\1\2\1\3\1\4\1\5\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\4\7\1\6\2\uffff\1\10\33\uffff\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\4\7\1\6\2\uffff\1\10\33\uffff\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\4\7\1\6\2\uffff\1\10\33\uffff\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\4\7\1\6\2\uffff\1\10\33\uffff\3\10",
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

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_42;
            this.eof = dfa_42;
            this.min = dfa_43;
            this.max = dfa_44;
            this.accept = dfa_45;
            this.special = dfa_46;
            this.transition = dfa_47;
        }
        public String getDescription() {
            return "2249:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )";
        }
    }
    static final String dfa_48s = "\13\uffff";
    static final String dfa_49s = "\2\10\1\uffff\2\23\1\10\2\uffff\2\23\1\uffff";
    static final String dfa_50s = "\2\100\1\uffff\2\55\1\100\2\uffff\2\55\1\uffff";
    static final String dfa_51s = "\2\uffff\1\3\3\uffff\1\1\1\4\2\uffff\1\2";
    static final String dfa_52s = "\13\uffff}>";
    static final String[] dfa_53s = {
            "\1\3\1\4\30\uffff\1\1\33\uffff\3\2",
            "\2\6\22\uffff\1\5\1\6\16\uffff\2\6\20\uffff\3\6",
            "",
            "\1\2\2\uffff\1\2\1\uffff\1\7\12\uffff\2\2\2\uffff\1\2\4\uffff\2\2",
            "\1\2\2\uffff\1\2\1\uffff\1\7\12\uffff\2\2\2\uffff\1\2\4\uffff\2\2",
            "\1\10\1\11\16\uffff\1\12\23\uffff\2\6\20\uffff\3\6",
            "",
            "",
            "\1\6\2\uffff\1\6\1\uffff\1\12\12\uffff\2\6\2\uffff\1\6\4\uffff\2\6",
            "\1\6\2\uffff\1\6\1\uffff\1\12\12\uffff\2\6\2\uffff\1\6\4\uffff\2\6",
            ""
    };

    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final char[] dfa_50 = DFA.unpackEncodedStringToUnsignedChars(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[][] dfa_53 = unpackEncodedStringArray(dfa_53s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_48;
            this.eof = dfa_48;
            this.min = dfa_49;
            this.max = dfa_50;
            this.accept = dfa_51;
            this.special = dfa_52;
            this.transition = dfa_53;
        }
        public String getDescription() {
            return "2347:3: ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedFeatureElement_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )";
        }
    }
    static final String dfa_54s = "\27\uffff";
    static final String dfa_55s = "\1\10\2\20\1\10\2\uffff\1\10\4\20\4\10\2\20\2\21\2\20\2\21";
    static final String dfa_56s = "\1\57\2\61\1\11\2\uffff\1\11\4\57\4\11\10\57";
    static final String dfa_57s = "\4\uffff\1\1\1\2\21\uffff";
    static final String dfa_58s = "\27\uffff}>";
    static final String[] dfa_59s = {
            "\1\1\1\2\16\uffff\1\4\13\uffff\1\3\12\uffff\1\5",
            "\2\4\6\uffff\1\4\13\uffff\1\6\2\uffff\1\4\6\uffff\1\4\1\5\1\uffff\1\4",
            "\2\4\6\uffff\1\4\13\uffff\1\6\2\uffff\1\4\6\uffff\1\4\1\5\1\uffff\1\4",
            "\1\7\1\10",
            "",
            "",
            "\1\11\1\12",
            "\1\13\1\14\6\uffff\1\4\26\uffff\1\5",
            "\1\13\1\14\6\uffff\1\4\26\uffff\1\5",
            "\1\15\1\16\6\uffff\1\4\16\uffff\1\4\6\uffff\1\4\1\5",
            "\1\15\1\16\6\uffff\1\4\16\uffff\1\4\6\uffff\1\4\1\5",
            "\1\17\1\20",
            "\1\21\1\22",
            "\1\23\1\24",
            "\1\25\1\26",
            "\1\13\7\uffff\1\4\26\uffff\1\5",
            "\1\13\7\uffff\1\4\26\uffff\1\5",
            "\1\14\6\uffff\1\4\26\uffff\1\5",
            "\1\14\6\uffff\1\4\26\uffff\1\5",
            "\1\15\7\uffff\1\4\16\uffff\1\4\6\uffff\1\4\1\5",
            "\1\15\7\uffff\1\4\16\uffff\1\4\6\uffff\1\4\1\5",
            "\1\16\6\uffff\1\4\16\uffff\1\4\6\uffff\1\4\1\5",
            "\1\16\6\uffff\1\4\16\uffff\1\4\6\uffff\1\4\1\5"
    };

    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final char[] dfa_56 = DFA.unpackEncodedStringToUnsignedChars(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final short[][] dfa_59 = unpackEncodedStringArray(dfa_59s);

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = dfa_54;
            this.eof = dfa_54;
            this.min = dfa_55;
            this.max = dfa_56;
            this.accept = dfa_57;
            this.special = dfa_58;
            this.transition = dfa_59;
        }
        public String getDescription() {
            return "3210:2: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) otherlv_7= ';' ) | ( ( (lv_name_8_0= ruleName ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) )? otherlv_11= '(' ( (lv_connectorEnd_12_0= ruleConnectorEnd ) ) otherlv_13= ',' ( (lv_connectorEnd_14_0= ruleConnectorEnd ) ) (otherlv_15= ',' ( (lv_connectorEnd_16_0= ruleConnectorEnd ) ) )* otherlv_17= ')' otherlv_18= ';' ) )";
        }
    }
    static final String dfa_60s = "\16\uffff";
    static final String dfa_61s = "\1\10\2\20\2\uffff\1\10\2\20\2\10\2\20\2\21";
    static final String dfa_62s = "\1\44\2\61\2\uffff\1\11\2\56\2\11\4\56";
    static final String dfa_63s = "\3\uffff\1\1\1\2\11\uffff";
    static final String dfa_64s = "\16\uffff}>";
    static final String[] dfa_65s = {
            "\1\1\1\2\16\uffff\1\3\13\uffff\1\3",
            "\2\4\6\uffff\1\3\13\uffff\1\5\2\uffff\1\4\6\uffff\1\4\2\uffff\1\4",
            "\2\4\6\uffff\1\3\13\uffff\1\5\2\uffff\1\4\6\uffff\1\4\2\uffff\1\4",
            "",
            "",
            "\1\6\1\7",
            "\1\10\1\11\6\uffff\1\3\16\uffff\1\4\6\uffff\1\4",
            "\1\10\1\11\6\uffff\1\3\16\uffff\1\4\6\uffff\1\4",
            "\1\12\1\13",
            "\1\14\1\15",
            "\1\10\7\uffff\1\3\16\uffff\1\4\6\uffff\1\4",
            "\1\10\7\uffff\1\3\16\uffff\1\4\6\uffff\1\4",
            "\1\11\6\uffff\1\3\16\uffff\1\4\6\uffff\1\4",
            "\1\11\6\uffff\1\3\16\uffff\1\4\6\uffff\1\4"
    };

    static final short[] dfa_60 = DFA.unpackEncodedString(dfa_60s);
    static final char[] dfa_61 = DFA.unpackEncodedStringToUnsignedChars(dfa_61s);
    static final char[] dfa_62 = DFA.unpackEncodedStringToUnsignedChars(dfa_62s);
    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final short[] dfa_64 = DFA.unpackEncodedString(dfa_64s);
    static final short[][] dfa_65 = unpackEncodedStringArray(dfa_65s);

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = dfa_60;
            this.eof = dfa_60;
            this.min = dfa_61;
            this.max = dfa_62;
            this.accept = dfa_63;
            this.special = dfa_64;
            this.transition = dfa_65;
        }
        public String getDescription() {
            return "3212:4: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )?";
        }
    }
    static final String dfa_66s = "\21\uffff";
    static final String dfa_67s = "\1\uffff\2\5\5\uffff\4\5\2\uffff\1\5\2\uffff";
    static final String dfa_68s = "\1\10\2\20\2\10\1\uffff\1\7\1\uffff\2\20\2\21\1\50\1\51\1\23\1\7\1\51";
    static final String dfa_69s = "\1\11\2\61\2\11\1\uffff\1\22\1\uffff\4\61\2\51\1\61\1\22\1\51";
    static final String dfa_70s = "\5\uffff\1\1\1\uffff\1\2\11\uffff";
    static final String dfa_71s = "\21\uffff}>";
    static final String[] dfa_72s = {
            "\1\1\1\2",
            "\1\3\1\4\1\uffff\1\5\15\uffff\1\5\2\uffff\1\5\2\uffff\1\6\6\uffff\1\5\1\uffff\1\5\1\7",
            "\1\3\1\4\1\uffff\1\5\15\uffff\1\5\2\uffff\1\5\2\uffff\1\6\6\uffff\1\5\1\uffff\1\5\1\7",
            "\1\10\1\11",
            "\1\12\1\13",
            "",
            "\1\14\12\uffff\1\15",
            "",
            "\1\3\2\uffff\1\5\15\uffff\1\5\2\uffff\1\5\2\uffff\1\6\6\uffff\1\5\1\uffff\1\5\1\7",
            "\1\3\2\uffff\1\5\15\uffff\1\5\2\uffff\1\5\2\uffff\1\6\6\uffff\1\5\1\uffff\1\5\1\7",
            "\1\4\1\uffff\1\5\15\uffff\1\5\2\uffff\1\5\2\uffff\1\6\6\uffff\1\5\1\uffff\1\5\1\7",
            "\1\4\1\uffff\1\5\15\uffff\1\5\2\uffff\1\5\2\uffff\1\6\6\uffff\1\5\1\uffff\1\5\1\7",
            "\1\17\1\16",
            "\1\16",
            "\1\5\15\uffff\1\5\14\uffff\1\5\1\uffff\1\5\1\7",
            "\1\20\12\uffff\1\15",
            "\1\16"
    };

    static final short[] dfa_66 = DFA.unpackEncodedString(dfa_66s);
    static final short[] dfa_67 = DFA.unpackEncodedString(dfa_67s);
    static final char[] dfa_68 = DFA.unpackEncodedStringToUnsignedChars(dfa_68s);
    static final char[] dfa_69 = DFA.unpackEncodedStringToUnsignedChars(dfa_69s);
    static final short[] dfa_70 = DFA.unpackEncodedString(dfa_70s);
    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final short[][] dfa_72 = unpackEncodedStringArray(dfa_72s);

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = dfa_66;
            this.eof = dfa_67;
            this.min = dfa_68;
            this.max = dfa_69;
            this.accept = dfa_70;
            this.special = dfa_71;
            this.transition = dfa_72;
        }
        public String getDescription() {
            return "3447:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_3= ruleConnectorEndMultiplicity[$current] )? ) | ( ( ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )";
        }
    }
    static final String dfa_73s = "\1\uffff\2\6\4\uffff\4\6";
    static final String dfa_74s = "\1\10\2\20\2\10\2\uffff\2\21\2\20";
    static final String dfa_75s = "\1\11\2\60\2\11\2\uffff\4\60";
    static final String dfa_76s = "\5\uffff\1\1\1\2\4\uffff";
    static final String[] dfa_77s = {
            "\1\1\1\2",
            "\1\4\1\3\1\uffff\1\6\15\uffff\1\6\2\uffff\1\5\2\uffff\1\6\6\uffff\1\6\1\uffff\1\6",
            "\1\4\1\3\1\uffff\1\6\15\uffff\1\6\2\uffff\1\5\2\uffff\1\6\6\uffff\1\6\1\uffff\1\6",
            "\1\7\1\10",
            "\1\11\1\12",
            "",
            "",
            "\1\3\1\uffff\1\6\15\uffff\1\6\2\uffff\1\5\2\uffff\1\6\6\uffff\1\6\1\uffff\1\6",
            "\1\3\1\uffff\1\6\15\uffff\1\6\2\uffff\1\5\2\uffff\1\6\6\uffff\1\6\1\uffff\1\6",
            "\1\4\2\uffff\1\6\15\uffff\1\6\2\uffff\1\5\2\uffff\1\6\6\uffff\1\6\1\uffff\1\6",
            "\1\4\2\uffff\1\6\15\uffff\1\6\2\uffff\1\5\2\uffff\1\6\6\uffff\1\6\1\uffff\1\6"
    };
    static final short[] dfa_73 = DFA.unpackEncodedString(dfa_73s);
    static final char[] dfa_74 = DFA.unpackEncodedStringToUnsignedChars(dfa_74s);
    static final char[] dfa_75 = DFA.unpackEncodedStringToUnsignedChars(dfa_75s);
    static final short[] dfa_76 = DFA.unpackEncodedString(dfa_76s);
    static final short[][] dfa_77 = unpackEncodedStringArray(dfa_77s);

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = dfa_48;
            this.eof = dfa_73;
            this.min = dfa_74;
            this.max = dfa_75;
            this.accept = dfa_76;
            this.special = dfa_52;
            this.transition = dfa_77;
        }
        public String getDescription() {
            return "3449:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )?";
        }
    }
    static final String dfa_78s = "\2\uffff\2\7\6\uffff\4\7";
    static final String dfa_79s = "\1\5\1\uffff\2\20\4\uffff\2\10\2\21\2\20";
    static final String dfa_80s = "\1\67\1\uffff\2\66\4\uffff\2\11\4\66";
    static final String dfa_81s = "\1\uffff\1\1\2\uffff\1\4\1\5\1\3\1\2\6\uffff";
    static final String[] dfa_82s = {
            "\3\1\1\2\1\3\7\uffff\2\1\3\uffff\1\4\30\uffff\1\5\7\uffff\1\1",
            "",
            "\1\11\1\10\2\7\2\uffff\2\7\11\uffff\1\7\5\uffff\1\7\1\uffff\1\7\5\uffff\1\6\1\7\1\uffff\5\7",
            "\1\11\1\10\2\7\2\uffff\2\7\11\uffff\1\7\5\uffff\1\7\1\uffff\1\7\5\uffff\1\6\1\7\1\uffff\5\7",
            "",
            "",
            "",
            "",
            "\1\12\1\13",
            "\1\14\1\15",
            "\1\10\2\7\2\uffff\2\7\11\uffff\1\7\5\uffff\1\7\1\uffff\1\7\5\uffff\1\6\1\7\1\uffff\5\7",
            "\1\10\2\7\2\uffff\2\7\11\uffff\1\7\5\uffff\1\7\1\uffff\1\7\5\uffff\1\6\1\7\1\uffff\5\7",
            "\1\11\1\uffff\2\7\2\uffff\2\7\11\uffff\1\7\5\uffff\1\7\1\uffff\1\7\5\uffff\1\6\1\7\1\uffff\5\7",
            "\1\11\1\uffff\2\7\2\uffff\2\7\11\uffff\1\7\5\uffff\1\7\1\uffff\1\7\5\uffff\1\6\1\7\1\uffff\5\7"
    };
    static final short[] dfa_78 = DFA.unpackEncodedString(dfa_78s);
    static final char[] dfa_79 = DFA.unpackEncodedStringToUnsignedChars(dfa_79s);
    static final char[] dfa_80 = DFA.unpackEncodedStringToUnsignedChars(dfa_80s);
    static final short[] dfa_81 = DFA.unpackEncodedString(dfa_81s);
    static final short[][] dfa_82 = unpackEncodedStringArray(dfa_82s);

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = dfa_60;
            this.eof = dfa_78;
            this.min = dfa_79;
            this.max = dfa_80;
            this.accept = dfa_81;
            this.special = dfa_64;
            this.transition = dfa_82;
        }
        public String getDescription() {
            return "4001:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0C00000000008012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0C00000000008010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0C0000008EA08310L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0C0000008E208310L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0C00000000000012L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000300L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000300L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xFC000000FEA08310L,0x0000000000000001L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000086208000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xC000000078000300L,0x0000000000000001L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x3C00000000000012L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xC000300008000300L,0x0000000000000001L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000801001000300L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xFC000004FEA08310L,0x0000000000000001L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0xC000000408000300L,0x0000000000000001L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0xC000300038000300L,0x0000000000000001L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000800480000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000009800480000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000008800480000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000309000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000308000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00988000004603E0L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000006000000300L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000004000000300L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00800000000600E0L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000001001000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000001001000300L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000801000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0001000200000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0002008000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x007C000000040002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x00808000004603E0L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x00998000004603E0L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0098800000C603E0L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0300000000000082L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0018000000000080L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000020002L});

}
