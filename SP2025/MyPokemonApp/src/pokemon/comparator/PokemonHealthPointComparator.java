package pokemon.comparator;

import java.util.Comparator;

import pokemon.monster.Pokemon;

public class PokemonHealthPointComparator implements Comparator<Pokemon> {

	@Override
	public int compare(Pokemon o1, Pokemon o2) {
		return Integer.compare(o1.getHP().intValue(), o2.getHP().intValue());
	}

}
