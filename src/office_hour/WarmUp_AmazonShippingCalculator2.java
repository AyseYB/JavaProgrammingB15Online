package office_hour;

import java.util.Scanner;

public class WarmUp_AmazonShippingCalculator2 {

    public static void main(String[] args) {

       String memberType= "!Prime MeMbEr";
       double amount=30.00d;
       int shippingFee=0;

       if(memberType.equalsIgnoreCase("PRIME MEMBER")){
           System.out.println(" 1 day free shipping");
           System.out.println(" your final price is" + amount);
       } // else if (amount > 25) {
         else if(!memberType.equalsIgnoreCase("prime member")&& amount>25){
           System.out.println("not a prime member but order is mor than $25");
           System.out.println(" your final price is" + amount);
       }else{
           System.out.println(" do you want to sign up for prime membership");
           shippingFee= 5;
           amount=amount+shippingFee;
           System.out.println("your final price is" +amount);

       }



    }
}
