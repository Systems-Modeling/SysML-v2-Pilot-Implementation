/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 */
package org.omg.sysml.model.sysml.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.omg.sysml.model.sysml.Conjugation;
import org.omg.sysml.model.sysml.Differencing;
import org.omg.sysml.model.sysml.Disjoining;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.FeatureDirectionKind;
import org.omg.sysml.model.sysml.FeatureMembership;
import org.omg.sysml.model.sysml.Intersecting;
import org.omg.sysml.model.sysml.Membership;
import org.omg.sysml.model.sysml.Multiplicity;
import org.omg.sysml.model.sysml.Namespace;
import org.omg.sysml.model.sysml.Specialization;
import org.omg.sysml.model.sysml.SysMLPackage;
import org.omg.sysml.model.sysml.Type;
import org.omg.sysml.model.sysml.Unioning;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#isIsConjugated <em>Is Conjugated</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#isIsSufficient <em>Is Sufficient</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getDifferencingType <em>Differencing Type</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getDirectedFeature <em>Directed Feature</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getEndFeature <em>End Feature</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getFeatureMembership <em>Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getInheritedFeature <em>Inherited Feature</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getInheritedMembership <em>Inherited Membership</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getIntersectingType <em>Intersecting Type</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getOwnedConjugator <em>Owned Conjugator</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getOwnedDifferencing <em>Owned Differencing</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getOwnedDisjoining <em>Owned Disjoining</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getOwnedEndFeature <em>Owned End Feature</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getOwnedFeatureMembership <em>Owned Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getOwnedIntersecting <em>Owned Intersecting</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getOwnedSpecialization <em>Owned Specialization</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getOwnedUnioning <em>Owned Unioning</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TypeImpl#getUnioningType <em>Unioning Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeImpl extends NamespaceImpl implements Type {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAbstract() {
		return (Boolean)eGet(SysMLPackage.Literals.TYPE__IS_ABSTRACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAbstract(boolean newIsAbstract) {
		eSet(SysMLPackage.Literals.TYPE__IS_ABSTRACT, newIsAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsConjugated() {
		return (Boolean)eGet(SysMLPackage.Literals.TYPE__IS_CONJUGATED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsConjugated(boolean newIsConjugated) {
		eSet(SysMLPackage.Literals.TYPE__IS_CONJUGATED, newIsConjugated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSufficient() {
		return (Boolean)eGet(SysMLPackage.Literals.TYPE__IS_SUFFICIENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSufficient(boolean newIsSufficient) {
		eSet(SysMLPackage.Literals.TYPE__IS_SUFFICIENT, newIsSufficient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Type> getDifferencingType() {
		return (EList<Type>)eGet(SysMLPackage.Literals.TYPE__DIFFERENCING_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getDirectedFeature() {
		return (EList<Feature>)eGet(SysMLPackage.Literals.TYPE__DIRECTED_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getEndFeature() {
		return (EList<Feature>)eGet(SysMLPackage.Literals.TYPE__END_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getFeature() {
		return (EList<Feature>)eGet(SysMLPackage.Literals.TYPE__FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FeatureMembership> getFeatureMembership() {
		return (EList<FeatureMembership>)eGet(SysMLPackage.Literals.TYPE__FEATURE_MEMBERSHIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getInheritedFeature() {
		return (EList<Feature>)eGet(SysMLPackage.Literals.TYPE__INHERITED_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Membership> getInheritedMembership() {
		return (EList<Membership>)eGet(SysMLPackage.Literals.TYPE__INHERITED_MEMBERSHIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getInput() {
		return (EList<Feature>)eGet(SysMLPackage.Literals.TYPE__INPUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Type> getIntersectingType() {
		return (EList<Type>)eGet(SysMLPackage.Literals.TYPE__INTERSECTING_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiplicity getMultiplicity() {
		return (Multiplicity)eGet(SysMLPackage.Literals.TYPE__MULTIPLICITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplicity(Multiplicity newMultiplicity) {
		eSet(SysMLPackage.Literals.TYPE__MULTIPLICITY, newMultiplicity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getOutput() {
		return (EList<Feature>)eGet(SysMLPackage.Literals.TYPE__OUTPUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conjugation getOwnedConjugator() {
		return (Conjugation)eGet(SysMLPackage.Literals.TYPE__OWNED_CONJUGATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedConjugator(Conjugation newOwnedConjugator) {
		eSet(SysMLPackage.Literals.TYPE__OWNED_CONJUGATOR, newOwnedConjugator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Differencing> getOwnedDifferencing() {
		return (EList<Differencing>)eGet(SysMLPackage.Literals.TYPE__OWNED_DIFFERENCING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Disjoining> getOwnedDisjoining() {
		return (EList<Disjoining>)eGet(SysMLPackage.Literals.TYPE__OWNED_DISJOINING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getOwnedEndFeature() {
		return (EList<Feature>)eGet(SysMLPackage.Literals.TYPE__OWNED_END_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getOwnedFeature() {
		return (EList<Feature>)eGet(SysMLPackage.Literals.TYPE__OWNED_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FeatureMembership> getOwnedFeatureMembership() {
		return (EList<FeatureMembership>)eGet(SysMLPackage.Literals.TYPE__OWNED_FEATURE_MEMBERSHIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Intersecting> getOwnedIntersecting() {
		return (EList<Intersecting>)eGet(SysMLPackage.Literals.TYPE__OWNED_INTERSECTING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Specialization> getOwnedSpecialization() {
		return (EList<Specialization>)eGet(SysMLPackage.Literals.TYPE__OWNED_SPECIALIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Unioning> getOwnedUnioning() {
		return (EList<Unioning>)eGet(SysMLPackage.Literals.TYPE__OWNED_UNIONING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Type> getUnioningType() {
		return (EList<Type>)eGet(SysMLPackage.Literals.TYPE__UNIONING_TYPE, true);
	}

	/**
	 * The cached invocation delegate for the '{@link #allRedefinedFeaturesOf(org.omg.sysml.model.sysml.Membership) <em>All Redefined Features Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allRedefinedFeaturesOf(org.omg.sysml.model.sysml.Membership)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ALL_REDEFINED_FEATURES_OF_MEMBERSHIP__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.TYPE___ALL_REDEFINED_FEATURES_OF__MEMBERSHIP).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> allRedefinedFeaturesOf(Membership membership) {
		try {
			return (EList<Feature>)ALL_REDEFINED_FEATURES_OF_MEMBERSHIP__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{membership}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #allSupertypes() <em>All Supertypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allSupertypes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ALL_SUPERTYPES__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.TYPE___ALL_SUPERTYPES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Type> allSupertypes() {
		try {
			return (EList<Type>)ALL_SUPERTYPES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #directionOf(org.omg.sysml.model.sysml.Feature) <em>Direction Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #directionOf(org.omg.sysml.model.sysml.Feature)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DIRECTION_OF_FEATURE__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.TYPE___DIRECTION_OF__FEATURE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureDirectionKind directionOf(Feature feature) {
		try {
			return (FeatureDirectionKind)DIRECTION_OF_FEATURE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{feature}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #directionOfExcluding(org.omg.sysml.model.sysml.Feature, org.eclipse.emf.common.util.EList) <em>Direction Of Excluding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #directionOfExcluding(org.omg.sysml.model.sysml.Feature, org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DIRECTION_OF_EXCLUDING_FEATURE_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.TYPE___DIRECTION_OF_EXCLUDING__FEATURE_ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureDirectionKind directionOfExcluding(Feature feature, EList<Type> excluded) {
		try {
			return (FeatureDirectionKind)DIRECTION_OF_EXCLUDING_FEATURE_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{feature, excluded}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #inheritableMemberships(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Inheritable Memberships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #inheritableMemberships(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INHERITABLE_MEMBERSHIPS_ELIST_ELIST_BOOLEAN__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.TYPE___INHERITABLE_MEMBERSHIPS__ELIST_ELIST_BOOLEAN).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Membership> inheritableMemberships(EList<Namespace> excludedNamespaces, EList<Type> excludedTypes, boolean excludeImplied) {
		try {
			return (EList<Membership>)INHERITABLE_MEMBERSHIPS_ELIST_ELIST_BOOLEAN__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(3, new Object[]{excludedNamespaces, excludedTypes, excludeImplied}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #inheritedMemberships(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Inherited Memberships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #inheritedMemberships(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INHERITED_MEMBERSHIPS_ELIST_ELIST_BOOLEAN__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.TYPE___INHERITED_MEMBERSHIPS__ELIST_ELIST_BOOLEAN).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Membership> inheritedMemberships(EList<Namespace> excludedNamespaces, EList<Type> excludedTypes, boolean excludeImplied) {
		try {
			return (EList<Membership>)INHERITED_MEMBERSHIPS_ELIST_ELIST_BOOLEAN__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(3, new Object[]{excludedNamespaces, excludedTypes, excludeImplied}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isCompatibleWith(org.omg.sysml.model.sysml.Type) <em>Is Compatible With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompatibleWith(org.omg.sysml.model.sysml.Type)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_COMPATIBLE_WITH_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.TYPE___IS_COMPATIBLE_WITH__TYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCompatibleWith(Type otherType) {
		try {
			return (Boolean)IS_COMPATIBLE_WITH_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{otherType}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #multiplicities() <em>Multiplicities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #multiplicities()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate MULTIPLICITIES__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.TYPE___MULTIPLICITIES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Multiplicity> multiplicities() {
		try {
			return (EList<Multiplicity>)MULTIPLICITIES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #nonPrivateMemberships(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Non Private Memberships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #nonPrivateMemberships(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate NON_PRIVATE_MEMBERSHIPS_ELIST_ELIST_BOOLEAN__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.TYPE___NON_PRIVATE_MEMBERSHIPS__ELIST_ELIST_BOOLEAN).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Membership> nonPrivateMemberships(EList<Namespace> excludedNamespaces, EList<Type> excludedTypes, boolean excludeImplied) {
		try {
			return (EList<Membership>)NON_PRIVATE_MEMBERSHIPS_ELIST_ELIST_BOOLEAN__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(3, new Object[]{excludedNamespaces, excludedTypes, excludeImplied}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #removeRedefinedFeatures(org.eclipse.emf.common.util.EList) <em>Remove Redefined Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #removeRedefinedFeatures(org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate REMOVE_REDEFINED_FEATURES_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.TYPE___REMOVE_REDEFINED_FEATURES__ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Membership> removeRedefinedFeatures(EList<Membership> memberships) {
		try {
			return (EList<Membership>)REMOVE_REDEFINED_FEATURES_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{memberships}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #specializes(org.omg.sysml.model.sysml.Type) <em>Specializes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #specializes(org.omg.sysml.model.sysml.Type)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate SPECIALIZES_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.TYPE___SPECIALIZES__TYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean specializes(Type supertype) {
		try {
			return (Boolean)SPECIALIZES_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{supertype}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #specializesFromLibrary(java.lang.String) <em>Specializes From Library</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #specializesFromLibrary(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate SPECIALIZES_FROM_LIBRARY_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.TYPE___SPECIALIZES_FROM_LIBRARY__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean specializesFromLibrary(String libraryTypeName) {
		try {
			return (Boolean)SPECIALIZES_FROM_LIBRARY_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{libraryTypeName}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #supertypes(boolean) <em>Supertypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #supertypes(boolean)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate SUPERTYPES_BOOLEAN__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.TYPE___SUPERTYPES__BOOLEAN).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Type> supertypes(boolean excludeImplied) {
		try {
			return (EList<Type>)SUPERTYPES_BOOLEAN__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{excludeImplied}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.TYPE___ALL_REDEFINED_FEATURES_OF__MEMBERSHIP:
				return allRedefinedFeaturesOf((Membership)arguments.get(0));
			case SysMLPackage.TYPE___ALL_SUPERTYPES:
				return allSupertypes();
			case SysMLPackage.TYPE___DIRECTION_OF__FEATURE:
				return directionOf((Feature)arguments.get(0));
			case SysMLPackage.TYPE___DIRECTION_OF_EXCLUDING__FEATURE_ELIST:
				return directionOfExcluding((Feature)arguments.get(0), (EList<Type>)arguments.get(1));
			case SysMLPackage.TYPE___INHERITABLE_MEMBERSHIPS__ELIST_ELIST_BOOLEAN:
				return inheritableMemberships((EList<Namespace>)arguments.get(0), (EList<Type>)arguments.get(1), (Boolean)arguments.get(2));
			case SysMLPackage.TYPE___INHERITED_MEMBERSHIPS__ELIST_ELIST_BOOLEAN:
				return inheritedMemberships((EList<Namespace>)arguments.get(0), (EList<Type>)arguments.get(1), (Boolean)arguments.get(2));
			case SysMLPackage.TYPE___IS_COMPATIBLE_WITH__TYPE:
				return isCompatibleWith((Type)arguments.get(0));
			case SysMLPackage.TYPE___MULTIPLICITIES:
				return multiplicities();
			case SysMLPackage.TYPE___NON_PRIVATE_MEMBERSHIPS__ELIST_ELIST_BOOLEAN:
				return nonPrivateMemberships((EList<Namespace>)arguments.get(0), (EList<Type>)arguments.get(1), (Boolean)arguments.get(2));
			case SysMLPackage.TYPE___REMOVE_REDEFINED_FEATURES__ELIST:
				return removeRedefinedFeatures((EList<Membership>)arguments.get(0));
			case SysMLPackage.TYPE___SPECIALIZES__TYPE:
				return specializes((Type)arguments.get(0));
			case SysMLPackage.TYPE___SPECIALIZES_FROM_LIBRARY__STRING:
				return specializesFromLibrary((String)arguments.get(0));
			case SysMLPackage.TYPE___SUPERTYPES__BOOLEAN:
				return supertypes((Boolean)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TypeImpl
