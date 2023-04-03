package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	
	public void ConvertirDolaresAPesos(double valor) {
		double monedaDolar = valor / 0.055;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos");
	}
	
	public void ConvertirEurosAPesos(double valor) {
		double monedaEuro = valor / 0.051;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos");
	}
	
	public void ConvertirLibrasAPesos(double valor) {
		double monedaLibra = valor / 0.045;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos");
	}
	
	public void ConvertirYenAPesos(double valor) {
		double monedaYen = valor / 7.33;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos");
	}
	
	public void ConvertirWonAPesos(double valor) {
		double monedaWon = valor / 72.49;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos");
	}
}
