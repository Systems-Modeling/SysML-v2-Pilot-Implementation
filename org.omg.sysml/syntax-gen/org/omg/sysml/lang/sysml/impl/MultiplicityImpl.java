/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc --> 
 * An implementation of the model object '<em><b>Multiplicity</b></em>'. 
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MultiplicityImpl extends FeatureImpl implements Multiplicity {
	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.MULTIPLICITY;
	}
	
	@Override
	protected List<Multiplicity> getRelevantFeatures(Type type) {
		return type == getOwningType()? Collections.singletonList(this):
			   type instanceof Feature? Collections.singletonList(((Feature)type).getMultiplicity()):
			   Collections.emptyList();
	}

} // MultiplicityImpl
