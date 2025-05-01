package Ticket;

import java.time.LocalDate;

public class Regular extends Tariff {

    protected Regular() {
        super();
    }

    protected Regular(boolean isDiscounted) {
        super(isDiscounted);
    }

    protected Regular(boolean isDiscounted, LocalDate date) {
        super(date, isDiscounted);
    }
}
