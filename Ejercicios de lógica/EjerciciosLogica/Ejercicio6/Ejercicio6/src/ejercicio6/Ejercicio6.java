package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	String palabra = "";
	String reversa = "";
	System.out.println("Introduce una palabra ");
	palabra = sc.nextLine();
	for (int i = 0; i < palabra.length(); i++) {
		reversa=palabra.charAt(i)+reversa;
	}
	System.out.println(reversa);
	}

}
