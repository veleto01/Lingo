
package partida;

import java.awt.Color;
import javax.swing.JOptionPane;
import urjc.poo.lingo.Clases.AlmacenUsuarios;
import urjc.poo.lingo.Clases.Usuario;


public class ElegirLetrasPartidaNormal extends javax.swing.JFrame {

    private AlmacenUsuarios almacenUsuarios;
    Usuario usuario1;
    Usuario usuario2;
    
    
    
    
    public ElegirLetrasPartidaNormal(AlmacenUsuarios a, Usuario u1,Usuario u2) {
        almacenUsuarios = a;
        usuario1 = u1;
        usuario2 = u2;
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
     
    public ElegirLetrasPartidaNormal(){
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cincoLetras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        seisLetras1 = new javax.swing.JButton();
        numeroPalabras = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cincoLetras.setText("5 Letras");
        cincoLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoLetrasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Número de palabras de 1 a 10");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Elija el número de letras");
        jLabel2.setToolTipText("");

        seisLetras1.setText("6 Letras");
        seisLetras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisLetras1ActionPerformed(evt);
            }
        });

        numeroPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroPalabrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cincoLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(seisLetras1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(numeroPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cincoLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seisLetras1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    private void cincoLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoLetrasActionPerformed
        
        int numeroPalabrass = Integer.parseInt(numeroPalabras.getText());    
        
        
            if(numeroPalabrass>=1 && numeroPalabrass <=10){
                ElegirPalabra partida = new ElegirPalabra(almacenUsuarios,usuario1,usuario2,numeroPalabrass, 5);
                partida.setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "No has seleccionado un número de palabras correcta", "Numero palabras", JOptionPane.INFORMATION_MESSAGE);
                 numeroPalabras.setBackground(Color.white);   
            }
         
        
    }//GEN-LAST:event_cincoLetrasActionPerformed

    
    
    
    
    
    
    
    
    private void seisLetras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisLetras1ActionPerformed
        int numeroPalabrass = Integer.parseInt(numeroPalabras.getText());    
        
       
            if(numeroPalabrass>=1 && numeroPalabrass <=10){
                ElegirPalabra partida = new ElegirPalabra(almacenUsuarios,usuario1,usuario2,numeroPalabrass, 6);
                partida.setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "No has seleccionado un número de palabras correcta", "Numero palabras", JOptionPane.INFORMATION_MESSAGE);
                numeroPalabras.setBackground(Color.white);   
            }  
        
    }//GEN-LAST:event_seisLetras1ActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void numeroPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroPalabrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroPalabrasActionPerformed

   
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
            java.util.logging.Logger.getLogger(ElegirLetrasPartidaNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElegirLetrasPartidaNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElegirLetrasPartidaNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElegirLetrasPartidaNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElegirLetrasPartidaNormal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cincoLetras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField numeroPalabras;
    private javax.swing.JButton seisLetras1;
    // End of variables declaration//GEN-END:variables
}
