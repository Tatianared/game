import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Game;
import ru.netology.domain.Player;

public class GameTest {

    Game game = new Game();

    @Test
    public void shouldStrong() {
        Player playerName1 = new Player(11, "Pit", 25);
        Player playerName2 = new Player(55, "Hot", 34);

        String expected = ("Hot");
        int actual = game.round("Pit", "Hot");

        Assertions.assertEquals(expected, actual);
    }
}
