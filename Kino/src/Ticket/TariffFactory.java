package Ticket;

import java.time.LocalDate;

public class TariffFactory {
    public static Tariff createTarif(String type) {
        return switch(type.trim().toUpperCase()) {
            case "REGULAR" -> new Regular(false);
            case "DISCOUNTED" -> new Discounted(true);
            default -> throw new IllegalArgumentException();
        };
    }

    public static Tariff createTarif(String type, LocalDate date) {
        return switch(type.trim().toUpperCase()) {
            case "REGULAR" -> new Regular(false, date);
            case "DISCOUNTED" -> new Discounted(true, date);
            default -> throw new IllegalArgumentException();
        };
    }
}
