import Execute.AdminInterface;
import Execute.UserInterface;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInterface user = new UserInterface();
        AdminInterface admin = new AdminInterface();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Welcome!\n" + "This is our movie manager, where you get to do lots of fun stuff :-) \n");
        LocalDate date = LocalDate.now();
        System.out.println(date.getDayOfWeek());
        while(true) {
            System.out.println("Do you wish to continue? (Y/N)");
            String input = scanner.nextLine();
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