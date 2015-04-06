package besil.rps.main;

import besil.rps.Game;
import besil.rps.player.Player;
import besil.rps.player.strategies.Strategies;

public class RockPaperScissorsMain {
	public static void main(String[] args) {
		Player silvio = Player.newPlayer("silvio", Strategies.randomStrategy());
		Player nemesi = Player.newPlayer("Nemesi", Strategies.randomStrategy());
		
		Game g = new Game(silvio, nemesi);
		g.play();
		
		Player winner = g.winner();

		printWinner(winner);
	}
	
	public static void printWinner(Player winner) {
		String winnerMex = "The winner is: "+winner;
		System.out.println();
		for(int i=0; i<winnerMex.length(); i++) System.out.print("*");
		System.out.println();
		System.out.println(winnerMex);		
	}
}
