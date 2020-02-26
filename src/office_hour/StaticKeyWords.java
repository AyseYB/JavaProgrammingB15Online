package office_hour;

public class StaticKeyWords {

    int a;
    static int b ;// static variable can be shared by class and all the objects of the class
    //and we can call it through the class name


    public static void main(String[] args) {

        StaticKeyWords obj1 = new StaticKeyWords();
        obj1.a= 100;

        StaticKeyWords obj2 = new StaticKeyWords();
        obj2.a = 200;

        System.out.println(obj1.a);

        double num = 10.5; // local variable

        System.out.println(StaticKeyWords.b);
        System.out.println("obj1.b = " + obj1.b);

        System.out.println("===================================");

        StaticKeyWords obj3 = new StaticKeyWords();
        System.out.println(obj3.b);

        StaticKeyWords obj4 = new StaticKeyWords();
        obj4.b = 3;
        System.out.println(obj4.b);




    }
}