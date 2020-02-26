package office_hour;

import java.util.ArrayList;
import java.util.List;

public class FileDeleteLater {
    public static void main(String[] args) {
//        int[][] data = { {12, 5, 4} , {23, 113, 32}   };
//        for ( int[] rows :data ){
//            System.out.println("********Row : ");
//            for ( int columnData: rows){
//                System.out.println(columnData + " ");
//            }
//            System.out.println();
     //   }
//
//        Integer i1 = 128;
//        Integer i2 = 128;
//        System.out.println(i1.equals(i2));
//        System.out.println("i1==i2 = " + (i1 == i2));
//
//        String str = "ABC";
//        String str2 = "ABC";
//        System.out.println(str.equals(str2));
        Student s1 = new Student();
        s1.name = "AYse";
        s1.age= 34;
        s1.school= "Cybertek";
       // s1.study("Java", 3, "Cybertek");
        s1.study("Java");
        System.out.println("s1 = " + s1);

        Person p1 = new Person("Ayse", 23);
        p1.getAge();
        p1.getName();
        System.out.println(p1.getAge() + " " +p1.getName());

//        Student1 s2 = new Student1();
//        s2.age = 23;
//        s2.study(new Integer("150"
//        ));

//        ArrayList<String> lst = new ArrayList<>();
//     //   List<String > lst1 =new ArrayList<>();
//        lst.add("Apple"); lst.add("Orange"); lst.add("Banana");
//        System.out.println("lst = " + lst);
//        System.out.println("lst.get(0) = " + lst.get(0));
//        System.out.println("lst.get(1) = " + lst.get(1));
//        System.out.println("lst.contains(\"Apple\") = " + lst.contains("Apple"));
//        System.out.println("lst.indexOf(\"Apple\") = " + lst.indexOf("Apple"));
//        System.out.println("lst.size() = " + lst.size());
//        System.out.println("lst.set(1,\"Pear\") = " + lst.set(1, "Pear"));
//        System.out.println("lst = " + lst);
//        System.out.println("lst.remove(0) = " + lst.remove(0));
//        System.out.println("lst = " + lst);
//        lst.clear();
//        System.out.println("lst = " + lst);
//        System.out.println("lst.isEmpty() = " + lst.isEmpty());
    }
    }
     class Student {
        String name;
        String school;
        int age;

        public void study(){
        }
        public void study(String topic){
            System.out.println("The student " + name + " is studying " + topic);
        }
        public void study(String topic, int hour, String school){
            System.out.println("The student " + name + " is studying "+ hour + " hours at " + school);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", school='" + school + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    class Student1 {
    String name;
    String school;
    int age;

    public void study(String topic){
    }
    public void study(Object sth){
    }
    }

    class Person {
    private String name;
    private int age;

    public Person( String name, int age ){
        this.name = name;
        this.age = age;
    }

        public String getName() {
            return name;
        }

//        public void setName(String name) {
//            this.name = name;
//        }

        public int getAge() {
            return age;
        }

//        public void setAge(int age) {
//            this.age = age;
//        }
    }




