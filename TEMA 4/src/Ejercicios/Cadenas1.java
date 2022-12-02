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
 * Dada una cadena, realizar un programa que muestre el nº de ocurrencias de
 * otra cadena dentro de ella y sus posiciones.
 *
 * Ejemplo:
 *
 * Introduce cadena: hola caracola 
 * Cadena a buscar: la 
 * Nº de coincidencias: 2
 * (posciones:2,11)
 */
public class Cadenas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pide la cadena principal y la que se va a usar para buscar
        System.out.print("Introduce cadena: ");
        String cadena = sc.nextLine();

        System.out.print("Cadena a buscar: ");
        String buscar = sc.nextLine();

        int ultimaPosicion = 0; // La ultima posicion en la que se ha encontrado
        String posiciones = ""; //La cadena que mostrara las posiciones en las que se ha encontrado
        int contador = 0; // Contador para saber el numero de veces encontrado

        // Se suma el espacio para que al buscar palabras de 1 de longitud funcione
        while ((cadena+" ").indexOf(buscar, ultimaPosicion + 1) != -1) {
            ultimaPosicion = cadena.indexOf(buscar, ultimaPosicion + 1);
            
            //Por formateo, se necesita un if
            if (posiciones.equals("")) posiciones += ultimaPosicion;
            else posiciones +=", " + ultimaPosicion;
            contador++;
        }

        System.out.println("Nº de coincidencias: " + contador + " (posiciones: " + posiciones + ")");
    }
}
