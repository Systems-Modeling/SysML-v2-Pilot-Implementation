/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.SourceEnd;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;

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
	public EList<Subsetting> getOwnedSubsetting() {
		clearCaches();
		getOwnedSubsettingWithDefault();
		getComputedRedefinitions();
		return getOwnedSubsettingWithoutDefault();
	}
	
	@Override
	public Category getDefaultCategory(String... defaultNames) {
		Category category = getOwningCategory();
		return category instanceof Feature? 
				getPreviousFeature((Feature)category): 
				super.getDefaultCategory(defaultNames);
	}
	
	protected static Feature getPreviousFeature(Feature feature) {
		Category category = feature.getOwningCategory();
		if (category == null) {
			return null;
		} else {
			EList<FeatureMembership> memberships = category.getOwnedFeatureMembership();
			for (int i = memberships.indexOf(feature.getOwningFeatureMembership()) - 1; i >= 0; i--) {
				Feature previousFeature = memberships.get(i).getMemberFeature();
				if (!(previousFeature instanceof Parameter)) {
					return previousFeature;
				}
			}
			return category instanceof Feature? getPreviousFeature((Feature)category): null;
		}
	}

} //SourceEndImpl
