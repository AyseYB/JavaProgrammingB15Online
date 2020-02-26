package day53;

public class FruitShopUtility {

    public static void main(String[] args) {
        Fruit f1 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f2 = new Orange("sour", "orange", 12);

        displayFruit(f1);
        displayFruit(f2);
        digestBetter(f2);
        displayFruit(new Apple("tasteless", "red", "Golden"));

    }

    // displayFruit
    public static void displayFruit(Fruit anyFruit) {
        System.out.println("Displaying fruit \n "+ anyFruit.toString());
    }

    public static void digestBetter(Fruit anyFruit){
         anyFruit.getDigested();
         anyFruit.getDigested();
         anyFruit.getDigested();
         anyFruit.getDigested();
        System.out.println("anyFruit" + anyFruit);

    }

//    public static String  getMyFavoriteFruit(){
//        return
//    }

    //sell fruit


    // buyFruit


}