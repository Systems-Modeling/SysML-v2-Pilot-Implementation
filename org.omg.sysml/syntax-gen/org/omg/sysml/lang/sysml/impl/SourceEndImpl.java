/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.SatisfyRequirementUsage;
import org.omg.sysml.lang.sysml.SourceEnd;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.TransitionUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source End</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SourceEndImpl extends FeatureImpl implements SourceEnd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SOURCE_END;
	}
	
	@Override
	public void computeImplicitGeneralization() {
		addComputedRedefinitions(null);
	}
	
	@Override
	public void addComputedRedefinitions(Element skip) {
		addImplicitGeneralType();
		super.addComputedRedefinitions(skip);
	}
	
	@Override
	public Type getDefaultType(String... defaultNames) {
		Type type = getOwningType();
		return type instanceof Feature? 
				getSource((Feature)type): 
				super.getDefaultType(defaultNames);
	}
	
	protected Feature getSource(Feature owningFeature) {
		Type type = owningFeature.getOwningType();
		return owningFeature instanceof BindingConnector && 
			   type instanceof SatisfyRequirementUsage? 
					((SatisfyRequirementUsage)type).getSubjectParameter(): 
					getPreviousFeature(owningFeature);
	}
	
	protected static Feature getPreviousFeature(Feature feature) {
		Type type = feature.getOwningType();
		if (type == null) {
			return null;
		} else {
			EList<FeatureMembership> memberships = type.getOwnedFeatureMembership();
			for (int i = memberships.indexOf(feature.getOwningFeatureMembership()) - 1; i >= 0; i--) {
				FeatureMembership membership = memberships.get(i);
				if (!(membership instanceof TransitionFeatureMembership)) {
					Feature previousFeature = memberships.get(i).getMemberFeature();
					if (!(((FeatureImpl)previousFeature).isParameter() || 
						  previousFeature instanceof Connector || 
						  previousFeature instanceof TransitionUsage)) {
						return previousFeature;
					}
				}
			}
			return type instanceof Feature? getPreviousFeature((Feature)type): null;
		}
	}
	
} //SourceEndImpl
