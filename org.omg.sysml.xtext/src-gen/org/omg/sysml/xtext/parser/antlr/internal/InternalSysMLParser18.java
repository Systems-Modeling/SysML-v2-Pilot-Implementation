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
public abstract class InternalSysMLParser18 extends InternalSysMLParser17 {
    public InternalSysMLParser18(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }
    static final String dfa_194s = "\35\uffff";
    static final String dfa_195s = "\1\4\2\0\32\uffff";
    static final String dfa_196s = "\1\u00ad\2\0\32\uffff";
    static final String dfa_197s = "\3\uffff\31\2\1\1";
    static final String dfa_198s = "\1\0\1\1\1\2\32\uffff}>";
    static final String[] dfa_199s = {
            "\1\14\1\uffff\1\15\1\17\1\22\1\23\5\uffff\1\1\1\2\4\uffff\1\33\10\uffff\1\27\14\uffff\1\7\2\uffff\1\20\40\uffff\1\5\6\uffff\1\11\7\uffff\1\16\3\uffff\1\32\7\uffff\1\31\25\uffff\1\6\34\uffff\1\25\1\26\1\uffff\1\30\3\uffff\1\3\1\4\3\uffff\1\24\1\10\1\12\1\13\1\21",
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
            "",
            "",
            ""
    };

    static final short[] dfa_194 = DFA.unpackEncodedString(dfa_194s);
    static final char[] dfa_195 = DFA.unpackEncodedStringToUnsignedChars(dfa_195s);
    static final char[] dfa_196 = DFA.unpackEncodedStringToUnsignedChars(dfa_196s);
    static final short[] dfa_197 = DFA.unpackEncodedString(dfa_197s);
    static final short[] dfa_198 = DFA.unpackEncodedString(dfa_198s);
    static final short[][] dfa_199 = unpackEncodedStringArray(dfa_199s);

    class DFA219 extends DFA {

        public DFA219(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 219;
            this.eot = dfa_194;
            this.eof = dfa_194;
            this.min = dfa_195;
            this.max = dfa_196;
            this.accept = dfa_197;
            this.special = dfa_198;
            this.transition = dfa_199;
        }
        public String getDescription() {
            return "14376:3: (this_ActionBody_3= ruleActionBody[$current] | ( ( ( ( ( ( ( ruleNodeParameterMember ) ) ( ruleSenderReceiverPart[null] )? ) | ( ( ( ruleEmptyParameterMember ) ) ruleSenderReceiverPart[null] ) ) )=> ( ( ( (lv_ownedRelationship_4_0= ruleNodeParameterMember ) ) (this_SenderReceiverPart_5= ruleSenderReceiverPart[$current] )? ) | ( ( (lv_ownedRelationship_6_0= ruleEmptyParameterMember ) ) this_SenderReceiverPart_7= ruleSenderReceiverPart[$current] ) ) ) this_ActionBody_8= ruleActionBody[$current] ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA219_0 = input.LA(1);

                         
                        int index219_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA219_0==15) ) {s = 1;}

                        else if ( (LA219_0==16) ) {s = 2;}

                        else if ( (LA219_0==164) && (synpred9_InternalSysML())) {s = 3;}

                        else if ( (LA219_0==165) && (synpred9_InternalSysML())) {s = 4;}

                        else if ( (LA219_0==79) && (synpred9_InternalSysML())) {s = 5;}

                        else if ( (LA219_0==128) && (synpred9_InternalSysML())) {s = 6;}

                        else if ( (LA219_0==43) && (synpred9_InternalSysML())) {s = 7;}

                        else if ( (LA219_0==170) && (synpred9_InternalSysML())) {s = 8;}

                        else if ( (LA219_0==86) && (synpred9_InternalSysML())) {s = 9;}

                        else if ( (LA219_0==171) && (synpred9_InternalSysML())) {s = 10;}

                        else if ( (LA219_0==172) && (synpred9_InternalSysML())) {s = 11;}

                        else if ( (LA219_0==RULE_STRING_VALUE) && (synpred9_InternalSysML())) {s = 12;}

                        else if ( (LA219_0==RULE_DECIMAL_VALUE) && (synpred9_InternalSysML())) {s = 13;}

                        else if ( (LA219_0==94) && (synpred9_InternalSysML())) {s = 14;}

                        else if ( (LA219_0==RULE_EXP_VALUE) && (synpred9_InternalSysML())) {s = 15;}

                        else if ( (LA219_0==46) && (synpred9_InternalSysML())) {s = 16;}

                        else if ( (LA219_0==173) && (synpred9_InternalSysML())) {s = 17;}

                        else if ( (LA219_0==RULE_ID) && (synpred9_InternalSysML())) {s = 18;}

                        else if ( (LA219_0==RULE_UNRESTRICTED_NAME) && (synpred9_InternalSysML())) {s = 19;}

                        else if ( (LA219_0==169) && (synpred9_InternalSysML())) {s = 20;}

                        else if ( (LA219_0==157) && (synpred9_InternalSysML())) {s = 21;}

                        else if ( (LA219_0==158) && (synpred9_InternalSysML())) {s = 22;}

                        else if ( (LA219_0==30) && (synpred9_InternalSysML())) {s = 23;}

                        else if ( (LA219_0==160) && (synpred9_InternalSysML())) {s = 24;}

                        else if ( (LA219_0==106) && (synpred9_InternalSysML())) {s = 25;}

                        else if ( (LA219_0==98) && (synpred9_InternalSysML())) {s = 26;}

                        else if ( (LA219_0==21) && (synpred9_InternalSysML())) {s = 27;}

                         
                        input.seek(index219_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA219_1 = input.LA(1);

                         
                        int index219_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 28;}

                        else if ( (synpred9_InternalSysML()) ) {s = 27;}

                         
                        input.seek(index219_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA219_2 = input.LA(1);

                         
                        int index219_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 28;}

                        else if ( (synpred9_InternalSysML()) ) {s = 27;}

                         
                        input.seek(index219_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 219, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_200s = "\40\uffff";
    static final String dfa_201s = "\1\20\21\uffff\1\36\15\uffff";
    static final String dfa_202s = "\1\4\11\uffff\3\54\4\uffff\3\10\4\uffff\1\54\2\0\4\uffff\1\10";
    static final String dfa_203s = "\1\u00ad\11\uffff\1\54\2\151\4\uffff\1\11\1\u00ad\1\11\4\uffff\1\54\2\0\4\uffff\1\11";
    static final String dfa_204s = "\1\uffff\11\1\3\uffff\3\1\1\2\3\uffff\4\1\3\uffff\4\1\1\uffff";
}