package besil.rps.moves;

public abstract class Move implements Visitor, Visitable {
	
	public static Rock rock() {
		return new Rock();
	}

	public static Scissors scissors() {
		return new Scissors();
	}
	
	public static Paper paper() {
		return new Paper();
	}

}
