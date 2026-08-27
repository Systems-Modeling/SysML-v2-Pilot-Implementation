/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of theEclipse Public License
 * along with this program. If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *
 *******************************************************************************/
package org.omg.sysml.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.NamespaceImport;
import org.omg.sysml.lang.sysml.Subclassification;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.util.ConnectorUtil;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.NamespaceUtil;
import org.omg.sysml.util.TypeUtil;

public class KERML11_Ballot3_Tests {

	@BeforeClass
	public static void setUp() {
		SysMLLogicStandaloneSetup.doSetup();
	}

	/**
	 * Test resolution to KERML11-1 Binding connectors should not be considered owned cross features
	 * @throws InvocationTargetException
	 */
	@Test
	public void testKERML11_1() {
		Association association = SysMLFactory.eINSTANCE.createAssociation();
		
		Feature end1 = SysMLFactory.eINSTANCE.createFeature();
		end1.setDeclaredName("end1");
		end1.setIsEnd(true);
		TypeUtil.addOwnedFeatureTo(association, end1);
		
		Feature end2 = SysMLFactory.eINSTANCE.createFeature();
		end2.setDeclaredName("end2");
		end2.setIsEnd(true);
		TypeUtil.addOwnedFeatureTo(association, end2);
		
		BindingConnector connector = SysMLFactory.eINSTANCE.createBindingConnector();
		FeatureUtil.addTypeFeaturingTo(connector).setFeaturingType(association);
		ConnectorUtil.addConnectorEndTo(connector, end1);
		ConnectorUtil.addConnectorEndTo(connector, end1);
		NamespaceUtil.addOwnedMemberTo(end1, connector);
		
		Feature feature = SysMLFactory.eINSTANCE.createFeature();
		feature.setDeclaredName("crossFeature");
		NamespaceUtil.addOwnedMemberTo(end1, feature);
		
		Feature crossFeature = end1.ownedCrossFeature();
		assertNotNull("Not null", crossFeature);
		assertEquals("cross feature", feature, crossFeature);
	}
	
	/**
	 * Test resolution to KERML11-3 Featuring type of the multiplicity of a cross feature
	 * @throws InvocationTargetException
	 */
	@Test
	public void testKERML11_3() {
		Association association = SysMLFactory.eINSTANCE.createAssociation();
		Classifier classifier = SysMLFactory.eINSTANCE.createClassifier();
		
		Feature end1 = SysMLFactory.eINSTANCE.createFeature();
		end1.setDeclaredName("end1");
		end1.setIsEnd(true);
		FeatureUtil.addFeatureTypingTo(end1).setType(classifier);
		TypeUtil.addOwnedFeatureTo(association, end1);
		
		Feature end2 = SysMLFactory.eINSTANCE.createFeature();
		end2.setDeclaredName("end2");
		end2.setIsEnd(true);
		FeatureUtil.addFeatureTypingTo(end2).setType(classifier);
		TypeUtil.addOwnedFeatureTo(association, end2);
		
		Feature feature = SysMLFactory.eINSTANCE.createFeature();
		feature.setDeclaredName("crossFeature");
		NamespaceUtil.addOwnedMemberTo(end1, feature);
		
		Multiplicity multiplicityRange = SysMLFactory.eINSTANCE.createMultiplicityRange();
		NamespaceUtil.addOwnedMemberTo(feature, multiplicityRange);
		
		LiteralInteger lowerBound = SysMLFactory.eINSTANCE.createLiteralInteger();
		lowerBound.setValue(1);
		NamespaceUtil.addOwnedMemberTo(multiplicityRange, lowerBound);
		LiteralInteger upperBound = SysMLFactory.eINSTANCE.createLiteralInteger();
		upperBound.setValue(1);
		NamespaceUtil.addOwnedMemberTo(multiplicityRange, upperBound);
		
		ElementUtil.transformAll(association, false);
		
		assertEquals("crossFeature", end1.ownedCrossFeature(), feature);
		assertFalse("crossFeature.featuringType.isEmpty", feature.getFeaturingType().isEmpty());
		
		assertFalse("multiplicity.featuringType.isEmpty", multiplicityRange.getFeaturingType().isEmpty());
		assertEquals("multiplicity.featuringType", feature.getFeaturingType().get(0), multiplicityRange.getFeaturingType().get(0));
		
		assertFalse("lowerBound.featuringType.isEmpty", lowerBound.getFeaturingType().isEmpty());
		assertEquals("lowerBound.featuringType", association, lowerBound.getFeaturingType().get(0));
		
		assertFalse("upperBound.featuringType.isEmpty", upperBound.getFeaturingType().isEmpty());
		assertEquals("upperBound.featuringType", association, upperBound.getFeaturingType().get(0));
	}

	/* 
	 * KERML11-68 is a validation change.
	 */
	
	/*
	 * KERML11-69 was previously implemented.
	 */
	
	/**
	 * Test resolution to KERML11-191 Featuring type of the multiplicity of a cross feature
	 * @throws InvocationTargetException
	 */
	@Test
	public void testKERML11_191() {
		Classifier A = SysMLFactory.eINSTANCE.createClassifier();
		A.setDeclaredName("A");
		
		Feature x = SysMLFactory.eINSTANCE.createFeature();
		x.setDeclaredName("x");
		TypeUtil.addOwnedFeatureTo(A, x);
		
		Classifier B = SysMLFactory.eINSTANCE.createClassifier();
		B.setDeclaredName("B");
		
		NamespaceImport _import = SysMLFactory.eINSTANCE.createNamespaceImport();
		_import.setVisibility(VisibilityKind.PUBLIC);
		_import.setImportedNamespace(A);
		B.getOwnedRelationship().add(_import);
		
		Feature y = SysMLFactory.eINSTANCE.createFeature();
		y.setDeclaredName("y");
		TypeUtil.addOwnedFeatureTo(B, y);
		
		List<Feature> features = B.getFeature();		
		assertTrue("feature B::y", features.contains(y));
		assertFalse("not feature B::x", features.contains(x));

		Classifier C = SysMLFactory.eINSTANCE.createClassifier();
		C.setDeclaredName("C");
		Subclassification subclassing = SysMLFactory.eINSTANCE.createSubclassification();
		subclassing.setSubclassifier(C);
		subclassing.setSuperclassifier(B);
		C.getOwnedRelationship().add(subclassing);
		
		features = C.getFeature();		
		assertTrue("feature C::y", features.contains(y));
		assertFalse("not feature C::x", features.contains(x));
	}
}
