package day09;

public class CitizenTypeChecker {

    public static void main(String[] args) {
        //Task 2
        //Create a class called CitizenTypeChecker withmain method
        //Create a variable called citizenType as String
        //and create a variable with age
        //if the age is more than 65, assign value of citizenType to Senior
        //if not, assing value of citizenType to not-Senior
        // Eventually print out ( the citizen age is <Number> , he is < senior>)
        String citizenType ;
        int age = 60;
        if ( age > 65) {
            citizenType= "Senior";
        }else{
            citizenType= "Not Senior";
        }
        System.out.println(" the citizen age is " + age + " , and he is a " + citizenType);

        // What can you do inside each part of it statement inside curly braces
        String middleSchoolAge;
        int age2 = 13 ;
        if ( age2 > 10) {
            middleSchoolAge =" Youth ";
        }else{
            middleSchoolAge = " Kids" ;
           // System.out.println( " Middle school age is " + age2 + " and those kids are " + middleSchoolAge);

            // work on this Ayse
        }

    }

}
