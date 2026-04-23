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
	
	@Test
	void spare() {
		game.roll(7);
		game.roll(3);
		game.roll(4);
		for (int i=0; i<17; i++)
			game.roll(0);
		assertEquals(game.score(), 18);
	}
	
	@Test
	void strike() {
		game.roll(10);
		game.roll(3);
		game.roll(4);
		for (int i=0; i<16; i++)
			game.roll(0);
		assertEquals(game.score(), 24);
	}
	
	@Test
	void casGeneral() {
		int[] scores = {1, 2, 10, 0, 10,
			4, 2, 0, 10, 6, 2, 0, 10,
			6, 4, 8, 2, 2, 7};
		serie(scores);
		assertEquals(game.score(), 122);
		
	}
	
	private void serie(int[] nbQuilles) {
		for (int i=0; i<nbQuilles.length; i++)
			game.roll(nbQuilles[i]);
	}
	
}
