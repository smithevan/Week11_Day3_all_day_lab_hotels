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

}
