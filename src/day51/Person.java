package day51;

import java.util.Collection;
import java.util.Collections;

// Person IS-A Comparable
// yes because it implements Comparable interface
// it's a inheritance | IS-A | Super-Sub relationship
public class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }
    // modify this method to make your natural order , comparing by name (first character)
    // then use it with sort method
    @Override
    public int compareTo(Person otherPerson) {
        if(this.name.charAt(1) > otherPerson.name.charAt(1)){
            return 1;
        }else if(this.name.charAt(1)< otherPerson.name.charAt(1)){
            return -1;
        }else {
            return 0;
        }



    }


//    public int compareTo( Person otherPerson){
//        if(this.age >otherPerson.age){
//            return 1;
//        }else if(this.age < otherPerson.age){
//            return -1;
//        }else{
//            return 0;
//        }
//    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



}
