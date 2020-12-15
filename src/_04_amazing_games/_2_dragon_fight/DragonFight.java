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
		
			// playerHealth to store your health - set it equal to 100
		int playerhealth=100;
			// dragonHealth to store the dragon's health - set it equal to 100
int dragonhealth=100;
		// 2. Create some variables to hold the attack strengths. These will be given different values later. 
		
			// playerAttack to store the damage the player's attack will do - set it equal
			// to 0 for now.
	int playerAttack=0;
			// dragonAttack to store the damage the dragon's attack will do - set it equal
			// to 0 for now.
 int dragonAttack=0;
		
		//  This while statement will cause the game attack code to repeat
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON
			
				// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
			String answer = JOptionPane.showInputDialog("Do you want to attack the dragon with a punch or with a kick?");
				// 4. If they typed in "yell":
			if(answer.equalsIgnoreCase("punch")) {
playerAttack=ran.nextInt(20);				
			}
					  // -- Find a random number between 0 and 10 and store it in playerAttack. Use
					  // ran.nextInt(10)
			
				// 5. If they typed in "kick":
			if(answer.equalsIgnoreCase("kick")) {
			playerAttack=ran.nextInt(25);	
			}
					  // -- Find a random number between 0 and 25 and store it in playerAttack.
		
				// 6. Subtract the player attack value from the dragon's health
dragonhealth-=playerAttack;
			// THE DRAGON RETALIATES
dragonAttack=ran.nextInt(35);
				// 7. Find a random number between 0 and 35 and store it in dragonAttack
	
				// 8. Subtract the dragon attack value from the player's health
playerhealth-=dragonAttack;
			// ASSESS THE DAMAGE
if (playerhealth<=0) {
	playerLost();
}
				// 9. If the player's health is less than or equal to 0, the game is over,
				//    call the playerLost() method
	
			
				// 10. If the dragon's health is less than or equal to 0, the game is over,
				//     call the dragonLost() method
if (dragonhealth<=0) {
	dragonLost();
}
			
				// 11.  Pop up a message that tells us how much health the player and
				// 		dragon have left.
	
JOptionPane.showMessageDialog(null,"Your health is "+playerhealth);	
JOptionPane.showMessageDialog(null,"The dragons health is "+dragonhealth);	

			
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)
			

		} // this is the end of the while loop

	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure
		JOptionPane.showMessageDialog(null,"Game Over");	


		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!
		JOptionPane.showMessageDialog(null,"Congradulations! The dragon has lost and now you have 300 gold and 4 tokens!");	

		System.exit(0);   //This code ends the program
	}

}
