package Execute;

import Ticket.Ticket;
import Cinema.Screening;
import Cinema.Movie;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserManager {
    private final Scanner sc;
    private final DateTimeFormatter formatter;
    private HashMap<String, Movie> movies;
    private Map<LocalDateTime, Screening> moviesShown;

    public UserManager(Scanner sc, HashMap<String, Movie> movies, Map<LocalDateTime, Screening> moviesShown) {
        this.sc = sc;
        this.formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        this.movies = movies;
        this.moviesShown = moviesShown;
    }
/* Ilja Book Methode von 04.05.25
    public Ticket book() {
        System.out.println("You have entered the booking section, is that correct? (Y/N)");
        String answer = sc.nextLine();
        if(answer.equalsIgnoreCase("Y")) {
            LocalDateTime dateTime = null;
            System.out.println("Great!");
            while(dateTime == null) {
                System.out.println("Enter the date that you wish to book a ticket for");
                System.out.println("Format: DD/MM/YYYY HH:mm");
                String tmpDateTime = sc.nextLine();
                try {
                    dateTime = LocalDateTime.parse(tmpDateTime, formatter);
                } catch (DateTimeParseException e) {
                    e.printStackTrace();
                    System.out.println("The date and time you entered contained invalid characters. Please try again and stick exactly to the format!");
                }
            }
            Cinema.getMoviesShown() {

            }
        }
        if(answer.equalsIgnoreCase("N")) {
            return null;
        }
        else System.out.println("Invalid input! Enter Y/N");
    } */



    public void listAll() {

    }

    public void listDate(){

    }

    public void listRoom() {

    }

    public Ticket book(String abbreviation) {
        for(Map.Entry<LocalDateTime, Screening> entry:moviesShown.entrySet()){
            System.out.printf("%s \n", entry.getValue());
        }

        return null;
    }

    public void startBooking() {
        System.out.println("Welcome to the booking section!");
        System.out.println("Choose time");
        System.out.println("format?");
        sc.nextLine();
        String chosenMonth = sc.nextLine();
        System.out.println("Select a movie based on the abbreviations shown in the list");
//        for(HashMap.Entry<String, Movie> entry:movies.entrySet()){
//            System.out.printf("%s \n", entry.getValue());
//        }
        for(Map.Entry<LocalDateTime, Screening> entry:moviesShown.entrySet()){
            System.out.printf("%s \n", entry.getValue());
        }

        String abbreviation = sc.nextLine();
        this.book(abbreviation);
        System.out.println("Select a payment method: \n 0: cancel \n 1: pay");
        String paymentMethod = sc.nextLine();
        switch (paymentMethod) {
            case "0":
                break;
            case "1":
                System.out.println("type in your creditcard information");
                String input = sc.nextLine();
                break;
        }
    }
}

