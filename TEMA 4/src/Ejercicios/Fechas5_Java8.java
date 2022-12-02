/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Luis
 *
 * Fecha factura: 01/01/2022 Termino de pago (7D/14D/3x30): 14D
 *
 * Metodo de pago elegido: 14 dias a partir de la fecha de registro.
 *
 * Fecha de vencimiento: 15/01/2022
 *
 * Fecha factura: 01/01/2022 Termino de pago (7D/14D/3x30): 3x30
 *
 * Metodo de pago elegido: Tres pagos, a los 30, 60 y 90 dias. Importe factura:
 * 700
 *
 * Porcentajes... Porcentaje1: 50 Porcentaje2: 30 Porcentaje3: 20
 *
 * Fechas de vencimiento... Vencimiento1: 01/02/2022 Cantidad1: 350
 *
 * Vencimiento2: 01/03/2022 Cantidad1: 210
 *
 * Vencimiento3: 01/04/2022 Cantidad1: 140
 *
 */
public class Fechas5_Java8 {

    public static void main(String[] args) {

        try {

            //Objeto Scanner
            Scanner sc = new Scanner(System.in);

            //Cadena en la que recogemos la fecha de la factura
            System.out.print("Introduce fecha de la factura (dd/mm/aaaa): ");
            String cadenaFactura = sc.next();

            //Formateador de fecha
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            //Parseamos la cadena y el formateador
            LocalDate fechaFactura = LocalDate.parse(cadenaFactura, dtf);

            //Cadena con la que recogemos el termino de pago
            System.out.print("Introduce termino de pago (7D/14D/3x30): ");
            String terminoPago = sc.next().toUpperCase();

            switch (terminoPago) {
                case "7D": //Termino de pago es igual a 7D
                    System.out.println("\nMetodo de pago elegido: "
                            + "7 dias a partir de la fecha de registro.");
                    //7 dias a la fecha de la factura
                    System.out.println("Fecha de vencimiento: "
                            + dtf.format(fechaFactura.plusDays(7)));
                    break;

                case "14D": //Termino de pago es igual a 14D
                    System.out.println("\nMetodo de pago elegido: "
                            + "14 dias a partir de la fecha de registro.");
                    //14 dias a la fecha de la factura
                    System.out.println("Fecha de vencimiento: "
                            + dtf.format(fechaFactura.plusDays(14)));
                    break;

                case "3X30": //Termino de pago es igual a 3x30
                    System.out.println("\nMetodo de pago elegido: "
                            + "Tres pagos, a los 30, 60 y 90 dias a partir de la fecha de registro.");
                    //Importe de factura
                    System.out.print("Introduce el importe de la factura: ");
                    double importe = sc.nextInt();

                    //Porcentajes de factura
                    System.out.print("\nIntroduce tres porcentajes (Deben sumar 100):\n\tPorcentaje 1: ");
                    double p1 = sc.nextInt();
                    System.out.print("\tPorcentaje 2: ");
                    double p2 = sc.nextInt();
                    System.out.print("\tPorcentaje 3: ");
                    double p3 = sc.nextInt();

                    //Porcentajes deben de dar 100
                    if (p1 + p2 + p3 == 100) {
                        //Formateamos y sumamos 30, 60 y 90 dias a la fecha de la factura
                        System.out.println("\nVencimientos y cantidades..."
                                + "\n\tPrimer Vencimiento: " + dtf.format(fechaFactura.plusDays(30))
                                + "\n\tPrimera Cantidad: " + (importe * (p1 / 100)) + " euros."
                                        
                                + "\n\n\tSegundo Vencimiento: " + dtf.format(fechaFactura.plusDays(60))
                                + "\n\tSegunda Cantidad: " + (importe * (p2 / 100)) + " euros."
                                        
                                + "\n\n\tTercer Vencimiento: " + dtf.format(fechaFactura.plusDays(90))
                                + "\n\tTercera Cantidad: " + (importe * (p3 / 100)) + " euros.");
                    } else {
                        System.out.println("Porcentajes no validos");
                    }
                    break;
                default:
                    System.out.println("Error. Termino de pago incorrecto.");
            }
        } catch (Exception ex) {
            System.out.println("Error. Fecha no valida.");
        }
    }

}
