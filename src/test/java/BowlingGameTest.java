import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rodrigo on 6/1/18.
 */
public class BowlingGameTest {
    @Test
    public void testGutterGame() {
        Game g = new Game();
        for (int i=0; i<20; i++) {
            g.roll(20);
        }
        assertEquals(0 ,g.score());

    }
}
