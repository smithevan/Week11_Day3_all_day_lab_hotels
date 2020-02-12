import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

//    public Bedroom(String roomNumber, int capacity, String type) {
//        this.roomNumber = roomNumber;
//        this.capacity = capacity;
//        this.type = type;
//        this.guest = new ArrayList<Guest>();
//    }

}
