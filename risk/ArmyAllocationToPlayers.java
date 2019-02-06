/**
 * 
 */
package com.soen.risk.country;

import java.util.HashMap;
import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class ArmyAllocationToPlayers.
 * In the assignment phase, the player is given a number of armies in
 * round robin fashion depending on the number of countries he owns.
 *
 * @author Chirag
 * @version 1.0
 */
public class ArmyAllocationToPlayers {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new ArmyAllocationToPlayers().assignTroops();
	}
	/**
	 * Assign armies to each players for the countries they own in round robin fashion.
	 */
	private void assignTroops() {
		String countries[] = {"Country 26", "Country 14", "Country 44", "Country 17", "Country 31", "Country 9", "Country 21", "Country 39", "Country 41", "Country 27"};

		Map<String, Integer> countryTroopMapping = new HashMap<>();
		for (String country : countries) {
			countryTroopMapping.put(country, 0);
		}

		int lastAssignedCountryIndex = 0;

		//for (int j = 0; j < 3; j++) {
			int troopsToAssign = 35;
			for (int i = 0; i < troopsToAssign; i++) {
				if (lastAssignedCountryIndex >= countries.length) {
					lastAssignedCountryIndex = 0;
				}

				String lastAssignedCountry = countries[lastAssignedCountryIndex];
				Integer currentTroops = countryTroopMapping.get(lastAssignedCountry);
				countryTroopMapping.put(lastAssignedCountry, (currentTroops + 1));

				lastAssignedCountryIndex++;
			}
		//}

		for (Map.Entry<String, Integer> stringIntegerEntry : countryTroopMapping.entrySet()) {
			System.out.println(stringIntegerEntry.getValue() + " troops in " + stringIntegerEntry.getKey());
		}

		//System.out.println(lastAssignedCountryIndex);

	}
}
