package power.life.gym;

import javax.swing.JOptionPane;


public class Factura {
      public static int demeNum(String msj) {
        String s = javax.swing.JOptionPane.showInputDialog(msj);
        int n = Integer.parseInt(s);
        return n;
    }

    public Factura() {
    }
    
    Integer id=0;
    String nombre="";
    Integer telefono=0;
    
    public void capDatos(){
        nombre=Factura1.name.getText();
        telefono=Integer.parseInt(Factura1.cell.getText());
        id=Integer.parseInt(Factura1.id.getText());
        
    }
    
    }
