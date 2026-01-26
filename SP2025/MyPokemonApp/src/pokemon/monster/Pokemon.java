package pokemon.monster;

public class Pokemon implements Comparable<Pokemon> {
	
	private String name;
	private PokemonTypes type;
	private Integer HP;
	private Double attackDamage;

	public Pokemon(String name, PokemonTypes type, Integer hP, Double attackDamage) {
		super();
		setName(name);
		this.type = type;
		HP = hP;
		this.attackDamage = attackDamage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		if(name == null) {
			this.name = "";
		}
	}

	public PokemonTypes getType() {
		return type;
	}

	public void setType(PokemonTypes type) {
		this.type = type;
	}

	public Integer getHP() {
		return HP;
	}

	public void setHP(Integer hP) {
		HP = hP;
	}

	public Double getAttackDamage() {
		return attackDamage;
	}

	public void setAttackDamage(Double attackDamage) {
		this.attackDamage = attackDamage;
	}

	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", type=" + type + ", HP=" + HP + ", attackDamage=" + attackDamage + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Pokemon p = (Pokemon)obj;
		return this.getName().equals(p.getName());
	}

	@Override
	public int compareTo(Pokemon o) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public int compareTo(Pokemon o) {
//		return o.getName().compareTo(name);
////		return this.name.compareTo(o.getName());
////		return String.compare(o.getName(), this.name);
//	}

}
