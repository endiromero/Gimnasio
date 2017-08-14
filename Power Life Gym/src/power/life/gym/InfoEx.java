
package power.life.gym;

import javax.swing.JOptionPane;


public class InfoEx {

    public InfoEx() {
    }
    public static int demeNum(String msj) {
        String s = javax.swing.JOptionPane.showInputDialog(msj);
        int n = Integer.parseInt(s);
        return n;
    }   
    
    
    public static void Contacto(){ 
    
   JOptionPane.showMessageDialog(null, "Nuestro horario es de 5 de la mañana a 9 de la noche\n "
           + "costo de matricula 12000\n"
           + "Contamos con instructores propios\n"
           + "Más información contactar al 83180374 o nuestro correo powerGym@gmail.com ");
    
    
   
    
    
   
    }
    
    
       
    
     
     
     
}//fin de clase

