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
 * <!-- begin-user-doc --> A representation of the literals of the enumeration
 * '<em><b>Visibility Kind</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * <p><code>VisibilityKind</code> is an enumeration whose literals specify the visibility of a <code>Membership</code> of an <code>Element</code> in a <code>Namespace</code> outside of that <code>Namespace</code>. Note that &quot;visibility&quot; specifically restricts whether an <code>Element</code> in a <code>Namespace</code> may be referenced by name from outside the <code>Namespace</code> and only otherwise restricts access to an <code>Element</code> as provided by specific constraints in the abstract syntax (e.g., preventing the import or inheritance of private <code>Elements</code>).</p>
 * 
 * <!-- end-model-doc -->
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getVisibilityKind()
 * @model
 * @generated
 */
public enum VisibilityKind implements Enumerator {
	/**
	 * The '<em><b>Private</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates a <code>Membership</code> is not visible outside its owning <code>Namespace</code>.</p>
	 * <!-- end-model-doc -->
	 * @see #PRIVATE_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVATE(0, "private", "private"),

	/**
	 * The '<em><b>Protected</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An intermediate level of visibility between <code>public</code> and <code>private</code>. By default, it is equivalent to <code>private</code> for the purposes of normal access to and import of <code>Elements</code> from a <code>Namespace</code>. However, other <code>Relationships</code> may be specified to include <code>Memberships</code> with <code>protected</code> visibility in the list of <code>memberships</code> for a <code>Namespace</code> (e.g., <code>Specialization</code>).</p>
	 * 
	 * <!-- end-model-doc -->
	 * @see #PROTECTED_VALUE
	 * @generated
	 * @ordered
	 */
	PROTECTED(1, "protected", "protected"), /**
	 * The '<em><b>Public</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates that a <code>Membership</code> is publicly visible outside its owning <code>Namespace</code>.</p>
	 * <!-- end-model-doc -->
	 * @see #PUBLIC_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLIC(2, "public", "public");

	/**
	 * The '<em><b>Private</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Private</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates a <code>Membership</code> is not visible outside its owning <code>Namespace</code>.</p>
	 * <!-- end-model-doc -->
	 * @see #PRIVATE
	 * @model name="private"
	 * @generated
	 * @ordered
	 */
	public static final int PRIVATE_VALUE = 0;

	/**
	 * The '<em><b>Protected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Protected</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An intermediate level of visibility between <code>public</code> and <code>private</code>. By default, it is equivalent to <code>private</code> for the purposes of normal access to and import of <code>Elements</code> from a <code>Namespace</code>. However, other <code>Relationships</code> may be specified to include <code>Memberships</code> with <code>protected</code> visibility in the list of <code>memberships</code> for a <code>Namespace</code> (e.g., <code>Specialization</code>).</p>
	 * 
	 * <!-- end-model-doc -->
	 * @see #PROTECTED
	 * @model name="protected"
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_VALUE = 1;

	/**
	 * The '<em><b>Public</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Public</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates that a <code>Membership</code> is publicly visible outside its owning <code>Namespace</code>.</p>
	 * <!-- end-model-doc -->
	 * @see #PUBLIC
	 * @model name="public"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC_VALUE = 2;

	/**
	 * An array of all the '<em><b>Visibility Kind</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final VisibilityKind[] VALUES_ARRAY = new VisibilityKind[] {
			PRIVATE,
			PROTECTED,
			PUBLIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Visibility Kind</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VisibilityKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Visibility Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VisibilityKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VisibilityKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Visibility Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VisibilityKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VisibilityKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Visibility Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VisibilityKind get(int value) {
		switch (value) {
			case PRIVATE_VALUE: return PRIVATE;
			case PROTECTED_VALUE: return PROTECTED;
			case PUBLIC_VALUE: return PUBLIC;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private VisibilityKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // VisibilityKind
