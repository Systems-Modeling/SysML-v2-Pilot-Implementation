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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.Annotation;
import org.omg.sysml.model.sysml.Comment;
import org.omg.sysml.model.sysml.MetadataFeature;
import org.omg.sysml.model.sysml.SysMLFactory;

/**
 * Setting semantics tests for Element and Element-derived metaclasses.
 */
public class SettingSemanticsElementTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void annotatingElementOwnedAnnotatingRelationshipSettingRule() {
        MetadataFeature annotatingElement = SysMLFactory.eINSTANCE.createMetadataFeature();
        Annotation annotationToSelf = SysMLFactory.eINSTANCE.createAnnotation();
        Annotation annotationToOther = SysMLFactory.eINSTANCE.createAnnotation();
        annotationToSelf.setAnnotatedElement(annotatingElement);
        annotationToOther.setAnnotatedElement(SysMLFactory.eINSTANCE.createComment());
        annotatingElement.getOwnedRelationship().add(annotationToSelf);
        annotatingElement.getOwnedRelationship().add(annotationToOther);

        EList<?> result = (EList<?>) semantics.evaluateSetting(
                "AnnotatingElement", "ownedAnnotatingRelationship", annotatingElement);
        assertEquals(1, result.size());
        assertSame(annotationToOther, result.getFirst());
    }

    @Test
    void elementTextualRepresentationSettingRule() {
        Comment element = SysMLFactory.eINSTANCE.createComment();
        EList<?> result = (EList<?>) semantics.evaluateSetting("Element", "textualRepresentation", element);
        assertTrue(result.isEmpty());
        assertTrue(element.getTextualRepresentation().isEmpty());
    }

    @Test
    void elementNameSettingRule() {
        var element = SysMLFactory.eINSTANCE.createComment();
        element.setDeclaredName("DocComment");
        assertEquals("DocComment", semantics.evaluateSetting("Element", "name", element));
        assertEquals("DocComment", element.getName());
    }

    @Test
    void elementQualifiedNameSettingRule() {
        var element = SysMLFactory.eINSTANCE.createComment();
        assertNull(semantics.evaluateSetting("Element", "qualifiedName", element));
        assertNull(element.getQualifiedName());
    }

    @Test
    void elementShortNameSettingRule() {
        var element = SysMLFactory.eINSTANCE.createComment();
        element.setDeclaredShortName("dc");
        assertEquals("dc", semantics.evaluateSetting("Element", "shortName", element));
        assertEquals("dc", element.getShortName());
    }

    @Test
    void elementOwnedElementSettingRule() {
        var element = SysMLFactory.eINSTANCE.createComment();
        var result = (EList<?>) semantics.evaluateSetting("Element", "ownedElement", element);
        assertTrue(result.isEmpty());
        assertTrue(element.getOwnedElement().isEmpty());
    }

    @Test
    void elementOwnedElementWithOwnedRelationshipSettingRule() {
        var owner = SysMLFactory.eINSTANCE.createComment();
        var ownedChild = SysMLFactory.eINSTANCE.createComment();
        var owningMembership = SysMLFactory.eINSTANCE.createOwningMembership();
        owningMembership.setOwningRelatedElement(owner);
        owningMembership.getOwnedRelatedElement().add(ownedChild);
        var result = (EList<?>) semantics.evaluateSetting("Element", "ownedElement", owner);
        assertEquals(1, result.size());
        assertSame(ownedChild, result.getFirst());
    }

    @Test
    void elementOwnerSettingRule() {
        var element = SysMLFactory.eINSTANCE.createComment();
        assertNull(semantics.evaluateSetting("Element", "owner", element));
        assertNull(element.getOwner());
    }

    @Test
    void elementOwnerWithOwningRelationshipSettingRule() {
        var owner = SysMLFactory.eINSTANCE.createComment();
        var ownedChild = SysMLFactory.eINSTANCE.createComment();
        var owningMembership = SysMLFactory.eINSTANCE.createOwningMembership();
        owningMembership.setOwningRelatedElement(owner);
        owningMembership.getOwnedRelatedElement().add(ownedChild);
        assertSame(owner, semantics.evaluateSetting("Element", "owner", ownedChild));
        assertSame(owner, ownedChild.getOwner());
    }

    @Test
    void elementDocumentationSettingRule() {
        var element = SysMLFactory.eINSTANCE.createComment();
        var result = (EList<?>) semantics.evaluateSetting("Element", "documentation", element);
        assertTrue(result.isEmpty());
        assertTrue(element.getDocumentation().isEmpty());
    }

    @Test
    void elementDocumentationFiltersOwnedDocumentationSettingRule() {
        var owner = SysMLFactory.eINSTANCE.createComment();
        var documentation = SysMLFactory.eINSTANCE.createDocumentation();
        var notDocumentation = SysMLFactory.eINSTANCE.createComment();
        var owningMembership = SysMLFactory.eINSTANCE.createOwningMembership();
        owningMembership.setOwningRelatedElement(owner);
        owningMembership.getOwnedRelatedElement().add(documentation);
        owningMembership.getOwnedRelatedElement().add(notDocumentation);
        var result = (EList<?>) semantics.evaluateSetting("Element", "documentation", owner);
        assertEquals(1, result.size());
        assertSame(documentation, result.getFirst());
    }

    @Test
    void elementIsLibraryElementSettingRule() {
        var element = SysMLFactory.eINSTANCE.createComment();
        assertFalse((Boolean) semantics.evaluateSetting("Element", "isLibraryElement", element));
        assertFalse(element.isIsLibraryElement());
    }

    @Test
    void elementOwnedAnnotationSettingRule() {
        var element = SysMLFactory.eINSTANCE.createComment();
        var result = (EList<?>) semantics.evaluateSetting("Element", "ownedAnnotation", element);
        assertTrue(result.isEmpty());
        assertTrue(element.getOwnedAnnotation().isEmpty());
    }

    @Test
    void namespaceOwnedMembershipSettingRule() {
        var namespace = SysMLFactory.eINSTANCE.createPackage();
        var result = (EList<?>) semantics.evaluateSetting("Namespace", "ownedMembership", namespace);
        assertTrue(result.isEmpty());
        assertTrue(namespace.getOwnedMembership().isEmpty());
    }

    @Test
    void namespaceOwnedMembershipWithOwnedRelationshipSettingRule() {
        var namespace = SysMLFactory.eINSTANCE.createPackage();
        var membership = SysMLFactory.eINSTANCE.createMembership();
        namespace.getOwnedRelationship().add(membership);
        var result = (EList<?>) semantics.evaluateSetting("Namespace", "ownedMembership", namespace);
        assertEquals(1, result.size());
        assertSame(membership, result.getFirst());
    }

    @Test
    void namespaceOwnedMembershipFiltersNonMembershipSettingRule() {
        var namespace = SysMLFactory.eINSTANCE.createPackage();
        var annotation = SysMLFactory.eINSTANCE.createAnnotation();
        namespace.getOwnedRelationship().add(annotation);
        var result = (EList<?>) semantics.evaluateSetting("Namespace", "ownedMembership", namespace);
        assertTrue(result.isEmpty());
        assertTrue(namespace.getOwnedMembership().isEmpty());
    }

    @Test
    void namespaceOwnedMemberSettingRule() {
        var namespace = SysMLFactory.eINSTANCE.createPackage();
        var result = (EList<?>) semantics.evaluateSetting("Namespace", "ownedMember", namespace);
        assertTrue(result.isEmpty());
        assertTrue(namespace.getOwnedMember().isEmpty());
    }

    @Test
    void namespaceOwnedMemberWithOwningMembershipSettingRule() {
        var namespace = SysMLFactory.eINSTANCE.createPackage();
        var owningMembership = SysMLFactory.eINSTANCE.createOwningMembership();
        var ownedMember = SysMLFactory.eINSTANCE.createComment();
        namespace.getOwnedRelationship().add(owningMembership);
        owningMembership.getOwnedRelatedElement().add(ownedMember);
        var result = (EList<?>) semantics.evaluateSetting("Namespace", "ownedMember", namespace);
        assertEquals(1, result.size());
        assertSame(ownedMember, result.getFirst());
    }

    @Test
    void namespaceOwnedImportSettingRule() {
        var namespace = SysMLFactory.eINSTANCE.createPackage();
        var result = (EList<?>) semantics.evaluateSetting("Namespace", "ownedImport", namespace);
        assertTrue(result.isEmpty());
        assertTrue(namespace.getOwnedImport().isEmpty());
    }

    @Test
    void namespaceOwnedImportWithNamespaceImportSettingRule() {
        var namespace = SysMLFactory.eINSTANCE.createPackage();
        var namespaceImport = SysMLFactory.eINSTANCE.createNamespaceImport();
        namespace.getOwnedRelationship().add(namespaceImport);
        var result = (EList<?>) semantics.evaluateSetting("Namespace", "ownedImport", namespace);
        assertEquals(1, result.size());
        assertSame(namespaceImport, result.getFirst());
    }

    @Test
    void namespaceImportedMembershipSettingRule() {
        var namespace = SysMLFactory.eINSTANCE.createPackage();
        var result = (EList<?>) semantics.evaluateSetting("Namespace", "importedMembership", namespace);
        assertTrue(result.isEmpty());
        assertTrue(namespace.getImportedMembership().isEmpty());
    }

    @Test
    void annotationOwningAnnotatedElementSubsetsFallback() {
        var annotation = SysMLFactory.eINSTANCE.createAnnotation();
        var annotated = SysMLFactory.eINSTANCE.createComment();
        annotation.setAnnotatedElement(annotated);
        assertSame(annotated, semantics.evaluateSetting("Annotation", "owningAnnotatedElement", annotation));
        assertSame(annotated, annotation.getOwningAnnotatedElement());
    }

    @Test
    void annotationOwnedAnnotatingElementSettingRule() {
        var annotation = SysMLFactory.eINSTANCE.createAnnotation();
        assertNull(semantics.evaluateSetting("Annotation", "ownedAnnotatingElement", annotation));
        assertNull(annotation.getOwnedAnnotatingElement());
    }

    @Test
    void annotationOwnedAnnotatingElementWithOwnedRelatedElementSettingRule() {
        var annotation = SysMLFactory.eINSTANCE.createAnnotation();
        var annotatingElement = SysMLFactory.eINSTANCE.createMetadataFeature();
        annotation.getOwnedRelatedElement().add(annotatingElement);
        assertSame(annotatingElement, semantics.evaluateSetting(
                "Annotation", "ownedAnnotatingElement", annotation));
        assertSame(annotatingElement, annotation.getOwnedAnnotatingElement());
    }

    @Test
    void annotationAnnotatingElementSettingRule() {
        var annotation = SysMLFactory.eINSTANCE.createAnnotation();
        assertNull(semantics.evaluateSetting("Annotation", "annotatingElement", annotation));
        assertNull(annotation.getAnnotatingElement());
    }

    @Test
    void annotatingElementAnnotationSettingRule() {
        var annotatingElement = SysMLFactory.eINSTANCE.createMetadataFeature();
        var result = (EList<?>) semantics.evaluateSetting("AnnotatingElement", "annotation", annotatingElement);
        assertTrue(result.isEmpty());
        assertTrue(annotatingElement.getAnnotation().isEmpty());
    }

    @Test
    void annotatingElementAnnotatedElementSettingRule() {
        var annotatingElement = SysMLFactory.eINSTANCE.createMetadataFeature();
        var annotatedElement = SysMLFactory.eINSTANCE.createComment();
        var annotation = SysMLFactory.eINSTANCE.createAnnotation();
        annotation.setAnnotatedElement(annotatedElement);
        annotatingElement.getOwnedRelationship().add(annotation);
        var result = (EList<?>) semantics.evaluateSetting("AnnotatingElement", "annotatedElement", annotatingElement);
        assertEquals(1, result.size());
        assertSame(annotatedElement, result.getFirst());
    }

    @Test
    void metadataFeatureMetaclassSettingRule() {
        var metadataFeature = SysMLFactory.eINSTANCE.createMetadataFeature();
        assertNull(semantics.evaluateSetting("MetadataFeature", "metaclass", metadataFeature));
        assertNull(metadataFeature.getMetaclass());
    }

    @Test
    void packageFilterConditionSettingRule() {
        var packageElement = SysMLFactory.eINSTANCE.createPackage();
        var result = (EList<?>) semantics.evaluateSetting("Package", "filterCondition", packageElement);
        assertTrue(result.isEmpty());
        assertTrue(packageElement.getFilterCondition().isEmpty());
    }
}
