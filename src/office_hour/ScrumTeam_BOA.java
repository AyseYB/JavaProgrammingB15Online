package office_hour;

public class ScrumTeam_BOA {

    public static void main(String[] args) {

        ScrumTeam_BA b1 = new ScrumTeam_BA("Huriye",156000);
        b1.getEmployeeInfo();

        ScrumTeam_BA b2 = new ScrumTeam_BA("Nuriye", 500000);
        b2.getEmployeeInfo();

        ScrumTeamTesters t1 = new ScrumTeamTesters("Serife"," QA", 100000);
        ScrumTeamTesters t2 = new ScrumTeamTesters("Gunel", "Manual Tester", 130000);
        ScrumTeamTesters t3 = new ScrumTeamTesters("Rukiye", "SDET", 120000);

        ScrumTeamTesters[] Testers = {t1, t2, t3};
        ScrumTeam_BA[] BATeam = {b1, b2};

        ScrumTeam[][] scrum = {Testers, BATeam};

        for ( ScrumTeam[] eachArray : scrum){
            for(  ScrumTeam eachMember : eachArray){
                eachMember.getEmployeeInfo();
            }

        }
    }
}
