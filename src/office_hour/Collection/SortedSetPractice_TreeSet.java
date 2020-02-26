package office_hour.Collection;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetPractice_TreeSet {

    public static void main(String[] args) {

       // SortedSet<Long> longTreeSet = new TreeSet<>();
      SortedSet<Long> longTreeSet = new TreeSet<>();
        longTreeSet.add(3L);
        longTreeSet.add(3L);
        longTreeSet.add(39L);
        longTreeSet.add(30L);
        longTreeSet.add(30L);

        System.out.println("longTreeSet = " + longTreeSet);
        System.out.println("longTreeSet.size() = " + longTreeSet.size());
        System.out.println("longTreeSet.first() = " + longTreeSet.first());
        System.out.println("longTreeSet.last() = " + longTreeSet.last());

        longTreeSet.addAll(Arrays.asList(15L, 18L, 15L, 18L));
        System.out.println("longTreeSet = " + longTreeSet);

        //longTreeSet.add(null);
       // System.out.println("longTreeSet = " + longTreeSet);


        System.out.println("longTreeSet.subSet(15L, 21L) = " + longTreeSet.subSet(15L, 30L));
        System.out.println("longTreeSet.headSet(18L) = " + longTreeSet.headSet(18L));
        System.out.println("longTreeSet.tailSet(18L) = " + longTreeSet.tailSet(18L));

        SortedSet<Long> tailView = longTreeSet.tailSet(18L);
        System.out.println("tailView.remove(30L) = " + tailView.remove(30L));
        System.out.println("longTreeSet = " + longTreeSet);



    }
}
