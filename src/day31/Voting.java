package day31;

public class Voting {

    public static void main(String[] args) {

        checkELigibilty(14);
        checkELigibilty(48);
        checkELigibilty(33);

        int yourAge = 12;
        checkELigibilty(yourAge);
    }


    // This method has one int parameter named age
    // whoever calling this method, need to provide a number
    // it will set the value of age into that number
    // the method parameter can be only accessible within the method
    public static void checkELigibilty(int age){
       // int age= 15;
        if(age>18){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible");
        }
    }
}
