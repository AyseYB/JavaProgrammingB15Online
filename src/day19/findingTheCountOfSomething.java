package day19;

public class findingTheCountOfSomething {

    public static void main(String[] args) {

        String street = "Hamlin ave";

//        System.out.println(street.charAt(0));
//        System.out.println(street.charAt(1));
//        System.out.println(street.charAt(2));
//        System.out.println(street.charAt(3));

//        System.out.println(street.length());

        int counter = 0;

        for (int i = 0; i < street.length(); i++) {
            System.out.println(i + " " + street.charAt(i));
            if (street.charAt(i) == 'a') {
                counter++;
            }
        }
        System.out.println(counter);

//        int count = 0;
//
//        for( int i = 0 ; i< street.length() ; i++){
//            System.out.println(i + " " +street.charAt(i));
//            if (street.charAt(i) == 'a')
//            {
//                count++;
//            }
//            System.out.println("Current count is " + count);
//        }
//
//        System.out.println("Final count is " + count);


        System.exit(0);

        // YOU DO THIS
        // from 1-100  print out all the numbers can be divided by 15 without remainder
        // DO THIS ONE TOGETHER
        // from 1-100  count how many numbers can be divided by 15
        int cnt = 0;
        for (int num = 1; num <= 100; ++num) {
            if (num % 15 == 0) {
                System.out.println("num = " + num);
                ++cnt;
            }
        }
    System.out.println("counter = " + cnt);

        ///     given a string with value
        //      find out how many a showed in this String




        String name = "Mustafa";
       // System.out.println(name.charAt(0) == 'a');
        int countOfA =0;

        for (int x = 0 ; x < name.length(); x++){
            System.out.println(name.charAt(x));
            char currentChar = name.charAt(x);
            if ( currentChar == 'a'){
               // System.out.println("Bingo Found it");
                ++countOfA;
            }
        }
        System.out.println("Count of A = " + countOfA  );






        
















    }
}
