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
public abstract class InternalSysMLParser15 extends InternalSysMLParser14 {
    public InternalSysMLParser15(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }
    static final String dfa_285s = "\1\u0081\1\u00ad\1\uffff\1\54\2\u0081\2\11\1\uffff";
    static final String[] dfa_286s = {
            "\1\1\140\uffff\1\2",
            "\1\4\1\5\u00a3\uffff\1\3",
            "",
            "\1\6",
            "\2\10\3\uffff\1\10\1\uffff\2\10\17\uffff\1\1\1\uffff\2\10\10\uffff\1\7\3\uffff\1\10\1\uffff\4\10\1\uffff\6\10\6\uffff\3\10\73\uffff\1\2",
            "\2\10\3\uffff\1\10\1\uffff\2\10\17\uffff\1\1\1\uffff\2\10\10\uffff\1\7\3\uffff\1\10\1\uffff\4\10\1\uffff\6\10\6\uffff\3\10\73\uffff\1\2",
            "\1\4\1\5",
            "\1\4\1\5",
            ""
    };
    static final char[] dfa_285 = DFA.unpackEncodedStringToUnsignedChars(dfa_285s);
    static final short[][] dfa_286 = unpackEncodedStringArray(dfa_286s);

    class DFA321 extends DFA {

        public DFA321(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 321;
            this.eot = dfa_271;
            this.eof = dfa_271;
            this.min = dfa_272;
            this.max = dfa_285;
            this.accept = dfa_274;
            this.special = dfa_275;
            this.transition = dfa_286;
        }
        public String getDescription() {
            return "22541:4: ( ( (this_UsageExtensionKeyword_3= ruleUsageExtensionKeyword[$current] )* ruleRequirementUsageKeyword ) | (this_UsageExtensionKeyword_5= ruleUsageExtensionKeyword[$current] )+ )";
        }
    }
    static final String dfa_287s = "\1\u008f\1\u00ad\1\uffff\1\54\2\u008f\2\11\1\uffff";
    static final String[] dfa_288s = {
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
    static final char[] dfa_287 = DFA.unpackEncodedStringToUnsignedChars(dfa_287s);
    static final short[][] dfa_288 = unpackEncodedStringArray(dfa_288s);

    class DFA333 extends DFA {

        public DFA333(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 333;
            this.eot = dfa_271;
            this.eof = dfa_271;
            this.min = dfa_272;
            this.max = dfa_287;
            this.accept = dfa_274;
            this.special = dfa_275;
            this.transition = dfa_288;
        }
        public String getDescription() {
            return "23266:4: ( ( (this_UsageExtensionKeyword_3= ruleUsageExtensionKeyword[$current] )* otherlv_4= 'rendering' ) | (this_UsageExtensionKeyword_5= ruleUsageExtensionKeyword[$current] )+ )";
        }
    }
    static final String dfa_289s = "\12\uffff";
    static final String dfa_290s = "\1\u00b9\1\10\1\54\2\17\2\10\2\uffff\1\17";
    static final String dfa_291s = "\1\u00b9\1\u00ad\1\54\2\74\1\11\1\56\2\uffff\1\74";
    static final String dfa_292s = "\7\uffff\1\2\1\1\1\uffff";
    static final String dfa_293s = "\12\uffff}>";
    static final String[] dfa_294s = {
            "\1\1",
            "\1\3\1\4\u00a3\uffff\1\2",
            "\1\5",
            "\2\10\33\uffff\1\6\17\uffff\1\7",
            "\2\10\33\uffff\1\6\17\uffff\1\7",
            "\1\3\1\4",
            "\1\3\1\4\43\uffff\1\11\1\7",
            "",
            "",
            "\2\10\53\uffff\1\7"
    };

    static final short[] dfa_289 = DFA.unpackEncodedString(dfa_289s);
    static final char[] dfa_290 = DFA.unpackEncodedStringToUnsignedChars(dfa_290s);
    static final char[] dfa_291 = DFA.unpackEncodedStringToUnsignedChars(dfa_291s);
    static final short[] dfa_292 = DFA.unpackEncodedString(dfa_292s);
    static final short[] dfa_293 = DFA.unpackEncodedString(dfa_293s);
    static final short[][] dfa_294 = unpackEncodedStringArray(dfa_294s);

    class DFA340 extends DFA {

        public DFA340(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 340;
            this.eot = dfa_289;
            this.eof = dfa_289;
            this.min = dfa_290;
            this.max = dfa_291;
            this.accept = dfa_292;
            this.special = dfa_293;
            this.transition = dfa_294;
        }
        public String getDescription() {
            return "23588:3: (this_MembershipExpose_0= ruleMembershipExpose | this_NamespaceExpose_1= ruleNamespaceExpose )";
        }
    }

    class DFA341 extends DFA {

        public DFA341(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 341;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "23689:3: (this_ImportedNamespace_1= ruleImportedNamespace[$current] | ( (lv_ownedRelatedElement_2_0= ruleFilterPackage ) ) )";
        }
    }
    static final String dfa_295s = "\3\uffff\2\1\6\uffff";
    static final String dfa_296s = "\1\4\1\uffff\1\54\2\15\2\uffff\2\10\2\uffff";
    static final String dfa_297s = "\1\u00ad\1\uffff\1\54\2\u00a8\2\uffff\2\11\2\uffff";
    static final String dfa_298s = "\1\uffff\1\1\3\uffff\1\2\1\4\2\uffff\1\5\1\3";
    static final String[] dfa_299s = {
            "\1\1\1\uffff\2\1\1\3\1\4\5\uffff\2\1\15\uffff\1\5\14\uffff\1\1\2\uffff\1\1\40\uffff\1\1\6\uffff\1\1\7\uffff\1\1\41\uffff\1\1\34\uffff\2\5\1\uffff\1\6\3\uffff\2\1\3\uffff\4\1\1\2",
            "",
            "\1\7",
            "\5\1\1\uffff\3\1\10\uffff\1\1\1\uffff\1\1\13\uffff\1\10\3\1\6\uffff\1\1\5\uffff\2\1\15\uffff\1\1\11\uffff\3\1\5\uffff\3\1\2\uffff\1\1\5\uffff\4\1\12\uffff\1\1\1\uffff\1\1\30\uffff\16\1\1\12\1\1\1\11\7\1",
            "\5\1\1\uffff\3\1\10\uffff\1\1\1\uffff\1\1\13\uffff\1\10\3\1\6\uffff\1\1\5\uffff\2\1\15\uffff\1\1\11\uffff\3\1\5\uffff\3\1\2\uffff\1\1\5\uffff\4\1\12\uffff\1\1\1\uffff\1\1\30\uffff\16\1\1\12\1\1\1\11\7\1",
            "",
            "",
            "\1\3\1\4",
            "\1\3\1\4",
            "",
            ""
    };
    static final short[] dfa_295 = DFA.unpackEncodedString(dfa_295s);
    static final char[] dfa_296 = DFA.unpackEncodedStringToUnsignedChars(dfa_296s);
    static final char[] dfa_297 = DFA.unpackEncodedStringToUnsignedChars(dfa_297s);
    static final short[] dfa_298 = DFA.unpackEncodedString(dfa_298s);
    static final short[][] dfa_299 = unpackEncodedStringArray(dfa_299s);

    class DFA353 extends DFA {

        public DFA353(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 353;
            this.eot = dfa_13;
            this.eof = dfa_295;
            this.min = dfa_296;
            this.max = dfa_297;
            this.accept = dfa_298;
            this.special = dfa_18;
            this.transition = dfa_299;
        }
        public String getDescription() {
            return "25406:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( () ( (lv_operator_2_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operator_5_0= ruleCastOperator ) ) ( (lv_ownedRelationship_6_0= ruleTypeResultMember ) ) ) )? ) | ( () ( (lv_operand_8_0= ruleSelfReferenceExpression ) ) ( (lv_operator_9_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_10_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operand_12_0= ruleMetadataReference ) ) ( (lv_operator_13_0= ruleMetaClassificationTestOperator ) ) ( (lv_ownedRelationship_14_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operand_16_0= ruleSelfReferenceExpression ) ) ( (lv_operator_17_0= ruleCastOperator ) ) ( (lv_ownedRelationship_18_0= ruleTypeResultMember ) ) ) | ( () ( (lv_operand_20_0= ruleMetadataReference ) ) ( (lv_operator_21_0= ruleMetaCastOperator ) ) ( (lv_ownedRelationship_22_0= ruleTypeResultMember ) ) ) )";
        }
    }
    static final String dfa_300s = "\2\uffff\2\7\5\uffff";
    static final String dfa_301s = "\1\10\1\54\2\15\3\10\2\uffff";
    static final String dfa_302s = "\1\u00ad\1\54\2\u00a8\1\11\1\u00ad\1\11\2\uffff";
    static final String dfa_303s = "\7\uffff\1\1\1\2";
    static final String[] dfa_304s = {
            "\1\2\1\3\u00a3\uffff\1\1",
            "\1\4",
            "\5\7\1\uffff\3\7\10\uffff\1\7\1\uffff\1\7\13\uffff\1\6\3\7\6\uffff\1\7\5\uffff\2\7\6\uffff\1\7\6\uffff\1\7\11\uffff\1\7\1\uffff\1\7\5\uffff\1\7\1\5\1\7\2\uffff\1\7\5\uffff\4\7\12\uffff\1\7\1\uffff\1\7\30\uffff\16\7\1\uffff\1\7\1\uffff\7\7",
            "\5\7\1\uffff\3\7\10\uffff\1\7\1\uffff\1\7\13\uffff\1\6\3\7\6\uffff\1\7\5\uffff\2\7\6\uffff\1\7\6\uffff\1\7\11\uffff\1\7\1\uffff\1\7\5\uffff\1\7\1\5\1\7\2\uffff\1\7\5\uffff\4\7\12\uffff\1\7\1\uffff\1\7\30\uffff\16\7\1\uffff\1\7\1\uffff\7\7",
            "\1\2\1\3",
            "\2\10\5\uffff\2\7\u009c\uffff\1\10",
            "\1\2\1\3",
            "",
            ""
    };
    static final short[] dfa_300 = DFA.unpackEncodedString(dfa_300s);
    static final char[] dfa_301 = DFA.unpackEncodedStringToUnsignedChars(dfa_301s);
    static final char[] dfa_302 = DFA.unpackEncodedStringToUnsignedChars(dfa_302s);
    static final short[] dfa_303 = DFA.unpackEncodedString(dfa_303s);
    static final short[][] dfa_304 = unpackEncodedStringArray(dfa_304s);

    class DFA372 extends DFA {

        public DFA372(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 372;
            this.eot = dfa_271;
            this.eof = dfa_300;
            this.min = dfa_301;
            this.max = dfa_302;
            this.accept = dfa_303;
            this.special = dfa_275;
            this.transition = dfa_304;
        }
        public String getDescription() {
            return "27307:2: ( ( ( ruleQualifiedName ) ) | ( () ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) ) ) )";
        }
    }
    static final String dfa_305s = "\5\uffff\2\16\5\uffff\1\16\3\uffff\2\16\5\uffff\2\16\2\uffff";
    static final String dfa_306s = "\1\4\1\uffff\1\4\1\uffff\1\54\2\15\3\uffff\3\10\2\uffff\1\54\2\15\1\uffff\3\10\1\54\2\15\2\10";
    static final String dfa_307s = "\1\u00ad\1\uffff\1\u00ad\1\uffff\1\54\2\u00a8\3\uffff\2\11\1\u00ad\2\uffff\1\54\2\u00a8\1\uffff\2\11\1\u00ad\1\54\2\u00a8\2\11";
}