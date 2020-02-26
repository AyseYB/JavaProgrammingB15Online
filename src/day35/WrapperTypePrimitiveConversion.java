package day35;

public class WrapperTypePrimitiveConversion {

    public static void main(String[] args) {


        Integer num1 = 100; //auto-boxing 100-->> new Integer(100)
        // Integer.valueOf(..) is a method that return Integer Object
        // it has 2 overloaded version one that accept number , another accept String
        // BUT BOTH OF THEM RETURN INTEGER OBJECT

        int num2 = Integer.valueOf("200");

// // THIS CAN NOT HAPPEN BY ITSELF
//        //int num3 = "200" ;
//        // This is how we can use parseInt to convert String to int
        int num3 = Integer.parseInt("200");

        // Use this number IPR2012-00001 and store the year into a int variable
        // This case number always start with 3 character either IPR , PGR , CBM , DER
        // followed by year , followed by dash and 5 digit number
          String caseNumber = "IPR2012-00001";
       String strYear =caseNumber.substring(3,7);
        int year =Integer.parseInt(strYear);
        System.out.println("strYear = " + strYear);
        System.out.println("year = " + year);
        System.out.println(getYearOutOfCaseNumber("DER2019-00034"));

    }

    public static int getYearOutOfCaseNumber(String caseNumber1){
         //caseNumber1= "IPR2012-00001";
//        String strYear =caseNumber1.substring(3,7);
//        int year =Integer.parseInt(strYear);
//
//        return year;

        return Integer.parseInt(caseNumber1.substring(3,7));



    }
}

/*
 * Integer.parseInt("numberHere")
 *    it return an int value converted from String
 *
 * Integer.valueOf("numberHere")
 *  it return an Integer Object by wrapping up the number
 *
 * YOU MAY USE WHICHEVER YOU WANT BECAUSE :
 * Auto-boxing and Auto-unboxing will take care of the conversion anyway
 * */
