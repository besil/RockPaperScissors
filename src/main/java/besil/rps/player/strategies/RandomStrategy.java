package besil.rps.player.strategies;

import java.util.HashMap;
import java.util.Random;

import besil.rps.moves.Move;

public class RandomStrategy extends Strategy {
	protected HashMap<Integer, Move> moveMap;
	protected Random random;
	
	public RandomStrategy() {
		this.moveMap = new HashMap<>();
		random = new Random();
		this.moveMap.put(0, Move.paper());
		this.moveMap.put(1, Move.rock());
		this.moveMap.put(2, Move.scissors());
	}
	
	@Override
	public Move nextMove() {
		return this.moveMap.get( random.nextInt(3) );
	}

}
