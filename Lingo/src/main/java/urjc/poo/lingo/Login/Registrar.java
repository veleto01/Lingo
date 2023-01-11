package urjc.poo.lingo.Login;

import urjc.poo.lingo.Clases.*;
import java.awt.Dialog;
import javax.swing.JOptionPane;

public class Registrar extends javax.swing.JDialog {

    private String nombre;
    private String contraseña;
    private AlmacenUsuarios aU;
    AlmacenPalabras aPa;
    AlmacenPartidas aP;
    Usuario t;

    public Registrar(AlmacenUsuarios a, Usuario uusu, AlmacenPartidas ap, AlmacenPalabras apa) {

        initComponents();
        aU = a;
        t = uusu;
        aP = ap;
        aPa = apa;
        this.setLocationRelativeTo(null);

    }

    public Registrar(Dialog parent, boolean modal) {
        super(parent, modal);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Tusuario = new javax.swing.JTextField();
        Tcontraseña = new javax.swing.JTextField();
        Registrarse = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Dar de alta");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña");

        Tusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TusuarioActionPerformed(evt);
            }
        });

        Tcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TcontraseñaActionPerformed(evt);
            }
        });

        Registrarse.setBackground(new java.awt.Color(255, 255, 255));
        Registrarse.setText("Registrarse");
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });

        Cancelar.setBackground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tcontraseña)
                                    .addComponent(Tusuario)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(Cancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(Registrarse)))))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Tusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Tcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Registrarse)
                    .addComponent(Cancelar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TusuarioActionPerformed


    }//GEN-LAST:event_TusuarioActionPerformed

    private void TcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TcontraseñaActionPerformed


    }//GEN-LAST:event_TcontraseñaActionPerformed

    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed

        String texto = Tcontraseña.getText();
        String texto2 = Tusuario.getText();

        Tcontraseña.setText(null);
        Tusuario.setText(null);

        if ("".equals(texto)) {

            System.out.println("Campo de contraseña no válido");

        } else {

            if ("".equals(texto2)) {

                System.out.println("Campo de usuario no válido");

            } else {

                contraseña = texto;
                nombre = texto2;

                Usuario usu = new Usuario(nombre, contraseña);

                if (aU.tamañoAlmacen() == 0) {

                    JOptionPane.showMessageDialog(null, "Usuario creado correctamente", "Usuario válido", JOptionPane.INFORMATION_MESSAGE);

                    aU.añadirUsuario(usu);

                } else {

                    boolean esta = false;

                    for (int i = 0; i < aU.tamañoAlmacen(); i++) {

                        if (nombre.equals((aU.getUsu(i).getNombre()))) {

                            esta = true;

                        }
                    }

                    if (esta) {

                        JOptionPane.showMessageDialog(null, "Usuario ya existente", "ERROR", JOptionPane.ERROR_MESSAGE);

                    } else {

                        JOptionPane.showMessageDialog(null, "Usuario creado correctamente", "Usuario válido", JOptionPane.INFORMATION_MESSAGE);
                        aU.añadirUsuario(usu);

                        Menu iden = new Menu(aP, aU, aPa, t);
                        iden.setVisible(true);
                        this.setVisible(false);
                    }

                }
            }
        }


    }//GEN-LAST:event_RegistrarseActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
       //AlmacenUsuarios a, Usuario uusu, AlmacenPartidas ap, AlmacenPalabras apa
       this.dispose();
       administrador a = new administrador(aU, t, aP, aPa);
       a.setVisible(true);
    }//GEN-LAST:event_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registrar dialog = new Registrar(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Registrarse;
    private javax.swing.JTextField Tcontraseña;
    private javax.swing.JTextField Tusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
