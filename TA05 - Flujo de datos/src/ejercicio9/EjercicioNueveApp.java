package ejercicio9;

public class EjercicioNueveApp {

	public static void main(String[] args) {

		// Utilizamos un bucle FOR
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 3 == 0) { // Si el valor de i es divisible entre 2 y 3, mostramos i por consola
				System.out.println(i);
			} 
		}
	}
}
