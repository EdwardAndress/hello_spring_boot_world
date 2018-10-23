import org.junit.Assert;
import org.junit.Test;
import pac.package_with_my_controller.Rock;


public class RockTest {

    @Test
    public void losesVsPaper() {
        Rock subject = new Rock();
        String result = subject.paper();
        Assert.assertEquals("lose", result);
    }

    @Test
    public void drawsVsRock() {
        Rock subject = new Rock();
        String result = subject.rock();
        Assert.assertEquals("draw", result);
    }

    @Test
    public void winsVsScissors() {
        Rock subject = new Rock();
        String result = subject.scissors();
        Assert.assertEquals("win", result);
    }

    @Test
    public void drawsVsRockUsingVs() {
        Rock subject = new Rock();
        Rock opponentWeapon = new Rock();
        String result = subject.vs(opponentWeapon);
        Assert.assertEquals("draw", result);
    }
}
