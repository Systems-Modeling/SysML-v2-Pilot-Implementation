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
        	return "OntologyFile";
       	}

       	@Override
       	protected OwlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleOntologyFile"
    // InternalOwl.g:64:1: entryRuleOntologyFile returns [EObject current=null] : iv_ruleOntologyFile= ruleOntologyFile EOF ;
    public final EObject entryRuleOntologyFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologyFile = null;


        try {
            // InternalOwl.g:64:53: (iv_ruleOntologyFile= ruleOntologyFile EOF )
            // InternalOwl.g:65:2: iv_ruleOntologyFile= ruleOntologyFile EOF
            {
             newCompositeNode(grammarAccess.getOntologyFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntologyFile=ruleOntologyFile();

            state._fsp--;

             current =iv_ruleOntologyFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOntologyFile"


    // $ANTLR start "ruleOntologyFile"
    // InternalOwl.g:71:1: ruleOntologyFile returns [EObject current=null] : ( (lv_documents_0_0= ruleOntologyDocument ) )+ ;
    public final EObject ruleOntologyFile() throws RecognitionException {
        EObject current = null;

        EObject lv_documents_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:77:2: ( ( (lv_documents_0_0= ruleOntologyDocument ) )+ )
            // InternalOwl.g:78:2: ( (lv_documents_0_0= ruleOntologyDocument ) )+
            {
            // InternalOwl.g:78:2: ( (lv_documents_0_0= ruleOntologyDocument ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOwl.g:79:3: (lv_documents_0_0= ruleOntologyDocument )
            	    {
            	    // InternalOwl.g:79:3: (lv_documents_0_0= ruleOntologyDocument )
            	    // InternalOwl.g:80:4: lv_documents_0_0= ruleOntologyDocument
            	    {

            	    				newCompositeNode(grammarAccess.getOntologyFileAccess().getDocumentsOntologyDocumentParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_documents_0_0=ruleOntologyDocument();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getOntologyFileRule());
            	    				}
            	    				add(
            	    					current,
            	    					"documents",
            	    					lv_documents_0_0,
            	    					"org.omg.sysml.owl.Owl.OntologyDocument");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end "ruleOntologyFile"


    // $ANTLR start "entryRuleOntologyDocument"
    // InternalOwl.g:100:1: entryRuleOntologyDocument returns [EObject current=null] : iv_ruleOntologyDocument= ruleOntologyDocument EOF ;
    public final EObject entryRuleOntologyDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntologyDocument = null;


        try {
            // InternalOwl.g:100:57: (iv_ruleOntologyDocument= ruleOntologyDocument EOF )
            // InternalOwl.g:101:2: iv_ruleOntologyDocument= ruleOntologyDocument EOF
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
    // InternalOwl.g:107:1: ruleOntologyDocument returns [EObject current=null] : ( ( (lv_prefixDeclarations_0_0= rulePrefixDeclaration ) )* ( (lv_ontology_1_0= ruleOntology ) ) ) ;
    public final EObject ruleOntologyDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_prefixDeclarations_0_0 = null;

        EObject lv_ontology_1_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:113:2: ( ( ( (lv_prefixDeclarations_0_0= rulePrefixDeclaration ) )* ( (lv_ontology_1_0= ruleOntology ) ) ) )
            // InternalOwl.g:114:2: ( ( (lv_prefixDeclarations_0_0= rulePrefixDeclaration ) )* ( (lv_ontology_1_0= ruleOntology ) ) )
            {
            // InternalOwl.g:114:2: ( ( (lv_prefixDeclarations_0_0= rulePrefixDeclaration ) )* ( (lv_ontology_1_0= ruleOntology ) ) )
            // InternalOwl.g:115:3: ( (lv_prefixDeclarations_0_0= rulePrefixDeclaration ) )* ( (lv_ontology_1_0= ruleOntology ) )
            {
            // InternalOwl.g:115:3: ( (lv_prefixDeclarations_0_0= rulePrefixDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOwl.g:116:4: (lv_prefixDeclarations_0_0= rulePrefixDeclaration )
            	    {
            	    // InternalOwl.g:116:4: (lv_prefixDeclarations_0_0= rulePrefixDeclaration )
            	    // InternalOwl.g:117:5: lv_prefixDeclarations_0_0= rulePrefixDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getOntologyDocumentAccess().getPrefixDeclarationsPrefixDeclarationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_4);
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
            	    break loop2;
                }
            } while (true);

            // InternalOwl.g:134:3: ( (lv_ontology_1_0= ruleOntology ) )
            // InternalOwl.g:135:4: (lv_ontology_1_0= ruleOntology )
            {
            // InternalOwl.g:135:4: (lv_ontology_1_0= ruleOntology )
            // InternalOwl.g:136:5: lv_ontology_1_0= ruleOntology
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
    // InternalOwl.g:157:1: entryRulePrefixDeclaration returns [EObject current=null] : iv_rulePrefixDeclaration= rulePrefixDeclaration EOF ;
    public final EObject entryRulePrefixDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixDeclaration = null;


        try {
            // InternalOwl.g:157:58: (iv_rulePrefixDeclaration= rulePrefixDeclaration EOF )
            // InternalOwl.g:158:2: iv_rulePrefixDeclaration= rulePrefixDeclaration EOF
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
    // InternalOwl.g:164:1: rulePrefixDeclaration returns [EObject current=null] : (otherlv_0= 'Prefix' otherlv_1= '(' ( (lv_prefixName_2_0= rulePrefixName ) ) otherlv_3= '=' ( (lv_fullIRI_4_0= ruleFullIRI ) ) otherlv_5= ')' ) ;
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
            // InternalOwl.g:170:2: ( (otherlv_0= 'Prefix' otherlv_1= '(' ( (lv_prefixName_2_0= rulePrefixName ) ) otherlv_3= '=' ( (lv_fullIRI_4_0= ruleFullIRI ) ) otherlv_5= ')' ) )
            // InternalOwl.g:171:2: (otherlv_0= 'Prefix' otherlv_1= '(' ( (lv_prefixName_2_0= rulePrefixName ) ) otherlv_3= '=' ( (lv_fullIRI_4_0= ruleFullIRI ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:171:2: (otherlv_0= 'Prefix' otherlv_1= '(' ( (lv_prefixName_2_0= rulePrefixName ) ) otherlv_3= '=' ( (lv_fullIRI_4_0= ruleFullIRI ) ) otherlv_5= ')' )
            // InternalOwl.g:172:3: otherlv_0= 'Prefix' otherlv_1= '(' ( (lv_prefixName_2_0= rulePrefixName ) ) otherlv_3= '=' ( (lv_fullIRI_4_0= ruleFullIRI ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPrefixDeclarationAccess().getPrefixKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPrefixDeclarationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:180:3: ( (lv_prefixName_2_0= rulePrefixName ) )
            // InternalOwl.g:181:4: (lv_prefixName_2_0= rulePrefixName )
            {
            // InternalOwl.g:181:4: (lv_prefixName_2_0= rulePrefixName )
            // InternalOwl.g:182:5: lv_prefixName_2_0= rulePrefixName
            {

            					newCompositeNode(grammarAccess.getPrefixDeclarationAccess().getPrefixNamePrefixNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_3=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPrefixDeclarationAccess().getEqualsSignKeyword_3());
            		
            // InternalOwl.g:203:3: ( (lv_fullIRI_4_0= ruleFullIRI ) )
            // InternalOwl.g:204:4: (lv_fullIRI_4_0= ruleFullIRI )
            {
            // InternalOwl.g:204:4: (lv_fullIRI_4_0= ruleFullIRI )
            // InternalOwl.g:205:5: lv_fullIRI_4_0= ruleFullIRI
            {

            					newCompositeNode(grammarAccess.getPrefixDeclarationAccess().getFullIRIFullIRIParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:230:1: entryRuleOntology returns [EObject current=null] : iv_ruleOntology= ruleOntology EOF ;
    public final EObject entryRuleOntology() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntology = null;


        try {
            // InternalOwl.g:230:49: (iv_ruleOntology= ruleOntology EOF )
            // InternalOwl.g:231:2: iv_ruleOntology= ruleOntology EOF
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
    // InternalOwl.g:237:1: ruleOntology returns [EObject current=null] : ( () otherlv_1= 'Ontology' otherlv_2= '(' ( ( (lv_ontologyIRI_3_0= ruleIRI ) ) ( (lv_versionIRI_4_0= ruleIRI ) )? )? ( (lv_directlyImportsDocuments_5_0= ruleDirectlyImportsDocument ) )* ( (lv_ontologyAnnotations_6_0= ruleAnnotation ) )* ( (lv_axioms_7_0= ruleAxiom ) )* otherlv_8= ')' ) ;
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
            // InternalOwl.g:243:2: ( ( () otherlv_1= 'Ontology' otherlv_2= '(' ( ( (lv_ontologyIRI_3_0= ruleIRI ) ) ( (lv_versionIRI_4_0= ruleIRI ) )? )? ( (lv_directlyImportsDocuments_5_0= ruleDirectlyImportsDocument ) )* ( (lv_ontologyAnnotations_6_0= ruleAnnotation ) )* ( (lv_axioms_7_0= ruleAxiom ) )* otherlv_8= ')' ) )
            // InternalOwl.g:244:2: ( () otherlv_1= 'Ontology' otherlv_2= '(' ( ( (lv_ontologyIRI_3_0= ruleIRI ) ) ( (lv_versionIRI_4_0= ruleIRI ) )? )? ( (lv_directlyImportsDocuments_5_0= ruleDirectlyImportsDocument ) )* ( (lv_ontologyAnnotations_6_0= ruleAnnotation ) )* ( (lv_axioms_7_0= ruleAxiom ) )* otherlv_8= ')' )
            {
            // InternalOwl.g:244:2: ( () otherlv_1= 'Ontology' otherlv_2= '(' ( ( (lv_ontologyIRI_3_0= ruleIRI ) ) ( (lv_versionIRI_4_0= ruleIRI ) )? )? ( (lv_directlyImportsDocuments_5_0= ruleDirectlyImportsDocument ) )* ( (lv_ontologyAnnotations_6_0= ruleAnnotation ) )* ( (lv_axioms_7_0= ruleAxiom ) )* otherlv_8= ')' )
            // InternalOwl.g:245:3: () otherlv_1= 'Ontology' otherlv_2= '(' ( ( (lv_ontologyIRI_3_0= ruleIRI ) ) ( (lv_versionIRI_4_0= ruleIRI ) )? )? ( (lv_directlyImportsDocuments_5_0= ruleDirectlyImportsDocument ) )* ( (lv_ontologyAnnotations_6_0= ruleAnnotation ) )* ( (lv_axioms_7_0= ruleAxiom ) )* otherlv_8= ')'
            {
            // InternalOwl.g:245:3: ()
            // InternalOwl.g:246:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOntologyAccess().getOntologyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getOntologyAccess().getOntologyKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getOntologyAccess().getLeftParenthesisKeyword_2());
            		
            // InternalOwl.g:260:3: ( ( (lv_ontologyIRI_3_0= ruleIRI ) ) ( (lv_versionIRI_4_0= ruleIRI ) )? )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_FULL_IRI && LA4_0<=RULE_PN_LOCAL)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOwl.g:261:4: ( (lv_ontologyIRI_3_0= ruleIRI ) ) ( (lv_versionIRI_4_0= ruleIRI ) )?
                    {
                    // InternalOwl.g:261:4: ( (lv_ontologyIRI_3_0= ruleIRI ) )
                    // InternalOwl.g:262:5: (lv_ontologyIRI_3_0= ruleIRI )
                    {
                    // InternalOwl.g:262:5: (lv_ontologyIRI_3_0= ruleIRI )
                    // InternalOwl.g:263:6: lv_ontologyIRI_3_0= ruleIRI
                    {

                    						newCompositeNode(grammarAccess.getOntologyAccess().getOntologyIRIIRIParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalOwl.g:280:4: ( (lv_versionIRI_4_0= ruleIRI ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=RULE_FULL_IRI && LA3_0<=RULE_PN_LOCAL)) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalOwl.g:281:5: (lv_versionIRI_4_0= ruleIRI )
                            {
                            // InternalOwl.g:281:5: (lv_versionIRI_4_0= ruleIRI )
                            // InternalOwl.g:282:6: lv_versionIRI_4_0= ruleIRI
                            {

                            						newCompositeNode(grammarAccess.getOntologyAccess().getVersionIRIIRIParserRuleCall_3_1_0());
                            					
                            pushFollow(FOLLOW_11);
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

            // InternalOwl.g:300:3: ( (lv_directlyImportsDocuments_5_0= ruleDirectlyImportsDocument ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOwl.g:301:4: (lv_directlyImportsDocuments_5_0= ruleDirectlyImportsDocument )
            	    {
            	    // InternalOwl.g:301:4: (lv_directlyImportsDocuments_5_0= ruleDirectlyImportsDocument )
            	    // InternalOwl.g:302:5: lv_directlyImportsDocuments_5_0= ruleDirectlyImportsDocument
            	    {

            	    					newCompositeNode(grammarAccess.getOntologyAccess().getDirectlyImportsDocumentsDirectlyImportsDocumentParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    break loop5;
                }
            } while (true);

            // InternalOwl.g:319:3: ( (lv_ontologyAnnotations_6_0= ruleAnnotation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==89) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalOwl.g:320:4: (lv_ontologyAnnotations_6_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:320:4: (lv_ontologyAnnotations_6_0= ruleAnnotation )
            	    // InternalOwl.g:321:5: lv_ontologyAnnotations_6_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getOntologyAccess().getOntologyAnnotationsAnnotationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    break loop6;
                }
            } while (true);

            // InternalOwl.g:338:3: ( (lv_axioms_7_0= ruleAxiom ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26||(LA7_0>=56 && LA7_0<=60)||(LA7_0>=62 && LA7_0<=88)||(LA7_0>=90 && LA7_0<=93)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalOwl.g:339:4: (lv_axioms_7_0= ruleAxiom )
            	    {
            	    // InternalOwl.g:339:4: (lv_axioms_7_0= ruleAxiom )
            	    // InternalOwl.g:340:5: lv_axioms_7_0= ruleAxiom
            	    {

            	    					newCompositeNode(grammarAccess.getOntologyAccess().getAxiomsAxiomParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_13);
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
            	    break loop7;
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
    // InternalOwl.g:365:1: entryRuleDirectlyImportsDocument returns [String current=null] : iv_ruleDirectlyImportsDocument= ruleDirectlyImportsDocument EOF ;
    public final String entryRuleDirectlyImportsDocument() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDirectlyImportsDocument = null;


        try {
            // InternalOwl.g:365:63: (iv_ruleDirectlyImportsDocument= ruleDirectlyImportsDocument EOF )
            // InternalOwl.g:366:2: iv_ruleDirectlyImportsDocument= ruleDirectlyImportsDocument EOF
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
    // InternalOwl.g:372:1: ruleDirectlyImportsDocument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Import' kw= '(' this_IRI_2= ruleIRI kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleDirectlyImportsDocument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IRI_2 = null;



        	enterRule();

        try {
            // InternalOwl.g:378:2: ( (kw= 'Import' kw= '(' this_IRI_2= ruleIRI kw= ')' ) )
            // InternalOwl.g:379:2: (kw= 'Import' kw= '(' this_IRI_2= ruleIRI kw= ')' )
            {
            // InternalOwl.g:379:2: (kw= 'Import' kw= '(' this_IRI_2= ruleIRI kw= ')' )
            // InternalOwl.g:380:3: kw= 'Import' kw= '(' this_IRI_2= ruleIRI kw= ')'
            {
            kw=(Token)match(input,24,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDirectlyImportsDocumentAccess().getImportKeyword_0());
            		
            kw=(Token)match(input,20,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDirectlyImportsDocumentAccess().getLeftParenthesisKeyword_1());
            		

            			newCompositeNode(grammarAccess.getDirectlyImportsDocumentAccess().getIRIParserRuleCall_2());
            		
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:409:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalOwl.g:409:46: (iv_ruleClass= ruleClass EOF )
            // InternalOwl.g:410:2: iv_ruleClass= ruleClass EOF
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
    // InternalOwl.g:416:1: ruleClass returns [EObject current=null] : ( (lv_entityIRI_0_0= ruleIRI ) ) ;
    public final EObject ruleClass() throws RecognitionException {
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
    // InternalOwl.g:445:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // InternalOwl.g:445:49: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalOwl.g:446:2: iv_ruleDatatype= ruleDatatype EOF
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
    // InternalOwl.g:452:1: ruleDatatype returns [EObject current=null] : ( (lv_entityIRI_0_0= ruleIRI ) ) ;
    public final EObject ruleDatatype() throws RecognitionException {
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
    // InternalOwl.g:481:1: entryRuleObjectProperty returns [EObject current=null] : iv_ruleObjectProperty= ruleObjectProperty EOF ;
    public final EObject entryRuleObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectProperty = null;


        try {
            // InternalOwl.g:481:55: (iv_ruleObjectProperty= ruleObjectProperty EOF )
            // InternalOwl.g:482:2: iv_ruleObjectProperty= ruleObjectProperty EOF
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
    // InternalOwl.g:488:1: ruleObjectProperty returns [EObject current=null] : ( (lv_entityIRI_0_0= ruleIRI ) ) ;
    public final EObject ruleObjectProperty() throws RecognitionException {
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
    // InternalOwl.g:517:1: entryRuleDataProperty returns [EObject current=null] : iv_ruleDataProperty= ruleDataProperty EOF ;
    public final EObject entryRuleDataProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataProperty = null;


        try {
            // InternalOwl.g:517:53: (iv_ruleDataProperty= ruleDataProperty EOF )
            // InternalOwl.g:518:2: iv_ruleDataProperty= ruleDataProperty EOF
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
    // InternalOwl.g:524:1: ruleDataProperty returns [EObject current=null] : ( (lv_entityIRI_0_0= ruleIRI ) ) ;
    public final EObject ruleDataProperty() throws RecognitionException {
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
    // InternalOwl.g:553:1: entryRuleAnnotationProperty returns [EObject current=null] : iv_ruleAnnotationProperty= ruleAnnotationProperty EOF ;
    public final EObject entryRuleAnnotationProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationProperty = null;


        try {
            // InternalOwl.g:553:59: (iv_ruleAnnotationProperty= ruleAnnotationProperty EOF )
            // InternalOwl.g:554:2: iv_ruleAnnotationProperty= ruleAnnotationProperty EOF
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
    // InternalOwl.g:560:1: ruleAnnotationProperty returns [EObject current=null] : ( (lv_entityIRI_0_0= ruleIRI ) ) ;
    public final EObject ruleAnnotationProperty() throws RecognitionException {
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
    // InternalOwl.g:589:1: entryRuleNamedIndividual returns [EObject current=null] : iv_ruleNamedIndividual= ruleNamedIndividual EOF ;
    public final EObject entryRuleNamedIndividual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedIndividual = null;


        try {
            // InternalOwl.g:589:56: (iv_ruleNamedIndividual= ruleNamedIndividual EOF )
            // InternalOwl.g:590:2: iv_ruleNamedIndividual= ruleNamedIndividual EOF
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
    // InternalOwl.g:596:1: ruleNamedIndividual returns [EObject current=null] : ( (lv_entityIRI_0_0= ruleIRI ) ) ;
    public final EObject ruleNamedIndividual() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_entityIRI_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:602:2: ( ( (lv_entityIRI_0_0= ruleIRI ) ) )
            // InternalOwl.g:603:2: ( (lv_entityIRI_0_0= ruleIRI ) )
            {
            // InternalOwl.g:603:2: ( (lv_entityIRI_0_0= ruleIRI ) )
            // InternalOwl.g:604:3: (lv_entityIRI_0_0= ruleIRI )
            {
            // InternalOwl.g:604:3: (lv_entityIRI_0_0= ruleIRI )
            // InternalOwl.g:605:4: lv_entityIRI_0_0= ruleIRI
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
    // InternalOwl.g:625:1: entryRuleAnonymousIndividual returns [EObject current=null] : iv_ruleAnonymousIndividual= ruleAnonymousIndividual EOF ;
    public final EObject entryRuleAnonymousIndividual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousIndividual = null;


        try {
            // InternalOwl.g:625:60: (iv_ruleAnonymousIndividual= ruleAnonymousIndividual EOF )
            // InternalOwl.g:626:2: iv_ruleAnonymousIndividual= ruleAnonymousIndividual EOF
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
    // InternalOwl.g:632:1: ruleAnonymousIndividual returns [EObject current=null] : ( (lv_nodeId_0_0= ruleNodeID ) ) ;
    public final EObject ruleAnonymousIndividual() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nodeId_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:638:2: ( ( (lv_nodeId_0_0= ruleNodeID ) ) )
            // InternalOwl.g:639:2: ( (lv_nodeId_0_0= ruleNodeID ) )
            {
            // InternalOwl.g:639:2: ( (lv_nodeId_0_0= ruleNodeID ) )
            // InternalOwl.g:640:3: (lv_nodeId_0_0= ruleNodeID )
            {
            // InternalOwl.g:640:3: (lv_nodeId_0_0= ruleNodeID )
            // InternalOwl.g:641:4: lv_nodeId_0_0= ruleNodeID
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
    // InternalOwl.g:661:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalOwl.g:661:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalOwl.g:662:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalOwl.g:668:1: ruleLiteral returns [EObject current=null] : (this_TypedLiteral_0= ruleTypedLiteral | this_StringLiteral_1= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_TypedLiteral_0 = null;

        EObject this_StringLiteral_1 = null;



        	enterRule();

        try {
            // InternalOwl.g:674:2: ( (this_TypedLiteral_0= ruleTypedLiteral | this_StringLiteral_1= ruleStringLiteral ) )
            // InternalOwl.g:675:2: (this_TypedLiteral_0= ruleTypedLiteral | this_StringLiteral_1= ruleStringLiteral )
            {
            // InternalOwl.g:675:2: (this_TypedLiteral_0= ruleTypedLiteral | this_StringLiteral_1= ruleStringLiteral )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||LA8_1==RULE_STRING||(LA8_1>=RULE_FULL_IRI && LA8_1<=RULE_PN_LOCAL)||LA8_1==22) ) {
                    alt8=2;
                }
                else if ( (LA8_1==25) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalOwl.g:676:3: this_TypedLiteral_0= ruleTypedLiteral
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
                    // InternalOwl.g:685:3: this_StringLiteral_1= ruleStringLiteral
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
    // InternalOwl.g:697:1: entryRuleTypedLiteral returns [EObject current=null] : iv_ruleTypedLiteral= ruleTypedLiteral EOF ;
    public final EObject entryRuleTypedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedLiteral = null;


        try {
            // InternalOwl.g:697:53: (iv_ruleTypedLiteral= ruleTypedLiteral EOF )
            // InternalOwl.g:698:2: iv_ruleTypedLiteral= ruleTypedLiteral EOF
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
    // InternalOwl.g:704:1: ruleTypedLiteral returns [EObject current=null] : ( ( (lv_lexicalForm_0_0= RULE_STRING ) ) otherlv_1= '^^' ( (lv_datatype_2_0= ruleIRI ) ) ) ;
    public final EObject ruleTypedLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_lexicalForm_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_datatype_2_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:710:2: ( ( ( (lv_lexicalForm_0_0= RULE_STRING ) ) otherlv_1= '^^' ( (lv_datatype_2_0= ruleIRI ) ) ) )
            // InternalOwl.g:711:2: ( ( (lv_lexicalForm_0_0= RULE_STRING ) ) otherlv_1= '^^' ( (lv_datatype_2_0= ruleIRI ) ) )
            {
            // InternalOwl.g:711:2: ( ( (lv_lexicalForm_0_0= RULE_STRING ) ) otherlv_1= '^^' ( (lv_datatype_2_0= ruleIRI ) ) )
            // InternalOwl.g:712:3: ( (lv_lexicalForm_0_0= RULE_STRING ) ) otherlv_1= '^^' ( (lv_datatype_2_0= ruleIRI ) )
            {
            // InternalOwl.g:712:3: ( (lv_lexicalForm_0_0= RULE_STRING ) )
            // InternalOwl.g:713:4: (lv_lexicalForm_0_0= RULE_STRING )
            {
            // InternalOwl.g:713:4: (lv_lexicalForm_0_0= RULE_STRING )
            // InternalOwl.g:714:5: lv_lexicalForm_0_0= RULE_STRING
            {
            lv_lexicalForm_0_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            otherlv_1=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTypedLiteralAccess().getCircumflexAccentCircumflexAccentKeyword_1());
            		
            // InternalOwl.g:734:3: ( (lv_datatype_2_0= ruleIRI ) )
            // InternalOwl.g:735:4: (lv_datatype_2_0= ruleIRI )
            {
            // InternalOwl.g:735:4: (lv_datatype_2_0= ruleIRI )
            // InternalOwl.g:736:5: lv_datatype_2_0= ruleIRI
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
    // InternalOwl.g:757:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalOwl.g:757:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalOwl.g:758:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalOwl.g:764:1: ruleStringLiteral returns [EObject current=null] : ( (lv_lexicalForm_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_lexicalForm_0_0=null;


        	enterRule();

        try {
            // InternalOwl.g:770:2: ( ( (lv_lexicalForm_0_0= RULE_STRING ) ) )
            // InternalOwl.g:771:2: ( (lv_lexicalForm_0_0= RULE_STRING ) )
            {
            // InternalOwl.g:771:2: ( (lv_lexicalForm_0_0= RULE_STRING ) )
            // InternalOwl.g:772:3: (lv_lexicalForm_0_0= RULE_STRING )
            {
            // InternalOwl.g:772:3: (lv_lexicalForm_0_0= RULE_STRING )
            // InternalOwl.g:773:4: lv_lexicalForm_0_0= RULE_STRING
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
    // InternalOwl.g:792:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalOwl.g:792:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalOwl.g:793:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalOwl.g:799:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= 'Declaration' otherlv_1= '(' ( (lv_axiomAnnotation_2_0= ruleAnnotation ) )* ( (lv_entity_3_0= ruleEntityDeclaration ) ) otherlv_4= ')' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_axiomAnnotation_2_0 = null;

        EObject lv_entity_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:805:2: ( (otherlv_0= 'Declaration' otherlv_1= '(' ( (lv_axiomAnnotation_2_0= ruleAnnotation ) )* ( (lv_entity_3_0= ruleEntityDeclaration ) ) otherlv_4= ')' ) )
            // InternalOwl.g:806:2: (otherlv_0= 'Declaration' otherlv_1= '(' ( (lv_axiomAnnotation_2_0= ruleAnnotation ) )* ( (lv_entity_3_0= ruleEntityDeclaration ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:806:2: (otherlv_0= 'Declaration' otherlv_1= '(' ( (lv_axiomAnnotation_2_0= ruleAnnotation ) )* ( (lv_entity_3_0= ruleEntityDeclaration ) ) otherlv_4= ')' )
            // InternalOwl.g:807:3: otherlv_0= 'Declaration' otherlv_1= '(' ( (lv_axiomAnnotation_2_0= ruleAnnotation ) )* ( (lv_entity_3_0= ruleEntityDeclaration ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getDeclarationKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:815:3: ( (lv_axiomAnnotation_2_0= ruleAnnotation ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==89) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOwl.g:816:4: (lv_axiomAnnotation_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:816:4: (lv_axiomAnnotation_2_0= ruleAnnotation )
            	    // InternalOwl.g:817:5: lv_axiomAnnotation_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getDeclarationAccess().getAxiomAnnotationAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    break loop9;
                }
            } while (true);

            // InternalOwl.g:834:3: ( (lv_entity_3_0= ruleEntityDeclaration ) )
            // InternalOwl.g:835:4: (lv_entity_3_0= ruleEntityDeclaration )
            {
            // InternalOwl.g:835:4: (lv_entity_3_0= ruleEntityDeclaration )
            // InternalOwl.g:836:5: lv_entity_3_0= ruleEntityDeclaration
            {

            					newCompositeNode(grammarAccess.getDeclarationAccess().getEntityEntityDeclarationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:861:1: entryRuleEntityDeclaration returns [EObject current=null] : iv_ruleEntityDeclaration= ruleEntityDeclaration EOF ;
    public final EObject entryRuleEntityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityDeclaration = null;


        try {
            // InternalOwl.g:861:58: (iv_ruleEntityDeclaration= ruleEntityDeclaration EOF )
            // InternalOwl.g:862:2: iv_ruleEntityDeclaration= ruleEntityDeclaration EOF
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
    // InternalOwl.g:868:1: ruleEntityDeclaration returns [EObject current=null] : ( (otherlv_0= 'Class' otherlv_1= '(' this_Class_2= ruleClass otherlv_3= ')' ) | (otherlv_4= 'Datatype' otherlv_5= '(' this_Datatype_6= ruleDatatype otherlv_7= ')' ) | (otherlv_8= 'ObjectProperty' otherlv_9= '(' this_ObjectProperty_10= ruleObjectProperty otherlv_11= ')' ) | (otherlv_12= 'DataProperty' otherlv_13= '(' this_DataProperty_14= ruleDataProperty otherlv_15= ')' ) | (otherlv_16= 'AnnotationProperty' otherlv_17= '(' this_AnnotationProperty_18= ruleAnnotationProperty otherlv_19= ')' ) | (otherlv_20= 'NamedIndividual' otherlv_21= '(' this_NamedIndividual_22= ruleNamedIndividual otherlv_23= ')' ) ) ;
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
            // InternalOwl.g:874:2: ( ( (otherlv_0= 'Class' otherlv_1= '(' this_Class_2= ruleClass otherlv_3= ')' ) | (otherlv_4= 'Datatype' otherlv_5= '(' this_Datatype_6= ruleDatatype otherlv_7= ')' ) | (otherlv_8= 'ObjectProperty' otherlv_9= '(' this_ObjectProperty_10= ruleObjectProperty otherlv_11= ')' ) | (otherlv_12= 'DataProperty' otherlv_13= '(' this_DataProperty_14= ruleDataProperty otherlv_15= ')' ) | (otherlv_16= 'AnnotationProperty' otherlv_17= '(' this_AnnotationProperty_18= ruleAnnotationProperty otherlv_19= ')' ) | (otherlv_20= 'NamedIndividual' otherlv_21= '(' this_NamedIndividual_22= ruleNamedIndividual otherlv_23= ')' ) ) )
            // InternalOwl.g:875:2: ( (otherlv_0= 'Class' otherlv_1= '(' this_Class_2= ruleClass otherlv_3= ')' ) | (otherlv_4= 'Datatype' otherlv_5= '(' this_Datatype_6= ruleDatatype otherlv_7= ')' ) | (otherlv_8= 'ObjectProperty' otherlv_9= '(' this_ObjectProperty_10= ruleObjectProperty otherlv_11= ')' ) | (otherlv_12= 'DataProperty' otherlv_13= '(' this_DataProperty_14= ruleDataProperty otherlv_15= ')' ) | (otherlv_16= 'AnnotationProperty' otherlv_17= '(' this_AnnotationProperty_18= ruleAnnotationProperty otherlv_19= ')' ) | (otherlv_20= 'NamedIndividual' otherlv_21= '(' this_NamedIndividual_22= ruleNamedIndividual otherlv_23= ')' ) )
            {
            // InternalOwl.g:875:2: ( (otherlv_0= 'Class' otherlv_1= '(' this_Class_2= ruleClass otherlv_3= ')' ) | (otherlv_4= 'Datatype' otherlv_5= '(' this_Datatype_6= ruleDatatype otherlv_7= ')' ) | (otherlv_8= 'ObjectProperty' otherlv_9= '(' this_ObjectProperty_10= ruleObjectProperty otherlv_11= ')' ) | (otherlv_12= 'DataProperty' otherlv_13= '(' this_DataProperty_14= ruleDataProperty otherlv_15= ')' ) | (otherlv_16= 'AnnotationProperty' otherlv_17= '(' this_AnnotationProperty_18= ruleAnnotationProperty otherlv_19= ')' ) | (otherlv_20= 'NamedIndividual' otherlv_21= '(' this_NamedIndividual_22= ruleNamedIndividual otherlv_23= ')' ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt10=1;
                }
                break;
            case 28:
                {
                alt10=2;
                }
                break;
            case 29:
                {
                alt10=3;
                }
                break;
            case 30:
                {
                alt10=4;
                }
                break;
            case 31:
                {
                alt10=5;
                }
                break;
            case 32:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalOwl.g:876:3: (otherlv_0= 'Class' otherlv_1= '(' this_Class_2= ruleClass otherlv_3= ')' )
                    {
                    // InternalOwl.g:876:3: (otherlv_0= 'Class' otherlv_1= '(' this_Class_2= ruleClass otherlv_3= ')' )
                    // InternalOwl.g:877:4: otherlv_0= 'Class' otherlv_1= '(' this_Class_2= ruleClass otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getEntityDeclarationAccess().getClassKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntityDeclarationAccess().getLeftParenthesisKeyword_0_1());
                    			

                    				newCompositeNode(grammarAccess.getEntityDeclarationAccess().getClassParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_9);
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
                    // InternalOwl.g:899:3: (otherlv_4= 'Datatype' otherlv_5= '(' this_Datatype_6= ruleDatatype otherlv_7= ')' )
                    {
                    // InternalOwl.g:899:3: (otherlv_4= 'Datatype' otherlv_5= '(' this_Datatype_6= ruleDatatype otherlv_7= ')' )
                    // InternalOwl.g:900:4: otherlv_4= 'Datatype' otherlv_5= '(' this_Datatype_6= ruleDatatype otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityDeclarationAccess().getDatatypeKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntityDeclarationAccess().getLeftParenthesisKeyword_1_1());
                    			

                    				newCompositeNode(grammarAccess.getEntityDeclarationAccess().getDatatypeParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_9);
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
                    // InternalOwl.g:922:3: (otherlv_8= 'ObjectProperty' otherlv_9= '(' this_ObjectProperty_10= ruleObjectProperty otherlv_11= ')' )
                    {
                    // InternalOwl.g:922:3: (otherlv_8= 'ObjectProperty' otherlv_9= '(' this_ObjectProperty_10= ruleObjectProperty otherlv_11= ')' )
                    // InternalOwl.g:923:4: otherlv_8= 'ObjectProperty' otherlv_9= '(' this_ObjectProperty_10= ruleObjectProperty otherlv_11= ')'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getEntityDeclarationAccess().getObjectPropertyKeyword_2_0());
                    			
                    otherlv_9=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getEntityDeclarationAccess().getLeftParenthesisKeyword_2_1());
                    			

                    				newCompositeNode(grammarAccess.getEntityDeclarationAccess().getObjectPropertyParserRuleCall_2_2());
                    			
                    pushFollow(FOLLOW_9);
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
                    // InternalOwl.g:945:3: (otherlv_12= 'DataProperty' otherlv_13= '(' this_DataProperty_14= ruleDataProperty otherlv_15= ')' )
                    {
                    // InternalOwl.g:945:3: (otherlv_12= 'DataProperty' otherlv_13= '(' this_DataProperty_14= ruleDataProperty otherlv_15= ')' )
                    // InternalOwl.g:946:4: otherlv_12= 'DataProperty' otherlv_13= '(' this_DataProperty_14= ruleDataProperty otherlv_15= ')'
                    {
                    otherlv_12=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getEntityDeclarationAccess().getDataPropertyKeyword_3_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_13, grammarAccess.getEntityDeclarationAccess().getLeftParenthesisKeyword_3_1());
                    			

                    				newCompositeNode(grammarAccess.getEntityDeclarationAccess().getDataPropertyParserRuleCall_3_2());
                    			
                    pushFollow(FOLLOW_9);
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
                    // InternalOwl.g:968:3: (otherlv_16= 'AnnotationProperty' otherlv_17= '(' this_AnnotationProperty_18= ruleAnnotationProperty otherlv_19= ')' )
                    {
                    // InternalOwl.g:968:3: (otherlv_16= 'AnnotationProperty' otherlv_17= '(' this_AnnotationProperty_18= ruleAnnotationProperty otherlv_19= ')' )
                    // InternalOwl.g:969:4: otherlv_16= 'AnnotationProperty' otherlv_17= '(' this_AnnotationProperty_18= ruleAnnotationProperty otherlv_19= ')'
                    {
                    otherlv_16=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_16, grammarAccess.getEntityDeclarationAccess().getAnnotationPropertyKeyword_4_0());
                    			
                    otherlv_17=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getEntityDeclarationAccess().getLeftParenthesisKeyword_4_1());
                    			

                    				newCompositeNode(grammarAccess.getEntityDeclarationAccess().getAnnotationPropertyParserRuleCall_4_2());
                    			
                    pushFollow(FOLLOW_9);
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
                    // InternalOwl.g:991:3: (otherlv_20= 'NamedIndividual' otherlv_21= '(' this_NamedIndividual_22= ruleNamedIndividual otherlv_23= ')' )
                    {
                    // InternalOwl.g:991:3: (otherlv_20= 'NamedIndividual' otherlv_21= '(' this_NamedIndividual_22= ruleNamedIndividual otherlv_23= ')' )
                    // InternalOwl.g:992:4: otherlv_20= 'NamedIndividual' otherlv_21= '(' this_NamedIndividual_22= ruleNamedIndividual otherlv_23= ')'
                    {
                    otherlv_20=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_20, grammarAccess.getEntityDeclarationAccess().getNamedIndividualKeyword_5_0());
                    			
                    otherlv_21=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getEntityDeclarationAccess().getLeftParenthesisKeyword_5_1());
                    			

                    				newCompositeNode(grammarAccess.getEntityDeclarationAccess().getNamedIndividualParserRuleCall_5_2());
                    			
                    pushFollow(FOLLOW_9);
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
    // InternalOwl.g:1017:1: entryRuleObjectPropertyExpression returns [EObject current=null] : iv_ruleObjectPropertyExpression= ruleObjectPropertyExpression EOF ;
    public final EObject entryRuleObjectPropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectPropertyExpression = null;


        try {
            // InternalOwl.g:1017:65: (iv_ruleObjectPropertyExpression= ruleObjectPropertyExpression EOF )
            // InternalOwl.g:1018:2: iv_ruleObjectPropertyExpression= ruleObjectPropertyExpression EOF
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
    // InternalOwl.g:1024:1: ruleObjectPropertyExpression returns [EObject current=null] : (this_ObjectPropertyReference_0= ruleObjectPropertyReference | this_InverseObjectProperty_1= ruleInverseObjectProperty ) ;
    public final EObject ruleObjectPropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectPropertyReference_0 = null;

        EObject this_InverseObjectProperty_1 = null;



        	enterRule();

        try {
            // InternalOwl.g:1030:2: ( (this_ObjectPropertyReference_0= ruleObjectPropertyReference | this_InverseObjectProperty_1= ruleInverseObjectProperty ) )
            // InternalOwl.g:1031:2: (this_ObjectPropertyReference_0= ruleObjectPropertyReference | this_InverseObjectProperty_1= ruleInverseObjectProperty )
            {
            // InternalOwl.g:1031:2: (this_ObjectPropertyReference_0= ruleObjectPropertyReference | this_InverseObjectProperty_1= ruleInverseObjectProperty )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_FULL_IRI && LA11_0<=RULE_PN_LOCAL)) ) {
                alt11=1;
            }
            else if ( (LA11_0==33) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalOwl.g:1032:3: this_ObjectPropertyReference_0= ruleObjectPropertyReference
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
                    // InternalOwl.g:1041:3: this_InverseObjectProperty_1= ruleInverseObjectProperty
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
    // InternalOwl.g:1053:1: entryRuleObjectPropertyReference returns [EObject current=null] : iv_ruleObjectPropertyReference= ruleObjectPropertyReference EOF ;
    public final EObject entryRuleObjectPropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectPropertyReference = null;


        try {
            // InternalOwl.g:1053:64: (iv_ruleObjectPropertyReference= ruleObjectPropertyReference EOF )
            // InternalOwl.g:1054:2: iv_ruleObjectPropertyReference= ruleObjectPropertyReference EOF
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
    // InternalOwl.g:1060:1: ruleObjectPropertyReference returns [EObject current=null] : ( (lv_objectProperty_0_0= ruleIRI ) ) ;
    public final EObject ruleObjectPropertyReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_objectProperty_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1066:2: ( ( (lv_objectProperty_0_0= ruleIRI ) ) )
            // InternalOwl.g:1067:2: ( (lv_objectProperty_0_0= ruleIRI ) )
            {
            // InternalOwl.g:1067:2: ( (lv_objectProperty_0_0= ruleIRI ) )
            // InternalOwl.g:1068:3: (lv_objectProperty_0_0= ruleIRI )
            {
            // InternalOwl.g:1068:3: (lv_objectProperty_0_0= ruleIRI )
            // InternalOwl.g:1069:4: lv_objectProperty_0_0= ruleIRI
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
    // InternalOwl.g:1089:1: entryRuleInverseObjectProperty returns [EObject current=null] : iv_ruleInverseObjectProperty= ruleInverseObjectProperty EOF ;
    public final EObject entryRuleInverseObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInverseObjectProperty = null;


        try {
            // InternalOwl.g:1089:62: (iv_ruleInverseObjectProperty= ruleInverseObjectProperty EOF )
            // InternalOwl.g:1090:2: iv_ruleInverseObjectProperty= ruleInverseObjectProperty EOF
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
    // InternalOwl.g:1096:1: ruleInverseObjectProperty returns [EObject current=null] : (otherlv_0= 'ObjectInverseOf' otherlv_1= '(' ( (lv_objectProperty_2_0= ruleIRI ) ) otherlv_3= ')' ) ;
    public final EObject ruleInverseObjectProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_objectProperty_2_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1102:2: ( (otherlv_0= 'ObjectInverseOf' otherlv_1= '(' ( (lv_objectProperty_2_0= ruleIRI ) ) otherlv_3= ')' ) )
            // InternalOwl.g:1103:2: (otherlv_0= 'ObjectInverseOf' otherlv_1= '(' ( (lv_objectProperty_2_0= ruleIRI ) ) otherlv_3= ')' )
            {
            // InternalOwl.g:1103:2: (otherlv_0= 'ObjectInverseOf' otherlv_1= '(' ( (lv_objectProperty_2_0= ruleIRI ) ) otherlv_3= ')' )
            // InternalOwl.g:1104:3: otherlv_0= 'ObjectInverseOf' otherlv_1= '(' ( (lv_objectProperty_2_0= ruleIRI ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInverseObjectPropertyAccess().getObjectInverseOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getInverseObjectPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:1112:3: ( (lv_objectProperty_2_0= ruleIRI ) )
            // InternalOwl.g:1113:4: (lv_objectProperty_2_0= ruleIRI )
            {
            // InternalOwl.g:1113:4: (lv_objectProperty_2_0= ruleIRI )
            // InternalOwl.g:1114:5: lv_objectProperty_2_0= ruleIRI
            {

            					newCompositeNode(grammarAccess.getInverseObjectPropertyAccess().getObjectPropertyIRIParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:1139:1: entryRuleDataPropertyExpression returns [EObject current=null] : iv_ruleDataPropertyExpression= ruleDataPropertyExpression EOF ;
    public final EObject entryRuleDataPropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPropertyExpression = null;


        try {
            // InternalOwl.g:1139:63: (iv_ruleDataPropertyExpression= ruleDataPropertyExpression EOF )
            // InternalOwl.g:1140:2: iv_ruleDataPropertyExpression= ruleDataPropertyExpression EOF
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
    // InternalOwl.g:1146:1: ruleDataPropertyExpression returns [EObject current=null] : this_DataPropertyReference_0= ruleDataPropertyReference ;
    public final EObject ruleDataPropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DataPropertyReference_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1152:2: (this_DataPropertyReference_0= ruleDataPropertyReference )
            // InternalOwl.g:1153:2: this_DataPropertyReference_0= ruleDataPropertyReference
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
    // InternalOwl.g:1164:1: entryRuleDataPropertyReference returns [EObject current=null] : iv_ruleDataPropertyReference= ruleDataPropertyReference EOF ;
    public final EObject entryRuleDataPropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPropertyReference = null;


        try {
            // InternalOwl.g:1164:62: (iv_ruleDataPropertyReference= ruleDataPropertyReference EOF )
            // InternalOwl.g:1165:2: iv_ruleDataPropertyReference= ruleDataPropertyReference EOF
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
    // InternalOwl.g:1171:1: ruleDataPropertyReference returns [EObject current=null] : ( (lv_dataProperty_0_0= ruleIRI ) ) ;
    public final EObject ruleDataPropertyReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_dataProperty_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1177:2: ( ( (lv_dataProperty_0_0= ruleIRI ) ) )
            // InternalOwl.g:1178:2: ( (lv_dataProperty_0_0= ruleIRI ) )
            {
            // InternalOwl.g:1178:2: ( (lv_dataProperty_0_0= ruleIRI ) )
            // InternalOwl.g:1179:3: (lv_dataProperty_0_0= ruleIRI )
            {
            // InternalOwl.g:1179:3: (lv_dataProperty_0_0= ruleIRI )
            // InternalOwl.g:1180:4: lv_dataProperty_0_0= ruleIRI
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
    // InternalOwl.g:1200:1: entryRuleDataRange returns [EObject current=null] : iv_ruleDataRange= ruleDataRange EOF ;
    public final EObject entryRuleDataRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataRange = null;


        try {
            // InternalOwl.g:1200:50: (iv_ruleDataRange= ruleDataRange EOF )
            // InternalOwl.g:1201:2: iv_ruleDataRange= ruleDataRange EOF
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
    // InternalOwl.g:1207:1: ruleDataRange returns [EObject current=null] : (this_DatatypeReference_0= ruleDatatypeReference | this_DataIntersectionOf_1= ruleDataIntersectionOf | this_DataUnionOf_2= ruleDataUnionOf | this_DataComplementOf_3= ruleDataComplementOf | this_DataOneOf_4= ruleDataOneOf | this_DatatypeRestriction_5= ruleDatatypeRestriction ) ;
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
            // InternalOwl.g:1213:2: ( (this_DatatypeReference_0= ruleDatatypeReference | this_DataIntersectionOf_1= ruleDataIntersectionOf | this_DataUnionOf_2= ruleDataUnionOf | this_DataComplementOf_3= ruleDataComplementOf | this_DataOneOf_4= ruleDataOneOf | this_DatatypeRestriction_5= ruleDatatypeRestriction ) )
            // InternalOwl.g:1214:2: (this_DatatypeReference_0= ruleDatatypeReference | this_DataIntersectionOf_1= ruleDataIntersectionOf | this_DataUnionOf_2= ruleDataUnionOf | this_DataComplementOf_3= ruleDataComplementOf | this_DataOneOf_4= ruleDataOneOf | this_DatatypeRestriction_5= ruleDatatypeRestriction )
            {
            // InternalOwl.g:1214:2: (this_DatatypeReference_0= ruleDatatypeReference | this_DataIntersectionOf_1= ruleDataIntersectionOf | this_DataUnionOf_2= ruleDataUnionOf | this_DataComplementOf_3= ruleDataComplementOf | this_DataOneOf_4= ruleDataOneOf | this_DatatypeRestriction_5= ruleDatatypeRestriction )
            int alt12=6;
            switch ( input.LA(1) ) {
            case RULE_FULL_IRI:
            case RULE_PN_PREFIX:
            case RULE_PN_LOCAL:
                {
                alt12=1;
                }
                break;
            case 34:
                {
                alt12=2;
                }
                break;
            case 35:
                {
                alt12=3;
                }
                break;
            case 36:
                {
                alt12=4;
                }
                break;
            case 37:
                {
                alt12=5;
                }
                break;
            case 38:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalOwl.g:1215:3: this_DatatypeReference_0= ruleDatatypeReference
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
                    // InternalOwl.g:1224:3: this_DataIntersectionOf_1= ruleDataIntersectionOf
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
                    // InternalOwl.g:1233:3: this_DataUnionOf_2= ruleDataUnionOf
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
                    // InternalOwl.g:1242:3: this_DataComplementOf_3= ruleDataComplementOf
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
                    // InternalOwl.g:1251:3: this_DataOneOf_4= ruleDataOneOf
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
                    // InternalOwl.g:1260:3: this_DatatypeRestriction_5= ruleDatatypeRestriction
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
    // InternalOwl.g:1272:1: entryRuleDatatypeReference returns [EObject current=null] : iv_ruleDatatypeReference= ruleDatatypeReference EOF ;
    public final EObject entryRuleDatatypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypeReference = null;


        try {
            // InternalOwl.g:1272:58: (iv_ruleDatatypeReference= ruleDatatypeReference EOF )
            // InternalOwl.g:1273:2: iv_ruleDatatypeReference= ruleDatatypeReference EOF
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
    // InternalOwl.g:1279:1: ruleDatatypeReference returns [EObject current=null] : ( (lv_datatype_0_0= ruleIRI ) ) ;
    public final EObject ruleDatatypeReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_datatype_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1285:2: ( ( (lv_datatype_0_0= ruleIRI ) ) )
            // InternalOwl.g:1286:2: ( (lv_datatype_0_0= ruleIRI ) )
            {
            // InternalOwl.g:1286:2: ( (lv_datatype_0_0= ruleIRI ) )
            // InternalOwl.g:1287:3: (lv_datatype_0_0= ruleIRI )
            {
            // InternalOwl.g:1287:3: (lv_datatype_0_0= ruleIRI )
            // InternalOwl.g:1288:4: lv_datatype_0_0= ruleIRI
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
    // InternalOwl.g:1308:1: entryRuleDataIntersectionOf returns [EObject current=null] : iv_ruleDataIntersectionOf= ruleDataIntersectionOf EOF ;
    public final EObject entryRuleDataIntersectionOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataIntersectionOf = null;


        try {
            // InternalOwl.g:1308:59: (iv_ruleDataIntersectionOf= ruleDataIntersectionOf EOF )
            // InternalOwl.g:1309:2: iv_ruleDataIntersectionOf= ruleDataIntersectionOf EOF
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
    // InternalOwl.g:1315:1: ruleDataIntersectionOf returns [EObject current=null] : (otherlv_0= 'DataIntersectionOf' otherlv_1= '(' ( (lv_dataRanges_2_0= ruleDataRange ) ) ( (lv_dataRanges_3_0= ruleDataRange ) )+ otherlv_4= ')' ) ;
    public final EObject ruleDataIntersectionOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_dataRanges_2_0 = null;

        EObject lv_dataRanges_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1321:2: ( (otherlv_0= 'DataIntersectionOf' otherlv_1= '(' ( (lv_dataRanges_2_0= ruleDataRange ) ) ( (lv_dataRanges_3_0= ruleDataRange ) )+ otherlv_4= ')' ) )
            // InternalOwl.g:1322:2: (otherlv_0= 'DataIntersectionOf' otherlv_1= '(' ( (lv_dataRanges_2_0= ruleDataRange ) ) ( (lv_dataRanges_3_0= ruleDataRange ) )+ otherlv_4= ')' )
            {
            // InternalOwl.g:1322:2: (otherlv_0= 'DataIntersectionOf' otherlv_1= '(' ( (lv_dataRanges_2_0= ruleDataRange ) ) ( (lv_dataRanges_3_0= ruleDataRange ) )+ otherlv_4= ')' )
            // InternalOwl.g:1323:3: otherlv_0= 'DataIntersectionOf' otherlv_1= '(' ( (lv_dataRanges_2_0= ruleDataRange ) ) ( (lv_dataRanges_3_0= ruleDataRange ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataIntersectionOfAccess().getDataIntersectionOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDataIntersectionOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:1331:3: ( (lv_dataRanges_2_0= ruleDataRange ) )
            // InternalOwl.g:1332:4: (lv_dataRanges_2_0= ruleDataRange )
            {
            // InternalOwl.g:1332:4: (lv_dataRanges_2_0= ruleDataRange )
            // InternalOwl.g:1333:5: lv_dataRanges_2_0= ruleDataRange
            {

            					newCompositeNode(grammarAccess.getDataIntersectionOfAccess().getDataRangesDataRangeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalOwl.g:1350:3: ( (lv_dataRanges_3_0= ruleDataRange ) )+
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
            	    // InternalOwl.g:1351:4: (lv_dataRanges_3_0= ruleDataRange )
            	    {
            	    // InternalOwl.g:1351:4: (lv_dataRanges_3_0= ruleDataRange )
            	    // InternalOwl.g:1352:5: lv_dataRanges_3_0= ruleDataRange
            	    {

            	    					newCompositeNode(grammarAccess.getDataIntersectionOfAccess().getDataRangesDataRangeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
    // InternalOwl.g:1377:1: entryRuleDataUnionOf returns [EObject current=null] : iv_ruleDataUnionOf= ruleDataUnionOf EOF ;
    public final EObject entryRuleDataUnionOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataUnionOf = null;


        try {
            // InternalOwl.g:1377:52: (iv_ruleDataUnionOf= ruleDataUnionOf EOF )
            // InternalOwl.g:1378:2: iv_ruleDataUnionOf= ruleDataUnionOf EOF
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
    // InternalOwl.g:1384:1: ruleDataUnionOf returns [EObject current=null] : (otherlv_0= 'DataUnionOf' otherlv_1= '(' ( (lv_dataRanges_2_0= ruleDataRange ) ) ( (lv_dataRanges_3_0= ruleDataRange ) )+ otherlv_4= ')' ) ;
    public final EObject ruleDataUnionOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_dataRanges_2_0 = null;

        EObject lv_dataRanges_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1390:2: ( (otherlv_0= 'DataUnionOf' otherlv_1= '(' ( (lv_dataRanges_2_0= ruleDataRange ) ) ( (lv_dataRanges_3_0= ruleDataRange ) )+ otherlv_4= ')' ) )
            // InternalOwl.g:1391:2: (otherlv_0= 'DataUnionOf' otherlv_1= '(' ( (lv_dataRanges_2_0= ruleDataRange ) ) ( (lv_dataRanges_3_0= ruleDataRange ) )+ otherlv_4= ')' )
            {
            // InternalOwl.g:1391:2: (otherlv_0= 'DataUnionOf' otherlv_1= '(' ( (lv_dataRanges_2_0= ruleDataRange ) ) ( (lv_dataRanges_3_0= ruleDataRange ) )+ otherlv_4= ')' )
            // InternalOwl.g:1392:3: otherlv_0= 'DataUnionOf' otherlv_1= '(' ( (lv_dataRanges_2_0= ruleDataRange ) ) ( (lv_dataRanges_3_0= ruleDataRange ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataUnionOfAccess().getDataUnionOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDataUnionOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:1400:3: ( (lv_dataRanges_2_0= ruleDataRange ) )
            // InternalOwl.g:1401:4: (lv_dataRanges_2_0= ruleDataRange )
            {
            // InternalOwl.g:1401:4: (lv_dataRanges_2_0= ruleDataRange )
            // InternalOwl.g:1402:5: lv_dataRanges_2_0= ruleDataRange
            {

            					newCompositeNode(grammarAccess.getDataUnionOfAccess().getDataRangesDataRangeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalOwl.g:1419:3: ( (lv_dataRanges_3_0= ruleDataRange ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_FULL_IRI && LA14_0<=RULE_PN_LOCAL)||(LA14_0>=34 && LA14_0<=38)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalOwl.g:1420:4: (lv_dataRanges_3_0= ruleDataRange )
            	    {
            	    // InternalOwl.g:1420:4: (lv_dataRanges_3_0= ruleDataRange )
            	    // InternalOwl.g:1421:5: lv_dataRanges_3_0= ruleDataRange
            	    {

            	    					newCompositeNode(grammarAccess.getDataUnionOfAccess().getDataRangesDataRangeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
    // InternalOwl.g:1446:1: entryRuleDataComplementOf returns [EObject current=null] : iv_ruleDataComplementOf= ruleDataComplementOf EOF ;
    public final EObject entryRuleDataComplementOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataComplementOf = null;


        try {
            // InternalOwl.g:1446:57: (iv_ruleDataComplementOf= ruleDataComplementOf EOF )
            // InternalOwl.g:1447:2: iv_ruleDataComplementOf= ruleDataComplementOf EOF
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
    // InternalOwl.g:1453:1: ruleDataComplementOf returns [EObject current=null] : (otherlv_0= 'DataComplementOf' otherlv_1= '(' ( (lv_dataRange_2_0= ruleDataRange ) ) otherlv_3= ')' ) ;
    public final EObject ruleDataComplementOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dataRange_2_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1459:2: ( (otherlv_0= 'DataComplementOf' otherlv_1= '(' ( (lv_dataRange_2_0= ruleDataRange ) ) otherlv_3= ')' ) )
            // InternalOwl.g:1460:2: (otherlv_0= 'DataComplementOf' otherlv_1= '(' ( (lv_dataRange_2_0= ruleDataRange ) ) otherlv_3= ')' )
            {
            // InternalOwl.g:1460:2: (otherlv_0= 'DataComplementOf' otherlv_1= '(' ( (lv_dataRange_2_0= ruleDataRange ) ) otherlv_3= ')' )
            // InternalOwl.g:1461:3: otherlv_0= 'DataComplementOf' otherlv_1= '(' ( (lv_dataRange_2_0= ruleDataRange ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataComplementOfAccess().getDataComplementOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDataComplementOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:1469:3: ( (lv_dataRange_2_0= ruleDataRange ) )
            // InternalOwl.g:1470:4: (lv_dataRange_2_0= ruleDataRange )
            {
            // InternalOwl.g:1470:4: (lv_dataRange_2_0= ruleDataRange )
            // InternalOwl.g:1471:5: lv_dataRange_2_0= ruleDataRange
            {

            					newCompositeNode(grammarAccess.getDataComplementOfAccess().getDataRangeDataRangeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:1496:1: entryRuleDataOneOf returns [EObject current=null] : iv_ruleDataOneOf= ruleDataOneOf EOF ;
    public final EObject entryRuleDataOneOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataOneOf = null;


        try {
            // InternalOwl.g:1496:50: (iv_ruleDataOneOf= ruleDataOneOf EOF )
            // InternalOwl.g:1497:2: iv_ruleDataOneOf= ruleDataOneOf EOF
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
    // InternalOwl.g:1503:1: ruleDataOneOf returns [EObject current=null] : (otherlv_0= 'DataOneOf' otherlv_1= '(' ( (lv_literals_2_0= ruleLiteral ) )+ otherlv_3= ')' ) ;
    public final EObject ruleDataOneOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_literals_2_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1509:2: ( (otherlv_0= 'DataOneOf' otherlv_1= '(' ( (lv_literals_2_0= ruleLiteral ) )+ otherlv_3= ')' ) )
            // InternalOwl.g:1510:2: (otherlv_0= 'DataOneOf' otherlv_1= '(' ( (lv_literals_2_0= ruleLiteral ) )+ otherlv_3= ')' )
            {
            // InternalOwl.g:1510:2: (otherlv_0= 'DataOneOf' otherlv_1= '(' ( (lv_literals_2_0= ruleLiteral ) )+ otherlv_3= ')' )
            // InternalOwl.g:1511:3: otherlv_0= 'DataOneOf' otherlv_1= '(' ( (lv_literals_2_0= ruleLiteral ) )+ otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataOneOfAccess().getDataOneOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getDataOneOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:1519:3: ( (lv_literals_2_0= ruleLiteral ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalOwl.g:1520:4: (lv_literals_2_0= ruleLiteral )
            	    {
            	    // InternalOwl.g:1520:4: (lv_literals_2_0= ruleLiteral )
            	    // InternalOwl.g:1521:5: lv_literals_2_0= ruleLiteral
            	    {

            	    					newCompositeNode(grammarAccess.getDataOneOfAccess().getLiteralsLiteralParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    // InternalOwl.g:1546:1: entryRuleDatatypeRestriction returns [EObject current=null] : iv_ruleDatatypeRestriction= ruleDatatypeRestriction EOF ;
    public final EObject entryRuleDatatypeRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypeRestriction = null;


        try {
            // InternalOwl.g:1546:60: (iv_ruleDatatypeRestriction= ruleDatatypeRestriction EOF )
            // InternalOwl.g:1547:2: iv_ruleDatatypeRestriction= ruleDatatypeRestriction EOF
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
    // InternalOwl.g:1553:1: ruleDatatypeRestriction returns [EObject current=null] : (otherlv_0= 'DatatypeRestriction' otherlv_1= '(' ( (lv_dataType_2_0= ruleDatatypeReference ) ) ( (lv_restrictions_3_0= ruleFacetRestriction ) )+ otherlv_4= ')' ) ;
    public final EObject ruleDatatypeRestriction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_dataType_2_0 = null;

        EObject lv_restrictions_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1559:2: ( (otherlv_0= 'DatatypeRestriction' otherlv_1= '(' ( (lv_dataType_2_0= ruleDatatypeReference ) ) ( (lv_restrictions_3_0= ruleFacetRestriction ) )+ otherlv_4= ')' ) )
            // InternalOwl.g:1560:2: (otherlv_0= 'DatatypeRestriction' otherlv_1= '(' ( (lv_dataType_2_0= ruleDatatypeReference ) ) ( (lv_restrictions_3_0= ruleFacetRestriction ) )+ otherlv_4= ')' )
            {
            // InternalOwl.g:1560:2: (otherlv_0= 'DatatypeRestriction' otherlv_1= '(' ( (lv_dataType_2_0= ruleDatatypeReference ) ) ( (lv_restrictions_3_0= ruleFacetRestriction ) )+ otherlv_4= ')' )
            // InternalOwl.g:1561:3: otherlv_0= 'DatatypeRestriction' otherlv_1= '(' ( (lv_dataType_2_0= ruleDatatypeReference ) ) ( (lv_restrictions_3_0= ruleFacetRestriction ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDatatypeRestrictionAccess().getDatatypeRestrictionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDatatypeRestrictionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:1569:3: ( (lv_dataType_2_0= ruleDatatypeReference ) )
            // InternalOwl.g:1570:4: (lv_dataType_2_0= ruleDatatypeReference )
            {
            // InternalOwl.g:1570:4: (lv_dataType_2_0= ruleDatatypeReference )
            // InternalOwl.g:1571:5: lv_dataType_2_0= ruleDatatypeReference
            {

            					newCompositeNode(grammarAccess.getDatatypeRestrictionAccess().getDataTypeDatatypeReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalOwl.g:1588:3: ( (lv_restrictions_3_0= ruleFacetRestriction ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_FULL_IRI && LA16_0<=RULE_PN_LOCAL)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOwl.g:1589:4: (lv_restrictions_3_0= ruleFacetRestriction )
            	    {
            	    // InternalOwl.g:1589:4: (lv_restrictions_3_0= ruleFacetRestriction )
            	    // InternalOwl.g:1590:5: lv_restrictions_3_0= ruleFacetRestriction
            	    {

            	    					newCompositeNode(grammarAccess.getDatatypeRestrictionAccess().getRestrictionsFacetRestrictionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
    // InternalOwl.g:1615:1: entryRuleFacetRestriction returns [EObject current=null] : iv_ruleFacetRestriction= ruleFacetRestriction EOF ;
    public final EObject entryRuleFacetRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetRestriction = null;


        try {
            // InternalOwl.g:1615:57: (iv_ruleFacetRestriction= ruleFacetRestriction EOF )
            // InternalOwl.g:1616:2: iv_ruleFacetRestriction= ruleFacetRestriction EOF
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
    // InternalOwl.g:1622:1: ruleFacetRestriction returns [EObject current=null] : ( ( (lv_constrainingFacet_0_0= ruleIRI ) ) ( (lv_restrictionValue_1_0= ruleLiteral ) ) ) ;
    public final EObject ruleFacetRestriction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_constrainingFacet_0_0 = null;

        EObject lv_restrictionValue_1_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1628:2: ( ( ( (lv_constrainingFacet_0_0= ruleIRI ) ) ( (lv_restrictionValue_1_0= ruleLiteral ) ) ) )
            // InternalOwl.g:1629:2: ( ( (lv_constrainingFacet_0_0= ruleIRI ) ) ( (lv_restrictionValue_1_0= ruleLiteral ) ) )
            {
            // InternalOwl.g:1629:2: ( ( (lv_constrainingFacet_0_0= ruleIRI ) ) ( (lv_restrictionValue_1_0= ruleLiteral ) ) )
            // InternalOwl.g:1630:3: ( (lv_constrainingFacet_0_0= ruleIRI ) ) ( (lv_restrictionValue_1_0= ruleLiteral ) )
            {
            // InternalOwl.g:1630:3: ( (lv_constrainingFacet_0_0= ruleIRI ) )
            // InternalOwl.g:1631:4: (lv_constrainingFacet_0_0= ruleIRI )
            {
            // InternalOwl.g:1631:4: (lv_constrainingFacet_0_0= ruleIRI )
            // InternalOwl.g:1632:5: lv_constrainingFacet_0_0= ruleIRI
            {

            					newCompositeNode(grammarAccess.getFacetRestrictionAccess().getConstrainingFacetIRIParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalOwl.g:1649:3: ( (lv_restrictionValue_1_0= ruleLiteral ) )
            // InternalOwl.g:1650:4: (lv_restrictionValue_1_0= ruleLiteral )
            {
            // InternalOwl.g:1650:4: (lv_restrictionValue_1_0= ruleLiteral )
            // InternalOwl.g:1651:5: lv_restrictionValue_1_0= ruleLiteral
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
    // InternalOwl.g:1672:1: entryRuleClassExpression returns [EObject current=null] : iv_ruleClassExpression= ruleClassExpression EOF ;
    public final EObject entryRuleClassExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassExpression = null;


        try {
            // InternalOwl.g:1672:56: (iv_ruleClassExpression= ruleClassExpression EOF )
            // InternalOwl.g:1673:2: iv_ruleClassExpression= ruleClassExpression EOF
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
    // InternalOwl.g:1679:1: ruleClassExpression returns [EObject current=null] : (this_ClassReference_0= ruleClassReference | this_ObjectIntersectionOf_1= ruleObjectIntersectionOf | this_ObjectUnionOf_2= ruleObjectUnionOf | this_ObjectComplementOf_3= ruleObjectComplementOf | this_ObjectOneOf_4= ruleObjectOneOf | this_ObjectSomeValuesFrom_5= ruleObjectSomeValuesFrom | this_ObjectAllValuesFrom_6= ruleObjectAllValuesFrom | this_ObjectHasValue_7= ruleObjectHasValue | this_ObjectHasSelf_8= ruleObjectHasSelf | this_ObjectMinCardinality_9= ruleObjectMinCardinality | this_ObjectMaxCardinality_10= ruleObjectMaxCardinality | this_ObjectExactCardinality_11= ruleObjectExactCardinality | this_DataSomeValuesFrom_12= ruleDataSomeValuesFrom | this_DataAllValuesFrom_13= ruleDataAllValuesFrom | this_DataHasValue_14= ruleDataHasValue | this_DataMinCardinality_15= ruleDataMinCardinality | this_DataMaxCardinality_16= ruleDataMaxCardinality | this_DataExactCardinality_17= ruleDataExactCardinality ) ;
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
            // InternalOwl.g:1685:2: ( (this_ClassReference_0= ruleClassReference | this_ObjectIntersectionOf_1= ruleObjectIntersectionOf | this_ObjectUnionOf_2= ruleObjectUnionOf | this_ObjectComplementOf_3= ruleObjectComplementOf | this_ObjectOneOf_4= ruleObjectOneOf | this_ObjectSomeValuesFrom_5= ruleObjectSomeValuesFrom | this_ObjectAllValuesFrom_6= ruleObjectAllValuesFrom | this_ObjectHasValue_7= ruleObjectHasValue | this_ObjectHasSelf_8= ruleObjectHasSelf | this_ObjectMinCardinality_9= ruleObjectMinCardinality | this_ObjectMaxCardinality_10= ruleObjectMaxCardinality | this_ObjectExactCardinality_11= ruleObjectExactCardinality | this_DataSomeValuesFrom_12= ruleDataSomeValuesFrom | this_DataAllValuesFrom_13= ruleDataAllValuesFrom | this_DataHasValue_14= ruleDataHasValue | this_DataMinCardinality_15= ruleDataMinCardinality | this_DataMaxCardinality_16= ruleDataMaxCardinality | this_DataExactCardinality_17= ruleDataExactCardinality ) )
            // InternalOwl.g:1686:2: (this_ClassReference_0= ruleClassReference | this_ObjectIntersectionOf_1= ruleObjectIntersectionOf | this_ObjectUnionOf_2= ruleObjectUnionOf | this_ObjectComplementOf_3= ruleObjectComplementOf | this_ObjectOneOf_4= ruleObjectOneOf | this_ObjectSomeValuesFrom_5= ruleObjectSomeValuesFrom | this_ObjectAllValuesFrom_6= ruleObjectAllValuesFrom | this_ObjectHasValue_7= ruleObjectHasValue | this_ObjectHasSelf_8= ruleObjectHasSelf | this_ObjectMinCardinality_9= ruleObjectMinCardinality | this_ObjectMaxCardinality_10= ruleObjectMaxCardinality | this_ObjectExactCardinality_11= ruleObjectExactCardinality | this_DataSomeValuesFrom_12= ruleDataSomeValuesFrom | this_DataAllValuesFrom_13= ruleDataAllValuesFrom | this_DataHasValue_14= ruleDataHasValue | this_DataMinCardinality_15= ruleDataMinCardinality | this_DataMaxCardinality_16= ruleDataMaxCardinality | this_DataExactCardinality_17= ruleDataExactCardinality )
            {
            // InternalOwl.g:1686:2: (this_ClassReference_0= ruleClassReference | this_ObjectIntersectionOf_1= ruleObjectIntersectionOf | this_ObjectUnionOf_2= ruleObjectUnionOf | this_ObjectComplementOf_3= ruleObjectComplementOf | this_ObjectOneOf_4= ruleObjectOneOf | this_ObjectSomeValuesFrom_5= ruleObjectSomeValuesFrom | this_ObjectAllValuesFrom_6= ruleObjectAllValuesFrom | this_ObjectHasValue_7= ruleObjectHasValue | this_ObjectHasSelf_8= ruleObjectHasSelf | this_ObjectMinCardinality_9= ruleObjectMinCardinality | this_ObjectMaxCardinality_10= ruleObjectMaxCardinality | this_ObjectExactCardinality_11= ruleObjectExactCardinality | this_DataSomeValuesFrom_12= ruleDataSomeValuesFrom | this_DataAllValuesFrom_13= ruleDataAllValuesFrom | this_DataHasValue_14= ruleDataHasValue | this_DataMinCardinality_15= ruleDataMinCardinality | this_DataMaxCardinality_16= ruleDataMaxCardinality | this_DataExactCardinality_17= ruleDataExactCardinality )
            int alt17=18;
            switch ( input.LA(1) ) {
            case RULE_FULL_IRI:
            case RULE_PN_PREFIX:
            case RULE_PN_LOCAL:
                {
                alt17=1;
                }
                break;
            case 39:
                {
                alt17=2;
                }
                break;
            case 40:
                {
                alt17=3;
                }
                break;
            case 41:
                {
                alt17=4;
                }
                break;
            case 42:
                {
                alt17=5;
                }
                break;
            case 43:
                {
                alt17=6;
                }
                break;
            case 44:
                {
                alt17=7;
                }
                break;
            case 45:
                {
                alt17=8;
                }
                break;
            case 46:
                {
                alt17=9;
                }
                break;
            case 47:
                {
                alt17=10;
                }
                break;
            case 48:
                {
                alt17=11;
                }
                break;
            case 49:
                {
                alt17=12;
                }
                break;
            case 50:
                {
                alt17=13;
                }
                break;
            case 51:
                {
                alt17=14;
                }
                break;
            case 52:
                {
                alt17=15;
                }
                break;
            case 53:
                {
                alt17=16;
                }
                break;
            case 54:
                {
                alt17=17;
                }
                break;
            case 55:
                {
                alt17=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalOwl.g:1687:3: this_ClassReference_0= ruleClassReference
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
                    // InternalOwl.g:1696:3: this_ObjectIntersectionOf_1= ruleObjectIntersectionOf
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
                    // InternalOwl.g:1705:3: this_ObjectUnionOf_2= ruleObjectUnionOf
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
                    // InternalOwl.g:1714:3: this_ObjectComplementOf_3= ruleObjectComplementOf
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
                    // InternalOwl.g:1723:3: this_ObjectOneOf_4= ruleObjectOneOf
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
                    // InternalOwl.g:1732:3: this_ObjectSomeValuesFrom_5= ruleObjectSomeValuesFrom
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
                    // InternalOwl.g:1741:3: this_ObjectAllValuesFrom_6= ruleObjectAllValuesFrom
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
                    // InternalOwl.g:1750:3: this_ObjectHasValue_7= ruleObjectHasValue
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
                    // InternalOwl.g:1759:3: this_ObjectHasSelf_8= ruleObjectHasSelf
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
                    // InternalOwl.g:1768:3: this_ObjectMinCardinality_9= ruleObjectMinCardinality
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
                    // InternalOwl.g:1777:3: this_ObjectMaxCardinality_10= ruleObjectMaxCardinality
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
                    // InternalOwl.g:1786:3: this_ObjectExactCardinality_11= ruleObjectExactCardinality
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
                    // InternalOwl.g:1795:3: this_DataSomeValuesFrom_12= ruleDataSomeValuesFrom
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
                    // InternalOwl.g:1804:3: this_DataAllValuesFrom_13= ruleDataAllValuesFrom
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
                    // InternalOwl.g:1813:3: this_DataHasValue_14= ruleDataHasValue
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
                    // InternalOwl.g:1822:3: this_DataMinCardinality_15= ruleDataMinCardinality
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
                    // InternalOwl.g:1831:3: this_DataMaxCardinality_16= ruleDataMaxCardinality
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
                    // InternalOwl.g:1840:3: this_DataExactCardinality_17= ruleDataExactCardinality
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
    // InternalOwl.g:1852:1: entryRuleClassReference returns [EObject current=null] : iv_ruleClassReference= ruleClassReference EOF ;
    public final EObject entryRuleClassReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassReference = null;


        try {
            // InternalOwl.g:1852:55: (iv_ruleClassReference= ruleClassReference EOF )
            // InternalOwl.g:1853:2: iv_ruleClassReference= ruleClassReference EOF
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
    // InternalOwl.g:1859:1: ruleClassReference returns [EObject current=null] : ( (lv_class_0_0= ruleIRI ) ) ;
    public final EObject ruleClassReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_class_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1865:2: ( ( (lv_class_0_0= ruleIRI ) ) )
            // InternalOwl.g:1866:2: ( (lv_class_0_0= ruleIRI ) )
            {
            // InternalOwl.g:1866:2: ( (lv_class_0_0= ruleIRI ) )
            // InternalOwl.g:1867:3: (lv_class_0_0= ruleIRI )
            {
            // InternalOwl.g:1867:3: (lv_class_0_0= ruleIRI )
            // InternalOwl.g:1868:4: lv_class_0_0= ruleIRI
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
    // InternalOwl.g:1888:1: entryRuleObjectIntersectionOf returns [EObject current=null] : iv_ruleObjectIntersectionOf= ruleObjectIntersectionOf EOF ;
    public final EObject entryRuleObjectIntersectionOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectIntersectionOf = null;


        try {
            // InternalOwl.g:1888:61: (iv_ruleObjectIntersectionOf= ruleObjectIntersectionOf EOF )
            // InternalOwl.g:1889:2: iv_ruleObjectIntersectionOf= ruleObjectIntersectionOf EOF
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
    // InternalOwl.g:1895:1: ruleObjectIntersectionOf returns [EObject current=null] : (otherlv_0= 'ObjectIntersectionOf' otherlv_1= '(' ( (lv_classExpressions_2_0= ruleClassExpression ) )+ otherlv_3= ')' ) ;
    public final EObject ruleObjectIntersectionOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_classExpressions_2_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1901:2: ( (otherlv_0= 'ObjectIntersectionOf' otherlv_1= '(' ( (lv_classExpressions_2_0= ruleClassExpression ) )+ otherlv_3= ')' ) )
            // InternalOwl.g:1902:2: (otherlv_0= 'ObjectIntersectionOf' otherlv_1= '(' ( (lv_classExpressions_2_0= ruleClassExpression ) )+ otherlv_3= ')' )
            {
            // InternalOwl.g:1902:2: (otherlv_0= 'ObjectIntersectionOf' otherlv_1= '(' ( (lv_classExpressions_2_0= ruleClassExpression ) )+ otherlv_3= ')' )
            // InternalOwl.g:1903:3: otherlv_0= 'ObjectIntersectionOf' otherlv_1= '(' ( (lv_classExpressions_2_0= ruleClassExpression ) )+ otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectIntersectionOfAccess().getObjectIntersectionOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectIntersectionOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:1911:3: ( (lv_classExpressions_2_0= ruleClassExpression ) )+
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
            	    // InternalOwl.g:1912:4: (lv_classExpressions_2_0= ruleClassExpression )
            	    {
            	    // InternalOwl.g:1912:4: (lv_classExpressions_2_0= ruleClassExpression )
            	    // InternalOwl.g:1913:5: lv_classExpressions_2_0= ruleClassExpression
            	    {

            	    					newCompositeNode(grammarAccess.getObjectIntersectionOfAccess().getClassExpressionsClassExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_23);
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
    // InternalOwl.g:1938:1: entryRuleObjectUnionOf returns [EObject current=null] : iv_ruleObjectUnionOf= ruleObjectUnionOf EOF ;
    public final EObject entryRuleObjectUnionOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectUnionOf = null;


        try {
            // InternalOwl.g:1938:54: (iv_ruleObjectUnionOf= ruleObjectUnionOf EOF )
            // InternalOwl.g:1939:2: iv_ruleObjectUnionOf= ruleObjectUnionOf EOF
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
    // InternalOwl.g:1945:1: ruleObjectUnionOf returns [EObject current=null] : (otherlv_0= 'ObjectUnionOf' otherlv_1= '(' ( (lv_classExpressions_2_0= ruleClassExpression ) )+ otherlv_3= ')' ) ;
    public final EObject ruleObjectUnionOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_classExpressions_2_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:1951:2: ( (otherlv_0= 'ObjectUnionOf' otherlv_1= '(' ( (lv_classExpressions_2_0= ruleClassExpression ) )+ otherlv_3= ')' ) )
            // InternalOwl.g:1952:2: (otherlv_0= 'ObjectUnionOf' otherlv_1= '(' ( (lv_classExpressions_2_0= ruleClassExpression ) )+ otherlv_3= ')' )
            {
            // InternalOwl.g:1952:2: (otherlv_0= 'ObjectUnionOf' otherlv_1= '(' ( (lv_classExpressions_2_0= ruleClassExpression ) )+ otherlv_3= ')' )
            // InternalOwl.g:1953:3: otherlv_0= 'ObjectUnionOf' otherlv_1= '(' ( (lv_classExpressions_2_0= ruleClassExpression ) )+ otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectUnionOfAccess().getObjectUnionOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectUnionOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:1961:3: ( (lv_classExpressions_2_0= ruleClassExpression ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_FULL_IRI && LA19_0<=RULE_PN_LOCAL)||(LA19_0>=39 && LA19_0<=55)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalOwl.g:1962:4: (lv_classExpressions_2_0= ruleClassExpression )
            	    {
            	    // InternalOwl.g:1962:4: (lv_classExpressions_2_0= ruleClassExpression )
            	    // InternalOwl.g:1963:5: lv_classExpressions_2_0= ruleClassExpression
            	    {

            	    					newCompositeNode(grammarAccess.getObjectUnionOfAccess().getClassExpressionsClassExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_23);
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
    // InternalOwl.g:1988:1: entryRuleObjectComplementOf returns [EObject current=null] : iv_ruleObjectComplementOf= ruleObjectComplementOf EOF ;
    public final EObject entryRuleObjectComplementOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectComplementOf = null;


        try {
            // InternalOwl.g:1988:59: (iv_ruleObjectComplementOf= ruleObjectComplementOf EOF )
            // InternalOwl.g:1989:2: iv_ruleObjectComplementOf= ruleObjectComplementOf EOF
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
    // InternalOwl.g:1995:1: ruleObjectComplementOf returns [EObject current=null] : (otherlv_0= 'ObjectComplementOf' otherlv_1= '(' ( (lv_classExpression_2_0= ruleClassExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleObjectComplementOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_classExpression_2_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2001:2: ( (otherlv_0= 'ObjectComplementOf' otherlv_1= '(' ( (lv_classExpression_2_0= ruleClassExpression ) ) otherlv_3= ')' ) )
            // InternalOwl.g:2002:2: (otherlv_0= 'ObjectComplementOf' otherlv_1= '(' ( (lv_classExpression_2_0= ruleClassExpression ) ) otherlv_3= ')' )
            {
            // InternalOwl.g:2002:2: (otherlv_0= 'ObjectComplementOf' otherlv_1= '(' ( (lv_classExpression_2_0= ruleClassExpression ) ) otherlv_3= ')' )
            // InternalOwl.g:2003:3: otherlv_0= 'ObjectComplementOf' otherlv_1= '(' ( (lv_classExpression_2_0= ruleClassExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectComplementOfAccess().getObjectComplementOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectComplementOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2011:3: ( (lv_classExpression_2_0= ruleClassExpression ) )
            // InternalOwl.g:2012:4: (lv_classExpression_2_0= ruleClassExpression )
            {
            // InternalOwl.g:2012:4: (lv_classExpression_2_0= ruleClassExpression )
            // InternalOwl.g:2013:5: lv_classExpression_2_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getObjectComplementOfAccess().getClassExpressionClassExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:2038:1: entryRuleObjectOneOf returns [EObject current=null] : iv_ruleObjectOneOf= ruleObjectOneOf EOF ;
    public final EObject entryRuleObjectOneOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectOneOf = null;


        try {
            // InternalOwl.g:2038:52: (iv_ruleObjectOneOf= ruleObjectOneOf EOF )
            // InternalOwl.g:2039:2: iv_ruleObjectOneOf= ruleObjectOneOf EOF
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
    // InternalOwl.g:2045:1: ruleObjectOneOf returns [EObject current=null] : (otherlv_0= 'ObjectOneOf' otherlv_1= '(' ( (lv_individuals_2_0= ruleIndividualReference ) )+ otherlv_3= ')' ) ;
    public final EObject ruleObjectOneOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_individuals_2_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2051:2: ( (otherlv_0= 'ObjectOneOf' otherlv_1= '(' ( (lv_individuals_2_0= ruleIndividualReference ) )+ otherlv_3= ')' ) )
            // InternalOwl.g:2052:2: (otherlv_0= 'ObjectOneOf' otherlv_1= '(' ( (lv_individuals_2_0= ruleIndividualReference ) )+ otherlv_3= ')' )
            {
            // InternalOwl.g:2052:2: (otherlv_0= 'ObjectOneOf' otherlv_1= '(' ( (lv_individuals_2_0= ruleIndividualReference ) )+ otherlv_3= ')' )
            // InternalOwl.g:2053:3: otherlv_0= 'ObjectOneOf' otherlv_1= '(' ( (lv_individuals_2_0= ruleIndividualReference ) )+ otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectOneOfAccess().getObjectOneOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectOneOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2061:3: ( (lv_individuals_2_0= ruleIndividualReference ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_FULL_IRI && LA20_0<=RULE_BLANK_NODE_LABEL)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalOwl.g:2062:4: (lv_individuals_2_0= ruleIndividualReference )
            	    {
            	    // InternalOwl.g:2062:4: (lv_individuals_2_0= ruleIndividualReference )
            	    // InternalOwl.g:2063:5: lv_individuals_2_0= ruleIndividualReference
            	    {

            	    					newCompositeNode(grammarAccess.getObjectOneOfAccess().getIndividualsIndividualReferenceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_25);
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
    // InternalOwl.g:2088:1: entryRuleIndividualReference returns [EObject current=null] : iv_ruleIndividualReference= ruleIndividualReference EOF ;
    public final EObject entryRuleIndividualReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndividualReference = null;


        try {
            // InternalOwl.g:2088:60: (iv_ruleIndividualReference= ruleIndividualReference EOF )
            // InternalOwl.g:2089:2: iv_ruleIndividualReference= ruleIndividualReference EOF
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
    // InternalOwl.g:2095:1: ruleIndividualReference returns [EObject current=null] : (this_NamedIndividualReference_0= ruleNamedIndividualReference | this_AnonymousIndividualReference_1= ruleAnonymousIndividualReference ) ;
    public final EObject ruleIndividualReference() throws RecognitionException {
        EObject current = null;

        EObject this_NamedIndividualReference_0 = null;

        EObject this_AnonymousIndividualReference_1 = null;



        	enterRule();

        try {
            // InternalOwl.g:2101:2: ( (this_NamedIndividualReference_0= ruleNamedIndividualReference | this_AnonymousIndividualReference_1= ruleAnonymousIndividualReference ) )
            // InternalOwl.g:2102:2: (this_NamedIndividualReference_0= ruleNamedIndividualReference | this_AnonymousIndividualReference_1= ruleAnonymousIndividualReference )
            {
            // InternalOwl.g:2102:2: (this_NamedIndividualReference_0= ruleNamedIndividualReference | this_AnonymousIndividualReference_1= ruleAnonymousIndividualReference )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_FULL_IRI && LA21_0<=RULE_PN_LOCAL)) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_BLANK_NODE_LABEL) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalOwl.g:2103:3: this_NamedIndividualReference_0= ruleNamedIndividualReference
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
                    // InternalOwl.g:2112:3: this_AnonymousIndividualReference_1= ruleAnonymousIndividualReference
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
    // InternalOwl.g:2124:1: entryRuleNamedIndividualReference returns [EObject current=null] : iv_ruleNamedIndividualReference= ruleNamedIndividualReference EOF ;
    public final EObject entryRuleNamedIndividualReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedIndividualReference = null;


        try {
            // InternalOwl.g:2124:65: (iv_ruleNamedIndividualReference= ruleNamedIndividualReference EOF )
            // InternalOwl.g:2125:2: iv_ruleNamedIndividualReference= ruleNamedIndividualReference EOF
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
    // InternalOwl.g:2131:1: ruleNamedIndividualReference returns [EObject current=null] : ( (lv_individual_0_0= ruleIRI ) ) ;
    public final EObject ruleNamedIndividualReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_individual_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2137:2: ( ( (lv_individual_0_0= ruleIRI ) ) )
            // InternalOwl.g:2138:2: ( (lv_individual_0_0= ruleIRI ) )
            {
            // InternalOwl.g:2138:2: ( (lv_individual_0_0= ruleIRI ) )
            // InternalOwl.g:2139:3: (lv_individual_0_0= ruleIRI )
            {
            // InternalOwl.g:2139:3: (lv_individual_0_0= ruleIRI )
            // InternalOwl.g:2140:4: lv_individual_0_0= ruleIRI
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
    // InternalOwl.g:2160:1: entryRuleAnonymousIndividualReference returns [EObject current=null] : iv_ruleAnonymousIndividualReference= ruleAnonymousIndividualReference EOF ;
    public final EObject entryRuleAnonymousIndividualReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousIndividualReference = null;


        try {
            // InternalOwl.g:2160:69: (iv_ruleAnonymousIndividualReference= ruleAnonymousIndividualReference EOF )
            // InternalOwl.g:2161:2: iv_ruleAnonymousIndividualReference= ruleAnonymousIndividualReference EOF
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
    // InternalOwl.g:2167:1: ruleAnonymousIndividualReference returns [EObject current=null] : ( (lv_individual_0_0= ruleNodeID ) ) ;
    public final EObject ruleAnonymousIndividualReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_individual_0_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2173:2: ( ( (lv_individual_0_0= ruleNodeID ) ) )
            // InternalOwl.g:2174:2: ( (lv_individual_0_0= ruleNodeID ) )
            {
            // InternalOwl.g:2174:2: ( (lv_individual_0_0= ruleNodeID ) )
            // InternalOwl.g:2175:3: (lv_individual_0_0= ruleNodeID )
            {
            // InternalOwl.g:2175:3: (lv_individual_0_0= ruleNodeID )
            // InternalOwl.g:2176:4: lv_individual_0_0= ruleNodeID
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
    // InternalOwl.g:2196:1: entryRuleObjectSomeValuesFrom returns [EObject current=null] : iv_ruleObjectSomeValuesFrom= ruleObjectSomeValuesFrom EOF ;
    public final EObject entryRuleObjectSomeValuesFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectSomeValuesFrom = null;


        try {
            // InternalOwl.g:2196:61: (iv_ruleObjectSomeValuesFrom= ruleObjectSomeValuesFrom EOF )
            // InternalOwl.g:2197:2: iv_ruleObjectSomeValuesFrom= ruleObjectSomeValuesFrom EOF
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
    // InternalOwl.g:2203:1: ruleObjectSomeValuesFrom returns [EObject current=null] : (otherlv_0= 'ObjectSomeValuesFrom' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleObjectSomeValuesFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_objectPropertyExpression_2_0 = null;

        EObject lv_classExpression_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2209:2: ( (otherlv_0= 'ObjectSomeValuesFrom' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= ')' ) )
            // InternalOwl.g:2210:2: (otherlv_0= 'ObjectSomeValuesFrom' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:2210:2: (otherlv_0= 'ObjectSomeValuesFrom' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= ')' )
            // InternalOwl.g:2211:3: otherlv_0= 'ObjectSomeValuesFrom' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectSomeValuesFromAccess().getObjectSomeValuesFromKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectSomeValuesFromAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2219:3: ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:2220:4: (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:2220:4: (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression )
            // InternalOwl.g:2221:5: lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getObjectSomeValuesFromAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalOwl.g:2238:3: ( (lv_classExpression_3_0= ruleClassExpression ) )
            // InternalOwl.g:2239:4: (lv_classExpression_3_0= ruleClassExpression )
            {
            // InternalOwl.g:2239:4: (lv_classExpression_3_0= ruleClassExpression )
            // InternalOwl.g:2240:5: lv_classExpression_3_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getObjectSomeValuesFromAccess().getClassExpressionClassExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:2265:1: entryRuleObjectAllValuesFrom returns [EObject current=null] : iv_ruleObjectAllValuesFrom= ruleObjectAllValuesFrom EOF ;
    public final EObject entryRuleObjectAllValuesFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectAllValuesFrom = null;


        try {
            // InternalOwl.g:2265:60: (iv_ruleObjectAllValuesFrom= ruleObjectAllValuesFrom EOF )
            // InternalOwl.g:2266:2: iv_ruleObjectAllValuesFrom= ruleObjectAllValuesFrom EOF
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
    // InternalOwl.g:2272:1: ruleObjectAllValuesFrom returns [EObject current=null] : (otherlv_0= 'ObjectAllValuesFrom' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleObjectAllValuesFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_objectPropertyExpression_2_0 = null;

        EObject lv_classExpression_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2278:2: ( (otherlv_0= 'ObjectAllValuesFrom' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= ')' ) )
            // InternalOwl.g:2279:2: (otherlv_0= 'ObjectAllValuesFrom' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:2279:2: (otherlv_0= 'ObjectAllValuesFrom' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= ')' )
            // InternalOwl.g:2280:3: otherlv_0= 'ObjectAllValuesFrom' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectAllValuesFromAccess().getObjectAllValuesFromKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAllValuesFromAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2288:3: ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:2289:4: (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:2289:4: (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression )
            // InternalOwl.g:2290:5: lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getObjectAllValuesFromAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalOwl.g:2307:3: ( (lv_classExpression_3_0= ruleClassExpression ) )
            // InternalOwl.g:2308:4: (lv_classExpression_3_0= ruleClassExpression )
            {
            // InternalOwl.g:2308:4: (lv_classExpression_3_0= ruleClassExpression )
            // InternalOwl.g:2309:5: lv_classExpression_3_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getObjectAllValuesFromAccess().getClassExpressionClassExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:2334:1: entryRuleObjectHasValue returns [EObject current=null] : iv_ruleObjectHasValue= ruleObjectHasValue EOF ;
    public final EObject entryRuleObjectHasValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectHasValue = null;


        try {
            // InternalOwl.g:2334:55: (iv_ruleObjectHasValue= ruleObjectHasValue EOF )
            // InternalOwl.g:2335:2: iv_ruleObjectHasValue= ruleObjectHasValue EOF
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
    // InternalOwl.g:2341:1: ruleObjectHasValue returns [EObject current=null] : (otherlv_0= 'ObjectHasValue' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_individual_3_0= ruleIndividualReference ) ) otherlv_4= ')' ) ;
    public final EObject ruleObjectHasValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_objectPropertyExpression_2_0 = null;

        EObject lv_individual_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2347:2: ( (otherlv_0= 'ObjectHasValue' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_individual_3_0= ruleIndividualReference ) ) otherlv_4= ')' ) )
            // InternalOwl.g:2348:2: (otherlv_0= 'ObjectHasValue' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_individual_3_0= ruleIndividualReference ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:2348:2: (otherlv_0= 'ObjectHasValue' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_individual_3_0= ruleIndividualReference ) ) otherlv_4= ')' )
            // InternalOwl.g:2349:3: otherlv_0= 'ObjectHasValue' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) ( (lv_individual_3_0= ruleIndividualReference ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectHasValueAccess().getObjectHasValueKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectHasValueAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2357:3: ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:2358:4: (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:2358:4: (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression )
            // InternalOwl.g:2359:5: lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getObjectHasValueAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalOwl.g:2376:3: ( (lv_individual_3_0= ruleIndividualReference ) )
            // InternalOwl.g:2377:4: (lv_individual_3_0= ruleIndividualReference )
            {
            // InternalOwl.g:2377:4: (lv_individual_3_0= ruleIndividualReference )
            // InternalOwl.g:2378:5: lv_individual_3_0= ruleIndividualReference
            {

            					newCompositeNode(grammarAccess.getObjectHasValueAccess().getIndividualIndividualReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:2403:1: entryRuleObjectHasSelf returns [EObject current=null] : iv_ruleObjectHasSelf= ruleObjectHasSelf EOF ;
    public final EObject entryRuleObjectHasSelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectHasSelf = null;


        try {
            // InternalOwl.g:2403:54: (iv_ruleObjectHasSelf= ruleObjectHasSelf EOF )
            // InternalOwl.g:2404:2: iv_ruleObjectHasSelf= ruleObjectHasSelf EOF
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
    // InternalOwl.g:2410:1: ruleObjectHasSelf returns [EObject current=null] : (otherlv_0= 'ObjectHasSelf' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleObjectHasSelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_objectPropertyExpression_2_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2416:2: ( (otherlv_0= 'ObjectHasSelf' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) otherlv_3= ')' ) )
            // InternalOwl.g:2417:2: (otherlv_0= 'ObjectHasSelf' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) otherlv_3= ')' )
            {
            // InternalOwl.g:2417:2: (otherlv_0= 'ObjectHasSelf' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) otherlv_3= ')' )
            // InternalOwl.g:2418:3: otherlv_0= 'ObjectHasSelf' otherlv_1= '(' ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectHasSelfAccess().getObjectHasSelfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectHasSelfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2426:3: ( (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:2427:4: (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:2427:4: (lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression )
            // InternalOwl.g:2428:5: lv_objectPropertyExpression_2_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getObjectHasSelfAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:2453:1: entryRuleObjectMinCardinality returns [EObject current=null] : iv_ruleObjectMinCardinality= ruleObjectMinCardinality EOF ;
    public final EObject entryRuleObjectMinCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectMinCardinality = null;


        try {
            // InternalOwl.g:2453:61: (iv_ruleObjectMinCardinality= ruleObjectMinCardinality EOF )
            // InternalOwl.g:2454:2: iv_ruleObjectMinCardinality= ruleObjectMinCardinality EOF
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
    // InternalOwl.g:2460:1: ruleObjectMinCardinality returns [EObject current=null] : (otherlv_0= 'ObjectMinCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' ) ;
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
            // InternalOwl.g:2466:2: ( (otherlv_0= 'ObjectMinCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' ) )
            // InternalOwl.g:2467:2: (otherlv_0= 'ObjectMinCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' )
            {
            // InternalOwl.g:2467:2: (otherlv_0= 'ObjectMinCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' )
            // InternalOwl.g:2468:3: otherlv_0= 'ObjectMinCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectMinCardinalityAccess().getObjectMinCardinalityKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectMinCardinalityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2476:3: ( (lv_cardinality_2_0= RULE_INT ) )
            // InternalOwl.g:2477:4: (lv_cardinality_2_0= RULE_INT )
            {
            // InternalOwl.g:2477:4: (lv_cardinality_2_0= RULE_INT )
            // InternalOwl.g:2478:5: lv_cardinality_2_0= RULE_INT
            {
            lv_cardinality_2_0=(Token)match(input,RULE_INT,FOLLOW_26); 

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

            // InternalOwl.g:2494:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:2495:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:2495:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:2496:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getObjectMinCardinalityAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalOwl.g:2513:3: ( (lv_classExpression_4_0= ruleClassExpression ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_FULL_IRI && LA22_0<=RULE_PN_LOCAL)||(LA22_0>=39 && LA22_0<=55)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOwl.g:2514:4: (lv_classExpression_4_0= ruleClassExpression )
                    {
                    // InternalOwl.g:2514:4: (lv_classExpression_4_0= ruleClassExpression )
                    // InternalOwl.g:2515:5: lv_classExpression_4_0= ruleClassExpression
                    {

                    					newCompositeNode(grammarAccess.getObjectMinCardinalityAccess().getClassExpressionClassExpressionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_9);
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
    // InternalOwl.g:2540:1: entryRuleObjectMaxCardinality returns [EObject current=null] : iv_ruleObjectMaxCardinality= ruleObjectMaxCardinality EOF ;
    public final EObject entryRuleObjectMaxCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectMaxCardinality = null;


        try {
            // InternalOwl.g:2540:61: (iv_ruleObjectMaxCardinality= ruleObjectMaxCardinality EOF )
            // InternalOwl.g:2541:2: iv_ruleObjectMaxCardinality= ruleObjectMaxCardinality EOF
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
    // InternalOwl.g:2547:1: ruleObjectMaxCardinality returns [EObject current=null] : (otherlv_0= 'ObjectMaxCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' ) ;
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
            // InternalOwl.g:2553:2: ( (otherlv_0= 'ObjectMaxCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' ) )
            // InternalOwl.g:2554:2: (otherlv_0= 'ObjectMaxCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' )
            {
            // InternalOwl.g:2554:2: (otherlv_0= 'ObjectMaxCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' )
            // InternalOwl.g:2555:3: otherlv_0= 'ObjectMaxCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectMaxCardinalityAccess().getObjectMaxCardinalityKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectMaxCardinalityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2563:3: ( (lv_cardinality_2_0= RULE_INT ) )
            // InternalOwl.g:2564:4: (lv_cardinality_2_0= RULE_INT )
            {
            // InternalOwl.g:2564:4: (lv_cardinality_2_0= RULE_INT )
            // InternalOwl.g:2565:5: lv_cardinality_2_0= RULE_INT
            {
            lv_cardinality_2_0=(Token)match(input,RULE_INT,FOLLOW_26); 

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

            // InternalOwl.g:2581:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:2582:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:2582:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:2583:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getObjectMaxCardinalityAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalOwl.g:2600:3: ( (lv_classExpression_4_0= ruleClassExpression ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_FULL_IRI && LA23_0<=RULE_PN_LOCAL)||(LA23_0>=39 && LA23_0<=55)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOwl.g:2601:4: (lv_classExpression_4_0= ruleClassExpression )
                    {
                    // InternalOwl.g:2601:4: (lv_classExpression_4_0= ruleClassExpression )
                    // InternalOwl.g:2602:5: lv_classExpression_4_0= ruleClassExpression
                    {

                    					newCompositeNode(grammarAccess.getObjectMaxCardinalityAccess().getClassExpressionClassExpressionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_9);
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
    // InternalOwl.g:2627:1: entryRuleObjectExactCardinality returns [EObject current=null] : iv_ruleObjectExactCardinality= ruleObjectExactCardinality EOF ;
    public final EObject entryRuleObjectExactCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectExactCardinality = null;


        try {
            // InternalOwl.g:2627:63: (iv_ruleObjectExactCardinality= ruleObjectExactCardinality EOF )
            // InternalOwl.g:2628:2: iv_ruleObjectExactCardinality= ruleObjectExactCardinality EOF
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
    // InternalOwl.g:2634:1: ruleObjectExactCardinality returns [EObject current=null] : (otherlv_0= 'ObjectExactCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' ) ;
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
            // InternalOwl.g:2640:2: ( (otherlv_0= 'ObjectExactCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' ) )
            // InternalOwl.g:2641:2: (otherlv_0= 'ObjectExactCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' )
            {
            // InternalOwl.g:2641:2: (otherlv_0= 'ObjectExactCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')' )
            // InternalOwl.g:2642:3: otherlv_0= 'ObjectExactCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectExactCardinalityAccess().getObjectExactCardinalityKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectExactCardinalityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2650:3: ( (lv_cardinality_2_0= RULE_INT ) )
            // InternalOwl.g:2651:4: (lv_cardinality_2_0= RULE_INT )
            {
            // InternalOwl.g:2651:4: (lv_cardinality_2_0= RULE_INT )
            // InternalOwl.g:2652:5: lv_cardinality_2_0= RULE_INT
            {
            lv_cardinality_2_0=(Token)match(input,RULE_INT,FOLLOW_26); 

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

            // InternalOwl.g:2668:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:2669:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:2669:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:2670:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getObjectExactCardinalityAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalOwl.g:2687:3: ( (lv_classExpression_4_0= ruleClassExpression ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_FULL_IRI && LA24_0<=RULE_PN_LOCAL)||(LA24_0>=39 && LA24_0<=55)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOwl.g:2688:4: (lv_classExpression_4_0= ruleClassExpression )
                    {
                    // InternalOwl.g:2688:4: (lv_classExpression_4_0= ruleClassExpression )
                    // InternalOwl.g:2689:5: lv_classExpression_4_0= ruleClassExpression
                    {

                    					newCompositeNode(grammarAccess.getObjectExactCardinalityAccess().getClassExpressionClassExpressionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_9);
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
    // InternalOwl.g:2714:1: entryRuleDataSomeValuesFrom returns [EObject current=null] : iv_ruleDataSomeValuesFrom= ruleDataSomeValuesFrom EOF ;
    public final EObject entryRuleDataSomeValuesFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSomeValuesFrom = null;


        try {
            // InternalOwl.g:2714:59: (iv_ruleDataSomeValuesFrom= ruleDataSomeValuesFrom EOF )
            // InternalOwl.g:2715:2: iv_ruleDataSomeValuesFrom= ruleDataSomeValuesFrom EOF
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
    // InternalOwl.g:2721:1: ruleDataSomeValuesFrom returns [EObject current=null] : (otherlv_0= 'DataSomeValuesFrom' otherlv_1= '(' ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+ ( (lv_dataRange_3_0= ruleDataRange ) ) otherlv_4= ')' ) ;
    public final EObject ruleDataSomeValuesFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_dataPropertyExpressions_2_0 = null;

        EObject lv_dataRange_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2727:2: ( (otherlv_0= 'DataSomeValuesFrom' otherlv_1= '(' ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+ ( (lv_dataRange_3_0= ruleDataRange ) ) otherlv_4= ')' ) )
            // InternalOwl.g:2728:2: (otherlv_0= 'DataSomeValuesFrom' otherlv_1= '(' ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+ ( (lv_dataRange_3_0= ruleDataRange ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:2728:2: (otherlv_0= 'DataSomeValuesFrom' otherlv_1= '(' ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+ ( (lv_dataRange_3_0= ruleDataRange ) ) otherlv_4= ')' )
            // InternalOwl.g:2729:3: otherlv_0= 'DataSomeValuesFrom' otherlv_1= '(' ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+ ( (lv_dataRange_3_0= ruleDataRange ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataSomeValuesFromAccess().getDataSomeValuesFromKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDataSomeValuesFromAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2737:3: ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+
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
            	    // InternalOwl.g:2738:4: (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression )
            	    {
            	    // InternalOwl.g:2738:4: (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression )
            	    // InternalOwl.g:2739:5: lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression
            	    {

            	    					newCompositeNode(grammarAccess.getDataSomeValuesFromAccess().getDataPropertyExpressionsDataPropertyExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            // InternalOwl.g:2756:3: ( (lv_dataRange_3_0= ruleDataRange ) )
            // InternalOwl.g:2757:4: (lv_dataRange_3_0= ruleDataRange )
            {
            // InternalOwl.g:2757:4: (lv_dataRange_3_0= ruleDataRange )
            // InternalOwl.g:2758:5: lv_dataRange_3_0= ruleDataRange
            {

            					newCompositeNode(grammarAccess.getDataSomeValuesFromAccess().getDataRangeDataRangeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:2783:1: entryRuleDataAllValuesFrom returns [EObject current=null] : iv_ruleDataAllValuesFrom= ruleDataAllValuesFrom EOF ;
    public final EObject entryRuleDataAllValuesFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAllValuesFrom = null;


        try {
            // InternalOwl.g:2783:58: (iv_ruleDataAllValuesFrom= ruleDataAllValuesFrom EOF )
            // InternalOwl.g:2784:2: iv_ruleDataAllValuesFrom= ruleDataAllValuesFrom EOF
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
    // InternalOwl.g:2790:1: ruleDataAllValuesFrom returns [EObject current=null] : (otherlv_0= 'DataAllValuesFrom' otherlv_1= '(' ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+ ( (lv_dataRange_3_0= ruleDataRange ) ) otherlv_4= ')' ) ;
    public final EObject ruleDataAllValuesFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_dataPropertyExpressions_2_0 = null;

        EObject lv_dataRange_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2796:2: ( (otherlv_0= 'DataAllValuesFrom' otherlv_1= '(' ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+ ( (lv_dataRange_3_0= ruleDataRange ) ) otherlv_4= ')' ) )
            // InternalOwl.g:2797:2: (otherlv_0= 'DataAllValuesFrom' otherlv_1= '(' ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+ ( (lv_dataRange_3_0= ruleDataRange ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:2797:2: (otherlv_0= 'DataAllValuesFrom' otherlv_1= '(' ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+ ( (lv_dataRange_3_0= ruleDataRange ) ) otherlv_4= ')' )
            // InternalOwl.g:2798:3: otherlv_0= 'DataAllValuesFrom' otherlv_1= '(' ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+ ( (lv_dataRange_3_0= ruleDataRange ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataAllValuesFromAccess().getDataAllValuesFromKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDataAllValuesFromAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2806:3: ( (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case RULE_FULL_IRI:
                    {
                    int LA26_1 = input.LA(2);

                    if ( ((LA26_1>=RULE_FULL_IRI && LA26_1<=RULE_PN_LOCAL)||(LA26_1>=34 && LA26_1<=38)) ) {
                        alt26=1;
                    }


                    }
                    break;
                case RULE_PN_PREFIX:
                    {
                    int LA26_2 = input.LA(2);

                    if ( (LA26_2==RULE_PN_LOCAL) ) {
                        int LA26_3 = input.LA(3);

                        if ( ((LA26_3>=RULE_FULL_IRI && LA26_3<=RULE_PN_LOCAL)||(LA26_3>=34 && LA26_3<=38)) ) {
                            alt26=1;
                        }


                    }


                    }
                    break;
                case RULE_PN_LOCAL:
                    {
                    int LA26_3 = input.LA(2);

                    if ( ((LA26_3>=RULE_FULL_IRI && LA26_3<=RULE_PN_LOCAL)||(LA26_3>=34 && LA26_3<=38)) ) {
                        alt26=1;
                    }


                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // InternalOwl.g:2807:4: (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression )
            	    {
            	    // InternalOwl.g:2807:4: (lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression )
            	    // InternalOwl.g:2808:5: lv_dataPropertyExpressions_2_0= ruleDataPropertyExpression
            	    {

            	    					newCompositeNode(grammarAccess.getDataAllValuesFromAccess().getDataPropertyExpressionsDataPropertyExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            // InternalOwl.g:2825:3: ( (lv_dataRange_3_0= ruleDataRange ) )
            // InternalOwl.g:2826:4: (lv_dataRange_3_0= ruleDataRange )
            {
            // InternalOwl.g:2826:4: (lv_dataRange_3_0= ruleDataRange )
            // InternalOwl.g:2827:5: lv_dataRange_3_0= ruleDataRange
            {

            					newCompositeNode(grammarAccess.getDataAllValuesFromAccess().getDataRangeDataRangeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:2852:1: entryRuleDataHasValue returns [EObject current=null] : iv_ruleDataHasValue= ruleDataHasValue EOF ;
    public final EObject entryRuleDataHasValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataHasValue = null;


        try {
            // InternalOwl.g:2852:53: (iv_ruleDataHasValue= ruleDataHasValue EOF )
            // InternalOwl.g:2853:2: iv_ruleDataHasValue= ruleDataHasValue EOF
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
    // InternalOwl.g:2859:1: ruleDataHasValue returns [EObject current=null] : (otherlv_0= 'DataHasValue' otherlv_1= '(' ( (lv_dataPropertyExpression_2_0= ruleDataPropertyExpression ) ) ( (lv_literal_3_0= ruleLiteral ) ) otherlv_4= ')' ) ;
    public final EObject ruleDataHasValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_dataPropertyExpression_2_0 = null;

        EObject lv_literal_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2865:2: ( (otherlv_0= 'DataHasValue' otherlv_1= '(' ( (lv_dataPropertyExpression_2_0= ruleDataPropertyExpression ) ) ( (lv_literal_3_0= ruleLiteral ) ) otherlv_4= ')' ) )
            // InternalOwl.g:2866:2: (otherlv_0= 'DataHasValue' otherlv_1= '(' ( (lv_dataPropertyExpression_2_0= ruleDataPropertyExpression ) ) ( (lv_literal_3_0= ruleLiteral ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:2866:2: (otherlv_0= 'DataHasValue' otherlv_1= '(' ( (lv_dataPropertyExpression_2_0= ruleDataPropertyExpression ) ) ( (lv_literal_3_0= ruleLiteral ) ) otherlv_4= ')' )
            // InternalOwl.g:2867:3: otherlv_0= 'DataHasValue' otherlv_1= '(' ( (lv_dataPropertyExpression_2_0= ruleDataPropertyExpression ) ) ( (lv_literal_3_0= ruleLiteral ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataHasValueAccess().getDataHasValueKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDataHasValueAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2875:3: ( (lv_dataPropertyExpression_2_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:2876:4: (lv_dataPropertyExpression_2_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:2876:4: (lv_dataPropertyExpression_2_0= ruleDataPropertyExpression )
            // InternalOwl.g:2877:5: lv_dataPropertyExpression_2_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getDataHasValueAccess().getDataPropertyExpressionDataPropertyExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalOwl.g:2894:3: ( (lv_literal_3_0= ruleLiteral ) )
            // InternalOwl.g:2895:4: (lv_literal_3_0= ruleLiteral )
            {
            // InternalOwl.g:2895:4: (lv_literal_3_0= ruleLiteral )
            // InternalOwl.g:2896:5: lv_literal_3_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getDataHasValueAccess().getLiteralLiteralParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:2921:1: entryRuleDataMinCardinality returns [EObject current=null] : iv_ruleDataMinCardinality= ruleDataMinCardinality EOF ;
    public final EObject entryRuleDataMinCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataMinCardinality = null;


        try {
            // InternalOwl.g:2921:59: (iv_ruleDataMinCardinality= ruleDataMinCardinality EOF )
            // InternalOwl.g:2922:2: iv_ruleDataMinCardinality= ruleDataMinCardinality EOF
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
    // InternalOwl.g:2928:1: ruleDataMinCardinality returns [EObject current=null] : (otherlv_0= 'DataMinCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? ) ;
    public final EObject ruleDataMinCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_cardinality_2_0=null;
        EObject lv_dataPropertyExpression_3_0 = null;

        EObject lv_dataRange_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:2934:2: ( (otherlv_0= 'DataMinCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? ) )
            // InternalOwl.g:2935:2: (otherlv_0= 'DataMinCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? )
            {
            // InternalOwl.g:2935:2: (otherlv_0= 'DataMinCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? )
            // InternalOwl.g:2936:3: otherlv_0= 'DataMinCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataMinCardinalityAccess().getDataMinCardinalityKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getDataMinCardinalityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:2944:3: ( (lv_cardinality_2_0= RULE_INT ) )
            // InternalOwl.g:2945:4: (lv_cardinality_2_0= RULE_INT )
            {
            // InternalOwl.g:2945:4: (lv_cardinality_2_0= RULE_INT )
            // InternalOwl.g:2946:5: lv_cardinality_2_0= RULE_INT
            {
            lv_cardinality_2_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

            // InternalOwl.g:2962:3: ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:2963:4: (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:2963:4: (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression )
            // InternalOwl.g:2964:5: lv_dataPropertyExpression_3_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getDataMinCardinalityAccess().getDataPropertyExpressionDataPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalOwl.g:2981:3: ( (lv_dataRange_4_0= ruleDataRange ) )?
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
                    // InternalOwl.g:2982:4: (lv_dataRange_4_0= ruleDataRange )
                    {
                    // InternalOwl.g:2982:4: (lv_dataRange_4_0= ruleDataRange )
                    // InternalOwl.g:2983:5: lv_dataRange_4_0= ruleDataRange
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
    // InternalOwl.g:3004:1: entryRuleDataMaxCardinality returns [EObject current=null] : iv_ruleDataMaxCardinality= ruleDataMaxCardinality EOF ;
    public final EObject entryRuleDataMaxCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataMaxCardinality = null;


        try {
            // InternalOwl.g:3004:59: (iv_ruleDataMaxCardinality= ruleDataMaxCardinality EOF )
            // InternalOwl.g:3005:2: iv_ruleDataMaxCardinality= ruleDataMaxCardinality EOF
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
    // InternalOwl.g:3011:1: ruleDataMaxCardinality returns [EObject current=null] : (otherlv_0= 'DataMaxCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? ) ;
    public final EObject ruleDataMaxCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_cardinality_2_0=null;
        EObject lv_dataPropertyExpression_3_0 = null;

        EObject lv_dataRange_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:3017:2: ( (otherlv_0= 'DataMaxCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? ) )
            // InternalOwl.g:3018:2: (otherlv_0= 'DataMaxCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? )
            {
            // InternalOwl.g:3018:2: (otherlv_0= 'DataMaxCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? )
            // InternalOwl.g:3019:3: otherlv_0= 'DataMaxCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataMaxCardinalityAccess().getDataMaxCardinalityKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getDataMaxCardinalityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:3027:3: ( (lv_cardinality_2_0= RULE_INT ) )
            // InternalOwl.g:3028:4: (lv_cardinality_2_0= RULE_INT )
            {
            // InternalOwl.g:3028:4: (lv_cardinality_2_0= RULE_INT )
            // InternalOwl.g:3029:5: lv_cardinality_2_0= RULE_INT
            {
            lv_cardinality_2_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

            // InternalOwl.g:3045:3: ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:3046:4: (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:3046:4: (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression )
            // InternalOwl.g:3047:5: lv_dataPropertyExpression_3_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getDataMaxCardinalityAccess().getDataPropertyExpressionDataPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalOwl.g:3064:3: ( (lv_dataRange_4_0= ruleDataRange ) )?
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
                    // InternalOwl.g:3065:4: (lv_dataRange_4_0= ruleDataRange )
                    {
                    // InternalOwl.g:3065:4: (lv_dataRange_4_0= ruleDataRange )
                    // InternalOwl.g:3066:5: lv_dataRange_4_0= ruleDataRange
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
    // InternalOwl.g:3087:1: entryRuleDataExactCardinality returns [EObject current=null] : iv_ruleDataExactCardinality= ruleDataExactCardinality EOF ;
    public final EObject entryRuleDataExactCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataExactCardinality = null;


        try {
            // InternalOwl.g:3087:61: (iv_ruleDataExactCardinality= ruleDataExactCardinality EOF )
            // InternalOwl.g:3088:2: iv_ruleDataExactCardinality= ruleDataExactCardinality EOF
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
    // InternalOwl.g:3094:1: ruleDataExactCardinality returns [EObject current=null] : (otherlv_0= 'DataExactCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? ) ;
    public final EObject ruleDataExactCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_cardinality_2_0=null;
        EObject lv_dataPropertyExpression_3_0 = null;

        EObject lv_dataRange_4_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:3100:2: ( (otherlv_0= 'DataExactCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? ) )
            // InternalOwl.g:3101:2: (otherlv_0= 'DataExactCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? )
            {
            // InternalOwl.g:3101:2: (otherlv_0= 'DataExactCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )? )
            // InternalOwl.g:3102:3: otherlv_0= 'DataExactCardinality' otherlv_1= '(' ( (lv_cardinality_2_0= RULE_INT ) ) ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_dataRange_4_0= ruleDataRange ) )?
            {
            otherlv_0=(Token)match(input,55,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataExactCardinalityAccess().getDataExactCardinalityKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getDataExactCardinalityAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:3110:3: ( (lv_cardinality_2_0= RULE_INT ) )
            // InternalOwl.g:3111:4: (lv_cardinality_2_0= RULE_INT )
            {
            // InternalOwl.g:3111:4: (lv_cardinality_2_0= RULE_INT )
            // InternalOwl.g:3112:5: lv_cardinality_2_0= RULE_INT
            {
            lv_cardinality_2_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

            // InternalOwl.g:3128:3: ( (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:3129:4: (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:3129:4: (lv_dataPropertyExpression_3_0= ruleDataPropertyExpression )
            // InternalOwl.g:3130:5: lv_dataPropertyExpression_3_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getDataExactCardinalityAccess().getDataPropertyExpressionDataPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalOwl.g:3147:3: ( (lv_dataRange_4_0= ruleDataRange ) )?
            int alt29=2;
            switch ( input.LA(1) ) {
                case RULE_FULL_IRI:
                    {
                    alt29=1;
                    }
                    break;
                case RULE_PN_PREFIX:
                    {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==RULE_PN_LOCAL) ) {
                        alt29=1;
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
                    alt29=1;
                    }
                    break;
            }

            switch (alt29) {
                case 1 :
                    // InternalOwl.g:3148:4: (lv_dataRange_4_0= ruleDataRange )
                    {
                    // InternalOwl.g:3148:4: (lv_dataRange_4_0= ruleDataRange )
                    // InternalOwl.g:3149:5: lv_dataRange_4_0= ruleDataRange
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
    // InternalOwl.g:3170:1: entryRuleAxiom returns [EObject current=null] : iv_ruleAxiom= ruleAxiom EOF ;
    public final EObject entryRuleAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxiom = null;


        try {
            // InternalOwl.g:3170:46: (iv_ruleAxiom= ruleAxiom EOF )
            // InternalOwl.g:3171:2: iv_ruleAxiom= ruleAxiom EOF
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
    // InternalOwl.g:3177:1: ruleAxiom returns [EObject current=null] : (this_Declaration_0= ruleDeclaration | this_ClassAxiom_1= ruleClassAxiom | this_ObjectPropertyAxiom_2= ruleObjectPropertyAxiom | this_DataPropertyAxiom_3= ruleDataPropertyAxiom | this_DatatypeDefinition_4= ruleDatatypeDefinition | this_HasKey_5= ruleHasKey | this_Assertion_6= ruleAssertion | this_AnnotationAxiom_7= ruleAnnotationAxiom ) ;
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
            // InternalOwl.g:3183:2: ( (this_Declaration_0= ruleDeclaration | this_ClassAxiom_1= ruleClassAxiom | this_ObjectPropertyAxiom_2= ruleObjectPropertyAxiom | this_DataPropertyAxiom_3= ruleDataPropertyAxiom | this_DatatypeDefinition_4= ruleDatatypeDefinition | this_HasKey_5= ruleHasKey | this_Assertion_6= ruleAssertion | this_AnnotationAxiom_7= ruleAnnotationAxiom ) )
            // InternalOwl.g:3184:2: (this_Declaration_0= ruleDeclaration | this_ClassAxiom_1= ruleClassAxiom | this_ObjectPropertyAxiom_2= ruleObjectPropertyAxiom | this_DataPropertyAxiom_3= ruleDataPropertyAxiom | this_DatatypeDefinition_4= ruleDatatypeDefinition | this_HasKey_5= ruleHasKey | this_Assertion_6= ruleAssertion | this_AnnotationAxiom_7= ruleAnnotationAxiom )
            {
            // InternalOwl.g:3184:2: (this_Declaration_0= ruleDeclaration | this_ClassAxiom_1= ruleClassAxiom | this_ObjectPropertyAxiom_2= ruleObjectPropertyAxiom | this_DataPropertyAxiom_3= ruleDataPropertyAxiom | this_DatatypeDefinition_4= ruleDatatypeDefinition | this_HasKey_5= ruleHasKey | this_Assertion_6= ruleAssertion | this_AnnotationAxiom_7= ruleAnnotationAxiom )
            int alt30=8;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt30=1;
                }
                break;
            case 56:
            case 57:
            case 58:
            case 59:
                {
                alt30=2;
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
                alt30=3;
                }
                break;
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
                {
                alt30=4;
                }
                break;
            case 80:
                {
                alt30=5;
                }
                break;
            case 81:
                {
                alt30=6;
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
                alt30=7;
                }
                break;
            case 90:
            case 91:
            case 92:
            case 93:
                {
                alt30=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalOwl.g:3185:3: this_Declaration_0= ruleDeclaration
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
                    // InternalOwl.g:3194:3: this_ClassAxiom_1= ruleClassAxiom
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
                    // InternalOwl.g:3203:3: this_ObjectPropertyAxiom_2= ruleObjectPropertyAxiom
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
                    // InternalOwl.g:3212:3: this_DataPropertyAxiom_3= ruleDataPropertyAxiom
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
                    // InternalOwl.g:3221:3: this_DatatypeDefinition_4= ruleDatatypeDefinition
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
                    // InternalOwl.g:3230:3: this_HasKey_5= ruleHasKey
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
                    // InternalOwl.g:3239:3: this_Assertion_6= ruleAssertion
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
                    // InternalOwl.g:3248:3: this_AnnotationAxiom_7= ruleAnnotationAxiom
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
    // InternalOwl.g:3260:1: entryRuleClassAxiom returns [EObject current=null] : iv_ruleClassAxiom= ruleClassAxiom EOF ;
    public final EObject entryRuleClassAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassAxiom = null;


        try {
            // InternalOwl.g:3260:51: (iv_ruleClassAxiom= ruleClassAxiom EOF )
            // InternalOwl.g:3261:2: iv_ruleClassAxiom= ruleClassAxiom EOF
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
    // InternalOwl.g:3267:1: ruleClassAxiom returns [EObject current=null] : (this_SubClassOf_0= ruleSubClassOf | this_EquivalentClasses_1= ruleEquivalentClasses | this_DisjointClasses_2= ruleDisjointClasses | this_DisjointUnion_3= ruleDisjointUnion ) ;
    public final EObject ruleClassAxiom() throws RecognitionException {
        EObject current = null;

        EObject this_SubClassOf_0 = null;

        EObject this_EquivalentClasses_1 = null;

        EObject this_DisjointClasses_2 = null;

        EObject this_DisjointUnion_3 = null;



        	enterRule();

        try {
            // InternalOwl.g:3273:2: ( (this_SubClassOf_0= ruleSubClassOf | this_EquivalentClasses_1= ruleEquivalentClasses | this_DisjointClasses_2= ruleDisjointClasses | this_DisjointUnion_3= ruleDisjointUnion ) )
            // InternalOwl.g:3274:2: (this_SubClassOf_0= ruleSubClassOf | this_EquivalentClasses_1= ruleEquivalentClasses | this_DisjointClasses_2= ruleDisjointClasses | this_DisjointUnion_3= ruleDisjointUnion )
            {
            // InternalOwl.g:3274:2: (this_SubClassOf_0= ruleSubClassOf | this_EquivalentClasses_1= ruleEquivalentClasses | this_DisjointClasses_2= ruleDisjointClasses | this_DisjointUnion_3= ruleDisjointUnion )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt31=1;
                }
                break;
            case 57:
                {
                alt31=2;
                }
                break;
            case 58:
                {
                alt31=3;
                }
                break;
            case 59:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalOwl.g:3275:3: this_SubClassOf_0= ruleSubClassOf
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
                    // InternalOwl.g:3284:3: this_EquivalentClasses_1= ruleEquivalentClasses
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
                    // InternalOwl.g:3293:3: this_DisjointClasses_2= ruleDisjointClasses
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
                    // InternalOwl.g:3302:3: this_DisjointUnion_3= ruleDisjointUnion
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
    // InternalOwl.g:3314:1: entryRuleSubClassOf returns [EObject current=null] : iv_ruleSubClassOf= ruleSubClassOf EOF ;
    public final EObject entryRuleSubClassOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubClassOf = null;


        try {
            // InternalOwl.g:3314:51: (iv_ruleSubClassOf= ruleSubClassOf EOF )
            // InternalOwl.g:3315:2: iv_ruleSubClassOf= ruleSubClassOf EOF
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
    // InternalOwl.g:3321:1: ruleSubClassOf returns [EObject current=null] : (otherlv_0= 'SubClassOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_subClassExpression_3_0= ruleClassExpression ) ) ( (lv_superClassExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' ) ;
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
            // InternalOwl.g:3327:2: ( (otherlv_0= 'SubClassOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_subClassExpression_3_0= ruleClassExpression ) ) ( (lv_superClassExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' ) )
            // InternalOwl.g:3328:2: (otherlv_0= 'SubClassOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_subClassExpression_3_0= ruleClassExpression ) ) ( (lv_superClassExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:3328:2: (otherlv_0= 'SubClassOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_subClassExpression_3_0= ruleClassExpression ) ) ( (lv_superClassExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' )
            // InternalOwl.g:3329:3: otherlv_0= 'SubClassOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_subClassExpression_3_0= ruleClassExpression ) ) ( (lv_superClassExpression_4_0= ruleClassExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSubClassOfAccess().getSubClassOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getSubClassOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:3337:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==89) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalOwl.g:3338:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:3338:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:3339:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getSubClassOfAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    break loop32;
                }
            } while (true);

            // InternalOwl.g:3356:3: ( (lv_subClassExpression_3_0= ruleClassExpression ) )
            // InternalOwl.g:3357:4: (lv_subClassExpression_3_0= ruleClassExpression )
            {
            // InternalOwl.g:3357:4: (lv_subClassExpression_3_0= ruleClassExpression )
            // InternalOwl.g:3358:5: lv_subClassExpression_3_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getSubClassOfAccess().getSubClassExpressionClassExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalOwl.g:3375:3: ( (lv_superClassExpression_4_0= ruleClassExpression ) )
            // InternalOwl.g:3376:4: (lv_superClassExpression_4_0= ruleClassExpression )
            {
            // InternalOwl.g:3376:4: (lv_superClassExpression_4_0= ruleClassExpression )
            // InternalOwl.g:3377:5: lv_superClassExpression_4_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getSubClassOfAccess().getSuperClassExpressionClassExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:3402:1: entryRuleEquivalentClasses returns [EObject current=null] : iv_ruleEquivalentClasses= ruleEquivalentClasses EOF ;
    public final EObject entryRuleEquivalentClasses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquivalentClasses = null;


        try {
            // InternalOwl.g:3402:58: (iv_ruleEquivalentClasses= ruleEquivalentClasses EOF )
            // InternalOwl.g:3403:2: iv_ruleEquivalentClasses= ruleEquivalentClasses EOF
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
    // InternalOwl.g:3409:1: ruleEquivalentClasses returns [EObject current=null] : (otherlv_0= 'EquivalentClasses' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpressions_3_0= ruleClassExpression ) ) ( (lv_classExpressions_4_0= ruleClassExpression ) )+ otherlv_5= ')' ) ;
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
            // InternalOwl.g:3415:2: ( (otherlv_0= 'EquivalentClasses' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpressions_3_0= ruleClassExpression ) ) ( (lv_classExpressions_4_0= ruleClassExpression ) )+ otherlv_5= ')' ) )
            // InternalOwl.g:3416:2: (otherlv_0= 'EquivalentClasses' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpressions_3_0= ruleClassExpression ) ) ( (lv_classExpressions_4_0= ruleClassExpression ) )+ otherlv_5= ')' )
            {
            // InternalOwl.g:3416:2: (otherlv_0= 'EquivalentClasses' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpressions_3_0= ruleClassExpression ) ) ( (lv_classExpressions_4_0= ruleClassExpression ) )+ otherlv_5= ')' )
            // InternalOwl.g:3417:3: otherlv_0= 'EquivalentClasses' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpressions_3_0= ruleClassExpression ) ) ( (lv_classExpressions_4_0= ruleClassExpression ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEquivalentClassesAccess().getEquivalentClassesKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getEquivalentClassesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:3425:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==89) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalOwl.g:3426:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:3426:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:3427:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getEquivalentClassesAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    break loop33;
                }
            } while (true);

            // InternalOwl.g:3444:3: ( (lv_classExpressions_3_0= ruleClassExpression ) )
            // InternalOwl.g:3445:4: (lv_classExpressions_3_0= ruleClassExpression )
            {
            // InternalOwl.g:3445:4: (lv_classExpressions_3_0= ruleClassExpression )
            // InternalOwl.g:3446:5: lv_classExpressions_3_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getEquivalentClassesAccess().getClassExpressionsClassExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalOwl.g:3463:3: ( (lv_classExpressions_4_0= ruleClassExpression ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_FULL_IRI && LA34_0<=RULE_PN_LOCAL)||(LA34_0>=39 && LA34_0<=55)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalOwl.g:3464:4: (lv_classExpressions_4_0= ruleClassExpression )
            	    {
            	    // InternalOwl.g:3464:4: (lv_classExpressions_4_0= ruleClassExpression )
            	    // InternalOwl.g:3465:5: lv_classExpressions_4_0= ruleClassExpression
            	    {

            	    					newCompositeNode(grammarAccess.getEquivalentClassesAccess().getClassExpressionsClassExpressionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_23);
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
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
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
    // InternalOwl.g:3490:1: entryRuleDisjointClasses returns [EObject current=null] : iv_ruleDisjointClasses= ruleDisjointClasses EOF ;
    public final EObject entryRuleDisjointClasses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjointClasses = null;


        try {
            // InternalOwl.g:3490:56: (iv_ruleDisjointClasses= ruleDisjointClasses EOF )
            // InternalOwl.g:3491:2: iv_ruleDisjointClasses= ruleDisjointClasses EOF
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
    // InternalOwl.g:3497:1: ruleDisjointClasses returns [EObject current=null] : (otherlv_0= 'DisjointClasses' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpressions_3_0= ruleClassExpression ) ) ( (lv_classExpressions_4_0= ruleClassExpression ) )+ otherlv_5= ')' ) ;
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
            // InternalOwl.g:3503:2: ( (otherlv_0= 'DisjointClasses' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpressions_3_0= ruleClassExpression ) ) ( (lv_classExpressions_4_0= ruleClassExpression ) )+ otherlv_5= ')' ) )
            // InternalOwl.g:3504:2: (otherlv_0= 'DisjointClasses' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpressions_3_0= ruleClassExpression ) ) ( (lv_classExpressions_4_0= ruleClassExpression ) )+ otherlv_5= ')' )
            {
            // InternalOwl.g:3504:2: (otherlv_0= 'DisjointClasses' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpressions_3_0= ruleClassExpression ) ) ( (lv_classExpressions_4_0= ruleClassExpression ) )+ otherlv_5= ')' )
            // InternalOwl.g:3505:3: otherlv_0= 'DisjointClasses' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpressions_3_0= ruleClassExpression ) ) ( (lv_classExpressions_4_0= ruleClassExpression ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDisjointClassesAccess().getDisjointClassesKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getDisjointClassesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:3513:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==89) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalOwl.g:3514:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:3514:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:3515:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getDisjointClassesAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    break loop35;
                }
            } while (true);

            // InternalOwl.g:3532:3: ( (lv_classExpressions_3_0= ruleClassExpression ) )
            // InternalOwl.g:3533:4: (lv_classExpressions_3_0= ruleClassExpression )
            {
            // InternalOwl.g:3533:4: (lv_classExpressions_3_0= ruleClassExpression )
            // InternalOwl.g:3534:5: lv_classExpressions_3_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getDisjointClassesAccess().getClassExpressionsClassExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalOwl.g:3551:3: ( (lv_classExpressions_4_0= ruleClassExpression ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_FULL_IRI && LA36_0<=RULE_PN_LOCAL)||(LA36_0>=39 && LA36_0<=55)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalOwl.g:3552:4: (lv_classExpressions_4_0= ruleClassExpression )
            	    {
            	    // InternalOwl.g:3552:4: (lv_classExpressions_4_0= ruleClassExpression )
            	    // InternalOwl.g:3553:5: lv_classExpressions_4_0= ruleClassExpression
            	    {

            	    					newCompositeNode(grammarAccess.getDisjointClassesAccess().getClassExpressionsClassExpressionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_23);
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
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
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
    // InternalOwl.g:3578:1: entryRuleDisjointUnion returns [EObject current=null] : iv_ruleDisjointUnion= ruleDisjointUnion EOF ;
    public final EObject entryRuleDisjointUnion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjointUnion = null;


        try {
            // InternalOwl.g:3578:54: (iv_ruleDisjointUnion= ruleDisjointUnion EOF )
            // InternalOwl.g:3579:2: iv_ruleDisjointUnion= ruleDisjointUnion EOF
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
    // InternalOwl.g:3585:1: ruleDisjointUnion returns [EObject current=null] : (otherlv_0= 'DisjointUnion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_class_3_0= ruleClassReference ) ) ( (lv_disjointClassExpressions_4_0= ruleClassExpression ) ) ( (lv_disjointClassExpressions_5_0= ruleClassExpression ) )+ otherlv_6= ')' ) ;
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
            // InternalOwl.g:3591:2: ( (otherlv_0= 'DisjointUnion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_class_3_0= ruleClassReference ) ) ( (lv_disjointClassExpressions_4_0= ruleClassExpression ) ) ( (lv_disjointClassExpressions_5_0= ruleClassExpression ) )+ otherlv_6= ')' ) )
            // InternalOwl.g:3592:2: (otherlv_0= 'DisjointUnion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_class_3_0= ruleClassReference ) ) ( (lv_disjointClassExpressions_4_0= ruleClassExpression ) ) ( (lv_disjointClassExpressions_5_0= ruleClassExpression ) )+ otherlv_6= ')' )
            {
            // InternalOwl.g:3592:2: (otherlv_0= 'DisjointUnion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_class_3_0= ruleClassReference ) ) ( (lv_disjointClassExpressions_4_0= ruleClassExpression ) ) ( (lv_disjointClassExpressions_5_0= ruleClassExpression ) )+ otherlv_6= ')' )
            // InternalOwl.g:3593:3: otherlv_0= 'DisjointUnion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_class_3_0= ruleClassReference ) ) ( (lv_disjointClassExpressions_4_0= ruleClassExpression ) ) ( (lv_disjointClassExpressions_5_0= ruleClassExpression ) )+ otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDisjointUnionAccess().getDisjointUnionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getDisjointUnionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:3601:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==89) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalOwl.g:3602:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:3602:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:3603:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getDisjointUnionAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop37;
                }
            } while (true);

            // InternalOwl.g:3620:3: ( (lv_class_3_0= ruleClassReference ) )
            // InternalOwl.g:3621:4: (lv_class_3_0= ruleClassReference )
            {
            // InternalOwl.g:3621:4: (lv_class_3_0= ruleClassReference )
            // InternalOwl.g:3622:5: lv_class_3_0= ruleClassReference
            {

            					newCompositeNode(grammarAccess.getDisjointUnionAccess().getClassClassReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalOwl.g:3639:3: ( (lv_disjointClassExpressions_4_0= ruleClassExpression ) )
            // InternalOwl.g:3640:4: (lv_disjointClassExpressions_4_0= ruleClassExpression )
            {
            // InternalOwl.g:3640:4: (lv_disjointClassExpressions_4_0= ruleClassExpression )
            // InternalOwl.g:3641:5: lv_disjointClassExpressions_4_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getDisjointUnionAccess().getDisjointClassExpressionsClassExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalOwl.g:3658:3: ( (lv_disjointClassExpressions_5_0= ruleClassExpression ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_FULL_IRI && LA38_0<=RULE_PN_LOCAL)||(LA38_0>=39 && LA38_0<=55)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalOwl.g:3659:4: (lv_disjointClassExpressions_5_0= ruleClassExpression )
            	    {
            	    // InternalOwl.g:3659:4: (lv_disjointClassExpressions_5_0= ruleClassExpression )
            	    // InternalOwl.g:3660:5: lv_disjointClassExpressions_5_0= ruleClassExpression
            	    {

            	    					newCompositeNode(grammarAccess.getDisjointUnionAccess().getDisjointClassExpressionsClassExpressionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_23);
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
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
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
    // InternalOwl.g:3685:1: entryRuleObjectPropertyAxiom returns [EObject current=null] : iv_ruleObjectPropertyAxiom= ruleObjectPropertyAxiom EOF ;
    public final EObject entryRuleObjectPropertyAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectPropertyAxiom = null;


        try {
            // InternalOwl.g:3685:60: (iv_ruleObjectPropertyAxiom= ruleObjectPropertyAxiom EOF )
            // InternalOwl.g:3686:2: iv_ruleObjectPropertyAxiom= ruleObjectPropertyAxiom EOF
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
    // InternalOwl.g:3692:1: ruleObjectPropertyAxiom returns [EObject current=null] : (this_SubObjectPropertyOf_0= ruleSubObjectPropertyOf | this_EquivalentObjectProperties_1= ruleEquivalentObjectProperties | this_DisjointObjectProperties_2= ruleDisjointObjectProperties | this_InverseObjectProperties_3= ruleInverseObjectProperties | this_ObjectPropertyDomain_4= ruleObjectPropertyDomain | this_ObjectPropertyRange_5= ruleObjectPropertyRange | this_FunctionalObjectProperty_6= ruleFunctionalObjectProperty | this_InverseFunctionalObjectProperty_7= ruleInverseFunctionalObjectProperty | this_ReflexiveObjectProperty_8= ruleReflexiveObjectProperty | this_IrreflexiveObjectProperty_9= ruleIrreflexiveObjectProperty | this_SymmetricObjectProperty_10= ruleSymmetricObjectProperty | this_AsymmetricObjectProperty_11= ruleAsymmetricObjectProperty | this_TransitiveObjectProperty_12= ruleTransitiveObjectProperty ) ;
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
            // InternalOwl.g:3698:2: ( (this_SubObjectPropertyOf_0= ruleSubObjectPropertyOf | this_EquivalentObjectProperties_1= ruleEquivalentObjectProperties | this_DisjointObjectProperties_2= ruleDisjointObjectProperties | this_InverseObjectProperties_3= ruleInverseObjectProperties | this_ObjectPropertyDomain_4= ruleObjectPropertyDomain | this_ObjectPropertyRange_5= ruleObjectPropertyRange | this_FunctionalObjectProperty_6= ruleFunctionalObjectProperty | this_InverseFunctionalObjectProperty_7= ruleInverseFunctionalObjectProperty | this_ReflexiveObjectProperty_8= ruleReflexiveObjectProperty | this_IrreflexiveObjectProperty_9= ruleIrreflexiveObjectProperty | this_SymmetricObjectProperty_10= ruleSymmetricObjectProperty | this_AsymmetricObjectProperty_11= ruleAsymmetricObjectProperty | this_TransitiveObjectProperty_12= ruleTransitiveObjectProperty ) )
            // InternalOwl.g:3699:2: (this_SubObjectPropertyOf_0= ruleSubObjectPropertyOf | this_EquivalentObjectProperties_1= ruleEquivalentObjectProperties | this_DisjointObjectProperties_2= ruleDisjointObjectProperties | this_InverseObjectProperties_3= ruleInverseObjectProperties | this_ObjectPropertyDomain_4= ruleObjectPropertyDomain | this_ObjectPropertyRange_5= ruleObjectPropertyRange | this_FunctionalObjectProperty_6= ruleFunctionalObjectProperty | this_InverseFunctionalObjectProperty_7= ruleInverseFunctionalObjectProperty | this_ReflexiveObjectProperty_8= ruleReflexiveObjectProperty | this_IrreflexiveObjectProperty_9= ruleIrreflexiveObjectProperty | this_SymmetricObjectProperty_10= ruleSymmetricObjectProperty | this_AsymmetricObjectProperty_11= ruleAsymmetricObjectProperty | this_TransitiveObjectProperty_12= ruleTransitiveObjectProperty )
            {
            // InternalOwl.g:3699:2: (this_SubObjectPropertyOf_0= ruleSubObjectPropertyOf | this_EquivalentObjectProperties_1= ruleEquivalentObjectProperties | this_DisjointObjectProperties_2= ruleDisjointObjectProperties | this_InverseObjectProperties_3= ruleInverseObjectProperties | this_ObjectPropertyDomain_4= ruleObjectPropertyDomain | this_ObjectPropertyRange_5= ruleObjectPropertyRange | this_FunctionalObjectProperty_6= ruleFunctionalObjectProperty | this_InverseFunctionalObjectProperty_7= ruleInverseFunctionalObjectProperty | this_ReflexiveObjectProperty_8= ruleReflexiveObjectProperty | this_IrreflexiveObjectProperty_9= ruleIrreflexiveObjectProperty | this_SymmetricObjectProperty_10= ruleSymmetricObjectProperty | this_AsymmetricObjectProperty_11= ruleAsymmetricObjectProperty | this_TransitiveObjectProperty_12= ruleTransitiveObjectProperty )
            int alt39=13;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt39=1;
                }
                break;
            case 62:
                {
                alt39=2;
                }
                break;
            case 63:
                {
                alt39=3;
                }
                break;
            case 64:
                {
                alt39=4;
                }
                break;
            case 65:
                {
                alt39=5;
                }
                break;
            case 66:
                {
                alt39=6;
                }
                break;
            case 67:
                {
                alt39=7;
                }
                break;
            case 68:
                {
                alt39=8;
                }
                break;
            case 69:
                {
                alt39=9;
                }
                break;
            case 70:
                {
                alt39=10;
                }
                break;
            case 71:
                {
                alt39=11;
                }
                break;
            case 72:
                {
                alt39=12;
                }
                break;
            case 73:
                {
                alt39=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalOwl.g:3700:3: this_SubObjectPropertyOf_0= ruleSubObjectPropertyOf
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
                    // InternalOwl.g:3709:3: this_EquivalentObjectProperties_1= ruleEquivalentObjectProperties
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
                    // InternalOwl.g:3718:3: this_DisjointObjectProperties_2= ruleDisjointObjectProperties
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
                    // InternalOwl.g:3727:3: this_InverseObjectProperties_3= ruleInverseObjectProperties
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
                    // InternalOwl.g:3736:3: this_ObjectPropertyDomain_4= ruleObjectPropertyDomain
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
                    // InternalOwl.g:3745:3: this_ObjectPropertyRange_5= ruleObjectPropertyRange
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
                    // InternalOwl.g:3754:3: this_FunctionalObjectProperty_6= ruleFunctionalObjectProperty
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
                    // InternalOwl.g:3763:3: this_InverseFunctionalObjectProperty_7= ruleInverseFunctionalObjectProperty
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
                    // InternalOwl.g:3772:3: this_ReflexiveObjectProperty_8= ruleReflexiveObjectProperty
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
                    // InternalOwl.g:3781:3: this_IrreflexiveObjectProperty_9= ruleIrreflexiveObjectProperty
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
                    // InternalOwl.g:3790:3: this_SymmetricObjectProperty_10= ruleSymmetricObjectProperty
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
                    // InternalOwl.g:3799:3: this_AsymmetricObjectProperty_11= ruleAsymmetricObjectProperty
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
                    // InternalOwl.g:3808:3: this_TransitiveObjectProperty_12= ruleTransitiveObjectProperty
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
    // InternalOwl.g:3820:1: entryRuleSubObjectPropertyOf returns [EObject current=null] : iv_ruleSubObjectPropertyOf= ruleSubObjectPropertyOf EOF ;
    public final EObject entryRuleSubObjectPropertyOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubObjectPropertyOf = null;


        try {
            // InternalOwl.g:3820:60: (iv_ruleSubObjectPropertyOf= ruleSubObjectPropertyOf EOF )
            // InternalOwl.g:3821:2: iv_ruleSubObjectPropertyOf= ruleSubObjectPropertyOf EOF
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
    // InternalOwl.g:3827:1: ruleSubObjectPropertyOf returns [EObject current=null] : (otherlv_0= 'SubObjectPropertyOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( ( (lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) | (otherlv_4= 'ObjectPropertyChain' otherlv_5= '(' ( (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression ) )+ otherlv_7= ')' ) ) otherlv_8= ')' ) ;
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
            // InternalOwl.g:3833:2: ( (otherlv_0= 'SubObjectPropertyOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( ( (lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) | (otherlv_4= 'ObjectPropertyChain' otherlv_5= '(' ( (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression ) )+ otherlv_7= ')' ) ) otherlv_8= ')' ) )
            // InternalOwl.g:3834:2: (otherlv_0= 'SubObjectPropertyOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( ( (lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) | (otherlv_4= 'ObjectPropertyChain' otherlv_5= '(' ( (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression ) )+ otherlv_7= ')' ) ) otherlv_8= ')' )
            {
            // InternalOwl.g:3834:2: (otherlv_0= 'SubObjectPropertyOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( ( (lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) | (otherlv_4= 'ObjectPropertyChain' otherlv_5= '(' ( (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression ) )+ otherlv_7= ')' ) ) otherlv_8= ')' )
            // InternalOwl.g:3835:3: otherlv_0= 'SubObjectPropertyOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( ( (lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) | (otherlv_4= 'ObjectPropertyChain' otherlv_5= '(' ( (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression ) )+ otherlv_7= ')' ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSubObjectPropertyOfAccess().getSubObjectPropertyOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getSubObjectPropertyOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:3843:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==89) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalOwl.g:3844:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:3844:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:3845:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getSubObjectPropertyOfAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_31);
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
            	    break loop40;
                }
            } while (true);

            // InternalOwl.g:3862:3: ( ( (lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) | (otherlv_4= 'ObjectPropertyChain' otherlv_5= '(' ( (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression ) )+ otherlv_7= ')' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_FULL_IRI && LA42_0<=RULE_PN_LOCAL)||LA42_0==33) ) {
                alt42=1;
            }
            else if ( (LA42_0==61) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalOwl.g:3863:4: ( (lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
                    {
                    // InternalOwl.g:3863:4: ( (lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
                    // InternalOwl.g:3864:5: (lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression )
                    {
                    // InternalOwl.g:3864:5: (lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression )
                    // InternalOwl.g:3865:6: lv_subObjectPropertyExpression_3_0= ruleObjectPropertyExpression
                    {

                    						newCompositeNode(grammarAccess.getSubObjectPropertyOfAccess().getSubObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_9);
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
                    // InternalOwl.g:3883:4: (otherlv_4= 'ObjectPropertyChain' otherlv_5= '(' ( (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression ) )+ otherlv_7= ')' )
                    {
                    // InternalOwl.g:3883:4: (otherlv_4= 'ObjectPropertyChain' otherlv_5= '(' ( (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression ) )+ otherlv_7= ')' )
                    // InternalOwl.g:3884:5: otherlv_4= 'ObjectPropertyChain' otherlv_5= '(' ( (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression ) )+ otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,61,FOLLOW_5); 

                    					newLeafNode(otherlv_4, grammarAccess.getSubObjectPropertyOfAccess().getObjectPropertyChainKeyword_3_1_0());
                    				
                    otherlv_5=(Token)match(input,20,FOLLOW_26); 

                    					newLeafNode(otherlv_5, grammarAccess.getSubObjectPropertyOfAccess().getLeftParenthesisKeyword_3_1_1());
                    				
                    // InternalOwl.g:3892:5: ( (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression ) )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( ((LA41_0>=RULE_FULL_IRI && LA41_0<=RULE_PN_LOCAL)||LA41_0==33) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalOwl.g:3893:6: (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression )
                    	    {
                    	    // InternalOwl.g:3893:6: (lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression )
                    	    // InternalOwl.g:3894:7: lv_subObjectPropertyExpression_6_0= ruleObjectPropertyExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSubObjectPropertyOfAccess().getSubObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
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
                    	    if ( cnt41 >= 1 ) break loop41;
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);

                    otherlv_7=(Token)match(input,22,FOLLOW_9); 

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
    // InternalOwl.g:3925:1: entryRuleEquivalentObjectProperties returns [EObject current=null] : iv_ruleEquivalentObjectProperties= ruleEquivalentObjectProperties EOF ;
    public final EObject entryRuleEquivalentObjectProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquivalentObjectProperties = null;


        try {
            // InternalOwl.g:3925:67: (iv_ruleEquivalentObjectProperties= ruleEquivalentObjectProperties EOF )
            // InternalOwl.g:3926:2: iv_ruleEquivalentObjectProperties= ruleEquivalentObjectProperties EOF
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
    // InternalOwl.g:3932:1: ruleEquivalentObjectProperties returns [EObject current=null] : (otherlv_0= 'EquivalentObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+ otherlv_5= ')' ) ;
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
            // InternalOwl.g:3938:2: ( (otherlv_0= 'EquivalentObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+ otherlv_5= ')' ) )
            // InternalOwl.g:3939:2: (otherlv_0= 'EquivalentObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+ otherlv_5= ')' )
            {
            // InternalOwl.g:3939:2: (otherlv_0= 'EquivalentObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+ otherlv_5= ')' )
            // InternalOwl.g:3940:3: otherlv_0= 'EquivalentObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEquivalentObjectPropertiesAccess().getEquivalentObjectPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getEquivalentObjectPropertiesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:3948:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==89) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalOwl.g:3949:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:3949:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:3950:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getEquivalentObjectPropertiesAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop43;
                }
            } while (true);

            // InternalOwl.g:3967:3: ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:3968:4: (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:3968:4: (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:3969:5: lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getEquivalentObjectPropertiesAccess().getObjectPropertyExpressionsObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalOwl.g:3986:3: ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_FULL_IRI && LA44_0<=RULE_PN_LOCAL)||LA44_0==33) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalOwl.g:3987:4: (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression )
            	    {
            	    // InternalOwl.g:3987:4: (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression )
            	    // InternalOwl.g:3988:5: lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression
            	    {

            	    					newCompositeNode(grammarAccess.getEquivalentObjectPropertiesAccess().getObjectPropertyExpressionsObjectPropertyExpressionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_32);
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
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
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
    // InternalOwl.g:4013:1: entryRuleDisjointObjectProperties returns [EObject current=null] : iv_ruleDisjointObjectProperties= ruleDisjointObjectProperties EOF ;
    public final EObject entryRuleDisjointObjectProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjointObjectProperties = null;


        try {
            // InternalOwl.g:4013:65: (iv_ruleDisjointObjectProperties= ruleDisjointObjectProperties EOF )
            // InternalOwl.g:4014:2: iv_ruleDisjointObjectProperties= ruleDisjointObjectProperties EOF
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
    // InternalOwl.g:4020:1: ruleDisjointObjectProperties returns [EObject current=null] : (otherlv_0= 'DisjointObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+ otherlv_5= ')' ) ;
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
            // InternalOwl.g:4026:2: ( (otherlv_0= 'DisjointObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+ otherlv_5= ')' ) )
            // InternalOwl.g:4027:2: (otherlv_0= 'DisjointObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+ otherlv_5= ')' )
            {
            // InternalOwl.g:4027:2: (otherlv_0= 'DisjointObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+ otherlv_5= ')' )
            // InternalOwl.g:4028:3: otherlv_0= 'DisjointObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDisjointObjectPropertiesAccess().getDisjointObjectPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getDisjointObjectPropertiesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4036:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==89) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalOwl.g:4037:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4037:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4038:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getDisjointObjectPropertiesAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop45;
                }
            } while (true);

            // InternalOwl.g:4055:3: ( (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4056:4: (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4056:4: (lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4057:5: lv_objectPropertyExpressions_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getDisjointObjectPropertiesAccess().getObjectPropertyExpressionsObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalOwl.g:4074:3: ( (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_FULL_IRI && LA46_0<=RULE_PN_LOCAL)||LA46_0==33) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalOwl.g:4075:4: (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression )
            	    {
            	    // InternalOwl.g:4075:4: (lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression )
            	    // InternalOwl.g:4076:5: lv_objectPropertyExpressions_4_0= ruleObjectPropertyExpression
            	    {

            	    					newCompositeNode(grammarAccess.getDisjointObjectPropertiesAccess().getObjectPropertyExpressionsObjectPropertyExpressionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_32);
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
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
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
    // InternalOwl.g:4101:1: entryRuleInverseObjectProperties returns [EObject current=null] : iv_ruleInverseObjectProperties= ruleInverseObjectProperties EOF ;
    public final EObject entryRuleInverseObjectProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInverseObjectProperties = null;


        try {
            // InternalOwl.g:4101:64: (iv_ruleInverseObjectProperties= ruleInverseObjectProperties EOF )
            // InternalOwl.g:4102:2: iv_ruleInverseObjectProperties= ruleInverseObjectProperties EOF
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
    // InternalOwl.g:4108:1: ruleInverseObjectProperties returns [EObject current=null] : (otherlv_0= 'InverseObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression1_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpression2_4_0= ruleObjectPropertyExpression ) ) otherlv_5= ')' ) ;
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
            // InternalOwl.g:4114:2: ( (otherlv_0= 'InverseObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression1_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpression2_4_0= ruleObjectPropertyExpression ) ) otherlv_5= ')' ) )
            // InternalOwl.g:4115:2: (otherlv_0= 'InverseObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression1_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpression2_4_0= ruleObjectPropertyExpression ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:4115:2: (otherlv_0= 'InverseObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression1_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpression2_4_0= ruleObjectPropertyExpression ) ) otherlv_5= ')' )
            // InternalOwl.g:4116:3: otherlv_0= 'InverseObjectProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression1_3_0= ruleObjectPropertyExpression ) ) ( (lv_objectPropertyExpression2_4_0= ruleObjectPropertyExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInverseObjectPropertiesAccess().getInverseObjectPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getInverseObjectPropertiesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4124:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==89) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalOwl.g:4125:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4125:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4126:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getInverseObjectPropertiesAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop47;
                }
            } while (true);

            // InternalOwl.g:4143:3: ( (lv_objectPropertyExpression1_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4144:4: (lv_objectPropertyExpression1_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4144:4: (lv_objectPropertyExpression1_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4145:5: lv_objectPropertyExpression1_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getInverseObjectPropertiesAccess().getObjectPropertyExpression1ObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalOwl.g:4162:3: ( (lv_objectPropertyExpression2_4_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4163:4: (lv_objectPropertyExpression2_4_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4163:4: (lv_objectPropertyExpression2_4_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4164:5: lv_objectPropertyExpression2_4_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getInverseObjectPropertiesAccess().getObjectPropertyExpression2ObjectPropertyExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:4189:1: entryRuleObjectPropertyDomain returns [EObject current=null] : iv_ruleObjectPropertyDomain= ruleObjectPropertyDomain EOF ;
    public final EObject entryRuleObjectPropertyDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectPropertyDomain = null;


        try {
            // InternalOwl.g:4189:61: (iv_ruleObjectPropertyDomain= ruleObjectPropertyDomain EOF )
            // InternalOwl.g:4190:2: iv_ruleObjectPropertyDomain= ruleObjectPropertyDomain EOF
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
    // InternalOwl.g:4196:1: ruleObjectPropertyDomain returns [EObject current=null] : (otherlv_0= 'ObjectPropertyDomain' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' ) ;
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
            // InternalOwl.g:4202:2: ( (otherlv_0= 'ObjectPropertyDomain' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' ) )
            // InternalOwl.g:4203:2: (otherlv_0= 'ObjectPropertyDomain' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:4203:2: (otherlv_0= 'ObjectPropertyDomain' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' )
            // InternalOwl.g:4204:3: otherlv_0= 'ObjectPropertyDomain' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectPropertyDomainAccess().getObjectPropertyDomainKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectPropertyDomainAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4212:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==89) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalOwl.g:4213:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4213:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4214:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getObjectPropertyDomainAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop48;
                }
            } while (true);

            // InternalOwl.g:4231:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4232:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4232:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4233:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getObjectPropertyDomainAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalOwl.g:4250:3: ( (lv_classExpression_4_0= ruleClassExpression ) )
            // InternalOwl.g:4251:4: (lv_classExpression_4_0= ruleClassExpression )
            {
            // InternalOwl.g:4251:4: (lv_classExpression_4_0= ruleClassExpression )
            // InternalOwl.g:4252:5: lv_classExpression_4_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getObjectPropertyDomainAccess().getClassExpressionClassExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:4277:1: entryRuleObjectPropertyRange returns [EObject current=null] : iv_ruleObjectPropertyRange= ruleObjectPropertyRange EOF ;
    public final EObject entryRuleObjectPropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectPropertyRange = null;


        try {
            // InternalOwl.g:4277:60: (iv_ruleObjectPropertyRange= ruleObjectPropertyRange EOF )
            // InternalOwl.g:4278:2: iv_ruleObjectPropertyRange= ruleObjectPropertyRange EOF
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
    // InternalOwl.g:4284:1: ruleObjectPropertyRange returns [EObject current=null] : (otherlv_0= 'ObjectPropertyRange' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' ) ;
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
            // InternalOwl.g:4290:2: ( (otherlv_0= 'ObjectPropertyRange' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' ) )
            // InternalOwl.g:4291:2: (otherlv_0= 'ObjectPropertyRange' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:4291:2: (otherlv_0= 'ObjectPropertyRange' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' )
            // InternalOwl.g:4292:3: otherlv_0= 'ObjectPropertyRange' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectPropertyRangeAccess().getObjectPropertyRangeKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectPropertyRangeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4300:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==89) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalOwl.g:4301:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4301:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4302:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getObjectPropertyRangeAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop49;
                }
            } while (true);

            // InternalOwl.g:4319:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4320:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4320:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4321:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getObjectPropertyRangeAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalOwl.g:4338:3: ( (lv_classExpression_4_0= ruleClassExpression ) )
            // InternalOwl.g:4339:4: (lv_classExpression_4_0= ruleClassExpression )
            {
            // InternalOwl.g:4339:4: (lv_classExpression_4_0= ruleClassExpression )
            // InternalOwl.g:4340:5: lv_classExpression_4_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getObjectPropertyRangeAccess().getClassExpressionClassExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:4365:1: entryRuleFunctionalObjectProperty returns [EObject current=null] : iv_ruleFunctionalObjectProperty= ruleFunctionalObjectProperty EOF ;
    public final EObject entryRuleFunctionalObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalObjectProperty = null;


        try {
            // InternalOwl.g:4365:65: (iv_ruleFunctionalObjectProperty= ruleFunctionalObjectProperty EOF )
            // InternalOwl.g:4366:2: iv_ruleFunctionalObjectProperty= ruleFunctionalObjectProperty EOF
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
    // InternalOwl.g:4372:1: ruleFunctionalObjectProperty returns [EObject current=null] : (otherlv_0= 'FunctionalObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleFunctionalObjectProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:4378:2: ( (otherlv_0= 'FunctionalObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) )
            // InternalOwl.g:4379:2: (otherlv_0= 'FunctionalObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:4379:2: (otherlv_0= 'FunctionalObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            // InternalOwl.g:4380:3: otherlv_0= 'FunctionalObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionalObjectPropertyAccess().getFunctionalObjectPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionalObjectPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4388:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==89) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalOwl.g:4389:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4389:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4390:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionalObjectPropertyAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop50;
                }
            } while (true);

            // InternalOwl.g:4407:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4408:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4408:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4409:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getFunctionalObjectPropertyAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:4434:1: entryRuleInverseFunctionalObjectProperty returns [EObject current=null] : iv_ruleInverseFunctionalObjectProperty= ruleInverseFunctionalObjectProperty EOF ;
    public final EObject entryRuleInverseFunctionalObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInverseFunctionalObjectProperty = null;


        try {
            // InternalOwl.g:4434:72: (iv_ruleInverseFunctionalObjectProperty= ruleInverseFunctionalObjectProperty EOF )
            // InternalOwl.g:4435:2: iv_ruleInverseFunctionalObjectProperty= ruleInverseFunctionalObjectProperty EOF
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
    // InternalOwl.g:4441:1: ruleInverseFunctionalObjectProperty returns [EObject current=null] : (otherlv_0= 'InverseFunctionalObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleInverseFunctionalObjectProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:4447:2: ( (otherlv_0= 'InverseFunctionalObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) )
            // InternalOwl.g:4448:2: (otherlv_0= 'InverseFunctionalObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:4448:2: (otherlv_0= 'InverseFunctionalObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            // InternalOwl.g:4449:3: otherlv_0= 'InverseFunctionalObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInverseFunctionalObjectPropertyAccess().getInverseFunctionalObjectPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getInverseFunctionalObjectPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4457:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==89) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalOwl.g:4458:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4458:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4459:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getInverseFunctionalObjectPropertyAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop51;
                }
            } while (true);

            // InternalOwl.g:4476:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4477:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4477:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4478:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getInverseFunctionalObjectPropertyAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:4503:1: entryRuleReflexiveObjectProperty returns [EObject current=null] : iv_ruleReflexiveObjectProperty= ruleReflexiveObjectProperty EOF ;
    public final EObject entryRuleReflexiveObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReflexiveObjectProperty = null;


        try {
            // InternalOwl.g:4503:64: (iv_ruleReflexiveObjectProperty= ruleReflexiveObjectProperty EOF )
            // InternalOwl.g:4504:2: iv_ruleReflexiveObjectProperty= ruleReflexiveObjectProperty EOF
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
    // InternalOwl.g:4510:1: ruleReflexiveObjectProperty returns [EObject current=null] : (otherlv_0= 'ReflectiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleReflexiveObjectProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:4516:2: ( (otherlv_0= 'ReflectiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) )
            // InternalOwl.g:4517:2: (otherlv_0= 'ReflectiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:4517:2: (otherlv_0= 'ReflectiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            // InternalOwl.g:4518:3: otherlv_0= 'ReflectiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getReflexiveObjectPropertyAccess().getReflectiveObjectPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getReflexiveObjectPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4526:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==89) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalOwl.g:4527:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4527:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4528:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getReflexiveObjectPropertyAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop52;
                }
            } while (true);

            // InternalOwl.g:4545:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4546:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4546:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4547:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getReflexiveObjectPropertyAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:4572:1: entryRuleIrreflexiveObjectProperty returns [EObject current=null] : iv_ruleIrreflexiveObjectProperty= ruleIrreflexiveObjectProperty EOF ;
    public final EObject entryRuleIrreflexiveObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIrreflexiveObjectProperty = null;


        try {
            // InternalOwl.g:4572:66: (iv_ruleIrreflexiveObjectProperty= ruleIrreflexiveObjectProperty EOF )
            // InternalOwl.g:4573:2: iv_ruleIrreflexiveObjectProperty= ruleIrreflexiveObjectProperty EOF
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
    // InternalOwl.g:4579:1: ruleIrreflexiveObjectProperty returns [EObject current=null] : (otherlv_0= 'IrreflectiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleIrreflexiveObjectProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:4585:2: ( (otherlv_0= 'IrreflectiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) )
            // InternalOwl.g:4586:2: (otherlv_0= 'IrreflectiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:4586:2: (otherlv_0= 'IrreflectiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            // InternalOwl.g:4587:3: otherlv_0= 'IrreflectiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getIrreflexiveObjectPropertyAccess().getIrreflectiveObjectPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getIrreflexiveObjectPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4595:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==89) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalOwl.g:4596:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4596:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4597:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getIrreflexiveObjectPropertyAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop53;
                }
            } while (true);

            // InternalOwl.g:4614:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4615:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4615:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4616:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getIrreflexiveObjectPropertyAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:4641:1: entryRuleSymmetricObjectProperty returns [EObject current=null] : iv_ruleSymmetricObjectProperty= ruleSymmetricObjectProperty EOF ;
    public final EObject entryRuleSymmetricObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymmetricObjectProperty = null;


        try {
            // InternalOwl.g:4641:64: (iv_ruleSymmetricObjectProperty= ruleSymmetricObjectProperty EOF )
            // InternalOwl.g:4642:2: iv_ruleSymmetricObjectProperty= ruleSymmetricObjectProperty EOF
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
    // InternalOwl.g:4648:1: ruleSymmetricObjectProperty returns [EObject current=null] : (otherlv_0= 'SymmetricObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleSymmetricObjectProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:4654:2: ( (otherlv_0= 'SymmetricObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) )
            // InternalOwl.g:4655:2: (otherlv_0= 'SymmetricObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:4655:2: (otherlv_0= 'SymmetricObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            // InternalOwl.g:4656:3: otherlv_0= 'SymmetricObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSymmetricObjectPropertyAccess().getSymmetricObjectPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getSymmetricObjectPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4664:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==89) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalOwl.g:4665:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4665:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4666:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getSymmetricObjectPropertyAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop54;
                }
            } while (true);

            // InternalOwl.g:4683:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4684:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4684:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4685:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getSymmetricObjectPropertyAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:4710:1: entryRuleAsymmetricObjectProperty returns [EObject current=null] : iv_ruleAsymmetricObjectProperty= ruleAsymmetricObjectProperty EOF ;
    public final EObject entryRuleAsymmetricObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsymmetricObjectProperty = null;


        try {
            // InternalOwl.g:4710:65: (iv_ruleAsymmetricObjectProperty= ruleAsymmetricObjectProperty EOF )
            // InternalOwl.g:4711:2: iv_ruleAsymmetricObjectProperty= ruleAsymmetricObjectProperty EOF
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
    // InternalOwl.g:4717:1: ruleAsymmetricObjectProperty returns [EObject current=null] : (otherlv_0= 'AsymmetricObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleAsymmetricObjectProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:4723:2: ( (otherlv_0= 'AsymmetricObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) )
            // InternalOwl.g:4724:2: (otherlv_0= 'AsymmetricObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:4724:2: (otherlv_0= 'AsymmetricObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            // InternalOwl.g:4725:3: otherlv_0= 'AsymmetricObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAsymmetricObjectPropertyAccess().getAsymmetricObjectPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getAsymmetricObjectPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4733:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==89) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalOwl.g:4734:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4734:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4735:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getAsymmetricObjectPropertyAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop55;
                }
            } while (true);

            // InternalOwl.g:4752:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4753:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4753:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4754:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getAsymmetricObjectPropertyAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:4779:1: entryRuleTransitiveObjectProperty returns [EObject current=null] : iv_ruleTransitiveObjectProperty= ruleTransitiveObjectProperty EOF ;
    public final EObject entryRuleTransitiveObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitiveObjectProperty = null;


        try {
            // InternalOwl.g:4779:65: (iv_ruleTransitiveObjectProperty= ruleTransitiveObjectProperty EOF )
            // InternalOwl.g:4780:2: iv_ruleTransitiveObjectProperty= ruleTransitiveObjectProperty EOF
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
    // InternalOwl.g:4786:1: ruleTransitiveObjectProperty returns [EObject current=null] : (otherlv_0= 'TransitiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleTransitiveObjectProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_objectPropertyExpression_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:4792:2: ( (otherlv_0= 'TransitiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' ) )
            // InternalOwl.g:4793:2: (otherlv_0= 'TransitiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:4793:2: (otherlv_0= 'TransitiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')' )
            // InternalOwl.g:4794:3: otherlv_0= 'TransitiveObjectProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitiveObjectPropertyAccess().getTransitiveObjectPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitiveObjectPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4802:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==89) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalOwl.g:4803:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4803:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4804:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getTransitiveObjectPropertyAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop56;
                }
            } while (true);

            // InternalOwl.g:4821:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:4822:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:4822:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:4823:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getTransitiveObjectPropertyAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:4848:1: entryRuleDataPropertyAxiom returns [EObject current=null] : iv_ruleDataPropertyAxiom= ruleDataPropertyAxiom EOF ;
    public final EObject entryRuleDataPropertyAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPropertyAxiom = null;


        try {
            // InternalOwl.g:4848:58: (iv_ruleDataPropertyAxiom= ruleDataPropertyAxiom EOF )
            // InternalOwl.g:4849:2: iv_ruleDataPropertyAxiom= ruleDataPropertyAxiom EOF
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
    // InternalOwl.g:4855:1: ruleDataPropertyAxiom returns [EObject current=null] : (this_SubDataPropertyOf_0= ruleSubDataPropertyOf | this_EquivalentDataProperties_1= ruleEquivalentDataProperties | this_DisjointDataProperties_2= ruleDisjointDataProperties | this_DataPropertyDomain_3= ruleDataPropertyDomain | this_DataPropertyRange_4= ruleDataPropertyRange | this_FunctionalDataProperty_5= ruleFunctionalDataProperty ) ;
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
            // InternalOwl.g:4861:2: ( (this_SubDataPropertyOf_0= ruleSubDataPropertyOf | this_EquivalentDataProperties_1= ruleEquivalentDataProperties | this_DisjointDataProperties_2= ruleDisjointDataProperties | this_DataPropertyDomain_3= ruleDataPropertyDomain | this_DataPropertyRange_4= ruleDataPropertyRange | this_FunctionalDataProperty_5= ruleFunctionalDataProperty ) )
            // InternalOwl.g:4862:2: (this_SubDataPropertyOf_0= ruleSubDataPropertyOf | this_EquivalentDataProperties_1= ruleEquivalentDataProperties | this_DisjointDataProperties_2= ruleDisjointDataProperties | this_DataPropertyDomain_3= ruleDataPropertyDomain | this_DataPropertyRange_4= ruleDataPropertyRange | this_FunctionalDataProperty_5= ruleFunctionalDataProperty )
            {
            // InternalOwl.g:4862:2: (this_SubDataPropertyOf_0= ruleSubDataPropertyOf | this_EquivalentDataProperties_1= ruleEquivalentDataProperties | this_DisjointDataProperties_2= ruleDisjointDataProperties | this_DataPropertyDomain_3= ruleDataPropertyDomain | this_DataPropertyRange_4= ruleDataPropertyRange | this_FunctionalDataProperty_5= ruleFunctionalDataProperty )
            int alt57=6;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt57=1;
                }
                break;
            case 75:
                {
                alt57=2;
                }
                break;
            case 76:
                {
                alt57=3;
                }
                break;
            case 77:
                {
                alt57=4;
                }
                break;
            case 78:
                {
                alt57=5;
                }
                break;
            case 79:
                {
                alt57=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalOwl.g:4863:3: this_SubDataPropertyOf_0= ruleSubDataPropertyOf
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
                    // InternalOwl.g:4872:3: this_EquivalentDataProperties_1= ruleEquivalentDataProperties
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
                    // InternalOwl.g:4881:3: this_DisjointDataProperties_2= ruleDisjointDataProperties
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
                    // InternalOwl.g:4890:3: this_DataPropertyDomain_3= ruleDataPropertyDomain
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
                    // InternalOwl.g:4899:3: this_DataPropertyRange_4= ruleDataPropertyRange
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
                    // InternalOwl.g:4908:3: this_FunctionalDataProperty_5= ruleFunctionalDataProperty
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
    // InternalOwl.g:4920:1: entryRuleSubDataPropertyOf returns [EObject current=null] : iv_ruleSubDataPropertyOf= ruleSubDataPropertyOf EOF ;
    public final EObject entryRuleSubDataPropertyOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubDataPropertyOf = null;


        try {
            // InternalOwl.g:4920:58: (iv_ruleSubDataPropertyOf= ruleSubDataPropertyOf EOF )
            // InternalOwl.g:4921:2: iv_ruleSubDataPropertyOf= ruleSubDataPropertyOf EOF
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
    // InternalOwl.g:4927:1: ruleSubDataPropertyOf returns [EObject current=null] : (otherlv_0= 'SubDataPropertyOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_subDataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_superDataPropertyExpression_4_0= ruleDataPropertyExpression ) ) otherlv_5= ')' ) ;
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
            // InternalOwl.g:4933:2: ( (otherlv_0= 'SubDataPropertyOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_subDataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_superDataPropertyExpression_4_0= ruleDataPropertyExpression ) ) otherlv_5= ')' ) )
            // InternalOwl.g:4934:2: (otherlv_0= 'SubDataPropertyOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_subDataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_superDataPropertyExpression_4_0= ruleDataPropertyExpression ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:4934:2: (otherlv_0= 'SubDataPropertyOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_subDataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_superDataPropertyExpression_4_0= ruleDataPropertyExpression ) ) otherlv_5= ')' )
            // InternalOwl.g:4935:3: otherlv_0= 'SubDataPropertyOf' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_subDataPropertyExpression_3_0= ruleDataPropertyExpression ) ) ( (lv_superDataPropertyExpression_4_0= ruleDataPropertyExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSubDataPropertyOfAccess().getSubDataPropertyOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getSubDataPropertyOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:4943:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==89) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalOwl.g:4944:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:4944:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:4945:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getSubDataPropertyOfAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop58;
                }
            } while (true);

            // InternalOwl.g:4962:3: ( (lv_subDataPropertyExpression_3_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:4963:4: (lv_subDataPropertyExpression_3_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:4963:4: (lv_subDataPropertyExpression_3_0= ruleDataPropertyExpression )
            // InternalOwl.g:4964:5: lv_subDataPropertyExpression_3_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getSubDataPropertyOfAccess().getSubDataPropertyExpressionDataPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalOwl.g:4981:3: ( (lv_superDataPropertyExpression_4_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:4982:4: (lv_superDataPropertyExpression_4_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:4982:4: (lv_superDataPropertyExpression_4_0= ruleDataPropertyExpression )
            // InternalOwl.g:4983:5: lv_superDataPropertyExpression_4_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getSubDataPropertyOfAccess().getSuperDataPropertyExpressionDataPropertyExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:5008:1: entryRuleEquivalentDataProperties returns [EObject current=null] : iv_ruleEquivalentDataProperties= ruleEquivalentDataProperties EOF ;
    public final EObject entryRuleEquivalentDataProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquivalentDataProperties = null;


        try {
            // InternalOwl.g:5008:65: (iv_ruleEquivalentDataProperties= ruleEquivalentDataProperties EOF )
            // InternalOwl.g:5009:2: iv_ruleEquivalentDataProperties= ruleEquivalentDataProperties EOF
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
    // InternalOwl.g:5015:1: ruleEquivalentDataProperties returns [EObject current=null] : (otherlv_0= 'EquivalentDataProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+ otherlv_5= ')' ) ;
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
            // InternalOwl.g:5021:2: ( (otherlv_0= 'EquivalentDataProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+ otherlv_5= ')' ) )
            // InternalOwl.g:5022:2: (otherlv_0= 'EquivalentDataProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+ otherlv_5= ')' )
            {
            // InternalOwl.g:5022:2: (otherlv_0= 'EquivalentDataProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+ otherlv_5= ')' )
            // InternalOwl.g:5023:3: otherlv_0= 'EquivalentDataProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEquivalentDataPropertiesAccess().getEquivalentDataPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getEquivalentDataPropertiesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:5031:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==89) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalOwl.g:5032:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:5032:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:5033:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getEquivalentDataPropertiesAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop59;
                }
            } while (true);

            // InternalOwl.g:5050:3: ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:5051:4: (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:5051:4: (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression )
            // InternalOwl.g:5052:5: lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getEquivalentDataPropertiesAccess().getDataPropertyExpressionsDataPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalOwl.g:5069:3: ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=RULE_FULL_IRI && LA60_0<=RULE_PN_LOCAL)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalOwl.g:5070:4: (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression )
            	    {
            	    // InternalOwl.g:5070:4: (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression )
            	    // InternalOwl.g:5071:5: lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression
            	    {

            	    					newCompositeNode(grammarAccess.getEquivalentDataPropertiesAccess().getDataPropertyExpressionsDataPropertyExpressionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_21);
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
            	    if ( cnt60 >= 1 ) break loop60;
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
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
    // InternalOwl.g:5096:1: entryRuleDisjointDataProperties returns [EObject current=null] : iv_ruleDisjointDataProperties= ruleDisjointDataProperties EOF ;
    public final EObject entryRuleDisjointDataProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjointDataProperties = null;


        try {
            // InternalOwl.g:5096:63: (iv_ruleDisjointDataProperties= ruleDisjointDataProperties EOF )
            // InternalOwl.g:5097:2: iv_ruleDisjointDataProperties= ruleDisjointDataProperties EOF
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
    // InternalOwl.g:5103:1: ruleDisjointDataProperties returns [EObject current=null] : (otherlv_0= 'DisjointDataProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+ otherlv_5= ')' ) ;
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
            // InternalOwl.g:5109:2: ( (otherlv_0= 'DisjointDataProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+ otherlv_5= ')' ) )
            // InternalOwl.g:5110:2: (otherlv_0= 'DisjointDataProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+ otherlv_5= ')' )
            {
            // InternalOwl.g:5110:2: (otherlv_0= 'DisjointDataProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+ otherlv_5= ')' )
            // InternalOwl.g:5111:3: otherlv_0= 'DisjointDataProperties' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDisjointDataPropertiesAccess().getDisjointDataPropertiesKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getDisjointDataPropertiesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:5119:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==89) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalOwl.g:5120:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:5120:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:5121:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getDisjointDataPropertiesAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop61;
                }
            } while (true);

            // InternalOwl.g:5138:3: ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:5139:4: (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:5139:4: (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression )
            // InternalOwl.g:5140:5: lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getDisjointDataPropertiesAccess().getDataPropertyExpressionsDataPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalOwl.g:5157:3: ( (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression ) )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=RULE_FULL_IRI && LA62_0<=RULE_PN_LOCAL)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalOwl.g:5158:4: (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression )
            	    {
            	    // InternalOwl.g:5158:4: (lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression )
            	    // InternalOwl.g:5159:5: lv_dataPropertyExpressions_4_0= ruleDataPropertyExpression
            	    {

            	    					newCompositeNode(grammarAccess.getDisjointDataPropertiesAccess().getDataPropertyExpressionsDataPropertyExpressionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_21);
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
            	    if ( cnt62 >= 1 ) break loop62;
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
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
    // InternalOwl.g:5184:1: entryRuleDataPropertyDomain returns [EObject current=null] : iv_ruleDataPropertyDomain= ruleDataPropertyDomain EOF ;
    public final EObject entryRuleDataPropertyDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPropertyDomain = null;


        try {
            // InternalOwl.g:5184:59: (iv_ruleDataPropertyDomain= ruleDataPropertyDomain EOF )
            // InternalOwl.g:5185:2: iv_ruleDataPropertyDomain= ruleDataPropertyDomain EOF
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
    // InternalOwl.g:5191:1: ruleDataPropertyDomain returns [EObject current=null] : (otherlv_0= 'DataPropertyDomain' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' ) ;
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
            // InternalOwl.g:5197:2: ( (otherlv_0= 'DataPropertyDomain' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' ) )
            // InternalOwl.g:5198:2: (otherlv_0= 'DataPropertyDomain' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:5198:2: (otherlv_0= 'DataPropertyDomain' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' )
            // InternalOwl.g:5199:3: otherlv_0= 'DataPropertyDomain' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataPropertyDomainAccess().getDataPropertyDomainKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getDataPropertyDomainAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:5207:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==89) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalOwl.g:5208:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:5208:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:5209:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getDataPropertyDomainAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop63;
                }
            } while (true);

            // InternalOwl.g:5226:3: ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:5227:4: (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:5227:4: (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression )
            // InternalOwl.g:5228:5: lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getDataPropertyDomainAccess().getDataPropertyExpressionsDataPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalOwl.g:5245:3: ( (lv_classExpression_4_0= ruleClassExpression ) )
            // InternalOwl.g:5246:4: (lv_classExpression_4_0= ruleClassExpression )
            {
            // InternalOwl.g:5246:4: (lv_classExpression_4_0= ruleClassExpression )
            // InternalOwl.g:5247:5: lv_classExpression_4_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getDataPropertyDomainAccess().getClassExpressionClassExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:5272:1: entryRuleDataPropertyRange returns [EObject current=null] : iv_ruleDataPropertyRange= ruleDataPropertyRange EOF ;
    public final EObject entryRuleDataPropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPropertyRange = null;


        try {
            // InternalOwl.g:5272:58: (iv_ruleDataPropertyRange= ruleDataPropertyRange EOF )
            // InternalOwl.g:5273:2: iv_ruleDataPropertyRange= ruleDataPropertyRange EOF
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
    // InternalOwl.g:5279:1: ruleDataPropertyRange returns [EObject current=null] : (otherlv_0= 'DataPropertyRange' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' ) ;
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
            // InternalOwl.g:5285:2: ( (otherlv_0= 'DataPropertyRange' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' ) )
            // InternalOwl.g:5286:2: (otherlv_0= 'DataPropertyRange' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:5286:2: (otherlv_0= 'DataPropertyRange' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')' )
            // InternalOwl.g:5287:3: otherlv_0= 'DataPropertyRange' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) ( (lv_classExpression_4_0= ruleClassExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataPropertyRangeAccess().getDataPropertyRangeKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getDataPropertyRangeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:5295:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==89) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalOwl.g:5296:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:5296:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:5297:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getDataPropertyRangeAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop64;
                }
            } while (true);

            // InternalOwl.g:5314:3: ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:5315:4: (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:5315:4: (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression )
            // InternalOwl.g:5316:5: lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getDataPropertyRangeAccess().getDataPropertyExpressionsDataPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalOwl.g:5333:3: ( (lv_classExpression_4_0= ruleClassExpression ) )
            // InternalOwl.g:5334:4: (lv_classExpression_4_0= ruleClassExpression )
            {
            // InternalOwl.g:5334:4: (lv_classExpression_4_0= ruleClassExpression )
            // InternalOwl.g:5335:5: lv_classExpression_4_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getDataPropertyRangeAccess().getClassExpressionClassExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:5360:1: entryRuleFunctionalDataProperty returns [EObject current=null] : iv_ruleFunctionalDataProperty= ruleFunctionalDataProperty EOF ;
    public final EObject entryRuleFunctionalDataProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalDataProperty = null;


        try {
            // InternalOwl.g:5360:63: (iv_ruleFunctionalDataProperty= ruleFunctionalDataProperty EOF )
            // InternalOwl.g:5361:2: iv_ruleFunctionalDataProperty= ruleFunctionalDataProperty EOF
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
    // InternalOwl.g:5367:1: ruleFunctionalDataProperty returns [EObject current=null] : (otherlv_0= 'FunctionalDataProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleFunctionalDataProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_axiomAnnotations_2_0 = null;

        EObject lv_dataPropertyExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalOwl.g:5373:2: ( (otherlv_0= 'FunctionalDataProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) otherlv_4= ')' ) )
            // InternalOwl.g:5374:2: (otherlv_0= 'FunctionalDataProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) otherlv_4= ')' )
            {
            // InternalOwl.g:5374:2: (otherlv_0= 'FunctionalDataProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) otherlv_4= ')' )
            // InternalOwl.g:5375:3: otherlv_0= 'FunctionalDataProperty' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionalDataPropertyAccess().getFunctionalDataPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionalDataPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:5383:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==89) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalOwl.g:5384:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:5384:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:5385:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionalDataPropertyAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop65;
                }
            } while (true);

            // InternalOwl.g:5402:3: ( (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression ) )
            // InternalOwl.g:5403:4: (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression )
            {
            // InternalOwl.g:5403:4: (lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression )
            // InternalOwl.g:5404:5: lv_dataPropertyExpressions_3_0= ruleDataPropertyExpression
            {

            					newCompositeNode(grammarAccess.getFunctionalDataPropertyAccess().getDataPropertyExpressionsDataPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:5429:1: entryRuleDatatypeDefinition returns [EObject current=null] : iv_ruleDatatypeDefinition= ruleDatatypeDefinition EOF ;
    public final EObject entryRuleDatatypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypeDefinition = null;


        try {
            // InternalOwl.g:5429:59: (iv_ruleDatatypeDefinition= ruleDatatypeDefinition EOF )
            // InternalOwl.g:5430:2: iv_ruleDatatypeDefinition= ruleDatatypeDefinition EOF
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
    // InternalOwl.g:5436:1: ruleDatatypeDefinition returns [EObject current=null] : (otherlv_0= 'DatatypeDefinition' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_datatype_3_0= ruleDatatypeReference ) ) ( (lv_dataRange_4_0= ruleDataRange ) ) otherlv_5= ')' ) ;
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
            // InternalOwl.g:5442:2: ( (otherlv_0= 'DatatypeDefinition' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_datatype_3_0= ruleDatatypeReference ) ) ( (lv_dataRange_4_0= ruleDataRange ) ) otherlv_5= ')' ) )
            // InternalOwl.g:5443:2: (otherlv_0= 'DatatypeDefinition' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_datatype_3_0= ruleDatatypeReference ) ) ( (lv_dataRange_4_0= ruleDataRange ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:5443:2: (otherlv_0= 'DatatypeDefinition' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_datatype_3_0= ruleDatatypeReference ) ) ( (lv_dataRange_4_0= ruleDataRange ) ) otherlv_5= ')' )
            // InternalOwl.g:5444:3: otherlv_0= 'DatatypeDefinition' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_datatype_3_0= ruleDatatypeReference ) ) ( (lv_dataRange_4_0= ruleDataRange ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDatatypeDefinitionAccess().getDatatypeDefinitionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getDatatypeDefinitionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:5452:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==89) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalOwl.g:5453:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:5453:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:5454:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getDatatypeDefinitionAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop66;
                }
            } while (true);

            // InternalOwl.g:5471:3: ( (lv_datatype_3_0= ruleDatatypeReference ) )
            // InternalOwl.g:5472:4: (lv_datatype_3_0= ruleDatatypeReference )
            {
            // InternalOwl.g:5472:4: (lv_datatype_3_0= ruleDatatypeReference )
            // InternalOwl.g:5473:5: lv_datatype_3_0= ruleDatatypeReference
            {

            					newCompositeNode(grammarAccess.getDatatypeDefinitionAccess().getDatatypeDatatypeReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalOwl.g:5490:3: ( (lv_dataRange_4_0= ruleDataRange ) )
            // InternalOwl.g:5491:4: (lv_dataRange_4_0= ruleDataRange )
            {
            // InternalOwl.g:5491:4: (lv_dataRange_4_0= ruleDataRange )
            // InternalOwl.g:5492:5: lv_dataRange_4_0= ruleDataRange
            {

            					newCompositeNode(grammarAccess.getDatatypeDefinitionAccess().getDataRangeDataRangeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:5517:1: entryRuleHasKey returns [EObject current=null] : iv_ruleHasKey= ruleHasKey EOF ;
    public final EObject entryRuleHasKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasKey = null;


        try {
            // InternalOwl.g:5517:47: (iv_ruleHasKey= ruleHasKey EOF )
            // InternalOwl.g:5518:2: iv_ruleHasKey= ruleHasKey EOF
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
    // InternalOwl.g:5524:1: ruleHasKey returns [EObject current=null] : (otherlv_0= 'HasKey' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= '(' ( (lv_objectPropertyExpressions_5_0= ruleObjectPropertyExpression ) )* otherlv_6= ')' otherlv_7= '(' ( (lv_dataPropertyExpressions_8_0= ruleDataPropertyExpression ) )* otherlv_9= ')' otherlv_10= ')' ) ;
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
            // InternalOwl.g:5530:2: ( (otherlv_0= 'HasKey' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= '(' ( (lv_objectPropertyExpressions_5_0= ruleObjectPropertyExpression ) )* otherlv_6= ')' otherlv_7= '(' ( (lv_dataPropertyExpressions_8_0= ruleDataPropertyExpression ) )* otherlv_9= ')' otherlv_10= ')' ) )
            // InternalOwl.g:5531:2: (otherlv_0= 'HasKey' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= '(' ( (lv_objectPropertyExpressions_5_0= ruleObjectPropertyExpression ) )* otherlv_6= ')' otherlv_7= '(' ( (lv_dataPropertyExpressions_8_0= ruleDataPropertyExpression ) )* otherlv_9= ')' otherlv_10= ')' )
            {
            // InternalOwl.g:5531:2: (otherlv_0= 'HasKey' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= '(' ( (lv_objectPropertyExpressions_5_0= ruleObjectPropertyExpression ) )* otherlv_6= ')' otherlv_7= '(' ( (lv_dataPropertyExpressions_8_0= ruleDataPropertyExpression ) )* otherlv_9= ')' otherlv_10= ')' )
            // InternalOwl.g:5532:3: otherlv_0= 'HasKey' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpression_3_0= ruleClassExpression ) ) otherlv_4= '(' ( (lv_objectPropertyExpressions_5_0= ruleObjectPropertyExpression ) )* otherlv_6= ')' otherlv_7= '(' ( (lv_dataPropertyExpressions_8_0= ruleDataPropertyExpression ) )* otherlv_9= ')' otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getHasKeyAccess().getHasKeyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getHasKeyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:5540:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==89) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalOwl.g:5541:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:5541:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:5542:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getHasKeyAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    break loop67;
                }
            } while (true);

            // InternalOwl.g:5559:3: ( (lv_classExpression_3_0= ruleClassExpression ) )
            // InternalOwl.g:5560:4: (lv_classExpression_3_0= ruleClassExpression )
            {
            // InternalOwl.g:5560:4: (lv_classExpression_3_0= ruleClassExpression )
            // InternalOwl.g:5561:5: lv_classExpression_3_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getHasKeyAccess().getClassExpressionClassExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_4=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getHasKeyAccess().getLeftParenthesisKeyword_4());
            		
            // InternalOwl.g:5582:3: ( (lv_objectPropertyExpressions_5_0= ruleObjectPropertyExpression ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( ((LA68_0>=RULE_FULL_IRI && LA68_0<=RULE_PN_LOCAL)||LA68_0==33) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalOwl.g:5583:4: (lv_objectPropertyExpressions_5_0= ruleObjectPropertyExpression )
            	    {
            	    // InternalOwl.g:5583:4: (lv_objectPropertyExpressions_5_0= ruleObjectPropertyExpression )
            	    // InternalOwl.g:5584:5: lv_objectPropertyExpressions_5_0= ruleObjectPropertyExpression
            	    {

            	    					newCompositeNode(grammarAccess.getHasKeyAccess().getObjectPropertyExpressionsObjectPropertyExpressionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_32);
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
            	    break loop68;
                }
            } while (true);

            otherlv_6=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getHasKeyAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getHasKeyAccess().getLeftParenthesisKeyword_7());
            		
            // InternalOwl.g:5609:3: ( (lv_dataPropertyExpressions_8_0= ruleDataPropertyExpression ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( ((LA69_0>=RULE_FULL_IRI && LA69_0<=RULE_PN_LOCAL)) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalOwl.g:5610:4: (lv_dataPropertyExpressions_8_0= ruleDataPropertyExpression )
            	    {
            	    // InternalOwl.g:5610:4: (lv_dataPropertyExpressions_8_0= ruleDataPropertyExpression )
            	    // InternalOwl.g:5611:5: lv_dataPropertyExpressions_8_0= ruleDataPropertyExpression
            	    {

            	    					newCompositeNode(grammarAccess.getHasKeyAccess().getDataPropertyExpressionsDataPropertyExpressionParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_21);
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
            	    break loop69;
                }
            } while (true);

            otherlv_9=(Token)match(input,22,FOLLOW_9); 

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
    // InternalOwl.g:5640:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalOwl.g:5640:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalOwl.g:5641:2: iv_ruleAssertion= ruleAssertion EOF
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
    // InternalOwl.g:5647:1: ruleAssertion returns [EObject current=null] : (this_SameIndividual_0= ruleSameIndividual | this_DifferentIndividuals_1= ruleDifferentIndividuals | this_ClassAssertion_2= ruleClassAssertion | this_ObjectPropertyAssertion_3= ruleObjectPropertyAssertion | this_NegativeObjectPropertyAssertion_4= ruleNegativeObjectPropertyAssertion | this_DataPropertyAssertion_5= ruleDataPropertyAssertion | this_NegativeDataPropertyAssertion_6= ruleNegativeDataPropertyAssertion ) ;
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
            // InternalOwl.g:5653:2: ( (this_SameIndividual_0= ruleSameIndividual | this_DifferentIndividuals_1= ruleDifferentIndividuals | this_ClassAssertion_2= ruleClassAssertion | this_ObjectPropertyAssertion_3= ruleObjectPropertyAssertion | this_NegativeObjectPropertyAssertion_4= ruleNegativeObjectPropertyAssertion | this_DataPropertyAssertion_5= ruleDataPropertyAssertion | this_NegativeDataPropertyAssertion_6= ruleNegativeDataPropertyAssertion ) )
            // InternalOwl.g:5654:2: (this_SameIndividual_0= ruleSameIndividual | this_DifferentIndividuals_1= ruleDifferentIndividuals | this_ClassAssertion_2= ruleClassAssertion | this_ObjectPropertyAssertion_3= ruleObjectPropertyAssertion | this_NegativeObjectPropertyAssertion_4= ruleNegativeObjectPropertyAssertion | this_DataPropertyAssertion_5= ruleDataPropertyAssertion | this_NegativeDataPropertyAssertion_6= ruleNegativeDataPropertyAssertion )
            {
            // InternalOwl.g:5654:2: (this_SameIndividual_0= ruleSameIndividual | this_DifferentIndividuals_1= ruleDifferentIndividuals | this_ClassAssertion_2= ruleClassAssertion | this_ObjectPropertyAssertion_3= ruleObjectPropertyAssertion | this_NegativeObjectPropertyAssertion_4= ruleNegativeObjectPropertyAssertion | this_DataPropertyAssertion_5= ruleDataPropertyAssertion | this_NegativeDataPropertyAssertion_6= ruleNegativeDataPropertyAssertion )
            int alt70=7;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt70=1;
                }
                break;
            case 83:
                {
                alt70=2;
                }
                break;
            case 84:
                {
                alt70=3;
                }
                break;
            case 85:
                {
                alt70=4;
                }
                break;
            case 86:
                {
                alt70=5;
                }
                break;
            case 87:
                {
                alt70=6;
                }
                break;
            case 88:
                {
                alt70=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalOwl.g:5655:3: this_SameIndividual_0= ruleSameIndividual
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
                    // InternalOwl.g:5664:3: this_DifferentIndividuals_1= ruleDifferentIndividuals
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
                    // InternalOwl.g:5673:3: this_ClassAssertion_2= ruleClassAssertion
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
                    // InternalOwl.g:5682:3: this_ObjectPropertyAssertion_3= ruleObjectPropertyAssertion
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
                    // InternalOwl.g:5691:3: this_NegativeObjectPropertyAssertion_4= ruleNegativeObjectPropertyAssertion
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
                    // InternalOwl.g:5700:3: this_DataPropertyAssertion_5= ruleDataPropertyAssertion
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
                    // InternalOwl.g:5709:3: this_NegativeDataPropertyAssertion_6= ruleNegativeDataPropertyAssertion
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
    // InternalOwl.g:5721:1: entryRuleSameIndividual returns [EObject current=null] : iv_ruleSameIndividual= ruleSameIndividual EOF ;
    public final EObject entryRuleSameIndividual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSameIndividual = null;


        try {
            // InternalOwl.g:5721:55: (iv_ruleSameIndividual= ruleSameIndividual EOF )
            // InternalOwl.g:5722:2: iv_ruleSameIndividual= ruleSameIndividual EOF
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
    // InternalOwl.g:5728:1: ruleSameIndividual returns [EObject current=null] : (otherlv_0= 'SameIndividual' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_individuals_3_0= ruleIndividualReference ) ) ( (lv_individuals_4_0= ruleIndividualReference ) )+ otherlv_5= ')' ) ;
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
            // InternalOwl.g:5734:2: ( (otherlv_0= 'SameIndividual' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_individuals_3_0= ruleIndividualReference ) ) ( (lv_individuals_4_0= ruleIndividualReference ) )+ otherlv_5= ')' ) )
            // InternalOwl.g:5735:2: (otherlv_0= 'SameIndividual' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_individuals_3_0= ruleIndividualReference ) ) ( (lv_individuals_4_0= ruleIndividualReference ) )+ otherlv_5= ')' )
            {
            // InternalOwl.g:5735:2: (otherlv_0= 'SameIndividual' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_individuals_3_0= ruleIndividualReference ) ) ( (lv_individuals_4_0= ruleIndividualReference ) )+ otherlv_5= ')' )
            // InternalOwl.g:5736:3: otherlv_0= 'SameIndividual' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_individuals_3_0= ruleIndividualReference ) ) ( (lv_individuals_4_0= ruleIndividualReference ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSameIndividualAccess().getSameIndividualKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getSameIndividualAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:5744:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==89) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalOwl.g:5745:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:5745:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:5746:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getSameIndividualAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_34);
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
            	    break loop71;
                }
            } while (true);

            // InternalOwl.g:5763:3: ( (lv_individuals_3_0= ruleIndividualReference ) )
            // InternalOwl.g:5764:4: (lv_individuals_3_0= ruleIndividualReference )
            {
            // InternalOwl.g:5764:4: (lv_individuals_3_0= ruleIndividualReference )
            // InternalOwl.g:5765:5: lv_individuals_3_0= ruleIndividualReference
            {

            					newCompositeNode(grammarAccess.getSameIndividualAccess().getIndividualsIndividualReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalOwl.g:5782:3: ( (lv_individuals_4_0= ruleIndividualReference ) )+
            int cnt72=0;
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=RULE_FULL_IRI && LA72_0<=RULE_BLANK_NODE_LABEL)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalOwl.g:5783:4: (lv_individuals_4_0= ruleIndividualReference )
            	    {
            	    // InternalOwl.g:5783:4: (lv_individuals_4_0= ruleIndividualReference )
            	    // InternalOwl.g:5784:5: lv_individuals_4_0= ruleIndividualReference
            	    {

            	    					newCompositeNode(grammarAccess.getSameIndividualAccess().getIndividualsIndividualReferenceParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_25);
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
            	    if ( cnt72 >= 1 ) break loop72;
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
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
    // InternalOwl.g:5809:1: entryRuleDifferentIndividuals returns [EObject current=null] : iv_ruleDifferentIndividuals= ruleDifferentIndividuals EOF ;
    public final EObject entryRuleDifferentIndividuals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDifferentIndividuals = null;


        try {
            // InternalOwl.g:5809:61: (iv_ruleDifferentIndividuals= ruleDifferentIndividuals EOF )
            // InternalOwl.g:5810:2: iv_ruleDifferentIndividuals= ruleDifferentIndividuals EOF
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
    // InternalOwl.g:5816:1: ruleDifferentIndividuals returns [EObject current=null] : (otherlv_0= 'DifferentIndividuals' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_individuals_3_0= ruleIndividualReference ) ) ( (lv_individuals_4_0= ruleIndividualReference ) )+ otherlv_5= ')' ) ;
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
            // InternalOwl.g:5822:2: ( (otherlv_0= 'DifferentIndividuals' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_individuals_3_0= ruleIndividualReference ) ) ( (lv_individuals_4_0= ruleIndividualReference ) )+ otherlv_5= ')' ) )
            // InternalOwl.g:5823:2: (otherlv_0= 'DifferentIndividuals' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_individuals_3_0= ruleIndividualReference ) ) ( (lv_individuals_4_0= ruleIndividualReference ) )+ otherlv_5= ')' )
            {
            // InternalOwl.g:5823:2: (otherlv_0= 'DifferentIndividuals' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_individuals_3_0= ruleIndividualReference ) ) ( (lv_individuals_4_0= ruleIndividualReference ) )+ otherlv_5= ')' )
            // InternalOwl.g:5824:3: otherlv_0= 'DifferentIndividuals' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_individuals_3_0= ruleIndividualReference ) ) ( (lv_individuals_4_0= ruleIndividualReference ) )+ otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDifferentIndividualsAccess().getDifferentIndividualsKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getDifferentIndividualsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:5832:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==89) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalOwl.g:5833:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:5833:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:5834:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getDifferentIndividualsAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_34);
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
            	    break loop73;
                }
            } while (true);

            // InternalOwl.g:5851:3: ( (lv_individuals_3_0= ruleIndividualReference ) )
            // InternalOwl.g:5852:4: (lv_individuals_3_0= ruleIndividualReference )
            {
            // InternalOwl.g:5852:4: (lv_individuals_3_0= ruleIndividualReference )
            // InternalOwl.g:5853:5: lv_individuals_3_0= ruleIndividualReference
            {

            					newCompositeNode(grammarAccess.getDifferentIndividualsAccess().getIndividualsIndividualReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalOwl.g:5870:3: ( (lv_individuals_4_0= ruleIndividualReference ) )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=RULE_FULL_IRI && LA74_0<=RULE_BLANK_NODE_LABEL)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalOwl.g:5871:4: (lv_individuals_4_0= ruleIndividualReference )
            	    {
            	    // InternalOwl.g:5871:4: (lv_individuals_4_0= ruleIndividualReference )
            	    // InternalOwl.g:5872:5: lv_individuals_4_0= ruleIndividualReference
            	    {

            	    					newCompositeNode(grammarAccess.getDifferentIndividualsAccess().getIndividualsIndividualReferenceParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_25);
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
            	    if ( cnt74 >= 1 ) break loop74;
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
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
    // InternalOwl.g:5897:1: entryRuleClassAssertion returns [EObject current=null] : iv_ruleClassAssertion= ruleClassAssertion EOF ;
    public final EObject entryRuleClassAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassAssertion = null;


        try {
            // InternalOwl.g:5897:55: (iv_ruleClassAssertion= ruleClassAssertion EOF )
            // InternalOwl.g:5898:2: iv_ruleClassAssertion= ruleClassAssertion EOF
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
    // InternalOwl.g:5904:1: ruleClassAssertion returns [EObject current=null] : (otherlv_0= 'ClassAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpression_3_0= ruleClassExpression ) ) ( (lv_individual_4_0= ruleIndividualReference ) ) otherlv_5= ')' ) ;
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
            // InternalOwl.g:5910:2: ( (otherlv_0= 'ClassAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpression_3_0= ruleClassExpression ) ) ( (lv_individual_4_0= ruleIndividualReference ) ) otherlv_5= ')' ) )
            // InternalOwl.g:5911:2: (otherlv_0= 'ClassAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpression_3_0= ruleClassExpression ) ) ( (lv_individual_4_0= ruleIndividualReference ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:5911:2: (otherlv_0= 'ClassAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpression_3_0= ruleClassExpression ) ) ( (lv_individual_4_0= ruleIndividualReference ) ) otherlv_5= ')' )
            // InternalOwl.g:5912:3: otherlv_0= 'ClassAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_classExpression_3_0= ruleClassExpression ) ) ( (lv_individual_4_0= ruleIndividualReference ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAssertionAccess().getClassAssertionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAssertionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:5920:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==89) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalOwl.g:5921:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:5921:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:5922:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getClassAssertionAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    break loop75;
                }
            } while (true);

            // InternalOwl.g:5939:3: ( (lv_classExpression_3_0= ruleClassExpression ) )
            // InternalOwl.g:5940:4: (lv_classExpression_3_0= ruleClassExpression )
            {
            // InternalOwl.g:5940:4: (lv_classExpression_3_0= ruleClassExpression )
            // InternalOwl.g:5941:5: lv_classExpression_3_0= ruleClassExpression
            {

            					newCompositeNode(grammarAccess.getClassAssertionAccess().getClassExpressionClassExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalOwl.g:5958:3: ( (lv_individual_4_0= ruleIndividualReference ) )
            // InternalOwl.g:5959:4: (lv_individual_4_0= ruleIndividualReference )
            {
            // InternalOwl.g:5959:4: (lv_individual_4_0= ruleIndividualReference )
            // InternalOwl.g:5960:5: lv_individual_4_0= ruleIndividualReference
            {

            					newCompositeNode(grammarAccess.getClassAssertionAccess().getIndividualIndividualReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:5985:1: entryRuleObjectPropertyAssertion returns [EObject current=null] : iv_ruleObjectPropertyAssertion= ruleObjectPropertyAssertion EOF ;
    public final EObject entryRuleObjectPropertyAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectPropertyAssertion = null;


        try {
            // InternalOwl.g:5985:64: (iv_ruleObjectPropertyAssertion= ruleObjectPropertyAssertion EOF )
            // InternalOwl.g:5986:2: iv_ruleObjectPropertyAssertion= ruleObjectPropertyAssertion EOF
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
    // InternalOwl.g:5992:1: ruleObjectPropertyAssertion returns [EObject current=null] : (otherlv_0= 'ObjectPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetIndividual_5_0= ruleIndividualReference ) ) otherlv_6= ')' ) ;
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
            // InternalOwl.g:5998:2: ( (otherlv_0= 'ObjectPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetIndividual_5_0= ruleIndividualReference ) ) otherlv_6= ')' ) )
            // InternalOwl.g:5999:2: (otherlv_0= 'ObjectPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetIndividual_5_0= ruleIndividualReference ) ) otherlv_6= ')' )
            {
            // InternalOwl.g:5999:2: (otherlv_0= 'ObjectPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetIndividual_5_0= ruleIndividualReference ) ) otherlv_6= ')' )
            // InternalOwl.g:6000:3: otherlv_0= 'ObjectPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetIndividual_5_0= ruleIndividualReference ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectPropertyAssertionAccess().getObjectPropertyAssertionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectPropertyAssertionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:6008:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==89) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalOwl.g:6009:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:6009:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:6010:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getObjectPropertyAssertionAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop76;
                }
            } while (true);

            // InternalOwl.g:6027:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:6028:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:6028:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:6029:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getObjectPropertyAssertionAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalOwl.g:6046:3: ( (lv_sourceIndividual_4_0= ruleIndividualReference ) )
            // InternalOwl.g:6047:4: (lv_sourceIndividual_4_0= ruleIndividualReference )
            {
            // InternalOwl.g:6047:4: (lv_sourceIndividual_4_0= ruleIndividualReference )
            // InternalOwl.g:6048:5: lv_sourceIndividual_4_0= ruleIndividualReference
            {

            					newCompositeNode(grammarAccess.getObjectPropertyAssertionAccess().getSourceIndividualIndividualReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalOwl.g:6065:3: ( (lv_targetIndividual_5_0= ruleIndividualReference ) )
            // InternalOwl.g:6066:4: (lv_targetIndividual_5_0= ruleIndividualReference )
            {
            // InternalOwl.g:6066:4: (lv_targetIndividual_5_0= ruleIndividualReference )
            // InternalOwl.g:6067:5: lv_targetIndividual_5_0= ruleIndividualReference
            {

            					newCompositeNode(grammarAccess.getObjectPropertyAssertionAccess().getTargetIndividualIndividualReferenceParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:6092:1: entryRuleNegativeObjectPropertyAssertion returns [EObject current=null] : iv_ruleNegativeObjectPropertyAssertion= ruleNegativeObjectPropertyAssertion EOF ;
    public final EObject entryRuleNegativeObjectPropertyAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegativeObjectPropertyAssertion = null;


        try {
            // InternalOwl.g:6092:72: (iv_ruleNegativeObjectPropertyAssertion= ruleNegativeObjectPropertyAssertion EOF )
            // InternalOwl.g:6093:2: iv_ruleNegativeObjectPropertyAssertion= ruleNegativeObjectPropertyAssertion EOF
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
    // InternalOwl.g:6099:1: ruleNegativeObjectPropertyAssertion returns [EObject current=null] : (otherlv_0= 'NegativeObjectPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetIndividual_5_0= ruleIndividualReference ) ) otherlv_6= ')' ) ;
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
            // InternalOwl.g:6105:2: ( (otherlv_0= 'NegativeObjectPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetIndividual_5_0= ruleIndividualReference ) ) otherlv_6= ')' ) )
            // InternalOwl.g:6106:2: (otherlv_0= 'NegativeObjectPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetIndividual_5_0= ruleIndividualReference ) ) otherlv_6= ')' )
            {
            // InternalOwl.g:6106:2: (otherlv_0= 'NegativeObjectPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetIndividual_5_0= ruleIndividualReference ) ) otherlv_6= ')' )
            // InternalOwl.g:6107:3: otherlv_0= 'NegativeObjectPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetIndividual_5_0= ruleIndividualReference ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNegativeObjectPropertyAssertionAccess().getNegativeObjectPropertyAssertionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getNegativeObjectPropertyAssertionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:6115:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==89) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalOwl.g:6116:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:6116:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:6117:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getNegativeObjectPropertyAssertionAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop77;
                }
            } while (true);

            // InternalOwl.g:6134:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:6135:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:6135:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:6136:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getNegativeObjectPropertyAssertionAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalOwl.g:6153:3: ( (lv_sourceIndividual_4_0= ruleIndividualReference ) )
            // InternalOwl.g:6154:4: (lv_sourceIndividual_4_0= ruleIndividualReference )
            {
            // InternalOwl.g:6154:4: (lv_sourceIndividual_4_0= ruleIndividualReference )
            // InternalOwl.g:6155:5: lv_sourceIndividual_4_0= ruleIndividualReference
            {

            					newCompositeNode(grammarAccess.getNegativeObjectPropertyAssertionAccess().getSourceIndividualIndividualReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalOwl.g:6172:3: ( (lv_targetIndividual_5_0= ruleIndividualReference ) )
            // InternalOwl.g:6173:4: (lv_targetIndividual_5_0= ruleIndividualReference )
            {
            // InternalOwl.g:6173:4: (lv_targetIndividual_5_0= ruleIndividualReference )
            // InternalOwl.g:6174:5: lv_targetIndividual_5_0= ruleIndividualReference
            {

            					newCompositeNode(grammarAccess.getNegativeObjectPropertyAssertionAccess().getTargetIndividualIndividualReferenceParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:6199:1: entryRuleDataPropertyAssertion returns [EObject current=null] : iv_ruleDataPropertyAssertion= ruleDataPropertyAssertion EOF ;
    public final EObject entryRuleDataPropertyAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPropertyAssertion = null;


        try {
            // InternalOwl.g:6199:62: (iv_ruleDataPropertyAssertion= ruleDataPropertyAssertion EOF )
            // InternalOwl.g:6200:2: iv_ruleDataPropertyAssertion= ruleDataPropertyAssertion EOF
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
    // InternalOwl.g:6206:1: ruleDataPropertyAssertion returns [EObject current=null] : (otherlv_0= 'DataPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetValue_5_0= ruleLiteral ) ) otherlv_6= ')' ) ;
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
            // InternalOwl.g:6212:2: ( (otherlv_0= 'DataPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetValue_5_0= ruleLiteral ) ) otherlv_6= ')' ) )
            // InternalOwl.g:6213:2: (otherlv_0= 'DataPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetValue_5_0= ruleLiteral ) ) otherlv_6= ')' )
            {
            // InternalOwl.g:6213:2: (otherlv_0= 'DataPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetValue_5_0= ruleLiteral ) ) otherlv_6= ')' )
            // InternalOwl.g:6214:3: otherlv_0= 'DataPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetValue_5_0= ruleLiteral ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,87,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataPropertyAssertionAccess().getDataPropertyAssertionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getDataPropertyAssertionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:6222:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==89) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalOwl.g:6223:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:6223:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:6224:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getDataPropertyAssertionAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop78;
                }
            } while (true);

            // InternalOwl.g:6241:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:6242:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:6242:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:6243:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getDataPropertyAssertionAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalOwl.g:6260:3: ( (lv_sourceIndividual_4_0= ruleIndividualReference ) )
            // InternalOwl.g:6261:4: (lv_sourceIndividual_4_0= ruleIndividualReference )
            {
            // InternalOwl.g:6261:4: (lv_sourceIndividual_4_0= ruleIndividualReference )
            // InternalOwl.g:6262:5: lv_sourceIndividual_4_0= ruleIndividualReference
            {

            					newCompositeNode(grammarAccess.getDataPropertyAssertionAccess().getSourceIndividualIndividualReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalOwl.g:6279:3: ( (lv_targetValue_5_0= ruleLiteral ) )
            // InternalOwl.g:6280:4: (lv_targetValue_5_0= ruleLiteral )
            {
            // InternalOwl.g:6280:4: (lv_targetValue_5_0= ruleLiteral )
            // InternalOwl.g:6281:5: lv_targetValue_5_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getDataPropertyAssertionAccess().getTargetValueLiteralParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:6306:1: entryRuleNegativeDataPropertyAssertion returns [EObject current=null] : iv_ruleNegativeDataPropertyAssertion= ruleNegativeDataPropertyAssertion EOF ;
    public final EObject entryRuleNegativeDataPropertyAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegativeDataPropertyAssertion = null;


        try {
            // InternalOwl.g:6306:70: (iv_ruleNegativeDataPropertyAssertion= ruleNegativeDataPropertyAssertion EOF )
            // InternalOwl.g:6307:2: iv_ruleNegativeDataPropertyAssertion= ruleNegativeDataPropertyAssertion EOF
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
    // InternalOwl.g:6313:1: ruleNegativeDataPropertyAssertion returns [EObject current=null] : (otherlv_0= 'NegativeDataPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetValue_5_0= ruleLiteral ) ) otherlv_6= ')' ) ;
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
            // InternalOwl.g:6319:2: ( (otherlv_0= 'NegativeDataPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetValue_5_0= ruleLiteral ) ) otherlv_6= ')' ) )
            // InternalOwl.g:6320:2: (otherlv_0= 'NegativeDataPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetValue_5_0= ruleLiteral ) ) otherlv_6= ')' )
            {
            // InternalOwl.g:6320:2: (otherlv_0= 'NegativeDataPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetValue_5_0= ruleLiteral ) ) otherlv_6= ')' )
            // InternalOwl.g:6321:3: otherlv_0= 'NegativeDataPropertyAssertion' otherlv_1= '(' ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )* ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) ) ( (lv_sourceIndividual_4_0= ruleIndividualReference ) ) ( (lv_targetValue_5_0= ruleLiteral ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNegativeDataPropertyAssertionAccess().getNegativeDataPropertyAssertionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getNegativeDataPropertyAssertionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:6329:3: ( (lv_axiomAnnotations_2_0= ruleAnnotation ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==89) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalOwl.g:6330:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:6330:4: (lv_axiomAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:6331:5: lv_axiomAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getNegativeDataPropertyAssertionAccess().getAxiomAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    break loop79;
                }
            } while (true);

            // InternalOwl.g:6348:3: ( (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression ) )
            // InternalOwl.g:6349:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            {
            // InternalOwl.g:6349:4: (lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression )
            // InternalOwl.g:6350:5: lv_objectPropertyExpression_3_0= ruleObjectPropertyExpression
            {

            					newCompositeNode(grammarAccess.getNegativeDataPropertyAssertionAccess().getObjectPropertyExpressionObjectPropertyExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalOwl.g:6367:3: ( (lv_sourceIndividual_4_0= ruleIndividualReference ) )
            // InternalOwl.g:6368:4: (lv_sourceIndividual_4_0= ruleIndividualReference )
            {
            // InternalOwl.g:6368:4: (lv_sourceIndividual_4_0= ruleIndividualReference )
            // InternalOwl.g:6369:5: lv_sourceIndividual_4_0= ruleIndividualReference
            {

            					newCompositeNode(grammarAccess.getNegativeDataPropertyAssertionAccess().getSourceIndividualIndividualReferenceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalOwl.g:6386:3: ( (lv_targetValue_5_0= ruleLiteral ) )
            // InternalOwl.g:6387:4: (lv_targetValue_5_0= ruleLiteral )
            {
            // InternalOwl.g:6387:4: (lv_targetValue_5_0= ruleLiteral )
            // InternalOwl.g:6388:5: lv_targetValue_5_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getNegativeDataPropertyAssertionAccess().getTargetValueLiteralParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:6413:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalOwl.g:6413:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalOwl.g:6414:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalOwl.g:6420:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= 'Annotation' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_annotationvalue_4_0= ruleAnnotationValue ) ) otherlv_5= ')' ) ;
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
            // InternalOwl.g:6426:2: ( (otherlv_0= 'Annotation' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_annotationvalue_4_0= ruleAnnotationValue ) ) otherlv_5= ')' ) )
            // InternalOwl.g:6427:2: (otherlv_0= 'Annotation' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_annotationvalue_4_0= ruleAnnotationValue ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:6427:2: (otherlv_0= 'Annotation' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_annotationvalue_4_0= ruleAnnotationValue ) ) otherlv_5= ')' )
            // InternalOwl.g:6428:3: otherlv_0= 'Annotation' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_annotationvalue_4_0= ruleAnnotationValue ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,89,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getAnnotationKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:6436:3: ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==89) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalOwl.g:6437:4: (lv_annotationAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:6437:4: (lv_annotationAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:6438:5: lv_annotationAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop80;
                }
            } while (true);

            // InternalOwl.g:6455:3: ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) )
            // InternalOwl.g:6456:4: (lv_annotationProperty_3_0= ruleAnnotationProperty )
            {
            // InternalOwl.g:6456:4: (lv_annotationProperty_3_0= ruleAnnotationProperty )
            // InternalOwl.g:6457:5: lv_annotationProperty_3_0= ruleAnnotationProperty
            {

            					newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationPropertyAnnotationPropertyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
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

            // InternalOwl.g:6474:3: ( (lv_annotationvalue_4_0= ruleAnnotationValue ) )
            // InternalOwl.g:6475:4: (lv_annotationvalue_4_0= ruleAnnotationValue )
            {
            // InternalOwl.g:6475:4: (lv_annotationvalue_4_0= ruleAnnotationValue )
            // InternalOwl.g:6476:5: lv_annotationvalue_4_0= ruleAnnotationValue
            {

            					newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationvalueAnnotationValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:6501:1: entryRuleAnnotationValue returns [EObject current=null] : iv_ruleAnnotationValue= ruleAnnotationValue EOF ;
    public final EObject entryRuleAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationValue = null;


        try {
            // InternalOwl.g:6501:56: (iv_ruleAnnotationValue= ruleAnnotationValue EOF )
            // InternalOwl.g:6502:2: iv_ruleAnnotationValue= ruleAnnotationValue EOF
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
    // InternalOwl.g:6508:1: ruleAnnotationValue returns [EObject current=null] : (this_AnonymousIndividualReference_0= ruleAnonymousIndividualReference | ( () ruleIRI ) | this_Literal_3= ruleLiteral ) ;
    public final EObject ruleAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject this_AnonymousIndividualReference_0 = null;

        EObject this_Literal_3 = null;



        	enterRule();

        try {
            // InternalOwl.g:6514:2: ( (this_AnonymousIndividualReference_0= ruleAnonymousIndividualReference | ( () ruleIRI ) | this_Literal_3= ruleLiteral ) )
            // InternalOwl.g:6515:2: (this_AnonymousIndividualReference_0= ruleAnonymousIndividualReference | ( () ruleIRI ) | this_Literal_3= ruleLiteral )
            {
            // InternalOwl.g:6515:2: (this_AnonymousIndividualReference_0= ruleAnonymousIndividualReference | ( () ruleIRI ) | this_Literal_3= ruleLiteral )
            int alt81=3;
            switch ( input.LA(1) ) {
            case RULE_BLANK_NODE_LABEL:
                {
                alt81=1;
                }
                break;
            case RULE_FULL_IRI:
            case RULE_PN_PREFIX:
            case RULE_PN_LOCAL:
                {
                alt81=2;
                }
                break;
            case RULE_STRING:
                {
                alt81=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalOwl.g:6516:3: this_AnonymousIndividualReference_0= ruleAnonymousIndividualReference
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
                    // InternalOwl.g:6525:3: ( () ruleIRI )
                    {
                    // InternalOwl.g:6525:3: ( () ruleIRI )
                    // InternalOwl.g:6526:4: () ruleIRI
                    {
                    // InternalOwl.g:6526:4: ()
                    // InternalOwl.g:6527:5: 
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
                    // InternalOwl.g:6542:3: this_Literal_3= ruleLiteral
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
    // InternalOwl.g:6554:1: entryRuleAnnotationAxiom returns [EObject current=null] : iv_ruleAnnotationAxiom= ruleAnnotationAxiom EOF ;
    public final EObject entryRuleAnnotationAxiom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationAxiom = null;


        try {
            // InternalOwl.g:6554:56: (iv_ruleAnnotationAxiom= ruleAnnotationAxiom EOF )
            // InternalOwl.g:6555:2: iv_ruleAnnotationAxiom= ruleAnnotationAxiom EOF
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
    // InternalOwl.g:6561:1: ruleAnnotationAxiom returns [EObject current=null] : (this_AnnotationAssertion_0= ruleAnnotationAssertion | this_SubAnnotationPropertyOf_1= ruleSubAnnotationPropertyOf | this_AnnotationPropertyDomain_2= ruleAnnotationPropertyDomain | this_AnnotationPropertyRange_3= ruleAnnotationPropertyRange ) ;
    public final EObject ruleAnnotationAxiom() throws RecognitionException {
        EObject current = null;

        EObject this_AnnotationAssertion_0 = null;

        EObject this_SubAnnotationPropertyOf_1 = null;

        EObject this_AnnotationPropertyDomain_2 = null;

        EObject this_AnnotationPropertyRange_3 = null;



        	enterRule();

        try {
            // InternalOwl.g:6567:2: ( (this_AnnotationAssertion_0= ruleAnnotationAssertion | this_SubAnnotationPropertyOf_1= ruleSubAnnotationPropertyOf | this_AnnotationPropertyDomain_2= ruleAnnotationPropertyDomain | this_AnnotationPropertyRange_3= ruleAnnotationPropertyRange ) )
            // InternalOwl.g:6568:2: (this_AnnotationAssertion_0= ruleAnnotationAssertion | this_SubAnnotationPropertyOf_1= ruleSubAnnotationPropertyOf | this_AnnotationPropertyDomain_2= ruleAnnotationPropertyDomain | this_AnnotationPropertyRange_3= ruleAnnotationPropertyRange )
            {
            // InternalOwl.g:6568:2: (this_AnnotationAssertion_0= ruleAnnotationAssertion | this_SubAnnotationPropertyOf_1= ruleSubAnnotationPropertyOf | this_AnnotationPropertyDomain_2= ruleAnnotationPropertyDomain | this_AnnotationPropertyRange_3= ruleAnnotationPropertyRange )
            int alt82=4;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt82=1;
                }
                break;
            case 91:
                {
                alt82=2;
                }
                break;
            case 92:
                {
                alt82=3;
                }
                break;
            case 93:
                {
                alt82=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalOwl.g:6569:3: this_AnnotationAssertion_0= ruleAnnotationAssertion
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
                    // InternalOwl.g:6578:3: this_SubAnnotationPropertyOf_1= ruleSubAnnotationPropertyOf
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
                    // InternalOwl.g:6587:3: this_AnnotationPropertyDomain_2= ruleAnnotationPropertyDomain
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
                    // InternalOwl.g:6596:3: this_AnnotationPropertyRange_3= ruleAnnotationPropertyRange
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
    // InternalOwl.g:6608:1: entryRuleAnnotationAssertion returns [EObject current=null] : iv_ruleAnnotationAssertion= ruleAnnotationAssertion EOF ;
    public final EObject entryRuleAnnotationAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationAssertion = null;


        try {
            // InternalOwl.g:6608:60: (iv_ruleAnnotationAssertion= ruleAnnotationAssertion EOF )
            // InternalOwl.g:6609:2: iv_ruleAnnotationAssertion= ruleAnnotationAssertion EOF
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
    // InternalOwl.g:6615:1: ruleAnnotationAssertion returns [EObject current=null] : (otherlv_0= 'AnnotationAssertion' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_annotationSubject_4_0= ruleAnnotationSubject ) ) ( (lv_annotationValue_5_0= ruleAnnotationValue ) ) otherlv_6= ')' ) ;
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
            // InternalOwl.g:6621:2: ( (otherlv_0= 'AnnotationAssertion' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_annotationSubject_4_0= ruleAnnotationSubject ) ) ( (lv_annotationValue_5_0= ruleAnnotationValue ) ) otherlv_6= ')' ) )
            // InternalOwl.g:6622:2: (otherlv_0= 'AnnotationAssertion' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_annotationSubject_4_0= ruleAnnotationSubject ) ) ( (lv_annotationValue_5_0= ruleAnnotationValue ) ) otherlv_6= ')' )
            {
            // InternalOwl.g:6622:2: (otherlv_0= 'AnnotationAssertion' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_annotationSubject_4_0= ruleAnnotationSubject ) ) ( (lv_annotationValue_5_0= ruleAnnotationValue ) ) otherlv_6= ')' )
            // InternalOwl.g:6623:3: otherlv_0= 'AnnotationAssertion' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_annotationSubject_4_0= ruleAnnotationSubject ) ) ( (lv_annotationValue_5_0= ruleAnnotationValue ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,90,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAssertionAccess().getAnnotationAssertionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationAssertionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:6631:3: ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==89) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalOwl.g:6632:4: (lv_annotationAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:6632:4: (lv_annotationAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:6633:5: lv_annotationAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getAnnotationAssertionAccess().getAnnotationAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop83;
                }
            } while (true);

            // InternalOwl.g:6650:3: ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) )
            // InternalOwl.g:6651:4: (lv_annotationProperty_3_0= ruleAnnotationProperty )
            {
            // InternalOwl.g:6651:4: (lv_annotationProperty_3_0= ruleAnnotationProperty )
            // InternalOwl.g:6652:5: lv_annotationProperty_3_0= ruleAnnotationProperty
            {

            					newCompositeNode(grammarAccess.getAnnotationAssertionAccess().getAnnotationPropertyAnnotationPropertyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalOwl.g:6669:3: ( (lv_annotationSubject_4_0= ruleAnnotationSubject ) )
            // InternalOwl.g:6670:4: (lv_annotationSubject_4_0= ruleAnnotationSubject )
            {
            // InternalOwl.g:6670:4: (lv_annotationSubject_4_0= ruleAnnotationSubject )
            // InternalOwl.g:6671:5: lv_annotationSubject_4_0= ruleAnnotationSubject
            {

            					newCompositeNode(grammarAccess.getAnnotationAssertionAccess().getAnnotationSubjectAnnotationSubjectParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_35);
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

            // InternalOwl.g:6688:3: ( (lv_annotationValue_5_0= ruleAnnotationValue ) )
            // InternalOwl.g:6689:4: (lv_annotationValue_5_0= ruleAnnotationValue )
            {
            // InternalOwl.g:6689:4: (lv_annotationValue_5_0= ruleAnnotationValue )
            // InternalOwl.g:6690:5: lv_annotationValue_5_0= ruleAnnotationValue
            {

            					newCompositeNode(grammarAccess.getAnnotationAssertionAccess().getAnnotationValueAnnotationValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:6715:1: entryRuleAnnotationSubject returns [EObject current=null] : iv_ruleAnnotationSubject= ruleAnnotationSubject EOF ;
    public final EObject entryRuleAnnotationSubject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationSubject = null;


        try {
            // InternalOwl.g:6715:58: (iv_ruleAnnotationSubject= ruleAnnotationSubject EOF )
            // InternalOwl.g:6716:2: iv_ruleAnnotationSubject= ruleAnnotationSubject EOF
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
    // InternalOwl.g:6722:1: ruleAnnotationSubject returns [EObject current=null] : ( ( () ruleIRI ) | this_AnonymousIndividualReference_2= ruleAnonymousIndividualReference ) ;
    public final EObject ruleAnnotationSubject() throws RecognitionException {
        EObject current = null;

        EObject this_AnonymousIndividualReference_2 = null;



        	enterRule();

        try {
            // InternalOwl.g:6728:2: ( ( ( () ruleIRI ) | this_AnonymousIndividualReference_2= ruleAnonymousIndividualReference ) )
            // InternalOwl.g:6729:2: ( ( () ruleIRI ) | this_AnonymousIndividualReference_2= ruleAnonymousIndividualReference )
            {
            // InternalOwl.g:6729:2: ( ( () ruleIRI ) | this_AnonymousIndividualReference_2= ruleAnonymousIndividualReference )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=RULE_FULL_IRI && LA84_0<=RULE_PN_LOCAL)) ) {
                alt84=1;
            }
            else if ( (LA84_0==RULE_BLANK_NODE_LABEL) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalOwl.g:6730:3: ( () ruleIRI )
                    {
                    // InternalOwl.g:6730:3: ( () ruleIRI )
                    // InternalOwl.g:6731:4: () ruleIRI
                    {
                    // InternalOwl.g:6731:4: ()
                    // InternalOwl.g:6732:5: 
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
                    // InternalOwl.g:6747:3: this_AnonymousIndividualReference_2= ruleAnonymousIndividualReference
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
    // InternalOwl.g:6759:1: entryRuleSubAnnotationPropertyOf returns [EObject current=null] : iv_ruleSubAnnotationPropertyOf= ruleSubAnnotationPropertyOf EOF ;
    public final EObject entryRuleSubAnnotationPropertyOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAnnotationPropertyOf = null;


        try {
            // InternalOwl.g:6759:64: (iv_ruleSubAnnotationPropertyOf= ruleSubAnnotationPropertyOf EOF )
            // InternalOwl.g:6760:2: iv_ruleSubAnnotationPropertyOf= ruleSubAnnotationPropertyOf EOF
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
    // InternalOwl.g:6766:1: ruleSubAnnotationPropertyOf returns [EObject current=null] : (otherlv_0= 'SubAnnotationPropertyOf' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_subAnnotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_superAnnotationProperty_4_0= ruleAnnotationProperty ) ) otherlv_5= ')' ) ;
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
            // InternalOwl.g:6772:2: ( (otherlv_0= 'SubAnnotationPropertyOf' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_subAnnotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_superAnnotationProperty_4_0= ruleAnnotationProperty ) ) otherlv_5= ')' ) )
            // InternalOwl.g:6773:2: (otherlv_0= 'SubAnnotationPropertyOf' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_subAnnotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_superAnnotationProperty_4_0= ruleAnnotationProperty ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:6773:2: (otherlv_0= 'SubAnnotationPropertyOf' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_subAnnotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_superAnnotationProperty_4_0= ruleAnnotationProperty ) ) otherlv_5= ')' )
            // InternalOwl.g:6774:3: otherlv_0= 'SubAnnotationPropertyOf' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_subAnnotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_superAnnotationProperty_4_0= ruleAnnotationProperty ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,91,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSubAnnotationPropertyOfAccess().getSubAnnotationPropertyOfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getSubAnnotationPropertyOfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:6782:3: ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==89) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalOwl.g:6783:4: (lv_annotationAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:6783:4: (lv_annotationAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:6784:5: lv_annotationAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getSubAnnotationPropertyOfAccess().getAnnotationAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop85;
                }
            } while (true);

            // InternalOwl.g:6801:3: ( (lv_subAnnotationProperty_3_0= ruleAnnotationProperty ) )
            // InternalOwl.g:6802:4: (lv_subAnnotationProperty_3_0= ruleAnnotationProperty )
            {
            // InternalOwl.g:6802:4: (lv_subAnnotationProperty_3_0= ruleAnnotationProperty )
            // InternalOwl.g:6803:5: lv_subAnnotationProperty_3_0= ruleAnnotationProperty
            {

            					newCompositeNode(grammarAccess.getSubAnnotationPropertyOfAccess().getSubAnnotationPropertyAnnotationPropertyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalOwl.g:6820:3: ( (lv_superAnnotationProperty_4_0= ruleAnnotationProperty ) )
            // InternalOwl.g:6821:4: (lv_superAnnotationProperty_4_0= ruleAnnotationProperty )
            {
            // InternalOwl.g:6821:4: (lv_superAnnotationProperty_4_0= ruleAnnotationProperty )
            // InternalOwl.g:6822:5: lv_superAnnotationProperty_4_0= ruleAnnotationProperty
            {

            					newCompositeNode(grammarAccess.getSubAnnotationPropertyOfAccess().getSuperAnnotationPropertyAnnotationPropertyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:6847:1: entryRuleAnnotationPropertyDomain returns [EObject current=null] : iv_ruleAnnotationPropertyDomain= ruleAnnotationPropertyDomain EOF ;
    public final EObject entryRuleAnnotationPropertyDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationPropertyDomain = null;


        try {
            // InternalOwl.g:6847:65: (iv_ruleAnnotationPropertyDomain= ruleAnnotationPropertyDomain EOF )
            // InternalOwl.g:6848:2: iv_ruleAnnotationPropertyDomain= ruleAnnotationPropertyDomain EOF
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
    // InternalOwl.g:6854:1: ruleAnnotationPropertyDomain returns [EObject current=null] : (otherlv_0= 'AnnotationPropertyDomain' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_domain_4_0= ruleIRI ) ) otherlv_5= ')' ) ;
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
            // InternalOwl.g:6860:2: ( (otherlv_0= 'AnnotationPropertyDomain' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_domain_4_0= ruleIRI ) ) otherlv_5= ')' ) )
            // InternalOwl.g:6861:2: (otherlv_0= 'AnnotationPropertyDomain' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_domain_4_0= ruleIRI ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:6861:2: (otherlv_0= 'AnnotationPropertyDomain' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_domain_4_0= ruleIRI ) ) otherlv_5= ')' )
            // InternalOwl.g:6862:3: otherlv_0= 'AnnotationPropertyDomain' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_domain_4_0= ruleIRI ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,92,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationPropertyDomainAccess().getAnnotationPropertyDomainKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationPropertyDomainAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:6870:3: ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==89) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalOwl.g:6871:4: (lv_annotationAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:6871:4: (lv_annotationAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:6872:5: lv_annotationAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getAnnotationPropertyDomainAccess().getAnnotationAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop86;
                }
            } while (true);

            // InternalOwl.g:6889:3: ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) )
            // InternalOwl.g:6890:4: (lv_annotationProperty_3_0= ruleAnnotationProperty )
            {
            // InternalOwl.g:6890:4: (lv_annotationProperty_3_0= ruleAnnotationProperty )
            // InternalOwl.g:6891:5: lv_annotationProperty_3_0= ruleAnnotationProperty
            {

            					newCompositeNode(grammarAccess.getAnnotationPropertyDomainAccess().getAnnotationPropertyAnnotationPropertyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalOwl.g:6908:3: ( (lv_domain_4_0= ruleIRI ) )
            // InternalOwl.g:6909:4: (lv_domain_4_0= ruleIRI )
            {
            // InternalOwl.g:6909:4: (lv_domain_4_0= ruleIRI )
            // InternalOwl.g:6910:5: lv_domain_4_0= ruleIRI
            {

            					newCompositeNode(grammarAccess.getAnnotationPropertyDomainAccess().getDomainIRIParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:6935:1: entryRuleAnnotationPropertyRange returns [EObject current=null] : iv_ruleAnnotationPropertyRange= ruleAnnotationPropertyRange EOF ;
    public final EObject entryRuleAnnotationPropertyRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationPropertyRange = null;


        try {
            // InternalOwl.g:6935:64: (iv_ruleAnnotationPropertyRange= ruleAnnotationPropertyRange EOF )
            // InternalOwl.g:6936:2: iv_ruleAnnotationPropertyRange= ruleAnnotationPropertyRange EOF
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
    // InternalOwl.g:6942:1: ruleAnnotationPropertyRange returns [EObject current=null] : (otherlv_0= 'AnnotationPropertyRange' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_range_4_0= ruleIRI ) ) otherlv_5= ')' ) ;
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
            // InternalOwl.g:6948:2: ( (otherlv_0= 'AnnotationPropertyRange' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_range_4_0= ruleIRI ) ) otherlv_5= ')' ) )
            // InternalOwl.g:6949:2: (otherlv_0= 'AnnotationPropertyRange' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_range_4_0= ruleIRI ) ) otherlv_5= ')' )
            {
            // InternalOwl.g:6949:2: (otherlv_0= 'AnnotationPropertyRange' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_range_4_0= ruleIRI ) ) otherlv_5= ')' )
            // InternalOwl.g:6950:3: otherlv_0= 'AnnotationPropertyRange' otherlv_1= '(' ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )* ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) ) ( (lv_range_4_0= ruleIRI ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,93,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationPropertyRangeAccess().getAnnotationPropertyRangeKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationPropertyRangeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOwl.g:6958:3: ( (lv_annotationAnnotations_2_0= ruleAnnotation ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==89) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalOwl.g:6959:4: (lv_annotationAnnotations_2_0= ruleAnnotation )
            	    {
            	    // InternalOwl.g:6959:4: (lv_annotationAnnotations_2_0= ruleAnnotation )
            	    // InternalOwl.g:6960:5: lv_annotationAnnotations_2_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getAnnotationPropertyRangeAccess().getAnnotationAnnotationsAnnotationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop87;
                }
            } while (true);

            // InternalOwl.g:6977:3: ( (lv_annotationProperty_3_0= ruleAnnotationProperty ) )
            // InternalOwl.g:6978:4: (lv_annotationProperty_3_0= ruleAnnotationProperty )
            {
            // InternalOwl.g:6978:4: (lv_annotationProperty_3_0= ruleAnnotationProperty )
            // InternalOwl.g:6979:5: lv_annotationProperty_3_0= ruleAnnotationProperty
            {

            					newCompositeNode(grammarAccess.getAnnotationPropertyRangeAccess().getAnnotationPropertyAnnotationPropertyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalOwl.g:6996:3: ( (lv_range_4_0= ruleIRI ) )
            // InternalOwl.g:6997:4: (lv_range_4_0= ruleIRI )
            {
            // InternalOwl.g:6997:4: (lv_range_4_0= ruleIRI )
            // InternalOwl.g:6998:5: lv_range_4_0= ruleIRI
            {

            					newCompositeNode(grammarAccess.getAnnotationPropertyRangeAccess().getRangeIRIParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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
    // InternalOwl.g:7023:1: entryRuleIRI returns [String current=null] : iv_ruleIRI= ruleIRI EOF ;
    public final String entryRuleIRI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIRI = null;


        try {
            // InternalOwl.g:7023:43: (iv_ruleIRI= ruleIRI EOF )
            // InternalOwl.g:7024:2: iv_ruleIRI= ruleIRI EOF
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
    // InternalOwl.g:7030:1: ruleIRI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FullIRI_0= ruleFullIRI | this_AbbreviatedIRI_1= ruleAbbreviatedIRI ) ;
    public final AntlrDatatypeRuleToken ruleIRI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FullIRI_0 = null;

        AntlrDatatypeRuleToken this_AbbreviatedIRI_1 = null;



        	enterRule();

        try {
            // InternalOwl.g:7036:2: ( (this_FullIRI_0= ruleFullIRI | this_AbbreviatedIRI_1= ruleAbbreviatedIRI ) )
            // InternalOwl.g:7037:2: (this_FullIRI_0= ruleFullIRI | this_AbbreviatedIRI_1= ruleAbbreviatedIRI )
            {
            // InternalOwl.g:7037:2: (this_FullIRI_0= ruleFullIRI | this_AbbreviatedIRI_1= ruleAbbreviatedIRI )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_FULL_IRI) ) {
                alt88=1;
            }
            else if ( ((LA88_0>=RULE_PN_PREFIX && LA88_0<=RULE_PN_LOCAL)) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalOwl.g:7038:3: this_FullIRI_0= ruleFullIRI
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
                    // InternalOwl.g:7049:3: this_AbbreviatedIRI_1= ruleAbbreviatedIRI
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
    // InternalOwl.g:7063:1: entryRuleFullIRI returns [String current=null] : iv_ruleFullIRI= ruleFullIRI EOF ;
    public final String entryRuleFullIRI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullIRI = null;


        try {
            // InternalOwl.g:7063:47: (iv_ruleFullIRI= ruleFullIRI EOF )
            // InternalOwl.g:7064:2: iv_ruleFullIRI= ruleFullIRI EOF
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
    // InternalOwl.g:7070:1: ruleFullIRI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FULL_IRI_0= RULE_FULL_IRI ;
    public final AntlrDatatypeRuleToken ruleFullIRI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FULL_IRI_0=null;


        	enterRule();

        try {
            // InternalOwl.g:7076:2: (this_FULL_IRI_0= RULE_FULL_IRI )
            // InternalOwl.g:7077:2: this_FULL_IRI_0= RULE_FULL_IRI
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
    // InternalOwl.g:7087:1: entryRuleAbbreviatedIRI returns [String current=null] : iv_ruleAbbreviatedIRI= ruleAbbreviatedIRI EOF ;
    public final String entryRuleAbbreviatedIRI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAbbreviatedIRI = null;


        try {
            // InternalOwl.g:7087:54: (iv_ruleAbbreviatedIRI= ruleAbbreviatedIRI EOF )
            // InternalOwl.g:7088:2: iv_ruleAbbreviatedIRI= ruleAbbreviatedIRI EOF
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
    // InternalOwl.g:7094:1: ruleAbbreviatedIRI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PN_PREFIX_0= RULE_PN_PREFIX )? this_PN_LOCAL_1= RULE_PN_LOCAL ) ;
    public final AntlrDatatypeRuleToken ruleAbbreviatedIRI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PN_PREFIX_0=null;
        Token this_PN_LOCAL_1=null;


        	enterRule();

        try {
            // InternalOwl.g:7100:2: ( ( (this_PN_PREFIX_0= RULE_PN_PREFIX )? this_PN_LOCAL_1= RULE_PN_LOCAL ) )
            // InternalOwl.g:7101:2: ( (this_PN_PREFIX_0= RULE_PN_PREFIX )? this_PN_LOCAL_1= RULE_PN_LOCAL )
            {
            // InternalOwl.g:7101:2: ( (this_PN_PREFIX_0= RULE_PN_PREFIX )? this_PN_LOCAL_1= RULE_PN_LOCAL )
            // InternalOwl.g:7102:3: (this_PN_PREFIX_0= RULE_PN_PREFIX )? this_PN_LOCAL_1= RULE_PN_LOCAL
            {
            // InternalOwl.g:7102:3: (this_PN_PREFIX_0= RULE_PN_PREFIX )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_PN_PREFIX) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalOwl.g:7103:4: this_PN_PREFIX_0= RULE_PN_PREFIX
                    {
                    this_PN_PREFIX_0=(Token)match(input,RULE_PN_PREFIX,FOLLOW_36); 

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
    // InternalOwl.g:7122:1: entryRulePrefixName returns [String current=null] : iv_rulePrefixName= rulePrefixName EOF ;
    public final String entryRulePrefixName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefixName = null;


        try {
            // InternalOwl.g:7122:50: (iv_rulePrefixName= rulePrefixName EOF )
            // InternalOwl.g:7123:2: iv_rulePrefixName= rulePrefixName EOF
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
    // InternalOwl.g:7129:1: rulePrefixName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PN_PREFIX_0= RULE_PN_PREFIX )? kw= ':' ) ;
    public final AntlrDatatypeRuleToken rulePrefixName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PN_PREFIX_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalOwl.g:7135:2: ( ( (this_PN_PREFIX_0= RULE_PN_PREFIX )? kw= ':' ) )
            // InternalOwl.g:7136:2: ( (this_PN_PREFIX_0= RULE_PN_PREFIX )? kw= ':' )
            {
            // InternalOwl.g:7136:2: ( (this_PN_PREFIX_0= RULE_PN_PREFIX )? kw= ':' )
            // InternalOwl.g:7137:3: (this_PN_PREFIX_0= RULE_PN_PREFIX )? kw= ':'
            {
            // InternalOwl.g:7137:3: (this_PN_PREFIX_0= RULE_PN_PREFIX )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_PN_PREFIX) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalOwl.g:7138:4: this_PN_PREFIX_0= RULE_PN_PREFIX
                    {
                    this_PN_PREFIX_0=(Token)match(input,RULE_PN_PREFIX,FOLLOW_37); 

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
    // InternalOwl.g:7155:1: entryRuleNodeID returns [String current=null] : iv_ruleNodeID= ruleNodeID EOF ;
    public final String entryRuleNodeID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNodeID = null;


        try {
            // InternalOwl.g:7155:46: (iv_ruleNodeID= ruleNodeID EOF )
            // InternalOwl.g:7156:2: iv_ruleNodeID= ruleNodeID EOF
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
    // InternalOwl.g:7162:1: ruleNodeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BLANK_NODE_LABEL_0= RULE_BLANK_NODE_LABEL ;
    public final AntlrDatatypeRuleToken ruleNodeID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BLANK_NODE_LABEL_0=null;


        	enterRule();

        try {
            // InternalOwl.g:7168:2: (this_BLANK_NODE_LABEL_0= RULE_BLANK_NODE_LABEL )
            // InternalOwl.g:7169:2: this_BLANK_NODE_LABEL_0= RULE_BLANK_NODE_LABEL
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000880002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L,0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xDF000000054001C0L,0x000000003FFFFFFFL});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xDF00000005400000L,0x000000003FFFFFFFL});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xDF00000004400000L,0x000000003FFFFFFFL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xDF00000004400000L,0x000000003DFFFFFFL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000001C0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001F8000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000007C000001C0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000007C004001C0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000004001C0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00FFFF80000001C0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00FFFF80004001C0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000004003C0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000002000001C0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000007C000001C2L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00FFFF80000001C0L,0x0000000002000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000000001C0L,0x0000000002000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x20000002000001C0L,0x0000000002000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000002004001C0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000002000001C0L,0x0000000002000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000000003C0L,0x0000000002000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000000003D0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});

}