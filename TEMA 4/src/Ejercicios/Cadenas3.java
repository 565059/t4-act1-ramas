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
 * Realiza un programa que diga si un nº introducido por teclado es capicua.
 */
public class Cadenas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        try{
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();
        String numero = String.valueOf(num);
        String antinumero = "";

        for (int i = numero.length() - 1; i >= 0; i--) {
            antinumero += numero.charAt(i);
        }
        
        if (numero.equals(antinumero)) {
            System.out.println("El numero es capicua.");
        } else {
            System.out.println("El numero no es capicua.");
        }
        } catch (Exception ex) {
            System.out.println("Error 01, entrada de datos");
        }

    }
}
