package office_hour;

public class ScrumTeamTesters extends ScrumTeam {
     /*
    inherited features:
            variables: employeeName, jobTitle, salary
            methods: getEmployeeInfo()
     */
     public ScrumTeamTesters(String employeeName, String jobTitle, double salary ){
         this.employeeName = employeeName;
         this.jobTitle = jobTitle;
         this.salary = salary;
     }

    @Override
    public void demo(){
        System.out.println("Tester " + this.employeeName + "is doing demo");
    }
    public void dailyStandUp(){
        System.out.println("Tester " + this.employeeName + " is attending");
    }

    public void foundBug(){
        System.out.println("Tester " + this.employeeName + " reported a bug ");
    }


}
