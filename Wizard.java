package com.objectmaster;

public class Wizard extends Human{
	// attributes inside of the Human class
	
	// constructor is diff since stats are diff
	public Wizard() {
		setHealth(50);
		setIntelligence(8);
	}
	
	// setters and getter inside of Human class
	
	// other methods
	// this method heals another human baised on the wizards intelligence
	public Wizard heal(Human otherHuman) {
		otherHuman.setHealth(otherHuman.getHealth()+this.getIntelligence());
		return this;
	}
	
	// decreases the other human's health by the wizard's intelligence
	public Wizard fireball(Human otherHuman) {
		otherHuman.setHealth(otherHuman.getHealth()-this.getIntelligence());
		return this;
	}
	
	// what I want printed for a Wizard
	public Wizard printStats() {
		System.out.println("Wizards Health : " + this.getHealth());
		System.out.println("Wizards intelligence : " + this.getIntelligence());
		return this;
	}
}
