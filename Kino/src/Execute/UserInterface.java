package Execute;

import Entertainment.Manage;
import Ticket.Booking;

import java.time.LocalDateTime;
import java.util.*;

public class UserInterface {
    private Scanner sc;
    private Booking bk;

    public UserInterface() {
        this.sc = new Scanner(System.in);
        this.bk = new Booking();
    }

    public void start() {
        LocalDateTime dateAndTime;
        System.out.println("Enter the date/time that is relevant for you (Format: YYYY-MM-DD HH:MM)");
        String input = sc.nextLine();

        while (true) {

            System.out.println("Enter a number to proceed:");
            System.out.println("0 - Stops the program");
            System.out.println("1 - Booking and payment");
            System.out.println("2 - Listing all available movies");

            int input = 0;
            try {
                input = sc.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Please only enter valid numbers.");
            }

            switch(input) {
                case 0 : break;
                case 1 : this.booking();
                    System.out.println("hello world!");//
                case 2 : //
            }
        }
    }

    //TODO Methode komplett überarbeiten
    private void booking() {
        System.out.println("Welcome to the booking section!");
        System.out.println("Select a movie based on the abbreviations shown in the list");
        String abbreviation = sc.nextLine();
        bk.book();
    }
}
