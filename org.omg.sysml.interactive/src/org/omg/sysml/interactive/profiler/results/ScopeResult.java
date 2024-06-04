package org.omg.sysml.interactive.profiler.results;

import org.eclipse.xtext.naming.QualifiedName;

public class ScopeResult extends LinkStep {
	private final boolean global;
	private QualifiedName qualifiedName;
	
	public ScopeResult(boolean global, QualifiedName qualifiedName, LinkStep parent) {
		super(parent);
		this.global = global;
		this.qualifiedName = qualifiedName;
	}
	
	@Override
	public void print(int nesting) {
		createNesting(nesting);
		System.out.println("Scoping [" + (global ? "global" : "local") + "] " + qualifiedName.toString() + " took " + getDuration().toMillis() + "ms");
		final var incNesting = ++nesting;
		getChildren().forEach(res -> res.print(incNesting));
	}
}