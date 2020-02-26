package office_hour;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_105 {

    public static void main(String[] args) {

//Write a loop that displays all possible combinations of two letters where the letters are 'z', or 'y', or 'x', or 'w', or 'v'.
// The combinations should be displayed in descending alphabetical order:
//
//zz
//zy
//zx
//zw
//zv
//yz
//....
//vv
char[]letters = {'z', 'y', 'x', 'w'};
for( int i = 0 ; i < letters.length ; i++ ){
    for (int j = 0 ; j<letters.length ; j++){
        System.out.println(letters[i]+""+letters[j]);
    }
}
















    }
}
