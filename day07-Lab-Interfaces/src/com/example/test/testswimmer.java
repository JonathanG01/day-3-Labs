package com.example.test;
import com.example.model.whale;
import com.example.model.swimmer;


public class testswimmer {
	public static void main(String[] args) {
		swimmer beluga;
        beluga = new whale();
		beluga.swim();
		beluga.dive();
		
		System.out.println("There are "+swimmer.NUMBER_OF_FEET_IN_A_LEAGUE+" in a league.");
		
		int feetTraveled = 80_000;
		System.out.println("So if the whales went "+feetTraveled+" feet, they "
				+ "would have gone "+ swimmer.convertFromFeetToLeagues(feetTraveled)+" leagues.");
	}
	}

