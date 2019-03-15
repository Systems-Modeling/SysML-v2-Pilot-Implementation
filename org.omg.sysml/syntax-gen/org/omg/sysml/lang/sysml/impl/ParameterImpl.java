/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ParameterImpl extends FeatureImpl implements Parameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}
	
	public boolean isResultParameter() {
		Category category = getOwningCategory();
		return category instanceof Function && ((Function)category).getResult() == this;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Subsetting> getOwnedSubsetting() {
		EList<Subsetting> redefinitions = getComputedRedefinitions();
		return redefinitions.isEmpty()? super.getOwnedSubsetting(): redefinitions;
	}
	
	/**
	 * Parameters redefine Parameters of superclass Behaviors. 
	 */
	@Override
	public List<? extends Feature> getRelevantFeatures(Category category) {
		return !(category instanceof Behavior)? Collections.emptyList():
			((Behavior)category).getParameter();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PARAMETER;
	}

} //ParameterImpl
