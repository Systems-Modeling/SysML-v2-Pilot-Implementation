/**
 */
package org.omg.sysml.lang.sysml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Trigger Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * <p><code>TriggerKind</code> enumerates the kinds of triggers that can be represented by a <code>TriggerInvocationExpression</code>.</p>
 * <!-- end-model-doc -->
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTriggerKind()
 * @model
 * @generated
 */
public enum TriggerKind implements Enumerator {
	/**
	 * The '<em><b>When</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates a <em>change trigger</em>, corresponding to the <em><code>TriggerWhen</code></em> <code>Function</code> from the <em><code>Triggers</code></em> model in the Kernel Semantic Library.</p>
	 * <!-- end-model-doc -->
	 * @see #WHEN_VALUE
	 * @generated
	 * @ordered
	 */
	WHEN(0, "when", "when"),

	/**
	 * The '<em><b>At</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates an <em>absolute time trigger</em>, corresponding to the <em><code>TriggerAt</code></em> <code>Function</code> from the <em><code>Triggers</code></em> model in the Kernel Semantic Library.</p>
	 * <!-- end-model-doc -->
	 * @see #AT_VALUE
	 * @generated
	 * @ordered
	 */
	AT(1, "at", "at"),

	/**
	 * The '<em><b>After</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates a <em>relative time trigger</em>, corresponding to the <em><code>TriggerAfter</code></em> <code>Function</code> from the <em><code>Triggers</code></em> model in the <code>Kernel Semantic Library.</p>
	 * <!-- end-model-doc -->
	 * @see #AFTER_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER(2, "after", "after");

	/**
	 * The '<em><b>When</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates a <em>change trigger</em>, corresponding to the <em><code>TriggerWhen</code></em> <code>Function</code> from the <em><code>Triggers</code></em> model in the Kernel Semantic Library.</p>
	 * <!-- end-model-doc -->
	 * @see #WHEN
	 * @model name="when"
	 * @generated
	 * @ordered
	 */
	public static final int WHEN_VALUE = 0;

	/**
	 * The '<em><b>At</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates an <em>absolute time trigger</em>, corresponding to the <em><code>TriggerAt</code></em> <code>Function</code> from the <em><code>Triggers</code></em> model in the Kernel Semantic Library.</p>
	 * <!-- end-model-doc -->
	 * @see #AT
	 * @model name="at"
	 * @generated
	 * @ordered
	 */
	public static final int AT_VALUE = 1;

	/**
	 * The '<em><b>After</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates a <em>relative time trigger</em>, corresponding to the <em><code>TriggerAfter</code></em> <code>Function</code> from the <em><code>Triggers</code></em> model in the <code>Kernel Semantic Library.</p>
	 * <!-- end-model-doc -->
	 * @see #AFTER
	 * @model name="after"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Trigger Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TriggerKind[] VALUES_ARRAY =
		new TriggerKind[] {
			WHEN,
			AT,
			AFTER,
		};

	/**
	 * A public read-only list of all the '<em><b>Trigger Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TriggerKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Trigger Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TriggerKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TriggerKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trigger Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TriggerKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TriggerKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trigger Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TriggerKind get(int value) {
		switch (value) {
			case WHEN_VALUE: return WHEN;
			case AT_VALUE: return AT;
			case AFTER_VALUE: return AFTER;
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
	private TriggerKind(int value, String name, String literal) {
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
	
} //TriggerKind
