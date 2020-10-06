/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Item
 * Flow End</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ItemFlowEndImpl extends FeatureImpl implements ItemFlowEnd {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemFlowEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ITEM_FLOW_END;
	}

	@Override
	protected Stream<Feature> getSubsettedNotRedefinedFeatures() {
		addItemFlowEndSubsetting();
		return super.getSubsettedNotRedefinedFeatures();
	}
	
	@Override
	public void computeImplicitGeneralization() {
		// Note: Do not add item flow end subsetting here, to avoid circularity due to name resolution.
		addComputedRedefinitions(null);
	}

	protected void addItemFlowEndSubsetting() {
		EList<Feature> features = getOwnedFeature();
		if (!features.isEmpty()) {
			List<Redefinition> redefinitions = ((FeatureImpl) features.get(0)).basicGetOwnedRedefinition();
			if (!redefinitions.isEmpty()) {
				Feature feature = redefinitions.get(0).getRedefinedFeature();
				if (feature != null) {
					Type owner = feature.getOwningType();
					if (owner instanceof Feature) {
						addImplicitGeneralType(SysMLPackage.eINSTANCE.getSubsetting(), owner);
					}
				}
			}
		}
	}

	@Override
	protected List<Type> getGeneralTypes(Type type, Element skip) {
		return type instanceof ItemFlow? new ArrayList<>(((ItemFlow) type).getType()) : super.getGeneralTypes(type, skip);
	}

	@Override
	public List<Feature> getRelevantFeatures() {
		return getOwnedFeature();
	}
	
	@Override
	public void transform() {
		addItemFlowEndSubsetting();
		super.transform();
	}
	
} // ItemFlowEndImpl
