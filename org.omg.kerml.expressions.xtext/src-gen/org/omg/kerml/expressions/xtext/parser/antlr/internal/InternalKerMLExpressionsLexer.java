package org.omg.kerml.expressions.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKerMLExpressionsLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_SL_NOTE=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_DOCUMENTATION_COMMENT=10;
    public static final int T__54=54;
    public static final int RULE_ID=7;
    public static final int RULE_DECIMAL_VALUE=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_ML_NOTE=11;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_REGULAR_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=13;
    public static final int RULE_UNRESTRICTED_NAME=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_STRING_VALUE=4;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int RULE_EXP_VALUE=6;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalKerMLExpressionsLexer() {;} 
    public InternalKerMLExpressionsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalKerMLExpressionsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalKerMLExpressions.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerMLExpressions.g:11:7: ( '{' )
            // InternalKerMLExpressions.g:11:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerMLExpressions.g:12:7: ( ';' )
            // InternalKerMLExpressions.g:12:9: ';'
            {
            match(';'); 

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
            // InternalKerMLExpressions.g:13:7: ( '}' )
            // InternalKerMLExpressions.g:13:9: '}'
            {
            match('}'); 

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
            // InternalKerMLExpressions.g:14:7: ( 'in' )
            // InternalKerMLExpressions.g:14:9: 'in'
            {
            match("in"); 


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
            // InternalKerMLExpressions.g:15:7: ( ':' )
            // InternalKerMLExpressions.g:15:9: ':'
            {
            match(':'); 

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
            // InternalKerMLExpressions.g:16:7: ( '?' )
            // InternalKerMLExpressions.g:16:9: '?'
            {
            match('?'); 

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
            // InternalKerMLExpressions.g:17:7: ( '??' )
            // InternalKerMLExpressions.g:17:9: '??'
            {
            match("??"); 


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
            // InternalKerMLExpressions.g:18:7: ( '||' )
            // InternalKerMLExpressions.g:18:9: '||'
            {
            match("||"); 


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
            // InternalKerMLExpressions.g:19:7: ( '&&' )
            // InternalKerMLExpressions.g:19:9: '&&'
            {
            match("&&"); 


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
            // InternalKerMLExpressions.g:20:7: ( '|' )
            // InternalKerMLExpressions.g:20:9: '|'
            {
            match('|'); 

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
            // InternalKerMLExpressions.g:21:7: ( '^' )
            // InternalKerMLExpressions.g:21:9: '^'
            {
            match('^'); 

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
            // InternalKerMLExpressions.g:22:7: ( '&' )
            // InternalKerMLExpressions.g:22:9: '&'
            {
            match('&'); 

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
            // InternalKerMLExpressions.g:23:7: ( '==' )
            // InternalKerMLExpressions.g:23:9: '=='
            {
            match("=="); 


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
            // InternalKerMLExpressions.g:24:7: ( '!=' )
            // InternalKerMLExpressions.g:24:9: '!='
            {
            match("!="); 


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
            // InternalKerMLExpressions.g:25:7: ( 'instanceof' )
            // InternalKerMLExpressions.g:25:9: 'instanceof'
            {
            match("instanceof"); 


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
            // InternalKerMLExpressions.g:26:7: ( 'hastype' )
            // InternalKerMLExpressions.g:26:9: 'hastype'
            {
            match("hastype"); 


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
            // InternalKerMLExpressions.g:27:7: ( 'istype' )
            // InternalKerMLExpressions.g:27:9: 'istype'
            {
            match("istype"); 


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
            // InternalKerMLExpressions.g:28:7: ( '@' )
            // InternalKerMLExpressions.g:28:9: '@'
            {
            match('@'); 

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
            // InternalKerMLExpressions.g:29:7: ( 'as' )
            // InternalKerMLExpressions.g:29:9: 'as'
            {
            match("as"); 


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
            // InternalKerMLExpressions.g:30:7: ( '<' )
            // InternalKerMLExpressions.g:30:9: '<'
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
            // InternalKerMLExpressions.g:31:7: ( '>' )
            // InternalKerMLExpressions.g:31:9: '>'
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
            // InternalKerMLExpressions.g:32:7: ( '<=' )
            // InternalKerMLExpressions.g:32:9: '<='
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
            // InternalKerMLExpressions.g:33:7: ( '>=' )
            // InternalKerMLExpressions.g:33:9: '>='
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
            // InternalKerMLExpressions.g:34:7: ( '..' )
            // InternalKerMLExpressions.g:34:9: '..'
            {
            match(".."); 


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
            // InternalKerMLExpressions.g:35:7: ( '+' )
            // InternalKerMLExpressions.g:35:9: '+'
            {
            match('+'); 

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
            // InternalKerMLExpressions.g:36:7: ( '-' )
            // InternalKerMLExpressions.g:36:9: '-'
            {
            match('-'); 

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
            // InternalKerMLExpressions.g:37:7: ( '*' )
            // InternalKerMLExpressions.g:37:9: '*'
            {
            match('*'); 

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
            // InternalKerMLExpressions.g:38:7: ( '/' )
            // InternalKerMLExpressions.g:38:9: '/'
            {
            match('/'); 

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
            // InternalKerMLExpressions.g:39:7: ( '%' )
            // InternalKerMLExpressions.g:39:9: '%'
            {
            match('%'); 

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
            // InternalKerMLExpressions.g:40:7: ( '**' )
            // InternalKerMLExpressions.g:40:9: '**'
            {
            match("**"); 


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
            // InternalKerMLExpressions.g:41:7: ( '@[' )
            // InternalKerMLExpressions.g:41:9: '@['
            {
            match("@["); 


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
            // InternalKerMLExpressions.g:42:7: ( ']' )
            // InternalKerMLExpressions.g:42:9: ']'
            {
            match(']'); 

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
            // InternalKerMLExpressions.g:43:7: ( '!' )
            // InternalKerMLExpressions.g:43:9: '!'
            {
            match('!'); 

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
            // InternalKerMLExpressions.g:44:7: ( '~' )
            // InternalKerMLExpressions.g:44:9: '~'
            {
            match('~'); 

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
            // InternalKerMLExpressions.g:45:7: ( 'all' )
            // InternalKerMLExpressions.g:45:9: 'all'
            {
            match("all"); 


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
            // InternalKerMLExpressions.g:46:7: ( '[' )
            // InternalKerMLExpressions.g:46:9: '['
            {
            match('['); 

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
            // InternalKerMLExpressions.g:47:7: ( '->' )
            // InternalKerMLExpressions.g:47:9: '->'
            {
            match("->"); 


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
            // InternalKerMLExpressions.g:48:7: ( '.' )
            // InternalKerMLExpressions.g:48:9: '.'
            {
            match('.'); 

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
            // InternalKerMLExpressions.g:49:7: ( '(' )
            // InternalKerMLExpressions.g:49:9: '('
            {
            match('('); 

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
            // InternalKerMLExpressions.g:50:7: ( ')' )
            // InternalKerMLExpressions.g:50:9: ')'
            {
            match(')'); 

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
            // InternalKerMLExpressions.g:51:7: ( ',' )
            // InternalKerMLExpressions.g:51:9: ','
            {
            match(','); 

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
            // InternalKerMLExpressions.g:52:7: ( '=>' )
            // InternalKerMLExpressions.g:52:9: '=>'
            {
            match("=>"); 


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
            // InternalKerMLExpressions.g:53:7: ( 'null' )
            // InternalKerMLExpressions.g:53:9: 'null'
            {
            match("null"); 


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
            // InternalKerMLExpressions.g:54:7: ( 'true' )
            // InternalKerMLExpressions.g:54:9: 'true'
            {
            match("true"); 


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
            // InternalKerMLExpressions.g:55:7: ( 'false' )
            // InternalKerMLExpressions.g:55:9: 'false'
            {
            match("false"); 


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
            // InternalKerMLExpressions.g:56:7: ( '::' )
            // InternalKerMLExpressions.g:56:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "RULE_DECIMAL_VALUE"
    public final void mRULE_DECIMAL_VALUE() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerMLExpressions.g:3452:20: ( '0' .. '9' ( '0' .. '9' )* )
            // InternalKerMLExpressions.g:3452:22: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // InternalKerMLExpressions.g:3452:31: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3452:32: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_VALUE"

    // $ANTLR start "RULE_EXP_VALUE"
    public final void mRULE_EXP_VALUE() throws RecognitionException {
        try {
            int _type = RULE_EXP_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerMLExpressions.g:3454:16: ( RULE_DECIMAL_VALUE ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMAL_VALUE )
            // InternalKerMLExpressions.g:3454:18: RULE_DECIMAL_VALUE ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMAL_VALUE
            {
            mRULE_DECIMAL_VALUE(); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKerMLExpressions.g:3454:47: ( '+' | '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='+'||LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKerMLExpressions.g:
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

            mRULE_DECIMAL_VALUE(); 

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
            // InternalKerMLExpressions.g:3456:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKerMLExpressions.g:3456:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKerMLExpressions.g:3456:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKerMLExpressions.g:
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
            	    break loop3;
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
            // InternalKerMLExpressions.g:3458:24: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalKerMLExpressions.g:3458:26: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalKerMLExpressions.g:3458:31: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    alt4=1;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3458:32: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalKerMLExpressions.g:3458:73: ~ ( ( '\\\\' | '\\'' ) )
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
            	    break loop4;
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
            // InternalKerMLExpressions.g:3460:19: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalKerMLExpressions.g:3460:21: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalKerMLExpressions.g:3460:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\\') ) {
                    alt5=1;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3460:26: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalKerMLExpressions.g:3460:67: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop5;
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

    // $ANTLR start "RULE_REGULAR_COMMENT"
    public final void mRULE_REGULAR_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_REGULAR_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerMLExpressions.g:3462:22: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // InternalKerMLExpressions.g:3462:24: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKerMLExpressions.g:3462:36: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3462:64: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "RULE_REGULAR_COMMENT"

    // $ANTLR start "RULE_DOCUMENTATION_COMMENT"
    public final void mRULE_DOCUMENTATION_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_DOCUMENTATION_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerMLExpressions.g:3464:28: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalKerMLExpressions.g:3464:30: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalKerMLExpressions.g:3464:36: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3464:64: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalKerMLExpressions.g:3466:14: ( '//*' ( options {greedy=false; } : . )* '*/' )
            // InternalKerMLExpressions.g:3466:16: '//*' ( options {greedy=false; } : . )* '*/'
            {
            match("//*"); 

            // InternalKerMLExpressions.g:3466:22: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKerMLExpressions.g:3466:50: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalKerMLExpressions.g:3468:14: ( '//' (~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )? ( ( '\\r' )? '\\n' )? )
            // InternalKerMLExpressions.g:3468:16: '//' (~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )? ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalKerMLExpressions.g:3468:21: (~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKerMLExpressions.g:3468:22: ~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )*
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalKerMLExpressions.g:3468:37: (~ ( ( '\\n' | '\\r' ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalKerMLExpressions.g:3468:37: ~ ( ( '\\n' | '\\r' ) )
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
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalKerMLExpressions.g:3468:55: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKerMLExpressions.g:3468:56: ( '\\r' )? '\\n'
                    {
                    // InternalKerMLExpressions.g:3468:56: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalKerMLExpressions.g:3468:56: '\\r'
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
            // InternalKerMLExpressions.g:3470:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKerMLExpressions.g:3470:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKerMLExpressions.g:3470:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKerMLExpressions.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
        // InternalKerMLExpressions.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | RULE_DECIMAL_VALUE | RULE_EXP_VALUE | RULE_ID | RULE_UNRESTRICTED_NAME | RULE_STRING_VALUE | RULE_REGULAR_COMMENT | RULE_DOCUMENTATION_COMMENT | RULE_ML_NOTE | RULE_SL_NOTE | RULE_WS )
        int alt14=56;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalKerMLExpressions.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalKerMLExpressions.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalKerMLExpressions.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalKerMLExpressions.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalKerMLExpressions.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalKerMLExpressions.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalKerMLExpressions.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalKerMLExpressions.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalKerMLExpressions.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalKerMLExpressions.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalKerMLExpressions.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalKerMLExpressions.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalKerMLExpressions.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalKerMLExpressions.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalKerMLExpressions.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalKerMLExpressions.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalKerMLExpressions.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalKerMLExpressions.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalKerMLExpressions.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalKerMLExpressions.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalKerMLExpressions.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalKerMLExpressions.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalKerMLExpressions.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalKerMLExpressions.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalKerMLExpressions.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalKerMLExpressions.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalKerMLExpressions.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalKerMLExpressions.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalKerMLExpressions.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalKerMLExpressions.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalKerMLExpressions.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalKerMLExpressions.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalKerMLExpressions.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalKerMLExpressions.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalKerMLExpressions.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalKerMLExpressions.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalKerMLExpressions.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalKerMLExpressions.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalKerMLExpressions.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalKerMLExpressions.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalKerMLExpressions.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalKerMLExpressions.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // InternalKerMLExpressions.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // InternalKerMLExpressions.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // InternalKerMLExpressions.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // InternalKerMLExpressions.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // InternalKerMLExpressions.g:1:286: RULE_DECIMAL_VALUE
                {
                mRULE_DECIMAL_VALUE(); 

                }
                break;
            case 48 :
                // InternalKerMLExpressions.g:1:305: RULE_EXP_VALUE
                {
                mRULE_EXP_VALUE(); 

                }
                break;
            case 49 :
                // InternalKerMLExpressions.g:1:320: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 50 :
                // InternalKerMLExpressions.g:1:328: RULE_UNRESTRICTED_NAME
                {
                mRULE_UNRESTRICTED_NAME(); 

                }
                break;
            case 51 :
                // InternalKerMLExpressions.g:1:351: RULE_STRING_VALUE
                {
                mRULE_STRING_VALUE(); 

                }
                break;
            case 52 :
                // InternalKerMLExpressions.g:1:369: RULE_REGULAR_COMMENT
                {
                mRULE_REGULAR_COMMENT(); 

                }
                break;
            case 53 :
                // InternalKerMLExpressions.g:1:390: RULE_DOCUMENTATION_COMMENT
                {
                mRULE_DOCUMENTATION_COMMENT(); 

                }
                break;
            case 54 :
                // InternalKerMLExpressions.g:1:417: RULE_ML_NOTE
                {
                mRULE_ML_NOTE(); 

                }
                break;
            case 55 :
                // InternalKerMLExpressions.g:1:430: RULE_SL_NOTE
                {
                mRULE_SL_NOTE(); 

                }
                break;
            case 56 :
                // InternalKerMLExpressions.g:1:443: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\4\uffff\1\41\1\50\1\52\1\54\1\56\2\uffff\1\62\1\41\1\65\1\41\1\71\1\73\1\75\1\uffff\1\77\1\101\1\104\7\uffff\3\41\1\111\4\uffff\1\114\1\41\14\uffff\1\41\2\uffff\1\117\1\41\13\uffff\1\124\1\uffff\3\41\1\111\2\uffff\1\41\1\uffff\2\41\1\uffff\1\133\2\uffff\1\124\1\uffff\6\41\1\uffff\1\124\1\uffff\2\124\1\150\1\151\4\41\1\147\3\uffff\1\156\1\41\1\160\1\41\1\uffff\1\41\1\uffff\1\163\1\41\1\uffff\1\41\1\166\1\uffff";
    static final String DFA14_eofS =
        "\167\uffff";
    static final String DFA14_minS =
        "\1\11\3\uffff\1\156\1\72\1\77\1\174\1\46\1\uffff\2\75\1\141\1\133\1\154\2\75\1\56\1\uffff\1\76\2\52\7\uffff\1\165\1\162\1\141\1\60\4\uffff\1\60\1\164\14\uffff\1\163\2\uffff\1\60\1\154\12\uffff\1\0\1\52\1\uffff\1\154\1\165\1\154\1\60\2\uffff\1\164\1\uffff\1\171\1\164\1\uffff\1\60\2\uffff\1\0\1\uffff\1\154\1\145\1\163\1\141\1\160\1\171\1\uffff\4\0\2\60\1\145\1\156\1\145\1\160\1\0\3\uffff\1\60\1\143\1\60\1\145\1\uffff\1\145\1\uffff\1\60\1\157\1\uffff\1\146\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\176\3\uffff\1\163\1\72\1\77\1\174\1\46\1\uffff\1\76\1\75\1\141\1\133\1\163\2\75\1\56\1\uffff\1\76\1\52\1\57\7\uffff\1\165\1\162\1\141\1\145\4\uffff\1\172\1\164\14\uffff\1\163\2\uffff\1\172\1\154\12\uffff\1\uffff\1\52\1\uffff\1\154\1\165\1\154\1\145\2\uffff\1\164\1\uffff\1\171\1\164\1\uffff\1\172\2\uffff\1\uffff\1\uffff\1\154\1\145\1\163\1\141\1\160\1\171\1\uffff\4\uffff\2\172\1\145\1\156\1\145\1\160\1\uffff\3\uffff\1\172\1\143\1\172\1\145\1\uffff\1\145\1\uffff\1\172\1\157\1\uffff\1\146\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\5\uffff\1\13\10\uffff\1\31\3\uffff\1\35\1\40\1\42\1\44\1\47\1\50\1\51\4\uffff\1\61\1\62\1\63\1\70\2\uffff\1\56\1\5\1\7\1\6\1\10\1\12\1\11\1\14\1\15\1\52\1\16\1\41\1\uffff\1\37\1\22\2\uffff\1\26\1\24\1\27\1\25\1\30\1\46\1\45\1\32\1\36\1\33\2\uffff\1\34\4\uffff\1\57\1\60\1\uffff\1\4\2\uffff\1\23\1\uffff\1\64\1\65\1\uffff\1\67\6\uffff\1\43\13\uffff\1\66\1\53\1\54\4\uffff\1\55\1\uffff\1\21\2\uffff\1\20\2\uffff\1\17";
    static final String DFA14_specialS =
        "\102\uffff\1\3\20\uffff\1\6\10\uffff\1\2\1\0\1\1\1\5\6\uffff\1\4\20\uffff}>";
    static final String[] DFA14_transitionS = {
            "\2\44\2\uffff\1\44\22\uffff\1\44\1\13\1\43\2\uffff\1\26\1\10\1\42\1\32\1\33\1\24\1\22\1\34\1\23\1\21\1\25\12\40\1\5\1\2\1\17\1\12\1\20\1\6\1\15\32\41\1\31\1\uffff\1\27\1\11\1\41\1\uffff\1\16\4\41\1\37\1\41\1\14\1\4\4\41\1\35\5\41\1\36\6\41\1\1\1\7\1\3\1\30",
            "",
            "",
            "",
            "\1\45\4\uffff\1\46",
            "\1\47",
            "\1\51",
            "\1\53",
            "\1\55",
            "",
            "\1\57\1\60",
            "\1\61",
            "\1\63",
            "\1\64",
            "\1\67\6\uffff\1\66",
            "\1\70",
            "\1\72",
            "\1\74",
            "",
            "\1\76",
            "\1\100",
            "\1\102\4\uffff\1\103",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\12\110\13\uffff\1\112\37\uffff\1\112",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\22\41\1\113\7\41",
            "\1\115",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\116",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\120",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\121\1\122\uffd5\121",
            "\1\123",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\110\13\uffff\1\112\37\uffff\1\112",
            "",
            "",
            "\1\130",
            "",
            "\1\131",
            "\1\132",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\12\137\1\136\2\137\1\135\34\137\1\134\uffd5\137",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "\12\137\1\136\2\137\1\135\34\137\1\134\4\137\1\146\uffd0\137",
            "\12\147\1\136\ufff5\147",
            "\0\147",
            "\12\137\1\136\2\137\1\135\34\137\1\134\uffd5\137",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\12\137\1\136\2\137\1\135\34\137\1\134\uffd5\137",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\157",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\161",
            "",
            "\1\162",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\164",
            "",
            "\1\165",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | RULE_DECIMAL_VALUE | RULE_EXP_VALUE | RULE_ID | RULE_UNRESTRICTED_NAME | RULE_STRING_VALUE | RULE_REGULAR_COMMENT | RULE_DOCUMENTATION_COMMENT | RULE_ML_NOTE | RULE_SL_NOTE | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_93 = input.LA(1);

                        s = -1;
                        if ( (LA14_93=='\n') ) {s = 94;}

                        else if ( ((LA14_93>='\u0000' && LA14_93<='\t')||(LA14_93>='\u000B' && LA14_93<='\uFFFF')) ) {s = 103;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_94 = input.LA(1);

                        s = -1;
                        if ( ((LA14_94>='\u0000' && LA14_94<='\uFFFF')) ) {s = 103;}

                        else s = 84;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_92 = input.LA(1);

                        s = -1;
                        if ( (LA14_92=='/') ) {s = 102;}

                        else if ( (LA14_92=='\r') ) {s = 93;}

                        else if ( (LA14_92=='\n') ) {s = 94;}

                        else if ( (LA14_92=='*') ) {s = 92;}

                        else if ( ((LA14_92>='\u0000' && LA14_92<='\t')||(LA14_92>='\u000B' && LA14_92<='\f')||(LA14_92>='\u000E' && LA14_92<=')')||(LA14_92>='+' && LA14_92<='.')||(LA14_92>='0' && LA14_92<='\uFFFF')) ) {s = 95;}

                        else s = 84;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_66 = input.LA(1);

                        s = -1;
                        if ( ((LA14_66>='\u0000' && LA14_66<=')')||(LA14_66>='+' && LA14_66<='\uFFFF')) ) {s = 81;}

                        else if ( (LA14_66=='*') ) {s = 82;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_102 = input.LA(1);

                        s = -1;
                        if ( (LA14_102=='\r') ) {s = 93;}

                        else if ( (LA14_102=='\n') ) {s = 94;}

                        else if ( (LA14_102=='*') ) {s = 92;}

                        else if ( ((LA14_102>='\u0000' && LA14_102<='\t')||(LA14_102>='\u000B' && LA14_102<='\f')||(LA14_102>='\u000E' && LA14_102<=')')||(LA14_102>='+' && LA14_102<='\uFFFF')) ) {s = 95;}

                        else s = 103;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_95 = input.LA(1);

                        s = -1;
                        if ( (LA14_95=='\r') ) {s = 93;}

                        else if ( (LA14_95=='\n') ) {s = 94;}

                        else if ( (LA14_95=='*') ) {s = 92;}

                        else if ( ((LA14_95>='\u0000' && LA14_95<='\t')||(LA14_95>='\u000B' && LA14_95<='\f')||(LA14_95>='\u000E' && LA14_95<=')')||(LA14_95>='+' && LA14_95<='\uFFFF')) ) {s = 95;}

                        else s = 84;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_83 = input.LA(1);

                        s = -1;
                        if ( (LA14_83=='*') ) {s = 92;}

                        else if ( (LA14_83=='\r') ) {s = 93;}

                        else if ( (LA14_83=='\n') ) {s = 94;}

                        else if ( ((LA14_83>='\u0000' && LA14_83<='\t')||(LA14_83>='\u000B' && LA14_83<='\f')||(LA14_83>='\u000E' && LA14_83<=')')||(LA14_83>='+' && LA14_83<='\uFFFF')) ) {s = 95;}

                        else s = 84;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}