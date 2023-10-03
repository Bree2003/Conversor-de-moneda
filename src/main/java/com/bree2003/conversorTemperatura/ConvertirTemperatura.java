package com.bree2003.conversorTemperatura;
import javax.swing.JOptionPane;
public class ConvertirTemperatura {

    //se agregan los respectivos métodos para celsius, farenheit y kelvin

    //de celsius a farenheit
    public Double ConvertirCelsiusAFarenheit (Double celsius) {

        //creamos la operación para cambiar de unidad
        Double farenheit = (celsius * 1.8) + 32;

        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, celsius + " grados Celsius son " + farenheit + " grados Farenheit");

        //retornamos el valor farenheit
        return farenheit;

    }
    //de celsius a kevin
    public Double ConvertirCelsiusAKelvin (Double celsius) {

        //creamos la operación para cambiar de unidad
        Double kelvin = celsius + 273.15;

        //lo mostramos con showMesageDialog
        JOptionPane.showMessageDialog(null, celsius + " grados Celsius son " + kevin + " grados Kelvin");

        //retornamos el valor kelvin
        return kelvin;

    }
    //de farenheit a celsius
    public Double ConvertirFarenheitACelsius (Double farenheit) {

        //creamos la operación para cambiar de unidad
        Double celsius = (farenheit - 32) /1.8;

        //lo mostramos con showMessageDialog
        JOptionPane.showMessageDialog(null, farenheit + " grados Farenheit son " + celsius + " grados Celsius");

        //retornamos el valor celsius
        return celsius;
    }
    //de farenheit a kelvin
    public void ConvertirFarenheitAKelvin (Double farenheit) {

        //creamos la operación para cambiar de unidad
        Double celsius = ConvertirFarenheitACelsius(farenheit);
        Double kelvin = ConvertirCelsiusAKevin(celsius);

        //lo mostramos en showMessageDialog
        JOptionPane.showMessageDialog(null, farenheit + " grados Farenheit son " + kelvin + " grados Kelvin");

    }
    //de kelvin a celsius
    public Double ConvertirKelvinACelsius (Double kelvin) {

        //creamos la operación para cambiar de unidad
        Double celsius = kelvin - 273.15;

        //lo mostramos en showMessageDialog
        JOptionPane.showMessageDialog(null, kelvin + " grados Kelvin son " + celsius + " grados Celsius");

        //retornamos el valor celsius
        return celsius;

    }
    //de kelvin a farenheit
    public void ConvertirkelvinAFarenheit (Double kelvin) {

        //creamos la operación para cambiar de unidad
        Double celsius = ConvertirKelvinACelsius(kelvin);
        Double farenheit = ConvertirCelsiusAFarenheit(celsius);

        //lo mostramos en showMessageDialog
        JOptionPane.showMessageDialog(null, kelvin + " grados Kelvin son " + farenheit + " grados Farenheit");

    }

}
