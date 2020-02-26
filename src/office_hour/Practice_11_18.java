package office_hour;

public class Practice_11_18 {

    public static void main(String[] args) {

        //compound operator / shorthand operator
        // +=, -=,*=, ?=, %=

        // increment and decrement operator
        //++ --

        //Relational operator
        // >, >=, <, <= checking for equal and inequality

        // casting = converting one type to another
        //upcasting| type widening
        //converting data with smaller range type to bigger range data type
        // for example coverting int to long , int to double
        // this happen implicitly ( automatically )
        // double price = 99 ;

        // downcasting | type narrowing
        // converting data with bigger range data type to smaller range data type
        // for example convertin double to int OR IT WILL NOT COMPILE
        // JUST  LIKE WE CAN NOT PUT LARGE COFFEE INTO SMALL CUP , IT WILL SPILL!!!
        // for example
        // int priceAsWholeNumber = 99.45; ERROR!!!
        // int priceAsWholeNumber =(int) 99.45, 99 , 0.45 is lost

        // Special case of char to int
        // each character is represented by numbers in ascii table

        char myLetter = 'A';
        System.out.println(myLetter);

        // int only store number
        // so here it turn the character into Ascii number


        int myLetter2 ='A';
        System.out.println(myLetter2);


        int myLetter3 = 'a';
        System.out.println(myLetter3);

        char myLetter4 = 1060;
        System.out.println(myLetter4);


        // ------------
        int num = 10;
        System.out.println(num ==10);
        System.out.println(num != 10);

         boolean isNumEqual10 = (num==10);





    }


}
