package com.soen.risk.controller;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.soen.risk.model.RiskPlayer;

public class RiskPlayerBuilder {

	static ArrayList<RiskPlayer> riskPlayerList;
	static ArrayList<String> nameOfPlayers;
	
	
//	public static void main(String args[]) {
	public RiskPlayerBuilder(){

		Scanner s = new Scanner(System.in);
		int numberOfPlayers;
		nameOfPlayers = new ArrayList<String>();
		int playerCounter=1;
		RiskPlayerValidator riskPlayerValidator=new RiskPlayerValidator();

		do {
			System.out.println("Enter no. of players");
			numberOfPlayers = s.nextInt();
		} while (!riskPlayerValidator.isValid(numberOfPlayers));
		
		System.out.println("Enter names");
		
		
		while( playerCounter<=numberOfPlayers) {
//			System.out.println(s.next());
			nameOfPlayers.add(s.next());
			playerCounter++;
		}
		

		ArrayList numbers = new ArrayList();
		for (int j = 1; j <= numberOfPlayers; j++) {
			numbers.add(j);
		}
		
		Collections.shuffle(numbers);
		System.out.println(numbers);
	
		
	}

	
	void addPlayer(ArrayList<String> nameOfPlayers){
		ArrayList<RiskPlayer> tempRiskPlayerList=new ArrayList<RiskPlayer>();
		RiskPlayer riskPlayer; 
		
		for (String currerntPlayerName: nameOfPlayers) {
			riskPlayer=new RiskPlayer();
			riskPlayer.setPlayerName(currerntPlayerName);
			tempRiskPlayerList.add(riskPlayer);
		}
		riskPlayerList= tempRiskPlayerList;
		
		
	}
	
	ArrayList<RiskPlayer> getRiskPlayers(){
		
		return riskPlayerList;
		
	}
}


