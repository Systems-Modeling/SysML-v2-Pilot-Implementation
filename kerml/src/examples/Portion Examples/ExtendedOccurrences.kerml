package ExtendedOccurrences {
    class Interval;
    class Moment :> Interval;
    class Timeslice {
        feature interval : Interval;
    }
    class Snapshot {
        feature moment :>> interval : Moment;
    }
    class ExtendedOccurrence {
        :>> timeslices : Timeslice [*] {
            feature interval : Interval
        }
        :>> snapshots :> timeslices : Snapshot [*] {
            feature moment :>> interval : Moment;
        }
        expr at {
            in interval : Interval;
            return result : Timeslice;

            result.portionOf = that;
            result.interval = interval;
        }

        expr while {
            in timeslice : Timeslice;
            return result : Timeslice = at(timeslice.interval);
        }
    }
}