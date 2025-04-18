package pokemon.trainer;

import java.util.ArrayList;

import pokemon.monster.Pokemon;

public class PokemonTrainer {
	
	private String name;
	private ArrayList<Pokemon> pokemonList;
	
	public PokemonTrainer(String name) {
		this.name = name;
		this.pokemonList = new ArrayList<Pokemon>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Pokemon> getPokemonList() {
		return pokemonList;
	}
	
	public Pokemon getPokemon(Pokemon pokemon) throws PokemonNotExistException {
		if(pokemonList.contains(pokemon)) {
			System.out.println(pokemon.getName() + " I choose you!");
			return pokemonList.get(pokemonList.indexOf(pokemon));
		}
		else {
			throw new PokemonNotExistException(pokemon);
		}
	}

	public void setPokemonList(ArrayList<Pokemon> pokemonList) {
		this.pokemonList = pokemonList;
	}
	
	
	
	

}
