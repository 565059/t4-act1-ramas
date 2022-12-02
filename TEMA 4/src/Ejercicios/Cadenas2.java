/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author alfgonru
 *
 * Realizar un proigrama que pida repetidamente frases al usuario hasta que no
 * introduzca nada. en ese momento, el programa finarizará mostrando la frase
 * mas larga
 *
 * Ejemplo:
 *
 * Itroduce cadena: hola caracola Itroduce cadena: hola Itroduce cadena: estoy
 * cansadisima Itroduce cadena:
 *
 * La frase mas larga introducida ha sido 'Estoy cansadisima'.
 */
public class Cadenas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena; // la cadena introducida por el usuario
        String larga = ""; // La cadena mas larga introducida

        do {
            System.out.print("Introduce cadena: ");
            cadena = sc.nextLine();

            if (cadena.length() > larga.length()) { // Si la nueva frase es mas larga, la guarda como las ma larga
                larga = cadena;
            }
        } while (!cadena.isBlank()); // Si no hay cadena (su longitud es 0), se sale del bucle
        System.out.println("La frase mas larga ha sido '" + larga + "'");
    }
}
