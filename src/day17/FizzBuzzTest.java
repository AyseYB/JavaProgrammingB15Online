package day17;

public class FizzBuzzTest {

    public static void main(String[] args) {
        // if a number divided by both 3 and 5  ---> fizz buzz number
        // if a number can be divided by 5   ----> fizz number
        // if a number can be divided by 3 ----->buzz number

        int num =1;
        while (num<=100){
            if( num %5==0 && num%3 == 0){
                System.out.println(num + " is Fizz Buzz Number");
            }else if( num %5 == 0){
                System.out.println(num + " is fizz number");
            }else if( num%3==0){
                System.out.println(num + " is buzz number");
            }
            ++num;
        }













    }
}
