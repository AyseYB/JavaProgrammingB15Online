package day59;

public class General {

    public static void main(String[] args) {

        System.out.println("The Start");
        String str = null;

        // IF YOU HAVE MUTI TRY CATCH BLOCK
        // The most specific type (child type ) should come first
        // the more generic type (super type ) should come last

        try {

            System.out.println(str.charAt(0));
            System.out.println("End of Try ");
        } catch (NullPointerException bla){
            System.out.println("NO Object here !!");
        } catch (Exception e ){
            System.out.println("the rest of the exceptions");
        }
        System.out.println("The End!!");



    }




}
