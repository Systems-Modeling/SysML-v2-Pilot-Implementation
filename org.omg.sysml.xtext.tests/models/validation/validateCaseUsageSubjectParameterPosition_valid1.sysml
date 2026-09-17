// Constraint: validateCaseUsageSubjectParameterPosition (context: CaseUsage)
// The subjectParameter of a CaseUsage must be its first input.
// input->notEmpty() and input->first() = subjectParameter
package validateCaseUsageSubjectParameterPosition_valid1 {
	case c {
		subject s;
		in x;
	}
}
