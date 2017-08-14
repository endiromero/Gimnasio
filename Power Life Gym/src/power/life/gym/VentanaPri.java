/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power.life.gym;

import java.util.List;
import static power.life.gym.InfoEx.demeNum;

/**
 *
 * @author wfons_000
 */
public class VentanaPri extends javax.swing.JFrame {
 
 Rutinas mirutina=new Rutinas(); 
 claseEX miclase=new claseEX();
 InfoEx  informacionn=new InfoEx();
 
 
     public VentanaPri() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Out = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton7.setText("Generar Rutina");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(501, 460));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 0, 90, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Rutinas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 0, 110, 23);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Administrador");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(200, 0, 140, 23);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("Más Info");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(340, 0, 100, 23);

        Out.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Out.setText("Salir");
        Out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutActionPerformed(evt);
            }
        });
        getContentPane().add(Out);
        Out.setBounds(0, 440, 73, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ventPri.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -40, 760, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        menu();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       Rutinas.menuRu();
       
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       Login entra=new Login();
       entra.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   VentCliente listaCliente=new VentCliente();
   listaCliente.setVisible(true);
   
   
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
               Rutinas.menuRu();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void OutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutActionPerformed
      System.exit(0);
    }//GEN-LAST:event_OutActionPerformed
    
    public void menu(){
   String menu = "1.Información del gimnasio\n"
                + "2.Información sobre clases extra\n";
   int opcion = demeNum(menu);
        switch (opcion) {
            case 1: 
              InfoEx.Contacto();
               break;
            case 2:
                miclase.inicializaclases();
                miclase.recorreExtra();
             
               break;
        }
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
            java.util.logging.Logger.getLogger(VentanaPri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Out;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
