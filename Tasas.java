/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eldartest;

/**
 *
 * @author AlejandraE
 */
public class Tasas {

    private double tasa_visa;
    private double tasa_naranja;
    private double tasa_amex;
    int mes;
    int año;
    int tipo_tarjeta;

    /**
     * constructores
     */
    //Constructor sin parámetros
    public Tasas() {
        // initialise instance variables
        tasa_visa = 0;
        tasa_naranja = 0;
        tasa_amex = 0;
        mes = 0;
        año = 0;
        tipo_tarjeta = 0;
    }

    // Constructor al que se le deben pasar dos parámetros que sirven para inicializar los atributos de la clase
    public Tasas(int tipo_tarjeta, int mes, int año) {
        // initialise instance variables
        this.tipo_tarjeta = tipo_tarjeta;
        this.mes = mes;
        this.año = año;
    }

    /**
     * Setters
     *
     * @param tipo_tarjeta
     */
    // Los setter sirven para asignar valores a los atributos
    public void setTipo_tarjeta(int tipo_tarjeta) {
        this.tipo_tarjeta = tipo_tarjeta;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    /**
     * Getters
     *
     * @return
     */
    // Los getters sirven obtener el valor de los atributos en un momento determinado
    public int getTipo_tarjeta() {
        return this.tipo_tarjeta;
    }

    public double getMes() {
        return this.mes;
    }

    public double getAño() {
        return this.año;
    }

    /**
     * Método que calcula la tasa
     *
     * @return
     */
    public double calcultarT() {
        double tasa;
        tasa = 0;
        try {
            if (this.tipo_tarjeta == 1) {
                tasa = mes / año;
            } else if (this.tipo_tarjeta == 2) {
                tasa = mes * 0.5;
            } else if (this.tipo_tarjeta == 2) {
                tasa = mes * 0.9;
            }
        } catch (Error e) {
            System.out.print("El tipo de tarjeta ingresado es erroneo ");
        }
        return tasa;
    }

    /**
     * Método que calcula la tasa
     *
     * @param tarjeta
     * @return
     */
    public String TipoTarjeta() {
        String marca_tarjeta = null;
        // declaración de switch
        switch (this.tipo_tarjeta) {
            case 1 -> {
                marca_tarjeta = "Visa";
            }
            case 2 -> {
                marca_tarjeta = "Naranja";
            }
            case 3 -> {
                marca_tarjeta = "Amex";
            }
            default -> {
            }
        }
        
        return marca_tarjeta;
    }

}
