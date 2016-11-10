package edu.cuny.csi.csc330.mmonlineapi;
import org.mongodb.morphia.*;

import edu.cuny.csi.csc330.mmonlineapi.models.Player;
import edu.cuny.csi.csc330.mmonlineapi.mongodb.Client;

public class Main {
	public static void main (String [] args) {
		Client client = new Client();
		Player p1 = new Player();
		p1.setPassword("lol");
		p1.setUsername("meme king");
		client.getDatastore().save(p1);
	}
}
