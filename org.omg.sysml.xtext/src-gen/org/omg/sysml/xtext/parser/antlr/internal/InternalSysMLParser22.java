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
public abstract class InternalSysMLParser22 extends InternalSysMLParser21 {
    public InternalSysMLParser22(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }
    static final String dfa_242s = "\1\5\1\uffff\3\5\2\10\1\uffff\1\4\4\57\1\6\2\57\3\54\1\4\1\10\2\57\2\10\4\57\1\6\2\57\3\54\2\57\2\10";
    static final String dfa_243s = "\1\u00b4\1\uffff\4\u00b4\1\u00ad\1\uffff\1\u00ad\3\75\1\136\1\7\2\75\1\54\2\75\1\u00ad\1\u00b4\2\75\2\11\3\57\1\136\1\7\2\57\1\54\4\57\2\11";
    static final String dfa_244s = "\1\uffff\1\2\5\uffff\1\1\37\uffff";
    static final String dfa_245s = "\47\uffff}>";
    static final String[] dfa_246s = {
            "\1\1\2\uffff\2\1\3\uffff\1\1\3\uffff\2\1\3\uffff\1\1\1\uffff\5\1\1\uffff\11\1\1\uffff\1\1\7\uffff\1\1\1\uffff\4\1\1\uffff\6\1\1\uffff\5\1\3\uffff\5\1\1\5\3\1\1\uffff\6\1\2\uffff\5\1\2\uffff\2\1\1\7\10\uffff\1\7\4\uffff\1\1\5\uffff\1\1\1\uffff\4\1\1\6\1\1\1\uffff\4\1\3\uffff\3\1\1\uffff\5\1\1\uffff\2\1\35\uffff\1\2\1\3\1\4\4\1",
            "",
            "\1\1\2\uffff\2\1\3\uffff\1\1\4\uffff\1\1\3\uffff\1\1\1\uffff\5\1\1\uffff\11\1\1\uffff\1\1\1\uffff\1\1\5\uffff\1\1\1\uffff\4\1\1\uffff\6\1\1\uffff\5\1\3\uffff\5\1\1\7\3\1\1\uffff\6\1\2\uffff\5\1\2\uffff\2\1\1\7\10\uffff\1\7\4\uffff\1\1\5\uffff\1\1\1\uffff\4\1\1\6\1\1\1\uffff\4\1\3\uffff\3\1\1\uffff\5\1\1\uffff\2\1\40\uffff\4\1",
            "\1\1\2\uffff\2\1\3\uffff\1\1\4\uffff\1\1\3\uffff\1\1\1\uffff\5\1\1\uffff\11\1\1\uffff\1\1\1\uffff\1\1\5\uffff\1\1\1\uffff\4\1\1\uffff\6\1\1\uffff\5\1\3\uffff\5\1\1\7\3\1\1\uffff\6\1\2\uffff\5\1\2\uffff\2\1\1\7\10\uffff\1\7\4\uffff\1\1\5\uffff\1\1\1\uffff\4\1\1\6\1\1\1\uffff\4\1\3\uffff\3\1\1\uffff\5\1\1\uffff\2\1\40\uffff\4\1",
            "\1\1\2\uffff\2\1\3\uffff\1\1\4\uffff\1\1\3\uffff\1\1\1\uffff\5\1\1\uffff\11\1\1\uffff\1\1\1\uffff\1\1\5\uffff\1\1\1\uffff\4\1\1\uffff\6\1\1\uffff\5\1\3\uffff\5\1\1\7\3\1\1\uffff\6\1\2\uffff\5\1\2\uffff\2\1\1\7\10\uffff\1\7\4\uffff\1\1\5\uffff\1\1\1\uffff\4\1\1\6\1\1\1\uffff\4\1\3\uffff\3\1\1\uffff\5\1\1\uffff\2\1\40\uffff\4\1",
            "\2\7\25\uffff\3\1\32\uffff\1\10\1\uffff\1\1\1\uffff\3\1\5\uffff\3\1\1\uffff\3\1\3\uffff\1\1\1\uffff\2\1\2\uffff\5\1\2\uffff\2\1\16\uffff\1\1\5\uffff\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\4\1\3\uffff\3\1\1\uffff\5\1\1\uffff\2\1\34\uffff\1\7\7\1",
            "\2\1\3\uffff\1\1\24\uffff\2\1\14\uffff\1\1\1\uffff\4\1\1\uffff\6\1\16\uffff\1\7\7\uffff\1\1\15\uffff\1\7\10\uffff\1\7\15\uffff\1\7\64\uffff\1\1",
            "",
            "\1\13\1\uffff\1\14\1\16\1\21\1\22\44\uffff\1\17\57\uffff\1\15\114\uffff\1\11\1\12\1\20",
            "\1\24\15\uffff\1\23",
            "\1\24\15\uffff\1\23",
            "\1\24\15\uffff\1\23",
            "\1\24\15\uffff\1\23\40\uffff\1\15",
            "\1\25\1\26",
            "\1\24\15\uffff\1\23",
            "\1\24\15\uffff\1\23",
            "\1\27",
            "\1\30\2\uffff\1\24\15\uffff\1\23",
            "\1\30\2\uffff\1\24\15\uffff\1\23",
            "\1\33\1\uffff\1\34\1\36\1\41\1\42\44\uffff\1\37\57\uffff\1\35\114\uffff\1\31\1\32\1\40",
            "\2\7\25\uffff\3\1\34\uffff\1\1\1\uffff\3\1\5\uffff\3\1\1\uffff\3\1\3\uffff\1\1\1\uffff\2\1\2\uffff\5\1\2\uffff\2\1\16\uffff\1\1\5\uffff\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\4\1\3\uffff\3\1\1\uffff\5\1\1\uffff\2\1\34\uffff\1\7\7\1",
            "\1\24\15\uffff\1\23",
            "\1\24\15\uffff\1\23",
            "\1\21\1\22",
            "\1\21\1\22",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24\56\uffff\1\35",
            "\1\43\1\44",
            "\1\24",
            "\1\24",
            "\1\45",
            "\1\46\2\uffff\1\24",
            "\1\46\2\uffff\1\24",
            "\1\24",
            "\1\24",
            "\1\41\1\42",
            "\1\41\1\42"
    };
    static final char[] dfa_242 = DFA.unpackEncodedStringToUnsignedChars(dfa_242s);
    static final char[] dfa_243 = DFA.unpackEncodedStringToUnsignedChars(dfa_243s);
    static final short[] dfa_244 = DFA.unpackEncodedString(dfa_244s);
    static final short[] dfa_245 = DFA.unpackEncodedString(dfa_245s);
    static final short[][] dfa_246 = unpackEncodedStringArray(dfa_246s);

    class DFA254 extends DFA {

        public DFA254(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 254;
            this.eot = dfa_39;
            this.eof = dfa_40;
            this.min = dfa_242;
            this.max = dfa_243;
            this.accept = dfa_244;
            this.special = dfa_245;
            this.transition = dfa_246;
        }
        public String getDescription() {
            return "()* loopback of 17433:4: ( (lv_ownedRelationship_9_0= ruleTargetTransitionUsageMember ) )*";
        }
    }
    static final String dfa_247s = "\46\uffff";
    static final String dfa_248s = "\1\1\45\uffff";
    static final String dfa_249s = "\1\5\1\uffff\3\5\1\10\1\uffff\1\4\4\57\1\6\2\57\3\54\1\4\1\10\2\57\2\10\4\57\1\6\2\57\3\54\2\57\2\10";
    static final String dfa_250s = "\1\u00b4\1\uffff\4\u00b4\1\uffff\1\u00ad\3\75\1\136\1\7\2\75\1\54\2\75\1\u00ad\1\u00b4\2\75\2\11\3\57\1\136\1\7\2\57\1\54\4\57\2\11";
    static final String dfa_251s = "\1\uffff\1\2\4\uffff\1\1\37\uffff";
    static final String dfa_252s = "\46\uffff}>";
    static final String[] dfa_253s = {
            "\1\1\2\uffff\2\1\3\uffff\1\1\3\uffff\2\1\3\uffff\1\1\1\uffff\5\1\1\uffff\11\1\1\uffff\1\1\7\uffff\1\1\1\uffff\4\1\1\uffff\6\1\1\uffff\5\1\3\uffff\5\1\1\5\3\1\1\uffff\6\1\2\uffff\5\1\2\uffff\2\1\11\uffff\1\6\4\uffff\1\1\5\uffff\1\1\1\uffff\6\1\1\uffff\4\1\3\uffff\3\1\1\uffff\5\1\1\uffff\2\1\35\uffff\1\2\1\3\1\4\4\1",
            "",
            "\1\1\2\uffff\2\1\3\uffff\1\1\4\uffff\1\1\3\uffff\1\1\1\uffff\5\1\1\uffff\11\1\1\uffff\1\1\1\uffff\1\1\5\uffff\1\1\1\uffff\4\1\1\uffff\6\1\1\uffff\5\1\3\uffff\5\1\1\6\3\1\1\uffff\6\1\2\uffff\5\1\2\uffff\2\1\11\uffff\1\6\4\uffff\1\1\5\uffff\1\1\1\uffff\6\1\1\uffff\4\1\3\uffff\3\1\1\uffff\5\1\1\uffff\2\1\40\uffff\4\1",
            "\1\1\2\uffff\2\1\3\uffff\1\1\4\uffff\1\1\3\uffff\1\1\1\uffff\5\1\1\uffff\11\1\1\uffff\1\1\1\uffff\1\1\5\uffff\1\1\1\uffff\4\1\1\uffff\6\1\1\uffff\5\1\3\uffff\5\1\1\6\3\1\1\uffff\6\1\2\uffff\5\1\2\uffff\2\1\11\uffff\1\6\4\uffff\1\1\5\uffff\1\1\1\uffff\6\1\1\uffff\4\1\3\uffff\3\1\1\uffff\5\1\1\uffff\2\1\40\uffff\4\1",
            "\1\1\2\uffff\2\1\3\uffff\1\1\4\uffff\1\1\3\uffff\1\1\1\uffff\5\1\1\uffff\11\1\1\uffff\1\1\1\uffff\1\1\5\uffff\1\1\1\uffff\4\1\1\uffff\6\1\1\uffff\5\1\3\uffff\5\1\1\6\3\1\1\uffff\6\1\2\uffff\5\1\2\uffff\2\1\11\uffff\1\6\4\uffff\1\1\5\uffff\1\1\1\uffff\6\1\1\uffff\4\1\3\uffff\3\1\1\uffff\5\1\1\uffff\2\1\40\uffff\4\1",
            "\2\6\25\uffff\3\1\32\uffff\1\7\1\uffff\1\1\1\uffff\3\1\5\uffff\3\1\1\uffff\3\1\3\uffff\1\1\1\uffff\2\1\2\uffff\5\1\2\uffff\2\1\16\uffff\1\1\5\uffff\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\4\1\3\uffff\3\1\1\uffff\5\1\1\uffff\2\1\34\uffff\1\6\7\1",
            "",
            "\1\12\1\uffff\1\13\1\15\1\20\1\21\44\uffff\1\16\57\uffff\1\14\114\uffff\1\10\1\11\1\17",
            "\1\23\15\uffff\1\22",
            "\1\23\15\uffff\1\22",
            "\1\23\15\uffff\1\22",
            "\1\23\15\uffff\1\22\40\uffff\1\14",
            "\1\24\1\25",
            "\1\23\15\uffff\1\22",
            "\1\23\15\uffff\1\22",
            "\1\26",
            "\1\27\2\uffff\1\23\15\uffff\1\22",
            "\1\27\2\uffff\1\23\15\uffff\1\22",
            "\1\32\1\uffff\1\33\1\35\1\40\1\41\44\uffff\1\36\57\uffff\1\34\114\uffff\1\30\1\31\1\37",
            "\2\6\25\uffff\3\1\34\uffff\1\1\1\uffff\3\1\5\uffff\3\1\1\uffff\3\1\3\uffff\1\1\1\uffff\2\1\2\uffff\5\1\2\uffff\2\1\16\uffff\1\1\5\uffff\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\4\1\3\uffff\3\1\1\uffff\5\1\1\uffff\2\1\34\uffff\1\6\7\1",
            "\1\23\15\uffff\1\22",
            "\1\23\15\uffff\1\22",
            "\1\20\1\21",
            "\1\20\1\21",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23\56\uffff\1\34",
            "\1\42\1\43",
            "\1\23",
            "\1\23",
            "\1\44",
            "\1\45\2\uffff\1\23",
            "\1\45\2\uffff\1\23",
            "\1\23",
            "\1\23",
            "\1\40\1\41",
            "\1\40\1\41"
    };

    static final short[] dfa_247 = DFA.unpackEncodedString(dfa_247s);
    static final short[] dfa_248 = DFA.unpackEncodedString(dfa_248s);
    static final char[] dfa_249 = DFA.unpackEncodedStringToUnsignedChars(dfa_249s);
    static final char[] dfa_250 = DFA.unpackEncodedStringToUnsignedChars(dfa_250s);
    static final short[] dfa_251 = DFA.unpackEncodedString(dfa_251s);
    static final short[] dfa_252 = DFA.unpackEncodedString(dfa_252s);
    static final short[][] dfa_253 = unpackEncodedStringArray(dfa_253s);

    class DFA255 extends DFA {

        public DFA255(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 255;
            this.eot = dfa_247;
            this.eof = dfa_248;
            this.min = dfa_249;
            this.max = dfa_250;
            this.accept = dfa_251;
            this.special = dfa_252;
            this.transition = dfa_253;
        }
        public String getDescription() {
            return "()* loopback of 17494:4: ( (lv_ownedRelationship_12_0= ruleEntryTransitionMember ) )*";
        }
    }
}