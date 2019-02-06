package com.soen.risk.controller;

public class RiskPlayerValidator {
	
	public  boolean isValid(int n)
	{
		if(n>6||n<3){
			System.out.println("Try Again!!");
			return false;
		}
		else return true;
	}
}
