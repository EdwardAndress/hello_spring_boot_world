import org.junit.Test;
import pac.package_with_my_controller.Game;
import pac.package_with_my_controller.Rock;

import static org.junit.Assert.assertEquals;

public class GameTest {

    @Test
    public void checksNumIsDivisibleByThree() {
        Game game = new Game();
        Rock playerChoice = new Rock();
        String result = game.play("rock", "paper");
        assertEquals(result, "lose");
    }
}
