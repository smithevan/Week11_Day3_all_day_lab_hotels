import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }


    public int conferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public void checkInBedroom(Bedroom bedroom1, Guest guest1) {
        bedroom1.addGuest(guest1);
    }

    public void checkInConferenceRoom(ConferenceRoom conferenceRoom1, Guest guest1) {
        conferenceRoom1.addGuest(guest1);
    }

    public void checkOutBedroom(Bedroom bedroom1, Guest guest1) {
        bedroom1.removeGuest(guest1);
    }

    public void checkOutConferenceRoom(ConferenceRoom conferenceRoom1, Guest guest1) {
        conferenceRoom1.removeGuest(guest1);
    }
}
