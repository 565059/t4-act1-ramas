package ejemplos;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author alfgonru
 *
 * Parse: cadena -> fecha - NO APLICA EL FORMATO
 *
 * Format: Date -> String - APLICA EL FORMTATO
 *
 *
 */
public class FormateoFecha2Bis {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce fecha de nacimiento (dd/mm/aa): ");
            String fechaNac = sc.nextLine();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

            sdf.setLenient(false); // No se puede introducir 100/01/2000
            Date fecha = sdf.parse(fechaNac);
            // Si llegamos hasta aqui es la cadena era una fecha

            // Creamos la fecha de hoy
            Date ahora = new Date();
            sdf.applyPattern("ddMM");
            String cumple = sdf.format(fecha);
            String hoy = sdf.format(ahora);

            if (cumple.equals(hoy)) {
                System.out.println("Es cu cumpleanios!!!!");

            } else if (ahora.getTime() - fecha.getTime() < 0) {
                sdf.applyPattern("D");
                System.out.println("Tu cumpleanios va a ser en " + (Integer.parseInt(sdf.format(fecha)) - Integer.parseInt(sdf.format(ahora) + 1)) + " dias.");

            } else if (ahora.getTime() - fecha.getTime() > 0) {
                sdf.applyPattern("D");
                System.out.println("Tu cumpleanios ha sido hace " + (Integer.parseInt(sdf.format(ahora)) + 1 - Integer.parseInt(sdf.format(fecha))) + " dias.");
            }
        } catch (ParseException ex) {
            System.out.println("Error 01. Introduce un nuemro valido");
        }
    }
}
