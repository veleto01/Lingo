package urjc.poo.lingo.Login;

import urjc.poo.lingo.Clases.*;
import java.util.*;

public class Rankings extends javax.swing.JFrame {

    private AlmacenUsuarios almacenUsuarios;
    AlmacenPartidas almacenPartidas;
    AlmacenPalabras almacenPalabras;
    Usuario usuario;
    TreeSet<Usuario> rankingPorAlfabetico;
    ArrayList<Usuario> rankingPorGanadas;
    ComparatorRankingV comparaGanadas;
    String text;
    Boolean esRankingGanadas;

    public Rankings(AlmacenUsuarios aU, AlmacenPalabras aPa, AlmacenPartidas aP, boolean esRankingG, Usuario usu) {
        initComponents();
        almacenUsuarios = aU;
        almacenPartidas = aP;
        almacenPalabras = aPa;
        usuario = usu;
        text = "";
        esRankingGanadas = esRankingG;
        comparaGanadas = new ComparatorRankingV();
        rankingPorAlfabetico = new TreeSet(almacenUsuarios.getArraylist());
        rankingPorGanadas = almacenUsuarios.getArraylist();
        rankingText.setEditable(false);
        Collections.sort(rankingPorGanadas, comparaGanadas);
        if (esRankingGanadas) {
            
            for (Usuario u : rankingPorGanadas) {
                text = text + u.getNombre() + "\n\t" + u.getGanadas() + " ganadas\n\t" + u.getEmpatadas() + " empatadas\n\t" + u.getPerdidas() + " perdidas\n\t" + u.getPuntos() + " puntos\n";
            }
            rankingText.append(text);
        }

        this.setLocationRelativeTo(null);

    }

    public Rankings() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        rankingVictorias = new javax.swing.JButton();
        rankingAlfabetico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rankingText = new javax.swing.JTextArea();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RANKINGS");

        rankingVictorias.setBackground(new java.awt.Color(255, 255, 255));
        rankingVictorias.setText("RANKING POR VICTORIAS");
        rankingVictorias.setMaximumSize(new java.awt.Dimension(155, 25));
        rankingVictorias.setMinimumSize(new java.awt.Dimension(155, 25));
        rankingVictorias.setPreferredSize(new java.awt.Dimension(155, 25));
        rankingVictorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingVictoriasActionPerformed(evt);
            }
        });

        rankingAlfabetico.setBackground(new java.awt.Color(255, 255, 255));
        rankingAlfabetico.setText("RANKING ALFABÉTICO");
        rankingAlfabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingAlfabeticoActionPerformed(evt);
            }
        });

        rankingText.setColumns(20);
        rankingText.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        rankingText.setRows(5);
        jScrollPane1.setViewportView(rankingText);

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rankingVictorias, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rankingAlfabetico, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salir)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rankingVictorias, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rankingAlfabetico, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rankingVictoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingVictoriasActionPerformed
        rankingText.setText("");
        String ranking = "";
        for (Usuario u : rankingPorGanadas) {
            ranking = ranking + u.getNombre() + "\n\t" + u.getGanadas() + " ganadas\n\t" + u.getEmpatadas() + " empatadas\n\t" + u.getPerdidas() + " perdidas\n\t" + u.getPuntos() + " puntos\n";
        }
        rankingText.append(ranking);

    }//GEN-LAST:event_rankingVictoriasActionPerformed

    private void rankingAlfabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingAlfabeticoActionPerformed
        rankingText.setText("");
        String ranking = "";
        for (Usuario u : rankingPorAlfabetico) {
            ranking = ranking + u.getNombre() + "\n\t" + u.getGanadas() + " ganadas\n\t" + u.getEmpatadas() + " empatadas\n\t" + u.getPerdidas() + " perdidas\n\t" + u.getPuntos() + " puntos\n";
        }
        rankingText.append(ranking);
    }//GEN-LAST:event_rankingAlfabeticoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
        //AlmacenPartidas p, AlmacenUsuarios a, AlmacenPalabras apa, Usuario u
        Menu m = new Menu(almacenPartidas, almacenUsuarios, almacenPalabras, usuario);
        m.setVisible(true);

    }//GEN-LAST:event_salirActionPerformed

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
            java.util.logging.Logger.getLogger(Rankings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rankings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rankings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rankings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rankings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rankingAlfabetico;
    private javax.swing.JTextArea rankingText;
    private javax.swing.JButton rankingVictorias;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
