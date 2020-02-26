package day12;

public class HardCoreCorollaFan_CarShopping {

    public static void main(String[] args) {

        String carBrand = "tesla";
        int carPrice = 60000;
        int budget = 60000;

        if ( carBrand.equals("corolla")){
            System.out.println("  corolla Car acquired !!!");
        }else if ( carBrand.equals("tesla") && carPrice <= budget){
            System.out.println("tesla car acquired !!");
        }else{
            System.out.println(" Not what i am looking for");
        }









    }
}
