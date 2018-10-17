package Game;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class LevelThree {

	public static void LevelThree() throws InterruptedException 
	{
        JOptionPane.showMessageDialog(null, "Level Three");
        
        int yesNo = JOptionPane.showOptionDialog(null, "Question, Are time ravelers real?",
        		"A Quesioning box",
        		JOptionPane.YES_NO_OPTION, 0, null, null, null);
        if (yesNo == JOptionPane.YES_OPTION)
        {
        	JOptionPane.showMessageDialog(null, "Correct, you have passed this level.");
        }
        else 
        {
        	JOptionPane.showMessageDialog(null, "Wrong, You are a time traveler, Bye.");
     		  SomethingNewOptions.YouLose.lose();
     		  TimeUnit.SECONDS.sleep(3);
     		  System.exit(0);
        }
	}

}
