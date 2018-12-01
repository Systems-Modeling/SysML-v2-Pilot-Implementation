/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getOwnedGeneralization <em>Owned Generalization</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getOwnedFeatureMembership <em>Owned Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CategoryImpl#isAbstract <em>Is Abstract</em>}</li>
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
	 * @generated NOT
	 */
	public EList<Generalization> getOwnedGeneralization() {
		EList<Generalization> generalizations = new BasicInternalEList<Generalization>(Generalization.class);
		for (Element member: this.getOwnedMember()) {
			if (member instanceof Generalization &&
					((Generalization)member).getSpecific().equals(this)) {
				generalizations.add(((Generalization)member));
			}
		}
		return generalizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<FeatureMembership> getOwnedFeatureMembership() {
		return new DerivedEObjectEList<FeatureMembership>(
				FeatureMembership.class, this, SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP, 
				new int[]{SysMLPackage.PACKAGE__OWNED_MEMBERSHIP});
//		EList<FeatureMembership> featureMembership = new BasicInternalEList<FeatureMembership>();
//		for (Membership membership: this.getOwnedMembership()) {
//			if (membership instanceof FeatureMembership) {
//				featureMembership.add((FeatureMembership)membership);
//			}
//		}
//		return featureMembership;
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
		EList<Feature> inputs = new BasicInternalEList<Feature>(Feature.class);
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
		EList<Feature> outputs = new BasicInternalEList<Feature>(Feature.class);
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
	public boolean isAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CATEGORY__IS_ABSTRACT, oldIsAbstract, isAbstract));
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
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP:
				return getOwnedFeatureMembership();
			case SysMLPackage.CATEGORY__OWNED_FEATURE:
				return getOwnedFeature();
			case SysMLPackage.CATEGORY__FEATURE:
				return getFeature();
			case SysMLPackage.CATEGORY__INPUT:
				return getInput();
			case SysMLPackage.CATEGORY__OUTPUT:
				return getOutput();
			case SysMLPackage.CATEGORY__IS_ABSTRACT:
				return isAbstract();
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
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP:
				getOwnedFeatureMembership().clear();
				getOwnedFeatureMembership().addAll((Collection<? extends FeatureMembership>)newValue);
				return;
			case SysMLPackage.CATEGORY__OWNED_FEATURE:
				getOwnedFeature().clear();
				getOwnedFeature().addAll((Collection<? extends Feature>)newValue);
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
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP:
				getOwnedFeatureMembership().clear();
				return;
			case SysMLPackage.CATEGORY__OWNED_FEATURE:
				getOwnedFeature().clear();
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
			case SysMLPackage.CATEGORY__OWNED_GENERALIZATION:
				return !getOwnedGeneralization().isEmpty();
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP:
				return !getOwnedFeatureMembership().isEmpty();
			case SysMLPackage.CATEGORY__OWNED_FEATURE:
				return !getOwnedFeature().isEmpty();
			case SysMLPackage.CATEGORY__FEATURE:
				return !getFeature().isEmpty();
			case SysMLPackage.CATEGORY__INPUT:
				return !getInput().isEmpty();
			case SysMLPackage.CATEGORY__OUTPUT:
				return !getOutput().isEmpty();
			case SysMLPackage.CATEGORY__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //CategoryImpl
