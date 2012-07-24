package modulo4.ejercicio1.domain;

public class TestFooBarBaz {

	public static void main(String[] args) {
		int i;
		FooBarBaz tipo= new FooBarBaz();
		
		for (i = 1; i < 51; i++) {
			System.out.println( i + " " +tipo.SetFooBarBaz(i));
		}

	}

}
