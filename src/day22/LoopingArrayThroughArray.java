package day22;

public class LoopingArrayThroughArray {
    public static void main(String[] args) {


        // creating an array object with empty slot
        int[] scores = new int[4];
        int sum =0;

        // assigning value to each index
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        // array object has a property called length

        // accessing the elements inside array one by one

//        int itemCount=scores.length;
//
//        for (int x = 0; x < itemCount ; x++) {
//            System.out.println(scores[x]);
//        }

        int itemCount =scores.length;
        for (int x =0 ; x < itemCount ; x++) {
            System.out.println(scores[x]);
            sum = sum + scores[x];
        }
        System.out.println("sum = " + sum);

//
//
//
//     how do we get the char count of a String
        String name= "Yusuf Bilgic";
        int charCount=name.length();






        // accessing the elements inside array one by one
//        System.out.println(scores[0]);
//        System.out.println(scores[1]);
//        System.out.println(scores[2]);
//        System.out.println(scores[3]);



    }
}
