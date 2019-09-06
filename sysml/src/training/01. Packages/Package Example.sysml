/**
 * This is a documentary comment.
 * It is part of the model.
 */
package 'Package Example' {
	private import ScalarValues::*;
	
	/*
	 * This is a lexical comment ("note").
	 * It is in the text, but not part of the model.
	 */
	block Automobile;
	
	block Car is Automobile; // This is also a lexical comment.
	
	private value type Torque is ISQ::TorqueValue;	
}