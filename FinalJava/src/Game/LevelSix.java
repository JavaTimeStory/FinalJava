package Game;

import javax.swing.JOptionPane;

public class LevelSix {

	public static void LevelSix()
	{
		Object[] option = {"YES IM STILL OVERCOME WITH ANGER IM GONNA \r"
				+ "\n KILL THEM AND GO BACK TO THE FUTURE", "No I'm better then this. r"
						+ "\n They aren't worth it. I want to go back to the future \r"
						+ "\n and be just as happy without them not as a muderer. "};
        int Choice = JOptionPane.showOptionDialog(null, "Your machines are made and ready to help you murder "
        		+ "\n these awful friends. You step into the machine scared out of your mind "
        		+ "\n and set the time to right before everyone gets to the sleepover when "
        		+ "\n just Dianne and Kat were there. You blast off and arrive at your house. "
        		+ "\n You see yourself  having a deep conversation with Anna about how happy "
        		+ "\n you are to be her friend and how you and how you will be friends with "
        		+ "\n her through anything. You'd be friends with her forever...."
        		+ "\n Jeez you really cared about them. Does it really matter what they think "
        		+ "\n about you? Do you know you're a good person and amazing friend worth "
        		+ "\n being there for? Do you still even want to murder them?",
        		"The Final Question Box",
        		JOptionPane.YES_NO_OPTION, 0, null, option, option);
        if (Choice == JOptionPane.YES_OPTION)
        {
        	JOptionPane.showMessageDialog(null, "You lose, you have become a monster"
        			+ "\n You will now imprisoned by the time police ");
        }
        else
        {
        	JOptionPane.showMessageDialog(null, "Level Seven");
        }
	}

}
