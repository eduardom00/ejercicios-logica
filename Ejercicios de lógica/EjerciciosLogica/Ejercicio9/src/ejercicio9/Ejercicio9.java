package ejercicio9;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String palabra;
		HashMap<String, String> diccionario=new HashMap<>();
		
		diccionario.put("gato","cat");
		diccionario.put("perro","dog");
		diccionario.put("tigre","tiger");
		diccionario.put("elefante","elephant");
		diccionario.put("pajaro","bird");
		diccionario.put("caballo","horse");
		diccionario.put("ballena","whale");
		diccionario.put("araña","spider");
		diccionario.put("cerdo","pig");
		diccionario.put("conejo","rabbit");
		diccionario.put("cuervo","raven");
		diccionario.put("bufalo","buffalo");
		diccionario.put("cabra","goat");
		diccionario.put("delfin","dolphin");
		diccionario.put("tiburon","shark");
		diccionario.put("oso","bear");
		diccionario.put("leon","lion");
		diccionario.put("halcon","falcon");
		diccionario.put("zorro","fox");
		diccionario.put("toro","bull");
		System.out.println("Introduce una palabra a traducir");
		palabra=sc.nextLine();
		if(diccionario.containsKey(palabra)) {
			System.out.println(diccionario.get(palabra));
		} else {
			System.out.println("La palabra no se encuentra en el diccionario.");
		}


		










	}

}
