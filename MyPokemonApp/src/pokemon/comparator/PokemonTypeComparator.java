package pokemon.comparator;

import java.util.Comparator;

import pokemon.monster.Pokemon;

public class PokemonTypeComparator implements Comparator<Pokemon> {

	@Override
	public int compare(Pokemon o1, Pokemon o2) {
		return Integer.compare(o1.getType().getOrder(), o2.getType().getOrder());
	}

}
