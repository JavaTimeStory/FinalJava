package SomethingNewOptions;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.GradientPaint;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class YouLose extends JFrame {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public YouLose() {
    getContentPane().add(new SomethingNewOptions());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 500);
    setVisible(true);
  }

  public static void lose() {
    new YouLose();
  }
}

class SomethingNewOptions extends JPanel {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
Font font = new Font("Dialog", Font.ROMAN_BASELINE, 40);
  FontMetrics fontMetrics;
  
  SomethingNewOptions() {
    setSize(700, 800);

    fontMetrics = getFontMetrics(font);
  }

  public void paint(Graphics g) {
    Graphics2D g2D = (Graphics2D) g;


    g2D.setFont(font);
    GradientPaint gp = new GradientPaint( 30.0f, 50.0f, Color.black,  fontMetrics.stringWidth("Bye Bye...You Lose:)"), fontMetrics.getHeight(),Color.red);             
    g2D.setPaint(gp);
    g2D.drawString("Bye Bye...You Lose:)", 2,200);                                                 


  }
}