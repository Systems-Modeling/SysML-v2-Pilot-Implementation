/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Binding
 * Connector</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class BindingConnectorImpl extends ConnectorImpl implements BindingConnector {

	public static final String BINDING_CONNECTOR_SUBSETTING_DEFAULT = "Objects::selfLinks";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.BINDING_CONNECTOR;
	}

	private void computeRelatedFeature() {
		EList<Feature> relatedFeatures = super.getRelatedFeature();
		if (relatedFeatures.isEmpty()) {
			Type owner = getOwningType();
			if (owner instanceof InvocationExpressionImpl) {
				int i = argIndex(owner);
				if (i >= 0) {
					for (int j = 0; j < 2; j++) {
						Feature feature = getRelatedFeature((InvocationExpressionImpl)owner, i, j);
						setRelatedFeature(j, feature);
						relatedFeatures.add(feature);
					}
				}
			}
		}
	}
	
	public Feature getRelatedFeatureFor(Feature end) {
		Type owner = getOwningType();
		return owner instanceof InvocationExpressionImpl?
			getRelatedFeature((InvocationExpressionImpl)owner, argIndex(owner), getConnectorEnd().indexOf(end)):
			null;
	}
	
	protected Feature getRelatedFeature(InvocationExpressionImpl expression, int argIndex, int endIndex) {
		List<Feature> inputs = expression.getInput();
		if (argIndex < inputs.size()) {
			Feature input = inputs.get(argIndex);
			if (endIndex == 0) {
				((FeatureImpl)input).forceComputeRedefinitions();
				List<Feature> redefinedFeatures = ((FeatureImpl)input).getRedefinedFeatures();
				if (!redefinedFeatures.isEmpty()) {
					Feature feature = redefinedFeatures.get(0);
					if (feature != null) {
						List<Expression> arguments = expression.getArgument();
						Expression argument = InvocationExpressionImpl.getArgumentForFeature(arguments, feature, argIndex);
						if (argument != null) {
							return argument.getResult();
						}
					}
				}
			} else if (endIndex == 1) {
				return input;
			}
		}
		return null;
	}
	
	protected int argIndex(Type expression) {
		return expression.getOwnedFeature().stream().filter(f->f instanceof BindingConnector)
				.collect(Collectors.toList()).indexOf(this);
	}
	
	public void update(List<Type> featuringTypes, Feature source, Feature target) {
		setRelatedFeature(0, source);
		setRelatedFeature(1, target);
		if (featuringTypes != null) {
			updateFeaturingTypes(featuringTypes);
		}
	}
	
	@Override
	public void transform() {
		super.transform();
		computeRelatedFeature();
	}

	@Override
	protected String getDefaultSupertype() {
		return BINDING_CONNECTOR_SUBSETTING_DEFAULT;
	}
	
} // BindingConnectorImpl
