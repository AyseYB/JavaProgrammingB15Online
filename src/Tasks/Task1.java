package Tasks;

public class Task1 {

    public static void main(String[] args) {

        int num1, num2, num3;
        num1 = 46;
        num2 = 12;
        num3 = 45;
        int sum = num1 + num2 + num3;
        int mult = num1 * num2;
        if (sum > 100) {
            System.out.println("more than 100");
        } else {
            System.out.println("not more than 100");
        }
        if (mult > sum) {
            System.out.println("excellent result");
        } else {
            System.out.println(" not the numbers combination i am looking for");

        }


    }


}

