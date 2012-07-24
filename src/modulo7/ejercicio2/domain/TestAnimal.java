package modulo7.ejercicio2.domain;

public class TestAnimal {

	public static void main(String[] args) {
		Fish f= new Fish();
		Cat c = new Cat("Fluffy");
		Animal a = new Fish();
		Animal e = new Spider();
		Pet p = new Cat();
        
		f.play();
		c.play();
		
		e.eat();
		e.walks();
		
		a.walks();
		a.eat();
		System.out.println("-------------");
		
		p.setName("Carly");
		p.play();
		System.out.println("-------------");
		c.eat();
		c.getName();
		
		
	}

}
