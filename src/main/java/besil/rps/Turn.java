package besil.rps;

import besil.rps.moves.Move;
import besil.rps.player.Player;

public class Turn {
	protected Move m, n;
	protected Move winnerMove;
	protected Player p1, p2;
	
	public Turn(Move m, Move n) {
		this.m=m;
		this.n=n;
	}
	
	public Turn(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Player play() {
		Move p1m = p1.nextMove();
		Move p2m = p2.nextMove();
		
		Move winnerMove = p1m.accept(p2m);
		return winnerMove == p1m ? p1 : p2;
	}

	public void run() {
		this.winnerMove = m.accept(n);
	}
	
	public Move winnerMove() {
		return this.winnerMove;
	}

}
