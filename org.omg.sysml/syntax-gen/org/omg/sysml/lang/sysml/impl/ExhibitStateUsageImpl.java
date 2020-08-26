/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.ExhibitStateUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exhibit State Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ExhibitStateUsageImpl#getExhibitedState <em>Exhibited State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExhibitStateUsageImpl extends StateUsageImpl implements ExhibitStateUsage {

	public static final String EXHIBIT_STATE_SUBSETTING_PART_DEFAULT = "Parts::Part::exhibitedStates";

	private Type subsettingBaseDefault;
	private Type subsettingPartDefault;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExhibitStateUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.EXHIBIT_STATE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateUsage getExhibitedState() {
		StateUsage exhibitedState = basicGetExhibitedState();
		return exhibitedState != null && exhibitedState.eIsProxy() ? (StateUsage)eResolveProxy((InternalEObject)exhibitedState) : exhibitedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StateUsage basicGetExhibitedState() {
		Type subsettingBaseDefault = getSubsettingBaseDefault();
		Type subsettingPartDefault = getSubsettingPartDefault();
		EList<Subsetting> subsettings = getOwnedSubsetting_comp();		
		if (subsettings.stream().map(sub->sub.getSubsettedFeature()).
				allMatch(feature->feature == subsettingBaseDefault || 
				         feature == subsettingPartDefault)) {
			return this;
		} else {
			Feature subsettedFeature = subsettings.get(0).getSubsettedFeature(); 
			return subsettedFeature instanceof StateUsage? (StateUsage)subsettedFeature: null;
		}
	}

	protected Type getSubsettingBaseDefault() {
		if (subsettingBaseDefault == null) {
			subsettingBaseDefault = getDefaultType(STATE_SUBSETTING_BASE_DEFAULT);
		}
		return subsettingBaseDefault;
	}

	protected Type getSubsettingPartDefault() {
		if (subsettingPartDefault == null) {
			subsettingPartDefault = getDefaultType(EXHIBIT_STATE_SUBSETTING_PART_DEFAULT);
		}
		return subsettingPartDefault;
	}

	@Override
	protected Feature getNamingFeature() {
		return getExhibitedState();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setExhibitedState(StateUsage newExhibitedState) {
		throw new UnsupportedOperationException();
	}

	@Override
	protected String getDefaultSupertype() {
		return isEnactedPerformance()? 
				EXHIBIT_STATE_SUBSETTING_PART_DEFAULT:
				super.getDefaultSupertype();
	}
	
	public boolean isEnactedPerformance() {
		return StepImpl.isEnactedPerformance(this);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.EXHIBIT_STATE_USAGE__EXHIBITED_STATE:
				if (resolve) return getExhibitedState();
				return basicGetExhibitedState();
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
			case SysMLPackage.EXHIBIT_STATE_USAGE__EXHIBITED_STATE:
				setExhibitedState((StateUsage)newValue);
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
			case SysMLPackage.EXHIBIT_STATE_USAGE__EXHIBITED_STATE:
				setExhibitedState((StateUsage)null);
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
			case SysMLPackage.EXHIBIT_STATE_USAGE__EXHIBITED_STATE:
				return basicGetExhibitedState() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExhibitStateUsageImpl
