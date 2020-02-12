import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class GuestTest {


    private Guest guest1;

    @Before
    public void Setup() {
        guest1 = new Guest("Bob");
    }

    @Test
    public void getName() {
        assertEquals("Bob", guest1.getName());
    }



}
