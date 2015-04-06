package besil.rps.moves;

public class Paper extends Move {

	@Override
	public Move visit(Scissors scissors) {
		return scissors;
	}

	@Override
	public Move visit(Paper paper) {
		return this;
	}

	@Override
	public Move visit(Rock rock) {
		return this;
	}

	@Override
	public Move accept(Move visitor) {
		return visitor.visit(this);
	}
	
}
