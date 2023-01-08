package partida;

import java.awt.Color;
import java.awt.Container;
import java.io.BufferedReader;

import javax.swing.JOptionPane;
import urjc.poo.lingo.Clases.AlmacenUsuarios;
import urjc.poo.lingo.Clases.Usuario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StreamTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import urjc.poo.lingo.Clases.Palabra;

public class ElegirLetrasPartidaNormal extends javax.swing.JFrame {

    private AlmacenUsuarios almacenUsuarios;
    Usuario usuario1;
    Usuario usuario2;
    Container cont = getContentPane();
    Palabra[] palabraCincoLetras;
    Palabra[] palabraSeisLetras;
    int contadorpalabraCincoLetras=0;
    int contadorpalabraSeisLetras=0;
    File fichero;

    public ElegirLetrasPartidaNormal(AlmacenUsuarios a, Usuario u1, Usuario u2) {
        almacenUsuarios = a;
        usuario1 = u1;
        usuario2 = u2;
        palabraCincoLetras = new Palabra[100];
        palabraSeisLetras = new Palabra[100];
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public ElegirLetrasPartidaNormal() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        seisLetras1 = new javax.swing.JButton();
        cincoLetras1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        cincoLetras1.setText("5 Letras");
        cincoLetras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoLetras1ActionPerformed(evt);
            }
        });

        jButton7.setText("Leer TXT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(seisLetras1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(114, 114, 114)
                            .addComponent(jButton7))))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(cincoLetras1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(186, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(seisLetras1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addComponent(cincoLetras1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(143, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    
    private void cincoLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoLetrasActionPerformed
        
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

        /*int numeroPalabrass = Integer.parseInt(numeroPalabras.getText());    
        
       
            if(numeroPalabrass>=1 && numeroPalabrass <=10){
                ElegirPalabra partida = new ElegirPalabra(almacenUsuarios,usuario1,usuario2,numeroPalabrass, 6);
                partida.setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "No has seleccionado un número de palabras correcta", "Numero palabras", JOptionPane.INFORMATION_MESSAGE);
                numeroPalabras.setBackground(Color.white);   
            }  */
        

        /*int numeroPalabrass = Integer.parseInt(numeroPalabras.getText());

        if (numeroPalabrass >= 1 && numeroPalabrass <= 10) {
            ElegirPalabra partida = new ElegirPalabra(almacenUsuarios, usuario1, usuario2, numeroPalabrass, 6);
            partida.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "No has seleccionado un número de palabras correcta", "Numero palabras", JOptionPane.INFORMATION_MESSAGE);
            numeroPalabras.setBackground(Color.white);
        }*/

    }//GEN-LAST:event_seisLetras1ActionPerformed

    private void cincoLetras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoLetras1ActionPerformed
            if(fichero!= null){
                JOptionPane.showMessageDialog(null, "Palabras de 5 letras seleccionadas del archivo txt correspondiente", "Archivo", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "No has seleccionado el archivo txt", "Archivo", JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_cincoLetras1ActionPerformed


    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        String no = "no";

        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.txt", "TXT");
        fc.setFileFilter(filtro);
        int seleccion = fc.showOpenDialog(cont);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            fichero = fc.getSelectedFile();
            String ruta = fichero.getAbsolutePath();
            try {
                StreamTokenizer st = new StreamTokenizer(new FileReader("" + ruta));
                while (st.nextToken() != StreamTokenizer.TT_EOF) {
                    if (st.ttype == StreamTokenizer.TT_WORD) {

                        if (!st.sval.equals(no)) {
             
                           /*
                            Error al comprobar la longitud del token, revisar
                            */ 
                            
                            if (st.sval.length() == 5) {
                                Palabra palabreja = new Palabra(st.sval);
                                palabraCincoLetras[contadorpalabraCincoLetras]=palabreja;
                                contadorpalabraCincoLetras+=1;                   
                                
                                        
                            } else {
                                Palabra palabreja = new Palabra(st.sval);
                                palabraSeisLetras[contadorpalabraSeisLetras]=palabreja;
                                contadorpalabraSeisLetras+=1;
                                
                            }
                                
                        }
                    }
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error archivo", "Archivo", JOptionPane.INFORMATION_MESSAGE);
            }

        }

    }//GEN-LAST:event_jButton7ActionPerformed

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
    private javax.swing.JButton cincoLetras1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton seisLetras1;
    // End of variables declaration//GEN-END:variables
}
