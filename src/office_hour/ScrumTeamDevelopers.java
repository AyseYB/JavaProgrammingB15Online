package office_hour;

public class ScrumTeamDevelopers extends ScrumTeam {
   /*
    Inherited features:
                employeeName, jobTitle, salary
                getEmployeeInfo(
     */
   public ScrumTeamDevelopers(String employeeName,  double salary){
       jobTitle = "Software Developer";
       this.employeeName= employeeName;
       this.salary= salary;
   }

   @Override
   public void demo(){
       System.out.println("Developer " + this.employeeName + "is doing demo");
   }

   @Override
    public void dailyStandUp(){
       System.out.println("Developer " + this.employeeName + "attending the daily stand up");
   }

   public void fixingBug(){
       System.out.println("Developing " + this.employeeName + "is crying");
   }
}
