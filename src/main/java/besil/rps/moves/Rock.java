package besil.rps.moves;

public class Rock extends Move {

	@Override
	public Move visit(Scissors scissors) {
		return this;
	}

	@Override
	public Move visit(Paper paper) {
		return paper;
	}

	@Override
	public Move visit(Rock rock) {
		return Draw.instance();
	}

	@Override
	public Move accept(Move visitor) {
		return visitor.visit(this);
	}

	@Override
	public String toString() {
		return "Rock";
	}
	
}
