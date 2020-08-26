/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rendering Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A RenderingDefinition is a PartDefinition that defines a specific rendering of the content of a model view (e.g., symbols, style, layout, etc.).</p>
 * 
 * <p>A RenderingDefinition must subclass, directly or indirectly, the base RenderingDefinition Rendering from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.RenderingDefinition#getRendering <em>Rendering</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRenderingDefinition()
 * @model
 * @generated
 */
public interface RenderingDefinition extends PartDefinition {
	/**
	 * Returns the value of the '<em><b>Rendering</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.RenderingUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getUsage() <em>Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>usages</code> of a RenderingDefinition that are RenderingUsages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rendering</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRenderingDefinition_Rendering()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringRenderingDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<RenderingUsage> getRendering();

} // RenderingDefinition
