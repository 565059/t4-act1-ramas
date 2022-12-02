/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author fercaslu
 *
 * Introduce fecha (dd 'de' mmmm 'de' aaaa ): 5 de agosto de 2000 Formato corto:
 * 05/08/2000
 *
 */
public class Fechas4_Java8 {

    public static void main(String[] args) {

        try {
            //Objeto Scanner
            Scanner sc = new Scanner(System.in);

            //Pedimos la fecha en cadena
            System.out.print("Introduce fecha con formato 'dd de mes(letra) de yyyy': ");
            String entrada = sc.nextLine();

            //Creamos el formateador y parseamos la cadena a una fecha y el formateador
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd 'de' MMMm 'de' yyyy");
            LocalDate fecha = LocalDate.parse(entrada, dtf);

            //Formateamos la fecha parseada y el formateador
            dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
            System.out.println(dtf.format(fecha));
        } catch (Exception ex) {
            System.out.println("Error. Fecha no valida.");
        }

    }

}
