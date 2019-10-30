
public class RockPlayer extends Player {
	
	// subclass of Player
	
	// should always select rock
	
	public RockPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RockPlayer(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return ("Rock Player");
	}

	@Override
	public Roshambo generateRoshambo() {
		
		return null;
	}

	@Override
	public String toString() {
		return "RockPlayer getName()=" + getName() + ", generateRoshambo()=" + generateRoshambo();
	}


}
	
	// return "Rock";

	

	
	
	
	
