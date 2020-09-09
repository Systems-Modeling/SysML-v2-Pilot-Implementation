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
            keywords: words("about abstract accept action activity alias all allInstances analysis any as assert assoc assume attribute bind block by " +
                "calc case comment connect connection constraint decide def defined do doc else end entry exhibit exit first flow fork from hastype id if " +
                "import in inout instanceof interface individual istype item join language link merge nonunique objective of ordered out package part perform port " +
                "private protected public redefines ref rendering rep require requirement return satisfy send snapshot specializes state stream subsets subject " + 
                "succession then timeslice to transition type value variant variation verification view viewpoint"
                ),
            defKeywords: words("action activity analysis assoc attribute block calc case comment connection constraint doc def id link individual interface " +
                               "item package objective part port ref rendering rep requirement snapshot state timeslice transition type value verification view viewpoint"),
            typeFirstDefinitions: true,
            atoms: words("true false null"),
            number: /^(?:0x[a-f\d_]+|0b[01_]+|(?:[\d_]+\.?\d*|\.\d+)(?:e[-+]?[\d_]+)?)(u|ll?|l|f)?/i,
            modeProps: {fold: ["brace"]},
            hooks: {
				"'": function(stream) {
						var escaped = false, next;
						while ((next = stream.next()) != null) {
							if (next == "'" && !escaped) { break; }
							escaped = !escaped && next == "\\";
						}
						return "variable";
				},
				"/": function(stream) {
					if (stream.match("/*", false)) {
						stream.next();
					}
					return false;
				}
			}
        });
    });
    CodeMirror.defineMIME("text/x-sysml", "sysml");
};
