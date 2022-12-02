/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

/**
 *
 * @author fercaslu
 */
public class Fechas1_Java8 {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);

            System.out.println("Introduce tu fecha de nacimiento: ");
            System.out.print("Dia: ");
            int dia = sc.nextInt();
            System.out.print("Mes: ");
            int mes = sc.nextInt();
            System.out.print("Anio: ");
            int anio = sc.nextInt();

            LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

            DateTimeFormatter dtfCorto = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
            System.out.println("Formato fecha corto: " + dtfCorto.format(fechaNacimiento));
            DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
            System.out.println("Formato fecha largo: " + dtf.format(fechaNacimiento));

        } catch (Exception ex) {
            System.out.println("Error. Fecha no valida.");
        }

    }

}
