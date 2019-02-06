package com.soen.risk.controller;

import java.util.ArrayList;

import com.soen.risk.model.RiskPlayer;

public class Tester {

	public static void main(String[] args) {
		
		RiskPlayerBuilder riskPlayerBuilder=new RiskPlayerBuilder();
		ArrayList<String> nameOfPlayers=riskPlayerBuilder.nameOfPlayers;
		ArrayList<RiskPlayer> riskPlayerList=new ArrayList<RiskPlayer>();
				
		riskPlayerBuilder.addPlayer(nameOfPlayers);
		riskPlayerList=riskPlayerBuilder.getRiskPlayers();
		
	}

}
