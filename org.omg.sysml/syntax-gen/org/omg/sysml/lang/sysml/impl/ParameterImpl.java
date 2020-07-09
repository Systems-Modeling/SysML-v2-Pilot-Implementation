/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Parameter</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ParameterImpl extends FeatureImpl implements Parameter {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PARAMETER;
	}
	
	@Override
	public FeatureMembership getOwningFeatureMembership() {
		EObject container = eInternalContainer();
		return container instanceof ParameterMembership? 
				(FeatureMembership)container: 
			    super.getOwningFeatureMembership();
	}
	
	@Override
	public BindingConnector getValueConnector() {
		FeatureValue valuation = getValuation();
		if (valuation != null) {
			return super.getValueConnector();
		} else {
			Parameter subjectParameter = getRelevantSubjectParameter();
			if (subjectParameter != null) {
				valueConnector = makeBinding(valueConnector, subjectParameter, this);
			}
		}
		return valueConnector;
	}
	
	/**
	 * Return the relevant subject parameter to which this parameter should be bound.
	 */
	public Parameter getRelevantSubjectParameter() {
		Type owningType = getOwningType();
		
		if (!owningType.isAbstract()) {
			if (owningType instanceof ConstraintUsage && ((ConstraintUsageImpl)owningType).isRequirement()) {
				// This parameter is itself effectively the subject parameter of a requirement if it is the first parameter
				// of a ConstraintUsage that is effectively a requirement usage (i.e., is typed by a RequirementDefinition).
				List<Parameter> parameters = ((TypeImpl)owningType).getOwnedParameters();
				if (!parameters.isEmpty() && parameters.get(0) == this) {
					owningType = ((Feature)owningType).getOwningType();
					if (owningType instanceof RequirementDefinition || owningType instanceof RequirementUsage) {
						// The subject parameter to be bound to this parameter is the first parameter of the
						// RequirementDefinition or RequirementUsage.
						parameters = ((TypeImpl)owningType).getOwnedParameters();
						if (!parameters.isEmpty()) {
							return parameters.get(0);
						}
					}
				}
			} else if (owningType instanceof CaseUsage && isSubjectParameter()) {
				owningType = ((Feature)owningType).getOwningType();
				if (owningType instanceof CaseDefinition || owningType instanceof CaseUsage) {
					return getSubjectParameterOf(owningType);
				}
			}
		}
		return null;
	}
	
	protected static Parameter getSubjectParameterOf(Type type) {
		return type instanceof Definition? ((DefinitionImpl)type).getSubjectParameter():
			   type instanceof Usage? ((UsageImpl)type).getSubjectParameter():
			   null;
	}
	
	public boolean isSubjectParameter() {
		return getOwningFeatureMembership() instanceof SubjectMembership;
	}

	/**
	 * Parameters redefine (owned) Parameters of general Categories, with a result
	 * Parameter always redefining the result Parameter of a general Functions or
	 * Expression and a subject Parameter always redefining the subject Parameter of
	 * a general CaseDefinition or CaseUsage.
	 */
	@Override
	public List<? extends Feature> getRelevantFeatures(Type type) {
		return type == null? Collections.emptyList():
			   isResultParameter() && (type instanceof Function || type instanceof Expression)?
						Collections.singletonList(((TypeImpl) type).getResultParameter()):
			   isSubjectParameter() && (type instanceof CaseDefinition || type instanceof CaseUsage)?
					    Collections.singletonList(getSubjectParameterOf(type)):
						getRelevantParameters((TypeImpl)type).stream()
								.filter(p -> !((ParameterImpl) p).isResultParameter() && !((ParameterImpl)p).isSubjectParameter())
								.collect(Collectors.toList());
	}
	
	protected List<Parameter> getRelevantParameters(TypeImpl type) {
		return type == getOwningType()? type.getOwnedParameters(): type.getAllParameters();
	}
	
	public boolean isResultParameter() {
		return getOwningMembership() instanceof ReturnParameterMembership;
	}
	
	public boolean isInputParameter() {
		FeatureDirectionKind direction = getDirection();
		return direction == FeatureDirectionKind.IN || direction == FeatureDirectionKind.INOUT;
	}
	
	public boolean isOutputParameter() {
		FeatureDirectionKind direction = getDirection();
		return direction == FeatureDirectionKind.OUT || direction == FeatureDirectionKind.INOUT;
	}
	
	public FeatureDirectionKind getDirection() {
		Type owningType = getOwningType();
		if (owningType == null) {
			return null;
		} else {
			return directionFor(owningType);
		}
	}
} // ParameterImpl
