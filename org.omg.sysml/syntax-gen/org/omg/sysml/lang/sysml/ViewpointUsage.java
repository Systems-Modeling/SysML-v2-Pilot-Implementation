/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewpoint Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ViewpointUsage is a usage of a ViewpointDefinition.</p>
 * 
 * <p>A ViewpointUsage must subset, directly or indirectly, the base ViewpointUsage <code>viewpoints</code> from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewpointUsage#getViewpointDefinition <em>Viewpoint Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewpointUsage()
 * @model
 * @generated
 */
public interface ViewpointUsage extends RequirementUsage {
	/**
	 * Returns the value of the '<em><b>Viewpoint Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.RequirementUsage#getRequirementDefinition() <em>Requirement Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ViewpointDefinition that defines this ViewUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Viewpoint Definition</em>' reference.
	 * @see #setViewpointDefinition(ViewpointDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewpointUsage_ViewpointDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedViewpoint'"
	 *        annotation="redefines"
	 * @generated
	 */
	ViewpointDefinition getViewpointDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ViewpointUsage#getViewpointDefinition <em>Viewpoint Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewpoint Definition</em>' reference.
	 * @see #getViewpointDefinition()
	 * @generated
	 */
	void setViewpointDefinition(ViewpointDefinition value);

} // ViewpointUsage
