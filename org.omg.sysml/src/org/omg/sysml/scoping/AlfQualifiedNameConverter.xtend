package org.omg.sysml.scoping

import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.QualifiedName
import com.google.common.base.Preconditions
import org.eclipse.xtext.util.Strings

class AlfQualifiedNameConverter implements IQualifiedNameConverter {
	
	override toQualifiedName(String qualifiedNameAsText) {
		Preconditions.checkArgument(qualifiedNameAsText !== null, "Qualified name cannot be null")
		Preconditions.checkArgument(!qualifiedNameAsText.empty, "Qualified name cannot be empty")
		val delimeter =  this.toString
		if(delimeter.empty)
			return QualifiedName.create(qualifiedNameAsText)
		val char c= '.'
		val PartsAfterDotSplit= Strings.split(qualifiedNameAsText,c)
		val ret= newArrayList
		
		PartsAfterDotSplit.forEach[e| ret.addAll(Strings.split(e,'::'))]  
		
		QualifiedName.create(ret)		
		
	}
	
	override toString(QualifiedName name) {
		if (name === null)
				throw new IllegalArgumentException("Qualified name cannot be null")
			return name.toString('::')
	}
	
}