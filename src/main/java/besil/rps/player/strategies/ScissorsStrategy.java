package besil.rps.player.strategies;

import besil.rps.moves.Move;
import besil.rps.moves.Scissors;

public class ScissorsStrategy extends Strategy {

	@Override
	public Move nextMove() {
		return Scissors.scissors();
	}

}
