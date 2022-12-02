/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author fercaslu
 */
public class FormateoNumero {

    public static void main(String[] args) {

        double cantidad = 1234.56789; //numero sin formatear

        //FORMATOS PREESTABLECIDOS --> NumberFormat      
        System.out.println("FORMATOS PREESTABLECIDOS:");
        NumberFormat nf = NumberFormat.getInstance(); //Por defecto
        nf.setMaximumFractionDigits(2);
        System.out.println("Por defecto: " + nf.format(cantidad));

        nf = NumberFormat.getCurrencyInstance(); //Moneda
        System.out.println("Moneda: " + nf.format(cantidad));

        nf = NumberFormat.getPercentInstance(); //Porcentaje
        System.out.println("Porcentaje: " + nf.format(0.56));

        System.out.println("--------------------------");
        //Formatos Locale
        nf = NumberFormat.getInstance(Locale.US); //Por defecto
        nf.setMaximumFractionDigits(2);
        System.out.println("Por defecto: " + nf.format(cantidad));

        nf = NumberFormat.getCurrencyInstance(Locale.US); //Moneda
        System.out.println("Moneda: " + nf.format(cantidad));

        nf = NumberFormat.getPercentInstance(Locale.US); //Porcentaje
        System.out.println("Porcentaje: " + nf.format(0.56));
        System.out.println("--------------------------");
        //FORMATOS CON PLANTILLAS -> DecimalFormat
        System.out.println("FORMATOS CON PLANTILLAS:");
        double cant1 = 12345.6789;
        double cant2 = -.456;
        double cant3 = -123;

        DecimalFormat df = new DecimalFormat("0,000.00;(0,000.00)"); //Sin almohadilla

        System.out.println("Sin almohadilla: " + df.format(cant1));
        System.out.println("Sin almohadilla: " + df.format(cant2));
        System.out.println("Sin almohadilla: " + df.format(cant3));

        System.out.println("--------------------------");
        df.applyPattern("#,##0.##;(#,##0.##)"); //Con almohadilla

        System.out.println("Con almohadilla: " + df.format(cant1));
        System.out.println("Con almohadilla: " + df.format(cant2));
        System.out.println("Con almohadilla: " + df.format(cant3));

        System.out.println("--------------------------");

        //FORMATO CON String.format
        System.out.println(String.format("%f", cant1)); //Formato por defecto
        System.out.println(String.format("|%30f|", cant1)); //Alineado a la der
        System.out.println(String.format("|%-30f|", cant1)); //Alineado a la izq
        System.out.println(String.format("|%,-30f|", cant1)); //Separador de miles
        System.out.println(String.format("|%,(30f|", cant3)); //Negativo

        //Representacion octal y hexadecimal de "cant1"
        System.out.println(String.format("|%o|",(int) cant1));
        System.out.println(String.format("|%a|", cant1));
      
        //Relleno con ceros a la izq hasta una longitud de 20
        System.out.println(String.format("|%020f|", cant1));
        
        
        //Mostrar "cant1" a dos decimales1
        System.out.println(String.format("|%.2f|", cant1));
        
        
        String cadena = "Desarrollo de Aplicaciones";
        System.out.println(String.format("|%30s|", cadena)); //Cadena a la der
        System.out.println(String.format("|%-30s|", cadena)); //Cadena a la izq
        System.out.println(String.format("|%.5s|", cadena)); //Limita la cadena a 5 caracteres
    }

}
