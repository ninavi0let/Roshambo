
public class RandomPlayer extends Player {
	
	public RandomPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RandomPlayer(String string) {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return ("Random Player");
		
	}

	@Override
	public String toString() {
		return "RandomPlayer [getName()=" + getName() + "]";
	}

	@Override
	public Roshambo generateRoshambo() {
		
		int i = ((int)Math.random()*3) +1;
		
		switch(i) {
		
		case 1:
			return Roshambo.PAPER;
			
		case 2:
			return Roshambo.SCISSORS;
			
		default:
			return Roshambo.ROCK;
			
		}
		
	}	
	
	
	// subclass of Player
	
	// should randomly select rock, paper, or scissors (a 1 in 3
	// chance of selecting each
	
	
}
