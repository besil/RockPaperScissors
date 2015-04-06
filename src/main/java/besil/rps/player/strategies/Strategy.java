package besil.rps.player.strategies;

import besil.rps.moves.Move;

/**
 * Main class representing a @Strategy played by a @Player
 * @author besil
 *
 */
public abstract class Strategy {
	public abstract Move nextMove();
}
