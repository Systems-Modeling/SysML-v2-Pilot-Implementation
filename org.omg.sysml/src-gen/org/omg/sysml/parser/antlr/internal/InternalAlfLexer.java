package org.omg.sysml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlfLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=10;
    public static final int RULE_NATURAL_VALUE=8;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=4;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_UNRESTRICTED_NAME=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_STRING_VALUE=7;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_SL_NOTE=13;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int RULE_DOCUMENTATION_COMMENT=5;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_ML_NOTE=12;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int RULE_BOOLEAN_VALUE=6;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=14;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int RULE_EXP_VALUE=9;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalAlfLexer() {;} 
    public InternalAlfLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAlfLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAlf.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:11:7: ( 'comment' )
            // InternalAlf.g:11:9: 'comment'
            {
            match("comment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:12:7: ( 'on' )
            // InternalAlf.g:12:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:13:7: ( 'import' )
            // InternalAlf.g:13:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:14:7: ( '::' )
            // InternalAlf.g:14:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:15:7: ( '.' )
            // InternalAlf.g:15:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:16:7: ( '*' )
            // InternalAlf.g:16:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:17:7: ( ';' )
            // InternalAlf.g:17:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:18:7: ( 'as' )
            // InternalAlf.g:18:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:19:7: ( 'package' )
            // InternalAlf.g:19:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:20:7: ( '{' )
            // InternalAlf.g:20:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:21:7: ( '}' )
            // InternalAlf.g:21:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:22:7: ( 'is' )
            // InternalAlf.g:22:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:23:7: ( 'classifier' )
            // InternalAlf.g:23:9: 'classifier'
            {
            match("classifier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:24:7: ( 'class' )
            // InternalAlf.g:24:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:25:7: ( 'datatype' )
            // InternalAlf.g:25:9: 'datatype'
            {
            match("datatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:26:7: ( 'assoc' )
            // InternalAlf.g:26:9: 'assoc'
            {
            match("assoc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:27:7: ( 'behavior' )
            // InternalAlf.g:27:9: 'behavior'
            {
            match("behavior"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:28:7: ( 'function' )
            // InternalAlf.g:28:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:29:7: ( 'feature' )
            // InternalAlf.g:29:9: 'feature'
            {
            match("feature"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:30:7: ( 'abstract' )
            // InternalAlf.g:30:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:31:7: ( 'step' )
            // InternalAlf.g:31:9: 'step'
            {
            match("step"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:32:7: ( 'expr' )
            // InternalAlf.g:32:9: 'expr'
            {
            match("expr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:33:7: ( 'end' )
            // InternalAlf.g:33:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:34:7: ( 'connector' )
            // InternalAlf.g:34:9: 'connector'
            {
            match("connector"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:35:7: ( 'binding' )
            // InternalAlf.g:35:9: 'binding'
            {
            match("binding"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:36:7: ( 'succession' )
            // InternalAlf.g:36:9: 'succession'
            {
            match("succession"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:37:7: ( 'stream' )
            // InternalAlf.g:37:9: 'stream'
            {
            match("stream"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:38:7: ( 'flow' )
            // InternalAlf.g:38:9: 'flow'
            {
            match("flow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:39:7: ( 'composite' )
            // InternalAlf.g:39:9: 'composite'
            {
            match("composite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:40:7: ( 'portion' )
            // InternalAlf.g:40:9: 'portion'
            {
            match("portion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:41:7: ( 'port' )
            // InternalAlf.g:41:9: 'port'
            {
            match("port"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:42:7: ( ':>' )
            // InternalAlf.g:42:9: ':>'
            {
            match(":>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:43:7: ( 'specializes' )
            // InternalAlf.g:43:9: 'specializes'
            {
            match("specializes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:44:7: ( ',' )
            // InternalAlf.g:44:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:45:7: ( 'interaction' )
            // InternalAlf.g:45:9: 'interaction'
            {
            match("interaction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:46:7: ( '(' )
            // InternalAlf.g:46:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:47:7: ( ')' )
            // InternalAlf.g:47:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:48:7: ( ':>>' )
            // InternalAlf.g:48:9: ':>>'
            {
            match(":>>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:49:7: ( 'redefines' )
            // InternalAlf.g:49:9: 'redefines'
            {
            match("redefines"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:50:7: ( '=' )
            // InternalAlf.g:50:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:51:7: ( ':' )
            // InternalAlf.g:51:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:52:7: ( 'all' )
            // InternalAlf.g:52:9: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:53:7: ( 'any' )
            // InternalAlf.g:53:9: 'any'
            {
            match("any"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:54:7: ( 'ordered' )
            // InternalAlf.g:54:9: 'ordered'
            {
            match("ordered"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:55:7: ( 'nonunique' )
            // InternalAlf.g:55:9: 'nonunique'
            {
            match("nonunique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:56:7: ( '[' )
            // InternalAlf.g:56:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:57:7: ( '..' )
            // InternalAlf.g:57:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:58:7: ( ']' )
            // InternalAlf.g:58:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:59:7: ( 'subsets' )
            // InternalAlf.g:59:9: 'subsets'
            {
            match("subsets"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:60:7: ( 'from' )
            // InternalAlf.g:60:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:61:7: ( 'to' )
            // InternalAlf.g:61:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:62:7: ( '=>' )
            // InternalAlf.g:62:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:63:7: ( 'of' )
            // InternalAlf.g:63:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:64:7: ( 'first' )
            // InternalAlf.g:64:9: 'first'
            {
            match("first"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:65:7: ( 'then' )
            // InternalAlf.g:65:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:66:7: ( '?' )
            // InternalAlf.g:66:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:67:7: ( '??' )
            // InternalAlf.g:67:9: '??'
            {
            match("??"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:68:7: ( '||' )
            // InternalAlf.g:68:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:69:7: ( '&&' )
            // InternalAlf.g:69:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:70:7: ( '|' )
            // InternalAlf.g:70:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:71:7: ( '^' )
            // InternalAlf.g:71:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:72:7: ( '&' )
            // InternalAlf.g:72:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:73:7: ( '==' )
            // InternalAlf.g:73:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:74:7: ( '!=' )
            // InternalAlf.g:74:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:75:7: ( 'instanceof' )
            // InternalAlf.g:75:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:76:7: ( 'hastype' )
            // InternalAlf.g:76:9: 'hastype'
            {
            match("hastype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:77:7: ( '<' )
            // InternalAlf.g:77:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:78:7: ( '>' )
            // InternalAlf.g:78:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:79:7: ( '<=' )
            // InternalAlf.g:79:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:80:7: ( '>=' )
            // InternalAlf.g:80:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:81:7: ( '+' )
            // InternalAlf.g:81:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:82:7: ( '-' )
            // InternalAlf.g:82:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:83:7: ( '/' )
            // InternalAlf.g:83:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:84:7: ( '**' )
            // InternalAlf.g:84:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:85:7: ( '@' )
            // InternalAlf.g:85:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:86:7: ( '!' )
            // InternalAlf.g:86:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:87:7: ( '~' )
            // InternalAlf.g:87:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:88:7: ( '->' )
            // InternalAlf.g:88:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:89:7: ( 'allInstances' )
            // InternalAlf.g:89:9: 'allInstances'
            {
            match("allInstances"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:90:7: ( 'null' )
            // InternalAlf.g:90:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:91:7: ( './' )
            // InternalAlf.g:91:9: './'
            {
            match("./"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:92:7: ( 'public' )
            // InternalAlf.g:92:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:93:7: ( 'private' )
            // InternalAlf.g:93:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:94:7: ( 'protected' )
            // InternalAlf.g:94:9: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:95:7: ( 'packaged' )
            // InternalAlf.g:95:9: 'packaged'
            {
            match("packaged"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:96:8: ( 'in' )
            // InternalAlf.g:96:10: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:97:8: ( 'out' )
            // InternalAlf.g:97:10: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:98:8: ( 'inout' )
            // InternalAlf.g:98:10: 'inout'
            {
            match("inout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "RULE_BOOLEAN_VALUE"
    public final void mRULE_BOOLEAN_VALUE() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:12918:20: ( ( 'true' | 'false' ) )
            // InternalAlf.g:12918:22: ( 'true' | 'false' )
            {
            // InternalAlf.g:12918:22: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAlf.g:12918:23: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalAlf.g:12918:30: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN_VALUE"

    // $ANTLR start "RULE_NATURAL_VALUE"
    public final void mRULE_NATURAL_VALUE() throws RecognitionException {
        try {
            int _type = RULE_NATURAL_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:12920:20: ( ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* ) )
            // InternalAlf.g:12920:22: ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* )
            {
            // InternalAlf.g:12920:22: ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'B':
                case 'b':
                    {
                    alt14=2;
                    }
                    break;
                case 'X':
                case 'x':
                    {
                    alt14=3;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '_':
                    {
                    alt14=4;
                    }
                    break;
                default:
                    alt14=1;}

            }
            else if ( ((LA14_0>='1' && LA14_0<='9')) ) {
                alt14=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAlf.g:12920:23: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )
                    {
                    // InternalAlf.g:12920:23: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='0') ) {
                        alt4=1;
                    }
                    else if ( ((LA4_0>='1' && LA4_0<='9')) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalAlf.g:12920:24: '0'
                            {
                            match('0'); 

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:12920:28: '1' .. '9' ( ( '_' )? '0' .. '9' )*
                            {
                            matchRange('1','9'); 
                            // InternalAlf.g:12920:37: ( ( '_' )? '0' .. '9' )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>='0' && LA3_0<='9')||LA3_0=='_') ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalAlf.g:12920:38: ( '_' )? '0' .. '9'
                            	    {
                            	    // InternalAlf.g:12920:38: ( '_' )?
                            	    int alt2=2;
                            	    int LA2_0 = input.LA(1);

                            	    if ( (LA2_0=='_') ) {
                            	        alt2=1;
                            	    }
                            	    switch (alt2) {
                            	        case 1 :
                            	            // InternalAlf.g:12920:38: '_'
                            	            {
                            	            match('_'); 

                            	            }
                            	            break;

                            	    }

                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalAlf.g:12920:55: ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )*
                    {
                    // InternalAlf.g:12920:55: ( '0b' | '0B' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='0') ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1=='b') ) {
                            alt5=1;
                        }
                        else if ( (LA5_1=='B') ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalAlf.g:12920:56: '0b'
                            {
                            match("0b"); 


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:12920:61: '0B'
                            {
                            match("0B"); 


                            }
                            break;

                    }

                    matchRange('0','1'); 
                    // InternalAlf.g:12920:76: ( ( '_' )? '0' .. '1' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='1')||LA7_0=='_') ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalAlf.g:12920:77: ( '_' )? '0' .. '1'
                    	    {
                    	    // InternalAlf.g:12920:77: ( '_' )?
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0=='_') ) {
                    	        alt6=1;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // InternalAlf.g:12920:77: '_'
                    	            {
                    	            match('_'); 

                    	            }
                    	            break;

                    	    }

                    	    matchRange('0','1'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalAlf.g:12920:93: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )*
                    {
                    // InternalAlf.g:12920:93: ( '0x' | '0X' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='0') ) {
                        int LA8_1 = input.LA(2);

                        if ( (LA8_1=='x') ) {
                            alt8=1;
                        }
                        else if ( (LA8_1=='X') ) {
                            alt8=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalAlf.g:12920:94: '0x'
                            {
                            match("0x"); 


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:12920:99: '0X'
                            {
                            match("0X"); 


                            }
                            break;

                    }

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalAlf.g:12920:134: ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='F')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='f')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalAlf.g:12920:135: ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
                    	    {
                    	    // InternalAlf.g:12920:135: ( '_' )?
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0=='_') ) {
                    	        alt9=1;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // InternalAlf.g:12920:135: '_'
                    	            {
                    	            match('_'); 

                    	            }
                    	            break;

                    	    }

                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
                    // InternalAlf.g:12920:171: '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )*
                    {
                    match('0'); 
                    // InternalAlf.g:12920:175: ( '_' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='_') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalAlf.g:12920:175: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }

                    matchRange('0','7'); 
                    // InternalAlf.g:12920:189: ( ( '_' )? '0' .. '7' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='7')||LA13_0=='_') ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalAlf.g:12920:190: ( '_' )? '0' .. '7'
                    	    {
                    	    // InternalAlf.g:12920:190: ( '_' )?
                    	    int alt12=2;
                    	    int LA12_0 = input.LA(1);

                    	    if ( (LA12_0=='_') ) {
                    	        alt12=1;
                    	    }
                    	    switch (alt12) {
                    	        case 1 :
                    	            // InternalAlf.g:12920:190: '_'
                    	            {
                    	            match('_'); 

                    	            }
                    	            break;

                    	    }

                    	    matchRange('0','7'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NATURAL_VALUE"

    // $ANTLR start "RULE_EXP_VALUE"
    public final void mRULE_EXP_VALUE() throws RecognitionException {
        try {
            int _type = RULE_EXP_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:12922:16: ( RULE_NATURAL_VALUE ( 'e' | 'E' ) ( '+' | '-' )? RULE_NATURAL_VALUE )
            // InternalAlf.g:12922:18: RULE_NATURAL_VALUE ( 'e' | 'E' ) ( '+' | '-' )? RULE_NATURAL_VALUE
            {
            mRULE_NATURAL_VALUE(); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAlf.g:12922:47: ( '+' | '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='+'||LA15_0=='-') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAlf.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_NATURAL_VALUE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXP_VALUE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:12924:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAlf.g:12924:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAlf.g:12924:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAlf.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_UNRESTRICTED_NAME"
    public final void mRULE_UNRESTRICTED_NAME() throws RecognitionException {
        try {
            int _type = RULE_UNRESTRICTED_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:12926:24: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalAlf.g:12926:26: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalAlf.g:12926:31: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='\\') ) {
                    alt17=1;
                }
                else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAlf.g:12926:32: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:12926:73: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNRESTRICTED_NAME"

    // $ANTLR start "RULE_STRING_VALUE"
    public final void mRULE_STRING_VALUE() throws RecognitionException {
        try {
            int _type = RULE_STRING_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:12928:19: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalAlf.g:12928:21: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalAlf.g:12928:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='\\') ) {
                    alt18=1;
                }
                else if ( ((LA18_0>='\u0000' && LA18_0<='!')||(LA18_0>='#' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAlf.g:12928:26: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalAlf.g:12928:67: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_VALUE"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:12930:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // InternalAlf.g:12930:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAlf.g:12930:31: ( options {greedy=false; } : . )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='*') ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1=='/') ) {
                        alt19=2;
                    }
                    else if ( ((LA19_1>='\u0000' && LA19_1<='.')||(LA19_1>='0' && LA19_1<='\uFFFF')) ) {
                        alt19=1;
                    }


                }
                else if ( ((LA19_0>='\u0000' && LA19_0<=')')||(LA19_0>='+' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAlf.g:12930:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_DOCUMENTATION_COMMENT"
    public final void mRULE_DOCUMENTATION_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_DOCUMENTATION_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:12932:28: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalAlf.g:12932:30: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalAlf.g:12932:36: ( options {greedy=false; } : . )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='*') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='/') ) {
                        alt20=2;
                    }
                    else if ( ((LA20_1>='\u0000' && LA20_1<='.')||(LA20_1>='0' && LA20_1<='\uFFFF')) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>='\u0000' && LA20_0<=')')||(LA20_0>='+' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAlf.g:12932:64: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOCUMENTATION_COMMENT"

    // $ANTLR start "RULE_ML_NOTE"
    public final void mRULE_ML_NOTE() throws RecognitionException {
        try {
            int _type = RULE_ML_NOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:12934:14: ( '//*' ( options {greedy=false; } : . )* '*/' )
            // InternalAlf.g:12934:16: '//*' ( options {greedy=false; } : . )* '*/'
            {
            match("//*"); 

            // InternalAlf.g:12934:22: ( options {greedy=false; } : . )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='*') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='/') ) {
                        alt21=2;
                    }
                    else if ( ((LA21_1>='\u0000' && LA21_1<='.')||(LA21_1>='0' && LA21_1<='\uFFFF')) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0>='\u0000' && LA21_0<=')')||(LA21_0>='+' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAlf.g:12934:50: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_NOTE"

    // $ANTLR start "RULE_SL_NOTE"
    public final void mRULE_SL_NOTE() throws RecognitionException {
        try {
            int _type = RULE_SL_NOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:12936:14: ( '//' (~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )? ( ( '\\r' )? '\\n' )? )
            // InternalAlf.g:12936:16: '//' (~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )? ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAlf.g:12936:21: (~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>='\u0000' && LA23_0<='\t')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\uFFFF')) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAlf.g:12936:22: ~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )*
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalAlf.g:12936:37: (~ ( ( '\\n' | '\\r' ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\uFFFF')) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalAlf.g:12936:37: ~ ( ( '\\n' | '\\r' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAlf.g:12936:55: ( ( '\\r' )? '\\n' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\n'||LA25_0=='\r') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAlf.g:12936:56: ( '\\r' )? '\\n'
                    {
                    // InternalAlf.g:12936:56: ( '\\r' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='\r') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalAlf.g:12936:56: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_NOTE"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:12938:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAlf.g:12938:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAlf.g:12938:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAlf.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalAlf.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | RULE_BOOLEAN_VALUE | RULE_NATURAL_VALUE | RULE_EXP_VALUE | RULE_ID | RULE_UNRESTRICTED_NAME | RULE_STRING_VALUE | RULE_ML_COMMENT | RULE_DOCUMENTATION_COMMENT | RULE_ML_NOTE | RULE_SL_NOTE | RULE_WS )
        int alt27=99;
        alt27 = dfa27.predict(input);
        switch (alt27) {
            case 1 :
                // InternalAlf.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalAlf.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalAlf.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalAlf.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalAlf.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalAlf.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalAlf.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalAlf.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalAlf.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalAlf.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalAlf.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalAlf.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalAlf.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalAlf.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalAlf.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalAlf.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalAlf.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalAlf.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalAlf.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalAlf.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalAlf.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalAlf.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalAlf.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalAlf.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalAlf.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalAlf.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalAlf.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalAlf.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalAlf.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalAlf.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalAlf.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalAlf.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalAlf.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // InternalAlf.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // InternalAlf.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // InternalAlf.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // InternalAlf.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // InternalAlf.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // InternalAlf.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // InternalAlf.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // InternalAlf.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // InternalAlf.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // InternalAlf.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // InternalAlf.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // InternalAlf.g:1:274: T__59
                {
                mT__59(); 

                }
                break;
            case 46 :
                // InternalAlf.g:1:280: T__60
                {
                mT__60(); 

                }
                break;
            case 47 :
                // InternalAlf.g:1:286: T__61
                {
                mT__61(); 

                }
                break;
            case 48 :
                // InternalAlf.g:1:292: T__62
                {
                mT__62(); 

                }
                break;
            case 49 :
                // InternalAlf.g:1:298: T__63
                {
                mT__63(); 

                }
                break;
            case 50 :
                // InternalAlf.g:1:304: T__64
                {
                mT__64(); 

                }
                break;
            case 51 :
                // InternalAlf.g:1:310: T__65
                {
                mT__65(); 

                }
                break;
            case 52 :
                // InternalAlf.g:1:316: T__66
                {
                mT__66(); 

                }
                break;
            case 53 :
                // InternalAlf.g:1:322: T__67
                {
                mT__67(); 

                }
                break;
            case 54 :
                // InternalAlf.g:1:328: T__68
                {
                mT__68(); 

                }
                break;
            case 55 :
                // InternalAlf.g:1:334: T__69
                {
                mT__69(); 

                }
                break;
            case 56 :
                // InternalAlf.g:1:340: T__70
                {
                mT__70(); 

                }
                break;
            case 57 :
                // InternalAlf.g:1:346: T__71
                {
                mT__71(); 

                }
                break;
            case 58 :
                // InternalAlf.g:1:352: T__72
                {
                mT__72(); 

                }
                break;
            case 59 :
                // InternalAlf.g:1:358: T__73
                {
                mT__73(); 

                }
                break;
            case 60 :
                // InternalAlf.g:1:364: T__74
                {
                mT__74(); 

                }
                break;
            case 61 :
                // InternalAlf.g:1:370: T__75
                {
                mT__75(); 

                }
                break;
            case 62 :
                // InternalAlf.g:1:376: T__76
                {
                mT__76(); 

                }
                break;
            case 63 :
                // InternalAlf.g:1:382: T__77
                {
                mT__77(); 

                }
                break;
            case 64 :
                // InternalAlf.g:1:388: T__78
                {
                mT__78(); 

                }
                break;
            case 65 :
                // InternalAlf.g:1:394: T__79
                {
                mT__79(); 

                }
                break;
            case 66 :
                // InternalAlf.g:1:400: T__80
                {
                mT__80(); 

                }
                break;
            case 67 :
                // InternalAlf.g:1:406: T__81
                {
                mT__81(); 

                }
                break;
            case 68 :
                // InternalAlf.g:1:412: T__82
                {
                mT__82(); 

                }
                break;
            case 69 :
                // InternalAlf.g:1:418: T__83
                {
                mT__83(); 

                }
                break;
            case 70 :
                // InternalAlf.g:1:424: T__84
                {
                mT__84(); 

                }
                break;
            case 71 :
                // InternalAlf.g:1:430: T__85
                {
                mT__85(); 

                }
                break;
            case 72 :
                // InternalAlf.g:1:436: T__86
                {
                mT__86(); 

                }
                break;
            case 73 :
                // InternalAlf.g:1:442: T__87
                {
                mT__87(); 

                }
                break;
            case 74 :
                // InternalAlf.g:1:448: T__88
                {
                mT__88(); 

                }
                break;
            case 75 :
                // InternalAlf.g:1:454: T__89
                {
                mT__89(); 

                }
                break;
            case 76 :
                // InternalAlf.g:1:460: T__90
                {
                mT__90(); 

                }
                break;
            case 77 :
                // InternalAlf.g:1:466: T__91
                {
                mT__91(); 

                }
                break;
            case 78 :
                // InternalAlf.g:1:472: T__92
                {
                mT__92(); 

                }
                break;
            case 79 :
                // InternalAlf.g:1:478: T__93
                {
                mT__93(); 

                }
                break;
            case 80 :
                // InternalAlf.g:1:484: T__94
                {
                mT__94(); 

                }
                break;
            case 81 :
                // InternalAlf.g:1:490: T__95
                {
                mT__95(); 

                }
                break;
            case 82 :
                // InternalAlf.g:1:496: T__96
                {
                mT__96(); 

                }
                break;
            case 83 :
                // InternalAlf.g:1:502: T__97
                {
                mT__97(); 

                }
                break;
            case 84 :
                // InternalAlf.g:1:508: T__98
                {
                mT__98(); 

                }
                break;
            case 85 :
                // InternalAlf.g:1:514: T__99
                {
                mT__99(); 

                }
                break;
            case 86 :
                // InternalAlf.g:1:520: T__100
                {
                mT__100(); 

                }
                break;
            case 87 :
                // InternalAlf.g:1:527: T__101
                {
                mT__101(); 

                }
                break;
            case 88 :
                // InternalAlf.g:1:534: T__102
                {
                mT__102(); 

                }
                break;
            case 89 :
                // InternalAlf.g:1:541: RULE_BOOLEAN_VALUE
                {
                mRULE_BOOLEAN_VALUE(); 

                }
                break;
            case 90 :
                // InternalAlf.g:1:560: RULE_NATURAL_VALUE
                {
                mRULE_NATURAL_VALUE(); 

                }
                break;
            case 91 :
                // InternalAlf.g:1:579: RULE_EXP_VALUE
                {
                mRULE_EXP_VALUE(); 

                }
                break;
            case 92 :
                // InternalAlf.g:1:594: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 93 :
                // InternalAlf.g:1:602: RULE_UNRESTRICTED_NAME
                {
                mRULE_UNRESTRICTED_NAME(); 

                }
                break;
            case 94 :
                // InternalAlf.g:1:625: RULE_STRING_VALUE
                {
                mRULE_STRING_VALUE(); 

                }
                break;
            case 95 :
                // InternalAlf.g:1:643: RULE_ML_COMMENT
                {
                mRULE_INLINE_STATEMENT(); 

                }
                break;
            case 96 :
                // InternalAlf.g:1:659: RULE_DOCUMENTATION_COMMENT
                {
                mRULE_DOCUMENTATION_COMMENT(); 

                }
                break;
            case 97 :
                // InternalAlf.g:1:686: RULE_ML_NOTE
                {
                mRULE_ML_NOTE(); 

                }
                break;
            case 98 :
                // InternalAlf.g:1:699: RULE_SL_NOTE
                {
                mRULE_SL_NOTE(); 

                }
                break;
            case 99 :
                // InternalAlf.g:1:712: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA27_eotS =
        "\1\uffff\3\51\1\70\1\73\1\75\1\uffff\2\51\2\uffff\5\51\3\uffff\1\51\1\127\1\51\2\uffff\1\51\1\136\1\140\1\142\1\uffff\1\144\1\51\1\147\1\151\1\uffff\1\153\1\156\2\uffff\2\163\4\uffff\2\51\1\174\1\51\1\176\2\51\1\u0081\1\u0085\1\uffff\1\u0087\6\uffff\1\u0089\26\51\3\uffff\2\51\1\u00a5\2\51\10\uffff\1\51\7\uffff\1\u00ac\7\uffff\1\163\2\uffff\1\163\3\51\1\uffff\1\51\1\uffff\1\u00b6\1\51\1\uffff\3\51\3\uffff\1\51\1\uffff\1\51\1\u00be\1\u00bf\24\51\1\u00d4\3\51\1\uffff\3\51\2\uffff\1\u00ac\1\uffff\2\163\1\uffff\1\163\5\51\1\uffff\7\51\2\uffff\1\51\1\u00f2\10\51\1\u00fb\1\u00fc\2\51\1\u00ff\4\51\1\u0104\1\uffff\2\51\1\u0107\1\u0108\1\u0109\1\51\1\u00ac\1\uffff\2\u00ac\1\uffff\1\163\1\uffff\2\163\3\51\1\u0113\4\51\1\u0118\1\u0119\4\51\1\uffff\10\51\2\uffff\1\u0126\1\u0109\1\uffff\4\51\1\uffff\2\51\3\uffff\1\51\1\u010c\1\uffff\2\163\4\51\1\uffff\1\51\1\u0139\2\51\2\uffff\4\51\1\u0140\7\51\1\uffff\1\u0148\6\51\2\163\1\uffff\1\163\1\uffff\1\163\1\u0152\3\51\1\u0156\1\uffff\4\51\1\u015c\1\u015d\1\uffff\1\u015e\3\51\1\u0162\1\51\1\u0164\1\uffff\1\51\1\u0166\3\51\1\u016a\1\163\1\uffff\1\163\1\uffff\3\51\1\uffff\2\51\1\u0172\1\51\1\u0174\3\uffff\1\51\1\u0176\1\u0177\1\uffff\1\u0178\1\uffff\1\51\1\uffff\3\51\2\uffff\1\163\1\u017d\1\u017e\3\51\1\uffff\1\51\1\uffff\1\u0183\3\uffff\2\51\1\u0186\1\u0187\2\uffff\1\u0188\1\51\1\u018a\1\51\1\uffff\1\u018c\1\51\3\uffff\1\u018e\1\uffff\1\51\1\uffff\1\u0190\1\uffff\1\u0191\2\uffff";
    static final String DFA27_eofS =
        "\u0192\uffff";
    static final String DFA27_minS =
        "\1\11\1\154\1\146\1\155\1\72\1\56\1\52\1\uffff\1\142\1\141\2\uffff\1\141\1\145\1\141\1\160\1\156\3\uffff\1\145\1\75\1\157\2\uffff\1\150\1\77\1\174\1\46\1\uffff\1\75\1\141\2\75\1\uffff\1\76\1\52\2\uffff\2\60\4\uffff\1\155\1\141\1\60\1\144\1\60\1\164\1\160\2\60\1\uffff\1\76\6\uffff\1\60\1\163\1\154\1\171\1\143\1\162\1\142\1\151\1\164\1\150\2\156\1\141\2\157\1\162\1\154\1\145\1\142\1\145\1\160\2\144\3\uffff\1\156\1\154\1\60\1\145\1\165\10\uffff\1\163\6\uffff\1\0\1\52\1\uffff\4\60\1\uffff\2\60\1\uffff\2\60\1\155\1\156\1\163\1\uffff\1\145\1\uffff\1\60\1\157\1\uffff\1\145\1\164\1\165\3\uffff\1\157\1\uffff\1\164\2\60\1\153\1\164\1\154\1\166\1\164\2\141\1\144\1\143\1\164\1\167\1\155\2\163\1\160\1\145\1\143\1\163\1\143\1\162\1\60\1\145\1\165\1\154\1\uffff\1\156\1\145\1\164\2\uffff\1\0\1\uffff\4\60\1\145\1\157\1\145\1\163\1\162\1\uffff\2\162\1\141\1\164\1\143\1\162\1\156\2\uffff\1\141\1\60\1\151\1\141\1\145\1\164\1\166\1\151\1\164\1\165\2\60\1\164\1\145\1\60\1\141\2\145\1\151\1\60\1\uffff\1\146\1\156\3\60\1\171\4\0\3\60\1\53\1\60\1\156\1\163\1\143\1\60\1\145\1\164\1\141\1\156\2\60\1\141\1\163\1\147\1\157\1\uffff\1\143\1\164\1\143\1\171\1\151\1\156\1\151\1\162\2\uffff\2\60\1\uffff\1\155\1\163\1\164\1\141\1\uffff\2\151\3\uffff\1\160\1\0\1\uffff\2\60\1\164\1\151\1\164\1\146\1\uffff\1\144\1\60\2\143\2\uffff\1\143\1\164\1\145\1\156\1\60\1\145\1\164\1\160\1\157\1\147\1\157\1\145\1\uffff\1\60\2\163\1\154\1\156\1\161\1\145\7\60\1\164\1\157\1\151\1\60\1\uffff\1\164\1\145\1\164\1\141\2\60\1\uffff\1\60\2\145\1\162\1\60\1\156\1\60\1\uffff\1\151\1\60\1\151\1\145\1\165\4\60\1\uffff\1\145\1\162\1\145\1\uffff\1\151\1\157\1\60\1\156\1\60\3\uffff\1\144\2\60\1\uffff\1\60\1\uffff\1\157\1\uffff\1\172\1\163\1\145\1\uffff\4\60\1\162\1\157\1\146\1\uffff\1\143\1\uffff\1\60\3\uffff\1\156\1\145\2\60\2\uffff\1\60\1\156\1\60\1\145\1\uffff\1\60\1\163\3\uffff\1\60\1\uffff\1\163\1\uffff\1\60\1\uffff\1\60\2\uffff";
    static final String DFA27_maxS =
        "\1\176\1\157\1\165\1\163\1\76\1\57\1\52\1\uffff\1\163\1\165\2\uffff\1\141\1\151\2\165\1\170\3\uffff\1\145\1\76\1\165\2\uffff\1\162\1\77\1\174\1\46\1\uffff\1\75\1\141\2\75\1\uffff\1\76\1\57\2\uffff\1\170\1\145\4\uffff\1\156\1\141\1\172\1\144\1\172\1\164\1\160\2\172\1\uffff\1\76\6\uffff\1\172\1\163\1\154\1\171\1\143\1\162\1\142\1\157\1\164\1\150\2\156\1\141\2\157\1\162\1\154\1\162\1\143\1\145\1\160\2\144\3\uffff\1\156\1\154\1\172\1\145\1\165\10\uffff\1\163\6\uffff\1\uffff\1\52\1\uffff\2\61\2\146\1\uffff\1\67\1\145\1\uffff\1\71\1\145\1\160\1\156\1\163\1\uffff\1\145\1\uffff\1\172\1\157\1\uffff\1\145\1\164\1\165\3\uffff\1\157\1\uffff\1\164\2\172\1\153\1\164\1\154\1\166\1\164\2\141\1\144\1\143\1\164\1\167\1\155\2\163\1\160\1\145\1\143\1\163\1\143\1\162\1\172\1\145\1\165\1\154\1\uffff\1\156\1\145\1\164\2\uffff\1\uffff\1\uffff\1\145\1\146\1\67\2\145\1\157\1\145\1\163\1\162\1\uffff\2\162\1\141\1\164\1\143\1\162\1\156\2\uffff\1\141\1\172\1\151\1\141\1\145\1\164\1\166\1\151\1\164\1\165\2\172\1\164\1\145\1\172\1\141\2\145\1\151\1\172\1\uffff\1\146\1\156\3\172\1\171\4\uffff\1\61\1\145\3\146\1\156\1\163\1\143\1\172\1\145\1\164\1\141\1\156\2\172\1\141\1\163\1\147\1\157\1\uffff\1\143\1\164\1\143\1\171\1\151\1\156\1\151\1\162\2\uffff\2\172\1\uffff\1\155\1\163\1\164\1\141\1\uffff\2\151\3\uffff\1\160\1\uffff\1\uffff\1\170\1\146\1\164\1\151\1\164\1\146\1\uffff\1\144\1\172\2\143\2\uffff\1\143\1\164\1\145\1\156\1\172\1\145\1\164\1\160\1\157\1\147\1\157\1\145\1\uffff\1\172\2\163\1\154\1\156\1\161\1\145\6\146\1\172\1\164\1\157\1\151\1\172\1\uffff\1\164\1\145\1\164\1\141\2\172\1\uffff\1\172\2\145\1\162\1\172\1\156\1\172\1\uffff\1\151\1\172\1\151\1\145\1\165\1\172\3\146\1\uffff\1\145\1\162\1\145\1\uffff\1\151\1\157\1\172\1\156\1\172\3\uffff\1\144\2\172\1\uffff\1\172\1\uffff\1\157\1\uffff\1\172\1\163\1\145\1\uffff\2\146\2\172\1\162\1\157\1\146\1\uffff\1\143\1\uffff\1\172\3\uffff\1\156\1\145\2\172\2\uffff\1\172\1\156\1\172\1\145\1\uffff\1\172\1\163\3\uffff\1\172\1\uffff\1\163\1\uffff\1\172\1\uffff\1\172\2\uffff";
    static final String DFA27_acceptS =
        "\7\uffff\1\7\2\uffff\1\12\1\13\5\uffff\1\42\1\44\1\45\3\uffff\1\56\1\60\4\uffff\1\75\4\uffff\1\107\2\uffff\1\113\1\115\2\uffff\1\134\1\135\1\136\1\143\11\uffff\1\4\1\uffff\1\51\1\57\1\121\1\5\1\112\1\6\27\uffff\1\64\1\77\1\50\5\uffff\1\71\1\70\1\72\1\74\1\73\1\76\1\100\1\114\1\uffff\1\105\1\103\1\106\1\104\1\116\1\110\2\uffff\1\111\4\uffff\1\132\2\uffff\1\133\5\uffff\1\2\1\uffff\1\65\2\uffff\1\14\3\uffff\1\126\1\46\1\40\1\uffff\1\10\33\uffff\1\63\3\uffff\1\137\1\140\1\uffff\1\142\11\uffff\1\127\7\uffff\1\52\1\53\24\uffff\1\27\35\uffff\1\37\10\uffff\1\34\1\62\2\uffff\1\25\4\uffff\1\26\2\uffff\1\120\1\67\1\131\2\uffff\1\141\6\uffff\1\16\4\uffff\1\130\1\20\14\uffff\1\66\22\uffff\1\3\6\uffff\1\122\7\uffff\1\33\11\uffff\1\1\3\uffff\1\54\5\uffff\1\11\1\36\1\123\3\uffff\1\31\1\uffff\1\23\1\uffff\1\61\3\uffff\1\102\7\uffff\1\24\1\uffff\1\125\1\uffff\1\17\1\21\1\22\4\uffff\1\35\1\30\4\uffff\1\124\2\uffff\1\47\1\55\1\15\1\uffff\1\101\1\uffff\1\32\1\uffff\1\43\1\uffff\1\41\1\117";
    static final String DFA27_specialS =
        "\154\uffff\1\6\76\uffff\1\5\57\uffff\1\3\1\0\1\1\1\2\54\uffff\1\4\u0086\uffff}>";
    static final String[] DFA27_transitionS = {
            "\2\54\2\uffff\1\54\22\uffff\1\54\1\36\1\53\3\uffff\1\34\1\52\1\22\1\23\1\6\1\42\1\21\1\43\1\5\1\44\1\47\11\50\1\4\1\7\1\40\1\25\1\41\1\32\1\45\32\51\1\27\1\uffff\1\30\1\35\1\51\1\uffff\1\10\1\15\1\1\1\14\1\20\1\16\1\51\1\37\1\3\4\51\1\26\1\2\1\11\1\51\1\24\1\17\1\31\6\51\1\12\1\33\1\13\1\46",
            "\1\56\2\uffff\1\55",
            "\1\61\7\uffff\1\57\3\uffff\1\60\2\uffff\1\62",
            "\1\63\1\65\4\uffff\1\64",
            "\1\66\3\uffff\1\67",
            "\1\71\1\72",
            "\1\74",
            "",
            "\1\77\11\uffff\1\100\1\uffff\1\101\4\uffff\1\76",
            "\1\102\15\uffff\1\103\2\uffff\1\105\2\uffff\1\104",
            "",
            "",
            "\1\106",
            "\1\107\3\uffff\1\110",
            "\1\116\3\uffff\1\112\3\uffff\1\115\2\uffff\1\113\5\uffff\1\114\2\uffff\1\111",
            "\1\121\3\uffff\1\117\1\120",
            "\1\123\11\uffff\1\122",
            "",
            "",
            "",
            "\1\124",
            "\1\126\1\125",
            "\1\130\5\uffff\1\131",
            "",
            "",
            "\1\133\6\uffff\1\132\2\uffff\1\134",
            "\1\135",
            "\1\137",
            "\1\141",
            "",
            "\1\143",
            "\1\145",
            "\1\146",
            "\1\150",
            "",
            "\1\152",
            "\1\154\4\uffff\1\155",
            "",
            "",
            "\10\165\12\uffff\1\160\2\uffff\1\166\22\uffff\1\162\6\uffff\1\164\2\uffff\1\157\2\uffff\1\166\22\uffff\1\161",
            "\12\170\13\uffff\1\166\31\uffff\1\167\5\uffff\1\166",
            "",
            "\10\164\12\uffff\1\160\2\uffff\1\166\22\uffff\1\162\6\uffff\1\163\2\uffff\1\157\2\uffff\1\166\22\uffff\1\161",
            "\12\170\13\uffff\1\166\31\uffff\1\167\5\uffff\1\166",
            "",
            "",
            "",
            "\1\171\1\172",
            "\1\173",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\175",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\177",
            "\1\u0080",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\16\51\1\u0084\3\51\1\u0083\1\u0082\6\51",
            "",
            "\1\u0086",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\22\51\1\u0088\7\51",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090\5\uffff\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b\14\uffff\1\u009c",
            "\1\u009e\1\u009d",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a8",
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\u00a9\1\u00aa\uffd5\u00a9",
            "\1\u00ab",
            "",
            "\2\u00ad",
            "\2\u00ad",
            "\12\u00ae\7\uffff\6\u00ae\32\uffff\6\u00ae",
            "\12\u00ae\7\uffff\6\u00ae\32\uffff\6\u00ae",
            "",
            "\10\165",
            "\10\u00b0\15\uffff\1\166\31\uffff\1\u00af\5\uffff\1\166",
            "",
            "\12\170",
            "\12\170\13\uffff\1\166\31\uffff\1\167\5\uffff\1\166",
            "\1\u00b1\2\uffff\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "",
            "\1\u00b5",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "",
            "",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\12\51\7\uffff\10\51\1\u00bd\21\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "",
            "",
            "\12\u00de\1\u00dd\2\u00de\1\u00dc\34\u00de\1\u00db\uffd5\u00de",
            "",
            "\2\u00e0\23\uffff\1\166\31\uffff\1\u00df\5\uffff\1\166",
            "\12\u00e3\7\uffff\4\u00e3\1\u00e2\1\u00e3\30\uffff\1\u00e1\1\uffff\4\u00e3\1\u00e2\1\u00e3",
            "\10\u00b0",
            "\10\u00b0\15\uffff\1\166\31\uffff\1\u00af\5\uffff\1\166",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "",
            "\1\u00f0",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\10\51\1\u00f1\21\51",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00fd",
            "\1\u00fe",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0105",
            "\1\u0106",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u010a",
            "\12\u00de\1\u00dd\2\u00de\1\u00dc\34\u00de\1\u00db\4\u00de\1\u010b\uffd0\u00de",
            "\12\u010c\1\u00dd\ufff5\u010c",
            "\0\u010c",
            "\12\u00de\1\u00dd\2\u00de\1\u00dc\34\u00de\1\u00db\uffd5\u00de",
            "\2\u00e0",
            "\2\u00e0\23\uffff\1\166\31\uffff\1\u00df\5\uffff\1\166",
            "\12\u00e3\7\uffff\6\u00e3\32\uffff\6\u00e3",
            "\1\166\1\uffff\1\166\2\uffff\1\u010d\11\u010e\7\uffff\4\u00e3\1\u00e2\1\u00e3\30\uffff\1\u00e1\1\uffff\4\u00e3\1\u00e2\1\u00e3",
            "\12\u00e3\7\uffff\4\u00e3\1\u00e2\1\u00e3\30\uffff\1\u00e1\1\uffff\4\u00e3\1\u00e2\1\u00e3",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\10\51\1\u0112\21\51",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "",
            "\1\u012b",
            "\1\u012c",
            "",
            "",
            "",
            "\1\u012d",
            "\12\u00de\1\u00dd\2\u00de\1\u00dc\34\u00de\1\u00db\uffd5\u00de",
            "",
            "\10\u0131\2\u00e3\7\uffff\1\u00e3\1\u012f\2\u00e3\1\u00e2\1\u00e3\21\uffff\1\166\6\uffff\1\u0130\1\uffff\1\u00e3\1\u012e\2\u00e3\1\u00e2\1\u00e3\21\uffff\1\166",
            "\12\u0133\7\uffff\4\u00e3\1\u00e2\1\u00e3\30\uffff\1\u0132\1\uffff\4\u00e3\1\u00e2\1\u00e3",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "",
            "\1\u0138",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u013a",
            "\1\u013b",
            "",
            "",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\2\u014f\10\u00e3\7\uffff\4\u00e3\1\u00e2\1\u00e3\30\uffff\1\u00e1\1\uffff\4\u00e3\1\u00e2\1\u00e3",
            "\2\u014f\10\u00e3\7\uffff\4\u00e3\1\u00e2\1\u00e3\30\uffff\1\u00e1\1\uffff\4\u00e3\1\u00e2\1\u00e3",
            "\10\u0131\2\u00e3\7\uffff\6\u00e3\32\uffff\6\u00e3",
            "\10\u0151\2\u00e3\7\uffff\4\u00e3\1\u00e2\1\u00e3\30\uffff\1\u0150\1\uffff\4\u00e3\1\u00e2\1\u00e3",
            "\12\u0133\7\uffff\6\u00e3\32\uffff\6\u00e3",
            "\12\u0133\7\uffff\4\u00e3\1\u00e2\1\u00e3\30\uffff\1\u0132\1\uffff\4\u00e3\1\u00e2\1\u00e3",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\3\51\1\u015b\26\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0163",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0165",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\2\u016c\10\u00e3\7\uffff\4\u00e3\1\u00e2\1\u00e3\30\uffff\1\u016b\1\uffff\4\u00e3\1\u00e2\1\u00e3",
            "\10\u0151\2\u00e3\7\uffff\6\u00e3\32\uffff\6\u00e3",
            "\10\u0151\2\u00e3\7\uffff\4\u00e3\1\u00e2\1\u00e3\30\uffff\1\u0150\1\uffff\4\u00e3\1\u00e2\1\u00e3",
            "",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "",
            "\1\u0170",
            "\1\u0171",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0173",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\1\u0175",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\2\u0168\10\u00df\7\uffff\6\u00df\32\uffff\6\u00df",
            "\2\u0168\10\u00df\7\uffff\4\u00df\1\u00de\1\u00df\30\uffff\1\u0167\1\uffff\4\u00df\1\u00de\1\u00df",
            "\1\u0178",
            "\1\u0179",
            "",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "",
            "\2\u016c\10\u00e3\7\uffff\6\u00e3\32\uffff\6\u00e3",
            "\2\u016c\10\u00e3\7\uffff\4\u00e3\1\u00e2\1\u00e3\30\uffff\1\u016b\1\uffff\4\u00e3\1\u00e2\1\u00e3",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "",
            "\1\u0182",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\1\u0184",
            "\1\u0185",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0189",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u018b",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u018d",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u018f",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | RULE_BOOLEAN_VALUE | RULE_NATURAL_VALUE | RULE_EXP_VALUE | RULE_ID | RULE_UNRESTRICTED_NAME | RULE_STRING_VALUE | RULE_ML_COMMENT | RULE_DOCUMENTATION_COMMENT | RULE_ML_NOTE | RULE_SL_NOTE | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_220 = input.LA(1);

                        s = -1;
                        if ( (LA27_220=='\n') ) {s = 221;}

                        else if ( ((LA27_220>='\u0000' && LA27_220<='\t')||(LA27_220>='\u000B' && LA27_220<='\uFFFF')) ) {s = 268;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_221 = input.LA(1);

                        s = -1;
                        if ( ((LA27_221>='\u0000' && LA27_221<='\uFFFF')) ) {s = 268;}

                        else s = 172;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_222 = input.LA(1);

                        s = -1;
                        if ( (LA27_222=='\r') ) {s = 220;}

                        else if ( (LA27_222=='\n') ) {s = 221;}

                        else if ( (LA27_222=='*') ) {s = 219;}

                        else if ( ((LA27_222>='\u0000' && LA27_222<='\t')||(LA27_222>='\u000B' && LA27_222<='\f')||(LA27_222>='\u000E' && LA27_222<=')')||(LA27_222>='+' && LA27_222<='\uFFFF')) ) {s = 222;}

                        else s = 172;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_219 = input.LA(1);

                        s = -1;
                        if ( (LA27_219=='/') ) {s = 267;}

                        else if ( (LA27_219=='\r') ) {s = 220;}

                        else if ( (LA27_219=='\n') ) {s = 221;}

                        else if ( (LA27_219=='*') ) {s = 219;}

                        else if ( ((LA27_219>='\u0000' && LA27_219<='\t')||(LA27_219>='\u000B' && LA27_219<='\f')||(LA27_219>='\u000E' && LA27_219<=')')||(LA27_219>='+' && LA27_219<='.')||(LA27_219>='0' && LA27_219<='\uFFFF')) ) {s = 222;}

                        else s = 172;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA27_267 = input.LA(1);

                        s = -1;
                        if ( (LA27_267=='\r') ) {s = 220;}

                        else if ( (LA27_267=='\n') ) {s = 221;}

                        else if ( (LA27_267=='*') ) {s = 219;}

                        else if ( ((LA27_267>='\u0000' && LA27_267<='\t')||(LA27_267>='\u000B' && LA27_267<='\f')||(LA27_267>='\u000E' && LA27_267<=')')||(LA27_267>='+' && LA27_267<='\uFFFF')) ) {s = 222;}

                        else s = 268;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA27_171 = input.LA(1);

                        s = -1;
                        if ( (LA27_171=='*') ) {s = 219;}

                        else if ( (LA27_171=='\r') ) {s = 220;}

                        else if ( (LA27_171=='\n') ) {s = 221;}

                        else if ( ((LA27_171>='\u0000' && LA27_171<='\t')||(LA27_171>='\u000B' && LA27_171<='\f')||(LA27_171>='\u000E' && LA27_171<=')')||(LA27_171>='+' && LA27_171<='\uFFFF')) ) {s = 222;}

                        else s = 172;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA27_108 = input.LA(1);

                        s = -1;
                        if ( ((LA27_108>='\u0000' && LA27_108<=')')||(LA27_108>='+' && LA27_108<='\uFFFF')) ) {s = 169;}

                        else if ( (LA27_108=='*') ) {s = 170;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}