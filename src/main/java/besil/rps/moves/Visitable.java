package besil.rps.moves;

public interface Visitable {
	public Move accept(Visitor visitor);
}
