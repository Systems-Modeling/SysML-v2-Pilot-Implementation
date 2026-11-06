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
    static final String dfa_144s = "\15\uffff\1\12\1\0\3\uffff\1\7\1\11\1\uffff\1\4\1\1\1\uffff\1\2\1\13\1\uffff\1\6\1\10\3\uffff\1\3\1\5\5\uffff}>";
    static final String[] dfa_145s = {
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
    static final char[] dfa_143 = DFA.unpackEncodedStringToUnsignedChars(dfa_143s);
    static final short[] dfa_144 = DFA.unpackEncodedString(dfa_144s);
    static final short[][] dfa_145 = unpackEncodedStringArray(dfa_145s);

    class DFA184 extends DFA {

        public DFA184(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 184;
            this.eot = dfa_39;
            this.eof = dfa_40;
            this.min = dfa_41;
            this.max = dfa_143;
            this.accept = dfa_43;
            this.special = dfa_144;
            this.transition = dfa_145;
        }
        public String getDescription() {
            return "()+ loopback of 12262:4: ( ( ':' | 'defined' | ':>' | 'subsets' | '::>' | 'references' | '=>' | 'crosses' | ':>>' | 'redefines' )=>this_FeatureSpecialization_0= ruleFeatureSpecialization[$current] )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA184_14 = input.LA(1);

                         
                        int index184_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_14);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA184_22 = input.LA(1);

                         
                        int index184_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_22);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA184_24 = input.LA(1);

                         
                        int index184_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_24);
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
                        int LA184_33 = input.LA(1);

                         
                        int index184_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_33);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA184_27 = input.LA(1);

                         
                        int index184_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_27);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA184_18 = input.LA(1);

                         
                        int index184_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_18);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA184_28 = input.LA(1);

                         
                        int index184_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_28);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA184_19 = input.LA(1);

                         
                        int index184_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_19);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA184_13 = input.LA(1);

                         
                        int index184_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_13);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA184_25 = input.LA(1);

                         
                        int index184_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSysML()) ) {s = 30;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index184_25);
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
    static final String dfa_146s = "\1\u00ad\1\54\2\136\1\11\1\uffff\1\11\1\uffff";
    static final String dfa_147s = "\5\uffff\1\1\1\uffff\1\2";
    static final String[] dfa_148s = {
            "\1\2\1\3\u00a3\uffff\1\1",
            "\1\4",
            "\2\7\4\uffff\1\7\26\uffff\1\6\61\uffff\1\5",
            "\2\7\4\uffff\1\7\26\uffff\1\6\61\uffff\1\5",
            "\1\2\1\3",
            "",
            "\1\2\1\3",
            ""
    };
    static final char[] dfa_146 = DFA.unpackEncodedStringToUnsignedChars(dfa_146s);
    static final short[] dfa_147 = DFA.unpackEncodedString(dfa_147s);
    static final short[][] dfa_148 = unpackEncodedStringArray(dfa_148s);

    class DFA189 extends DFA {

        public DFA189(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 189;
            this.eot = dfa_20;
            this.eof = dfa_53;
            this.min = dfa_54;
            this.max = dfa_146;
            this.accept = dfa_147;
            this.special = dfa_25;
            this.transition = dfa_148;
        }
        public String getDescription() {
            return "12385:3: ( (lv_ownedRelationship_0_0= ruleFlowEndSubsetting ) )?";
        }
    }
    static final String dfa_149s = "\5\uffff\1\12\2\uffff\2\12\4\uffff";
    static final String dfa_150s = "\1\10\3\54\3\10\1\54\2\17\1\uffff\2\10\1\uffff";
    static final String dfa_151s = "\1\u00ad\1\54\2\136\1\11\1\u00ad\1\11\1\54\2\136\1\uffff\2\11\1\uffff";
    static final String dfa_152s = "\12\uffff\1\1\2\uffff\1\2";
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
    static final short[] dfa_149 = DFA.unpackEncodedString(dfa_149s);
    static final char[] dfa_150 = DFA.unpackEncodedStringToUnsignedChars(dfa_150s);
    static final char[] dfa_151 = DFA.unpackEncodedStringToUnsignedChars(dfa_151s);
    static final short[] dfa_152 = DFA.unpackEncodedString(dfa_152s);
    static final short[][] dfa_153 = unpackEncodedStringArray(dfa_153s);

    class DFA190 extends DFA {

        public DFA190(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 190;
            this.eot = dfa_7;
            this.eof = dfa_149;
            this.min = dfa_150;
            this.max = dfa_151;
            this.accept = dfa_152;
            this.special = dfa_11;
            this.transition = dfa_153;
        }
        public String getDescription() {
            return "12441:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '.' ) | ( (lv_ownedRelatedElement_2_0= ruleFeatureChainPrefix ) ) )";
        }
    }
    static final String dfa_154s = "\6\uffff\1\12\1\uffff\2\12\4\uffff";
    static final String dfa_155s = "\1\u00ad\1\54\2\136\2\11\1\u00ad\1\54\2\136\1\uffff\2\11\1\uffff";
    static final String dfa_156s = "\12\uffff\1\2\2\uffff\1\1";
    static final String[] dfa_157s = {
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
    static final short[] dfa_154 = DFA.unpackEncodedString(dfa_154s);
    static final char[] dfa_155 = DFA.unpackEncodedStringToUnsignedChars(dfa_155s);
    static final short[] dfa_156 = DFA.unpackEncodedString(dfa_156s);
    static final short[][] dfa_157 = unpackEncodedStringArray(dfa_157s);

    class DFA191 extends DFA {

        public DFA191(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 191;
            this.eot = dfa_7;
            this.eof = dfa_154;
            this.min = dfa_150;
            this.max = dfa_155;
            this.accept = dfa_156;
            this.special = dfa_11;
            this.transition = dfa_157;
        }
        public String getDescription() {
            return "()+ loopback of 12503:3: ( ( (lv_ownedRelationship_0_0= ruleOwnedFeatureChaining ) ) otherlv_1= '.' )+";
        }
    }
}