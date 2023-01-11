package partida;

import java.util.Random;
import urjc.poo.lingo.Clases.*;
import urjc.poo.lingo.Login.Iniciar;


public class elegirLetrasEntrenamiento extends javax.swing.JFrame {
    
    AlmacenPalabras aPa;
    AlmacenUsuarios aU;
    AlmacenPartidas aP;
    int contadorPalabraCincoLetras;
    int contadorPalabraSeisLetras;
    
    
    public elegirLetrasEntrenamiento(AlmacenPalabras apa, AlmacenUsuarios u, AlmacenPartidas a) {
        initComponents();
        aPa = apa;
        aU = u;
        aP = a;
        contadorPalabraCincoLetras = aPa.getContador5();
        contadorPalabraSeisLetras = aPa.getContador6();
        this.setLocationRelativeTo(null);
    }
    
    public elegirLetrasEntrenamiento() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cincoLetras = new javax.swing.JButton();
        seisLetras1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cincoLetras.setText("5 Letras");
        cincoLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoLetrasActionPerformed(evt);
            }
        });

        seisLetras1.setText("6 Letras");
        seisLetras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisLetras1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Elija el número de letras para jugar");
        jLabel2.setToolTipText("");

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
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(cincoLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(seisLetras1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(cincoLetras, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(seisLetras1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(40, 40, 40)
                .addComponent(Cancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cincoLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoLetrasActionPerformed
        
        Random r1 = new Random();
        int posicionAleatoria = r1.nextInt(contadorPalabraCincoLetras);
        Palabra[] palabrasCinco = aPa.getPalabrasCincoLetras();
        String aux = palabrasCinco[posicionAleatoria].toString();
        Entrenamiento e = new Entrenamiento();
        partidaCincoLetras partida = new partidaCincoLetras(aP, aU, aPa, e, aux, true);
        partida.setVisible(true);
        this.dispose();
        

    }//GEN-LAST:event_cincoLetrasActionPerformed

    private void seisLetras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisLetras1ActionPerformed
        
        Random r1 = new Random();
        int posicionAleatoria = r1.nextInt(contadorPalabraSeisLetras);
        Palabra[] palabrasSeis = aPa.getPalabrasSeisLetras();
        String aux = palabrasSeis[posicionAleatoria].toString();
        Entrenamiento e = new Entrenamiento();
        partidaSeisLetras partida = new partidaSeisLetras(aP, aU, aPa, e, aux, true);
        partida.setVisible(true);
        this.dispose();
       

    }//GEN-LAST:event_seisLetras1ActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
       this.dispose();
       Iniciar i = new Iniciar(aP, aU, aPa, true);
       i.setVisible(true);
    }//GEN-LAST:event_CancelarActionPerformed

   
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
            java.util.logging.Logger.getLogger(elegirLetrasEntrenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(elegirLetrasEntrenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(elegirLetrasEntrenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(elegirLetrasEntrenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new elegirLetrasEntrenamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton cincoLetras;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton seisLetras1;
    // End of variables declaration//GEN-END:variables
}
