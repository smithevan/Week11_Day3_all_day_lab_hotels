import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private Guest guest1;
    private ConferenceRoom conferenceRoom1;

    @Before
    public void Setup() {
        guest1 = new Guest("Bob");
        conferenceRoom1 = new ConferenceRoom("Meeting Room", 100);
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

}
