package ejercicio7;

public class EjercicioSieteApp {

	public static void main(String[] args) {

		int i = 1; // Declaramos un contador

		/* Mientras i sea mayor o igual a 1 y i sea menor o igual a 100, mostraremos
		 el valor de i y en cada iteración incrementaremos su valor en 1. i+=1; */
		System.out.println("Números del 1 al 100 con un WHILE");
		while (i >= 1 && i <= 100) {
			System.out.println(i);
			i++;
		}
		
	}

}
