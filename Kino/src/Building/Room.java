package Building;

import java.util.*;
import Entertainment.Screening;

public class Room {
    private List<Screening> program;
    private int number;


    public Room() {
        program = new LinkedList<Screening>();
        this.number = number;
    }

    public List<Screening> getScreeningList() {
        return this.program;
    }

    public void setScreeningList(List<Screening> program) {
        this.program = program;
    }
}
