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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseResolvingEList;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getOwnedRelationship_comp <em>Owned Relationship comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getOwnedMembership_comp <em>Owned Membership comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getOwnedGeneralization <em>Owned Generalization</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getOwnedFeatureMembership_comp <em>Owned Feature Membership comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getOwnedFeature <em>Owned Feature</em>}</li>
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
	 * The cached value of the '{@link #getOwnedFeatureMembership_comp() <em>Owned Feature Membership comp</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatureMembership_comp()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureMembership> ownedFeatureMembership_comp;

	/**
	 * The cached value of the '{@link #getOwnedFeatureMembership() <em>Owned Feature Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatureMembership()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureMembership> ownedFeatureMembership;

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
	protected static final int[] MEMBERSHIP_ESUBSETS = new int[] {SysMLPackage.CATEGORY__IMPORTED_MEMBERSHIP, SysMLPackage.CATEGORY__OWNED_MEMBERSHIP_COMP, SysMLPackage.CATEGORY__INHERITED_MEMBERSHIP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@Override
	public EList<Relationship> getOwnedRelationship_comp() {
		if (ownedRelationship_comp == null) {
			ownedRelationship_comp = new SubsetSupersetEObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, SysMLPackage.CATEGORY__OWNED_RELATIONSHIP_COMP, null, OWNED_RELATIONSHIP_COMP_ESUBSETS, SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT);
		}
		return ownedRelationship_comp;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedRelationship_comp() <em>Owned Relationship comp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRelationship_comp()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_RELATIONSHIP_COMP_ESUBSETS = new int[] {SysMLPackage.CATEGORY__OWNED_IMPORT_COMP, SysMLPackage.CATEGORY__OWNED_MEMBERSHIP_COMP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@Override
	public EList<Membership> getOwnedMembership_comp() {
		if (ownedMembership_comp == null) {
			ownedMembership_comp = new SubsetSupersetEObjectWithInverseResolvingEList<Membership>(Membership.class, this, SysMLPackage.CATEGORY__OWNED_MEMBERSHIP_COMP, OWNED_MEMBERSHIP_COMP_ESUPERSETS, OWNED_MEMBERSHIP_COMP_ESUBSETS, SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE);
		}
		return ownedMembership_comp;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembership_comp() <em>Owned Membership comp</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembership_comp()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBERSHIP_COMP_ESUBSETS = new int[] {SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP_COMP};

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedMembership_comp() <em>Owned Membership comp</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembership_comp()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBERSHIP_COMP_ESUPERSETS = new int[] {SysMLPackage.CATEGORY__OWNED_RELATIONSHIP_COMP};

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
	protected static final int[] OWNED_GENERALIZATION_ESUPERSETS = new int[] {SysMLPackage.CATEGORY__OWNED_RELATIONSHIP_COMP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureMembership> getOwnedFeatureMembership_comp() {
		if (ownedFeatureMembership_comp == null) {
			ownedFeatureMembership_comp = new SubsetSupersetEObjectWithInverseResolvingEList<FeatureMembership>(FeatureMembership.class, this, SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP_COMP, OWNED_FEATURE_MEMBERSHIP_COMP_ESUPERSETS, null, SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CATEGORY);
		}
		return ownedFeatureMembership_comp;
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedFeatureMembership_comp() <em>Owned Feature Membership comp</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatureMembership_comp()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_FEATURE_MEMBERSHIP_COMP_ESUPERSETS = new int[] {SysMLPackage.CATEGORY__OWNED_MEMBERSHIP_COMP};

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
			EObject general = null;
			for (String defaultName: defaultNames) {
				general = SysMLLibraryUtil.getLibraryElement(
						this, SysMLPackage.eINSTANCE.getGeneralization_General(), defaultName);
				if (general instanceof Category) {
					break;
				}
			}
			if (general != null) {
				generalization.setGeneral((Category)general);
				generalizations.add((T)generalization);
				getOwnedRelationship().add(generalization);
			}
		}
		return generalizations;
	}
	
	private <T extends Generalization> Generalization getDefaultGeneralization(EList<T> generalizations, EClass eClass) {
		Generalization generalization = null;
		if (generalizations.isEmpty()) {
			generalization = (Generalization) SysMLFactory.eINSTANCE.create(eClass);
			generalization.setSpecific(this);
		} else {
			generalization = generalizations.stream().
					filter(s->s.getGeneral() == null).
					findFirst().orElse(null);
		}
		return generalization;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureMembership> getOwnedFeatureMembership() {
		if (ownedFeatureMembership == null) {
			ownedFeatureMembership = new EObjectResolvingEList<FeatureMembership>(FeatureMembership.class, this, SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP);
		}
		return ownedFeatureMembership;
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Membership> getInheritedMembership() {
		return getInheritedMembership(new HashSet<org.omg.sysml.lang.sysml.Package>(), new HashSet<Category>(), true);
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
			case SysMLPackage.CATEGORY__OWNED_RELATIONSHIP_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelationship_comp()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CATEGORY__OWNED_MEMBERSHIP_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMembership_comp()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFeatureMembership_comp()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.CATEGORY__OWNED_RELATIONSHIP_COMP:
				return ((InternalEList<?>)getOwnedRelationship_comp()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CATEGORY__OWNED_MEMBERSHIP_COMP:
				return ((InternalEList<?>)getOwnedMembership_comp()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP_COMP:
				return ((InternalEList<?>)getOwnedFeatureMembership_comp()).basicRemove(otherEnd, msgs);
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
			case SysMLPackage.CATEGORY__OWNED_GENERALIZATION:
				return getOwnedGeneralization();
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP_COMP:
				return getOwnedFeatureMembership_comp();
			case SysMLPackage.CATEGORY__OWNED_FEATURE:
				return getOwnedFeature();
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
			case SysMLPackage.CATEGORY__OWNED_GENERALIZATION:
				getOwnedGeneralization().clear();
				getOwnedGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP_COMP:
				getOwnedFeatureMembership_comp().clear();
				getOwnedFeatureMembership_comp().addAll((Collection<? extends FeatureMembership>)newValue);
				return;
			case SysMLPackage.CATEGORY__OWNED_FEATURE:
				getOwnedFeature().clear();
				getOwnedFeature().addAll((Collection<? extends Feature>)newValue);
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
			case SysMLPackage.CATEGORY__OWNED_GENERALIZATION:
				getOwnedGeneralization().clear();
				return;
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP_COMP:
				getOwnedFeatureMembership_comp().clear();
				return;
			case SysMLPackage.CATEGORY__OWNED_FEATURE:
				getOwnedFeature().clear();
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
			case SysMLPackage.CATEGORY__OWNED_RELATIONSHIP_COMP:
				return ownedRelationship_comp != null && !ownedRelationship_comp.isEmpty();
			case SysMLPackage.CATEGORY__OWNED_MEMBERSHIP_COMP:
				return ownedMembership_comp != null && !ownedMembership_comp.isEmpty();
			case SysMLPackage.CATEGORY__OWNED_GENERALIZATION:
				return !getOwnedGeneralization().isEmpty();
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP_COMP:
				return ownedFeatureMembership_comp != null && !ownedFeatureMembership_comp.isEmpty();
			case SysMLPackage.CATEGORY__OWNED_FEATURE:
				return !getOwnedFeature().isEmpty();
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP:
				return ownedFeatureMembership != null && !ownedFeatureMembership.isEmpty();
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
