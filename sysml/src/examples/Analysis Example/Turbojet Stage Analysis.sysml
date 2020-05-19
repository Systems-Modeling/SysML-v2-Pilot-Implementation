package 'Turbojet Stage Analysis' {
	import Quantities::QuantityValue;
	import UnitsAndScales::DimensionOneValue;
	import ISQ::*;
	
	value type VolumeValue :> SIDerivedUnit {
	   :>> lengthPowerFactor {
			:>> exponent = 3;
		}
	}
	
	package 'Thermodynamic Functions' {
	    function def 'Ideal Gas Law' (in rho, in R_bar, in T) return p {
	        rho * R_bar * T
	    }
	    
	    // The "in" and "return" direction markers are optional.
	    function def 'Reversible Adiabatic Compression Density' (rho_1, rho_2, p_1, p_2, gamma) rho_2 {
	        rho_1 * (p_2 / p_1)**(1/gamma)
	    }
	    
	    // Shorthand for "mathematical" function definition (with no steps but the returned expression)
	    function def 'Reversible Adiabatic Compression Temperature' (T_1, p_1, p_2, gamma) 
	    	T_2 = T_1 * (p_2 / p_1)**((gamma - 1) / gamma);
	    
	    // Examples of alternative keywords
	    
	    fn def 'Total Pressure' (P_static, rho, V) = 1/2 * rho * V ** 2 + P_static;
	    
	    // Showing explicit parameter typing
	    calc def 'Total Temperature' (T_static : TemperatureValue, Cp : DimensionOneValue, V : VolumeValue) : TemperatureValue 
	    	= 1/(2 * Cp) * V ** 2 + T_static;
	    
	    compute def 'Total Enthalpy' (h_total, h_static, V) H_total {
	    	1/2 * V ** 2 + h_static
	    }
	}
	
	package 'Thermodynamics Structure' {
	    
	    // need to figure out how to do imports so can get expressions from KerML
	    
	    // define specific gas constant here
	        
	    // define ideal gas law here
	    
	    block 'Ideal Gas Parcel' {
	        comment
	            /*
	            The parcel is an infinitesimal volume used to analyze points in a flow
	            */
	        value 'Molar Mass';
	        value 'Density';
	        value 'Pressure';
	        value 'Temperature';
	        value 'Enthalpy';
	        value 'Specific Gas Constant';
	    }
	    
	    block 'Moving Ideal Gas Parcel' specializes 'Ideal Gas Parcel' {
	        comment about 'Stagnation Pressure'
	            /*
	            Stagnation pressure is the pressure of the parcel if the kinetic energy defined by its
	            velocity in a given coordinate frame is converted to gas internal energy through deceleration
	            to a velocity that matches the current frame.
	            */
	        value 'Stagnation Pressure';
	        value 'Stagnation Temperature';
	        value 'Stagnation Enthalpy';
	        
	        comment about 'Static Pressure'
	            /*
	            Static pressure is the pressure of the parcel as it moves
	            */
	        value 'Static Pressure' redefines 'Ideal Gas Parcel'::'Pressure';
	        value 'Static Temperature' redefines 'Ideal Gas Parcel'::'Temperature';
	        value 'Static Enthalpy' redefines 'Ideal Gas Parcel'::'Enthalpy';
	    }
	    
	    activity 'Thermodynamic Process'; // need start and end shots to show beginning and end values
	    
	    activity 'Adiabatic Process' specializes 'Thermodynamic Process' {
	        /*
	        Thermodynamic process typically have their states defined at beginning and end
	        of the process (since these starts are path-independent)
	        */
	        action 'Stage 1' :>> start;
	        action 'Stage 2' :>> done;
	    }
	    
	    activity 'Reversible Adiabatic Process' specializes 'Adiabatic Process';
	    
	    // TODO: for a stage, invoke conservation laws to justify equations (e.g., V1_axial = V2_axial)
	}
	
	package 'Low-Pressure Compressor Analysis' {
	    // try to do a full analysis block separate from jet engine design, and then bind the two inside context
	    
	    part 'Analysis Context' {
	        import 'Thermodynamic Functions'::*;
	        
	        part 'Inlet Gas' : 'Thermodynamics Structure'::'Moving Ideal Gas Parcel' {
	        	// Explicit binding notation
	        	function 'Solve for Pressure1' : 'Ideal Gas Law' (rho, R_bar, T) p;
	        	bind 'Density' = 'Solve for Pressure1'::rho;
	        	bind 'Specific Gas Constant' = 'Solve for Pressure1'::R_bar;
	        	bind 'Static Temperature' = 'Solve for Pressure1'::rho;
	        	bind 'Static Pressure' = 'Solve for Pressure1'::p;	        	
	        	
	        	// Shorthand parameter binding notation (also using optional "in" and "return")
	            function 'Solve for Pressure2' : 'Ideal Gas Law'(
	                in rho = 'Density',
	                in R_bar = 'Specific Gas Constant',
	                in T = 'Static Temperature'
	            ) return p = 'Static Pressure';
	            
	            // Invocation expression notation
	            value :>> 'Static Pressure' = 'Ideal Gas Law'('Density', 'Specific Gas Constant', 'Static Temperature');

	            // Equation as binding (possible future notation) 
	            // eqn 'Static Pressure' = 'Ideal Gas Law'('Density', 'Specific Gas Constant', 'Static Temperature');
	            
	            // Equation as a constraint (note "==")
	            constraint { 'Static Pressure' == 'Ideal Gas Law'('Density', 'Specific Gas Constant', 'Static Temperature') }
	            
	            // Examples of alternative keywords
	        	// Shorthand parameter binding notation
	            fn 'Solve for Pressure3' : 'Ideal Gas Law'(
	                in rho = 'Density',
	                in R_bar = 'Specific Gas Constant',
	                in T = 'Static Temperature'
	            ) return p = 'Static Pressure';
	            
	        	// Shorthand parameter binding notation
	            calc 'Solve for Pressure4' : 'Ideal Gas Law'(
	                in rho = 'Density',
	                in R_bar = 'Specific Gas Constant',
	                in T = 'Static Temperature'
	            ) return p = 'Static Pressure';
	            
	        	// Shorthand parameter binding notation 
	        	// (this one may work for a computation, distinct from a "mathematical function")
	            compute 'Solve for Pressure5' : 'Ideal Gas Law'(
	                in rho = 'Density',
	                in R_bar = 'Specific Gas Constant',
	                in T = 'Static Temperature'
	            ) return p = 'Static Pressure';
	            
	        }
	    }
	}	
	
}