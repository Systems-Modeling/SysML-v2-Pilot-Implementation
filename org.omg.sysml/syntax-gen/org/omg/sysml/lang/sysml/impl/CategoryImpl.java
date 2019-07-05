/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getMembership <em>Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getOwnedRelationship <em>Owned Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getOwnedGeneralization <em>Owned Generalization</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getOwnedFeatureMembership <em>Owned Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#isAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getInheritedMembership <em>Inherited Membership</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryImpl extends PackageImpl implements Category {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Membership> getMembership() {
		return new DerivedUnionEObjectEList<Membership>(Membership.class, this, SysMLPackage.CATEGORY__MEMBERSHIP, MEMBERSHIP_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getMembership() <em>Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembership()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEMBERSHIP_ESUBSETS = new int[] {SysMLPackage.CATEGORY__OWNED_MEMBERSHIP, SysMLPackage.CATEGORY__IMPORTED_MEMBERSHIP, SysMLPackage.CATEGORY__INHERITED_MEMBERSHIP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getOwnedRelationship() {
		if (ownedRelationship == null) {
			ownedRelationship = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, SysMLPackage.CATEGORY__OWNED_RELATIONSHIP, SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT);
		}
		return ownedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Generalization> getOwnedGeneralization() {
		EList<Generalization> generalizations = new EObjectEList<Generalization>(Generalization.class, this, SysMLPackage.CATEGORY__OWNED_GENERALIZATION);
		for (Relationship relationship: this.getOwnedRelationship()) {
			if (relationship instanceof Generalization &&
					this.equals(((Generalization)relationship).getSpecific())) {
				generalizations.add(((Generalization)relationship));
			}
		}
		return generalizations;
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedGeneralization() <em>Owned Generalization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGeneralization()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_GENERALIZATION_ESUPERSETS = new int[] {SysMLPackage.CATEGORY__OWNED_RELATIONSHIP};

	@SuppressWarnings("unchecked")
	protected <T extends Generalization> EList<T> getOwnedGeneralizationWithoutDefault(Class<T> kind, int featureID) {
		EList<T> generalizations = new EObjectEList<T>(kind, this, featureID);
		for (Generalization generalization: getOwnedGeneralization()) {
			if (kind.isInstance(generalization)) {
				generalizations.add((T)generalization);
			}
		}
		return generalizations;
	}
	
	@SuppressWarnings("unchecked")
	protected <T extends Generalization> EList<T> getOwnedGeneralizationWithDefault(Class<T> kind, int featureID, EClass eClass, String... defaultNames) {
		EList<T> generalizations = getOwnedGeneralizationWithoutDefault(kind, featureID);
		Generalization generalization = getDefaultGeneralization(generalizations, eClass);
		if (generalization != null) {
			Category general = getDefaultCategory(defaultNames);
			if (general != null) {
				generalization.setGeneral(general);
				generalizations.add((T)generalization);
				getOwnedRelationship().add(generalization);
			}
		}
		return generalizations;
	}
	
	protected Category getDefaultCategory(String... defaultNames) {
		for (String defaultName: defaultNames) {
			EObject element = SysMLLibraryUtil.getLibraryElement(
					this, SysMLPackage.eINSTANCE.getGeneralization_General(), defaultName);
			if (element instanceof Category) {
				return (Category)element;
			}
		}
		return null;
	}
	
	private <T extends Generalization> Generalization getDefaultGeneralization(EList<T> generalizations, EClass eClass) {
		Generalization generalization = null;
		if (generalizations.isEmpty()) {
			generalization = (Generalization) SysMLFactory.eINSTANCE.create(eClass);
			generalization.setSpecific(this);
		} else {
			generalization = generalizations.stream().
					filter(s->((GeneralizationImpl)s).basicGetGeneral() == null).
					findFirst().orElse(null);
		}
		return generalization;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<FeatureMembership> getOwnedFeatureMembership() {
		EList<FeatureMembership> featureMemberships = new EObjectEList<FeatureMembership>(FeatureMembership.class, this, SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP);
		for (Membership membership: this.getOwnedMembership()) {
			if (membership instanceof FeatureMembership) {
				featureMemberships.add(((FeatureMembership)membership));
			}
		}
		return featureMemberships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feature> getOwnedFeature() {
		return new DerivedEObjectEList<Feature>(
				Feature.class, this, SysMLPackage.CATEGORY__OWNED_FEATURE, 
				new int[]{SysMLPackage.PACKAGE__OWNED_MEMBER});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feature> getFeature() {
		return new DerivedEObjectEList<Feature>(
				Feature.class, this, SysMLPackage.CATEGORY__FEATURE, 
				new int[]{SysMLPackage.PACKAGE__MEMBER});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feature> getInput() {
		EList<Feature> inputs = new EObjectEList<Feature>(Feature.class, this, SysMLPackage.CATEGORY__INPUT);
		for (Membership membership: this.getMembership()) {
			if (membership instanceof FeatureMembership) {
				FeatureMembership featureMembership = (FeatureMembership)membership;
				FeatureDirectionKind direction = featureMembership.getDirection();
				if (FeatureDirectionKind.IN.equals(direction) || 
						FeatureDirectionKind.INOUT.equals(direction)) {
					Feature feature = featureMembership.getMemberFeature();
					if (feature != null) {
						inputs.add(feature);
					}
				}
			}
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feature> getOutput() {
		EList<Feature> outputs = new EObjectEList<Feature>(Feature.class, this, SysMLPackage.CATEGORY__OUTPUT);
		for (Membership membership: this.getMembership()) {
			if (membership instanceof FeatureMembership) {
				FeatureMembership featureMembership = (FeatureMembership)membership;
				FeatureDirectionKind direction = featureMembership.getDirection();
				if (FeatureDirectionKind.OUT.equals(direction) || 
						FeatureDirectionKind.INOUT.equals(direction)) {
					Feature feature = featureMembership.getMemberFeature();
					if (feature != null) {
						outputs.add(feature);
					}
				}
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CATEGORY__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}
	
	private EList<Membership> inheritedMembership = null;
	
	@Override
	public void clearCaches() {
		super.clearCaches();
		inheritedMembership = null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Membership> getInheritedMembership() {
		if (inheritedMembership == null) {
			inheritedMembership = getInheritedMembership(new HashSet<org.omg.sysml.lang.sysml.Package>(), new HashSet<Category>(), true);
//			System.out.println("Caching inheritedMembership for " + this);
		}
		return inheritedMembership;
	}
	
	public EList<Membership> getInheritedMembership(Collection<org.omg.sysml.lang.sysml.Package> excludedPackages, Collection<Category> excludedCategories, boolean includeProtected) {
		EList<Membership> inheritedMemberships = new BasicInternalEList<Membership>(Membership.class);
		excludedCategories.add(this);
		for (Generalization generalization: getOwnedGeneralization()) {
			Category general = generalization.getGeneral();
			if (general != null && !excludedCategories.contains(general)) {
				inheritedMemberships.addAll(((CategoryImpl)general).getNonPrivateMembership(excludedPackages, excludedCategories, includeProtected));
			}
		}
		Collection<Feature> redefinedFeatures = getOwnedFeature().stream().
				flatMap(feature->((FeatureImpl)feature).getOwnedRedefinitionsWithoutDefault().stream()).
				map(redefinition->redefinition.getRedefinedFeature()).collect(Collectors.toSet());
		inheritedMemberships.removeIf(membership->redefinedFeatures.contains(membership.getMemberElement()));
		return inheritedMemberships;
	}
	
	public EList<Membership> getNonPrivateMembership(Collection<org.omg.sysml.lang.sysml.Package> excludedPackages, Collection<Category> excludedCategories, boolean includeProtected){
		EList<Membership> nonPrivateMembership = getInheritedMembership(excludedPackages, excludedCategories, includeProtected);
		nonPrivateMembership.addAll(super.getPublicMembership(excludedPackages, excludedCategories));
		if (includeProtected) {
			nonPrivateMembership.addAll(getVisibleOwnedMembership(VisibilityKind.PROTECTED));
		}
		return nonPrivateMembership;
	}
	
	@Override
	public EList<Membership> getPublicMembership(Collection<org.omg.sysml.lang.sysml.Package> excludedPackages, Collection<Category> excludedCategories){
		return getNonPrivateMembership(excludedPackages, excludedCategories, false);
	}
	
	/**
	 * This method returns those features from this category that should be automatically overridden in its usages.
	 * By default, there are none.
	 * 
	 * @return	Relevant features from the category that should be redefined in usages.
	 */
	public List<Feature> getRelevantFeatures() {
		return Collections.emptyList();
	}
	
	// Utility Methods
	
	public List<Feature> getEndFeatures() {
		return getFeature().stream().
				filter(f->f.getOwningFeatureMembership() instanceof EndFeatureMembership).
				collect(Collectors.toList());
	}
	
	public List<Parameter> getOwnedParameters() {
		return getOwnedFeature().stream().
				filter(feature->feature instanceof Parameter).map(feature->(Parameter)feature).collect(Collectors.toList());
	}
	
	public Feature getResult() {
		return null;
	}
	
	public FeatureMembership addOwnedFeature(Feature feature) {
		FeatureMembership membership = SysMLFactory.eINSTANCE.createFeatureMembership();
		membership.getOwnedRelatedElement().add(feature);
		getOwnedRelationship().add(membership);
		return membership;
	}
	
	public BindingConnector addOwnedBindingConnector(Feature source, Feature target) {
		BindingConnector connector = SysMLFactory.eINSTANCE.createBindingConnector();
		((ConnectorImpl)connector).addConnectorEnd(source);
		((ConnectorImpl)connector).addConnectorEnd(target);
		addOwnedFeature(connector);
		return connector;
	}
	
	public Stream<Connector> getConnectors() {
		return getFeature().stream().
				filter(f->f instanceof Connector).map(f->(Connector)f);
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
			case SysMLPackage.CATEGORY__OWNED_RELATIONSHIP:
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
			case SysMLPackage.CATEGORY__OWNED_RELATIONSHIP:
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
			case SysMLPackage.CATEGORY__OWNED_FEATURE:
				return getOwnedFeature();
			case SysMLPackage.CATEGORY__OWNED_GENERALIZATION:
				return getOwnedGeneralization();
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP:
				return getOwnedFeatureMembership();
			case SysMLPackage.CATEGORY__FEATURE:
				return getFeature();
			case SysMLPackage.CATEGORY__INPUT:
				return getInput();
			case SysMLPackage.CATEGORY__OUTPUT:
				return getOutput();
			case SysMLPackage.CATEGORY__IS_ABSTRACT:
				return isAbstract();
			case SysMLPackage.CATEGORY__INHERITED_MEMBERSHIP:
				return getInheritedMembership();
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
			case SysMLPackage.CATEGORY__OWNED_FEATURE:
				getOwnedFeature().clear();
				getOwnedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CATEGORY__OWNED_GENERALIZATION:
				getOwnedGeneralization().clear();
				getOwnedGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP:
				getOwnedFeatureMembership().clear();
				getOwnedFeatureMembership().addAll((Collection<? extends FeatureMembership>)newValue);
				return;
			case SysMLPackage.CATEGORY__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CATEGORY__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CATEGORY__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CATEGORY__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case SysMLPackage.CATEGORY__INHERITED_MEMBERSHIP:
				getInheritedMembership().clear();
				getInheritedMembership().addAll((Collection<? extends Membership>)newValue);
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
			case SysMLPackage.CATEGORY__OWNED_FEATURE:
				getOwnedFeature().clear();
				return;
			case SysMLPackage.CATEGORY__OWNED_GENERALIZATION:
				getOwnedGeneralization().clear();
				return;
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP:
				getOwnedFeatureMembership().clear();
				return;
			case SysMLPackage.CATEGORY__FEATURE:
				getFeature().clear();
				return;
			case SysMLPackage.CATEGORY__INPUT:
				getInput().clear();
				return;
			case SysMLPackage.CATEGORY__OUTPUT:
				getOutput().clear();
				return;
			case SysMLPackage.CATEGORY__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case SysMLPackage.CATEGORY__INHERITED_MEMBERSHIP:
				getInheritedMembership().clear();
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
			case SysMLPackage.CATEGORY__MEMBERSHIP:
				return isSetMembership();
			case SysMLPackage.CATEGORY__OWNED_RELATIONSHIP:
				return ownedRelationship != null && !ownedRelationship.isEmpty();
			case SysMLPackage.CATEGORY__OWNED_FEATURE:
				return !getOwnedFeature().isEmpty();
			case SysMLPackage.CATEGORY__OWNED_GENERALIZATION:
				return !getOwnedGeneralization().isEmpty();
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP:
				return !getOwnedFeatureMembership().isEmpty();
			case SysMLPackage.CATEGORY__FEATURE:
				return !getFeature().isEmpty();
			case SysMLPackage.CATEGORY__INPUT:
				return !getInput().isEmpty();
			case SysMLPackage.CATEGORY__OUTPUT:
				return !getOutput().isEmpty();
			case SysMLPackage.CATEGORY__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case SysMLPackage.CATEGORY__INHERITED_MEMBERSHIP:
				return !getInheritedMembership().isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMembership() {
		return super.isSetMembership()
			|| eIsSet(SysMLPackage.CATEGORY__INHERITED_MEMBERSHIP);
	}

} //CategoryImpl
