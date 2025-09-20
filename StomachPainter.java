import org.code.neighborhood.*;
public class StomachPainter extends PainterPlus {
  /*Piants the penguins stomach white*/
  
    public void paintStomach(String color) {
  move();
  move();
  move();
  move();
  turnRight();
  moveFast();
  turnAround();
  move();
  setPaint(4);
 while (hasPaint()) {
      move();
      turnRight();
      paint(color);
    }
  setPaint(4);
  turnRight();
  move();
  move();
  turnLeft();
 while (hasPaint()) {
      move();
      turnRight();
      paint(color);
    }

  setPaint(4);
  turnRight();
  move();
  turnLeft();
  move();
  move();
  turnLeft();
  while(hasPaint()){
    paint(color);
      move();
  }

      
    }
  /*Paints the penguins feet orange*/

  public void paintToes(String color) {
    setPaint(2);
    turnLeft();
    move();
    move();
    turnLeft();
    move();
    paint(color);
    move();
    move();
    move();
    paint(color);
    
    
  }
  }
