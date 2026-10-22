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

package org.omg.sysml.xtext.postprocessing;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.omg.kerml.xtext.postprocessing.FeatureParserPostProcessor;
import org.omg.sysml.lang.sysml.AttributeDefinition;
import org.omg.sysml.lang.sysml.AttributeUsage;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.UsageUtil;

public class UsageParserPostProcessor extends FeatureParserPostProcessor {

    private static final List<EClass> NON_COMPOSITE_USAGE_TYPES = List.of(
            SysMLPackage.Literals.ATTRIBUTE_USAGE,
            SysMLPackage.Literals.BINDING_CONNECTOR_AS_USAGE,
            SysMLPackage.Literals.EVENT_OCCURRENCE_USAGE,
            SysMLPackage.Literals.EXHIBIT_STATE_USAGE,
            SysMLPackage.Literals.INCLUDE_USE_CASE_USAGE,
            SysMLPackage.Literals.PERFORM_ACTION_USAGE,
            SysMLPackage.Literals.REFERENCE_USAGE,
            SysMLPackage.Literals.SUCCESSION_AS_USAGE);

	public UsageParserPostProcessor(Usage element) {
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
        Type featuringType = UsageUtil.getExpectedFeaturingTypeOf(target);
        if (target.getDirection() != null || target.isEnd() || featuringType == null ||
                featuringType instanceof AttributeDefinition || featuringType instanceof AttributeUsage) {
			target.setIsComposite(false);
		}
		if (isAddMultiplicity()) {
			TypeUtil.addMultiplicityTo(getTarget());
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

	/**
	 * Check whether a default multiplicity should be added.
	 * For use by attribute, item and port post-processor subclasses.
	 * Usages with explicit owned redefinitions do not get a default,
	 * except that end usages always receive the default.
	 * 
	 * TODO: Update as necessary after final resolution of SYSML21-185.
	 */
	protected boolean isAddDefaultMultiplicity() {
		Usage target = getTarget();
		return target.isEnd() || 
			   target.getOwningType() != null &&
			   target.getOwnedRelationship().stream().
			   		filter(rel->!rel.isImplied()).
			   		noneMatch(Redefinition.class::isInstance);
	}

	/**
	 * Check if a default multiplicity must be added to the usage.
	 * Multiplicity of 1..1 is always the default for an end usage.
	 * This method is overridden to call isAddDefaultMultiplicity in
	 * the post-processors for kinds of usages that have defaults.
	 */
	protected boolean isAddMultiplicity() {
		return getTarget().isEnd();
	}
}
