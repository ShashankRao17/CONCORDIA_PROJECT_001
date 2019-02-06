import java.util.HashMap;

/**
 * The class defines number of the armies given to the player calculation.
 * In the reinforcements phase, the player is given a number of armies that depends on the 
 * number of countries he owns (# of countries owned divided by 3, rounded down). 
 * If the player owns all the countries of an entire continent
 * else the player is given an amount of armies corresponding to the continent’s control value.
 * 
 * @author Neha
 * @version 1.0
 *
 */
public class RiskReinforcementPhase 
{
	public int noOfArmies;
	public int noOfCountriesOwned;
    public int playerID;
    public int noOfPlayers;
    public static int noOfArmiesForPlayer;
	
    //TO be deleted
	public RiskReinforcementPhase(int playerID, int armies, int noOfCountriesOwned, int noOfPlayers) 
	{
		this.playerID 			= playerID;
		this.noOfArmies 		= armies;
		this.noOfCountriesOwned = noOfCountriesOwned;
		this.noOfPlayers 		= noOfPlayers;
	}
	public int getPlayerID() {
		return playerID;
	}
	public int getArmies() {
		return noOfArmies;
	}
	public int getNoOfCountriesOwned() {
		return noOfCountriesOwned;
	}
	public int getNoOfPlayers() {
		return noOfPlayers;
	}
	//end of delete
	/**
	 * Iteration 1
     * Calculation the number of armies assigned to a players
     * 
	 * @param playerId the playerId to set
	 * @param noOfCountriesOwned the number of countries assigned to the Player
	 * @param noOfPlayers the total number of players set for the game
	 * @param totalCountriesInContinent the total number of Countries in a continent
	 */
     
	public static int armyCalculationPerPlayer(int playerID, int noOfCountriesOwned, int noOfPlayers,int totalCountriesInContinent)
	{
		HashMap<String, HashMap<String, String>> map = new HashMap<>();

		map.put("Player1", new HashMap(){{put("India","Pakistan");}});
		map.put("Player2", new HashMap(){{put("Canada","USA");}});

		System.out.println(map.get("Player1").size());	
		noOfCountriesOwned = map.get("Player1").size();
		
		System.out.println("Reinforcement: PlayerID"+playerID+"ownes Number Of Countries"+noOfCountriesOwned);
		if(noOfCountriesOwned != totalCountriesInContinent)
		{
		noOfArmiesForPlayer = noOfCountriesOwned/noOfPlayers;
		//Assign armies to countries
		System.out.println("Number of Armies owned by Player"+playerID+"is"+noOfArmiesForPlayer);
		}
		else
		{
			noOfArmiesForPlayer = totalCountriesInContinent; //TODO
			System.out.println("Number of Armies owned by Player"+playerID+"is"+"CONTINENTS CONTROL VALUE");
		}
		assignArmyToPlayer(playerID,noOfArmiesForPlayer);
		return noOfArmiesForPlayer;
	}
	public static void assignArmyToPlayer(int playerID,int noOfArmiesForPlayer)
	{
		HashMap<Integer, Integer> PlayerArmyMap = new HashMap<Integer, Integer>();
		PlayerArmyMap.put(playerID, noOfArmiesForPlayer); 
	}
	/**
	 * Iteration 2
     * Implementation of a “card exchange view” using the Observer pattern.
     * 
	 * @param playerId the playerId to set
	 * @param noOfCountriesOwned the number of countries assigned to the Player
	 * @param noOfPlayers the total number of players set for the game
	 * @param totalCountriesInContinent the total number of Countries in a continent
	 */
	public void CardExchangeView(int playerID, int noOfCountriesOwned, int noOfPlayers,int totalCountriesInContinent)
	{
	}
	
	
}


