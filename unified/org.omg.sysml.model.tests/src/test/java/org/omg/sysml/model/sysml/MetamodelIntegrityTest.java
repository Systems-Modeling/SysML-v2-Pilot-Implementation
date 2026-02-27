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
package org.omg.sysml.model.sysml;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.jupiter.api.Test;

/**
 * Integrity tests for the generated SysML metamodel.
 *
 * <p>What it validates:
 * <ul>
 * <li>package identity and EMF diagnostic validity;</li>
 * <li>classifier uniqueness and non-empty classifier registry;</li>
 * <li>structural feature bounds, containment/proxy semantics, and opposite consistency;</li>
 * <li>operation signature uniqueness and return type presence;</li>
 * <li>critical {@code Element} feature contracts;</li>
 * <li>critical cross-class metamodel contracts.</li>
 * </ul>
 */
public class MetamodelIntegrityTest {

    @Test
    public void packageIdentityAndDiagnosticsAreValid() {
        var pkg = SysMLPackage.eINSTANCE;

        assertNotNull(pkg);
        assertEquals("sysml", pkg.getName());
        assertEquals("sysml", pkg.getNsPrefix());
        assertEquals("https://www.omg.org/spec/SysML/20250201", pkg.getNsURI());

        var diagnostic = Diagnostician.INSTANCE.validate(pkg);
        assertEquals(Diagnostic.OK, diagnostic.getSeverity(), diagnostic::toString);
    }

    @Test
    public void classifiersAreUniqueAndNotEmpty() {
        var pkg = SysMLPackage.eINSTANCE;
        assertFalse(pkg.getEClassifiers().isEmpty());

        var names = new HashSet<String>();
        var ids = new HashSet<Integer>();
        for (EClassifier classifier : pkg.getEClassifiers()) {
            assertNotNull(classifier.getName());
            assertFalse(classifier.getName().isBlank());
            assertTrue(names.add(classifier.getName()), "Duplicate classifier name: " + classifier.getName());
            assertTrue(ids.add(classifier.getClassifierID()), "Duplicate classifier ID: " + classifier.getClassifierID());
        }
    }

    @Test
    public void structuralFeaturesHaveConsistentBoundsAndOpposites() {
        var pkg = SysMLPackage.eINSTANCE;

        for (EClassifier classifier : pkg.getEClassifiers()) {
            if (!(classifier instanceof EClass eClass)) {
                continue;
            }
            var featureNames = new HashSet<String>();
            for (EStructuralFeature feature : eClass.getEStructuralFeatures()) {
                assertTrue(featureNames.add(feature.getName()),
                        "Duplicate feature name in " + eClass.getName() + ": " + feature.getName());

                assertTrue(feature.getLowerBound() >= 0,
                        "Negative lower bound for " + eClass.getName() + "." + feature.getName());
                assertTrue(feature.getUpperBound() == -1 || feature.getUpperBound() >= feature.getLowerBound(),
                        "Invalid bounds for " + eClass.getName() + "." + feature.getName());

                if (feature instanceof EReference reference) {
                    if (reference.isContainment()) {
                        assertFalse(reference.isResolveProxies(),
                                "Containment must not resolve proxies: " + eClass.getName() + "." + feature.getName());
                    }
                    var opposite = reference.getEOpposite();
                    if (opposite != null) {
                        assertEquals(reference, opposite.getEOpposite(),
                                "Opposite mismatch for " + eClass.getName() + "." + feature.getName());
                    }
                }
            }
        }
    }

    @Test
    public void operationSignaturesAreUniqueWithinClasses() {
        var pkg = SysMLPackage.eINSTANCE;

        for (EClassifier classifier : pkg.getEClassifiers()) {
            if (!(classifier instanceof EClass eClass)) {
                continue;
            }
            Set<String> signatures = new HashSet<>();
            for (EOperation operation : eClass.getEOperations()) {
                assertNotNull(operation.getEType(), eClass.getName() + "::" + operation.getName() + " has no return type");
                var parameterTypes = operation.getEParameters().stream()
                        .map(param -> param.getEType().getName())
                        .collect(Collectors.joining(","));
                var signature = operation.getName() + "(" + parameterTypes + ")";
                assertTrue(signatures.add(signature),
                        "Duplicate operation signature in " + eClass.getName() + ": " + signature);
            }
        }
    }

    @Test
    public void criticalElementFeaturesKeepExpectedShape() {
        var pkg = SysMLPackage.eINSTANCE;
        var element = pkg.getElement();
        assertNotNull(element);

        var name = pkg.getElement_Name();
        assertAttribute(name, "name", EcorePackage.eINSTANCE.getEString(), true, true, true, 0, 1);

        var qualifiedName = pkg.getElement_QualifiedName();
        assertAttribute(qualifiedName, "qualifiedName", EcorePackage.eINSTANCE.getEString(), true, true, true, 0, 1);

        var ownedRelationship = pkg.getElement_OwnedRelationship();
        assertReference(ownedRelationship, "ownedRelationship", pkg.getRelationship(), false, false, false, 0, -1);
        assertTrue(ownedRelationship.isContainment());
    }

    @Test
    public void criticalCrossClassContractsRemainStable() {
        var pkg = SysMLPackage.eINSTANCE;

        assertTrue(pkg.getRelationship().getESuperTypes().contains(pkg.getElement()),
                "Relationship must inherit from Element");
        assertTrue(pkg.getType().getESuperTypes().contains(pkg.getNamespace()),
                "Type must inherit from Namespace");

        var typeOwnedSpecialization = pkg.getType_OwnedSpecialization();
        assertReference(typeOwnedSpecialization, "ownedSpecialization", pkg.getSpecialization(), true, true, true, 0, -1);

        var featureFeaturingType = pkg.getFeature_FeaturingType();
        assertReference(featureFeaturingType, "featuringType", pkg.getType(), true, true, true, 0, -1);

        var isTriggerAction = pkg.getAcceptActionUsage__IsTriggerAction();
        assertEquals(EcorePackage.eINSTANCE.getEBoolean(), isTriggerAction.getEType());
        assertEquals(0, isTriggerAction.getEParameters().size());
    }

    private void assertAttribute(
            EAttribute attribute,
            String expectedName,
            EDataType expectedType,
            boolean expectedDerived,
            boolean expectedTransient,
            boolean expectedVolatile,
            int expectedLower,
            int expectedUpper) {
        assertNotNull(attribute);
        assertEquals(expectedName, attribute.getName());
        assertEquals(expectedType, attribute.getEAttributeType());
        assertEquals(expectedDerived, attribute.isDerived());
        assertEquals(expectedTransient, attribute.isTransient());
        assertEquals(expectedVolatile, attribute.isVolatile());
        assertEquals(expectedLower, attribute.getLowerBound());
        assertEquals(expectedUpper, attribute.getUpperBound());
    }

    private void assertReference(
            EReference reference,
            String expectedName,
            EClass expectedType,
            boolean expectedDerived,
            boolean expectedTransient,
            boolean expectedVolatile,
            int expectedLower,
            int expectedUpper) {
        assertNotNull(reference);
        assertEquals(expectedName, reference.getName());
        assertEquals(expectedType, reference.getEReferenceType());
        assertEquals(expectedDerived, reference.isDerived());
        assertEquals(expectedTransient, reference.isTransient());
        assertEquals(expectedVolatile, reference.isVolatile());
        assertEquals(expectedLower, reference.getLowerBound());
        assertEquals(expectedUpper, reference.getUpperBound());
    }
}
