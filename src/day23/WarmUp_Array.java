package day23;

public class WarmUp_Array {

    public static void main(String[] args) {

//        int[] numbers = new int[3];
//        int sum = 0;
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        for (int x = 0; x < numbers.length; x++) {
//
//            sum = sum + numbers[x];
//            System.out.println("numbers[] = " + numbers[x]);
//        }
//        System.out.println("sum = " + sum);

        //  create an int array of 7 items
        //  assign values
        // 1,  print out in reverse order
        // 2 , store last item in a variable called lastItem
        // print it out separately
        // 3 , print the item right in the middle
        //
        // OPTIONALLY : find sum , find average , find max , find min
        //     Double the value of each items in this arra

        int[] nums3 = {11, 2, 23, 4, 53, 6, 3};

        for (int x = nums3.length - 1; x >= 0; x--) {
            System.out.println("index " + x + " : " + nums3[x]);
        }

        int arraySize = nums3.length;
        int lastItemIndex = arraySize - 1;

        int lastItemValue = nums3[lastItemIndex];

        System.out.println("last Item Value = " + lastItemValue);

        int middleItemIdex = arraySize / 2;
        System.out.println("middle item value  = " + nums3[middleItemIdex]);


        int sum = 0;
        for (int x = 0; x < arraySize; x++) {

//            int currentItem =  nums[x] ;
//            sum = sum + currentItem ;
            sum = sum + nums3[x];  // sum += nums[x]


        }
        System.out.println("sum = " + sum);








    }
}
