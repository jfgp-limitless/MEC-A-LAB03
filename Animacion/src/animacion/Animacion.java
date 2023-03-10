
package animacion;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;

public class Animacion {
    
    static int velocidad= 225;

    public void setVelocidad(int velocidad) {
        this.velocidad = Math.abs(900-velocidad);
    }
    
   

    
    static int contador = 0;
    static int ciclos = 0;
    static final int LIMITE_CICLOS = 500;

   
    public static void main(String[] args) {

        Timer timer =  new Timer();
      
        TimerTask tarea;


        Mario mario = new Mario();
        
        mario.setVisible(true);

        tarea = new TimerTask() {

            @Override
            public void run() {
              
           
            System.out.println(velocidad);
               
                Icon icono;

                switch (contador) {
                    case 0:
                        contador = 1;
                        icono = new ImageIcon(getClass().getResource("/Iconos/mario2.png"));
                        mario.jLabel1.setIcon(icono);
                        break;

                    case 1:
                        contador = 2;
                        icono = new ImageIcon(getClass().getResource("/Iconos/mario3.png"));
                        mario.jLabel1.setIcon(icono);
                        break;

                    case 2:
                        contador = 3;
                        icono = new ImageIcon(getClass().getResource("/Iconos/mario4.png"));
                        mario.jLabel1.setIcon(icono);
                        break;

                    case 3:
                        contador = 0;
                        icono = new ImageIcon(getClass().getResource("/Iconos/mario1.png"));
                        mario.jLabel1.setIcon(icono);
                        ciclos++; // Incrementar el contador de ciclos
                        break;
                }

                // Si se han completado suficientes ciclos, detener la animación
                if (ciclos >= LIMITE_CICLOS) {
                    timer.cancel();
                }
            }
        };

        
        timer.scheduleAtFixedRate(tarea, velocidad,velocidad);
        
        
    }
    
   

}
