package modulo7.ejercicio2.domain;

public class Cat extends Animal implements Pet{
	private String nombre;
	public Cat(String nombre){
		super(4);
		this.nombre= nombre;
	}
	public Cat(){
		this("");
	}
	 public String getName(){
		return nombre; 
	 }
	   public void setName (String n){
		   nombre=n;
	   }
	   public void play(){
		   System.out.println(nombre + " le gusta jugar con cadenas.");
	   }
	   public void eat(){
		   System.out.println("El gato come aranas y peces.");
	   }
}
