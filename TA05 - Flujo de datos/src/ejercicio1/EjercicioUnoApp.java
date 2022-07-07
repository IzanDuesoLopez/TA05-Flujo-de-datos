package ejercicio1;

public class EjercicioUnoApp {

	public static void main(String[] args) {

		int a = 90;
		int b = 90;

		if (a > b) { // Si la variable A es mayor que la variable B
			System.out.println("La variable A(" + a + ") es mayor que la variable B(" + b + ")");
		} else if (b > a) { // Si la variable B es mayor que la variable A
			System.out.println("La variable B(" + b + ") es mayor que la variable A(" + a + ")");
		} else { // Si A no es mayor que B y B no es mayor que A, son iguales
			System.out.println("La variable B(" + b + ") es igual a la variable A(" + a + ")");
		}

	}

}
