import java.util.ArrayList;

public class ConferenceRoom {

    private String roomName;
    private int capacity;
    private ArrayList<Guest> guest;

    public ConferenceRoom(String roomName, int capacity) {
        this.roomName = roomName;
        this.capacity = capacity;
        this.guest = new ArrayList<Guest>();
    }


    public String getName() {
        return this.roomName;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
