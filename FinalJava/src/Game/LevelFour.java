package Game;

import javax.swing.JOptionPane;

import java.util.Random;

public class LevelFour {

	public static void LevelFour() 
	{
		Random rand = new Random();
		int E = rand.nextInt(2) + 1;
		Object[] option = {"Quit while you're ahead", 
				"Build the machines OF MASS DESTRUCTION"};
        JOptionPane.showOptionDialog(null, "A week has passed and you still can't stop thinking "
        		+ "\n about it. What can you do so they will never doubt you ever again? MURDER. "
        		+ "\n But you aren't stupid you know that you cant just kill people. "
        		+ "\n You have to go back in time before they talked crap about you and kill them and "
        		+ "\n then build a paradox machine so you can go back to normal.  "
        		+ "\n Do you like this idea?",
        		"A Questioning Box",
        		JOptionPane.YES_NO_OPTION, 0, null, option, option);
        if (E == 1)
        {
        	Object[] option2 = {"Food store", "Auto store"};
        	JOptionPane.showMessageDialog(null, "You get a job and buy the parts, "
        			+ "\n your already in enough trouble");
        	JOptionPane.showOptionDialog(null, "Where should you work?",
        			"A questioning box",
        			JOptionPane.YES_NO_OPTION, E, null, option2, option2);
        }
        else
        {
        	JOptionPane.showMessageDialog(null, "You decide to steal the parts, "
        			+ "\n your already on the crime path");
        }
        JOptionPane.showMessageDialog(null, "You eventually get all the parts through "
        		+ "\n questionable means as some were illegal");
	}

}
