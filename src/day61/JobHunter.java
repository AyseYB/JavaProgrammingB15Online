package day61;

import java.util.*;

public class JobHunter {

    public static void main(String[] args) {

       Job j1 = new Job("GA" , 120000, "BOFA");
       Job j2 = new Job("VA", 110000, "Amazon");
       Job j3 = new Job("VA", 150000, "Cybertek");

        System.out.println("j1.compareTo(j2) = " + j1.compareTo(j2));
        System.out.println("j2.compareTo(j3) = " + j2.compareTo(j3));

        List<Job> myFavoriteJobs= new LinkedList<>();
        myFavoriteJobs.add(new Job("GA", 120000, "BOFA"));
        myFavoriteJobs.add(new Job("VA", 110000, "Amazon"));
        myFavoriteJobs.add(new Job("NY", 140000, "Facebook"));
        myFavoriteJobs.add(new Job("CA", 150000, "Apple"));
        myFavoriteJobs.add(new Job("WA", 145000, "Microsoft"));

        System.out.println("myFavoriteJobs = " + myFavoriteJobs);
        Collections.sort(myFavoriteJobs);
        System.out.println("myFavoriteJobs = " + myFavoriteJobs);

        Collections.sort(myFavoriteJobs, Comparator.reverseOrder());
        System.out.println("myFavoriteJobs after 2 = " + myFavoriteJobs);

        Collections.sort(myFavoriteJobs, Collections.reverseOrder());
        System.out.println("myFavoriteJobs after 3 = " + myFavoriteJobs);





    }
}
