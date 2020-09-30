/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.ItemFlowFeature;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Item
 * Flow Feature</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ItemFlowFeatureImpl extends FeatureImpl implements ItemFlowFeature {

	public static final String[] ITEM_FLOW_INPUT_OUTPUT_FEATURES = { "Transfers::Transfer::transferSource::sourceOutput", "Transfers::Transfer::transferTarget::targetInput" };

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemFlowFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ITEM_FLOW_FEATURE;
	}

	@Override
	protected void addComputedRedefinitions(Element skip) {
		if (!implicitGeneralTypes.containsKey(SysMLPackage.eINSTANCE.getRedefinition())) {
			addRedefinitions(skip);
		}
	}

	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		return type instanceof ItemFlowEnd ? type.getOwnedFeature():
				Collections.singletonList((Feature)getDefaultType(
						ITEM_FLOW_INPUT_OUTPUT_FEATURES[getEndIndex()]));
	}
	
	protected int getEndIndex() {
		Type owningType = getOwningType();
		if (owningType != null) {
			Element connector = owningType.getOwner();
			if (connector instanceof Connector) {
				int i = ((Connector)connector).getConnectorEnd().indexOf(owningType);
				if (i >= 0) {
					return i;
				}
			}
		}
		return 0;
	}

} // ItemFlowFeatureImpl
