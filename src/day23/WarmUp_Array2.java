package day23;

public class WarmUp_Array2 {
    public static void main(String[] args) {

        int[] numbers= {2, 3, 4, 5, 6};
        for (int x = numbers.length-1; x >= 0 ; x--) {

            System.out.println("shows the reverse order " + numbers[x]);
        }

    int lastItem= numbers.length-1;
        System.out.println(numbers[lastItem] + " is the last item");

        int middleItem = numbers.length/2;
        System.out.println(numbers[middleItem] + " is the middle item");

        int sum =0;
        for (int x = 0; x < numbers.length ; x++) {
            sum = sum + numbers[x];

        }
        System.out.println("sum = " + sum);






















    }
}
