package pokemon.monster;

public enum PokemonTypes {
	
	WATER(1),
	FIRE(2),
	FLYING(3),
	ELECTRIC(4),
	GRASS(5),
	DARK(6),
	NORMAL(7),
	PSYCHIC(8);
	
	private final int order;

	PokemonTypes(int i) {
		this.order = i;
	}

	public int getOrder() {
		return order;
	}

}
