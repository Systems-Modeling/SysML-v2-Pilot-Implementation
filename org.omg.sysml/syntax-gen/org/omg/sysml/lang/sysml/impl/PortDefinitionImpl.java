/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.ConjugatedPortDefinition;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PortDefinitionImpl#getConjugatedPortDefinition <em>Conjugated Port Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortDefinitionImpl extends DefinitionImpl implements PortDefinition {

	public String PORT_DEFINITION_SUPERCLASS_DEFAULT = "Blocks::Port";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PORT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConjugatedPortDefinition getConjugatedPortDefinition() {
		ConjugatedPortDefinition conjugatedPortDefinition = basicGetConjugatedPortDefinition();
		return conjugatedPortDefinition != null && conjugatedPortDefinition.eIsProxy() ? (ConjugatedPortDefinition)eResolveProxy((InternalEObject)conjugatedPortDefinition) : conjugatedPortDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ConjugatedPortDefinition basicGetConjugatedPortDefinition() {
		return (ConjugatedPortDefinition) getOwnedMember().stream().
				filter(member->member instanceof ConjugatedPortDefinition).
				findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setConjugatedPortDefinition(ConjugatedPortDefinition newConjugatedPortDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.PORT_DEFINITION__CONJUGATED_PORT_DEFINITION:
				if (resolve) return getConjugatedPortDefinition();
				return basicGetConjugatedPortDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.PORT_DEFINITION__CONJUGATED_PORT_DEFINITION:
				setConjugatedPortDefinition((ConjugatedPortDefinition)newValue);
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
			case SysMLPackage.PORT_DEFINITION__CONJUGATED_PORT_DEFINITION:
				setConjugatedPortDefinition((ConjugatedPortDefinition)null);
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
			case SysMLPackage.PORT_DEFINITION__CONJUGATED_PORT_DEFINITION:
				return basicGetConjugatedPortDefinition() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<Superclassing> getOwnedSuperclassing() {
		return getOwnedSuperclassingWithDefault(PORT_DEFINITION_SUPERCLASS_DEFAULT);
	}
	
} //PortDefinitionImpl
