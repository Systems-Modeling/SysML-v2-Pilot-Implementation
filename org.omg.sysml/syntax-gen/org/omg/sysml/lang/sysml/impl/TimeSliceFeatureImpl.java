/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TimeSliceFeature;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Slice Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TimeSliceFeatureImpl extends ReferencePropertyImpl implements TimeSliceFeature {
	
	public static final String TIME_SLICE_FEATURE_DEFAULT_NAME = "timeSliceOf";	
	public static final String TIME_SLICE_FEATURE_REDEFINED_FEATURE = "Base::Occurrence::timeSliceOf";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSliceFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.TIME_SLICE_FEATURE;
	}
	
	@Override
	public String basicGetName() {
		if (super.basicGetName() == null) {
			basicSetName(TIME_SLICE_FEATURE_DEFAULT_NAME);
		}
		return super.basicGetName();
	}
	
	@Override
	protected Set<Type> getGeneralTypes(Type type) {
		return Collections.singleton(null);
	}
	
	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		return Collections.singletonList(type == getOwner()? this:
			   (Feature)getDefaultType(TIME_SLICE_FEATURE_REDEFINED_FEATURE));
	}

} //TimeSliceFeatureImpl
