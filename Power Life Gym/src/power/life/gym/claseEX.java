
package power.life.gym;

import javax.swing.JOptionPane;


public class claseEX {
 static Extra clases[]= new Extra[5];
    
    public  void inicializaclases(){
        clases[0]= new Extra ("Aerbicos\n", 5000, "\nLunes 8:00 AM");
        clases[1] = new Extra ("Anaerobicos\n", 5000, "\nMiercoles 7:00 AM");
        clases[2]= new Extra ("Spinning\n", 5000, "\nMartes y Sabado 8:00 PM");
        clases [3]= new Extra ("Defensa personal\n", 5000, "\nViernes 5:00PM");
        clases [4]= new Extra ("Insanity/n", 5000, "\nJueves 6:30 AM");
    
        for (int i = 5; i < clases.length; i++) {
            clases[i]= new Extra();
        }
    }
    
    public void recorreExtra(){
        String menu = "1.Aerobico\n"
               +"2. Anaerobicos\n"
               +"3. Spinning\n"
               +"4. Defensa personal\n"
               +"5. Insanity\n";
       int opcion = demeNum(menu);
       switch (opcion){
           case 1:
               JOptionPane.showMessageDialog(null,clases[0]);
               break;
           case 2:
               JOptionPane.showMessageDialog(null,clases[1]);
               break;
           case 3:
               JOptionPane.showMessageDialog(null,clases[2]);
               break;
           case 4:
               JOptionPane.showMessageDialog(null,clases[3]);
               break;
           case 5: 
               JOptionPane.showMessageDialog(null,clases[4]);
               break;
               
       }
        
    }
        
    public static int demeNum(String msj){
        String s= javax.swing.JOptionPane.showInputDialog(msj);
        int n =Integer.parseInt(s);
        return n;
    }    
}
