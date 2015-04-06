package besil.rps.player.strategies;

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
