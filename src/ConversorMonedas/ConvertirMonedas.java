package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	public void ConvertirPesosColombianosADolar(double valorRecibido) {
		double monedaDolar = valorRecibido / 4785.50;
		monedaDolar = (double) Math.round (monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Dolares");
	}
	public void ConvertirPesosColombianosAEuro(double valorRecibido) {
		double monedaEuro = valorRecibido / 5141.11;
		monedaEuro = (double) Math.round (monedaEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaEuro + " Euros");
	}
	public void ConvertirPesosColombianosALibras(double valorRecibido) {
		double monedaLibras = valorRecibido / 5817.85;
		monedaLibras = (double) Math.round (monedaLibras * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaLibras + " Libras");
	}
	public void ConvertirPesosColombianosAYen (double valorRecibido) {
		double monedaYen = valorRecibido / 36.18;
		monedaYen = (double) Math.round (monedaYen * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaYen + " Yen");
	}
	public void ConvertirPesosColombianosAWonCoreano (double valorRecibido) {
		double monedaWonCoreano = valorRecibido / 3.84;
		monedaWonCoreano = (double) Math.round (monedaWonCoreano * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaWonCoreano + 
		" Won Coreano");
	}
	public void ConvertirDolarAPesosColombianos (double valorRecibido) {
		double monedaPesosColombianos = valorRecibido / 4732.67;
		monedaPesosColombianos = (double) Math.round (monedaPesosColombianos * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesosColombianos + 
		" Pesos Colombianos");
	}
	public void ConvertirEuroAPesosColombianos (double valorRecibido) {
		double monedaPesosColombianos = valorRecibido / 5090.91;
		monedaPesosColombianos = (double) Math.round (monedaPesosColombianos * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesosColombianos + 
		" Pesos Colombianos");
	}
	public void ConvertirLibrasAPesosColombianos (double valorRecibido) {
		double monedaPesosColombianos = valorRecibido / 5749.5051;
		monedaPesosColombianos = (double) Math.round (monedaPesosColombianos * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesosColombianos + 
		" Pesos Colombianos");
	}
}