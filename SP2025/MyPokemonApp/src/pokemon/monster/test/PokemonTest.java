package pokemon.monster.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import pokemon.monster.Pokemon;
import pokemon.monster.PokemonTypes;

class PokemonTest {
	
	private Pokemon pokemon = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("This is the beforeAll method");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("This is the afterAll method");
	}

	@BeforeEach
	void setUp() throws Exception {
//		System.out.println("This is the beforeEach method");
		pokemon = new Pokemon("Charmender", PokemonTypes.FIRE, 100, 50.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("This is the afterEach method");
	}

	@Test
	void testGetName() {
		Pokemon p1 = new Pokemon(null, null, null, null);
		assertEquals("", p1.getName());
		assertEquals("Charmender", pokemon.getName());
	}
	
	@ParameterizedTest
	@MethodSource("pokemonNameProvider")
	void testParameterizedGetName(Pokemon pokemon, String pokemonName) {
		assertEquals(pokemonName, pokemon.getName());
	}
	
	
	private static Stream<Arguments> pokemonNameProvider() {
		return Stream.of(
				Arguments.of(new Pokemon("Charmender", null, null, null), "Charmender"),
				Arguments.of(new Pokemon(null, null, null, null), ""),
				Arguments.of(new Pokemon("", null, null, null), "")
				);
	}

}
