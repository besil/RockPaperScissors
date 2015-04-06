package besil.rps.moves;

public class Scissors extends Move {

	@Override
	public Move visit(Scissors scissors) {
		return this;
	}

	@Override
	public Move visit(Paper paper) {
		return this;
	}

	@Override
	public Move visit(Rock rock) {
		return rock;
	}

	@Override
	public Move accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
