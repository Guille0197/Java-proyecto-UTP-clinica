/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoDesarrolloSoftware;

/**
 *
 * @author Guillermo
 */
public class Programadores extends javax.swing.JFrame {

    /**
     * Creates new form Programadores
     */
    public Programadores() {
        initComponents();
        this.setLocationRelativeTo(null);// CENTRAR FORM
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresarr = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresarr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresarr.setForeground(new java.awt.Color(0, 51, 102));
        btnRegresarr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/HOME_1.png"))); // NOI18N
        btnRegresarr.setBorderPainted(false);
        btnRegresarr.setContentAreaFilled(false);
        btnRegresarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarrActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresarr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 50, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("{ DESARROLLO DE SOFTWARE II }");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 220, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("</GUILLERMO NAVARRO 8-962-683>");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("</SAMUEL SOLÍS 6-721-1854>");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 200, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PROGRAMADORES");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 390, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 380, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("</MIGUEL CEDEÑO 6-722-1658>");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dino 641x365 EDITADO.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarrActionPerformed
        this.dispose();//cierra el formualrio sin salir del programa
        PagePresentation p = new PagePresentation();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarrActionPerformed

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
            java.util.logging.Logger.getLogger(Programadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresarr;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
