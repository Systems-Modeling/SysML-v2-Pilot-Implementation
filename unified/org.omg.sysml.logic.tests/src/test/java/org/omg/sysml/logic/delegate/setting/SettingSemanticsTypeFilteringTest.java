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

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.SysMLFactory;

/**
 * Type-filtering tests for setting delegates generated from subset fallback rules.
 */
public class SettingSemanticsTypeFilteringTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void annotationOwnedAnnotatingElementSelectsFirstAnnotatingElement() {
        var annotation = SysMLFactory.eINSTANCE.createAnnotation();
        var nonAnnotating = SysMLFactory.eINSTANCE.createMembership();
        var firstAnnotating = SysMLFactory.eINSTANCE.createMetadataFeature();
        var secondAnnotating = SysMLFactory.eINSTANCE.createMetadataFeature();
        annotation.getOwnedRelatedElement().add(nonAnnotating);
        annotation.getOwnedRelatedElement().add(firstAnnotating);
        annotation.getOwnedRelatedElement().add(secondAnnotating);

        var result = semantics.evaluateSetting("Annotation", "ownedAnnotatingElement", annotation);
        assertSame(firstAnnotating, result);
    }

    @Test
    void annotationOwnedAnnotatingElementReturnsNullWhenNoAnnotatingElementExists() {
        var annotation = SysMLFactory.eINSTANCE.createAnnotation();
        annotation.getOwnedRelatedElement().add(SysMLFactory.eINSTANCE.createMembership());
        annotation.getOwnedRelatedElement().add(SysMLFactory.eINSTANCE.createOwningMembership());
        var result = semantics.evaluateSetting("Annotation", "ownedAnnotatingElement", annotation);
        assertNull(result);
    }
}
