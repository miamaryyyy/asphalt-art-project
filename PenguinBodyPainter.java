import org.code.neighborhood.*;
public class PenguinBodyPainter extends PainterPlus {

  /*paints the outline of the penguins body*/
   public void paintOutline(String color) {
    turnRight();
    move();
    turnLeft();
    setPaint(6);
    move();
    move();
    
  while (hasPaint()) {
    move();
    paint(color);
    }
  move();
  turnRight();
  setPaint(8);

    while (hasPaint()) {
    move();
    paint(color);
    }
    move();
    turnRight();
    setPaint(6);

     while (hasPaint()) {
    move();
    paint(color);
    }

    move();
    turnRight();
    setPaint(8);

    while (hasPaint()) {
    move();
    paint(color);
    }

  
}
}
