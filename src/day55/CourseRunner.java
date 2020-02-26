package day55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRunner {

    public static void main(String[] args) {

        List<String > lst = new ArrayList<>(Arrays.asList("Muge", "Sumeyye", "Hasan", "Astrid", "Vlad", "Zehra"));

        Course c1 = new Course("Java", lst);
       // System.out.println("c1 before adding = \n " + c1);
        c1.addStudent("Gail");
        c1.addStudent("Muhammed");
        c1.addManyStudents(Arrays.asList("serife", "Israfil", "toyly"));

      //  System.out.println("Course Java = \n" + c1);
        //System.out.println("c1.studentNames = " + c1.studentNames);

//        c1.studentNames.add("Gail");
//        c1.studentNames.add("Mohammed");
//        c1.studentNames.add("Ayjeren");
//        c1.studentNames.add("Ayse");
//        c1.studentNames.addAll(Arrays.asList("Serife","Israfil", "Toylu"));

        System.out.println("c1.studentNames = " + c1.studentNames);

    }
}
