package modulo7.ejercicio2.domain;

public abstract class Animal {
	protected int legs;
	public Animal(int legs){
		this.legs=legs;
	}
	
	public abstract void eat();
	public void walks(){
		System.out.println("Este animal camina con " + legs + " patas.");
		
	}
}
