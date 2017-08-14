
package power.life.gym;




public class Factura1 extends javax.swing.JFrame {

    public Factura1() {
        initComponents();
    }
    
    Factura datos=new Factura();


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        cell = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        mes = new javax.swing.JTextField();
        total = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(480, 330));
        setMinimumSize(new java.awt.Dimension(480, 330));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(480, 330));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PowerLife Gym");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 10, 380, 24);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Factura");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 41, 75, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(19, 76, 85, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cedula:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(19, 117, 85, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(19, 158, 85, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(19, 227, 85, 23);
        getContentPane().add(name);
        name.setBounds(190, 80, 174, 20);
        getContentPane().add(id);
        id.setBounds(190, 120, 174, 20);
        getContentPane().add(cell);
        cell.setBounds(190, 160, 174, 20);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 280, 104, 23);

        jButton2.setText("Respuesta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 280, 110, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mes a pagar:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 190, 120, 24);
        getContentPane().add(mes);
        mes.setBounds(190, 200, 174, 20);
        getContentPane().add(total);
        total.setBounds(190, 230, 174, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tumblr_n574fyJDBS1tyz775o1_1280.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(-360, 0, 1320, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int mes1,total1;
        mes1=(int)Double.parseDouble(mes.getText());
        total1=mes1*15000;
        total.setValue(total1);        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField cell;
    public static javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mes;
    public static javax.swing.JTextField name;
    private javax.swing.JSpinner total;
    // End of variables declaration//GEN-END:variables
}
