package besil.rps.player.strategies;

/**
 * Factory class for different kind of @Strategy
 * @author besil
 *
 */
public class Strategies {

	public static Strategy randomStrategy() {
		return new RandomStrategy();
	}
	
	public static Strategy rocks() {
		return new RockStrategy();
	}

	public static Strategy scissors() {
		return new ScissorsStrategy();
	}
	
	public static Strategy papers() {
		return new PaperStrategy();
	}

}
