package Moments {
    import Occurrences::Life;
    import Occurrences::Occurrence;

    class Eternity specializes Life {
        // Nothing before/after or outside.
        // Could be many of these, see universal below.
        redefines predecessors [0];
        redefines successors [0];
        redefines outsideOfOccurrences [0];
    }

    class UniversalEternity [1] specializes Eternity {
      redefines snapshots : Moment;
    }

    readonly feature universalEternity : UniversalEternity [1];

    class all InstantOccurrence specializes Occurrence {
        // Probly useful elsewhere, eg, to type snapshots.
        redefines snapshots [1]; // Or startShot subsets endShot;
    }                            // Or middleTimeslice [0];

    class Moment specializes InstantOccurrence {
      redefines snapshotOf : UniversalEternity [1]; }
      
    import Occurrence::spaceTimeCoincidentOccurrences;

    feature coincidentMoment : Moment [1] subsets spaceTimeCoincidentOccurrences,
                                                  universalEternity.portions
                                          featured by Occurrence;
}