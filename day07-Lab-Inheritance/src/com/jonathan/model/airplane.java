package com.jonathan.model;

public class airplane extends flyingcar {
	
	 private short wheels;
	    private short propellers;

	    //getters and setters
	    public short getWheels(){ return this.wheels; }
	    public void setWheels(short wheels){ this.wheels = wheels; }

	    public short propellors() { return this.propellers; }
	    public void setPropellers(short propellers) {this.propellers = propellers; }

	    public void turn(){
	        System.out.println("Turning...");}
	   }
