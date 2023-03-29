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
package org.omg.sysml.lang.sysml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transition Feature Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * <p>A <code>TransitionActionKind</code> indicates whether the <code>transitionFeature</code> of a <code>TransitionFeatureMembership</code> is a trigger, guard or effect.</p>
 * <!-- end-model-doc -->
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionFeatureKind()
 * @model
 * @generated
 */
public enum TransitionFeatureKind implements Enumerator {
	/**
	 * The '<em><b>Trigger</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates that the <code>transitionFeature</code> of a <code>TransitionFeatureMembership</code> is a <code>triggerAction</code>.</p>
	 * <!-- end-model-doc -->
	 * @see #TRIGGER_VALUE
	 * @generated
	 * @ordered
	 */
	TRIGGER(0, "trigger", "trigger"),

	/**
	 * The '<em><b>Guard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates that the <code>transitionFeature</code> of a <code>TransitionFeatureMembership</code> is a <code>guardExpression</code>.</p>
	 * <!-- end-model-doc -->
	 * @see #GUARD_VALUE
	 * @generated
	 * @ordered
	 */
	GUARD(1, "guard", "guard"),

	/**
	 * The '<em><b>Effect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates that the <code>transitionFeature</code> of a <code>TransitionFeatureMembership</code> is an <code>effectAction</code>.</p>
	 * <!-- end-model-doc -->
	 * @see #EFFECT_VALUE
	 * @generated
	 * @ordered
	 */
	EFFECT(2, "effect", "effect");

	/**
	 * The '<em><b>Trigger</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates that the <code>transitionFeature</code> of a <code>TransitionFeatureMembership</code> is a <code>triggerAction</code>.</p>
	 * <!-- end-model-doc -->
	 * @see #TRIGGER
	 * @model name="trigger"
	 * @generated
	 * @ordered
	 */
	public static final int TRIGGER_VALUE = 0;

	/**
	 * The '<em><b>Guard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates that the <code>transitionFeature</code> of a <code>TransitionFeatureMembership</code> is a <code>guardExpression</code>.</p>
	 * <!-- end-model-doc -->
	 * @see #GUARD
	 * @model name="guard"
	 * @generated
	 * @ordered
	 */
	public static final int GUARD_VALUE = 1;

	/**
	 * The '<em><b>Effect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates that the <code>transitionFeature</code> of a <code>TransitionFeatureMembership</code> is an <code>effectAction</code>.</p>
	 * <!-- end-model-doc -->
	 * @see #EFFECT
	 * @model name="effect"
	 * @generated
	 * @ordered
	 */
	public static final int EFFECT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Transition Feature Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransitionFeatureKind[] VALUES_ARRAY =
		new TransitionFeatureKind[] {
			TRIGGER,
			GUARD,
			EFFECT,
		};

	/**
	 * A public read-only list of all the '<em><b>Transition Feature Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransitionFeatureKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transition Feature Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransitionFeatureKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransitionFeatureKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transition Feature Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransitionFeatureKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransitionFeatureKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transition Feature Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransitionFeatureKind get(int value) {
		switch (value) {
			case TRIGGER_VALUE: return TRIGGER;
			case GUARD_VALUE: return GUARD;
			case EFFECT_VALUE: return EFFECT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TransitionFeatureKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TransitionFeatureKind
