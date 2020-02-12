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
            keywords: words("about abstract accept action activity allInstances any as assert assoc bind block by " +
                "comment connect constraint decide def do else end entry exhibit exit first flow fork from hastype if import " +
                "in inout instanceof interface is join link merge nonunique of ordered out package part perform port private " +
                "protected public redefines ref send specializes state stream subsets succession then to transition type value"),
            defKeywords: words("action activity assoc block constraint def link interface package part port ref state transition type value"),
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
