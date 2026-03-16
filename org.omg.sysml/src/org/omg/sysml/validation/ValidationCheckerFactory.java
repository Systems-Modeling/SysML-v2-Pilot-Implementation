/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
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

package org.omg.sysml.validation;

import org.omg.sysml.lang.sysml.util.SysMLSwitch;
import org.omg.sysml.validation.kerml.*;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.*;

/**
 * A factory class for creating the appropriate ValidationChecker instance for a specific
 * abstract syntax element. ValidationCheckers are actually created and cached per EClass,
 * and the same (stateless) ValidationChecker is used for all elements of the same
 * EClass.
 */
public class ValidationCheckerFactory extends SysMLSwitch<ValidationChecker> {
	
	private Map<EClass, ValidationChecker> validationCheckerCache = new HashMap<>();
	
	public ValidationChecker getValidationChecker(Element element) {
		EClass eClass = element.eClass();
		ValidationChecker checker = validationCheckerCache.get(eClass);
		if (checker == null) {
			checker = doSwitch(eClass, element);
			if (checker != null) {
				validationCheckerCache.put(eClass, checker);
			}
		}
		return checker;
	}
	
	public ValidationChecker createValidationChecker(Element element) {
		return doSwitch(element);
	}
	
	// KerML
	
	@Override
	public ValidationChecker caseAnnotatingElement(AnnotatingElement element) {
		return new AnnotatingElementValidationChecker();
	}

	@Override
	public ValidationChecker caseAnnotation(Annotation element) {
		return new AnnotationValidationChecker();
	}

	@Override
	public ValidationChecker caseAssociation(Association element) {
		return new AssociationValidationChecker();
	}

	@Override
	public ValidationChecker caseAssociationStructure(AssociationStructure element) {
		return new AssociationStructureValidationChecker();
	}

	@Override
	public ValidationChecker caseBehavior(Behavior element) {
		return new BehaviorValidationChecker();
	}

	@Override
	public ValidationChecker caseBindingConnector(BindingConnector element) {
		return new BindingConnectorValidationChecker();
	}

	@Override
	public ValidationChecker caseBooleanExpression(BooleanExpression element) {
		return new BooleanExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseClass(org.omg.sysml.lang.sysml.Class element) {
		return new ClassValidationChecker();
	}

	@Override
	public ValidationChecker caseClassifier(Classifier element) {
		return new ClassifierValidationChecker();
	}

	@Override
	public ValidationChecker caseCollectExpression(CollectExpression element) {
		return new CollectExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseComment(Comment element) {
		return new CommentValidationChecker();
	}

	@Override
	public ValidationChecker caseConjugation(Conjugation element) {
		return new ConjugationValidationChecker();
	}

	@Override
	public ValidationChecker caseConnector(Connector element) {
		return new ConnectorValidationChecker();
	}

	@Override
	public ValidationChecker caseConstructorExpression(ConstructorExpression element) {
		return new ConstructorExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseCrossSubsetting(CrossSubsetting element) {
		return new CrossSubsettingValidationChecker();
	}

	@Override
	public ValidationChecker caseDataType(DataType element) {
		return new DataTypeValidationChecker();
	}

	@Override
	public ValidationChecker caseDependency(Dependency element) {
		return new DependencyValidationChecker();
	}

	@Override
	public ValidationChecker caseDifferencing(Differencing element) {
		return new DifferencingValidationChecker();
	}

	@Override
	public ValidationChecker caseDisjoining(Disjoining element) {
		return new DisjoiningValidationChecker();
	}

	@Override
	public ValidationChecker caseDocumentation(Documentation element) {
		return new DocumentationValidationChecker();
	}

	@Override
	public ValidationChecker caseElement(Element element) {
		return new ElementValidationChecker();
	}

	@Override
	public ValidationChecker caseElementFilterMembership(ElementFilterMembership element) {
		return new ElementFilterMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseEndFeatureMembership(EndFeatureMembership element) {
		return new EndFeatureMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseExpression(Expression element) {
		return new ExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseFeature(Feature element) {
		return new FeatureValidationChecker();
	}

	@Override
	public ValidationChecker caseFeatureChainExpression(FeatureChainExpression element) {
		return new FeatureChainExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseFeatureChaining(FeatureChaining element) {
		return new FeatureChainingValidationChecker();
	}

	@Override
	public ValidationChecker caseFeatureInverting(FeatureInverting element) {
		return new FeatureInvertingValidationChecker();
	}

	@Override
	public ValidationChecker caseFeatureMembership(FeatureMembership element) {
		return new FeatureMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseFeatureReferenceExpression(FeatureReferenceExpression element) {
		return new FeatureReferenceExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseFeatureTyping(FeatureTyping element) {
		return new FeatureTypingValidationChecker();
	}

	@Override
	public ValidationChecker caseFeatureValue(FeatureValue element) {
		return new FeatureValueValidationChecker();
	}

	@Override
	public ValidationChecker caseFlow(Flow element) {
		return new FlowValidationChecker();
	}

	@Override
	public ValidationChecker caseFlowEnd(FlowEnd element) {
		return new FlowEndValidationChecker();
	}

	@Override
	public ValidationChecker caseFunction(Function element) {
		return new FunctionValidationChecker();
	}

	@Override
	public ValidationChecker caseImport(Import element) {
		return new ImportValidationChecker();
	}

	@Override
	public ValidationChecker caseIndexExpression(IndexExpression element) {
		return new IndexExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseInstantiationExpression(InstantiationExpression element) {
		return new InstantiationExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseInteraction(Interaction element) {
		return new InteractionValidationChecker();
	}

	@Override
	public ValidationChecker caseIntersecting(Intersecting element) {
		return new IntersectingValidationChecker();
	}

	@Override
	public ValidationChecker caseInvariant(Invariant element) {
		return new InvariantValidationChecker();
	}

	@Override
	public ValidationChecker caseInvocationExpression(InvocationExpression element) {
		return new InvocationExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseLibraryPackage(LibraryPackage element) {
		return new LibraryPackageValidationChecker();
	}

	@Override
	public ValidationChecker caseLiteralBoolean(LiteralBoolean element) {
		return new LiteralBooleanValidationChecker();
	}

	@Override
	public ValidationChecker caseLiteralExpression(LiteralExpression element) {
		return new LiteralExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseLiteralInfinity(LiteralInfinity element) {
		return new LiteralInfinityValidationChecker();
	}

	@Override
	public ValidationChecker caseLiteralInteger(LiteralInteger element) {
		return new LiteralIntegerValidationChecker();
	}

	@Override
	public ValidationChecker caseLiteralRational(LiteralRational element) {
		return new LiteralRationalValidationChecker();
	}

	@Override
	public ValidationChecker caseLiteralString(LiteralString element) {
		return new LiteralStringValidationChecker();
	}

	@Override
	public ValidationChecker caseMembership(Membership element) {
		return new MembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseMembershipImport(MembershipImport element) {
		return new MembershipImportValidationChecker();
	}

	@Override
	public ValidationChecker caseMetaclass(Metaclass element) {
		return new MetaclassValidationChecker();
	}

	@Override
	public ValidationChecker caseMetadataAccessExpression(MetadataAccessExpression element) {
		return new MetadataAccessExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseMetadataFeature(MetadataFeature element) {
		return new MetadataFeatureValidationChecker();
	}

	@Override
	public ValidationChecker caseMultiplicity(Multiplicity element) {
		return new MultiplicityValidationChecker();
	}

	@Override
	public ValidationChecker caseMultiplicityRange(MultiplicityRange element) {
		return new MultiplicityRangeValidationChecker();
	}

	@Override
	public ValidationChecker caseNamespace(Namespace element) {
		return new NamespaceValidationChecker();
	}

	@Override
	public ValidationChecker caseNamespaceImport(NamespaceImport element) {
		return new NamespaceImportValidationChecker();
	}

	@Override
	public ValidationChecker caseNullExpression(NullExpression element) {
		return new NullExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseOperatorExpression(OperatorExpression element) {
		return new OperatorExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseOwningMembership(OwningMembership element) {
		return new OwningMembershipValidationChecker();
	}

	@Override
	public ValidationChecker casePackage(org.omg.sysml.lang.sysml.Package element) {
		return new PackageValidationChecker();
	}

	@Override
	public ValidationChecker caseParameterMembership(ParameterMembership element) {
		return new ParameterMembershipValidationChecker();
	}

	@Override
	public ValidationChecker casePayloadFeature(PayloadFeature element) {
		return new PayloadFeatureValidationChecker();
	}

	@Override
	public ValidationChecker casePredicate(Predicate element) {
		return new PredicateValidationChecker();
	}

	@Override
	public ValidationChecker caseRedefinition(Redefinition element) {
		return new RedefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseReferenceSubsetting(ReferenceSubsetting element) {
		return new ReferenceSubsettingValidationChecker();
	}

	@Override
	public ValidationChecker caseRelationship(Relationship element) {
		return new RelationshipValidationChecker();
	}

	@Override
	public ValidationChecker caseResultExpressionMembership(ResultExpressionMembership element) {
		return new ResultExpressionMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseReturnParameterMembership(ReturnParameterMembership element) {
		return new ReturnParameterMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseSelectExpression(SelectExpression element) {
		return new SelectExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseSpecialization(Specialization element) {
		return new SpecializationValidationChecker();
	}

	@Override
	public ValidationChecker caseStep(Step element) {
		return new StepValidationChecker();
	}

	@Override
	public ValidationChecker caseStructure(Structure element) {
		return new StructureValidationChecker();
	}

	@Override
	public ValidationChecker caseSubclassification(Subclassification element) {
		return new SubclassificationValidationChecker();
	}

	@Override
	public ValidationChecker caseSubsetting(Subsetting element) {
		return new SubsettingValidationChecker();
	}

	@Override
	public ValidationChecker caseSuccession(Succession element) {
		return new SuccessionValidationChecker();
	}

	@Override
	public ValidationChecker caseSuccessionFlow(SuccessionFlow element) {
		return new SuccessionFlowValidationChecker();
	}

	@Override
	public ValidationChecker caseTextualRepresentation(TextualRepresentation element) {
		return new TextualRepresentationValidationChecker();
	}

	@Override
	public ValidationChecker caseType(Type element) {
		return new TypeValidationChecker();
	}

	@Override
	public ValidationChecker caseTypeFeaturing(TypeFeaturing element) {
		return new TypeFeaturingValidationChecker();
	}

	@Override
	public ValidationChecker caseUnioning(Unioning element) {
		return new UnioningValidationChecker();
	}

}
