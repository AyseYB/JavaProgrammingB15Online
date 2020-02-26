package day44;

//CyberHouse
//        instance fields : houseNum, design
//static field : neighbourhoodName
//        add 2 args constructor
//        to set the houseNum, design
//        instance method
//        void showAllInfo()
//        just print the houseNum, design neighbourhoodName in one line
//static void method showNeighborhood
//        print the neighbourhoodName only
//// try to access houseNum, design and see what happen

public class CyberHouse {
    // we can change default value of the fields
    // by assigning value directly in the template class
    int houseNum ;
    String design ;
    static String  neighbourhoodName = "Evanston";

    // constructor  can access anything
    public CyberHouse(int houseNum, String design) {
        this.houseNum = houseNum;
        this.design = design;
    }

    // static method can only access static members of same class
    public static void neighbourhoodName(){
        System.out.println("neighbourhoodName = " + neighbourhoodName);
        // CAN NOT ACCESS ANYTHING NON-STATIC INSIDE STATIC METHODS
        //System.out.println("houseNum = " + houseNum);
    }

    // instance method can access anything
    public void showAllInfo(){
        //System.out.println("House number :" + this.houseNum  + "desing is : " + this.design );
        System.out.println("House Number : " + houseNum + " , design is :" + design +
                " , NeighbourHood name " + neighbourhoodName);
    }







}
