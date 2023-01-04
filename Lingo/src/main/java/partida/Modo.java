
package partida;

import urjc.poo.lingo.Clases.Usuario;
import urjc.poo.lingo.Clases.AlmacenUsuarios;
import javax.swing.JOptionPane;


public class Modo extends javax.swing.JDialog {

    AlmacenUsuarios aU;
    Usuario usuario1;
    
    public Modo(java.awt.Frame parent, boolean modal, AlmacenUsuarios a, Usuario u) {
        super(parent, modal);
        aU = a;
        usuario1 = u;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Modo(java.awt.Frame parent, boolean modal) {
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Contraotro = new javax.swing.JButton();
        Entrenamiento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel1.setText("ELIJA EL MODO");

        Contraotro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Contraotro.setText("1 vs 1 contra otro jugador");
        Contraotro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraotroActionPerformed(evt);
            }
        });

        Entrenamiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Entrenamiento.setText("Entrenamiento");
        Entrenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrenamientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Contraotro)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Entrenamiento)
                        .addGap(118, 118, 118))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Contraotro)
                .addGap(18, 18, 18)
                .addComponent(Entrenamiento)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContraotroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraotroActionPerformed
        
        JOptionPane.showMessageDialog(null, "Inicie sesión con el segundo jugador", "Introducir segundo jugador", JOptionPane.INFORMATION_MESSAGE);
        LoginSegundoJugador iden = new LoginSegundoJugador(new javax.swing.JDialog(),true, aU, usuario1);
        this.setVisible(false);
        iden.setVisible(true);
        
    }//GEN-LAST:event_ContraotroActionPerformed

    private void EntrenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrenamientoActionPerformed
        elegirLetrasEntrenamiento entrenamiento = new elegirLetrasEntrenamiento();
        this.setVisible(false);
        entrenamiento.setVisible(true);
    }//GEN-LAST:event_EntrenamientoActionPerformed

  
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
            java.util.logging.Logger.getLogger(Modo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modo dialog = new Modo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton Contraotro;
    private javax.swing.JButton Entrenamiento;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
