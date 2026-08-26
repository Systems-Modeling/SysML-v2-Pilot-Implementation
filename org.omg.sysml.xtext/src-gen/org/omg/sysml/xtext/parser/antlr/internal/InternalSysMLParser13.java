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
public abstract class InternalSysMLParser13 extends InternalSysMLParser12 {
    public InternalSysMLParser13(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }
    static final String dfa_133s = "\2\uffff\2\7\45\uffff\1\7\41\uffff";
    static final String dfa_134s = "\2\10\2\17\1\uffff\1\4\2\uffff\2\16\1\4\4\57\1\6\2\57\3\54\1\10\4\57\1\6\2\57\3\54\1\4\1\10\2\57\2\10\2\42\1\4\1\17\2\57\2\10\4\57\1\6\2\57\3\54\1\uffff\4\57\1\6\2\57\3\54\2\57\2\10\2\57\2\10";
    static final String dfa_135s = "\1\u00ad\1\11\2\170\1\uffff\1\u00ad\2\uffff\2\16\1\u00ad\3\75\1\136\1\7\2\75\1\54\2\75\1\105\3\75\1\136\1\7\2\75\1\54\2\75\2\u00ad\2\75\2\11\2\105\1\u00ad\1\170\2\75\2\11\3\57\1\136\1\7\2\57\1\54\2\57\1\uffff\3\57\1\136\1\7\2\57\1\54\4\57\2\11\2\57\2\11";
    static final String dfa_136s = "\4\uffff\1\1\1\uffff\1\2\1\3\60\uffff\1\4\22\uffff";
    static final String dfa_137s = "\113\uffff}>";
    static final String[] dfa_138s = {
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

    static final short[] dfa_132 = DFA.unpackEncodedString(dfa_132s);
    static final short[] dfa_133 = DFA.unpackEncodedString(dfa_133s);
    static final char[] dfa_134 = DFA.unpackEncodedStringToUnsignedChars(dfa_134s);
    static final char[] dfa_135 = DFA.unpackEncodedStringToUnsignedChars(dfa_135s);
    static final short[] dfa_136 = DFA.unpackEncodedString(dfa_136s);
    static final short[] dfa_137 = DFA.unpackEncodedString(dfa_137s);
    static final short[][] dfa_138 = unpackEncodedStringArray(dfa_138s);

    class DFA183 extends DFA {

        public DFA183(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 183;
            this.eot = dfa_132;
            this.eof = dfa_133;
            this.min = dfa_134;
            this.max = dfa_135;
            this.accept = dfa_136;
            this.special = dfa_137;
            this.transition = dfa_138;
        }
        public String getDescription() {
            return "12099:2: ( ( (this_Identification_0= ruleIdentification[$current] )? this_PayloadFeatureSpecializationPart_1= rulePayloadFeatureSpecializationPart[$current] (this_ValuePart_2= ruleValuePart[$current] )? ) | ( (this_Identification_3= ruleIdentification[$current] )? this_ValuePart_4= ruleValuePart[$current] ) | ( ( (lv_ownedRelationship_5_0= ruleOwnedFeatureTyping ) ) ( (lv_ownedRelationship_6_0= ruleOwnedMultiplicity ) )? ) | ( ( (lv_ownedRelationship_7_0= ruleOwnedMultiplicity ) ) ( (lv_ownedRelationship_8_0= ruleOwnedFeatureTyping ) ) ) )";
        }
    }
    static final String dfa_139s = "\1\170\1\uffff\1\u00ad\1\66\10\u00ad\1\54\2\0\2\u00ad\1\54\2\0\1\54\2\0\1\54\2\0\1\54\2\0\1\11\1\uffff\1\54\2\0\5\11";
    static final String dfa_140s = "\15\uffff\1\2\1\5\3\uffff\1\10\1\13\1\uffff\1\4\1\0\1\uffff\1\1\1\11\1\uffff\1\7\1\12\3\uffff\1\3\1\6\5\uffff}>";
    static final String[] dfa_141s = {
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
    static final char[] dfa_139 = DFA.unpackEncodedStringToUnsignedChars(dfa_139s);
    static final short[] dfa_140 = DFA.unpackEncodedString(dfa_140s);
    static final short[][] dfa_141 = unpackEncodedStringArray(dfa_141s);

    class DFA184 extends DFA {

        public DFA184(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 184;
            this.eot = dfa_39;
            this.eof = dfa_40;
            this.min = dfa_41;
            this.max = dfa_139;
            this.accept = dfa_43;
            this.special = dfa_140;
            this.transition = dfa_141;
        }
        public String getDescription() {
            return "()+ loopback of 12262:4: ( ( ':' | 'defined' | ':>' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA184_22 = input.LA(1);

                         
                        int index184_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_22);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA184_24 = input.LA(1);

                         
                        int index184_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_24);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA184_13 = input.LA(1);

                         
                        int index184_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA184_32 = input.LA(1);

                         
                        int index184_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_32);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA184_21 = input.LA(1);

                         
                        int index184_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_21);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA184_14 = input.LA(1);

                         
                        int index184_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_14);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA184_33 = input.LA(1);

                         
                        int index184_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_33);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA184_27 = input.LA(1);

                         
                        int index184_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_27);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA184_18 = input.LA(1);

                         
                        int index184_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_18);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA184_25 = input.LA(1);

                         
                        int index184_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_25);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA184_28 = input.LA(1);

                         
                        int index184_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_28);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA184_19 = input.LA(1);

                         
                        int index184_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 184, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_142s = "\1\u00ad\1\54\2\136\1\11\1\uffff\1\11\1\uffff";
    static final String dfa_143s = "\5\uffff\1\1\1\uffff\1\2";
    static final String[] dfa_144s = {
            "\1\2\1\3\u00a3\uffff\1\1",
            "\1\4",
            "\2\7\4\uffff\1\7\26\uffff\1\6\61\uffff\1\5",
            "\2\7\4\uffff\1\7\26\uffff\1\6\61\uffff\1\5",
            "\1\2\1\3",
            "",
            "\1\2\1\3",
            ""
    };
    static final char[] dfa_142 = DFA.unpackEncodedStringToUnsignedChars(dfa_142s);
    static final short[] dfa_143 = DFA.unpackEncodedString(dfa_143s);
    static final short[][] dfa_144 = unpackEncodedStringArray(dfa_144s);

    class DFA189 extends DFA {

        public DFA189(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 189;
            this.eot = dfa_20;
            this.eof = dfa_57;
            this.min = dfa_58;
            this.max = dfa_142;
            this.accept = dfa_143;
            this.special = dfa_25;
            this.transition = dfa_144;
        }
        public String getDescription() {
            return "12385:3: ( (lv_ownedRelationship_0_0= ruleFlowEndSubsetting ) )?";
        }
    }
    static final String dfa_145s = "\6\uffff\1\12\1\uffff\2\12\4\uffff";
}