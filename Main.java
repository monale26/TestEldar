/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eldartest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author AlejandraE
 */
public class Main {

    /**
     * Arrancamos
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Bienvenido: ");

        System.out.println("Introduzca su numero de tarjeta de credito: ");
        Scanner entrada = new Scanner(System.in);
        String num_tarjeta = entrada.nextLine();
        int numero_tarjeta = Integer.parseInt(num_tarjeta);
        System.out.println("Numero de Tarjet: " + numero_tarjeta);

        System.out.println("Por favor introduzca  1: Visa, 2: Naranja,3: Amex: ");
        String marca = entrada.nextLine();
        System.out.println("Proveedor: " + marca);

        System.out.println("Introduzca Datos del cliente Nombre y Apellido: ");
        String usuario = entrada.nextLine();

        System.out.println("Proveedor: " + usuario);

        System.out.println("ingrese mes de vencimiento ");
        int mes = entrada.nextInt();

        System.out.println("ingrese año de vencimiento ");
        int año = entrada.nextInt();
        System.out.println("Fecha de vencimiento: " + mes+"/"+año);
        
        TarjetaDeCredito miTarjetaDeCredito = new TarjetaDeCredito( numero_tarjeta,  marca,  usuario,  mes,  año);
        String DatoTarjeta = miTarjetaDeCredito.DatosTarjeta();
        
        System.out.println("Los datos de mi tarjeta son: " + DatoTarjeta);
        
        System.out.println("Ingrese monto consumido ");
         int consumo = entrada.nextInt();
         // String consumo_cli = entrada.nextLine();
   
         
         OperacionValida miOperacionValida=  new OperacionValida( consumo,  mes,  año);
         String operacion = miOperacionValida.OperacionValida();
         System.out.println("operacion: " + operacion);
         //Tasas miTasas = new Tasas();
         //String tasaEntrada = miTasas.TipoTarjeta();
         
         //System.out.println("Los valores de la tasa aplicada son: " + tasaEntrada);
        /*int numero_tarjeta;
        

        
        
        System.out.print("Por favor introduzca  1: Visa, 2: Naranja,3: Amex ");
        tipo_tarjeta_entrada = entrada.nextLine();
        
         System.out.print("Ingrese monto consumido ");
         tasa = entrada.nextInt();
         
         Tasas miTasas = new Tasas();
         tasaEntrada = miTasas.calcultarT();
         
         
        
         */
    }
}
