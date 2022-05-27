/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.lang.sysml.EventOccurrenceUsage;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Occurrence Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.EventOccurrenceUsageImpl#getEventOccurrence <em>Event Occurrence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventOccurrenceUsageImpl extends OccurrenceUsageImpl implements EventOccurrenceUsage {
	/**
	 * The cached setting delegate for the '{@link #getEventOccurrence() <em>Event Occurrence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventOccurrence()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate EVENT_OCCURRENCE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.EVENT_OCCURRENCE_USAGE__EVENT_OCCURRENCE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventOccurrenceUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.EVENT_OCCURRENCE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OccurrenceUsage getEventOccurrence() {
		return (OccurrenceUsage)EVENT_OCCURRENCE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceUsage basicGetEventOccurrence() {
		return (OccurrenceUsage)EVENT_OCCURRENCE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventOccurrence(OccurrenceUsage newEventOccurrence) {
		EVENT_OCCURRENCE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newEventOccurrence);
	}

	// Additional overrides
	
	@Override
	public boolean isReference() {
		return true;
	}

	//
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.EVENT_OCCURRENCE_USAGE__EVENT_OCCURRENCE:
				if (resolve) return getEventOccurrence();
				return basicGetEventOccurrence();
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
			case SysMLPackage.EVENT_OCCURRENCE_USAGE__EVENT_OCCURRENCE:
				setEventOccurrence((OccurrenceUsage)newValue);
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
			case SysMLPackage.EVENT_OCCURRENCE_USAGE__EVENT_OCCURRENCE:
				setEventOccurrence((OccurrenceUsage)null);
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
			case SysMLPackage.EVENT_OCCURRENCE_USAGE__EVENT_OCCURRENCE:
				return EVENT_OCCURRENCE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //EventOccurrenceUsageImpl
