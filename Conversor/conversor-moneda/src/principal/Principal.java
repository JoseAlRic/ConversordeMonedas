package principal;

import javax.swing.JOptionPane;

import ConversorMonedas.Moneda;
import ConversorTemperatura.Temperatura;

public class Principal {
    public static void main (String[] args) {

        Moneda monedas = new Moneda();
        Temperatura temperatura = new Temperatura();
             
        while(true) {
        	
        	String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();

        	switch(opciones) {
        	case "Conversor de Moneda":
        		 String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero a convertir: ");
                 if(ValidarNumero(input) == true) {
                     double Minput = Double.parseDouble(input);
                     monedas.ConvertirMonedas(Minput);

                     int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                     if (JOptionPane.OK_OPTION == respuesta){
                     	System.out.println("Selecciona opción Afirmativa");
                     }else{
                        	JOptionPane.showMessageDialog(null, "Programa terminado");                         
                     }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");                
                    }
                     	break;
        	

        	 case "Conversor de Temperatura":
        	 input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura a convertir ");
             if(ValidarNumero(input) == true) {
                 double Minput = Double.parseDouble(input);
                 temperatura.ConvertirTemperatura(Minput);

                 int respuesta = 0;
                 respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                 if((respuesta == 0) && (ValidarNumero(input) == true)) { 
                 } else {
                     JOptionPane.showMessageDialog(null, "Programa terminado");                     
                 }

             } else {
                 JOptionPane.showMessageDialog(null, "Valor inválido");                
             }
             break;
        }                
    }
               
  }
    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}
        	
