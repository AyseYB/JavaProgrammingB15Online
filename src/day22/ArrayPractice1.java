package day22;

public class ArrayPractice1 {

    public static void main(String[] args) {

        double[] prices = new double[5];

        System.out.println(prices[0]);

        // can NOT print out array variable directly
        // to see what's inside
        System.out.println(prices);

        prices[0]=2.46;
        prices[1]=24.56;
        prices[2]=66.98;
        prices[3]=500;
        prices[4]=65.87;

        // what happen if I go over the range
        // RUN TIME ERROR!!!!!!
        //prices[5] = 165.3 ;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);

        // Create a char array that hold all the letters from your first name
        // and assign values using each characters of your first name

        // then print out each character

        char [] name =new char[4];
        // What default value do we get for char array
        // we get a char represented by ascii code 0
        System.out.println("<" + name[0] + ">");

        name[0]='A';
        name[1]='y';
        name[2]='s';
        name[3]='e';

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);

        int charCount =name.length;
        System.out.println(charCount);

        // THIS WILL ACTUALLY PRINT THE CONTENT OF CHAR ARRAY NOT MEMORY ADDRESS
        // AND THIS IS ONLY FOR CHAR ARRAY , ANYTHING ELSE WILL PRINT MEMORY ADDRESS

        //System.out.println( name  );

        boolean[] yesNo =new boolean[3];
        System.out.println( yesNo[0] );
        System.out.println( yesNo[1] );
        System.out.println( yesNo[2] );

        yesNo[0]=true;
        yesNo[1]=false;
        yesNo[2]=true;//10>7

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);



















    }
}
