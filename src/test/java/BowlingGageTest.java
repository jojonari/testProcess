import org.junit.Before;
import org.junit.Test;

/**
 * Stairstep TEST
 */
public class BowlingGageTest {

    private Game game;

    @Before
    public void canCreateGame() throws Exception {
        game = new Game();
    }

    @Test
    public void canRoll() throws Exception {
        game.roll();
    }
}
