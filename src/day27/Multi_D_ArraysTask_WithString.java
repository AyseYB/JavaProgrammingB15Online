package day27;

public class Multi_D_ArraysTask_WithString {

    public static void main(String[] args) {

        System.out.println("=============");
        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testersTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String [] businessAnalysitsTeam = {"Lisa", "Ershad", "Naila", "A"};

        String[][] scrumTeam =  {developersTeam, testersTeam, businessAnalysitsTeam};

        // find the longest string of text

        int maxLength = scrumTeam[0][0].length();
        String longestString = "";

        for (String[] each1DArray : scrumTeam){
            for (String eachElement: each1DArray){
                if(maxLength < eachElement.length()){
                    maxLength=eachElement.length();
                    longestString=eachElement;
                }
            }
        }
        System.out.println(maxLength);
        System.out.println(longestString);


        for (String[] each1DArray : scrumTeam){
            for (String eachElement: each1DArray){
                if(maxLength == eachElement.length()){
                    System.out.println(eachElement);

                }
            }
        }

















    }
}
