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
public abstract class InternalSysMLParser26 extends InternalSysMLParser25 {
    public InternalSysMLParser26(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }
    static final String dfa_293s = "\1\40\1\10\1\uffff\1\54\3\10\1\uffff\1\10";
    static final String dfa_294s = "\1\u008f\1\u00ad\1\uffff\1\54\2\u008f\1\11\1\uffff\1\11";
    static final String dfa_295s = "\2\uffff\1\1\4\uffff\1\2\1\uffff";
    static final String[] dfa_296s = {
            "\1\1\156\uffff\1\2",
            "\1\4\1\5\u00a3\uffff\1\3",
            "",
            "\1\6",
            "\2\7\3\uffff\1\7\1\uffff\2\7\17\uffff\1\1\1\uffff\2\7\10\uffff\1\10\3\uffff\1\7\1\uffff\4\7\1\uffff\6\7\6\uffff\3\7\111\uffff\1\2",
            "\2\7\3\uffff\1\7\1\uffff\2\7\17\uffff\1\1\1\uffff\2\7\10\uffff\1\10\3\uffff\1\7\1\uffff\4\7\1\uffff\6\7\6\uffff\3\7\111\uffff\1\2",
            "\1\4\1\5",
            "",
            "\1\4\1\5"
    };
    static final char[] dfa_293 = DFA.unpackEncodedStringToUnsignedChars(dfa_293s);
    static final char[] dfa_294 = DFA.unpackEncodedStringToUnsignedChars(dfa_294s);
    static final short[] dfa_295 = DFA.unpackEncodedString(dfa_295s);
    static final short[][] dfa_296 = unpackEncodedStringArray(dfa_296s);

    class DFA334 extends DFA {

        public DFA334(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 334;
            this.eot = dfa_277;
            this.eof = dfa_277;
            this.min = dfa_293;
            this.max = dfa_294;
            this.accept = dfa_295;
            this.special = dfa_281;
            this.transition = dfa_296;
        }
        public String getDescription() {
            return "23337:4: ( ( (this_UsageExtensionKeyword_3= ruleUsageExtensionKeyword[$current] )* otherlv_4= 'rendering' ) | (this_UsageExtensionKeyword_5= ruleUsageExtensionKeyword[$current] )+ )";
        }
    }
    static final String dfa_297s = "\12\uffff";
    static final String dfa_298s = "\1\u00b9\1\10\1\54\2\17\2\10\2\uffff\1\17";
    static final String dfa_299s = "\1\u00b9\1\u00ad\1\54\2\74\1\11\1\56\2\uffff\1\74";
    static final String dfa_300s = "\7\uffff\1\1\1\2\1\uffff";
    static final String dfa_301s = "\12\uffff}>";
    static final String[] dfa_302s = {
            "\1\1",
            "\1\3\1\4\u00a3\uffff\1\2",
            "\1\5",
            "\2\7\33\uffff\1\6\17\uffff\1\10",
            "\2\7\33\uffff\1\6\17\uffff\1\10",
            "\1\3\1\4",
            "\1\3\1\4\43\uffff\1\11\1\10",
            "",
            "",
            "\2\7\53\uffff\1\10"
    };

    static final short[] dfa_297 = DFA.unpackEncodedString(dfa_297s);
    static final char[] dfa_298 = DFA.unpackEncodedStringToUnsignedChars(dfa_298s);
    static final char[] dfa_299 = DFA.unpackEncodedStringToUnsignedChars(dfa_299s);
    static final short[] dfa_300 = DFA.unpackEncodedString(dfa_300s);
    static final short[] dfa_301 = DFA.unpackEncodedString(dfa_301s);
    static final short[][] dfa_302 = unpackEncodedStringArray(dfa_302s);

    class DFA341 extends DFA {

        public DFA341(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 341;
            this.eot = dfa_297;
            this.eof = dfa_297;
            this.min = dfa_298;
            this.max = dfa_299;
            this.accept = dfa_300;
            this.special = dfa_301;
            this.transition = dfa_302;
        }
        public String getDescription() {
            return "23659:3: (this_MembershipExpose_0= ruleMembershipExpose | this_NamespaceExpose_1= ruleNamespaceExpose )";
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
            return "23760:3: (this_ImportedNamespace_1= ruleImportedNamespace[$current] | ( (lv_ownedRelatedElement_2_0= ruleFilterPackage ) ) )";
        }
    }
    static final String dfa_303s = "\3\uffff\2\1\6\uffff";
    static final String dfa_304s = "\1\4\1\uffff\1\54\2\15\2\uffff\2\10\2\uffff";
}