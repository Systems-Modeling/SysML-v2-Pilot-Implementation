/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2025 Model Driven Solutions, Inc.
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
 *
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Ed Seidewitz, MDS
 * 
 *****************************************************************************/
package org.omg.sysml.xtext;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment;

import com.google.common.base.Charsets;

public class InternalParserSplitterFragment extends AbstractXtextGeneratorFragment {
	
	private final static Logger LOGGER = Logger.getLogger(InternalParserSplitterFragment.class);
	
	private static final String REG_EX_DFA = "    static final String dfa_";
	private static final Pattern PATTERN_DFA = Pattern.compile(REG_EX_DFA);
	private static final String REG_EX_SYNPRED = "public final boolean synpred(\\d*)_(\\w*)\\(\\)";
	private static final Pattern PATTERN_SYNPRED = Pattern.compile(REG_EX_SYNPRED);
	
	private static final String HEADER =
			"package $0;\n"
			+ "\n"
			+ "import org.eclipse.xtext.*;\n"
			+ "import org.eclipse.xtext.parser.*;\n"
			+ "import org.eclipse.xtext.parser.impl.*;\n"
			+ "import org.eclipse.emf.ecore.util.EcoreUtil;\n"
			+ "import org.eclipse.emf.ecore.EObject;\n"
			+ "import org.eclipse.emf.common.util.Enumerator;\n"
			+ "import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;\n"
			+ "import org.eclipse.xtext.parser.antlr.XtextTokenStream;\n"
			+ "import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;\n"
			+ "import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;\n"
			+ "import org.omg.sysml.xtext.services.SysMLGrammarAccess;\n"
			+ "\n"
			+ "import org.antlr.runtime.*;\n"
			+ "import java.util.Stack;\n"
			+ "import java.util.List;\n"
			+ "import java.util.ArrayList;\n"
			+ "import java.util.Map;\n"
			+ "import java.util.HashMap;\n"
			+ "\n"
			+ "@SuppressWarnings(\"all\")\n";
			
	private static final String HEADER_1 =
			HEADER
			+ "public abstract class $1 extends $2 {\n"
			+ "    public $1(TokenStream input, RecognizerSharedState state) {\n"
			+ "        super(input, state);\n"
			+ "    }\n";
	
	private static String HEADER_2 = 
			HEADER
			+ "public class $1 extends $2 {\n";
	
	private static final String SYNPRED = "    public abstract boolean synpred$1_$2();\n";
	
	private static final String MARKER_1 = "    public static final String[] tokenNames";
	private static final String MARKER_2 = "    // delegates";
	private static final String MARKER_3 = "    static final String dfa";
	
	private int count = 23;
	private String originalClassName = "InternalSysMLParser";
	private String baseName = "";
	private String antlrPackageName = "parser.antlr.internal";
	private String srcGenDirectory = "src-gen";
	private String inputDirectory = null;
	private String outputDirectory = null;
	
	protected String content = null;
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}
	
	public String getOriginalClassName() {
		return originalClassName;
	}
	
	public void setOriginalClassName(String originalClassName) {
		this.originalClassName = originalClassName;
	}
	
	public String getBaseName() {
		return baseName;
	}
	
	public void setBaseName(String projectName) {
		this.baseName = projectName;
	}
	
	public String getSrcGenDirectory() {
		return srcGenDirectory;
	}
	
	public String getAntlrPackageNam() {
		return antlrPackageName;
	}

	public void setAntlrPackageName(String antlrPackageName) {
		this.antlrPackageName = antlrPackageName;
	}

	public void setSrcGenDirectory(String srcGenDirectory) {
		this.srcGenDirectory = srcGenDirectory;
	}
	
	public String getInputDirectory() {
		return inputDirectory;
	}
	
	public void setInputDirectory(String inputDirectory) {
		this.inputDirectory = inputDirectory;
	}
	
	public String getOutputDirectory() {
		return outputDirectory;
	}
	
	public void setOutputDirectory(String outputDirectory) {
		this.outputDirectory = outputDirectory;
	}
	
	public String getPackageName() {
		return baseName.isBlank()? antlrPackageName: baseName + "." + antlrPackageName;
	}
	
	public void readInput() {
		if (inputDirectory == null) {
			inputDirectory = srcGenDirectory + "/" + getPackageName().replace(".", "/");
		}
		String inputPath = inputDirectory + "/" + originalClassName + ".java";
		LOGGER.info("Reading " + inputPath);
		try {
			content = Files.readString(Paths.get(inputPath), Charsets.UTF_8);
		} catch (Exception e) {
			LOGGER.error(e);
		}
	}
	
	protected String createOutput(String template, String className, String superclassName, int start, int end) {
		return template.replace("$0", getPackageName()).replace("$1", className).replace("$2", superclassName) + 
				content.substring(start, end);
	}	
	
	protected void writeOutput(String fileName, String output) throws IOException {
		String outputPath = outputDirectory + "/" + fileName + ".java";
		LOGGER.info("Writing " + outputPath);
		Path outputFile = Paths.get(outputPath);
		try {
			Files.writeString(outputFile, output, Charsets.UTF_8);
		} catch (Exception e) {
			LOGGER.error(e);
			throw e;
		}		
	}
	
	protected void writeFirst() throws IOException {
		int start = content.indexOf(MARKER_1);
		int end = content.indexOf(MARKER_2);
		String output = createOutput(HEADER_1, originalClassName + "1", "AbstractInternalAntlrParser", start, end);
		
		Matcher matcher = PATTERN_SYNPRED.matcher(content);
		while (matcher.find()) {
			output += SYNPRED.replace("$1", matcher.group(1)).replace("$2", matcher.group(2));
		}
		
		output += "}";		
		writeOutput(originalClassName + "1", output);
	}
	
	protected void write(int i, int start, int end, boolean last) throws IOException {
		String className = originalClassName + i;
		String superclassName = originalClassName + (i -1);
		String output = createOutput(HEADER_1, className, superclassName, start, end);
		if (!last) {
			output += "}";
		}
		writeOutput(className, output);		
	}
	
	protected int writeMiddle() throws IOException {
		int i = 2;
		int n = 0;
		int start = content.indexOf(MARKER_3);		
		Matcher matcher = PATTERN_DFA.matcher(content);
		while (matcher.find()) {
			int end = matcher.start();
			n = n + 1;
			if (n == count) {
				write(i, start, end, false);
				i = i + 1;
				n = 0;
				start = end;
			}
		}
		write(i, start, content.length(), true);
		return i;
	}
	
	protected void writeFinal(int i) throws IOException {
		int start = content.indexOf(MARKER_2);
		int end = content.indexOf(MARKER_3);
		String output = createOutput(HEADER_2, originalClassName, originalClassName + i, start, end) + "}";
		writeOutput(originalClassName, output);
	}
	
	public void writeOutput() {
		if (outputDirectory == null) {
			outputDirectory = inputDirectory;
		}
		try {
			writeFirst();
			int i = writeMiddle();		
			writeFinal(i);
		} catch (Exception e) {
		}
	}
	
	public void generate() {
		if (count > 0) {
			readInput();
			if (content != null) {
				writeOutput();
			}
		}
	}

}
