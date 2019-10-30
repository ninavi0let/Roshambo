public abstract class Player {

	// this class should store a name
	
	// should include abstract method named generateRoshambo()
	// that allows an inheriting class to generate and return a Roshambo value
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract Roshambo generateRoshambo();
	
}
