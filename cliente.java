
package power.life.gym;

import java.util.ArrayList;
import java.util.List;

public class cliente {

   public cliente(){
    
    }
    
    public cliente(String _nombre, Integer _cedula, Integer _peso, String _fecha, Integer _telefono ){
        nombre=_nombre;
        cedula= _cedula;
        peso=_peso;
        fechapago=_fecha;
        telefono=_telefono;
    }
    
    public String nombre;

    /**
     *
     */
    public int peso;
    public String fechapago;
    public int cedula;
    public int telefono;
    //
    List<cliente> lista = new ArrayList<cliente>();
    
    public void Agregar(cliente _cliente)
    {
        lista.add(new cliente(_cliente.nombre, _cliente.cedula, _cliente.peso, _cliente.fechapago, _cliente.telefono ) );
    }
    public void Eliminar(cliente i)
    {
        lista.remove(i);
    }
   
           
    

    
}
