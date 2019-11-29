package com.objectmaster;

public class Ninja extends Human{
	// attributes in Human class
	// constructors
	public Ninja() {
		setStealth(10);
	}
	
	// getters and setting in the Human class
	
	// other methods
	public Ninja steal(Human otherHuman){
		otherHuman.setHealth(otherHuman.getHealth()-this.getStealth());
		this.setHealth(this.getStealth()+this.getHealth());
		return this;
	}
	
	public Ninja runAway(){
		this.setHealth(this.getHealth()-10);
		return this;
	}
	
	public Ninja printStats(){
		System.out.println("Ninja Health : " + this.getHealth());
		System.out.println("Ninja Stealth : "+ this.getStealth());
		return this;
	}

}
