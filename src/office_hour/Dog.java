package office_hour;

public class Dog {

    /**
     * Dog
     * attributes
     * breed, size, age, color, name, gender
     *
     * actions
     *  eat, sleep, bark, play ...
     */
    // Attributes or data about dogs
    String breed ;
    String size;
    byte age;
    String color;
    String name;
    char gender;
    String food ;

    public void getInfo(){
        System.out.println(breed + " " + size + " " +
                age + " years old " + color +
                gender + "is gender" + "Name is " + name  );
    }

    public void eat(){
        System.out.println(name + " is eating " + food);
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public void bark(){
        System.out.println(name + " is barking");
    }








}
