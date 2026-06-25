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
    static final String dfa_147s = "\1\10\3\54\3\10\1\54\2\17\1\uffff\2\10\1\uffff";
    static final String dfa_148s = "\1\u00ad\1\54\2\136\1\11\1\u00ad\1\11\1\54\2\136\1\uffff\2\11\1\uffff";
    static final String dfa_149s = "\12\uffff\1\1\2\uffff\1\2";
    static final String[] dfa_150s = {
            "\1\2\1\3\u00a3\uffff\1\1",
            "\1\4",
            "\1\6\61\uffff\1\5",
            "\1\6\61\uffff\1\5",
            "\1\2\1\3",
            "\1\10\1\11\u00a3\uffff\1\7",
            "\1\2\1\3",
            "\1\13",
            "\2\12\4\uffff\1\12\26\uffff\1\14\61\uffff\1\15",
            "\2\12\4\uffff\1\12\26\uffff\1\14\61\uffff\1\15",
            "",
            "\1\10\1\11",
            "\1\10\1\11",
            ""
    };
    static final short[] dfa_146 = DFA.unpackEncodedString(dfa_146s);
    static final char[] dfa_147 = DFA.unpackEncodedStringToUnsignedChars(dfa_147s);
    static final char[] dfa_148 = DFA.unpackEncodedStringToUnsignedChars(dfa_148s);
    static final short[] dfa_149 = DFA.unpackEncodedString(dfa_149s);
    static final short[][] dfa_150 = unpackEncodedStringArray(dfa_150s);

    class DFA189 extends DFA {

        public DFA189(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 189;
            this.eot = dfa_7;
            this.eof = dfa_146;
            this.min = dfa_147;
            this.max = dfa_148;
            this.accept = dfa_149;
            this.special = dfa_11;
            this.transition = dfa_150;
        }
        public String getDescription() {
            return "12428:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ) | ( (lv_ownedRelatedElement_2_0= ruleFeatureChainPrefix ) ) )";
        }
    }
    static final String dfa_151s = "\1\10\3\54\3\10\1\54\2\17\1\uffff\1\10\1\uffff\1\10";
    static final String dfa_152s = "\1\u00ad\1\54\2\136\1\11\1\u00ad\1\11\1\54\2\136\1\uffff\1\11\1\uffff\1\11";
    static final String dfa_153s = "\12\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String[] dfa_154s = {
            "\1\2\1\3\u00a3\uffff\1\1",
            "\1\4",
            "\1\6\61\uffff\1\5",
            "\1\6\61\uffff\1\5",
            "\1\2\1\3",
            "\1\10\1\11\u00a3\uffff\1\7",
            "\1\2\1\3",
            "\1\13",
            "\2\12\4\uffff\1\12\26\uffff\1\15\61\uffff\1\14",
            "\2\12\4\uffff\1\12\26\uffff\1\15\61\uffff\1\14",
            "",
            "\1\10\1\11",
            "",
            "\1\10\1\11"
    };
    static final char[] dfa_151 = DFA.unpackEncodedStringToUnsignedChars(dfa_151s);
    static final char[] dfa_152 = DFA.unpackEncodedStringToUnsignedChars(dfa_152s);
    static final short[] dfa_153 = DFA.unpackEncodedString(dfa_153s);
    static final short[][] dfa_154 = unpackEncodedStringArray(dfa_154s);

    class DFA190 extends DFA {

        public DFA190(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 190;
            this.eot = dfa_7;
            this.eof = dfa_146;
            this.min = dfa_151;
            this.max = dfa_152;
            this.accept = dfa_153;
            this.special = dfa_11;
            this.transition = dfa_154;
        }
        public String getDescription() {
            return "()+ loopback of 12490:3: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) ) otherlv_1= '.' )+";
        }
    }
    static final String dfa_155s = "\142\uffff";
    static final String dfa_156s = "\1\5\141\uffff";
    static final String dfa_157s = "\1\u00b4\141\uffff";
    static final String dfa_158s = "\1\uffff\1\2\140\1";
}