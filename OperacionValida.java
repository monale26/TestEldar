/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eldartest;

import java.util.Calendar;

/**
 *
 * @author AlejandraE Una operación es válida en el sistema si la persona que
 * opera en el mismo consume menos de 1000 pesos Una tarjeta es válida para
 * operar si su fecha de vencimiento es mayor al presente día
 *
 */
public class OperacionValida {

    /*
    * Variables
     */
    private int monto_consumo;
    private int mes;
    private int año;
    Calendar calendar = Calendar.getInstance();
    Calendar fecha_venciento = Calendar.getInstance();

    public OperacionValida() {
        this.monto_consumo = 0;
        this.mes = 0;
        this.año = 0;
    }

    public OperacionValida(int monto_consumo, int mes, int año) {
        this.monto_consumo = 0;
        this.mes = 0;
        this.año = 0;
    }

    /**
     * @return the monto_consumo
     */
    public int getMonto_consumo() {
        return monto_consumo;
    }

    /**
     * @param monto_consumo the monto_consumo to set
     */
    public void setMonto_consumo(int monto_consumo) {
        this.monto_consumo = monto_consumo;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

    public String OperacionValida() {
        final int monto_minimo = 1000;
        String monto_valido;
        String fecha_valida;
        String DatosTarjeta;
        boolean flag = false;
   
        if (this.monto_consumo < monto_minimo) {
          //  System.out.println("Posee monto minimo para realizar la operacion ");
            monto_valido = "transaccion Valida";
            flag = true;

        } else {
           // System.out.println("NO posee monto minimo para realizar la operacion ");
            monto_valido = "transaccion NO Valida - Su limite es insuficiente ";
            flag = false;
        }

        if (flag = true) {
            if (Calendar.MONTH > this.mes && Calendar.YEAR > this.año) {

                //System.out.println("Puede realizar la Operacion ");
                fecha_valida = "Tarjeta Valida para operar";
                

            } else {
                //System.out.println("NO Puede realizar la Operacion ");
                fecha_valida = "Tarjeta NO Valida para operar";
                
            }

        } else {
            monto_valido = "transaccion NO Valida - Su limite es insuficiente";
            fecha_valida = "Tarjeta NO Valida para operar";
        }
        
        DatosTarjeta = monto_valido + " - " + fecha_valida;
        flag =false;
        System.out.println(DatosTarjeta);
        return DatosTarjeta;
    }
}
