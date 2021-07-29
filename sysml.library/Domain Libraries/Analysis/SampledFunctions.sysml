package SampledFunctions {
	private import Base::Anything;
	private import ScalarValues::Positive;
	private import Collections::KeyValuePair;
	private import Collections::OrderedMap;
	private import SequenceFunctions::size;
	private import ControlFunctions::forAll;
	private import ControlFunctions::collect;
	private import ControlFunctions::select;
	
	/**
	 * SamplePair is a key-value pair of a domain-value and a range-value, used as a sample element in SampledFunction.
	 */
    attribute def SamplePair :> KeyValuePair {
        attribute domainValue :>> key;
        attribute rangeValue :>> val;
    }

	/**
     * SampledFunction is a variable-size, ordered collection of 'SamplePair' elements that represents a generic, discretely sampled, 
     * uni-variate or multi-variate mathematical function. The function must be montonic, either striclty increasing or stricly
     * decreasing.
     * 
     * It maps discrete domain values to discrete range values.
     * The domain of the function is represented by the sequence of 'domainValue' of each 'SamplePair' in 'samples', and 
     * the range of the function is represented by the sequence of 'rangeValue' of each 'SamplePair' in 'samples'.
     */
	attribute def SampledFunction :> OrderedMap {
		attribute samples: SamplePair[0..*] ordered :>> elements;
		
		assert constraint {
			// Note: Assumes the functions '<' and '>' are defined for the domain type.
			(1..size(samples)-1)->forAll { in i; (samples.domainValue[i] < samples.domainValue[i+1]) } or  // Strictly increasing
            (1..size(samples)-1)->forAll { in i; (samples.domainValue[i] > samples.domainValue[i+1]) }     // Strictly decreasing
		}
	}
	
	/* Domain returns the sequence of the domainValues of all samples in a SampledFunction. */
	calc def Domain(fn : SampledFunction) : Anything[0..*] = fn.samples.domainValue;
	
	/* Domain returns the sequence of the rangeValues of all samples in a SampledFunction. */	
	calc def Range(fn : SampledFunction) : Anything[0..*] = fn.samples.rangeValue;
	
	/* Sample returns a SampledFunction that samples a given calculation over a seqence of domainValues. */
	calc def Sample {
		in calc calculation (x);
		in attribute domainValues [0..*];
		return sampling = SampledFunction (
			samples = domainValues->collect {in x; SamplePair(x, calculation(x))}
		);
	}
	
	/* Interpolate returns an interpolated range value from a given SampledFunction for a given domain value.
	 * If the input domain value is outside the bounds of the domainValues of the SampleFunction, null is returned.
	 * An Interpolation function can be provided, which is used for interpolation between two samples of the
	 * SampledFunction. The default is liner interpolation.
	 */
	calc def Interpolate {
		in fn : SampledFunction;
		in attribute value;
		in calc interpolation : Interpolation default linearInterpolation;
		
		private attribute domainValues = Domain(fn);
		private attribute index : Positive[0..1] =
			(1..domainValues->size())->select {in i : Positive; domainValues[i] <= value }[1];
		
		return result [0..1] =
			if index == null or index == domainValues->size()? null
			else if fn.samples[index] < fn.samples[index+1]? interpolation(fn.samples[index], fn.samples[index+1], value)
			else interpolation(fn.samples[index+1], fn.samples[index], value);
	}
	
	/**
	 * An Interpolation calculates an interpolated range value between two SamplePairs given an input domain value.
	 * The domainValue of the lowerSample must be strictly less than the domainValue of the upperSample.
	 */
	abstract calc def Interpolation 
		(attribute lowerSample : SamplePair, attribute upperSample : SamplePair, attribute value) 
		attribute result;
	
	/**
	 * linearInterpolation is an Interpolation assuming a linear functional form between the given SamplePairs.
	 */
	calc linearInterpolation : Interpolation {
		private attribute f = (value - lowerSample.domainValue) / (lowerSample.domainValue - upperSample.domainValue);
		return result = upperSample.rangeValue + f * (lowerSample.rangeValue - upperSample.rangeValue);
	}
	
}