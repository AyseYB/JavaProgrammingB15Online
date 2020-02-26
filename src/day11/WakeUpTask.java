package day11;

import javax.swing.*;

public class WakeUpTask {

    public static void main(String[] args) {

        String targetOption = "bd";
        String bedroom = "bd";
        String livingRoom = "lr";
        String kitchen = "ki";
        String hallway = " ha";

        switch (targetOption) {
            case "bd":
                System.out.println(" turn on the light in the bedroom");
                break;
            case "lr":
                System.out.println("turn on the light in the living room");
                break;
            case "ki":
                System.out.println("turn on the light in kitchen");
                break;
            case "ha":
                System.out.println("turn on the light in the hallway");
                break;
            default:
                System.out.println(" there is no other option !!");

        }
        String targetOption2 = "ha";
        if (targetOption2 == "bd") {
            System.out.println(" turn on light in the bedroom");
        } else if (targetOption2 == " li") {
            System.out.println(" turn on the lights in the living room");
        } else if (targetOption2 == " ki") {
            System.out.println(" turn on the lights in the kithen");
        } else if (targetOption2 == "ha") {
            System.out.println(" turn on the lights in the hallway");
        } else {
            System.out.println("there is no other option");
        }


    }
}

