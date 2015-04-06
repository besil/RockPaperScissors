package besil.rps.moves;

public interface Visitor {
	public Move visit( Paper paper );
	public Move visit( Rock rock );
	public Move visit( Scissors scissors );
}
