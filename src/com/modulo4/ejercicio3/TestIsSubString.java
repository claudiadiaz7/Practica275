package com.modulo4.ejercicio3;

public class TestIsSubString {

	public boolean isSubString(String cad, String cadena){
		boolean resp = false;
		int lenCad = cad.length();
		int lenCadena = cadena.length();
		salir:
		for (int i = 0; i <= lenCadena - 1; i++){
			for (int j = 0; j < lenCad ; j++){
				
				if (cadena.charAt(i) == cad.charAt(j)){
					i++;
				}
				else {
					break;
				}
				if(j==lenCad-1){
					resp = true;
					break salir;
				}
			}
		}
		return resp;
	}
	
	public static void main(String[] args) {
		TestIsSubString str = new TestIsSubString();
		String c1, c2, resp;
		c1="hat";
		c2="The cat in the hat.";
		if (str.isSubString(c1,c2)){
			resp="SI";
		}
		else {
			resp="NO";
		}
		System.out.println("'" + c1 + "' " + resp + " es substring de '" + c2 + "' ");

	}

}
