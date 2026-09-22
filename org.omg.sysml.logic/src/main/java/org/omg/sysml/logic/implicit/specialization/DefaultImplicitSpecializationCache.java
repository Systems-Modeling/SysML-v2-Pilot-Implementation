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
package org.omg.sysml.logic.implicit.specialization;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.logic.implicit.specialization.api.ImplicitSpecialization;
import org.omg.sysml.logic.implicit.specialization.api.IImplicitSpecializationCache;

/** Default in-memory {@link IImplicitSpecializationCache}, attached to a Type as an EMF adapter. */
public final class DefaultImplicitSpecializationCache extends AdapterImpl implements IImplicitSpecializationCache {

	private List<ImplicitSpecialization> candidates;
	private Map<EClass, List<ImplicitSpecialization>> candidatesByKind;
	private List<ImplicitSpecialization> reduced;
	private boolean complete;
	private boolean reducedComplete;
	private boolean redefinitionsStable;

	@Override
	public List<ImplicitSpecialization> getCandidates() {
		return candidates;
	}

	@Override
	public void setCandidates(List<ImplicitSpecialization> candidates, boolean complete) {
		this.candidates = candidates;
		this.complete = complete;
		candidatesByKind = null;
	}

	@Override
	public boolean isComplete() {
		return complete;
	}

	@Override
	public List<ImplicitSpecialization> getCandidatesOfKind(EClass kind) {
		if (candidates == null) {
			return null;
		}
		if (candidatesByKind == null) {
			candidatesByKind = new HashMap<>();
		}
		return candidatesByKind.computeIfAbsent(kind, key -> candidates.stream().
				filter(candidate -> candidate.specializationKind() == key).toList());
	}

	@Override
	public List<ImplicitSpecialization> getReduced() {
		return reduced;
	}

	@Override
	public void setReduced(List<ImplicitSpecialization> reduced, boolean complete) {
		this.reduced = reduced;
		this.reducedComplete = complete;
	}

	@Override
	public boolean isReducedComplete() {
		return reducedComplete;
	}

	@Override
	public boolean areRedefinitionsStable() {
		return redefinitionsStable;
	}

	@Override
	public void setRedefinitionsStable(boolean stable) {
		this.redefinitionsStable = stable;
	}

	@Override
	public void invalidate() {
		candidates = null;
		candidatesByKind = null;
		reduced = null;
		complete = false;
		reducedComplete = false;
		redefinitionsStable = false;
	}
}
