/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

/**
 *
 * @author fercaslu
 *
 * Escribe un programa Fecha2 que calcule el nº de días transcurridos desde una
 * fecha hasta hoy. La fecha inicial será introducida por teclado con el formato
 * dd/mm/yyyy.
 *
 */
public class Fechas2_Java8 {

    public static void main(String[] args) {

        try {
            //Objeto Scanner
            Scanner sc = new Scanner(System.in);

            //Pedimos la fecha como cadena
            System.out.print("Introduce una fecha (dd/mm/yyyy): ");
            String cadenaFecha = sc.next();

            //Creamos el formateador y con el parseamos la cadena a una fecha
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(("dd/MM/yyyy"));
            LocalDate fecha = LocalDate.parse(cadenaFecha, dtf);
            //Creamos la fecha de hoy
            LocalDate hoy = LocalDate.now();
            
            //Comprobamos si la fecha introducida es anterior a la fecha de hoy
            if(fecha.isBefore(hoy)){
                /**
                 * Restamos los dias que hay de hoy al 01/01/1970 menos los dias 
                 * de la fecha introducida al 01/01/1970.
                 */
                long diasDif = hoy.toEpochDay() - fecha.toEpochDay();
                System.out.println("Num. de dias de diferencia enre las 2 fechas: "+ diasDif);
            }else{
                System.out.println("Debes poner una fecha anterior a la de hoy.");
            }
            
        } catch (Exception ex) {
            System.out.println("Error. Fecha no valida.");
        }

    }

}
