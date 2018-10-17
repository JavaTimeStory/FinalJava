package Game;

import javax.swing.JOptionPane;

import java.util.concurrent.TimeUnit;

import javax.swing.UIManager;

public class LevelTwo {

	private static final Object[] SecontOP = null;

	public static void LevelTwo() throws InterruptedException 
	{
		
		Object[] options = {"Run in and murder them all!", 
				"Walk in calmly and hand out the snacks and sit down."};
		int firstOp = JOptionPane.showOptionDialog(null, "You are driving back from gas station to get snacks for "
				+ "\n you and some of your close friends and as you walk in you hear your friends "
				+ "\n talking. You hear Dianne talking about you saying " + " \"We should take the food and "
						+ "\n just go home shes not good enough to be our friend and we all know that.\""
				+ "\n Everyone bursts into laughter and Kat says " + " \"Shes not even a good friend she "
						+ "\n just does everything we want because shes so desperate to be our friend and "
						+ "\n feel wanted. Haha she'd probably die without us. Maybe she should find "
						+ "\n people who actually want to be her friend.\"" + " What do you do?",
						"An Option Box",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, options, options);
		if (firstOp == JOptionPane.YES_OPTION) 
		{
			JOptionPane.showMessageDialog(null, "You failed. \r\n" + 
					"Your mom walked in and found you with a knife in your hand over the girls dead bodies.\r\n" + 
					"Go to jail.");
     		  SomethingNewOptions.YouLose.lose();
     		  TimeUnit.SECONDS.sleep(3);
     		  System.exit(0);
		}
		else
		{
			Object[] optionsTwo = {"Get up and pistol whip them all in the face.", 
					" \"Yes I'm fine Kat thanks for asking\""};
		int SecondOP = JOptionPane.showOptionDialog(null, "Eat your snack while everyone is having "
							+ "\n an amazing time and you are loathing in self hatred and hatred for them. Kat asks "
							+ "\n you if you are okay(even though shes the cause of why you are upset) "
							+ "\n What do you say?",
							 null, JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE, null, optionsTwo, optionsTwo);
		if(SecondOP == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "At that exact moment a giant Barry bee Benson "
					+ "\n the size of a human flies in  and stings you, you go to jail and die of "
					+ "\n bee poison.",
					"Death box",
					JOptionPane.ERROR_MESSAGE);
     		  SomethingNewOptions.YouLose.lose();
     		  TimeUnit.SECONDS.sleep(3);
     		  System.exit(0);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You have passed this level");
		}
			}
			
		}
	}


