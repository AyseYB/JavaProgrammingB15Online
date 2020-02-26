package OOP.Muhtar_OfficeHour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssociationExample {

    public static void main(String[] args) {

        Student s1 = new Student("Ayse");
        System.out.println(s1);
        Student s2 = new Student("Mustafa");
        Student s3 = new Student("Zeynep");
        Student s4 = new Student("Yusuf");
        Student s5 = new Student("Emin");

      List<Student> list = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));
        System.out.println(list);

        School Cybertek = new School("Cybertek", list);
        System.out.println(Cybertek.AllStudentList);
        System.out.println(Cybertek.schoolName);
        System.out.println(Cybertek.toString());

        Cybertek.addNewStudent(new Student("Irina"));
        Cybertek.addNewStudent(new Student("zehra"));






//
//        List<Student> CybertekStudents  = Arrays.asList(s1, s2, s3, s4, s5);
//
//        School sc1 = new School("CybertekSchool", CybertekStudents);
//        for ( Student each : CybertekStudents ){
//            System.out.println(each);
//        }
    }
}
