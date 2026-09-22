/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2025 Model Driven Solutions, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *
 *******************************************************************************/

package org.omg.sysml.util;

import java.util.HashMap;
import java.util.Map;

import org.omg.sysml.lang.sysml.impl.AcceptActionUsageImpl;
import org.omg.sysml.lang.sysml.impl.ActionDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.ActionUsageImpl;
import org.omg.sysml.lang.sysml.impl.AllocationDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.AllocationUsageImpl;
import org.omg.sysml.lang.sysml.impl.AnalysisCaseDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.AnalysisCaseUsageImpl;
import org.omg.sysml.lang.sysml.impl.AssertConstraintUsageImpl;
import org.omg.sysml.lang.sysml.impl.AssignmentActionUsageImpl;
import org.omg.sysml.lang.sysml.impl.AssociationImpl;
import org.omg.sysml.lang.sysml.impl.AssociationStructureImpl;
import org.omg.sysml.lang.sysml.impl.AttributeDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.AttributeUsageImpl;
import org.omg.sysml.lang.sysml.impl.BehaviorImpl;
import org.omg.sysml.lang.sysml.impl.BindingConnectorAsUsageImpl;
import org.omg.sysml.lang.sysml.impl.BindingConnectorImpl;
import org.omg.sysml.lang.sysml.impl.BooleanExpressionImpl;
import org.omg.sysml.lang.sysml.impl.CalculationDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.CalculationUsageImpl;
import org.omg.sysml.lang.sysml.impl.CaseDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.CaseUsageImpl;
import org.omg.sysml.lang.sysml.impl.ClassImpl;
import org.omg.sysml.lang.sysml.impl.ClassifierImpl;
import org.omg.sysml.lang.sysml.impl.ConcernDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.ConcernUsageImpl;
import org.omg.sysml.lang.sysml.impl.ConnectionDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl;
import org.omg.sysml.lang.sysml.impl.ConnectorImpl;
import org.omg.sysml.lang.sysml.impl.ConstraintDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.ConstraintUsageImpl;
import org.omg.sysml.lang.sysml.impl.ConstructorExpressionImpl;
import org.omg.sysml.lang.sysml.impl.DataTypeImpl;
import org.omg.sysml.lang.sysml.impl.DecisionNodeImpl;
import org.omg.sysml.lang.sysml.impl.EventOccurrenceUsageImpl;
import org.omg.sysml.lang.sysml.impl.ExhibitStateUsageImpl;
import org.omg.sysml.lang.sysml.impl.ExpressionImpl;
import org.omg.sysml.lang.sysml.impl.FeatureChainExpressionImpl;
import org.omg.sysml.lang.sysml.impl.FeatureImpl;
import org.omg.sysml.lang.sysml.impl.FlowDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.FlowEndImpl;
import org.omg.sysml.lang.sysml.impl.FlowImpl;
import org.omg.sysml.lang.sysml.impl.FlowUsageImpl;
import org.omg.sysml.lang.sysml.impl.ForLoopActionUsageImpl;
import org.omg.sysml.lang.sysml.impl.ForkNodeImpl;
import org.omg.sysml.lang.sysml.impl.FunctionImpl;
import org.omg.sysml.lang.sysml.impl.IfActionUsageImpl;
import org.omg.sysml.lang.sysml.impl.IncludeUseCaseUsageImpl;
import org.omg.sysml.lang.sysml.impl.InterfaceDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.InterfaceUsageImpl;
import org.omg.sysml.lang.sysml.impl.InvariantImpl;
import org.omg.sysml.lang.sysml.impl.ItemDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.ItemUsageImpl;
import org.omg.sysml.lang.sysml.impl.JoinNodeImpl;
import org.omg.sysml.lang.sysml.impl.LiteralBooleanImpl;
import org.omg.sysml.lang.sysml.impl.LiteralExpressionImpl;
import org.omg.sysml.lang.sysml.impl.LiteralInfinityImpl;
import org.omg.sysml.lang.sysml.impl.LiteralIntegerImpl;
import org.omg.sysml.lang.sysml.impl.LiteralRationalImpl;
import org.omg.sysml.lang.sysml.impl.LiteralStringImpl;
import org.omg.sysml.lang.sysml.impl.MergeNodeImpl;
import org.omg.sysml.lang.sysml.impl.MetaclassImpl;
import org.omg.sysml.lang.sysml.impl.MetadataAccessExpressionImpl;
import org.omg.sysml.lang.sysml.impl.MetadataDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.MetadataFeatureImpl;
import org.omg.sysml.lang.sysml.impl.MetadataUsageImpl;
import org.omg.sysml.lang.sysml.impl.MultiplicityImpl;
import org.omg.sysml.lang.sysml.impl.MultiplicityRangeImpl;
import org.omg.sysml.lang.sysml.impl.NullExpressionImpl;
import org.omg.sysml.lang.sysml.impl.OccurrenceDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.OccurrenceUsageImpl;
import org.omg.sysml.lang.sysml.impl.PartDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.PartUsageImpl;
import org.omg.sysml.lang.sysml.impl.PayloadFeatureImpl;
import org.omg.sysml.lang.sysml.impl.PerformActionUsageImpl;
import org.omg.sysml.lang.sysml.impl.PortDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.PortUsageImpl;
import org.omg.sysml.lang.sysml.impl.PredicateImpl;
import org.omg.sysml.lang.sysml.impl.RenderingDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.RenderingUsageImpl;
import org.omg.sysml.lang.sysml.impl.RequirementDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.RequirementUsageImpl;
import org.omg.sysml.lang.sysml.impl.SatisfyRequirementUsageImpl;
import org.omg.sysml.lang.sysml.impl.SendActionUsageImpl;
import org.omg.sysml.lang.sysml.impl.StateDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.StateUsageImpl;
import org.omg.sysml.lang.sysml.impl.StepImpl;
import org.omg.sysml.lang.sysml.impl.StructureImpl;
import org.omg.sysml.lang.sysml.impl.SuccessionAsUsageImpl;
import org.omg.sysml.lang.sysml.impl.SuccessionFlowImpl;
import org.omg.sysml.lang.sysml.impl.SuccessionFlowUsageImpl;
import org.omg.sysml.lang.sysml.impl.SuccessionImpl;
import org.omg.sysml.lang.sysml.impl.TerminateActionUsageImpl;
import org.omg.sysml.lang.sysml.impl.TransitionUsageImpl;
import org.omg.sysml.lang.sysml.impl.TriggerInvocationExpressionImpl;
import org.omg.sysml.lang.sysml.impl.TypeImpl;
import org.omg.sysml.lang.sysml.impl.UseCaseDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.UseCaseUsageImpl;
import org.omg.sysml.lang.sysml.impl.VerificationCaseDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.VerificationCaseUsageImpl;
import org.omg.sysml.lang.sysml.impl.ViewDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.ViewUsageImpl;
import org.omg.sysml.lang.sysml.impl.ViewpointDefinitionImpl;
import org.omg.sysml.lang.sysml.impl.ViewpointUsageImpl;
import org.omg.sysml.lang.sysml.impl.WhileLoopActionUsageImpl;

/**
 * Qualified library names of the implicit specialization targets, keyed by generated
 * implementation class and contextual key.
 * <p>
 * Each entry's comment names the semantic constraint it implements and its specification
 * table or subclause. KerML Tables 8 and 9 are in §8.4.3.1, Tables 10 and 11 in §8.4.4.1;
 * SysML Tables 31 to 33 are in §8.4.1.
 */
public class ImplicitGeneralizationMap {
	
	private static ImplicitGeneralizationMap INSTANCE = new ImplicitGeneralizationMap();
	
	public static String getDefaultSupertypeFor(Class<?> elementType) {
		return INSTANCE.get(elementType);
	}

	public static String getDefaultSupertypeFor(Class<?> elementType, String kind) {
		return INSTANCE.get(elementType, kind);
	}
	
	protected Map<String, String> map = new HashMap<String, String>();
	
	protected ImplicitGeneralizationMap() {
		
		// KerML
		
		//checkAssociationSpecialization — KerML Table 10 (§8.4.4.1 Kernel Semantics)
        put(AssociationImpl.class, "base", "Links::Link");
		//checkAssociationBinarySpecialization — KerML Table 10 (§8.4.4.1)
        put(AssociationImpl.class, "binary", "Links::BinaryLink");
		
		//checkAssociationStructureSpecialization — KerML Table 10 (§8.4.4.1)
        put(AssociationStructureImpl.class, "base", "Objects::LinkObject");
		//checkAssociationStructureBinarySpecialization — KerML Table 10 (§8.4.4.1)
        put(AssociationStructureImpl.class, "binary", "Objects::BinaryLinkObject");
		
		//checkBehaviorSpecialization — KerML Table 10 (§8.4.4.1, §8.4.4.7 Behaviors Semantics)
        put(BehaviorImpl.class, "base", "Performances::Performance");
		
		//checkBindingConnectorSpecialization — KerML Table 10 (§8.4.4.1, §8.4.4.6.2 Binding Connectors)
        put(BindingConnectorImpl.class, "binary", "Links::selfLinks");
		put(BindingConnectorImpl.class, "binaryObject", "Links::selfLinks");
		
		//checkBooleanExpressionSpecialization — KerML Table 10 (§8.4.4.1)
        put(BooleanExpressionImpl.class, "base", "Performances::booleanEvaluations");
		
		//checkClassSpecialization — KerML Table 10 (§8.4.4.1, §8.4.4.3 Classes Semantics)
        put(ClassImpl.class, "base", "Occurrences::Occurrence");

		//checkTypeSpcialization [sic, existing typo kept] — KerML Table 8 (§8.4.3.1 Core Semantics Overview),
        // applies to Classifiers per §8.4.3.3 Classifiers Semantics Note 1
        put(ClassifierImpl.class, "base", "Base::Anything");
		
		//checkConnectorSpecialization — KerML Table 10 (§8.4.4.1, §8.4.4.6.1 Connectors)
        put(ConnectorImpl.class, "base", "Links::links");
		//checkConnectorBinarySpecialization — KerML Table 10 (§8.4.4.1)
        put(ConnectorImpl.class, "binary", "Links::binaryLinks");
		//checkConnectorObjectSpecialization — KerML Table 10 (§8.4.4.1)
        put(ConnectorImpl.class, "object", "Objects::linkObjects");
		//checkConnectorBinaryObjectSpecialization — KerML Table 10 (§8.4.4.1)
        put(ConnectorImpl.class, "binaryObject", "Objects::binaryLinkObjects");
		
		//checkConstructorExpressionSpecialization — KerML Table 10 (§8.4.4.1, row "CheckConstructorExpressionSpecialization")
        put(ConstructorExpressionImpl.class, "base", "Performances::constructorEvaluations");
		
		//checkDataTypeSpecialization — KerML Table 10 (§8.4.4.1, §8.4.4.2 Data Types Semantics)
        put(DataTypeImpl.class, "base", "Base::DataValue");
		
		//checkExpressionSpecialization — KerML Table 10 (§8.4.4.1)
        put(ExpressionImpl.class, "base", "Performances::evaluations");
		//checkStepEnclosedPerformanceSpecialization — KerML Table 10 (§8.4.4.1)
        put(ExpressionImpl.class, "enclosedPerformance", "Performances::Performance::enclosedPerformances");
		
		//checkFeatureSpecialization — KerML Table 8 (§8.4.3.1 Core Semantics Overview)
        put(FeatureImpl.class, "base", "Base::things");
		//checkFeatureDataValueSpecialization — KerML Table 9 (§8.4.3.1; supports §8.4.4.2 Data Types Semantics)
        put(FeatureImpl.class, "dataValue", "Base::dataValues");
		//checkFeatureOccurrenceSpecialization — KerML Table 9 (§8.4.3.1; supports §8.4.4.3 Classes Semantics)
        put(FeatureImpl.class, "occurrence", "Occurrences::occurrences");
		//checkFeatureSuboccurrenceSpecialization — KerML Table 9 (§8.4.3.1; supports §8.4.4.3 Classes Semantics)
        put(FeatureImpl.class, "suboccurrence", "Occurrences::Occurrence::suboccurrences");
		//checkFeaturePortionSpecialization — KerML §8.3.3.3.4 Feature (abstract-syntax constraint; not
        // separately listed in Tables 8-11)
        put(FeatureImpl.class, "portion", "Occurrences::Occurrence::portions");
		//checkFeatureObjectSpecialization — KerML Table 9 (§8.4.3.1; supports §8.4.4.4 Structures Semantics)
        put(FeatureImpl.class, "object", "Objects::objects");
		//checkFeatureSubobjectSpecialization — KerML Table 9 (§8.4.3.1; supports §8.4.4.4 Structures Semantics)
        put(FeatureImpl.class, "subobject", "Objects::Object::subobjects");
		//checkFeatureEndSpecialization — KerML Table 9 (§8.4.3.1; supports §8.4.4.5 Associations Semantics)
        put(FeatureImpl.class, "participant", "Links::Link::participant");
		//checkAssignmentActionUsageStartingAtRedefinition — SysML Table 33 (§8.4.1; narrative in §8.4.13.7
        // Assignment Action Usages). Spec table gives target Actions::AssignmentAction::target::startingAt;
        // verify the library qualified name below, which differs (FeatureReferencingPerformances package) —
        // TODO: verify exact spec section / library name alignment
        put(FeatureImpl.class, "startingAt", "FeatureReferencingPerformances::FeatureAccessPerformance::onOccurrence::startingAt");
		//checkAssignmentActionUsageAccessedFeatureRedefinition — SysML Table 33 (§8.4.1; narrative in
        // §8.4.13.7). Spec table gives target Actions::AssignmentAction::target::startingAt::accessedFeature;
        // same library-name divergence as "startingAt" above — TODO: verify exact spec section / library name
        put(FeatureImpl.class, "accessedFeature", "FeatureReferencingPerformances::FeatureAccessPerformance::onOccurrence::startingAt::accessedFeature");

		//checkFeatureChainExpressionTargetRedefinition — KerML Table 11 (§8.4.4.1). NOTE: the existing
        // comment above/before this task read "checkAssignmentActionUsageAccessedFeatureRedefinition", which
        // appears to be a copy-paste mislabel — the target "ControlFunctions::'.'::source::target" matches
        // checkFeatureChainExpressionTargetRedefinition in Table 11, not the Assignment rule. Flagged, not
        // silently renamed.
        put(FeatureChainExpressionImpl.class, "target", "ControlFunctions::'.'::source::target");

		//checkFunctionSpecialization — KerML Table 10 (§8.4.4.1, §8.4.4.8 Functions Semantics). NOTE: the
        // existing comment read "checkAssignmentActionUsageAccessedFeatureRedefinition", also an apparent
        // copy-paste mislabel — flagged, not silently renamed.
        put(FunctionImpl.class, "base", "Performances::Evaluation");

		//checkInvariantSpecialization — KerML Table 10 (§8.4.4.1); "base" is the true-Invariant row,
        // "negated" the false-Invariant row (same constraint, two outcomes)
        put(InvariantImpl.class, "base", "Performances::trueEvaluations");
		//checkInvariantSpecialization — KerML Table 10 (§8.4.4.1)
        put(InvariantImpl.class, "negated", "Performances::falseEvaluations");
		
		//checkPayloadFeatureRedefinition — KerML Table 11 (§8.4.4.1)
        put(PayloadFeatureImpl.class, "payload", "Transfers::Transfer::payload");
		
		//checkFlowSpecialization — KerML Table 10 (§8.4.4.1)
        put(FlowImpl.class, "base", "Transfers::transfers");
		//checkFlowWithEndsSpecialization — KerML Table 10 (§8.4.4.1)
        put(FlowImpl.class, "flow", "Transfers::flowTransfers");
		//checkStepEnclosedPerformanceSpecialization — KerML Table 10 (§8.4.4.1)
        put(FlowImpl.class, "enclosedPerformance", "Performances::Performance::enclosedPerformances");
		//checkStepSubperformanceSpecialization — KerML Table 10 (§8.4.4.1)
        put(FlowImpl.class, "subperformance", "Performances::Performance::subperformances");
		//checkStepOwnedPerformanceSpecialization — KerML Table 10 (§8.4.4.1)
        put(FlowImpl.class, "ownedPerformance", "Objects::Object::ownedPerformances");

		//checkFeatureFlowFeatureRedefinition — KerML Table 9 (§8.4.3.1; supports §8.4.4.10.2 Flows Semantics).
        // Table 9 gives one combined row (source/targetInput); "sourceOutput" and "targetInput" are its two outcomes.
        put(FlowEndImpl.class, "sourceOutput", "Transfers::Transfer::source::sourceOutput");
		//checkFeatureFlowFeatureRedefinition — KerML Table 9 (§8.4.3.1; supports §8.4.4.10.2 Flows Semantics)
        put(FlowEndImpl.class, "targetInput", "Transfers::Transfer::target::targetInput");
		
		//checkLiteralBooleanSpecialization — KerML Table 10 (§8.4.4.1)
        put(LiteralBooleanImpl.class, "base", "Performances::literalBooleanEvaluations");
		
		//checkLiteralExpressionSpecialization — KerML Table 10 (§8.4.4.1)
        put(LiteralExpressionImpl.class, "base", "Performances::literalEvaluations");

		//checkLiteralInfinitySpecialization — KerML Table 10 (§8.4.4.1) (table row target is
        // literalIntegerEvaluations, shared with LiteralInteger)
        put(LiteralInfinityImpl.class, "base", "Performances::literalIntegerEvaluations");
		
		//checkLiteralIntegerSpecialization — KerML Table 10 (§8.4.4.1)
        put(LiteralIntegerImpl.class, "base", "Performances::literalIntegerEvaluations");
		
		//checkLiteralRationalSpecialization — KerML Table 10 (§8.4.4.1)
        put(LiteralRationalImpl.class, "base", "Performances::literalRationalEvaluations");
		
		//checkLiteralStringSpecialization — KerML Table 10 (§8.4.4.1)
        put(LiteralStringImpl.class, "base", "Performances::literalStringEvaluations");
		
		//checkMetaclassSpecialization — KerML Table 10 (§8.4.4.1, §8.3.4.12.2 Metaclass)
        put(MetaclassImpl.class, "base", "Metaobjects::Metaobject");
		//checkMetadataFeatureSpecialization — KerML Table 10 (§8.4.4.1, §8.3.4.12.3 MetadataFeature)
        put(MetadataFeatureImpl.class, "base", "Metaobjects::metaobjects");
		// No corresponding named check* implied-relationship constraint found in Tables 8-11 or §8.3.4.12.3
        // for the "annotatedElement" key (closest is the validateMetadataFeatureAnnotatedElement validation
        // constraint, which is a different kind of constraint) — TODO: verify exact spec section
        put(MetadataFeatureImpl.class, "annotatedElement", "Metaobjects::Metaobject::annotatedElement");
		//checkMetadataFeatureSemanticSpecialization — KerML Table 10 (§8.4.4.1, Note 2; §8.3.4.12.3 MetadataFeature)
        put(MetadataFeatureImpl.class, "baseType", "Metaobjects::SemanticMetadata::baseType");
		
		//checkMetadataAccessExpressionSpecialization — KerML Table 10 (§8.4.4.1)
        put(MetadataAccessExpressionImpl.class, "base", "Performances::metadataAccessEvaluations");
		
		//checkMultiplicitySpecialization — KerML Table 10 (§8.4.4.1)
        put(MultiplicityImpl.class, "base", "Base::naturals");
		// TODO: Update SysML specification to formalize default multiplicities.
		// See SYSML21-185
		put(MultiplicityImpl.class, "feature", "Base::exactlyOne");
		//checkOccurrenceDefinitionMultiplicitySpecialization — SysML Table 32 (§8.4.1). NOTE: the spec table
        // gives the target as Base::exactlyOne (source: the multiplicity of the OccurrenceDefinition), not
        // Base::zeroOrOne as used here — flagged discrepancy, not changed.
        put(MultiplicityImpl.class, "classifier", "Base::zeroOrOne");

		// No named check* constraint found for MultiplicityRange defaults in Tables 8-11 — TODO: verify exact spec section
        put(MultiplicityRangeImpl.class, "feature", "Base::naturals");
		put(MultiplicityRangeImpl.class, "classifier", "Base::naturals");
		
		//checkNullExpressionSpecialization — KerML Table 10 (§8.4.4.1)
        put(NullExpressionImpl.class, "base", "Performances::nullEvaluations");
		
		//checkPredicateSpecialization — KerML Table 10 (§8.4.4.1)
        put(PredicateImpl.class, "base", "Performances::BooleanEvaluation");
		
		//checkStepSpecialization — KerML Table 10 (§8.4.4.1)
        put(StepImpl.class, "base", "Performances::performances");
		//checkStepEnclosedPerformanceSpecialization — KerML Table 10 (§8.4.4.1)
        put(StepImpl.class, "enclosedPerformance", "Performances::Performance::enclosedPerformances");
		//checkStepSubperformanceSpecialization — KerML Table 10 (§8.4.4.1)
        put(StepImpl.class, "subperformance", "Performances::Performance::subperformances");
		//checkStepOwnedPerformanceSpecialization — KerML Table 10 (§8.4.4.1)
        put(StepImpl.class, "ownedPerformance", "Objects::Object::ownedPerformances");
		// No named check* constraint found in Tables 8-11 for these two keys (Occurrences::Occurrence::
        // incomingTransfers and FeatureReferencingPerformances::FeatureWritePerformance are library elements,
        // see KerML §9.2.4/§9.2.8.2.8) — TODO: verify exact spec section
        put(StepImpl.class, "incomingTransfer", "Occurrences::Occurrence::incomingTransfers");
		put(StepImpl.class, "featureWrite", "FeatureReferencingPerformances::FeatureWritePerformance");
		
		//checkStructureSpecialization — KerML Table 10 (§8.4.4.1, §8.4.4.4 Structures Semantics)
        put(StructureImpl.class, "base", "Objects::Object");
		
		//checkSuccessionSpecialization — KerML Table 10 (§8.4.4.1)
        put(SuccessionImpl.class, "binary", "Occurrences::happensBeforeLinks");
		put(SuccessionImpl.class, "binaryObject", "Occurrences::happensBeforeLinks");

		//checkSuccessionFlowSpecialization — KerML Table 10 (§8.4.4.1). NOTE: existing comment read
        // "checkSuccessionSpecialization", which appears to be a copy-paste mislabel — the target
        // Transfers::flowTransfersBefore matches the checkSuccessionFlowSpecialization row, not the plain
        // Succession row above. Flagged, not silently renamed.
        put(SuccessionFlowImpl.class, "base", "Transfers::flowTransfersBefore");
		//checkStepEnclosedPerformanceSpecialization — KerML Table 10 (§8.4.4.1)
        put(SuccessionFlowImpl.class, "enclosedperformance", "Performances::Performance::enclosedPerformances");
		//checkStepSubperformanceSpecialization — KerML Table 10 (§8.4.4.1)
        put(SuccessionFlowImpl.class, "subperformance", "Performances::Performance::subperformances");
		//checkStepOwnedPerformanceSpecialization — KerML Table 10 (§8.4.4.1)
        put(SuccessionFlowImpl.class, "ownedPerformance", "Objects::Object::ownedPerformances");
		
		//checkTypeSpecialization — KerML Table 8 (§8.4.3.1 Core Semantics Overview, §8.4.3.2 Types Semantics)
        put(TypeImpl.class, "base", "Base::Anything");

		// SysML
		
		//checkAcceptActionUsageSpecialization — SysML Table 32 (§8.4.1)
        put(AcceptActionUsageImpl.class, "base", "Actions::acceptActions");
		//checkAcceptActionUsageSubactionSpecialization — SysML Table 32 (§8.4.1)
        put(AcceptActionUsageImpl.class, "subaction", "Actions::Action::acceptSubactions");
		
		//checkActionDefinitionSpecialization — SysML Table 31 (§8.4.1)
        put(ActionDefinitionImpl.class, "base", "Actions::Action");
		//checkActionUsageSpecialization — SysML Table 32 (§8.4.1)
        put(ActionUsageImpl.class, "base", "Actions::actions");
		//checkActionUsageSubactionSpecialization — SysML Table 32 (§8.4.1)
        put(ActionUsageImpl.class, "subaction", "Actions::Action::subactions");
		//checkActionUsageOwnedActionSpecialization — SysML Table 32 (§8.4.1)
        put(ActionUsageImpl.class, "ownedAction", "Parts::Part::ownedActions");
		//checkStepSubperformanceSpecialization — KerML Table 10 (§8.4.4.1), reused via ActionUsage's Step ancestry
        put(ActionUsageImpl.class, "subperformance", "Performances::Performance::subperformances");
		//checkStepEnclosedPerformanceSpecialization — KerML Table 10 (§8.4.4.1)
        put(ActionUsageImpl.class, "enclosedPerformance", "Performances::Performance::enclosedPerformances");
		//checkStepOwnedPerformanceSpecialization — KerML Table 10 (§8.4.4.1)
        put(ActionUsageImpl.class, "ownedPerformance", "Objects::Object::ownedPerformances");
		//checkActionUsageStateActionRedefinition — SysML Table 33 (§8.4.1)
        put(ActionUsageImpl.class, "entry", "States::StateAction::entryAction");
		//checkActionUsageStateActionRedefinition — SysML Table 33 (§8.4.1)
        put(ActionUsageImpl.class, "do", "States::StateAction::doAction");
		//checkActionUsageStateActionRedefinition — SysML Table 33 (§8.4.1)
        put(ActionUsageImpl.class, "exit", "States::StateAction::exitAction");
		//checkTransitionUsageTransitionFeatureSpecialization — SysML Table 32 (§8.4.1)
        put(ActionUsageImpl.class, "trigger", "Actions::TransitionAction::accepter");
		//checkTransitionUsageTransitionFeatureSpecialization — SysML Table 32 (§8.4.1)
        put(ActionUsageImpl.class, "guard", "Actions::TransitionAction::guard");
		//checkTransitionUsageTransitionFeatureSpecialization — SysML Table 32 (§8.4.1)
        put(ActionUsageImpl.class, "effect", "Actions::TransitionAction::effect");

		//checkAllocationDefinitionSpecialization — SysML Table 31 (§8.4.1); table lists one row (base) covering
        // this ActionDefinition-like target for both keys used here
        put(AllocationDefinitionImpl.class, "base", "Allocations::Allocation");
		//checkAllocationDefinitionSpecialization — SysML Table 31 (§8.4.1)
        put(AllocationDefinitionImpl.class, "binary", "Allocations::Allocation");
		//checkAllocationUsageSpecialization — SysML Table 32 (§8.4.1)
        put(AllocationUsageImpl.class, "base", "Allocations::allocations");
		//checkAllocationUsageSpecialization — SysML Table 32 (§8.4.1)
        put(AllocationUsageImpl.class, "binary", "Allocations::allocations");
		
		//checkAnalysisCaseDefinitionSpecialization — SysML Table 31 (§8.4.1)
        put(AnalysisCaseDefinitionImpl.class, "base", "AnalysisCases::AnalysisCase");
		//checkAnalysisCaseUsageSpecialization — SysML Table 32 (§8.4.1)
        put(AnalysisCaseUsageImpl.class, "base", "AnalysisCases::analysisCases");
		//checkAnalysisCaseUsageSubAnalysisCaseSpecialization — SysML Table 32 (§8.4.1)
        put(AnalysisCaseUsageImpl.class, "subAnalysisCase", "AnalysisCases::AnalysisCase::subAnalysisCases");

		//checkAssertConstraintUsageSpecialization — SysML Table 32 (§8.4.1); "base"/"negated" are the
        // isNegated=false/true outcomes of the same constraint
        put(AssertConstraintUsageImpl.class, "base", "Constraints::assertedConstraintChecks");
		//checkAssertConstraintUsageSpecialization — SysML Table 32 (§8.4.1)
        put(AssertConstraintUsageImpl.class, "negated", "Constraints::negatedConstraintChecks");
		
		//checkAssignmentActionUsageSpecialization — SysML Table 32 (§8.4.1, §8.4.13.7 Assignment Action Usages)
        put(AssignmentActionUsageImpl.class, "base", "Actions::assignmentActions");
		//checkAssignmentActionUsageSubactionSpecialization — SysML Table 32 (§8.4.1, §8.4.13.7)
        put(AssignmentActionUsageImpl.class, "subaction", "Actions::Action::assignments");
		// No named check* constraint found for this "featureWrite" key specifically (§8.4.13.7 narrative
        // discusses Actions::AssignmentAction as the defining ActionDefinition of Actions::assignmentActions,
        // not a separate implied relationship) — TODO: verify exact spec section
        put(AssignmentActionUsageImpl.class, "featureWrite", "Actions::AssignmentAction");

		//checkDataTypeSpecialization (an AttributeDefinition is a DataType) — KerML Table 10 (§8.4.4.1),
        // applied via SysML Definition semantics (§8.4.2.1)
        put(AttributeDefinitionImpl.class, "base", "Base::DataValue");
		//checkAttributeUsageSpecialization — SysML Table 32 (§8.4.1)
        put(AttributeUsageImpl.class, "base", "Base::dataValues");

		//checkBindingConnectorSpecialization — KerML Table 10 (§8.4.4.1), applied to the SysML
        // BindingConnectorAsUsage surface syntax (§8.4.1 Note 1 on binding-connector constraints)
        put(BindingConnectorAsUsageImpl.class, "base", "Links::selfLinks");
		//checkBindingConnectorSpecialization — KerML Table 10 (§8.4.4.1)
        put(BindingConnectorAsUsageImpl.class, "binary", "Links::selfLinks");
		put(BindingConnectorAsUsageImpl.class, "binaryObject", "Links::selfLinks");
		
		//checkCalculationDefinitionSpecialization — SysML Table 31 (§8.4.1)
        put(CalculationDefinitionImpl.class, "base", "Calculations::Calculation");
		//checkCalculationUsageSpecialization — SysML Table 32 (§8.4.1)
        put(CalculationUsageImpl.class, "base", "Calculations::calculations");
		//checkCalculationUsageSubcalculationSpecialization — SysML Table 32 (§8.4.1)
        put(CalculationUsageImpl.class, "subcalculation", "Calculations::Calculation::subcalculations");
		
		//checkCaseDefinitionSpecialization — SysML Table 31 (§8.4.1)
        put(CaseDefinitionImpl.class, "base", "Cases::Case");
		//checkCaseUsageSpecialization — SysML Table 32 (§8.4.1)
        put(CaseUsageImpl.class, "base", "Cases::cases");
		//checkCaseUsageSubcaseSpecialization — SysML Table 32 (§8.4.1)
        put(CaseUsageImpl.class, "subcase", "Cases::Case::subcases");

		//checkConcernDefinitionSpecialization — SysML Table 31 (§8.4.1). NOTE: existing comment read
        // "checkCaseUsageSubcaseSpecialization", an apparent copy-paste mislabel — flagged, not silently
        // renamed. Also NOTE: Table 31 gives the target package as "Concerns::ConcernCheck", not
        // "Requirements::ConcernCheck" as used here — flagged discrepancy, not changed (possibly a PDF
        // extraction artifact or a genuine library reorganization; verify against the actual library resource).
        put(ConcernDefinitionImpl.class, "base", "Requirements::ConcernCheck");
		//checkConcernUsageSpecialization — SysML Table 32 (§8.4.1)
        put(ConcernUsageImpl.class, "base", "Requirements::concernChecks");
		//checkConcernUsageFramedConcernSpecialization — SysML Table 32 (§8.4.1)
        put(ConcernUsageImpl.class, "concern", "Requirements::RequirementCheck::concerns");

		//checkConnectionDefinitionSpecialization / checkConnectionDefinitionBinarySpecialization — SysML
        // Table 31 (§8.4.1). NOTE: existing comment reused "checkConnectionDefinitionBinarySpecialization"
        // for the "base" key too; Table 31 actually lists a separate checkConnectionDefinitionSpecialization
        // row for "base" — flagged, not silently renamed.
        put(ConnectionDefinitionImpl.class, "base", "Connections::Connection");
		//checkConnectionDefinitionBinarySpecialization — SysML Table 31 (§8.4.1)
        put(ConnectionDefinitionImpl.class, "binary", "Connections::BinaryConnection");
		//checkConnectionUsageSpecialization — SysML Table 32 (§8.4.1)
        put(ConnectionUsageImpl.class, "base", "Connections::connections");
		//checkConnectionUsageBinarySpecialization — SysML Table 32 (§8.4.1)
        put(ConnectionUsageImpl.class, "binary", "Connections::binaryConnections");
		//checkPartUsageSubpartSpecialization (a ConnectionUsage is a PartUsage) — SysML Table 32 (§8.4.1)
        put(ConnectionUsageImpl.class, "subpart", "Items::Item::subparts");
		
		//checkConstraintDefinitionSpecialization — SysML Table 31 (§8.4.1)
        put(ConstraintDefinitionImpl.class, "base", "Constraints::ConstraintCheck");
		//checkConstraintUsageSpecialization — SysML Table 32 (§8.4.1)
        put(ConstraintUsageImpl.class, "base", "Constraints::constraintChecks");
		//checkConstraintUsageCheckedConstraintSpecialization — SysML Table 32 (§8.4.1)
        put(ConstraintUsageImpl.class, "checkedConstraint", "Items::Item::checkedConstraints");
		//checkStepEnclosedPerformanceSpecialization — KerML Table 10 (§8.4.4.1)
        put(ConstraintUsageImpl.class, "enclosedPerformance", "Performances::Performance::enclosedPerformances");
		//checkStepSubperformanceSpecialization — KerML Table 10 (§8.4.4.1)
        put(ConstraintUsageImpl.class, "subperformance", "Performances::Performance::subperformances");
		//checkStepOwnedPerformanceSpecialization — KerML Table 10 (§8.4.4.1)
        put(ConstraintUsageImpl.class, "ownedPerformance", "Objects::Object::ownedPerformances");
		//checkConstraintUsageRequirementConstraintSpecialization — SysML Table 32 (§8.4.1); "assumption"/
        // "requirement" are the two outcomes depending on the owning RequirementConstraintMembership kind
        put(ConstraintUsageImpl.class, "assumption", "Requirements::RequirementCheck::assumptions");
		//checkConstraintUsageRequirementConstraintSpecialization — SysML Table 32 (§8.4.1)
        put(ConstraintUsageImpl.class, "requirement", "Requirements::RequirementCheck::constraints");
		
		//checkDecisionNodeSpecialization — SysML Table 32 (§8.4.1)
        put(DecisionNodeImpl.class, "subaction", "Actions::Action::decisions");
		
		//checkEventOccurrenceUsageSpecialization — SysML Table 32 (§8.4.1)
        put(EventOccurrenceUsageImpl.class, "suboccurrence", "Occurrences::Occurrence::timeEnclosedOccurrences");
		
		//checkExhibitStateUsageSpecialization — SysML Table 32 (§8.4.1)
        put(ExhibitStateUsageImpl.class, "performedAction", "Parts::Part::exhibitedStates");
		
		//checkFlowDefinitionSpecialization — SysML Table 31 (§8.4.1)
        put(FlowDefinitionImpl.class, "base", "Flows::MessageAction");
		//checkFlowDefinitionBinarySpecialization — SysML Table 31 (§8.4.1)
        put(FlowDefinitionImpl.class, "binary", "Flows::Message");
		//checkFlowUsageFlowSpecialization — SysML Table 32 (§8.4.1)
        put(FlowUsageImpl.class, "base", "Flows::flows");
		//checkFlowUsageSpecialization — SysML Table 32 (§8.4.1)
        put(FlowUsageImpl.class, "message", "Flows::messages");
		//checkActionUsageSubactionSpecialization — SysML Table 32 (§8.4.1), reused via FlowUsage's ActionUsage ancestry
        put(FlowUsageImpl.class, "subaction", "Actions::Action::subactions");
		//checkActionUsageOwnedActionSpecialization — SysML Table 32 (§8.4.1)
        put(FlowUsageImpl.class, "ownedAction", "Parts::Part::ownedActions");
		//checkStepEnclosedPerformanceSpecialization — KerML Table 10 (§8.4.4.1)
        put(FlowUsageImpl.class, "enclosedPerformance", "Performances::Performance::enclosedPerformances");
		//checkStepSubperformanceSpecialization — KerML Table 10 (§8.4.4.1)
        put(FlowUsageImpl.class, "subperformance", "Performances::Performance::subperformances");
		//checkStepOwnedPerformanceSpecialization — KerML Table 10 (§8.4.4.1)
        put(FlowUsageImpl.class, "ownedPerformance", "Objects::Object::ownedPerformances");
		//checkActionUsageStateActionRedefinition — SysML Table 33 (§8.4.1)
        put(FlowUsageImpl.class, "entry", "States::StateAction::entryAction");
		//checkActionUsageStateActionRedefinition — SysML Table 33 (§8.4.1)
        put(FlowUsageImpl.class, "do", "States::StateAction::doAction");
		//checkActionUsageStateActionRedefinition — SysML Table 33 (§8.4.1)
        put(FlowUsageImpl.class, "exit", "States::StateAction::exitAction");
		//checkTransitionUsageTransitionFeatureSpecialization — SysML Table 32 (§8.4.1)
        put(FlowUsageImpl.class, "trigger", "Actions::TransitionAction::accepter");
		//checkTransitionUsageTransitionFeatureSpecialization — SysML Table 32 (§8.4.1)
        put(FlowUsageImpl.class, "guard", "Actions::TransitionAction::guard");
		//checkTransitionUsageTransitionFeatureSpecialization — SysML Table 32 (§8.4.1)
        put(FlowUsageImpl.class, "effect", "Actions::TransitionAction::effect");
		//checkOccurrenceUsageTimeSliceSpecialization — SysML Table 32 (§8.4.1)
        put(FlowUsageImpl.class, "timeslice", "Occurrences::Occurrence::timeSlices");
		//checkOccurrenceUsageSnapshotSpecialization — SysML Table 32 (§8.4.1)
        put(FlowUsageImpl.class, "snapshot", "Occurrences::Occurrence::snapshots");
		
		//checkForLoopActionUsageSpecialization — SysML Table 32 (§8.4.1)
        put(ForLoopActionUsageImpl.class, "base", "Actions::forLoopActions");
		//checkForLoopActionUsageSubactionSpecialization — SysML Table 32 (§8.4.1)
        put(ForLoopActionUsageImpl.class, "subaction", "Actions::Action::forLoops");
		//checkForLoopActionUsageVarRedefinition — no dedicated Table 33 row found by this name; corroborated
        // by SysML Table 32's ForLoopAction entries and §8.4.13 Actions Semantics narrative —
        // TODO: verify exact spec section
        put(ForLoopActionUsageImpl.class, "loopVariable", "Actions::ForLoopAction::var");
		
		//checkForkNodeSpecialization — SysML Table 32 (§8.4.1)
        put(ForkNodeImpl.class, "subaction", "Actions::Action::forks");

		//checkIfActionUsageSpecialization — SysML Table 32 (§8.4.1); "base"/"ifThenElse" are the
        // no-elseClause/has-elseClause outcomes of the same constraint
        put(IfActionUsageImpl.class, "base", "Actions::ifThenActions");
		//checkIfActionUsageSpecialization — SysML Table 32 (§8.4.1)
        put(IfActionUsageImpl.class, "ifThenElse", "Actions::ifThenElseActions");
		//checkIfActionUsageSubactionSpecialization — SysML Table 32 (§8.4.1)
        put(IfActionUsageImpl.class, "subaction", "Actions::Action::ifSubactions");

		//checkIncludeUseCaseUsageSpecialization — SysML Table 32 (§8.4.1). NOTE: existing comment read
        // "checkIncludeUseCaseSpecialization" (missing "Usage") — likely a naming shorthand, not flagged as
        // wrong, just noted for consistency with the table's exact name.
        put(IncludeUseCaseUsageImpl.class, "subUseCase", "UseCases::UseCase::includedUseCases");
		//checkPerformActionUsageSpecialization — SysML Table 32 (§8.4.1), reused for IncludeUseCaseUsage's
        // PartUsage-ownership performedAction case
        put(IncludeUseCaseUsageImpl.class, "performedAction", "Parts::Part::performedActions");
		
		//checkInterfaceDefinitionSpecialization — SysML Table 31 (§8.4.1)
        put(InterfaceDefinitionImpl.class, "base", "Interfaces::Interface");
		//checkInterfaceDefinitionBinarySpecialization — SysML Table 31 (§8.4.1)
        put(InterfaceDefinitionImpl.class, "binary", "Interfaces::BinaryInterface");
		//checkInterfaceUsageSpecialization — SysML Table 32 (§8.4.1)
        put(InterfaceUsageImpl.class, "base", "Interfaces::interfaces");
		//checkInterfaceUsageBinarySpecialization — SysML Table 32 (§8.4.1)
        put(InterfaceUsageImpl.class, "binary", "Interfaces::binaryInterfaces");
		
		//checkItemDefinitionSpecialization — SysML Table 31 (§8.4.1)
        put(ItemDefinitionImpl.class, "base", "Items::Item");
		//checkItemUsageSpecialization — SysML Table 32 (§8.4.1). NOTE: existing comment reused
        // "checkItemDefinitionSpecialization" for this ItemUsage entry — flagged, not silently renamed.
        put(ItemUsageImpl.class, "base", "Items::items");
		//checkItemUsageSubitemSpecialization — SysML Table 32 (§8.4.1)
        put(ItemUsageImpl.class, "subitem", "Items::Item::subitems");
		
		//checkJoinNodeSpecialization — SysML Table 32 (§8.4.1)
        put(JoinNodeImpl.class, "subaction", "Actions::Action::joins");
		
		//checkMetadataDefinitionSpecialization — SysML Table 31 (§8.4.1)
        put(MetadataDefinitionImpl.class, "base", "Metadata::MetadataItem");
		//checkMetadataUsageSpecialization — SysML Table 32 (§8.4.1)
        put(MetadataUsageImpl.class, "base", "Metadata::metadataItems");
		// Same as MetadataFeatureImpl "annotatedElement" above — no dedicated Table 31-33 row found —
        // TODO: verify exact spec section maybe validateMetadataFeatureAnnotatedElement
        put(MetadataUsageImpl.class, "annotatedElement", "Metaobjects::Metaobject::annotatedElement");
		// Same as MetadataFeatureImpl "baseType" (checkMetadataFeatureSemanticSpecialization, KerML Table 10
        // §8.4.4.1), reused here for MetadataUsage
        put(MetadataUsageImpl.class, "baseType", "Metaobjects::SemanticMetadata::baseType");
		
		//checkMergeNodeSpecialization — SysML Table 32 (§8.4.1)
        put(MergeNodeImpl.class, "subaction", "Actions::Action::merges");

		//checkClassSpecialization (an OccurrenceDefinition is a Class) — KerML Table 10 (§8.4.4.1), applied
        // via SysML Definition semantics (§8.4.2.1)
        put(OccurrenceDefinitionImpl.class, "base", "Occurrences::Occurrence");
		//checkOccurrenceDefinitionIndividualSpecialization — abstract syntax SysML §8.3.9.3
		// "OccurrenceDefinition", tabulated at Table 31 (§8.4.1), narrated at §8.4.5.1
		// "Occurrence Definitions"
        put(OccurrenceDefinitionImpl.class, "life", "Occurrences::Life");
		//checkOccurrenceUsageSpecialization — SysML Table 32 (§8.4.1)
        put(OccurrenceUsageImpl.class, "base", "Occurrences::occurrences");
		//checkOccurrenceUsageTimeSliceSpecialization — SysML Table 32 (§8.4.1)
        put(OccurrenceUsageImpl.class, "timeslice", "Occurrences::Occurrence::timeSlices");
		//checkOccurrenceUsageSnapshotSpecialization — SysML Table 32 (§8.4.1)
        put(OccurrenceUsageImpl.class, "snapshot", "Occurrences::Occurrence::snapshots");
				
		//checkPartDefinitionSpecialization — SysML Table 31 (§8.4.1)
        put(PartDefinitionImpl.class, "base", "Parts::Part");
		//checkPartUsageSpecialization — SysML Table 32 (§8.4.1)
        put(PartUsageImpl.class, "base", "Parts::parts");
		//checkPartUsageSubpartSpecialization — SysML Table 32 (§8.4.1). NOTE: existing key is "subitem" here,
        // while the analogous ConnectionUsage/RenderingUsage/ViewUsage entries below use "subpart" for the
        // same constraint — flagged as a possible key-naming inconsistency (not a citation problem), not changed.
        put(PartUsageImpl.class, "subitem", "Items::Item::subparts");
		//checkPartUsageActorSpecialization — SysML Table 32 (§8.4.1). NOTE: table target text is
        // "Requirements::Requirement::actors"; code uses "Requirements::RequirementCheck::actors" — flagged
        // discrepancy (likely PDF text-extraction shorthand for the same library feature), not changed.
        put(PartUsageImpl.class, "requirementActor", "Requirements::RequirementCheck::actors");
		//checkPartUsageStakeholderSpecialization — SysML Table 32 (§8.4.1); same
        // Requirement/RequirementCheck naming note as above
        put(PartUsageImpl.class, "requirementStakeholder", "Requirements::RequirementCheck::stakeholders");
		//checkPartUsageActorSpecialization — SysML Table 32 (§8.4.1), Cases::Case::actors outcome
        put(PartUsageImpl.class, "caseActor", "Cases::Case::actors");
		
		//checkPerformActionUsageSpecialization — SysML Table 32 (§8.4.1)
        put(PerformActionUsageImpl.class, "performedAction", "Parts::Part::performedActions");
		
		//checkPortDefinitionSpecialization — SysML Table 31 (§8.4.1)
        put(PortDefinitionImpl.class, "base", "Ports::Port");
		//checkPortUsageSpecialization — SysML Table 32 (§8.4.1)
        put(PortUsageImpl.class, "base", "Ports::ports");
		//checkPortUsageOwnedPortSpecialization — SysML Table 32 (§8.4.1)
        put(PortUsageImpl.class, "ownedPort", "Parts::Part::ownedPorts");
		//checkPortUsageSubportSpecialization — SysML Table 32 (§8.4.1)
        put(PortUsageImpl.class, "subport", "Ports::Port::subports");
		
		//checkRenderingDefinitionSpecialization — SysML Table 31 (§8.4.1)
        put(RenderingDefinitionImpl.class, "base", "Views::Rendering");
		//checkRenderingUsageSpecialization — SysML Table 32 (§8.4.1)
        put(RenderingUsageImpl.class, "base", "Views::renderings");
		//checkRenderingUsageSubrenderingSpecialization — SysML Table 32 (§8.4.1)
        put(RenderingUsageImpl.class, "subrendering", "Views::Rendering::subrenderings");
		//checkRenderingUsageRedefinition — SysML Table 33 (§8.4.1)
        put(RenderingUsageImpl.class, "viewRendering", "Views::View::viewRendering");
		//checkPartUsageSubpartSpecialization (a RenderingUsage is a PartUsage) — SysML Table 32 (§8.4.1)
        put(RenderingUsageImpl.class, "subpart", "Items::Item::subparts");
		
		//checkRequirementDefinitionSpecialization — SysML Table 31 (§8.4.1)
        put(RequirementDefinitionImpl.class, "base", "Requirements::RequirementCheck");
		//checkRequirementUsageSpecialization — SysML Table 32 (§8.4.1)
        put(RequirementUsageImpl.class, "base", "Requirements::requirementChecks");
		//checkRequirementUsageSubrequirementSpecialization — SysML Table 32 (§8.4.1)
        put(RequirementUsageImpl.class, "subrequirement", "Requirements::RequirementCheck::subrequirements");
		//checkRequirementUsageRequirementVerificationSpecialization — SysML Table 32 (§8.4.1)
        put(RequirementUsageImpl.class, "verification", "Verifications::VerificationCase::obj::requirementVerifications");

		//checkSatisfyRequirementUsageSpecialization — SysML Table 32 (§8.4.1, referenced narrative); "base"/
        // "negated" are the isNegated=false/true outcomes
        put(SatisfyRequirementUsageImpl.class, "base", "Requirements::satisfiedRequirementChecks");
		//checkSatisfyRequirementUsageSpecialization — SysML Table 32 (§8.4.1)
        put(SatisfyRequirementUsageImpl.class, "negated", "Requirements::notSatisfiedRequirementChecks");
		
		//checkSendActionUsageSpecialization — SysML Table 32 (§8.4.1)
        put(SendActionUsageImpl.class, "base", "Actions::sendActions");
		//checkSendActionUsageSubactionSpecialization — SysML Table 32 (§8.4.1). NOTE: existing comment reused
        // "checkActionUsageSubactionSpecialization" here — flagged, not silently renamed (target
        // Actions::Action::sendSubactions matches the SendActionUsage-specific row, not the generic one).
        put(SendActionUsageImpl.class, "subaction", "Actions::Action::sendSubactions");
		
		//checkStateDefinitionSpecialization — SysML Table 31 (§8.4.1)
        put(StateDefinitionImpl.class, "base", "States::StateAction");
		//checkStateUsageSpecialization — SysML Table 32 (§8.4.1)
        put(StateUsageImpl.class, "base", "States::stateActions");
		//checkStateUsageSubstateSpecialization — SysML Table 32 (§8.4.1)
        put(StateUsageImpl.class, "substate", "States::StateAction::substates");
		//checkStateUsageExclusiveStateSpecialization — SysML Table 32 (§8.4.1)
        put(StateUsageImpl.class, "exclusiveState", "States::StateAction::exclusiveStates");
		//checkStateUsageOwnedStateSpecialization — SysML Table 32 (§8.4.1)
        put(StateUsageImpl.class, "ownedAction", "Parts::Part::ownedStates");
		
		//checkSuccessionSpecialization — KerML Table 10 (§8.4.4.1), applied via SysML SuccessionAsUsage surface syntax
        put(SuccessionAsUsageImpl.class, "base", "Occurrences::happensBeforeLinks");
		//checkSuccessionSpecialization — KerML Table 10 (§8.4.4.1)
        put(SuccessionAsUsageImpl.class, "binary", "Occurrences::happensBeforeLinks");
		put(SuccessionAsUsageImpl.class, "binaryObject", "Occurrences::happensBeforeLinks");
		//checkDecisionNodeOutgoingSuccessionSpecialization — SysML Table 32 (§8.4.1)
        put(SuccessionAsUsageImpl.class, "decision", "ControlPerformances::DecisionPerformance::outgoingHBLink");
		//checkMergeNodeIncomingSuccessionSpecialization — SysML Table 32 (§8.4.1)
        put(SuccessionAsUsageImpl.class, "merge", "ControlPerformances::MergePerformance::incomingHBLink");

		//checkSuccessionFlowUsageSpecialization — SysML Table 32 (§8.4.1); "base"/"message" both resolve to
        // the same target in the table
        put(SuccessionFlowUsageImpl.class, "base", "Flows::successionFlows");
		//checkSuccessionFlowUsageSpecialization — SysML Table 32 (§8.4.1)
        put(SuccessionFlowUsageImpl.class, "message", "Flows::successionFlows");
		
		//checkTerminateActionUsageSpecialization — SysML Table 32 (§8.4.1)
        put(TerminateActionUsageImpl.class, "base", "Actions::terminateActions");
		//checkTerminateActionUsageSubactionSpecialization — SysML Table 32 (§8.4.1)
        put(TerminateActionUsageImpl.class, "subaction", "Actions::Action::terminateSubactions");
		
		//checkTransitionUsageSpecialization — SysML Table 32 (§8.4.1)
        put(TransitionUsageImpl.class, "base", "Actions::transitionActions");
		//checkTransitionUsageActionSpecialization — SysML Table 32 (§8.4.1)
        put(TransitionUsageImpl.class, "actionTransition", "Actions::Action::decisionTransitions");
		//checkTransitionUsageStateSpecialization — SysML Table 32 (§8.4.1)
        put(TransitionUsageImpl.class, "stateTransition", "States::StateAction::stateTransitions");

		//checkInvocationExpressionSpecialization (with appropriate insantiatedType) [sic, existing typo kept]
        // — KerML Table 10 (§8.4.4.1) for the general InvocationExpression mechanism; the specific
        // when/at/after target selection is the instantiatedTypeFunction() operation in SysML
        // §8.3.17.17 TriggerInvocationExpression
        put(TriggerInvocationExpressionImpl.class, "when", "Triggers::TriggerWhen");
		put(TriggerInvocationExpressionImpl.class, "at", "Triggers::TriggerAt");
		put(TriggerInvocationExpressionImpl.class, "after", "Triggers::TriggerAfter");
		
		//checkUseCaseDefinitionSpecialization — SysML Table 31 (§8.4.1)
        put(UseCaseDefinitionImpl.class, "base", "UseCases::UseCase");
		//checkUseCaseUsageSpecialization — SysML Table 32 (§8.4.1)
        put(UseCaseUsageImpl.class, "base", "UseCases::useCases");
		//checkUseCaseUsageSubUseCaseSpecialization — SysML Table 32 (§8.4.1)
        put(UseCaseUsageImpl.class, "subUseCase", "UseCases::UseCase::subUseCases");
		
		//checkVerificationCaseDefinitionSpecialization — SysML Table 31 (§8.4.1)
        put(VerificationCaseDefinitionImpl.class, "base", "VerificationCases::VerificationCase");
		//checkVerificationCaseUsageSpecialization — SysML Table 32 (§8.4.1)
        put(VerificationCaseUsageImpl.class, "base", "VerificationCases::verificationCases");
		//checkVerificationCaseUsageSubVerificationCaseSpecialization — SysML Table 32 (§8.4.1)
        put(VerificationCaseUsageImpl.class, "subVerificationCase", "VerificationCases::VerificationCase::subVerificationCases");
		
		//checkViewDefinitionSpecialization — SysML Table 31 (§8.4.1)
        put(ViewDefinitionImpl.class, "base", "Views::View");
		//checkViewUsageSpecialization — SysML Table 32 (§8.4.1)
        put(ViewUsageImpl.class, "base", "Views::views");
		//checkViewUsageSubviewSpecialization — SysML Table 32 (§8.4.1)
        put(ViewUsageImpl.class, "subview", "Views::View::subviews");
		//checkPartUsageSubpartSpecialization (a ViewUsage is a PartUsage) — SysML Table 32 (§8.4.1)
        put(ViewUsageImpl.class, "subpart", "Items::Item::subparts");
		
		//checkViewpointDefinitionSpecialization — SysML Table 31 (§8.4.1)
        put(ViewpointDefinitionImpl.class, "base", "Views::ViewpointCheck");
		//checkViewpointUsageSpecialization — SysML Table 32 (§8.4.1). NOTE: table target text reads
        // "Views::viewpoints"; code uses "Views::viewpointChecks" — flagged discrepancy, not changed.
        put(ViewpointUsageImpl.class, "base", "Views::viewpointChecks");
		//checkViewpointUsageViewpointSatisfactionSpecialization — SysML Table 32 (§8.4.1)
        put(ViewpointUsageImpl.class, "satisfied", "Views::View::viewpointSatisfactions");
		
		//checkWhileLoopActionUsageSpecialization — SysML Table 32 (§8.4.1)
        put(WhileLoopActionUsageImpl.class, "base", "Actions::whileLoopActions");
		//checkWhileLoopActionUsageSubactionSpecialization — SysML Table 32 (§8.4.1)
        put(WhileLoopActionUsageImpl.class, "subaction", "Actions::Action::whileLoops");
	}
	
	public String get(Class<?> elementType) {
		return get(elementType, "base");
	}

	public String get(Class<?> elementType, String kind) {
		do {
			String defaultSupertype = map.get(elementType.getSimpleName()+ "_" + kind);
			if (defaultSupertype != null) {
				return defaultSupertype;
			}
			elementType = elementType.getSuperclass();
		} while (elementType != null);
		return null;
	}
	
	protected void put(Class<?> elementType, String kind, String defaultSupertype) {
		map.put(elementType.getSimpleName()+ "_" + kind, defaultSupertype);
	}

}
