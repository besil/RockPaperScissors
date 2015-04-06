package besil.rps;

import besil.rps.moves.Move;

public class Turn {
	protected Move m, n;
	protected Move winnerMove;
	
	public Turn(Move m, Move n) {
		this.m=m;
		this.n=n;
	}

	public void run() {
		this.winnerMove = m.accept(n);
	}

	public Move winnerMove() {
		return this.winnerMove;
	}

}
