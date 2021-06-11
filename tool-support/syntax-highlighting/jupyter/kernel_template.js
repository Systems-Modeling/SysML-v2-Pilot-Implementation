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
 *   $SCRIPT
 * Source code modifications should be applied to template file:
 *   $TEMPLATE_FILE
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
                "$KEYWORDS"
            ]),
            defKeywords: words([
                "$DEF_KEYWORDS"
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
                }
            }
        });
    });
    CodeMirror.defineMIME("text/x-sysml", "sysml");
};
