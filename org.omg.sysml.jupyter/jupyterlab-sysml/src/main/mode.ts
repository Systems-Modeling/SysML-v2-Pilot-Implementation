// tslint:disable-next-line
import 'codemirror/addon/mode/simple';

import * as CodeMirror from 'codemirror';

const SI_MODE = 'sysml';
const P_MIME = 'text/x-sysml'

const f_wordify = (h: any, s: string) => ({...h, [s]: true});

export function defineSysMLv2Mode(): void {
	CodeMirror.defineMode(SI_MODE, (gc_mode, gc_parser) => {
		return CodeMirror.getMode(gc_mode, {
			name: 'clike',
			keywords: [
				'about', 'abstract', 'accept', 'action', 'activity', 'alias', 'all', 'allInstances', 'analysis', 'any', 'as', 'assert', 'assoc', 'assume', 'attribute', 'bind', 'block', 'by',
				'calc', 'case', 'comment', 'connect', 'connection', 'constraint', 'decide', 'def', 'defined', 'dependency', 'do', 'doc', 'else', 'end', 'entry', 'exhibit', 'exit', 'expose',
				'first', 'flow', 'fork', 'from', 'hastype', 'id', 'if', 'import', 'in', 'inout', 'instanceof', 'interface', 'individual', 'istype', 'item', 'join', 'language', 'link', 'merge',
				'nonunique', 'objective', 'of', 'ordered', 'out', 'package', 'part', 'perform', 'port', 'private', 'protected', 'public', 'redefines', 'ref', 'rendering', 'rep', 'require',
				'requirement', 'return', 'satisfy', 'send', 'snapshot', 'specializes', 'state', 'stream', 'subsets', 'subject', 'succession', 'then', 'timeslice', 'to', 'transition', 'type',
				'value', 'variant', 'variation', 'verification', 'view', 'viewpoint',
			].reduce(f_wordify, {}),
			defKeywords: [
				'action', 'activity', 'analysis', 'assoc', 'attribute', 'block', 'calc', 'case', 'comment', 'connection', 'constraint', 'doc', 'def', 'id', 'link', 'individual', 'interface',
				'item', 'package', 'objective', 'part', 'port', 'ref', 'rendering', 'rep', 'requirement', 'snapshot', 'state', 'timeslice', 'transition', 'type', 'value', 'verification',
				'view', 'viewpoint',
			].reduce(f_wordify, {}),
			typeFirstDefinitions: true,
			atoms: ['true', 'false', 'null'].reduce(f_wordify),
			number: /^(?:0x[a-f\d_]+|0b[01_]+|(?:[\d_]+\.?\d*|\.\d+)(?:e[-+]?[\d_]+)?)(u|ll?|l|f)?/i,
			modeProps: {
				fold: ['brace'],
			},
			hooks: {
				"'": function(stream: CodeMirror.StringStream) {
					let b_escaped = false;
					let s_next;
					while(null !== (s_next = stream.next())) {
						if(s_next === "'" && !b_escaped) break;
						b_escaped = !b_escaped && s_next === '\\';
					}
					return 'variable';
				},
				'/': function(stream: CodeMirror.StringStream) {
					if(stream.match('/*', false)) stream.next();
					return false;
				},
			},
		});
	});

	CodeMirror.defineMIME(P_MIME, SI_MODE);

	(CodeMirror as any).modeInfo.push({
		ext: ['sysml'],
		mime: P_MIME,
		mode: SI_MODE,
		name: 'sysml',
	});
}
