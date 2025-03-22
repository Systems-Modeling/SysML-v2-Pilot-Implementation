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
    static final String dfa_3s = "\1\u00b3\1\u00ac\1\uffff\2\u00b3\2\105\1\u00b3\3\105\1\125\2\u00ac\1\132\3\105\1\166\6\105\1\u0087\3\105\1\uffff\1\54\2\u0090\3\u00ac\1\105\2\11\1\54\2\u0090\1\54\2\u0090\1\54\2\u0090\6\11";
    static final String dfa_4s = "\2\uffff\1\1\32\uffff\1\2\30\uffff";
    static final String dfa_5s = "\66\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\2\uffff\2\35\3\uffff\1\35\4\uffff\1\2\3\uffff\1\2\1\uffff\5\2\1\uffff\1\2\1\3\1\1\3\35\3\2\11\uffff\1\35\1\uffff\4\35\1\uffff\6\35\1\uffff\1\4\1\uffff\3\35\3\uffff\1\5\1\6\1\10\1\7\1\35\1\uffff\1\11\1\12\1\17\1\uffff\4\35\1\13\1\35\2\uffff\1\15\1\16\1\35\1\14\1\35\2\uffff\1\20\1\35\16\uffff\1\35\5\uffff\1\22\4\uffff\1\35\1\uffff\1\21\1\uffff\1\23\2\35\1\24\3\uffff\1\35\1\25\1\26\1\uffff\1\27\1\30\1\31\1\35\1\32\1\uffff\1\34\1\33\37\uffff\4\35",
            "\1\37\1\40\u00a2\uffff\1\36",
            "",
            "\2\35\3\uffff\1\35\16\uffff\1\2\3\uffff\1\41\3\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\3\uffff\2\35\4\uffff\1\5\1\35\1\10\1\7\1\35\1\uffff\1\11\1\12\1\17\1\uffff\4\35\1\13\1\35\2\uffff\1\15\1\16\1\35\1\14\1\35\2\uffff\1\20\1\35\24\uffff\1\22\4\uffff\1\35\1\uffff\1\21\1\uffff\1\23\2\35\1\24\3\uffff\1\35\1\25\1\26\1\uffff\1\27\1\30\1\31\1\35\1\32\1\uffff\1\34\1\33\41\uffff\2\35",
            "\2\35\3\uffff\1\35\22\uffff\1\42\3\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\3\uffff\2\35\4\uffff\1\5\1\35\1\10\1\7\1\35\1\uffff\1\11\1\12\1\17\1\uffff\4\35\1\13\1\35\2\uffff\1\15\1\16\1\35\1\14\1\35\2\uffff\1\20\1\35\24\uffff\1\22\4\uffff\1\35\1\uffff\1\21\1\uffff\1\23\2\35\1\24\3\uffff\1\35\1\25\1\26\1\uffff\1\27\1\30\1\31\1\35\1\32\1\uffff\1\34\1\33\41\uffff\2\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\2\uffff\1\43\1\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35\2\uffff\1\10\1\uffff\1\35\1\uffff\1\11\1\12\1\35\3\uffff\1\35\1\uffff\1\13\1\35\2\uffff\1\15\1\16\1\35\1\14\1\35\2\uffff\1\20\1\35\24\uffff\1\22\4\uffff\1\35\1\uffff\1\21\1\uffff\1\23\2\35\1\24\3\uffff\1\35\1\25\1\26\1\uffff\1\27\1\30\1\31\1\35\1\32\1\uffff\1\34\1\33\41\uffff\2\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35\17\uffff\1\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\2\uffff\1\35\11\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\6\uffff\3\35\27\uffff\1\35\116\uffff\1\35",
            "\2\35\3\uffff\1\35\1\uffff\2\35\14\uffff\1\2\4\uffff\2\35\14\uffff\1\35\1\uffff\4\35\1\uffff\6\35\30\uffff\2\35\125\uffff\1\35",
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
            "\1\50\1\51\u00a2\uffff\1\47",
            "\1\53\1\54\u00a2\uffff\1\52",
            "\1\56\1\57\u00a2\uffff\1\55",
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
            return "1964:3: ( ( (lv_ownedRelatedElement_1_0= ruleDefinitionElement ) ) | ( (lv_ownedRelatedElement_2_0= ruleUsageElement ) ) )";
        }
    }
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\1\u00ad\3\52\2\10\1\54\2\17\2\10\2\uffff\1\17";
    static final String dfa_9s = "\1\u00af\3\52\2\u00ac\1\54\2\74\1\11\1\56\2\uffff\1\74";
    static final String dfa_10s = "\13\uffff\1\2\1\1\1\uffff";
    static final String dfa_11s = "\16\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\2\1\3",
            "\1\4",
            "\1\4",
            "\1\4",
            "\1\7\1\10\41\uffff\1\5\u0080\uffff\1\6",
            "\1\7\1\10\u00a2\uffff\1\6",
            "\1\11",
            "\2\14\33\uffff\1\12\17\uffff\1\13",
            "\2\14\33\uffff\1\12\17\uffff\1\13",
            "\1\7\1\10",
            "\1\7\1\10\43\uffff\1\15\1\13",
            "",
            "",
            "\2\14\53\uffff\1\13"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "2244:3: (this_MembershipImport_0= ruleMembershipImport | this_NamespaceImport_1= ruleNamespaceImport )";
        }
    }
    static final String dfa_13s = "\13\uffff";
    static final String dfa_14s = "\7\uffff\1\11\2\uffff\1\11";
    static final String dfa_15s = "\1\10\3\54\2\10\1\uffff\1\17\1\55\1\uffff\1\17";
    static final String dfa_16s = "\1\u00ac\1\54\2\74\1\11\1\56\1\uffff\1\74\1\55\1\uffff\1\74";
    static final String dfa_17s = "\6\uffff\1\2\2\uffff\1\1\1\uffff";
    static final String dfa_18s = "\13\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\1\3\u00a2\uffff\1\1",
            "\1\4",
            "\1\5\17\uffff\1\6",
            "\1\5\17\uffff\1\6",
            "\1\2\1\3",
            "\1\2\1\3\43\uffff\1\6\1\7",
            "",
            "\2\11\33\uffff\1\10\17\uffff\1\6",
            "\1\12",
            "",
            "\2\11\53\uffff\1\6"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "2394:3: (this_ImportedNamespace_1= ruleImportedNamespace[$current] | ( (lv_ownedRelatedElement_2_0= ruleFilterPackage ) ) )";
        }
    }
    static final String dfa_20s = "\10\uffff";
    static final String dfa_21s = "\2\uffff\2\6\4\uffff";
    static final String dfa_22s = "\1\10\3\54\2\10\2\uffff";
    static final String dfa_23s = "\1\u00ac\1\54\2\74\1\11\1\56\2\uffff";
    static final String dfa_24s = "\6\uffff\1\1\1\2";
    static final String dfa_25s = "\10\uffff}>";
    static final String[] dfa_26s = {
            "\1\2\1\3\u00a2\uffff\1\1",
            "\1\4",
            "\1\5\17\uffff\1\6",
            "\1\5\17\uffff\1\6",
            "\1\2\1\3",
            "\1\2\1\3\43\uffff\1\6\1\7",
            "",
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2559:2: (this_FilterPackageMembershipImport_0= ruleFilterPackageMembershipImport | this_FilterPackageNamespaceImport_1= ruleFilterPackageNamespaceImport )";
        }
    }
}