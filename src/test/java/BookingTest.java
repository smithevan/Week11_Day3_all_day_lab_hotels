import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking1;
    private Guest guest1;
    private Bedroom bedroom1;

    @Before
    public void Setup() {
        guest1 = new Guest("Bob");
        bedroom1 = new Bedroom("100", "Double");
        booking1 = new Booking(bedroom1, guest1, 3);
    }

    @Test
    public void canGetTotalBillForBooking() {
        assertEquals(120, booking1.getBill());
    }

}
