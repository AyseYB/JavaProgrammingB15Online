package office_hour;

public class StaticVariables {

    static String name;       // instance variable belong to the object
                              //static variable belong to the class and shared by all other object
    static double staticNum;

    int num1;

    public static void method1(){
        System.out.println("Open the browser");
    }



    public static void main(String[] args) {
        //System.out.println(num1);  static method only accepts class members

        StaticVariables objA = new StaticVariables();
        System.out.println(objA.num1);

        StaticVariables.method1();




        StaticVariables obj1 = new StaticVariables();
        obj1.name = "Omar";

        StaticVariables obj2 = new StaticVariables();
        obj2.name = "Khurshed";
        System.out.println(obj2.name);

        System.out.println(obj1.name + " OBj1"); //print out khurshed, because static variable is only one copy

        StaticVariables object1 = new StaticVariables();
        object1.staticNum = 4.5;
        System.out.println(StaticVariables.staticNum);

        StaticVariables object2 = new StaticVariables();
        System.out.println("object2.staticNum = " + object2.staticNum);


    }

}
