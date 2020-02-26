package day55;

import day17.OnlyOddNumber;

public class Casting {

    public static void main(String[] args) {

        int x = 10;

       // byte b = x
        byte b = (byte) x;

        Object o = new Dog("Chiwava");
      //  o.bark();
        Dog d = (Dog) o;
        d.bark();
    }
}
