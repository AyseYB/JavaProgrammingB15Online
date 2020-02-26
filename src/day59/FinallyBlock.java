package day59;

public class FinallyBlock {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        try {
            System.out.println(nums[10]);
        }catch (Exception e) {
            System.out.println("Exeption caught \n " + e.getMessage()  );
        } finally {
            System.out.println("This code will always run no matter we have exception or not");
        }




    }
}
