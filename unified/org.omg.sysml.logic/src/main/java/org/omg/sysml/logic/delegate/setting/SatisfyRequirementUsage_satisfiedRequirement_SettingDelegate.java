/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *
 *******************************************************************************/
package org.omg.sysml.logic.delegate.setting;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.logic.delegate.AbstractSettingDelegate;
import org.omg.sysml.model.sysml.RequirementUsage;
import org.omg.sysml.model.sysml.SatisfyRequirementUsage;

/**
 * Generated setting delegate for {@code SatisfyRequirementUsage.satisfiedRequirement}.
 */
public class SatisfyRequirementUsage_satisfiedRequirement_SettingDelegate extends AbstractSettingDelegate {

    public SatisfyRequirementUsage_satisfiedRequirement_SettingDelegate(EStructuralFeature feature) {
        super(feature);
    }

    protected String delegateId() {
        return "SatisfyRequirementUsage.satisfiedRequirement";
    }

    /**
     * @generated NOT
     */
    @Override
    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
        /*
         * redefines fallback for SatisfyRequirementUsage.satisfiedRequirement
         * redefines AssertConstraintUsage.assertedConstraint
         * The RequirementUsage asserted by this SatisfyRequirementUsage.
         *
         * This implementation intentionally avoids sourcing from AssertConstraintUsage.assertedConstraint,
         * because in SatisfyRequirementUsageImpl that accessor is itself derived from
         * getSatisfiedRequirement(), which would create recursion.
         */
        Object result = null;
        if (owner instanceof SatisfyRequirementUsage self) {
            var referencedFeatureTarget = self.referencedFeatureTarget();
            if (referencedFeatureTarget == null) {
                result = self;
            } else if (referencedFeatureTarget instanceof RequirementUsage requirementUsage) {
                result = requirementUsage;
            }
        }
        return result;
    }
}
