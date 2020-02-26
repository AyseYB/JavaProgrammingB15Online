package OOP.Muhtar_OfficeHour;

import java.util.Arrays;
import java.util.List;

public class School {

    String schoolName;
    List<Student>AllStudentList;


    public School(String schoolName, List<Student> allStudentList) {
        this.schoolName = schoolName;
        this.AllStudentList = allStudentList;
    }

    public void addNewStudent(Student s1){
        this.AllStudentList.add(s1);

    }

    public void addMoreStudent(Student[] students){
        this.AllStudentList.addAll(Arrays.asList(students));
    }


    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", AllStudentList=" + AllStudentList +
                '}';
    }

    public static class Circle extends Object {

        int radious;

        public Circle(int radious) {
            this.radious = radious;
        }

        @Override
        public boolean equals (Object otherC){

           return otherC.equals(radious);


        }
    }

    public static class Test {
        public static void main(String[] args) {

            Circle c1 = new Circle(3);
            Circle c2 = new Circle(5);

            System.out.println(c1.equals(c2));
        }
    }
}
