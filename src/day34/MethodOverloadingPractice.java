package day34;

public class MethodOverloadingPractice {

    public static void main(String[] args) {

        add(15);
//        add(15,45);
//        add(15,43,67);
//        add(15, 23);




    }
//    create 4 static void overloaded version of add method
//	1, add
//    has 1 int parameter and add 100 to that number
//    and print out the result

    public static void add(int a){
        System.out.println(a + 100);
        add(a,100); //we can do this to reuse functionallity we already have
    }
//    2, add
//		has 2 int parameters and add them to get sum
//		and print out the result
    public static void add(int a, int b){
        System.out.println(a+b);
    }

//    3, add
//		has 3 int parameters and add them to get sum
//		and print out the result
    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

//    4, add
//		has 2 long parameters and add them to get sum
//		and print out the result
    public static void add(long a, long b){
        System.out.println(a + b);
    }
}
