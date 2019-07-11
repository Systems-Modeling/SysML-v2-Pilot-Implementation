package org.omg.sysml.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


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
    public static final int RULE_ID=6;
    public static final int RULE_NATURAL_VALUE=5;
    public static final int RULE_INLINE_STATEMENT=12;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=13;
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
    public static final int RULE_UNRESTRICTED_NAME=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_STRING_VALUE=10;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int RULE_STATEMENT_ANNOTATION=11;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int RULE_DOCUMENTATION_COMMENT=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int RULE_BOOLEAN_VALUE=9;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_SL_COMMENT=14;
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
    public static final int RULE_WS=15;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int RULE_EXP_VALUE=4;
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

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:11:7: ( '?' )
            // InternalAlf.g:11:9: '?'
            {
            match('?'); 

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
            // InternalAlf.g:12:7: ( '??' )
            // InternalAlf.g:12:9: '??'
            {
            match("??"); 


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
            // InternalAlf.g:13:7: ( '||' )
            // InternalAlf.g:13:9: '||'
            {
            match("||"); 


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
            // InternalAlf.g:14:7: ( '&&' )
            // InternalAlf.g:14:9: '&&'
            {
            match("&&"); 


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
            // InternalAlf.g:15:7: ( '|' )
            // InternalAlf.g:15:9: '|'
            {
            match('|'); 

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
            // InternalAlf.g:16:7: ( '^' )
            // InternalAlf.g:16:9: '^'
            {
            match('^'); 

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
            // InternalAlf.g:17:7: ( '&' )
            // InternalAlf.g:17:9: '&'
            {
            match('&'); 

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
            // InternalAlf.g:18:7: ( '::' )
            // InternalAlf.g:18:9: '::'
            {
            match("::"); 


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
            // InternalAlf.g:19:7: ( '.' )
            // InternalAlf.g:19:9: '.'
            {
            match('.'); 

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
            // InternalAlf.g:20:7: ( ';' )
            // InternalAlf.g:20:9: ';'
            {
            match(';'); 

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
            // InternalAlf.g:21:7: ( 'feature' )
            // InternalAlf.g:21:9: 'feature'
            {
            match("feature"); 


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
            // InternalAlf.g:22:7: ( 'any' )
            // InternalAlf.g:22:9: 'any'
            {
            match("any"); 


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
            // InternalAlf.g:23:7: ( 'stream' )
            // InternalAlf.g:23:9: 'stream'
            {
            match("stream"); 


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
            // InternalAlf.g:24:7: ( '==' )
            // InternalAlf.g:24:9: '=='
            {
            match("=="); 


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
            // InternalAlf.g:25:7: ( '!=' )
            // InternalAlf.g:25:9: '!='
            {
            match("!="); 


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
            // InternalAlf.g:26:7: ( 'instanceof' )
            // InternalAlf.g:26:9: 'instanceof'
            {
            match("instanceof"); 


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
            // InternalAlf.g:27:7: ( 'hastype' )
            // InternalAlf.g:27:9: 'hastype'
            {
            match("hastype"); 


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
            // InternalAlf.g:28:7: ( '<' )
            // InternalAlf.g:28:9: '<'
            {
            match('<'); 

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
            // InternalAlf.g:29:7: ( '>' )
            // InternalAlf.g:29:9: '>'
            {
            match('>'); 

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
            // InternalAlf.g:30:7: ( '<=' )
            // InternalAlf.g:30:9: '<='
            {
            match("<="); 


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
            // InternalAlf.g:31:7: ( '>=' )
            // InternalAlf.g:31:9: '>='
            {
            match(">="); 


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
            // InternalAlf.g:32:7: ( '+' )
            // InternalAlf.g:32:9: '+'
            {
            match('+'); 

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
            // InternalAlf.g:33:7: ( '-' )
            // InternalAlf.g:33:9: '-'
            {
            match('-'); 

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
            // InternalAlf.g:34:7: ( '*' )
            // InternalAlf.g:34:9: '*'
            {
            match('*'); 

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
            // InternalAlf.g:35:7: ( '/' )
            // InternalAlf.g:35:9: '/'
            {
            match('/'); 

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
            // InternalAlf.g:36:7: ( '**' )
            // InternalAlf.g:36:9: '**'
            {
            match("**"); 


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
            // InternalAlf.g:37:7: ( '!' )
            // InternalAlf.g:37:9: '!'
            {
            match('!'); 

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
            // InternalAlf.g:38:7: ( '~' )
            // InternalAlf.g:38:9: '~'
            {
            match('~'); 

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
            // InternalAlf.g:39:7: ( 'public' )
            // InternalAlf.g:39:9: 'public'
            {
            match("public"); 


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
            // InternalAlf.g:40:7: ( 'private' )
            // InternalAlf.g:40:9: 'private'
            {
            match("private"); 


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
            // InternalAlf.g:41:7: ( 'protected' )
            // InternalAlf.g:41:9: 'protected'
            {
            match("protected"); 


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
            // InternalAlf.g:42:7: ( 'packaged' )
            // InternalAlf.g:42:9: 'packaged'
            {
            match("packaged"); 


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
            // InternalAlf.g:43:7: ( 'in' )
            // InternalAlf.g:43:9: 'in'
            {
            match("in"); 


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
            // InternalAlf.g:44:7: ( 'out' )
            // InternalAlf.g:44:9: 'out'
            {
            match("out"); 


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
            // InternalAlf.g:45:7: ( 'inout' )
            // InternalAlf.g:45:9: 'inout'
            {
            match("inout"); 


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
            // InternalAlf.g:46:7: ( 'import' )
            // InternalAlf.g:46:9: 'import'
            {
            match("import"); 


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
            // InternalAlf.g:47:7: ( 'as' )
            // InternalAlf.g:47:9: 'as'
            {
            match("as"); 


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
            // InternalAlf.g:48:7: ( 'package' )
            // InternalAlf.g:48:9: 'package'
            {
            match("package"); 


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
            // InternalAlf.g:49:7: ( '{' )
            // InternalAlf.g:49:9: '{'
            {
            match('{'); 

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
            // InternalAlf.g:50:7: ( '}' )
            // InternalAlf.g:50:9: '}'
            {
            match('}'); 

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
            // InternalAlf.g:51:7: ( 'is' )
            // InternalAlf.g:51:9: 'is'
            {
            match("is"); 


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
            // InternalAlf.g:52:7: ( 'Class' )
            // InternalAlf.g:52:9: 'Class'
            {
            match("Class"); 


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
            // InternalAlf.g:53:7: ( 'class' )
            // InternalAlf.g:53:9: 'class'
            {
            match("class"); 


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
            // InternalAlf.g:54:7: ( 'datatype' )
            // InternalAlf.g:54:9: 'datatype'
            {
            match("datatype"); 


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
            // InternalAlf.g:55:7: ( 'assoc' )
            // InternalAlf.g:55:9: 'assoc'
            {
            match("assoc"); 


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
            // InternalAlf.g:56:7: ( 'behavior' )
            // InternalAlf.g:56:9: 'behavior'
            {
            match("behavior"); 


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
            // InternalAlf.g:57:7: ( 'function' )
            // InternalAlf.g:57:9: 'function'
            {
            match("function"); 


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
            // InternalAlf.g:58:7: ( 'abstract' )
            // InternalAlf.g:58:9: 'abstract'
            {
            match("abstract"); 


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
            // InternalAlf.g:59:7: ( 'step' )
            // InternalAlf.g:59:9: 'step'
            {
            match("step"); 


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
            // InternalAlf.g:60:7: ( 'expr' )
            // InternalAlf.g:60:9: 'expr'
            {
            match("expr"); 


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
            // InternalAlf.g:61:7: ( 'connector' )
            // InternalAlf.g:61:9: 'connector'
            {
            match("connector"); 


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
            // InternalAlf.g:62:7: ( 'binding' )
            // InternalAlf.g:62:9: 'binding'
            {
            match("binding"); 


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
            // InternalAlf.g:63:7: ( 'succession' )
            // InternalAlf.g:63:9: 'succession'
            {
            match("succession"); 


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
            // InternalAlf.g:64:7: ( 'then' )
            // InternalAlf.g:64:9: 'then'
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
            // InternalAlf.g:65:7: ( 'flow' )
            // InternalAlf.g:65:9: 'flow'
            {
            match("flow"); 


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
            // InternalAlf.g:66:7: ( 'end' )
            // InternalAlf.g:66:9: 'end'
            {
            match("end"); 


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
            // InternalAlf.g:67:7: ( 'specializes' )
            // InternalAlf.g:67:9: 'specializes'
            {
            match("specializes"); 


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
            // InternalAlf.g:68:7: ( ',' )
            // InternalAlf.g:68:9: ','
            {
            match(','); 

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
            // InternalAlf.g:69:7: ( 'interaction' )
            // InternalAlf.g:69:9: 'interaction'
            {
            match("interaction"); 


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
            // InternalAlf.g:70:7: ( '(' )
            // InternalAlf.g:70:9: '('
            {
            match('('); 

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
            // InternalAlf.g:71:7: ( ')' )
            // InternalAlf.g:71:9: ')'
            {
            match(')'); 

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
            // InternalAlf.g:72:7: ( 'redefines' )
            // InternalAlf.g:72:9: 'redefines'
            {
            match("redefines"); 


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
            // InternalAlf.g:73:7: ( '=' )
            // InternalAlf.g:73:9: '='
            {
            match('='); 

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
            // InternalAlf.g:74:7: ( ':' )
            // InternalAlf.g:74:9: ':'
            {
            match(':'); 

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
            // InternalAlf.g:75:7: ( '[' )
            // InternalAlf.g:75:9: '['
            {
            match('['); 

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
            // InternalAlf.g:76:7: ( ']' )
            // InternalAlf.g:76:9: ']'
            {
            match(']'); 

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
            // InternalAlf.g:77:7: ( '..' )
            // InternalAlf.g:77:9: '..'
            {
            match(".."); 


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
            // InternalAlf.g:78:7: ( 'subsets' )
            // InternalAlf.g:78:9: 'subsets'
            {
            match("subsets"); 


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
            // InternalAlf.g:79:7: ( 'to' )
            // InternalAlf.g:79:9: 'to'
            {
            match("to"); 


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
            // InternalAlf.g:80:7: ( '=>' )
            // InternalAlf.g:80:9: '=>'
            {
            match("=>"); 


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
            // InternalAlf.g:81:7: ( 'from' )
            // InternalAlf.g:81:9: 'from'
            {
            match("from"); 


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
            // InternalAlf.g:82:7: ( '->' )
            // InternalAlf.g:82:9: '->'
            {
            match("->"); 


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
            // InternalAlf.g:83:7: ( 'null' )
            // InternalAlf.g:83:9: 'null'
            {
            match("null"); 


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
            // InternalAlf.g:84:7: ( './' )
            // InternalAlf.g:84:9: './'
            {
            match("./"); 


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
            // InternalAlf.g:85:7: ( 'part' )
            // InternalAlf.g:85:9: 'part'
            {
            match("part"); 


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
            // InternalAlf.g:86:7: ( 'portion' )
            // InternalAlf.g:86:9: 'portion'
            {
            match("portion"); 


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
            // InternalAlf.g:87:7: ( 'port' )
            // InternalAlf.g:87:9: 'port'
            {
            match("port"); 


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
            // InternalAlf.g:88:7: ( 'compose' )
            // InternalAlf.g:88:9: 'compose'
            {
            match("compose"); 


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
            // InternalAlf.g:89:7: ( 'ordered' )
            // InternalAlf.g:89:9: 'ordered'
            {
            match("ordered"); 


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
            // InternalAlf.g:90:7: ( 'nonunique' )
            // InternalAlf.g:90:9: 'nonunique'
            {
            match("nonunique"); 


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
            // InternalAlf.g:91:7: ( '@' )
            // InternalAlf.g:91:9: '@'
            {
            match('@'); 

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
            // InternalAlf.g:92:7: ( 'allInstances' )
            // InternalAlf.g:92:9: 'allInstances'
            {
            match("allInstances"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "RULE_BOOLEAN_VALUE"
    public final void mRULE_BOOLEAN_VALUE() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:28318:20: ( ( 'true' | 'false' ) )
            // InternalAlf.g:28318:22: ( 'true' | 'false' )
            {
            // InternalAlf.g:28318:22: ( 'true' | 'false' )
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
                    // InternalAlf.g:28318:23: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalAlf.g:28318:30: 'false'
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
            // InternalAlf.g:28320:20: ( ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* ) )
            // InternalAlf.g:28320:22: ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* )
            {
            // InternalAlf.g:28320:22: ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* )
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
                    // InternalAlf.g:28320:23: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )
                    {
                    // InternalAlf.g:28320:23: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )
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
                            // InternalAlf.g:28320:24: '0'
                            {
                            match('0'); 

                            }
                            break;
                        case 2 :
                            // InternalAlf.g:28320:28: '1' .. '9' ( ( '_' )? '0' .. '9' )*
                            {
                            matchRange('1','9'); 
                            // InternalAlf.g:28320:37: ( ( '_' )? '0' .. '9' )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>='0' && LA3_0<='9')||LA3_0=='_') ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalAlf.g:28320:38: ( '_' )? '0' .. '9'
                            	    {
                            	    // InternalAlf.g:28320:38: ( '_' )?
                            	    int alt2=2;
                            	    int LA2_0 = input.LA(1);

                            	    if ( (LA2_0=='_') ) {
                            	        alt2=1;
                            	    }
                            	    switch (alt2) {
                            	        case 1 :
                            	            // InternalAlf.g:28320:38: '_'
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
                    // InternalAlf.g:28320:55: ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )*
                    {
                    // InternalAlf.g:28320:55: ( '0b' | '0B' )
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
                            // InternalAlf.g:28320:56: '0b'
                            {
                            match("0b"); 


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:28320:61: '0B'
                            {
                            match("0B"); 


                            }
                            break;

                    }

                    matchRange('0','1'); 
                    // InternalAlf.g:28320:76: ( ( '_' )? '0' .. '1' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='1')||LA7_0=='_') ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalAlf.g:28320:77: ( '_' )? '0' .. '1'
                    	    {
                    	    // InternalAlf.g:28320:77: ( '_' )?
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0=='_') ) {
                    	        alt6=1;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // InternalAlf.g:28320:77: '_'
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
                    // InternalAlf.g:28320:93: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )*
                    {
                    // InternalAlf.g:28320:93: ( '0x' | '0X' )
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
                            // InternalAlf.g:28320:94: '0x'
                            {
                            match("0x"); 


                            }
                            break;
                        case 2 :
                            // InternalAlf.g:28320:99: '0X'
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

                    // InternalAlf.g:28320:134: ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='F')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='f')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalAlf.g:28320:135: ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
                    	    {
                    	    // InternalAlf.g:28320:135: ( '_' )?
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0=='_') ) {
                    	        alt9=1;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // InternalAlf.g:28320:135: '_'
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
                    // InternalAlf.g:28320:171: '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )*
                    {
                    match('0'); 
                    // InternalAlf.g:28320:175: ( '_' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='_') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalAlf.g:28320:175: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }

                    matchRange('0','7'); 
                    // InternalAlf.g:28320:189: ( ( '_' )? '0' .. '7' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='7')||LA13_0=='_') ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalAlf.g:28320:190: ( '_' )? '0' .. '7'
                    	    {
                    	    // InternalAlf.g:28320:190: ( '_' )?
                    	    int alt12=2;
                    	    int LA12_0 = input.LA(1);

                    	    if ( (LA12_0=='_') ) {
                    	        alt12=1;
                    	    }
                    	    switch (alt12) {
                    	        case 1 :
                    	            // InternalAlf.g:28320:190: '_'
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
            // InternalAlf.g:28322:16: ( RULE_NATURAL_VALUE ( 'e' | 'E' ) ( '+' | '-' )? RULE_NATURAL_VALUE )
            // InternalAlf.g:28322:18: RULE_NATURAL_VALUE ( 'e' | 'E' ) ( '+' | '-' )? RULE_NATURAL_VALUE
            {
            mRULE_NATURAL_VALUE(); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAlf.g:28322:47: ( '+' | '-' )?
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
            // InternalAlf.g:28324:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAlf.g:28324:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAlf.g:28324:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalAlf.g:28326:24: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalAlf.g:28326:26: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalAlf.g:28326:31: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
            	    // InternalAlf.g:28326:32: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalAlf.g:28326:73: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalAlf.g:28328:19: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalAlf.g:28328:21: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalAlf.g:28328:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalAlf.g:28328:26: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalAlf.g:28328:67: ~ ( ( '\\\\' | '\"' ) )
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

    // $ANTLR start "RULE_DOCUMENTATION_COMMENT"
    public final void mRULE_DOCUMENTATION_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_DOCUMENTATION_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:28330:28: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalAlf.g:28330:30: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalAlf.g:28330:36: ( options {greedy=false; } : . )*
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
            	    // InternalAlf.g:28330:64: .
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
    // $ANTLR end "RULE_DOCUMENTATION_COMMENT"

    // $ANTLR start "RULE_STATEMENT_ANNOTATION"
    public final void mRULE_STATEMENT_ANNOTATION() throws RecognitionException {
        try {
            int _type = RULE_STATEMENT_ANNOTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:28332:27: ( '//@' ( options {greedy=false; } : . )* '\\n' )
            // InternalAlf.g:28332:29: '//@' ( options {greedy=false; } : . )* '\\n'
            {
            match("//@"); 

            // InternalAlf.g:28332:35: ( options {greedy=false; } : . )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='\n') ) {
                    alt20=2;
                }
                else if ( ((LA20_0>='\u0000' && LA20_0<='\t')||(LA20_0>='\u000B' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAlf.g:28332:63: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STATEMENT_ANNOTATION"

    // $ANTLR start "RULE_INLINE_STATEMENT"
    public final void mRULE_INLINE_STATEMENT() throws RecognitionException {
        try {
            int _type = RULE_INLINE_STATEMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:28334:23: ( '/*@inline(' ( RULE_ID | RULE_UNRESTRICTED_NAME ) ')' ( options {greedy=false; } : . )* '*/' )
            // InternalAlf.g:28334:25: '/*@inline(' ( RULE_ID | RULE_UNRESTRICTED_NAME ) ')' ( options {greedy=false; } : . )* '*/'
            {
            match("/*@inline("); 

            // InternalAlf.g:28334:38: ( RULE_ID | RULE_UNRESTRICTED_NAME )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')) ) {
                alt21=1;
            }
            else if ( (LA21_0=='\'') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalAlf.g:28334:39: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalAlf.g:28334:47: RULE_UNRESTRICTED_NAME
                    {
                    mRULE_UNRESTRICTED_NAME(); 

                    }
                    break;

            }

            match(')'); 
            // InternalAlf.g:28334:75: ( options {greedy=false; } : . )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='*') ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1=='/') ) {
                        alt22=2;
                    }
                    else if ( ((LA22_1>='\u0000' && LA22_1<='.')||(LA22_1>='0' && LA22_1<='\uFFFF')) ) {
                        alt22=1;
                    }


                }
                else if ( ((LA22_0>='\u0000' && LA22_0<=')')||(LA22_0>='+' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAlf.g:28334:103: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "RULE_INLINE_STATEMENT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:28336:17: ( '/*' ~ ( ( '*' | '@' ) ) ( options {greedy=false; } : . )* '*/' )
            // InternalAlf.g:28336:19: '/*' ~ ( ( '*' | '@' ) ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAlf.g:28336:37: ( options {greedy=false; } : . )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='*') ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1=='/') ) {
                        alt23=2;
                    }
                    else if ( ((LA23_1>='\u0000' && LA23_1<='.')||(LA23_1>='0' && LA23_1<='\uFFFF')) ) {
                        alt23=1;
                    }


                }
                else if ( ((LA23_0>='\u0000' && LA23_0<=')')||(LA23_0>='+' && LA23_0<='\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAlf.g:28336:65: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop23;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:28338:17: ( '//' (~ ( ( '@' | '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )? ( ( '\\r' )? '\\n' )? )
            // InternalAlf.g:28338:19: '//' (~ ( ( '@' | '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )? ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAlf.g:28338:24: (~ ( ( '@' | '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>='\u0000' && LA25_0<='\t')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='?')||(LA25_0>='A' && LA25_0<='\uFFFF')) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAlf.g:28338:25: ~ ( ( '@' | '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )*
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalAlf.g:28338:44: (~ ( ( '\\n' | '\\r' ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>='\u0000' && LA24_0<='\t')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\uFFFF')) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalAlf.g:28338:44: ~ ( ( '\\n' | '\\r' ) )
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
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAlf.g:28338:62: ( ( '\\r' )? '\\n' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\n'||LA27_0=='\r') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAlf.g:28338:63: ( '\\r' )? '\\n'
                    {
                    // InternalAlf.g:28338:63: ( '\\r' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='\r') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalAlf.g:28338:63: '\\r'
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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAlf.g:28340:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAlf.g:28340:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAlf.g:28340:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {
                    alt28=1;
                }


                switch (alt28) {
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
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
        // InternalAlf.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | RULE_BOOLEAN_VALUE | RULE_NATURAL_VALUE | RULE_EXP_VALUE | RULE_ID | RULE_UNRESTRICTED_NAME | RULE_STRING_VALUE | RULE_DOCUMENTATION_COMMENT | RULE_STATEMENT_ANNOTATION | RULE_INLINE_STATEMENT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt29=94;
        alt29 = dfa29.predict(input);
        switch (alt29) {
            case 1 :
                // InternalAlf.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalAlf.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalAlf.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalAlf.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalAlf.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalAlf.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalAlf.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalAlf.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalAlf.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalAlf.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalAlf.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalAlf.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalAlf.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalAlf.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalAlf.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalAlf.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalAlf.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalAlf.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalAlf.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalAlf.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalAlf.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalAlf.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalAlf.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // InternalAlf.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // InternalAlf.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // InternalAlf.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // InternalAlf.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // InternalAlf.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // InternalAlf.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // InternalAlf.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // InternalAlf.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // InternalAlf.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // InternalAlf.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // InternalAlf.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // InternalAlf.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // InternalAlf.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // InternalAlf.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // InternalAlf.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // InternalAlf.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // InternalAlf.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // InternalAlf.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // InternalAlf.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // InternalAlf.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // InternalAlf.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // InternalAlf.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // InternalAlf.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // InternalAlf.g:1:286: T__62
                {
                mT__62(); 

                }
                break;
            case 48 :
                // InternalAlf.g:1:292: T__63
                {
                mT__63(); 

                }
                break;
            case 49 :
                // InternalAlf.g:1:298: T__64
                {
                mT__64(); 

                }
                break;
            case 50 :
                // InternalAlf.g:1:304: T__65
                {
                mT__65(); 

                }
                break;
            case 51 :
                // InternalAlf.g:1:310: T__66
                {
                mT__66(); 

                }
                break;
            case 52 :
                // InternalAlf.g:1:316: T__67
                {
                mT__67(); 

                }
                break;
            case 53 :
                // InternalAlf.g:1:322: T__68
                {
                mT__68(); 

                }
                break;
            case 54 :
                // InternalAlf.g:1:328: T__69
                {
                mT__69(); 

                }
                break;
            case 55 :
                // InternalAlf.g:1:334: T__70
                {
                mT__70(); 

                }
                break;
            case 56 :
                // InternalAlf.g:1:340: T__71
                {
                mT__71(); 

                }
                break;
            case 57 :
                // InternalAlf.g:1:346: T__72
                {
                mT__72(); 

                }
                break;
            case 58 :
                // InternalAlf.g:1:352: T__73
                {
                mT__73(); 

                }
                break;
            case 59 :
                // InternalAlf.g:1:358: T__74
                {
                mT__74(); 

                }
                break;
            case 60 :
                // InternalAlf.g:1:364: T__75
                {
                mT__75(); 

                }
                break;
            case 61 :
                // InternalAlf.g:1:370: T__76
                {
                mT__76(); 

                }
                break;
            case 62 :
                // InternalAlf.g:1:376: T__77
                {
                mT__77(); 

                }
                break;
            case 63 :
                // InternalAlf.g:1:382: T__78
                {
                mT__78(); 

                }
                break;
            case 64 :
                // InternalAlf.g:1:388: T__79
                {
                mT__79(); 

                }
                break;
            case 65 :
                // InternalAlf.g:1:394: T__80
                {
                mT__80(); 

                }
                break;
            case 66 :
                // InternalAlf.g:1:400: T__81
                {
                mT__81(); 

                }
                break;
            case 67 :
                // InternalAlf.g:1:406: T__82
                {
                mT__82(); 

                }
                break;
            case 68 :
                // InternalAlf.g:1:412: T__83
                {
                mT__83(); 

                }
                break;
            case 69 :
                // InternalAlf.g:1:418: T__84
                {
                mT__84(); 

                }
                break;
            case 70 :
                // InternalAlf.g:1:424: T__85
                {
                mT__85(); 

                }
                break;
            case 71 :
                // InternalAlf.g:1:430: T__86
                {
                mT__86(); 

                }
                break;
            case 72 :
                // InternalAlf.g:1:436: T__87
                {
                mT__87(); 

                }
                break;
            case 73 :
                // InternalAlf.g:1:442: T__88
                {
                mT__88(); 

                }
                break;
            case 74 :
                // InternalAlf.g:1:448: T__89
                {
                mT__89(); 

                }
                break;
            case 75 :
                // InternalAlf.g:1:454: T__90
                {
                mT__90(); 

                }
                break;
            case 76 :
                // InternalAlf.g:1:460: T__91
                {
                mT__91(); 

                }
                break;
            case 77 :
                // InternalAlf.g:1:466: T__92
                {
                mT__92(); 

                }
                break;
            case 78 :
                // InternalAlf.g:1:472: T__93
                {
                mT__93(); 

                }
                break;
            case 79 :
                // InternalAlf.g:1:478: T__94
                {
                mT__94(); 

                }
                break;
            case 80 :
                // InternalAlf.g:1:484: T__95
                {
                mT__95(); 

                }
                break;
            case 81 :
                // InternalAlf.g:1:490: T__96
                {
                mT__96(); 

                }
                break;
            case 82 :
                // InternalAlf.g:1:496: T__97
                {
                mT__97(); 

                }
                break;
            case 83 :
                // InternalAlf.g:1:502: RULE_BOOLEAN_VALUE
                {
                mRULE_BOOLEAN_VALUE(); 

                }
                break;
            case 84 :
                // InternalAlf.g:1:521: RULE_NATURAL_VALUE
                {
                mRULE_NATURAL_VALUE(); 

                }
                break;
            case 85 :
                // InternalAlf.g:1:540: RULE_EXP_VALUE
                {
                mRULE_EXP_VALUE(); 

                }
                break;
            case 86 :
                // InternalAlf.g:1:555: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 87 :
                // InternalAlf.g:1:563: RULE_UNRESTRICTED_NAME
                {
                mRULE_UNRESTRICTED_NAME(); 

                }
                break;
            case 88 :
                // InternalAlf.g:1:586: RULE_STRING_VALUE
                {
                mRULE_STRING_VALUE(); 

                }
                break;
            case 89 :
                // InternalAlf.g:1:604: RULE_DOCUMENTATION_COMMENT
                {
                mRULE_DOCUMENTATION_COMMENT(); 

                }
                break;
            case 90 :
                // InternalAlf.g:1:631: RULE_STATEMENT_ANNOTATION
                {
                mRULE_STATEMENT_ANNOTATION(); 

                }
                break;
            case 91 :
                // InternalAlf.g:1:657: RULE_INLINE_STATEMENT
                {
                mRULE_INLINE_STATEMENT(); 

                }
                break;
            case 92 :
                // InternalAlf.g:1:679: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 93 :
                // InternalAlf.g:1:695: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 94 :
                // InternalAlf.g:1:711: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA29_eotS =
        "\1\uffff\1\57\1\61\1\63\1\uffff\1\65\1\70\1\uffff\3\52\1\107\1\111\2\52\1\117\1\121\1\uffff\1\123\1\125\1\130\1\uffff\2\52\2\uffff\6\52\3\uffff\1\52\2\uffff\1\52\1\uffff\2\161\17\uffff\6\52\1\176\5\52\5\uffff\1\u0089\1\52\1\u008b\1\52\11\uffff\1\u0091\1\uffff\17\52\1\u00a4\4\52\7\uffff\1\161\1\uffff\1\161\5\52\1\u00b2\1\52\1\uffff\12\52\1\uffff\1\52\1\uffff\1\52\5\uffff\6\52\1\u00c6\11\52\1\u00d0\1\52\1\uffff\4\52\2\161\1\uffff\1\161\2\52\1\u00dd\1\u00de\1\52\1\uffff\4\52\1\u00e4\14\52\1\u00f1\1\u00f3\1\uffff\10\52\1\u00fc\1\uffff\1\u00fd\1\u00fe\1\52\1\u0100\1\52\1\uffff\1\161\1\uffff\2\161\2\52\2\uffff\1\u00fe\1\u0106\3\52\1\uffff\4\52\1\u010e\7\52\1\uffff\1\52\1\uffff\1\52\1\u0118\1\u0119\5\52\3\uffff\1\52\1\uffff\1\52\2\161\2\52\1\uffff\2\52\1\u012b\4\52\1\uffff\1\52\1\u0131\1\52\1\u0133\5\52\2\uffff\7\52\2\161\1\uffff\1\161\1\uffff\1\161\1\u0143\3\52\1\uffff\1\52\1\u0148\3\52\1\uffff\1\u014c\1\uffff\1\u014d\1\52\1\u0150\1\u0151\1\u0152\1\52\1\u0154\2\52\1\u0157\2\52\1\161\1\uffff\1\161\1\uffff\1\u015c\1\u015d\2\52\1\uffff\3\52\2\uffff\1\52\1\u0164\3\uffff\1\52\1\uffff\1\u0166\1\u0167\1\uffff\2\52\1\uffff\1\161\2\uffff\5\52\1\u016f\1\uffff\1\u0170\2\uffff\1\u0171\1\u0172\1\52\1\u0174\1\52\1\u0176\1\52\4\uffff\1\52\1\uffff\1\u0179\1\uffff\1\u017a\1\u017b\3\uffff";
    static final String DFA29_eofS =
        "\u017c\uffff";
    static final String DFA29_minS =
        "\1\11\1\77\1\174\1\46\1\uffff\1\72\1\56\1\uffff\1\141\1\142\1\160\2\75\1\155\1\141\2\75\1\uffff\1\76\2\52\1\uffff\1\141\1\162\2\uffff\2\154\1\141\1\145\1\156\1\150\3\uffff\1\145\2\uffff\1\157\1\uffff\2\60\17\uffff\1\141\1\156\2\157\1\154\1\171\1\60\1\163\1\154\1\145\1\142\1\145\5\uffff\1\60\1\160\1\60\1\163\10\uffff\1\0\1\100\1\uffff\1\142\1\151\1\143\1\162\1\164\1\144\2\141\1\155\1\164\1\150\1\156\1\160\1\144\1\145\1\60\1\165\1\144\1\154\1\156\4\60\2\uffff\4\60\1\164\1\143\1\167\1\155\1\163\1\60\1\157\1\uffff\1\164\1\111\1\145\1\160\1\143\1\163\1\143\1\164\1\165\1\145\1\uffff\1\157\1\uffff\1\164\5\uffff\1\154\1\166\1\164\1\153\2\164\1\60\1\145\2\163\1\156\1\160\2\141\1\144\1\162\1\60\1\156\1\uffff\2\145\1\154\1\165\4\60\1\165\1\164\2\60\1\145\1\uffff\1\143\1\162\1\156\1\141\1\60\2\145\1\151\1\141\1\164\2\162\1\171\1\151\1\141\1\145\1\141\2\60\1\uffff\1\162\2\163\1\145\1\157\1\164\1\166\1\151\1\60\1\uffff\2\60\1\146\1\60\1\156\3\60\1\53\1\60\1\162\1\151\2\uffff\2\60\1\141\1\163\1\155\1\uffff\1\163\1\164\1\141\1\156\1\60\1\141\1\164\1\160\1\143\1\164\1\143\1\147\1\uffff\1\157\1\uffff\1\145\2\60\1\143\1\163\1\171\1\151\1\156\3\uffff\1\151\1\uffff\1\151\2\60\1\145\1\157\1\uffff\1\143\1\164\1\60\2\163\1\154\1\143\1\uffff\1\143\1\60\1\145\1\60\1\145\1\164\1\145\1\156\1\144\2\uffff\1\164\1\145\1\160\1\157\1\147\1\156\1\161\7\60\1\156\1\164\1\141\1\uffff\1\151\1\60\1\151\1\145\1\164\1\uffff\1\60\1\uffff\1\60\1\145\3\60\1\157\1\60\1\145\1\162\1\60\1\145\1\165\3\60\1\uffff\2\60\1\156\1\157\1\uffff\1\172\1\157\1\151\2\uffff\1\144\1\60\3\uffff\1\162\1\uffff\2\60\1\uffff\1\163\1\145\2\60\2\uffff\1\143\1\156\1\145\1\146\1\157\1\60\1\uffff\1\60\2\uffff\2\60\1\145\1\60\1\163\1\60\1\156\4\uffff\1\163\1\uffff\1\60\1\uffff\2\60\3\uffff";
    static final String DFA29_maxS =
        "\1\176\1\77\1\174\1\46\1\uffff\1\72\1\57\1\uffff\1\165\1\163\1\165\1\76\1\75\1\163\1\141\2\75\1\uffff\1\76\1\52\1\57\1\uffff\2\165\2\uffff\1\154\1\157\1\141\1\151\1\170\1\162\3\uffff\1\145\2\uffff\1\165\1\uffff\1\170\1\145\17\uffff\1\141\1\156\2\157\1\154\1\171\1\172\1\163\1\154\1\162\1\143\1\145\5\uffff\1\172\1\160\1\172\1\163\10\uffff\1\uffff\1\100\1\uffff\1\142\1\157\2\162\1\164\1\144\2\141\1\156\1\164\1\150\1\156\1\160\1\144\1\145\1\172\1\165\1\144\1\154\1\156\2\61\2\146\2\uffff\1\67\1\145\1\71\1\145\1\164\1\143\1\167\1\155\1\163\1\172\1\157\1\uffff\1\164\1\111\1\145\1\160\1\143\1\163\1\143\1\164\1\165\1\145\1\uffff\1\157\1\uffff\1\164\5\uffff\1\154\1\166\1\164\1\153\2\164\1\172\1\145\2\163\1\156\1\160\2\141\1\144\1\162\1\172\1\156\1\uffff\2\145\1\154\1\165\1\145\1\146\1\67\1\145\1\165\1\164\2\172\1\145\1\uffff\1\143\1\162\1\156\1\141\1\172\2\145\1\151\1\141\1\164\2\162\1\171\1\151\1\141\1\145\1\141\2\172\1\uffff\1\162\2\163\1\145\1\157\1\164\1\166\1\151\1\172\1\uffff\2\172\1\146\1\172\1\156\1\61\1\145\3\146\1\162\1\151\2\uffff\2\172\1\141\1\163\1\155\1\uffff\1\163\1\164\1\141\1\156\1\172\1\141\1\164\1\160\1\143\1\164\1\143\1\147\1\uffff\1\157\1\uffff\1\145\2\172\1\143\1\163\1\171\1\151\1\156\3\uffff\1\151\1\uffff\1\151\1\170\1\146\1\145\1\157\1\uffff\1\143\1\164\1\172\2\163\1\154\1\143\1\uffff\1\143\1\172\1\145\1\172\1\145\1\164\1\145\1\156\1\144\2\uffff\1\164\1\145\1\160\1\157\1\147\1\156\1\161\6\146\1\172\1\156\1\164\1\141\1\uffff\1\151\1\172\1\151\1\145\1\164\1\uffff\1\172\1\uffff\1\172\1\145\3\172\1\157\1\172\1\145\1\162\1\172\1\145\1\165\3\146\1\uffff\2\172\1\156\1\157\1\uffff\1\172\1\157\1\151\2\uffff\1\144\1\172\3\uffff\1\162\1\uffff\2\172\1\uffff\1\163\1\145\2\146\2\uffff\1\143\1\156\1\145\1\146\1\157\1\172\1\uffff\1\172\2\uffff\2\172\1\145\1\172\1\163\1\172\1\156\4\uffff\1\163\1\uffff\1\172\1\uffff\2\172\3\uffff";
    static final String DFA29_acceptS =
        "\4\uffff\1\6\2\uffff\1\12\11\uffff\1\26\3\uffff\1\34\2\uffff\1\47\1\50\6\uffff\1\72\1\74\1\75\1\uffff\1\101\1\102\1\uffff\1\121\2\uffff\1\126\1\127\1\130\1\136\1\2\1\1\1\3\1\5\1\4\1\7\1\10\1\100\1\103\1\112\1\11\14\uffff\1\16\1\106\1\77\1\17\1\33\4\uffff\1\24\1\22\1\25\1\23\1\110\1\27\1\32\1\30\2\uffff\1\31\30\uffff\1\124\1\125\13\uffff\1\45\12\uffff\1\41\1\uffff\1\51\1\uffff\1\131\1\133\1\134\1\132\1\135\22\uffff\1\105\15\uffff\1\14\23\uffff\1\42\11\uffff\1\70\14\uffff\1\67\1\107\5\uffff\1\61\14\uffff\1\113\1\uffff\1\115\10\uffff\1\62\1\66\1\123\1\uffff\1\111\5\uffff\1\55\7\uffff\1\43\11\uffff\1\52\1\53\21\uffff\1\15\5\uffff\1\44\1\uffff\1\35\17\uffff\1\13\4\uffff\1\104\3\uffff\1\21\1\36\2\uffff\1\46\1\114\1\117\1\uffff\1\116\2\uffff\1\64\4\uffff\1\57\1\60\6\uffff\1\40\1\uffff\1\54\1\56\7\uffff\1\37\1\63\1\76\1\120\1\uffff\1\65\1\uffff\1\20\2\uffff\1\71\1\73\1\122";
    static final String DFA29_specialS =
        "\126\uffff\1\0\u0125\uffff}>";
    static final String[] DFA29_transitionS = {
            "\2\55\2\uffff\1\55\22\uffff\1\55\1\14\1\54\3\uffff\1\3\1\53\1\41\1\42\1\23\1\21\1\40\1\22\1\6\1\24\1\50\11\51\1\5\1\7\1\17\1\13\1\20\1\1\1\47\2\52\1\32\27\52\1\44\1\uffff\1\45\1\4\1\52\1\uffff\1\11\1\35\1\33\1\34\1\36\1\10\1\52\1\16\1\15\4\52\1\46\1\27\1\26\1\52\1\43\1\12\1\37\6\52\1\30\1\2\1\31\1\25",
            "\1\56",
            "\1\60",
            "\1\62",
            "",
            "\1\64",
            "\1\66\1\67",
            "",
            "\1\75\3\uffff\1\71\6\uffff\1\73\5\uffff\1\74\2\uffff\1\72",
            "\1\100\11\uffff\1\101\1\uffff\1\76\4\uffff\1\77",
            "\1\104\3\uffff\1\102\1\103",
            "\1\105\1\106",
            "\1\110",
            "\1\113\1\112\4\uffff\1\114",
            "\1\115",
            "\1\116",
            "\1\120",
            "",
            "\1\122",
            "\1\124",
            "\1\126\4\uffff\1\127",
            "",
            "\1\133\15\uffff\1\134\2\uffff\1\132\2\uffff\1\131",
            "\1\136\2\uffff\1\135",
            "",
            "",
            "\1\137",
            "\1\140\2\uffff\1\141",
            "\1\142",
            "\1\143\3\uffff\1\144",
            "\1\146\11\uffff\1\145",
            "\1\147\6\uffff\1\150\2\uffff\1\151",
            "",
            "",
            "",
            "\1\152",
            "",
            "",
            "\1\154\5\uffff\1\153",
            "",
            "\10\164\12\uffff\1\156\2\uffff\1\162\22\uffff\1\160\6\uffff\1\163\2\uffff\1\155\2\uffff\1\162\22\uffff\1\157",
            "\12\166\13\uffff\1\162\31\uffff\1\165\5\uffff\1\162",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\175\7\52",
            "\1\177",
            "\1\u0080",
            "\1\u0082\14\uffff\1\u0081",
            "\1\u0084\1\u0083",
            "\1\u0085",
            "",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\u0087\3\52\1\u0086\1\u0088\6\52",
            "\1\u008a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u008c",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\u008f\1\u008d\25\u008f\1\u008e\uffbf\u008f",
            "\1\u0090",
            "",
            "\1\u0092",
            "\1\u0093\5\uffff\1\u0094",
            "\1\u0095\16\uffff\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009d\1\u009c",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\2\u00a9",
            "\2\u00a9",
            "\12\u00aa\7\uffff\6\u00aa\32\uffff\6\u00aa",
            "\12\u00aa\7\uffff\6\u00aa\32\uffff\6\u00aa",
            "",
            "",
            "\10\164",
            "\10\u00ac\15\uffff\1\162\31\uffff\1\u00ab\5\uffff\1\162",
            "\12\166",
            "\12\166\13\uffff\1\162\31\uffff\1\165\5\uffff\1\162",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "\1\u00be",
            "",
            "\1\u00bf",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\2\u00d7\23\uffff\1\162\31\uffff\1\u00d6\5\uffff\1\162",
            "\12\u00da\7\uffff\4\u00da\1\u00d9\1\u00da\30\uffff\1\u00d8\1\uffff\4\u00da\1\u00d9\1\u00da",
            "\10\u00ac",
            "\10\u00ac\15\uffff\1\162\31\uffff\1\u00ab\5\uffff\1\162",
            "\1\u00db",
            "\1\u00dc",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00df",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u00f2\21\52",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ff",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0101",
            "\2\u00d7",
            "\2\u00d7\23\uffff\1\162\31\uffff\1\u00d6\5\uffff\1\162",
            "\12\u00da\7\uffff\6\u00da\32\uffff\6\u00da",
            "\1\162\1\uffff\1\162\2\uffff\1\u0102\11\u0103\7\uffff\4\u00da\1\u00d9\1\u00da\30\uffff\1\u00d8\1\uffff\4\u00da\1\u00d9\1\u00da",
            "\12\u00da\7\uffff\4\u00da\1\u00d9\1\u00da\30\uffff\1\u00d8\1\uffff\4\u00da\1\u00d9\1\u00da",
            "\1\u0104",
            "\1\u0105",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "",
            "\1\u0116",
            "",
            "\1\u0117",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "",
            "",
            "",
            "\1\u011f",
            "",
            "\1\u0120",
            "\10\u0124\2\u00da\7\uffff\1\u00da\1\u0122\2\u00da\1\u00d9\1\u00da\21\uffff\1\162\6\uffff\1\u0123\1\uffff\1\u00da\1\u0121\2\u00da\1\u00d9\1\u00da\21\uffff\1\162",
            "\12\u0126\7\uffff\4\u00da\1\u00d9\1\u00da\30\uffff\1\u0125\1\uffff\4\u00da\1\u00d9\1\u00da",
            "\1\u0127",
            "\1\u0128",
            "",
            "\1\u0129",
            "\1\u012a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "",
            "\1\u0130",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0132",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "",
            "",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\2\u0140\10\u00da\7\uffff\4\u00da\1\u00d9\1\u00da\30\uffff\1\u00d8\1\uffff\4\u00da\1\u00d9\1\u00da",
            "\2\u0140\10\u00da\7\uffff\4\u00da\1\u00d9\1\u00da\30\uffff\1\u00d8\1\uffff\4\u00da\1\u00d9\1\u00da",
            "\10\u0124\2\u00da\7\uffff\6\u00da\32\uffff\6\u00da",
            "\10\u0142\2\u00da\7\uffff\4\u00da\1\u00d9\1\u00da\30\uffff\1\u0141\1\uffff\4\u00da\1\u00d9\1\u00da",
            "\12\u0126\7\uffff\6\u00da\32\uffff\6\u00da",
            "\12\u0126\7\uffff\4\u00da\1\u00d9\1\u00da\30\uffff\1\u0125\1\uffff\4\u00da\1\u00d9\1\u00da",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "",
            "\1\u0147",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u014e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\u014f\26\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0153",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0155",
            "\1\u0156",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0158",
            "\1\u0159",
            "\2\u015b\10\u00da\7\uffff\4\u00da\1\u00d9\1\u00da\30\uffff\1\u015a\1\uffff\4\u00da\1\u00d9\1\u00da",
            "\10\u0142\2\u00da\7\uffff\6\u00da\32\uffff\6\u00da",
            "\10\u0142\2\u00da\7\uffff\4\u00da\1\u00d9\1\u00da\30\uffff\1\u0141\1\uffff\4\u00da\1\u00d9\1\u00da",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u015e",
            "\1\u015f",
            "",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "",
            "",
            "\1\u0163",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\1\u0165",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0168",
            "\1\u0169",
            "\2\u015b\10\u00da\7\uffff\6\u00da\32\uffff\6\u00da",
            "\2\u015b\10\u00da\7\uffff\4\u00da\1\u00d9\1\u00da\30\uffff\1\u015a\1\uffff\4\u00da\1\u00d9\1\u00da",
            "",
            "",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0173",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0175",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0177",
            "",
            "",
            "",
            "",
            "\1\u0178",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | RULE_BOOLEAN_VALUE | RULE_NATURAL_VALUE | RULE_EXP_VALUE | RULE_ID | RULE_UNRESTRICTED_NAME | RULE_STRING_VALUE | RULE_DOCUMENTATION_COMMENT | RULE_STATEMENT_ANNOTATION | RULE_INLINE_STATEMENT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_86 = input.LA(1);

                        s = -1;
                        if ( (LA29_86=='*') ) {s = 141;}

                        else if ( (LA29_86=='@') ) {s = 142;}

                        else if ( ((LA29_86>='\u0000' && LA29_86<=')')||(LA29_86>='+' && LA29_86<='?')||(LA29_86>='A' && LA29_86<='\uFFFF')) ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}