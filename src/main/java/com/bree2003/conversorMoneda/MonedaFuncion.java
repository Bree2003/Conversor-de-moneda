package com.bree2003.conversorMoneda;
import com.bree2003.conversorTemperatura.ConvertirTemperatura;

import javax.swing.JOptionPane;
public class MonedaFuncion {


        //llamamos a la clase ConvertirTemperatura
        ConvertirMoneda moneda = new ConvertirMoneda();

        //creamos método para acceder a las funciones de ConvertirMoneda
        //en donde le pasamos nuestro número
        public void ConversorDeMoneda (Double miMoneda) {

            //colocamos un panel en donde pueda elegir el tipo de grado que tiene
            String tipoMoneda = (JOptionPane.showInputDialog(null, "Elige de qué moneda quieres convertir",
                    "Moneda", JOptionPane.PLAIN_MESSAGE, null,
                    new Object[] {"Pesos Chilenos", "Dólar", "Euros", "Libras Esterlinas", "Yen Japonés", "Won surcoreano"}, "Selección")).toString();

            //ahora mostramos las diferentes opciones de conversión segun el tipo de grado dado
            switch (tipoMoneda) {
                case "Pesos Chilenos":
                    ConversorDePesosChilenos(miMoneda);
                    break;
                case "Dólar":
                    ConversorDeDolar(miMoneda);
                    break;
                case "Euros":
                    ConversorDeEuros(miMoneda);
                    break;
                case "Libras Esterlinas":
                    ConversorDeLibrasEsterlinas(miMoneda);
                    break;
                case "Yen Japonés":
                    ConversorDeYenJapones(miMoneda);
                    break;
                case "Won surcoreano":
                    ConversorDeWonSurcoreano(miMoneda);
                    break;
            }

        }

        //creamos los métodos, private para que cuando llamemos moneda en otra clase solo se muestre el método ConversorDeMoneda
    private Double ConversorDePesosChilenos(Double miMoneda) {

        String monedaAConvertir = (JOptionPane.showInputDialog(null, "A qué moneda lo quieres convertir",
                "Convertir Moneda", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Convertir a Dólar",
                        "Convertir a Euros", "Convertir a Libras Esterlinas", "Convertir a Yen Japonés", "Convertir a Won Surcoreano"},
                "Selecciona")).toString();

        //ahora trabajamos los casos
        switch (monedaAConvertir) {
            case "Convertir a Dólar":
                moneda.ConvertirPesosADolar(miMoneda);
                break;
            case "Convertir a Euros":
                moneda.ConvertirPesosAEuro(miMoneda);
                break;
            case "Convertir a Libras Esterlinas":
                moneda.ConvertirPesosALibras(miMoneda);
                break;
            case "Convertir a Yen Japonés":
                moneda.ConvertirPesosAYen(miMoneda);
                break;
            case "Convertir a Won Surcoreano":
                moneda.ConvertirPesosAWon(miMoneda);
                break;
        }

        return miMoneda;

    }
    private Double ConversorDeDolar(Double miMoneda) {

        String monedaAConvertir = (JOptionPane.showInputDialog(null, "A qué moneda lo quieres convertir",
                "Convertir Moneda", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Convertir a Pesos Chilenos",
                        "Convertir a Euros", "Convertir a Libras Esterlinas", "Convertir a Yen Japonés", "Convertir a Won Surcoreano"},
                "Selecciona")).toString();

        //ahora trabajamos los casos
        switch (monedaAConvertir) {
            case "Convertir a Pesos Chilenos":
                moneda.ConvertirDolarAPesos(miMoneda);
                break;
            case "Convertir a Euros":
                moneda.ConvertirDolarAEuros(miMoneda);
                break;
            case "Convertir a Libras Esterlinas":
                moneda.ConvertirDolarALibras(miMoneda);
                break;
            case "Convertir a Yen Japonés":
                moneda.ConvertirDolarAYen(miMoneda);
                break;
            case "Convertir a Won Surcoreano":
                moneda.ConvertirDolarAWon(miMoneda);
                break;
        }

        return miMoneda;
    }
    private Double ConversorDeEuros(Double miMoneda) {

        String monedaAConvertir = (JOptionPane.showInputDialog(null, "A qué moneda lo quieres convertir",
                "Convertir Moneda", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Convertir a Dólar",
                        "Convertir a Pesos Chilenos", "Convertir a Libras Esterlinas", "Convertir a Yen Japonés", "Convertir a Won Surcoreano"},
                "Selecciona")).toString();

        //ahora trabajamos los casos
        switch (monedaAConvertir) {
            case "Convertir a Dólar":
                moneda.ConvertirEurosADolar(miMoneda);
                break;
            case "Convertir a Pesos Chilenos":
                moneda.ConvertirEurosAPesos(miMoneda);
                break;
            case "Convertir a Libras Esterlinas":
                moneda.ConvertirEurosALibras(miMoneda);
                break;
            case "Convertir a Yen Japonés":
                moneda.ConvertirEurosAYen(miMoneda);
                break;
            case "Convertir a Won Surcoreano":
                moneda.ConvertirEurosAWon(miMoneda);
                break;
        }

        return miMoneda;
    }
    private Double ConversorDeLibrasEsterlinas(Double miMoneda) {

        String monedaAConvertir = (JOptionPane.showInputDialog(null, "A qué moneda lo quieres convertir",
                "Convertir Moneda", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Convertir a Dólar",
                        "Convertir a Euros", "Convertir a Pesos Chilenos", "Convertir a Yen Japonés", "Convertir a Won Surcoreano"},
                "Selecciona")).toString();

        //ahora trabajamos los casos
        switch (monedaAConvertir) {
            case "Convertir a Dólar":
                moneda.ConvertirLibrasADolar(miMoneda);
                break;
            case "Convertir a Euros":
                moneda.ConvertirLibrasAEuros(miMoneda);
                break;
            case "Convertir a Pesos Chilenos":
                moneda.ConvertirLibrasAPesos(miMoneda);
                break;
            case "Convertir a Yen Japonés":
                moneda.ConvertirLibrasAYen(miMoneda);
                break;
            case "Convertir a Won Surcoreano":
                moneda.ConvertirLibrasAWon(miMoneda);
                break;
        }

        return miMoneda;
    }
    private Double ConversorDeYenJapones(Double miMoneda) {

        String monedaAConvertir = (JOptionPane.showInputDialog(null, "A qué moneda lo quieres convertir",
                "Convertir Moneda", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Convertir a Dólar",
                        "Convertir a Euros", "Convertir a Libras Esterlinas", "Convertir a Pesos Chilenos", "Convertir a Won Surcoreano"},
                "Selecciona")).toString();

        //ahora trabajamos los casos
        switch (monedaAConvertir) {
            case "Convertir a Dólar":
                moneda.ConvertirYenADolar(miMoneda);
                break;
            case "Convertir a Euros":
                moneda.ConvertirYenAEuros(miMoneda);
                break;
            case "Convertir a Libras Esterlinas":
                moneda.ConvertirYenALibra(miMoneda);
                break;
            case "Convertir a Pesos Chilenos":
                moneda.ConvertirYenAPesos(miMoneda);
                break;
            case "Convertir a Won Surcoreano":
                moneda.ConvertirYenAWon(miMoneda);
                break;
        }

        return miMoneda;
    }
    private Double ConversorDeWonSurcoreano(Double miMoneda) {

        String monedaAConvertir = (JOptionPane.showInputDialog(null, "A qué moneda lo quieres convertir",
                "Convertir Moneda", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Convertir a Dólar",
                        "Convertir a Euros", "Convertir a Libras Esterlinas", "Convertir a Yen Japonés", "Convertir a Pesos Chilenos"},
                "Selecciona")).toString();

        //ahora trabajamos los casos
        switch (monedaAConvertir) {
            case "Convertir a Dólar":
                moneda.ConvertirWonADolar(miMoneda);
                break;
            case "Convertir a Euros":
                moneda.ConvertirWonAEuros(miMoneda);
                break;
            case "Convertir a Libras Esterlinas":
                moneda.ConvertirWonALibras(miMoneda);
                break;
            case "Convertir a Yen Japonés":
                moneda.ConvertirWonAYen(miMoneda);
                break;
            case "Convertir a Pesos Chilenos":
                moneda.ConvertirWonAPesos(miMoneda);
                break;
        }

        return miMoneda;
    }

}
