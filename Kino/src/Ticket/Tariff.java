package Ticket;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public abstract class Tariff {
    private LocalDate date;
    //TODO Enum Wochentag
    private Weekday weekday;
    private double price;
    private Boolean isDiscounted;

    protected Tariff(LocalDate date, Boolean isDiscounted) {
        this.date = date;
        //this.weekday = date.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
        this.isDiscounted = isDiscounted;
    }

    protected Tariff(Boolean isDiscounted) {
        this.date = LocalDate.now();
       // this.weekday = date.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
        this.isDiscounted = isDiscounted;
    }


    protected Tariff() {
        this.date = LocalDate.now();
       // this.weekday = date.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
        this.isDiscounted = null;
    }

    public void reducePrice() {
        if(weekday == Weekday.THURSDAY) {
            price *= 0.75;
        }
    }
}
