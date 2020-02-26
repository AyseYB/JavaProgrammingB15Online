package office_hour;

public class Reverse_Nested_Loop {
    public static void main(String[] args) {
        //           012345
        String str ="YUSUF";
        String reversed ="";

        for( int i = str.length()-1 ; i >= 0 ; i--){
           // System.out.println(i);
            reversed += str.substring(i, i +1);
            //System.out.println(str.substring(i, i+1));
           // System.out.println(reversed + " * ");
        }

        System.out.println(reversed);














    }
}
