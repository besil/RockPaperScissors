package besil.rps.player;

import besil.rps.moves.Move;
import besil.rps.player.strategies.Strategies;
import besil.rps.player.strategies.Strategy;

public class Player {
	protected static int playerCount = 0;
	protected final String name;
	protected final Strategy strategy;
	
	protected Player(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;
	}
	
	public static Player newPlayer(String name, Strategy strategy) {
		return new Player(name, strategy);
	}
	
	public static Player newPlayer(String name) {
		return new Player(name, Strategies.defaultStrategy());
	}
	
	public static Player newPlayer(Strategy strategy) {
		Player p = Player.newPlayer("Player"+playerCount, strategy);
		playerCount += 1;
		return p;
	}
	
	public String name() {
		return name;
	}

	public Move nextMove() {
		return strategy.nextMove();
	}
	
	@Override
	public String toString() {
		return "Player: "+this.name;
	}
	
}
