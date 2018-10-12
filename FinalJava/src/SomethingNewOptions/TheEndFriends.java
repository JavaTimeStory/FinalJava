package SomethingNewOptions;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.GradientPaint;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TheEndFriends extends JFrame {
  public TheEndFriends() {
    getContentPane().add(new DrawingCanvas());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 500);
    setVisible(true);
  }

  public static void main(String arg[]) {
    new TheEndFriends();
  }
}

class DrawingCanvas extends JPanel {
  Font font = new Font("Dialog", Font.ITALIC, 40);
  FontMetrics fontMetrics;
  
  DrawingCanvas() {
    setSize(700, 800);

    fontMetrics = getFontMetrics(font);
  }

  public void paint(Graphics g) {
    Graphics2D g2D = (Graphics2D) g;
    int w = getSize().width;
    int h = getSize().height;

    g2D.setFont(font);
    GradientPaint gp = new GradientPaint( 30.0f, 50.0f, Color.green,  fontMetrics.stringWidth("The End....Friends"), fontMetrics.getHeight(),Color.red);             
    g2D.setPaint(gp);
    g2D.drawString("The End....Friends", 2,200);                                                 


  }
}