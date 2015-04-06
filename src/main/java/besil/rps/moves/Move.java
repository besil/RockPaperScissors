package besil.rps.moves;

public abstract class Move {
	
	public static Rock rock() {
		return new Rock();
	}

	public static Scissors scissors() {
		return new Scissors();
	}
	
	public static Paper paper() {
		return new Paper();
	}

	public abstract Move accept(Move m);
	public abstract Move visit( Paper paper );
	public abstract Move visit( Rock rock );
	public abstract Move visit( Scissors scissors );
	
}
