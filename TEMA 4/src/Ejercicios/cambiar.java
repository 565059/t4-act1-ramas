/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Random;

/**
 *
 * @author alfgonru Programa que cree palabras de tamaño aleatorio (min 1 y max
 * 25), cuyos caracteres serán generados tambien aleatoriamente.
 *
 * Notas:
 *
 * 1. Usa la clase Random para generar los aleatorios.
 *
 * 2. Usa los caracteres que forman las palabras serán imprimibles. (el espacio
 * no lo es)
 *
 * Ejemplo:
 *
 * Palabra generada (tamaño 5): cw12Z
 */
public class cambiar {

    public static void main(String[] args) {
        Random r = new Random();

        // Sacar numeros de r con nextInt()
        int tamanio = r.nextInt(1,26); // genera numeros aleatorios 1 y 25
        int aleatorio; //genera el ascii del caracter aleatorio
        String resultado = "";

        System.out.println("La palabra tendra " + tamanio + " caracteres");

        for (int i = 0; i < tamanio; i++) {
            aleatorio = r.nextInt(33,127); // aleatorios [33,127)
            resultado = resultado + (char) aleatorio;
        }
        System.out.println("La plabra generada es: " + resultado);
    }
}
