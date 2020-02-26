package office_hour;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        System.out.println(dog1.name);

        dog1.breed = "Husky";
        dog1.size = "Small";
        dog1.color = "WHite and gray";
        dog1.name = "Holly";
        dog1.gender = 'F';
        dog1.age= 24;
        dog1.food = "Sushi";

        dog1.getInfo();

        Dog dog2 = new Dog();
        dog2.breed ="Husky";
        dog2.name= "Iyka";
        dog2.color = "Gray";
        dog2.age = 3;
        dog2.size = "large";
        dog2.gender ='M';
        dog2.food="dog food";

        dog2.getInfo();
        dog1.eat();
        dog1.sleep();
        dog2.sleep();
        dog2.eat();
        dog1.bark();
        dog2.bark();

        Dog dog3 = new Dog();
        dog3.bark();





    }
}
