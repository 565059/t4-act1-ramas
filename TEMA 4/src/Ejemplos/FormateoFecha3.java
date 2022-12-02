/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author alfgonru
 */
public class FormateoFecha3 {
    public static void main(String[] args) {
        SimpleDateFormat sdf= new SimpleDateFormat();
        sdf.applyPattern("dd MMM YY");
        
        Date hoy=new Date();
        System.out.println(sdf.format(hoy));
    }
}
