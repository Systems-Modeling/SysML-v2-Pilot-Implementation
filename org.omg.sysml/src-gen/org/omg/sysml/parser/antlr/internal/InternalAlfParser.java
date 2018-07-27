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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOCUMENTATION_COMMENT", "RULE_BOOLEAN_VALUE", "RULE_STRING_VALUE", "RULE_NATURAL_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", "RULE_STATEMENT_ANNOTATION", "RULE_INLINE_STATEMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'import'", "'::'", "'.'", "'*'", "';'", "'as'", "'package'", "'{'", "'}'", "'is'", "'class'", "'assoc'", "'feature'", "'abstract'", "'specializes'", "','", "'part'", "'port'", "'connector'", "'end'", "':'", "'any'", "'['", "'..'", "']'", "'compose'", "'='", "'subsets'", "'redefines'", "'=>'", "'@'", "'+'", "'-'", "'/'", "'^'", "'('", "')'", "'null'", "'e'", "'E'", "'public'", "'private'", "'protected'", "'packaged'", "'in'", "'out'", "'inout'"
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


    // $ANTLR start "entryRuleComment"
    // InternalAlf.g:119:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalAlf.g:119:48: (iv_ruleComment= ruleComment EOF )
            // InternalAlf.g:120:2: iv_ruleComment= ruleComment EOF
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
    // InternalAlf.g:126:1: ruleComment returns [EObject current=null] : ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_body_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:132:2: ( ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) ) )
            // InternalAlf.g:133:2: ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) )
            {
            // InternalAlf.g:133:2: ( (lv_body_0_0= RULE_DOCUMENTATION_COMMENT ) )
            // InternalAlf.g:134:3: (lv_body_0_0= RULE_DOCUMENTATION_COMMENT )
            {
            // InternalAlf.g:134:3: (lv_body_0_0= RULE_DOCUMENTATION_COMMENT )
            // InternalAlf.g:135:4: lv_body_0_0= RULE_DOCUMENTATION_COMMENT
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
    // InternalAlf.g:154:1: entryRulePackageImport returns [EObject current=null] : iv_rulePackageImport= rulePackageImport EOF ;
    public final EObject entryRulePackageImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageImport = null;


        try {
            // InternalAlf.g:154:54: (iv_rulePackageImport= rulePackageImport EOF )
            // InternalAlf.g:155:2: iv_rulePackageImport= rulePackageImport EOF
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
    // InternalAlf.g:161:1: rulePackageImport returns [EObject current=null] : ( ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )? otherlv_1= 'import' ( ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' ) ) otherlv_12= ';' ) ;
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
            // InternalAlf.g:167:2: ( ( ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )? otherlv_1= 'import' ( ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' ) ) otherlv_12= ';' ) )
            // InternalAlf.g:168:2: ( ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )? otherlv_1= 'import' ( ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' ) ) otherlv_12= ';' )
            {
            // InternalAlf.g:168:2: ( ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )? otherlv_1= 'import' ( ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' ) ) otherlv_12= ';' )
            // InternalAlf.g:169:3: ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )? otherlv_1= 'import' ( ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' ) ) otherlv_12= ';'
            {
            // InternalAlf.g:169:3: ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=55 && LA2_0<=56)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAlf.g:170:4: (lv_visibility_0_0= rulePackageElementVisibilityIndicator )
                    {
                    // InternalAlf.g:170:4: (lv_visibility_0_0= rulePackageElementVisibilityIndicator )
                    // InternalAlf.g:171:5: lv_visibility_0_0= rulePackageElementVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getPackageImportAccess().getVisibilityPackageElementVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
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

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageImportAccess().getImportKeyword_1());
            		
            // InternalAlf.g:192:3: ( ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==17) ) {
                    int LA4_3 = input.LA(3);

                    if ( ((LA4_3>=RULE_ID && LA4_3<=RULE_UNRESTRICTED_NAME)) ) {
                        alt4=3;
                    }
                    else if ( (LA4_3==18) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_1==16) ) {
                    int LA4_4 = input.LA(3);

                    if ( ((LA4_4>=RULE_ID && LA4_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt4=2;
                    }
                    else if ( (LA4_4==18) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_UNRESTRICTED_NAME) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==16) ) {
                    int LA4_4 = input.LA(3);

                    if ( ((LA4_4>=RULE_ID && LA4_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt4=2;
                    }
                    else if ( (LA4_4==18) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_2==17) ) {
                    int LA4_3 = input.LA(3);

                    if ( ((LA4_3>=RULE_ID && LA4_3<=RULE_UNRESTRICTED_NAME)) ) {
                        alt4=3;
                    }
                    else if ( (LA4_3==18) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAlf.g:193:4: ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' )
                    {
                    // InternalAlf.g:193:4: ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' )
                    // InternalAlf.g:194:5: ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*'
                    {
                    // InternalAlf.g:194:5: ( ( ruleName ) )
                    // InternalAlf.g:195:6: ( ruleName )
                    {
                    // InternalAlf.g:195:6: ( ruleName )
                    // InternalAlf.g:196:7: ruleName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPackageImportRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_2_0_0_0());
                    						
                    pushFollow(FOLLOW_5);
                    ruleName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:210:5: (otherlv_3= '::' | otherlv_4= '.' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==16) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==17) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalAlf.g:211:6: otherlv_3= '::'
                            {
                            otherlv_3=(Token)match(input,16,FOLLOW_6); 

                            						newLeafNode(otherlv_3, grammarAccess.getPackageImportAccess().getColonColonKeyword_2_0_1_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:216:6: otherlv_4= '.'
                            {
                            otherlv_4=(Token)match(input,17,FOLLOW_6); 

                            						newLeafNode(otherlv_4, grammarAccess.getPackageImportAccess().getFullStopKeyword_2_0_1_1());
                            					

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_7); 

                    					newLeafNode(otherlv_5, grammarAccess.getPackageImportAccess().getAsteriskKeyword_2_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:227:4: ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' )
                    {
                    // InternalAlf.g:227:4: ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' )
                    // InternalAlf.g:228:5: ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*'
                    {
                    // InternalAlf.g:228:5: ( ( ruleColonQualifiedName ) )
                    // InternalAlf.g:229:6: ( ruleColonQualifiedName )
                    {
                    // InternalAlf.g:229:6: ( ruleColonQualifiedName )
                    // InternalAlf.g:230:7: ruleColonQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPackageImportRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_2_1_0_0());
                    						
                    pushFollow(FOLLOW_8);
                    ruleColonQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,16,FOLLOW_6); 

                    					newLeafNode(otherlv_7, grammarAccess.getPackageImportAccess().getColonColonKeyword_2_1_1());
                    				
                    otherlv_8=(Token)match(input,18,FOLLOW_7); 

                    					newLeafNode(otherlv_8, grammarAccess.getPackageImportAccess().getAsteriskKeyword_2_1_2());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:254:4: ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' )
                    {
                    // InternalAlf.g:254:4: ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' )
                    // InternalAlf.g:255:5: ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*'
                    {
                    // InternalAlf.g:255:5: ( ( ruleDotQualifiedName ) )
                    // InternalAlf.g:256:6: ( ruleDotQualifiedName )
                    {
                    // InternalAlf.g:256:6: ( ruleDotQualifiedName )
                    // InternalAlf.g:257:7: ruleDotQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPackageImportRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPackageImportAccess().getImportedPackagePackageCrossReference_2_2_0_0());
                    						
                    pushFollow(FOLLOW_9);
                    ruleDotQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_10=(Token)match(input,17,FOLLOW_6); 

                    					newLeafNode(otherlv_10, grammarAccess.getPackageImportAccess().getFullStopKeyword_2_2_1());
                    				
                    otherlv_11=(Token)match(input,18,FOLLOW_7); 

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
    // InternalAlf.g:289:1: entryRuleElementImport returns [EObject current=null] : iv_ruleElementImport= ruleElementImport EOF ;
    public final EObject entryRuleElementImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementImport = null;


        try {
            // InternalAlf.g:289:54: (iv_ruleElementImport= ruleElementImport EOF )
            // InternalAlf.g:290:2: iv_ruleElementImport= ruleElementImport EOF
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
    // InternalAlf.g:296:1: ruleElementImport returns [EObject current=null] : ( ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )? otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleElementImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_visibility_0_0 = null;

        AntlrDatatypeRuleToken lv_memberName_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:302:2: ( ( ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )? otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' ) )
            // InternalAlf.g:303:2: ( ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )? otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' )
            {
            // InternalAlf.g:303:2: ( ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )? otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';' )
            // InternalAlf.g:304:3: ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )? otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )? otherlv_5= ';'
            {
            // InternalAlf.g:304:3: ( (lv_visibility_0_0= rulePackageElementVisibilityIndicator ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=55 && LA5_0<=56)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAlf.g:305:4: (lv_visibility_0_0= rulePackageElementVisibilityIndicator )
                    {
                    // InternalAlf.g:305:4: (lv_visibility_0_0= rulePackageElementVisibilityIndicator )
                    // InternalAlf.g:306:5: lv_visibility_0_0= rulePackageElementVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getElementImportAccess().getVisibilityPackageElementVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
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

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getElementImportAccess().getImportKeyword_1());
            		
            // InternalAlf.g:327:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:328:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:328:4: ( ruleQualifiedName )
            // InternalAlf.g:329:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementImportRule());
            					}
            				

            					newCompositeNode(grammarAccess.getElementImportAccess().getMemberElementElementCrossReference_2_0());
            				
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:343:3: (otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAlf.g:344:4: otherlv_3= 'as' ( (lv_memberName_4_0= ruleName ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getElementImportAccess().getAsKeyword_3_0());
                    			
                    // InternalAlf.g:348:4: ( (lv_memberName_4_0= ruleName ) )
                    // InternalAlf.g:349:5: (lv_memberName_4_0= ruleName )
                    {
                    // InternalAlf.g:349:5: (lv_memberName_4_0= ruleName )
                    // InternalAlf.g:350:6: lv_memberName_4_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getElementImportAccess().getMemberNameNameParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
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
    // InternalAlf.g:376:1: entryRuleNonFeatureDefinition returns [EObject current=null] : iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF ;
    public final EObject entryRuleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureDefinition = null;


        try {
            // InternalAlf.g:376:61: (iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF )
            // InternalAlf.g:377:2: iv_ruleNonFeatureDefinition= ruleNonFeatureDefinition EOF
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
    // InternalAlf.g:383:1: ruleNonFeatureDefinition returns [EObject current=null] : (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_2= ruleAssociationDefinitionOrStub ) ;
    public final EObject ruleNonFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinitionOrStub_0 = null;

        EObject this_ClassDefinitionOrStub_1 = null;

        EObject this_AssociationDefinitionOrStub_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:389:2: ( (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_2= ruleAssociationDefinitionOrStub ) )
            // InternalAlf.g:390:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_2= ruleAssociationDefinitionOrStub )
            {
            // InternalAlf.g:390:2: (this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub | this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub | this_AssociationDefinitionOrStub_2= ruleAssociationDefinitionOrStub )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 28:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==25) ) {
                    alt7=2;
                }
                else if ( (LA7_2==26) ) {
                    alt7=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalAlf.g:391:3: this_PackageDefinitionOrStub_0= rulePackageDefinitionOrStub
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
                    // InternalAlf.g:400:3: this_ClassDefinitionOrStub_1= ruleClassDefinitionOrStub
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
                    // InternalAlf.g:409:3: this_AssociationDefinitionOrStub_2= ruleAssociationDefinitionOrStub
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


    // $ANTLR start "entryRulePackageUnitDefinition"
    // InternalAlf.g:421:1: entryRulePackageUnitDefinition returns [EObject current=null] : iv_rulePackageUnitDefinition= rulePackageUnitDefinition EOF ;
    public final EObject entryRulePackageUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageUnitDefinition = null;


        try {
            // InternalAlf.g:421:62: (iv_rulePackageUnitDefinition= rulePackageUnitDefinition EOF )
            // InternalAlf.g:422:2: iv_rulePackageUnitDefinition= rulePackageUnitDefinition EOF
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
    // InternalAlf.g:428:1: rulePackageUnitDefinition returns [EObject current=null] : ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* otherlv_3= 'package' ( (lv_name_4_0= ruleName ) ) otherlv_5= '{' ( ( (lv_ownedMembership_6_0= rulePackageMember ) ) | ( (lv_ownedImport_7_0= rulePackageImport ) ) )* otherlv_8= '}' ) ;
    public final EObject rulePackageUnitDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_ownedImport_0_0 = null;

        EObject lv_ownedMembership_1_0 = null;

        EObject lv_ownedElement_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_ownedMembership_6_0 = null;

        EObject lv_ownedImport_7_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:434:2: ( ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* otherlv_3= 'package' ( (lv_name_4_0= ruleName ) ) otherlv_5= '{' ( ( (lv_ownedMembership_6_0= rulePackageMember ) ) | ( (lv_ownedImport_7_0= rulePackageImport ) ) )* otherlv_8= '}' ) )
            // InternalAlf.g:435:2: ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* otherlv_3= 'package' ( (lv_name_4_0= ruleName ) ) otherlv_5= '{' ( ( (lv_ownedMembership_6_0= rulePackageMember ) ) | ( (lv_ownedImport_7_0= rulePackageImport ) ) )* otherlv_8= '}' )
            {
            // InternalAlf.g:435:2: ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* otherlv_3= 'package' ( (lv_name_4_0= ruleName ) ) otherlv_5= '{' ( ( (lv_ownedMembership_6_0= rulePackageMember ) ) | ( (lv_ownedImport_7_0= rulePackageImport ) ) )* otherlv_8= '}' )
            // InternalAlf.g:436:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* otherlv_3= 'package' ( (lv_name_4_0= ruleName ) ) otherlv_5= '{' ( ( (lv_ownedMembership_6_0= rulePackageMember ) ) | ( (lv_ownedImport_7_0= rulePackageImport ) ) )* otherlv_8= '}'
            {
            // InternalAlf.g:436:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )*
            loop8:
            do {
                int alt8=3;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalAlf.g:437:4: ( (lv_ownedImport_0_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:437:4: ( (lv_ownedImport_0_0= rulePackageImport ) )
            	    // InternalAlf.g:438:5: (lv_ownedImport_0_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:438:5: (lv_ownedImport_0_0= rulePackageImport )
            	    // InternalAlf.g:439:6: lv_ownedImport_0_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getPackageUnitDefinitionAccess().getOwnedImportPackageImportParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_ownedImport_0_0=rulePackageImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPackageUnitDefinitionRule());
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
            	    // InternalAlf.g:457:4: ( (lv_ownedMembership_1_0= ruleElementImport ) )
            	    {
            	    // InternalAlf.g:457:4: ( (lv_ownedMembership_1_0= ruleElementImport ) )
            	    // InternalAlf.g:458:5: (lv_ownedMembership_1_0= ruleElementImport )
            	    {
            	    // InternalAlf.g:458:5: (lv_ownedMembership_1_0= ruleElementImport )
            	    // InternalAlf.g:459:6: lv_ownedMembership_1_0= ruleElementImport
            	    {

            	    						newCompositeNode(grammarAccess.getPackageUnitDefinitionAccess().getOwnedMembershipElementImportParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_ownedMembership_1_0=ruleElementImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPackageUnitDefinitionRule());
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
            	    break loop8;
                }
            } while (true);

            // InternalAlf.g:477:3: ( (lv_ownedElement_2_0= ruleComment ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAlf.g:478:4: (lv_ownedElement_2_0= ruleComment )
            	    {
            	    // InternalAlf.g:478:4: (lv_ownedElement_2_0= ruleComment )
            	    // InternalAlf.g:479:5: lv_ownedElement_2_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getPackageUnitDefinitionAccess().getOwnedElementCommentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_ownedElement_2_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageUnitDefinitionRule());
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
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPackageUnitDefinitionAccess().getPackageKeyword_2());
            		
            // InternalAlf.g:500:3: ( (lv_name_4_0= ruleName ) )
            // InternalAlf.g:501:4: (lv_name_4_0= ruleName )
            {
            // InternalAlf.g:501:4: (lv_name_4_0= ruleName )
            // InternalAlf.g:502:5: lv_name_4_0= ruleName
            {

            					newCompositeNode(grammarAccess.getPackageUnitDefinitionAccess().getNameNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_4_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageUnitDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getPackageUnitDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalAlf.g:523:3: ( ( (lv_ownedMembership_6_0= rulePackageMember ) ) | ( (lv_ownedImport_7_0= rulePackageImport ) ) )*
            loop10:
            do {
                int alt10=3;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalAlf.g:524:4: ( (lv_ownedMembership_6_0= rulePackageMember ) )
            	    {
            	    // InternalAlf.g:524:4: ( (lv_ownedMembership_6_0= rulePackageMember ) )
            	    // InternalAlf.g:525:5: (lv_ownedMembership_6_0= rulePackageMember )
            	    {
            	    // InternalAlf.g:525:5: (lv_ownedMembership_6_0= rulePackageMember )
            	    // InternalAlf.g:526:6: lv_ownedMembership_6_0= rulePackageMember
            	    {

            	    						newCompositeNode(grammarAccess.getPackageUnitDefinitionAccess().getOwnedMembershipPackageMemberParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_ownedMembership_6_0=rulePackageMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPackageUnitDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedMembership",
            	    							lv_ownedMembership_6_0,
            	    							"org.omg.sysml.Alf.PackageMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:544:4: ( (lv_ownedImport_7_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:544:4: ( (lv_ownedImport_7_0= rulePackageImport ) )
            	    // InternalAlf.g:545:5: (lv_ownedImport_7_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:545:5: (lv_ownedImport_7_0= rulePackageImport )
            	    // InternalAlf.g:546:6: lv_ownedImport_7_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getPackageUnitDefinitionAccess().getOwnedImportPackageImportParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_ownedImport_7_0=rulePackageImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPackageUnitDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedImport",
            	    							lv_ownedImport_7_0,
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

            otherlv_8=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPackageUnitDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRulePackageDefinition"
    // InternalAlf.g:572:1: entryRulePackageDefinition returns [EObject current=null] : iv_rulePackageDefinition= rulePackageDefinition EOF ;
    public final EObject entryRulePackageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDefinition = null;


        try {
            // InternalAlf.g:572:58: (iv_rulePackageDefinition= rulePackageDefinition EOF )
            // InternalAlf.g:573:2: iv_rulePackageDefinition= rulePackageDefinition EOF
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
    // InternalAlf.g:579:1: rulePackageDefinition returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' ) ;
    public final EObject rulePackageDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedMembership_3_0 = null;

        EObject lv_ownedImport_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:585:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' ) )
            // InternalAlf.g:586:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' )
            {
            // InternalAlf.g:586:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}' )
            // InternalAlf.g:587:3: otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0());
            		
            // InternalAlf.g:591:3: ( (lv_name_1_0= ruleName ) )
            // InternalAlf.g:592:4: (lv_name_1_0= ruleName )
            {
            // InternalAlf.g:592:4: (lv_name_1_0= ruleName )
            // InternalAlf.g:593:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlf.g:614:3: ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )*
            loop11:
            do {
                int alt11=3;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalAlf.g:615:4: ( (lv_ownedMembership_3_0= rulePackageMember ) )
            	    {
            	    // InternalAlf.g:615:4: ( (lv_ownedMembership_3_0= rulePackageMember ) )
            	    // InternalAlf.g:616:5: (lv_ownedMembership_3_0= rulePackageMember )
            	    {
            	    // InternalAlf.g:616:5: (lv_ownedMembership_3_0= rulePackageMember )
            	    // InternalAlf.g:617:6: lv_ownedMembership_3_0= rulePackageMember
            	    {

            	    						newCompositeNode(grammarAccess.getPackageDefinitionAccess().getOwnedMembershipPackageMemberParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
            	    // InternalAlf.g:635:4: ( (lv_ownedImport_4_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:635:4: ( (lv_ownedImport_4_0= rulePackageImport ) )
            	    // InternalAlf.g:636:5: (lv_ownedImport_4_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:636:5: (lv_ownedImport_4_0= rulePackageImport )
            	    // InternalAlf.g:637:6: lv_ownedImport_4_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getPackageDefinitionAccess().getOwnedImportPackageImportParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
            	    break loop11;
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


    // $ANTLR start "entryRulePackageDefinitionOrStub"
    // InternalAlf.g:663:1: entryRulePackageDefinitionOrStub returns [EObject current=null] : iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF ;
    public final EObject entryRulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDefinitionOrStub = null;


        try {
            // InternalAlf.g:663:64: (iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF )
            // InternalAlf.g:664:2: iv_rulePackageDefinitionOrStub= rulePackageDefinitionOrStub EOF
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
    // InternalAlf.g:670:1: rulePackageDefinitionOrStub returns [EObject current=null] : this_PackageDefinition_0= rulePackageDefinition ;
    public final EObject rulePackageDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:676:2: (this_PackageDefinition_0= rulePackageDefinition )
            // InternalAlf.g:677:2: this_PackageDefinition_0= rulePackageDefinition
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
    // InternalAlf.g:688:1: entryRulePackageMember returns [EObject current=null] : iv_rulePackageMember= rulePackageMember EOF ;
    public final EObject entryRulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageMember = null;


        try {
            // InternalAlf.g:688:54: (iv_rulePackageMember= rulePackageMember EOF )
            // InternalAlf.g:689:2: iv_rulePackageMember= rulePackageMember EOF
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
    // InternalAlf.g:695:1: rulePackageMember returns [EObject current=null] : (this_NonFeaturePackageMember_0= ruleNonFeaturePackageMember | this_FeaturePackageMember_1= ruleFeaturePackageMember ) ;
    public final EObject rulePackageMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeaturePackageMember_0 = null;

        EObject this_FeaturePackageMember_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:701:2: ( (this_NonFeaturePackageMember_0= ruleNonFeaturePackageMember | this_FeaturePackageMember_1= ruleFeaturePackageMember ) )
            // InternalAlf.g:702:2: (this_NonFeaturePackageMember_0= ruleNonFeaturePackageMember | this_FeaturePackageMember_1= ruleFeaturePackageMember )
            {
            // InternalAlf.g:702:2: (this_NonFeaturePackageMember_0= ruleNonFeaturePackageMember | this_FeaturePackageMember_1= ruleFeaturePackageMember )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalAlf.g:703:3: this_NonFeaturePackageMember_0= ruleNonFeaturePackageMember
                    {

                    			newCompositeNode(grammarAccess.getPackageMemberAccess().getNonFeaturePackageMemberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonFeaturePackageMember_0=ruleNonFeaturePackageMember();

                    state._fsp--;


                    			current = this_NonFeaturePackageMember_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:712:3: this_FeaturePackageMember_1= ruleFeaturePackageMember
                    {

                    			newCompositeNode(grammarAccess.getPackageMemberAccess().getFeaturePackageMemberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeaturePackageMember_1=ruleFeaturePackageMember();

                    state._fsp--;


                    			current = this_FeaturePackageMember_1;
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


    // $ANTLR start "entryRuleNonFeaturePackageMember"
    // InternalAlf.g:724:1: entryRuleNonFeaturePackageMember returns [EObject current=null] : iv_ruleNonFeaturePackageMember= ruleNonFeaturePackageMember EOF ;
    public final EObject entryRuleNonFeaturePackageMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeaturePackageMember = null;


        try {
            // InternalAlf.g:724:64: (iv_ruleNonFeaturePackageMember= ruleNonFeaturePackageMember EOF )
            // InternalAlf.g:725:2: iv_ruleNonFeaturePackageMember= ruleNonFeaturePackageMember EOF
            {
             newCompositeNode(grammarAccess.getNonFeaturePackageMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonFeaturePackageMember=ruleNonFeaturePackageMember();

            state._fsp--;

             current =iv_ruleNonFeaturePackageMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonFeaturePackageMember"


    // $ANTLR start "ruleNonFeaturePackageMember"
    // InternalAlf.g:731:1: ruleNonFeaturePackageMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | (otherlv_3= 'package' ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'class' ( (lv_memberName_9_0= ruleName ) )? otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) | (otherlv_13= 'assoc' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | (otherlv_18= 'import' ( ( ruleQualifiedName ) ) (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )? otherlv_22= ';' ) ) ) ;
    public final EObject ruleNonFeaturePackageMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_ownedElement_0_0 = null;

        Enumerator lv_visibility_1_0 = null;

        EObject lv_ownedMemberElement_2_0 = null;

        AntlrDatatypeRuleToken lv_memberName_4_0 = null;

        AntlrDatatypeRuleToken lv_memberName_9_0 = null;

        AntlrDatatypeRuleToken lv_memberName_14_0 = null;

        AntlrDatatypeRuleToken lv_memberName_21_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:737:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | (otherlv_3= 'package' ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'class' ( (lv_memberName_9_0= ruleName ) )? otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) | (otherlv_13= 'assoc' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | (otherlv_18= 'import' ( ( ruleQualifiedName ) ) (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )? otherlv_22= ';' ) ) ) )
            // InternalAlf.g:738:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | (otherlv_3= 'package' ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'class' ( (lv_memberName_9_0= ruleName ) )? otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) | (otherlv_13= 'assoc' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | (otherlv_18= 'import' ( ( ruleQualifiedName ) ) (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )? otherlv_22= ';' ) ) )
            {
            // InternalAlf.g:738:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | (otherlv_3= 'package' ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'class' ( (lv_memberName_9_0= ruleName ) )? otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) | (otherlv_13= 'assoc' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | (otherlv_18= 'import' ( ( ruleQualifiedName ) ) (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )? otherlv_22= ';' ) ) )
            // InternalAlf.g:739:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | (otherlv_3= 'package' ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'class' ( (lv_memberName_9_0= ruleName ) )? otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) | (otherlv_13= 'assoc' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | (otherlv_18= 'import' ( ( ruleQualifiedName ) ) (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )? otherlv_22= ';' ) )
            {
            // InternalAlf.g:739:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAlf.g:740:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:740:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:741:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getNonFeaturePackageMemberAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_ownedElement_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNonFeaturePackageMemberRule());
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
            	    break loop13;
                }
            } while (true);

            // InternalAlf.g:758:3: ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=55 && LA14_0<=56)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAlf.g:759:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    {
                    // InternalAlf.g:759:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    // InternalAlf.g:760:5: lv_visibility_1_0= rulePackageElementVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getNonFeaturePackageMemberAccess().getVisibilityPackageElementVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_visibility_1_0=rulePackageElementVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNonFeaturePackageMemberRule());
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

            // InternalAlf.g:777:3: ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | (otherlv_3= 'package' ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'class' ( (lv_memberName_9_0= ruleName ) )? otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) | (otherlv_13= 'assoc' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | (otherlv_18= 'import' ( ( ruleQualifiedName ) ) (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )? otherlv_22= ';' ) )
            int alt19=5;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalAlf.g:778:4: ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) )
                    {
                    // InternalAlf.g:778:4: ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) )
                    // InternalAlf.g:779:5: (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition )
                    {
                    // InternalAlf.g:779:5: (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition )
                    // InternalAlf.g:780:6: lv_ownedMemberElement_2_0= ruleNonFeatureDefinition
                    {

                    						newCompositeNode(grammarAccess.getNonFeaturePackageMemberAccess().getOwnedMemberElementNonFeatureDefinitionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_2_0=ruleNonFeatureDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNonFeaturePackageMemberRule());
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
                    // InternalAlf.g:798:4: (otherlv_3= 'package' ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
                    {
                    // InternalAlf.g:798:4: (otherlv_3= 'package' ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
                    // InternalAlf.g:799:5: otherlv_3= 'package' ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_17); 

                    					newLeafNode(otherlv_3, grammarAccess.getNonFeaturePackageMemberAccess().getPackageKeyword_2_1_0());
                    				
                    // InternalAlf.g:803:5: ( (lv_memberName_4_0= ruleName ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalAlf.g:804:6: (lv_memberName_4_0= ruleName )
                            {
                            // InternalAlf.g:804:6: (lv_memberName_4_0= ruleName )
                            // InternalAlf.g:805:7: lv_memberName_4_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getNonFeaturePackageMemberAccess().getMemberNameNameParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_18);
                            lv_memberName_4_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNonFeaturePackageMemberRule());
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

                    otherlv_5=(Token)match(input,24,FOLLOW_4); 

                    					newLeafNode(otherlv_5, grammarAccess.getNonFeaturePackageMemberAccess().getIsKeyword_2_1_2());
                    				
                    // InternalAlf.g:826:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:827:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:827:6: ( ruleQualifiedName )
                    // InternalAlf.g:828:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonFeaturePackageMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNonFeaturePackageMemberAccess().getMemberElementPackageCrossReference_2_1_3_0());
                    						
                    pushFollow(FOLLOW_7);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getNonFeaturePackageMemberAccess().getSemicolonKeyword_2_1_4());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:848:4: (otherlv_8= 'class' ( (lv_memberName_9_0= ruleName ) )? otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' )
                    {
                    // InternalAlf.g:848:4: (otherlv_8= 'class' ( (lv_memberName_9_0= ruleName ) )? otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' )
                    // InternalAlf.g:849:5: otherlv_8= 'class' ( (lv_memberName_9_0= ruleName ) )? otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';'
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_17); 

                    					newLeafNode(otherlv_8, grammarAccess.getNonFeaturePackageMemberAccess().getClassKeyword_2_2_0());
                    				
                    // InternalAlf.g:853:5: ( (lv_memberName_9_0= ruleName ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalAlf.g:854:6: (lv_memberName_9_0= ruleName )
                            {
                            // InternalAlf.g:854:6: (lv_memberName_9_0= ruleName )
                            // InternalAlf.g:855:7: lv_memberName_9_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getNonFeaturePackageMemberAccess().getMemberNameNameParserRuleCall_2_2_1_0());
                            						
                            pushFollow(FOLLOW_18);
                            lv_memberName_9_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNonFeaturePackageMemberRule());
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

                    otherlv_10=(Token)match(input,24,FOLLOW_4); 

                    					newLeafNode(otherlv_10, grammarAccess.getNonFeaturePackageMemberAccess().getIsKeyword_2_2_2());
                    				
                    // InternalAlf.g:876:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:877:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:877:6: ( ruleQualifiedName )
                    // InternalAlf.g:878:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonFeaturePackageMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNonFeaturePackageMemberAccess().getMemberElementClassCrossReference_2_2_3_0());
                    						
                    pushFollow(FOLLOW_7);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_12=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_12, grammarAccess.getNonFeaturePackageMemberAccess().getSemicolonKeyword_2_2_4());
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:898:4: (otherlv_13= 'assoc' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    {
                    // InternalAlf.g:898:4: (otherlv_13= 'assoc' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    // InternalAlf.g:899:5: otherlv_13= 'assoc' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';'
                    {
                    otherlv_13=(Token)match(input,26,FOLLOW_17); 

                    					newLeafNode(otherlv_13, grammarAccess.getNonFeaturePackageMemberAccess().getAssocKeyword_2_3_0());
                    				
                    // InternalAlf.g:903:5: ( (lv_memberName_14_0= ruleName ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalAlf.g:904:6: (lv_memberName_14_0= ruleName )
                            {
                            // InternalAlf.g:904:6: (lv_memberName_14_0= ruleName )
                            // InternalAlf.g:905:7: lv_memberName_14_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getNonFeaturePackageMemberAccess().getMemberNameNameParserRuleCall_2_3_1_0());
                            						
                            pushFollow(FOLLOW_18);
                            lv_memberName_14_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNonFeaturePackageMemberRule());
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

                    otherlv_15=(Token)match(input,24,FOLLOW_4); 

                    					newLeafNode(otherlv_15, grammarAccess.getNonFeaturePackageMemberAccess().getIsKeyword_2_3_2());
                    				
                    // InternalAlf.g:926:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:927:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:927:6: ( ruleQualifiedName )
                    // InternalAlf.g:928:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonFeaturePackageMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNonFeaturePackageMemberAccess().getMemberElementAssociationCrossReference_2_3_3_0());
                    						
                    pushFollow(FOLLOW_7);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_17=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_17, grammarAccess.getNonFeaturePackageMemberAccess().getSemicolonKeyword_2_3_4());
                    				

                    }


                    }
                    break;
                case 5 :
                    // InternalAlf.g:948:4: (otherlv_18= 'import' ( ( ruleQualifiedName ) ) (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )? otherlv_22= ';' )
                    {
                    // InternalAlf.g:948:4: (otherlv_18= 'import' ( ( ruleQualifiedName ) ) (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )? otherlv_22= ';' )
                    // InternalAlf.g:949:5: otherlv_18= 'import' ( ( ruleQualifiedName ) ) (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )? otherlv_22= ';'
                    {
                    otherlv_18=(Token)match(input,15,FOLLOW_4); 

                    					newLeafNode(otherlv_18, grammarAccess.getNonFeaturePackageMemberAccess().getImportKeyword_2_4_0());
                    				
                    // InternalAlf.g:953:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:954:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:954:6: ( ruleQualifiedName )
                    // InternalAlf.g:955:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonFeaturePackageMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNonFeaturePackageMemberAccess().getMemberElementElementCrossReference_2_4_1_0());
                    						
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:969:5: (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==20) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalAlf.g:970:6: otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) )
                            {
                            otherlv_20=(Token)match(input,20,FOLLOW_4); 

                            						newLeafNode(otherlv_20, grammarAccess.getNonFeaturePackageMemberAccess().getAsKeyword_2_4_2_0());
                            					
                            // InternalAlf.g:974:6: ( (lv_memberName_21_0= ruleName ) )
                            // InternalAlf.g:975:7: (lv_memberName_21_0= ruleName )
                            {
                            // InternalAlf.g:975:7: (lv_memberName_21_0= ruleName )
                            // InternalAlf.g:976:8: lv_memberName_21_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getNonFeaturePackageMemberAccess().getMemberNameNameParserRuleCall_2_4_2_1_0());
                            							
                            pushFollow(FOLLOW_7);
                            lv_memberName_21_0=ruleName();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getNonFeaturePackageMemberRule());
                            								}
                            								set(
                            									current,
                            									"memberName",
                            									lv_memberName_21_0,
                            									"org.omg.sysml.Alf.Name");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_22, grammarAccess.getNonFeaturePackageMemberAccess().getSemicolonKeyword_2_4_3());
                    				

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
    // $ANTLR end "ruleNonFeaturePackageMember"


    // $ANTLR start "entryRuleFeaturePackageMember"
    // InternalAlf.g:1004:1: entryRuleFeaturePackageMember returns [EObject current=null] : iv_ruleFeaturePackageMember= ruleFeaturePackageMember EOF ;
    public final EObject entryRuleFeaturePackageMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeaturePackageMember = null;


        try {
            // InternalAlf.g:1004:61: (iv_ruleFeaturePackageMember= ruleFeaturePackageMember EOF )
            // InternalAlf.g:1005:2: iv_ruleFeaturePackageMember= ruleFeaturePackageMember EOF
            {
             newCompositeNode(grammarAccess.getFeaturePackageMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeaturePackageMember=ruleFeaturePackageMember();

            state._fsp--;

             current =iv_ruleFeaturePackageMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeaturePackageMember"


    // $ANTLR start "ruleFeaturePackageMember"
    // InternalAlf.g:1011:1: ruleFeaturePackageMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) ) ;
    public final EObject ruleFeaturePackageMember() throws RecognitionException {
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
            // InternalAlf.g:1017:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) ) )
            // InternalAlf.g:1018:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) )
            {
            // InternalAlf.g:1018:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) )
            // InternalAlf.g:1019:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) )
            {
            // InternalAlf.g:1019:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAlf.g:1020:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:1020:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:1021:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getFeaturePackageMemberAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_ownedElement_0_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeaturePackageMemberRule());
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
            	    break loop20;
                }
            } while (true);

            // InternalAlf.g:1038:3: ( (lv_visibility_1_0= rulePackageElementVisibilityIndicator ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=55 && LA21_0<=56)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAlf.g:1039:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    {
                    // InternalAlf.g:1039:4: (lv_visibility_1_0= rulePackageElementVisibilityIndicator )
                    // InternalAlf.g:1040:5: lv_visibility_1_0= rulePackageElementVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getFeaturePackageMemberAccess().getVisibilityPackageElementVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_visibility_1_0=rulePackageElementVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFeaturePackageMemberRule());
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

            // InternalAlf.g:1057:3: ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) )
            int alt25=3;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalAlf.g:1058:4: ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1058:4: ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1059:5: (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1059:5: (otherlv_2= 'feature' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==27) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalAlf.g:1060:6: otherlv_2= 'feature'
                            {
                            otherlv_2=(Token)match(input,27,FOLLOW_20); 

                            						newLeafNode(otherlv_2, grammarAccess.getFeaturePackageMemberAccess().getFeatureKeyword_2_0_0());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:1065:5: ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1066:6: (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1066:6: (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1067:7: lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getFeaturePackageMemberAccess().getOwnedMemberElementNamedFeatureDefinitionParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_3_0=ruleNamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeaturePackageMemberRule());
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
                    // InternalAlf.g:1086:4: (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1086:4: (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:1087:5: otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_21); 

                    					newLeafNode(otherlv_4, grammarAccess.getFeaturePackageMemberAccess().getFeatureKeyword_2_1_0());
                    				
                    // InternalAlf.g:1091:5: ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:1092:6: (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:1092:6: (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:1093:7: lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition
                    {

                    							newCompositeNode(grammarAccess.getFeaturePackageMemberAccess().getOwnedMemberElementUnnamedFeatureDefinitionParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_5_0=ruleUnnamedFeatureDefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeaturePackageMemberRule());
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
                    // InternalAlf.g:1112:4: ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' )
                    {
                    // InternalAlf.g:1112:4: ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' )
                    // InternalAlf.g:1113:5: ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';'
                    {
                    // InternalAlf.g:1113:5: ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==27) ) {
                        alt24=1;
                    }
                    else if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalAlf.g:1114:6: (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? )
                            {
                            // InternalAlf.g:1114:6: (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? )
                            // InternalAlf.g:1115:7: otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )?
                            {
                            otherlv_6=(Token)match(input,27,FOLLOW_17); 

                            							newLeafNode(otherlv_6, grammarAccess.getFeaturePackageMemberAccess().getFeatureKeyword_2_2_0_0_0());
                            						
                            // InternalAlf.g:1119:7: ( (lv_memberName_7_0= ruleName ) )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // InternalAlf.g:1120:8: (lv_memberName_7_0= ruleName )
                                    {
                                    // InternalAlf.g:1120:8: (lv_memberName_7_0= ruleName )
                                    // InternalAlf.g:1121:9: lv_memberName_7_0= ruleName
                                    {

                                    									newCompositeNode(grammarAccess.getFeaturePackageMemberAccess().getMemberNameNameParserRuleCall_2_2_0_0_1_0());
                                    								
                                    pushFollow(FOLLOW_18);
                                    lv_memberName_7_0=ruleName();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getFeaturePackageMemberRule());
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
                            // InternalAlf.g:1140:6: ( (lv_memberName_8_0= ruleName ) )
                            {
                            // InternalAlf.g:1140:6: ( (lv_memberName_8_0= ruleName ) )
                            // InternalAlf.g:1141:7: (lv_memberName_8_0= ruleName )
                            {
                            // InternalAlf.g:1141:7: (lv_memberName_8_0= ruleName )
                            // InternalAlf.g:1142:8: lv_memberName_8_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getFeaturePackageMemberAccess().getMemberNameNameParserRuleCall_2_2_0_1_0());
                            							
                            pushFollow(FOLLOW_18);
                            lv_memberName_8_0=ruleName();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getFeaturePackageMemberRule());
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

                    otherlv_9=(Token)match(input,24,FOLLOW_4); 

                    					newLeafNode(otherlv_9, grammarAccess.getFeaturePackageMemberAccess().getIsKeyword_2_2_1());
                    				
                    // InternalAlf.g:1164:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1165:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1165:6: ( ruleQualifiedName )
                    // InternalAlf.g:1166:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFeaturePackageMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getFeaturePackageMemberAccess().getMemberElementFeatureCrossReference_2_2_2_0());
                    						
                    pushFollow(FOLLOW_7);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_11, grammarAccess.getFeaturePackageMemberAccess().getSemicolonKeyword_2_2_3());
                    				

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
    // $ANTLR end "ruleFeaturePackageMember"


    // $ANTLR start "entryRuleClassUnitDefinition"
    // InternalAlf.g:1190:1: entryRuleClassUnitDefinition returns [EObject current=null] : iv_ruleClassUnitDefinition= ruleClassUnitDefinition EOF ;
    public final EObject entryRuleClassUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassUnitDefinition = null;


        try {
            // InternalAlf.g:1190:60: (iv_ruleClassUnitDefinition= ruleClassUnitDefinition EOF )
            // InternalAlf.g:1191:2: iv_ruleClassUnitDefinition= ruleClassUnitDefinition EOF
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
    // InternalAlf.g:1197:1: ruleClassUnitDefinition returns [EObject current=null] : ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ( (lv_isAbstract_3_0= 'abstract' ) )? otherlv_4= 'class' ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )? otherlv_11= '{' ( ( (lv_ownedMembership_12_0= ruleClassMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )* otherlv_14= '}' ) ;
    public final EObject ruleClassUnitDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        EObject lv_ownedImport_0_0 = null;

        EObject lv_ownedMembership_1_0 = null;

        EObject lv_ownedElement_2_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_ownedElement_8_0 = null;

        EObject lv_ownedElement_10_0 = null;

        EObject lv_ownedMembership_12_0 = null;

        EObject lv_ownedImport_13_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1203:2: ( ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ( (lv_isAbstract_3_0= 'abstract' ) )? otherlv_4= 'class' ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )? otherlv_11= '{' ( ( (lv_ownedMembership_12_0= ruleClassMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )* otherlv_14= '}' ) )
            // InternalAlf.g:1204:2: ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ( (lv_isAbstract_3_0= 'abstract' ) )? otherlv_4= 'class' ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )? otherlv_11= '{' ( ( (lv_ownedMembership_12_0= ruleClassMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )* otherlv_14= '}' )
            {
            // InternalAlf.g:1204:2: ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ( (lv_isAbstract_3_0= 'abstract' ) )? otherlv_4= 'class' ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )? otherlv_11= '{' ( ( (lv_ownedMembership_12_0= ruleClassMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )* otherlv_14= '}' )
            // InternalAlf.g:1205:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ( (lv_isAbstract_3_0= 'abstract' ) )? otherlv_4= 'class' ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )? otherlv_11= '{' ( ( (lv_ownedMembership_12_0= ruleClassMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )* otherlv_14= '}'
            {
            // InternalAlf.g:1205:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )*
            loop26:
            do {
                int alt26=3;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // InternalAlf.g:1206:4: ( (lv_ownedImport_0_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:1206:4: ( (lv_ownedImport_0_0= rulePackageImport ) )
            	    // InternalAlf.g:1207:5: (lv_ownedImport_0_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:1207:5: (lv_ownedImport_0_0= rulePackageImport )
            	    // InternalAlf.g:1208:6: lv_ownedImport_0_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getClassUnitDefinitionAccess().getOwnedImportPackageImportParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_ownedImport_0_0=rulePackageImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClassUnitDefinitionRule());
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
            	    // InternalAlf.g:1226:4: ( (lv_ownedMembership_1_0= ruleElementImport ) )
            	    {
            	    // InternalAlf.g:1226:4: ( (lv_ownedMembership_1_0= ruleElementImport ) )
            	    // InternalAlf.g:1227:5: (lv_ownedMembership_1_0= ruleElementImport )
            	    {
            	    // InternalAlf.g:1227:5: (lv_ownedMembership_1_0= ruleElementImport )
            	    // InternalAlf.g:1228:6: lv_ownedMembership_1_0= ruleElementImport
            	    {

            	    						newCompositeNode(grammarAccess.getClassUnitDefinitionAccess().getOwnedMembershipElementImportParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_ownedMembership_1_0=ruleElementImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClassUnitDefinitionRule());
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
            	    break loop26;
                }
            } while (true);

            // InternalAlf.g:1246:3: ( (lv_ownedElement_2_0= ruleComment ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAlf.g:1247:4: (lv_ownedElement_2_0= ruleComment )
            	    {
            	    // InternalAlf.g:1247:4: (lv_ownedElement_2_0= ruleComment )
            	    // InternalAlf.g:1248:5: lv_ownedElement_2_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getClassUnitDefinitionAccess().getOwnedElementCommentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_ownedElement_2_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassUnitDefinitionRule());
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
            	    break loop27;
                }
            } while (true);

            // InternalAlf.g:1265:3: ( (lv_isAbstract_3_0= 'abstract' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAlf.g:1266:4: (lv_isAbstract_3_0= 'abstract' )
                    {
                    // InternalAlf.g:1266:4: (lv_isAbstract_3_0= 'abstract' )
                    // InternalAlf.g:1267:5: lv_isAbstract_3_0= 'abstract'
                    {
                    lv_isAbstract_3_0=(Token)match(input,28,FOLLOW_24); 

                    					newLeafNode(lv_isAbstract_3_0, grammarAccess.getClassUnitDefinitionAccess().getIsAbstractAbstractKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassUnitDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getClassUnitDefinitionAccess().getClassKeyword_3());
            		
            // InternalAlf.g:1283:3: ( (lv_name_5_0= ruleName ) )
            // InternalAlf.g:1284:4: (lv_name_5_0= ruleName )
            {
            // InternalAlf.g:1284:4: (lv_name_5_0= ruleName )
            // InternalAlf.g:1285:5: lv_name_5_0= ruleName
            {

            					newCompositeNode(grammarAccess.getClassUnitDefinitionAccess().getNameNameParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_name_5_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassUnitDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:1302:3: ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==24||LA31_0==29) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAlf.g:1303:4: (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )*
                    {
                    // InternalAlf.g:1303:4: (otherlv_6= 'is' | otherlv_7= 'specializes' )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==24) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==29) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalAlf.g:1304:5: otherlv_6= 'is'
                            {
                            otherlv_6=(Token)match(input,24,FOLLOW_4); 

                            					newLeafNode(otherlv_6, grammarAccess.getClassUnitDefinitionAccess().getIsKeyword_5_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1309:5: otherlv_7= 'specializes'
                            {
                            otherlv_7=(Token)match(input,29,FOLLOW_4); 

                            					newLeafNode(otherlv_7, grammarAccess.getClassUnitDefinitionAccess().getSpecializesKeyword_5_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1314:4: ( (lv_ownedElement_8_0= ruleGeneralization ) )
                    // InternalAlf.g:1315:5: (lv_ownedElement_8_0= ruleGeneralization )
                    {
                    // InternalAlf.g:1315:5: (lv_ownedElement_8_0= ruleGeneralization )
                    // InternalAlf.g:1316:6: lv_ownedElement_8_0= ruleGeneralization
                    {

                    						newCompositeNode(grammarAccess.getClassUnitDefinitionAccess().getOwnedElementGeneralizationParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_ownedElement_8_0=ruleGeneralization();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassUnitDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"ownedElement",
                    							lv_ownedElement_8_0,
                    							"org.omg.sysml.Alf.Generalization");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:1333:4: (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==30) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalAlf.g:1334:5: otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) )
                    	    {
                    	    otherlv_9=(Token)match(input,30,FOLLOW_4); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getClassUnitDefinitionAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalAlf.g:1338:5: ( (lv_ownedElement_10_0= ruleGeneralization ) )
                    	    // InternalAlf.g:1339:6: (lv_ownedElement_10_0= ruleGeneralization )
                    	    {
                    	    // InternalAlf.g:1339:6: (lv_ownedElement_10_0= ruleGeneralization )
                    	    // InternalAlf.g:1340:7: lv_ownedElement_10_0= ruleGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassUnitDefinitionAccess().getOwnedElementGeneralizationParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    lv_ownedElement_10_0=ruleGeneralization();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassUnitDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedElement",
                    	    								lv_ownedElement_10_0,
                    	    								"org.omg.sysml.Alf.Generalization");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,22,FOLLOW_27); 

            			newLeafNode(otherlv_11, grammarAccess.getClassUnitDefinitionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalAlf.g:1363:3: ( ( (lv_ownedMembership_12_0= ruleClassMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )*
            loop32:
            do {
                int alt32=3;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // InternalAlf.g:1364:4: ( (lv_ownedMembership_12_0= ruleClassMember ) )
            	    {
            	    // InternalAlf.g:1364:4: ( (lv_ownedMembership_12_0= ruleClassMember ) )
            	    // InternalAlf.g:1365:5: (lv_ownedMembership_12_0= ruleClassMember )
            	    {
            	    // InternalAlf.g:1365:5: (lv_ownedMembership_12_0= ruleClassMember )
            	    // InternalAlf.g:1366:6: lv_ownedMembership_12_0= ruleClassMember
            	    {

            	    						newCompositeNode(grammarAccess.getClassUnitDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_ownedMembership_12_0=ruleClassMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClassUnitDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedMembership",
            	    							lv_ownedMembership_12_0,
            	    							"org.omg.sysml.Alf.ClassMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:1384:4: ( (lv_ownedImport_13_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:1384:4: ( (lv_ownedImport_13_0= rulePackageImport ) )
            	    // InternalAlf.g:1385:5: (lv_ownedImport_13_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:1385:5: (lv_ownedImport_13_0= rulePackageImport )
            	    // InternalAlf.g:1386:6: lv_ownedImport_13_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getClassUnitDefinitionAccess().getOwnedImportPackageImportParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_ownedImport_13_0=rulePackageImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClassUnitDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedImport",
            	    							lv_ownedImport_13_0,
            	    							"org.omg.sysml.Alf.PackageImport");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_14=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getClassUnitDefinitionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleClassDefinition"
    // InternalAlf.g:1412:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // InternalAlf.g:1412:56: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // InternalAlf.g:1413:2: iv_ruleClassDefinition= ruleClassDefinition EOF
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
    // InternalAlf.g:1419:1: ruleClassDefinition returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? otherlv_8= '{' ( ( (lv_ownedMembership_9_0= ruleClassMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleClassDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedElement_5_0 = null;

        EObject lv_ownedElement_7_0 = null;

        EObject lv_ownedMembership_9_0 = null;

        EObject lv_ownedImport_10_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1425:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? otherlv_8= '{' ( ( (lv_ownedMembership_9_0= ruleClassMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )* otherlv_11= '}' ) )
            // InternalAlf.g:1426:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? otherlv_8= '{' ( ( (lv_ownedMembership_9_0= ruleClassMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )* otherlv_11= '}' )
            {
            // InternalAlf.g:1426:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? otherlv_8= '{' ( ( (lv_ownedMembership_9_0= ruleClassMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )* otherlv_11= '}' )
            // InternalAlf.g:1427:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? otherlv_8= '{' ( ( (lv_ownedMembership_9_0= ruleClassMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )* otherlv_11= '}'
            {
            // InternalAlf.g:1427:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAlf.g:1428:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:1428:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:1429:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,28,FOLLOW_24); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassDefinitionAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDefinitionAccess().getClassKeyword_1());
            		
            // InternalAlf.g:1445:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:1446:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:1446:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:1447:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getClassDefinitionAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_name_2_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:1464:3: ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==24||LA36_0==29) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAlf.g:1465:4: (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )*
                    {
                    // InternalAlf.g:1465:4: (otherlv_3= 'is' | otherlv_4= 'specializes' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==24) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==29) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalAlf.g:1466:5: otherlv_3= 'is'
                            {
                            otherlv_3=(Token)match(input,24,FOLLOW_4); 

                            					newLeafNode(otherlv_3, grammarAccess.getClassDefinitionAccess().getIsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1471:5: otherlv_4= 'specializes'
                            {
                            otherlv_4=(Token)match(input,29,FOLLOW_4); 

                            					newLeafNode(otherlv_4, grammarAccess.getClassDefinitionAccess().getSpecializesKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1476:4: ( (lv_ownedElement_5_0= ruleGeneralization ) )
                    // InternalAlf.g:1477:5: (lv_ownedElement_5_0= ruleGeneralization )
                    {
                    // InternalAlf.g:1477:5: (lv_ownedElement_5_0= ruleGeneralization )
                    // InternalAlf.g:1478:6: lv_ownedElement_5_0= ruleGeneralization
                    {

                    						newCompositeNode(grammarAccess.getClassDefinitionAccess().getOwnedElementGeneralizationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_ownedElement_5_0=ruleGeneralization();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"ownedElement",
                    							lv_ownedElement_5_0,
                    							"org.omg.sysml.Alf.Generalization");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:1495:4: (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==30) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalAlf.g:1496:5: otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) )
                    	    {
                    	    otherlv_6=(Token)match(input,30,FOLLOW_4); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getClassDefinitionAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:1500:5: ( (lv_ownedElement_7_0= ruleGeneralization ) )
                    	    // InternalAlf.g:1501:6: (lv_ownedElement_7_0= ruleGeneralization )
                    	    {
                    	    // InternalAlf.g:1501:6: (lv_ownedElement_7_0= ruleGeneralization )
                    	    // InternalAlf.g:1502:7: lv_ownedElement_7_0= ruleGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassDefinitionAccess().getOwnedElementGeneralizationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    lv_ownedElement_7_0=ruleGeneralization();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
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
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_27); 

            			newLeafNode(otherlv_8, grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalAlf.g:1525:3: ( ( (lv_ownedMembership_9_0= ruleClassMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )*
            loop37:
            do {
                int alt37=3;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // InternalAlf.g:1526:4: ( (lv_ownedMembership_9_0= ruleClassMember ) )
            	    {
            	    // InternalAlf.g:1526:4: ( (lv_ownedMembership_9_0= ruleClassMember ) )
            	    // InternalAlf.g:1527:5: (lv_ownedMembership_9_0= ruleClassMember )
            	    {
            	    // InternalAlf.g:1527:5: (lv_ownedMembership_9_0= ruleClassMember )
            	    // InternalAlf.g:1528:6: lv_ownedMembership_9_0= ruleClassMember
            	    {

            	    						newCompositeNode(grammarAccess.getClassDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_ownedMembership_9_0=ruleClassMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedMembership",
            	    							lv_ownedMembership_9_0,
            	    							"org.omg.sysml.Alf.ClassMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:1546:4: ( (lv_ownedImport_10_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:1546:4: ( (lv_ownedImport_10_0= rulePackageImport ) )
            	    // InternalAlf.g:1547:5: (lv_ownedImport_10_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:1547:5: (lv_ownedImport_10_0= rulePackageImport )
            	    // InternalAlf.g:1548:6: lv_ownedImport_10_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getClassDefinitionAccess().getOwnedImportPackageImportParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_ownedImport_10_0=rulePackageImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClassDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedImport",
            	    							lv_ownedImport_10_0,
            	    							"org.omg.sysml.Alf.PackageImport");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_11=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getClassDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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
    // InternalAlf.g:1574:1: entryRuleClassDefinitionOrStub returns [EObject current=null] : iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF ;
    public final EObject entryRuleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:1574:62: (iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:1575:2: iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF
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
    // InternalAlf.g:1581:1: ruleClassDefinitionOrStub returns [EObject current=null] : this_ClassDefinition_0= ruleClassDefinition ;
    public final EObject ruleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1587:2: (this_ClassDefinition_0= ruleClassDefinition )
            // InternalAlf.g:1588:2: this_ClassDefinition_0= ruleClassDefinition
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


    // $ANTLR start "entryRuleGeneralization"
    // InternalAlf.g:1599:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalAlf.g:1599:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalAlf.g:1600:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalAlf.g:1606:1: ruleGeneralization returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:1612:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:1613:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:1613:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1614:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:1614:3: ( ruleQualifiedName )
            // InternalAlf.g:1615:4: ruleQualifiedName
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
    // InternalAlf.g:1632:1: entryRuleClassMember returns [EObject current=null] : iv_ruleClassMember= ruleClassMember EOF ;
    public final EObject entryRuleClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassMember = null;


        try {
            // InternalAlf.g:1632:52: (iv_ruleClassMember= ruleClassMember EOF )
            // InternalAlf.g:1633:2: iv_ruleClassMember= ruleClassMember EOF
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
    // InternalAlf.g:1639:1: ruleClassMember returns [EObject current=null] : (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_FeatureClassMember_1= ruleFeatureClassMember ) ;
    public final EObject ruleClassMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureClassMember_0 = null;

        EObject this_FeatureClassMember_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1645:2: ( (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_FeatureClassMember_1= ruleFeatureClassMember ) )
            // InternalAlf.g:1646:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_FeatureClassMember_1= ruleFeatureClassMember )
            {
            // InternalAlf.g:1646:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_FeatureClassMember_1= ruleFeatureClassMember )
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalAlf.g:1647:3: this_NonFeatureClassMember_0= ruleNonFeatureClassMember
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
                    // InternalAlf.g:1656:3: this_FeatureClassMember_1= ruleFeatureClassMember
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
    // InternalAlf.g:1668:1: entryRuleNonFeatureClassMember returns [EObject current=null] : iv_ruleNonFeatureClassMember= ruleNonFeatureClassMember EOF ;
    public final EObject entryRuleNonFeatureClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureClassMember = null;


        try {
            // InternalAlf.g:1668:62: (iv_ruleNonFeatureClassMember= ruleNonFeatureClassMember EOF )
            // InternalAlf.g:1669:2: iv_ruleNonFeatureClassMember= ruleNonFeatureClassMember EOF
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
    // InternalAlf.g:1675:1: ruleNonFeatureClassMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | (otherlv_3= 'package' ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'class' ( (lv_memberName_9_0= ruleName ) )? otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) | (otherlv_13= 'assoc' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | (otherlv_18= 'import' ( ( ruleQualifiedName ) ) (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )? otherlv_22= ';' ) ) ) ;
    public final EObject ruleNonFeatureClassMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_ownedElement_0_0 = null;

        Enumerator lv_visibility_1_0 = null;

        EObject lv_ownedMemberElement_2_0 = null;

        AntlrDatatypeRuleToken lv_memberName_4_0 = null;

        AntlrDatatypeRuleToken lv_memberName_9_0 = null;

        AntlrDatatypeRuleToken lv_memberName_14_0 = null;

        AntlrDatatypeRuleToken lv_memberName_21_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1681:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | (otherlv_3= 'package' ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'class' ( (lv_memberName_9_0= ruleName ) )? otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) | (otherlv_13= 'assoc' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | (otherlv_18= 'import' ( ( ruleQualifiedName ) ) (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )? otherlv_22= ';' ) ) ) )
            // InternalAlf.g:1682:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | (otherlv_3= 'package' ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'class' ( (lv_memberName_9_0= ruleName ) )? otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) | (otherlv_13= 'assoc' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | (otherlv_18= 'import' ( ( ruleQualifiedName ) ) (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )? otherlv_22= ';' ) ) )
            {
            // InternalAlf.g:1682:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | (otherlv_3= 'package' ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'class' ( (lv_memberName_9_0= ruleName ) )? otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) | (otherlv_13= 'assoc' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | (otherlv_18= 'import' ( ( ruleQualifiedName ) ) (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )? otherlv_22= ';' ) ) )
            // InternalAlf.g:1683:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | (otherlv_3= 'package' ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'class' ( (lv_memberName_9_0= ruleName ) )? otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) | (otherlv_13= 'assoc' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | (otherlv_18= 'import' ( ( ruleQualifiedName ) ) (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )? otherlv_22= ';' ) )
            {
            // InternalAlf.g:1683:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAlf.g:1684:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:1684:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:1685:5: lv_ownedElement_0_0= ruleComment
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
            	    break loop39;
                }
            } while (true);

            // InternalAlf.g:1702:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=55 && LA40_0<=58)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAlf.g:1703:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:1703:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:1704:5: lv_visibility_1_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getNonFeatureClassMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_16);
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

            // InternalAlf.g:1721:3: ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | (otherlv_3= 'package' ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'class' ( (lv_memberName_9_0= ruleName ) )? otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) | (otherlv_13= 'assoc' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | (otherlv_18= 'import' ( ( ruleQualifiedName ) ) (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )? otherlv_22= ';' ) )
            int alt45=5;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // InternalAlf.g:1722:4: ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) )
                    {
                    // InternalAlf.g:1722:4: ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) )
                    // InternalAlf.g:1723:5: (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition )
                    {
                    // InternalAlf.g:1723:5: (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition )
                    // InternalAlf.g:1724:6: lv_ownedMemberElement_2_0= ruleNonFeatureDefinition
                    {

                    						newCompositeNode(grammarAccess.getNonFeatureClassMemberAccess().getOwnedMemberElementNonFeatureDefinitionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ownedMemberElement_2_0=ruleNonFeatureDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNonFeatureClassMemberRule());
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
                    // InternalAlf.g:1742:4: (otherlv_3= 'package' ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
                    {
                    // InternalAlf.g:1742:4: (otherlv_3= 'package' ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
                    // InternalAlf.g:1743:5: otherlv_3= 'package' ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_17); 

                    					newLeafNode(otherlv_3, grammarAccess.getNonFeatureClassMemberAccess().getPackageKeyword_2_1_0());
                    				
                    // InternalAlf.g:1747:5: ( (lv_memberName_4_0= ruleName ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalAlf.g:1748:6: (lv_memberName_4_0= ruleName )
                            {
                            // InternalAlf.g:1748:6: (lv_memberName_4_0= ruleName )
                            // InternalAlf.g:1749:7: lv_memberName_4_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getNonFeatureClassMemberAccess().getMemberNameNameParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_18);
                            lv_memberName_4_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNonFeatureClassMemberRule());
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

                    otherlv_5=(Token)match(input,24,FOLLOW_4); 

                    					newLeafNode(otherlv_5, grammarAccess.getNonFeatureClassMemberAccess().getIsKeyword_2_1_2());
                    				
                    // InternalAlf.g:1770:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1771:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1771:6: ( ruleQualifiedName )
                    // InternalAlf.g:1772:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonFeatureClassMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNonFeatureClassMemberAccess().getMemberElementPackageCrossReference_2_1_3_0());
                    						
                    pushFollow(FOLLOW_7);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getNonFeatureClassMemberAccess().getSemicolonKeyword_2_1_4());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:1792:4: (otherlv_8= 'class' ( (lv_memberName_9_0= ruleName ) )? otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' )
                    {
                    // InternalAlf.g:1792:4: (otherlv_8= 'class' ( (lv_memberName_9_0= ruleName ) )? otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' )
                    // InternalAlf.g:1793:5: otherlv_8= 'class' ( (lv_memberName_9_0= ruleName ) )? otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';'
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_17); 

                    					newLeafNode(otherlv_8, grammarAccess.getNonFeatureClassMemberAccess().getClassKeyword_2_2_0());
                    				
                    // InternalAlf.g:1797:5: ( (lv_memberName_9_0= ruleName ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalAlf.g:1798:6: (lv_memberName_9_0= ruleName )
                            {
                            // InternalAlf.g:1798:6: (lv_memberName_9_0= ruleName )
                            // InternalAlf.g:1799:7: lv_memberName_9_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getNonFeatureClassMemberAccess().getMemberNameNameParserRuleCall_2_2_1_0());
                            						
                            pushFollow(FOLLOW_18);
                            lv_memberName_9_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNonFeatureClassMemberRule());
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

                    otherlv_10=(Token)match(input,24,FOLLOW_4); 

                    					newLeafNode(otherlv_10, grammarAccess.getNonFeatureClassMemberAccess().getIsKeyword_2_2_2());
                    				
                    // InternalAlf.g:1820:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1821:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1821:6: ( ruleQualifiedName )
                    // InternalAlf.g:1822:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonFeatureClassMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNonFeatureClassMemberAccess().getMemberElementClassCrossReference_2_2_3_0());
                    						
                    pushFollow(FOLLOW_7);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_12=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_12, grammarAccess.getNonFeatureClassMemberAccess().getSemicolonKeyword_2_2_4());
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:1842:4: (otherlv_13= 'assoc' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    {
                    // InternalAlf.g:1842:4: (otherlv_13= 'assoc' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' )
                    // InternalAlf.g:1843:5: otherlv_13= 'assoc' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';'
                    {
                    otherlv_13=(Token)match(input,26,FOLLOW_17); 

                    					newLeafNode(otherlv_13, grammarAccess.getNonFeatureClassMemberAccess().getAssocKeyword_2_3_0());
                    				
                    // InternalAlf.g:1847:5: ( (lv_memberName_14_0= ruleName ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalAlf.g:1848:6: (lv_memberName_14_0= ruleName )
                            {
                            // InternalAlf.g:1848:6: (lv_memberName_14_0= ruleName )
                            // InternalAlf.g:1849:7: lv_memberName_14_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getNonFeatureClassMemberAccess().getMemberNameNameParserRuleCall_2_3_1_0());
                            						
                            pushFollow(FOLLOW_18);
                            lv_memberName_14_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNonFeatureClassMemberRule());
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

                    otherlv_15=(Token)match(input,24,FOLLOW_4); 

                    					newLeafNode(otherlv_15, grammarAccess.getNonFeatureClassMemberAccess().getIsKeyword_2_3_2());
                    				
                    // InternalAlf.g:1870:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1871:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1871:6: ( ruleQualifiedName )
                    // InternalAlf.g:1872:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonFeatureClassMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNonFeatureClassMemberAccess().getMemberElementAssociationCrossReference_2_3_3_0());
                    						
                    pushFollow(FOLLOW_7);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_17=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_17, grammarAccess.getNonFeatureClassMemberAccess().getSemicolonKeyword_2_3_4());
                    				

                    }


                    }
                    break;
                case 5 :
                    // InternalAlf.g:1892:4: (otherlv_18= 'import' ( ( ruleQualifiedName ) ) (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )? otherlv_22= ';' )
                    {
                    // InternalAlf.g:1892:4: (otherlv_18= 'import' ( ( ruleQualifiedName ) ) (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )? otherlv_22= ';' )
                    // InternalAlf.g:1893:5: otherlv_18= 'import' ( ( ruleQualifiedName ) ) (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )? otherlv_22= ';'
                    {
                    otherlv_18=(Token)match(input,15,FOLLOW_4); 

                    					newLeafNode(otherlv_18, grammarAccess.getNonFeatureClassMemberAccess().getImportKeyword_2_4_0());
                    				
                    // InternalAlf.g:1897:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1898:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1898:6: ( ruleQualifiedName )
                    // InternalAlf.g:1899:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonFeatureClassMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNonFeatureClassMemberAccess().getMemberElementElementCrossReference_2_4_1_0());
                    						
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:1913:5: (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==20) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalAlf.g:1914:6: otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) )
                            {
                            otherlv_20=(Token)match(input,20,FOLLOW_4); 

                            						newLeafNode(otherlv_20, grammarAccess.getNonFeatureClassMemberAccess().getAsKeyword_2_4_2_0());
                            					
                            // InternalAlf.g:1918:6: ( (lv_memberName_21_0= ruleName ) )
                            // InternalAlf.g:1919:7: (lv_memberName_21_0= ruleName )
                            {
                            // InternalAlf.g:1919:7: (lv_memberName_21_0= ruleName )
                            // InternalAlf.g:1920:8: lv_memberName_21_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getNonFeatureClassMemberAccess().getMemberNameNameParserRuleCall_2_4_2_1_0());
                            							
                            pushFollow(FOLLOW_7);
                            lv_memberName_21_0=ruleName();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getNonFeatureClassMemberRule());
                            								}
                            								set(
                            									current,
                            									"memberName",
                            									lv_memberName_21_0,
                            									"org.omg.sysml.Alf.Name");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_22, grammarAccess.getNonFeatureClassMemberAccess().getSemicolonKeyword_2_4_3());
                    				

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
    // $ANTLR end "ruleNonFeatureClassMember"


    // $ANTLR start "entryRuleFeatureClassMember"
    // InternalAlf.g:1948:1: entryRuleFeatureClassMember returns [EObject current=null] : iv_ruleFeatureClassMember= ruleFeatureClassMember EOF ;
    public final EObject entryRuleFeatureClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureClassMember = null;


        try {
            // InternalAlf.g:1948:59: (iv_ruleFeatureClassMember= ruleFeatureClassMember EOF )
            // InternalAlf.g:1949:2: iv_ruleFeatureClassMember= ruleFeatureClassMember EOF
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
    // InternalAlf.g:1955:1: ruleFeatureClassMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) ) ;
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
            // InternalAlf.g:1961:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) ) )
            // InternalAlf.g:1962:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) )
            {
            // InternalAlf.g:1962:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) )
            // InternalAlf.g:1963:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) )
            {
            // InternalAlf.g:1963:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalAlf.g:1964:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:1964:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:1965:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    break loop46;
                }
            } while (true);

            // InternalAlf.g:1982:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=55 && LA47_0<=58)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAlf.g:1983:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:1983:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:1984:5: lv_visibility_1_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_30);
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

            // InternalAlf.g:2001:3: ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) )
            int alt55=4;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // InternalAlf.g:2002:4: ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2002:4: ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:2003:5: (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:2003:5: (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )?
                    int alt48=4;
                    switch ( input.LA(1) ) {
                        case 27:
                            {
                            alt48=1;
                            }
                            break;
                        case 31:
                            {
                            alt48=2;
                            }
                            break;
                        case 32:
                            {
                            alt48=3;
                            }
                            break;
                    }

                    switch (alt48) {
                        case 1 :
                            // InternalAlf.g:2004:6: otherlv_2= 'feature'
                            {
                            otherlv_2=(Token)match(input,27,FOLLOW_31); 

                            						newLeafNode(otherlv_2, grammarAccess.getFeatureClassMemberAccess().getFeatureKeyword_2_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2009:6: ( (lv_isComposite_3_0= 'part' ) )
                            {
                            // InternalAlf.g:2009:6: ( (lv_isComposite_3_0= 'part' ) )
                            // InternalAlf.g:2010:7: (lv_isComposite_3_0= 'part' )
                            {
                            // InternalAlf.g:2010:7: (lv_isComposite_3_0= 'part' )
                            // InternalAlf.g:2011:8: lv_isComposite_3_0= 'part'
                            {
                            lv_isComposite_3_0=(Token)match(input,31,FOLLOW_31); 

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
                            // InternalAlf.g:2024:6: ( (lv_isPort_4_0= 'port' ) )
                            {
                            // InternalAlf.g:2024:6: ( (lv_isPort_4_0= 'port' ) )
                            // InternalAlf.g:2025:7: (lv_isPort_4_0= 'port' )
                            {
                            // InternalAlf.g:2025:7: (lv_isPort_4_0= 'port' )
                            // InternalAlf.g:2026:8: lv_isPort_4_0= 'port'
                            {
                            lv_isPort_4_0=(Token)match(input,32,FOLLOW_31); 

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

                    // InternalAlf.g:2039:5: ( (lv_direction_5_0= ruleFeatureDirection ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( ((LA49_0>=59 && LA49_0<=61)) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalAlf.g:2040:6: (lv_direction_5_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2040:6: (lv_direction_5_0= ruleFeatureDirection )
                            // InternalAlf.g:2041:7: lv_direction_5_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getDirectionFeatureDirectionEnumRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_20);
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

                    // InternalAlf.g:2058:5: ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:2059:6: (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:2059:6: (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:2060:7: lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:2079:4: ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2079:4: ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:2080:5: (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:2080:5: (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )
                    int alt50=3;
                    switch ( input.LA(1) ) {
                    case 27:
                        {
                        alt50=1;
                        }
                        break;
                    case 31:
                        {
                        alt50=2;
                        }
                        break;
                    case 32:
                        {
                        alt50=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }

                    switch (alt50) {
                        case 1 :
                            // InternalAlf.g:2081:6: otherlv_7= 'feature'
                            {
                            otherlv_7=(Token)match(input,27,FOLLOW_32); 

                            						newLeafNode(otherlv_7, grammarAccess.getFeatureClassMemberAccess().getFeatureKeyword_2_1_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2086:6: ( (lv_isComposite_8_0= 'part' ) )
                            {
                            // InternalAlf.g:2086:6: ( (lv_isComposite_8_0= 'part' ) )
                            // InternalAlf.g:2087:7: (lv_isComposite_8_0= 'part' )
                            {
                            // InternalAlf.g:2087:7: (lv_isComposite_8_0= 'part' )
                            // InternalAlf.g:2088:8: lv_isComposite_8_0= 'part'
                            {
                            lv_isComposite_8_0=(Token)match(input,31,FOLLOW_32); 

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
                            // InternalAlf.g:2101:6: ( (lv_isPort_9_0= 'port' ) )
                            {
                            // InternalAlf.g:2101:6: ( (lv_isPort_9_0= 'port' ) )
                            // InternalAlf.g:2102:7: (lv_isPort_9_0= 'port' )
                            {
                            // InternalAlf.g:2102:7: (lv_isPort_9_0= 'port' )
                            // InternalAlf.g:2103:8: lv_isPort_9_0= 'port'
                            {
                            lv_isPort_9_0=(Token)match(input,32,FOLLOW_32); 

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

                    // InternalAlf.g:2116:5: ( (lv_direction_10_0= ruleFeatureDirection ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( ((LA51_0>=59 && LA51_0<=61)) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalAlf.g:2117:6: (lv_direction_10_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2117:6: (lv_direction_10_0= ruleFeatureDirection )
                            // InternalAlf.g:2118:7: lv_direction_10_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getDirectionFeatureDirectionEnumRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_21);
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

                    // InternalAlf.g:2135:5: ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:2136:6: (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:2136:6: (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:2137:7: lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition
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
                    // InternalAlf.g:2156:4: (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) )
                    {
                    // InternalAlf.g:2156:4: (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) )
                    // InternalAlf.g:2157:5: otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) )
                    {
                    otherlv_12=(Token)match(input,33,FOLLOW_33); 

                    					newLeafNode(otherlv_12, grammarAccess.getFeatureClassMemberAccess().getConnectorKeyword_2_2_0());
                    				
                    // InternalAlf.g:2161:5: ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) )
                    // InternalAlf.g:2162:6: (lv_ownedMemberElement_13_0= ruleConnectorDefinition )
                    {
                    // InternalAlf.g:2162:6: (lv_ownedMemberElement_13_0= ruleConnectorDefinition )
                    // InternalAlf.g:2163:7: lv_ownedMemberElement_13_0= ruleConnectorDefinition
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
                    // InternalAlf.g:2182:4: ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' )
                    {
                    // InternalAlf.g:2182:4: ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' )
                    // InternalAlf.g:2183:5: ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';'
                    {
                    // InternalAlf.g:2183:5: ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==27||LA54_0==31) ) {
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
                            // InternalAlf.g:2184:6: ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? )
                            {
                            // InternalAlf.g:2184:6: ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? )
                            // InternalAlf.g:2185:7: (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )?
                            {
                            // InternalAlf.g:2185:7: (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) )
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==27) ) {
                                alt52=1;
                            }
                            else if ( (LA52_0==31) ) {
                                alt52=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 52, 0, input);

                                throw nvae;
                            }
                            switch (alt52) {
                                case 1 :
                                    // InternalAlf.g:2186:8: otherlv_14= 'feature'
                                    {
                                    otherlv_14=(Token)match(input,27,FOLLOW_17); 

                                    								newLeafNode(otherlv_14, grammarAccess.getFeatureClassMemberAccess().getFeatureKeyword_2_3_0_0_0_0());
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:2191:8: ( (lv_isComposite_15_0= 'part' ) )
                                    {
                                    // InternalAlf.g:2191:8: ( (lv_isComposite_15_0= 'part' ) )
                                    // InternalAlf.g:2192:9: (lv_isComposite_15_0= 'part' )
                                    {
                                    // InternalAlf.g:2192:9: (lv_isComposite_15_0= 'part' )
                                    // InternalAlf.g:2193:10: lv_isComposite_15_0= 'part'
                                    {
                                    lv_isComposite_15_0=(Token)match(input,31,FOLLOW_17); 

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

                            // InternalAlf.g:2206:7: ( (lv_memberName_16_0= ruleName ) )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt53=1;
                            }
                            switch (alt53) {
                                case 1 :
                                    // InternalAlf.g:2207:8: (lv_memberName_16_0= ruleName )
                                    {
                                    // InternalAlf.g:2207:8: (lv_memberName_16_0= ruleName )
                                    // InternalAlf.g:2208:9: lv_memberName_16_0= ruleName
                                    {

                                    									newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getMemberNameNameParserRuleCall_2_3_0_0_1_0());
                                    								
                                    pushFollow(FOLLOW_18);
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
                            // InternalAlf.g:2227:6: ( (lv_memberName_17_0= ruleName ) )
                            {
                            // InternalAlf.g:2227:6: ( (lv_memberName_17_0= ruleName ) )
                            // InternalAlf.g:2228:7: (lv_memberName_17_0= ruleName )
                            {
                            // InternalAlf.g:2228:7: (lv_memberName_17_0= ruleName )
                            // InternalAlf.g:2229:8: lv_memberName_17_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getMemberNameNameParserRuleCall_2_3_0_1_0());
                            							
                            pushFollow(FOLLOW_18);
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

                    otherlv_18=(Token)match(input,24,FOLLOW_4); 

                    					newLeafNode(otherlv_18, grammarAccess.getFeatureClassMemberAccess().getIsKeyword_2_3_1());
                    				
                    // InternalAlf.g:2251:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:2252:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:2252:6: ( ruleQualifiedName )
                    // InternalAlf.g:2253:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFeatureClassMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getMemberElementFeatureCrossReference_2_3_2_0());
                    						
                    pushFollow(FOLLOW_7);
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


    // $ANTLR start "entryRuleAssociationUnitDefinition"
    // InternalAlf.g:2277:1: entryRuleAssociationUnitDefinition returns [EObject current=null] : iv_ruleAssociationUnitDefinition= ruleAssociationUnitDefinition EOF ;
    public final EObject entryRuleAssociationUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationUnitDefinition = null;


        try {
            // InternalAlf.g:2277:66: (iv_ruleAssociationUnitDefinition= ruleAssociationUnitDefinition EOF )
            // InternalAlf.g:2278:2: iv_ruleAssociationUnitDefinition= ruleAssociationUnitDefinition EOF
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
    // InternalAlf.g:2284:1: ruleAssociationUnitDefinition returns [EObject current=null] : ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ( (lv_isAbstract_3_0= 'abstract' ) )? otherlv_4= 'assoc' ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )? otherlv_11= '{' ( ( (lv_ownedMembership_12_0= ruleAssociationMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )* otherlv_14= '}' ) ;
    public final EObject ruleAssociationUnitDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        EObject lv_ownedImport_0_0 = null;

        EObject lv_ownedMembership_1_0 = null;

        EObject lv_ownedElement_2_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_ownedElement_8_0 = null;

        EObject lv_ownedElement_10_0 = null;

        EObject lv_ownedMembership_12_0 = null;

        EObject lv_ownedImport_13_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2290:2: ( ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ( (lv_isAbstract_3_0= 'abstract' ) )? otherlv_4= 'assoc' ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )? otherlv_11= '{' ( ( (lv_ownedMembership_12_0= ruleAssociationMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )* otherlv_14= '}' ) )
            // InternalAlf.g:2291:2: ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ( (lv_isAbstract_3_0= 'abstract' ) )? otherlv_4= 'assoc' ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )? otherlv_11= '{' ( ( (lv_ownedMembership_12_0= ruleAssociationMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )* otherlv_14= '}' )
            {
            // InternalAlf.g:2291:2: ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ( (lv_isAbstract_3_0= 'abstract' ) )? otherlv_4= 'assoc' ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )? otherlv_11= '{' ( ( (lv_ownedMembership_12_0= ruleAssociationMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )* otherlv_14= '}' )
            // InternalAlf.g:2292:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ( (lv_isAbstract_3_0= 'abstract' ) )? otherlv_4= 'assoc' ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )? otherlv_11= '{' ( ( (lv_ownedMembership_12_0= ruleAssociationMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )* otherlv_14= '}'
            {
            // InternalAlf.g:2292:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )*
            loop56:
            do {
                int alt56=3;
                alt56 = dfa56.predict(input);
                switch (alt56) {
            	case 1 :
            	    // InternalAlf.g:2293:4: ( (lv_ownedImport_0_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:2293:4: ( (lv_ownedImport_0_0= rulePackageImport ) )
            	    // InternalAlf.g:2294:5: (lv_ownedImport_0_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:2294:5: (lv_ownedImport_0_0= rulePackageImport )
            	    // InternalAlf.g:2295:6: lv_ownedImport_0_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getAssociationUnitDefinitionAccess().getOwnedImportPackageImportParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_ownedImport_0_0=rulePackageImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssociationUnitDefinitionRule());
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
            	    // InternalAlf.g:2313:4: ( (lv_ownedMembership_1_0= ruleElementImport ) )
            	    {
            	    // InternalAlf.g:2313:4: ( (lv_ownedMembership_1_0= ruleElementImport ) )
            	    // InternalAlf.g:2314:5: (lv_ownedMembership_1_0= ruleElementImport )
            	    {
            	    // InternalAlf.g:2314:5: (lv_ownedMembership_1_0= ruleElementImport )
            	    // InternalAlf.g:2315:6: lv_ownedMembership_1_0= ruleElementImport
            	    {

            	    						newCompositeNode(grammarAccess.getAssociationUnitDefinitionAccess().getOwnedMembershipElementImportParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_ownedMembership_1_0=ruleElementImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssociationUnitDefinitionRule());
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
            	    break loop56;
                }
            } while (true);

            // InternalAlf.g:2333:3: ( (lv_ownedElement_2_0= ruleComment ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalAlf.g:2334:4: (lv_ownedElement_2_0= ruleComment )
            	    {
            	    // InternalAlf.g:2334:4: (lv_ownedElement_2_0= ruleComment )
            	    // InternalAlf.g:2335:5: lv_ownedElement_2_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getAssociationUnitDefinitionAccess().getOwnedElementCommentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_ownedElement_2_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAssociationUnitDefinitionRule());
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
            	    break loop57;
                }
            } while (true);

            // InternalAlf.g:2352:3: ( (lv_isAbstract_3_0= 'abstract' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==28) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAlf.g:2353:4: (lv_isAbstract_3_0= 'abstract' )
                    {
                    // InternalAlf.g:2353:4: (lv_isAbstract_3_0= 'abstract' )
                    // InternalAlf.g:2354:5: lv_isAbstract_3_0= 'abstract'
                    {
                    lv_isAbstract_3_0=(Token)match(input,28,FOLLOW_36); 

                    					newLeafNode(lv_isAbstract_3_0, grammarAccess.getAssociationUnitDefinitionAccess().getIsAbstractAbstractKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociationUnitDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getAssociationUnitDefinitionAccess().getAssocKeyword_3());
            		
            // InternalAlf.g:2370:3: ( (lv_name_5_0= ruleName ) )
            // InternalAlf.g:2371:4: (lv_name_5_0= ruleName )
            {
            // InternalAlf.g:2371:4: (lv_name_5_0= ruleName )
            // InternalAlf.g:2372:5: lv_name_5_0= ruleName
            {

            					newCompositeNode(grammarAccess.getAssociationUnitDefinitionAccess().getNameNameParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_name_5_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationUnitDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:2389:3: ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==24||LA61_0==29) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalAlf.g:2390:4: (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )*
                    {
                    // InternalAlf.g:2390:4: (otherlv_6= 'is' | otherlv_7= 'specializes' )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==24) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==29) ) {
                        alt59=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalAlf.g:2391:5: otherlv_6= 'is'
                            {
                            otherlv_6=(Token)match(input,24,FOLLOW_4); 

                            					newLeafNode(otherlv_6, grammarAccess.getAssociationUnitDefinitionAccess().getIsKeyword_5_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2396:5: otherlv_7= 'specializes'
                            {
                            otherlv_7=(Token)match(input,29,FOLLOW_4); 

                            					newLeafNode(otherlv_7, grammarAccess.getAssociationUnitDefinitionAccess().getSpecializesKeyword_5_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:2401:4: ( (lv_ownedElement_8_0= ruleGeneralization ) )
                    // InternalAlf.g:2402:5: (lv_ownedElement_8_0= ruleGeneralization )
                    {
                    // InternalAlf.g:2402:5: (lv_ownedElement_8_0= ruleGeneralization )
                    // InternalAlf.g:2403:6: lv_ownedElement_8_0= ruleGeneralization
                    {

                    						newCompositeNode(grammarAccess.getAssociationUnitDefinitionAccess().getOwnedElementGeneralizationParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_ownedElement_8_0=ruleGeneralization();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssociationUnitDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"ownedElement",
                    							lv_ownedElement_8_0,
                    							"org.omg.sysml.Alf.Generalization");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:2420:4: (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==30) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalAlf.g:2421:5: otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) )
                    	    {
                    	    otherlv_9=(Token)match(input,30,FOLLOW_4); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getAssociationUnitDefinitionAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalAlf.g:2425:5: ( (lv_ownedElement_10_0= ruleGeneralization ) )
                    	    // InternalAlf.g:2426:6: (lv_ownedElement_10_0= ruleGeneralization )
                    	    {
                    	    // InternalAlf.g:2426:6: (lv_ownedElement_10_0= ruleGeneralization )
                    	    // InternalAlf.g:2427:7: lv_ownedElement_10_0= ruleGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationUnitDefinitionAccess().getOwnedElementGeneralizationParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    lv_ownedElement_10_0=ruleGeneralization();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssociationUnitDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedElement",
                    	    								lv_ownedElement_10_0,
                    	    								"org.omg.sysml.Alf.Generalization");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,22,FOLLOW_37); 

            			newLeafNode(otherlv_11, grammarAccess.getAssociationUnitDefinitionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalAlf.g:2450:3: ( ( (lv_ownedMembership_12_0= ruleAssociationMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )*
            loop62:
            do {
                int alt62=3;
                alt62 = dfa62.predict(input);
                switch (alt62) {
            	case 1 :
            	    // InternalAlf.g:2451:4: ( (lv_ownedMembership_12_0= ruleAssociationMember ) )
            	    {
            	    // InternalAlf.g:2451:4: ( (lv_ownedMembership_12_0= ruleAssociationMember ) )
            	    // InternalAlf.g:2452:5: (lv_ownedMembership_12_0= ruleAssociationMember )
            	    {
            	    // InternalAlf.g:2452:5: (lv_ownedMembership_12_0= ruleAssociationMember )
            	    // InternalAlf.g:2453:6: lv_ownedMembership_12_0= ruleAssociationMember
            	    {

            	    						newCompositeNode(grammarAccess.getAssociationUnitDefinitionAccess().getOwnedMembershipAssociationMemberParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_ownedMembership_12_0=ruleAssociationMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssociationUnitDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedMembership",
            	    							lv_ownedMembership_12_0,
            	    							"org.omg.sysml.Alf.AssociationMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:2471:4: ( (lv_ownedImport_13_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:2471:4: ( (lv_ownedImport_13_0= rulePackageImport ) )
            	    // InternalAlf.g:2472:5: (lv_ownedImport_13_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:2472:5: (lv_ownedImport_13_0= rulePackageImport )
            	    // InternalAlf.g:2473:6: lv_ownedImport_13_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getAssociationUnitDefinitionAccess().getOwnedImportPackageImportParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_ownedImport_13_0=rulePackageImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssociationUnitDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedImport",
            	    							lv_ownedImport_13_0,
            	    							"org.omg.sysml.Alf.PackageImport");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            otherlv_14=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getAssociationUnitDefinitionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleAssociationDefinition"
    // InternalAlf.g:2499:1: entryRuleAssociationDefinition returns [EObject current=null] : iv_ruleAssociationDefinition= ruleAssociationDefinition EOF ;
    public final EObject entryRuleAssociationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinition = null;


        try {
            // InternalAlf.g:2499:62: (iv_ruleAssociationDefinition= ruleAssociationDefinition EOF )
            // InternalAlf.g:2500:2: iv_ruleAssociationDefinition= ruleAssociationDefinition EOF
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
    // InternalAlf.g:2506:1: ruleAssociationDefinition returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? otherlv_8= '{' ( ( (lv_ownedMembership_9_0= ruleAssociationMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleAssociationDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedElement_5_0 = null;

        EObject lv_ownedElement_7_0 = null;

        EObject lv_ownedMembership_9_0 = null;

        EObject lv_ownedImport_10_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2512:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? otherlv_8= '{' ( ( (lv_ownedMembership_9_0= ruleAssociationMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )* otherlv_11= '}' ) )
            // InternalAlf.g:2513:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? otherlv_8= '{' ( ( (lv_ownedMembership_9_0= ruleAssociationMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )* otherlv_11= '}' )
            {
            // InternalAlf.g:2513:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? otherlv_8= '{' ( ( (lv_ownedMembership_9_0= ruleAssociationMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )* otherlv_11= '}' )
            // InternalAlf.g:2514:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? otherlv_8= '{' ( ( (lv_ownedMembership_9_0= ruleAssociationMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )* otherlv_11= '}'
            {
            // InternalAlf.g:2514:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==28) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAlf.g:2515:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:2515:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:2516:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,28,FOLLOW_36); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getAssociationDefinitionAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociationDefinitionRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationDefinitionAccess().getAssocKeyword_1());
            		
            // InternalAlf.g:2532:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:2533:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:2533:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:2534:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_name_2_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:2551:3: ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==24||LA66_0==29) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalAlf.g:2552:4: (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )*
                    {
                    // InternalAlf.g:2552:4: (otherlv_3= 'is' | otherlv_4= 'specializes' )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==24) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==29) ) {
                        alt64=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalAlf.g:2553:5: otherlv_3= 'is'
                            {
                            otherlv_3=(Token)match(input,24,FOLLOW_4); 

                            					newLeafNode(otherlv_3, grammarAccess.getAssociationDefinitionAccess().getIsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2558:5: otherlv_4= 'specializes'
                            {
                            otherlv_4=(Token)match(input,29,FOLLOW_4); 

                            					newLeafNode(otherlv_4, grammarAccess.getAssociationDefinitionAccess().getSpecializesKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:2563:4: ( (lv_ownedElement_5_0= ruleGeneralization ) )
                    // InternalAlf.g:2564:5: (lv_ownedElement_5_0= ruleGeneralization )
                    {
                    // InternalAlf.g:2564:5: (lv_ownedElement_5_0= ruleGeneralization )
                    // InternalAlf.g:2565:6: lv_ownedElement_5_0= ruleGeneralization
                    {

                    						newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getOwnedElementGeneralizationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_ownedElement_5_0=ruleGeneralization();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssociationDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"ownedElement",
                    							lv_ownedElement_5_0,
                    							"org.omg.sysml.Alf.Generalization");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlf.g:2582:4: (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==30) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalAlf.g:2583:5: otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) )
                    	    {
                    	    otherlv_6=(Token)match(input,30,FOLLOW_4); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAssociationDefinitionAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:2587:5: ( (lv_ownedElement_7_0= ruleGeneralization ) )
                    	    // InternalAlf.g:2588:6: (lv_ownedElement_7_0= ruleGeneralization )
                    	    {
                    	    // InternalAlf.g:2588:6: (lv_ownedElement_7_0= ruleGeneralization )
                    	    // InternalAlf.g:2589:7: lv_ownedElement_7_0= ruleGeneralization
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getOwnedElementGeneralizationParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    lv_ownedElement_7_0=ruleGeneralization();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssociationDefinitionRule());
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
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_37); 

            			newLeafNode(otherlv_8, grammarAccess.getAssociationDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalAlf.g:2612:3: ( ( (lv_ownedMembership_9_0= ruleAssociationMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )*
            loop67:
            do {
                int alt67=3;
                alt67 = dfa67.predict(input);
                switch (alt67) {
            	case 1 :
            	    // InternalAlf.g:2613:4: ( (lv_ownedMembership_9_0= ruleAssociationMember ) )
            	    {
            	    // InternalAlf.g:2613:4: ( (lv_ownedMembership_9_0= ruleAssociationMember ) )
            	    // InternalAlf.g:2614:5: (lv_ownedMembership_9_0= ruleAssociationMember )
            	    {
            	    // InternalAlf.g:2614:5: (lv_ownedMembership_9_0= ruleAssociationMember )
            	    // InternalAlf.g:2615:6: lv_ownedMembership_9_0= ruleAssociationMember
            	    {

            	    						newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getOwnedMembershipAssociationMemberParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_ownedMembership_9_0=ruleAssociationMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssociationDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedMembership",
            	    							lv_ownedMembership_9_0,
            	    							"org.omg.sysml.Alf.AssociationMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:2633:4: ( (lv_ownedImport_10_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:2633:4: ( (lv_ownedImport_10_0= rulePackageImport ) )
            	    // InternalAlf.g:2634:5: (lv_ownedImport_10_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:2634:5: (lv_ownedImport_10_0= rulePackageImport )
            	    // InternalAlf.g:2635:6: lv_ownedImport_10_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getAssociationDefinitionAccess().getOwnedImportPackageImportParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_ownedImport_10_0=rulePackageImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssociationDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ownedImport",
            	    							lv_ownedImport_10_0,
            	    							"org.omg.sysml.Alf.PackageImport");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_11=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAssociationDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleAssociationDefinitionOrStub"
    // InternalAlf.g:2661:1: entryRuleAssociationDefinitionOrStub returns [EObject current=null] : iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF ;
    public final EObject entryRuleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinitionOrStub = null;


        try {
            // InternalAlf.g:2661:68: (iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF )
            // InternalAlf.g:2662:2: iv_ruleAssociationDefinitionOrStub= ruleAssociationDefinitionOrStub EOF
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
    // InternalAlf.g:2668:1: ruleAssociationDefinitionOrStub returns [EObject current=null] : this_AssociationDefinition_0= ruleAssociationDefinition ;
    public final EObject ruleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_AssociationDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2674:2: (this_AssociationDefinition_0= ruleAssociationDefinition )
            // InternalAlf.g:2675:2: this_AssociationDefinition_0= ruleAssociationDefinition
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


    // $ANTLR start "entryRuleAssociationMember"
    // InternalAlf.g:2686:1: entryRuleAssociationMember returns [EObject current=null] : iv_ruleAssociationMember= ruleAssociationMember EOF ;
    public final EObject entryRuleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationMember = null;


        try {
            // InternalAlf.g:2686:58: (iv_ruleAssociationMember= ruleAssociationMember EOF )
            // InternalAlf.g:2687:2: iv_ruleAssociationMember= ruleAssociationMember EOF
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
    // InternalAlf.g:2693:1: ruleAssociationMember returns [EObject current=null] : (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember ) ;
    public final EObject ruleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureClassMember_0 = null;

        EObject this_AssociationFeatureMember_1 = null;

        EObject this_AssociationEndFeatureMember_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2699:2: ( (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember ) )
            // InternalAlf.g:2700:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )
            {
            // InternalAlf.g:2700:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )
            int alt68=3;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // InternalAlf.g:2701:3: this_NonFeatureClassMember_0= ruleNonFeatureClassMember
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
                    // InternalAlf.g:2710:3: this_AssociationFeatureMember_1= ruleAssociationFeatureMember
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
                    // InternalAlf.g:2719:3: this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember
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
    // InternalAlf.g:2731:1: entryRuleAssociationFeatureMember returns [EObject current=null] : iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF ;
    public final EObject entryRuleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationFeatureMember = null;


        try {
            // InternalAlf.g:2731:65: (iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF )
            // InternalAlf.g:2732:2: iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF
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
    // InternalAlf.g:2738:1: ruleAssociationFeatureMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) ) ;
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
            // InternalAlf.g:2744:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) ) )
            // InternalAlf.g:2745:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) )
            {
            // InternalAlf.g:2745:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) )
            // InternalAlf.g:2746:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) )
            {
            // InternalAlf.g:2746:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalAlf.g:2747:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:2747:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:2748:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_38);
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
            	    break loop69;
                }
            } while (true);

            // InternalAlf.g:2765:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=55 && LA70_0<=58)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalAlf.g:2766:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:2766:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:2767:5: lv_visibility_1_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_39);
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

            // InternalAlf.g:2784:3: ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) )
            int alt75=3;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // InternalAlf.g:2785:4: ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2785:4: ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) )
                    // InternalAlf.g:2786:5: (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) )
                    {
                    // InternalAlf.g:2786:5: (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )
                    int alt71=3;
                    switch ( input.LA(1) ) {
                    case 27:
                        {
                        alt71=1;
                        }
                        break;
                    case 31:
                        {
                        alt71=2;
                        }
                        break;
                    case 32:
                        {
                        alt71=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }

                    switch (alt71) {
                        case 1 :
                            // InternalAlf.g:2787:6: otherlv_2= 'feature'
                            {
                            otherlv_2=(Token)match(input,27,FOLLOW_40); 

                            						newLeafNode(otherlv_2, grammarAccess.getAssociationFeatureMemberAccess().getFeatureKeyword_2_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2792:6: ( (lv_isComposite_3_0= 'part' ) )
                            {
                            // InternalAlf.g:2792:6: ( (lv_isComposite_3_0= 'part' ) )
                            // InternalAlf.g:2793:7: (lv_isComposite_3_0= 'part' )
                            {
                            // InternalAlf.g:2793:7: (lv_isComposite_3_0= 'part' )
                            // InternalAlf.g:2794:8: lv_isComposite_3_0= 'part'
                            {
                            lv_isComposite_3_0=(Token)match(input,31,FOLLOW_40); 

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
                            // InternalAlf.g:2807:6: ( (lv_isPort_4_0= 'port' ) )
                            {
                            // InternalAlf.g:2807:6: ( (lv_isPort_4_0= 'port' ) )
                            // InternalAlf.g:2808:7: (lv_isPort_4_0= 'port' )
                            {
                            // InternalAlf.g:2808:7: (lv_isPort_4_0= 'port' )
                            // InternalAlf.g:2809:8: lv_isPort_4_0= 'port'
                            {
                            lv_isPort_4_0=(Token)match(input,32,FOLLOW_40); 

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

                    // InternalAlf.g:2822:5: ( (lv_direction_5_0= ruleFeatureDirection ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( ((LA72_0>=59 && LA72_0<=61)) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalAlf.g:2823:6: (lv_direction_5_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2823:6: (lv_direction_5_0= ruleFeatureDirection )
                            // InternalAlf.g:2824:7: lv_direction_5_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_40);
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

                    // InternalAlf.g:2841:5: ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) )
                    // InternalAlf.g:2842:6: (lv_ownedMemberElement_6_0= ruleFeatureDefinition )
                    {
                    // InternalAlf.g:2842:6: (lv_ownedMemberElement_6_0= ruleFeatureDefinition )
                    // InternalAlf.g:2843:7: lv_ownedMemberElement_6_0= ruleFeatureDefinition
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
                    // InternalAlf.g:2862:4: (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) )
                    {
                    // InternalAlf.g:2862:4: (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) )
                    // InternalAlf.g:2863:5: otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_33); 

                    					newLeafNode(otherlv_7, grammarAccess.getAssociationFeatureMemberAccess().getConnectorKeyword_2_1_0());
                    				
                    // InternalAlf.g:2867:5: ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) )
                    // InternalAlf.g:2868:6: (lv_ownedMemberElement_8_0= ruleConnectorDefinition )
                    {
                    // InternalAlf.g:2868:6: (lv_ownedMemberElement_8_0= ruleConnectorDefinition )
                    // InternalAlf.g:2869:7: lv_ownedMemberElement_8_0= ruleConnectorDefinition
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
                    // InternalAlf.g:2888:4: ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' )
                    {
                    // InternalAlf.g:2888:4: ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' )
                    // InternalAlf.g:2889:5: (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';'
                    {
                    // InternalAlf.g:2889:5: (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==27) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==31) ) {
                        alt73=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalAlf.g:2890:6: otherlv_9= 'feature'
                            {
                            otherlv_9=(Token)match(input,27,FOLLOW_17); 

                            						newLeafNode(otherlv_9, grammarAccess.getAssociationFeatureMemberAccess().getFeatureKeyword_2_2_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2895:6: ( (lv_isComposite_10_0= 'part' ) )
                            {
                            // InternalAlf.g:2895:6: ( (lv_isComposite_10_0= 'part' ) )
                            // InternalAlf.g:2896:7: (lv_isComposite_10_0= 'part' )
                            {
                            // InternalAlf.g:2896:7: (lv_isComposite_10_0= 'part' )
                            // InternalAlf.g:2897:8: lv_isComposite_10_0= 'part'
                            {
                            lv_isComposite_10_0=(Token)match(input,31,FOLLOW_17); 

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

                    // InternalAlf.g:2910:5: ( (lv_memberName_11_0= ruleName ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( ((LA74_0>=RULE_ID && LA74_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalAlf.g:2911:6: (lv_memberName_11_0= ruleName )
                            {
                            // InternalAlf.g:2911:6: (lv_memberName_11_0= ruleName )
                            // InternalAlf.g:2912:7: lv_memberName_11_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getMemberNameNameParserRuleCall_2_2_1_0());
                            						
                            pushFollow(FOLLOW_18);
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

                    otherlv_12=(Token)match(input,24,FOLLOW_4); 

                    					newLeafNode(otherlv_12, grammarAccess.getAssociationFeatureMemberAccess().getIsKeyword_2_2_2());
                    				
                    // InternalAlf.g:2933:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:2934:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:2934:6: ( ruleQualifiedName )
                    // InternalAlf.g:2935:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getMemberElementFeatureCrossReference_2_2_3_0());
                    						
                    pushFollow(FOLLOW_7);
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
    // InternalAlf.g:2959:1: entryRuleAssociationEndFeatureMember returns [EObject current=null] : iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF ;
    public final EObject entryRuleAssociationEndFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEndFeatureMember = null;


        try {
            // InternalAlf.g:2959:68: (iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF )
            // InternalAlf.g:2960:2: iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF
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
    // InternalAlf.g:2966:1: ruleAssociationEndFeatureMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) ) ;
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
            // InternalAlf.g:2972:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) ) )
            // InternalAlf.g:2973:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) )
            {
            // InternalAlf.g:2973:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) )
            // InternalAlf.g:2974:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) )
            {
            // InternalAlf.g:2974:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalAlf.g:2975:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:2975:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:2976:5: lv_ownedElement_0_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getOwnedElementCommentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_41);
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
            	    break loop76;
                }
            } while (true);

            // InternalAlf.g:2993:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=55 && LA77_0<=58)) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalAlf.g:2994:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:2994:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:2995:5: lv_visibility_1_0= ruleVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getVisibilityVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_42);
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

            // InternalAlf.g:3012:3: ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) )
            int alt83=3;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // InternalAlf.g:3013:4: ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:3013:4: ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:3014:5: (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:3014:5: (otherlv_2= 'end' )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==34) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // InternalAlf.g:3015:6: otherlv_2= 'end'
                            {
                            otherlv_2=(Token)match(input,34,FOLLOW_31); 

                            						newLeafNode(otherlv_2, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_2_0_0());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:3020:5: ( (lv_direction_3_0= ruleFeatureDirection ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( ((LA79_0>=59 && LA79_0<=61)) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalAlf.g:3021:6: (lv_direction_3_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:3021:6: (lv_direction_3_0= ruleFeatureDirection )
                            // InternalAlf.g:3022:7: lv_direction_3_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_2_0_1_0());
                            						
                            pushFollow(FOLLOW_20);
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

                    // InternalAlf.g:3039:5: ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:3040:6: (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:3040:6: (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:3041:7: lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:3060:4: (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:3060:4: (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:3061:5: otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_32); 

                    					newLeafNode(otherlv_5, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_2_1_0());
                    				
                    // InternalAlf.g:3065:5: ( (lv_direction_6_0= ruleFeatureDirection ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( ((LA80_0>=59 && LA80_0<=61)) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalAlf.g:3066:6: (lv_direction_6_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:3066:6: (lv_direction_6_0= ruleFeatureDirection )
                            // InternalAlf.g:3067:7: lv_direction_6_0= ruleFeatureDirection
                            {

                            							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getDirectionFeatureDirectionEnumRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_21);
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

                    // InternalAlf.g:3084:5: ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:3085:6: (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:3085:6: (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:3086:7: lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition
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
                    // InternalAlf.g:3105:4: ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' )
                    {
                    // InternalAlf.g:3105:4: ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' )
                    // InternalAlf.g:3106:5: ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';'
                    {
                    // InternalAlf.g:3106:5: ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) )
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==34) ) {
                        alt82=1;
                    }
                    else if ( ((LA82_0>=RULE_ID && LA82_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt82=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 0, input);

                        throw nvae;
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalAlf.g:3107:6: (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? )
                            {
                            // InternalAlf.g:3107:6: (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? )
                            // InternalAlf.g:3108:7: otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )?
                            {
                            otherlv_8=(Token)match(input,34,FOLLOW_17); 

                            							newLeafNode(otherlv_8, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_2_2_0_0_0());
                            						
                            // InternalAlf.g:3112:7: ( (lv_memberName_9_0= ruleName ) )?
                            int alt81=2;
                            int LA81_0 = input.LA(1);

                            if ( ((LA81_0>=RULE_ID && LA81_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt81=1;
                            }
                            switch (alt81) {
                                case 1 :
                                    // InternalAlf.g:3113:8: (lv_memberName_9_0= ruleName )
                                    {
                                    // InternalAlf.g:3113:8: (lv_memberName_9_0= ruleName )
                                    // InternalAlf.g:3114:9: lv_memberName_9_0= ruleName
                                    {

                                    									newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberNameNameParserRuleCall_2_2_0_0_1_0());
                                    								
                                    pushFollow(FOLLOW_18);
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
                            // InternalAlf.g:3133:6: ( (lv_memberName_10_0= ruleName ) )
                            {
                            // InternalAlf.g:3133:6: ( (lv_memberName_10_0= ruleName ) )
                            // InternalAlf.g:3134:7: (lv_memberName_10_0= ruleName )
                            {
                            // InternalAlf.g:3134:7: (lv_memberName_10_0= ruleName )
                            // InternalAlf.g:3135:8: lv_memberName_10_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberNameNameParserRuleCall_2_2_0_1_0());
                            							
                            pushFollow(FOLLOW_18);
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

                    otherlv_11=(Token)match(input,24,FOLLOW_4); 

                    					newLeafNode(otherlv_11, grammarAccess.getAssociationEndFeatureMemberAccess().getIsKeyword_2_2_1());
                    				
                    // InternalAlf.g:3157:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:3158:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:3158:6: ( ruleQualifiedName )
                    // InternalAlf.g:3159:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberElementFeatureCrossReference_2_2_2_0());
                    						
                    pushFollow(FOLLOW_7);
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


    // $ANTLR start "entryRuleFeatureUnitDefinition"
    // InternalAlf.g:3183:1: entryRuleFeatureUnitDefinition returns [EObject current=null] : iv_ruleFeatureUnitDefinition= ruleFeatureUnitDefinition EOF ;
    public final EObject entryRuleFeatureUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureUnitDefinition = null;


        try {
            // InternalAlf.g:3183:62: (iv_ruleFeatureUnitDefinition= ruleFeatureUnitDefinition EOF )
            // InternalAlf.g:3184:2: iv_ruleFeatureUnitDefinition= ruleFeatureUnitDefinition EOF
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
    // InternalAlf.g:3190:1: ruleFeatureUnitDefinition returns [EObject current=null] : ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )+ otherlv_3= 'feature' ( (lv_name_4_0= ruleName ) ) ( ( (otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )? ) | ( (lv_ownedElement_9_0= ruleSubsetOrRedefinition ) ) ) (otherlv_10= '[' ( ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..' )? ( (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_14= ']' )? otherlv_15= '{' ( ( (lv_ownedMembership_16_0= ruleClassMember ) ) | ( (lv_ownedImport_17_0= rulePackageImport ) ) )* otherlv_18= '}' ) ) ;
    public final EObject ruleFeatureUnitDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        EObject lv_ownedImport_0_0 = null;

        EObject lv_ownedMembership_1_0 = null;

        EObject lv_ownedElement_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_ownedElement_8_0 = null;

        EObject lv_ownedElement_9_0 = null;

        EObject lv_lower_11_0 = null;

        EObject lv_upper_13_0 = null;

        EObject lv_ownedMembership_16_0 = null;

        EObject lv_ownedImport_17_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3196:2: ( ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )+ otherlv_3= 'feature' ( (lv_name_4_0= ruleName ) ) ( ( (otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )? ) | ( (lv_ownedElement_9_0= ruleSubsetOrRedefinition ) ) ) (otherlv_10= '[' ( ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..' )? ( (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_14= ']' )? otherlv_15= '{' ( ( (lv_ownedMembership_16_0= ruleClassMember ) ) | ( (lv_ownedImport_17_0= rulePackageImport ) ) )* otherlv_18= '}' ) ) )
            // InternalAlf.g:3197:2: ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )+ otherlv_3= 'feature' ( (lv_name_4_0= ruleName ) ) ( ( (otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )? ) | ( (lv_ownedElement_9_0= ruleSubsetOrRedefinition ) ) ) (otherlv_10= '[' ( ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..' )? ( (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_14= ']' )? otherlv_15= '{' ( ( (lv_ownedMembership_16_0= ruleClassMember ) ) | ( (lv_ownedImport_17_0= rulePackageImport ) ) )* otherlv_18= '}' ) )
            {
            // InternalAlf.g:3197:2: ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )+ otherlv_3= 'feature' ( (lv_name_4_0= ruleName ) ) ( ( (otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )? ) | ( (lv_ownedElement_9_0= ruleSubsetOrRedefinition ) ) ) (otherlv_10= '[' ( ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..' )? ( (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_14= ']' )? otherlv_15= '{' ( ( (lv_ownedMembership_16_0= ruleClassMember ) ) | ( (lv_ownedImport_17_0= rulePackageImport ) ) )* otherlv_18= '}' ) )
            // InternalAlf.g:3198:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )+ otherlv_3= 'feature' ( (lv_name_4_0= ruleName ) ) ( ( (otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )? ) | ( (lv_ownedElement_9_0= ruleSubsetOrRedefinition ) ) ) (otherlv_10= '[' ( ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..' )? ( (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_14= ']' )? otherlv_15= '{' ( ( (lv_ownedMembership_16_0= ruleClassMember ) ) | ( (lv_ownedImport_17_0= rulePackageImport ) ) )* otherlv_18= '}' )
            {
            // InternalAlf.g:3198:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )*
            loop84:
            do {
                int alt84=3;
                alt84 = dfa84.predict(input);
                switch (alt84) {
            	case 1 :
            	    // InternalAlf.g:3199:4: ( (lv_ownedImport_0_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:3199:4: ( (lv_ownedImport_0_0= rulePackageImport ) )
            	    // InternalAlf.g:3200:5: (lv_ownedImport_0_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:3200:5: (lv_ownedImport_0_0= rulePackageImport )
            	    // InternalAlf.g:3201:6: lv_ownedImport_0_0= rulePackageImport
            	    {

            	    						newCompositeNode(grammarAccess.getFeatureUnitDefinitionAccess().getOwnedImportPackageImportParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_ownedImport_0_0=rulePackageImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFeatureUnitDefinitionRule());
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
            	    // InternalAlf.g:3219:4: ( (lv_ownedMembership_1_0= ruleElementImport ) )
            	    {
            	    // InternalAlf.g:3219:4: ( (lv_ownedMembership_1_0= ruleElementImport ) )
            	    // InternalAlf.g:3220:5: (lv_ownedMembership_1_0= ruleElementImport )
            	    {
            	    // InternalAlf.g:3220:5: (lv_ownedMembership_1_0= ruleElementImport )
            	    // InternalAlf.g:3221:6: lv_ownedMembership_1_0= ruleElementImport
            	    {

            	    						newCompositeNode(grammarAccess.getFeatureUnitDefinitionAccess().getOwnedMembershipElementImportParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_ownedMembership_1_0=ruleElementImport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFeatureUnitDefinitionRule());
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
            	    break loop84;
                }
            } while (true);

            // InternalAlf.g:3239:3: ( (lv_ownedElement_2_0= ruleComment ) )+
            int cnt85=0;
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalAlf.g:3240:4: (lv_ownedElement_2_0= ruleComment )
            	    {
            	    // InternalAlf.g:3240:4: (lv_ownedElement_2_0= ruleComment )
            	    // InternalAlf.g:3241:5: lv_ownedElement_2_0= ruleComment
            	    {

            	    					newCompositeNode(grammarAccess.getFeatureUnitDefinitionAccess().getOwnedElementCommentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_ownedElement_2_0=ruleComment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFeatureUnitDefinitionRule());
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
            	    if ( cnt85 >= 1 ) break loop85;
                        EarlyExitException eee =
                            new EarlyExitException(85, input);
                        throw eee;
                }
                cnt85++;
            } while (true);

            otherlv_3=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getFeatureUnitDefinitionAccess().getFeatureKeyword_2());
            		
            // InternalAlf.g:3262:3: ( (lv_name_4_0= ruleName ) )
            // InternalAlf.g:3263:4: (lv_name_4_0= ruleName )
            {
            // InternalAlf.g:3263:4: (lv_name_4_0= ruleName )
            // InternalAlf.g:3264:5: lv_name_4_0= ruleName
            {

            					newCompositeNode(grammarAccess.getFeatureUnitDefinitionAccess().getNameNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_44);
            lv_name_4_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureUnitDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.omg.sysml.Alf.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlf.g:3281:3: ( ( (otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )? ) | ( (lv_ownedElement_9_0= ruleSubsetOrRedefinition ) ) ) (otherlv_10= '[' ( ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..' )? ( (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_14= ']' )? otherlv_15= '{' ( ( (lv_ownedMembership_16_0= ruleClassMember ) ) | ( (lv_ownedImport_17_0= rulePackageImport ) ) )* otherlv_18= '}' )
            // InternalAlf.g:3282:4: ( (otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )? ) | ( (lv_ownedElement_9_0= ruleSubsetOrRedefinition ) ) ) (otherlv_10= '[' ( ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..' )? ( (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_14= ']' )? otherlv_15= '{' ( ( (lv_ownedMembership_16_0= ruleClassMember ) ) | ( (lv_ownedImport_17_0= rulePackageImport ) ) )* otherlv_18= '}'
            {
            // InternalAlf.g:3282:4: ( (otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )? ) | ( (lv_ownedElement_9_0= ruleSubsetOrRedefinition ) ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==35) ) {
                alt88=1;
            }
            else if ( (LA88_0==24||(LA88_0>=42 && LA88_0<=43)) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalAlf.g:3283:5: (otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )? )
                    {
                    // InternalAlf.g:3283:5: (otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )? )
                    // InternalAlf.g:3284:6: otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )?
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_45); 

                    						newLeafNode(otherlv_5, grammarAccess.getFeatureUnitDefinitionAccess().getColonKeyword_4_0_0_0());
                    					
                    // InternalAlf.g:3288:6: ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' )
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( ((LA86_0>=RULE_ID && LA86_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt86=1;
                    }
                    else if ( (LA86_0==36) ) {
                        alt86=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 0, input);

                        throw nvae;
                    }
                    switch (alt86) {
                        case 1 :
                            // InternalAlf.g:3289:7: ( ( ruleQualifiedName ) )
                            {
                            // InternalAlf.g:3289:7: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:3290:8: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:3290:8: ( ruleQualifiedName )
                            // InternalAlf.g:3291:9: ruleQualifiedName
                            {

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getFeatureUnitDefinitionRule());
                            									}
                            								

                            									newCompositeNode(grammarAccess.getFeatureUnitDefinitionAccess().getReferencedTypeClassCrossReference_4_0_0_1_0_0());
                            								
                            pushFollow(FOLLOW_46);
                            ruleQualifiedName();

                            state._fsp--;


                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:3306:7: otherlv_7= 'any'
                            {
                            otherlv_7=(Token)match(input,36,FOLLOW_46); 

                            							newLeafNode(otherlv_7, grammarAccess.getFeatureUnitDefinitionAccess().getAnyKeyword_4_0_0_1_1());
                            						

                            }
                            break;

                    }

                    // InternalAlf.g:3311:6: ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==24||(LA87_0>=42 && LA87_0<=43)) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalAlf.g:3312:7: (lv_ownedElement_8_0= ruleSubsetOrRedefinition )
                            {
                            // InternalAlf.g:3312:7: (lv_ownedElement_8_0= ruleSubsetOrRedefinition )
                            // InternalAlf.g:3313:8: lv_ownedElement_8_0= ruleSubsetOrRedefinition
                            {

                            								newCompositeNode(grammarAccess.getFeatureUnitDefinitionAccess().getOwnedElementSubsetOrRedefinitionParserRuleCall_4_0_0_2_0());
                            							
                            pushFollow(FOLLOW_47);
                            lv_ownedElement_8_0=ruleSubsetOrRedefinition();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getFeatureUnitDefinitionRule());
                            								}
                            								add(
                            									current,
                            									"ownedElement",
                            									lv_ownedElement_8_0,
                            									"org.omg.sysml.Alf.SubsetOrRedefinition");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:3332:5: ( (lv_ownedElement_9_0= ruleSubsetOrRedefinition ) )
                    {
                    // InternalAlf.g:3332:5: ( (lv_ownedElement_9_0= ruleSubsetOrRedefinition ) )
                    // InternalAlf.g:3333:6: (lv_ownedElement_9_0= ruleSubsetOrRedefinition )
                    {
                    // InternalAlf.g:3333:6: (lv_ownedElement_9_0= ruleSubsetOrRedefinition )
                    // InternalAlf.g:3334:7: lv_ownedElement_9_0= ruleSubsetOrRedefinition
                    {

                    							newCompositeNode(grammarAccess.getFeatureUnitDefinitionAccess().getOwnedElementSubsetOrRedefinitionParserRuleCall_4_0_1_0());
                    						
                    pushFollow(FOLLOW_47);
                    lv_ownedElement_9_0=ruleSubsetOrRedefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeatureUnitDefinitionRule());
                    							}
                    							add(
                    								current,
                    								"ownedElement",
                    								lv_ownedElement_9_0,
                    								"org.omg.sysml.Alf.SubsetOrRedefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalAlf.g:3352:4: (otherlv_10= '[' ( ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..' )? ( (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_14= ']' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==37) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalAlf.g:3353:5: otherlv_10= '[' ( ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..' )? ( (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_14= ']'
                    {
                    otherlv_10=(Token)match(input,37,FOLLOW_48); 

                    					newLeafNode(otherlv_10, grammarAccess.getFeatureUnitDefinitionAccess().getLeftSquareBracketKeyword_4_1_0());
                    				
                    // InternalAlf.g:3357:5: ( ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..' )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==RULE_NATURAL_VALUE) ) {
                        int LA89_1 = input.LA(2);

                        if ( (LA89_1==38) ) {
                            alt89=1;
                        }
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalAlf.g:3358:6: ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..'
                            {
                            // InternalAlf.g:3358:6: ( (lv_lower_11_0= ruleNaturalLiteralExpression ) )
                            // InternalAlf.g:3359:7: (lv_lower_11_0= ruleNaturalLiteralExpression )
                            {
                            // InternalAlf.g:3359:7: (lv_lower_11_0= ruleNaturalLiteralExpression )
                            // InternalAlf.g:3360:8: lv_lower_11_0= ruleNaturalLiteralExpression
                            {

                            								newCompositeNode(grammarAccess.getFeatureUnitDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_4_1_1_0_0());
                            							
                            pushFollow(FOLLOW_49);
                            lv_lower_11_0=ruleNaturalLiteralExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getFeatureUnitDefinitionRule());
                            								}
                            								set(
                            									current,
                            									"lower",
                            									lv_lower_11_0,
                            									"org.omg.sysml.Alf.NaturalLiteralExpression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_12=(Token)match(input,38,FOLLOW_48); 

                            						newLeafNode(otherlv_12, grammarAccess.getFeatureUnitDefinitionAccess().getFullStopFullStopKeyword_4_1_1_1());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:3382:5: ( (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression ) )
                    // InternalAlf.g:3383:6: (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression )
                    {
                    // InternalAlf.g:3383:6: (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression )
                    // InternalAlf.g:3384:7: lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression
                    {

                    							newCompositeNode(grammarAccess.getFeatureUnitDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_4_1_2_0());
                    						
                    pushFollow(FOLLOW_50);
                    lv_upper_13_0=ruleUnlimitedNaturalLiteralExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFeatureUnitDefinitionRule());
                    							}
                    							set(
                    								current,
                    								"upper",
                    								lv_upper_13_0,
                    								"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_14=(Token)match(input,39,FOLLOW_13); 

                    					newLeafNode(otherlv_14, grammarAccess.getFeatureUnitDefinitionAccess().getRightSquareBracketKeyword_4_1_3());
                    				

                    }
                    break;

            }

            otherlv_15=(Token)match(input,22,FOLLOW_27); 

            				newLeafNode(otherlv_15, grammarAccess.getFeatureUnitDefinitionAccess().getLeftCurlyBracketKeyword_4_2());
            			
            // InternalAlf.g:3410:4: ( ( (lv_ownedMembership_16_0= ruleClassMember ) ) | ( (lv_ownedImport_17_0= rulePackageImport ) ) )*
            loop91:
            do {
                int alt91=3;
                alt91 = dfa91.predict(input);
                switch (alt91) {
            	case 1 :
            	    // InternalAlf.g:3411:5: ( (lv_ownedMembership_16_0= ruleClassMember ) )
            	    {
            	    // InternalAlf.g:3411:5: ( (lv_ownedMembership_16_0= ruleClassMember ) )
            	    // InternalAlf.g:3412:6: (lv_ownedMembership_16_0= ruleClassMember )
            	    {
            	    // InternalAlf.g:3412:6: (lv_ownedMembership_16_0= ruleClassMember )
            	    // InternalAlf.g:3413:7: lv_ownedMembership_16_0= ruleClassMember
            	    {

            	    							newCompositeNode(grammarAccess.getFeatureUnitDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_4_3_0_0());
            	    						
            	    pushFollow(FOLLOW_27);
            	    lv_ownedMembership_16_0=ruleClassMember();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFeatureUnitDefinitionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"ownedMembership",
            	    								lv_ownedMembership_16_0,
            	    								"org.omg.sysml.Alf.ClassMember");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:3431:5: ( (lv_ownedImport_17_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:3431:5: ( (lv_ownedImport_17_0= rulePackageImport ) )
            	    // InternalAlf.g:3432:6: (lv_ownedImport_17_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:3432:6: (lv_ownedImport_17_0= rulePackageImport )
            	    // InternalAlf.g:3433:7: lv_ownedImport_17_0= rulePackageImport
            	    {

            	    							newCompositeNode(grammarAccess.getFeatureUnitDefinitionAccess().getOwnedImportPackageImportParserRuleCall_4_3_1_0());
            	    						
            	    pushFollow(FOLLOW_27);
            	    lv_ownedImport_17_0=rulePackageImport();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFeatureUnitDefinitionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"ownedImport",
            	    								lv_ownedImport_17_0,
            	    								"org.omg.sysml.Alf.PackageImport");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            otherlv_18=(Token)match(input,23,FOLLOW_2); 

            				newLeafNode(otherlv_18, grammarAccess.getFeatureUnitDefinitionAccess().getRightCurlyBracketKeyword_4_4());
            			

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
    // $ANTLR end "ruleFeatureUnitDefinition"


    // $ANTLR start "entryRuleFeatureDefinition"
    // InternalAlf.g:3460:1: entryRuleFeatureDefinition returns [EObject current=null] : iv_ruleFeatureDefinition= ruleFeatureDefinition EOF ;
    public final EObject entryRuleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDefinition = null;


        try {
            // InternalAlf.g:3460:58: (iv_ruleFeatureDefinition= ruleFeatureDefinition EOF )
            // InternalAlf.g:3461:2: iv_ruleFeatureDefinition= ruleFeatureDefinition EOF
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
    // InternalAlf.g:3467:1: ruleFeatureDefinition returns [EObject current=null] : (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) ;
    public final EObject ruleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_NamedFeatureDefinition_0 = null;

        EObject this_UnnamedFeatureDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:3473:2: ( (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) )
            // InternalAlf.g:3474:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            {
            // InternalAlf.g:3474:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( ((LA92_0>=RULE_ID && LA92_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt92=1;
            }
            else if ( (LA92_0==24||(LA92_0>=42 && LA92_0<=43)) ) {
                alt92=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // InternalAlf.g:3475:3: this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:3484:3: this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition
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
    // InternalAlf.g:3496:1: entryRuleNamedFeatureDefinition returns [EObject current=null] : iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF ;
    public final EObject entryRuleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedFeatureDefinition = null;


        try {
            // InternalAlf.g:3496:63: (iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF )
            // InternalAlf.g:3497:2: iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF
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
    // InternalAlf.g:3503:1: ruleNamedFeatureDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' ) ) ) | ( ( (lv_ownedElement_18_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) ) | (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' ) ) ) ) ) ;
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
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedElement_5_0 = null;

        EObject lv_lower_7_0 = null;

        EObject lv_upper_9_0 = null;

        EObject lv_value_12_0 = null;

        EObject lv_ownedMembership_15_0 = null;

        EObject lv_ownedImport_16_0 = null;

        EObject lv_ownedElement_18_0 = null;

        EObject lv_lower_20_0 = null;

        EObject lv_upper_22_0 = null;

        EObject lv_value_25_0 = null;

        EObject lv_ownedMembership_28_0 = null;

        EObject lv_ownedMembership_31_0 = null;

        EObject lv_ownedImport_32_0 = null;

        EObject lv_lower_35_0 = null;

        EObject lv_upper_37_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:3509:2: ( ( ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' ) ) ) | ( ( (lv_ownedElement_18_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) ) | (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' ) ) ) ) ) )
            // InternalAlf.g:3510:2: ( ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' ) ) ) | ( ( (lv_ownedElement_18_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) ) | (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' ) ) ) ) )
            {
            // InternalAlf.g:3510:2: ( ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' ) ) ) | ( ( (lv_ownedElement_18_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) ) | (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' ) ) ) ) )
            // InternalAlf.g:3511:3: ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' ) ) ) | ( ( (lv_ownedElement_18_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) ) | (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' ) ) ) )
            {
            // InternalAlf.g:3511:3: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:3512:4: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:3512:4: (lv_name_0_0= ruleName )
            // InternalAlf.g:3513:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_51);
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

            // InternalAlf.g:3530:3: ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' ) ) ) | ( ( (lv_ownedElement_18_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) ) | (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' ) ) ) )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==19||LA110_0==22||LA110_0==35||LA110_0==37||LA110_0==41) ) {
                alt110=1;
            }
            else if ( (LA110_0==24||(LA110_0>=42 && LA110_0<=43)) ) {
                alt110=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // InternalAlf.g:3531:4: ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' ) ) )
                    {
                    // InternalAlf.g:3531:4: ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' ) ) )
                    // InternalAlf.g:3532:5: (otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' ) )
                    {
                    // InternalAlf.g:3532:5: (otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )? )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==35) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // InternalAlf.g:3533:6: otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )?
                            {
                            otherlv_1=(Token)match(input,35,FOLLOW_52); 

                            						newLeafNode(otherlv_1, grammarAccess.getNamedFeatureDefinitionAccess().getColonKeyword_1_0_0_0());
                            					
                            // InternalAlf.g:3537:6: ( (lv_isComposite_2_0= 'compose' ) )?
                            int alt93=2;
                            int LA93_0 = input.LA(1);

                            if ( (LA93_0==40) ) {
                                alt93=1;
                            }
                            switch (alt93) {
                                case 1 :
                                    // InternalAlf.g:3538:7: (lv_isComposite_2_0= 'compose' )
                                    {
                                    // InternalAlf.g:3538:7: (lv_isComposite_2_0= 'compose' )
                                    // InternalAlf.g:3539:8: lv_isComposite_2_0= 'compose'
                                    {
                                    lv_isComposite_2_0=(Token)match(input,40,FOLLOW_45); 

                                    								newLeafNode(lv_isComposite_2_0, grammarAccess.getNamedFeatureDefinitionAccess().getIsCompositeComposeKeyword_1_0_0_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getNamedFeatureDefinitionRule());
                                    								}
                                    								setWithLastConsumed(current, "isComposite", true, "compose");
                                    							

                                    }


                                    }
                                    break;

                            }

                            // InternalAlf.g:3551:6: ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' )
                            int alt94=2;
                            int LA94_0 = input.LA(1);

                            if ( ((LA94_0>=RULE_ID && LA94_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt94=1;
                            }
                            else if ( (LA94_0==36) ) {
                                alt94=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 94, 0, input);

                                throw nvae;
                            }
                            switch (alt94) {
                                case 1 :
                                    // InternalAlf.g:3552:7: ( ( ruleQualifiedName ) )
                                    {
                                    // InternalAlf.g:3552:7: ( ( ruleQualifiedName ) )
                                    // InternalAlf.g:3553:8: ( ruleQualifiedName )
                                    {
                                    // InternalAlf.g:3553:8: ( ruleQualifiedName )
                                    // InternalAlf.g:3554:9: ruleQualifiedName
                                    {

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getNamedFeatureDefinitionRule());
                                    									}
                                    								

                                    									newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getReferencedTypeClassCrossReference_1_0_0_2_0_0());
                                    								
                                    pushFollow(FOLLOW_53);
                                    ruleQualifiedName();

                                    state._fsp--;


                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:3569:7: otherlv_4= 'any'
                                    {
                                    otherlv_4=(Token)match(input,36,FOLLOW_53); 

                                    							newLeafNode(otherlv_4, grammarAccess.getNamedFeatureDefinitionAccess().getAnyKeyword_1_0_0_2_1());
                                    						

                                    }
                                    break;

                            }

                            // InternalAlf.g:3574:6: ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )?
                            int alt95=2;
                            int LA95_0 = input.LA(1);

                            if ( (LA95_0==24||(LA95_0>=42 && LA95_0<=43)) ) {
                                alt95=1;
                            }
                            switch (alt95) {
                                case 1 :
                                    // InternalAlf.g:3575:7: (lv_ownedElement_5_0= ruleSubsetOrRedefinition )
                                    {
                                    // InternalAlf.g:3575:7: (lv_ownedElement_5_0= ruleSubsetOrRedefinition )
                                    // InternalAlf.g:3576:8: lv_ownedElement_5_0= ruleSubsetOrRedefinition
                                    {

                                    								newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedElementSubsetOrRedefinitionParserRuleCall_1_0_0_3_0());
                                    							
                                    pushFollow(FOLLOW_54);
                                    lv_ownedElement_5_0=ruleSubsetOrRedefinition();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                    								}
                                    								add(
                                    									current,
                                    									"ownedElement",
                                    									lv_ownedElement_5_0,
                                    									"org.omg.sysml.Alf.SubsetOrRedefinition");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // InternalAlf.g:3594:5: (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==37) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // InternalAlf.g:3595:6: otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']'
                            {
                            otherlv_6=(Token)match(input,37,FOLLOW_48); 

                            						newLeafNode(otherlv_6, grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_0_1_0());
                            					
                            // InternalAlf.g:3599:6: ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )?
                            int alt97=2;
                            int LA97_0 = input.LA(1);

                            if ( (LA97_0==RULE_NATURAL_VALUE) ) {
                                int LA97_1 = input.LA(2);

                                if ( (LA97_1==38) ) {
                                    alt97=1;
                                }
                            }
                            switch (alt97) {
                                case 1 :
                                    // InternalAlf.g:3600:7: ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..'
                                    {
                                    // InternalAlf.g:3600:7: ( (lv_lower_7_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:3601:8: (lv_lower_7_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:3601:8: (lv_lower_7_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:3602:9: lv_lower_7_0= ruleNaturalLiteralExpression
                                    {

                                    									newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_1_1_0_0());
                                    								
                                    pushFollow(FOLLOW_49);
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

                                    otherlv_8=(Token)match(input,38,FOLLOW_48); 

                                    							newLeafNode(otherlv_8, grammarAccess.getNamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_0_1_1_1());
                                    						

                                    }
                                    break;

                            }

                            // InternalAlf.g:3624:6: ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:3625:7: (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:3625:7: (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:3626:8: lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression
                            {

                            								newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_0_1_2_0());
                            							
                            pushFollow(FOLLOW_50);
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

                            otherlv_10=(Token)match(input,39,FOLLOW_55); 

                            						newLeafNode(otherlv_10, grammarAccess.getNamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_0_1_3());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:3648:5: (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==41) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // InternalAlf.g:3649:6: otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) )
                            {
                            otherlv_11=(Token)match(input,41,FOLLOW_56); 

                            						newLeafNode(otherlv_11, grammarAccess.getNamedFeatureDefinitionAccess().getEqualsSignKeyword_1_0_2_0());
                            					
                            // InternalAlf.g:3653:6: ( (lv_value_12_0= ruleExpression ) )
                            // InternalAlf.g:3654:7: (lv_value_12_0= ruleExpression )
                            {
                            // InternalAlf.g:3654:7: (lv_value_12_0= ruleExpression )
                            // InternalAlf.g:3655:8: lv_value_12_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_0_2_1_0());
                            							
                            pushFollow(FOLLOW_57);
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

                    // InternalAlf.g:3673:5: (otherlv_13= ';' | (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' ) )
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==19) ) {
                        alt101=1;
                    }
                    else if ( (LA101_0==22) ) {
                        alt101=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 101, 0, input);

                        throw nvae;
                    }
                    switch (alt101) {
                        case 1 :
                            // InternalAlf.g:3674:6: otherlv_13= ';'
                            {
                            otherlv_13=(Token)match(input,19,FOLLOW_2); 

                            						newLeafNode(otherlv_13, grammarAccess.getNamedFeatureDefinitionAccess().getSemicolonKeyword_1_0_3_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:3679:6: (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' )
                            {
                            // InternalAlf.g:3679:6: (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' )
                            // InternalAlf.g:3680:7: otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}'
                            {
                            otherlv_14=(Token)match(input,22,FOLLOW_27); 

                            							newLeafNode(otherlv_14, grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_3_1_0());
                            						
                            // InternalAlf.g:3684:7: ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )*
                            loop100:
                            do {
                                int alt100=3;
                                alt100 = dfa100.predict(input);
                                switch (alt100) {
                            	case 1 :
                            	    // InternalAlf.g:3685:8: ( (lv_ownedMembership_15_0= ruleClassMember ) )
                            	    {
                            	    // InternalAlf.g:3685:8: ( (lv_ownedMembership_15_0= ruleClassMember ) )
                            	    // InternalAlf.g:3686:9: (lv_ownedMembership_15_0= ruleClassMember )
                            	    {
                            	    // InternalAlf.g:3686:9: (lv_ownedMembership_15_0= ruleClassMember )
                            	    // InternalAlf.g:3687:10: lv_ownedMembership_15_0= ruleClassMember
                            	    {

                            	    										newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_0_3_1_1_0_0());
                            	    									
                            	    pushFollow(FOLLOW_27);
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


                            	    }
                            	    break;
                            	case 2 :
                            	    // InternalAlf.g:3705:8: ( (lv_ownedImport_16_0= rulePackageImport ) )
                            	    {
                            	    // InternalAlf.g:3705:8: ( (lv_ownedImport_16_0= rulePackageImport ) )
                            	    // InternalAlf.g:3706:9: (lv_ownedImport_16_0= rulePackageImport )
                            	    {
                            	    // InternalAlf.g:3706:9: (lv_ownedImport_16_0= rulePackageImport )
                            	    // InternalAlf.g:3707:10: lv_ownedImport_16_0= rulePackageImport
                            	    {

                            	    										newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedImportPackageImportParserRuleCall_1_0_3_1_1_1_0());
                            	    									
                            	    pushFollow(FOLLOW_27);
                            	    lv_ownedImport_16_0=rulePackageImport();

                            	    state._fsp--;


                            	    										if (current==null) {
                            	    											current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                            	    										}
                            	    										add(
                            	    											current,
                            	    											"ownedImport",
                            	    											lv_ownedImport_16_0,
                            	    											"org.omg.sysml.Alf.PackageImport");
                            	    										afterParserOrEnumRuleCall();
                            	    									

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop100;
                                }
                            } while (true);

                            otherlv_17=(Token)match(input,23,FOLLOW_2); 

                            							newLeafNode(otherlv_17, grammarAccess.getNamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_0_3_1_2());
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:3733:4: ( ( (lv_ownedElement_18_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) ) | (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' ) ) )
                    {
                    // InternalAlf.g:3733:4: ( ( (lv_ownedElement_18_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) ) | (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' ) ) )
                    // InternalAlf.g:3734:5: ( (lv_ownedElement_18_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) ) | (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' ) )
                    {
                    // InternalAlf.g:3734:5: ( (lv_ownedElement_18_0= ruleSubsetOrRedefinition ) )
                    // InternalAlf.g:3735:6: (lv_ownedElement_18_0= ruleSubsetOrRedefinition )
                    {
                    // InternalAlf.g:3735:6: (lv_ownedElement_18_0= ruleSubsetOrRedefinition )
                    // InternalAlf.g:3736:7: lv_ownedElement_18_0= ruleSubsetOrRedefinition
                    {

                    							newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedElementSubsetOrRedefinitionParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_58);
                    lv_ownedElement_18_0=ruleSubsetOrRedefinition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                    							}
                    							add(
                    								current,
                    								"ownedElement",
                    								lv_ownedElement_18_0,
                    								"org.omg.sysml.Alf.SubsetOrRedefinition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:3753:5: ( ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) ) | (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' ) )
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==37) ) {
                        int LA109_1 = input.LA(2);

                        if ( (LA109_1==RULE_NATURAL_VALUE) ) {
                            int LA109_3 = input.LA(3);

                            if ( (LA109_3==39) ) {
                                int LA109_5 = input.LA(4);

                                if ( (LA109_5==22||LA109_5==41) ) {
                                    alt109=1;
                                }
                                else if ( (LA109_5==19) ) {
                                    alt109=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 109, 5, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA109_3==38) ) {
                                int LA109_6 = input.LA(4);

                                if ( (LA109_6==RULE_NATURAL_VALUE) ) {
                                    int LA109_8 = input.LA(5);

                                    if ( (LA109_8==39) ) {
                                        int LA109_5 = input.LA(6);

                                        if ( (LA109_5==22||LA109_5==41) ) {
                                            alt109=1;
                                        }
                                        else if ( (LA109_5==19) ) {
                                            alt109=2;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 109, 5, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 109, 8, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA109_6==18) ) {
                                    int LA109_4 = input.LA(5);

                                    if ( (LA109_4==39) ) {
                                        int LA109_5 = input.LA(6);

                                        if ( (LA109_5==22||LA109_5==41) ) {
                                            alt109=1;
                                        }
                                        else if ( (LA109_5==19) ) {
                                            alt109=2;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 109, 5, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 109, 4, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 109, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 109, 3, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA109_1==18) ) {
                            int LA109_4 = input.LA(3);

                            if ( (LA109_4==39) ) {
                                int LA109_5 = input.LA(4);

                                if ( (LA109_5==22||LA109_5==41) ) {
                                    alt109=1;
                                }
                                else if ( (LA109_5==19) ) {
                                    alt109=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 109, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 109, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 109, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA109_0==22||LA109_0==41) ) {
                        alt109=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 109, 0, input);

                        throw nvae;
                    }
                    switch (alt109) {
                        case 1 :
                            // InternalAlf.g:3754:6: ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) )
                            {
                            // InternalAlf.g:3754:6: ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) )
                            // InternalAlf.g:3755:7: (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) )
                            {
                            // InternalAlf.g:3755:7: (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )?
                            int alt103=2;
                            int LA103_0 = input.LA(1);

                            if ( (LA103_0==37) ) {
                                alt103=1;
                            }
                            switch (alt103) {
                                case 1 :
                                    // InternalAlf.g:3756:8: otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']'
                                    {
                                    otherlv_19=(Token)match(input,37,FOLLOW_48); 

                                    								newLeafNode(otherlv_19, grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_1_0_0_0());
                                    							
                                    // InternalAlf.g:3760:8: ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )?
                                    int alt102=2;
                                    int LA102_0 = input.LA(1);

                                    if ( (LA102_0==RULE_NATURAL_VALUE) ) {
                                        int LA102_1 = input.LA(2);

                                        if ( (LA102_1==38) ) {
                                            alt102=1;
                                        }
                                    }
                                    switch (alt102) {
                                        case 1 :
                                            // InternalAlf.g:3761:9: ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..'
                                            {
                                            // InternalAlf.g:3761:9: ( (lv_lower_20_0= ruleNaturalLiteralExpression ) )
                                            // InternalAlf.g:3762:10: (lv_lower_20_0= ruleNaturalLiteralExpression )
                                            {
                                            // InternalAlf.g:3762:10: (lv_lower_20_0= ruleNaturalLiteralExpression )
                                            // InternalAlf.g:3763:11: lv_lower_20_0= ruleNaturalLiteralExpression
                                            {

                                            											newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_1_0_0_1_0_0());
                                            										
                                            pushFollow(FOLLOW_49);
                                            lv_lower_20_0=ruleNaturalLiteralExpression();

                                            state._fsp--;


                                            											if (current==null) {
                                            												current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                            											}
                                            											set(
                                            												current,
                                            												"lower",
                                            												lv_lower_20_0,
                                            												"org.omg.sysml.Alf.NaturalLiteralExpression");
                                            											afterParserOrEnumRuleCall();
                                            										

                                            }


                                            }

                                            otherlv_21=(Token)match(input,38,FOLLOW_48); 

                                            									newLeafNode(otherlv_21, grammarAccess.getNamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_1_0_0_1_1());
                                            								

                                            }
                                            break;

                                    }

                                    // InternalAlf.g:3785:8: ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) )
                                    // InternalAlf.g:3786:9: (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:3786:9: (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression )
                                    // InternalAlf.g:3787:10: lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression
                                    {

                                    										newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_1_0_0_2_0());
                                    									
                                    pushFollow(FOLLOW_50);
                                    lv_upper_22_0=ruleUnlimitedNaturalLiteralExpression();

                                    state._fsp--;


                                    										if (current==null) {
                                    											current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                    										}
                                    										set(
                                    											current,
                                    											"upper",
                                    											lv_upper_22_0,
                                    											"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                                    										afterParserOrEnumRuleCall();
                                    									

                                    }


                                    }

                                    otherlv_23=(Token)match(input,39,FOLLOW_59); 

                                    								newLeafNode(otherlv_23, grammarAccess.getNamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_1_0_0_3());
                                    							

                                    }
                                    break;

                            }

                            // InternalAlf.g:3809:7: ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) )
                            int alt107=2;
                            int LA107_0 = input.LA(1);

                            if ( (LA107_0==41) ) {
                                alt107=1;
                            }
                            else if ( (LA107_0==22) ) {
                                alt107=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 107, 0, input);

                                throw nvae;
                            }
                            switch (alt107) {
                                case 1 :
                                    // InternalAlf.g:3810:8: (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) )
                                    {
                                    // InternalAlf.g:3810:8: (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) )
                                    // InternalAlf.g:3811:9: otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) )
                                    {
                                    otherlv_24=(Token)match(input,41,FOLLOW_56); 

                                    									newLeafNode(otherlv_24, grammarAccess.getNamedFeatureDefinitionAccess().getEqualsSignKeyword_1_1_1_0_1_0_0());
                                    								
                                    // InternalAlf.g:3815:9: ( (lv_value_25_0= ruleExpression ) )
                                    // InternalAlf.g:3816:10: (lv_value_25_0= ruleExpression )
                                    {
                                    // InternalAlf.g:3816:10: (lv_value_25_0= ruleExpression )
                                    // InternalAlf.g:3817:11: lv_value_25_0= ruleExpression
                                    {

                                    											newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_1_1_0_1_0_1_0());
                                    										
                                    pushFollow(FOLLOW_57);
                                    lv_value_25_0=ruleExpression();

                                    state._fsp--;


                                    											if (current==null) {
                                    												current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                    											}
                                    											set(
                                    												current,
                                    												"value",
                                    												lv_value_25_0,
                                    												"org.omg.sysml.Alf.Expression");
                                    											afterParserOrEnumRuleCall();
                                    										

                                    }


                                    }

                                    // InternalAlf.g:3834:9: (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) )
                                    int alt105=2;
                                    int LA105_0 = input.LA(1);

                                    if ( (LA105_0==19) ) {
                                        alt105=1;
                                    }
                                    else if ( (LA105_0==22) ) {
                                        alt105=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 105, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt105) {
                                        case 1 :
                                            // InternalAlf.g:3835:10: otherlv_26= ';'
                                            {
                                            otherlv_26=(Token)match(input,19,FOLLOW_2); 

                                            										newLeafNode(otherlv_26, grammarAccess.getNamedFeatureDefinitionAccess().getSemicolonKeyword_1_1_1_0_1_0_2_0());
                                            									

                                            }
                                            break;
                                        case 2 :
                                            // InternalAlf.g:3840:10: (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' )
                                            {
                                            // InternalAlf.g:3840:10: (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' )
                                            // InternalAlf.g:3841:11: otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}'
                                            {
                                            otherlv_27=(Token)match(input,22,FOLLOW_27); 

                                            											newLeafNode(otherlv_27, grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_1_1_0_1_0_2_1_0());
                                            										
                                            // InternalAlf.g:3845:11: ( (lv_ownedMembership_28_0= ruleClassMember ) )*
                                            loop104:
                                            do {
                                                int alt104=2;
                                                int LA104_0 = input.LA(1);

                                                if ( (LA104_0==RULE_DOCUMENTATION_COMMENT||(LA104_0>=RULE_ID && LA104_0<=RULE_UNRESTRICTED_NAME)||LA104_0==15||LA104_0==21||(LA104_0>=25 && LA104_0<=28)||(LA104_0>=31 && LA104_0<=33)||(LA104_0>=55 && LA104_0<=61)) ) {
                                                    alt104=1;
                                                }


                                                switch (alt104) {
                                            	case 1 :
                                            	    // InternalAlf.g:3846:12: (lv_ownedMembership_28_0= ruleClassMember )
                                            	    {
                                            	    // InternalAlf.g:3846:12: (lv_ownedMembership_28_0= ruleClassMember )
                                            	    // InternalAlf.g:3847:13: lv_ownedMembership_28_0= ruleClassMember
                                            	    {

                                            	    													newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_1_1_0_1_0_2_1_1_0());
                                            	    												
                                            	    pushFollow(FOLLOW_27);
                                            	    lv_ownedMembership_28_0=ruleClassMember();

                                            	    state._fsp--;


                                            	    													if (current==null) {
                                            	    														current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                            	    													}
                                            	    													add(
                                            	    														current,
                                            	    														"ownedMembership",
                                            	    														lv_ownedMembership_28_0,
                                            	    														"org.omg.sysml.Alf.ClassMember");
                                            	    													afterParserOrEnumRuleCall();
                                            	    												

                                            	    }


                                            	    }
                                            	    break;

                                            	default :
                                            	    break loop104;
                                                }
                                            } while (true);

                                            otherlv_29=(Token)match(input,23,FOLLOW_2); 

                                            											newLeafNode(otherlv_29, grammarAccess.getNamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_1_1_0_1_0_2_1_2());
                                            										

                                            }


                                            }
                                            break;

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:3872:8: (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' )
                                    {
                                    // InternalAlf.g:3872:8: (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' )
                                    // InternalAlf.g:3873:9: otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}'
                                    {
                                    otherlv_30=(Token)match(input,22,FOLLOW_27); 

                                    									newLeafNode(otherlv_30, grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_1_1_0_1_1_0());
                                    								
                                    // InternalAlf.g:3877:9: ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )*
                                    loop106:
                                    do {
                                        int alt106=3;
                                        alt106 = dfa106.predict(input);
                                        switch (alt106) {
                                    	case 1 :
                                    	    // InternalAlf.g:3878:10: ( (lv_ownedMembership_31_0= ruleClassMember ) )
                                    	    {
                                    	    // InternalAlf.g:3878:10: ( (lv_ownedMembership_31_0= ruleClassMember ) )
                                    	    // InternalAlf.g:3879:11: (lv_ownedMembership_31_0= ruleClassMember )
                                    	    {
                                    	    // InternalAlf.g:3879:11: (lv_ownedMembership_31_0= ruleClassMember )
                                    	    // InternalAlf.g:3880:12: lv_ownedMembership_31_0= ruleClassMember
                                    	    {

                                    	    												newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_1_1_0_1_1_1_0_0());
                                    	    											
                                    	    pushFollow(FOLLOW_27);
                                    	    lv_ownedMembership_31_0=ruleClassMember();

                                    	    state._fsp--;


                                    	    												if (current==null) {
                                    	    													current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                    	    												}
                                    	    												add(
                                    	    													current,
                                    	    													"ownedMembership",
                                    	    													lv_ownedMembership_31_0,
                                    	    													"org.omg.sysml.Alf.ClassMember");
                                    	    												afterParserOrEnumRuleCall();
                                    	    											

                                    	    }


                                    	    }


                                    	    }
                                    	    break;
                                    	case 2 :
                                    	    // InternalAlf.g:3898:10: ( (lv_ownedImport_32_0= rulePackageImport ) )
                                    	    {
                                    	    // InternalAlf.g:3898:10: ( (lv_ownedImport_32_0= rulePackageImport ) )
                                    	    // InternalAlf.g:3899:11: (lv_ownedImport_32_0= rulePackageImport )
                                    	    {
                                    	    // InternalAlf.g:3899:11: (lv_ownedImport_32_0= rulePackageImport )
                                    	    // InternalAlf.g:3900:12: lv_ownedImport_32_0= rulePackageImport
                                    	    {

                                    	    												newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getOwnedImportPackageImportParserRuleCall_1_1_1_0_1_1_1_1_0());
                                    	    											
                                    	    pushFollow(FOLLOW_27);
                                    	    lv_ownedImport_32_0=rulePackageImport();

                                    	    state._fsp--;


                                    	    												if (current==null) {
                                    	    													current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                    	    												}
                                    	    												add(
                                    	    													current,
                                    	    													"ownedImport",
                                    	    													lv_ownedImport_32_0,
                                    	    													"org.omg.sysml.Alf.PackageImport");
                                    	    												afterParserOrEnumRuleCall();
                                    	    											

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop106;
                                        }
                                    } while (true);

                                    otherlv_33=(Token)match(input,23,FOLLOW_2); 

                                    									newLeafNode(otherlv_33, grammarAccess.getNamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_1_1_0_1_1_2());
                                    								

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:3926:6: (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' )
                            {
                            // InternalAlf.g:3926:6: (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' )
                            // InternalAlf.g:3927:7: otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';'
                            {
                            otherlv_34=(Token)match(input,37,FOLLOW_48); 

                            							newLeafNode(otherlv_34, grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_1_1_0());
                            						
                            // InternalAlf.g:3931:7: ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )?
                            int alt108=2;
                            int LA108_0 = input.LA(1);

                            if ( (LA108_0==RULE_NATURAL_VALUE) ) {
                                int LA108_1 = input.LA(2);

                                if ( (LA108_1==38) ) {
                                    alt108=1;
                                }
                            }
                            switch (alt108) {
                                case 1 :
                                    // InternalAlf.g:3932:8: ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..'
                                    {
                                    // InternalAlf.g:3932:8: ( (lv_lower_35_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:3933:9: (lv_lower_35_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:3933:9: (lv_lower_35_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:3934:10: lv_lower_35_0= ruleNaturalLiteralExpression
                                    {

                                    										newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_1_1_1_0_0());
                                    									
                                    pushFollow(FOLLOW_49);
                                    lv_lower_35_0=ruleNaturalLiteralExpression();

                                    state._fsp--;


                                    										if (current==null) {
                                    											current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                                    										}
                                    										set(
                                    											current,
                                    											"lower",
                                    											lv_lower_35_0,
                                    											"org.omg.sysml.Alf.NaturalLiteralExpression");
                                    										afterParserOrEnumRuleCall();
                                    									

                                    }


                                    }

                                    otherlv_36=(Token)match(input,38,FOLLOW_48); 

                                    								newLeafNode(otherlv_36, grammarAccess.getNamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_1_1_1_1());
                                    							

                                    }
                                    break;

                            }

                            // InternalAlf.g:3956:7: ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:3957:8: (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:3957:8: (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:3958:9: lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression
                            {

                            									newCompositeNode(grammarAccess.getNamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_1_1_2_0());
                            								
                            pushFollow(FOLLOW_50);
                            lv_upper_37_0=ruleUnlimitedNaturalLiteralExpression();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getNamedFeatureDefinitionRule());
                            									}
                            									set(
                            										current,
                            										"upper",
                            										lv_upper_37_0,
                            										"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            otherlv_38=(Token)match(input,39,FOLLOW_7); 

                            							newLeafNode(otherlv_38, grammarAccess.getNamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_1_1_3());
                            						
                            otherlv_39=(Token)match(input,19,FOLLOW_2); 

                            							newLeafNode(otherlv_39, grammarAccess.getNamedFeatureDefinitionAccess().getSemicolonKeyword_1_1_1_1_4());
                            						

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
    // InternalAlf.g:3991:1: entryRuleUnnamedFeatureDefinition returns [EObject current=null] : iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF ;
    public final EObject entryRuleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedFeatureDefinition = null;


        try {
            // InternalAlf.g:3991:65: (iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF )
            // InternalAlf.g:3992:2: iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF
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
    // InternalAlf.g:3998:1: ruleUnnamedFeatureDefinition returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' ) ) ) | (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' ) ) ) ;
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
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_ownedElement_0_0 = null;

        EObject lv_lower_2_0 = null;

        EObject lv_upper_4_0 = null;

        EObject lv_value_7_0 = null;

        EObject lv_ownedMembership_10_0 = null;

        EObject lv_ownedMembership_13_0 = null;

        EObject lv_ownedImport_14_0 = null;

        EObject lv_lower_17_0 = null;

        EObject lv_upper_19_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4004:2: ( ( ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' ) ) ) | (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' ) ) ) )
            // InternalAlf.g:4005:2: ( ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' ) ) ) | (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' ) ) )
            {
            // InternalAlf.g:4005:2: ( ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' ) ) ) | (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' ) ) )
            // InternalAlf.g:4006:3: ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' ) ) ) | (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' ) )
            {
            // InternalAlf.g:4006:3: ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) )
            // InternalAlf.g:4007:4: (lv_ownedElement_0_0= ruleSubsetOrRedefinition )
            {
            // InternalAlf.g:4007:4: (lv_ownedElement_0_0= ruleSubsetOrRedefinition )
            // InternalAlf.g:4008:5: lv_ownedElement_0_0= ruleSubsetOrRedefinition
            {

            					newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedElementSubsetOrRedefinitionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_58);
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

            // InternalAlf.g:4025:3: ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' ) ) ) | (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' ) )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==37) ) {
                int LA118_1 = input.LA(2);

                if ( (LA118_1==RULE_NATURAL_VALUE) ) {
                    int LA118_3 = input.LA(3);

                    if ( (LA118_3==39) ) {
                        int LA118_5 = input.LA(4);

                        if ( (LA118_5==19) ) {
                            alt118=2;
                        }
                        else if ( (LA118_5==22||LA118_5==41) ) {
                            alt118=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 118, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA118_3==38) ) {
                        int LA118_6 = input.LA(4);

                        if ( (LA118_6==RULE_NATURAL_VALUE) ) {
                            int LA118_8 = input.LA(5);

                            if ( (LA118_8==39) ) {
                                int LA118_5 = input.LA(6);

                                if ( (LA118_5==19) ) {
                                    alt118=2;
                                }
                                else if ( (LA118_5==22||LA118_5==41) ) {
                                    alt118=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 118, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 118, 8, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA118_6==18) ) {
                            int LA118_4 = input.LA(5);

                            if ( (LA118_4==39) ) {
                                int LA118_5 = input.LA(6);

                                if ( (LA118_5==19) ) {
                                    alt118=2;
                                }
                                else if ( (LA118_5==22||LA118_5==41) ) {
                                    alt118=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 118, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 118, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 118, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 118, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA118_1==18) ) {
                    int LA118_4 = input.LA(3);

                    if ( (LA118_4==39) ) {
                        int LA118_5 = input.LA(4);

                        if ( (LA118_5==19) ) {
                            alt118=2;
                        }
                        else if ( (LA118_5==22||LA118_5==41) ) {
                            alt118=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 118, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 118, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 118, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA118_0==22||LA118_0==41) ) {
                alt118=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }
            switch (alt118) {
                case 1 :
                    // InternalAlf.g:4026:4: ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' ) ) )
                    {
                    // InternalAlf.g:4026:4: ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' ) ) )
                    // InternalAlf.g:4027:5: (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' ) )
                    {
                    // InternalAlf.g:4027:5: (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==37) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // InternalAlf.g:4028:6: otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']'
                            {
                            otherlv_1=(Token)match(input,37,FOLLOW_48); 

                            						newLeafNode(otherlv_1, grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_0_0_0());
                            					
                            // InternalAlf.g:4032:6: ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )?
                            int alt111=2;
                            int LA111_0 = input.LA(1);

                            if ( (LA111_0==RULE_NATURAL_VALUE) ) {
                                int LA111_1 = input.LA(2);

                                if ( (LA111_1==38) ) {
                                    alt111=1;
                                }
                            }
                            switch (alt111) {
                                case 1 :
                                    // InternalAlf.g:4033:7: ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..'
                                    {
                                    // InternalAlf.g:4033:7: ( (lv_lower_2_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:4034:8: (lv_lower_2_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:4034:8: (lv_lower_2_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:4035:9: lv_lower_2_0= ruleNaturalLiteralExpression
                                    {

                                    									newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_0_0_1_0_0());
                                    								
                                    pushFollow(FOLLOW_49);
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

                                    otherlv_3=(Token)match(input,38,FOLLOW_48); 

                                    							newLeafNode(otherlv_3, grammarAccess.getUnnamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_0_0_1_1());
                                    						

                                    }
                                    break;

                            }

                            // InternalAlf.g:4057:6: ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:4058:7: (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:4058:7: (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:4059:8: lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression
                            {

                            								newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_0_0_2_0());
                            							
                            pushFollow(FOLLOW_50);
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

                            otherlv_5=(Token)match(input,39,FOLLOW_59); 

                            						newLeafNode(otherlv_5, grammarAccess.getUnnamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_0_0_3());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:4081:5: ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' ) )
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==41) ) {
                        alt116=1;
                    }
                    else if ( (LA116_0==22) ) {
                        alt116=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 116, 0, input);

                        throw nvae;
                    }
                    switch (alt116) {
                        case 1 :
                            // InternalAlf.g:4082:6: (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) )
                            {
                            // InternalAlf.g:4082:6: (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) )
                            // InternalAlf.g:4083:7: otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) )
                            {
                            otherlv_6=(Token)match(input,41,FOLLOW_56); 

                            							newLeafNode(otherlv_6, grammarAccess.getUnnamedFeatureDefinitionAccess().getEqualsSignKeyword_1_0_1_0_0());
                            						
                            // InternalAlf.g:4087:7: ( (lv_value_7_0= ruleExpression ) )
                            // InternalAlf.g:4088:8: (lv_value_7_0= ruleExpression )
                            {
                            // InternalAlf.g:4088:8: (lv_value_7_0= ruleExpression )
                            // InternalAlf.g:4089:9: lv_value_7_0= ruleExpression
                            {

                            									newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getValueExpressionParserRuleCall_1_0_1_0_1_0());
                            								
                            pushFollow(FOLLOW_57);
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

                            // InternalAlf.g:4106:7: (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) )
                            int alt114=2;
                            int LA114_0 = input.LA(1);

                            if ( (LA114_0==19) ) {
                                alt114=1;
                            }
                            else if ( (LA114_0==22) ) {
                                alt114=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 114, 0, input);

                                throw nvae;
                            }
                            switch (alt114) {
                                case 1 :
                                    // InternalAlf.g:4107:8: otherlv_8= ';'
                                    {
                                    otherlv_8=(Token)match(input,19,FOLLOW_2); 

                                    								newLeafNode(otherlv_8, grammarAccess.getUnnamedFeatureDefinitionAccess().getSemicolonKeyword_1_0_1_0_2_0());
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:4112:8: (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' )
                                    {
                                    // InternalAlf.g:4112:8: (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' )
                                    // InternalAlf.g:4113:9: otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}'
                                    {
                                    otherlv_9=(Token)match(input,22,FOLLOW_27); 

                                    									newLeafNode(otherlv_9, grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_1_0_2_1_0());
                                    								
                                    // InternalAlf.g:4117:9: ( (lv_ownedMembership_10_0= ruleClassMember ) )*
                                    loop113:
                                    do {
                                        int alt113=2;
                                        int LA113_0 = input.LA(1);

                                        if ( (LA113_0==RULE_DOCUMENTATION_COMMENT||(LA113_0>=RULE_ID && LA113_0<=RULE_UNRESTRICTED_NAME)||LA113_0==15||LA113_0==21||(LA113_0>=25 && LA113_0<=28)||(LA113_0>=31 && LA113_0<=33)||(LA113_0>=55 && LA113_0<=61)) ) {
                                            alt113=1;
                                        }


                                        switch (alt113) {
                                    	case 1 :
                                    	    // InternalAlf.g:4118:10: (lv_ownedMembership_10_0= ruleClassMember )
                                    	    {
                                    	    // InternalAlf.g:4118:10: (lv_ownedMembership_10_0= ruleClassMember )
                                    	    // InternalAlf.g:4119:11: lv_ownedMembership_10_0= ruleClassMember
                                    	    {

                                    	    											newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_0_1_0_2_1_1_0());
                                    	    										
                                    	    pushFollow(FOLLOW_27);
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
                                    	    break loop113;
                                        }
                                    } while (true);

                                    otherlv_11=(Token)match(input,23,FOLLOW_2); 

                                    									newLeafNode(otherlv_11, grammarAccess.getUnnamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_0_1_0_2_1_2());
                                    								

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:4144:6: (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' )
                            {
                            // InternalAlf.g:4144:6: (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' )
                            // InternalAlf.g:4145:7: otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}'
                            {
                            otherlv_12=(Token)match(input,22,FOLLOW_27); 

                            							newLeafNode(otherlv_12, grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_1_1_0());
                            						
                            // InternalAlf.g:4149:7: ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )*
                            loop115:
                            do {
                                int alt115=3;
                                alt115 = dfa115.predict(input);
                                switch (alt115) {
                            	case 1 :
                            	    // InternalAlf.g:4150:8: ( (lv_ownedMembership_13_0= ruleClassMember ) )
                            	    {
                            	    // InternalAlf.g:4150:8: ( (lv_ownedMembership_13_0= ruleClassMember ) )
                            	    // InternalAlf.g:4151:9: (lv_ownedMembership_13_0= ruleClassMember )
                            	    {
                            	    // InternalAlf.g:4151:9: (lv_ownedMembership_13_0= ruleClassMember )
                            	    // InternalAlf.g:4152:10: lv_ownedMembership_13_0= ruleClassMember
                            	    {

                            	    										newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedMembershipClassMemberParserRuleCall_1_0_1_1_1_0_0());
                            	    									
                            	    pushFollow(FOLLOW_27);
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


                            	    }
                            	    break;
                            	case 2 :
                            	    // InternalAlf.g:4170:8: ( (lv_ownedImport_14_0= rulePackageImport ) )
                            	    {
                            	    // InternalAlf.g:4170:8: ( (lv_ownedImport_14_0= rulePackageImport ) )
                            	    // InternalAlf.g:4171:9: (lv_ownedImport_14_0= rulePackageImport )
                            	    {
                            	    // InternalAlf.g:4171:9: (lv_ownedImport_14_0= rulePackageImport )
                            	    // InternalAlf.g:4172:10: lv_ownedImport_14_0= rulePackageImport
                            	    {

                            	    										newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getOwnedImportPackageImportParserRuleCall_1_0_1_1_1_1_0());
                            	    									
                            	    pushFollow(FOLLOW_27);
                            	    lv_ownedImport_14_0=rulePackageImport();

                            	    state._fsp--;


                            	    										if (current==null) {
                            	    											current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
                            	    										}
                            	    										add(
                            	    											current,
                            	    											"ownedImport",
                            	    											lv_ownedImport_14_0,
                            	    											"org.omg.sysml.Alf.PackageImport");
                            	    										afterParserOrEnumRuleCall();
                            	    									

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop115;
                                }
                            } while (true);

                            otherlv_15=(Token)match(input,23,FOLLOW_2); 

                            							newLeafNode(otherlv_15, grammarAccess.getUnnamedFeatureDefinitionAccess().getRightCurlyBracketKeyword_1_0_1_1_2());
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:4198:4: (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' )
                    {
                    // InternalAlf.g:4198:4: (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' )
                    // InternalAlf.g:4199:5: otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';'
                    {
                    otherlv_16=(Token)match(input,37,FOLLOW_48); 

                    					newLeafNode(otherlv_16, grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_0());
                    				
                    // InternalAlf.g:4203:5: ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==RULE_NATURAL_VALUE) ) {
                        int LA117_1 = input.LA(2);

                        if ( (LA117_1==38) ) {
                            alt117=1;
                        }
                    }
                    switch (alt117) {
                        case 1 :
                            // InternalAlf.g:4204:6: ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..'
                            {
                            // InternalAlf.g:4204:6: ( (lv_lower_17_0= ruleNaturalLiteralExpression ) )
                            // InternalAlf.g:4205:7: (lv_lower_17_0= ruleNaturalLiteralExpression )
                            {
                            // InternalAlf.g:4205:7: (lv_lower_17_0= ruleNaturalLiteralExpression )
                            // InternalAlf.g:4206:8: lv_lower_17_0= ruleNaturalLiteralExpression
                            {

                            								newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getLowerNaturalLiteralExpressionParserRuleCall_1_1_1_0_0());
                            							
                            pushFollow(FOLLOW_49);
                            lv_lower_17_0=ruleNaturalLiteralExpression();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
                            								}
                            								set(
                            									current,
                            									"lower",
                            									lv_lower_17_0,
                            									"org.omg.sysml.Alf.NaturalLiteralExpression");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_18=(Token)match(input,38,FOLLOW_48); 

                            						newLeafNode(otherlv_18, grammarAccess.getUnnamedFeatureDefinitionAccess().getFullStopFullStopKeyword_1_1_1_1());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:4228:5: ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) )
                    // InternalAlf.g:4229:6: (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression )
                    {
                    // InternalAlf.g:4229:6: (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression )
                    // InternalAlf.g:4230:7: lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression
                    {

                    							newCompositeNode(grammarAccess.getUnnamedFeatureDefinitionAccess().getUpperUnlimitedNaturalLiteralExpressionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_50);
                    lv_upper_19_0=ruleUnlimitedNaturalLiteralExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getUnnamedFeatureDefinitionRule());
                    							}
                    							set(
                    								current,
                    								"upper",
                    								lv_upper_19_0,
                    								"org.omg.sysml.Alf.UnlimitedNaturalLiteralExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_20=(Token)match(input,39,FOLLOW_7); 

                    					newLeafNode(otherlv_20, grammarAccess.getUnnamedFeatureDefinitionAccess().getRightSquareBracketKeyword_1_1_3());
                    				
                    otherlv_21=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_21, grammarAccess.getUnnamedFeatureDefinitionAccess().getSemicolonKeyword_1_1_4());
                    				

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


    // $ANTLR start "entryRuleSubsetOrRedefinition"
    // InternalAlf.g:4261:1: entryRuleSubsetOrRedefinition returns [EObject current=null] : iv_ruleSubsetOrRedefinition= ruleSubsetOrRedefinition EOF ;
    public final EObject entryRuleSubsetOrRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsetOrRedefinition = null;


        try {
            // InternalAlf.g:4261:61: (iv_ruleSubsetOrRedefinition= ruleSubsetOrRedefinition EOF )
            // InternalAlf.g:4262:2: iv_ruleSubsetOrRedefinition= ruleSubsetOrRedefinition EOF
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
    // InternalAlf.g:4268:1: ruleSubsetOrRedefinition returns [EObject current=null] : ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | ( (otherlv_2= 'is' | otherlv_3= 'redefines' ) this_Redefinition_4= ruleRedefinition ) ) ;
    public final EObject ruleSubsetOrRedefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Subset_1 = null;

        EObject this_Redefinition_4 = null;



        	enterRule();

        try {
            // InternalAlf.g:4274:2: ( ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | ( (otherlv_2= 'is' | otherlv_3= 'redefines' ) this_Redefinition_4= ruleRedefinition ) ) )
            // InternalAlf.g:4275:2: ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | ( (otherlv_2= 'is' | otherlv_3= 'redefines' ) this_Redefinition_4= ruleRedefinition ) )
            {
            // InternalAlf.g:4275:2: ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | ( (otherlv_2= 'is' | otherlv_3= 'redefines' ) this_Redefinition_4= ruleRedefinition ) )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==42) ) {
                alt120=1;
            }
            else if ( (LA120_0==24||LA120_0==43) ) {
                alt120=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // InternalAlf.g:4276:3: (otherlv_0= 'subsets' this_Subset_1= ruleSubset )
                    {
                    // InternalAlf.g:4276:3: (otherlv_0= 'subsets' this_Subset_1= ruleSubset )
                    // InternalAlf.g:4277:4: otherlv_0= 'subsets' this_Subset_1= ruleSubset
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_4); 

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
                    // InternalAlf.g:4291:3: ( (otherlv_2= 'is' | otherlv_3= 'redefines' ) this_Redefinition_4= ruleRedefinition )
                    {
                    // InternalAlf.g:4291:3: ( (otherlv_2= 'is' | otherlv_3= 'redefines' ) this_Redefinition_4= ruleRedefinition )
                    // InternalAlf.g:4292:4: (otherlv_2= 'is' | otherlv_3= 'redefines' ) this_Redefinition_4= ruleRedefinition
                    {
                    // InternalAlf.g:4292:4: (otherlv_2= 'is' | otherlv_3= 'redefines' )
                    int alt119=2;
                    int LA119_0 = input.LA(1);

                    if ( (LA119_0==24) ) {
                        alt119=1;
                    }
                    else if ( (LA119_0==43) ) {
                        alt119=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 119, 0, input);

                        throw nvae;
                    }
                    switch (alt119) {
                        case 1 :
                            // InternalAlf.g:4293:5: otherlv_2= 'is'
                            {
                            otherlv_2=(Token)match(input,24,FOLLOW_4); 

                            					newLeafNode(otherlv_2, grammarAccess.getSubsetOrRedefinitionAccess().getIsKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:4298:5: otherlv_3= 'redefines'
                            {
                            otherlv_3=(Token)match(input,43,FOLLOW_4); 

                            					newLeafNode(otherlv_3, grammarAccess.getSubsetOrRedefinitionAccess().getRedefinesKeyword_1_0_1());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getSubsetOrRedefinitionAccess().getRedefinitionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Redefinition_4=ruleRedefinition();

                    state._fsp--;


                    				current = this_Redefinition_4;
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
    // InternalAlf.g:4316:1: entryRuleRedefinition returns [EObject current=null] : iv_ruleRedefinition= ruleRedefinition EOF ;
    public final EObject entryRuleRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefinition = null;


        try {
            // InternalAlf.g:4316:53: (iv_ruleRedefinition= ruleRedefinition EOF )
            // InternalAlf.g:4317:2: iv_ruleRedefinition= ruleRedefinition EOF
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
    // InternalAlf.g:4323:1: ruleRedefinition returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleRedefinition() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:4329:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:4330:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:4330:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4331:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:4331:3: ( ruleQualifiedName )
            // InternalAlf.g:4332:4: ruleQualifiedName
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
    // InternalAlf.g:4349:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalAlf.g:4349:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalAlf.g:4350:2: iv_ruleSubset= ruleSubset EOF
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
    // InternalAlf.g:4356:1: ruleSubset returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubset() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:4362:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:4363:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:4363:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4364:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:4364:3: ( ruleQualifiedName )
            // InternalAlf.g:4365:4: ruleQualifiedName
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
    // InternalAlf.g:4382:1: entryRuleConnectorDefinition returns [EObject current=null] : iv_ruleConnectorDefinition= ruleConnectorDefinition EOF ;
    public final EObject entryRuleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorDefinition = null;


        try {
            // InternalAlf.g:4382:60: (iv_ruleConnectorDefinition= ruleConnectorDefinition EOF )
            // InternalAlf.g:4383:2: iv_ruleConnectorDefinition= ruleConnectorDefinition EOF
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
    // InternalAlf.g:4389:1: ruleConnectorDefinition returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) ;
    public final EObject ruleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4395:2: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) )
            // InternalAlf.g:4396:2: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
            {
            // InternalAlf.g:4396:2: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
            // InternalAlf.g:4397:3: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';'
            {
            // InternalAlf.g:4397:3: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )?
            int alt123=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA123_1 = input.LA(2);

                    if ( (LA123_1==24||LA123_1==35) ) {
                        alt123=1;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA123_2 = input.LA(2);

                    if ( (LA123_2==24||LA123_2==35) ) {
                        alt123=1;
                    }
                    }
                    break;
                case 24:
                case 35:
                    {
                    alt123=1;
                    }
                    break;
            }

            switch (alt123) {
                case 1 :
                    // InternalAlf.g:4398:4: ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is'
                    {
                    // InternalAlf.g:4398:4: ( (lv_name_0_0= ruleName ) )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( ((LA121_0>=RULE_ID && LA121_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // InternalAlf.g:4399:5: (lv_name_0_0= ruleName )
                            {
                            // InternalAlf.g:4399:5: (lv_name_0_0= ruleName )
                            // InternalAlf.g:4400:6: lv_name_0_0= ruleName
                            {

                            						newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getNameNameParserRuleCall_0_0_0());
                            					
                            pushFollow(FOLLOW_60);
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

                    // InternalAlf.g:4417:4: (otherlv_1= ':' ( ( ruleQualifiedName ) ) )?
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==35) ) {
                        alt122=1;
                    }
                    switch (alt122) {
                        case 1 :
                            // InternalAlf.g:4418:5: otherlv_1= ':' ( ( ruleQualifiedName ) )
                            {
                            otherlv_1=(Token)match(input,35,FOLLOW_4); 

                            					newLeafNode(otherlv_1, grammarAccess.getConnectorDefinitionAccess().getColonKeyword_0_1_0());
                            				
                            // InternalAlf.g:4422:5: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:4423:6: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:4423:6: ( ruleQualifiedName )
                            // InternalAlf.g:4424:7: ruleQualifiedName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConnectorDefinitionRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getAssociationAssociationCrossReference_0_1_1_0());
                            						
                            pushFollow(FOLLOW_18);
                            ruleQualifiedName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getConnectorDefinitionAccess().getIsKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalAlf.g:4444:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4445:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:4445:4: ( ruleQualifiedName )
            // InternalAlf.g:4446:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getSourceFeatureFeatureCrossReference_1_0());
            				
            pushFollow(FOLLOW_61);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectorDefinitionAccess().getEqualsSignGreaterThanSignKeyword_2());
            		
            // InternalAlf.g:4464:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4465:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:4465:4: ( ruleQualifiedName )
            // InternalAlf.g:4466:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorDefinitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConnectorDefinitionAccess().getTargetFeatureFeatureCrossReference_3_0());
            				
            pushFollow(FOLLOW_7);
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
    // InternalAlf.g:4488:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAlf.g:4488:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAlf.g:4489:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAlf.g:4495:1: ruleExpression returns [EObject current=null] : this_BinaryExpression_0= ruleBinaryExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4501:2: (this_BinaryExpression_0= ruleBinaryExpression )
            // InternalAlf.g:4502:2: this_BinaryExpression_0= ruleBinaryExpression
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
    // InternalAlf.g:4513:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalAlf.g:4513:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalAlf.g:4514:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalAlf.g:4520:1: ruleBinaryExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) ;
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
            // InternalAlf.g:4526:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) )
            // InternalAlf.g:4527:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            {
            // InternalAlf.g:4527:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            // InternalAlf.g:4528:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            {

            			newCompositeNode(grammarAccess.getBinaryExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_62);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:4536:3: ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==18||(LA125_0>=45 && LA125_0<=49)) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalAlf.g:4537:4: () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    {
                    // InternalAlf.g:4537:4: ()
                    // InternalAlf.g:4538:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:4544:4: ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==18||(LA124_0>=46 && LA124_0<=49)) ) {
                        alt124=1;
                    }
                    else if ( (LA124_0==45) ) {
                        alt124=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 124, 0, input);

                        throw nvae;
                    }
                    switch (alt124) {
                        case 1 :
                            // InternalAlf.g:4545:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            {
                            // InternalAlf.g:4545:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            // InternalAlf.g:4546:6: ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) )
                            {
                            // InternalAlf.g:4546:6: ( (lv_operator_2_0= ruleBinaryOperator ) )
                            // InternalAlf.g:4547:7: (lv_operator_2_0= ruleBinaryOperator )
                            {
                            // InternalAlf.g:4547:7: (lv_operator_2_0= ruleBinaryOperator )
                            // InternalAlf.g:4548:8: lv_operator_2_0= ruleBinaryOperator
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

                            // InternalAlf.g:4565:6: ( (lv_operand_3_0= ruleExpression ) )
                            // InternalAlf.g:4566:7: (lv_operand_3_0= ruleExpression )
                            {
                            // InternalAlf.g:4566:7: (lv_operand_3_0= ruleExpression )
                            // InternalAlf.g:4567:8: lv_operand_3_0= ruleExpression
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
                            // InternalAlf.g:4586:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            {
                            // InternalAlf.g:4586:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            // InternalAlf.g:4587:6: ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']'
                            {
                            // InternalAlf.g:4587:6: ( (lv_operator_4_0= '@' ) )
                            // InternalAlf.g:4588:7: (lv_operator_4_0= '@' )
                            {
                            // InternalAlf.g:4588:7: (lv_operator_4_0= '@' )
                            // InternalAlf.g:4589:8: lv_operator_4_0= '@'
                            {
                            lv_operator_4_0=(Token)match(input,45,FOLLOW_63); 

                            								newLeafNode(lv_operator_4_0, grammarAccess.getBinaryExpressionAccess().getOperatorCommercialAtKeyword_1_1_1_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getBinaryExpressionRule());
                            								}
                            								setWithLastConsumed(current, "operator", lv_operator_4_0, "@");
                            							

                            }


                            }

                            otherlv_5=(Token)match(input,37,FOLLOW_56); 

                            						newLeafNode(otherlv_5, grammarAccess.getBinaryExpressionAccess().getLeftSquareBracketKeyword_1_1_1_1());
                            					
                            // InternalAlf.g:4605:6: ( (lv_operand_6_0= ruleExpression ) )
                            // InternalAlf.g:4606:7: (lv_operand_6_0= ruleExpression )
                            {
                            // InternalAlf.g:4606:7: (lv_operand_6_0= ruleExpression )
                            // InternalAlf.g:4607:8: lv_operand_6_0= ruleExpression
                            {

                            								newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOperandExpressionParserRuleCall_1_1_1_2_0());
                            							
                            pushFollow(FOLLOW_50);
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

                            otherlv_7=(Token)match(input,39,FOLLOW_2); 

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
    // InternalAlf.g:4635:1: entryRuleBinaryOperator returns [String current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final String entryRuleBinaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperator = null;


        try {
            // InternalAlf.g:4635:54: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // InternalAlf.g:4636:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
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
    // InternalAlf.g:4642:1: ruleBinaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:4648:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) )
            // InternalAlf.g:4649:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            {
            // InternalAlf.g:4649:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            int alt126=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt126=1;
                }
                break;
            case 47:
                {
                alt126=2;
                }
                break;
            case 18:
                {
                alt126=3;
                }
                break;
            case 48:
                {
                alt126=4;
                }
                break;
            case 49:
                {
                alt126=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }

            switch (alt126) {
                case 1 :
                    // InternalAlf.g:4650:3: kw= '+'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:4656:3: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:4662:3: kw= '*'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:4668:3: kw= '/'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:4674:3: kw= '^'
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
    // InternalAlf.g:4683:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlf.g:4683:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlf.g:4684:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalAlf.g:4690:1: ruleUnaryExpression returns [EObject current=null] : (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceAccessExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4696:2: ( (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) )
            // InternalAlf.g:4697:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            {
            // InternalAlf.g:4697:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( ((LA127_0>=RULE_BOOLEAN_VALUE && LA127_0<=RULE_UNRESTRICTED_NAME)||(LA127_0>=17 && LA127_0<=18)||LA127_0==22||LA127_0==50||LA127_0==52) ) {
                alt127=1;
            }
            else if ( ((LA127_0>=46 && LA127_0<=47)) ) {
                alt127=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // InternalAlf.g:4698:3: this_SequenceAccessExpression_0= ruleSequenceAccessExpression
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
                    // InternalAlf.g:4707:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    {
                    // InternalAlf.g:4707:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    // InternalAlf.g:4708:4: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    {
                    // InternalAlf.g:4708:4: ()
                    // InternalAlf.g:4709:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:4715:4: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // InternalAlf.g:4716:5: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // InternalAlf.g:4716:5: (lv_operator_2_0= ruleUnaryOperator )
                    // InternalAlf.g:4717:6: lv_operator_2_0= ruleUnaryOperator
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_64);
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

                    // InternalAlf.g:4734:4: ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    // InternalAlf.g:4735:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    {
                    // InternalAlf.g:4735:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    // InternalAlf.g:4736:6: lv_operand_3_0= ruleSequenceAccessExpression
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
    // InternalAlf.g:4758:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalAlf.g:4758:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalAlf.g:4759:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalAlf.g:4765:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:4771:2: ( (kw= '+' | kw= '-' ) )
            // InternalAlf.g:4772:2: (kw= '+' | kw= '-' )
            {
            // InternalAlf.g:4772:2: (kw= '+' | kw= '-' )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==46) ) {
                alt128=1;
            }
            else if ( (LA128_0==47) ) {
                alt128=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // InternalAlf.g:4773:3: kw= '+'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:4779:3: kw= '-'
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
    // InternalAlf.g:4788:1: entryRuleSequenceAccessExpression returns [EObject current=null] : iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF ;
    public final EObject entryRuleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceAccessExpression = null;


        try {
            // InternalAlf.g:4788:65: (iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF )
            // InternalAlf.g:4789:2: iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF
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
    // InternalAlf.g:4795:1: ruleSequenceAccessExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) ;
    public final EObject ruleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_index_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4801:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) )
            // InternalAlf.g:4802:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            {
            // InternalAlf.g:4802:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            // InternalAlf.g:4803:3: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            {

            			newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_65);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:4811:3: ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==37) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // InternalAlf.g:4812:4: () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    // InternalAlf.g:4812:4: ()
            	    // InternalAlf.g:4813:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSequenceAccessExpressionAccess().getSequenceAccessExpressionPrimaryAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_56); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSequenceAccessExpressionAccess().getLeftSquareBracketKeyword_1_1());
            	    			
            	    // InternalAlf.g:4823:4: ( (lv_index_3_0= ruleExpression ) )
            	    // InternalAlf.g:4824:5: (lv_index_3_0= ruleExpression )
            	    {
            	    // InternalAlf.g:4824:5: (lv_index_3_0= ruleExpression )
            	    // InternalAlf.g:4825:6: lv_index_3_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getIndexExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_50);
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

            	    otherlv_4=(Token)match(input,39,FOLLOW_65); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSequenceAccessExpressionAccess().getRightSquareBracketKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop129;
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
    // InternalAlf.g:4851:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalAlf.g:4851:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalAlf.g:4852:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalAlf.g:4858:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
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
            // InternalAlf.g:4864:2: ( (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // InternalAlf.g:4865:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // InternalAlf.g:4865:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt130=5;
            alt130 = dfa130.predict(input);
            switch (alt130) {
                case 1 :
                    // InternalAlf.g:4866:3: this_LiteralExpression_0= ruleLiteralExpression
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
                    // InternalAlf.g:4875:3: this_ElementReferenceExpression_1= ruleElementReferenceExpression
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
                    // InternalAlf.g:4884:3: this_InstanceCreationExpression_2= ruleInstanceCreationExpression
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
                    // InternalAlf.g:4893:3: this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression
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
                    // InternalAlf.g:4902:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // InternalAlf.g:4902:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // InternalAlf.g:4903:4: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_56); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_66);
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
    // InternalAlf.g:4924:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // InternalAlf.g:4924:67: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // InternalAlf.g:4925:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
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
    // InternalAlf.g:4931:1: ruleElementReferenceExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleElementReferenceExpression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:4937:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:4938:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:4938:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4939:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:4939:3: ( ruleQualifiedName )
            // InternalAlf.g:4940:4: ruleQualifiedName
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
    // InternalAlf.g:4957:1: entryRuleInstanceCreationExpression returns [EObject current=null] : iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF ;
    public final EObject entryRuleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceCreationExpression = null;


        try {
            // InternalAlf.g:4957:67: (iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF )
            // InternalAlf.g:4958:2: iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF
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
    // InternalAlf.g:4964:1: ruleInstanceCreationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_argument_2_0 = null;

        EObject lv_argument_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4970:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalAlf.g:4971:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalAlf.g:4971:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalAlf.g:4972:3: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalAlf.g:4972:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4973:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:4973:4: ( ruleQualifiedName )
            // InternalAlf.g:4974:5: ruleQualifiedName
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

            otherlv_1=(Token)match(input,50,FOLLOW_68); 

            			newLeafNode(otherlv_1, grammarAccess.getInstanceCreationExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAlf.g:4992:3: ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( ((LA132_0>=RULE_BOOLEAN_VALUE && LA132_0<=RULE_UNRESTRICTED_NAME)||(LA132_0>=17 && LA132_0<=18)||LA132_0==22||(LA132_0>=46 && LA132_0<=47)||LA132_0==50||LA132_0==52) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalAlf.g:4993:4: ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:4993:4: ( (lv_argument_2_0= ruleExpression ) )
                    // InternalAlf.g:4994:5: (lv_argument_2_0= ruleExpression )
                    {
                    // InternalAlf.g:4994:5: (lv_argument_2_0= ruleExpression )
                    // InternalAlf.g:4995:6: lv_argument_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_69);
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

                    // InternalAlf.g:5012:4: (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==30) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // InternalAlf.g:5013:5: otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FOLLOW_56); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getInstanceCreationExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:5017:5: ( (lv_argument_4_0= ruleExpression ) )
                    	    // InternalAlf.g:5018:6: (lv_argument_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:5018:6: (lv_argument_4_0= ruleExpression )
                    	    // InternalAlf.g:5019:7: lv_argument_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getInstanceCreationExpressionAccess().getArgumentExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_69);
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
                    	    break loop131;
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
    // InternalAlf.g:5046:1: entryRuleSequenceConstructionExpression returns [EObject current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
    public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionExpression = null;


        try {
            // InternalAlf.g:5046:71: (iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:5047:2: iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF
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
    // InternalAlf.g:5053:1: ruleSequenceConstructionExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5059:2: ( ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalAlf.g:5060:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalAlf.g:5060:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // InternalAlf.g:5061:3: () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalAlf.g:5061:3: ()
            // InternalAlf.g:5062:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_70); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:5072:3: ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( ((LA134_0>=RULE_BOOLEAN_VALUE && LA134_0<=RULE_UNRESTRICTED_NAME)||(LA134_0>=17 && LA134_0<=18)||LA134_0==22||(LA134_0>=46 && LA134_0<=47)||LA134_0==50||LA134_0==52) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalAlf.g:5073:4: ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:5073:4: ( (lv_element_2_0= ruleExpression ) )
                    // InternalAlf.g:5074:5: (lv_element_2_0= ruleExpression )
                    {
                    // InternalAlf.g:5074:5: (lv_element_2_0= ruleExpression )
                    // InternalAlf.g:5075:6: lv_element_2_0= ruleExpression
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

                    // InternalAlf.g:5092:4: (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==30) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // InternalAlf.g:5093:5: otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FOLLOW_56); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:5097:5: ( (lv_element_4_0= ruleExpression ) )
                    	    // InternalAlf.g:5098:6: (lv_element_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:5098:6: (lv_element_4_0= ruleExpression )
                    	    // InternalAlf.g:5099:7: lv_element_4_0= ruleExpression
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
                    	    break loop133;
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
    // InternalAlf.g:5126:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalAlf.g:5126:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalAlf.g:5127:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalAlf.g:5133:1: ruleLiteralExpression returns [EObject current=null] : (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteralExpression_0 = null;

        EObject this_BooleanLiteralExpression_1 = null;

        EObject this_StringLiteralExpression_2 = null;

        EObject this_RealLiteralExpression_3 = null;

        EObject this_UnlimitedNaturalLiteralExpression_4 = null;



        	enterRule();

        try {
            // InternalAlf.g:5139:2: ( (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:5140:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:5140:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            int alt135=5;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt135=1;
                }
                break;
            case RULE_BOOLEAN_VALUE:
                {
                alt135=2;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt135=3;
                }
                break;
            case RULE_NATURAL_VALUE:
                {
                int LA135_4 = input.LA(2);

                if ( (LA135_4==EOF||(LA135_4>=18 && LA135_4<=19)||(LA135_4>=22 && LA135_4<=23)||LA135_4==30||LA135_4==37||LA135_4==39||(LA135_4>=45 && LA135_4<=49)||LA135_4==51) ) {
                    alt135=5;
                }
                else if ( (LA135_4==17) ) {
                    alt135=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 135, 4, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt135=4;
                }
                break;
            case 18:
                {
                alt135=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }

            switch (alt135) {
                case 1 :
                    // InternalAlf.g:5141:3: this_NullLiteralExpression_0= ruleNullLiteralExpression
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
                    // InternalAlf.g:5150:3: this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression
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
                    // InternalAlf.g:5159:3: this_StringLiteralExpression_2= ruleStringLiteralExpression
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
                    // InternalAlf.g:5168:3: this_RealLiteralExpression_3= ruleRealLiteralExpression
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
                    // InternalAlf.g:5177:3: this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:5189:1: entryRuleNullLiteralExpression returns [EObject current=null] : iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF ;
    public final EObject entryRuleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpression = null;


        try {
            // InternalAlf.g:5189:62: (iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF )
            // InternalAlf.g:5190:2: iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF
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
    // InternalAlf.g:5196:1: ruleNullLiteralExpression returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlf.g:5202:2: ( ( () otherlv_1= 'null' ) )
            // InternalAlf.g:5203:2: ( () otherlv_1= 'null' )
            {
            // InternalAlf.g:5203:2: ( () otherlv_1= 'null' )
            // InternalAlf.g:5204:3: () otherlv_1= 'null'
            {
            // InternalAlf.g:5204:3: ()
            // InternalAlf.g:5205:4: 
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
    // InternalAlf.g:5219:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // InternalAlf.g:5219:65: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:5220:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
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
    // InternalAlf.g:5226:1: ruleBooleanLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:5232:2: ( ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) )
            // InternalAlf.g:5233:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            {
            // InternalAlf.g:5233:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:5234:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:5234:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            // InternalAlf.g:5235:4: lv_value_0_0= RULE_BOOLEAN_VALUE
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
    // InternalAlf.g:5254:1: entryRuleStringLiteralExpression returns [EObject current=null] : iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF ;
    public final EObject entryRuleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpression = null;


        try {
            // InternalAlf.g:5254:64: (iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF )
            // InternalAlf.g:5255:2: iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF
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
    // InternalAlf.g:5261:1: ruleStringLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:5267:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalAlf.g:5268:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalAlf.g:5268:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalAlf.g:5269:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalAlf.g:5269:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalAlf.g:5270:4: lv_value_0_0= RULE_STRING_VALUE
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
    // InternalAlf.g:5289:1: entryRuleRealLiteralExpression returns [EObject current=null] : iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF ;
    public final EObject entryRuleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteralExpression = null;


        try {
            // InternalAlf.g:5289:62: (iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF )
            // InternalAlf.g:5290:2: iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF
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
    // InternalAlf.g:5296:1: ruleRealLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5302:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalAlf.g:5303:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalAlf.g:5303:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalAlf.g:5304:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalAlf.g:5304:3: (lv_value_0_0= ruleRealValue )
            // InternalAlf.g:5305:4: lv_value_0_0= ruleRealValue
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
    // InternalAlf.g:5325:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalAlf.g:5325:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalAlf.g:5326:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalAlf.g:5332:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_VALUE_0=null;
        Token kw=null;
        Token this_NATURAL_VALUE_2=null;
        Token this_NATURAL_VALUE_4=null;
        Token this_NATURAL_VALUE_9=null;


        	enterRule();

        try {
            // InternalAlf.g:5338:2: ( ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) )
            // InternalAlf.g:5339:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            {
            // InternalAlf.g:5339:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            // InternalAlf.g:5340:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            {
            // InternalAlf.g:5340:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==RULE_NATURAL_VALUE) ) {
                alt137=1;
            }
            else if ( (LA137_0==17) ) {
                alt137=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // InternalAlf.g:5341:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    {
                    // InternalAlf.g:5341:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    // InternalAlf.g:5342:5: this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    {
                    this_NATURAL_VALUE_0=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_9); 

                    					current.merge(this_NATURAL_VALUE_0);
                    				

                    					newLeafNode(this_NATURAL_VALUE_0, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_0());
                    				
                    kw=(Token)match(input,17,FOLLOW_72); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_0_1());
                    				
                    // InternalAlf.g:5354:5: (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==RULE_NATURAL_VALUE) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // InternalAlf.g:5355:6: this_NATURAL_VALUE_2= RULE_NATURAL_VALUE
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
                    // InternalAlf.g:5365:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    {
                    // InternalAlf.g:5365:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    // InternalAlf.g:5366:5: kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE
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

            // InternalAlf.g:5380:3: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( ((LA140_0>=53 && LA140_0<=54)) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalAlf.g:5381:4: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE
                    {
                    // InternalAlf.g:5381:4: (kw= 'e' | kw= 'E' )
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==53) ) {
                        alt138=1;
                    }
                    else if ( (LA138_0==54) ) {
                        alt138=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 138, 0, input);

                        throw nvae;
                    }
                    switch (alt138) {
                        case 1 :
                            // InternalAlf.g:5382:5: kw= 'e'
                            {
                            kw=(Token)match(input,53,FOLLOW_75); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:5388:5: kw= 'E'
                            {
                            kw=(Token)match(input,54,FOLLOW_75); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:5394:4: (kw= '+' | kw= '-' )?
                    int alt139=3;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==46) ) {
                        alt139=1;
                    }
                    else if ( (LA139_0==47) ) {
                        alt139=2;
                    }
                    switch (alt139) {
                        case 1 :
                            // InternalAlf.g:5395:5: kw= '+'
                            {
                            kw=(Token)match(input,46,FOLLOW_74); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:5401:5: kw= '-'
                            {
                            kw=(Token)match(input,47,FOLLOW_74); 

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
    // InternalAlf.g:5419:1: entryRuleNaturalLiteralExpression returns [EObject current=null] : iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF ;
    public final EObject entryRuleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:5419:65: (iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:5420:2: iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF
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
    // InternalAlf.g:5426:1: ruleNaturalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) ;
    public final EObject ruleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:5432:2: ( ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) )
            // InternalAlf.g:5433:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            {
            // InternalAlf.g:5433:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            // InternalAlf.g:5434:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:5434:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            // InternalAlf.g:5435:4: lv_value_0_0= RULE_NATURAL_VALUE
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
    // InternalAlf.g:5454:1: entryRuleUnlimitedNaturalLiteralExpression returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:5454:74: (iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:5455:2: iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF
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
    // InternalAlf.g:5461:1: ruleUnlimitedNaturalLiteralExpression returns [EObject current=null] : (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NaturalLiteralExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5467:2: ( (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) )
            // InternalAlf.g:5468:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            {
            // InternalAlf.g:5468:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==RULE_NATURAL_VALUE) ) {
                alt141=1;
            }
            else if ( (LA141_0==18) ) {
                alt141=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }
            switch (alt141) {
                case 1 :
                    // InternalAlf.g:5469:3: this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression
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
                    // InternalAlf.g:5478:3: ( () otherlv_2= '*' )
                    {
                    // InternalAlf.g:5478:3: ( () otherlv_2= '*' )
                    // InternalAlf.g:5479:4: () otherlv_2= '*'
                    {
                    // InternalAlf.g:5479:4: ()
                    // InternalAlf.g:5480:5: 
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
    // InternalAlf.g:5495:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAlf.g:5495:44: (iv_ruleName= ruleName EOF )
            // InternalAlf.g:5496:2: iv_ruleName= ruleName EOF
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
    // InternalAlf.g:5502:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalAlf.g:5508:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalAlf.g:5509:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalAlf.g:5509:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==RULE_ID) ) {
                alt142=1;
            }
            else if ( (LA142_0==RULE_UNRESTRICTED_NAME) ) {
                alt142=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }
            switch (alt142) {
                case 1 :
                    // InternalAlf.g:5510:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:5518:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:5529:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlf.g:5529:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlf.g:5530:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlf.g:5536:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_ColonQualifiedName_1 = null;

        AntlrDatatypeRuleToken this_DotQualifiedName_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:5542:2: ( (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) )
            // InternalAlf.g:5543:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            {
            // InternalAlf.g:5543:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            int alt143=3;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 18:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 30:
                case 37:
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
                    alt143=1;
                    }
                    break;
                case 17:
                    {
                    alt143=3;
                    }
                    break;
                case 16:
                    {
                    alt143=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 143, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA143_0==RULE_UNRESTRICTED_NAME) ) {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    alt143=2;
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
                case 37:
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
                    alt143=1;
                    }
                    break;
                case 17:
                    {
                    alt143=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 143, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }
            switch (alt143) {
                case 1 :
                    // InternalAlf.g:5544:3: this_Name_0= ruleName
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
                    // InternalAlf.g:5555:3: this_ColonQualifiedName_1= ruleColonQualifiedName
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
                    // InternalAlf.g:5566:3: this_DotQualifiedName_2= ruleDotQualifiedName
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
    // InternalAlf.g:5580:1: entryRuleColonQualifiedName returns [String current=null] : iv_ruleColonQualifiedName= ruleColonQualifiedName EOF ;
    public final String entryRuleColonQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColonQualifiedName = null;


        try {
            // InternalAlf.g:5580:58: (iv_ruleColonQualifiedName= ruleColonQualifiedName EOF )
            // InternalAlf.g:5581:2: iv_ruleColonQualifiedName= ruleColonQualifiedName EOF
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
    // InternalAlf.g:5587:1: ruleColonQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleColonQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:5593:2: ( (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:5594:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:5594:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            // InternalAlf.g:5595:3: this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:5605:3: (kw= '::' this_Name_2= ruleName )+
            int cnt144=0;
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==16) ) {
                    int LA144_1 = input.LA(2);

                    if ( ((LA144_1>=RULE_ID && LA144_1<=RULE_UNRESTRICTED_NAME)) ) {
                        alt144=1;
                    }


                }


                switch (alt144) {
            	case 1 :
            	    // InternalAlf.g:5606:4: kw= '::' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,16,FOLLOW_4); 

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
            	    if ( cnt144 >= 1 ) break loop144;
                        EarlyExitException eee =
                            new EarlyExitException(144, input);
                        throw eee;
                }
                cnt144++;
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
    // InternalAlf.g:5626:1: entryRuleDotQualifiedName returns [String current=null] : iv_ruleDotQualifiedName= ruleDotQualifiedName EOF ;
    public final String entryRuleDotQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDotQualifiedName = null;


        try {
            // InternalAlf.g:5626:56: (iv_ruleDotQualifiedName= ruleDotQualifiedName EOF )
            // InternalAlf.g:5627:2: iv_ruleDotQualifiedName= ruleDotQualifiedName EOF
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
    // InternalAlf.g:5633:1: ruleDotQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleDotQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:5639:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:5640:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:5640:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            // InternalAlf.g:5641:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:5651:3: (kw= '.' this_Name_2= ruleName )+
            int cnt145=0;
            loop145:
            do {
                int alt145=2;
                int LA145_0 = input.LA(1);

                if ( (LA145_0==17) ) {
                    int LA145_1 = input.LA(2);

                    if ( ((LA145_1>=RULE_ID && LA145_1<=RULE_UNRESTRICTED_NAME)) ) {
                        alt145=1;
                    }


                }


                switch (alt145) {
            	case 1 :
            	    // InternalAlf.g:5652:4: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,17,FOLLOW_4); 

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
            	    if ( cnt145 >= 1 ) break loop145;
                        EarlyExitException eee =
                            new EarlyExitException(145, input);
                        throw eee;
                }
                cnt145++;
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
    // InternalAlf.g:5672:1: rulePackageElementVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator rulePackageElementVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAlf.g:5678:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // InternalAlf.g:5679:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // InternalAlf.g:5679:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==55) ) {
                alt146=1;
            }
            else if ( (LA146_0==56) ) {
                alt146=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }
            switch (alt146) {
                case 1 :
                    // InternalAlf.g:5680:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:5680:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:5681:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getPackageElementVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPackageElementVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:5688:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:5688:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:5689:4: enumLiteral_1= 'private'
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
    // InternalAlf.g:5699:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAlf.g:5705:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) )
            // InternalAlf.g:5706:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            {
            // InternalAlf.g:5706:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            int alt147=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt147=1;
                }
                break;
            case 56:
                {
                alt147=2;
                }
                break;
            case 57:
                {
                alt147=3;
                }
                break;
            case 58:
                {
                alt147=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;
            }

            switch (alt147) {
                case 1 :
                    // InternalAlf.g:5707:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:5707:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:5708:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:5715:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:5715:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:5716:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:5723:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalAlf.g:5723:3: (enumLiteral_2= 'protected' )
                    // InternalAlf.g:5724:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:5731:3: (enumLiteral_3= 'packaged' )
                    {
                    // InternalAlf.g:5731:3: (enumLiteral_3= 'packaged' )
                    // InternalAlf.g:5732:4: enumLiteral_3= 'packaged'
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
    // InternalAlf.g:5742:1: ruleFeatureDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFeatureDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAlf.g:5748:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalAlf.g:5749:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalAlf.g:5749:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt148=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt148=1;
                }
                break;
            case 60:
                {
                alt148=2;
                }
                break;
            case 61:
                {
                alt148=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 148, 0, input);

                throw nvae;
            }

            switch (alt148) {
                case 1 :
                    // InternalAlf.g:5750:3: (enumLiteral_0= 'in' )
                    {
                    // InternalAlf.g:5750:3: (enumLiteral_0= 'in' )
                    // InternalAlf.g:5751:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:5758:3: (enumLiteral_1= 'out' )
                    {
                    // InternalAlf.g:5758:3: (enumLiteral_1= 'out' )
                    // InternalAlf.g:5759:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:5766:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalAlf.g:5766:3: (enumLiteral_2= 'inout' )
                    // InternalAlf.g:5767:4: enumLiteral_2= 'inout'
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
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA91 dfa91 = new DFA91(this);
    protected DFA100 dfa100 = new DFA100(this);
    protected DFA106 dfa106 = new DFA106(this);
    protected DFA115 dfa115 = new DFA115(this);
    protected DFA130 dfa130 = new DFA130(this);
    static final String dfa_1s = "\34\uffff";
    static final String dfa_2s = "\1\4\2\17\1\10\1\4\1\uffff\1\31\2\uffff\2\20\1\uffff\2\10\1\4\1\10\1\23\2\21\2\23\2\20\1\4\2\10\2\23";
    static final String dfa_3s = "\1\70\2\17\1\11\1\34\1\uffff\1\32\2\uffff\2\24\1\uffff\1\22\1\11\1\70\1\22\1\23\2\24\2\23\2\24\1\70\2\22\2\23";
    static final String dfa_4s = "\5\uffff\1\1\1\uffff\1\2\1\3\2\uffff\1\4\20\uffff";
    static final String dfa_5s = "\34\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\12\uffff\1\3\5\uffff\1\5\3\uffff\1\7\1\10\1\uffff\1\6\32\uffff\1\1\1\2",
            "\1\3",
            "\1\3",
            "\1\11\1\12",
            "\1\4\20\uffff\1\5\3\uffff\1\7\1\10\1\13\1\6",
            "",
            "\1\7\1\10",
            "",
            "",
            "\1\17\1\14\1\uffff\1\16\1\15",
            "\1\17\1\14\1\uffff\1\16\1\15",
            "",
            "\1\21\1\22\10\uffff\1\20",
            "\1\23\1\24",
            "\1\4\12\uffff\1\3\5\uffff\1\5\3\uffff\1\7\1\10\1\uffff\1\6\32\uffff\1\1\1\2",
            "\1\25\1\26\10\uffff\1\20",
            "\1\27",
            "\1\30\1\uffff\1\16\1\15",
            "\1\30\1\uffff\1\16\1\15",
            "\1\16",
            "\1\16",
            "\1\31\2\uffff\1\16\1\15",
            "\1\31\2\uffff\1\16\1\15",
            "\1\4\12\uffff\1\3\5\uffff\1\5\3\uffff\1\7\1\10\1\uffff\1\6\32\uffff\1\1\1\2",
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
    static final String dfa_8s = "\1\4\1\uffff\2\17\1\10\2\20\2\10\2\uffff\2\20\2\21\2\10";
    static final String dfa_9s = "\1\70\1\uffff\2\17\1\11\2\24\2\22\2\uffff\4\24\2\22";
    static final String dfa_10s = "\1\uffff\1\3\7\uffff\1\2\1\1\6\uffff";
    static final String dfa_11s = "\21\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\12\uffff\1\4\5\uffff\1\1\41\uffff\1\2\1\3",
            "",
            "\1\4",
            "\1\4",
            "\1\5\1\6",
            "\1\7\1\10\1\uffff\2\11",
            "\1\7\1\10\1\uffff\2\11",
            "\1\13\1\14\10\uffff\1\12",
            "\1\15\1\16\10\uffff\1\12",
            "",
            "",
            "\1\17\2\uffff\2\11",
            "\1\17\2\uffff\2\11",
            "\1\20\1\uffff\2\11",
            "\1\20\1\uffff\2\11",
            "\1\13\1\14\10\uffff\1\12",
            "\1\15\1\16\10\uffff\1\12"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 436:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )*";
        }
    }
    static final String dfa_13s = "\1\4\2\uffff\3\10\2\20\2\10\2\21\1\uffff\2\20\2\10";
    static final String dfa_14s = "\1\70\2\uffff\2\34\1\11\2\24\2\22\2\24\1\uffff\2\24\2\22";
    static final String dfa_15s = "\1\uffff\1\3\1\1\11\uffff\1\2\4\uffff";
    static final String[] dfa_16s = {
            "\1\2\3\uffff\2\2\5\uffff\1\5\5\uffff\1\2\1\uffff\1\1\1\uffff\4\2\32\uffff\1\3\1\4",
            "",
            "",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2",
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
            return "()* loopback of 523:3: ( ( (lv_ownedMembership_6_0= rulePackageMember ) ) | ( (lv_ownedImport_7_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_17s = "\1\4\2\uffff\3\10\2\20\2\10\2\20\1\uffff\2\21\2\10";
    static final String[] dfa_18s = {
            "\1\2\3\uffff\2\2\5\uffff\1\5\5\uffff\1\2\1\uffff\1\1\1\uffff\4\2\32\uffff\1\3\1\4",
            "",
            "",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2",
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
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_17;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "()* loopback of 614:3: ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_19s = "\6\uffff";
    static final String dfa_20s = "\2\4\2\10\2\uffff";
    static final String dfa_21s = "\2\70\2\34\2\uffff";
    static final String dfa_22s = "\4\uffff\1\1\1\2";
    static final String dfa_23s = "\6\uffff}>";
    static final String[] dfa_24s = {
            "\1\1\3\uffff\2\5\5\uffff\1\4\5\uffff\1\4\3\uffff\2\4\1\5\1\4\32\uffff\1\2\1\3",
            "\1\1\3\uffff\2\5\5\uffff\1\4\5\uffff\1\4\3\uffff\2\4\1\5\1\4\32\uffff\1\2\1\3",
            "\2\5\5\uffff\1\4\5\uffff\1\4\3\uffff\2\4\1\5\1\4",
            "\2\5\5\uffff\1\4\5\uffff\1\4\3\uffff\2\4\1\5\1\4",
            "",
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "702:2: (this_NonFeaturePackageMember_0= ruleNonFeaturePackageMember | this_FeaturePackageMember_1= ruleFeaturePackageMember )";
        }
    }
    static final String dfa_25s = "\41\uffff";
    static final String dfa_26s = "\1\17\1\10\1\uffff\2\10\1\uffff\2\26\1\uffff\2\26\1\uffff\2\26\1\uffff\2\10\4\20\4\10\2\21\2\20\2\21\2\20";
    static final String dfa_27s = "\1\34\1\30\1\uffff\2\30\1\uffff\2\30\1\uffff\2\35\1\uffff\2\35\1\uffff\2\11\4\36\4\11\10\36";
    static final String dfa_28s = "\2\uffff\1\1\2\uffff\1\5\2\uffff\1\2\2\uffff\1\3\2\uffff\1\4\22\uffff";
    static final String dfa_29s = "\41\uffff}>";
    static final String[] dfa_30s = {
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
            "\1\26\1\25\1\uffff\1\13\2\uffff\1\2\7\uffff\1\2",
            "\1\26\1\25\1\uffff\1\13\2\uffff\1\2\7\uffff\1\2",
            "\1\30\1\27\1\uffff\1\16\2\uffff\1\2\7\uffff\1\2",
            "\1\30\1\27\1\uffff\1\16\2\uffff\1\2\7\uffff\1\2",
            "\1\31\1\32",
            "\1\33\1\34",
            "\1\35\1\36",
            "\1\37\1\40",
            "\1\25\1\uffff\1\13\2\uffff\1\2\7\uffff\1\2",
            "\1\25\1\uffff\1\13\2\uffff\1\2\7\uffff\1\2",
            "\1\26\2\uffff\1\13\2\uffff\1\2\7\uffff\1\2",
            "\1\26\2\uffff\1\13\2\uffff\1\2\7\uffff\1\2",
            "\1\27\1\uffff\1\16\2\uffff\1\2\7\uffff\1\2",
            "\1\27\1\uffff\1\16\2\uffff\1\2\7\uffff\1\2",
            "\1\30\2\uffff\1\16\2\uffff\1\2\7\uffff\1\2",
            "\1\30\2\uffff\1\16\2\uffff\1\2\7\uffff\1\2"
    };

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "777:3: ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | (otherlv_3= 'package' ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'class' ( (lv_memberName_9_0= ruleName ) )? otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) | (otherlv_13= 'assoc' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | (otherlv_18= 'import' ( ( ruleQualifiedName ) ) (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )? otherlv_22= ';' ) )";
        }
    }
    static final String dfa_31s = "\33\uffff";
    static final String dfa_32s = "\2\10\4\23\1\10\2\uffff\1\10\4\20\1\uffff\4\10\2\21\2\20\2\21\2\20";
    static final String dfa_33s = "\1\33\5\53\1\11\2\uffff\1\11\4\51\1\uffff\4\11\10\51";
    static final String dfa_34s = "\7\uffff\1\2\1\1\5\uffff\1\3\14\uffff";
    static final String dfa_35s = "\33\uffff}>";
    static final String[] dfa_36s = {
            "\1\2\1\3\21\uffff\1\1",
            "\1\4\1\5\16\uffff\1\6\21\uffff\2\7",
            "\1\10\2\uffff\1\10\1\uffff\1\11\12\uffff\1\10\1\uffff\1\10\3\uffff\3\10",
            "\1\10\2\uffff\1\10\1\uffff\1\11\12\uffff\1\10\1\uffff\1\10\3\uffff\3\10",
            "\1\10\2\uffff\1\10\1\uffff\1\11\12\uffff\1\10\1\uffff\1\10\3\uffff\3\10",
            "\1\10\2\uffff\1\10\1\uffff\1\11\12\uffff\1\10\1\uffff\1\10\3\uffff\3\10",
            "\1\12\1\13",
            "",
            "",
            "\1\14\1\15",
            "\1\20\1\17\1\uffff\1\16\2\uffff\1\7\16\uffff\1\7\3\uffff\1\7",
            "\1\20\1\17\1\uffff\1\16\2\uffff\1\7\16\uffff\1\7\3\uffff\1\7",
            "\1\22\1\21\1\uffff\1\16\2\uffff\1\10\16\uffff\1\10\3\uffff\1\10",
            "\1\22\1\21\1\uffff\1\16\2\uffff\1\10\16\uffff\1\10\3\uffff\1\10",
            "",
            "\1\23\1\24",
            "\1\25\1\26",
            "\1\27\1\30",
            "\1\31\1\32",
            "\1\17\1\uffff\1\16\2\uffff\1\7\16\uffff\1\7\3\uffff\1\7",
            "\1\17\1\uffff\1\16\2\uffff\1\7\16\uffff\1\7\3\uffff\1\7",
            "\1\20\2\uffff\1\16\2\uffff\1\7\16\uffff\1\7\3\uffff\1\7",
            "\1\20\2\uffff\1\16\2\uffff\1\7\16\uffff\1\7\3\uffff\1\7",
            "\1\21\1\uffff\1\16\2\uffff\1\10\16\uffff\1\10\3\uffff\1\10",
            "\1\21\1\uffff\1\16\2\uffff\1\10\16\uffff\1\10\3\uffff\1\10",
            "\1\22\2\uffff\1\16\2\uffff\1\10\16\uffff\1\10\3\uffff\1\10",
            "\1\22\2\uffff\1\16\2\uffff\1\10\16\uffff\1\10\3\uffff\1\10"
    };

    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[][] dfa_36 = unpackEncodedStringArray(dfa_36s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_31;
            this.eof = dfa_31;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "1057:3: ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) )";
        }
    }
    static final String dfa_37s = "\1\4\1\uffff\2\17\1\10\2\20\2\10\1\uffff\2\21\1\uffff\2\20\2\10";
    static final String dfa_38s = "\1\70\1\uffff\2\17\1\11\2\24\2\22\1\uffff\2\24\1\uffff\2\24\2\22";
    static final String dfa_39s = "\1\uffff\1\3\7\uffff\1\2\2\uffff\1\1\4\uffff";
    static final String[] dfa_40s = {
            "\1\1\12\uffff\1\4\11\uffff\1\1\2\uffff\1\1\32\uffff\1\2\1\3",
            "",
            "\1\4",
            "\1\4",
            "\1\5\1\6",
            "\1\10\1\7\1\uffff\2\11",
            "\1\10\1\7\1\uffff\2\11",
            "\1\12\1\13\10\uffff\1\14",
            "\1\15\1\16\10\uffff\1\14",
            "",
            "\1\17\1\uffff\2\11",
            "\1\17\1\uffff\2\11",
            "",
            "\1\20\2\uffff\2\11",
            "\1\20\2\uffff\2\11",
            "\1\12\1\13\10\uffff\1\14",
            "\1\15\1\16\10\uffff\1\14"
    };
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[][] dfa_40 = unpackEncodedStringArray(dfa_40s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_37;
            this.max = dfa_38;
            this.accept = dfa_39;
            this.special = dfa_11;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "()* loopback of 1205:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )*";
        }
    }
    static final String dfa_41s = "\1\75\2\uffff\2\75\1\11\2\24\2\22\2\24\1\uffff\2\24\2\22";
    static final String[] dfa_42s = {
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
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[][] dfa_42 = unpackEncodedStringArray(dfa_42s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_17;
            this.max = dfa_41;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()* loopback of 1363:3: ( ( (lv_ownedMembership_12_0= ruleClassMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_43s = "\1\4\2\uffff\3\10\2\20\2\10\1\uffff\2\20\2\21\2\10";
    static final String dfa_44s = "\1\75\2\uffff\2\75\1\11\2\24\2\22\1\uffff\4\24\2\22";
    static final String dfa_45s = "\1\uffff\1\3\1\1\7\uffff\1\2\6\uffff";
    static final String[] dfa_46s = {
            "\1\2\3\uffff\2\2\5\uffff\1\5\5\uffff\1\2\1\uffff\1\1\1\uffff\4\2\2\uffff\3\2\25\uffff\1\3\1\4\5\2",
            "",
            "",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2\2\uffff\3\2\31\uffff\3\2",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2\2\uffff\3\2\31\uffff\3\2",
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
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[][] dfa_46 = unpackEncodedStringArray(dfa_46s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_43;
            this.max = dfa_44;
            this.accept = dfa_45;
            this.special = dfa_11;
            this.transition = dfa_46;
        }
        public String getDescription() {
            return "()* loopback of 1525:3: ( ( (lv_ownedMembership_9_0= ruleClassMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_47s = "\10\uffff";
    static final String dfa_48s = "\2\4\4\10\2\uffff";
    static final String dfa_49s = "\6\75\2\uffff";
    static final String dfa_50s = "\6\uffff\1\1\1\2";
    static final String dfa_51s = "\10\uffff}>";
    static final String[] dfa_52s = {
            "\1\1\3\uffff\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\25\uffff\1\2\1\3\1\4\1\5\3\7",
            "\1\1\3\uffff\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\25\uffff\1\2\1\3\1\4\1\5\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\31\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\31\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\31\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\31\uffff\3\7",
            "",
            ""
    };

    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[][] dfa_52 = unpackEncodedStringArray(dfa_52s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_47;
            this.eof = dfa_47;
            this.min = dfa_48;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_51;
            this.transition = dfa_52;
        }
        public String getDescription() {
            return "1646:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_FeatureClassMember_1= ruleFeatureClassMember )";
        }
    }
    static final String dfa_53s = "\1\17\1\10\1\uffff\2\10\1\uffff\2\26\1\uffff\2\26\1\uffff\2\26\1\uffff\2\10\4\20\4\10\2\20\4\21\2\20";
    static final String[] dfa_54s = {
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
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final short[][] dfa_54 = unpackEncodedStringArray(dfa_54s);

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_53;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_54;
        }
        public String getDescription() {
            return "1721:3: ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | (otherlv_3= 'package' ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'class' ( (lv_memberName_9_0= ruleName ) )? otherlv_10= 'is' ( ( ruleQualifiedName ) ) otherlv_12= ';' ) | (otherlv_13= 'assoc' ( (lv_memberName_14_0= ruleName ) )? otherlv_15= 'is' ( ( ruleQualifiedName ) ) otherlv_17= ';' ) | (otherlv_18= 'import' ( ( ruleQualifiedName ) ) (otherlv_20= 'as' ( (lv_memberName_21_0= ruleName ) ) )? otherlv_22= ';' ) )";
        }
    }
    static final String dfa_55s = "\4\10\1\uffff\2\23\1\uffff\2\23\4\10\1\uffff\1\10\4\20\1\uffff\4\10\2\21\2\20\2\21\2\20";
    static final String dfa_56s = "\4\75\1\uffff\2\53\1\uffff\2\53\1\11\3\53\1\uffff\1\11\4\51\1\uffff\4\11\10\51";
    static final String dfa_57s = "\4\uffff\1\1\2\uffff\1\3\6\uffff\1\2\5\uffff\1\4\14\uffff";
    static final String[] dfa_58s = {
            "\1\5\1\6\21\uffff\1\1\3\uffff\1\2\1\3\1\7\31\uffff\3\4",
            "\1\10\1\11\16\uffff\1\12\21\uffff\2\16\17\uffff\1\13\1\14\1\15",
            "\1\10\1\11\16\uffff\1\12\21\uffff\2\16\17\uffff\1\13\1\14\1\15",
            "\2\4\16\uffff\1\16\21\uffff\2\16\17\uffff\1\13\1\14\1\15",
            "",
            "\1\4\2\uffff\1\4\1\uffff\1\17\12\uffff\1\4\1\uffff\1\4\3\uffff\3\4",
            "\1\4\2\uffff\1\4\1\uffff\1\17\12\uffff\1\4\1\uffff\1\4\3\uffff\3\4",
            "",
            "\1\4\2\uffff\1\4\1\uffff\1\17\12\uffff\1\4\1\uffff\1\4\3\uffff\3\4",
            "\1\4\2\uffff\1\4\1\uffff\1\17\12\uffff\1\4\1\uffff\1\4\3\uffff\3\4",
            "\1\20\1\21",
            "\2\4\16\uffff\1\16\21\uffff\2\16",
            "\2\4\16\uffff\1\16\21\uffff\2\16",
            "\2\4\16\uffff\1\16\21\uffff\2\16",
            "",
            "\1\22\1\23",
            "\1\26\1\25\1\uffff\1\24\2\uffff\1\16\16\uffff\1\16\3\uffff\1\16",
            "\1\26\1\25\1\uffff\1\24\2\uffff\1\16\16\uffff\1\16\3\uffff\1\16",
            "\1\30\1\27\1\uffff\1\24\2\uffff\1\4\16\uffff\1\4\3\uffff\1\4",
            "\1\30\1\27\1\uffff\1\24\2\uffff\1\4\16\uffff\1\4\3\uffff\1\4",
            "",
            "\1\31\1\32",
            "\1\33\1\34",
            "\1\35\1\36",
            "\1\37\1\40",
            "\1\25\1\uffff\1\24\2\uffff\1\16\16\uffff\1\16\3\uffff\1\16",
            "\1\25\1\uffff\1\24\2\uffff\1\16\16\uffff\1\16\3\uffff\1\16",
            "\1\26\2\uffff\1\24\2\uffff\1\16\16\uffff\1\16\3\uffff\1\16",
            "\1\26\2\uffff\1\24\2\uffff\1\16\16\uffff\1\16\3\uffff\1\16",
            "\1\27\1\uffff\1\24\2\uffff\1\4\16\uffff\1\4\3\uffff\1\4",
            "\1\27\1\uffff\1\24\2\uffff\1\4\16\uffff\1\4\3\uffff\1\4",
            "\1\30\2\uffff\1\24\2\uffff\1\4\16\uffff\1\4\3\uffff\1\4",
            "\1\30\2\uffff\1\24\2\uffff\1\4\16\uffff\1\4\3\uffff\1\4"
    };
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final char[] dfa_56 = DFA.unpackEncodedStringToUnsignedChars(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final short[][] dfa_58 = unpackEncodedStringArray(dfa_58s);

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_55;
            this.max = dfa_56;
            this.accept = dfa_57;
            this.special = dfa_29;
            this.transition = dfa_58;
        }
        public String getDescription() {
            return "2001:3: ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) )";
        }
    }
    static final String[] dfa_59s = {
            "\1\1\12\uffff\1\4\12\uffff\1\1\1\uffff\1\1\32\uffff\1\2\1\3",
            "",
            "\1\4",
            "\1\4",
            "\1\5\1\6",
            "\1\10\1\7\1\uffff\2\11",
            "\1\10\1\7\1\uffff\2\11",
            "\1\12\1\13\10\uffff\1\14",
            "\1\15\1\16\10\uffff\1\14",
            "",
            "\1\17\1\uffff\2\11",
            "\1\17\1\uffff\2\11",
            "",
            "\1\20\2\uffff\2\11",
            "\1\20\2\uffff\2\11",
            "\1\12\1\13\10\uffff\1\14",
            "\1\15\1\16\10\uffff\1\14"
    };
    static final short[][] dfa_59 = unpackEncodedStringArray(dfa_59s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_37;
            this.max = dfa_38;
            this.accept = dfa_39;
            this.special = dfa_11;
            this.transition = dfa_59;
        }
        public String getDescription() {
            return "()* loopback of 2292:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )*";
        }
    }
    static final String[] dfa_60s = {
            "\1\2\3\uffff\2\2\5\uffff\1\5\5\uffff\1\2\1\uffff\1\1\1\uffff\4\2\2\uffff\4\2\24\uffff\1\3\1\4\5\2",
            "",
            "",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2\2\uffff\4\2\30\uffff\3\2",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2\2\uffff\4\2\30\uffff\3\2",
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
    static final short[][] dfa_60 = unpackEncodedStringArray(dfa_60s);

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_17;
            this.max = dfa_41;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_60;
        }
        public String getDescription() {
            return "()* loopback of 2450:3: ( ( (lv_ownedMembership_12_0= ruleAssociationMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )*";
        }
    }
    static final String[] dfa_61s = {
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
    static final short[][] dfa_61 = unpackEncodedStringArray(dfa_61s);

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_41;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_61;
        }
        public String getDescription() {
            return "()* loopback of 2612:3: ( ( (lv_ownedMembership_9_0= ruleAssociationMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_62s = "\11\uffff";
    static final String dfa_63s = "\2\4\4\10\3\uffff";
    static final String dfa_64s = "\6\75\3\uffff";
    static final String dfa_65s = "\6\uffff\1\1\1\2\1\3";
    static final String dfa_66s = "\11\uffff}>";
    static final String[] dfa_67s = {
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

    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final char[] dfa_63 = DFA.unpackEncodedStringToUnsignedChars(dfa_63s);
    static final char[] dfa_64 = DFA.unpackEncodedStringToUnsignedChars(dfa_64s);
    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final short[] dfa_66 = DFA.unpackEncodedString(dfa_66s);
    static final short[][] dfa_67 = unpackEncodedStringArray(dfa_67s);

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = dfa_62;
            this.eof = dfa_62;
            this.min = dfa_63;
            this.max = dfa_64;
            this.accept = dfa_65;
            this.special = dfa_66;
            this.transition = dfa_67;
        }
        public String getDescription() {
            return "2700:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )";
        }
    }
    static final String dfa_68s = "\32\uffff";
    static final String dfa_69s = "\1\33\2\10\2\uffff\2\23\2\10\4\20\2\10\1\uffff\2\10\2\21\2\20\2\21\2\20";
    static final String dfa_70s = "\1\41\2\75\2\uffff\2\53\2\11\4\51\2\11\1\uffff\2\11\10\51";
    static final String dfa_71s = "\3\uffff\1\1\1\2\12\uffff\1\3\12\uffff";
    static final String dfa_72s = "\32\uffff}>";
    static final String[] dfa_73s = {
            "\1\1\3\uffff\1\2\1\3\1\4",
            "\1\5\1\6\16\uffff\1\7\21\uffff\2\3\17\uffff\3\3",
            "\1\5\1\6\16\uffff\1\7\21\uffff\2\3\17\uffff\3\3",
            "",
            "",
            "\1\3\2\uffff\1\3\1\uffff\1\10\12\uffff\1\3\1\uffff\1\3\3\uffff\3\3",
            "\1\3\2\uffff\1\3\1\uffff\1\10\12\uffff\1\3\1\uffff\1\3\3\uffff\3\3",
            "\1\11\1\12",
            "\1\13\1\14",
            "\1\16\1\15\1\uffff\1\17\2\uffff\1\3\16\uffff\1\3\3\uffff\1\3",
            "\1\16\1\15\1\uffff\1\17\2\uffff\1\3\16\uffff\1\3\3\uffff\1\3",
            "\1\21\1\20\1\uffff\1\17\2\uffff\1\3\16\uffff\1\3\3\uffff\1\3",
            "\1\21\1\20\1\uffff\1\17\2\uffff\1\3\16\uffff\1\3\3\uffff\1\3",
            "\1\22\1\23",
            "\1\24\1\25",
            "",
            "\1\26\1\27",
            "\1\30\1\31",
            "\1\15\1\uffff\1\17\2\uffff\1\3\16\uffff\1\3\3\uffff\1\3",
            "\1\15\1\uffff\1\17\2\uffff\1\3\16\uffff\1\3\3\uffff\1\3",
            "\1\16\2\uffff\1\17\2\uffff\1\3\16\uffff\1\3\3\uffff\1\3",
            "\1\16\2\uffff\1\17\2\uffff\1\3\16\uffff\1\3\3\uffff\1\3",
            "\1\20\1\uffff\1\17\2\uffff\1\3\16\uffff\1\3\3\uffff\1\3",
            "\1\20\1\uffff\1\17\2\uffff\1\3\16\uffff\1\3\3\uffff\1\3",
            "\1\21\2\uffff\1\17\2\uffff\1\3\16\uffff\1\3\3\uffff\1\3",
            "\1\21\2\uffff\1\17\2\uffff\1\3\16\uffff\1\3\3\uffff\1\3"
    };

    static final short[] dfa_68 = DFA.unpackEncodedString(dfa_68s);
    static final char[] dfa_69 = DFA.unpackEncodedStringToUnsignedChars(dfa_69s);
    static final char[] dfa_70 = DFA.unpackEncodedStringToUnsignedChars(dfa_70s);
    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final short[] dfa_72 = DFA.unpackEncodedString(dfa_72s);
    static final short[][] dfa_73 = unpackEncodedStringArray(dfa_73s);

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = dfa_68;
            this.eof = dfa_68;
            this.min = dfa_69;
            this.max = dfa_70;
            this.accept = dfa_71;
            this.special = dfa_72;
            this.transition = dfa_73;
        }
        public String getDescription() {
            return "2784:3: ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) )";
        }
    }
    static final String dfa_74s = "\36\uffff";
    static final String dfa_75s = "\2\10\1\uffff\2\23\3\10\2\23\1\10\1\uffff\1\10\4\20\2\10\1\uffff\2\10\2\21\2\20\2\21\2\20";
    static final String dfa_76s = "\2\75\1\uffff\7\53\1\11\1\uffff\1\11\4\51\2\11\1\uffff\2\11\10\51";
    static final String dfa_77s = "\2\uffff\1\1\10\uffff\1\2\7\uffff\1\3\12\uffff";
    static final String dfa_78s = "\36\uffff}>";
    static final String[] dfa_79s = {
            "\1\3\1\4\30\uffff\1\1\30\uffff\3\2",
            "\1\10\1\11\16\uffff\1\12\21\uffff\2\13\17\uffff\1\5\1\6\1\7",
            "",
            "\1\2\2\uffff\1\2\1\uffff\1\14\12\uffff\1\2\1\uffff\1\2\3\uffff\3\2",
            "\1\2\2\uffff\1\2\1\uffff\1\14\12\uffff\1\2\1\uffff\1\2\3\uffff\3\2",
            "\2\2\16\uffff\1\13\21\uffff\2\13",
            "\2\2\16\uffff\1\13\21\uffff\2\13",
            "\2\2\16\uffff\1\13\21\uffff\2\13",
            "\1\2\2\uffff\1\2\1\uffff\1\14\12\uffff\1\2\1\uffff\1\2\3\uffff\3\2",
            "\1\2\2\uffff\1\2\1\uffff\1\14\12\uffff\1\2\1\uffff\1\2\3\uffff\3\2",
            "\1\15\1\16",
            "",
            "\1\17\1\20",
            "\1\22\1\21\1\uffff\1\23\2\uffff\1\13\16\uffff\1\13\3\uffff\1\13",
            "\1\22\1\21\1\uffff\1\23\2\uffff\1\13\16\uffff\1\13\3\uffff\1\13",
            "\1\25\1\24\1\uffff\1\23\2\uffff\1\2\16\uffff\1\2\3\uffff\1\2",
            "\1\25\1\24\1\uffff\1\23\2\uffff\1\2\16\uffff\1\2\3\uffff\1\2",
            "\1\26\1\27",
            "\1\30\1\31",
            "",
            "\1\32\1\33",
            "\1\34\1\35",
            "\1\21\1\uffff\1\23\2\uffff\1\13\16\uffff\1\13\3\uffff\1\13",
            "\1\21\1\uffff\1\23\2\uffff\1\13\16\uffff\1\13\3\uffff\1\13",
            "\1\22\2\uffff\1\23\2\uffff\1\13\16\uffff\1\13\3\uffff\1\13",
            "\1\22\2\uffff\1\23\2\uffff\1\13\16\uffff\1\13\3\uffff\1\13",
            "\1\24\1\uffff\1\23\2\uffff\1\2\16\uffff\1\2\3\uffff\1\2",
            "\1\24\1\uffff\1\23\2\uffff\1\2\16\uffff\1\2\3\uffff\1\2",
            "\1\25\2\uffff\1\23\2\uffff\1\2\16\uffff\1\2\3\uffff\1\2",
            "\1\25\2\uffff\1\23\2\uffff\1\2\16\uffff\1\2\3\uffff\1\2"
    };

    static final short[] dfa_74 = DFA.unpackEncodedString(dfa_74s);
    static final char[] dfa_75 = DFA.unpackEncodedStringToUnsignedChars(dfa_75s);
    static final char[] dfa_76 = DFA.unpackEncodedStringToUnsignedChars(dfa_76s);
    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final short[] dfa_78 = DFA.unpackEncodedString(dfa_78s);
    static final short[][] dfa_79 = unpackEncodedStringArray(dfa_79s);

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = dfa_74;
            this.eof = dfa_74;
            this.min = dfa_75;
            this.max = dfa_76;
            this.accept = dfa_77;
            this.special = dfa_78;
            this.transition = dfa_79;
        }
        public String getDescription() {
            return "3012:3: ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) )";
        }
    }
    static final String[] dfa_80s = {
            "\1\1\12\uffff\1\4\47\uffff\1\2\1\3",
            "",
            "\1\4",
            "\1\4",
            "\1\5\1\6",
            "\1\7\1\10\1\uffff\2\11",
            "\1\7\1\10\1\uffff\2\11",
            "\1\13\1\14\10\uffff\1\12",
            "\1\15\1\16\10\uffff\1\12",
            "",
            "",
            "\1\17\2\uffff\2\11",
            "\1\17\2\uffff\2\11",
            "\1\20\1\uffff\2\11",
            "\1\20\1\uffff\2\11",
            "\1\13\1\14\10\uffff\1\12",
            "\1\15\1\16\10\uffff\1\12"
    };
    static final short[][] dfa_80 = unpackEncodedStringArray(dfa_80s);

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_80;
        }
        public String getDescription() {
            return "()* loopback of 3198:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )*";
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_17;
            this.max = dfa_41;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()* loopback of 3410:4: ( ( (lv_ownedMembership_16_0= ruleClassMember ) ) | ( (lv_ownedImport_17_0= rulePackageImport ) ) )*";
        }
    }

    class DFA100 extends DFA {

        public DFA100(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 100;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_43;
            this.max = dfa_44;
            this.accept = dfa_45;
            this.special = dfa_11;
            this.transition = dfa_46;
        }
        public String getDescription() {
            return "()* loopback of 3684:7: ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )*";
        }
    }

    class DFA106 extends DFA {

        public DFA106(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 106;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_43;
            this.max = dfa_44;
            this.accept = dfa_45;
            this.special = dfa_11;
            this.transition = dfa_46;
        }
        public String getDescription() {
            return "()* loopback of 3877:9: ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )*";
        }
    }

    class DFA115 extends DFA {

        public DFA115(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 115;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_43;
            this.max = dfa_44;
            this.accept = dfa_45;
            this.special = dfa_11;
            this.transition = dfa_46;
        }
        public String getDescription() {
            return "()* loopback of 4149:7: ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_81s = "\16\uffff";
    static final String dfa_82s = "\2\uffff\2\7\6\uffff\4\7";
    static final String dfa_83s = "\1\5\1\uffff\2\20\4\uffff\2\10\2\21\2\20";
    static final String dfa_84s = "\1\64\1\uffff\2\63\4\uffff\2\11\4\63";
    static final String dfa_85s = "\1\uffff\1\1\2\uffff\1\4\1\5\1\3\1\2\6\uffff";
    static final String dfa_86s = "\16\uffff}>";
    static final String[] dfa_87s = {
            "\3\1\1\2\1\3\7\uffff\2\1\3\uffff\1\4\33\uffff\1\5\1\uffff\1\1",
            "",
            "\1\11\1\10\2\7\2\uffff\2\7\6\uffff\1\7\6\uffff\1\7\1\uffff\1\7\5\uffff\5\7\1\6\1\7",
            "\1\11\1\10\2\7\2\uffff\2\7\6\uffff\1\7\6\uffff\1\7\1\uffff\1\7\5\uffff\5\7\1\6\1\7",
            "",
            "",
            "",
            "",
            "\1\12\1\13",
            "\1\14\1\15",
            "\1\10\2\7\2\uffff\2\7\6\uffff\1\7\6\uffff\1\7\1\uffff\1\7\5\uffff\5\7\1\6\1\7",
            "\1\10\2\7\2\uffff\2\7\6\uffff\1\7\6\uffff\1\7\1\uffff\1\7\5\uffff\5\7\1\6\1\7",
            "\1\11\1\uffff\2\7\2\uffff\2\7\6\uffff\1\7\6\uffff\1\7\1\uffff\1\7\5\uffff\5\7\1\6\1\7",
            "\1\11\1\uffff\2\7\2\uffff\2\7\6\uffff\1\7\6\uffff\1\7\1\uffff\1\7\5\uffff\5\7\1\6\1\7"
    };

    static final short[] dfa_81 = DFA.unpackEncodedString(dfa_81s);
    static final short[] dfa_82 = DFA.unpackEncodedString(dfa_82s);
    static final char[] dfa_83 = DFA.unpackEncodedStringToUnsignedChars(dfa_83s);
    static final char[] dfa_84 = DFA.unpackEncodedStringToUnsignedChars(dfa_84s);
    static final short[] dfa_85 = DFA.unpackEncodedString(dfa_85s);
    static final short[] dfa_86 = DFA.unpackEncodedString(dfa_86s);
    static final short[][] dfa_87 = unpackEncodedStringArray(dfa_87s);

    class DFA130 extends DFA {

        public DFA130(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 130;
            this.eot = dfa_81;
            this.eof = dfa_82;
            this.min = dfa_83;
            this.max = dfa_84;
            this.accept = dfa_85;
            this.special = dfa_86;
            this.transition = dfa_87;
        }
        public String getDescription() {
            return "4865:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0180000000208010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x018000001EA08310L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0180000016208010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000016208000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000300L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0180000008000310L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000300L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000C0001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0180000012208010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000012000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000021400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x3F8000039EA08310L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0780000016208010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x3F80000388000310L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x3800000388000300L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x3800000008000300L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x38000C0001000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000801000300L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0180000014208010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000014000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x3F8000079EA08310L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0780000388000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000388000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x38000C0009000300L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x3F80000408000310L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x3800000408000300L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000C0801000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000001000000300L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00000C2001400000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00000E2801480000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000011000000300L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00000E2001480000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000022000480000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000020000480000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0014C000004603E0L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000022000400000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000020000400000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0003E00000040002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x00140000004603E0L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x001CC000004603E0L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0008000040000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0014C00000C603E0L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0060000000000082L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000C00000000080L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000020002L});

}