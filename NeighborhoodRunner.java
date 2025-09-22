import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

  BackgroundPainter mia = new BackgroundPainter();
  PenguinBodyPainter mary = new PenguinBodyPainter();
  PenguinArmPainter k = new PenguinArmPainter();
  StomachPainter h = new StomachPainter();
  FacePainter f = new FacePainter();

  /*paints the background pink*/
    
    mia.setPaint(1000);
    mia.paintBackground("pink");

  //makes the outline of the penguins body
    
    mary.paintOutline("black");
    
  /*paints the penguins arms*/
    k.paintArms("black");
 
    //paints the penguins stomach
    h.paintStomach("white");
    
  /*paints penguins toes*/
    h.paintToes("orange");

  //paints the eyes and the mouth
    f.paintEyes("white");
    f.paintMouth("orange");
  }
}