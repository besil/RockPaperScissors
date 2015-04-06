package besil.rps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import besil.rps.player.Player;

public class Game implements Iterable<Turn> {
	protected Player p1, p2;
	protected int turnCount 		= 0;
	protected final int maxTurns 	= 3;
	protected Map<Player, Integer> scoreMap;
	
	public Game(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
		this.scoreMap = new HashMap<>();
		this.scoreMap.put(p1, 0);
		this.scoreMap.put(p2, 0);
	}

	public Player winner() {
		return this.scoreMap.entrySet().stream()
			.max(new Comparator<Map.Entry<Player, Integer>>() {
				@Override
				public int compare(Entry<Player, Integer> o1, Entry<Player, Integer> o2) {
					return o1.getValue().compareTo(o2.getValue());
				}
			}).get()
			.getKey();
	}

	public void play() {
		for(Turn turn : this) {
			Player winnerPlayer = turn.play();
			this.scoreMap.put(winnerPlayer, this.scoreMap.get(winnerPlayer)+1);
		}
	}

	@Override
	public Iterator<Turn> iterator() {
		return new Iterator<Turn>() {
			@Override
			public boolean hasNext() {
				return turnCount < maxTurns;
			}
			@Override
			public Turn next() {
				turnCount += 1;
				return new Turn(p1, p2);
			}
		};
	}

}
