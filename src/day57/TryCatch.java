package day57;

public class TryCatch {

    public static void main(String[] args) {

        System.out.println("BEFORE TRY CATCH");
        try {
            int result = 10/2;
        }catch (ArithmeticException e){
            System.out.println("Expection happened, and was caught");
        }
        System.out.println("after try catch");

        try{
            System.out.println("In second Try Block");
            String str = "Java is fun !";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));
        }catch (Exception e){
            System.out.println("Exeption happened in Try block and caught");
        }
        System.out.println("After second try catch");

//        try{
//            int result = 10/0;
//        }catch (ArithmeticException e) {
//            System.out.println("Expection happened, and was caught");
//        }
//        System.out.println("After try catch");
    }
}
