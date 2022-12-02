/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;


/**
 *
 * @author fercaslu
 * 
 * Uso de Calendar y GregorianCalendar
 * 
 */
public class Fechas1_Java8 {
    
    public static void main(String[] args) {
        
        //Crear objeto que representa la fecha del sistema
        LocalDate hoy = LocalDate.now();
        System.out.println("Fecha del sistema: " + hoy);
        
        System.out.println("------------------------------------------------------------------"); 
        
        //Crear objetos que representan fechas concretas
        LocalDate navidad = LocalDate.of(2022, Month.DECEMBER, 25);
        LocalDate nocheBuena = LocalDate.of(2022, 12, 24);
        System.out.println("Fechas concretas: " + nocheBuena + " | " + navidad);
        
        System.out.println("------------------------------------------------------------------");
        
        //Crear objeto que representa la hora del sistema
        LocalTime ahora = LocalTime.now();
        System.out.println("Hora del sistema: " + ahora);
        
        System.out.println("------------------------------------------------------------------");
        
        //Crear objeto que representa la fecha y la hora del sistema 
        LocalDateTime hoyAhora = LocalDateTime.now();
        System.out.println("Fecha y hora del sistema: " + hoyAhora);
        
        System.out.println("------------------------------------------------------------------");
        
        //Metodos para sumar/restar fechas
        navidad.plusDays(20);
        System.out.println("20 dias despues de navidad: " + navidad.plusDays(20));
        System.out.println("3 horas antes de la fecha del sistema: " + ahora.minusHours(3));
        
        System.out.println("------------------------------------------------------------------"); 
        
        //Metodos para comparar fechas
        System.out.println("Navidad va despues de hoy? " + navidad.isAfter(hoy));
        System.out.println("Navidad va despues de hoy? " + navidad.compareTo(hoy));
        
        System.out.println("------------------------------------------------------------------");
        
        //Trabajar con diferentes zonas horarias
        Set zonas = ZoneId.getAvailableZoneIds();
        //Bucle for each
//        for(Object zona:zonas) {
//            System.out.println(zona);
//        }
        
        ZoneId zonaTokio = ZoneId.of("Asia/Tokyo");
        ZonedDateTime hoyAhoraTokio = ZonedDateTime.now(zonaTokio);
        System.out.println("Hora actual de Tokio: " + hoyAhoraTokio);
        
        System.out.println("------------------------------------------------------------------");
        
        //Usar periodos e instantes
        LocalTime horaInicio = LocalTime.of(13, 30);
        LocalTime horaFin = LocalTime.of(14, 00);
        
        long segundos = Duration.between(horaInicio, horaFin).getSeconds();
        System.out.println("Segundos entre dos horas: " + segundos);
        
        long dias = Period.between(navidad, nocheBuena).getDays();
        System.out.println("Dias entre Navidad y Nochebuena: " + dias);
        
        System.out.println("------------------------------------------------------------------");
        
        //Formateo de fechas
        
        //1ª forma: ISO
        DateTimeFormatter dtfISO = DateTimeFormatter.ISO_ZONED_DATE_TIME;
        System.out.println("Formato fecha ISO: " + dtfISO.format(hoyAhoraTokio));
        
        //2ª forma: Formato localizado
        DateTimeFormatter dtfLocalizado = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM);
        System.out.println("Formato fecha localizado: " + dtfLocalizado.format(hoyAhoraTokio));

        //3ª forma: Formato plantilla (se pone como cadena)
        DateTimeFormatter dtfPlantilla = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Formato fecha plantilla: " + dtfPlantilla.format(hoyAhoraTokio));
    }
    
}
