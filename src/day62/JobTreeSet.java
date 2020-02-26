package day62;

import day61.Job;

import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {

    public static void main(String[] args) {

        // create a sortedSet  of job with TreeSet implementation
        //add 5 jobs and print them out vertically and see what you get

        SortedSet<Job> jobs= new TreeSet<>();
        jobs.add(new Job("FL", 120000, "AT&T"));
        jobs.add(new Job("LA", 130000, "BBC"));
        jobs.add(new Job("TX", 150000, "Apple"));
        jobs.add(new Job("CA", 100000, "Amazon"));
        jobs.add(new Job("VA", 110000, "USPTO"));

        for (Job each : jobs){
            System.out.println("each = " + each);
        }

        // how does hash set decide 5 person object is duplicate

    }
}
