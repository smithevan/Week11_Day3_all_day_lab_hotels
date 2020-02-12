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
    private ArrayList<Guest> guest;

    public Bedroom(String roomNumber, int capacity, String type) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
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
}
