package office_hour;

public class ScrumTeam_BA extends ScrumTeam{

        /*
    inherited features:
            employeeName, jobTitle, salary
            getEmployeeInfo
     */
        public ScrumTeam_BA(String employeeName, double salary){
            this.jobTitle = "Business Analyst";
            this.employeeName= employeeName;
            this.salary= salary;

        }


    @Override
    public void demo() {
        System.out.println("Business Analyst" + this.employeeName);
    }

    @Override
    public void dailyStandUp() {
        System.out.println("Business Analyst " + this.employeeName);
    }
    public void gatherRequ(){
        System.out.println("Business Analyst " + this.employeeName +  " is gathering the requiremnts");
    }
}
