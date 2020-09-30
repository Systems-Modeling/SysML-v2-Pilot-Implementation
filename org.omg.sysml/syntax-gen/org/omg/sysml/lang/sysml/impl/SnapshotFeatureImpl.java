/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Element;
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
public class SnapshotFeatureImpl extends FeatureImpl implements SnapshotFeature {
	
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
	public void computeImplicitGeneralization() {
		getFeatureTypes();
		super.computeImplicitGeneralization();
	}
		
	@Override
	protected List<Type> getFeatureTypes() {
		return IndividualUsageImpl.setTypingFor(this, super.getFeatureTypes());
	}

	@Override
	protected List<Type> getGeneralTypes(Type type, Element skip) {
		// TODO check this return
		return Collections.singletonList(null);
	}
	
	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		return Collections.singletonList(type == getOwner()? this:
			   (Feature)getDefaultType(SNAPSHOT_FEATURE_REDEFINED_FEATURE));
	}

} //SnapshotFeatureImpl
