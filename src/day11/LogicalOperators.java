package day11;

public class LogicalOperators {

    public static void main(String[] args) {



        System.out.println(true&&true&&false);
        System.out.println(false||true||true);
int x= 55;
                               //false|| false || true -->> true
        System.out.println( x== 50 || x==51 || x==55);

        //check x is more than 50 and x is not equal to 52 or x equal to 57
                              // true && true || false -->> true
        System.out.println( x>50 && x!=52 || x==57 );



    }
}
