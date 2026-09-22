/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2026 Obeo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License, version 2, as published by
 * the Eclipse Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of the Eclipse Public License
 * along with this program. If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 */
package org.omg.sysml.logic.implicit.specialization.rules;

import java.util.Set;
import java.util.function.BiFunction;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationEvaluationContext;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;

/**
 * One implicit-specialization rule run by {@link ImplicitSpecializationRules}. A rule implements
 * the implied relationships of one semantic constraint of the specification, or of constraints
 * that are mutually exclusive; its {@link #id()} names that constraint.
 * <p>
 * A rule is stateless: every call receives the Type being computed, its working result and the
 * request context. It applies to the Types whose metaclass is {@link #subjectClass()} or one of its
 * subclasses; a rule that depends on the owning type of a Feature tests it in its body. Rules are
 * declared with {@link #self}, or {@link #defaultKey} for the default generalization, then
 * {@link #excluding} when they replace other rules of their family.
 */
final class ImplicitSpecializationRule {

	/** What applying a rule means for the rest of the computation. */
	enum Outcome {
		/**
		 * The rule does not apply to this Type and must not have added anything to the working
		 * result. The engine removes nothing: this outcome only means that the rule's family and
		 * exclusions are not affected and, in a first-match family, that the next rule is tried.
		 */
		NOT_APPLICABLE,
		/** The rule applied; the computation continues normally. */
		APPLIED,
		/**
		 * The rule applied and fully determines the Type: the families after the current one are
		 * not run.
		 */
		APPLIED_DETERMINES,
		/**
		 * The rule applied and suppresses the fallback families (see
		 * {@link ImplicitSpecializationRuleFamily#isFallback()}).
		 */
		APPLIED_SUPPRESSES_FALLBACKS
	}

	/**
	 * The body of a rule, typed by its subject metaclass.
	 *
	 * @param <T> the Java interface of the subject metaclass
	 */
	@FunctionalInterface
	interface Body<T extends Type> {
		Outcome apply(T type, ImplicitSpecializationResult result, ImplicitSpecializationEvaluationContext context);
	}

	private final String id;
	private final ImplicitSpecializationRuleFamily family;
	private final EClass subjectClass;
	private final Set<String> excludes;
	private final Body<Type> body;

	private ImplicitSpecializationRule(String id, ImplicitSpecializationRuleFamily family, EClass subjectClass,
			Set<String> excludes, Body<Type> body) {
		this.id = id;
		this.family = family;
		this.subjectClass = subjectClass;
		this.excludes = excludes;
		this.body = body;
	}

	/**
	 * Declares a rule that applies to the Types of a metaclass and its subclasses.
	 *
	 * @param <T> the Java interface of the subject metaclass
	 * @param id the rule identifier
	 * @param family the rule family
	 * @param subjectType the Java interface of the subject metaclass
	 * @param body the rule body
	 * @return the rule, which excludes no other rule
	 */
	static <T extends Type> ImplicitSpecializationRule self(String id, ImplicitSpecializationRuleFamily family,
			Class<T> subjectType, Body<T> body) {
		return new ImplicitSpecializationRule(id, family, eClassOf(subjectType), Set.of(),
				(type, result, context) -> body.apply(subjectType.cast(type), result, context));
	}

	/**
	 * Declares a rule of the {@link ImplicitSpecializationRuleFamily#DEFAULT_KEY} family: it adds the
	 * library default mapped to the selected key for the concrete class of the Type, with the
	 * default specialization kind of the Type.
	 *
	 * @param <T> the Java interface of the subject metaclass
	 * @param id the rule identifier
	 * @param subjectType the Java interface of the subject metaclass
	 * @param keySelector selects the key in {@link org.omg.sysml.util.ImplicitGeneralizationMap}, or
	 *        returns {@code null} when the rule does not apply
	 * @return the rule
	 */
	static <T extends Type> ImplicitSpecializationRule defaultKey(String id, Class<T> subjectType,
			BiFunction<T, ImplicitSpecializationEvaluationContext, String> keySelector) {
		return self(id, ImplicitSpecializationRuleFamily.DEFAULT_KEY, subjectType, (type, result, context) -> {
			String key = keySelector.apply(type, context);
			if (key == null) {
				return Outcome.NOT_APPLICABLE;
			}
			SpecializationHelper.addMapped(result, type, SpecializationHelper.defaultKind(type), key);
			return Outcome.APPLIED;
		});
	}

	/**
	 * Returns the same rule, also excluding the given rules once it applies.
	 *
	 * @param excluded the identifiers of the excluded rules of the same family
	 * @return a new rule with these exclusions
	 */
	ImplicitSpecializationRule excluding(String... excluded) {
		return new ImplicitSpecializationRule(id, family, subjectClass, Set.of(excluded), body);
	}

	/**
	 * Returns the identifier of the rule: the name of the constraint it implements, or a semantic
	 * identifier documented by the rule when several constraints or none are involved. Unique
	 * among the registered rules.
	 *
	 * @return the rule identifier
	 */
	String id() {
		return id;
	}

	/**
	 * Returns the family that fixes when the rule runs.
	 *
	 * @return the rule family
	 */
	ImplicitSpecializationRuleFamily family() {
		return family;
	}

	/**
	 * Returns the metaclass of the Types to which the rule applies, including its subclasses.
	 *
	 * @return a metaclass of {@code SysMLPackage}
	 */
	EClass subjectClass() {
		return subjectClass;
	}

	/**
	 * Returns the identifiers of the rules of the same family that must not run for a Type once
	 * this rule has applied to it.
	 *
	 * @return the excluded rule identifiers, empty unless declared with {@link #excluding}
	 */
	Set<String> excludes() {
		return excludes;
	}

	/**
	 * Applies the rule to a Type whose metaclass is {@link #subjectClass()} or one of its
	 * subclasses.
	 *
	 * @param type the Type being computed
	 * @param result the working result of the Type
	 * @param context the request context
	 * @return what applying the rule means for the rest of the computation
	 */
	Outcome apply(Type type, ImplicitSpecializationResult result, ImplicitSpecializationEvaluationContext context) {
		return body.apply(type, result, context);
	}

	private static EClass eClassOf(Class<? extends Type> javaType) {
		EClassifier classifier = SysMLPackage.eINSTANCE.getEClassifier(javaType.getSimpleName());
		if (classifier instanceof EClass eClass) {
			return eClass;
		}
		throw new IllegalArgumentException(javaType.getName() + " is not a SysML metaclass");
	}
}
