/*
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020  California Institute of Technology ("Caltech")
 * Copyright (c) 2020-2021  Model Driven Solutions, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *
 * ATTENTION: This file is auto-generated from the Xtext grammar definitions by script:
 *   $GIT_REPO_DIR/tool-support/syntax-highlighting/xtext_grammar_converter.py
 * Source code modifications should be applied to template file:
 *   $GIT_REPO_DIR/tool-support/syntax-highlighting/jupyter/kernel_template.js
 */

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
    function words(wordsList) {
        var obj = {};
        for (var i = 0; i < wordsList.length; ++i) obj[wordsList[i]] = true;
        return obj;
    }

    CodeMirror.defineMode("sysml", function (config) {
        return CodeMirror.getMode(config, {
            name: "clike",
            keywords: words([
                "about", "abstract", "accept", "action", "actor", "after", "alias", "all", "allocate", "allocation",
                "analysis", "and", "as", "assert", "assign", "assume", "at", "attribute", "bind", "binding", "by",
                "calc", "case", "comment", "concern", "connect", "connection", "constraint", "decide", "def", "default",
                "defined", "dependency", "derived", "do", "doc", "else", "end", "entry", "enum", "event", "exhibit",
                "exit", "expose", "filter", "first", "flow", "for", "fork", "frame", "from", "hastype", "if", "implies",
                "import", "in", "include", "individual", "inout", "interface", "istype", "item", "join", "language",
                "library", "locale", "loop", "merge", "message", "meta", "metadata", "nonunique", "not", "objective",
                "occurrence", "of", "or", "ordered", "out", "package", "parallel", "part", "perform", "port", "private",
                "protected", "public", "readonly", "redefines", "ref", "references", "render", "rendering", "rep",
                "require", "requirement", "return", "satisfy", "send", "snapshot", "specializes", "stakeholder",
                "standard", "state", "subject", "subsets", "succession", "then", "timeslice", "to", "transition",
                "until", "use", "variant", "variation", "verification", "verify", "via", "view", "viewpoint", "when",
                "while", "xor"
            ]),
            defKeywords: words([
                "action", "allocation", "analysis", "attribute", "binding", "calc", "case", "comment", "concern",
                "connection", "constraint", "def", "doc", "enum", "flow", "interface", "item", "metadata", "objective",
                "occurrence", "package", "part", "port", "ref", "rendering", "rep", "requirement", "snapshot", "state",
                "subject", "succession", "timeslice", "transition", "verification", "view", "viewpoint"
            ]),
            typeFirstDefinitions: true,
            atoms: words("true false null"),
            number: /^(?:0x[a-f\d_]+|0b[01_]+|(?:[\d_]+\.?\d*|\.\d+)(?:e[-+]?[\d_]+)?)(u|ll?|l|f)?/i,
            modeProps: {fold: ["brace"]},
            hooks: {
                "'": function (stream) {
                    var escaped = false, next;
                    while ((next = stream.next()) != null) {
                        if (next == "'" && !escaped) {
                            break;
                        }
                        escaped = !escaped && next == "\\";
                    }
                    return "variable";
                },
                "/": function (stream) {
                    if (stream.match("/*", false)) {
                        stream.next();
                    }
                    return false;
                },
                "#": function(stream: CodeMirror.StringStream) {
                 	do {
               	let b_first = true;
                 	do {
                 		if (stream.match("'", true)) { 
                    		let b_escaped = false;
                    		let s_next;
                    		while(s_next = stream.next()) {
                        		if(s_next === "'" && !b_escaped) break;
                        		b_escaped = !b_escaped && s_next === '\\';
                    		}
                		} else if (stream.match(/\w/, true)) {
                			stream.eatWhile(/\w/);
                		} else if (b_first) {
                			return 'operator';
                		}
                		b_first = false;
               	} while (stream.match('::', true))
                    return 'keyword';
                },
            }
        });
    });
    CodeMirror.defineMIME("text/x-sysml", "sysml");
};
