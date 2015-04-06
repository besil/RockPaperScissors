package besil.rps.player.strategies;

import besil.rps.moves.Move;

/**
 * Concrete @Strategy.
 * The player who plays accordingly to this @Strategy, will always choose @Rock as its @Move
 * @author besil
 *
 */
public class RockStrategy extends Strategy {

	@Override
	public Move nextMove() {
		return Move.rock();
	}

}
