package besil.rps;

import besil.rps.moves.Move;
import besil.rps.player.Player;

public class Turn {
	protected Move m, n;
	protected Move winnerMove;
	protected Player p1, p2;
	protected int turnNumber;
	
	public Turn(Move m, Move n) {
		this.m=m;
		this.n=n;
	}
	
	public Turn(int turnNumber, Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
		this.turnNumber = turnNumber;
	}

	public Player play() {
		Move p1m = p1.nextMove();
		Move p2m = p2.nextMove();
		
		System.out.println("-------------");
		System.out.println("Turn number: "+turnNumber);
		System.out.println(p1+": "+p1m);
		System.out.println(p2+": "+p2m);
		
		Move winnerMove = p1m.accept(p2m);
		System.out.println("Winning move: "+winnerMove);
		
		Player winnerPlayer = winnerMove == p1m ? p1 : p2;
		System.out.println("Winner Player: "+winnerPlayer);
		
		return winnerPlayer;
	}

	public void run() {
		this.winnerMove = m.accept(n);
	}
	
	public Move winnerMove() {
		return this.winnerMove;
	}

}
