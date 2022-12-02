/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author Luis
 *
 * A partir de un nº (positivo o negativo) de segundos determine la fecha que
 * representa a partir del día de hoy. La fecha será mostrada en formato largo.
 *
 */
public class Fechas3_Java8 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Introduce un numero de segundos: ");
            long seg = sc.nextLong();

            LocalDateTime ahora = LocalDateTime.now();
            
            LocalDateTime nuevaFecha = ahora.plusSeconds(seg);
            
            DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.SHORT);
//            System.out.println(dtf.format(nuevaFecha)));
        } catch (Exception ex) {
            System.out.println("Error. Valor no valido.");
        }

    }

}
