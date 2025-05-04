package Execute;
import Cinema.Movie;
import Cinema.Screening;
import Cinema.Cinema;

import java.util.*;
import java.time.LocalDateTime;

public class AdminManager {
    private Map<LocalDateTime, Screening> moviesShown;
    private HashMap<String, Movie> movies;
    private final Scanner sc;

    public AdminManager(Scanner sc, Map<LocalDateTime, Screening> moviesShown, HashMap<String, Movie> movies) {
        this.sc = sc;
        this.movies = movies;
        this.moviesShown = moviesShown;
    }


    public void addMovie(HashMap<String, Movie> movies) {
        System.out.println("Enter the name of the movie:");
        String name = sc.nextLine();
        System.out.println("Enter the abbreviation used to book the movie:");
        String nickname = sc.nextLine();
        System.out.println("Enter the total duration (please only numbers)");
        int duration = Integer.parseInt(sc.nextLine());
        Movie movie = new Movie(name, nickname, duration);
        movies.put(nickname, movie);


        for(HashMap.Entry<String, Movie> entry:movies.entrySet()){
            System.out.printf("%s, %s \n", entry.getKey(), entry.getValue());
        }
    }
    
    public void removeMovie() {
        Set<String> movieSet = movies.keySet();
        System.out.println("Enter the nickname of the movie you want to remove");
        String nickname = sc.nextLine();
        if(movieSet.equals(nickname)) {
            Movie removedMovie = movies.get(nickname);
            movies.remove(nickname, removedMovie);
        }
    }
    public void addScreening(Scanner sc, HashMap<String, Movie> movies, Map<LocalDateTime, Screening> moviesShown) {
        Screening screening = createScreening(sc, movies, moviesShown);
    }

    public Screening createScreening(Scanner sc, HashMap<String, Movie> movies, Map<LocalDateTime, Screening> moviesShown) {
        //Movie of Screening
        System.out.println("Enter the abbreviation of the movie you want to use for this screening");
        sc.nextLine();
        String input = sc.nextLine();
        Movie movie = null;
        for (Movie entry : movies.values()) {
            if (entry.getNickname().equals(input)) {
                movie = entry;
            } else
                throw new IllegalArgumentException("No such nickname available for movie selection. For reference check the print of movies in the UI");
        }

        //Auditorium of Screening
        System.out.println("Which auditorium is the movie? (1/2)");
        int num = 0;
        try {
            num = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please only enter integer values");
        } finally {
            if (num != 1 && num != 2)
                throw new IllegalArgumentException("Invalid input. Enter either a one or a two");
        }

        System.out.println("Select a Date and Time YYYY-MM-DDTHH:MM:SS");
        String dateAndTime = sc.nextLine();
//                sc.nextLine();
//                LocalDateTime dt = LocalDateTime.parse(dateAndTime);
        boolean tf = true;

        for (LocalDateTime entry : moviesShown.keySet()) {
            String dt = String.valueOf(entry);
            String dt15 = String.valueOf(entry.plusMinutes(15));
            if (dt.equals(dateAndTime) || dt15.equals(dateAndTime)) {
                tf = false;
            }
        }
        LocalDateTime dt = LocalDateTime.parse(dateAndTime);

        LocalDateTime datetime = dt.plusMinutes(15);
        if (!tf) {
            datetime = dt.plusMinutes(15);
        }

        Screening screening = new Screening(movie,dateAndTime, Cinema.getFirst());
        moviesShown.put(datetime,screening);
        return screening;
    }

    //TODO
    public Screening removeScreening() {
        return null;
    }

    //TODO
    public void changePrices() {

    }

}
