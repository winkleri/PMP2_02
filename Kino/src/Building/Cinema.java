package Building;

import Entertainment.Screening;

import java.time.LocalDateTime;
import java.util.*;

public class Cinema {
    private Room[] rooms;
    private Room first;
    private Room second;
    private Map<Room, Map<LocalDateTime, Screening>> program = new TreeMap<>();

    public Cinema() {
        this.rooms = new Room[2];
        this.first = new Room();
        this.second = new Room();
    }

    public void buildRooms() {
        rooms[0] = first;
        rooms[1] = second;
    }

    public Room getFirst() {
        return first;
    }

    public Room getSecond() {
        return second;
    }

}
