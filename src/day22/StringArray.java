package day22;

public class StringArray {
    public static void main(String[] args) {
        // create an String array with size that you define
        // and store all your household member names

        String[]names=new String[5];
        names[0]="Mustafa";
        names[1]="Ayse";
        names[2]="Zeynep";
        names[3]="Yusuf";
        names[4]="Emin";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        //immutable means you can not change the internal structure of the object
        //if you have String abc="hello';
        //if you do abc.toUppercase --->> it will create new String object "HELLO"
//and it does not change original hellp at all

        //not resizeble --->> specifically for array
        //we can not change the size if array once we created them with certain size
        //however , we can change the elements inside this array
        //and it means : IT IS NOT IMMUTABLE












    }
}
