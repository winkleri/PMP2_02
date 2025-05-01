package Execute;

import java.util.*;

import Entertainment.Manage;
import Entertainment.Movie;
import Entertainment.Screening;


public class AdminInterface {
    private Scanner sc;
    private Manage mg;

    public AdminInterface() {
        this.sc = new Scanner(System.in);
        this.mg = new Manage(sc);
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
                case 1 : mg.addMovie();
                case 2 : mg.addScreening();
                case 3 : mg.removeMovie();
            }
        }
    }




}


