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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOCUMENTATION_COMMENT", "RULE_BOOLEAN_VALUE", "RULE_STRING_VALUE", "RULE_NATURAL_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "'{'", "'}'", "'is'", "';'", "'class'", "'assoc'", "'feature'", "'abstract'", "'specializes'", "','", "'part'", "'port'", "'connector'", "'end'", "':'", "'composes'", "'any'", "'['", "'..'", "']'", "'='", "'redefines'", "'subsets'", "'=>'", "'@'", "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", "'null'", "'.'", "'e'", "'E'", "'::'", "'public'", "'private'", "'protected'", "'packaged'", "'in'", "'out'", "'inout'"
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
    // InternalAlf.g:72:1: ruleUnitDefinition returns [EObject current=null] : (this_CommentedUnitDefinition_0= ruleCommentedUnitDefinition | this_UnCommentedUnitDefinition_1= ruleUnCommentedUnitDefinition ) ;
    public final EObject ruleUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_CommentedUnitDefinition_0 = null;

        EObject this_UnCommentedUnitDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:78:2: ( (this_CommentedUnitDefinition_0= ruleCommentedUnitDefinition | this_UnCommentedUnitDefinition_1= ruleUnCommentedUnitDefinition ) )
            // InternalAlf.g:79:2: (this_CommentedUnitDefinition_0= ruleCommentedUnitDefinition | this_UnCommentedUnitDefinition_1= ruleUnCommentedUnitDefinition )
            {
            // InternalAlf.g:79:2: (this_CommentedUnitDefinition_0= ruleCommentedUnitDefinition | this_UnCommentedUnitDefinition_1= ruleUnCommentedUnitDefinition )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DOCUMENTATION_COMMENT) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_UNRESTRICTED_NAME)||LA1_0==15||LA1_0==20||LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAlf.g:80:3: this_CommentedUnitDefinition_0= ruleCommentedUnitDefinition
                    {

                    			newCompositeNode(grammarAccess.getUnitDefinitionAccess().getCommentedUnitDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommentedUnitDefinition_0=ruleCommentedUnitDefinition();

                    state._fsp--;


                    			current = this_CommentedUnitDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:89:3: this_UnCommentedUnitDefinition_1= ruleUnCommentedUnitDefinition
                    {

                    			newCompositeNode(grammarAccess.getUnitDefinitionAccess().getUnCommentedUnitDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnCommentedUnitDefinition_1=ruleUnCommentedUnitDefinition();

                    state._fsp--;


                    			current = this_UnCommentedUnitDefinition_1;
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


    // $ANTLR start "entryRuleCommentedUnitDefinition"
    // InternalAlf.g:101:1: entryRuleCommentedUnitDefinition returns [EObject current=null] : iv_ruleCommentedUnitDefinition= ruleCommentedUnitDefinition EOF ;
    public final EObject entryRuleCommentedUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentedUnitDefinition = null;


        try {
            // InternalAlf.g:101:64: (iv_ruleCommentedUnitDefinition= ruleCommentedUnitDefinition EOF )
            // InternalAlf.g:102:2: iv_ruleCommentedUnitDefinition= ruleCommentedUnitDefinition EOF
            {
             newCompositeNode(grammarAccess.getCommentedUnitDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommentedUnitDefinition=ruleCommentedUnitDefinition();

            state._fsp--;

             current =iv_ruleCommentedUnitDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentedUnitDefinition"


    // $ANTLR start "ruleCommentedUnitDefinition"
    // InternalAlf.g:108:1: ruleCommentedUnitDefinition returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )+ ( (lv_ownedMembership_1_0= ruleUnitMember ) ) ) ;
    public final EObject ruleCommentedUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedElement_0_0 = null;

        EObject lv_ownedMembership_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:114:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )+ ( (lv_ownedMembership_1_0= ruleUnitMember ) ) ) )
            // InternalAlf.g:115:2: ( ( (lv_ownedElement_0_0= ruleComment ) )+ ( (lv_ownedMembership_1_0= ruleUnitMember ) ) )
            {
            // InternalAlf.g:115:2: ( ( (lv_ownedElement_0_0= ruleComment ) )+ ( (lv_ownedMembership_1_0= ruleUnitMember ) ) )
            // InternalAlf.g:116:3: ( (lv_ownedElement_0_0= ruleComment ) )+ ( (lv_ownedMembership_1_0= ruleUnitMember ) )
            {
            // InternalAlf.g:116:3: ( (lv_ownedElement_0_0= ruleComment ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAlf.g:117:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:117:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:118:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getCommentedUnitDefinitionAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_ownedElement_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCommentedUnitDefinitionRule());
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalAlf.g:135:3: ( (lv_ownedMembership_1_0= ruleUnitMember ) )
            // InternalAlf.g:136:4: (lv_ownedMembership_1_0= ruleUnitMember )
            {
            // InternalAlf.g:136:4: (lv_ownedMembership_1_0= ruleUnitMember )
            // InternalAlf.g:137:5: lv_ownedMembership_1_0= ruleUnitMember
            {

            					newCompositeNode(grammarAccess.getCommentedUnitDefinitionAccess().getOwnedMembershipUnitMemberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_ownedMembership_1_0=ruleUnitMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommentedUnitDefinitionRule());
            					}
            					add(
            						current,
            						"ownedMembership",
            						lv_ownedMembership_1_0,
            						"org.omg.sysml.Alf.UnitMember");
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
    // $ANTLR end "ruleCommentedUnitDefinition"


    // $ANTLR start "entryRuleUnitMember"
    // InternalAlf.g:158:1: entryRuleUnitMember returns [EObject current=null] : iv_ruleUnitMember= ruleUnitMember EOF ;
    public final EObject entryRuleUnitMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitMember = null;


        try {
            // InternalAlf.g:158:51: (iv_ruleUnitMember= ruleUnitMember EOF )
            // InternalAlf.g:159:2: iv_ruleUnitMember= ruleUnitMember EOF
            {
             newCompositeNode(grammarAccess.getUnitMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnitMember=ruleUnitMember();

            state._fsp--;

             current =iv_ruleUnitMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnitMember"


    // $ANTLR start "ruleUnitMember"
    // InternalAlf.g:165:1: ruleUnitMember returns [EObject current=null] : ( (lv_ownedMemberElement_0_0= ruleUnCommentedUnitDefinition ) ) ;
    public final EObject ruleUnitMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMemberElement_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:171:2: ( ( (lv_ownedMemberElement_0_0= ruleUnCommentedUnitDefinition ) ) )
            // InternalAlf.g:172:2: ( (lv_ownedMemberElement_0_0= ruleUnCommentedUnitDefinition ) )
            {
            // InternalAlf.g:172:2: ( (lv_ownedMemberElement_0_0= ruleUnCommentedUnitDefinition ) )
            // InternalAlf.g:173:3: (lv_ownedMemberElement_0_0= ruleUnCommentedUnitDefinition )
            {
            // InternalAlf.g:173:3: (lv_ownedMemberElement_0_0= ruleUnCommentedUnitDefinition )
            // InternalAlf.g:174:4: lv_ownedMemberElement_0_0= ruleUnCommentedUnitDefinition
            {

            				newCompositeNode(grammarAccess.getUnitMemberAccess().getOwnedMemberElementUnCommentedUnitDefinitionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedMemberElement_0_0=ruleUnCommentedUnitDefinition();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getUnitMemberRule());
            				}
            				set(
            					current,
            					"ownedMemberElement",
            					lv_ownedMemberElement_0_0,
            					"org.omg.sysml.Alf.UnCommentedUnitDefinition");
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
    // $ANTLR end "ruleUnitMember"


    // $ANTLR start "entryRuleUnCommentedUnitDefinition"
    // InternalAlf.g:194:1: entryRuleUnCommentedUnitDefinition returns [EObject current=null] : iv_ruleUnCommentedUnitDefinition= ruleUnCommentedUnitDefinition EOF ;
    public final EObject entryRuleUnCommentedUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnCommentedUnitDefinition = null;


        try {
            // InternalAlf.g:194:66: (iv_ruleUnCommentedUnitDefinition= ruleUnCommentedUnitDefinition EOF )
            // InternalAlf.g:195:2: iv_ruleUnCommentedUnitDefinition= ruleUnCommentedUnitDefinition EOF
            {
             newCompositeNode(grammarAccess.getUnCommentedUnitDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnCommentedUnitDefinition=ruleUnCommentedUnitDefinition();

            state._fsp--;

             current =iv_ruleUnCommentedUnitDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnCommentedUnitDefinition"


    // $ANTLR start "ruleUnCommentedUnitDefinition"
    // InternalAlf.g:201:1: ruleUnCommentedUnitDefinition returns [EObject current=null] : (this_PackageDefinition_0= rulePackageDefinition | this_ClassDefinition_1= ruleClassDefinition | this_NamedFeatureDefinition_2= ruleNamedFeatureDefinition ) ;
    public final EObject ruleUnCommentedUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinition_0 = null;

        EObject this_ClassDefinition_1 = null;

        EObject this_NamedFeatureDefinition_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:207:2: ( (this_PackageDefinition_0= rulePackageDefinition | this_ClassDefinition_1= ruleClassDefinition | this_NamedFeatureDefinition_2= ruleNamedFeatureDefinition ) )
            // InternalAlf.g:208:2: (this_PackageDefinition_0= rulePackageDefinition | this_ClassDefinition_1= ruleClassDefinition | this_NamedFeatureDefinition_2= ruleNamedFeatureDefinition )
            {
            // InternalAlf.g:208:2: (this_PackageDefinition_0= rulePackageDefinition | this_ClassDefinition_1= ruleClassDefinition | this_NamedFeatureDefinition_2= ruleNamedFeatureDefinition )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 20:
            case 23:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAlf.g:209:3: this_PackageDefinition_0= rulePackageDefinition
                    {

                    			newCompositeNode(grammarAccess.getUnCommentedUnitDefinitionAccess().getPackageDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackageDefinition_0=rulePackageDefinition();

                    state._fsp--;


                    			current = this_PackageDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:218:3: this_ClassDefinition_1= ruleClassDefinition
                    {

                    			newCompositeNode(grammarAccess.getUnCommentedUnitDefinitionAccess().getClassDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassDefinition_1=ruleClassDefinition();

                    state._fsp--;


                    			current = this_ClassDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:227:3: this_NamedFeatureDefinition_2= ruleNamedFeatureDefinition
                    {

                    			newCompositeNode(grammarAccess.getUnCommentedUnitDefinitionAccess().getNamedFeatureDefinitionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NamedFeatureDefinition_2=ruleNamedFeatureDefinition();

                    state._fsp--;


                    			current = this_NamedFeatureDefinition_2;
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
    // $ANTLR end "ruleUnCommentedUnitDefinition"


    // $ANTLR start "entryRuleComment"
    // InternalAlf.g:239:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalAlf.g:239:48: (iv_ruleComment= ruleComment EOF )
            // InternalAlf.g:240:2: iv_ruleComment= ruleComment EOF
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
    // InternalAlf.g:246:1: ruleComment returns [EObject current=null] : ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_body_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:252:2: ( ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) ) )
            // InternalAlf.g:253:2: ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) )
            {
            // InternalAlf.g:253:2: ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) )
            // InternalAlf.g:254:3: (lv_body_0_0= RULE_DOCUMENTATION_COMMENT )
            {
            // InternalAlf.g:254:3: (lv_body_0_0= RULE_DOCUMENTATION_COMMENT )
            // InternalAlf.g:255:4: lv_body_0_0= RULE_DOCUMENTATION_COMMENT
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


    // $ANTLR start "entryRulePackageDefinition"
    // InternalAlf.g:274:1: entryRulePackageDefinition returns [EObject current=null] : iv_rulePackageDefinition= rulePackageDefinition EOF ;
    public final EObject entryRulePackageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDefinition = null;


        try {
            // InternalAlf.g:274:58: (iv_rulePackageDefinition= rulePackageDefinition EOF )
            // InternalAlf.g:275:2: iv_rulePackageDefinition= rulePackageDefinition EOF
            {
             newCompositeNode(grammarAccess.getPackageDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDefinition=rulePackageDefinition();

            state._fsp--;

             current =iv_rulePackageDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDefinition"


    // $ANTLR start "rulePackageDefinition"
    // InternalAlf.g:281:1: rulePackageDefinition returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_ownedMembership_3_0= rulePackageMember ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedMembership_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:287:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_ownedMembership_3_0= rulePackageMember ) )* otherlv_4= '}' ) )
            // InternalAlf.g:288:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_ownedMembership_3_0= rulePackageMember ) )* otherlv_4= '}' )
            {
            // InternalAlf.g:288:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_ownedMembership_3_0= rulePackageMember ) )* otherlv_4= '}' )
            // InternalAlf.g:289:3: otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_ownedMembership_3_0= rulePackageMember ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0());
            		
            // InternalAlf.g:293:3: ( (lv_name_1_0= ruleName ) )
            // InternalAlf.g:294:4: (lv_name_1_0= ruleName )
            {
            // InternalAlf.g:294:4: (lv_name_1_0= ruleName )
            // InternalAlf.g:295:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlf.g:316:3: ( (lv_ownedMembership_3_0= rulePackageMember ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_DOCUMENTATION_COMMENT||(LA4_0>=RULE_ID && LA4_0<=RULE_UNRESTRICTED_NAME)||LA4_0==15||(LA4_0>=20 && LA4_0<=23)||(LA4_0>=53 && LA4_0<=56)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAlf.g:317:4: (lv_ownedMembership_3_0= rulePackageMember )
            	    {
            	    // InternalAlf.g:317:4: (lv_ownedMembership_3_0= rulePackageMember )
            	    // InternalAlf.g:318:5: lv_ownedMembership_3_0= rulePackageMember
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getOwnedMembershipPackageMemberParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRulePackageDefinitionOrStub"
    // InternalAlf.g:343:1: entryRulePackageDefinitionOrStub returns [EObject current=null] : iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF ;
    public final EObject entryRulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDefinitionOrStub = null;


        try {
            // InternalAlf.g:343:64: (iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF )
            // InternalAlf.g:344:2: iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF
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
    // InternalAlf.g:350:1: rulePackageDefinitionOrStub returns [EObject current=null] : this_PackageDefinition_0= rulePackageDefinition ;
    public final EObject rulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:356:2: (this_PackageDefinition_0= rulePackageDefinition )
            // InternalAlf.g:357:2: this_PackageDefinition_0= rulePackageDefinition
            {

            		newCompositeNode(grammarAccess.getPackageDefinitionOrStubAccess().getPackageDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PackageDefinition_0=rulePackageDefinition();

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


    // $ANTLR start "entryRulePackageMember"
    // InternalAlf.g:368:1: entryRulePackageMember returns [EObject current=null] : iv_rulePackageMember= rulePackageMember EOF ;
    public final EObject entryRulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageMember = null;


        try {
            // InternalAlf.g:368:54: (iv_rulePackageMember= rulePackageMember EOF )
            // InternalAlf.g:369:2: iv_rulePackageMember= rulePackageMember EOF
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
    // InternalAlf.g:375:1: rulePackageMember returns [EObject current=null] : (this_NonFeatureMember_0= ruleNonFeatureMember | this_PackagedFeatureMember_1= rulePackagedFeatureMember ) ;
    public final EObject rulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureMember_0 = null;

        EObject this_PackagedFeatureMember_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:381:2: ( (this_NonFeatureMember_0= ruleNonFeatureMember | this_PackagedFeatureMember_1= rulePackagedFeatureMember ) )
            // InternalAlf.g:382:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_PackagedFeatureMember_1= rulePackagedFeatureMember )
            {
            // InternalAlf.g:382:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_PackagedFeatureMember_1= rulePackagedFeatureMember )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalAlf.g:383:3: this_NonFeatureMember_0= ruleNonFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getPackageMemberAccess().getNonFeatureMemberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonFeatureMember_0=ruleNonFeatureMember();

                    state._fsp--;


                    			current = this_NonFeatureMember_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:392:3: this_PackagedFeatureMember_1= rulePackagedFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getPackageMemberAccess().getPackagedFeatureMemberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackagedFeatureMember_1=rulePackagedFeatureMember();

                    state._fsp--;


                    			current = this_PackagedFeatureMember_1;
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
    // $ANTLR end "rulePackageMember"


    // $ANTLR start "entryRuleNonFeatureMember"
    // InternalAlf.g:404:1: entryRuleNonFeatureMember returns [EObject current=null] : iv_ruleNonFeatureMember= ruleNonFeatureMember EOF ;
    public final EObject entryRuleNonFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureMember = null;


        try {
            // InternalAlf.g:404:57: (iv_ruleNonFeatureMember= ruleNonFeatureMember EOF )
            // InternalAlf.g:405:2: iv_ruleNonFeatureMember= ruleNonFeatureMember EOF
            {
             newCompositeNode(grammarAccess.getNonFeatureMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonFeatureMember=ruleNonFeatureMember();

            state._fsp--;

             current =iv_ruleNonFeatureMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonFeatureMember"


    // $ANTLR start "ruleNonFeatureMember"
    // InternalAlf.g:411:1: ruleNonFeatureMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ;
    public final EObject ruleNonFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedElement_0_0 = null;

        Enumerator lv_visibility_1_0 = null;

        EObject lv_ownedMemberElement_2_0 = null;

        AntlrDatatypeRuleToken lv_memberName_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:417:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            // InternalAlf.g:418:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            {
            // InternalAlf.g:418:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            // InternalAlf.g:419:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) )
            {
            // InternalAlf.g:419:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAlf.g:420:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:420:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:421:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_ownedElement_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNonFeatureMemberRule());
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
            	    break loop6;
                }
            } while (true);

            // InternalAlf.g:438:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=53 && LA7_0<=56)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlf.g:439:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:439:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:440:5: lv_visibility_1_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_visibility_1_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNonFeatureMemberRule());
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

            // InternalAlf.g:457:3: ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalAlf.g:458:4: ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) )
                    {
                    // InternalAlf.g:458:4: ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) )
                    // InternalAlf.g:459:5: (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition )
                    {
                    // InternalAlf.g:459:5: (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition )
                    // InternalAlf.g:460:6: lv_ownedMemberElement_2_0= ruleNonFeatureDefinition
                    {

                    						newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getOwnedMemberElementNonFeatureDefinitionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_2_0=ruleNonFeatureDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNonFeatureMemberRule());
                    						}
                    						set(
                    							current,
                    							"ownedMemberElement",
                    							lv_ownedMemberElement_2_0,
                    							"org.omg.sysml.Alf.NonFeatureDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:478:4: ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
                    {
                    // InternalAlf.g:478:4: ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
                    // InternalAlf.g:479:5: ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';'
                    {

                    					newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getNonFeatureMemberKindParserRuleCall_2_1_0());
                    				
                    pushFollow(FOLLOW_8);
                    ruleNonFeatureMemberKind();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalAlf.g:486:5: ( (lv_memberName_4_0= ruleName ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalAlf.g:487:6: (lv_memberName_4_0= ruleName )
                            {
                            // InternalAlf.g:487:6: (lv_memberName_4_0= ruleName )
                            // InternalAlf.g:488:7: lv_memberName_4_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getMemberNameNameParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_memberName_4_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNonFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"memberName",
                            								lv_memberName_4_0,
                            								"org.omg.sysml.Alf.Name");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_4); 

                    					newLeafNode(otherlv_5, grammarAccess.getNonFeatureMemberAccess().getIsKeyword_2_1_2());
                    				
                    // InternalAlf.g:509:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:510:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:510:6: ( ruleQualifiedName )
                    // InternalAlf.g:511:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getMemberElementElementCrossReference_2_1_3_0());
                    						
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getNonFeatureMemberAccess().getSemicolonKeyword_2_1_4());
                    				

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
    // $ANTLR end "ruleNonFeatureMember"


    // $ANTLR start "entryRuleNonFeatureMemberKind"
    // InternalAlf.g:535:1: entryRuleNonFeatureMemberKind returns [String current=null] : iv_ruleNonFeatureMemberKind= ruleNonFeatureMemberKind EOF ;
    public final String entryRuleNonFeatureMemberKind() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonFeatureMemberKind = null;


        try {
            // InternalAlf.g:535:60: (iv_ruleNonFeatureMemberKind= ruleNonFeatureMemberKind EOF )
            // InternalAlf.g:536:2: iv_ruleNonFeatureMemberKind= ruleNonFeatureMemberKind EOF
            {
             newCompositeNode(grammarAccess.getNonFeatureMemberKindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonFeatureMemberKind=ruleNonFeatureMemberKind();

            state._fsp--;

             current =iv_ruleNonFeatureMemberKind.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonFeatureMemberKind"


    // $ANTLR start "ruleNonFeatureMemberKind"
    // InternalAlf.g:542:1: ruleNonFeatureMemberKind returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'package' | kw= 'class' | kw= 'assoc' ) ;
    public final AntlrDatatypeRuleToken ruleNonFeatureMemberKind() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:548:2: ( (kw= 'package' | kw= 'class' | kw= 'assoc' ) )
            // InternalAlf.g:549:2: (kw= 'package' | kw= 'class' | kw= 'assoc' )
            {
            // InternalAlf.g:549:2: (kw= 'package' | kw= 'class' | kw= 'assoc' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt10=1;
                }
                break;
            case 20:
                {
                alt10=2;
                }
                break;
            case 21:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalAlf.g:550:3: kw= 'package'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNonFeatureMemberKindAccess().getPackageKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:556:3: kw= 'class'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNonFeatureMemberKindAccess().getClassKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:562:3: kw= 'assoc'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNonFeatureMemberKindAccess().getAssocKeyword_2());
                    		

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
    // $ANTLR end "ruleNonFeatureMemberKind"


    // $ANTLR start "entryRulePackagedFeatureMember"
    // InternalAlf.g:571:1: entryRulePackagedFeatureMember returns [EObject current=null] : iv_rulePackagedFeatureMember= rulePackagedFeatureMember EOF ;
    public final EObject entryRulePackagedFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackagedFeatureMember = null;


        try {
            // InternalAlf.g:571:62: (iv_rulePackagedFeatureMember= rulePackagedFeatureMember EOF )
            // InternalAlf.g:572:2: iv_rulePackagedFeatureMember= rulePackagedFeatureMember EOF
            {
             newCompositeNode(grammarAccess.getPackagedFeatureMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackagedFeatureMember=rulePackagedFeatureMember();

            state._fsp--;

             current =iv_rulePackagedFeatureMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackagedFeatureMember"


    // $ANTLR start "rulePackagedFeatureMember"
    // InternalAlf.g:578:1: rulePackagedFeatureMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) ) ;
    public final EObject rulePackagedFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_ownedElement_0_0 = null;

        Enumerator lv_visibility_1_0 = null;

        EObject lv_ownedMemberElement_3_0 = null;

        EObject lv_ownedMemberElement_5_0 = null;

        AntlrDatatypeRuleToken lv_memberName_7_0 = null;

        AntlrDatatypeRuleToken lv_memberName_8_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:584:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) ) )
            // InternalAlf.g:585:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) )
            {
            // InternalAlf.g:585:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) )
            // InternalAlf.g:586:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) )
            {
            // InternalAlf.g:586:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAlf.g:587:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:587:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:588:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_ownedElement_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
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

            // InternalAlf.g:605:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=53 && LA12_0<=56)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAlf.g:606:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:606:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:607:5: lv_visibility_1_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_visibility_1_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
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

            // InternalAlf.g:624:3: ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalAlf.g:625:4: ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:625:4: ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:626:5: (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:626:5: (otherlv_2= 'feature' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==22) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalAlf.g:627:6: otherlv_2= 'feature'
                            {
                            otherlv_2=(Token)match(input,22,FOLLOW_4); 

                            						newLeafNode(otherlv_2, grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_2_0_0());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:632:5: ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:633:6: (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:633:6: (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:634:7: lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementNamedFeatureDefinitionParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_3_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_3_0,
                    								"org.omg.sysml.Alf.NamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:653:4: (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:653:4: (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:654:5: otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_13); 

                    					newLeafNode(otherlv_4, grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_2_1_0());
                    				
                    // InternalAlf.g:658:5: ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:659:6: (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:659:6: (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:660:7: lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementUnnamedFeatureDefinitionParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_5_0=ruleUnnamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_5_0,
                    								"org.omg.sysml.Alf.UnnamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:679:4: ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' )
                    {
                    // InternalAlf.g:679:4: ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' )
                    // InternalAlf.g:680:5: ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';'
                    {
                    // InternalAlf.g:680:5: ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==22) ) {
                        alt15=1;
                    }
                    else if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalAlf.g:681:6: (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? )
                            {
                            // InternalAlf.g:681:6: (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? )
                            // InternalAlf.g:682:7: otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )?
                            {
                            otherlv_6=(Token)match(input,22,FOLLOW_8); 

                            							newLeafNode(otherlv_6, grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_2_2_0_0_0());
                            						
                            // InternalAlf.g:686:7: ( (lv_memberName_7_0= ruleName ) )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // InternalAlf.g:687:8: (lv_memberName_7_0= ruleName )
                                    {
                                    // InternalAlf.g:687:8: (lv_memberName_7_0= ruleName )
                                    // InternalAlf.g:688:9: lv_memberName_7_0= ruleName
                                    {

                                    									newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameNameParserRuleCall_2_2_0_0_1_0());
                                    								
                                    pushFollow(FOLLOW_9);
                                    lv_memberName_7_0=ruleName();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
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


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:707:6: ( (lv_memberName_8_0= ruleName ) )
                            {
                            // InternalAlf.g:707:6: ( (lv_memberName_8_0= ruleName ) )
                            // InternalAlf.g:708:7: (lv_memberName_8_0= ruleName )
                            {
                            // InternalAlf.g:708:7: (lv_memberName_8_0= ruleName )
                            // InternalAlf.g:709:8: lv_memberName_8_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameNameParserRuleCall_2_2_0_1_0());
                            							
                            pushFollow(FOLLOW_9);
                            lv_memberName_8_0=ruleName();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                            								}
                            								set(
                            									current,
                            									"memberName",
                            									lv_memberName_8_0,
                            									"org.omg.sysml.Alf.Name");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,18,FOLLOW_4); 

                    					newLeafNode(otherlv_9, grammarAccess.getPackagedFeatureMemberAccess().getIsKeyword_2_2_1());
                    				
                    // InternalAlf.g:731:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:732:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:732:6: ( ruleQualifiedName )
                    // InternalAlf.g:733:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPackagedFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementFeatureCrossReference_2_2_2_0());
                    						
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_11, grammarAccess.getPackagedFeatureMemberAccess().getSemicolonKeyword_2_2_3());
                    				

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
    // $ANTLR end "rulePackagedFeatureMember"


    // $ANTLR start "entryRuleNonFeatureDefinition"
    // InternalAlf.g:757:1: entryRuleNonFeatureDefinition returns [EObject current=null] : iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF ;
    public final EObject entryRuleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureDefinition = null;


        try {
            // InternalAlf.g:757:61: (iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF )
            // InternalAlf.g:758:2: iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF
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
    // InternalAlf.g:764:1: ruleNonFeatureDefinition returns [EObject current=null] : (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub ) ;
    public final EObject ruleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinitionOrStub_0 = null;

        EObject this_ClassifierDefinitionOrStub_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:770:2: ( (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub ) )
            // InternalAlf.g:771:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub )
            {
            // InternalAlf.g:771:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=20 && LA17_0<=21)||LA17_0==23) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalAlf.g:772:3: this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub
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
                    // InternalAlf.g:781:3: this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureDefinitionAccess().getClassifierDefinitionOrStubParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassifierDefinitionOrStub_1=ruleClassifierDefinitionOrStub();

                    state._fsp--;


                    			current = this_ClassifierDefinitionOrStub_1;
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


    // $ANTLR start "entryRuleClassifierDefinitionOrStub"
    // InternalAlf.g:793:1: entryRuleClassifierDefinitionOrStub returns [EObject current=null] : iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF ;
    public final EObject entryRuleClassifierDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierDefinitionOrStub = null;


        try {
            // InternalAlf.g:793:67: (iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF )
            // InternalAlf.g:794:2: iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF
            {
             newCompositeNode(grammarAccess.getClassifierDefinitionOrStubRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassifierDefinitionOrStub=ruleClassifierDefinitionOrStub();

            state._fsp--;

             current =iv_ruleClassifierDefinitionOrStub; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassifierDefinitionOrStub"


    // $ANTLR start "ruleClassifierDefinitionOrStub"
    // InternalAlf.g:800:1: ruleClassifierDefinitionOrStub returns [EObject current=null] : (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_1= ruleAssociationDefinitionOrStub ) ;
    public final EObject ruleClassifierDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinitionOrStub_0 = null;

        EObject this_AssociationDefinitionOrStub_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:806:2: ( (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_1= ruleAssociationDefinitionOrStub ) )
            // InternalAlf.g:807:2: (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_1= ruleAssociationDefinitionOrStub )
            {
            // InternalAlf.g:807:2: (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_1= ruleAssociationDefinitionOrStub )
            int alt18=2;
            switch ( input.LA(1) ) {
            case 23:
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==20) ) {
                    alt18=1;
                }
                else if ( (LA18_1==21) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt18=1;
                }
                break;
            case 21:
                {
                alt18=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalAlf.g:808:3: this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getClassifierDefinitionOrStubAccess().getClassDefinitionOrStubParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassDefinitionOrStub_0=ruleClassDefinitionOrStub();

                    state._fsp--;


                    			current = this_ClassDefinitionOrStub_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:817:3: this_AssociationDefinitionOrStub_1= ruleAssociationDefinitionOrStub
                    {

                    			newCompositeNode(grammarAccess.getClassifierDefinitionOrStubAccess().getAssociationDefinitionOrStubParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssociationDefinitionOrStub_1=ruleAssociationDefinitionOrStub();

                    state._fsp--;


                    			current = this_AssociationDefinitionOrStub_1;
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
    // $ANTLR end "ruleClassifierDefinitionOrStub"


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalAlf.g:829:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // InternalAlf.g:829:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalAlf.g:830:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
            {
             newCompositeNode(grammarAccess.getClassDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDeclaration=ruleClassDeclaration();

            state._fsp--;

             current =iv_ruleClassDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDeclaration"


    // $ANTLR start "ruleClassDeclaration"
    // InternalAlf.g:836:1: ruleClassDeclaration returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? ) ;
    public final EObject ruleClassDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedMembership_5_0 = null;

        EObject lv_ownedMembership_7_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:842:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? ) )
            // InternalAlf.g:843:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? )
            {
            // InternalAlf.g:843:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? )
            // InternalAlf.g:844:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )?
            {
            // InternalAlf.g:844:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAlf.g:845:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:845:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:846:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,23,FOLLOW_14); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDeclarationAccess().getClassKeyword_1());
            		
            // InternalAlf.g:862:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:863:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:863:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:864:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getClassDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalAlf.g:881:3: ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==18||LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAlf.g:882:4: (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )*
                    {
                    // InternalAlf.g:882:4: (otherlv_3= 'is' | otherlv_4= 'specializes' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==18) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==24) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalAlf.g:883:5: otherlv_3= 'is'
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_4); 

                            					newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getIsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:888:5: otherlv_4= 'specializes'
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_4); 

                            					newLeafNode(otherlv_4, grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:893:4: ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) )
                    // InternalAlf.g:894:5: (lv_ownedMembership_5_0= ruleOwnedGeneralization )
                    {
                    // InternalAlf.g:894:5: (lv_ownedMembership_5_0= ruleOwnedGeneralization )
                    // InternalAlf.g:895:6: lv_ownedMembership_5_0= ruleOwnedGeneralization
                    {

                    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_ownedMembership_5_0=ruleOwnedGeneralization();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"ownedMembership",
                    							lv_ownedMembership_5_0,
                    							"org.omg.sysml.Alf.OwnedGeneralization");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:912:4: (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==25) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalAlf.g:913:5: otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) )
                    	    {
                    	    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:917:5: ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) )
                    	    // InternalAlf.g:918:6: (lv_ownedMembership_7_0= ruleOwnedGeneralization )
                    	    {
                    	    // InternalAlf.g:918:6: (lv_ownedMembership_7_0= ruleOwnedGeneralization )
                    	    // InternalAlf.g:919:7: lv_ownedMembership_7_0= ruleOwnedGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_ownedMembership_7_0=ruleOwnedGeneralization();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedMembership",
                    	    								lv_ownedMembership_7_0,
                    	    								"org.omg.sysml.Alf.OwnedGeneralization");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
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


    // $ANTLR start "entryRuleOwnedGeneralization"
    // InternalAlf.g:942:1: entryRuleOwnedGeneralization returns [EObject current=null] : iv_ruleOwnedGeneralization= ruleOwnedGeneralization EOF ;
    public final EObject entryRuleOwnedGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedGeneralization = null;


        try {
            // InternalAlf.g:942:60: (iv_ruleOwnedGeneralization= ruleOwnedGeneralization EOF )
            // InternalAlf.g:943:2: iv_ruleOwnedGeneralization= ruleOwnedGeneralization EOF
            {
             newCompositeNode(grammarAccess.getOwnedGeneralizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOwnedGeneralization=ruleOwnedGeneralization();

            state._fsp--;

             current =iv_ruleOwnedGeneralization; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOwnedGeneralization"


    // $ANTLR start "ruleOwnedGeneralization"
    // InternalAlf.g:949:1: ruleOwnedGeneralization returns [EObject current=null] : ( (lv_ownedMemberElement_0_0= ruleGeneralization ) ) ;
    public final EObject ruleOwnedGeneralization() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMemberElement_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:955:2: ( ( (lv_ownedMemberElement_0_0= ruleGeneralization ) ) )
            // InternalAlf.g:956:2: ( (lv_ownedMemberElement_0_0= ruleGeneralization ) )
            {
            // InternalAlf.g:956:2: ( (lv_ownedMemberElement_0_0= ruleGeneralization ) )
            // InternalAlf.g:957:3: (lv_ownedMemberElement_0_0= ruleGeneralization )
            {
            // InternalAlf.g:957:3: (lv_ownedMemberElement_0_0= ruleGeneralization )
            // InternalAlf.g:958:4: lv_ownedMemberElement_0_0= ruleGeneralization
            {

            				newCompositeNode(grammarAccess.getOwnedGeneralizationAccess().getOwnedMemberElementGeneralizationParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedMemberElement_0_0=ruleGeneralization();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getOwnedGeneralizationRule());
            				}
            				set(
            					current,
            					"ownedMemberElement",
            					lv_ownedMemberElement_0_0,
            					"org.omg.sysml.Alf.Generalization");
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
    // $ANTLR end "ruleOwnedGeneralization"


    // $ANTLR start "entryRuleGeneralization"
    // InternalAlf.g:978:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalAlf.g:978:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalAlf.g:979:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalAlf.g:985:1: ruleGeneralization returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:991:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:992:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:992:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:993:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:993:3: ( ruleQualifiedName )
            // InternalAlf.g:994:4: ruleQualifiedName
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


    // $ANTLR start "entryRuleClassDefinition"
    // InternalAlf.g:1011:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // InternalAlf.g:1011:56: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // InternalAlf.g:1012:2: iv_ruleClassDefinition= ruleClassDefinition EOF
            {
             newCompositeNode(grammarAccess.getClassDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDefinition=ruleClassDefinition();

            state._fsp--;

             current =iv_ruleClassDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDefinition"


    // $ANTLR start "ruleClassDefinition"
    // InternalAlf.g:1018:1: ruleClassDefinition returns [EObject current=null] : (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}' ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_ClassDeclaration_0 = null;

        EObject lv_ownedMembership_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1024:2: ( (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}' ) )
            // InternalAlf.g:1025:2: (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}' )
            {
            // InternalAlf.g:1025:2: (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}' )
            // InternalAlf.g:1026:3: this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}'
            {

            			newCompositeNode(grammarAccess.getClassDefinitionAccess().getClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_ClassDeclaration_0=ruleClassDeclaration();

            state._fsp--;


            			current = this_ClassDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:1038:3: ( (lv_ownedMembership_2_0= ruleClassMember ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_DOCUMENTATION_COMMENT||(LA23_0>=RULE_ID && LA23_0<=RULE_UNRESTRICTED_NAME)||LA23_0==15||(LA23_0>=20 && LA23_0<=23)||(LA23_0>=26 && LA23_0<=28)||(LA23_0>=53 && LA23_0<=59)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAlf.g:1039:4: (lv_ownedMembership_2_0= ruleClassMember )
            	    {
            	    // InternalAlf.g:1039:4: (lv_ownedMembership_2_0= ruleClassMember )
            	    // InternalAlf.g:1040:5: lv_ownedMembership_2_0= ruleClassMember
            	    {

            	    					newCompositeNode(grammarAccess.getClassDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_ownedMembership_2_0=ruleClassMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedMembership",
            	    						lv_ownedMembership_2_0,
            	    						"org.omg.sysml.Alf.ClassMember");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getClassDefinitionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleClassDefinitionOrStub"
    // InternalAlf.g:1065:1: entryRuleClassDefinitionOrStub returns [EObject current=null] : iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF ;
    public final EObject entryRuleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:1065:62: (iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:1066:2: iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF
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
    // InternalAlf.g:1072:1: ruleClassDefinitionOrStub returns [EObject current=null] : this_ClassDefinition_0= ruleClassDefinition ;
    public final EObject ruleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1078:2: (this_ClassDefinition_0= ruleClassDefinition )
            // InternalAlf.g:1079:2: this_ClassDefinition_0= ruleClassDefinition
            {

            		newCompositeNode(grammarAccess.getClassDefinitionOrStubAccess().getClassDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ClassDefinition_0=ruleClassDefinition();

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


    // $ANTLR start "entryRuleClassMember"
    // InternalAlf.g:1090:1: entryRuleClassMember returns [EObject current=null] : iv_ruleClassMember= ruleClassMember EOF ;
    public final EObject entryRuleClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassMember = null;


        try {
            // InternalAlf.g:1090:52: (iv_ruleClassMember= ruleClassMember EOF )
            // InternalAlf.g:1091:2: iv_ruleClassMember= ruleClassMember EOF
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
    // InternalAlf.g:1097:1: ruleClassMember returns [EObject current=null] : (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember ) ;
    public final EObject ruleClassMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureMember_0 = null;

        EObject this_ClassFeatureMember_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1103:2: ( (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember ) )
            // InternalAlf.g:1104:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember )
            {
            // InternalAlf.g:1104:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalAlf.g:1105:3: this_NonFeatureMember_0= ruleNonFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getClassMemberAccess().getNonFeatureMemberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonFeatureMember_0=ruleNonFeatureMember();

                    state._fsp--;


                    			current = this_NonFeatureMember_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:1114:3: this_ClassFeatureMember_1= ruleClassFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getClassMemberAccess().getClassFeatureMemberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassFeatureMember_1=ruleClassFeatureMember();

                    state._fsp--;


                    			current = this_ClassFeatureMember_1;
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


    // $ANTLR start "entryRuleClassFeatureMember"
    // InternalAlf.g:1126:1: entryRuleClassFeatureMember returns [EObject current=null] : iv_ruleClassFeatureMember= ruleClassFeatureMember EOF ;
    public final EObject entryRuleClassFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassFeatureMember = null;


        try {
            // InternalAlf.g:1126:59: (iv_ruleClassFeatureMember= ruleClassFeatureMember EOF )
            // InternalAlf.g:1127:2: iv_ruleClassFeatureMember= ruleClassFeatureMember EOF
            {
             newCompositeNode(grammarAccess.getClassFeatureMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassFeatureMember=ruleClassFeatureMember();

            state._fsp--;

             current =iv_ruleClassFeatureMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassFeatureMember"


    // $ANTLR start "ruleClassFeatureMember"
    // InternalAlf.g:1133:1: ruleClassFeatureMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) ) ;
    public final EObject ruleClassFeatureMember() throws RecognitionException {
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
            // InternalAlf.g:1139:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) ) )
            // InternalAlf.g:1140:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) )
            {
            // InternalAlf.g:1140:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) )
            // InternalAlf.g:1141:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) )
            {
            // InternalAlf.g:1141:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAlf.g:1142:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:1142:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:1143:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_ownedElement_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
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
            	    break loop25;
                }
            } while (true);

            // InternalAlf.g:1160:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=53 && LA26_0<=56)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAlf.g:1161:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:1161:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:1162:5: lv_visibility_1_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_visibility_1_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
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

            // InternalAlf.g:1179:3: ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) )
            int alt34=4;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalAlf.g:1180:4: ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1180:4: ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1181:5: (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1181:5: (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )?
                    int alt27=4;
                    switch ( input.LA(1) ) {
                        case 22:
                            {
                            alt27=1;
                            }
                            break;
                        case 26:
                            {
                            alt27=2;
                            }
                            break;
                        case 27:
                            {
                            alt27=3;
                            }
                            break;
                    }

                    switch (alt27) {
                        case 1 :
                            // InternalAlf.g:1182:6: otherlv_2= 'feature'
                            {
                            otherlv_2=(Token)match(input,22,FOLLOW_20); 

                            						newLeafNode(otherlv_2, grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_2_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1187:6: ( (lv_isComposite_3_0= 'part' ) )
                            {
                            // InternalAlf.g:1187:6: ( (lv_isComposite_3_0= 'part' ) )
                            // InternalAlf.g:1188:7: (lv_isComposite_3_0= 'part' )
                            {
                            // InternalAlf.g:1188:7: (lv_isComposite_3_0= 'part' )
                            // InternalAlf.g:1189:8: lv_isComposite_3_0= 'part'
                            {
                            lv_isComposite_3_0=(Token)match(input,26,FOLLOW_20); 

                            								newLeafNode(lv_isComposite_3_0, grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_2_0_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isComposite", true, "part");
                            							

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAlf.g:1202:6: ( (lv_isPort_4_0= 'port' ) )
                            {
                            // InternalAlf.g:1202:6: ( (lv_isPort_4_0= 'port' ) )
                            // InternalAlf.g:1203:7: (lv_isPort_4_0= 'port' )
                            {
                            // InternalAlf.g:1203:7: (lv_isPort_4_0= 'port' )
                            // InternalAlf.g:1204:8: lv_isPort_4_0= 'port'
                            {
                            lv_isPort_4_0=(Token)match(input,27,FOLLOW_20); 

                            								newLeafNode(lv_isPort_4_0, grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_2_0_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPort", true, "port");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1217:5: ( (lv_direction_5_0= ruleFeatureDirection ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=57 && LA28_0<=59)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalAlf.g:1218:6: (lv_direction_5_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1218:6: (lv_direction_5_0= ruleFeatureDirection )
                            // InternalAlf.g:1219:7: lv_direction_5_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_4);
                            lv_direction_5_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
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

                    // InternalAlf.g:1236:5: ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1237:6: (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1237:6: (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1238:7: lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementNamedFeatureDefinitionParserRuleCall_2_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_6_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
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
                    // InternalAlf.g:1257:4: ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1257:4: ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:1258:5: (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1258:5: (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )
                    int alt29=3;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt29=1;
                        }
                        break;
                    case 26:
                        {
                        alt29=2;
                        }
                        break;
                    case 27:
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
                            // InternalAlf.g:1259:6: otherlv_7= 'feature'
                            {
                            otherlv_7=(Token)match(input,22,FOLLOW_21); 

                            						newLeafNode(otherlv_7, grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_2_1_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1264:6: ( (lv_isComposite_8_0= 'part' ) )
                            {
                            // InternalAlf.g:1264:6: ( (lv_isComposite_8_0= 'part' ) )
                            // InternalAlf.g:1265:7: (lv_isComposite_8_0= 'part' )
                            {
                            // InternalAlf.g:1265:7: (lv_isComposite_8_0= 'part' )
                            // InternalAlf.g:1266:8: lv_isComposite_8_0= 'part'
                            {
                            lv_isComposite_8_0=(Token)match(input,26,FOLLOW_21); 

                            								newLeafNode(lv_isComposite_8_0, grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_2_1_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isComposite", true, "part");
                            							

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAlf.g:1279:6: ( (lv_isPort_9_0= 'port' ) )
                            {
                            // InternalAlf.g:1279:6: ( (lv_isPort_9_0= 'port' ) )
                            // InternalAlf.g:1280:7: (lv_isPort_9_0= 'port' )
                            {
                            // InternalAlf.g:1280:7: (lv_isPort_9_0= 'port' )
                            // InternalAlf.g:1281:8: lv_isPort_9_0= 'port'
                            {
                            lv_isPort_9_0=(Token)match(input,27,FOLLOW_21); 

                            								newLeafNode(lv_isPort_9_0, grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_2_1_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPort", true, "port");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1294:5: ( (lv_direction_10_0= ruleFeatureDirection ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=57 && LA30_0<=59)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalAlf.g:1295:6: (lv_direction_10_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1295:6: (lv_direction_10_0= ruleFeatureDirection )
                            // InternalAlf.g:1296:7: lv_direction_10_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_direction_10_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
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

                    // InternalAlf.g:1313:5: ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:1314:6: (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:1314:6: (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:1315:7: lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementUnnamedFeatureDefinitionParserRuleCall_2_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_11_0=ruleUnnamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
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
                    // InternalAlf.g:1334:4: (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) )
                    {
                    // InternalAlf.g:1334:4: (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) )
                    // InternalAlf.g:1335:5: otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) )
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_22); 

                    					newLeafNode(otherlv_12, grammarAccess.getClassFeatureMemberAccess().getConnectorKeyword_2_2_0());
                    				
                    // InternalAlf.g:1339:5: ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) )
                    // InternalAlf.g:1340:6: (lv_ownedMemberElement_13_0= ruleConnectorDefinition )
                    {
                    // InternalAlf.g:1340:6: (lv_ownedMemberElement_13_0= ruleConnectorDefinition )
                    // InternalAlf.g:1341:7: lv_ownedMemberElement_13_0= ruleConnectorDefinition
                    {

                    							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementConnectorDefinitionParserRuleCall_2_2_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_13_0=ruleConnectorDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
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
                    // InternalAlf.g:1360:4: ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' )
                    {
                    // InternalAlf.g:1360:4: ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' )
                    // InternalAlf.g:1361:5: ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';'
                    {
                    // InternalAlf.g:1361:5: ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==22||LA33_0==26) ) {
                        alt33=1;
                    }
                    else if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalAlf.g:1362:6: ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? )
                            {
                            // InternalAlf.g:1362:6: ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? )
                            // InternalAlf.g:1363:7: (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )?
                            {
                            // InternalAlf.g:1363:7: (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) )
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==22) ) {
                                alt31=1;
                            }
                            else if ( (LA31_0==26) ) {
                                alt31=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 31, 0, input);

                                throw nvae;
                            }
                            switch (alt31) {
                                case 1 :
                                    // InternalAlf.g:1364:8: otherlv_14= 'feature'
                                    {
                                    otherlv_14=(Token)match(input,22,FOLLOW_8); 

                                    								newLeafNode(otherlv_14, grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_2_3_0_0_0_0());
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:1369:8: ( (lv_isComposite_15_0= 'part' ) )
                                    {
                                    // InternalAlf.g:1369:8: ( (lv_isComposite_15_0= 'part' ) )
                                    // InternalAlf.g:1370:9: (lv_isComposite_15_0= 'part' )
                                    {
                                    // InternalAlf.g:1370:9: (lv_isComposite_15_0= 'part' )
                                    // InternalAlf.g:1371:10: lv_isComposite_15_0= 'part'
                                    {
                                    lv_isComposite_15_0=(Token)match(input,26,FOLLOW_8); 

                                    										newLeafNode(lv_isComposite_15_0, grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_2_3_0_0_0_1_0());
                                    									

                                    										if (current==null) {
                                    											current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                                    										}
                                    										setWithLastConsumed(current, "isComposite", true, "part");
                                    									

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalAlf.g:1384:7: ( (lv_memberName_16_0= ruleName ) )?
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt32=1;
                            }
                            switch (alt32) {
                                case 1 :
                                    // InternalAlf.g:1385:8: (lv_memberName_16_0= ruleName )
                                    {
                                    // InternalAlf.g:1385:8: (lv_memberName_16_0= ruleName )
                                    // InternalAlf.g:1386:9: lv_memberName_16_0= ruleName
                                    {

                                    									newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getMemberNameNameParserRuleCall_2_3_0_0_1_0());
                                    								
                                    pushFollow(FOLLOW_9);
                                    lv_memberName_16_0=ruleName();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
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
                            // InternalAlf.g:1405:6: ( (lv_memberName_17_0= ruleName ) )
                            {
                            // InternalAlf.g:1405:6: ( (lv_memberName_17_0= ruleName ) )
                            // InternalAlf.g:1406:7: (lv_memberName_17_0= ruleName )
                            {
                            // InternalAlf.g:1406:7: (lv_memberName_17_0= ruleName )
                            // InternalAlf.g:1407:8: lv_memberName_17_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getMemberNameNameParserRuleCall_2_3_0_1_0());
                            							
                            pushFollow(FOLLOW_9);
                            lv_memberName_17_0=ruleName();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
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

                    otherlv_18=(Token)match(input,18,FOLLOW_4); 

                    					newLeafNode(otherlv_18, grammarAccess.getClassFeatureMemberAccess().getIsKeyword_2_3_1());
                    				
                    // InternalAlf.g:1429:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1430:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1430:6: ( ruleQualifiedName )
                    // InternalAlf.g:1431:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getMemberElementElementCrossReference_2_3_2_0());
                    						
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_20=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_20, grammarAccess.getClassFeatureMemberAccess().getSemicolonKeyword_2_3_3());
                    				

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
    // $ANTLR end "ruleClassFeatureMember"


    // $ANTLR start "entryRuleAssociationDeclaration"
    // InternalAlf.g:1455:1: entryRuleAssociationDeclaration returns [EObject current=null] : iv_ruleAssociationDeclaration= ruleAssociationDeclaration EOF ;
    public final EObject entryRuleAssociationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDeclaration = null;


        try {
            // InternalAlf.g:1455:63: (iv_ruleAssociationDeclaration= ruleAssociationDeclaration EOF )
            // InternalAlf.g:1456:2: iv_ruleAssociationDeclaration= ruleAssociationDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAssociationDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationDeclaration=ruleAssociationDeclaration();

            state._fsp--;

             current =iv_ruleAssociationDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociationDeclaration"


    // $ANTLR start "ruleAssociationDeclaration"
    // InternalAlf.g:1462:1: ruleAssociationDeclaration returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? ) ;
    public final EObject ruleAssociationDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedMembership_5_0 = null;

        EObject lv_ownedMembership_7_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1468:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? ) )
            // InternalAlf.g:1469:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? )
            {
            // InternalAlf.g:1469:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? )
            // InternalAlf.g:1470:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )?
            {
            // InternalAlf.g:1470:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==23) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAlf.g:1471:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:1471:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:1472:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,23,FOLLOW_23); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getAssociationDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociationDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationDeclarationAccess().getAssocKeyword_1());
            		
            // InternalAlf.g:1488:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:1489:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:1489:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:1490:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalAlf.g:1507:3: ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==18||LA38_0==24) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAlf.g:1508:4: (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )*
                    {
                    // InternalAlf.g:1508:4: (otherlv_3= 'is' | otherlv_4= 'specializes' )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==18) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==24) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalAlf.g:1509:5: otherlv_3= 'is'
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_4); 

                            					newLeafNode(otherlv_3, grammarAccess.getAssociationDeclarationAccess().getIsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1514:5: otherlv_4= 'specializes'
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_4); 

                            					newLeafNode(otherlv_4, grammarAccess.getAssociationDeclarationAccess().getSpecializesKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1519:4: ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) )
                    // InternalAlf.g:1520:5: (lv_ownedMembership_5_0= ruleOwnedGeneralization )
                    {
                    // InternalAlf.g:1520:5: (lv_ownedMembership_5_0= ruleOwnedGeneralization )
                    // InternalAlf.g:1521:6: lv_ownedMembership_5_0= ruleOwnedGeneralization
                    {

                    						newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_ownedMembership_5_0=ruleOwnedGeneralization();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssociationDeclarationRule());
                    						}
                    						add(
                    							current,
                    							"ownedMembership",
                    							lv_ownedMembership_5_0,
                    							"org.omg.sysml.Alf.OwnedGeneralization");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:1538:4: (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==25) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalAlf.g:1539:5: otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) )
                    	    {
                    	    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAssociationDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:1543:5: ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) )
                    	    // InternalAlf.g:1544:6: (lv_ownedMembership_7_0= ruleOwnedGeneralization )
                    	    {
                    	    // InternalAlf.g:1544:6: (lv_ownedMembership_7_0= ruleOwnedGeneralization )
                    	    // InternalAlf.g:1545:7: lv_ownedMembership_7_0= ruleOwnedGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_ownedMembership_7_0=ruleOwnedGeneralization();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssociationDeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedMembership",
                    	    								lv_ownedMembership_7_0,
                    	    								"org.omg.sysml.Alf.OwnedGeneralization");
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
    // $ANTLR end "ruleAssociationDeclaration"


    // $ANTLR start "entryRuleAssociationDefinition"
    // InternalAlf.g:1568:1: entryRuleAssociationDefinition returns [EObject current=null] : iv_ruleAssociationDefinition= ruleAssociationDefinition EOF ;
    public final EObject entryRuleAssociationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinition = null;


        try {
            // InternalAlf.g:1568:62: (iv_ruleAssociationDefinition= ruleAssociationDefinition EOF )
            // InternalAlf.g:1569:2: iv_ruleAssociationDefinition= ruleAssociationDefinition EOF
            {
             newCompositeNode(grammarAccess.getAssociationDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationDefinition=ruleAssociationDefinition();

            state._fsp--;

             current =iv_ruleAssociationDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociationDefinition"


    // $ANTLR start "ruleAssociationDefinition"
    // InternalAlf.g:1575:1: ruleAssociationDefinition returns [EObject current=null] : (this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleAssociationMember ) )* otherlv_3= '}' ) ;
    public final EObject ruleAssociationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_AssociationDeclaration_0 = null;

        EObject lv_ownedMembership_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1581:2: ( (this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleAssociationMember ) )* otherlv_3= '}' ) )
            // InternalAlf.g:1582:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleAssociationMember ) )* otherlv_3= '}' )
            {
            // InternalAlf.g:1582:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleAssociationMember ) )* otherlv_3= '}' )
            // InternalAlf.g:1583:3: this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleAssociationMember ) )* otherlv_3= '}'
            {

            			newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getAssociationDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_AssociationDeclaration_0=ruleAssociationDeclaration();

            state._fsp--;


            			current = this_AssociationDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:1595:3: ( (lv_ownedMembership_2_0= ruleAssociationMember ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_DOCUMENTATION_COMMENT||(LA39_0>=RULE_ID && LA39_0<=RULE_UNRESTRICTED_NAME)||LA39_0==15||(LA39_0>=20 && LA39_0<=23)||(LA39_0>=26 && LA39_0<=29)||(LA39_0>=53 && LA39_0<=59)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAlf.g:1596:4: (lv_ownedMembership_2_0= ruleAssociationMember )
            	    {
            	    // InternalAlf.g:1596:4: (lv_ownedMembership_2_0= ruleAssociationMember )
            	    // InternalAlf.g:1597:5: lv_ownedMembership_2_0= ruleAssociationMember
            	    {

            	    					newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getOwnedMembershipAssociationMemberParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_ownedMembership_2_0=ruleAssociationMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAssociationDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedMembership",
            	    						lv_ownedMembership_2_0,
            	    						"org.omg.sysml.Alf.AssociationMember");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationDefinitionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleAssociationMember"
    // InternalAlf.g:1622:1: entryRuleAssociationMember returns [EObject current=null] : iv_ruleAssociationMember= ruleAssociationMember EOF ;
    public final EObject entryRuleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationMember = null;


        try {
            // InternalAlf.g:1622:58: (iv_ruleAssociationMember= ruleAssociationMember EOF )
            // InternalAlf.g:1623:2: iv_ruleAssociationMember= ruleAssociationMember EOF
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
    // InternalAlf.g:1629:1: ruleAssociationMember returns [EObject current=null] : (this_NonFeatureMember_0= ruleNonFeatureMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_EndFeatureMember_2= ruleEndFeatureMember ) ;
    public final EObject ruleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureMember_0 = null;

        EObject this_AssociationFeatureMember_1 = null;

        EObject this_EndFeatureMember_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:1635:2: ( (this_NonFeatureMember_0= ruleNonFeatureMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_EndFeatureMember_2= ruleEndFeatureMember ) )
            // InternalAlf.g:1636:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_EndFeatureMember_2= ruleEndFeatureMember )
            {
            // InternalAlf.g:1636:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_EndFeatureMember_2= ruleEndFeatureMember )
            int alt40=3;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // InternalAlf.g:1637:3: this_NonFeatureMember_0= ruleNonFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getAssociationMemberAccess().getNonFeatureMemberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonFeatureMember_0=ruleNonFeatureMember();

                    state._fsp--;


                    			current = this_NonFeatureMember_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:1646:3: this_AssociationFeatureMember_1= ruleAssociationFeatureMember
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
                    // InternalAlf.g:1655:3: this_EndFeatureMember_2= ruleEndFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getAssociationMemberAccess().getEndFeatureMemberParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EndFeatureMember_2=ruleEndFeatureMember();

                    state._fsp--;


                    			current = this_EndFeatureMember_2;
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


    // $ANTLR start "entryRuleAssociationDefinitionOrStub"
    // InternalAlf.g:1667:1: entryRuleAssociationDefinitionOrStub returns [EObject current=null] : iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF ;
    public final EObject entryRuleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinitionOrStub = null;


        try {
            // InternalAlf.g:1667:68: (iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF )
            // InternalAlf.g:1668:2: iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF
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
    // InternalAlf.g:1674:1: ruleAssociationDefinitionOrStub returns [EObject current=null] : this_AssociationDefinition_0= ruleAssociationDefinition ;
    public final EObject ruleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_AssociationDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1680:2: (this_AssociationDefinition_0= ruleAssociationDefinition )
            // InternalAlf.g:1681:2: this_AssociationDefinition_0= ruleAssociationDefinition
            {

            		newCompositeNode(grammarAccess.getAssociationDefinitionOrStubAccess().getAssociationDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AssociationDefinition_0=ruleAssociationDefinition();

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


    // $ANTLR start "entryRuleAssociationFeatureMember"
    // InternalAlf.g:1692:1: entryRuleAssociationFeatureMember returns [EObject current=null] : iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF ;
    public final EObject entryRuleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationFeatureMember = null;


        try {
            // InternalAlf.g:1692:65: (iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF )
            // InternalAlf.g:1693:2: iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF
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
    // InternalAlf.g:1699:1: ruleAssociationFeatureMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) ) ;
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
            // InternalAlf.g:1705:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) ) )
            // InternalAlf.g:1706:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) )
            {
            // InternalAlf.g:1706:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) )
            // InternalAlf.g:1707:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) )
            {
            // InternalAlf.g:1707:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAlf.g:1708:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:1708:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:1709:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_25);
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
            	    break loop41;
                }
            } while (true);

            // InternalAlf.g:1726:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=53 && LA42_0<=56)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAlf.g:1727:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:1727:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:1728:5: lv_visibility_1_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_26);
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

            // InternalAlf.g:1745:3: ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) )
            int alt47=3;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // InternalAlf.g:1746:4: ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1746:4: ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) )
                    // InternalAlf.g:1747:5: (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) )
                    {
                    // InternalAlf.g:1747:5: (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )
                    int alt43=3;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt43=1;
                        }
                        break;
                    case 26:
                        {
                        alt43=2;
                        }
                        break;
                    case 27:
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
                            // InternalAlf.g:1748:6: otherlv_2= 'feature'
                            {
                            otherlv_2=(Token)match(input,22,FOLLOW_27); 

                            						newLeafNode(otherlv_2, grammarAccess.getAssociationFeatureMemberAccess().getFeatureKeyword_2_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1753:6: ( (lv_isComposite_3_0= 'part' ) )
                            {
                            // InternalAlf.g:1753:6: ( (lv_isComposite_3_0= 'part' ) )
                            // InternalAlf.g:1754:7: (lv_isComposite_3_0= 'part' )
                            {
                            // InternalAlf.g:1754:7: (lv_isComposite_3_0= 'part' )
                            // InternalAlf.g:1755:8: lv_isComposite_3_0= 'part'
                            {
                            lv_isComposite_3_0=(Token)match(input,26,FOLLOW_27); 

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
                            // InternalAlf.g:1768:6: ( (lv_isPort_4_0= 'port' ) )
                            {
                            // InternalAlf.g:1768:6: ( (lv_isPort_4_0= 'port' ) )
                            // InternalAlf.g:1769:7: (lv_isPort_4_0= 'port' )
                            {
                            // InternalAlf.g:1769:7: (lv_isPort_4_0= 'port' )
                            // InternalAlf.g:1770:8: lv_isPort_4_0= 'port'
                            {
                            lv_isPort_4_0=(Token)match(input,27,FOLLOW_27); 

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

                    // InternalAlf.g:1783:5: ( (lv_direction_5_0= ruleFeatureDirection ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( ((LA44_0>=57 && LA44_0<=59)) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalAlf.g:1784:6: (lv_direction_5_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1784:6: (lv_direction_5_0= ruleFeatureDirection )
                            // InternalAlf.g:1785:7: lv_direction_5_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_27);
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

                    // InternalAlf.g:1802:5: ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) )
                    // InternalAlf.g:1803:6: (lv_ownedMemberElement_6_0= ruleFeatureDefinition )
                    {
                    // InternalAlf.g:1803:6: (lv_ownedMemberElement_6_0= ruleFeatureDefinition )
                    // InternalAlf.g:1804:7: lv_ownedMemberElement_6_0= ruleFeatureDefinition
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
                    // InternalAlf.g:1823:4: (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) )
                    {
                    // InternalAlf.g:1823:4: (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) )
                    // InternalAlf.g:1824:5: otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_22); 

                    					newLeafNode(otherlv_7, grammarAccess.getAssociationFeatureMemberAccess().getConnectorKeyword_2_1_0());
                    				
                    // InternalAlf.g:1828:5: ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) )
                    // InternalAlf.g:1829:6: (lv_ownedMemberElement_8_0= ruleConnectorDefinition )
                    {
                    // InternalAlf.g:1829:6: (lv_ownedMemberElement_8_0= ruleConnectorDefinition )
                    // InternalAlf.g:1830:7: lv_ownedMemberElement_8_0= ruleConnectorDefinition
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
                    // InternalAlf.g:1849:4: ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' )
                    {
                    // InternalAlf.g:1849:4: ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' )
                    // InternalAlf.g:1850:5: (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';'
                    {
                    // InternalAlf.g:1850:5: (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==22) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==26) ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalAlf.g:1851:6: otherlv_9= 'feature'
                            {
                            otherlv_9=(Token)match(input,22,FOLLOW_8); 

                            						newLeafNode(otherlv_9, grammarAccess.getAssociationFeatureMemberAccess().getFeatureKeyword_2_2_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1856:6: ( (lv_isComposite_10_0= 'part' ) )
                            {
                            // InternalAlf.g:1856:6: ( (lv_isComposite_10_0= 'part' ) )
                            // InternalAlf.g:1857:7: (lv_isComposite_10_0= 'part' )
                            {
                            // InternalAlf.g:1857:7: (lv_isComposite_10_0= 'part' )
                            // InternalAlf.g:1858:8: lv_isComposite_10_0= 'part'
                            {
                            lv_isComposite_10_0=(Token)match(input,26,FOLLOW_8); 

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

                    // InternalAlf.g:1871:5: ( (lv_memberName_11_0= ruleName ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalAlf.g:1872:6: (lv_memberName_11_0= ruleName )
                            {
                            // InternalAlf.g:1872:6: (lv_memberName_11_0= ruleName )
                            // InternalAlf.g:1873:7: lv_memberName_11_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getMemberNameNameParserRuleCall_2_2_1_0());
                            						
                            pushFollow(FOLLOW_9);
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

                    otherlv_12=(Token)match(input,18,FOLLOW_4); 

                    					newLeafNode(otherlv_12, grammarAccess.getAssociationFeatureMemberAccess().getIsKeyword_2_2_2());
                    				
                    // InternalAlf.g:1894:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1895:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1895:6: ( ruleQualifiedName )
                    // InternalAlf.g:1896:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getMemberElementElementCrossReference_2_2_3_0());
                    						
                    pushFollow(FOLLOW_10);
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


    // $ANTLR start "entryRuleEndFeatureMember"
    // InternalAlf.g:1920:1: entryRuleEndFeatureMember returns [EObject current=null] : iv_ruleEndFeatureMember= ruleEndFeatureMember EOF ;
    public final EObject entryRuleEndFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndFeatureMember = null;


        try {
            // InternalAlf.g:1920:57: (iv_ruleEndFeatureMember= ruleEndFeatureMember EOF )
            // InternalAlf.g:1921:2: iv_ruleEndFeatureMember= ruleEndFeatureMember EOF
            {
             newCompositeNode(grammarAccess.getEndFeatureMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndFeatureMember=ruleEndFeatureMember();

            state._fsp--;

             current =iv_ruleEndFeatureMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndFeatureMember"


    // $ANTLR start "ruleEndFeatureMember"
    // InternalAlf.g:1927:1: ruleEndFeatureMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) ) ;
    public final EObject ruleEndFeatureMember() throws RecognitionException {
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
            // InternalAlf.g:1933:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) ) )
            // InternalAlf.g:1934:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) )
            {
            // InternalAlf.g:1934:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) )
            // InternalAlf.g:1935:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) )
            {
            // InternalAlf.g:1935:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalAlf.g:1936:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:1936:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:1937:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_ownedElement_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
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
            	    break loop48;
                }
            } while (true);

            // InternalAlf.g:1954:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=53 && LA49_0<=56)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAlf.g:1955:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:1955:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:1956:5: lv_visibility_1_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_visibility_1_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
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

            // InternalAlf.g:1973:3: ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) )
            int alt55=3;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // InternalAlf.g:1974:4: ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1974:4: ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1975:5: (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1975:5: (otherlv_2= 'end' )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==29) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalAlf.g:1976:6: otherlv_2= 'end'
                            {
                            otherlv_2=(Token)match(input,29,FOLLOW_20); 

                            						newLeafNode(otherlv_2, grammarAccess.getEndFeatureMemberAccess().getEndKeyword_2_0_0());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:1981:5: ( (lv_direction_3_0= ruleFeatureDirection ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( ((LA51_0>=57 && LA51_0<=59)) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalAlf.g:1982:6: (lv_direction_3_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1982:6: (lv_direction_3_0= ruleFeatureDirection )
                            // InternalAlf.g:1983:7: lv_direction_3_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_4);
                            lv_direction_3_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
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

                    // InternalAlf.g:2000:5: ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:2001:6: (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:2001:6: (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:2002:7: lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getOwnedMemberElementNamedFeatureDefinitionParserRuleCall_2_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_4_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
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
                    // InternalAlf.g:2021:4: (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2021:4: (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:2022:5: otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_21); 

                    					newLeafNode(otherlv_5, grammarAccess.getEndFeatureMemberAccess().getEndKeyword_2_1_0());
                    				
                    // InternalAlf.g:2026:5: ( (lv_direction_6_0= ruleFeatureDirection ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( ((LA52_0>=57 && LA52_0<=59)) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalAlf.g:2027:6: (lv_direction_6_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2027:6: (lv_direction_6_0= ruleFeatureDirection )
                            // InternalAlf.g:2028:7: lv_direction_6_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_direction_6_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
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

                    // InternalAlf.g:2045:5: ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:2046:6: (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:2046:6: (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:2047:7: lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getOwnedMemberElementUnnamedFeatureDefinitionParserRuleCall_2_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_7_0=ruleUnnamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
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
                    // InternalAlf.g:2066:4: ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' )
                    {
                    // InternalAlf.g:2066:4: ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' )
                    // InternalAlf.g:2067:5: ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';'
                    {
                    // InternalAlf.g:2067:5: ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==29) ) {
                        alt54=1;
                    }
                    else if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt54=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalAlf.g:2068:6: (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? )
                            {
                            // InternalAlf.g:2068:6: (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? )
                            // InternalAlf.g:2069:7: otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )?
                            {
                            otherlv_8=(Token)match(input,29,FOLLOW_8); 

                            							newLeafNode(otherlv_8, grammarAccess.getEndFeatureMemberAccess().getEndKeyword_2_2_0_0_0());
                            						
                            // InternalAlf.g:2073:7: ( (lv_memberName_9_0= ruleName ) )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt53=1;
                            }
                            switch (alt53) {
                                case 1 :
                                    // InternalAlf.g:2074:8: (lv_memberName_9_0= ruleName )
                                    {
                                    // InternalAlf.g:2074:8: (lv_memberName_9_0= ruleName )
                                    // InternalAlf.g:2075:9: lv_memberName_9_0= ruleName
                                    {

                                    									newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getMemberNameNameParserRuleCall_2_2_0_0_1_0());
                                    								
                                    pushFollow(FOLLOW_9);
                                    lv_memberName_9_0=ruleName();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
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
                            // InternalAlf.g:2094:6: ( (lv_memberName_10_0= ruleName ) )
                            {
                            // InternalAlf.g:2094:6: ( (lv_memberName_10_0= ruleName ) )
                            // InternalAlf.g:2095:7: (lv_memberName_10_0= ruleName )
                            {
                            // InternalAlf.g:2095:7: (lv_memberName_10_0= ruleName )
                            // InternalAlf.g:2096:8: lv_memberName_10_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getMemberNameNameParserRuleCall_2_2_0_1_0());
                            							
                            pushFollow(FOLLOW_9);
                            lv_memberName_10_0=ruleName();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
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

                    otherlv_11=(Token)match(input,18,FOLLOW_4); 

                    					newLeafNode(otherlv_11, grammarAccess.getEndFeatureMemberAccess().getIsKeyword_2_2_1());
                    				
                    // InternalAlf.g:2118:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:2119:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:2119:6: ( ruleQualifiedName )
                    // InternalAlf.g:2120:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEndFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getMemberElementElementCrossReference_2_2_2_0());
                    						
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_13=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_13, grammarAccess.getEndFeatureMemberAccess().getSemicolonKeyword_2_2_3());
                    				

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
    // $ANTLR end "ruleEndFeatureMember"


    // $ANTLR start "entryRuleFeatureDefinition"
    // InternalAlf.g:2144:1: entryRuleFeatureDefinition returns [EObject current=null] : iv_ruleFeatureDefinition= ruleFeatureDefinition EOF ;
    public final EObject entryRuleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDefinition = null;


        try {
            // InternalAlf.g:2144:58: (iv_ruleFeatureDefinition= ruleFeatureDefinition EOF )
            // InternalAlf.g:2145:2: iv_ruleFeatureDefinition= ruleFeatureDefinition EOF
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
    // InternalAlf.g:2151:1: ruleFeatureDefinition returns [EObject current=null] : (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) ;
    public final EObject ruleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_NamedFeatureDefinition_0 = null;

        EObject this_UnnamedFeatureDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2157:2: ( (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) )
            // InternalAlf.g:2158:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            {
            // InternalAlf.g:2158:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt56=1;
            }
            else if ( (LA56_0==18||(LA56_0>=37 && LA56_0<=38)) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalAlf.g:2159:3: this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:2168:3: this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition
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
    // InternalAlf.g:2180:1: entryRuleNamedFeatureDefinition returns [EObject current=null] : iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF ;
    public final EObject entryRuleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedFeatureDefinition = null;


        try {
            // InternalAlf.g:2180:63: (iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF )
            // InternalAlf.g:2181:2: iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF
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
    // InternalAlf.g:2187:1: ruleNamedFeatureDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) | ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) ) ) ) ;
    public final EObject ruleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isComposite_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedMembership_5_0 = null;

        EObject lv_lower_7_0 = null;

        EObject lv_upper_9_0 = null;

        EObject lv_value_12_0 = null;

        EObject lv_ownedMembership_15_0 = null;

        EObject lv_ownedMembership_17_0 = null;

        EObject lv_lower_19_0 = null;

        EObject lv_upper_21_0 = null;

        EObject lv_value_24_0 = null;

        EObject lv_ownedMembership_27_0 = null;

        EObject lv_ownedMembership_30_0 = null;

        EObject lv_lower_33_0 = null;

        EObject lv_upper_35_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2193:2: ( ( ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) | ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) ) ) ) )
            // InternalAlf.g:2194:2: ( ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) | ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) ) ) )
            {
            // InternalAlf.g:2194:2: ( ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) | ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) ) ) )
            // InternalAlf.g:2195:3: ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) | ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) ) )
            {
            // InternalAlf.g:2195:3: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:2196:4: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:2196:4: (lv_name_0_0= ruleName )
            // InternalAlf.g:2197:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:2214:3: ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) | ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==16||LA74_0==19||LA74_0==30||LA74_0==33||LA74_0==36) ) {
                alt74=1;
            }
            else if ( (LA74_0==18||(LA74_0>=37 && LA74_0<=38)) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalAlf.g:2215:4: ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) )
                    {
                    // InternalAlf.g:2215:4: ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) )
                    // InternalAlf.g:2216:5: (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) )
                    {
                    // InternalAlf.g:2216:5: (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==30) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalAlf.g:2217:6: otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )?
                            {
                            otherlv_1=(Token)match(input,30,FOLLOW_31); 

                            						newLeafNode(otherlv_1, grammarAccess.getNamedFeatureDefinitionAccess().getColonKeyword_1_0_0_0());
                            					
                            // InternalAlf.g:2221:6: ( (lv_isComposite_2_0= 'composes' ) )?
                            int alt57=2;
                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==31) ) {
                                alt57=1;
                            }
                            switch (alt57) {
                                case 1 :
                                    // InternalAlf.g:2222:7: (lv_isComposite_2_0= 'composes' )
                                    {
                                    // InternalAlf.g:2222:7: (lv_isComposite_2_0= 'composes' )
                                    // InternalAlf.g:2223:8: lv_isComposite_2_0= 'composes'
                                    {
                                    lv_isComposite_2_0=(Token)match(input,31,FOLLOW_32); 

                                    								newLeafNode(lv_isComposite_2_0, grammarAccess.getNamedFeatureDefinitionAccess().getIsCompositeComposesKeyword_1_0_0_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getNamedFeatureDefinitionRule());
                                    								}
                                    								setWithLastConsumed(current, "isComposite", true, "composes");
                                    							

                                    }


                                    }
                                    break;

                            }

                            // InternalAlf.g:2235:6: ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' )
                            int alt58=2;
                            int LA58_0 = input.LA(1);

                            if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt58=1;
                            }
                            else if ( (LA58_0==32) ) {
                                alt58=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 58, 0, input);

                                throw nvae;
                            }
                            switch (alt58) {
                                case 1 :
                                    // InternalAlf.g:2236:7: ( ( ruleQualifiedName ) )
                                    {
                                    // InternalAlf.g:2236:7: ( ( ruleQualifiedName ) )
                                    // InternalAlf.g:2237:8: ( ruleQualifiedName )
                                    {
                                    // InternalAlf.g:2237:8: ( ruleQualifiedName )
                                    // InternalAlf.g:2238:9: ruleQualifiedName
                                    {

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getNamedFeatureDefinitionRule());
                                    									}
                                    								

                                    									newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getReferencedTypeClassCrossReference_1_0_0_2_0_0());
                                    								
                                    pushFollow(FOLLOW_33);
                                    ruleQualifiedName();

                                    state._fsp--;


                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:2253:7: otherlv_4= 'any'
                                    {
                                    otherlv_4=(Token)match(input,32,FOLLOW_33); 

                                    							newLeafNode(otherlv_4, grammarAccess.getNamedFeatureDefinitionAccess().getAnyKeyword_1_0_0_2_1());
                                    						

                                    }
                                    break;

                            }

                            // InternalAlf.g:2258:6: ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )?
                            int alt59=2;
                            int LA59_0 = input.LA(1);

                            if ( (LA59_0==18||(LA59_0>=37 && LA59_0<=38)) ) {
                                alt59=1;
                            }
                            switch (alt59) {
                                case 1 :
                                    // InternalAlf.g:2259:7: (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset )
                                    {
                                    // InternalAlf.g:2259:7: (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset )
                                    // InternalAlf.g:2260:8: lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset
                                    {

                                    								newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_0_0_3_0());
                                    							
                                    pushFollow(FOLLOW_34);
                                    lv_ownedMembership_5_0=ruleOwnedRedefinitionOrSubset();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                    								}
                                    								add(
                                    									current,
                                    									"ownedMembership",
                                    									lv_ownedMembership_5_0,
                                    									"org.omg.sysml.Alf.OwnedRedefinitionOrSubset");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:2278:5: (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==33) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalAlf.g:2279:6: otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']'
                            {
                            otherlv_6=(Token)match(input,33,FOLLOW_35); 

                            						newLeafNode(otherlv_6, grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_0_1_0());
                            					
                            // InternalAlf.g:2283:6: ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )?
                            int alt61=2;
                            int LA61_0 = input.LA(1);

                            if ( (LA61_0==RULE_NATURAL_VALUE) ) {
                                int LA61_1 = input.LA(2);

                                if ( (LA61_1==34) ) {
                                    alt61=1;
                                }
                            }
                            switch (alt61) {
                                case 1 :
                                    // InternalAlf.g:2284:7: ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..'
                                    {
                                    // InternalAlf.g:2284:7: ( (lv_lower_7_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:2285:8: (lv_lower_7_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:2285:8: (lv_lower_7_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:2286:9: lv_lower_7_0= ruleNaturalLiteralExpression
                                    {

                                    									newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_1_1_0_0());
                                    								
                                    pushFollow(FOLLOW_36);
                                    lv_lower_7_0=ruleNaturalLiteralExpression();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                    									}
                                    									set(
                                    										current,
                                    										"lower",
                                    										lv_lower_7_0,
                                    										"org.omg.sysml.Alf.NaturalLiteralExpression");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }

                                    otherlv_8=(Token)match(input,34,FOLLOW_35); 

                                    							newLeafNode(otherlv_8, grammarAccess.getNamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_0_1_1_1());
                                    						

                                    }
                                    break;

                            }

                            // InternalAlf.g:2308:6: ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:2309:7: (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:2309:7: (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:2310:8: lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression
                            {

                            								newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_0_1_2_0());
                            							
                            pushFollow(FOLLOW_37);
                            lv_upper_9_0=ruleUnlimitedNaturalLiteralExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                            								}
                            								set(
                            									current,
                            									"upper",
                            									lv_upper_9_0,
                            									"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_10=(Token)match(input,35,FOLLOW_38); 

                            						newLeafNode(otherlv_10, grammarAccess.getNamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_0_1_3());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:2332:5: (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==36) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalAlf.g:2333:6: otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) )
                            {
                            otherlv_11=(Token)match(input,36,FOLLOW_39); 

                            						newLeafNode(otherlv_11, grammarAccess.getNamedFeatureDefinitionAccess().getEqualsSignKeyword_1_0_2_0());
                            					
                            // InternalAlf.g:2337:6: ( (lv_value_12_0= ruleExpression ) )
                            // InternalAlf.g:2338:7: (lv_value_12_0= ruleExpression )
                            {
                            // InternalAlf.g:2338:7: (lv_value_12_0= ruleExpression )
                            // InternalAlf.g:2339:8: lv_value_12_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_0_2_1_0());
                            							
                            pushFollow(FOLLOW_40);
                            lv_value_12_0=ruleExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                            								}
                            								set(
                            									current,
                            									"value",
                            									lv_value_12_0,
                            									"org.omg.sysml.Alf.Expression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:2357:5: (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==19) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==16) ) {
                        alt65=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalAlf.g:2358:6: otherlv_13= ';'
                            {
                            otherlv_13=(Token)match(input,19,FOLLOW_2); 

                            						newLeafNode(otherlv_13, grammarAccess.getNamedFeatureDefinitionAccess().getSemicolonKeyword_1_0_3_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2363:6: (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' )
                            {
                            // InternalAlf.g:2363:6: (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' )
                            // InternalAlf.g:2364:7: otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}'
                            {
                            otherlv_14=(Token)match(input,16,FOLLOW_17); 

                            							newLeafNode(otherlv_14, grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_3_1_0());
                            						
                            // InternalAlf.g:2368:7: ( (lv_ownedMembership_15_0= ruleClassMember ) )*
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==RULE_DOCUMENTATION_COMMENT||(LA64_0>=RULE_ID && LA64_0<=RULE_UNRESTRICTED_NAME)||LA64_0==15||(LA64_0>=20 && LA64_0<=23)||(LA64_0>=26 && LA64_0<=28)||(LA64_0>=53 && LA64_0<=59)) ) {
                                    alt64=1;
                                }


                                switch (alt64) {
                            	case 1 :
                            	    // InternalAlf.g:2369:8: (lv_ownedMembership_15_0= ruleClassMember )
                            	    {
                            	    // InternalAlf.g:2369:8: (lv_ownedMembership_15_0= ruleClassMember )
                            	    // InternalAlf.g:2370:9: lv_ownedMembership_15_0= ruleClassMember
                            	    {

                            	    									newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_0_3_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_17);
                            	    lv_ownedMembership_15_0=ruleClassMember();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"ownedMembership",
                            	    										lv_ownedMembership_15_0,
                            	    										"org.omg.sysml.Alf.ClassMember");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop64;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,17,FOLLOW_2); 

                            							newLeafNode(otherlv_16, grammarAccess.getNamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_0_3_1_2());
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2395:4: ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) )
                    {
                    // InternalAlf.g:2395:4: ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) )
                    // InternalAlf.g:2396:5: ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) )
                    {
                    // InternalAlf.g:2396:5: ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) )
                    // InternalAlf.g:2397:6: (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset )
                    {
                    // InternalAlf.g:2397:6: (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset )
                    // InternalAlf.g:2398:7: lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset
                    {

                    							newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_41);
                    lv_ownedMembership_17_0=ruleOwnedRedefinitionOrSubset();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                    							}
                    							add(
                    								current,
                    								"ownedMembership",
                    								lv_ownedMembership_17_0,
                    								"org.omg.sysml.Alf.OwnedRedefinitionOrSubset");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:2415:5: ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==33) ) {
                        int LA73_1 = input.LA(2);

                        if ( (LA73_1==RULE_NATURAL_VALUE) ) {
                            int LA73_3 = input.LA(3);

                            if ( (LA73_3==34) ) {
                                int LA73_5 = input.LA(4);

                                if ( (LA73_5==RULE_NATURAL_VALUE) ) {
                                    int LA73_7 = input.LA(5);

                                    if ( (LA73_7==35) ) {
                                        int LA73_6 = input.LA(6);

                                        if ( (LA73_6==19) ) {
                                            alt73=2;
                                        }
                                        else if ( (LA73_6==16||LA73_6==36) ) {
                                            alt73=1;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 73, 6, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 73, 7, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA73_5==43) ) {
                                    int LA73_4 = input.LA(5);

                                    if ( (LA73_4==35) ) {
                                        int LA73_6 = input.LA(6);

                                        if ( (LA73_6==19) ) {
                                            alt73=2;
                                        }
                                        else if ( (LA73_6==16||LA73_6==36) ) {
                                            alt73=1;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 73, 6, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 73, 4, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 73, 5, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA73_3==35) ) {
                                int LA73_6 = input.LA(4);

                                if ( (LA73_6==19) ) {
                                    alt73=2;
                                }
                                else if ( (LA73_6==16||LA73_6==36) ) {
                                    alt73=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 73, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 73, 3, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA73_1==43) ) {
                            int LA73_4 = input.LA(3);

                            if ( (LA73_4==35) ) {
                                int LA73_6 = input.LA(4);

                                if ( (LA73_6==19) ) {
                                    alt73=2;
                                }
                                else if ( (LA73_6==16||LA73_6==36) ) {
                                    alt73=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 73, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 73, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 73, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA73_0==16||LA73_0==36) ) {
                        alt73=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalAlf.g:2416:6: ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) )
                            {
                            // InternalAlf.g:2416:6: ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) )
                            // InternalAlf.g:2417:7: (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) )
                            {
                            // InternalAlf.g:2417:7: (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )?
                            int alt67=2;
                            int LA67_0 = input.LA(1);

                            if ( (LA67_0==33) ) {
                                alt67=1;
                            }
                            switch (alt67) {
                                case 1 :
                                    // InternalAlf.g:2418:8: otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']'
                                    {
                                    otherlv_18=(Token)match(input,33,FOLLOW_35); 

                                    								newLeafNode(otherlv_18, grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_1_0_0_0());
                                    							
                                    // InternalAlf.g:2422:8: ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )?
                                    int alt66=2;
                                    int LA66_0 = input.LA(1);

                                    if ( (LA66_0==RULE_NATURAL_VALUE) ) {
                                        int LA66_1 = input.LA(2);

                                        if ( (LA66_1==34) ) {
                                            alt66=1;
                                        }
                                    }
                                    switch (alt66) {
                                        case 1 :
                                            // InternalAlf.g:2423:9: ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..'
                                            {
                                            // InternalAlf.g:2423:9: ( (lv_lower_19_0= ruleNaturalLiteralExpression ) )
                                            // InternalAlf.g:2424:10: (lv_lower_19_0= ruleNaturalLiteralExpression )
                                            {
                                            // InternalAlf.g:2424:10: (lv_lower_19_0= ruleNaturalLiteralExpression )
                                            // InternalAlf.g:2425:11: lv_lower_19_0= ruleNaturalLiteralExpression
                                            {

                                            											newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_1_0_0_1_0_0());
                                            										
                                            pushFollow(FOLLOW_36);
                                            lv_lower_19_0=ruleNaturalLiteralExpression();

                                            state._fsp--;


                                            											if (current==null) {
                                            												current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                            											}
                                            											set(
                                            												current,
                                            												"lower",
                                            												lv_lower_19_0,
                                            												"org.omg.sysml.Alf.NaturalLiteralExpression");
                                            											afterParserOrEnumRuleCall();
                                            										

                                            }


                                            }

                                            otherlv_20=(Token)match(input,34,FOLLOW_35); 

                                            									newLeafNode(otherlv_20, grammarAccess.getNamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_1_0_0_1_1());
                                            								

                                            }
                                            break;

                                    }

                                    // InternalAlf.g:2447:8: ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) )
                                    // InternalAlf.g:2448:9: (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:2448:9: (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression )
                                    // InternalAlf.g:2449:10: lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression
                                    {

                                    										newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_1_0_0_2_0());
                                    									
                                    pushFollow(FOLLOW_37);
                                    lv_upper_21_0=ruleUnlimitedNaturalLiteralExpression();

                                    state._fsp--;


                                    										if (current==null) {
                                    											current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                    										}
                                    										set(
                                    											current,
                                    											"upper",
                                    											lv_upper_21_0,
                                    											"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                                    										afterParserOrEnumRuleCall();
                                    									

                                    }


                                    }

                                    otherlv_22=(Token)match(input,35,FOLLOW_42); 

                                    								newLeafNode(otherlv_22, grammarAccess.getNamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_1_0_0_3());
                                    							

                                    }
                                    break;

                            }

                            // InternalAlf.g:2471:7: ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) )
                            int alt71=2;
                            int LA71_0 = input.LA(1);

                            if ( (LA71_0==36) ) {
                                alt71=1;
                            }
                            else if ( (LA71_0==16) ) {
                                alt71=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 71, 0, input);

                                throw nvae;
                            }
                            switch (alt71) {
                                case 1 :
                                    // InternalAlf.g:2472:8: (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) )
                                    {
                                    // InternalAlf.g:2472:8: (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) )
                                    // InternalAlf.g:2473:9: otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) )
                                    {
                                    otherlv_23=(Token)match(input,36,FOLLOW_39); 

                                    									newLeafNode(otherlv_23, grammarAccess.getNamedFeatureDefinitionAccess().getEqualsSignKeyword_1_1_1_0_1_0_0());
                                    								
                                    // InternalAlf.g:2477:9: ( (lv_value_24_0= ruleExpression ) )
                                    // InternalAlf.g:2478:10: (lv_value_24_0= ruleExpression )
                                    {
                                    // InternalAlf.g:2478:10: (lv_value_24_0= ruleExpression )
                                    // InternalAlf.g:2479:11: lv_value_24_0= ruleExpression
                                    {

                                    											newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_1_1_0_1_0_1_0());
                                    										
                                    pushFollow(FOLLOW_40);
                                    lv_value_24_0=ruleExpression();

                                    state._fsp--;


                                    											if (current==null) {
                                    												current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                    											}
                                    											set(
                                    												current,
                                    												"value",
                                    												lv_value_24_0,
                                    												"org.omg.sysml.Alf.Expression");
                                    											afterParserOrEnumRuleCall();
                                    										

                                    }


                                    }

                                    // InternalAlf.g:2496:9: (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) )
                                    int alt69=2;
                                    int LA69_0 = input.LA(1);

                                    if ( (LA69_0==19) ) {
                                        alt69=1;
                                    }
                                    else if ( (LA69_0==16) ) {
                                        alt69=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 69, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt69) {
                                        case 1 :
                                            // InternalAlf.g:2497:10: otherlv_25= ';'
                                            {
                                            otherlv_25=(Token)match(input,19,FOLLOW_2); 

                                            										newLeafNode(otherlv_25, grammarAccess.getNamedFeatureDefinitionAccess().getSemicolonKeyword_1_1_1_0_1_0_2_0());
                                            									

                                            }
                                            break;
                                        case 2 :
                                            // InternalAlf.g:2502:10: (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' )
                                            {
                                            // InternalAlf.g:2502:10: (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' )
                                            // InternalAlf.g:2503:11: otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}'
                                            {
                                            otherlv_26=(Token)match(input,16,FOLLOW_17); 

                                            											newLeafNode(otherlv_26, grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_1_1_0_1_0_2_1_0());
                                            										
                                            // InternalAlf.g:2507:11: ( (lv_ownedMembership_27_0= ruleClassMember ) )*
                                            loop68:
                                            do {
                                                int alt68=2;
                                                int LA68_0 = input.LA(1);

                                                if ( (LA68_0==RULE_DOCUMENTATION_COMMENT||(LA68_0>=RULE_ID && LA68_0<=RULE_UNRESTRICTED_NAME)||LA68_0==15||(LA68_0>=20 && LA68_0<=23)||(LA68_0>=26 && LA68_0<=28)||(LA68_0>=53 && LA68_0<=59)) ) {
                                                    alt68=1;
                                                }


                                                switch (alt68) {
                                            	case 1 :
                                            	    // InternalAlf.g:2508:12: (lv_ownedMembership_27_0= ruleClassMember )
                                            	    {
                                            	    // InternalAlf.g:2508:12: (lv_ownedMembership_27_0= ruleClassMember )
                                            	    // InternalAlf.g:2509:13: lv_ownedMembership_27_0= ruleClassMember
                                            	    {

                                            	    													newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_1_1_0_1_0_2_1_1_0());
                                            	    												
                                            	    pushFollow(FOLLOW_17);
                                            	    lv_ownedMembership_27_0=ruleClassMember();

                                            	    state._fsp--;


                                            	    													if (current==null) {
                                            	    														current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                            	    													}
                                            	    													add(
                                            	    														current,
                                            	    														"ownedMembership",
                                            	    														lv_ownedMembership_27_0,
                                            	    														"org.omg.sysml.Alf.ClassMember");
                                            	    													afterParserOrEnumRuleCall();
                                            	    												

                                            	    }


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop68;
                                                }
                                            } while (true);

                                            otherlv_28=(Token)match(input,17,FOLLOW_2); 

                                            											newLeafNode(otherlv_28, grammarAccess.getNamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_1_1_0_1_0_2_1_2());
                                            										

                                            }


                                            }
                                            break;

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:2534:8: (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' )
                                    {
                                    // InternalAlf.g:2534:8: (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' )
                                    // InternalAlf.g:2535:9: otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}'
                                    {
                                    otherlv_29=(Token)match(input,16,FOLLOW_17); 

                                    									newLeafNode(otherlv_29, grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_1_1_0_1_1_0());
                                    								
                                    // InternalAlf.g:2539:9: ( (lv_ownedMembership_30_0= ruleClassMember ) )*
                                    loop70:
                                    do {
                                        int alt70=2;
                                        int LA70_0 = input.LA(1);

                                        if ( (LA70_0==RULE_DOCUMENTATION_COMMENT||(LA70_0>=RULE_ID && LA70_0<=RULE_UNRESTRICTED_NAME)||LA70_0==15||(LA70_0>=20 && LA70_0<=23)||(LA70_0>=26 && LA70_0<=28)||(LA70_0>=53 && LA70_0<=59)) ) {
                                            alt70=1;
                                        }


                                        switch (alt70) {
                                    	case 1 :
                                    	    // InternalAlf.g:2540:10: (lv_ownedMembership_30_0= ruleClassMember )
                                    	    {
                                    	    // InternalAlf.g:2540:10: (lv_ownedMembership_30_0= ruleClassMember )
                                    	    // InternalAlf.g:2541:11: lv_ownedMembership_30_0= ruleClassMember
                                    	    {

                                    	    											newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_1_1_0_1_1_1_0());
                                    	    										
                                    	    pushFollow(FOLLOW_17);
                                    	    lv_ownedMembership_30_0=ruleClassMember();

                                    	    state._fsp--;


                                    	    											if (current==null) {
                                    	    												current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                    	    											}
                                    	    											add(
                                    	    												current,
                                    	    												"ownedMembership",
                                    	    												lv_ownedMembership_30_0,
                                    	    												"org.omg.sysml.Alf.ClassMember");
                                    	    											afterParserOrEnumRuleCall();
                                    	    										

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop70;
                                        }
                                    } while (true);

                                    otherlv_31=(Token)match(input,17,FOLLOW_2); 

                                    									newLeafNode(otherlv_31, grammarAccess.getNamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_1_1_0_1_1_2());
                                    								

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2566:6: (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' )
                            {
                            // InternalAlf.g:2566:6: (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' )
                            // InternalAlf.g:2567:7: otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';'
                            {
                            otherlv_32=(Token)match(input,33,FOLLOW_35); 

                            							newLeafNode(otherlv_32, grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_1_1_0());
                            						
                            // InternalAlf.g:2571:7: ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )?
                            int alt72=2;
                            int LA72_0 = input.LA(1);

                            if ( (LA72_0==RULE_NATURAL_VALUE) ) {
                                int LA72_1 = input.LA(2);

                                if ( (LA72_1==34) ) {
                                    alt72=1;
                                }
                            }
                            switch (alt72) {
                                case 1 :
                                    // InternalAlf.g:2572:8: ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..'
                                    {
                                    // InternalAlf.g:2572:8: ( (lv_lower_33_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:2573:9: (lv_lower_33_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:2573:9: (lv_lower_33_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:2574:10: lv_lower_33_0= ruleNaturalLiteralExpression
                                    {

                                    										newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_1_1_1_0_0());
                                    									
                                    pushFollow(FOLLOW_36);
                                    lv_lower_33_0=ruleNaturalLiteralExpression();

                                    state._fsp--;


                                    										if (current==null) {
                                    											current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                    										}
                                    										set(
                                    											current,
                                    											"lower",
                                    											lv_lower_33_0,
                                    											"org.omg.sysml.Alf.NaturalLiteralExpression");
                                    										afterParserOrEnumRuleCall();
                                    									

                                    }


                                    }

                                    otherlv_34=(Token)match(input,34,FOLLOW_35); 

                                    								newLeafNode(otherlv_34, grammarAccess.getNamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_1_1_1_1());
                                    							

                                    }
                                    break;

                            }

                            // InternalAlf.g:2596:7: ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:2597:8: (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:2597:8: (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:2598:9: lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression
                            {

                            									newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_1_1_2_0());
                            								
                            pushFollow(FOLLOW_37);
                            lv_upper_35_0=ruleUnlimitedNaturalLiteralExpression();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                            									}
                            									set(
                            										current,
                            										"upper",
                            										lv_upper_35_0,
                            										"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            otherlv_36=(Token)match(input,35,FOLLOW_10); 

                            							newLeafNode(otherlv_36, grammarAccess.getNamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_1_1_3());
                            						
                            otherlv_37=(Token)match(input,19,FOLLOW_2); 

                            							newLeafNode(otherlv_37, grammarAccess.getNamedFeatureDefinitionAccess().getSemicolonKeyword_1_1_1_1_4());
                            						

                            }


                            }
                            break;

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
    // $ANTLR end "ruleNamedFeatureDefinition"


    // $ANTLR start "entryRuleUnnamedFeatureDefinition"
    // InternalAlf.g:2631:1: entryRuleUnnamedFeatureDefinition returns [EObject current=null] : iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF ;
    public final EObject entryRuleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedFeatureDefinition = null;


        try {
            // InternalAlf.g:2631:65: (iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF )
            // InternalAlf.g:2632:2: iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF
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
    // InternalAlf.g:2638:1: ruleUnnamedFeatureDefinition returns [EObject current=null] : ( ( (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' ) ) ) ;
    public final EObject ruleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_ownedMembership_0_0 = null;

        EObject lv_lower_2_0 = null;

        EObject lv_upper_4_0 = null;

        EObject lv_value_7_0 = null;

        EObject lv_ownedMembership_10_0 = null;

        EObject lv_ownedMembership_13_0 = null;

        EObject lv_lower_16_0 = null;

        EObject lv_upper_18_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2644:2: ( ( ( (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' ) ) ) )
            // InternalAlf.g:2645:2: ( ( (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' ) ) )
            {
            // InternalAlf.g:2645:2: ( ( (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' ) ) )
            // InternalAlf.g:2646:3: ( (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' ) )
            {
            // InternalAlf.g:2646:3: ( (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset ) )
            // InternalAlf.g:2647:4: (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset )
            {
            // InternalAlf.g:2647:4: (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset )
            // InternalAlf.g:2648:5: lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset
            {

            					newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
            lv_ownedMembership_0_0=ruleOwnedRedefinitionOrSubset();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
            					}
            					add(
            						current,
            						"ownedMembership",
            						lv_ownedMembership_0_0,
            						"org.omg.sysml.Alf.OwnedRedefinitionOrSubset");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:2665:3: ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==33) ) {
                int LA82_1 = input.LA(2);

                if ( (LA82_1==RULE_NATURAL_VALUE) ) {
                    int LA82_3 = input.LA(3);

                    if ( (LA82_3==34) ) {
                        int LA82_5 = input.LA(4);

                        if ( (LA82_5==RULE_NATURAL_VALUE) ) {
                            int LA82_7 = input.LA(5);

                            if ( (LA82_7==35) ) {
                                int LA82_6 = input.LA(6);

                                if ( (LA82_6==16||LA82_6==36) ) {
                                    alt82=1;
                                }
                                else if ( (LA82_6==19) ) {
                                    alt82=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 82, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 82, 7, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA82_5==43) ) {
                            int LA82_4 = input.LA(5);

                            if ( (LA82_4==35) ) {
                                int LA82_6 = input.LA(6);

                                if ( (LA82_6==16||LA82_6==36) ) {
                                    alt82=1;
                                }
                                else if ( (LA82_6==19) ) {
                                    alt82=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 82, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 82, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 82, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA82_3==35) ) {
                        int LA82_6 = input.LA(4);

                        if ( (LA82_6==16||LA82_6==36) ) {
                            alt82=1;
                        }
                        else if ( (LA82_6==19) ) {
                            alt82=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 82, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA82_1==43) ) {
                    int LA82_4 = input.LA(3);

                    if ( (LA82_4==35) ) {
                        int LA82_6 = input.LA(4);

                        if ( (LA82_6==16||LA82_6==36) ) {
                            alt82=1;
                        }
                        else if ( (LA82_6==19) ) {
                            alt82=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 82, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA82_0==16||LA82_0==36) ) {
                alt82=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalAlf.g:2666:4: ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) )
                    {
                    // InternalAlf.g:2666:4: ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) )
                    // InternalAlf.g:2667:5: (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) )
                    {
                    // InternalAlf.g:2667:5: (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==33) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // InternalAlf.g:2668:6: otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']'
                            {
                            otherlv_1=(Token)match(input,33,FOLLOW_35); 

                            						newLeafNode(otherlv_1, grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_0_0_0());
                            					
                            // InternalAlf.g:2672:6: ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )?
                            int alt75=2;
                            int LA75_0 = input.LA(1);

                            if ( (LA75_0==RULE_NATURAL_VALUE) ) {
                                int LA75_1 = input.LA(2);

                                if ( (LA75_1==34) ) {
                                    alt75=1;
                                }
                            }
                            switch (alt75) {
                                case 1 :
                                    // InternalAlf.g:2673:7: ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..'
                                    {
                                    // InternalAlf.g:2673:7: ( (lv_lower_2_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:2674:8: (lv_lower_2_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:2674:8: (lv_lower_2_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:2675:9: lv_lower_2_0= ruleNaturalLiteralExpression
                                    {

                                    									newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_0_1_0_0());
                                    								
                                    pushFollow(FOLLOW_36);
                                    lv_lower_2_0=ruleNaturalLiteralExpression();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
                                    									}
                                    									set(
                                    										current,
                                    										"lower",
                                    										lv_lower_2_0,
                                    										"org.omg.sysml.Alf.NaturalLiteralExpression");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }

                                    otherlv_3=(Token)match(input,34,FOLLOW_35); 

                                    							newLeafNode(otherlv_3, grammarAccess.getUnnamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_0_0_1_1());
                                    						

                                    }
                                    break;

                            }

                            // InternalAlf.g:2697:6: ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:2698:7: (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:2698:7: (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:2699:8: lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression
                            {

                            								newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_0_0_2_0());
                            							
                            pushFollow(FOLLOW_37);
                            lv_upper_4_0=ruleUnlimitedNaturalLiteralExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
                            								}
                            								set(
                            									current,
                            									"upper",
                            									lv_upper_4_0,
                            									"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_5=(Token)match(input,35,FOLLOW_42); 

                            						newLeafNode(otherlv_5, grammarAccess.getUnnamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_0_0_3());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:2721:5: ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) )
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==36) ) {
                        alt80=1;
                    }
                    else if ( (LA80_0==16) ) {
                        alt80=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 80, 0, input);

                        throw nvae;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalAlf.g:2722:6: (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) )
                            {
                            // InternalAlf.g:2722:6: (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) )
                            // InternalAlf.g:2723:7: otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) )
                            {
                            otherlv_6=(Token)match(input,36,FOLLOW_39); 

                            							newLeafNode(otherlv_6, grammarAccess.getUnnamedFeatureDefinitionAccess().getEqualsSignKeyword_1_0_1_0_0());
                            						
                            // InternalAlf.g:2727:7: ( (lv_value_7_0= ruleExpression ) )
                            // InternalAlf.g:2728:8: (lv_value_7_0= ruleExpression )
                            {
                            // InternalAlf.g:2728:8: (lv_value_7_0= ruleExpression )
                            // InternalAlf.g:2729:9: lv_value_7_0= ruleExpression
                            {

                            									newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_0_1_0_1_0());
                            								
                            pushFollow(FOLLOW_40);
                            lv_value_7_0=ruleExpression();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
                            									}
                            									set(
                            										current,
                            										"value",
                            										lv_value_7_0,
                            										"org.omg.sysml.Alf.Expression");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            // InternalAlf.g:2746:7: (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) )
                            int alt78=2;
                            int LA78_0 = input.LA(1);

                            if ( (LA78_0==19) ) {
                                alt78=1;
                            }
                            else if ( (LA78_0==16) ) {
                                alt78=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 78, 0, input);

                                throw nvae;
                            }
                            switch (alt78) {
                                case 1 :
                                    // InternalAlf.g:2747:8: otherlv_8= ';'
                                    {
                                    otherlv_8=(Token)match(input,19,FOLLOW_2); 

                                    								newLeafNode(otherlv_8, grammarAccess.getUnnamedFeatureDefinitionAccess().getSemicolonKeyword_1_0_1_0_2_0());
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:2752:8: (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' )
                                    {
                                    // InternalAlf.g:2752:8: (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' )
                                    // InternalAlf.g:2753:9: otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}'
                                    {
                                    otherlv_9=(Token)match(input,16,FOLLOW_17); 

                                    									newLeafNode(otherlv_9, grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_1_0_2_1_0());
                                    								
                                    // InternalAlf.g:2757:9: ( (lv_ownedMembership_10_0= ruleClassMember ) )*
                                    loop77:
                                    do {
                                        int alt77=2;
                                        int LA77_0 = input.LA(1);

                                        if ( (LA77_0==RULE_DOCUMENTATION_COMMENT||(LA77_0>=RULE_ID && LA77_0<=RULE_UNRESTRICTED_NAME)||LA77_0==15||(LA77_0>=20 && LA77_0<=23)||(LA77_0>=26 && LA77_0<=28)||(LA77_0>=53 && LA77_0<=59)) ) {
                                            alt77=1;
                                        }


                                        switch (alt77) {
                                    	case 1 :
                                    	    // InternalAlf.g:2758:10: (lv_ownedMembership_10_0= ruleClassMember )
                                    	    {
                                    	    // InternalAlf.g:2758:10: (lv_ownedMembership_10_0= ruleClassMember )
                                    	    // InternalAlf.g:2759:11: lv_ownedMembership_10_0= ruleClassMember
                                    	    {

                                    	    											newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_0_1_0_2_1_1_0());
                                    	    										
                                    	    pushFollow(FOLLOW_17);
                                    	    lv_ownedMembership_10_0=ruleClassMember();

                                    	    state._fsp--;


                                    	    											if (current==null) {
                                    	    												current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
                                    	    											}
                                    	    											add(
                                    	    												current,
                                    	    												"ownedMembership",
                                    	    												lv_ownedMembership_10_0,
                                    	    												"org.omg.sysml.Alf.ClassMember");
                                    	    											afterParserOrEnumRuleCall();
                                    	    										

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop77;
                                        }
                                    } while (true);

                                    otherlv_11=(Token)match(input,17,FOLLOW_2); 

                                    									newLeafNode(otherlv_11, grammarAccess.getUnnamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_0_1_0_2_1_2());
                                    								

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2784:6: (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' )
                            {
                            // InternalAlf.g:2784:6: (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' )
                            // InternalAlf.g:2785:7: otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}'
                            {
                            otherlv_12=(Token)match(input,16,FOLLOW_17); 

                            							newLeafNode(otherlv_12, grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_1_1_0());
                            						
                            // InternalAlf.g:2789:7: ( (lv_ownedMembership_13_0= ruleClassMember ) )*
                            loop79:
                            do {
                                int alt79=2;
                                int LA79_0 = input.LA(1);

                                if ( (LA79_0==RULE_DOCUMENTATION_COMMENT||(LA79_0>=RULE_ID && LA79_0<=RULE_UNRESTRICTED_NAME)||LA79_0==15||(LA79_0>=20 && LA79_0<=23)||(LA79_0>=26 && LA79_0<=28)||(LA79_0>=53 && LA79_0<=59)) ) {
                                    alt79=1;
                                }


                                switch (alt79) {
                            	case 1 :
                            	    // InternalAlf.g:2790:8: (lv_ownedMembership_13_0= ruleClassMember )
                            	    {
                            	    // InternalAlf.g:2790:8: (lv_ownedMembership_13_0= ruleClassMember )
                            	    // InternalAlf.g:2791:9: lv_ownedMembership_13_0= ruleClassMember
                            	    {

                            	    									newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_0_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_17);
                            	    lv_ownedMembership_13_0=ruleClassMember();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"ownedMembership",
                            	    										lv_ownedMembership_13_0,
                            	    										"org.omg.sysml.Alf.ClassMember");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop79;
                                }
                            } while (true);

                            otherlv_14=(Token)match(input,17,FOLLOW_2); 

                            							newLeafNode(otherlv_14, grammarAccess.getUnnamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_0_1_1_2());
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2816:4: (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' )
                    {
                    // InternalAlf.g:2816:4: (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' )
                    // InternalAlf.g:2817:5: otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';'
                    {
                    otherlv_15=(Token)match(input,33,FOLLOW_35); 

                    					newLeafNode(otherlv_15, grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_0());
                    				
                    // InternalAlf.g:2821:5: ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==RULE_NATURAL_VALUE) ) {
                        int LA81_1 = input.LA(2);

                        if ( (LA81_1==34) ) {
                            alt81=1;
                        }
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalAlf.g:2822:6: ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..'
                            {
                            // InternalAlf.g:2822:6: ( (lv_lower_16_0= ruleNaturalLiteralExpression ) )
                            // InternalAlf.g:2823:7: (lv_lower_16_0= ruleNaturalLiteralExpression )
                            {
                            // InternalAlf.g:2823:7: (lv_lower_16_0= ruleNaturalLiteralExpression )
                            // InternalAlf.g:2824:8: lv_lower_16_0= ruleNaturalLiteralExpression
                            {

                            								newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_1_0_0());
                            							
                            pushFollow(FOLLOW_36);
                            lv_lower_16_0=ruleNaturalLiteralExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
                            								}
                            								set(
                            									current,
                            									"lower",
                            									lv_lower_16_0,
                            									"org.omg.sysml.Alf.NaturalLiteralExpression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_17=(Token)match(input,34,FOLLOW_35); 

                            						newLeafNode(otherlv_17, grammarAccess.getUnnamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_1_1());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:2846:5: ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) )
                    // InternalAlf.g:2847:6: (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression )
                    {
                    // InternalAlf.g:2847:6: (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression )
                    // InternalAlf.g:2848:7: lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression
                    {

                    							newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_37);
                    lv_upper_18_0=ruleUnlimitedNaturalLiteralExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
                    							}
                    							set(
                    								current,
                    								"upper",
                    								lv_upper_18_0,
                    								"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_19=(Token)match(input,35,FOLLOW_10); 

                    					newLeafNode(otherlv_19, grammarAccess.getUnnamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_3());
                    				
                    otherlv_20=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_20, grammarAccess.getUnnamedFeatureDefinitionAccess().getSemicolonKeyword_1_1_4());
                    				

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
    // $ANTLR end "ruleUnnamedFeatureDefinition"


    // $ANTLR start "entryRuleOwnedRedefinitionOrSubset"
    // InternalAlf.g:2879:1: entryRuleOwnedRedefinitionOrSubset returns [EObject current=null] : iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF ;
    public final EObject entryRuleOwnedRedefinitionOrSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedRedefinitionOrSubset = null;


        try {
            // InternalAlf.g:2879:66: (iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF )
            // InternalAlf.g:2880:2: iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF
            {
             newCompositeNode(grammarAccess.getOwnedRedefinitionOrSubsetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOwnedRedefinitionOrSubset=ruleOwnedRedefinitionOrSubset();

            state._fsp--;

             current =iv_ruleOwnedRedefinitionOrSubset; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOwnedRedefinitionOrSubset"


    // $ANTLR start "ruleOwnedRedefinitionOrSubset"
    // InternalAlf.g:2886:1: ruleOwnedRedefinitionOrSubset returns [EObject current=null] : ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) ) ;
    public final EObject ruleOwnedRedefinitionOrSubset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedMemberElement_2_0 = null;

        EObject lv_ownedMemberElement_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2892:2: ( ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) ) )
            // InternalAlf.g:2893:2: ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) )
            {
            // InternalAlf.g:2893:2: ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==18||LA84_0==37) ) {
                alt84=1;
            }
            else if ( (LA84_0==38) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalAlf.g:2894:3: ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) )
                    {
                    // InternalAlf.g:2894:3: ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) )
                    // InternalAlf.g:2895:4: (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) )
                    {
                    // InternalAlf.g:2895:4: (otherlv_0= 'is' | otherlv_1= 'redefines' )
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==18) ) {
                        alt83=1;
                    }
                    else if ( (LA83_0==37) ) {
                        alt83=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 0, input);

                        throw nvae;
                    }
                    switch (alt83) {
                        case 1 :
                            // InternalAlf.g:2896:5: otherlv_0= 'is'
                            {
                            otherlv_0=(Token)match(input,18,FOLLOW_4); 

                            					newLeafNode(otherlv_0, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getIsKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2901:5: otherlv_1= 'redefines'
                            {
                            otherlv_1=(Token)match(input,37,FOLLOW_4); 

                            					newLeafNode(otherlv_1, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getRedefinesKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:2906:4: ( (lv_ownedMemberElement_2_0= ruleRedefinition ) )
                    // InternalAlf.g:2907:5: (lv_ownedMemberElement_2_0= ruleRedefinition )
                    {
                    // InternalAlf.g:2907:5: (lv_ownedMemberElement_2_0= ruleRedefinition )
                    // InternalAlf.g:2908:6: lv_ownedMemberElement_2_0= ruleRedefinition
                    {

                    						newCompositeNode(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementRedefinitionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_2_0=ruleRedefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOwnedRedefinitionOrSubsetRule());
                    						}
                    						set(
                    							current,
                    							"ownedMemberElement",
                    							lv_ownedMemberElement_2_0,
                    							"org.omg.sysml.Alf.Redefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:2927:3: (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) )
                    {
                    // InternalAlf.g:2927:3: (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) )
                    // InternalAlf.g:2928:4: otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getSubsetsKeyword_1_0());
                    			
                    // InternalAlf.g:2932:4: ( (lv_ownedMemberElement_4_0= ruleSubset ) )
                    // InternalAlf.g:2933:5: (lv_ownedMemberElement_4_0= ruleSubset )
                    {
                    // InternalAlf.g:2933:5: (lv_ownedMemberElement_4_0= ruleSubset )
                    // InternalAlf.g:2934:6: lv_ownedMemberElement_4_0= ruleSubset
                    {

                    						newCompositeNode(grammarAccess.getOwnedRedefinitionOrSubsetAccess().getOwnedMemberElementSubsetParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_4_0=ruleSubset();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOwnedRedefinitionOrSubsetRule());
                    						}
                    						set(
                    							current,
                    							"ownedMemberElement",
                    							lv_ownedMemberElement_4_0,
                    							"org.omg.sysml.Alf.Subset");
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
    // $ANTLR end "ruleOwnedRedefinitionOrSubset"


    // $ANTLR start "entryRuleRedefinition"
    // InternalAlf.g:2956:1: entryRuleRedefinition returns [EObject current=null] : iv_ruleRedefinition= ruleRedefinition EOF ;
    public final EObject entryRuleRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefinition = null;


        try {
            // InternalAlf.g:2956:53: (iv_ruleRedefinition= ruleRedefinition EOF )
            // InternalAlf.g:2957:2: iv_ruleRedefinition= ruleRedefinition EOF
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
    // InternalAlf.g:2963:1: ruleRedefinition returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleRedefinition() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:2969:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2970:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2970:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2971:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:2971:3: ( ruleQualifiedName )
            // InternalAlf.g:2972:4: ruleQualifiedName
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
    // InternalAlf.g:2989:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalAlf.g:2989:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalAlf.g:2990:2: iv_ruleSubset= ruleSubset EOF
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
    // InternalAlf.g:2996:1: ruleSubset returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubset() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:3002:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:3003:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:3003:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3004:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:3004:3: ( ruleQualifiedName )
            // InternalAlf.g:3005:4: ruleQualifiedName
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
    // InternalAlf.g:3022:1: entryRuleConnectorDefinition returns [EObject current=null] : iv_ruleConnectorDefinition= ruleConnectorDefinition EOF ;
    public final EObject entryRuleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorDefinition = null;


        try {
            // InternalAlf.g:3022:60: (iv_ruleConnectorDefinition= ruleConnectorDefinition EOF )
            // InternalAlf.g:3023:2: iv_ruleConnectorDefinition= ruleConnectorDefinition EOF
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
    // InternalAlf.g:3029:1: ruleConnectorDefinition returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) ;
    public final EObject ruleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3035:2: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) )
            // InternalAlf.g:3036:2: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
            {
            // InternalAlf.g:3036:2: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
            // InternalAlf.g:3037:3: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';'
            {
            // InternalAlf.g:3037:3: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )?
            int alt87=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA87_1 = input.LA(2);

                    if ( (LA87_1==18||LA87_1==30) ) {
                        alt87=1;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA87_2 = input.LA(2);

                    if ( (LA87_2==18||LA87_2==30) ) {
                        alt87=1;
                    }
                    }
                    break;
                case 18:
                case 30:
                    {
                    alt87=1;
                    }
                    break;
            }

            switch (alt87) {
                case 1 :
                    // InternalAlf.g:3038:4: ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is'
                    {
                    // InternalAlf.g:3038:4: ( (lv_name_0_0= ruleName ) )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( ((LA85_0>=RULE_ID && LA85_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // InternalAlf.g:3039:5: (lv_name_0_0= ruleName )
                            {
                            // InternalAlf.g:3039:5: (lv_name_0_0= ruleName )
                            // InternalAlf.g:3040:6: lv_name_0_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_0_0_0());
                            					
                            pushFollow(FOLLOW_43);
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

                    // InternalAlf.g:3057:4: (otherlv_1= ':' ( ( ruleQualifiedName ) ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==30) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // InternalAlf.g:3058:5: otherlv_1= ':' ( ( ruleQualifiedName ) )
                            {
                            otherlv_1=(Token)match(input,30,FOLLOW_4); 

                            					newLeafNode(otherlv_1, grammarAccess.getConnectorDefinitionAccess().getColonKeyword_0_1_0());
                            				
                            // InternalAlf.g:3062:5: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:3063:6: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:3063:6: ( ruleQualifiedName )
                            // InternalAlf.g:3064:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConnectorDefinitionRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getAssociationAssociationCrossReference_0_1_1_0());
                            						
                            pushFollow(FOLLOW_9);
                            ruleQualifiedName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getConnectorDefinitionAccess().getIsKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalAlf.g:3084:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3085:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:3085:4: ( ruleQualifiedName )
            // InternalAlf.g:3086:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getSourceFeatureFeatureCrossReference_1_0());
            				
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectorDefinitionAccess().getEqualsSignGreaterThanSignKeyword_2());
            		
            // InternalAlf.g:3104:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3105:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:3105:4: ( ruleQualifiedName )
            // InternalAlf.g:3106:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getTargetFeatureFeatureCrossReference_3_0());
            				
            pushFollow(FOLLOW_10);
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
    // InternalAlf.g:3128:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAlf.g:3128:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAlf.g:3129:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAlf.g:3135:1: ruleExpression returns [EObject current=null] : this_BinaryExpression_0= ruleBinaryExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3141:2: (this_BinaryExpression_0= ruleBinaryExpression )
            // InternalAlf.g:3142:2: this_BinaryExpression_0= ruleBinaryExpression
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
    // InternalAlf.g:3153:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalAlf.g:3153:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalAlf.g:3154:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalAlf.g:3160:1: ruleBinaryExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) ;
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
            // InternalAlf.g:3166:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) )
            // InternalAlf.g:3167:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            {
            // InternalAlf.g:3167:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            // InternalAlf.g:3168:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            {

            			newCompositeNode(grammarAccess.getBinaryExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3176:3: ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( ((LA89_0>=40 && LA89_0<=45)) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalAlf.g:3177:4: () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    {
                    // InternalAlf.g:3177:4: ()
                    // InternalAlf.g:3178:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:3184:4: ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( ((LA88_0>=41 && LA88_0<=45)) ) {
                        alt88=1;
                    }
                    else if ( (LA88_0==40) ) {
                        alt88=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 88, 0, input);

                        throw nvae;
                    }
                    switch (alt88) {
                        case 1 :
                            // InternalAlf.g:3185:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            {
                            // InternalAlf.g:3185:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            // InternalAlf.g:3186:6: ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) )
                            {
                            // InternalAlf.g:3186:6: ( (lv_operator_2_0= ruleBinaryOperator ) )
                            // InternalAlf.g:3187:7: (lv_operator_2_0= ruleBinaryOperator )
                            {
                            // InternalAlf.g:3187:7: (lv_operator_2_0= ruleBinaryOperator )
                            // InternalAlf.g:3188:8: lv_operator_2_0= ruleBinaryOperator
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorParserRuleCall_1_1_0_0_0());
                            							
                            pushFollow(FOLLOW_39);
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

                            // InternalAlf.g:3205:6: ( (lv_operand_3_0= ruleExpression ) )
                            // InternalAlf.g:3206:7: (lv_operand_3_0= ruleExpression )
                            {
                            // InternalAlf.g:3206:7: (lv_operand_3_0= ruleExpression )
                            // InternalAlf.g:3207:8: lv_operand_3_0= ruleExpression
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
                            // InternalAlf.g:3226:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            {
                            // InternalAlf.g:3226:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            // InternalAlf.g:3227:6: ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']'
                            {
                            // InternalAlf.g:3227:6: ( (lv_operator_4_0= '@' ) )
                            // InternalAlf.g:3228:7: (lv_operator_4_0= '@' )
                            {
                            // InternalAlf.g:3228:7: (lv_operator_4_0= '@' )
                            // InternalAlf.g:3229:8: lv_operator_4_0= '@'
                            {
                            lv_operator_4_0=(Token)match(input,40,FOLLOW_46); 

                            								newLeafNode(lv_operator_4_0, grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getBinaryExpressionRule());
                            								}
                            								setWithLastConsumed(current, "operator", lv_operator_4_0, "@");
                            							

                            }


                            }

                            otherlv_5=(Token)match(input,33,FOLLOW_39); 

                            						newLeafNode(otherlv_5, grammarAccess.getBinaryExpressionAccess().getLeftSquareBracketKeyword_1_1_1_1());
                            					
                            // InternalAlf.g:3245:6: ( (lv_operand_6_0= ruleExpression ) )
                            // InternalAlf.g:3246:7: (lv_operand_6_0= ruleExpression )
                            {
                            // InternalAlf.g:3246:7: (lv_operand_6_0= ruleExpression )
                            // InternalAlf.g:3247:8: lv_operand_6_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperandExpressionParserRuleCall_1_1_1_2_0());
                            							
                            pushFollow(FOLLOW_37);
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

                            otherlv_7=(Token)match(input,35,FOLLOW_2); 

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
    // InternalAlf.g:3275:1: entryRuleBinaryOperator returns [String current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final String entryRuleBinaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperator = null;


        try {
            // InternalAlf.g:3275:54: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // InternalAlf.g:3276:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
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
    // InternalAlf.g:3282:1: ruleBinaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:3288:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) )
            // InternalAlf.g:3289:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            {
            // InternalAlf.g:3289:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            int alt90=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt90=1;
                }
                break;
            case 42:
                {
                alt90=2;
                }
                break;
            case 43:
                {
                alt90=3;
                }
                break;
            case 44:
                {
                alt90=4;
                }
                break;
            case 45:
                {
                alt90=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalAlf.g:3290:3: kw= '+'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3296:3: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:3302:3: kw= '*'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:3308:3: kw= '/'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:3314:3: kw= '^'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

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
    // InternalAlf.g:3323:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlf.g:3323:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlf.g:3324:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalAlf.g:3330:1: ruleUnaryExpression returns [EObject current=null] : (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceAccessExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3336:2: ( (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) )
            // InternalAlf.g:3337:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            {
            // InternalAlf.g:3337:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( ((LA91_0>=RULE_BOOLEAN_VALUE && LA91_0<=RULE_UNRESTRICTED_NAME)||LA91_0==16||LA91_0==43||LA91_0==46||(LA91_0>=48 && LA91_0<=49)) ) {
                alt91=1;
            }
            else if ( ((LA91_0>=41 && LA91_0<=42)) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // InternalAlf.g:3338:3: this_SequenceAccessExpression_0= ruleSequenceAccessExpression
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
                    // InternalAlf.g:3347:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    {
                    // InternalAlf.g:3347:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    // InternalAlf.g:3348:4: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    {
                    // InternalAlf.g:3348:4: ()
                    // InternalAlf.g:3349:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:3355:4: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // InternalAlf.g:3356:5: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // InternalAlf.g:3356:5: (lv_operator_2_0= ruleUnaryOperator )
                    // InternalAlf.g:3357:6: lv_operator_2_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_47);
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

                    // InternalAlf.g:3374:4: ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    // InternalAlf.g:3375:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    {
                    // InternalAlf.g:3375:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    // InternalAlf.g:3376:6: lv_operand_3_0= ruleSequenceAccessExpression
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
    // InternalAlf.g:3398:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalAlf.g:3398:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalAlf.g:3399:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalAlf.g:3405:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:3411:2: ( (kw= '+' | kw= '-' ) )
            // InternalAlf.g:3412:2: (kw= '+' | kw= '-' )
            {
            // InternalAlf.g:3412:2: (kw= '+' | kw= '-' )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==41) ) {
                alt92=1;
            }
            else if ( (LA92_0==42) ) {
                alt92=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // InternalAlf.g:3413:3: kw= '+'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3419:3: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

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
    // InternalAlf.g:3428:1: entryRuleSequenceAccessExpression returns [EObject current=null] : iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF ;
    public final EObject entryRuleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceAccessExpression = null;


        try {
            // InternalAlf.g:3428:65: (iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF )
            // InternalAlf.g:3429:2: iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF
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
    // InternalAlf.g:3435:1: ruleSequenceAccessExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) ;
    public final EObject ruleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_index_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3441:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) )
            // InternalAlf.g:3442:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            {
            // InternalAlf.g:3442:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            // InternalAlf.g:3443:3: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            {

            			newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3451:3: ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==33) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalAlf.g:3452:4: () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    // InternalAlf.g:3452:4: ()
            	    // InternalAlf.g:3453:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSequenceAccessExpressionAccess().getSequenceAccessExpressionPrimaryAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_39); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSequenceAccessExpressionAccess().getLeftSquareBracketKeyword_1_1());
            	    			
            	    // InternalAlf.g:3463:4: ( (lv_index_3_0= ruleExpression ) )
            	    // InternalAlf.g:3464:5: (lv_index_3_0= ruleExpression )
            	    {
            	    // InternalAlf.g:3464:5: (lv_index_3_0= ruleExpression )
            	    // InternalAlf.g:3465:6: lv_index_3_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getIndexExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
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

            	    otherlv_4=(Token)match(input,35,FOLLOW_48); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSequenceAccessExpressionAccess().getRightSquareBracketKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop93;
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
    // InternalAlf.g:3491:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalAlf.g:3491:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalAlf.g:3492:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalAlf.g:3498:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
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
            // InternalAlf.g:3504:2: ( (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // InternalAlf.g:3505:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // InternalAlf.g:3505:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt94=5;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // InternalAlf.g:3506:3: this_LiteralExpression_0= ruleLiteralExpression
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
                    // InternalAlf.g:3515:3: this_ElementReferenceExpression_1= ruleElementReferenceExpression
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
                    // InternalAlf.g:3524:3: this_InstanceCreationExpression_2= ruleInstanceCreationExpression
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
                    // InternalAlf.g:3533:3: this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression
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
                    // InternalAlf.g:3542:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // InternalAlf.g:3542:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // InternalAlf.g:3543:4: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_39); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_49);
                    this_Expression_5=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_5;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_6=(Token)match(input,47,FOLLOW_2); 

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
    // InternalAlf.g:3564:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // InternalAlf.g:3564:67: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // InternalAlf.g:3565:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
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
    // InternalAlf.g:3571:1: ruleElementReferenceExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleElementReferenceExpression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:3577:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:3578:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:3578:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3579:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:3579:3: ( ruleQualifiedName )
            // InternalAlf.g:3580:4: ruleQualifiedName
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
    // InternalAlf.g:3597:1: entryRuleInstanceCreationExpression returns [EObject current=null] : iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF ;
    public final EObject entryRuleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceCreationExpression = null;


        try {
            // InternalAlf.g:3597:67: (iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF )
            // InternalAlf.g:3598:2: iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF
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
    // InternalAlf.g:3604:1: ruleInstanceCreationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_argument_2_0 = null;

        EObject lv_argument_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3610:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalAlf.g:3611:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalAlf.g:3611:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalAlf.g:3612:3: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalAlf.g:3612:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3613:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:3613:4: ( ruleQualifiedName )
            // InternalAlf.g:3614:5: ruleQualifiedName
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

            otherlv_1=(Token)match(input,46,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getInstanceCreationExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlf.g:3632:3: ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( ((LA96_0>=RULE_BOOLEAN_VALUE && LA96_0<=RULE_UNRESTRICTED_NAME)||LA96_0==16||(LA96_0>=41 && LA96_0<=43)||LA96_0==46||(LA96_0>=48 && LA96_0<=49)) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalAlf.g:3633:4: ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:3633:4: ( (lv_argument_2_0= ruleExpression ) )
                    // InternalAlf.g:3634:5: (lv_argument_2_0= ruleExpression )
                    {
                    // InternalAlf.g:3634:5: (lv_argument_2_0= ruleExpression )
                    // InternalAlf.g:3635:6: lv_argument_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_52);
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

                    // InternalAlf.g:3652:4: (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==25) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalAlf.g:3653:5: otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_39); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getInstanceCreationExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:3657:5: ( (lv_argument_4_0= ruleExpression ) )
                    	    // InternalAlf.g:3658:6: (lv_argument_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:3658:6: (lv_argument_4_0= ruleExpression )
                    	    // InternalAlf.g:3659:7: lv_argument_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_52);
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
                    	    break loop95;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,47,FOLLOW_2); 

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
    // InternalAlf.g:3686:1: entryRuleSequenceConstructionExpression returns [EObject current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
    public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionExpression = null;


        try {
            // InternalAlf.g:3686:71: (iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:3687:2: iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF
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
    // InternalAlf.g:3693:1: ruleSequenceConstructionExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3699:2: ( ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalAlf.g:3700:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalAlf.g:3700:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // InternalAlf.g:3701:3: () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalAlf.g:3701:3: ()
            // InternalAlf.g:3702:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:3712:3: ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( ((LA98_0>=RULE_BOOLEAN_VALUE && LA98_0<=RULE_UNRESTRICTED_NAME)||LA98_0==16||(LA98_0>=41 && LA98_0<=43)||LA98_0==46||(LA98_0>=48 && LA98_0<=49)) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalAlf.g:3713:4: ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:3713:4: ( (lv_element_2_0= ruleExpression ) )
                    // InternalAlf.g:3714:5: (lv_element_2_0= ruleExpression )
                    {
                    // InternalAlf.g:3714:5: (lv_element_2_0= ruleExpression )
                    // InternalAlf.g:3715:6: lv_element_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_54);
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

                    // InternalAlf.g:3732:4: (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==25) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalAlf.g:3733:5: otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_39); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:3737:5: ( (lv_element_4_0= ruleExpression ) )
                    	    // InternalAlf.g:3738:6: (lv_element_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:3738:6: (lv_element_4_0= ruleExpression )
                    	    // InternalAlf.g:3739:7: lv_element_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_54);
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
                    	    break loop97;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAlf.g:3766:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalAlf.g:3766:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalAlf.g:3767:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalAlf.g:3773:1: ruleLiteralExpression returns [EObject current=null] : (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteralExpression_0 = null;

        EObject this_BooleanLiteralExpression_1 = null;

        EObject this_StringLiteralExpression_2 = null;

        EObject this_RealLiteralExpression_3 = null;

        EObject this_UnlimitedNaturalLiteralExpression_4 = null;



        	enterRule();

        try {
            // InternalAlf.g:3779:2: ( (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:3780:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:3780:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            int alt99=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt99=1;
                }
                break;
            case RULE_BOOLEAN_VALUE:
                {
                alt99=2;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt99=3;
                }
                break;
            case RULE_NATURAL_VALUE:
                {
                int LA99_4 = input.LA(2);

                if ( (LA99_4==EOF||(LA99_4>=16 && LA99_4<=17)||LA99_4==19||LA99_4==25||LA99_4==33||LA99_4==35||(LA99_4>=40 && LA99_4<=45)||LA99_4==47) ) {
                    alt99=5;
                }
                else if ( (LA99_4==49) ) {
                    alt99=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 99, 4, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                alt99=4;
                }
                break;
            case 43:
                {
                alt99=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // InternalAlf.g:3781:3: this_NullLiteralExpression_0= ruleNullLiteralExpression
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
                    // InternalAlf.g:3790:3: this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression
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
                    // InternalAlf.g:3799:3: this_StringLiteralExpression_2= ruleStringLiteralExpression
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
                    // InternalAlf.g:3808:3: this_RealLiteralExpression_3= ruleRealLiteralExpression
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
                    // InternalAlf.g:3817:3: this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:3829:1: entryRuleNullLiteralExpression returns [EObject current=null] : iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF ;
    public final EObject entryRuleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpression = null;


        try {
            // InternalAlf.g:3829:62: (iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF )
            // InternalAlf.g:3830:2: iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF
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
    // InternalAlf.g:3836:1: ruleNullLiteralExpression returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlf.g:3842:2: ( ( () otherlv_1= 'null' ) )
            // InternalAlf.g:3843:2: ( () otherlv_1= 'null' )
            {
            // InternalAlf.g:3843:2: ( () otherlv_1= 'null' )
            // InternalAlf.g:3844:3: () otherlv_1= 'null'
            {
            // InternalAlf.g:3844:3: ()
            // InternalAlf.g:3845:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNullLiteralExpressionAccess().getLiteralNullAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_2); 

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
    // InternalAlf.g:3859:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // InternalAlf.g:3859:65: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:3860:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
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
    // InternalAlf.g:3866:1: ruleBooleanLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:3872:2: ( ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) )
            // InternalAlf.g:3873:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            {
            // InternalAlf.g:3873:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:3874:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:3874:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            // InternalAlf.g:3875:4: lv_value_0_0= RULE_BOOLEAN_VALUE
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
    // InternalAlf.g:3894:1: entryRuleStringLiteralExpression returns [EObject current=null] : iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF ;
    public final EObject entryRuleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpression = null;


        try {
            // InternalAlf.g:3894:64: (iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF )
            // InternalAlf.g:3895:2: iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF
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
    // InternalAlf.g:3901:1: ruleStringLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:3907:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalAlf.g:3908:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalAlf.g:3908:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalAlf.g:3909:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalAlf.g:3909:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalAlf.g:3910:4: lv_value_0_0= RULE_STRING_VALUE
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
    // InternalAlf.g:3929:1: entryRuleRealLiteralExpression returns [EObject current=null] : iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF ;
    public final EObject entryRuleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteralExpression = null;


        try {
            // InternalAlf.g:3929:62: (iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF )
            // InternalAlf.g:3930:2: iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF
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
    // InternalAlf.g:3936:1: ruleRealLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3942:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalAlf.g:3943:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalAlf.g:3943:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalAlf.g:3944:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalAlf.g:3944:3: (lv_value_0_0= ruleRealValue )
            // InternalAlf.g:3945:4: lv_value_0_0= ruleRealValue
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
    // InternalAlf.g:3965:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalAlf.g:3965:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalAlf.g:3966:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalAlf.g:3972:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_VALUE_0=null;
        Token kw=null;
        Token this_NATURAL_VALUE_2=null;
        Token this_NATURAL_VALUE_4=null;
        Token this_NATURAL_VALUE_9=null;


        	enterRule();

        try {
            // InternalAlf.g:3978:2: ( ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) )
            // InternalAlf.g:3979:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            {
            // InternalAlf.g:3979:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            // InternalAlf.g:3980:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            {
            // InternalAlf.g:3980:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_NATURAL_VALUE) ) {
                alt101=1;
            }
            else if ( (LA101_0==49) ) {
                alt101=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // InternalAlf.g:3981:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    {
                    // InternalAlf.g:3981:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    // InternalAlf.g:3982:5: this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    {
                    this_NATURAL_VALUE_0=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_55); 

                    					current.merge(this_NATURAL_VALUE_0);
                    				

                    					newLeafNode(this_NATURAL_VALUE_0, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_0());
                    				
                    kw=(Token)match(input,49,FOLLOW_56); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_0_1());
                    				
                    // InternalAlf.g:3994:5: (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==RULE_NATURAL_VALUE) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // InternalAlf.g:3995:6: this_NATURAL_VALUE_2= RULE_NATURAL_VALUE
                            {
                            this_NATURAL_VALUE_2=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_57); 

                            						current.merge(this_NATURAL_VALUE_2);
                            					

                            						newLeafNode(this_NATURAL_VALUE_2, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_2());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:4005:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    {
                    // InternalAlf.g:4005:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    // InternalAlf.g:4006:5: kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE
                    {
                    kw=(Token)match(input,49,FOLLOW_58); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1_0());
                    				
                    this_NATURAL_VALUE_4=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_57); 

                    					current.merge(this_NATURAL_VALUE_4);
                    				

                    					newLeafNode(this_NATURAL_VALUE_4, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:4020:3: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( ((LA104_0>=50 && LA104_0<=51)) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalAlf.g:4021:4: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE
                    {
                    // InternalAlf.g:4021:4: (kw= 'e' | kw= 'E' )
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==50) ) {
                        alt102=1;
                    }
                    else if ( (LA102_0==51) ) {
                        alt102=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 102, 0, input);

                        throw nvae;
                    }
                    switch (alt102) {
                        case 1 :
                            // InternalAlf.g:4022:5: kw= 'e'
                            {
                            kw=(Token)match(input,50,FOLLOW_59); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:4028:5: kw= 'E'
                            {
                            kw=(Token)match(input,51,FOLLOW_59); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:4034:4: (kw= '+' | kw= '-' )?
                    int alt103=3;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==41) ) {
                        alt103=1;
                    }
                    else if ( (LA103_0==42) ) {
                        alt103=2;
                    }
                    switch (alt103) {
                        case 1 :
                            // InternalAlf.g:4035:5: kw= '+'
                            {
                            kw=(Token)match(input,41,FOLLOW_58); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:4041:5: kw= '-'
                            {
                            kw=(Token)match(input,42,FOLLOW_58); 

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
    // InternalAlf.g:4059:1: entryRuleNaturalLiteralExpression returns [EObject current=null] : iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF ;
    public final EObject entryRuleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:4059:65: (iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:4060:2: iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF
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
    // InternalAlf.g:4066:1: ruleNaturalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) ;
    public final EObject ruleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:4072:2: ( ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) )
            // InternalAlf.g:4073:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            {
            // InternalAlf.g:4073:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            // InternalAlf.g:4074:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:4074:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            // InternalAlf.g:4075:4: lv_value_0_0= RULE_NATURAL_VALUE
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
    // InternalAlf.g:4094:1: entryRuleUnlimitedNaturalLiteralExpression returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:4094:74: (iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:4095:2: iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF
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
    // InternalAlf.g:4101:1: ruleUnlimitedNaturalLiteralExpression returns [EObject current=null] : (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NaturalLiteralExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4107:2: ( (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) )
            // InternalAlf.g:4108:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            {
            // InternalAlf.g:4108:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==RULE_NATURAL_VALUE) ) {
                alt105=1;
            }
            else if ( (LA105_0==43) ) {
                alt105=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // InternalAlf.g:4109:3: this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression
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
                    // InternalAlf.g:4118:3: ( () otherlv_2= '*' )
                    {
                    // InternalAlf.g:4118:3: ( () otherlv_2= '*' )
                    // InternalAlf.g:4119:4: () otherlv_2= '*'
                    {
                    // InternalAlf.g:4119:4: ()
                    // InternalAlf.g:4120:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnlimitedNaturalLiteralExpressionAccess().getLiteralUnboundedAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,43,FOLLOW_2); 

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
    // InternalAlf.g:4135:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAlf.g:4135:44: (iv_ruleName= ruleName EOF )
            // InternalAlf.g:4136:2: iv_ruleName= ruleName EOF
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
    // InternalAlf.g:4142:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalAlf.g:4148:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalAlf.g:4149:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalAlf.g:4149:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==RULE_ID) ) {
                alt106=1;
            }
            else if ( (LA106_0==RULE_UNRESTRICTED_NAME) ) {
                alt106=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalAlf.g:4150:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:4158:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:4169:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlf.g:4169:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlf.g:4170:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlf.g:4176:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ColonQualifiedName_0= ruleColonQualifiedName | this_DotQualifiedName_1= ruleDotQualifiedName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ColonQualifiedName_0 = null;

        AntlrDatatypeRuleToken this_DotQualifiedName_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:4182:2: ( (this_ColonQualifiedName_0= ruleColonQualifiedName | this_DotQualifiedName_1= ruleDotQualifiedName ) )
            // InternalAlf.g:4183:2: (this_ColonQualifiedName_0= ruleColonQualifiedName | this_DotQualifiedName_1= ruleDotQualifiedName )
            {
            // InternalAlf.g:4183:2: (this_ColonQualifiedName_0= ruleColonQualifiedName | this_DotQualifiedName_1= ruleDotQualifiedName )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==RULE_ID) ) {
                int LA107_1 = input.LA(2);

                if ( (LA107_1==49) ) {
                    alt107=2;
                }
                else if ( (LA107_1==EOF||(LA107_1>=16 && LA107_1<=19)||LA107_1==25||LA107_1==33||(LA107_1>=35 && LA107_1<=47)||LA107_1==52) ) {
                    alt107=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 107, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA107_0==RULE_UNRESTRICTED_NAME) ) {
                int LA107_2 = input.LA(2);

                if ( (LA107_2==49) ) {
                    alt107=2;
                }
                else if ( (LA107_2==EOF||(LA107_2>=16 && LA107_2<=19)||LA107_2==25||LA107_2==33||(LA107_2>=35 && LA107_2<=47)||LA107_2==52) ) {
                    alt107=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 107, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // InternalAlf.g:4184:3: this_ColonQualifiedName_0= ruleColonQualifiedName
                    {

                    			newCompositeNode(grammarAccess.getQualifiedNameAccess().getColonQualifiedNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColonQualifiedName_0=ruleColonQualifiedName();

                    state._fsp--;


                    			current.merge(this_ColonQualifiedName_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:4195:3: this_DotQualifiedName_1= ruleDotQualifiedName
                    {

                    			newCompositeNode(grammarAccess.getQualifiedNameAccess().getDotQualifiedNameParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DotQualifiedName_1=ruleDotQualifiedName();

                    state._fsp--;


                    			current.merge(this_DotQualifiedName_1);
                    		

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
    // InternalAlf.g:4209:1: entryRuleColonQualifiedName returns [String current=null] : iv_ruleColonQualifiedName= ruleColonQualifiedName EOF ;
    public final String entryRuleColonQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColonQualifiedName = null;


        try {
            // InternalAlf.g:4209:58: (iv_ruleColonQualifiedName= ruleColonQualifiedName EOF )
            // InternalAlf.g:4210:2: iv_ruleColonQualifiedName= ruleColonQualifiedName EOF
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
    // InternalAlf.g:4216:1: ruleColonQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleColonQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4222:2: ( (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* ) )
            // InternalAlf.g:4223:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* )
            {
            // InternalAlf.g:4223:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )* )
            // InternalAlf.g:4224:3: this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )*
            {

            			newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_60);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:4234:3: (kw= '::' this_Name_2= ruleName )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==52) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // InternalAlf.g:4235:4: kw= '::' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,52,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getColonQualifiedNameAccess().getColonColonKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_60);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

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
    // $ANTLR end "ruleColonQualifiedName"


    // $ANTLR start "entryRuleDotQualifiedName"
    // InternalAlf.g:4255:1: entryRuleDotQualifiedName returns [String current=null] : iv_ruleDotQualifiedName= ruleDotQualifiedName EOF ;
    public final String entryRuleDotQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDotQualifiedName = null;


        try {
            // InternalAlf.g:4255:56: (iv_ruleDotQualifiedName= ruleDotQualifiedName EOF )
            // InternalAlf.g:4256:2: iv_ruleDotQualifiedName= ruleDotQualifiedName EOF
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
    // InternalAlf.g:4262:1: ruleDotQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleDotQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:4268:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:4269:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:4269:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            // InternalAlf.g:4270:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_55);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:4280:3: (kw= '.' this_Name_2= ruleName )+
            int cnt109=0;
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==49) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // InternalAlf.g:4281:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,49,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getDotQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_61);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt109 >= 1 ) break loop109;
                        EarlyExitException eee =
                            new EarlyExitException(109, input);
                        throw eee;
                }
                cnt109++;
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


    // $ANTLR start "ruleVisibilityIndicator"
    // InternalAlf.g:4301:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAlf.g:4307:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) )
            // InternalAlf.g:4308:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            {
            // InternalAlf.g:4308:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            int alt110=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt110=1;
                }
                break;
            case 54:
                {
                alt110=2;
                }
                break;
            case 55:
                {
                alt110=3;
                }
                break;
            case 56:
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
                    // InternalAlf.g:4309:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:4309:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:4310:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:4317:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:4317:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:4318:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:4325:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalAlf.g:4325:3: (enumLiteral_2= 'protected' )
                    // InternalAlf.g:4326:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:4333:3: (enumLiteral_3= 'packaged' )
                    {
                    // InternalAlf.g:4333:3: (enumLiteral_3= 'packaged' )
                    // InternalAlf.g:4334:4: enumLiteral_3= 'packaged'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_2); 

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
    // InternalAlf.g:4344:1: ruleFeatureDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFeatureDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAlf.g:4350:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalAlf.g:4351:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalAlf.g:4351:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt111=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt111=1;
                }
                break;
            case 58:
                {
                alt111=2;
                }
                break;
            case 59:
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
                    // InternalAlf.g:4352:3: (enumLiteral_0= 'in' )
                    {
                    // InternalAlf.g:4352:3: (enumLiteral_0= 'in' )
                    // InternalAlf.g:4353:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:4360:3: (enumLiteral_1= 'out' )
                    {
                    // InternalAlf.g:4360:3: (enumLiteral_1= 'out' )
                    // InternalAlf.g:4361:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:4368:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalAlf.g:4368:3: (enumLiteral_2= 'inout' )
                    // InternalAlf.g:4369:4: enumLiteral_2= 'inout'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

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


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA94 dfa94 = new DFA94(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\2\4\4\10\2\uffff";
    static final String dfa_3s = "\2\70\4\27\2\uffff";
    static final String dfa_4s = "\6\uffff\1\1\1\2";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\3\uffff\2\7\5\uffff\1\6\4\uffff\2\6\1\7\1\6\35\uffff\1\2\1\3\1\4\1\5",
            "\1\1\3\uffff\2\7\5\uffff\1\6\4\uffff\2\6\1\7\1\6\35\uffff\1\2\1\3\1\4\1\5",
            "\2\7\5\uffff\1\6\4\uffff\2\6\1\7\1\6",
            "\2\7\5\uffff\1\6\4\uffff\2\6\1\7\1\6",
            "\2\7\5\uffff\1\6\4\uffff\2\6\1\7\1\6",
            "\2\7\5\uffff\1\6\4\uffff\2\6\1\7\1\6",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "382:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_PackagedFeatureMember_1= rulePackagedFeatureMember )";
        }
    }
    static final String dfa_7s = "\36\uffff";
    static final String dfa_8s = "\1\17\1\10\1\uffff\2\10\2\20\1\uffff\4\20\2\10\4\20\4\10\10\20";
    static final String dfa_9s = "\1\27\1\22\1\uffff\4\22\1\uffff\4\30\2\11\4\64\4\11\2\61\2\64\2\61\2\64";
    static final String dfa_10s = "\2\uffff\1\1\4\uffff\1\2\26\uffff";
    static final String dfa_11s = "\36\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\4\uffff\1\3\1\4\1\uffff\1\2",
            "\1\5\1\6\10\uffff\1\7",
            "",
            "\1\10\1\11\10\uffff\1\7",
            "\1\12\1\13\10\uffff\1\7",
            "\1\2\1\uffff\1\7",
            "\1\2\1\uffff\1\7",
            "",
            "\1\2\1\uffff\1\14\5\uffff\1\2",
            "\1\2\1\uffff\1\14\5\uffff\1\2",
            "\1\2\1\uffff\1\15\5\uffff\1\2",
            "\1\2\1\uffff\1\15\5\uffff\1\2",
            "\1\16\1\17",
            "\1\20\1\21",
            "\1\2\2\uffff\1\7\5\uffff\1\2\27\uffff\1\22\2\uffff\1\23",
            "\1\2\2\uffff\1\7\5\uffff\1\2\27\uffff\1\22\2\uffff\1\23",
            "\1\2\2\uffff\1\7\5\uffff\1\2\27\uffff\1\24\2\uffff\1\25",
            "\1\2\2\uffff\1\7\5\uffff\1\2\27\uffff\1\24\2\uffff\1\25",
            "\1\26\1\27",
            "\1\30\1\31",
            "\1\32\1\33",
            "\1\34\1\35",
            "\1\2\2\uffff\1\7\5\uffff\1\2\27\uffff\1\22",
            "\1\2\2\uffff\1\7\5\uffff\1\2\27\uffff\1\22",
            "\1\2\2\uffff\1\7\5\uffff\1\2\32\uffff\1\23",
            "\1\2\2\uffff\1\7\5\uffff\1\2\32\uffff\1\23",
            "\1\2\2\uffff\1\7\5\uffff\1\2\27\uffff\1\24",
            "\1\2\2\uffff\1\7\5\uffff\1\2\27\uffff\1\24",
            "\1\2\2\uffff\1\7\5\uffff\1\2\32\uffff\1\25",
            "\1\2\2\uffff\1\7\5\uffff\1\2\32\uffff\1\25"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "457:3: ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) )";
        }
    }
    static final String dfa_13s = "\33\uffff";
    static final String dfa_14s = "\2\10\4\20\1\10\2\uffff\1\10\4\20\2\10\1\uffff\2\10\10\20";
    static final String dfa_15s = "\1\26\5\46\1\11\2\uffff\1\11\4\64\2\11\1\uffff\2\11\2\61\2\64\2\61\2\64";
    static final String dfa_16s = "\7\uffff\1\2\1\1\7\uffff\1\3\12\uffff";
    static final String dfa_17s = "\33\uffff}>";
    static final String[] dfa_18s = {
            "\1\2\1\3\14\uffff\1\1",
            "\1\4\1\5\10\uffff\1\6\22\uffff\2\7",
            "\1\10\1\uffff\1\11\1\10\12\uffff\1\10\2\uffff\1\10\2\uffff\3\10",
            "\1\10\1\uffff\1\11\1\10\12\uffff\1\10\2\uffff\1\10\2\uffff\3\10",
            "\1\10\1\uffff\1\11\1\10\12\uffff\1\10\2\uffff\1\10\2\uffff\3\10",
            "\1\10\1\uffff\1\11\1\10\12\uffff\1\10\2\uffff\1\10\2\uffff\3\10",
            "\1\12\1\13",
            "",
            "",
            "\1\14\1\15",
            "\1\7\2\uffff\1\20\15\uffff\1\7\2\uffff\1\7\14\uffff\1\16\2\uffff\1\17",
            "\1\7\2\uffff\1\20\15\uffff\1\7\2\uffff\1\7\14\uffff\1\16\2\uffff\1\17",
            "\1\10\2\uffff\1\20\15\uffff\1\10\2\uffff\1\10\14\uffff\1\21\2\uffff\1\22",
            "\1\10\2\uffff\1\20\15\uffff\1\10\2\uffff\1\10\14\uffff\1\21\2\uffff\1\22",
            "\1\23\1\24",
            "\1\25\1\26",
            "",
            "\1\27\1\30",
            "\1\31\1\32",
            "\1\7\2\uffff\1\20\15\uffff\1\7\2\uffff\1\7\14\uffff\1\16",
            "\1\7\2\uffff\1\20\15\uffff\1\7\2\uffff\1\7\14\uffff\1\16",
            "\1\7\2\uffff\1\20\15\uffff\1\7\2\uffff\1\7\17\uffff\1\17",
            "\1\7\2\uffff\1\20\15\uffff\1\7\2\uffff\1\7\17\uffff\1\17",
            "\1\10\2\uffff\1\20\15\uffff\1\10\2\uffff\1\10\14\uffff\1\21",
            "\1\10\2\uffff\1\20\15\uffff\1\10\2\uffff\1\10\14\uffff\1\21",
            "\1\10\2\uffff\1\20\15\uffff\1\10\2\uffff\1\10\17\uffff\1\22",
            "\1\10\2\uffff\1\20\15\uffff\1\10\2\uffff\1\10\17\uffff\1\22"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "624:3: ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) )";
        }
    }
    static final String dfa_19s = "\6\73\2\uffff";
    static final String[] dfa_20s = {
            "\1\1\3\uffff\2\7\5\uffff\1\6\4\uffff\2\6\1\7\1\6\2\uffff\3\7\30\uffff\1\2\1\3\1\4\1\5\3\7",
            "\1\1\3\uffff\2\7\5\uffff\1\6\4\uffff\2\6\1\7\1\6\2\uffff\3\7\30\uffff\1\2\1\3\1\4\1\5\3\7",
            "\2\7\5\uffff\1\6\4\uffff\2\6\1\7\1\6\2\uffff\3\7\34\uffff\3\7",
            "\2\7\5\uffff\1\6\4\uffff\2\6\1\7\1\6\2\uffff\3\7\34\uffff\3\7",
            "\2\7\5\uffff\1\6\4\uffff\2\6\1\7\1\6\2\uffff\3\7\34\uffff\3\7",
            "\2\7\5\uffff\1\6\4\uffff\2\6\1\7\1\6\2\uffff\3\7\34\uffff\3\7",
            "",
            ""
    };
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_19;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "1104:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember )";
        }
    }
    static final String dfa_21s = "\41\uffff";
    static final String dfa_22s = "\4\10\1\uffff\2\20\1\uffff\4\10\1\uffff\2\20\1\10\4\20\2\10\1\uffff\2\10\10\20";
    static final String dfa_23s = "\4\73\1\uffff\2\46\1\uffff\3\46\1\11\1\uffff\2\46\1\11\4\64\2\11\1\uffff\2\11\2\61\2\64\2\61\2\64";
    static final String dfa_24s = "\4\uffff\1\1\2\uffff\1\3\4\uffff\1\2\11\uffff\1\4\12\uffff";
    static final String dfa_25s = "\41\uffff}>";
    static final String[] dfa_26s = {
            "\1\5\1\6\14\uffff\1\1\3\uffff\1\2\1\3\1\7\34\uffff\3\4",
            "\1\15\1\16\10\uffff\1\13\22\uffff\2\14\22\uffff\1\10\1\11\1\12",
            "\1\15\1\16\10\uffff\1\13\22\uffff\2\14\22\uffff\1\10\1\11\1\12",
            "\2\4\10\uffff\1\14\22\uffff\2\14\22\uffff\1\10\1\11\1\12",
            "",
            "\1\4\1\uffff\1\17\1\4\12\uffff\1\4\2\uffff\1\4\2\uffff\3\4",
            "\1\4\1\uffff\1\17\1\4\12\uffff\1\4\2\uffff\1\4\2\uffff\3\4",
            "",
            "\2\4\10\uffff\1\14\22\uffff\2\14",
            "\2\4\10\uffff\1\14\22\uffff\2\14",
            "\2\4\10\uffff\1\14\22\uffff\2\14",
            "\1\20\1\21",
            "",
            "\1\4\1\uffff\1\17\1\4\12\uffff\1\4\2\uffff\1\4\2\uffff\3\4",
            "\1\4\1\uffff\1\17\1\4\12\uffff\1\4\2\uffff\1\4\2\uffff\3\4",
            "\1\22\1\23",
            "\1\14\2\uffff\1\26\15\uffff\1\14\2\uffff\1\14\14\uffff\1\24\2\uffff\1\25",
            "\1\14\2\uffff\1\26\15\uffff\1\14\2\uffff\1\14\14\uffff\1\24\2\uffff\1\25",
            "\1\4\2\uffff\1\26\15\uffff\1\4\2\uffff\1\4\14\uffff\1\27\2\uffff\1\30",
            "\1\4\2\uffff\1\26\15\uffff\1\4\2\uffff\1\4\14\uffff\1\27\2\uffff\1\30",
            "\1\31\1\32",
            "\1\33\1\34",
            "",
            "\1\35\1\36",
            "\1\37\1\40",
            "\1\14\2\uffff\1\26\15\uffff\1\14\2\uffff\1\14\14\uffff\1\24",
            "\1\14\2\uffff\1\26\15\uffff\1\14\2\uffff\1\14\14\uffff\1\24",
            "\1\14\2\uffff\1\26\15\uffff\1\14\2\uffff\1\14\17\uffff\1\25",
            "\1\14\2\uffff\1\26\15\uffff\1\14\2\uffff\1\14\17\uffff\1\25",
            "\1\4\2\uffff\1\26\15\uffff\1\4\2\uffff\1\4\14\uffff\1\27",
            "\1\4\2\uffff\1\26\15\uffff\1\4\2\uffff\1\4\14\uffff\1\27",
            "\1\4\2\uffff\1\26\15\uffff\1\4\2\uffff\1\4\17\uffff\1\30",
            "\1\4\2\uffff\1\26\15\uffff\1\4\2\uffff\1\4\17\uffff\1\30"
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "1179:3: ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) )";
        }
    }
    static final String dfa_27s = "\11\uffff";
    static final String dfa_28s = "\2\4\4\10\3\uffff";
    static final String dfa_29s = "\6\73\3\uffff";
    static final String dfa_30s = "\6\uffff\1\1\1\2\1\3";
    static final String dfa_31s = "\11\uffff}>";
    static final String[] dfa_32s = {
            "\1\1\3\uffff\2\10\5\uffff\1\6\4\uffff\2\6\1\7\1\6\2\uffff\3\7\1\10\27\uffff\1\2\1\3\1\4\1\5\3\10",
            "\1\1\3\uffff\2\10\5\uffff\1\6\4\uffff\2\6\1\7\1\6\2\uffff\3\7\1\10\27\uffff\1\2\1\3\1\4\1\5\3\10",
            "\2\10\5\uffff\1\6\4\uffff\2\6\1\7\1\6\2\uffff\3\7\1\10\33\uffff\3\10",
            "\2\10\5\uffff\1\6\4\uffff\2\6\1\7\1\6\2\uffff\3\7\1\10\33\uffff\3\10",
            "\2\10\5\uffff\1\6\4\uffff\2\6\1\7\1\6\2\uffff\3\7\1\10\33\uffff\3\10",
            "\2\10\5\uffff\1\6\4\uffff\2\6\1\7\1\6\2\uffff\3\7\1\10\33\uffff\3\10",
            "",
            "",
            ""
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "1636:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_EndFeatureMember_2= ruleEndFeatureMember )";
        }
    }
    static final String dfa_33s = "\32\uffff";
    static final String dfa_34s = "\1\26\2\10\2\uffff\2\20\2\10\4\20\2\10\1\uffff\2\10\10\20";
    static final String dfa_35s = "\1\34\2\73\2\uffff\2\46\2\11\4\64\2\11\1\uffff\2\11\2\61\2\64\2\61\2\64";
    static final String dfa_36s = "\3\uffff\1\1\1\2\12\uffff\1\3\12\uffff";
    static final String dfa_37s = "\32\uffff}>";
    static final String[] dfa_38s = {
            "\1\1\3\uffff\1\2\1\3\1\4",
            "\1\5\1\6\10\uffff\1\7\22\uffff\2\3\22\uffff\3\3",
            "\1\5\1\6\10\uffff\1\7\22\uffff\2\3\22\uffff\3\3",
            "",
            "",
            "\1\3\1\uffff\1\10\1\3\12\uffff\1\3\2\uffff\1\3\2\uffff\3\3",
            "\1\3\1\uffff\1\10\1\3\12\uffff\1\3\2\uffff\1\3\2\uffff\3\3",
            "\1\11\1\12",
            "\1\13\1\14",
            "\1\3\2\uffff\1\17\15\uffff\1\3\2\uffff\1\3\14\uffff\1\15\2\uffff\1\16",
            "\1\3\2\uffff\1\17\15\uffff\1\3\2\uffff\1\3\14\uffff\1\15\2\uffff\1\16",
            "\1\3\2\uffff\1\17\15\uffff\1\3\2\uffff\1\3\14\uffff\1\20\2\uffff\1\21",
            "\1\3\2\uffff\1\17\15\uffff\1\3\2\uffff\1\3\14\uffff\1\20\2\uffff\1\21",
            "\1\22\1\23",
            "\1\24\1\25",
            "",
            "\1\26\1\27",
            "\1\30\1\31",
            "\1\3\2\uffff\1\17\15\uffff\1\3\2\uffff\1\3\14\uffff\1\15",
            "\1\3\2\uffff\1\17\15\uffff\1\3\2\uffff\1\3\14\uffff\1\15",
            "\1\3\2\uffff\1\17\15\uffff\1\3\2\uffff\1\3\17\uffff\1\16",
            "\1\3\2\uffff\1\17\15\uffff\1\3\2\uffff\1\3\17\uffff\1\16",
            "\1\3\2\uffff\1\17\15\uffff\1\3\2\uffff\1\3\14\uffff\1\20",
            "\1\3\2\uffff\1\17\15\uffff\1\3\2\uffff\1\3\14\uffff\1\20",
            "\1\3\2\uffff\1\17\15\uffff\1\3\2\uffff\1\3\17\uffff\1\21",
            "\1\3\2\uffff\1\17\15\uffff\1\3\2\uffff\1\3\17\uffff\1\21"
    };

    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_33;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "1745:3: ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) )";
        }
    }
    static final String dfa_39s = "\2\10\1\uffff\4\20\4\10\1\uffff\1\10\4\20\2\10\1\uffff\2\10\10\20";
    static final String dfa_40s = "\2\73\1\uffff\4\46\1\11\3\46\1\uffff\1\11\4\64\2\11\1\uffff\2\11\2\61\2\64\2\61\2\64";
    static final String dfa_41s = "\2\uffff\1\1\10\uffff\1\2\7\uffff\1\3\12\uffff";
    static final String[] dfa_42s = {
            "\1\3\1\4\23\uffff\1\1\33\uffff\3\2",
            "\1\5\1\6\10\uffff\1\7\22\uffff\2\13\22\uffff\1\10\1\11\1\12",
            "",
            "\1\2\1\uffff\1\14\1\2\12\uffff\1\2\2\uffff\1\2\2\uffff\3\2",
            "\1\2\1\uffff\1\14\1\2\12\uffff\1\2\2\uffff\1\2\2\uffff\3\2",
            "\1\2\1\uffff\1\14\1\2\12\uffff\1\2\2\uffff\1\2\2\uffff\3\2",
            "\1\2\1\uffff\1\14\1\2\12\uffff\1\2\2\uffff\1\2\2\uffff\3\2",
            "\1\15\1\16",
            "\2\2\10\uffff\1\13\22\uffff\2\13",
            "\2\2\10\uffff\1\13\22\uffff\2\13",
            "\2\2\10\uffff\1\13\22\uffff\2\13",
            "",
            "\1\17\1\20",
            "\1\13\2\uffff\1\23\15\uffff\1\13\2\uffff\1\13\14\uffff\1\21\2\uffff\1\22",
            "\1\13\2\uffff\1\23\15\uffff\1\13\2\uffff\1\13\14\uffff\1\21\2\uffff\1\22",
            "\1\2\2\uffff\1\23\15\uffff\1\2\2\uffff\1\2\14\uffff\1\24\2\uffff\1\25",
            "\1\2\2\uffff\1\23\15\uffff\1\2\2\uffff\1\2\14\uffff\1\24\2\uffff\1\25",
            "\1\26\1\27",
            "\1\30\1\31",
            "",
            "\1\32\1\33",
            "\1\34\1\35",
            "\1\13\2\uffff\1\23\15\uffff\1\13\2\uffff\1\13\14\uffff\1\21",
            "\1\13\2\uffff\1\23\15\uffff\1\13\2\uffff\1\13\14\uffff\1\21",
            "\1\13\2\uffff\1\23\15\uffff\1\13\2\uffff\1\13\17\uffff\1\22",
            "\1\13\2\uffff\1\23\15\uffff\1\13\2\uffff\1\13\17\uffff\1\22",
            "\1\2\2\uffff\1\23\15\uffff\1\2\2\uffff\1\2\14\uffff\1\24",
            "\1\2\2\uffff\1\23\15\uffff\1\2\2\uffff\1\2\14\uffff\1\24",
            "\1\2\2\uffff\1\23\15\uffff\1\2\2\uffff\1\2\17\uffff\1\25",
            "\1\2\2\uffff\1\23\15\uffff\1\2\2\uffff\1\2\17\uffff\1\25"
    };
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[][] dfa_42 = unpackEncodedStringArray(dfa_42s);

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_11;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "1973:3: ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) )";
        }
    }
    static final String dfa_43s = "\16\uffff";
    static final String dfa_44s = "\2\uffff\2\7\6\uffff\4\7";
    static final String dfa_45s = "\1\5\1\uffff\2\20\2\uffff\1\10\1\uffff\1\10\1\uffff\4\20";
    static final String dfa_46s = "\1\61\1\uffff\2\64\2\uffff\1\11\1\uffff\1\11\1\uffff\2\64\2\61";
    static final String dfa_47s = "\1\uffff\1\1\2\uffff\1\4\1\5\1\uffff\1\2\1\uffff\1\3\4\uffff";
    static final String dfa_48s = "\16\uffff}>";
    static final String[] dfa_49s = {
            "\3\1\1\2\1\3\6\uffff\1\4\32\uffff\1\1\2\uffff\1\5\1\uffff\2\1",
            "",
            "\2\7\1\uffff\1\7\5\uffff\1\7\7\uffff\1\7\1\uffff\1\7\4\uffff\6\7\1\11\1\7\1\uffff\1\10\2\uffff\1\6",
            "\2\7\1\uffff\1\7\5\uffff\1\7\7\uffff\1\7\1\uffff\1\7\4\uffff\6\7\1\11\1\7\1\uffff\1\10\2\uffff\1\6",
            "",
            "",
            "\1\12\1\13",
            "",
            "\1\14\1\15",
            "",
            "\2\7\1\uffff\1\7\5\uffff\1\7\7\uffff\1\7\1\uffff\1\7\4\uffff\6\7\1\11\1\7\4\uffff\1\6",
            "\2\7\1\uffff\1\7\5\uffff\1\7\7\uffff\1\7\1\uffff\1\7\4\uffff\6\7\1\11\1\7\4\uffff\1\6",
            "\2\7\1\uffff\1\7\5\uffff\1\7\7\uffff\1\7\1\uffff\1\7\4\uffff\6\7\1\11\1\7\1\uffff\1\10",
            "\2\7\1\uffff\1\7\5\uffff\1\7\7\uffff\1\7\1\uffff\1\7\4\uffff\6\7\1\11\1\7\1\uffff\1\10"
    };

    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[][] dfa_49 = unpackEncodedStringArray(dfa_49s);

    class DFA94 extends DFA {

        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = dfa_43;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "3505:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000908310L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000908300L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x01E0000000F28310L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x01E0000000B08310L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000948300L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x01E0000000D08310L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000D08300L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000006000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001040002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0FE000001CF28310L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0FE000001CD08310L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0E0000001CD08300L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0E00000000908300L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0E00006000040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040948300L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0FE000003CF28310L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x01E000001CD08310L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000001C400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0E00006000948300L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0FE0000020908310L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0E00000020908300L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000072400D0000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000180908300L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100908300L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000072000D0000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001200090000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000080L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001000090000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00034E00009183E0L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001200010000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00003F0000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00034800009183E0L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0003CE00009183E0L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000800002000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00034E00009383E0L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x000C000000000082L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000060000000080L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0002000000000002L});

}