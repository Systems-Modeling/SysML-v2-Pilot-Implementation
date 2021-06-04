/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.EventOccurrenceUsage;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.FeatureUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Occurrence Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.EventOccurrenceUsageImpl#getOccurringEvent <em>Occurring Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventOccurrenceUsageImpl extends OccurrenceUsageImpl implements EventOccurrenceUsage {
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
	public OccurrenceUsage getOccurringEvent() {
		OccurrenceUsage occurringEvent = basicGetOccurringEvent();
		return occurringEvent != null && occurringEvent.eIsProxy() ? (OccurrenceUsage)eResolveProxy((InternalEObject)occurringEvent) : occurringEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OccurrenceUsage basicGetOccurringEvent() {
		return FeatureUtil.getReferencedFeatureOf(this, OccurrenceUsage.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOccurringEvent(OccurrenceUsage newOccurringEvent) {
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
			case SysMLPackage.EVENT_OCCURRENCE_USAGE__OCCURRING_EVENT:
				if (resolve) return getOccurringEvent();
				return basicGetOccurringEvent();
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
			case SysMLPackage.EVENT_OCCURRENCE_USAGE__OCCURRING_EVENT:
				setOccurringEvent((OccurrenceUsage)newValue);
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
			case SysMLPackage.EVENT_OCCURRENCE_USAGE__OCCURRING_EVENT:
				setOccurringEvent((OccurrenceUsage)null);
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
			case SysMLPackage.EVENT_OCCURRENCE_USAGE__OCCURRING_EVENT:
				return basicGetOccurringEvent() != null;
		}
		return super.eIsSet(featureID);
	}

} //EventOccurrenceUsageImpl
