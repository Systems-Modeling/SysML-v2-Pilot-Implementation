/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

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
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getMembership <em>Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getOwnedRelationship_comp <em>Owned Relationship comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getConjugator <em>Conjugator</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getOwnedMembership_comp <em>Owned Membership comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getOwnedFeatureMembership_comp <em>Owned Feature Membership comp</em>}</li>
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getOwnedGeneralization <em>Owned Generalization</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TypeImpl#getOwnedFeatureMembership <em>Owned Feature Membership</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeImpl extends PackageImpl implements Type {
	
	public static final String TYPE_GENERALIZATION_DEFAULT = "Base::Anything";

	/**
	 * The cached value of the '{@link #getConjugator() <em>Conjugator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConjugator()
	 * @generated
	 * @ordered
	 */
	protected Conjugation conjugator;

	/**
	 * The cached value of the '{@link #getOwnedFeatureMembership_comp() <em>Owned Feature Membership comp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatureMembership_comp()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureMembership> ownedFeatureMembership_comp;

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
	public EList<Relationship> getOwnedRelationship_comp() {
		if (ownedRelationship_comp == null) {
			ownedRelationship_comp = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, SysMLPackage.TYPE__OWNED_RELATIONSHIP_COMP, SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT);
		}
		return ownedRelationship_comp;
	}
	
	@Override
	public Conjugation getConjugator() {
		return conjugator == null? basicGetConjugator(): getConjugatorGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conjugation getConjugatorGen() {
		if (conjugator != null && conjugator.eIsProxy()) {
			InternalEObject oldConjugator = (InternalEObject)conjugator;
			conjugator = (Conjugation)eResolveProxy(oldConjugator);
			if (conjugator != oldConjugator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.TYPE__CONJUGATOR, oldConjugator, conjugator));
			}
		}
		return conjugator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Conjugation basicGetConjugator() {
		if (conjugator == null) {
			conjugator = (Conjugation) getOwnedRelationship().stream().
					filter(r->r instanceof Conjugation).
					findFirst().orElse(null);
		}
		return conjugator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConjugator(Conjugation newConjugator, NotificationChain msgs) {
		Conjugation oldConjugator = conjugator;
		conjugator = newConjugator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.TYPE__CONJUGATOR, oldConjugator, newConjugator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConjugator(Conjugation newConjugator) {
		if (newConjugator != conjugator) {
			NotificationChain msgs = null;
			if (conjugator != null)
				msgs = ((InternalEObject)conjugator).eInverseRemove(this, SysMLPackage.CONJUGATION__CONJUGATED_TYPE, Conjugation.class, msgs);
			if (newConjugator != null)
				msgs = ((InternalEObject)newConjugator).eInverseAdd(this, SysMLPackage.CONJUGATION__CONJUGATED_TYPE, Conjugation.class, msgs);
			msgs = basicSetConjugator(newConjugator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.TYPE__CONJUGATOR, newConjugator, newConjugator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Membership> getOwnedMembership_comp() {
		if (ownedMembership_comp == null) {
			ownedMembership_comp = new EObjectContainmentWithInverseEList<Membership>(Membership.class, this, SysMLPackage.TYPE__OWNED_MEMBERSHIP_COMP, SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE);
		}
		return ownedMembership_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Generalization> getOwnedGeneralization() {
		computeImplicitGeneralization();
		return basicGetOwnedGeneralization();
	}

	public EList<Generalization> basicGetOwnedGeneralization() {
		EList<Generalization> generalizations = new EObjectEList<Generalization>(Generalization.class, this, SysMLPackage.TYPE__OWNED_GENERALIZATION);
		for (Relationship relationship: getOwnedRelationship_comp()) {
			if (relationship instanceof Generalization &&
					this.equals(((Generalization)relationship).getSpecific())) {
				generalizations.add(((Generalization)relationship));
			}
		}
		return generalizations;
	}

	@SuppressWarnings("unchecked")
	protected <T extends Generalization> EList<T> basicGetOwnedGeneralization(Class<T> kind, int featureID) {
		EList<T> generalizations = new EObjectEList<T>(kind, this, featureID);
		for (Generalization generalization: basicGetOwnedGeneralization()) {
			if (kind.isInstance(generalization)) {
				generalizations.add((T)generalization);
			}
		}
		return generalizations;
	}
	
	public EList<Generalization> basicGetOwnedGeneralizationWithDefault() {
		EList<Generalization> generalizations = basicGetOwnedGeneralization();
		
		// Do not add a default generalization if the type is conjugated.
		if (!isConjugated()) {
			Generalization generalization = getDefaultGeneralization(generalizations, getGeneralizationEClass(), getDefaultSupertype());
			if (generalization != null) {
				generalizations.add(generalization);
			}
		}
		
		return generalizations;
	}
	
	public void computeImplicitGeneralization() {
		if (!isConjugated()) {
			addImplicitGeneralization();
 		}
	}
	
	protected void addImplicitGeneralization() {
		addImplicitGeneralization(getGeneralizationEClass(), getDefaultSupertype());
	}
	
	protected void addImplicitGeneralization(EClass generalizationEClass, String... superTypeNames) {
		@SuppressWarnings("unchecked")
		Generalization generalization = getDefaultGeneralization(
				basicGetOwnedGeneralization(
						(Class<? extends Generalization>)generalizationEClass.getInstanceClass(), 
						SysMLPackage.TYPE__OWNED_GENERALIZATION),
				generalizationEClass, superTypeNames);
		if (generalization != null) {
			getOwnedRelationship_comp().add(generalization);
		}		
	}
	
	protected EClass getGeneralizationEClass() {
		return SysMLPackage.eINSTANCE.getGeneralization();
	}
	
	protected String getDefaultSupertype() {
		return TYPE_GENERALIZATION_DEFAULT;
	}
	
	protected <T extends Generalization> Generalization getDefaultGeneralization(EList<T> generalizations, EClass eClass, String... defaultNames) {
		Generalization generalization = null;
		if (generalizations.isEmpty()) {
			Type general = getDefaultType(defaultNames);
			// Do not add a default generalization of a type to itself.
			if (general != null && general != this) {
				generalization = (Generalization) SysMLFactory.eINSTANCE.create(eClass);
				generalization.setGeneral(general);
				((GeneralizationImpl)generalization).basicSetSpecific(this);
			}
		} else {
			generalization = generalizations.stream().
					filter(s->s.eClass() == eClass && ((GeneralizationImpl)s).basicGetGeneral() == null).
					findFirst().orElse(null);
			if (generalization != null) {
				// Only resolve a default name if necessary.
				Type general = getDefaultType(defaultNames);
				generalization.setGeneral(general);
			}
		}
		return generalization;
	}
	
	protected Type getDefaultType(String... defaultNames) {
		for (String defaultName: defaultNames) {
			EObject element = SysMLLibraryUtil.getLibraryElement(this, defaultName);
			if (element instanceof Type) {
				return (Type)element;
			}
		}
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<FeatureMembership> getOwnedFeatureMembership() {
		EList<FeatureMembership> ownedFeatureMemberships = new EObjectEList<FeatureMembership>(FeatureMembership.class, this, SysMLPackage.TYPE__OWNED_FEATURE_MEMBERSHIP);
		ownedFeatureMemberships.addAll(getOwnedFeatureMembership_comp());
		return ownedFeatureMemberships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feature> getOwnedFeature() {
		return new DerivedEObjectEList<Feature>(
				Feature.class, this, SysMLPackage.TYPE__OWNED_FEATURE, 
				new int[]{SysMLPackage.PACKAGE__OWNED_MEMBER});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feature> getFeature() {
		return new DerivedEObjectEList<Feature>(
				Feature.class, this, SysMLPackage.TYPE__FEATURE, 
				new int[]{SysMLPackage.PACKAGE__MEMBER});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feature> getInput() {
		EList<Feature> inputs = new EObjectEList<Feature>(Feature.class, this, SysMLPackage.TYPE__INPUT);
		Conjugation conjugator = getConjugator();
		if (conjugator != null) {
			inputs.addAll(conjugator.getOriginalType().getOutput());
		} else {
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
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feature> getOutput() {
		EList<Feature> outputs = new EObjectEList<Feature>(Feature.class, this, SysMLPackage.TYPE__OUTPUT);
		Conjugation conjugator = getConjugator();
		if (conjugator != null) {
			outputs.addAll(conjugator.getOriginalType().getInput());
		} else {
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
			inheritedMembership = getInheritedMembership(new HashSet<org.omg.sysml.lang.sysml.Package>(), new HashSet<Type>(), true);
//			System.out.println("Caching inheritedMembership for " + this);
		}
		return inheritedMembership;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getEndFeature() {
		EList<Feature> features = new EObjectEList<Feature>(Feature.class, this, SysMLPackage.TYPE__END_FEATURE);
		getFeature().stream().filter(f->f.isEnd()).forEachOrdered(features::add);
		return features;
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
		Conjugation conjugator = getConjugator();
		return this.getOwnedRelationship().contains(conjugator)? conjugator: null;
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
		return getConjugator() != null;
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
		EList<FeatureMembership> featureMemberships = new EObjectEList<FeatureMembership>(FeatureMembership.class, this, SysMLPackage.TYPE__FEATURE_MEMBERSHIP);
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
		EList<Feature> features = new EObjectEList<Feature>(Feature.class, this, SysMLPackage.TYPE__INHERITED_FEATURE);
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
		return (Multiplicity)getFeature().stream().
				filter(feature->feature instanceof Multiplicity).
				findFirst().orElse(null);
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
	public EList<Feature> getOwnedEndFeature() {
		EList<Feature> features = new EObjectEList<Feature>(Feature.class, this, SysMLPackage.TYPE__END_FEATURE);
		getOwnedFeature().stream().filter(f->f.isEnd()).forEachOrdered(features::add);
		return features;
	}

	public EList<Membership> getInheritedMembership(Collection<org.omg.sysml.lang.sysml.Package> excludedPackages, Collection<Type> excludedTypes, boolean includeProtected) {
		EList<Membership> inheritedMemberships = new BasicInternalEList<Membership>(Membership.class);
		excludedTypes.add(this);
		Conjugation conjugator = this.getConjugator();
		if (conjugator != null) {
			Type originalType = conjugator.getOriginalType();
			if (originalType != null && !excludedTypes.contains(originalType)) {
				inheritedMemberships.addAll(((TypeImpl)originalType).getMembership(excludedPackages, excludedTypes, includeProtected));
			}
		}
		for (Generalization generalization: getOwnedGeneralization()) {
			Type general = generalization.getGeneral();
			if (general != null && !excludedTypes.contains(general)) {
				inheritedMemberships.addAll(((TypeImpl)general).getNonPrivateMembership(excludedPackages, excludedTypes, includeProtected));
			}
		}
		Collection<Feature> redefinedFeatures = getRedefinedFeatures();
		inheritedMemberships.removeIf(membership->redefinedFeatures.contains(membership.getMemberElement()));
		return inheritedMemberships;
	}
	
	public Collection<Feature> getRedefinedFeatures() {
		return getOwnedFeature().stream().
				flatMap(feature->((FeatureImpl)feature).basicGetOwnedGeneralizationWithDefault().stream()).
				filter(Redefinition.class::isInstance).
				map(redefinition->((Redefinition)redefinition).getRedefinedFeature()).
				collect(Collectors.toSet());
	}
	
	public EList<Membership> getMembership(Collection<org.omg.sysml.lang.sysml.Package> excludedPackages, Collection<Type> excludedTypes, boolean includeProtected) {
		EList<Membership> membership = getOwnedMembership();
		membership.addAll(getInheritedMembership(excludedPackages, excludedTypes, includeProtected));
		membership.addAll(getImportedMembership(excludedPackages, excludedTypes, includeProtected));
		return membership;
	}	
	
	public EList<Membership> getNonPrivateMembership(Collection<org.omg.sysml.lang.sysml.Package> excludedPackages, Collection<Type> excludedTypes, boolean includeProtected) {
		EList<Membership> nonPrivateMembership = getInheritedMembership(excludedPackages, excludedTypes, includeProtected);
		nonPrivateMembership.addAll(super.getPublicMembership(excludedPackages, excludedTypes));
		if (includeProtected) {
			nonPrivateMembership.addAll(getVisibleOwnedMembership(VisibilityKind.PROTECTED));
		}
		return nonPrivateMembership;
	}
	
	@Override
	public EList<Membership> getPublicMembership(Collection<org.omg.sysml.lang.sysml.Package> excludedPackages, Collection<Type> excludedTypes) {
		return getNonPrivateMembership(excludedPackages, excludedTypes, false);
	}
	
	/**
	 * This method returns those features from this type that should be automatically overridden in its usages.
	 * By default, there are none.
	 * 
	 * @return	Relevant features from the type that should be redefined in usages.
	 */
	public List<? extends Feature> getRelevantFeatures() {
		return Collections.emptyList();
	}
	
	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedGeneralization() <em>Owned Generalization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGeneralization()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_GENERALIZATION_ESUPERSETS = new int[] {SysMLPackage.TYPE__OWNED_RELATIONSHIP_COMP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureMembership> getOwnedFeatureMembership_comp() {
		if (ownedFeatureMembership_comp == null) {
			ownedFeatureMembership_comp = new EObjectContainmentWithInverseEList<FeatureMembership>(FeatureMembership.class, this, SysMLPackage.TYPE__OWNED_FEATURE_MEMBERSHIP_COMP, SysMLPackage.FEATURE_MEMBERSHIP__OWNING_TYPE);
		}
		return ownedFeatureMembership_comp;
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedFeatureMembership() <em>Owned Feature Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatureMembership()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_FEATURE_MEMBERSHIP_ESUPERSETS = new int[] {SysMLPackage.TYPE__OWNED_MEMBERSHIP_COMP};

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

	// Additional subsets
	
	@Override
	public EList<Membership> getOwnedMembership() {
		EList<Membership> ownedMemberships = super.getOwnedMembership();
		ownedMemberships.addAll(getOwnedFeatureMembership());
		return ownedMemberships;
	}

	// Utility Methods
	
	public List<Parameter> getOwnedParameters() {
		return getOwnedFeature().stream().
				filter(feature->feature instanceof Parameter).
				map(feature->(Parameter)feature).
				collect(Collectors.toList());
	}
	
	public Feature getResult() {
		return null;
	}
	
	public FeatureMembership addOwnedFeature(Feature feature) {
		FeatureMembership membership = SysMLFactory.eINSTANCE.createFeatureMembership();
		membership.setOwnedMemberFeature_comp(feature);
		getOwnedFeatureMembership_comp().add(membership);
		return membership;
	}
	
	public BindingConnector addOwnedBindingConnector(Feature source, Feature target) {
		BindingConnector connector = SysMLFactory.eINSTANCE.createBindingConnector();
		((ConnectorImpl)connector).addConnectorEnd(source);
		((ConnectorImpl)connector).addConnectorEnd(target);
		addOwnedFeature(connector);
		return connector;
	}
	
	// Other Methods
	
	@Override
	public void transform() {
		super.transform();
		clearCaches();
		computeImplicitGeneralization();
	}
	
	//
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.TYPE__OWNED_RELATIONSHIP_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelationship_comp()).basicAdd(otherEnd, msgs);
			case SysMLPackage.TYPE__CONJUGATOR:
				if (conjugator != null)
					msgs = ((InternalEObject)conjugator).eInverseRemove(this, SysMLPackage.CONJUGATION__CONJUGATED_TYPE, Conjugation.class, msgs);
				return basicSetConjugator((Conjugation)otherEnd, msgs);
			case SysMLPackage.TYPE__OWNED_MEMBERSHIP_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMembership_comp()).basicAdd(otherEnd, msgs);
			case SysMLPackage.TYPE__OWNED_FEATURE_MEMBERSHIP_COMP:
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
			case SysMLPackage.TYPE__OWNED_RELATIONSHIP_COMP:
				return ((InternalEList<?>)getOwnedRelationship_comp()).basicRemove(otherEnd, msgs);
			case SysMLPackage.TYPE__CONJUGATOR:
				return basicSetConjugator(null, msgs);
			case SysMLPackage.TYPE__OWNED_MEMBERSHIP_COMP:
				return ((InternalEList<?>)getOwnedMembership_comp()).basicRemove(otherEnd, msgs);
			case SysMLPackage.TYPE__OWNED_FEATURE_MEMBERSHIP_COMP:
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
			case SysMLPackage.TYPE__CONJUGATOR:
				if (resolve) return getConjugator();
				return basicGetConjugator();
			case SysMLPackage.TYPE__OWNED_FEATURE_MEMBERSHIP_COMP:
				return getOwnedFeatureMembership_comp();
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
			case SysMLPackage.TYPE__OWNED_GENERALIZATION:
				return getOwnedGeneralization();
			case SysMLPackage.TYPE__OWNED_FEATURE_MEMBERSHIP:
				return getOwnedFeatureMembership();
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
			case SysMLPackage.TYPE__CONJUGATOR:
				setConjugator((Conjugation)newValue);
				return;
			case SysMLPackage.TYPE__OWNED_FEATURE_MEMBERSHIP_COMP:
				getOwnedFeatureMembership_comp().clear();
				getOwnedFeatureMembership_comp().addAll((Collection<? extends FeatureMembership>)newValue);
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
			case SysMLPackage.TYPE__OWNED_GENERALIZATION:
				getOwnedGeneralization().clear();
				getOwnedGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case SysMLPackage.TYPE__OWNED_FEATURE_MEMBERSHIP:
				getOwnedFeatureMembership().clear();
				getOwnedFeatureMembership().addAll((Collection<? extends FeatureMembership>)newValue);
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
			case SysMLPackage.TYPE__CONJUGATOR:
				setConjugator((Conjugation)null);
				return;
			case SysMLPackage.TYPE__OWNED_FEATURE_MEMBERSHIP_COMP:
				getOwnedFeatureMembership_comp().clear();
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
			case SysMLPackage.TYPE__OWNED_GENERALIZATION:
				getOwnedGeneralization().clear();
				return;
			case SysMLPackage.TYPE__OWNED_FEATURE_MEMBERSHIP:
				getOwnedFeatureMembership().clear();
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
			case SysMLPackage.TYPE__OWNED_RELATIONSHIP_COMP:
				return ownedRelationship_comp != null && !ownedRelationship_comp.isEmpty();
			case SysMLPackage.TYPE__CONJUGATOR:
				return conjugator != null;
			case SysMLPackage.TYPE__OWNED_MEMBERSHIP_COMP:
				return ownedMembership_comp != null && !ownedMembership_comp.isEmpty();
			case SysMLPackage.TYPE__OWNED_FEATURE_MEMBERSHIP_COMP:
				return ownedFeatureMembership_comp != null && !ownedFeatureMembership_comp.isEmpty();
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
			case SysMLPackage.TYPE__OWNED_GENERALIZATION:
				return !getOwnedGeneralization().isEmpty();
			case SysMLPackage.TYPE__OWNED_FEATURE_MEMBERSHIP:
				return !getOwnedFeatureMembership().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.TYPE___DIRECTION_OF__FEATURE:
				return directionOf((Feature)arguments.get(0));
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

} //CategoryImpl
