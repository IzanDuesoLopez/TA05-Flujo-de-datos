package ejercicio13;

import java.util.Scanner;

public class EjercicioTreceApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Pedimos por consola los dos operandos
		System.out.println("Introduce operando A");
		int a = sc.nextInt();
		System.out.println("Introduce operando B");
		int b = sc.nextInt();
		System.out.println("Introduce un signo aritmético (+, -, *, /, ^, %)"); // Pedimos un signo aritmético
		String signo = sc.next();
		int resultado;
		double resultadoDecimal;

		// Utilizamos un switch para controlar los diferentes casos
		switch (signo) {
		case "+":
			resultado = a + b; // Sumamos
			System.out.println(a + " + " + b + " = " + resultado);
			break;
		case "-":
			resultado = a - b; // Restamos
			System.out.println(a + " - " + b + " = " + resultado);
			break;
		case "*":
			resultado = a * b; // Multiplicamos
			System.out.println(a + " * " + b + " = " + resultado);
			break;
		case "/":
			resultadoDecimal = (double)a / (double)b; // Dividimos casteando a y b a double para mostrar los decimales
			System.out.println(a + " / " + b + " = " + resultadoDecimal);
			break;
		case "^":
			resultadoDecimal = Math.pow((double)a, (double)b); // Utilizamos el método Math.pow para conseguir el resultado, castenado a double
																// para mostrar los decimales
			System.out.println(a + " elevado a " + b + " = " + resultadoDecimal);
			break;
		case "%":
			resultado = a % b; // Realizamos el módulo, resto de dividir a / b
			System.out.println(a + " % " + b + " = " + resultado);
			break;
		default: // Si el usuario no introduce por consola un operador aritmético válido
			System.out.println("¡Operador aritmético no válido!");
		}
		
		sc.close();

	}

}
