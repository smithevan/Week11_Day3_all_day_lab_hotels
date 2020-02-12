import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;

    @Before
    public void Setup() {
        guest1 = new Guest("Bob");
        guest2 = new Guest("Mike");
        guest3 = new Guest("Abby");
        conferenceRoom1 = new ConferenceRoom("Meeting Room", 100);
        conferenceRoom2 = new ConferenceRoom("Small Room", 2);
    }

    @Test
    public void canGetConferenceRoomName() {
        assertEquals("Meeting Room", conferenceRoom1.getName());
    }

    @Test
    public void canGetConferenceRoomCapacity() {
        assertEquals(100, conferenceRoom1.getCapacity());
    }

    @Test
    public void testGuestArrayStartsAtZero() {
        assertEquals(0, conferenceRoom1.occupancy());
    }

    @Test
    public void canAddGuestToConferenceRoom() {
        conferenceRoom1.addGuest(guest1);
        assertEquals(1, conferenceRoom1.occupancy());
    }

    @Test
    public void canRemoveGuestFromConferenceRoom() {
        conferenceRoom1.addGuest(guest1);
        conferenceRoom1.removeGuest(guest1);
        assertEquals(0, conferenceRoom1.occupancy());
    }

    @Test
    public void testGuestsCannotBeAddedIfRoomIsFull(){
        conferenceRoom2.addGuest(guest1);
        conferenceRoom2.addGuest(guest2);
        conferenceRoom2.addGuest(guest3);
        assertEquals(2, conferenceRoom2.occupancy());
    }

}
