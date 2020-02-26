package day13;

public class NestedIf_DoYouWantToShop {
    public static void main(String[] args) {

        //ask create a boolean store the result of YouWantToShop
        //if yes, do you want to go to store or do you wanna shop online
        //if user do not wanna shop at all , print good job stay home coding!!
        boolean youWantToShop = true;
        String preference = "Store";

        //if( youWantToShop==true) both are correct
        if (youWantToShop) {

            if (preference.equals("Store")) {
                System.out.println("GOINT TO STORE FOR SHOPPING");
            } else {
                System.out.println("GOING TO ONLINE FOR SHOPPING");

            }


        } else {
            System.out.println(" good job stay home coding!!!");
        }


    }

}

