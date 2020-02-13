/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Invariant;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invariant</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InvariantImpl extends BooleanExpressionImpl implements Invariant {

	/**
	 * The cached value of the BindingConnector from the result of the
	 * this Invariant to the result of a LiteralBoolean true.
	 */
	protected BindingConnector assertionConnector = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvariantImpl() {
		super();
	}

	// Additional redefinitions and subsets

	@Override
	public EList<Feature> getFeature() {
		getAssertionConnector();
		return super.getFeature();
	}
	
	public BindingConnector getAssertionConnector() {
		return assertionConnector = getAssertionConnectorFor(this, assertionConnector, this.getResult());
	}

	public static BindingConnector getAssertionConnectorFor(Feature feature, BindingConnector assertionConnector, Feature result) {
		Feature literalBoolean = feature.getOwnedFeature().stream().
				filter(f->f instanceof LiteralBoolean).
				findFirst().orElse(null);
		if (literalBoolean != null) {
			assertionConnector = BlockExpressionImpl.updateBindingConnectorFor(
					feature, assertionConnector, result, ((ExpressionImpl)literalBoolean).getResult());
		}
		return assertionConnector;
	}
	
	@Override
	public BindingConnector getResultConnector() {
		return hasNoResultExpression(this)? null: super.getResultConnector();
	}
	
	public static boolean hasNoResultExpression(Invariant invariant) {
		return invariant.getOwnedFeature().stream().filter(feature->feature instanceof Expression).count() <= 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.INVARIANT;
	}

} //InvariantImpl
