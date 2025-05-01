package Ticket;

import java.time.LocalDate;

public class Discounted extends Tariff {

    protected Discounted() {
        super();
    }

    protected Discounted(boolean isDiscounted) {
        super(isDiscounted);
    }

    protected Discounted(boolean isDiscounted, LocalDate date) {
        super(date, isDiscounted);
    }
}
