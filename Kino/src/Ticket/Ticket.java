package Ticket;
import Cinema.Screening;
import Cinema.Weekday;
import java.time.LocalDateTime;


public class Ticket {
    private Screening screening;
    private Tariff tariff;
    private double price;
    private Weekday weekday;
    private LocalDateTime dateTime;

    public Ticket(Screening screening, Tariff tariff) {
        this.screening = screening;
        this.tariff = tariff;
    }

    public double createPrice(Tariff tariff) {
        return 0.0;
    }

    public void calculateDiscount() {
        if(weekday == Weekday.THURSDAY) {
            price *= 0.75;
        } else {
            System.out.println("No discounts today!");
        }
    }

    public String toString() {
        String tmpName = this.screening.getMovie().getName();
        int tmpDuration = this.screening.getMovie().getDuration();
        return "The movie called " + tmpName + " runs on the " + screening.getDate() + " at " + screening.getTime() + ". The total duration is " + tmpDuration + " minutes and it's shown in auditorium " + screening.getRoom() + ". The ticket has the following tariff: " + tariff.getClass() + " and costs " + this.createPrice(tariff);
    }
}
