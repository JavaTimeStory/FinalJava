package Game;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class LevelFive {

	public static void LevelFive() throws InterruptedException
	{
        JOptionPane.showMessageDialog(null, "Level Five");
        JOptionPane.showMessageDialog(null, "Time to build the machine.");
       
        Object[] option = {"Disconnect the blue wire.", "Disconnect the red wire."};
        int RedBlue = JOptionPane.showOptionDialog(null, "You start with connecting up all the wires."
        		+ "\n It suddenly starts ticking, its about to explode.",
        		"A Dangerous box",
        		JOptionPane.YES_NO_OPTION, 0, null, option, option);
        if (RedBlue == JOptionPane.YES_OPTION)
        {
        	JOptionPane.showMessageDialog(null, "The machine was dissarmed, you remain alive.");
        }
        else
        {
        	JOptionPane.showMessageDialog(null, "It blows up in your face but oddly enough your"
        			+ "\n alive but you find time frozen, your left in this frozen time forever.");
     		  SomethingNewOptions.YouLose.lose();
     		 TimeUnit.SECONDS.sleep(3);
     		 System.exit(0);
        }
	}

}
