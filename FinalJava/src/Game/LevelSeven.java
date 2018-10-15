package Game;

import javax.swing.JOptionPane;

public class LevelSeven {

	public static void LevelSeven() 
	{Object[] option = {"Restart game?", "End Game"};
        JOptionPane.showMessageDialog(null, "Fake friends are like shadows: "
        		+ "\n always near you at your brightest moments, "
        		+ "\n but nowhere to be seen at your darkest hour True friends are like stars, "
        		+ "\n you don't always see them but they are always there.");
        JOptionPane.showMessageDialog(null , "You go back to the future and find better friends "
        		+ "\n who love and appreciate you for who you are "
        		+ "\n and who you're going to be.<3");
        int FinalChoice = JOptionPane.showOptionDialog(null, "Would you like to play again?\r\n",  
        		"Restart Box",
        		JOptionPane.YES_NO_OPTION, 0, null, option, option);
        if (FinalChoice == JOptionPane.YES_OPTION)
        {
        	SomethingNewOptions.TheEndFriends.End();
        	Main.main(null);
        }
        else
        {
     		  System.exit(0);
        }
	}

}
