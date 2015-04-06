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
		
		System.out.println("The winner is: "+winner);
	}
}
