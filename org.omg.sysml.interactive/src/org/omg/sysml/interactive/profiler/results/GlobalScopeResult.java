package org.omg.sysml.interactive.profiler.results;

import java.io.PrintStream;

import org.eclipse.xtext.naming.QualifiedName;

public class GlobalScopeResult extends LinkStep {
	
	private QualifiedName qualifiedName;
	
	public GlobalScopeResult(QualifiedName qualifiedName, LinkStep parent) {
		super(parent);
		this.qualifiedName = qualifiedName;
	}
	
	@Override
	public void print(int nesting, PrintStream out) {
		createNesting(nesting, out);
		out.println("GLOBAL scope " + qualifiedName.toString() + " took " + getDuration().toMillis() + "ms");
		final var incNesting = ++nesting;
		getChildren().forEach(res -> res.print(incNesting, out));
	}
}