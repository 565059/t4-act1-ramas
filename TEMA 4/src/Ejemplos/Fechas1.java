/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author fercaslu
 * 
 * Uso de Calendar y GregorianCalendar
 * 
 */
public class Fechas1 {
    
    public static void main(String[] args) {
        
//        GregorianCalendar fecha1 = new GregorianCalendar();
        
//        Date hoy = new Date();
//        System.out.println(hoy);

        //Fecha de navidad
        GregorianCalendar navidad = new GregorianCalendar(2022, Calendar.DECEMBER, 25);
        
        //Extraer del objeto
        System.out.println(navidad.get(Calendar.DAY_OF_MONTH));
        System.out.println(navidad.get(Calendar.DAY_OF_WEEK));
        System.out.println(navidad.get(Calendar.DAY_OF_YEAR));
        System.out.println(navidad.get(Calendar.YEAR));
        
        navidad.set(Calendar.DAY_OF_MONTH, 24);
    }
    
}
