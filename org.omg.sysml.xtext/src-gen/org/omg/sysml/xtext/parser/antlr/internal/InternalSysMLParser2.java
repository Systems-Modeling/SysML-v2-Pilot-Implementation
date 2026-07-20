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
public abstract class InternalSysMLParser2 extends InternalSysMLParser1 {
    public InternalSysMLParser2(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }
    static final String dfa_1s = "\66\uffff";
    static final String dfa_2s = "\1\5\1\10\1\uffff\26\10\1\u0087\3\10\1\uffff\1\54\10\10\1\54\2\10\1\54\2\10\1\54\10\10";
    static final String dfa_3s = "\1\u00b4\1\u00ad\1\uffff\2\u00b4\2\105\1\u00b4\3\105\1\125\2\u00ad\1\132\3\105\1\166\6\105\1\u0087\3\105\1\uffff\1\54\2\u0090\3\u00ad\1\105\2\11\1\54\2\u0090\1\54\2\u0090\1\54\2\u0090\6\11";
    static final String dfa_4s = "\2\uffff\1\1\32\uffff\1\2\30\uffff";
    static final String dfa_5s = "\66\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\2\uffff\2\35\3\uffff\1\35\4\uffff\1\2\3\uffff\1\2\1\uffff\5\2\1\uffff\1\2\1\3\1\1\3\35\3\2\11\uffff\1\35\1\uffff\4\35\1\uffff\6\35\1\uffff\1\4\1\uffff\3\35\3\uffff\1\5\1\6\1\10\1\7\1\35\1\uffff\1\11\1\12\1\17\1\uffff\4\35\1\13\1\35\2\uffff\1\15\1\16\1\35\1\14\1\35\2\uffff\1\20\1\35\16\uffff\1\35\5\uffff\1\22\4\uffff\1\35\1\uffff\1\21\1\uffff\1\23\2\35\1\24\3\uffff\1\35\1\25\1\26\1\uffff\1\27\1\30\1\31\1\35\1\32\1\uffff\1\34\1\33\40\uffff\4\35",
            "\1\37\1\40\u00a3\uffff\1\36",
            "",
            "\2\35\3\uffff\1\35\16\uffff\1\2\3\uffff\1\41\3\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\4\uffff\1\35\4\uffff\1\5\1\35\1\10\1\7\1\35\1\uffff\1\11\1\12\1\17\1\uffff\4\35\1\13\1\35\2\uffff\1\15\1\16\1\35\1\14\1\35\2\uffff\1\20\1\35\24\uffff\1\22\4\uffff\1\35\1\uffff\1\21\1\uffff\1\23\2\35\1\24\3\uffff\1\35\1\25\1\26\1\uffff\1\27\1\30\1\31\1\35\1\32\1\uffff\1\34\1\33\42\uffff\2\35",
            "\2\35\3\uffff\1\35\22\uffff\1\42\3\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\4\uffff\1\35\4\uffff\1\5\1\35\1\10\1\7\1\35\1\uffff\1\11\1\12\1\17\1\uffff\4\35\1\13\1\35\2\uffff\1\15\1\16\1\35\1\14\1\35\2\uffff\1\20\1\35\24\uffff\1\22\4\uffff\1\35\1\uffff\1\21\1\uffff\1\23\2\35\1\24\3\uffff\1\35\1\25\1\26\1\uffff\1\27\1\30\1\31\1\35\1\32\1\uffff\1\34\1\33\42\uffff\2\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\2\uffff\1\43\1\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35\2\uffff\1\10\1\uffff\1\35\1\uffff\1\11\1\12\1\35\3\uffff\1\35\1\uffff\1\13\1\35\2\uffff\1\15\1\16\1\35\1\14\1\35\2\uffff\1\20\1\35\24\uffff\1\22\4\uffff\1\35\1\uffff\1\21\1\uffff\1\23\2\35\1\24\3\uffff\1\35\1\25\1\26\1\uffff\1\27\1\30\1\31\1\35\1\32\1\uffff\1\34\1\33\42\uffff\2\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35\17\uffff\1\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\2\uffff\1\35\11\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35\27\uffff\1\35\117\uffff\1\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\30\uffff\2\35\126\uffff\1\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\35\uffff\1\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35\60\uffff\1\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\1\44",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "",
            "\1\45",
            "\2\35\3\uffff\1\35\1\uffff\2\35\1\uffff\1\2\11\uffff\3\2\1\uffff\1\1\1\uffff\2\35\2\uffff\1\2\5\uffff\1\46\3\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35\1\5\1\6\1\10\1\uffff\1\35\1\uffff\1\11\1\12\1\17\1\uffff\4\35\1\13\1\35\2\uffff\1\15\1\16\1\35\1\14\1\35\2\uffff\1\20\1\35\24\uffff\1\22\4\uffff\1\35\1\uffff\1\21\1\uffff\1\23\2\35\1\24\3\uffff\1\35\1\25\1\26\1\uffff\1\27\1\30\1\31\1\35\1\32\1\uffff\1\34\1\33",
            "\2\35\3\uffff\1\35\1\uffff\2\35\1\uffff\1\2\11\uffff\3\2\1\uffff\1\1\1\uffff\2\35\2\uffff\1\2\5\uffff\1\46\3\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35\1\5\1\6\1\10\1\uffff\1\35\1\uffff\1\11\1\12\1\17\1\uffff\4\35\1\13\1\35\2\uffff\1\15\1\16\1\35\1\14\1\35\2\uffff\1\20\1\35\24\uffff\1\22\4\uffff\1\35\1\uffff\1\21\1\uffff\1\23\2\35\1\24\3\uffff\1\35\1\25\1\26\1\uffff\1\27\1\30\1\31\1\35\1\32\1\uffff\1\34\1\33",
            "\1\50\1\51\u00a3\uffff\1\47",
            "\1\53\1\54\u00a3\uffff\1\52",
            "\1\56\1\57\u00a3\uffff\1\55",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\1\37\1\40",
            "\1\37\1\40",
            "\1\60",
            "\2\35\3\uffff\1\35\1\uffff\2\35\13\uffff\2\2\2\uffff\1\41\1\uffff\2\35\10\uffff\1\61\3\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35\1\5\1\35\1\10\1\uffff\1\35\1\uffff\1\11\1\12\1\17\1\uffff\4\35\1\13\1\35\2\uffff\1\15\1\16\1\35\1\14\1\35\2\uffff\1\20\1\35\24\uffff\1\22\4\uffff\1\35\1\uffff\1\21\1\uffff\1\23\2\35\1\24\3\uffff\1\35\1\25\1\26\1\uffff\1\27\1\30\1\31\1\35\1\32\1\uffff\1\34\1\33",
            "\2\35\3\uffff\1\35\1\uffff\2\35\13\uffff\2\2\2\uffff\1\41\1\uffff\2\35\10\uffff\1\61\3\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35\1\5\1\35\1\10\1\uffff\1\35\1\uffff\1\11\1\12\1\17\1\uffff\4\35\1\13\1\35\2\uffff\1\15\1\16\1\35\1\14\1\35\2\uffff\1\20\1\35\24\uffff\1\22\4\uffff\1\35\1\uffff\1\21\1\uffff\1\23\2\35\1\24\3\uffff\1\35\1\25\1\26\1\uffff\1\27\1\30\1\31\1\35\1\32\1\uffff\1\34\1\33",
            "\1\62",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\2\uffff\1\42\1\uffff\2\35\10\uffff\1\63\3\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35\1\5\1\35\1\10\1\uffff\1\35\1\uffff\1\11\1\12\1\17\1\uffff\4\35\1\13\1\35\2\uffff\1\15\1\16\1\35\1\14\1\35\2\uffff\1\20\1\35\24\uffff\1\22\4\uffff\1\35\1\uffff\1\21\1\uffff\1\23\2\35\1\24\3\uffff\1\35\1\25\1\26\1\uffff\1\27\1\30\1\31\1\35\1\32\1\uffff\1\34\1\33",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\2\uffff\1\42\1\uffff\2\35\10\uffff\1\63\3\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35\1\5\1\35\1\10\1\uffff\1\35\1\uffff\1\11\1\12\1\17\1\uffff\4\35\1\13\1\35\2\uffff\1\15\1\16\1\35\1\14\1\35\2\uffff\1\20\1\35\24\uffff\1\22\4\uffff\1\35\1\uffff\1\21\1\uffff\1\23\2\35\1\24\3\uffff\1\35\1\25\1\26\1\uffff\1\27\1\30\1\31\1\35\1\32\1\uffff\1\34\1\33",
            "\1\64",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\2\uffff\1\43\1\uffff\2\35\10\uffff\1\65\3\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35\2\uffff\1\10\1\uffff\1\35\1\uffff\1\11\1\12\1\35\3\uffff\1\35\1\uffff\1\13\1\35\2\uffff\1\15\1\16\1\35\1\14\1\35\2\uffff\1\20\1\35\24\uffff\1\22\4\uffff\1\35\1\uffff\1\21\1\uffff\1\23\2\35\1\24\3\uffff\1\35\1\25\1\26\1\uffff\1\27\1\30\1\31\1\35\1\32\1\uffff\1\34\1\33",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\2\uffff\1\43\1\uffff\2\35\10\uffff\1\65\3\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35\2\uffff\1\10\1\uffff\1\35\1\uffff\1\11\1\12\1\35\3\uffff\1\35\1\uffff\1\13\1\35\2\uffff\1\15\1\16\1\35\1\14\1\35\2\uffff\1\20\1\35\24\uffff\1\22\4\uffff\1\35\1\uffff\1\21\1\uffff\1\23\2\35\1\24\3\uffff\1\35\1\25\1\26\1\uffff\1\27\1\30\1\31\1\35\1\32\1\uffff\1\34\1\33",
            "\1\50\1\51",
            "\1\50\1\51",
            "\1\53\1\54",
            "\1\53\1\54",
            "\1\56\1\57",
            "\1\56\1\57"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1977:3: ( ( (lv_ownedRelatedElement_1_0= ruleDefinitionElement ) ) | ( (lv_ownedRelatedElement_2_0= ruleUsageElement ) ) )";
        }
    }
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\1\u00ae\3\52\2\10\1\54\2\17\2\10\2\uffff\1\17";
    static final String dfa_9s = "\1\u00b0\3\52\2\u00ad\1\54\2\74\1\11\1\56\2\uffff\1\74";
    static final String dfa_10s = "\13\uffff\1\2\1\1\1\uffff";
}