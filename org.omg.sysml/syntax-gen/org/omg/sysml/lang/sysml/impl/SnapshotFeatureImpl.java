/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SnapshotFeature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Snapshot Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SnapshotFeatureImpl extends ReferencePropertyImpl implements SnapshotFeature {
	
	public static final String SNAPSHOT_FEATURE_DEFAULT_NAME = "snapshotOf";	
	public static final String SNAPSHOT_FEATURE_REDEFINED_FEATURE = "Occurrences::Occurrence::snapshotOf";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SnapshotFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SNAPSHOT_FEATURE;
	}

	@Override
	public String basicGetName() {
		if (super.basicGetName() == null) {
			basicSetName(SNAPSHOT_FEATURE_DEFAULT_NAME);
		}
		return super.basicGetName();
	}
	
	@Override
	protected List<Type> getFeatureTypes(List<Type> types) {
		IndividualUsageImpl.setTypingFor(this);
		return super.getFeatureTypes(types);
	}

	@Override
	public void computeImplicitGeneralization() {
		IndividualUsageImpl.setTypingFor(this);
		super.computeImplicitGeneralization();
	}
		
	@Override
	protected Set<Type> getGeneralTypes(Type type) {
		return Collections.singleton(null);
	}
	
	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		return Collections.singletonList(type == getOwner()? this:
			   (Feature)getDefaultType(SNAPSHOT_FEATURE_REDEFINED_FEATURE));
	}

} //SnapshotFeatureImpl
