/**
 * 
 */
package com.soen.risk.country;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class CountryAssignmentToPlayer defines number of the armies given to the player based 
 * on the number of players. 
 *
 * @author Chirag
 * @version 1.0
 */
public class CountryAssignmentToPlayer {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new CountryAssignmentToPlayer().assignCountries();     
	}

	/**
	 * Assign countries to each player randomly.
	 */
	private void assignCountries() {
		List<String> players = new ArrayList<>();
		players.add("Player 1");
		players.add("Player 2");
		players.add("Player 3");
		players.add("Player 4");
		players.add("Player 5");

		List<String> countries = new ArrayList<>();
		for (int i = 0; i < 47; i++) {
			countries.add("Country " + (i + 1));
		}

		List<String> shuffledCountries = new ArrayList<>(countries);
		Collections.shuffle(shuffledCountries);

		Map<String, List<String>> playerCountryMap = new HashMap<>();
		for (int i = 0; i < shuffledCountries.size(); i = i + players.size()) {
			for (int j = 0; j < players.size(); j++) {
				if ((i + j) >= shuffledCountries.size()) {
					break;
				}

				String player = players.get(j);
				List<String> playerCountries = playerCountryMap.get(player);
				if (playerCountries == null) {
					playerCountries = new ArrayList<>();
				}
				String playerAssignedCountry = shuffledCountries.get(i + j);
				// TODO: Handle adjacent country
				playerCountries.add(playerAssignedCountry);
				playerCountryMap.put(player, playerCountries);
			}
		}

		for (Map.Entry<String, List<String>> stringListEntry : playerCountryMap.entrySet()) {
			String player = stringListEntry.getKey();
			List<String> value = stringListEntry.getValue();
			System.out.println("-> " + player + " <- has " + value.size() + " countries");
			System.out.println("\t\t" + value);
		}
	}
}
