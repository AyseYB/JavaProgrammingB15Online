package day55;

import java.util.ArrayList;
import java.util.List;

public class CourseXRunner {

    public static void main(String[] args) {

        List<Student> myList = new ArrayList<>();
       myList.add(new Student("Muge", 101));
       myList.add(new Student("Hasan", 102));
       myList.add(new Student("Astrid", 103));
       myList.add(new Student("Vlad", 104));
       myList.add(new Student("Ayjeren", 105));

       CourseX c1 = new CourseX("HAS-A", myList);
       c1.addStudent("Goksel", 110);
       c1.addStudent(new Student("Ayse", 130));
        System.out.println("c1 = " + c1);

    }


}
