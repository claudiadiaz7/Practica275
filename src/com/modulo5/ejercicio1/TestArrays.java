package com.modulo5.ejercicio1;

public class TestArrays {

	public static void printArray(int[] array){
		System.out.print('<');
		for (int i=0;i<array.length;i++){
			System.out.print(array[i]);
			if ((i+1)<array.length){
				System.out.print(", ");
			}
		}
		System.out.println('>');
	}
	
	public static void printElement(int[] array){
		System.out.print('<');
		for (int elemento : array){
			System.out.print(elemento + ",");			
		}
		System.out.println('>');
	}
	
	public static void main(String[] args) {
		int[] array1 = {2,3,5,7,11,13,17,19};
		int[] array2;
		int[] array3= new int[array1.length];
		System.out.print("Array 1: ");
		printArray(array1);
		System.out.print("Array 2: ");
		array2=array1;
		printArray(array2);
		
		for (int i=0;i<array2.length;i=i+2){
			array2[i]=i;
		}
		System.out.print("Array 1: ");
		printArray(array1);
		
		printElement(array1);
		
		System.arraycopy(array1,  0, array3, 0, array1.length);
		printArray(array3);
		
		for (int i=1;i<array3.length;i=i+2){
			array3[i]=0;
		}
		System.out.print("Array 1: ");
		printArray(array1);
		System.out.print("Array 3: ");
		printArray(array3);
	}
}
