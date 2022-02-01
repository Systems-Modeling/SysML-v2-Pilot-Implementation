/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ForLoopActionUsage;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Loop Action Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ForLoopActionUsageImpl#getSeqArgument <em>Seq Argument</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ForLoopActionUsageImpl#getLoopVariable <em>Loop Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForLoopActionUsageImpl extends LoopActionUsageImpl implements ForLoopActionUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForLoopActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FOR_LOOP_ACTION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceUsage getLoopVariable() {
		ReferenceUsage loopVariable = basicGetLoopVariable();
		return loopVariable != null && loopVariable.eIsProxy() ? (ReferenceUsage)eResolveProxy((InternalEObject)loopVariable) : loopVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ReferenceUsage basicGetLoopVariable() {
		return (ReferenceUsage)getOwnedFeature().stream().
				findFirst().
				filter(ReferenceUsage.class::isInstance).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setLoopVariable(ReferenceUsage newLoopVariable) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getSeqArgument() {
		Expression seqArgument = basicGetSeqArgument();
		return seqArgument != null && seqArgument.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)seqArgument) : seqArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetSeqArgument() {
		List<Feature> parameters = TypeUtil.getOwnedParametersOf(this);
		return parameters.isEmpty()? null: FeatureUtil.getValueExpressionFor(parameters.get(0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSeqArgument(Expression newSeqArgument) {
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
			case SysMLPackage.FOR_LOOP_ACTION_USAGE__SEQ_ARGUMENT:
				if (resolve) return getSeqArgument();
				return basicGetSeqArgument();
			case SysMLPackage.FOR_LOOP_ACTION_USAGE__LOOP_VARIABLE:
				if (resolve) return getLoopVariable();
				return basicGetLoopVariable();
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
			case SysMLPackage.FOR_LOOP_ACTION_USAGE__SEQ_ARGUMENT:
				setSeqArgument((Expression)newValue);
				return;
			case SysMLPackage.FOR_LOOP_ACTION_USAGE__LOOP_VARIABLE:
				setLoopVariable((ReferenceUsage)newValue);
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
			case SysMLPackage.FOR_LOOP_ACTION_USAGE__SEQ_ARGUMENT:
				setSeqArgument((Expression)null);
				return;
			case SysMLPackage.FOR_LOOP_ACTION_USAGE__LOOP_VARIABLE:
				setLoopVariable((ReferenceUsage)null);
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
			case SysMLPackage.FOR_LOOP_ACTION_USAGE__SEQ_ARGUMENT:
				return basicGetSeqArgument() != null;
			case SysMLPackage.FOR_LOOP_ACTION_USAGE__LOOP_VARIABLE:
				return basicGetLoopVariable() != null;
		}
		return super.eIsSet(featureID);
	}

} //ForLoopActionUsageImpl
