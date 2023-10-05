package com.bree2003.conversorMoneda;

import javax.swing.*;

public class ConvertirMoneda {

    //se agregan los respectivos métodos para dolar, euros, libras esterlinas, yen japones, won surcoreano

    public void ConvertirPesosADolar(Double pesos) {

        Double dolar = pesos*0.0011;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, pesos + " Pesos Chilenos son " + dolar + " Dólares");

    }

    public void ConvertirPesosAEuro(Double pesos) {

        Double euro = pesos*0.0010;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, pesos + " Pesos Chilenos son " + euro + " Euros");

    }

    public void ConvertirPesosALibras(Double pesos) {

        Double libra = pesos*0.00090;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, pesos + " Pesos Chilenos son " + libra + " Libras Esterlinas");

    }

    public void ConvertirPesosAYen(Double pesos) {

        Double yen = pesos*0.16;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, pesos + " Pesos Chilenos son " + yen + " Yen Japonés");

    }

    public void ConvertirPesosAWon(Double pesos) {

        Double won = pesos*1.47;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, pesos + " Pesos Chilenos son " + won + " Won Surcoreano");

    }

    public void ConvertirDolarAPesos(Double dolar) {

        Double pesos = dolar*915.33;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, dolar + " Dólares son " + pesos + " Pesos Chilenos");

    }

    public void ConvertirDolarAEuros(Double dolar) {

        Double euro = dolar*0.95;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, dolar + " Dólares son " + euro + " Euros");

    }

    public void ConvertirDolarALibras(Double dolar) {

        Double libra = dolar*0.82;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, dolar + " Dólares son " + libra + " Libras Esterlinas");

    }

    public void ConvertirDolarAYen(Double dolar) {

        Double yen = dolar*149.00;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, dolar + " Dólares son " + yen + " Yen Japonés");

    }

    public void ConvertirDolarAWon(Double dolar) {

        Double won = dolar*1350.06;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, dolar + " Dólares son " + won + " Won Surcoreano");

    }

    public void ConvertirEurosADolar(Double euro) {

        Double dolar = euro*1.05;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, euro + " Euros son " + dolar + " Dólares");

    }

    public void ConvertirEurosAPesos(Double euro) {

        Double pesos = euro*961.60;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, euro + " Euros son " + pesos + " Pesos Chilenos");

    }

    public void ConvertirEurosALibras(Double euro) {

        Double libra = euro*0.87;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, euro + " Euros son " + libra + " Libras Esterlinas");

    }

    public void ConvertirEurosAYen(Double euro) {

        Double yen = euro*156.56;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, euro + " Euros son " + yen + " Yen Japonés");

    }

    public void ConvertirEurosAWon(Double euro) {

        Double won = euro*1418.38;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, euro + " Euros son " + won + " Won Surcoreano");

    }

    public void ConvertirLibrasADolar(Double libra) {

        Double dolar = libra*1.21;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, libra + " Libras Esterlinas son " + dolar + " Dólares");

    }

    public void ConvertirLibrasAEuros(Double libra) {

        Double euro = libra*1.16;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, libra + " Libras Esterlinas son " + euro + " Euros");

    }

    public void ConvertirLibrasAPesos(Double libra) {

        Double pesos = libra*1111.12;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, libra + " Libras Esterlinas son " + pesos + " Pesos Chilenos");

    }

    public void ConvertirLibrasAYen(Double libra) {

        Double yen = libra*180.90;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, libra + " Libras Esterlinas son " + yen + " Yen Japonés");

    }

    public void ConvertirLibrasAWon(Double libra) {

        Double won = libra*1638.74;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, libra + " Libras Esterlinas son " + won + " Won Surcoreano");

    }

    public void ConvertirYenADolar(Double yen) {

        Double dolar = yen*0.0067;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, yen + " Yen Japonés son " + dolar + " Dólares");

    }

    public void ConvertirYenAEuros(Double yen) {

        Double euro = yen*0.0064;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, yen + " Yen Japonés son " + euro + " Euros");

    }

    public void ConvertirYenALibra(Double yen) {

        Double libra = yen*0.0055;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, yen + " Yen Japonés son " + libra + " Libras Esterlinas");

    }

    public void ConvertirYenAPesos(Double yen) {

        Double pesos = yen*6.14;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, yen + " Yen Japonés son " + pesos + " Pesos Chilenos");

    }

    public void ConvertirYenAWon(Double yen) {

        Double won = yen*9.06;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, yen + " Yen Japonés son " + won + " Won Surcoreano");

    }

    public void ConvertirWonADolar(Double won) {

        Double dolar = won*0.00074;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, won + " Won Surcoreano son " + dolar + " Dólares");

    }

    public void ConvertirWonAEuros(Double won) {

        Double euro = won*0.00070;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, won + " Won Surcoreano son " + euro + " Euros");

    }

    public void ConvertirWonALibras(Double won) {

        Double libra = won*0.00061;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, won + " Won Surcoreano son " + libra + " Libras Esterlinas");

    }

    public void ConvertirWonAYen(Double won) {

        Double yen = won*0.11;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, won + " Won Surcoreano son " + yen + " Yen Japonés");

    }

    public void ConvertirWonAPesos(Double won) {

        Double pesos = won*0.68;
        //y lo mostramos con showMessageDialog -> el primero es null porque no tiene padre
        // o sea que lo muestre en la pantalla nomás ya que no tiene un lugar en especifico para mostrarse
        JOptionPane.showMessageDialog(null, won + " Won Surcoreano son " + pesos + " Pesos Chilenos");

    }
}
