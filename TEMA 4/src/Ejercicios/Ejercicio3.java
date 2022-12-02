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

/* Realiza un programa qu e pida repetidamente frases al usuario hasta que no introduzca nada.

El programa finalizara mostrando la frase más larga

Ejemplo 
Introduce una frase Hola
Introduce una frase Hola caracola
Introduce una frase Estoy cansadisimo
Introduce una frase

La frase mas larga introducida ha sido "Estoy cansado"*/
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena = "";

        String cadenaLarga = ""; //Creacion de cadenaLarga vacia para sustituirlo por la ultima cadena introducida por teclado
        int longitudMayus = 0;
        do {

            System.out.println("Introduce una frase : ");
            cadena = teclado.nextLine();
            if (!cadena.isBlank()) {
//Si la longitud de la cadena es mayor que maxima longitud, entonces la cadena larga pasa a ser la ultima cadena
                if (cadena.length() > longitudMayus) {
                    cadenaLarga = cadena;
                }
            }
        } while (!cadena.isBlank()); //Si la cadena NO esta vacia entonces se repite
        System.out.println("La frase mas larga introducida ha sido " + cadenaLarga);

    }

}
