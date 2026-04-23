package bowling;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	Game game;
	
	@BeforeEach
	void init() {
		game = new Game();
	}

	@Test
	void aucuneQuille() {
		for (int i=0; i<20; i++) {
			game.roll(0);;
		}
		assertEquals(game.score(), 0);
	}
	
	@Test
	void vingtFoisUneQuille() {
		for (int i=0; i<20; i++) {
			game.roll(1);;
		}
		assertEquals(game.score(), 20);
	}
	
	@Test
	void score30() {
		for (int i=0; i<10; i++)
			game.roll(1);
		for (int i=0; i<10; i++)
			game.roll(2);
		assertEquals(game.score(), 30);
	}
	
	
}
