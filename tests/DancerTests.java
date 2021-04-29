import org.junit.*;

public class DancerTests {
  

  @Test
  public void testAddSquare() {
    Square s = new Square(50,50,1000,1000,50,50, 50);
    int size = Main.world.size();
    Main.giveBirth(s);
    Assert.assertEquals(size + 1, Main.world.size());
  }

  @Test
  public void testAddBall() {
    Ball b = new Ball(50,50,1000,1000,50);
    int size = Main.world.size();
    Main.giveBirth(b);
    Assert.assertEquals(size + 1, Main.world.size());
  }

  @Test
  public void testRemoveSquare() {
    int size = Main.world.size();
    System.out.println(size);
    Square s = new Square(50, 50, 1000, 1000, 50, 50, 50);
    Main.giveBirth(s);
    Main.world.remove(Main.world.size() - 1);
    Assert.assertEquals(size, Main.world.size());
  }

  @Test
  public void testRemoveBall() {
    int size = Main.world.size();
    System.out.println(size);
    Ball b = new Ball(50, 50, 1000, 1000, 50);
    Main.giveBirth(b);
    Main.world.remove(Main.world.size() - 1);
    Assert.assertEquals(size, Main.world.size());
  }
}