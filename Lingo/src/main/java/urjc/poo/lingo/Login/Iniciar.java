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
import urjc.poo.lingo.Login.Identificar;
import urjc.poo.lingo.Clases.AlmacenPartidas;
import urjc.poo.lingo.Clases.AlmacenUsuarios;
import urjc.poo.lingo.Clases.AlmacenPalabras;
import urjc.poo.lingo.Clases.Palabra;
import urjc.poo.lingo.Clases.Partida;

import urjc.poo.lingo.Clases.Usuario;

import urjc.poo.lingo.Clases.gestorFichero;

public class Iniciar extends javax.swing.JDialog {

    private AlmacenPartidas almacenPartidas;
    private AlmacenUsuarios almacenUsuarios;
    private AlmacenPalabras almacenPalabras;


    Container cont = getContentPane();
    Palabra[] palabraCincoLetras;
    Palabra[] palabraSeisLetras;
    int numeroPalabras;
    int contadorpalabraCincoLetras;
    int contadorpalabraSeisLetras;
    boolean activado;
    String primeraLetraOculta;
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
        if (activado) {
            Entrenamiento.setEnabled(true);
            Identificate.setEnabled(true);
            cargarAlmacenes.setEnabled(false);
        }
        this.setLocationRelativeTo(null);
    }

    public Iniciar(boolean act) {
        almacenUsuarios = new AlmacenUsuarios();
        almacenPartidas = new AlmacenPartidas();
        almacenPalabras= new AlmacenPalabras();
        initComponents();
          palabraCincoLetras = new Palabra[100];
        palabraSeisLetras = new Palabra[100];
        numeroPalabras = 0;
        contadorpalabraCincoLetras = 0;
        contadorpalabraSeisLetras = 0;
        activado = act;
        if (activado) {
            Entrenamiento.setEnabled(true);
            Identificate.setEnabled(true);
            cargarAlmacenes.setEnabled(false);
        }
        this.setLocationRelativeTo(null);
    }
    
    
    public Iniciar(){}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeerFichero2 = new javax.swing.JButton();
        Identificate = new javax.swing.JButton();
        Entrenamiento = new javax.swing.JButton();
        cargarAlmacenes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        LeerFichero2.setText("Cargar usuarios");
        LeerFichero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerFichero2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LINGO");
        setBackground(new java.awt.Color(255, 255, 255));

        Identificate.setText("Identifícate");
        Identificate.setEnabled(false);
        Identificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdentificateActionPerformed(evt);
            }
        });

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

        cargarAlmacenes.setText("Leer TXT");
        cargarAlmacenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarAlmacenesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        jLabel2.setText("LINGO");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carge el fichero antes de entrar al juego por favor");

        jButton1.setText("Usuarios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cargar partidas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Entrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Identificate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(519, Short.MAX_VALUE)
                        .addComponent(cargarAlmacenes, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Identificate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(Entrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargarAlmacenes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IdentificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdentificateActionPerformed

        Identificar iden = new Identificar(new javax.swing.JDialog(), true, almacenPartidas, almacenUsuarios, almacenPalabras);
        this.dispose();
        iden.setVisible(true);


    }//GEN-LAST:event_IdentificateActionPerformed

    private void EntrenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrenamientoActionPerformed
        elegirLetrasEntrenamiento e = new elegirLetrasEntrenamiento(almacenPalabras, almacenUsuarios, almacenPartidas);
        this.dispose();
        e.setVisible(true);
    }//GEN-LAST:event_EntrenamientoActionPerformed

    private void cargarAlmacenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarAlmacenesActionPerformed

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

        }
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String line;
                line = br.readLine();
                String[] parts = line.split(" ");
                String part2 = parts[1];
                primeraLetraOculta = parts[2];
                numeroPalabras = Integer.parseInt(part2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        almacenPalabras.setNumeroPalabras(numeroPalabras);
        almacenPalabras.setPalabrasCincoLetras(palabraCincoLetras);
        almacenPalabras.setPalabrasSeisLetras(palabraSeisLetras);
        almacenPalabras.setContador(contadorpalabraCincoLetras, contadorpalabraSeisLetras);
        almacenPalabras.setPrimeraLetra(primeraLetraOculta);
        activado = true;
        Entrenamiento.setEnabled(true);
        Identificate.setEnabled(true);
        cargarAlmacenes.setEnabled(false);
    }//GEN-LAST:event_cargarAlmacenesActionPerformed

    private void LeerFichero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerFichero2ActionPerformed

    }//GEN-LAST:event_LeerFichero2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           
        
        gestorFichero<AlmacenUsuarios> gestorJugadores = new gestorFichero(jTextField1.getText());
        gestorJugadores.obtenerDatos();
        
        AlmacenUsuarios almAux = new AlmacenUsuarios();
        almAux = gestorJugadores.getDatos().get(0);

        for (int i = 0; i <= almAux.getArraylist().size()-1; i++) {
            System.out.println("Se va a cargar el jugador en la lista "+i);
            almacenUsuarios.añadirUsuario(almAux.getArraylist().get(i));
            System.out.println("El jugador en la lista i cargado es: "+almacenUsuarios.getUsu(i).getNombre());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        gestorFichero<AlmacenPartidas> gestorPartidas = new gestorFichero(jTextField1.getText());
        gestorPartidas.obtenerDatos();
        
        AlmacenPartidas almAux = new AlmacenPartidas();
        almAux = gestorPartidas.getDatos().get(0);

        for (int i = 0; i <= almAux.getArraylist().size()-1; i++) {
            almacenPartidas.añadirPartida(almAux.getArraylist().get(i));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton LeerFichero2;
    private javax.swing.JButton cargarAlmacenes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}