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
public abstract class InternalSysMLParser27 extends InternalSysMLParser26 {
    public InternalSysMLParser27(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }
    static final String dfa_305s = "\1\u00ad\1\uffff\1\54\2\u00a8\2\uffff\2\11\2\uffff";
    static final String dfa_306s = "\1\uffff\1\1\3\uffff\1\2\1\4\2\uffff\1\5\1\3";
    static final String[] dfa_307s = {
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
    static final short[] dfa_303 = DFA.unpackEncodedString(dfa_303s);
    static final char[] dfa_304 = DFA.unpackEncodedStringToUnsignedChars(dfa_304s);
    static final char[] dfa_305 = DFA.unpackEncodedStringToUnsignedChars(dfa_305s);
    static final short[] dfa_306 = DFA.unpackEncodedString(dfa_306s);
    static final short[][] dfa_307 = unpackEncodedStringArray(dfa_307s);

    class DFA354 extends DFA {

        public DFA354(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 354;
            this.eot = dfa_13;
            this.eof = dfa_303;
            this.min = dfa_304;
            this.max = dfa_305;
            this.accept = dfa_306;
            this.special = dfa_18;
            this.transition = dfa_307;
        }
        public String getDescription() {
            return "25477:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( () ( (lv_operator_2_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operator_5_0= ruleCastOperator ) ) ( (lv_ownedRelationship_6_0= ruleTypeResultMember ) ) ) )? ) | ( () ( (lv_operand_8_0= ruleSelfReferenceExpression ) ) ( (lv_operator_9_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_10_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operand_12_0= ruleMetadataReference ) ) ( (lv_operator_13_0= ruleMetaClassificationTestOperator ) ) ( (lv_ownedRelationship_14_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operand_16_0= ruleSelfReferenceExpression ) ) ( (lv_operator_17_0= ruleCastOperator ) ) ( (lv_ownedRelationship_18_0= ruleTypeResultMember ) ) ) | ( () ( (lv_operand_20_0= ruleMetadataReference ) ) ( (lv_operator_21_0= ruleMetaCastOperator ) ) ( (lv_ownedRelationship_22_0= ruleTypeResultMember ) ) ) )";
        }
    }
    static final String dfa_308s = "\2\uffff\2\7\5\uffff";
    static final String dfa_309s = "\1\10\1\54\2\15\3\10\2\uffff";
    static final String dfa_310s = "\1\u00ad\1\54\2\u00a8\2\11\1\u00ad\2\uffff";
    static final String dfa_311s = "\7\uffff\1\1\1\2";
    static final String[] dfa_312s = {
            "\1\2\1\3\u00a3\uffff\1\1",
            "\1\4",
            "\5\7\1\uffff\3\7\10\uffff\1\7\1\uffff\1\7\13\uffff\1\5\3\7\6\uffff\1\7\5\uffff\2\7\6\uffff\1\7\6\uffff\1\7\11\uffff\1\7\1\uffff\1\7\5\uffff\1\7\1\6\1\7\2\uffff\1\7\5\uffff\4\7\12\uffff\1\7\1\uffff\1\7\30\uffff\16\7\1\uffff\1\7\1\uffff\7\7",
            "\5\7\1\uffff\3\7\10\uffff\1\7\1\uffff\1\7\13\uffff\1\5\3\7\6\uffff\1\7\5\uffff\2\7\6\uffff\1\7\6\uffff\1\7\11\uffff\1\7\1\uffff\1\7\5\uffff\1\7\1\6\1\7\2\uffff\1\7\5\uffff\4\7\12\uffff\1\7\1\uffff\1\7\30\uffff\16\7\1\uffff\1\7\1\uffff\7\7",
            "\1\2\1\3",
            "\1\2\1\3",
            "\2\10\5\uffff\2\7\u009c\uffff\1\10",
            "",
            ""
    };
    static final short[] dfa_308 = DFA.unpackEncodedString(dfa_308s);
    static final char[] dfa_309 = DFA.unpackEncodedStringToUnsignedChars(dfa_309s);
    static final char[] dfa_310 = DFA.unpackEncodedStringToUnsignedChars(dfa_310s);
    static final short[] dfa_311 = DFA.unpackEncodedString(dfa_311s);
    static final short[][] dfa_312 = unpackEncodedStringArray(dfa_312s);

    class DFA373 extends DFA {

        public DFA373(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 373;
            this.eot = dfa_277;
            this.eof = dfa_308;
            this.min = dfa_309;
            this.max = dfa_310;
            this.accept = dfa_311;
            this.special = dfa_281;
            this.transition = dfa_312;
        }
        public String getDescription() {
            return "27378:2: ( ( ( ruleQualifiedName ) ) | ( () ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) ) ) )";
        }
    }
    static final String dfa_313s = "\5\uffff\2\15\5\uffff\1\15\3\uffff\2\15\5\uffff\2\15\2\uffff";
    static final String dfa_314s = "\1\4\1\uffff\1\4\1\uffff\1\54\2\15\3\uffff\3\10\2\uffff\1\54\2\15\1\uffff\3\10\1\54\2\15\2\10";
    static final String dfa_315s = "\1\u00ad\1\uffff\1\u00ad\1\uffff\1\54\2\u00a8\3\uffff\2\11\1\u00ad\2\uffff\1\54\2\u00a8\1\uffff\2\11\1\u00ad\1\54\2\u00a8\2\11";
    static final String dfa_316s = "\1\uffff\1\1\1\uffff\1\2\3\uffff\1\6\1\7\1\10\3\uffff\1\3\1\5\3\uffff\1\4\10\uffff";
}