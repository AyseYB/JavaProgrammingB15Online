package office_hour;

public class MethodReview_And_Summerize {

    public static void main(String[] args) {

        String a="Abcdefg";
        for (int i = a.length()-1; i>=0;i--) {
            System.out.print(a.substring(i,i+1 ));
        }
        System.out.println();

        eligible(45);
        System.out.println(eligible(45));
        System.out.println();

        OddEven(55);
    }

    public static boolean eligible(int age){
        if(age>=35){
            return true;
        }else{
            return false;
        }
    }

    public static void OddEven(int number){
        if(number %2 ==0){
            System.out.println(number + " is even number");
            return;
        } {
            System.out.println(number + " is odd number");
        }
    }
}