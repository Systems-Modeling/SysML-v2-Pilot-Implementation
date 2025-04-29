package org.omg.sysml.xtext.parser.antlr.internal;

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
import org.omg.sysml.xtext.services.SysMLGrammarAccess;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public abstract class InternalSysMLParser14 extends InternalSysMLParser13 {
    public InternalSysMLParser14(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }
    static final String dfa_293s = "\1\u008f\1\u00ad\1\uffff\1\54\2\u008f\2\11\1\uffff";
    static final String[] dfa_294s = {
            "\1\1\156\uffff\1\2",
            "\1\4\1\5\u00a3\uffff\1\3",
            "",
            "\1\6",
            "\2\10\3\uffff\1\10\1\uffff\2\10\17\uffff\1\1\1\uffff\2\10\10\uffff\1\7\3\uffff\1\10\1\uffff\4\10\1\uffff\6\10\6\uffff\3\10\111\uffff\1\2",
            "\2\10\3\uffff\1\10\1\uffff\2\10\17\uffff\1\1\1\uffff\2\10\10\uffff\1\7\3\uffff\1\10\1\uffff\4\10\1\uffff\6\10\6\uffff\3\10\111\uffff\1\2",
            "\1\4\1\5",
            "\1\4\1\5",
            ""
    };
    static final char[] dfa_293 = DFA.unpackEncodedStringToUnsignedChars(dfa_293s);
    static final short[][] dfa_294 = unpackEncodedStringArray(dfa_294s);

    class DFA335 extends DFA {

        public DFA335(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 335;
            this.eot = dfa_275;
            this.eof = dfa_275;
            this.min = dfa_281;
            this.max = dfa_293;
            this.accept = dfa_283;
            this.special = dfa_279;
            this.transition = dfa_294;
        }
        public String getDescription() {
            return "23273:4: ( ( (this_UsageExtensionKeyword_3= ruleUsageExtensionKeyword[$current] )* otherlv_4= 'rendering' ) | (this_UsageExtensionKeyword_5= ruleUsageExtensionKeyword[$current] )+ )";
        }
    }
    static final String dfa_295s = "\12\uffff";
    static final String dfa_296s = "\1\u00b9\1\10\1\54\2\17\2\10\2\uffff\1\17";
    static final String dfa_297s = "\1\u00b9\1\u00ad\1\54\2\74\1\11\1\56\2\uffff\1\74";
    static final String dfa_298s = "\7\uffff\1\1\1\2\1\uffff";
    static final String dfa_299s = "\12\uffff}>";
    static final String[] dfa_300s = {
            "\1\1",
            "\1\3\1\4\u00a3\uffff\1\2",
            "\1\5",
            "\2\7\33\uffff\1\6\17\uffff\1\10",
            "\2\7\33\uffff\1\6\17\uffff\1\10",
            "\1\3\1\4",
            "\1\3\1\4\43\uffff\1\11\1\10",
            "",
            "",
            "\2\7\53\uffff\1\10"
    };

    static final short[] dfa_295 = DFA.unpackEncodedString(dfa_295s);
    static final char[] dfa_296 = DFA.unpackEncodedStringToUnsignedChars(dfa_296s);
    static final char[] dfa_297 = DFA.unpackEncodedStringToUnsignedChars(dfa_297s);
    static final short[] dfa_298 = DFA.unpackEncodedString(dfa_298s);
    static final short[] dfa_299 = DFA.unpackEncodedString(dfa_299s);
    static final short[][] dfa_300 = unpackEncodedStringArray(dfa_300s);

    class DFA342 extends DFA {

        public DFA342(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 342;
            this.eot = dfa_295;
            this.eof = dfa_295;
            this.min = dfa_296;
            this.max = dfa_297;
            this.accept = dfa_298;
            this.special = dfa_299;
            this.transition = dfa_300;
        }
        public String getDescription() {
            return "23595:3: (this_MembershipExpose_0= ruleMembershipExpose | this_NamespaceExpose_1= ruleNamespaceExpose )";
        }
    }

    class DFA343 extends DFA {

        public DFA343(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 343;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "23696:3: (this_ImportedNamespace_1= ruleImportedNamespace[$current] | ( (lv_ownedRelatedElement_2_0= ruleFilterPackage ) ) )";
        }
    }
    static final String dfa_301s = "\3\uffff\2\1\6\uffff";
    static final String dfa_302s = "\1\4\1\uffff\1\54\2\15\2\uffff\1\10\2\uffff\1\10";
    static final String dfa_303s = "\1\u00ad\1\uffff\1\54\2\u00a8\2\uffff\1\11\2\uffff\1\11";
    static final String dfa_304s = "\1\uffff\1\1\3\uffff\1\2\1\4\1\uffff\1\5\1\3\1\uffff";
    static final String[] dfa_305s = {
            "\1\1\1\uffff\2\1\1\3\1\4\5\uffff\2\1\15\uffff\1\5\14\uffff\1\1\2\uffff\1\1\40\uffff\1\1\6\uffff\1\1\7\uffff\1\1\41\uffff\1\1\34\uffff\2\5\1\uffff\1\6\3\uffff\2\1\3\uffff\4\1\1\2",
            "",
            "\1\7",
            "\5\1\1\uffff\3\1\10\uffff\1\1\1\uffff\1\1\13\uffff\1\12\3\1\6\uffff\1\1\5\uffff\2\1\15\uffff\1\1\11\uffff\3\1\5\uffff\3\1\2\uffff\1\1\5\uffff\4\1\12\uffff\1\1\1\uffff\1\1\30\uffff\16\1\1\11\1\1\1\10\7\1",
            "\5\1\1\uffff\3\1\10\uffff\1\1\1\uffff\1\1\13\uffff\1\12\3\1\6\uffff\1\1\5\uffff\2\1\15\uffff\1\1\11\uffff\3\1\5\uffff\3\1\2\uffff\1\1\5\uffff\4\1\12\uffff\1\1\1\uffff\1\1\30\uffff\16\1\1\11\1\1\1\10\7\1",
            "",
            "",
            "\1\3\1\4",
            "",
            "",
            "\1\3\1\4"
    };
    static final short[] dfa_301 = DFA.unpackEncodedString(dfa_301s);
    static final char[] dfa_302 = DFA.unpackEncodedStringToUnsignedChars(dfa_302s);
    static final char[] dfa_303 = DFA.unpackEncodedStringToUnsignedChars(dfa_303s);
    static final short[] dfa_304 = DFA.unpackEncodedString(dfa_304s);
    static final short[][] dfa_305 = unpackEncodedStringArray(dfa_305s);

    class DFA355 extends DFA {

        public DFA355(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 355;
            this.eot = dfa_13;
            this.eof = dfa_301;
            this.min = dfa_302;
            this.max = dfa_303;
            this.accept = dfa_304;
            this.special = dfa_18;
            this.transition = dfa_305;
        }
        public String getDescription() {
            return "25413:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( () ( (lv_operator_2_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operator_5_0= ruleCastOperator ) ) ( (lv_ownedRelationship_6_0= ruleTypeResultMember ) ) ) )? ) | ( () ( (lv_operand_8_0= ruleSelfReferenceExpression ) ) ( (lv_operator_9_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_10_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operand_12_0= ruleMetadataReference ) ) ( (lv_operator_13_0= ruleMetaClassificationTestOperator ) ) ( (lv_ownedRelationship_14_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operand_16_0= ruleSelfReferenceExpression ) ) ( (lv_operator_17_0= ruleCastOperator ) ) ( (lv_ownedRelationship_18_0= ruleTypeResultMember ) ) ) | ( () ( (lv_operand_20_0= ruleMetadataReference ) ) ( (lv_operator_21_0= ruleMetaCastOperator ) ) ( (lv_ownedRelationship_22_0= ruleTypeResultMember ) ) ) )";
        }
    }
    static final String dfa_306s = "\2\uffff\2\5\5\uffff";
    static final String dfa_307s = "\1\10\1\54\2\15\1\10\1\uffff\2\10\1\uffff";
    static final String dfa_308s = "\1\u00ad\1\54\2\u00a8\1\11\1\uffff\1\u00ad\1\11\1\uffff";
    static final String dfa_309s = "\5\uffff\1\1\2\uffff\1\2";
    static final String[] dfa_310s = {
            "\1\2\1\3\u00a3\uffff\1\1",
            "\1\4",
            "\5\5\1\uffff\3\5\10\uffff\1\5\1\uffff\1\5\13\uffff\1\7\3\5\6\uffff\1\5\5\uffff\2\5\6\uffff\1\5\6\uffff\1\5\11\uffff\1\5\1\uffff\1\5\5\uffff\1\5\1\6\1\5\2\uffff\1\5\5\uffff\4\5\12\uffff\1\5\1\uffff\1\5\30\uffff\16\5\1\uffff\1\5\1\uffff\7\5",
            "\5\5\1\uffff\3\5\10\uffff\1\5\1\uffff\1\5\13\uffff\1\7\3\5\6\uffff\1\5\5\uffff\2\5\6\uffff\1\5\6\uffff\1\5\11\uffff\1\5\1\uffff\1\5\5\uffff\1\5\1\6\1\5\2\uffff\1\5\5\uffff\4\5\12\uffff\1\5\1\uffff\1\5\30\uffff\16\5\1\uffff\1\5\1\uffff\7\5",
            "\1\2\1\3",
            "",
            "\2\10\5\uffff\2\5\u009c\uffff\1\10",
            "\1\2\1\3",
            ""
    };
    static final short[] dfa_306 = DFA.unpackEncodedString(dfa_306s);
    static final char[] dfa_307 = DFA.unpackEncodedStringToUnsignedChars(dfa_307s);
    static final char[] dfa_308 = DFA.unpackEncodedStringToUnsignedChars(dfa_308s);
    static final short[] dfa_309 = DFA.unpackEncodedString(dfa_309s);
    static final short[][] dfa_310 = unpackEncodedStringArray(dfa_310s);

    class DFA374 extends DFA {

        public DFA374(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 374;
            this.eot = dfa_275;
            this.eof = dfa_306;
            this.min = dfa_307;
            this.max = dfa_308;
            this.accept = dfa_309;
            this.special = dfa_279;
            this.transition = dfa_310;
        }
        public String getDescription() {
            return "27314:2: ( ( ( ruleQualifiedName ) ) | ( () ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) ) ) )";
        }
    }
    static final String dfa_311s = "\5\uffff\2\15\5\uffff\1\15\3\uffff\2\15\5\uffff\2\15\2\uffff";
    static final String dfa_312s = "\1\4\1\uffff\1\4\1\uffff\1\54\2\15\3\uffff\3\10\2\uffff\1\54\2\15\1\uffff\3\10\1\54\2\15\2\10";
    static final String dfa_313s = "\1\u00ad\1\uffff\1\u00ad\1\uffff\1\54\2\u00a8\3\uffff\2\11\1\u00ad\2\uffff\1\54\2\u00a8\1\uffff\1\11\1\u00ad\1\11\1\54\2\u00a8\2\11";
    static final String dfa_314s = "\1\uffff\1\1\1\uffff\1\2\3\uffff\1\6\1\7\1\10\3\uffff\1\3\1\5\3\uffff\1\4\10\uffff";
    static final String dfa_315s = "\33\uffff}>";
    static final String[] dfa_316s = {
            "\1\3\1\uffff\2\3\1\5\1\6\5\uffff\2\10\35\uffff\1\3\47\uffff\1\2\7\uffff\1\3\112\uffff\1\7\1\1\2\3\1\4",
            "",
            "\1\11\1\uffff\4\11\5\uffff\2\11\15\uffff\1\11\14\uffff\1\11\2\uffff\1\11\40\uffff\1\11\6\uffff\1\11\1\1\6\uffff\1\11\13\uffff\1\11\25\uffff\1\11\34\uffff\2\11\1\uffff\1\11\3\uffff\2\11\3\uffff\5\11",
            "",
            "\1\12",
            "\5\15\1\uffff\3\15\10\uffff\1\15\1\uffff\1\15\13\uffff\1\13\3\15\6\uffff\1\15\5\uffff\2\15\15\uffff\1\15\11\uffff\1\15\1\16\1\15\5\uffff\1\15\1\14\1\15\2\uffff\1\15\5\uffff\4\15\12\uffff\1\15\1\uffff\1\15\30\uffff\16\15\1\uffff\1\15\1\uffff\7\15",
            "\5\15\1\uffff\3\15\10\uffff\1\15\1\uffff\1\15\13\uffff\1\13\3\15\6\uffff\1\15\5\uffff\2\15\15\uffff\1\15\11\uffff\1\15\1\16\1\15\5\uffff\1\15\1\14\1\15\2\uffff\1\15\5\uffff\4\15\12\uffff\1\15\1\uffff\1\15\30\uffff\16\15\1\uffff\1\15\1\uffff\7\15",
            "",
            "",
            "",
            "\1\5\1\6",
            "\1\5\1\6",
            "\1\20\1\21\5\uffff\2\15\13\uffff\1\22\u0090\uffff\1\17",
            "",
            "",
            "\1\23",
            "\5\15\1\uffff\3\15\10\uffff\1\15\1\uffff\1\15\13\uffff\1\25\3\15\6\uffff\1\15\5\uffff\2\15\6\uffff\1\15\6\uffff\1\15\11\uffff\1\15\1\16\1\15\5\uffff\1\15\1\24\1\15\2\uffff\1\15\5\uffff\4\15\12\uffff\1\15\1\uffff\1\15\30\uffff\16\15\1\uffff\1\15\1\uffff\7\15",
            "\5\15\1\uffff\3\15\10\uffff\1\15\1\uffff\1\15\13\uffff\1\25\3\15\6\uffff\1\15\5\uffff\2\15\6\uffff\1\15\6\uffff\1\15\11\uffff\1\15\1\16\1\15\5\uffff\1\15\1\24\1\15\2\uffff\1\15\5\uffff\4\15\12\uffff\1\15\1\uffff\1\15\30\uffff\16\15\1\uffff\1\15\1\uffff\7\15",
            "",
            "\1\20\1\21",
            "\1\27\1\30\5\uffff\2\15\u009c\uffff\1\26",
            "\1\20\1\21",
            "\1\31",
            "\5\15\1\uffff\3\15\10\uffff\1\15\1\uffff\1\15\13\uffff\1\32\3\15\6\uffff\1\15\5\uffff\2\15\6\uffff\1\15\6\uffff\1\15\11\uffff\1\15\1\16\1\15\5\uffff\1\15\1\24\1\15\2\uffff\1\15\5\uffff\4\15\12\uffff\1\15\1\uffff\1\15\30\uffff\16\15\1\uffff\1\15\1\uffff\7\15",
            "\5\15\1\uffff\3\15\10\uffff\1\15\1\uffff\1\15\13\uffff\1\32\3\15\6\uffff\1\15\5\uffff\2\15\6\uffff\1\15\6\uffff\1\15\11\uffff\1\15\1\16\1\15\5\uffff\1\15\1\24\1\15\2\uffff\1\15\5\uffff\4\15\12\uffff\1\15\1\uffff\1\15\30\uffff\16\15\1\uffff\1\15\1\uffff\7\15",
            "\1\27\1\30",
            "\1\27\1\30"
    };
    static final short[] dfa_311 = DFA.unpackEncodedString(dfa_311s);
    static final char[] dfa_312 = DFA.unpackEncodedStringToUnsignedChars(dfa_312s);
    static final char[] dfa_313 = DFA.unpackEncodedStringToUnsignedChars(dfa_313s);
    static final short[] dfa_314 = DFA.unpackEncodedString(dfa_314s);
    static final short[] dfa_315 = DFA.unpackEncodedString(dfa_315s);
    static final short[][] dfa_316 = unpackEncodedStringArray(dfa_316s);

    class DFA375 extends DFA {

        public DFA375(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 375;
            this.eot = dfa_214;
            this.eof = dfa_311;
            this.min = dfa_312;
            this.max = dfa_313;
            this.accept = dfa_314;
            this.special = dfa_315;
            this.transition = dfa_316;
        }
        public String getDescription() {
            return "27406:2: (this_NullExpression_0= ruleNullExpression | this_LiteralExpression_1= ruleLiteralExpression | this_FeatureReferenceExpression_2= ruleFeatureReferenceExpression | this_MetadataAccessExpression_3= ruleMetadataAccessExpression | this_InvocationExpression_4= ruleInvocationExpression | this_ConstructorExpression_5= ruleConstructorExpression | this_BodyExpression_6= ruleBodyExpression | (otherlv_7= '(' this_SequenceExpression_8= ruleSequenceExpression otherlv_9= ')' ) )";
        }
    }
    static final String dfa_317s = "\1\10\1\54\4\10\2\uffff";
}