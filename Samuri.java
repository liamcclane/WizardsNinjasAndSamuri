package com.objectmaster;

public class Samuri extends Human{
	
	// attributes inside Human class

	// this is a count how many Samuri's are made in total
	static int samuriCount=0 ;
	
	// constructors
	public Samuri() {
		setHealth(200);
		samuriCount ++;
	}
	
	// getter and setter inside the Human class
	
	// other methods
	
	// this method kills other players and reduces the Samuri's health by half
	public Samuri deathBlow(Human otherHuman) {
		otherHuman.setHealth(0);
		this.setHealth(this.getHealth()-(this.getHealth()/2));
		return this;
	}
	
	// this method heals the Samuri by half of the already existing health
	// health at 100 goes to 150
	public Samuri meditate() {
		this.setHealth(this.getHealth()+(this.getHealth()/2));
		return this;
	}

}
