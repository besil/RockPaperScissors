package besil.rps.player.strategies;

import besil.rps.moves.Move;

/**
 * Concrete @Strategy.
 * The player who plays accordingly to this @Strategy, will always choose @Paper as its @Move
 * @author besil
 *
 */
public class PaperStrategy extends Strategy {

	@Override
	public Move nextMove() {
		return Move.paper();
	}

}
