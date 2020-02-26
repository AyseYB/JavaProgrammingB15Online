package office_hour;

public class MustafaArray {
    public static void main(String[] args) {
        int [] ages = {3, 7, 11, 37, 38};
        String[] names = {"Emin", "Yusuf", "Zeynep", "Ayse", "Mustafa"};

        for(int i = 0; i < ages.length; i++)
        {
            System.out.println(ages[i]);
        }

        System.out.println();

        for(int i = 1; i < ages.length; i++)
        {
            System.out.println(ages[i]);
        }

        System.out.println("Even index");

        for(int i = 0; i < ages.length; i = i+2)
        {
            System.out.println(ages[i]);
        }

        System.out.println("All index, print only even");

        for(int i = 0; i < ages.length; i++)
        {
            if (i%2  == 0) {
                System.out.println(ages[i]);
            }
        }

        System.out.println("Odd index");

        for(int i = 1; i < ages.length; i = i+2)
        {
            System.out.println(ages[i]);
        }

        System.out.println("Backwards");

        for(int i = ages.length-1; i >= 0; i--)
        {
            System.out.println(ages[i]);
        }

        System.out.println("Names");



        for (int i = 0; i < names.length && i < ages.length; i++)
        {
            System.out.println(names[i] + " is " + ages[i] + " years old.");
        }




    }
}
