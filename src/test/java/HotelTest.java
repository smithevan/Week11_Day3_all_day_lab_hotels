import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private Bedroom bedroom4;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private ConferenceRoom conferenceRoom3;
    private ConferenceRoom conferenceRoom4;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;


    @Before
    public void before() {

        bedroom1 = new Bedroom("100", "Single");
        bedroom2 = new Bedroom("200", "Double");
        bedroom3 = new Bedroom("300","Double");
        bedroom4 = new Bedroom("400", "Single");
        conferenceRoom1 = new ConferenceRoom("Small Meeting Room", 20);
        conferenceRoom2 = new ConferenceRoom("Medium Meeting Room", 40);
        conferenceRoom3 = new ConferenceRoom("Large Meeting Room", 60);
        conferenceRoom4 = new ConferenceRoom("Grand Hall", 200);

        ArrayList<Bedroom> bedrooms = new ArrayList<Bedroom>();
        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<ConferenceRoom>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);
        bedrooms.add(bedroom4);
        conferenceRooms.add(conferenceRoom1);
        conferenceRooms.add(conferenceRoom2);
        conferenceRooms.add(conferenceRoom3);
        conferenceRooms.add(conferenceRoom4);

        hotel = new Hotel(bedrooms, conferenceRooms);

    }

    @Test
    public void hotelStartsWithBedrooms() {
        assertEquals(4, hotel.bedroomCount());
    }

    @Test
    public void hotelStartsWithConferenceRooms(){
        assertEquals(4, hotel.conferenceRoomCount());
    }

    @Test
    public void testHotelCanCheckInGuestsToBedrooms(){
        hotel.checkInBedroom(bedroom1, guest1);
        assertEquals(1, bedroom1.occupancy());
    }

    @Test
    public void testHotelCanCheckInGuestsToConferenceRoom(){
        hotel.checkInConferenceRoom(conferenceRoom1, guest1);
        assertEquals(1, conferenceRoom1.occupancy());
    }

    @Test
    public void testThatGuestCheckedInIsExactGuest(){
        hotel.checkInBedroom(bedroom1, guest1);
        assertEquals(guest1, bedroom1.guestCheck());
    }

    @Test
    public void testHotelCanCheckGuestsOutOfBedroom() {
        hotel.checkInBedroom(bedroom1, guest1);
        hotel.checkOutBedroom(bedroom1, guest1);
        assertEquals(0, bedroom1.occupancy());
    }

    @Test
    public void testHotelCanCheckGuestsOutOfConferenceRoom(){
        hotel.checkInConferenceRoom(conferenceRoom1, guest1);
        hotel.checkOutConferenceRoom(conferenceRoom1, guest1);
        assertEquals(0, conferenceRoom1.occupancy());
    }

    @Test
    public void hotelCanBookRoom(){
        Booking newBooking = hotel.bookRoom(bedroom1, guest1, 3);
        assertEquals(bedroom1, newBooking.getBedroom());
    }

}
