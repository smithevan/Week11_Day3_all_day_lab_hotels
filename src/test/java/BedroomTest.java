import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Guest guest1;
    private Guest guest2;
    private Bedroom bedroom1;

    @Before
    public void Setup() {
        guest1 = new Guest("Bob");
        guest2 = new Guest("Mike");
        bedroom1 = new Bedroom("222", 1, "Double");
    }

    @Test
    public void getRoomNumber() {
        assertEquals("222", bedroom1.getRoomNumber());
    }

    @Test
    public void getCapacity() {
        assertEquals(1, bedroom1.getCapacity());
    }

    @Test
    public void getType() {
        assertEquals("Double", bedroom1.getType());
    }

    @Test
    public void testGuestArrayStartsAtZero() {
        assertEquals(0, bedroom1.occupancy());
    }

    @Test
    public void testCanAddGuestsToBedRoom() {
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.occupancy());
    }

    @Test
    public void testCanRemoveGuestFromBedroom() {
        bedroom1.addGuest(guest1);
        bedroom1.removeGuest(guest1);
        assertEquals(0, bedroom1.occupancy());
    }

    @Test
    public void testGuestCannotBeAddedToRoomIfFull() {
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        assertEquals(1, bedroom1.occupancy());
    }

}
