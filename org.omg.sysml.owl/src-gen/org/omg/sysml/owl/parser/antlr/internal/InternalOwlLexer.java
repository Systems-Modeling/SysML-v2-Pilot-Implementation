package org.omg.sysml.owl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOwlLexer extends Lexer {
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
    public static final int RULE_ISEGMENT=10;
    public static final int T__61=61;
    public static final int RULE_ID=11;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_PN_LOCAL=8;
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
    public static final int RULE_PN_CHARS=14;
    public static final int RULE_FULL_IRI=6;
    public static final int RULE_BLANK_NODE_LABEL=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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
    public static final int RULE_PN_PREFIX=7;
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
    public static final int RULE_PN_CHARS_BASE=12;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=16;
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
    public static final int RULE_WS=17;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_PN_CHARS_U=13;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalOwlLexer() {;} 
    public InternalOwlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalOwlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalOwl.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOwl.g:11:7: ( 'Prefix' )
            // InternalOwl.g:11:9: 'Prefix'
            {
            match("Prefix"); 


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
            // InternalOwl.g:12:7: ( '(' )
            // InternalOwl.g:12:9: '('
            {
            match('('); 

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
            // InternalOwl.g:13:7: ( '=' )
            // InternalOwl.g:13:9: '='
            {
            match('='); 

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
            // InternalOwl.g:14:7: ( ')' )
            // InternalOwl.g:14:9: ')'
            {
            match(')'); 

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
            // InternalOwl.g:15:7: ( 'Ontology' )
            // InternalOwl.g:15:9: 'Ontology'
            {
            match("Ontology"); 


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
            // InternalOwl.g:16:7: ( 'Import' )
            // InternalOwl.g:16:9: 'Import'
            {
            match("Import"); 


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
            // InternalOwl.g:17:7: ( '^^' )
            // InternalOwl.g:17:9: '^^'
            {
            match("^^"); 


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
            // InternalOwl.g:18:7: ( 'Declaration' )
            // InternalOwl.g:18:9: 'Declaration'
            {
            match("Declaration"); 


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
            // InternalOwl.g:19:7: ( 'Class' )
            // InternalOwl.g:19:9: 'Class'
            {
            match("Class"); 


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
            // InternalOwl.g:20:7: ( 'Datatype' )
            // InternalOwl.g:20:9: 'Datatype'
            {
            match("Datatype"); 


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
            // InternalOwl.g:21:7: ( 'ObjectProperty' )
            // InternalOwl.g:21:9: 'ObjectProperty'
            {
            match("ObjectProperty"); 


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
            // InternalOwl.g:22:7: ( 'DataProperty' )
            // InternalOwl.g:22:9: 'DataProperty'
            {
            match("DataProperty"); 


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
            // InternalOwl.g:23:7: ( 'AnnotationProperty' )
            // InternalOwl.g:23:9: 'AnnotationProperty'
            {
            match("AnnotationProperty"); 


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
            // InternalOwl.g:24:7: ( 'NamedIndividual' )
            // InternalOwl.g:24:9: 'NamedIndividual'
            {
            match("NamedIndividual"); 


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
            // InternalOwl.g:25:7: ( 'ObjectInverseOf' )
            // InternalOwl.g:25:9: 'ObjectInverseOf'
            {
            match("ObjectInverseOf"); 


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
            // InternalOwl.g:26:7: ( 'DataIntersectionOf' )
            // InternalOwl.g:26:9: 'DataIntersectionOf'
            {
            match("DataIntersectionOf"); 


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
            // InternalOwl.g:27:7: ( 'DataUnionOf' )
            // InternalOwl.g:27:9: 'DataUnionOf'
            {
            match("DataUnionOf"); 


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
            // InternalOwl.g:28:7: ( 'DataComplementOf' )
            // InternalOwl.g:28:9: 'DataComplementOf'
            {
            match("DataComplementOf"); 


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
            // InternalOwl.g:29:7: ( 'DataOneOf' )
            // InternalOwl.g:29:9: 'DataOneOf'
            {
            match("DataOneOf"); 


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
            // InternalOwl.g:30:7: ( 'DatatypeRestriction' )
            // InternalOwl.g:30:9: 'DatatypeRestriction'
            {
            match("DatatypeRestriction"); 


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
            // InternalOwl.g:31:7: ( 'ObjectIntersectionOf' )
            // InternalOwl.g:31:9: 'ObjectIntersectionOf'
            {
            match("ObjectIntersectionOf"); 


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
            // InternalOwl.g:32:7: ( 'ObjectUnionOf' )
            // InternalOwl.g:32:9: 'ObjectUnionOf'
            {
            match("ObjectUnionOf"); 


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
            // InternalOwl.g:33:7: ( 'ObjectComplementOf' )
            // InternalOwl.g:33:9: 'ObjectComplementOf'
            {
            match("ObjectComplementOf"); 


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
            // InternalOwl.g:34:7: ( 'ObjectOneOf' )
            // InternalOwl.g:34:9: 'ObjectOneOf'
            {
            match("ObjectOneOf"); 


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
            // InternalOwl.g:35:7: ( 'ObjectSomeValuesFrom' )
            // InternalOwl.g:35:9: 'ObjectSomeValuesFrom'
            {
            match("ObjectSomeValuesFrom"); 


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
            // InternalOwl.g:36:7: ( 'ObjectAllValuesFrom' )
            // InternalOwl.g:36:9: 'ObjectAllValuesFrom'
            {
            match("ObjectAllValuesFrom"); 


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
            // InternalOwl.g:37:7: ( 'ObjectHasValue' )
            // InternalOwl.g:37:9: 'ObjectHasValue'
            {
            match("ObjectHasValue"); 


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
            // InternalOwl.g:38:7: ( 'ObjectHasSelf' )
            // InternalOwl.g:38:9: 'ObjectHasSelf'
            {
            match("ObjectHasSelf"); 


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
            // InternalOwl.g:39:7: ( 'ObjectMinCardinality' )
            // InternalOwl.g:39:9: 'ObjectMinCardinality'
            {
            match("ObjectMinCardinality"); 


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
            // InternalOwl.g:40:7: ( 'ObjectMaxCardinality' )
            // InternalOwl.g:40:9: 'ObjectMaxCardinality'
            {
            match("ObjectMaxCardinality"); 


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
            // InternalOwl.g:41:7: ( 'ObjectExactCardinality' )
            // InternalOwl.g:41:9: 'ObjectExactCardinality'
            {
            match("ObjectExactCardinality"); 


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
            // InternalOwl.g:42:7: ( 'DataSomeValuesFrom' )
            // InternalOwl.g:42:9: 'DataSomeValuesFrom'
            {
            match("DataSomeValuesFrom"); 


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
            // InternalOwl.g:43:7: ( 'DataAllValuesFrom' )
            // InternalOwl.g:43:9: 'DataAllValuesFrom'
            {
            match("DataAllValuesFrom"); 


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
            // InternalOwl.g:44:7: ( 'DataHasValue' )
            // InternalOwl.g:44:9: 'DataHasValue'
            {
            match("DataHasValue"); 


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
            // InternalOwl.g:45:7: ( 'DataMinCardinality' )
            // InternalOwl.g:45:9: 'DataMinCardinality'
            {
            match("DataMinCardinality"); 


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
            // InternalOwl.g:46:7: ( 'DataMaxCardinality' )
            // InternalOwl.g:46:9: 'DataMaxCardinality'
            {
            match("DataMaxCardinality"); 


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
            // InternalOwl.g:47:7: ( 'DataExactCardinality' )
            // InternalOwl.g:47:9: 'DataExactCardinality'
            {
            match("DataExactCardinality"); 


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
            // InternalOwl.g:48:7: ( 'SubClassOf' )
            // InternalOwl.g:48:9: 'SubClassOf'
            {
            match("SubClassOf"); 


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
            // InternalOwl.g:49:7: ( 'EquivalentClasses' )
            // InternalOwl.g:49:9: 'EquivalentClasses'
            {
            match("EquivalentClasses"); 


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
            // InternalOwl.g:50:7: ( 'DisjointClasses' )
            // InternalOwl.g:50:9: 'DisjointClasses'
            {
            match("DisjointClasses"); 


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
            // InternalOwl.g:51:7: ( 'DisjointUnion' )
            // InternalOwl.g:51:9: 'DisjointUnion'
            {
            match("DisjointUnion"); 


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
            // InternalOwl.g:52:7: ( 'SubObjectPropertyOf' )
            // InternalOwl.g:52:9: 'SubObjectPropertyOf'
            {
            match("SubObjectPropertyOf"); 


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
            // InternalOwl.g:53:7: ( 'ObjectPropertyChain' )
            // InternalOwl.g:53:9: 'ObjectPropertyChain'
            {
            match("ObjectPropertyChain"); 


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
            // InternalOwl.g:54:7: ( 'EquivalentObjectProperties' )
            // InternalOwl.g:54:9: 'EquivalentObjectProperties'
            {
            match("EquivalentObjectProperties"); 


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
            // InternalOwl.g:55:7: ( 'DisjointObjectProperties' )
            // InternalOwl.g:55:9: 'DisjointObjectProperties'
            {
            match("DisjointObjectProperties"); 


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
            // InternalOwl.g:56:7: ( 'InverseObjectProperties' )
            // InternalOwl.g:56:9: 'InverseObjectProperties'
            {
            match("InverseObjectProperties"); 


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
            // InternalOwl.g:57:7: ( 'ObjectPropertyDomain' )
            // InternalOwl.g:57:9: 'ObjectPropertyDomain'
            {
            match("ObjectPropertyDomain"); 


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
            // InternalOwl.g:58:7: ( 'ObjectPropertyRange' )
            // InternalOwl.g:58:9: 'ObjectPropertyRange'
            {
            match("ObjectPropertyRange"); 


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
            // InternalOwl.g:59:7: ( 'FunctionalObjectProperty' )
            // InternalOwl.g:59:9: 'FunctionalObjectProperty'
            {
            match("FunctionalObjectProperty"); 


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
            // InternalOwl.g:60:7: ( 'InverseFunctionalObjectProperty' )
            // InternalOwl.g:60:9: 'InverseFunctionalObjectProperty'
            {
            match("InverseFunctionalObjectProperty"); 


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
            // InternalOwl.g:61:7: ( 'ReflectiveObjectProperty' )
            // InternalOwl.g:61:9: 'ReflectiveObjectProperty'
            {
            match("ReflectiveObjectProperty"); 


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
            // InternalOwl.g:62:7: ( 'IrreflectiveObjectProperty' )
            // InternalOwl.g:62:9: 'IrreflectiveObjectProperty'
            {
            match("IrreflectiveObjectProperty"); 


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
            // InternalOwl.g:63:7: ( 'SymmetricObjectProperty' )
            // InternalOwl.g:63:9: 'SymmetricObjectProperty'
            {
            match("SymmetricObjectProperty"); 


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
            // InternalOwl.g:64:7: ( 'AsymmetricObjectProperty' )
            // InternalOwl.g:64:9: 'AsymmetricObjectProperty'
            {
            match("AsymmetricObjectProperty"); 


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
            // InternalOwl.g:65:7: ( 'TransitiveObjectProperty' )
            // InternalOwl.g:65:9: 'TransitiveObjectProperty'
            {
            match("TransitiveObjectProperty"); 


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
            // InternalOwl.g:66:7: ( 'SubDataPropertyOf' )
            // InternalOwl.g:66:9: 'SubDataPropertyOf'
            {
            match("SubDataPropertyOf"); 


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
            // InternalOwl.g:67:7: ( 'EquivalentDataProperties' )
            // InternalOwl.g:67:9: 'EquivalentDataProperties'
            {
            match("EquivalentDataProperties"); 


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
            // InternalOwl.g:68:7: ( 'DisjointDataProperties' )
            // InternalOwl.g:68:9: 'DisjointDataProperties'
            {
            match("DisjointDataProperties"); 


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
            // InternalOwl.g:69:7: ( 'DataPropertyDomain' )
            // InternalOwl.g:69:9: 'DataPropertyDomain'
            {
            match("DataPropertyDomain"); 


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
            // InternalOwl.g:70:7: ( 'DataPropertyRange' )
            // InternalOwl.g:70:9: 'DataPropertyRange'
            {
            match("DataPropertyRange"); 


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
            // InternalOwl.g:71:7: ( 'FunctionalDataProperty' )
            // InternalOwl.g:71:9: 'FunctionalDataProperty'
            {
            match("FunctionalDataProperty"); 


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
            // InternalOwl.g:72:7: ( 'DatatypeDefinition' )
            // InternalOwl.g:72:9: 'DatatypeDefinition'
            {
            match("DatatypeDefinition"); 


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
            // InternalOwl.g:73:7: ( 'HasKey' )
            // InternalOwl.g:73:9: 'HasKey'
            {
            match("HasKey"); 


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
            // InternalOwl.g:74:7: ( 'SameIndividual' )
            // InternalOwl.g:74:9: 'SameIndividual'
            {
            match("SameIndividual"); 


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
            // InternalOwl.g:75:7: ( 'DifferentIndividuals' )
            // InternalOwl.g:75:9: 'DifferentIndividuals'
            {
            match("DifferentIndividuals"); 


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
            // InternalOwl.g:76:7: ( 'ClassAssertion' )
            // InternalOwl.g:76:9: 'ClassAssertion'
            {
            match("ClassAssertion"); 


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
            // InternalOwl.g:77:7: ( 'ObjectPropertyAssertion' )
            // InternalOwl.g:77:9: 'ObjectPropertyAssertion'
            {
            match("ObjectPropertyAssertion"); 


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
            // InternalOwl.g:78:7: ( 'NegativeObjectPropertyAssertion' )
            // InternalOwl.g:78:9: 'NegativeObjectPropertyAssertion'
            {
            match("NegativeObjectPropertyAssertion"); 


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
            // InternalOwl.g:79:7: ( 'DataPropertyAssertion' )
            // InternalOwl.g:79:9: 'DataPropertyAssertion'
            {
            match("DataPropertyAssertion"); 


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
            // InternalOwl.g:80:7: ( 'NegativeDataPropertyAssertion' )
            // InternalOwl.g:80:9: 'NegativeDataPropertyAssertion'
            {
            match("NegativeDataPropertyAssertion"); 


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
            // InternalOwl.g:81:7: ( 'Annotation' )
            // InternalOwl.g:81:9: 'Annotation'
            {
            match("Annotation"); 


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
            // InternalOwl.g:82:7: ( 'AnnotationAssertion' )
            // InternalOwl.g:82:9: 'AnnotationAssertion'
            {
            match("AnnotationAssertion"); 


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
            // InternalOwl.g:83:7: ( 'SubAnnotationPropertyOf' )
            // InternalOwl.g:83:9: 'SubAnnotationPropertyOf'
            {
            match("SubAnnotationPropertyOf"); 


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
            // InternalOwl.g:84:7: ( 'AnnotationPropertyDomain' )
            // InternalOwl.g:84:9: 'AnnotationPropertyDomain'
            {
            match("AnnotationPropertyDomain"); 


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
            // InternalOwl.g:85:7: ( 'AnnotationPropertyRange' )
            // InternalOwl.g:85:9: 'AnnotationPropertyRange'
            {
            match("AnnotationPropertyRange"); 


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
            // InternalOwl.g:86:7: ( ':' )
            // InternalOwl.g:86:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "RULE_ISEGMENT"
    public final void mRULE_ISEGMENT() throws RecognitionException {
        try {
            // InternalOwl.g:7178:24: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '~' | '0' .. '9' )* )
            // InternalOwl.g:7178:26: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '~' | '0' .. '9' )*
            {
            // InternalOwl.g:7178:26: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '~' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='-' && LA1_0<='.')||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')||LA1_0=='~') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOwl.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='~' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ISEGMENT"

    // $ANTLR start "RULE_FULL_IRI"
    public final void mRULE_FULL_IRI() throws RecognitionException {
        try {
            int _type = RULE_FULL_IRI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOwl.g:7180:15: ( '<' RULE_ID ':' '//' RULE_ISEGMENT ( '/' RULE_ISEGMENT )* ( '#' RULE_ISEGMENT )? '>' )
            // InternalOwl.g:7180:17: '<' RULE_ID ':' '//' RULE_ISEGMENT ( '/' RULE_ISEGMENT )* ( '#' RULE_ISEGMENT )? '>'
            {
            match('<'); 
            mRULE_ID(); 
            match(':'); 
            match("//"); 

            mRULE_ISEGMENT(); 
            // InternalOwl.g:7180:52: ( '/' RULE_ISEGMENT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='/') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOwl.g:7180:53: '/' RULE_ISEGMENT
            	    {
            	    match('/'); 
            	    mRULE_ISEGMENT(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalOwl.g:7180:73: ( '#' RULE_ISEGMENT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='#') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOwl.g:7180:74: '#' RULE_ISEGMENT
                    {
                    match('#'); 
                    mRULE_ISEGMENT(); 

                    }
                    break;

            }

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FULL_IRI"

    // $ANTLR start "RULE_PN_CHARS_BASE"
    public final void mRULE_PN_CHARS_BASE() throws RecognitionException {
        try {
            // InternalOwl.g:7182:29: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalOwl.g:7182:31: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_PN_CHARS_BASE"

    // $ANTLR start "RULE_PN_CHARS_U"
    public final void mRULE_PN_CHARS_U() throws RecognitionException {
        try {
            // InternalOwl.g:7184:26: ( ( RULE_PN_CHARS_BASE | '_' ) )
            // InternalOwl.g:7184:28: ( RULE_PN_CHARS_BASE | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_PN_CHARS_U"

    // $ANTLR start "RULE_PN_CHARS"
    public final void mRULE_PN_CHARS() throws RecognitionException {
        try {
            // InternalOwl.g:7186:24: ( ( RULE_PN_CHARS_U | '-' | '0' .. '9' ) )
            // InternalOwl.g:7186:26: ( RULE_PN_CHARS_U | '-' | '0' .. '9' )
            {
            if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_PN_CHARS"

    // $ANTLR start "RULE_PN_PREFIX"
    public final void mRULE_PN_PREFIX() throws RecognitionException {
        try {
            int _type = RULE_PN_PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOwl.g:7188:16: ( RULE_PN_CHARS_BASE ( ( RULE_PN_CHARS | '.' )* RULE_PN_CHARS )? )
            // InternalOwl.g:7188:18: RULE_PN_CHARS_BASE ( ( RULE_PN_CHARS | '.' )* RULE_PN_CHARS )?
            {
            mRULE_PN_CHARS_BASE(); 
            // InternalOwl.g:7188:37: ( ( RULE_PN_CHARS | '.' )* RULE_PN_CHARS )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='-' && LA5_0<='.')||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOwl.g:7188:38: ( RULE_PN_CHARS | '.' )* RULE_PN_CHARS
                    {
                    // InternalOwl.g:7188:38: ( RULE_PN_CHARS | '.' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                            int LA4_1 = input.LA(2);

                            if ( ((LA4_1>='-' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='9')||(LA4_1>='A' && LA4_1<='Z')||LA4_1=='_'||(LA4_1>='a' && LA4_1<='z')) ) {
                                alt4=1;
                            }


                        }
                        else if ( (LA4_0=='.') ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalOwl.g:
                    	    {
                    	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

                    mRULE_PN_CHARS(); 

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
    // $ANTLR end "RULE_PN_PREFIX"

    // $ANTLR start "RULE_PN_LOCAL"
    public final void mRULE_PN_LOCAL() throws RecognitionException {
        try {
            int _type = RULE_PN_LOCAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOwl.g:7190:15: ( ':' ( RULE_PN_CHARS_U | '0' .. '9' ) ( ( RULE_PN_CHARS | '.' )* RULE_PN_CHARS )? )
            // InternalOwl.g:7190:17: ':' ( RULE_PN_CHARS_U | '0' .. '9' ) ( ( RULE_PN_CHARS | '.' )* RULE_PN_CHARS )?
            {
            match(':'); 
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalOwl.g:7190:48: ( ( RULE_PN_CHARS | '.' )* RULE_PN_CHARS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='-' && LA7_0<='.')||(LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOwl.g:7190:49: ( RULE_PN_CHARS | '.' )* RULE_PN_CHARS
                    {
                    // InternalOwl.g:7190:49: ( RULE_PN_CHARS | '.' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='-'||(LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                            int LA6_1 = input.LA(2);

                            if ( ((LA6_1>='-' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='9')||(LA6_1>='A' && LA6_1<='Z')||LA6_1=='_'||(LA6_1>='a' && LA6_1<='z')) ) {
                                alt6=1;
                            }


                        }
                        else if ( (LA6_0=='.') ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalOwl.g:
                    	    {
                    	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    mRULE_PN_CHARS(); 

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
    // $ANTLR end "RULE_PN_LOCAL"

    // $ANTLR start "RULE_BLANK_NODE_LABEL"
    public final void mRULE_BLANK_NODE_LABEL() throws RecognitionException {
        try {
            int _type = RULE_BLANK_NODE_LABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOwl.g:7192:23: ( '_:' ( RULE_PN_CHARS_U | '0' .. '9' ) ( ( RULE_PN_CHARS | '.' )* RULE_PN_CHARS )? )
            // InternalOwl.g:7192:25: '_:' ( RULE_PN_CHARS_U | '0' .. '9' ) ( ( RULE_PN_CHARS | '.' )* RULE_PN_CHARS )?
            {
            match("_:"); 

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalOwl.g:7192:57: ( ( RULE_PN_CHARS | '.' )* RULE_PN_CHARS )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>='-' && LA9_0<='.')||(LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOwl.g:7192:58: ( RULE_PN_CHARS | '.' )* RULE_PN_CHARS
                    {
                    // InternalOwl.g:7192:58: ( RULE_PN_CHARS | '.' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='-'||(LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                            int LA8_1 = input.LA(2);

                            if ( ((LA8_1>='-' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='9')||(LA8_1>='A' && LA8_1<='Z')||LA8_1=='_'||(LA8_1>='a' && LA8_1<='z')) ) {
                                alt8=1;
                            }


                        }
                        else if ( (LA8_0=='.') ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalOwl.g:
                    	    {
                    	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

                    mRULE_PN_CHARS(); 

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
    // $ANTLR end "RULE_BLANK_NODE_LABEL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            // InternalOwl.g:7194:18: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalOwl.g:7194:20: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalOwl.g:7194:20: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOwl.g:7194:20: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalOwl.g:7194:49: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOwl.g:
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
            	    break loop11;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOwl.g:7196:10: ( ( '0' .. '9' )+ )
            // InternalOwl.g:7196:12: ( '0' .. '9' )+
            {
            // InternalOwl.g:7196:12: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOwl.g:7196:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOwl.g:7198:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalOwl.g:7198:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalOwl.g:7198:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalOwl.g:7198:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalOwl.g:7198:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalOwl.g:7198:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOwl.g:7198:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalOwl.g:7198:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalOwl.g:7198:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalOwl.g:7198:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOwl.g:7198:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop14;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOwl.g:7200:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalOwl.g:7200:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalOwl.g:7200:24: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOwl.g:7200:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
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
            // InternalOwl.g:7202:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalOwl.g:7202:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalOwl.g:7202:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOwl.g:7202:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop17;
                }
            } while (true);

            // InternalOwl.g:7202:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOwl.g:7202:41: ( '\\r' )? '\\n'
                    {
                    // InternalOwl.g:7202:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalOwl.g:7202:41: '\\r'
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
            // InternalOwl.g:7204:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalOwl.g:7204:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalOwl.g:7204:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalOwl.g:
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOwl.g:7206:16: ( . )
            // InternalOwl.g:7206:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalOwl.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | RULE_FULL_IRI | RULE_PN_PREFIX | RULE_PN_LOCAL | RULE_BLANK_NODE_LABEL | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=86;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalOwl.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // InternalOwl.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // InternalOwl.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // InternalOwl.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // InternalOwl.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // InternalOwl.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // InternalOwl.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // InternalOwl.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // InternalOwl.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // InternalOwl.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // InternalOwl.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // InternalOwl.g:1:76: T__30
                {
                mT__30(); 

                }
                break;
            case 13 :
                // InternalOwl.g:1:82: T__31
                {
                mT__31(); 

                }
                break;
            case 14 :
                // InternalOwl.g:1:88: T__32
                {
                mT__32(); 

                }
                break;
            case 15 :
                // InternalOwl.g:1:94: T__33
                {
                mT__33(); 

                }
                break;
            case 16 :
                // InternalOwl.g:1:100: T__34
                {
                mT__34(); 

                }
                break;
            case 17 :
                // InternalOwl.g:1:106: T__35
                {
                mT__35(); 

                }
                break;
            case 18 :
                // InternalOwl.g:1:112: T__36
                {
                mT__36(); 

                }
                break;
            case 19 :
                // InternalOwl.g:1:118: T__37
                {
                mT__37(); 

                }
                break;
            case 20 :
                // InternalOwl.g:1:124: T__38
                {
                mT__38(); 

                }
                break;
            case 21 :
                // InternalOwl.g:1:130: T__39
                {
                mT__39(); 

                }
                break;
            case 22 :
                // InternalOwl.g:1:136: T__40
                {
                mT__40(); 

                }
                break;
            case 23 :
                // InternalOwl.g:1:142: T__41
                {
                mT__41(); 

                }
                break;
            case 24 :
                // InternalOwl.g:1:148: T__42
                {
                mT__42(); 

                }
                break;
            case 25 :
                // InternalOwl.g:1:154: T__43
                {
                mT__43(); 

                }
                break;
            case 26 :
                // InternalOwl.g:1:160: T__44
                {
                mT__44(); 

                }
                break;
            case 27 :
                // InternalOwl.g:1:166: T__45
                {
                mT__45(); 

                }
                break;
            case 28 :
                // InternalOwl.g:1:172: T__46
                {
                mT__46(); 

                }
                break;
            case 29 :
                // InternalOwl.g:1:178: T__47
                {
                mT__47(); 

                }
                break;
            case 30 :
                // InternalOwl.g:1:184: T__48
                {
                mT__48(); 

                }
                break;
            case 31 :
                // InternalOwl.g:1:190: T__49
                {
                mT__49(); 

                }
                break;
            case 32 :
                // InternalOwl.g:1:196: T__50
                {
                mT__50(); 

                }
                break;
            case 33 :
                // InternalOwl.g:1:202: T__51
                {
                mT__51(); 

                }
                break;
            case 34 :
                // InternalOwl.g:1:208: T__52
                {
                mT__52(); 

                }
                break;
            case 35 :
                // InternalOwl.g:1:214: T__53
                {
                mT__53(); 

                }
                break;
            case 36 :
                // InternalOwl.g:1:220: T__54
                {
                mT__54(); 

                }
                break;
            case 37 :
                // InternalOwl.g:1:226: T__55
                {
                mT__55(); 

                }
                break;
            case 38 :
                // InternalOwl.g:1:232: T__56
                {
                mT__56(); 

                }
                break;
            case 39 :
                // InternalOwl.g:1:238: T__57
                {
                mT__57(); 

                }
                break;
            case 40 :
                // InternalOwl.g:1:244: T__58
                {
                mT__58(); 

                }
                break;
            case 41 :
                // InternalOwl.g:1:250: T__59
                {
                mT__59(); 

                }
                break;
            case 42 :
                // InternalOwl.g:1:256: T__60
                {
                mT__60(); 

                }
                break;
            case 43 :
                // InternalOwl.g:1:262: T__61
                {
                mT__61(); 

                }
                break;
            case 44 :
                // InternalOwl.g:1:268: T__62
                {
                mT__62(); 

                }
                break;
            case 45 :
                // InternalOwl.g:1:274: T__63
                {
                mT__63(); 

                }
                break;
            case 46 :
                // InternalOwl.g:1:280: T__64
                {
                mT__64(); 

                }
                break;
            case 47 :
                // InternalOwl.g:1:286: T__65
                {
                mT__65(); 

                }
                break;
            case 48 :
                // InternalOwl.g:1:292: T__66
                {
                mT__66(); 

                }
                break;
            case 49 :
                // InternalOwl.g:1:298: T__67
                {
                mT__67(); 

                }
                break;
            case 50 :
                // InternalOwl.g:1:304: T__68
                {
                mT__68(); 

                }
                break;
            case 51 :
                // InternalOwl.g:1:310: T__69
                {
                mT__69(); 

                }
                break;
            case 52 :
                // InternalOwl.g:1:316: T__70
                {
                mT__70(); 

                }
                break;
            case 53 :
                // InternalOwl.g:1:322: T__71
                {
                mT__71(); 

                }
                break;
            case 54 :
                // InternalOwl.g:1:328: T__72
                {
                mT__72(); 

                }
                break;
            case 55 :
                // InternalOwl.g:1:334: T__73
                {
                mT__73(); 

                }
                break;
            case 56 :
                // InternalOwl.g:1:340: T__74
                {
                mT__74(); 

                }
                break;
            case 57 :
                // InternalOwl.g:1:346: T__75
                {
                mT__75(); 

                }
                break;
            case 58 :
                // InternalOwl.g:1:352: T__76
                {
                mT__76(); 

                }
                break;
            case 59 :
                // InternalOwl.g:1:358: T__77
                {
                mT__77(); 

                }
                break;
            case 60 :
                // InternalOwl.g:1:364: T__78
                {
                mT__78(); 

                }
                break;
            case 61 :
                // InternalOwl.g:1:370: T__79
                {
                mT__79(); 

                }
                break;
            case 62 :
                // InternalOwl.g:1:376: T__80
                {
                mT__80(); 

                }
                break;
            case 63 :
                // InternalOwl.g:1:382: T__81
                {
                mT__81(); 

                }
                break;
            case 64 :
                // InternalOwl.g:1:388: T__82
                {
                mT__82(); 

                }
                break;
            case 65 :
                // InternalOwl.g:1:394: T__83
                {
                mT__83(); 

                }
                break;
            case 66 :
                // InternalOwl.g:1:400: T__84
                {
                mT__84(); 

                }
                break;
            case 67 :
                // InternalOwl.g:1:406: T__85
                {
                mT__85(); 

                }
                break;
            case 68 :
                // InternalOwl.g:1:412: T__86
                {
                mT__86(); 

                }
                break;
            case 69 :
                // InternalOwl.g:1:418: T__87
                {
                mT__87(); 

                }
                break;
            case 70 :
                // InternalOwl.g:1:424: T__88
                {
                mT__88(); 

                }
                break;
            case 71 :
                // InternalOwl.g:1:430: T__89
                {
                mT__89(); 

                }
                break;
            case 72 :
                // InternalOwl.g:1:436: T__90
                {
                mT__90(); 

                }
                break;
            case 73 :
                // InternalOwl.g:1:442: T__91
                {
                mT__91(); 

                }
                break;
            case 74 :
                // InternalOwl.g:1:448: T__92
                {
                mT__92(); 

                }
                break;
            case 75 :
                // InternalOwl.g:1:454: T__93
                {
                mT__93(); 

                }
                break;
            case 76 :
                // InternalOwl.g:1:460: T__94
                {
                mT__94(); 

                }
                break;
            case 77 :
                // InternalOwl.g:1:466: RULE_FULL_IRI
                {
                mRULE_FULL_IRI(); 

                }
                break;
            case 78 :
                // InternalOwl.g:1:480: RULE_PN_PREFIX
                {
                mRULE_PN_PREFIX(); 

                }
                break;
            case 79 :
                // InternalOwl.g:1:495: RULE_PN_LOCAL
                {
                mRULE_PN_LOCAL(); 

                }
                break;
            case 80 :
                // InternalOwl.g:1:509: RULE_BLANK_NODE_LABEL
                {
                mRULE_BLANK_NODE_LABEL(); 

                }
                break;
            case 81 :
                // InternalOwl.g:1:531: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 82 :
                // InternalOwl.g:1:540: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 83 :
                // InternalOwl.g:1:552: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 84 :
                // InternalOwl.g:1:568: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 85 :
                // InternalOwl.g:1:584: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 86 :
                // InternalOwl.g:1:592: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\1\uffff\1\35\3\uffff\2\35\1\33\12\35\1\70\1\33\1\uffff\1\33\1\uffff\3\33\2\uffff\1\35\4\uffff\5\35\1\uffff\20\35\11\uffff\105\35\1\u00ab\17\35\1\u00bb\2\35\1\u00c7\22\35\1\uffff\16\35\1\u00e8\1\uffff\13\35\1\uffff\40\35\1\uffff\1\u0116\17\35\1\u0129\34\35\1\uffff\22\35\1\uffff\4\35\1\u0161\62\35\1\uffff\14\35\1\u01a2\4\35\1\u01a7\16\35\1\u01b9\12\35\1\u01c4\4\35\1\u01c9\17\35\1\uffff\4\35\1\uffff\21\35\1\uffff\12\35\1\uffff\2\35\1\u01fd\1\35\1\uffff\3\35\1\u0202\36\35\1\u0221\4\35\1\u0226\13\35\1\uffff\4\35\1\uffff\4\35\1\u023a\26\35\1\u0255\2\35\1\uffff\3\35\1\u025b\1\uffff\23\35\1\uffff\3\35\1\u0272\12\35\1\u027d\13\35\1\uffff\1\u0289\4\35\1\uffff\22\35\1\u02a0\3\35\1\uffff\3\35\1\u02a7\6\35\1\uffff\13\35\1\uffff\20\35\1\u02c9\5\35\1\uffff\6\35\1\uffff\36\35\1\u02f3\2\35\1\uffff\1\35\1\u02f7\14\35\1\u0304\2\35\1\u0307\13\35\1\u0313\11\35\1\u031d\1\u031e\1\uffff\1\35\1\u0320\1\u0321\1\uffff\1\u0322\1\u0323\4\35\1\u032a\5\35\1\uffff\2\35\1\uffff\6\35\1\u0338\1\35\1\u033a\2\35\1\uffff\1\35\1\u033e\6\35\1\u0345\2\uffff\1\35\4\uffff\6\35\1\uffff\1\u034d\3\35\1\u0351\10\35\1\uffff\1\u035a\1\uffff\1\35\1\u035c\1\u035d\1\uffff\1\u035e\1\u035f\4\35\1\uffff\1\35\1\u0365\2\35\1\u0368\2\35\1\uffff\3\35\1\uffff\10\35\1\uffff\1\35\4\uffff\4\35\1\u037b\1\uffff\2\35\1\uffff\16\35\1\u038c\3\35\1\uffff\1\35\1\u0391\12\35\1\u039c\2\35\1\u039f\1\uffff\1\u03a0\3\35\1\uffff\1\35\1\u03a5\3\35\1\u03a9\1\u03aa\3\35\1\uffff\2\35\2\uffff\2\35\1\u03b2\1\u03b3\1\uffff\1\u03b4\2\35\2\uffff\1\35\1\u03b8\1\u03b9\1\u03ba\1\u03bb\2\35\3\uffff\3\35\4\uffff\1\35\1\u03c2\2\35\1\u03c5\1\35\1\uffff\2\35\1\uffff\5\35\1\u03ce\2\35\1\uffff\1\u03d1\1\u03d2\2\uffff";
    static final String DFA21_eofS =
        "\u03d3\uffff";
    static final String DFA21_minS =
        "\1\0\1\162\3\uffff\1\142\1\155\1\136\1\141\1\154\1\156\2\141\1\161\1\165\1\145\1\162\1\141\1\60\1\101\1\uffff\1\72\1\uffff\2\0\1\52\2\uffff\1\145\4\uffff\1\164\1\152\1\160\1\166\1\162\1\uffff\1\143\1\164\1\146\1\141\1\156\1\171\1\155\1\147\1\142\2\155\1\165\1\156\1\146\1\141\1\163\11\uffff\1\146\1\157\1\145\1\157\2\145\1\154\1\141\1\152\1\146\1\163\1\157\1\155\1\145\1\141\1\101\1\155\1\145\1\151\1\143\1\154\1\156\1\113\1\151\1\154\1\143\2\162\1\146\1\141\1\101\1\157\1\145\1\163\1\164\1\155\1\144\1\164\1\154\1\142\1\141\1\156\1\145\1\111\1\166\1\164\1\145\1\163\1\145\1\170\1\157\2\164\1\163\1\154\1\162\1\171\1\162\2\156\1\157\1\156\1\157\1\154\2\141\1\170\1\151\1\162\1\55\1\141\1\145\1\111\1\151\1\141\1\152\1\164\1\156\1\164\1\156\1\141\1\151\1\143\1\151\1\171\1\55\1\147\1\101\1\55\2\145\1\141\1\160\1\157\1\164\1\151\1\155\1\145\1\155\1\154\1\163\1\156\1\170\1\141\1\156\1\145\1\163\1\uffff\2\164\1\156\1\166\1\163\1\145\1\141\1\157\1\162\1\144\1\154\1\157\2\164\1\55\1\uffff\1\171\1\162\2\156\1\157\1\156\1\157\1\154\2\141\1\170\1\uffff\1\106\1\143\1\164\1\145\1\160\1\145\1\157\1\160\1\117\1\145\2\126\2\103\1\143\1\164\1\156\1\163\1\151\1\162\1\144\1\145\1\163\1\143\1\120\1\164\2\151\1\145\1\156\2\151\1\uffff\1\55\1\157\1\164\1\151\1\155\1\145\1\155\1\154\1\163\1\156\1\170\1\141\1\142\1\165\1\164\1\151\1\55\1\145\1\162\1\156\1\154\1\146\1\126\4\141\1\164\1\103\1\164\1\145\1\157\2\151\1\104\1\117\1\164\1\162\1\141\1\143\1\166\1\156\1\141\2\166\1\uffff\1\160\2\145\1\157\1\160\1\117\1\145\1\126\1\123\2\103\1\143\1\152\1\156\1\151\1\157\2\145\1\uffff\1\162\1\163\1\117\1\145\1\55\1\141\2\154\2\162\1\103\1\154\1\156\1\142\1\141\1\111\1\162\1\156\1\143\1\166\1\142\1\141\1\146\1\120\1\157\1\164\1\117\1\151\1\164\1\154\3\145\2\162\1\156\1\154\1\146\1\126\2\141\1\145\2\141\1\164\1\145\1\143\1\166\1\156\1\163\1\146\1\164\1\145\1\146\1\155\1\uffff\1\154\2\165\2\144\2\141\1\151\1\152\1\164\1\156\1\164\1\55\1\117\1\151\1\152\1\164\1\55\1\162\1\160\1\151\1\142\1\144\1\103\1\104\2\117\1\162\2\163\1\117\1\145\1\55\1\141\3\154\2\162\1\103\1\143\1\164\1\145\1\55\1\164\1\151\1\171\1\143\1\55\1\145\1\165\2\145\2\151\1\162\1\163\1\157\1\145\1\141\1\144\1\151\1\162\1\163\1\uffff\1\142\1\144\1\145\1\141\1\uffff\1\157\1\145\1\157\1\152\1\165\1\154\1\142\1\141\1\142\1\141\2\142\1\164\2\145\1\146\1\155\1\uffff\1\154\2\165\1\146\2\144\1\141\1\164\1\151\1\117\1\uffff\1\162\1\156\1\55\1\164\1\uffff\1\156\1\145\1\163\1\55\2\156\1\144\1\163\1\156\1\143\1\120\1\151\2\157\1\163\1\152\1\165\1\143\1\120\1\160\1\162\1\156\1\145\2\141\1\152\1\164\1\152\1\164\2\152\1\171\1\117\1\143\1\55\1\145\1\165\2\145\1\55\2\151\1\162\1\120\1\157\1\142\2\151\1\157\1\141\1\163\1\uffff\1\151\1\164\1\163\1\106\1\uffff\2\141\1\151\1\145\1\55\1\164\1\162\1\166\1\156\1\160\2\145\1\141\1\164\1\162\1\145\1\164\1\120\1\143\1\154\1\163\1\145\1\141\1\145\1\141\2\145\1\55\1\146\1\164\1\uffff\1\156\1\145\1\163\1\55\1\uffff\2\156\1\144\1\162\1\156\1\152\1\143\1\164\1\155\1\156\1\163\1\157\1\117\1\106\1\162\2\154\1\156\1\163\1\uffff\1\120\1\157\1\151\1\55\1\145\1\162\1\143\1\154\1\120\1\157\1\162\1\171\1\162\1\164\1\55\1\163\1\143\1\120\1\143\1\120\2\143\1\150\1\157\1\141\1\163\1\uffff\1\55\1\151\1\164\1\163\1\106\1\uffff\2\141\1\151\1\157\1\141\1\145\1\164\1\151\1\141\1\147\1\145\1\156\1\146\1\162\1\157\2\151\1\141\1\55\1\162\1\160\1\144\1\uffff\1\162\2\164\1\55\1\162\1\160\1\164\1\117\1\157\1\120\1\uffff\1\145\1\164\1\162\1\164\1\162\2\164\1\141\1\155\1\156\1\163\1\uffff\1\157\1\117\1\106\1\162\2\154\1\156\1\160\1\154\1\143\1\151\1\157\1\151\1\145\1\162\1\117\1\55\1\157\1\155\2\164\1\154\1\uffff\1\157\1\145\1\165\1\164\1\151\1\120\1\uffff\1\157\1\145\1\171\1\146\1\160\1\162\1\163\1\120\1\157\1\120\1\157\2\120\1\151\1\141\1\147\1\145\1\156\1\146\1\162\1\157\2\151\1\141\1\145\1\117\1\164\1\157\2\156\1\55\1\164\1\146\1\uffff\1\155\1\55\2\171\1\151\1\160\1\162\1\141\1\171\1\157\1\162\1\160\1\162\1\117\1\55\1\145\1\157\1\55\1\162\1\160\1\162\1\160\2\162\1\156\1\151\1\145\1\162\1\117\1\55\1\157\1\155\2\164\1\154\1\162\1\142\1\120\1\156\2\55\1\uffff\1\151\2\55\1\uffff\2\55\1\164\1\145\1\164\1\154\1\55\1\156\1\157\1\145\1\164\1\146\1\uffff\1\162\1\160\1\uffff\1\157\1\145\1\157\1\145\2\157\1\55\1\156\1\55\1\164\1\146\1\uffff\1\155\1\55\2\171\1\151\1\164\1\152\1\162\1\55\2\uffff\1\157\4\uffff\1\171\1\162\1\151\1\163\1\157\1\141\1\uffff\1\55\1\160\1\162\1\171\1\55\1\164\1\145\1\160\1\162\1\160\1\162\2\160\1\uffff\1\55\1\uffff\1\151\2\55\1\uffff\2\55\1\164\1\151\1\145\1\157\1\uffff\1\156\1\55\1\164\1\145\1\55\1\155\1\156\1\uffff\1\145\1\164\1\101\1\uffff\1\171\1\162\1\145\1\164\1\145\1\164\2\145\1\uffff\1\157\4\uffff\1\171\1\145\1\143\1\160\1\55\1\uffff\1\151\1\163\1\uffff\1\141\1\147\1\162\1\171\1\163\1\117\1\164\1\162\1\151\1\162\1\171\2\162\1\156\1\55\1\163\1\164\1\145\1\uffff\1\145\1\55\1\151\1\145\1\164\1\101\1\163\1\146\1\171\1\164\1\145\1\164\1\55\2\164\1\55\1\uffff\1\55\1\120\1\162\1\163\1\uffff\1\156\1\55\1\171\1\163\1\145\2\55\1\151\1\163\1\171\1\uffff\2\171\2\uffff\1\162\1\164\2\55\1\uffff\1\55\1\163\1\162\2\uffff\1\145\4\55\1\157\1\171\3\uffff\1\145\1\164\1\163\4\uffff\1\160\1\55\1\162\1\151\1\55\1\145\1\uffff\1\164\1\157\1\uffff\1\162\1\151\1\156\1\164\1\157\1\55\1\171\1\156\1\uffff\2\55\2\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\162\3\uffff\1\156\1\162\1\136\1\151\1\154\1\163\1\145\1\171\1\161\1\165\1\145\1\162\1\141\2\172\1\uffff\1\72\1\uffff\2\uffff\1\57\2\uffff\1\145\4\uffff\1\164\1\152\1\160\1\166\1\162\1\uffff\1\143\1\164\1\163\1\141\1\156\1\171\1\155\1\147\1\142\2\155\1\165\1\156\1\146\1\141\1\163\11\uffff\1\146\1\157\1\145\1\157\2\145\1\154\1\141\1\152\1\146\1\163\1\157\1\155\1\145\1\141\1\117\1\155\1\145\1\151\1\143\1\154\1\156\1\113\1\151\1\154\1\143\2\162\1\146\1\141\1\164\1\157\1\145\1\163\1\164\1\155\1\144\1\164\1\154\1\142\1\141\1\156\1\145\1\111\1\166\1\164\1\145\1\163\1\145\1\170\1\157\2\164\1\163\1\154\1\162\1\171\1\162\2\156\1\157\1\156\1\157\1\154\1\141\1\151\1\170\1\151\1\162\1\172\1\141\1\145\1\111\1\151\1\141\1\152\1\164\1\156\1\164\1\156\1\141\1\151\1\143\1\151\1\171\1\172\1\147\1\125\1\172\2\145\1\141\1\160\1\157\1\164\1\151\1\155\1\145\1\155\1\154\1\163\1\156\1\170\1\141\1\156\1\145\1\163\1\uffff\2\164\1\156\1\166\1\163\1\145\1\141\1\157\1\162\1\144\1\154\1\157\2\164\1\172\1\uffff\1\171\1\162\2\156\1\157\1\156\1\157\1\154\1\141\1\151\1\170\1\uffff\1\117\1\143\1\164\1\145\1\160\1\145\1\157\1\160\1\117\1\145\2\126\2\103\1\143\1\164\1\156\1\163\1\151\1\162\1\144\1\145\1\163\1\143\1\120\1\164\2\151\1\145\1\156\2\151\1\uffff\1\172\1\157\1\166\1\151\1\155\1\145\1\155\1\154\1\163\1\156\1\170\1\141\1\142\1\165\1\164\1\151\1\172\1\145\1\162\1\156\1\154\1\146\1\126\4\141\1\164\1\125\1\164\1\145\1\157\2\151\2\117\1\164\1\162\1\141\1\143\1\166\1\156\1\141\2\166\1\uffff\1\160\2\145\1\157\1\160\1\117\1\145\2\126\2\103\1\143\1\152\1\156\1\151\1\157\2\145\1\uffff\1\162\1\163\1\117\1\145\1\172\1\141\2\154\2\162\1\103\1\154\1\156\1\142\1\141\1\111\1\162\1\156\1\143\1\166\1\142\1\141\1\146\1\120\1\157\1\164\1\117\1\151\1\164\1\154\3\145\2\162\1\156\1\154\1\146\1\126\2\141\1\145\2\141\1\164\1\145\1\143\1\166\1\156\1\163\1\146\1\164\1\145\1\146\1\155\1\uffff\1\154\2\165\2\144\2\141\1\151\1\152\1\164\1\156\1\164\1\172\1\117\1\151\1\152\1\164\1\172\1\162\1\160\1\151\1\142\1\144\4\117\1\162\2\163\1\117\1\145\1\172\1\141\3\154\2\162\1\103\1\143\1\164\1\145\1\172\1\164\1\151\1\171\1\143\1\172\1\145\1\165\2\145\2\151\1\162\1\163\1\157\1\145\1\141\1\144\1\151\1\162\1\163\1\uffff\1\142\1\144\1\145\1\141\1\uffff\1\157\1\145\1\157\1\152\1\165\1\154\1\142\1\141\1\142\1\141\2\142\1\164\2\145\1\146\1\155\1\uffff\1\154\2\165\1\146\2\144\1\141\1\164\1\151\1\117\1\uffff\1\162\1\156\1\172\1\164\1\uffff\1\156\1\145\1\163\1\172\2\156\1\144\1\163\1\156\1\143\1\120\1\151\2\157\1\163\1\152\1\165\1\143\1\120\1\160\1\162\1\156\1\145\2\141\1\152\1\164\1\152\1\164\2\152\1\171\1\117\1\143\1\172\1\145\1\165\2\145\1\172\2\151\1\162\1\120\1\157\1\142\2\151\1\157\1\141\1\163\1\uffff\1\151\1\164\1\163\1\106\1\uffff\2\141\1\151\1\145\1\172\1\164\1\162\1\166\1\156\1\160\2\145\1\141\1\164\1\162\1\145\1\164\1\120\1\143\1\154\1\163\1\145\1\141\1\145\1\141\2\145\1\172\1\146\1\164\1\uffff\1\156\1\145\1\163\1\172\1\uffff\2\156\1\144\1\162\1\156\1\152\1\143\1\164\1\155\1\156\1\163\1\157\1\117\1\106\1\162\2\154\1\156\1\163\1\uffff\1\120\1\157\1\151\1\172\1\145\1\162\1\143\1\154\1\120\1\157\1\162\1\171\1\162\1\164\1\172\1\163\1\143\1\120\1\143\1\120\2\143\1\150\1\157\1\141\1\163\1\uffff\1\172\1\151\1\164\1\163\1\106\1\uffff\2\141\1\151\1\157\1\141\1\145\1\164\1\151\1\141\1\147\1\145\1\156\1\146\1\162\1\157\2\151\1\141\1\172\1\162\1\160\1\144\1\uffff\1\162\2\164\1\172\1\162\1\160\1\164\1\117\1\157\1\120\1\uffff\1\145\1\164\1\162\1\164\1\162\2\164\1\141\1\155\1\156\1\163\1\uffff\1\157\1\117\1\106\1\162\2\154\1\156\1\160\1\154\1\143\1\151\1\157\1\151\1\145\1\162\1\117\1\172\1\157\1\155\2\164\1\154\1\uffff\1\157\1\145\1\165\1\164\1\151\1\120\1\uffff\1\157\1\145\1\171\1\146\1\160\1\162\1\163\1\120\1\157\1\120\1\157\2\120\1\151\1\141\1\147\1\145\1\156\1\146\1\162\1\157\2\151\1\141\1\145\1\117\1\164\1\157\2\156\1\172\1\164\1\146\1\uffff\1\155\1\172\2\171\1\151\1\160\1\162\1\141\1\171\1\157\1\162\1\160\1\162\1\117\1\172\1\145\1\157\1\172\1\162\1\160\1\162\1\160\2\162\1\156\1\151\1\145\1\162\1\117\1\172\1\157\1\155\2\164\1\154\1\162\1\142\1\120\1\156\2\172\1\uffff\1\151\2\172\1\uffff\2\172\1\164\1\145\1\164\1\154\1\172\1\156\1\157\1\145\1\164\1\146\1\uffff\1\162\1\160\1\uffff\1\157\1\145\1\157\1\145\2\157\1\172\1\156\1\172\1\164\1\146\1\uffff\1\155\1\172\2\171\1\151\1\164\1\152\1\162\1\172\2\uffff\1\157\4\uffff\1\171\1\162\1\151\1\163\1\157\1\141\1\uffff\1\172\1\160\1\162\1\171\1\172\1\164\1\145\1\160\1\162\1\160\1\162\2\160\1\uffff\1\172\1\uffff\1\151\2\172\1\uffff\2\172\1\164\1\151\1\145\1\157\1\uffff\1\156\1\172\1\164\1\145\1\172\1\155\1\156\1\uffff\1\145\1\164\1\101\1\uffff\1\171\1\162\1\145\1\164\1\145\1\164\2\145\1\uffff\1\157\4\uffff\1\171\1\145\1\143\1\160\1\172\1\uffff\1\151\1\163\1\uffff\1\141\1\147\1\162\1\171\1\163\1\117\1\164\1\162\1\151\1\162\1\171\2\162\1\156\1\172\1\163\1\164\1\145\1\uffff\1\145\1\172\1\151\1\145\1\164\1\101\1\163\1\146\1\171\1\164\1\145\1\164\1\172\2\164\1\172\1\uffff\1\172\1\120\1\162\1\163\1\uffff\1\156\1\172\1\171\1\163\1\145\2\172\1\151\1\163\1\171\1\uffff\2\171\2\uffff\1\162\1\164\2\172\1\uffff\1\172\1\163\1\162\2\uffff\1\145\4\172\1\157\1\171\3\uffff\1\145\1\164\1\163\4\uffff\1\160\1\172\1\162\1\151\1\172\1\145\1\uffff\1\164\1\157\1\uffff\1\162\1\151\1\156\1\164\1\157\1\172\1\171\1\156\1\uffff\2\172\2\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\1\3\1\4\17\uffff\1\116\1\uffff\1\121\3\uffff\1\125\1\126\1\uffff\1\116\1\2\1\3\1\4\5\uffff\1\7\20\uffff\1\117\1\114\1\115\1\120\1\121\1\122\1\123\1\124\1\125\153\uffff\1\11\17\uffff\1\1\13\uffff\1\6\40\uffff\1\77\55\uffff\1\5\22\uffff\1\12\67\uffff\1\23\100\uffff\1\107\4\uffff\1\46\21\uffff\1\30\12\uffff\1\10\4\uffff\1\21\63\uffff\1\14\4\uffff\1\42\36\uffff\1\26\4\uffff\1\34\23\uffff\1\51\32\uffff\1\13\5\uffff\1\33\26\uffff\1\102\12\uffff\1\100\13\uffff\1\17\26\uffff\1\50\6\uffff\1\16\41\uffff\1\22\51\uffff\1\74\3\uffff\1\41\14\uffff\1\70\2\uffff\1\47\13\uffff\1\27\11\uffff\1\76\1\73\1\uffff\1\20\1\40\1\43\1\44\6\uffff\1\15\15\uffff\1\53\1\uffff\1\60\3\uffff\1\32\6\uffff\1\24\7\uffff\1\110\3\uffff\1\52\10\uffff\1\57\1\uffff\1\25\1\31\1\35\1\36\5\uffff\1\45\2\uffff\1\101\22\uffff\1\105\20\uffff\1\37\4\uffff\1\72\12\uffff\1\75\2\uffff\1\103\1\56\4\uffff\1\113\3\uffff\1\111\1\65\7\uffff\1\55\1\112\1\66\3\uffff\1\71\1\61\1\63\1\67\6\uffff\1\64\2\uffff\1\54\10\uffff\1\106\2\uffff\1\62\1\104";
    static final String DFA21_specialS =
        "\1\2\26\uffff\1\0\1\1\u03ba\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\33\2\32\2\33\1\32\22\33\1\32\1\33\1\27\4\33\1\30\1\2\1\4\5\33\1\31\12\26\1\22\1\33\1\23\1\3\3\33\1\12\1\24\1\11\1\10\1\15\1\16\1\24\1\21\1\6\4\24\1\13\1\5\1\1\1\24\1\17\1\14\1\20\6\24\3\33\1\7\1\25\1\33\32\24\uff85\33",
            "\1\34",
            "",
            "",
            "",
            "\1\42\13\uffff\1\41",
            "\1\43\1\44\3\uffff\1\45",
            "\1\46",
            "\1\50\3\uffff\1\47\3\uffff\1\51",
            "\1\52",
            "\1\53\4\uffff\1\54",
            "\1\55\3\uffff\1\56",
            "\1\61\23\uffff\1\57\3\uffff\1\60",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\32\71\3\uffff\2\71\1\uffff\32\71",
            "",
            "\1\72",
            "",
            "\0\74",
            "\0\74",
            "\1\75\4\uffff\1\76",
            "",
            "",
            "\1\100",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "\1\111\14\uffff\1\110",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\151\1\uffff\1\146\1\150\12\uffff\1\147",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\177\1\uffff\1\174\1\uffff\1\u0082\2\uffff\1\u0080\1\172\3\uffff\1\u0081\1\uffff\1\175\1\171\2\uffff\1\176\1\uffff\1\173\36\uffff\1\170",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a6\7\uffff\1\u00a5",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\2\35\1\uffff\12\35\7\uffff\1\u00aa\31\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u00bc",
            "\1\u00c3\1\uffff\1\u00c0\1\uffff\1\u00c6\2\uffff\1\u00c4\1\u00be\3\uffff\1\u00c5\1\uffff\1\u00c1\1\u00bd\2\uffff\1\u00c2\1\uffff\1\u00bf",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
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
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f3\7\uffff\1\u00f2",
            "\1\u00f4",
            "",
            "\1\u00f6\10\uffff\1\u00f5",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0117",
            "\1\u0119\1\uffff\1\u0118",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\2\35\1\uffff\12\35\7\uffff\3\35\1\u0128\15\35\1\u0127\10\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135\1\u0138\12\uffff\1\u0137\5\uffff\1\u0136",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013f\12\uffff\1\u013e",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0153\2\uffff\1\u0152",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\2\35\1\uffff\12\35\7\uffff\1\u01a1\16\35\1\u01a0\12\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad\1\u01af\12\uffff\1\u01ae",
            "\1\u01b1\12\uffff\1\u01b0",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "",
            "\1\u01f8",
            "\1\u01f9",
            "\2\35\1\uffff\12\35\7\uffff\1\u01fc\2\35\1\u01fa\15\35\1\u01fb\10\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u01fe",
            "",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "\2\35\1\uffff\12\35\7\uffff\1\u0254\1\35\1\u0251\1\u0252\15\35\1\u0253\10\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0256",
            "\1\u0257",
            "",
            "\1\u0258",
            "\1\u0259",
            "\1\u025a",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "\1\u025f",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\1\u0266",
            "\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0273",
            "\1\u0274",
            "\1\u0275",
            "\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "\1\u0279",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "\1\u0284",
            "\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "",
            "\1\u028e",
            "\1\u028f",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "\1\u0299",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u02a1",
            "\1\u02a2",
            "\1\u02a3",
            "",
            "\1\u02a4",
            "\1\u02a5",
            "\1\u02a6",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u02a8",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "",
            "\1\u02ae",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\1\u02b3",
            "\1\u02b4",
            "\1\u02b5",
            "\1\u02b6",
            "\1\u02b7",
            "\1\u02b8",
            "",
            "\1\u02b9",
            "\1\u02ba",
            "\1\u02bb",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "\1\u02bf",
            "\1\u02c0",
            "\1\u02c1",
            "\1\u02c2",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c7",
            "\1\u02c8",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u02ca",
            "\1\u02cb",
            "\1\u02cc",
            "\1\u02cd",
            "\1\u02ce",
            "",
            "\1\u02cf",
            "\1\u02d0",
            "\1\u02d1",
            "\1\u02d2",
            "\1\u02d3",
            "\1\u02d4",
            "",
            "\1\u02d5",
            "\1\u02d6",
            "\1\u02d7",
            "\1\u02d8",
            "\1\u02d9",
            "\1\u02da",
            "\1\u02db",
            "\1\u02dc",
            "\1\u02dd",
            "\1\u02de",
            "\1\u02df",
            "\1\u02e0",
            "\1\u02e1",
            "\1\u02e2",
            "\1\u02e3",
            "\1\u02e4",
            "\1\u02e5",
            "\1\u02e6",
            "\1\u02e7",
            "\1\u02e8",
            "\1\u02e9",
            "\1\u02ea",
            "\1\u02eb",
            "\1\u02ec",
            "\1\u02ed",
            "\1\u02ee",
            "\1\u02ef",
            "\1\u02f0",
            "\1\u02f1",
            "\1\u02f2",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u02f4",
            "\1\u02f5",
            "",
            "\1\u02f6",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u02f8",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\1\u02fd",
            "\1\u02fe",
            "\1\u02ff",
            "\1\u0300",
            "\1\u0301",
            "\1\u0302",
            "\1\u0303",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0305",
            "\1\u0306",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0308",
            "\1\u0309",
            "\1\u030a",
            "\1\u030b",
            "\1\u030c",
            "\1\u030d",
            "\1\u030e",
            "\1\u030f",
            "\1\u0310",
            "\1\u0311",
            "\1\u0312",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0314",
            "\1\u0315",
            "\1\u0316",
            "\1\u0317",
            "\1\u0318",
            "\1\u0319",
            "\1\u031a",
            "\1\u031b",
            "\1\u031c",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\u031f",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0324",
            "\1\u0325",
            "\1\u0326",
            "\1\u0327",
            "\2\35\1\uffff\12\35\7\uffff\3\35\1\u0328\15\35\1\u0329\10\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u032b",
            "\1\u032c",
            "\1\u032d",
            "\1\u032e",
            "\1\u032f",
            "",
            "\1\u0330",
            "\1\u0331",
            "",
            "\1\u0332",
            "\1\u0333",
            "\1\u0334",
            "\1\u0335",
            "\1\u0336",
            "\1\u0337",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0339",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u033b",
            "\1\u033c",
            "",
            "\1\u033d",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u033f",
            "\1\u0340",
            "\1\u0341",
            "\1\u0342",
            "\1\u0343",
            "\1\u0344",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\1\u0346",
            "",
            "",
            "",
            "",
            "\1\u0347",
            "\1\u0348",
            "\1\u0349",
            "\1\u034a",
            "\1\u034b",
            "\1\u034c",
            "",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u034e",
            "\1\u034f",
            "\1\u0350",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0352",
            "\1\u0353",
            "\1\u0354",
            "\1\u0355",
            "\1\u0356",
            "\1\u0357",
            "\1\u0358",
            "\1\u0359",
            "",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\u035b",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0360",
            "\1\u0361",
            "\1\u0362",
            "\1\u0363",
            "",
            "\1\u0364",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0366",
            "\1\u0367",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0369",
            "\1\u036a",
            "",
            "\1\u036b",
            "\1\u036c",
            "\1\u036d",
            "",
            "\1\u036e",
            "\1\u036f",
            "\1\u0370",
            "\1\u0371",
            "\1\u0372",
            "\1\u0373",
            "\1\u0374",
            "\1\u0375",
            "",
            "\1\u0376",
            "",
            "",
            "",
            "",
            "\1\u0377",
            "\1\u0378",
            "\1\u0379",
            "\1\u037a",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\u037c",
            "\1\u037d",
            "",
            "\1\u037e",
            "\1\u037f",
            "\1\u0380",
            "\1\u0381",
            "\1\u0382",
            "\1\u0383",
            "\1\u0384",
            "\1\u0385",
            "\1\u0386",
            "\1\u0387",
            "\1\u0388",
            "\1\u0389",
            "\1\u038a",
            "\1\u038b",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u038d",
            "\1\u038e",
            "\1\u038f",
            "",
            "\1\u0390",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0392",
            "\1\u0393",
            "\1\u0394",
            "\1\u0395",
            "\1\u0396",
            "\1\u0397",
            "\1\u0398",
            "\1\u0399",
            "\1\u039a",
            "\1\u039b",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u039d",
            "\1\u039e",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u03a1",
            "\1\u03a2",
            "\1\u03a3",
            "",
            "\1\u03a4",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u03a6",
            "\1\u03a7",
            "\1\u03a8",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u03ab",
            "\1\u03ac",
            "\1\u03ad",
            "",
            "\1\u03ae",
            "\1\u03af",
            "",
            "",
            "\1\u03b0",
            "\1\u03b1",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u03b5",
            "\1\u03b6",
            "",
            "",
            "\1\u03b7",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u03bc",
            "\1\u03bd",
            "",
            "",
            "",
            "\1\u03be",
            "\1\u03bf",
            "\1\u03c0",
            "",
            "",
            "",
            "",
            "\1\u03c1",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u03c3",
            "\1\u03c4",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u03c6",
            "",
            "\1\u03c7",
            "\1\u03c8",
            "",
            "\1\u03c9",
            "\1\u03ca",
            "\1\u03cb",
            "\1\u03cc",
            "\1\u03cd",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u03cf",
            "\1\u03d0",
            "",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\2\35\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | RULE_FULL_IRI | RULE_PN_PREFIX | RULE_PN_LOCAL | RULE_BLANK_NODE_LABEL | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_23 = input.LA(1);

                        s = -1;
                        if ( ((LA21_23>='\u0000' && LA21_23<='\uFFFF')) ) {s = 60;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_24 = input.LA(1);

                        s = -1;
                        if ( ((LA21_24>='\u0000' && LA21_24<='\uFFFF')) ) {s = 60;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='P') ) {s = 1;}

                        else if ( (LA21_0=='(') ) {s = 2;}

                        else if ( (LA21_0=='=') ) {s = 3;}

                        else if ( (LA21_0==')') ) {s = 4;}

                        else if ( (LA21_0=='O') ) {s = 5;}

                        else if ( (LA21_0=='I') ) {s = 6;}

                        else if ( (LA21_0=='^') ) {s = 7;}

                        else if ( (LA21_0=='D') ) {s = 8;}

                        else if ( (LA21_0=='C') ) {s = 9;}

                        else if ( (LA21_0=='A') ) {s = 10;}

                        else if ( (LA21_0=='N') ) {s = 11;}

                        else if ( (LA21_0=='S') ) {s = 12;}

                        else if ( (LA21_0=='E') ) {s = 13;}

                        else if ( (LA21_0=='F') ) {s = 14;}

                        else if ( (LA21_0=='R') ) {s = 15;}

                        else if ( (LA21_0=='T') ) {s = 16;}

                        else if ( (LA21_0=='H') ) {s = 17;}

                        else if ( (LA21_0==':') ) {s = 18;}

                        else if ( (LA21_0=='<') ) {s = 19;}

                        else if ( (LA21_0=='B'||LA21_0=='G'||(LA21_0>='J' && LA21_0<='M')||LA21_0=='Q'||(LA21_0>='U' && LA21_0<='Z')||(LA21_0>='a' && LA21_0<='z')) ) {s = 20;}

                        else if ( (LA21_0=='_') ) {s = 21;}

                        else if ( ((LA21_0>='0' && LA21_0<='9')) ) {s = 22;}

                        else if ( (LA21_0=='\"') ) {s = 23;}

                        else if ( (LA21_0=='\'') ) {s = 24;}

                        else if ( (LA21_0=='/') ) {s = 25;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 26;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='!'||(LA21_0>='#' && LA21_0<='&')||(LA21_0>='*' && LA21_0<='.')||LA21_0==';'||(LA21_0>='>' && LA21_0<='@')||(LA21_0>='[' && LA21_0<=']')||LA21_0=='`'||(LA21_0>='{' && LA21_0<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}