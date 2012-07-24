package modulo7.ejercicio2.domain;

public class Fish extends Animal implements Pet {
 private String nombre;
 public Fish(){
	 super(0);
  }
 public String getName(){
	return nombre;
 }
 public void setName (String n){
	 this.nombre= n;
 }
 public void play(){
	 System.out.println("El pez nada todo el dia.");
 }
 public void eat(){
	 System.out.println("El pez come alimento de pez.");
 }
 
}
