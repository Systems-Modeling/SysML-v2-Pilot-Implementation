package org.omg.kerml.expressions.xtext

import org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess
import com.google.inject.Inject
import org.eclipse.xtext.xtext.generator.parser.antlr.ContentAssistGrammarNaming
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess
import org.eclipse.xtext.parser.antlr.Lexer
import com.google.inject.name.Names
import org.eclipse.xtext.parser.antlr.ITokenDefProvider
import org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider
import org.eclipse.xtext.xtext.generator.parser.antlr.GrammarNaming

import static extension org.eclipse.xtext.xtext.generator.model.TypeReference.*

class NoContentAssistAntlrGeneratorFragment extends XtextAntlrGeneratorFragment2 {
	@Inject FileAccessFactory fileFactory
	@Inject GrammarNaming productionNaming
	@Inject ContentAssistGrammarNaming contentAssistNaming

	override generateContentAssistGrammar() {
	}
	
	override JavaFileAccess generateContentAssistParser() {
		val extension naming = contentAssistNaming
		val file = fileFactory.createGeneratedJavaFile(grammar.parserClass)
		file.content = '''
			public class «grammar.parserClass.simpleName» extends «grammar.getParserSuperClass(false)» {
			
				@Override
				protected org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser createParser() {
					return null;
				}
			
				@Override
				protected String[] getInitialHiddenTokens() {
					return new String[]{};
				}
				
				@Override
				protected String getRuleName(org.eclipse.xtext.AbstractElement element) {
					return "";
				}

			}
		'''
		return file
	}
	
	override addIdeBindingsAndImports() {
		
	}
	
	override addUiBindingsAndImports() {
//		val extension naming = contentAssistNaming
//		val caLexerClass = grammar.lexerClass
//		
//		if (projectConfig.genericIde.manifest !== null) {
//			projectConfig.genericIde.manifest=>[
//				exportedPackages += #[
//					caLexerClass.packageName,
//					grammar.parserClass.packageName,
//					grammar.internalParserClass.packageName
//				]
//			]
//		}
		val uiBindings = new GuiceModuleAccess.BindingFactory()
			.addTypeToType(
				"org.eclipse.xtext.ui.editor.contentassist.IProposalConflictHelper".typeRef, 
				"org.eclipse.xtext.ui.editor.contentassist.antlr.AntlrProposalConflictHelper".typeRef
			)
//			.addConfiguredBinding("ContentAssistLexer", '''
//				binder.bind(�grammar.lexerSuperClass�.class)
//					.annotatedWith(�Names�.named(�"org.eclipse.xtext.ide.LexerIdeBindings".typeRef�.CONTENT_ASSIST))
//					.to(�caLexerClass�.class);
//			''')
			// registration of the 'ContentAssistLexer' is put in front of the 'HighlightingLexer'
			//  in order to let 'caLexerClass' get added to the imports, since it is referenced
			//  several times and the lexer classes' simple names are usually identical
			.addConfiguredBinding("HighlightingLexer", '''
				binder.bind(«Lexer».class)
					.annotatedWith(«Names».named(«"org.eclipse.xtext.ide.LexerIdeBindings".typeRef».HIGHLIGHTING))
					.to(«productionNaming.getLexerClass(grammar)».class);
			''')
			.addConfiguredBinding("HighlightingTokenDefProvider", '''
				binder.bind(«ITokenDefProvider».class)
					.annotatedWith(«Names».named(«"org.eclipse.xtext.ide.LexerIdeBindings".typeRef».HIGHLIGHTING))
					.to(«AntlrTokenDefProvider».class);
			''')
//			.addTypeToType(
//				new TypeReference("org.eclipse.xtext.ui.editor.contentassist", "ContentAssistContext.Factory"),
//				"org.eclipse.xtext.ui.editor.contentassist.antlr.DelegatingContentAssistContextFactory".typeRef
//			)
//			.addTypeToType(
//				"org.eclipse.xtext.ide.editor.contentassist.antlr.IContentAssistParser".typeRef,
//				grammar.parserClass
//			)
//			.addConfiguredBinding("ContentAssistLexerProvider", '''
//				binder.bind(�caLexerClass�.class).toProvider(�LexerProvider�.create(�caLexerClass�.class));
//			''')
			
		if (hasSyntheticTerminalRule) {
			uiBindings.addTypeToType(
				"org.eclipse.xtext.ide.editor.contentassist.CompletionPrefixProvider".typeRef, 
				"org.eclipse.xtext.ide.editor.contentassist.IndentationAwareCompletionPrefixProvider".typeRef
			)
		}
		uiBindings.contributeTo(language.eclipsePluginGenModule)
	}
}