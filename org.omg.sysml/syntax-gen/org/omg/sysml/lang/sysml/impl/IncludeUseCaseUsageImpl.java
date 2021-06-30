/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.EventOccurrenceUsage;
import org.omg.sysml.lang.sysml.IncludeUseCaseUsage;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.PerformActionUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include Use Case Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.IncludeUseCaseUsageImpl#getPerformedAction <em>Performed Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncludeUseCaseUsageImpl extends UseCaseUsageImpl implements IncludeUseCaseUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeUseCaseUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.INCLUDE_USE_CASE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getPerformedAction() {
		ActionUsage performedAction = basicGetPerformedAction();
		return performedAction != null && performedAction.eIsProxy() ? (ActionUsage)eResolveProxy((InternalEObject)performedAction) : performedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionUsage basicGetPerformedAction() {
		// TODO: implement this method to return the 'Performed Action' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformedAction(ActionUsage newPerformedAction) {
		// TODO: implement this method to set the 'Performed Action' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPerformedAction() {
		return basicGetPerformedAction() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.INCLUDE_USE_CASE_USAGE__EVENT_OCCURRENCE:
				if (resolve) return getEventOccurrence();
				return basicGetEventOccurrence();
			case SysMLPackage.INCLUDE_USE_CASE_USAGE__PERFORMED_ACTION:
				if (resolve) return getPerformedAction();
				return basicGetPerformedAction();
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
			case SysMLPackage.INCLUDE_USE_CASE_USAGE__EVENT_OCCURRENCE:
				setEventOccurrence((OccurrenceUsage)newValue);
				return;
			case SysMLPackage.INCLUDE_USE_CASE_USAGE__PERFORMED_ACTION:
				setPerformedAction((ActionUsage)newValue);
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
			case SysMLPackage.INCLUDE_USE_CASE_USAGE__EVENT_OCCURRENCE:
				setEventOccurrence((OccurrenceUsage)null);
				return;
			case SysMLPackage.INCLUDE_USE_CASE_USAGE__PERFORMED_ACTION:
				setPerformedAction((ActionUsage)null);
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
			case SysMLPackage.INCLUDE_USE_CASE_USAGE__EVENT_OCCURRENCE:
				return isSetEventOccurrence();
			case SysMLPackage.INCLUDE_USE_CASE_USAGE__PERFORMED_ACTION:
				return isSetPerformedAction();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EventOccurrenceUsage.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.INCLUDE_USE_CASE_USAGE__EVENT_OCCURRENCE: return SysMLPackage.EVENT_OCCURRENCE_USAGE__EVENT_OCCURRENCE;
				default: return -1;
			}
		}
		if (baseClass == PerformActionUsage.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.INCLUDE_USE_CASE_USAGE__PERFORMED_ACTION: return SysMLPackage.PERFORM_ACTION_USAGE__PERFORMED_ACTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EventOccurrenceUsage.class) {
			switch (baseFeatureID) {
				case SysMLPackage.EVENT_OCCURRENCE_USAGE__EVENT_OCCURRENCE: return SysMLPackage.INCLUDE_USE_CASE_USAGE__EVENT_OCCURRENCE;
				default: return -1;
			}
		}
		if (baseClass == PerformActionUsage.class) {
			switch (baseFeatureID) {
				case SysMLPackage.PERFORM_ACTION_USAGE__PERFORMED_ACTION: return SysMLPackage.INCLUDE_USE_CASE_USAGE__PERFORMED_ACTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceUsage getEventOccurrence() {
		return getPerformedAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceUsage basicGetEventOccurrence() {
		return basicGetPerformedAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventOccurrence(OccurrenceUsage newEventOccurrence) {
		if (newEventOccurrence != null && !(newEventOccurrence instanceof ActionUsage)) {
			throw new IllegalArgumentException("newEventOccurrence must be an instance of ActionUsage");
		}
		setPerformedAction((ActionUsage) newEventOccurrence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEventOccurrence() {
  		return false;
	}

} //IncludeUseCaseUsageImpl
