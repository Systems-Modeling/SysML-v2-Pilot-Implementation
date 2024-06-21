package org.omg.sysml.interactive.profiler.results;

import java.io.PrintStream;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;

public class GlobalScopeResult extends LinkStep {
	
	private QualifiedName qualifiedName;
	private String result;
	
	public GlobalScopeResult(QualifiedName qualifiedName, LinkStep parent) {
		super(parent);
		this.qualifiedName = qualifiedName;
	}
	
	public void setResult(IEObjectDescription description) {
		if (description != null) {
			result = description.getName().toString() + "[" + description.getEClass().getName() +"]";
		}
	}
	
	@Override
	public void print(int nesting, PrintStream out) {
		createNesting(nesting, out);
		out.println("GLOBAL scope " + qualifiedName.toString() + " took " + getDuration().toMillis() + "ms {");
		final var incNesting = nesting + 1;
		getChildren().forEach(res -> res.print(incNesting, out));
		createNesting(nesting + 1, out);
		out.println("Found: " + result);
		createNesting(nesting, out);
		out.println("}");
	}
}