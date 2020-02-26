package office_hour;

import java.util.Arrays;

public class Practice_12_30 {

    public static void main(String[] args) {

        int a = 10;
        Integer A= a;

        float f =0.5f;
        Float F=f;

        Double num1 =0.5;
        Short num3 =45;
        Integer num4 =100;
        double num2 =num4;
        System.out.println(num2);

        Long number1 =100L; //Auto boxing

        Float f1= 100.0f;

        double d1 = f1; //unboxing

        System.out.println(Byte.MAX_VALUE); // maximum value of byte primitive
        System.out.println(Byte.MIN_VALUE); //minimum    "    "  "       "
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);


        //parse methods:
        String str1= "123";
         int result=Integer.parseInt(str1);
        System.out.println(result + 1 );

        String str2 = "true";
          boolean r1= Boolean.parseBoolean(str2);
        System.out.println(r1);

        String str3 = "fAlSe"; // true, false
        boolean r2 =Boolean.parseBoolean(str3);
        System.out.println(r2);

        String str4 = "Parvin";
        boolean r3 =Boolean.parseBoolean(str4);
        System.out.println(r3);

        //ValueOf
        String s1= "100.5";

        Double c1 = Double.parseDouble(s1);
        Double c2 = Double.valueOf(s1);
        System.out.println(c1);
        System.out.println(c1 +1);
        System.out.println(c2);

        String s2 = "False";
        Boolean b1 =Boolean.valueOf(s2);
        System.out.println(b1);

        int[] arr = new int[3];
        System.out.println(Arrays.toString(arr));

        boolean[] arrB =new boolean[3];
        System.out.println(Arrays.toString(arrB));

        String name = "string";
        String name1 = new String("string");

        Integer I1 = new Integer("123");











    }
}
// useful methods of wrapper class:
/**
 * Max_value return the maximum value
 *
 * Min_Value  return the minimum value
 *
 * parse methods : converting string values to primitives, returns primitive, not case sensitive
 *
 * ValueOf method : converting String to Wrapper class returns
 *
 */
