package besil.rps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import besil.rps.moves.Move;
import besil.rps.player.Player;

public class GameTest {

	@Test
	public void RockOnScissor() {
		Move rock 		= Move.rock();
		Move scissors 	= Move.scissors();
		Turn turn = new Turn( rock, scissors );
		turn.run();
		Move winMove = turn.winnerMove();
		assertEquals(winMove, rock);
	}
	
	@Test
	public void rockWin() {
		Player scissorPlayer 	= Player.scissorPlayer();
		Player rockPlayer 		= Player.rockPlayer();

		Game game = new Game(scissorPlayer, rockPlayer);
		game.play();

		Player winner = game.winner();
		assertEquals(rockPlayer, winner);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
