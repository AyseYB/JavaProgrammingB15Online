package office_hour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScrumTeamApple_Tester {



    public static void main(String[] args) {

        ScrumTeamTesters t1 = new ScrumTeamTesters("Ayse", "Manual Tester", 95000);

//
//        t1.jobTitle = "Manual Tester";
//        System.out.println(t1.jobTitle);
//        System.out.println(t1.employeeName);
//        System.out.println(t1.salary);

        t1.getEmployeeInfo();

        ScrumTeamTesters t2 = new ScrumTeamTesters("Alisa", "SDET", 120000);
        ScrumTeamTesters t3 = new ScrumTeamTesters("Rauf", "QA", 100000);
//
//        List<ScrumTeamTesters> testersTeam = new ArrayList<>();
//        testersTeam.addAll(Arrays.asList(t1,t2,t3));
//        for ( ScrumTeamTesters each: testersTeam){
//            each.getEmployeeInfo();
//            System.out.println("==============================");
//        }
        List<ScrumTeamTesters> teamTesters = new ArrayList<>();
        teamTesters.addAll(Arrays.asList(t1,t2,t3));
        for (ScrumTeamTesters eachTester: teamTesters){
            eachTester.getEmployeeInfo();
            System.out.println("===============================");
        }

        ScrumTeamDevelopers d1 = new ScrumTeamDevelopers("Ayse", 150000);
        d1.getEmployeeInfo();

        ScrumTeamDevelopers d2 = new ScrumTeamDevelopers("Emel", 150005);
        ScrumTeamDevelopers d3 = new ScrumTeamDevelopers("Yusuf", 150010);

        List<ScrumTeamDevelopers> developersTeam = new ArrayList<>();
        developersTeam.addAll(Arrays.asList(d1,d2,d3));
        for ( ScrumTeamDevelopers eachDevelopers: developersTeam){
            eachDevelopers.fixingBug();
        }

        List<ScrumTeam>scrum = new ArrayList<>();
        scrum.addAll(teamTesters);
        scrum.addAll(developersTeam);
        for ( ScrumTeam eachTeam : scrum){
            eachTeam.getEmployeeInfo();
            System.out.println("=======================");
        }




   }
}
