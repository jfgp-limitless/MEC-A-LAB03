/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
//librerias para obtener la hora
import java.util.Calendar;
import java.text.SimpleDateFormat;

//librerias timer
import java.util.Timer;
import java.util.TimerTask;

//libreria para ingresar datos por consola
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args){
        
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String hora = sdf.format(calendar.getTime());
        System.out.println("La hora actual es: " + hora +" (Hora de los servidores del software)");
        
        Scanner read= new Scanner(System.in);
        System.out.print("Ingrese la cantidad de segundos que desee que comience la ALARMA: ");
        int tiempo = read.nextInt();
        
        
        TimerTask timertask = new TimerTask() {
            int i=0;
            @Override
            public void run() {
                System.out.println("Sonando ALARMA... BEEEP");
               
            }
        };
        
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(timertask, tiempo*1000 , 10000);  
    }
    
};

