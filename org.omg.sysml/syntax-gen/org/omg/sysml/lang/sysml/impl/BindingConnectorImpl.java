/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Binding
 * Connector</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class BindingConnectorImpl extends ConnectorImpl implements BindingConnector {

	public static final String BINDING_CONNECTOR_SUBSETTING_DEFAULT = "Base::selfLinks";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingConnectorImpl() {
		super();
	}

	@Override
	public EList<Feature> getRelatedFeature() {
		EList<Feature> relatedFeatures = super.getRelatedFeature();
		if (relatedFeatures.isEmpty()) {
			Element owner = getOwningNamespace();
			if (owner instanceof InvocationExpressionImpl) {
				InvocationExpressionImpl expression = (InvocationExpressionImpl) owner;
				int i = expression.getOwnedFeature().stream().filter(f -> f instanceof BindingConnector)
						.collect(Collectors.toList()).indexOf(this);
				if (i >= 0) {
					List<? extends Feature> arguments = expression.getArguments();
					if (i < arguments.size()) {
						Feature argument = arguments.get(i);
						Feature feature = argument instanceof Expression ? ((ExpressionImpl) argument).getResult()
								: argument;
						setRelatedFeature(0, feature);
						relatedFeatures.add(feature);
					}
					EList<Feature> inputs = expression.getInput();
					if (i < inputs.size()) {
						Feature feature = inputs.get(i);
						setRelatedFeature(1, feature);
						relatedFeatures.add(feature);
					}
				}
			}
		}
		return relatedFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.BINDING_CONNECTOR;
	}

	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		return getOwnedSubsettingWithDefault(BINDING_CONNECTOR_SUBSETTING_DEFAULT);
	}

} // BindingConnectorImpl
