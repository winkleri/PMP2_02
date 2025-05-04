package Ticket;

import java.time.LocalDate;

public class TariffFactory {
    public static Tariff createTarif(String type) {
        return switch(type.trim().toUpperCase()) {
            case "REGULAR" -> new Regular();
            case "DISCOUNTED" -> new Discounted();
            default -> throw new IllegalArgumentException();
        };
    }

    public static Tariff createTarif(String type, LocalDate date) {
        return switch(type.trim().toUpperCase()) {
            case "REGULAR" -> new Regular();
            case "DISCOUNTED" -> new Discounted();
            default -> throw new IllegalArgumentException();
        };
    }
}
