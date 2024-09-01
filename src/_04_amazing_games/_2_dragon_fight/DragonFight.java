package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random(); // This will be used later to make random numbers.

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take all your treasure back!", "Dragon Fighter", 0,
				dragon);

		// 1. Create some variables to hold health levels
		int playerHealth = 100;
		int dragonHealth = 100;
		// playerHealth to store your health - set it equal to 100

		// dragonHealth to store the dragon's health - set it equal to 100

		// 2. Create some variables to hold the attack strengths. These will be given
		// different values later.
		int playerAttack = 0;
		int dragonAttack = 0;
		// playerAttack to store the damage the player's attack will do - set it equal
		// to 0 for now.
		JOptionPane.showMessageDialog(null,
				"Oh no! a dragon has taken all your treasure in order to get it back, you have to defeat the dragon! ");
		// dragonAttack to store the damage the dragon's attack will do - set it equal
		// to 0 for now.

		// This while statement will cause the game attack code to repeat
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON
			String input = JOptionPane.showInputDialog("Attack the dragon by yelling or kicking (type yell or kick)");
			// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
			// or a kick

			// 4. If they typed in "yell":
			if (input.equalsIgnoreCase("yell")) {

				// -- Find a random number between 0 and 10 and store it in playerAttack. Use
				playerAttack = ran.nextInt(10);
				if (playerAttack == 0) {
					JOptionPane.showMessageDialog(null, "You did " + playerAttack + " damage because you missed D:");
				}
			}
			// 5. If they typed in "kick":
			if (input.equalsIgnoreCase("kick")) {
				playerAttack = ran.nextInt(25);
//	if (playerAttack == 0) {
//		JOptionPane.showMessageDialog(null, "You did " + playerAttack + " damage because you missed D:");
//	}

			}

			// -- Find a random number between 0 and 25 and store it in playerAttack.

			// 6. Subtract the player attack value from the dragon's health
			dragonHealth -= playerAttack;
			// THE DRAGON RETALIATES

			// 7. Find a random number between 0 and 35 and store it in dragonAttack
			dragonAttack = ran.nextInt(35);

			// 8. Subtract the dragon attack value from the player's health
			playerHealth -= dragonAttack;
			// ASSESS THE DAMAGE

			// 9. If the player's health is less than or equal to 0, the game is over,
			// call the playerLost() method
			if(playerHealth <= 0) {
				playerLost();
			}

			// 10. If the dragon's health is less than or equal to 0, the game is over,
			// call the dragonLost() method
			
			if(dragonHealth <= 0) {
				dragonLost();
			}
			JOptionPane.showMessageDialog(null, "The dragon has " + dragonHealth + " health");
			// 11. Pop up a message that tells us how much health the player and
			// dragon have left.
		JOptionPane.showMessageDialog(null,"You have " + playerHealth + " health");
			

			// (Bonus: Also display the amount of health that was lost by each in this
			// round)

		} // this is the end of the while loop

	}


	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no
		// treasure
		JOptionPane.showMessageDialog(null, "You have lost all your gold and has lost...");
		System.exit(0); // This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of
		// gold!
		JOptionPane.showMessageDialog(null, "The dragon has lost and you regain your gold!");
		System.exit(0); // This code ends the program
	}

}
