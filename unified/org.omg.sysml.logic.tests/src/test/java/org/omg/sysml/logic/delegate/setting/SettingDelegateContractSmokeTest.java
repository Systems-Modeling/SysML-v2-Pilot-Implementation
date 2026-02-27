/*******************************************************************************
 * SysML 2 Pilot Implementation
 *******************************************************************************/
package org.omg.sysml.logic.delegate.setting;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.function.Supplier;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.SysMLFactory;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * Contract-level smoke test for setting delegates that still rely on generated fallback patterns.
 *
 * <p>Purpose:
 * this test verifies delegate runtime contracts only, not business semantics.
 * For a representative set of fallback-oriented setting delegates, it checks that evaluating the setting:
 * returns an {@link EList} for multi-valued features,
 * returns either {@code null} or a value compatible with the feature Java type for single-valued features,
 * and never violates basic EMF type expectations.
 *
 * <p>What this test does not validate:
 * it does not prove that returned values are semantically correct according to SysML/OCL rules.
 * Semantic correctness is covered by the dedicated {@code SettingSemantics*Test} suites.
 */
public class SettingDelegateContractSmokeTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void fallbackContractRemainsTypeSafeForRepresentativeFeatures() {
        var cases = List.of(
                new SettingCase("AllocationUsage", "allocationDefinition",
                        () -> SysMLFactory.eINSTANCE.createAllocationUsage()),
                new SettingCase("ConnectionUsage", "connectionDefinition",
                        () -> SysMLFactory.eINSTANCE.createConnectionUsage()),
                new SettingCase("Usage", "owningDefinition",
                        () -> SysMLFactory.eINSTANCE.createActionUsage()),
                new SettingCase("VerificationCaseUsage", "verificationCaseDefinition",
                        () -> SysMLFactory.eINSTANCE.createVerificationCaseUsage()),
                new SettingCase("Feature", "owningFeatureMembership",
                        () -> SysMLFactory.eINSTANCE.createActionUsage()),
                new SettingCase("FeatureTyping", "owningFeature",
                        () -> SysMLFactory.eINSTANCE.createFeatureTyping()),
                new SettingCase("Behavior", "parameter",
                        () -> SysMLFactory.eINSTANCE.createBehavior()),
                new SettingCase("Function", "expression",
                        () -> SysMLFactory.eINSTANCE.createFunction()),
                new SettingCase("Documentation", "documentedElement",
                        () -> SysMLFactory.eINSTANCE.createDocumentation()),
                new SettingCase("Element", "owningMembership",
                        () -> SysMLFactory.eINSTANCE.createComment()),
                new SettingCase("Association", "associationEnd",
                        () -> SysMLFactory.eINSTANCE.createAssociationStructure()),
                new SettingCase("OwningMembership", "ownedMemberElement",
                        () -> SysMLFactory.eINSTANCE.createOwningMembership()),
                new SettingCase("RequirementConstraintMembership", "referencedConstraint",
                        () -> SysMLFactory.eINSTANCE.createRequirementConstraintMembership()),
                new SettingCase("Conjugation", "owningType",
                        () -> SysMLFactory.eINSTANCE.createConjugation()),
                new SettingCase("Intersecting", "typeIntersected",
                        () -> SysMLFactory.eINSTANCE.createIntersecting()),
                new SettingCase("Differencing", "typeDifferenced",
                        () -> SysMLFactory.eINSTANCE.createDifferencing()));

        for (var settingCase : cases) {
            assertSettingContract(settingCase.className(), settingCase.featureName(), settingCase.ownerFactory().get());
        }
    }

    private void assertSettingContract(String className, String featureName, Object owner) {
        var value = semantics.evaluateSetting(className, featureName, owner);
        var feature = findFeature(className, featureName);
        if (feature.isMany()) {
            assertNotNull(value, className + "." + featureName + " should return a list");
            assertTrue(value instanceof EList<?>, className + "." + featureName + " should return EList");
            return;
        }
        if (value == null) {
            return;
        }
        var instanceClass = feature.getEType().getInstanceClass();
        if (instanceClass != null) {
            assertTrue(wrapPrimitive(instanceClass).isInstance(value),
                    className + "." + featureName + " returned incompatible value type: " + value.getClass().getName());
        }
    }

    private EStructuralFeature findFeature(String className, String featureName) {
        var classifier = SysMLPackage.eINSTANCE.getEClassifier(className);
        assertTrue(classifier instanceof EClass, "Unknown EClass: " + className);
        var eClass = (EClass) classifier;
        for (var feature : eClass.getEAllStructuralFeatures()) {
            if (featureName.equals(feature.getName())) {
                return feature;
            }
        }
        throw new IllegalStateException("Feature not found: " + className + "." + featureName);
    }

    private Class<?> wrapPrimitive(Class<?> type) {
        if (!type.isPrimitive()) {
            return type;
        }
        if (type == Boolean.TYPE) {
            return Boolean.class;
        }
        if (type == Integer.TYPE) {
            return Integer.class;
        }
        if (type == Long.TYPE) {
            return Long.class;
        }
        if (type == Double.TYPE) {
            return Double.class;
        }
        if (type == Float.TYPE) {
            return Float.class;
        }
        if (type == Character.TYPE) {
            return Character.class;
        }
        if (type == Byte.TYPE) {
            return Byte.class;
        }
        if (type == Short.TYPE) {
            return Short.class;
        }
        return type;
    }

    private record SettingCase(String className, String featureName, Supplier<Object> ownerFactory) {
    }
}
