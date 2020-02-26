package office_hour;

public class Substring_Ayse {

    public static void main(String[] args) {
        //                 01234567890123456789012345678
        String furniture ="tables and chairs mats spoons";
        String wordTable =furniture.substring(0,6);
        System.out.println("wordTable = " + wordTable);

        String wordChairs = furniture.substring(11);
        System.out.println("wordChairs = " + wordChairs);

        String wordand=furniture.substring(7,10);
        System.out.println("wordAnd = " + wordand);

        String spoons=furniture.substring(23);
        String mats=furniture.substring(18,22);
        String chairs=furniture.substring(11,17);
        String andW=furniture.substring(7,10);
        String tables=furniture.substring(0,6);
        System.out.println(spoons+ " " + mats +" "+ chairs +" " + andW +" " + tables +" are the dining room furniture");
        
        
        
        
    }
}
