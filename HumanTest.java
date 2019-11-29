package com.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human lia = new Human();
		Human darrick = new Human();
		Wizard merlin = new Wizard();
		Ninja nigahiga = new Ninja();
		Samuri sam = new Samuri();
		
//		lia.printStats();
//		System.out.println();
//		
//		darrick.printStats();
//		System.out.println();
		
		lia.attack(darrick).printStats();
		darrick.printStats();
		System.out.println();
		
		System.out.println(Samuri.samuriCount);
		System.out.println();
		
		merlin.printStats().heal(lia);
		lia.printStats();
		System.out.println();
		
		nigahiga.printStats().steal(darrick).printStats();
		darrick.printStats();
		System.out.println();
		
		sam.printStats();
		System.out.println();
		
		sam.deathBlow(darrick);
		darrick.printStats();
		
		sam.deathBlow(merlin);
		merlin.printStats();
		
		merlin.heal(merlin).printStats();
		

	}

}
