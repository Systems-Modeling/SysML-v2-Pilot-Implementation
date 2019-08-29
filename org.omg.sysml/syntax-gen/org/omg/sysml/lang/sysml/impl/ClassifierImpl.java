/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Class</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.omg.sysml.lang.sysml.impl.ClassifierImpl#getOwnedSuperclassing
 * <em>Owned Superclassing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifierImpl extends TypeImpl implements Classifier {
	public String CLASSIFIER_SUPERCLASS_DEFAULT = "Base::Anything";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public EList<Superclassing> getOwnedSuperclassing() {
		return getOwnedSuperclassingWithDefault(CLASSIFIER_SUPERCLASS_DEFAULT);
	}

	protected EList<Superclassing> getOwnedSuperclassingWithDefault(String superclassDefault) {
		return getOwnedGeneralizationWithDefault(Superclassing.class, SysMLPackage.CLASSIFIER__OWNED_SUPERCLASSING,
				SysMLPackage.eINSTANCE.getSuperclassing(), superclassDefault);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SysMLPackage.CLASSIFIER__OWNED_SUPERCLASSING:
			return getOwnedSuperclassing();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SysMLPackage.CLASSIFIER__OWNED_SUPERCLASSING:
			getOwnedSuperclassing().clear();
			getOwnedSuperclassing().addAll((Collection<? extends Superclassing>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SysMLPackage.CLASSIFIER__OWNED_SUPERCLASSING:
			getOwnedSuperclassing().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SysMLPackage.CLASSIFIER__OWNED_SUPERCLASSING:
			return !getOwnedSuperclassing().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ClassImpl
