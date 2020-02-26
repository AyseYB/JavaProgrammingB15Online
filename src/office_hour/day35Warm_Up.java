package office_hour;

public class day35Warm_Up {


    public static void main(String[] args) {
        String[] names ={"abc" ,"c", "apple", "ab"};
        String longestWOrd=names[0];

        for(int i = 0 ; i<names.length; i++){
            if (names[i].length() > longestWOrd.length()) {
                longestWOrd = names[i];
            }
        }
        System.out.println(longestWOrd);

    }



}
