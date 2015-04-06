package besil.rps.player.strategies;

import besil.rps.moves.Move;

public class PaperStrategy extends Strategy {

	@Override
	public Move nextMove() {
		return Move.paper();
	}

}
