/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An AllocationDefinition is a ConnectionDefinition that specifies that some or all of the responsibility to realize the intent of the <code>source</code> is allocated to the <code>target</code> instances. Such allocations define mappings across the various structures and hierarchies of a system model, perhaps as a precursor to more rigorous specifications and implementations. An AllocationDefinition can itself be refined using nested <code>allocations</code> that give a finer-grained decomposition of the containing allocation mapping.</p>
 * 
 * <p>An AllocationDefinition must subclass, directly or indirectly, the base AllocationDefinition Allocation from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.AllocationDefinition#getAllocation <em>Allocation</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAllocationDefinition()
 * @model
 * @generated
 */
public interface AllocationDefinition extends ConnectionDefinition {
	/**
	 * Returns the value of the '<em><b>Allocation</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.AllocationUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getUsage() <em>Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ActionUsages that refine the allocation mapping defined by this AllocationDefinition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocation</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAllocationDefinition_Allocation()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringAllocationDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<AllocationUsage> getAllocation();

} // AllocationDefinition
