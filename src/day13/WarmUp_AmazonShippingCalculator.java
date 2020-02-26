package day13;

public class WarmUp_AmazonShippingCalculator {

    public static void main(String[] args) {
        /*
         * Amazon has 2 type of user one is Prime member and another is regular member
         * prime member get free shipping in all purchase no matter the amount
         * regular member user get free  shipping only if their purchase is more than 25$
         * otherwise they get 5$ shipping fee
         *
         * */

        String memberType = "  member";
        double amount = 45.99d;
        int shippingFee = 0;
// first i want to check it is prime member or not
        if (memberType.equalsIgnoreCase("PRIME MEMBER")) {
            System.out.println("YOU GET 1 DAY FREE SHIPPING");
            System.out.println(" your final price is " + amount);
            //}else if(amount>25){
        } else if (!memberType.equalsIgnoreCase("PRIME MEMBER") && amount > 25) {
            System.out.println("Not a prime member, But you order is more than 25");
            System.out.println("You got free shipping" + amount);
        } else {
            System.out.println("Do you want to sign up for Prime Membership");
            shippingFee = 5;
            amount = amount + shippingFee; //to make it shorter amount +=shippingFee
            System.out.println(" Your final amount is " + amount);
        }
    }
}
