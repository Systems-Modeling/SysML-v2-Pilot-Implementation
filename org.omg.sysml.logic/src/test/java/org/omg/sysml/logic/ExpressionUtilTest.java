/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of theEclipse Public License
 * along with this program. If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *
 *******************************************************************************/

package org.omg.sysml.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.omg.sysml.lang.sysml.ConstructorExpression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.InstantiationExpression;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

/**
 * Tests derived instantiation arguments.
 */
public class ExpressionUtilTest {

	/**
	 * Verifies that invocation and constructor arguments are derived from valued
	 * features that redefine the instantiated type features.
	 */
	@Test
	public void getArgumentOfReturnsValuedRedefinitionsForBothInstantiationKinds() {
		SysMLLogicStandaloneSetup.doSetup();

		Type instantiatedType = SysMLFactory.eINSTANCE.createBehavior();
		Feature input = SysMLFactory.eINSTANCE.createFeature();
		input.setDirection(FeatureDirectionKind.IN);
		TypeUtil.addOwnedFeatureTo(instantiatedType, input);

		InvocationExpression invocation = SysMLFactory.eINSTANCE.createInvocationExpression();
		setInstantiatedType(invocation, instantiatedType);
		LiteralInteger invocationValue = SysMLFactory.eINSTANCE.createLiteralInteger();
		Feature invocationArgument = valuedRedefinitionOf(input, invocationValue);
		TypeUtil.addOwnedFeatureTo(invocation, invocationArgument);
		TypeUtil.addOwnedFeatureTo(invocation, valuedRedefinitionOf(input, null));
		assertEquals(List.of(invocationValue), ExpressionUtil.getArgumentOf(invocation));

		ConstructorExpression constructor = SysMLFactory.eINSTANCE.createConstructorExpression();
		setInstantiatedType(constructor, instantiatedType);
		TypeUtil.addResultParameterTo(constructor);
		LiteralInteger constructorValue = SysMLFactory.eINSTANCE.createLiteralInteger();
		Feature constructorArgument = valuedRedefinitionOf(input, constructorValue);
		TypeUtil.addOwnedFeatureTo(TypeUtil.getOwnedResultParameterOf(constructor), constructorArgument);
		assertEquals(List.of(constructorValue), ExpressionUtil.getArgumentOf(constructor));
	}

	/**
	 * Verifies that incomplete instantiations have no derived arguments.
	 */
	@Test
	public void getArgumentOfReturnsEmptyForIncompleteInstantiations() {
		SysMLLogicStandaloneSetup.doSetup();

		assertTrue(ExpressionUtil.getArgumentOf(SysMLFactory.eINSTANCE.createInvocationExpression()).isEmpty());
		ConstructorExpression constructor = SysMLFactory.eINSTANCE.createConstructorExpression();
		setInstantiatedType(constructor, SysMLFactory.eINSTANCE.createBehavior());
		assertTrue(ExpressionUtil.getArgumentOf(constructor).isEmpty());
	}

	/**
	 * Adds the ordinary membership from which an instantiation derives its type.
	 *
	 * @param expression
	 *            the instantiation expression
	 * @param type
	 *            the instantiated type
	 */
	private void setInstantiatedType(InstantiationExpression expression, Type type) {
		Membership membership = SysMLFactory.eINSTANCE.createMembership();
		membership.setMemberElement(type);
		expression.getOwnedRelationship().add(membership);
	}

	/**
	 * Creates an argument feature that redefines a type feature and has a value.
	 *
	 * @param redefinedFeature
	 *            the instantiated type feature being redefined
	 * @param value
	 *            the optional argument value
	 * @return the configured argument feature
	 */
	private Feature valuedRedefinitionOf(Feature redefinedFeature, LiteralInteger value) {
		Feature argument = SysMLFactory.eINSTANCE.createFeature();
		Redefinition redefinition = SysMLFactory.eINSTANCE.createRedefinition();
		redefinition.setRedefiningFeature(argument);
		redefinition.setRedefinedFeature(redefinedFeature);
		argument.getOwnedRelationship().add(redefinition);
		if (value != null) {
			FeatureUtil.addFeatureValueTo(argument, value);
		}
		return argument;
	}
}
