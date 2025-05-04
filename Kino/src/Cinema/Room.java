package Cinema;

import java.time.LocalDateTime;
import java.util.*;

public class Room {
    private int number;
    private Map<LocalDateTime, Screening> screenings;


    public Room() {
        this.screenings = new TreeMap<LocalDateTime, Screening>();
        this.number = number;
    }

    public Map<LocalDateTime, Screening> getScreeningList() {
        return this.screenings;
    }

    public void setScreeningMap(TreeMap<LocalDateTime, Screening> program) {
        this.screenings = program;
    }
}
