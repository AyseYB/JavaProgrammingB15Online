package day32;

public class NumberAction {

    public static void main(String[] args) {
//numberComparision(2,5);
//numberComparision(4,3);
//numberComparision(2,2);
//
//repeater("hello world", 2);
//repeater("DO NOT TOUCH " , 2);
//skipCountBy3From0to50();
print1toX(3);
countDownByEvenNumberFromXtoY(10,6);
//countDownByEvenNumberFromXtoY(6, 10);


    }
    //Create static method as below
//     *
//             * numberComparision
// * this method has 2 parameters called num1 and num2
// * if num1 is more than num2 print num1 is more than num2
// * if num2 is more than num1 print num2 is more than num1
// * if num2 are equals num1 print they are equal
// *
public static void numberComparision(int num1, int num2){
    if (num1 > num2) {
        System.out.println("Num1 is more than num2");
    }else if(num2>num1){
        System.out.println("Num2 is more than num1");
    }else{
        System.out.println("They are equal");
    }
}

// * String repeater
// * this method has 2 parameters
// *     String strToRepeat and int count
// *    repeat printing the string as many time as <count> number define



    public static void repeater(String strToRepeat , int count){
        for (int i = 1 ;  i <=count ; i++ ){
            System.out.println(strToRepeat);
        }
    }

//    skipCountBy3From0to50
// *
// * * create a method that has no parameter
// * and skip count by 3 from 0 to 50

    public static void skipCountBy3From0to50(){
        for (int i = 0 ; i < 50 ; i += 3){
            System.out.print(i + " ");
        }
    }
//   * print1toX
// * * create a method that has 1 int parameter called x
// * print from 1 to that number in one line
// * print an empty line after the print.
// *
// *
//
//            *
public static void print1toX(int x){
        for (int i =1 ; i <= x ; i++){
            System.out.print(i + " ");
        }
}

//count down by evennumbers from x to y
    public static void countDownByEvenNumberFromXtoY(int x, int y){
        for (int i = x ; i >= y ; i--){
            if(i %2 ==0){
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

}
