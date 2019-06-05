/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.QueryPathExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Path Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QueryPathExpressionImpl extends FeatureReferenceExpressionImpl implements QueryPathExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryPathExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.QUERY_PATH_EXPRESSION;
	}

	@Override
	public Feature getReferent() {
        Element e = getReferentGen();
        if (e == null) {
            for (e = this; e != null; e = e.getOwner()) {
                if (e instanceof Feature) {
                    setReferent((Feature)e);
                    break;
                }
            }
        }
        return super.getReferent();
    }

} //QueryPathExpressionImpl
