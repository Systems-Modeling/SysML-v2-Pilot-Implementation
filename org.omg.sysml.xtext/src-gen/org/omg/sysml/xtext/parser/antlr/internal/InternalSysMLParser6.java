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
public abstract class InternalSysMLParser6 extends InternalSysMLParser5 {
    public InternalSysMLParser6(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }
    static final String dfa_47s = "\16\uffff\1\35\23\uffff";
    static final String dfa_48s = "\1\62\1\4\1\uffff\4\57\1\6\2\57\3\54\1\4\1\17\2\57\2\10\4\57\1\6\2\57\3\54\1\uffff\2\57\2\10";
    static final String dfa_49s = "\1\74\1\u00ad\1\uffff\3\75\1\136\1\7\2\75\1\54\2\75\1\u00ad\1\u0090\2\75\2\11\3\57\1\136\1\7\2\57\1\54\2\57\1\uffff\2\57\2\11";
    static final String dfa_50s = "\2\uffff\1\2\32\uffff\1\1\4\uffff";
    static final String dfa_51s = "\42\uffff}>";
    static final String[] dfa_52s = {
            "\2\2\10\uffff\1\1",
            "\1\5\1\uffff\1\6\1\10\1\13\1\14\44\uffff\1\11\57\uffff\1\7\114\uffff\1\3\1\4\1\12",
            "",
            "\1\16\15\uffff\1\15",
            "\1\16\15\uffff\1\15",
            "\1\16\15\uffff\1\15",
            "\1\16\15\uffff\1\15\40\uffff\1\7",
            "\1\17\1\20",
            "\1\16\15\uffff\1\15",
            "\1\16\15\uffff\1\15",
            "\1\21",
            "\1\22\2\uffff\1\16\15\uffff\1\15",
            "\1\22\2\uffff\1\16\15\uffff\1\15",
            "\1\25\1\uffff\1\26\1\30\1\33\1\34\44\uffff\1\31\57\uffff\1\27\114\uffff\1\23\1\24\1\32",
            "\2\35\2\uffff\1\35\14\uffff\4\35\5\uffff\1\35\6\uffff\1\35\1\uffff\2\2\10\35\7\uffff\6\35\1\uffff\5\35\1\uffff\6\35\2\uffff\6\35\1\uffff\11\35\2\uffff\1\35\1\uffff\2\35\1\uffff\2\35\4\uffff\2\35\1\uffff\1\35\1\uffff\1\35\1\uffff\1\35\1\uffff\4\35\3\uffff\3\35\1\uffff\5\35\1\uffff\2\35",
            "\1\16\15\uffff\1\15",
            "\1\16\15\uffff\1\15",
            "\1\13\1\14",
            "\1\13\1\14",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16\56\uffff\1\27",
            "\1\36\1\37",
            "\1\16",
            "\1\16",
            "\1\40",
            "\1\41\2\uffff\1\16",
            "\1\41\2\uffff\1\16",
            "",
            "\1\16",
            "\1\16",
            "\1\33\1\34",
            "\1\33\1\34"
    };

    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[][] dfa_52 = unpackEncodedStringArray(dfa_52s);

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = dfa_46;
            this.eof = dfa_47;
            this.min = dfa_48;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_51;
            this.transition = dfa_52;
        }
        public String getDescription() {
            return "3303:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedMultiplicity ) ) | ( ( (lv_ownedRelationship_1_0= ruleOwnedMultiplicity ) )? ( ( ( (lv_isOrdered_2_0= 'ordered' ) ) ( (lv_isUnique_3_0= ruleNonunique ) )? ) | ( ( (lv_isUnique_4_0= ruleNonunique ) ) ( (lv_isOrdered_5_0= 'ordered' ) )? ) ) ) )";
        }
    }
    static final String dfa_53s = "\2\uffff\2\7\4\uffff";
    static final String dfa_54s = "\1\10\1\54\2\17\2\10\2\uffff";
    static final String dfa_55s = "\1\u00ad\1\54\2\u0090\2\11\2\uffff";
    static final String dfa_56s = "\6\uffff\1\2\1\1";
    static final String[] dfa_57s = {
            "\1\2\1\3\u00a3\uffff\1\1",
            "\1\4",
            "\2\7\2\uffff\2\7\13\uffff\4\7\5\uffff\1\7\2\uffff\1\5\3\uffff\1\7\1\uffff\13\7\6\uffff\6\7\1\uffff\5\7\1\uffff\6\7\2\uffff\6\7\1\6\11\7\2\uffff\1\7\1\uffff\2\7\1\uffff\2\7\4\uffff\2\7\1\uffff\1\7\1\uffff\1\7\1\uffff\1\7\1\uffff\4\7\3\uffff\3\7\1\uffff\5\7\1\uffff\2\7",
            "\2\7\2\uffff\2\7\13\uffff\4\7\5\uffff\1\7\2\uffff\1\5\3\uffff\1\7\1\uffff\13\7\6\uffff\6\7\1\uffff\5\7\1\uffff\6\7\2\uffff\6\7\1\6\11\7\2\uffff\1\7\1\uffff\2\7\1\uffff\2\7\4\uffff\2\7\1\uffff\1\7\1\uffff\1\7\1\uffff\1\7\1\uffff\4\7\3\uffff\3\7\1\uffff\5\7\1\uffff\2\7",
            "\1\2\1\3",
            "\1\2\1\3",
            "",
            ""
    };
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[][] dfa_57 = unpackEncodedStringArray(dfa_57s);

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = dfa_20;
            this.eof = dfa_53;
            this.min = dfa_54;
            this.max = dfa_55;
            this.accept = dfa_56;
            this.special = dfa_25;
            this.transition = dfa_57;
        }
        public String getDescription() {
            return "4016:2: ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain ) ) )";
        }
    }
    static final String dfa_58s = "\1\10\1\54\2\17\1\10\1\uffff\1\10\1\uffff";
}