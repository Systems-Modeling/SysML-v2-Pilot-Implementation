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
    // InternalAlf.g:108:1: ruleCommentedUnitDefinition returns [EObject current=null] : ( ( (lv_ownedMembership_0_0= ruleCommentMember ) )+ ( (lv_ownedMembership_1_0= ruleUnitMember ) ) ) ;
    public final EObject ruleCommentedUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMembership_0_0 = null;

        EObject lv_ownedMembership_1_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:114:2: ( ( ( (lv_ownedMembership_0_0= ruleCommentMember ) )+ ( (lv_ownedMembership_1_0= ruleUnitMember ) ) ) )
            // InternalAlf.g:115:2: ( ( (lv_ownedMembership_0_0= ruleCommentMember ) )+ ( (lv_ownedMembership_1_0= ruleUnitMember ) ) )
            {
            // InternalAlf.g:115:2: ( ( (lv_ownedMembership_0_0= ruleCommentMember ) )+ ( (lv_ownedMembership_1_0= ruleUnitMember ) ) )
            // InternalAlf.g:116:3: ( (lv_ownedMembership_0_0= ruleCommentMember ) )+ ( (lv_ownedMembership_1_0= ruleUnitMember ) )
            {
            // InternalAlf.g:116:3: ( (lv_ownedMembership_0_0= ruleCommentMember ) )+
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
            	    // InternalAlf.g:117:4: (lv_ownedMembership_0_0= ruleCommentMember )
            	    {
            	    // InternalAlf.g:117:4: (lv_ownedMembership_0_0= ruleCommentMember )
            	    // InternalAlf.g:118:5: lv_ownedMembership_0_0= ruleCommentMember
            	    {

            	    					newCompositeNode(grammarAccess.getCommentedUnitDefinitionAccess().getOwnedMembershipCommentMemberParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_ownedMembership_0_0=ruleCommentMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCommentedUnitDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedMembership",
            	    						lv_ownedMembership_0_0,
            	    						"org.omg.sysml.Alf.CommentMember");
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
            switch ( input.LA(1) ) {
            case RULE_DOCUMENTATION_COMMENT:
            case 15:
            case 20:
            case 21:
            case 23:
                {
                alt5=1;
                }
                break;
            case 53:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==15||(LA5_2>=20 && LA5_2<=21)||LA5_2==23) ) {
                    alt5=1;
                }
                else if ( ((LA5_2>=RULE_ID && LA5_2<=RULE_UNRESTRICTED_NAME)||LA5_2==22) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 54:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==15||(LA5_3>=20 && LA5_3<=21)||LA5_3==23) ) {
                    alt5=1;
                }
                else if ( ((LA5_3>=RULE_ID && LA5_3<=RULE_UNRESTRICTED_NAME)||LA5_3==22) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case 55:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==15||(LA5_4>=20 && LA5_4<=21)||LA5_4==23) ) {
                    alt5=1;
                }
                else if ( ((LA5_4>=RULE_ID && LA5_4<=RULE_UNRESTRICTED_NAME)||LA5_4==22) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            case 56:
                {
                int LA5_5 = input.LA(2);

                if ( (LA5_5==15||(LA5_5>=20 && LA5_5<=21)||LA5_5==23) ) {
                    alt5=1;
                }
                else if ( ((LA5_5>=RULE_ID && LA5_5<=RULE_UNRESTRICTED_NAME)||LA5_5==22) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 22:
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

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
    // InternalAlf.g:411:1: ruleNonFeatureMember returns [EObject current=null] : (this_CommentMember_0= ruleCommentMember | this_NonCommentNonFeatureMember_1= ruleNonCommentNonFeatureMember ) ;
    public final EObject ruleNonFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject this_CommentMember_0 = null;

        EObject this_NonCommentNonFeatureMember_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:417:2: ( (this_CommentMember_0= ruleCommentMember | this_NonCommentNonFeatureMember_1= ruleNonCommentNonFeatureMember ) )
            // InternalAlf.g:418:2: (this_CommentMember_0= ruleCommentMember | this_NonCommentNonFeatureMember_1= ruleNonCommentNonFeatureMember )
            {
            // InternalAlf.g:418:2: (this_CommentMember_0= ruleCommentMember | this_NonCommentNonFeatureMember_1= ruleNonCommentNonFeatureMember )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DOCUMENTATION_COMMENT) ) {
                alt6=1;
            }
            else if ( (LA6_0==15||(LA6_0>=20 && LA6_0<=21)||LA6_0==23||(LA6_0>=53 && LA6_0<=56)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAlf.g:419:3: this_CommentMember_0= ruleCommentMember
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getCommentMemberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommentMember_0=ruleCommentMember();

                    state._fsp--;


                    			current = this_CommentMember_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:428:3: this_NonCommentNonFeatureMember_1= ruleNonCommentNonFeatureMember
                    {

                    			newCompositeNode(grammarAccess.getNonFeatureMemberAccess().getNonCommentNonFeatureMemberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonCommentNonFeatureMember_1=ruleNonCommentNonFeatureMember();

                    state._fsp--;


                    			current = this_NonCommentNonFeatureMember_1;
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
    // $ANTLR end "ruleNonFeatureMember"


    // $ANTLR start "entryRuleCommentMember"
    // InternalAlf.g:440:1: entryRuleCommentMember returns [EObject current=null] : iv_ruleCommentMember= ruleCommentMember EOF ;
    public final EObject entryRuleCommentMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentMember = null;


        try {
            // InternalAlf.g:440:54: (iv_ruleCommentMember= ruleCommentMember EOF )
            // InternalAlf.g:441:2: iv_ruleCommentMember= ruleCommentMember EOF
            {
             newCompositeNode(grammarAccess.getCommentMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommentMember=ruleCommentMember();

            state._fsp--;

             current =iv_ruleCommentMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentMember"


    // $ANTLR start "ruleCommentMember"
    // InternalAlf.g:447:1: ruleCommentMember returns [EObject current=null] : ( (lv_ownedMemberElement_0_0= ruleComment ) ) ;
    public final EObject ruleCommentMember() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMemberElement_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:453:2: ( ( (lv_ownedMemberElement_0_0= ruleComment ) ) )
            // InternalAlf.g:454:2: ( (lv_ownedMemberElement_0_0= ruleComment ) )
            {
            // InternalAlf.g:454:2: ( (lv_ownedMemberElement_0_0= ruleComment ) )
            // InternalAlf.g:455:3: (lv_ownedMemberElement_0_0= ruleComment )
            {
            // InternalAlf.g:455:3: (lv_ownedMemberElement_0_0= ruleComment )
            // InternalAlf.g:456:4: lv_ownedMemberElement_0_0= ruleComment
            {

            				newCompositeNode(grammarAccess.getCommentMemberAccess().getOwnedMemberElementCommentParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ownedMemberElement_0_0=ruleComment();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getCommentMemberRule());
            				}
            				set(
            					current,
            					"ownedMemberElement",
            					lv_ownedMemberElement_0_0,
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
    // $ANTLR end "ruleCommentMember"


    // $ANTLR start "entryRuleNonCommentNonFeatureMember"
    // InternalAlf.g:476:1: entryRuleNonCommentNonFeatureMember returns [EObject current=null] : iv_ruleNonCommentNonFeatureMember= ruleNonCommentNonFeatureMember EOF ;
    public final EObject entryRuleNonCommentNonFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonCommentNonFeatureMember = null;


        try {
            // InternalAlf.g:476:67: (iv_ruleNonCommentNonFeatureMember= ruleNonCommentNonFeatureMember EOF )
            // InternalAlf.g:477:2: iv_ruleNonCommentNonFeatureMember= ruleNonCommentNonFeatureMember EOF
            {
             newCompositeNode(grammarAccess.getNonCommentNonFeatureMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonCommentNonFeatureMember=ruleNonCommentNonFeatureMember();

            state._fsp--;

             current =iv_ruleNonCommentNonFeatureMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonCommentNonFeatureMember"


    // $ANTLR start "ruleNonCommentNonFeatureMember"
    // InternalAlf.g:483:1: ruleNonCommentNonFeatureMember returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ) ) ;
    public final EObject ruleNonCommentNonFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_ownedMemberElement_1_0 = null;

        AntlrDatatypeRuleToken lv_memberName_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:489:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ) ) )
            // InternalAlf.g:490:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ) )
            {
            // InternalAlf.g:490:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) ) )
            // InternalAlf.g:491:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) )
            {
            // InternalAlf.g:491:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=53 && LA7_0<=56)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlf.g:492:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:492:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    // InternalAlf.g:493:5: lv_visibility_0_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getNonCommentNonFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_visibility_0_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNonCommentNonFeatureMemberRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"org.omg.sysml.Alf.VisibilityIndicator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:510:3: ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalAlf.g:511:4: ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) )
                    {
                    // InternalAlf.g:511:4: ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) )
                    // InternalAlf.g:512:5: (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition )
                    {
                    // InternalAlf.g:512:5: (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition )
                    // InternalAlf.g:513:6: lv_ownedMemberElement_1_0= ruleNonFeatureDefinition
                    {

                    						newCompositeNode(grammarAccess.getNonCommentNonFeatureMemberAccess().getOwnedMemberElementNonFeatureDefinitionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_1_0=ruleNonFeatureDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNonCommentNonFeatureMemberRule());
                    						}
                    						set(
                    							current,
                    							"ownedMemberElement",
                    							lv_ownedMemberElement_1_0,
                    							"org.omg.sysml.Alf.NonFeatureDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:531:4: ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' )
                    {
                    // InternalAlf.g:531:4: ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' )
                    // InternalAlf.g:532:5: ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';'
                    {

                    					newCompositeNode(grammarAccess.getNonCommentNonFeatureMemberAccess().getNonFeatureMemberKindParserRuleCall_1_1_0());
                    				
                    pushFollow(FOLLOW_8);
                    ruleNonFeatureMemberKind();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalAlf.g:539:5: ( (lv_memberName_3_0= ruleName ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalAlf.g:540:6: (lv_memberName_3_0= ruleName )
                            {
                            // InternalAlf.g:540:6: (lv_memberName_3_0= ruleName )
                            // InternalAlf.g:541:7: lv_memberName_3_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getNonCommentNonFeatureMemberAccess().getMemberNameNameParserRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_memberName_3_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNonCommentNonFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"memberName",
                            								lv_memberName_3_0,
                            								"org.omg.sysml.Alf.Name");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_4); 

                    					newLeafNode(otherlv_4, grammarAccess.getNonCommentNonFeatureMemberAccess().getIsKeyword_1_1_2());
                    				
                    // InternalAlf.g:562:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:563:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:563:6: ( ruleQualifiedName )
                    // InternalAlf.g:564:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonCommentNonFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNonCommentNonFeatureMemberAccess().getMemberElementElementCrossReference_1_1_3_0());
                    						
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getNonCommentNonFeatureMemberAccess().getSemicolonKeyword_1_1_4());
                    				

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
    // $ANTLR end "ruleNonCommentNonFeatureMember"


    // $ANTLR start "entryRuleNonFeatureMemberKind"
    // InternalAlf.g:588:1: entryRuleNonFeatureMemberKind returns [String current=null] : iv_ruleNonFeatureMemberKind= ruleNonFeatureMemberKind EOF ;
    public final String entryRuleNonFeatureMemberKind() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonFeatureMemberKind = null;


        try {
            // InternalAlf.g:588:60: (iv_ruleNonFeatureMemberKind= ruleNonFeatureMemberKind EOF )
            // InternalAlf.g:589:2: iv_ruleNonFeatureMemberKind= ruleNonFeatureMemberKind EOF
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
    // InternalAlf.g:595:1: ruleNonFeatureMemberKind returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'package' | kw= 'class' | kw= 'assoc' ) ;
    public final AntlrDatatypeRuleToken ruleNonFeatureMemberKind() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:601:2: ( (kw= 'package' | kw= 'class' | kw= 'assoc' ) )
            // InternalAlf.g:602:2: (kw= 'package' | kw= 'class' | kw= 'assoc' )
            {
            // InternalAlf.g:602:2: (kw= 'package' | kw= 'class' | kw= 'assoc' )
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
                    // InternalAlf.g:603:3: kw= 'package'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNonFeatureMemberKindAccess().getPackageKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:609:3: kw= 'class'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNonFeatureMemberKindAccess().getClassKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:615:3: kw= 'assoc'
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
    // InternalAlf.g:624:1: entryRulePackagedFeatureMember returns [EObject current=null] : iv_rulePackagedFeatureMember= rulePackagedFeatureMember EOF ;
    public final EObject entryRulePackagedFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackagedFeatureMember = null;


        try {
            // InternalAlf.g:624:62: (iv_rulePackagedFeatureMember= rulePackagedFeatureMember EOF )
            // InternalAlf.g:625:2: iv_rulePackagedFeatureMember= rulePackagedFeatureMember EOF
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
    // InternalAlf.g:631:1: rulePackagedFeatureMember returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) ) ) ;
    public final EObject rulePackagedFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_ownedMemberElement_2_0 = null;

        EObject lv_ownedMemberElement_4_0 = null;

        AntlrDatatypeRuleToken lv_memberName_6_0 = null;

        AntlrDatatypeRuleToken lv_memberName_7_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:637:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) ) ) )
            // InternalAlf.g:638:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) ) )
            {
            // InternalAlf.g:638:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) ) )
            // InternalAlf.g:639:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) )
            {
            // InternalAlf.g:639:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=53 && LA11_0<=56)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAlf.g:640:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:640:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    // InternalAlf.g:641:5: lv_visibility_0_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_visibility_0_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"org.omg.sysml.Alf.VisibilityIndicator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:658:3: ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalAlf.g:659:4: ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:659:4: ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:660:5: (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:660:5: (otherlv_1= 'feature' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==22) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalAlf.g:661:6: otherlv_1= 'feature'
                            {
                            otherlv_1=(Token)match(input,22,FOLLOW_4); 

                            						newLeafNode(otherlv_1, grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_0_0());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:666:5: ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:667:6: (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:667:6: (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:668:7: lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementNamedFeatureDefinitionParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_2_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_2_0,
                    								"org.omg.sysml.Alf.NamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:687:4: (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:687:4: (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:688:5: otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_12); 

                    					newLeafNode(otherlv_3, grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_1_0());
                    				
                    // InternalAlf.g:692:5: ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:693:6: (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:693:6: (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:694:7: lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getOwnedMemberElementUnnamedFeatureDefinitionParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_4_0=ruleUnnamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_4_0,
                    								"org.omg.sysml.Alf.UnnamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:713:4: ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    {
                    // InternalAlf.g:713:4: ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' )
                    // InternalAlf.g:714:5: ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';'
                    {
                    // InternalAlf.g:714:5: ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==22) ) {
                        alt14=1;
                    }
                    else if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalAlf.g:715:6: (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? )
                            {
                            // InternalAlf.g:715:6: (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? )
                            // InternalAlf.g:716:7: otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )?
                            {
                            otherlv_5=(Token)match(input,22,FOLLOW_8); 

                            							newLeafNode(otherlv_5, grammarAccess.getPackagedFeatureMemberAccess().getFeatureKeyword_1_2_0_0_0());
                            						
                            // InternalAlf.g:720:7: ( (lv_memberName_6_0= ruleName ) )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // InternalAlf.g:721:8: (lv_memberName_6_0= ruleName )
                                    {
                                    // InternalAlf.g:721:8: (lv_memberName_6_0= ruleName )
                                    // InternalAlf.g:722:9: lv_memberName_6_0= ruleName
                                    {

                                    									newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_0_0_1_0());
                                    								
                                    pushFollow(FOLLOW_9);
                                    lv_memberName_6_0=ruleName();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getPackagedFeatureMemberRule());
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


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:741:6: ( (lv_memberName_7_0= ruleName ) )
                            {
                            // InternalAlf.g:741:6: ( (lv_memberName_7_0= ruleName ) )
                            // InternalAlf.g:742:7: (lv_memberName_7_0= ruleName )
                            {
                            // InternalAlf.g:742:7: (lv_memberName_7_0= ruleName )
                            // InternalAlf.g:743:8: lv_memberName_7_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_0_1_0());
                            							
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


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,18,FOLLOW_4); 

                    					newLeafNode(otherlv_8, grammarAccess.getPackagedFeatureMemberAccess().getIsKeyword_1_2_1());
                    				
                    // InternalAlf.g:765:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:766:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:766:6: ( ruleQualifiedName )
                    // InternalAlf.g:767:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPackagedFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPackagedFeatureMemberAccess().getMemberElementFeatureCrossReference_1_2_2_0());
                    						
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_10=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_10, grammarAccess.getPackagedFeatureMemberAccess().getSemicolonKeyword_1_2_3());
                    				

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
    // InternalAlf.g:791:1: entryRuleNonFeatureDefinition returns [EObject current=null] : iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF ;
    public final EObject entryRuleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureDefinition = null;


        try {
            // InternalAlf.g:791:61: (iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF )
            // InternalAlf.g:792:2: iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF
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
    // InternalAlf.g:798:1: ruleNonFeatureDefinition returns [EObject current=null] : (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub ) ;
    public final EObject ruleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinitionOrStub_0 = null;

        EObject this_ClassifierDefinitionOrStub_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:804:2: ( (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub ) )
            // InternalAlf.g:805:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub )
            {
            // InternalAlf.g:805:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=20 && LA16_0<=21)||LA16_0==23) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalAlf.g:806:3: this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub
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
                    // InternalAlf.g:815:3: this_ClassifierDefinitionOrStub_1= ruleClassifierDefinitionOrStub
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
    // InternalAlf.g:827:1: entryRuleClassifierDefinitionOrStub returns [EObject current=null] : iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF ;
    public final EObject entryRuleClassifierDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierDefinitionOrStub = null;


        try {
            // InternalAlf.g:827:67: (iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF )
            // InternalAlf.g:828:2: iv_ruleClassifierDefinitionOrStub= ruleClassifierDefinitionOrStub EOF
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
    // InternalAlf.g:834:1: ruleClassifierDefinitionOrStub returns [EObject current=null] : (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_1= ruleAssociationDefinitionOrStub ) ;
    public final EObject ruleClassifierDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinitionOrStub_0 = null;

        EObject this_AssociationDefinitionOrStub_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:840:2: ( (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_1= ruleAssociationDefinitionOrStub ) )
            // InternalAlf.g:841:2: (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_1= ruleAssociationDefinitionOrStub )
            {
            // InternalAlf.g:841:2: (this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_1= ruleAssociationDefinitionOrStub )
            int alt17=2;
            switch ( input.LA(1) ) {
            case 23:
                {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==20) ) {
                    alt17=1;
                }
                else if ( (LA17_1==21) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt17=1;
                }
                break;
            case 21:
                {
                alt17=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalAlf.g:842:3: this_ClassDefinitionOrStub_0= ruleClassDefinitionOrStub
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
                    // InternalAlf.g:851:3: this_AssociationDefinitionOrStub_1= ruleAssociationDefinitionOrStub
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
    // InternalAlf.g:863:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // InternalAlf.g:863:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalAlf.g:864:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
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
    // InternalAlf.g:870:1: ruleClassDeclaration returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? ) ;
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
            // InternalAlf.g:876:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? ) )
            // InternalAlf.g:877:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? )
            {
            // InternalAlf.g:877:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? )
            // InternalAlf.g:878:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )?
            {
            // InternalAlf.g:878:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAlf.g:879:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:879:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:880:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,23,FOLLOW_13); 

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
            		
            // InternalAlf.g:896:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:897:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:897:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:898:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getClassDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalAlf.g:915:3: ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18||LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAlf.g:916:4: (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )*
                    {
                    // InternalAlf.g:916:4: (otherlv_3= 'is' | otherlv_4= 'specializes' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==18) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==24) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalAlf.g:917:5: otherlv_3= 'is'
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_4); 

                            					newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getIsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:922:5: otherlv_4= 'specializes'
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_4); 

                            					newLeafNode(otherlv_4, grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:927:4: ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) )
                    // InternalAlf.g:928:5: (lv_ownedMembership_5_0= ruleOwnedGeneralization )
                    {
                    // InternalAlf.g:928:5: (lv_ownedMembership_5_0= ruleOwnedGeneralization )
                    // InternalAlf.g:929:6: lv_ownedMembership_5_0= ruleOwnedGeneralization
                    {

                    						newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalAlf.g:946:4: (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==25) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalAlf.g:947:5: otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) )
                    	    {
                    	    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getClassDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:951:5: ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) )
                    	    // InternalAlf.g:952:6: (lv_ownedMembership_7_0= ruleOwnedGeneralization )
                    	    {
                    	    // InternalAlf.g:952:6: (lv_ownedMembership_7_0= ruleOwnedGeneralization )
                    	    // InternalAlf.g:953:7: lv_ownedMembership_7_0= ruleOwnedGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop20;
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
    // InternalAlf.g:976:1: entryRuleOwnedGeneralization returns [EObject current=null] : iv_ruleOwnedGeneralization= ruleOwnedGeneralization EOF ;
    public final EObject entryRuleOwnedGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedGeneralization = null;


        try {
            // InternalAlf.g:976:60: (iv_ruleOwnedGeneralization= ruleOwnedGeneralization EOF )
            // InternalAlf.g:977:2: iv_ruleOwnedGeneralization= ruleOwnedGeneralization EOF
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
    // InternalAlf.g:983:1: ruleOwnedGeneralization returns [EObject current=null] : ( (lv_ownedMemberElement_0_0= ruleGeneralization ) ) ;
    public final EObject ruleOwnedGeneralization() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedMemberElement_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:989:2: ( ( (lv_ownedMemberElement_0_0= ruleGeneralization ) ) )
            // InternalAlf.g:990:2: ( (lv_ownedMemberElement_0_0= ruleGeneralization ) )
            {
            // InternalAlf.g:990:2: ( (lv_ownedMemberElement_0_0= ruleGeneralization ) )
            // InternalAlf.g:991:3: (lv_ownedMemberElement_0_0= ruleGeneralization )
            {
            // InternalAlf.g:991:3: (lv_ownedMemberElement_0_0= ruleGeneralization )
            // InternalAlf.g:992:4: lv_ownedMemberElement_0_0= ruleGeneralization
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
    // InternalAlf.g:1012:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalAlf.g:1012:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalAlf.g:1013:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalAlf.g:1019:1: ruleGeneralization returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:1025:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:1026:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:1026:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1027:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:1027:3: ( ruleQualifiedName )
            // InternalAlf.g:1028:4: ruleQualifiedName
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
    // InternalAlf.g:1045:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // InternalAlf.g:1045:56: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // InternalAlf.g:1046:2: iv_ruleClassDefinition= ruleClassDefinition EOF
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
    // InternalAlf.g:1052:1: ruleClassDefinition returns [EObject current=null] : (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}' ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_ClassDeclaration_0 = null;

        EObject lv_ownedMembership_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1058:2: ( (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}' ) )
            // InternalAlf.g:1059:2: (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}' )
            {
            // InternalAlf.g:1059:2: (this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}' )
            // InternalAlf.g:1060:3: this_ClassDeclaration_0= ruleClassDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleClassMember ) )* otherlv_3= '}'
            {

            			newCompositeNode(grammarAccess.getClassDefinitionAccess().getClassDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_ClassDeclaration_0=ruleClassDeclaration();

            state._fsp--;


            			current = this_ClassDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:1072:3: ( (lv_ownedMembership_2_0= ruleClassMember ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_DOCUMENTATION_COMMENT||(LA22_0>=RULE_ID && LA22_0<=RULE_UNRESTRICTED_NAME)||LA22_0==15||(LA22_0>=20 && LA22_0<=23)||(LA22_0>=26 && LA22_0<=28)||(LA22_0>=53 && LA22_0<=59)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAlf.g:1073:4: (lv_ownedMembership_2_0= ruleClassMember )
            	    {
            	    // InternalAlf.g:1073:4: (lv_ownedMembership_2_0= ruleClassMember )
            	    // InternalAlf.g:1074:5: lv_ownedMembership_2_0= ruleClassMember
            	    {

            	    					newCompositeNode(grammarAccess.getClassDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    break loop22;
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
    // InternalAlf.g:1099:1: entryRuleClassDefinitionOrStub returns [EObject current=null] : iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF ;
    public final EObject entryRuleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:1099:62: (iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:1100:2: iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF
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
    // InternalAlf.g:1106:1: ruleClassDefinitionOrStub returns [EObject current=null] : this_ClassDefinition_0= ruleClassDefinition ;
    public final EObject ruleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1112:2: (this_ClassDefinition_0= ruleClassDefinition )
            // InternalAlf.g:1113:2: this_ClassDefinition_0= ruleClassDefinition
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
    // InternalAlf.g:1124:1: entryRuleClassMember returns [EObject current=null] : iv_ruleClassMember= ruleClassMember EOF ;
    public final EObject entryRuleClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassMember = null;


        try {
            // InternalAlf.g:1124:52: (iv_ruleClassMember= ruleClassMember EOF )
            // InternalAlf.g:1125:2: iv_ruleClassMember= ruleClassMember EOF
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
    // InternalAlf.g:1131:1: ruleClassMember returns [EObject current=null] : (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember ) ;
    public final EObject ruleClassMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureMember_0 = null;

        EObject this_ClassFeatureMember_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1137:2: ( (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember ) )
            // InternalAlf.g:1138:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember )
            {
            // InternalAlf.g:1138:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_ClassFeatureMember_1= ruleClassFeatureMember )
            int alt23=2;
            switch ( input.LA(1) ) {
            case RULE_DOCUMENTATION_COMMENT:
            case 15:
            case 20:
            case 21:
            case 23:
                {
                alt23=1;
                }
                break;
            case 53:
                {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==15||(LA23_2>=20 && LA23_2<=21)||LA23_2==23) ) {
                    alt23=1;
                }
                else if ( ((LA23_2>=RULE_ID && LA23_2<=RULE_UNRESTRICTED_NAME)||LA23_2==22||(LA23_2>=26 && LA23_2<=28)||(LA23_2>=57 && LA23_2<=59)) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;
                }
                }
                break;
            case 54:
                {
                int LA23_3 = input.LA(2);

                if ( (LA23_3==15||(LA23_3>=20 && LA23_3<=21)||LA23_3==23) ) {
                    alt23=1;
                }
                else if ( ((LA23_3>=RULE_ID && LA23_3<=RULE_UNRESTRICTED_NAME)||LA23_3==22||(LA23_3>=26 && LA23_3<=28)||(LA23_3>=57 && LA23_3<=59)) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 3, input);

                    throw nvae;
                }
                }
                break;
            case 55:
                {
                int LA23_4 = input.LA(2);

                if ( ((LA23_4>=RULE_ID && LA23_4<=RULE_UNRESTRICTED_NAME)||LA23_4==22||(LA23_4>=26 && LA23_4<=28)||(LA23_4>=57 && LA23_4<=59)) ) {
                    alt23=2;
                }
                else if ( (LA23_4==15||(LA23_4>=20 && LA23_4<=21)||LA23_4==23) ) {
                    alt23=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 4, input);

                    throw nvae;
                }
                }
                break;
            case 56:
                {
                int LA23_5 = input.LA(2);

                if ( (LA23_5==15||(LA23_5>=20 && LA23_5<=21)||LA23_5==23) ) {
                    alt23=1;
                }
                else if ( ((LA23_5>=RULE_ID && LA23_5<=RULE_UNRESTRICTED_NAME)||LA23_5==22||(LA23_5>=26 && LA23_5<=28)||(LA23_5>=57 && LA23_5<=59)) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 22:
            case 26:
            case 27:
            case 28:
            case 57:
            case 58:
            case 59:
                {
                alt23=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalAlf.g:1139:3: this_NonFeatureMember_0= ruleNonFeatureMember
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
                    // InternalAlf.g:1148:3: this_ClassFeatureMember_1= ruleClassFeatureMember
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
    // InternalAlf.g:1160:1: entryRuleClassFeatureMember returns [EObject current=null] : iv_ruleClassFeatureMember= ruleClassFeatureMember EOF ;
    public final EObject entryRuleClassFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassFeatureMember = null;


        try {
            // InternalAlf.g:1160:59: (iv_ruleClassFeatureMember= ruleClassFeatureMember EOF )
            // InternalAlf.g:1161:2: iv_ruleClassFeatureMember= ruleClassFeatureMember EOF
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
    // InternalAlf.g:1167:1: ruleClassFeatureMember returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) ) ) ;
    public final EObject ruleClassFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isComposite_2_0=null;
        Token lv_isPort_3_0=null;
        Token otherlv_6=null;
        Token lv_isComposite_7_0=null;
        Token lv_isPort_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_isComposite_14_0=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Enumerator lv_visibility_0_0 = null;

        Enumerator lv_direction_4_0 = null;

        EObject lv_ownedMemberElement_5_0 = null;

        Enumerator lv_direction_9_0 = null;

        EObject lv_ownedMemberElement_10_0 = null;

        EObject lv_ownedMemberElement_12_0 = null;

        AntlrDatatypeRuleToken lv_memberName_15_0 = null;

        AntlrDatatypeRuleToken lv_memberName_16_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1173:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) ) ) )
            // InternalAlf.g:1174:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) ) )
            {
            // InternalAlf.g:1174:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) ) )
            // InternalAlf.g:1175:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) )
            {
            // InternalAlf.g:1175:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=53 && LA24_0<=56)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAlf.g:1176:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:1176:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    // InternalAlf.g:1177:5: lv_visibility_0_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_visibility_0_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"org.omg.sysml.Alf.VisibilityIndicator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:1194:3: ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) )
            int alt32=4;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalAlf.g:1195:4: ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1195:4: ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1196:5: (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1196:5: (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )?
                    int alt25=4;
                    switch ( input.LA(1) ) {
                        case 22:
                            {
                            alt25=1;
                            }
                            break;
                        case 26:
                            {
                            alt25=2;
                            }
                            break;
                        case 27:
                            {
                            alt25=3;
                            }
                            break;
                    }

                    switch (alt25) {
                        case 1 :
                            // InternalAlf.g:1197:6: otherlv_1= 'feature'
                            {
                            otherlv_1=(Token)match(input,22,FOLLOW_18); 

                            						newLeafNode(otherlv_1, grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1202:6: ( (lv_isComposite_2_0= 'part' ) )
                            {
                            // InternalAlf.g:1202:6: ( (lv_isComposite_2_0= 'part' ) )
                            // InternalAlf.g:1203:7: (lv_isComposite_2_0= 'part' )
                            {
                            // InternalAlf.g:1203:7: (lv_isComposite_2_0= 'part' )
                            // InternalAlf.g:1204:8: lv_isComposite_2_0= 'part'
                            {
                            lv_isComposite_2_0=(Token)match(input,26,FOLLOW_18); 

                            								newLeafNode(lv_isComposite_2_0, grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_0_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isComposite", true, "part");
                            							

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAlf.g:1217:6: ( (lv_isPort_3_0= 'port' ) )
                            {
                            // InternalAlf.g:1217:6: ( (lv_isPort_3_0= 'port' ) )
                            // InternalAlf.g:1218:7: (lv_isPort_3_0= 'port' )
                            {
                            // InternalAlf.g:1218:7: (lv_isPort_3_0= 'port' )
                            // InternalAlf.g:1219:8: lv_isPort_3_0= 'port'
                            {
                            lv_isPort_3_0=(Token)match(input,27,FOLLOW_18); 

                            								newLeafNode(lv_isPort_3_0, grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_0_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPort", true, "port");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1232:5: ( (lv_direction_4_0= ruleFeatureDirection ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=57 && LA26_0<=59)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalAlf.g:1233:6: (lv_direction_4_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1233:6: (lv_direction_4_0= ruleFeatureDirection )
                            // InternalAlf.g:1234:7: lv_direction_4_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_4);
                            lv_direction_4_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
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

                    // InternalAlf.g:1251:5: ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1252:6: (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1252:6: (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1253:7: lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementNamedFeatureDefinitionParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_5_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_5_0,
                    								"org.omg.sysml.Alf.NamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1272:4: ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1272:4: ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:1273:5: (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1273:5: (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) )
                    int alt27=3;
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
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }

                    switch (alt27) {
                        case 1 :
                            // InternalAlf.g:1274:6: otherlv_6= 'feature'
                            {
                            otherlv_6=(Token)match(input,22,FOLLOW_19); 

                            						newLeafNode(otherlv_6, grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_1_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1279:6: ( (lv_isComposite_7_0= 'part' ) )
                            {
                            // InternalAlf.g:1279:6: ( (lv_isComposite_7_0= 'part' ) )
                            // InternalAlf.g:1280:7: (lv_isComposite_7_0= 'part' )
                            {
                            // InternalAlf.g:1280:7: (lv_isComposite_7_0= 'part' )
                            // InternalAlf.g:1281:8: lv_isComposite_7_0= 'part'
                            {
                            lv_isComposite_7_0=(Token)match(input,26,FOLLOW_19); 

                            								newLeafNode(lv_isComposite_7_0, grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_1_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isComposite", true, "part");
                            							

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAlf.g:1294:6: ( (lv_isPort_8_0= 'port' ) )
                            {
                            // InternalAlf.g:1294:6: ( (lv_isPort_8_0= 'port' ) )
                            // InternalAlf.g:1295:7: (lv_isPort_8_0= 'port' )
                            {
                            // InternalAlf.g:1295:7: (lv_isPort_8_0= 'port' )
                            // InternalAlf.g:1296:8: lv_isPort_8_0= 'port'
                            {
                            lv_isPort_8_0=(Token)match(input,27,FOLLOW_19); 

                            								newLeafNode(lv_isPort_8_0, grammarAccess.getClassFeatureMemberAccess().getIsPortPortKeyword_1_1_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPort", true, "port");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1309:5: ( (lv_direction_9_0= ruleFeatureDirection ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=57 && LA28_0<=59)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalAlf.g:1310:6: (lv_direction_9_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1310:6: (lv_direction_9_0= ruleFeatureDirection )
                            // InternalAlf.g:1311:7: lv_direction_9_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_12);
                            lv_direction_9_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"direction",
                            								lv_direction_9_0,
                            								"org.omg.sysml.Alf.FeatureDirection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1328:5: ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:1329:6: (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:1329:6: (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:1330:7: lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementUnnamedFeatureDefinitionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_10_0=ruleUnnamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_10_0,
                    								"org.omg.sysml.Alf.UnnamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1349:4: (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) )
                    {
                    // InternalAlf.g:1349:4: (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) )
                    // InternalAlf.g:1350:5: otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) )
                    {
                    otherlv_11=(Token)match(input,28,FOLLOW_20); 

                    					newLeafNode(otherlv_11, grammarAccess.getClassFeatureMemberAccess().getConnectorKeyword_1_2_0());
                    				
                    // InternalAlf.g:1354:5: ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) )
                    // InternalAlf.g:1355:6: (lv_ownedMemberElement_12_0= ruleConnectorDefinition )
                    {
                    // InternalAlf.g:1355:6: (lv_ownedMemberElement_12_0= ruleConnectorDefinition )
                    // InternalAlf.g:1356:7: lv_ownedMemberElement_12_0= ruleConnectorDefinition
                    {

                    							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getOwnedMemberElementConnectorDefinitionParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_12_0=ruleConnectorDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
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
                    // InternalAlf.g:1375:4: ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' )
                    {
                    // InternalAlf.g:1375:4: ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' )
                    // InternalAlf.g:1376:5: ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';'
                    {
                    // InternalAlf.g:1376:5: ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==22||LA31_0==26) ) {
                        alt31=1;
                    }
                    else if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalAlf.g:1377:6: ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? )
                            {
                            // InternalAlf.g:1377:6: ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? )
                            // InternalAlf.g:1378:7: (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )?
                            {
                            // InternalAlf.g:1378:7: (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) )
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==22) ) {
                                alt29=1;
                            }
                            else if ( (LA29_0==26) ) {
                                alt29=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 29, 0, input);

                                throw nvae;
                            }
                            switch (alt29) {
                                case 1 :
                                    // InternalAlf.g:1379:8: otherlv_13= 'feature'
                                    {
                                    otherlv_13=(Token)match(input,22,FOLLOW_8); 

                                    								newLeafNode(otherlv_13, grammarAccess.getClassFeatureMemberAccess().getFeatureKeyword_1_3_0_0_0_0());
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:1384:8: ( (lv_isComposite_14_0= 'part' ) )
                                    {
                                    // InternalAlf.g:1384:8: ( (lv_isComposite_14_0= 'part' ) )
                                    // InternalAlf.g:1385:9: (lv_isComposite_14_0= 'part' )
                                    {
                                    // InternalAlf.g:1385:9: (lv_isComposite_14_0= 'part' )
                                    // InternalAlf.g:1386:10: lv_isComposite_14_0= 'part'
                                    {
                                    lv_isComposite_14_0=(Token)match(input,26,FOLLOW_8); 

                                    										newLeafNode(lv_isComposite_14_0, grammarAccess.getClassFeatureMemberAccess().getIsCompositePartKeyword_1_3_0_0_0_1_0());
                                    									

                                    										if (current==null) {
                                    											current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                                    										}
                                    										setWithLastConsumed(current, "isComposite", true, "part");
                                    									

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalAlf.g:1399:7: ( (lv_memberName_15_0= ruleName ) )?
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt30=1;
                            }
                            switch (alt30) {
                                case 1 :
                                    // InternalAlf.g:1400:8: (lv_memberName_15_0= ruleName )
                                    {
                                    // InternalAlf.g:1400:8: (lv_memberName_15_0= ruleName )
                                    // InternalAlf.g:1401:9: lv_memberName_15_0= ruleName
                                    {

                                    									newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getMemberNameNameParserRuleCall_1_3_0_0_1_0());
                                    								
                                    pushFollow(FOLLOW_9);
                                    lv_memberName_15_0=ruleName();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getClassFeatureMemberRule());
                                    									}
                                    									set(
                                    										current,
                                    										"memberName",
                                    										lv_memberName_15_0,
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
                            // InternalAlf.g:1420:6: ( (lv_memberName_16_0= ruleName ) )
                            {
                            // InternalAlf.g:1420:6: ( (lv_memberName_16_0= ruleName ) )
                            // InternalAlf.g:1421:7: (lv_memberName_16_0= ruleName )
                            {
                            // InternalAlf.g:1421:7: (lv_memberName_16_0= ruleName )
                            // InternalAlf.g:1422:8: lv_memberName_16_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getMemberNameNameParserRuleCall_1_3_0_1_0());
                            							
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


                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,18,FOLLOW_4); 

                    					newLeafNode(otherlv_17, grammarAccess.getClassFeatureMemberAccess().getIsKeyword_1_3_1());
                    				
                    // InternalAlf.g:1444:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1445:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1445:6: ( ruleQualifiedName )
                    // InternalAlf.g:1446:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClassFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getClassFeatureMemberAccess().getMemberElementElementCrossReference_1_3_2_0());
                    						
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_19=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_19, grammarAccess.getClassFeatureMemberAccess().getSemicolonKeyword_1_3_3());
                    				

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
    // InternalAlf.g:1470:1: entryRuleAssociationDeclaration returns [EObject current=null] : iv_ruleAssociationDeclaration= ruleAssociationDeclaration EOF ;
    public final EObject entryRuleAssociationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDeclaration = null;


        try {
            // InternalAlf.g:1470:63: (iv_ruleAssociationDeclaration= ruleAssociationDeclaration EOF )
            // InternalAlf.g:1471:2: iv_ruleAssociationDeclaration= ruleAssociationDeclaration EOF
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
    // InternalAlf.g:1477:1: ruleAssociationDeclaration returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? ) ;
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
            // InternalAlf.g:1483:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? ) )
            // InternalAlf.g:1484:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? )
            {
            // InternalAlf.g:1484:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )? )
            // InternalAlf.g:1485:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )?
            {
            // InternalAlf.g:1485:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==23) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAlf.g:1486:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:1486:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:1487:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,23,FOLLOW_21); 

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
            		
            // InternalAlf.g:1503:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:1504:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:1504:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:1505:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalAlf.g:1522:3: ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==18||LA36_0==24) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAlf.g:1523:4: (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) ) (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )*
                    {
                    // InternalAlf.g:1523:4: (otherlv_3= 'is' | otherlv_4= 'specializes' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==18) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==24) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalAlf.g:1524:5: otherlv_3= 'is'
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_4); 

                            					newLeafNode(otherlv_3, grammarAccess.getAssociationDeclarationAccess().getIsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1529:5: otherlv_4= 'specializes'
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_4); 

                            					newLeafNode(otherlv_4, grammarAccess.getAssociationDeclarationAccess().getSpecializesKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1534:4: ( (lv_ownedMembership_5_0= ruleOwnedGeneralization ) )
                    // InternalAlf.g:1535:5: (lv_ownedMembership_5_0= ruleOwnedGeneralization )
                    {
                    // InternalAlf.g:1535:5: (lv_ownedMembership_5_0= ruleOwnedGeneralization )
                    // InternalAlf.g:1536:6: lv_ownedMembership_5_0= ruleOwnedGeneralization
                    {

                    						newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalAlf.g:1553:4: (otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==25) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalAlf.g:1554:5: otherlv_6= ',' ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) )
                    	    {
                    	    otherlv_6=(Token)match(input,25,FOLLOW_4); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAssociationDeclarationAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:1558:5: ( (lv_ownedMembership_7_0= ruleOwnedGeneralization ) )
                    	    // InternalAlf.g:1559:6: (lv_ownedMembership_7_0= ruleOwnedGeneralization )
                    	    {
                    	    // InternalAlf.g:1559:6: (lv_ownedMembership_7_0= ruleOwnedGeneralization )
                    	    // InternalAlf.g:1560:7: lv_ownedMembership_7_0= ruleOwnedGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationDeclarationAccess().getOwnedMembershipOwnedGeneralizationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop35;
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
    // InternalAlf.g:1583:1: entryRuleAssociationDefinition returns [EObject current=null] : iv_ruleAssociationDefinition= ruleAssociationDefinition EOF ;
    public final EObject entryRuleAssociationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinition = null;


        try {
            // InternalAlf.g:1583:62: (iv_ruleAssociationDefinition= ruleAssociationDefinition EOF )
            // InternalAlf.g:1584:2: iv_ruleAssociationDefinition= ruleAssociationDefinition EOF
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
    // InternalAlf.g:1590:1: ruleAssociationDefinition returns [EObject current=null] : (this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleAssociationMember ) )* otherlv_3= '}' ) ;
    public final EObject ruleAssociationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_AssociationDeclaration_0 = null;

        EObject lv_ownedMembership_2_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1596:2: ( (this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleAssociationMember ) )* otherlv_3= '}' ) )
            // InternalAlf.g:1597:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleAssociationMember ) )* otherlv_3= '}' )
            {
            // InternalAlf.g:1597:2: (this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleAssociationMember ) )* otherlv_3= '}' )
            // InternalAlf.g:1598:3: this_AssociationDeclaration_0= ruleAssociationDeclaration otherlv_1= '{' ( (lv_ownedMembership_2_0= ruleAssociationMember ) )* otherlv_3= '}'
            {

            			newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getAssociationDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_AssociationDeclaration_0=ruleAssociationDeclaration();

            state._fsp--;


            			current = this_AssociationDeclaration_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:1610:3: ( (lv_ownedMembership_2_0= ruleAssociationMember ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_DOCUMENTATION_COMMENT||(LA37_0>=RULE_ID && LA37_0<=RULE_UNRESTRICTED_NAME)||LA37_0==15||(LA37_0>=20 && LA37_0<=23)||(LA37_0>=26 && LA37_0<=29)||(LA37_0>=53 && LA37_0<=59)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAlf.g:1611:4: (lv_ownedMembership_2_0= ruleAssociationMember )
            	    {
            	    // InternalAlf.g:1611:4: (lv_ownedMembership_2_0= ruleAssociationMember )
            	    // InternalAlf.g:1612:5: lv_ownedMembership_2_0= ruleAssociationMember
            	    {

            	    					newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getOwnedMembershipAssociationMemberParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_22);
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
            	    break loop37;
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
    // InternalAlf.g:1637:1: entryRuleAssociationMember returns [EObject current=null] : iv_ruleAssociationMember= ruleAssociationMember EOF ;
    public final EObject entryRuleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationMember = null;


        try {
            // InternalAlf.g:1637:58: (iv_ruleAssociationMember= ruleAssociationMember EOF )
            // InternalAlf.g:1638:2: iv_ruleAssociationMember= ruleAssociationMember EOF
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
    // InternalAlf.g:1644:1: ruleAssociationMember returns [EObject current=null] : (this_NonFeatureMember_0= ruleNonFeatureMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_EndFeatureMember_2= ruleEndFeatureMember ) ;
    public final EObject ruleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureMember_0 = null;

        EObject this_AssociationFeatureMember_1 = null;

        EObject this_EndFeatureMember_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:1650:2: ( (this_NonFeatureMember_0= ruleNonFeatureMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_EndFeatureMember_2= ruleEndFeatureMember ) )
            // InternalAlf.g:1651:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_EndFeatureMember_2= ruleEndFeatureMember )
            {
            // InternalAlf.g:1651:2: (this_NonFeatureMember_0= ruleNonFeatureMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_EndFeatureMember_2= ruleEndFeatureMember )
            int alt38=3;
            switch ( input.LA(1) ) {
            case RULE_DOCUMENTATION_COMMENT:
            case 15:
            case 20:
            case 21:
            case 23:
                {
                alt38=1;
                }
                break;
            case 53:
                {
                switch ( input.LA(2) ) {
                case 22:
                case 26:
                case 27:
                case 28:
                    {
                    alt38=2;
                    }
                    break;
                case 15:
                case 20:
                case 21:
                case 23:
                    {
                    alt38=1;
                    }
                    break;
                case RULE_ID:
                case RULE_UNRESTRICTED_NAME:
                case 29:
                case 57:
                case 58:
                case 59:
                    {
                    alt38=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 2, input);

                    throw nvae;
                }

                }
                break;
            case 54:
                {
                switch ( input.LA(2) ) {
                case 15:
                case 20:
                case 21:
                case 23:
                    {
                    alt38=1;
                    }
                    break;
                case RULE_ID:
                case RULE_UNRESTRICTED_NAME:
                case 29:
                case 57:
                case 58:
                case 59:
                    {
                    alt38=3;
                    }
                    break;
                case 22:
                case 26:
                case 27:
                case 28:
                    {
                    alt38=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 3, input);

                    throw nvae;
                }

                }
                break;
            case 55:
                {
                switch ( input.LA(2) ) {
                case 15:
                case 20:
                case 21:
                case 23:
                    {
                    alt38=1;
                    }
                    break;
                case RULE_ID:
                case RULE_UNRESTRICTED_NAME:
                case 29:
                case 57:
                case 58:
                case 59:
                    {
                    alt38=3;
                    }
                    break;
                case 22:
                case 26:
                case 27:
                case 28:
                    {
                    alt38=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 4, input);

                    throw nvae;
                }

                }
                break;
            case 56:
                {
                switch ( input.LA(2) ) {
                case 22:
                case 26:
                case 27:
                case 28:
                    {
                    alt38=2;
                    }
                    break;
                case 15:
                case 20:
                case 21:
                case 23:
                    {
                    alt38=1;
                    }
                    break;
                case RULE_ID:
                case RULE_UNRESTRICTED_NAME:
                case 29:
                case 57:
                case 58:
                case 59:
                    {
                    alt38=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 5, input);

                    throw nvae;
                }

                }
                break;
            case 22:
            case 26:
            case 27:
            case 28:
                {
                alt38=2;
                }
                break;
            case RULE_ID:
            case RULE_UNRESTRICTED_NAME:
            case 29:
            case 57:
            case 58:
            case 59:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalAlf.g:1652:3: this_NonFeatureMember_0= ruleNonFeatureMember
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
                    // InternalAlf.g:1661:3: this_AssociationFeatureMember_1= ruleAssociationFeatureMember
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
                    // InternalAlf.g:1670:3: this_EndFeatureMember_2= ruleEndFeatureMember
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
    // InternalAlf.g:1682:1: entryRuleAssociationDefinitionOrStub returns [EObject current=null] : iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF ;
    public final EObject entryRuleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinitionOrStub = null;


        try {
            // InternalAlf.g:1682:68: (iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF )
            // InternalAlf.g:1683:2: iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF
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
    // InternalAlf.g:1689:1: ruleAssociationDefinitionOrStub returns [EObject current=null] : this_AssociationDefinition_0= ruleAssociationDefinition ;
    public final EObject ruleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_AssociationDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1695:2: (this_AssociationDefinition_0= ruleAssociationDefinition )
            // InternalAlf.g:1696:2: this_AssociationDefinition_0= ruleAssociationDefinition
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
    // InternalAlf.g:1707:1: entryRuleAssociationFeatureMember returns [EObject current=null] : iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF ;
    public final EObject entryRuleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationFeatureMember = null;


        try {
            // InternalAlf.g:1707:65: (iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF )
            // InternalAlf.g:1708:2: iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF
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
    // InternalAlf.g:1714:1: ruleAssociationFeatureMember returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'connector' ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) ) ) | ( (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) ) ( (lv_memberName_10_0= ruleName ) )? otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) ) ;
    public final EObject ruleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isComposite_2_0=null;
        Token lv_isPort_3_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_isComposite_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Enumerator lv_visibility_0_0 = null;

        Enumerator lv_direction_4_0 = null;

        EObject lv_ownedMemberElement_5_0 = null;

        EObject lv_ownedMemberElement_7_0 = null;

        AntlrDatatypeRuleToken lv_memberName_10_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1720:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'connector' ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) ) ) | ( (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) ) ( (lv_memberName_10_0= ruleName ) )? otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) ) )
            // InternalAlf.g:1721:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'connector' ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) ) ) | ( (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) ) ( (lv_memberName_10_0= ruleName ) )? otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) )
            {
            // InternalAlf.g:1721:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'connector' ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) ) ) | ( (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) ) ( (lv_memberName_10_0= ruleName ) )? otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) )
            // InternalAlf.g:1722:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'connector' ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) ) ) | ( (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) ) ( (lv_memberName_10_0= ruleName ) )? otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) )
            {
            // InternalAlf.g:1722:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=53 && LA39_0<=56)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAlf.g:1723:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:1723:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    // InternalAlf.g:1724:5: lv_visibility_0_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_visibility_0_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssociationFeatureMemberRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"org.omg.sysml.Alf.VisibilityIndicator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:1741:3: ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'connector' ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) ) ) | ( (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) ) ( (lv_memberName_10_0= ruleName ) )? otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) )
            int alt44=3;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // InternalAlf.g:1742:4: ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1742:4: ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) ) )
                    // InternalAlf.g:1743:5: (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) )
                    {
                    // InternalAlf.g:1743:5: (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )
                    int alt40=3;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt40=1;
                        }
                        break;
                    case 26:
                        {
                        alt40=2;
                        }
                        break;
                    case 27:
                        {
                        alt40=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }

                    switch (alt40) {
                        case 1 :
                            // InternalAlf.g:1744:6: otherlv_1= 'feature'
                            {
                            otherlv_1=(Token)match(input,22,FOLLOW_24); 

                            						newLeafNode(otherlv_1, grammarAccess.getAssociationFeatureMemberAccess().getFeatureKeyword_1_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1749:6: ( (lv_isComposite_2_0= 'part' ) )
                            {
                            // InternalAlf.g:1749:6: ( (lv_isComposite_2_0= 'part' ) )
                            // InternalAlf.g:1750:7: (lv_isComposite_2_0= 'part' )
                            {
                            // InternalAlf.g:1750:7: (lv_isComposite_2_0= 'part' )
                            // InternalAlf.g:1751:8: lv_isComposite_2_0= 'part'
                            {
                            lv_isComposite_2_0=(Token)match(input,26,FOLLOW_24); 

                            								newLeafNode(lv_isComposite_2_0, grammarAccess.getAssociationFeatureMemberAccess().getIsCompositePartKeyword_1_0_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isComposite", true, "part");
                            							

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalAlf.g:1764:6: ( (lv_isPort_3_0= 'port' ) )
                            {
                            // InternalAlf.g:1764:6: ( (lv_isPort_3_0= 'port' ) )
                            // InternalAlf.g:1765:7: (lv_isPort_3_0= 'port' )
                            {
                            // InternalAlf.g:1765:7: (lv_isPort_3_0= 'port' )
                            // InternalAlf.g:1766:8: lv_isPort_3_0= 'port'
                            {
                            lv_isPort_3_0=(Token)match(input,27,FOLLOW_24); 

                            								newLeafNode(lv_isPort_3_0, grammarAccess.getAssociationFeatureMemberAccess().getIsPortPortKeyword_1_0_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isPort", true, "port");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1779:5: ( (lv_direction_4_0= ruleFeatureDirection ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( ((LA41_0>=57 && LA41_0<=59)) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalAlf.g:1780:6: (lv_direction_4_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1780:6: (lv_direction_4_0= ruleFeatureDirection )
                            // InternalAlf.g:1781:7: lv_direction_4_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_24);
                            lv_direction_4_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAssociationFeatureMemberRule());
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

                    // InternalAlf.g:1798:5: ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) )
                    // InternalAlf.g:1799:6: (lv_ownedMemberElement_5_0= ruleFeatureDefinition )
                    {
                    // InternalAlf.g:1799:6: (lv_ownedMemberElement_5_0= ruleFeatureDefinition )
                    // InternalAlf.g:1800:7: lv_ownedMemberElement_5_0= ruleFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getOwnedMemberElementFeatureDefinitionParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_5_0=ruleFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_5_0,
                    								"org.omg.sysml.Alf.FeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:1819:4: (otherlv_6= 'connector' ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) ) )
                    {
                    // InternalAlf.g:1819:4: (otherlv_6= 'connector' ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) ) )
                    // InternalAlf.g:1820:5: otherlv_6= 'connector' ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_20); 

                    					newLeafNode(otherlv_6, grammarAccess.getAssociationFeatureMemberAccess().getConnectorKeyword_1_1_0());
                    				
                    // InternalAlf.g:1824:5: ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) )
                    // InternalAlf.g:1825:6: (lv_ownedMemberElement_7_0= ruleConnectorDefinition )
                    {
                    // InternalAlf.g:1825:6: (lv_ownedMemberElement_7_0= ruleConnectorDefinition )
                    // InternalAlf.g:1826:7: lv_ownedMemberElement_7_0= ruleConnectorDefinition
                    {

                    							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getOwnedMemberElementConnectorDefinitionParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_7_0=ruleConnectorDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAssociationFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_7_0,
                    								"org.omg.sysml.Alf.ConnectorDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1845:4: ( (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) ) ( (lv_memberName_10_0= ruleName ) )? otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' )
                    {
                    // InternalAlf.g:1845:4: ( (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) ) ( (lv_memberName_10_0= ruleName ) )? otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' )
                    // InternalAlf.g:1846:5: (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) ) ( (lv_memberName_10_0= ruleName ) )? otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';'
                    {
                    // InternalAlf.g:1846:5: (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==22) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==26) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalAlf.g:1847:6: otherlv_8= 'feature'
                            {
                            otherlv_8=(Token)match(input,22,FOLLOW_8); 

                            						newLeafNode(otherlv_8, grammarAccess.getAssociationFeatureMemberAccess().getFeatureKeyword_1_2_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1852:6: ( (lv_isComposite_9_0= 'part' ) )
                            {
                            // InternalAlf.g:1852:6: ( (lv_isComposite_9_0= 'part' ) )
                            // InternalAlf.g:1853:7: (lv_isComposite_9_0= 'part' )
                            {
                            // InternalAlf.g:1853:7: (lv_isComposite_9_0= 'part' )
                            // InternalAlf.g:1854:8: lv_isComposite_9_0= 'part'
                            {
                            lv_isComposite_9_0=(Token)match(input,26,FOLLOW_8); 

                            								newLeafNode(lv_isComposite_9_0, grammarAccess.getAssociationFeatureMemberAccess().getIsCompositePartKeyword_1_2_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
                            								}
                            								setWithLastConsumed(current, "isComposite", true, "part");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalAlf.g:1867:5: ( (lv_memberName_10_0= ruleName ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalAlf.g:1868:6: (lv_memberName_10_0= ruleName )
                            {
                            // InternalAlf.g:1868:6: (lv_memberName_10_0= ruleName )
                            // InternalAlf.g:1869:7: lv_memberName_10_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_1_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_memberName_10_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAssociationFeatureMemberRule());
                            							}
                            							set(
                            								current,
                            								"memberName",
                            								lv_memberName_10_0,
                            								"org.omg.sysml.Alf.Name");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_4); 

                    					newLeafNode(otherlv_11, grammarAccess.getAssociationFeatureMemberAccess().getIsKeyword_1_2_2());
                    				
                    // InternalAlf.g:1890:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1891:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1891:6: ( ruleQualifiedName )
                    // InternalAlf.g:1892:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getMemberElementElementCrossReference_1_2_3_0());
                    						
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_13=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_13, grammarAccess.getAssociationFeatureMemberAccess().getSemicolonKeyword_1_2_4());
                    				

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
    // InternalAlf.g:1916:1: entryRuleEndFeatureMember returns [EObject current=null] : iv_ruleEndFeatureMember= ruleEndFeatureMember EOF ;
    public final EObject entryRuleEndFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndFeatureMember = null;


        try {
            // InternalAlf.g:1916:57: (iv_ruleEndFeatureMember= ruleEndFeatureMember EOF )
            // InternalAlf.g:1917:2: iv_ruleEndFeatureMember= ruleEndFeatureMember EOF
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
    // InternalAlf.g:1923:1: ruleEndFeatureMember returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'end' )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'end' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) ) ) ;
    public final EObject ruleEndFeatureMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_visibility_0_0 = null;

        Enumerator lv_direction_2_0 = null;

        EObject lv_ownedMemberElement_3_0 = null;

        Enumerator lv_direction_5_0 = null;

        EObject lv_ownedMemberElement_6_0 = null;

        AntlrDatatypeRuleToken lv_memberName_8_0 = null;

        AntlrDatatypeRuleToken lv_memberName_9_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1929:2: ( ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'end' )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'end' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) ) ) )
            // InternalAlf.g:1930:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'end' )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'end' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) ) )
            {
            // InternalAlf.g:1930:2: ( ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'end' )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'end' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) ) )
            // InternalAlf.g:1931:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )? ( ( (otherlv_1= 'end' )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'end' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) )
            {
            // InternalAlf.g:1931:3: ( (lv_visibility_0_0= ruleVisibilityIndicator ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=53 && LA45_0<=56)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAlf.g:1932:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:1932:4: (lv_visibility_0_0= ruleVisibilityIndicator )
                    // InternalAlf.g:1933:5: lv_visibility_0_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_25);
                    lv_visibility_0_0=ruleVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"org.omg.sysml.Alf.VisibilityIndicator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:1950:3: ( ( (otherlv_1= 'end' )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'end' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) )
            int alt51=3;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // InternalAlf.g:1951:4: ( (otherlv_1= 'end' )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1951:4: ( (otherlv_1= 'end' )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1952:5: (otherlv_1= 'end' )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1952:5: (otherlv_1= 'end' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==29) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalAlf.g:1953:6: otherlv_1= 'end'
                            {
                            otherlv_1=(Token)match(input,29,FOLLOW_18); 

                            						newLeafNode(otherlv_1, grammarAccess.getEndFeatureMemberAccess().getEndKeyword_1_0_0());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:1958:5: ( (lv_direction_2_0= ruleFeatureDirection ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( ((LA47_0>=57 && LA47_0<=59)) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalAlf.g:1959:6: (lv_direction_2_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1959:6: (lv_direction_2_0= ruleFeatureDirection )
                            // InternalAlf.g:1960:7: lv_direction_2_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_4);
                            lv_direction_2_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
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

                    // InternalAlf.g:1977:5: ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1978:6: (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1978:6: (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1979:7: lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getOwnedMemberElementNamedFeatureDefinitionParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_3_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
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
                    // InternalAlf.g:1998:4: (otherlv_4= 'end' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1998:4: (otherlv_4= 'end' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:1999:5: otherlv_4= 'end' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_19); 

                    					newLeafNode(otherlv_4, grammarAccess.getEndFeatureMemberAccess().getEndKeyword_1_1_0());
                    				
                    // InternalAlf.g:2003:5: ( (lv_direction_5_0= ruleFeatureDirection ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( ((LA48_0>=57 && LA48_0<=59)) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalAlf.g:2004:6: (lv_direction_5_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2004:6: (lv_direction_5_0= ruleFeatureDirection )
                            // InternalAlf.g:2005:7: lv_direction_5_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_12);
                            lv_direction_5_0=ruleFeatureDirection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
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

                    // InternalAlf.g:2022:5: ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:2023:6: (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:2023:6: (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:2024:7: lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getOwnedMemberElementUnnamedFeatureDefinitionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_6_0=ruleUnnamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
                    							}
                    							set(
                    								current,
                    								"ownedMemberElement",
                    								lv_ownedMemberElement_6_0,
                    								"org.omg.sysml.Alf.UnnamedFeatureDefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:2043:4: ( ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' )
                    {
                    // InternalAlf.g:2043:4: ( ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' )
                    // InternalAlf.g:2044:5: ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';'
                    {
                    // InternalAlf.g:2044:5: ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==29) ) {
                        alt50=1;
                    }
                    else if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt50=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalAlf.g:2045:6: (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? )
                            {
                            // InternalAlf.g:2045:6: (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? )
                            // InternalAlf.g:2046:7: otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )?
                            {
                            otherlv_7=(Token)match(input,29,FOLLOW_8); 

                            							newLeafNode(otherlv_7, grammarAccess.getEndFeatureMemberAccess().getEndKeyword_1_2_0_0_0());
                            						
                            // InternalAlf.g:2050:7: ( (lv_memberName_8_0= ruleName ) )?
                            int alt49=2;
                            int LA49_0 = input.LA(1);

                            if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt49=1;
                            }
                            switch (alt49) {
                                case 1 :
                                    // InternalAlf.g:2051:8: (lv_memberName_8_0= ruleName )
                                    {
                                    // InternalAlf.g:2051:8: (lv_memberName_8_0= ruleName )
                                    // InternalAlf.g:2052:9: lv_memberName_8_0= ruleName
                                    {

                                    									newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_0_0_1_0());
                                    								
                                    pushFollow(FOLLOW_9);
                                    lv_memberName_8_0=ruleName();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getEndFeatureMemberRule());
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


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2071:6: ( (lv_memberName_9_0= ruleName ) )
                            {
                            // InternalAlf.g:2071:6: ( (lv_memberName_9_0= ruleName ) )
                            // InternalAlf.g:2072:7: (lv_memberName_9_0= ruleName )
                            {
                            // InternalAlf.g:2072:7: (lv_memberName_9_0= ruleName )
                            // InternalAlf.g:2073:8: lv_memberName_9_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getMemberNameNameParserRuleCall_1_2_0_1_0());
                            							
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


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,18,FOLLOW_4); 

                    					newLeafNode(otherlv_10, grammarAccess.getEndFeatureMemberAccess().getIsKeyword_1_2_1());
                    				
                    // InternalAlf.g:2095:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:2096:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:2096:6: ( ruleQualifiedName )
                    // InternalAlf.g:2097:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEndFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getEndFeatureMemberAccess().getMemberElementElementCrossReference_1_2_2_0());
                    						
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_12=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_12, grammarAccess.getEndFeatureMemberAccess().getSemicolonKeyword_1_2_3());
                    				

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
    // InternalAlf.g:2121:1: entryRuleFeatureDefinition returns [EObject current=null] : iv_ruleFeatureDefinition= ruleFeatureDefinition EOF ;
    public final EObject entryRuleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDefinition = null;


        try {
            // InternalAlf.g:2121:58: (iv_ruleFeatureDefinition= ruleFeatureDefinition EOF )
            // InternalAlf.g:2122:2: iv_ruleFeatureDefinition= ruleFeatureDefinition EOF
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
    // InternalAlf.g:2128:1: ruleFeatureDefinition returns [EObject current=null] : (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) ;
    public final EObject ruleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_NamedFeatureDefinition_0 = null;

        EObject this_UnnamedFeatureDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:2134:2: ( (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) )
            // InternalAlf.g:2135:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            {
            // InternalAlf.g:2135:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt52=1;
            }
            else if ( (LA52_0==18||(LA52_0>=37 && LA52_0<=38)) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalAlf.g:2136:3: this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:2145:3: this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition
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
    // InternalAlf.g:2157:1: entryRuleNamedFeatureDefinition returns [EObject current=null] : iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF ;
    public final EObject entryRuleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedFeatureDefinition = null;


        try {
            // InternalAlf.g:2157:63: (iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF )
            // InternalAlf.g:2158:2: iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF
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
    // InternalAlf.g:2164:1: ruleNamedFeatureDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) | ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) ) ) ) ;
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
            // InternalAlf.g:2170:2: ( ( ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) | ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) ) ) ) )
            // InternalAlf.g:2171:2: ( ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) | ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) ) ) )
            {
            // InternalAlf.g:2171:2: ( ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) | ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) ) ) )
            // InternalAlf.g:2172:3: ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) | ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) ) )
            {
            // InternalAlf.g:2172:3: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:2173:4: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:2173:4: (lv_name_0_0= ruleName )
            // InternalAlf.g:2174:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalAlf.g:2191:3: ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) ) | ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==16||LA70_0==19||LA70_0==30||LA70_0==33||LA70_0==36) ) {
                alt70=1;
            }
            else if ( (LA70_0==18||(LA70_0>=37 && LA70_0<=38)) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalAlf.g:2192:4: ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) )
                    {
                    // InternalAlf.g:2192:4: ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) ) )
                    // InternalAlf.g:2193:5: (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) )
                    {
                    // InternalAlf.g:2193:5: (otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )? )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==30) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalAlf.g:2194:6: otherlv_1= ':' ( (lv_isComposite_2_0= 'composes' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )?
                            {
                            otherlv_1=(Token)match(input,30,FOLLOW_27); 

                            						newLeafNode(otherlv_1, grammarAccess.getNamedFeatureDefinitionAccess().getColonKeyword_1_0_0_0());
                            					
                            // InternalAlf.g:2198:6: ( (lv_isComposite_2_0= 'composes' ) )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==31) ) {
                                alt53=1;
                            }
                            switch (alt53) {
                                case 1 :
                                    // InternalAlf.g:2199:7: (lv_isComposite_2_0= 'composes' )
                                    {
                                    // InternalAlf.g:2199:7: (lv_isComposite_2_0= 'composes' )
                                    // InternalAlf.g:2200:8: lv_isComposite_2_0= 'composes'
                                    {
                                    lv_isComposite_2_0=(Token)match(input,31,FOLLOW_28); 

                                    								newLeafNode(lv_isComposite_2_0, grammarAccess.getNamedFeatureDefinitionAccess().getIsCompositeComposesKeyword_1_0_0_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getNamedFeatureDefinitionRule());
                                    								}
                                    								setWithLastConsumed(current, "isComposite", true, "composes");
                                    							

                                    }


                                    }
                                    break;

                            }

                            // InternalAlf.g:2212:6: ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' )
                            int alt54=2;
                            int LA54_0 = input.LA(1);

                            if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt54=1;
                            }
                            else if ( (LA54_0==32) ) {
                                alt54=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 54, 0, input);

                                throw nvae;
                            }
                            switch (alt54) {
                                case 1 :
                                    // InternalAlf.g:2213:7: ( ( ruleQualifiedName ) )
                                    {
                                    // InternalAlf.g:2213:7: ( ( ruleQualifiedName ) )
                                    // InternalAlf.g:2214:8: ( ruleQualifiedName )
                                    {
                                    // InternalAlf.g:2214:8: ( ruleQualifiedName )
                                    // InternalAlf.g:2215:9: ruleQualifiedName
                                    {

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getNamedFeatureDefinitionRule());
                                    									}
                                    								

                                    									newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getReferencedTypeClassCrossReference_1_0_0_2_0_0());
                                    								
                                    pushFollow(FOLLOW_29);
                                    ruleQualifiedName();

                                    state._fsp--;


                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:2230:7: otherlv_4= 'any'
                                    {
                                    otherlv_4=(Token)match(input,32,FOLLOW_29); 

                                    							newLeafNode(otherlv_4, grammarAccess.getNamedFeatureDefinitionAccess().getAnyKeyword_1_0_0_2_1());
                                    						

                                    }
                                    break;

                            }

                            // InternalAlf.g:2235:6: ( (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset ) )?
                            int alt55=2;
                            int LA55_0 = input.LA(1);

                            if ( (LA55_0==18||(LA55_0>=37 && LA55_0<=38)) ) {
                                alt55=1;
                            }
                            switch (alt55) {
                                case 1 :
                                    // InternalAlf.g:2236:7: (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset )
                                    {
                                    // InternalAlf.g:2236:7: (lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset )
                                    // InternalAlf.g:2237:8: lv_ownedMembership_5_0= ruleOwnedRedefinitionOrSubset
                                    {

                                    								newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_0_0_3_0());
                                    							
                                    pushFollow(FOLLOW_30);
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

                    // InternalAlf.g:2255:5: (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==33) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalAlf.g:2256:6: otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']'
                            {
                            otherlv_6=(Token)match(input,33,FOLLOW_31); 

                            						newLeafNode(otherlv_6, grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_0_1_0());
                            					
                            // InternalAlf.g:2260:6: ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )?
                            int alt57=2;
                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==RULE_NATURAL_VALUE) ) {
                                int LA57_1 = input.LA(2);

                                if ( (LA57_1==34) ) {
                                    alt57=1;
                                }
                            }
                            switch (alt57) {
                                case 1 :
                                    // InternalAlf.g:2261:7: ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..'
                                    {
                                    // InternalAlf.g:2261:7: ( (lv_lower_7_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:2262:8: (lv_lower_7_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:2262:8: (lv_lower_7_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:2263:9: lv_lower_7_0= ruleNaturalLiteralExpression
                                    {

                                    									newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_1_1_0_0());
                                    								
                                    pushFollow(FOLLOW_32);
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

                                    otherlv_8=(Token)match(input,34,FOLLOW_31); 

                                    							newLeafNode(otherlv_8, grammarAccess.getNamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_0_1_1_1());
                                    						

                                    }
                                    break;

                            }

                            // InternalAlf.g:2285:6: ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:2286:7: (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:2286:7: (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:2287:8: lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression
                            {

                            								newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_0_1_2_0());
                            							
                            pushFollow(FOLLOW_33);
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

                            otherlv_10=(Token)match(input,35,FOLLOW_34); 

                            						newLeafNode(otherlv_10, grammarAccess.getNamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_0_1_3());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:2309:5: (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==36) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalAlf.g:2310:6: otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) )
                            {
                            otherlv_11=(Token)match(input,36,FOLLOW_35); 

                            						newLeafNode(otherlv_11, grammarAccess.getNamedFeatureDefinitionAccess().getEqualsSignKeyword_1_0_2_0());
                            					
                            // InternalAlf.g:2314:6: ( (lv_value_12_0= ruleExpression ) )
                            // InternalAlf.g:2315:7: (lv_value_12_0= ruleExpression )
                            {
                            // InternalAlf.g:2315:7: (lv_value_12_0= ruleExpression )
                            // InternalAlf.g:2316:8: lv_value_12_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_0_2_1_0());
                            							
                            pushFollow(FOLLOW_36);
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

                    // InternalAlf.g:2334:5: (otherlv_13= ';' | (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' ) )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==19) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==16) ) {
                        alt61=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalAlf.g:2335:6: otherlv_13= ';'
                            {
                            otherlv_13=(Token)match(input,19,FOLLOW_2); 

                            						newLeafNode(otherlv_13, grammarAccess.getNamedFeatureDefinitionAccess().getSemicolonKeyword_1_0_3_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2340:6: (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' )
                            {
                            // InternalAlf.g:2340:6: (otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}' )
                            // InternalAlf.g:2341:7: otherlv_14= '{' ( (lv_ownedMembership_15_0= ruleClassMember ) )* otherlv_16= '}'
                            {
                            otherlv_14=(Token)match(input,16,FOLLOW_16); 

                            							newLeafNode(otherlv_14, grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_3_1_0());
                            						
                            // InternalAlf.g:2345:7: ( (lv_ownedMembership_15_0= ruleClassMember ) )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==RULE_DOCUMENTATION_COMMENT||(LA60_0>=RULE_ID && LA60_0<=RULE_UNRESTRICTED_NAME)||LA60_0==15||(LA60_0>=20 && LA60_0<=23)||(LA60_0>=26 && LA60_0<=28)||(LA60_0>=53 && LA60_0<=59)) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // InternalAlf.g:2346:8: (lv_ownedMembership_15_0= ruleClassMember )
                            	    {
                            	    // InternalAlf.g:2346:8: (lv_ownedMembership_15_0= ruleClassMember )
                            	    // InternalAlf.g:2347:9: lv_ownedMembership_15_0= ruleClassMember
                            	    {

                            	    									newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_0_3_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_16);
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
                            	    break loop60;
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
                    // InternalAlf.g:2372:4: ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) )
                    {
                    // InternalAlf.g:2372:4: ( ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) ) )
                    // InternalAlf.g:2373:5: ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) )
                    {
                    // InternalAlf.g:2373:5: ( (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset ) )
                    // InternalAlf.g:2374:6: (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset )
                    {
                    // InternalAlf.g:2374:6: (lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset )
                    // InternalAlf.g:2375:7: lv_ownedMembership_17_0= ruleOwnedRedefinitionOrSubset
                    {

                    							newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_37);
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

                    // InternalAlf.g:2392:5: ( ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) ) | (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' ) )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==33) ) {
                        int LA69_1 = input.LA(2);

                        if ( (LA69_1==RULE_NATURAL_VALUE) ) {
                            int LA69_3 = input.LA(3);

                            if ( (LA69_3==35) ) {
                                int LA69_5 = input.LA(4);

                                if ( (LA69_5==19) ) {
                                    alt69=2;
                                }
                                else if ( (LA69_5==16||LA69_5==36) ) {
                                    alt69=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 69, 5, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA69_3==34) ) {
                                int LA69_6 = input.LA(4);

                                if ( (LA69_6==RULE_NATURAL_VALUE) ) {
                                    int LA69_8 = input.LA(5);

                                    if ( (LA69_8==35) ) {
                                        int LA69_5 = input.LA(6);

                                        if ( (LA69_5==19) ) {
                                            alt69=2;
                                        }
                                        else if ( (LA69_5==16||LA69_5==36) ) {
                                            alt69=1;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 69, 5, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 69, 8, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA69_6==43) ) {
                                    int LA69_4 = input.LA(5);

                                    if ( (LA69_4==35) ) {
                                        int LA69_5 = input.LA(6);

                                        if ( (LA69_5==19) ) {
                                            alt69=2;
                                        }
                                        else if ( (LA69_5==16||LA69_5==36) ) {
                                            alt69=1;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 69, 5, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 69, 4, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 69, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 69, 3, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA69_1==43) ) {
                            int LA69_4 = input.LA(3);

                            if ( (LA69_4==35) ) {
                                int LA69_5 = input.LA(4);

                                if ( (LA69_5==19) ) {
                                    alt69=2;
                                }
                                else if ( (LA69_5==16||LA69_5==36) ) {
                                    alt69=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 69, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 69, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 69, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA69_0==16||LA69_0==36) ) {
                        alt69=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalAlf.g:2393:6: ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) )
                            {
                            // InternalAlf.g:2393:6: ( (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) ) )
                            // InternalAlf.g:2394:7: (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )? ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) )
                            {
                            // InternalAlf.g:2394:7: (otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']' )?
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==33) ) {
                                alt63=1;
                            }
                            switch (alt63) {
                                case 1 :
                                    // InternalAlf.g:2395:8: otherlv_18= '[' ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )? ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_22= ']'
                                    {
                                    otherlv_18=(Token)match(input,33,FOLLOW_31); 

                                    								newLeafNode(otherlv_18, grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_1_0_0_0());
                                    							
                                    // InternalAlf.g:2399:8: ( ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..' )?
                                    int alt62=2;
                                    int LA62_0 = input.LA(1);

                                    if ( (LA62_0==RULE_NATURAL_VALUE) ) {
                                        int LA62_1 = input.LA(2);

                                        if ( (LA62_1==34) ) {
                                            alt62=1;
                                        }
                                    }
                                    switch (alt62) {
                                        case 1 :
                                            // InternalAlf.g:2400:9: ( (lv_lower_19_0= ruleNaturalLiteralExpression ) ) otherlv_20= '..'
                                            {
                                            // InternalAlf.g:2400:9: ( (lv_lower_19_0= ruleNaturalLiteralExpression ) )
                                            // InternalAlf.g:2401:10: (lv_lower_19_0= ruleNaturalLiteralExpression )
                                            {
                                            // InternalAlf.g:2401:10: (lv_lower_19_0= ruleNaturalLiteralExpression )
                                            // InternalAlf.g:2402:11: lv_lower_19_0= ruleNaturalLiteralExpression
                                            {

                                            											newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_1_0_0_1_0_0());
                                            										
                                            pushFollow(FOLLOW_32);
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

                                            otherlv_20=(Token)match(input,34,FOLLOW_31); 

                                            									newLeafNode(otherlv_20, grammarAccess.getNamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_1_0_0_1_1());
                                            								

                                            }
                                            break;

                                    }

                                    // InternalAlf.g:2424:8: ( (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression ) )
                                    // InternalAlf.g:2425:9: (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:2425:9: (lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression )
                                    // InternalAlf.g:2426:10: lv_upper_21_0= ruleUnlimitedNaturalLiteralExpression
                                    {

                                    										newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_1_0_0_2_0());
                                    									
                                    pushFollow(FOLLOW_33);
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

                                    otherlv_22=(Token)match(input,35,FOLLOW_38); 

                                    								newLeafNode(otherlv_22, grammarAccess.getNamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_1_0_0_3());
                                    							

                                    }
                                    break;

                            }

                            // InternalAlf.g:2448:7: ( (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) ) | (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' ) )
                            int alt67=2;
                            int LA67_0 = input.LA(1);

                            if ( (LA67_0==36) ) {
                                alt67=1;
                            }
                            else if ( (LA67_0==16) ) {
                                alt67=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 67, 0, input);

                                throw nvae;
                            }
                            switch (alt67) {
                                case 1 :
                                    // InternalAlf.g:2449:8: (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) )
                                    {
                                    // InternalAlf.g:2449:8: (otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) ) )
                                    // InternalAlf.g:2450:9: otherlv_23= '=' ( (lv_value_24_0= ruleExpression ) ) (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) )
                                    {
                                    otherlv_23=(Token)match(input,36,FOLLOW_35); 

                                    									newLeafNode(otherlv_23, grammarAccess.getNamedFeatureDefinitionAccess().getEqualsSignKeyword_1_1_1_0_1_0_0());
                                    								
                                    // InternalAlf.g:2454:9: ( (lv_value_24_0= ruleExpression ) )
                                    // InternalAlf.g:2455:10: (lv_value_24_0= ruleExpression )
                                    {
                                    // InternalAlf.g:2455:10: (lv_value_24_0= ruleExpression )
                                    // InternalAlf.g:2456:11: lv_value_24_0= ruleExpression
                                    {

                                    											newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_1_1_0_1_0_1_0());
                                    										
                                    pushFollow(FOLLOW_36);
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

                                    // InternalAlf.g:2473:9: (otherlv_25= ';' | (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' ) )
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
                                            // InternalAlf.g:2474:10: otherlv_25= ';'
                                            {
                                            otherlv_25=(Token)match(input,19,FOLLOW_2); 

                                            										newLeafNode(otherlv_25, grammarAccess.getNamedFeatureDefinitionAccess().getSemicolonKeyword_1_1_1_0_1_0_2_0());
                                            									

                                            }
                                            break;
                                        case 2 :
                                            // InternalAlf.g:2479:10: (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' )
                                            {
                                            // InternalAlf.g:2479:10: (otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}' )
                                            // InternalAlf.g:2480:11: otherlv_26= '{' ( (lv_ownedMembership_27_0= ruleClassMember ) )* otherlv_28= '}'
                                            {
                                            otherlv_26=(Token)match(input,16,FOLLOW_16); 

                                            											newLeafNode(otherlv_26, grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_1_1_0_1_0_2_1_0());
                                            										
                                            // InternalAlf.g:2484:11: ( (lv_ownedMembership_27_0= ruleClassMember ) )*
                                            loop64:
                                            do {
                                                int alt64=2;
                                                int LA64_0 = input.LA(1);

                                                if ( (LA64_0==RULE_DOCUMENTATION_COMMENT||(LA64_0>=RULE_ID && LA64_0<=RULE_UNRESTRICTED_NAME)||LA64_0==15||(LA64_0>=20 && LA64_0<=23)||(LA64_0>=26 && LA64_0<=28)||(LA64_0>=53 && LA64_0<=59)) ) {
                                                    alt64=1;
                                                }


                                                switch (alt64) {
                                            	case 1 :
                                            	    // InternalAlf.g:2485:12: (lv_ownedMembership_27_0= ruleClassMember )
                                            	    {
                                            	    // InternalAlf.g:2485:12: (lv_ownedMembership_27_0= ruleClassMember )
                                            	    // InternalAlf.g:2486:13: lv_ownedMembership_27_0= ruleClassMember
                                            	    {

                                            	    													newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_1_1_0_1_0_2_1_1_0());
                                            	    												
                                            	    pushFollow(FOLLOW_16);
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
                                            	    break loop64;
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
                                    // InternalAlf.g:2511:8: (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' )
                                    {
                                    // InternalAlf.g:2511:8: (otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}' )
                                    // InternalAlf.g:2512:9: otherlv_29= '{' ( (lv_ownedMembership_30_0= ruleClassMember ) )* otherlv_31= '}'
                                    {
                                    otherlv_29=(Token)match(input,16,FOLLOW_16); 

                                    									newLeafNode(otherlv_29, grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_1_1_0_1_1_0());
                                    								
                                    // InternalAlf.g:2516:9: ( (lv_ownedMembership_30_0= ruleClassMember ) )*
                                    loop66:
                                    do {
                                        int alt66=2;
                                        int LA66_0 = input.LA(1);

                                        if ( (LA66_0==RULE_DOCUMENTATION_COMMENT||(LA66_0>=RULE_ID && LA66_0<=RULE_UNRESTRICTED_NAME)||LA66_0==15||(LA66_0>=20 && LA66_0<=23)||(LA66_0>=26 && LA66_0<=28)||(LA66_0>=53 && LA66_0<=59)) ) {
                                            alt66=1;
                                        }


                                        switch (alt66) {
                                    	case 1 :
                                    	    // InternalAlf.g:2517:10: (lv_ownedMembership_30_0= ruleClassMember )
                                    	    {
                                    	    // InternalAlf.g:2517:10: (lv_ownedMembership_30_0= ruleClassMember )
                                    	    // InternalAlf.g:2518:11: lv_ownedMembership_30_0= ruleClassMember
                                    	    {

                                    	    											newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_1_1_0_1_1_1_0());
                                    	    										
                                    	    pushFollow(FOLLOW_16);
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
                                    	    break loop66;
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
                            // InternalAlf.g:2543:6: (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' )
                            {
                            // InternalAlf.g:2543:6: (otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';' )
                            // InternalAlf.g:2544:7: otherlv_32= '[' ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )? ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_36= ']' otherlv_37= ';'
                            {
                            otherlv_32=(Token)match(input,33,FOLLOW_31); 

                            							newLeafNode(otherlv_32, grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_1_1_0());
                            						
                            // InternalAlf.g:2548:7: ( ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..' )?
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==RULE_NATURAL_VALUE) ) {
                                int LA68_1 = input.LA(2);

                                if ( (LA68_1==34) ) {
                                    alt68=1;
                                }
                            }
                            switch (alt68) {
                                case 1 :
                                    // InternalAlf.g:2549:8: ( (lv_lower_33_0= ruleNaturalLiteralExpression ) ) otherlv_34= '..'
                                    {
                                    // InternalAlf.g:2549:8: ( (lv_lower_33_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:2550:9: (lv_lower_33_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:2550:9: (lv_lower_33_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:2551:10: lv_lower_33_0= ruleNaturalLiteralExpression
                                    {

                                    										newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_1_1_1_0_0());
                                    									
                                    pushFollow(FOLLOW_32);
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

                                    otherlv_34=(Token)match(input,34,FOLLOW_31); 

                                    								newLeafNode(otherlv_34, grammarAccess.getNamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_1_1_1_1());
                                    							

                                    }
                                    break;

                            }

                            // InternalAlf.g:2573:7: ( (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:2574:8: (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:2574:8: (lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:2575:9: lv_upper_35_0= ruleUnlimitedNaturalLiteralExpression
                            {

                            									newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_1_1_2_0());
                            								
                            pushFollow(FOLLOW_33);
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
    // InternalAlf.g:2608:1: entryRuleUnnamedFeatureDefinition returns [EObject current=null] : iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF ;
    public final EObject entryRuleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedFeatureDefinition = null;


        try {
            // InternalAlf.g:2608:65: (iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF )
            // InternalAlf.g:2609:2: iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF
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
    // InternalAlf.g:2615:1: ruleUnnamedFeatureDefinition returns [EObject current=null] : ( ( (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' ) ) ) ;
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
            // InternalAlf.g:2621:2: ( ( ( (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' ) ) ) )
            // InternalAlf.g:2622:2: ( ( (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' ) ) )
            {
            // InternalAlf.g:2622:2: ( ( (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' ) ) )
            // InternalAlf.g:2623:3: ( (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' ) )
            {
            // InternalAlf.g:2623:3: ( (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset ) )
            // InternalAlf.g:2624:4: (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset )
            {
            // InternalAlf.g:2624:4: (lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset )
            // InternalAlf.g:2625:5: lv_ownedMembership_0_0= ruleOwnedRedefinitionOrSubset
            {

            					newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipOwnedRedefinitionOrSubsetParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_37);
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

            // InternalAlf.g:2642:3: ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) ) | (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==33) ) {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==RULE_NATURAL_VALUE) ) {
                    int LA78_3 = input.LA(3);

                    if ( (LA78_3==35) ) {
                        int LA78_5 = input.LA(4);

                        if ( (LA78_5==16||LA78_5==36) ) {
                            alt78=1;
                        }
                        else if ( (LA78_5==19) ) {
                            alt78=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 78, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA78_3==34) ) {
                        int LA78_6 = input.LA(4);

                        if ( (LA78_6==RULE_NATURAL_VALUE) ) {
                            int LA78_8 = input.LA(5);

                            if ( (LA78_8==35) ) {
                                int LA78_5 = input.LA(6);

                                if ( (LA78_5==16||LA78_5==36) ) {
                                    alt78=1;
                                }
                                else if ( (LA78_5==19) ) {
                                    alt78=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 78, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 78, 8, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA78_6==43) ) {
                            int LA78_4 = input.LA(5);

                            if ( (LA78_4==35) ) {
                                int LA78_5 = input.LA(6);

                                if ( (LA78_5==16||LA78_5==36) ) {
                                    alt78=1;
                                }
                                else if ( (LA78_5==19) ) {
                                    alt78=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 78, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 78, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 78, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA78_1==43) ) {
                    int LA78_4 = input.LA(3);

                    if ( (LA78_4==35) ) {
                        int LA78_5 = input.LA(4);

                        if ( (LA78_5==16||LA78_5==36) ) {
                            alt78=1;
                        }
                        else if ( (LA78_5==19) ) {
                            alt78=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 78, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA78_0==16||LA78_0==36) ) {
                alt78=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalAlf.g:2643:4: ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) )
                    {
                    // InternalAlf.g:2643:4: ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) ) )
                    // InternalAlf.g:2644:5: (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) )
                    {
                    // InternalAlf.g:2644:5: (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==33) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalAlf.g:2645:6: otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']'
                            {
                            otherlv_1=(Token)match(input,33,FOLLOW_31); 

                            						newLeafNode(otherlv_1, grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_0_0_0());
                            					
                            // InternalAlf.g:2649:6: ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )?
                            int alt71=2;
                            int LA71_0 = input.LA(1);

                            if ( (LA71_0==RULE_NATURAL_VALUE) ) {
                                int LA71_1 = input.LA(2);

                                if ( (LA71_1==34) ) {
                                    alt71=1;
                                }
                            }
                            switch (alt71) {
                                case 1 :
                                    // InternalAlf.g:2650:7: ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..'
                                    {
                                    // InternalAlf.g:2650:7: ( (lv_lower_2_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:2651:8: (lv_lower_2_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:2651:8: (lv_lower_2_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:2652:9: lv_lower_2_0= ruleNaturalLiteralExpression
                                    {

                                    									newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_0_1_0_0());
                                    								
                                    pushFollow(FOLLOW_32);
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

                                    otherlv_3=(Token)match(input,34,FOLLOW_31); 

                                    							newLeafNode(otherlv_3, grammarAccess.getUnnamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_0_0_1_1());
                                    						

                                    }
                                    break;

                            }

                            // InternalAlf.g:2674:6: ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:2675:7: (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:2675:7: (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:2676:8: lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression
                            {

                            								newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_0_0_2_0());
                            							
                            pushFollow(FOLLOW_33);
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

                            otherlv_5=(Token)match(input,35,FOLLOW_38); 

                            						newLeafNode(otherlv_5, grammarAccess.getUnnamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_0_0_3());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:2698:5: ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' ) )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==36) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==16) ) {
                        alt76=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }
                    switch (alt76) {
                        case 1 :
                            // InternalAlf.g:2699:6: (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) )
                            {
                            // InternalAlf.g:2699:6: (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) )
                            // InternalAlf.g:2700:7: otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) )
                            {
                            otherlv_6=(Token)match(input,36,FOLLOW_35); 

                            							newLeafNode(otherlv_6, grammarAccess.getUnnamedFeatureDefinitionAccess().getEqualsSignKeyword_1_0_1_0_0());
                            						
                            // InternalAlf.g:2704:7: ( (lv_value_7_0= ruleExpression ) )
                            // InternalAlf.g:2705:8: (lv_value_7_0= ruleExpression )
                            {
                            // InternalAlf.g:2705:8: (lv_value_7_0= ruleExpression )
                            // InternalAlf.g:2706:9: lv_value_7_0= ruleExpression
                            {

                            									newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_0_1_0_1_0());
                            								
                            pushFollow(FOLLOW_36);
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

                            // InternalAlf.g:2723:7: (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) )
                            int alt74=2;
                            int LA74_0 = input.LA(1);

                            if ( (LA74_0==19) ) {
                                alt74=1;
                            }
                            else if ( (LA74_0==16) ) {
                                alt74=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 74, 0, input);

                                throw nvae;
                            }
                            switch (alt74) {
                                case 1 :
                                    // InternalAlf.g:2724:8: otherlv_8= ';'
                                    {
                                    otherlv_8=(Token)match(input,19,FOLLOW_2); 

                                    								newLeafNode(otherlv_8, grammarAccess.getUnnamedFeatureDefinitionAccess().getSemicolonKeyword_1_0_1_0_2_0());
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:2729:8: (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' )
                                    {
                                    // InternalAlf.g:2729:8: (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' )
                                    // InternalAlf.g:2730:9: otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}'
                                    {
                                    otherlv_9=(Token)match(input,16,FOLLOW_16); 

                                    									newLeafNode(otherlv_9, grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_1_0_2_1_0());
                                    								
                                    // InternalAlf.g:2734:9: ( (lv_ownedMembership_10_0= ruleClassMember ) )*
                                    loop73:
                                    do {
                                        int alt73=2;
                                        int LA73_0 = input.LA(1);

                                        if ( (LA73_0==RULE_DOCUMENTATION_COMMENT||(LA73_0>=RULE_ID && LA73_0<=RULE_UNRESTRICTED_NAME)||LA73_0==15||(LA73_0>=20 && LA73_0<=23)||(LA73_0>=26 && LA73_0<=28)||(LA73_0>=53 && LA73_0<=59)) ) {
                                            alt73=1;
                                        }


                                        switch (alt73) {
                                    	case 1 :
                                    	    // InternalAlf.g:2735:10: (lv_ownedMembership_10_0= ruleClassMember )
                                    	    {
                                    	    // InternalAlf.g:2735:10: (lv_ownedMembership_10_0= ruleClassMember )
                                    	    // InternalAlf.g:2736:11: lv_ownedMembership_10_0= ruleClassMember
                                    	    {

                                    	    											newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_0_1_0_2_1_1_0());
                                    	    										
                                    	    pushFollow(FOLLOW_16);
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
                                    	    break loop73;
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
                            // InternalAlf.g:2761:6: (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' )
                            {
                            // InternalAlf.g:2761:6: (otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}' )
                            // InternalAlf.g:2762:7: otherlv_12= '{' ( (lv_ownedMembership_13_0= ruleClassMember ) )* otherlv_14= '}'
                            {
                            otherlv_12=(Token)match(input,16,FOLLOW_16); 

                            							newLeafNode(otherlv_12, grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_1_1_0());
                            						
                            // InternalAlf.g:2766:7: ( (lv_ownedMembership_13_0= ruleClassMember ) )*
                            loop75:
                            do {
                                int alt75=2;
                                int LA75_0 = input.LA(1);

                                if ( (LA75_0==RULE_DOCUMENTATION_COMMENT||(LA75_0>=RULE_ID && LA75_0<=RULE_UNRESTRICTED_NAME)||LA75_0==15||(LA75_0>=20 && LA75_0<=23)||(LA75_0>=26 && LA75_0<=28)||(LA75_0>=53 && LA75_0<=59)) ) {
                                    alt75=1;
                                }


                                switch (alt75) {
                            	case 1 :
                            	    // InternalAlf.g:2767:8: (lv_ownedMembership_13_0= ruleClassMember )
                            	    {
                            	    // InternalAlf.g:2767:8: (lv_ownedMembership_13_0= ruleClassMember )
                            	    // InternalAlf.g:2768:9: lv_ownedMembership_13_0= ruleClassMember
                            	    {

                            	    									newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_0_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_16);
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
                            	    break loop75;
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
                    // InternalAlf.g:2793:4: (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' )
                    {
                    // InternalAlf.g:2793:4: (otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';' )
                    // InternalAlf.g:2794:5: otherlv_15= '[' ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )? ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_19= ']' otherlv_20= ';'
                    {
                    otherlv_15=(Token)match(input,33,FOLLOW_31); 

                    					newLeafNode(otherlv_15, grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_0());
                    				
                    // InternalAlf.g:2798:5: ( ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..' )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==RULE_NATURAL_VALUE) ) {
                        int LA77_1 = input.LA(2);

                        if ( (LA77_1==34) ) {
                            alt77=1;
                        }
                    }
                    switch (alt77) {
                        case 1 :
                            // InternalAlf.g:2799:6: ( (lv_lower_16_0= ruleNaturalLiteralExpression ) ) otherlv_17= '..'
                            {
                            // InternalAlf.g:2799:6: ( (lv_lower_16_0= ruleNaturalLiteralExpression ) )
                            // InternalAlf.g:2800:7: (lv_lower_16_0= ruleNaturalLiteralExpression )
                            {
                            // InternalAlf.g:2800:7: (lv_lower_16_0= ruleNaturalLiteralExpression )
                            // InternalAlf.g:2801:8: lv_lower_16_0= ruleNaturalLiteralExpression
                            {

                            								newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_1_0_0());
                            							
                            pushFollow(FOLLOW_32);
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

                            otherlv_17=(Token)match(input,34,FOLLOW_31); 

                            						newLeafNode(otherlv_17, grammarAccess.getUnnamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_1_1());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:2823:5: ( (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression ) )
                    // InternalAlf.g:2824:6: (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression )
                    {
                    // InternalAlf.g:2824:6: (lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression )
                    // InternalAlf.g:2825:7: lv_upper_18_0= ruleUnlimitedNaturalLiteralExpression
                    {

                    							newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_33);
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
    // InternalAlf.g:2856:1: entryRuleOwnedRedefinitionOrSubset returns [EObject current=null] : iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF ;
    public final EObject entryRuleOwnedRedefinitionOrSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnedRedefinitionOrSubset = null;


        try {
            // InternalAlf.g:2856:66: (iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF )
            // InternalAlf.g:2857:2: iv_ruleOwnedRedefinitionOrSubset= ruleOwnedRedefinitionOrSubset EOF
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
    // InternalAlf.g:2863:1: ruleOwnedRedefinitionOrSubset returns [EObject current=null] : ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) ) ;
    public final EObject ruleOwnedRedefinitionOrSubset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedMemberElement_2_0 = null;

        EObject lv_ownedMemberElement_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2869:2: ( ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) ) )
            // InternalAlf.g:2870:2: ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) )
            {
            // InternalAlf.g:2870:2: ( ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) ) | (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==18||LA80_0==37) ) {
                alt80=1;
            }
            else if ( (LA80_0==38) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalAlf.g:2871:3: ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) )
                    {
                    // InternalAlf.g:2871:3: ( (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) ) )
                    // InternalAlf.g:2872:4: (otherlv_0= 'is' | otherlv_1= 'redefines' ) ( (lv_ownedMemberElement_2_0= ruleRedefinition ) )
                    {
                    // InternalAlf.g:2872:4: (otherlv_0= 'is' | otherlv_1= 'redefines' )
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==18) ) {
                        alt79=1;
                    }
                    else if ( (LA79_0==37) ) {
                        alt79=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalAlf.g:2873:5: otherlv_0= 'is'
                            {
                            otherlv_0=(Token)match(input,18,FOLLOW_4); 

                            					newLeafNode(otherlv_0, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getIsKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2878:5: otherlv_1= 'redefines'
                            {
                            otherlv_1=(Token)match(input,37,FOLLOW_4); 

                            					newLeafNode(otherlv_1, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getRedefinesKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:2883:4: ( (lv_ownedMemberElement_2_0= ruleRedefinition ) )
                    // InternalAlf.g:2884:5: (lv_ownedMemberElement_2_0= ruleRedefinition )
                    {
                    // InternalAlf.g:2884:5: (lv_ownedMemberElement_2_0= ruleRedefinition )
                    // InternalAlf.g:2885:6: lv_ownedMemberElement_2_0= ruleRedefinition
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
                    // InternalAlf.g:2904:3: (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) )
                    {
                    // InternalAlf.g:2904:3: (otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) ) )
                    // InternalAlf.g:2905:4: otherlv_3= 'subsets' ( (lv_ownedMemberElement_4_0= ruleSubset ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getOwnedRedefinitionOrSubsetAccess().getSubsetsKeyword_1_0());
                    			
                    // InternalAlf.g:2909:4: ( (lv_ownedMemberElement_4_0= ruleSubset ) )
                    // InternalAlf.g:2910:5: (lv_ownedMemberElement_4_0= ruleSubset )
                    {
                    // InternalAlf.g:2910:5: (lv_ownedMemberElement_4_0= ruleSubset )
                    // InternalAlf.g:2911:6: lv_ownedMemberElement_4_0= ruleSubset
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
    // InternalAlf.g:2933:1: entryRuleRedefinition returns [EObject current=null] : iv_ruleRedefinition= ruleRedefinition EOF ;
    public final EObject entryRuleRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefinition = null;


        try {
            // InternalAlf.g:2933:53: (iv_ruleRedefinition= ruleRedefinition EOF )
            // InternalAlf.g:2934:2: iv_ruleRedefinition= ruleRedefinition EOF
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
    // InternalAlf.g:2940:1: ruleRedefinition returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleRedefinition() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:2946:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2947:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2947:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2948:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:2948:3: ( ruleQualifiedName )
            // InternalAlf.g:2949:4: ruleQualifiedName
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
    // InternalAlf.g:2966:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalAlf.g:2966:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalAlf.g:2967:2: iv_ruleSubset= ruleSubset EOF
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
    // InternalAlf.g:2973:1: ruleSubset returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubset() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:2979:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:2980:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:2980:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:2981:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:2981:3: ( ruleQualifiedName )
            // InternalAlf.g:2982:4: ruleQualifiedName
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
    // InternalAlf.g:2999:1: entryRuleConnectorDefinition returns [EObject current=null] : iv_ruleConnectorDefinition= ruleConnectorDefinition EOF ;
    public final EObject entryRuleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorDefinition = null;


        try {
            // InternalAlf.g:2999:60: (iv_ruleConnectorDefinition= ruleConnectorDefinition EOF )
            // InternalAlf.g:3000:2: iv_ruleConnectorDefinition= ruleConnectorDefinition EOF
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
    // InternalAlf.g:3006:1: ruleConnectorDefinition returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) ;
    public final EObject ruleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3012:2: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) )
            // InternalAlf.g:3013:2: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
            {
            // InternalAlf.g:3013:2: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
            // InternalAlf.g:3014:3: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';'
            {
            // InternalAlf.g:3014:3: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )?
            int alt83=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA83_1 = input.LA(2);

                    if ( (LA83_1==18||LA83_1==30) ) {
                        alt83=1;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA83_2 = input.LA(2);

                    if ( (LA83_2==18||LA83_2==30) ) {
                        alt83=1;
                    }
                    }
                    break;
                case 18:
                case 30:
                    {
                    alt83=1;
                    }
                    break;
            }

            switch (alt83) {
                case 1 :
                    // InternalAlf.g:3015:4: ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is'
                    {
                    // InternalAlf.g:3015:4: ( (lv_name_0_0= ruleName ) )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( ((LA81_0>=RULE_ID && LA81_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalAlf.g:3016:5: (lv_name_0_0= ruleName )
                            {
                            // InternalAlf.g:3016:5: (lv_name_0_0= ruleName )
                            // InternalAlf.g:3017:6: lv_name_0_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_0_0_0());
                            					
                            pushFollow(FOLLOW_39);
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

                    // InternalAlf.g:3034:4: (otherlv_1= ':' ( ( ruleQualifiedName ) ) )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==30) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalAlf.g:3035:5: otherlv_1= ':' ( ( ruleQualifiedName ) )
                            {
                            otherlv_1=(Token)match(input,30,FOLLOW_4); 

                            					newLeafNode(otherlv_1, grammarAccess.getConnectorDefinitionAccess().getColonKeyword_0_1_0());
                            				
                            // InternalAlf.g:3039:5: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:3040:6: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:3040:6: ( ruleQualifiedName )
                            // InternalAlf.g:3041:7: ruleQualifiedName
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

            // InternalAlf.g:3061:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3062:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:3062:4: ( ruleQualifiedName )
            // InternalAlf.g:3063:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getSourceFeatureFeatureCrossReference_1_0());
            				
            pushFollow(FOLLOW_40);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectorDefinitionAccess().getEqualsSignGreaterThanSignKeyword_2());
            		
            // InternalAlf.g:3081:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3082:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:3082:4: ( ruleQualifiedName )
            // InternalAlf.g:3083:5: ruleQualifiedName
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
    // InternalAlf.g:3105:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAlf.g:3105:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAlf.g:3106:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAlf.g:3112:1: ruleExpression returns [EObject current=null] : this_BinaryExpression_0= ruleBinaryExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3118:2: (this_BinaryExpression_0= ruleBinaryExpression )
            // InternalAlf.g:3119:2: this_BinaryExpression_0= ruleBinaryExpression
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
    // InternalAlf.g:3130:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalAlf.g:3130:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalAlf.g:3131:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalAlf.g:3137:1: ruleBinaryExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) ;
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
            // InternalAlf.g:3143:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) )
            // InternalAlf.g:3144:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            {
            // InternalAlf.g:3144:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            // InternalAlf.g:3145:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            {

            			newCompositeNode(grammarAccess.getBinaryExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3153:3: ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=40 && LA85_0<=45)) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalAlf.g:3154:4: () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    {
                    // InternalAlf.g:3154:4: ()
                    // InternalAlf.g:3155:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:3161:4: ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( ((LA84_0>=41 && LA84_0<=45)) ) {
                        alt84=1;
                    }
                    else if ( (LA84_0==40) ) {
                        alt84=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 0, input);

                        throw nvae;
                    }
                    switch (alt84) {
                        case 1 :
                            // InternalAlf.g:3162:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            {
                            // InternalAlf.g:3162:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            // InternalAlf.g:3163:6: ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) )
                            {
                            // InternalAlf.g:3163:6: ( (lv_operator_2_0= ruleBinaryOperator ) )
                            // InternalAlf.g:3164:7: (lv_operator_2_0= ruleBinaryOperator )
                            {
                            // InternalAlf.g:3164:7: (lv_operator_2_0= ruleBinaryOperator )
                            // InternalAlf.g:3165:8: lv_operator_2_0= ruleBinaryOperator
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperatorBinaryOperatorParserRuleCall_1_1_0_0_0());
                            							
                            pushFollow(FOLLOW_35);
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

                            // InternalAlf.g:3182:6: ( (lv_operand_3_0= ruleExpression ) )
                            // InternalAlf.g:3183:7: (lv_operand_3_0= ruleExpression )
                            {
                            // InternalAlf.g:3183:7: (lv_operand_3_0= ruleExpression )
                            // InternalAlf.g:3184:8: lv_operand_3_0= ruleExpression
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
                            // InternalAlf.g:3203:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            {
                            // InternalAlf.g:3203:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            // InternalAlf.g:3204:6: ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']'
                            {
                            // InternalAlf.g:3204:6: ( (lv_operator_4_0= '@' ) )
                            // InternalAlf.g:3205:7: (lv_operator_4_0= '@' )
                            {
                            // InternalAlf.g:3205:7: (lv_operator_4_0= '@' )
                            // InternalAlf.g:3206:8: lv_operator_4_0= '@'
                            {
                            lv_operator_4_0=(Token)match(input,40,FOLLOW_42); 

                            								newLeafNode(lv_operator_4_0, grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getBinaryExpressionRule());
                            								}
                            								setWithLastConsumed(current, "operator", lv_operator_4_0, "@");
                            							

                            }


                            }

                            otherlv_5=(Token)match(input,33,FOLLOW_35); 

                            						newLeafNode(otherlv_5, grammarAccess.getBinaryExpressionAccess().getLeftSquareBracketKeyword_1_1_1_1());
                            					
                            // InternalAlf.g:3222:6: ( (lv_operand_6_0= ruleExpression ) )
                            // InternalAlf.g:3223:7: (lv_operand_6_0= ruleExpression )
                            {
                            // InternalAlf.g:3223:7: (lv_operand_6_0= ruleExpression )
                            // InternalAlf.g:3224:8: lv_operand_6_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperandExpressionParserRuleCall_1_1_1_2_0());
                            							
                            pushFollow(FOLLOW_33);
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
    // InternalAlf.g:3252:1: entryRuleBinaryOperator returns [String current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final String entryRuleBinaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperator = null;


        try {
            // InternalAlf.g:3252:54: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // InternalAlf.g:3253:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
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
    // InternalAlf.g:3259:1: ruleBinaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:3265:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) )
            // InternalAlf.g:3266:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            {
            // InternalAlf.g:3266:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            int alt86=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt86=1;
                }
                break;
            case 42:
                {
                alt86=2;
                }
                break;
            case 43:
                {
                alt86=3;
                }
                break;
            case 44:
                {
                alt86=4;
                }
                break;
            case 45:
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
                    // InternalAlf.g:3267:3: kw= '+'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3273:3: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:3279:3: kw= '*'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:3285:3: kw= '/'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:3291:3: kw= '^'
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
    // InternalAlf.g:3300:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlf.g:3300:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlf.g:3301:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalAlf.g:3307:1: ruleUnaryExpression returns [EObject current=null] : (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceAccessExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3313:2: ( (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) )
            // InternalAlf.g:3314:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            {
            // InternalAlf.g:3314:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( ((LA87_0>=RULE_BOOLEAN_VALUE && LA87_0<=RULE_UNRESTRICTED_NAME)||LA87_0==16||LA87_0==43||LA87_0==46||(LA87_0>=48 && LA87_0<=49)) ) {
                alt87=1;
            }
            else if ( ((LA87_0>=41 && LA87_0<=42)) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalAlf.g:3315:3: this_SequenceAccessExpression_0= ruleSequenceAccessExpression
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
                    // InternalAlf.g:3324:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    {
                    // InternalAlf.g:3324:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    // InternalAlf.g:3325:4: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    {
                    // InternalAlf.g:3325:4: ()
                    // InternalAlf.g:3326:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:3332:4: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // InternalAlf.g:3333:5: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // InternalAlf.g:3333:5: (lv_operator_2_0= ruleUnaryOperator )
                    // InternalAlf.g:3334:6: lv_operator_2_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_43);
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

                    // InternalAlf.g:3351:4: ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    // InternalAlf.g:3352:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    {
                    // InternalAlf.g:3352:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    // InternalAlf.g:3353:6: lv_operand_3_0= ruleSequenceAccessExpression
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
    // InternalAlf.g:3375:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalAlf.g:3375:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalAlf.g:3376:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalAlf.g:3382:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:3388:2: ( (kw= '+' | kw= '-' ) )
            // InternalAlf.g:3389:2: (kw= '+' | kw= '-' )
            {
            // InternalAlf.g:3389:2: (kw= '+' | kw= '-' )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==41) ) {
                alt88=1;
            }
            else if ( (LA88_0==42) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalAlf.g:3390:3: kw= '+'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:3396:3: kw= '-'
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
    // InternalAlf.g:3405:1: entryRuleSequenceAccessExpression returns [EObject current=null] : iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF ;
    public final EObject entryRuleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceAccessExpression = null;


        try {
            // InternalAlf.g:3405:65: (iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF )
            // InternalAlf.g:3406:2: iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF
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
    // InternalAlf.g:3412:1: ruleSequenceAccessExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) ;
    public final EObject ruleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_index_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3418:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) )
            // InternalAlf.g:3419:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            {
            // InternalAlf.g:3419:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            // InternalAlf.g:3420:3: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            {

            			newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:3428:3: ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==33) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalAlf.g:3429:4: () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    // InternalAlf.g:3429:4: ()
            	    // InternalAlf.g:3430:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSequenceAccessExpressionAccess().getSequenceAccessExpressionPrimaryAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_35); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSequenceAccessExpressionAccess().getLeftSquareBracketKeyword_1_1());
            	    			
            	    // InternalAlf.g:3440:4: ( (lv_index_3_0= ruleExpression ) )
            	    // InternalAlf.g:3441:5: (lv_index_3_0= ruleExpression )
            	    {
            	    // InternalAlf.g:3441:5: (lv_index_3_0= ruleExpression )
            	    // InternalAlf.g:3442:6: lv_index_3_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getIndexExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
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

            	    otherlv_4=(Token)match(input,35,FOLLOW_44); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSequenceAccessExpressionAccess().getRightSquareBracketKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop89;
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
    // InternalAlf.g:3468:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalAlf.g:3468:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalAlf.g:3469:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalAlf.g:3475:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
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
            // InternalAlf.g:3481:2: ( (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // InternalAlf.g:3482:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // InternalAlf.g:3482:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt90=5;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // InternalAlf.g:3483:3: this_LiteralExpression_0= ruleLiteralExpression
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
                    // InternalAlf.g:3492:3: this_ElementReferenceExpression_1= ruleElementReferenceExpression
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
                    // InternalAlf.g:3501:3: this_InstanceCreationExpression_2= ruleInstanceCreationExpression
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
                    // InternalAlf.g:3510:3: this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression
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
                    // InternalAlf.g:3519:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // InternalAlf.g:3519:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // InternalAlf.g:3520:4: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_45);
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
    // InternalAlf.g:3541:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // InternalAlf.g:3541:67: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // InternalAlf.g:3542:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
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
    // InternalAlf.g:3548:1: ruleElementReferenceExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleElementReferenceExpression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:3554:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:3555:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:3555:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3556:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:3556:3: ( ruleQualifiedName )
            // InternalAlf.g:3557:4: ruleQualifiedName
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
    // InternalAlf.g:3574:1: entryRuleInstanceCreationExpression returns [EObject current=null] : iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF ;
    public final EObject entryRuleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceCreationExpression = null;


        try {
            // InternalAlf.g:3574:67: (iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF )
            // InternalAlf.g:3575:2: iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF
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
    // InternalAlf.g:3581:1: ruleInstanceCreationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_argument_2_0 = null;

        EObject lv_argument_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3587:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalAlf.g:3588:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalAlf.g:3588:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalAlf.g:3589:3: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalAlf.g:3589:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:3590:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:3590:4: ( ruleQualifiedName )
            // InternalAlf.g:3591:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceCreationExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getClassClassCrossReference_0_0());
            				
            pushFollow(FOLLOW_46);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getInstanceCreationExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlf.g:3609:3: ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( ((LA92_0>=RULE_BOOLEAN_VALUE && LA92_0<=RULE_UNRESTRICTED_NAME)||LA92_0==16||(LA92_0>=41 && LA92_0<=43)||LA92_0==46||(LA92_0>=48 && LA92_0<=49)) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalAlf.g:3610:4: ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:3610:4: ( (lv_argument_2_0= ruleExpression ) )
                    // InternalAlf.g:3611:5: (lv_argument_2_0= ruleExpression )
                    {
                    // InternalAlf.g:3611:5: (lv_argument_2_0= ruleExpression )
                    // InternalAlf.g:3612:6: lv_argument_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_48);
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

                    // InternalAlf.g:3629:4: (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==25) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalAlf.g:3630:5: otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_35); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getInstanceCreationExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:3634:5: ( (lv_argument_4_0= ruleExpression ) )
                    	    // InternalAlf.g:3635:6: (lv_argument_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:3635:6: (lv_argument_4_0= ruleExpression )
                    	    // InternalAlf.g:3636:7: lv_argument_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_48);
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
                    	    break loop91;
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
    // InternalAlf.g:3663:1: entryRuleSequenceConstructionExpression returns [EObject current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
    public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionExpression = null;


        try {
            // InternalAlf.g:3663:71: (iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:3664:2: iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF
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
    // InternalAlf.g:3670:1: ruleSequenceConstructionExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3676:2: ( ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalAlf.g:3677:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalAlf.g:3677:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // InternalAlf.g:3678:3: () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalAlf.g:3678:3: ()
            // InternalAlf.g:3679:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:3689:3: ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( ((LA94_0>=RULE_BOOLEAN_VALUE && LA94_0<=RULE_UNRESTRICTED_NAME)||LA94_0==16||(LA94_0>=41 && LA94_0<=43)||LA94_0==46||(LA94_0>=48 && LA94_0<=49)) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalAlf.g:3690:4: ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:3690:4: ( (lv_element_2_0= ruleExpression ) )
                    // InternalAlf.g:3691:5: (lv_element_2_0= ruleExpression )
                    {
                    // InternalAlf.g:3691:5: (lv_element_2_0= ruleExpression )
                    // InternalAlf.g:3692:6: lv_element_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_50);
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

                    // InternalAlf.g:3709:4: (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==25) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalAlf.g:3710:5: otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_35); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:3714:5: ( (lv_element_4_0= ruleExpression ) )
                    	    // InternalAlf.g:3715:6: (lv_element_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:3715:6: (lv_element_4_0= ruleExpression )
                    	    // InternalAlf.g:3716:7: lv_element_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getSequenceConstructionExpressionAccess().getElementExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_50);
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
    // InternalAlf.g:3743:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalAlf.g:3743:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalAlf.g:3744:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalAlf.g:3750:1: ruleLiteralExpression returns [EObject current=null] : (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteralExpression_0 = null;

        EObject this_BooleanLiteralExpression_1 = null;

        EObject this_StringLiteralExpression_2 = null;

        EObject this_RealLiteralExpression_3 = null;

        EObject this_UnlimitedNaturalLiteralExpression_4 = null;



        	enterRule();

        try {
            // InternalAlf.g:3756:2: ( (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:3757:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:3757:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            int alt95=5;
            switch ( input.LA(1) ) {
            case 48:
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

                if ( (LA95_4==EOF||(LA95_4>=16 && LA95_4<=17)||LA95_4==19||LA95_4==25||LA95_4==33||LA95_4==35||(LA95_4>=40 && LA95_4<=45)||LA95_4==47) ) {
                    alt95=5;
                }
                else if ( (LA95_4==49) ) {
                    alt95=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 4, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                alt95=4;
                }
                break;
            case 43:
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
                    // InternalAlf.g:3758:3: this_NullLiteralExpression_0= ruleNullLiteralExpression
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
                    // InternalAlf.g:3767:3: this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression
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
                    // InternalAlf.g:3776:3: this_StringLiteralExpression_2= ruleStringLiteralExpression
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
                    // InternalAlf.g:3785:3: this_RealLiteralExpression_3= ruleRealLiteralExpression
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
                    // InternalAlf.g:3794:3: this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:3806:1: entryRuleNullLiteralExpression returns [EObject current=null] : iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF ;
    public final EObject entryRuleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpression = null;


        try {
            // InternalAlf.g:3806:62: (iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF )
            // InternalAlf.g:3807:2: iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF
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
    // InternalAlf.g:3813:1: ruleNullLiteralExpression returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlf.g:3819:2: ( ( () otherlv_1= 'null' ) )
            // InternalAlf.g:3820:2: ( () otherlv_1= 'null' )
            {
            // InternalAlf.g:3820:2: ( () otherlv_1= 'null' )
            // InternalAlf.g:3821:3: () otherlv_1= 'null'
            {
            // InternalAlf.g:3821:3: ()
            // InternalAlf.g:3822:4: 
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
    // InternalAlf.g:3836:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // InternalAlf.g:3836:65: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:3837:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
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
    // InternalAlf.g:3843:1: ruleBooleanLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:3849:2: ( ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) )
            // InternalAlf.g:3850:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            {
            // InternalAlf.g:3850:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:3851:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:3851:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            // InternalAlf.g:3852:4: lv_value_0_0= RULE_BOOLEAN_VALUE
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
    // InternalAlf.g:3871:1: entryRuleStringLiteralExpression returns [EObject current=null] : iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF ;
    public final EObject entryRuleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpression = null;


        try {
            // InternalAlf.g:3871:64: (iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF )
            // InternalAlf.g:3872:2: iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF
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
    // InternalAlf.g:3878:1: ruleStringLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:3884:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalAlf.g:3885:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalAlf.g:3885:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalAlf.g:3886:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalAlf.g:3886:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalAlf.g:3887:4: lv_value_0_0= RULE_STRING_VALUE
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
    // InternalAlf.g:3906:1: entryRuleRealLiteralExpression returns [EObject current=null] : iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF ;
    public final EObject entryRuleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteralExpression = null;


        try {
            // InternalAlf.g:3906:62: (iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF )
            // InternalAlf.g:3907:2: iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF
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
    // InternalAlf.g:3913:1: ruleRealLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3919:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalAlf.g:3920:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalAlf.g:3920:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalAlf.g:3921:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalAlf.g:3921:3: (lv_value_0_0= ruleRealValue )
            // InternalAlf.g:3922:4: lv_value_0_0= ruleRealValue
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
    // InternalAlf.g:3942:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalAlf.g:3942:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalAlf.g:3943:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalAlf.g:3949:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_VALUE_0=null;
        Token kw=null;
        Token this_NATURAL_VALUE_2=null;
        Token this_NATURAL_VALUE_4=null;
        Token this_NATURAL_VALUE_9=null;


        	enterRule();

        try {
            // InternalAlf.g:3955:2: ( ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) )
            // InternalAlf.g:3956:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            {
            // InternalAlf.g:3956:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            // InternalAlf.g:3957:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            {
            // InternalAlf.g:3957:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_NATURAL_VALUE) ) {
                alt97=1;
            }
            else if ( (LA97_0==49) ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // InternalAlf.g:3958:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    {
                    // InternalAlf.g:3958:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    // InternalAlf.g:3959:5: this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    {
                    this_NATURAL_VALUE_0=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_51); 

                    					current.merge(this_NATURAL_VALUE_0);
                    				

                    					newLeafNode(this_NATURAL_VALUE_0, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_0());
                    				
                    kw=(Token)match(input,49,FOLLOW_52); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_0_1());
                    				
                    // InternalAlf.g:3971:5: (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==RULE_NATURAL_VALUE) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // InternalAlf.g:3972:6: this_NATURAL_VALUE_2= RULE_NATURAL_VALUE
                            {
                            this_NATURAL_VALUE_2=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_53); 

                            						current.merge(this_NATURAL_VALUE_2);
                            					

                            						newLeafNode(this_NATURAL_VALUE_2, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_2());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:3982:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    {
                    // InternalAlf.g:3982:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    // InternalAlf.g:3983:5: kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE
                    {
                    kw=(Token)match(input,49,FOLLOW_54); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_1_0());
                    				
                    this_NATURAL_VALUE_4=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_53); 

                    					current.merge(this_NATURAL_VALUE_4);
                    				

                    					newLeafNode(this_NATURAL_VALUE_4, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:3997:3: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( ((LA100_0>=50 && LA100_0<=51)) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalAlf.g:3998:4: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE
                    {
                    // InternalAlf.g:3998:4: (kw= 'e' | kw= 'E' )
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==50) ) {
                        alt98=1;
                    }
                    else if ( (LA98_0==51) ) {
                        alt98=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 98, 0, input);

                        throw nvae;
                    }
                    switch (alt98) {
                        case 1 :
                            // InternalAlf.g:3999:5: kw= 'e'
                            {
                            kw=(Token)match(input,50,FOLLOW_55); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:4005:5: kw= 'E'
                            {
                            kw=(Token)match(input,51,FOLLOW_55); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:4011:4: (kw= '+' | kw= '-' )?
                    int alt99=3;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==41) ) {
                        alt99=1;
                    }
                    else if ( (LA99_0==42) ) {
                        alt99=2;
                    }
                    switch (alt99) {
                        case 1 :
                            // InternalAlf.g:4012:5: kw= '+'
                            {
                            kw=(Token)match(input,41,FOLLOW_54); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:4018:5: kw= '-'
                            {
                            kw=(Token)match(input,42,FOLLOW_54); 

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
    // InternalAlf.g:4036:1: entryRuleNaturalLiteralExpression returns [EObject current=null] : iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF ;
    public final EObject entryRuleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:4036:65: (iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:4037:2: iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF
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
    // InternalAlf.g:4043:1: ruleNaturalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) ;
    public final EObject ruleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:4049:2: ( ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) )
            // InternalAlf.g:4050:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            {
            // InternalAlf.g:4050:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            // InternalAlf.g:4051:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:4051:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            // InternalAlf.g:4052:4: lv_value_0_0= RULE_NATURAL_VALUE
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
    // InternalAlf.g:4071:1: entryRuleUnlimitedNaturalLiteralExpression returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:4071:74: (iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:4072:2: iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF
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
    // InternalAlf.g:4078:1: ruleUnlimitedNaturalLiteralExpression returns [EObject current=null] : (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NaturalLiteralExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4084:2: ( (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) )
            // InternalAlf.g:4085:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            {
            // InternalAlf.g:4085:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_NATURAL_VALUE) ) {
                alt101=1;
            }
            else if ( (LA101_0==43) ) {
                alt101=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // InternalAlf.g:4086:3: this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression
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
                    // InternalAlf.g:4095:3: ( () otherlv_2= '*' )
                    {
                    // InternalAlf.g:4095:3: ( () otherlv_2= '*' )
                    // InternalAlf.g:4096:4: () otherlv_2= '*'
                    {
                    // InternalAlf.g:4096:4: ()
                    // InternalAlf.g:4097:5: 
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
    // InternalAlf.g:4112:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAlf.g:4112:44: (iv_ruleName= ruleName EOF )
            // InternalAlf.g:4113:2: iv_ruleName= ruleName EOF
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
    // InternalAlf.g:4119:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalAlf.g:4125:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalAlf.g:4126:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalAlf.g:4126:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==RULE_ID) ) {
                alt102=1;
            }
            else if ( (LA102_0==RULE_UNRESTRICTED_NAME) ) {
                alt102=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // InternalAlf.g:4127:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:4135:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:4146:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlf.g:4146:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlf.g:4147:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlf.g:4153:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName ( (kw= '.' | kw= '::' ) this_Name_3= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_3 = null;



        	enterRule();

        try {
            // InternalAlf.g:4159:2: ( (this_Name_0= ruleName ( (kw= '.' | kw= '::' ) this_Name_3= ruleName )* ) )
            // InternalAlf.g:4160:2: (this_Name_0= ruleName ( (kw= '.' | kw= '::' ) this_Name_3= ruleName )* )
            {
            // InternalAlf.g:4160:2: (this_Name_0= ruleName ( (kw= '.' | kw= '::' ) this_Name_3= ruleName )* )
            // InternalAlf.g:4161:3: this_Name_0= ruleName ( (kw= '.' | kw= '::' ) this_Name_3= ruleName )*
            {

            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_56);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:4171:3: ( (kw= '.' | kw= '::' ) this_Name_3= ruleName )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==49||LA104_0==52) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // InternalAlf.g:4172:4: (kw= '.' | kw= '::' ) this_Name_3= ruleName
            	    {
            	    // InternalAlf.g:4172:4: (kw= '.' | kw= '::' )
            	    int alt103=2;
            	    int LA103_0 = input.LA(1);

            	    if ( (LA103_0==49) ) {
            	        alt103=1;
            	    }
            	    else if ( (LA103_0==52) ) {
            	        alt103=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 103, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt103) {
            	        case 1 :
            	            // InternalAlf.g:4173:5: kw= '.'
            	            {
            	            kw=(Token)match(input,49,FOLLOW_4); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalAlf.g:4179:5: kw= '::'
            	            {
            	            kw=(Token)match(input,52,FOLLOW_4); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0_1());
            	            				

            	            }
            	            break;

            	    }


            	    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_56);
            	    this_Name_3=ruleName();

            	    state._fsp--;


            	    				current.merge(this_Name_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleVisibilityIndicator"
    // InternalAlf.g:4200:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAlf.g:4206:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) )
            // InternalAlf.g:4207:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            {
            // InternalAlf.g:4207:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            int alt105=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt105=1;
                }
                break;
            case 54:
                {
                alt105=2;
                }
                break;
            case 55:
                {
                alt105=3;
                }
                break;
            case 56:
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
                    // InternalAlf.g:4208:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:4208:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:4209:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:4216:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:4216:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:4217:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:4224:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalAlf.g:4224:3: (enumLiteral_2= 'protected' )
                    // InternalAlf.g:4225:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:4232:3: (enumLiteral_3= 'packaged' )
                    {
                    // InternalAlf.g:4232:3: (enumLiteral_3= 'packaged' )
                    // InternalAlf.g:4233:4: enumLiteral_3= 'packaged'
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
    // InternalAlf.g:4243:1: ruleFeatureDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFeatureDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAlf.g:4249:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalAlf.g:4250:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalAlf.g:4250:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt106=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt106=1;
                }
                break;
            case 58:
                {
                alt106=2;
                }
                break;
            case 59:
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
                    // InternalAlf.g:4251:3: (enumLiteral_0= 'in' )
                    {
                    // InternalAlf.g:4251:3: (enumLiteral_0= 'in' )
                    // InternalAlf.g:4252:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:4259:3: (enumLiteral_1= 'out' )
                    {
                    // InternalAlf.g:4259:3: (enumLiteral_1= 'out' )
                    // InternalAlf.g:4260:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:4267:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalAlf.g:4267:3: (enumLiteral_2= 'inout' )
                    // InternalAlf.g:4268:4: enumLiteral_2= 'inout'
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


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA90 dfa90 = new DFA90(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\17\1\10\1\uffff\2\10\2\20\1\uffff\4\20\2\10\4\20\4\10\4\20";
    static final String dfa_3s = "\1\27\1\22\1\uffff\4\22\1\uffff\4\30\2\11\4\64\4\11\4\64";
    static final String dfa_4s = "\2\uffff\1\1\4\uffff\1\2\22\uffff";
    static final String dfa_5s = "\32\uffff}>";
    static final String[] dfa_6s = {
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
            "\1\26\1\27",
            "\1\30\1\31",
            "\1\30\1\31",
            "\1\2\2\uffff\1\7\5\uffff\1\2\27\uffff\1\22\2\uffff\1\23",
            "\1\2\2\uffff\1\7\5\uffff\1\2\27\uffff\1\22\2\uffff\1\23",
            "\1\2\2\uffff\1\7\5\uffff\1\2\27\uffff\1\24\2\uffff\1\25",
            "\1\2\2\uffff\1\7\5\uffff\1\2\27\uffff\1\24\2\uffff\1\25"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "510:3: ( ( (lv_ownedMemberElement_1_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_3_0= ruleName ) )? otherlv_4= 'is' ( ( ruleQualifiedName ) ) otherlv_6= ';' ) )";
        }
    }
    static final String dfa_7s = "\27\uffff";
    static final String dfa_8s = "\2\10\4\20\1\10\1\uffff\1\10\1\uffff\4\20\2\10\1\uffff\2\10\4\20";
    static final String dfa_9s = "\1\26\5\46\1\11\1\uffff\1\11\1\uffff\4\64\2\11\1\uffff\2\11\4\64";
    static final String dfa_10s = "\7\uffff\1\2\1\uffff\1\1\6\uffff\1\3\6\uffff";
    static final String dfa_11s = "\27\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\3\14\uffff\1\1",
            "\1\4\1\5\10\uffff\1\6\22\uffff\2\7",
            "\1\11\1\uffff\1\10\1\11\12\uffff\1\11\2\uffff\1\11\2\uffff\3\11",
            "\1\11\1\uffff\1\10\1\11\12\uffff\1\11\2\uffff\1\11\2\uffff\3\11",
            "\1\11\1\uffff\1\10\1\11\12\uffff\1\11\2\uffff\1\11\2\uffff\3\11",
            "\1\11\1\uffff\1\10\1\11\12\uffff\1\11\2\uffff\1\11\2\uffff\3\11",
            "\1\12\1\13",
            "",
            "\1\14\1\15",
            "",
            "\1\7\2\uffff\1\20\15\uffff\1\7\2\uffff\1\7\14\uffff\1\16\2\uffff\1\17",
            "\1\7\2\uffff\1\20\15\uffff\1\7\2\uffff\1\7\14\uffff\1\16\2\uffff\1\17",
            "\1\11\2\uffff\1\20\15\uffff\1\11\2\uffff\1\11\14\uffff\1\21\2\uffff\1\22",
            "\1\11\2\uffff\1\20\15\uffff\1\11\2\uffff\1\11\14\uffff\1\21\2\uffff\1\22",
            "\1\23\1\24",
            "\1\23\1\24",
            "",
            "\1\25\1\26",
            "\1\25\1\26",
            "\1\7\2\uffff\1\20\15\uffff\1\7\2\uffff\1\7\14\uffff\1\16\2\uffff\1\17",
            "\1\7\2\uffff\1\20\15\uffff\1\7\2\uffff\1\7\14\uffff\1\16\2\uffff\1\17",
            "\1\11\2\uffff\1\20\15\uffff\1\11\2\uffff\1\11\14\uffff\1\21\2\uffff\1\22",
            "\1\11\2\uffff\1\20\15\uffff\1\11\2\uffff\1\11\14\uffff\1\21\2\uffff\1\22"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "658:3: ( ( (otherlv_1= 'feature' )? ( (lv_ownedMemberElement_2_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_3= 'feature' ( (lv_ownedMemberElement_4_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_5= 'feature' ( (lv_memberName_6_0= ruleName ) )? ) | ( (lv_memberName_7_0= ruleName ) ) ) otherlv_8= 'is' ( ( ruleQualifiedName ) ) otherlv_10= ';' ) )";
        }
    }
    static final String dfa_13s = "\35\uffff";
    static final String dfa_14s = "\4\10\1\uffff\2\20\1\uffff\2\20\4\10\1\uffff\1\10\4\20\2\10\1\uffff\2\10\4\20";
    static final String dfa_15s = "\4\73\1\uffff\2\46\1\uffff\2\46\1\11\3\46\1\uffff\1\11\4\64\2\11\1\uffff\2\11\4\64";
    static final String dfa_16s = "\4\uffff\1\1\2\uffff\1\3\6\uffff\1\2\7\uffff\1\4\6\uffff";
    static final String dfa_17s = "\35\uffff}>";
    static final String[] dfa_18s = {
            "\1\5\1\6\14\uffff\1\1\3\uffff\1\2\1\3\1\7\34\uffff\3\4",
            "\1\10\1\11\10\uffff\1\12\22\uffff\2\16\22\uffff\1\13\1\14\1\15",
            "\1\10\1\11\10\uffff\1\12\22\uffff\2\16\22\uffff\1\13\1\14\1\15",
            "\2\4\10\uffff\1\16\22\uffff\2\16\22\uffff\1\13\1\14\1\15",
            "",
            "\1\4\1\uffff\1\17\1\4\12\uffff\1\4\2\uffff\1\4\2\uffff\3\4",
            "\1\4\1\uffff\1\17\1\4\12\uffff\1\4\2\uffff\1\4\2\uffff\3\4",
            "",
            "\1\4\1\uffff\1\17\1\4\12\uffff\1\4\2\uffff\1\4\2\uffff\3\4",
            "\1\4\1\uffff\1\17\1\4\12\uffff\1\4\2\uffff\1\4\2\uffff\3\4",
            "\1\20\1\21",
            "\2\4\10\uffff\1\16\22\uffff\2\16",
            "\2\4\10\uffff\1\16\22\uffff\2\16",
            "\2\4\10\uffff\1\16\22\uffff\2\16",
            "",
            "\1\22\1\23",
            "\1\16\2\uffff\1\26\15\uffff\1\16\2\uffff\1\16\14\uffff\1\24\2\uffff\1\25",
            "\1\16\2\uffff\1\26\15\uffff\1\16\2\uffff\1\16\14\uffff\1\24\2\uffff\1\25",
            "\1\4\2\uffff\1\26\15\uffff\1\4\2\uffff\1\4\14\uffff\1\27\2\uffff\1\30",
            "\1\4\2\uffff\1\26\15\uffff\1\4\2\uffff\1\4\14\uffff\1\27\2\uffff\1\30",
            "\1\31\1\32",
            "\1\31\1\32",
            "",
            "\1\33\1\34",
            "\1\33\1\34",
            "\1\16\2\uffff\1\26\15\uffff\1\16\2\uffff\1\16\14\uffff\1\24\2\uffff\1\25",
            "\1\16\2\uffff\1\26\15\uffff\1\16\2\uffff\1\16\14\uffff\1\24\2\uffff\1\25",
            "\1\4\2\uffff\1\26\15\uffff\1\4\2\uffff\1\4\14\uffff\1\27\2\uffff\1\30",
            "\1\4\2\uffff\1\26\15\uffff\1\4\2\uffff\1\4\14\uffff\1\27\2\uffff\1\30"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1194:3: ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) )? ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_6= 'feature' | ( (lv_isComposite_7_0= 'part' ) ) | ( (lv_isPort_8_0= 'port' ) ) ) ( (lv_direction_9_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_10_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_11= 'connector' ( (lv_ownedMemberElement_12_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_13= 'feature' | ( (lv_isComposite_14_0= 'part' ) ) ) ( (lv_memberName_15_0= ruleName ) )? ) | ( (lv_memberName_16_0= ruleName ) ) ) otherlv_17= 'is' ( ( ruleQualifiedName ) ) otherlv_19= ';' ) )";
        }
    }
    static final String dfa_19s = "\26\uffff";
    static final String dfa_20s = "\1\26\2\10\2\uffff\2\20\2\10\4\20\2\10\1\uffff\2\10\4\20";
    static final String dfa_21s = "\1\34\2\73\2\uffff\2\46\2\11\4\64\2\11\1\uffff\2\11\4\64";
    static final String dfa_22s = "\3\uffff\1\1\1\2\12\uffff\1\3\6\uffff";
    static final String dfa_23s = "\26\uffff}>";
    static final String[] dfa_24s = {
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
            "\1\22\1\23",
            "",
            "\1\24\1\25",
            "\1\24\1\25",
            "\1\3\2\uffff\1\17\15\uffff\1\3\2\uffff\1\3\14\uffff\1\15\2\uffff\1\16",
            "\1\3\2\uffff\1\17\15\uffff\1\3\2\uffff\1\3\14\uffff\1\15\2\uffff\1\16",
            "\1\3\2\uffff\1\17\15\uffff\1\3\2\uffff\1\3\14\uffff\1\20\2\uffff\1\21",
            "\1\3\2\uffff\1\17\15\uffff\1\3\2\uffff\1\3\14\uffff\1\20\2\uffff\1\21"
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "1741:3: ( ( (otherlv_1= 'feature' | ( (lv_isComposite_2_0= 'part' ) ) | ( (lv_isPort_3_0= 'port' ) ) ) ( (lv_direction_4_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_5_0= ruleFeatureDefinition ) ) ) | (otherlv_6= 'connector' ( (lv_ownedMemberElement_7_0= ruleConnectorDefinition ) ) ) | ( (otherlv_8= 'feature' | ( (lv_isComposite_9_0= 'part' ) ) ) ( (lv_memberName_10_0= ruleName ) )? otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) )";
        }
    }
    static final String dfa_25s = "\2\10\1\uffff\2\20\3\10\2\20\1\10\1\uffff\1\10\4\20\2\10\1\uffff\2\10\4\20";
    static final String dfa_26s = "\2\73\1\uffff\7\46\1\11\1\uffff\1\11\4\64\2\11\1\uffff\2\11\4\64";
    static final String dfa_27s = "\2\uffff\1\1\10\uffff\1\2\7\uffff\1\3\6\uffff";
    static final String[] dfa_28s = {
            "\1\3\1\4\23\uffff\1\1\33\uffff\3\2",
            "\1\10\1\11\10\uffff\1\12\22\uffff\2\13\22\uffff\1\5\1\6\1\7",
            "",
            "\1\2\1\uffff\1\14\1\2\12\uffff\1\2\2\uffff\1\2\2\uffff\3\2",
            "\1\2\1\uffff\1\14\1\2\12\uffff\1\2\2\uffff\1\2\2\uffff\3\2",
            "\2\2\10\uffff\1\13\22\uffff\2\13",
            "\2\2\10\uffff\1\13\22\uffff\2\13",
            "\2\2\10\uffff\1\13\22\uffff\2\13",
            "\1\2\1\uffff\1\14\1\2\12\uffff\1\2\2\uffff\1\2\2\uffff\3\2",
            "\1\2\1\uffff\1\14\1\2\12\uffff\1\2\2\uffff\1\2\2\uffff\3\2",
            "\1\15\1\16",
            "",
            "\1\17\1\20",
            "\1\13\2\uffff\1\23\15\uffff\1\13\2\uffff\1\13\14\uffff\1\21\2\uffff\1\22",
            "\1\13\2\uffff\1\23\15\uffff\1\13\2\uffff\1\13\14\uffff\1\21\2\uffff\1\22",
            "\1\2\2\uffff\1\23\15\uffff\1\2\2\uffff\1\2\14\uffff\1\24\2\uffff\1\25",
            "\1\2\2\uffff\1\23\15\uffff\1\2\2\uffff\1\2\14\uffff\1\24\2\uffff\1\25",
            "\1\26\1\27",
            "\1\26\1\27",
            "",
            "\1\30\1\31",
            "\1\30\1\31",
            "\1\13\2\uffff\1\23\15\uffff\1\13\2\uffff\1\13\14\uffff\1\21\2\uffff\1\22",
            "\1\13\2\uffff\1\23\15\uffff\1\13\2\uffff\1\13\14\uffff\1\21\2\uffff\1\22",
            "\1\2\2\uffff\1\23\15\uffff\1\2\2\uffff\1\2\14\uffff\1\24\2\uffff\1\25",
            "\1\2\2\uffff\1\23\15\uffff\1\2\2\uffff\1\2\14\uffff\1\24\2\uffff\1\25"
    };
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_25;
            this.max = dfa_26;
            this.accept = dfa_27;
            this.special = dfa_5;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "1950:3: ( ( (otherlv_1= 'end' )? ( (lv_direction_2_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'end' ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_7= 'end' ( (lv_memberName_8_0= ruleName ) )? ) | ( (lv_memberName_9_0= ruleName ) ) ) otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) )";
        }
    }
    static final String dfa_29s = "\14\uffff";
    static final String dfa_30s = "\2\uffff\2\11\6\uffff\2\11";
    static final String dfa_31s = "\1\5\1\uffff\2\20\2\uffff\2\10\2\uffff\2\20";
    static final String dfa_32s = "\1\61\1\uffff\2\64\2\uffff\2\11\2\uffff\2\64";
    static final String dfa_33s = "\1\uffff\1\1\2\uffff\1\4\1\5\2\uffff\1\3\1\2\2\uffff";
    static final String dfa_34s = "\14\uffff}>";
    static final String[] dfa_35s = {
            "\3\1\1\2\1\3\6\uffff\1\4\32\uffff\1\1\2\uffff\1\5\1\uffff\2\1",
            "",
            "\2\11\1\uffff\1\11\5\uffff\1\11\7\uffff\1\11\1\uffff\1\11\4\uffff\6\11\1\10\1\11\1\uffff\1\6\2\uffff\1\7",
            "\2\11\1\uffff\1\11\5\uffff\1\11\7\uffff\1\11\1\uffff\1\11\4\uffff\6\11\1\10\1\11\1\uffff\1\6\2\uffff\1\7",
            "",
            "",
            "\1\12\1\13",
            "\1\12\1\13",
            "",
            "",
            "\2\11\1\uffff\1\11\5\uffff\1\11\7\uffff\1\11\1\uffff\1\11\4\uffff\6\11\1\10\1\11\1\uffff\1\6\2\uffff\1\7",
            "\2\11\1\uffff\1\11\5\uffff\1\11\7\uffff\1\11\1\uffff\1\11\4\uffff\6\11\1\10\1\11\1\uffff\1\6\2\uffff\1\7"
    };

    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[][] dfa_35 = unpackEncodedStringArray(dfa_35s);

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = dfa_29;
            this.eof = dfa_30;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_34;
            this.transition = dfa_35;
        }
        public String getDescription() {
            return "3482:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )";
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000D08300L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000006000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001040002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0FE000001CF28310L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0E0000001CD08300L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0E00000000908300L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0E00006000040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040948300L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0FE000003CF28310L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000001C400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0E00006000948300L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0E00000020908300L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000072400D0000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000180908300L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100908300L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000072000D0000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001200090000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000090000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00034E00009183E0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001200010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00003F0000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00034800009183E0L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0003CE00009183E0L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000800002000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00034E00009383E0L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x000C000000000082L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000060000000080L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0012000000000002L});

}