import java.util.ArrayList;

public class Bedroom {

//    private String name;
//
//    public Guest(String name) {
//        this.name = name;
//    }

    private String roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> guests;

    public Bedroom(String roomNumber, int capacity, String type) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
    }


    public String getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getType() {
        return this.type;
    }

    public int occupancy() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        if (capacity > guests.size())
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest1) {
        this.guests.remove(guest1);
    }

    public Guest guestCheck() {
        for (int i=1; i< guests.size(); i++){
            return guests.get(i);
        }
        return null;
    }
}
