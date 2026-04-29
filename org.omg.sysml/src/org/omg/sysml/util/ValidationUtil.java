package org.omg.sysml.util;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
//import org.eclipse.xtext.xbase.lib.IterableExtensions;
//import org.eclipse.xtext.xbase.lib.Functions.Function1;
//import org.omg.kerml.xtext.validation.KerMLValidator;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.OperatorExpression;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Element; 
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.LiteralInfinity;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ValidationUtil {
	 // Utilities Methods from xtends rewrite in Java. 
	
	static boolean isModelLibrary(Resource resource) {
		if (resource == null) {
			return false;
		} else {
			String path = resource.getURI().devicePath();
			return path != null && path.contains(SysMLLibraryUtil.getModelLibraryPath());
		}
	}
	 static boolean isBoolean(Expression condition) {
	     
	        if (condition.specializesFromLibrary("ScalarValues::Boolean")) {
	            return true;
	        }
	        if (condition instanceof LiteralBoolean) {
	        	return true;
	        }
	        if (condition instanceof OperatorExpression) {
	        	OperatorExpression opExpression = (OperatorExpression) condition; 
	        	
	        	return ValidationUtil.isBooleanOperator(opExpression.getOperator()) && opExpression.getArgument().stream().allMatch(ValidationUtil::isBoolean);
	        }
	        return false; 
	 }
	 static boolean isBooleanOperator(String operator) {
		    return CollectionLiterals.<String>newArrayList("not", "xor", "&", "|").contains(operator);
	 }
	
	 static boolean isBooleanExpression(Type expr) {
		    if (expr instanceof Expression) {
		        Expression expression = (Expression) expr;
		        var result = expression.getResult();

		        if (result != null && specializesFromLibrary(expression, result, "Performances::BooleanEvaluation")) {
		            return true;
		        } else if (expression instanceof FeatureReferenceExpression) {
		            FeatureReferenceExpression fRefEx = (FeatureReferenceExpression) expression;
		            var referent = fRefEx.getReferent();

		            if (referent instanceof Expression) {
		                Expression referentExpr = (Expression) referent;
		                if (ValidationUtil.isBoolean(referentExpr)) {
		                    return true;
		                } else {
		                    Expression resultExpr = ExpressionUtil.getResultExpressionOf(referentExpr);
		                    return resultExpr != null && ValidationUtil.isBoolean(resultExpr);
		                }
		            }
		        }
		    }
		    return false;
	 }
	 static boolean isInteger(Expression expr) {
		    if (expr instanceof LiteralInteger || expr instanceof LiteralInfinity) {
		        return true;
		    }

		    if (specializesFromLibrary(expr, expr.getResult(), "ScalarValues::Integer")) {
		        return true;
		    }

		    if (expr instanceof OperatorExpression) {
		        OperatorExpression opExpr = (OperatorExpression) expr;
		        return isIntegerOperator(opExpr.getOperator()) && 
		               opExpr.getArgument().stream().allMatch(arg -> isInteger(arg));
		    }
		    return false;
	}
	static boolean specializesFromLibrary(Element context, Type type, String qualifiedName) {
		    return TypeUtil.specializes(type, SysMLLibraryUtil.getLibraryType(context, qualifiedName));
	}
	static boolean isIntegerOperator(String operator) {
        return Arrays.asList("-", "+", "*", "%", "^", "**").contains(operator);
    }
	
	public void checkAtMostOne(Iterable<? extends EObject> list, ValidationMessageAccepter messageAccepter, EStructuralFeature feature, String msgCode) {
	  
	    int listSize = IterableExtensions.size(list);
	    if (listSize > 1) {
	    	List<? extends EObject> features = IterableExtensions.toList(list);
	      for (int i = 1; i < listSize; i++) {
	    	  messageAccepter.error(features.get(i), feature, msgCode);
	      }
	    }
	}
	
	protected void checkNotOne(Iterable<? extends EObject> list, ValidationMessageAccepter messageAccepter, String msgCode) {
		if (IterableExtensions.size(list) == 1) messageAccepter.error((EObject)Conversions.unwrapArray(list), null, msgCode );
		}
}

/*	still to do
	protected def checkTargetNotObject(EObject obj, List<? extends Relationship> rels, String msg, String code) {
		for (r: rels) {
			if (r.target.contains(obj))
				error(msg, r, null, code)
		}
	}
	
	protected def static typesConform(List<Type> t1, List<Type> t2) {
		t1.exists[tt1 | t2.exists[tt2 | tt2.conformsTo(tt1)]] ||
		t2.exists[tt2 | t1.exists[tt1 | tt1.conformsTo(tt2)]]
	}
	
	// Return conforming subtypes
	protected static def Iterable<Type> conformsFrom(Type supertype, List<Type> subtypes) 
	{
		subtypes.filter[subtype|subtype.conformsTo(supertype)]
	}
	
	// Return conformed supertypes
    protected static def Iterable<Type> conformsTo(Type subtype, List<Type> supertypes) 
	{
		supertypes.filter[supertype|subtype.conformsTo(supertype)]
	}

	protected static def boolean conformsTo(Type subtype, Type supertype) {
		supertype === null || TypeUtil.specializes(subtype, supertype) ||
			subtype instanceof Expression &&
			isBooleanExpression(subtype as Expression) && 
			specializesFromLibrary(subtype, supertype, "Performances::BooleanExpression")
	}
 */
