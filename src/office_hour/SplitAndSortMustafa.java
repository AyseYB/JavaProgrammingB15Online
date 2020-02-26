package office_hour;

import java.util.Arrays;

public class SplitAndSortMustafa {
    public static void main(String[] args) {
        String test = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

        String[] splitArr = test.split(", ");
        System.out.println(Arrays.toString(splitArr));
        
        int shortestL = splitArr[0].length();
        
        for(int i = 0; i<splitArr.length; i++)
        {
            if (shortestL > splitArr[i].length())
            {
                shortestL = splitArr[i].length();
            }
        }

        System.out.println("shortestL = " + shortestL);
        
        int count = 0;
        
        for(int i = 0; i<splitArr.length; i++)
        {
            if (splitArr[i].length() == shortestL)
            {
                count++;
            }
        }

        System.out.println("count = " + count);

        String[] answer = new String[count];

        int j = 0;

        for(int i = 0; i<splitArr.length; i++)
        {

            if (splitArr[i].length() == shortestL)
            {
                answer[j] = splitArr[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(answer));

        Arrays.sort(answer);

        System.out.println(Arrays.toString(answer));




    }
}
