import org.junit.Assert;
import org.junit.Test;
import pac.package_with_my_controller.Paper;
import pac.package_with_my_controller.Rock;
import pac.package_with_my_controller.Scissors;

public class PaperTest {

    @Test
    public void drawsVsPaper() {
        Paper subject = new Paper();
        Paper opponent = new Paper();
        String result = subject.vs(opponent);
        Assert.assertEquals("draw", result);
    }

    @Test
    public void winsVsRock() {
        Paper subject = new Paper();
        Rock opponent = new Rock();
        String result = subject.vs(opponent);
        Assert.assertEquals("win", result);
    }

    @Test
    public void losesVsScissors() {
        Paper subject = new Paper();
        Scissors opponent = new Scissors();
        String result = subject.vs(opponent);
        Assert.assertEquals("lose", result);
    }
}