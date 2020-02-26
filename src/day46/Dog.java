package day46;

public class Dog extends Animal {

    public void speak(){
        super.speak();
        super.speak();
        super.speak();
        // super. can be used to specify we are calling
        // super class version of the method
        // can we use super. or this. outside of instance method
        // BIG NO !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // It can only be used inside instance method
        // we can use super. or this. as many time as we want
        System.out.println("Bark!!!");
    }

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.speak();
        // WHY DO WE WANT TO CALL SUPER CLASS VERSION OF OVERRIDDEN METHOD
        // We want to build on top of what's already written
        // code reuse
        // parent provide step abc
        // child want to do abc defg
        // so instead of repeating abc
        // child can directly call super class version of the method
        // to perform abc then add defg

    }

}
