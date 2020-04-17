/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.LifeClass;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Life Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LifeClassImpl extends BlockImpl implements LifeClass {
	
	public static final String LIFE_CLASS_DEFAULT_NAME = "Life";
	public static final String LIFE_CLASS_LIFE_SUPERCLASS = "Base::Life";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifeClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.LIFE_CLASS;
	}
	
	@Override
	public String basicGetName() {
		if (super.basicGetName() == null) {
			super.basicSetName(LIFE_CLASS_DEFAULT_NAME);
		}
		return super.basicGetName();
	}
	
	@Override
	protected String getDefaultSupertype() {
		return LIFE_CLASS_LIFE_SUPERCLASS;
	}
	
//	@Override
//	public EList<Superclassing> getOwnedSuperclassing() {	
//		org.omg.sysml.lang.sysml.Package owner = getOwningNamespace();
//		EList<Superclassing> superclassings = getOwnedSuperclassingWithoutDefault();
//		if (superclassings.size() < 2) {
//			superclassings = getOwnedSuperclassingWithDefault(LIFE_CLASS_LIFE_SUPERCLASS);
//			if (owner instanceof Classifier) {
//				Superclassing superclassing = SysMLFactory.eINSTANCE.createSuperclassing();
//				superclassing.setSuperclass((Classifier)owner);
//				superclassing.setSubclass(this);
//				getOwnedRelationship_comp().add(superclassing);
//			}
//		} else {
//			superclassings.get(0).setSuperclass((Classifier)getDefaultType(LIFE_CLASS_LIFE_SUPERCLASS));
//			if (owner instanceof Classifier) {
//				superclassings.get(1).setSuperclass((Classifier)owner);
//			}
//		}
//		return superclassings;
//	}
	
	@Override
	public Multiplicity basicGetMultiplicity() {
		Multiplicity multiplicity = super.basicGetMultiplicity();
		if (multiplicity == null || multiplicity.getOwningType() != this) {
			multiplicity = createSingletonMultiplicity();
			addOwnedFeature(multiplicity);
		}
		return multiplicity;
	}
	
	protected Multiplicity createSingletonMultiplicity() {
		MultiplicityRangeImpl multiplicity = (MultiplicityRangeImpl)SysMLFactory.eINSTANCE.createMultiplicityRange();
		
		LiteralInteger bound = SysMLFactory.eINSTANCE.createLiteralInteger();
		bound.setValue(0);
		multiplicity.addOwnedFeature(bound);
		
		bound = SysMLFactory.eINSTANCE.createLiteralInteger();
		bound.setValue(1);
		multiplicity.addOwnedFeature(bound);
		
		return multiplicity;
	}

	@Override
	public void transform() {
		super.transform();
		getMultiplicity();
	}
	
} //LifeClassImpl
