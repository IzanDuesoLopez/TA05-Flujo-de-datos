package ejercicio4;

import javax.swing.JOptionPane;

public class EjercicioCuatroApp {

	public static void main(String[] args) {

		final double NUMEROPI = Math.PI; // declaramos la constante PI

		String radio = JOptionPane.showInputDialog("Introduce el radio del círculo:"); // Pedimos por pantalla el radio del círculo																						
		double numRadio = Double.parseDouble(radio); // Almacenamos en la variable numRadio el radio pedido por pantalla
		numRadio = Math.pow(numRadio, 2); // Utilizamos el método Math.pow para elevar el radio al cuadrado

		JOptionPane.showMessageDialog(null, "Área del circulo = " + (NUMEROPI * numRadio)); // Finalmente, mostramos el área del círculo
	}

}
