package besil.rps.player.strategies;

import besil.rps.moves.Move;

public class RockStrategy extends Strategy {

	@Override
	public Move nextMove() {
		return Move.rock();
	}

}
