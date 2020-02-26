package day03;

public class PrimitivesPractices {

    public static void main(String[] args) {

        byte letterCount = 26;
        System.out.println(" the letter count is " + letterCount ) ;

        short sheepCount = 300;
        System.out.println( " My uncle has "+ sheepCount + " sheep " );

        int catCount = 20;
        System.out.println( " The animal shelter has " + catCount + "cats");

        long mileToSun = 10000000L;

        long mileToMoon = 500000l;


        // ----------------floating point----------
        // you must add at the end if number
        // upper case or lower case doesnt matter, but it is mandatory

        float priceOfBanana = 1.99f ;
        System.out.println(" In our grocery store banana is $ "+ priceOfBanana );
        float priceOfPotato = 2.49f ;
        // -------------larger floating point numbers ------
        double priceOfIpad    = 355.99d;
        double priceOfIpadPro = 1024.99D;
        // compiler automatically assume it's double so it isnt not required to have d
        // however for good programming habit , add them always
        double priceOfMac     = 2299.99 ;

        // if you have a whole number by itself compiler automatically assume it's an int

        // if you have a fraction number by itself compiler automatically assume it's an double









    }
}
