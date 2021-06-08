/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.LifeClass;
import org.omg.sysml.lang.sysml.OccurrenceDefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occurrence Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.OccurrenceDefinitionImpl#getLifeClass <em>Life Class</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.OccurrenceDefinitionImpl#isIndividual <em>Is Individual</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OccurrenceDefinitionImpl extends DefinitionImpl implements OccurrenceDefinition {
	/**
	 * The default value of the '{@link #isIndividual() <em>Is Individual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndividual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INDIVIDUAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIndividual() <em>Is Individual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndividual()
	 * @generated
	 * @ordered
	 */
	protected boolean isIndividual = IS_INDIVIDUAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccurrenceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.OCCURRENCE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LifeClass getLifeClass() {
		LifeClass lifeClass = basicGetLifeClass();
		return lifeClass != null && lifeClass.eIsProxy() ? (LifeClass)eResolveProxy((InternalEObject)lifeClass) : lifeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LifeClass basicGetLifeClass() {
		return getOwnedMember().stream().
				filter(LifeClass.class::isInstance).
				map(LifeClass.class::cast).
				findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setLifeClass(LifeClass newLifeClass) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIndividual() {
		return isIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsIndividual(boolean newIsIndividual) {
		boolean oldIsIndividual = isIndividual;
		isIndividual = newIsIndividual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.OCCURRENCE_DEFINITION__IS_INDIVIDUAL, oldIsIndividual, isIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.OCCURRENCE_DEFINITION__LIFE_CLASS:
				if (resolve) return getLifeClass();
				return basicGetLifeClass();
			case SysMLPackage.OCCURRENCE_DEFINITION__IS_INDIVIDUAL:
				return isIndividual();
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
			case SysMLPackage.OCCURRENCE_DEFINITION__LIFE_CLASS:
				setLifeClass((LifeClass)newValue);
				return;
			case SysMLPackage.OCCURRENCE_DEFINITION__IS_INDIVIDUAL:
				setIsIndividual((Boolean)newValue);
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
			case SysMLPackage.OCCURRENCE_DEFINITION__LIFE_CLASS:
				setLifeClass((LifeClass)null);
				return;
			case SysMLPackage.OCCURRENCE_DEFINITION__IS_INDIVIDUAL:
				setIsIndividual(IS_INDIVIDUAL_EDEFAULT);
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
			case SysMLPackage.OCCURRENCE_DEFINITION__LIFE_CLASS:
				return basicGetLifeClass() != null;
			case SysMLPackage.OCCURRENCE_DEFINITION__IS_INDIVIDUAL:
				return isIndividual != IS_INDIVIDUAL_EDEFAULT;
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
		result.append(" (isIndividual: ");
		result.append(isIndividual);
		result.append(')');
		return result.toString();
	}

} //OccurrenceDefinitionImpl
