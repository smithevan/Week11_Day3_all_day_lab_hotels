import java.util.ArrayList;

public class ConferenceRoom {

    private String roomName;
    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String roomName, int capacity) {
        this.roomName = roomName;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }


    public String getName() {
        return this.roomName;
    }

    public int getCapacity() {
        return this.capacity;
    }


    public int occupancy() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        if (this.capacity > guests.size())
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest1) {
        this.guests.remove(guest1);
    }
}
