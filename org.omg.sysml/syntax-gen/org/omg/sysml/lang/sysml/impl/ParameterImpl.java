/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Parameter</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ParameterImpl extends FeatureImpl implements Parameter {

	private boolean redefinitionsNotAdded = true;

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

	public boolean isResultParameter() {
		return ((TypeImpl) getOwningType()).getResult() == this;
	}

	/**
	 * Parameters redefine (owned) Parameters of general Categories, with a result
	 * Parameter always redefining the result Parameter of a general Functions or
	 * Expression.
	 */
	@Override
	public List<? extends Feature> getRelevantFeatures(Type type) {
		return type == null ? Collections.emptyList()
				: (isResultParameter() && (type instanceof Function | type instanceof Expression))
						? Collections.singletonList(((TypeImpl) type).getResult())
						: ((TypeImpl) type).getOwnedParameters().stream()
								.filter(p -> !((ParameterImpl) p).isResultParameter()).collect(Collectors.toList());
	}

	public void addInheritedFeatureRedefinitions() {
		if (redefinitionsNotAdded) {
			redefinitionsNotAdded = false;
			EList<FeatureTyping> typing = getTyping();
			if (!typing.isEmpty()) {
				Type type = typing.get(0).getType();
				if (type == null) {
					redefinitionsNotAdded = true;
				} else {
					for (Feature inheritedFeature : type.getOwnedFeature()) {
						Feature feature = SysMLFactory.eINSTANCE.createFeature();
						feature.setName(inheritedFeature.getName());
						addOwnedFeature(feature);
					}
				}
			}
		}
	}

} // ParameterImpl
