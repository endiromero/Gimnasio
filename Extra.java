/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power.life.gym;


public class Extra {
  String clase;
    int costo;
    String dias_hora;

    public Extra() {
    }

    
    
    public Extra(String clase, int costo, String dias_hora) {
        this.clase = clase;
        this.costo = costo;
        this.dias_hora = dias_hora;
    }

    @Override
    public String toString() {
        return "Extra" + "\nclase: " + clase + "costo: " + costo + "\ndias y hora: " + dias_hora +  '}';
    }
   
}
