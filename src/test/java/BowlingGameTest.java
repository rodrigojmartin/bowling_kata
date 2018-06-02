import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rodrigo on 6/1/18.
 */
public class BowlingGameTest {
    private Game g;

    @Before
    public void setUp() {
        g = new Game();
    }

    @Test
    public void testGutterGame() {
        int n = 20;
        int pins = 0;
        for (int i=0; i<n; i++) {
            g.roll(pins);
        }
        assertEquals(0 ,g.score());

    }

    @Test
    public void testAllOnes() {
        for (int i=0; i<20; i++) {
            g.roll(1);
        }
        assertEquals(20 ,g.score());

    }
}
