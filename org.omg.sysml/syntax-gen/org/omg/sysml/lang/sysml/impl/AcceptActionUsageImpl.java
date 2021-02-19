/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Action Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AcceptActionUsageImpl#getReceiverArgument <em>Receiver Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcceptActionUsageImpl extends ActionUsageImpl implements AcceptActionUsage {
	
	public static final String ACCEPT_ACTION_SUBSETTING_BASE_DEFAULT = "Actions::acceptActions";
	public static final String ACCEPT_ACTION_SUBSETTING_SUBACTION_DEFAULT = "Actions::Action::acceptSubactions";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ACCEPT_ACTION_USAGE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getReceiverArgument() {
		Expression receiverArgument = basicGetReceiverArgument();
		return receiverArgument != null && receiverArgument.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)receiverArgument) : receiverArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetReceiverArgument() {
		Feature receiverParameter = getReceiverParameter();
		if (receiverParameter != null) {
			FeatureValue valuation = ((FeatureImpl)receiverParameter).getValuation();
			if (valuation != null) {
				return valuation.getValue();
			}
		}
		return null;
	}
	
	@Override
	protected String getDefaultSupertype() {
		return isSubperformance()? 
					ACCEPT_ACTION_SUBSETTING_SUBACTION_DEFAULT:
					ACCEPT_ACTION_SUBSETTING_BASE_DEFAULT;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setReceiverArgument(Expression newReceiverArgument) {
		throw new UnsupportedOperationException();
	}
	
	// Other

	public Feature getItemsParameter() {
		List<Feature> parameters = getOwnedParameters();
		return parameters.isEmpty()? null: parameters.get(0);
	}

	public Feature getReceiverParameter() {
		List<Feature> parameters = getOwnedParameters();
		return parameters.size() < 2? null: parameters.get(1);
	}
	
	/**
	 * The default receiver is the outermost containing ActionUsage of this AcceptActionUsage
	 * (or this AcceptActionUsage if it is not contained in any other ActionUsage), unless that
	 * ActionUsage is itself owned by an ActionDefinition.
	 */
	// TODO: Determine a default receiver for an AcceptActionUsage contained in an ActionDefinition.
	protected Feature getDefaultReceiver() {
		Feature receiver = this;
		Element owner = receiver.getOwner();
		while (owner instanceof ActionUsage) {
			receiver = (Feature)owner;
			owner = receiver.getOwner();
		}
		return owner instanceof ActionDefinition? null: receiver;
	}
	
	public void addDefaultReceiverBinding() {
		Feature receiverParameter = getReceiverParameter();
		if (receiverParameter != null) {
			addImplicitBindingConnector(getDefaultReceiver(), receiverParameter);
		}
	}
	
	@Override
	public void transform() {
		addDefaultReceiverBinding();
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
			case SysMLPackage.ACCEPT_ACTION_USAGE__RECEIVER_ARGUMENT:
				if (resolve) return getReceiverArgument();
				return basicGetReceiverArgument();
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
			case SysMLPackage.ACCEPT_ACTION_USAGE__RECEIVER_ARGUMENT:
				setReceiverArgument((Expression)newValue);
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
			case SysMLPackage.ACCEPT_ACTION_USAGE__RECEIVER_ARGUMENT:
				setReceiverArgument((Expression)null);
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
			case SysMLPackage.ACCEPT_ACTION_USAGE__RECEIVER_ARGUMENT:
				return basicGetReceiverArgument() != null;
		}
		return super.eIsSet(featureID);
	}

} //AcceptActionUsageImpl
