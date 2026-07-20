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
public abstract class InternalSysMLParser20 extends InternalSysMLParser19 {
    public InternalSysMLParser20(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }
    static final String dfa_219s = "\1\0\1\1\1\2\30\uffff}>";
    static final String[] dfa_220s = {
            "\1\14\1\uffff\1\15\1\17\1\22\1\23\5\uffff\1\1\1\2\15\uffff\1\27\14\uffff\1\7\2\uffff\1\20\40\uffff\1\5\6\uffff\1\11\7\uffff\1\16\13\uffff\1\31\25\uffff\1\6\34\uffff\1\25\1\26\1\uffff\1\30\3\uffff\1\3\1\4\3\uffff\1\24\1\10\1\12\1\13\1\21",
            "\1\uffff",
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
            ""
    };

    static final short[] dfa_215 = DFA.unpackEncodedString(dfa_215s);
    static final char[] dfa_216 = DFA.unpackEncodedStringToUnsignedChars(dfa_216s);
    static final char[] dfa_217 = DFA.unpackEncodedStringToUnsignedChars(dfa_217s);
    static final short[] dfa_218 = DFA.unpackEncodedString(dfa_218s);
    static final short[] dfa_219 = DFA.unpackEncodedString(dfa_219s);
    static final short[][] dfa_220 = unpackEncodedStringArray(dfa_220s);

    class DFA237 extends DFA {

        public DFA237(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 237;
            this.eot = dfa_215;
            this.eof = dfa_215;
            this.min = dfa_216;
            this.max = dfa_217;
            this.accept = dfa_218;
            this.special = dfa_219;
            this.transition = dfa_220;
        }
        public String getDescription() {
            return "16029:3: (this_ActionBody_3= ruleActionBody[$current] | ( ( ( '+' | '-' | '~' | 'not' | 'all' | 'null' | '(' | 'true' | 'false' | '.' | '*' | '$' | 'new' | ';' | '{' | 'if' | RULE_STRING_VALUE | RULE_DECIMAL_VALUE | RULE_EXP_VALUE | RULE_ID | RULE_UNRESTRICTED_NAME )=> (lv_ownedRelationship_4_0= ruleNodeParameterMember ) ) this_ActionBody_5= ruleActionBody[$current] ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA237_0 = input.LA(1);

                         
                        int index237_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA237_0==15) ) {s = 1;}

                        else if ( (LA237_0==16) ) {s = 2;}

                        else if ( (LA237_0==164) && (synpred12_InternalSysML())) {s = 3;}

                        else if ( (LA237_0==165) && (synpred12_InternalSysML())) {s = 4;}

                        else if ( (LA237_0==79) && (synpred12_InternalSysML())) {s = 5;}

                        else if ( (LA237_0==128) && (synpred12_InternalSysML())) {s = 6;}

                        else if ( (LA237_0==43) && (synpred12_InternalSysML())) {s = 7;}

                        else if ( (LA237_0==170) && (synpred12_InternalSysML())) {s = 8;}

                        else if ( (LA237_0==86) && (synpred12_InternalSysML())) {s = 9;}

                        else if ( (LA237_0==171) && (synpred12_InternalSysML())) {s = 10;}

                        else if ( (LA237_0==172) && (synpred12_InternalSysML())) {s = 11;}

                        else if ( (LA237_0==RULE_STRING_VALUE) && (synpred12_InternalSysML())) {s = 12;}

                        else if ( (LA237_0==RULE_DECIMAL_VALUE) && (synpred12_InternalSysML())) {s = 13;}

                        else if ( (LA237_0==94) && (synpred12_InternalSysML())) {s = 14;}

                        else if ( (LA237_0==RULE_EXP_VALUE) && (synpred12_InternalSysML())) {s = 15;}

                        else if ( (LA237_0==46) && (synpred12_InternalSysML())) {s = 16;}

                        else if ( (LA237_0==173) && (synpred12_InternalSysML())) {s = 17;}

                        else if ( (LA237_0==RULE_ID) && (synpred12_InternalSysML())) {s = 18;}

                        else if ( (LA237_0==RULE_UNRESTRICTED_NAME) && (synpred12_InternalSysML())) {s = 19;}

                        else if ( (LA237_0==169) && (synpred12_InternalSysML())) {s = 20;}

                        else if ( (LA237_0==157) && (synpred12_InternalSysML())) {s = 21;}

                        else if ( (LA237_0==158) && (synpred12_InternalSysML())) {s = 22;}

                        else if ( (LA237_0==30) && (synpred12_InternalSysML())) {s = 23;}

                        else if ( (LA237_0==160) && (synpred12_InternalSysML())) {s = 24;}

                        else if ( (LA237_0==106) && (synpred12_InternalSysML())) {s = 25;}

                         
                        input.seek(index237_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA237_1 = input.LA(1);

                         
                        int index237_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 26;}

                        else if ( (synpred12_InternalSysML()) ) {s = 25;}

                         
                        input.seek(index237_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA237_2 = input.LA(1);

                         
                        int index237_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 26;}

                        else if ( (synpred12_InternalSysML()) ) {s = 25;}

                         
                        input.seek(index237_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 237, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_221s = "\25\uffff";
    static final String dfa_222s = "\5\37\6\40\1\10\4\uffff\1\54\2\40\2\10";
    static final String dfa_223s = "\11\u00b4\2\164\1\u00ad\4\uffff\1\54\2\164\2\11";
    static final String dfa_224s = "\14\uffff\1\1\1\2\1\3\1\4\5\uffff";
    static final String dfa_225s = "\25\uffff}>";
    static final String[] dfa_226s = {
            "\1\5\1\13\35\uffff\1\6\1\uffff\1\4\1\7\7\uffff\1\10\45\uffff\1\1\1\uffff\1\14\1\15\1\16\1\17\74\uffff\1\2\1\3\1\11\1\12",
            "\1\5\1\13\35\uffff\1\6\1\uffff\1\4\1\7\7\uffff\1\10\47\uffff\1\14\1\15\1\16\1\17\76\uffff\1\11\1\12",
            "\1\5\1\13\35\uffff\1\6\1\uffff\1\4\1\7\7\uffff\1\10\47\uffff\1\14\1\15\1\16\1\17\76\uffff\1\11\1\12",
            "\1\5\1\13\35\uffff\1\6\1\uffff\1\4\1\7\7\uffff\1\10\47\uffff\1\14\1\15\1\16\1\17\76\uffff\1\11\1\12",
            "\1\5\1\13\35\uffff\1\6\2\uffff\1\7\7\uffff\1\10\47\uffff\1\14\1\15\1\16\1\17\76\uffff\1\11\1\12",
            "\1\13\40\uffff\1\7\7\uffff\1\10\47\uffff\1\14\1\15\1\16\1\17\76\uffff\1\11\1\12",
            "\1\13\40\uffff\1\7\7\uffff\1\10\47\uffff\1\14\1\15\1\16\1\17\76\uffff\1\11\1\12",
            "\1\13\50\uffff\1\10\47\uffff\1\14\1\15\1\16\1\17\76\uffff\1\11\1\12",
            "\1\13\120\uffff\1\14\1\15\1\16\1\17\76\uffff\1\11\1\12",
            "\1\13\120\uffff\1\14\1\15\1\16\1\17",
            "\1\13\120\uffff\1\14\1\15\1\16\1\17",
            "\1\21\1\22\u00a3\uffff\1\20",
            "",
            "",
            "",
            "",
            "\1\23",
            "\1\13\13\uffff\1\24\104\uffff\1\14\1\15\1\16\1\17",
            "\1\13\13\uffff\1\24\104\uffff\1\14\1\15\1\16\1\17",
            "\1\21\1\22",
            "\1\21\1\22"
    };

    static final short[] dfa_221 = DFA.unpackEncodedString(dfa_221s);
    static final char[] dfa_222 = DFA.unpackEncodedStringToUnsignedChars(dfa_222s);
    static final char[] dfa_223 = DFA.unpackEncodedStringToUnsignedChars(dfa_223s);
    static final short[] dfa_224 = DFA.unpackEncodedString(dfa_224s);
    static final short[] dfa_225 = DFA.unpackEncodedString(dfa_225s);
    static final short[][] dfa_226 = unpackEncodedStringArray(dfa_226s);

    class DFA238 extends DFA {

        public DFA238(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 238;
            this.eot = dfa_221;
            this.eof = dfa_221;
            this.min = dfa_222;
            this.max = dfa_223;
            this.accept = dfa_224;
            this.special = dfa_225;
            this.transition = dfa_226;
        }
        public String getDescription() {
            return "16094:2: (this_MergeNode_0= ruleMergeNode | this_DecisionNode_1= ruleDecisionNode | this_JoinNode_2= ruleJoinNode | this_ForkNode_3= ruleForkNode )";
        }
    }
    static final String dfa_227s = "\132\uffff";
    static final String dfa_228s = "\1\5\131\uffff";
    static final String dfa_229s = "\1\u00b4\131\uffff";
    static final String dfa_230s = "\1\uffff\1\2\130\1";
}