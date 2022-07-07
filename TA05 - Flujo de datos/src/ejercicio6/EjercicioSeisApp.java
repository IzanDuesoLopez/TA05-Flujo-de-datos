package ejercicio6;

import java.util.Scanner;

public class EjercicioSeisApp {

	public static void main(String[] args) {

		final double IVA = 0.21; // Declaramos el IVA

		Scanner sc = new Scanner(System.in);

		// Pedimos por consola el precio de un producto y lo almacenamos en la variable 'precio'
		System.out.println("Introduce el precio de un producto: ");
		double precio = sc.nextDouble();

		// Mostramos por consola el precio del producto con IVA
		System.out.println("Precio final del producto con IVA = " + (precio + (precio * IVA)));
		
		sc.close();
	}

}
