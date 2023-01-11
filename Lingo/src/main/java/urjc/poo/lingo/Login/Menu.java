package urjc.poo.lingo.Login;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import urjc.poo.lingo.Clases.*;
import urjc.poo.lingo.Clases.AlmacenUsuarios;
import partida.Modo;

public class Menu extends javax.swing.JFrame {

    AlmacenPartidas aP;
    AlmacenUsuarios aU;
    AlmacenPalabras aPa;
    Usuario usu;
    boolean adminBool;
    private FileOutputStream file;
    private ObjectOutputStream output;
    UsuariosOutput usuarioEscribir;
    PartidasOutout partidasEscribir;

    public Menu(AlmacenPartidas p, AlmacenUsuarios a, AlmacenPalabras apa, Usuario u) {

        initComponents();
        aP = p;
        aU = a;
        aPa = apa;
        usu = u;
        usuarioEscribir = new UsuariosOutput();
        partidasEscribir = new PartidasOutout();
        this.setTitle("Usuario activo: " + usu.getNombre());

        this.setLocationRelativeTo(null);
    }

    public Menu() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Jugar = new javax.swing.JButton();
        Admin = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Perfil = new javax.swing.JButton();
        Perfil1 = new javax.swing.JButton();
        guardarUsuarios = new javax.swing.JButton();
        guardarPartidas = new javax.swing.JButton();
        ranking = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        jLabel1.setText("MENU");

        Jugar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Jugar.setText("Jugar");
        Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarActionPerformed(evt);
            }
        });

        Admin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Admin.setText("Modo Administrador");
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Perfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Perfil.setText("Perfil");
        Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfilActionPerformed(evt);
            }
        });

        Perfil1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Perfil1.setText("Estadísticas vs otro jugador");
        Perfil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Perfil1ActionPerformed(evt);
            }
        });

        guardarUsuarios.setText("Guardar usuarios");
        guardarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarUsuariosActionPerformed(evt);
            }
        });

        guardarPartidas.setText("Guardar partidas");
        guardarPartidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarPartidasActionPerformed(evt);
            }
        });

        ranking.setText("Rankings");
        ranking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Salir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(guardarUsuarios, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardarPartidas))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Admin)
                            .addComponent(Perfil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ranking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Salir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(guardarUsuarios)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Jugar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(guardarPartidas)))
                .addGap(18, 18, 18)
                .addComponent(Admin)
                .addGap(18, 18, 18)
                .addComponent(Perfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(ranking)
                .addGap(18, 18, 18)
                .addComponent(Perfil1)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarActionPerformed

        Modo u = new Modo(new javax.swing.JFrame(), true, aP, aU, aPa, usu);
        u.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_JugarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed

        this.dispose();
        Iniciar i = new Iniciar(aP, aU, aPa, true);
        i.setVisible(true);
    }//GEN-LAST:event_SalirActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed

        if (usu.isAdmin()) {
            administrador admin = new administrador(aU, usu, aP, aPa);
            admin.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Este usuario no es Administrador", "Usuario no válido", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_AdminActionPerformed


    private void PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfilActionPerformed
        perrfilJugador perfil = new perrfilJugador(aPa, aP, aU, usu);

        perfil.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_PerfilActionPerformed

    private void Perfil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Perfil1ActionPerformed
        perfilOtroJugador estadisticas = new perfilOtroJugador(aU, usu, aP, aPa);
        estadisticas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Perfil1ActionPerformed

    private void guardarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarUsuariosActionPerformed
        try {
            usuarioEscribir.eliminar();
            usuarioEscribir.abrir();
            usuarioEscribir.escribirUsuario(aU);
            usuarioEscribir.cerrar();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_guardarUsuariosActionPerformed


    private void guardarPartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarPartidasActionPerformed
        try {
           partidasEscribir.eliminar();
            partidasEscribir.abrir();
            partidasEscribir.escribirUsuario(aP);
            partidasEscribir.cerrar();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_guardarPartidasActionPerformed

    private void rankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingActionPerformed
       Rankings Ranking = new Rankings(aU,aPa,aP, true, usu);
        
        this.dispose();
        Ranking.setVisible(true);
    }//GEN-LAST:event_rankingActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin;
    private javax.swing.JButton Jugar;
    private javax.swing.JButton Perfil;
    private javax.swing.JButton Perfil1;
    private javax.swing.JButton Salir;
    private javax.swing.JButton guardarPartidas;
    private javax.swing.JButton guardarUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton ranking;
    // End of variables declaration//GEN-END:variables
}
