/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.QueryPathExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Query
 * Path Expression</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class QueryPathExpressionImpl extends FeatureReferenceExpressionImpl implements QueryPathExpression {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected QueryPathExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.QUERY_PATH_EXPRESSION;
	}

	@Override
	public Feature getResult() {
		List<Feature> outputs = getOutput().stream().filter(feature -> feature.getOwner() == this)
				.collect(Collectors.toList());
		;
		return outputs.isEmpty() ? null : outputs.get(outputs.size() - 1);
	}

} // QueryPathExpressionImpl
