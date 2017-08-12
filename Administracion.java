
package power.life.gym;

import javax.swing.JOptionPane;


public class Administracion {
    int ingreso[];
    
    
    public static int demeNum(String msj){
        String s= javax.swing.JOptionPane.showInputDialog(msj);
        int n = Integer.parseInt(s);
        return n;
        
    }

    public Administracion() {
        
    }
    public void ingre(){
        //int ingreso[];
        ingreso= new int[13];
        
        ingreso[0]=100000;
        ingreso[1]=500000;
        ingreso[2]=350000;
        ingreso[3]=400000;
        ingreso[4]=250000;
        ingreso[5]=700000;
        ingreso[6]=375000;
        ingreso[7]=800000;
        ingreso[8]=612400;
        ingreso[9]=490000;
        ingreso[10]=825000;
        ingreso[11]=220000;
      
        int total=0;
        for (int i = 12; i < 13; i++) {
            total=(ingreso[0]+ingreso[1]+ingreso[2]+ingreso[3]+ingreso[4]+ingreso[5]+ingreso[6]+ingreso[7]+ingreso[8]+ingreso[9]+ingreso[10]+ingreso[11]);
            
        }
        
        String menu ="1. Enero\n"
                  +"2. Febrero\n"
                  +"3. Marzo\n"
                  +"4. Abril\n"
                  +"5. Mayo\n"
                  +"6. Junio\n"
                  +"7. Julio\n"
                  +"8. Agosto\n"
                  +"9. Septiembre\n"
                  +"10. Octubre\n"
                  +"11. Noviembre\n"
                  +"12. Diciembre\n"
                  +"13. Total de ingresos\n"
                  +"14.Ganancias \n";
          int opcion = demeNum(menu);
        switch (opcion){
            case 1:
                 JOptionPane.showMessageDialog(null,"Su ingresos en el mes de Enero es de:\n"+ ingreso[1]);
                break;
            case 2:
                 JOptionPane.showMessageDialog(null,"Su ingresos en el mes de Febrero es de:\n"+ ingreso[2]);
                break;
            case 3:
                 JOptionPane.showMessageDialog(null,"Su ingresos en el mes de Marzo es de:\n"+ ingreso[3]);
                break;
            case 4:
                 JOptionPane.showMessageDialog(null,"Su ingresos en el mes de Abril es de:\n"+ ingreso[4]);
                break;
            case 5:
                 JOptionPane.showMessageDialog(null,"Su ingresos en el mes de Mayo es de:\n"+ ingreso[5]);
                break;
            case 6:
                 JOptionPane.showMessageDialog(null,"Su ingresos en el mes de Junio es de:\n"+ ingreso[6]);
                break;
            case 7:
                 JOptionPane.showMessageDialog(null,"Su ingresos en el mes de Julio es de:\n"+ ingreso[7]);
                break;
            case 8:
                 JOptionPane.showMessageDialog(null,"Su ingresos en el mes de Agosto es de:\n"+ ingreso[8]);
                break;
            case 9:
                 JOptionPane.showMessageDialog(null,"Su ingresos en el mes de Septiembre es de:\n"+ ingreso[9]);
                 break;
            case 10:
                 JOptionPane.showMessageDialog(null,"Su ingresos en el mes de Octubre es de:\n"+ ingreso[10]);
                break;
            case 11: 
                 JOptionPane.showMessageDialog(null,"Su ingresos en el mes de Noviembre es de:\n"+ ingreso[11]);
                break;
            case 12:
                 JOptionPane.showMessageDialog(null,"Su ingresos en el mes de Diciembre es de:\n"+ ingreso[12]);
                break;
            case 13:
                JOptionPane.showMessageDialog(null,"El total de ingresos del año : "+ total);
                break;
            case 14:
                int ganancia=0;
        for (int i = 12; i < 13; i++) { 
            int gasto=demeNum("Digite los Gastos totales");
            JOptionPane.showMessageDialog(null,"Escoja el mes que quiere saber las ganancias");
            ganancia=(ingreso[0]-gasto);
            ganancia=(ingreso[1]-gasto);
            ganancia=(ingreso[2]-gasto);
            ganancia=(ingreso[3]-gasto);
            ganancia=(ingreso[4]-gasto);
            ganancia=(ingreso[5]-gasto);
            ganancia=(ingreso[6]-gasto);
            ganancia=(ingreso[7]-gasto);
            ganancia=(ingreso[8]-gasto);
            ganancia=(ingreso[9]-gasto);
            ganancia=(ingreso[10]-gasto);
            ganancia=(ingreso[12]-gasto);
            String menus ="1. Enero\n"
                  +"2. Febrero\n"
                  +"3. Marzo\n"
                  +"4. Abril\n"
                  +"5. Mayo\n"
                  +"6. Junio\n"
                  +"7. Julio\n"
                  +"8. Agosto\n"
                  +"9. Septiembre\n"
                  +"10. Octubre\n"
                  +"11. Noviembre\n"
                  +"12. Diciembre\n";
          int opcions = demeNum(menus);
        switch (opcions){
            case 1:
                 JOptionPane.showMessageDialog(null,"Sus ganancias en el mes de Enero es de:\n"+ganancia );
                break;
            case 2:
                 JOptionPane.showMessageDialog(null,"Sus ganancias en el mes de Febrero es de:\n"+ ganancia);
                break;
            case 3:
                 JOptionPane.showMessageDialog(null,"Sus ganancias en el mes de Marzo es de:\n"+ ganancia);
                break;
            case 4:
                 JOptionPane.showMessageDialog(null,"Sus ganancias en el mes de Abril es de:\n"+ ganancia);
                break;
            case 5:
                 JOptionPane.showMessageDialog(null,"Sus ganancias en el mes de Mayo es de:\n"+ ganancia);
                break;
            case 6:
                 JOptionPane.showMessageDialog(null,"Sus ganancias en el mes de Junio es de:\n"+ ganancia);
                break;
            case 7:
                 JOptionPane.showMessageDialog(null,"Sus ganancias en el mes de Julio es de:\n"+ ganancia);
                break;
            case 8:
                 JOptionPane.showMessageDialog(null,"Sus ganancias en el mes de Agosto es de:\n"+ ganancia);
                break;
            case 9:
                 JOptionPane.showMessageDialog(null,"Sus ganancias en el mes de Septiembre es de:\n"+ ganancia);
                 break;
            case 10:
                 JOptionPane.showMessageDialog(null,"Sus ganancias en el mes de Octubre es de:\n"+ ganancia);
                break;
            case 11: 
                 JOptionPane.showMessageDialog(null,"Sus ganancias en el mes de Noviembre es de:\n"+ ganancia);
                break;
            case 12:
                 JOptionPane.showMessageDialog(null,"Sus ganancias en el mes de Diciembre es de:\n"+ ganancia);
                break;
        }
           
        }
                break;
                
        }
        
    }
    
   
}
