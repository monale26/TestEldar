/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eldartest;

import java.util.Calendar;

/**
 *
 * @author AlejandraE Una tarjeta se identifica de acuerdo a la marca, número de
 * tarjeta, cardholder (nombre y apellido) y fecha de vencimiento
 */
public class TarjetaDeCredito {

    //variables 
    private int numero_tarjeta;
    private String marca;
    private String usuario;
    Calendar calendar = Calendar.getInstance();
    Calendar fecha_venciento = Calendar.getInstance();
    int mes;
    int año;

    /**
     * constructores
     */
    //Constructor sin parámetros
    public TarjetaDeCredito() {
        // initialise instance variables
        numero_tarjeta = 0;
        marca = "";
        usuario = "";
        mes = 0;
        año = 0;
    }

    // Constructor al que se le deben pasar dos parámetros que sirven para inicializar los atributos de la clase
    public TarjetaDeCredito(int numero_tarjeta, String marca, String usuario, int mes, int año) {
        // initialise instance variables
        this.numero_tarjeta = numero_tarjeta;
        this.marca = marca;
        this.usuario = usuario;
        this.mes = mes;
        this.año = año;
    }

    /**
     * @return the numero_tarjeta
     */
    public int getNumero_tarjeta() {
        return numero_tarjeta;
    }

    /**
     * @param numero_tarjeta the numero_tarjeta to set
     */
    public void setNumero_tarjeta(int numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String DatosTarjeta() {
        String DatosTarjeta ;
        DatosTarjeta = this.numero_tarjeta + " " + this.marca + "  " + this.usuario;
        //System.out.print("El tipo de tarjeta ingresado es:  ");
        return DatosTarjeta;
    }

}
