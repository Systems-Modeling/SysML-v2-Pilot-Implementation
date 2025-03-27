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
    static final String dfa_266s = "\1\0\134\uffff}>";
    static final String[] dfa_267s = {
            "\1\13\2\uffff\1\64\1\65\3\uffff\1\63\3\uffff\1\1\1\21\3\uffff\1\11\1\uffff\1\12\1\14\1\15\1\16\1\17\1\uffff\1\20\1\22\1\5\1\103\1\76\1\77\1\7\1\10\1\6\1\uffff\1\125\7\uffff\1\70\1\uffff\1\101\1\102\1\66\1\67\1\uffff\1\71\1\72\1\73\1\74\1\75\1\100\1\uffff\1\23\1\54\1\61\1\62\1\55\3\uffff\1\24\1\25\1\27\1\26\1\113\1\110\1\30\1\31\1\36\1\uffff\1\104\1\105\1\106\1\107\1\32\1\114\2\uffff\1\34\1\35\1\115\1\33\1\116\2\uffff\1\37\1\117\16\uffff\1\56\5\uffff\1\41\4\uffff\1\120\1\uffff\1\40\1\uffff\1\42\1\122\1\123\1\43\1\126\1\133\1\134\1\124\1\44\1\45\1\uffff\1\46\1\47\1\50\1\121\1\51\1\uffff\1\53\1\52\35\uffff\1\2\1\3\1\4\1\57\1\60\1\111\1\112\1\127\1\130\1\131\1\132",
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

    static final short[] dfa_262 = DFA.unpackEncodedString(dfa_262s);
    static final char[] dfa_263 = DFA.unpackEncodedStringToUnsignedChars(dfa_263s);
    static final char[] dfa_264 = DFA.unpackEncodedStringToUnsignedChars(dfa_264s);
    static final short[] dfa_265 = DFA.unpackEncodedString(dfa_265s);
    static final short[] dfa_266 = DFA.unpackEncodedString(dfa_266s);
    static final short[][] dfa_267 = unpackEncodedStringArray(dfa_267s);

    class DFA292 extends DFA {

        public DFA292(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 292;
            this.eot = dfa_262;
            this.eof = dfa_262;
            this.min = dfa_263;
            this.max = dfa_264;
            this.accept = dfa_265;
            this.special = dfa_266;
            this.transition = dfa_267;
        }
        public String getDescription() {
            return "()* loopback of 20025:4: ( ( ruleRequirementBodyItem[null] )=>this_RequirementBodyItem_2= ruleRequirementBodyItem[$current] )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA292_0 = input.LA(1);

                         
                        int index292_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA292_0==17) ) {s = 1;}

                        else if ( (LA292_0==174) && (synpred16_InternalSysML())) {s = 2;}

                        else if ( (LA292_0==175) && (synpred16_InternalSysML())) {s = 3;}

                        else if ( (LA292_0==176) && (synpred16_InternalSysML())) {s = 4;}

                        else if ( (LA292_0==32) && (synpred16_InternalSysML())) {s = 5;}

                        else if ( (LA292_0==38) && (synpred16_InternalSysML())) {s = 6;}

                        else if ( (LA292_0==36) && (synpred16_InternalSysML())) {s = 7;}

                        else if ( (LA292_0==37) && (synpred16_InternalSysML())) {s = 8;}

                        else if ( (LA292_0==22) && (synpred16_InternalSysML())) {s = 9;}

                        else if ( (LA292_0==24) && (synpred16_InternalSysML())) {s = 10;}

                        else if ( (LA292_0==RULE_REGULAR_COMMENT) && (synpred16_InternalSysML())) {s = 11;}

                        else if ( (LA292_0==25) && (synpred16_InternalSysML())) {s = 12;}

                        else if ( (LA292_0==26) && (synpred16_InternalSysML())) {s = 13;}

                        else if ( (LA292_0==27) && (synpred16_InternalSysML())) {s = 14;}

                        else if ( (LA292_0==28) && (synpred16_InternalSysML())) {s = 15;}

                        else if ( (LA292_0==30) && (synpred16_InternalSysML())) {s = 16;}

                        else if ( (LA292_0==18) && (synpred16_InternalSysML())) {s = 17;}

                        else if ( (LA292_0==31) && (synpred16_InternalSysML())) {s = 18;}

                        else if ( (LA292_0==62) && (synpred16_InternalSysML())) {s = 19;}

                        else if ( (LA292_0==70) && (synpred16_InternalSysML())) {s = 20;}

                        else if ( (LA292_0==71) && (synpred16_InternalSysML())) {s = 21;}

                        else if ( (LA292_0==73) && (synpred16_InternalSysML())) {s = 22;}

                        else if ( (LA292_0==72) && (synpred16_InternalSysML())) {s = 23;}

                        else if ( (LA292_0==76) && (synpred16_InternalSysML())) {s = 24;}

                        else if ( (LA292_0==77) && (synpred16_InternalSysML())) {s = 25;}

                        else if ( (LA292_0==84) && (synpred16_InternalSysML())) {s = 26;}

                        else if ( (LA292_0==91) && (synpred16_InternalSysML())) {s = 27;}

                        else if ( (LA292_0==88) && (synpred16_InternalSysML())) {s = 28;}

                        else if ( (LA292_0==89) && (synpred16_InternalSysML())) {s = 29;}

                        else if ( (LA292_0==78) && (synpred16_InternalSysML())) {s = 30;}

                        else if ( (LA292_0==95) && (synpred16_InternalSysML())) {s = 31;}

                        else if ( (LA292_0==124) && (synpred16_InternalSysML())) {s = 32;}

                        else if ( (LA292_0==117) && (synpred16_InternalSysML())) {s = 33;}

                        else if ( (LA292_0==126) && (synpred16_InternalSysML())) {s = 34;}

                        else if ( (LA292_0==129) && (synpred16_InternalSysML())) {s = 35;}

                        else if ( (LA292_0==134) && (synpred16_InternalSysML())) {s = 36;}

                        else if ( (LA292_0==135) && (synpred16_InternalSysML())) {s = 37;}

                        else if ( (LA292_0==137) && (synpred16_InternalSysML())) {s = 38;}

                        else if ( (LA292_0==138) && (synpred16_InternalSysML())) {s = 39;}

                        else if ( (LA292_0==139) && (synpred16_InternalSysML())) {s = 40;}

                        else if ( (LA292_0==141) && (synpred16_InternalSysML())) {s = 41;}

                        else if ( (LA292_0==144) && (synpred16_InternalSysML())) {s = 42;}

                        else if ( (LA292_0==143) && (synpred16_InternalSysML())) {s = 43;}

                        else if ( (LA292_0==63) && (synpred16_InternalSysML())) {s = 44;}

                        else if ( (LA292_0==66) && (synpred16_InternalSysML())) {s = 45;}

                        else if ( (LA292_0==111) && (synpred16_InternalSysML())) {s = 46;}

                        else if ( (LA292_0==177) && (synpred16_InternalSysML())) {s = 47;}

                        else if ( (LA292_0==178) && (synpred16_InternalSysML())) {s = 48;}

                        else if ( (LA292_0==64) && (synpred16_InternalSysML())) {s = 49;}

                        else if ( (LA292_0==65) && (synpred16_InternalSysML())) {s = 50;}

                        else if ( (LA292_0==13) && (synpred16_InternalSysML())) {s = 51;}

                        else if ( (LA292_0==RULE_ID) && (synpred16_InternalSysML())) {s = 52;}

                        else if ( (LA292_0==RULE_UNRESTRICTED_NAME) && (synpred16_InternalSysML())) {s = 53;}

                        else if ( (LA292_0==52) && (synpred16_InternalSysML())) {s = 54;}

                        else if ( (LA292_0==53) && (synpred16_InternalSysML())) {s = 55;}

                        else if ( (LA292_0==48) && (synpred16_InternalSysML())) {s = 56;}

                        else if ( (LA292_0==55) && (synpred16_InternalSysML())) {s = 57;}

                        else if ( (LA292_0==56) && (synpred16_InternalSysML())) {s = 58;}

                        else if ( (LA292_0==57) && (synpred16_InternalSysML())) {s = 59;}

                        else if ( (LA292_0==58) && (synpred16_InternalSysML())) {s = 60;}

                        else if ( (LA292_0==59) && (synpred16_InternalSysML())) {s = 61;}

                        else if ( (LA292_0==34) && (synpred16_InternalSysML())) {s = 62;}

                        else if ( (LA292_0==35) && (synpred16_InternalSysML())) {s = 63;}

                        else if ( (LA292_0==60) && (synpred16_InternalSysML())) {s = 64;}

                        else if ( (LA292_0==50) && (synpred16_InternalSysML())) {s = 65;}

                        else if ( (LA292_0==51) && (synpred16_InternalSysML())) {s = 66;}

                        else if ( (LA292_0==33) && (synpred16_InternalSysML())) {s = 67;}

                        else if ( (LA292_0==80) && (synpred16_InternalSysML())) {s = 68;}

                        else if ( (LA292_0==81) && (synpred16_InternalSysML())) {s = 69;}

                        else if ( (LA292_0==82) && (synpred16_InternalSysML())) {s = 70;}

                        else if ( (LA292_0==83) && (synpred16_InternalSysML())) {s = 71;}

                        else if ( (LA292_0==75) && (synpred16_InternalSysML())) {s = 72;}

                        else if ( (LA292_0==179) && (synpred16_InternalSysML())) {s = 73;}

                        else if ( (LA292_0==180) && (synpred16_InternalSysML())) {s = 74;}

                        else if ( (LA292_0==74) && (synpred16_InternalSysML())) {s = 75;}

                        else if ( (LA292_0==85) && (synpred16_InternalSysML())) {s = 76;}

                        else if ( (LA292_0==90) && (synpred16_InternalSysML())) {s = 77;}

                        else if ( (LA292_0==92) && (synpred16_InternalSysML())) {s = 78;}

                        else if ( (LA292_0==96) && (synpred16_InternalSysML())) {s = 79;}

                        else if ( (LA292_0==122) && (synpred16_InternalSysML())) {s = 80;}

                        else if ( (LA292_0==140) && (synpred16_InternalSysML())) {s = 81;}

                        else if ( (LA292_0==127) && (synpred16_InternalSysML())) {s = 82;}

                        else if ( (LA292_0==128) && (synpred16_InternalSysML())) {s = 83;}

                        else if ( (LA292_0==133) && (synpred16_InternalSysML())) {s = 84;}

                        else if ( (LA292_0==40) && (synpred16_InternalSysML())) {s = 85;}

                        else if ( (LA292_0==130) && (synpred16_InternalSysML())) {s = 86;}

                        else if ( (LA292_0==181) && (synpred16_InternalSysML())) {s = 87;}

                        else if ( (LA292_0==182) && (synpred16_InternalSysML())) {s = 88;}

                        else if ( (LA292_0==183) && (synpred16_InternalSysML())) {s = 89;}

                        else if ( (LA292_0==184) && (synpred16_InternalSysML())) {s = 90;}

                        else if ( (LA292_0==131) && (synpred16_InternalSysML())) {s = 91;}

                        else if ( (LA292_0==132) && (synpred16_InternalSysML())) {s = 92;}

                         
                        input.seek(index292_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 292, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_268s = "\4\5\7\uffff";
    static final String dfa_269s = "\4\u00b8\7\uffff";
    static final String dfa_270s = "\4\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7";
    static final String[] dfa_271s = {
            "\1\4\2\uffff\2\4\3\uffff\1\4\4\uffff\1\4\3\uffff\1\4\1\uffff\5\4\1\uffff\11\4\1\uffff\1\4\7\uffff\1\4\1\uffff\4\4\1\uffff\6\4\1\uffff\5\4\3\uffff\11\4\1\uffff\6\4\2\uffff\5\4\2\uffff\2\4\16\uffff\1\4\5\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\4\4\1\5\1\11\1\12\3\4\1\uffff\5\4\1\uffff\2\4\35\uffff\1\1\1\2\1\3\4\4\2\6\1\7\1\10",
            "\1\4\2\uffff\2\4\3\uffff\1\4\4\uffff\1\4\3\uffff\1\4\1\uffff\5\4\1\uffff\11\4\1\uffff\1\4\1\uffff\1\4\5\uffff\1\4\1\uffff\4\4\1\uffff\6\4\1\uffff\5\4\3\uffff\5\4\1\uffff\3\4\1\uffff\6\4\2\uffff\5\4\2\uffff\2\4\16\uffff\1\4\5\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\4\4\1\5\1\11\1\12\3\4\1\uffff\5\4\1\uffff\2\4\40\uffff\4\4\2\6\1\7\1\10",
            "\1\4\2\uffff\2\4\3\uffff\1\4\4\uffff\1\4\3\uffff\1\4\1\uffff\5\4\1\uffff\11\4\1\uffff\1\4\1\uffff\1\4\5\uffff\1\4\1\uffff\4\4\1\uffff\6\4\1\uffff\5\4\3\uffff\5\4\1\uffff\3\4\1\uffff\6\4\2\uffff\5\4\2\uffff\2\4\16\uffff\1\4\5\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\4\4\1\5\1\11\1\12\3\4\1\uffff\5\4\1\uffff\2\4\40\uffff\4\4\2\6\1\7\1\10",
            "\1\4\2\uffff\2\4\3\uffff\1\4\4\uffff\1\4\3\uffff\1\4\1\uffff\5\4\1\uffff\11\4\1\uffff\1\4\1\uffff\1\4\5\uffff\1\4\1\uffff\4\4\1\uffff\6\4\1\uffff\5\4\3\uffff\5\4\1\uffff\3\4\1\uffff\6\4\2\uffff\5\4\2\uffff\2\4\16\uffff\1\4\5\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\4\4\1\5\1\11\1\12\3\4\1\uffff\5\4\1\uffff\2\4\40\uffff\4\4\2\6\1\7\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_268 = DFA.unpackEncodedStringToUnsignedChars(dfa_268s);
    static final char[] dfa_269 = DFA.unpackEncodedStringToUnsignedChars(dfa_269s);
    static final short[] dfa_270 = DFA.unpackEncodedString(dfa_270s);
    static final short[][] dfa_271 = unpackEncodedStringArray(dfa_271s);

    class DFA294 extends DFA {

        public DFA294(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 294;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_268;
            this.max = dfa_269;
            this.accept = dfa_270;
            this.special = dfa_18;
            this.transition = dfa_271;
        }
        public String getDescription() {
            return "20056:2: (this_DefinitionBodyItem_0= ruleDefinitionBodyItem[$current] | ( (lv_ownedRelationship_1_0= ruleSubjectMember ) ) | ( (lv_ownedRelationship_2_0= ruleRequirementConstraintMember ) ) | ( (lv_ownedRelationship_3_0= ruleFramedConcernMember ) ) | ( (lv_ownedRelationship_4_0= ruleRequirementVerificationMember ) ) | ( (lv_ownedRelationship_5_0= ruleActorMember ) ) | ( (lv_ownedRelationship_6_0= ruleStakeholderMember ) ) )";
        }
    }
    static final String dfa_272s = "\11\uffff";
    static final String dfa_273s = "\1\40\1\10\1\uffff\1\54\4\10\1\uffff";
    static final String dfa_274s = "\1\176\1\u00ad\1\uffff\1\54\2\176\2\11\1\uffff";
    static final String dfa_275s = "\2\uffff\1\1\5\uffff\1\2";
    static final String dfa_276s = "\11\uffff}>";
    static final String[] dfa_277s = {
            "\1\1\135\uffff\1\2",
            "\1\4\1\5\u00a3\uffff\1\3",
            "",
            "\1\6",
            "\2\10\3\uffff\1\10\1\uffff\2\10\17\uffff\1\1\1\uffff\2\10\10\uffff\1\7\3\uffff\1\10\1\uffff\4\10\1\uffff\6\10\6\uffff\3\10\70\uffff\1\2",
            "\2\10\3\uffff\1\10\1\uffff\2\10\17\uffff\1\1\1\uffff\2\10\10\uffff\1\7\3\uffff\1\10\1\uffff\4\10\1\uffff\6\10\6\uffff\3\10\70\uffff\1\2",
            "\1\4\1\5",
            "\1\4\1\5",
            ""
    };

    static final short[] dfa_272 = DFA.unpackEncodedString(dfa_272s);
    static final char[] dfa_273 = DFA.unpackEncodedStringToUnsignedChars(dfa_273s);
    static final char[] dfa_274 = DFA.unpackEncodedStringToUnsignedChars(dfa_274s);
    static final short[] dfa_275 = DFA.unpackEncodedString(dfa_275s);
    static final short[] dfa_276 = DFA.unpackEncodedString(dfa_276s);
    static final short[][] dfa_277 = unpackEncodedStringArray(dfa_277s);

    class DFA299 extends DFA {

        public DFA299(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 299;
            this.eot = dfa_272;
            this.eof = dfa_272;
            this.min = dfa_273;
            this.max = dfa_274;
            this.accept = dfa_275;
            this.special = dfa_276;
            this.transition = dfa_277;
        }
        public String getDescription() {
            return "20418:4: ( ( (this_UsageExtensionKeyword_3= ruleUsageExtensionKeyword[$current] )* ruleConstraintUsageKeyword ) | (this_UsageExtensionKeyword_5= ruleUsageExtensionKeyword[$current] )+ )";
        }
    }
    static final String dfa_278s = "\1\u0086\1\u00ad\1\uffff\1\54\2\u0086\2\11\1\uffff";
    static final String[] dfa_279s = {
            "\1\1\145\uffff\1\2",
            "\1\4\1\5\u00a3\uffff\1\3",
            "",
            "\1\6",
            "\2\10\3\uffff\1\10\1\uffff\2\10\17\uffff\1\1\1\uffff\2\10\10\uffff\1\7\3\uffff\1\10\1\uffff\4\10\1\uffff\6\10\6\uffff\3\10\100\uffff\1\2",
            "\2\10\3\uffff\1\10\1\uffff\2\10\17\uffff\1\1\1\uffff\2\10\10\uffff\1\7\3\uffff\1\10\1\uffff\4\10\1\uffff\6\10\6\uffff\3\10\100\uffff\1\2",
            "\1\4\1\5",
            "\1\4\1\5",
            ""
    };
    static final char[] dfa_278 = DFA.unpackEncodedStringToUnsignedChars(dfa_278s);
    static final short[][] dfa_279 = unpackEncodedStringArray(dfa_279s);

    class DFA304 extends DFA {

        public DFA304(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 304;
            this.eot = dfa_272;
            this.eof = dfa_272;
            this.min = dfa_273;
            this.max = dfa_278;
            this.accept = dfa_275;
            this.special = dfa_276;
            this.transition = dfa_279;
        }
        public String getDescription() {
            return "20613:4: ( ( (this_UsageExtensionKeyword_3= ruleUsageExtensionKeyword[$current] )* ruleConcernUsageKeyword ) | (this_UsageExtensionKeyword_5= ruleUsageExtensionKeyword[$current] )+ )";
        }
    }
    static final String dfa_280s = "\172\uffff";
    static final String dfa_281s = "\1\4\3\0\3\uffff\1\0\13\uffff\2\0\5\uffff\1\0\1\uffff\1\0\135\uffff";
    static final String dfa_282s = "\1\u00b4\3\0\3\uffff\1\0\13\uffff\2\0\5\uffff\1\0\1\uffff\1\0\135\uffff";
    static final String dfa_283s = "\4\uffff\1\2\31\uffff\134\1";
    static final String dfa_284s = "\1\0\1\1\1\2\1\3\3\uffff\1\4\13\uffff\1\5\1\6\5\uffff\1\7\1\uffff\1\10\135\uffff}>";
    static final String[] dfa_285s = {
            "\1\4\1\45\2\4\1\23\1\24\3\uffff\1\114\1\uffff\3\4\1\52\3\uffff\1\43\1\uffff\1\44\1\46\1\47\1\50\1\51\1\uffff\1\32\1\53\1\37\1\132\1\125\1\126\1\41\1\42\1\40\1\uffff\1\36\1\160\1\uffff\1\4\2\uffff\1\4\1\uffff\1\117\1\uffff\1\130\1\131\1\115\1\116\1\uffff\1\120\1\121\1\122\1\123\1\124\1\127\1\uffff\1\54\1\105\1\112\1\113\1\106\3\uffff\1\55\1\56\1\60\1\57\1\142\1\137\1\61\1\62\1\67\1\4\1\133\1\134\1\135\1\136\1\63\1\143\1\4\1\uffff\1\65\1\66\1\144\1\64\1\145\1\uffff\1\4\1\70\1\146\1\154\4\uffff\1\153\1\155\2\uffff\1\34\1\uffff\1\156\1\157\1\uffff\1\107\1\161\1\162\1\163\1\164\1\165\1\72\4\uffff\1\147\1\uffff\1\71\1\166\1\73\1\151\1\7\1\74\1\167\1\170\1\uffff\1\152\1\75\1\76\1\171\1\77\1\100\1\101\1\150\1\102\1\uffff\1\104\1\103\14\uffff\2\4\1\uffff\1\4\3\uffff\2\4\3\uffff\5\4\1\1\1\2\1\3\1\110\1\111\1\140\1\141",
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

    static final short[] dfa_280 = DFA.unpackEncodedString(dfa_280s);
    static final char[] dfa_281 = DFA.unpackEncodedStringToUnsignedChars(dfa_281s);
    static final char[] dfa_282 = DFA.unpackEncodedStringToUnsignedChars(dfa_282s);
    static final short[] dfa_283 = DFA.unpackEncodedString(dfa_283s);
    static final short[] dfa_284 = DFA.unpackEncodedString(dfa_284s);
    static final short[][] dfa_285 = unpackEncodedStringArray(dfa_285s);

    class DFA315 extends DFA {

        public DFA315(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 315;
            this.eot = dfa_280;
            this.eof = dfa_280;
            this.min = dfa_281;
            this.max = dfa_282;
            this.accept = dfa_283;
            this.special = dfa_284;
            this.transition = dfa_285;
        }
        public String getDescription() {
            return "()* loopback of 21597:4: ( ( ruleCaseBodyItem[null] )=>this_CaseBodyItem_2= ruleCaseBodyItem[$current] )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA315_0 = input.LA(1);

                         
                        int index315_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA315_0==174) ) {s = 1;}

                        else if ( (LA315_0==175) ) {s = 2;}

                        else if ( (LA315_0==176) ) {s = 3;}

                        else if ( (LA315_0==RULE_STRING_VALUE||(LA315_0>=RULE_DECIMAL_VALUE && LA315_0<=RULE_EXP_VALUE)||(LA315_0>=15 && LA315_0<=17)||LA315_0==43||LA315_0==46||LA315_0==79||LA315_0==86||LA315_0==94||(LA315_0>=157 && LA315_0<=158)||LA315_0==160||(LA315_0>=164 && LA315_0<=165)||(LA315_0>=169 && LA315_0<=173)) ) {s = 4;}

                        else if ( (LA315_0==128) ) {s = 7;}

                        else if ( (LA315_0==RULE_ID) ) {s = 19;}

                        else if ( (LA315_0==RULE_UNRESTRICTED_NAME) ) {s = 20;}

                        else if ( (LA315_0==30) ) {s = 26;}

                        else if ( (LA315_0==106) ) {s = 28;}

                        else if ( (LA315_0==40) && (synpred17_InternalSysML())) {s = 30;}

                        else if ( (LA315_0==32) && (synpred17_InternalSysML())) {s = 31;}

                        else if ( (LA315_0==38) && (synpred17_InternalSysML())) {s = 32;}

                        else if ( (LA315_0==36) && (synpred17_InternalSysML())) {s = 33;}

                        else if ( (LA315_0==37) && (synpred17_InternalSysML())) {s = 34;}

                        else if ( (LA315_0==22) && (synpred17_InternalSysML())) {s = 35;}

                        else if ( (LA315_0==24) && (synpred17_InternalSysML())) {s = 36;}

                        else if ( (LA315_0==RULE_REGULAR_COMMENT) && (synpred17_InternalSysML())) {s = 37;}

                        else if ( (LA315_0==25) && (synpred17_InternalSysML())) {s = 38;}

                        else if ( (LA315_0==26) && (synpred17_InternalSysML())) {s = 39;}

                        else if ( (LA315_0==27) && (synpred17_InternalSysML())) {s = 40;}

                        else if ( (LA315_0==28) && (synpred17_InternalSysML())) {s = 41;}

                        else if ( (LA315_0==18) && (synpred17_InternalSysML())) {s = 42;}

                        else if ( (LA315_0==31) && (synpred17_InternalSysML())) {s = 43;}

                        else if ( (LA315_0==62) && (synpred17_InternalSysML())) {s = 44;}

                        else if ( (LA315_0==70) && (synpred17_InternalSysML())) {s = 45;}

                        else if ( (LA315_0==71) && (synpred17_InternalSysML())) {s = 46;}

                        else if ( (LA315_0==73) && (synpred17_InternalSysML())) {s = 47;}

                        else if ( (LA315_0==72) && (synpred17_InternalSysML())) {s = 48;}

                        else if ( (LA315_0==76) && (synpred17_InternalSysML())) {s = 49;}

                        else if ( (LA315_0==77) && (synpred17_InternalSysML())) {s = 50;}

                        else if ( (LA315_0==84) && (synpred17_InternalSysML())) {s = 51;}

                        else if ( (LA315_0==91) && (synpred17_InternalSysML())) {s = 52;}

                        else if ( (LA315_0==88) && (synpred17_InternalSysML())) {s = 53;}

                        else if ( (LA315_0==89) && (synpred17_InternalSysML())) {s = 54;}

                        else if ( (LA315_0==78) && (synpred17_InternalSysML())) {s = 55;}

                        else if ( (LA315_0==95) && (synpred17_InternalSysML())) {s = 56;}

                        else if ( (LA315_0==124) && (synpred17_InternalSysML())) {s = 57;}

                        else if ( (LA315_0==117) && (synpred17_InternalSysML())) {s = 58;}

                        else if ( (LA315_0==126) && (synpred17_InternalSysML())) {s = 59;}

                        else if ( (LA315_0==129) && (synpred17_InternalSysML())) {s = 60;}

                        else if ( (LA315_0==134) && (synpred17_InternalSysML())) {s = 61;}

                        else if ( (LA315_0==135) && (synpred17_InternalSysML())) {s = 62;}

                        else if ( (LA315_0==137) && (synpred17_InternalSysML())) {s = 63;}

                        else if ( (LA315_0==138) && (synpred17_InternalSysML())) {s = 64;}

                        else if ( (LA315_0==139) && (synpred17_InternalSysML())) {s = 65;}

                        else if ( (LA315_0==141) && (synpred17_InternalSysML())) {s = 66;}

                        else if ( (LA315_0==144) && (synpred17_InternalSysML())) {s = 67;}

                        else if ( (LA315_0==143) && (synpred17_InternalSysML())) {s = 68;}

                        else if ( (LA315_0==63) && (synpred17_InternalSysML())) {s = 69;}

                        else if ( (LA315_0==66) && (synpred17_InternalSysML())) {s = 70;}

                        else if ( (LA315_0==111) && (synpred17_InternalSysML())) {s = 71;}

                        else if ( (LA315_0==177) && (synpred17_InternalSysML())) {s = 72;}

                        else if ( (LA315_0==178) && (synpred17_InternalSysML())) {s = 73;}

                        else if ( (LA315_0==64) && (synpred17_InternalSysML())) {s = 74;}

                        else if ( (LA315_0==65) && (synpred17_InternalSysML())) {s = 75;}

                        else if ( (LA315_0==13) && (synpred17_InternalSysML())) {s = 76;}

                        else if ( (LA315_0==52) && (synpred17_InternalSysML())) {s = 77;}

                        else if ( (LA315_0==53) && (synpred17_InternalSysML())) {s = 78;}

                        else if ( (LA315_0==48) && (synpred17_InternalSysML())) {s = 79;}

                        else if ( (LA315_0==55) && (synpred17_InternalSysML())) {s = 80;}

                        else if ( (LA315_0==56) && (synpred17_InternalSysML())) {s = 81;}

                        else if ( (LA315_0==57) && (synpred17_InternalSysML())) {s = 82;}

                        else if ( (LA315_0==58) && (synpred17_InternalSysML())) {s = 83;}

                        else if ( (LA315_0==59) && (synpred17_InternalSysML())) {s = 84;}

                        else if ( (LA315_0==34) && (synpred17_InternalSysML())) {s = 85;}

                        else if ( (LA315_0==35) && (synpred17_InternalSysML())) {s = 86;}

                        else if ( (LA315_0==60) && (synpred17_InternalSysML())) {s = 87;}

                        else if ( (LA315_0==50) && (synpred17_InternalSysML())) {s = 88;}

                        else if ( (LA315_0==51) && (synpred17_InternalSysML())) {s = 89;}

                        else if ( (LA315_0==33) && (synpred17_InternalSysML())) {s = 90;}

                        else if ( (LA315_0==80) && (synpred17_InternalSysML())) {s = 91;}

                        else if ( (LA315_0==81) && (synpred17_InternalSysML())) {s = 92;}

                        else if ( (LA315_0==82) && (synpred17_InternalSysML())) {s = 93;}

                        else if ( (LA315_0==83) && (synpred17_InternalSysML())) {s = 94;}

                        else if ( (LA315_0==75) && (synpred17_InternalSysML())) {s = 95;}

                        else if ( (LA315_0==179) && (synpred17_InternalSysML())) {s = 96;}

                        else if ( (LA315_0==180) && (synpred17_InternalSysML())) {s = 97;}

                        else if ( (LA315_0==74) && (synpred17_InternalSysML())) {s = 98;}

                        else if ( (LA315_0==85) && (synpred17_InternalSysML())) {s = 99;}

                        else if ( (LA315_0==90) && (synpred17_InternalSysML())) {s = 100;}

                        else if ( (LA315_0==92) && (synpred17_InternalSysML())) {s = 101;}

                        else if ( (LA315_0==96) && (synpred17_InternalSysML())) {s = 102;}

                        else if ( (LA315_0==122) && (synpred17_InternalSysML())) {s = 103;}

                        else if ( (LA315_0==140) && (synpred17_InternalSysML())) {s = 104;}

                        else if ( (LA315_0==127) && (synpred17_InternalSysML())) {s = 105;}

                        else if ( (LA315_0==133) && (synpred17_InternalSysML())) {s = 106;}

                        else if ( (LA315_0==102) && (synpred17_InternalSysML())) {s = 107;}

                        else if ( (LA315_0==97) && (synpred17_InternalSysML())) {s = 108;}

                        else if ( (LA315_0==103) && (synpred17_InternalSysML())) {s = 109;}

                        else if ( (LA315_0==108) && (synpred17_InternalSysML())) {s = 110;}

                        else if ( (LA315_0==109) && (synpred17_InternalSysML())) {s = 111;}

                        else if ( (LA315_0==41) && (synpred17_InternalSysML())) {s = 112;}

                        else if ( (LA315_0==112) && (synpred17_InternalSysML())) {s = 113;}

                        else if ( (LA315_0==113) && (synpred17_InternalSysML())) {s = 114;}

                        else if ( (LA315_0==114) && (synpred17_InternalSysML())) {s = 115;}

                        else if ( (LA315_0==115) && (synpred17_InternalSysML())) {s = 116;}

                        else if ( (LA315_0==116) && (synpred17_InternalSysML())) {s = 117;}

                        else if ( (LA315_0==125) && (synpred17_InternalSysML())) {s = 118;}

                        else if ( (LA315_0==130) && (synpred17_InternalSysML())) {s = 119;}

                        else if ( (LA315_0==131) && (synpred17_InternalSysML())) {s = 120;}

                        else if ( (LA315_0==136) && (synpred17_InternalSysML())) {s = 121;}

                         
                        input.seek(index315_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA315_1 = input.LA(1);

                         
                        int index315_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSysML()) ) {s = 121;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index315_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA315_2 = input.LA(1);

                         
                        int index315_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSysML()) ) {s = 121;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index315_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA315_3 = input.LA(1);

                         
                        int index315_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSysML()) ) {s = 121;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index315_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA315_7 = input.LA(1);

                         
                        int index315_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSysML()) ) {s = 121;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index315_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA315_19 = input.LA(1);

                         
                        int index315_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSysML()) ) {s = 121;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index315_19);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA315_20 = input.LA(1);

                         
                        int index315_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSysML()) ) {s = 121;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index315_20);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA315_26 = input.LA(1);

                         
                        int index315_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSysML()) ) {s = 121;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index315_26);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA315_28 = input.LA(1);

                         
                        int index315_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalSysML()) ) {s = 121;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index315_28);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 315, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_286s = "\1\u0081\1\u00ad\1\uffff\1\54\2\u0081\2\11\1\uffff";
    static final String[] dfa_287s = {
            "\1\1\140\uffff\1\2",
            "\1\4\1\5\u00a3\uffff\1\3",
            "",
            "\1\6",
            "\2\10\3\uffff\1\10\1\uffff\2\10\17\uffff\1\1\1\uffff\2\10\10\uffff\1\7\3\uffff\1\10\1\uffff\4\10\1\uffff\6\10\6\uffff\3\10\73\uffff\1\2",
            "\2\10\3\uffff\1\10\1\uffff\2\10\17\uffff\1\1\1\uffff\2\10\10\uffff\1\7\3\uffff\1\10\1\uffff\4\10\1\uffff\6\10\6\uffff\3\10\73\uffff\1\2",
            "\1\4\1\5",
            "\1\4\1\5",
            ""
    };
    static final char[] dfa_286 = DFA.unpackEncodedStringToUnsignedChars(dfa_286s);
    static final short[][] dfa_287 = unpackEncodedStringArray(dfa_287s);

    class DFA323 extends DFA {

        public DFA323(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 323;
            this.eot = dfa_272;
            this.eof = dfa_272;
            this.min = dfa_273;
            this.max = dfa_286;
            this.accept = dfa_275;
            this.special = dfa_276;
            this.transition = dfa_287;
        }
        public String getDescription() {
            return "22448:4: ( ( (this_UsageExtensionKeyword_3= ruleUsageExtensionKeyword[$current] )* ruleRequirementUsageKeyword ) | (this_UsageExtensionKeyword_5= ruleUsageExtensionKeyword[$current] )+ )";
        }
    }
    static final String dfa_288s = "\1\u008f\1\u00ad\1\uffff\1\54\2\u008f\2\11\1\uffff";
    static final String[] dfa_289s = {
            "\1\1\156\uffff\1\2",
            "\1\4\1\5\u00a3\uffff\1\3",
            "",
            "\1\6",
            "\2\10\3\uffff\1\10\1\uffff\2\10\17\uffff\1\1\1\uffff\2\10\10\uffff\1\7\3\uffff\1\10\1\uffff\4\10\1\uffff\6\10\6\uffff\3\10\111\uffff\1\2",
            "\2\10\3\uffff\1\10\1\uffff\2\10\17\uffff\1\1\1\uffff\2\10\10\uffff\1\7\3\uffff\1\10\1\uffff\4\10\1\uffff\6\10\6\uffff\3\10\111\uffff\1\2",
            "\1\4\1\5",
            "\1\4\1\5",
            ""
    };
    static final char[] dfa_288 = DFA.unpackEncodedStringToUnsignedChars(dfa_288s);
    static final short[][] dfa_289 = unpackEncodedStringArray(dfa_289s);

    class DFA335 extends DFA {

        public DFA335(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 335;
            this.eot = dfa_272;
            this.eof = dfa_272;
            this.min = dfa_273;
            this.max = dfa_288;
            this.accept = dfa_275;
            this.special = dfa_276;
            this.transition = dfa_289;
        }
        public String getDescription() {
            return "23173:4: ( ( (this_UsageExtensionKeyword_3= ruleUsageExtensionKeyword[$current] )* otherlv_4= 'rendering' ) | (this_UsageExtensionKeyword_5= ruleUsageExtensionKeyword[$current] )+ )";
        }
    }
    static final String dfa_290s = "\12\uffff";
    static final String dfa_291s = "\1\u00b9\1\10\1\54\2\17\2\10\2\uffff\1\17";
    static final String dfa_292s = "\1\u00b9\1\u00ad\1\54\2\74\1\11\1\56\2\uffff\1\74";
}