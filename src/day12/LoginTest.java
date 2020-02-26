package day12;

import javax.swing.*;

public class LoginTest {

    public static void main(String[] args) {
// we can declare or assign value like this// if it's multiple variables of same type
        String userName = "AAA", password = "pass123";

        //user123, pass123
        if (userName.equals("user123") && password.equals("pass123")) {
            System.out.println(" Login successful");
        } else if (!userName.equals("user123") && password.equals("pass123")) {
            System.out.println(" username is not correct !");
        } else if (userName.equals("user123") && password.equals("pass123")) {
            System.out.println(" password not correct");
        } else {
            System.out.println(" username and password are both wrong");
        }
    }
}