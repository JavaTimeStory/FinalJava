package Game;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class LevelSeven {

	public static void LevelSeven() throws InterruptedException 
	{Object[] option = {"Restart game?", "End Game"};
        JOptionPane.showMessageDialog(null, "\"Fake friends are like shadows: "
        		+ "\n always near you at your brightest moments, "
        		+ "\n but nowhere to be seen at your darkest hour true friends are like stars, "
        		+ "\n you don't always see them but they are always there.\"");
        JOptionPane.showMessageDialog(null , "You go back to the future and find a better job and better friends "
        		+ "\n who love and appreciate you for who you are "
        		+ "\n and who you're going to be.<3");
        int FinalChoice = JOptionPane.showOptionDialog(null, "Would you like to play again?\r\n",  
        		"Restart Box",
        		JOptionPane.YES_NO_OPTION, 0, null, option, option);
        int score = 0;
        if (FinalChoice == JOptionPane.YES_OPTION)
        {
        	score = score + 1;
        	TimeUnit.SECONDS.sleep(3);
        	Main.main(null);
        }
        else
        {
        	JOptionPane.showMessageDialog(null, "You Beat The Game" + score + "Times");
        	 SomethingNewOptions.TheEndFriends.End();
        	TimeUnit.SECONDS.sleep(3);
     		  System.exit(0);
        }
        ///EEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
	}

}
