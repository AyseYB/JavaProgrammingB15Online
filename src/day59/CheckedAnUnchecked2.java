package day59;

public class CheckedAnUnchecked2 {

    public static void main(String[] args) {

        // checked exception must be handled or declared

        // handle -->> try catch
        // declare -->> add it to the method signature to document

        String x = "abc";
        System.out.println("Start");

        try {
            //            throw new IOException("just throwing this away");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("the end");

        //        } catch (IOException e) {
//            System.out.println("Exception caught");
//        }


    }
}
