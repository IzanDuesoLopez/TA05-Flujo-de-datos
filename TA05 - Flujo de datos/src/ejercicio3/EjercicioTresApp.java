package ejercicio3;

import javax.swing.JOptionPane;

public class EjercicioTresApp {

	public static void main(String[] args) {

		// Pedimos al usuario que introduzca su nombre mediante JOptionPane
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");

		// Mostramos por pantalla la bienvenida + el nombre introducido utilizando JOptionPane
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);

	}

}
