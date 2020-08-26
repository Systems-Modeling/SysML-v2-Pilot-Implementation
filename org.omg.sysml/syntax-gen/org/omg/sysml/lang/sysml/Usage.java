/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Usage is a usage of a Definition. A Usage may only be an <code>ownedFeature</code> of a Definition or another Usage.</p>
 * 
 * <p>A Usage may have <code>nestedUsages</code> that model <code>features</code> that apply in the context of the <code>owningUsage</code>. A Usage may also have Definitions nested in it, but this has no semantic significance, other than the nested namespace scoping resulting from the Usage being considered as a Package for any nested Definitions.</p>
 * 
 * <p>However, if a Usage has <code>isVariation</code> = true, then it represents a <em>variation point</em> Usage. In this case, all of its <code>members</code> must be <code>variant</code> Usages, related to the Usage by VariantMembership Relationships. Rather than being <code>features</code> of the Usage, <code>variant</code> Usages model different concrete alternatives that can be chosen to fill in for the variation point Usage.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage <em>Nested Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getOwningUsage <em>Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getOwningDefinition <em>Owning Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedPort <em>Nested Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedAction <em>Nested Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedState <em>Nested State</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedConstraint <em>Nested Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedTransition <em>Nested Transition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedRequirement <em>Nested Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedCalculation <em>Nested Calculation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#isVariation <em>Is Variation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedCase <em>Nested Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedAnalysisCase <em>Nested Analysis Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getVariantMembership_comp <em>Variant Membership comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedReference <em>Nested Reference</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedConnection <em>Nested Connection</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedItem <em>Nested Item</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedPart <em>Nested Part</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedIndividual <em>Nested Individual</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedInterface <em>Nested Interface</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedAttribute <em>Nested Attribute</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getVariantMembership <em>Variant Membership</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage()
 * @model abstract="true"
 * @generated
 */
public interface Usage extends Feature {
	/**
	 * Returns the value of the '<em><b>Nested Usage</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Usage}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Usage#getOwningUsage <em>Owning Usage</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getUsage() <em>Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Usage</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Usages that are <code>ownedFeatures</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Usage</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getOwningUsage
	 * @model opposite="owningUsage" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Usage> getNestedUsage();

	/**
	 * Returns the value of the '<em><b>Owning Usage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage <em>Nested Usage</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getOwningType() <em>Owning Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Usage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Usage in which this Usage is nested (if any).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Usage</em>' reference.
	 * @see #setOwningUsage(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_OwningUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getNestedUsage
	 * @model opposite="nestedUsage" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Usage getOwningUsage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Usage#getOwningUsage <em>Owning Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Usage</em>' reference.
	 * @see #getOwningUsage()
	 * @generated
	 */
	void setOwningUsage(Usage value);

	/**
	 * Returns the value of the '<em><b>Owning Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage <em>Owned Usage</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getOwningType() <em>Owning Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Definition that owns this Usage (if any).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Definition</em>' reference.
	 * @see #setOwningDefinition(Definition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_OwningDefinition()
	 * @see org.omg.sysml.lang.sysml.Definition#getOwnedUsage
	 * @model opposite="ownedUsage" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Definition getOwningDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Usage#getOwningDefinition <em>Owning Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Definition</em>' reference.
	 * @see #getOwningDefinition()
	 * @generated
	 */
	void setOwningDefinition(Definition value);

	/**
	 * Returns the value of the '<em><b>Variant Membership</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.VariantMembership}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Package#getOwnedMembership_comp() <em>Owned Membership comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variant Membership</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_VariantMembership()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<VariantMembership> getVariantMembership();

	/**
	 * Returns the value of the '<em><b>Nested Port</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.PortUsage}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.PortUsage#getPortOwningUsage <em>Port Owning Usage</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage() <em>Nested Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The PortUsages that are <code>ownedUsages</cpde> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Port</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedPort()
	 * @see org.omg.sysml.lang.sysml.PortUsage#getPortOwningUsage
	 * @model opposite="portOwningUsage" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<PortUsage> getNestedPort();

	/**
	 * Returns the value of the '<em><b>Nested State</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.StateUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedAction() <em>Nested Action</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The StateUsages that are <tt>ownedUsages</tt> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested State</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedState()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='stateOwningUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<StateUsage> getNestedState();

	/**
	 * Returns the value of the '<em><b>Nested Constraint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ConstraintUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage() <em>Nested Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ConstraintUsages that are <tt>ownedUsages</tt> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Constraint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedConstraint()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='constraintOwningUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ConstraintUsage> getNestedConstraint();

	/**
	 * Returns the value of the '<em><b>Nested Transition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.TransitionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage() <em>Nested Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The TransitionUsages that are <tt>ownedUsages</tt> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Transition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedTransition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='transitionOwningUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<TransitionUsage> getNestedTransition();

	/**
	 * Returns the value of the '<em><b>Nested Requirement</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.RequirementUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedConstraint() <em>Nested Constraint</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Requirement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The RequirementUsages that are <tt>ownedUsages</tt> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Requirement</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedRequirement()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='requirementOwningUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<RequirementUsage> getNestedRequirement();

	/**
	 * Returns the value of the '<em><b>Nested Calculation</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.CalculationUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedAction() <em>Nested Action</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The CalculationUsage that are <code>ownedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Calculation</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedCalculation()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='calculationOwningUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<CalculationUsage> getNestedCalculation();

	/**
	 * Returns the value of the '<em><b>Is Variation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this Usage is for a variation point or not. If true, then all the <code>memberships</code> of the Usage must be VariantMemberships.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Variation</em>' attribute.
	 * @see #setIsVariation(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_IsVariation()
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isVariation();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Usage#isVariation <em>Is Variation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Variation</em>' attribute.
	 * @see #isVariation()
	 * @generated
	 */
	void setIsVariation(boolean value);

	/**
	 * Returns the value of the '<em><b>Flow</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Usage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getUsage() <em>Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>usages</code> of this Usage that have a non-null <code>direction</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flow</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_Flow()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='usageWithFlow'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Usage> getFlow();

	/**
	 * Returns the value of the '<em><b>Nested Case</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.CaseUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedCalculation() <em>Nested Calculation</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The CaseUsages that are <code>ownedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Case</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedCase()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body=' /caseOwningUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<CaseUsage> getNestedCase();

	/**
	 * Returns the value of the '<em><b>Variant Membership comp</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.VariantMembership}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedMemberships</code> of this Usage that are VariantMemberships. If <code>isVariation</code> = true, then this must be all <code>memberships</code> of the Usages. If <code>isVariation</code> = false, then <code>variantMembership</code>must be empty.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variant Membership comp</em>' containment reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_VariantMembership_comp()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningVariationUsage'"
	 * @generated
	 */
	EList<VariantMembership> getVariantMembership_comp();

	/**
	 * Returns the value of the '<em><b>Variant</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Usage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Package#getOwnedMember() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Usages which represent the variants of this Usage as a variation point Usage, if <code>isVariation</code> = true. If <code>isVariation</code> = false, the there must be no <code>variants</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variant</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_Variant()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningVariationUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Usage> getVariant();

	/**
	 * Returns the value of the '<em><b>Nested Analysis Case</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.AnalysisCaseUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedCase() <em>Nested Case</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The AnalysisCaseUsages that are <code>ownedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Analysis Case</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedAnalysisCase()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='analysisCaseOwningUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<AnalysisCaseUsage> getNestedAnalysisCase();

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Usage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getFeature() <em>Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Usages that are <code>features</code> of this Usage (not necessarily owned).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_Usage()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Usage> getUsage();

	/**
	 * Returns the value of the '<em><b>Nested Reference</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ReferenceUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage() <em>Nested Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Reference</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedReference()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='referenceOwningUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ReferenceUsage> getNestedReference();

	/**
	 * Returns the value of the '<em><b>Nested Connection</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ConnectionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedPart() <em>Nested Part</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ConnectionUsages that are <code>nestedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Connection</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedConnection()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connectionOwningUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ConnectionUsage> getNestedConnection();

	/**
	 * Returns the value of the '<em><b>Nested Item</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ItemUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage() <em>Nested Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ItemUsages that are <code>nestedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Item</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedItem()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='itemOwningUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ItemUsage> getNestedItem();

	/**
	 * Returns the value of the '<em><b>Nested Part</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.PartUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedItem() <em>Nested Item</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The PartUsages that are <code>nestedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Part</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedPart()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='partOwningUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<PartUsage> getNestedPart();

	/**
	 * Returns the value of the '<em><b>Nested Individual</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.IndividualUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedItem() <em>Nested Item</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p.The IndividualUsages that are <code>nestedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Individual</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedIndividual()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='indvidualOwningUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<IndividualUsage> getNestedIndividual();

	/**
	 * Returns the value of the '<em><b>Nested Interface</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.InterfaceUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedConnection() <em>Nested Connection</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The InterfaceUsages that are <code>ownedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Interface</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedInterface()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interfaceOwningUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<InterfaceUsage> getNestedInterface();

	/**
	 * Returns the value of the '<em><b>Nested Attribute</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.AttributeUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage() <em>Nested Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The AttributeUsages that are <code>ownedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Attribute</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedAttribute()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='attributeOwningUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<AttributeUsage> getNestedAttribute();

	/**
	 * Returns the value of the '<em><b>Nested Action</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ActionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage() <em>Nested Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ActionUsages that are <tt>ownedUsages</tt> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Action</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='actionOwningUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ActionUsage> getNestedAction();

} // Usage
