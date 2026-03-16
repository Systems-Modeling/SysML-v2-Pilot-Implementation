package org.omg.sysml.xtext.util;

import org.omg.sysml.xtext.InternalParserSplitterFragment;

public class InternalParserSplitter extends InternalParserSplitterFragment {
	
	public static void main(String[] args) {
		InternalParserSplitter splitter = new InternalParserSplitter();
		splitter.setOriginalClassName(args[0]);
		splitter.setBaseName(args[1]);
		splitter.setCount(Integer.valueOf(args[2]));
		splitter.generate();
	}

}
