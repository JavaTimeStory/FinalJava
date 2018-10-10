package Game;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class LevelTwo {

	public static void LevelTwo(String chip) 
	{
		
		UIManager.put(JOptionPane.YES_BUTTON_TEXT, "Run in and murder them all!");
		UIManager.put(JOptionPane.NO_OPTION, "Walk in calmly and hand out the snacks and sit down.");
		JOptionPane.showConfirmDialog(null, "You are driving back from gas station to get snacks for "
				+ "\n you and some of your close friends and as you walk in you hear your friends "
				+ "\n talking. You hear Dianne talking about you saying " + "We should take the food and "
						+ "\n just go home shes not good enough to be our friend and we all know that"
				+ "\n Everyone bursts into laughter and Kat says " + "Shes not even a good friend she "
						+ "\n just does everything we want because shes so desperate to be our friend and "
						+ "\n feel wanted. Haha she'd probably die without us. Maybe she should find "
						+ "\n people who actually want to be her friend" + "What do you do?",
						"An Option Box",
						JOptionPane.YES_NO_CANCEL_OPTION);
	}

}
