package org.omg.sysml.uml.ecore.importer;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;

/**
 * Rewrites freshly generated SysML implementation classes so they use the
 * local copied helper-list classes instead of the UML2 runtime package.
 */
public class SysMLGeneratedClassNormalizer {

	private static final String UML_UNION_IMPORT =
			"import org.eclipse.uml2.common.util.UnionEObjectEList;";
	private static final String UML_DERIVED_IMPORT =
			"import org.eclipse.uml2.common.util.DerivedEObjectEList;";
	private static final String UML_DERIVED_UNION_IMPORT =
			"import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;";
	private static final String SYSML_UNION_IMPORT =
			"import org.omg.sysml.lang.sysml.util.UnionEObjectEList;";
	private static final String SYSML_DERIVED_IMPORT =
			"import org.omg.sysml.lang.sysml.util.DerivedEObjectEList;";
	private static final String SYSML_DERIVED_UNION_IMPORT =
			"import org.omg.sysml.lang.sysml.util.DerivedUnionEObjectEList;";

	/**
	 * Creates the normalizer.
	 */
	public SysMLGeneratedClassNormalizer() {
	}

	/**
	 * Normalizes the generated Java implementation file for the given GenClass.
	 *
	 * @param genClass the generated class metadata
	 */
	public void normalize(GenClass genClass) {
		IFile file = this.getGeneratedFile(genClass);
		if (file == null || !file.exists() || file.getLocationURI() == null) {
			return;
		}

		Path location = Path.of(file.getLocationURI());
		try {
			String original = Files.readString(location, StandardCharsets.UTF_8);
			String normalized = this.normalizeImports(original);
			if (!original.equals(normalized)) {
				Files.writeString(location, normalized, StandardCharsets.UTF_8);
				file.refreshLocal(IResource.DEPTH_ZERO, null);
			}
		} catch (IOException | CoreException exception) {
			ResourcesPlugin.getPlugin().getLog().log(new Status(
					Status.ERROR,
					"org.omg.sysml.uml.ecore.importer",
					"Failed to normalize generated model class " + location,
					exception));
		}
	}

	/**
	 * Resolves the workspace file produced for the generated implementation class.
	 *
	 * @param genClass the generated class metadata
	 * @return the generated Java file in the workspace
	 */
	private IFile getGeneratedFile(GenClass genClass) {
		GenModel genModel = genClass.getGenModel();
		String workspacePath = genModel.getModelDirectory() + "/" +
				genClass.getGenPackage().getClassPackageName().replace('.', '/') + "/" +
				genClass.getClassName() + ".java";
		IPath path = new org.eclipse.core.runtime.Path(workspacePath);
		return ResourcesPlugin.getWorkspace().getRoot().getFile(path);
	}

	/**
	 * Replaces UML2 helper-list imports with the SysML-local utility imports.
	 *
	 * @param source the generated Java source
	 * @return the normalized source
	 */
	private String normalizeImports(String source) {
		return source
				.replace(UML_UNION_IMPORT, SYSML_UNION_IMPORT)
				.replace(UML_DERIVED_IMPORT, SYSML_DERIVED_IMPORT)
				.replace(UML_DERIVED_UNION_IMPORT, SYSML_DERIVED_UNION_IMPORT);
	}
}
