package day32;

public class NumberAction2 {

    public static void main(String[] args) {
skipCountBy3From0to50();
numberComparision(12,34);
numberComparision(4, 1);
numberComparision(4,4);
//print1tX(3);
        countDownByEvenNumberFrom50to0();
        countDownByEvenNumberFromXtoY(14,2);
        repeatString("Ayse" , 3);
    }

    //skipCountBy3From0to50
    public static void skipCountBy3From0to50(){
        for (int i = 0; i <= 50; i +=3) {
            System.out.println(i);
        }
    }

//      /**
//     * * numberComparision
//     * * this method has 2 parameters called num1 and num2
//     * * if num1 is more than num2 print num1 is more than num2
//     * * if num2 is more than num1 print num2 is more than num1
//     * * if num2 are equals num1 print they are equal
//     * *
//     *
    public static void numberComparision(int num1, int num2){
        if(num1 >num2){
            System.out.println("num1 is more than num2");
        }else if(num2>num1){
            System.out.println("num2 is more than num1");
        }else {
            System.out.println("they are equal");
        }
    }

    // print 1 to x
    public static void print1tX(int x){
        for (int i =1 ; 1 <= x ; i++){
            System.out.print(i+ " ");
        }
    }

    public static void countDownByEvenNumberFrom50to0(){
        for (int i = 50; i >=0 ; i-=2) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void countDownByEvenNumberFromXtoY(int x, int y){
        for (int i = x ; i >= y; i -= 2 ){
            System.out.print(i + " ");
        }
        System.out.println();
    }
//     * repeatString
//     *  this method has 2 parameters
//     *     String strToRepeat and int count
//     *    repeat printing the string as many time as <count> number define
//    repeatString("Java", 3) -->> Java Java Java
//     * @param strToRepeat
//     * @param count
//     */

    public static void repeatString(String strToRepeat , int count){
        for(int i = 1; i <= count; i++){
                System.out.print(strToRepeat );
//
        }
    }

}
