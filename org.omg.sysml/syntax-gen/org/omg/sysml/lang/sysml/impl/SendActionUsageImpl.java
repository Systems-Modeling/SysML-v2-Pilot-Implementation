/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.SendActionUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Action Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SendActionUsageImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendActionUsageImpl extends TransferActionUsageImpl implements SendActionUsage {
	/**
	 * The cached value of the BindingConnector from the result of the target Expression of this SendAction to 
	 * its ItemFeature.
	 */
	protected BindingConnector targetConnector = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SEND_ACTION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getTarget() {
		Expression target = basicGetTarget();
		return target != null && target.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)target) : target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetTarget() {
		List<Expression> expressions = getOwnedExpressions();
		return expressions.size() < 2? null: expressions.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setTarget(Expression newTarget) {
		throw new UnsupportedOperationException();
	}
	
	public List<Expression> getOwnedExpressions() {
		return getOwnedFeature().stream().
				filter(f->f instanceof Expression).
				map(f->(Expression)f).
				collect(Collectors.toList());
	}
	
	@Override
	protected Feature getContextFeature() {
		Expression target = getTarget();
		return target == null? null: ((ExpressionImpl)target).getResult();
	}

	public ItemFeature getItemFeature() {
		return getOwnedFeature().stream().
				filter(f->f instanceof ItemFeature).
				map(f->(ItemFeature)f).
				findFirst().orElse(null);
	}
	
	public Feature getSource() {
		List<Expression> expressions = getOwnedExpressions();
		return expressions.isEmpty()? null: ((ExpressionImpl)expressions.get(0)).getResult();
	}

	public BindingConnector getTargetConnector() {
		targetConnector = makeBinding(targetConnector, getSource(), getItemFeature());
		return targetConnector;
	}
	
	@Override
	public EList<Feature> getFeature() {
		// TODO: Move to transform.
		getTargetConnector();
		return super.getFeature();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.SEND_ACTION_USAGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case SysMLPackage.SEND_ACTION_USAGE__TARGET:
				setTarget((Expression)newValue);
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
			case SysMLPackage.SEND_ACTION_USAGE__TARGET:
				setTarget((Expression)null);
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
			case SysMLPackage.SEND_ACTION_USAGE__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //SendActionUsageImpl
