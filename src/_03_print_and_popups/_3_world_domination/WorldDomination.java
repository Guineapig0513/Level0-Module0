package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String code = JOptionPane.showInputDialog("Do you know how to code?");
		// 2. If they say "yes", tell them they will rule the world.
if(code.equals("yes")) 
JOptionPane.showMessageDialog(null,  "you will rule the world also join the league just please");
else
	JOptionPane.showMessageDialog(null,  "sign up for classes at the league because you are very bad at coding YOUUUUUUUUU SUCK");
		// 3. Otherwise, tell them to sign up for classes at The League.

	}
}

