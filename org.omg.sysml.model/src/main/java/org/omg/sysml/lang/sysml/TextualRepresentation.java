/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>TextualRepresentation</code> is an <code>AnnotatingElement</code> whose <code>body</code> represents the <code>representedElement</code> in a given <code>language</code>. The <code>representedElement</code> must be the <code>owner</code> of the <code>TextualRepresentation</code>. The named <code>language</code> can be a natural language, in which case the <code>body</code> is an informal representation, or an artificial language, in which case the <code>body</code> is expected to be a formal, machine-parsable representation.</p>
 * 
 * <p>If the named <code>language</code> of a <code>TextualRepresentation</code> is machine-parsable, then the <code>body</code> text should be legal input text as defined for that <code>language</code>. The interpretation of the named language string shall be case insensitive. The following <code>language</code> names are defined to correspond to the given standard languages:</p>
 * 
 * <table border="1" cellpadding="1" cellspacing="1" width="498">
 * 	<thead>
 * 	</thead>
 * 	<tbody>
 * 		<tr>
 * 			<td style="text-align: center; width: 154px;"><code>kerml</code></td>
 * 			<td style="width: 332px;">Kernel Modeling Language</td>
 * 		</tr>
 * 		<tr>
 * 			<td style="text-align: center; width: 154px;"><code>ocl</code></td>
 * 			<td style="width: 332px;">Object Constraint Language</td>
 * 		</tr>
 * 		<tr>
 * 			<td style="text-align: center; width: 154px;"><code>alf</code></td>
 * 			<td style="width: 332px;">Action Language for fUML</td>
 * 		</tr>
 * 	</tbody>
 * </table>
 * 
 * <p>Other specifications may define specific <code>language</code> strings, other than those shown above, to be used to indicate the use of languages from those specifications in KerML <code>TextualRepresentation</code>.</p>
 * 
 * <p>If the <code>language</code> of a <code>TextualRepresentation</code> is &quot;<code>kerml</code>&quot;, then the <code>body</code> text shall be a legal representation of the <code>representedElement</code> in the KerML textual concrete syntax. A conforming tool can use such a <code>TextualRepresentation</code> <code>Annotation</code> to record the original KerML concrete syntax text from which an <code>Element</code> was parsed. In this case, it is a tool responsibility to ensure that the <code>body</code> of the <code>TextualRepresentation</code> remains correct (or the Annotation is removed) if the annotated <code>Element</code> changes other than by re-parsing the <code>body</code> text.</p>
 * 
 * <p>An <code>Element</code> with a <code>TextualRepresentation</code> in a language other than KerML is essentially a semantically &quot;opaque&quot; <code>Element</code> specified in the other language. However, a conforming KerML tool may interpret such an element consistently with the specification of the named language.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.TextualRepresentation#getBody <em>Body</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TextualRepresentation#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TextualRepresentation#getRepresentedElement <em>Represented Element</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTextualRepresentation()
 * @model
 * @generated
 */
public interface TextualRepresentation extends AnnotatingElement {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The natural or artifical language in which the <code>body</code> text is written.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTextualRepresentation_Language()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TextualRepresentation#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The textual representation of the <code>representedElement</code> in the given <code>language</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTextualRepresentation_Body()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TextualRepresentation#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Represented Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Element#getTextualRepresentation <em>Textual Representation</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.AnnotatingElement#getAnnotatedElement() <em>Annotated Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Element</code> that is represented by this <code>TextualRepresentation</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Represented Element</em>' reference.
	 * @see #setRepresentedElement(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTextualRepresentation_RepresentedElement()
	 * @see org.omg.sysml.lang.sysml.Element#getTextualRepresentation
	 * @model opposite="textualRepresentation" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Element getRepresentedElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TextualRepresentation#getRepresentedElement <em>Represented Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represented Element</em>' reference.
	 * @see #getRepresentedElement()
	 * @generated
	 */
	void setRepresentedElement(Element value);

} // TextualRepresentation
