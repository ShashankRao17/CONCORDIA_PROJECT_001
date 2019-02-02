/**
 * 
 */
package com.soen.risk.model;

import java.util.ArrayList;

import org.apache.log4j.Logger;

/**
 * @author yogesh
 *
 */
public class RiskPlayer {

	private static final Logger LOGGER = Logger.getLogger(RiskPlayer.class.getName());

	private String playerId;
	private String playerName;
	private ArrayList<RiskTerritory> occupiedTerritories;
	private ArrayList<RiskContinent> occupiedContinents;
	private int armiesOwned;
	private ArrayList<RiskCard> cardOwned;
	/**
	 * @return the playerId
	 */
	public String getPlayerId() {
		return playerId;
	}
	/**
	 * @param playerId the playerId to set
	 */
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}
	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	/**
	 * @return the occupiedTerritories
	 */
	public ArrayList<RiskTerritory> getOccupiedTerritories() {
		return occupiedTerritories;
	}
	/**
	 * @param occupiedTerritories the occupiedTerritories to set
	 */
	public void setOccupiedTerritories(ArrayList<RiskTerritory> occupiedTerritories) {
		this.occupiedTerritories = occupiedTerritories;
	}
	/**
	 * @return the occupiedContinents
	 */
	public ArrayList<RiskContinent> getOccupiedContinents() {
		return occupiedContinents;
	}
	/**
	 * @param occupiedContinents the occupiedContinents to set
	 */
	public void setOccupiedContinents(ArrayList<RiskContinent> occupiedContinents) {
		this.occupiedContinents = occupiedContinents;
	}
	/**
	 * @return the armiesOwned
	 */
	public int getArmiesOwned() {
		return armiesOwned;
	}
	/**
	 * @param armiesOwned the armiesOwned to set
	 */
	public void setArmiesOwned(int armiesOwned) {
		this.armiesOwned = armiesOwned;
	}
	/**
	 * @return the cardOwned
	 */
	public ArrayList<RiskCard> getCardOwned() {
		return cardOwned;
	}
	/**
	 * @param cardOwned the cardOwned to set
	 */
	public void setCardOwned(ArrayList<RiskCard> cardOwned) {
		this.cardOwned = cardOwned;
	}
	
	
}
