/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rendering Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>RenderingUsage</code> is the usage of a <code>RenderingDefinition</code> to specify the rendering of a specific model view to produce a physical view artifact.</p>
 * 
 * 
 * specializesFromLibrary('Views::renderings')
 * owningType <> null and
 * (owningType.oclIsKindOf(RenderingDefinition) or
 *  owningType.oclIsKindOf(RenderingUsage)) implies
 *     specializesFromLibrary('Views::Rendering::subrenderings')
 * owningFeatureMembership <> null and
 * owningFeatureMembership.oclIsKindOf(ViewRenderingMembership) implies
 *     redefinesFromLibrary('Views::View::viewRendering')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.RenderingUsage#getRenderingDefinition <em>Rendering Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRenderingUsage()
 * @model
 * @generated
 */
public interface RenderingUsage extends PartUsage {
	/**
	 * Returns the value of the '<em><b>Rendering Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.PartUsage#getPartDefinition() <em>Part Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>RenderingDefinition</code> that is the <code>definition</code> of this <code>RenderingUsage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rendering Definition</em>' reference.
	 * @see #setRenderingDefinition(RenderingDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRenderingUsage_RenderingDefinition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedRendering'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	RenderingDefinition getRenderingDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RenderingUsage#getRenderingDefinition <em>Rendering Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendering Definition</em>' reference.
	 * @see #getRenderingDefinition()
	 * @generated
	 */
	void setRenderingDefinition(RenderingDefinition value);

} // RenderingUsage
