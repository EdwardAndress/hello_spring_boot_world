import org.junit.Assert;
import org.junit.Test;
import pac.package_with_my_controller.Paper;
import pac.package_with_my_controller.Rock;
import pac.package_with_my_controller.Scissors;

public class ScissorsTest {

    @Test
    public void losesVsRock() {
        Scissors subject = new Scissors();
        Rock opponent = new Rock();
        String result = subject.vs(opponent);
        Assert.assertEquals("lose", result);
    }

    @Test
    public void winsVsPaper() {
        Scissors subject = new Scissors();
        Paper opponent = new Paper();
        String result = subject.vs(opponent);
        Assert.assertEquals("win", result);
    }

    @Test
    public void drawsVsScissors() {
        Scissors subject = new Scissors();
        Scissors opponent = new Scissors();
        String result = subject.vs(opponent);
        Assert.assertEquals("draw", result);
    }
}
