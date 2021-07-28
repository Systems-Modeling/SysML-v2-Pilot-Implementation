/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
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
import org.omg.sysml.util.NonNotifyingEObjectEList;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getFeatureMembership <em>Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getInheritedFeature <em>Inherited Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getDisjointType <em>Disjoint Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getDirectedFeature <em>Directed Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getOwnedDisjoining <em>Owned Disjoining</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getOwnedSpecialization <em>Owned Specialization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeImpl extends NamespaceImpl implements Type {
	
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
	 * The default value of the '{@link #isConjugated() <em>Is Conjugated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConjugated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONJUGATED_EDEFAULT = false;
	
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
	 * @generated NOT
	 */
	@Override
	public EList<Specialization> getOwnedSpecialization() {
		EList<Specialization> generalizations = new NonNotifyingEObjectEList<>(Specialization.class, this, SysMLPackage.TYPE__OWNED_SPECIALIZATION);
		getOwnedRelationship().stream().
			filter(Specialization.class::isInstance).
			map(Specialization.class::cast).
			filter(gen->gen.getSpecific() == this).
			forEachOrdered(generalizations::add);
		return generalizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<FeatureMembership> getOwnedFeatureMembership() {
		return new DerivedEObjectEList<FeatureMembership>(FeatureMembership.class, this, SysMLPackage.TYPE__OWNED_FEATURE_MEMBERSHIP, new int[] {SysMLPackage.ELEMENT__OWNED_RELATIONSHIP});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feature> getOwnedFeature() {
		return new DerivedEObjectEList<Feature>(
				Feature.class, this, SysMLPackage.TYPE__OWNED_FEATURE, 
				new int[]{SysMLPackage.NAMESPACE__OWNED_MEMBER});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feature> getFeature() {
		return new DerivedEObjectEList<Feature>(
				Feature.class, this, SysMLPackage.TYPE__FEATURE, 
				new int[]{SysMLPackage.NAMESPACE__MEMBER});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feature> getInput() {
		EList<Feature> inputs = new NonNotifyingEObjectEList<>(Feature.class, this, SysMLPackage.TYPE__INPUT);
		Conjugation conjugator = getOwnedConjugator();
		if (conjugator != null) {
			inputs.addAll(conjugator.getOriginalType().getOutput());
		} else {
			getFeature().stream().
				filter(feature->
					FeatureDirectionKind.IN.equals(feature.getDirection()) || 
					FeatureDirectionKind.INOUT.equals(feature.getDirection())).
				forEachOrdered(inputs::add);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feature> getOutput() {
		EList<Feature> outputs = new NonNotifyingEObjectEList<>(Feature.class, this, SysMLPackage.TYPE__OUTPUT);
		Conjugation conjugator = getOwnedConjugator();
		if (conjugator != null) {
			outputs.addAll(conjugator.getOriginalType().getInput());
		} else {
			getFeature().stream().
			filter(feature->
				FeatureDirectionKind.OUT.equals(feature.getDirection()) || 
				FeatureDirectionKind.INOUT.equals(feature.getDirection())).
			forEachOrdered(outputs::add);
		}
		return outputs;
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
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getEndFeature() {
		EList<Feature> endFeatures = new NonNotifyingEObjectEList<>(Feature.class, this, SysMLPackage.TYPE__END_FEATURE);
		getFeature().stream().filter(f->f.isEnd()).forEachOrdered(endFeatures::add);
		return endFeatures;
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
		Conjugation ownedConjugator = basicGetOwnedConjugator();
		return ownedConjugator != null && ownedConjugator.eIsProxy() ? (Conjugation)eResolveProxy((InternalEObject)ownedConjugator) : ownedConjugator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Conjugation basicGetOwnedConjugator() {
		return (Conjugation) getOwnedRelationship().stream().
				filter(Conjugation.class::isInstance).
				findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwnedConjugator(Conjugation newOwnedConjugator) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isConjugated() {
		return getOwnedConjugator() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setIsConjugated(boolean newIsConjugated) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<FeatureMembership> getFeatureMembership() {
		EList<FeatureMembership> featureMemberships = new NonNotifyingEObjectEList<>(FeatureMembership.class, this, SysMLPackage.TYPE__FEATURE_MEMBERSHIP);
		getMembership().stream().
			filter(m->m instanceof FeatureMembership).
			map(m->(FeatureMembership)m).
			forEachOrdered(featureMemberships::add);
		return featureMemberships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getInheritedFeature() {
		EList<Feature> features = new NonNotifyingEObjectEList<>(Feature.class, this, SysMLPackage.TYPE__INHERITED_FEATURE);
		getInheritedMembership().stream().
			filter(m->m instanceof FeatureMembership).
			map(m->((FeatureMembership)m).getMemberFeature()).
			filter(f->f != null).
			forEachOrdered(features::add);
		return features;
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
	 * @generated NOT
	 */
	@Override
	public EList<Type> getDisjointType() {
		EList<Type> disjointTypes = new NonNotifyingEObjectEList<>(Type.class, this, SysMLPackage.TYPE__DISJOINT_TYPE);
		getOwnedDisjoining().stream().
			map(Disjoining::getDisjoiningType).
			filter(t->t != null).
			forEachOrdered(disjointTypes::add);
		return disjointTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getDirectedFeature() {
		EList<Feature> directedFeatures = new NonNotifyingEObjectEList<>(Feature.class, this, SysMLPackage.TYPE__DIRECTED_FEATURE);
		getFeature().stream().
			filter(f->f.getDirection() != null).
			forEachOrdered(directedFeatures::add);
		return directedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Disjoining> getOwnedDisjoining() {
		EList<Disjoining> disjoinings = new NonNotifyingEObjectEList<>(Disjoining.class, this, SysMLPackage.TYPE__OWNED_DISJOINING);
		getOwnedRelationship().stream().
			filter(Disjoining.class::isInstance).
			map(Disjoining.class::cast).
			filter(gen->gen.getTypeDisjoined() == this).
			forEachOrdered(disjoinings::add);
		return disjoinings;
	}

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
	 * The array of superset feature identifiers for the '{@link #getOwnedSpecialization() <em>Owned Specialization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSpecialization()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_SPECIALIZATION_ESUPERSETS = new int[] {SysMLPackage.TYPE__OWNED_RELATIONSHIP};

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
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getOwnedEndFeature() {
		EList<Feature> features = new NonNotifyingEObjectEList<>(Feature.class, this, SysMLPackage.TYPE__END_FEATURE);
		getOwnedFeature().stream().filter(f->f.isEnd()).forEachOrdered(features::add);
		return features;
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
			case SysMLPackage.TYPE__FEATURE_MEMBERSHIP:
				return getFeatureMembership();
			case SysMLPackage.TYPE__INHERITED_FEATURE:
				return getInheritedFeature();
			case SysMLPackage.TYPE__MULTIPLICITY:
				if (resolve) return getMultiplicity();
				return basicGetMultiplicity();
			case SysMLPackage.TYPE__DISJOINT_TYPE:
				return getDisjointType();
			case SysMLPackage.TYPE__DIRECTED_FEATURE:
				return getDirectedFeature();
			case SysMLPackage.TYPE__OWNED_DISJOINING:
				return getOwnedDisjoining();
			case SysMLPackage.TYPE__OWNED_SPECIALIZATION:
				return getOwnedSpecialization();
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
			case SysMLPackage.TYPE__FEATURE_MEMBERSHIP:
				getFeatureMembership().clear();
				getFeatureMembership().addAll((Collection<? extends FeatureMembership>)newValue);
				return;
			case SysMLPackage.TYPE__INHERITED_FEATURE:
				getInheritedFeature().clear();
				getInheritedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.TYPE__MULTIPLICITY:
				setMultiplicity((Multiplicity)newValue);
				return;
			case SysMLPackage.TYPE__DISJOINT_TYPE:
				getDisjointType().clear();
				getDisjointType().addAll((Collection<? extends Type>)newValue);
				return;
			case SysMLPackage.TYPE__DIRECTED_FEATURE:
				getDirectedFeature().clear();
				getDirectedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.TYPE__OWNED_DISJOINING:
				getOwnedDisjoining().clear();
				getOwnedDisjoining().addAll((Collection<? extends Disjoining>)newValue);
				return;
			case SysMLPackage.TYPE__OWNED_SPECIALIZATION:
				getOwnedSpecialization().clear();
				getOwnedSpecialization().addAll((Collection<? extends Specialization>)newValue);
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
				setIsConjugated(IS_CONJUGATED_EDEFAULT);
				return;
			case SysMLPackage.TYPE__FEATURE_MEMBERSHIP:
				getFeatureMembership().clear();
				return;
			case SysMLPackage.TYPE__INHERITED_FEATURE:
				getInheritedFeature().clear();
				return;
			case SysMLPackage.TYPE__MULTIPLICITY:
				setMultiplicity((Multiplicity)null);
				return;
			case SysMLPackage.TYPE__DISJOINT_TYPE:
				getDisjointType().clear();
				return;
			case SysMLPackage.TYPE__DIRECTED_FEATURE:
				getDirectedFeature().clear();
				return;
			case SysMLPackage.TYPE__OWNED_DISJOINING:
				getOwnedDisjoining().clear();
				return;
			case SysMLPackage.TYPE__OWNED_SPECIALIZATION:
				getOwnedSpecialization().clear();
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
			case SysMLPackage.TYPE__OWNED_FEATURE_MEMBERSHIP:
				return !getOwnedFeatureMembership().isEmpty();
			case SysMLPackage.TYPE__OWNED_FEATURE:
				return !getOwnedFeature().isEmpty();
			case SysMLPackage.TYPE__OWNED_END_FEATURE:
				return !getOwnedEndFeature().isEmpty();
			case SysMLPackage.TYPE__FEATURE:
				return !getFeature().isEmpty();
			case SysMLPackage.TYPE__INPUT:
				return !getInput().isEmpty();
			case SysMLPackage.TYPE__OUTPUT:
				return !getOutput().isEmpty();
			case SysMLPackage.TYPE__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case SysMLPackage.TYPE__INHERITED_MEMBERSHIP:
				return !getInheritedMembership().isEmpty();
			case SysMLPackage.TYPE__END_FEATURE:
				return !getEndFeature().isEmpty();
			case SysMLPackage.TYPE__IS_SUFFICIENT:
				return isSufficient != IS_SUFFICIENT_EDEFAULT;
			case SysMLPackage.TYPE__OWNED_CONJUGATOR:
				return basicGetOwnedConjugator() != null;
			case SysMLPackage.TYPE__IS_CONJUGATED:
				return isConjugated() != IS_CONJUGATED_EDEFAULT;
			case SysMLPackage.TYPE__FEATURE_MEMBERSHIP:
				return !getFeatureMembership().isEmpty();
			case SysMLPackage.TYPE__INHERITED_FEATURE:
				return !getInheritedFeature().isEmpty();
			case SysMLPackage.TYPE__MULTIPLICITY:
				return basicGetMultiplicity() != null;
			case SysMLPackage.TYPE__DISJOINT_TYPE:
				return !getDisjointType().isEmpty();
			case SysMLPackage.TYPE__DIRECTED_FEATURE:
				return !getDirectedFeature().isEmpty();
			case SysMLPackage.TYPE__OWNED_DISJOINING:
				return !getOwnedDisjoining().isEmpty();
			case SysMLPackage.TYPE__OWNED_SPECIALIZATION:
				return !getOwnedSpecialization().isEmpty();
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
