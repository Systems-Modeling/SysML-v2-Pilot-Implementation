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
public abstract class InternalSysMLParser12 extends InternalSysMLParser11 {
    public InternalSysMLParser12(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }
    static final String dfa_278s = "\1\176\1\u00ac\1\uffff\1\54\2\176\2\11\1\uffff";
    static final String dfa_279s = "\2\uffff\1\1\5\uffff\1\2";
    static final String dfa_280s = "\11\uffff}>";
    static final String[] dfa_281s = {
            "\1\1\135\uffff\1\2",
            "\1\4\1\5\u00a2\uffff\1\3",
            "",
            "\1\6",
            "\2\10\3\uffff\1\10\1\uffff\2\10\17\uffff\1\1\1\uffff\2\10\10\uffff\1\7\3\uffff\1\10\1\uffff\4\10\1\uffff\6\10\6\uffff\3\10\70\uffff\1\2",
            "\2\10\3\uffff\1\10\1\uffff\2\10\17\uffff\1\1\1\uffff\2\10\10\uffff\1\7\3\uffff\1\10\1\uffff\4\10\1\uffff\6\10\6\uffff\3\10\70\uffff\1\2",
            "\1\4\1\5",
            "\1\4\1\5",
            ""
    };

    static final short[] dfa_276 = DFA.unpackEncodedString(dfa_276s);
    static final char[] dfa_277 = DFA.unpackEncodedStringToUnsignedChars(dfa_277s);
    static final char[] dfa_278 = DFA.unpackEncodedStringToUnsignedChars(dfa_278s);
    static final short[] dfa_279 = DFA.unpackEncodedString(dfa_279s);
    static final short[] dfa_280 = DFA.unpackEncodedString(dfa_280s);
    static final short[][] dfa_281 = unpackEncodedStringArray(dfa_281s);

    class DFA298 extends DFA {

        public DFA298(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 298;
            this.eot = dfa_276;
            this.eof = dfa_276;
            this.min = dfa_277;
            this.max = dfa_278;
            this.accept = dfa_279;
            this.special = dfa_280;
            this.transition = dfa_281;
        }
        public String getDescription() {
            return "20463:4: ( ( (this_UsageExtensionKeyword_3= ruleUsageExtensionKeyword[$current] )* ruleConstraintUsageKeyword ) | (this_UsageExtensionKeyword_5= ruleUsageExtensionKeyword[$current] )+ )";
        }
    }
    static final String dfa_282s = "\1\40\1\10\1\uffff\1\54\3\10\1\uffff\1\10";
    static final String dfa_283s = "\1\u0086\1\u00ac\1\uffff\1\54\2\u0086\1\11\1\uffff\1\11";
    static final String dfa_284s = "\2\uffff\1\1\4\uffff\1\2\1\uffff";
    static final String[] dfa_285s = {
            "\1\1\145\uffff\1\2",
            "\1\4\1\5\u00a2\uffff\1\3",
            "",
            "\1\6",
            "\2\7\3\uffff\1\7\1\uffff\2\7\17\uffff\1\1\1\uffff\2\7\10\uffff\1\10\3\uffff\1\7\1\uffff\4\7\1\uffff\6\7\6\uffff\3\7\100\uffff\1\2",
            "\2\7\3\uffff\1\7\1\uffff\2\7\17\uffff\1\1\1\uffff\2\7\10\uffff\1\10\3\uffff\1\7\1\uffff\4\7\1\uffff\6\7\6\uffff\3\7\100\uffff\1\2",
            "\1\4\1\5",
            "",
            "\1\4\1\5"
    };
    static final char[] dfa_282 = DFA.unpackEncodedStringToUnsignedChars(dfa_282s);
    static final char[] dfa_283 = DFA.unpackEncodedStringToUnsignedChars(dfa_283s);
    static final short[] dfa_284 = DFA.unpackEncodedString(dfa_284s);
    static final short[][] dfa_285 = unpackEncodedStringArray(dfa_285s);

    class DFA303 extends DFA {

        public DFA303(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 303;
            this.eot = dfa_276;
            this.eof = dfa_276;
            this.min = dfa_282;
            this.max = dfa_283;
            this.accept = dfa_284;
            this.special = dfa_280;
            this.transition = dfa_285;
        }
        public String getDescription() {
            return "20658:4: ( ( (this_UsageExtensionKeyword_3= ruleUsageExtensionKeyword[$current] )* ruleConcernUsageKeyword ) | (this_UsageExtensionKeyword_5= ruleUsageExtensionKeyword[$current] )+ )";
        }
    }
    static final String dfa_286s = "\171\uffff";
    static final String dfa_287s = "\1\4\3\0\3\uffff\1\0\13\uffff\2\0\4\uffff\1\0\1\uffff\1\0\135\uffff";
    static final String dfa_288s = "\1\u00b3\3\0\3\uffff\1\0\13\uffff\2\0\4\uffff\1\0\1\uffff\1\0\135\uffff";
    static final String dfa_289s = "\4\uffff\1\2\30\uffff\134\1";
    static final String dfa_290s = "\1\0\1\1\1\2\1\3\3\uffff\1\4\13\uffff\1\5\1\6\4\uffff\1\7\1\uffff\1\10\135\uffff}>";
    static final String[] dfa_291s = {
            "\1\4\1\44\2\4\1\23\1\24\3\uffff\1\113\1\uffff\3\4\1\51\3\uffff\1\42\1\uffff\1\43\1\45\1\46\1\47\1\50\1\uffff\1\31\1\52\1\36\1\131\1\124\1\125\1\40\1\41\1\37\1\uffff\1\35\1\157\1\uffff\1\4\2\uffff\1\4\1\uffff\1\116\1\uffff\1\127\1\130\1\114\1\115\1\uffff\1\117\1\120\1\121\1\122\1\123\1\126\1\uffff\1\53\1\104\1\111\1\112\1\105\3\uffff\1\54\1\55\1\57\1\56\1\141\1\136\1\60\1\61\1\66\1\4\1\132\1\133\1\134\1\135\1\62\1\142\1\4\1\uffff\1\64\1\65\1\143\1\63\1\144\1\uffff\1\4\1\67\1\145\1\153\4\uffff\1\152\1\154\2\uffff\1\33\1\uffff\1\155\1\156\1\uffff\1\106\1\160\1\161\1\162\1\163\1\164\1\71\4\uffff\1\146\1\uffff\1\70\1\165\1\72\1\150\1\7\1\73\1\166\1\167\1\uffff\1\151\1\74\1\75\1\170\1\76\1\77\1\100\1\147\1\101\1\uffff\1\103\1\102\14\uffff\2\4\1\uffff\1\4\3\uffff\2\4\3\uffff\4\4\1\1\1\2\1\3\1\107\1\110\1\137\1\140",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_286 = DFA.unpackEncodedString(dfa_286s);
    static final char[] dfa_287 = DFA.unpackEncodedStringToUnsignedChars(dfa_287s);
    static final char[] dfa_288 = DFA.unpackEncodedStringToUnsignedChars(dfa_288s);
    static final short[] dfa_289 = DFA.unpackEncodedString(dfa_289s);
    static final short[] dfa_290 = DFA.unpackEncodedString(dfa_290s);
    static final short[][] dfa_291 = unpackEncodedStringArray(dfa_291s);

    class DFA314 extends DFA {

        public DFA314(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 314;
            this.eot = dfa_286;
            this.eof = dfa_286;
            this.min = dfa_287;
            this.max = dfa_288;
            this.accept = dfa_289;
            this.special = dfa_290;
            this.transition = dfa_291;
        }
        public String getDescription() {
            return "()* loopback of 21642:4: ( ( ruleCaseBodyItem[null] )=>this_CaseBodyItem_2= ruleCaseBodyItem[$current] )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA314_0 = input.LA(1);

                         
                        int index314_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA314_0==173) ) {s = 1;}

                        else if ( (LA314_0==174) ) {s = 2;}

                        else if ( (LA314_0==175) ) {s = 3;}

                        else if ( (LA314_0==RULE_STRING_VALUE||(LA314_0>=RULE_DECIMAL_VALUE && LA314_0<=RULE_EXP_VALUE)||(LA314_0>=15 && LA314_0<=17)||LA314_0==43||LA314_0==46||LA314_0==79||LA314_0==86||LA314_0==94||(LA314_0>=157 && LA314_0<=158)||LA314_0==160||(LA314_0>=164 && LA314_0<=165)||(LA314_0>=169 && LA314_0<=172)) ) {s = 4;}

                        else if ( (LA314_0==128) ) {s = 7;}

                        else if ( (LA314_0==RULE_ID) ) {s = 19;}

                        else if ( (LA314_0==RULE_UNRESTRICTED_NAME) ) {s = 20;}

                        else if ( (LA314_0==30) ) {s = 25;}

                        else if ( (LA314_0==106) ) {s = 27;}

                        else if ( (LA314_0==40) && (synpred17_InternalSysML())) {s = 29;}

                        else if ( (LA314_0==32) && (synpred17_InternalSysML())) {s = 30;}

                        else if ( (LA314_0==38) && (synpred17_InternalSysML())) {s = 31;}

                        else if ( (LA314_0==36) && (synpred17_InternalSysML())) {s = 32;}

                        else if ( (LA314_0==37) && (synpred17_InternalSysML())) {s = 33;}

                        else if ( (LA314_0==22) && (synpred17_InternalSysML())) {s = 34;}

                        else if ( (LA314_0==24) && (synpred17_InternalSysML())) {s = 35;}

                        else if ( (LA314_0==RULE_REGULAR_COMMENT) && (synpred17_InternalSysML())) {s = 36;}

                        else if ( (LA314_0==25) && (synpred17_InternalSysML())) {s = 37;}

                        else if ( (LA314_0==26) && (synpred17_InternalSysML())) {s = 38;}

                        else if ( (LA314_0==27) && (synpred17_InternalSysML())) {s = 39;}

                        else if ( (LA314_0==28) && (synpred17_InternalSysML())) {s = 40;}

                        else if ( (LA314_0==18) && (synpred17_InternalSysML())) {s = 41;}

                        else if ( (LA314_0==31) && (synpred17_InternalSysML())) {s = 42;}

                        else if ( (LA314_0==62) && (synpred17_InternalSysML())) {s = 43;}

                        else if ( (LA314_0==70) && (synpred17_InternalSysML())) {s = 44;}

                        else if ( (LA314_0==71) && (synpred17_InternalSysML())) {s = 45;}

                        else if ( (LA314_0==73) && (synpred17_InternalSysML())) {s = 46;}

                        else if ( (LA314_0==72) && (synpred17_InternalSysML())) {s = 47;}

                        else if ( (LA314_0==76) && (synpred17_InternalSysML())) {s = 48;}

                        else if ( (LA314_0==77) && (synpred17_InternalSysML())) {s = 49;}

                        else if ( (LA314_0==84) && (synpred17_InternalSysML())) {s = 50;}

                        else if ( (LA314_0==91) && (synpred17_InternalSysML())) {s = 51;}

                        else if ( (LA314_0==88) && (synpred17_InternalSysML())) {s = 52;}

                        else if ( (LA314_0==89) && (synpred17_InternalSysML())) {s = 53;}

                        else if ( (LA314_0==78) && (synpred17_InternalSysML())) {s = 54;}

                        else if ( (LA314_0==95) && (synpred17_InternalSysML())) {s = 55;}

                        else if ( (LA314_0==124) && (synpred17_InternalSysML())) {s = 56;}

                        else if ( (LA314_0==117) && (synpred17_InternalSysML())) {s = 57;}

                        else if ( (LA314_0==126) && (synpred17_InternalSysML())) {s = 58;}

                        else if ( (LA314_0==129) && (synpred17_InternalSysML())) {s = 59;}

                        else if ( (LA314_0==134) && (synpred17_InternalSysML())) {s = 60;}

                        else if ( (LA314_0==135) && (synpred17_InternalSysML())) {s = 61;}

                        else if ( (LA314_0==137) && (synpred17_InternalSysML())) {s = 62;}

                        else if ( (LA314_0==138) && (synpred17_InternalSysML())) {s = 63;}

                        else if ( (LA314_0==139) && (synpred17_InternalSysML())) {s = 64;}

                        else if ( (LA314_0==141) && (synpred17_InternalSysML())) {s = 65;}

                        else if ( (LA314_0==144) && (synpred17_InternalSysML())) {s = 66;}

                        else if ( (LA314_0==143) && (synpred17_InternalSysML())) {s = 67;}

                        else if ( (LA314_0==63) && (synpred17_InternalSysML())) {s = 68;}

                        else if ( (LA314_0==66) && (synpred17_InternalSysML())) {s = 69;}

                        else if ( (LA314_0==111) && (synpred17_InternalSysML())) {s = 70;}

                        else if ( (LA314_0==176) && (synpred17_InternalSysML())) {s = 71;}

                        else if ( (LA314_0==177) && (synpred17_InternalSysML())) {s = 72;}

                        else if ( (LA314_0==64) && (synpred17_InternalSysML())) {s = 73;}

                        else if ( (LA314_0==65) && (synpred17_InternalSysML())) {s = 74;}

                        else if ( (LA314_0==13) && (synpred17_InternalSysML())) {s = 75;}

                        else if ( (LA314_0==52) && (synpred17_InternalSysML())) {s = 76;}

                        else if ( (LA314_0==53) && (synpred17_InternalSysML())) {s = 77;}

                        else if ( (LA314_0==48) && (synpred17_InternalSysML())) {s = 78;}

                        else if ( (LA314_0==55) && (synpred17_InternalSysML())) {s = 79;}

                        else if ( (LA314_0==56) && (synpred17_InternalSysML())) {s = 80;}

                        else if ( (LA314_0==57) && (synpred17_InternalSysML())) {s = 81;}

                        else if ( (LA314_0==58) && (synpred17_InternalSysML())) {s = 82;}

                        else if ( (LA314_0==59) && (synpred17_InternalSysML())) {s = 83;}

                        else if ( (LA314_0==34) && (synpred17_InternalSysML())) {s = 84;}

                        else if ( (LA314_0==35) && (synpred17_InternalSysML())) {s = 85;}

                        else if ( (LA314_0==60) && (synpred17_InternalSysML())) {s = 86;}

                        else if ( (LA314_0==50) && (synpred17_InternalSysML())) {s = 87;}

                        else if ( (LA314_0==51) && (synpred17_InternalSysML())) {s = 88;}

                        else if ( (LA314_0==33) && (synpred17_InternalSysML())) {s = 89;}

                        else if ( (LA314_0==80) && (synpred17_InternalSysML())) {s = 90;}

                        else if ( (LA314_0==81) && (synpred17_InternalSysML())) {s = 91;}

                        else if ( (LA314_0==82) && (synpred17_InternalSysML())) {s = 92;}

                        else if ( (LA314_0==83) && (synpred17_InternalSysML())) {s = 93;}

                        else if ( (LA314_0==75) && (synpred17_InternalSysML())) {s = 94;}

                        else if ( (LA314_0==178) && (synpred17_InternalSysML())) {s = 95;}

                        else if ( (LA314_0==179) && (synpred17_InternalSysML())) {s = 96;}

                        else if ( (LA314_0==74) && (synpred17_InternalSysML())) {s = 97;}

                        else if ( (LA314_0==85) && (synpred17_InternalSysML())) {s = 98;}

                        else if ( (LA314_0==90) && (synpred17_InternalSysML())) {s = 99;}

                        else if ( (LA314_0==92) && (synpred17_InternalSysML())) {s = 100;}

                        else if ( (LA314_0==96) && (synpred17_InternalSysML())) {s = 101;}

                        else if ( (LA314_0==122) && (synpred17_InternalSysML())) {s = 102;}

                        else if ( (LA314_0==140) && (synpred17_InternalSysML())) {s = 103;}

                        else if ( (LA314_0==127) && (synpred17_InternalSysML())) {s = 104;}

                        else if ( (LA314_0==133) && (synpred17_InternalSysML())) {s = 105;}

                        else if ( (LA314_0==102) && (synpred17_InternalSysML())) {s = 106;}

                        else if ( (LA314_0==97) && (synpred17_InternalSysML())) {s = 107;}

                        else if ( (LA314_0==103) && (synpred17_InternalSysML())) {s = 108;}

                        else if ( (LA314_0==108) && (synpred17_InternalSysML())) {s = 109;}

                        else if ( (LA314_0==109) && (synpred17_InternalSysML())) {s = 110;}

                        else if ( (LA314_0==41) && (synpred17_InternalSysML())) {s = 111;}

                        else if ( (LA314_0==112) && (synpred17_InternalSysML())) {s = 112;}

                        else if ( (LA314_0==113) && (synpred17_InternalSysML())) {s = 113;}

                        else if ( (LA314_0==114) && (synpred17_InternalSysML())) {s = 114;}

                        else if ( (LA314_0==115) && (synpred17_InternalSysML())) {s = 115;}

                        else if ( (LA314_0==116) && (synpred17_InternalSysML())) {s = 116;}

                        else if ( (LA314_0==125) && (synpred17_InternalSysML())) {s = 117;}

                        else if ( (LA314_0==130) && (synpred17_InternalSysML())) {s = 118;}

                        else if ( (LA314_0==131) && (synpred17_InternalSysML())) {s = 119;}

                        else if ( (LA314_0==136) && (synpred17_InternalSysML())) {s = 120;}

                         
                        input.seek(index314_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA314_1 = input.LA(1);

                         
                        int index314_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSysML()) ) {s = 120;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index314_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA314_2 = input.LA(1);

                         
                        int index314_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSysML()) ) {s = 120;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index314_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA314_3 = input.LA(1);

                         
                        int index314_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSysML()) ) {s = 120;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index314_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA314_7 = input.LA(1);

                         
                        int index314_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSysML()) ) {s = 120;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index314_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA314_19 = input.LA(1);

                         
                        int index314_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSysML()) ) {s = 120;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index314_19);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA314_20 = input.LA(1);

                         
                        int index314_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSysML()) ) {s = 120;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index314_20);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA314_25 = input.LA(1);

                         
                        int index314_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSysML()) ) {s = 120;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index314_25);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA314_27 = input.LA(1);

                         
                        int index314_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSysML()) ) {s = 120;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index314_27);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 314, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_292s = "\1\u0081\1\u00ac\1\uffff\1\54\2\u0081\2\11\1\uffff";
    static final String[] dfa_293s = {
            "\1\1\140\uffff\1\2",
            "\1\4\1\5\u00a2\uffff\1\3",
            "",
            "\1\6",
            "\2\10\3\uffff\1\10\1\uffff\2\10\17\uffff\1\1\1\uffff\2\10\10\uffff\1\7\3\uffff\1\10\1\uffff\4\10\1\uffff\6\10\6\uffff\3\10\73\uffff\1\2",
            "\2\10\3\uffff\1\10\1\uffff\2\10\17\uffff\1\1\1\uffff\2\10\10\uffff\1\7\3\uffff\1\10\1\uffff\4\10\1\uffff\6\10\6\uffff\3\10\73\uffff\1\2",
            "\1\4\1\5",
            "\1\4\1\5",
            ""
    };
    static final char[] dfa_292 = DFA.unpackEncodedStringToUnsignedChars(dfa_292s);
    static final short[][] dfa_293 = unpackEncodedStringArray(dfa_293s);

    class DFA322 extends DFA {

        public DFA322(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 322;
            this.eot = dfa_276;
            this.eof = dfa_276;
            this.min = dfa_277;
            this.max = dfa_292;
            this.accept = dfa_279;
            this.special = dfa_280;
            this.transition = dfa_293;
        }
        public String getDescription() {
            return "22493:4: ( ( (this_UsageExtensionKeyword_3= ruleUsageExtensionKeyword[$current] )* ruleRequirementUsageKeyword ) | (this_UsageExtensionKeyword_5= ruleUsageExtensionKeyword[$current] )+ )";
        }
    }
    static final String dfa_294s = "\1\u008f\1\u00ac\1\uffff\1\54\2\u008f\1\11\1\uffff\1\11";
    static final String[] dfa_295s = {
            "\1\1\156\uffff\1\2",
            "\1\4\1\5\u00a2\uffff\1\3",
            "",
            "\1\6",
            "\2\7\3\uffff\1\7\1\uffff\2\7\17\uffff\1\1\1\uffff\2\7\10\uffff\1\10\3\uffff\1\7\1\uffff\4\7\1\uffff\6\7\6\uffff\3\7\111\uffff\1\2",
            "\2\7\3\uffff\1\7\1\uffff\2\7\17\uffff\1\1\1\uffff\2\7\10\uffff\1\10\3\uffff\1\7\1\uffff\4\7\1\uffff\6\7\6\uffff\3\7\111\uffff\1\2",
            "\1\4\1\5",
            "",
            "\1\4\1\5"
    };
    static final char[] dfa_294 = DFA.unpackEncodedStringToUnsignedChars(dfa_294s);
    static final short[][] dfa_295 = unpackEncodedStringArray(dfa_295s);

    class DFA334 extends DFA {

        public DFA334(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 334;
            this.eot = dfa_276;
            this.eof = dfa_276;
            this.min = dfa_282;
            this.max = dfa_294;
            this.accept = dfa_284;
            this.special = dfa_280;
            this.transition = dfa_295;
        }
        public String getDescription() {
            return "23218:4: ( ( (this_UsageExtensionKeyword_3= ruleUsageExtensionKeyword[$current] )* otherlv_4= 'rendering' ) | (this_UsageExtensionKeyword_5= ruleUsageExtensionKeyword[$current] )+ )";
        }
    }
    static final String dfa_296s = "\12\uffff";
    static final String dfa_297s = "\1\u00b8\1\10\1\54\2\17\2\10\2\uffff\1\17";
    static final String dfa_298s = "\1\u00b8\1\u00ac\1\54\2\74\1\11\1\56\2\uffff\1\74";
    static final String dfa_299s = "\7\uffff\1\2\1\1\1\uffff";
    static final String dfa_300s = "\12\uffff}>";
    static final String[] dfa_301s = {
            "\1\1",
            "\1\3\1\4\u00a2\uffff\1\2",
            "\1\5",
            "\2\10\33\uffff\1\6\17\uffff\1\7",
            "\2\10\33\uffff\1\6\17\uffff\1\7",
            "\1\3\1\4",
            "\1\3\1\4\43\uffff\1\11\1\7",
            "",
            "",
            "\2\10\53\uffff\1\7"
    };

    static final short[] dfa_296 = DFA.unpackEncodedString(dfa_296s);
    static final char[] dfa_297 = DFA.unpackEncodedStringToUnsignedChars(dfa_297s);
    static final char[] dfa_298 = DFA.unpackEncodedStringToUnsignedChars(dfa_298s);
    static final short[] dfa_299 = DFA.unpackEncodedString(dfa_299s);
    static final short[] dfa_300 = DFA.unpackEncodedString(dfa_300s);
    static final short[][] dfa_301 = unpackEncodedStringArray(dfa_301s);

    class DFA341 extends DFA {

        public DFA341(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 341;
            this.eot = dfa_296;
            this.eof = dfa_296;
            this.min = dfa_297;
            this.max = dfa_298;
            this.accept = dfa_299;
            this.special = dfa_300;
            this.transition = dfa_301;
        }
        public String getDescription() {
            return "23540:3: (this_MembershipExpose_0= ruleMembershipExpose | this_NamespaceExpose_1= ruleNamespaceExpose )";
        }
    }

    class DFA342 extends DFA {

        public DFA342(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 342;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "23641:3: (this_ImportedNamespace_1= ruleImportedNamespace[$current] | ( (lv_ownedRelatedElement_2_0= ruleFilterPackage ) ) )";
        }
    }
    static final String dfa_302s = "\3\uffff\2\1\6\uffff";
    static final String dfa_303s = "\1\4\1\uffff\1\54\2\15\2\uffff\2\10\2\uffff";
    static final String dfa_304s = "\1\u00ac\1\uffff\1\54\2\u00a8\2\uffff\2\11\2\uffff";
    static final String dfa_305s = "\1\uffff\1\1\3\uffff\1\2\1\4\2\uffff\1\5\1\3";
    static final String[] dfa_306s = {
            "\1\1\1\uffff\2\1\1\3\1\4\5\uffff\2\1\15\uffff\1\5\14\uffff\1\1\2\uffff\1\1\40\uffff\1\1\6\uffff\1\1\7\uffff\1\1\41\uffff\1\1\34\uffff\2\5\1\uffff\1\6\3\uffff\2\1\3\uffff\3\1\1\2",
            "",
            "\1\7",
            "\5\1\1\uffff\3\1\10\uffff\1\1\1\uffff\1\1\13\uffff\1\10\3\1\6\uffff\1\1\5\uffff\2\1\15\uffff\1\1\11\uffff\3\1\5\uffff\3\1\2\uffff\1\1\5\uffff\4\1\12\uffff\1\1\1\uffff\1\1\30\uffff\16\1\1\12\1\1\1\11\7\1",
            "\5\1\1\uffff\3\1\10\uffff\1\1\1\uffff\1\1\13\uffff\1\10\3\1\6\uffff\1\1\5\uffff\2\1\15\uffff\1\1\11\uffff\3\1\5\uffff\3\1\2\uffff\1\1\5\uffff\4\1\12\uffff\1\1\1\uffff\1\1\30\uffff\16\1\1\12\1\1\1\11\7\1",
            "",
            "",
            "\1\3\1\4",
            "\1\3\1\4",
            "",
            ""
    };
    static final short[] dfa_302 = DFA.unpackEncodedString(dfa_302s);
    static final char[] dfa_303 = DFA.unpackEncodedStringToUnsignedChars(dfa_303s);
    static final char[] dfa_304 = DFA.unpackEncodedStringToUnsignedChars(dfa_304s);
    static final short[] dfa_305 = DFA.unpackEncodedString(dfa_305s);
    static final short[][] dfa_306 = unpackEncodedStringArray(dfa_306s);

    class DFA354 extends DFA {

        public DFA354(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 354;
            this.eot = dfa_13;
            this.eof = dfa_302;
            this.min = dfa_303;
            this.max = dfa_304;
            this.accept = dfa_305;
            this.special = dfa_18;
            this.transition = dfa_306;
        }
        public String getDescription() {
            return "25358:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( () ( (lv_operator_2_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_3_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operator_5_0= ruleCastOperator ) ) ( (lv_ownedRelationship_6_0= ruleTypeResultMember ) ) ) )? ) | ( () ( (lv_operand_8_0= ruleSelfReferenceExpression ) ) ( (lv_operator_9_0= ruleClassificationTestOperator ) ) ( (lv_ownedRelationship_10_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operand_12_0= ruleMetadataReference ) ) ( (lv_operator_13_0= ruleMetaClassificationTestOperator ) ) ( (lv_ownedRelationship_14_0= ruleTypeReferenceMember ) ) ) | ( () ( (lv_operand_16_0= ruleSelfReferenceExpression ) ) ( (lv_operator_17_0= ruleCastOperator ) ) ( (lv_ownedRelationship_18_0= ruleTypeResultMember ) ) ) | ( () ( (lv_operand_20_0= ruleMetadataReference ) ) ( (lv_operator_21_0= ruleMetaCastOperator ) ) ( (lv_ownedRelationship_22_0= ruleTypeResultMember ) ) ) )";
        }
    }
    static final String dfa_307s = "\2\uffff\2\7\5\uffff";
}