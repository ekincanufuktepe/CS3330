package pokemon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import pokemon.comparator.PokemonHealthPointComparator;
import pokemon.comparator.PokemonTypeComparator;
import pokemon.monster.Pokemon;
import pokemon.monster.PokemonTypes;
import pokemon.trainer.PokemonNotExistException;
import pokemon.trainer.PokemonTrainer;

public class Main {

	public static void main(String[] args) {
		PokemonTrainer ash = new PokemonTrainer("Ash");
		System.out.println(ash.getPokemonList());
		ash.getPokemonList().add(new Pokemon("Pikachu", PokemonTypes.ELECTRIC, 50, 20.0));
		ash.getPokemonList().add(new Pokemon("Squirtle", PokemonTypes.WATER, 100, 75.0));
		ash.getPokemonList().add(new Pokemon("Mewtwo", PokemonTypes.PSYCHIC, 200, 100.0));
		ash.getPokemonList().add(new Pokemon("Snorlax", PokemonTypes.NORMAL, 150, 60.0));
		ash.getPokemonList().add(new Pokemon("Charizard", PokemonTypes.FIRE, 120, 80.0));

		//		ash.getPokemonList().sort(null);
		Collections.sort(ash.getPokemonList(), new PokemonTypeComparator());
		//		Collections.sort(ash.getPokemonList(), (p1, p2) -> Double.compare(p1.getAttackDamage(), p2.getAttackDamage()));
		//		Collections.sort(ash.getPokemonList());
		for(Pokemon p : ash.getPokemonList()) {
			System.out.println(p);
		}
		boolean flag = false;
		while(!flag) {
			try {
				Scanner input = new Scanner(System.in);
				String pokemonName = input.next();
				Pokemon pikachu = ash.getPokemon(new Pokemon(pokemonName, PokemonTypes.ELECTRIC, 50, 20.0));
				flag = true;
				System.out.println("Attack " + pikachu.getName() + "!");
			}
			catch (PokemonNotExistException e) {
				//				e.printStackTrace();
				System.out.println("I see that you don't have " + e.getOffendingPokemon().getName());
				System.out.println("Try a different pokemon name");
			}
			catch (Exception ex) {

			}
		}


		//		System.out.println("Is pikachu here: " + ash.getPokemonList().contains(new Pokemon("Hunter", PokemonTypes.ELECTRIC, 50, 20.0)));

		//		System.out.println(ash.getPokemonList());



		//		ArrayList<Integer> intList = new ArrayList<Integer>();
		//		intList.add(5);
		//		intList.add(7);
		//		intList.add(1);
		//		intList.add(2);
		//		intList.add(9);
		//		intList.add(3);
		//		System.out.println(intList);
		////		intList.sort(null);
		//		Collections.sort(intList);
		//		System.out.println(intList);
	}

}
