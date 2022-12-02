/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author alfgonru
 */
public class FormateoFecha1 {

    public static void main(String[] args) {

        //Uso de DateFormat -> nos limitamos a las operaciones FULL, LONG, MEDIUM, SHORT
        DateFormat df = DateFormat.getInstance(); // Formato por defecto

        Date hoy = new Date();

        System.out.println("Formato por defecto: " + df.format(hoy));

        df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Formato medium: " + df.format(hoy));

        df = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Formato long: " + df.format(hoy));

        df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Formato full: " + df.format(hoy));

        df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, Locale.US);
        System.out.println("Formato fecha/hora USA: " + df.format(hoy));
    }
}
