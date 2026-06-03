/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ViewDefinition</code> is a <code>PartDefinition</code> that specifies how a view artifact is constructed to satisfy a <code>viewpoint</code>. It specifies a <code>viewConditions</code> to define the model content to be presented and a <code>viewRendering</code> to define how the model content is presented.</p>
 * view = usage->selectByKind(ViewUsage)
 * satisfiedViewpoint = ownedRequirement->
 *     selectByKind(ViewpointUsage)->
 *     select(isComposite)
 * viewRendering =
 *     let renderings: OrderedSet(ViewRenderingMembership) =
 *         featureMembership->selectByKind(ViewRenderingMembership) in
 *     if renderings->isEmpty() then null
 *     else renderings->first().referencedRendering
 *     endif
 * viewCondition = ownedMembership->
 *     selectByKind(ElementFilterMembership).
 *     condition
 * featureMembership->
 *     selectByKind(ViewRenderingMembership)->
 *     size() <= 1
 * specializesFromLibrary('Views::View')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewDefinition#getSatisfiedViewpoint <em>Satisfied Viewpoint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewDefinition#getView <em>View</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewDefinition#getViewCondition <em>View Condition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewDefinition#getViewRendering <em>View Rendering</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewDefinition()
 * @model
 * @generated
 */
public interface ViewDefinition extends PartDefinition {
	/**
	 * Returns the value of the '<em><b>View</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ViewUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getUsage() <em>Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>usages</code> of this <code>ViewDefinition</code> that are <code>ViewUsages</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewDefinition_View()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringView'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ViewUsage> getView();

	/**
	 * Returns the value of the '<em><b>Satisfied Viewpoint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ViewpointUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedRequirement() <em>Owned Requirement</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The composite <code>ownedRequirements</code> of this <code>ViewDefinition</code> that are <code>ViewpointUsages</code> for viewpoints satisfied by the <code>ViewDefinition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satisfied Viewpoint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewDefinition_SatisfiedViewpoint()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='viewpointSatisfyingViewDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ViewpointUsage> getSatisfiedViewpoint();

	/**
	 * Returns the value of the '<em><b>View Rendering</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>RenderingUsage</code> to be used to render views defined by this <code>ViewDefinition</code>, which is the <code>referencedRendering</code> of the <code>ViewRenderingMembership</code> of the <code>ViewDefinition</code>.<p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View Rendering</em>' reference.
	 * @see #setViewRendering(RenderingUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewDefinition_ViewRendering()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='renderingOwningViewDefinition'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	RenderingUsage getViewRendering();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ViewDefinition#getViewRendering <em>View Rendering</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Rendering</em>' reference.
	 * @see #getViewRendering()
	 * @generated
	 */
	void setViewRendering(RenderingUsage value);

	/**
	 * Returns the value of the '<em><b>View Condition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Expression}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMember() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Expressions</code> related to this <code>ViewDefinition</code> by <code>ElementFilterMemberships</code>, which specify conditions on <code>Elements</code> to be rendered in a view.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View Condition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewDefinition_ViewCondition()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningViewDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Expression> getViewCondition();

} // ViewDefinition
