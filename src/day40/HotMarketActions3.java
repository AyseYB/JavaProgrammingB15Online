package day40;

public class HotMarketActions3 {

    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = false;
        o1.salary = 140000;

        o1.displayInformation();
        o1.turnToFullTime();
        o1.turnToFullTime();
        o1.changeLocation("DC");
        o1.displayInformation();

        o1.changeAllInfo("Amazon", "Chicago", 150000 , true);
       // o1.displayInformation();

        // if this guy earn more than 100K
        // move him to Atlanta
        //
        boolean result = o1.is100KOffer();
//        if(result == true){
//            o1.changeLocation("Atlanta");
//            }
        if(o1.is100KOffer()){
        }
        o1.displayInformation();

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










    }
}
