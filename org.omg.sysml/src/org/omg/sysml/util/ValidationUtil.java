package org.omg.sysml.util;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;

import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.OperatorExpression;
import org.omg.sysml.lang.sysml.Relationship;
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
	
	public static boolean isModelLibrary(Resource resource) {
		if (resource == null) {
			return false;
		} else {
			String path = resource.getURI().devicePath();
			return path != null && path.contains(SysMLLibraryUtil.getModelLibraryPath());
		}
	}
	
	public static boolean isBoolean(Expression condition) {
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
	
	static private List<String> BOOLEAN_OPERATORS = Arrays.asList("not", "xor", "&", "|");
	public static boolean isBooleanOperator(String operator) {
		return BOOLEAN_OPERATORS.contains(operator);
	}
	
	public static boolean isBooleanExpression(Type expr) {
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
	
	public static boolean isInteger(Expression expr) {
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
	
	public static boolean specializesFromLibrary(Element context, Type type, String qualifiedName) {
		    return TypeUtil.specializes(type, SysMLLibraryUtil.getLibraryType(context, qualifiedName));
	}
	
	private static List<String> INTEGER_OPERATORS = Arrays.asList("-", "+", "*", "%", "^", "**");
	public static boolean isIntegerOperator(String operator) {
        return INTEGER_OPERATORS.contains(operator);
    }
	
	public static void checkAtMostOne(List<? extends EObject> list, ValidationMessageAccepter messageAccepter, EStructuralFeature feature, String msgCode) {	  
	    int listSize = list.size();
	    if (listSize > 1) {
	    	for (int i = 1; i < listSize; i++) {
	    		messageAccepter.error(list.get(i), feature, msgCode);
	    	}
	    }
	}
	
	public static void checkNotOne(List<? extends EObject> list, ValidationMessageAccepter messageAccepter, String msgCode) {
		if (list.size() == 1) {
			messageAccepter.error(list.get(0), null, msgCode );
		}
	}

	public static void checkTargetNotObject(EObject obj, List<? extends Relationship> rels, ValidationMessageAccepter messageAccepter, String msgCode) {
		for (Relationship r : rels) {
			if (r.getTarget().contains(obj)) {
				messageAccepter.error(r, null, msgCode);
			}
		}
	}
	
	public static boolean typesConform(List<Type> t1, List<Type> t2) {
	    return t1.stream().anyMatch(tt1 -> t2.stream().anyMatch(tt2 -> conformsTo(tt2, tt1))) ||
	           t2.stream().anyMatch(tt2 -> t1.stream().anyMatch(tt1 -> conformsTo(tt1, tt2)));
	}
	
	// Return conforming subtypes
	public static Iterable<Type> conformsFrom(Type supertype, List<Type> subtypes) {
	    return subtypes.stream().filter(subtype -> conformsTo(subtype, supertype)).toList();
	}
	
	// Return conformed supertypes
	public static Iterable<Type> conformsTo(Type subtype, List<Type> supertypes) {
	    return supertypes.stream()
	                    .filter(supertype -> conformsTo(subtype, supertype))
	                    .toList();
	}

	public static boolean conformsTo(Type subtype, Type supertype) {
		return supertype == null || TypeUtil.specializes(subtype, supertype) ||
        (subtype instanceof Expression && 
         isBooleanExpression((Expression) subtype) && 
         specializesFromLibrary(subtype, supertype, "Performances::BooleanExpression"));
	}
}
