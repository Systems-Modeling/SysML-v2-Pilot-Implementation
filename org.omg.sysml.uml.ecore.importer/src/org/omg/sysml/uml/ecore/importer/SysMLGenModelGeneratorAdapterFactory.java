package org.omg.sysml.uml.ecore.importer;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.uml2.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;

/**
 * SysML-specific UML2 GenModel generator adapter factory.
 *
 * <p>
 * This factory preserves the default UML2 generation behavior and only replaces
 * the {@code GenClass} adapter with a subclass that post-processes generated
 * implementation classes to use the local SysML helper-list utilities.
 * </p>
 */
public class SysMLGenModelGeneratorAdapterFactory extends GenModelGeneratorAdapterFactory {

	/**
	 * Returns a singleton {@link SysMLGenClassGeneratorAdapter}.
	 *
	 * @return the SysML-aware GenClass generator adapter
	 */
	@Override
	public Adapter createGenClassAdapter() {
		if (genClassGeneratorAdapter == null) {
			genClassGeneratorAdapter = new SysMLGenClassGeneratorAdapter(this);
		}
		return genClassGeneratorAdapter;
	}
}
