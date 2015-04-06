package besil.rps.moves;

/**
 * A class representing the choice made by a @Player, accordingly to its @Strategy
 * @author besil
 *
 */
public abstract class Move {
	
	/**
	 * Useful factory methods
	 * @return
	 */
	public static Rock rock() {
		return new Rock();
	}

	public static Scissors scissors() {
		return new Scissors();
	}
	
	public static Paper paper() {
		return new Paper();
	}

	/**
	 * Visitor pattern for defining which @Move wins over another one
	 * @param m
	 * @return
	 */
	public abstract Move accept(Move m);
	public abstract Move visit( Paper paper );
	public abstract Move visit( Rock rock );
	public abstract Move visit( Scissors scissors );
	
}
