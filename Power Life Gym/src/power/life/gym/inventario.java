
package power.life.gym;

import java.util.ArrayList;
import java.util.List;


public class inventario {

    public inventario() {
    }

    public inventario(int mancuernas, int discos, int barras, int maquinas) {
        this.mancuernas = mancuernas;
        this.discos = discos;
        this.barras = barras;
        this.maquinas = maquinas;
    }

    
    
    public int mancuernas, discos, barras, maquinas;
    
    List<inventario> lista=new ArrayList<inventario>();
    
    public void agregar (inventario _inventario){
    
        lista.add(new inventario(_inventario.barras,_inventario.discos,_inventario.mancuernas,_inventario.maquinas));
        
    }
    
     public void Eliminar(Entrenadores i)
    {
        lista.remove(i);
    }
}
