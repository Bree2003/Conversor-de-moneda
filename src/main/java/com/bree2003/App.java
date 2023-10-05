package com.bree2003;
import com.bree2003.conversorMoneda.MonedaFuncion;
import com.bree2003.conversorTemperatura.TemperaturaFuncion;

import javax.swing.JOptionPane;
public class App
{
    public static void main( String[] args ) {

        //creamos condición para que se vuelva a ejecutar el programa
        Boolean continuar = true;

        //creamos bucle y envolvemos todo el código
        while (continuar) {

            //inicializamos la clase
            MonedaFuncion moneda = new MonedaFuncion();
            TemperaturaFuncion temperatura = new TemperaturaFuncion();

            //hacemos un menú para que eliga entre moneda o temperatura
            String menu = (JOptionPane.showInputDialog(null, "Qué quieres hacer", "Menú de Opciones", JOptionPane.PLAIN_MESSAGE, null,
                    new Object[]{"Conversor de Temperatura", "Conversor de Moneda"}, "Selección")).toString();

            //lo separamos en casos
            switch (menu) {
                case "Conversor de Temperatura":
                    //creamos input para el dato
                    String inputTemperatura = JOptionPane.showInputDialog("Ingresa tu temperatura");

                    //validamos si es double
                    if (ValidarNumero(inputTemperatura)) {

                        //y se lo pasamos a esta variable
                        Double miGrado = Double.parseDouble(inputTemperatura);
                        //y usamos los métodos
                        temperatura.ConversorDeTemperatura(miGrado);

                    } else {
                        //le decimos que hacer en caso de error
                        JOptionPane.showMessageDialog(null, "Ingreso no válido. Intentalo de nuevo");
                    }
                    break;
                case "Conversor de Moneda":
                    //creamos input para el dato
                    String inputMoneda = JOptionPane.showInputDialog("Ingresa tu moneda");

                    //validamos si es double
                    if (ValidarNumero(inputMoneda)) {

                        //y se lo pasamos a esta variable
                        Double miMoneda = Double.parseDouble(inputMoneda);
                        //y usamos los métodos
                        moneda.ConversorDeMoneda(miMoneda);

                    } else {
                        //le decimos que hacer en caso de error
                        JOptionPane.showMessageDialog(null, "Ingreso no válido. Intentalo de nuevo");
                    }

                    break;
            }

            //creamos condición de término (yes = 0, no = 1, cancel = 2)
            int repetirPrograma = JOptionPane.showConfirmDialog(null, "Quieres continuar?",
                    "Confirmación", JOptionPane.YES_NO_OPTION);

            continuar = (repetirPrograma == JOptionPane.YES_OPTION);

        }

    }

    private static Boolean ValidarNumero(String numero) {
        try {
            Double formatoDato = Double.parseDouble(numero);
            if (formatoDato >= 0 || formatoDato < 0 ) {
                return true;
            }
        } catch(NumberFormatException e) {
            return false;
        }
        return false;
    }
}
