package generics.method;

public class Dwayne {
	
	private String name = "Dwayne";
	private Integer power = 100000;
	
	public Dwayne() {
	}

	public String getName() {
		return name;
	}

	public Integer getPower() {
		return power;
	}

	@Override
	public String toString() {
		return "Dwayne [name=" + name + ", power=" + power + "]";
	}
	
	
}
