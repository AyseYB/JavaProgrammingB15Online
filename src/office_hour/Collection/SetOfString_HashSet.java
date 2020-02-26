package office_hour.Collection;

import java.util.*;

public class SetOfString_HashSet {

    public static void main(String[] args) {

//        System.out.println(new String("Adam").hashCode());
//        System.out.println(new String("Adam").hashCode());
//
//
//        Set<String> strSet = new HashSet<>();
//        strSet.add("Adam");
//        strSet.add("John");

        Set<Person> pSet = new HashSet<>();
        Person p1 = new Person("John" , 20);
        Person p2 = new Person("John" , 20);
        Person p3 = new Person("John" , 20);

        System.out.println(p1.hashCode());
        System.out.println("p2.hashCode() = " + p2.hashCode());
        System.out.println("p3.hashCode() = " + p3.hashCode());

        pSet.add(p1);
        pSet.add(p2);
        pSet.add(p3);

        System.out.println("pSet.size() = " + pSet.size());

        System.out.println("p1.equals(p2) = " + p1.equals(p2));


    }
}
