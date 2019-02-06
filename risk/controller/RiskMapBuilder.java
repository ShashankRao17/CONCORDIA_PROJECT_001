/**
 * 
 */
package com.soen.risk.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.soen.risk.model.RiskContinent;
import com.soen.risk.model.RiskTerritory;

/**
 * @author yogesh
 *
 */
public class RiskMapBuilder {

	private String mapFilePath = "D:\\riskProject\\EarthMap.txt";
	static ArrayList<RiskContinent> continentList=new ArrayList<RiskContinent>();
	static ArrayList<RiskTerritory> terretoryList=new ArrayList<RiskTerritory>();
	static Map<String, List<String>> adjucencyMap=new HashMap<String, List<String>>();
	static boolean isMapSyntaxValid;

	
	public static void main(String[] args) {
		RiskMapBuilder riskMapBuilder = new RiskMapBuilder();
		RiskMapValidator riskMapValidator=new RiskMapValidator();
		List<String> parsedMapFile=riskMapBuilder.parseMapFile();
		isMapSyntaxValid = riskMapValidator.validateMapSyntax(parsedMapFile);
		continentList=riskMapBuilder.addContinents(parsedMapFile);
		terretoryList=riskMapBuilder.addTerretories(parsedMapFile);
		riskMapValidator.validateMap();
		continentList=riskMapBuilder.addTerretoriesToContinents(continentList,terretoryList);
		adjucencyMap=riskMapBuilder.buildAdjucencyMap(terretoryList);
		
	}
	

	
	
	


	private List<String> parseMapFile() {
		List<String> mapFileList = new ArrayList<String>();
		try {
			mapFileList = Files.readAllLines(Paths.get(mapFilePath), StandardCharsets.UTF_8);
		} catch (IOException e) {
			System.out.println("Error while reading map file.");
			e.printStackTrace();
		}
		return mapFileList;
	}
	
	boolean validateMapFile(List<String> mapFileList) {
		
		return true;
	}
	
	private ArrayList<RiskContinent> addContinents(List<String> mapFileList) {		
		ArrayList<RiskContinent> addedContinentList;
		int startIndex = 0;
		int endIndex = 0;
		RiskContinent riskContinent;
		
		startIndex=mapFileList.indexOf("[Continents]")+1;
		endIndex=mapFileList.indexOf("-")-1;
		addedContinentList = new ArrayList<RiskContinent>();
		for(int i=startIndex;i<=endIndex;i++) {
			String[] parsedContinenet=mapFileList.get(i).split("=");
			riskContinent=new RiskContinent(parsedContinenet[0],Integer.parseInt(parsedContinenet[1]));
			addedContinentList.add(riskContinent);
		}
		
		return addedContinentList;
	}

	private ArrayList<RiskTerritory> addTerretories(List<String> mapFileList) {
		ArrayList<RiskTerritory> addedTerretoryList;
		int startIndex = 0;
		int endIndex = 0;
		RiskTerritory riskTerritory;
		
		
		startIndex=mapFileList.indexOf("[Territories]")+1;
		endIndex=mapFileList.indexOf(";;")-1;
		addedTerretoryList=new ArrayList<RiskTerritory>();
		for(int i=startIndex;i<=endIndex;i++) {
			String[] parsedTerritory=mapFileList.get(i).split(",");
			if(validateContinent(parsedTerritory[1])) {
				riskTerritory=new RiskTerritory(parsedTerritory);
				addedTerretoryList.add(riskTerritory);
			}
			else
				System.out.println("Invalid Continent added for country : "+parsedTerritory[0]);
		}
		return addedTerretoryList;
	}
	
	
	private ArrayList<RiskContinent> addTerretoriesToContinents(ArrayList<RiskContinent> continentList, List<RiskTerritory> territoryList) {
		ArrayList<RiskContinent> loadedContinentList = continentList;
		ArrayList<String> tempRiskTerritories;
		
		for (RiskTerritory currentTerritory : territoryList) {
			for (RiskContinent currentContinent : loadedContinentList) {
				if((currentContinent.getContinentName()).equalsIgnoreCase(currentTerritory.getContinent())) {
					tempRiskTerritories=new ArrayList<String>();
					if(null!=currentContinent.getIncludedTerritories())
					tempRiskTerritories=currentContinent.getIncludedTerritories();
					tempRiskTerritories.add(currentTerritory.getTerritoryName());
					currentContinent.setIncludedTerritories(tempRiskTerritories);
				}
			}
		}
		
		return loadedContinentList;
	}

	/**
	 * @param continentName
	 * @return
	 */
	private boolean validateContinent(String continentName){
		
		return true;
	}
	
	/**
	 * @param terretoryList
	 * @return
	 */
	private Map<String, List<String>> buildAdjucencyMap(ArrayList<RiskTerritory> terretoryList) {
		Map<String, List<String>> loadedAdjMap=new HashMap<String, List<String>>();
		
		for (RiskTerritory currentTerritory : terretoryList) {
			loadedAdjMap.put(currentTerritory.getTerritoryName(), currentTerritory.getAdjacents());
		}
		return loadedAdjMap;
	}
	
	public ArrayList<RiskTerritory> getTerritoryList(){
	
		return terretoryList;
	}
	
	public ArrayList<RiskContinent> getcontinentList(){
		
		return continentList;
	}
	
	public Map<String, List<String>> getAdjucencyMap(){
		
		return adjucencyMap;
	}

}
