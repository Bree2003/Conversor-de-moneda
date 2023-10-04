package com.bree2003.conversorTemperatura;

import javax.swing.JOptionPane;
public class TemperaturaFuncion {

    //llamamos a la clase ConvertirTemperatura
    ConvertirTemperatura temperatura = new ConvertirTemperatura();

    //creamos método para acceder a las funciones de ConvertirTemperatura
    //en donde le pasamos nuestro número
    public void ConversorDeTemperatura (Double miGrado) {

        //colocamos un panel en donde pueda elegir el tipo de grado que tiene
        String tipoGrado = (JOptionPane.showInputDialog(null, "Elige de qué grado quieres convertir",
                "Temperatura", JOptionPane.PLAIN_MESSAGE, null,
                new Object[] {"Grados Celsius", "Grados Farenheit", "Grados Kelvin"}, "Selección")).toString();

        //ahora mostramos las diferentes opciones de conversión segun el tipo de grado dado
        switch (tipoGrado) {
            case "Grados Celsius":
                ConversorDeCelsius(miGrado);
                break;
            case "Grados Farenheit":
                ConversorDeFarenheit(miGrado);
                break;
            case "Grados Kelvin":
                ConversorDeKelvin(miGrado);
                break;
        }

    }

    //creamos los métodos
    private Double ConversorDeCelsius (Double miGrado) {

        String gradoAConvertir = (JOptionPane.showInputDialog(null, "A qué grado lo quieres convertir",
                "Convertir Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Convertir a grados Farenheit",
                        "Convertir a grados Kelvin"}, "Selecciona")).toString();

        //ahora trabajamos los casos
        switch (gradoAConvertir) {
            case "Convertir a grados Farenheit":
                temperatura.ConvertirCelsiusAFarenheit(miGrado);
                break;
            case "Convertir a grados Kelvin":
                temperatura.ConvertirCelsiusAKelvin(miGrado);
                break;
        }

        return miGrado;
    }
    private Double ConversorDeFarenheit (Double miGrado) {
        String gradoAConvertir = (JOptionPane.showInputDialog(null, "A qué grado lo quieres convertir",
                "Convertir Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Convertir a grados Celsius",
                        "Convertir a grados Kelvin"}, "Selecciona")).toString();

        //ahora trabajamos los casos
        switch (gradoAConvertir) {
            case "Convertir a grados Celsius":
                temperatura.ConvertirFarenheitACelsius(miGrado);
                break;
            case "Convertir a grados Kelvin":
                temperatura.ConvertirFarenheitAKelvin(miGrado);
                break;
        }

        return miGrado;
    }
    private Double ConversorDeKelvin (Double miGrado) {
        String gradoAConvertir = (JOptionPane.showInputDialog(null, "A qué grado lo quieres convertir",
                "Convertir Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Convertir a grados Farenheit",
                        "Convertir a grados Celsius"}, "Selecciona")).toString();

        //ahora trabajamos los casos
        switch (gradoAConvertir) {
            case "Convertir a grados Farenheit":
                temperatura.ConvertirKelvinAFarenheit(miGrado);
                break;
            case "Convertir a grados Celsius":
                temperatura.ConvertirKelvinACelsius(miGrado);
                break;
        }

        return miGrado;
    }

}
