/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChainExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.ExpressionUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Chain Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureChainExpressionImpl#getTargetFeature <em>Target Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureChainExpressionImpl extends OperatorExpressionImpl implements FeatureChainExpression {

	private static final String FEATURE_CHAIN_FUNCTION = ".";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureChainExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FEATURE_CHAIN_EXPRESSION;
	}

	@Override
	public String getOperator() {
		return FEATURE_CHAIN_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getTargetFeature() {
		Feature targetFeature = basicGetTargetFeature();
		return targetFeature != null && targetFeature.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)targetFeature) : targetFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetTargetFeature() {
		Element targetFeature = ExpressionUtil.getTargetFeatureFor(this);
		return targetFeature instanceof Feature? (Feature)targetFeature: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setTargetFeature(Feature newTargetFeature) {
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
			case SysMLPackage.FEATURE_CHAIN_EXPRESSION__TARGET_FEATURE:
				if (resolve) return getTargetFeature();
				return basicGetTargetFeature();
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
			case SysMLPackage.FEATURE_CHAIN_EXPRESSION__TARGET_FEATURE:
				setTargetFeature((Feature)newValue);
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
			case SysMLPackage.FEATURE_CHAIN_EXPRESSION__TARGET_FEATURE:
				setTargetFeature((Feature)null);
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
			case SysMLPackage.FEATURE_CHAIN_EXPRESSION__TARGET_FEATURE:
				return basicGetTargetFeature() != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureChainExpressionImpl
