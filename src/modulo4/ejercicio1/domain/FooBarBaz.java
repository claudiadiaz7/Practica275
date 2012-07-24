package modulo4.ejercicio1.domain;

public class FooBarBaz {
 public int i;
 public String SetFooBarBaz(int i){
	 String tipo;
	 tipo = "";
	if (i % 3 == 0) {
		tipo = "Foo";
	}
	if (i % 5 == 0 ){
		if (tipo==""){
				tipo = "Bar";
		} else {
			tipo = tipo + " Bar";
		}
		
	}
	 if (i % 7 == 0){
		 if (tipo==""){
			 tipo = "Baz";
		 } else {
			 tipo= tipo + " Baz";
		 }
		 
	 }
	 return tipo;
 }
}
