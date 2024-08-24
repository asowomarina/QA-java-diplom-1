package praktikum;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BunTest {
    private Bun bun;

    @Before
    public void createNewInstance() {
        bun = new Bun("original", 99.9f);
    }

    @Test
    public void getName() {
        String expected = "original";
        String actual = bun.getName();

        assertEquals("Incorrect values bun name", expected, actual);
    }

    @Test
    public void getPrice() {
        float expected = 99.9f;
        float actual = bun.getPrice();

        assertEquals("Incorrect values bun price", expected, actual, 0);
    }
}