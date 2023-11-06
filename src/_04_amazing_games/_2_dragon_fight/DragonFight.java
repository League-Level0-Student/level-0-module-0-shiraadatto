package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		// 1. Create some variables to hold health levels
		int playerHealth = 100;
		int dragonHealth = 100;

		// 2. Create some variables to hold the attack strengths. These will be given different values later. 
		int playerAttack = 0;
		int dragonAttack = 0;
		String playerAction = "";
		//  This while statement will cause the game attack code to repeat
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON
			playerAction = JOptionPane.showInputDialog("Yell or Kick");
				// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
				// 4. If they typed in "yell":
	if (playerAction.equalsIgnoreCase("yell")) {
		playerAttack = ran.nextInt(10);
	}
	else if (playerAction.equalsIgnoreCase("kick")) {
		playerAttack = ran.nextInt(25);
	}
	dragonHealth -= playerAttack; 
			// THE DRAGON RETALIATES
	dragonAttack = ran.nextInt(35);
	playerHealth -= dragonAttack;
			// ASSESS THE DAMAGE
	if(dragonHealth <= 0) {
		dragonLost();
	}
	else if (playerHealth <= 0) {
		playerLost();
	}
				// 11.  Pop up a message that tells us how much health the player and
				// 		dragon have left.
	JOptionPane.showMessageDialog(null,  "Player Health: " + playerHealth +
										"\nLost: " + dragonAttack + " health!");
	JOptionPane.showMessageDialog(null, "Dragon Health: " + dragonHealth + 
										"\nLost: " + playerAttack + " health!");
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)
			

		} // this is the end of the while loop

	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure
		JOptionPane.showMessageDialog(null, "You have been defeated by the dragon and have no treasure...");
		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!
		JOptionPane.showMessageDialog(null, "You have defeated the dragon get a ton of gold!");
		System.exit(0);   //This code ends the program
	}

}
