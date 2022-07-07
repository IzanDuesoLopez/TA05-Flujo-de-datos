package ejercicio12;

import java.util.Scanner;

public class EjercicioDoceApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String contraseña = "java"; // La contraseña almacenada en la String sera 'Java'
		String passUsuario = ""; // String en la que guardaremos la pass introducida por el usuario
		boolean passCorrecta = false; // Booleano para saber si la contraseña es correcta
		boolean masDeTresIntentos = false; // Booleano para saber si hemos excedido el número de intentos
		int intentos = 0; // Contador con el número de intentos

		// Al menos entramos una vez al bucle
		do {
			System.out.println("Introduce tu contraseña: (Número de intentos = " + intentos + ")");
			passUsuario = sc.nextLine(); // Pedimos la pass al usuario
			intentos++; // Incrementamos en 1 el número de intentos
			if (passUsuario.equals(contraseña)) { // Si la contraseña que introduce el usuario es correcta
				passCorrecta = true;
			}
			if (intentos > 3) { // Sí superamos el máximo de intentos
				masDeTresIntentos = true;
			}
		} while (!passUsuario.equals(contraseña) && intentos <= 3); // Mientras la contraseña no coincida y no hayamos
																	// excedido el número de intentos

		if (passCorrecta) { // Si la contraseña es correcta damos la enhorabuena
			System.out.println("Enhorabuena");
		}

		/*
		 * En el caso de poner la contraseña correcta en el último intento, el contador
		 * sería 4 y por tanto llegaríamos a la condición de haber superado los
		 * intentos. Este booleano será false, ya que hemos acertado en el último
		 * intento disponible.
		 */

		if (masDeTresIntentos && !passCorrecta) { // Si hemos utilizado todos los intentos, y por tanto no hemos llegado
													// a una pass correcta
			System.out.println("Contraseña incorrecta, has llegado al límite de intentos");
		}
		
		sc.close();
	}

}
