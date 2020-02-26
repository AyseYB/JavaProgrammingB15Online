package office_hour;

public class ReviewLoop12_05_2019 {

    public static void main(String[] args) {
//        int a = 9;
//        while (a> 2){
//            System.out.println("Hello Batch 15");

        for(int i = 9; i>=1 ; i--) {
            System.out.println( " hello world" );
        }

//        for(int i= 10; i<=20; i++ ){
//            if(i %2 != 0)
//            System.out.println(i);
//        }

        int sum =0;
        for(int x =0; x<=20; x++){

            if(x %2 == 0){
                System.out.println(x);
                sum +=x;
            }
        }
        System.out.println("sum = " + sum);







































    }
}
