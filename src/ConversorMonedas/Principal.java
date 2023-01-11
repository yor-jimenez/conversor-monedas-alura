package ConversorMonedas;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		Function monedas = new Function ();
		
		String opciones = (JOptionPane.showInputDialog(null, "Seleccione " + 
		"una opcion de conversión", "Menu",JOptionPane.QUESTION_MESSAGE, 
		null, new Object[] { "Conversor de Moneda", "Conversor de Temperatura" },
		"Seleccion")).toString();
		switch (opciones) {
		case  "Conversor de Moneda": {
			String input = JOptionPane.showInputDialog("Ingrese un valor para "
			+ "convertir");
			double valorRecibido = Double.parseDouble(input);
			monedas.ConvertirMonedas(valorRecibido);
		}	
		}
		
		int seleccion = JOptionPane.showConfirmDialog(null, "Deseas realizar"
				+ " otra conversión?");
		if (JOptionPane.OK_OPTION == seleccion) {
			main(null);
		}else {
			JOptionPane.showMessageDialog(null, "Programa terminado");
		}
	}
	
	
}
	