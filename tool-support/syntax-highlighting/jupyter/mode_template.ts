/*
 * SysML 2 Pilot Implementation
 * Copyright (C) 2020  California Institute of Technology ("Caltech")
 * Copyright (C) 2020-2021  Model Driven Solutions, Inc.
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

import {StringStream} from "@codemirror/language"
import { clike } from '@codemirror/legacy-modes/mode/clike';

const f_wordify = (h: any, s: string) => ({...h, [s]: true});
export const sysmlparser = clike({
        name: 'sysml',
        keywords: [
            "$KEYWORDS"
        ].reduce(f_wordify, {}),
        types: [
            "$DEF_KEYWORDS"
        ].reduce(f_wordify, {}),
        atoms: ['true', 'false', 'null'].reduce(f_wordify, {}),
        number: /^(?:0x[a-f\d_]+|0b[01_]+|(?:[\d_]+\.?\d*|\.\d+)(?:e[-+]?[\d_]+)?)(u|ll?|l|f)?/i, 
        hooks: {
            "'": function(stream: StringStream) {
                let b_escaped = false;
                let s_next;
                while(s_next = stream.next()) {
                    if(s_next === "'" && !b_escaped) break;
                    b_escaped = !b_escaped && s_next === '\\';
                }
                return 'variable';
            },
            '/': function(stream: StringStream) {
                if(stream.match('/*', false)) stream.next();
                return false;
            },
            "#": function(stream: StringStream) {
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
        },
    }
);
