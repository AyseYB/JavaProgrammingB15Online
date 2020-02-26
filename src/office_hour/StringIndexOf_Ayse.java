package office_hour;

public class StringIndexOf_Ayse {

    public static void main(String[] args) {

        String str="Hello";
        int l= str.indexOf("l");
        System.out.println("l = " + l);
        int o= str.indexOf("o");
        System.out.println("o = " + o);
        int h =str.indexOf("H");
        System.out.println("H =" + h);
        int e =str.indexOf("e");
        System.out.println("e =" + e);
        int l1=str.indexOf("l",3);
        System.out.println("l =" + l1);

//        String isim ="Yusuf";
//        int f= isim.indexOf("f");
//        System.out.println("f =" + f);
//        int u=isim.indexOf("u");
//        System.out.println("u = " + u);
//        int s =isim.indexOf("s");
//        System.out.println("s = " + s);
//        int u2=isim.indexOf("u",2);
//        System.out.println("u = " + u2);

        String name = "Mustafa";
        int m=name.indexOf("M");
        System.out.println("M = " + m);
        int u=name.indexOf("u");
        System.out.println("u = " + u);
        int s= name.indexOf("s");
        System.out.println("s = " + s);
        int t=name.indexOf("t");
        System.out.println("t = " + t);
        int a =name.indexOf("a");
        System.out.println("a = " + a);
        int f =name.indexOf("f");
        System.out.println("f = " + f);
        int a2 =name.indexOf("a",5 );
        System.out.println("a = " + a2);
    }
}
