package ejercicio5;

import java.util.Scanner;

public class EjercicioCincoApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Declaramos el Scanner para introducir valores por consola

		// Pedimos al usuario el número por pantalla
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		int resultado = num % 2; // Calculamos el resto del número

		if (resultado == 0) { // Si el resto es = a 0
			System.out.println("El numero " + num + " es divisible entre 2, el resto es " + resultado);
		} else { // Si el resto es != de 0
			System.out.println("El numero " + num + " no es divisible entre 2, el resto es " + resultado);
		}
		
		sc.close();
	}

}
