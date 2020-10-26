/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 8/1/2020
 *   Time: 12:34 PM
 *   File: Lab4Task.java
 */

package course.lab.labTasks.lab4;

import java.util.Scanner;

public class Lab4Task {
    // This is the total number of participants allowed in the conference.
    // DO NOT CHANGE/REMOVE THIS CODE.
    private static final byte TOTAL_PARTICIPANTS = 100;
    ;

    // This method will sell the ticket to the participant.
    // DO NOT CHANGE/REMOVE THIS CODE.
    private static void sellTicket(String participantName) {
        String message = "Congratulations, " + participantName + ". " +
                "See you at the conference!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        Byte numberOfTickets = 0;
        while (numberOfTickets <= TOTAL_PARTICIPANTS) {
            int leftTickets = TOTAL_PARTICIPANTS - numberOfTickets;
            System.out.println("Total Tickets Left:" + leftTickets);
            System.out.println("Enter your name:");
            Scanner scannerObject = new Scanner(System.in);
            String participantName = scannerObject.nextLine();
            sellTicket(participantName);
            numberOfTickets++;
            if (numberOfTickets.equals(TOTAL_PARTICIPANTS)) {
                System.out.println("Sorry, The tickets are sold-out!");
                break;
            }
        }
    }
}
