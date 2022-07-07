package ejercicio10;

import java.util.Scanner;

public class EjercicioDiezApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario el número de ventas a introducir
		System.out.println("Número de ventas a introducir: ");
		int ventas = sc.nextInt();
		double sumaVentas = 0.0; // En sumaVentas almacenaremos la suma total de todas las ventas

		// Mediante un bucle FOR pediremos tantas ventas como el usuario haya indicado
		for (int i = 1; i <= ventas; i++) {
			System.out.println("Introduce la venta numero " + i + ":");
			double precioVenta = sc.nextDouble(); // Introducimos por teclado el precio de la venta
			sumaVentas += precioVenta; // sumaVentas = sumaVentas + precioVenta
		}
		
		System.out.println("Suma de todas las ventas = " + sumaVentas);
		
		sc.close();
	}

}
