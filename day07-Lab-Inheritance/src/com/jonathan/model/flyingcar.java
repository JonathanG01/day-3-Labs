package com.jonathan.model;

public class flyingcar extends vehicle {
	 private short wings;
	    private Engine engine;

	    public flyingcar(){}
	  

	     public void liftOff(){
	    System.out.println("FlyingVehicle is lifting off...");
	     }

	     public void land(){
	    System.out.println("FlyingVehicle is landing...");
	     }	
}
