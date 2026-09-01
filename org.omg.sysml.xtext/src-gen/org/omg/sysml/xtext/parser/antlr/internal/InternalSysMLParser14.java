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
    static final String dfa_146s = "\1\10\3\54\3\10\1\54\2\17\1\uffff\2\10\1\uffff";
    static final String dfa_147s = "\1\u00ad\1\54\2\136\2\11\1\u00ad\1\54\2\136\1\uffff\2\11\1\uffff";
    static final String dfa_148s = "\12\uffff\1\1\2\uffff\1\2";
    static final String[] dfa_149s = {
            "\1\2\1\3\u00a3\uffff\1\1",
            "\1\4",
            "\1\5\61\uffff\1\6",
            "\1\5\61\uffff\1\6",
            "\1\2\1\3",
            "\1\2\1\3",
            "\1\10\1\11\u00a3\uffff\1\7",
            "\1\13",
            "\2\12\4\uffff\1\12\26\uffff\1\14\61\uffff\1\15",
            "\2\12\4\uffff\1\12\26\uffff\1\14\61\uffff\1\15",
            "",
            "\1\10\1\11",
            "\1\10\1\11",
            ""
    };
    static final short[] dfa_145 = DFA.unpackEncodedString(dfa_145s);
    static final char[] dfa_146 = DFA.unpackEncodedStringToUnsignedChars(dfa_146s);
    static final char[] dfa_147 = DFA.unpackEncodedStringToUnsignedChars(dfa_147s);
    static final short[] dfa_148 = DFA.unpackEncodedString(dfa_148s);
    static final short[][] dfa_149 = unpackEncodedStringArray(dfa_149s);

    class DFA190 extends DFA {

        public DFA190(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 190;
            this.eot = dfa_7;
            this.eof = dfa_145;
            this.min = dfa_146;
            this.max = dfa_147;
            this.accept = dfa_148;
            this.special = dfa_11;
            this.transition = dfa_149;
        }
        public String getDescription() {
            return "12441:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ) | ( (lv_ownedRelatedElement_2_0= ruleFeatureChainPrefix ) ) )";
        }
    }
    static final String dfa_150s = "\5\uffff\1\12\2\uffff\2\12\4\uffff";
    static final String dfa_151s = "\1\u00ad\1\54\2\136\1\11\1\u00ad\1\11\1\54\2\136\1\uffff\2\11\1\uffff";
    static final String dfa_152s = "\12\uffff\1\2\2\uffff\1\1";
    static final String[] dfa_153s = {
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
    static final short[] dfa_150 = DFA.unpackEncodedString(dfa_150s);
    static final char[] dfa_151 = DFA.unpackEncodedStringToUnsignedChars(dfa_151s);
    static final short[] dfa_152 = DFA.unpackEncodedString(dfa_152s);
    static final short[][] dfa_153 = unpackEncodedStringArray(dfa_153s);

    class DFA191 extends DFA {

        public DFA191(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 191;
            this.eot = dfa_7;
            this.eof = dfa_150;
            this.min = dfa_146;
            this.max = dfa_151;
            this.accept = dfa_152;
            this.special = dfa_11;
            this.transition = dfa_153;
        }
        public String getDescription() {
            return "()+ loopback of 12503:3: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) ) otherlv_1= '.' )+";
        }
    }
    static final String dfa_154s = "\142\uffff";
    static final String dfa_155s = "\1\5\141\uffff";
    static final String dfa_156s = "\1\u00b4\141\uffff";
    static final String dfa_157s = "\1\uffff\1\2\140\1";
}