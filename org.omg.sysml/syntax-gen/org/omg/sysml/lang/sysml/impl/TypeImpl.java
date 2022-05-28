/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2022 Model Driven Solutions, Inc.
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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Disjoining;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getMembership <em>Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getOwnedRelationship <em>Owned Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getOwnedSpecialization <em>Owned Specialization</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getOwnedFeatureMembership <em>Owned Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getOwnedEndFeature <em>Owned End Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#isAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getInheritedMembership <em>Inherited Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getEndFeature <em>End Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#isSufficient <em>Is Sufficient</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getOwnedConjugator <em>Owned Conjugator</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#isConjugated <em>Is Conjugated</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getInheritedFeature <em>Inherited Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getDirectedFeature <em>Directed Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getOwnedDisjoining <em>Owned Disjoining</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getFeatureMembership <em>Feature Membership</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeImpl extends NamespaceImpl implements Type {
	
	/**
	 * The cached setting delegate for the '{@link #getOwnedSpecialization() <em>Owned Specialization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSpecialization()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_SPECIALIZATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TYPE__OWNED_SPECIALIZATION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOwnedFeatureMembership() <em>Owned Feature Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatureMembership()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_FEATURE_MEMBERSHIP__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TYPE__OWNED_FEATURE_MEMBERSHIP).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOwnedFeature() <em>Owned Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TYPE__OWNED_FEATURE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOwnedEndFeature() <em>Owned End Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEndFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_END_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TYPE__OWNED_END_FEATURE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getFeature() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TYPE__FEATURE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate INPUT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TYPE__INPUT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOutput() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OUTPUT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TYPE__OUTPUT).getSettingDelegate();

	/**
	 * The default value of the '{@link #isAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getEndFeature() <em>End Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate END_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TYPE__END_FEATURE).getSettingDelegate();

	/**
	 * The default value of the '{@link #isSufficient() <em>Is Sufficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSufficient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUFFICIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSufficient() <em>Is Sufficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSufficient()
	 * @generated
	 * @ordered
	 */
	protected boolean isSufficient = IS_SUFFICIENT_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getOwnedConjugator() <em>Owned Conjugator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConjugator()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_CONJUGATOR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TYPE__OWNED_CONJUGATOR).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isConjugated() <em>Is Conjugated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConjugated()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_CONJUGATED__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TYPE__IS_CONJUGATED).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getInheritedFeature() <em>Inherited Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate INHERITED_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TYPE__INHERITED_FEATURE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getDirectedFeature() <em>Directed Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectedFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate DIRECTED_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TYPE__DIRECTED_FEATURE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOwnedDisjoining() <em>Owned Disjoining</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDisjoining()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_DISJOINING__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TYPE__OWNED_DISJOINING).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getFeatureMembership() <em>Feature Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureMembership()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate FEATURE_MEMBERSHIP__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TYPE__FEATURE_MEMBERSHIP).getSettingDelegate();

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
	public EList<Membership> getMembership() {
		return new DerivedUnionEObjectEList<Membership>(Membership.class, this, SysMLPackage.TYPE__MEMBERSHIP, MEMBERSHIP_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getMembership() <em>Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembership()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEMBERSHIP_ESUBSETS = new int[] {SysMLPackage.TYPE__IMPORTED_MEMBERSHIP, SysMLPackage.TYPE__OWNED_MEMBERSHIP, SysMLPackage.TYPE__INHERITED_MEMBERSHIP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getOwnedRelationship() {
		if (ownedRelationship == null) {
			ownedRelationship = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, SysMLPackage.TYPE__OWNED_RELATIONSHIP, SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT);
		}
		return ownedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Specialization> getOwnedSpecialization() {
		return (EList<Specialization>)OWNED_SPECIALIZATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FeatureMembership> getOwnedFeatureMembership() {
		return (EList<FeatureMembership>)OWNED_FEATURE_MEMBERSHIP__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public EList<Feature> getOwnedFeature() {
		return (EList<Feature>)OWNED_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public EList<Feature> getFeature() {
		return (EList<Feature>)FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public EList<Feature> getInput() {
		return (EList<Feature>)INPUT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public EList<Feature> getOutput() {
		return (EList<Feature>)OUTPUT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.TYPE__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Membership> getInheritedMembership() {
		return TypeUtil.cacheInheritedMembershipOf(this, ()->inheritedMemberships(new BasicEList<>()));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getEndFeature() {
		return (EList<Feature>)END_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSufficient() {
		return isSufficient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSufficient(boolean newIsSufficient) {
		boolean oldIsSufficient = isSufficient;
		isSufficient = newIsSufficient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.TYPE__IS_SUFFICIENT, oldIsSufficient, isSufficient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conjugation getOwnedConjugator() {
		return (Conjugation)OWNED_CONJUGATOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conjugation basicGetOwnedConjugator() {
		return (Conjugation)OWNED_CONJUGATOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedConjugator(Conjugation newOwnedConjugator) {
		OWNED_CONJUGATOR__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwnedConjugator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConjugated() {
		return (Boolean)IS_CONJUGATED__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsConjugated(boolean newIsConjugated) {
		IS_CONJUGATED__ESETTING_DELEGATE.dynamicSet(this, null, 0, newIsConjugated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FeatureMembership> getFeatureMembership() {
		return (EList<FeatureMembership>)FEATURE_MEMBERSHIP__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getInheritedFeature() {
		return (EList<Feature>)INHERITED_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiplicity getMultiplicity() {
		Multiplicity multiplicity = basicGetMultiplicity();
		return multiplicity != null && multiplicity.eIsProxy() ? (Multiplicity)eResolveProxy((InternalEObject)multiplicity) : multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Multiplicity basicGetMultiplicity() {
		return getMultiplicity(new HashSet<Type>());	
	}
	
	protected Multiplicity getMultiplicity(Set<Type> visited) {
		Multiplicity multiplicity = (Multiplicity)getOwnedMembership().stream().
				map(Membership::getMemberElement).
				filter(Multiplicity.class::isInstance).
				findFirst().orElse(null);
		if (multiplicity == null) {
			visited.add(this);
			List<Type> superTypes = TypeUtil.getSupertypesOf(this);
			if (!superTypes.isEmpty()) {
				Type general = TypeUtil.getSupertypesOf(this).get(0);
				if (general != null && !visited.contains(general)) { 
					multiplicity = ((TypeImpl)general).getMultiplicity(visited);
				}
			}
		}
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setMultiplicity(Multiplicity newMultiplicity) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getDirectedFeature() {
		return (EList<Feature>)DIRECTED_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Disjoining> getOwnedDisjoining() {
		return (EList<Disjoining>)OWNED_DISJOINING__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedSpecialization() <em>Owned Specialization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSpecialization()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_SPECIALIZATION_ESUPERSETS = new int[] {SysMLPackage.TYPE__OWNED_RELATIONSHIP};

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedDisjoining() <em>Owned Disjoining</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDisjoining()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_DISJOINING_ESUPERSETS = new int[] {SysMLPackage.TYPE__OWNED_RELATIONSHIP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Membership> inheritedMemberships(EList<Type> excluded) {
		return getInheritedMembership(new HashSet<Namespace>(), new HashSet<>(excluded), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getOwnedEndFeature() {
		return (EList<Feature>)OWNED_END_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	public EList<Membership> getInheritedMembership(Collection<Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeProtected) {
		EList<Membership> inheritedMemberships = new BasicInternalEList<Membership>(Membership.class);
		addInheritedMemberships(inheritedMemberships, excludedNamespaces, excludedTypes, includeProtected);
		removeRedefinedFeatures(inheritedMemberships);
		return inheritedMemberships;
	}
	
	protected void addInheritedMemberships(EList<Membership> inheritedMemberships, Collection<Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeProtected) {
		excludedTypes.add(this);
		Conjugation conjugator = this.getOwnedConjugator();
		if (conjugator != null) {
			Type originalType = conjugator.getOriginalType();
			if (originalType != null && !excludedTypes.contains(originalType)) {
				inheritedMemberships.addAll(((TypeImpl)originalType).getMembership(excludedNamespaces, excludedTypes, includeProtected));
			}
		}
		for (Type general: TypeUtil.getSupertypesOf(this)) {
			if (general != null && !excludedTypes.contains(general)) {
				inheritedMemberships.addAll(((TypeImpl)general).getNonPrivateMembership(excludedNamespaces, excludedTypes, includeProtected));
			}
		}
	}
	
	protected void removeRedefinedFeatures(Collection<Membership> memberships) {
		Collection<Feature> redefinedFeatures = getFeaturesRedefinedByType();
		memberships.removeIf(membership->{
			Element memberElement = membership.getMemberElement();
			return memberElement instanceof Feature &&
				   FeatureUtil.getAllRedefinedFeaturesOf((Feature)memberElement).stream().
				   		anyMatch(redefinedFeatures::contains);
		});		
	}
	
	public Collection<Feature> getFeaturesRedefinedByType() {
		return getOwnedFeature().stream().
				flatMap(feature->FeatureUtil.getAllRedefinedFeaturesOf(feature).stream()).
				collect(Collectors.toSet());
	}
	
	public EList<Membership> getMembership(Collection<Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeProtected) {
		EList<Membership> membership = new BasicInternalEList<>(Membership.class);
		membership.addAll(getOwnedMembership());
		membership.addAll(getInheritedMembership(excludedNamespaces, excludedTypes, includeProtected));
		membership.addAll(getImportedMembership(excludedNamespaces, excludedTypes, false));
		return membership;
	}	
	
	public EList<Membership> getNonPrivateMembership(Collection<Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeProtected) {
		EList<Membership> nonPrivateMembership = super.getVisibleMembership(excludedNamespaces, excludedTypes, false);
		if (includeProtected) {
			nonPrivateMembership.addAll(getVisibleOwnedMembership(VisibilityKind.PROTECTED));
		}
		nonPrivateMembership.addAll(getInheritedMembership(excludedNamespaces, excludedTypes, includeProtected));
		return nonPrivateMembership;
	}
	
	@Override
	public EList<Membership> getVisibleMembership(Collection<Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeAll) {
		EList<Membership> visibleMembership = super.getVisibleMembership(excludedNamespaces, excludedTypes, includeAll);
		visibleMembership.addAll(getInheritedMembership(excludedNamespaces, excludedTypes, includeAll));
		return visibleMembership;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMembership() {
		return super.isSetMembership()
			|| eIsSet(SysMLPackage.TYPE__INHERITED_MEMBERSHIP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FeatureDirectionKind directionOf(Feature feature) {
		boolean isInput = getInput().contains(feature);
		boolean isOutput = getOutput().contains(feature);
		return isInput && isOutput? FeatureDirectionKind.INOUT:
			   isInput? FeatureDirectionKind.IN:
			   isOutput? FeatureDirectionKind.OUT:
			   null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Type> allSupertypes() {
		return getAllSuperTypes(new HashSet<>());
	}
	
	// Note: Generalizations are allowed to be cyclic.
	protected EList<Type> getAllSuperTypes(Set<Type> visited) {
		if (isConjugated()) {
			Type originalType = getOwnedConjugator().getOriginalType();
			return ((TypeImpl)originalType).getAllSuperTypes(visited);
		} else {
			EList<Type> superTypes = new BasicEList<>();
			TypeUtil.getSupertypesOf(this).stream().
				forEachOrdered(superType->{
					if (superType != null && !visited.contains(superType)) {
						visited.add(superType);
						superTypes.add(superType);
						superTypes.addAll(((TypeImpl)superType).getAllSuperTypes(visited));
					}
				});
			return superTypes;
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.TYPE__OWNED_RELATIONSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelationship()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.TYPE__OWNED_RELATIONSHIP:
				return ((InternalEList<?>)getOwnedRelationship()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.TYPE__OWNED_SPECIALIZATION:
				return getOwnedSpecialization();
			case SysMLPackage.TYPE__OWNED_FEATURE_MEMBERSHIP:
				return getOwnedFeatureMembership();
			case SysMLPackage.TYPE__OWNED_FEATURE:
				return getOwnedFeature();
			case SysMLPackage.TYPE__OWNED_END_FEATURE:
				return getOwnedEndFeature();
			case SysMLPackage.TYPE__FEATURE:
				return getFeature();
			case SysMLPackage.TYPE__INPUT:
				return getInput();
			case SysMLPackage.TYPE__OUTPUT:
				return getOutput();
			case SysMLPackage.TYPE__IS_ABSTRACT:
				return isAbstract();
			case SysMLPackage.TYPE__INHERITED_MEMBERSHIP:
				return getInheritedMembership();
			case SysMLPackage.TYPE__END_FEATURE:
				return getEndFeature();
			case SysMLPackage.TYPE__IS_SUFFICIENT:
				return isSufficient();
			case SysMLPackage.TYPE__OWNED_CONJUGATOR:
				if (resolve) return getOwnedConjugator();
				return basicGetOwnedConjugator();
			case SysMLPackage.TYPE__IS_CONJUGATED:
				return isConjugated();
			case SysMLPackage.TYPE__INHERITED_FEATURE:
				return getInheritedFeature();
			case SysMLPackage.TYPE__MULTIPLICITY:
				if (resolve) return getMultiplicity();
				return basicGetMultiplicity();
			case SysMLPackage.TYPE__DIRECTED_FEATURE:
				return getDirectedFeature();
			case SysMLPackage.TYPE__OWNED_DISJOINING:
				return getOwnedDisjoining();
			case SysMLPackage.TYPE__FEATURE_MEMBERSHIP:
				return getFeatureMembership();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.TYPE__OWNED_SPECIALIZATION:
				getOwnedSpecialization().clear();
				getOwnedSpecialization().addAll((Collection<? extends Specialization>)newValue);
				return;
			case SysMLPackage.TYPE__OWNED_FEATURE_MEMBERSHIP:
				getOwnedFeatureMembership().clear();
				getOwnedFeatureMembership().addAll((Collection<? extends FeatureMembership>)newValue);
				return;
			case SysMLPackage.TYPE__OWNED_FEATURE:
				getOwnedFeature().clear();
				getOwnedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.TYPE__OWNED_END_FEATURE:
				getOwnedEndFeature().clear();
				getOwnedEndFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.TYPE__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.TYPE__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.TYPE__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.TYPE__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case SysMLPackage.TYPE__INHERITED_MEMBERSHIP:
				getInheritedMembership().clear();
				getInheritedMembership().addAll((Collection<? extends Membership>)newValue);
				return;
			case SysMLPackage.TYPE__END_FEATURE:
				getEndFeature().clear();
				getEndFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.TYPE__IS_SUFFICIENT:
				setIsSufficient((Boolean)newValue);
				return;
			case SysMLPackage.TYPE__OWNED_CONJUGATOR:
				setOwnedConjugator((Conjugation)newValue);
				return;
			case SysMLPackage.TYPE__IS_CONJUGATED:
				setIsConjugated((Boolean)newValue);
				return;
			case SysMLPackage.TYPE__INHERITED_FEATURE:
				getInheritedFeature().clear();
				getInheritedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.TYPE__MULTIPLICITY:
				setMultiplicity((Multiplicity)newValue);
				return;
			case SysMLPackage.TYPE__DIRECTED_FEATURE:
				getDirectedFeature().clear();
				getDirectedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.TYPE__OWNED_DISJOINING:
				getOwnedDisjoining().clear();
				getOwnedDisjoining().addAll((Collection<? extends Disjoining>)newValue);
				return;
			case SysMLPackage.TYPE__FEATURE_MEMBERSHIP:
				getFeatureMembership().clear();
				getFeatureMembership().addAll((Collection<? extends FeatureMembership>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.TYPE__OWNED_SPECIALIZATION:
				getOwnedSpecialization().clear();
				return;
			case SysMLPackage.TYPE__OWNED_FEATURE_MEMBERSHIP:
				getOwnedFeatureMembership().clear();
				return;
			case SysMLPackage.TYPE__OWNED_FEATURE:
				getOwnedFeature().clear();
				return;
			case SysMLPackage.TYPE__OWNED_END_FEATURE:
				getOwnedEndFeature().clear();
				return;
			case SysMLPackage.TYPE__FEATURE:
				getFeature().clear();
				return;
			case SysMLPackage.TYPE__INPUT:
				getInput().clear();
				return;
			case SysMLPackage.TYPE__OUTPUT:
				getOutput().clear();
				return;
			case SysMLPackage.TYPE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case SysMLPackage.TYPE__INHERITED_MEMBERSHIP:
				getInheritedMembership().clear();
				return;
			case SysMLPackage.TYPE__END_FEATURE:
				getEndFeature().clear();
				return;
			case SysMLPackage.TYPE__IS_SUFFICIENT:
				setIsSufficient(IS_SUFFICIENT_EDEFAULT);
				return;
			case SysMLPackage.TYPE__OWNED_CONJUGATOR:
				setOwnedConjugator((Conjugation)null);
				return;
			case SysMLPackage.TYPE__IS_CONJUGATED:
				IS_CONJUGATED__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case SysMLPackage.TYPE__INHERITED_FEATURE:
				getInheritedFeature().clear();
				return;
			case SysMLPackage.TYPE__MULTIPLICITY:
				setMultiplicity((Multiplicity)null);
				return;
			case SysMLPackage.TYPE__DIRECTED_FEATURE:
				getDirectedFeature().clear();
				return;
			case SysMLPackage.TYPE__OWNED_DISJOINING:
				getOwnedDisjoining().clear();
				return;
			case SysMLPackage.TYPE__FEATURE_MEMBERSHIP:
				getFeatureMembership().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.TYPE__MEMBERSHIP:
				return isSetMembership();
			case SysMLPackage.TYPE__OWNED_RELATIONSHIP:
				return ownedRelationship != null && !ownedRelationship.isEmpty();
			case SysMLPackage.TYPE__OWNED_SPECIALIZATION:
				return OWNED_SPECIALIZATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.TYPE__OWNED_FEATURE_MEMBERSHIP:
				return OWNED_FEATURE_MEMBERSHIP__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.TYPE__OWNED_FEATURE:
				return OWNED_FEATURE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.TYPE__OWNED_END_FEATURE:
				return OWNED_END_FEATURE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.TYPE__FEATURE:
				return FEATURE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.TYPE__INPUT:
				return INPUT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.TYPE__OUTPUT:
				return OUTPUT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.TYPE__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case SysMLPackage.TYPE__INHERITED_MEMBERSHIP:
				return !getInheritedMembership().isEmpty();
			case SysMLPackage.TYPE__END_FEATURE:
				return END_FEATURE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.TYPE__IS_SUFFICIENT:
				return isSufficient != IS_SUFFICIENT_EDEFAULT;
			case SysMLPackage.TYPE__OWNED_CONJUGATOR:
				return OWNED_CONJUGATOR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.TYPE__IS_CONJUGATED:
				return IS_CONJUGATED__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.TYPE__INHERITED_FEATURE:
				return INHERITED_FEATURE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.TYPE__MULTIPLICITY:
				return basicGetMultiplicity() != null;
			case SysMLPackage.TYPE__DIRECTED_FEATURE:
				return DIRECTED_FEATURE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.TYPE__OWNED_DISJOINING:
				return OWNED_DISJOINING__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.TYPE__FEATURE_MEMBERSHIP:
				return FEATURE_MEMBERSHIP__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
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
			case SysMLPackage.TYPE___INHERITED_MEMBERSHIPS__ELIST:
				return inheritedMemberships((EList<Type>)arguments.get(0));
			case SysMLPackage.TYPE___DIRECTION_OF__FEATURE:
				return directionOf((Feature)arguments.get(0));
			case SysMLPackage.TYPE___ALL_SUPERTYPES:
				return allSupertypes();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", isSufficient: ");
		result.append(isSufficient);
		result.append(')');
		return result.toString();
	}

} //TypeImpl
