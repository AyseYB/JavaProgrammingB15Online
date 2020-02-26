package day26;

import java.util.Arrays;

public class ToCharArrayPracticeWIthArrayClassMethod {

    public static void main(String[] args) {

        String survey = "Complete B15 Online 1 month Survey";

        char[] surveyChars = survey.toCharArray();
        System.out.println("Before surveychar : " + Arrays.toString(surveyChars));
        Arrays.sort(surveyChars);

        System.out.println("After surveyChar " + Arrays.toString(surveyChars));













    }
}
