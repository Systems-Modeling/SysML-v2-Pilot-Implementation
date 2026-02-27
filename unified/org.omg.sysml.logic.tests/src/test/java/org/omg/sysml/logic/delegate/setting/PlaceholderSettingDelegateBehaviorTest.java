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

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.SysMLFactory;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * Behavior regression tests for setting delegates still using placeholder fallback implementations.
 */
public class PlaceholderSettingDelegateBehaviorTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void placeholderDelegatesKeepNeutralDefaultBehavior() {
        assertNeutralDefault("Feature", "owningType");
        assertNeutralDefault("CalculationDefinition", "calculation");
        assertNeutralDefault("Annotation", "owningAnnotatingElement");
        assertNeutralDefault("AnnotatingElement", "owningAnnotatingRelationship");
        assertNeutralDefault("MetadataAccessExpression", "referencedElement");
        assertNeutralDefault("OwningMembership", "ownedMemberElement");
    }

    private void assertNeutralDefault(String eClassName, String featureName) {
        var owner = createOwner(eClassName);
        var feature = findFeature(eClassName, featureName);
        var value = semantics.evaluateSetting(eClassName, featureName, owner);

        if (feature.isMany()) {
            assertNotNull(value, () -> eClassName + "." + featureName + " must not return null for multi-valued feature");
            assertTrue(value instanceof EList<?>, () -> eClassName + "." + featureName + " must return an EList");
            assertTrue(((EList<?>) value).isEmpty(), () -> eClassName + "." + featureName + " must return an empty list");
        } else {
            assertNull(value, () -> eClassName + "." + featureName + " must return null");
        }
    }

    private Object createOwner(String eClassName) {
        var eClass = (EClass) SysMLPackage.eINSTANCE.getEClassifier(eClassName);
        return SysMLFactory.eINSTANCE.create(eClass);
    }

    private EStructuralFeature findFeature(String eClassName, String featureName) {
        var eClass = (EClass) SysMLPackage.eINSTANCE.getEClassifier(eClassName);
        for (var feature : eClass.getEAllStructuralFeatures()) {
            if (featureName.equals(feature.getName())) {
                return feature;
            }
        }
        throw new IllegalStateException("Feature not found: " + eClassName + "." + featureName);
    }
}
