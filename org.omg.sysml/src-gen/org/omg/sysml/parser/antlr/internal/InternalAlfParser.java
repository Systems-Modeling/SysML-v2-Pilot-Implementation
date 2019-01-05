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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOCUMENTATION_COMMENT", "RULE_BOOLEAN_VALUE", "RULE_STRING_VALUE", "RULE_NATURAL_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'import'", "'::'", "'.'", "'*'", "';'", "'as'", "'package'", "'{'", "'}'", "'is'", "'class'", "'assoc'", "'feature'", "'part'", "'port'", "'connector'", "'abstract'", "'specializes'", "','", "'end'", "'ordered'", "'nonunique'", "'='", "':'", "'compose'", "'any'", "'['", "'..'", "']'", "'subsets'", "'redefines'", "'to'", "'('", "')'", "'=>'", "'@'", "'+'", "'-'", "'/'", "'^'", "'null'", "'e'", "'E'", "'public'", "'private'", "'protected'", "'packaged'", "'in'", "'out'", "'inout'"
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
    // InternalAlf.g:284:1: ruleUnitPrefix[EObject in_current] returns [EObject current=in_current] : ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedRelationship_2_0= ruleAnnotation ) )* ) ;
    public final EObject ruleUnitPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedImport_0_0 = null;

        EObject lv_ownedMembership_1_0 = null;

        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:290:2: ( ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedRelationship_2_0= ruleAnnotation ) )* ) )
            // InternalAlf.g:291:2: ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedRelationship_2_0= ruleAnnotation ) )* )
            {
            // InternalAlf.g:291:2: ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedRelationship_2_0= ruleAnnotation ) )* )
            // InternalAlf.g:292:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedRelationship_2_0= ruleAnnotation ) )*
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

            // InternalAlf.g:333:3: ( (lv_ownedRelationship_2_0= ruleAnnotation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAlf.g:334:4: (lv_ownedRelationship_2_0= ruleAnnotation )
            	    {
            	    // InternalAlf.g:334:4: (lv_ownedRelationship_2_0= ruleAnnotation )
            	    // InternalAlf.g:335:5: lv_ownedRelationship_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getUnitPrefixAccess().getOwnedRelationshipAnnotationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
    // InternalAlf.g:356:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalAlf.g:356:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalAlf.g:357:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalAlf.g:363:1: ruleAnnotation returns [EObject current=null] : ( (lv_ownedRelatedElement_0_0= ruleComment ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelatedElement_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:369:2: ( ( (lv_ownedRelatedElement_0_0= ruleComment ) ) )
            // InternalAlf.g:370:2: ( (lv_ownedRelatedElement_0_0= ruleComment ) )
            {
            // InternalAlf.g:370:2: ( (lv_ownedRelatedElement_0_0= ruleComment ) )
            // InternalAlf.g:371:3: (lv_ownedRelatedElement_0_0= ruleComment )
            {
            // InternalAlf.g:371:3: (lv_ownedRelatedElement_0_0= ruleComment )
            // InternalAlf.g:372:4: lv_ownedRelatedElement_0_0= ruleComment
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
    // InternalAlf.g:392:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalAlf.g:392:48: (iv_ruleComment= ruleComment EOF )
            // InternalAlf.g:393:2: iv_ruleComment= ruleComment EOF
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
    // InternalAlf.g:399:1: ruleComment returns [EObject current=null] : ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_body_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:405:2: ( ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) ) )
            // InternalAlf.g:406:2: ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) )
            {
            // InternalAlf.g:406:2: ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) )
            // InternalAlf.g:407:3: (lv_body_0_0= RULE_DOCUMENTATION_COMMENT )
            {
            // InternalAlf.g:407:3: (lv_body_0_0= RULE_DOCUMENTATION_COMMENT )
            // InternalAlf.g:408:4: lv_body_0_0= RULE_DOCUMENTATION_COMMENT
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
    // InternalAlf.g:427:1: entryRulePackageImport returns [EObject current=null] : iv_rulePackageImport= rulePackageImport EOF ;
    public final EObject entryRulePackageImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageImport = null;


        try {
            // InternalAlf.g:427:54: (iv_rulePackageImport= rulePackageImport EOF )
            // InternalAlf.g:428:2: iv_rulePackageImport= rulePackageImport EOF
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
    // InternalAlf.g:434:1: rulePackageImport returns [EObject current=null] : ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? otherlv_2= 'import' ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) ) otherlv_13= ';' ) ;
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
            // InternalAlf.g:440:2: ( ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? otherlv_2= 'import' ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) ) otherlv_13= ';' ) )
            // InternalAlf.g:441:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? otherlv_2= 'import' ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) ) otherlv_13= ';' )
            {
            // InternalAlf.g:441:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? otherlv_2= 'import' ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) ) otherlv_13= ';' )
            // InternalAlf.g:442:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? otherlv_2= 'import' ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) ) otherlv_13= ';'
            {
            // InternalAlf.g:442:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAlf.g:443:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    {
            	    // InternalAlf.g:443:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    // InternalAlf.g:444:5: lv_ownedRelationship_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getPackageImportAccess().getOwnedRelationshipAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_9);
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

            // InternalAlf.g:461:3: ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=58 && LA5_0<=59)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAlf.g:462:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    {
                    // InternalAlf.g:462:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    // InternalAlf.g:463:5: lv_visibility_1_0= rulePackageElementVisibilityIndicator
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
            		
            // InternalAlf.g:484:3: ( ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==16) ) {
                    int LA7_3 = input.LA(3);

                    if ( ((LA7_3>=RULE_ID && LA7_3<=RULE_UNRESTRICTED_NAME)) ) {
                        alt7=2;
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
                else if ( (LA7_1==17) ) {
                    int LA7_4 = input.LA(3);

                    if ( (LA7_4==18) ) {
                        alt7=1;
                    }
                    else if ( ((LA7_4>=RULE_ID && LA7_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt7=3;
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
                    int LA7_3 = input.LA(3);

                    if ( ((LA7_3>=RULE_ID && LA7_3<=RULE_UNRESTRICTED_NAME)) ) {
                        alt7=2;
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
                else if ( (LA7_2==17) ) {
                    int LA7_4 = input.LA(3);

                    if ( (LA7_4==18) ) {
                        alt7=1;
                    }
                    else if ( ((LA7_4>=RULE_ID && LA7_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt7=3;
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
                    // InternalAlf.g:485:4: ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' )
                    {
                    // InternalAlf.g:485:4: ( ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*' )
                    // InternalAlf.g:486:5: ( ( ruleName ) ) (otherlv_4= '::' | otherlv_5= '.' ) otherlv_6= '*'
                    {
                    // InternalAlf.g:486:5: ( ( ruleName ) )
                    // InternalAlf.g:487:6: ( ruleName )
                    {
                    // InternalAlf.g:487:6: ( ruleName )
                    // InternalAlf.g:488:7: ruleName
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

                    // InternalAlf.g:502:5: (otherlv_4= '::' | otherlv_5= '.' )
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
                            // InternalAlf.g:503:6: otherlv_4= '::'
                            {
                            otherlv_4=(Token)match(input,16,FOLLOW_13); 

                            						newLeafNode(otherlv_4, grammarAccess.getPackageImportAccess().getColonColonKeyword_3_0_1_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:508:6: otherlv_5= '.'
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
                    // InternalAlf.g:519:4: ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' )
                    {
                    // InternalAlf.g:519:4: ( ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*' )
                    // InternalAlf.g:520:5: ( ( ruleColonQualifiedName ) ) otherlv_8= '::' otherlv_9= '*'
                    {
                    // InternalAlf.g:520:5: ( ( ruleColonQualifiedName ) )
                    // InternalAlf.g:521:6: ( ruleColonQualifiedName )
                    {
                    // InternalAlf.g:521:6: ( ruleColonQualifiedName )
                    // InternalAlf.g:522:7: ruleColonQualifiedName
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
                    // InternalAlf.g:546:4: ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' )
                    {
                    // InternalAlf.g:546:4: ( ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*' )
                    // InternalAlf.g:547:5: ( ( ruleDotQualifiedName ) ) otherlv_11= '.' otherlv_12= '*'
                    {
                    // InternalAlf.g:547:5: ( ( ruleDotQualifiedName ) )
                    // InternalAlf.g:548:6: ( ruleDotQualifiedName )
                    {
                    // InternalAlf.g:548:6: ( ruleDotQualifiedName )
                    // InternalAlf.g:549:7: ruleDotQualifiedName
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
    // InternalAlf.g:581:1: entryRuleElementImport returns [EObject current=null] : iv_ruleElementImport= ruleElementImport EOF ;
    public final EObject entryRuleElementImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementImport = null;


        try {
            // InternalAlf.g:581:54: (iv_ruleElementImport= ruleElementImport EOF )
            // InternalAlf.g:582:2: iv_ruleElementImport= ruleElementImport EOF
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
    // InternalAlf.g:588:1: ruleElementImport returns [EObject current=null] : (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleElementImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_PackageMemberPrefix_0 = null;

        AntlrDatatypeRuleToken lv_memberName_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:594:2: ( (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' ) )
            // InternalAlf.g:595:2: (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' )
            {
            // InternalAlf.g:595:2: (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' )
            // InternalAlf.g:596:3: this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';'
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
            		
            // InternalAlf.g:611:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:612:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:612:4: ( ruleQualifiedName )
            // InternalAlf.g:613:5: ruleQualifiedName
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

            // InternalAlf.g:627:3: (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAlf.g:628:4: otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getElementImportAccess().getAsKeyword_3_0());
                    			
                    // InternalAlf.g:632:4: ( (lv_memberName_4_0= ruleName ) )
                    // InternalAlf.g:633:5: (lv_memberName_4_0= ruleName )
                    {
                    // InternalAlf.g:633:5: (lv_memberName_4_0= ruleName )
                    // InternalAlf.g:634:6: lv_memberName_4_0= ruleName
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
    // InternalAlf.g:660:1: entryRuleNonFeatureDefinition returns [EObject current=null] : iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF ;
    public final EObject entryRuleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureDefinition = null;


        try {
            // InternalAlf.g:660:61: (iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF )
            // InternalAlf.g:661:2: iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF
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
    // InternalAlf.g:667:1: ruleNonFeatureDefinition returns [EObject current=null] : (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_2= ruleAssociationDefinitionOrStub ) ;
    public final EObject ruleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinitionOrStub_0 = null;

        EObject this_ClassDefinitionOrStub_1 = null;

        EObject this_AssociationDefinitionOrStub_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:673:2: ( (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_2= ruleAssociationDefinitionOrStub ) )
            // InternalAlf.g:674:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_2= ruleAssociationDefinitionOrStub )
            {
            // InternalAlf.g:674:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_2= ruleAssociationDefinitionOrStub )
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
                    // InternalAlf.g:675:3: this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub
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
                    // InternalAlf.g:684:3: this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub
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
                    // InternalAlf.g:693:3: this_AssociationDefinitionOrStub_2= ruleAssociationDefinitionOrStub
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
    // InternalAlf.g:705:1: entryRulePackageDefinitionOrStub returns [EObject current=null] : iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF ;
    public final EObject entryRulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDefinitionOrStub = null;


        try {
            // InternalAlf.g:705:64: (iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF )
            // InternalAlf.g:706:2: iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF
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
    // InternalAlf.g:712:1: rulePackageDefinitionOrStub returns [EObject current=null] : this_PackageDefinition_0= rulePackageDefinition[$current] ;
    public final EObject rulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:718:2: (this_PackageDefinition_0= rulePackageDefinition[$current] )
            // InternalAlf.g:719:2: this_PackageDefinition_0= rulePackageDefinition[$current]
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
    // InternalAlf.g:734:1: rulePackageDefinition[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' ) ;
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
            // InternalAlf.g:740:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' ) )
            // InternalAlf.g:741:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' )
            {
            // InternalAlf.g:741:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' )
            // InternalAlf.g:742:3: otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0());
            		
            // InternalAlf.g:746:3: ( (lv_name_1_0= ruleName ) )
            // InternalAlf.g:747:4: (lv_name_1_0= ruleName )
            {
            // InternalAlf.g:747:4: (lv_name_1_0= ruleName )
            // InternalAlf.g:748:5: lv_name_1_0= ruleName
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
            		
            // InternalAlf.g:769:3: ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )*
            loop10:
            do {
                int alt10=3;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalAlf.g:770:4: ( (lv_ownedMembership_3_0= rulePackageMember ) )
            	    {
            	    // InternalAlf.g:770:4: ( (lv_ownedMembership_3_0= rulePackageMember ) )
            	    // InternalAlf.g:771:5: (lv_ownedMembership_3_0= rulePackageMember )
            	    {
            	    // InternalAlf.g:771:5: (lv_ownedMembership_3_0= rulePackageMember )
            	    // InternalAlf.g:772:6: lv_ownedMembership_3_0= rulePackageMember
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
            	    // InternalAlf.g:790:4: ( (lv_ownedImport_4_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:790:4: ( (lv_ownedImport_4_0= rulePackageImport ) )
            	    // InternalAlf.g:791:5: (lv_ownedImport_4_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:791:5: (lv_ownedImport_4_0= rulePackageImport )
            	    // InternalAlf.g:792:6: lv_ownedImport_4_0= rulePackageImport
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
    // InternalAlf.g:818:1: entryRulePackageMember returns [EObject current=null] : iv_rulePackageMember= rulePackageMember EOF ;
    public final EObject entryRulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageMember = null;


        try {
            // InternalAlf.g:818:54: (iv_rulePackageMember= rulePackageMember EOF )
            // InternalAlf.g:819:2: iv_rulePackageMember= rulePackageMember EOF
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
    // InternalAlf.g:825:1: rulePackageMember returns [EObject current=null] : (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] ) ) ;
    public final EObject rulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject this_PackageMemberPrefix_0 = null;

        EObject this_NonFeatureMemberElement_1 = null;

        EObject this_FeaturePackageMemberElement_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:831:2: ( (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] ) ) )
            // InternalAlf.g:832:2: (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] ) )
            {
            // InternalAlf.g:832:2: (this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] ) )
            // InternalAlf.g:833:3: this_PackageMemberPrefix_0= rulePackageMemberPrefix[$current] (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] )
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
            		
            // InternalAlf.g:844:3: (this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] | this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current] )
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
                    // InternalAlf.g:845:4: this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current]
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
                    // InternalAlf.g:857:4: this_FeaturePackageMemberElement_2= ruleFeaturePackageMemberElement[$current]
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
    // InternalAlf.g:874:1: rulePackageMemberPrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? ) ;
    public final EObject rulePackageMemberPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedRelationship_0_0 = null;

        Enumerator lv_visibility_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:880:2: ( ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? ) )
            // InternalAlf.g:881:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? )
            {
            // InternalAlf.g:881:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? )
            // InternalAlf.g:882:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )?
            {
            // InternalAlf.g:882:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAlf.g:883:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    {
            	    // InternalAlf.g:883:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    // InternalAlf.g:884:5: lv_ownedRelationship_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getPackageMemberPrefixAccess().getOwnedRelationshipAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_21);
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

            // InternalAlf.g:901:3: ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=58 && LA13_0<=59)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlf.g:902:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    {
                    // InternalAlf.g:902:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    // InternalAlf.g:903:5: lv_visibility_1_0= rulePackageElementVisibilityIndicator
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
    // InternalAlf.g:925:1: ruleNonFeatureMemberElement[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' ) ) ;
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
            // InternalAlf.g:931:2: ( ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' ) ) )
            // InternalAlf.g:932:2: ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' ) )
            {
            // InternalAlf.g:932:2: ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' ) )
            int alt18=5;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalAlf.g:933:3: ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) )
                    {
                    // InternalAlf.g:933:3: ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) )
                    // InternalAlf.g:934:4: (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition )
                    {
                    // InternalAlf.g:934:4: (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition )
                    // InternalAlf.g:935:5: lv_ownedMemberElement_0_0= ruleNonFeatureDefinition
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
                    // InternalAlf.g:953:3: (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
                    {
                    // InternalAlf.g:953:3: (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
                    // InternalAlf.g:954:4: otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getNonFeatureMemberElementAccess().getPackageKeyword_1_0());
                    			
                    // InternalAlf.g:958:4: ( (lv_memberName_2_0= ruleName ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalAlf.g:959:5: (lv_memberName_2_0= ruleName )
                            {
                            // InternalAlf.g:959:5: (lv_memberName_2_0= ruleName )
                            // InternalAlf.g:960:6: lv_memberName_2_0= ruleName
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
                    			
                    // InternalAlf.g:981:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:982:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:982:5: ( ruleQualifiedName )
                    // InternalAlf.g:983:6: ruleQualifiedName
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
                    // InternalAlf.g:1003:3: (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    {
                    // InternalAlf.g:1003:3: (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    // InternalAlf.g:1004:4: otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getNonFeatureMemberElementAccess().getClassKeyword_2_0());
                    			
                    // InternalAlf.g:1008:4: ( (lv_memberName_7_0= ruleName ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalAlf.g:1009:5: (lv_memberName_7_0= ruleName )
                            {
                            // InternalAlf.g:1009:5: (lv_memberName_7_0= ruleName )
                            // InternalAlf.g:1010:6: lv_memberName_7_0= ruleName
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
                    			
                    // InternalAlf.g:1031:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1032:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1032:5: ( ruleQualifiedName )
                    // InternalAlf.g:1033:6: ruleQualifiedName
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
                    // InternalAlf.g:1053:3: (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' )
                    {
                    // InternalAlf.g:1053:3: (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' )
                    // InternalAlf.g:1054:4: otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';'
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getNonFeatureMemberElementAccess().getAssocKeyword_3_0());
                    			
                    // InternalAlf.g:1058:4: ( (lv_memberName_12_0= ruleName ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalAlf.g:1059:5: (lv_memberName_12_0= ruleName )
                            {
                            // InternalAlf.g:1059:5: (lv_memberName_12_0= ruleName )
                            // InternalAlf.g:1060:6: lv_memberName_12_0= ruleName
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
                    			
                    // InternalAlf.g:1081:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1082:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1082:5: ( ruleQualifiedName )
                    // InternalAlf.g:1083:6: ruleQualifiedName
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
                    // InternalAlf.g:1103:3: (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' )
                    {
                    // InternalAlf.g:1103:3: (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' )
                    // InternalAlf.g:1104:4: otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';'
                    {
                    otherlv_16=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getNonFeatureMemberElementAccess().getImportKeyword_4_0());
                    			
                    // InternalAlf.g:1108:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1109:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1109:5: ( ruleQualifiedName )
                    // InternalAlf.g:1110:6: ruleQualifiedName
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

                    // InternalAlf.g:1124:4: (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==20) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalAlf.g:1125:5: otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) )
                            {
                            otherlv_18=(Token)match(input,20,FOLLOW_11); 

                            					newLeafNode(otherlv_18, grammarAccess.getNonFeatureMemberElementAccess().getAsKeyword_4_2_0());
                            				
                            // InternalAlf.g:1129:5: ( (lv_memberName_19_0= ruleName ) )
                            // InternalAlf.g:1130:6: (lv_memberName_19_0= ruleName )
                            {
                            // InternalAlf.g:1130:6: (lv_memberName_19_0= ruleName )
                            // InternalAlf.g:1131:7: lv_memberName_19_0= ruleName
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
    // InternalAlf.g:1159:1: ruleFeaturePackageMemberElement[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) ) ;
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
            // InternalAlf.g:1165:2: ( ( ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) ) )
            // InternalAlf.g:1166:2: ( ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) )
            {
            // InternalAlf.g:1166:2: ( ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' ) )
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
                    else if ( (LA22_4==19||LA22_4==22||(LA22_4>=35 && LA22_4<=38)||LA22_4==41||(LA22_4>=44 && LA22_4<=45)) ) {
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
                    else if ( (LA22_5==19||LA22_5==22||(LA22_5>=35 && LA22_5<=38)||LA22_5==41||(LA22_5>=44 && LA22_5<=45)) ) {
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
                else if ( (LA22_2==19||LA22_2==22||(LA22_2>=35 && LA22_2<=38)||LA22_2==41||(LA22_2>=44 && LA22_2<=45)) ) {
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
                else if ( (LA22_3==19||LA22_3==22||(LA22_3>=35 && LA22_3<=38)||LA22_3==41||(LA22_3>=44 && LA22_3<=45)) ) {
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
                    // InternalAlf.g:1167:3: ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1167:3: ( (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1168:4: (otherlv_0= 'feature' )? ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1168:4: (otherlv_0= 'feature' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==27) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalAlf.g:1169:5: otherlv_0= 'feature'
                            {
                            otherlv_0=(Token)match(input,27,FOLLOW_24); 

                            					newLeafNode(otherlv_0, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_0_0());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1174:4: ( (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1175:5: (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1175:5: (lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1176:6: lv_ownedMemberElement_1_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:1195:3: (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1195:3: (otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:1196:4: otherlv_2= 'feature' ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_1_0());
                    			
                    // InternalAlf.g:1200:4: ( (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:1201:5: (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:1201:5: (lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:1202:6: lv_ownedMemberElement_3_0= ruleUnnamedFeatureDefinition
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
                    // InternalAlf.g:1221:3: ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' )
                    {
                    // InternalAlf.g:1221:3: ( ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';' )
                    // InternalAlf.g:1222:4: ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) ) otherlv_7= 'is' ( ( ruleQualifiedName ) ) otherlv_9= ';'
                    {
                    // InternalAlf.g:1222:4: ( (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? ) | ( (lv_memberName_6_0= ruleName ) ) )
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
                            // InternalAlf.g:1223:5: (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? )
                            {
                            // InternalAlf.g:1223:5: (otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )? )
                            // InternalAlf.g:1224:6: otherlv_4= 'feature' ( (lv_memberName_5_0= ruleName ) )?
                            {
                            otherlv_4=(Token)match(input,27,FOLLOW_22); 

                            						newLeafNode(otherlv_4, grammarAccess.getFeaturePackageMemberElementAccess().getFeatureKeyword_2_0_0_0());
                            					
                            // InternalAlf.g:1228:6: ( (lv_memberName_5_0= ruleName ) )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // InternalAlf.g:1229:7: (lv_memberName_5_0= ruleName )
                                    {
                                    // InternalAlf.g:1229:7: (lv_memberName_5_0= ruleName )
                                    // InternalAlf.g:1230:8: lv_memberName_5_0= ruleName
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
                            // InternalAlf.g:1249:5: ( (lv_memberName_6_0= ruleName ) )
                            {
                            // InternalAlf.g:1249:5: ( (lv_memberName_6_0= ruleName ) )
                            // InternalAlf.g:1250:6: (lv_memberName_6_0= ruleName )
                            {
                            // InternalAlf.g:1250:6: (lv_memberName_6_0= ruleName )
                            // InternalAlf.g:1251:7: lv_memberName_6_0= ruleName
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
                    			
                    // InternalAlf.g:1273:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1274:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1274:5: ( ruleQualifiedName )
                    // InternalAlf.g:1275:6: ruleQualifiedName
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
    // InternalAlf.g:1299:1: ruleCategoryBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) ;
    public final EObject ruleCategoryBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_ownedMembership_2_0 = null;

        EObject lv_ownedImport_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1305:2: ( (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) )
            // InternalAlf.g:1306:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            {
            // InternalAlf.g:1306:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            else if ( (LA24_0==22) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalAlf.g:1307:3: otherlv_0= ';'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getCategoryBodyAccess().getSemicolonKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:1312:3: (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    {
                    // InternalAlf.g:1312:3: (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    // InternalAlf.g:1313:4: otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getCategoryBodyAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalAlf.g:1317:4: ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )*
                    loop23:
                    do {
                        int alt23=3;
                        alt23 = dfa23.predict(input);
                        switch (alt23) {
                    	case 1 :
                    	    // InternalAlf.g:1318:5: ( (lv_ownedMembership_2_0= ruleCategoryMember ) )
                    	    {
                    	    // InternalAlf.g:1318:5: ( (lv_ownedMembership_2_0= ruleCategoryMember ) )
                    	    // InternalAlf.g:1319:6: (lv_ownedMembership_2_0= ruleCategoryMember )
                    	    {
                    	    // InternalAlf.g:1319:6: (lv_ownedMembership_2_0= ruleCategoryMember )
                    	    // InternalAlf.g:1320:7: lv_ownedMembership_2_0= ruleCategoryMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getCategoryBodyAccess().getOwnedMembershipCategoryMemberParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
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
                    	    // InternalAlf.g:1338:5: ( (lv_ownedImport_3_0= rulePackageImport ) )
                    	    {
                    	    // InternalAlf.g:1338:5: ( (lv_ownedImport_3_0= rulePackageImport ) )
                    	    // InternalAlf.g:1339:6: (lv_ownedImport_3_0= rulePackageImport )
                    	    {
                    	    // InternalAlf.g:1339:6: (lv_ownedImport_3_0= rulePackageImport )
                    	    // InternalAlf.g:1340:7: lv_ownedImport_3_0= rulePackageImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getCategoryBodyAccess().getOwnedImportPackageImportParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
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
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,23,FOLLOW_2); 

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
    // InternalAlf.g:1367:1: entryRuleCategoryMember returns [EObject current=null] : iv_ruleCategoryMember= ruleCategoryMember EOF ;
    public final EObject entryRuleCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategoryMember = null;


        try {
            // InternalAlf.g:1367:55: (iv_ruleCategoryMember= ruleCategoryMember EOF )
            // InternalAlf.g:1368:2: iv_ruleCategoryMember= ruleCategoryMember EOF
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
    // InternalAlf.g:1374:1: ruleCategoryMember returns [EObject current=null] : (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember ) ;
    public final EObject ruleCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureCategoryMember_0 = null;

        EObject this_FeatureCategoryMember_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1380:2: ( (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember ) )
            // InternalAlf.g:1381:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember )
            {
            // InternalAlf.g:1381:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalAlf.g:1382:3: this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember
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
                    // InternalAlf.g:1391:3: this_FeatureCategoryMember_1= ruleFeatureCategoryMember
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
    // InternalAlf.g:1403:1: entryRuleNonFeatureCategoryMember returns [EObject current=null] : iv_ruleNonFeatureCategoryMember= ruleNonFeatureCategoryMember EOF ;
    public final EObject entryRuleNonFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureCategoryMember = null;


        try {
            // InternalAlf.g:1403:65: (iv_ruleNonFeatureCategoryMember= ruleNonFeatureCategoryMember EOF )
            // InternalAlf.g:1404:2: iv_ruleNonFeatureCategoryMember= ruleNonFeatureCategoryMember EOF
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
    // InternalAlf.g:1410:1: ruleNonFeatureCategoryMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] ) ;
    public final EObject ruleNonFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject this_CategoryMemberPrefix_0 = null;

        EObject this_NonFeatureMemberElement_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1416:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] ) )
            // InternalAlf.g:1417:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] )
            {
            // InternalAlf.g:1417:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current] )
            // InternalAlf.g:1418:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_NonFeatureMemberElement_1= ruleNonFeatureMemberElement[$current]
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
    // InternalAlf.g:1444:1: entryRuleFeatureCategoryMember returns [EObject current=null] : iv_ruleFeatureCategoryMember= ruleFeatureCategoryMember EOF ;
    public final EObject entryRuleFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCategoryMember = null;


        try {
            // InternalAlf.g:1444:62: (iv_ruleFeatureCategoryMember= ruleFeatureCategoryMember EOF )
            // InternalAlf.g:1445:2: iv_ruleFeatureCategoryMember= ruleFeatureCategoryMember EOF
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
    // InternalAlf.g:1451:1: ruleFeatureCategoryMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_4_0= ruleName ) ) otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ;
    public final EObject ruleFeatureCategoryMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_CategoryMemberPrefix_0 = null;

        EObject this_FeatureMemberElement_1 = null;

        Enumerator lv_direction_2_0 = null;

        EObject lv_ownedMemberFeature_3_0 = null;

        AntlrDatatypeRuleToken lv_memberName_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1457:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_4_0= ruleName ) ) otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            // InternalAlf.g:1458:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_4_0= ruleName ) ) otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            {
            // InternalAlf.g:1458:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_4_0= ruleName ) ) otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            // InternalAlf.g:1459:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_4_0= ruleName ) ) otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) )
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
            		
            // InternalAlf.g:1470:3: (this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] | ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_4_0= ruleName ) ) otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt27=1;
                }
                break;
            case 62:
            case 63:
            case 64:
                {
                alt27=2;
                }
                break;
            case RULE_ID:
                {
                int LA27_3 = input.LA(2);

                if ( (LA27_3==19||LA27_3==22||(LA27_3>=35 && LA27_3<=38)||LA27_3==41||(LA27_3>=44 && LA27_3<=45)) ) {
                    alt27=2;
                }
                else if ( (LA27_3==24) ) {
                    alt27=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNRESTRICTED_NAME:
                {
                int LA27_4 = input.LA(2);

                if ( (LA27_4==24) ) {
                    alt27=3;
                }
                else if ( (LA27_4==19||LA27_4==22||(LA27_4>=35 && LA27_4<=38)||LA27_4==41||(LA27_4>=44 && LA27_4<=45)) ) {
                    alt27=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalAlf.g:1471:4: this_FeatureMemberElement_1= ruleFeatureMemberElement[$current]
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
                    // InternalAlf.g:1483:4: ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1483:4: ( ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1484:5: ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1484:5: ( (lv_direction_2_0= ruleFeatureDirection ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=62 && LA26_0<=64)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalAlf.g:1485:6: (lv_direction_2_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1485:6: (lv_direction_2_0= ruleFeatureDirection )
                            // InternalAlf.g:1486:7: lv_direction_2_0= ruleFeatureDirection
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

                    // InternalAlf.g:1503:5: ( (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1504:6: (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1504:6: (lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1505:7: lv_ownedMemberFeature_3_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:1524:4: ( ( (lv_memberName_4_0= ruleName ) ) otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
                    {
                    // InternalAlf.g:1524:4: ( ( (lv_memberName_4_0= ruleName ) ) otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
                    // InternalAlf.g:1525:5: ( (lv_memberName_4_0= ruleName ) ) otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';'
                    {
                    // InternalAlf.g:1525:5: ( (lv_memberName_4_0= ruleName ) )
                    // InternalAlf.g:1526:6: (lv_memberName_4_0= ruleName )
                    {
                    // InternalAlf.g:1526:6: (lv_memberName_4_0= ruleName )
                    // InternalAlf.g:1527:7: lv_memberName_4_0= ruleName
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
                    				
                    // InternalAlf.g:1548:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1549:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1549:6: ( ruleQualifiedName )
                    // InternalAlf.g:1550:7: ruleQualifiedName
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
    // InternalAlf.g:1575:1: ruleCategoryMemberPrefix[EObject in_current] returns [EObject current=in_current] : ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ) ;
    public final EObject ruleCategoryMemberPrefix(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_ownedRelationship_0_0 = null;

        Enumerator lv_visibility_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1581:2: ( ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ) )
            // InternalAlf.g:1582:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? )
            {
            // InternalAlf.g:1582:2: ( ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? )
            // InternalAlf.g:1583:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            {
            // InternalAlf.g:1583:3: ( (lv_ownedRelationship_0_0= ruleAnnotation ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAlf.g:1584:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    {
            	    // InternalAlf.g:1584:4: (lv_ownedRelationship_0_0= ruleAnnotation )
            	    // InternalAlf.g:1585:5: lv_ownedRelationship_0_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getCategoryMemberPrefixAccess().getOwnedRelationshipAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    break loop28;
                }
            } while (true);

            // InternalAlf.g:1602:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=58 && LA29_0<=61)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAlf.g:1603:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:1603:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:1604:5: lv_visibility_1_0= ruleVisibilityIndicator
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
    // InternalAlf.g:1626:1: ruleFeatureMemberElement[EObject in_current] returns [EObject current=in_current] : ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isPart_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'connector' ( (lv_ownedMemberFeature_12_0= ruleConnectorDefinition ) ) ) | (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) ;
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

        EObject lv_ownedMemberFeature_4_0 = null;

        AntlrDatatypeRuleToken lv_memberName_7_0 = null;

        EObject lv_ownedMemberFeature_12_0 = null;

        AntlrDatatypeRuleToken lv_memberName_14_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1632:2: ( ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isPart_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'connector' ( (lv_ownedMemberFeature_12_0= ruleConnectorDefinition ) ) ) | (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) )
            // InternalAlf.g:1633:2: ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isPart_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'connector' ( (lv_ownedMemberFeature_12_0= ruleConnectorDefinition ) ) ) | (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )
            {
            // InternalAlf.g:1633:2: ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isPart_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'connector' ( (lv_ownedMemberFeature_12_0= ruleConnectorDefinition ) ) ) | (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )
            int alt35=4;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalAlf.g:1634:3: ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1634:3: ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) )
                    // InternalAlf.g:1635:4: (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) )
                    {
                    // InternalAlf.g:1635:4: (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) )
                    int alt30=3;
                    switch ( input.LA(1) ) {
                    case 27:
                        {
                        alt30=1;
                        }
                        break;
                    case 28:
                        {
                        alt30=2;
                        }
                        break;
                    case 29:
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
                            // InternalAlf.g:1636:5: otherlv_0= 'feature'
                            {
                            otherlv_0=(Token)match(input,27,FOLLOW_30); 

                            					newLeafNode(otherlv_0, grammarAccess.getFeatureMemberElementAccess().getFeatureKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1641:5: ( (lv_isPart_1_0= 'part' ) )
                            {
                            // InternalAlf.g:1641:5: ( (lv_isPart_1_0= 'part' ) )
                            // InternalAlf.g:1642:6: (lv_isPart_1_0= 'part' )
                            {
                            // InternalAlf.g:1642:6: (lv_isPart_1_0= 'part' )
                            // InternalAlf.g:1643:7: lv_isPart_1_0= 'part'
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
                            // InternalAlf.g:1656:5: ( (lv_isPort_2_0= 'port' ) )
                            {
                            // InternalAlf.g:1656:5: ( (lv_isPort_2_0= 'port' ) )
                            // InternalAlf.g:1657:6: (lv_isPort_2_0= 'port' )
                            {
                            // InternalAlf.g:1657:6: (lv_isPort_2_0= 'port' )
                            // InternalAlf.g:1658:7: lv_isPort_2_0= 'port'
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

                    // InternalAlf.g:1671:4: ( (lv_direction_3_0= ruleFeatureDirection ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( ((LA31_0>=62 && LA31_0<=64)) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalAlf.g:1672:5: (lv_direction_3_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1672:5: (lv_direction_3_0= ruleFeatureDirection )
                            // InternalAlf.g:1673:6: lv_direction_3_0= ruleFeatureDirection
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

                    // InternalAlf.g:1690:4: ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) )
                    // InternalAlf.g:1691:5: (lv_ownedMemberFeature_4_0= ruleFeatureDefinition )
                    {
                    // InternalAlf.g:1691:5: (lv_ownedMemberFeature_4_0= ruleFeatureDefinition )
                    // InternalAlf.g:1692:6: lv_ownedMemberFeature_4_0= ruleFeatureDefinition
                    {

                    						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getOwnedMemberFeatureFeatureDefinitionParserRuleCall_0_2_0());
                    					
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


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1711:3: ( (otherlv_5= 'feature' | ( (lv_isPart_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    {
                    // InternalAlf.g:1711:3: ( (otherlv_5= 'feature' | ( (lv_isPart_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    // InternalAlf.g:1712:4: (otherlv_5= 'feature' | ( (lv_isPart_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';'
                    {
                    // InternalAlf.g:1712:4: (otherlv_5= 'feature' | ( (lv_isPart_6_0= 'part' ) ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==27) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==28) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalAlf.g:1713:5: otherlv_5= 'feature'
                            {
                            otherlv_5=(Token)match(input,27,FOLLOW_22); 

                            					newLeafNode(otherlv_5, grammarAccess.getFeatureMemberElementAccess().getFeatureKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1718:5: ( (lv_isPart_6_0= 'part' ) )
                            {
                            // InternalAlf.g:1718:5: ( (lv_isPart_6_0= 'part' ) )
                            // InternalAlf.g:1719:6: (lv_isPart_6_0= 'part' )
                            {
                            // InternalAlf.g:1719:6: (lv_isPart_6_0= 'part' )
                            // InternalAlf.g:1720:7: lv_isPart_6_0= 'part'
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

                    // InternalAlf.g:1733:4: ( (lv_memberName_7_0= ruleName ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalAlf.g:1734:5: (lv_memberName_7_0= ruleName )
                            {
                            // InternalAlf.g:1734:5: (lv_memberName_7_0= ruleName )
                            // InternalAlf.g:1735:6: lv_memberName_7_0= ruleName
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
                    			
                    // InternalAlf.g:1756:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1757:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1757:5: ( ruleQualifiedName )
                    // InternalAlf.g:1758:6: ruleQualifiedName
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
                    // InternalAlf.g:1778:3: (otherlv_11= 'connector' ( (lv_ownedMemberFeature_12_0= ruleConnectorDefinition ) ) )
                    {
                    // InternalAlf.g:1778:3: (otherlv_11= 'connector' ( (lv_ownedMemberFeature_12_0= ruleConnectorDefinition ) ) )
                    // InternalAlf.g:1779:4: otherlv_11= 'connector' ( (lv_ownedMemberFeature_12_0= ruleConnectorDefinition ) )
                    {
                    otherlv_11=(Token)match(input,30,FOLLOW_31); 

                    				newLeafNode(otherlv_11, grammarAccess.getFeatureMemberElementAccess().getConnectorKeyword_2_0());
                    			
                    // InternalAlf.g:1783:4: ( (lv_ownedMemberFeature_12_0= ruleConnectorDefinition ) )
                    // InternalAlf.g:1784:5: (lv_ownedMemberFeature_12_0= ruleConnectorDefinition )
                    {
                    // InternalAlf.g:1784:5: (lv_ownedMemberFeature_12_0= ruleConnectorDefinition )
                    // InternalAlf.g:1785:6: lv_ownedMemberFeature_12_0= ruleConnectorDefinition
                    {

                    						newCompositeNode(grammarAccess.getFeatureMemberElementAccess().getOwnedMemberFeatureConnectorDefinitionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberFeature_12_0=ruleConnectorDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureMemberElementRule());
                    						}
                    						set(
                    							current,
                    							"ownedMemberFeature",
                    							lv_ownedMemberFeature_12_0,
                    							"org.omg.sysml.Alf.ConnectorDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1804:3: (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    {
                    // InternalAlf.g:1804:3: (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    // InternalAlf.g:1805:4: otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';'
                    {
                    otherlv_13=(Token)match(input,30,FOLLOW_22); 

                    				newLeafNode(otherlv_13, grammarAccess.getFeatureMemberElementAccess().getConnectorKeyword_3_0());
                    			
                    // InternalAlf.g:1809:4: ( (lv_memberName_14_0= ruleName ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalAlf.g:1810:5: (lv_memberName_14_0= ruleName )
                            {
                            // InternalAlf.g:1810:5: (lv_memberName_14_0= ruleName )
                            // InternalAlf.g:1811:6: lv_memberName_14_0= ruleName
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
                    			
                    // InternalAlf.g:1832:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1833:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1833:5: ( ruleQualifiedName )
                    // InternalAlf.g:1834:6: ruleQualifiedName
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
    // InternalAlf.g:1857:1: entryRuleClassDefinitionOrStub returns [EObject current=null] : iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF ;
    public final EObject entryRuleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:1857:62: (iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:1858:2: iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF
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
    // InternalAlf.g:1864:1: ruleClassDefinitionOrStub returns [EObject current=null] : this_ClassDefinition_0= ruleClassDefinition[$current] ;
    public final EObject ruleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1870:2: (this_ClassDefinition_0= ruleClassDefinition[$current] )
            // InternalAlf.g:1871:2: this_ClassDefinition_0= ruleClassDefinition[$current]
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
    // InternalAlf.g:1886:1: ruleClassDefinition[EObject in_current] returns [EObject current=in_current] : (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) ;
    public final EObject ruleClassDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_ClassDeclaration_0 = null;

        EObject this_CategoryBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1892:2: ( (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] ) )
            // InternalAlf.g:1893:2: (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:1893:2: (this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current] )
            // InternalAlf.g:1894:3: this_ClassDeclaration_0= ruleClassDeclaration[$current] this_CategoryBody_1= ruleCategoryBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getClassDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getClassDefinitionAccess().getClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
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
    // InternalAlf.g:1921:1: ruleClassDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )* )? ) ;
    public final EObject ruleClassDeclaration(EObject in_current) throws RecognitionException {
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
            // InternalAlf.g:1927:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )* )? ) )
            // InternalAlf.g:1928:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )* )? )
            {
            // InternalAlf.g:1928:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )* )? )
            // InternalAlf.g:1929:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )* )?
            {
            // InternalAlf.g:1929:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==31) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAlf.g:1930:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:1930:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:1931:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,31,FOLLOW_33); 

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
            		
            // InternalAlf.g:1947:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:1948:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:1948:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:1949:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getClassDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalAlf.g:1966:3: (otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAlf.g:1967:4: otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )*
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0());
                    			
                    // InternalAlf.g:1971:4: ( (lv_ownedRelationship_4_0= ruleSuperclassing ) )
                    // InternalAlf.g:1972:5: (lv_ownedRelationship_4_0= ruleSuperclassing )
                    {
                    // InternalAlf.g:1972:5: (lv_ownedRelationship_4_0= ruleSuperclassing )
                    // InternalAlf.g:1973:6: lv_ownedRelationship_4_0= ruleSuperclassing
                    {

                    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedRelationshipSuperclassingParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_ownedRelationship_4_0=ruleSuperclassing();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"ownedRelationship",
                    							lv_ownedRelationship_4_0,
                    							"org.omg.sysml.Alf.Superclassing");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:1990:4: (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==33) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalAlf.g:1991:5: otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) )
                    	    {
                    	    otherlv_5=(Token)match(input,33,FOLLOW_11); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:1995:5: ( (lv_ownedRelationship_6_0= ruleSuperclassing ) )
                    	    // InternalAlf.g:1996:6: (lv_ownedRelationship_6_0= ruleSuperclassing )
                    	    {
                    	    // InternalAlf.g:1996:6: (lv_ownedRelationship_6_0= ruleSuperclassing )
                    	    // InternalAlf.g:1997:7: lv_ownedRelationship_6_0= ruleSuperclassing
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedRelationshipSuperclassingParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_ownedRelationship_6_0=ruleSuperclassing();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
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
                    	    break loop37;
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


    // $ANTLR start "entryRuleSuperclassing"
    // InternalAlf.g:2020:1: entryRuleSuperclassing returns [EObject current=null] : iv_ruleSuperclassing= ruleSuperclassing EOF ;
    public final EObject entryRuleSuperclassing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperclassing = null;


        try {
            // InternalAlf.g:2020:54: (iv_ruleSuperclassing= ruleSuperclassing EOF )
            // InternalAlf.g:2021:2: iv_ruleSuperclassing= ruleSuperclassing EOF
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
    // InternalAlf.g:2027:1: ruleSuperclassing returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSuperclassing() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:2033:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2034:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2034:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2035:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:2035:3: ( ruleQualifiedName )
            // InternalAlf.g:2036:4: ruleQualifiedName
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


    // $ANTLR start "entryRuleAssociationDefinitionOrStub"
    // InternalAlf.g:2053:1: entryRuleAssociationDefinitionOrStub returns [EObject current=null] : iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF ;
    public final EObject entryRuleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinitionOrStub = null;


        try {
            // InternalAlf.g:2053:68: (iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF )
            // InternalAlf.g:2054:2: iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF
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
    // InternalAlf.g:2060:1: ruleAssociationDefinitionOrStub returns [EObject current=null] : this_AssociationDefinition_0= ruleAssociationDefinition[$current] ;
    public final EObject ruleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_AssociationDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2066:2: (this_AssociationDefinition_0= ruleAssociationDefinition[$current] )
            // InternalAlf.g:2067:2: this_AssociationDefinition_0= ruleAssociationDefinition[$current]
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
    // InternalAlf.g:2082:1: ruleAssociationDefinition[EObject in_current] returns [EObject current=in_current] : (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] ) ;
    public final EObject ruleAssociationDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_AssociationDeclaration_0 = null;

        EObject this_AssociationBody_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2088:2: ( (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] ) )
            // InternalAlf.g:2089:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] )
            {
            // InternalAlf.g:2089:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current] )
            // InternalAlf.g:2090:3: this_AssociationDeclaration_0= ruleAssociationDeclaration[$current] this_AssociationBody_1= ruleAssociationBody[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getAssociationDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
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
    // InternalAlf.g:2117:1: ruleAssociationDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )* )? ) ;
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
            // InternalAlf.g:2123:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )* )? ) )
            // InternalAlf.g:2124:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )* )? )
            {
            // InternalAlf.g:2124:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )* )? )
            // InternalAlf.g:2125:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) (otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )* )?
            {
            // InternalAlf.g:2125:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==31) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAlf.g:2126:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:2126:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:2127:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,31,FOLLOW_36); 

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
            		
            // InternalAlf.g:2143:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:2144:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:2144:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:2145:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalAlf.g:2162:3: (otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==32) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAlf.g:2163:4: otherlv_3= 'specializes' ( (lv_ownedRelationship_4_0= ruleSuperclassing ) ) (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )*
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getAssociationDeclarationAccess().getSpecializesKeyword_3_0());
                    			
                    // InternalAlf.g:2167:4: ( (lv_ownedRelationship_4_0= ruleSuperclassing ) )
                    // InternalAlf.g:2168:5: (lv_ownedRelationship_4_0= ruleSuperclassing )
                    {
                    // InternalAlf.g:2168:5: (lv_ownedRelationship_4_0= ruleSuperclassing )
                    // InternalAlf.g:2169:6: lv_ownedRelationship_4_0= ruleSuperclassing
                    {

                    						newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getOwnedRelationshipSuperclassingParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_35);
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

                    // InternalAlf.g:2186:4: (otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==33) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalAlf.g:2187:5: otherlv_5= ',' ( (lv_ownedRelationship_6_0= ruleSuperclassing ) )
                    	    {
                    	    otherlv_5=(Token)match(input,33,FOLLOW_11); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAssociationDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:2191:5: ( (lv_ownedRelationship_6_0= ruleSuperclassing ) )
                    	    // InternalAlf.g:2192:6: (lv_ownedRelationship_6_0= ruleSuperclassing )
                    	    {
                    	    // InternalAlf.g:2192:6: (lv_ownedRelationship_6_0= ruleSuperclassing )
                    	    // InternalAlf.g:2193:7: lv_ownedRelationship_6_0= ruleSuperclassing
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getOwnedRelationshipSuperclassingParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
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
                    	    break loop40;
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
    // InternalAlf.g:2217:1: ruleAssociationBody[EObject in_current] returns [EObject current=in_current] : (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) ;
    public final EObject ruleAssociationBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_ownedMembership_2_0 = null;

        EObject lv_ownedImport_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2223:2: ( (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) ) )
            // InternalAlf.g:2224:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            {
            // InternalAlf.g:2224:2: (otherlv_0= ';' | (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==19) ) {
                alt43=1;
            }
            else if ( (LA43_0==22) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalAlf.g:2225:3: otherlv_0= ';'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getAssociationBodyAccess().getSemicolonKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:2230:3: (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    {
                    // InternalAlf.g:2230:3: (otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}' )
                    // InternalAlf.g:2231:4: otherlv_1= '{' ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )* otherlv_4= '}'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_37); 

                    				newLeafNode(otherlv_1, grammarAccess.getAssociationBodyAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalAlf.g:2235:4: ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )*
                    loop42:
                    do {
                        int alt42=3;
                        alt42 = dfa42.predict(input);
                        switch (alt42) {
                    	case 1 :
                    	    // InternalAlf.g:2236:5: ( (lv_ownedMembership_2_0= ruleAssociationMember ) )
                    	    {
                    	    // InternalAlf.g:2236:5: ( (lv_ownedMembership_2_0= ruleAssociationMember ) )
                    	    // InternalAlf.g:2237:6: (lv_ownedMembership_2_0= ruleAssociationMember )
                    	    {
                    	    // InternalAlf.g:2237:6: (lv_ownedMembership_2_0= ruleAssociationMember )
                    	    // InternalAlf.g:2238:7: lv_ownedMembership_2_0= ruleAssociationMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationBodyAccess().getOwnedMembershipAssociationMemberParserRuleCall_1_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
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
                    	    // InternalAlf.g:2256:5: ( (lv_ownedImport_3_0= rulePackageImport ) )
                    	    {
                    	    // InternalAlf.g:2256:5: ( (lv_ownedImport_3_0= rulePackageImport ) )
                    	    // InternalAlf.g:2257:6: (lv_ownedImport_3_0= rulePackageImport )
                    	    {
                    	    // InternalAlf.g:2257:6: (lv_ownedImport_3_0= rulePackageImport )
                    	    // InternalAlf.g:2258:7: lv_ownedImport_3_0= rulePackageImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationBodyAccess().getOwnedImportPackageImportParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
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
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,23,FOLLOW_2); 

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
    // InternalAlf.g:2285:1: entryRuleAssociationMember returns [EObject current=null] : iv_ruleAssociationMember= ruleAssociationMember EOF ;
    public final EObject entryRuleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationMember = null;


        try {
            // InternalAlf.g:2285:58: (iv_ruleAssociationMember= ruleAssociationMember EOF )
            // InternalAlf.g:2286:2: iv_ruleAssociationMember= ruleAssociationMember EOF
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
    // InternalAlf.g:2292:1: ruleAssociationMember returns [EObject current=null] : (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember ) ;
    public final EObject ruleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureCategoryMember_0 = null;

        EObject this_AssociationFeatureMember_1 = null;

        EObject this_AssociationEndFeatureMember_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2298:2: ( (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember ) )
            // InternalAlf.g:2299:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )
            {
            // InternalAlf.g:2299:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )
            int alt44=3;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // InternalAlf.g:2300:3: this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember
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
                    // InternalAlf.g:2309:3: this_AssociationFeatureMember_1= ruleAssociationFeatureMember
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
                    // InternalAlf.g:2318:3: this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember
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
    // InternalAlf.g:2330:1: entryRuleAssociationFeatureMember returns [EObject current=null] : iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF ;
    public final EObject entryRuleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationFeatureMember = null;


        try {
            // InternalAlf.g:2330:65: (iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF )
            // InternalAlf.g:2331:2: iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF
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
    // InternalAlf.g:2337:1: ruleAssociationFeatureMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] ) ;
    public final EObject ruleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject this_CategoryMemberPrefix_0 = null;

        EObject this_FeatureMemberElement_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2343:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] ) )
            // InternalAlf.g:2344:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] )
            {
            // InternalAlf.g:2344:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current] )
            // InternalAlf.g:2345:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] this_FeatureMemberElement_1= ruleFeatureMemberElement[$current]
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getCategoryMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
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
    // InternalAlf.g:2371:1: entryRuleAssociationEndFeatureMember returns [EObject current=null] : iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF ;
    public final EObject entryRuleAssociationEndFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEndFeatureMember = null;


        try {
            // InternalAlf.g:2371:68: (iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF )
            // InternalAlf.g:2372:2: iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF
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
    // InternalAlf.g:2378:1: ruleAssociationEndFeatureMember returns [EObject current=null] : (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) ) ;
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
            // InternalAlf.g:2384:2: ( (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) ) )
            // InternalAlf.g:2385:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) )
            {
            // InternalAlf.g:2385:2: (this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) ) )
            // InternalAlf.g:2386:3: this_CategoryMemberPrefix_0= ruleCategoryMemberPrefix[$current] ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
            			}
            			newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getCategoryMemberPrefixParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            this_CategoryMemberPrefix_0=ruleCategoryMemberPrefix(current);

            state._fsp--;


            			current = this_CategoryMemberPrefix_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:2397:3: ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )
            int alt49=4;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // InternalAlf.g:2398:4: (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2398:4: (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) )
                    // InternalAlf.g:2399:5: otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) )
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_40); 

                    					newLeafNode(otherlv_1, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_1_0_0());
                    				
                    // InternalAlf.g:2403:5: ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )?
                    int alt45=3;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==28) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==29) ) {
                        alt45=2;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalAlf.g:2404:6: ( (lv_isPart_2_0= 'part' ) )
                            {
                            // InternalAlf.g:2404:6: ( (lv_isPart_2_0= 'part' ) )
                            // InternalAlf.g:2405:7: (lv_isPart_2_0= 'part' )
                            {
                            // InternalAlf.g:2405:7: (lv_isPart_2_0= 'part' )
                            // InternalAlf.g:2406:8: lv_isPart_2_0= 'part'
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
                            // InternalAlf.g:2419:6: ( (lv_isPort_3_0= 'port' ) )
                            {
                            // InternalAlf.g:2419:6: ( (lv_isPort_3_0= 'port' ) )
                            // InternalAlf.g:2420:7: (lv_isPort_3_0= 'port' )
                            {
                            // InternalAlf.g:2420:7: (lv_isPort_3_0= 'port' )
                            // InternalAlf.g:2421:8: lv_isPort_3_0= 'port'
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

                    // InternalAlf.g:2434:5: ( (lv_direction_4_0= ruleFeatureDirection ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( ((LA46_0>=62 && LA46_0<=64)) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalAlf.g:2435:6: (lv_direction_4_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2435:6: (lv_direction_4_0= ruleFeatureDirection )
                            // InternalAlf.g:2436:7: lv_direction_4_0= ruleFeatureDirection
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

                    // InternalAlf.g:2453:5: ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) )
                    // InternalAlf.g:2454:6: (lv_ownedMemberFeature_5_0= ruleFeatureDefinition )
                    {
                    // InternalAlf.g:2454:6: (lv_ownedMemberFeature_5_0= ruleFeatureDefinition )
                    // InternalAlf.g:2455:7: lv_ownedMemberFeature_5_0= ruleFeatureDefinition
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
                    // InternalAlf.g:2474:4: (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' )
                    {
                    // InternalAlf.g:2474:4: (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' )
                    // InternalAlf.g:2475:5: otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_41); 

                    					newLeafNode(otherlv_6, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_1_1_0());
                    				
                    // InternalAlf.g:2479:5: ( (lv_isPart_7_0= 'part' ) )
                    // InternalAlf.g:2480:6: (lv_isPart_7_0= 'part' )
                    {
                    // InternalAlf.g:2480:6: (lv_isPart_7_0= 'part' )
                    // InternalAlf.g:2481:7: lv_isPart_7_0= 'part'
                    {
                    lv_isPart_7_0=(Token)match(input,28,FOLLOW_22); 

                    							newLeafNode(lv_isPart_7_0, grammarAccess.getAssociationEndFeatureMemberAccess().getIsPartPartKeyword_1_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    							setWithLastConsumed(current, "isPart", true, "part");
                    						

                    }


                    }

                    // InternalAlf.g:2493:5: ( (lv_memberName_8_0= ruleName ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalAlf.g:2494:6: (lv_memberName_8_0= ruleName )
                            {
                            // InternalAlf.g:2494:6: (lv_memberName_8_0= ruleName )
                            // InternalAlf.g:2495:7: lv_memberName_8_0= ruleName
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
                    				
                    // InternalAlf.g:2516:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:2517:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:2517:6: ( ruleQualifiedName )
                    // InternalAlf.g:2518:7: ruleQualifiedName
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
                    // InternalAlf.g:2538:4: ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2538:4: ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:2539:5: ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:2539:5: ( (lv_direction_12_0= ruleFeatureDirection ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( ((LA48_0>=62 && LA48_0<=64)) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalAlf.g:2540:6: (lv_direction_12_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2540:6: (lv_direction_12_0= ruleFeatureDirection )
                            // InternalAlf.g:2541:7: lv_direction_12_0= ruleFeatureDirection
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

                    // InternalAlf.g:2558:5: ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:2559:6: (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:2559:6: (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:2560:7: lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:2579:4: ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    {
                    // InternalAlf.g:2579:4: ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    // InternalAlf.g:2580:5: ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';'
                    {
                    // InternalAlf.g:2580:5: ( (lv_memberName_14_0= ruleName ) )
                    // InternalAlf.g:2581:6: (lv_memberName_14_0= ruleName )
                    {
                    // InternalAlf.g:2581:6: (lv_memberName_14_0= ruleName )
                    // InternalAlf.g:2582:7: lv_memberName_14_0= ruleName
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
                    				
                    // InternalAlf.g:2603:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:2604:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:2604:6: ( ruleQualifiedName )
                    // InternalAlf.g:2605:7: ruleQualifiedName
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
    // InternalAlf.g:2629:1: entryRuleFeatureDefinition returns [EObject current=null] : iv_ruleFeatureDefinition= ruleFeatureDefinition EOF ;
    public final EObject entryRuleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDefinition = null;


        try {
            // InternalAlf.g:2629:58: (iv_ruleFeatureDefinition= ruleFeatureDefinition EOF )
            // InternalAlf.g:2630:2: iv_ruleFeatureDefinition= ruleFeatureDefinition EOF
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
    // InternalAlf.g:2636:1: ruleFeatureDefinition returns [EObject current=null] : (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) ;
    public final EObject ruleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_NamedFeatureDefinition_0 = null;

        EObject this_UnnamedFeatureDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2642:2: ( (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) )
            // InternalAlf.g:2643:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            {
            // InternalAlf.g:2643:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=44 && LA50_0<=45)) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalAlf.g:2644:3: this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:2653:3: this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition
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
    // InternalAlf.g:2665:1: entryRuleNamedFeatureDefinition returns [EObject current=null] : iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF ;
    public final EObject entryRuleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedFeatureDefinition = null;


        try {
            // InternalAlf.g:2665:63: (iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF )
            // InternalAlf.g:2666:2: iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF
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
    // InternalAlf.g:2672:1: ruleNamedFeatureDefinition returns [EObject current=null] : (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureDeclaration_0 = null;

        EObject this_FeatureCompletion_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2678:2: ( (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:2679:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:2679:2: (this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current] )
            // InternalAlf.g:2680:3: this_FeatureDeclaration_0= ruleFeatureDeclaration[$current] this_FeatureCompletion_1= ruleFeatureCompletion[$current]
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
    // InternalAlf.g:2706:1: entryRuleUnnamedFeatureDefinition returns [EObject current=null] : iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF ;
    public final EObject entryRuleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedFeatureDefinition = null;


        try {
            // InternalAlf.g:2706:65: (iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF )
            // InternalAlf.g:2707:2: iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF
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
    // InternalAlf.g:2713:1: ruleUnnamedFeatureDefinition returns [EObject current=null] : ( ( (lv_ownedRelationship_0_0= ruleSubsetOrRedefinition ) ) (this_TypePart_1= ruleTypePart[$current] )? ( (lv_multiplicity_2_0= ruleMultiplicity ) )? this_FeatureCompletion_3= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedRelationship_0_0 = null;

        EObject this_TypePart_1 = null;

        EObject lv_multiplicity_2_0 = null;

        EObject this_FeatureCompletion_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:2719:2: ( ( ( (lv_ownedRelationship_0_0= ruleSubsetOrRedefinition ) ) (this_TypePart_1= ruleTypePart[$current] )? ( (lv_multiplicity_2_0= ruleMultiplicity ) )? this_FeatureCompletion_3= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:2720:2: ( ( (lv_ownedRelationship_0_0= ruleSubsetOrRedefinition ) ) (this_TypePart_1= ruleTypePart[$current] )? ( (lv_multiplicity_2_0= ruleMultiplicity ) )? this_FeatureCompletion_3= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:2720:2: ( ( (lv_ownedRelationship_0_0= ruleSubsetOrRedefinition ) ) (this_TypePart_1= ruleTypePart[$current] )? ( (lv_multiplicity_2_0= ruleMultiplicity ) )? this_FeatureCompletion_3= ruleFeatureCompletion[$current] )
            // InternalAlf.g:2721:3: ( (lv_ownedRelationship_0_0= ruleSubsetOrRedefinition ) ) (this_TypePart_1= ruleTypePart[$current] )? ( (lv_multiplicity_2_0= ruleMultiplicity ) )? this_FeatureCompletion_3= ruleFeatureCompletion[$current]
            {
            // InternalAlf.g:2721:3: ( (lv_ownedRelationship_0_0= ruleSubsetOrRedefinition ) )
            // InternalAlf.g:2722:4: (lv_ownedRelationship_0_0= ruleSubsetOrRedefinition )
            {
            // InternalAlf.g:2722:4: (lv_ownedRelationship_0_0= ruleSubsetOrRedefinition )
            // InternalAlf.g:2723:5: lv_ownedRelationship_0_0= ruleSubsetOrRedefinition
            {

            					newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedRelationshipSubsetOrRedefinitionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_43);
            lv_ownedRelationship_0_0=ruleSubsetOrRedefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
            					}
            					add(
            						current,
            						"ownedRelationship",
            						lv_ownedRelationship_0_0,
            						"org.omg.sysml.Alf.SubsetOrRedefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:2740:3: (this_TypePart_1= ruleTypePart[$current] )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==38) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAlf.g:2741:4: this_TypePart_1= ruleTypePart[$current]
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

            // InternalAlf.g:2753:3: ( (lv_multiplicity_2_0= ruleMultiplicity ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==41) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAlf.g:2754:4: (lv_multiplicity_2_0= ruleMultiplicity )
                    {
                    // InternalAlf.g:2754:4: (lv_multiplicity_2_0= ruleMultiplicity )
                    // InternalAlf.g:2755:5: lv_multiplicity_2_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getMultiplicityMultiplicityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_42);
                    lv_multiplicity_2_0=ruleMultiplicity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
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
    // InternalAlf.g:2788:1: ruleFeatureBodyDefinition[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_FeatureCompletion_2= ruleFeatureCompletion[$current] ) ;
    public final EObject ruleFeatureBodyDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject this_FeatureDeclaration_1 = null;

        EObject this_FeatureCompletion_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2794:2: ( (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_FeatureCompletion_2= ruleFeatureCompletion[$current] ) )
            // InternalAlf.g:2795:2: (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_FeatureCompletion_2= ruleFeatureCompletion[$current] )
            {
            // InternalAlf.g:2795:2: (otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_FeatureCompletion_2= ruleFeatureCompletion[$current] )
            // InternalAlf.g:2796:3: otherlv_0= 'feature' this_FeatureDeclaration_1= ruleFeatureDeclaration[$current] this_FeatureCompletion_2= ruleFeatureCompletion[$current]
            {
            otherlv_0=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureBodyDefinitionAccess().getFeatureKeyword_0());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFeatureBodyDefinitionRule());
            			}
            			newCompositeNode(grammarAccess.getFeatureBodyDefinitionAccess().getFeatureDeclarationParserRuleCall_1());
            		
            pushFollow(FOLLOW_42);
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
    // InternalAlf.g:2827:1: ruleFeatureDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )* ) ) ) ( (lv_ownedRelationship_6_0= ruleSubsetOrRedefinition ) )? ) ;
    public final EObject ruleFeatureDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_isOrdered_4_0=null;
        Token lv_isNonunique_5_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject this_TypePart_1 = null;

        EObject lv_multiplicity_2_0 = null;

        EObject lv_ownedRelationship_6_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2833:2: ( ( ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )* ) ) ) ( (lv_ownedRelationship_6_0= ruleSubsetOrRedefinition ) )? ) )
            // InternalAlf.g:2834:2: ( ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )* ) ) ) ( (lv_ownedRelationship_6_0= ruleSubsetOrRedefinition ) )? )
            {
            // InternalAlf.g:2834:2: ( ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )* ) ) ) ( (lv_ownedRelationship_6_0= ruleSubsetOrRedefinition ) )? )
            // InternalAlf.g:2835:3: ( (lv_name_0_0= ruleName ) ) (this_TypePart_1= ruleTypePart[$current] )? ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )* ) ) ) ( (lv_ownedRelationship_6_0= ruleSubsetOrRedefinition ) )?
            {
            // InternalAlf.g:2835:3: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:2836:4: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:2836:4: (lv_name_0_0= ruleName )
            // InternalAlf.g:2837:5: lv_name_0_0= ruleName
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

            // InternalAlf.g:2854:3: (this_TypePart_1= ruleTypePart[$current] )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==38) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalAlf.g:2855:4: this_TypePart_1= ruleTypePart[$current]
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

            // InternalAlf.g:2867:3: ( (lv_multiplicity_2_0= ruleMultiplicity ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==41) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAlf.g:2868:4: (lv_multiplicity_2_0= ruleMultiplicity )
                    {
                    // InternalAlf.g:2868:4: (lv_multiplicity_2_0= ruleMultiplicity )
                    // InternalAlf.g:2869:5: lv_multiplicity_2_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getMultiplicityMultiplicityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_47);
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

            // InternalAlf.g:2886:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )* ) ) )
            // InternalAlf.g:2887:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )* ) )
            {
            // InternalAlf.g:2887:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )* ) )
            // InternalAlf.g:2888:5: ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3());
            				
            // InternalAlf.g:2891:5: ( ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )* )
            // InternalAlf.g:2892:6: ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )*
            {
            // InternalAlf.g:2892:6: ( ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) ) )*
            loop55:
            do {
                int alt55=3;
                int LA55_0 = input.LA(1);

                if ( LA55_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3(), 0) ) {
                    alt55=1;
                }
                else if ( LA55_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3(), 1) ) {
                    alt55=2;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalAlf.g:2893:4: ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) )
            	    {
            	    // InternalAlf.g:2893:4: ({...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) ) )
            	    // InternalAlf.g:2894:5: {...}? => ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalAlf.g:2894:115: ( ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) ) )
            	    // InternalAlf.g:2895:6: ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalAlf.g:2898:9: ({...}? => ( (lv_isOrdered_4_0= 'ordered' ) ) )
            	    // InternalAlf.g:2898:10: {...}? => ( (lv_isOrdered_4_0= 'ordered' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureDeclaration", "true");
            	    }
            	    // InternalAlf.g:2898:19: ( (lv_isOrdered_4_0= 'ordered' ) )
            	    // InternalAlf.g:2898:20: (lv_isOrdered_4_0= 'ordered' )
            	    {
            	    // InternalAlf.g:2898:20: (lv_isOrdered_4_0= 'ordered' )
            	    // InternalAlf.g:2899:10: lv_isOrdered_4_0= 'ordered'
            	    {
            	    lv_isOrdered_4_0=(Token)match(input,35,FOLLOW_47); 

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
            	    // InternalAlf.g:2916:4: ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) )
            	    {
            	    // InternalAlf.g:2916:4: ({...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) ) )
            	    // InternalAlf.g:2917:5: {...}? => ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalAlf.g:2917:115: ( ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) ) )
            	    // InternalAlf.g:2918:6: ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalAlf.g:2921:9: ({...}? => ( (lv_isNonunique_5_0= 'nonunique' ) ) )
            	    // InternalAlf.g:2921:10: {...}? => ( (lv_isNonunique_5_0= 'nonunique' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureDeclaration", "true");
            	    }
            	    // InternalAlf.g:2921:19: ( (lv_isNonunique_5_0= 'nonunique' ) )
            	    // InternalAlf.g:2921:20: (lv_isNonunique_5_0= 'nonunique' )
            	    {
            	    // InternalAlf.g:2921:20: (lv_isNonunique_5_0= 'nonunique' )
            	    // InternalAlf.g:2922:10: lv_isNonunique_5_0= 'nonunique'
            	    {
            	    lv_isNonunique_5_0=(Token)match(input,36,FOLLOW_47); 

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
            	    break loop55;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getFeatureDeclarationAccess().getUnorderedGroup_3());
            				

            }

            // InternalAlf.g:2946:3: ( (lv_ownedRelationship_6_0= ruleSubsetOrRedefinition ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=44 && LA56_0<=45)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalAlf.g:2947:4: (lv_ownedRelationship_6_0= ruleSubsetOrRedefinition )
                    {
                    // InternalAlf.g:2947:4: (lv_ownedRelationship_6_0= ruleSubsetOrRedefinition )
                    // InternalAlf.g:2948:5: lv_ownedRelationship_6_0= ruleSubsetOrRedefinition
                    {

                    					newCompositeNode(grammarAccess.getFeatureDeclarationAccess().getOwnedRelationshipSubsetOrRedefinitionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ownedRelationship_6_0=ruleSubsetOrRedefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFeatureDeclarationRule());
                    					}
                    					add(
                    						current,
                    						"ownedRelationship",
                    						lv_ownedRelationship_6_0,
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
    // InternalAlf.g:2970:1: ruleFeatureCompletion[EObject in_current] returns [EObject current=in_current] : ( (otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current] ) ;
    public final EObject ruleFeatureCompletion(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        EObject lv_valuation_1_0 = null;

        EObject this_CategoryBody_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2976:2: ( ( (otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current] ) )
            // InternalAlf.g:2977:2: ( (otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:2977:2: ( (otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current] )
            // InternalAlf.g:2978:3: (otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) ) )? this_CategoryBody_2= ruleCategoryBody[$current]
            {
            // InternalAlf.g:2978:3: (otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==37) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalAlf.g:2979:4: otherlv_0= '=' ( (lv_valuation_1_0= ruleFeatureValue ) )
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_48); 

                    				newLeafNode(otherlv_0, grammarAccess.getFeatureCompletionAccess().getEqualsSignKeyword_0_0());
                    			
                    // InternalAlf.g:2983:4: ( (lv_valuation_1_0= ruleFeatureValue ) )
                    // InternalAlf.g:2984:5: (lv_valuation_1_0= ruleFeatureValue )
                    {
                    // InternalAlf.g:2984:5: (lv_valuation_1_0= ruleFeatureValue )
                    // InternalAlf.g:2985:6: lv_valuation_1_0= ruleFeatureValue
                    {

                    						newCompositeNode(grammarAccess.getFeatureCompletionAccess().getValuationFeatureValueParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_32);
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
    // InternalAlf.g:3018:1: entryRuleFeatureValue returns [EObject current=null] : iv_ruleFeatureValue= ruleFeatureValue EOF ;
    public final EObject entryRuleFeatureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureValue = null;


        try {
            // InternalAlf.g:3018:53: (iv_ruleFeatureValue= ruleFeatureValue EOF )
            // InternalAlf.g:3019:2: iv_ruleFeatureValue= ruleFeatureValue EOF
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
    // InternalAlf.g:3025:1: ruleFeatureValue returns [EObject current=null] : ( (lv_value_0_0= ruleExpression ) ) ;
    public final EObject ruleFeatureValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3031:2: ( ( (lv_value_0_0= ruleExpression ) ) )
            // InternalAlf.g:3032:2: ( (lv_value_0_0= ruleExpression ) )
            {
            // InternalAlf.g:3032:2: ( (lv_value_0_0= ruleExpression ) )
            // InternalAlf.g:3033:3: (lv_value_0_0= ruleExpression )
            {
            // InternalAlf.g:3033:3: (lv_value_0_0= ruleExpression )
            // InternalAlf.g:3034:4: lv_value_0_0= ruleExpression
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
    // InternalAlf.g:3055:1: ruleTypePart[EObject in_current] returns [EObject current=in_current] : (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) ) ;
    public final EObject ruleTypePart(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_isComposite_1_0=null;
        Token otherlv_3=null;
        EObject lv_ownedRelationship_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3061:2: ( (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) ) )
            // InternalAlf.g:3062:2: (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )
            {
            // InternalAlf.g:3062:2: (otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' ) )
            // InternalAlf.g:3063:3: otherlv_0= ':' ( (lv_isComposite_1_0= 'compose' ) )? ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_49); 

            			newLeafNode(otherlv_0, grammarAccess.getTypePartAccess().getColonKeyword_0());
            		
            // InternalAlf.g:3067:3: ( (lv_isComposite_1_0= 'compose' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==39) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAlf.g:3068:4: (lv_isComposite_1_0= 'compose' )
                    {
                    // InternalAlf.g:3068:4: (lv_isComposite_1_0= 'compose' )
                    // InternalAlf.g:3069:5: lv_isComposite_1_0= 'compose'
                    {
                    lv_isComposite_1_0=(Token)match(input,39,FOLLOW_50); 

                    					newLeafNode(lv_isComposite_1_0, grammarAccess.getTypePartAccess().getIsCompositeComposeKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypePartRule());
                    					}
                    					setWithLastConsumed(current, "isComposite", true, "compose");
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:3081:3: ( ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) ) | otherlv_3= 'any' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=RULE_ID && LA59_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt59=1;
            }
            else if ( (LA59_0==40) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalAlf.g:3082:4: ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) )
                    {
                    // InternalAlf.g:3082:4: ( (lv_ownedRelationship_2_0= ruleFeatureTyping ) )
                    // InternalAlf.g:3083:5: (lv_ownedRelationship_2_0= ruleFeatureTyping )
                    {
                    // InternalAlf.g:3083:5: (lv_ownedRelationship_2_0= ruleFeatureTyping )
                    // InternalAlf.g:3084:6: lv_ownedRelationship_2_0= ruleFeatureTyping
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
                    // InternalAlf.g:3102:4: otherlv_3= 'any'
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_2); 

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
    // InternalAlf.g:3111:1: entryRuleFeatureTyping returns [EObject current=null] : iv_ruleFeatureTyping= ruleFeatureTyping EOF ;
    public final EObject entryRuleFeatureTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureTyping = null;


        try {
            // InternalAlf.g:3111:54: (iv_ruleFeatureTyping= ruleFeatureTyping EOF )
            // InternalAlf.g:3112:2: iv_ruleFeatureTyping= ruleFeatureTyping EOF
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
    // InternalAlf.g:3118:1: ruleFeatureTyping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleFeatureTyping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:3124:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:3125:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:3125:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3126:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:3126:3: ( ruleQualifiedName )
            // InternalAlf.g:3127:4: ruleQualifiedName
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
    // InternalAlf.g:3144:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalAlf.g:3144:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalAlf.g:3145:2: iv_ruleMultiplicity= ruleMultiplicity EOF
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
    // InternalAlf.g:3151:1: ruleMultiplicity returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lower_1_0 = null;

        EObject lv_upper_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3157:2: ( (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' ) )
            // InternalAlf.g:3158:2: (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' )
            {
            // InternalAlf.g:3158:2: (otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']' )
            // InternalAlf.g:3159:3: otherlv_0= '[' ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )? ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAlf.g:3163:3: ( ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_NATURAL_VALUE) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==42) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // InternalAlf.g:3164:4: ( (lv_lower_1_0= ruleNaturalLiteralExpression ) ) otherlv_2= '..'
                    {
                    // InternalAlf.g:3164:4: ( (lv_lower_1_0= ruleNaturalLiteralExpression ) )
                    // InternalAlf.g:3165:5: (lv_lower_1_0= ruleNaturalLiteralExpression )
                    {
                    // InternalAlf.g:3165:5: (lv_lower_1_0= ruleNaturalLiteralExpression )
                    // InternalAlf.g:3166:6: lv_lower_1_0= ruleNaturalLiteralExpression
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

                    otherlv_2=(Token)match(input,42,FOLLOW_51); 

                    				newLeafNode(otherlv_2, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalAlf.g:3188:3: ( (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:3189:4: (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:3189:4: (lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression )
            // InternalAlf.g:3190:5: lv_upper_3_0= ruleUnlimitedNaturalLiteralExpression
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

            otherlv_4=(Token)match(input,43,FOLLOW_2); 

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
    // InternalAlf.g:3215:1: entryRuleSubsetOrRedefinition returns [EObject current=null] : iv_ruleSubsetOrRedefinition= ruleSubsetOrRedefinition EOF ;
    public final EObject entryRuleSubsetOrRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsetOrRedefinition = null;


        try {
            // InternalAlf.g:3215:61: (iv_ruleSubsetOrRedefinition= ruleSubsetOrRedefinition EOF )
            // InternalAlf.g:3216:2: iv_ruleSubsetOrRedefinition= ruleSubsetOrRedefinition EOF
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
    // InternalAlf.g:3222:1: ruleSubsetOrRedefinition returns [EObject current=null] : ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition ) ) ;
    public final EObject ruleSubsetOrRedefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Subset_1 = null;

        EObject this_Redefinition_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:3228:2: ( ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition ) ) )
            // InternalAlf.g:3229:2: ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition ) )
            {
            // InternalAlf.g:3229:2: ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==44) ) {
                alt61=1;
            }
            else if ( (LA61_0==45) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalAlf.g:3230:3: (otherlv_0= 'subsets' this_Subset_1= ruleSubset )
                    {
                    // InternalAlf.g:3230:3: (otherlv_0= 'subsets' this_Subset_1= ruleSubset )
                    // InternalAlf.g:3231:4: otherlv_0= 'subsets' this_Subset_1= ruleSubset
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
                    // InternalAlf.g:3245:3: (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition )
                    {
                    // InternalAlf.g:3245:3: (otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition )
                    // InternalAlf.g:3246:4: otherlv_2= 'redefines' this_Redefinition_3= ruleRedefinition
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
    // InternalAlf.g:3263:1: entryRuleRedefinition returns [EObject current=null] : iv_ruleRedefinition= ruleRedefinition EOF ;
    public final EObject entryRuleRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefinition = null;


        try {
            // InternalAlf.g:3263:53: (iv_ruleRedefinition= ruleRedefinition EOF )
            // InternalAlf.g:3264:2: iv_ruleRedefinition= ruleRedefinition EOF
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
    // InternalAlf.g:3270:1: ruleRedefinition returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleRedefinition() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:3276:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:3277:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:3277:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3278:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:3278:3: ( ruleQualifiedName )
            // InternalAlf.g:3279:4: ruleQualifiedName
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
    // InternalAlf.g:3296:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalAlf.g:3296:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalAlf.g:3297:2: iv_ruleSubset= ruleSubset EOF
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
    // InternalAlf.g:3303:1: ruleSubset returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubset() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:3309:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:3310:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:3310:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3311:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:3311:3: ( ruleQualifiedName )
            // InternalAlf.g:3312:4: ruleQualifiedName
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
    // InternalAlf.g:3329:1: entryRuleConnectorDefinition returns [EObject current=null] : iv_ruleConnectorDefinition= ruleConnectorDefinition EOF ;
    public final EObject entryRuleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorDefinition = null;


        try {
            // InternalAlf.g:3329:60: (iv_ruleConnectorDefinition= ruleConnectorDefinition EOF )
            // InternalAlf.g:3330:2: iv_ruleConnectorDefinition= ruleConnectorDefinition EOF
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
    // InternalAlf.g:3336:1: ruleConnectorDefinition returns [EObject current=null] : ( ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) ) this_CategoryBody_17= ruleCategoryBody[$current] ) ;
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
            // InternalAlf.g:3342:2: ( ( ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) ) this_CategoryBody_17= ruleCategoryBody[$current] ) )
            // InternalAlf.g:3343:2: ( ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) ) this_CategoryBody_17= ruleCategoryBody[$current] )
            {
            // InternalAlf.g:3343:2: ( ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) ) this_CategoryBody_17= ruleCategoryBody[$current] )
            // InternalAlf.g:3344:3: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) ) this_CategoryBody_17= ruleCategoryBody[$current]
            {
            // InternalAlf.g:3344:3: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) )
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // InternalAlf.g:3345:4: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) )
                    {
                    // InternalAlf.g:3345:4: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) )
                    // InternalAlf.g:3346:5: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) )
                    {
                    // InternalAlf.g:3346:5: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )?
                    int alt64=2;
                    alt64 = dfa64.predict(input);
                    switch (alt64) {
                        case 1 :
                            // InternalAlf.g:3347:6: ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is'
                            {
                            // InternalAlf.g:3347:6: ( (lv_name_0_0= ruleName ) )?
                            int alt62=2;
                            int LA62_0 = input.LA(1);

                            if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt62=1;
                            }
                            switch (alt62) {
                                case 1 :
                                    // InternalAlf.g:3348:7: (lv_name_0_0= ruleName )
                                    {
                                    // InternalAlf.g:3348:7: (lv_name_0_0= ruleName )
                                    // InternalAlf.g:3349:8: lv_name_0_0= ruleName
                                    {

                                    								newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_0_0_0_0_0());
                                    							
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

                            // InternalAlf.g:3366:6: (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )?
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==38) ) {
                                alt63=1;
                            }
                            switch (alt63) {
                                case 1 :
                                    // InternalAlf.g:3367:7: otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) )
                                    {
                                    otherlv_1=(Token)match(input,38,FOLLOW_11); 

                                    							newLeafNode(otherlv_1, grammarAccess.getConnectorDefinitionAccess().getColonKeyword_0_0_0_1_0());
                                    						
                                    // InternalAlf.g:3371:7: ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) )
                                    // InternalAlf.g:3372:8: (lv_ownedRelationship_2_0= ruleConnectorTyping )
                                    {
                                    // InternalAlf.g:3372:8: (lv_ownedRelationship_2_0= ruleConnectorTyping )
                                    // InternalAlf.g:3373:9: lv_ownedRelationship_2_0= ruleConnectorTyping
                                    {

                                    									newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getOwnedRelationshipConnectorTypingParserRuleCall_0_0_0_1_1_0());
                                    								
                                    pushFollow(FOLLOW_23);
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

                            otherlv_3=(Token)match(input,24,FOLLOW_55); 

                            						newLeafNode(otherlv_3, grammarAccess.getConnectorDefinitionAccess().getIsKeyword_0_0_0_2());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:3396:5: ( (lv_connectorEnd_4_0= ruleConnectorEnd ) )
                    // InternalAlf.g:3397:6: (lv_connectorEnd_4_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:3397:6: (lv_connectorEnd_4_0= ruleConnectorEnd )
                    // InternalAlf.g:3398:7: lv_connectorEnd_4_0= ruleConnectorEnd
                    {

                    							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_0_0_1_0());
                    						
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

                    					newLeafNode(otherlv_5, grammarAccess.getConnectorDefinitionAccess().getToKeyword_0_0_2());
                    				
                    // InternalAlf.g:3419:5: ( (lv_connectorEnd_6_0= ruleConnectorEnd ) )
                    // InternalAlf.g:3420:6: (lv_connectorEnd_6_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:3420:6: (lv_connectorEnd_6_0= ruleConnectorEnd )
                    // InternalAlf.g:3421:7: lv_connectorEnd_6_0= ruleConnectorEnd
                    {

                    							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_0_0_3_0());
                    						
                    pushFollow(FOLLOW_32);
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
                    // InternalAlf.g:3440:4: ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' )
                    {
                    // InternalAlf.g:3440:4: ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' )
                    // InternalAlf.g:3441:5: ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')'
                    {
                    // InternalAlf.g:3441:5: ( (lv_name_7_0= ruleName ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( ((LA65_0>=RULE_ID && LA65_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalAlf.g:3442:6: (lv_name_7_0= ruleName )
                            {
                            // InternalAlf.g:3442:6: (lv_name_7_0= ruleName )
                            // InternalAlf.g:3443:7: lv_name_7_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_0_1_0_0());
                            						
                            pushFollow(FOLLOW_57);
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

                    // InternalAlf.g:3460:5: (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==38) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalAlf.g:3461:6: otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) )
                            {
                            otherlv_8=(Token)match(input,38,FOLLOW_11); 

                            						newLeafNode(otherlv_8, grammarAccess.getConnectorDefinitionAccess().getColonKeyword_0_1_1_0());
                            					
                            // InternalAlf.g:3465:6: ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) )
                            // InternalAlf.g:3466:7: (lv_ownedRelationship_9_0= ruleConnectorTyping )
                            {
                            // InternalAlf.g:3466:7: (lv_ownedRelationship_9_0= ruleConnectorTyping )
                            // InternalAlf.g:3467:8: lv_ownedRelationship_9_0= ruleConnectorTyping
                            {

                            								newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getOwnedRelationshipConnectorTypingParserRuleCall_0_1_1_1_0());
                            							
                            pushFollow(FOLLOW_58);
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

                    otherlv_10=(Token)match(input,47,FOLLOW_55); 

                    					newLeafNode(otherlv_10, grammarAccess.getConnectorDefinitionAccess().getLeftParenthesisKeyword_0_1_2());
                    				
                    // InternalAlf.g:3489:5: ( (lv_connectorEnd_11_0= ruleConnectorEnd ) )
                    // InternalAlf.g:3490:6: (lv_connectorEnd_11_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:3490:6: (lv_connectorEnd_11_0= ruleConnectorEnd )
                    // InternalAlf.g:3491:7: lv_connectorEnd_11_0= ruleConnectorEnd
                    {

                    							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_0_1_3_0());
                    						
                    pushFollow(FOLLOW_59);
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

                    otherlv_12=(Token)match(input,33,FOLLOW_55); 

                    					newLeafNode(otherlv_12, grammarAccess.getConnectorDefinitionAccess().getCommaKeyword_0_1_4());
                    				
                    // InternalAlf.g:3512:5: ( (lv_connectorEnd_13_0= ruleConnectorEnd ) )
                    // InternalAlf.g:3513:6: (lv_connectorEnd_13_0= ruleConnectorEnd )
                    {
                    // InternalAlf.g:3513:6: (lv_connectorEnd_13_0= ruleConnectorEnd )
                    // InternalAlf.g:3514:7: lv_connectorEnd_13_0= ruleConnectorEnd
                    {

                    							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_0_1_5_0());
                    						
                    pushFollow(FOLLOW_60);
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

                    // InternalAlf.g:3531:5: (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==33) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalAlf.g:3532:6: otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) )
                    	    {
                    	    otherlv_14=(Token)match(input,33,FOLLOW_55); 

                    	    						newLeafNode(otherlv_14, grammarAccess.getConnectorDefinitionAccess().getCommaKeyword_0_1_6_0());
                    	    					
                    	    // InternalAlf.g:3536:6: ( (lv_connectorEnd_15_0= ruleConnectorEnd ) )
                    	    // InternalAlf.g:3537:7: (lv_connectorEnd_15_0= ruleConnectorEnd )
                    	    {
                    	    // InternalAlf.g:3537:7: (lv_connectorEnd_15_0= ruleConnectorEnd )
                    	    // InternalAlf.g:3538:8: lv_connectorEnd_15_0= ruleConnectorEnd
                    	    {

                    	    								newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getConnectorEndConnectorEndParserRuleCall_0_1_6_1_0());
                    	    							
                    	    pushFollow(FOLLOW_60);
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
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,48,FOLLOW_32); 

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
    // InternalAlf.g:3577:1: entryRuleConnectorTyping returns [EObject current=null] : iv_ruleConnectorTyping= ruleConnectorTyping EOF ;
    public final EObject entryRuleConnectorTyping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorTyping = null;


        try {
            // InternalAlf.g:3577:56: (iv_ruleConnectorTyping= ruleConnectorTyping EOF )
            // InternalAlf.g:3578:2: iv_ruleConnectorTyping= ruleConnectorTyping EOF
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
    // InternalAlf.g:3584:1: ruleConnectorTyping returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleConnectorTyping() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:3590:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:3591:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:3591:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3592:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:3592:3: ( ruleQualifiedName )
            // InternalAlf.g:3593:4: ruleQualifiedName
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
    // InternalAlf.g:3610:1: entryRuleConnectorEnd returns [EObject current=null] : iv_ruleConnectorEnd= ruleConnectorEnd EOF ;
    public final EObject entryRuleConnectorEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorEnd = null;


        try {
            // InternalAlf.g:3610:53: (iv_ruleConnectorEnd= ruleConnectorEnd EOF )
            // InternalAlf.g:3611:2: iv_ruleConnectorEnd= ruleConnectorEnd EOF
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
    // InternalAlf.g:3617:1: ruleConnectorEnd returns [EObject current=null] : ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleConnectorEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_multiplicity_3_0 = null;

        EObject lv_multiplicity_5_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3623:2: ( ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) ) )
            // InternalAlf.g:3624:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )
            {
            // InternalAlf.g:3624:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // InternalAlf.g:3625:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? )
                    {
                    // InternalAlf.g:3625:3: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? )
                    // InternalAlf.g:3626:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )?
                    {
                    // InternalAlf.g:3626:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )?
                    int alt69=2;
                    alt69 = dfa69.predict(input);
                    switch (alt69) {
                        case 1 :
                            // InternalAlf.g:3627:5: ( ( ruleQualifiedName ) ) otherlv_1= ':'
                            {
                            // InternalAlf.g:3627:5: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:3628:6: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:3628:6: ( ruleQualifiedName )
                            // InternalAlf.g:3629:7: ruleQualifiedName
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

                            otherlv_1=(Token)match(input,38,FOLLOW_11); 

                            					newLeafNode(otherlv_1, grammarAccess.getConnectorEndAccess().getColonKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:3648:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:3649:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:3649:5: ( ruleQualifiedName )
                    // InternalAlf.g:3650:6: ruleQualifiedName
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

                    // InternalAlf.g:3664:4: ( (lv_multiplicity_3_0= ruleMultiplicity ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==41) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalAlf.g:3665:5: (lv_multiplicity_3_0= ruleMultiplicity )
                            {
                            // InternalAlf.g:3665:5: (lv_multiplicity_3_0= ruleMultiplicity )
                            // InternalAlf.g:3666:6: lv_multiplicity_3_0= ruleMultiplicity
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
                    // InternalAlf.g:3685:3: ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) )
                    {
                    // InternalAlf.g:3685:3: ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) )
                    // InternalAlf.g:3686:4: ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) )
                    {
                    // InternalAlf.g:3686:4: ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' )
                    // InternalAlf.g:3687:5: ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>'
                    {
                    // InternalAlf.g:3687:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:3688:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:3688:6: ( ruleQualifiedName )
                    // InternalAlf.g:3689:7: ruleQualifiedName
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

                    // InternalAlf.g:3703:5: ( (lv_multiplicity_5_0= ruleMultiplicity ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==41) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalAlf.g:3704:6: (lv_multiplicity_5_0= ruleMultiplicity )
                            {
                            // InternalAlf.g:3704:6: (lv_multiplicity_5_0= ruleMultiplicity )
                            // InternalAlf.g:3705:7: lv_multiplicity_5_0= ruleMultiplicity
                            {

                            							newCompositeNode(grammarAccess.getConnectorEndAccess().getMultiplicityMultiplicityParserRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_64);
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

                    otherlv_6=(Token)match(input,49,FOLLOW_11); 

                    					newLeafNode(otherlv_6, grammarAccess.getConnectorEndAccess().getEqualsSignGreaterThanSignKeyword_1_0_2());
                    				

                    }

                    // InternalAlf.g:3727:4: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:3728:5: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:3728:5: ( ruleQualifiedName )
                    // InternalAlf.g:3729:6: ruleQualifiedName
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
    // InternalAlf.g:3748:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAlf.g:3748:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAlf.g:3749:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAlf.g:3755:1: ruleExpression returns [EObject current=null] : this_BinaryExpression_0= ruleBinaryExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3761:2: (this_BinaryExpression_0= ruleBinaryExpression )
            // InternalAlf.g:3762:2: this_BinaryExpression_0= ruleBinaryExpression
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
    // InternalAlf.g:3773:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalAlf.g:3773:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalAlf.g:3774:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalAlf.g:3780:1: ruleBinaryExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) ;
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
            // InternalAlf.g:3786:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) )
            // InternalAlf.g:3787:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            {
            // InternalAlf.g:3787:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            // InternalAlf.g:3788:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            {

            			newCompositeNode(grammarAccess.getBinaryExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_65);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3796:3: ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==18||(LA74_0>=50 && LA74_0<=54)) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalAlf.g:3797:4: () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    {
                    // InternalAlf.g:3797:4: ()
                    // InternalAlf.g:3798:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:3804:4: ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
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
                            // InternalAlf.g:3805:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            {
                            // InternalAlf.g:3805:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            // InternalAlf.g:3806:6: ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) )
                            {
                            // InternalAlf.g:3806:6: ( (lv_operator_2_0= ruleBinaryOperator ) )
                            // InternalAlf.g:3807:7: (lv_operator_2_0= ruleBinaryOperator )
                            {
                            // InternalAlf.g:3807:7: (lv_operator_2_0= ruleBinaryOperator )
                            // InternalAlf.g:3808:8: lv_operator_2_0= ruleBinaryOperator
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

                            // InternalAlf.g:3825:6: ( (lv_operand_3_0= ruleExpression ) )
                            // InternalAlf.g:3826:7: (lv_operand_3_0= ruleExpression )
                            {
                            // InternalAlf.g:3826:7: (lv_operand_3_0= ruleExpression )
                            // InternalAlf.g:3827:8: lv_operand_3_0= ruleExpression
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
                            // InternalAlf.g:3846:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            {
                            // InternalAlf.g:3846:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            // InternalAlf.g:3847:6: ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']'
                            {
                            // InternalAlf.g:3847:6: ( (lv_operator_4_0= '@' ) )
                            // InternalAlf.g:3848:7: (lv_operator_4_0= '@' )
                            {
                            // InternalAlf.g:3848:7: (lv_operator_4_0= '@' )
                            // InternalAlf.g:3849:8: lv_operator_4_0= '@'
                            {
                            lv_operator_4_0=(Token)match(input,50,FOLLOW_66); 

                            								newLeafNode(lv_operator_4_0, grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getBinaryExpressionRule());
                            								}
                            								setWithLastConsumed(current, "operator", lv_operator_4_0, "@");
                            							

                            }


                            }

                            otherlv_5=(Token)match(input,41,FOLLOW_48); 

                            						newLeafNode(otherlv_5, grammarAccess.getBinaryExpressionAccess().getLeftSquareBracketKeyword_1_1_1_1());
                            					
                            // InternalAlf.g:3865:6: ( (lv_operand_6_0= ruleExpression ) )
                            // InternalAlf.g:3866:7: (lv_operand_6_0= ruleExpression )
                            {
                            // InternalAlf.g:3866:7: (lv_operand_6_0= ruleExpression )
                            // InternalAlf.g:3867:8: lv_operand_6_0= ruleExpression
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

                            otherlv_7=(Token)match(input,43,FOLLOW_2); 

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
    // InternalAlf.g:3895:1: entryRuleBinaryOperator returns [String current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final String entryRuleBinaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperator = null;


        try {
            // InternalAlf.g:3895:54: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // InternalAlf.g:3896:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
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
    // InternalAlf.g:3902:1: ruleBinaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:3908:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) )
            // InternalAlf.g:3909:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            {
            // InternalAlf.g:3909:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
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
                    // InternalAlf.g:3910:3: kw= '+'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3916:3: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:3922:3: kw= '*'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:3928:3: kw= '/'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:3934:3: kw= '^'
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
    // InternalAlf.g:3943:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlf.g:3943:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlf.g:3944:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalAlf.g:3950:1: ruleUnaryExpression returns [EObject current=null] : (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceAccessExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3956:2: ( (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) )
            // InternalAlf.g:3957:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            {
            // InternalAlf.g:3957:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
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
                    // InternalAlf.g:3958:3: this_SequenceAccessExpression_0= ruleSequenceAccessExpression
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
                    // InternalAlf.g:3967:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    {
                    // InternalAlf.g:3967:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    // InternalAlf.g:3968:4: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    {
                    // InternalAlf.g:3968:4: ()
                    // InternalAlf.g:3969:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:3975:4: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // InternalAlf.g:3976:5: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // InternalAlf.g:3976:5: (lv_operator_2_0= ruleUnaryOperator )
                    // InternalAlf.g:3977:6: lv_operator_2_0= ruleUnaryOperator
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

                    // InternalAlf.g:3994:4: ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    // InternalAlf.g:3995:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    {
                    // InternalAlf.g:3995:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    // InternalAlf.g:3996:6: lv_operand_3_0= ruleSequenceAccessExpression
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
    // InternalAlf.g:4018:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalAlf.g:4018:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalAlf.g:4019:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalAlf.g:4025:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:4031:2: ( (kw= '+' | kw= '-' ) )
            // InternalAlf.g:4032:2: (kw= '+' | kw= '-' )
            {
            // InternalAlf.g:4032:2: (kw= '+' | kw= '-' )
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
                    // InternalAlf.g:4033:3: kw= '+'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:4039:3: kw= '-'
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
    // InternalAlf.g:4048:1: entryRuleSequenceAccessExpression returns [EObject current=null] : iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF ;
    public final EObject entryRuleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceAccessExpression = null;


        try {
            // InternalAlf.g:4048:65: (iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF )
            // InternalAlf.g:4049:2: iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF
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
    // InternalAlf.g:4055:1: ruleSequenceAccessExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) ;
    public final EObject ruleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_index_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4061:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) )
            // InternalAlf.g:4062:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            {
            // InternalAlf.g:4062:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            // InternalAlf.g:4063:3: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            {

            			newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_62);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:4071:3: ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==41) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalAlf.g:4072:4: () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    // InternalAlf.g:4072:4: ()
            	    // InternalAlf.g:4073:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSequenceAccessExpressionAccess().getSequenceAccessExpressionPrimaryAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_48); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSequenceAccessExpressionAccess().getLeftSquareBracketKeyword_1_1());
            	    			
            	    // InternalAlf.g:4083:4: ( (lv_index_3_0= ruleExpression ) )
            	    // InternalAlf.g:4084:5: (lv_index_3_0= ruleExpression )
            	    {
            	    // InternalAlf.g:4084:5: (lv_index_3_0= ruleExpression )
            	    // InternalAlf.g:4085:6: lv_index_3_0= ruleExpression
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

            	    otherlv_4=(Token)match(input,43,FOLLOW_62); 

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
    // InternalAlf.g:4111:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalAlf.g:4111:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalAlf.g:4112:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalAlf.g:4118:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
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
            // InternalAlf.g:4124:2: ( (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // InternalAlf.g:4125:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // InternalAlf.g:4125:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt79=5;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // InternalAlf.g:4126:3: this_LiteralExpression_0= ruleLiteralExpression
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
                    // InternalAlf.g:4135:3: this_ElementReferenceExpression_1= ruleElementReferenceExpression
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
                    // InternalAlf.g:4144:3: this_InstanceCreationExpression_2= ruleInstanceCreationExpression
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
                    // InternalAlf.g:4153:3: this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression
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
                    // InternalAlf.g:4162:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // InternalAlf.g:4162:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // InternalAlf.g:4163:4: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_48); 

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
    // InternalAlf.g:4184:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // InternalAlf.g:4184:67: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // InternalAlf.g:4185:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
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
    // InternalAlf.g:4191:1: ruleElementReferenceExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleElementReferenceExpression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:4197:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:4198:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:4198:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4199:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:4199:3: ( ruleQualifiedName )
            // InternalAlf.g:4200:4: ruleQualifiedName
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
    // InternalAlf.g:4217:1: entryRuleInstanceCreationExpression returns [EObject current=null] : iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF ;
    public final EObject entryRuleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceCreationExpression = null;


        try {
            // InternalAlf.g:4217:67: (iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF )
            // InternalAlf.g:4218:2: iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF
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
    // InternalAlf.g:4224:1: ruleInstanceCreationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' ) ;
    public final EObject ruleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Tuple_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4230:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' ) )
            // InternalAlf.g:4231:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' )
            {
            // InternalAlf.g:4231:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')' )
            // InternalAlf.g:4232:3: ( ( ruleQualifiedName ) ) otherlv_1= '(' (this_Tuple_2= ruleTuple[$current] )? otherlv_3= ')'
            {
            // InternalAlf.g:4232:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4233:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:4233:4: ( ruleQualifiedName )
            // InternalAlf.g:4234:5: ruleQualifiedName
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
            		
            // InternalAlf.g:4252:3: (this_Tuple_2= ruleTuple[$current] )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=RULE_BOOLEAN_VALUE && LA80_0<=RULE_UNRESTRICTED_NAME)||(LA80_0>=17 && LA80_0<=18)||LA80_0==22||LA80_0==47||(LA80_0>=51 && LA80_0<=52)||LA80_0==55) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalAlf.g:4253:4: this_Tuple_2= ruleTuple[$current]
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
    // InternalAlf.g:4274:1: ruleTuple[EObject in_current] returns [EObject current=in_current] : (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] ) ;
    public final EObject ruleTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject this_PositionalTuple_0 = null;

        EObject this_NamedTuple_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:4280:2: ( (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] ) )
            // InternalAlf.g:4281:2: (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] )
            {
            // InternalAlf.g:4281:2: (this_PositionalTuple_0= rulePositionalTuple[$current] | this_NamedTuple_1= ruleNamedTuple[$current] )
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

                if ( ((LA81_2>=16 && LA81_2<=18)||LA81_2==33||LA81_2==41||(LA81_2>=47 && LA81_2<=48)||(LA81_2>=50 && LA81_2<=54)) ) {
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

                if ( ((LA81_3>=16 && LA81_3<=18)||LA81_3==33||LA81_3==41||(LA81_3>=47 && LA81_3<=48)||(LA81_3>=50 && LA81_3<=54)) ) {
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
                    // InternalAlf.g:4282:3: this_PositionalTuple_0= rulePositionalTuple[$current]
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
                    // InternalAlf.g:4294:3: this_NamedTuple_1= ruleNamedTuple[$current]
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
    // InternalAlf.g:4310:1: rulePositionalTuple[EObject in_current] returns [EObject current=in_current] : ( ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )* ) ;
    public final EObject rulePositionalTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_argument_0_0 = null;

        EObject lv_argument_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4316:2: ( ( ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )* ) )
            // InternalAlf.g:4317:2: ( ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )* )
            {
            // InternalAlf.g:4317:2: ( ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )* )
            // InternalAlf.g:4318:3: ( (lv_argument_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )*
            {
            // InternalAlf.g:4318:3: ( (lv_argument_0_0= ruleExpression ) )
            // InternalAlf.g:4319:4: (lv_argument_0_0= ruleExpression )
            {
            // InternalAlf.g:4319:4: (lv_argument_0_0= ruleExpression )
            // InternalAlf.g:4320:5: lv_argument_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPositionalTupleAccess().getArgumentExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
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

            // InternalAlf.g:4337:3: (otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==33) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalAlf.g:4338:4: otherlv_1= ',' ( (lv_argument_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_48); 

            	    				newLeafNode(otherlv_1, grammarAccess.getPositionalTupleAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalAlf.g:4342:4: ( (lv_argument_2_0= ruleExpression ) )
            	    // InternalAlf.g:4343:5: (lv_argument_2_0= ruleExpression )
            	    {
            	    // InternalAlf.g:4343:5: (lv_argument_2_0= ruleExpression )
            	    // InternalAlf.g:4344:6: lv_argument_2_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getPositionalTupleAccess().getArgumentExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
    // InternalAlf.g:4367:1: ruleNamedTuple[EObject in_current] returns [EObject current=in_current] : ( ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )* ) ;
    public final EObject ruleNamedTuple(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_argument_2_0 = null;

        EObject lv_argument_6_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4373:2: ( ( ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )* ) )
            // InternalAlf.g:4374:2: ( ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )* )
            {
            // InternalAlf.g:4374:2: ( ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )* )
            // InternalAlf.g:4375:3: ruleName otherlv_1= '=>' ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getNamedTupleAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_64);
            ruleName();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,49,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedTupleAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalAlf.g:4386:3: ( (lv_argument_2_0= ruleExpression ) )
            // InternalAlf.g:4387:4: (lv_argument_2_0= ruleExpression )
            {
            // InternalAlf.g:4387:4: (lv_argument_2_0= ruleExpression )
            // InternalAlf.g:4388:5: lv_argument_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNamedTupleAccess().getArgumentExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_35);
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

            // InternalAlf.g:4405:3: (otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==33) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalAlf.g:4406:4: otherlv_3= ',' ruleName otherlv_5= '=>' ( (lv_argument_6_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getNamedTupleAccess().getCommaKeyword_3_0());
            	    			

            	    				newCompositeNode(grammarAccess.getNamedTupleAccess().getNameParserRuleCall_3_1());
            	    			
            	    pushFollow(FOLLOW_64);
            	    ruleName();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    otherlv_5=(Token)match(input,49,FOLLOW_48); 

            	    				newLeafNode(otherlv_5, grammarAccess.getNamedTupleAccess().getEqualsSignGreaterThanSignKeyword_3_2());
            	    			
            	    // InternalAlf.g:4421:4: ( (lv_argument_6_0= ruleExpression ) )
            	    // InternalAlf.g:4422:5: (lv_argument_6_0= ruleExpression )
            	    {
            	    // InternalAlf.g:4422:5: (lv_argument_6_0= ruleExpression )
            	    // InternalAlf.g:4423:6: lv_argument_6_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getNamedTupleAccess().getArgumentExpressionParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
    // InternalAlf.g:4445:1: entryRuleSequenceConstructionExpression returns [EObject current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
    public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionExpression = null;


        try {
            // InternalAlf.g:4445:71: (iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:4446:2: iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF
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
    // InternalAlf.g:4452:1: ruleSequenceConstructionExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4458:2: ( ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalAlf.g:4459:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalAlf.g:4459:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // InternalAlf.g:4460:3: () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalAlf.g:4460:3: ()
            // InternalAlf.g:4461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_70); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:4471:3: ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=RULE_BOOLEAN_VALUE && LA85_0<=RULE_UNRESTRICTED_NAME)||(LA85_0>=17 && LA85_0<=18)||LA85_0==22||LA85_0==47||(LA85_0>=51 && LA85_0<=52)||LA85_0==55) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalAlf.g:4472:4: ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:4472:4: ( (lv_element_2_0= ruleExpression ) )
                    // InternalAlf.g:4473:5: (lv_element_2_0= ruleExpression )
                    {
                    // InternalAlf.g:4473:5: (lv_element_2_0= ruleExpression )
                    // InternalAlf.g:4474:6: lv_element_2_0= ruleExpression
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

                    // InternalAlf.g:4491:4: (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==33) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalAlf.g:4492:5: otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,33,FOLLOW_48); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:4496:5: ( (lv_element_4_0= ruleExpression ) )
                    	    // InternalAlf.g:4497:6: (lv_element_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:4497:6: (lv_element_4_0= ruleExpression )
                    	    // InternalAlf.g:4498:7: lv_element_4_0= ruleExpression
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
    // InternalAlf.g:4525:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalAlf.g:4525:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalAlf.g:4526:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalAlf.g:4532:1: ruleLiteralExpression returns [EObject current=null] : (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteralExpression_0 = null;

        EObject this_BooleanLiteralExpression_1 = null;

        EObject this_StringLiteralExpression_2 = null;

        EObject this_RealLiteralExpression_3 = null;

        EObject this_UnlimitedNaturalLiteralExpression_4 = null;



        	enterRule();

        try {
            // InternalAlf.g:4538:2: ( (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:4539:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:4539:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
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

                if ( (LA86_4==17) ) {
                    alt86=4;
                }
                else if ( (LA86_4==EOF||(LA86_4>=18 && LA86_4<=19)||(LA86_4>=22 && LA86_4<=23)||LA86_4==33||LA86_4==41||LA86_4==43||LA86_4==48||(LA86_4>=50 && LA86_4<=54)) ) {
                    alt86=5;
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
                    // InternalAlf.g:4540:3: this_NullLiteralExpression_0= ruleNullLiteralExpression
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
                    // InternalAlf.g:4549:3: this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression
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
                    // InternalAlf.g:4558:3: this_StringLiteralExpression_2= ruleStringLiteralExpression
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
                    // InternalAlf.g:4567:3: this_RealLiteralExpression_3= ruleRealLiteralExpression
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
                    // InternalAlf.g:4576:3: this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:4588:1: entryRuleNullLiteralExpression returns [EObject current=null] : iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF ;
    public final EObject entryRuleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpression = null;


        try {
            // InternalAlf.g:4588:62: (iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF )
            // InternalAlf.g:4589:2: iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF
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
    // InternalAlf.g:4595:1: ruleNullLiteralExpression returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlf.g:4601:2: ( ( () otherlv_1= 'null' ) )
            // InternalAlf.g:4602:2: ( () otherlv_1= 'null' )
            {
            // InternalAlf.g:4602:2: ( () otherlv_1= 'null' )
            // InternalAlf.g:4603:3: () otherlv_1= 'null'
            {
            // InternalAlf.g:4603:3: ()
            // InternalAlf.g:4604:4: 
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
    // InternalAlf.g:4618:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // InternalAlf.g:4618:65: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:4619:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
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
    // InternalAlf.g:4625:1: ruleBooleanLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:4631:2: ( ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) )
            // InternalAlf.g:4632:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            {
            // InternalAlf.g:4632:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:4633:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:4633:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            // InternalAlf.g:4634:4: lv_value_0_0= RULE_BOOLEAN_VALUE
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
    // InternalAlf.g:4653:1: entryRuleStringLiteralExpression returns [EObject current=null] : iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF ;
    public final EObject entryRuleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpression = null;


        try {
            // InternalAlf.g:4653:64: (iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF )
            // InternalAlf.g:4654:2: iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF
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
    // InternalAlf.g:4660:1: ruleStringLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:4666:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalAlf.g:4667:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalAlf.g:4667:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalAlf.g:4668:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalAlf.g:4668:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalAlf.g:4669:4: lv_value_0_0= RULE_STRING_VALUE
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
    // InternalAlf.g:4688:1: entryRuleRealLiteralExpression returns [EObject current=null] : iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF ;
    public final EObject entryRuleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteralExpression = null;


        try {
            // InternalAlf.g:4688:62: (iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF )
            // InternalAlf.g:4689:2: iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF
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
    // InternalAlf.g:4695:1: ruleRealLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4701:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalAlf.g:4702:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalAlf.g:4702:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalAlf.g:4703:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalAlf.g:4703:3: (lv_value_0_0= ruleRealValue )
            // InternalAlf.g:4704:4: lv_value_0_0= ruleRealValue
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
    // InternalAlf.g:4724:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalAlf.g:4724:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalAlf.g:4725:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalAlf.g:4731:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_VALUE_0=null;
        Token kw=null;
        Token this_NATURAL_VALUE_2=null;
        Token this_NATURAL_VALUE_4=null;
        Token this_NATURAL_VALUE_9=null;


        	enterRule();

        try {
            // InternalAlf.g:4737:2: ( ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) )
            // InternalAlf.g:4738:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            {
            // InternalAlf.g:4738:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            // InternalAlf.g:4739:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            {
            // InternalAlf.g:4739:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) )
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
                    // InternalAlf.g:4740:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    {
                    // InternalAlf.g:4740:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    // InternalAlf.g:4741:5: this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    {
                    this_NATURAL_VALUE_0=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_16); 

                    					current.merge(this_NATURAL_VALUE_0);
                    				

                    					newLeafNode(this_NATURAL_VALUE_0, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_0());
                    				
                    kw=(Token)match(input,17,FOLLOW_72); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_0_1());
                    				
                    // InternalAlf.g:4753:5: (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==RULE_NATURAL_VALUE) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalAlf.g:4754:6: this_NATURAL_VALUE_2= RULE_NATURAL_VALUE
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
                    // InternalAlf.g:4764:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    {
                    // InternalAlf.g:4764:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    // InternalAlf.g:4765:5: kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE
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

            // InternalAlf.g:4779:3: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( ((LA91_0>=56 && LA91_0<=57)) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalAlf.g:4780:4: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE
                    {
                    // InternalAlf.g:4780:4: (kw= 'e' | kw= 'E' )
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
                            // InternalAlf.g:4781:5: kw= 'e'
                            {
                            kw=(Token)match(input,56,FOLLOW_75); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:4787:5: kw= 'E'
                            {
                            kw=(Token)match(input,57,FOLLOW_75); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:4793:4: (kw= '+' | kw= '-' )?
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
                            // InternalAlf.g:4794:5: kw= '+'
                            {
                            kw=(Token)match(input,51,FOLLOW_74); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:4800:5: kw= '-'
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
    // InternalAlf.g:4818:1: entryRuleNaturalLiteralExpression returns [EObject current=null] : iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF ;
    public final EObject entryRuleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:4818:65: (iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:4819:2: iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF
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
    // InternalAlf.g:4825:1: ruleNaturalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) ;
    public final EObject ruleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:4831:2: ( ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) )
            // InternalAlf.g:4832:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            {
            // InternalAlf.g:4832:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            // InternalAlf.g:4833:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:4833:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            // InternalAlf.g:4834:4: lv_value_0_0= RULE_NATURAL_VALUE
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
    // InternalAlf.g:4853:1: entryRuleUnlimitedNaturalLiteralExpression returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:4853:74: (iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:4854:2: iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF
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
    // InternalAlf.g:4860:1: ruleUnlimitedNaturalLiteralExpression returns [EObject current=null] : (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NaturalLiteralExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4866:2: ( (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) )
            // InternalAlf.g:4867:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            {
            // InternalAlf.g:4867:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
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
                    // InternalAlf.g:4868:3: this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression
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
                    // InternalAlf.g:4877:3: ( () otherlv_2= '*' )
                    {
                    // InternalAlf.g:4877:3: ( () otherlv_2= '*' )
                    // InternalAlf.g:4878:4: () otherlv_2= '*'
                    {
                    // InternalAlf.g:4878:4: ()
                    // InternalAlf.g:4879:5: 
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
    // InternalAlf.g:4894:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAlf.g:4894:44: (iv_ruleName= ruleName EOF )
            // InternalAlf.g:4895:2: iv_ruleName= ruleName EOF
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
    // InternalAlf.g:4901:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalAlf.g:4907:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalAlf.g:4908:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalAlf.g:4908:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
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
                    // InternalAlf.g:4909:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:4917:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:4928:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlf.g:4928:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlf.g:4929:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlf.g:4935:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_ColonQualifiedName_1 = null;

        AntlrDatatypeRuleToken this_DotQualifiedName_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4941:2: ( (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) )
            // InternalAlf.g:4942:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            {
            // InternalAlf.g:4942:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            int alt94=3;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
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
                case 37:
                case 38:
                case 41:
                case 43:
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
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 94, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA94_0==RULE_UNRESTRICTED_NAME) ) {
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
                case 37:
                case 38:
                case 41:
                case 43:
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
                    // InternalAlf.g:4943:3: this_Name_0= ruleName
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
                    // InternalAlf.g:4954:3: this_ColonQualifiedName_1= ruleColonQualifiedName
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
                    // InternalAlf.g:4965:3: this_DotQualifiedName_2= ruleDotQualifiedName
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
    // InternalAlf.g:4979:1: entryRuleColonQualifiedName returns [String current=null] : iv_ruleColonQualifiedName= ruleColonQualifiedName EOF ;
    public final String entryRuleColonQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColonQualifiedName = null;


        try {
            // InternalAlf.g:4979:58: (iv_ruleColonQualifiedName= ruleColonQualifiedName EOF )
            // InternalAlf.g:4980:2: iv_ruleColonQualifiedName= ruleColonQualifiedName EOF
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
    // InternalAlf.g:4986:1: ruleColonQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleColonQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4992:2: ( (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:4993:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:4993:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            // InternalAlf.g:4994:3: this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:5004:3: (kw= '::' this_Name_2= ruleName )+
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
            	    // InternalAlf.g:5005:4: kw= '::' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,16,FOLLOW_11); 

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
    // InternalAlf.g:5025:1: entryRuleDotQualifiedName returns [String current=null] : iv_ruleDotQualifiedName= ruleDotQualifiedName EOF ;
    public final String entryRuleDotQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDotQualifiedName = null;


        try {
            // InternalAlf.g:5025:56: (iv_ruleDotQualifiedName= ruleDotQualifiedName EOF )
            // InternalAlf.g:5026:2: iv_ruleDotQualifiedName= ruleDotQualifiedName EOF
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
    // InternalAlf.g:5032:1: ruleDotQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleDotQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:5038:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:5039:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:5039:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            // InternalAlf.g:5040:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:5050:3: (kw= '.' this_Name_2= ruleName )+
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
            	    // InternalAlf.g:5051:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,17,FOLLOW_11); 

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
    // InternalAlf.g:5071:1: rulePackageElementVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator rulePackageElementVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAlf.g:5077:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // InternalAlf.g:5078:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // InternalAlf.g:5078:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
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
                    // InternalAlf.g:5079:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:5079:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:5080:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getPackageElementVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPackageElementVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:5087:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:5087:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:5088:4: enumLiteral_1= 'private'
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
    // InternalAlf.g:5098:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAlf.g:5104:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) )
            // InternalAlf.g:5105:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            {
            // InternalAlf.g:5105:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
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
                    // InternalAlf.g:5106:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:5106:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:5107:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:5114:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:5114:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:5115:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:5122:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalAlf.g:5122:3: (enumLiteral_2= 'protected' )
                    // InternalAlf.g:5123:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:5130:3: (enumLiteral_3= 'packaged' )
                    {
                    // InternalAlf.g:5130:3: (enumLiteral_3= 'packaged' )
                    // InternalAlf.g:5131:4: enumLiteral_3= 'packaged'
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
    // InternalAlf.g:5141:1: ruleFeatureDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFeatureDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAlf.g:5147:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalAlf.g:5148:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalAlf.g:5148:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
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
                    // InternalAlf.g:5149:3: (enumLiteral_0= 'in' )
                    {
                    // InternalAlf.g:5149:3: (enumLiteral_0= 'in' )
                    // InternalAlf.g:5150:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:5157:3: (enumLiteral_1= 'out' )
                    {
                    // InternalAlf.g:5157:3: (enumLiteral_1= 'out' )
                    // InternalAlf.g:5158:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:5165:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalAlf.g:5165:3: (enumLiteral_2= 'inout' )
                    // InternalAlf.g:5166:4: enumLiteral_2= 'inout'
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
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA69 dfa69 = new DFA69(this);
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
    static final String dfa_8s = "\2\4\1\uffff\2\17\1\10\2\20\2\10\1\uffff\2\21\1\uffff\2\20\2\10";
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
            "\1\11\1\10\1\uffff\2\12",
            "\1\11\1\10\1\uffff\2\12",
            "\1\13\1\14\10\uffff\1\15",
            "\1\16\1\17\10\uffff\1\15",
            "",
            "\1\20\1\uffff\2\12",
            "\1\20\1\uffff\2\12",
            "",
            "\1\21\2\uffff\2\12",
            "\1\21\2\uffff\2\12",
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
            return "()* loopback of 769:3: ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_17s = "\17\uffff";
    static final String dfa_18s = "\1\17\1\10\1\uffff\2\10\1\uffff\2\26\1\uffff\2\23\1\uffff\2\23\1\uffff";
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
            "\1\2\2\uffff\1\2\1\uffff\1\13\7\uffff\1\2",
            "\1\2\2\uffff\1\2\1\uffff\1\13\7\uffff\1\2",
            "",
            "\1\2\2\uffff\1\2\1\uffff\1\16\7\uffff\1\2",
            "\1\2\2\uffff\1\2\1\uffff\1\16\7\uffff\1\2",
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
            return "932:2: ( ( (lv_ownedMemberElement_0_0= ruleNonFeatureDefinition ) ) | (otherlv_1= 'package' ( (lv_memberName_2_0= ruleName ) )? otherlv_3= 'is' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) | (otherlv_6= 'class' ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'assoc' ( (lv_memberName_12_0= ruleName ) )? otherlv_13= 'is' ( ( ruleQualifiedName ) ) otherlv_15= ';' ) | (otherlv_16= 'import' ( ( ruleQualifiedName ) ) (otherlv_18= 'as' ( (lv_memberName_19_0= ruleName ) ) )? otherlv_20= ';' ) )";
        }
    }
    static final String dfa_23s = "\1\100\1\uffff\3\100\1\uffff\1\11\2\24\2\22\2\24\1\uffff\2\24\2\22";
    static final String[] dfa_24s = {
            "\1\2\3\uffff\2\5\5\uffff\1\6\5\uffff\1\5\1\uffff\1\1\1\uffff\7\5\32\uffff\1\3\1\4\5\5",
            "",
            "\1\2\3\uffff\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\7\5\32\uffff\1\3\1\4\5\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\7\5\36\uffff\3\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\7\5\36\uffff\3\5",
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
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_23;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "()* loopback of 1317:4: ( ( (lv_ownedMembership_2_0= ruleCategoryMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_25s = "\10\uffff";
    static final String dfa_26s = "\2\4\4\10\2\uffff";
    static final String dfa_27s = "\6\100\2\uffff";
    static final String dfa_28s = "\6\uffff\1\1\1\2";
    static final String dfa_29s = "\10\uffff}>";
    static final String[] dfa_30s = {
            "\1\1\3\uffff\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\4\7\1\6\32\uffff\1\2\1\3\1\4\1\5\3\7",
            "\1\1\3\uffff\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\4\7\1\6\32\uffff\1\2\1\3\1\4\1\5\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\4\7\1\6\36\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\4\7\1\6\36\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\4\7\1\6\36\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\4\7\1\6\36\uffff\3\7",
            "",
            ""
    };

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "1381:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_FeatureCategoryMember_1= ruleFeatureCategoryMember )";
        }
    }
    static final String dfa_31s = "\25\uffff";
    static final String dfa_32s = "\1\33\2\10\1\uffff\1\10\2\23\1\uffff\2\20\1\10\1\uffff\2\20\2\10\1\uffff\2\21\2\20";
    static final String dfa_33s = "\1\36\2\100\1\uffff\1\57\2\55\1\uffff\2\61\1\11\1\uffff\2\61\2\11\1\uffff\4\61";
    static final String dfa_34s = "\3\uffff\1\1\3\uffff\1\2\3\uffff\1\3\4\uffff\1\4\4\uffff";
    static final String dfa_35s = "\25\uffff}>";
    static final String[] dfa_36s = {
            "\1\1\1\2\1\3\1\4",
            "\1\5\1\6\16\uffff\1\7\23\uffff\2\3\20\uffff\3\3",
            "\1\5\1\6\16\uffff\1\7\23\uffff\2\3\20\uffff\3\3",
            "",
            "\1\10\1\11\16\uffff\1\12\15\uffff\1\13\10\uffff\1\13",
            "\1\3\2\uffff\1\3\1\uffff\1\7\12\uffff\4\3\2\uffff\1\3\2\uffff\2\3",
            "\1\3\2\uffff\1\3\1\uffff\1\7\12\uffff\4\3\2\uffff\1\3\2\uffff\2\3",
            "",
            "\2\13\6\uffff\1\12\15\uffff\1\13\2\uffff\1\13\4\uffff\2\13\1\uffff\1\13",
            "\2\13\6\uffff\1\12\15\uffff\1\13\2\uffff\1\13\4\uffff\2\13\1\uffff\1\13",
            "\1\14\1\15",
            "",
            "\1\17\1\16\1\uffff\1\20\22\uffff\1\13\2\uffff\1\13\4\uffff\1\13\2\uffff\1\13",
            "\1\17\1\16\1\uffff\1\20\22\uffff\1\13\2\uffff\1\13\4\uffff\1\13\2\uffff\1\13",
            "\1\21\1\22",
            "\1\23\1\24",
            "",
            "\1\16\1\uffff\1\20\22\uffff\1\13\2\uffff\1\13\4\uffff\1\13\2\uffff\1\13",
            "\1\16\1\uffff\1\20\22\uffff\1\13\2\uffff\1\13\4\uffff\1\13\2\uffff\1\13",
            "\1\17\2\uffff\1\20\22\uffff\1\13\2\uffff\1\13\4\uffff\1\13\2\uffff\1\13",
            "\1\17\2\uffff\1\20\22\uffff\1\13\2\uffff\1\13\4\uffff\1\13\2\uffff\1\13"
    };

    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[][] dfa_36 = unpackEncodedStringArray(dfa_36s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_31;
            this.eof = dfa_31;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "1633:2: ( ( (otherlv_0= 'feature' | ( (lv_isPart_1_0= 'part' ) ) | ( (lv_isPort_2_0= 'port' ) ) ) ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_4_0= ruleFeatureDefinition ) ) ) | ( (otherlv_5= 'feature' | ( (lv_isPart_6_0= 'part' ) ) ) ( (lv_memberName_7_0= ruleName ) )? otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) | (otherlv_11= 'connector' ( (lv_ownedMemberFeature_12_0= ruleConnectorDefinition ) ) ) | (otherlv_13= 'connector' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )";
        }
    }
    static final String[] dfa_37s = {
            "\1\2\3\uffff\2\5\5\uffff\1\6\5\uffff\1\5\1\uffff\1\1\1\uffff\7\5\2\uffff\1\5\27\uffff\1\3\1\4\5\5",
            "",
            "\1\2\3\uffff\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\7\5\2\uffff\1\5\27\uffff\1\3\1\4\5\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\7\5\2\uffff\1\5\33\uffff\3\5",
            "\2\5\5\uffff\1\6\5\uffff\1\5\3\uffff\7\5\2\uffff\1\5\33\uffff\3\5",
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
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_23;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "()* loopback of 2235:4: ( ( (lv_ownedMembership_2_0= ruleAssociationMember ) ) | ( (lv_ownedImport_3_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_38s = "\11\uffff";
    static final String dfa_39s = "\2\4\4\10\3\uffff";
    static final String dfa_40s = "\6\100\3\uffff";
    static final String dfa_41s = "\6\uffff\1\1\1\2\1\3";
    static final String dfa_42s = "\11\uffff}>";
    static final String[] dfa_43s = {
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

    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_38;
            this.eof = dfa_38;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "2299:2: (this_NonFeatureCategoryMember_0= ruleNonFeatureCategoryMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )";
        }
    }
    static final String dfa_44s = "\13\uffff";
    static final String dfa_45s = "\2\10\1\uffff\2\23\1\10\2\uffff\2\23\1\uffff";
    static final String dfa_46s = "\2\100\1\uffff\2\55\1\100\2\uffff\2\55\1\uffff";
    static final String dfa_47s = "\2\uffff\1\3\3\uffff\1\1\1\4\2\uffff\1\2";
    static final String dfa_48s = "\13\uffff}>";
    static final String[] dfa_49s = {
            "\1\3\1\4\30\uffff\1\1\33\uffff\3\2",
            "\2\6\22\uffff\1\5\1\6\16\uffff\2\6\20\uffff\3\6",
            "",
            "\1\2\2\uffff\1\2\1\uffff\1\7\12\uffff\4\2\2\uffff\1\2\2\uffff\2\2",
            "\1\2\2\uffff\1\2\1\uffff\1\7\12\uffff\4\2\2\uffff\1\2\2\uffff\2\2",
            "\1\10\1\11\16\uffff\1\12\23\uffff\2\6\20\uffff\3\6",
            "",
            "",
            "\1\6\2\uffff\1\6\1\uffff\1\12\12\uffff\4\6\2\uffff\1\6\2\uffff\2\6",
            "\1\6\2\uffff\1\6\1\uffff\1\12\12\uffff\4\6\2\uffff\1\6\2\uffff\2\6",
            ""
    };

    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[][] dfa_49 = unpackEncodedStringArray(dfa_49s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "2397:3: ( (otherlv_1= 'end' ( ( (lv_isPart_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'end' ( (lv_isPart_7_0= 'part' ) ) ( (lv_memberName_8_0= ruleName ) )? otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) | ( ( (lv_direction_12_0= ruleFeatureDirection ) )? ( (lv_ownedMemberFeature_13_0= ruleNamedFeatureDefinition ) ) ) | ( ( (lv_memberName_14_0= ruleName ) ) otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) )";
        }
    }
    static final String dfa_50s = "\27\uffff";
    static final String dfa_51s = "\1\10\2\20\1\10\2\uffff\1\10\4\20\4\10\2\21\2\20\2\21\2\20";
    static final String dfa_52s = "\1\57\2\61\1\11\2\uffff\1\11\4\57\4\11\10\57";
    static final String dfa_53s = "\4\uffff\1\1\1\2\21\uffff";
    static final String dfa_54s = "\27\uffff}>";
    static final String[] dfa_55s = {
            "\1\1\1\2\16\uffff\1\4\15\uffff\1\3\10\uffff\1\5",
            "\2\4\6\uffff\1\4\15\uffff\1\6\2\uffff\1\4\4\uffff\1\4\1\5\1\uffff\1\4",
            "\2\4\6\uffff\1\4\15\uffff\1\6\2\uffff\1\4\4\uffff\1\4\1\5\1\uffff\1\4",
            "\1\7\1\10",
            "",
            "",
            "\1\11\1\12",
            "\1\14\1\13\6\uffff\1\4\26\uffff\1\5",
            "\1\14\1\13\6\uffff\1\4\26\uffff\1\5",
            "\1\16\1\15\6\uffff\1\4\20\uffff\1\4\4\uffff\1\4\1\5",
            "\1\16\1\15\6\uffff\1\4\20\uffff\1\4\4\uffff\1\4\1\5",
            "\1\17\1\20",
            "\1\21\1\22",
            "\1\23\1\24",
            "\1\25\1\26",
            "\1\13\6\uffff\1\4\26\uffff\1\5",
            "\1\13\6\uffff\1\4\26\uffff\1\5",
            "\1\14\7\uffff\1\4\26\uffff\1\5",
            "\1\14\7\uffff\1\4\26\uffff\1\5",
            "\1\15\6\uffff\1\4\20\uffff\1\4\4\uffff\1\4\1\5",
            "\1\15\6\uffff\1\4\20\uffff\1\4\4\uffff\1\4\1\5",
            "\1\16\7\uffff\1\4\20\uffff\1\4\4\uffff\1\4\1\5",
            "\1\16\7\uffff\1\4\20\uffff\1\4\4\uffff\1\4\1\5"
    };

    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final char[] dfa_51 = DFA.unpackEncodedStringToUnsignedChars(dfa_51s);
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[][] dfa_55 = unpackEncodedStringArray(dfa_55s);

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = dfa_50;
            this.eof = dfa_50;
            this.min = dfa_51;
            this.max = dfa_52;
            this.accept = dfa_53;
            this.special = dfa_54;
            this.transition = dfa_55;
        }
        public String getDescription() {
            return "3344:3: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )? ( (lv_connectorEnd_4_0= ruleConnectorEnd ) ) otherlv_5= 'to' ( (lv_connectorEnd_6_0= ruleConnectorEnd ) ) ) | ( ( (lv_name_7_0= ruleName ) )? (otherlv_8= ':' ( (lv_ownedRelationship_9_0= ruleConnectorTyping ) ) )? otherlv_10= '(' ( (lv_connectorEnd_11_0= ruleConnectorEnd ) ) otherlv_12= ',' ( (lv_connectorEnd_13_0= ruleConnectorEnd ) ) (otherlv_14= ',' ( (lv_connectorEnd_15_0= ruleConnectorEnd ) ) )* otherlv_16= ')' ) )";
        }
    }
    static final String dfa_56s = "\16\uffff";
    static final String dfa_57s = "\1\10\2\20\2\uffff\1\10\2\20\2\10\2\21\2\20";
    static final String dfa_58s = "\1\46\2\61\2\uffff\1\11\2\56\2\11\4\56";
    static final String dfa_59s = "\3\uffff\1\1\1\2\11\uffff";
    static final String dfa_60s = "\16\uffff}>";
    static final String[] dfa_61s = {
            "\1\1\1\2\16\uffff\1\3\15\uffff\1\3",
            "\2\4\6\uffff\1\3\15\uffff\1\5\2\uffff\1\4\4\uffff\1\4\2\uffff\1\4",
            "\2\4\6\uffff\1\3\15\uffff\1\5\2\uffff\1\4\4\uffff\1\4\2\uffff\1\4",
            "",
            "",
            "\1\6\1\7",
            "\1\11\1\10\6\uffff\1\3\20\uffff\1\4\4\uffff\1\4",
            "\1\11\1\10\6\uffff\1\3\20\uffff\1\4\4\uffff\1\4",
            "\1\12\1\13",
            "\1\14\1\15",
            "\1\10\6\uffff\1\3\20\uffff\1\4\4\uffff\1\4",
            "\1\10\6\uffff\1\3\20\uffff\1\4\4\uffff\1\4",
            "\1\11\7\uffff\1\3\20\uffff\1\4\4\uffff\1\4",
            "\1\11\7\uffff\1\3\20\uffff\1\4\4\uffff\1\4"
    };

    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final char[] dfa_57 = DFA.unpackEncodedStringToUnsignedChars(dfa_57s);
    static final char[] dfa_58 = DFA.unpackEncodedStringToUnsignedChars(dfa_58s);
    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final short[] dfa_60 = DFA.unpackEncodedString(dfa_60s);
    static final short[][] dfa_61 = unpackEncodedStringArray(dfa_61s);

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_56;
            this.eof = dfa_56;
            this.min = dfa_57;
            this.max = dfa_58;
            this.accept = dfa_59;
            this.special = dfa_60;
            this.transition = dfa_61;
        }
        public String getDescription() {
            return "3346:5: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( (lv_ownedRelationship_2_0= ruleConnectorTyping ) ) )? otherlv_3= 'is' )?";
        }
    }
    static final String dfa_62s = "\21\uffff";
    static final String dfa_63s = "\1\uffff\2\4\7\uffff\4\4\1\uffff\1\4\1\uffff";
    static final String dfa_64s = "\1\10\2\20\1\7\1\uffff\2\10\1\uffff\1\52\1\53\2\21\2\20\1\7\1\23\1\53";
    static final String dfa_65s = "\1\11\2\61\1\22\1\uffff\2\11\1\uffff\2\53\4\61\1\22\1\61\1\53";
    static final String dfa_66s = "\4\uffff\1\1\2\uffff\1\2\11\uffff";
    static final String dfa_67s = "\21\uffff}>";
    static final String[] dfa_68s = {
            "\1\1\1\2",
            "\1\6\1\5\1\uffff\1\4\2\uffff\1\4\12\uffff\1\4\4\uffff\1\4\2\uffff\1\3\4\uffff\1\4\1\uffff\1\4\1\7",
            "\1\6\1\5\1\uffff\1\4\2\uffff\1\4\12\uffff\1\4\4\uffff\1\4\2\uffff\1\3\4\uffff\1\4\1\uffff\1\4\1\7",
            "\1\10\12\uffff\1\11",
            "",
            "\1\12\1\13",
            "\1\14\1\15",
            "",
            "\1\16\1\17",
            "\1\17",
            "\1\5\1\uffff\1\4\2\uffff\1\4\12\uffff\1\4\4\uffff\1\4\2\uffff\1\3\4\uffff\1\4\1\uffff\1\4\1\7",
            "\1\5\1\uffff\1\4\2\uffff\1\4\12\uffff\1\4\4\uffff\1\4\2\uffff\1\3\4\uffff\1\4\1\uffff\1\4\1\7",
            "\1\6\2\uffff\1\4\2\uffff\1\4\12\uffff\1\4\4\uffff\1\4\2\uffff\1\3\4\uffff\1\4\1\uffff\1\4\1\7",
            "\1\6\2\uffff\1\4\2\uffff\1\4\12\uffff\1\4\4\uffff\1\4\2\uffff\1\3\4\uffff\1\4\1\uffff\1\4\1\7",
            "\1\20\12\uffff\1\11",
            "\1\4\2\uffff\1\4\12\uffff\1\4\14\uffff\1\4\1\uffff\1\4\1\7",
            "\1\17"
    };

    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final char[] dfa_64 = DFA.unpackEncodedStringToUnsignedChars(dfa_64s);
    static final char[] dfa_65 = DFA.unpackEncodedStringToUnsignedChars(dfa_65s);
    static final short[] dfa_66 = DFA.unpackEncodedString(dfa_66s);
    static final short[] dfa_67 = DFA.unpackEncodedString(dfa_67s);
    static final short[][] dfa_68 = unpackEncodedStringArray(dfa_68s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_62;
            this.eof = dfa_63;
            this.min = dfa_64;
            this.max = dfa_65;
            this.accept = dfa_66;
            this.special = dfa_67;
            this.transition = dfa_68;
        }
        public String getDescription() {
            return "3624:2: ( ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )? ( ( ruleQualifiedName ) ) ( (lv_multiplicity_3_0= ruleMultiplicity ) )? ) | ( ( ( ( ruleQualifiedName ) ) ( (lv_multiplicity_5_0= ruleMultiplicity ) )? otherlv_6= '=>' ) ( ( ruleQualifiedName ) ) ) )";
        }
    }
    static final String dfa_69s = "\1\uffff\2\4\4\uffff\4\4";
    static final String dfa_70s = "\1\10\2\20\1\10\1\uffff\1\10\1\uffff\2\21\2\20";
    static final String dfa_71s = "\1\11\2\60\1\11\1\uffff\1\11\1\uffff\4\60";
    static final String dfa_72s = "\4\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String[] dfa_73s = {
            "\1\1\1\2",
            "\1\5\1\3\1\uffff\1\4\2\uffff\1\4\12\uffff\1\4\4\uffff\1\6\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4",
            "\1\5\1\3\1\uffff\1\4\2\uffff\1\4\12\uffff\1\4\4\uffff\1\6\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4",
            "\1\7\1\10",
            "",
            "\1\11\1\12",
            "",
            "\1\3\1\uffff\1\4\2\uffff\1\4\12\uffff\1\4\4\uffff\1\6\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4",
            "\1\3\1\uffff\1\4\2\uffff\1\4\12\uffff\1\4\4\uffff\1\6\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4",
            "\1\5\2\uffff\1\4\2\uffff\1\4\12\uffff\1\4\4\uffff\1\6\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4",
            "\1\5\2\uffff\1\4\2\uffff\1\4\12\uffff\1\4\4\uffff\1\6\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4"
    };
    static final short[] dfa_69 = DFA.unpackEncodedString(dfa_69s);
    static final char[] dfa_70 = DFA.unpackEncodedStringToUnsignedChars(dfa_70s);
    static final char[] dfa_71 = DFA.unpackEncodedStringToUnsignedChars(dfa_71s);
    static final short[] dfa_72 = DFA.unpackEncodedString(dfa_72s);
    static final short[][] dfa_73 = unpackEncodedStringArray(dfa_73s);

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = dfa_44;
            this.eof = dfa_69;
            this.min = dfa_70;
            this.max = dfa_71;
            this.accept = dfa_72;
            this.special = dfa_48;
            this.transition = dfa_73;
        }
        public String getDescription() {
            return "3626:4: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' )?";
        }
    }
    static final String dfa_74s = "\2\uffff\2\7\6\uffff\4\7";
    static final String dfa_75s = "\1\5\1\uffff\2\20\4\uffff\2\10\2\21\2\20";
    static final String dfa_76s = "\1\67\1\uffff\2\66\4\uffff\2\11\4\66";
    static final String dfa_77s = "\1\uffff\1\1\2\uffff\1\4\1\5\1\3\1\2\6\uffff";
    static final String[] dfa_78s = {
            "\3\1\1\2\1\3\7\uffff\2\1\3\uffff\1\4\30\uffff\1\5\7\uffff\1\1",
            "",
            "\1\11\1\10\2\7\2\uffff\2\7\11\uffff\1\7\7\uffff\1\7\1\uffff\1\7\3\uffff\1\6\1\7\1\uffff\5\7",
            "\1\11\1\10\2\7\2\uffff\2\7\11\uffff\1\7\7\uffff\1\7\1\uffff\1\7\3\uffff\1\6\1\7\1\uffff\5\7",
            "",
            "",
            "",
            "",
            "\1\12\1\13",
            "\1\14\1\15",
            "\1\10\2\7\2\uffff\2\7\11\uffff\1\7\7\uffff\1\7\1\uffff\1\7\3\uffff\1\6\1\7\1\uffff\5\7",
            "\1\10\2\7\2\uffff\2\7\11\uffff\1\7\7\uffff\1\7\1\uffff\1\7\3\uffff\1\6\1\7\1\uffff\5\7",
            "\1\11\1\uffff\2\7\2\uffff\2\7\11\uffff\1\7\7\uffff\1\7\1\uffff\1\7\3\uffff\1\6\1\7\1\uffff\5\7",
            "\1\11\1\uffff\2\7\2\uffff\2\7\11\uffff\1\7\7\uffff\1\7\1\uffff\1\7\3\uffff\1\6\1\7\1\uffff\5\7"
    };
    static final short[] dfa_74 = DFA.unpackEncodedString(dfa_74s);
    static final char[] dfa_75 = DFA.unpackEncodedStringToUnsignedChars(dfa_75s);
    static final char[] dfa_76 = DFA.unpackEncodedStringToUnsignedChars(dfa_76s);
    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final short[][] dfa_78 = unpackEncodedStringArray(dfa_78s);

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = dfa_56;
            this.eof = dfa_74;
            this.min = dfa_75;
            this.max = dfa_76;
            this.accept = dfa_77;
            this.special = dfa_60;
            this.transition = dfa_78;
        }
        public String getDescription() {
            return "4125:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )";
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
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000804001000300L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xFC000004FEA08310L,0x0000000000000001L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0xC000000408000300L,0x0000000000000001L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xC000300038000300L,0x0000000000000001L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000002000480000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000026000480000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000022000480000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000325800000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000321800000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000301800000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00988000004603E0L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000018000000300L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000010000000300L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00800000000600E0L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000004001000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000004001000300L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000804000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0001000200000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x007C000000040002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x00808000004603E0L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x00998000004603E0L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0098800000C603E0L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0300000000000082L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0018000000000080L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000020002L});

}
