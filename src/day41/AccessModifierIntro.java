package day41;

public class AccessModifierIntro {

    public static void main(String[] args) {


        Person p1 = new Person();
//        p1.name = "Emin";
//        p1.age = 19;
//        p1.ssn = 123456789;
        p1.setAll("Emin", 19, 123456789);
        System.out.println("p1 = " + p1);

        System.out.println("p1.getName = " + p1.getName());
        p1.setName("Alp");
        System.out.println("p1.getName(); = " + p1.getName());

        System.out.println("p1.getAge(); = " + p1.getAge());
        p1.setAge(25);
        p1.setSsn(987654321);
        System.out.println("p1 = " + p1.getAge());

        System.out.println("p1 = " + p1);
     
    }
}
