
package urjc.poo.lingo.Login;

import java.awt.Container;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import partida.elegirLetrasEntrenamiento;
import urjc.poo.lingo.Login.Registrar;
import urjc.poo.lingo.Login.Identificar;
import urjc.poo.lingo.Clases.AlmacenPartidas;
import urjc.poo.lingo.Clases.AlmacenUsuarios;
import urjc.poo.lingo.Clases.AlmacenPalabras;
import urjc.poo.lingo.Clases.Palabra;
import urjc.poo.lingo.Clases.Usuario;




public class Iniciar extends javax.swing.JDialog{
    
    AlmacenPartidas almacenPartidas;
    AlmacenUsuarios almacenUsuarios;
    AlmacenPalabras almacenPalabras;
    Container cont = getContentPane();
    Palabra[] palabraCincoLetras;
    Palabra[] palabraSeisLetras;
    int numeroPalabras;
    int contadorpalabraCincoLetras;
    int contadorpalabraSeisLetras;
    boolean activado;
    File fichero;
    
    public Iniciar(AlmacenPartidas p, AlmacenUsuarios u, AlmacenPalabras apa, boolean act) {
        
        initComponents();
        almacenPartidas = p;
        almacenUsuarios = u;
        almacenPalabras = apa;
        palabraCincoLetras = new Palabra[100];
        palabraSeisLetras = new Palabra[100];
        numeroPalabras = 0;
        contadorpalabraCincoLetras = 0;
        contadorpalabraSeisLetras = 0;
        activado = act;
        if(activado){
            Entrenamiento.setEnabled(true);
            Identificate.setEnabled(true);
            LeerFichero.setEnabled(false);
        }
        this.setLocationRelativeTo(null);       
    }
    
    public Iniciar() {
        
        initComponents();
        this.setLocationRelativeTo(null);       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Identificate = new javax.swing.JButton();
        Entrenamiento = new javax.swing.JButton();
        LeerFichero = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LINGO");
        setBackground(new java.awt.Color(255, 255, 255));

        Identificate.setBackground(new java.awt.Color(255, 255, 255));
        Identificate.setText("Identifícate");
        Identificate.setEnabled(false);
        Identificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdentificateActionPerformed(evt);
            }
        });

        Entrenamiento.setBackground(new java.awt.Color(255, 255, 255));
        Entrenamiento.setText("Entrenamiento");
        Entrenamiento.setEnabled(false);
        Entrenamiento.setMaximumSize(new java.awt.Dimension(93, 25));
        Entrenamiento.setMinimumSize(new java.awt.Dimension(93, 25));
        Entrenamiento.setPreferredSize(new java.awt.Dimension(93, 25));
        Entrenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrenamientoActionPerformed(evt);
            }
        });

        LeerFichero.setBackground(new java.awt.Color(255, 255, 255));
        LeerFichero.setText("Leer TXT");
        LeerFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerFicheroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        jLabel2.setText("LINGO");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carge el fichero antes de entrar al juego por favor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(Identificate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(Entrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(LeerFichero)))
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Identificate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Entrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LeerFichero, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IdentificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdentificateActionPerformed

        Identificar iden = new Identificar(new javax.swing.JDialog(),true, almacenPartidas, almacenUsuarios, almacenPalabras);
        this.dispose();
        iden.setVisible(true);
        
        

    }//GEN-LAST:event_IdentificateActionPerformed

    private void EntrenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrenamientoActionPerformed
        elegirLetrasEntrenamiento e = new elegirLetrasEntrenamiento(almacenPalabras, almacenUsuarios, almacenPartidas);
        this.dispose();
        e.setVisible(true);
    }//GEN-LAST:event_EntrenamientoActionPerformed

    private void LeerFicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerFicheroActionPerformed

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
                                palabraCincoLetras[contadorpalabraCincoLetras] = palabreja;
                                contadorpalabraCincoLetras += 1;

                            } else {
                                Palabra palabreja = new Palabra(st.sval);
                                palabraSeisLetras[contadorpalabraSeisLetras] = palabreja;
                                contadorpalabraSeisLetras += 1;

                            }

                        }
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error archivo", "Archivo", JOptionPane.INFORMATION_MESSAGE);
            }

        }try {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String line;
                line = br.readLine();
                String[] parts = line.split(" ");
                String part2 = parts[1];
                numeroPalabras = Integer.parseInt(part2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        almacenPalabras.setNumeroPalabras(numeroPalabras);
        almacenPalabras.setPalabrasCincoLetras(palabraCincoLetras);
        almacenPalabras.setPalabrasSeisLetras(palabraSeisLetras);
        almacenPalabras.setContador(contadorpalabraCincoLetras, contadorpalabraSeisLetras);
        activado = true;
        Entrenamiento.setEnabled(true);
        Identificate.setEnabled(true);
        LeerFichero.setEnabled(false);
    }//GEN-LAST:event_LeerFicheroActionPerformed

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
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Iniciar dialog = new Iniciar();
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
    private javax.swing.JButton Entrenamiento;
    private javax.swing.JButton Identificate;
    private javax.swing.JButton LeerFichero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
