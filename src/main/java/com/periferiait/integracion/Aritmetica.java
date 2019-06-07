/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.periferiait.integracion;

/**
 *
 * @author jaime
 */
public class Aritmetica {

    static public int suma(int a, int b) {
        return a + b;
    }

    static public int multiplicacion(int a, int b) {
        return a * b;

    }

    public static void main(String[] args) {

        //Aquí las instrucciones de inicio y control del programa
        System.out.println("Empezamos la ejecución del programa");
        int a=1;
        System.out.println(suma(a, a));

    } //Cierre del main
}
