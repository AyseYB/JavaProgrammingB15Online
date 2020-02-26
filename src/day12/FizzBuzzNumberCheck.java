package day12;

public class FizzBuzzNumberCheck {

    public static void main(String[] args) {

        //Given a number
          //if this number can be divided by 5 without remainder lets print it fizz number
        // for example 5, 10, 15..
        //if this numebr can be divided by 3 without remainder lets print it bizz number
        //for exsmple 3, 15, 9,27
        // if this number can be divided by both 3 and 5 lets print FizzBuzzNumber
        //for exsmple 15, 45, 30,90
        int num =9;

        if(num%5==0 && num%3==0){
            System.out.println("fizzBuzzNumber");}
         else if(num%5==0 ){
            System.out.println("fizz number");
        }else if ( num%3==0){
            System.out.println("buzz number");
        }else{
            System.out.println("not my number!!");
         }






    }
}
