/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ClassImpl#getOwnedSuperclassing <em>Owned Superclassing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends CategoryImpl implements org.omg.sysml.lang.sysml.Class {
	public String CLASS_SUPERCLASS_DEFAULT = "Base::Anything";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Superclassing> getOwnedSuperclassing() {
		return getOwnedSuperclassingWithDefault(CLASS_SUPERCLASS_DEFAULT);
	}
	
	protected EList<Superclassing> getOwnedSuperclassingWithDefault(String superclassDefault) {
		return getOwnedGeneralizationWithDefault(Superclassing.class, SysMLPackage.CLASS__OWNED_SUPERCLASSING, SysMLPackage.eINSTANCE.getSuperclassing(), superclassDefault);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.CLASS__OWNED_SUPERCLASSING:
				return getOwnedSuperclassing();
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
			case SysMLPackage.CLASS__OWNED_SUPERCLASSING:
				getOwnedSuperclassing().clear();
				getOwnedSuperclassing().addAll((Collection<? extends Superclassing>)newValue);
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
			case SysMLPackage.CLASS__OWNED_SUPERCLASSING:
				getOwnedSuperclassing().clear();
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
			case SysMLPackage.CLASS__OWNED_SUPERCLASSING:
				return !getOwnedSuperclassing().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassImpl
