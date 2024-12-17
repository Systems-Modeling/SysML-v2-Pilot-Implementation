/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2024 Model Driven Solutions, Inc.
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
 * Contributors:
 *   Laszlo Gati, MDS
 */
package org.omg.sysml.semantics.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.StateSubactionKind;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.NamespaceUtil;
import org.omg.sysml.util.TypeUtil;

/**
 * Semantic constraint tests for Table 32. Other Implied Relationships
 */
public class SysMLImpliedRelationsTest extends SysMLSemanticTest {
		
	@Test
	public void checkActionUsageStateActionRedefinition_entry() {
		var stateUsage = SysMLFactory.eINSTANCE.createStateUsage();
		
		var stateSubActionMembership = SysMLFactory.eINSTANCE.createStateSubactionMembership();
		stateSubActionMembership.setKind(StateSubactionKind.ENTRY);
		stateUsage.getOwnedRelationship().add(stateSubActionMembership);
		
		var entryAction = SysMLFactory.eINSTANCE.createActionUsage();
		stateSubActionMembership.setMemberElement(entryAction);
		
		getResource().getContents().add(stateUsage);
		
		ElementUtil.transformAll(stateUsage, true);
		
		assertTrue(specializes(entryAction, "States::StateAction::entryAction"));
	}
	
	@Test
	public void checkActionUsageStateActionRedefinition_do() {
		var stateUsage = SysMLFactory.eINSTANCE.createStateUsage();
		
		var stateSubActionMembership = SysMLFactory.eINSTANCE.createStateSubactionMembership();
		stateSubActionMembership.setKind(StateSubactionKind.DO);
		stateUsage.getOwnedRelationship().add(stateSubActionMembership);
		
		var entryAction = SysMLFactory.eINSTANCE.createActionUsage();
		stateSubActionMembership.setMemberElement(entryAction);
		
		getResource().getContents().add(stateUsage);
		
		ElementUtil.transformAll(stateUsage, true);
		
		assertTrue(specializes(entryAction, "States::StateAction::doAction"));
	}
	
	@Test
	public void checkActionUsageStateActionRedefinition_exit() {
		var stateUsage = SysMLFactory.eINSTANCE.createStateUsage();
		
		var stateSubActionMembership = SysMLFactory.eINSTANCE.createStateSubactionMembership();
		stateSubActionMembership.setKind(StateSubactionKind.EXIT);
		stateUsage.getOwnedRelationship().add(stateSubActionMembership);
		
		var entryAction = SysMLFactory.eINSTANCE.createActionUsage();
		stateSubActionMembership.setMemberElement(entryAction);
		
		getResource().getContents().add(stateUsage);
		
		ElementUtil.transformAll(stateUsage, true);
		
		assertTrue(specializes(entryAction, "States::StateAction::exitAction"));
	}
	
	@Test
	public void checkAssignmentActionUsageAccessedFeatureRedefinition() {
		var root = SysMLFactory.eINSTANCE.createPackage();
		getResource().getContents().add(root);
		
		
		var assignment = SysMLFactory.eINSTANCE.createAssignmentActionUsage();
		NamespaceUtil.addOwnedMemberTo(root, assignment);
		
		var targetParam = SysMLFactory.eINSTANCE.createFeature();
		targetParam.setDirection(FeatureDirectionKind.IN);
		
		ParameterMembership parameterMembership = SysMLFactory.eINSTANCE.createParameterMembership();
		assignment.getOwnedRelationship().add(parameterMembership);
		parameterMembership.setFeature(targetParam);
		
		var firstOfTarget = SysMLFactory.eINSTANCE.createFeature();
		TypeUtil.addOwnedFeatureTo(targetParam, firstOfTarget);
		
		var firstOfFirstOfTarget = SysMLFactory.eINSTANCE.createFeature();
		TypeUtil.addOwnedFeatureTo(firstOfTarget, firstOfFirstOfTarget);
		
		ElementUtil.transformAll(root, true);
		
		assertTrue(redefines(firstOfFirstOfTarget, "FeatureReferencingPerformances::FeatureAccessPerformance::onOccurrence::startingAt::accessedFeature"));
	}
	
	@Test
	public void checkAssignmentActionUsageReferentRedefinition() {
		var root = SysMLFactory.eINSTANCE.createPackage();
		getResource().getContents().add(root);
		
		
		var assignment = SysMLFactory.eINSTANCE.createAssignmentActionUsage();
		NamespaceUtil.addOwnedMemberTo(root, assignment);
		
		var referent = SysMLFactory.eINSTANCE.createAssignmentActionUsage();
		//The referent of an AssignmentActionUsage is the first Feature that is the memberElement of a
		//ownedMembership that is not a FeatureMembership
		NamespaceUtil.addOwnedMemberTo(assignment, referent);
		
		var targetParam = SysMLFactory.eINSTANCE.createFeature();
		targetParam.setDirection(FeatureDirectionKind.IN);
		
		ParameterMembership parameterMembership = SysMLFactory.eINSTANCE.createParameterMembership();
		assignment.getOwnedRelationship().add(parameterMembership);
		parameterMembership.setFeature(targetParam);
		
		var firstOfTarget = SysMLFactory.eINSTANCE.createFeature();
		TypeUtil.addOwnedFeatureTo(targetParam, firstOfTarget);
		
		var firstOfFirstOfTarget = SysMLFactory.eINSTANCE.createFeature();
		TypeUtil.addOwnedFeatureTo(firstOfTarget, firstOfFirstOfTarget);
		
		ElementUtil.transformAll(root, true);
		
		assertTrue(redefines(firstOfFirstOfTarget, referent));
	}
	
	@Test
	public void checkAssignmentActionUsageStartingAtRedefinition() {
		var root = SysMLFactory.eINSTANCE.createPackage();
		getResource().getContents().add(root);
		
		
		var assignment = SysMLFactory.eINSTANCE.createAssignmentActionUsage();
		NamespaceUtil.addOwnedMemberTo(root, assignment);
		
		var targetParam = SysMLFactory.eINSTANCE.createFeature();
		targetParam.setDirection(FeatureDirectionKind.IN);
		
		ParameterMembership parameterMembership = SysMLFactory.eINSTANCE.createParameterMembership();
		assignment.getOwnedRelationship().add(parameterMembership);
		parameterMembership.setFeature(targetParam);
		
		var firstOfTarget = SysMLFactory.eINSTANCE.createFeature();
		TypeUtil.addOwnedFeatureTo(targetParam, firstOfTarget);
		
		ElementUtil.transformAll(root, true);
		
		assertTrue(specializes(firstOfTarget, "FeatureReferencingPerformances::FeatureAccessPerformance::onOccurrence::startingAt"));
	}
	
	@Test
	@Ignore("TBD")
	public void checkRequirementUsageObjectiveSpecialization() {
	}
	
	@Test
	public void checkRenderingUsageRedefinition() {
		var root = SysMLFactory.eINSTANCE.createPackage();
		getResource().getContents().add(root);
		
		var renderingUsage = SysMLFactory.eINSTANCE.createRenderingUsage();
		NamespaceUtil.addOwnedMemberTo(root, renderingUsage);
		
		var feature = SysMLFactory.eINSTANCE.createRenderingUsage();
		
		var renderingMembership = SysMLFactory.eINSTANCE.createViewRenderingMembership();
		renderingUsage.getOwnedRelationship().add(renderingMembership);
		renderingMembership.setMemberElement(feature);
		
		ElementUtil.transformAll(root, true);
		
		assertTrue(redefines(feature, "Views::View::viewRendering"));
	}
	
	@Test
	@Ignore("TBD")
	public void checkOccurrenceUsageTypeFeaturing() {
//		var root = SysMLFactory.eINSTANCE.createPackage();
//		getResource().getContents().add(root);
//		
//		var occ = SysMLFactory.eINSTANCE.createOccurrenceUsage();
//		NamespaceUtil.addOwnedMemberTo(root, occ);
//		
//		var typing1 = SysMLFactory.eINSTANCE.createFeatureTyping();
//		var od1 = SysMLFactory.eINSTANCE.createOccurrenceDefinition();
//		occ.getOwnedRelationship().add(typing1);
//		typing1.setType(od1);
//		
//		var typing2 = SysMLFactory.eINSTANCE.createFeatureTyping();
//		var od2 = SysMLFactory.eINSTANCE.createOccurrenceDefinition();
//		occ.getOwnedRelationship().add(typing2);
//		typing1.setType(od2);
//		
//		var typing3 = SysMLFactory.eINSTANCE.createFeatureTyping();
//		var od3 = SysMLFactory.eINSTANCE.createOccurrenceDefinition();
//		occ.getOwnedRelationship().add(typing3);
//		typing1.setType(od3);
//		
//		ElementUtil.transformAll(root, true);
//		
//		assertTrue(specializes(occ, od1));
//		assertTrue(specializes(occ, od2));
//		assertTrue(specializes(occ, od3));
	}
	
	@Test
	@Ignore("TBD")
	public void checkAcceptActionUsageReceiverBindingConnector() {
	}
	
	@Test
	@Ignore("TBD")
	public void checkTransitionUsageSourceBindingConnector() {
	}
	
	@Test
	@Ignore("TBD")
	public void checkTransitionUsageSuccessionBindingConnector() {
	}
	
	@Test
	@Ignore("TBD")
	public void checkSatisfyRequirementUsageBindingConnector() {
	}
}
