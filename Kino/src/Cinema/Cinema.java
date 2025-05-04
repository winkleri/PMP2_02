package Cinema;

import java.time.LocalDateTime;
import java.util.*;
import java.util.ArrayList;

public class Cinema {
    private Room[] rooms;
    private Room first;
    private Room second;
    private Map<ArrayList<Room>, Map<LocalDateTime, Screening>> program;

    public Cinema() {
        this.rooms = new Room[2];
        this.first = new Room();
        this.second = new Room();
        rooms[0] = first;
        rooms[1] = second;
        this.program = new HashMap<>();
    }

    public Room getFirst() {
        return first;
    }

    public Room getSecond() {
        return second;
    }

}
