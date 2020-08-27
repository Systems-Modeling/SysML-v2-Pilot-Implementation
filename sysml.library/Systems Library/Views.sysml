/**
 * This package defines the base types for views, viewpoints, renderings and related elements 
 * in the SysML language.
 */
package Views {
	import Parts::Part;
	import Parts::parts;
	import Requirements::RequirementCheck;
	import Requirements::requirementChecks;
	
	abstract part def View :> Part {
		ref part :>> self : View;
		
		/**
		 * Other Views that are used in the rendering of this View.
		 */
		abstract ref part subviews : View[0..*] :> views;
		
		part rendering : Rendering[0..1];
		
		requirement viewpointSatisfactions : ViewpointCheck[0..*];
		
		satisfy requirement viewpointConformance by View::self {
			require viewpointSatisfactions;
		}
	}
	
	/**
	 * ViewpointCheck is a RequirementCheck for checking if a View meets the concerns of viewpoint stakeholders. 
	 * It is the base type of all ViewpointDefinitions.
	 */
	abstract requirement def ViewpointCheck :> RequirementCheck (subject : View[1]) {
		ref requirement thisViewpoint : ViewpointCheck :>> thisRequirement;		
	}
	
	/**
	 * Rendering is the base type of all RenderingDefinitions.
	 */
	abstract part def Rendering :> Part {
		ref part :>> self : Rendering;
		
		/**
		 * Other Renderings used to carry out this Rendering.
		 */
		abstract ref part subrenderings : Rendering[0..*] :> renderings;
	}
	
	/**
	 * views is the base feature of all ViewUsages.
	 */
	abstract part views : View[0..*] :> parts;
	
	/**
	 * viewpointChecks is the base feature of all ViewpointUsages.
	 */
	abstract requirement viewpointChecks : ViewpointCheck[0..*] :> requirementChecks;
	
	/**
	 * renderings is the base feature of all RenderingUsages.
	 */
	abstract part renderings : Rendering[0..*] :> parts;
}