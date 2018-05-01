package org.omg.sysml.owl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.omg.sysml.owl.services.OwlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOwlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_FULL_IRI", "RULE_PN_PREFIX", "RULE_PN_LOCAL", "RULE_BLANK_NODE_LABEL", "RULE_ISEGMENT", "RULE_ID", "RULE_PN_CHARS_BASE", "RULE_PN_CHARS_U", "RULE_PN_CHARS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Prefix'", "'('", "'='", "')'", "'Ontology'", "'Import'", "'^^'", "'Declaration'", "'Class'", "'Datatype'", "'ObjectProperty'", "'DataProperty'", "'AnnotationProperty'", "'NamedIndividual'", "'ObjectInverseOf'", "'DataIntersectionOf'", "'DataUnionOf'", "'DataComplementOf'", "'DataOneOf'", "'DatatypeRestriction'", "'ObjectIntersectionOf'", "'ObjectUnionOf'", "'ObjectComplementOf'", "'ObjectOneOf'", "'ObjectSomeValuesFrom'", "'ObjectAllValuesFrom'", "'ObjectHasValue'", "'ObjectHasSelf'", "'ObjectMinCardinality'", "'ObjectMaxCardinality'", "'ObjectExactCardinality'", "'DataSomeValuesFrom'", "'DataAllValuesFrom'", "'DataHasValue'", "'DataMinCardinality'", "'DataMaxCardinality'", "'DataExactCardinality'", "'SubClassOf'", "'EquivalentClasses'", "'DisjointClasses'", "'DisjointUnion'", "'SubObjectPropertyOf'", "'ObjectPropertyChain'", "'EquivalentObjectProperties'", "'DisjointObjectProperties'", "'InverseObjectProperties'", "'ObjectPropertyDomain'", "'ObjectPropertyRange'", "'FunctionalObjectProperty'", "'InverseFunctionalObjectProperty'", "'ReflectiveObjectProperty'", "'IrreflectiveObjectProperty'", "'SymmetricObjectProperty'", "'AsymmetricObjectProperty'", "'TransitiveObjectProperty'", "'SubDataPropertyOf'", "'EquivalentDataProperties'", "'DisjointDataProperties'", "'DataPropertyDomain'", "'DataPropertyRange'", "'FunctionalDataProperty'", "'DatatypeDefinition'", "'HasKey'", "'SameIndividual'", "'DifferentIndividuals'", "'ClassAssertion'", "'ObjectPropertyAssertion'", "'NegativeObjectPropertyAssertion'", "'DataPropertyAssertion'", "'NegativeDataPropertyAssertion'", "'Annotation'", "'AnnotationAssertion'", "'SubAnnotationPropertyOf'", "'AnnotationPropertyDomain'", "'AnnotationPropertyRange'", "':'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_ISEGMENT=10;
    public static final int T__61=61;
    public static final int RULE_ID=11;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_PN_LOCAL=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_PN_CHARS=14;
    public static final int RULE_FULL_IRI=6;
    public static final int RULE_BLANK_NODE_LABEL=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int RULE_PN_PREFIX=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int RULE_PN_CHARS_BASE=12;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=17;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_PN_CHARS_U=13;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalOwlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOwlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOwlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOwl.g"; }



     	private OwlGrammarAccess grammarAccess;

        public InternalOwlParser(TokenStream input, OwlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "OntologyDocument";
       	}

       	@Override
       	protected OwlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleOntologyDocument"
    // InternalOwl.g:64:1: entryRuleOntologyDocument returns [EObject current=null] : iv_ruleOntologyDocument= ruleOntologyDocument EOF ;
    public final EObject entryRuleOntologyDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologyDocument = null;


        try {
            // InternalOwl.g:64:57: (iv_ruleOntologyDocument= ruleOntologyDocument EOF )
            // InternalOwl.g:65:2: iv_ruleOntologyDocument= ruleOntologyDocument EOF
            {
             newCompositeNode(grammarAccess.getOntologyDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologyDocument=ruleOntologyDocument();

            state._fsp--;

             current =iv_ruleOntologyDocument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOntologyDocument"


    // $ANTLR start "ruleOntologyDocument"
    // InternalOwl.g:71:1: ruleOntologyDocument returns [EObject current=null] : ( ( (lv_prefixDeclarations_0_0= rulePrefixDeclaration ) )* ( (lv_ontology_1_0= ruleOntology ) ) ) ;
    public final EObject ruleOntologyDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_prefixDeclarations_0_0 = null;

        EObject lv_ontology_1_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:77:2: ( ( ( (lv_prefixDeclarations_0_0= rulePrefixDeclaration ) )* ( (lv_ontology_1_0= ruleOntology ) ) ) )
            // InternalOwl.g:78:2: ( ( (lv_prefixDeclarations_0_0= rulePrefixDeclaration ) )* ( (lv_ontology_1_0= ruleOntology ) ) )
            {
            // InternalOwl.g:78:2: ( ( (lv_prefixDeclarations_0_0= rulePrefixDeclaration ) )* ( (lv_ontology_1_0= ruleOntology ) ) )
            // InternalOwl.g:79:3: ( (lv_prefixDeclarations_0_0= rulePrefixDeclaration ) )* ( (lv_ontology_1_0= ruleOntology ) )
            {
            // InternalOwl.g:79:3: ( (lv_prefixDeclarations_0_0= rulePrefixDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOwl.g:80:4: (lv_prefixDeclarations_0_0= rulePrefixDeclaration )
            	    {
            	    // InternalOwl.g:80:4: (lv_prefixDeclarations_0_0= rulePrefixDeclaration )
            	    // InternalOwl.g:81:5: lv_prefixDeclarations_0_0= rulePrefixDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getOntologyDocumentAccess().getPrefixDeclarationsPrefixDeclarationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_prefixDeclarations_0_0=rulePrefixDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOntologyDocumentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"prefixDeclarations",
            	    						lv_prefixDeclarations_0_0,
            	    						"org.omg.sysml.owl.Owl.PrefixDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalOwl.g:98:3: ( (lv_ontology_1_0= ruleOntology ) )
            // InternalOwl.g:99:4: (lv_ontology_1_0= ruleOntology )
            {
            // InternalOwl.g:99:4: (lv_ontology_1_0= ruleOntology )
            // InternalOwl.g:100:5: lv_ontology_1_0= ruleOntology
            {

            					newCompositeNode(grammarAccess.getOntologyDocumentAccess().getOntologyOntologyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ontology_1_0=ruleOntology();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntologyDocumentRule());
            					}
            					set(
            						current,
            						"ontology",
            						lv_ontology_1_0,
            						"org.omg.sysml.owl.Owl.Ontology");
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
    // $ANTLR end "ruleOntologyDocument"


    // $ANTLR start "entryRulePrefixDeclaration"
    // InternalOwl.g:121:1: entryRulePrefixDeclaration returns [EObject current=null] : iv_rulePrefixDeclaration= rulePrefixDeclaration EOF ;
    public final EObject entryRulePrefixDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixDeclaration = null;


        try {
            // InternalOwl.g:121:58: (iv_rulePrefixDeclaration= rulePrefixDeclaration EOF )
            // InternalOwl.g:122:2: iv_rulePrefixDeclaration= rulePrefixDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPrefixDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrefixDeclaration=rulePrefixDeclaration();

            state._fsp--;

             current =iv_rulePrefixDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefixDeclaration"


    // $ANTLR start "rulePrefixDeclaration"
    // InternalOwl.g:128:1: rulePrefixDeclaration returns [EObject current=null] : (otherlv_0= 'Prefix' otherlv_1= '(' ( (lv_prefixName_2_0= rulePrefixName ) ) otherlv_3= '=' ( (lv_fullIRI_4_0= ruleFullIRI ) ) otherlv_5= ')' ) ;
    public final EObject rulePrefixDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_prefixName_2_0 = null;

        AntlrDatatypeRuleToken lv_fullIRI_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:134:2: ( (otherlv_0= 'Prefix' otherlv_1= '(' ( (lv_prefixName_2_0= rulePrefixName ) ) otherlv_3= '=' ( (lv_fullIRI_4_0= ruleFullIRI ) ) otherlv_5= ')' ) )
            // InternalOwl.g:135:2: (otherlv_0= 'Prefix' otherlv_1= '(' ( (lv_prefixName_2_0= rulePrefixName ) ) otherlv_3= '=' ( (lv_fullIRI_4_0= ruleFullIRI ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:135:2: (otherlv_0= 'Prefix' otherlv_1= '(' ( (lv_prefixName_2_0= rulePrefixName ) ) otherlv_3= '=' ( (lv_fullIRI_4_0= ruleFullIRI ) ) otherlv_5= ')' )
            // InternalOwl.g:136:3: otherlv_0= 'Prefix' otherlv_1= '(' ( (lv_prefixName_2_0= rulePrefixName ) ) otherlv_3= '=' ( (lv_fullIRI_4_0= ruleFullIRI ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPrefixDeclarationAccess().getPrefixKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPrefixDeclarationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:144:3: ( (lv_prefixName_2_0= rulePrefixName ) )
            // InternalOwl.g:145:4: (lv_prefixName_2_0= rulePrefixName )
            {
            // InternalOwl.g:145:4: (lv_prefixName_2_0= rulePrefixName )
            // InternalOwl.g:146:5: lv_prefixName_2_0= rulePrefixName
            {

            					newCompositeNode(grammarAccess.getPrefixDeclarationAccess().getPrefixNamePrefixNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_prefixName_2_0=rulePrefixName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrefixDeclarationRule());
            					}
            					set(
            						current,
            						"prefixName",
            						lv_prefixName_2_0,
            						"org.omg.sysml.owl.Owl.PrefixName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPrefixDeclarationAccess().getEqualsSignKeyword_3());
            		
            // InternalOwl.g:167:3: ( (lv_fullIRI_4_0= ruleFullIRI ) )
            // InternalOwl.g:168:4: (lv_fullIRI_4_0= ruleFullIRI )
            {
            // InternalOwl.g:168:4: (lv_fullIRI_4_0= ruleFullIRI )
            // InternalOwl.g:169:5: lv_fullIRI_4_0= ruleFullIRI
            {

            					newCompositeNode(grammarAccess.getPrefixDeclarationAccess().getFullIRIFullIRIParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_fullIRI_4_0=ruleFullIRI();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrefixDeclarationRule());
            					}
            					set(
            						current,
            						"fullIRI",
            						lv_fullIRI_4_0,
            						"org.omg.sysml.owl.Owl.FullIRI");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPrefixDeclarationAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixDeclaration"


    // $ANTLR start "entryRuleOntology"
    // InternalOwl.g:194:1: entryRuleOntology returns [EObject current=null] : iv_ruleOntology= ruleOntology EOF ;
    public final EObject entryRuleOntology() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntology = null;


        try {
            // InternalOwl.g:194:49: (iv_ruleOntology= ruleOntology EOF )
            // InternalOwl.g:195:2: iv_ruleOntology= ruleOntology EOF
            {
             newCompositeNode(grammarAccess.getOntologyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntology=ruleOntology();

            state._fsp--;

             current =iv_ruleOntology; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOntology"


    // $ANTLR start "ruleOntology"
    // InternalOwl.g:201:1: ruleOntology returns [EObject current=null] : ( () otherlv_1= 'Ontology' otherlv_2= '(' ( ( (lv_ontologyIRI_3_0= ruleIRI ) ) ( (lv_versionIRI_4_0= ruleIRI ) )? )? ( (lv_directlyImportsDocuments_5_0= ruleDirectlyImportsDocument ) )* ( (lv_ontologyAnnotations_6_0= ruleAnnotation ) )* ( (lv_axioms_7_0= ruleAxiom ) )* otherlv_8= ')' ) ;
    public final EObject ruleOntology() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_ontologyIRI_3_0 = null;

        AntlrDatatypeRuleToken lv_versionIRI_4_0 = null;

        AntlrDatatypeRuleToken lv_directlyImportsDocuments_5_0 = null;

        EObject lv_ontologyAnnotations_6_0 = null;

        EObject lv_axioms_7_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:207:2: ( ( () otherlv_1= 'Ontology' otherlv_2= '(' ( ( (lv_ontologyIRI_3_0= ruleIRI ) ) ( (lv_versionIRI_4_0= ruleIRI ) )? )? ( (lv_directlyImportsDocuments_5_0= ruleDirectlyImportsDocument ) )* ( (lv_ontologyAnnotations_6_0= ruleAnnotation ) )* ( (lv_axioms_7_0= ruleAxiom ) )* otherlv_8= ')' ) )
            // InternalOwl.g:208:2: ( () otherlv_1= 'Ontology' otherlv_2= '(' ( ( (lv_ontologyIRI_3_0= ruleIRI ) ) ( (lv_versionIRI_4_0= ruleIRI ) )? )? ( (lv_directlyImportsDocuments_5_0= ruleDirectlyImportsDocument ) )* ( (lv_ontologyAnnotations_6_0= ruleAnnotation ) )* ( (lv_axioms_7_0= ruleAxiom ) )* otherlv_8= ')' )
            {
            // InternalOwl.g:208:2: ( () otherlv_1= 'Ontology' otherlv_2= '(' ( ( (lv_ontologyIRI_3_0= ruleIRI ) ) ( (lv_versionIRI_4_0= ruleIRI ) )? )? ( (lv_directlyImportsDocuments_5_0= ruleDirectlyImportsDocument ) )* ( (lv_ontologyAnnotations_6_0= ruleAnnotation ) )* ( (lv_axioms_7_0= ruleAxiom ) )* otherlv_8= ')' )
            // InternalOwl.g:209:3: () otherlv_1= 'Ontology' otherlv_2= '(' ( ( (lv_ontologyIRI_3_0= ruleIRI ) ) ( (lv_versionIRI_4_0= ruleIRI ) )? )? ( (lv_directlyImportsDocuments_5_0= ruleDirectlyImportsDocument ) )* ( (lv_ontologyAnnotations_6_0= ruleAnnotation ) )* ( (lv_axioms_7_0= ruleAxiom ) )* otherlv_8= ')'
            {
            // InternalOwl.g:209:3: ()
            // InternalOwl.g:210:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOntologyAccess().getOntologyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologyAccess().getOntologyKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getOntologyAccess().getLeftParenthesisKeyword_2());
            		
            // InternalOwl.g:224:3: ( ( (lv_ontologyIRI_3_0= ruleIRI ) ) ( (lv_versionIRI_4_0= ruleIRI ) )? )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_FULL_IRI && LA3_0<=RULE_PN_LOCAL)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOwl.g:225:4: ( (lv_ontologyIRI_3_0= ruleIRI ) ) ( (lv_versionIRI_4_0= ruleIRI ) )?
                    {
                    // InternalOwl.g:225:4: ( (lv_ontologyIRI_3_0= ruleIRI ) )
                    // InternalOwl.g:226:5: (lv_ontologyIRI_3_0= ruleIRI )
                    {
                    // InternalOwl.g:226:5: (lv_ontologyIRI_3_0= ruleIRI )
                    // InternalOwl.g:227:6: lv_ontologyIRI_3_0= ruleIRI
                    {

                    						newCompositeNode(grammarAccess.getOntologyAccess().getOntologyIRIIRIParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_ontologyIRI_3_0=ruleIRI();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOntologyRule());
                    						}
                    						set(
                    							current,
                    							"ontologyIRI",
                    							lv_ontologyIRI_3_0,
                    							"org.omg.sysml.owl.Owl.IRI");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOwl.g:244:4: ( (lv_versionIRI_4_0= ruleIRI ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=RULE_FULL_IRI && LA2_0<=RULE_PN_LOCAL)) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalOwl.g:245:5: (lv_versionIRI_4_0= ruleIRI )
                            {
                            // InternalOwl.g:245:5: (lv_versionIRI_4_0= ruleIRI )
                            // InternalOwl.g:246:6: lv_versionIRI_4_0= ruleIRI
                            {

                            						newCompositeNode(grammarAccess.getOntologyAccess().getVersionIRIIRIParserRuleCall_3_1_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_versionIRI_4_0=ruleIRI();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getOntologyRule());
                            						}
                            						set(
                            							current,
                            							"versionIRI",
                            							lv_versionIRI_4_0,
                            							"org.omg.sysml.owl.Owl.IRI");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalOwl.g:264:3: ( (lv_directlyImportsDocuments_5_0= ruleDirectlyImportsDocument ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOwl.g:265:4: (lv_directlyImportsDocuments_5_0= ruleDirectlyImportsDocument )
            	    {
            	    // InternalOwl.g:265:4: (lv_directlyImportsDocuments_5_0= ruleDirectlyImportsDocument )
            	    // InternalOwl.g:266:5: lv_directlyImportsDocuments_5_0= ruleDirectlyImportsDocument
            	    {

            	    					newCompositeNode(grammarAccess.getOntologyAccess().getDirectlyImportsDocumentsDirectlyImportsDocumentParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_directlyImportsDocuments_5_0=ruleDirectlyImportsDocument();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOntologyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"directlyImportsDocuments",
            	    						lv_directlyImportsDocuments_5_0,
            	    						"org.omg.sysml.owl.Owl.DirectlyImportsDocument");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalOwl.g:283:3: ( (lv_ontologyAnnotations_6_0= ruleAnnotation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==89) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOwl.g:284:4: (lv_ontologyAnnotations_6_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:284:4: (lv_ontologyAnnotations_6_0= ruleAnnotation )
            	    // InternalOwl.g:285:5: lv_ontologyAnnotations_6_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getOntologyAccess().getOntologyAnnotationsAnnotationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_ontologyAnnotations_6_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOntologyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ontologyAnnotations",
            	    						lv_ontologyAnnotations_6_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalOwl.g:302:3: ( (lv_axioms_7_0= ruleAxiom ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26||(LA6_0>=56 && LA6_0<=60)||(LA6_0>=62 && LA6_0<=88)||(LA6_0>=90 && LA6_0<=93)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalOwl.g:303:4: (lv_axioms_7_0= ruleAxiom )
            	    {
            	    // InternalOwl.g:303:4: (lv_axioms_7_0= ruleAxiom )
            	    // InternalOwl.g:304:5: lv_axioms_7_0= ruleAxiom
            	    {

            	    					newCompositeNode(grammarAccess.getOntologyAccess().getAxiomsAxiomParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_axioms_7_0=ruleAxiom();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOntologyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axioms",
            	    						lv_axioms_7_0,
            	    						"org.omg.sysml.owl.Owl.Axiom");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getOntologyAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOntology"


    // $ANTLR start "entryRuleDirectlyImportsDocument"
    // InternalOwl.g:329:1: entryRuleDirectlyImportsDocument returns [String current=null] : iv_ruleDirectlyImportsDocument= ruleDirectlyImportsDocument EOF ;
    public final String entryRuleDirectlyImportsDocument() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDirectlyImportsDocument = null;


        try {
            // InternalOwl.g:329:63: (iv_ruleDirectlyImportsDocument= ruleDirectlyImportsDocument EOF )
            // InternalOwl.g:330:2: iv_ruleDirectlyImportsDocument= ruleDirectlyImportsDocument EOF
            {
             newCompositeNode(grammarAccess.getDirectlyImportsDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectlyImportsDocument=ruleDirectlyImportsDocument();

            state._fsp--;

             current =iv_ruleDirectlyImportsDocument.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectlyImportsDocument"


    // $ANTLR start "ruleDirectlyImportsDocument"
    // InternalOwl.g:336:1: ruleDirectlyImportsDocument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Import' kw= '(' this_IRI_2= ruleIRI kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleDirectlyImportsDocument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IRI_2 = null;



        	enterRule();

        try {
            // InternalOwl.g:342:2: ( (kw= 'Import' kw= '(' this_IRI_2= ruleIRI kw= ')' ) )
            // InternalOwl.g:343:2: (kw= 'Import' kw= '(' this_IRI_2= ruleIRI kw= ')' )
            {
            // InternalOwl.g:343:2: (kw= 'Import' kw= '(' this_IRI_2= ruleIRI kw= ')' )
            // InternalOwl.g:344:3: kw= 'Import' kw= '(' this_IRI_2= ruleIRI kw= ')'
            {
            kw=(Token)match(input,24,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDirectlyImportsDocumentAccess().getImportKeyword_0());
            		
            kw=(Token)match(input,20,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDirectlyImportsDocumentAccess().getLeftParenthesisKeyword_1());
            		

            			newCompositeNode(grammarAccess.getDirectlyImportsDocumentAccess().getIRIParserRuleCall_2());
            		
            pushFollow(FOLLOW_8);
            this_IRI_2=ruleIRI();

            state._fsp--;


            			current.merge(this_IRI_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,22,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDirectlyImportsDocumentAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectlyImportsDocument"


    // $ANTLR start "entryRuleClass"
    // InternalOwl.g:373:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalOwl.g:373:46: (iv_ruleClass= ruleClass EOF )
            // InternalOwl.g:374:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalOwl.g:380:1: ruleClass returns [EObject current=null] : ( (lv_entityIRI_0_0= ruleIRI ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_entityIRI_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:386:2: ( ( (lv_entityIRI_0_0= ruleIRI ) ) )
            // InternalOwl.g:387:2: ( (lv_entityIRI_0_0= ruleIRI ) )
            {
            // InternalOwl.g:387:2: ( (lv_entityIRI_0_0= ruleIRI ) )
            // InternalOwl.g:388:3: (lv_entityIRI_0_0= ruleIRI )
            {
            // InternalOwl.g:388:3: (lv_entityIRI_0_0= ruleIRI )
            // InternalOwl.g:389:4: lv_entityIRI_0_0= ruleIRI
            {

            				newCompositeNode(grammarAccess.getClassAccess().getEntityIRIIRIParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_entityIRI_0_0=ruleIRI();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getClassRule());
            				}
            				set(
            					current,
            					"entityIRI",
            					lv_entityIRI_0_0,
            					"org.omg.sysml.owl.Owl.IRI");
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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleDatatype"
    // InternalOwl.g:409:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // InternalOwl.g:409:49: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalOwl.g:410:2: iv_ruleDatatype= ruleDatatype EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // InternalOwl.g:416:1: ruleDatatype returns [EObject current=null] : ( (lv_entityIRI_0_0= ruleIRI ) ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_entityIRI_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:422:2: ( ( (lv_entityIRI_0_0= ruleIRI ) ) )
            // InternalOwl.g:423:2: ( (lv_entityIRI_0_0= ruleIRI ) )
            {
            // InternalOwl.g:423:2: ( (lv_entityIRI_0_0= ruleIRI ) )
            // InternalOwl.g:424:3: (lv_entityIRI_0_0= ruleIRI )
            {
            // InternalOwl.g:424:3: (lv_entityIRI_0_0= ruleIRI )
            // InternalOwl.g:425:4: lv_entityIRI_0_0= ruleIRI
            {

            				newCompositeNode(grammarAccess.getDatatypeAccess().getEntityIRIIRIParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_entityIRI_0_0=ruleIRI();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDatatypeRule());
            				}
            				set(
            					current,
            					"entityIRI",
            					lv_entityIRI_0_0,
            					"org.omg.sysml.owl.Owl.IRI");
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
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleObjectProperty"
    // InternalOwl.g:445:1: entryRuleObjectProperty returns [EObject current=null] : iv_ruleObjectProperty= ruleObjectProperty EOF ;
    public final EObject entryRuleObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectProperty = null;


        try {
            // InternalOwl.g:445:55: (iv_ruleObjectProperty= ruleObjectProperty EOF )
            // InternalOwl.g:446:2: iv_ruleObjectProperty= ruleObjectProperty EOF
            {
             newCompositeNode(grammarAccess.getObjectPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectProperty=ruleObjectProperty();

            state._fsp--;

             current =iv_ruleObjectProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectProperty"


    // $ANTLR start "ruleObjectProperty"
    // InternalOwl.g:452:1: ruleObjectProperty returns [EObject current=null] : ( (lv_entityIRI_0_0= ruleIRI ) ) ;
    public final EObject ruleObjectProperty() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_entityIRI_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:458:2: ( ( (lv_entityIRI_0_0= ruleIRI ) ) )
            // InternalOwl.g:459:2: ( (lv_entityIRI_0_0= ruleIRI ) )
            {
            // InternalOwl.g:459:2: ( (lv_entityIRI_0_0= ruleIRI ) )
            // InternalOwl.g:460:3: (lv_entityIRI_0_0= ruleIRI )
            {
            // InternalOwl.g:460:3: (lv_entityIRI_0_0= ruleIRI )
            // InternalOwl.g:461:4: lv_entityIRI_0_0= ruleIRI
            {

            				newCompositeNode(grammarAccess.getObjectPropertyAccess().getEntityIRIIRIParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_entityIRI_0_0=ruleIRI();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getObjectPropertyRule());
            				}
            				set(
            					current,
            					"entityIRI",
            					lv_entityIRI_0_0,
            					"org.omg.sysml.owl.Owl.IRI");
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
    // $ANTLR end "ruleObjectProperty"


    // $ANTLR start "entryRuleDataProperty"
    // InternalOwl.g:481:1: entryRuleDataProperty returns [EObject current=null] : iv_ruleDataProperty= ruleDataProperty EOF ;
    public final EObject entryRuleDataProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataProperty = null;


        try {
            // InternalOwl.g:481:53: (iv_ruleDataProperty= ruleDataProperty EOF )
            // InternalOwl.g:482:2: iv_ruleDataProperty= ruleDataProperty EOF
            {
             newCompositeNode(grammarAccess.getDataPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataProperty=ruleDataProperty();

            state._fsp--;

             current =iv_ruleDataProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataProperty"


    // $ANTLR start "ruleDataProperty"
    // InternalOwl.g:488:1: ruleDataProperty returns [EObject current=null] : ( (lv_entityIRI_0_0= ruleIRI ) ) ;
    public final EObject ruleDataProperty() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_entityIRI_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:494:2: ( ( (lv_entityIRI_0_0= ruleIRI ) ) )
            // InternalOwl.g:495:2: ( (lv_entityIRI_0_0= ruleIRI ) )
            {
            // InternalOwl.g:495:2: ( (lv_entityIRI_0_0= ruleIRI ) )
            // InternalOwl.g:496:3: (lv_entityIRI_0_0= ruleIRI )
            {
            // InternalOwl.g:496:3: (lv_entityIRI_0_0= ruleIRI )
            // InternalOwl.g:497:4: lv_entityIRI_0_0= ruleIRI
            {

            				newCompositeNode(grammarAccess.getDataPropertyAccess().getEntityIRIIRIParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_entityIRI_0_0=ruleIRI();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDataPropertyRule());
            				}
            				set(
            					current,
            					"entityIRI",
            					lv_entityIRI_0_0,
            					"org.omg.sysml.owl.Owl.IRI");
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
    // $ANTLR end "ruleDataProperty"


    // $ANTLR start "entryRuleAnnotationProperty"
    // InternalOwl.g:517:1: entryRuleAnnotationProperty returns [EObject current=null] : iv_ruleAnnotationProperty= ruleAnnotationProperty EOF ;
    public final EObject entryRuleAnnotationProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationProperty = null;


        try {
            // InternalOwl.g:517:59: (iv_ruleAnnotationProperty= ruleAnnotationProperty EOF )
            // InternalOwl.g:518:2: iv_ruleAnnotationProperty= ruleAnnotationProperty EOF
            {
             newCompositeNode(grammarAccess.getAnnotationPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationProperty=ruleAnnotationProperty();

            state._fsp--;

             current =iv_ruleAnnotationProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationProperty"


    // $ANTLR start "ruleAnnotationProperty"
    // InternalOwl.g:524:1: ruleAnnotationProperty returns [EObject current=null] : ( (lv_entityIRI_0_0= ruleIRI ) ) ;
    public final EObject ruleAnnotationProperty() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_entityIRI_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:530:2: ( ( (lv_entityIRI_0_0= ruleIRI ) ) )
            // InternalOwl.g:531:2: ( (lv_entityIRI_0_0= ruleIRI ) )
            {
            // InternalOwl.g:531:2: ( (lv_entityIRI_0_0= ruleIRI ) )
            // InternalOwl.g:532:3: (lv_entityIRI_0_0= ruleIRI )
            {
            // InternalOwl.g:532:3: (lv_entityIRI_0_0= ruleIRI )
            // InternalOwl.g:533:4: lv_entityIRI_0_0= ruleIRI
            {

            				newCompositeNode(grammarAccess.getAnnotationPropertyAccess().getEntityIRIIRIParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_entityIRI_0_0=ruleIRI();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAnnotationPropertyRule());
            				}
            				set(
            					current,
            					"entityIRI",
            					lv_entityIRI_0_0,
            					"org.omg.sysml.owl.Owl.IRI");
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
    // $ANTLR end "ruleAnnotationProperty"


    // $ANTLR start "entryRuleNamedIndividual"
    // InternalOwl.g:553:1: entryRuleNamedIndividual returns [EObject current=null] : iv_ruleNamedIndividual= ruleNamedIndividual EOF ;
    public final EObject entryRuleNamedIndividual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedIndividual = null;


        try {
            // InternalOwl.g:553:56: (iv_ruleNamedIndividual= ruleNamedIndividual EOF )
            // InternalOwl.g:554:2: iv_ruleNamedIndividual= ruleNamedIndividual EOF
            {
             newCompositeNode(grammarAccess.getNamedIndividualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedIndividual=ruleNamedIndividual();

            state._fsp--;

             current =iv_ruleNamedIndividual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedIndividual"


    // $ANTLR start "ruleNamedIndividual"
    // InternalOwl.g:560:1: ruleNamedIndividual returns [EObject current=null] : ( (lv_entityIRI_0_0= ruleIRI ) ) ;
    public final EObject ruleNamedIndividual() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_entityIRI_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:566:2: ( ( (lv_entityIRI_0_0= ruleIRI ) ) )
            // InternalOwl.g:567:2: ( (lv_entityIRI_0_0= ruleIRI ) )
            {
            // InternalOwl.g:567:2: ( (lv_entityIRI_0_0= ruleIRI ) )
            // InternalOwl.g:568:3: (lv_entityIRI_0_0= ruleIRI )
            {
            // InternalOwl.g:568:3: (lv_entityIRI_0_0= ruleIRI )
            // InternalOwl.g:569:4: lv_entityIRI_0_0= ruleIRI
            {

            				newCompositeNode(grammarAccess.getNamedIndividualAccess().getEntityIRIIRIParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_entityIRI_0_0=ruleIRI();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNamedIndividualRule());
            				}
            				set(
            					current,
            					"entityIRI",
            					lv_entityIRI_0_0,
            					"org.omg.sysml.owl.Owl.IRI");
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
    // $ANTLR end "ruleNamedIndividual"


    // $ANTLR start "entryRuleAnonymousIndividual"
    // InternalOwl.g:589:1: entryRuleAnonymousIndividual returns [EObject current=null] : iv_ruleAnonymousIndividual= ruleAnonymousIndividual EOF ;
    public final EObject entryRuleAnonymousIndividual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousIndividual = null;


        try {
            // InternalOwl.g:589:60: (iv_ruleAnonymousIndividual= ruleAnonymousIndividual EOF )
            // InternalOwl.g:590:2: iv_ruleAnonymousIndividual= ruleAnonymousIndividual EOF
            {
             newCompositeNode(grammarAccess.getAnonymousIndividualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnonymousIndividual=ruleAnonymousIndividual();

            state._fsp--;

             current =iv_ruleAnonymousIndividual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnonymousIndividual"


    // $ANTLR start "ruleAnonymousIndividual"
    // InternalOwl.g:596:1: ruleAnonymousIndividual returns [EObject current=null] : ( (lv_nodeId_0_0= ruleNodeID ) ) ;
    public final EObject ruleAnonymousIndividual() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nodeId_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:602:2: ( ( (lv_nodeId_0_0= ruleNodeID ) ) )
            // InternalOwl.g:603:2: ( (lv_nodeId_0_0= ruleNodeID ) )
            {
            // InternalOwl.g:603:2: ( (lv_nodeId_0_0= ruleNodeID ) )
            // InternalOwl.g:604:3: (lv_nodeId_0_0= ruleNodeID )
            {
            // InternalOwl.g:604:3: (lv_nodeId_0_0= ruleNodeID )
            // InternalOwl.g:605:4: lv_nodeId_0_0= ruleNodeID
            {

            				newCompositeNode(grammarAccess.getAnonymousIndividualAccess().getNodeIdNodeIDParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_nodeId_0_0=ruleNodeID();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAnonymousIndividualRule());
            				}
            				set(
            					current,
            					"nodeId",
            					lv_nodeId_0_0,
            					"org.omg.sysml.owl.Owl.NodeID");
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
    // $ANTLR end "ruleAnonymousIndividual"


    // $ANTLR start "entryRuleLiteral"
    // InternalOwl.g:625:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalOwl.g:625:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalOwl.g:626:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalOwl.g:632:1: ruleLiteral returns [EObject current=null] : (this_TypedLiteral_0= ruleTypedLiteral | this_StringLiteral_1= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_TypedLiteral_0 = null;

        EObject this_StringLiteral_1 = null;



        	enterRule();

        try {
            // InternalOwl.g:638:2: ( (this_TypedLiteral_0= ruleTypedLiteral | this_StringLiteral_1= ruleStringLiteral ) )
            // InternalOwl.g:639:2: (this_TypedLiteral_0= ruleTypedLiteral | this_StringLiteral_1= ruleStringLiteral )
            {
            // InternalOwl.g:639:2: (this_TypedLiteral_0= ruleTypedLiteral | this_StringLiteral_1= ruleStringLiteral )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||LA7_1==RULE_STRING||(LA7_1>=RULE_FULL_IRI && LA7_1<=RULE_PN_LOCAL)||LA7_1==22) ) {
                    alt7=2;
                }
                else if ( (LA7_1==25) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

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
                    // InternalOwl.g:640:3: this_TypedLiteral_0= ruleTypedLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getTypedLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypedLiteral_0=ruleTypedLiteral();

                    state._fsp--;


                    			current = this_TypedLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOwl.g:649:3: this_StringLiteral_1= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_1;
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleTypedLiteral"
    // InternalOwl.g:661:1: entryRuleTypedLiteral returns [EObject current=null] : iv_ruleTypedLiteral= ruleTypedLiteral EOF ;
    public final EObject entryRuleTypedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedLiteral = null;


        try {
            // InternalOwl.g:661:53: (iv_ruleTypedLiteral= ruleTypedLiteral EOF )
            // InternalOwl.g:662:2: iv_ruleTypedLiteral= ruleTypedLiteral EOF
            {
             newCompositeNode(grammarAccess.getTypedLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypedLiteral=ruleTypedLiteral();

            state._fsp--;

             current =iv_ruleTypedLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedLiteral"


    // $ANTLR start "ruleTypedLiteral"
    // InternalOwl.g:668:1: ruleTypedLiteral returns [EObject current=null] : ( ( (lv_lexicalForm_0_0= RULE_STRING ) ) otherlv_1= '^^' ( (lv_datatype_2_0= ruleIRI ) ) ) ;
    public final EObject ruleTypedLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_lexicalForm_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_datatype_2_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:674:2: ( ( ( (lv_lexicalForm_0_0= RULE_STRING ) ) otherlv_1= '^^' ( (lv_datatype_2_0= ruleIRI ) ) ) )
            // InternalOwl.g:675:2: ( ( (lv_lexicalForm_0_0= RULE_STRING ) ) otherlv_1= '^^' ( (lv_datatype_2_0= ruleIRI ) ) )
            {
            // InternalOwl.g:675:2: ( ( (lv_lexicalForm_0_0= RULE_STRING ) ) otherlv_1= '^^' ( (lv_datatype_2_0= ruleIRI ) ) )
            // InternalOwl.g:676:3: ( (lv_lexicalForm_0_0= RULE_STRING ) ) otherlv_1= '^^' ( (lv_datatype_2_0= ruleIRI ) )
            {
            // InternalOwl.g:676:3: ( (lv_lexicalForm_0_0= RULE_STRING ) )
            // InternalOwl.g:677:4: (lv_lexicalForm_0_0= RULE_STRING )
            {
            // InternalOwl.g:677:4: (lv_lexicalForm_0_0= RULE_STRING )
            // InternalOwl.g:678:5: lv_lexicalForm_0_0= RULE_STRING
            {
            lv_lexicalForm_0_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_lexicalForm_0_0, grammarAccess.getTypedLiteralAccess().getLexicalFormSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypedLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lexicalForm",
            						lv_lexicalForm_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getTypedLiteralAccess().getCircumflexAccentCircumflexAccentKeyword_1());
            		
            // InternalOwl.g:698:3: ( (lv_datatype_2_0= ruleIRI ) )
            // InternalOwl.g:699:4: (lv_datatype_2_0= ruleIRI )
            {
            // InternalOwl.g:699:4: (lv_datatype_2_0= ruleIRI )
            // InternalOwl.g:700:5: lv_datatype_2_0= ruleIRI
            {

            					newCompositeNode(grammarAccess.getTypedLiteralAccess().getDatatypeIRIParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_datatype_2_0=ruleIRI();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypedLiteralRule());
            					}
            					set(
            						current,
            						"datatype",
            						lv_datatype_2_0,
            						"org.omg.sysml.owl.Owl.IRI");
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
    // $ANTLR end "ruleTypedLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalOwl.g:721:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalOwl.g:721:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalOwl.g:722:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalOwl.g:728:1: ruleStringLiteral returns [EObject current=null] : ( (lv_lexicalForm_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_lexicalForm_0_0=null;


        	enterRule();

        try {
            // InternalOwl.g:734:2: ( ( (lv_lexicalForm_0_0= RULE_STRING ) ) )
            // InternalOwl.g:735:2: ( (lv_lexicalForm_0_0= RULE_STRING ) )
            {
            // InternalOwl.g:735:2: ( (lv_lexicalForm_0_0= RULE_STRING ) )
            // InternalOwl.g:736:3: (lv_lexicalForm_0_0= RULE_STRING )
            {
            // InternalOwl.g:736:3: (lv_lexicalForm_0_0= RULE_STRING )
            // InternalOwl.g:737:4: lv_lexicalForm_0_0= RULE_STRING
            {
            lv_lexicalForm_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_lexicalForm_0_0, grammarAccess.getStringLiteralAccess().getLexicalFormSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"lexicalForm",
            					lv_lexicalForm_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleDeclaration"
    // InternalOwl.g:756:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalOwl.g:756:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalOwl.g:757:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalOwl.g:763:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= 'Declaration' otherlv_1= '(' ( (lv_axiomAnnotation_2_0= ruleAnnotation ) )* ( (lv_entity_3_0= ruleEntityDeclaration ) ) otherlv_4= ')' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_axiomAnnotation_2_0 = null;

        EObject lv_entity_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:769:2: ( (otherlv_0= 'Declaration' otherlv_1= '(' ( (lv_axiomAnnotation_2_0= ruleAnnotation ) )* ( (lv_entity_3_0= ruleEntityDeclaration ) ) otherlv_4= ')' ) )
            // InternalOwl.g:770:2: (otherlv_0= 'Declaration' otherlv_1= '(' ( (lv_axiomAnnotation_2_0= ruleAnnotation ) )* ( (lv_entity_3_0= ruleEntityDeclaration ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:770:2: (otherlv_0= 'Declaration' otherlv_1= '(' ( (lv_axiomAnnotation_2_0= ruleAnnotation ) )* ( (lv_entity_3_0= ruleEntityDeclaration ) ) otherlv_4= ')' )
            // InternalOwl.g:771:3: otherlv_0= 'Declaration' otherlv_1= '(' ( (lv_axiomAnnotation_2_0= ruleAnnotation ) )* ( (lv_entity_3_0= ruleEntityDeclaration ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getDeclarationKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:779:3: ( (lv_axiomAnnotation_2_0= ruleAnnotation ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==89) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOwl.g:780:4: (lv_axiomAnnotation_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:780:4: (lv_axiomAnnotation_2_0= ruleAnnotation )
            	    // InternalOwl.g:781:5: lv_axiomAnnotation_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getDeclarationAccess().getAxiomAnnotationAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_axiomAnnotation_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotation",
            	    						lv_axiomAnnotation_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalOwl.g:798:3: ( (lv_entity_3_0= ruleEntityDeclaration ) )
            // InternalOwl.g:799:4: (lv_entity_3_0= ruleEntityDeclaration )
            {
            // InternalOwl.g:799:4: (lv_entity_3_0= ruleEntityDeclaration )
            // InternalOwl.g:800:5: lv_entity_3_0= ruleEntityDeclaration
            {

            					newCompositeNode(grammarAccess.getDeclarationAccess().getEntityEntityDeclarationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_entity_3_0=ruleEntityDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarationRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_3_0,
            						"org.omg.sysml.owl.Owl.EntityDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleEntityDeclaration"
    // InternalOwl.g:825:1: entryRuleEntityDeclaration returns [EObject current=null] : iv_ruleEntityDeclaration= ruleEntityDeclaration EOF ;
    public final EObject entryRuleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityDeclaration = null;


        try {
            // InternalOwl.g:825:58: (iv_ruleEntityDeclaration= ruleEntityDeclaration EOF )
            // InternalOwl.g:826:2: iv_ruleEntityDeclaration= ruleEntityDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEntityDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityDeclaration=ruleEntityDeclaration();

            state._fsp--;

             current =iv_ruleEntityDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityDeclaration"


    // $ANTLR start "ruleEntityDeclaration"
    // InternalOwl.g:832:1: ruleEntityDeclaration returns [EObject current=null] : ( (otherlv_0= 'Class' otherlv_1= '(' this_Class_2= ruleClass otherlv_3= ')' ) | (otherlv_4= 'Datatype' otherlv_5= '(' this_Datatype_6= ruleDatatype otherlv_7= ')' ) | (otherlv_8= 'ObjectProperty' otherlv_9= '(' this_ObjectProperty_10= ruleObjectProperty otherlv_11= ')' ) | (otherlv_12= 'DataProperty' otherlv_13= '(' this_DataProperty_14= ruleDataProperty otherlv_15= ')' ) | (otherlv_16= 'AnnotationProperty' otherlv_17= '(' this_AnnotationProperty_18= ruleAnnotationProperty otherlv_19= ')' ) | (otherlv_20= 'NamedIndividual' otherlv_21= '(' this_NamedIndividual_22= ruleNamedIndividual otherlv_23= ')' ) ) ;
    public final EObject ruleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        EObject this_Class_2 = null;

        EObject this_Datatype_6 = null;

        EObject this_ObjectProperty_10 = null;

        EObject this_DataProperty_14 = null;

        EObject this_AnnotationProperty_18 = null;

        EObject this_NamedIndividual_22 = null;



        	enterRule();

        try {
            // InternalOwl.g:838:2: ( ( (otherlv_0= 'Class' otherlv_1= '(' this_Class_2= ruleClass otherlv_3= ')' ) | (otherlv_4= 'Datatype' otherlv_5= '(' this_Datatype_6= ruleDatatype otherlv_7= ')' ) | (otherlv_8= 'ObjectProperty' otherlv_9= '(' this_ObjectProperty_10= ruleObjectProperty otherlv_11= ')' ) | (otherlv_12= 'DataProperty' otherlv_13= '(' this_DataProperty_14= ruleDataProperty otherlv_15= ')' ) | (otherlv_16= 'AnnotationProperty' otherlv_17= '(' this_AnnotationProperty_18= ruleAnnotationProperty otherlv_19= ')' ) | (otherlv_20= 'NamedIndividual' otherlv_21= '(' this_NamedIndividual_22= ruleNamedIndividual otherlv_23= ')' ) ) )
            // InternalOwl.g:839:2: ( (otherlv_0= 'Class' otherlv_1= '(' this_Class_2= ruleClass otherlv_3= ')' ) | (otherlv_4= 'Datatype' otherlv_5= '(' this_Datatype_6= ruleDatatype otherlv_7= ')' ) | (otherlv_8= 'ObjectProperty' otherlv_9= '(' this_ObjectProperty_10= ruleObjectProperty otherlv_11= ')' ) | (otherlv_12= 'DataProperty' otherlv_13= '(' this_DataProperty_14= ruleDataProperty otherlv_15= ')' ) | (otherlv_16= 'AnnotationProperty' otherlv_17= '(' this_AnnotationProperty_18= ruleAnnotationProperty otherlv_19= ')' ) | (otherlv_20= 'NamedIndividual' otherlv_21= '(' this_NamedIndividual_22= ruleNamedIndividual otherlv_23= ')' ) )
            {
            // InternalOwl.g:839:2: ( (otherlv_0= 'Class' otherlv_1= '(' this_Class_2= ruleClass otherlv_3= ')' ) | (otherlv_4= 'Datatype' otherlv_5= '(' this_Datatype_6= ruleDatatype otherlv_7= ')' ) | (otherlv_8= 'ObjectProperty' otherlv_9= '(' this_ObjectProperty_10= ruleObjectProperty otherlv_11= ')' ) | (otherlv_12= 'DataProperty' otherlv_13= '(' this_DataProperty_14= ruleDataProperty otherlv_15= ')' ) | (otherlv_16= 'AnnotationProperty' otherlv_17= '(' this_AnnotationProperty_18= ruleAnnotationProperty otherlv_19= ')' ) | (otherlv_20= 'NamedIndividual' otherlv_21= '(' this_NamedIndividual_22= ruleNamedIndividual otherlv_23= ')' ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt9=1;
                }
                break;
            case 28:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            case 30:
                {
                alt9=4;
                }
                break;
            case 31:
                {
                alt9=5;
                }
                break;
            case 32:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalOwl.g:840:3: (otherlv_0= 'Class' otherlv_1= '(' this_Class_2= ruleClass otherlv_3= ')' )
                    {
                    // InternalOwl.g:840:3: (otherlv_0= 'Class' otherlv_1= '(' this_Class_2= ruleClass otherlv_3= ')' )
                    // InternalOwl.g:841:4: otherlv_0= 'Class' otherlv_1= '(' this_Class_2= ruleClass otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getEntityDeclarationAccess().getClassKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntityDeclarationAccess().getLeftParenthesisKeyword_0_1());
                    			

                    				newCompositeNode(grammarAccess.getEntityDeclarationAccess().getClassParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_8);
                    this_Class_2=ruleClass();

                    state._fsp--;


                    				current = this_Class_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityDeclarationAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOwl.g:863:3: (otherlv_4= 'Datatype' otherlv_5= '(' this_Datatype_6= ruleDatatype otherlv_7= ')' )
                    {
                    // InternalOwl.g:863:3: (otherlv_4= 'Datatype' otherlv_5= '(' this_Datatype_6= ruleDatatype otherlv_7= ')' )
                    // InternalOwl.g:864:4: otherlv_4= 'Datatype' otherlv_5= '(' this_Datatype_6= ruleDatatype otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityDeclarationAccess().getDatatypeKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntityDeclarationAccess().getLeftParenthesisKeyword_1_1());
                    			

                    				newCompositeNode(grammarAccess.getEntityDeclarationAccess().getDatatypeParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_8);
                    this_Datatype_6=ruleDatatype();

                    state._fsp--;


                    				current = this_Datatype_6;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_7=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getEntityDeclarationAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOwl.g:886:3: (otherlv_8= 'ObjectProperty' otherlv_9= '(' this_ObjectProperty_10= ruleObjectProperty otherlv_11= ')' )
                    {
                    // InternalOwl.g:886:3: (otherlv_8= 'ObjectProperty' otherlv_9= '(' this_ObjectProperty_10= ruleObjectProperty otherlv_11= ')' )
                    // InternalOwl.g:887:4: otherlv_8= 'ObjectProperty' otherlv_9= '(' this_ObjectProperty_10= ruleObjectProperty otherlv_11= ')'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEntityDeclarationAccess().getObjectPropertyKeyword_2_0());
                    			
                    otherlv_9=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getEntityDeclarationAccess().getLeftParenthesisKeyword_2_1());
                    			

                    				newCompositeNode(grammarAccess.getEntityDeclarationAccess().getObjectPropertyParserRuleCall_2_2());
                    			
                    pushFollow(FOLLOW_8);
                    this_ObjectProperty_10=ruleObjectProperty();

                    state._fsp--;


                    				current = this_ObjectProperty_10;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_11=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getEntityDeclarationAccess().getRightParenthesisKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOwl.g:909:3: (otherlv_12= 'DataProperty' otherlv_13= '(' this_DataProperty_14= ruleDataProperty otherlv_15= ')' )
                    {
                    // InternalOwl.g:909:3: (otherlv_12= 'DataProperty' otherlv_13= '(' this_DataProperty_14= ruleDataProperty otherlv_15= ')' )
                    // InternalOwl.g:910:4: otherlv_12= 'DataProperty' otherlv_13= '(' this_DataProperty_14= ruleDataProperty otherlv_15= ')'
                    {
                    otherlv_12=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getEntityDeclarationAccess().getDataPropertyKeyword_3_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getEntityDeclarationAccess().getLeftParenthesisKeyword_3_1());
                    			

                    				newCompositeNode(grammarAccess.getEntityDeclarationAccess().getDataPropertyParserRuleCall_3_2());
                    			
                    pushFollow(FOLLOW_8);
                    this_DataProperty_14=ruleDataProperty();

                    state._fsp--;


                    				current = this_DataProperty_14;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_15=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getEntityDeclarationAccess().getRightParenthesisKeyword_3_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOwl.g:932:3: (otherlv_16= 'AnnotationProperty' otherlv_17= '(' this_AnnotationProperty_18= ruleAnnotationProperty otherlv_19= ')' )
                    {
                    // InternalOwl.g:932:3: (otherlv_16= 'AnnotationProperty' otherlv_17= '(' this_AnnotationProperty_18= ruleAnnotationProperty otherlv_19= ')' )
                    // InternalOwl.g:933:4: otherlv_16= 'AnnotationProperty' otherlv_17= '(' this_AnnotationProperty_18= ruleAnnotationProperty otherlv_19= ')'
                    {
                    otherlv_16=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEntityDeclarationAccess().getAnnotationPropertyKeyword_4_0());
                    			
                    otherlv_17=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_17, grammarAccess.getEntityDeclarationAccess().getLeftParenthesisKeyword_4_1());
                    			

                    				newCompositeNode(grammarAccess.getEntityDeclarationAccess().getAnnotationPropertyParserRuleCall_4_2());
                    			
                    pushFollow(FOLLOW_8);
                    this_AnnotationProperty_18=ruleAnnotationProperty();

                    state._fsp--;


                    				current = this_AnnotationProperty_18;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_19=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getEntityDeclarationAccess().getRightParenthesisKeyword_4_3());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOwl.g:955:3: (otherlv_20= 'NamedIndividual' otherlv_21= '(' this_NamedIndividual_22= ruleNamedIndividual otherlv_23= ')' )
                    {
                    // InternalOwl.g:955:3: (otherlv_20= 'NamedIndividual' otherlv_21= '(' this_NamedIndividual_22= ruleNamedIndividual otherlv_23= ')' )
                    // InternalOwl.g:956:4: otherlv_20= 'NamedIndividual' otherlv_21= '(' this_NamedIndividual_22= ruleNamedIndividual otherlv_23= ')'
                    {
                    otherlv_20=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getEntityDeclarationAccess().getNamedIndividualKeyword_5_0());
                    			
                    otherlv_21=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getEntityDeclarationAccess().getLeftParenthesisKeyword_5_1());
                    			

                    				newCompositeNode(grammarAccess.getEntityDeclarationAccess().getNamedIndividualParserRuleCall_5_2());
                    			
                    pushFollow(FOLLOW_8);
                    this_NamedIndividual_22=ruleNamedIndividual();

                    state._fsp--;


                    				current = this_NamedIndividual_22;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_23=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getEntityDeclarationAccess().getRightParenthesisKeyword_5_3());
                    			

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
    // $ANTLR end "ruleEntityDeclaration"


    // $ANTLR start "entryRuleObjectPropertyExpression"
    // InternalOwl.g:981:1: entryRuleObjectPropertyExpression returns [EObject current=null] : iv_ruleObjectPropertyExpression= ruleObjectPropertyExpression EOF ;
    public final EObject entryRuleObjectPropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectPropertyExpression = null;


        try {
            // InternalOwl.g:981:65: (iv_ruleObjectPropertyExpression= ruleObjectPropertyExpression EOF )
            // InternalOwl.g:982:2: iv_ruleObjectPropertyExpression= ruleObjectPropertyExpression EOF
            {
             newCompositeNode(grammarAccess.getObjectPropertyExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectPropertyExpression=ruleObjectPropertyExpression();

            state._fsp--;

             current =iv_ruleObjectPropertyExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectPropertyExpression"


    // $ANTLR start "ruleObjectPropertyExpression"
    // InternalOwl.g:988:1: ruleObjectPropertyExpression returns [EObject current=null] : (this_ObjectPropertyReference_0= ruleObjectPropertyReference | this_InverseObjectProperty_1= ruleInverseObjectProperty ) ;
    public final EObject ruleObjectPropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectPropertyReference_0 = null;

        EObject this_InverseObjectProperty_1 = null;



        	enterRule();

        try {
            // InternalOwl.g:994:2: ( (this_ObjectPropertyReference_0= ruleObjectPropertyReference | this_InverseObjectProperty_1= ruleInverseObjectProperty ) )
            // InternalOwl.g:995:2: (this_ObjectPropertyReference_0= ruleObjectPropertyReference | this_InverseObjectProperty_1= ruleInverseObjectProperty )
            {
            // InternalOwl.g:995:2: (this_ObjectPropertyReference_0= ruleObjectPropertyReference | this_InverseObjectProperty_1= ruleInverseObjectProperty )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_FULL_IRI && LA10_0<=RULE_PN_LOCAL)) ) {
                alt10=1;
            }
            else if ( (LA10_0==33) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalOwl.g:996:3: this_ObjectPropertyReference_0= ruleObjectPropertyReference
                    {

                    			newCompositeNode(grammarAccess.getObjectPropertyExpressionAccess().getObjectPropertyReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectPropertyReference_0=ruleObjectPropertyReference();

                    state._fsp--;


                    			current = this_ObjectPropertyReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOwl.g:1005:3: this_InverseObjectProperty_1= ruleInverseObjectProperty
                    {

                    			newCompositeNode(grammarAccess.getObjectPropertyExpressionAccess().getInverseObjectPropertyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InverseObjectProperty_1=ruleInverseObjectProperty();

                    state._fsp--;


                    			current = this_InverseObjectProperty_1;
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
    // $ANTLR end "ruleObjectPropertyExpression"


    // $ANTLR start "entryRuleObjectPropertyReference"
    // InternalOwl.g:1017:1: entryRuleObjectPropertyReference returns [EObject current=null] : iv_ruleObjectPropertyReference= ruleObjectPropertyReference EOF ;
    public final EObject entryRuleObjectPropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectPropertyReference = null;


        try {
            // InternalOwl.g:1017:64: (iv_ruleObjectPropertyReference= ruleObjectPropertyReference EOF )
            // InternalOwl.g:1018:2: iv_ruleObjectPropertyReference= ruleObjectPropertyReference EOF
            {
             newCompositeNode(grammarAccess.getObjectPropertyReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectPropertyReference=ruleObjectPropertyReference();

            state._fsp--;

             current =iv_ruleObjectPropertyReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectPropertyReference"


    // $ANTLR start "ruleObjectPropertyReference"
    // InternalOwl.g:1024:1: ruleObjectPropertyReference returns [EObject current=null] : ( (lv_objectProperty_0_0= ruleIRI ) ) ;
    public final EObject ruleObjectPropertyReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_objectProperty_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1030:2: ( ( (lv_objectProperty_0_0= ruleIRI ) ) )
            // InternalOwl.g:1031:2: ( (lv_objectProperty_0_0= ruleIRI ) )
            {
            // InternalOwl.g:1031:2: ( (lv_objectProperty_0_0= ruleIRI ) )
            // InternalOwl.g:1032:3: (lv_objectProperty_0_0= ruleIRI )
            {
            // InternalOwl.g:1032:3: (lv_objectProperty_0_0= ruleIRI )
            // InternalOwl.g:1033:4: lv_objectProperty_0_0= ruleIRI
            {

            				newCompositeNode(grammarAccess.getObjectPropertyReferenceAccess().getObjectPropertyIRIParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_objectProperty_0_0=ruleIRI();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getObjectPropertyReferenceRule());
            				}
            				set(
            					current,
            					"objectProperty",
            					lv_objectProperty_0_0,
            					"org.omg.sysml.owl.Owl.IRI");
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
    // $ANTLR end "ruleObjectPropertyReference"


    // $ANTLR start "entryRuleInverseObjectProperty"
    // InternalOwl.g:1053:1: entryRuleInverseObjectProperty returns [EObject current=null] : iv_ruleInverseObjectProperty= ruleInverseObjectProperty EOF ;
    public final EObject entryRuleInverseObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInverseObjectProperty = null;


        try {
            // InternalOwl.g:1053:62: (iv_ruleInverseObjectProperty= ruleInverseObjectProperty EOF )
            // InternalOwl.g:1054:2: iv_ruleInverseObjectProperty= ruleInverseObjectProperty EOF
            {
             newCompositeNode(grammarAccess.getInverseObjectPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInverseObjectProperty=ruleInverseObjectProperty();

            state._fsp--;

             current =iv_ruleInverseObjectProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInverseObjectProperty"


    // $ANTLR start "ruleInverseObjectProperty"
    // InternalOwl.g:1060:1: ruleInverseObjectProperty returns [EObject current=null] : (otherlv_0= 'ObjectInverseOf' otherlv_1= '(' ( (lv_objectProperty_2_0= ruleIRI ) ) otherlv_3= ')' ) ;
    public final EObject ruleInverseObjectProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_objectProperty_2_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1066:2: ( (otherlv_0= 'ObjectInverseOf' otherlv_1= '(' ( (lv_objectProperty_2_0= ruleIRI ) ) otherlv_3= ')' ) )
            // InternalOwl.g:1067:2: (otherlv_0= 'ObjectInverseOf' otherlv_1= '(' ( (lv_objectProperty_2_0= ruleIRI ) ) otherlv_3= ')' )
            {
            // InternalOwl.g:1067:2: (otherlv_0= 'ObjectInverseOf' otherlv_1= '(' ( (lv_objectProperty_2_0= ruleIRI ) ) otherlv_3= ')' )
            // InternalOwl.g:1068:3: otherlv_0= 'ObjectInverseOf' otherlv_1= '(' ( (lv_objectProperty_2_0= ruleIRI ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInverseObjectPropertyAccess().getObjectInverseOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getInverseObjectPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:1076:3: ( (lv_objectProperty_2_0= ruleIRI ) )
            // InternalOwl.g:1077:4: (lv_objectProperty_2_0= ruleIRI )
            {
            // InternalOwl.g:1077:4: (lv_objectProperty_2_0= ruleIRI )
            // InternalOwl.g:1078:5: lv_objectProperty_2_0= ruleIRI
            {

            					newCompositeNode(grammarAccess.getInverseObjectPropertyAccess().getObjectPropertyIRIParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_objectProperty_2_0=ruleIRI();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInverseObjectPropertyRule());
            					}
            					set(
            						current,
            						"objectProperty",
            						lv_objectProperty_2_0,
            						"org.omg.sysml.owl.Owl.IRI");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInverseObjectPropertyAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInverseObjectProperty"


    // $ANTLR start "entryRuleDataPropertyExpression"
    // InternalOwl.g:1103:1: entryRuleDataPropertyExpression returns [EObject current=null] : iv_ruleDataPropertyExpression= ruleDataPropertyExpression EOF ;
    public final EObject entryRuleDataPropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPropertyExpression = null;


        try {
            // InternalOwl.g:1103:63: (iv_ruleDataPropertyExpression= ruleDataPropertyExpression EOF )
            // InternalOwl.g:1104:2: iv_ruleDataPropertyExpression= ruleDataPropertyExpression EOF
            {
             newCompositeNode(grammarAccess.getDataPropertyExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataPropertyExpression=ruleDataPropertyExpression();

            state._fsp--;

             current =iv_ruleDataPropertyExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataPropertyExpression"


    // $ANTLR start "ruleDataPropertyExpression"
    // InternalOwl.g:1110:1: ruleDataPropertyExpression returns [EObject current=null] : this_DataPropertyReference_0= ruleDataPropertyReference ;
    public final EObject ruleDataPropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DataPropertyReference_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1116:2: (this_DataPropertyReference_0= ruleDataPropertyReference )
            // InternalOwl.g:1117:2: this_DataPropertyReference_0= ruleDataPropertyReference
            {

            		newCompositeNode(grammarAccess.getDataPropertyExpressionAccess().getDataPropertyReferenceParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_DataPropertyReference_0=ruleDataPropertyReference();

            state._fsp--;


            		current = this_DataPropertyReference_0;
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
    // $ANTLR end "ruleDataPropertyExpression"


    // $ANTLR start "entryRuleDataPropertyReference"
    // InternalOwl.g:1128:1: entryRuleDataPropertyReference returns [EObject current=null] : iv_ruleDataPropertyReference= ruleDataPropertyReference EOF ;
    public final EObject entryRuleDataPropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPropertyReference = null;


        try {
            // InternalOwl.g:1128:62: (iv_ruleDataPropertyReference= ruleDataPropertyReference EOF )
            // InternalOwl.g:1129:2: iv_ruleDataPropertyReference= ruleDataPropertyReference EOF
            {
             newCompositeNode(grammarAccess.getDataPropertyReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataPropertyReference=ruleDataPropertyReference();

            state._fsp--;

             current =iv_ruleDataPropertyReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataPropertyReference"


    // $ANTLR start "ruleDataPropertyReference"
    // InternalOwl.g:1135:1: ruleDataPropertyReference returns [EObject current=null] : ( (lv_dataProperty_0_0= ruleIRI ) ) ;
    public final EObject ruleDataPropertyReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_dataProperty_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1141:2: ( ( (lv_dataProperty_0_0= ruleIRI ) ) )
            // InternalOwl.g:1142:2: ( (lv_dataProperty_0_0= ruleIRI ) )
            {
            // InternalOwl.g:1142:2: ( (lv_dataProperty_0_0= ruleIRI ) )
            // InternalOwl.g:1143:3: (lv_dataProperty_0_0= ruleIRI )
            {
            // InternalOwl.g:1143:3: (lv_dataProperty_0_0= ruleIRI )
            // InternalOwl.g:1144:4: lv_dataProperty_0_0= ruleIRI
            {

            				newCompositeNode(grammarAccess.getDataPropertyReferenceAccess().getDataPropertyIRIParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_dataProperty_0_0=ruleIRI();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDataPropertyReferenceRule());
            				}
            				set(
            					current,
            					"dataProperty",
            					lv_dataProperty_0_0,
            					"org.omg.sysml.owl.Owl.IRI");
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
    // $ANTLR end "ruleDataPropertyReference"


    // $ANTLR start "entryRuleDataRange"
    // InternalOwl.g:1164:1: entryRuleDataRange returns [EObject current=null] : iv_ruleDataRange= ruleDataRange EOF ;
    public final EObject entryRuleDataRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataRange = null;


        try {
            // InternalOwl.g:1164:50: (iv_ruleDataRange= ruleDataRange EOF )
            // InternalOwl.g:1165:2: iv_ruleDataRange= ruleDataRange EOF
            {
             newCompositeNode(grammarAccess.getDataRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataRange=ruleDataRange();

            state._fsp--;

             current =iv_ruleDataRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataRange"


    // $ANTLR start "ruleDataRange"
    // InternalOwl.g:1171:1: ruleDataRange returns [EObject current=null] : (this_DatatypeReference_0= ruleDatatypeReference | this_DataIntersectionOf_1= ruleDataIntersectionOf | this_DataUnionOf_2= ruleDataUnionOf | this_DataComplementOf_3= ruleDataComplementOf | this_DataOneOf_4= ruleDataOneOf | this_DatatypeRestriction_5= ruleDatatypeRestriction ) ;
    public final EObject ruleDataRange() throws RecognitionException {
        EObject current = null;

        EObject this_DatatypeReference_0 = null;

        EObject this_DataIntersectionOf_1 = null;

        EObject this_DataUnionOf_2 = null;

        EObject this_DataComplementOf_3 = null;

        EObject this_DataOneOf_4 = null;

        EObject this_DatatypeRestriction_5 = null;



        	enterRule();

        try {
            // InternalOwl.g:1177:2: ( (this_DatatypeReference_0= ruleDatatypeReference | this_DataIntersectionOf_1= ruleDataIntersectionOf | this_DataUnionOf_2= ruleDataUnionOf | this_DataComplementOf_3= ruleDataComplementOf | this_DataOneOf_4= ruleDataOneOf | this_DatatypeRestriction_5= ruleDatatypeRestriction ) )
            // InternalOwl.g:1178:2: (this_DatatypeReference_0= ruleDatatypeReference | this_DataIntersectionOf_1= ruleDataIntersectionOf | this_DataUnionOf_2= ruleDataUnionOf | this_DataComplementOf_3= ruleDataComplementOf | this_DataOneOf_4= ruleDataOneOf | this_DatatypeRestriction_5= ruleDatatypeRestriction )
            {
            // InternalOwl.g:1178:2: (this_DatatypeReference_0= ruleDatatypeReference | this_DataIntersectionOf_1= ruleDataIntersectionOf | this_DataUnionOf_2= ruleDataUnionOf | this_DataComplementOf_3= ruleDataComplementOf | this_DataOneOf_4= ruleDataOneOf | this_DatatypeRestriction_5= ruleDatatypeRestriction )
            int alt11=6;
            switch ( input.LA(1) ) {
            case RULE_FULL_IRI:
            case RULE_PN_PREFIX:
            case RULE_PN_LOCAL:
                {
                alt11=1;
                }
                break;
            case 34:
                {
                alt11=2;
                }
                break;
            case 35:
                {
                alt11=3;
                }
                break;
            case 36:
                {
                alt11=4;
                }
                break;
            case 37:
                {
                alt11=5;
                }
                break;
            case 38:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalOwl.g:1179:3: this_DatatypeReference_0= ruleDatatypeReference
                    {

                    			newCompositeNode(grammarAccess.getDataRangeAccess().getDatatypeReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DatatypeReference_0=ruleDatatypeReference();

                    state._fsp--;


                    			current = this_DatatypeReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOwl.g:1188:3: this_DataIntersectionOf_1= ruleDataIntersectionOf
                    {

                    			newCompositeNode(grammarAccess.getDataRangeAccess().getDataIntersectionOfParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataIntersectionOf_1=ruleDataIntersectionOf();

                    state._fsp--;


                    			current = this_DataIntersectionOf_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOwl.g:1197:3: this_DataUnionOf_2= ruleDataUnionOf
                    {

                    			newCompositeNode(grammarAccess.getDataRangeAccess().getDataUnionOfParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataUnionOf_2=ruleDataUnionOf();

                    state._fsp--;


                    			current = this_DataUnionOf_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOwl.g:1206:3: this_DataComplementOf_3= ruleDataComplementOf
                    {

                    			newCompositeNode(grammarAccess.getDataRangeAccess().getDataComplementOfParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataComplementOf_3=ruleDataComplementOf();

                    state._fsp--;


                    			current = this_DataComplementOf_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOwl.g:1215:3: this_DataOneOf_4= ruleDataOneOf
                    {

                    			newCompositeNode(grammarAccess.getDataRangeAccess().getDataOneOfParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataOneOf_4=ruleDataOneOf();

                    state._fsp--;


                    			current = this_DataOneOf_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOwl.g:1224:3: this_DatatypeRestriction_5= ruleDatatypeRestriction
                    {

                    			newCompositeNode(grammarAccess.getDataRangeAccess().getDatatypeRestrictionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DatatypeRestriction_5=ruleDatatypeRestriction();

                    state._fsp--;


                    			current = this_DatatypeRestriction_5;
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
    // $ANTLR end "ruleDataRange"


    // $ANTLR start "entryRuleDatatypeReference"
    // InternalOwl.g:1236:1: entryRuleDatatypeReference returns [EObject current=null] : iv_ruleDatatypeReference= ruleDatatypeReference EOF ;
    public final EObject entryRuleDatatypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypeReference = null;


        try {
            // InternalOwl.g:1236:58: (iv_ruleDatatypeReference= ruleDatatypeReference EOF )
            // InternalOwl.g:1237:2: iv_ruleDatatypeReference= ruleDatatypeReference EOF
            {
             newCompositeNode(grammarAccess.getDatatypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatatypeReference=ruleDatatypeReference();

            state._fsp--;

             current =iv_ruleDatatypeReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatypeReference"


    // $ANTLR start "ruleDatatypeReference"
    // InternalOwl.g:1243:1: ruleDatatypeReference returns [EObject current=null] : ( (lv_datatype_0_0= ruleIRI ) ) ;
    public final EObject ruleDatatypeReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_datatype_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1249:2: ( ( (lv_datatype_0_0= ruleIRI ) ) )
            // InternalOwl.g:1250:2: ( (lv_datatype_0_0= ruleIRI ) )
            {
            // InternalOwl.g:1250:2: ( (lv_datatype_0_0= ruleIRI ) )
            // InternalOwl.g:1251:3: (lv_datatype_0_0= ruleIRI )
            {
            // InternalOwl.g:1251:3: (lv_datatype_0_0= ruleIRI )
            // InternalOwl.g:1252:4: lv_datatype_0_0= ruleIRI
            {

            				newCompositeNode(grammarAccess.getDatatypeReferenceAccess().getDatatypeIRIParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_datatype_0_0=ruleIRI();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDatatypeReferenceRule());
            				}
            				set(
            					current,
            					"datatype",
            					lv_datatype_0_0,
            					"org.omg.sysml.owl.Owl.IRI");
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
    // $ANTLR end "ruleDatatypeReference"


    // $ANTLR start "entryRuleDataIntersectionOf"
    // InternalOwl.g:1272:1: entryRuleDataIntersectionOf returns [EObject current=null] : iv_ruleDataIntersectionOf= ruleDataIntersectionOf EOF ;
    public final EObject entryRuleDataIntersectionOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataIntersectionOf = null;


        try {
            // InternalOwl.g:1272:59: (iv_ruleDataIntersectionOf= ruleDataIntersectionOf EOF )
            // InternalOwl.g:1273:2: iv_ruleDataIntersectionOf= ruleDataIntersectionOf EOF
            {
             newCompositeNode(grammarAccess.getDataIntersectionOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataIntersectionOf=ruleDataIntersectionOf();

            state._fsp--;

             current =iv_ruleDataIntersectionOf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataIntersectionOf"


    // $ANTLR start "ruleDataIntersectionOf"
    // InternalOwl.g:1279:1: ruleDataIntersectionOf returns [EObject current=null] : (otherlv_0= 'DataIntersectionOf' otherlv_1= '(' ( (lv_dataRanges_2_0= ruleDataRange ) ) ( (lv_dataRanges_3_0= ruleDataRange ) )+ otherlv_4= ')' ) ;
    public final EObject ruleDataIntersectionOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_dataRanges_2_0 = null;

        EObject lv_dataRanges_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1285:2: ( (otherlv_0= 'DataIntersectionOf' otherlv_1= '(' ( (lv_dataRanges_2_0= ruleDataRange ) ) ( (lv_dataRanges_3_0= ruleDataRange ) )+ otherlv_4= ')' ) )
            // InternalOwl.g:1286:2: (otherlv_0= 'DataIntersectionOf' otherlv_1= '(' ( (lv_dataRanges_2_0= ruleDataRange ) ) ( (lv_dataRanges_3_0= ruleDataRange ) )+ otherlv_4= ')' )
            {
            // InternalOwl.g:1286:2: (otherlv_0= 'DataIntersectionOf' otherlv_1= '(' ( (lv_dataRanges_2_0= ruleDataRange ) ) ( (lv_dataRanges_3_0= ruleDataRange ) )+ otherlv_4= ')' )
            // InternalOwl.g:1287:3: otherlv_0= 'DataIntersectionOf' otherlv_1= '(' ( (lv_dataRanges_2_0= ruleDataRange ) ) ( (lv_dataRanges_3_0= ruleDataRange ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataIntersectionOfAccess().getDataIntersectionOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDataIntersectionOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:1295:3: ( (lv_dataRanges_2_0= ruleDataRange ) )
            // InternalOwl.g:1296:4: (lv_dataRanges_2_0= ruleDataRange )
            {
            // InternalOwl.g:1296:4: (lv_dataRanges_2_0= ruleDataRange )
            // InternalOwl.g:1297:5: lv_dataRanges_2_0= ruleDataRange
            {

            					newCompositeNode(grammarAccess.getDataIntersectionOfAccess().getDataRangesDataRangeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_dataRanges_2_0=ruleDataRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataIntersectionOfRule());
            					}
            					add(
            						current,
            						"dataRanges",
            						lv_dataRanges_2_0,
            						"org.omg.sysml.owl.Owl.DataRange");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:1314:3: ( (lv_dataRanges_3_0= ruleDataRange ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_FULL_IRI && LA12_0<=RULE_PN_LOCAL)||(LA12_0>=34 && LA12_0<=38)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOwl.g:1315:4: (lv_dataRanges_3_0= ruleDataRange )
            	    {
            	    // InternalOwl.g:1315:4: (lv_dataRanges_3_0= ruleDataRange )
            	    // InternalOwl.g:1316:5: lv_dataRanges_3_0= ruleDataRange
            	    {

            	    					newCompositeNode(grammarAccess.getDataIntersectionOfAccess().getDataRangesDataRangeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_dataRanges_3_0=ruleDataRange();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataIntersectionOfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataRanges",
            	    						lv_dataRanges_3_0,
            	    						"org.omg.sysml.owl.Owl.DataRange");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDataIntersectionOfAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataIntersectionOf"


    // $ANTLR start "entryRuleDataUnionOf"
    // InternalOwl.g:1341:1: entryRuleDataUnionOf returns [EObject current=null] : iv_ruleDataUnionOf= ruleDataUnionOf EOF ;
    public final EObject entryRuleDataUnionOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataUnionOf = null;


        try {
            // InternalOwl.g:1341:52: (iv_ruleDataUnionOf= ruleDataUnionOf EOF )
            // InternalOwl.g:1342:2: iv_ruleDataUnionOf= ruleDataUnionOf EOF
            {
             newCompositeNode(grammarAccess.getDataUnionOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataUnionOf=ruleDataUnionOf();

            state._fsp--;

             current =iv_ruleDataUnionOf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataUnionOf"


    // $ANTLR start "ruleDataUnionOf"
    // InternalOwl.g:1348:1: ruleDataUnionOf returns [EObject current=null] : (otherlv_0= 'DataUnionOf' otherlv_1= '(' ( (lv_dataRanges_2_0= ruleDataRange ) ) ( (lv_dataRanges_3_0= ruleDataRange ) )+ otherlv_4= ')' ) ;
    public final EObject ruleDataUnionOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_dataRanges_2_0 = null;

        EObject lv_dataRanges_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1354:2: ( (otherlv_0= 'DataUnionOf' otherlv_1= '(' ( (lv_dataRanges_2_0= ruleDataRange ) ) ( (lv_dataRanges_3_0= ruleDataRange ) )+ otherlv_4= ')' ) )
            // InternalOwl.g:1355:2: (otherlv_0= 'DataUnionOf' otherlv_1= '(' ( (lv_dataRanges_2_0= ruleDataRange ) ) ( (lv_dataRanges_3_0= ruleDataRange ) )+ otherlv_4= ')' )
            {
            // InternalOwl.g:1355:2: (otherlv_0= 'DataUnionOf' otherlv_1= '(' ( (lv_dataRanges_2_0= ruleDataRange ) ) ( (lv_dataRanges_3_0= ruleDataRange ) )+ otherlv_4= ')' )
            // InternalOwl.g:1356:3: otherlv_0= 'DataUnionOf' otherlv_1= '(' ( (lv_dataRanges_2_0= ruleDataRange ) ) ( (lv_dataRanges_3_0= ruleDataRange ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataUnionOfAccess().getDataUnionOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDataUnionOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:1364:3: ( (lv_dataRanges_2_0= ruleDataRange ) )
            // InternalOwl.g:1365:4: (lv_dataRanges_2_0= ruleDataRange )
            {
            // InternalOwl.g:1365:4: (lv_dataRanges_2_0= ruleDataRange )
            // InternalOwl.g:1366:5: lv_dataRanges_2_0= ruleDataRange
            {

            					newCompositeNode(grammarAccess.getDataUnionOfAccess().getDataRangesDataRangeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_dataRanges_2_0=ruleDataRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataUnionOfRule());
            					}
            					add(
            						current,
            						"dataRanges",
            						lv_dataRanges_2_0,
            						"org.omg.sysml.owl.Owl.DataRange");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:1383:3: ( (lv_dataRanges_3_0= ruleDataRange ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_FULL_IRI && LA13_0<=RULE_PN_LOCAL)||(LA13_0>=34 && LA13_0<=38)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOwl.g:1384:4: (lv_dataRanges_3_0= ruleDataRange )
            	    {
            	    // InternalOwl.g:1384:4: (lv_dataRanges_3_0= ruleDataRange )
            	    // InternalOwl.g:1385:5: lv_dataRanges_3_0= ruleDataRange
            	    {

            	    					newCompositeNode(grammarAccess.getDataUnionOfAccess().getDataRangesDataRangeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_dataRanges_3_0=ruleDataRange();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataUnionOfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataRanges",
            	    						lv_dataRanges_3_0,
            	    						"org.omg.sysml.owl.Owl.DataRange");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDataUnionOfAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataUnionOf"


    // $ANTLR start "entryRuleDataComplementOf"
    // InternalOwl.g:1410:1: entryRuleDataComplementOf returns [EObject current=null] : iv_ruleDataComplementOf= ruleDataComplementOf EOF ;
    public final EObject entryRuleDataComplementOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataComplementOf = null;


        try {
            // InternalOwl.g:1410:57: (iv_ruleDataComplementOf= ruleDataComplementOf EOF )
            // InternalOwl.g:1411:2: iv_ruleDataComplementOf= ruleDataComplementOf EOF
            {
             newCompositeNode(grammarAccess.getDataComplementOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataComplementOf=ruleDataComplementOf();

            state._fsp--;

             current =iv_ruleDataComplementOf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataComplementOf"


    // $ANTLR start "ruleDataComplementOf"
    // InternalOwl.g:1417:1: ruleDataComplementOf returns [EObject current=null] : (otherlv_0= 'DataComplementOf' otherlv_1= '(' ( (lv_dataRange_2_0= ruleDataRange ) ) otherlv_3= ')' ) ;
    public final EObject ruleDataComplementOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dataRange_2_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1423:2: ( (otherlv_0= 'DataComplementOf' otherlv_1= '(' ( (lv_dataRange_2_0= ruleDataRange ) ) otherlv_3= ')' ) )
            // InternalOwl.g:1424:2: (otherlv_0= 'DataComplementOf' otherlv_1= '(' ( (lv_dataRange_2_0= ruleDataRange ) ) otherlv_3= ')' )
            {
            // InternalOwl.g:1424:2: (otherlv_0= 'DataComplementOf' otherlv_1= '(' ( (lv_dataRange_2_0= ruleDataRange ) ) otherlv_3= ')' )
            // InternalOwl.g:1425:3: otherlv_0= 'DataComplementOf' otherlv_1= '(' ( (lv_dataRange_2_0= ruleDataRange ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataComplementOfAccess().getDataComplementOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDataComplementOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:1433:3: ( (lv_dataRange_2_0= ruleDataRange ) )
            // InternalOwl.g:1434:4: (lv_dataRange_2_0= ruleDataRange )
            {
            // InternalOwl.g:1434:4: (lv_dataRange_2_0= ruleDataRange )
            // InternalOwl.g:1435:5: lv_dataRange_2_0= ruleDataRange
            {

            					newCompositeNode(grammarAccess.getDataComplementOfAccess().getDataRangeDataRangeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_dataRange_2_0=ruleDataRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataComplementOfRule());
            					}
            					set(
            						current,
            						"dataRange",
            						lv_dataRange_2_0,
            						"org.omg.sysml.owl.Owl.DataRange");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDataComplementOfAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataComplementOf"


    // $ANTLR start "entryRuleDataOneOf"
    // InternalOwl.g:1460:1: entryRuleDataOneOf returns [EObject current=null] : iv_ruleDataOneOf= ruleDataOneOf EOF ;
    public final EObject entryRuleDataOneOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataOneOf = null;


        try {
            // InternalOwl.g:1460:50: (iv_ruleDataOneOf= ruleDataOneOf EOF )
            // InternalOwl.g:1461:2: iv_ruleDataOneOf= ruleDataOneOf EOF
            {
             newCompositeNode(grammarAccess.getDataOneOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataOneOf=ruleDataOneOf();

            state._fsp--;

             current =iv_ruleDataOneOf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataOneOf"


    // $ANTLR start "ruleDataOneOf"
    // InternalOwl.g:1467:1: ruleDataOneOf returns [EObject current=null] : (otherlv_0= 'DataOneOf' otherlv_1= '(' ( (lv_literals_2_0= ruleLiteral ) )+ otherlv_3= ')' ) ;
    public final EObject ruleDataOneOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_literals_2_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1473:2: ( (otherlv_0= 'DataOneOf' otherlv_1= '(' ( (lv_literals_2_0= ruleLiteral ) )+ otherlv_3= ')' ) )
            // InternalOwl.g:1474:2: (otherlv_0= 'DataOneOf' otherlv_1= '(' ( (lv_literals_2_0= ruleLiteral ) )+ otherlv_3= ')' )
            {
            // InternalOwl.g:1474:2: (otherlv_0= 'DataOneOf' otherlv_1= '(' ( (lv_literals_2_0= ruleLiteral ) )+ otherlv_3= ')' )
            // InternalOwl.g:1475:3: otherlv_0= 'DataOneOf' otherlv_1= '(' ( (lv_literals_2_0= ruleLiteral ) )+ otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataOneOfAccess().getDataOneOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getDataOneOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:1483:3: ( (lv_literals_2_0= ruleLiteral ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalOwl.g:1484:4: (lv_literals_2_0= ruleLiteral )
            	    {
            	    // InternalOwl.g:1484:4: (lv_literals_2_0= ruleLiteral )
            	    // InternalOwl.g:1485:5: lv_literals_2_0= ruleLiteral
            	    {

            	    					newCompositeNode(grammarAccess.getDataOneOfAccess().getLiteralsLiteralParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_literals_2_0=ruleLiteral();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataOneOfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"literals",
            	    						lv_literals_2_0,
            	    						"org.omg.sysml.owl.Owl.Literal");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDataOneOfAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataOneOf"


    // $ANTLR start "entryRuleDatatypeRestriction"
    // InternalOwl.g:1510:1: entryRuleDatatypeRestriction returns [EObject current=null] : iv_ruleDatatypeRestriction= ruleDatatypeRestriction EOF ;
    public final EObject entryRuleDatatypeRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypeRestriction = null;


        try {
            // InternalOwl.g:1510:60: (iv_ruleDatatypeRestriction= ruleDatatypeRestriction EOF )
            // InternalOwl.g:1511:2: iv_ruleDatatypeRestriction= ruleDatatypeRestriction EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatatypeRestriction=ruleDatatypeRestriction();

            state._fsp--;

             current =iv_ruleDatatypeRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatypeRestriction"


    // $ANTLR start "ruleDatatypeRestriction"
    // InternalOwl.g:1517:1: ruleDatatypeRestriction returns [EObject current=null] : (otherlv_0= 'DatatypeRestriction' otherlv_1= '(' ( (lv_dataType_2_0= ruleDatatypeReference ) ) ( (lv_restrictions_3_0= ruleFacetRestriction ) )+ otherlv_4= ')' ) ;
    public final EObject ruleDatatypeRestriction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_dataType_2_0 = null;

        EObject lv_restrictions_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1523:2: ( (otherlv_0= 'DatatypeRestriction' otherlv_1= '(' ( (lv_dataType_2_0= ruleDatatypeReference ) ) ( (lv_restrictions_3_0= ruleFacetRestriction ) )+ otherlv_4= ')' ) )
            // InternalOwl.g:1524:2: (otherlv_0= 'DatatypeRestriction' otherlv_1= '(' ( (lv_dataType_2_0= ruleDatatypeReference ) ) ( (lv_restrictions_3_0= ruleFacetRestriction ) )+ otherlv_4= ')' )
            {
            // InternalOwl.g:1524:2: (otherlv_0= 'DatatypeRestriction' otherlv_1= '(' ( (lv_dataType_2_0= ruleDatatypeReference ) ) ( (lv_restrictions_3_0= ruleFacetRestriction ) )+ otherlv_4= ')' )
            // InternalOwl.g:1525:3: otherlv_0= 'DatatypeRestriction' otherlv_1= '(' ( (lv_dataType_2_0= ruleDatatypeReference ) ) ( (lv_restrictions_3_0= ruleFacetRestriction ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDatatypeRestrictionAccess().getDatatypeRestrictionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDatatypeRestrictionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:1533:3: ( (lv_dataType_2_0= ruleDatatypeReference ) )
            // InternalOwl.g:1534:4: (lv_dataType_2_0= ruleDatatypeReference )
            {
            // InternalOwl.g:1534:4: (lv_dataType_2_0= ruleDatatypeReference )
            // InternalOwl.g:1535:5: lv_dataType_2_0= ruleDatatypeReference
            {

            					newCompositeNode(grammarAccess.getDatatypeRestrictionAccess().getDataTypeDatatypeReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_dataType_2_0=ruleDatatypeReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatatypeRestrictionRule());
            					}
            					set(
            						current,
            						"dataType",
            						lv_dataType_2_0,
            						"org.omg.sysml.owl.Owl.DatatypeReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:1552:3: ( (lv_restrictions_3_0= ruleFacetRestriction ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_FULL_IRI && LA15_0<=RULE_PN_LOCAL)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalOwl.g:1553:4: (lv_restrictions_3_0= ruleFacetRestriction )
            	    {
            	    // InternalOwl.g:1553:4: (lv_restrictions_3_0= ruleFacetRestriction )
            	    // InternalOwl.g:1554:5: lv_restrictions_3_0= ruleFacetRestriction
            	    {

            	    					newCompositeNode(grammarAccess.getDatatypeRestrictionAccess().getRestrictionsFacetRestrictionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_restrictions_3_0=ruleFacetRestriction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDatatypeRestrictionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"restrictions",
            	    						lv_restrictions_3_0,
            	    						"org.omg.sysml.owl.Owl.FacetRestriction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDatatypeRestrictionAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatypeRestriction"


    // $ANTLR start "entryRuleFacetRestriction"
    // InternalOwl.g:1579:1: entryRuleFacetRestriction returns [EObject current=null] : iv_ruleFacetRestriction= ruleFacetRestriction EOF ;
    public final EObject entryRuleFacetRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetRestriction = null;


        try {
            // InternalOwl.g:1579:57: (iv_ruleFacetRestriction= ruleFacetRestriction EOF )
            // InternalOwl.g:1580:2: iv_ruleFacetRestriction= ruleFacetRestriction EOF
            {
             newCompositeNode(grammarAccess.getFacetRestrictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacetRestriction=ruleFacetRestriction();

            state._fsp--;

             current =iv_ruleFacetRestriction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFacetRestriction"


    // $ANTLR start "ruleFacetRestriction"
    // InternalOwl.g:1586:1: ruleFacetRestriction returns [EObject current=null] : ( ( (lv_constrainingFacet_0_0= ruleIRI ) ) ( (lv_restrictionValue_1_0= ruleLiteral ) ) ) ;
    public final EObject ruleFacetRestriction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_constrainingFacet_0_0 = null;

        EObject lv_restrictionValue_1_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1592:2: ( ( ( (lv_constrainingFacet_0_0= ruleIRI ) ) ( (lv_restrictionValue_1_0= ruleLiteral ) ) ) )
            // InternalOwl.g:1593:2: ( ( (lv_constrainingFacet_0_0= ruleIRI ) ) ( (lv_restrictionValue_1_0= ruleLiteral ) ) )
            {
            // InternalOwl.g:1593:2: ( ( (lv_constrainingFacet_0_0= ruleIRI ) ) ( (lv_restrictionValue_1_0= ruleLiteral ) ) )
            // InternalOwl.g:1594:3: ( (lv_constrainingFacet_0_0= ruleIRI ) ) ( (lv_restrictionValue_1_0= ruleLiteral ) )
            {
            // InternalOwl.g:1594:3: ( (lv_constrainingFacet_0_0= ruleIRI ) )
            // InternalOwl.g:1595:4: (lv_constrainingFacet_0_0= ruleIRI )
            {
            // InternalOwl.g:1595:4: (lv_constrainingFacet_0_0= ruleIRI )
            // InternalOwl.g:1596:5: lv_constrainingFacet_0_0= ruleIRI
            {

            					newCompositeNode(grammarAccess.getFacetRestrictionAccess().getConstrainingFacetIRIParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_constrainingFacet_0_0=ruleIRI();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFacetRestrictionRule());
            					}
            					set(
            						current,
            						"constrainingFacet",
            						lv_constrainingFacet_0_0,
            						"org.omg.sysml.owl.Owl.IRI");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:1613:3: ( (lv_restrictionValue_1_0= ruleLiteral ) )
            // InternalOwl.g:1614:4: (lv_restrictionValue_1_0= ruleLiteral )
            {
            // InternalOwl.g:1614:4: (lv_restrictionValue_1_0= ruleLiteral )
            // InternalOwl.g:1615:5: lv_restrictionValue_1_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getFacetRestrictionAccess().getRestrictionValueLiteralParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_restrictionValue_1_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFacetRestrictionRule());
            					}
            					set(
            						current,
            						"restrictionValue",
            						lv_restrictionValue_1_0,
            						"org.omg.sysml.owl.Owl.Literal");
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
    // $ANTLR end "ruleFacetRestriction"


    // $ANTLR start "entryRuleClassExpression"
    // InternalOwl.g:1636:1: entryRuleClassExpression returns [EObject current=null] : iv_ruleClassExpression= ruleClassExpression EOF ;
    public final EObject entryRuleClassExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassExpression = null;


        try {
            // InternalOwl.g:1636:56: (iv_ruleClassExpression= ruleClassExpression EOF )
            // InternalOwl.g:1637:2: iv_ruleClassExpression= ruleClassExpression EOF
            {
             newCompositeNode(grammarAccess.getClassExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassExpression=ruleClassExpression();

            state._fsp--;

             current =iv_ruleClassExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassExpression"


    // $ANTLR start "ruleClassExpression"
    // InternalOwl.g:1643:1: ruleClassExpression returns [EObject current=null] : (this_ClassReference_0= ruleClassReference | this_ObjectIntersectionOf_1= ruleObjectIntersectionOf | this_ObjectUnionOf_2= ruleObjectUnionOf | this_ObjectComplementOf_3= ruleObjectComplementOf | this_ObjectOneOf_4= ruleObjectOneOf | this_ObjectSomeValuesFrom_5= ruleObjectSomeValuesFrom | this_ObjectAllValuesFrom_6= ruleObjectAllValuesFrom | this_ObjectHasValue_7= ruleObjectHasValue | this_ObjectHasSelf_8= ruleObjectHasSelf | this_ObjectMinCardinality_9= ruleObjectMinCardinality | this_ObjectMaxCardinality_10= ruleObjectMaxCardinality | this_ObjectExactCardinality_11= ruleObjectExactCardinality | this_DataSomeValuesFrom_12= ruleDataSomeValuesFrom | this_DataAllValuesFrom_13= ruleDataAllValuesFrom | this_DataHasValue_14= ruleDataHasValue | this_DataMinCardinality_15= ruleDataMinCardinality | this_DataMaxCardinality_16= ruleDataMaxCardinality | this_DataExactCardinality_17= ruleDataExactCardinality ) ;
    public final EObject ruleClassExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ClassReference_0 = null;

        EObject this_ObjectIntersectionOf_1 = null;

        EObject this_ObjectUnionOf_2 = null;

        EObject this_ObjectComplementOf_3 = null;

        EObject this_ObjectOneOf_4 = null;

        EObject this_ObjectSomeValuesFrom_5 = null;

        EObject this_ObjectAllValuesFrom_6 = null;

        EObject this_ObjectHasValue_7 = null;

        EObject this_ObjectHasSelf_8 = null;

        EObject this_ObjectMinCardinality_9 = null;

        EObject this_ObjectMaxCardinality_10 = null;

        EObject this_ObjectExactCardinality_11 = null;

        EObject this_DataSomeValuesFrom_12 = null;

        EObject this_DataAllValuesFrom_13 = null;

        EObject this_DataHasValue_14 = null;

        EObject this_DataMinCardinality_15 = null;

        EObject this_DataMaxCardinality_16 = null;

        EObject this_DataExactCardinality_17 = null;



        	enterRule();

        try {
            // InternalOwl.g:1649:2: ( (this_ClassReference_0= ruleClassReference | this_ObjectIntersectionOf_1= ruleObjectIntersectionOf | this_ObjectUnionOf_2= ruleObjectUnionOf | this_ObjectComplementOf_3= ruleObjectComplementOf | this_ObjectOneOf_4= ruleObjectOneOf | this_ObjectSomeValuesFrom_5= ruleObjectSomeValuesFrom | this_ObjectAllValuesFrom_6= ruleObjectAllValuesFrom | this_ObjectHasValue_7= ruleObjectHasValue | this_ObjectHasSelf_8= ruleObjectHasSelf | this_ObjectMinCardinality_9= ruleObjectMinCardinality | this_ObjectMaxCardinality_10= ruleObjectMaxCardinality | this_ObjectExactCardinality_11= ruleObjectExactCardinality | this_DataSomeValuesFrom_12= ruleDataSomeValuesFrom | this_DataAllValuesFrom_13= ruleDataAllValuesFrom | this_DataHasValue_14= ruleDataHasValue | this_DataMinCardinality_15= ruleDataMinCardinality | this_DataMaxCardinality_16= ruleDataMaxCardinality | this_DataExactCardinality_17= ruleDataExactCardinality ) )
            // InternalOwl.g:1650:2: (this_ClassReference_0= ruleClassReference | this_ObjectIntersectionOf_1= ruleObjectIntersectionOf | this_ObjectUnionOf_2= ruleObjectUnionOf | this_ObjectComplementOf_3= ruleObjectComplementOf | this_ObjectOneOf_4= ruleObjectOneOf | this_ObjectSomeValuesFrom_5= ruleObjectSomeValuesFrom | this_ObjectAllValuesFrom_6= ruleObjectAllValuesFrom | this_ObjectHasValue_7= ruleObjectHasValue | this_ObjectHasSelf_8= ruleObjectHasSelf | this_ObjectMinCardinality_9= ruleObjectMinCardinality | this_ObjectMaxCardinality_10= ruleObjectMaxCardinality | this_ObjectExactCardinality_11= ruleObjectExactCardinality | this_DataSomeValuesFrom_12= ruleDataSomeValuesFrom | this_DataAllValuesFrom_13= ruleDataAllValuesFrom | this_DataHasValue_14= ruleDataHasValue | this_DataMinCardinality_15= ruleDataMinCardinality | this_DataMaxCardinality_16= ruleDataMaxCardinality | this_DataExactCardinality_17= ruleDataExactCardinality )
            {
            // InternalOwl.g:1650:2: (this_ClassReference_0= ruleClassReference | this_ObjectIntersectionOf_1= ruleObjectIntersectionOf | this_ObjectUnionOf_2= ruleObjectUnionOf | this_ObjectComplementOf_3= ruleObjectComplementOf | this_ObjectOneOf_4= ruleObjectOneOf | this_ObjectSomeValuesFrom_5= ruleObjectSomeValuesFrom | this_ObjectAllValuesFrom_6= ruleObjectAllValuesFrom | this_ObjectHasValue_7= ruleObjectHasValue | this_ObjectHasSelf_8= ruleObjectHasSelf | this_ObjectMinCardinality_9= ruleObjectMinCardinality | this_ObjectMaxCardinality_10= ruleObjectMaxCardinality | this_ObjectExactCardinality_11= ruleObjectExactCardinality | this_DataSomeValuesFrom_12= ruleDataSomeValuesFrom | this_DataAllValuesFrom_13= ruleDataAllValuesFrom | this_DataHasValue_14= ruleDataHasValue | this_DataMinCardinality_15= ruleDataMinCardinality | this_DataMaxCardinality_16= ruleDataMaxCardinality | this_DataExactCardinality_17= ruleDataExactCardinality )
            int alt16=18;
            switch ( input.LA(1) ) {
            case RULE_FULL_IRI:
            case RULE_PN_PREFIX:
            case RULE_PN_LOCAL:
                {
                alt16=1;
                }
                break;
            case 39:
                {
                alt16=2;
                }
                break;
            case 40:
                {
                alt16=3;
                }
                break;
            case 41:
                {
                alt16=4;
                }
                break;
            case 42:
                {
                alt16=5;
                }
                break;
            case 43:
                {
                alt16=6;
                }
                break;
            case 44:
                {
                alt16=7;
                }
                break;
            case 45:
                {
                alt16=8;
                }
                break;
            case 46:
                {
                alt16=9;
                }
                break;
            case 47:
                {
                alt16=10;
                }
                break;
            case 48:
                {
                alt16=11;
                }
                break;
            case 49:
                {
                alt16=12;
                }
                break;
            case 50:
                {
                alt16=13;
                }
                break;
            case 51:
                {
                alt16=14;
                }
                break;
            case 52:
                {
                alt16=15;
                }
                break;
            case 53:
                {
                alt16=16;
                }
                break;
            case 54:
                {
                alt16=17;
                }
                break;
            case 55:
                {
                alt16=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalOwl.g:1651:3: this_ClassReference_0= ruleClassReference
                    {

                    			newCompositeNode(grammarAccess.getClassExpressionAccess().getClassReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassReference_0=ruleClassReference();

                    state._fsp--;


                    			current = this_ClassReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOwl.g:1660:3: this_ObjectIntersectionOf_1= ruleObjectIntersectionOf
                    {

                    			newCompositeNode(grammarAccess.getClassExpressionAccess().getObjectIntersectionOfParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectIntersectionOf_1=ruleObjectIntersectionOf();

                    state._fsp--;


                    			current = this_ObjectIntersectionOf_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOwl.g:1669:3: this_ObjectUnionOf_2= ruleObjectUnionOf
                    {

                    			newCompositeNode(grammarAccess.getClassExpressionAccess().getObjectUnionOfParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectUnionOf_2=ruleObjectUnionOf();

                    state._fsp--;


                    			current = this_ObjectUnionOf_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOwl.g:1678:3: this_ObjectComplementOf_3= ruleObjectComplementOf
                    {

                    			newCompositeNode(grammarAccess.getClassExpressionAccess().getObjectComplementOfParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectComplementOf_3=ruleObjectComplementOf();

                    state._fsp--;


                    			current = this_ObjectComplementOf_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOwl.g:1687:3: this_ObjectOneOf_4= ruleObjectOneOf
                    {

                    			newCompositeNode(grammarAccess.getClassExpressionAccess().getObjectOneOfParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectOneOf_4=ruleObjectOneOf();

                    state._fsp--;


                    			current = this_ObjectOneOf_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOwl.g:1696:3: this_ObjectSomeValuesFrom_5= ruleObjectSomeValuesFrom
                    {

                    			newCompositeNode(grammarAccess.getClassExpressionAccess().getObjectSomeValuesFromParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectSomeValuesFrom_5=ruleObjectSomeValuesFrom();

                    state._fsp--;


                    			current = this_ObjectSomeValuesFrom_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalOwl.g:1705:3: this_ObjectAllValuesFrom_6= ruleObjectAllValuesFrom
                    {

                    			newCompositeNode(grammarAccess.getClassExpressionAccess().getObjectAllValuesFromParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectAllValuesFrom_6=ruleObjectAllValuesFrom();

                    state._fsp--;


                    			current = this_ObjectAllValuesFrom_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalOwl.g:1714:3: this_ObjectHasValue_7= ruleObjectHasValue
                    {

                    			newCompositeNode(grammarAccess.getClassExpressionAccess().getObjectHasValueParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectHasValue_7=ruleObjectHasValue();

                    state._fsp--;


                    			current = this_ObjectHasValue_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalOwl.g:1723:3: this_ObjectHasSelf_8= ruleObjectHasSelf
                    {

                    			newCompositeNode(grammarAccess.getClassExpressionAccess().getObjectHasSelfParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectHasSelf_8=ruleObjectHasSelf();

                    state._fsp--;


                    			current = this_ObjectHasSelf_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalOwl.g:1732:3: this_ObjectMinCardinality_9= ruleObjectMinCardinality
                    {

                    			newCompositeNode(grammarAccess.getClassExpressionAccess().getObjectMinCardinalityParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectMinCardinality_9=ruleObjectMinCardinality();

                    state._fsp--;


                    			current = this_ObjectMinCardinality_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalOwl.g:1741:3: this_ObjectMaxCardinality_10= ruleObjectMaxCardinality
                    {

                    			newCompositeNode(grammarAccess.getClassExpressionAccess().getObjectMaxCardinalityParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectMaxCardinality_10=ruleObjectMaxCardinality();

                    state._fsp--;


                    			current = this_ObjectMaxCardinality_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalOwl.g:1750:3: this_ObjectExactCardinality_11= ruleObjectExactCardinality
                    {

                    			newCompositeNode(grammarAccess.getClassExpressionAccess().getObjectExactCardinalityParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectExactCardinality_11=ruleObjectExactCardinality();

                    state._fsp--;


                    			current = this_ObjectExactCardinality_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalOwl.g:1759:3: this_DataSomeValuesFrom_12= ruleDataSomeValuesFrom
                    {

                    			newCompositeNode(grammarAccess.getClassExpressionAccess().getDataSomeValuesFromParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataSomeValuesFrom_12=ruleDataSomeValuesFrom();

                    state._fsp--;


                    			current = this_DataSomeValuesFrom_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalOwl.g:1768:3: this_DataAllValuesFrom_13= ruleDataAllValuesFrom
                    {

                    			newCompositeNode(grammarAccess.getClassExpressionAccess().getDataAllValuesFromParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataAllValuesFrom_13=ruleDataAllValuesFrom();

                    state._fsp--;


                    			current = this_DataAllValuesFrom_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalOwl.g:1777:3: this_DataHasValue_14= ruleDataHasValue
                    {

                    			newCompositeNode(grammarAccess.getClassExpressionAccess().getDataHasValueParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataHasValue_14=ruleDataHasValue();

                    state._fsp--;


                    			current = this_DataHasValue_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalOwl.g:1786:3: this_DataMinCardinality_15= ruleDataMinCardinality
                    {

                    			newCompositeNode(grammarAccess.getClassExpressionAccess().getDataMinCardinalityParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataMinCardinality_15=ruleDataMinCardinality();

                    state._fsp--;


                    			current = this_DataMinCardinality_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalOwl.g:1795:3: this_DataMaxCardinality_16= ruleDataMaxCardinality
                    {

                    			newCompositeNode(grammarAccess.getClassExpressionAccess().getDataMaxCardinalityParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataMaxCardinality_16=ruleDataMaxCardinality();

                    state._fsp--;


                    			current = this_DataMaxCardinality_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalOwl.g:1804:3: this_DataExactCardinality_17= ruleDataExactCardinality
                    {

                    			newCompositeNode(grammarAccess.getClassExpressionAccess().getDataExactCardinalityParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataExactCardinality_17=ruleDataExactCardinality();

                    state._fsp--;


                    			current = this_DataExactCardinality_17;
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
    // $ANTLR end "ruleClassExpression"


    // $ANTLR start "entryRuleClassReference"
    // InternalOwl.g:1816:1: entryRuleClassReference returns [EObject current=null] : iv_ruleClassReference= ruleClassReference EOF ;
    public final EObject entryRuleClassReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassReference = null;


        try {
            // InternalOwl.g:1816:55: (iv_ruleClassReference= ruleClassReference EOF )
            // InternalOwl.g:1817:2: iv_ruleClassReference= ruleClassReference EOF
            {
             newCompositeNode(grammarAccess.getClassReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassReference=ruleClassReference();

            state._fsp--;

             current =iv_ruleClassReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassReference"


    // $ANTLR start "ruleClassReference"
    // InternalOwl.g:1823:1: ruleClassReference returns [EObject current=null] : ( (lv_class_0_0= ruleIRI ) ) ;
    public final EObject ruleClassReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_class_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1829:2: ( ( (lv_class_0_0= ruleIRI ) ) )
            // InternalOwl.g:1830:2: ( (lv_class_0_0= ruleIRI ) )
            {
            // InternalOwl.g:1830:2: ( (lv_class_0_0= ruleIRI ) )
            // InternalOwl.g:1831:3: (lv_class_0_0= ruleIRI )
            {
            // InternalOwl.g:1831:3: (lv_class_0_0= ruleIRI )
            // InternalOwl.g:1832:4: lv_class_0_0= ruleIRI
            {

            				newCompositeNode(grammarAccess.getClassReferenceAccess().getClassIRIParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_class_0_0=ruleIRI();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getClassReferenceRule());
            				}
            				set(
            					current,
            					"class",
            					lv_class_0_0,
            					"org.omg.sysml.owl.Owl.IRI");
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
    // $ANTLR end "ruleClassReference"


    // $ANTLR start "entryRuleObjectIntersectionOf"
    // InternalOwl.g:1852:1: entryRuleObjectIntersectionOf returns [EObject current=null] : iv_ruleObjectIntersectionOf= ruleObjectIntersectionOf EOF ;
    public final EObject entryRuleObjectIntersectionOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectIntersectionOf = null;


        try {
            // InternalOwl.g:1852:61: (iv_ruleObjectIntersectionOf= ruleObjectIntersectionOf EOF )
            // InternalOwl.g:1853:2: iv_ruleObjectIntersectionOf= ruleObjectIntersectionOf EOF
            {
             newCompositeNode(grammarAccess.getObjectIntersectionOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectIntersectionOf=ruleObjectIntersectionOf();

            state._fsp--;

             current =iv_ruleObjectIntersectionOf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectIntersectionOf"


    // $ANTLR start "ruleObjectIntersectionOf"
    // InternalOwl.g:1859:1: ruleObjectIntersectionOf returns [EObject current=null] : (otherlv_0= 'ObjectIntersectionOf' otherlv_1= '(' ( (lv_classExpressions_2_0= ruleClassExpression ) )+ otherlv_3= ')' ) ;
    public final EObject ruleObjectIntersectionOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_classExpressions_2_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1865:2: ( (otherlv_0= 'ObjectIntersectionOf' otherlv_1= '(' ( (lv_classExpressions_2_0= ruleClassExpression ) )+ otherlv_3= ')' ) )
            // InternalOwl.g:1866:2: (otherlv_0= 'ObjectIntersectionOf' otherlv_1= '(' ( (lv_classExpressions_2_0= ruleClassExpression ) )+ otherlv_3= ')' )
            {
            // InternalOwl.g:1866:2: (otherlv_0= 'ObjectIntersectionOf' otherlv_1= '(' ( (lv_classExpressions_2_0= ruleClassExpression ) )+ otherlv_3= ')' )
            // InternalOwl.g:1867:3: otherlv_0= 'ObjectIntersectionOf' otherlv_1= '(' ( (lv_classExpressions_2_0= ruleClassExpression ) )+ otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectIntersectionOfAccess().getObjectIntersectionOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectIntersectionOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:1875:3: ( (lv_classExpressions_2_0= ruleClassExpression ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_FULL_IRI && LA17_0<=RULE_PN_LOCAL)||(LA17_0>=39 && LA17_0<=55)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOwl.g:1876:4: (lv_classExpressions_2_0= ruleClassExpression )
            	    {
            	    // InternalOwl.g:1876:4: (lv_classExpressions_2_0= ruleClassExpression )
            	    // InternalOwl.g:1877:5: lv_classExpressions_2_0= ruleClassExpression
            	    {

            	    					newCompositeNode(grammarAccess.getObjectIntersectionOfAccess().getClassExpressionsClassExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_classExpressions_2_0=ruleClassExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectIntersectionOfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classExpressions",
            	    						lv_classExpressions_2_0,
            	    						"org.omg.sysml.owl.Owl.ClassExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectIntersectionOfAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectIntersectionOf"


    // $ANTLR start "entryRuleObjectUnionOf"
    // InternalOwl.g:1902:1: entryRuleObjectUnionOf returns [EObject current=null] : iv_ruleObjectUnionOf= ruleObjectUnionOf EOF ;
    public final EObject entryRuleObjectUnionOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectUnionOf = null;


        try {
            // InternalOwl.g:1902:54: (iv_ruleObjectUnionOf= ruleObjectUnionOf EOF )
            // InternalOwl.g:1903:2: iv_ruleObjectUnionOf= ruleObjectUnionOf EOF
            {
             newCompositeNode(grammarAccess.getObjectUnionOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectUnionOf=ruleObjectUnionOf();

            state._fsp--;

             current =iv_ruleObjectUnionOf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectUnionOf"


    // $ANTLR start "ruleObjectUnionOf"
    // InternalOwl.g:1909:1: ruleObjectUnionOf returns [EObject current=null] : (otherlv_0= 'ObjectUnionOf' otherlv_1= '(' ( (lv_classExpressions_2_0= ruleClassExpression ) )+ otherlv_3= ')' ) ;
    public final EObject ruleObjectUnionOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_classExpressions_2_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1915:2: ( (otherlv_0= 'ObjectUnionOf' otherlv_1= '(' ( (lv_classExpressions_2_0= ruleClassExpression ) )+ otherlv_3= ')' ) )
            // InternalOwl.g:1916:2: (otherlv_0= 'ObjectUnionOf' otherlv_1= '(' ( (lv_classExpressions_2_0= ruleClassExpression ) )+ otherlv_3= ')' )
            {
            // InternalOwl.g:1916:2: (otherlv_0= 'ObjectUnionOf' otherlv_1= '(' ( (lv_classExpressions_2_0= ruleClassExpression ) )+ otherlv_3= ')' )
            // InternalOwl.g:1917:3: otherlv_0= 'ObjectUnionOf' otherlv_1= '(' ( (lv_classExpressions_2_0= ruleClassExpression ) )+ otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectUnionOfAccess().getObjectUnionOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectUnionOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:1925:3: ( (lv_classExpressions_2_0= ruleClassExpression ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_FULL_IRI && LA18_0<=RULE_PN_LOCAL)||(LA18_0>=39 && LA18_0<=55)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalOwl.g:1926:4: (lv_classExpressions_2_0= ruleClassExpression )
            	    {
            	    // InternalOwl.g:1926:4: (lv_classExpressions_2_0= ruleClassExpression )
            	    // InternalOwl.g:1927:5: lv_classExpressions_2_0= ruleClassExpression
            	    {

            	    					newCompositeNode(grammarAccess.getObjectUnionOfAccess().getClassExpressionsClassExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_classExpressions_2_0=ruleClassExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectUnionOfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classExpressions",
            	    						lv_classExpressions_2_0,
            	    						"org.omg.sysml.owl.Owl.ClassExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectUnionOfAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectUnionOf"


    // $ANTLR start "entryRuleObjectComplementOf"
    // InternalOwl.g:1952:1: entryRuleObjectComplementOf returns [EObject current=null] : iv_ruleObjectComplementOf= ruleObjectComplementOf EOF ;
    public final EObject entryRuleObjectComplementOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectComplementOf = null;


        try {
            // InternalOwl.g:1952:59: (iv_ruleObjectComplementOf= ruleObjectComplementOf EOF )
            // InternalOwl.g:1953:2: iv_ruleObjectComplementOf= ruleObjectComplementOf EOF
            {
             newCompositeNode(grammarAccess.getObjectComplementOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectComplementOf=ruleObjectComplementOf();

            state._fsp--;

             current =iv_ruleObjectComplementOf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectComplementOf"


    // $ANTLR start "ruleObjectComplementOf"
    // InternalOwl.g:1959:1: ruleObjectComplementOf returns [EObject current=null] : (otherlv_0= 'ObjectComplementOf' otherlv_1= '(' ( (lv_classExpression_2_0= ruleClassExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleObjectComplementOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_classExpression_2_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1965:2: ( (otherlv_0= 'ObjectComplementOf' otherlv_1= '(' ( (lv_classExpression_2_0= ruleClassExpression ) ) otherlv_3= ')' ) )
            // InternalOwl.g:1966:2: (otherlv_0= 'ObjectComplementOf' otherlv_1= '(' ( (lv_classExpression_2_0= ruleClassExpression ) ) otherlv_3= ')' )
            {
            // InternalOwl.g:1966:2: (otherlv_0= 'ObjectComplementOf' otherlv_1= '(' ( (lv_classExpression_2_0= ruleClassExpression ) ) otherlv_3= ')' )
            // InternalOwl.g:1967:3: otherlv_0= 'ObjectComplementOf' otherlv_1= '(' ( (lv_classExpression_2_0= ruleClassExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectComplementOfAccess().getObjectComplementOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectComplementOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:1975:3: ( (lv_classExpression_2_0= ruleClassExpression ) )
            // InternalOwl.g:1976:4: (lv_classExpression_2_0= ruleClassExpression )
            {
            // InternalOwl.g:1976:4: (lv_classExpression_2_0= ruleClassExpression )
            // InternalOwl.g:1977:5: lv_classExpression_2_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getObjectComplementOfAccess().getClassExpressionClassExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_classExpression_2_0=ruleClassExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectComplementOfRule());
            					}
            					set(
            						current,
            						"classExpression",
            						lv_classExpression_2_0,
            						"org.omg.sysml.owl.Owl.ClassExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectComplementOfAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectComplementOf"


    // $ANTLR start "entryRuleObjectOneOf"
    // InternalOwl.g:2002:1: entryRuleObjectOneOf returns [EObject current=null] : iv_ruleObjectOneOf= ruleObjectOneOf EOF ;
    public final EObject entryRuleObjectOneOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectOneOf = null;


        try {
            // InternalOwl.g:2002:52: (iv_ruleObjectOneOf= ruleObjectOneOf EOF )
            // InternalOwl.g:2003:2: iv_ruleObjectOneOf= ruleObjectOneOf EOF
            {
             newCompositeNode(grammarAccess.getObjectOneOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectOneOf=ruleObjectOneOf();

            state._fsp--;

             current =iv_ruleObjectOneOf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectOneOf"


    // $ANTLR start "ruleObjectOneOf"
    // InternalOwl.g:2009:1: ruleObjectOneOf returns [EObject current=null] : (otherlv_0= 'ObjectOneOf' otherlv_1= '(' ( (lv_individuals_2_0= ruleIndividualReference ) )+ otherlv_3= ')' ) ;
    public final EObject ruleObjectOneOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_individuals_2_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2015:2: ( (otherlv_0= 'ObjectOneOf' otherlv_1= '(' ( (lv_individuals_2_0= ruleIndividualReference ) )+ otherlv_3= ')' ) )
            // InternalOwl.g:2016:2: (otherlv_0= 'ObjectOneOf' otherlv_1= '(' ( (lv_individuals_2_0= ruleIndividualReference ) )+ otherlv_3= ')' )
            {
            // InternalOwl.g:2016:2: (otherlv_0= 'ObjectOneOf' otherlv_1= '(' ( (lv_individuals_2_0= ruleIndividualReference ) )+ otherlv_3= ')' )
            // InternalOwl.g:2017:3: otherlv_0= 'ObjectOneOf' otherlv_1= '(' ( (lv_individuals_2_0= ruleIndividualReference ) )+ otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectOneOfAccess().getObjectOneOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectOneOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2025:3: ( (lv_individuals_2_0= ruleIndividualReference ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_FULL_IRI && LA19_0<=RULE_BLANK_NODE_LABEL)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalOwl.g:2026:4: (lv_individuals_2_0= ruleIndividualReference )
            	    {
            	    // InternalOwl.g:2026:4: (lv_individuals_2_0= ruleIndividualReference )
            	    // InternalOwl.g:2027:5: lv_individuals_2_0= ruleIndividualReference
            	    {

            	    					newCompositeNode(grammarAccess.getObjectOneOfAccess().getIndividualsIndividualReferenceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_individuals_2_0=ruleIndividualReference();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectOneOfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"individuals",
            	    						lv_individuals_2_0,
            	    						"org.omg.sysml.owl.Owl.IndividualReference");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectOneOfAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectOneOf"


    // $ANTLR start "entryRuleIndividualReference"
    // InternalOwl.g:2052:1: entryRuleIndividualReference returns [EObject current=null] : iv_ruleIndividualReference= ruleIndividualReference EOF ;
    public final EObject entryRuleIndividualReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndividualReference = null;


        try {
            // InternalOwl.g:2052:60: (iv_ruleIndividualReference= ruleIndividualReference EOF )
            // InternalOwl.g:2053:2: iv_ruleIndividualReference= ruleIndividualReference EOF
            {
             newCompositeNode(grammarAccess.getIndividualReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndividualReference=ruleIndividualReference();

            state._fsp--;

             current =iv_ruleIndividualReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndividualReference"


    // $ANTLR start "ruleIndividualReference"
    // InternalOwl.g:2059:1: ruleIndividualReference returns [EObject current=null] : (this_NamedIndividualReference_0= ruleNamedIndividualReference | this_AnonymousIndividualReference_1= ruleAnonymousIndividualReference ) ;
    public final EObject ruleIndividualReference() throws RecognitionException {
        EObject current = null;

        EObject this_NamedIndividualReference_0 = null;

        EObject this_AnonymousIndividualReference_1 = null;



        	enterRule();

        try {
            // InternalOwl.g:2065:2: ( (this_NamedIndividualReference_0= ruleNamedIndividualReference | this_AnonymousIndividualReference_1= ruleAnonymousIndividualReference ) )
            // InternalOwl.g:2066:2: (this_NamedIndividualReference_0= ruleNamedIndividualReference | this_AnonymousIndividualReference_1= ruleAnonymousIndividualReference )
            {
            // InternalOwl.g:2066:2: (this_NamedIndividualReference_0= ruleNamedIndividualReference | this_AnonymousIndividualReference_1= ruleAnonymousIndividualReference )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_FULL_IRI && LA20_0<=RULE_PN_LOCAL)) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_BLANK_NODE_LABEL) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalOwl.g:2067:3: this_NamedIndividualReference_0= ruleNamedIndividualReference
                    {

                    			newCompositeNode(grammarAccess.getIndividualReferenceAccess().getNamedIndividualReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamedIndividualReference_0=ruleNamedIndividualReference();

                    state._fsp--;


                    			current = this_NamedIndividualReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOwl.g:2076:3: this_AnonymousIndividualReference_1= ruleAnonymousIndividualReference
                    {

                    			newCompositeNode(grammarAccess.getIndividualReferenceAccess().getAnonymousIndividualReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnonymousIndividualReference_1=ruleAnonymousIndividualReference();

                    state._fsp--;


                    			current = this_AnonymousIndividualReference_1;
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
    // $ANTLR end "ruleIndividualReference"


    // $ANTLR start "entryRuleNamedIndividualReference"
    // InternalOwl.g:2088:1: entryRuleNamedIndividualReference returns [EObject current=null] : iv_ruleNamedIndividualReference= ruleNamedIndividualReference EOF ;
    public final EObject entryRuleNamedIndividualReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedIndividualReference = null;


        try {
            // InternalOwl.g:2088:65: (iv_ruleNamedIndividualReference= ruleNamedIndividualReference EOF )
            // InternalOwl.g:2089:2: iv_ruleNamedIndividualReference= ruleNamedIndividualReference EOF
            {
             newCompositeNode(grammarAccess.getNamedIndividualReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedIndividualReference=ruleNamedIndividualReference();

            state._fsp--;

             current =iv_ruleNamedIndividualReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedIndividualReference"


    // $ANTLR start "ruleNamedIndividualReference"
    // InternalOwl.g:2095:1: ruleNamedIndividualReference returns [EObject current=null] : ( (lv_individual_0_0= ruleIRI ) ) ;
    public final EObject ruleNamedIndividualReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_individual_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2101:2: ( ( (lv_individual_0_0= ruleIRI ) ) )
            // InternalOwl.g:2102:2: ( (lv_individual_0_0= ruleIRI ) )
            {
            // InternalOwl.g:2102:2: ( (lv_individual_0_0= ruleIRI ) )
            // InternalOwl.g:2103:3: (lv_individual_0_0= ruleIRI )
            {
            // InternalOwl.g:2103:3: (lv_individual_0_0= ruleIRI )
            // InternalOwl.g:2104:4: lv_individual_0_0= ruleIRI
            {

            				newCompositeNode(grammarAccess.getNamedIndividualReferenceAccess().getIndividualIRIParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_individual_0_0=ruleIRI();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNamedIndividualReferenceRule());
            				}
            				set(
            					current,
            					"individual",
            					lv_individual_0_0,
            					"org.omg.sysml.owl.Owl.IRI");
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
    // $ANTLR end "ruleNamedIndividualReference"


    // $ANTLR start "entryRuleAnonymousIndividualReference"
    // InternalOwl.g:2124:1: entryRuleAnonymousIndividualReference returns [EObject current=null] : iv_ruleAnonymousIndividualReference= ruleAnonymousIndividualReference EOF ;
    public final EObject entryRuleAnonymousIndividualReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousIndividualReference = null;


        try {
            // InternalOwl.g:2124:69: (iv_ruleAnonymousIndividualReference= ruleAnonymousIndividualReference EOF )
            // InternalOwl.g:2125:2: iv_ruleAnonymousIndividualReference= ruleAnonymousIndividualReference EOF
            {
             newCompositeNode(grammarAccess.getAnonymousIndividualReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnonymousIndividualReference=ruleAnonymousIndividualReference();

            state._fsp--;

             current =iv_ruleAnonymousIndividualReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnonymousIndividualReference"


    // $ANTLR start "ruleAnonymousIndividualReference"
    // InternalOwl.g:2131:1: ruleAnonymousIndividualReference returns [EObject current=null] : ( (lv_individual_0_0= ruleNodeID ) ) ;
    public final EObject ruleAnonymousIndividualReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_individual_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2137:2: ( ( (lv_individual_0_0= ruleNodeID ) ) )
            // InternalOwl.g:2138:2: ( (lv_individual_0_0= ruleNodeID ) )
            {
            // InternalOwl.g:2138:2: ( (lv_individual_0_0= ruleNodeID ) )
            // InternalOwl.g:2139:3: (lv_individual_0_0= ruleNodeID )
            {
            // InternalOwl.g:2139:3: (lv_individual_0_0= ruleNodeID )
            // InternalOwl.g:2140:4: lv_individual_0_0= ruleNodeID
            {

            				newCompositeNode(grammarAccess.getAnonymousIndividualReferenceAccess().getIndividualNodeIDParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_individual_0_0=ruleNodeID();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAnonymousIndividualReferenceRule());
            				}
            				set(
            					current,
            					"individual",
            					lv_individual_0_0,
            					"org.omg.sysml.owl.Owl.NodeID");
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
    // $ANTLR end "ruleAnonymousIndividualReference"


    // $ANTLR start "entryRuleObjectSomeValuesFrom"
    // InternalOwl.g:2160:1: entryRuleObjectSomeValuesFrom returns [EObject current=null] : iv_ruleObjectSomeValuesFrom= ruleObjectSomeValuesFrom EOF ;
    public final EObject entryRuleObjectSomeValuesFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectSomeValuesFrom = null;


        try {
            // InternalOwl.g:2160:61: (iv_ruleObjectSomeValuesFrom= ruleObjectSomeValuesFrom EOF )
            // InternalOwl.g:2161:2: iv_ruleObjectSomeValuesFrom= ruleObjectSomeValuesFrom EOF
            {
             newCompositeNode(grammarAccess.getObjectSomeValuesFromRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectSomeValuesFrom=ruleObjectSomeValuesFrom();

            state._fsp--;

             current =iv_ruleObjectSomeValuesFrom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectSomeValuesFrom"


    // $ANTLR start "ruleObjectSomeValuesFrom"
    // InternalOwl.g:2167:1: ruleObjectSomeValuesFrom returns [EObject current=null] : (otherlv_0= 'ObjectSomeValuesFrom' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleObjectSomeValuesFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_objectPropertyExpression_2_0 = null;

        EObject lv_classExpression_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2173:2: ( (otherlv_0= 'ObjectSomeValuesFrom' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= ')' ) )
            // InternalOwl.g:2174:2: (otherlv_0= 'ObjectSomeValuesFrom' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:2174:2: (otherlv_0= 'ObjectSomeValuesFrom' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= ')' )
            // InternalOwl.g:2175:3: otherlv_0= 'ObjectSomeValuesFrom' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectSomeValuesFromAccess().getObjectSomeValuesFromKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectSomeValuesFromAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2183:3: ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:2184:4: (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:2184:4: (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression )
            // InternalOwl.g:2185:5: lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getObjectSomeValuesFromAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_objectPropertyExpression_2_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectSomeValuesFromRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression",
            						lv_objectPropertyExpression_2_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:2202:3: ( (lv_classExpression_3_0= ruleClassExpression ) )
            // InternalOwl.g:2203:4: (lv_classExpression_3_0= ruleClassExpression )
            {
            // InternalOwl.g:2203:4: (lv_classExpression_3_0= ruleClassExpression )
            // InternalOwl.g:2204:5: lv_classExpression_3_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getObjectSomeValuesFromAccess().getClassExpressionClassExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_classExpression_3_0=ruleClassExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectSomeValuesFromRule());
            					}
            					set(
            						current,
            						"classExpression",
            						lv_classExpression_3_0,
            						"org.omg.sysml.owl.Owl.ClassExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getObjectSomeValuesFromAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectSomeValuesFrom"


    // $ANTLR start "entryRuleObjectAllValuesFrom"
    // InternalOwl.g:2229:1: entryRuleObjectAllValuesFrom returns [EObject current=null] : iv_ruleObjectAllValuesFrom= ruleObjectAllValuesFrom EOF ;
    public final EObject entryRuleObjectAllValuesFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectAllValuesFrom = null;


        try {
            // InternalOwl.g:2229:60: (iv_ruleObjectAllValuesFrom= ruleObjectAllValuesFrom EOF )
            // InternalOwl.g:2230:2: iv_ruleObjectAllValuesFrom= ruleObjectAllValuesFrom EOF
            {
             newCompositeNode(grammarAccess.getObjectAllValuesFromRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectAllValuesFrom=ruleObjectAllValuesFrom();

            state._fsp--;

             current =iv_ruleObjectAllValuesFrom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectAllValuesFrom"


    // $ANTLR start "ruleObjectAllValuesFrom"
    // InternalOwl.g:2236:1: ruleObjectAllValuesFrom returns [EObject current=null] : (otherlv_0= 'ObjectAllValuesFrom' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleObjectAllValuesFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_objectPropertyExpression_2_0 = null;

        EObject lv_classExpression_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2242:2: ( (otherlv_0= 'ObjectAllValuesFrom' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= ')' ) )
            // InternalOwl.g:2243:2: (otherlv_0= 'ObjectAllValuesFrom' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:2243:2: (otherlv_0= 'ObjectAllValuesFrom' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= ')' )
            // InternalOwl.g:2244:3: otherlv_0= 'ObjectAllValuesFrom' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectAllValuesFromAccess().getObjectAllValuesFromKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAllValuesFromAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2252:3: ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:2253:4: (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:2253:4: (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression )
            // InternalOwl.g:2254:5: lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getObjectAllValuesFromAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_objectPropertyExpression_2_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectAllValuesFromRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression",
            						lv_objectPropertyExpression_2_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:2271:3: ( (lv_classExpression_3_0= ruleClassExpression ) )
            // InternalOwl.g:2272:4: (lv_classExpression_3_0= ruleClassExpression )
            {
            // InternalOwl.g:2272:4: (lv_classExpression_3_0= ruleClassExpression )
            // InternalOwl.g:2273:5: lv_classExpression_3_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getObjectAllValuesFromAccess().getClassExpressionClassExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_classExpression_3_0=ruleClassExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectAllValuesFromRule());
            					}
            					set(
            						current,
            						"classExpression",
            						lv_classExpression_3_0,
            						"org.omg.sysml.owl.Owl.ClassExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getObjectAllValuesFromAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectAllValuesFrom"


    // $ANTLR start "entryRuleObjectHasValue"
    // InternalOwl.g:2298:1: entryRuleObjectHasValue returns [EObject current=null] : iv_ruleObjectHasValue= ruleObjectHasValue EOF ;
    public final EObject entryRuleObjectHasValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectHasValue = null;


        try {
            // InternalOwl.g:2298:55: (iv_ruleObjectHasValue= ruleObjectHasValue EOF )
            // InternalOwl.g:2299:2: iv_ruleObjectHasValue= ruleObjectHasValue EOF
            {
             newCompositeNode(grammarAccess.getObjectHasValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectHasValue=ruleObjectHasValue();

            state._fsp--;

             current =iv_ruleObjectHasValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectHasValue"


    // $ANTLR start "ruleObjectHasValue"
    // InternalOwl.g:2305:1: ruleObjectHasValue returns [EObject current=null] : (otherlv_0= 'ObjectHasValue' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_individual_3_0= ruleIndividualReference ) ) otherlv_4= ')' ) ;
    public final EObject ruleObjectHasValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_objectPropertyExpression_2_0 = null;

        EObject lv_individual_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2311:2: ( (otherlv_0= 'ObjectHasValue' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_individual_3_0= ruleIndividualReference ) ) otherlv_4= ')' ) )
            // InternalOwl.g:2312:2: (otherlv_0= 'ObjectHasValue' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_individual_3_0= ruleIndividualReference ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:2312:2: (otherlv_0= 'ObjectHasValue' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_individual_3_0= ruleIndividualReference ) ) otherlv_4= ')' )
            // InternalOwl.g:2313:3: otherlv_0= 'ObjectHasValue' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_individual_3_0= ruleIndividualReference ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectHasValueAccess().getObjectHasValueKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectHasValueAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2321:3: ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:2322:4: (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:2322:4: (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression )
            // InternalOwl.g:2323:5: lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getObjectHasValueAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_objectPropertyExpression_2_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectHasValueRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression",
            						lv_objectPropertyExpression_2_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:2340:3: ( (lv_individual_3_0= ruleIndividualReference ) )
            // InternalOwl.g:2341:4: (lv_individual_3_0= ruleIndividualReference )
            {
            // InternalOwl.g:2341:4: (lv_individual_3_0= ruleIndividualReference )
            // InternalOwl.g:2342:5: lv_individual_3_0= ruleIndividualReference
            {

            					newCompositeNode(grammarAccess.getObjectHasValueAccess().getIndividualIndividualReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_individual_3_0=ruleIndividualReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectHasValueRule());
            					}
            					set(
            						current,
            						"individual",
            						lv_individual_3_0,
            						"org.omg.sysml.owl.Owl.IndividualReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getObjectHasValueAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectHasValue"


    // $ANTLR start "entryRuleObjectHasSelf"
    // InternalOwl.g:2367:1: entryRuleObjectHasSelf returns [EObject current=null] : iv_ruleObjectHasSelf= ruleObjectHasSelf EOF ;
    public final EObject entryRuleObjectHasSelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectHasSelf = null;


        try {
            // InternalOwl.g:2367:54: (iv_ruleObjectHasSelf= ruleObjectHasSelf EOF )
            // InternalOwl.g:2368:2: iv_ruleObjectHasSelf= ruleObjectHasSelf EOF
            {
             newCompositeNode(grammarAccess.getObjectHasSelfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectHasSelf=ruleObjectHasSelf();

            state._fsp--;

             current =iv_ruleObjectHasSelf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectHasSelf"


    // $ANTLR start "ruleObjectHasSelf"
    // InternalOwl.g:2374:1: ruleObjectHasSelf returns [EObject current=null] : (otherlv_0= 'ObjectHasSelf' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleObjectHasSelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_objectPropertyExpression_2_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2380:2: ( (otherlv_0= 'ObjectHasSelf' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) otherlv_3= ')' ) )
            // InternalOwl.g:2381:2: (otherlv_0= 'ObjectHasSelf' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) otherlv_3= ')' )
            {
            // InternalOwl.g:2381:2: (otherlv_0= 'ObjectHasSelf' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) otherlv_3= ')' )
            // InternalOwl.g:2382:3: otherlv_0= 'ObjectHasSelf' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectHasSelfAccess().getObjectHasSelfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectHasSelfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2390:3: ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:2391:4: (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:2391:4: (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression )
            // InternalOwl.g:2392:5: lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getObjectHasSelfAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_objectPropertyExpression_2_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectHasSelfRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression",
            						lv_objectPropertyExpression_2_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectHasSelfAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectHasSelf"


    // $ANTLR start "entryRuleObjectMinCardinality"
    // InternalOwl.g:2417:1: entryRuleObjectMinCardinality returns [EObject current=null] : iv_ruleObjectMinCardinality= ruleObjectMinCardinality EOF ;
    public final EObject entryRuleObjectMinCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectMinCardinality = null;


        try {
            // InternalOwl.g:2417:61: (iv_ruleObjectMinCardinality= ruleObjectMinCardinality EOF )
            // InternalOwl.g:2418:2: iv_ruleObjectMinCardinality= ruleObjectMinCardinality EOF
            {
             newCompositeNode(grammarAccess.getObjectMinCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectMinCardinality=ruleObjectMinCardinality();

            state._fsp--;

             current =iv_ruleObjectMinCardinality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectMinCardinality"


    // $ANTLR start "ruleObjectMinCardinality"
    // InternalOwl.g:2424:1: ruleObjectMinCardinality returns [EObject current=null] : (otherlv_0= 'ObjectMinCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' ) ;
    public final EObject ruleObjectMinCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_cardinality_2_0=null;
        Token otherlv_5=null;
        EObject lv_objectPropertyExpression_3_0 = null;

        EObject lv_classExpression_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2430:2: ( (otherlv_0= 'ObjectMinCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' ) )
            // InternalOwl.g:2431:2: (otherlv_0= 'ObjectMinCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' )
            {
            // InternalOwl.g:2431:2: (otherlv_0= 'ObjectMinCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' )
            // InternalOwl.g:2432:3: otherlv_0= 'ObjectMinCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectMinCardinalityAccess().getObjectMinCardinalityKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectMinCardinalityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2440:3: ( (lv_cardinality_2_0= RULE_INT ) )
            // InternalOwl.g:2441:4: (lv_cardinality_2_0= RULE_INT )
            {
            // InternalOwl.g:2441:4: (lv_cardinality_2_0= RULE_INT )
            // InternalOwl.g:2442:5: lv_cardinality_2_0= RULE_INT
            {
            lv_cardinality_2_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_cardinality_2_0, grammarAccess.getObjectMinCardinalityAccess().getCardinalityINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectMinCardinalityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cardinality",
            						lv_cardinality_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalOwl.g:2458:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:2459:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:2459:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:2460:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getObjectMinCardinalityAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_objectPropertyExpression_3_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectMinCardinalityRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression",
            						lv_objectPropertyExpression_3_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:2477:3: ( (lv_classExpression_4_0= ruleClassExpression ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_FULL_IRI && LA21_0<=RULE_PN_LOCAL)||(LA21_0>=39 && LA21_0<=55)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOwl.g:2478:4: (lv_classExpression_4_0= ruleClassExpression )
                    {
                    // InternalOwl.g:2478:4: (lv_classExpression_4_0= ruleClassExpression )
                    // InternalOwl.g:2479:5: lv_classExpression_4_0= ruleClassExpression
                    {

                    					newCompositeNode(grammarAccess.getObjectMinCardinalityAccess().getClassExpressionClassExpressionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_classExpression_4_0=ruleClassExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObjectMinCardinalityRule());
                    					}
                    					set(
                    						current,
                    						"classExpression",
                    						lv_classExpression_4_0,
                    						"org.omg.sysml.owl.Owl.ClassExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getObjectMinCardinalityAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectMinCardinality"


    // $ANTLR start "entryRuleObjectMaxCardinality"
    // InternalOwl.g:2504:1: entryRuleObjectMaxCardinality returns [EObject current=null] : iv_ruleObjectMaxCardinality= ruleObjectMaxCardinality EOF ;
    public final EObject entryRuleObjectMaxCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectMaxCardinality = null;


        try {
            // InternalOwl.g:2504:61: (iv_ruleObjectMaxCardinality= ruleObjectMaxCardinality EOF )
            // InternalOwl.g:2505:2: iv_ruleObjectMaxCardinality= ruleObjectMaxCardinality EOF
            {
             newCompositeNode(grammarAccess.getObjectMaxCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectMaxCardinality=ruleObjectMaxCardinality();

            state._fsp--;

             current =iv_ruleObjectMaxCardinality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectMaxCardinality"


    // $ANTLR start "ruleObjectMaxCardinality"
    // InternalOwl.g:2511:1: ruleObjectMaxCardinality returns [EObject current=null] : (otherlv_0= 'ObjectMaxCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' ) ;
    public final EObject ruleObjectMaxCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_cardinality_2_0=null;
        Token otherlv_5=null;
        EObject lv_objectPropertyExpression_3_0 = null;

        EObject lv_classExpression_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2517:2: ( (otherlv_0= 'ObjectMaxCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' ) )
            // InternalOwl.g:2518:2: (otherlv_0= 'ObjectMaxCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' )
            {
            // InternalOwl.g:2518:2: (otherlv_0= 'ObjectMaxCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' )
            // InternalOwl.g:2519:3: otherlv_0= 'ObjectMaxCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectMaxCardinalityAccess().getObjectMaxCardinalityKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectMaxCardinalityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2527:3: ( (lv_cardinality_2_0= RULE_INT ) )
            // InternalOwl.g:2528:4: (lv_cardinality_2_0= RULE_INT )
            {
            // InternalOwl.g:2528:4: (lv_cardinality_2_0= RULE_INT )
            // InternalOwl.g:2529:5: lv_cardinality_2_0= RULE_INT
            {
            lv_cardinality_2_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_cardinality_2_0, grammarAccess.getObjectMaxCardinalityAccess().getCardinalityINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectMaxCardinalityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cardinality",
            						lv_cardinality_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalOwl.g:2545:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:2546:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:2546:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:2547:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getObjectMaxCardinalityAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_objectPropertyExpression_3_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectMaxCardinalityRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression",
            						lv_objectPropertyExpression_3_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:2564:3: ( (lv_classExpression_4_0= ruleClassExpression ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_FULL_IRI && LA22_0<=RULE_PN_LOCAL)||(LA22_0>=39 && LA22_0<=55)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOwl.g:2565:4: (lv_classExpression_4_0= ruleClassExpression )
                    {
                    // InternalOwl.g:2565:4: (lv_classExpression_4_0= ruleClassExpression )
                    // InternalOwl.g:2566:5: lv_classExpression_4_0= ruleClassExpression
                    {

                    					newCompositeNode(grammarAccess.getObjectMaxCardinalityAccess().getClassExpressionClassExpressionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_classExpression_4_0=ruleClassExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObjectMaxCardinalityRule());
                    					}
                    					set(
                    						current,
                    						"classExpression",
                    						lv_classExpression_4_0,
                    						"org.omg.sysml.owl.Owl.ClassExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getObjectMaxCardinalityAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectMaxCardinality"


    // $ANTLR start "entryRuleObjectExactCardinality"
    // InternalOwl.g:2591:1: entryRuleObjectExactCardinality returns [EObject current=null] : iv_ruleObjectExactCardinality= ruleObjectExactCardinality EOF ;
    public final EObject entryRuleObjectExactCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectExactCardinality = null;


        try {
            // InternalOwl.g:2591:63: (iv_ruleObjectExactCardinality= ruleObjectExactCardinality EOF )
            // InternalOwl.g:2592:2: iv_ruleObjectExactCardinality= ruleObjectExactCardinality EOF
            {
             newCompositeNode(grammarAccess.getObjectExactCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectExactCardinality=ruleObjectExactCardinality();

            state._fsp--;

             current =iv_ruleObjectExactCardinality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectExactCardinality"


    // $ANTLR start "ruleObjectExactCardinality"
    // InternalOwl.g:2598:1: ruleObjectExactCardinality returns [EObject current=null] : (otherlv_0= 'ObjectExactCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' ) ;
    public final EObject ruleObjectExactCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_cardinality_2_0=null;
        Token otherlv_5=null;
        EObject lv_objectPropertyExpression_3_0 = null;

        EObject lv_classExpression_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2604:2: ( (otherlv_0= 'ObjectExactCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' ) )
            // InternalOwl.g:2605:2: (otherlv_0= 'ObjectExactCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' )
            {
            // InternalOwl.g:2605:2: (otherlv_0= 'ObjectExactCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' )
            // InternalOwl.g:2606:3: otherlv_0= 'ObjectExactCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectExactCardinalityAccess().getObjectExactCardinalityKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectExactCardinalityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2614:3: ( (lv_cardinality_2_0= RULE_INT ) )
            // InternalOwl.g:2615:4: (lv_cardinality_2_0= RULE_INT )
            {
            // InternalOwl.g:2615:4: (lv_cardinality_2_0= RULE_INT )
            // InternalOwl.g:2616:5: lv_cardinality_2_0= RULE_INT
            {
            lv_cardinality_2_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_cardinality_2_0, grammarAccess.getObjectExactCardinalityAccess().getCardinalityINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectExactCardinalityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cardinality",
            						lv_cardinality_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalOwl.g:2632:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:2633:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:2633:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:2634:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getObjectExactCardinalityAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_objectPropertyExpression_3_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectExactCardinalityRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression",
            						lv_objectPropertyExpression_3_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:2651:3: ( (lv_classExpression_4_0= ruleClassExpression ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_FULL_IRI && LA23_0<=RULE_PN_LOCAL)||(LA23_0>=39 && LA23_0<=55)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOwl.g:2652:4: (lv_classExpression_4_0= ruleClassExpression )
                    {
                    // InternalOwl.g:2652:4: (lv_classExpression_4_0= ruleClassExpression )
                    // InternalOwl.g:2653:5: lv_classExpression_4_0= ruleClassExpression
                    {

                    					newCompositeNode(grammarAccess.getObjectExactCardinalityAccess().getClassExpressionClassExpressionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_classExpression_4_0=ruleClassExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObjectExactCardinalityRule());
                    					}
                    					set(
                    						current,
                    						"classExpression",
                    						lv_classExpression_4_0,
                    						"org.omg.sysml.owl.Owl.ClassExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getObjectExactCardinalityAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectExactCardinality"


    // $ANTLR start "entryRuleDataSomeValuesFrom"
    // InternalOwl.g:2678:1: entryRuleDataSomeValuesFrom returns [EObject current=null] : iv_ruleDataSomeValuesFrom= ruleDataSomeValuesFrom EOF ;
    public final EObject entryRuleDataSomeValuesFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSomeValuesFrom = null;


        try {
            // InternalOwl.g:2678:59: (iv_ruleDataSomeValuesFrom= ruleDataSomeValuesFrom EOF )
            // InternalOwl.g:2679:2: iv_ruleDataSomeValuesFrom= ruleDataSomeValuesFrom EOF
            {
             newCompositeNode(grammarAccess.getDataSomeValuesFromRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataSomeValuesFrom=ruleDataSomeValuesFrom();

            state._fsp--;

             current =iv_ruleDataSomeValuesFrom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataSomeValuesFrom"


    // $ANTLR start "ruleDataSomeValuesFrom"
    // InternalOwl.g:2685:1: ruleDataSomeValuesFrom returns [EObject current=null] : (otherlv_0= 'DataSomeValuesFrom' otherlv_1= '(' ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+ ( (lv_dataRange_3_0= ruleDataRange ) ) otherlv_4= ')' ) ;
    public final EObject ruleDataSomeValuesFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_dataPropertyExpressions_2_0 = null;

        EObject lv_dataRange_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2691:2: ( (otherlv_0= 'DataSomeValuesFrom' otherlv_1= '(' ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+ ( (lv_dataRange_3_0= ruleDataRange ) ) otherlv_4= ')' ) )
            // InternalOwl.g:2692:2: (otherlv_0= 'DataSomeValuesFrom' otherlv_1= '(' ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+ ( (lv_dataRange_3_0= ruleDataRange ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:2692:2: (otherlv_0= 'DataSomeValuesFrom' otherlv_1= '(' ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+ ( (lv_dataRange_3_0= ruleDataRange ) ) otherlv_4= ')' )
            // InternalOwl.g:2693:3: otherlv_0= 'DataSomeValuesFrom' otherlv_1= '(' ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+ ( (lv_dataRange_3_0= ruleDataRange ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataSomeValuesFromAccess().getDataSomeValuesFromKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDataSomeValuesFromAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2701:3: ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case RULE_FULL_IRI:
                    {
                    int LA24_1 = input.LA(2);

                    if ( ((LA24_1>=RULE_FULL_IRI && LA24_1<=RULE_PN_LOCAL)||(LA24_1>=34 && LA24_1<=38)) ) {
                        alt24=1;
                    }


                    }
                    break;
                case RULE_PN_PREFIX:
                    {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==RULE_PN_LOCAL) ) {
                        int LA24_3 = input.LA(3);

                        if ( ((LA24_3>=RULE_FULL_IRI && LA24_3<=RULE_PN_LOCAL)||(LA24_3>=34 && LA24_3<=38)) ) {
                            alt24=1;
                        }


                    }


                    }
                    break;
                case RULE_PN_LOCAL:
                    {
                    int LA24_3 = input.LA(2);

                    if ( ((LA24_3>=RULE_FULL_IRI && LA24_3<=RULE_PN_LOCAL)||(LA24_3>=34 && LA24_3<=38)) ) {
                        alt24=1;
                    }


                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // InternalOwl.g:2702:4: (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression )
            	    {
            	    // InternalOwl.g:2702:4: (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression )
            	    // InternalOwl.g:2703:5: lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression
            	    {

            	    					newCompositeNode(grammarAccess.getDataSomeValuesFromAccess().getDataPropertyExpressionsDataPropertyExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_dataPropertyExpressions_2_0=ruleDataPropertyExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataSomeValuesFromRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataPropertyExpressions",
            	    						lv_dataPropertyExpressions_2_0,
            	    						"org.omg.sysml.owl.Owl.DataPropertyExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            // InternalOwl.g:2720:3: ( (lv_dataRange_3_0= ruleDataRange ) )
            // InternalOwl.g:2721:4: (lv_dataRange_3_0= ruleDataRange )
            {
            // InternalOwl.g:2721:4: (lv_dataRange_3_0= ruleDataRange )
            // InternalOwl.g:2722:5: lv_dataRange_3_0= ruleDataRange
            {

            					newCompositeNode(grammarAccess.getDataSomeValuesFromAccess().getDataRangeDataRangeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_dataRange_3_0=ruleDataRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataSomeValuesFromRule());
            					}
            					add(
            						current,
            						"dataRange",
            						lv_dataRange_3_0,
            						"org.omg.sysml.owl.Owl.DataRange");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDataSomeValuesFromAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataSomeValuesFrom"


    // $ANTLR start "entryRuleDataAllValuesFrom"
    // InternalOwl.g:2747:1: entryRuleDataAllValuesFrom returns [EObject current=null] : iv_ruleDataAllValuesFrom= ruleDataAllValuesFrom EOF ;
    public final EObject entryRuleDataAllValuesFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAllValuesFrom = null;


        try {
            // InternalOwl.g:2747:58: (iv_ruleDataAllValuesFrom= ruleDataAllValuesFrom EOF )
            // InternalOwl.g:2748:2: iv_ruleDataAllValuesFrom= ruleDataAllValuesFrom EOF
            {
             newCompositeNode(grammarAccess.getDataAllValuesFromRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataAllValuesFrom=ruleDataAllValuesFrom();

            state._fsp--;

             current =iv_ruleDataAllValuesFrom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataAllValuesFrom"


    // $ANTLR start "ruleDataAllValuesFrom"
    // InternalOwl.g:2754:1: ruleDataAllValuesFrom returns [EObject current=null] : (otherlv_0= 'DataAllValuesFrom' otherlv_1= '(' ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+ ( (lv_dataRange_3_0= ruleDataRange ) ) otherlv_4= ')' ) ;
    public final EObject ruleDataAllValuesFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_dataPropertyExpressions_2_0 = null;

        EObject lv_dataRange_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2760:2: ( (otherlv_0= 'DataAllValuesFrom' otherlv_1= '(' ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+ ( (lv_dataRange_3_0= ruleDataRange ) ) otherlv_4= ')' ) )
            // InternalOwl.g:2761:2: (otherlv_0= 'DataAllValuesFrom' otherlv_1= '(' ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+ ( (lv_dataRange_3_0= ruleDataRange ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:2761:2: (otherlv_0= 'DataAllValuesFrom' otherlv_1= '(' ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+ ( (lv_dataRange_3_0= ruleDataRange ) ) otherlv_4= ')' )
            // InternalOwl.g:2762:3: otherlv_0= 'DataAllValuesFrom' otherlv_1= '(' ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+ ( (lv_dataRange_3_0= ruleDataRange ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataAllValuesFromAccess().getDataAllValuesFromKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDataAllValuesFromAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2770:3: ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                switch ( input.LA(1) ) {
                case RULE_FULL_IRI:
                    {
                    int LA25_1 = input.LA(2);

                    if ( ((LA25_1>=RULE_FULL_IRI && LA25_1<=RULE_PN_LOCAL)||(LA25_1>=34 && LA25_1<=38)) ) {
                        alt25=1;
                    }


                    }
                    break;
                case RULE_PN_PREFIX:
                    {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==RULE_PN_LOCAL) ) {
                        int LA25_3 = input.LA(3);

                        if ( ((LA25_3>=RULE_FULL_IRI && LA25_3<=RULE_PN_LOCAL)||(LA25_3>=34 && LA25_3<=38)) ) {
                            alt25=1;
                        }


                    }


                    }
                    break;
                case RULE_PN_LOCAL:
                    {
                    int LA25_3 = input.LA(2);

                    if ( ((LA25_3>=RULE_FULL_IRI && LA25_3<=RULE_PN_LOCAL)||(LA25_3>=34 && LA25_3<=38)) ) {
                        alt25=1;
                    }


                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // InternalOwl.g:2771:4: (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression )
            	    {
            	    // InternalOwl.g:2771:4: (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression )
            	    // InternalOwl.g:2772:5: lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression
            	    {

            	    					newCompositeNode(grammarAccess.getDataAllValuesFromAccess().getDataPropertyExpressionsDataPropertyExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_dataPropertyExpressions_2_0=ruleDataPropertyExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataAllValuesFromRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataPropertyExpressions",
            	    						lv_dataPropertyExpressions_2_0,
            	    						"org.omg.sysml.owl.Owl.DataPropertyExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            // InternalOwl.g:2789:3: ( (lv_dataRange_3_0= ruleDataRange ) )
            // InternalOwl.g:2790:4: (lv_dataRange_3_0= ruleDataRange )
            {
            // InternalOwl.g:2790:4: (lv_dataRange_3_0= ruleDataRange )
            // InternalOwl.g:2791:5: lv_dataRange_3_0= ruleDataRange
            {

            					newCompositeNode(grammarAccess.getDataAllValuesFromAccess().getDataRangeDataRangeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_dataRange_3_0=ruleDataRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataAllValuesFromRule());
            					}
            					add(
            						current,
            						"dataRange",
            						lv_dataRange_3_0,
            						"org.omg.sysml.owl.Owl.DataRange");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDataAllValuesFromAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataAllValuesFrom"


    // $ANTLR start "entryRuleDataHasValue"
    // InternalOwl.g:2816:1: entryRuleDataHasValue returns [EObject current=null] : iv_ruleDataHasValue= ruleDataHasValue EOF ;
    public final EObject entryRuleDataHasValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataHasValue = null;


        try {
            // InternalOwl.g:2816:53: (iv_ruleDataHasValue= ruleDataHasValue EOF )
            // InternalOwl.g:2817:2: iv_ruleDataHasValue= ruleDataHasValue EOF
            {
             newCompositeNode(grammarAccess.getDataHasValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataHasValue=ruleDataHasValue();

            state._fsp--;

             current =iv_ruleDataHasValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataHasValue"


    // $ANTLR start "ruleDataHasValue"
    // InternalOwl.g:2823:1: ruleDataHasValue returns [EObject current=null] : (otherlv_0= 'DataHasValue' otherlv_1= '(' ( (lv_dataPropertyExpression_2_0= ruleDataPropertyExpression ) ) ( (lv_literal_3_0= ruleLiteral ) ) otherlv_4= ')' ) ;
    public final EObject ruleDataHasValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_dataPropertyExpression_2_0 = null;

        EObject lv_literal_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2829:2: ( (otherlv_0= 'DataHasValue' otherlv_1= '(' ( (lv_dataPropertyExpression_2_0= ruleDataPropertyExpression ) ) ( (lv_literal_3_0= ruleLiteral ) ) otherlv_4= ')' ) )
            // InternalOwl.g:2830:2: (otherlv_0= 'DataHasValue' otherlv_1= '(' ( (lv_dataPropertyExpression_2_0= ruleDataPropertyExpression ) ) ( (lv_literal_3_0= ruleLiteral ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:2830:2: (otherlv_0= 'DataHasValue' otherlv_1= '(' ( (lv_dataPropertyExpression_2_0= ruleDataPropertyExpression ) ) ( (lv_literal_3_0= ruleLiteral ) ) otherlv_4= ')' )
            // InternalOwl.g:2831:3: otherlv_0= 'DataHasValue' otherlv_1= '(' ( (lv_dataPropertyExpression_2_0= ruleDataPropertyExpression ) ) ( (lv_literal_3_0= ruleLiteral ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataHasValueAccess().getDataHasValueKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDataHasValueAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2839:3: ( (lv_dataPropertyExpression_2_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:2840:4: (lv_dataPropertyExpression_2_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:2840:4: (lv_dataPropertyExpression_2_0= ruleDataPropertyExpression )
            // InternalOwl.g:2841:5: lv_dataPropertyExpression_2_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getDataHasValueAccess().getDataPropertyExpressionDataPropertyExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_dataPropertyExpression_2_0=ruleDataPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataHasValueRule());
            					}
            					set(
            						current,
            						"dataPropertyExpression",
            						lv_dataPropertyExpression_2_0,
            						"org.omg.sysml.owl.Owl.DataPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:2858:3: ( (lv_literal_3_0= ruleLiteral ) )
            // InternalOwl.g:2859:4: (lv_literal_3_0= ruleLiteral )
            {
            // InternalOwl.g:2859:4: (lv_literal_3_0= ruleLiteral )
            // InternalOwl.g:2860:5: lv_literal_3_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getDataHasValueAccess().getLiteralLiteralParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_literal_3_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataHasValueRule());
            					}
            					set(
            						current,
            						"literal",
            						lv_literal_3_0,
            						"org.omg.sysml.owl.Owl.Literal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDataHasValueAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataHasValue"


    // $ANTLR start "entryRuleDataMinCardinality"
    // InternalOwl.g:2885:1: entryRuleDataMinCardinality returns [EObject current=null] : iv_ruleDataMinCardinality= ruleDataMinCardinality EOF ;
    public final EObject entryRuleDataMinCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataMinCardinality = null;


        try {
            // InternalOwl.g:2885:59: (iv_ruleDataMinCardinality= ruleDataMinCardinality EOF )
            // InternalOwl.g:2886:2: iv_ruleDataMinCardinality= ruleDataMinCardinality EOF
            {
             newCompositeNode(grammarAccess.getDataMinCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataMinCardinality=ruleDataMinCardinality();

            state._fsp--;

             current =iv_ruleDataMinCardinality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataMinCardinality"


    // $ANTLR start "ruleDataMinCardinality"
    // InternalOwl.g:2892:1: ruleDataMinCardinality returns [EObject current=null] : (otherlv_0= 'DataMinCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? ) ;
    public final EObject ruleDataMinCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_cardinality_2_0=null;
        EObject lv_dataPropertyExpression_3_0 = null;

        EObject lv_dataRange_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2898:2: ( (otherlv_0= 'DataMinCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? ) )
            // InternalOwl.g:2899:2: (otherlv_0= 'DataMinCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? )
            {
            // InternalOwl.g:2899:2: (otherlv_0= 'DataMinCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? )
            // InternalOwl.g:2900:3: otherlv_0= 'DataMinCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataMinCardinalityAccess().getDataMinCardinalityKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getDataMinCardinalityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2908:3: ( (lv_cardinality_2_0= RULE_INT ) )
            // InternalOwl.g:2909:4: (lv_cardinality_2_0= RULE_INT )
            {
            // InternalOwl.g:2909:4: (lv_cardinality_2_0= RULE_INT )
            // InternalOwl.g:2910:5: lv_cardinality_2_0= RULE_INT
            {
            lv_cardinality_2_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_cardinality_2_0, grammarAccess.getDataMinCardinalityAccess().getCardinalityINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataMinCardinalityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cardinality",
            						lv_cardinality_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalOwl.g:2926:3: ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:2927:4: (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:2927:4: (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression )
            // InternalOwl.g:2928:5: lv_dataPropertyExpression_3_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getDataMinCardinalityAccess().getDataPropertyExpressionDataPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_dataPropertyExpression_3_0=ruleDataPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataMinCardinalityRule());
            					}
            					set(
            						current,
            						"dataPropertyExpression",
            						lv_dataPropertyExpression_3_0,
            						"org.omg.sysml.owl.Owl.DataPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:2945:3: ( (lv_dataRange_4_0= ruleDataRange ) )?
            int alt26=2;
            switch ( input.LA(1) ) {
                case RULE_FULL_IRI:
                    {
                    alt26=1;
                    }
                    break;
                case RULE_PN_PREFIX:
                    {
                    int LA26_2 = input.LA(2);

                    if ( (LA26_2==RULE_PN_LOCAL) ) {
                        alt26=1;
                    }
                    }
                    break;
                case RULE_PN_LOCAL:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                    {
                    alt26=1;
                    }
                    break;
            }

            switch (alt26) {
                case 1 :
                    // InternalOwl.g:2946:4: (lv_dataRange_4_0= ruleDataRange )
                    {
                    // InternalOwl.g:2946:4: (lv_dataRange_4_0= ruleDataRange )
                    // InternalOwl.g:2947:5: lv_dataRange_4_0= ruleDataRange
                    {

                    					newCompositeNode(grammarAccess.getDataMinCardinalityAccess().getDataRangeDataRangeParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dataRange_4_0=ruleDataRange();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataMinCardinalityRule());
                    					}
                    					set(
                    						current,
                    						"dataRange",
                    						lv_dataRange_4_0,
                    						"org.omg.sysml.owl.Owl.DataRange");
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
    // $ANTLR end "ruleDataMinCardinality"


    // $ANTLR start "entryRuleDataMaxCardinality"
    // InternalOwl.g:2968:1: entryRuleDataMaxCardinality returns [EObject current=null] : iv_ruleDataMaxCardinality= ruleDataMaxCardinality EOF ;
    public final EObject entryRuleDataMaxCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataMaxCardinality = null;


        try {
            // InternalOwl.g:2968:59: (iv_ruleDataMaxCardinality= ruleDataMaxCardinality EOF )
            // InternalOwl.g:2969:2: iv_ruleDataMaxCardinality= ruleDataMaxCardinality EOF
            {
             newCompositeNode(grammarAccess.getDataMaxCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataMaxCardinality=ruleDataMaxCardinality();

            state._fsp--;

             current =iv_ruleDataMaxCardinality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataMaxCardinality"


    // $ANTLR start "ruleDataMaxCardinality"
    // InternalOwl.g:2975:1: ruleDataMaxCardinality returns [EObject current=null] : (otherlv_0= 'DataMaxCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? ) ;
    public final EObject ruleDataMaxCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_cardinality_2_0=null;
        EObject lv_dataPropertyExpression_3_0 = null;

        EObject lv_dataRange_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2981:2: ( (otherlv_0= 'DataMaxCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? ) )
            // InternalOwl.g:2982:2: (otherlv_0= 'DataMaxCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? )
            {
            // InternalOwl.g:2982:2: (otherlv_0= 'DataMaxCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? )
            // InternalOwl.g:2983:3: otherlv_0= 'DataMaxCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataMaxCardinalityAccess().getDataMaxCardinalityKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getDataMaxCardinalityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2991:3: ( (lv_cardinality_2_0= RULE_INT ) )
            // InternalOwl.g:2992:4: (lv_cardinality_2_0= RULE_INT )
            {
            // InternalOwl.g:2992:4: (lv_cardinality_2_0= RULE_INT )
            // InternalOwl.g:2993:5: lv_cardinality_2_0= RULE_INT
            {
            lv_cardinality_2_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_cardinality_2_0, grammarAccess.getDataMaxCardinalityAccess().getCardinalityINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataMaxCardinalityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cardinality",
            						lv_cardinality_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalOwl.g:3009:3: ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:3010:4: (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:3010:4: (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression )
            // InternalOwl.g:3011:5: lv_dataPropertyExpression_3_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getDataMaxCardinalityAccess().getDataPropertyExpressionDataPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_dataPropertyExpression_3_0=ruleDataPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataMaxCardinalityRule());
            					}
            					set(
            						current,
            						"dataPropertyExpression",
            						lv_dataPropertyExpression_3_0,
            						"org.omg.sysml.owl.Owl.DataPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:3028:3: ( (lv_dataRange_4_0= ruleDataRange ) )?
            int alt27=2;
            switch ( input.LA(1) ) {
                case RULE_FULL_IRI:
                    {
                    alt27=1;
                    }
                    break;
                case RULE_PN_PREFIX:
                    {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==RULE_PN_LOCAL) ) {
                        alt27=1;
                    }
                    }
                    break;
                case RULE_PN_LOCAL:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                    {
                    alt27=1;
                    }
                    break;
            }

            switch (alt27) {
                case 1 :
                    // InternalOwl.g:3029:4: (lv_dataRange_4_0= ruleDataRange )
                    {
                    // InternalOwl.g:3029:4: (lv_dataRange_4_0= ruleDataRange )
                    // InternalOwl.g:3030:5: lv_dataRange_4_0= ruleDataRange
                    {

                    					newCompositeNode(grammarAccess.getDataMaxCardinalityAccess().getDataRangeDataRangeParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dataRange_4_0=ruleDataRange();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataMaxCardinalityRule());
                    					}
                    					set(
                    						current,
                    						"dataRange",
                    						lv_dataRange_4_0,
                    						"org.omg.sysml.owl.Owl.DataRange");
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
    // $ANTLR end "ruleDataMaxCardinality"


    // $ANTLR start "entryRuleDataExactCardinality"
    // InternalOwl.g:3051:1: entryRuleDataExactCardinality returns [EObject current=null] : iv_ruleDataExactCardinality= ruleDataExactCardinality EOF ;
    public final EObject entryRuleDataExactCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataExactCardinality = null;


        try {
            // InternalOwl.g:3051:61: (iv_ruleDataExactCardinality= ruleDataExactCardinality EOF )
            // InternalOwl.g:3052:2: iv_ruleDataExactCardinality= ruleDataExactCardinality EOF
            {
             newCompositeNode(grammarAccess.getDataExactCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataExactCardinality=ruleDataExactCardinality();

            state._fsp--;

             current =iv_ruleDataExactCardinality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataExactCardinality"


    // $ANTLR start "ruleDataExactCardinality"
    // InternalOwl.g:3058:1: ruleDataExactCardinality returns [EObject current=null] : (otherlv_0= 'DataExactCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? ) ;
    public final EObject ruleDataExactCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_cardinality_2_0=null;
        EObject lv_dataPropertyExpression_3_0 = null;

        EObject lv_dataRange_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:3064:2: ( (otherlv_0= 'DataExactCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? ) )
            // InternalOwl.g:3065:2: (otherlv_0= 'DataExactCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? )
            {
            // InternalOwl.g:3065:2: (otherlv_0= 'DataExactCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? )
            // InternalOwl.g:3066:3: otherlv_0= 'DataExactCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )?
            {
            otherlv_0=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataExactCardinalityAccess().getDataExactCardinalityKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getDataExactCardinalityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:3074:3: ( (lv_cardinality_2_0= RULE_INT ) )
            // InternalOwl.g:3075:4: (lv_cardinality_2_0= RULE_INT )
            {
            // InternalOwl.g:3075:4: (lv_cardinality_2_0= RULE_INT )
            // InternalOwl.g:3076:5: lv_cardinality_2_0= RULE_INT
            {
            lv_cardinality_2_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_cardinality_2_0, grammarAccess.getDataExactCardinalityAccess().getCardinalityINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataExactCardinalityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cardinality",
            						lv_cardinality_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalOwl.g:3092:3: ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:3093:4: (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:3093:4: (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression )
            // InternalOwl.g:3094:5: lv_dataPropertyExpression_3_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getDataExactCardinalityAccess().getDataPropertyExpressionDataPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_dataPropertyExpression_3_0=ruleDataPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataExactCardinalityRule());
            					}
            					set(
            						current,
            						"dataPropertyExpression",
            						lv_dataPropertyExpression_3_0,
            						"org.omg.sysml.owl.Owl.DataPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:3111:3: ( (lv_dataRange_4_0= ruleDataRange ) )?
            int alt28=2;
            switch ( input.LA(1) ) {
                case RULE_FULL_IRI:
                    {
                    alt28=1;
                    }
                    break;
                case RULE_PN_PREFIX:
                    {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==RULE_PN_LOCAL) ) {
                        alt28=1;
                    }
                    }
                    break;
                case RULE_PN_LOCAL:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                    {
                    alt28=1;
                    }
                    break;
            }

            switch (alt28) {
                case 1 :
                    // InternalOwl.g:3112:4: (lv_dataRange_4_0= ruleDataRange )
                    {
                    // InternalOwl.g:3112:4: (lv_dataRange_4_0= ruleDataRange )
                    // InternalOwl.g:3113:5: lv_dataRange_4_0= ruleDataRange
                    {

                    					newCompositeNode(grammarAccess.getDataExactCardinalityAccess().getDataRangeDataRangeParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dataRange_4_0=ruleDataRange();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataExactCardinalityRule());
                    					}
                    					set(
                    						current,
                    						"dataRange",
                    						lv_dataRange_4_0,
                    						"org.omg.sysml.owl.Owl.DataRange");
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
    // $ANTLR end "ruleDataExactCardinality"


    // $ANTLR start "entryRuleAxiom"
    // InternalOwl.g:3134:1: entryRuleAxiom returns [EObject current=null] : iv_ruleAxiom= ruleAxiom EOF ;
    public final EObject entryRuleAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxiom = null;


        try {
            // InternalOwl.g:3134:46: (iv_ruleAxiom= ruleAxiom EOF )
            // InternalOwl.g:3135:2: iv_ruleAxiom= ruleAxiom EOF
            {
             newCompositeNode(grammarAccess.getAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAxiom=ruleAxiom();

            state._fsp--;

             current =iv_ruleAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAxiom"


    // $ANTLR start "ruleAxiom"
    // InternalOwl.g:3141:1: ruleAxiom returns [EObject current=null] : (this_Declaration_0= ruleDeclaration | this_ClassAxiom_1= ruleClassAxiom | this_ObjectPropertyAxiom_2= ruleObjectPropertyAxiom | this_DataPropertyAxiom_3= ruleDataPropertyAxiom | this_DatatypeDefinition_4= ruleDatatypeDefinition | this_HasKey_5= ruleHasKey | this_Assertion_6= ruleAssertion | this_AnnotationAxiom_7= ruleAnnotationAxiom ) ;
    public final EObject ruleAxiom() throws RecognitionException {
        EObject current = null;

        EObject this_Declaration_0 = null;

        EObject this_ClassAxiom_1 = null;

        EObject this_ObjectPropertyAxiom_2 = null;

        EObject this_DataPropertyAxiom_3 = null;

        EObject this_DatatypeDefinition_4 = null;

        EObject this_HasKey_5 = null;

        EObject this_Assertion_6 = null;

        EObject this_AnnotationAxiom_7 = null;



        	enterRule();

        try {
            // InternalOwl.g:3147:2: ( (this_Declaration_0= ruleDeclaration | this_ClassAxiom_1= ruleClassAxiom | this_ObjectPropertyAxiom_2= ruleObjectPropertyAxiom | this_DataPropertyAxiom_3= ruleDataPropertyAxiom | this_DatatypeDefinition_4= ruleDatatypeDefinition | this_HasKey_5= ruleHasKey | this_Assertion_6= ruleAssertion | this_AnnotationAxiom_7= ruleAnnotationAxiom ) )
            // InternalOwl.g:3148:2: (this_Declaration_0= ruleDeclaration | this_ClassAxiom_1= ruleClassAxiom | this_ObjectPropertyAxiom_2= ruleObjectPropertyAxiom | this_DataPropertyAxiom_3= ruleDataPropertyAxiom | this_DatatypeDefinition_4= ruleDatatypeDefinition | this_HasKey_5= ruleHasKey | this_Assertion_6= ruleAssertion | this_AnnotationAxiom_7= ruleAnnotationAxiom )
            {
            // InternalOwl.g:3148:2: (this_Declaration_0= ruleDeclaration | this_ClassAxiom_1= ruleClassAxiom | this_ObjectPropertyAxiom_2= ruleObjectPropertyAxiom | this_DataPropertyAxiom_3= ruleDataPropertyAxiom | this_DatatypeDefinition_4= ruleDatatypeDefinition | this_HasKey_5= ruleHasKey | this_Assertion_6= ruleAssertion | this_AnnotationAxiom_7= ruleAnnotationAxiom )
            int alt29=8;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt29=1;
                }
                break;
            case 56:
            case 57:
            case 58:
            case 59:
                {
                alt29=2;
                }
                break;
            case 60:
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
                {
                alt29=3;
                }
                break;
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
                {
                alt29=4;
                }
                break;
            case 80:
                {
                alt29=5;
                }
                break;
            case 81:
                {
                alt29=6;
                }
                break;
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
                {
                alt29=7;
                }
                break;
            case 90:
            case 91:
            case 92:
            case 93:
                {
                alt29=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalOwl.g:3149:3: this_Declaration_0= ruleDeclaration
                    {

                    			newCompositeNode(grammarAccess.getAxiomAccess().getDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Declaration_0=ruleDeclaration();

                    state._fsp--;


                    			current = this_Declaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOwl.g:3158:3: this_ClassAxiom_1= ruleClassAxiom
                    {

                    			newCompositeNode(grammarAccess.getAxiomAccess().getClassAxiomParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassAxiom_1=ruleClassAxiom();

                    state._fsp--;


                    			current = this_ClassAxiom_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOwl.g:3167:3: this_ObjectPropertyAxiom_2= ruleObjectPropertyAxiom
                    {

                    			newCompositeNode(grammarAccess.getAxiomAccess().getObjectPropertyAxiomParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectPropertyAxiom_2=ruleObjectPropertyAxiom();

                    state._fsp--;


                    			current = this_ObjectPropertyAxiom_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOwl.g:3176:3: this_DataPropertyAxiom_3= ruleDataPropertyAxiom
                    {

                    			newCompositeNode(grammarAccess.getAxiomAccess().getDataPropertyAxiomParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataPropertyAxiom_3=ruleDataPropertyAxiom();

                    state._fsp--;


                    			current = this_DataPropertyAxiom_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOwl.g:3185:3: this_DatatypeDefinition_4= ruleDatatypeDefinition
                    {

                    			newCompositeNode(grammarAccess.getAxiomAccess().getDatatypeDefinitionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DatatypeDefinition_4=ruleDatatypeDefinition();

                    state._fsp--;


                    			current = this_DatatypeDefinition_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOwl.g:3194:3: this_HasKey_5= ruleHasKey
                    {

                    			newCompositeNode(grammarAccess.getAxiomAccess().getHasKeyParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_HasKey_5=ruleHasKey();

                    state._fsp--;


                    			current = this_HasKey_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalOwl.g:3203:3: this_Assertion_6= ruleAssertion
                    {

                    			newCompositeNode(grammarAccess.getAxiomAccess().getAssertionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assertion_6=ruleAssertion();

                    state._fsp--;


                    			current = this_Assertion_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalOwl.g:3212:3: this_AnnotationAxiom_7= ruleAnnotationAxiom
                    {

                    			newCompositeNode(grammarAccess.getAxiomAccess().getAnnotationAxiomParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnnotationAxiom_7=ruleAnnotationAxiom();

                    state._fsp--;


                    			current = this_AnnotationAxiom_7;
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
    // $ANTLR end "ruleAxiom"


    // $ANTLR start "entryRuleClassAxiom"
    // InternalOwl.g:3224:1: entryRuleClassAxiom returns [EObject current=null] : iv_ruleClassAxiom= ruleClassAxiom EOF ;
    public final EObject entryRuleClassAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassAxiom = null;


        try {
            // InternalOwl.g:3224:51: (iv_ruleClassAxiom= ruleClassAxiom EOF )
            // InternalOwl.g:3225:2: iv_ruleClassAxiom= ruleClassAxiom EOF
            {
             newCompositeNode(grammarAccess.getClassAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassAxiom=ruleClassAxiom();

            state._fsp--;

             current =iv_ruleClassAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassAxiom"


    // $ANTLR start "ruleClassAxiom"
    // InternalOwl.g:3231:1: ruleClassAxiom returns [EObject current=null] : (this_SubClassOf_0= ruleSubClassOf | this_EquivalentClasses_1= ruleEquivalentClasses | this_DisjointClasses_2= ruleDisjointClasses | this_DisjointUnion_3= ruleDisjointUnion ) ;
    public final EObject ruleClassAxiom() throws RecognitionException {
        EObject current = null;

        EObject this_SubClassOf_0 = null;

        EObject this_EquivalentClasses_1 = null;

        EObject this_DisjointClasses_2 = null;

        EObject this_DisjointUnion_3 = null;



        	enterRule();

        try {
            // InternalOwl.g:3237:2: ( (this_SubClassOf_0= ruleSubClassOf | this_EquivalentClasses_1= ruleEquivalentClasses | this_DisjointClasses_2= ruleDisjointClasses | this_DisjointUnion_3= ruleDisjointUnion ) )
            // InternalOwl.g:3238:2: (this_SubClassOf_0= ruleSubClassOf | this_EquivalentClasses_1= ruleEquivalentClasses | this_DisjointClasses_2= ruleDisjointClasses | this_DisjointUnion_3= ruleDisjointUnion )
            {
            // InternalOwl.g:3238:2: (this_SubClassOf_0= ruleSubClassOf | this_EquivalentClasses_1= ruleEquivalentClasses | this_DisjointClasses_2= ruleDisjointClasses | this_DisjointUnion_3= ruleDisjointUnion )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt30=1;
                }
                break;
            case 57:
                {
                alt30=2;
                }
                break;
            case 58:
                {
                alt30=3;
                }
                break;
            case 59:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalOwl.g:3239:3: this_SubClassOf_0= ruleSubClassOf
                    {

                    			newCompositeNode(grammarAccess.getClassAxiomAccess().getSubClassOfParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubClassOf_0=ruleSubClassOf();

                    state._fsp--;


                    			current = this_SubClassOf_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOwl.g:3248:3: this_EquivalentClasses_1= ruleEquivalentClasses
                    {

                    			newCompositeNode(grammarAccess.getClassAxiomAccess().getEquivalentClassesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EquivalentClasses_1=ruleEquivalentClasses();

                    state._fsp--;


                    			current = this_EquivalentClasses_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOwl.g:3257:3: this_DisjointClasses_2= ruleDisjointClasses
                    {

                    			newCompositeNode(grammarAccess.getClassAxiomAccess().getDisjointClassesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DisjointClasses_2=ruleDisjointClasses();

                    state._fsp--;


                    			current = this_DisjointClasses_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOwl.g:3266:3: this_DisjointUnion_3= ruleDisjointUnion
                    {

                    			newCompositeNode(grammarAccess.getClassAxiomAccess().getDisjointUnionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DisjointUnion_3=ruleDisjointUnion();

                    state._fsp--;


                    			current = this_DisjointUnion_3;
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
    // $ANTLR end "ruleClassAxiom"


    // $ANTLR start "entryRuleSubClassOf"
    // InternalOwl.g:3278:1: entryRuleSubClassOf returns [EObject current=null] : iv_ruleSubClassOf= ruleSubClassOf EOF ;
    public final EObject entryRuleSubClassOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubClassOf = null;


        try {
            // InternalOwl.g:3278:51: (iv_ruleSubClassOf= ruleSubClassOf EOF )
            // InternalOwl.g:3279:2: iv_ruleSubClassOf= ruleSubClassOf EOF
            {
             newCompositeNode(grammarAccess.getSubClassOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubClassOf=ruleSubClassOf();

            state._fsp--;

             current =iv_ruleSubClassOf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubClassOf"


    // $ANTLR start "ruleSubClassOf"
    // InternalOwl.g:3285:1: ruleSubClassOf returns [EObject current=null] : (otherlv_0= 'SubClassOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_subClassExpression_3_0= ruleClassExpression ) ) ( (lv_superClassExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleSubClassOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_subClassExpression_3_0 = null;

        EObject lv_superClassExpression_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:3291:2: ( (otherlv_0= 'SubClassOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_subClassExpression_3_0= ruleClassExpression ) ) ( (lv_superClassExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' ) )
            // InternalOwl.g:3292:2: (otherlv_0= 'SubClassOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_subClassExpression_3_0= ruleClassExpression ) ) ( (lv_superClassExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:3292:2: (otherlv_0= 'SubClassOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_subClassExpression_3_0= ruleClassExpression ) ) ( (lv_superClassExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' )
            // InternalOwl.g:3293:3: otherlv_0= 'SubClassOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_subClassExpression_3_0= ruleClassExpression ) ) ( (lv_superClassExpression_4_0= ruleClassExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSubClassOfAccess().getSubClassOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getSubClassOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:3301:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==89) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalOwl.g:3302:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:3302:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:3303:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getSubClassOfAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubClassOfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalOwl.g:3320:3: ( (lv_subClassExpression_3_0= ruleClassExpression ) )
            // InternalOwl.g:3321:4: (lv_subClassExpression_3_0= ruleClassExpression )
            {
            // InternalOwl.g:3321:4: (lv_subClassExpression_3_0= ruleClassExpression )
            // InternalOwl.g:3322:5: lv_subClassExpression_3_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getSubClassOfAccess().getSubClassExpressionClassExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_subClassExpression_3_0=ruleClassExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubClassOfRule());
            					}
            					set(
            						current,
            						"subClassExpression",
            						lv_subClassExpression_3_0,
            						"org.omg.sysml.owl.Owl.ClassExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:3339:3: ( (lv_superClassExpression_4_0= ruleClassExpression ) )
            // InternalOwl.g:3340:4: (lv_superClassExpression_4_0= ruleClassExpression )
            {
            // InternalOwl.g:3340:4: (lv_superClassExpression_4_0= ruleClassExpression )
            // InternalOwl.g:3341:5: lv_superClassExpression_4_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getSubClassOfAccess().getSuperClassExpressionClassExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_superClassExpression_4_0=ruleClassExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubClassOfRule());
            					}
            					set(
            						current,
            						"superClassExpression",
            						lv_superClassExpression_4_0,
            						"org.omg.sysml.owl.Owl.ClassExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSubClassOfAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubClassOf"


    // $ANTLR start "entryRuleEquivalentClasses"
    // InternalOwl.g:3366:1: entryRuleEquivalentClasses returns [EObject current=null] : iv_ruleEquivalentClasses= ruleEquivalentClasses EOF ;
    public final EObject entryRuleEquivalentClasses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquivalentClasses = null;


        try {
            // InternalOwl.g:3366:58: (iv_ruleEquivalentClasses= ruleEquivalentClasses EOF )
            // InternalOwl.g:3367:2: iv_ruleEquivalentClasses= ruleEquivalentClasses EOF
            {
             newCompositeNode(grammarAccess.getEquivalentClassesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquivalentClasses=ruleEquivalentClasses();

            state._fsp--;

             current =iv_ruleEquivalentClasses; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquivalentClasses"


    // $ANTLR start "ruleEquivalentClasses"
    // InternalOwl.g:3373:1: ruleEquivalentClasses returns [EObject current=null] : (otherlv_0= 'EquivalentClasses' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpressions_3_0= ruleClassExpression ) ) ( (lv_classExpressions_4_0= ruleClassExpression ) )+ otherlv_5= ')' ) ;
    public final EObject ruleEquivalentClasses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_classExpressions_3_0 = null;

        EObject lv_classExpressions_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:3379:2: ( (otherlv_0= 'EquivalentClasses' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpressions_3_0= ruleClassExpression ) ) ( (lv_classExpressions_4_0= ruleClassExpression ) )+ otherlv_5= ')' ) )
            // InternalOwl.g:3380:2: (otherlv_0= 'EquivalentClasses' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpressions_3_0= ruleClassExpression ) ) ( (lv_classExpressions_4_0= ruleClassExpression ) )+ otherlv_5= ')' )
            {
            // InternalOwl.g:3380:2: (otherlv_0= 'EquivalentClasses' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpressions_3_0= ruleClassExpression ) ) ( (lv_classExpressions_4_0= ruleClassExpression ) )+ otherlv_5= ')' )
            // InternalOwl.g:3381:3: otherlv_0= 'EquivalentClasses' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpressions_3_0= ruleClassExpression ) ) ( (lv_classExpressions_4_0= ruleClassExpression ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEquivalentClassesAccess().getEquivalentClassesKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getEquivalentClassesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:3389:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==89) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalOwl.g:3390:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:3390:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:3391:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getEquivalentClassesAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEquivalentClassesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalOwl.g:3408:3: ( (lv_classExpressions_3_0= ruleClassExpression ) )
            // InternalOwl.g:3409:4: (lv_classExpressions_3_0= ruleClassExpression )
            {
            // InternalOwl.g:3409:4: (lv_classExpressions_3_0= ruleClassExpression )
            // InternalOwl.g:3410:5: lv_classExpressions_3_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getEquivalentClassesAccess().getClassExpressionsClassExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_classExpressions_3_0=ruleClassExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEquivalentClassesRule());
            					}
            					add(
            						current,
            						"classExpressions",
            						lv_classExpressions_3_0,
            						"org.omg.sysml.owl.Owl.ClassExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:3427:3: ( (lv_classExpressions_4_0= ruleClassExpression ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_FULL_IRI && LA33_0<=RULE_PN_LOCAL)||(LA33_0>=39 && LA33_0<=55)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalOwl.g:3428:4: (lv_classExpressions_4_0= ruleClassExpression )
            	    {
            	    // InternalOwl.g:3428:4: (lv_classExpressions_4_0= ruleClassExpression )
            	    // InternalOwl.g:3429:5: lv_classExpressions_4_0= ruleClassExpression
            	    {

            	    					newCompositeNode(grammarAccess.getEquivalentClassesAccess().getClassExpressionsClassExpressionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_classExpressions_4_0=ruleClassExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEquivalentClassesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classExpressions",
            	    						lv_classExpressions_4_0,
            	    						"org.omg.sysml.owl.Owl.ClassExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEquivalentClassesAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquivalentClasses"


    // $ANTLR start "entryRuleDisjointClasses"
    // InternalOwl.g:3454:1: entryRuleDisjointClasses returns [EObject current=null] : iv_ruleDisjointClasses= ruleDisjointClasses EOF ;
    public final EObject entryRuleDisjointClasses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjointClasses = null;


        try {
            // InternalOwl.g:3454:56: (iv_ruleDisjointClasses= ruleDisjointClasses EOF )
            // InternalOwl.g:3455:2: iv_ruleDisjointClasses= ruleDisjointClasses EOF
            {
             newCompositeNode(grammarAccess.getDisjointClassesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisjointClasses=ruleDisjointClasses();

            state._fsp--;

             current =iv_ruleDisjointClasses; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisjointClasses"


    // $ANTLR start "ruleDisjointClasses"
    // InternalOwl.g:3461:1: ruleDisjointClasses returns [EObject current=null] : (otherlv_0= 'DisjointClasses' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpressions_3_0= ruleClassExpression ) ) ( (lv_classExpressions_4_0= ruleClassExpression ) )+ otherlv_5= ')' ) ;
    public final EObject ruleDisjointClasses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_classExpressions_3_0 = null;

        EObject lv_classExpressions_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:3467:2: ( (otherlv_0= 'DisjointClasses' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpressions_3_0= ruleClassExpression ) ) ( (lv_classExpressions_4_0= ruleClassExpression ) )+ otherlv_5= ')' ) )
            // InternalOwl.g:3468:2: (otherlv_0= 'DisjointClasses' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpressions_3_0= ruleClassExpression ) ) ( (lv_classExpressions_4_0= ruleClassExpression ) )+ otherlv_5= ')' )
            {
            // InternalOwl.g:3468:2: (otherlv_0= 'DisjointClasses' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpressions_3_0= ruleClassExpression ) ) ( (lv_classExpressions_4_0= ruleClassExpression ) )+ otherlv_5= ')' )
            // InternalOwl.g:3469:3: otherlv_0= 'DisjointClasses' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpressions_3_0= ruleClassExpression ) ) ( (lv_classExpressions_4_0= ruleClassExpression ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDisjointClassesAccess().getDisjointClassesKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getDisjointClassesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:3477:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==89) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalOwl.g:3478:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:3478:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:3479:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getDisjointClassesAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDisjointClassesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // InternalOwl.g:3496:3: ( (lv_classExpressions_3_0= ruleClassExpression ) )
            // InternalOwl.g:3497:4: (lv_classExpressions_3_0= ruleClassExpression )
            {
            // InternalOwl.g:3497:4: (lv_classExpressions_3_0= ruleClassExpression )
            // InternalOwl.g:3498:5: lv_classExpressions_3_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getDisjointClassesAccess().getClassExpressionsClassExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_classExpressions_3_0=ruleClassExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDisjointClassesRule());
            					}
            					add(
            						current,
            						"classExpressions",
            						lv_classExpressions_3_0,
            						"org.omg.sysml.owl.Owl.ClassExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:3515:3: ( (lv_classExpressions_4_0= ruleClassExpression ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_FULL_IRI && LA35_0<=RULE_PN_LOCAL)||(LA35_0>=39 && LA35_0<=55)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalOwl.g:3516:4: (lv_classExpressions_4_0= ruleClassExpression )
            	    {
            	    // InternalOwl.g:3516:4: (lv_classExpressions_4_0= ruleClassExpression )
            	    // InternalOwl.g:3517:5: lv_classExpressions_4_0= ruleClassExpression
            	    {

            	    					newCompositeNode(grammarAccess.getDisjointClassesAccess().getClassExpressionsClassExpressionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_classExpressions_4_0=ruleClassExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDisjointClassesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classExpressions",
            	    						lv_classExpressions_4_0,
            	    						"org.omg.sysml.owl.Owl.ClassExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDisjointClassesAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisjointClasses"


    // $ANTLR start "entryRuleDisjointUnion"
    // InternalOwl.g:3542:1: entryRuleDisjointUnion returns [EObject current=null] : iv_ruleDisjointUnion= ruleDisjointUnion EOF ;
    public final EObject entryRuleDisjointUnion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjointUnion = null;


        try {
            // InternalOwl.g:3542:54: (iv_ruleDisjointUnion= ruleDisjointUnion EOF )
            // InternalOwl.g:3543:2: iv_ruleDisjointUnion= ruleDisjointUnion EOF
            {
             newCompositeNode(grammarAccess.getDisjointUnionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisjointUnion=ruleDisjointUnion();

            state._fsp--;

             current =iv_ruleDisjointUnion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisjointUnion"


    // $ANTLR start "ruleDisjointUnion"
    // InternalOwl.g:3549:1: ruleDisjointUnion returns [EObject current=null] : (otherlv_0= 'DisjointUnion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_class_3_0= ruleClassReference ) ) ( (lv_disjointClassExpressions_4_0= ruleClassExpression ) ) ( (lv_disjointClassExpressions_5_0= ruleClassExpression ) )+ otherlv_6= ')' ) ;
    public final EObject ruleDisjointUnion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_class_3_0 = null;

        EObject lv_disjointClassExpressions_4_0 = null;

        EObject lv_disjointClassExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:3555:2: ( (otherlv_0= 'DisjointUnion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_class_3_0= ruleClassReference ) ) ( (lv_disjointClassExpressions_4_0= ruleClassExpression ) ) ( (lv_disjointClassExpressions_5_0= ruleClassExpression ) )+ otherlv_6= ')' ) )
            // InternalOwl.g:3556:2: (otherlv_0= 'DisjointUnion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_class_3_0= ruleClassReference ) ) ( (lv_disjointClassExpressions_4_0= ruleClassExpression ) ) ( (lv_disjointClassExpressions_5_0= ruleClassExpression ) )+ otherlv_6= ')' )
            {
            // InternalOwl.g:3556:2: (otherlv_0= 'DisjointUnion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_class_3_0= ruleClassReference ) ) ( (lv_disjointClassExpressions_4_0= ruleClassExpression ) ) ( (lv_disjointClassExpressions_5_0= ruleClassExpression ) )+ otherlv_6= ')' )
            // InternalOwl.g:3557:3: otherlv_0= 'DisjointUnion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_class_3_0= ruleClassReference ) ) ( (lv_disjointClassExpressions_4_0= ruleClassExpression ) ) ( (lv_disjointClassExpressions_5_0= ruleClassExpression ) )+ otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDisjointUnionAccess().getDisjointUnionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getDisjointUnionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:3565:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==89) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalOwl.g:3566:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:3566:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:3567:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getDisjointUnionAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDisjointUnionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // InternalOwl.g:3584:3: ( (lv_class_3_0= ruleClassReference ) )
            // InternalOwl.g:3585:4: (lv_class_3_0= ruleClassReference )
            {
            // InternalOwl.g:3585:4: (lv_class_3_0= ruleClassReference )
            // InternalOwl.g:3586:5: lv_class_3_0= ruleClassReference
            {

            					newCompositeNode(grammarAccess.getDisjointUnionAccess().getClassClassReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_class_3_0=ruleClassReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDisjointUnionRule());
            					}
            					set(
            						current,
            						"class",
            						lv_class_3_0,
            						"org.omg.sysml.owl.Owl.ClassReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:3603:3: ( (lv_disjointClassExpressions_4_0= ruleClassExpression ) )
            // InternalOwl.g:3604:4: (lv_disjointClassExpressions_4_0= ruleClassExpression )
            {
            // InternalOwl.g:3604:4: (lv_disjointClassExpressions_4_0= ruleClassExpression )
            // InternalOwl.g:3605:5: lv_disjointClassExpressions_4_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getDisjointUnionAccess().getDisjointClassExpressionsClassExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_disjointClassExpressions_4_0=ruleClassExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDisjointUnionRule());
            					}
            					add(
            						current,
            						"disjointClassExpressions",
            						lv_disjointClassExpressions_4_0,
            						"org.omg.sysml.owl.Owl.ClassExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:3622:3: ( (lv_disjointClassExpressions_5_0= ruleClassExpression ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_FULL_IRI && LA37_0<=RULE_PN_LOCAL)||(LA37_0>=39 && LA37_0<=55)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalOwl.g:3623:4: (lv_disjointClassExpressions_5_0= ruleClassExpression )
            	    {
            	    // InternalOwl.g:3623:4: (lv_disjointClassExpressions_5_0= ruleClassExpression )
            	    // InternalOwl.g:3624:5: lv_disjointClassExpressions_5_0= ruleClassExpression
            	    {

            	    					newCompositeNode(grammarAccess.getDisjointUnionAccess().getDisjointClassExpressionsClassExpressionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_disjointClassExpressions_5_0=ruleClassExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDisjointUnionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"disjointClassExpressions",
            	    						lv_disjointClassExpressions_5_0,
            	    						"org.omg.sysml.owl.Owl.ClassExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDisjointUnionAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisjointUnion"


    // $ANTLR start "entryRuleObjectPropertyAxiom"
    // InternalOwl.g:3649:1: entryRuleObjectPropertyAxiom returns [EObject current=null] : iv_ruleObjectPropertyAxiom= ruleObjectPropertyAxiom EOF ;
    public final EObject entryRuleObjectPropertyAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectPropertyAxiom = null;


        try {
            // InternalOwl.g:3649:60: (iv_ruleObjectPropertyAxiom= ruleObjectPropertyAxiom EOF )
            // InternalOwl.g:3650:2: iv_ruleObjectPropertyAxiom= ruleObjectPropertyAxiom EOF
            {
             newCompositeNode(grammarAccess.getObjectPropertyAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectPropertyAxiom=ruleObjectPropertyAxiom();

            state._fsp--;

             current =iv_ruleObjectPropertyAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectPropertyAxiom"


    // $ANTLR start "ruleObjectPropertyAxiom"
    // InternalOwl.g:3656:1: ruleObjectPropertyAxiom returns [EObject current=null] : (this_SubObjectPropertyOf_0= ruleSubObjectPropertyOf | this_EquivalentObjectProperties_1= ruleEquivalentObjectProperties | this_DisjointObjectProperties_2= ruleDisjointObjectProperties | this_InverseObjectProperties_3= ruleInverseObjectProperties | this_ObjectPropertyDomain_4= ruleObjectPropertyDomain | this_ObjectPropertyRange_5= ruleObjectPropertyRange | this_FunctionalObjectProperty_6= ruleFunctionalObjectProperty | this_InverseFunctionalObjectProperty_7= ruleInverseFunctionalObjectProperty | this_ReflexiveObjectProperty_8= ruleReflexiveObjectProperty | this_IrreflexiveObjectProperty_9= ruleIrreflexiveObjectProperty | this_SymmetricObjectProperty_10= ruleSymmetricObjectProperty | this_AsymmetricObjectProperty_11= ruleAsymmetricObjectProperty | this_TransitiveObjectProperty_12= ruleTransitiveObjectProperty ) ;
    public final EObject ruleObjectPropertyAxiom() throws RecognitionException {
        EObject current = null;

        EObject this_SubObjectPropertyOf_0 = null;

        EObject this_EquivalentObjectProperties_1 = null;

        EObject this_DisjointObjectProperties_2 = null;

        EObject this_InverseObjectProperties_3 = null;

        EObject this_ObjectPropertyDomain_4 = null;

        EObject this_ObjectPropertyRange_5 = null;

        EObject this_FunctionalObjectProperty_6 = null;

        EObject this_InverseFunctionalObjectProperty_7 = null;

        EObject this_ReflexiveObjectProperty_8 = null;

        EObject this_IrreflexiveObjectProperty_9 = null;

        EObject this_SymmetricObjectProperty_10 = null;

        EObject this_AsymmetricObjectProperty_11 = null;

        EObject this_TransitiveObjectProperty_12 = null;



        	enterRule();

        try {
            // InternalOwl.g:3662:2: ( (this_SubObjectPropertyOf_0= ruleSubObjectPropertyOf | this_EquivalentObjectProperties_1= ruleEquivalentObjectProperties | this_DisjointObjectProperties_2= ruleDisjointObjectProperties | this_InverseObjectProperties_3= ruleInverseObjectProperties | this_ObjectPropertyDomain_4= ruleObjectPropertyDomain | this_ObjectPropertyRange_5= ruleObjectPropertyRange | this_FunctionalObjectProperty_6= ruleFunctionalObjectProperty | this_InverseFunctionalObjectProperty_7= ruleInverseFunctionalObjectProperty | this_ReflexiveObjectProperty_8= ruleReflexiveObjectProperty | this_IrreflexiveObjectProperty_9= ruleIrreflexiveObjectProperty | this_SymmetricObjectProperty_10= ruleSymmetricObjectProperty | this_AsymmetricObjectProperty_11= ruleAsymmetricObjectProperty | this_TransitiveObjectProperty_12= ruleTransitiveObjectProperty ) )
            // InternalOwl.g:3663:2: (this_SubObjectPropertyOf_0= ruleSubObjectPropertyOf | this_EquivalentObjectProperties_1= ruleEquivalentObjectProperties | this_DisjointObjectProperties_2= ruleDisjointObjectProperties | this_InverseObjectProperties_3= ruleInverseObjectProperties | this_ObjectPropertyDomain_4= ruleObjectPropertyDomain | this_ObjectPropertyRange_5= ruleObjectPropertyRange | this_FunctionalObjectProperty_6= ruleFunctionalObjectProperty | this_InverseFunctionalObjectProperty_7= ruleInverseFunctionalObjectProperty | this_ReflexiveObjectProperty_8= ruleReflexiveObjectProperty | this_IrreflexiveObjectProperty_9= ruleIrreflexiveObjectProperty | this_SymmetricObjectProperty_10= ruleSymmetricObjectProperty | this_AsymmetricObjectProperty_11= ruleAsymmetricObjectProperty | this_TransitiveObjectProperty_12= ruleTransitiveObjectProperty )
            {
            // InternalOwl.g:3663:2: (this_SubObjectPropertyOf_0= ruleSubObjectPropertyOf | this_EquivalentObjectProperties_1= ruleEquivalentObjectProperties | this_DisjointObjectProperties_2= ruleDisjointObjectProperties | this_InverseObjectProperties_3= ruleInverseObjectProperties | this_ObjectPropertyDomain_4= ruleObjectPropertyDomain | this_ObjectPropertyRange_5= ruleObjectPropertyRange | this_FunctionalObjectProperty_6= ruleFunctionalObjectProperty | this_InverseFunctionalObjectProperty_7= ruleInverseFunctionalObjectProperty | this_ReflexiveObjectProperty_8= ruleReflexiveObjectProperty | this_IrreflexiveObjectProperty_9= ruleIrreflexiveObjectProperty | this_SymmetricObjectProperty_10= ruleSymmetricObjectProperty | this_AsymmetricObjectProperty_11= ruleAsymmetricObjectProperty | this_TransitiveObjectProperty_12= ruleTransitiveObjectProperty )
            int alt38=13;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt38=1;
                }
                break;
            case 62:
                {
                alt38=2;
                }
                break;
            case 63:
                {
                alt38=3;
                }
                break;
            case 64:
                {
                alt38=4;
                }
                break;
            case 65:
                {
                alt38=5;
                }
                break;
            case 66:
                {
                alt38=6;
                }
                break;
            case 67:
                {
                alt38=7;
                }
                break;
            case 68:
                {
                alt38=8;
                }
                break;
            case 69:
                {
                alt38=9;
                }
                break;
            case 70:
                {
                alt38=10;
                }
                break;
            case 71:
                {
                alt38=11;
                }
                break;
            case 72:
                {
                alt38=12;
                }
                break;
            case 73:
                {
                alt38=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalOwl.g:3664:3: this_SubObjectPropertyOf_0= ruleSubObjectPropertyOf
                    {

                    			newCompositeNode(grammarAccess.getObjectPropertyAxiomAccess().getSubObjectPropertyOfParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubObjectPropertyOf_0=ruleSubObjectPropertyOf();

                    state._fsp--;


                    			current = this_SubObjectPropertyOf_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOwl.g:3673:3: this_EquivalentObjectProperties_1= ruleEquivalentObjectProperties
                    {

                    			newCompositeNode(grammarAccess.getObjectPropertyAxiomAccess().getEquivalentObjectPropertiesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EquivalentObjectProperties_1=ruleEquivalentObjectProperties();

                    state._fsp--;


                    			current = this_EquivalentObjectProperties_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOwl.g:3682:3: this_DisjointObjectProperties_2= ruleDisjointObjectProperties
                    {

                    			newCompositeNode(grammarAccess.getObjectPropertyAxiomAccess().getDisjointObjectPropertiesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DisjointObjectProperties_2=ruleDisjointObjectProperties();

                    state._fsp--;


                    			current = this_DisjointObjectProperties_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOwl.g:3691:3: this_InverseObjectProperties_3= ruleInverseObjectProperties
                    {

                    			newCompositeNode(grammarAccess.getObjectPropertyAxiomAccess().getInverseObjectPropertiesParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_InverseObjectProperties_3=ruleInverseObjectProperties();

                    state._fsp--;


                    			current = this_InverseObjectProperties_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOwl.g:3700:3: this_ObjectPropertyDomain_4= ruleObjectPropertyDomain
                    {

                    			newCompositeNode(grammarAccess.getObjectPropertyAxiomAccess().getObjectPropertyDomainParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectPropertyDomain_4=ruleObjectPropertyDomain();

                    state._fsp--;


                    			current = this_ObjectPropertyDomain_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOwl.g:3709:3: this_ObjectPropertyRange_5= ruleObjectPropertyRange
                    {

                    			newCompositeNode(grammarAccess.getObjectPropertyAxiomAccess().getObjectPropertyRangeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectPropertyRange_5=ruleObjectPropertyRange();

                    state._fsp--;


                    			current = this_ObjectPropertyRange_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalOwl.g:3718:3: this_FunctionalObjectProperty_6= ruleFunctionalObjectProperty
                    {

                    			newCompositeNode(grammarAccess.getObjectPropertyAxiomAccess().getFunctionalObjectPropertyParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionalObjectProperty_6=ruleFunctionalObjectProperty();

                    state._fsp--;


                    			current = this_FunctionalObjectProperty_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalOwl.g:3727:3: this_InverseFunctionalObjectProperty_7= ruleInverseFunctionalObjectProperty
                    {

                    			newCompositeNode(grammarAccess.getObjectPropertyAxiomAccess().getInverseFunctionalObjectPropertyParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_InverseFunctionalObjectProperty_7=ruleInverseFunctionalObjectProperty();

                    state._fsp--;


                    			current = this_InverseFunctionalObjectProperty_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalOwl.g:3736:3: this_ReflexiveObjectProperty_8= ruleReflexiveObjectProperty
                    {

                    			newCompositeNode(grammarAccess.getObjectPropertyAxiomAccess().getReflexiveObjectPropertyParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReflexiveObjectProperty_8=ruleReflexiveObjectProperty();

                    state._fsp--;


                    			current = this_ReflexiveObjectProperty_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalOwl.g:3745:3: this_IrreflexiveObjectProperty_9= ruleIrreflexiveObjectProperty
                    {

                    			newCompositeNode(grammarAccess.getObjectPropertyAxiomAccess().getIrreflexiveObjectPropertyParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_IrreflexiveObjectProperty_9=ruleIrreflexiveObjectProperty();

                    state._fsp--;


                    			current = this_IrreflexiveObjectProperty_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalOwl.g:3754:3: this_SymmetricObjectProperty_10= ruleSymmetricObjectProperty
                    {

                    			newCompositeNode(grammarAccess.getObjectPropertyAxiomAccess().getSymmetricObjectPropertyParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_SymmetricObjectProperty_10=ruleSymmetricObjectProperty();

                    state._fsp--;


                    			current = this_SymmetricObjectProperty_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalOwl.g:3763:3: this_AsymmetricObjectProperty_11= ruleAsymmetricObjectProperty
                    {

                    			newCompositeNode(grammarAccess.getObjectPropertyAxiomAccess().getAsymmetricObjectPropertyParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_AsymmetricObjectProperty_11=ruleAsymmetricObjectProperty();

                    state._fsp--;


                    			current = this_AsymmetricObjectProperty_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalOwl.g:3772:3: this_TransitiveObjectProperty_12= ruleTransitiveObjectProperty
                    {

                    			newCompositeNode(grammarAccess.getObjectPropertyAxiomAccess().getTransitiveObjectPropertyParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_TransitiveObjectProperty_12=ruleTransitiveObjectProperty();

                    state._fsp--;


                    			current = this_TransitiveObjectProperty_12;
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
    // $ANTLR end "ruleObjectPropertyAxiom"


    // $ANTLR start "entryRuleSubObjectPropertyOf"
    // InternalOwl.g:3784:1: entryRuleSubObjectPropertyOf returns [EObject current=null] : iv_ruleSubObjectPropertyOf= ruleSubObjectPropertyOf EOF ;
    public final EObject entryRuleSubObjectPropertyOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubObjectPropertyOf = null;


        try {
            // InternalOwl.g:3784:60: (iv_ruleSubObjectPropertyOf= ruleSubObjectPropertyOf EOF )
            // InternalOwl.g:3785:2: iv_ruleSubObjectPropertyOf= ruleSubObjectPropertyOf EOF
            {
             newCompositeNode(grammarAccess.getSubObjectPropertyOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubObjectPropertyOf=ruleSubObjectPropertyOf();

            state._fsp--;

             current =iv_ruleSubObjectPropertyOf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubObjectPropertyOf"


    // $ANTLR start "ruleSubObjectPropertyOf"
    // InternalOwl.g:3791:1: ruleSubObjectPropertyOf returns [EObject current=null] : (otherlv_0= 'SubObjectPropertyOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( ( (lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) | (otherlv_4= 'ObjectPropertyChain' otherlv_5= '(' ( (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression ) )+ otherlv_7= ')' ) ) otherlv_8= ')' ) ;
    public final EObject ruleSubObjectPropertyOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_subObjectPropertyExpression_3_0 = null;

        EObject lv_subObjectPropertyExpression_6_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:3797:2: ( (otherlv_0= 'SubObjectPropertyOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( ( (lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) | (otherlv_4= 'ObjectPropertyChain' otherlv_5= '(' ( (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression ) )+ otherlv_7= ')' ) ) otherlv_8= ')' ) )
            // InternalOwl.g:3798:2: (otherlv_0= 'SubObjectPropertyOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( ( (lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) | (otherlv_4= 'ObjectPropertyChain' otherlv_5= '(' ( (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression ) )+ otherlv_7= ')' ) ) otherlv_8= ')' )
            {
            // InternalOwl.g:3798:2: (otherlv_0= 'SubObjectPropertyOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( ( (lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) | (otherlv_4= 'ObjectPropertyChain' otherlv_5= '(' ( (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression ) )+ otherlv_7= ')' ) ) otherlv_8= ')' )
            // InternalOwl.g:3799:3: otherlv_0= 'SubObjectPropertyOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( ( (lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) | (otherlv_4= 'ObjectPropertyChain' otherlv_5= '(' ( (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression ) )+ otherlv_7= ')' ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSubObjectPropertyOfAccess().getSubObjectPropertyOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getSubObjectPropertyOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:3807:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==89) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalOwl.g:3808:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:3808:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:3809:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getSubObjectPropertyOfAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubObjectPropertyOfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // InternalOwl.g:3826:3: ( ( (lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) | (otherlv_4= 'ObjectPropertyChain' otherlv_5= '(' ( (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression ) )+ otherlv_7= ')' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_FULL_IRI && LA41_0<=RULE_PN_LOCAL)||LA41_0==33) ) {
                alt41=1;
            }
            else if ( (LA41_0==61) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalOwl.g:3827:4: ( (lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
                    {
                    // InternalOwl.g:3827:4: ( (lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
                    // InternalOwl.g:3828:5: (lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression )
                    {
                    // InternalOwl.g:3828:5: (lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression )
                    // InternalOwl.g:3829:6: lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression
                    {

                    						newCompositeNode(grammarAccess.getSubObjectPropertyOfAccess().getSubObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_subObjectPropertyExpression_3_0=ruleObjectPropertyExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubObjectPropertyOfRule());
                    						}
                    						add(
                    							current,
                    							"subObjectPropertyExpression",
                    							lv_subObjectPropertyExpression_3_0,
                    							"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOwl.g:3847:4: (otherlv_4= 'ObjectPropertyChain' otherlv_5= '(' ( (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression ) )+ otherlv_7= ')' )
                    {
                    // InternalOwl.g:3847:4: (otherlv_4= 'ObjectPropertyChain' otherlv_5= '(' ( (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression ) )+ otherlv_7= ')' )
                    // InternalOwl.g:3848:5: otherlv_4= 'ObjectPropertyChain' otherlv_5= '(' ( (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression ) )+ otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,61,FOLLOW_4); 

                    					newLeafNode(otherlv_4, grammarAccess.getSubObjectPropertyOfAccess().getObjectPropertyChainKeyword_3_1_0());
                    				
                    otherlv_5=(Token)match(input,20,FOLLOW_25); 

                    					newLeafNode(otherlv_5, grammarAccess.getSubObjectPropertyOfAccess().getLeftParenthesisKeyword_3_1_1());
                    				
                    // InternalOwl.g:3856:5: ( (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression ) )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( ((LA40_0>=RULE_FULL_IRI && LA40_0<=RULE_PN_LOCAL)||LA40_0==33) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalOwl.g:3857:6: (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression )
                    	    {
                    	    // InternalOwl.g:3857:6: (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression )
                    	    // InternalOwl.g:3858:7: lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSubObjectPropertyOfAccess().getSubObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_subObjectPropertyExpression_6_0=ruleObjectPropertyExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSubObjectPropertyOfRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subObjectPropertyExpression",
                    	    								lv_subObjectPropertyExpression_6_0,
                    	    								"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt40 >= 1 ) break loop40;
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
                    } while (true);

                    otherlv_7=(Token)match(input,22,FOLLOW_8); 

                    					newLeafNode(otherlv_7, grammarAccess.getSubObjectPropertyOfAccess().getRightParenthesisKeyword_3_1_3());
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSubObjectPropertyOfAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubObjectPropertyOf"


    // $ANTLR start "entryRuleEquivalentObjectProperties"
    // InternalOwl.g:3889:1: entryRuleEquivalentObjectProperties returns [EObject current=null] : iv_ruleEquivalentObjectProperties= ruleEquivalentObjectProperties EOF ;
    public final EObject entryRuleEquivalentObjectProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquivalentObjectProperties = null;


        try {
            // InternalOwl.g:3889:67: (iv_ruleEquivalentObjectProperties= ruleEquivalentObjectProperties EOF )
            // InternalOwl.g:3890:2: iv_ruleEquivalentObjectProperties= ruleEquivalentObjectProperties EOF
            {
             newCompositeNode(grammarAccess.getEquivalentObjectPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquivalentObjectProperties=ruleEquivalentObjectProperties();

            state._fsp--;

             current =iv_ruleEquivalentObjectProperties; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquivalentObjectProperties"


    // $ANTLR start "ruleEquivalentObjectProperties"
    // InternalOwl.g:3896:1: ruleEquivalentObjectProperties returns [EObject current=null] : (otherlv_0= 'EquivalentObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+ otherlv_5= ')' ) ;
    public final EObject ruleEquivalentObjectProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpressions_3_0 = null;

        EObject lv_objectPropertyExpressions_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:3902:2: ( (otherlv_0= 'EquivalentObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+ otherlv_5= ')' ) )
            // InternalOwl.g:3903:2: (otherlv_0= 'EquivalentObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+ otherlv_5= ')' )
            {
            // InternalOwl.g:3903:2: (otherlv_0= 'EquivalentObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+ otherlv_5= ')' )
            // InternalOwl.g:3904:3: otherlv_0= 'EquivalentObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEquivalentObjectPropertiesAccess().getEquivalentObjectPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getEquivalentObjectPropertiesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:3912:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==89) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalOwl.g:3913:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:3913:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:3914:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getEquivalentObjectPropertiesAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEquivalentObjectPropertiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // InternalOwl.g:3931:3: ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:3932:4: (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:3932:4: (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:3933:5: lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getEquivalentObjectPropertiesAccess().getObjectPropertyExpressionsObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_objectPropertyExpressions_3_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEquivalentObjectPropertiesRule());
            					}
            					add(
            						current,
            						"objectPropertyExpressions",
            						lv_objectPropertyExpressions_3_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:3950:3: ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_FULL_IRI && LA43_0<=RULE_PN_LOCAL)||LA43_0==33) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalOwl.g:3951:4: (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression )
            	    {
            	    // InternalOwl.g:3951:4: (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression )
            	    // InternalOwl.g:3952:5: lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression
            	    {

            	    					newCompositeNode(grammarAccess.getEquivalentObjectPropertiesAccess().getObjectPropertyExpressionsObjectPropertyExpressionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_objectPropertyExpressions_4_0=ruleObjectPropertyExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEquivalentObjectPropertiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"objectPropertyExpressions",
            	    						lv_objectPropertyExpressions_4_0,
            	    						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEquivalentObjectPropertiesAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquivalentObjectProperties"


    // $ANTLR start "entryRuleDisjointObjectProperties"
    // InternalOwl.g:3977:1: entryRuleDisjointObjectProperties returns [EObject current=null] : iv_ruleDisjointObjectProperties= ruleDisjointObjectProperties EOF ;
    public final EObject entryRuleDisjointObjectProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjointObjectProperties = null;


        try {
            // InternalOwl.g:3977:65: (iv_ruleDisjointObjectProperties= ruleDisjointObjectProperties EOF )
            // InternalOwl.g:3978:2: iv_ruleDisjointObjectProperties= ruleDisjointObjectProperties EOF
            {
             newCompositeNode(grammarAccess.getDisjointObjectPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisjointObjectProperties=ruleDisjointObjectProperties();

            state._fsp--;

             current =iv_ruleDisjointObjectProperties; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisjointObjectProperties"


    // $ANTLR start "ruleDisjointObjectProperties"
    // InternalOwl.g:3984:1: ruleDisjointObjectProperties returns [EObject current=null] : (otherlv_0= 'DisjointObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+ otherlv_5= ')' ) ;
    public final EObject ruleDisjointObjectProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpressions_3_0 = null;

        EObject lv_objectPropertyExpressions_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:3990:2: ( (otherlv_0= 'DisjointObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+ otherlv_5= ')' ) )
            // InternalOwl.g:3991:2: (otherlv_0= 'DisjointObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+ otherlv_5= ')' )
            {
            // InternalOwl.g:3991:2: (otherlv_0= 'DisjointObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+ otherlv_5= ')' )
            // InternalOwl.g:3992:3: otherlv_0= 'DisjointObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDisjointObjectPropertiesAccess().getDisjointObjectPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getDisjointObjectPropertiesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4000:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==89) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalOwl.g:4001:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4001:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4002:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getDisjointObjectPropertiesAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDisjointObjectPropertiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // InternalOwl.g:4019:3: ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4020:4: (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4020:4: (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4021:5: lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getDisjointObjectPropertiesAccess().getObjectPropertyExpressionsObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_objectPropertyExpressions_3_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDisjointObjectPropertiesRule());
            					}
            					add(
            						current,
            						"objectPropertyExpressions",
            						lv_objectPropertyExpressions_3_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:4038:3: ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_FULL_IRI && LA45_0<=RULE_PN_LOCAL)||LA45_0==33) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalOwl.g:4039:4: (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression )
            	    {
            	    // InternalOwl.g:4039:4: (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression )
            	    // InternalOwl.g:4040:5: lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression
            	    {

            	    					newCompositeNode(grammarAccess.getDisjointObjectPropertiesAccess().getObjectPropertyExpressionsObjectPropertyExpressionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_objectPropertyExpressions_4_0=ruleObjectPropertyExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDisjointObjectPropertiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"objectPropertyExpressions",
            	    						lv_objectPropertyExpressions_4_0,
            	    						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDisjointObjectPropertiesAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisjointObjectProperties"


    // $ANTLR start "entryRuleInverseObjectProperties"
    // InternalOwl.g:4065:1: entryRuleInverseObjectProperties returns [EObject current=null] : iv_ruleInverseObjectProperties= ruleInverseObjectProperties EOF ;
    public final EObject entryRuleInverseObjectProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInverseObjectProperties = null;


        try {
            // InternalOwl.g:4065:64: (iv_ruleInverseObjectProperties= ruleInverseObjectProperties EOF )
            // InternalOwl.g:4066:2: iv_ruleInverseObjectProperties= ruleInverseObjectProperties EOF
            {
             newCompositeNode(grammarAccess.getInverseObjectPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInverseObjectProperties=ruleInverseObjectProperties();

            state._fsp--;

             current =iv_ruleInverseObjectProperties; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInverseObjectProperties"


    // $ANTLR start "ruleInverseObjectProperties"
    // InternalOwl.g:4072:1: ruleInverseObjectProperties returns [EObject current=null] : (otherlv_0= 'InverseObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression1_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpression2_4_0= ruleObjectPropertyExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleInverseObjectProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression1_3_0 = null;

        EObject lv_objectPropertyExpression2_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:4078:2: ( (otherlv_0= 'InverseObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression1_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpression2_4_0= ruleObjectPropertyExpression ) ) otherlv_5= ')' ) )
            // InternalOwl.g:4079:2: (otherlv_0= 'InverseObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression1_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpression2_4_0= ruleObjectPropertyExpression ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:4079:2: (otherlv_0= 'InverseObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression1_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpression2_4_0= ruleObjectPropertyExpression ) ) otherlv_5= ')' )
            // InternalOwl.g:4080:3: otherlv_0= 'InverseObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression1_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpression2_4_0= ruleObjectPropertyExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInverseObjectPropertiesAccess().getInverseObjectPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getInverseObjectPropertiesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4088:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==89) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalOwl.g:4089:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4089:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4090:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getInverseObjectPropertiesAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInverseObjectPropertiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // InternalOwl.g:4107:3: ( (lv_objectPropertyExpression1_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4108:4: (lv_objectPropertyExpression1_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4108:4: (lv_objectPropertyExpression1_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4109:5: lv_objectPropertyExpression1_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getInverseObjectPropertiesAccess().getObjectPropertyExpression1ObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_objectPropertyExpression1_3_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInverseObjectPropertiesRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression1",
            						lv_objectPropertyExpression1_3_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:4126:3: ( (lv_objectPropertyExpression2_4_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4127:4: (lv_objectPropertyExpression2_4_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4127:4: (lv_objectPropertyExpression2_4_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4128:5: lv_objectPropertyExpression2_4_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getInverseObjectPropertiesAccess().getObjectPropertyExpression2ObjectPropertyExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_objectPropertyExpression2_4_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInverseObjectPropertiesRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression2",
            						lv_objectPropertyExpression2_4_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInverseObjectPropertiesAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInverseObjectProperties"


    // $ANTLR start "entryRuleObjectPropertyDomain"
    // InternalOwl.g:4153:1: entryRuleObjectPropertyDomain returns [EObject current=null] : iv_ruleObjectPropertyDomain= ruleObjectPropertyDomain EOF ;
    public final EObject entryRuleObjectPropertyDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectPropertyDomain = null;


        try {
            // InternalOwl.g:4153:61: (iv_ruleObjectPropertyDomain= ruleObjectPropertyDomain EOF )
            // InternalOwl.g:4154:2: iv_ruleObjectPropertyDomain= ruleObjectPropertyDomain EOF
            {
             newCompositeNode(grammarAccess.getObjectPropertyDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectPropertyDomain=ruleObjectPropertyDomain();

            state._fsp--;

             current =iv_ruleObjectPropertyDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectPropertyDomain"


    // $ANTLR start "ruleObjectPropertyDomain"
    // InternalOwl.g:4160:1: ruleObjectPropertyDomain returns [EObject current=null] : (otherlv_0= 'ObjectPropertyDomain' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleObjectPropertyDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression_3_0 = null;

        EObject lv_classExpression_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:4166:2: ( (otherlv_0= 'ObjectPropertyDomain' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' ) )
            // InternalOwl.g:4167:2: (otherlv_0= 'ObjectPropertyDomain' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:4167:2: (otherlv_0= 'ObjectPropertyDomain' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' )
            // InternalOwl.g:4168:3: otherlv_0= 'ObjectPropertyDomain' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectPropertyDomainAccess().getObjectPropertyDomainKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectPropertyDomainAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4176:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==89) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalOwl.g:4177:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4177:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4178:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getObjectPropertyDomainAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectPropertyDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // InternalOwl.g:4195:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4196:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4196:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4197:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getObjectPropertyDomainAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_objectPropertyExpression_3_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectPropertyDomainRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression",
            						lv_objectPropertyExpression_3_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:4214:3: ( (lv_classExpression_4_0= ruleClassExpression ) )
            // InternalOwl.g:4215:4: (lv_classExpression_4_0= ruleClassExpression )
            {
            // InternalOwl.g:4215:4: (lv_classExpression_4_0= ruleClassExpression )
            // InternalOwl.g:4216:5: lv_classExpression_4_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getObjectPropertyDomainAccess().getClassExpressionClassExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_classExpression_4_0=ruleClassExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectPropertyDomainRule());
            					}
            					set(
            						current,
            						"classExpression",
            						lv_classExpression_4_0,
            						"org.omg.sysml.owl.Owl.ClassExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getObjectPropertyDomainAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectPropertyDomain"


    // $ANTLR start "entryRuleObjectPropertyRange"
    // InternalOwl.g:4241:1: entryRuleObjectPropertyRange returns [EObject current=null] : iv_ruleObjectPropertyRange= ruleObjectPropertyRange EOF ;
    public final EObject entryRuleObjectPropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectPropertyRange = null;


        try {
            // InternalOwl.g:4241:60: (iv_ruleObjectPropertyRange= ruleObjectPropertyRange EOF )
            // InternalOwl.g:4242:2: iv_ruleObjectPropertyRange= ruleObjectPropertyRange EOF
            {
             newCompositeNode(grammarAccess.getObjectPropertyRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectPropertyRange=ruleObjectPropertyRange();

            state._fsp--;

             current =iv_ruleObjectPropertyRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectPropertyRange"


    // $ANTLR start "ruleObjectPropertyRange"
    // InternalOwl.g:4248:1: ruleObjectPropertyRange returns [EObject current=null] : (otherlv_0= 'ObjectPropertyRange' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleObjectPropertyRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression_3_0 = null;

        EObject lv_classExpression_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:4254:2: ( (otherlv_0= 'ObjectPropertyRange' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' ) )
            // InternalOwl.g:4255:2: (otherlv_0= 'ObjectPropertyRange' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:4255:2: (otherlv_0= 'ObjectPropertyRange' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' )
            // InternalOwl.g:4256:3: otherlv_0= 'ObjectPropertyRange' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectPropertyRangeAccess().getObjectPropertyRangeKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectPropertyRangeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4264:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==89) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalOwl.g:4265:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4265:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4266:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getObjectPropertyRangeAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectPropertyRangeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            // InternalOwl.g:4283:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4284:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4284:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4285:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getObjectPropertyRangeAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_objectPropertyExpression_3_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectPropertyRangeRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression",
            						lv_objectPropertyExpression_3_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:4302:3: ( (lv_classExpression_4_0= ruleClassExpression ) )
            // InternalOwl.g:4303:4: (lv_classExpression_4_0= ruleClassExpression )
            {
            // InternalOwl.g:4303:4: (lv_classExpression_4_0= ruleClassExpression )
            // InternalOwl.g:4304:5: lv_classExpression_4_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getObjectPropertyRangeAccess().getClassExpressionClassExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_classExpression_4_0=ruleClassExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectPropertyRangeRule());
            					}
            					set(
            						current,
            						"classExpression",
            						lv_classExpression_4_0,
            						"org.omg.sysml.owl.Owl.ClassExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getObjectPropertyRangeAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectPropertyRange"


    // $ANTLR start "entryRuleFunctionalObjectProperty"
    // InternalOwl.g:4329:1: entryRuleFunctionalObjectProperty returns [EObject current=null] : iv_ruleFunctionalObjectProperty= ruleFunctionalObjectProperty EOF ;
    public final EObject entryRuleFunctionalObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalObjectProperty = null;


        try {
            // InternalOwl.g:4329:65: (iv_ruleFunctionalObjectProperty= ruleFunctionalObjectProperty EOF )
            // InternalOwl.g:4330:2: iv_ruleFunctionalObjectProperty= ruleFunctionalObjectProperty EOF
            {
             newCompositeNode(grammarAccess.getFunctionalObjectPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionalObjectProperty=ruleFunctionalObjectProperty();

            state._fsp--;

             current =iv_ruleFunctionalObjectProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionalObjectProperty"


    // $ANTLR start "ruleFunctionalObjectProperty"
    // InternalOwl.g:4336:1: ruleFunctionalObjectProperty returns [EObject current=null] : (otherlv_0= 'FunctionalObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleFunctionalObjectProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:4342:2: ( (otherlv_0= 'FunctionalObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) )
            // InternalOwl.g:4343:2: (otherlv_0= 'FunctionalObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:4343:2: (otherlv_0= 'FunctionalObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            // InternalOwl.g:4344:3: otherlv_0= 'FunctionalObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionalObjectPropertyAccess().getFunctionalObjectPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionalObjectPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4352:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==89) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalOwl.g:4353:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4353:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4354:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionalObjectPropertyAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionalObjectPropertyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // InternalOwl.g:4371:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4372:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4372:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4373:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getFunctionalObjectPropertyAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_objectPropertyExpression_3_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalObjectPropertyRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression",
            						lv_objectPropertyExpression_3_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionalObjectPropertyAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionalObjectProperty"


    // $ANTLR start "entryRuleInverseFunctionalObjectProperty"
    // InternalOwl.g:4398:1: entryRuleInverseFunctionalObjectProperty returns [EObject current=null] : iv_ruleInverseFunctionalObjectProperty= ruleInverseFunctionalObjectProperty EOF ;
    public final EObject entryRuleInverseFunctionalObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInverseFunctionalObjectProperty = null;


        try {
            // InternalOwl.g:4398:72: (iv_ruleInverseFunctionalObjectProperty= ruleInverseFunctionalObjectProperty EOF )
            // InternalOwl.g:4399:2: iv_ruleInverseFunctionalObjectProperty= ruleInverseFunctionalObjectProperty EOF
            {
             newCompositeNode(grammarAccess.getInverseFunctionalObjectPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInverseFunctionalObjectProperty=ruleInverseFunctionalObjectProperty();

            state._fsp--;

             current =iv_ruleInverseFunctionalObjectProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInverseFunctionalObjectProperty"


    // $ANTLR start "ruleInverseFunctionalObjectProperty"
    // InternalOwl.g:4405:1: ruleInverseFunctionalObjectProperty returns [EObject current=null] : (otherlv_0= 'InverseFunctionalObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleInverseFunctionalObjectProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:4411:2: ( (otherlv_0= 'InverseFunctionalObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) )
            // InternalOwl.g:4412:2: (otherlv_0= 'InverseFunctionalObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:4412:2: (otherlv_0= 'InverseFunctionalObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            // InternalOwl.g:4413:3: otherlv_0= 'InverseFunctionalObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInverseFunctionalObjectPropertyAccess().getInverseFunctionalObjectPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getInverseFunctionalObjectPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4421:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==89) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalOwl.g:4422:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4422:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4423:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getInverseFunctionalObjectPropertyAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInverseFunctionalObjectPropertyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // InternalOwl.g:4440:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4441:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4441:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4442:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getInverseFunctionalObjectPropertyAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_objectPropertyExpression_3_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInverseFunctionalObjectPropertyRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression",
            						lv_objectPropertyExpression_3_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInverseFunctionalObjectPropertyAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInverseFunctionalObjectProperty"


    // $ANTLR start "entryRuleReflexiveObjectProperty"
    // InternalOwl.g:4467:1: entryRuleReflexiveObjectProperty returns [EObject current=null] : iv_ruleReflexiveObjectProperty= ruleReflexiveObjectProperty EOF ;
    public final EObject entryRuleReflexiveObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReflexiveObjectProperty = null;


        try {
            // InternalOwl.g:4467:64: (iv_ruleReflexiveObjectProperty= ruleReflexiveObjectProperty EOF )
            // InternalOwl.g:4468:2: iv_ruleReflexiveObjectProperty= ruleReflexiveObjectProperty EOF
            {
             newCompositeNode(grammarAccess.getReflexiveObjectPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReflexiveObjectProperty=ruleReflexiveObjectProperty();

            state._fsp--;

             current =iv_ruleReflexiveObjectProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReflexiveObjectProperty"


    // $ANTLR start "ruleReflexiveObjectProperty"
    // InternalOwl.g:4474:1: ruleReflexiveObjectProperty returns [EObject current=null] : (otherlv_0= 'ReflectiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleReflexiveObjectProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:4480:2: ( (otherlv_0= 'ReflectiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) )
            // InternalOwl.g:4481:2: (otherlv_0= 'ReflectiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:4481:2: (otherlv_0= 'ReflectiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            // InternalOwl.g:4482:3: otherlv_0= 'ReflectiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReflexiveObjectPropertyAccess().getReflectiveObjectPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getReflexiveObjectPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4490:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==89) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalOwl.g:4491:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4491:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4492:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getReflexiveObjectPropertyAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getReflexiveObjectPropertyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // InternalOwl.g:4509:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4510:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4510:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4511:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getReflexiveObjectPropertyAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_objectPropertyExpression_3_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReflexiveObjectPropertyRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression",
            						lv_objectPropertyExpression_3_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReflexiveObjectPropertyAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReflexiveObjectProperty"


    // $ANTLR start "entryRuleIrreflexiveObjectProperty"
    // InternalOwl.g:4536:1: entryRuleIrreflexiveObjectProperty returns [EObject current=null] : iv_ruleIrreflexiveObjectProperty= ruleIrreflexiveObjectProperty EOF ;
    public final EObject entryRuleIrreflexiveObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIrreflexiveObjectProperty = null;


        try {
            // InternalOwl.g:4536:66: (iv_ruleIrreflexiveObjectProperty= ruleIrreflexiveObjectProperty EOF )
            // InternalOwl.g:4537:2: iv_ruleIrreflexiveObjectProperty= ruleIrreflexiveObjectProperty EOF
            {
             newCompositeNode(grammarAccess.getIrreflexiveObjectPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIrreflexiveObjectProperty=ruleIrreflexiveObjectProperty();

            state._fsp--;

             current =iv_ruleIrreflexiveObjectProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIrreflexiveObjectProperty"


    // $ANTLR start "ruleIrreflexiveObjectProperty"
    // InternalOwl.g:4543:1: ruleIrreflexiveObjectProperty returns [EObject current=null] : (otherlv_0= 'IrreflectiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleIrreflexiveObjectProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:4549:2: ( (otherlv_0= 'IrreflectiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) )
            // InternalOwl.g:4550:2: (otherlv_0= 'IrreflectiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:4550:2: (otherlv_0= 'IrreflectiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            // InternalOwl.g:4551:3: otherlv_0= 'IrreflectiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIrreflexiveObjectPropertyAccess().getIrreflectiveObjectPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getIrreflexiveObjectPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4559:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==89) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalOwl.g:4560:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4560:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4561:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getIrreflexiveObjectPropertyAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIrreflexiveObjectPropertyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // InternalOwl.g:4578:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4579:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4579:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4580:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getIrreflexiveObjectPropertyAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_objectPropertyExpression_3_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIrreflexiveObjectPropertyRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression",
            						lv_objectPropertyExpression_3_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIrreflexiveObjectPropertyAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIrreflexiveObjectProperty"


    // $ANTLR start "entryRuleSymmetricObjectProperty"
    // InternalOwl.g:4605:1: entryRuleSymmetricObjectProperty returns [EObject current=null] : iv_ruleSymmetricObjectProperty= ruleSymmetricObjectProperty EOF ;
    public final EObject entryRuleSymmetricObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymmetricObjectProperty = null;


        try {
            // InternalOwl.g:4605:64: (iv_ruleSymmetricObjectProperty= ruleSymmetricObjectProperty EOF )
            // InternalOwl.g:4606:2: iv_ruleSymmetricObjectProperty= ruleSymmetricObjectProperty EOF
            {
             newCompositeNode(grammarAccess.getSymmetricObjectPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSymmetricObjectProperty=ruleSymmetricObjectProperty();

            state._fsp--;

             current =iv_ruleSymmetricObjectProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSymmetricObjectProperty"


    // $ANTLR start "ruleSymmetricObjectProperty"
    // InternalOwl.g:4612:1: ruleSymmetricObjectProperty returns [EObject current=null] : (otherlv_0= 'SymmetricObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleSymmetricObjectProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:4618:2: ( (otherlv_0= 'SymmetricObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) )
            // InternalOwl.g:4619:2: (otherlv_0= 'SymmetricObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:4619:2: (otherlv_0= 'SymmetricObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            // InternalOwl.g:4620:3: otherlv_0= 'SymmetricObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSymmetricObjectPropertyAccess().getSymmetricObjectPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getSymmetricObjectPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4628:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==89) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalOwl.g:4629:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4629:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4630:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getSymmetricObjectPropertyAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSymmetricObjectPropertyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // InternalOwl.g:4647:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4648:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4648:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4649:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getSymmetricObjectPropertyAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_objectPropertyExpression_3_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSymmetricObjectPropertyRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression",
            						lv_objectPropertyExpression_3_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSymmetricObjectPropertyAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSymmetricObjectProperty"


    // $ANTLR start "entryRuleAsymmetricObjectProperty"
    // InternalOwl.g:4674:1: entryRuleAsymmetricObjectProperty returns [EObject current=null] : iv_ruleAsymmetricObjectProperty= ruleAsymmetricObjectProperty EOF ;
    public final EObject entryRuleAsymmetricObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsymmetricObjectProperty = null;


        try {
            // InternalOwl.g:4674:65: (iv_ruleAsymmetricObjectProperty= ruleAsymmetricObjectProperty EOF )
            // InternalOwl.g:4675:2: iv_ruleAsymmetricObjectProperty= ruleAsymmetricObjectProperty EOF
            {
             newCompositeNode(grammarAccess.getAsymmetricObjectPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsymmetricObjectProperty=ruleAsymmetricObjectProperty();

            state._fsp--;

             current =iv_ruleAsymmetricObjectProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAsymmetricObjectProperty"


    // $ANTLR start "ruleAsymmetricObjectProperty"
    // InternalOwl.g:4681:1: ruleAsymmetricObjectProperty returns [EObject current=null] : (otherlv_0= 'AsymmetricObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleAsymmetricObjectProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:4687:2: ( (otherlv_0= 'AsymmetricObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) )
            // InternalOwl.g:4688:2: (otherlv_0= 'AsymmetricObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:4688:2: (otherlv_0= 'AsymmetricObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            // InternalOwl.g:4689:3: otherlv_0= 'AsymmetricObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAsymmetricObjectPropertyAccess().getAsymmetricObjectPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getAsymmetricObjectPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4697:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==89) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalOwl.g:4698:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4698:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4699:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getAsymmetricObjectPropertyAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAsymmetricObjectPropertyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // InternalOwl.g:4716:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4717:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4717:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4718:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getAsymmetricObjectPropertyAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_objectPropertyExpression_3_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAsymmetricObjectPropertyRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression",
            						lv_objectPropertyExpression_3_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAsymmetricObjectPropertyAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAsymmetricObjectProperty"


    // $ANTLR start "entryRuleTransitiveObjectProperty"
    // InternalOwl.g:4743:1: entryRuleTransitiveObjectProperty returns [EObject current=null] : iv_ruleTransitiveObjectProperty= ruleTransitiveObjectProperty EOF ;
    public final EObject entryRuleTransitiveObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitiveObjectProperty = null;


        try {
            // InternalOwl.g:4743:65: (iv_ruleTransitiveObjectProperty= ruleTransitiveObjectProperty EOF )
            // InternalOwl.g:4744:2: iv_ruleTransitiveObjectProperty= ruleTransitiveObjectProperty EOF
            {
             newCompositeNode(grammarAccess.getTransitiveObjectPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitiveObjectProperty=ruleTransitiveObjectProperty();

            state._fsp--;

             current =iv_ruleTransitiveObjectProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitiveObjectProperty"


    // $ANTLR start "ruleTransitiveObjectProperty"
    // InternalOwl.g:4750:1: ruleTransitiveObjectProperty returns [EObject current=null] : (otherlv_0= 'TransitiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleTransitiveObjectProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:4756:2: ( (otherlv_0= 'TransitiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) )
            // InternalOwl.g:4757:2: (otherlv_0= 'TransitiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:4757:2: (otherlv_0= 'TransitiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            // InternalOwl.g:4758:3: otherlv_0= 'TransitiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitiveObjectPropertyAccess().getTransitiveObjectPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitiveObjectPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4766:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==89) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalOwl.g:4767:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4767:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4768:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getTransitiveObjectPropertyAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTransitiveObjectPropertyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // InternalOwl.g:4785:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4786:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4786:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4787:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getTransitiveObjectPropertyAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_objectPropertyExpression_3_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitiveObjectPropertyRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression",
            						lv_objectPropertyExpression_3_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitiveObjectPropertyAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitiveObjectProperty"


    // $ANTLR start "entryRuleDataPropertyAxiom"
    // InternalOwl.g:4812:1: entryRuleDataPropertyAxiom returns [EObject current=null] : iv_ruleDataPropertyAxiom= ruleDataPropertyAxiom EOF ;
    public final EObject entryRuleDataPropertyAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPropertyAxiom = null;


        try {
            // InternalOwl.g:4812:58: (iv_ruleDataPropertyAxiom= ruleDataPropertyAxiom EOF )
            // InternalOwl.g:4813:2: iv_ruleDataPropertyAxiom= ruleDataPropertyAxiom EOF
            {
             newCompositeNode(grammarAccess.getDataPropertyAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataPropertyAxiom=ruleDataPropertyAxiom();

            state._fsp--;

             current =iv_ruleDataPropertyAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataPropertyAxiom"


    // $ANTLR start "ruleDataPropertyAxiom"
    // InternalOwl.g:4819:1: ruleDataPropertyAxiom returns [EObject current=null] : (this_SubDataPropertyOf_0= ruleSubDataPropertyOf | this_EquivalentDataProperties_1= ruleEquivalentDataProperties | this_DisjointDataProperties_2= ruleDisjointDataProperties | this_DataPropertyDomain_3= ruleDataPropertyDomain | this_DataPropertyRange_4= ruleDataPropertyRange | this_FunctionalDataProperty_5= ruleFunctionalDataProperty ) ;
    public final EObject ruleDataPropertyAxiom() throws RecognitionException {
        EObject current = null;

        EObject this_SubDataPropertyOf_0 = null;

        EObject this_EquivalentDataProperties_1 = null;

        EObject this_DisjointDataProperties_2 = null;

        EObject this_DataPropertyDomain_3 = null;

        EObject this_DataPropertyRange_4 = null;

        EObject this_FunctionalDataProperty_5 = null;



        	enterRule();

        try {
            // InternalOwl.g:4825:2: ( (this_SubDataPropertyOf_0= ruleSubDataPropertyOf | this_EquivalentDataProperties_1= ruleEquivalentDataProperties | this_DisjointDataProperties_2= ruleDisjointDataProperties | this_DataPropertyDomain_3= ruleDataPropertyDomain | this_DataPropertyRange_4= ruleDataPropertyRange | this_FunctionalDataProperty_5= ruleFunctionalDataProperty ) )
            // InternalOwl.g:4826:2: (this_SubDataPropertyOf_0= ruleSubDataPropertyOf | this_EquivalentDataProperties_1= ruleEquivalentDataProperties | this_DisjointDataProperties_2= ruleDisjointDataProperties | this_DataPropertyDomain_3= ruleDataPropertyDomain | this_DataPropertyRange_4= ruleDataPropertyRange | this_FunctionalDataProperty_5= ruleFunctionalDataProperty )
            {
            // InternalOwl.g:4826:2: (this_SubDataPropertyOf_0= ruleSubDataPropertyOf | this_EquivalentDataProperties_1= ruleEquivalentDataProperties | this_DisjointDataProperties_2= ruleDisjointDataProperties | this_DataPropertyDomain_3= ruleDataPropertyDomain | this_DataPropertyRange_4= ruleDataPropertyRange | this_FunctionalDataProperty_5= ruleFunctionalDataProperty )
            int alt56=6;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt56=1;
                }
                break;
            case 75:
                {
                alt56=2;
                }
                break;
            case 76:
                {
                alt56=3;
                }
                break;
            case 77:
                {
                alt56=4;
                }
                break;
            case 78:
                {
                alt56=5;
                }
                break;
            case 79:
                {
                alt56=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalOwl.g:4827:3: this_SubDataPropertyOf_0= ruleSubDataPropertyOf
                    {

                    			newCompositeNode(grammarAccess.getDataPropertyAxiomAccess().getSubDataPropertyOfParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubDataPropertyOf_0=ruleSubDataPropertyOf();

                    state._fsp--;


                    			current = this_SubDataPropertyOf_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOwl.g:4836:3: this_EquivalentDataProperties_1= ruleEquivalentDataProperties
                    {

                    			newCompositeNode(grammarAccess.getDataPropertyAxiomAccess().getEquivalentDataPropertiesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EquivalentDataProperties_1=ruleEquivalentDataProperties();

                    state._fsp--;


                    			current = this_EquivalentDataProperties_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOwl.g:4845:3: this_DisjointDataProperties_2= ruleDisjointDataProperties
                    {

                    			newCompositeNode(grammarAccess.getDataPropertyAxiomAccess().getDisjointDataPropertiesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DisjointDataProperties_2=ruleDisjointDataProperties();

                    state._fsp--;


                    			current = this_DisjointDataProperties_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOwl.g:4854:3: this_DataPropertyDomain_3= ruleDataPropertyDomain
                    {

                    			newCompositeNode(grammarAccess.getDataPropertyAxiomAccess().getDataPropertyDomainParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataPropertyDomain_3=ruleDataPropertyDomain();

                    state._fsp--;


                    			current = this_DataPropertyDomain_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOwl.g:4863:3: this_DataPropertyRange_4= ruleDataPropertyRange
                    {

                    			newCompositeNode(grammarAccess.getDataPropertyAxiomAccess().getDataPropertyRangeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataPropertyRange_4=ruleDataPropertyRange();

                    state._fsp--;


                    			current = this_DataPropertyRange_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOwl.g:4872:3: this_FunctionalDataProperty_5= ruleFunctionalDataProperty
                    {

                    			newCompositeNode(grammarAccess.getDataPropertyAxiomAccess().getFunctionalDataPropertyParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionalDataProperty_5=ruleFunctionalDataProperty();

                    state._fsp--;


                    			current = this_FunctionalDataProperty_5;
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
    // $ANTLR end "ruleDataPropertyAxiom"


    // $ANTLR start "entryRuleSubDataPropertyOf"
    // InternalOwl.g:4884:1: entryRuleSubDataPropertyOf returns [EObject current=null] : iv_ruleSubDataPropertyOf= ruleSubDataPropertyOf EOF ;
    public final EObject entryRuleSubDataPropertyOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubDataPropertyOf = null;


        try {
            // InternalOwl.g:4884:58: (iv_ruleSubDataPropertyOf= ruleSubDataPropertyOf EOF )
            // InternalOwl.g:4885:2: iv_ruleSubDataPropertyOf= ruleSubDataPropertyOf EOF
            {
             newCompositeNode(grammarAccess.getSubDataPropertyOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubDataPropertyOf=ruleSubDataPropertyOf();

            state._fsp--;

             current =iv_ruleSubDataPropertyOf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubDataPropertyOf"


    // $ANTLR start "ruleSubDataPropertyOf"
    // InternalOwl.g:4891:1: ruleSubDataPropertyOf returns [EObject current=null] : (otherlv_0= 'SubDataPropertyOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_subDataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_superDataPropertyExpression_4_0= ruleDataPropertyExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleSubDataPropertyOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_subDataPropertyExpression_3_0 = null;

        EObject lv_superDataPropertyExpression_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:4897:2: ( (otherlv_0= 'SubDataPropertyOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_subDataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_superDataPropertyExpression_4_0= ruleDataPropertyExpression ) ) otherlv_5= ')' ) )
            // InternalOwl.g:4898:2: (otherlv_0= 'SubDataPropertyOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_subDataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_superDataPropertyExpression_4_0= ruleDataPropertyExpression ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:4898:2: (otherlv_0= 'SubDataPropertyOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_subDataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_superDataPropertyExpression_4_0= ruleDataPropertyExpression ) ) otherlv_5= ')' )
            // InternalOwl.g:4899:3: otherlv_0= 'SubDataPropertyOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_subDataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_superDataPropertyExpression_4_0= ruleDataPropertyExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSubDataPropertyOfAccess().getSubDataPropertyOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getSubDataPropertyOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4907:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==89) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalOwl.g:4908:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4908:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4909:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getSubDataPropertyOfAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubDataPropertyOfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // InternalOwl.g:4926:3: ( (lv_subDataPropertyExpression_3_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:4927:4: (lv_subDataPropertyExpression_3_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:4927:4: (lv_subDataPropertyExpression_3_0= ruleDataPropertyExpression )
            // InternalOwl.g:4928:5: lv_subDataPropertyExpression_3_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getSubDataPropertyOfAccess().getSubDataPropertyExpressionDataPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_subDataPropertyExpression_3_0=ruleDataPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubDataPropertyOfRule());
            					}
            					set(
            						current,
            						"subDataPropertyExpression",
            						lv_subDataPropertyExpression_3_0,
            						"org.omg.sysml.owl.Owl.DataPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:4945:3: ( (lv_superDataPropertyExpression_4_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:4946:4: (lv_superDataPropertyExpression_4_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:4946:4: (lv_superDataPropertyExpression_4_0= ruleDataPropertyExpression )
            // InternalOwl.g:4947:5: lv_superDataPropertyExpression_4_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getSubDataPropertyOfAccess().getSuperDataPropertyExpressionDataPropertyExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_superDataPropertyExpression_4_0=ruleDataPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubDataPropertyOfRule());
            					}
            					set(
            						current,
            						"superDataPropertyExpression",
            						lv_superDataPropertyExpression_4_0,
            						"org.omg.sysml.owl.Owl.DataPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSubDataPropertyOfAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubDataPropertyOf"


    // $ANTLR start "entryRuleEquivalentDataProperties"
    // InternalOwl.g:4972:1: entryRuleEquivalentDataProperties returns [EObject current=null] : iv_ruleEquivalentDataProperties= ruleEquivalentDataProperties EOF ;
    public final EObject entryRuleEquivalentDataProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquivalentDataProperties = null;


        try {
            // InternalOwl.g:4972:65: (iv_ruleEquivalentDataProperties= ruleEquivalentDataProperties EOF )
            // InternalOwl.g:4973:2: iv_ruleEquivalentDataProperties= ruleEquivalentDataProperties EOF
            {
             newCompositeNode(grammarAccess.getEquivalentDataPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquivalentDataProperties=ruleEquivalentDataProperties();

            state._fsp--;

             current =iv_ruleEquivalentDataProperties; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquivalentDataProperties"


    // $ANTLR start "ruleEquivalentDataProperties"
    // InternalOwl.g:4979:1: ruleEquivalentDataProperties returns [EObject current=null] : (otherlv_0= 'EquivalentDataProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+ otherlv_5= ')' ) ;
    public final EObject ruleEquivalentDataProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_dataPropertyExpressions_3_0 = null;

        EObject lv_dataPropertyExpressions_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:4985:2: ( (otherlv_0= 'EquivalentDataProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+ otherlv_5= ')' ) )
            // InternalOwl.g:4986:2: (otherlv_0= 'EquivalentDataProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+ otherlv_5= ')' )
            {
            // InternalOwl.g:4986:2: (otherlv_0= 'EquivalentDataProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+ otherlv_5= ')' )
            // InternalOwl.g:4987:3: otherlv_0= 'EquivalentDataProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEquivalentDataPropertiesAccess().getEquivalentDataPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getEquivalentDataPropertiesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4995:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==89) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalOwl.g:4996:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4996:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4997:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getEquivalentDataPropertiesAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEquivalentDataPropertiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            // InternalOwl.g:5014:3: ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:5015:4: (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:5015:4: (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression )
            // InternalOwl.g:5016:5: lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getEquivalentDataPropertiesAccess().getDataPropertyExpressionsDataPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_dataPropertyExpressions_3_0=ruleDataPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEquivalentDataPropertiesRule());
            					}
            					add(
            						current,
            						"dataPropertyExpressions",
            						lv_dataPropertyExpressions_3_0,
            						"org.omg.sysml.owl.Owl.DataPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:5033:3: ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=RULE_FULL_IRI && LA59_0<=RULE_PN_LOCAL)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalOwl.g:5034:4: (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression )
            	    {
            	    // InternalOwl.g:5034:4: (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression )
            	    // InternalOwl.g:5035:5: lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression
            	    {

            	    					newCompositeNode(grammarAccess.getEquivalentDataPropertiesAccess().getDataPropertyExpressionsDataPropertyExpressionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_dataPropertyExpressions_4_0=ruleDataPropertyExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEquivalentDataPropertiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataPropertyExpressions",
            	    						lv_dataPropertyExpressions_4_0,
            	    						"org.omg.sysml.owl.Owl.DataPropertyExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEquivalentDataPropertiesAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquivalentDataProperties"


    // $ANTLR start "entryRuleDisjointDataProperties"
    // InternalOwl.g:5060:1: entryRuleDisjointDataProperties returns [EObject current=null] : iv_ruleDisjointDataProperties= ruleDisjointDataProperties EOF ;
    public final EObject entryRuleDisjointDataProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjointDataProperties = null;


        try {
            // InternalOwl.g:5060:63: (iv_ruleDisjointDataProperties= ruleDisjointDataProperties EOF )
            // InternalOwl.g:5061:2: iv_ruleDisjointDataProperties= ruleDisjointDataProperties EOF
            {
             newCompositeNode(grammarAccess.getDisjointDataPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisjointDataProperties=ruleDisjointDataProperties();

            state._fsp--;

             current =iv_ruleDisjointDataProperties; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisjointDataProperties"


    // $ANTLR start "ruleDisjointDataProperties"
    // InternalOwl.g:5067:1: ruleDisjointDataProperties returns [EObject current=null] : (otherlv_0= 'DisjointDataProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+ otherlv_5= ')' ) ;
    public final EObject ruleDisjointDataProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_dataPropertyExpressions_3_0 = null;

        EObject lv_dataPropertyExpressions_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:5073:2: ( (otherlv_0= 'DisjointDataProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+ otherlv_5= ')' ) )
            // InternalOwl.g:5074:2: (otherlv_0= 'DisjointDataProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+ otherlv_5= ')' )
            {
            // InternalOwl.g:5074:2: (otherlv_0= 'DisjointDataProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+ otherlv_5= ')' )
            // InternalOwl.g:5075:3: otherlv_0= 'DisjointDataProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDisjointDataPropertiesAccess().getDisjointDataPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getDisjointDataPropertiesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:5083:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==89) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalOwl.g:5084:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:5084:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:5085:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getDisjointDataPropertiesAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDisjointDataPropertiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            // InternalOwl.g:5102:3: ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:5103:4: (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:5103:4: (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression )
            // InternalOwl.g:5104:5: lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getDisjointDataPropertiesAccess().getDataPropertyExpressionsDataPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_dataPropertyExpressions_3_0=ruleDataPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDisjointDataPropertiesRule());
            					}
            					add(
            						current,
            						"dataPropertyExpressions",
            						lv_dataPropertyExpressions_3_0,
            						"org.omg.sysml.owl.Owl.DataPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:5121:3: ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=RULE_FULL_IRI && LA61_0<=RULE_PN_LOCAL)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalOwl.g:5122:4: (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression )
            	    {
            	    // InternalOwl.g:5122:4: (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression )
            	    // InternalOwl.g:5123:5: lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression
            	    {

            	    					newCompositeNode(grammarAccess.getDisjointDataPropertiesAccess().getDataPropertyExpressionsDataPropertyExpressionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_dataPropertyExpressions_4_0=ruleDataPropertyExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDisjointDataPropertiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataPropertyExpressions",
            	    						lv_dataPropertyExpressions_4_0,
            	    						"org.omg.sysml.owl.Owl.DataPropertyExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDisjointDataPropertiesAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisjointDataProperties"


    // $ANTLR start "entryRuleDataPropertyDomain"
    // InternalOwl.g:5148:1: entryRuleDataPropertyDomain returns [EObject current=null] : iv_ruleDataPropertyDomain= ruleDataPropertyDomain EOF ;
    public final EObject entryRuleDataPropertyDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPropertyDomain = null;


        try {
            // InternalOwl.g:5148:59: (iv_ruleDataPropertyDomain= ruleDataPropertyDomain EOF )
            // InternalOwl.g:5149:2: iv_ruleDataPropertyDomain= ruleDataPropertyDomain EOF
            {
             newCompositeNode(grammarAccess.getDataPropertyDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataPropertyDomain=ruleDataPropertyDomain();

            state._fsp--;

             current =iv_ruleDataPropertyDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataPropertyDomain"


    // $ANTLR start "ruleDataPropertyDomain"
    // InternalOwl.g:5155:1: ruleDataPropertyDomain returns [EObject current=null] : (otherlv_0= 'DataPropertyDomain' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleDataPropertyDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_dataPropertyExpressions_3_0 = null;

        EObject lv_classExpression_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:5161:2: ( (otherlv_0= 'DataPropertyDomain' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' ) )
            // InternalOwl.g:5162:2: (otherlv_0= 'DataPropertyDomain' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:5162:2: (otherlv_0= 'DataPropertyDomain' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' )
            // InternalOwl.g:5163:3: otherlv_0= 'DataPropertyDomain' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataPropertyDomainAccess().getDataPropertyDomainKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getDataPropertyDomainAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:5171:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==89) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalOwl.g:5172:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:5172:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:5173:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getDataPropertyDomainAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataPropertyDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            // InternalOwl.g:5190:3: ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:5191:4: (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:5191:4: (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression )
            // InternalOwl.g:5192:5: lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getDataPropertyDomainAccess().getDataPropertyExpressionsDataPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_dataPropertyExpressions_3_0=ruleDataPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataPropertyDomainRule());
            					}
            					add(
            						current,
            						"dataPropertyExpressions",
            						lv_dataPropertyExpressions_3_0,
            						"org.omg.sysml.owl.Owl.DataPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:5209:3: ( (lv_classExpression_4_0= ruleClassExpression ) )
            // InternalOwl.g:5210:4: (lv_classExpression_4_0= ruleClassExpression )
            {
            // InternalOwl.g:5210:4: (lv_classExpression_4_0= ruleClassExpression )
            // InternalOwl.g:5211:5: lv_classExpression_4_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getDataPropertyDomainAccess().getClassExpressionClassExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_classExpression_4_0=ruleClassExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataPropertyDomainRule());
            					}
            					set(
            						current,
            						"classExpression",
            						lv_classExpression_4_0,
            						"org.omg.sysml.owl.Owl.ClassExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDataPropertyDomainAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataPropertyDomain"


    // $ANTLR start "entryRuleDataPropertyRange"
    // InternalOwl.g:5236:1: entryRuleDataPropertyRange returns [EObject current=null] : iv_ruleDataPropertyRange= ruleDataPropertyRange EOF ;
    public final EObject entryRuleDataPropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPropertyRange = null;


        try {
            // InternalOwl.g:5236:58: (iv_ruleDataPropertyRange= ruleDataPropertyRange EOF )
            // InternalOwl.g:5237:2: iv_ruleDataPropertyRange= ruleDataPropertyRange EOF
            {
             newCompositeNode(grammarAccess.getDataPropertyRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataPropertyRange=ruleDataPropertyRange();

            state._fsp--;

             current =iv_ruleDataPropertyRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataPropertyRange"


    // $ANTLR start "ruleDataPropertyRange"
    // InternalOwl.g:5243:1: ruleDataPropertyRange returns [EObject current=null] : (otherlv_0= 'DataPropertyRange' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleDataPropertyRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_dataPropertyExpressions_3_0 = null;

        EObject lv_classExpression_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:5249:2: ( (otherlv_0= 'DataPropertyRange' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' ) )
            // InternalOwl.g:5250:2: (otherlv_0= 'DataPropertyRange' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:5250:2: (otherlv_0= 'DataPropertyRange' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' )
            // InternalOwl.g:5251:3: otherlv_0= 'DataPropertyRange' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataPropertyRangeAccess().getDataPropertyRangeKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getDataPropertyRangeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:5259:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==89) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalOwl.g:5260:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:5260:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:5261:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getDataPropertyRangeAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataPropertyRangeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            // InternalOwl.g:5278:3: ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:5279:4: (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:5279:4: (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression )
            // InternalOwl.g:5280:5: lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getDataPropertyRangeAccess().getDataPropertyExpressionsDataPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_dataPropertyExpressions_3_0=ruleDataPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataPropertyRangeRule());
            					}
            					add(
            						current,
            						"dataPropertyExpressions",
            						lv_dataPropertyExpressions_3_0,
            						"org.omg.sysml.owl.Owl.DataPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:5297:3: ( (lv_classExpression_4_0= ruleClassExpression ) )
            // InternalOwl.g:5298:4: (lv_classExpression_4_0= ruleClassExpression )
            {
            // InternalOwl.g:5298:4: (lv_classExpression_4_0= ruleClassExpression )
            // InternalOwl.g:5299:5: lv_classExpression_4_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getDataPropertyRangeAccess().getClassExpressionClassExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_classExpression_4_0=ruleClassExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataPropertyRangeRule());
            					}
            					set(
            						current,
            						"classExpression",
            						lv_classExpression_4_0,
            						"org.omg.sysml.owl.Owl.ClassExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDataPropertyRangeAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataPropertyRange"


    // $ANTLR start "entryRuleFunctionalDataProperty"
    // InternalOwl.g:5324:1: entryRuleFunctionalDataProperty returns [EObject current=null] : iv_ruleFunctionalDataProperty= ruleFunctionalDataProperty EOF ;
    public final EObject entryRuleFunctionalDataProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalDataProperty = null;


        try {
            // InternalOwl.g:5324:63: (iv_ruleFunctionalDataProperty= ruleFunctionalDataProperty EOF )
            // InternalOwl.g:5325:2: iv_ruleFunctionalDataProperty= ruleFunctionalDataProperty EOF
            {
             newCompositeNode(grammarAccess.getFunctionalDataPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionalDataProperty=ruleFunctionalDataProperty();

            state._fsp--;

             current =iv_ruleFunctionalDataProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionalDataProperty"


    // $ANTLR start "ruleFunctionalDataProperty"
    // InternalOwl.g:5331:1: ruleFunctionalDataProperty returns [EObject current=null] : (otherlv_0= 'FunctionalDataProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleFunctionalDataProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_dataPropertyExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:5337:2: ( (otherlv_0= 'FunctionalDataProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) otherlv_4= ')' ) )
            // InternalOwl.g:5338:2: (otherlv_0= 'FunctionalDataProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:5338:2: (otherlv_0= 'FunctionalDataProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) otherlv_4= ')' )
            // InternalOwl.g:5339:3: otherlv_0= 'FunctionalDataProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionalDataPropertyAccess().getFunctionalDataPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionalDataPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:5347:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==89) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalOwl.g:5348:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:5348:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:5349:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionalDataPropertyAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionalDataPropertyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // InternalOwl.g:5366:3: ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:5367:4: (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:5367:4: (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression )
            // InternalOwl.g:5368:5: lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getFunctionalDataPropertyAccess().getDataPropertyExpressionsDataPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_dataPropertyExpressions_3_0=ruleDataPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionalDataPropertyRule());
            					}
            					add(
            						current,
            						"dataPropertyExpressions",
            						lv_dataPropertyExpressions_3_0,
            						"org.omg.sysml.owl.Owl.DataPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionalDataPropertyAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionalDataProperty"


    // $ANTLR start "entryRuleDatatypeDefinition"
    // InternalOwl.g:5393:1: entryRuleDatatypeDefinition returns [EObject current=null] : iv_ruleDatatypeDefinition= ruleDatatypeDefinition EOF ;
    public final EObject entryRuleDatatypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypeDefinition = null;


        try {
            // InternalOwl.g:5393:59: (iv_ruleDatatypeDefinition= ruleDatatypeDefinition EOF )
            // InternalOwl.g:5394:2: iv_ruleDatatypeDefinition= ruleDatatypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getDatatypeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatatypeDefinition=ruleDatatypeDefinition();

            state._fsp--;

             current =iv_ruleDatatypeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatypeDefinition"


    // $ANTLR start "ruleDatatypeDefinition"
    // InternalOwl.g:5400:1: ruleDatatypeDefinition returns [EObject current=null] : (otherlv_0= 'DatatypeDefinition' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_datatype_3_0= ruleDatatypeReference ) ) ( (lv_dataRange_4_0= ruleDataRange ) ) otherlv_5= ')' ) ;
    public final EObject ruleDatatypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_datatype_3_0 = null;

        EObject lv_dataRange_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:5406:2: ( (otherlv_0= 'DatatypeDefinition' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_datatype_3_0= ruleDatatypeReference ) ) ( (lv_dataRange_4_0= ruleDataRange ) ) otherlv_5= ')' ) )
            // InternalOwl.g:5407:2: (otherlv_0= 'DatatypeDefinition' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_datatype_3_0= ruleDatatypeReference ) ) ( (lv_dataRange_4_0= ruleDataRange ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:5407:2: (otherlv_0= 'DatatypeDefinition' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_datatype_3_0= ruleDatatypeReference ) ) ( (lv_dataRange_4_0= ruleDataRange ) ) otherlv_5= ')' )
            // InternalOwl.g:5408:3: otherlv_0= 'DatatypeDefinition' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_datatype_3_0= ruleDatatypeReference ) ) ( (lv_dataRange_4_0= ruleDataRange ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDatatypeDefinitionAccess().getDatatypeDefinitionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getDatatypeDefinitionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:5416:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==89) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalOwl.g:5417:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:5417:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:5418:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getDatatypeDefinitionAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDatatypeDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            // InternalOwl.g:5435:3: ( (lv_datatype_3_0= ruleDatatypeReference ) )
            // InternalOwl.g:5436:4: (lv_datatype_3_0= ruleDatatypeReference )
            {
            // InternalOwl.g:5436:4: (lv_datatype_3_0= ruleDatatypeReference )
            // InternalOwl.g:5437:5: lv_datatype_3_0= ruleDatatypeReference
            {

            					newCompositeNode(grammarAccess.getDatatypeDefinitionAccess().getDatatypeDatatypeReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_datatype_3_0=ruleDatatypeReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatatypeDefinitionRule());
            					}
            					set(
            						current,
            						"datatype",
            						lv_datatype_3_0,
            						"org.omg.sysml.owl.Owl.DatatypeReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:5454:3: ( (lv_dataRange_4_0= ruleDataRange ) )
            // InternalOwl.g:5455:4: (lv_dataRange_4_0= ruleDataRange )
            {
            // InternalOwl.g:5455:4: (lv_dataRange_4_0= ruleDataRange )
            // InternalOwl.g:5456:5: lv_dataRange_4_0= ruleDataRange
            {

            					newCompositeNode(grammarAccess.getDatatypeDefinitionAccess().getDataRangeDataRangeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_dataRange_4_0=ruleDataRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatatypeDefinitionRule());
            					}
            					set(
            						current,
            						"dataRange",
            						lv_dataRange_4_0,
            						"org.omg.sysml.owl.Owl.DataRange");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDatatypeDefinitionAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatypeDefinition"


    // $ANTLR start "entryRuleHasKey"
    // InternalOwl.g:5481:1: entryRuleHasKey returns [EObject current=null] : iv_ruleHasKey= ruleHasKey EOF ;
    public final EObject entryRuleHasKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasKey = null;


        try {
            // InternalOwl.g:5481:47: (iv_ruleHasKey= ruleHasKey EOF )
            // InternalOwl.g:5482:2: iv_ruleHasKey= ruleHasKey EOF
            {
             newCompositeNode(grammarAccess.getHasKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHasKey=ruleHasKey();

            state._fsp--;

             current =iv_ruleHasKey; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHasKey"


    // $ANTLR start "ruleHasKey"
    // InternalOwl.g:5488:1: ruleHasKey returns [EObject current=null] : (otherlv_0= 'HasKey' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= '(' ( (lv_objectPropertyExpressions_5_0= ruleObjectPropertyExpression ) )* otherlv_6= ')' otherlv_7= '(' ( (lv_dataPropertyExpressions_8_0= ruleDataPropertyExpression ) )* otherlv_9= ')' otherlv_10= ')' ) ;
    public final EObject ruleHasKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_classExpression_3_0 = null;

        EObject lv_objectPropertyExpressions_5_0 = null;

        EObject lv_dataPropertyExpressions_8_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:5494:2: ( (otherlv_0= 'HasKey' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= '(' ( (lv_objectPropertyExpressions_5_0= ruleObjectPropertyExpression ) )* otherlv_6= ')' otherlv_7= '(' ( (lv_dataPropertyExpressions_8_0= ruleDataPropertyExpression ) )* otherlv_9= ')' otherlv_10= ')' ) )
            // InternalOwl.g:5495:2: (otherlv_0= 'HasKey' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= '(' ( (lv_objectPropertyExpressions_5_0= ruleObjectPropertyExpression ) )* otherlv_6= ')' otherlv_7= '(' ( (lv_dataPropertyExpressions_8_0= ruleDataPropertyExpression ) )* otherlv_9= ')' otherlv_10= ')' )
            {
            // InternalOwl.g:5495:2: (otherlv_0= 'HasKey' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= '(' ( (lv_objectPropertyExpressions_5_0= ruleObjectPropertyExpression ) )* otherlv_6= ')' otherlv_7= '(' ( (lv_dataPropertyExpressions_8_0= ruleDataPropertyExpression ) )* otherlv_9= ')' otherlv_10= ')' )
            // InternalOwl.g:5496:3: otherlv_0= 'HasKey' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= '(' ( (lv_objectPropertyExpressions_5_0= ruleObjectPropertyExpression ) )* otherlv_6= ')' otherlv_7= '(' ( (lv_dataPropertyExpressions_8_0= ruleDataPropertyExpression ) )* otherlv_9= ')' otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHasKeyAccess().getHasKeyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getHasKeyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:5504:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==89) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalOwl.g:5505:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:5505:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:5506:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getHasKeyAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHasKeyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            // InternalOwl.g:5523:3: ( (lv_classExpression_3_0= ruleClassExpression ) )
            // InternalOwl.g:5524:4: (lv_classExpression_3_0= ruleClassExpression )
            {
            // InternalOwl.g:5524:4: (lv_classExpression_3_0= ruleClassExpression )
            // InternalOwl.g:5525:5: lv_classExpression_3_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getHasKeyAccess().getClassExpressionClassExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_classExpression_3_0=ruleClassExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHasKeyRule());
            					}
            					set(
            						current,
            						"classExpression",
            						lv_classExpression_3_0,
            						"org.omg.sysml.owl.Owl.ClassExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getHasKeyAccess().getLeftParenthesisKeyword_4());
            		
            // InternalOwl.g:5546:3: ( (lv_objectPropertyExpressions_5_0= ruleObjectPropertyExpression ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=RULE_FULL_IRI && LA67_0<=RULE_PN_LOCAL)||LA67_0==33) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalOwl.g:5547:4: (lv_objectPropertyExpressions_5_0= ruleObjectPropertyExpression )
            	    {
            	    // InternalOwl.g:5547:4: (lv_objectPropertyExpressions_5_0= ruleObjectPropertyExpression )
            	    // InternalOwl.g:5548:5: lv_objectPropertyExpressions_5_0= ruleObjectPropertyExpression
            	    {

            	    					newCompositeNode(grammarAccess.getHasKeyAccess().getObjectPropertyExpressionsObjectPropertyExpressionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_objectPropertyExpressions_5_0=ruleObjectPropertyExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHasKeyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"objectPropertyExpressions",
            	    						lv_objectPropertyExpressions_5_0,
            	    						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_6=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getHasKeyAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getHasKeyAccess().getLeftParenthesisKeyword_7());
            		
            // InternalOwl.g:5573:3: ( (lv_dataPropertyExpressions_8_0= ruleDataPropertyExpression ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( ((LA68_0>=RULE_FULL_IRI && LA68_0<=RULE_PN_LOCAL)) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalOwl.g:5574:4: (lv_dataPropertyExpressions_8_0= ruleDataPropertyExpression )
            	    {
            	    // InternalOwl.g:5574:4: (lv_dataPropertyExpressions_8_0= ruleDataPropertyExpression )
            	    // InternalOwl.g:5575:5: lv_dataPropertyExpressions_8_0= ruleDataPropertyExpression
            	    {

            	    					newCompositeNode(grammarAccess.getHasKeyAccess().getDataPropertyExpressionsDataPropertyExpressionParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_dataPropertyExpressions_8_0=ruleDataPropertyExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHasKeyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataPropertyExpressions",
            	    						lv_dataPropertyExpressions_8_0,
            	    						"org.omg.sysml.owl.Owl.DataPropertyExpression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            otherlv_9=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getHasKeyAccess().getRightParenthesisKeyword_9());
            		
            otherlv_10=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getHasKeyAccess().getRightParenthesisKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHasKey"


    // $ANTLR start "entryRuleAssertion"
    // InternalOwl.g:5604:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalOwl.g:5604:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalOwl.g:5605:2: iv_ruleAssertion= ruleAssertion EOF
            {
             newCompositeNode(grammarAccess.getAssertionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;

             current =iv_ruleAssertion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssertion"


    // $ANTLR start "ruleAssertion"
    // InternalOwl.g:5611:1: ruleAssertion returns [EObject current=null] : (this_SameIndividual_0= ruleSameIndividual | this_DifferentIndividuals_1= ruleDifferentIndividuals | this_ClassAssertion_2= ruleClassAssertion | this_ObjectPropertyAssertion_3= ruleObjectPropertyAssertion | this_NegativeObjectPropertyAssertion_4= ruleNegativeObjectPropertyAssertion | this_DataPropertyAssertion_5= ruleDataPropertyAssertion | this_NegativeDataPropertyAssertion_6= ruleNegativeDataPropertyAssertion ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        EObject this_SameIndividual_0 = null;

        EObject this_DifferentIndividuals_1 = null;

        EObject this_ClassAssertion_2 = null;

        EObject this_ObjectPropertyAssertion_3 = null;

        EObject this_NegativeObjectPropertyAssertion_4 = null;

        EObject this_DataPropertyAssertion_5 = null;

        EObject this_NegativeDataPropertyAssertion_6 = null;



        	enterRule();

        try {
            // InternalOwl.g:5617:2: ( (this_SameIndividual_0= ruleSameIndividual | this_DifferentIndividuals_1= ruleDifferentIndividuals | this_ClassAssertion_2= ruleClassAssertion | this_ObjectPropertyAssertion_3= ruleObjectPropertyAssertion | this_NegativeObjectPropertyAssertion_4= ruleNegativeObjectPropertyAssertion | this_DataPropertyAssertion_5= ruleDataPropertyAssertion | this_NegativeDataPropertyAssertion_6= ruleNegativeDataPropertyAssertion ) )
            // InternalOwl.g:5618:2: (this_SameIndividual_0= ruleSameIndividual | this_DifferentIndividuals_1= ruleDifferentIndividuals | this_ClassAssertion_2= ruleClassAssertion | this_ObjectPropertyAssertion_3= ruleObjectPropertyAssertion | this_NegativeObjectPropertyAssertion_4= ruleNegativeObjectPropertyAssertion | this_DataPropertyAssertion_5= ruleDataPropertyAssertion | this_NegativeDataPropertyAssertion_6= ruleNegativeDataPropertyAssertion )
            {
            // InternalOwl.g:5618:2: (this_SameIndividual_0= ruleSameIndividual | this_DifferentIndividuals_1= ruleDifferentIndividuals | this_ClassAssertion_2= ruleClassAssertion | this_ObjectPropertyAssertion_3= ruleObjectPropertyAssertion | this_NegativeObjectPropertyAssertion_4= ruleNegativeObjectPropertyAssertion | this_DataPropertyAssertion_5= ruleDataPropertyAssertion | this_NegativeDataPropertyAssertion_6= ruleNegativeDataPropertyAssertion )
            int alt69=7;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt69=1;
                }
                break;
            case 83:
                {
                alt69=2;
                }
                break;
            case 84:
                {
                alt69=3;
                }
                break;
            case 85:
                {
                alt69=4;
                }
                break;
            case 86:
                {
                alt69=5;
                }
                break;
            case 87:
                {
                alt69=6;
                }
                break;
            case 88:
                {
                alt69=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalOwl.g:5619:3: this_SameIndividual_0= ruleSameIndividual
                    {

                    			newCompositeNode(grammarAccess.getAssertionAccess().getSameIndividualParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SameIndividual_0=ruleSameIndividual();

                    state._fsp--;


                    			current = this_SameIndividual_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOwl.g:5628:3: this_DifferentIndividuals_1= ruleDifferentIndividuals
                    {

                    			newCompositeNode(grammarAccess.getAssertionAccess().getDifferentIndividualsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DifferentIndividuals_1=ruleDifferentIndividuals();

                    state._fsp--;


                    			current = this_DifferentIndividuals_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOwl.g:5637:3: this_ClassAssertion_2= ruleClassAssertion
                    {

                    			newCompositeNode(grammarAccess.getAssertionAccess().getClassAssertionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassAssertion_2=ruleClassAssertion();

                    state._fsp--;


                    			current = this_ClassAssertion_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOwl.g:5646:3: this_ObjectPropertyAssertion_3= ruleObjectPropertyAssertion
                    {

                    			newCompositeNode(grammarAccess.getAssertionAccess().getObjectPropertyAssertionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectPropertyAssertion_3=ruleObjectPropertyAssertion();

                    state._fsp--;


                    			current = this_ObjectPropertyAssertion_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOwl.g:5655:3: this_NegativeObjectPropertyAssertion_4= ruleNegativeObjectPropertyAssertion
                    {

                    			newCompositeNode(grammarAccess.getAssertionAccess().getNegativeObjectPropertyAssertionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_NegativeObjectPropertyAssertion_4=ruleNegativeObjectPropertyAssertion();

                    state._fsp--;


                    			current = this_NegativeObjectPropertyAssertion_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOwl.g:5664:3: this_DataPropertyAssertion_5= ruleDataPropertyAssertion
                    {

                    			newCompositeNode(grammarAccess.getAssertionAccess().getDataPropertyAssertionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataPropertyAssertion_5=ruleDataPropertyAssertion();

                    state._fsp--;


                    			current = this_DataPropertyAssertion_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalOwl.g:5673:3: this_NegativeDataPropertyAssertion_6= ruleNegativeDataPropertyAssertion
                    {

                    			newCompositeNode(grammarAccess.getAssertionAccess().getNegativeDataPropertyAssertionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_NegativeDataPropertyAssertion_6=ruleNegativeDataPropertyAssertion();

                    state._fsp--;


                    			current = this_NegativeDataPropertyAssertion_6;
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
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "entryRuleSameIndividual"
    // InternalOwl.g:5685:1: entryRuleSameIndividual returns [EObject current=null] : iv_ruleSameIndividual= ruleSameIndividual EOF ;
    public final EObject entryRuleSameIndividual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSameIndividual = null;


        try {
            // InternalOwl.g:5685:55: (iv_ruleSameIndividual= ruleSameIndividual EOF )
            // InternalOwl.g:5686:2: iv_ruleSameIndividual= ruleSameIndividual EOF
            {
             newCompositeNode(grammarAccess.getSameIndividualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSameIndividual=ruleSameIndividual();

            state._fsp--;

             current =iv_ruleSameIndividual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSameIndividual"


    // $ANTLR start "ruleSameIndividual"
    // InternalOwl.g:5692:1: ruleSameIndividual returns [EObject current=null] : (otherlv_0= 'SameIndividual' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_individuals_3_0= ruleIndividualReference ) ) ( (lv_individuals_4_0= ruleIndividualReference ) )+ otherlv_5= ')' ) ;
    public final EObject ruleSameIndividual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_individuals_3_0 = null;

        EObject lv_individuals_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:5698:2: ( (otherlv_0= 'SameIndividual' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_individuals_3_0= ruleIndividualReference ) ) ( (lv_individuals_4_0= ruleIndividualReference ) )+ otherlv_5= ')' ) )
            // InternalOwl.g:5699:2: (otherlv_0= 'SameIndividual' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_individuals_3_0= ruleIndividualReference ) ) ( (lv_individuals_4_0= ruleIndividualReference ) )+ otherlv_5= ')' )
            {
            // InternalOwl.g:5699:2: (otherlv_0= 'SameIndividual' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_individuals_3_0= ruleIndividualReference ) ) ( (lv_individuals_4_0= ruleIndividualReference ) )+ otherlv_5= ')' )
            // InternalOwl.g:5700:3: otherlv_0= 'SameIndividual' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_individuals_3_0= ruleIndividualReference ) ) ( (lv_individuals_4_0= ruleIndividualReference ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSameIndividualAccess().getSameIndividualKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getSameIndividualAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:5708:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==89) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalOwl.g:5709:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:5709:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:5710:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getSameIndividualAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSameIndividualRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            // InternalOwl.g:5727:3: ( (lv_individuals_3_0= ruleIndividualReference ) )
            // InternalOwl.g:5728:4: (lv_individuals_3_0= ruleIndividualReference )
            {
            // InternalOwl.g:5728:4: (lv_individuals_3_0= ruleIndividualReference )
            // InternalOwl.g:5729:5: lv_individuals_3_0= ruleIndividualReference
            {

            					newCompositeNode(grammarAccess.getSameIndividualAccess().getIndividualsIndividualReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_individuals_3_0=ruleIndividualReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSameIndividualRule());
            					}
            					add(
            						current,
            						"individuals",
            						lv_individuals_3_0,
            						"org.omg.sysml.owl.Owl.IndividualReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:5746:3: ( (lv_individuals_4_0= ruleIndividualReference ) )+
            int cnt71=0;
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=RULE_FULL_IRI && LA71_0<=RULE_BLANK_NODE_LABEL)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalOwl.g:5747:4: (lv_individuals_4_0= ruleIndividualReference )
            	    {
            	    // InternalOwl.g:5747:4: (lv_individuals_4_0= ruleIndividualReference )
            	    // InternalOwl.g:5748:5: lv_individuals_4_0= ruleIndividualReference
            	    {

            	    					newCompositeNode(grammarAccess.getSameIndividualAccess().getIndividualsIndividualReferenceParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_individuals_4_0=ruleIndividualReference();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSameIndividualRule());
            	    					}
            	    					add(
            	    						current,
            	    						"individuals",
            	    						lv_individuals_4_0,
            	    						"org.omg.sysml.owl.Owl.IndividualReference");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt71 >= 1 ) break loop71;
                        EarlyExitException eee =
                            new EarlyExitException(71, input);
                        throw eee;
                }
                cnt71++;
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSameIndividualAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSameIndividual"


    // $ANTLR start "entryRuleDifferentIndividuals"
    // InternalOwl.g:5773:1: entryRuleDifferentIndividuals returns [EObject current=null] : iv_ruleDifferentIndividuals= ruleDifferentIndividuals EOF ;
    public final EObject entryRuleDifferentIndividuals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDifferentIndividuals = null;


        try {
            // InternalOwl.g:5773:61: (iv_ruleDifferentIndividuals= ruleDifferentIndividuals EOF )
            // InternalOwl.g:5774:2: iv_ruleDifferentIndividuals= ruleDifferentIndividuals EOF
            {
             newCompositeNode(grammarAccess.getDifferentIndividualsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDifferentIndividuals=ruleDifferentIndividuals();

            state._fsp--;

             current =iv_ruleDifferentIndividuals; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDifferentIndividuals"


    // $ANTLR start "ruleDifferentIndividuals"
    // InternalOwl.g:5780:1: ruleDifferentIndividuals returns [EObject current=null] : (otherlv_0= 'DifferentIndividuals' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_individuals_3_0= ruleIndividualReference ) ) ( (lv_individuals_4_0= ruleIndividualReference ) )+ otherlv_5= ')' ) ;
    public final EObject ruleDifferentIndividuals() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_individuals_3_0 = null;

        EObject lv_individuals_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:5786:2: ( (otherlv_0= 'DifferentIndividuals' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_individuals_3_0= ruleIndividualReference ) ) ( (lv_individuals_4_0= ruleIndividualReference ) )+ otherlv_5= ')' ) )
            // InternalOwl.g:5787:2: (otherlv_0= 'DifferentIndividuals' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_individuals_3_0= ruleIndividualReference ) ) ( (lv_individuals_4_0= ruleIndividualReference ) )+ otherlv_5= ')' )
            {
            // InternalOwl.g:5787:2: (otherlv_0= 'DifferentIndividuals' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_individuals_3_0= ruleIndividualReference ) ) ( (lv_individuals_4_0= ruleIndividualReference ) )+ otherlv_5= ')' )
            // InternalOwl.g:5788:3: otherlv_0= 'DifferentIndividuals' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_individuals_3_0= ruleIndividualReference ) ) ( (lv_individuals_4_0= ruleIndividualReference ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDifferentIndividualsAccess().getDifferentIndividualsKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getDifferentIndividualsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:5796:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==89) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalOwl.g:5797:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:5797:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:5798:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getDifferentIndividualsAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDifferentIndividualsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            // InternalOwl.g:5815:3: ( (lv_individuals_3_0= ruleIndividualReference ) )
            // InternalOwl.g:5816:4: (lv_individuals_3_0= ruleIndividualReference )
            {
            // InternalOwl.g:5816:4: (lv_individuals_3_0= ruleIndividualReference )
            // InternalOwl.g:5817:5: lv_individuals_3_0= ruleIndividualReference
            {

            					newCompositeNode(grammarAccess.getDifferentIndividualsAccess().getIndividualsIndividualReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_individuals_3_0=ruleIndividualReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDifferentIndividualsRule());
            					}
            					add(
            						current,
            						"individuals",
            						lv_individuals_3_0,
            						"org.omg.sysml.owl.Owl.IndividualReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:5834:3: ( (lv_individuals_4_0= ruleIndividualReference ) )+
            int cnt73=0;
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( ((LA73_0>=RULE_FULL_IRI && LA73_0<=RULE_BLANK_NODE_LABEL)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalOwl.g:5835:4: (lv_individuals_4_0= ruleIndividualReference )
            	    {
            	    // InternalOwl.g:5835:4: (lv_individuals_4_0= ruleIndividualReference )
            	    // InternalOwl.g:5836:5: lv_individuals_4_0= ruleIndividualReference
            	    {

            	    					newCompositeNode(grammarAccess.getDifferentIndividualsAccess().getIndividualsIndividualReferenceParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_individuals_4_0=ruleIndividualReference();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDifferentIndividualsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"individuals",
            	    						lv_individuals_4_0,
            	    						"org.omg.sysml.owl.Owl.IndividualReference");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt73 >= 1 ) break loop73;
                        EarlyExitException eee =
                            new EarlyExitException(73, input);
                        throw eee;
                }
                cnt73++;
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDifferentIndividualsAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDifferentIndividuals"


    // $ANTLR start "entryRuleClassAssertion"
    // InternalOwl.g:5861:1: entryRuleClassAssertion returns [EObject current=null] : iv_ruleClassAssertion= ruleClassAssertion EOF ;
    public final EObject entryRuleClassAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassAssertion = null;


        try {
            // InternalOwl.g:5861:55: (iv_ruleClassAssertion= ruleClassAssertion EOF )
            // InternalOwl.g:5862:2: iv_ruleClassAssertion= ruleClassAssertion EOF
            {
             newCompositeNode(grammarAccess.getClassAssertionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassAssertion=ruleClassAssertion();

            state._fsp--;

             current =iv_ruleClassAssertion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassAssertion"


    // $ANTLR start "ruleClassAssertion"
    // InternalOwl.g:5868:1: ruleClassAssertion returns [EObject current=null] : (otherlv_0= 'ClassAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpression_3_0= ruleClassExpression ) ) ( (lv_individual_4_0= ruleIndividualReference ) ) otherlv_5= ')' ) ;
    public final EObject ruleClassAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_classExpression_3_0 = null;

        EObject lv_individual_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:5874:2: ( (otherlv_0= 'ClassAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpression_3_0= ruleClassExpression ) ) ( (lv_individual_4_0= ruleIndividualReference ) ) otherlv_5= ')' ) )
            // InternalOwl.g:5875:2: (otherlv_0= 'ClassAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpression_3_0= ruleClassExpression ) ) ( (lv_individual_4_0= ruleIndividualReference ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:5875:2: (otherlv_0= 'ClassAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpression_3_0= ruleClassExpression ) ) ( (lv_individual_4_0= ruleIndividualReference ) ) otherlv_5= ')' )
            // InternalOwl.g:5876:3: otherlv_0= 'ClassAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpression_3_0= ruleClassExpression ) ) ( (lv_individual_4_0= ruleIndividualReference ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAssertionAccess().getClassAssertionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAssertionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:5884:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==89) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalOwl.g:5885:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:5885:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:5886:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getClassAssertionAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassAssertionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            // InternalOwl.g:5903:3: ( (lv_classExpression_3_0= ruleClassExpression ) )
            // InternalOwl.g:5904:4: (lv_classExpression_3_0= ruleClassExpression )
            {
            // InternalOwl.g:5904:4: (lv_classExpression_3_0= ruleClassExpression )
            // InternalOwl.g:5905:5: lv_classExpression_3_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getClassAssertionAccess().getClassExpressionClassExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_classExpression_3_0=ruleClassExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassAssertionRule());
            					}
            					set(
            						current,
            						"classExpression",
            						lv_classExpression_3_0,
            						"org.omg.sysml.owl.Owl.ClassExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:5922:3: ( (lv_individual_4_0= ruleIndividualReference ) )
            // InternalOwl.g:5923:4: (lv_individual_4_0= ruleIndividualReference )
            {
            // InternalOwl.g:5923:4: (lv_individual_4_0= ruleIndividualReference )
            // InternalOwl.g:5924:5: lv_individual_4_0= ruleIndividualReference
            {

            					newCompositeNode(grammarAccess.getClassAssertionAccess().getIndividualIndividualReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_individual_4_0=ruleIndividualReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassAssertionRule());
            					}
            					set(
            						current,
            						"individual",
            						lv_individual_4_0,
            						"org.omg.sysml.owl.Owl.IndividualReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getClassAssertionAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassAssertion"


    // $ANTLR start "entryRuleObjectPropertyAssertion"
    // InternalOwl.g:5949:1: entryRuleObjectPropertyAssertion returns [EObject current=null] : iv_ruleObjectPropertyAssertion= ruleObjectPropertyAssertion EOF ;
    public final EObject entryRuleObjectPropertyAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectPropertyAssertion = null;


        try {
            // InternalOwl.g:5949:64: (iv_ruleObjectPropertyAssertion= ruleObjectPropertyAssertion EOF )
            // InternalOwl.g:5950:2: iv_ruleObjectPropertyAssertion= ruleObjectPropertyAssertion EOF
            {
             newCompositeNode(grammarAccess.getObjectPropertyAssertionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectPropertyAssertion=ruleObjectPropertyAssertion();

            state._fsp--;

             current =iv_ruleObjectPropertyAssertion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectPropertyAssertion"


    // $ANTLR start "ruleObjectPropertyAssertion"
    // InternalOwl.g:5956:1: ruleObjectPropertyAssertion returns [EObject current=null] : (otherlv_0= 'ObjectPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetIndividual_5_0= ruleIndividualReference ) ) otherlv_6= ')' ) ;
    public final EObject ruleObjectPropertyAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression_3_0 = null;

        EObject lv_sourceIndividual_4_0 = null;

        EObject lv_targetIndividual_5_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:5962:2: ( (otherlv_0= 'ObjectPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetIndividual_5_0= ruleIndividualReference ) ) otherlv_6= ')' ) )
            // InternalOwl.g:5963:2: (otherlv_0= 'ObjectPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetIndividual_5_0= ruleIndividualReference ) ) otherlv_6= ')' )
            {
            // InternalOwl.g:5963:2: (otherlv_0= 'ObjectPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetIndividual_5_0= ruleIndividualReference ) ) otherlv_6= ')' )
            // InternalOwl.g:5964:3: otherlv_0= 'ObjectPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetIndividual_5_0= ruleIndividualReference ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectPropertyAssertionAccess().getObjectPropertyAssertionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectPropertyAssertionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:5972:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==89) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalOwl.g:5973:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:5973:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:5974:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getObjectPropertyAssertionAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectPropertyAssertionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            // InternalOwl.g:5991:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:5992:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:5992:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:5993:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getObjectPropertyAssertionAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_objectPropertyExpression_3_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectPropertyAssertionRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression",
            						lv_objectPropertyExpression_3_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:6010:3: ( (lv_sourceIndividual_4_0= ruleIndividualReference ) )
            // InternalOwl.g:6011:4: (lv_sourceIndividual_4_0= ruleIndividualReference )
            {
            // InternalOwl.g:6011:4: (lv_sourceIndividual_4_0= ruleIndividualReference )
            // InternalOwl.g:6012:5: lv_sourceIndividual_4_0= ruleIndividualReference
            {

            					newCompositeNode(grammarAccess.getObjectPropertyAssertionAccess().getSourceIndividualIndividualReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_sourceIndividual_4_0=ruleIndividualReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectPropertyAssertionRule());
            					}
            					set(
            						current,
            						"sourceIndividual",
            						lv_sourceIndividual_4_0,
            						"org.omg.sysml.owl.Owl.IndividualReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:6029:3: ( (lv_targetIndividual_5_0= ruleIndividualReference ) )
            // InternalOwl.g:6030:4: (lv_targetIndividual_5_0= ruleIndividualReference )
            {
            // InternalOwl.g:6030:4: (lv_targetIndividual_5_0= ruleIndividualReference )
            // InternalOwl.g:6031:5: lv_targetIndividual_5_0= ruleIndividualReference
            {

            					newCompositeNode(grammarAccess.getObjectPropertyAssertionAccess().getTargetIndividualIndividualReferenceParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_targetIndividual_5_0=ruleIndividualReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectPropertyAssertionRule());
            					}
            					set(
            						current,
            						"targetIndividual",
            						lv_targetIndividual_5_0,
            						"org.omg.sysml.owl.Owl.IndividualReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getObjectPropertyAssertionAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectPropertyAssertion"


    // $ANTLR start "entryRuleNegativeObjectPropertyAssertion"
    // InternalOwl.g:6056:1: entryRuleNegativeObjectPropertyAssertion returns [EObject current=null] : iv_ruleNegativeObjectPropertyAssertion= ruleNegativeObjectPropertyAssertion EOF ;
    public final EObject entryRuleNegativeObjectPropertyAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegativeObjectPropertyAssertion = null;


        try {
            // InternalOwl.g:6056:72: (iv_ruleNegativeObjectPropertyAssertion= ruleNegativeObjectPropertyAssertion EOF )
            // InternalOwl.g:6057:2: iv_ruleNegativeObjectPropertyAssertion= ruleNegativeObjectPropertyAssertion EOF
            {
             newCompositeNode(grammarAccess.getNegativeObjectPropertyAssertionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegativeObjectPropertyAssertion=ruleNegativeObjectPropertyAssertion();

            state._fsp--;

             current =iv_ruleNegativeObjectPropertyAssertion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegativeObjectPropertyAssertion"


    // $ANTLR start "ruleNegativeObjectPropertyAssertion"
    // InternalOwl.g:6063:1: ruleNegativeObjectPropertyAssertion returns [EObject current=null] : (otherlv_0= 'NegativeObjectPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetIndividual_5_0= ruleIndividualReference ) ) otherlv_6= ')' ) ;
    public final EObject ruleNegativeObjectPropertyAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression_3_0 = null;

        EObject lv_sourceIndividual_4_0 = null;

        EObject lv_targetIndividual_5_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:6069:2: ( (otherlv_0= 'NegativeObjectPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetIndividual_5_0= ruleIndividualReference ) ) otherlv_6= ')' ) )
            // InternalOwl.g:6070:2: (otherlv_0= 'NegativeObjectPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetIndividual_5_0= ruleIndividualReference ) ) otherlv_6= ')' )
            {
            // InternalOwl.g:6070:2: (otherlv_0= 'NegativeObjectPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetIndividual_5_0= ruleIndividualReference ) ) otherlv_6= ')' )
            // InternalOwl.g:6071:3: otherlv_0= 'NegativeObjectPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetIndividual_5_0= ruleIndividualReference ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNegativeObjectPropertyAssertionAccess().getNegativeObjectPropertyAssertionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getNegativeObjectPropertyAssertionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:6079:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==89) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalOwl.g:6080:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:6080:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:6081:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getNegativeObjectPropertyAssertionAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNegativeObjectPropertyAssertionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            // InternalOwl.g:6098:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:6099:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:6099:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:6100:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getNegativeObjectPropertyAssertionAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_objectPropertyExpression_3_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegativeObjectPropertyAssertionRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression",
            						lv_objectPropertyExpression_3_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:6117:3: ( (lv_sourceIndividual_4_0= ruleIndividualReference ) )
            // InternalOwl.g:6118:4: (lv_sourceIndividual_4_0= ruleIndividualReference )
            {
            // InternalOwl.g:6118:4: (lv_sourceIndividual_4_0= ruleIndividualReference )
            // InternalOwl.g:6119:5: lv_sourceIndividual_4_0= ruleIndividualReference
            {

            					newCompositeNode(grammarAccess.getNegativeObjectPropertyAssertionAccess().getSourceIndividualIndividualReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_sourceIndividual_4_0=ruleIndividualReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegativeObjectPropertyAssertionRule());
            					}
            					set(
            						current,
            						"sourceIndividual",
            						lv_sourceIndividual_4_0,
            						"org.omg.sysml.owl.Owl.IndividualReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:6136:3: ( (lv_targetIndividual_5_0= ruleIndividualReference ) )
            // InternalOwl.g:6137:4: (lv_targetIndividual_5_0= ruleIndividualReference )
            {
            // InternalOwl.g:6137:4: (lv_targetIndividual_5_0= ruleIndividualReference )
            // InternalOwl.g:6138:5: lv_targetIndividual_5_0= ruleIndividualReference
            {

            					newCompositeNode(grammarAccess.getNegativeObjectPropertyAssertionAccess().getTargetIndividualIndividualReferenceParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_targetIndividual_5_0=ruleIndividualReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegativeObjectPropertyAssertionRule());
            					}
            					set(
            						current,
            						"targetIndividual",
            						lv_targetIndividual_5_0,
            						"org.omg.sysml.owl.Owl.IndividualReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getNegativeObjectPropertyAssertionAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegativeObjectPropertyAssertion"


    // $ANTLR start "entryRuleDataPropertyAssertion"
    // InternalOwl.g:6163:1: entryRuleDataPropertyAssertion returns [EObject current=null] : iv_ruleDataPropertyAssertion= ruleDataPropertyAssertion EOF ;
    public final EObject entryRuleDataPropertyAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPropertyAssertion = null;


        try {
            // InternalOwl.g:6163:62: (iv_ruleDataPropertyAssertion= ruleDataPropertyAssertion EOF )
            // InternalOwl.g:6164:2: iv_ruleDataPropertyAssertion= ruleDataPropertyAssertion EOF
            {
             newCompositeNode(grammarAccess.getDataPropertyAssertionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataPropertyAssertion=ruleDataPropertyAssertion();

            state._fsp--;

             current =iv_ruleDataPropertyAssertion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataPropertyAssertion"


    // $ANTLR start "ruleDataPropertyAssertion"
    // InternalOwl.g:6170:1: ruleDataPropertyAssertion returns [EObject current=null] : (otherlv_0= 'DataPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetValue_5_0= ruleLiteral ) ) otherlv_6= ')' ) ;
    public final EObject ruleDataPropertyAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression_3_0 = null;

        EObject lv_sourceIndividual_4_0 = null;

        EObject lv_targetValue_5_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:6176:2: ( (otherlv_0= 'DataPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetValue_5_0= ruleLiteral ) ) otherlv_6= ')' ) )
            // InternalOwl.g:6177:2: (otherlv_0= 'DataPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetValue_5_0= ruleLiteral ) ) otherlv_6= ')' )
            {
            // InternalOwl.g:6177:2: (otherlv_0= 'DataPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetValue_5_0= ruleLiteral ) ) otherlv_6= ')' )
            // InternalOwl.g:6178:3: otherlv_0= 'DataPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetValue_5_0= ruleLiteral ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,87,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataPropertyAssertionAccess().getDataPropertyAssertionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getDataPropertyAssertionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:6186:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==89) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalOwl.g:6187:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:6187:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:6188:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getDataPropertyAssertionAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataPropertyAssertionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            // InternalOwl.g:6205:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:6206:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:6206:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:6207:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getDataPropertyAssertionAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_objectPropertyExpression_3_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataPropertyAssertionRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression",
            						lv_objectPropertyExpression_3_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:6224:3: ( (lv_sourceIndividual_4_0= ruleIndividualReference ) )
            // InternalOwl.g:6225:4: (lv_sourceIndividual_4_0= ruleIndividualReference )
            {
            // InternalOwl.g:6225:4: (lv_sourceIndividual_4_0= ruleIndividualReference )
            // InternalOwl.g:6226:5: lv_sourceIndividual_4_0= ruleIndividualReference
            {

            					newCompositeNode(grammarAccess.getDataPropertyAssertionAccess().getSourceIndividualIndividualReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_sourceIndividual_4_0=ruleIndividualReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataPropertyAssertionRule());
            					}
            					set(
            						current,
            						"sourceIndividual",
            						lv_sourceIndividual_4_0,
            						"org.omg.sysml.owl.Owl.IndividualReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:6243:3: ( (lv_targetValue_5_0= ruleLiteral ) )
            // InternalOwl.g:6244:4: (lv_targetValue_5_0= ruleLiteral )
            {
            // InternalOwl.g:6244:4: (lv_targetValue_5_0= ruleLiteral )
            // InternalOwl.g:6245:5: lv_targetValue_5_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getDataPropertyAssertionAccess().getTargetValueLiteralParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_targetValue_5_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataPropertyAssertionRule());
            					}
            					set(
            						current,
            						"targetValue",
            						lv_targetValue_5_0,
            						"org.omg.sysml.owl.Owl.Literal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDataPropertyAssertionAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataPropertyAssertion"


    // $ANTLR start "entryRuleNegativeDataPropertyAssertion"
    // InternalOwl.g:6270:1: entryRuleNegativeDataPropertyAssertion returns [EObject current=null] : iv_ruleNegativeDataPropertyAssertion= ruleNegativeDataPropertyAssertion EOF ;
    public final EObject entryRuleNegativeDataPropertyAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegativeDataPropertyAssertion = null;


        try {
            // InternalOwl.g:6270:70: (iv_ruleNegativeDataPropertyAssertion= ruleNegativeDataPropertyAssertion EOF )
            // InternalOwl.g:6271:2: iv_ruleNegativeDataPropertyAssertion= ruleNegativeDataPropertyAssertion EOF
            {
             newCompositeNode(grammarAccess.getNegativeDataPropertyAssertionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegativeDataPropertyAssertion=ruleNegativeDataPropertyAssertion();

            state._fsp--;

             current =iv_ruleNegativeDataPropertyAssertion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegativeDataPropertyAssertion"


    // $ANTLR start "ruleNegativeDataPropertyAssertion"
    // InternalOwl.g:6277:1: ruleNegativeDataPropertyAssertion returns [EObject current=null] : (otherlv_0= 'NegativeDataPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetValue_5_0= ruleLiteral ) ) otherlv_6= ')' ) ;
    public final EObject ruleNegativeDataPropertyAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression_3_0 = null;

        EObject lv_sourceIndividual_4_0 = null;

        EObject lv_targetValue_5_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:6283:2: ( (otherlv_0= 'NegativeDataPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetValue_5_0= ruleLiteral ) ) otherlv_6= ')' ) )
            // InternalOwl.g:6284:2: (otherlv_0= 'NegativeDataPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetValue_5_0= ruleLiteral ) ) otherlv_6= ')' )
            {
            // InternalOwl.g:6284:2: (otherlv_0= 'NegativeDataPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetValue_5_0= ruleLiteral ) ) otherlv_6= ')' )
            // InternalOwl.g:6285:3: otherlv_0= 'NegativeDataPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetValue_5_0= ruleLiteral ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNegativeDataPropertyAssertionAccess().getNegativeDataPropertyAssertionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getNegativeDataPropertyAssertionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:6293:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==89) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalOwl.g:6294:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:6294:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:6295:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getNegativeDataPropertyAssertionAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_axiomAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNegativeDataPropertyAssertionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"axiomAnnotations",
            	    						lv_axiomAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            // InternalOwl.g:6312:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:6313:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:6313:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:6314:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getNegativeDataPropertyAssertionAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_objectPropertyExpression_3_0=ruleObjectPropertyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegativeDataPropertyAssertionRule());
            					}
            					set(
            						current,
            						"objectPropertyExpression",
            						lv_objectPropertyExpression_3_0,
            						"org.omg.sysml.owl.Owl.ObjectPropertyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:6331:3: ( (lv_sourceIndividual_4_0= ruleIndividualReference ) )
            // InternalOwl.g:6332:4: (lv_sourceIndividual_4_0= ruleIndividualReference )
            {
            // InternalOwl.g:6332:4: (lv_sourceIndividual_4_0= ruleIndividualReference )
            // InternalOwl.g:6333:5: lv_sourceIndividual_4_0= ruleIndividualReference
            {

            					newCompositeNode(grammarAccess.getNegativeDataPropertyAssertionAccess().getSourceIndividualIndividualReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_sourceIndividual_4_0=ruleIndividualReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegativeDataPropertyAssertionRule());
            					}
            					set(
            						current,
            						"sourceIndividual",
            						lv_sourceIndividual_4_0,
            						"org.omg.sysml.owl.Owl.IndividualReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:6350:3: ( (lv_targetValue_5_0= ruleLiteral ) )
            // InternalOwl.g:6351:4: (lv_targetValue_5_0= ruleLiteral )
            {
            // InternalOwl.g:6351:4: (lv_targetValue_5_0= ruleLiteral )
            // InternalOwl.g:6352:5: lv_targetValue_5_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getNegativeDataPropertyAssertionAccess().getTargetValueLiteralParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_targetValue_5_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegativeDataPropertyAssertionRule());
            					}
            					set(
            						current,
            						"targetValue",
            						lv_targetValue_5_0,
            						"org.omg.sysml.owl.Owl.Literal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getNegativeDataPropertyAssertionAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegativeDataPropertyAssertion"


    // $ANTLR start "entryRuleAnnotation"
    // InternalOwl.g:6377:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalOwl.g:6377:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalOwl.g:6378:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalOwl.g:6384:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= 'Annotation' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_annotationvalue_4_0= ruleAnnotationValue ) ) otherlv_5= ')' ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_annotationAnnotations_2_0 = null;

        EObject lv_annotationProperty_3_0 = null;

        EObject lv_annotationvalue_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:6390:2: ( (otherlv_0= 'Annotation' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_annotationvalue_4_0= ruleAnnotationValue ) ) otherlv_5= ')' ) )
            // InternalOwl.g:6391:2: (otherlv_0= 'Annotation' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_annotationvalue_4_0= ruleAnnotationValue ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:6391:2: (otherlv_0= 'Annotation' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_annotationvalue_4_0= ruleAnnotationValue ) ) otherlv_5= ')' )
            // InternalOwl.g:6392:3: otherlv_0= 'Annotation' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_annotationvalue_4_0= ruleAnnotationValue ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,89,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getAnnotationKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:6400:3: ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==89) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalOwl.g:6401:4: (lv_annotationAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:6401:4: (lv_annotationAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:6402:5: lv_annotationAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_annotationAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAnnotationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotationAnnotations",
            	    						lv_annotationAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // InternalOwl.g:6419:3: ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) )
            // InternalOwl.g:6420:4: (lv_annotationProperty_3_0= ruleAnnotationProperty )
            {
            // InternalOwl.g:6420:4: (lv_annotationProperty_3_0= ruleAnnotationProperty )
            // InternalOwl.g:6421:5: lv_annotationProperty_3_0= ruleAnnotationProperty
            {

            					newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationPropertyAnnotationPropertyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
            lv_annotationProperty_3_0=ruleAnnotationProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationRule());
            					}
            					set(
            						current,
            						"annotationProperty",
            						lv_annotationProperty_3_0,
            						"org.omg.sysml.owl.Owl.AnnotationProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:6438:3: ( (lv_annotationvalue_4_0= ruleAnnotationValue ) )
            // InternalOwl.g:6439:4: (lv_annotationvalue_4_0= ruleAnnotationValue )
            {
            // InternalOwl.g:6439:4: (lv_annotationvalue_4_0= ruleAnnotationValue )
            // InternalOwl.g:6440:5: lv_annotationvalue_4_0= ruleAnnotationValue
            {

            					newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationvalueAnnotationValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_annotationvalue_4_0=ruleAnnotationValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationRule());
            					}
            					set(
            						current,
            						"annotationvalue",
            						lv_annotationvalue_4_0,
            						"org.omg.sysml.owl.Owl.AnnotationValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleAnnotationValue"
    // InternalOwl.g:6465:1: entryRuleAnnotationValue returns [EObject current=null] : iv_ruleAnnotationValue= ruleAnnotationValue EOF ;
    public final EObject entryRuleAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationValue = null;


        try {
            // InternalOwl.g:6465:56: (iv_ruleAnnotationValue= ruleAnnotationValue EOF )
            // InternalOwl.g:6466:2: iv_ruleAnnotationValue= ruleAnnotationValue EOF
            {
             newCompositeNode(grammarAccess.getAnnotationValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationValue=ruleAnnotationValue();

            state._fsp--;

             current =iv_ruleAnnotationValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationValue"


    // $ANTLR start "ruleAnnotationValue"
    // InternalOwl.g:6472:1: ruleAnnotationValue returns [EObject current=null] : (this_AnonymousIndividualReference_0= ruleAnonymousIndividualReference | ( () ruleIRI ) | this_Literal_3= ruleLiteral ) ;
    public final EObject ruleAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject this_AnonymousIndividualReference_0 = null;

        EObject this_Literal_3 = null;



        	enterRule();

        try {
            // InternalOwl.g:6478:2: ( (this_AnonymousIndividualReference_0= ruleAnonymousIndividualReference | ( () ruleIRI ) | this_Literal_3= ruleLiteral ) )
            // InternalOwl.g:6479:2: (this_AnonymousIndividualReference_0= ruleAnonymousIndividualReference | ( () ruleIRI ) | this_Literal_3= ruleLiteral )
            {
            // InternalOwl.g:6479:2: (this_AnonymousIndividualReference_0= ruleAnonymousIndividualReference | ( () ruleIRI ) | this_Literal_3= ruleLiteral )
            int alt80=3;
            switch ( input.LA(1) ) {
            case RULE_BLANK_NODE_LABEL:
                {
                alt80=1;
                }
                break;
            case RULE_FULL_IRI:
            case RULE_PN_PREFIX:
            case RULE_PN_LOCAL:
                {
                alt80=2;
                }
                break;
            case RULE_STRING:
                {
                alt80=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalOwl.g:6480:3: this_AnonymousIndividualReference_0= ruleAnonymousIndividualReference
                    {

                    			newCompositeNode(grammarAccess.getAnnotationValueAccess().getAnonymousIndividualReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnonymousIndividualReference_0=ruleAnonymousIndividualReference();

                    state._fsp--;


                    			current = this_AnonymousIndividualReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOwl.g:6489:3: ( () ruleIRI )
                    {
                    // InternalOwl.g:6489:3: ( () ruleIRI )
                    // InternalOwl.g:6490:4: () ruleIRI
                    {
                    // InternalOwl.g:6490:4: ()
                    // InternalOwl.g:6491:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAnnotationValueAccess().getAnnotationValueAction_1_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getAnnotationValueAccess().getIRIParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleIRI();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOwl.g:6506:3: this_Literal_3= ruleLiteral
                    {

                    			newCompositeNode(grammarAccess.getAnnotationValueAccess().getLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Literal_3=ruleLiteral();

                    state._fsp--;


                    			current = this_Literal_3;
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
    // $ANTLR end "ruleAnnotationValue"


    // $ANTLR start "entryRuleAnnotationAxiom"
    // InternalOwl.g:6518:1: entryRuleAnnotationAxiom returns [EObject current=null] : iv_ruleAnnotationAxiom= ruleAnnotationAxiom EOF ;
    public final EObject entryRuleAnnotationAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationAxiom = null;


        try {
            // InternalOwl.g:6518:56: (iv_ruleAnnotationAxiom= ruleAnnotationAxiom EOF )
            // InternalOwl.g:6519:2: iv_ruleAnnotationAxiom= ruleAnnotationAxiom EOF
            {
             newCompositeNode(grammarAccess.getAnnotationAxiomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationAxiom=ruleAnnotationAxiom();

            state._fsp--;

             current =iv_ruleAnnotationAxiom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationAxiom"


    // $ANTLR start "ruleAnnotationAxiom"
    // InternalOwl.g:6525:1: ruleAnnotationAxiom returns [EObject current=null] : (this_AnnotationAssertion_0= ruleAnnotationAssertion | this_SubAnnotationPropertyOf_1= ruleSubAnnotationPropertyOf | this_AnnotationPropertyDomain_2= ruleAnnotationPropertyDomain | this_AnnotationPropertyRange_3= ruleAnnotationPropertyRange ) ;
    public final EObject ruleAnnotationAxiom() throws RecognitionException {
        EObject current = null;

        EObject this_AnnotationAssertion_0 = null;

        EObject this_SubAnnotationPropertyOf_1 = null;

        EObject this_AnnotationPropertyDomain_2 = null;

        EObject this_AnnotationPropertyRange_3 = null;



        	enterRule();

        try {
            // InternalOwl.g:6531:2: ( (this_AnnotationAssertion_0= ruleAnnotationAssertion | this_SubAnnotationPropertyOf_1= ruleSubAnnotationPropertyOf | this_AnnotationPropertyDomain_2= ruleAnnotationPropertyDomain | this_AnnotationPropertyRange_3= ruleAnnotationPropertyRange ) )
            // InternalOwl.g:6532:2: (this_AnnotationAssertion_0= ruleAnnotationAssertion | this_SubAnnotationPropertyOf_1= ruleSubAnnotationPropertyOf | this_AnnotationPropertyDomain_2= ruleAnnotationPropertyDomain | this_AnnotationPropertyRange_3= ruleAnnotationPropertyRange )
            {
            // InternalOwl.g:6532:2: (this_AnnotationAssertion_0= ruleAnnotationAssertion | this_SubAnnotationPropertyOf_1= ruleSubAnnotationPropertyOf | this_AnnotationPropertyDomain_2= ruleAnnotationPropertyDomain | this_AnnotationPropertyRange_3= ruleAnnotationPropertyRange )
            int alt81=4;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt81=1;
                }
                break;
            case 91:
                {
                alt81=2;
                }
                break;
            case 92:
                {
                alt81=3;
                }
                break;
            case 93:
                {
                alt81=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalOwl.g:6533:3: this_AnnotationAssertion_0= ruleAnnotationAssertion
                    {

                    			newCompositeNode(grammarAccess.getAnnotationAxiomAccess().getAnnotationAssertionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnnotationAssertion_0=ruleAnnotationAssertion();

                    state._fsp--;


                    			current = this_AnnotationAssertion_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOwl.g:6542:3: this_SubAnnotationPropertyOf_1= ruleSubAnnotationPropertyOf
                    {

                    			newCompositeNode(grammarAccess.getAnnotationAxiomAccess().getSubAnnotationPropertyOfParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubAnnotationPropertyOf_1=ruleSubAnnotationPropertyOf();

                    state._fsp--;


                    			current = this_SubAnnotationPropertyOf_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOwl.g:6551:3: this_AnnotationPropertyDomain_2= ruleAnnotationPropertyDomain
                    {

                    			newCompositeNode(grammarAccess.getAnnotationAxiomAccess().getAnnotationPropertyDomainParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnnotationPropertyDomain_2=ruleAnnotationPropertyDomain();

                    state._fsp--;


                    			current = this_AnnotationPropertyDomain_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOwl.g:6560:3: this_AnnotationPropertyRange_3= ruleAnnotationPropertyRange
                    {

                    			newCompositeNode(grammarAccess.getAnnotationAxiomAccess().getAnnotationPropertyRangeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnnotationPropertyRange_3=ruleAnnotationPropertyRange();

                    state._fsp--;


                    			current = this_AnnotationPropertyRange_3;
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
    // $ANTLR end "ruleAnnotationAxiom"


    // $ANTLR start "entryRuleAnnotationAssertion"
    // InternalOwl.g:6572:1: entryRuleAnnotationAssertion returns [EObject current=null] : iv_ruleAnnotationAssertion= ruleAnnotationAssertion EOF ;
    public final EObject entryRuleAnnotationAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationAssertion = null;


        try {
            // InternalOwl.g:6572:60: (iv_ruleAnnotationAssertion= ruleAnnotationAssertion EOF )
            // InternalOwl.g:6573:2: iv_ruleAnnotationAssertion= ruleAnnotationAssertion EOF
            {
             newCompositeNode(grammarAccess.getAnnotationAssertionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationAssertion=ruleAnnotationAssertion();

            state._fsp--;

             current =iv_ruleAnnotationAssertion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationAssertion"


    // $ANTLR start "ruleAnnotationAssertion"
    // InternalOwl.g:6579:1: ruleAnnotationAssertion returns [EObject current=null] : (otherlv_0= 'AnnotationAssertion' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_annotationSubject_4_0= ruleAnnotationSubject ) ) ( (lv_annotationValue_5_0= ruleAnnotationValue ) ) otherlv_6= ')' ) ;
    public final EObject ruleAnnotationAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_annotationAnnotations_2_0 = null;

        EObject lv_annotationProperty_3_0 = null;

        EObject lv_annotationSubject_4_0 = null;

        EObject lv_annotationValue_5_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:6585:2: ( (otherlv_0= 'AnnotationAssertion' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_annotationSubject_4_0= ruleAnnotationSubject ) ) ( (lv_annotationValue_5_0= ruleAnnotationValue ) ) otherlv_6= ')' ) )
            // InternalOwl.g:6586:2: (otherlv_0= 'AnnotationAssertion' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_annotationSubject_4_0= ruleAnnotationSubject ) ) ( (lv_annotationValue_5_0= ruleAnnotationValue ) ) otherlv_6= ')' )
            {
            // InternalOwl.g:6586:2: (otherlv_0= 'AnnotationAssertion' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_annotationSubject_4_0= ruleAnnotationSubject ) ) ( (lv_annotationValue_5_0= ruleAnnotationValue ) ) otherlv_6= ')' )
            // InternalOwl.g:6587:3: otherlv_0= 'AnnotationAssertion' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_annotationSubject_4_0= ruleAnnotationSubject ) ) ( (lv_annotationValue_5_0= ruleAnnotationValue ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,90,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAssertionAccess().getAnnotationAssertionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationAssertionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:6595:3: ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==89) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalOwl.g:6596:4: (lv_annotationAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:6596:4: (lv_annotationAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:6597:5: lv_annotationAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getAnnotationAssertionAccess().getAnnotationAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_annotationAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAnnotationAssertionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotationAnnotations",
            	    						lv_annotationAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            // InternalOwl.g:6614:3: ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) )
            // InternalOwl.g:6615:4: (lv_annotationProperty_3_0= ruleAnnotationProperty )
            {
            // InternalOwl.g:6615:4: (lv_annotationProperty_3_0= ruleAnnotationProperty )
            // InternalOwl.g:6616:5: lv_annotationProperty_3_0= ruleAnnotationProperty
            {

            					newCompositeNode(grammarAccess.getAnnotationAssertionAccess().getAnnotationPropertyAnnotationPropertyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_annotationProperty_3_0=ruleAnnotationProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationAssertionRule());
            					}
            					set(
            						current,
            						"annotationProperty",
            						lv_annotationProperty_3_0,
            						"org.omg.sysml.owl.Owl.AnnotationProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:6633:3: ( (lv_annotationSubject_4_0= ruleAnnotationSubject ) )
            // InternalOwl.g:6634:4: (lv_annotationSubject_4_0= ruleAnnotationSubject )
            {
            // InternalOwl.g:6634:4: (lv_annotationSubject_4_0= ruleAnnotationSubject )
            // InternalOwl.g:6635:5: lv_annotationSubject_4_0= ruleAnnotationSubject
            {

            					newCompositeNode(grammarAccess.getAnnotationAssertionAccess().getAnnotationSubjectAnnotationSubjectParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_34);
            lv_annotationSubject_4_0=ruleAnnotationSubject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationAssertionRule());
            					}
            					set(
            						current,
            						"annotationSubject",
            						lv_annotationSubject_4_0,
            						"org.omg.sysml.owl.Owl.AnnotationSubject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:6652:3: ( (lv_annotationValue_5_0= ruleAnnotationValue ) )
            // InternalOwl.g:6653:4: (lv_annotationValue_5_0= ruleAnnotationValue )
            {
            // InternalOwl.g:6653:4: (lv_annotationValue_5_0= ruleAnnotationValue )
            // InternalOwl.g:6654:5: lv_annotationValue_5_0= ruleAnnotationValue
            {

            					newCompositeNode(grammarAccess.getAnnotationAssertionAccess().getAnnotationValueAnnotationValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_annotationValue_5_0=ruleAnnotationValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationAssertionRule());
            					}
            					set(
            						current,
            						"annotationValue",
            						lv_annotationValue_5_0,
            						"org.omg.sysml.owl.Owl.AnnotationValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAnnotationAssertionAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationAssertion"


    // $ANTLR start "entryRuleAnnotationSubject"
    // InternalOwl.g:6679:1: entryRuleAnnotationSubject returns [EObject current=null] : iv_ruleAnnotationSubject= ruleAnnotationSubject EOF ;
    public final EObject entryRuleAnnotationSubject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationSubject = null;


        try {
            // InternalOwl.g:6679:58: (iv_ruleAnnotationSubject= ruleAnnotationSubject EOF )
            // InternalOwl.g:6680:2: iv_ruleAnnotationSubject= ruleAnnotationSubject EOF
            {
             newCompositeNode(grammarAccess.getAnnotationSubjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationSubject=ruleAnnotationSubject();

            state._fsp--;

             current =iv_ruleAnnotationSubject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationSubject"


    // $ANTLR start "ruleAnnotationSubject"
    // InternalOwl.g:6686:1: ruleAnnotationSubject returns [EObject current=null] : ( ( () ruleIRI ) | this_AnonymousIndividualReference_2= ruleAnonymousIndividualReference ) ;
    public final EObject ruleAnnotationSubject() throws RecognitionException {
        EObject current = null;

        EObject this_AnonymousIndividualReference_2 = null;



        	enterRule();

        try {
            // InternalOwl.g:6692:2: ( ( ( () ruleIRI ) | this_AnonymousIndividualReference_2= ruleAnonymousIndividualReference ) )
            // InternalOwl.g:6693:2: ( ( () ruleIRI ) | this_AnonymousIndividualReference_2= ruleAnonymousIndividualReference )
            {
            // InternalOwl.g:6693:2: ( ( () ruleIRI ) | this_AnonymousIndividualReference_2= ruleAnonymousIndividualReference )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=RULE_FULL_IRI && LA83_0<=RULE_PN_LOCAL)) ) {
                alt83=1;
            }
            else if ( (LA83_0==RULE_BLANK_NODE_LABEL) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalOwl.g:6694:3: ( () ruleIRI )
                    {
                    // InternalOwl.g:6694:3: ( () ruleIRI )
                    // InternalOwl.g:6695:4: () ruleIRI
                    {
                    // InternalOwl.g:6695:4: ()
                    // InternalOwl.g:6696:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAnnotationSubjectAccess().getAnnotationSubjectAction_0_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getAnnotationSubjectAccess().getIRIParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleIRI();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOwl.g:6711:3: this_AnonymousIndividualReference_2= ruleAnonymousIndividualReference
                    {

                    			newCompositeNode(grammarAccess.getAnnotationSubjectAccess().getAnonymousIndividualReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnonymousIndividualReference_2=ruleAnonymousIndividualReference();

                    state._fsp--;


                    			current = this_AnonymousIndividualReference_2;
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
    // $ANTLR end "ruleAnnotationSubject"


    // $ANTLR start "entryRuleSubAnnotationPropertyOf"
    // InternalOwl.g:6723:1: entryRuleSubAnnotationPropertyOf returns [EObject current=null] : iv_ruleSubAnnotationPropertyOf= ruleSubAnnotationPropertyOf EOF ;
    public final EObject entryRuleSubAnnotationPropertyOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAnnotationPropertyOf = null;


        try {
            // InternalOwl.g:6723:64: (iv_ruleSubAnnotationPropertyOf= ruleSubAnnotationPropertyOf EOF )
            // InternalOwl.g:6724:2: iv_ruleSubAnnotationPropertyOf= ruleSubAnnotationPropertyOf EOF
            {
             newCompositeNode(grammarAccess.getSubAnnotationPropertyOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubAnnotationPropertyOf=ruleSubAnnotationPropertyOf();

            state._fsp--;

             current =iv_ruleSubAnnotationPropertyOf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubAnnotationPropertyOf"


    // $ANTLR start "ruleSubAnnotationPropertyOf"
    // InternalOwl.g:6730:1: ruleSubAnnotationPropertyOf returns [EObject current=null] : (otherlv_0= 'SubAnnotationPropertyOf' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_subAnnotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_superAnnotationProperty_4_0= ruleAnnotationProperty ) ) otherlv_5= ')' ) ;
    public final EObject ruleSubAnnotationPropertyOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_annotationAnnotations_2_0 = null;

        EObject lv_subAnnotationProperty_3_0 = null;

        EObject lv_superAnnotationProperty_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:6736:2: ( (otherlv_0= 'SubAnnotationPropertyOf' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_subAnnotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_superAnnotationProperty_4_0= ruleAnnotationProperty ) ) otherlv_5= ')' ) )
            // InternalOwl.g:6737:2: (otherlv_0= 'SubAnnotationPropertyOf' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_subAnnotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_superAnnotationProperty_4_0= ruleAnnotationProperty ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:6737:2: (otherlv_0= 'SubAnnotationPropertyOf' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_subAnnotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_superAnnotationProperty_4_0= ruleAnnotationProperty ) ) otherlv_5= ')' )
            // InternalOwl.g:6738:3: otherlv_0= 'SubAnnotationPropertyOf' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_subAnnotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_superAnnotationProperty_4_0= ruleAnnotationProperty ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,91,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSubAnnotationPropertyOfAccess().getSubAnnotationPropertyOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getSubAnnotationPropertyOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:6746:3: ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==89) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalOwl.g:6747:4: (lv_annotationAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:6747:4: (lv_annotationAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:6748:5: lv_annotationAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getSubAnnotationPropertyOfAccess().getAnnotationAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_annotationAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubAnnotationPropertyOfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotationAnnotations",
            	    						lv_annotationAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            // InternalOwl.g:6765:3: ( (lv_subAnnotationProperty_3_0= ruleAnnotationProperty ) )
            // InternalOwl.g:6766:4: (lv_subAnnotationProperty_3_0= ruleAnnotationProperty )
            {
            // InternalOwl.g:6766:4: (lv_subAnnotationProperty_3_0= ruleAnnotationProperty )
            // InternalOwl.g:6767:5: lv_subAnnotationProperty_3_0= ruleAnnotationProperty
            {

            					newCompositeNode(grammarAccess.getSubAnnotationPropertyOfAccess().getSubAnnotationPropertyAnnotationPropertyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_subAnnotationProperty_3_0=ruleAnnotationProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubAnnotationPropertyOfRule());
            					}
            					set(
            						current,
            						"subAnnotationProperty",
            						lv_subAnnotationProperty_3_0,
            						"org.omg.sysml.owl.Owl.AnnotationProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:6784:3: ( (lv_superAnnotationProperty_4_0= ruleAnnotationProperty ) )
            // InternalOwl.g:6785:4: (lv_superAnnotationProperty_4_0= ruleAnnotationProperty )
            {
            // InternalOwl.g:6785:4: (lv_superAnnotationProperty_4_0= ruleAnnotationProperty )
            // InternalOwl.g:6786:5: lv_superAnnotationProperty_4_0= ruleAnnotationProperty
            {

            					newCompositeNode(grammarAccess.getSubAnnotationPropertyOfAccess().getSuperAnnotationPropertyAnnotationPropertyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_superAnnotationProperty_4_0=ruleAnnotationProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubAnnotationPropertyOfRule());
            					}
            					set(
            						current,
            						"superAnnotationProperty",
            						lv_superAnnotationProperty_4_0,
            						"org.omg.sysml.owl.Owl.AnnotationProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSubAnnotationPropertyOfAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubAnnotationPropertyOf"


    // $ANTLR start "entryRuleAnnotationPropertyDomain"
    // InternalOwl.g:6811:1: entryRuleAnnotationPropertyDomain returns [EObject current=null] : iv_ruleAnnotationPropertyDomain= ruleAnnotationPropertyDomain EOF ;
    public final EObject entryRuleAnnotationPropertyDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationPropertyDomain = null;


        try {
            // InternalOwl.g:6811:65: (iv_ruleAnnotationPropertyDomain= ruleAnnotationPropertyDomain EOF )
            // InternalOwl.g:6812:2: iv_ruleAnnotationPropertyDomain= ruleAnnotationPropertyDomain EOF
            {
             newCompositeNode(grammarAccess.getAnnotationPropertyDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationPropertyDomain=ruleAnnotationPropertyDomain();

            state._fsp--;

             current =iv_ruleAnnotationPropertyDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationPropertyDomain"


    // $ANTLR start "ruleAnnotationPropertyDomain"
    // InternalOwl.g:6818:1: ruleAnnotationPropertyDomain returns [EObject current=null] : (otherlv_0= 'AnnotationPropertyDomain' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_domain_4_0= ruleIRI ) ) otherlv_5= ')' ) ;
    public final EObject ruleAnnotationPropertyDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_annotationAnnotations_2_0 = null;

        EObject lv_annotationProperty_3_0 = null;

        AntlrDatatypeRuleToken lv_domain_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:6824:2: ( (otherlv_0= 'AnnotationPropertyDomain' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_domain_4_0= ruleIRI ) ) otherlv_5= ')' ) )
            // InternalOwl.g:6825:2: (otherlv_0= 'AnnotationPropertyDomain' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_domain_4_0= ruleIRI ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:6825:2: (otherlv_0= 'AnnotationPropertyDomain' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_domain_4_0= ruleIRI ) ) otherlv_5= ')' )
            // InternalOwl.g:6826:3: otherlv_0= 'AnnotationPropertyDomain' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_domain_4_0= ruleIRI ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,92,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationPropertyDomainAccess().getAnnotationPropertyDomainKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationPropertyDomainAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:6834:3: ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==89) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalOwl.g:6835:4: (lv_annotationAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:6835:4: (lv_annotationAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:6836:5: lv_annotationAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getAnnotationPropertyDomainAccess().getAnnotationAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_annotationAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAnnotationPropertyDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotationAnnotations",
            	    						lv_annotationAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            // InternalOwl.g:6853:3: ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) )
            // InternalOwl.g:6854:4: (lv_annotationProperty_3_0= ruleAnnotationProperty )
            {
            // InternalOwl.g:6854:4: (lv_annotationProperty_3_0= ruleAnnotationProperty )
            // InternalOwl.g:6855:5: lv_annotationProperty_3_0= ruleAnnotationProperty
            {

            					newCompositeNode(grammarAccess.getAnnotationPropertyDomainAccess().getAnnotationPropertyAnnotationPropertyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_annotationProperty_3_0=ruleAnnotationProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationPropertyDomainRule());
            					}
            					set(
            						current,
            						"annotationProperty",
            						lv_annotationProperty_3_0,
            						"org.omg.sysml.owl.Owl.AnnotationProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:6872:3: ( (lv_domain_4_0= ruleIRI ) )
            // InternalOwl.g:6873:4: (lv_domain_4_0= ruleIRI )
            {
            // InternalOwl.g:6873:4: (lv_domain_4_0= ruleIRI )
            // InternalOwl.g:6874:5: lv_domain_4_0= ruleIRI
            {

            					newCompositeNode(grammarAccess.getAnnotationPropertyDomainAccess().getDomainIRIParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_domain_4_0=ruleIRI();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationPropertyDomainRule());
            					}
            					set(
            						current,
            						"domain",
            						lv_domain_4_0,
            						"org.omg.sysml.owl.Owl.IRI");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAnnotationPropertyDomainAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationPropertyDomain"


    // $ANTLR start "entryRuleAnnotationPropertyRange"
    // InternalOwl.g:6899:1: entryRuleAnnotationPropertyRange returns [EObject current=null] : iv_ruleAnnotationPropertyRange= ruleAnnotationPropertyRange EOF ;
    public final EObject entryRuleAnnotationPropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationPropertyRange = null;


        try {
            // InternalOwl.g:6899:64: (iv_ruleAnnotationPropertyRange= ruleAnnotationPropertyRange EOF )
            // InternalOwl.g:6900:2: iv_ruleAnnotationPropertyRange= ruleAnnotationPropertyRange EOF
            {
             newCompositeNode(grammarAccess.getAnnotationPropertyRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationPropertyRange=ruleAnnotationPropertyRange();

            state._fsp--;

             current =iv_ruleAnnotationPropertyRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationPropertyRange"


    // $ANTLR start "ruleAnnotationPropertyRange"
    // InternalOwl.g:6906:1: ruleAnnotationPropertyRange returns [EObject current=null] : (otherlv_0= 'AnnotationPropertyRange' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_range_4_0= ruleIRI ) ) otherlv_5= ')' ) ;
    public final EObject ruleAnnotationPropertyRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_annotationAnnotations_2_0 = null;

        EObject lv_annotationProperty_3_0 = null;

        AntlrDatatypeRuleToken lv_range_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:6912:2: ( (otherlv_0= 'AnnotationPropertyRange' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_range_4_0= ruleIRI ) ) otherlv_5= ')' ) )
            // InternalOwl.g:6913:2: (otherlv_0= 'AnnotationPropertyRange' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_range_4_0= ruleIRI ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:6913:2: (otherlv_0= 'AnnotationPropertyRange' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_range_4_0= ruleIRI ) ) otherlv_5= ')' )
            // InternalOwl.g:6914:3: otherlv_0= 'AnnotationPropertyRange' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_range_4_0= ruleIRI ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,93,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationPropertyRangeAccess().getAnnotationPropertyRangeKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationPropertyRangeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:6922:3: ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==89) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalOwl.g:6923:4: (lv_annotationAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:6923:4: (lv_annotationAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:6924:5: lv_annotationAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getAnnotationPropertyRangeAccess().getAnnotationAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_annotationAnnotations_2_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAnnotationPropertyRangeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotationAnnotations",
            	    						lv_annotationAnnotations_2_0,
            	    						"org.omg.sysml.owl.Owl.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            // InternalOwl.g:6941:3: ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) )
            // InternalOwl.g:6942:4: (lv_annotationProperty_3_0= ruleAnnotationProperty )
            {
            // InternalOwl.g:6942:4: (lv_annotationProperty_3_0= ruleAnnotationProperty )
            // InternalOwl.g:6943:5: lv_annotationProperty_3_0= ruleAnnotationProperty
            {

            					newCompositeNode(grammarAccess.getAnnotationPropertyRangeAccess().getAnnotationPropertyAnnotationPropertyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_annotationProperty_3_0=ruleAnnotationProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationPropertyRangeRule());
            					}
            					set(
            						current,
            						"annotationProperty",
            						lv_annotationProperty_3_0,
            						"org.omg.sysml.owl.Owl.AnnotationProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOwl.g:6960:3: ( (lv_range_4_0= ruleIRI ) )
            // InternalOwl.g:6961:4: (lv_range_4_0= ruleIRI )
            {
            // InternalOwl.g:6961:4: (lv_range_4_0= ruleIRI )
            // InternalOwl.g:6962:5: lv_range_4_0= ruleIRI
            {

            					newCompositeNode(grammarAccess.getAnnotationPropertyRangeAccess().getRangeIRIParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_range_4_0=ruleIRI();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationPropertyRangeRule());
            					}
            					set(
            						current,
            						"range",
            						lv_range_4_0,
            						"org.omg.sysml.owl.Owl.IRI");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAnnotationPropertyRangeAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationPropertyRange"


    // $ANTLR start "entryRuleIRI"
    // InternalOwl.g:6987:1: entryRuleIRI returns [String current=null] : iv_ruleIRI= ruleIRI EOF ;
    public final String entryRuleIRI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIRI = null;


        try {
            // InternalOwl.g:6987:43: (iv_ruleIRI= ruleIRI EOF )
            // InternalOwl.g:6988:2: iv_ruleIRI= ruleIRI EOF
            {
             newCompositeNode(grammarAccess.getIRIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIRI=ruleIRI();

            state._fsp--;

             current =iv_ruleIRI.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIRI"


    // $ANTLR start "ruleIRI"
    // InternalOwl.g:6994:1: ruleIRI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FullIRI_0= ruleFullIRI | this_AbbreviatedIRI_1= ruleAbbreviatedIRI ) ;
    public final AntlrDatatypeRuleToken ruleIRI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FullIRI_0 = null;

        AntlrDatatypeRuleToken this_AbbreviatedIRI_1 = null;



        	enterRule();

        try {
            // InternalOwl.g:7000:2: ( (this_FullIRI_0= ruleFullIRI | this_AbbreviatedIRI_1= ruleAbbreviatedIRI ) )
            // InternalOwl.g:7001:2: (this_FullIRI_0= ruleFullIRI | this_AbbreviatedIRI_1= ruleAbbreviatedIRI )
            {
            // InternalOwl.g:7001:2: (this_FullIRI_0= ruleFullIRI | this_AbbreviatedIRI_1= ruleAbbreviatedIRI )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_FULL_IRI) ) {
                alt87=1;
            }
            else if ( ((LA87_0>=RULE_PN_PREFIX && LA87_0<=RULE_PN_LOCAL)) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalOwl.g:7002:3: this_FullIRI_0= ruleFullIRI
                    {

                    			newCompositeNode(grammarAccess.getIRIAccess().getFullIRIParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FullIRI_0=ruleFullIRI();

                    state._fsp--;


                    			current.merge(this_FullIRI_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOwl.g:7013:3: this_AbbreviatedIRI_1= ruleAbbreviatedIRI
                    {

                    			newCompositeNode(grammarAccess.getIRIAccess().getAbbreviatedIRIParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbbreviatedIRI_1=ruleAbbreviatedIRI();

                    state._fsp--;


                    			current.merge(this_AbbreviatedIRI_1);
                    		

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
    // $ANTLR end "ruleIRI"


    // $ANTLR start "entryRuleFullIRI"
    // InternalOwl.g:7027:1: entryRuleFullIRI returns [String current=null] : iv_ruleFullIRI= ruleFullIRI EOF ;
    public final String entryRuleFullIRI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullIRI = null;


        try {
            // InternalOwl.g:7027:47: (iv_ruleFullIRI= ruleFullIRI EOF )
            // InternalOwl.g:7028:2: iv_ruleFullIRI= ruleFullIRI EOF
            {
             newCompositeNode(grammarAccess.getFullIRIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFullIRI=ruleFullIRI();

            state._fsp--;

             current =iv_ruleFullIRI.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullIRI"


    // $ANTLR start "ruleFullIRI"
    // InternalOwl.g:7034:1: ruleFullIRI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FULL_IRI_0= RULE_FULL_IRI ;
    public final AntlrDatatypeRuleToken ruleFullIRI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FULL_IRI_0=null;


        	enterRule();

        try {
            // InternalOwl.g:7040:2: (this_FULL_IRI_0= RULE_FULL_IRI )
            // InternalOwl.g:7041:2: this_FULL_IRI_0= RULE_FULL_IRI
            {
            this_FULL_IRI_0=(Token)match(input,RULE_FULL_IRI,FOLLOW_2); 

            		current.merge(this_FULL_IRI_0);
            	

            		newLeafNode(this_FULL_IRI_0, grammarAccess.getFullIRIAccess().getFULL_IRITerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullIRI"


    // $ANTLR start "entryRuleAbbreviatedIRI"
    // InternalOwl.g:7051:1: entryRuleAbbreviatedIRI returns [String current=null] : iv_ruleAbbreviatedIRI= ruleAbbreviatedIRI EOF ;
    public final String entryRuleAbbreviatedIRI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAbbreviatedIRI = null;


        try {
            // InternalOwl.g:7051:54: (iv_ruleAbbreviatedIRI= ruleAbbreviatedIRI EOF )
            // InternalOwl.g:7052:2: iv_ruleAbbreviatedIRI= ruleAbbreviatedIRI EOF
            {
             newCompositeNode(grammarAccess.getAbbreviatedIRIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbbreviatedIRI=ruleAbbreviatedIRI();

            state._fsp--;

             current =iv_ruleAbbreviatedIRI.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbbreviatedIRI"


    // $ANTLR start "ruleAbbreviatedIRI"
    // InternalOwl.g:7058:1: ruleAbbreviatedIRI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PN_PREFIX_0= RULE_PN_PREFIX )? this_PN_LOCAL_1= RULE_PN_LOCAL ) ;
    public final AntlrDatatypeRuleToken ruleAbbreviatedIRI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PN_PREFIX_0=null;
        Token this_PN_LOCAL_1=null;


        	enterRule();

        try {
            // InternalOwl.g:7064:2: ( ( (this_PN_PREFIX_0= RULE_PN_PREFIX )? this_PN_LOCAL_1= RULE_PN_LOCAL ) )
            // InternalOwl.g:7065:2: ( (this_PN_PREFIX_0= RULE_PN_PREFIX )? this_PN_LOCAL_1= RULE_PN_LOCAL )
            {
            // InternalOwl.g:7065:2: ( (this_PN_PREFIX_0= RULE_PN_PREFIX )? this_PN_LOCAL_1= RULE_PN_LOCAL )
            // InternalOwl.g:7066:3: (this_PN_PREFIX_0= RULE_PN_PREFIX )? this_PN_LOCAL_1= RULE_PN_LOCAL
            {
            // InternalOwl.g:7066:3: (this_PN_PREFIX_0= RULE_PN_PREFIX )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_PN_PREFIX) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalOwl.g:7067:4: this_PN_PREFIX_0= RULE_PN_PREFIX
                    {
                    this_PN_PREFIX_0=(Token)match(input,RULE_PN_PREFIX,FOLLOW_35); 

                    				current.merge(this_PN_PREFIX_0);
                    			

                    				newLeafNode(this_PN_PREFIX_0, grammarAccess.getAbbreviatedIRIAccess().getPN_PREFIXTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            this_PN_LOCAL_1=(Token)match(input,RULE_PN_LOCAL,FOLLOW_2); 

            			current.merge(this_PN_LOCAL_1);
            		

            			newLeafNode(this_PN_LOCAL_1, grammarAccess.getAbbreviatedIRIAccess().getPN_LOCALTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbbreviatedIRI"


    // $ANTLR start "entryRulePrefixName"
    // InternalOwl.g:7086:1: entryRulePrefixName returns [String current=null] : iv_rulePrefixName= rulePrefixName EOF ;
    public final String entryRulePrefixName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixName = null;


        try {
            // InternalOwl.g:7086:50: (iv_rulePrefixName= rulePrefixName EOF )
            // InternalOwl.g:7087:2: iv_rulePrefixName= rulePrefixName EOF
            {
             newCompositeNode(grammarAccess.getPrefixNameRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrefixName=rulePrefixName();

            state._fsp--;

             current =iv_rulePrefixName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefixName"


    // $ANTLR start "rulePrefixName"
    // InternalOwl.g:7093:1: rulePrefixName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PN_PREFIX_0= RULE_PN_PREFIX )? kw= ':' ) ;
    public final AntlrDatatypeRuleToken rulePrefixName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PN_PREFIX_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalOwl.g:7099:2: ( ( (this_PN_PREFIX_0= RULE_PN_PREFIX )? kw= ':' ) )
            // InternalOwl.g:7100:2: ( (this_PN_PREFIX_0= RULE_PN_PREFIX )? kw= ':' )
            {
            // InternalOwl.g:7100:2: ( (this_PN_PREFIX_0= RULE_PN_PREFIX )? kw= ':' )
            // InternalOwl.g:7101:3: (this_PN_PREFIX_0= RULE_PN_PREFIX )? kw= ':'
            {
            // InternalOwl.g:7101:3: (this_PN_PREFIX_0= RULE_PN_PREFIX )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_PN_PREFIX) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalOwl.g:7102:4: this_PN_PREFIX_0= RULE_PN_PREFIX
                    {
                    this_PN_PREFIX_0=(Token)match(input,RULE_PN_PREFIX,FOLLOW_36); 

                    				current.merge(this_PN_PREFIX_0);
                    			

                    				newLeafNode(this_PN_PREFIX_0, grammarAccess.getPrefixNameAccess().getPN_PREFIXTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,94,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPrefixNameAccess().getColonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixName"


    // $ANTLR start "entryRuleNodeID"
    // InternalOwl.g:7119:1: entryRuleNodeID returns [String current=null] : iv_ruleNodeID= ruleNodeID EOF ;
    public final String entryRuleNodeID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNodeID = null;


        try {
            // InternalOwl.g:7119:46: (iv_ruleNodeID= ruleNodeID EOF )
            // InternalOwl.g:7120:2: iv_ruleNodeID= ruleNodeID EOF
            {
             newCompositeNode(grammarAccess.getNodeIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeID=ruleNodeID();

            state._fsp--;

             current =iv_ruleNodeID.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeID"


    // $ANTLR start "ruleNodeID"
    // InternalOwl.g:7126:1: ruleNodeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BLANK_NODE_LABEL_0= RULE_BLANK_NODE_LABEL ;
    public final AntlrDatatypeRuleToken ruleNodeID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BLANK_NODE_LABEL_0=null;


        	enterRule();

        try {
            // InternalOwl.g:7132:2: (this_BLANK_NODE_LABEL_0= RULE_BLANK_NODE_LABEL )
            // InternalOwl.g:7133:2: this_BLANK_NODE_LABEL_0= RULE_BLANK_NODE_LABEL
            {
            this_BLANK_NODE_LABEL_0=(Token)match(input,RULE_BLANK_NODE_LABEL,FOLLOW_2); 

            		current.merge(this_BLANK_NODE_LABEL_0);
            	

            		newLeafNode(this_BLANK_NODE_LABEL_0, grammarAccess.getNodeIDAccess().getBLANK_NODE_LABELTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeID"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L,0x0000000040000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0xDF000000054001C0L,0x000000003FFFFFFFL});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xDF00000005400000L,0x000000003FFFFFFFL});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xDF00000004400000L,0x000000003FFFFFFFL});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xDF00000004400000L,0x000000003DFFFFFFL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000001C0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000001F8000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000007C000001C0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000007C004001C0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000004001C0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00FFFF80000001C0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00FFFF80004001C0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000004003C0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000002000001C0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000007C000001C2L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00FFFF80000001C0L,0x0000000002000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000000001C0L,0x0000000002000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x20000002000001C0L,0x0000000002000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000002004001C0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000002000001C0L,0x0000000002000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000000000003C0L,0x0000000002000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000000003D0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});

}