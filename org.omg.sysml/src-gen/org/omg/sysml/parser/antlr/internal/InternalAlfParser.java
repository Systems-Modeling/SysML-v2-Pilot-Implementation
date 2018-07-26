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
    // InternalAlf.g:161:1: rulePackageImport returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleImportVisibilityIndicator ) )? otherlv_1= 'import' ( ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' ) ) otherlv_12= ';' ) ;
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
            // InternalAlf.g:167:2: ( ( ( (lv_visibility_0_0= ruleImportVisibilityIndicator ) )? otherlv_1= 'import' ( ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' ) ) otherlv_12= ';' ) )
            // InternalAlf.g:168:2: ( ( (lv_visibility_0_0= ruleImportVisibilityIndicator ) )? otherlv_1= 'import' ( ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' ) ) otherlv_12= ';' )
            {
            // InternalAlf.g:168:2: ( ( (lv_visibility_0_0= ruleImportVisibilityIndicator ) )? otherlv_1= 'import' ( ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' ) ) otherlv_12= ';' )
            // InternalAlf.g:169:3: ( (lv_visibility_0_0= ruleImportVisibilityIndicator ) )? otherlv_1= 'import' ( ( ( ( ruleName ) ) (otherlv_3= '::' | otherlv_4= '.' ) otherlv_5= '*' ) | ( ( ( ruleColonQualifiedName ) ) otherlv_7= '::' otherlv_8= '*' ) | ( ( ( ruleDotQualifiedName ) ) otherlv_10= '.' otherlv_11= '*' ) ) otherlv_12= ';'
            {
            // InternalAlf.g:169:3: ( (lv_visibility_0_0= ruleImportVisibilityIndicator ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=55 && LA2_0<=56)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAlf.g:170:4: (lv_visibility_0_0= ruleImportVisibilityIndicator )
                    {
                    // InternalAlf.g:170:4: (lv_visibility_0_0= ruleImportVisibilityIndicator )
                    // InternalAlf.g:171:5: lv_visibility_0_0= ruleImportVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getPackageImportAccess().getVisibilityImportVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_visibility_0_0=ruleImportVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPackageImportRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"org.omg.sysml.Alf.ImportVisibilityIndicator");
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

                if ( (LA4_1==16) ) {
                    int LA4_3 = input.LA(3);

                    if ( ((LA4_3>=RULE_ID && LA4_3<=RULE_UNRESTRICTED_NAME)) ) {
                        alt4=2;
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
                else if ( (LA4_1==17) ) {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==18) ) {
                        alt4=1;
                    }
                    else if ( ((LA4_4>=RULE_ID && LA4_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt4=3;
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

                if ( (LA4_2==17) ) {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==18) ) {
                        alt4=1;
                    }
                    else if ( ((LA4_4>=RULE_ID && LA4_4<=RULE_UNRESTRICTED_NAME)) ) {
                        alt4=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_2==16) ) {
                    int LA4_3 = input.LA(3);

                    if ( ((LA4_3>=RULE_ID && LA4_3<=RULE_UNRESTRICTED_NAME)) ) {
                        alt4=2;
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
    // InternalAlf.g:296:1: ruleElementImport returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleImportVisibilityIndicator ) )? otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_aliases_4_0= ruleName ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleElementImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_visibility_0_0 = null;

        AntlrDatatypeRuleToken lv_aliases_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:302:2: ( ( ( (lv_visibility_0_0= ruleImportVisibilityIndicator ) )? otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_aliases_4_0= ruleName ) ) )? otherlv_5= ';' ) )
            // InternalAlf.g:303:2: ( ( (lv_visibility_0_0= ruleImportVisibilityIndicator ) )? otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_aliases_4_0= ruleName ) ) )? otherlv_5= ';' )
            {
            // InternalAlf.g:303:2: ( ( (lv_visibility_0_0= ruleImportVisibilityIndicator ) )? otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_aliases_4_0= ruleName ) ) )? otherlv_5= ';' )
            // InternalAlf.g:304:3: ( (lv_visibility_0_0= ruleImportVisibilityIndicator ) )? otherlv_1= 'import' ( ( ruleQualifiedName ) ) (otherlv_3= 'as' ( (lv_aliases_4_0= ruleName ) ) )? otherlv_5= ';'
            {
            // InternalAlf.g:304:3: ( (lv_visibility_0_0= ruleImportVisibilityIndicator ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=55 && LA5_0<=56)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAlf.g:305:4: (lv_visibility_0_0= ruleImportVisibilityIndicator )
                    {
                    // InternalAlf.g:305:4: (lv_visibility_0_0= ruleImportVisibilityIndicator )
                    // InternalAlf.g:306:5: lv_visibility_0_0= ruleImportVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getElementImportAccess().getVisibilityImportVisibilityIndicatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_visibility_0_0=ruleImportVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementImportRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"org.omg.sysml.Alf.ImportVisibilityIndicator");
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

            // InternalAlf.g:343:3: (otherlv_3= 'as' ( (lv_aliases_4_0= ruleName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAlf.g:344:4: otherlv_3= 'as' ( (lv_aliases_4_0= ruleName ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getElementImportAccess().getAsKeyword_3_0());
                    			
                    // InternalAlf.g:348:4: ( (lv_aliases_4_0= ruleName ) )
                    // InternalAlf.g:349:5: (lv_aliases_4_0= ruleName )
                    {
                    // InternalAlf.g:349:5: (lv_aliases_4_0= ruleName )
                    // InternalAlf.g:350:6: lv_aliases_4_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getElementImportAccess().getAliasesNameParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_aliases_4_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementImportRule());
                    						}
                    						add(
                    							current,
                    							"aliases",
                    							lv_aliases_4_0,
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
    // InternalAlf.g:731:1: ruleNonFeaturePackageMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleImportVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'import' ( ( ruleQualifiedName ) ) (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )? otherlv_12= ';' ) ) ) ;
    public final EObject ruleNonFeaturePackageMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_ownedElement_0_0 = null;

        Enumerator lv_visibility_1_0 = null;

        EObject lv_ownedMemberElement_2_0 = null;

        AntlrDatatypeRuleToken lv_memberName_4_0 = null;

        AntlrDatatypeRuleToken lv_memberName_11_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:737:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleImportVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'import' ( ( ruleQualifiedName ) ) (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )? otherlv_12= ';' ) ) ) )
            // InternalAlf.g:738:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleImportVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'import' ( ( ruleQualifiedName ) ) (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )? otherlv_12= ';' ) ) )
            {
            // InternalAlf.g:738:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleImportVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'import' ( ( ruleQualifiedName ) ) (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )? otherlv_12= ';' ) ) )
            // InternalAlf.g:739:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleImportVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'import' ( ( ruleQualifiedName ) ) (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )? otherlv_12= ';' ) )
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

            // InternalAlf.g:758:3: ( (lv_visibility_1_0= ruleImportVisibilityIndicator ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=55 && LA14_0<=56)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAlf.g:759:4: (lv_visibility_1_0= ruleImportVisibilityIndicator )
                    {
                    // InternalAlf.g:759:4: (lv_visibility_1_0= ruleImportVisibilityIndicator )
                    // InternalAlf.g:760:5: lv_visibility_1_0= ruleImportVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getNonFeaturePackageMemberAccess().getVisibilityImportVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_visibility_1_0=ruleImportVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNonFeaturePackageMemberRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_1_0,
                    						"org.omg.sysml.Alf.ImportVisibilityIndicator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:777:3: ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'import' ( ( ruleQualifiedName ) ) (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )? otherlv_12= ';' ) )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
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
                    // InternalAlf.g:798:4: ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
                    {
                    // InternalAlf.g:798:4: ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
                    // InternalAlf.g:799:5: ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';'
                    {

                    					newCompositeNode(grammarAccess.getNonFeaturePackageMemberAccess().getNonFeatureMemberKindParserRuleCall_2_1_0());
                    				
                    pushFollow(FOLLOW_17);
                    ruleNonFeatureMemberKind();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalAlf.g:806:5: ( (lv_memberName_4_0= ruleName ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalAlf.g:807:6: (lv_memberName_4_0= ruleName )
                            {
                            // InternalAlf.g:807:6: (lv_memberName_4_0= ruleName )
                            // InternalAlf.g:808:7: lv_memberName_4_0= ruleName
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
                    				
                    // InternalAlf.g:829:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:830:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:830:6: ( ruleQualifiedName )
                    // InternalAlf.g:831:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonFeaturePackageMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNonFeaturePackageMemberAccess().getMemberElementElementCrossReference_2_1_3_0());
                    						
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
                    // InternalAlf.g:851:4: (otherlv_8= 'import' ( ( ruleQualifiedName ) ) (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )? otherlv_12= ';' )
                    {
                    // InternalAlf.g:851:4: (otherlv_8= 'import' ( ( ruleQualifiedName ) ) (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )? otherlv_12= ';' )
                    // InternalAlf.g:852:5: otherlv_8= 'import' ( ( ruleQualifiedName ) ) (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )? otherlv_12= ';'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    					newLeafNode(otherlv_8, grammarAccess.getNonFeaturePackageMemberAccess().getImportKeyword_2_2_0());
                    				
                    // InternalAlf.g:856:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:857:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:857:6: ( ruleQualifiedName )
                    // InternalAlf.g:858:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonFeaturePackageMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNonFeaturePackageMemberAccess().getMemberElementElementCrossReference_2_2_1_0());
                    						
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:872:5: (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==20) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalAlf.g:873:6: otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) )
                            {
                            otherlv_10=(Token)match(input,20,FOLLOW_4); 

                            						newLeafNode(otherlv_10, grammarAccess.getNonFeaturePackageMemberAccess().getAsKeyword_2_2_2_0());
                            					
                            // InternalAlf.g:877:6: ( (lv_memberName_11_0= ruleName ) )
                            // InternalAlf.g:878:7: (lv_memberName_11_0= ruleName )
                            {
                            // InternalAlf.g:878:7: (lv_memberName_11_0= ruleName )
                            // InternalAlf.g:879:8: lv_memberName_11_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getNonFeaturePackageMemberAccess().getMemberNameNameParserRuleCall_2_2_2_1_0());
                            							
                            pushFollow(FOLLOW_7);
                            lv_memberName_11_0=ruleName();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getNonFeaturePackageMemberRule());
                            								}
                            								set(
                            									current,
                            									"memberName",
                            									lv_memberName_11_0,
                            									"org.omg.sysml.Alf.Name");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_12, grammarAccess.getNonFeaturePackageMemberAccess().getSemicolonKeyword_2_2_3());
                    				

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


    // $ANTLR start "entryRuleNonFeatureMemberKind"
    // InternalAlf.g:907:1: entryRuleNonFeatureMemberKind returns [String current=null] : iv_ruleNonFeatureMemberKind= ruleNonFeatureMemberKind EOF ;
    public final String entryRuleNonFeatureMemberKind() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonFeatureMemberKind = null;


        try {
            // InternalAlf.g:907:60: (iv_ruleNonFeatureMemberKind= ruleNonFeatureMemberKind EOF )
            // InternalAlf.g:908:2: iv_ruleNonFeatureMemberKind= ruleNonFeatureMemberKind EOF
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
    // InternalAlf.g:914:1: ruleNonFeatureMemberKind returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'package' | kw= 'class' | kw= 'assoc' ) ;
    public final AntlrDatatypeRuleToken ruleNonFeatureMemberKind() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:920:2: ( (kw= 'package' | kw= 'class' | kw= 'assoc' ) )
            // InternalAlf.g:921:2: (kw= 'package' | kw= 'class' | kw= 'assoc' )
            {
            // InternalAlf.g:921:2: (kw= 'package' | kw= 'class' | kw= 'assoc' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt18=1;
                }
                break;
            case 25:
                {
                alt18=2;
                }
                break;
            case 26:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalAlf.g:922:3: kw= 'package'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNonFeatureMemberKindAccess().getPackageKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:928:3: kw= 'class'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNonFeatureMemberKindAccess().getClassKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:934:3: kw= 'assoc'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFeaturePackageMember"
    // InternalAlf.g:943:1: entryRuleFeaturePackageMember returns [EObject current=null] : iv_ruleFeaturePackageMember= ruleFeaturePackageMember EOF ;
    public final EObject entryRuleFeaturePackageMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeaturePackageMember = null;


        try {
            // InternalAlf.g:943:61: (iv_ruleFeaturePackageMember= ruleFeaturePackageMember EOF )
            // InternalAlf.g:944:2: iv_ruleFeaturePackageMember= ruleFeaturePackageMember EOF
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
    // InternalAlf.g:950:1: ruleFeaturePackageMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleImportVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) ) ;
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
            // InternalAlf.g:956:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleImportVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) ) )
            // InternalAlf.g:957:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleImportVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) )
            {
            // InternalAlf.g:957:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleImportVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) ) )
            // InternalAlf.g:958:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleImportVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) )
            {
            // InternalAlf.g:958:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAlf.g:959:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:959:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:960:5: lv_ownedElement_0_0= ruleComment
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
            	    break loop19;
                }
            } while (true);

            // InternalAlf.g:977:3: ( (lv_visibility_1_0= ruleImportVisibilityIndicator ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=55 && LA20_0<=56)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAlf.g:978:4: (lv_visibility_1_0= ruleImportVisibilityIndicator )
                    {
                    // InternalAlf.g:978:4: (lv_visibility_1_0= ruleImportVisibilityIndicator )
                    // InternalAlf.g:979:5: lv_visibility_1_0= ruleImportVisibilityIndicator
                    {

                    					newCompositeNode(grammarAccess.getFeaturePackageMemberAccess().getVisibilityImportVisibilityIndicatorEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_visibility_1_0=ruleImportVisibilityIndicator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFeaturePackageMemberRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_1_0,
                    						"org.omg.sysml.Alf.ImportVisibilityIndicator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAlf.g:996:3: ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) )
            int alt24=3;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalAlf.g:997:4: ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:997:4: ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:998:5: (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:998:5: (otherlv_2= 'feature' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==27) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalAlf.g:999:6: otherlv_2= 'feature'
                            {
                            otherlv_2=(Token)match(input,27,FOLLOW_20); 

                            						newLeafNode(otherlv_2, grammarAccess.getFeaturePackageMemberAccess().getFeatureKeyword_2_0_0());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:1004:5: ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1005:6: (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1005:6: (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1006:7: lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:1025:4: (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1025:4: (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:1026:5: otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_21); 

                    					newLeafNode(otherlv_4, grammarAccess.getFeaturePackageMemberAccess().getFeatureKeyword_2_1_0());
                    				
                    // InternalAlf.g:1030:5: ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:1031:6: (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:1031:6: (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:1032:7: lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition
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
                    // InternalAlf.g:1051:4: ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' )
                    {
                    // InternalAlf.g:1051:4: ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' )
                    // InternalAlf.g:1052:5: ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';'
                    {
                    // InternalAlf.g:1052:5: ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==27) ) {
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
                            // InternalAlf.g:1053:6: (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? )
                            {
                            // InternalAlf.g:1053:6: (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? )
                            // InternalAlf.g:1054:7: otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )?
                            {
                            otherlv_6=(Token)match(input,27,FOLLOW_17); 

                            							newLeafNode(otherlv_6, grammarAccess.getFeaturePackageMemberAccess().getFeatureKeyword_2_2_0_0_0());
                            						
                            // InternalAlf.g:1058:7: ( (lv_memberName_7_0= ruleName ) )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // InternalAlf.g:1059:8: (lv_memberName_7_0= ruleName )
                                    {
                                    // InternalAlf.g:1059:8: (lv_memberName_7_0= ruleName )
                                    // InternalAlf.g:1060:9: lv_memberName_7_0= ruleName
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
                            // InternalAlf.g:1079:6: ( (lv_memberName_8_0= ruleName ) )
                            {
                            // InternalAlf.g:1079:6: ( (lv_memberName_8_0= ruleName ) )
                            // InternalAlf.g:1080:7: (lv_memberName_8_0= ruleName )
                            {
                            // InternalAlf.g:1080:7: (lv_memberName_8_0= ruleName )
                            // InternalAlf.g:1081:8: lv_memberName_8_0= ruleName
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
                    				
                    // InternalAlf.g:1103:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1104:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1104:6: ( ruleQualifiedName )
                    // InternalAlf.g:1105:7: ruleQualifiedName
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
    // InternalAlf.g:1129:1: entryRuleClassUnitDefinition returns [EObject current=null] : iv_ruleClassUnitDefinition= ruleClassUnitDefinition EOF ;
    public final EObject entryRuleClassUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassUnitDefinition = null;


        try {
            // InternalAlf.g:1129:60: (iv_ruleClassUnitDefinition= ruleClassUnitDefinition EOF )
            // InternalAlf.g:1130:2: iv_ruleClassUnitDefinition= ruleClassUnitDefinition EOF
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
    // InternalAlf.g:1136:1: ruleClassUnitDefinition returns [EObject current=null] : ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ( (lv_isAbstract_3_0= 'abstract' ) )? otherlv_4= 'class' ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )? otherlv_11= '{' ( ( (lv_ownedMembership_12_0= ruleClassMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )* otherlv_14= '}' ) ;
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
            // InternalAlf.g:1142:2: ( ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ( (lv_isAbstract_3_0= 'abstract' ) )? otherlv_4= 'class' ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )? otherlv_11= '{' ( ( (lv_ownedMembership_12_0= ruleClassMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )* otherlv_14= '}' ) )
            // InternalAlf.g:1143:2: ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ( (lv_isAbstract_3_0= 'abstract' ) )? otherlv_4= 'class' ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )? otherlv_11= '{' ( ( (lv_ownedMembership_12_0= ruleClassMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )* otherlv_14= '}' )
            {
            // InternalAlf.g:1143:2: ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ( (lv_isAbstract_3_0= 'abstract' ) )? otherlv_4= 'class' ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )? otherlv_11= '{' ( ( (lv_ownedMembership_12_0= ruleClassMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )* otherlv_14= '}' )
            // InternalAlf.g:1144:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ( (lv_isAbstract_3_0= 'abstract' ) )? otherlv_4= 'class' ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )? otherlv_11= '{' ( ( (lv_ownedMembership_12_0= ruleClassMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )* otherlv_14= '}'
            {
            // InternalAlf.g:1144:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )*
            loop25:
            do {
                int alt25=3;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // InternalAlf.g:1145:4: ( (lv_ownedImport_0_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:1145:4: ( (lv_ownedImport_0_0= rulePackageImport ) )
            	    // InternalAlf.g:1146:5: (lv_ownedImport_0_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:1146:5: (lv_ownedImport_0_0= rulePackageImport )
            	    // InternalAlf.g:1147:6: lv_ownedImport_0_0= rulePackageImport
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
            	    // InternalAlf.g:1165:4: ( (lv_ownedMembership_1_0= ruleElementImport ) )
            	    {
            	    // InternalAlf.g:1165:4: ( (lv_ownedMembership_1_0= ruleElementImport ) )
            	    // InternalAlf.g:1166:5: (lv_ownedMembership_1_0= ruleElementImport )
            	    {
            	    // InternalAlf.g:1166:5: (lv_ownedMembership_1_0= ruleElementImport )
            	    // InternalAlf.g:1167:6: lv_ownedMembership_1_0= ruleElementImport
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
            	    break loop25;
                }
            } while (true);

            // InternalAlf.g:1185:3: ( (lv_ownedElement_2_0= ruleComment ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAlf.g:1186:4: (lv_ownedElement_2_0= ruleComment )
            	    {
            	    // InternalAlf.g:1186:4: (lv_ownedElement_2_0= ruleComment )
            	    // InternalAlf.g:1187:5: lv_ownedElement_2_0= ruleComment
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
            	    break loop26;
                }
            } while (true);

            // InternalAlf.g:1204:3: ( (lv_isAbstract_3_0= 'abstract' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAlf.g:1205:4: (lv_isAbstract_3_0= 'abstract' )
                    {
                    // InternalAlf.g:1205:4: (lv_isAbstract_3_0= 'abstract' )
                    // InternalAlf.g:1206:5: lv_isAbstract_3_0= 'abstract'
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
            		
            // InternalAlf.g:1222:3: ( (lv_name_5_0= ruleName ) )
            // InternalAlf.g:1223:4: (lv_name_5_0= ruleName )
            {
            // InternalAlf.g:1223:4: (lv_name_5_0= ruleName )
            // InternalAlf.g:1224:5: lv_name_5_0= ruleName
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

            // InternalAlf.g:1241:3: ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==24||LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAlf.g:1242:4: (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )*
                    {
                    // InternalAlf.g:1242:4: (otherlv_6= 'is' | otherlv_7= 'specializes' )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==24) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==29) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalAlf.g:1243:5: otherlv_6= 'is'
                            {
                            otherlv_6=(Token)match(input,24,FOLLOW_4); 

                            					newLeafNode(otherlv_6, grammarAccess.getClassUnitDefinitionAccess().getIsKeyword_5_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1248:5: otherlv_7= 'specializes'
                            {
                            otherlv_7=(Token)match(input,29,FOLLOW_4); 

                            					newLeafNode(otherlv_7, grammarAccess.getClassUnitDefinitionAccess().getSpecializesKeyword_5_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1253:4: ( (lv_ownedElement_8_0= ruleGeneralization ) )
                    // InternalAlf.g:1254:5: (lv_ownedElement_8_0= ruleGeneralization )
                    {
                    // InternalAlf.g:1254:5: (lv_ownedElement_8_0= ruleGeneralization )
                    // InternalAlf.g:1255:6: lv_ownedElement_8_0= ruleGeneralization
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

                    // InternalAlf.g:1272:4: (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==30) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalAlf.g:1273:5: otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) )
                    	    {
                    	    otherlv_9=(Token)match(input,30,FOLLOW_4); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getClassUnitDefinitionAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalAlf.g:1277:5: ( (lv_ownedElement_10_0= ruleGeneralization ) )
                    	    // InternalAlf.g:1278:6: (lv_ownedElement_10_0= ruleGeneralization )
                    	    {
                    	    // InternalAlf.g:1278:6: (lv_ownedElement_10_0= ruleGeneralization )
                    	    // InternalAlf.g:1279:7: lv_ownedElement_10_0= ruleGeneralization
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
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,22,FOLLOW_27); 

            			newLeafNode(otherlv_11, grammarAccess.getClassUnitDefinitionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalAlf.g:1302:3: ( ( (lv_ownedMembership_12_0= ruleClassMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )*
            loop31:
            do {
                int alt31=3;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // InternalAlf.g:1303:4: ( (lv_ownedMembership_12_0= ruleClassMember ) )
            	    {
            	    // InternalAlf.g:1303:4: ( (lv_ownedMembership_12_0= ruleClassMember ) )
            	    // InternalAlf.g:1304:5: (lv_ownedMembership_12_0= ruleClassMember )
            	    {
            	    // InternalAlf.g:1304:5: (lv_ownedMembership_12_0= ruleClassMember )
            	    // InternalAlf.g:1305:6: lv_ownedMembership_12_0= ruleClassMember
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
            	    // InternalAlf.g:1323:4: ( (lv_ownedImport_13_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:1323:4: ( (lv_ownedImport_13_0= rulePackageImport ) )
            	    // InternalAlf.g:1324:5: (lv_ownedImport_13_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:1324:5: (lv_ownedImport_13_0= rulePackageImport )
            	    // InternalAlf.g:1325:6: lv_ownedImport_13_0= rulePackageImport
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
            	    break loop31;
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
    // InternalAlf.g:1351:1: entryRuleClassDefinition returns [EObject current=null] : iv_ruleClassDefinition= ruleClassDefinition EOF ;
    public final EObject entryRuleClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinition = null;


        try {
            // InternalAlf.g:1351:56: (iv_ruleClassDefinition= ruleClassDefinition EOF )
            // InternalAlf.g:1352:2: iv_ruleClassDefinition= ruleClassDefinition EOF
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
    // InternalAlf.g:1358:1: ruleClassDefinition returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? otherlv_8= '{' ( ( (lv_ownedMembership_9_0= ruleClassMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )* otherlv_11= '}' ) ;
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
            // InternalAlf.g:1364:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? otherlv_8= '{' ( ( (lv_ownedMembership_9_0= ruleClassMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )* otherlv_11= '}' ) )
            // InternalAlf.g:1365:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? otherlv_8= '{' ( ( (lv_ownedMembership_9_0= ruleClassMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )* otherlv_11= '}' )
            {
            // InternalAlf.g:1365:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? otherlv_8= '{' ( ( (lv_ownedMembership_9_0= ruleClassMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )* otherlv_11= '}' )
            // InternalAlf.g:1366:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? otherlv_8= '{' ( ( (lv_ownedMembership_9_0= ruleClassMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )* otherlv_11= '}'
            {
            // InternalAlf.g:1366:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==28) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAlf.g:1367:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:1367:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:1368:5: lv_isAbstract_0_0= 'abstract'
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
            		
            // InternalAlf.g:1384:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:1385:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:1385:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:1386:5: lv_name_2_0= ruleName
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

            // InternalAlf.g:1403:3: ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==24||LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAlf.g:1404:4: (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )*
                    {
                    // InternalAlf.g:1404:4: (otherlv_3= 'is' | otherlv_4= 'specializes' )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==24) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==29) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalAlf.g:1405:5: otherlv_3= 'is'
                            {
                            otherlv_3=(Token)match(input,24,FOLLOW_4); 

                            					newLeafNode(otherlv_3, grammarAccess.getClassDefinitionAccess().getIsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1410:5: otherlv_4= 'specializes'
                            {
                            otherlv_4=(Token)match(input,29,FOLLOW_4); 

                            					newLeafNode(otherlv_4, grammarAccess.getClassDefinitionAccess().getSpecializesKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:1415:4: ( (lv_ownedElement_5_0= ruleGeneralization ) )
                    // InternalAlf.g:1416:5: (lv_ownedElement_5_0= ruleGeneralization )
                    {
                    // InternalAlf.g:1416:5: (lv_ownedElement_5_0= ruleGeneralization )
                    // InternalAlf.g:1417:6: lv_ownedElement_5_0= ruleGeneralization
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

                    // InternalAlf.g:1434:4: (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==30) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalAlf.g:1435:5: otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) )
                    	    {
                    	    otherlv_6=(Token)match(input,30,FOLLOW_4); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getClassDefinitionAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:1439:5: ( (lv_ownedElement_7_0= ruleGeneralization ) )
                    	    // InternalAlf.g:1440:6: (lv_ownedElement_7_0= ruleGeneralization )
                    	    {
                    	    // InternalAlf.g:1440:6: (lv_ownedElement_7_0= ruleGeneralization )
                    	    // InternalAlf.g:1441:7: lv_ownedElement_7_0= ruleGeneralization
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
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_27); 

            			newLeafNode(otherlv_8, grammarAccess.getClassDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalAlf.g:1464:3: ( ( (lv_ownedMembership_9_0= ruleClassMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )*
            loop36:
            do {
                int alt36=3;
                alt36 = dfa36.predict(input);
                switch (alt36) {
            	case 1 :
            	    // InternalAlf.g:1465:4: ( (lv_ownedMembership_9_0= ruleClassMember ) )
            	    {
            	    // InternalAlf.g:1465:4: ( (lv_ownedMembership_9_0= ruleClassMember ) )
            	    // InternalAlf.g:1466:5: (lv_ownedMembership_9_0= ruleClassMember )
            	    {
            	    // InternalAlf.g:1466:5: (lv_ownedMembership_9_0= ruleClassMember )
            	    // InternalAlf.g:1467:6: lv_ownedMembership_9_0= ruleClassMember
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
            	    // InternalAlf.g:1485:4: ( (lv_ownedImport_10_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:1485:4: ( (lv_ownedImport_10_0= rulePackageImport ) )
            	    // InternalAlf.g:1486:5: (lv_ownedImport_10_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:1486:5: (lv_ownedImport_10_0= rulePackageImport )
            	    // InternalAlf.g:1487:6: lv_ownedImport_10_0= rulePackageImport
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
            	    break loop36;
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
    // InternalAlf.g:1513:1: entryRuleClassDefinitionOrStub returns [EObject current=null] : iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF ;
    public final EObject entryRuleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDefinitionOrStub = null;


        try {
            // InternalAlf.g:1513:62: (iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF )
            // InternalAlf.g:1514:2: iv_ruleClassDefinitionOrStub= ruleClassDefinitionOrStub EOF
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
    // InternalAlf.g:1520:1: ruleClassDefinitionOrStub returns [EObject current=null] : this_ClassDefinition_0= ruleClassDefinition ;
    public final EObject ruleClassDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_ClassDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1526:2: (this_ClassDefinition_0= ruleClassDefinition )
            // InternalAlf.g:1527:2: this_ClassDefinition_0= ruleClassDefinition
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
    // InternalAlf.g:1538:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalAlf.g:1538:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalAlf.g:1539:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalAlf.g:1545:1: ruleGeneralization returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:1551:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:1552:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:1552:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:1553:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:1553:3: ( ruleQualifiedName )
            // InternalAlf.g:1554:4: ruleQualifiedName
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
    // InternalAlf.g:1571:1: entryRuleClassMember returns [EObject current=null] : iv_ruleClassMember= ruleClassMember EOF ;
    public final EObject entryRuleClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassMember = null;


        try {
            // InternalAlf.g:1571:52: (iv_ruleClassMember= ruleClassMember EOF )
            // InternalAlf.g:1572:2: iv_ruleClassMember= ruleClassMember EOF
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
    // InternalAlf.g:1578:1: ruleClassMember returns [EObject current=null] : (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_FeatureClassMember_1= ruleFeatureClassMember ) ;
    public final EObject ruleClassMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureClassMember_0 = null;

        EObject this_FeatureClassMember_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:1584:2: ( (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_FeatureClassMember_1= ruleFeatureClassMember ) )
            // InternalAlf.g:1585:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_FeatureClassMember_1= ruleFeatureClassMember )
            {
            // InternalAlf.g:1585:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_FeatureClassMember_1= ruleFeatureClassMember )
            int alt37=2;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalAlf.g:1586:3: this_NonFeatureClassMember_0= ruleNonFeatureClassMember
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
                    // InternalAlf.g:1595:3: this_FeatureClassMember_1= ruleFeatureClassMember
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
    // InternalAlf.g:1607:1: entryRuleNonFeatureClassMember returns [EObject current=null] : iv_ruleNonFeatureClassMember= ruleNonFeatureClassMember EOF ;
    public final EObject entryRuleNonFeatureClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFeatureClassMember = null;


        try {
            // InternalAlf.g:1607:62: (iv_ruleNonFeatureClassMember= ruleNonFeatureClassMember EOF )
            // InternalAlf.g:1608:2: iv_ruleNonFeatureClassMember= ruleNonFeatureClassMember EOF
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
    // InternalAlf.g:1614:1: ruleNonFeatureClassMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'import' ( ( ruleQualifiedName ) ) (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )? otherlv_12= ';' ) ) ) ;
    public final EObject ruleNonFeatureClassMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_ownedElement_0_0 = null;

        Enumerator lv_visibility_1_0 = null;

        EObject lv_ownedMemberElement_2_0 = null;

        AntlrDatatypeRuleToken lv_memberName_4_0 = null;

        AntlrDatatypeRuleToken lv_memberName_11_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:1620:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'import' ( ( ruleQualifiedName ) ) (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )? otherlv_12= ';' ) ) ) )
            // InternalAlf.g:1621:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'import' ( ( ruleQualifiedName ) ) (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )? otherlv_12= ';' ) ) )
            {
            // InternalAlf.g:1621:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'import' ( ( ruleQualifiedName ) ) (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )? otherlv_12= ';' ) ) )
            // InternalAlf.g:1622:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'import' ( ( ruleQualifiedName ) ) (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )? otherlv_12= ';' ) )
            {
            // InternalAlf.g:1622:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalAlf.g:1623:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:1623:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:1624:5: lv_ownedElement_0_0= ruleComment
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
            	    break loop38;
                }
            } while (true);

            // InternalAlf.g:1641:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=55 && LA39_0<=58)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAlf.g:1642:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:1642:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:1643:5: lv_visibility_1_0= ruleVisibilityIndicator
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

            // InternalAlf.g:1660:3: ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'import' ( ( ruleQualifiedName ) ) (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )? otherlv_12= ';' ) )
            int alt42=3;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalAlf.g:1661:4: ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) )
                    {
                    // InternalAlf.g:1661:4: ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) )
                    // InternalAlf.g:1662:5: (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition )
                    {
                    // InternalAlf.g:1662:5: (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition )
                    // InternalAlf.g:1663:6: lv_ownedMemberElement_2_0= ruleNonFeatureDefinition
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
                    // InternalAlf.g:1681:4: ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
                    {
                    // InternalAlf.g:1681:4: ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
                    // InternalAlf.g:1682:5: ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';'
                    {

                    					newCompositeNode(grammarAccess.getNonFeatureClassMemberAccess().getNonFeatureMemberKindParserRuleCall_2_1_0());
                    				
                    pushFollow(FOLLOW_17);
                    ruleNonFeatureMemberKind();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalAlf.g:1689:5: ( (lv_memberName_4_0= ruleName ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalAlf.g:1690:6: (lv_memberName_4_0= ruleName )
                            {
                            // InternalAlf.g:1690:6: (lv_memberName_4_0= ruleName )
                            // InternalAlf.g:1691:7: lv_memberName_4_0= ruleName
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
                    				
                    // InternalAlf.g:1712:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1713:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1713:6: ( ruleQualifiedName )
                    // InternalAlf.g:1714:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonFeatureClassMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNonFeatureClassMemberAccess().getMemberElementElementCrossReference_2_1_3_0());
                    						
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
                    // InternalAlf.g:1734:4: (otherlv_8= 'import' ( ( ruleQualifiedName ) ) (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )? otherlv_12= ';' )
                    {
                    // InternalAlf.g:1734:4: (otherlv_8= 'import' ( ( ruleQualifiedName ) ) (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )? otherlv_12= ';' )
                    // InternalAlf.g:1735:5: otherlv_8= 'import' ( ( ruleQualifiedName ) ) (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )? otherlv_12= ';'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    					newLeafNode(otherlv_8, grammarAccess.getNonFeatureClassMemberAccess().getImportKeyword_2_2_0());
                    				
                    // InternalAlf.g:1739:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:1740:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:1740:6: ( ruleQualifiedName )
                    // InternalAlf.g:1741:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNonFeatureClassMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getNonFeatureClassMemberAccess().getMemberElementElementCrossReference_2_2_1_0());
                    						
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAlf.g:1755:5: (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==20) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalAlf.g:1756:6: otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) )
                            {
                            otherlv_10=(Token)match(input,20,FOLLOW_4); 

                            						newLeafNode(otherlv_10, grammarAccess.getNonFeatureClassMemberAccess().getAsKeyword_2_2_2_0());
                            					
                            // InternalAlf.g:1760:6: ( (lv_memberName_11_0= ruleName ) )
                            // InternalAlf.g:1761:7: (lv_memberName_11_0= ruleName )
                            {
                            // InternalAlf.g:1761:7: (lv_memberName_11_0= ruleName )
                            // InternalAlf.g:1762:8: lv_memberName_11_0= ruleName
                            {

                            								newCompositeNode(grammarAccess.getNonFeatureClassMemberAccess().getMemberNameNameParserRuleCall_2_2_2_1_0());
                            							
                            pushFollow(FOLLOW_7);
                            lv_memberName_11_0=ruleName();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getNonFeatureClassMemberRule());
                            								}
                            								set(
                            									current,
                            									"memberName",
                            									lv_memberName_11_0,
                            									"org.omg.sysml.Alf.Name");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_12, grammarAccess.getNonFeatureClassMemberAccess().getSemicolonKeyword_2_2_3());
                    				

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
    // InternalAlf.g:1790:1: entryRuleFeatureClassMember returns [EObject current=null] : iv_ruleFeatureClassMember= ruleFeatureClassMember EOF ;
    public final EObject entryRuleFeatureClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureClassMember = null;


        try {
            // InternalAlf.g:1790:59: (iv_ruleFeatureClassMember= ruleFeatureClassMember EOF )
            // InternalAlf.g:1791:2: iv_ruleFeatureClassMember= ruleFeatureClassMember EOF
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
    // InternalAlf.g:1797:1: ruleFeatureClassMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) ) ;
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
            // InternalAlf.g:1803:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) ) )
            // InternalAlf.g:1804:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) )
            {
            // InternalAlf.g:1804:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) ) )
            // InternalAlf.g:1805:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) )
            {
            // InternalAlf.g:1805:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalAlf.g:1806:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:1806:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:1807:5: lv_ownedElement_0_0= ruleComment
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
            	    break loop43;
                }
            } while (true);

            // InternalAlf.g:1824:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=55 && LA44_0<=58)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAlf.g:1825:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:1825:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:1826:5: lv_visibility_1_0= ruleVisibilityIndicator
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

            // InternalAlf.g:1843:3: ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) )
            int alt52=4;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // InternalAlf.g:1844:4: ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1844:4: ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:1845:5: (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1845:5: (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )?
                    int alt45=4;
                    switch ( input.LA(1) ) {
                        case 27:
                            {
                            alt45=1;
                            }
                            break;
                        case 31:
                            {
                            alt45=2;
                            }
                            break;
                        case 32:
                            {
                            alt45=3;
                            }
                            break;
                    }

                    switch (alt45) {
                        case 1 :
                            // InternalAlf.g:1846:6: otherlv_2= 'feature'
                            {
                            otherlv_2=(Token)match(input,27,FOLLOW_31); 

                            						newLeafNode(otherlv_2, grammarAccess.getFeatureClassMemberAccess().getFeatureKeyword_2_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1851:6: ( (lv_isComposite_3_0= 'part' ) )
                            {
                            // InternalAlf.g:1851:6: ( (lv_isComposite_3_0= 'part' ) )
                            // InternalAlf.g:1852:7: (lv_isComposite_3_0= 'part' )
                            {
                            // InternalAlf.g:1852:7: (lv_isComposite_3_0= 'part' )
                            // InternalAlf.g:1853:8: lv_isComposite_3_0= 'part'
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
                            // InternalAlf.g:1866:6: ( (lv_isPort_4_0= 'port' ) )
                            {
                            // InternalAlf.g:1866:6: ( (lv_isPort_4_0= 'port' ) )
                            // InternalAlf.g:1867:7: (lv_isPort_4_0= 'port' )
                            {
                            // InternalAlf.g:1867:7: (lv_isPort_4_0= 'port' )
                            // InternalAlf.g:1868:8: lv_isPort_4_0= 'port'
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

                    // InternalAlf.g:1881:5: ( (lv_direction_5_0= ruleFeatureDirection ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( ((LA46_0>=59 && LA46_0<=61)) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalAlf.g:1882:6: (lv_direction_5_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1882:6: (lv_direction_5_0= ruleFeatureDirection )
                            // InternalAlf.g:1883:7: lv_direction_5_0= ruleFeatureDirection
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

                    // InternalAlf.g:1900:5: ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:1901:6: (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:1901:6: (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:1902:7: lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:1921:4: ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:1921:4: ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:1922:5: (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:1922:5: (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) )
                    int alt47=3;
                    switch ( input.LA(1) ) {
                    case 27:
                        {
                        alt47=1;
                        }
                        break;
                    case 31:
                        {
                        alt47=2;
                        }
                        break;
                    case 32:
                        {
                        alt47=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }

                    switch (alt47) {
                        case 1 :
                            // InternalAlf.g:1923:6: otherlv_7= 'feature'
                            {
                            otherlv_7=(Token)match(input,27,FOLLOW_32); 

                            						newLeafNode(otherlv_7, grammarAccess.getFeatureClassMemberAccess().getFeatureKeyword_2_1_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:1928:6: ( (lv_isComposite_8_0= 'part' ) )
                            {
                            // InternalAlf.g:1928:6: ( (lv_isComposite_8_0= 'part' ) )
                            // InternalAlf.g:1929:7: (lv_isComposite_8_0= 'part' )
                            {
                            // InternalAlf.g:1929:7: (lv_isComposite_8_0= 'part' )
                            // InternalAlf.g:1930:8: lv_isComposite_8_0= 'part'
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
                            // InternalAlf.g:1943:6: ( (lv_isPort_9_0= 'port' ) )
                            {
                            // InternalAlf.g:1943:6: ( (lv_isPort_9_0= 'port' ) )
                            // InternalAlf.g:1944:7: (lv_isPort_9_0= 'port' )
                            {
                            // InternalAlf.g:1944:7: (lv_isPort_9_0= 'port' )
                            // InternalAlf.g:1945:8: lv_isPort_9_0= 'port'
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

                    // InternalAlf.g:1958:5: ( (lv_direction_10_0= ruleFeatureDirection ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( ((LA48_0>=59 && LA48_0<=61)) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalAlf.g:1959:6: (lv_direction_10_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:1959:6: (lv_direction_10_0= ruleFeatureDirection )
                            // InternalAlf.g:1960:7: lv_direction_10_0= ruleFeatureDirection
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

                    // InternalAlf.g:1977:5: ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:1978:6: (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:1978:6: (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:1979:7: lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition
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
                    // InternalAlf.g:1998:4: (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) )
                    {
                    // InternalAlf.g:1998:4: (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) )
                    // InternalAlf.g:1999:5: otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) )
                    {
                    otherlv_12=(Token)match(input,33,FOLLOW_33); 

                    					newLeafNode(otherlv_12, grammarAccess.getFeatureClassMemberAccess().getConnectorKeyword_2_2_0());
                    				
                    // InternalAlf.g:2003:5: ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) )
                    // InternalAlf.g:2004:6: (lv_ownedMemberElement_13_0= ruleConnectorDefinition )
                    {
                    // InternalAlf.g:2004:6: (lv_ownedMemberElement_13_0= ruleConnectorDefinition )
                    // InternalAlf.g:2005:7: lv_ownedMemberElement_13_0= ruleConnectorDefinition
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
                    // InternalAlf.g:2024:4: ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' )
                    {
                    // InternalAlf.g:2024:4: ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' )
                    // InternalAlf.g:2025:5: ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';'
                    {
                    // InternalAlf.g:2025:5: ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==27||LA51_0==31) ) {
                        alt51=1;
                    }
                    else if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalAlf.g:2026:6: ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? )
                            {
                            // InternalAlf.g:2026:6: ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? )
                            // InternalAlf.g:2027:7: (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )?
                            {
                            // InternalAlf.g:2027:7: (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) )
                            int alt49=2;
                            int LA49_0 = input.LA(1);

                            if ( (LA49_0==27) ) {
                                alt49=1;
                            }
                            else if ( (LA49_0==31) ) {
                                alt49=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 49, 0, input);

                                throw nvae;
                            }
                            switch (alt49) {
                                case 1 :
                                    // InternalAlf.g:2028:8: otherlv_14= 'feature'
                                    {
                                    otherlv_14=(Token)match(input,27,FOLLOW_17); 

                                    								newLeafNode(otherlv_14, grammarAccess.getFeatureClassMemberAccess().getFeatureKeyword_2_3_0_0_0_0());
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:2033:8: ( (lv_isComposite_15_0= 'part' ) )
                                    {
                                    // InternalAlf.g:2033:8: ( (lv_isComposite_15_0= 'part' ) )
                                    // InternalAlf.g:2034:9: (lv_isComposite_15_0= 'part' )
                                    {
                                    // InternalAlf.g:2034:9: (lv_isComposite_15_0= 'part' )
                                    // InternalAlf.g:2035:10: lv_isComposite_15_0= 'part'
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

                            // InternalAlf.g:2048:7: ( (lv_memberName_16_0= ruleName ) )?
                            int alt50=2;
                            int LA50_0 = input.LA(1);

                            if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt50=1;
                            }
                            switch (alt50) {
                                case 1 :
                                    // InternalAlf.g:2049:8: (lv_memberName_16_0= ruleName )
                                    {
                                    // InternalAlf.g:2049:8: (lv_memberName_16_0= ruleName )
                                    // InternalAlf.g:2050:9: lv_memberName_16_0= ruleName
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
                            // InternalAlf.g:2069:6: ( (lv_memberName_17_0= ruleName ) )
                            {
                            // InternalAlf.g:2069:6: ( (lv_memberName_17_0= ruleName ) )
                            // InternalAlf.g:2070:7: (lv_memberName_17_0= ruleName )
                            {
                            // InternalAlf.g:2070:7: (lv_memberName_17_0= ruleName )
                            // InternalAlf.g:2071:8: lv_memberName_17_0= ruleName
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
                    				
                    // InternalAlf.g:2093:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:2094:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:2094:6: ( ruleQualifiedName )
                    // InternalAlf.g:2095:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFeatureClassMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getFeatureClassMemberAccess().getMemberElementElementCrossReference_2_3_2_0());
                    						
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
    // InternalAlf.g:2119:1: entryRuleAssociationUnitDefinition returns [EObject current=null] : iv_ruleAssociationUnitDefinition= ruleAssociationUnitDefinition EOF ;
    public final EObject entryRuleAssociationUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationUnitDefinition = null;


        try {
            // InternalAlf.g:2119:66: (iv_ruleAssociationUnitDefinition= ruleAssociationUnitDefinition EOF )
            // InternalAlf.g:2120:2: iv_ruleAssociationUnitDefinition= ruleAssociationUnitDefinition EOF
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
    // InternalAlf.g:2126:1: ruleAssociationUnitDefinition returns [EObject current=null] : ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ( (lv_isAbstract_3_0= 'abstract' ) )? otherlv_4= 'assoc' ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )? otherlv_11= '{' ( ( (lv_ownedMembership_12_0= ruleAssociationMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )* otherlv_14= '}' ) ;
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
            // InternalAlf.g:2132:2: ( ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ( (lv_isAbstract_3_0= 'abstract' ) )? otherlv_4= 'assoc' ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )? otherlv_11= '{' ( ( (lv_ownedMembership_12_0= ruleAssociationMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )* otherlv_14= '}' ) )
            // InternalAlf.g:2133:2: ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ( (lv_isAbstract_3_0= 'abstract' ) )? otherlv_4= 'assoc' ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )? otherlv_11= '{' ( ( (lv_ownedMembership_12_0= ruleAssociationMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )* otherlv_14= '}' )
            {
            // InternalAlf.g:2133:2: ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ( (lv_isAbstract_3_0= 'abstract' ) )? otherlv_4= 'assoc' ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )? otherlv_11= '{' ( ( (lv_ownedMembership_12_0= ruleAssociationMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )* otherlv_14= '}' )
            // InternalAlf.g:2134:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )* ( (lv_isAbstract_3_0= 'abstract' ) )? otherlv_4= 'assoc' ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )? otherlv_11= '{' ( ( (lv_ownedMembership_12_0= ruleAssociationMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )* otherlv_14= '}'
            {
            // InternalAlf.g:2134:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )*
            loop53:
            do {
                int alt53=3;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // InternalAlf.g:2135:4: ( (lv_ownedImport_0_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:2135:4: ( (lv_ownedImport_0_0= rulePackageImport ) )
            	    // InternalAlf.g:2136:5: (lv_ownedImport_0_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:2136:5: (lv_ownedImport_0_0= rulePackageImport )
            	    // InternalAlf.g:2137:6: lv_ownedImport_0_0= rulePackageImport
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
            	    // InternalAlf.g:2155:4: ( (lv_ownedMembership_1_0= ruleElementImport ) )
            	    {
            	    // InternalAlf.g:2155:4: ( (lv_ownedMembership_1_0= ruleElementImport ) )
            	    // InternalAlf.g:2156:5: (lv_ownedMembership_1_0= ruleElementImport )
            	    {
            	    // InternalAlf.g:2156:5: (lv_ownedMembership_1_0= ruleElementImport )
            	    // InternalAlf.g:2157:6: lv_ownedMembership_1_0= ruleElementImport
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
            	    break loop53;
                }
            } while (true);

            // InternalAlf.g:2175:3: ( (lv_ownedElement_2_0= ruleComment ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalAlf.g:2176:4: (lv_ownedElement_2_0= ruleComment )
            	    {
            	    // InternalAlf.g:2176:4: (lv_ownedElement_2_0= ruleComment )
            	    // InternalAlf.g:2177:5: lv_ownedElement_2_0= ruleComment
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
            	    break loop54;
                }
            } while (true);

            // InternalAlf.g:2194:3: ( (lv_isAbstract_3_0= 'abstract' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==28) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalAlf.g:2195:4: (lv_isAbstract_3_0= 'abstract' )
                    {
                    // InternalAlf.g:2195:4: (lv_isAbstract_3_0= 'abstract' )
                    // InternalAlf.g:2196:5: lv_isAbstract_3_0= 'abstract'
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
            		
            // InternalAlf.g:2212:3: ( (lv_name_5_0= ruleName ) )
            // InternalAlf.g:2213:4: (lv_name_5_0= ruleName )
            {
            // InternalAlf.g:2213:4: (lv_name_5_0= ruleName )
            // InternalAlf.g:2214:5: lv_name_5_0= ruleName
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

            // InternalAlf.g:2231:3: ( (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==24||LA58_0==29) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAlf.g:2232:4: (otherlv_6= 'is' | otherlv_7= 'specializes' ) ( (lv_ownedElement_8_0= ruleGeneralization ) ) (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )*
                    {
                    // InternalAlf.g:2232:4: (otherlv_6= 'is' | otherlv_7= 'specializes' )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==24) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==29) ) {
                        alt56=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalAlf.g:2233:5: otherlv_6= 'is'
                            {
                            otherlv_6=(Token)match(input,24,FOLLOW_4); 

                            					newLeafNode(otherlv_6, grammarAccess.getAssociationUnitDefinitionAccess().getIsKeyword_5_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2238:5: otherlv_7= 'specializes'
                            {
                            otherlv_7=(Token)match(input,29,FOLLOW_4); 

                            					newLeafNode(otherlv_7, grammarAccess.getAssociationUnitDefinitionAccess().getSpecializesKeyword_5_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:2243:4: ( (lv_ownedElement_8_0= ruleGeneralization ) )
                    // InternalAlf.g:2244:5: (lv_ownedElement_8_0= ruleGeneralization )
                    {
                    // InternalAlf.g:2244:5: (lv_ownedElement_8_0= ruleGeneralization )
                    // InternalAlf.g:2245:6: lv_ownedElement_8_0= ruleGeneralization
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

                    // InternalAlf.g:2262:4: (otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==30) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalAlf.g:2263:5: otherlv_9= ',' ( (lv_ownedElement_10_0= ruleGeneralization ) )
                    	    {
                    	    otherlv_9=(Token)match(input,30,FOLLOW_4); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getAssociationUnitDefinitionAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalAlf.g:2267:5: ( (lv_ownedElement_10_0= ruleGeneralization ) )
                    	    // InternalAlf.g:2268:6: (lv_ownedElement_10_0= ruleGeneralization )
                    	    {
                    	    // InternalAlf.g:2268:6: (lv_ownedElement_10_0= ruleGeneralization )
                    	    // InternalAlf.g:2269:7: lv_ownedElement_10_0= ruleGeneralization
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
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,22,FOLLOW_37); 

            			newLeafNode(otherlv_11, grammarAccess.getAssociationUnitDefinitionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalAlf.g:2292:3: ( ( (lv_ownedMembership_12_0= ruleAssociationMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )*
            loop59:
            do {
                int alt59=3;
                alt59 = dfa59.predict(input);
                switch (alt59) {
            	case 1 :
            	    // InternalAlf.g:2293:4: ( (lv_ownedMembership_12_0= ruleAssociationMember ) )
            	    {
            	    // InternalAlf.g:2293:4: ( (lv_ownedMembership_12_0= ruleAssociationMember ) )
            	    // InternalAlf.g:2294:5: (lv_ownedMembership_12_0= ruleAssociationMember )
            	    {
            	    // InternalAlf.g:2294:5: (lv_ownedMembership_12_0= ruleAssociationMember )
            	    // InternalAlf.g:2295:6: lv_ownedMembership_12_0= ruleAssociationMember
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
            	    // InternalAlf.g:2313:4: ( (lv_ownedImport_13_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:2313:4: ( (lv_ownedImport_13_0= rulePackageImport ) )
            	    // InternalAlf.g:2314:5: (lv_ownedImport_13_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:2314:5: (lv_ownedImport_13_0= rulePackageImport )
            	    // InternalAlf.g:2315:6: lv_ownedImport_13_0= rulePackageImport
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
            	    break loop59;
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
    // InternalAlf.g:2341:1: entryRuleAssociationDefinition returns [EObject current=null] : iv_ruleAssociationDefinition= ruleAssociationDefinition EOF ;
    public final EObject entryRuleAssociationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationDefinition = null;


        try {
            // InternalAlf.g:2341:62: (iv_ruleAssociationDefinition= ruleAssociationDefinition EOF )
            // InternalAlf.g:2342:2: iv_ruleAssociationDefinition= ruleAssociationDefinition EOF
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
    // InternalAlf.g:2348:1: ruleAssociationDefinition returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? otherlv_8= '{' ( ( (lv_ownedMembership_9_0= ruleAssociationMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )* otherlv_11= '}' ) ;
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
            // InternalAlf.g:2354:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? otherlv_8= '{' ( ( (lv_ownedMembership_9_0= ruleAssociationMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )* otherlv_11= '}' ) )
            // InternalAlf.g:2355:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? otherlv_8= '{' ( ( (lv_ownedMembership_9_0= ruleAssociationMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )* otherlv_11= '}' )
            {
            // InternalAlf.g:2355:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? otherlv_8= '{' ( ( (lv_ownedMembership_9_0= ruleAssociationMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )* otherlv_11= '}' )
            // InternalAlf.g:2356:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'assoc' ( (lv_name_2_0= ruleName ) ) ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )? otherlv_8= '{' ( ( (lv_ownedMembership_9_0= ruleAssociationMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )* otherlv_11= '}'
            {
            // InternalAlf.g:2356:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==28) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalAlf.g:2357:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalAlf.g:2357:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalAlf.g:2358:5: lv_isAbstract_0_0= 'abstract'
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
            		
            // InternalAlf.g:2374:3: ( (lv_name_2_0= ruleName ) )
            // InternalAlf.g:2375:4: (lv_name_2_0= ruleName )
            {
            // InternalAlf.g:2375:4: (lv_name_2_0= ruleName )
            // InternalAlf.g:2376:5: lv_name_2_0= ruleName
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

            // InternalAlf.g:2393:3: ( (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==24||LA63_0==29) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAlf.g:2394:4: (otherlv_3= 'is' | otherlv_4= 'specializes' ) ( (lv_ownedElement_5_0= ruleGeneralization ) ) (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )*
                    {
                    // InternalAlf.g:2394:4: (otherlv_3= 'is' | otherlv_4= 'specializes' )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==24) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==29) ) {
                        alt61=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalAlf.g:2395:5: otherlv_3= 'is'
                            {
                            otherlv_3=(Token)match(input,24,FOLLOW_4); 

                            					newLeafNode(otherlv_3, grammarAccess.getAssociationDefinitionAccess().getIsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2400:5: otherlv_4= 'specializes'
                            {
                            otherlv_4=(Token)match(input,29,FOLLOW_4); 

                            					newLeafNode(otherlv_4, grammarAccess.getAssociationDefinitionAccess().getSpecializesKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:2405:4: ( (lv_ownedElement_5_0= ruleGeneralization ) )
                    // InternalAlf.g:2406:5: (lv_ownedElement_5_0= ruleGeneralization )
                    {
                    // InternalAlf.g:2406:5: (lv_ownedElement_5_0= ruleGeneralization )
                    // InternalAlf.g:2407:6: lv_ownedElement_5_0= ruleGeneralization
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

                    // InternalAlf.g:2424:4: (otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==30) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalAlf.g:2425:5: otherlv_6= ',' ( (lv_ownedElement_7_0= ruleGeneralization ) )
                    	    {
                    	    otherlv_6=(Token)match(input,30,FOLLOW_4); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAssociationDefinitionAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAlf.g:2429:5: ( (lv_ownedElement_7_0= ruleGeneralization ) )
                    	    // InternalAlf.g:2430:6: (lv_ownedElement_7_0= ruleGeneralization )
                    	    {
                    	    // InternalAlf.g:2430:6: (lv_ownedElement_7_0= ruleGeneralization )
                    	    // InternalAlf.g:2431:7: lv_ownedElement_7_0= ruleGeneralization
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
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_37); 

            			newLeafNode(otherlv_8, grammarAccess.getAssociationDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalAlf.g:2454:3: ( ( (lv_ownedMembership_9_0= ruleAssociationMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )*
            loop64:
            do {
                int alt64=3;
                alt64 = dfa64.predict(input);
                switch (alt64) {
            	case 1 :
            	    // InternalAlf.g:2455:4: ( (lv_ownedMembership_9_0= ruleAssociationMember ) )
            	    {
            	    // InternalAlf.g:2455:4: ( (lv_ownedMembership_9_0= ruleAssociationMember ) )
            	    // InternalAlf.g:2456:5: (lv_ownedMembership_9_0= ruleAssociationMember )
            	    {
            	    // InternalAlf.g:2456:5: (lv_ownedMembership_9_0= ruleAssociationMember )
            	    // InternalAlf.g:2457:6: lv_ownedMembership_9_0= ruleAssociationMember
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
            	    // InternalAlf.g:2475:4: ( (lv_ownedImport_10_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:2475:4: ( (lv_ownedImport_10_0= rulePackageImport ) )
            	    // InternalAlf.g:2476:5: (lv_ownedImport_10_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:2476:5: (lv_ownedImport_10_0= rulePackageImport )
            	    // InternalAlf.g:2477:6: lv_ownedImport_10_0= rulePackageImport
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
            	    break loop64;
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
    // InternalAlf.g:2510:1: ruleAssociationDefinitionOrStub returns [EObject current=null] : this_AssociationDefinition_0= ruleAssociationDefinition ;
    public final EObject ruleAssociationDefinitionOrStub() throws RecognitionException {
        EObject current = null;

        EObject this_AssociationDefinition_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:2516:2: (this_AssociationDefinition_0= ruleAssociationDefinition )
            // InternalAlf.g:2517:2: this_AssociationDefinition_0= ruleAssociationDefinition
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
    // InternalAlf.g:2528:1: entryRuleAssociationMember returns [EObject current=null] : iv_ruleAssociationMember= ruleAssociationMember EOF ;
    public final EObject entryRuleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationMember = null;


        try {
            // InternalAlf.g:2528:58: (iv_ruleAssociationMember= ruleAssociationMember EOF )
            // InternalAlf.g:2529:2: iv_ruleAssociationMember= ruleAssociationMember EOF
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
    // InternalAlf.g:2535:1: ruleAssociationMember returns [EObject current=null] : (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember ) ;
    public final EObject ruleAssociationMember() throws RecognitionException {
        EObject current = null;

        EObject this_NonFeatureClassMember_0 = null;

        EObject this_AssociationFeatureMember_1 = null;

        EObject this_AssociationEndFeatureMember_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:2541:2: ( (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember ) )
            // InternalAlf.g:2542:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )
            {
            // InternalAlf.g:2542:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )
            int alt65=3;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // InternalAlf.g:2543:3: this_NonFeatureClassMember_0= ruleNonFeatureClassMember
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
                    // InternalAlf.g:2552:3: this_AssociationFeatureMember_1= ruleAssociationFeatureMember
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
                    // InternalAlf.g:2561:3: this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember
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
    // InternalAlf.g:2573:1: entryRuleAssociationFeatureMember returns [EObject current=null] : iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF ;
    public final EObject entryRuleAssociationFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationFeatureMember = null;


        try {
            // InternalAlf.g:2573:65: (iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF )
            // InternalAlf.g:2574:2: iv_ruleAssociationFeatureMember= ruleAssociationFeatureMember EOF
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
    // InternalAlf.g:2580:1: ruleAssociationFeatureMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) ) ;
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
            // InternalAlf.g:2586:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) ) )
            // InternalAlf.g:2587:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) )
            {
            // InternalAlf.g:2587:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) ) )
            // InternalAlf.g:2588:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) )
            {
            // InternalAlf.g:2588:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalAlf.g:2589:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:2589:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:2590:5: lv_ownedElement_0_0= ruleComment
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
            	    break loop66;
                }
            } while (true);

            // InternalAlf.g:2607:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=55 && LA67_0<=58)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalAlf.g:2608:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:2608:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:2609:5: lv_visibility_1_0= ruleVisibilityIndicator
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

            // InternalAlf.g:2626:3: ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) )
            int alt72=3;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // InternalAlf.g:2627:4: ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2627:4: ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) )
                    // InternalAlf.g:2628:5: (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) )
                    {
                    // InternalAlf.g:2628:5: (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )
                    int alt68=3;
                    switch ( input.LA(1) ) {
                    case 27:
                        {
                        alt68=1;
                        }
                        break;
                    case 31:
                        {
                        alt68=2;
                        }
                        break;
                    case 32:
                        {
                        alt68=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }

                    switch (alt68) {
                        case 1 :
                            // InternalAlf.g:2629:6: otherlv_2= 'feature'
                            {
                            otherlv_2=(Token)match(input,27,FOLLOW_40); 

                            						newLeafNode(otherlv_2, grammarAccess.getAssociationFeatureMemberAccess().getFeatureKeyword_2_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2634:6: ( (lv_isComposite_3_0= 'part' ) )
                            {
                            // InternalAlf.g:2634:6: ( (lv_isComposite_3_0= 'part' ) )
                            // InternalAlf.g:2635:7: (lv_isComposite_3_0= 'part' )
                            {
                            // InternalAlf.g:2635:7: (lv_isComposite_3_0= 'part' )
                            // InternalAlf.g:2636:8: lv_isComposite_3_0= 'part'
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
                            // InternalAlf.g:2649:6: ( (lv_isPort_4_0= 'port' ) )
                            {
                            // InternalAlf.g:2649:6: ( (lv_isPort_4_0= 'port' ) )
                            // InternalAlf.g:2650:7: (lv_isPort_4_0= 'port' )
                            {
                            // InternalAlf.g:2650:7: (lv_isPort_4_0= 'port' )
                            // InternalAlf.g:2651:8: lv_isPort_4_0= 'port'
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

                    // InternalAlf.g:2664:5: ( (lv_direction_5_0= ruleFeatureDirection ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( ((LA69_0>=59 && LA69_0<=61)) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalAlf.g:2665:6: (lv_direction_5_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2665:6: (lv_direction_5_0= ruleFeatureDirection )
                            // InternalAlf.g:2666:7: lv_direction_5_0= ruleFeatureDirection
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

                    // InternalAlf.g:2683:5: ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) )
                    // InternalAlf.g:2684:6: (lv_ownedMemberElement_6_0= ruleFeatureDefinition )
                    {
                    // InternalAlf.g:2684:6: (lv_ownedMemberElement_6_0= ruleFeatureDefinition )
                    // InternalAlf.g:2685:7: lv_ownedMemberElement_6_0= ruleFeatureDefinition
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
                    // InternalAlf.g:2704:4: (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) )
                    {
                    // InternalAlf.g:2704:4: (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) )
                    // InternalAlf.g:2705:5: otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_33); 

                    					newLeafNode(otherlv_7, grammarAccess.getAssociationFeatureMemberAccess().getConnectorKeyword_2_1_0());
                    				
                    // InternalAlf.g:2709:5: ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) )
                    // InternalAlf.g:2710:6: (lv_ownedMemberElement_8_0= ruleConnectorDefinition )
                    {
                    // InternalAlf.g:2710:6: (lv_ownedMemberElement_8_0= ruleConnectorDefinition )
                    // InternalAlf.g:2711:7: lv_ownedMemberElement_8_0= ruleConnectorDefinition
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
                    // InternalAlf.g:2730:4: ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' )
                    {
                    // InternalAlf.g:2730:4: ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' )
                    // InternalAlf.g:2731:5: (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';'
                    {
                    // InternalAlf.g:2731:5: (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) )
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==27) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==31) ) {
                        alt70=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 0, input);

                        throw nvae;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalAlf.g:2732:6: otherlv_9= 'feature'
                            {
                            otherlv_9=(Token)match(input,27,FOLLOW_17); 

                            						newLeafNode(otherlv_9, grammarAccess.getAssociationFeatureMemberAccess().getFeatureKeyword_2_2_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:2737:6: ( (lv_isComposite_10_0= 'part' ) )
                            {
                            // InternalAlf.g:2737:6: ( (lv_isComposite_10_0= 'part' ) )
                            // InternalAlf.g:2738:7: (lv_isComposite_10_0= 'part' )
                            {
                            // InternalAlf.g:2738:7: (lv_isComposite_10_0= 'part' )
                            // InternalAlf.g:2739:8: lv_isComposite_10_0= 'part'
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

                    // InternalAlf.g:2752:5: ( (lv_memberName_11_0= ruleName ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( ((LA71_0>=RULE_ID && LA71_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalAlf.g:2753:6: (lv_memberName_11_0= ruleName )
                            {
                            // InternalAlf.g:2753:6: (lv_memberName_11_0= ruleName )
                            // InternalAlf.g:2754:7: lv_memberName_11_0= ruleName
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
                    				
                    // InternalAlf.g:2775:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:2776:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:2776:6: ( ruleQualifiedName )
                    // InternalAlf.g:2777:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssociationFeatureMemberAccess().getMemberElementElementCrossReference_2_2_3_0());
                    						
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
    // InternalAlf.g:2801:1: entryRuleAssociationEndFeatureMember returns [EObject current=null] : iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF ;
    public final EObject entryRuleAssociationEndFeatureMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEndFeatureMember = null;


        try {
            // InternalAlf.g:2801:68: (iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF )
            // InternalAlf.g:2802:2: iv_ruleAssociationEndFeatureMember= ruleAssociationEndFeatureMember EOF
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
    // InternalAlf.g:2808:1: ruleAssociationEndFeatureMember returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) ) ;
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
            // InternalAlf.g:2814:2: ( ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) ) )
            // InternalAlf.g:2815:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) )
            {
            // InternalAlf.g:2815:2: ( ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) ) )
            // InternalAlf.g:2816:3: ( (lv_ownedElement_0_0= ruleComment ) )* ( (lv_visibility_1_0= ruleVisibilityIndicator ) )? ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) )
            {
            // InternalAlf.g:2816:3: ( (lv_ownedElement_0_0= ruleComment ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalAlf.g:2817:4: (lv_ownedElement_0_0= ruleComment )
            	    {
            	    // InternalAlf.g:2817:4: (lv_ownedElement_0_0= ruleComment )
            	    // InternalAlf.g:2818:5: lv_ownedElement_0_0= ruleComment
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
            	    break loop73;
                }
            } while (true);

            // InternalAlf.g:2835:3: ( (lv_visibility_1_0= ruleVisibilityIndicator ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=55 && LA74_0<=58)) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalAlf.g:2836:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    {
                    // InternalAlf.g:2836:4: (lv_visibility_1_0= ruleVisibilityIndicator )
                    // InternalAlf.g:2837:5: lv_visibility_1_0= ruleVisibilityIndicator
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

            // InternalAlf.g:2854:3: ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) )
            int alt80=3;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // InternalAlf.g:2855:4: ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2855:4: ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) )
                    // InternalAlf.g:2856:5: (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) )
                    {
                    // InternalAlf.g:2856:5: (otherlv_2= 'end' )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==34) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalAlf.g:2857:6: otherlv_2= 'end'
                            {
                            otherlv_2=(Token)match(input,34,FOLLOW_31); 

                            						newLeafNode(otherlv_2, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_2_0_0());
                            					

                            }
                            break;

                    }

                    // InternalAlf.g:2862:5: ( (lv_direction_3_0= ruleFeatureDirection ) )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( ((LA76_0>=59 && LA76_0<=61)) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // InternalAlf.g:2863:6: (lv_direction_3_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2863:6: (lv_direction_3_0= ruleFeatureDirection )
                            // InternalAlf.g:2864:7: lv_direction_3_0= ruleFeatureDirection
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

                    // InternalAlf.g:2881:5: ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) )
                    // InternalAlf.g:2882:6: (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition )
                    {
                    // InternalAlf.g:2882:6: (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition )
                    // InternalAlf.g:2883:7: lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:2902:4: (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) )
                    {
                    // InternalAlf.g:2902:4: (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) )
                    // InternalAlf.g:2903:5: otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_32); 

                    					newLeafNode(otherlv_5, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_2_1_0());
                    				
                    // InternalAlf.g:2907:5: ( (lv_direction_6_0= ruleFeatureDirection ) )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( ((LA77_0>=59 && LA77_0<=61)) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // InternalAlf.g:2908:6: (lv_direction_6_0= ruleFeatureDirection )
                            {
                            // InternalAlf.g:2908:6: (lv_direction_6_0= ruleFeatureDirection )
                            // InternalAlf.g:2909:7: lv_direction_6_0= ruleFeatureDirection
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

                    // InternalAlf.g:2926:5: ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) )
                    // InternalAlf.g:2927:6: (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition )
                    {
                    // InternalAlf.g:2927:6: (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition )
                    // InternalAlf.g:2928:7: lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition
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
                    // InternalAlf.g:2947:4: ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' )
                    {
                    // InternalAlf.g:2947:4: ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' )
                    // InternalAlf.g:2948:5: ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';'
                    {
                    // InternalAlf.g:2948:5: ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) )
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==34) ) {
                        alt79=1;
                    }
                    else if ( ((LA79_0>=RULE_ID && LA79_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt79=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalAlf.g:2949:6: (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? )
                            {
                            // InternalAlf.g:2949:6: (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? )
                            // InternalAlf.g:2950:7: otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )?
                            {
                            otherlv_8=(Token)match(input,34,FOLLOW_17); 

                            							newLeafNode(otherlv_8, grammarAccess.getAssociationEndFeatureMemberAccess().getEndKeyword_2_2_0_0_0());
                            						
                            // InternalAlf.g:2954:7: ( (lv_memberName_9_0= ruleName ) )?
                            int alt78=2;
                            int LA78_0 = input.LA(1);

                            if ( ((LA78_0>=RULE_ID && LA78_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt78=1;
                            }
                            switch (alt78) {
                                case 1 :
                                    // InternalAlf.g:2955:8: (lv_memberName_9_0= ruleName )
                                    {
                                    // InternalAlf.g:2955:8: (lv_memberName_9_0= ruleName )
                                    // InternalAlf.g:2956:9: lv_memberName_9_0= ruleName
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
                            // InternalAlf.g:2975:6: ( (lv_memberName_10_0= ruleName ) )
                            {
                            // InternalAlf.g:2975:6: ( (lv_memberName_10_0= ruleName ) )
                            // InternalAlf.g:2976:7: (lv_memberName_10_0= ruleName )
                            {
                            // InternalAlf.g:2976:7: (lv_memberName_10_0= ruleName )
                            // InternalAlf.g:2977:8: lv_memberName_10_0= ruleName
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
                    				
                    // InternalAlf.g:2999:5: ( ( ruleQualifiedName ) )
                    // InternalAlf.g:3000:6: ( ruleQualifiedName )
                    {
                    // InternalAlf.g:3000:6: ( ruleQualifiedName )
                    // InternalAlf.g:3001:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssociationEndFeatureMemberRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAssociationEndFeatureMemberAccess().getMemberElementElementCrossReference_2_2_2_0());
                    						
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
    // InternalAlf.g:3025:1: entryRuleFeatureUnitDefinition returns [EObject current=null] : iv_ruleFeatureUnitDefinition= ruleFeatureUnitDefinition EOF ;
    public final EObject entryRuleFeatureUnitDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureUnitDefinition = null;


        try {
            // InternalAlf.g:3025:62: (iv_ruleFeatureUnitDefinition= ruleFeatureUnitDefinition EOF )
            // InternalAlf.g:3026:2: iv_ruleFeatureUnitDefinition= ruleFeatureUnitDefinition EOF
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
    // InternalAlf.g:3032:1: ruleFeatureUnitDefinition returns [EObject current=null] : ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )+ otherlv_3= 'feature' ( (lv_name_4_0= ruleName ) ) ( ( (otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )? ) | ( (lv_ownedElement_9_0= ruleSubsetOrRedefinition ) ) ) (otherlv_10= '[' ( ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..' )? ( (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_14= ']' )? otherlv_15= '{' ( ( (lv_ownedMembership_16_0= ruleClassMember ) ) | ( (lv_ownedImport_17_0= rulePackageImport ) ) )* otherlv_18= '}' ) ) ;
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
            // InternalAlf.g:3038:2: ( ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )+ otherlv_3= 'feature' ( (lv_name_4_0= ruleName ) ) ( ( (otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )? ) | ( (lv_ownedElement_9_0= ruleSubsetOrRedefinition ) ) ) (otherlv_10= '[' ( ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..' )? ( (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_14= ']' )? otherlv_15= '{' ( ( (lv_ownedMembership_16_0= ruleClassMember ) ) | ( (lv_ownedImport_17_0= rulePackageImport ) ) )* otherlv_18= '}' ) ) )
            // InternalAlf.g:3039:2: ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )+ otherlv_3= 'feature' ( (lv_name_4_0= ruleName ) ) ( ( (otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )? ) | ( (lv_ownedElement_9_0= ruleSubsetOrRedefinition ) ) ) (otherlv_10= '[' ( ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..' )? ( (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_14= ']' )? otherlv_15= '{' ( ( (lv_ownedMembership_16_0= ruleClassMember ) ) | ( (lv_ownedImport_17_0= rulePackageImport ) ) )* otherlv_18= '}' ) )
            {
            // InternalAlf.g:3039:2: ( ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )+ otherlv_3= 'feature' ( (lv_name_4_0= ruleName ) ) ( ( (otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )? ) | ( (lv_ownedElement_9_0= ruleSubsetOrRedefinition ) ) ) (otherlv_10= '[' ( ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..' )? ( (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_14= ']' )? otherlv_15= '{' ( ( (lv_ownedMembership_16_0= ruleClassMember ) ) | ( (lv_ownedImport_17_0= rulePackageImport ) ) )* otherlv_18= '}' ) )
            // InternalAlf.g:3040:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )* ( (lv_ownedElement_2_0= ruleComment ) )+ otherlv_3= 'feature' ( (lv_name_4_0= ruleName ) ) ( ( (otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )? ) | ( (lv_ownedElement_9_0= ruleSubsetOrRedefinition ) ) ) (otherlv_10= '[' ( ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..' )? ( (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_14= ']' )? otherlv_15= '{' ( ( (lv_ownedMembership_16_0= ruleClassMember ) ) | ( (lv_ownedImport_17_0= rulePackageImport ) ) )* otherlv_18= '}' )
            {
            // InternalAlf.g:3040:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )*
            loop81:
            do {
                int alt81=3;
                alt81 = dfa81.predict(input);
                switch (alt81) {
            	case 1 :
            	    // InternalAlf.g:3041:4: ( (lv_ownedImport_0_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:3041:4: ( (lv_ownedImport_0_0= rulePackageImport ) )
            	    // InternalAlf.g:3042:5: (lv_ownedImport_0_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:3042:5: (lv_ownedImport_0_0= rulePackageImport )
            	    // InternalAlf.g:3043:6: lv_ownedImport_0_0= rulePackageImport
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
            	    // InternalAlf.g:3061:4: ( (lv_ownedMembership_1_0= ruleElementImport ) )
            	    {
            	    // InternalAlf.g:3061:4: ( (lv_ownedMembership_1_0= ruleElementImport ) )
            	    // InternalAlf.g:3062:5: (lv_ownedMembership_1_0= ruleElementImport )
            	    {
            	    // InternalAlf.g:3062:5: (lv_ownedMembership_1_0= ruleElementImport )
            	    // InternalAlf.g:3063:6: lv_ownedMembership_1_0= ruleElementImport
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
            	    break loop81;
                }
            } while (true);

            // InternalAlf.g:3081:3: ( (lv_ownedElement_2_0= ruleComment ) )+
            int cnt82=0;
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==RULE_DOCUMENTATION_COMMENT) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalAlf.g:3082:4: (lv_ownedElement_2_0= ruleComment )
            	    {
            	    // InternalAlf.g:3082:4: (lv_ownedElement_2_0= ruleComment )
            	    // InternalAlf.g:3083:5: lv_ownedElement_2_0= ruleComment
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
            	    if ( cnt82 >= 1 ) break loop82;
                        EarlyExitException eee =
                            new EarlyExitException(82, input);
                        throw eee;
                }
                cnt82++;
            } while (true);

            otherlv_3=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getFeatureUnitDefinitionAccess().getFeatureKeyword_2());
            		
            // InternalAlf.g:3104:3: ( (lv_name_4_0= ruleName ) )
            // InternalAlf.g:3105:4: (lv_name_4_0= ruleName )
            {
            // InternalAlf.g:3105:4: (lv_name_4_0= ruleName )
            // InternalAlf.g:3106:5: lv_name_4_0= ruleName
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

            // InternalAlf.g:3123:3: ( ( (otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )? ) | ( (lv_ownedElement_9_0= ruleSubsetOrRedefinition ) ) ) (otherlv_10= '[' ( ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..' )? ( (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_14= ']' )? otherlv_15= '{' ( ( (lv_ownedMembership_16_0= ruleClassMember ) ) | ( (lv_ownedImport_17_0= rulePackageImport ) ) )* otherlv_18= '}' )
            // InternalAlf.g:3124:4: ( (otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )? ) | ( (lv_ownedElement_9_0= ruleSubsetOrRedefinition ) ) ) (otherlv_10= '[' ( ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..' )? ( (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_14= ']' )? otherlv_15= '{' ( ( (lv_ownedMembership_16_0= ruleClassMember ) ) | ( (lv_ownedImport_17_0= rulePackageImport ) ) )* otherlv_18= '}'
            {
            // InternalAlf.g:3124:4: ( (otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )? ) | ( (lv_ownedElement_9_0= ruleSubsetOrRedefinition ) ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==35) ) {
                alt85=1;
            }
            else if ( (LA85_0==24||(LA85_0>=42 && LA85_0<=43)) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalAlf.g:3125:5: (otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )? )
                    {
                    // InternalAlf.g:3125:5: (otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )? )
                    // InternalAlf.g:3126:6: otherlv_5= ':' ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' ) ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )?
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_45); 

                    						newLeafNode(otherlv_5, grammarAccess.getFeatureUnitDefinitionAccess().getColonKeyword_4_0_0_0());
                    					
                    // InternalAlf.g:3130:6: ( ( ( ruleQualifiedName ) ) | otherlv_7= 'any' )
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( ((LA83_0>=RULE_ID && LA83_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt83=1;
                    }
                    else if ( (LA83_0==36) ) {
                        alt83=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 0, input);

                        throw nvae;
                    }
                    switch (alt83) {
                        case 1 :
                            // InternalAlf.g:3131:7: ( ( ruleQualifiedName ) )
                            {
                            // InternalAlf.g:3131:7: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:3132:8: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:3132:8: ( ruleQualifiedName )
                            // InternalAlf.g:3133:9: ruleQualifiedName
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
                            // InternalAlf.g:3148:7: otherlv_7= 'any'
                            {
                            otherlv_7=(Token)match(input,36,FOLLOW_46); 

                            							newLeafNode(otherlv_7, grammarAccess.getFeatureUnitDefinitionAccess().getAnyKeyword_4_0_0_1_1());
                            						

                            }
                            break;

                    }

                    // InternalAlf.g:3153:6: ( (lv_ownedElement_8_0= ruleSubsetOrRedefinition ) )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==24||(LA84_0>=42 && LA84_0<=43)) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // InternalAlf.g:3154:7: (lv_ownedElement_8_0= ruleSubsetOrRedefinition )
                            {
                            // InternalAlf.g:3154:7: (lv_ownedElement_8_0= ruleSubsetOrRedefinition )
                            // InternalAlf.g:3155:8: lv_ownedElement_8_0= ruleSubsetOrRedefinition
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
                    // InternalAlf.g:3174:5: ( (lv_ownedElement_9_0= ruleSubsetOrRedefinition ) )
                    {
                    // InternalAlf.g:3174:5: ( (lv_ownedElement_9_0= ruleSubsetOrRedefinition ) )
                    // InternalAlf.g:3175:6: (lv_ownedElement_9_0= ruleSubsetOrRedefinition )
                    {
                    // InternalAlf.g:3175:6: (lv_ownedElement_9_0= ruleSubsetOrRedefinition )
                    // InternalAlf.g:3176:7: lv_ownedElement_9_0= ruleSubsetOrRedefinition
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

            // InternalAlf.g:3194:4: (otherlv_10= '[' ( ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..' )? ( (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_14= ']' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==37) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalAlf.g:3195:5: otherlv_10= '[' ( ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..' )? ( (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_14= ']'
                    {
                    otherlv_10=(Token)match(input,37,FOLLOW_48); 

                    					newLeafNode(otherlv_10, grammarAccess.getFeatureUnitDefinitionAccess().getLeftSquareBracketKeyword_4_1_0());
                    				
                    // InternalAlf.g:3199:5: ( ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..' )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==RULE_NATURAL_VALUE) ) {
                        int LA86_1 = input.LA(2);

                        if ( (LA86_1==38) ) {
                            alt86=1;
                        }
                    }
                    switch (alt86) {
                        case 1 :
                            // InternalAlf.g:3200:6: ( (lv_lower_11_0= ruleNaturalLiteralExpression ) ) otherlv_12= '..'
                            {
                            // InternalAlf.g:3200:6: ( (lv_lower_11_0= ruleNaturalLiteralExpression ) )
                            // InternalAlf.g:3201:7: (lv_lower_11_0= ruleNaturalLiteralExpression )
                            {
                            // InternalAlf.g:3201:7: (lv_lower_11_0= ruleNaturalLiteralExpression )
                            // InternalAlf.g:3202:8: lv_lower_11_0= ruleNaturalLiteralExpression
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

                    // InternalAlf.g:3224:5: ( (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression ) )
                    // InternalAlf.g:3225:6: (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression )
                    {
                    // InternalAlf.g:3225:6: (lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression )
                    // InternalAlf.g:3226:7: lv_upper_13_0= ruleUnlimitedNaturalLiteralExpression
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
            			
            // InternalAlf.g:3252:4: ( ( (lv_ownedMembership_16_0= ruleClassMember ) ) | ( (lv_ownedImport_17_0= rulePackageImport ) ) )*
            loop88:
            do {
                int alt88=3;
                alt88 = dfa88.predict(input);
                switch (alt88) {
            	case 1 :
            	    // InternalAlf.g:3253:5: ( (lv_ownedMembership_16_0= ruleClassMember ) )
            	    {
            	    // InternalAlf.g:3253:5: ( (lv_ownedMembership_16_0= ruleClassMember ) )
            	    // InternalAlf.g:3254:6: (lv_ownedMembership_16_0= ruleClassMember )
            	    {
            	    // InternalAlf.g:3254:6: (lv_ownedMembership_16_0= ruleClassMember )
            	    // InternalAlf.g:3255:7: lv_ownedMembership_16_0= ruleClassMember
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
            	    // InternalAlf.g:3273:5: ( (lv_ownedImport_17_0= rulePackageImport ) )
            	    {
            	    // InternalAlf.g:3273:5: ( (lv_ownedImport_17_0= rulePackageImport ) )
            	    // InternalAlf.g:3274:6: (lv_ownedImport_17_0= rulePackageImport )
            	    {
            	    // InternalAlf.g:3274:6: (lv_ownedImport_17_0= rulePackageImport )
            	    // InternalAlf.g:3275:7: lv_ownedImport_17_0= rulePackageImport
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
            	    break loop88;
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
    // InternalAlf.g:3302:1: entryRuleFeatureDefinition returns [EObject current=null] : iv_ruleFeatureDefinition= ruleFeatureDefinition EOF ;
    public final EObject entryRuleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureDefinition = null;


        try {
            // InternalAlf.g:3302:58: (iv_ruleFeatureDefinition= ruleFeatureDefinition EOF )
            // InternalAlf.g:3303:2: iv_ruleFeatureDefinition= ruleFeatureDefinition EOF
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
    // InternalAlf.g:3309:1: ruleFeatureDefinition returns [EObject current=null] : (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) ;
    public final EObject ruleFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_NamedFeatureDefinition_0 = null;

        EObject this_UnnamedFeatureDefinition_1 = null;



        	enterRule();

        try {
            // InternalAlf.g:3315:2: ( (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition ) )
            // InternalAlf.g:3316:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            {
            // InternalAlf.g:3316:2: (this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition | this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( ((LA89_0>=RULE_ID && LA89_0<=RULE_UNRESTRICTED_NAME)) ) {
                alt89=1;
            }
            else if ( (LA89_0==24||(LA89_0>=42 && LA89_0<=43)) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalAlf.g:3317:3: this_NamedFeatureDefinition_0= ruleNamedFeatureDefinition
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
                    // InternalAlf.g:3326:3: this_UnnamedFeatureDefinition_1= ruleUnnamedFeatureDefinition
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
    // InternalAlf.g:3338:1: entryRuleNamedFeatureDefinition returns [EObject current=null] : iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF ;
    public final EObject entryRuleNamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedFeatureDefinition = null;


        try {
            // InternalAlf.g:3338:63: (iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF )
            // InternalAlf.g:3339:2: iv_ruleNamedFeatureDefinition= ruleNamedFeatureDefinition EOF
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
    // InternalAlf.g:3345:1: ruleNamedFeatureDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' ) ) ) | ( ( (lv_ownedElement_18_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) ) | (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' ) ) ) ) ) ;
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
            // InternalAlf.g:3351:2: ( ( ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' ) ) ) | ( ( (lv_ownedElement_18_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) ) | (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' ) ) ) ) ) )
            // InternalAlf.g:3352:2: ( ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' ) ) ) | ( ( (lv_ownedElement_18_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) ) | (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' ) ) ) ) )
            {
            // InternalAlf.g:3352:2: ( ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' ) ) ) | ( ( (lv_ownedElement_18_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) ) | (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' ) ) ) ) )
            // InternalAlf.g:3353:3: ( (lv_name_0_0= ruleName ) ) ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' ) ) ) | ( ( (lv_ownedElement_18_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) ) | (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' ) ) ) )
            {
            // InternalAlf.g:3353:3: ( (lv_name_0_0= ruleName ) )
            // InternalAlf.g:3354:4: (lv_name_0_0= ruleName )
            {
            // InternalAlf.g:3354:4: (lv_name_0_0= ruleName )
            // InternalAlf.g:3355:5: lv_name_0_0= ruleName
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

            // InternalAlf.g:3372:3: ( ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' ) ) ) | ( ( (lv_ownedElement_18_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) ) | (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' ) ) ) )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==19||LA107_0==22||LA107_0==35||LA107_0==37||LA107_0==41) ) {
                alt107=1;
            }
            else if ( (LA107_0==24||(LA107_0>=42 && LA107_0<=43)) ) {
                alt107=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // InternalAlf.g:3373:4: ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' ) ) )
                    {
                    // InternalAlf.g:3373:4: ( (otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' ) ) )
                    // InternalAlf.g:3374:5: (otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )? )? (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )? (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )? (otherlv_13= ';' | (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' ) )
                    {
                    // InternalAlf.g:3374:5: (otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )? )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==35) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // InternalAlf.g:3375:6: otherlv_1= ':' ( (lv_isComposite_2_0= 'compose' ) )? ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' ) ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )?
                            {
                            otherlv_1=(Token)match(input,35,FOLLOW_52); 

                            						newLeafNode(otherlv_1, grammarAccess.getNamedFeatureDefinitionAccess().getColonKeyword_1_0_0_0());
                            					
                            // InternalAlf.g:3379:6: ( (lv_isComposite_2_0= 'compose' ) )?
                            int alt90=2;
                            int LA90_0 = input.LA(1);

                            if ( (LA90_0==40) ) {
                                alt90=1;
                            }
                            switch (alt90) {
                                case 1 :
                                    // InternalAlf.g:3380:7: (lv_isComposite_2_0= 'compose' )
                                    {
                                    // InternalAlf.g:3380:7: (lv_isComposite_2_0= 'compose' )
                                    // InternalAlf.g:3381:8: lv_isComposite_2_0= 'compose'
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

                            // InternalAlf.g:3393:6: ( ( ( ruleQualifiedName ) ) | otherlv_4= 'any' )
                            int alt91=2;
                            int LA91_0 = input.LA(1);

                            if ( ((LA91_0>=RULE_ID && LA91_0<=RULE_UNRESTRICTED_NAME)) ) {
                                alt91=1;
                            }
                            else if ( (LA91_0==36) ) {
                                alt91=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 91, 0, input);

                                throw nvae;
                            }
                            switch (alt91) {
                                case 1 :
                                    // InternalAlf.g:3394:7: ( ( ruleQualifiedName ) )
                                    {
                                    // InternalAlf.g:3394:7: ( ( ruleQualifiedName ) )
                                    // InternalAlf.g:3395:8: ( ruleQualifiedName )
                                    {
                                    // InternalAlf.g:3395:8: ( ruleQualifiedName )
                                    // InternalAlf.g:3396:9: ruleQualifiedName
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
                                    // InternalAlf.g:3411:7: otherlv_4= 'any'
                                    {
                                    otherlv_4=(Token)match(input,36,FOLLOW_53); 

                                    							newLeafNode(otherlv_4, grammarAccess.getNamedFeatureDefinitionAccess().getAnyKeyword_1_0_0_2_1());
                                    						

                                    }
                                    break;

                            }

                            // InternalAlf.g:3416:6: ( (lv_ownedElement_5_0= ruleSubsetOrRedefinition ) )?
                            int alt92=2;
                            int LA92_0 = input.LA(1);

                            if ( (LA92_0==24||(LA92_0>=42 && LA92_0<=43)) ) {
                                alt92=1;
                            }
                            switch (alt92) {
                                case 1 :
                                    // InternalAlf.g:3417:7: (lv_ownedElement_5_0= ruleSubsetOrRedefinition )
                                    {
                                    // InternalAlf.g:3417:7: (lv_ownedElement_5_0= ruleSubsetOrRedefinition )
                                    // InternalAlf.g:3418:8: lv_ownedElement_5_0= ruleSubsetOrRedefinition
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

                    // InternalAlf.g:3436:5: (otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']' )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==37) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // InternalAlf.g:3437:6: otherlv_6= '[' ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )? ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_10= ']'
                            {
                            otherlv_6=(Token)match(input,37,FOLLOW_48); 

                            						newLeafNode(otherlv_6, grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_0_1_0());
                            					
                            // InternalAlf.g:3441:6: ( ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..' )?
                            int alt94=2;
                            int LA94_0 = input.LA(1);

                            if ( (LA94_0==RULE_NATURAL_VALUE) ) {
                                int LA94_1 = input.LA(2);

                                if ( (LA94_1==38) ) {
                                    alt94=1;
                                }
                            }
                            switch (alt94) {
                                case 1 :
                                    // InternalAlf.g:3442:7: ( (lv_lower_7_0= ruleNaturalLiteralExpression ) ) otherlv_8= '..'
                                    {
                                    // InternalAlf.g:3442:7: ( (lv_lower_7_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:3443:8: (lv_lower_7_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:3443:8: (lv_lower_7_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:3444:9: lv_lower_7_0= ruleNaturalLiteralExpression
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

                            // InternalAlf.g:3466:6: ( (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:3467:7: (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:3467:7: (lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:3468:8: lv_upper_9_0= ruleUnlimitedNaturalLiteralExpression
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

                    // InternalAlf.g:3490:5: (otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) ) )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==41) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // InternalAlf.g:3491:6: otherlv_11= '=' ( (lv_value_12_0= ruleExpression ) )
                            {
                            otherlv_11=(Token)match(input,41,FOLLOW_56); 

                            						newLeafNode(otherlv_11, grammarAccess.getNamedFeatureDefinitionAccess().getEqualsSignKeyword_1_0_2_0());
                            					
                            // InternalAlf.g:3495:6: ( (lv_value_12_0= ruleExpression ) )
                            // InternalAlf.g:3496:7: (lv_value_12_0= ruleExpression )
                            {
                            // InternalAlf.g:3496:7: (lv_value_12_0= ruleExpression )
                            // InternalAlf.g:3497:8: lv_value_12_0= ruleExpression
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

                    // InternalAlf.g:3515:5: (otherlv_13= ';' | (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' ) )
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==19) ) {
                        alt98=1;
                    }
                    else if ( (LA98_0==22) ) {
                        alt98=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 98, 0, input);

                        throw nvae;
                    }
                    switch (alt98) {
                        case 1 :
                            // InternalAlf.g:3516:6: otherlv_13= ';'
                            {
                            otherlv_13=(Token)match(input,19,FOLLOW_2); 

                            						newLeafNode(otherlv_13, grammarAccess.getNamedFeatureDefinitionAccess().getSemicolonKeyword_1_0_3_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:3521:6: (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' )
                            {
                            // InternalAlf.g:3521:6: (otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}' )
                            // InternalAlf.g:3522:7: otherlv_14= '{' ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )* otherlv_17= '}'
                            {
                            otherlv_14=(Token)match(input,22,FOLLOW_27); 

                            							newLeafNode(otherlv_14, grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_3_1_0());
                            						
                            // InternalAlf.g:3526:7: ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )*
                            loop97:
                            do {
                                int alt97=3;
                                alt97 = dfa97.predict(input);
                                switch (alt97) {
                            	case 1 :
                            	    // InternalAlf.g:3527:8: ( (lv_ownedMembership_15_0= ruleClassMember ) )
                            	    {
                            	    // InternalAlf.g:3527:8: ( (lv_ownedMembership_15_0= ruleClassMember ) )
                            	    // InternalAlf.g:3528:9: (lv_ownedMembership_15_0= ruleClassMember )
                            	    {
                            	    // InternalAlf.g:3528:9: (lv_ownedMembership_15_0= ruleClassMember )
                            	    // InternalAlf.g:3529:10: lv_ownedMembership_15_0= ruleClassMember
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
                            	    // InternalAlf.g:3547:8: ( (lv_ownedImport_16_0= rulePackageImport ) )
                            	    {
                            	    // InternalAlf.g:3547:8: ( (lv_ownedImport_16_0= rulePackageImport ) )
                            	    // InternalAlf.g:3548:9: (lv_ownedImport_16_0= rulePackageImport )
                            	    {
                            	    // InternalAlf.g:3548:9: (lv_ownedImport_16_0= rulePackageImport )
                            	    // InternalAlf.g:3549:10: lv_ownedImport_16_0= rulePackageImport
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
                            	    break loop97;
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
                    // InternalAlf.g:3575:4: ( ( (lv_ownedElement_18_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) ) | (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' ) ) )
                    {
                    // InternalAlf.g:3575:4: ( ( (lv_ownedElement_18_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) ) | (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' ) ) )
                    // InternalAlf.g:3576:5: ( (lv_ownedElement_18_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) ) | (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' ) )
                    {
                    // InternalAlf.g:3576:5: ( (lv_ownedElement_18_0= ruleSubsetOrRedefinition ) )
                    // InternalAlf.g:3577:6: (lv_ownedElement_18_0= ruleSubsetOrRedefinition )
                    {
                    // InternalAlf.g:3577:6: (lv_ownedElement_18_0= ruleSubsetOrRedefinition )
                    // InternalAlf.g:3578:7: lv_ownedElement_18_0= ruleSubsetOrRedefinition
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

                    // InternalAlf.g:3595:5: ( ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) ) | (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' ) )
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==37) ) {
                        int LA106_1 = input.LA(2);

                        if ( (LA106_1==RULE_NATURAL_VALUE) ) {
                            int LA106_3 = input.LA(3);

                            if ( (LA106_3==38) ) {
                                int LA106_5 = input.LA(4);

                                if ( (LA106_5==RULE_NATURAL_VALUE) ) {
                                    int LA106_7 = input.LA(5);

                                    if ( (LA106_7==39) ) {
                                        int LA106_6 = input.LA(6);

                                        if ( (LA106_6==19) ) {
                                            alt106=2;
                                        }
                                        else if ( (LA106_6==22||LA106_6==41) ) {
                                            alt106=1;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 106, 6, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 106, 7, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA106_5==18) ) {
                                    int LA106_4 = input.LA(5);

                                    if ( (LA106_4==39) ) {
                                        int LA106_6 = input.LA(6);

                                        if ( (LA106_6==19) ) {
                                            alt106=2;
                                        }
                                        else if ( (LA106_6==22||LA106_6==41) ) {
                                            alt106=1;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 106, 6, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 106, 4, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 106, 5, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA106_3==39) ) {
                                int LA106_6 = input.LA(4);

                                if ( (LA106_6==19) ) {
                                    alt106=2;
                                }
                                else if ( (LA106_6==22||LA106_6==41) ) {
                                    alt106=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 106, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 106, 3, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA106_1==18) ) {
                            int LA106_4 = input.LA(3);

                            if ( (LA106_4==39) ) {
                                int LA106_6 = input.LA(4);

                                if ( (LA106_6==19) ) {
                                    alt106=2;
                                }
                                else if ( (LA106_6==22||LA106_6==41) ) {
                                    alt106=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 106, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 106, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 106, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA106_0==22||LA106_0==41) ) {
                        alt106=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 106, 0, input);

                        throw nvae;
                    }
                    switch (alt106) {
                        case 1 :
                            // InternalAlf.g:3596:6: ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) )
                            {
                            // InternalAlf.g:3596:6: ( (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) ) )
                            // InternalAlf.g:3597:7: (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )? ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) )
                            {
                            // InternalAlf.g:3597:7: (otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']' )?
                            int alt100=2;
                            int LA100_0 = input.LA(1);

                            if ( (LA100_0==37) ) {
                                alt100=1;
                            }
                            switch (alt100) {
                                case 1 :
                                    // InternalAlf.g:3598:8: otherlv_19= '[' ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )? ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_23= ']'
                                    {
                                    otherlv_19=(Token)match(input,37,FOLLOW_48); 

                                    								newLeafNode(otherlv_19, grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_1_0_0_0());
                                    							
                                    // InternalAlf.g:3602:8: ( ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..' )?
                                    int alt99=2;
                                    int LA99_0 = input.LA(1);

                                    if ( (LA99_0==RULE_NATURAL_VALUE) ) {
                                        int LA99_1 = input.LA(2);

                                        if ( (LA99_1==38) ) {
                                            alt99=1;
                                        }
                                    }
                                    switch (alt99) {
                                        case 1 :
                                            // InternalAlf.g:3603:9: ( (lv_lower_20_0= ruleNaturalLiteralExpression ) ) otherlv_21= '..'
                                            {
                                            // InternalAlf.g:3603:9: ( (lv_lower_20_0= ruleNaturalLiteralExpression ) )
                                            // InternalAlf.g:3604:10: (lv_lower_20_0= ruleNaturalLiteralExpression )
                                            {
                                            // InternalAlf.g:3604:10: (lv_lower_20_0= ruleNaturalLiteralExpression )
                                            // InternalAlf.g:3605:11: lv_lower_20_0= ruleNaturalLiteralExpression
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

                                    // InternalAlf.g:3627:8: ( (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression ) )
                                    // InternalAlf.g:3628:9: (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:3628:9: (lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression )
                                    // InternalAlf.g:3629:10: lv_upper_22_0= ruleUnlimitedNaturalLiteralExpression
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

                            // InternalAlf.g:3651:7: ( (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) ) | (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' ) )
                            int alt104=2;
                            int LA104_0 = input.LA(1);

                            if ( (LA104_0==41) ) {
                                alt104=1;
                            }
                            else if ( (LA104_0==22) ) {
                                alt104=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 104, 0, input);

                                throw nvae;
                            }
                            switch (alt104) {
                                case 1 :
                                    // InternalAlf.g:3652:8: (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) )
                                    {
                                    // InternalAlf.g:3652:8: (otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) ) )
                                    // InternalAlf.g:3653:9: otherlv_24= '=' ( (lv_value_25_0= ruleExpression ) ) (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) )
                                    {
                                    otherlv_24=(Token)match(input,41,FOLLOW_56); 

                                    									newLeafNode(otherlv_24, grammarAccess.getNamedFeatureDefinitionAccess().getEqualsSignKeyword_1_1_1_0_1_0_0());
                                    								
                                    // InternalAlf.g:3657:9: ( (lv_value_25_0= ruleExpression ) )
                                    // InternalAlf.g:3658:10: (lv_value_25_0= ruleExpression )
                                    {
                                    // InternalAlf.g:3658:10: (lv_value_25_0= ruleExpression )
                                    // InternalAlf.g:3659:11: lv_value_25_0= ruleExpression
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

                                    // InternalAlf.g:3676:9: (otherlv_26= ';' | (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' ) )
                                    int alt102=2;
                                    int LA102_0 = input.LA(1);

                                    if ( (LA102_0==19) ) {
                                        alt102=1;
                                    }
                                    else if ( (LA102_0==22) ) {
                                        alt102=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 102, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt102) {
                                        case 1 :
                                            // InternalAlf.g:3677:10: otherlv_26= ';'
                                            {
                                            otherlv_26=(Token)match(input,19,FOLLOW_2); 

                                            										newLeafNode(otherlv_26, grammarAccess.getNamedFeatureDefinitionAccess().getSemicolonKeyword_1_1_1_0_1_0_2_0());
                                            									

                                            }
                                            break;
                                        case 2 :
                                            // InternalAlf.g:3682:10: (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' )
                                            {
                                            // InternalAlf.g:3682:10: (otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}' )
                                            // InternalAlf.g:3683:11: otherlv_27= '{' ( (lv_ownedMembership_28_0= ruleClassMember ) )* otherlv_29= '}'
                                            {
                                            otherlv_27=(Token)match(input,22,FOLLOW_27); 

                                            											newLeafNode(otherlv_27, grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_1_1_0_1_0_2_1_0());
                                            										
                                            // InternalAlf.g:3687:11: ( (lv_ownedMembership_28_0= ruleClassMember ) )*
                                            loop101:
                                            do {
                                                int alt101=2;
                                                int LA101_0 = input.LA(1);

                                                if ( (LA101_0==RULE_DOCUMENTATION_COMMENT||(LA101_0>=RULE_ID && LA101_0<=RULE_UNRESTRICTED_NAME)||LA101_0==15||LA101_0==21||(LA101_0>=25 && LA101_0<=28)||(LA101_0>=31 && LA101_0<=33)||(LA101_0>=55 && LA101_0<=61)) ) {
                                                    alt101=1;
                                                }


                                                switch (alt101) {
                                            	case 1 :
                                            	    // InternalAlf.g:3688:12: (lv_ownedMembership_28_0= ruleClassMember )
                                            	    {
                                            	    // InternalAlf.g:3688:12: (lv_ownedMembership_28_0= ruleClassMember )
                                            	    // InternalAlf.g:3689:13: lv_ownedMembership_28_0= ruleClassMember
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
                                            	    break loop101;
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
                                    // InternalAlf.g:3714:8: (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' )
                                    {
                                    // InternalAlf.g:3714:8: (otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}' )
                                    // InternalAlf.g:3715:9: otherlv_30= '{' ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )* otherlv_33= '}'
                                    {
                                    otherlv_30=(Token)match(input,22,FOLLOW_27); 

                                    									newLeafNode(otherlv_30, grammarAccess.getNamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_1_1_0_1_1_0());
                                    								
                                    // InternalAlf.g:3719:9: ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )*
                                    loop103:
                                    do {
                                        int alt103=3;
                                        alt103 = dfa103.predict(input);
                                        switch (alt103) {
                                    	case 1 :
                                    	    // InternalAlf.g:3720:10: ( (lv_ownedMembership_31_0= ruleClassMember ) )
                                    	    {
                                    	    // InternalAlf.g:3720:10: ( (lv_ownedMembership_31_0= ruleClassMember ) )
                                    	    // InternalAlf.g:3721:11: (lv_ownedMembership_31_0= ruleClassMember )
                                    	    {
                                    	    // InternalAlf.g:3721:11: (lv_ownedMembership_31_0= ruleClassMember )
                                    	    // InternalAlf.g:3722:12: lv_ownedMembership_31_0= ruleClassMember
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
                                    	    // InternalAlf.g:3740:10: ( (lv_ownedImport_32_0= rulePackageImport ) )
                                    	    {
                                    	    // InternalAlf.g:3740:10: ( (lv_ownedImport_32_0= rulePackageImport ) )
                                    	    // InternalAlf.g:3741:11: (lv_ownedImport_32_0= rulePackageImport )
                                    	    {
                                    	    // InternalAlf.g:3741:11: (lv_ownedImport_32_0= rulePackageImport )
                                    	    // InternalAlf.g:3742:12: lv_ownedImport_32_0= rulePackageImport
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
                                    	    break loop103;
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
                            // InternalAlf.g:3768:6: (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' )
                            {
                            // InternalAlf.g:3768:6: (otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';' )
                            // InternalAlf.g:3769:7: otherlv_34= '[' ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )? ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_38= ']' otherlv_39= ';'
                            {
                            otherlv_34=(Token)match(input,37,FOLLOW_48); 

                            							newLeafNode(otherlv_34, grammarAccess.getNamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_1_1_0());
                            						
                            // InternalAlf.g:3773:7: ( ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..' )?
                            int alt105=2;
                            int LA105_0 = input.LA(1);

                            if ( (LA105_0==RULE_NATURAL_VALUE) ) {
                                int LA105_1 = input.LA(2);

                                if ( (LA105_1==38) ) {
                                    alt105=1;
                                }
                            }
                            switch (alt105) {
                                case 1 :
                                    // InternalAlf.g:3774:8: ( (lv_lower_35_0= ruleNaturalLiteralExpression ) ) otherlv_36= '..'
                                    {
                                    // InternalAlf.g:3774:8: ( (lv_lower_35_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:3775:9: (lv_lower_35_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:3775:9: (lv_lower_35_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:3776:10: lv_lower_35_0= ruleNaturalLiteralExpression
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

                            // InternalAlf.g:3798:7: ( (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:3799:8: (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:3799:8: (lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:3800:9: lv_upper_37_0= ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:3833:1: entryRuleUnnamedFeatureDefinition returns [EObject current=null] : iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF ;
    public final EObject entryRuleUnnamedFeatureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedFeatureDefinition = null;


        try {
            // InternalAlf.g:3833:65: (iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF )
            // InternalAlf.g:3834:2: iv_ruleUnnamedFeatureDefinition= ruleUnnamedFeatureDefinition EOF
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
    // InternalAlf.g:3840:1: ruleUnnamedFeatureDefinition returns [EObject current=null] : ( ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' ) ) ) | (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' ) ) ) ;
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
            // InternalAlf.g:3846:2: ( ( ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' ) ) ) | (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' ) ) ) )
            // InternalAlf.g:3847:2: ( ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' ) ) ) | (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' ) ) )
            {
            // InternalAlf.g:3847:2: ( ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' ) ) ) | (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' ) ) )
            // InternalAlf.g:3848:3: ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) ) ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' ) ) ) | (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' ) )
            {
            // InternalAlf.g:3848:3: ( (lv_ownedElement_0_0= ruleSubsetOrRedefinition ) )
            // InternalAlf.g:3849:4: (lv_ownedElement_0_0= ruleSubsetOrRedefinition )
            {
            // InternalAlf.g:3849:4: (lv_ownedElement_0_0= ruleSubsetOrRedefinition )
            // InternalAlf.g:3850:5: lv_ownedElement_0_0= ruleSubsetOrRedefinition
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

            // InternalAlf.g:3867:3: ( ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' ) ) ) | (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' ) )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==37) ) {
                int LA115_1 = input.LA(2);

                if ( (LA115_1==RULE_NATURAL_VALUE) ) {
                    int LA115_3 = input.LA(3);

                    if ( (LA115_3==38) ) {
                        int LA115_5 = input.LA(4);

                        if ( (LA115_5==RULE_NATURAL_VALUE) ) {
                            int LA115_7 = input.LA(5);

                            if ( (LA115_7==39) ) {
                                int LA115_6 = input.LA(6);

                                if ( (LA115_6==22||LA115_6==41) ) {
                                    alt115=1;
                                }
                                else if ( (LA115_6==19) ) {
                                    alt115=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 115, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 115, 7, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA115_5==18) ) {
                            int LA115_4 = input.LA(5);

                            if ( (LA115_4==39) ) {
                                int LA115_6 = input.LA(6);

                                if ( (LA115_6==22||LA115_6==41) ) {
                                    alt115=1;
                                }
                                else if ( (LA115_6==19) ) {
                                    alt115=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 115, 6, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 115, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 115, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA115_3==39) ) {
                        int LA115_6 = input.LA(4);

                        if ( (LA115_6==22||LA115_6==41) ) {
                            alt115=1;
                        }
                        else if ( (LA115_6==19) ) {
                            alt115=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 115, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 115, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA115_1==18) ) {
                    int LA115_4 = input.LA(3);

                    if ( (LA115_4==39) ) {
                        int LA115_6 = input.LA(4);

                        if ( (LA115_6==22||LA115_6==41) ) {
                            alt115=1;
                        }
                        else if ( (LA115_6==19) ) {
                            alt115=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 115, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 115, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 115, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA115_0==22||LA115_0==41) ) {
                alt115=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // InternalAlf.g:3868:4: ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' ) ) )
                    {
                    // InternalAlf.g:3868:4: ( (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' ) ) )
                    // InternalAlf.g:3869:5: (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )? ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' ) )
                    {
                    // InternalAlf.g:3869:5: (otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']' )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==37) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // InternalAlf.g:3870:6: otherlv_1= '[' ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )? ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_5= ']'
                            {
                            otherlv_1=(Token)match(input,37,FOLLOW_48); 

                            						newLeafNode(otherlv_1, grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_0_0_0());
                            					
                            // InternalAlf.g:3874:6: ( ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..' )?
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
                                    // InternalAlf.g:3875:7: ( (lv_lower_2_0= ruleNaturalLiteralExpression ) ) otherlv_3= '..'
                                    {
                                    // InternalAlf.g:3875:7: ( (lv_lower_2_0= ruleNaturalLiteralExpression ) )
                                    // InternalAlf.g:3876:8: (lv_lower_2_0= ruleNaturalLiteralExpression )
                                    {
                                    // InternalAlf.g:3876:8: (lv_lower_2_0= ruleNaturalLiteralExpression )
                                    // InternalAlf.g:3877:9: lv_lower_2_0= ruleNaturalLiteralExpression
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

                            // InternalAlf.g:3899:6: ( (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression ) )
                            // InternalAlf.g:3900:7: (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression )
                            {
                            // InternalAlf.g:3900:7: (lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression )
                            // InternalAlf.g:3901:8: lv_upper_4_0= ruleUnlimitedNaturalLiteralExpression
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

                    // InternalAlf.g:3923:5: ( (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) ) | (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' ) )
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==41) ) {
                        alt113=1;
                    }
                    else if ( (LA113_0==22) ) {
                        alt113=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 113, 0, input);

                        throw nvae;
                    }
                    switch (alt113) {
                        case 1 :
                            // InternalAlf.g:3924:6: (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) )
                            {
                            // InternalAlf.g:3924:6: (otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) ) )
                            // InternalAlf.g:3925:7: otherlv_6= '=' ( (lv_value_7_0= ruleExpression ) ) (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) )
                            {
                            otherlv_6=(Token)match(input,41,FOLLOW_56); 

                            							newLeafNode(otherlv_6, grammarAccess.getUnnamedFeatureDefinitionAccess().getEqualsSignKeyword_1_0_1_0_0());
                            						
                            // InternalAlf.g:3929:7: ( (lv_value_7_0= ruleExpression ) )
                            // InternalAlf.g:3930:8: (lv_value_7_0= ruleExpression )
                            {
                            // InternalAlf.g:3930:8: (lv_value_7_0= ruleExpression )
                            // InternalAlf.g:3931:9: lv_value_7_0= ruleExpression
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

                            // InternalAlf.g:3948:7: (otherlv_8= ';' | (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' ) )
                            int alt111=2;
                            int LA111_0 = input.LA(1);

                            if ( (LA111_0==19) ) {
                                alt111=1;
                            }
                            else if ( (LA111_0==22) ) {
                                alt111=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 111, 0, input);

                                throw nvae;
                            }
                            switch (alt111) {
                                case 1 :
                                    // InternalAlf.g:3949:8: otherlv_8= ';'
                                    {
                                    otherlv_8=(Token)match(input,19,FOLLOW_2); 

                                    								newLeafNode(otherlv_8, grammarAccess.getUnnamedFeatureDefinitionAccess().getSemicolonKeyword_1_0_1_0_2_0());
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalAlf.g:3954:8: (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' )
                                    {
                                    // InternalAlf.g:3954:8: (otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}' )
                                    // InternalAlf.g:3955:9: otherlv_9= '{' ( (lv_ownedMembership_10_0= ruleClassMember ) )* otherlv_11= '}'
                                    {
                                    otherlv_9=(Token)match(input,22,FOLLOW_27); 

                                    									newLeafNode(otherlv_9, grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_1_0_2_1_0());
                                    								
                                    // InternalAlf.g:3959:9: ( (lv_ownedMembership_10_0= ruleClassMember ) )*
                                    loop110:
                                    do {
                                        int alt110=2;
                                        int LA110_0 = input.LA(1);

                                        if ( (LA110_0==RULE_DOCUMENTATION_COMMENT||(LA110_0>=RULE_ID && LA110_0<=RULE_UNRESTRICTED_NAME)||LA110_0==15||LA110_0==21||(LA110_0>=25 && LA110_0<=28)||(LA110_0>=31 && LA110_0<=33)||(LA110_0>=55 && LA110_0<=61)) ) {
                                            alt110=1;
                                        }


                                        switch (alt110) {
                                    	case 1 :
                                    	    // InternalAlf.g:3960:10: (lv_ownedMembership_10_0= ruleClassMember )
                                    	    {
                                    	    // InternalAlf.g:3960:10: (lv_ownedMembership_10_0= ruleClassMember )
                                    	    // InternalAlf.g:3961:11: lv_ownedMembership_10_0= ruleClassMember
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
                                    	    break loop110;
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
                            // InternalAlf.g:3986:6: (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' )
                            {
                            // InternalAlf.g:3986:6: (otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}' )
                            // InternalAlf.g:3987:7: otherlv_12= '{' ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )* otherlv_15= '}'
                            {
                            otherlv_12=(Token)match(input,22,FOLLOW_27); 

                            							newLeafNode(otherlv_12, grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftCurlyBracketKeyword_1_0_1_1_0());
                            						
                            // InternalAlf.g:3991:7: ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )*
                            loop112:
                            do {
                                int alt112=3;
                                alt112 = dfa112.predict(input);
                                switch (alt112) {
                            	case 1 :
                            	    // InternalAlf.g:3992:8: ( (lv_ownedMembership_13_0= ruleClassMember ) )
                            	    {
                            	    // InternalAlf.g:3992:8: ( (lv_ownedMembership_13_0= ruleClassMember ) )
                            	    // InternalAlf.g:3993:9: (lv_ownedMembership_13_0= ruleClassMember )
                            	    {
                            	    // InternalAlf.g:3993:9: (lv_ownedMembership_13_0= ruleClassMember )
                            	    // InternalAlf.g:3994:10: lv_ownedMembership_13_0= ruleClassMember
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
                            	    // InternalAlf.g:4012:8: ( (lv_ownedImport_14_0= rulePackageImport ) )
                            	    {
                            	    // InternalAlf.g:4012:8: ( (lv_ownedImport_14_0= rulePackageImport ) )
                            	    // InternalAlf.g:4013:9: (lv_ownedImport_14_0= rulePackageImport )
                            	    {
                            	    // InternalAlf.g:4013:9: (lv_ownedImport_14_0= rulePackageImport )
                            	    // InternalAlf.g:4014:10: lv_ownedImport_14_0= rulePackageImport
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
                            	    break loop112;
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
                    // InternalAlf.g:4040:4: (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' )
                    {
                    // InternalAlf.g:4040:4: (otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';' )
                    // InternalAlf.g:4041:5: otherlv_16= '[' ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )? ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) ) otherlv_20= ']' otherlv_21= ';'
                    {
                    otherlv_16=(Token)match(input,37,FOLLOW_48); 

                    					newLeafNode(otherlv_16, grammarAccess.getUnnamedFeatureDefinitionAccess().getLeftSquareBracketKeyword_1_1_0());
                    				
                    // InternalAlf.g:4045:5: ( ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..' )?
                    int alt114=2;
                    int LA114_0 = input.LA(1);

                    if ( (LA114_0==RULE_NATURAL_VALUE) ) {
                        int LA114_1 = input.LA(2);

                        if ( (LA114_1==38) ) {
                            alt114=1;
                        }
                    }
                    switch (alt114) {
                        case 1 :
                            // InternalAlf.g:4046:6: ( (lv_lower_17_0= ruleNaturalLiteralExpression ) ) otherlv_18= '..'
                            {
                            // InternalAlf.g:4046:6: ( (lv_lower_17_0= ruleNaturalLiteralExpression ) )
                            // InternalAlf.g:4047:7: (lv_lower_17_0= ruleNaturalLiteralExpression )
                            {
                            // InternalAlf.g:4047:7: (lv_lower_17_0= ruleNaturalLiteralExpression )
                            // InternalAlf.g:4048:8: lv_lower_17_0= ruleNaturalLiteralExpression
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

                    // InternalAlf.g:4070:5: ( (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression ) )
                    // InternalAlf.g:4071:6: (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression )
                    {
                    // InternalAlf.g:4071:6: (lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression )
                    // InternalAlf.g:4072:7: lv_upper_19_0= ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:4103:1: entryRuleSubsetOrRedefinition returns [EObject current=null] : iv_ruleSubsetOrRedefinition= ruleSubsetOrRedefinition EOF ;
    public final EObject entryRuleSubsetOrRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsetOrRedefinition = null;


        try {
            // InternalAlf.g:4103:61: (iv_ruleSubsetOrRedefinition= ruleSubsetOrRedefinition EOF )
            // InternalAlf.g:4104:2: iv_ruleSubsetOrRedefinition= ruleSubsetOrRedefinition EOF
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
    // InternalAlf.g:4110:1: ruleSubsetOrRedefinition returns [EObject current=null] : ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | ( (otherlv_2= 'is' | otherlv_3= 'redefines' ) this_Redefinition_4= ruleRedefinition ) ) ;
    public final EObject ruleSubsetOrRedefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Subset_1 = null;

        EObject this_Redefinition_4 = null;



        	enterRule();

        try {
            // InternalAlf.g:4116:2: ( ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | ( (otherlv_2= 'is' | otherlv_3= 'redefines' ) this_Redefinition_4= ruleRedefinition ) ) )
            // InternalAlf.g:4117:2: ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | ( (otherlv_2= 'is' | otherlv_3= 'redefines' ) this_Redefinition_4= ruleRedefinition ) )
            {
            // InternalAlf.g:4117:2: ( (otherlv_0= 'subsets' this_Subset_1= ruleSubset ) | ( (otherlv_2= 'is' | otherlv_3= 'redefines' ) this_Redefinition_4= ruleRedefinition ) )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==42) ) {
                alt117=1;
            }
            else if ( (LA117_0==24||LA117_0==43) ) {
                alt117=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // InternalAlf.g:4118:3: (otherlv_0= 'subsets' this_Subset_1= ruleSubset )
                    {
                    // InternalAlf.g:4118:3: (otherlv_0= 'subsets' this_Subset_1= ruleSubset )
                    // InternalAlf.g:4119:4: otherlv_0= 'subsets' this_Subset_1= ruleSubset
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
                    // InternalAlf.g:4133:3: ( (otherlv_2= 'is' | otherlv_3= 'redefines' ) this_Redefinition_4= ruleRedefinition )
                    {
                    // InternalAlf.g:4133:3: ( (otherlv_2= 'is' | otherlv_3= 'redefines' ) this_Redefinition_4= ruleRedefinition )
                    // InternalAlf.g:4134:4: (otherlv_2= 'is' | otherlv_3= 'redefines' ) this_Redefinition_4= ruleRedefinition
                    {
                    // InternalAlf.g:4134:4: (otherlv_2= 'is' | otherlv_3= 'redefines' )
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==24) ) {
                        alt116=1;
                    }
                    else if ( (LA116_0==43) ) {
                        alt116=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 116, 0, input);

                        throw nvae;
                    }
                    switch (alt116) {
                        case 1 :
                            // InternalAlf.g:4135:5: otherlv_2= 'is'
                            {
                            otherlv_2=(Token)match(input,24,FOLLOW_4); 

                            					newLeafNode(otherlv_2, grammarAccess.getSubsetOrRedefinitionAccess().getIsKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:4140:5: otherlv_3= 'redefines'
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
    // InternalAlf.g:4158:1: entryRuleRedefinition returns [EObject current=null] : iv_ruleRedefinition= ruleRedefinition EOF ;
    public final EObject entryRuleRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefinition = null;


        try {
            // InternalAlf.g:4158:53: (iv_ruleRedefinition= ruleRedefinition EOF )
            // InternalAlf.g:4159:2: iv_ruleRedefinition= ruleRedefinition EOF
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
    // InternalAlf.g:4165:1: ruleRedefinition returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleRedefinition() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:4171:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:4172:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:4172:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4173:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:4173:3: ( ruleQualifiedName )
            // InternalAlf.g:4174:4: ruleQualifiedName
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
    // InternalAlf.g:4191:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalAlf.g:4191:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalAlf.g:4192:2: iv_ruleSubset= ruleSubset EOF
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
    // InternalAlf.g:4198:1: ruleSubset returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSubset() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:4204:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:4205:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:4205:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4206:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:4206:3: ( ruleQualifiedName )
            // InternalAlf.g:4207:4: ruleQualifiedName
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
    // InternalAlf.g:4224:1: entryRuleConnectorDefinition returns [EObject current=null] : iv_ruleConnectorDefinition= ruleConnectorDefinition EOF ;
    public final EObject entryRuleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorDefinition = null;


        try {
            // InternalAlf.g:4224:60: (iv_ruleConnectorDefinition= ruleConnectorDefinition EOF )
            // InternalAlf.g:4225:2: iv_ruleConnectorDefinition= ruleConnectorDefinition EOF
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
    // InternalAlf.g:4231:1: ruleConnectorDefinition returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) ;
    public final EObject ruleConnectorDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4237:2: ( ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) )
            // InternalAlf.g:4238:2: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
            {
            // InternalAlf.g:4238:2: ( ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';' )
            // InternalAlf.g:4239:3: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )? ( ( ruleQualifiedName ) ) otherlv_5= '=>' ( ( ruleQualifiedName ) ) otherlv_7= ';'
            {
            // InternalAlf.g:4239:3: ( ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is' )?
            int alt120=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA120_1 = input.LA(2);

                    if ( (LA120_1==24||LA120_1==35) ) {
                        alt120=1;
                    }
                    }
                    break;
                case RULE_UNRESTRICTED_NAME:
                    {
                    int LA120_2 = input.LA(2);

                    if ( (LA120_2==24||LA120_2==35) ) {
                        alt120=1;
                    }
                    }
                    break;
                case 24:
                case 35:
                    {
                    alt120=1;
                    }
                    break;
            }

            switch (alt120) {
                case 1 :
                    // InternalAlf.g:4240:4: ( (lv_name_0_0= ruleName ) )? (otherlv_1= ':' ( ( ruleQualifiedName ) ) )? otherlv_3= 'is'
                    {
                    // InternalAlf.g:4240:4: ( (lv_name_0_0= ruleName ) )?
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( ((LA118_0>=RULE_ID && LA118_0<=RULE_UNRESTRICTED_NAME)) ) {
                        alt118=1;
                    }
                    switch (alt118) {
                        case 1 :
                            // InternalAlf.g:4241:5: (lv_name_0_0= ruleName )
                            {
                            // InternalAlf.g:4241:5: (lv_name_0_0= ruleName )
                            // InternalAlf.g:4242:6: lv_name_0_0= ruleName
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

                    // InternalAlf.g:4259:4: (otherlv_1= ':' ( ( ruleQualifiedName ) ) )?
                    int alt119=2;
                    int LA119_0 = input.LA(1);

                    if ( (LA119_0==35) ) {
                        alt119=1;
                    }
                    switch (alt119) {
                        case 1 :
                            // InternalAlf.g:4260:5: otherlv_1= ':' ( ( ruleQualifiedName ) )
                            {
                            otherlv_1=(Token)match(input,35,FOLLOW_4); 

                            					newLeafNode(otherlv_1, grammarAccess.getConnectorDefinitionAccess().getColonKeyword_0_1_0());
                            				
                            // InternalAlf.g:4264:5: ( ( ruleQualifiedName ) )
                            // InternalAlf.g:4265:6: ( ruleQualifiedName )
                            {
                            // InternalAlf.g:4265:6: ( ruleQualifiedName )
                            // InternalAlf.g:4266:7: ruleQualifiedName
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

            // InternalAlf.g:4286:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4287:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:4287:4: ( ruleQualifiedName )
            // InternalAlf.g:4288:5: ruleQualifiedName
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
            		
            // InternalAlf.g:4306:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4307:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:4307:4: ( ruleQualifiedName )
            // InternalAlf.g:4308:5: ruleQualifiedName
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
    // InternalAlf.g:4330:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAlf.g:4330:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalAlf.g:4331:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalAlf.g:4337:1: ruleExpression returns [EObject current=null] : this_BinaryExpression_0= ruleBinaryExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4343:2: (this_BinaryExpression_0= ruleBinaryExpression )
            // InternalAlf.g:4344:2: this_BinaryExpression_0= ruleBinaryExpression
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
    // InternalAlf.g:4355:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalAlf.g:4355:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalAlf.g:4356:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalAlf.g:4362:1: ruleBinaryExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) ;
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
            // InternalAlf.g:4368:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? ) )
            // InternalAlf.g:4369:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            {
            // InternalAlf.g:4369:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )? )
            // InternalAlf.g:4370:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            {

            			newCompositeNode(grammarAccess.getBinaryExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_62);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:4378:3: ( () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==18||(LA122_0>=45 && LA122_0<=49)) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalAlf.g:4379:4: () ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    {
                    // InternalAlf.g:4379:4: ()
                    // InternalAlf.g:4380:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getBinaryExpressionAccess().getOperatorExpressionOperandAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:4386:4: ( ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) ) | ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' ) )
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==18||(LA121_0>=46 && LA121_0<=49)) ) {
                        alt121=1;
                    }
                    else if ( (LA121_0==45) ) {
                        alt121=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 121, 0, input);

                        throw nvae;
                    }
                    switch (alt121) {
                        case 1 :
                            // InternalAlf.g:4387:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            {
                            // InternalAlf.g:4387:5: ( ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) ) )
                            // InternalAlf.g:4388:6: ( (lv_operator_2_0= ruleBinaryOperator ) ) ( (lv_operand_3_0= ruleExpression ) )
                            {
                            // InternalAlf.g:4388:6: ( (lv_operator_2_0= ruleBinaryOperator ) )
                            // InternalAlf.g:4389:7: (lv_operator_2_0= ruleBinaryOperator )
                            {
                            // InternalAlf.g:4389:7: (lv_operator_2_0= ruleBinaryOperator )
                            // InternalAlf.g:4390:8: lv_operator_2_0= ruleBinaryOperator
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

                            // InternalAlf.g:4407:6: ( (lv_operand_3_0= ruleExpression ) )
                            // InternalAlf.g:4408:7: (lv_operand_3_0= ruleExpression )
                            {
                            // InternalAlf.g:4408:7: (lv_operand_3_0= ruleExpression )
                            // InternalAlf.g:4409:8: lv_operand_3_0= ruleExpression
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
                            // InternalAlf.g:4428:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            {
                            // InternalAlf.g:4428:5: ( ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']' )
                            // InternalAlf.g:4429:6: ( (lv_operator_4_0= '@' ) ) otherlv_5= '[' ( (lv_operand_6_0= ruleExpression ) ) otherlv_7= ']'
                            {
                            // InternalAlf.g:4429:6: ( (lv_operator_4_0= '@' ) )
                            // InternalAlf.g:4430:7: (lv_operator_4_0= '@' )
                            {
                            // InternalAlf.g:4430:7: (lv_operator_4_0= '@' )
                            // InternalAlf.g:4431:8: lv_operator_4_0= '@'
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
                            					
                            // InternalAlf.g:4447:6: ( (lv_operand_6_0= ruleExpression ) )
                            // InternalAlf.g:4448:7: (lv_operand_6_0= ruleExpression )
                            {
                            // InternalAlf.g:4448:7: (lv_operand_6_0= ruleExpression )
                            // InternalAlf.g:4449:8: lv_operand_6_0= ruleExpression
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
    // InternalAlf.g:4477:1: entryRuleBinaryOperator returns [String current=null] : iv_ruleBinaryOperator= ruleBinaryOperator EOF ;
    public final String entryRuleBinaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperator = null;


        try {
            // InternalAlf.g:4477:54: (iv_ruleBinaryOperator= ruleBinaryOperator EOF )
            // InternalAlf.g:4478:2: iv_ruleBinaryOperator= ruleBinaryOperator EOF
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
    // InternalAlf.g:4484:1: ruleBinaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:4490:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' ) )
            // InternalAlf.g:4491:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            {
            // InternalAlf.g:4491:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '^' )
            int alt123=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt123=1;
                }
                break;
            case 47:
                {
                alt123=2;
                }
                break;
            case 18:
                {
                alt123=3;
                }
                break;
            case 48:
                {
                alt123=4;
                }
                break;
            case 49:
                {
                alt123=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }

            switch (alt123) {
                case 1 :
                    // InternalAlf.g:4492:3: kw= '+'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:4498:3: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAlf.g:4504:3: kw= '*'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAlf.g:4510:3: kw= '/'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOperatorAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAlf.g:4516:3: kw= '^'
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
    // InternalAlf.g:4525:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalAlf.g:4525:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalAlf.g:4526:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalAlf.g:4532:1: ruleUnaryExpression returns [EObject current=null] : (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceAccessExpression_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4538:2: ( (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) ) )
            // InternalAlf.g:4539:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            {
            // InternalAlf.g:4539:2: (this_SequenceAccessExpression_0= ruleSequenceAccessExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) ) )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( ((LA124_0>=RULE_BOOLEAN_VALUE && LA124_0<=RULE_UNRESTRICTED_NAME)||(LA124_0>=17 && LA124_0<=18)||LA124_0==22||LA124_0==50||LA124_0==52) ) {
                alt124=1;
            }
            else if ( ((LA124_0>=46 && LA124_0<=47)) ) {
                alt124=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // InternalAlf.g:4540:3: this_SequenceAccessExpression_0= ruleSequenceAccessExpression
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
                    // InternalAlf.g:4549:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    {
                    // InternalAlf.g:4549:3: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) ) )
                    // InternalAlf.g:4550:4: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    {
                    // InternalAlf.g:4550:4: ()
                    // InternalAlf.g:4551:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getOperatorExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalAlf.g:4557:4: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // InternalAlf.g:4558:5: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // InternalAlf.g:4558:5: (lv_operator_2_0= ruleUnaryOperator )
                    // InternalAlf.g:4559:6: lv_operator_2_0= ruleUnaryOperator
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

                    // InternalAlf.g:4576:4: ( (lv_operand_3_0= ruleSequenceAccessExpression ) )
                    // InternalAlf.g:4577:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    {
                    // InternalAlf.g:4577:5: (lv_operand_3_0= ruleSequenceAccessExpression )
                    // InternalAlf.g:4578:6: lv_operand_3_0= ruleSequenceAccessExpression
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
    // InternalAlf.g:4600:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalAlf.g:4600:53: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalAlf.g:4601:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalAlf.g:4607:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlf.g:4613:2: ( (kw= '+' | kw= '-' ) )
            // InternalAlf.g:4614:2: (kw= '+' | kw= '-' )
            {
            // InternalAlf.g:4614:2: (kw= '+' | kw= '-' )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==46) ) {
                alt125=1;
            }
            else if ( (LA125_0==47) ) {
                alt125=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // InternalAlf.g:4615:3: kw= '+'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:4621:3: kw= '-'
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
    // InternalAlf.g:4630:1: entryRuleSequenceAccessExpression returns [EObject current=null] : iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF ;
    public final EObject entryRuleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceAccessExpression = null;


        try {
            // InternalAlf.g:4630:65: (iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF )
            // InternalAlf.g:4631:2: iv_ruleSequenceAccessExpression= ruleSequenceAccessExpression EOF
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
    // InternalAlf.g:4637:1: ruleSequenceAccessExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) ;
    public final EObject ruleSequenceAccessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_index_3_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4643:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* ) )
            // InternalAlf.g:4644:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            {
            // InternalAlf.g:4644:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )* )
            // InternalAlf.g:4645:3: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            {

            			newCompositeNode(grammarAccess.getSequenceAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_65);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:4653:3: ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==37) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // InternalAlf.g:4654:4: () otherlv_2= '[' ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    // InternalAlf.g:4654:4: ()
            	    // InternalAlf.g:4655:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSequenceAccessExpressionAccess().getSequenceAccessExpressionPrimaryAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_56); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSequenceAccessExpressionAccess().getLeftSquareBracketKeyword_1_1());
            	    			
            	    // InternalAlf.g:4665:4: ( (lv_index_3_0= ruleExpression ) )
            	    // InternalAlf.g:4666:5: (lv_index_3_0= ruleExpression )
            	    {
            	    // InternalAlf.g:4666:5: (lv_index_3_0= ruleExpression )
            	    // InternalAlf.g:4667:6: lv_index_3_0= ruleExpression
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
            	    break loop126;
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
    // InternalAlf.g:4693:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalAlf.g:4693:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalAlf.g:4694:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalAlf.g:4700:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
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
            // InternalAlf.g:4706:2: ( (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // InternalAlf.g:4707:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // InternalAlf.g:4707:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt127=5;
            alt127 = dfa127.predict(input);
            switch (alt127) {
                case 1 :
                    // InternalAlf.g:4708:3: this_LiteralExpression_0= ruleLiteralExpression
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
                    // InternalAlf.g:4717:3: this_ElementReferenceExpression_1= ruleElementReferenceExpression
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
                    // InternalAlf.g:4726:3: this_InstanceCreationExpression_2= ruleInstanceCreationExpression
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
                    // InternalAlf.g:4735:3: this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression
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
                    // InternalAlf.g:4744:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // InternalAlf.g:4744:3: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // InternalAlf.g:4745:4: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
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
    // InternalAlf.g:4766:1: entryRuleElementReferenceExpression returns [EObject current=null] : iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF ;
    public final EObject entryRuleElementReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementReferenceExpression = null;


        try {
            // InternalAlf.g:4766:67: (iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF )
            // InternalAlf.g:4767:2: iv_ruleElementReferenceExpression= ruleElementReferenceExpression EOF
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
    // InternalAlf.g:4773:1: ruleElementReferenceExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleElementReferenceExpression() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAlf.g:4779:2: ( ( ( ruleQualifiedName ) ) )
            // InternalAlf.g:4780:2: ( ( ruleQualifiedName ) )
            {
            // InternalAlf.g:4780:2: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4781:3: ( ruleQualifiedName )
            {
            // InternalAlf.g:4781:3: ( ruleQualifiedName )
            // InternalAlf.g:4782:4: ruleQualifiedName
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
    // InternalAlf.g:4799:1: entryRuleInstanceCreationExpression returns [EObject current=null] : iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF ;
    public final EObject entryRuleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceCreationExpression = null;


        try {
            // InternalAlf.g:4799:67: (iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF )
            // InternalAlf.g:4800:2: iv_ruleInstanceCreationExpression= ruleInstanceCreationExpression EOF
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
    // InternalAlf.g:4806:1: ruleInstanceCreationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleInstanceCreationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_argument_2_0 = null;

        EObject lv_argument_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4812:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalAlf.g:4813:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalAlf.g:4813:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalAlf.g:4814:3: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalAlf.g:4814:3: ( ( ruleQualifiedName ) )
            // InternalAlf.g:4815:4: ( ruleQualifiedName )
            {
            // InternalAlf.g:4815:4: ( ruleQualifiedName )
            // InternalAlf.g:4816:5: ruleQualifiedName
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
            		
            // InternalAlf.g:4834:3: ( ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )* )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( ((LA129_0>=RULE_BOOLEAN_VALUE && LA129_0<=RULE_UNRESTRICTED_NAME)||(LA129_0>=17 && LA129_0<=18)||LA129_0==22||(LA129_0>=46 && LA129_0<=47)||LA129_0==50||LA129_0==52) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalAlf.g:4835:4: ( (lv_argument_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:4835:4: ( (lv_argument_2_0= ruleExpression ) )
                    // InternalAlf.g:4836:5: (lv_argument_2_0= ruleExpression )
                    {
                    // InternalAlf.g:4836:5: (lv_argument_2_0= ruleExpression )
                    // InternalAlf.g:4837:6: lv_argument_2_0= ruleExpression
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

                    // InternalAlf.g:4854:4: (otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) ) )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==30) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // InternalAlf.g:4855:5: otherlv_3= ',' ( (lv_argument_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FOLLOW_56); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getInstanceCreationExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:4859:5: ( (lv_argument_4_0= ruleExpression ) )
                    	    // InternalAlf.g:4860:6: (lv_argument_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:4860:6: (lv_argument_4_0= ruleExpression )
                    	    // InternalAlf.g:4861:7: lv_argument_4_0= ruleExpression
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
                    	    break loop128;
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
    // InternalAlf.g:4888:1: entryRuleSequenceConstructionExpression returns [EObject current=null] : iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF ;
    public final EObject entryRuleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceConstructionExpression = null;


        try {
            // InternalAlf.g:4888:71: (iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF )
            // InternalAlf.g:4889:2: iv_ruleSequenceConstructionExpression= ruleSequenceConstructionExpression EOF
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
    // InternalAlf.g:4895:1: ruleSequenceConstructionExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleSequenceConstructionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_element_2_0 = null;

        EObject lv_element_4_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:4901:2: ( ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalAlf.g:4902:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalAlf.g:4902:2: ( () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}' )
            // InternalAlf.g:4903:3: () otherlv_1= '{' ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalAlf.g:4903:3: ()
            // InternalAlf.g:4904:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceConstructionExpressionAccess().getSequenceConstructionExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_70); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceConstructionExpressionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlf.g:4914:3: ( ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )* )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( ((LA131_0>=RULE_BOOLEAN_VALUE && LA131_0<=RULE_UNRESTRICTED_NAME)||(LA131_0>=17 && LA131_0<=18)||LA131_0==22||(LA131_0>=46 && LA131_0<=47)||LA131_0==50||LA131_0==52) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalAlf.g:4915:4: ( (lv_element_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    {
                    // InternalAlf.g:4915:4: ( (lv_element_2_0= ruleExpression ) )
                    // InternalAlf.g:4916:5: (lv_element_2_0= ruleExpression )
                    {
                    // InternalAlf.g:4916:5: (lv_element_2_0= ruleExpression )
                    // InternalAlf.g:4917:6: lv_element_2_0= ruleExpression
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

                    // InternalAlf.g:4934:4: (otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) ) )*
                    loop130:
                    do {
                        int alt130=2;
                        int LA130_0 = input.LA(1);

                        if ( (LA130_0==30) ) {
                            alt130=1;
                        }


                        switch (alt130) {
                    	case 1 :
                    	    // InternalAlf.g:4935:5: otherlv_3= ',' ( (lv_element_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FOLLOW_56); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getSequenceConstructionExpressionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalAlf.g:4939:5: ( (lv_element_4_0= ruleExpression ) )
                    	    // InternalAlf.g:4940:6: (lv_element_4_0= ruleExpression )
                    	    {
                    	    // InternalAlf.g:4940:6: (lv_element_4_0= ruleExpression )
                    	    // InternalAlf.g:4941:7: lv_element_4_0= ruleExpression
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
                    	    break loop130;
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
    // InternalAlf.g:4968:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalAlf.g:4968:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalAlf.g:4969:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalAlf.g:4975:1: ruleLiteralExpression returns [EObject current=null] : (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteralExpression_0 = null;

        EObject this_BooleanLiteralExpression_1 = null;

        EObject this_StringLiteralExpression_2 = null;

        EObject this_RealLiteralExpression_3 = null;

        EObject this_UnlimitedNaturalLiteralExpression_4 = null;



        	enterRule();

        try {
            // InternalAlf.g:4981:2: ( (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression ) )
            // InternalAlf.g:4982:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            {
            // InternalAlf.g:4982:2: (this_NullLiteralExpression_0= ruleNullLiteralExpression | this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression | this_StringLiteralExpression_2= ruleStringLiteralExpression | this_RealLiteralExpression_3= ruleRealLiteralExpression | this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression )
            int alt132=5;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt132=1;
                }
                break;
            case RULE_BOOLEAN_VALUE:
                {
                alt132=2;
                }
                break;
            case RULE_STRING_VALUE:
                {
                alt132=3;
                }
                break;
            case RULE_NATURAL_VALUE:
                {
                int LA132_4 = input.LA(2);

                if ( (LA132_4==EOF||(LA132_4>=18 && LA132_4<=19)||(LA132_4>=22 && LA132_4<=23)||LA132_4==30||LA132_4==37||LA132_4==39||(LA132_4>=45 && LA132_4<=49)||LA132_4==51) ) {
                    alt132=5;
                }
                else if ( (LA132_4==17) ) {
                    alt132=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 132, 4, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt132=4;
                }
                break;
            case 18:
                {
                alt132=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }

            switch (alt132) {
                case 1 :
                    // InternalAlf.g:4983:3: this_NullLiteralExpression_0= ruleNullLiteralExpression
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
                    // InternalAlf.g:4992:3: this_BooleanLiteralExpression_1= ruleBooleanLiteralExpression
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
                    // InternalAlf.g:5001:3: this_StringLiteralExpression_2= ruleStringLiteralExpression
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
                    // InternalAlf.g:5010:3: this_RealLiteralExpression_3= ruleRealLiteralExpression
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
                    // InternalAlf.g:5019:3: this_UnlimitedNaturalLiteralExpression_4= ruleUnlimitedNaturalLiteralExpression
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
    // InternalAlf.g:5031:1: entryRuleNullLiteralExpression returns [EObject current=null] : iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF ;
    public final EObject entryRuleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpression = null;


        try {
            // InternalAlf.g:5031:62: (iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF )
            // InternalAlf.g:5032:2: iv_ruleNullLiteralExpression= ruleNullLiteralExpression EOF
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
    // InternalAlf.g:5038:1: ruleNullLiteralExpression returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlf.g:5044:2: ( ( () otherlv_1= 'null' ) )
            // InternalAlf.g:5045:2: ( () otherlv_1= 'null' )
            {
            // InternalAlf.g:5045:2: ( () otherlv_1= 'null' )
            // InternalAlf.g:5046:3: () otherlv_1= 'null'
            {
            // InternalAlf.g:5046:3: ()
            // InternalAlf.g:5047:4: 
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
    // InternalAlf.g:5061:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // InternalAlf.g:5061:65: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // InternalAlf.g:5062:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
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
    // InternalAlf.g:5068:1: ruleBooleanLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:5074:2: ( ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) ) )
            // InternalAlf.g:5075:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            {
            // InternalAlf.g:5075:2: ( (lv_value_0_0= RULE_BOOLEAN_VALUE ) )
            // InternalAlf.g:5076:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            {
            // InternalAlf.g:5076:3: (lv_value_0_0= RULE_BOOLEAN_VALUE )
            // InternalAlf.g:5077:4: lv_value_0_0= RULE_BOOLEAN_VALUE
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
    // InternalAlf.g:5096:1: entryRuleStringLiteralExpression returns [EObject current=null] : iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF ;
    public final EObject entryRuleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpression = null;


        try {
            // InternalAlf.g:5096:64: (iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF )
            // InternalAlf.g:5097:2: iv_ruleStringLiteralExpression= ruleStringLiteralExpression EOF
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
    // InternalAlf.g:5103:1: ruleStringLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_VALUE ) ) ;
    public final EObject ruleStringLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:5109:2: ( ( (lv_value_0_0= RULE_STRING_VALUE ) ) )
            // InternalAlf.g:5110:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            {
            // InternalAlf.g:5110:2: ( (lv_value_0_0= RULE_STRING_VALUE ) )
            // InternalAlf.g:5111:3: (lv_value_0_0= RULE_STRING_VALUE )
            {
            // InternalAlf.g:5111:3: (lv_value_0_0= RULE_STRING_VALUE )
            // InternalAlf.g:5112:4: lv_value_0_0= RULE_STRING_VALUE
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
    // InternalAlf.g:5131:1: entryRuleRealLiteralExpression returns [EObject current=null] : iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF ;
    public final EObject entryRuleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteralExpression = null;


        try {
            // InternalAlf.g:5131:62: (iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF )
            // InternalAlf.g:5132:2: iv_ruleRealLiteralExpression= ruleRealLiteralExpression EOF
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
    // InternalAlf.g:5138:1: ruleRealLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= ruleRealValue ) ) ;
    public final EObject ruleRealLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5144:2: ( ( (lv_value_0_0= ruleRealValue ) ) )
            // InternalAlf.g:5145:2: ( (lv_value_0_0= ruleRealValue ) )
            {
            // InternalAlf.g:5145:2: ( (lv_value_0_0= ruleRealValue ) )
            // InternalAlf.g:5146:3: (lv_value_0_0= ruleRealValue )
            {
            // InternalAlf.g:5146:3: (lv_value_0_0= ruleRealValue )
            // InternalAlf.g:5147:4: lv_value_0_0= ruleRealValue
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
    // InternalAlf.g:5167:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalAlf.g:5167:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalAlf.g:5168:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalAlf.g:5174:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_VALUE_0=null;
        Token kw=null;
        Token this_NATURAL_VALUE_2=null;
        Token this_NATURAL_VALUE_4=null;
        Token this_NATURAL_VALUE_9=null;


        	enterRule();

        try {
            // InternalAlf.g:5180:2: ( ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? ) )
            // InternalAlf.g:5181:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            {
            // InternalAlf.g:5181:2: ( ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )? )
            // InternalAlf.g:5182:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) ) ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            {
            // InternalAlf.g:5182:3: ( (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? ) | (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE ) )
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==RULE_NATURAL_VALUE) ) {
                alt134=1;
            }
            else if ( (LA134_0==17) ) {
                alt134=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }
            switch (alt134) {
                case 1 :
                    // InternalAlf.g:5183:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    {
                    // InternalAlf.g:5183:4: (this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )? )
                    // InternalAlf.g:5184:5: this_NATURAL_VALUE_0= RULE_NATURAL_VALUE kw= '.' (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    {
                    this_NATURAL_VALUE_0=(Token)match(input,RULE_NATURAL_VALUE,FOLLOW_9); 

                    					current.merge(this_NATURAL_VALUE_0);
                    				

                    					newLeafNode(this_NATURAL_VALUE_0, grammarAccess.getRealValueAccess().getNATURAL_VALUETerminalRuleCall_0_0_0());
                    				
                    kw=(Token)match(input,17,FOLLOW_72); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getRealValueAccess().getFullStopKeyword_0_0_1());
                    				
                    // InternalAlf.g:5196:5: (this_NATURAL_VALUE_2= RULE_NATURAL_VALUE )?
                    int alt133=2;
                    int LA133_0 = input.LA(1);

                    if ( (LA133_0==RULE_NATURAL_VALUE) ) {
                        alt133=1;
                    }
                    switch (alt133) {
                        case 1 :
                            // InternalAlf.g:5197:6: this_NATURAL_VALUE_2= RULE_NATURAL_VALUE
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
                    // InternalAlf.g:5207:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    {
                    // InternalAlf.g:5207:4: (kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE )
                    // InternalAlf.g:5208:5: kw= '.' this_NATURAL_VALUE_4= RULE_NATURAL_VALUE
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

            // InternalAlf.g:5222:3: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( ((LA137_0>=53 && LA137_0<=54)) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalAlf.g:5223:4: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_NATURAL_VALUE_9= RULE_NATURAL_VALUE
                    {
                    // InternalAlf.g:5223:4: (kw= 'e' | kw= 'E' )
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==53) ) {
                        alt135=1;
                    }
                    else if ( (LA135_0==54) ) {
                        alt135=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 135, 0, input);

                        throw nvae;
                    }
                    switch (alt135) {
                        case 1 :
                            // InternalAlf.g:5224:5: kw= 'e'
                            {
                            kw=(Token)match(input,53,FOLLOW_75); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:5230:5: kw= 'E'
                            {
                            kw=(Token)match(input,54,FOLLOW_75); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getEKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalAlf.g:5236:4: (kw= '+' | kw= '-' )?
                    int alt136=3;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==46) ) {
                        alt136=1;
                    }
                    else if ( (LA136_0==47) ) {
                        alt136=2;
                    }
                    switch (alt136) {
                        case 1 :
                            // InternalAlf.g:5237:5: kw= '+'
                            {
                            kw=(Token)match(input,46,FOLLOW_74); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getRealValueAccess().getPlusSignKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:5243:5: kw= '-'
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
    // InternalAlf.g:5261:1: entryRuleNaturalLiteralExpression returns [EObject current=null] : iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF ;
    public final EObject entryRuleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:5261:65: (iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF )
            // InternalAlf.g:5262:2: iv_ruleNaturalLiteralExpression= ruleNaturalLiteralExpression EOF
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
    // InternalAlf.g:5268:1: ruleNaturalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) ;
    public final EObject ruleNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAlf.g:5274:2: ( ( (lv_value_0_0= RULE_NATURAL_VALUE ) ) )
            // InternalAlf.g:5275:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            {
            // InternalAlf.g:5275:2: ( (lv_value_0_0= RULE_NATURAL_VALUE ) )
            // InternalAlf.g:5276:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            {
            // InternalAlf.g:5276:3: (lv_value_0_0= RULE_NATURAL_VALUE )
            // InternalAlf.g:5277:4: lv_value_0_0= RULE_NATURAL_VALUE
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
    // InternalAlf.g:5296:1: entryRuleUnlimitedNaturalLiteralExpression returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpression = null;


        try {
            // InternalAlf.g:5296:74: (iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF )
            // InternalAlf.g:5297:2: iv_ruleUnlimitedNaturalLiteralExpression= ruleUnlimitedNaturalLiteralExpression EOF
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
    // InternalAlf.g:5303:1: ruleUnlimitedNaturalLiteralExpression returns [EObject current=null] : (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NaturalLiteralExpression_0 = null;



        	enterRule();

        try {
            // InternalAlf.g:5309:2: ( (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) ) )
            // InternalAlf.g:5310:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            {
            // InternalAlf.g:5310:2: (this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression | ( () otherlv_2= '*' ) )
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==RULE_NATURAL_VALUE) ) {
                alt138=1;
            }
            else if ( (LA138_0==18) ) {
                alt138=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }
            switch (alt138) {
                case 1 :
                    // InternalAlf.g:5311:3: this_NaturalLiteralExpression_0= ruleNaturalLiteralExpression
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
                    // InternalAlf.g:5320:3: ( () otherlv_2= '*' )
                    {
                    // InternalAlf.g:5320:3: ( () otherlv_2= '*' )
                    // InternalAlf.g:5321:4: () otherlv_2= '*'
                    {
                    // InternalAlf.g:5321:4: ()
                    // InternalAlf.g:5322:5: 
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
    // InternalAlf.g:5337:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalAlf.g:5337:44: (iv_ruleName= ruleName EOF )
            // InternalAlf.g:5338:2: iv_ruleName= ruleName EOF
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
    // InternalAlf.g:5344:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_UNRESTRICTED_NAME_1=null;


        	enterRule();

        try {
            // InternalAlf.g:5350:2: ( (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME ) )
            // InternalAlf.g:5351:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            {
            // InternalAlf.g:5351:2: (this_ID_0= RULE_ID | this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME )
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==RULE_ID) ) {
                alt139=1;
            }
            else if ( (LA139_0==RULE_UNRESTRICTED_NAME) ) {
                alt139=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;
            }
            switch (alt139) {
                case 1 :
                    // InternalAlf.g:5352:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlf.g:5360:3: this_UNRESTRICTED_NAME_1= RULE_UNRESTRICTED_NAME
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
    // InternalAlf.g:5371:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAlf.g:5371:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAlf.g:5372:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAlf.g:5378:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_ColonQualifiedName_1 = null;

        AntlrDatatypeRuleToken this_DotQualifiedName_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:5384:2: ( (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName ) )
            // InternalAlf.g:5385:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            {
            // InternalAlf.g:5385:2: (this_Name_0= ruleName | this_ColonQualifiedName_1= ruleColonQualifiedName | this_DotQualifiedName_2= ruleDotQualifiedName )
            int alt140=3;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    alt140=3;
                    }
                    break;
                case 16:
                    {
                    alt140=2;
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
                    alt140=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 140, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA140_0==RULE_UNRESTRICTED_NAME) ) {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    alt140=3;
                    }
                    break;
                case 16:
                    {
                    alt140=2;
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
                    alt140=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 140, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }
            switch (alt140) {
                case 1 :
                    // InternalAlf.g:5386:3: this_Name_0= ruleName
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
                    // InternalAlf.g:5397:3: this_ColonQualifiedName_1= ruleColonQualifiedName
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
                    // InternalAlf.g:5408:3: this_DotQualifiedName_2= ruleDotQualifiedName
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
    // InternalAlf.g:5422:1: entryRuleColonQualifiedName returns [String current=null] : iv_ruleColonQualifiedName= ruleColonQualifiedName EOF ;
    public final String entryRuleColonQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColonQualifiedName = null;


        try {
            // InternalAlf.g:5422:58: (iv_ruleColonQualifiedName= ruleColonQualifiedName EOF )
            // InternalAlf.g:5423:2: iv_ruleColonQualifiedName= ruleColonQualifiedName EOF
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
    // InternalAlf.g:5429:1: ruleColonQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleColonQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:5435:2: ( (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:5436:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:5436:2: (this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+ )
            // InternalAlf.g:5437:3: this_Name_0= ruleName (kw= '::' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getColonQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:5447:3: (kw= '::' this_Name_2= ruleName )+
            int cnt141=0;
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==16) ) {
                    int LA141_1 = input.LA(2);

                    if ( ((LA141_1>=RULE_ID && LA141_1<=RULE_UNRESTRICTED_NAME)) ) {
                        alt141=1;
                    }


                }


                switch (alt141) {
            	case 1 :
            	    // InternalAlf.g:5448:4: kw= '::' this_Name_2= ruleName
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
            	    if ( cnt141 >= 1 ) break loop141;
                        EarlyExitException eee =
                            new EarlyExitException(141, input);
                        throw eee;
                }
                cnt141++;
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
    // InternalAlf.g:5468:1: entryRuleDotQualifiedName returns [String current=null] : iv_ruleDotQualifiedName= ruleDotQualifiedName EOF ;
    public final String entryRuleDotQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDotQualifiedName = null;


        try {
            // InternalAlf.g:5468:56: (iv_ruleDotQualifiedName= ruleDotQualifiedName EOF )
            // InternalAlf.g:5469:2: iv_ruleDotQualifiedName= ruleDotQualifiedName EOF
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
    // InternalAlf.g:5475:1: ruleDotQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) ;
    public final AntlrDatatypeRuleToken ruleDotQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;



        	enterRule();

        try {
            // InternalAlf.g:5481:2: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ ) )
            // InternalAlf.g:5482:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            {
            // InternalAlf.g:5482:2: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+ )
            // InternalAlf.g:5483:3: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )+
            {

            			newCompositeNode(grammarAccess.getDotQualifiedNameAccess().getNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Name_0=ruleName();

            state._fsp--;


            			current.merge(this_Name_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAlf.g:5493:3: (kw= '.' this_Name_2= ruleName )+
            int cnt142=0;
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==17) ) {
                    int LA142_1 = input.LA(2);

                    if ( ((LA142_1>=RULE_ID && LA142_1<=RULE_UNRESTRICTED_NAME)) ) {
                        alt142=1;
                    }


                }


                switch (alt142) {
            	case 1 :
            	    // InternalAlf.g:5494:4: kw= '.' this_Name_2= ruleName
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
            	    if ( cnt142 >= 1 ) break loop142;
                        EarlyExitException eee =
                            new EarlyExitException(142, input);
                        throw eee;
                }
                cnt142++;
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


    // $ANTLR start "ruleImportVisibilityIndicator"
    // InternalAlf.g:5514:1: ruleImportVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator ruleImportVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAlf.g:5520:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // InternalAlf.g:5521:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // InternalAlf.g:5521:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==55) ) {
                alt143=1;
            }
            else if ( (LA143_0==56) ) {
                alt143=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }
            switch (alt143) {
                case 1 :
                    // InternalAlf.g:5522:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:5522:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:5523:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getImportVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getImportVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:5530:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:5530:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:5531:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getImportVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getImportVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleImportVisibilityIndicator"


    // $ANTLR start "ruleVisibilityIndicator"
    // InternalAlf.g:5541:1: ruleVisibilityIndicator returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) ;
    public final Enumerator ruleVisibilityIndicator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAlf.g:5547:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) ) )
            // InternalAlf.g:5548:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            {
            // InternalAlf.g:5548:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'packaged' ) )
            int alt144=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt144=1;
                }
                break;
            case 56:
                {
                alt144=2;
                }
                break;
            case 57:
                {
                alt144=3;
                }
                break;
            case 58:
                {
                alt144=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 144, 0, input);

                throw nvae;
            }

            switch (alt144) {
                case 1 :
                    // InternalAlf.g:5549:3: (enumLiteral_0= 'public' )
                    {
                    // InternalAlf.g:5549:3: (enumLiteral_0= 'public' )
                    // InternalAlf.g:5550:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityIndicatorAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:5557:3: (enumLiteral_1= 'private' )
                    {
                    // InternalAlf.g:5557:3: (enumLiteral_1= 'private' )
                    // InternalAlf.g:5558:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityIndicatorAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:5565:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalAlf.g:5565:3: (enumLiteral_2= 'protected' )
                    // InternalAlf.g:5566:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityIndicatorAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlf.g:5573:3: (enumLiteral_3= 'packaged' )
                    {
                    // InternalAlf.g:5573:3: (enumLiteral_3= 'packaged' )
                    // InternalAlf.g:5574:4: enumLiteral_3= 'packaged'
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
    // InternalAlf.g:5584:1: ruleFeatureDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFeatureDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAlf.g:5590:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // InternalAlf.g:5591:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // InternalAlf.g:5591:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt145=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt145=1;
                }
                break;
            case 60:
                {
                alt145=2;
                }
                break;
            case 61:
                {
                alt145=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }

            switch (alt145) {
                case 1 :
                    // InternalAlf.g:5592:3: (enumLiteral_0= 'in' )
                    {
                    // InternalAlf.g:5592:3: (enumLiteral_0= 'in' )
                    // InternalAlf.g:5593:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFeatureDirectionAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:5600:3: (enumLiteral_1= 'out' )
                    {
                    // InternalAlf.g:5600:3: (enumLiteral_1= 'out' )
                    // InternalAlf.g:5601:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFeatureDirectionAccess().getOutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlf.g:5608:3: (enumLiteral_2= 'inout' )
                    {
                    // InternalAlf.g:5608:3: (enumLiteral_2= 'inout' )
                    // InternalAlf.g:5609:4: enumLiteral_2= 'inout'
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
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA88 dfa88 = new DFA88(this);
    protected DFA97 dfa97 = new DFA97(this);
    protected DFA103 dfa103 = new DFA103(this);
    protected DFA112 dfa112 = new DFA112(this);
    protected DFA127 dfa127 = new DFA127(this);
    static final String dfa_1s = "\34\uffff";
    static final String dfa_2s = "\1\4\2\17\1\10\1\4\1\uffff\1\31\2\uffff\2\20\1\uffff\3\10\1\4\2\20\1\23\2\21\2\23\1\10\1\4\1\10\2\23";
    static final String dfa_3s = "\1\70\2\17\1\11\1\34\1\uffff\1\32\2\uffff\2\24\1\uffff\2\22\1\11\1\70\2\24\1\23\2\24\2\23\1\22\1\70\1\22\2\23";
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
            "\1\14\1\15\1\uffff\1\17\1\16",
            "\1\14\1\15\1\uffff\1\17\1\16",
            "",
            "\1\20\1\21\10\uffff\1\22",
            "\1\23\1\24\10\uffff\1\22",
            "\1\25\1\26",
            "\1\4\12\uffff\1\3\5\uffff\1\5\3\uffff\1\7\1\10\1\uffff\1\6\32\uffff\1\1\1\2",
            "\1\27\2\uffff\1\17\1\16",
            "\1\27\2\uffff\1\17\1\16",
            "\1\30",
            "\1\31\1\uffff\1\17\1\16",
            "\1\31\1\uffff\1\17\1\16",
            "\1\17",
            "\1\17",
            "\1\20\1\21\10\uffff\1\32",
            "\1\4\12\uffff\1\3\5\uffff\1\5\3\uffff\1\7\1\10\1\uffff\1\6\32\uffff\1\1\1\2",
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
    static final String dfa_7s = "\21\uffff";
    static final String dfa_8s = "\1\4\1\uffff\2\17\1\10\2\20\2\10\1\uffff\2\20\1\uffff\2\21\2\10";
    static final String dfa_9s = "\1\70\1\uffff\2\17\1\11\2\24\2\22\1\uffff\2\24\1\uffff\2\24\2\22";
    static final String dfa_10s = "\1\uffff\1\3\7\uffff\1\2\2\uffff\1\1\4\uffff";
    static final String dfa_11s = "\21\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\12\uffff\1\4\5\uffff\1\1\41\uffff\1\2\1\3",
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
    static final String dfa_13s = "\1\4\2\uffff\3\10\2\20\2\10\2\20\1\uffff\2\21\2\10";
    static final String dfa_14s = "\1\70\2\uffff\2\34\1\11\2\24\2\22\2\24\1\uffff\2\24\2\22";
    static final String dfa_15s = "\1\uffff\1\3\1\1\11\uffff\1\2\4\uffff";
    static final String[] dfa_16s = {
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

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_16;
        }
        public String getDescription() {
            return "()* loopback of 614:3: ( ( (lv_ownedMembership_3_0= rulePackageMember ) ) | ( (lv_ownedImport_4_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_17s = "\6\uffff";
    static final String dfa_18s = "\2\4\2\10\2\uffff";
    static final String dfa_19s = "\2\70\2\34\2\uffff";
    static final String dfa_20s = "\4\uffff\1\1\1\2";
    static final String dfa_21s = "\6\uffff}>";
    static final String[] dfa_22s = {
            "\1\1\3\uffff\2\5\5\uffff\1\4\5\uffff\1\4\3\uffff\2\4\1\5\1\4\32\uffff\1\2\1\3",
            "\1\1\3\uffff\2\5\5\uffff\1\4\5\uffff\1\4\3\uffff\2\4\1\5\1\4\32\uffff\1\2\1\3",
            "\2\5\5\uffff\1\4\5\uffff\1\4\3\uffff\2\4\1\5\1\4",
            "\2\5\5\uffff\1\4\5\uffff\1\4\3\uffff\2\4\1\5\1\4",
            "",
            ""
    };

    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_17;
            this.eof = dfa_17;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_21;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "702:2: (this_NonFeaturePackageMember_0= ruleNonFeaturePackageMember | this_FeaturePackageMember_1= ruleFeaturePackageMember )";
        }
    }
    static final String dfa_23s = "\37\uffff";
    static final String dfa_24s = "\1\17\1\10\1\uffff\2\10\1\uffff\2\26\1\uffff\4\26\2\10\4\20\4\10\2\21\2\20\2\21\2\20";
    static final String dfa_25s = "\1\34\1\30\1\uffff\2\30\1\uffff\2\30\1\uffff\4\35\2\11\4\36\4\11\10\36";
    static final String dfa_26s = "\2\uffff\1\1\2\uffff\1\3\2\uffff\1\2\26\uffff";
    static final String dfa_27s = "\37\uffff}>";
    static final String[] dfa_28s = {
            "\1\5\5\uffff\1\1\3\uffff\1\3\1\4\1\uffff\1\2",
            "\1\6\1\7\16\uffff\1\10",
            "",
            "\1\11\1\12\16\uffff\1\10",
            "\1\13\1\14\16\uffff\1\10",
            "",
            "\1\2\1\uffff\1\10",
            "\1\2\1\uffff\1\10",
            "",
            "\1\2\1\uffff\1\15\4\uffff\1\2",
            "\1\2\1\uffff\1\15\4\uffff\1\2",
            "\1\2\1\uffff\1\16\4\uffff\1\2",
            "\1\2\1\uffff\1\16\4\uffff\1\2",
            "\1\17\1\20",
            "\1\21\1\22",
            "\1\24\1\23\1\uffff\1\10\2\uffff\1\2\7\uffff\1\2",
            "\1\24\1\23\1\uffff\1\10\2\uffff\1\2\7\uffff\1\2",
            "\1\26\1\25\1\uffff\1\10\2\uffff\1\2\7\uffff\1\2",
            "\1\26\1\25\1\uffff\1\10\2\uffff\1\2\7\uffff\1\2",
            "\1\27\1\30",
            "\1\31\1\32",
            "\1\33\1\34",
            "\1\35\1\36",
            "\1\23\1\uffff\1\10\2\uffff\1\2\7\uffff\1\2",
            "\1\23\1\uffff\1\10\2\uffff\1\2\7\uffff\1\2",
            "\1\24\2\uffff\1\10\2\uffff\1\2\7\uffff\1\2",
            "\1\24\2\uffff\1\10\2\uffff\1\2\7\uffff\1\2",
            "\1\25\1\uffff\1\10\2\uffff\1\2\7\uffff\1\2",
            "\1\25\1\uffff\1\10\2\uffff\1\2\7\uffff\1\2",
            "\1\26\2\uffff\1\10\2\uffff\1\2\7\uffff\1\2",
            "\1\26\2\uffff\1\10\2\uffff\1\2\7\uffff\1\2"
    };

    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_23;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "777:3: ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'import' ( ( ruleQualifiedName ) ) (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )? otherlv_12= ';' ) )";
        }
    }
    static final String dfa_29s = "\33\uffff";
    static final String dfa_30s = "\2\10\4\23\1\10\2\uffff\1\10\4\20\1\10\1\uffff\3\10\2\20\2\21\2\20\2\21";
    static final String dfa_31s = "\1\33\5\53\1\11\2\uffff\1\11\4\51\1\11\1\uffff\3\11\10\51";
    static final String dfa_32s = "\7\uffff\1\2\1\1\6\uffff\1\3\13\uffff";
    static final String dfa_33s = "\33\uffff}>";
    static final String[] dfa_34s = {
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
            "\1\16\1\20\1\uffff\1\17\2\uffff\1\7\16\uffff\1\7\3\uffff\1\7",
            "\1\16\1\20\1\uffff\1\17\2\uffff\1\7\16\uffff\1\7\3\uffff\1\7",
            "\1\21\1\22\1\uffff\1\17\2\uffff\1\10\16\uffff\1\10\3\uffff\1\10",
            "\1\21\1\22\1\uffff\1\17\2\uffff\1\10\16\uffff\1\10\3\uffff\1\10",
            "\1\23\1\24",
            "",
            "\1\25\1\26",
            "\1\27\1\30",
            "\1\31\1\32",
            "\1\16\2\uffff\1\17\2\uffff\1\7\16\uffff\1\7\3\uffff\1\7",
            "\1\16\2\uffff\1\17\2\uffff\1\7\16\uffff\1\7\3\uffff\1\7",
            "\1\20\1\uffff\1\17\2\uffff\1\7\16\uffff\1\7\3\uffff\1\7",
            "\1\20\1\uffff\1\17\2\uffff\1\7\16\uffff\1\7\3\uffff\1\7",
            "\1\21\2\uffff\1\17\2\uffff\1\10\16\uffff\1\10\3\uffff\1\10",
            "\1\21\2\uffff\1\17\2\uffff\1\10\16\uffff\1\10\3\uffff\1\10",
            "\1\22\1\uffff\1\17\2\uffff\1\10\16\uffff\1\10\3\uffff\1\10",
            "\1\22\1\uffff\1\17\2\uffff\1\10\16\uffff\1\10\3\uffff\1\10"
    };

    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[][] dfa_34 = unpackEncodedStringArray(dfa_34s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_29;
            this.eof = dfa_29;
            this.min = dfa_30;
            this.max = dfa_31;
            this.accept = dfa_32;
            this.special = dfa_33;
            this.transition = dfa_34;
        }
        public String getDescription() {
            return "996:3: ( ( (otherlv_2= 'feature' )? ( (lv_ownedMemberElement_3_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_4= 'feature' ( (lv_ownedMemberElement_5_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_6= 'feature' ( (lv_memberName_7_0= ruleName ) )? ) | ( (lv_memberName_8_0= ruleName ) ) ) otherlv_9= 'is' ( ( ruleQualifiedName ) ) otherlv_11= ';' ) )";
        }
    }
    static final String dfa_35s = "\1\4\1\uffff\2\17\1\10\2\20\1\uffff\2\10\2\21\1\uffff\2\20\2\10";
    static final String dfa_36s = "\1\70\1\uffff\2\17\1\11\2\24\1\uffff\2\22\2\24\1\uffff\2\24\2\22";
    static final String dfa_37s = "\1\uffff\1\3\5\uffff\1\2\4\uffff\1\1\4\uffff";
    static final String[] dfa_38s = {
            "\1\1\12\uffff\1\4\11\uffff\1\1\2\uffff\1\1\32\uffff\1\2\1\3",
            "",
            "\1\4",
            "\1\4",
            "\1\5\1\6",
            "\1\11\1\10\1\uffff\2\7",
            "\1\11\1\10\1\uffff\2\7",
            "",
            "\1\12\1\13\10\uffff\1\14",
            "\1\15\1\16\10\uffff\1\14",
            "\1\17\1\uffff\2\7",
            "\1\17\1\uffff\2\7",
            "",
            "\1\20\2\uffff\2\7",
            "\1\20\2\uffff\2\7",
            "\1\12\1\13\10\uffff\1\14",
            "\1\15\1\16\10\uffff\1\14"
    };
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_37;
            this.special = dfa_11;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "()* loopback of 1144:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )*";
        }
    }
    static final String dfa_39s = "\1\4\2\uffff\3\10\2\20\2\10\1\uffff\2\21\2\20\2\10";
    static final String dfa_40s = "\1\75\2\uffff\2\75\1\11\2\24\2\22\1\uffff\4\24\2\22";
    static final String dfa_41s = "\1\uffff\1\3\1\1\7\uffff\1\2\6\uffff";
    static final String[] dfa_42s = {
            "\1\2\3\uffff\2\2\5\uffff\1\5\5\uffff\1\2\1\uffff\1\1\1\uffff\4\2\2\uffff\3\2\25\uffff\1\3\1\4\5\2",
            "",
            "",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2\2\uffff\3\2\31\uffff\3\2",
            "\2\2\5\uffff\1\5\5\uffff\1\2\3\uffff\4\2\2\uffff\3\2\31\uffff\3\2",
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
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[][] dfa_42 = unpackEncodedStringArray(dfa_42s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_11;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()* loopback of 1302:3: ( ( (lv_ownedMembership_12_0= ruleClassMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_43s = "\1\75\2\uffff\2\75\1\11\2\24\2\22\2\24\1\uffff\2\24\2\22";
    static final String[] dfa_44s = {
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
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_43;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "()* loopback of 1464:3: ( ( (lv_ownedMembership_9_0= ruleClassMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_45s = "\10\uffff";
    static final String dfa_46s = "\2\4\4\10\2\uffff";
    static final String dfa_47s = "\6\75\2\uffff";
    static final String dfa_48s = "\6\uffff\1\1\1\2";
    static final String dfa_49s = "\10\uffff}>";
    static final String[] dfa_50s = {
            "\1\1\3\uffff\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\25\uffff\1\2\1\3\1\4\1\5\3\7",
            "\1\1\3\uffff\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\25\uffff\1\2\1\3\1\4\1\5\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\31\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\31\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\31\uffff\3\7",
            "\2\7\5\uffff\1\6\5\uffff\1\6\3\uffff\2\6\1\7\1\6\2\uffff\3\7\31\uffff\3\7",
            "",
            ""
    };

    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[][] dfa_50 = unpackEncodedStringArray(dfa_50s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_45;
            this.eof = dfa_45;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_48;
            this.special = dfa_49;
            this.transition = dfa_50;
        }
        public String getDescription() {
            return "1585:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_FeatureClassMember_1= ruleFeatureClassMember )";
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_23;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "1660:3: ( ( (lv_ownedMemberElement_2_0= ruleNonFeatureDefinition ) ) | ( ruleNonFeatureMemberKind ( (lv_memberName_4_0= ruleName ) )? otherlv_5= 'is' ( ( ruleQualifiedName ) ) otherlv_7= ';' ) | (otherlv_8= 'import' ( ( ruleQualifiedName ) ) (otherlv_10= 'as' ( (lv_memberName_11_0= ruleName ) ) )? otherlv_12= ';' ) )";
        }
    }
    static final String dfa_51s = "\41\uffff";
    static final String dfa_52s = "\4\10\1\uffff\2\23\1\uffff\3\10\2\23\1\10\1\uffff\1\10\4\20\1\uffff\4\10\2\21\2\20\2\21\2\20";
    static final String dfa_53s = "\4\75\1\uffff\2\53\1\uffff\5\53\1\11\1\uffff\1\11\4\51\1\uffff\4\11\10\51";
    static final String dfa_54s = "\4\uffff\1\1\2\uffff\1\3\6\uffff\1\2\5\uffff\1\4\14\uffff";
    static final String dfa_55s = "\41\uffff}>";
    static final String[] dfa_56s = {
            "\1\5\1\6\21\uffff\1\1\3\uffff\1\2\1\3\1\7\31\uffff\3\4",
            "\1\13\1\14\16\uffff\1\15\21\uffff\2\16\17\uffff\1\10\1\11\1\12",
            "\1\13\1\14\16\uffff\1\15\21\uffff\2\16\17\uffff\1\10\1\11\1\12",
            "\2\4\16\uffff\1\16\21\uffff\2\16\17\uffff\1\10\1\11\1\12",
            "",
            "\1\4\2\uffff\1\4\1\uffff\1\17\12\uffff\1\4\1\uffff\1\4\3\uffff\3\4",
            "\1\4\2\uffff\1\4\1\uffff\1\17\12\uffff\1\4\1\uffff\1\4\3\uffff\3\4",
            "",
            "\2\4\16\uffff\1\16\21\uffff\2\16",
            "\2\4\16\uffff\1\16\21\uffff\2\16",
            "\2\4\16\uffff\1\16\21\uffff\2\16",
            "\1\4\2\uffff\1\4\1\uffff\1\17\12\uffff\1\4\1\uffff\1\4\3\uffff\3\4",
            "\1\4\2\uffff\1\4\1\uffff\1\17\12\uffff\1\4\1\uffff\1\4\3\uffff\3\4",
            "\1\20\1\21",
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

    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[][] dfa_56 = unpackEncodedStringArray(dfa_56s);

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = dfa_51;
            this.eof = dfa_51;
            this.min = dfa_52;
            this.max = dfa_53;
            this.accept = dfa_54;
            this.special = dfa_55;
            this.transition = dfa_56;
        }
        public String getDescription() {
            return "1843:3: ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) )? ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleNamedFeatureDefinition ) ) ) | ( (otherlv_7= 'feature' | ( (lv_isComposite_8_0= 'part' ) ) | ( (lv_isPort_9_0= 'port' ) ) ) ( (lv_direction_10_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_11_0= ruleUnnamedFeatureDefinition ) ) ) | (otherlv_12= 'connector' ( (lv_ownedMemberElement_13_0= ruleConnectorDefinition ) ) ) | ( ( ( (otherlv_14= 'feature' | ( (lv_isComposite_15_0= 'part' ) ) ) ( (lv_memberName_16_0= ruleName ) )? ) | ( (lv_memberName_17_0= ruleName ) ) ) otherlv_18= 'is' ( ( ruleQualifiedName ) ) otherlv_20= ';' ) )";
        }
    }
    static final String dfa_57s = "\1\4\1\uffff\2\17\1\10\2\20\2\10\2\uffff\2\20\2\21\2\10";
    static final String dfa_58s = "\1\70\1\uffff\2\17\1\11\2\24\2\22\2\uffff\4\24\2\22";
    static final String dfa_59s = "\1\uffff\1\3\7\uffff\1\2\1\1\6\uffff";
    static final String[] dfa_60s = {
            "\1\1\12\uffff\1\4\12\uffff\1\1\1\uffff\1\1\32\uffff\1\2\1\3",
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
    static final char[] dfa_57 = DFA.unpackEncodedStringToUnsignedChars(dfa_57s);
    static final char[] dfa_58 = DFA.unpackEncodedStringToUnsignedChars(dfa_58s);
    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final short[][] dfa_60 = unpackEncodedStringArray(dfa_60s);

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_57;
            this.max = dfa_58;
            this.accept = dfa_59;
            this.special = dfa_11;
            this.transition = dfa_60;
        }
        public String getDescription() {
            return "()* loopback of 2134:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )*";
        }
    }
    static final String[] dfa_61s = {
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
    static final short[][] dfa_61 = unpackEncodedStringArray(dfa_61s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_43;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_61;
        }
        public String getDescription() {
            return "()* loopback of 2292:3: ( ( (lv_ownedMembership_12_0= ruleAssociationMember ) ) | ( (lv_ownedImport_13_0= rulePackageImport ) ) )*";
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_43;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_61;
        }
        public String getDescription() {
            return "()* loopback of 2454:3: ( ( (lv_ownedMembership_9_0= ruleAssociationMember ) ) | ( (lv_ownedImport_10_0= rulePackageImport ) ) )*";
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

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_62;
            this.eof = dfa_62;
            this.min = dfa_63;
            this.max = dfa_64;
            this.accept = dfa_65;
            this.special = dfa_66;
            this.transition = dfa_67;
        }
        public String getDescription() {
            return "2542:2: (this_NonFeatureClassMember_0= ruleNonFeatureClassMember | this_AssociationFeatureMember_1= ruleAssociationFeatureMember | this_AssociationEndFeatureMember_2= ruleAssociationEndFeatureMember )";
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

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_68;
            this.eof = dfa_68;
            this.min = dfa_69;
            this.max = dfa_70;
            this.accept = dfa_71;
            this.special = dfa_72;
            this.transition = dfa_73;
        }
        public String getDescription() {
            return "2626:3: ( ( (otherlv_2= 'feature' | ( (lv_isComposite_3_0= 'part' ) ) | ( (lv_isPort_4_0= 'port' ) ) ) ( (lv_direction_5_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_6_0= ruleFeatureDefinition ) ) ) | (otherlv_7= 'connector' ( (lv_ownedMemberElement_8_0= ruleConnectorDefinition ) ) ) | ( (otherlv_9= 'feature' | ( (lv_isComposite_10_0= 'part' ) ) ) ( (lv_memberName_11_0= ruleName ) )? otherlv_12= 'is' ( ( ruleQualifiedName ) ) otherlv_14= ';' ) )";
        }
    }
    static final String dfa_74s = "\36\uffff";
    static final String dfa_75s = "\2\10\1\uffff\2\23\3\10\1\uffff\1\10\2\23\1\10\4\20\2\10\1\uffff\2\10\2\21\2\20\2\21\2\20";
    static final String dfa_76s = "\2\75\1\uffff\5\53\1\uffff\1\11\2\53\1\11\4\51\2\11\1\uffff\2\11\10\51";
    static final String dfa_77s = "\2\uffff\1\1\5\uffff\1\2\12\uffff\1\3\12\uffff";
    static final String dfa_78s = "\36\uffff}>";
    static final String[] dfa_79s = {
            "\1\3\1\4\30\uffff\1\1\30\uffff\3\2",
            "\1\12\1\13\16\uffff\1\11\21\uffff\2\10\17\uffff\1\5\1\6\1\7",
            "",
            "\1\2\2\uffff\1\2\1\uffff\1\14\12\uffff\1\2\1\uffff\1\2\3\uffff\3\2",
            "\1\2\2\uffff\1\2\1\uffff\1\14\12\uffff\1\2\1\uffff\1\2\3\uffff\3\2",
            "\2\2\16\uffff\1\10\21\uffff\2\10",
            "\2\2\16\uffff\1\10\21\uffff\2\10",
            "\2\2\16\uffff\1\10\21\uffff\2\10",
            "",
            "\1\15\1\16",
            "\1\2\2\uffff\1\2\1\uffff\1\14\12\uffff\1\2\1\uffff\1\2\3\uffff\3\2",
            "\1\2\2\uffff\1\2\1\uffff\1\14\12\uffff\1\2\1\uffff\1\2\3\uffff\3\2",
            "\1\17\1\20",
            "\1\22\1\21\1\uffff\1\23\2\uffff\1\10\16\uffff\1\10\3\uffff\1\10",
            "\1\22\1\21\1\uffff\1\23\2\uffff\1\10\16\uffff\1\10\3\uffff\1\10",
            "\1\25\1\24\1\uffff\1\23\2\uffff\1\2\16\uffff\1\2\3\uffff\1\2",
            "\1\25\1\24\1\uffff\1\23\2\uffff\1\2\16\uffff\1\2\3\uffff\1\2",
            "\1\26\1\27",
            "\1\30\1\31",
            "",
            "\1\32\1\33",
            "\1\34\1\35",
            "\1\21\1\uffff\1\23\2\uffff\1\10\16\uffff\1\10\3\uffff\1\10",
            "\1\21\1\uffff\1\23\2\uffff\1\10\16\uffff\1\10\3\uffff\1\10",
            "\1\22\2\uffff\1\23\2\uffff\1\10\16\uffff\1\10\3\uffff\1\10",
            "\1\22\2\uffff\1\23\2\uffff\1\10\16\uffff\1\10\3\uffff\1\10",
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

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = dfa_74;
            this.eof = dfa_74;
            this.min = dfa_75;
            this.max = dfa_76;
            this.accept = dfa_77;
            this.special = dfa_78;
            this.transition = dfa_79;
        }
        public String getDescription() {
            return "2854:3: ( ( (otherlv_2= 'end' )? ( (lv_direction_3_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_4_0= ruleNamedFeatureDefinition ) ) ) | (otherlv_5= 'end' ( (lv_direction_6_0= ruleFeatureDirection ) )? ( (lv_ownedMemberElement_7_0= ruleUnnamedFeatureDefinition ) ) ) | ( ( (otherlv_8= 'end' ( (lv_memberName_9_0= ruleName ) )? ) | ( (lv_memberName_10_0= ruleName ) ) ) otherlv_11= 'is' ( ( ruleQualifiedName ) ) otherlv_13= ';' ) )";
        }
    }
    static final String dfa_80s = "\1\4\1\uffff\2\17\1\10\2\20\1\10\1\uffff\1\10\2\20\1\uffff\2\21\2\10";
    static final String dfa_81s = "\1\70\1\uffff\2\17\1\11\2\24\1\22\1\uffff\1\22\2\24\1\uffff\2\24\2\22";
    static final String dfa_82s = "\1\uffff\1\3\6\uffff\1\2\3\uffff\1\1\4\uffff";
    static final String[] dfa_83s = {
            "\1\1\12\uffff\1\4\47\uffff\1\2\1\3",
            "",
            "\1\4",
            "\1\4",
            "\1\5\1\6",
            "\1\7\1\11\1\uffff\2\10",
            "\1\7\1\11\1\uffff\2\10",
            "\1\12\1\13\10\uffff\1\14",
            "",
            "\1\15\1\16\10\uffff\1\14",
            "\1\17\2\uffff\2\10",
            "\1\17\2\uffff\2\10",
            "",
            "\1\20\1\uffff\2\10",
            "\1\20\1\uffff\2\10",
            "\1\12\1\13\10\uffff\1\14",
            "\1\15\1\16\10\uffff\1\14"
    };
    static final char[] dfa_80 = DFA.unpackEncodedStringToUnsignedChars(dfa_80s);
    static final char[] dfa_81 = DFA.unpackEncodedStringToUnsignedChars(dfa_81s);
    static final short[] dfa_82 = DFA.unpackEncodedString(dfa_82s);
    static final short[][] dfa_83 = unpackEncodedStringArray(dfa_83s);

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_80;
            this.max = dfa_81;
            this.accept = dfa_82;
            this.special = dfa_11;
            this.transition = dfa_83;
        }
        public String getDescription() {
            return "()* loopback of 3040:3: ( ( (lv_ownedImport_0_0= rulePackageImport ) ) | ( (lv_ownedMembership_1_0= ruleElementImport ) ) )*";
        }
    }

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_11;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()* loopback of 3252:4: ( ( (lv_ownedMembership_16_0= ruleClassMember ) ) | ( (lv_ownedImport_17_0= rulePackageImport ) ) )*";
        }
    }

    class DFA97 extends DFA {

        public DFA97(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 97;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_43;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "()* loopback of 3526:7: ( ( (lv_ownedMembership_15_0= ruleClassMember ) ) | ( (lv_ownedImport_16_0= rulePackageImport ) ) )*";
        }
    }

    class DFA103 extends DFA {

        public DFA103(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 103;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_11;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()* loopback of 3719:9: ( ( (lv_ownedMembership_31_0= ruleClassMember ) ) | ( (lv_ownedImport_32_0= rulePackageImport ) ) )*";
        }
    }

    class DFA112 extends DFA {

        public DFA112(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 112;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_43;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "()* loopback of 3991:7: ( ( (lv_ownedMembership_13_0= ruleClassMember ) ) | ( (lv_ownedImport_14_0= rulePackageImport ) ) )*";
        }
    }
    static final String dfa_84s = "\16\uffff";
    static final String dfa_85s = "\2\uffff\2\11\6\uffff\4\11";
    static final String dfa_86s = "\1\5\1\uffff\2\20\2\uffff\2\10\2\uffff\2\20\2\21";
    static final String dfa_87s = "\1\64\1\uffff\2\63\2\uffff\2\11\2\uffff\4\63";
    static final String dfa_88s = "\1\uffff\1\1\2\uffff\1\4\1\5\2\uffff\1\3\1\2\4\uffff";
    static final String dfa_89s = "\16\uffff}>";
    static final String[] dfa_90s = {
            "\3\1\1\2\1\3\7\uffff\2\1\3\uffff\1\4\33\uffff\1\5\1\uffff\1\1",
            "",
            "\1\6\1\7\2\11\2\uffff\2\11\6\uffff\1\11\6\uffff\1\11\1\uffff\1\11\5\uffff\5\11\1\10\1\11",
            "\1\6\1\7\2\11\2\uffff\2\11\6\uffff\1\11\6\uffff\1\11\1\uffff\1\11\5\uffff\5\11\1\10\1\11",
            "",
            "",
            "\1\12\1\13",
            "\1\14\1\15",
            "",
            "",
            "\1\6\1\uffff\2\11\2\uffff\2\11\6\uffff\1\11\6\uffff\1\11\1\uffff\1\11\5\uffff\5\11\1\10\1\11",
            "\1\6\1\uffff\2\11\2\uffff\2\11\6\uffff\1\11\6\uffff\1\11\1\uffff\1\11\5\uffff\5\11\1\10\1\11",
            "\1\7\2\11\2\uffff\2\11\6\uffff\1\11\6\uffff\1\11\1\uffff\1\11\5\uffff\5\11\1\10\1\11",
            "\1\7\2\11\2\uffff\2\11\6\uffff\1\11\6\uffff\1\11\1\uffff\1\11\5\uffff\5\11\1\10\1\11"
    };

    static final short[] dfa_84 = DFA.unpackEncodedString(dfa_84s);
    static final short[] dfa_85 = DFA.unpackEncodedString(dfa_85s);
    static final char[] dfa_86 = DFA.unpackEncodedStringToUnsignedChars(dfa_86s);
    static final char[] dfa_87 = DFA.unpackEncodedStringToUnsignedChars(dfa_87s);
    static final short[] dfa_88 = DFA.unpackEncodedString(dfa_88s);
    static final short[] dfa_89 = DFA.unpackEncodedString(dfa_89s);
    static final short[][] dfa_90 = unpackEncodedStringArray(dfa_90s);

    class DFA127 extends DFA {

        public DFA127(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 127;
            this.eot = dfa_84;
            this.eof = dfa_85;
            this.min = dfa_86;
            this.max = dfa_87;
            this.accept = dfa_88;
            this.special = dfa_89;
            this.transition = dfa_90;
        }
        public String getDescription() {
            return "4707:2: (this_LiteralExpression_0= ruleLiteralExpression | this_ElementReferenceExpression_1= ruleElementReferenceExpression | this_InstanceCreationExpression_2= ruleInstanceCreationExpression | this_SequenceConstructionExpression_3= ruleSequenceConstructionExpression | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )";
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