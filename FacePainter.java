import org.code.neighborhood.*;

public class FacePainter extends PainterPlus{

  /*paints the penguins eyes*/
  public void paintEyes(String color) {
    setPaint(2);
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    paint(color);
    turnLeft();
    move();
    move();
    move();
    paint(color);
  }
  /*paints the penguins beak/mouth*/
    public void paintMouth(String color) {
      setPaint(2);
      turnRight();
      move();
      turnRight();
      move();
      paint(color);
      move();
      paint(color);
      
      }
    
  }


