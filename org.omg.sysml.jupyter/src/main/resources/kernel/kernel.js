define([
    'codemirror/lib/codemirror',
    'codemirror/mode/clike/clike',
    'base/js/namespace',
], function (
    CodeMirror,
    clike,
    IPython) {
    "use strict";
    var onload = function () {
        console.log("Loading kernel.js from ISysML")
        enableMode(CodeMirror);
    }
    return {onload: onload};
});

var enableMode = function (CodeMirror) {
    function words(str) {
        var obj = {}, words = str.split(" ");
        for (var i = 0; i < words.length; ++i) obj[words[i]] = true;
        return obj;
    }

    CodeMirror.defineMode("sysml", function (config) {
        return CodeMirror.getMode(config, {
            name: "clike",
            keywords: words("abstract accept action activity allInstances any as assoc assocblock bind block by " +
                "comment connect decision def do end first flow fork from hastype if import in inout instanceof interface " +
                "interfacedef is join link merge nonunique of on ordered out package part perform port portdef private " +
                "protected public redefines ref send specializes stream subsets succession then to type value valuetype"),
            defKeywords: words("action activity assoc assocblock block connect def link flow " +
                "interface interfacedef package part port ref stream succession type value valuetype"),
            /*
            keywords: words("abstract accept allInstances any as assoc behavior binding by class classifier " +
                "compose connector datatype end expr feature flow from function hastype import in inout instanceof " +
                "interaction is namespace nonunique ordered out package packaged part perform port portion private " +
                "protected public redefines specializes step stream subsets succession then to"),
            defKeywords: words("assoc behavior class classifier connector datatype expr feature flow function " +
                "interaction namespace package part port step succession"),
            */
            typeFirstDefinitions: true,
            atoms: words("true false null"),
            number: /^(?:0x[a-f\d_]+|0b[01_]+|(?:[\d_]+\.?\d*|\.\d+)(?:e[-+]?[\d_]+)?)(u|ll?|l|f)?/i,
            modeProps: {fold: ["brace"]}
            /*
            keywords: words("abstract assert break case catch class const continue default " +
                "do else enum extends final finally for goto if implements import " +
                "instanceof interface native new package private protected public " +
                "return static strictfp super switch synchronized this throw throws transient " +
                "try volatile while @interface"),
            types: words("byte short int long float double boolean char void Boolean Byte Character Double Float " +
                "Integer Long Number Object Short String StringBuffer StringBuilder Void"),
            blockKeywords: words("catch class do else finally for if switch try while"),
            defKeywords: words("class interface enum @interface"),
            typeFirstDefinitions: true,
            atoms: words("true false null"),
            number: /^(?:0x[a-f\d_]+|0b[01_]+|(?:[\d_]+\.?\d*|\.\d+)(?:e[-+]?[\d_]+)?)(u|ll?|l|f)?/i,
            hooks: {
                "@": function(stream) {
                    // Don't match the @interface keyword.
                    if (stream.match('interface', false)) return false;

                    stream.eatWhile(/[\w\$_]/);
                    return "meta";
                }
            },
            modeProps: {fold: ["brace", "import"]}
             */
        });
    });
    CodeMirror.defineMIME("text/x-sysml", "sysml");
};
