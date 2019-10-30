
public class HumanPlayer extends Player {

	public HumanPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public HumanPlayer(String string) {
	
	}

	private String userChoice;
	
	public void setUserChoice(String userChoice) {
		this.userChoice = userChoice;
	}
	public String getUserChoice() {
		return userChoice;
	}

	@Override
	public Roshambo generateRoshambo() {
		
		if(userChoice.equalsIgnoreCase("Rock")) {
			return Roshambo.ROCK;
		} else if (userChoice.equalsIgnoreCase("Paper")) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;
		}
	}
	@Override
	public String toString() {
		return "HumanPlayer [userChoice=" + userChoice + ", getUserChoice()=" + getUserChoice()
				+ ", generateRoshambo()=" + generateRoshambo() + "]";
	}
	
}
	
	
	
	// subclass of Player
	
	// implements the generateRoshambo() method
	// for this class generateRoshambo() gets input from the human
	// player and returns the value chosen
	
	

