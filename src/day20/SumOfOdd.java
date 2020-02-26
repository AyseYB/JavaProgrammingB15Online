package day20;

public class SumOfOdd {

    public static void main(String[] args) {
        //  Give me the sum of odd numbers from
//  10 - 100 , use for loop

//// hint : create a variable sum as int
/// loop through 10-100
////  in each iteration check it's a odd number or not
////  if it's add that number to sum
//
//    eventually after the loop -->> print out sum value

        int sum = 0;

        for (int i = 10; i <= 100; ++i){
            if(i %2 ==1){
               // System.out.println(i);
                sum = i + sum; //sum +=i;
            }
        }

        System.out.println("sum = " + sum);
    }
}
