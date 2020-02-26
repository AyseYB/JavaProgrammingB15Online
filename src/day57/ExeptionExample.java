package day57;

public class ExeptionExample {

    public static void main(String[] args) {

        System.out.println("Hello B15 Friends");
      //  int num = 2.5;  ---> compile error
        int[] nums = new int[3]; // 0,1,2
        nums[0] = 55;
        nums[1] = 56;
        nums[2] = 100;
        nums[3]= 12;
        System.out.println("Bye bye B15 Friends"); // this line does not run

        int result = 10 / 0;//ArithmeticException

    }

}
