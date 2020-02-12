import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Guest guest1;
    private Guest guest2;
    private Bedroom bedroom1;
    private Bedroom bedroom2;

    @Before
    public void Setup() {
        guest1 = new Guest("Bob");
        guest2 = new Guest("Mike");
        bedroom1 = new Bedroom("222", "Double");
        bedroom2 = new Bedroom("278", "Single");
    }

    @Test
    public void getRoomNumber() {
        assertEquals("222", bedroom1.getRoomNumber());
    }

    @Test
    public void getCapacity() {
        assertEquals(2, bedroom1.getCapacity());
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
        bedroom1.addGuest(guest2);
        assertEquals(2, bedroom1.occupancy());
    }

    @Test
    public void canGetDifferentNightlyRateByType(){
        assertEquals(40, bedroom1.getNightlyRate());
        assertEquals(25, bedroom2.getNightlyRate());
    }


}
