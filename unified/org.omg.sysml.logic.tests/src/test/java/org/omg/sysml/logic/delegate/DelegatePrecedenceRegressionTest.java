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
package org.omg.sysml.logic.delegate;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.omg.sysml.model.sysml.SysMLFactory;

/**
 * Regression tests for source precedence ordering in translated setting delegates.
 */
public class DelegatePrecedenceRegressionTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void specializationOwningTypePrefersOwningRelatedElementOverSpecific() {
        var specialization = SysMLFactory.eINSTANCE.createSpecialization();
        var owningType = SysMLFactory.eINSTANCE.createActionDefinition();
        var specificType = SysMLFactory.eINSTANCE.createPartDefinition();
        specialization.setOwningRelatedElement(owningType);
        specialization.setSpecific(specificType);

        assertSame(owningType, semantics.evaluateSetting("Specialization", "owningType", specialization));
    }

    @Test
    void featureInvertingOwningFeaturePrefersFeatureInvertedOverOwningRelatedElement() {
        var featureInverting = SysMLFactory.eINSTANCE.createFeatureInverting();
        var sourceFeature = SysMLFactory.eINSTANCE.createActionUsage();
        var owningRelatedFeature = SysMLFactory.eINSTANCE.createPartUsage();
        featureInverting.setFeatureInverted(sourceFeature);
        featureInverting.setOwningRelatedElement(owningRelatedFeature);

        assertSame(sourceFeature, semantics.evaluateSetting("FeatureInverting", "owningFeature", featureInverting));
    }

    @Test
    void annotationOwningAnnotatedElementPrefersAnnotatedElementOverOwningRelatedElement() {
        var annotation = SysMLFactory.eINSTANCE.createAnnotation();
        var annotatedElement = SysMLFactory.eINSTANCE.createComment();
        var owningRelatedElement = SysMLFactory.eINSTANCE.createDocumentation();
        annotation.setAnnotatedElement(annotatedElement);
        annotation.setOwningRelatedElement(owningRelatedElement);

        assertSame(annotatedElement, semantics.evaluateSetting("Annotation", "owningAnnotatedElement", annotation));
    }
}
