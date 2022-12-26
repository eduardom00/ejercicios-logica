package ejercicio7;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String dia;
		int hora, minuto;
		int hoy = 0;
		int finDeSemana=6660;
		ArrayList<String>
		diaSemana= new ArrayList<String>();
		diaSemana.add("lunes"); diaSemana.add("martes"); diaSemana.add("miercoles"); diaSemana.add("jueves"); diaSemana.add("viernes");
		do {
			System.out.println("Introduce un día entre semana ");
			dia=sc.nextLine();
			if(!diaSemana.contains(dia)) {
				System.out.println("No se contiene el día, asegurate de usar minúsculas");
			};
		}while (!diaSemana.contains(dia));
		do {
			System.out.println("Introduce únicamente la hora del día: ");
			hora=sc.nextInt();
			if(hora<0||hora>23) {
				System.out.println("Introduce una hora valida, después introducirás el minuto");
			};
		}while (hora<0||hora>23);
		do {
			System.out.println("Introduce el minuto del dia: ");
			minuto=sc.nextInt();
			if(minuto<0||minuto>59) {
				System.out.println("Introduce un minuto valido ");
			};
		}while (minuto<0||minuto>59);
		
		//Partiremos desde un minuto, comparandolo con la semana
		switch (dia) {
		case "lunes":
			hoy = 0; break;
		case "martes":
			hoy = 1440; break;
		case "miercoles":
			hoy = 2880; break;
		case "jueves":
			hoy = 4320; break;
		case "viernes":
			hoy = 5760; break;
		}
		hoy+=((hora*60)+minuto);
		int resultado=finDeSemana-hoy;
		System.out.println("Faltan " + resultado + " minutos para el fin de seman");
	}
}
//El resultado está bien, aunque en el ejemplo de ejercicio aparece otro número
