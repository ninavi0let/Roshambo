import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		// Allows user to play against either of your first two player classes

		Scanner scan = new Scanner(System.in);
		String cont = "y";

		Player opponent;

		System.out.println("Welcome!");
		String name = Validator.getString(scan, "Enter your name: ");

		int choice = Validator.getInt(scan, "Would you like to play against \n1. Dwayne \n2. or Randy?", 1, 2);

		if (choice == 1) {

			opponent = new RockPlayer("Dwayne");

		} else {

			opponent = new RandomPlayer("Randy");

		}

		while (cont.equalsIgnoreCase("y")) {

			String input = Validator.getString(scan, "Rock, Paper, or Scissors?");
			
			Player user = new HumanPlayer("Beebee");
			((HumanPlayer) user).setUserChoice(input);
			
			Roshambo userRo = user.generateRoshambo();
			Roshambo opponentRo = opponent.generateRoshambo();
			
			System.out.println(name +": "+userRo);
			System.out.println(opponent.getName()+": "+opponentRo);
			Player winner = getWinner(opponent, user);
			
			if(winner == null) {
				System.out.println("Draw");
			} else {
				System.out.println(winner.getName()+": wins!");
			}
			
			//System.out.println();
			
			Player Winner = getWinner(opponent, user);

			cont = Validator.getStringMatchingRegex(scan, "Play again? (y/n)", "[YyNn]");

		}

		scan.close();
		
		System.out.println("Goodbye!");

	}

	public static Player getWinner(Player player1, Player player2) {
		Roshambo r1 = player1.generateRoshambo();
		Roshambo r2 = player2.generateRoshambo();
		
		if (r1.equals("Rock") && r2.equals("Scissors") 
			|| r1.equals("Scissors") && r2.equals("Paper") 
			|| r1.equals("Paper") && r2.equals("Rock")); {
				
				return player1;
				
			} else if (r1.equals(r2)) {
				
				System.out.println("Draw!");
				return null;
				
			} else {
				return player2;
			}
	}

}
