package partida;

import java.awt.Container;
import java.io.BufferedReader;
import javax.swing.JOptionPane;
import urjc.poo.lingo.Clases.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import urjc.poo.lingo.Clases.Palabra;
import urjc.poo.lingo.Login.Menu;

public class ElegirLetrasPartidaNormal extends javax.swing.JFrame {

    private AlmacenUsuarios almacenUsuarios;
    AlmacenPartidas almacenPartidas;
    AlmacenPalabras almacenPalabras;
    Usuario usuario1;
    Usuario usuario2;
    Palabra[] palabraCincoLetras;
    Palabra[] palabraSeisLetras;
    int numeroPalabras;
    int contadorpalabraCincoLetras;
    int contadorpalabraSeisLetras;
    int partidasCreadas;
    boolean primeraLetraOculta;

    public ElegirLetrasPartidaNormal(AlmacenPalabras pa, AlmacenPartidas p, AlmacenUsuarios a, Usuario u1, Usuario u2) {
        almacenUsuarios = a;
        almacenPartidas = p;
        almacenPalabras = pa;
        usuario1 = u1;
        usuario2 = u2;
        palabraCincoLetras = almacenPalabras.getPalabrasCincoLetras();
        palabraSeisLetras = almacenPalabras.getPalabrasSeisLetras();
        numeroPalabras = almacenPalabras.getNumeroPalabras();
        contadorpalabraCincoLetras = almacenPalabras.getContador5();
        contadorpalabraSeisLetras = almacenPalabras.getContador6();
        partidasCreadas = almacenPartidas.getPartidasCreadas();
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public ElegirLetrasPartidaNormal() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        seisLetras1 = new javax.swing.JButton();
        cincoLetras1 = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Elija el número de letras");
        jLabel2.setToolTipText("");

        seisLetras1.setBackground(new java.awt.Color(255, 255, 255));
        seisLetras1.setText("6 Letras");
        seisLetras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisLetras1ActionPerformed(evt);
            }
        });

        cincoLetras1.setBackground(new java.awt.Color(255, 255, 255));
        cincoLetras1.setText("5 Letras");
        cincoLetras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoLetras1ActionPerformed(evt);
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
                .addGap(61, 61, 61)
                .addComponent(cincoLetras1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(seisLetras1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cincoLetras1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seisLetras1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(Cancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cincoLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoLetrasActionPerformed
        //NO VALE
        /*int numeroPalabrass = Integer.parseInt(numeroPalabras.getText());    
        
        
            if(numeroPalabrass>=1 && numeroPalabrass <=10){
                ElegirPalabra partida = new ElegirPalabra(almacenUsuarios,usuario1,usuario2,numeroPalabrass, 5);
                partida.setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "No has seleccionado un número de palabras correcta", "Numero palabras", JOptionPane.INFORMATION_MESSAGE);
                 numeroPalabras.setBackground(Color.white);   
            }*/


    }//GEN-LAST:event_cincoLetrasActionPerformed


    private void seisLetras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisLetras1ActionPerformed

        JOptionPane.showMessageDialog(null, "A JUGAR", "", JOptionPane.INFORMATION_MESSAGE);
        Random r1 = new Random();
        int posicionAleatoria = r1.nextInt(contadorpalabraSeisLetras);
        //Creo arrayLocal de palabras
        Palabra[] local = new Palabra[numeroPalabras];
        //Lo lleno de palabras del fichero
        for (int i = 0; i < numeroPalabras; i++) {
            if (palabraSeisLetras[posicionAleatoria] == null) {
                posicionAleatoria = posicionAleatoria - 10;
            }
            local[i] = palabraSeisLetras[posicionAleatoria];
            posicionAleatoria += 1;
        }
        Partida nuevaPartida = new Partida(usuario1, usuario2, local);
        almacenPartidas.añadirPartida(nuevaPartida);
        partidasCreadas = partidasCreadas + 1;
        String aux = local[0].toString();
        primeraLetraOculta = almacenPalabras.getPrimeraLetraOculta().equals("no");
        //AlmacenUsuarios a, Usuario u1, Usuario u2, int numeroPalabras, String pala, Partida p, boolean pistaPalabra1, boolean pistaPalabra2, boolean usu1Jugando, int palaJugada
        partidaSeisLetras p1 = new partidaSeisLetras(almacenPalabras, almacenPartidas, almacenUsuarios, usuario1, usuario2, numeroPalabras - 1, aux, partidasCreadas - 1, true, true, true, 0, primeraLetraOculta);
        this.setVisible(false);
        p1.setVisible(true);


    }//GEN-LAST:event_seisLetras1ActionPerformed

    private void cincoLetras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoLetras1ActionPerformed

        JOptionPane.showMessageDialog(null, "A JUGAR", "", JOptionPane.INFORMATION_MESSAGE);
        Random r1 = new Random();
        int posicionAleatoria = r1.nextInt(contadorpalabraCincoLetras);
        //Creo arrayLocal de palabras
        Palabra[] local = new Palabra[numeroPalabras];
        for (int i = 0; i < numeroPalabras; i++) {
            if (palabraCincoLetras[posicionAleatoria] == null) {
                posicionAleatoria = posicionAleatoria - 10;
            }
            local[i] = palabraCincoLetras[posicionAleatoria];
            posicionAleatoria += 1;
        }
        Partida nuevaPartida = new Partida(usuario1, usuario2, local);
        almacenPartidas.añadirPartida(nuevaPartida);
        partidasCreadas = partidasCreadas + 1;
        String aux = local[0].toString();
        primeraLetraOculta = almacenPalabras.getPrimeraLetraOculta().equals("no");
        //AlmacenUsuarios a, Usuario u1, Usuario u2, int numeroPalabras, String pala, Partida p, boolean pistaPalabra1, boolean pistaPalabra2, boolean usu1Jugando, int palaJugada
        partidaCincoLetras p1 = new partidaCincoLetras(almacenPalabras, almacenPartidas, almacenUsuarios, usuario1, usuario2, numeroPalabras - 1, aux, partidasCreadas - 1, true, true, true, 0, primeraLetraOculta);
        this.setVisible(false);
        p1.setVisible(true);


    }//GEN-LAST:event_cincoLetras1ActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        //AlmacenPartidas p, AlmacenUsuarios a, AlmacenPalabras apa, Usuario u
        this.dispose();
        Menu nuevoMenu = new Menu(almacenPartidas, almacenUsuarios, almacenPalabras, usuario1);
        nuevoMenu.setVisible(true);
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
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton cincoLetras1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton seisLetras1;
    // End of variables declaration//GEN-END:variables
}
