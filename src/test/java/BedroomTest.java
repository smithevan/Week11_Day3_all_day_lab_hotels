import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Guest guest1;
    private Bedroom bedroom1;

    @Before
    public void Setup() {
        guest1 = new Guest("Bob");
        bedroom1 = new Bedroom("222", 2, "Double");
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

}
