package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<_> extends TreeSet<_> implements Comparable<ComparableTreeSet<_>>{


    public ComparableTreeSet(_... arr) {
    }
    public ComparableTreeSet() {
    }

    public int compareTo(ComparableTreeSet<_> o) {
        return 1;
    }

}
