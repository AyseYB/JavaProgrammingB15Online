package day40;

public class Offer {
    String location,company;
    long salary ;
    boolean isFullTime;

    public void displayInformation(){
        System.out.println("Location = " + location +" , "
                +"Company = " + company +" , " +"Salary = " + salary +" , "
                +isFullTime  );
    }
    /**
     * This is a instance method to print all the information about Offer object
     * no parameter and no return type
     */
    // inside instance method we can directly access instance variable

    //write a method called turnToFullTIme
    public void turnToFullTime(){
        if(isFullTime == false){
            isFullTime = true;
        }else {
            System.out.println("ALready FullTime");
        }

    }

    // Write a method to change the location of the Offer
    // to the location user passed
    public void changeLocation(String newLocation){
        location = newLocation;
    }

    // Write a method to accept 4 parameters to change all info
    // about offers
    public void changeAllInfo(String newCompany, String newLocation, long newSalary, boolean newIsFullTime){
        company= newCompany;
        location= newLocation;
        salary= newSalary;
        isFullTime = newIsFullTime;
        // an instance method can call another instance method
        // an instance method can use any instance fields
        // since we already have functionality to display information
        // we called it here to display new information after modifying

        displayInformation();

    }
    // write a method to check the offer belong to 100K club and return the result as true false

    /**
     *
     * @return
     */
    public boolean is100KOffer(){

        // salary>=100000 already generate a boolean result
        // so we can directly return that result
        return salary >=100000;
    }
    /**
     * Create an instance method called toString
     * has no parameter
     *
     * @param
     * @return String representation of Offer Object
     * <p>
     * In below format
     * [Location = Virginia , Company = Amazon | Salary = 150000 $ | isFullTime = true]
     */
    public String toString(){
        String result = "[ Location = " + location +" , "
                +"Company = " + company +" , " +"Salary = " + salary +" , "
                +isFullTime + " ]";
      //  String result = "Bla bla bla";
        return result;
    }

}


//    Create Offer class with
//instance fields :
//        location, company, salary , isFullTime
//        instance methods :
//        displayOfferDetails -- print all info about offers
//        Create 5 offer objects with your ideal offers with all details , call displayOfferDetails method on each of them
//        Optionally : @channel
//Store them into List<Offer> then call the method.
//        Optionally :
//        Add 5000 to each offers less than 100K
