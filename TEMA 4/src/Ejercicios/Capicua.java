/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author fercaslu
 *
 * Realiza un programa que diga si un nº intoducido por teclado es capicua
 *
 */
public class Capicua {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            //Pedimos numero por teclado
            System.out.print("Introduce un numero: ");
            int num = sc.nextInt();

            //Convertimos a cadena el numero introducido
            String cadena = String.valueOf(num);
            String invertida = ""; //Almacenamiento de cadena inicial invertida
            
            /**
             * Mientras que la longitud de la cadena menos 1 sea mayor o igual 
             * que 0, añadimos a la cadena invertida el valor empezando por el 
             * final.
             */
            for (int i = cadena.length() - 1; i >= 0; i--) {
                invertida = invertida + cadena.charAt(i);
            }
            
            //Si la cadena es igual a la cadena inverida decir que es capicua.
            if(cadena.equals(invertida)){
                System.out.println("El numero es capicua.");
            }else{
                System.out.println("El numero no es capicua.");
            }
            
        } catch (Exception ex) {
            System.out.println("Error en entrada de datos.");
        }
    }

}
