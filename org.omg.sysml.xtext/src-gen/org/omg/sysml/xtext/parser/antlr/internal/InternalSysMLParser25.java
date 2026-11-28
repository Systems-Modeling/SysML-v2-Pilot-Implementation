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
public abstract class InternalSysMLParser25 extends InternalSysMLParser24 {
    public InternalSysMLParser25(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }
    static final String dfa_278s = "\4\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7";
    static final String[] dfa_279s = {
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
    static final char[] dfa_276 = DFA.unpackEncodedStringToUnsignedChars(dfa_276s);
    static final char[] dfa_277 = DFA.unpackEncodedStringToUnsignedChars(dfa_277s);
    static final short[] dfa_278 = DFA.unpackEncodedString(dfa_278s);
    static final short[][] dfa_279 = unpackEncodedStringArray(dfa_279s);

    class DFA293 extends DFA {

        public DFA293(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 293;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_276;
            this.max = dfa_277;
            this.accept = dfa_278;
            this.special = dfa_18;
            this.transition = dfa_279;
        }
        public String getDescription() {
            return "20432:2: (this_DefinitionBodyItem_0= ruleDefinitionBodyItem[$current] | ( (lv_ownedRelationship_1_0= ruleSubjectMember ) ) | ( (lv_ownedRelationship_2_0= ruleRequirementConstraintMember ) ) | ( (lv_ownedRelationship_3_0= ruleFramedConcernMember ) ) | ( (lv_ownedRelationship_4_0= ruleRequirementVerificationMember ) ) | ( (lv_ownedRelationship_5_0= ruleActorMember ) ) | ( (lv_ownedRelationship_6_0= ruleStakeholderMember ) ) )";
        }
    }
    static final String dfa_280s = "\11\uffff";
    static final String dfa_281s = "\1\40\1\10\1\uffff\1\54\4\10\1\uffff";
    static final String dfa_282s = "\1\176\1\u00ad\1\uffff\1\54\2\176\2\11\1\uffff";
    static final String dfa_283s = "\2\uffff\1\1\5\uffff\1\2";
    static final String dfa_284s = "\11\uffff}>";
    static final String[] dfa_285s = {
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

    static final short[] dfa_280 = DFA.unpackEncodedString(dfa_280s);
    static final char[] dfa_281 = DFA.unpackEncodedStringToUnsignedChars(dfa_281s);
    static final char[] dfa_282 = DFA.unpackEncodedStringToUnsignedChars(dfa_282s);
    static final short[] dfa_283 = DFA.unpackEncodedString(dfa_283s);
    static final short[] dfa_284 = DFA.unpackEncodedString(dfa_284s);
    static final short[][] dfa_285 = unpackEncodedStringArray(dfa_285s);

    class DFA298 extends DFA {

        public DFA298(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 298;
            this.eot = dfa_280;
            this.eof = dfa_280;
            this.min = dfa_281;
            this.max = dfa_282;
            this.accept = dfa_283;
            this.special = dfa_284;
            this.transition = dfa_285;
        }
        public String getDescription() {
            return "20794:4: ( ( (this_UsageExtensionKeyword_3= ruleUsageExtensionKeyword[$current] )* ruleConstraintUsageKeyword ) | (this_UsageExtensionKeyword_5= ruleUsageExtensionKeyword[$current] )+ )";
        }
    }
    static final String dfa_286s = "\1\u0086\1\u00ad\1\uffff\1\54\2\u0086\2\11\1\uffff";
    static final String[] dfa_287s = {
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
    static final char[] dfa_286 = DFA.unpackEncodedStringToUnsignedChars(dfa_286s);
    static final short[][] dfa_287 = unpackEncodedStringArray(dfa_287s);

    class DFA303 extends DFA {

        public DFA303(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 303;
            this.eot = dfa_280;
            this.eof = dfa_280;
            this.min = dfa_281;
            this.max = dfa_286;
            this.accept = dfa_283;
            this.special = dfa_284;
            this.transition = dfa_287;
        }
        public String getDescription() {
            return "20989:4: ( ( (this_UsageExtensionKeyword_3= ruleUsageExtensionKeyword[$current] )* ruleConcernUsageKeyword ) | (this_UsageExtensionKeyword_5= ruleUsageExtensionKeyword[$current] )+ )";
        }
    }
    static final String dfa_288s = "\172\uffff";
    static final String dfa_289s = "\1\4\3\0\3\uffff\1\0\13\uffff\2\0\5\uffff\1\0\1\uffff\1\0\135\uffff";
    static final String dfa_290s = "\1\u00b4\3\0\3\uffff\1\0\13\uffff\2\0\5\uffff\1\0\1\uffff\1\0\135\uffff";
}