package SequenceFunctions {
	private import Base::Anything;
	private import ScalarValues::*;
	private import ControlFunctions::exists;
	private import ControlFunctions::select;
	private import ControlFunctions::reject;

	function size(seq: Anything[0..*] ordered nonunique): Natural {
		isEmpty(seq)? 0: size(tail(seq)) + 1
	}
	function isEmpty(seq: Anything[0..*] ordered nonunique): Boolean {
		seq == null
	}
	function notEmpty(seq: Anything[0..*] ordered nonunique): Boolean {
		!isEmpty(seq)
	}
	function includes(seq: Anything[0..*] ordered nonunique, value: Anything[1]): Boolean {
		seq->exists {in x; x == value}
	}
	function excludes(seq: Anything[0..*] ordered nonunique, value: Anything[1]): Boolean {
		!seq->includes(value)
	}
	
	function union(seq1: Anything[0..*] ordered nonunique, seq2: Anything[0..*] ordered nonunique): Anything[0..*] ordered nonunique {
		(seq1, seq2)
	}
	function intersection(seq1: Anything[0..*] ordered nonunique, seq2: Anything[0..*] ordered nonunique): Anything[0..*] ordered nonunique {
		seq1->select {in x; seq2->includes(x)}
	}
	function including(seq: Anything[0..*] ordered nonunique, value : Anything[1]): Anything[0..*] ordered nonunique {
		(seq, value)
	}
	function excluding(seq: Anything[0..*] ordered nonunique, value : Anything[1]): Anything[0..*] ordered nonunique {
		seq->reject {in x; x == value}
	}
	
	function head(seq: Anything[0..*] ordered nonunique): Anything[0..1] {
		seq[1]
	}
	function tail(seq: Anything[0..*] ordered nonunique): Anything[0..*] ordered nonunique {
		seq->excluding(head(seq))
	}
	function last(seq: Anything[0..*] ordered nonunique): Anything[0..1] {
		seq[size(seq)]
	}
	
	function '[' specializes BaseFunctions::'[' (seq: Anything[0..*] ordered nonunique, index: Positive[1]): Anything[0..1];
}