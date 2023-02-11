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
    public static final int RULE_SL_NOTE=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=7;
    public static final int RULE_DECIMAL_VALUE=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_ML_NOTE=10;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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
    public static final int RULE_WS=12;
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

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerMLExpressions.g:11:7: ( '?' )
            // InternalKerMLExpressions.g:11:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerMLExpressions.g:12:7: ( 'else' )
            // InternalKerMLExpressions.g:12:9: 'else'
            {
            match("else"); 


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
            // InternalKerMLExpressions.g:13:7: ( 'if' )
            // InternalKerMLExpressions.g:13:9: 'if'
            {
            match("if"); 


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
            // InternalKerMLExpressions.g:14:7: ( '??' )
            // InternalKerMLExpressions.g:14:9: '??'
            {
            match("??"); 


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
            // InternalKerMLExpressions.g:15:7: ( 'implies' )
            // InternalKerMLExpressions.g:15:9: 'implies'
            {
            match("implies"); 


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
            // InternalKerMLExpressions.g:16:7: ( '|' )
            // InternalKerMLExpressions.g:16:9: '|'
            {
            match('|'); 

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
            // InternalKerMLExpressions.g:17:7: ( 'or' )
            // InternalKerMLExpressions.g:17:9: 'or'
            {
            match("or"); 


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
            // InternalKerMLExpressions.g:18:7: ( 'xor' )
            // InternalKerMLExpressions.g:18:9: 'xor'
            {
            match("xor"); 


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
            // InternalKerMLExpressions.g:19:7: ( '&' )
            // InternalKerMLExpressions.g:19:9: '&'
            {
            match('&'); 

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
            // InternalKerMLExpressions.g:20:7: ( 'and' )
            // InternalKerMLExpressions.g:20:9: 'and'
            {
            match("and"); 


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
            // InternalKerMLExpressions.g:21:7: ( '==' )
            // InternalKerMLExpressions.g:21:9: '=='
            {
            match("=="); 


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
            // InternalKerMLExpressions.g:22:7: ( '!=' )
            // InternalKerMLExpressions.g:22:9: '!='
            {
            match("!="); 


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
            // InternalKerMLExpressions.g:23:7: ( '===' )
            // InternalKerMLExpressions.g:23:9: '==='
            {
            match("==="); 


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
            // InternalKerMLExpressions.g:24:7: ( '!==' )
            // InternalKerMLExpressions.g:24:9: '!=='
            {
            match("!=="); 


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
            // InternalKerMLExpressions.g:25:7: ( 'hastype' )
            // InternalKerMLExpressions.g:25:9: 'hastype'
            {
            match("hastype"); 


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
            // InternalKerMLExpressions.g:26:7: ( 'istype' )
            // InternalKerMLExpressions.g:26:9: 'istype'
            {
            match("istype"); 


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
            // InternalKerMLExpressions.g:27:7: ( '@' )
            // InternalKerMLExpressions.g:27:9: '@'
            {
            match('@'); 

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
            // InternalKerMLExpressions.g:28:7: ( '@@' )
            // InternalKerMLExpressions.g:28:9: '@@'
            {
            match("@@"); 


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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerMLExpressions.g:30:7: ( 'meta' )
            // InternalKerMLExpressions.g:30:9: 'meta'
            {
            match("meta"); 


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
            // InternalKerMLExpressions.g:31:7: ( '<' )
            // InternalKerMLExpressions.g:31:9: '<'
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
            // InternalKerMLExpressions.g:32:7: ( '>' )
            // InternalKerMLExpressions.g:32:9: '>'
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
            // InternalKerMLExpressions.g:33:7: ( '<=' )
            // InternalKerMLExpressions.g:33:9: '<='
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
            // InternalKerMLExpressions.g:34:7: ( '>=' )
            // InternalKerMLExpressions.g:34:9: '>='
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
            // InternalKerMLExpressions.g:35:7: ( '..' )
            // InternalKerMLExpressions.g:35:9: '..'
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
            // InternalKerMLExpressions.g:36:7: ( '+' )
            // InternalKerMLExpressions.g:36:9: '+'
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
            // InternalKerMLExpressions.g:37:7: ( '-' )
            // InternalKerMLExpressions.g:37:9: '-'
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
            // InternalKerMLExpressions.g:38:7: ( '*' )
            // InternalKerMLExpressions.g:38:9: '*'
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
            // InternalKerMLExpressions.g:39:7: ( '/' )
            // InternalKerMLExpressions.g:39:9: '/'
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
            // InternalKerMLExpressions.g:40:7: ( '%' )
            // InternalKerMLExpressions.g:40:9: '%'
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
            // InternalKerMLExpressions.g:41:7: ( '**' )
            // InternalKerMLExpressions.g:41:9: '**'
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
            // InternalKerMLExpressions.g:42:7: ( '^' )
            // InternalKerMLExpressions.g:42:9: '^'
            {
            match('^'); 

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
            // InternalKerMLExpressions.g:43:7: ( '~' )
            // InternalKerMLExpressions.g:43:9: '~'
            {
            match('~'); 

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
            // InternalKerMLExpressions.g:44:7: ( 'not' )
            // InternalKerMLExpressions.g:44:9: 'not'
            {
            match("not"); 


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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerMLExpressions.g:46:7: ( '.' )
            // InternalKerMLExpressions.g:46:9: '.'
            {
            match('.'); 

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
            // InternalKerMLExpressions.g:47:7: ( '#' )
            // InternalKerMLExpressions.g:47:9: '#'
            {
            match('#'); 

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
            // InternalKerMLExpressions.g:48:7: ( '(' )
            // InternalKerMLExpressions.g:48:9: '('
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
            // InternalKerMLExpressions.g:49:7: ( ')' )
            // InternalKerMLExpressions.g:49:9: ')'
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
            // InternalKerMLExpressions.g:50:7: ( '[' )
            // InternalKerMLExpressions.g:50:9: '['
            {
            match('['); 

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
            // InternalKerMLExpressions.g:51:7: ( ']' )
            // InternalKerMLExpressions.g:51:9: ']'
            {
            match(']'); 

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
            // InternalKerMLExpressions.g:52:7: ( '->' )
            // InternalKerMLExpressions.g:52:9: '->'
            {
            match("->"); 


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
            // InternalKerMLExpressions.g:53:7: ( '.?' )
            // InternalKerMLExpressions.g:53:9: '.?'
            {
            match(".?"); 


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
            // InternalKerMLExpressions.g:54:7: ( '{' )
            // InternalKerMLExpressions.g:54:9: '{'
            {
            match('{'); 

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
            // InternalKerMLExpressions.g:55:7: ( ';' )
            // InternalKerMLExpressions.g:55:9: ';'
            {
            match(';'); 

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
            // InternalKerMLExpressions.g:56:7: ( '}' )
            // InternalKerMLExpressions.g:56:9: '}'
            {
            match('}'); 

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
            // InternalKerMLExpressions.g:57:7: ( 'in' )
            // InternalKerMLExpressions.g:57:9: 'in'
            {
            match("in"); 


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
            // InternalKerMLExpressions.g:58:7: ( ',' )
            // InternalKerMLExpressions.g:58:9: ','
            {
            match(','); 

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
            // InternalKerMLExpressions.g:59:7: ( 'metadata' )
            // InternalKerMLExpressions.g:59:9: 'metadata'
            {
            match("metadata"); 


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
            // InternalKerMLExpressions.g:60:7: ( '=' )
            // InternalKerMLExpressions.g:60:9: '='
            {
            match('='); 

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
            // InternalKerMLExpressions.g:61:7: ( 'null' )
            // InternalKerMLExpressions.g:61:9: 'null'
            {
            match("null"); 


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
            // InternalKerMLExpressions.g:62:7: ( 'true' )
            // InternalKerMLExpressions.g:62:9: 'true'
            {
            match("true"); 


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
            // InternalKerMLExpressions.g:63:7: ( 'false' )
            // InternalKerMLExpressions.g:63:9: 'false'
            {
            match("false"); 


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
            // InternalKerMLExpressions.g:64:7: ( '::' )
            // InternalKerMLExpressions.g:64:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "RULE_DECIMAL_VALUE"
    public final void mRULE_DECIMAL_VALUE() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerMLExpressions.g:4926:20: ( '0' .. '9' ( '0' .. '9' )* )
            // InternalKerMLExpressions.g:4926:22: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // InternalKerMLExpressions.g:4926:31: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKerMLExpressions.g:4926:32: '0' .. '9'
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
            // InternalKerMLExpressions.g:4928:16: ( RULE_DECIMAL_VALUE ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMAL_VALUE )
            // InternalKerMLExpressions.g:4928:18: RULE_DECIMAL_VALUE ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMAL_VALUE
            {
            mRULE_DECIMAL_VALUE(); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKerMLExpressions.g:4928:47: ( '+' | '-' )?
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
            // InternalKerMLExpressions.g:4930:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKerMLExpressions.g:4930:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKerMLExpressions.g:4930:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalKerMLExpressions.g:4932:24: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalKerMLExpressions.g:4932:26: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalKerMLExpressions.g:4932:31: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
            	    // InternalKerMLExpressions.g:4932:32: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalKerMLExpressions.g:4932:73: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalKerMLExpressions.g:4934:19: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalKerMLExpressions.g:4934:21: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalKerMLExpressions.g:4934:25: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // InternalKerMLExpressions.g:4934:26: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalKerMLExpressions.g:4934:67: ~ ( ( '\\\\' | '\"' ) )
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
            // InternalKerMLExpressions.g:4936:22: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKerMLExpressions.g:4936:24: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKerMLExpressions.g:4936:29: ( options {greedy=false; } : . )*
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
            	    // InternalKerMLExpressions.g:4936:57: .
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

    // $ANTLR start "RULE_ML_NOTE"
    public final void mRULE_ML_NOTE() throws RecognitionException {
        try {
            int _type = RULE_ML_NOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerMLExpressions.g:4938:14: ( '//*' ( options {greedy=false; } : . )* '*/' )
            // InternalKerMLExpressions.g:4938:16: '//*' ( options {greedy=false; } : . )* '*/'
            {
            match("//*"); 

            // InternalKerMLExpressions.g:4938:22: ( options {greedy=false; } : . )*
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
            	    // InternalKerMLExpressions.g:4938:50: .
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
    // $ANTLR end "RULE_ML_NOTE"

    // $ANTLR start "RULE_SL_NOTE"
    public final void mRULE_SL_NOTE() throws RecognitionException {
        try {
            int _type = RULE_SL_NOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKerMLExpressions.g:4940:14: ( '//' (~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )? ( ( '\\r' )? '\\n' )? )
            // InternalKerMLExpressions.g:4940:16: '//' (~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )? ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalKerMLExpressions.g:4940:21: (~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKerMLExpressions.g:4940:22: ~ ( ( '\\n' | '\\r' ) ) (~ ( ( '\\n' | '\\r' ) ) )*
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalKerMLExpressions.g:4940:37: (~ ( ( '\\n' | '\\r' ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalKerMLExpressions.g:4940:37: ~ ( ( '\\n' | '\\r' ) )
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
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalKerMLExpressions.g:4940:55: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKerMLExpressions.g:4940:56: ( '\\r' )? '\\n'
                    {
                    // InternalKerMLExpressions.g:4940:56: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalKerMLExpressions.g:4940:56: '\\r'
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
            // InternalKerMLExpressions.g:4942:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKerMLExpressions.g:4942:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKerMLExpressions.g:4942:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
        // InternalKerMLExpressions.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | RULE_DECIMAL_VALUE | RULE_EXP_VALUE | RULE_ID | RULE_UNRESTRICTED_NAME | RULE_STRING_VALUE | RULE_REGULAR_COMMENT | RULE_ML_NOTE | RULE_SL_NOTE | RULE_WS )
        int alt13=63;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalKerMLExpressions.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalKerMLExpressions.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalKerMLExpressions.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalKerMLExpressions.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalKerMLExpressions.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalKerMLExpressions.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalKerMLExpressions.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalKerMLExpressions.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalKerMLExpressions.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalKerMLExpressions.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalKerMLExpressions.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalKerMLExpressions.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalKerMLExpressions.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalKerMLExpressions.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalKerMLExpressions.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalKerMLExpressions.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalKerMLExpressions.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalKerMLExpressions.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalKerMLExpressions.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalKerMLExpressions.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalKerMLExpressions.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalKerMLExpressions.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalKerMLExpressions.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalKerMLExpressions.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalKerMLExpressions.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalKerMLExpressions.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalKerMLExpressions.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalKerMLExpressions.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalKerMLExpressions.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalKerMLExpressions.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalKerMLExpressions.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalKerMLExpressions.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalKerMLExpressions.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalKerMLExpressions.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalKerMLExpressions.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalKerMLExpressions.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // InternalKerMLExpressions.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // InternalKerMLExpressions.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // InternalKerMLExpressions.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // InternalKerMLExpressions.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // InternalKerMLExpressions.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // InternalKerMLExpressions.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // InternalKerMLExpressions.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // InternalKerMLExpressions.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // InternalKerMLExpressions.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // InternalKerMLExpressions.g:1:280: T__58
                {
                mT__58(); 

                }
                break;
            case 47 :
                // InternalKerMLExpressions.g:1:286: T__59
                {
                mT__59(); 

                }
                break;
            case 48 :
                // InternalKerMLExpressions.g:1:292: T__60
                {
                mT__60(); 

                }
                break;
            case 49 :
                // InternalKerMLExpressions.g:1:298: T__61
                {
                mT__61(); 

                }
                break;
            case 50 :
                // InternalKerMLExpressions.g:1:304: T__62
                {
                mT__62(); 

                }
                break;
            case 51 :
                // InternalKerMLExpressions.g:1:310: T__63
                {
                mT__63(); 

                }
                break;
            case 52 :
                // InternalKerMLExpressions.g:1:316: T__64
                {
                mT__64(); 

                }
                break;
            case 53 :
                // InternalKerMLExpressions.g:1:322: T__65
                {
                mT__65(); 

                }
                break;
            case 54 :
                // InternalKerMLExpressions.g:1:328: T__66
                {
                mT__66(); 

                }
                break;
            case 55 :
                // InternalKerMLExpressions.g:1:334: RULE_DECIMAL_VALUE
                {
                mRULE_DECIMAL_VALUE(); 

                }
                break;
            case 56 :
                // InternalKerMLExpressions.g:1:353: RULE_EXP_VALUE
                {
                mRULE_EXP_VALUE(); 

                }
                break;
            case 57 :
                // InternalKerMLExpressions.g:1:368: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 58 :
                // InternalKerMLExpressions.g:1:376: RULE_UNRESTRICTED_NAME
                {
                mRULE_UNRESTRICTED_NAME(); 

                }
                break;
            case 59 :
                // InternalKerMLExpressions.g:1:399: RULE_STRING_VALUE
                {
                mRULE_STRING_VALUE(); 

                }
                break;
            case 60 :
                // InternalKerMLExpressions.g:1:417: RULE_REGULAR_COMMENT
                {
                mRULE_REGULAR_COMMENT(); 

                }
                break;
            case 61 :
                // InternalKerMLExpressions.g:1:438: RULE_ML_NOTE
                {
                mRULE_ML_NOTE(); 

                }
                break;
            case 62 :
                // InternalKerMLExpressions.g:1:451: RULE_SL_NOTE
                {
                mRULE_SL_NOTE(); 

                }
                break;
            case 63 :
                // InternalKerMLExpressions.g:1:464: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\53\2\46\1\uffff\2\46\1\uffff\1\46\1\67\1\uffff\1\46\1\73\1\46\1\76\1\100\1\103\1\uffff\1\105\1\107\1\112\3\uffff\1\46\11\uffff\2\46\1\uffff\1\120\6\uffff\1\46\1\123\2\46\1\126\1\127\2\46\1\132\1\46\1\135\1\uffff\1\137\1\46\2\uffff\1\46\14\uffff\1\143\1\uffff\4\46\1\120\2\uffff\1\46\1\uffff\2\46\2\uffff\1\153\1\154\1\uffff\1\155\4\uffff\2\46\1\143\1\uffff\1\164\3\46\1\170\2\46\3\uffff\1\46\1\175\2\143\1\uffff\1\143\1\uffff\1\u0080\1\u0081\1\46\1\uffff\4\46\1\uffff\1\177\3\uffff\1\u0087\1\46\1\u0089\2\46\1\uffff\1\u008c\1\uffff\1\u008d\1\46\2\uffff\1\u008f\1\uffff";
    static final String DFA13_eofS =
        "\u0090\uffff";
    static final String DFA13_minS =
        "\1\11\1\77\1\154\1\146\1\uffff\1\162\1\157\1\uffff\1\154\2\75\1\141\1\100\1\145\2\75\1\56\1\uffff\1\76\2\52\3\uffff\1\157\11\uffff\1\162\1\141\1\uffff\1\60\6\uffff\1\163\1\60\1\160\1\164\2\60\1\162\1\144\1\60\1\154\1\75\1\uffff\1\75\1\163\2\uffff\1\164\14\uffff\1\52\1\uffff\1\164\1\154\1\165\1\154\1\60\2\uffff\1\145\1\uffff\1\154\1\171\2\uffff\2\60\1\uffff\1\60\4\uffff\1\164\1\141\1\0\1\uffff\1\60\1\154\1\145\1\163\1\60\1\151\1\160\3\uffff\1\171\1\60\4\0\1\uffff\2\60\1\145\1\uffff\2\145\1\160\1\141\1\uffff\1\0\3\uffff\1\60\1\163\1\60\1\145\1\164\1\uffff\1\60\1\uffff\1\60\1\141\2\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\176\1\77\1\154\1\163\1\uffff\1\162\1\157\1\uffff\1\163\2\75\1\141\1\100\1\145\2\75\1\77\1\uffff\1\76\1\52\1\57\3\uffff\1\165\11\uffff\1\162\1\141\1\uffff\1\145\6\uffff\1\163\1\172\1\160\1\164\2\172\1\162\1\144\1\172\1\154\1\75\1\uffff\1\75\1\163\2\uffff\1\164\14\uffff\1\52\1\uffff\1\164\1\154\1\165\1\154\1\145\2\uffff\1\145\1\uffff\1\154\1\171\2\uffff\2\172\1\uffff\1\172\4\uffff\1\164\1\141\1\uffff\1\uffff\1\172\1\154\1\145\1\163\1\172\1\151\1\160\3\uffff\1\171\1\172\4\uffff\1\uffff\2\172\1\145\1\uffff\2\145\1\160\1\141\1\uffff\1\uffff\3\uffff\1\172\1\163\1\172\1\145\1\164\1\uffff\1\172\1\uffff\1\172\1\141\2\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\4\uffff\1\6\2\uffff\1\11\11\uffff\1\32\3\uffff\1\36\1\40\1\41\1\uffff\1\45\1\46\1\47\1\50\1\51\1\54\1\55\1\56\1\60\2\uffff\1\66\1\uffff\1\71\1\72\1\73\1\77\1\4\1\1\13\uffff\1\62\2\uffff\1\22\1\21\1\uffff\1\27\1\25\1\30\1\26\1\31\1\53\1\44\1\52\1\33\1\37\1\34\1\74\1\uffff\1\35\5\uffff\1\67\1\70\1\uffff\1\3\2\uffff\1\57\1\7\2\uffff\1\23\1\uffff\1\15\1\13\1\16\1\14\3\uffff\1\76\7\uffff\1\10\1\12\1\43\6\uffff\1\42\3\uffff\1\2\4\uffff\1\24\1\uffff\1\75\1\63\1\64\5\uffff\1\65\1\uffff\1\20\2\uffff\1\5\1\17\1\uffff\1\61";
    static final String DFA13_specialS =
        "\142\uffff\1\4\15\uffff\1\2\1\1\1\3\1\0\12\uffff\1\5\21\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\51\2\uffff\1\51\22\uffff\1\51\1\12\1\50\1\31\1\uffff\1\25\1\7\1\47\1\32\1\33\1\23\1\21\1\41\1\22\1\20\1\24\12\45\1\44\1\37\1\16\1\11\1\17\1\1\1\14\32\46\1\34\1\uffff\1\35\1\26\1\46\1\uffff\1\10\3\46\1\2\1\43\1\46\1\13\1\3\3\46\1\15\1\30\1\5\4\46\1\42\3\46\1\6\2\46\1\36\1\4\1\40\1\27",
            "\1\52",
            "\1\54",
            "\1\55\6\uffff\1\56\1\60\4\uffff\1\57",
            "",
            "\1\61",
            "\1\62",
            "",
            "\1\65\1\uffff\1\63\4\uffff\1\64",
            "\1\66",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\74",
            "\1\75",
            "\1\77",
            "\1\101\20\uffff\1\102",
            "",
            "\1\104",
            "\1\106",
            "\1\110\4\uffff\1\111",
            "",
            "",
            "",
            "\1\113\5\uffff\1\114",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\115",
            "\1\116",
            "",
            "\12\117\13\uffff\1\121\37\uffff\1\121",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\122",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\124",
            "\1\125",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\130",
            "\1\131",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\133",
            "\1\134",
            "",
            "\1\136",
            "\1\140",
            "",
            "",
            "\1\141",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\142",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\117\13\uffff\1\121\37\uffff\1\121",
            "",
            "",
            "\1\150",
            "",
            "\1\151",
            "\1\152",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "\1\156",
            "\1\157",
            "\12\161\1\163\2\161\1\162\34\161\1\160\uffd5\161",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\165",
            "\1\166",
            "\1\167",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\171",
            "\1\172",
            "",
            "",
            "",
            "\1\173",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\3\46\1\174\26\46",
            "\12\161\1\163\2\161\1\162\34\161\1\160\4\161\1\176\uffd0\161",
            "\12\161\1\163\2\161\1\162\34\161\1\160\uffd5\161",
            "\12\177\1\163\ufff5\177",
            "\0\177",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0082",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "\12\161\1\163\2\161\1\162\34\161\1\160\uffd5\161",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0088",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008a",
            "\1\u008b",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008e",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | RULE_DECIMAL_VALUE | RULE_EXP_VALUE | RULE_ID | RULE_UNRESTRICTED_NAME | RULE_STRING_VALUE | RULE_REGULAR_COMMENT | RULE_ML_NOTE | RULE_SL_NOTE | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_115 = input.LA(1);

                        s = -1;
                        if ( ((LA13_115>='\u0000' && LA13_115<='\uFFFF')) ) {s = 127;}

                        else s = 99;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_113 = input.LA(1);

                        s = -1;
                        if ( (LA13_113=='*') ) {s = 112;}

                        else if ( (LA13_113=='\r') ) {s = 114;}

                        else if ( (LA13_113=='\n') ) {s = 115;}

                        else if ( ((LA13_113>='\u0000' && LA13_113<='\t')||(LA13_113>='\u000B' && LA13_113<='\f')||(LA13_113>='\u000E' && LA13_113<=')')||(LA13_113>='+' && LA13_113<='\uFFFF')) ) {s = 113;}

                        else s = 99;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_112 = input.LA(1);

                        s = -1;
                        if ( (LA13_112=='/') ) {s = 126;}

                        else if ( (LA13_112=='*') ) {s = 112;}

                        else if ( (LA13_112=='\r') ) {s = 114;}

                        else if ( (LA13_112=='\n') ) {s = 115;}

                        else if ( ((LA13_112>='\u0000' && LA13_112<='\t')||(LA13_112>='\u000B' && LA13_112<='\f')||(LA13_112>='\u000E' && LA13_112<=')')||(LA13_112>='+' && LA13_112<='.')||(LA13_112>='0' && LA13_112<='\uFFFF')) ) {s = 113;}

                        else s = 99;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_114 = input.LA(1);

                        s = -1;
                        if ( ((LA13_114>='\u0000' && LA13_114<='\t')||(LA13_114>='\u000B' && LA13_114<='\uFFFF')) ) {s = 127;}

                        else if ( (LA13_114=='\n') ) {s = 115;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_98 = input.LA(1);

                        s = -1;
                        if ( (LA13_98=='*') ) {s = 112;}

                        else if ( ((LA13_98>='\u0000' && LA13_98<='\t')||(LA13_98>='\u000B' && LA13_98<='\f')||(LA13_98>='\u000E' && LA13_98<=')')||(LA13_98>='+' && LA13_98<='\uFFFF')) ) {s = 113;}

                        else if ( (LA13_98=='\r') ) {s = 114;}

                        else if ( (LA13_98=='\n') ) {s = 115;}

                        else s = 99;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_126 = input.LA(1);

                        s = -1;
                        if ( (LA13_126=='*') ) {s = 112;}

                        else if ( (LA13_126=='\r') ) {s = 114;}

                        else if ( (LA13_126=='\n') ) {s = 115;}

                        else if ( ((LA13_126>='\u0000' && LA13_126<='\t')||(LA13_126>='\u000B' && LA13_126<='\f')||(LA13_126>='\u000E' && LA13_126<=')')||(LA13_126>='+' && LA13_126<='\uFFFF')) ) {s = 113;}

                        else s = 127;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}