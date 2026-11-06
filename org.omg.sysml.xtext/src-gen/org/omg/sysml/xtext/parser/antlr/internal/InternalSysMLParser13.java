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
    static final String dfa_132s = "\1\u00ad\1\uffff\2\136\1\u00ad\1\uffff\2\u00ad\3\75\1\136\1\7\2\75\1\54\2\75\1\54\2\136\2\u00ad\2\75\3\11\1\u00ad\1\11\3\57\1\136\1\7\2\57\1\54\2\57\1\54\2\136\2\57\4\11";
    static final String dfa_133s = "\1\uffff\1\1\3\uffff\1\2\53\uffff";
    static final String dfa_134s = "\61\uffff}>";
    static final String[] dfa_135s = {
            "\1\2\1\3\3\uffff\1\1\1\uffff\2\1\21\uffff\2\1\14\uffff\1\1\1\uffff\4\1\1\uffff\5\1\1\4\6\uffff\3\1\17\uffff\1\1\1\5\126\uffff\1\5",
            "",
            "\2\1\4\uffff\1\5\14\uffff\2\1\10\uffff\1\5\3\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\6\1\7\3\1\6\uffff\3\1\17\uffff\1\1\10\uffff\1\5",
            "\2\1\4\uffff\1\5\14\uffff\2\1\10\uffff\1\5\3\uffff\1\1\1\uffff\4\1\1\uffff\1\1\1\6\1\7\3\1\6\uffff\3\1\17\uffff\1\1\10\uffff\1\5",
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
            "\2\1\4\uffff\1\5\14\uffff\2\1\10\uffff\1\35\3\uffff\1\1\1\uffff\4\1\1\uffff\6\1\6\uffff\3\1\17\uffff\1\1\10\uffff\1\34",
            "\2\1\4\uffff\1\5\14\uffff\2\1\10\uffff\1\35\3\uffff\1\1\1\uffff\4\1\1\uffff\6\1\6\uffff\3\1\17\uffff\1\1\10\uffff\1\34",
            "\1\40\1\uffff\1\41\1\43\1\46\1\47\44\uffff\1\44\57\uffff\1\42\114\uffff\1\36\1\37\1\45",
            "\2\5\5\uffff\2\1\21\uffff\2\1\14\uffff\1\1\1\uffff\4\1\1\uffff\5\1\7\uffff\3\1\17\uffff\1\1\127\uffff\1\5",
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
            "\2\1\4\uffff\1\5\14\uffff\2\1\10\uffff\1\60\3\uffff\1\1\1\uffff\4\1\1\uffff\6\1\6\uffff\3\1\17\uffff\1\1\10\uffff\1\34",
            "\2\1\4\uffff\1\5\14\uffff\2\1\10\uffff\1\60\3\uffff\1\1\1\uffff\4\1\1\uffff\6\1\6\uffff\3\1\17\uffff\1\1\10\uffff\1\34",
            "\1\26",
            "\1\26",
            "\1\46\1\47",
            "\1\46\1\47",
            "\1\51\1\52",
            "\1\51\1\52"
    };

    static final short[] dfa_130 = DFA.unpackEncodedString(dfa_130s);
    static final char[] dfa_131 = DFA.unpackEncodedStringToUnsignedChars(dfa_131s);
    static final char[] dfa_132 = DFA.unpackEncodedStringToUnsignedChars(dfa_132s);
    static final short[] dfa_133 = DFA.unpackEncodedString(dfa_133s);
    static final short[] dfa_134 = DFA.unpackEncodedString(dfa_134s);
    static final short[][] dfa_135 = unpackEncodedStringArray(dfa_135s);

    class DFA161 extends DFA {

        public DFA161(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 161;
            this.eot = dfa_130;
            this.eof = dfa_130;
            this.min = dfa_131;
            this.max = dfa_132;
            this.accept = dfa_133;
            this.special = dfa_134;
            this.transition = dfa_135;
        }
        public String getDescription() {
            return "10649:2: ( ( (this_UsageDeclaration_0= ruleUsageDeclaration[$current] )? (this_ValuePart_1= ruleValuePart[$current] )? ( ruleConnectorKeyword this_InterfacePart_3= ruleInterfacePart[$current] )? ) | this_InterfacePart_4= ruleInterfacePart[$current] )";
        }
    }
    static final String dfa_136s = "\113\uffff";
    static final String dfa_137s = "\2\uffff\2\7\45\uffff\1\7\41\uffff";
    static final String dfa_138s = "\2\10\2\17\1\uffff\1\4\2\uffff\2\16\1\4\4\57\1\6\2\57\3\54\1\10\4\57\1\6\2\57\3\54\1\4\1\10\2\57\2\10\2\42\1\4\1\17\2\57\2\10\4\57\1\6\2\57\3\54\1\uffff\4\57\1\6\2\57\3\54\2\57\2\10\2\57\2\10";
    static final String dfa_139s = "\1\u00ad\1\11\2\170\1\uffff\1\u00ad\2\uffff\2\16\1\u00ad\3\75\1\136\1\7\2\75\1\54\2\75\1\105\3\75\1\136\1\7\2\75\1\54\2\75\2\u00ad\2\75\2\11\2\105\1\u00ad\1\170\2\75\2\11\3\57\1\136\1\7\2\57\1\54\2\57\1\uffff\3\57\1\136\1\7\2\57\1\54\4\57\2\11\2\57\2\11";
    static final String dfa_140s = "\4\uffff\1\1\1\uffff\1\2\1\3\60\uffff\1\4\22\uffff";
    static final String dfa_141s = "\113\uffff}>";
    static final String[] dfa_142s = {
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

    static final short[] dfa_136 = DFA.unpackEncodedString(dfa_136s);
    static final short[] dfa_137 = DFA.unpackEncodedString(dfa_137s);
    static final char[] dfa_138 = DFA.unpackEncodedStringToUnsignedChars(dfa_138s);
    static final char[] dfa_139 = DFA.unpackEncodedStringToUnsignedChars(dfa_139s);
    static final short[] dfa_140 = DFA.unpackEncodedString(dfa_140s);
    static final short[] dfa_141 = DFA.unpackEncodedString(dfa_141s);
    static final short[][] dfa_142 = unpackEncodedStringArray(dfa_142s);

    class DFA183 extends DFA {

        public DFA183(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 183;
            this.eot = dfa_136;
            this.eof = dfa_137;
            this.min = dfa_138;
            this.max = dfa_139;
            this.accept = dfa_140;
            this.special = dfa_141;
            this.transition = dfa_142;
        }
        public String getDescription() {
            return "12099:2: ( ( (this_Identification_0= ruleIdentification[$current] )? this_PayloadFeatureSpecializationPart_1= rulePayloadFeatureSpecializationPart[$current] (this_ValuePart_2= ruleValuePart[$current] )? ) | ( (this_Identification_3= ruleIdentification[$current] )? this_ValuePart_4= ruleValuePart[$current] ) | ( ( (lv_ownedRelationship_5_0= ruleOwnedFeatureTyping ) ) ( (lv_ownedRelationship_6_0= ruleOwnedMultiplicity ) )? ) | ( ( (lv_ownedRelationship_7_0= ruleOwnedMultiplicity ) ) ( (lv_ownedRelationship_8_0= ruleOwnedFeatureTyping ) ) ) )";
        }
    }
    static final String dfa_143s = "\1\170\1\uffff\1\u00ad\1\66\10\u00ad\1\54\2\0\2\u00ad\1\54\2\0\1\54\2\0\1\54\2\0\1\54\2\0\1\11\1\uffff\1\54\2\0\5\11";
}