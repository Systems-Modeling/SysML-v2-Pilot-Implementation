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
    static final String dfa_306s = "\1\4\1\uffff\1\54\2\15\2\uffff\2\10\2\uffff";
    static final String dfa_307s = "\1\u00ad\1\uffff\1\54\2\u00a8\2\uffff\2\11\2\uffff";
    static final String dfa_308s = "\1\uffff\1\1\3\uffff\1\2\1\4\2\uffff\1\5\1\3";
    static final String[] dfa_309s = {
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
    static final short[] dfa_305 = DFA.unpackEncodedString(dfa_305s);
    static final char[] dfa_306 = DFA.unpackEncodedStringToUnsignedChars(dfa_306s);
    static final char[] dfa_307 = DFA.unpackEncodedStringToUnsignedChars(dfa_307s);
    static final short[] dfa_308 = DFA.unpackEncodedString(dfa_308s);
    static final short[][] dfa_309 = unpackEncodedStringArray(dfa_309s);

    class DFA353 extends DFA {

        public DFA353(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 353;
            this.eot = dfa_13;
            this.eof = dfa_305;
            this.min = dfa_306;
            this.max = dfa_307;
            this.accept = dfa_308;
            this.special = dfa_18;
            this.transition = dfa_309;
        }
        public String getDescription() {
            return "25451:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( () ( (lv_operator_2_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operator_5_0= ruleCastOperator ) ) ( (lv_ownedRelationship_6_0= ruleTypeResultMember ) ) ) )? ) | ( () ( (lv_operand_8_0= ruleSelfReferenceExpression ) ) ( (lv_operator_9_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_10_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operand_12_0= ruleMetadataReference ) ) ( (lv_operator_13_0= ruleMetaClassificationTestOperator ) ) ( (lv_ownedRelationship_14_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operand_16_0= ruleSelfReferenceExpression ) ) ( (lv_operator_17_0= ruleCastOperator ) ) ( (lv_ownedRelationship_18_0= ruleTypeResultMember ) ) ) | ( () ( (lv_operand_20_0= ruleMetadataReference ) ) ( (lv_operator_21_0= ruleMetaCastOperator ) ) ( (lv_ownedRelationship_22_0= ruleTypeResultMember ) ) ) )";
        }
    }
    static final String dfa_310s = "\2\uffff\2\7\5\uffff";
    static final String dfa_311s = "\1\10\1\54\2\15\3\10\2\uffff";
    static final String dfa_312s = "\1\u00ad\1\54\2\u00a8\2\11\1\u00ad\2\uffff";
    static final String dfa_313s = "\7\uffff\1\1\1\2";
    static final String[] dfa_314s = {
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
    static final short[] dfa_310 = DFA.unpackEncodedString(dfa_310s);
    static final char[] dfa_311 = DFA.unpackEncodedStringToUnsignedChars(dfa_311s);
    static final char[] dfa_312 = DFA.unpackEncodedStringToUnsignedChars(dfa_312s);
    static final short[] dfa_313 = DFA.unpackEncodedString(dfa_313s);
    static final short[][] dfa_314 = unpackEncodedStringArray(dfa_314s);

    class DFA372 extends DFA {

        public DFA372(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 372;
            this.eot = dfa_279;
            this.eof = dfa_310;
            this.min = dfa_311;
            this.max = dfa_312;
            this.accept = dfa_313;
            this.special = dfa_283;
            this.transition = dfa_314;
        }
        public String getDescription() {
            return "27352:2: ( ( ( ruleQualifiedName ) ) | ( () ( (lv_ownedRelatedElement_2_0= ruleOwnedFeatureChain ) ) ) )";
        }
    }
    static final String dfa_315s = "\5\uffff\2\16\6\uffff\1\16\3\uffff\2\16\4\uffff\2\16\2\uffff";
    static final String dfa_316s = "\1\4\1\uffff\1\4\1\uffff\1\54\2\15\3\uffff\1\10\1\uffff\2\10\2\uffff\1\54\2\15\3\10\1\54\2\15\2\10";
    static final String dfa_317s = "\1\u00ad\1\uffff\1\u00ad\1\uffff\1\54\2\u00a8\3\uffff\1\11\1\uffff\1\11\1\u00ad\2\uffff\1\54\2\u00a8\2\11\1\u00ad\1\54\2\u00a8\2\11";
}