
package power.life.gym;

import java.util.ArrayList;
import java.util.List;


public class Entrenadores {

    public Entrenadores() {
    }

    public Entrenadores(String nombre, int paga, int fechapago, int cedula, int telefono) {
        this.nombre = nombre;
        this.paga = paga;
        this.fechapago = fechapago;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    
    
    public String nombre;
    public int paga;
    public int fechapago;
    public int cedula;
    public int telefono;

    //
    List<Entrenadores> lista = new ArrayList<Entrenadores>();
    
    public void Agregar(Entrenadores _entrenadores)
    {
        lista.add(new Entrenadores(_entrenadores.nombre, _entrenadores.cedula, _entrenadores.paga, _entrenadores.fechapago, _entrenadores.telefono ) );
    }
    public void Eliminar(Entrenadores i)
    {
        lista.remove(i);
    }
       
    }
   
