package Cinema;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Screening {
    private Movie movie;
    private Room room;
    private LocalDateTime dateTime;
    private DateTimeFormatter dtf;

    public Screening(Movie movie, Room room, LocalDateTime dateTime) {
        this.movie = movie;
        this.room = room;
        this.dateTime = dateTime;
        this.dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
    }

    public Movie getMovie() {
        return this.movie;
    }

    public Room getRoom() {
        return this.room;
    }

    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    @Override
    public String toString() {
        return movie + ":  Kinosaal " + room + "  [" + dtf.format(dateTime) + "]";
    }
}