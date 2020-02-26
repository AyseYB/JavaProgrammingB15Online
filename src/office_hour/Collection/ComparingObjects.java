package office_hour.Collection;
import java.util.*;
public class ComparingObjects {

    public static void main(String[] args) {

        List<String> lst = new ArrayList<>();
        lst.add("Adam");
        lst.add("John");
        lst.add("Mary");
        lst.add("Diana");

        System.out.println(lst);
        Collections.sort(lst);
        System.out.println(lst);

        Collections.sort(lst, Comparator.reverseOrder());
        System.out.println(lst);

        List<Person> plst = new ArrayList<>();
        plst.add(new Person("John", 20));
        plst.add(new Person("Adam", 32));
        plst.add(new Person("Mary", 10));
        plst.add(new Person("John", 22));

        System.out.println(plst);
        Collections.sort(plst);
        System.out.println(plst);

        Collections.sort(plst);
        Comparator<Person> comp=
                new PersonNameComparator();
        Collections.sort(plst, comp);
      //  Comparator<>
        //Comparator.comparing()




    }

}
