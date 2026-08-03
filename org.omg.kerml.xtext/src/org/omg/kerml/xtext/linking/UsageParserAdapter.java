/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package org.omg.kerml.xtext.linking;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.util.UsageUtil;

public class UsageParserAdapter extends FeatureParserAdapter {

	private static final List<EClass> NON_COMPOSITE_USAGE_TYPES = List.of(
			SysMLPackage.Literals.ATTRIBUTE_USAGE,
			SysMLPackage.Literals.BINDING_CONNECTOR_AS_USAGE,
			SysMLPackage.Literals.EVENT_OCCURRENCE_USAGE,
			SysMLPackage.Literals.EXHIBIT_STATE_USAGE,
			SysMLPackage.Literals.INCLUDE_USE_CASE_USAGE,
			SysMLPackage.Literals.PERFORM_ACTION_USAGE,
			SysMLPackage.Literals.REFERENCE_USAGE,
			SysMLPackage.Literals.SUCCESSION_AS_USAGE);

	public UsageParserAdapter(Usage element) {
		super(element);
	}

	@Override
	public Usage getTarget() {
		return (Usage)super.getTarget();
	}

	@Override
	public void postProcess () {
		super.postProcess();
		Usage target = getTarget();
		setIsCompositeIfUnset(target);
		if (target.isVariation()) {
			target.setIsAbstract(true);
		}
		if (target.getDirection() != null || target.isEnd() || !UsageUtil.hasFeaturingType(target)) {
			target.setIsComposite(false);
		}
	}

	private void setIsCompositeIfUnset(Usage target) {
		boolean isCompositeSet = !NodeModelUtils.findNodesForFeature(
				target, SysMLPackage.Literals.FEATURE__IS_COMPOSITE).isEmpty();
		boolean isReferenceSet = !NodeModelUtils.findNodesForFeature(
				target, SysMLPackage.Literals.USAGE__IS_REFERENCE).isEmpty();
		if (!isCompositeSet && !isReferenceSet) {
			target.setIsComposite(isCompositeByDefault(target.eClass()));
		}
	}

	private static boolean isCompositeByDefault(EClass eClass) {
		return NON_COMPOSITE_USAGE_TYPES.stream().noneMatch(type -> type.isSuperTypeOf(eClass));
	}

	@Override
	protected void setIsVariableIfConstant() {
	}
}
