/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Matyena
 */
public class PantallaAyuda extends javax.swing.JFrame {

    /**
     * Creates new form PantallaAyuda
     */
    public PantallaAyuda() {
        initComponents();
        
        String explicacionT20A = "<html>También conocida como tarifa general, <br>es de tramo único, lo que quiere decir <br>que cuenta con precio uniforme <br>para el consumo de todas las horas<br> del día. Es la más común.</html>";
        String explicacionT20DHA = "<html>La tarifa con discriminación horaria <br>es de dos tramos, lo que significa <br>que aplica un precio mucho menor a las horas nocturnas</html>";
        String explicacionT20DHS = "<html>La tarifa para vehículos eléctricos, <br>consta de tres tramos, <br>y está ideada para aquellos<br>que cuenten con coche eléctrico.";
        
        jLabel_ExplicacionT20A.setText(explicacionT20A);
        jLabel_ExplicacionT20DHA.setText(explicacionT20DHA);
        jLabel_ExplicacionT20DHS.setText(explicacionT20DHS);
        
        
        String preguntaPotencia = "¿Y cómo sé qué potencia tengo contratada?";
        String explicacionPotencia = "Puedes consultarlo en el apartado de 'Consumos' de tu factura";
        
        jLabel_PreguntaPotencia.setText(preguntaPotencia);
        jLabel_ExplicacionPotencia.setText(explicacionPotencia);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_ExplicacionT20A = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_ExplicacionT20DHA = new javax.swing.JLabel();
        jLabel_ExplicacionT20DHS = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_PreguntaPotencia = new javax.swing.JLabel();
        jLabel_ExplicacionPotencia = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_INICIO = new javax.swing.JMenu();
        jMenu_T20A = new javax.swing.JMenu();
        jMenuItem_T20A = new javax.swing.JMenuItem();
        jMenuItem_T20DHA = new javax.swing.JMenuItem();
        jMenuItem_T20DHS = new javax.swing.JMenuItem();
        jMenu_PantallaAyuda = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 630));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 630));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¿Qué tarifa tengo contratada?");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(362, 224, 277, 22);

        jLabel_ExplicacionT20A.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel_ExplicacionT20A.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_ExplicacionT20A.setText("La tarifa 2.0A es la tarifa general,");
        jPanel1.add(jLabel_ExplicacionT20A);
        jLabel_ExplicacionT20A.setBounds(50, 320, 280, 150);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tarifa 2.0A");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 300, 102, 22);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tarifa 2.0DHA");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(440, 300, 130, 22);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tarifa 2.0DHS");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(730, 300, 127, 22);

        jLabel_ExplicacionT20DHA.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel_ExplicacionT20DHA.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_ExplicacionT20DHA.setText("texto");
        jPanel1.add(jLabel_ExplicacionT20DHA);
        jLabel_ExplicacionT20DHA.setBounds(380, 320, 251, 140);

        jLabel_ExplicacionT20DHS.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel_ExplicacionT20DHS.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_ExplicacionT20DHS.setText("La tarifa 2.0A es la tarifa general,");
        jPanel1.add(jLabel_ExplicacionT20DHS);
        jLabel_ExplicacionT20DHS.setBounds(680, 320, 270, 130);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/interrogacion32.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 490, 32, 40);

        jLabel_PreguntaPotencia.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel_PreguntaPotencia.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PreguntaPotencia.setText("jLabel7");
        jPanel1.add(jLabel_PreguntaPotencia);
        jLabel_PreguntaPotencia.setBounds(70, 480, 590, 30);

        jLabel_ExplicacionPotencia.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel_ExplicacionPotencia.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_ExplicacionPotencia.setText("jLabel7");
        jPanel1.add(jLabel_ExplicacionPotencia);
        jLabel_ExplicacionPotencia.setBounds(70, 530, 630, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/interrogacion200.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(440, 20, 130, 200);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 610);

        jMenu_INICIO.setText("Inicio");
        jMenu_INICIO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_INICIOMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu_INICIO);

        jMenu_T20A.setText("Tarifas");

        jMenuItem_T20A.setText("Tarifa 2.0 A\t");
        jMenuItem_T20A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_T20AActionPerformed(evt);
            }
        });
        jMenu_T20A.add(jMenuItem_T20A);

        jMenuItem_T20DHA.setText("Tarifa 2.0 DHA\t");
        jMenuItem_T20DHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_T20DHAActionPerformed(evt);
            }
        });
        jMenu_T20A.add(jMenuItem_T20DHA);

        jMenuItem_T20DHS.setText("Tarifa 2.0 DHS\t");
        jMenuItem_T20DHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_T20DHSActionPerformed(evt);
            }
        });
        jMenu_T20A.add(jMenuItem_T20DHS);

        jMenuBar1.add(jMenu_T20A);

        jMenu_PantallaAyuda.setText("Ayuda");
        jMenuBar1.add(jMenu_PantallaAyuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_T20AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_T20AActionPerformed
        PantallaT20A pantallat20a = new PantallaT20A();
        pantallat20a.setVisible(true);
        pantallat20a.pack();
        pantallat20a.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem_T20AActionPerformed

    private void jMenu_INICIOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_INICIOMouseClicked
        PantallaInicio inicio = new PantallaInicio();
        inicio.setVisible(true);
        inicio.pack();
        inicio.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenu_INICIOMouseClicked

    private void jMenuItem_T20DHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_T20DHAActionPerformed
        PantallaT20DHA pantallat20dha = new PantallaT20DHA();
        pantallat20dha.setVisible(true);
        pantallat20dha.pack();
        pantallat20dha.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem_T20DHAActionPerformed

    private void jMenuItem_T20DHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_T20DHSActionPerformed
        PantallaT20DHS pantallat20dhs = new PantallaT20DHS();
        pantallat20dhs.setVisible(true);
        pantallat20dhs.pack();
        pantallat20dhs.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem_T20DHSActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PantallaAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaAyuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_ExplicacionPotencia;
    private javax.swing.JLabel jLabel_ExplicacionT20A;
    private javax.swing.JLabel jLabel_ExplicacionT20DHA;
    private javax.swing.JLabel jLabel_ExplicacionT20DHS;
    private javax.swing.JLabel jLabel_PreguntaPotencia;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem_T20A;
    private javax.swing.JMenuItem jMenuItem_T20DHA;
    private javax.swing.JMenuItem jMenuItem_T20DHS;
    private javax.swing.JMenu jMenu_INICIO;
    private javax.swing.JMenu jMenu_PantallaAyuda;
    private javax.swing.JMenu jMenu_T20A;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}