
package power.life.gym;

import javax.swing.JOptionPane;


public class Rutinas {
 public static int demeNum(String msj){
        String s= javax.swing.JOptionPane.showInputDialog(msj);
        int n = Integer.parseInt(s);
        return n;
        
    }

    public Rutinas() {
        
    }
    
    public static void pecho(){
        String menu= "1. Rutina1\n"
                +"2. Rutina2\n"
                +"3. Rutina3\n"
                +"4. Rutina4\n";
        int opcion = demeNum(menu);
        switch (opcion) {
            case 1:
                JOptionPane.showMessageDialog(null,"1.Press de banco inclinado\n" +"2. Press de banco plano\n"+"3. Press de banco declinado\n"+ "4. Press de banco plano manos Juntas\n");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"1. Press maquina convergente\n"+"2. Fondos\n"+"3. Lagartijas\n"+"4. Press con mancuernas en Banco plano\n");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"1. Aperturas con mancuernas en banco plano\n"+"2. Press con mancuernas en banco inclinado\n"+"3. Aperturas con mancuernas en banco inclinado\n"+"4. Aperturas en contractor de pecho\n");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"1. Cruces de pie con poleas\n"+"2. Pullover con mancuerna\n"+"3. Pullover con barra\n");
                break;
                
            
        }
    }
    
    public static void abdomen(){
        String menu="1. Rutina\n"
                +"2. Rutina2\n"
                +"3. Rutina3\n"
                +"4. Rutina4\n";
        int opcion = demeNum(menu);
        switch (opcion) {
            case 1:
                JOptionPane.showMessageDialog(null,"1. Cruch\n"+"2. Elevaciones de tronco en el suelo\n"+"3. Elevaciones del tronco en espaldera\n"+"4. Cruch en banco");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"1. Elevaciones del tronco banco declinado\n"+"2. Elevaciones del tronco banco especifico\n"+"3. Crunch con polea alta\n"+"4. Crunch en maquina especifica\n");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"1. Elevaciones del tronco en plancha\n"+"2. Elevaciones en paralelas\n"+"3. Elevaciones de piernas en barra\n"+"4. Rotacion del tronco\n");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"1. Flexion del tronco con mancuerna\n"+"2. Flexion del tronco en banco\n"+"3. Rotacion del tronco en maquina\n"+"4. Crunches bicicleta\n");
                break;
        }
    }
    
    public static void espalda(){
         String menu="1. Rutina\n"
                +"2. Rutina2\n"
                +"3. Rutina3\n"
                +"4. Rutina4\n";
        int opcion = demeNum(menu);
        switch (opcion){
            case 1:
                JOptionPane.showMessageDialog(null,"1. Dominadas en barra fija\n"+"2. Dominadas en barra fija agarre cerrado\n"+"3. Traccion pecho en polea alta\n"+"4. Traccion tras nuca en polea alta\n");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"1. Polea al pecho con agarre cerrado\n"+"2. Remo en polea baja agarre cerrado\n"+"3. Remo en polea baja con barra ancha\n"+"4. Pullover con polea alta brazos extendidos\n");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"1. Remo horizontal a una mano con mancuerna\n"+"2. Traccion horizontal con mancuernas\n"+"3. Remo horizontal con barra\n"+"4. Remo en barra T sin apoyo ventral\n");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"1. Remo en barra T con apoyo ventral\n"+"2. Peso muerto piernas extendidas\n"+"3. peso muerto estilo sumo\n"+"4. Peso muerto con barra\n");
                break;
        }
    }
    
    public static void hombro(){
         String menu="1. Rutina\n"
                +"2. Rutina2\n"
                +"3. Rutina3\n"
                +"4. Rutina4\n"
                +"5. Rutina5\n";
        int opcion = demeNum(menu);
        switch (opcion){
            case 1:
                JOptionPane.showMessageDialog(null,"1. Press militar\n"+"2. Press arnold\n"+"3. Elevacion frontal con mancuerna\n"+"4. Elevaciones frontales polea baja\n");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"1. Elevaciones frontales semipronocion\n"+"2. Elevaciones frontales con mancuerna\n"+"3. Elevaciones frontales con barra\n"+"4. Press con barra tras nuca");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"1. Elevaciones laterales inclinado\n"+"2. Reverse crossovers polea alta\n"+"3. Rotaciones externas en polea media\n"+"4. Elevaciones laterarles crossover inclinado\n");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"1. Aperturas en maquina\n"+"2. Press con mancuerna\n"+"3. Elevaciones laterales\n"+"4. Elevaciones laterales acostado\n");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"1. Elevaciones laterales polea baja\n"+"2. Elevacion de barra manos separadas\n"+"3. Elevaciones laterales en maquina\n");
                break;
        }
    }
    
    public static void trapecio_antebrazo(){
        String menu="1. Rutina\n"
                +"2. Rutina\n";
        int opcion = demeNum(menu);
        switch (opcion){
            case 1:
                 JOptionPane.showMessageDialog(null,"1. Remo al cuello con manos juntos\n"+"2. Encogimientos de hombros con barra\n"+"3. Encogimientos con mancuernas\n"+"4. Elevacion de los hombros barra Trap\n");
                break;        
            case 2:
                JOptionPane.showMessageDialog(null,"1. Curl de muñeca en banco pronacion}n"+"2. Curls de muñeca en banco en supinacion\n"+"3. Levantamiento de hombros en maquina\n");
        }
    }
    
    public static void biceps(){
         String menu="1. Rutina\n"
                +"2. Rutina2\n";
        int opcion = demeNum(menu);
        switch (opcion){
            case 1:
                JOptionPane.showMessageDialog(null,"1. Curl de biceps con mancuernas\n"+"2. Curl concentrado\n"+"3. Curl en banco inclinado\n"+"4. Hammer curls alternados\n"+"5. Reverse barbell Curls\n");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"1. Curl en polea baja\n"+"2. Curls en polea alta\n"+"3. Curls con barra\n"+"4. Curls en maquina Scott\n"+"5. Curls en banco Scott\n");
                break;
        }
    }
    
    public static void triceps(){
        String menu="1. Rutina\n"
                +"2. Rutina2\n";
        int opcion = demeNum(menu);
        switch (opcion){
            case 1:
                JOptionPane.showMessageDialog(null,"1. Pushdowns en pronocion\n"+"2. Pushdowns en supinacion\n"+"3. Pushdowns a una mano\n"+"4. Extensiones arriba de la cabeza\n"+"5. Extensiones acostado con barra\n"+"6. Extensiones con mancuernas acostado\n");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"1. Extensiones a una mano con mancuerna\n"+"2. Patada con mancuerna\n"+"3. Copa a dos manos\n"+"4. Fondos en banco\n"+"5. Extensiones sentado con barra\n");
                break;       
        }
        
    }
    
    public static void piernas(){
         String menu="1. Rutina\n"
                +"2. Rutina2\n"
                +"3. Rutina3\n";
        int opcion = demeNum(menu);
        switch (opcion){
            case 1:
                JOptionPane.showMessageDialog(null,"1. Flexion de rodillas con mancuernas\n"+"2. Flexion de rodillas con una mancuerna\n"+"3. Sentadillas frontales con barra\n"+"4. Sentadillas\n"+"5. Sentadillas piernas separadas\n");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"1. Press de pierna inclinado\n"+"2. Hack squat\n"+"3. Box squat\n"+"4. Extension de rodilas en maquina\n"+"5. Curls de piernas\n");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"1. Femorales alternos de pie en maquina\n"+"2. Fermorales sentado en maquina\n"+"3. Flexion anterior de tronco\n"+"4. Aductores en polea baja\n"+"5. Aductores en maquina\n");
                break;     
        }
    }
    
    public static void gluteos_pantorillas(){
          String menu="1. Rutina\n"
                +"2. Rutina2\n"
                +"3. Rutina3\n";
        int opcion = demeNum(menu);
        switch (opcion){
            case 1:
                JOptionPane.showMessageDialog(null,"1. Flexion de una pierna\n"+"2. Extension de la cadera polea baja\n"+"3. Zancadas con mancuernas\n"+"4. Extension de la cadera en maquina\n"+"5. Extension de la cadera banco plano\n");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"1. Elevacion de la pelves en banco\n"+"2. Abduccion de la cadera polea baja\n"+"3. Abduccion de la cadera en maquina\n"+"4. Abduccion de la cadera acostado\n"+"5. Abductores sentado en maquina\n");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"1. Flexion y Extension de los pies\n"+"2. Extension de los tobillos\n"+"3. Extension de un pie con mancuerna\n"+"4. Elevacion de pantorrillas Donkey\n"+"5. Extension de los pies sentado\n");
                break;
        }
    } 
    public static void menuRu(){
     String menu="1. Pecho\n"
                +"2. Abdomen\n"
                +"3. Biceps\n"
                +"4. Espalda\n"
                +"5. Gluteos y pantorillas\n"
                +"6. Hombros\n"
                +"7. Piernas\n"
                +"8. Triceps\n"
                +"9. Trapecios y antebrazos";
        int opcion=demeNum(menu);
        switch (opcion){
            case 1:
                Rutinas.pecho();
                break;
            case 2:
                Rutinas.abdomen();
                break;
            case 3:
                Rutinas.biceps();
                break;
            case 4:
                Rutinas.espalda();
                break;
            case 5:
                Rutinas.gluteos_pantorillas();
                break;
            case 6:
               Rutinas.hombro();
                break;
            case 7:
                Rutinas.piernas();
                break;
            case 8:
                Rutinas.triceps();
                break;
            case 9:
                Rutinas.trapecio_antebrazo();
                break;
        }
    }
}
