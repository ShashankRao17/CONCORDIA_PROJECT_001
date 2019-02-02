/**
 * 
 */
package com.soen.risk.model;

import java.util.ArrayList;
import java.util.Vector;

import org.apache.log4j.Logger;

/**
 * @author yogesh
 *
 */
public class RiskTerritory {
	private static final Logger LOGGER = Logger.getLogger(RiskTerritory.class.getName());
	
	protected String territoryId;
	private int x;
	private int y;
	private String territoryName;
	private int armiesPresent;
	private String continent;
	private int continentId;
	private ArrayList<RiskTerritory> adjacents;
	private RiskPlayer terrtoryOwner;
	/**
	 * @return the territoryId
	 */
	public String getTerritoryId() {
		return territoryId;
	}
	/**
	 * @param territoryId the territoryId to set
	 */
	public void setTerritoryId(String territoryId) {
		this.territoryId = territoryId;
	}
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * @return the territoryName
	 */
	public String getTerritoryName() {
		return territoryName;
	}
	/**
	 * @param territoryName the territoryName to set
	 */
	public void setTerritoryName(String territoryName) {
		this.territoryName = territoryName;
	}
	/**
	 * @return the armiesPresent
	 */
	public int getArmiesPresent() {
		return armiesPresent;
	}
	/**
	 * @param armiesPresent the armiesPresent to set
	 */
	public void setArmiesPresent(int armiesPresent) {
		this.armiesPresent = armiesPresent;
	}
	/**
	 * @return the continent
	 */
	public String getContinent() {
		return continent;
	}
	/**
	 * @param continent the continent to set
	 */
	public void setContinent(String continent) {
		this.continent = continent;
	}
	/**
	 * @return the continentId
	 */
	public int getContinentId() {
		return continentId;
	}
	/**
	 * @param continentId the continentId to set
	 */
	public void setContinentId(int continentId) {
		this.continentId = continentId;
	}
	/**
	 * @return the adjacents
	 */
	public ArrayList<RiskTerritory> getAdjacents() {
		return adjacents;
	}
	/**
	 * @param adjacents the adjacents to set
	 */
	public void setAdjacents(ArrayList<RiskTerritory> adjacents) {
		this.adjacents = adjacents;
	}
	/**
	 * @return the terrtoryOwner
	 */
	public RiskPlayer getTerrtoryOwner() {
		return terrtoryOwner;
	}
	/**
	 * @param terrtoryOwner the terrtoryOwner to set
	 */
	public void setTerrtoryOwner(RiskPlayer terrtoryOwner) {
		this.terrtoryOwner = terrtoryOwner;
	}
			
}
