
package power.life.gym;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wfons_000
 */
public class VentEntrenadores extends javax.swing.JFrame {
 Entrenadores miEntrenador=new Entrenadores();
 Entrenadores tCliente;
 Integer index;
    
    
    
    
    public VentEntrenadores() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTel = new javax.swing.JFormattedTextField();
        txtCedula = new javax.swing.JFormattedTextField();
        txtnombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblEnt = new javax.swing.JTable();
        btAgregar = new javax.swing.JButton();
        btMod = new javax.swing.JButton();
        btEli = new javax.swing.JButton();
        SpinDia = new javax.swing.JSpinner();
        spinSal = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(969, 356));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre Completo: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 220, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cedula:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 50, 199, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefono:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 90, 168, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Salario:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 130, 177, 29);

        txtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        getContentPane().add(txtTel);
        txtTel.setBounds(219, 89, 282, 20);

        txtCedula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCedula);
        txtCedula.setBounds(219, 57, 282, 20);
        getContentPane().add(txtnombre);
        txtnombre.setBounds(219, 20, 282, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cant. Días Trabajo:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 170, 210, 30);

        TblEnt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cedula", "Telefono", "Salario", "Dias deTrabajo"
            }
        ));
        jScrollPane1.setViewportView(TblEnt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(507, 0, 462, 360);

        btAgregar.setText("Agregar");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btAgregar);
        btAgregar.setBounds(240, 330, 90, 23);

        btMod.setText("Modificar");
        btMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModActionPerformed(evt);
            }
        });
        getContentPane().add(btMod);
        btMod.setBounds(330, 330, 90, 23);

        btEli.setText("Eliminar");
        btEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliActionPerformed(evt);
            }
        });
        getContentPane().add(btEli);
        btEli.setBounds(420, 330, 80, 23);
        getContentPane().add(SpinDia);
        SpinDia.setBounds(400, 180, 95, 20);
        getContentPane().add(spinSal);
        spinSal.setBounds(400, 130, 95, 20);

        jButton2.setText("Retroceso");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 330, 81, 23);

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(90, 330, 73, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tumblr_mo369cJxJM1roycb4o1_1280-600x450.jpg"))); // NOI18N
        jLabel6.setText("Retroceso");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1000, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
     Agregar();
     CargaLista();
    
    }//GEN-LAST:event_btAgregarActionPerformed

    private void btEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliActionPerformed
        eliminar();
    }//GEN-LAST:event_btEliActionPerformed

    private void btModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModActionPerformed
    Modificar();
    }//GEN-LAST:event_btModActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       System.exit(0);
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);     
    }//GEN-LAST:event_jButton2ActionPerformed
    
     private void Agregar()
    {
         try
        {
            if(Validar())
            {
                if(tCliente==null){
              
                miEntrenador.nombre = txtnombre.getText();
                miEntrenador.cedula = Integer.parseInt(txtCedula.getText()); 
                miEntrenador.paga  =  (Integer)spinSal.getValue();
                miEntrenador.telefono = Integer.parseInt(txtTel.getText());
                miEntrenador.fechapago =(Integer)SpinDia.getValue();
                //
                miEntrenador.Agregar(miEntrenador);
            }
            else 
            {
                
                miEntrenador.lista.get(index).nombre = txtnombre.getText();
                miEntrenador.lista.get(index).cedula = Integer.parseInt(txtCedula.getText()); 
                miEntrenador.lista.get(index).paga  =  (Integer)spinSal.getValue();
                miEntrenador.lista.get(index).telefono = Integer.parseInt(txtnombre.getText());
                miEntrenador.lista.get(index).fechapago = (Integer)SpinDia.getValue();
                tCliente=null;
            }        
            LimpiaControles();
            }
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, "Digite información");
        }
    }                                       
      
    
    private void LimpiaControles(){
 
        txtnombre.setText("");
        txtCedula.setText("");
        spinSal.setValue(0);
        txtTel.setText("");
        SpinDia.setValue(0);
    }

   
    
    private boolean Validar(){
       
        if("".equals(txtnombre.getText()))
        {
           JOptionPane.showInternalMessageDialog(null, "Digite un Nombre");
            return false;
        }
        return true;
    }       
    
public void CargaLista(){
    DefaultTableModel modelo = (DefaultTableModel)TblEnt.getModel();
            modelo.getDataVector().removeAllElements();
            ((DefaultTableModel)TblEnt.getModel()).setNumRows(0);
            for(Entrenadores item :      miEntrenador.lista )     
            {
                Object[] obj = new Object[5];
                obj[0]= item.nombre;
                obj[1]= item.cedula;
                obj[2]= item.telefono;
                obj[3]= item.fechapago;
                obj[4]= item.paga;
                //
                modelo.addRow(obj);
            }
            //
            TblEnt.setModel(modelo);
}
    public void eliminar(){
          DefaultTableModel model = (DefaultTableModel) TblEnt.getModel(); 

int a = TblEnt.getSelectedRow(); 

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
   
       index= TblEnt.getSelectedRow();
     tCliente=(Entrenadores)miEntrenador.lista.get(index);
        txtnombre.setText(tCliente.nombre);
        txtCedula.setValue(tCliente.cedula);
        spinSal.setValue(tCliente.paga);
        txtTel.setValue(tCliente.telefono);
        SpinDia.setValue(tCliente.fechapago);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpinDia;
    private javax.swing.JTable TblEnt;
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btEli;
    private javax.swing.JButton btMod;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinSal;
    private javax.swing.JFormattedTextField txtCedula;
    private javax.swing.JFormattedTextField txtTel;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
