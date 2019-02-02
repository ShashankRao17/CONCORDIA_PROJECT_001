/**
 * 
 */
package com.soen.risk.model;

import java.util.ArrayList;

/**
 * @author yogesh
 *
 */
public class RiskContinent {

	private String continentId;
	private String continentName;
	private int controllValue;
	private ArrayList<RiskTerritory> includedTerritories;
	/**
	 * @return the continentId
	 */
	public String getContinentId() {
		return continentId;
	}
	/**
	 * @param continentId the continentId to set
	 */
	public void setContinentId(String continentId) {
		this.continentId = continentId;
	}
	/**
	 * @return the continentName
	 */
	public String getContinentName() {
		return continentName;
	}
	/**
	 * @param continentName the continentName to set
	 */
	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}
	/**
	 * @return the controllValue
	 */
	public int getControllValue() {
		return controllValue;
	}
	/**
	 * @param controllValue the controllValue to set
	 */
	public void setControllValue(int controllValue) {
		this.controllValue = controllValue;
	}
	/**
	 * @return the includedTerritories
	 */
	public ArrayList<RiskTerritory> getIncludedTerritories() {
		return includedTerritories;
	}
	/**
	 * @param includedTerritories the includedTerritories to set
	 */
	public void setIncludedTerritories(ArrayList<RiskTerritory> includedTerritories) {
		this.includedTerritories = includedTerritories;
	}
	
	
}
