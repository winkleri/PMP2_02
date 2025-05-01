package Ticket;
import Entertainment.Movie;
import Entertainment.Screening;



public class Ticket {
    private Screening screening;
    private Tariff tariff;
    private double price;

    public Ticket(Screening screening, Tariff tariff) {
        this.screening = screening;
        this.tariff = tariff;
    }

    //TODO Preisgestaltung flexibel gestalten -> Parameter legt fest wie teuer
    public double createPrice(Tariff tariff) {
        double price;
        if(tariff instanceof Discounted) {
            return price = 14.99;
        } else if(tariff instanceof Regular) {
            return price = 19.99;
        } else return price = 0.0;
    }

    public String toString() {
        String tmpName = this.screening.getMovie().getName();
        int tmpDuration = this.screening.getMovie().getDuration();
        return "The movie called " + tmpName + " runs on the " + screening.getDate() + " at " + screening.getTime() + ". The total duration is " + tmpDuration + " minutes and it's shown in auditorium " + screening.getRoom() + ". The ticket has the following tariff: " + tariff.getClass() + " and costs " + this.createPrice(tariff);
    }
}
