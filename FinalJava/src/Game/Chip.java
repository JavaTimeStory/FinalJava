package Game;

import javax.swing.JOptionPane;

public class Chip {

	public static void Chips() 
	{
		String chip;
		
         
		chip = JOptionPane.showInputDialog(null,
		        "What Is Your Favorite chip?",
		        "A Questioning Box",
		        JOptionPane.QUESTION_MESSAGE);
		
         JOptionPane.showMessageDialog(null, "Hello and welcome to... ",
        		 "A Welcoming box", 
        		 JOptionPane.PLAIN_MESSAGE);
         
         JOptionPane.showMessageDialog(null, "The Time Killer",
        		 "An Evil Box", 
        		 JOptionPane.PLAIN_MESSAGE);
         
         int KeepGoing = JOptionPane.showConfirmDialog(null, 
        		 "Continue?", 
        		 "A Question box", JOptionPane.YES_NO_OPTION);
         if(KeepGoing == JOptionPane.NO_OPTION)
         {
        	 System.exit(0);
         }
         else
         {
        	 
         }
	}

}
