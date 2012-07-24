package com.modulo4.ejercicio1;

public class FooBarBaz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 1;
		String cad;
		while (i<=50){
			if (i%3 == 0){
				cad = " foo";
			}
			else if (i%5 == 0){
				cad = " bar";
			}
			else if (i%7 == 0){
				cad = " baz";
			}
			else {
				cad = "";
			}
			System.out.println(i + cad);
			i = i + 1;
		}

	}

}
