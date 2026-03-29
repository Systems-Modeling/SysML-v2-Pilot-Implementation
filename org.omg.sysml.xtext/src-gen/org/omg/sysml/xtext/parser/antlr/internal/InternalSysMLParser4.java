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
public abstract class InternalSysMLParser4 extends InternalSysMLParser3 {
    public InternalSysMLParser4(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }
    static final String dfa_42s = "\1\u0090\1\uffff\1\u00ad\1\66\10\u00ad\1\54\2\0\2\u00ad\1\54\2\0\1\54\2\0\1\54\2\0\1\54\2\0\1\11\1\uffff\1\54\2\0\5\11";
    static final String dfa_43s = "\1\uffff\1\2\34\uffff\1\1\10\uffff";
    static final String dfa_44s = "\15\uffff\1\0\1\4\3\uffff\1\5\1\11\1\uffff\1\13\1\7\1\uffff\1\10\1\3\1\uffff\1\2\1\6\3\uffff\1\12\1\1\5\uffff}>";
    static final String[] dfa_45s = {
            "\2\1\2\uffff\1\1\14\uffff\2\1\1\12\1\13\5\uffff\1\1\6\uffff\1\4\1\uffff\2\1\1\2\1\3\1\1\1\5\1\6\1\7\1\10\1\11\1\1\6\uffff\6\1\1\uffff\5\1\1\uffff\6\1\2\uffff\6\1\1\uffff\3\1\4\uffff\2\1\2\uffff\1\1\1\uffff\2\1\1\uffff\2\1\4\uffff\2\1\3\uffff\1\1\1\uffff\1\1\1\uffff\4\1\3\uffff\3\1\1\uffff\5\1\1\uffff\2\1",
            "",
            "\1\15\1\16\105\uffff\1\17\135\uffff\1\14",
            "\1\20",
            "\1\22\1\23\u00a3\uffff\1\21",
            "\1\22\1\23\u00a3\uffff\1\21",
            "\1\25\1\26\u00a3\uffff\1\24",
            "\1\25\1\26\u00a3\uffff\1\24",
            "\1\30\1\31\u00a3\uffff\1\27",
            "\1\30\1\31\u00a3\uffff\1\27",
            "\1\33\1\34\u00a3\uffff\1\32",
            "\1\33\1\34\u00a3\uffff\1\32",
            "\1\35",
            "\1\uffff",
            "\1\uffff",
            "\1\40\1\41\u00a3\uffff\1\37",
            "\1\15\1\16\105\uffff\1\17\135\uffff\1\14",
            "\1\42",
            "\1\uffff",
            "\1\uffff",
            "\1\43",
            "\1\uffff",
            "\1\uffff",
            "\1\44",
            "\1\uffff",
            "\1\uffff",
            "\1\45",
            "\1\uffff",
            "\1\uffff",
            "\1\15\1\16",
            "",
            "\1\46",
            "\1\uffff",
            "\1\uffff",
            "\1\22\1\23",
            "\1\25\1\26",
            "\1\30\1\31",
            "\1\33\1\34",
            "\1\40\1\41"
    };

    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[][] dfa_45 = unpackEncodedStringArray(dfa_45s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_39;
            this.eof = dfa_40;
            this.min = dfa_41;
            this.max = dfa_42;
            this.accept = dfa_43;
            this.special = dfa_44;
            this.transition = dfa_45;
        }
        public String getDescription() {
            return "()+ loopback of 3210:4: ( ( ':' | 'defined' | ':>' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_13 = input.LA(1);

                         
                        int index59_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_33 = input.LA(1);

                         
                        int index59_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_33);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA59_27 = input.LA(1);

                         
                        int index59_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_27);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA59_25 = input.LA(1);

                         
                        int index59_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_25);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA59_14 = input.LA(1);

                         
                        int index59_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_14);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA59_18 = input.LA(1);

                         
                        int index59_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_18);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA59_28 = input.LA(1);

                         
                        int index59_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_28);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA59_22 = input.LA(1);

                         
                        int index59_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_22);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA59_24 = input.LA(1);

                         
                        int index59_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_24);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA59_19 = input.LA(1);

                         
                        int index59_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_19);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA59_32 = input.LA(1);

                         
                        int index59_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_32);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA59_21 = input.LA(1);

                         
                        int index59_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_21);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_46s = "\42\uffff";
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
            return "3290:2: ( ( (lv_ownedRelationship_0_0= ruleOwnedMultiplicity ) ) | ( ( (lv_ownedRelationship_1_0= ruleOwnedMultiplicity ) )? ( ( ( (lv_isOrdered_2_0= 'ordered' ) ) ( (lv_isUnique_3_0= ruleNonunique ) )? ) | ( ( (lv_isUnique_4_0= ruleNonunique ) ) ( (lv_isOrdered_5_0= 'ordered' ) )? ) ) ) )";
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
            return "4003:2: ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain ) ) )";
        }
    }
    static final String dfa_58s = "\2\uffff\2\5\4\uffff";
    static final String dfa_59s = "\1\10\1\54\2\17\1\10\2\uffff\1\10";
    static final String dfa_60s = "\1\u00ad\1\54\2\u0090\1\11\2\uffff\1\11";
    static final String dfa_61s = "\5\uffff\1\1\1\2\1\uffff";
    static final String[] dfa_62s = {
            "\1\2\1\3\u00a3\uffff\1\1",
            "\1\4",
            "\2\5\2\uffff\2\5\13\uffff\4\5\5\uffff\1\5\2\uffff\1\7\3\uffff\1\5\1\uffff\13\5\6\uffff\6\5\1\uffff\5\5\1\uffff\6\5\2\uffff\6\5\1\6\11\5\2\uffff\1\5\1\uffff\2\5\1\uffff\2\5\4\uffff\2\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\4\5\3\uffff\3\5\1\uffff\5\5\1\uffff\2\5",
            "\2\5\2\uffff\2\5\13\uffff\4\5\5\uffff\1\5\2\uffff\1\7\3\uffff\1\5\1\uffff\13\5\6\uffff\6\5\1\uffff\5\5\1\uffff\6\5\2\uffff\6\5\1\6\11\5\2\uffff\1\5\1\uffff\2\5\1\uffff\2\5\4\uffff\2\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\4\5\3\uffff\3\5\1\uffff\5\5\1\uffff\2\5",
            "\1\2\1\3",
            "",
            "",
            "\1\2\1\3"
    };
    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final char[] dfa_59 = DFA.unpackEncodedStringToUnsignedChars(dfa_59s);
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final short[] dfa_61 = DFA.unpackEncodedString(dfa_61s);
    static final short[][] dfa_62 = unpackEncodedStringArray(dfa_62s);

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = dfa_20;
            this.eof = dfa_58;
            this.min = dfa_59;
            this.max = dfa_60;
            this.accept = dfa_61;
            this.special = dfa_25;
            this.transition = dfa_62;
        }
        public String getDescription() {
            return "4058:2: ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain ) ) )";
        }
    }
    static final String[] dfa_63s = {
            "\1\2\1\3\u00a3\uffff\1\1",
            "\1\4",
            "\2\5\2\uffff\3\5\12\uffff\4\5\5\uffff\1\5\2\uffff\1\7\3\uffff\1\5\1\uffff\13\5\6\uffff\6\5\1\uffff\5\5\1\uffff\6\5\1\uffff\7\5\1\6\11\5\2\uffff\1\5\1\uffff\2\5\1\uffff\2\5\4\uffff\2\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\4\5\3\uffff\3\5\1\uffff\5\5\1\uffff\2\5",
            "\2\5\2\uffff\3\5\12\uffff\4\5\5\uffff\1\5\2\uffff\1\7\3\uffff\1\5\1\uffff\13\5\6\uffff\6\5\1\uffff\5\5\1\uffff\6\5\1\uffff\7\5\1\6\11\5\2\uffff\1\5\1\uffff\2\5\1\uffff\2\5\4\uffff\2\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\4\5\3\uffff\3\5\1\uffff\5\5\1\uffff\2\5",
            "\1\2\1\3",
            "",
            "",
            "\1\2\1\3"
    };
    static final short[][] dfa_63 = unpackEncodedStringArray(dfa_63s);

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = dfa_20;
            this.eof = dfa_58;
            this.min = dfa_59;
            this.max = dfa_60;
            this.accept = dfa_61;
            this.special = dfa_25;
            this.transition = dfa_63;
        }
        public String getDescription() {
            return "4113:2: ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain ) ) )";
        }
    }
    static final String[] dfa_64s = {
            "\1\2\1\3\u00a3\uffff\1\1",
            "\1\4",
            "\2\5\2\uffff\1\5\14\uffff\4\5\5\uffff\1\5\2\uffff\1\7\3\uffff\1\5\1\uffff\13\5\6\uffff\6\5\1\uffff\5\5\1\uffff\6\5\2\uffff\6\5\1\6\11\5\2\uffff\1\5\1\uffff\2\5\1\uffff\2\5\4\uffff\2\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\4\5\3\uffff\3\5\1\uffff\5\5\1\uffff\2\5",
            "\2\5\2\uffff\1\5\14\uffff\4\5\5\uffff\1\5\2\uffff\1\7\3\uffff\1\5\1\uffff\13\5\6\uffff\6\5\1\uffff\5\5\1\uffff\6\5\2\uffff\6\5\1\6\11\5\2\uffff\1\5\1\uffff\2\5\1\uffff\2\5\4\uffff\2\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\4\5\3\uffff\3\5\1\uffff\5\5\1\uffff\2\5",
            "\1\2\1\3",
            "",
            "",
            "\1\2\1\3"
    };
    static final short[][] dfa_64 = unpackEncodedStringArray(dfa_64s);

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = dfa_20;
            this.eof = dfa_58;
            this.min = dfa_59;
            this.max = dfa_60;
            this.accept = dfa_61;
            this.special = dfa_25;
            this.transition = dfa_64;
        }
        public String getDescription() {
            return "4168:2: ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain ) ) )";
        }
    }

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = dfa_20;
            this.eof = dfa_53;
            this.min = dfa_54;
            this.max = dfa_55;
            this.accept = dfa_56;
            this.special = dfa_25;
            this.transition = dfa_57;
        }
        public String getDescription() {
            return "4272:2: ( ( ( ruleQualifiedName ) ) | ( (lv_ownedRelatedElement_1_0= ruleOwnedFeatureChain ) ) )";
        }
    }
    static final String dfa_65s = "\u0cc2\uffff";
}