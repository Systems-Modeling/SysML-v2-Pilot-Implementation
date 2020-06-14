/**
 * This package defines the base types for connections and related structural elements 
 * in the SysML language.
 */
package Connections {
	private import Objects::BinaryLink;
	private import Objects::binaryLinks;
	private import Parts::Part;
	private import Parts::parts;

	/**
	 * Connection is the most general class of links between two Parts within some 
	 * containing structure. Connction is the base type of all ConnectionDefinitions.
	 * 
	 * (Note that this does not include BindinConnectors, which are typed by
	 * the kernel Association SelfLink.)
	 */
	abstract assoc block Connection :> BinaryLink, Part { // Need to handle n-ary connections.
		end :>> source: Part[0..*];
		end :>> target: Part[0..*];
	}
	
	/**
	 * connections is the base feature of all ConnectionUsages.
	 */
	abstract part connections: Connection[0..*] :> binaryLinks;	
}