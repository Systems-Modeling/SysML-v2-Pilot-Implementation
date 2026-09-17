// Constraint: validateCaseUsageSubjectParameterPosition (context: CaseUsage)
// The subjectParameter of a CaseUsage must be its first input.
// input->notEmpty() and input->first() = subjectParameter
package validateCaseUsageSubjectParameterPosition_invalid1 {
	case c {
		in x;
		subject s;
	}
}
