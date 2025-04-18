package pokemon.trainer.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pokemon.monster.Pokemon;
import pokemon.monster.PokemonTypes;
import pokemon.trainer.PokemonNotExistException;
import pokemon.trainer.PokemonTrainer;

class PokemonTrainerTest {
	
	private PokemonTrainer trainer = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		trainer = new PokemonTrainer("Ash");
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetPokemonWithExistingPokemon() {
		Pokemon pokemon = new Pokemon("Pikachu", PokemonTypes.ELECTRIC, 10, 5.0);
		trainer.getPokemonList().add(pokemon);
		try {
			assertEquals(new Pokemon("Pikachu", PokemonTypes.ELECTRIC, 10, 5.0), trainer.getPokemon(pokemon));
		} catch (PokemonNotExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void testGetPokemonWithPokemonNotExistException() {
		Pokemon pokemon = new Pokemon("Pikachu", PokemonTypes.ELECTRIC, 10, 5.0);
		trainer.getPokemonList().add(pokemon);
		Exception exception = 
				assertThrows(PokemonNotExistException.class, 
						() -> {
							trainer.getPokemon(new Pokemon("Squirtle", PokemonTypes.WATER, 10, 5.0));
		});
		assertEquals("Pokemon: Squirtle is not in list!", exception.getMessage());
	}

}
