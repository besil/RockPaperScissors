package besil.rps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import besil.rps.moves.Move;
import besil.rps.player.Player;
import besil.rps.player.strategies.Strategies;

public class GameTest {

	@Test
	public void RockOnScissor() {
		Move rock 		= Move.rock();
		Move scissors 	= Move.scissors();
		Turn turn = new Turn( rock, scissors );
		turn.run();
		Move winMove = turn.winnerMove();
		
		assertEquals(true, rock != null);
		assertEquals(true, scissors != null);
		assertEquals(true, winMove != null);
		assertEquals(rock, winMove);
	}
	
	@Test
	public void paperWin() {
		Player paperPlayer	 	= Player.newPlayer("silvio", Strategies.papers());
		Player rockPlayer 		= Player.newPlayer(Strategies.rocks());

		Game game = new Game(paperPlayer, rockPlayer);
		game.play();

		Player winner = game.winner();
		
		assertEquals("silvio", winner.name());
		assertEquals(true, rockPlayer != null);
		assertEquals(paperPlayer, winner);
	}

}
