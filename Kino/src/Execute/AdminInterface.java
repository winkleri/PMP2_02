package Execute;

import java.time.LocalDateTime;
import java.util.*;
import Cinema.Cinema;
import Cinema.Screening;
import Cinema.Movie;


public class AdminInterface {
    private final Scanner sc;
    private final AdminManager am;
    private final Cinema cn;

    public AdminInterface(Scanner sc, Map<LocalDateTime, Screening> moviesShown, HashMap<String, Movie> movies) {
        this.sc = sc;
        this.am = new AdminManager(sc, moviesShown, movies);
        this.cn = cn;
    }

    public void start() {
        while (true) {
            System.out.println("Enter a number to proceed:");
            System.out.println("0 - Stops the program");
            System.out.println("1 - Add movie");
            System.out.println("2 - Add screening");
            System.out.println("3 - Remove movie");
            System.out.println("4 - Remove screening");
            System.out.println("5 - Change tariffs");

            int input = 0;
            try {
                input = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please only enter valid numbers.");
            }

            if(input == 0) break;
            switch(input) {
                case 1 :
                    am.addMovie(movies);
                    break;
                case 2 :
                    am.addScreening(sc, movies, moviesShown);
                    break;
                case 3 :
                    am.removeMovie();
                    break;
                case 4 :
                    am.removeScreening();
                    break;
                case 5 :
                    am.changePrices();
                    break;
            }
        }
    }




}


