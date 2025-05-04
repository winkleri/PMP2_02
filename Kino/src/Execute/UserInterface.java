package Execute;

import java.time.LocalDateTime;
import java.util.*;
import Cinema.Screening;
import Cinema.Movie;

public class UserInterface {
    private final Scanner sc;
    private final UserManager um;
    private Map<LocalDateTime, Screening> moviesShown;
    HashMap<String, Movie> movies;

    public UserInterface(Scanner sc, Map<LocalDateTime, Screening> moviesShown, HashMap<String, Movie> movies) {
        this.sc = sc;
        this.um = new UserManager(sc, movies, moviesShown);
        this.moviesShown = moviesShown;
        this.movies = movies;
    }

    public void start() {
        LocalDateTime dateAndTime;
        System.out.println("Enter the date/time that is relevant for you (Format: YYYY-MM-dd HH:mm or 'today')");
        String input = "";
            input = sc.nextLine();

        if(input.equalsIgnoreCase("today")) dateAndTime = LocalDateTime.now();

        while (true) {

            System.out.println("Enter a number to proceed:");
            System.out.println("0 - Stops the program");
            System.out.println("1 - Booking and payment");
            System.out.println("2 - Listing all available movies and tariffs");
            System.out.println("3 - Listing all available screenings from a certain date");
            System.out.println("4 - Listing all available screenings from a certain auditorium");

            int num = 0;
            try {
                num = sc.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Please only enter valid numbers.");
            }

            switch(num) {
                case 0 : break;
                case 1 : um.startBooking();
                case 2 : um.listAll();
                case 3 : um.listDate();
                case 4 : um.listRoom();
            }

        }
    }
}
