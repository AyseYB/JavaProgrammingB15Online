package OOP.OfficeHour.parent;

public class Child extends Parent {



    String lastName;

    public Child(String fullName, int age, int SSN) {
        super(fullName, age, SSN);
        lastName = fullName;
    }


    public void doHomework(){
        System.out.println("The child is doing homework");
    }
}
