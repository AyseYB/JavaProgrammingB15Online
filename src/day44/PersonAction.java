package day44;

public class PersonAction {

    public static void main(String[] args) {

        Person p1 = new Person("emin Bilgic", 3);
        p1.species ="Human";
        System.out.println("p1 = " + p1);

        Person p2 = new Person("Yusuf Bilgic", 7);
        p2.species = "Humanion";
        System.out.println("p2 = " + p2);
        
        Person p3 = new Person("Zeynep Bilgic", 11);
        System.out.println("p3 = " + p3);
    }
}
