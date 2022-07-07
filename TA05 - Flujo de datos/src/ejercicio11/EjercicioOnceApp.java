package ejercicio11;

import java.util.Scanner;

public class EjercicioOnceApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un día de la semana");
		String diaSemana = sc.next(); // Introducimos un día de la semana

		switch (diaSemana) {
		case "Lunes":
			System.out.println("Es un día laboral");
			break;
		case "Martes":
			System.out.println("Es un día laboral");
			break;
		case "Miercoles":
			System.out.println("Es un día laboral");
			break;
		case "Jueves":
			System.out.println("Es un día laboral");
			break;
		case "Viernes":
			System.out.println("Es un día laboral");
			break;
		case "Sabado":
			System.out.println("No es un día laboral");
			break;
		case "Domingo":
			System.out.println("No es un día laboral");
			break;
		default:
			System.out.println("¡El día que has introducido no es correcto!");
		}
		
		sc.close();
	}

}
