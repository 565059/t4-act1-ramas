/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * El formato mas comun es el SHORT
 *
 * @author alfgonru
 *
 * Programa que calcule el numero de dias transcurridos desde una fecha
 * introducida por techado hasta hoy.
 *
 * Ejemplo:
 *
 * Introduce fecha: 01/01/2022
 *
 * Han transcurrido hasta hoy: 340 dias
 */
public class Fechas1 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Introduce el dia (dd/mm/aa): ");
            String dia = sc.nextLine();

            DateFormat df =DateFormat.getDateInstance(DateFormat.SHORT);
            df.setLenient(false);

            Date fecha = df.parse(dia);

            //Creamos la fecha de hoy.
            Date hoy = new Date();
            
//            Mi código, no usar *No hay sdf arriba*
//            // Calculamos el año:
//            sdf.applyPattern("yy");
//            String s_fecha = sdf.format(dia);
//            String s_hoy = sdf.format(hoy);
//
//            int diferencia = (Integer.parseInt(s_hoy) - Integer.parseInt(s_fecha)) * 265;
//
//            // Y calculamos el dia
//            sdf.applyPattern("D");
//            s_fecha = sdf.format(dia);
//            s_hoy = sdf.format(hoy);
//
//            diferencia += Integer.parseInt(s_hoy) - Integer.parseInt(s_fecha);
//
//            if (diferencia < 0) {
//                System.out.println("Error 02. Has introducido un numero que esta en el futuro.");
//            } else {
//                sdf.applyPattern("dd/MM/yy");
//                System.out.println("Desde el " + sdf.format(dia) + ", han pasado: " + diferencia + " dias.");
//            }
            if (fecha.after(hoy)){
                System.out.println("Error.");
            } else {
                long milisegundos = hoy.getTime() - fecha.getTime();
                long dias = milisegundos/1000/60/60/24;
                System.out.println("Han pasado " + dias + " dia(s) desde el " + df.format(fecha));
            }

        } catch (ParseException ex) {
            System.out.println("Error 01. Introduce un numero valido.");
        }

    }
}
