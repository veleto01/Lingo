package urjc.poo.lingo.Login;

import urjc.poo.lingo.Clases.AlmacenPalabras;
import urjc.poo.lingo.Clases.AlmacenPartidas;
import urjc.poo.lingo.Clases.AlmacenPartidasJugadasDosUsuarios;
import urjc.poo.lingo.Clases.AlmacenUsuarios;
import urjc.poo.lingo.Clases.Partida;
import urjc.poo.lingo.Clases.Usuario;

public class perfilOtroJugador extends javax.swing.JFrame {

    Usuario usuario1 = new Usuario();
    Usuario usuario2 = new Usuario();
    Usuario usuarioAux = new Usuario();
    AlmacenUsuarios aU;
    AlmacenPartidas aP;
    AlmacenPalabras aPa;
    AlmacenPartidasJugadasDosUsuarios aPD;
    Partida p;
    String[] nombres;
    String[] nombrePartidas;
    String NombreUsuarioMain;
    int index;
    int tamañoAlmacen;
    int tamañoAlmacen2;
    String Partida = "Partida ";

    public perfilOtroJugador() {

    }

    public perfilOtroJugador(AlmacenUsuarios a, Usuario u, AlmacenPartidas app, AlmacenPalabras p) {
        initComponents();
        this.setLocationRelativeTo(null);
        aU = a;
        usuario1 = u;
        aP = app;
        aPa = p;
        aPD = new AlmacenPartidasJugadasDosUsuarios();
        tamañoAlmacen = aU.tamañoAlmacen();
        tamañoAlmacen2 = aPD.tamañoAlmacen();
        nombres = new String[tamañoAlmacen];
        nombrePartidas = new String[tamañoAlmacen2];

        for (int i = 0; i < tamañoAlmacen; i++) {
            nombres[i] = aU.getUsu(i).getNombre();
            NombreUsuarioMain = usuario1.getNombre();
            if (nombres[i] != NombreUsuarioMain) {
                elegirJugador.addItem(nombres[i]);
            }
        }
    }

    public void buscarPartida(Usuario u1, Usuario u2) {

        for (int i = 0; i < tamañoAlmacen; i++) {

            p = aP.getPartida(i);
            usuario1 = p.getUsuario1();
            usuario2 = p.getUsuario2();

            if (usuario1.equals(u1) && usuario2.equals(u2)) {
                aPD.añadirPartida(p);
            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        elegirJugador = new javax.swing.JComboBox<>();
        consola = new javax.swing.JTextField();
        numeroPartidas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        elegirJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elegirJugadorActionPerformed(evt);
            }
        });

        numeroPartidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroPartidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(elegirJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numeroPartidas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addComponent(consola, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elegirJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroPartidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119)
                .addComponent(consola, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void elegirJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elegirJugadorActionPerformed
        int indexNombre = elegirJugador.getSelectedIndex();
        String NombreSelecciado = elegirJugador.getItemAt(indexNombre);

        if (NombreUsuarioMain != NombreSelecciado) {
            usuarioAux = aU.getUsu(indexNombre);
            buscarPartida(usuario1, usuario2);
        }
       
        for (int i = 0; i < tamañoAlmacen2; i++) {
            nombrePartidas[i] = Partida + 1;
            numeroPartidas.addItem(nombrePartidas[i]);
        }


    }//GEN-LAST:event_elegirJugadorActionPerformed

    private void numeroPartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroPartidasActionPerformed

    }//GEN-LAST:event_numeroPartidasActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(perfilOtroJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(perfilOtroJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(perfilOtroJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(perfilOtroJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new perfilOtroJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField consola;
    private javax.swing.JComboBox<String> elegirJugador;
    private javax.swing.JComboBox<String> numeroPartidas;
    // End of variables declaration//GEN-END:variables
}
