package 'Performing Actions as Solved' {
    doc /*
    The goal of this model is to present an 'already solved' action that has a 
    simple loop that is executed twice by checking the end condition. The actions also
    has a perform action mapping to some parts.
    */

    private import Actions::DecisionAction;
    private import Actions::AssignmentAction;
    private import Actions::MergeAction;

    part def 'Part Universe' {
        part Clapper [1] {
            /* Library Elements */
            action :>> performedActions = ('Action Universe'::'Clap 1', 'Action Universe'::'Clap 2');
            action :>> timeEnclosedOccurrences = ('Action Universe'::'Clap 1', 'Action Universe'::'Clap 2');

            action teo1 :> timeEnclosedOccurrences = 'Action Universe'::'Clap 1' {
                ref :>> that = Clapper;
                ref :>> self = 'Action Universe'::'Clap 1';
                ref :>> longerOccurrence = Clapper;
                ref :>> shorterOccurrence = 'Action Universe'::'Clap 1';
            }

            action teo2 :> timeEnclosedOccurrences = 'Action Universe'::'Clap 2' {
                ref :>> that = Clapper;
                ref :>> self = 'Action Universe'::'Clap 2';
                ref :>> longerOccurrence = Clapper;
                ref :>> shorterOccurrence = 'Action Universe'::'Clap 2';
            }

            /* User level elements*/

            /* Redefinition */
            perform action 'Clap' ::> 'Action Universe'::'Executed Loop'.'Clap';
        }
        part Mirror [1] {
            /* Library Elements */
            action :>> performedActions = ('Action Universe'::'Back 1', 'Action Universe'::'Back 2');

            /* User level elements*/
            perform action 'Back' ::> 'Action Universe'::'Executed Loop'.'Back';
            
        }
    }

    action def 'Action Universe' {
        /* Using Action Universe just to keep from having top-level feature*/
        action 'Executed Loop' [1] {
            /* Library Elements */
            action :>> subactions = ('Clap 1', 'Clap 2', 'Back 1', 'Back 2',
                'clap again? 1', 'clap again? 2');

            action :>> subperformances = ('Clap 1', 'Clap 2', 'Back 1', 'Back 2',
                'clap again? 1', 'clap again? 2') {
                    ref :>> this = 'Executed Loop';
                    ref :>> thisPerformance = 'Executed Loop';
                    /* That points up to one level above, which has itself as this*/
                    ref :>> that = 'Executed Loop'; 
                }

            action :>> enclosedPerformances = ('Clap 1', 'Clap 2', 'Back 1', 'Back 2',
                'clap again? 1', 'clap again? 2');

            action :>> timeEnclosedOccurrences = ('Clap 1', 'Clap 2', 'Back 1', 'Back 2',
                'clap again? 1', 'clap again? 2');

            action :>> decisions = ('clap again? 1', 'clap again? 2');

            action :>> assignments = ('Loop Increment 1', 'Loop Increment 2');
            action :>> merges = ('Re-Loop 1', 'Re-Loop 2');

            action :>> start = 'Loop Start';
            action :>> done = 'Loop End';

            /* User level elements*/

            attribute loopCount default 1;

            merge 'Re-Loop';

            then action 'Clap' = ('Clap 1', 'Clap 2') {
                ref :>> involvedObjects = 'Part Universe'::'Clapper';
                ref :>> performers = 'Part Universe'::'Clapper';
            }
            then action 'Back' = ('Back 1', 'Back 2') {
                ref :>> involvedObjects = 'Part Universe'::'Mirror';
                ref :>> performers = 'Part Universe'::'Mirror';
            }
            
            then action 'Loop Increment' assign loopCount := loopCount + 1;

            then decide 'clap again?';
                if loopCount > 2 then done;
                if loopCount <= 2 then 'Clap';
            
        }

        action 'Re-Loop 1' [1];
        action 'Re-Loop 2' [1];
        action 'Clap 1' [1] {
            ref :>> involvedObjects = 'Part Universe'::'Clapper';
            ref :>> performers = 'Part Universe'::'Clapper';
        }
        action 'Clap 2' [1];
        action 'Back 1' [1];
        
        action 'clap again? 1' : DecisionAction [1];
        
        action 'Loop Start' [1];
        
        action 'Loop Increment 1' : AssignmentAction [1] {
            action :>> target = 'Executed Loop';
            attribute :>> replacementValues = 2;
        }

        action 'Back 2' [1] {
            ref :>> successors = ('Loop Increment 2', 'clap again? 2', 'Loop End');

            /* Have to break out individually otherwise the further nesting makes sense.*/

            ref successor1 :> successors = ('Loop Increment 2') {
                ref :>> that = 'Back 2';
                ref :>> self = 'Loop Increment 2';
                ref :>> earlierOccurrence = 'Back 2';
                ref :>> laterOccurrence = 'Loop Increment 2';

                /* Check: laterOccurence.successors is ('clap again? 2', 'Loop End'), 
                * earlierOccurrence.succesors
                *  is ('Loop Increment 2', 'clap again? 2', 'Loop End'). Passes.
                */
            }

            ref successor2 :> successors = ('clap again? 2') {
                ref :>> that = 'Back 2';
                ref :>> self = 'clap again? 2';
                ref :>> earlierOccurrence = 'Back 2';
                ref :>> laterOccurrence = 'clap again? 2';

                /* Check: laterOccurence.successors is Loop End, earlierOccurrence.succesors
                *  is ('Loop Increment 2', 'clap again? 2', 'Loop End'). Passes.
                */
            }

            ref successor3 :> successors = ('Loop End') {
                ref :>> that = 'Back 2';
                ref :>> self = 'Loop End';
                ref :>> earlierOccurrence = 'Back 2';
                ref :>> laterOccurrence = 'Loop End';

                /* Check: laterOccurence.successors is null, earlierOccurrence.succesors
                *  is ('Loop Increment 2', 'clap again? 2', 'Loop End'). Passes.
                */
            }
        }

        action 'Loop Increment 2' : AssignmentAction [1] {
            action :>> target = 'Executed Loop';
            attribute :>> replacementValues = 3;

            ref :>> successors = ('clap again? 2', 'Loop End');

            /* Have to break out individually otherwise the further nesting makes sense.*/

            ref successor1 :> successors = ('clap again? 2') {
                ref :>> that = 'Loop Increment 2';
                ref :>> self = 'clap again? 2';
                ref :>> earlierOccurrence = 'Loop Increment 2';
                ref :>> laterOccurrence = 'clap again? 2';

                /* Check: laterOccurence.successors is Loop End, earlierOccurrence.succesors
                *  is ('clap again? 2', 'Loop End'). Passes.
                */
            }

            ref successor2 :> successors = ('Loop End') {
                ref :>> that = 'Loop Increment 2';
                ref :>> self = 'Loop End';
                ref :>> earlierOccurrence = 'Loop Increment 2';
                ref :>> laterOccurrence = 'Loop End';

                /* Check: laterOccurence.successors is null, earlierOccurrence.succesors
                *  is ('clap again? 2', 'Loop End'). Passes.
                */
            }
        }

        action 'clap again? 2' : DecisionAction [1] {
            ref :>> successors = 'Loop End' {
                ref :>> that = 'clap again? 2';
                ref :>> self = 'Loop End';
                ref :>> earlierOccurrence = 'clap again? 2';
                ref :>> laterOccurrence = 'Loop End';

                /* Check: laterOccurence.successors is null, earlierOccurrence.succesors
                *  is Loop End. Passes.
                */
            }
        }

        action 'Loop End' [1];
    }
}