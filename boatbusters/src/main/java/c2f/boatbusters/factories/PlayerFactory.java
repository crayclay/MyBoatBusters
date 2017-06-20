package c2f.boatbusters.factories;

import c2f.boatbusters.classes.Player;
import c2f.boatbusters.interfaces.IPlayer;

public class PlayerFactory {


	public Player createPlayer(String name, String numberOfWins) {
		    Player player = new Player (name, numberOfWins);    
			return player;
			
	}
}
