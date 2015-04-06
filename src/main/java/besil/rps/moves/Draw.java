package besil.rps.moves;

public class Draw extends Move {
	private static Draw instance;
	
	public synchronized static Draw instance() {
		if(instance == null) {
			instance = new Draw();
		}
		return instance;
	}
	
	private Draw() {
		
	}
	
	@Override
	public boolean isDraw() {
		return true;
	}
	
	@Override
	public Move accept(Move m) {
		throw new RuntimeException("Should not be called!");
	}

	@Override
	public Move visit(Paper paper) {
		throw new RuntimeException("Should not be called!");
	}

	@Override
	public Move visit(Rock rock) {
		throw new RuntimeException("Should not be called!");
	}

	@Override
	public Move visit(Scissors scissors) {
		throw new RuntimeException("Should not be called!");
	}
	
	@Override
	public String toString() {
		return "Draw!";
	}

}
