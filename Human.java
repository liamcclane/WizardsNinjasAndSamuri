package com.objectmaster;

public class Human {
	
	// attributes
	private int stealth;
	private int strength;
	private int intelligence ;
	private int health = 100;
	
	// constructors
	public Human() {
		this(3,3,3);
	}
	public Human(int strength, int stealth, int intelligence ) {
		this.stealth = stealth;
		this.strength = strength;
		this.intelligence  = intelligence;
	}
	
	// getters RETURN something
	public int getStealth() {
		return this.stealth;
	}
	public int getStrength() {
		return this.strength;
	}
	public int getIntelligence() {
		return this.intelligence;
	}
	public int getHealth() {
		return this.health;
	}
	
	// setter methods
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	// other methods
	// method that reduces the health of the attacked human by the strength of the current human.
	public Human attack(Human otherHuman) {
		otherHuman.setHealth(otherHuman.getHealth()-this.getStrength());
		return this;
	}
	
	public Human printStats() {
		System.out.println("Human health is at : "+ this.health);
		System.out.println("Human strength is at : "+ this.strength);
		return this;
	}

}
