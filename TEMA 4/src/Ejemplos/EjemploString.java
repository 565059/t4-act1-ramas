/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author maraloed
 */
public class EjemploString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        String cadena = sc.next();
        
        String c1 = new String("Lamamamama");
        
        //Busquedas
        cadena.indexOf(c1);
        cadena.lastIndexOf(c1);
        
        //Trabajar con subcadenas
        String subcadena = cadena.substring(0,10);
        
        //Mayusculas y minusculas
        String mayusculas = cadena.toUpperCase();
        String minusculas = cadena.toLowerCase();
        
        //Si empieza por algo o acaba por algo
        boolean termina = cadena.endsWith("e");
        boolean empieza = cadena.startsWith("a");
        
        //quita los espacios de alante ya atras, no los que estan entre medias
        String Sinespacios = cadena.trim();
        
        //Reemplaza el valor char del primero por el segundo
        String cambioAporO = cadena.replace('a', 'o');
        
        System.out.println("Introduce una cadena");
        String cadena2 = sc.next();
        
        //Comparar
        boolean iguales = cadena.equals(cadena2);//Iguales en longitud e igual por parejas
        
        int orden = cadena.compareTo(cadena2); //compara alfabeticamente, si va antes
        // devuelve -1, si va despues devuelve +1 y si es igual devuelve 0
                                                    
        
    }
}
