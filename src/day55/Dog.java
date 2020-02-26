package day55;

import javax.xml.crypto.dom.DOMCryptoContext;

public class Dog {

    String type;

    public Dog(String type){
        this.type=type;
    }
    public void bark(){
        System.out.println(type + " dog is barking. ");
    }
}
