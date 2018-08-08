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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOCUMENTATION_COMMENT", "RULE_BOOLEAN_VALUE", "RULE_STRING_VALUE", "RULE_NATURAL_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'import'", "'::'", "'.'", "'*'", "';'", "'as'", "'package'", "'{'", "'}'", "'is'", "'class'", "'assoc'", "'feature'", "'abstract'", "'specializes'", "','", "'part'", "'port'", "'connector'", "'end'", "'='", "':'", "'compose'", "'any'", "'['", "'..'", "']'", "'ordered'", "'nonunique'", "'subsets'", "'redefines'", "'to'", "'('", "')'", "'=>'", "'@'", "'+'", "'-'", "'/'", "'^'", "'null'", "'e'", "'E'", "'public'", "'private'", "'protected'", "'packaged'", "'in'", "'out'", "'inout'"
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

            if ( ((LA4_0>=58 && LA4_0<=59)) ) {
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

                if ( (LA6_1==17) ) {
                    int LA6_3 = input.LA(3);

                    if ( ((LA6_3>=RULE_ID && LA6_3<=RULE_UNRESTRICTED_NAME)) ) {
                        alt6=3;
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
                else if ( (LA6_1==16) ) {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4==18) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_4>=RULE_ID && LA6_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt6=2;
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
                    int LA6_3 = input.LA(3);

                    if ( ((LA6_3>=RULE_ID && LA6_3<=RULE_UNRESTRICTED_NAME)) ) {
                        alt6=3;
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
                else if ( (LA6_2==16) ) {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4==18) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_4>=RULE_ID && LA6_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

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

            if ( ((LA7_0>=58 && LA7_0<=59)) ) {
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

            if ( ((LA12_0>=58 && LA12_0<=59)) ) {
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
    // InternalAlf.g:1291:1: ruleClassDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )? ) ;
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
            // InternalAlf.g:1297:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )? ) )
            // InternalAlf.g:1298:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )? )
            {
            // InternalAlf.g:1298:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )? )
            // InternalAlf.g:1299:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )?
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

            // InternalAlf.g:1336:3: (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAlf.g:1337:4: otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )*
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0());
                    			
                    // InternalAlf.g:1341:4: ( (lv_ownedElement_4_0= ruleGeneralization ) )
                    // InternalAlf.g:1342:5: (lv_ownedElement_4_0= ruleGeneralization )
                    {
                    // InternalAlf.g:1342:5: (lv_ownedElement_4_0= ruleGeneralization )
                    // InternalAlf.g:1343:6: lv_ownedElement_4_0= ruleGeneralization
                    {

                    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedElementGeneralizationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
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

                    // InternalAlf.g:1360:4: (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==30) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalAlf.g:1361:5: otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) )
                    	    {
                    	    otherlv_5=(Token)match(input,30,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:1365:5: ( (lv_ownedElement_6_0= ruleGeneralization ) )
                    	    // InternalAlf.g:1366:6: (lv_ownedElement_6_0= ruleGeneralization )
                    	    {
                    	    // InternalAlf.g:1366:6: (lv_ownedElement_6_0= ruleGeneralization )
                    	    // InternalAlf.g:1367:7: lv_ownedElement_6_0= ruleGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedElementGeneralizationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
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
                    	    break loop24;
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
    // InternalAlf.g:1391:1: ruleClassBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleClassMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleClassBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_ownedMembership_1_0 = null;

        EObject lv_ownedImport_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1397:2: ( (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleClassMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' ) )
            // InternalAlf.g:1398:2: (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleClassMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' )
            {
            // InternalAlf.g:1398:2: (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleClassMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' )
            // InternalAlf.g:1399:3: otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleClassMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getClassBodyAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAlf.g:1403:3: ( ( (lv_ownedMembership_1_0= ruleClassMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )*
            loop26:
            do {
                int alt26=3;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // InternalAlf.g:1404:4: ( (lv_ownedMembership_1_0= ruleClassMember ) )
            	    {
            	    // InternalAlf.g:1404:4: ( (lv_ownedMembership_1_0= ruleClassMember ) )
            	    // InternalAlf.g:1405:5: (lv_ownedMembership_1_0= ruleClassMember )
            	    {
            	    // InternalAlf.g:1405:5: (lv_ownedMembership_1_0= ruleClassMember )
            	    // InternalAlf.g:1406:6: lv_ownedMembership_1_0= ruleClassMember
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
            	    // InternalAlf.g:1424:4: ( (lv_ownedImport_2_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:1424:4: ( (lv_ownedImport_2_0= rulePackageImport ) )
            	    // InternalAlf.g:1425:5: (lv_ownedImport_2_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:1425:5: (lv_ownedImport_2_0= rulePackageImport )
            	    // InternalAlf.g:1426:6: lv_ownedImport_2_0= rulePackageImport
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
            	    break loop26;
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
    // InternalAlf.g:1452:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalAlf.g:1452:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalAlf.g:1453:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalAlf.g:1459:1: ruleGeneralization returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:1465:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:1466:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:1466:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1467:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:1467:3: ( ruleQualifiedName )
            // InternalAlf.g:1468:4: ruleQualifiedName
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
    // InternalAlf.g:1485:1: entryRuleClassMember returns [EObject current=null] : iv_ruleClassMember= ruleClassMember EOF ;
    public final EObject entryRuleClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassMember = null;


        try {
            // InternalAlf.g:1485:52: (iv_ruleClassMember= ruleClassMember EOF )
            // InternalAlf.g:1486:2: iv_ruleClassMember= ruleClassMember EOF
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
    // InternalAlf.g:1492:1: ruleClassMember returns [EObject current=null] : (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_FeatureClassMember_1= ruleFeatureClassMember ) ;
    public final EObject ruleClassMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureClassMember_0 = null;

        EObject this_FeatureClassMember_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1498:2: ( (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_FeatureClassMember_1= ruleFeatureClassMember ) )
            // InternalAlf.g:1499:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_FeatureClassMember_1= ruleFeatureClassMember )
            {
            // InternalAlf.g:1499:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_FeatureClassMember_1= ruleFeatureClassMember )
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalAlf.g:1500:3: this_NonFeatureClassMember_0= ruleNonFeatureClassMember
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
                    // InternalAlf.g:1509:3: this_FeatureClassMember_1= ruleFeatureClassMember
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
    // InternalAlf.g:1521:1: entryRuleNonFeatureClassMember returns [EObject current=null] : iv_ruleNonFeatureClassMember= ruleNonFeatureClassMember EOF ;
    public final EObject entryRuleNonFeatureClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureClassMember = null;


        try {
            // InternalAlf.g:1521:62: (iv_ruleNonFeatureClassMember= ruleNonFeatureClassMember EOF )
            // InternalAlf.g:1522:2: iv_ruleNonFeatureClassMember= ruleNonFeatureClassMember EOF
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
    // InternalAlf.g:1528:1: ruleNonFeatureClassMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? this_NonFeatureMemberElement_2= ruleNonFeatureMemberElement[$current] ) ;
    public final EObject ruleNonFeatureClassMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedElement_0_0 = null;

        Enumerator lv_visibility_1_0 = null;

        EObject this_NonFeatureMemberElement_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:1534:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? this_NonFeatureMemberElement_2= ruleNonFeatureMemberElement[$current] ) )
            // InternalAlf.g:1535:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? this_NonFeatureMemberElement_2= ruleNonFeatureMemberElement[$current] )
            {
            // InternalAlf.g:1535:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? this_NonFeatureMemberElement_2= ruleNonFeatureMemberElement[$current] )
            // InternalAlf.g:1536:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? this_NonFeatureMemberElement_2= ruleNonFeatureMemberElement[$current]
            {
            // InternalAlf.g:1536:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAlf.g:1537:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:1537:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:1538:5: lv_ownedElement_0_0= ruleComment
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
            	    break loop28;
                }
            } while (true);

            // InternalAlf.g:1555:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=58 && LA29_0<=61)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAlf.g:1556:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:1556:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:1557:5: lv_visibility_1_0= ruleVisibilityIndicator
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
    // InternalAlf.g:1589:1: entryRuleFeatureClassMember returns [EObject current=null] : iv_ruleFeatureClassMember= ruleFeatureClassMember EOF ;
    public final EObject entryRuleFeatureClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureClassMember = null;


        try {
            // InternalAlf.g:1589:59: (iv_ruleFeatureClassMember= ruleFeatureClassMember EOF )
            // InternalAlf.g:1590:2: iv_ruleFeatureClassMember= ruleFeatureClassMember EOF
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
    // InternalAlf.g:1596:1: ruleFeatureClassMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? (this_FeatureMemberElement_2= ruleFeatureMemberElement[$current] | ( ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) ) ;
    public final EObject ruleFeatureClassMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_ownedElement_0_0 = null;

        Enumerator lv_visibility_1_0 = null;

        EObject this_FeatureMemberElement_2 = null;

        Enumerator lv_direction_3_0 = null;

        EObject lv_ownedMemberElement_4_0 = null;

        AntlrDatatypeRuleToken lv_memberName_5_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1602:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? (this_FeatureMemberElement_2= ruleFeatureMemberElement[$current] | ( ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) ) )
            // InternalAlf.g:1603:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? (this_FeatureMemberElement_2= ruleFeatureMemberElement[$current] | ( ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) )
            {
            // InternalAlf.g:1603:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? (this_FeatureMemberElement_2= ruleFeatureMemberElement[$current] | ( ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) ) )
            // InternalAlf.g:1604:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? (this_FeatureMemberElement_2= ruleFeatureMemberElement[$current] | ( ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) )
            {
            // InternalAlf.g:1604:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAlf.g:1605:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:1605:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:1606:5: lv_ownedElement_0_0= ruleComment
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
            	    break loop30;
                }
            } while (true);

            // InternalAlf.g:1623:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=58 && LA31_0<=61)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAlf.g:1624:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:1624:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:1625:5: lv_visibility_1_0= ruleVisibilityIndicator
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

            // InternalAlf.g:1642:3: (this_FeatureMemberElement_2= ruleFeatureMemberElement[$current] | ( ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 27:
            case 31:
            case 32:
            case 33:
                {
                alt33=1;
                }
                break;
            case 62:
            case 63:
            case 64:
                {
                alt33=2;
                }
                break;
            case RULE_ID:
                {
                int LA33_3 = input.LA(2);

                if ( (LA33_3==24) ) {
                    alt33=3;
                }
                else if ( (LA33_3==19||LA33_3==22||(LA33_3>=35 && LA33_3<=36)||LA33_3==39||(LA33_3>=44 && LA33_3<=45)) ) {
                    alt33=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA33_4 = input.LA(2);

                if ( (LA33_4==24) ) {
                    alt33=3;
                }
                else if ( (LA33_4==19||LA33_4==22||(LA33_4>=35 && LA33_4<=36)||LA33_4==39||(LA33_4>=44 && LA33_4<=45)) ) {
                    alt33=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalAlf.g:1643:4: this_FeatureMemberElement_2= ruleFeatureMemberElement[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getFeatureClassMemberRule());
                    				}
                    				newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getFeatureMemberElementParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_FeatureMemberElement_2=ruleFeatureMemberElement(current);

                    state._fsp--;


                    				current = this_FeatureMemberElement_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalAlf.g:1655:4: ( ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1655:4: ( ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1656:5: ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1656:5: ( (lv_direction_3_0= ruleFeatureDirection ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=62 && LA32_0<=64)) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalAlf.g:1657:6: (lv_direction_3_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1657:6: (lv_direction_3_0= ruleFeatureDirection )
                            // InternalAlf.g:1658:7: lv_direction_3_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getDirectionFeatureDirectionEnumRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_22);
                            lv_direction_3_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFeatureClassMemberRule());
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

                    // InternalAlf.g:1675:5: ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1676:6: (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1676:6: (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1677:7: lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getOwnedMemberElementNamedFeatureDefinitionParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_4_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeatureClassMemberRule());
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
                case 3 :
                    // InternalAlf.g:1696:4: ( ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' )
                    {
                    // InternalAlf.g:1696:4: ( ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';' )
                    // InternalAlf.g:1697:5: ( (lv_memberName_5_0= ruleName ) ) otherlv_6= 'is' ( ( ruleQualifiedName ) ) otherlv_8= ';'
                    {
                    // InternalAlf.g:1697:5: ( (lv_memberName_5_0= ruleName ) )
                    // InternalAlf.g:1698:6: (lv_memberName_5_0= ruleName )
                    {
                    // InternalAlf.g:1698:6: (lv_memberName_5_0= ruleName )
                    // InternalAlf.g:1699:7: lv_memberName_5_0= ruleName
                    {

                    							newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getMemberNameNameParserRuleCall_2_2_0_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_memberName_5_0=ruleName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeatureClassMemberRule());
                    							}
                    							set(
                    								current,
                    								"memberName",
                    								lv_memberName_5_0,
                    								"org.omg.sysml.Alf.Name");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_10); 

                    					newLeafNode(otherlv_6, grammarAccess.getFeatureClassMemberAccess().getIsKeyword_2_2_1());
                    				
                    // InternalAlf.g:1720:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1721:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1721:6: ( ruleQualifiedName )
                    // InternalAlf.g:1722:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFeatureClassMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getMemberElementFeatureCrossReference_2_2_2_0());
                    						
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getFeatureClassMemberAccess().getSemicolonKeyword_2_2_3());
                    				

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


    // $ANTLR start "ruleFeatureMemberElement"
    // InternalAlf.g:1747:1: ruleFeatureMemberElement[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= 'feature' | ( (lv_isComposite_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isComposite_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) ;
    public final EObject ruleFeatureMemberElement(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_isComposite_1_0=null;
        Token lv_isPort_2_0=null;
        Token otherlv_5=null;
        Token lv_isComposite_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Enumerator lv_direction_3_0 = null;

        EObject lv_ownedMemberElement_4_0 = null;

        AntlrDatatypeRuleToken lv_memberName_7_0 = null;

        EObject lv_ownedMemberElement_12_0 = null;

        AntlrDatatypeRuleToken lv_memberName_14_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1753:2: ( ( ( (otherlv_0= 'feature' | ( (lv_isComposite_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isComposite_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) )
            // InternalAlf.g:1754:2: ( ( (otherlv_0= 'feature' | ( (lv_isComposite_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isComposite_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )
            {
            // InternalAlf.g:1754:2: ( ( (otherlv_0= 'feature' | ( (lv_isComposite_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isComposite_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )
            int alt39=4;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // InternalAlf.g:1755:3: ( (otherlv_0= 'feature' | ( (lv_isComposite_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1755:3: ( (otherlv_0= 'feature' | ( (lv_isComposite_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) )
                    // InternalAlf.g:1756:4: (otherlv_0= 'feature' | ( (lv_isComposite_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) )
                    {
                    // InternalAlf.g:1756:4: (otherlv_0= 'feature' | ( (lv_isComposite_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) )
                    int alt34=3;
                    switch ( input.LA(1) ) {
                    case 27:
                        {
                        alt34=1;
                        }
                        break;
                    case 31:
                        {
                        alt34=2;
                        }
                        break;
                    case 32:
                        {
                        alt34=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }

                    switch (alt34) {
                        case 1 :
                            // InternalAlf.g:1757:5: otherlv_0= 'feature'
                            {
                            otherlv_0=(Token)match(input,27,FOLLOW_32); 

                            					newLeafNode(otherlv_0, grammarAccess.getFeatureMemberElementAccess().getFeatureKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1762:5: ( (lv_isComposite_1_0= 'part' ) )
                            {
                            // InternalAlf.g:1762:5: ( (lv_isComposite_1_0= 'part' ) )
                            // InternalAlf.g:1763:6: (lv_isComposite_1_0= 'part' )
                            {
                            // InternalAlf.g:1763:6: (lv_isComposite_1_0= 'part' )
                            // InternalAlf.g:1764:7: lv_isComposite_1_0= 'part'
                            {
                            lv_isComposite_1_0=(Token)match(input,31,FOLLOW_32); 

                            							newLeafNode(lv_isComposite_1_0, grammarAccess.getFeatureMemberElementAccess().getIsCompositePartKeyword_0_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFeatureMemberElementRule());
                            							}
                            							setWithLastConsumed(current, "isComposite", true, "part");
                            						

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAlf.g:1777:5: ( (lv_isPort_2_0= 'port' ) )
                            {
                            // InternalAlf.g:1777:5: ( (lv_isPort_2_0= 'port' ) )
                            // InternalAlf.g:1778:6: (lv_isPort_2_0= 'port' )
                            {
                            // InternalAlf.g:1778:6: (lv_isPort_2_0= 'port' )
                            // InternalAlf.g:1779:7: lv_isPort_2_0= 'port'
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

                    // InternalAlf.g:1792:4: ( (lv_direction_3_0= ruleFeatureDirection ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>=62 && LA35_0<=64)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalAlf.g:1793:5: (lv_direction_3_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1793:5: (lv_direction_3_0= ruleFeatureDirection )
                            // InternalAlf.g:1794:6: lv_direction_3_0= ruleFeatureDirection
                            {

                            						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getDirectionFeatureDirectionEnumRuleCall_0_1_0());
                            					
                            pushFollow(FOLLOW_32);
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

                    // InternalAlf.g:1811:4: ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) )
                    // InternalAlf.g:1812:5: (lv_ownedMemberElement_4_0= ruleFeatureDefinition )
                    {
                    // InternalAlf.g:1812:5: (lv_ownedMemberElement_4_0= ruleFeatureDefinition )
                    // InternalAlf.g:1813:6: lv_ownedMemberElement_4_0= ruleFeatureDefinition
                    {

                    						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getOwnedMemberElementFeatureDefinitionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_4_0=ruleFeatureDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureMemberElementRule());
                    						}
                    						set(
                    							current,
                    							"ownedMemberElement",
                    							lv_ownedMemberElement_4_0,
                    							"org.omg.sysml.Alf.FeatureDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1832:3: ( (otherlv_5= 'feature' | ( (lv_isComposite_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    {
                    // InternalAlf.g:1832:3: ( (otherlv_5= 'feature' | ( (lv_isComposite_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    // InternalAlf.g:1833:4: (otherlv_5= 'feature' | ( (lv_isComposite_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';'
                    {
                    // InternalAlf.g:1833:4: (otherlv_5= 'feature' | ( (lv_isComposite_6_0= 'part' ) ) )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==27) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==31) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalAlf.g:1834:5: otherlv_5= 'feature'
                            {
                            otherlv_5=(Token)match(input,27,FOLLOW_20); 

                            					newLeafNode(otherlv_5, grammarAccess.getFeatureMemberElementAccess().getFeatureKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1839:5: ( (lv_isComposite_6_0= 'part' ) )
                            {
                            // InternalAlf.g:1839:5: ( (lv_isComposite_6_0= 'part' ) )
                            // InternalAlf.g:1840:6: (lv_isComposite_6_0= 'part' )
                            {
                            // InternalAlf.g:1840:6: (lv_isComposite_6_0= 'part' )
                            // InternalAlf.g:1841:7: lv_isComposite_6_0= 'part'
                            {
                            lv_isComposite_6_0=(Token)match(input,31,FOLLOW_20); 

                            							newLeafNode(lv_isComposite_6_0, grammarAccess.getFeatureMemberElementAccess().getIsCompositePartKeyword_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFeatureMemberElementRule());
                            							}
                            							setWithLastConsumed(current, "isComposite", true, "part");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1854:4: ( (lv_memberName_7_0= ruleName ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalAlf.g:1855:5: (lv_memberName_7_0= ruleName )
                            {
                            // InternalAlf.g:1855:5: (lv_memberName_7_0= ruleName )
                            // InternalAlf.g:1856:6: lv_memberName_7_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getMemberNameNameParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_21);
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

                    otherlv_8=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getFeatureMemberElementAccess().getIsKeyword_1_2());
                    			
                    // InternalAlf.g:1877:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1878:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1878:5: ( ruleQualifiedName )
                    // InternalAlf.g:1879:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getMemberElementFeatureCrossReference_1_3_0());
                    					
                    pushFollow(FOLLOW_13);
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
                    // InternalAlf.g:1899:3: (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) )
                    {
                    // InternalAlf.g:1899:3: (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) )
                    // InternalAlf.g:1900:4: otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) )
                    {
                    otherlv_11=(Token)match(input,33,FOLLOW_33); 

                    				newLeafNode(otherlv_11, grammarAccess.getFeatureMemberElementAccess().getConnectorKeyword_2_0());
                    			
                    // InternalAlf.g:1904:4: ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) )
                    // InternalAlf.g:1905:5: (lv_ownedMemberElement_12_0= ruleConnectorDefinition )
                    {
                    // InternalAlf.g:1905:5: (lv_ownedMemberElement_12_0= ruleConnectorDefinition )
                    // InternalAlf.g:1906:6: lv_ownedMemberElement_12_0= ruleConnectorDefinition
                    {

                    						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getOwnedMemberElementConnectorDefinitionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_12_0=ruleConnectorDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureMemberElementRule());
                    						}
                    						set(
                    							current,
                    							"ownedMemberElement",
                    							lv_ownedMemberElement_12_0,
                    							"org.omg.sysml.Alf.ConnectorDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1925:3: (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    {
                    // InternalAlf.g:1925:3: (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    // InternalAlf.g:1926:4: otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';'
                    {
                    otherlv_13=(Token)match(input,33,FOLLOW_20); 

                    				newLeafNode(otherlv_13, grammarAccess.getFeatureMemberElementAccess().getConnectorKeyword_3_0());
                    			
                    // InternalAlf.g:1930:4: ( (lv_memberName_14_0= ruleName ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalAlf.g:1931:5: (lv_memberName_14_0= ruleName )
                            {
                            // InternalAlf.g:1931:5: (lv_memberName_14_0= ruleName )
                            // InternalAlf.g:1932:6: lv_memberName_14_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getMemberNameNameParserRuleCall_3_1_0());
                            					
                            pushFollow(FOLLOW_21);
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

                    otherlv_15=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getFeatureMemberElementAccess().getIsKeyword_3_2());
                    			
                    // InternalAlf.g:1953:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1954:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1954:5: ( ruleQualifiedName )
                    // InternalAlf.g:1955:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeatureMemberElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getMemberElementConnectorCrossReference_3_3_0());
                    					
                    pushFollow(FOLLOW_13);
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


    // $ANTLR start "entryRuleAssociationDefinitionOrStub"
    // InternalAlf.g:1978:1: entryRuleAssociationDefinitionOrStub returns [EObject current=null] : iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF ;
    public final EObject entryRuleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinitionOrStub = null;


        try {
            // InternalAlf.g:1978:68: (iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF )
            // InternalAlf.g:1979:2: iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF
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
    // InternalAlf.g:1985:1: ruleAssociationDefinitionOrStub returns [EObject current=null] : this_AssociationDefinition_0= ruleAssociationDefinition[$current] ;
    public final EObject ruleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_AssociationDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1991:2: (this_AssociationDefinition_0= ruleAssociationDefinition[$current] )
            // InternalAlf.g:1992:2: this_AssociationDefinition_0= ruleAssociationDefinition[$current]
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
    // InternalAlf.g:2007:1: ruleAssociationDefinition[EObject in_current] returns [EObject current=in_current] : (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] ) ;
    public final EObject ruleAssociationDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_AssociationDeclaration_0 = null;

        EObject this_AssociationBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2013:2: ( (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] ) )
            // InternalAlf.g:2014:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] )
            {
            // InternalAlf.g:2014:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] )
            // InternalAlf.g:2015:3: this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current]
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
    // InternalAlf.g:2042:1: ruleAssociationDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )? ) ;
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
            // InternalAlf.g:2048:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )? ) )
            // InternalAlf.g:2049:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )? )
            {
            // InternalAlf.g:2049:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )? )
            // InternalAlf.g:2050:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )?
            {
            // InternalAlf.g:2050:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==28) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAlf.g:2051:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:2051:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:2052:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,28,FOLLOW_34); 

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
            		
            // InternalAlf.g:2068:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:2069:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:2069:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:2070:5: lv_name_2_0= ruleName
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

            // InternalAlf.g:2087:3: (otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==29) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAlf.g:2088:4: otherlv_3= 'specializes' ( (lv_ownedElement_4_0= ruleGeneralization ) ) (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )*
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getAssociationDeclarationAccess().getSpecializesKeyword_3_0());
                    			
                    // InternalAlf.g:2092:4: ( (lv_ownedElement_4_0= ruleGeneralization ) )
                    // InternalAlf.g:2093:5: (lv_ownedElement_4_0= ruleGeneralization )
                    {
                    // InternalAlf.g:2093:5: (lv_ownedElement_4_0= ruleGeneralization )
                    // InternalAlf.g:2094:6: lv_ownedElement_4_0= ruleGeneralization
                    {

                    						newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getOwnedElementGeneralizationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
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

                    // InternalAlf.g:2111:4: (otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==30) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalAlf.g:2112:5: otherlv_5= ',' ( (lv_ownedElement_6_0= ruleGeneralization ) )
                    	    {
                    	    otherlv_5=(Token)match(input,30,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAssociationDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:2116:5: ( (lv_ownedElement_6_0= ruleGeneralization ) )
                    	    // InternalAlf.g:2117:6: (lv_ownedElement_6_0= ruleGeneralization )
                    	    {
                    	    // InternalAlf.g:2117:6: (lv_ownedElement_6_0= ruleGeneralization )
                    	    // InternalAlf.g:2118:7: lv_ownedElement_6_0= ruleGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getOwnedElementGeneralizationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
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
    // $ANTLR end "ruleAssociationDeclaration"


    // $ANTLR start "ruleAssociationBody"
    // InternalAlf.g:2142:1: ruleAssociationBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleAssociationBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_ownedMembership_1_0 = null;

        EObject lv_ownedImport_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2148:2: ( (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' ) )
            // InternalAlf.g:2149:2: (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' )
            {
            // InternalAlf.g:2149:2: (otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}' )
            // InternalAlf.g:2150:3: otherlv_0= '{' ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationBodyAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAlf.g:2154:3: ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )*
            loop43:
            do {
                int alt43=3;
                alt43 = dfa43.predict(input);
                switch (alt43) {
            	case 1 :
            	    // InternalAlf.g:2155:4: ( (lv_ownedMembership_1_0= ruleAssociationMember ) )
            	    {
            	    // InternalAlf.g:2155:4: ( (lv_ownedMembership_1_0= ruleAssociationMember ) )
            	    // InternalAlf.g:2156:5: (lv_ownedMembership_1_0= ruleAssociationMember )
            	    {
            	    // InternalAlf.g:2156:5: (lv_ownedMembership_1_0= ruleAssociationMember )
            	    // InternalAlf.g:2157:6: lv_ownedMembership_1_0= ruleAssociationMember
            	    {

            	    						newCompositeNode(grammarAccess.getAssociationBodyAccess().getOwnedMembershipAssociationMemberParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
            	    // InternalAlf.g:2175:4: ( (lv_ownedImport_2_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:2175:4: ( (lv_ownedImport_2_0= rulePackageImport ) )
            	    // InternalAlf.g:2176:5: (lv_ownedImport_2_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:2176:5: (lv_ownedImport_2_0= rulePackageImport )
            	    // InternalAlf.g:2177:6: lv_ownedImport_2_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getAssociationBodyAccess().getOwnedImportPackageImportParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
            	    break loop43;
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
    // InternalAlf.g:2203:1: entryRuleAssociationMember returns [EObject current=null] : iv_ruleAssociationMember= ruleAssociationMember EOF ;
    public final EObject entryRuleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationMember = null;


        try {
            // InternalAlf.g:2203:58: (iv_ruleAssociationMember= ruleAssociationMember EOF )
            // InternalAlf.g:2204:2: iv_ruleAssociationMember= ruleAssociationMember EOF
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
    // InternalAlf.g:2210:1: ruleAssociationMember returns [EObject current=null] : (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember ) ;
    public final EObject ruleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureClassMember_0 = null;

        EObject this_AssociationFeatureMember_1 = null;

        EObject this_AssociationEndFeatureMember_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2216:2: ( (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember ) )
            // InternalAlf.g:2217:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )
            {
            // InternalAlf.g:2217:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )
            int alt44=3;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // InternalAlf.g:2218:3: this_NonFeatureClassMember_0= ruleNonFeatureClassMember
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
                    // InternalAlf.g:2227:3: this_AssociationFeatureMember_1= ruleAssociationFeatureMember
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
                    // InternalAlf.g:2236:3: this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember
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
    // InternalAlf.g:2248:1: entryRuleAssociationFeatureMember returns [EObject current=null] : iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF ;
    public final EObject entryRuleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationFeatureMember = null;


        try {
            // InternalAlf.g:2248:65: (iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF )
            // InternalAlf.g:2249:2: iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF
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
    // InternalAlf.g:2255:1: ruleAssociationFeatureMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? this_FeatureMemberElement_2= ruleFeatureMemberElement[$current] ) ;
    public final EObject ruleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedElement_0_0 = null;

        Enumerator lv_visibility_1_0 = null;

        EObject this_FeatureMemberElement_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2261:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? this_FeatureMemberElement_2= ruleFeatureMemberElement[$current] ) )
            // InternalAlf.g:2262:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? this_FeatureMemberElement_2= ruleFeatureMemberElement[$current] )
            {
            // InternalAlf.g:2262:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? this_FeatureMemberElement_2= ruleFeatureMemberElement[$current] )
            // InternalAlf.g:2263:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? this_FeatureMemberElement_2= ruleFeatureMemberElement[$current]
            {
            // InternalAlf.g:2263:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalAlf.g:2264:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:2264:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:2265:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_36);
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
            	    break loop45;
                }
            } while (true);

            // InternalAlf.g:2282:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=58 && LA46_0<=61)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAlf.g:2283:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:2283:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:2284:5: lv_visibility_1_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_37);
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


            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getFeatureMemberElementParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_FeatureMemberElement_2=ruleFeatureMemberElement(current);

            state._fsp--;


            			current = this_FeatureMemberElement_2;
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
    // InternalAlf.g:2316:1: entryRuleAssociationEndFeatureMember returns [EObject current=null] : iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF ;
    public final EObject entryRuleAssociationEndFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEndFeatureMember = null;


        try {
            // InternalAlf.g:2316:68: (iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF )
            // InternalAlf.g:2317:2: iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF
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
    // InternalAlf.g:2323:1: ruleAssociationEndFeatureMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( (otherlv_2= 'end' ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) | ( ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_12_0= ruleName ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) ) ) ;
    public final EObject ruleAssociationEndFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_ownedElement_0_0 = null;

        Enumerator lv_visibility_1_0 = null;

        Enumerator lv_direction_3_0 = null;

        EObject lv_ownedMemberElement_4_0 = null;

        AntlrDatatypeRuleToken lv_memberName_6_0 = null;

        Enumerator lv_direction_10_0 = null;

        EObject lv_ownedMemberElement_11_0 = null;

        AntlrDatatypeRuleToken lv_memberName_12_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2329:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( (otherlv_2= 'end' ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) | ( ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_12_0= ruleName ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) ) ) )
            // InternalAlf.g:2330:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( (otherlv_2= 'end' ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) | ( ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_12_0= ruleName ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) ) )
            {
            // InternalAlf.g:2330:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( (otherlv_2= 'end' ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) | ( ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_12_0= ruleName ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) ) )
            // InternalAlf.g:2331:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( (otherlv_2= 'end' ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) | ( ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_12_0= ruleName ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) )
            {
            // InternalAlf.g:2331:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalAlf.g:2332:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:2332:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:2333:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_38);
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
            	    break loop47;
                }
            } while (true);

            // InternalAlf.g:2350:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=58 && LA48_0<=61)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAlf.g:2351:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:2351:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:2352:5: lv_visibility_1_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_39);
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

            // InternalAlf.g:2369:3: ( (otherlv_2= 'end' ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) | ( ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_12_0= ruleName ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) )
            int alt52=4;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // InternalAlf.g:2370:4: (otherlv_2= 'end' ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2370:4: (otherlv_2= 'end' ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) )
                    // InternalAlf.g:2371:5: otherlv_2= 'end' ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_32); 

                    					newLeafNode(otherlv_2, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_2_0_0());
                    				
                    // InternalAlf.g:2375:5: ( (lv_direction_3_0= ruleFeatureDirection ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( ((LA49_0>=62 && LA49_0<=64)) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalAlf.g:2376:6: (lv_direction_3_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2376:6: (lv_direction_3_0= ruleFeatureDirection )
                            // InternalAlf.g:2377:7: lv_direction_3_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_32);
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

                    // InternalAlf.g:2394:5: ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) )
                    // InternalAlf.g:2395:6: (lv_ownedMemberElement_4_0= ruleFeatureDefinition )
                    {
                    // InternalAlf.g:2395:6: (lv_ownedMemberElement_4_0= ruleFeatureDefinition )
                    // InternalAlf.g:2396:7: lv_ownedMemberElement_4_0= ruleFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getOwnedMemberElementFeatureDefinitionParserRuleCall_2_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_4_0=ruleFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_4_0,
                    								"org.omg.sysml.Alf.FeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2415:4: (otherlv_5= 'end' ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' )
                    {
                    // InternalAlf.g:2415:4: (otherlv_5= 'end' ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' )
                    // InternalAlf.g:2416:5: otherlv_5= 'end' ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';'
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_20); 

                    					newLeafNode(otherlv_5, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_2_1_0());
                    				
                    // InternalAlf.g:2420:5: ( (lv_memberName_6_0= ruleName ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalAlf.g:2421:6: (lv_memberName_6_0= ruleName )
                            {
                            // InternalAlf.g:2421:6: (lv_memberName_6_0= ruleName )
                            // InternalAlf.g:2422:7: lv_memberName_6_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberNameNameParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_21);
                            lv_memberName_6_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
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

                    otherlv_7=(Token)match(input,24,FOLLOW_10); 

                    					newLeafNode(otherlv_7, grammarAccess.getAssociationEndFeatureMemberAccess().getIsKeyword_2_1_2());
                    				
                    // InternalAlf.g:2443:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:2444:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:2444:6: ( ruleQualifiedName )
                    // InternalAlf.g:2445:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberElementFeatureCrossReference_2_1_3_0());
                    						
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_9=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_9, grammarAccess.getAssociationEndFeatureMemberAccess().getSemicolonKeyword_2_1_4());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:2465:4: ( ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2465:4: ( ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:2466:5: ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:2466:5: ( (lv_direction_10_0= ruleFeatureDirection ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( ((LA51_0>=62 && LA51_0<=64)) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalAlf.g:2467:6: (lv_direction_10_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2467:6: (lv_direction_10_0= ruleFeatureDirection )
                            // InternalAlf.g:2468:7: lv_direction_10_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_2_2_0_0());
                            						
                            pushFollow(FOLLOW_22);
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

                    // InternalAlf.g:2485:5: ( (lv_ownedMemberElement_11_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:2486:6: (lv_ownedMemberElement_11_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:2486:6: (lv_ownedMemberElement_11_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:2487:7: lv_ownedMemberElement_11_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getOwnedMemberElementNamedFeatureDefinitionParserRuleCall_2_2_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_11_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_11_0,
                    								"org.omg.sysml.Alf.NamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:2506:4: ( ( (lv_memberName_12_0= ruleName ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' )
                    {
                    // InternalAlf.g:2506:4: ( ( (lv_memberName_12_0= ruleName ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' )
                    // InternalAlf.g:2507:5: ( (lv_memberName_12_0= ruleName ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';'
                    {
                    // InternalAlf.g:2507:5: ( (lv_memberName_12_0= ruleName ) )
                    // InternalAlf.g:2508:6: (lv_memberName_12_0= ruleName )
                    {
                    // InternalAlf.g:2508:6: (lv_memberName_12_0= ruleName )
                    // InternalAlf.g:2509:7: lv_memberName_12_0= ruleName
                    {

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberNameNameParserRuleCall_2_3_0_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_memberName_12_0=ruleName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"memberName",
                    								lv_memberName_12_0,
                    								"org.omg.sysml.Alf.Name");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_13=(Token)match(input,24,FOLLOW_10); 

                    					newLeafNode(otherlv_13, grammarAccess.getAssociationEndFeatureMemberAccess().getIsKeyword_2_3_1());
                    				
                    // InternalAlf.g:2530:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:2531:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:2531:6: ( ruleQualifiedName )
                    // InternalAlf.g:2532:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberElementFeatureCrossReference_2_3_2_0());
                    						
                    pushFollow(FOLLOW_13);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_15=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_15, grammarAccess.getAssociationEndFeatureMemberAccess().getSemicolonKeyword_2_3_3());
                    				

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
    // InternalAlf.g:2556:1: entryRuleFeatureDefinition returns [EObject current=null] : iv_ruleFeatureDefinition= ruleFeatureDefinition EOF ;
    public final EObject entryRuleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDefinition = null;


        try {
            // InternalAlf.g:2556:58: (iv_ruleFeatureDefinition= ruleFeatureDefinition EOF )
            // InternalAlf.g:2557:2: iv_ruleFeatureDefinition= ruleFeatureDefinition EOF
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
    // InternalAlf.g:2563:1: ruleFeatureDefinition returns [EObject current=null] : (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) ;
    public final EObject ruleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_NamedFeatureDefinition_0 = null;

        EObject this_UnnamedFeatureDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2569:2: ( (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) )
            // InternalAlf.g:2570:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            {
            // InternalAlf.g:2570:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt53=1;
            }
            else if ( ((LA53_0>=44 && LA53_0<=45)) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalAlf.g:2571:3: this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:2580:3: this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition
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
    // InternalAlf.g:2592:1: entryRuleNamedFeatureDefinition returns [EObject current=null] : iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF ;
    public final EObject entryRuleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedFeatureDefinition = null;


        try {
            // InternalAlf.g:2592:63: (iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF )
            // InternalAlf.g:2593:2: iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF
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
    // InternalAlf.g:2599:1: ruleNamedFeatureDefinition returns [EObject current=null] : (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureDeclaration_0 = null;

        EObject this_FeatureCompletion_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2605:2: ( (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:2606:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:2606:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] )
            // InternalAlf.g:2607:3: this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getNamedFeatureDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getFeatureDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
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
    // InternalAlf.g:2633:1: entryRuleUnnamedFeatureDefinition returns [EObject current=null] : iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF ;
    public final EObject entryRuleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedFeatureDefinition = null;


        try {
            // InternalAlf.g:2633:65: (iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF )
            // InternalAlf.g:2634:2: iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF
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
    // InternalAlf.g:2640:1: ruleUnnamedFeatureDefinition returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? this_FeatureCompletion_3= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedElement_0_0 = null;

        EObject this_TypePart_1 = null;

        EObject this_Multiplicity_2 = null;

        EObject this_FeatureCompletion_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:2646:2: ( ( ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? this_FeatureCompletion_3= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:2647:2: ( ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? this_FeatureCompletion_3= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:2647:2: ( ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? this_FeatureCompletion_3= ruleFeatureCompletion[$current] )
            // InternalAlf.g:2648:3: ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? this_FeatureCompletion_3= ruleFeatureCompletion[$current]
            {
            // InternalAlf.g:2648:3: ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) )
            // InternalAlf.g:2649:4: (lv_ownedElement_0_0= ruleSubsetOrRedefinition )
            {
            // InternalAlf.g:2649:4: (lv_ownedElement_0_0= ruleSubsetOrRedefinition )
            // InternalAlf.g:2650:5: lv_ownedElement_0_0= ruleSubsetOrRedefinition
            {

            					newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedElementSubsetOrRedefinitionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
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

            // InternalAlf.g:2667:3: (this_TypePart_1= ruleTypePart[$current] )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==36) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAlf.g:2668:4: this_TypePart_1= ruleTypePart[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getUnnamedFeatureDefinitionRule());
                    				}
                    				newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getTypePartParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_42);
                    this_TypePart_1=ruleTypePart(current);

                    state._fsp--;


                    				current = this_TypePart_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalAlf.g:2680:3: (this_Multiplicity_2= ruleMultiplicity[$current] )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==39) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalAlf.g:2681:4: this_Multiplicity_2= ruleMultiplicity[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getUnnamedFeatureDefinitionRule());
                    				}
                    				newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getMultiplicityParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_40);
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
    // InternalAlf.g:2709:1: ruleFeatureBodyDefinition[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_ClassBody_2= ruleClassBody[$current] ) ;
    public final EObject ruleFeatureBodyDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject this_FeatureDeclaration_1 = null;

        EObject this_ClassBody_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2715:2: ( (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_ClassBody_2= ruleClassBody[$current] ) )
            // InternalAlf.g:2716:2: (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_ClassBody_2= ruleClassBody[$current] )
            {
            // InternalAlf.g:2716:2: (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_ClassBody_2= ruleClassBody[$current] )
            // InternalAlf.g:2717:3: otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_ClassBody_2= ruleClassBody[$current]
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
    // InternalAlf.g:2748:1: ruleFeatureDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? ( (lv_ownedElement_3_0= ruleSubsetOrRedefinition ) )? ) ;
    public final EObject ruleFeatureDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject this_TypePart_1 = null;

        EObject this_Multiplicity_2 = null;

        EObject lv_ownedElement_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2754:2: ( ( ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? ( (lv_ownedElement_3_0= ruleSubsetOrRedefinition ) )? ) )
            // InternalAlf.g:2755:2: ( ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? ( (lv_ownedElement_3_0= ruleSubsetOrRedefinition ) )? )
            {
            // InternalAlf.g:2755:2: ( ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? ( (lv_ownedElement_3_0= ruleSubsetOrRedefinition ) )? )
            // InternalAlf.g:2756:3: ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? (this_Multiplicity_2= ruleMultiplicity[$current] )? ( (lv_ownedElement_3_0= ruleSubsetOrRedefinition ) )?
            {
            // InternalAlf.g:2756:3: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:2757:4: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:2757:4: (lv_name_0_0= ruleName )
            // InternalAlf.g:2758:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalAlf.g:2775:3: (this_TypePart_1= ruleTypePart[$current] )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==36) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalAlf.g:2776:4: this_TypePart_1= ruleTypePart[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getFeatureDeclarationRule());
                    				}
                    				newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getTypePartParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_44);
                    this_TypePart_1=ruleTypePart(current);

                    state._fsp--;


                    				current = this_TypePart_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalAlf.g:2788:3: (this_Multiplicity_2= ruleMultiplicity[$current] )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==39) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalAlf.g:2789:4: this_Multiplicity_2= ruleMultiplicity[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getFeatureDeclarationRule());
                    				}
                    				newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getMultiplicityParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_45);
                    this_Multiplicity_2=ruleMultiplicity(current);

                    state._fsp--;


                    				current = this_Multiplicity_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalAlf.g:2801:3: ( (lv_ownedElement_3_0= ruleSubsetOrRedefinition ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=44 && LA58_0<=45)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAlf.g:2802:4: (lv_ownedElement_3_0= ruleSubsetOrRedefinition )
                    {
                    // InternalAlf.g:2802:4: (lv_ownedElement_3_0= ruleSubsetOrRedefinition )
                    // InternalAlf.g:2803:5: lv_ownedElement_3_0= ruleSubsetOrRedefinition
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
    // InternalAlf.g:2825:1: ruleFeatureCompletion[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) ) )? (otherlv_2= ';' | this_ClassBody_3= ruleClassBody[$current] ) ) ;
    public final EObject ruleFeatureCompletion(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;

        EObject this_ClassBody_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:2831:2: ( ( (otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) ) )? (otherlv_2= ';' | this_ClassBody_3= ruleClassBody[$current] ) ) )
            // InternalAlf.g:2832:2: ( (otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) ) )? (otherlv_2= ';' | this_ClassBody_3= ruleClassBody[$current] ) )
            {
            // InternalAlf.g:2832:2: ( (otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) ) )? (otherlv_2= ';' | this_ClassBody_3= ruleClassBody[$current] ) )
            // InternalAlf.g:2833:3: (otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) ) )? (otherlv_2= ';' | this_ClassBody_3= ruleClassBody[$current] )
            {
            // InternalAlf.g:2833:3: (otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==35) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalAlf.g:2834:4: otherlv_0= '=' ( (lv_value_1_0= ruleExpression ) )
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_46); 

                    				newLeafNode(otherlv_0, grammarAccess.getFeatureCompletionAccess().getEqualsSignKeyword_0_0());
                    			
                    // InternalAlf.g:2838:4: ( (lv_value_1_0= ruleExpression ) )
                    // InternalAlf.g:2839:5: (lv_value_1_0= ruleExpression )
                    {
                    // InternalAlf.g:2839:5: (lv_value_1_0= ruleExpression )
                    // InternalAlf.g:2840:6: lv_value_1_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getFeatureCompletionAccess().getValueExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_47);
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

            // InternalAlf.g:2858:3: (otherlv_2= ';' | this_ClassBody_3= ruleClassBody[$current] )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==19) ) {
                alt60=1;
            }
            else if ( (LA60_0==22) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalAlf.g:2859:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getFeatureCompletionAccess().getSemicolonKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalAlf.g:2864:4: this_ClassBody_3= ruleClassBody[$current]
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
    // InternalAlf.g:2881:1: ruleTypePart[EObject in_current] returns [EObject current=in_current] : (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_3= 'any' ) ) ;
    public final EObject ruleTypePart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_isComposite_1_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAlf.g:2887:2: ( (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_3= 'any' ) ) )
            // InternalAlf.g:2888:2: (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_3= 'any' ) )
            {
            // InternalAlf.g:2888:2: (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_3= 'any' ) )
            // InternalAlf.g:2889:3: otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_3= 'any' )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getTypePartAccess().getColonKeyword_0());
            		
            // InternalAlf.g:2893:3: ( (lv_isComposite_1_0= 'compose' ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==37) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalAlf.g:2894:4: (lv_isComposite_1_0= 'compose' )
                    {
                    // InternalAlf.g:2894:4: (lv_isComposite_1_0= 'compose' )
                    // InternalAlf.g:2895:5: lv_isComposite_1_0= 'compose'
                    {
                    lv_isComposite_1_0=(Token)match(input,37,FOLLOW_49); 

                    					newLeafNode(lv_isComposite_1_0, grammarAccess.getTypePartAccess().getIsCompositeComposeKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypePartRule());
                    					}
                    					setWithLastConsumed(current, "isComposite", true, "compose");
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:2907:3: ( ( ( ruleQualifiedName ) ) | otherlv_3= 'any' )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt62=1;
            }
            else if ( (LA62_0==38) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalAlf.g:2908:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalAlf.g:2908:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:2909:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:2909:5: ( ruleQualifiedName )
                    // InternalAlf.g:2910:6: ruleQualifiedName
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
                    // InternalAlf.g:2925:4: otherlv_3= 'any'
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
    // InternalAlf.g:2935:1: ruleMultiplicity[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) ) ) ;
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
            // InternalAlf.g:2941:2: ( (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) ) ) )
            // InternalAlf.g:2942:2: (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) ) )
            {
            // InternalAlf.g:2942:2: (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) ) )
            // InternalAlf.g:2943:3: otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAlf.g:2947:3: ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_NATURAL_VALUE) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==40) ) {
                    alt63=1;
                }
            }
            switch (alt63) {
                case 1 :
                    // InternalAlf.g:2948:4: ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..'
                    {
                    // InternalAlf.g:2948:4: ( (lv_lower_1_0= ruleNaturalLiteralExpression ) )
                    // InternalAlf.g:2949:5: (lv_lower_1_0= ruleNaturalLiteralExpression )
                    {
                    // InternalAlf.g:2949:5: (lv_lower_1_0= ruleNaturalLiteralExpression )
                    // InternalAlf.g:2950:6: lv_lower_1_0= ruleNaturalLiteralExpression
                    {

                    						newCompositeNode(grammarAccess.getMultiplicityAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_51);
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

                    otherlv_2=(Token)match(input,40,FOLLOW_50); 

                    				newLeafNode(otherlv_2, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalAlf.g:2972:3: ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:2973:4: (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:2973:4: (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:2974:5: lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression
            {

            					newCompositeNode(grammarAccess.getMultiplicityAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_52);
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

            otherlv_4=(Token)match(input,41,FOLLOW_53); 

            			newLeafNode(otherlv_4, grammarAccess.getMultiplicityAccess().getRightSquareBracketKeyword_3());
            		
            // InternalAlf.g:2995:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) ) )
            // InternalAlf.g:2996:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) )
            {
            // InternalAlf.g:2996:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* ) )
            // InternalAlf.g:2997:5: ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4());
            				
            // InternalAlf.g:3000:5: ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )* )
            // InternalAlf.g:3001:6: ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )*
            {
            // InternalAlf.g:3001:6: ( ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) ) )*
            loop64:
            do {
                int alt64=3;
                int LA64_0 = input.LA(1);

                if ( LA64_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4(), 0) ) {
                    alt64=1;
                }
                else if ( LA64_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4(), 1) ) {
                    alt64=2;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalAlf.g:3002:4: ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) )
            	    {
            	    // InternalAlf.g:3002:4: ({...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) ) )
            	    // InternalAlf.g:3003:5: {...}? => ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMultiplicity", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalAlf.g:3003:109: ( ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) ) )
            	    // InternalAlf.g:3004:6: ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalAlf.g:3007:9: ({...}? => ( (lv_isOrdered_6_0= 'ordered' ) ) )
            	    // InternalAlf.g:3007:10: {...}? => ( (lv_isOrdered_6_0= 'ordered' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiplicity", "true");
            	    }
            	    // InternalAlf.g:3007:19: ( (lv_isOrdered_6_0= 'ordered' ) )
            	    // InternalAlf.g:3007:20: (lv_isOrdered_6_0= 'ordered' )
            	    {
            	    // InternalAlf.g:3007:20: (lv_isOrdered_6_0= 'ordered' )
            	    // InternalAlf.g:3008:10: lv_isOrdered_6_0= 'ordered'
            	    {
            	    lv_isOrdered_6_0=(Token)match(input,42,FOLLOW_53); 

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
            	    // InternalAlf.g:3025:4: ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) )
            	    {
            	    // InternalAlf.g:3025:4: ({...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) ) )
            	    // InternalAlf.g:3026:5: {...}? => ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMultiplicity", "getUnorderedGroupHelper().canSelect(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalAlf.g:3026:109: ( ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) ) )
            	    // InternalAlf.g:3027:6: ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMultiplicityAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalAlf.g:3030:9: ({...}? => ( (lv_isNonunique_7_0= 'nonunique' ) ) )
            	    // InternalAlf.g:3030:10: {...}? => ( (lv_isNonunique_7_0= 'nonunique' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMultiplicity", "true");
            	    }
            	    // InternalAlf.g:3030:19: ( (lv_isNonunique_7_0= 'nonunique' ) )
            	    // InternalAlf.g:3030:20: (lv_isNonunique_7_0= 'nonunique' )
            	    {
            	    // InternalAlf.g:3030:20: (lv_isNonunique_7_0= 'nonunique' )
            	    // InternalAlf.g:3031:10: lv_isNonunique_7_0= 'nonunique'
            	    {
            	    lv_isNonunique_7_0=(Token)match(input,43,FOLLOW_53); 

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
            	    break loop64;
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
    // InternalAlf.g:3059:1: entryRuleSubsetOrRedefinition returns [EObject current=null] : iv_ruleSubsetOrRedefinition= ruleSubsetOrRedefinition EOF ;
    public final EObject entryRuleSubsetOrRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsetOrRedefinition = null;


        try {
            // InternalAlf.g:3059:61: (iv_ruleSubsetOrRedefinition= ruleSubsetOrRedefinition EOF )
            // InternalAlf.g:3060:2: iv_ruleSubsetOrRedefinition= ruleSubsetOrRedefinition EOF
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
    // InternalAlf.g:3066:1: ruleSubsetOrRedefinition returns [EObject current=null] : ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition ) ) ;
    public final EObject ruleSubsetOrRedefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Subset_1 = null;

        EObject this_Redefinition_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:3072:2: ( ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition ) ) )
            // InternalAlf.g:3073:2: ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition ) )
            {
            // InternalAlf.g:3073:2: ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==44) ) {
                alt65=1;
            }
            else if ( (LA65_0==45) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalAlf.g:3074:3: (otherlv_0= 'subsets' this_Subset_1= ruleSubset )
                    {
                    // InternalAlf.g:3074:3: (otherlv_0= 'subsets' this_Subset_1= ruleSubset )
                    // InternalAlf.g:3075:4: otherlv_0= 'subsets' this_Subset_1= ruleSubset
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_10); 

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
                    // InternalAlf.g:3089:3: (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition )
                    {
                    // InternalAlf.g:3089:3: (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition )
                    // InternalAlf.g:3090:4: otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_10); 

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
    // InternalAlf.g:3107:1: entryRuleRedefinition returns [EObject current=null] : iv_ruleRedefinition= ruleRedefinition EOF ;
    public final EObject entryRuleRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefinition = null;


        try {
            // InternalAlf.g:3107:53: (iv_ruleRedefinition= ruleRedefinition EOF )
            // InternalAlf.g:3108:2: iv_ruleRedefinition= ruleRedefinition EOF
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
    // InternalAlf.g:3114:1: ruleRedefinition returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleRedefinition() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:3120:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:3121:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:3121:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3122:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:3122:3: ( ruleQualifiedName )
            // InternalAlf.g:3123:4: ruleQualifiedName
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
    // InternalAlf.g:3140:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalAlf.g:3140:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalAlf.g:3141:2: iv_ruleSubset= ruleSubset EOF
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
    // InternalAlf.g:3147:1: ruleSubset returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubset() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:3153:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:3154:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:3154:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3155:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:3155:3: ( ruleQualifiedName )
            // InternalAlf.g:3156:4: ruleQualifiedName
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
    // InternalAlf.g:3173:1: entryRuleConnectorDefinition returns [EObject current=null] : iv_ruleConnectorDefinition= ruleConnectorDefinition EOF ;
    public final EObject entryRuleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorDefinition = null;


        try {
            // InternalAlf.g:3173:60: (iv_ruleConnectorDefinition= ruleConnectorDefinition EOF )
            // InternalAlf.g:3174:2: iv_ruleConnectorDefinition= ruleConnectorDefinition EOF
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
    // InternalAlf.g:3180:1: ruleConnectorDefinition returns [EObject current=null] : ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) otherlv_7= ';' ) | ( ( (lv_name_8_0= ruleName ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) )? otherlv_11= '(' ( (lv_connectorEnd_12_0= ruleConnectorEnd ) ) otherlv_13= ',' ( (lv_connectorEnd_14_0= ruleConnectorEnd ) ) (otherlv_15= ',' ( (lv_connectorEnd_16_0= ruleConnectorEnd ) ) )* otherlv_17= ')' otherlv_18= ';' ) ) ;
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
            // InternalAlf.g:3186:2: ( ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) otherlv_7= ';' ) | ( ( (lv_name_8_0= ruleName ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) )? otherlv_11= '(' ( (lv_connectorEnd_12_0= ruleConnectorEnd ) ) otherlv_13= ',' ( (lv_connectorEnd_14_0= ruleConnectorEnd ) ) (otherlv_15= ',' ( (lv_connectorEnd_16_0= ruleConnectorEnd ) ) )* otherlv_17= ')' otherlv_18= ';' ) ) )
            // InternalAlf.g:3187:2: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) otherlv_7= ';' ) | ( ( (lv_name_8_0= ruleName ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) )? otherlv_11= '(' ( (lv_connectorEnd_12_0= ruleConnectorEnd ) ) otherlv_13= ',' ( (lv_connectorEnd_14_0= ruleConnectorEnd ) ) (otherlv_15= ',' ( (lv_connectorEnd_16_0= ruleConnectorEnd ) ) )* otherlv_17= ')' otherlv_18= ';' ) )
            {
            // InternalAlf.g:3187:2: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) otherlv_7= ';' ) | ( ( (lv_name_8_0= ruleName ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) )? otherlv_11= '(' ( (lv_connectorEnd_12_0= ruleConnectorEnd ) ) otherlv_13= ',' ( (lv_connectorEnd_14_0= ruleConnectorEnd ) ) (otherlv_15= ',' ( (lv_connectorEnd_16_0= ruleConnectorEnd ) ) )* otherlv_17= ')' otherlv_18= ';' ) )
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // InternalAlf.g:3188:3: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) otherlv_7= ';' )
                    {
                    // InternalAlf.g:3188:3: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) otherlv_7= ';' )
                    // InternalAlf.g:3189:4: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) otherlv_7= ';'
                    {
                    // InternalAlf.g:3189:4: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )?
                    int alt68=2;
                    alt68 = dfa68.predict(input);
                    switch (alt68) {
                        case 1 :
                            // InternalAlf.g:3190:5: ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is'
                            {
                            // InternalAlf.g:3190:5: ( (lv_name_0_0= ruleName ) )?
                            int alt66=2;
                            int LA66_0 = input.LA(1);

                            if ( ((LA66_0>=RULE_ID && LA66_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt66=1;
                            }
                            switch (alt66) {
                                case 1 :
                                    // InternalAlf.g:3191:6: (lv_name_0_0= ruleName )
                                    {
                                    // InternalAlf.g:3191:6: (lv_name_0_0= ruleName )
                                    // InternalAlf.g:3192:7: lv_name_0_0= ruleName
                                    {

                                    							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_0_0_0_0());
                                    						
                                    pushFollow(FOLLOW_54);
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

                            // InternalAlf.g:3209:5: (otherlv_1= ':' ( ( ruleQualifiedName ) ) )?
                            int alt67=2;
                            int LA67_0 = input.LA(1);

                            if ( (LA67_0==36) ) {
                                alt67=1;
                            }
                            switch (alt67) {
                                case 1 :
                                    // InternalAlf.g:3210:6: otherlv_1= ':' ( ( ruleQualifiedName ) )
                                    {
                                    otherlv_1=(Token)match(input,36,FOLLOW_10); 

                                    						newLeafNode(otherlv_1, grammarAccess.getConnectorDefinitionAccess().getColonKeyword_0_0_1_0());
                                    					
                                    // InternalAlf.g:3214:6: ( ( ruleQualifiedName ) )
                                    // InternalAlf.g:3215:7: ( ruleQualifiedName )
                                    {
                                    // InternalAlf.g:3215:7: ( ruleQualifiedName )
                                    // InternalAlf.g:3216:8: ruleQualifiedName
                                    {

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getConnectorDefinitionRule());
                                    								}
                                    							

                                    								newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getAssociationAssociationCrossReference_0_0_1_1_0());
                                    							
                                    pushFollow(FOLLOW_21);
                                    ruleQualifiedName();

                                    state._fsp--;


                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }


                                    }
                                    break;

                            }

                            otherlv_3=(Token)match(input,24,FOLLOW_55); 

                            					newLeafNode(otherlv_3, grammarAccess.getConnectorDefinitionAccess().getIsKeyword_0_0_2());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:3236:4: ( (lv_connectorEnd_4_0= ruleConnectorEnd ) )
                    // InternalAlf.g:3237:5: (lv_connectorEnd_4_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:3237:5: (lv_connectorEnd_4_0= ruleConnectorEnd )
                    // InternalAlf.g:3238:6: lv_connectorEnd_4_0= ruleConnectorEnd
                    {

                    						newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_56);
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

                    otherlv_5=(Token)match(input,46,FOLLOW_55); 

                    				newLeafNode(otherlv_5, grammarAccess.getConnectorDefinitionAccess().getToKeyword_0_2());
                    			
                    // InternalAlf.g:3259:4: ( (lv_connectorEnd_6_0= ruleConnectorEnd ) )
                    // InternalAlf.g:3260:5: (lv_connectorEnd_6_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:3260:5: (lv_connectorEnd_6_0= ruleConnectorEnd )
                    // InternalAlf.g:3261:6: lv_connectorEnd_6_0= ruleConnectorEnd
                    {

                    						newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_13);
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
                    // InternalAlf.g:3284:3: ( ( (lv_name_8_0= ruleName ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) )? otherlv_11= '(' ( (lv_connectorEnd_12_0= ruleConnectorEnd ) ) otherlv_13= ',' ( (lv_connectorEnd_14_0= ruleConnectorEnd ) ) (otherlv_15= ',' ( (lv_connectorEnd_16_0= ruleConnectorEnd ) ) )* otherlv_17= ')' otherlv_18= ';' )
                    {
                    // InternalAlf.g:3284:3: ( ( (lv_name_8_0= ruleName ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) )? otherlv_11= '(' ( (lv_connectorEnd_12_0= ruleConnectorEnd ) ) otherlv_13= ',' ( (lv_connectorEnd_14_0= ruleConnectorEnd ) ) (otherlv_15= ',' ( (lv_connectorEnd_16_0= ruleConnectorEnd ) ) )* otherlv_17= ')' otherlv_18= ';' )
                    // InternalAlf.g:3285:4: ( (lv_name_8_0= ruleName ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) )? otherlv_11= '(' ( (lv_connectorEnd_12_0= ruleConnectorEnd ) ) otherlv_13= ',' ( (lv_connectorEnd_14_0= ruleConnectorEnd ) ) (otherlv_15= ',' ( (lv_connectorEnd_16_0= ruleConnectorEnd ) ) )* otherlv_17= ')' otherlv_18= ';'
                    {
                    // InternalAlf.g:3285:4: ( (lv_name_8_0= ruleName ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( ((LA69_0>=RULE_ID && LA69_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalAlf.g:3286:5: (lv_name_8_0= ruleName )
                            {
                            // InternalAlf.g:3286:5: (lv_name_8_0= ruleName )
                            // InternalAlf.g:3287:6: lv_name_8_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_1_0_0());
                            					
                            pushFollow(FOLLOW_57);
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

                    // InternalAlf.g:3304:4: (otherlv_9= ':' ( ( ruleQualifiedName ) ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==36) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalAlf.g:3305:5: otherlv_9= ':' ( ( ruleQualifiedName ) )
                            {
                            otherlv_9=(Token)match(input,36,FOLLOW_10); 

                            					newLeafNode(otherlv_9, grammarAccess.getConnectorDefinitionAccess().getColonKeyword_1_1_0());
                            				
                            // InternalAlf.g:3309:5: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:3310:6: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:3310:6: ( ruleQualifiedName )
                            // InternalAlf.g:3311:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConnectorDefinitionRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getAssociationAssociationCrossReference_1_1_1_0());
                            						
                            pushFollow(FOLLOW_58);
                            ruleQualifiedName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,47,FOLLOW_55); 

                    				newLeafNode(otherlv_11, grammarAccess.getConnectorDefinitionAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalAlf.g:3330:4: ( (lv_connectorEnd_12_0= ruleConnectorEnd ) )
                    // InternalAlf.g:3331:5: (lv_connectorEnd_12_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:3331:5: (lv_connectorEnd_12_0= ruleConnectorEnd )
                    // InternalAlf.g:3332:6: lv_connectorEnd_12_0= ruleConnectorEnd
                    {

                    						newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_59);
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

                    otherlv_13=(Token)match(input,30,FOLLOW_55); 

                    				newLeafNode(otherlv_13, grammarAccess.getConnectorDefinitionAccess().getCommaKeyword_1_4());
                    			
                    // InternalAlf.g:3353:4: ( (lv_connectorEnd_14_0= ruleConnectorEnd ) )
                    // InternalAlf.g:3354:5: (lv_connectorEnd_14_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:3354:5: (lv_connectorEnd_14_0= ruleConnectorEnd )
                    // InternalAlf.g:3355:6: lv_connectorEnd_14_0= ruleConnectorEnd
                    {

                    						newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_60);
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

                    // InternalAlf.g:3372:4: (otherlv_15= ',' ( (lv_connectorEnd_16_0= ruleConnectorEnd ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==30) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalAlf.g:3373:5: otherlv_15= ',' ( (lv_connectorEnd_16_0= ruleConnectorEnd ) )
                    	    {
                    	    otherlv_15=(Token)match(input,30,FOLLOW_55); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getConnectorDefinitionAccess().getCommaKeyword_1_6_0());
                    	    				
                    	    // InternalAlf.g:3377:5: ( (lv_connectorEnd_16_0= ruleConnectorEnd ) )
                    	    // InternalAlf.g:3378:6: (lv_connectorEnd_16_0= ruleConnectorEnd )
                    	    {
                    	    // InternalAlf.g:3378:6: (lv_connectorEnd_16_0= ruleConnectorEnd )
                    	    // InternalAlf.g:3379:7: lv_connectorEnd_16_0= ruleConnectorEnd
                    	    {

                    	    							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_1_6_1_0());
                    	    						
                    	    pushFollow(FOLLOW_60);
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
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,48,FOLLOW_13); 

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
    // InternalAlf.g:3410:1: entryRuleConnectorEnd returns [EObject current=null] : iv_ruleConnectorEnd= ruleConnectorEnd EOF ;
    public final EObject entryRuleConnectorEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorEnd = null;


        try {
            // InternalAlf.g:3410:53: (iv_ruleConnectorEnd= ruleConnectorEnd EOF )
            // InternalAlf.g:3411:2: iv_ruleConnectorEnd= ruleConnectorEnd EOF
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
    // InternalAlf.g:3417:1: ruleConnectorEnd returns [EObject current=null] : ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_3= ruleConnectorEndMultiplicity[$current] )? ) | ( ( ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleConnectorEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject this_ConnectorEndMultiplicity_3 = null;

        EObject this_ConnectorEndMultiplicity_5 = null;



        	enterRule();

        try {
            // InternalAlf.g:3423:2: ( ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_3= ruleConnectorEndMultiplicity[$current] )? ) | ( ( ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) ) )
            // InternalAlf.g:3424:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_3= ruleConnectorEndMultiplicity[$current] )? ) | ( ( ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )
            {
            // InternalAlf.g:3424:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_3= ruleConnectorEndMultiplicity[$current] )? ) | ( ( ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // InternalAlf.g:3425:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_3= ruleConnectorEndMultiplicity[$current] )? )
                    {
                    // InternalAlf.g:3425:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_3= ruleConnectorEndMultiplicity[$current] )? )
                    // InternalAlf.g:3426:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_3= ruleConnectorEndMultiplicity[$current] )?
                    {
                    // InternalAlf.g:3426:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )?
                    int alt73=2;
                    alt73 = dfa73.predict(input);
                    switch (alt73) {
                        case 1 :
                            // InternalAlf.g:3427:5: ( ( ruleQualifiedName ) ) otherlv_1= ':'
                            {
                            // InternalAlf.g:3427:5: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:3428:6: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:3428:6: ( ruleQualifiedName )
                            // InternalAlf.g:3429:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConnectorEndRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getConnectorEndAccess().getEndFeatureCrossReference_0_0_0_0());
                            						
                            pushFollow(FOLLOW_61);
                            ruleQualifiedName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_1=(Token)match(input,36,FOLLOW_10); 

                            					newLeafNode(otherlv_1, grammarAccess.getConnectorEndAccess().getColonKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:3448:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:3449:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:3449:5: ( ruleQualifiedName )
                    // InternalAlf.g:3450:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectorEndRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConnectorEndAccess().getFeatureFeatureCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_62);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:3464:4: (this_ConnectorEndMultiplicity_3= ruleConnectorEndMultiplicity[$current] )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==39) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalAlf.g:3465:5: this_ConnectorEndMultiplicity_3= ruleConnectorEndMultiplicity[$current]
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
                    // InternalAlf.g:3479:3: ( ( ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalAlf.g:3479:3: ( ( ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) )
                    // InternalAlf.g:3480:4: ( ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) )
                    {
                    // InternalAlf.g:3480:4: ( ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )? otherlv_6= '=>' )
                    // InternalAlf.g:3481:5: ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )? otherlv_6= '=>'
                    {
                    // InternalAlf.g:3481:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:3482:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:3482:6: ( ruleQualifiedName )
                    // InternalAlf.g:3483:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConnectorEndRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getConnectorEndAccess().getEndFeatureCrossReference_1_0_0_0());
                    						
                    pushFollow(FOLLOW_63);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:3497:5: (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==39) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalAlf.g:3498:6: this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current]
                            {

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getConnectorEndRule());
                            						}
                            						newCompositeNode(grammarAccess.getConnectorEndAccess().getConnectorEndMultiplicityParserRuleCall_1_0_1());
                            					
                            pushFollow(FOLLOW_64);
                            this_ConnectorEndMultiplicity_5=ruleConnectorEndMultiplicity(current);

                            state._fsp--;


                            						current = this_ConnectorEndMultiplicity_5;
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,49,FOLLOW_10); 

                    					newLeafNode(otherlv_6, grammarAccess.getConnectorEndAccess().getEqualsSignGreaterThanSignKeyword_1_0_2());
                    				

                    }

                    // InternalAlf.g:3515:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:3516:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:3516:5: ( ruleQualifiedName )
                    // InternalAlf.g:3517:6: ruleQualifiedName
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
    // InternalAlf.g:3537:1: ruleConnectorEndMultiplicity[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ) ;
    public final EObject ruleConnectorEndMultiplicity(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lower_1_0 = null;

        EObject lv_upper_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3543:2: ( (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ) )
            // InternalAlf.g:3544:2: (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' )
            {
            // InternalAlf.g:3544:2: (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' )
            // InternalAlf.g:3545:3: otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectorEndMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAlf.g:3549:3: ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_NATURAL_VALUE) ) {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==40) ) {
                    alt77=1;
                }
            }
            switch (alt77) {
                case 1 :
                    // InternalAlf.g:3550:4: ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..'
                    {
                    // InternalAlf.g:3550:4: ( (lv_lower_1_0= ruleNaturalLiteralExpression ) )
                    // InternalAlf.g:3551:5: (lv_lower_1_0= ruleNaturalLiteralExpression )
                    {
                    // InternalAlf.g:3551:5: (lv_lower_1_0= ruleNaturalLiteralExpression )
                    // InternalAlf.g:3552:6: lv_lower_1_0= ruleNaturalLiteralExpression
                    {

                    						newCompositeNode(grammarAccess.getConnectorEndMultiplicityAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_51);
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

                    otherlv_2=(Token)match(input,40,FOLLOW_50); 

                    				newLeafNode(otherlv_2, grammarAccess.getConnectorEndMultiplicityAccess().getFullStopFullStopKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalAlf.g:3574:3: ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:3575:4: (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:3575:4: (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:3576:5: lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression
            {

            					newCompositeNode(grammarAccess.getConnectorEndMultiplicityAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_52);
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
    // InternalAlf.g:3601:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAlf.g:3601:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAlf.g:3602:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAlf.g:3608:1: ruleExpression returns [EObject current=null] : this_BinaryExpression_0= ruleBinaryExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3614:2: (this_BinaryExpression_0= ruleBinaryExpression )
            // InternalAlf.g:3615:2: this_BinaryExpression_0= ruleBinaryExpression
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
    // InternalAlf.g:3626:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalAlf.g:3626:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalAlf.g:3627:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalAlf.g:3633:1: ruleBinaryExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) ;
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
            // InternalAlf.g:3639:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) )
            // InternalAlf.g:3640:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            {
            // InternalAlf.g:3640:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            // InternalAlf.g:3641:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            {

            			newCompositeNode(grammarAccess.getBinaryExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_65);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3649:3: ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==18||(LA79_0>=50 && LA79_0<=54)) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalAlf.g:3650:4: () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    {
                    // InternalAlf.g:3650:4: ()
                    // InternalAlf.g:3651:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:3657:4: ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==18||(LA78_0>=51 && LA78_0<=54)) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==50) ) {
                        alt78=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }
                    switch (alt78) {
                        case 1 :
                            // InternalAlf.g:3658:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            {
                            // InternalAlf.g:3658:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            // InternalAlf.g:3659:6: ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) )
                            {
                            // InternalAlf.g:3659:6: ( (lv_operator_2_0= ruleBinaryOperator ) )
                            // InternalAlf.g:3660:7: (lv_operator_2_0= ruleBinaryOperator )
                            {
                            // InternalAlf.g:3660:7: (lv_operator_2_0= ruleBinaryOperator )
                            // InternalAlf.g:3661:8: lv_operator_2_0= ruleBinaryOperator
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorParserRuleCall_1_1_0_0_0());
                            							
                            pushFollow(FOLLOW_46);
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

                            // InternalAlf.g:3678:6: ( (lv_operand_3_0= ruleExpression ) )
                            // InternalAlf.g:3679:7: (lv_operand_3_0= ruleExpression )
                            {
                            // InternalAlf.g:3679:7: (lv_operand_3_0= ruleExpression )
                            // InternalAlf.g:3680:8: lv_operand_3_0= ruleExpression
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
                            // InternalAlf.g:3699:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            {
                            // InternalAlf.g:3699:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            // InternalAlf.g:3700:6: ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']'
                            {
                            // InternalAlf.g:3700:6: ( (lv_operator_4_0= '@' ) )
                            // InternalAlf.g:3701:7: (lv_operator_4_0= '@' )
                            {
                            // InternalAlf.g:3701:7: (lv_operator_4_0= '@' )
                            // InternalAlf.g:3702:8: lv_operator_4_0= '@'
                            {
                            lv_operator_4_0=(Token)match(input,50,FOLLOW_66); 

                            								newLeafNode(lv_operator_4_0, grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getBinaryExpressionRule());
                            								}
                            								setWithLastConsumed(current, "operator", lv_operator_4_0, "@");
                            							

                            }


                            }

                            otherlv_5=(Token)match(input,39,FOLLOW_46); 

                            						newLeafNode(otherlv_5, grammarAccess.getBinaryExpressionAccess().getLeftSquareBracketKeyword_1_1_1_1());
                            					
                            // InternalAlf.g:3718:6: ( (lv_operand_6_0= ruleExpression ) )
                            // InternalAlf.g:3719:7: (lv_operand_6_0= ruleExpression )
                            {
                            // InternalAlf.g:3719:7: (lv_operand_6_0= ruleExpression )
                            // InternalAlf.g:3720:8: lv_operand_6_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperandExpressionParserRuleCall_1_1_1_2_0());
                            							
                            pushFollow(FOLLOW_52);
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
    // InternalAlf.g:3748:1: entryRuleBinaryOperator returns [String current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final String entryRuleBinaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperator = null;


        try {
            // InternalAlf.g:3748:54: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // InternalAlf.g:3749:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
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
    // InternalAlf.g:3755:1: ruleBinaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:3761:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) )
            // InternalAlf.g:3762:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            {
            // InternalAlf.g:3762:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            int alt80=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt80=1;
                }
                break;
            case 52:
                {
                alt80=2;
                }
                break;
            case 18:
                {
                alt80=3;
                }
                break;
            case 53:
                {
                alt80=4;
                }
                break;
            case 54:
                {
                alt80=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalAlf.g:3763:3: kw= '+'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3769:3: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:3775:3: kw= '*'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:3781:3: kw= '/'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:3787:3: kw= '^'
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
    // InternalAlf.g:3796:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlf.g:3796:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlf.g:3797:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalAlf.g:3803:1: ruleUnaryExpression returns [EObject current=null] : (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceAccessExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3809:2: ( (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) )
            // InternalAlf.g:3810:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            {
            // InternalAlf.g:3810:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=RULE_BOOLEAN_VALUE && LA81_0<=RULE_UNRESTRICTED_NAME)||(LA81_0>=17 && LA81_0<=18)||LA81_0==22||LA81_0==47||LA81_0==55) ) {
                alt81=1;
            }
            else if ( ((LA81_0>=51 && LA81_0<=52)) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalAlf.g:3811:3: this_SequenceAccessExpression_0= ruleSequenceAccessExpression
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
                    // InternalAlf.g:3820:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    {
                    // InternalAlf.g:3820:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    // InternalAlf.g:3821:4: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    {
                    // InternalAlf.g:3821:4: ()
                    // InternalAlf.g:3822:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:3828:4: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // InternalAlf.g:3829:5: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // InternalAlf.g:3829:5: (lv_operator_2_0= ruleUnaryOperator )
                    // InternalAlf.g:3830:6: lv_operator_2_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_67);
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

                    // InternalAlf.g:3847:4: ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    // InternalAlf.g:3848:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    {
                    // InternalAlf.g:3848:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    // InternalAlf.g:3849:6: lv_operand_3_0= ruleSequenceAccessExpression
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
    // InternalAlf.g:3871:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalAlf.g:3871:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalAlf.g:3872:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalAlf.g:3878:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:3884:2: ( (kw= '+' | kw= '-' ) )
            // InternalAlf.g:3885:2: (kw= '+' | kw= '-' )
            {
            // InternalAlf.g:3885:2: (kw= '+' | kw= '-' )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==51) ) {
                alt82=1;
            }
            else if ( (LA82_0==52) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalAlf.g:3886:3: kw= '+'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3892:3: kw= '-'
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
    // InternalAlf.g:3901:1: entryRuleSequenceAccessExpression returns [EObject current=null] : iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF ;
    public final EObject entryRuleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceAccessExpression = null;


        try {
            // InternalAlf.g:3901:65: (iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF )
            // InternalAlf.g:3902:2: iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF
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
    // InternalAlf.g:3908:1: ruleSequenceAccessExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) ;
    public final EObject ruleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_index_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3914:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) )
            // InternalAlf.g:3915:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            {
            // InternalAlf.g:3915:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            // InternalAlf.g:3916:3: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            {

            			newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_62);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3924:3: ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==39) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalAlf.g:3925:4: () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    // InternalAlf.g:3925:4: ()
            	    // InternalAlf.g:3926:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSequenceAccessExpressionAccess().getSequenceAccessExpressionPrimaryAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_46); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSequenceAccessExpressionAccess().getLeftSquareBracketKeyword_1_1());
            	    			
            	    // InternalAlf.g:3936:4: ( (lv_index_3_0= ruleExpression ) )
            	    // InternalAlf.g:3937:5: (lv_index_3_0= ruleExpression )
            	    {
            	    // InternalAlf.g:3937:5: (lv_index_3_0= ruleExpression )
            	    // InternalAlf.g:3938:6: lv_index_3_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getIndexExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_52);
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

            	    otherlv_4=(Token)match(input,41,FOLLOW_62); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSequenceAccessExpressionAccess().getRightSquareBracketKeyword_1_3());
            	    			

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
    // $ANTLR end "ruleSequenceAccessExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalAlf.g:3964:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalAlf.g:3964:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalAlf.g:3965:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalAlf.g:3971:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
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
            // InternalAlf.g:3977:2: ( (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // InternalAlf.g:3978:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // InternalAlf.g:3978:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt84=5;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // InternalAlf.g:3979:3: this_LiteralExpression_0= ruleLiteralExpression
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
                    // InternalAlf.g:3988:3: this_ElementReferenceExpression_1= ruleElementReferenceExpression
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
                    // InternalAlf.g:3997:3: this_InstanceCreationExpression_2= ruleInstanceCreationExpression
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
                    // InternalAlf.g:4006:3: this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression
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
                    // InternalAlf.g:4015:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // InternalAlf.g:4015:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // InternalAlf.g:4016:4: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_46); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_68);
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
    // InternalAlf.g:4037:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // InternalAlf.g:4037:67: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // InternalAlf.g:4038:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
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
    // InternalAlf.g:4044:1: ruleElementReferenceExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleElementReferenceExpression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:4050:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:4051:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:4051:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4052:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:4052:3: ( ruleQualifiedName )
            // InternalAlf.g:4053:4: ruleQualifiedName
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
    // InternalAlf.g:4070:1: entryRuleInstanceCreationExpression returns [EObject current=null] : iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF ;
    public final EObject entryRuleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceCreationExpression = null;


        try {
            // InternalAlf.g:4070:67: (iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF )
            // InternalAlf.g:4071:2: iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF
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
    // InternalAlf.g:4077:1: ruleInstanceCreationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' ) ;
    public final EObject ruleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Tuple_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4083:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' ) )
            // InternalAlf.g:4084:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' )
            {
            // InternalAlf.g:4084:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' )
            // InternalAlf.g:4085:3: ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')'
            {
            // InternalAlf.g:4085:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4086:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:4086:4: ( ruleQualifiedName )
            // InternalAlf.g:4087:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceCreationExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getClassClassCrossReference_0_0());
            				
            pushFollow(FOLLOW_58);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,47,FOLLOW_69); 

            			newLeafNode(otherlv_1, grammarAccess.getInstanceCreationExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlf.g:4105:3: (this_Tuple_2= ruleTuple[$current] )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=RULE_BOOLEAN_VALUE && LA85_0<=RULE_UNRESTRICTED_NAME)||(LA85_0>=17 && LA85_0<=18)||LA85_0==22||LA85_0==47||(LA85_0>=51 && LA85_0<=52)||LA85_0==55) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalAlf.g:4106:4: this_Tuple_2= ruleTuple[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getInstanceCreationExpressionRule());
                    				}
                    				newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getTupleParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_68);
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
    // InternalAlf.g:4127:1: ruleTuple[EObject in_current] returns [EObject current=in_current] : (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] ) ;
    public final EObject ruleTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_PositionalTuple_0 = null;

        EObject this_NamedTuple_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:4133:2: ( (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] ) )
            // InternalAlf.g:4134:2: (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] )
            {
            // InternalAlf.g:4134:2: (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] )
            int alt86=2;
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
                alt86=1;
                }
                break;
            case RULE_ID:
                {
                int LA86_2 = input.LA(2);

                if ( (LA86_2==49) ) {
                    alt86=2;
                }
                else if ( ((LA86_2>=16 && LA86_2<=18)||LA86_2==30||LA86_2==39||(LA86_2>=47 && LA86_2<=48)||(LA86_2>=50 && LA86_2<=54)) ) {
                    alt86=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA86_3 = input.LA(2);

                if ( ((LA86_3>=16 && LA86_3<=18)||LA86_3==30||LA86_3==39||(LA86_3>=47 && LA86_3<=48)||(LA86_3>=50 && LA86_3<=54)) ) {
                    alt86=1;
                }
                else if ( (LA86_3==49) ) {
                    alt86=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // InternalAlf.g:4135:3: this_PositionalTuple_0= rulePositionalTuple[$current]
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
                    // InternalAlf.g:4147:3: this_NamedTuple_1= ruleNamedTuple[$current]
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
    // InternalAlf.g:4163:1: rulePositionalTuple[EObject in_current] returns [EObject current=in_current] : ( ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )* ) ;
    public final EObject rulePositionalTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_argument_0_0 = null;

        EObject lv_argument_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4169:2: ( ( ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )* ) )
            // InternalAlf.g:4170:2: ( ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )* )
            {
            // InternalAlf.g:4170:2: ( ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )* )
            // InternalAlf.g:4171:3: ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )*
            {
            // InternalAlf.g:4171:3: ( (lv_argument_0_0= ruleExpression ) )
            // InternalAlf.g:4172:4: (lv_argument_0_0= ruleExpression )
            {
            // InternalAlf.g:4172:4: (lv_argument_0_0= ruleExpression )
            // InternalAlf.g:4173:5: lv_argument_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPositionalTupleAccess().getArgumentExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalAlf.g:4190:3: (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==30) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalAlf.g:4191:4: otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_46); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPositionalTupleAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalAlf.g:4195:4: ( (lv_argument_2_0= ruleExpression ) )
            	    // InternalAlf.g:4196:5: (lv_argument_2_0= ruleExpression )
            	    {
            	    // InternalAlf.g:4196:5: (lv_argument_2_0= ruleExpression )
            	    // InternalAlf.g:4197:6: lv_argument_2_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getPositionalTupleAccess().getArgumentExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
    // $ANTLR end "rulePositionalTuple"


    // $ANTLR start "ruleNamedTuple"
    // InternalAlf.g:4220:1: ruleNamedTuple[EObject in_current] returns [EObject current=in_current] : ( ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )* ) ;
    public final EObject ruleNamedTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_argument_2_0 = null;

        EObject lv_argument_6_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4226:2: ( ( ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )* ) )
            // InternalAlf.g:4227:2: ( ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )* )
            {
            // InternalAlf.g:4227:2: ( ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )* )
            // InternalAlf.g:4228:3: ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getNamedTupleAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_64);
            ruleName();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,49,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedTupleAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalAlf.g:4239:3: ( (lv_argument_2_0= ruleExpression ) )
            // InternalAlf.g:4240:4: (lv_argument_2_0= ruleExpression )
            {
            // InternalAlf.g:4240:4: (lv_argument_2_0= ruleExpression )
            // InternalAlf.g:4241:5: lv_argument_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNamedTupleAccess().getArgumentExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalAlf.g:4258:3: (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==30) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalAlf.g:4259:4: otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_10); 

            	    				newLeafNode(otherlv_3, grammarAccess.getNamedTupleAccess().getCommaKeyword_3_0());
            	    			

            	    				newCompositeNode(grammarAccess.getNamedTupleAccess().getNameParserRuleCall_3_1());
            	    			
            	    pushFollow(FOLLOW_64);
            	    ruleName();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    otherlv_5=(Token)match(input,49,FOLLOW_46); 

            	    				newLeafNode(otherlv_5, grammarAccess.getNamedTupleAccess().getEqualsSignGreaterThanSignKeyword_3_2());
            	    			
            	    // InternalAlf.g:4274:4: ( (lv_argument_6_0= ruleExpression ) )
            	    // InternalAlf.g:4275:5: (lv_argument_6_0= ruleExpression )
            	    {
            	    // InternalAlf.g:4275:5: (lv_argument_6_0= ruleExpression )
            	    // InternalAlf.g:4276:6: lv_argument_6_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getNamedTupleAccess().getArgumentExpressionParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
            	    break loop88;
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
    // InternalAlf.g:4298:1: entryRuleSequenceConstructionExpression returns [EObject current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
    public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionExpression = null;


        try {
            // InternalAlf.g:4298:71: (iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:4299:2: iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF
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
    // InternalAlf.g:4305:1: ruleSequenceConstructionExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4311:2: ( ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalAlf.g:4312:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalAlf.g:4312:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // InternalAlf.g:4313:3: () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalAlf.g:4313:3: ()
            // InternalAlf.g:4314:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_70); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:4324:3: ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( ((LA90_0>=RULE_BOOLEAN_VALUE && LA90_0<=RULE_UNRESTRICTED_NAME)||(LA90_0>=17 && LA90_0<=18)||LA90_0==22||LA90_0==47||(LA90_0>=51 && LA90_0<=52)||LA90_0==55) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalAlf.g:4325:4: ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:4325:4: ( (lv_element_2_0= ruleExpression ) )
                    // InternalAlf.g:4326:5: (lv_element_2_0= ruleExpression )
                    {
                    // InternalAlf.g:4326:5: (lv_element_2_0= ruleExpression )
                    // InternalAlf.g:4327:6: lv_element_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_71);
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

                    // InternalAlf.g:4344:4: (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==30) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalAlf.g:4345:5: otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FOLLOW_46); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:4349:5: ( (lv_element_4_0= ruleExpression ) )
                    	    // InternalAlf.g:4350:6: (lv_element_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:4350:6: (lv_element_4_0= ruleExpression )
                    	    // InternalAlf.g:4351:7: lv_element_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_71);
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
                    	    break loop89;
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
    // InternalAlf.g:4378:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalAlf.g:4378:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalAlf.g:4379:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalAlf.g:4385:1: ruleLiteralExpression returns [EObject current=null] : (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteralExpression_0 = null;

        EObject this_BooleanLiteralExpression_1 = null;

        EObject this_StringLiteralExpression_2 = null;

        EObject this_RealLiteralExpression_3 = null;

        EObject this_UnlimitedNaturalLiteralExpression_4 = null;



        	enterRule();

        try {
            // InternalAlf.g:4391:2: ( (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:4392:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:4392:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            int alt91=5;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt91=1;
                }
                break;
            case RULE_BOOLEAN_VALUE:
                {
                alt91=2;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt91=3;
                }
                break;
            case RULE_NATURAL_VALUE:
                {
                int LA91_4 = input.LA(2);

                if ( (LA91_4==17) ) {
                    alt91=4;
                }
                else if ( (LA91_4==EOF||(LA91_4>=18 && LA91_4<=19)||(LA91_4>=22 && LA91_4<=23)||LA91_4==30||LA91_4==39||LA91_4==41||LA91_4==48||(LA91_4>=50 && LA91_4<=54)) ) {
                    alt91=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 91, 4, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt91=4;
                }
                break;
            case 18:
                {
                alt91=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalAlf.g:4393:3: this_NullLiteralExpression_0= ruleNullLiteralExpression
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
                    // InternalAlf.g:4402:3: this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression
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
                    // InternalAlf.g:4411:3: this_StringLiteralExpression_2= ruleStringLiteralExpression
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
                    // InternalAlf.g:4420:3: this_RealLiteralExpression_3= ruleRealLiteralExpression
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
                    // InternalAlf.g:4429:3: this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:4441:1: entryRuleNullLiteralExpression returns [EObject current=null] : iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF ;
    public final EObject entryRuleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpression = null;


        try {
            // InternalAlf.g:4441:62: (iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF )
            // InternalAlf.g:4442:2: iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF
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
    // InternalAlf.g:4448:1: ruleNullLiteralExpression returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlf.g:4454:2: ( ( () otherlv_1= 'null' ) )
            // InternalAlf.g:4455:2: ( () otherlv_1= 'null' )
            {
            // InternalAlf.g:4455:2: ( () otherlv_1= 'null' )
            // InternalAlf.g:4456:3: () otherlv_1= 'null'
            {
            // InternalAlf.g:4456:3: ()
            // InternalAlf.g:4457:4: 
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
    // InternalAlf.g:4471:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // InternalAlf.g:4471:65: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:4472:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
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
    // InternalAlf.g:4478:1: ruleBooleanLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:4484:2: ( ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) )
            // InternalAlf.g:4485:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            {
            // InternalAlf.g:4485:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:4486:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:4486:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            // InternalAlf.g:4487:4: lv_value_0_0= RULE_BOOLEAN_VALUE
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
    // InternalAlf.g:4506:1: entryRuleStringLiteralExpression returns [EObject current=null] : iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF ;
    public final EObject entryRuleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpression = null;


        try {
            // InternalAlf.g:4506:64: (iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF )
            // InternalAlf.g:4507:2: iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF
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
    // InternalAlf.g:4513:1: ruleStringLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:4519:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalAlf.g:4520:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalAlf.g:4520:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalAlf.g:4521:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalAlf.g:4521:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalAlf.g:4522:4: lv_value_0_0= RULE_STRING_VALUE
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
    // InternalAlf.g:4541:1: entryRuleRealLiteralExpression returns [EObject current=null] : iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF ;
    public final EObject entryRuleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteralExpression = null;


        try {
            // InternalAlf.g:4541:62: (iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF )
            // InternalAlf.g:4542:2: iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF
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
    // InternalAlf.g:4548:1: ruleRealLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4554:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalAlf.g:4555:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalAlf.g:4555:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalAlf.g:4556:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalAlf.g:4556:3: (lv_value_0_0= ruleRealValue )
            // InternalAlf.g:4557:4: lv_value_0_0= ruleRealValue
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
    // InternalAlf.g:4577:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalAlf.g:4577:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalAlf.g:4578:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalAlf.g:4584:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_VALUE_0=null;
        Token kw=null;
        Token this_NATURAL_VALUE_2=null;
        Token this_NATURAL_VALUE_4=null;
        Token this_NATURAL_VALUE_9=null;


        	enterRule();

        try {
            // InternalAlf.g:4590:2: ( ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) )
            // InternalAlf.g:4591:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            {
            // InternalAlf.g:4591:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            // InternalAlf.g:4592:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            {
            // InternalAlf.g:4592:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_NATURAL_VALUE) ) {
                alt93=1;
            }
            else if ( (LA93_0==17) ) {
                alt93=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // InternalAlf.g:4593:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    {
                    // InternalAlf.g:4593:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    // InternalAlf.g:4594:5: this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    {
                    this_NATURAL_VALUE_0=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_15); 

                    					current.merge(this_NATURAL_VALUE_0);
                    				

                    					newLeafNode(this_NATURAL_VALUE_0, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_0());
                    				
                    kw=(Token)match(input,17,FOLLOW_72); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_0_1());
                    				
                    // InternalAlf.g:4606:5: (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==RULE_NATURAL_VALUE) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // InternalAlf.g:4607:6: this_NATURAL_VALUE_2= RULE_NATURAL_VALUE
                            {
                            this_NATURAL_VALUE_2=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_73); 

                            						current.merge(this_NATURAL_VALUE_2);
                            					

                            						newLeafNode(this_NATURAL_VALUE_2, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_2());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:4617:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    {
                    // InternalAlf.g:4617:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    // InternalAlf.g:4618:5: kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE
                    {
                    kw=(Token)match(input,17,FOLLOW_74); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1_0());
                    				
                    this_NATURAL_VALUE_4=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_73); 

                    					current.merge(this_NATURAL_VALUE_4);
                    				

                    					newLeafNode(this_NATURAL_VALUE_4, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:4632:3: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( ((LA96_0>=56 && LA96_0<=57)) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalAlf.g:4633:4: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE
                    {
                    // InternalAlf.g:4633:4: (kw= 'e' | kw= 'E' )
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==56) ) {
                        alt94=1;
                    }
                    else if ( (LA94_0==57) ) {
                        alt94=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 0, input);

                        throw nvae;
                    }
                    switch (alt94) {
                        case 1 :
                            // InternalAlf.g:4634:5: kw= 'e'
                            {
                            kw=(Token)match(input,56,FOLLOW_75); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:4640:5: kw= 'E'
                            {
                            kw=(Token)match(input,57,FOLLOW_75); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:4646:4: (kw= '+' | kw= '-' )?
                    int alt95=3;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==51) ) {
                        alt95=1;
                    }
                    else if ( (LA95_0==52) ) {
                        alt95=2;
                    }
                    switch (alt95) {
                        case 1 :
                            // InternalAlf.g:4647:5: kw= '+'
                            {
                            kw=(Token)match(input,51,FOLLOW_74); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:4653:5: kw= '-'
                            {
                            kw=(Token)match(input,52,FOLLOW_74); 

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
    // InternalAlf.g:4671:1: entryRuleNaturalLiteralExpression returns [EObject current=null] : iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF ;
    public final EObject entryRuleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:4671:65: (iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:4672:2: iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF
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
    // InternalAlf.g:4678:1: ruleNaturalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) ;
    public final EObject ruleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:4684:2: ( ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) )
            // InternalAlf.g:4685:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            {
            // InternalAlf.g:4685:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            // InternalAlf.g:4686:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:4686:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            // InternalAlf.g:4687:4: lv_value_0_0= RULE_NATURAL_VALUE
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
    // InternalAlf.g:4706:1: entryRuleUnlimitedNaturalLiteralExpression returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:4706:74: (iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:4707:2: iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF
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
    // InternalAlf.g:4713:1: ruleUnlimitedNaturalLiteralExpression returns [EObject current=null] : (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NaturalLiteralExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4719:2: ( (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) )
            // InternalAlf.g:4720:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            {
            // InternalAlf.g:4720:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_NATURAL_VALUE) ) {
                alt97=1;
            }
            else if ( (LA97_0==18) ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // InternalAlf.g:4721:3: this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression
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
                    // InternalAlf.g:4730:3: ( () otherlv_2= '*' )
                    {
                    // InternalAlf.g:4730:3: ( () otherlv_2= '*' )
                    // InternalAlf.g:4731:4: () otherlv_2= '*'
                    {
                    // InternalAlf.g:4731:4: ()
                    // InternalAlf.g:4732:5: 
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
    // InternalAlf.g:4747:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAlf.g:4747:44: (iv_ruleName= ruleName EOF )
            // InternalAlf.g:4748:2: iv_ruleName= ruleName EOF
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
    // InternalAlf.g:4754:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalAlf.g:4760:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalAlf.g:4761:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalAlf.g:4761:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_ID) ) {
                alt98=1;
            }
            else if ( (LA98_0==RULE_UNRESTRICTED_NAME) ) {
                alt98=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // InternalAlf.g:4762:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:4770:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:4781:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlf.g:4781:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlf.g:4782:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlf.g:4788:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_ColonQualifiedName_1 = null;

        AntlrDatatypeRuleToken this_DotQualifiedName_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4794:2: ( (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) )
            // InternalAlf.g:4795:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            {
            // InternalAlf.g:4795:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            int alt99=3;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==RULE_ID) ) {
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
                    alt99=1;
                    }
                    break;
                case 17:
                    {
                    alt99=3;
                    }
                    break;
                case 16:
                    {
                    alt99=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 99, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA99_0==RULE_UNRESTRICTED_NAME) ) {
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
                    alt99=1;
                    }
                    break;
                case 17:
                    {
                    alt99=3;
                    }
                    break;
                case 16:
                    {
                    alt99=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 99, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // InternalAlf.g:4796:3: this_Name_0= ruleName
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
                    // InternalAlf.g:4807:3: this_ColonQualifiedName_1= ruleColonQualifiedName
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
                    // InternalAlf.g:4818:3: this_DotQualifiedName_2= ruleDotQualifiedName
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
    // InternalAlf.g:4832:1: entryRuleColonQualifiedName returns [String current=null] : iv_ruleColonQualifiedName= ruleColonQualifiedName EOF ;
    public final String entryRuleColonQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColonQualifiedName = null;


        try {
            // InternalAlf.g:4832:58: (iv_ruleColonQualifiedName= ruleColonQualifiedName EOF )
            // InternalAlf.g:4833:2: iv_ruleColonQualifiedName= ruleColonQualifiedName EOF
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
    // InternalAlf.g:4839:1: ruleColonQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleColonQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4845:2: ( (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:4846:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:4846:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            // InternalAlf.g:4847:3: this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:4857:3: (kw= '::' this_Name_2= ruleName )+
            int cnt100=0;
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==16) ) {
                    int LA100_1 = input.LA(2);

                    if ( ((LA100_1>=RULE_ID && LA100_1<=RULE_UNRESTRICTED_NAME)) ) {
                        alt100=1;
                    }


                }


                switch (alt100) {
            	case 1 :
            	    // InternalAlf.g:4858:4: kw= '::' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,16,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getColonQualifiedNameAccess().getColonColonKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_76);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt100 >= 1 ) break loop100;
                        EarlyExitException eee =
                            new EarlyExitException(100, input);
                        throw eee;
                }
                cnt100++;
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
    // InternalAlf.g:4878:1: entryRuleDotQualifiedName returns [String current=null] : iv_ruleDotQualifiedName= ruleDotQualifiedName EOF ;
    public final String entryRuleDotQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDotQualifiedName = null;


        try {
            // InternalAlf.g:4878:56: (iv_ruleDotQualifiedName= ruleDotQualifiedName EOF )
            // InternalAlf.g:4879:2: iv_ruleDotQualifiedName= ruleDotQualifiedName EOF
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
    // InternalAlf.g:4885:1: ruleDotQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleDotQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4891:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:4892:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:4892:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            // InternalAlf.g:4893:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:4903:3: (kw= '.' this_Name_2= ruleName )+
            int cnt101=0;
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==17) ) {
                    int LA101_1 = input.LA(2);

                    if ( ((LA101_1>=RULE_ID && LA101_1<=RULE_UNRESTRICTED_NAME)) ) {
                        alt101=1;
                    }


                }


                switch (alt101) {
            	case 1 :
            	    // InternalAlf.g:4904:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,17,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getDotQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_77);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt101 >= 1 ) break loop101;
                        EarlyExitException eee =
                            new EarlyExitException(101, input);
                        throw eee;
                }
                cnt101++;
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
    // InternalAlf.g:4924:1: rulePackageElementVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator rulePackageElementVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAlf.g:4930:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // InternalAlf.g:4931:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // InternalAlf.g:4931:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==58) ) {
                alt102=1;
            }
            else if ( (LA102_0==59) ) {
                alt102=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // InternalAlf.g:4932:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:4932:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:4933:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getPackageElementVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPackageElementVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:4940:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:4940:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:4941:4: enumLiteral_1= 'private'
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
    // InternalAlf.g:4951:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAlf.g:4957:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) )
            // InternalAlf.g:4958:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            {
            // InternalAlf.g:4958:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            int alt103=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt103=1;
                }
                break;
            case 59:
                {
                alt103=2;
                }
                break;
            case 60:
                {
                alt103=3;
                }
                break;
            case 61:
                {
                alt103=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // InternalAlf.g:4959:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:4959:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:4960:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:4967:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:4967:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:4968:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:4975:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalAlf.g:4975:3: (enumLiteral_2= 'protected' )
                    // InternalAlf.g:4976:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:4983:3: (enumLiteral_3= 'packaged' )
                    {
                    // InternalAlf.g:4983:3: (enumLiteral_3= 'packaged' )
                    // InternalAlf.g:4984:4: enumLiteral_3= 'packaged'
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
    // InternalAlf.g:4994:1: ruleFeatureDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFeatureDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAlf.g:5000:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalAlf.g:5001:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalAlf.g:5001:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt104=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt104=1;
                }
                break;
            case 63:
                {
                alt104=2;
                }
                break;
            case 64:
                {
                alt104=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // InternalAlf.g:5002:3: (enumLiteral_0= 'in' )
                    {
                    // InternalAlf.g:5002:3: (enumLiteral_0= 'in' )
                    // InternalAlf.g:5003:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:5010:3: (enumLiteral_1= 'out' )
                    {
                    // InternalAlf.g:5010:3: (enumLiteral_1= 'out' )
                    // InternalAlf.g:5011:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:5018:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalAlf.g:5018:3: (enumLiteral_2= 'inout' )
                    // InternalAlf.g:5019:4: enumLiteral_2= 'inout'
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
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA84 dfa84 = new DFA84(this);
    static final String dfa_1s = "\34\uffff";
    static final String dfa_2s = "\1\4\2\17\1\10\1\4\1\uffff\1\31\3\uffff\2\20\2\10\1\4\1\10\1\23\2\21\2\23\2\20\1\4\2\10\2\23";
    static final String dfa_3s = "\1\73\2\17\1\11\1\34\1\uffff\1\32\3\uffff\2\24\1\22\1\11\1\73\1\22\1\23\2\24\2\23\2\24\1\73\2\22\2\23";
    static final String dfa_4s = "\5\uffff\1\1\1\uffff\1\2\1\3\1\4\22\uffff";
    static final String dfa_5s = "\34\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\12\uffff\1\3\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\6\35\uffff\1\1\1\2",
            "\1\3",
            "\1\3",
            "\1\12\1\13",
            "\1\4\20\uffff\1\5\3\uffff\1\7\1\10\1\11\1\6",
            "",
            "\1\7\1\10",
            "",
            "",
            "",
            "\1\17\1\14\1\uffff\1\16\1\15",
            "\1\17\1\14\1\uffff\1\16\1\15",
            "\1\21\1\22\10\uffff\1\20",
            "\1\23\1\24",
            "\1\4\12\uffff\1\3\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\6\35\uffff\1\1\1\2",
            "\1\25\1\26\10\uffff\1\20",
            "\1\27",
            "\1\30\1\uffff\1\16\1\15",
            "\1\30\1\uffff\1\16\1\15",
            "\1\16",
            "\1\16",
            "\1\31\2\uffff\1\16\1\15",
            "\1\31\2\uffff\1\16\1\15",
            "\1\4\12\uffff\1\3\5\uffff\1\5\3\uffff\1\7\1\10\1\11\1\6\35\uffff\1\1\1\2",
            "\1\21\1\22\10\uffff\1\32",
            "\1\25\1\26\10\uffff\1\33",
            "\1\27",
            "\1\27"
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
    static final String dfa_9s = "\1\73\1\uffff\2\17\1\11\2\24\2\22\1\uffff\2\24\1\uffff\2\24\2\22";
    static final String dfa_10s = "\1\uffff\1\3\7\uffff\1\2\2\uffff\1\1\4\uffff";
    static final String dfa_11s = "\21\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\12\uffff\1\4\5\uffff\1\1\3\uffff\4\1\35\uffff\1\2\1\3",
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
    static final String dfa_13s = "\1\4\2\uffff\3\10\2\20\2\10\1\uffff\2\20\2\21\2\10";
    static final String dfa_14s = "\1\73\2\uffff\2\34\1\11\2\24\2\22\1\uffff\4\24\2\22";
    static final String dfa_15s = "\1\uffff\1\3\1\1\7\uffff\1\2\6\uffff";
    static final String[] dfa_16s = {
            "\1\2\3\uffff\2\2\5\uffff\1\5\5\uffff\1\2\1\uffff\1\1\1\uffff\4\2\35\uffff\1\3\1\4",
            "",
            "",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2",
            "\1\6\1\7",
            "\1\10\1\11\1\uffff\2\2",
            "\1\10\1\11\1\uffff\2\2",
            "\1\13\1\14\10\uffff\1\12",
            "\1\15\1\16\10\uffff\1\12",
            "",
            "\1\17\2\uffff\2\2",
            "\1\17\2\uffff\2\2",
            "\1\20\1\uffff\2\2",
            "\1\20\1\uffff\2\2",
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
    static final String dfa_17s = "\17\uffff";
    static final String dfa_18s = "\1\17\1\10\1\uffff\2\10\1\uffff\2\26\1\uffff\2\26\1\uffff\2\26\1\uffff";
    static final String dfa_19s = "\1\34\1\30\1\uffff\2\30\1\uffff\2\30\1\uffff\2\35\1\uffff\2\35\1\uffff";
    static final String dfa_20s = "\2\uffff\1\1\2\uffff\1\5\2\uffff\1\2\2\uffff\1\3\2\uffff\1\4";
    static final String dfa_21s = "\17\uffff}>";
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
            "\1\2\1\uffff\1\13\4\uffff\1\2",
            "\1\2\1\uffff\1\13\4\uffff\1\2",
            "",
            "\1\2\1\uffff\1\16\4\uffff\1\2",
            "\1\2\1\uffff\1\16\4\uffff\1\2",
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
            return "861:2: ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' ) )";
        }
    }
    static final String dfa_23s = "\1\4\2\uffff\3\10\2\20\2\10\1\uffff\2\21\2\20\2\10";
    static final String dfa_24s = "\1\100\2\uffff\2\100\1\11\2\24\2\22\1\uffff\4\24\2\22";
    static final String[] dfa_25s = {
            "\1\2\3\uffff\2\2\5\uffff\1\5\5\uffff\1\2\1\uffff\1\1\1\uffff\4\2\2\uffff\3\2\30\uffff\1\3\1\4\5\2",
            "",
            "",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2\2\uffff\3\2\34\uffff\3\2",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2\2\uffff\3\2\34\uffff\3\2",
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
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "()* loopback of 1403:3: ( ( (lv_ownedMembership_1_0= ruleClassMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_26s = "\10\uffff";
    static final String dfa_27s = "\2\4\4\10\2\uffff";
    static final String dfa_28s = "\6\100\2\uffff";
    static final String dfa_29s = "\6\uffff\1\1\1\2";
    static final String dfa_30s = "\10\uffff}>";
    static final String[] dfa_31s = {
            "\1\1\3\uffff\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\30\uffff\1\2\1\3\1\4\1\5\3\7",
            "\1\1\3\uffff\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\30\uffff\1\2\1\3\1\4\1\5\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\34\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\34\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\34\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\34\uffff\3\7",
            "",
            ""
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_26;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "1499:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_FeatureClassMember_1= ruleFeatureClassMember )";
        }
    }
    static final String dfa_32s = "\25\uffff";
    static final String dfa_33s = "\1\33\2\10\1\uffff\1\10\2\23\1\uffff\2\20\1\uffff\1\10\2\20\1\10\1\uffff\1\10\2\21\2\20";
    static final String dfa_34s = "\1\41\2\100\1\uffff\1\57\2\55\1\uffff\2\61\1\uffff\1\11\2\61\1\11\1\uffff\1\11\4\61";
    static final String dfa_35s = "\3\uffff\1\1\3\uffff\1\2\2\uffff\1\3\4\uffff\1\4\5\uffff";
    static final String dfa_36s = "\25\uffff}>";
    static final String[] dfa_37s = {
            "\1\1\3\uffff\1\2\1\3\1\4",
            "\1\5\1\6\16\uffff\1\7\23\uffff\2\3\20\uffff\3\3",
            "\1\5\1\6\16\uffff\1\7\23\uffff\2\3\20\uffff\3\3",
            "",
            "\1\10\1\11\16\uffff\1\13\13\uffff\1\12\12\uffff\1\12",
            "\1\3\2\uffff\1\3\1\uffff\1\7\12\uffff\2\3\2\uffff\1\3\4\uffff\2\3",
            "\1\3\2\uffff\1\3\1\uffff\1\7\12\uffff\2\3\2\uffff\1\3\4\uffff\2\3",
            "",
            "\2\12\6\uffff\1\13\13\uffff\1\12\2\uffff\1\12\6\uffff\2\12\1\uffff\1\12",
            "\2\12\6\uffff\1\13\13\uffff\1\12\2\uffff\1\12\6\uffff\2\12\1\uffff\1\12",
            "",
            "\1\14\1\15",
            "\1\20\1\16\1\uffff\1\17\20\uffff\1\12\2\uffff\1\12\6\uffff\1\12\2\uffff\1\12",
            "\1\20\1\16\1\uffff\1\17\20\uffff\1\12\2\uffff\1\12\6\uffff\1\12\2\uffff\1\12",
            "\1\21\1\22",
            "",
            "\1\23\1\24",
            "\1\16\1\uffff\1\17\20\uffff\1\12\2\uffff\1\12\6\uffff\1\12\2\uffff\1\12",
            "\1\16\1\uffff\1\17\20\uffff\1\12\2\uffff\1\12\6\uffff\1\12\2\uffff\1\12",
            "\1\20\2\uffff\1\17\20\uffff\1\12\2\uffff\1\12\6\uffff\1\12\2\uffff\1\12",
            "\1\20\2\uffff\1\17\20\uffff\1\12\2\uffff\1\12\6\uffff\1\12\2\uffff\1\12"
    };

    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = dfa_32;
            this.eof = dfa_32;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_35;
            this.special = dfa_36;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "1754:2: ( ( (otherlv_0= 'feature' | ( (lv_isComposite_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isComposite_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )";
        }
    }
    static final String[] dfa_38s = {
            "\1\2\3\uffff\2\2\5\uffff\1\5\5\uffff\1\2\1\uffff\1\1\1\uffff\4\2\2\uffff\4\2\27\uffff\1\3\1\4\5\2",
            "",
            "",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2\2\uffff\4\2\33\uffff\3\2",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2\2\uffff\4\2\33\uffff\3\2",
            "\1\6\1\7",
            "\1\10\1\11\1\uffff\2\2",
            "\1\10\1\11\1\uffff\2\2",
            "\1\13\1\14\10\uffff\1\12",
            "\1\15\1\16\10\uffff\1\12",
            "",
            "\1\17\2\uffff\2\2",
            "\1\17\2\uffff\2\2",
            "\1\20\1\uffff\2\2",
            "\1\20\1\uffff\2\2",
            "\1\13\1\14\10\uffff\1\12",
            "\1\15\1\16\10\uffff\1\12"
    };
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_24;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "()* loopback of 2154:3: ( ( (lv_ownedMembership_1_0= ruleAssociationMember ) ) | ( (lv_ownedImport_2_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_39s = "\11\uffff";
    static final String dfa_40s = "\2\4\4\10\3\uffff";
    static final String dfa_41s = "\6\100\3\uffff";
    static final String dfa_42s = "\6\uffff\1\1\1\2\1\3";
    static final String dfa_43s = "\11\uffff}>";
    static final String[] dfa_44s = {
            "\1\1\3\uffff\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\1\10\27\uffff\1\2\1\3\1\4\1\5\3\10",
            "\1\1\3\uffff\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\1\10\27\uffff\1\2\1\3\1\4\1\5\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\1\10\33\uffff\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\1\10\33\uffff\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\1\10\33\uffff\3\10",
            "\2\10\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\1\10\33\uffff\3\10",
            "",
            "",
            ""
    };

    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_39;
            this.eof = dfa_39;
            this.min = dfa_40;
            this.max = dfa_41;
            this.accept = dfa_42;
            this.special = dfa_43;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "2217:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )";
        }
    }
    static final String dfa_45s = "\12\uffff";
    static final String dfa_46s = "\2\10\1\uffff\4\23\3\uffff";
    static final String dfa_47s = "\2\100\1\uffff\4\55\3\uffff";
    static final String dfa_48s = "\2\uffff\1\3\4\uffff\1\2\1\1\1\4";
    static final String dfa_49s = "\12\uffff}>";
    static final String[] dfa_50s = {
            "\1\3\1\4\30\uffff\1\1\33\uffff\3\2",
            "\1\5\1\6\16\uffff\1\7\23\uffff\2\10\20\uffff\3\10",
            "",
            "\1\2\2\uffff\1\2\1\uffff\1\11\12\uffff\2\2\2\uffff\1\2\4\uffff\2\2",
            "\1\2\2\uffff\1\2\1\uffff\1\11\12\uffff\2\2\2\uffff\1\2\4\uffff\2\2",
            "\1\10\2\uffff\1\10\1\uffff\1\7\12\uffff\2\10\2\uffff\1\10\4\uffff\2\10",
            "\1\10\2\uffff\1\10\1\uffff\1\7\12\uffff\2\10\2\uffff\1\10\4\uffff\2\10",
            "",
            "",
            ""
    };

    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[][] dfa_50 = unpackEncodedStringArray(dfa_50s);

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = dfa_45;
            this.eof = dfa_45;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_48;
            this.special = dfa_49;
            this.transition = dfa_50;
        }
        public String getDescription() {
            return "2369:3: ( (otherlv_2= 'end' ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_memberName_6_0= ruleName ) )? otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) | ( ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_12_0= ruleName ) ) otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) )";
        }
    }
    static final String dfa_51s = "\27\uffff";
    static final String dfa_52s = "\1\10\2\20\1\10\2\uffff\1\10\4\20\4\10\2\20\2\21\2\20\2\21";
    static final String dfa_53s = "\1\57\2\61\1\11\2\uffff\1\11\4\57\4\11\10\57";
    static final String dfa_54s = "\4\uffff\1\1\1\2\21\uffff";
    static final String dfa_55s = "\27\uffff}>";
    static final String[] dfa_56s = {
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

    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[][] dfa_56 = unpackEncodedStringArray(dfa_56s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_51;
            this.eof = dfa_51;
            this.min = dfa_52;
            this.max = dfa_53;
            this.accept = dfa_54;
            this.special = dfa_55;
            this.transition = dfa_56;
        }
        public String getDescription() {
            return "3187:2: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) otherlv_7= ';' ) | ( ( (lv_name_8_0= ruleName ) )? (otherlv_9= ':' ( ( ruleQualifiedName ) ) )? otherlv_11= '(' ( (lv_connectorEnd_12_0= ruleConnectorEnd ) ) otherlv_13= ',' ( (lv_connectorEnd_14_0= ruleConnectorEnd ) ) (otherlv_15= ',' ( (lv_connectorEnd_16_0= ruleConnectorEnd ) ) )* otherlv_17= ')' otherlv_18= ';' ) )";
        }
    }
    static final String dfa_57s = "\16\uffff";
    static final String dfa_58s = "\1\10\2\20\2\uffff\1\10\2\20\2\10\2\20\2\21";
    static final String dfa_59s = "\1\44\2\61\2\uffff\1\11\2\56\2\11\4\56";
    static final String dfa_60s = "\3\uffff\1\1\1\2\11\uffff";
    static final String dfa_61s = "\16\uffff}>";
    static final String[] dfa_62s = {
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

    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final char[] dfa_58 = DFA.unpackEncodedStringToUnsignedChars(dfa_58s);
    static final char[] dfa_59 = DFA.unpackEncodedStringToUnsignedChars(dfa_59s);
    static final short[] dfa_60 = DFA.unpackEncodedString(dfa_60s);
    static final short[] dfa_61 = DFA.unpackEncodedString(dfa_61s);
    static final short[][] dfa_62 = unpackEncodedStringArray(dfa_62s);

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = dfa_57;
            this.eof = dfa_57;
            this.min = dfa_58;
            this.max = dfa_59;
            this.accept = dfa_60;
            this.special = dfa_61;
            this.transition = dfa_62;
        }
        public String getDescription() {
            return "3189:4: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )?";
        }
    }
    static final String dfa_63s = "\1\uffff\2\4\7\uffff\5\4\2\uffff";
    static final String dfa_64s = "\1\10\2\20\1\7\1\uffff\2\10\1\uffff\1\50\1\51\2\20\2\21\1\23\1\7\1\51";
    static final String dfa_65s = "\1\11\2\61\1\22\1\uffff\2\11\1\uffff\2\51\5\61\1\22\1\51";
    static final String dfa_66s = "\4\uffff\1\1\2\uffff\1\2\11\uffff";
    static final String[] dfa_67s = {
            "\1\1\1\2",
            "\1\5\1\6\1\uffff\1\4\12\uffff\1\4\5\uffff\1\4\2\uffff\1\3\6\uffff\1\4\1\uffff\1\4\1\7",
            "\1\5\1\6\1\uffff\1\4\12\uffff\1\4\5\uffff\1\4\2\uffff\1\3\6\uffff\1\4\1\uffff\1\4\1\7",
            "\1\10\12\uffff\1\11",
            "",
            "\1\12\1\13",
            "\1\14\1\15",
            "",
            "\1\17\1\16",
            "\1\16",
            "\1\5\2\uffff\1\4\12\uffff\1\4\5\uffff\1\4\2\uffff\1\3\6\uffff\1\4\1\uffff\1\4\1\7",
            "\1\5\2\uffff\1\4\12\uffff\1\4\5\uffff\1\4\2\uffff\1\3\6\uffff\1\4\1\uffff\1\4\1\7",
            "\1\6\1\uffff\1\4\12\uffff\1\4\5\uffff\1\4\2\uffff\1\3\6\uffff\1\4\1\uffff\1\4\1\7",
            "\1\6\1\uffff\1\4\12\uffff\1\4\5\uffff\1\4\2\uffff\1\3\6\uffff\1\4\1\uffff\1\4\1\7",
            "\1\4\12\uffff\1\4\17\uffff\1\4\1\uffff\1\4\1\7",
            "\1\20\12\uffff\1\11",
            "\1\16"
    };
    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final char[] dfa_64 = DFA.unpackEncodedStringToUnsignedChars(dfa_64s);
    static final char[] dfa_65 = DFA.unpackEncodedStringToUnsignedChars(dfa_65s);
    static final short[] dfa_66 = DFA.unpackEncodedString(dfa_66s);
    static final short[][] dfa_67 = unpackEncodedStringArray(dfa_67s);

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = dfa_7;
            this.eof = dfa_63;
            this.min = dfa_64;
            this.max = dfa_65;
            this.accept = dfa_66;
            this.special = dfa_11;
            this.transition = dfa_67;
        }
        public String getDescription() {
            return "3424:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_3= ruleConnectorEndMultiplicity[$current] )? ) | ( ( ( ( ruleQualifiedName ) ) (this_ConnectorEndMultiplicity_5= ruleConnectorEndMultiplicity[$current] )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )";
        }
    }
    static final String dfa_68s = "\13\uffff";
    static final String dfa_69s = "\1\uffff\2\4\4\uffff\4\4";
    static final String dfa_70s = "\1\10\2\20\1\10\1\uffff\1\10\1\uffff\2\21\2\20";
    static final String dfa_71s = "\1\11\2\60\1\11\1\uffff\1\11\1\uffff\4\60";
    static final String dfa_72s = "\4\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String dfa_73s = "\13\uffff}>";
    static final String[] dfa_74s = {
            "\1\1\1\2",
            "\1\5\1\3\1\uffff\1\4\12\uffff\1\4\5\uffff\1\6\2\uffff\1\4\6\uffff\1\4\1\uffff\1\4",
            "\1\5\1\3\1\uffff\1\4\12\uffff\1\4\5\uffff\1\6\2\uffff\1\4\6\uffff\1\4\1\uffff\1\4",
            "\1\7\1\10",
            "",
            "\1\11\1\12",
            "",
            "\1\3\1\uffff\1\4\12\uffff\1\4\5\uffff\1\6\2\uffff\1\4\6\uffff\1\4\1\uffff\1\4",
            "\1\3\1\uffff\1\4\12\uffff\1\4\5\uffff\1\6\2\uffff\1\4\6\uffff\1\4\1\uffff\1\4",
            "\1\5\2\uffff\1\4\12\uffff\1\4\5\uffff\1\6\2\uffff\1\4\6\uffff\1\4\1\uffff\1\4",
            "\1\5\2\uffff\1\4\12\uffff\1\4\5\uffff\1\6\2\uffff\1\4\6\uffff\1\4\1\uffff\1\4"
    };

    static final short[] dfa_68 = DFA.unpackEncodedString(dfa_68s);
    static final short[] dfa_69 = DFA.unpackEncodedString(dfa_69s);
    static final char[] dfa_70 = DFA.unpackEncodedStringToUnsignedChars(dfa_70s);
    static final char[] dfa_71 = DFA.unpackEncodedStringToUnsignedChars(dfa_71s);
    static final short[] dfa_72 = DFA.unpackEncodedString(dfa_72s);
    static final short[] dfa_73 = DFA.unpackEncodedString(dfa_73s);
    static final short[][] dfa_74 = unpackEncodedStringArray(dfa_74s);

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_68;
            this.eof = dfa_69;
            this.min = dfa_70;
            this.max = dfa_71;
            this.accept = dfa_72;
            this.special = dfa_73;
            this.transition = dfa_74;
        }
        public String getDescription() {
            return "3426:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )?";
        }
    }
    static final String dfa_75s = "\2\uffff\2\11\6\uffff\4\11";
    static final String dfa_76s = "\1\5\1\uffff\2\20\3\uffff\2\10\1\uffff\2\20\2\21";
    static final String dfa_77s = "\1\67\1\uffff\2\66\3\uffff\2\11\1\uffff\4\66";
    static final String dfa_78s = "\1\uffff\1\1\2\uffff\1\4\1\5\1\3\2\uffff\1\2\4\uffff";
    static final String[] dfa_79s = {
            "\3\1\1\2\1\3\7\uffff\2\1\3\uffff\1\4\30\uffff\1\5\7\uffff\1\1",
            "",
            "\1\7\1\10\2\11\2\uffff\2\11\6\uffff\1\11\10\uffff\1\11\1\uffff\1\11\5\uffff\1\6\1\11\1\uffff\5\11",
            "\1\7\1\10\2\11\2\uffff\2\11\6\uffff\1\11\10\uffff\1\11\1\uffff\1\11\5\uffff\1\6\1\11\1\uffff\5\11",
            "",
            "",
            "",
            "\1\12\1\13",
            "\1\14\1\15",
            "",
            "\1\7\1\uffff\2\11\2\uffff\2\11\6\uffff\1\11\10\uffff\1\11\1\uffff\1\11\5\uffff\1\6\1\11\1\uffff\5\11",
            "\1\7\1\uffff\2\11\2\uffff\2\11\6\uffff\1\11\10\uffff\1\11\1\uffff\1\11\5\uffff\1\6\1\11\1\uffff\5\11",
            "\1\10\2\11\2\uffff\2\11\6\uffff\1\11\10\uffff\1\11\1\uffff\1\11\5\uffff\1\6\1\11\1\uffff\5\11",
            "\1\10\2\11\2\uffff\2\11\6\uffff\1\11\10\uffff\1\11\1\uffff\1\11\5\uffff\1\6\1\11\1\uffff\5\11"
    };
    static final short[] dfa_75 = DFA.unpackEncodedString(dfa_75s);
    static final char[] dfa_76 = DFA.unpackEncodedStringToUnsignedChars(dfa_76s);
    static final char[] dfa_77 = DFA.unpackEncodedStringToUnsignedChars(dfa_77s);
    static final short[] dfa_78 = DFA.unpackEncodedString(dfa_78s);
    static final short[][] dfa_79 = unpackEncodedStringArray(dfa_79s);

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = dfa_57;
            this.eof = dfa_75;
            this.min = dfa_76;
            this.max = dfa_77;
            this.accept = dfa_78;
            this.special = dfa_61;
            this.transition = dfa_79;
        }
        public String getDescription() {
            return "3978:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0C00000000008012L});
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
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0C0000001EA08310L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0C0000001E208310L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000300L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000300L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xFC0000039EA08310L,0x0000000000000001L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x3C00000016208010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000016208000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xFC00000388000310L,0x0000000000000001L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xC000000388000300L,0x0000000000000001L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xC000300008000300L,0x0000000000000001L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000801001000300L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0xFC0000079EA08310L,0x0000000000000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x3C00000388000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000388000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0xFC00000408000310L,0x0000000000000001L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0xC000000408000300L,0x0000000000000001L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800480000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000009800480000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008800480000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000309000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000308000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00988000004603E0L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000006000000300L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000004000000300L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00800000000600E0L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000001001000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000001001000300L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000801000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0001000040000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0002008000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x007C000000040002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x00808000004603E0L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x00998000004603E0L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0098800000C603E0L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0300000000000082L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0018000000000080L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000020002L});

}
