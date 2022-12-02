/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author maraloed
 */

/* Dada una cadena realiza un programa que muestre el nº de ocurrencias de otra cadena
dentro de ella  sus posiciones

Ejemplo :

Introduce cadena "Hola caracola" 
Cadena a buscar la
n de coincidencias 2 (posiciones 2.10)
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce cadena");
        String cadena = teclado.nextLine();

        System.out.println("Cadena a buscar");
        String cadena2 = teclado.nextLine();

        int coincidencias = 0;
        String posiciones = "";
        int pos = -1;

        do {
            pos = cadena.indexOf(cadena2, pos + 1);
            if (pos >= 0) {
                coincidencias++;
                posiciones += String.valueOf(pos) + " ";
            }

        } while (pos >= 0);
        posiciones = posiciones.substring(0, posiciones.length() - 1);
        System.out.println("Numero de coincidencias +" + coincidencias + " Posiciones (" + posiciones + ")");
    }

}
