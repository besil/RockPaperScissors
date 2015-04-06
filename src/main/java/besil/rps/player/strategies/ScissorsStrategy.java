package besil.rps.player.strategies;

import besil.rps.moves.Move;
import besil.rps.moves.Scissors;

/**
 * Concrete @Strategy.
 * The player who plays accordingly to this @Strategy, will always choose @Scissors as its @Move
 * @author besil
 *
 */
public class ScissorsStrategy extends Strategy {

	@Override
	public Move nextMove() {
		return Scissors.scissors();
	}

}
