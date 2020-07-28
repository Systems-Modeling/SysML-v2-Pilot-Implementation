  /** AAA */
  //a lexical comment ("note") is not a part of model
package Comments {
	// inside package
	/**
*AAA
 * BBB*/	
 /**
    *
    *
    * AAA  ***   
    *BBB
    								*/

   /**
 *       AAAA
 *       BBBB           */	
 /* AAAA
 
 
  * BBBB
 *
 * CCCC
 */
 /*
 * AAAA
 * BBBB
 *    CCC DDD    
 */
	
	/** double star - one line comment */
   /** double star - one line comment with spaces after              */
   /** */
	/* one start comment is allowed only inside a package */
	comment doc_about_doc /** Comment about Comment */
	comment doc /* Named Comment */	
	comment doc_doc about doc /* Other Comment about Comment */
	
	comment /** Documention Comment on Class C */
	class C {
		comment /* Comment in Class C */
		comment about Comments /* Comment about Package */
		
	}
	/* abc */
	class A;
}