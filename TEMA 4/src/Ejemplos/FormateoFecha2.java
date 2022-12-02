/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


/**
 *
 * @author alfgonru
 *
 * Programa que pida al usuario su fecha de nacimiento y que le diga si es su
 * cumpleaños.
 */
public class FormateoFecha2 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Introduce fecha de nacimiento (dd/mm/aa): ");
            String fechaNac = sc.nextLine();

            DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
            df.setLenient(false); // No se puede introducir 100/01/2000
            Date fecha = df.parse(fechaNac);

            // Si llegamos hasta aqui es la cadena era una fecha
            // Creamos la fecha de hoy
//            // Opcion 1
//            Date hoy = new Date();
//
//            String string_fecha = df.format(hoy).substring(0, 5);
//            String string_hoy = df.format(fecha).substring(0, 5);
//            
//            hoy.get(Calendar.DAY_OF_MONTH);
//
//            if (string_fecha.equals(string_hoy)) {
//                System.out.println("Feliz cumpleanios!!!!");
//            }
            GregorianCalendar hoy = new GregorianCalendar();
            hoy.setTime(new Date());

            GregorianCalendar cumple = new GregorianCalendar();
            hoy.setTime(fecha);

            if (hoy.get(Calendar.DAY_OF_MONTH) == cumple.get(Calendar.DAY_OF_MONTH)
                    && hoy.get(Calendar.MONTH) == cumple.get(Calendar.MONTH)) {
                System.out.println("Es cu cumpleanios!!!!");
            }

        } catch (ParseException ex) {
            System.out.println("Error 01. Fecha no valida.");
        }

    }
}
