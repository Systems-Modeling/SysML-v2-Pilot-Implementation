// Constraint: validateForLoopActionUsageParameters (context: ForLoopActionUsage)
// A ForLoopActionUsage must have two owned input parameters.
// inputParameters()->size() = 2
package validateForLoopActionUsageParameters_valid1 {
	action def A {
		for i in (1, 2) {}
	}
}
