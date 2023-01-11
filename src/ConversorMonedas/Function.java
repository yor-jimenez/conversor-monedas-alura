package ConversorMonedas;

import javax.swing.JOptionPane;

public class Function {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	public void ConvertirMonedas(double  ValorRecibido) {
		String opcion = (JOptionPane.showInputDialog(null,
				"Elija la moneda a la que deseas convertir tu dinero" , 
				"Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]
				{ "De Pesos Colombianos a Dólar", "De Pesos Colombianos a Euro", "De Pesos Colombianos a Libras",
				"De Pesos Colombianos a Yen", "De Pesos Colombianos a Won Coreano", "De Dólar a Pesos Colombianos", 
				"De Euro a Pesos Colombianos", "De Libras a Pesos Colombianos"},"Seleccion")).toString();
		switch (opcion) {
		
		case "De Pesos Colombianos a Dólar":
			monedas.ConvertirPesosColombianosADolar(ValorRecibido);
			break;
		case "De Pesos Colombianos a Euro":
			monedas.ConvertirPesosColombianosAEuro(ValorRecibido);
			break;
		case "De Pesos Colombianos a Libras":
			monedas.ConvertirPesosColombianosADolar(ValorRecibido);
			break;
		case "De Pesos Colombianos a Yen":
			monedas.ConvertirPesosColombianosAEuro(ValorRecibido);
			break;
		case "De Pesos Colombianos a Won Coreano":
			monedas.ConvertirPesosColombianosADolar(ValorRecibido);
			break;
		case "De Dólar a Pesos Colombianos":
			monedas.ConvertirPesosColombianosAEuro(ValorRecibido);
			break;
		case "De Euro a Pesos Colombianos":
			monedas.ConvertirPesosColombianosADolar(ValorRecibido);
			break;
		case "De Libras a Pesos Colombianos":
			monedas.ConvertirPesosColombianosAEuro(ValorRecibido);
			break;
		}
	}
}
