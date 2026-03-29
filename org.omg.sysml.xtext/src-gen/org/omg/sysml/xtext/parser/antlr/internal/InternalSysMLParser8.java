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
public abstract class InternalSysMLParser8 extends InternalSysMLParser7 {
    public InternalSysMLParser8(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }
    static final String dfa_131s = "\1\u00ad\1\uffff\2\136\1\u00ad\1\uffff\2\u00ad\3\75\1\136\1\7\2\75\1\54\2\75\1\54\2\136\2\u00ad\2\75\3\11\1\u00ad\1\11\3\57\1\136\1\7\2\57\1\54\2\57\1\54\2\136\2\57\4\11";
    static final String dfa_132s = "\1\uffff\1\1\3\uffff\1\2\53\uffff";
    static final String dfa_133s = "\61\uffff}>";
    static final String[] dfa_134s = {
            "\1\2\1\3\3\uffff\1\1\1\uffff\2\1\21\uffff\2\1\14\uffff\1\1\1\uffff\4\1\1\uffff\5\1\1\4\30\uffff\1\1\1\5\126\uffff\1\5",
            "",
            "\2\1\4\uffff\1\5\14\uffff\2\1\10\uffff\1\5\3\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\6\1\7\3\1\30\uffff\1\1\10\uffff\1\5",
            "\2\1\4\uffff\1\5\14\uffff\2\1\10\uffff\1\5\3\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\6\1\7\3\1\30\uffff\1\1\10\uffff\1\5",
            "\1\12\1\uffff\1\13\1\15\1\20\1\21\44\uffff\1\16\57\uffff\1\14\114\uffff\1\10\1\11\1\17",
            "",
            "\1\23\1\24\u00a3\uffff\1\22",
            "\1\23\1\24\u00a3\uffff\1\22",
            "\1\26\15\uffff\1\25",
            "\1\26\15\uffff\1\25",
            "\1\26\15\uffff\1\25",
            "\1\26\15\uffff\1\25\40\uffff\1\14",
            "\1\27\1\30",
            "\1\26\15\uffff\1\25",
            "\1\26\15\uffff\1\25",
            "\1\31",
            "\1\32\2\uffff\1\26\15\uffff\1\25",
            "\1\32\2\uffff\1\26\15\uffff\1\25",
            "\1\33",
            "\2\1\4\uffff\1\5\14\uffff\2\1\10\uffff\1\35\3\uffff\1\1\1\uffff\4\1\1\uffff\6\1\30\uffff\1\1\10\uffff\1\34",
            "\2\1\4\uffff\1\5\14\uffff\2\1\10\uffff\1\35\3\uffff\1\1\1\uffff\4\1\1\uffff\6\1\30\uffff\1\1\10\uffff\1\34",
            "\1\40\1\uffff\1\41\1\43\1\46\1\47\44\uffff\1\44\57\uffff\1\42\114\uffff\1\36\1\37\1\45",
            "\2\5\5\uffff\2\1\21\uffff\2\1\14\uffff\1\1\1\uffff\4\1\1\uffff\5\1\31\uffff\1\1\127\uffff\1\5",
            "\1\26\15\uffff\1\25",
            "\1\26\15\uffff\1\25",
            "\1\20\1\21",
            "\1\20\1\21",
            "\1\23\1\24",
            "\1\51\1\52\u00a3\uffff\1\50",
            "\1\23\1\24",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26\56\uffff\1\42",
            "\1\53\1\54",
            "\1\26",
            "\1\26",
            "\1\55",
            "\1\56\2\uffff\1\26",
            "\1\56\2\uffff\1\26",
            "\1\57",
            "\2\1\4\uffff\1\5\14\uffff\2\1\10\uffff\1\60\3\uffff\1\1\1\uffff\4\1\1\uffff\6\1\30\uffff\1\1\10\uffff\1\34",
            "\2\1\4\uffff\1\5\14\uffff\2\1\10\uffff\1\60\3\uffff\1\1\1\uffff\4\1\1\uffff\6\1\30\uffff\1\1\10\uffff\1\34",
            "\1\26",
            "\1\26",
            "\1\46\1\47",
            "\1\46\1\47",
            "\1\51\1\52",
            "\1\51\1\52"
    };

    static final short[] dfa_129 = DFA.unpackEncodedString(dfa_129s);
    static final char[] dfa_130 = DFA.unpackEncodedStringToUnsignedChars(dfa_130s);
    static final char[] dfa_131 = DFA.unpackEncodedStringToUnsignedChars(dfa_131s);
    static final short[] dfa_132 = DFA.unpackEncodedString(dfa_132s);
    static final short[] dfa_133 = DFA.unpackEncodedString(dfa_133s);
    static final short[][] dfa_134 = unpackEncodedStringArray(dfa_134s);

    class DFA160 extends DFA {

        public DFA160(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 160;
            this.eot = dfa_129;
            this.eof = dfa_129;
            this.min = dfa_130;
            this.max = dfa_131;
            this.accept = dfa_132;
            this.special = dfa_133;
            this.transition = dfa_134;
        }
        public String getDescription() {
            return "10636:2: ( ( (this_UsageDeclaration_0= ruleUsageDeclaration[$current] )? ( ruleConnectorKeyword this_InterfacePart_2= ruleInterfacePart[$current] )? ) | this_InterfacePart_3= ruleInterfacePart[$current] )";
        }
    }
    static final String dfa_135s = "\113\uffff";
    static final String dfa_136s = "\2\uffff\2\7\45\uffff\1\7\41\uffff";
    static final String dfa_137s = "\2\10\2\17\1\uffff\1\4\2\uffff\2\16\1\4\4\57\1\6\2\57\3\54\1\10\4\57\1\6\2\57\3\54\1\4\1\10\2\57\2\10\2\42\1\4\1\17\2\57\2\10\4\57\1\6\2\57\3\54\1\uffff\4\57\1\6\2\57\3\54\2\57\2\10\2\57\2\10";
    static final String dfa_138s = "\1\u00ad\1\11\2\170\1\uffff\1\u00ad\2\uffff\2\16\1\u00ad\3\75\1\136\1\7\2\75\1\54\2\75\1\105\3\75\1\136\1\7\2\75\1\54\2\75\2\u00ad\2\75\2\11\2\105\1\u00ad\1\170\2\75\2\11\3\57\1\136\1\7\2\57\1\54\2\57\1\uffff\3\57\1\136\1\7\2\57\1\54\4\57\2\11\2\57\2\11";
    static final String dfa_139s = "\4\uffff\1\1\1\uffff\1\2\1\3\60\uffff\1\4\22\uffff";
    static final String dfa_140s = "\113\uffff}>";
    static final String[] dfa_141s = {
            "\1\2\1\3\3\uffff\1\1\24\uffff\2\4\14\uffff\1\4\1\uffff\4\4\1\uffff\5\4\1\5\6\uffff\3\6\147\uffff\1\7",
            "\1\10\1\11",
            "\2\7\2\uffff\1\7\16\uffff\2\4\10\uffff\1\7\3\uffff\1\4\1\uffff\4\4\1\uffff\5\4\1\12\6\uffff\3\6\5\uffff\1\7\22\uffff\1\7\3\uffff\1\7\7\uffff\1\7\15\uffff\1\7",
            "\2\7\2\uffff\1\7\16\uffff\2\4\10\uffff\1\7\3\uffff\1\4\1\uffff\4\4\1\uffff\5\4\1\12\6\uffff\3\6\5\uffff\1\7\22\uffff\1\7\3\uffff\1\7\7\uffff\1\7\15\uffff\1\7",
            "",
            "\1\15\1\uffff\1\16\1\20\1\23\1\24\44\uffff\1\21\57\uffff\1\17\114\uffff\1\13\1\14\1\22",
            "",
            "",
            "\1\25",
            "\1\25",
            "\1\30\1\uffff\1\31\1\33\1\36\1\37\44\uffff\1\34\57\uffff\1\32\114\uffff\1\26\1\27\1\35",
            "\1\41\15\uffff\1\40",
            "\1\41\15\uffff\1\40",
            "\1\41\15\uffff\1\40",
            "\1\41\15\uffff\1\40\40\uffff\1\17",
            "\1\42\1\43",
            "\1\41\15\uffff\1\40",
            "\1\41\15\uffff\1\40",
            "\1\44",
            "\1\45\2\uffff\1\41\15\uffff\1\40",
            "\1\45\2\uffff\1\41\15\uffff\1\40",
            "\1\46\1\47\30\uffff\2\4\14\uffff\1\4\1\uffff\4\4\1\uffff\6\4\6\uffff\3\6",
            "\1\51\15\uffff\1\50",
            "\1\51\15\uffff\1\50",
            "\1\51\15\uffff\1\50",
            "\1\51\15\uffff\1\50\40\uffff\1\32",
            "\1\52\1\53",
            "\1\51\15\uffff\1\50",
            "\1\51\15\uffff\1\50",
            "\1\54",
            "\1\55\2\uffff\1\51\15\uffff\1\50",
            "\1\55\2\uffff\1\51\15\uffff\1\50",
            "\1\60\1\uffff\1\61\1\63\1\66\1\67\44\uffff\1\64\57\uffff\1\62\114\uffff\1\56\1\57\1\65",
            "\2\70\30\uffff\2\4\14\uffff\1\4\1\uffff\4\4\1\uffff\5\4\161\uffff\1\70",
            "\1\41\15\uffff\1\40",
            "\1\41\15\uffff\1\40",
            "\1\23\1\24",
            "\1\23\1\24",
            "\2\4\14\uffff\1\4\1\uffff\4\4\1\uffff\6\4\6\uffff\3\6",
            "\2\4\14\uffff\1\4\1\uffff\4\4\1\uffff\6\4\6\uffff\3\6",
            "\1\73\1\uffff\1\74\1\76\1\101\1\102\44\uffff\1\77\57\uffff\1\75\114\uffff\1\71\1\72\1\100",
            "\2\7\2\uffff\1\7\16\uffff\2\4\14\uffff\1\4\1\uffff\4\4\1\uffff\5\4\17\uffff\1\7\26\uffff\1\7\7\uffff\1\7\15\uffff\1\7",
            "\1\51\15\uffff\1\50",
            "\1\51\15\uffff\1\50",
            "\1\36\1\37",
            "\1\36\1\37",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41\56\uffff\1\62",
            "\1\103\1\104",
            "\1\41",
            "\1\41",
            "\1\105",
            "\1\106\2\uffff\1\41",
            "\1\106\2\uffff\1\41",
            "",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51\56\uffff\1\75",
            "\1\107\1\110",
            "\1\51",
            "\1\51",
            "\1\111",
            "\1\112\2\uffff\1\51",
            "\1\112\2\uffff\1\51",
            "\1\41",
            "\1\41",
            "\1\66\1\67",
            "\1\66\1\67",
            "\1\51",
            "\1\51",
            "\1\101\1\102",
            "\1\101\1\102"
    };

    static final short[] dfa_135 = DFA.unpackEncodedString(dfa_135s);
    static final short[] dfa_136 = DFA.unpackEncodedString(dfa_136s);
    static final char[] dfa_137 = DFA.unpackEncodedStringToUnsignedChars(dfa_137s);
    static final char[] dfa_138 = DFA.unpackEncodedStringToUnsignedChars(dfa_138s);
    static final short[] dfa_139 = DFA.unpackEncodedString(dfa_139s);
    static final short[] dfa_140 = DFA.unpackEncodedString(dfa_140s);
    static final short[][] dfa_141 = unpackEncodedStringArray(dfa_141s);

    class DFA182 extends DFA {

        public DFA182(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 182;
            this.eot = dfa_135;
            this.eof = dfa_136;
            this.min = dfa_137;
            this.max = dfa_138;
            this.accept = dfa_139;
            this.special = dfa_140;
            this.transition = dfa_141;
        }
        public String getDescription() {
            return "12073:2: ( ( (this_Identification_0= ruleIdentification[$current] )? this_PayloadFeatureSpecializationPart_1= rulePayloadFeatureSpecializationPart[$current] (this_ValuePart_2= ruleValuePart[$current] )? ) | ( (this_Identification_3= ruleIdentification[$current] )? this_ValuePart_4= ruleValuePart[$current] ) | ( ( (lv_ownedRelationship_5_0= ruleOwnedFeatureTyping ) ) ( (lv_ownedRelationship_6_0= ruleOwnedMultiplicity ) )? ) | ( ( (lv_ownedRelationship_7_0= ruleOwnedMultiplicity ) ) ( (lv_ownedRelationship_8_0= ruleOwnedFeatureTyping ) ) ) )";
        }
    }
    static final String dfa_142s = "\1\170\1\uffff\1\u00ad\1\66\10\u00ad\1\54\2\0\2\u00ad\1\54\2\0\1\54\2\0\1\54\2\0\1\54\2\0\1\11\1\uffff\1\54\2\0\5\11";
    static final String dfa_143s = "\15\uffff\1\0\1\4\3\uffff\1\5\1\12\1\uffff\1\13\1\6\1\uffff\1\7\1\2\1\uffff\1\3\1\11\3\uffff\1\10\1\1\5\uffff}>";
    static final String[] dfa_144s = {
            "\2\1\2\uffff\1\1\16\uffff\1\12\1\13\14\uffff\1\4\1\uffff\2\1\1\2\1\3\1\uffff\1\5\1\6\1\7\1\10\1\11\1\1\6\uffff\3\1\5\uffff\1\1\26\uffff\4\1\4\uffff\1\1\15\uffff\1\1",
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
    static final char[] dfa_142 = DFA.unpackEncodedStringToUnsignedChars(dfa_142s);
    static final short[] dfa_143 = DFA.unpackEncodedString(dfa_143s);
    static final short[][] dfa_144 = unpackEncodedStringArray(dfa_144s);

    class DFA183 extends DFA {

        public DFA183(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 183;
            this.eot = dfa_39;
            this.eof = dfa_40;
            this.min = dfa_41;
            this.max = dfa_142;
            this.accept = dfa_43;
            this.special = dfa_143;
            this.transition = dfa_144;
        }
        public String getDescription() {
            return "()+ loopback of 12236:4: ( ( ':' | 'defined' | ':>' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA183_13 = input.LA(1);

                         
                        int index183_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index183_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA183_33 = input.LA(1);

                         
                        int index183_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index183_33);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA183_25 = input.LA(1);

                         
                        int index183_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index183_25);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA183_27 = input.LA(1);

                         
                        int index183_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index183_27);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA183_14 = input.LA(1);

                         
                        int index183_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index183_14);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA183_18 = input.LA(1);

                         
                        int index183_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index183_18);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA183_22 = input.LA(1);

                         
                        int index183_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index183_22);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA183_24 = input.LA(1);

                         
                        int index183_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index183_24);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA183_32 = input.LA(1);

                         
                        int index183_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index183_32);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA183_28 = input.LA(1);

                         
                        int index183_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index183_28);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA183_19 = input.LA(1);

                         
                        int index183_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index183_19);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA183_21 = input.LA(1);

                         
                        int index183_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index183_21);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 183, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_145s = "\1\u00ad\1\54\2\136\2\11\2\uffff";
    static final String[] dfa_146s = {
            "\1\2\1\3\u00a3\uffff\1\1",
            "\1\4",
            "\2\6\4\uffff\1\6\26\uffff\1\5\61\uffff\1\7",
            "\2\6\4\uffff\1\6\26\uffff\1\5\61\uffff\1\7",
            "\1\2\1\3",
            "\1\2\1\3",
            "",
            ""
    };
    static final char[] dfa_145 = DFA.unpackEncodedStringToUnsignedChars(dfa_145s);
    static final short[][] dfa_146 = unpackEncodedStringArray(dfa_146s);

    class DFA188 extends DFA {

        public DFA188(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 188;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_54;
            this.max = dfa_145;
            this.accept = dfa_56;
            this.special = dfa_25;
            this.transition = dfa_146;
        }
        public String getDescription() {
            return "12359:3: ( (lv_ownedRelationship_0_0= ruleFlowEndSubsetting ) )?";
        }
    }
    static final String dfa_147s = "\5\uffff\1\12\2\uffff\2\12\4\uffff";
    static final String dfa_148s = "\1\10\3\54\3\10\1\54\2\17\1\uffff\2\10\1\uffff";
    static final String dfa_149s = "\1\u00ad\1\54\2\136\1\11\1\u00ad\1\11\1\54\2\136\1\uffff\2\11\1\uffff";
    static final String dfa_150s = "\12\uffff\1\1\2\uffff\1\2";
    static final String[] dfa_151s = {
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
    static final short[] dfa_147 = DFA.unpackEncodedString(dfa_147s);
    static final char[] dfa_148 = DFA.unpackEncodedStringToUnsignedChars(dfa_148s);
    static final char[] dfa_149 = DFA.unpackEncodedStringToUnsignedChars(dfa_149s);
    static final short[] dfa_150 = DFA.unpackEncodedString(dfa_150s);
    static final short[][] dfa_151 = unpackEncodedStringArray(dfa_151s);

    class DFA189 extends DFA {

        public DFA189(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 189;
            this.eot = dfa_7;
            this.eof = dfa_147;
            this.min = dfa_148;
            this.max = dfa_149;
            this.accept = dfa_150;
            this.special = dfa_11;
            this.transition = dfa_151;
        }
        public String getDescription() {
            return "12415:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ) | ( (lv_ownedRelatedElement_2_0= ruleFeatureChainPrefix ) ) )";
        }
    }
    static final String dfa_152s = "\6\uffff\1\12\1\uffff\2\12\4\uffff";
    static final String dfa_153s = "\1\u00ad\1\54\2\136\2\11\1\u00ad\1\54\2\136\1\uffff\2\11\1\uffff";
}