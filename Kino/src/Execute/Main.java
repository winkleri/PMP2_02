package Execute;

import Cinema.Cinema;
import Cinema.Movie;
import Cinema.Screening;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    Cinema cinema = new Cinema();

    public Cinema getCinema() {
        return cinema;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<LocalDateTime, Screening> moviesShown = new TreeMap<>();
        HashMap<String, Movie> movies = new HashMap<>();
        UserInterface user = new UserInterface(sc);
        AdminInterface admin = new AdminInterface(sc, moviesShown, movies);

        Movie movie1 = new Movie("A Minecraft Movie", "MC", 2);
        movies.put("MC", movie1);
        Movie movie2 = new Movie("Mufasa: The Lion King", "MLK", 2);
        movies.put("MLK", movie2);
        Movie movie3 = new Movie("Captain America: Brave New World", "CA", 2);
        movies.put("CA", movie3);
        Movie movie4 = new Movie("Wicked", "W", 1);
        movies.put("W", movie4);
        Movie movie5 = new Movie("Shrek 5", "SH", 1);
        movies.put("SH", movie5);

        System.out.printf("Welcome!\n" + "This is our movie manager, where you get to do lots of fun stuff :-) \n");
        LocalDate date = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(dtf.format(date));
        //Program loop
        while(true) {
            System.out.println("Do you wish to continue? (Y/N)");
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("n")) {
                break;
            } else if(input.equalsIgnoreCase("y")) {
                user.start();
            } else if(input.equals("1337")) {
                admin.start();
            }
            else {
                System.out.printf("Sorry. None of the available commands were used, please try again\n" + "Hint: Y stands for Yes and N stands for No. Enter only single digits\n");
            }
        }
    }
}