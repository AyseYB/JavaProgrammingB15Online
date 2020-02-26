package OOP.Muhtar_OfficeHour;

public class Student {

    String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString(){
        return studentName;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "studentName='" + studentName + '\'' +
//                '}';
//    }
}
