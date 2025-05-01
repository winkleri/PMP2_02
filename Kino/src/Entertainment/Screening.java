package Entertainment;

import Building.Room;

import java.time.LocalDate;
import java.time.LocalTime;

public class Screening {
    private Movie movie;
    private Room room;
    private LocalDate date;
    private LocalTime time;

    public Screening(Movie movie, Room room, LocalDate date, LocalTime time) {
        this.movie = movie;
        this.room = room;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public Room getRoom() {
        return this.room;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public LocalTime getTime() {
        return this.time;
    }
}
