
package power.life.gym;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VentInventario extends javax.swing.JFrame {
    inventario miInventario= new inventario();
    inventario tInv;
    Integer index;
    
    public VentInventario() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblInv = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        spinMan = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        spinDis = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        spinMaq = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        spinBar = new javax.swing.JSpinner();
        exit = new javax.swing.JButton();
        btReturn = new javax.swing.JButton();
        btMod = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btAgregar = new javax.swing.JButton();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(883, 460));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblInv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Mancuernas", "Discos", "Maquinas", "Barras"
            }
        ));
        jScrollPane2.setViewportView(tblInv);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 880, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Cantidad de Mancuernas:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, 20));
        getContentPane().add(spinMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 110, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Cantidad de Discos: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, -1));
        getContentPane().add(spinDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Cantidad de Maquinas: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));
        getContentPane().add(spinMaq, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 110, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Cantiad de Barras:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 130, -1));
        getContentPane().add(spinBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 110, -1));

        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, -1, -1));

        btReturn.setText("Regresar");
        btReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, -1, -1));

        btMod.setText("Modificar");
        btMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModActionPerformed(evt);
            }
        });
        getContentPane().add(btMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        btDelete.setText("Eliminar");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        btAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btAgregar.setText("Agregar");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bg-fitness.jpg"))); // NOI18N
        img.setText("Cantidad de Discos");
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, -50, 1120, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
       Agregar();
       CargaLista();
    }//GEN-LAST:event_btAgregarActionPerformed

    private void btModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModActionPerformed
      Modificar();
    }//GEN-LAST:event_btModActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
      eliminar();
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReturnActionPerformed
        this.setVisible(false);  
    }//GEN-LAST:event_btReturnActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
      System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void Agregar()
    {
        try
        {
            if(Validar())
            {
           
                if(tInv==null){
                //nuevo
                miInventario.mancuernas=(Integer) spinMan.getValue();
                miInventario.barras=(Integer) spinBar.getValue();
                miInventario.maquinas=(Integer) spinMaq.getValue();
                miInventario.discos=(Integer) spinDis.getValue();
                //
                miInventario.agregar(miInventario);
            }
            else 
            {
                
                 miInventario.lista.get(index).mancuernas = (Integer)spinMan.getValue();
                 miInventario.lista.get(index).barras = (Integer)spinBar.getValue(); 
                 miInventario.lista.get(index).maquinas =  (Integer)spinMaq.getValue();
                 miInventario.lista.get(index).discos = (Integer)spinDis.getValue();
               
                 tInv=null;
            }        
            LimpiaControles();
            }
             }
        catch(Exception e)
        {
              JOptionPane.showMessageDialog(null, "Digite información");
        }
    }
     
    private boolean Validar(){
     
        if(spinMan.getValue()=="")
        {
          JOptionPane.showMessageDialog(null, "Digite un numero");
            return false;
        }
        return true;
    }   
    
    private void LimpiaControles(){
        
       spinMan.setValue(0);
        spinBar.setValue(0);
        spinDis.setValue(0);
        spinMaq.setValue(0);
    }

   
    
   
    
public void CargaLista(){
    DefaultTableModel modelo = (DefaultTableModel)tblInv.getModel();
            modelo.getDataVector().removeAllElements();
            ((DefaultTableModel)tblInv.getModel()).setNumRows(0);
            for(inventario item :       miInventario.lista )     
            {
                Object[] obj = new Object[4];
                obj[0]= item.mancuernas;
                obj[1]= item.discos;
                obj[2]= item.barras;
                obj[3]= item.maquinas;
              
                //
                modelo.addRow(obj);
            }
            //
            tblInv.setModel(modelo);
}
    public void eliminar(){
          DefaultTableModel model = (DefaultTableModel)tblInv.getModel(); 

int a = tblInv.getSelectedRow(); 

if (a<0){

        JOptionPane.showMessageDialog(null,
        "Debe seleccionar una fila de la tabla" );  

}else {


     int confirmar=JOptionPane.showConfirmDialog(null,  
     "Esta seguro que desea Eliminar el registro? ");



            if(JOptionPane.OK_OPTION==confirmar) {
                     
                    model.removeRow(a);

                    JOptionPane.showMessageDialog(null, 
                    "Registro Eliminado" );
             
             }
}
    
        } 
    private void Modificar(){
   
       index= tblInv.getSelectedRow();
     tInv=(inventario) miInventario.lista.get(index);
        spinMan.setValue(tInv.mancuernas);
        spinBar.setValue(tInv.barras);
        spinDis.setValue(tInv.discos);
        spinMaq.setValue(tInv.maquinas);
      
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btMod;
    private javax.swing.JButton btReturn;
    private javax.swing.JButton exit;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spinBar;
    private javax.swing.JSpinner spinDis;
    private javax.swing.JSpinner spinMan;
    private javax.swing.JSpinner spinMaq;
    private javax.swing.JTable tblInv;
    // End of variables declaration//GEN-END:variables
}
