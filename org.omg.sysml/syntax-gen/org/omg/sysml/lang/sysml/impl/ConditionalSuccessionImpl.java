/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.ConditionalSuccession;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Succession</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConditionalSuccessionImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalSuccessionImpl extends SuccessionImpl implements ConditionalSuccession {

	public static final String CONDITIONAL_SUCCESSION_SUBSETTING_DEFAULT = "ControlNodes::conditionalSuccessions";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalSuccessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONDITIONAL_SUCCESSION;
	}
	
	/**
	 *  @generated 
	 */
	@Override
	public Expression getGuard() {
		Expression guard = basicGetGuard();
		return guard != null && guard.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)guard) : guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetGuard() {
		return (Expression)getOwnedFeature().stream().
				filter(f->!f.isEnd() && f instanceof Expression).
				findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setGuard(Expression newGuard) {
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
			case SysMLPackage.CONDITIONAL_SUCCESSION__GUARD:
				if (resolve) return getGuard();
				return basicGetGuard();
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
			case SysMLPackage.CONDITIONAL_SUCCESSION__GUARD:
				setGuard((Expression)newValue);
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
			case SysMLPackage.CONDITIONAL_SUCCESSION__GUARD:
				setGuard((Expression)null);
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
			case SysMLPackage.CONDITIONAL_SUCCESSION__GUARD:
				return basicGetGuard() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		return getOwnedSubsettingWithDefault(CONDITIONAL_SUCCESSION_SUBSETTING_DEFAULT);
	}

	@Override
	public List<? extends Feature> getRelevantFeatures() {
		return Collections.singletonList(getGuard());
	}
	
} //ConditionalSuccessionImpl
