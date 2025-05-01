package Entertainment;
import java.util.*;
import java.time.LocalDateTime;

public class Manage {
        private Map<LocalDateTime, Screening> moviesShown = new TreeMap<>();
        private HashMap<String, Movie> movies = new HashMap<>();
        private Scanner sc = new Scanner(System.in);

        public Manage(Scanner sc) {
                this.sc = sc;
        }

        //TODO DONE
        public void addMovie() {
                System.out.println("Enter the name of the movie");
                String name = sc.nextLine();
                System.out.println("Enter the abbreviation used to book the movie");
                String nickname = sc.nextLine();
                System.out.println("Enter the total duration (please only numbers)");
                int duration = Integer.parseInt(sc.nextLine());
                Movie movie = new Movie(name, nickname, duration);
                movies.put(nickname, movie);
        }

        //TODO DONE
        public void removeMovie() {
                Set<String> movieSet = movies.keySet();
                System.out.println("Enter the nickname of the movie you want to remove");
                String nickname = sc.nextLine();
                if(movieSet.equals(nickname)) {
                        Movie removedMovie = movies.get(nickname);
                        movies.remove(nickname, removedMovie);
                }
        }
        public void addScreening() {
                Screening screening = createScreening(sc, movies);

        }

        //TODO REWORK ENTIRE METHOD
        public static Screening createScreening(Scanner sc, HashMap<String, Movie> movies) {
                //Movie of Screening
                System.out.println("Enter the abbreviation of the movie you want to use for this screening");
                String input = sc.nextLine();
                for(Movie candidate : movies.values()) {
                        if(candidate.getNickname().equals(input)) {
                                Movie movie = candidate;
                        } else throw new IllegalArgumentException("No such nickname available for movie selection. For reference check the print of movies in the UI");
                }

                //Auditorium of Screening
                System.out.println("Which auditorium is the movie? (1/2)");
                int num = 0;
                try {
                        num = sc.nextInt();
                        sc.nextLine();
                } catch(InputMismatchException e) {
                        System.out.println("Invalid input. Please only enter integer values");
                } finally {
                        if(num != 0 || num > 2) throw new IllegalArgumentException("Invalid input. Enter either a one or a two");
                }

                //TODO Date and Time of Screening
                return null;
        }
}
