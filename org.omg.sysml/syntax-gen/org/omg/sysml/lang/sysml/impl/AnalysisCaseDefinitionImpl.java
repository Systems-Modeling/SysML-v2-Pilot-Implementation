/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.AnalysisCaseDefinition;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Case Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnalysisCaseDefinitionImpl#getAnalysisAction <em>Analysis Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnalysisCaseDefinitionImpl#getResultExpression <em>Result Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisCaseDefinitionImpl extends CaseDefinitionImpl implements AnalysisCaseDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisCaseDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ANALYSIS_CASE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ActionUsage> getAnalysisAction() {
		return new DerivedEObjectEList<>(ActionUsage.class, this, SysMLPackage.ANALYSIS_CASE_DEFINITION__ANALYSIS_ACTION, new int[] {SysMLPackage.ANALYSIS_CASE_DEFINITION__ACTION});

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getResultExpression() {
		Expression resultExpression = basicGetResultExpression();
		return resultExpression != null && resultExpression.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)resultExpression) : resultExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetResultExpression() {
		EList<Feature> ownedFeatures = getOwnedFeature();
		for (int i = ownedFeatures.size() - 1; i >= 0; i--) {
			Feature ownedFeature = ownedFeatures.get(i);
			if (ownedFeature instanceof Expression) {
				return (Expression)ownedFeature;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setResultExpression(Expression newResultExpression) {
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
			case SysMLPackage.ANALYSIS_CASE_DEFINITION__ANALYSIS_ACTION:
				return getAnalysisAction();
			case SysMLPackage.ANALYSIS_CASE_DEFINITION__RESULT_EXPRESSION:
				if (resolve) return getResultExpression();
				return basicGetResultExpression();
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
			case SysMLPackage.ANALYSIS_CASE_DEFINITION__ANALYSIS_ACTION:
				getAnalysisAction().clear();
				getAnalysisAction().addAll((Collection<? extends ActionUsage>)newValue);
				return;
			case SysMLPackage.ANALYSIS_CASE_DEFINITION__RESULT_EXPRESSION:
				setResultExpression((Expression)newValue);
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
			case SysMLPackage.ANALYSIS_CASE_DEFINITION__ANALYSIS_ACTION:
				getAnalysisAction().clear();
				return;
			case SysMLPackage.ANALYSIS_CASE_DEFINITION__RESULT_EXPRESSION:
				setResultExpression((Expression)null);
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
			case SysMLPackage.ANALYSIS_CASE_DEFINITION__ANALYSIS_ACTION:
				return !getAnalysisAction().isEmpty();
			case SysMLPackage.ANALYSIS_CASE_DEFINITION__RESULT_EXPRESSION:
				return basicGetResultExpression() != null;
		}
		return super.eIsSet(featureID);
	}

} //AnalysisCaseDefinitionImpl
