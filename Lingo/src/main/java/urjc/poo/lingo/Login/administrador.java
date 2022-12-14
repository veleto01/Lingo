package urjc.poo.lingo.Login;

import javax.swing.JFrame;

import urjc.poo.lingo.Clases.*;


public class administrador extends javax.swing.JFrame {

    AlmacenUsuarios aU;
    Usuario usu;
    AlmacenPartidas aP;
    AlmacenPalabras aPa;
    public administrador( AlmacenUsuarios a, Usuario uusu, AlmacenPartidas ap, AlmacenPalabras apa) {
        initComponents();
        this.setLocationRelativeTo(null);
        aU = a;
        usu = uusu;
        aPa = apa;
        aP= ap;
    }

    public administrador(){
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Baja = new javax.swing.JButton();
        Registrarse = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        infoPartidas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Baja.setBackground(new java.awt.Color(255, 255, 255));
        Baja.setText("Dar de baja");
        Baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaActionPerformed(evt);
            }
        });

        Registrarse.setBackground(new java.awt.Color(255, 255, 255));
        Registrarse.setText("Registrarse");
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Perfil de jugadores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        infoPartidas.setBackground(new java.awt.Color(255, 255, 255));
        infoPartidas.setText("Informacion Partidas");
        infoPartidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoPartidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Registrarse)
                            .addComponent(Baja))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(infoPartidas)))
                .addGap(37, 37, 37)
                .addComponent(Salir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Salir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Baja)
                        .addGap(18, 18, 18)
                        .addComponent(Registrarse)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(infoPartidas)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaActionPerformed
        eliminarUsuario iden = new eliminarUsuario(new javax.swing.JDialog(),true, aU,usu,aP,aPa);
        this.dispose();
        iden.setVisible(true);
    }//GEN-LAST:event_BajaActionPerformed

    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed

        Registrar iden = new Registrar(aU,usu,aP,aPa);
        this.dispose();
        iden.setVisible(true);

    }//GEN-LAST:event_RegistrarseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        perfilesAdministrador ventana = new perfilesAdministrador(aU,usu,aP,aPa);
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        //AlmacenPartidas p, AlmacenUsuarios a, AlmacenPalabras apa, Usuario u
        this.dispose();
        Menu nuevoMenu = new Menu(aP, aU, aPa, usu);
        nuevoMenu.setVisible(true);
    }//GEN-LAST:event_SalirActionPerformed

    private void infoPartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoPartidasActionPerformed
        InfoPartidas i = new InfoPartidas(aP, aU, aPa, usu);
        this.dispose();
        i.setVisible(true);
    }//GEN-LAST:event_infoPartidasActionPerformed

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
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Baja;
    private javax.swing.JButton Registrarse;
    private javax.swing.JButton Salir;
    private javax.swing.JButton infoPartidas;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
