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
package org.omg.sysml.logic.implicit.specialization.api;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Type;

/**
 * Model-thread-confined implicit specialization queries. Query results are immutable snapshots
 * referencing live EMF objects. Null types yield empty lists. Queries may resolve references and
 * create derived members, but do not materialize the reported relationships.
 * <p>
 * <b>Reentrant calls and provisional results.</b> The rules computing the specializations of a
 * Type call this service for other Types. Such a reentrant call can reach a Type whose own
 * computation is still in progress, for example through a cycle, or depend on data that cannot
 * be resolved yet. The result it depends on is then provisional, and so is the computation of the
 * Type that made the call, transitively. A provisional result is still returned, and cached when
 * the Type has a cache; it is not recomputed automatically. The returned list does not tell
 * whether it is provisional: {@link IImplicitSpecializationCache#isComplete()} and
 * {@link IImplicitSpecializationCache#isReducedComplete()} expose it for a Type that has a cache.
 * A call made outside any computation is never itself marked provisional.
 */
public interface IImplicitSpecializationService {

	/**
	 * Returns the raw candidates of {@code type}: every rule result, without redundancy
	 * filtering.
	 * <p>
	 * When called reentrantly for a Type whose computation is in progress, returns its current
	 * working candidates and makes the calling computation provisional (see the interface
	 * documentation).
	 */
	List<ImplicitSpecialization> getImplicitSpecializationCandidates(Type type);

	/**
	 * Returns the reduced view of {@code type}: the raw candidates without those already covered
	 * by another explicit or inferred general. It does not insert the relationships into the
	 * model and does not require the Pilot transformation. The reduced view is provisional when
	 * the raw candidates or the generals it depends on are (see the interface documentation).
	 * <p>
	 * Example: given
	 * <pre>{@code
	 * part def Vehicle;
	 * part def Car :> Vehicle;
	 * }</pre>
	 * the raw rules infer {@code Parts::Part} for both definitions, but the reduced view of
	 * {@code Car} omits it because {@code Vehicle} already specializes it.
	 */
	List<ImplicitSpecialization> getImplicitSpecializations(Type type);

	/**
	 * Returns the raw candidates of {@code type} of exactly the given specialization
	 * {@code kind}, such as {@code SysMLPackage.Literals.REDEFINITION}.
	 * <p>
	 * When called reentrantly for {@code REDEFINITION} while {@code type} itself is being computed,
	 * returns its redefinitions computed so far once the {@code REDEFINITION} rule family has
	 * completed without provisional dependency, instead of reentering the computation (see the
	 * interface documentation). The families are defined in the "Computation order" section of
	 * {@code org.omg.sysml.logic/doc/implicit-specialization.md}.
	 */
	List<ImplicitSpecialization> getCandidatesOfKind(Type type, EClass kind);

	/**
	 * Tests whether a computation or reduction of this service is in progress in the model of
	 * {@code type}, that is whether a query for {@code type} made now would be a reentrant call
	 * (see the interface documentation). This is independent of whether {@code type} itself is
	 * being computed.
	 *
	 * @param type a type of the model to inspect
	 * @return {@code true} while a computation or reduction is in progress in that model
	 */
	boolean isEvaluationInProgress(Type type);

}
