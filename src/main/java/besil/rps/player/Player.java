package besil.rps.player;

import besil.rps.moves.Move;
import besil.rps.player.strategies.Strategies;
import besil.rps.player.strategies.Strategy;

/**
 * Main class representing a Player.
 * Each player has a name and a @Strategy
 * @author besil
 *
 */
public class Player {
	protected static int playerCount = 0;
	protected final String name;
	protected final Strategy strategy;
	
	protected Player(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;
	}
	
	/**
	 * Creates a new Player with a name and its @Strategy
	 * @param name
	 * @param strategy
	 * @return
	 */
	public static Player newPlayer(String name, Strategy strategy) {
		return new Player(name, strategy);
	}
	
	/**
	 * Creates a new Player using a default @Strategy (random)
	 * @param name
	 * @return
	 */
	public static Player newPlayer(String name) {
		return new Player(name, Strategies.randomStrategy());
	}
	
	/**
	 * Create a new Player using a default name
	 * @param strategy
	 * @return
	 */
	public static Player newPlayer(Strategy strategy) {
		Player p = Player.newPlayer("Player"+playerCount, strategy);
		playerCount += 1;
		return p;
	}
	
	public String name() {
		return name;
	}

	/**
	 * Returns the next move of the Player
	 * @return
	 */
	public Move nextMove() {
		return strategy.nextMove();
	}
	
	@Override
	public String toString() {
		return "Player: "+this.name;
	}
	
}
