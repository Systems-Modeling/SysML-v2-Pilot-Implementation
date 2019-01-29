/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;

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
		return getOwnedSuperclassingWithoutDefault();
	}
	
	protected EList<Superclassing> getOwnedSuperclassingWithoutDefault() {
		EList<Superclassing> superclassings = new EObjectEList<Superclassing>(Superclassing.class, this, SysMLPackage.CLASS__OWNED_SUPERCLASSING);
		for (Generalization generalization: getOwnedGeneralization()) {
			if (generalization instanceof Superclassing) {
				superclassings.add((Superclassing)generalization);
			}
		}
		return superclassings;
	}
	
	protected EList<Superclassing> getOwnedSuperclassingWithDefault(String superclassDefault) {
		EList<Superclassing> superclassings = getOwnedSuperclassingWithoutDefault();
		Superclassing superclassing = getDefaultSuperclassing(superclassings);
		if (superclassing != null) {
			EObject defaultSuperclass = SysMLLibraryUtil.getLibraryElement(
					this, SysMLPackage.eINSTANCE.getSuperclassing_Superclass(), superclassDefault);
			if (defaultSuperclass instanceof org.omg.sysml.lang.sysml.Class) {
				superclassing.setSuperclass((org.omg.sysml.lang.sysml.Class)defaultSuperclass);
				this.getOwnedRelationship().add(superclassing);
			}
		}
		return superclassings;
	}
	
	private Superclassing getDefaultSuperclassing(EList<Superclassing> superclassings) {
		Superclassing superclassing = null;
		if (superclassings.isEmpty()) {
			superclassing = SysMLFactory.eINSTANCE.createSuperclassing();
			superclassing.setSubclass(this);
			superclassings.add(superclassing);
		} else {
			superclassing = superclassings.stream().
					filter(s->s.getSuperclass() == null).
					findFirst().orElse(null);
		}
		return superclassing;
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
