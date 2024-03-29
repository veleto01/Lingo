package partida;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.Arrays;
import urjc.poo.lingo.Clases.*;
import urjc.poo.lingo.Login.*;
import java.util.*;
import javax.swing.JTextField;
import java.util.Random;
import javax.swing.JOptionPane;

public class partidaCincoLetras extends javax.swing.JFrame {

    private AlmacenUsuarios almacenUsuarios;
    AlmacenPartidas almacenPartidas;
    AlmacenPalabras almacenPalabras;
    Usuario usuario1;
    Usuario usuario2;
    int palabras;
    int contadorFila;
    int contadorEnabled;
    int contadorFila2;
    int palabraJugada;
    int index;
    List<String> palabra;
    JTextField[] gridLetras;
    boolean pistaPalabraNoUsada1;
    boolean pistaPalabraNoUsada2;
    boolean pistaLetraNoUsada1;
    boolean pistaLetraNoUsada2;
    boolean usuario1Jugando;
    boolean esEntrenamiento;
    boolean pistaPalabraNoUsadaEntrenamiento;
    boolean primeraLetraOculta;
    Partida partidaJugando;
    Entrenamiento entrenamiento;

    public partidaCincoLetras(AlmacenPalabras pa, AlmacenPartidas p, AlmacenUsuarios a, Usuario u1, Usuario u2, int numeroPalabras, String pala, int contadorPartida, boolean pistaPalabra1, boolean pistaPalabra2, boolean usu1Jugando, int palaJugada, boolean pLetraOculta) {
        initComponents();
        gridLetras = new JTextField[25];
        almacenUsuarios = a;
        almacenPartidas = p;
        almacenPalabras = pa;
        usuario1 = u1;
        usuario2 = u2;
        palabras = numeroPalabras;
        palabra = Arrays.asList(pala.split(""));
        contadorFila = 0;
        contadorEnabled = 5;
        contadorFila2 = 0;
        index = contadorPartida;
        palabraJugada = palaJugada;
        pistaPalabraNoUsada1 = pistaPalabra1;
        pistaPalabraNoUsada2 = pistaPalabra2;
        primeraLetraOculta = pLetraOculta;
        pistaLetraNoUsada1 = true;
        pistaLetraNoUsada2 = true;
        partidaJugando = almacenPartidas.getPartida(contadorPartida);
        usuario1Jugando = usu1Jugando;
        esEntrenamiento = false;
        gridLetras[0] = letra11;//0
        gridLetras[1] = letra12;
        gridLetras[2] = letra13;
        gridLetras[3] = letra14;
        gridLetras[4] = letra15;
        gridLetras[5] = letra21;//5
        gridLetras[6] = letra22;
        gridLetras[7] = letra23;
        gridLetras[8] = letra24;
        gridLetras[9] = letra25;
        gridLetras[10] = letra31;//10
        gridLetras[11] = letra32;
        gridLetras[12] = letra33;
        gridLetras[13] = letra34;
        gridLetras[14] = letra35;
        gridLetras[15] = letra41;//15
        gridLetras[16] = letra42;
        gridLetras[17] = letra43;
        gridLetras[18] = letra44;
        gridLetras[19] = letra45;
        gridLetras[20] = letra51;//20
        gridLetras[21] = letra52;
        gridLetras[22] = letra53;
        gridLetras[23] = letra54;
        gridLetras[24] = letra55;
        if (!pistaPalabraNoUsada1 && usuario1Jugando) {
            this.pistaPalabra.setEnabled(false);
        }
        if (!pistaPalabraNoUsada2 && !usuario1Jugando) {
            this.pistaPalabra.setEnabled(false);
        }
        if (usuario1Jugando) {
            this.setTitle(u1.getNombre());
        } else {
            this.setTitle(u2.getNombre());
        }
        if (!esEntrenamiento) {
            Terminar.show(false);
        }
        if(!primeraLetraOculta && contadorFila < 5) gridLetras[0].setText(palabra.get(0).toUpperCase());
        jugador1.setText(usuario1.getNombre());
        jugador2.setText(usuario2.getNombre());
        marcadorJugador1.setText(Integer.toString(partidaJugando.getMarcador1()));
        marcadorJugador2.setText(Integer.toString(partidaJugando.getMarcador2()));
        marcadorJugador1.setEditable(false);
        marcadorJugador2.setEditable(false);
        this.setLocationRelativeTo(null);

    }

    public partidaCincoLetras(AlmacenPartidas p, AlmacenUsuarios u, AlmacenPalabras pa, Entrenamiento e, String pala, boolean pistaPalabra, boolean pLetraOculta) {
        initComponents();
        gridLetras = new JTextField[25];
        palabra = Arrays.asList(pala.split(""));
        entrenamiento = e;
        almacenPalabras = pa;
        almacenUsuarios = u;
        almacenPartidas = p;
        pistaPalabraNoUsadaEntrenamiento = pistaPalabra;
        primeraLetraOculta = pLetraOculta;
        esEntrenamiento = true;
        contadorFila = 0;
        contadorEnabled = 5;
        contadorFila2 = 0;
        gridLetras[0] = letra11;//0
        gridLetras[1] = letra12;
        gridLetras[2] = letra13;
        gridLetras[3] = letra14;
        gridLetras[4] = letra15;
        gridLetras[5] = letra21;//5
        gridLetras[6] = letra22;
        gridLetras[7] = letra23;
        gridLetras[8] = letra24;
        gridLetras[9] = letra25;
        gridLetras[10] = letra31;//10
        gridLetras[11] = letra32;
        gridLetras[12] = letra33;
        gridLetras[13] = letra34;
        gridLetras[14] = letra35;
        gridLetras[15] = letra41;//15
        gridLetras[16] = letra42;
        gridLetras[17] = letra43;
        gridLetras[18] = letra44;
        gridLetras[19] = letra45;
        gridLetras[20] = letra51;//20
        gridLetras[21] = letra52;
        gridLetras[22] = letra53;
        gridLetras[23] = letra54;
        gridLetras[24] = letra55;

        if (!pistaPalabraNoUsadaEntrenamiento) {
            this.pistaPalabra.setEnabled(false);
        }
        if(!primeraLetraOculta && contadorFila < 5) gridLetras[0].setText(palabra.get(0).toUpperCase());
        jugador1.show(false);
        jugador2.show(false);
        VS.show(false);
        marcadorJugador1.show(false);
        marcadorJugador2.show(false);
        this.setTitle("ENTRENAMIENTO");
        this.setLocationRelativeTo(null);

    }

    public partidaCincoLetras() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        letra11 = new javax.swing.JTextField();
        letra13 = new javax.swing.JTextField();
        letra12 = new javax.swing.JTextField();
        letra14 = new javax.swing.JTextField();
        letra15 = new javax.swing.JTextField();
        letra23 = new javax.swing.JTextField();
        letra22 = new javax.swing.JTextField();
        letra24 = new javax.swing.JTextField();
        letra25 = new javax.swing.JTextField();
        letra21 = new javax.swing.JTextField();
        letra33 = new javax.swing.JTextField();
        letra32 = new javax.swing.JTextField();
        letra34 = new javax.swing.JTextField();
        letra35 = new javax.swing.JTextField();
        letra31 = new javax.swing.JTextField();
        letra43 = new javax.swing.JTextField();
        letra42 = new javax.swing.JTextField();
        letra44 = new javax.swing.JTextField();
        letra45 = new javax.swing.JTextField();
        letra41 = new javax.swing.JTextField();
        letra53 = new javax.swing.JTextField();
        letra52 = new javax.swing.JTextField();
        letra54 = new javax.swing.JTextField();
        letra55 = new javax.swing.JTextField();
        letra51 = new javax.swing.JTextField();
        comprobar = new javax.swing.JButton();
        pistaPalabra = new javax.swing.JButton();
        pistaLetra = new javax.swing.JButton();
        Terminar = new javax.swing.JButton();
        VS = new javax.swing.JLabel();
        jugador2 = new javax.swing.JLabel();
        jugador1 = new javax.swing.JLabel();
        marcadorJugador2 = new javax.swing.JTextField();
        marcadorJugador1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        letra11.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra11.setToolTipText("");
        letra11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra11ActionPerformed(evt);
            }
        });
        letra11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra11KeyTyped(evt);
            }
        });

        letra13.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra13ActionPerformed(evt);
            }
        });
        letra13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra13KeyTyped(evt);
            }
        });

        letra12.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra12ActionPerformed(evt);
            }
        });
        letra12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra12KeyTyped(evt);
            }
        });

        letra14.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra14ActionPerformed(evt);
            }
        });
        letra14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra14KeyTyped(evt);
            }
        });

        letra15.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra15ActionPerformed(evt);
            }
        });
        letra15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra15KeyTyped(evt);
            }
        });

        letra23.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra23.setEnabled(false);
        letra23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra23ActionPerformed(evt);
            }
        });
        letra23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra23KeyTyped(evt);
            }
        });

        letra22.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra22.setEnabled(false);
        letra22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra22ActionPerformed(evt);
            }
        });
        letra22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra22KeyTyped(evt);
            }
        });

        letra24.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra24.setEnabled(false);
        letra24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra24ActionPerformed(evt);
            }
        });
        letra24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra24KeyTyped(evt);
            }
        });

        letra25.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra25.setEnabled(false);
        letra25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra25ActionPerformed(evt);
            }
        });
        letra25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra25KeyTyped(evt);
            }
        });

        letra21.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra21.setEnabled(false);
        letra21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra21ActionPerformed(evt);
            }
        });
        letra21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra21KeyTyped(evt);
            }
        });

        letra33.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra33.setEnabled(false);
        letra33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra33ActionPerformed(evt);
            }
        });
        letra33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra33KeyTyped(evt);
            }
        });

        letra32.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra32.setEnabled(false);
        letra32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra32ActionPerformed(evt);
            }
        });
        letra32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra32KeyTyped(evt);
            }
        });

        letra34.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra34.setEnabled(false);
        letra34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra34ActionPerformed(evt);
            }
        });
        letra34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra34KeyTyped(evt);
            }
        });

        letra35.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra35.setEnabled(false);
        letra35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra35ActionPerformed(evt);
            }
        });
        letra35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra35KeyTyped(evt);
            }
        });

        letra31.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra31.setEnabled(false);
        letra31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra31ActionPerformed(evt);
            }
        });
        letra31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra31KeyTyped(evt);
            }
        });

        letra43.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra43.setEnabled(false);
        letra43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra43ActionPerformed(evt);
            }
        });
        letra43.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra43KeyTyped(evt);
            }
        });

        letra42.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra42.setEnabled(false);
        letra42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra42ActionPerformed(evt);
            }
        });
        letra42.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra42KeyTyped(evt);
            }
        });

        letra44.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra44.setEnabled(false);
        letra44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra44ActionPerformed(evt);
            }
        });
        letra44.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra44KeyTyped(evt);
            }
        });

        letra45.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra45.setEnabled(false);
        letra45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra45ActionPerformed(evt);
            }
        });
        letra45.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra45KeyTyped(evt);
            }
        });

        letra41.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra41.setEnabled(false);
        letra41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra41ActionPerformed(evt);
            }
        });
        letra41.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra41KeyTyped(evt);
            }
        });

        letra53.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra53.setEnabled(false);
        letra53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra53ActionPerformed(evt);
            }
        });
        letra53.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra53KeyTyped(evt);
            }
        });

        letra52.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra52.setEnabled(false);
        letra52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra52ActionPerformed(evt);
            }
        });
        letra52.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra52KeyTyped(evt);
            }
        });

        letra54.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra54.setEnabled(false);
        letra54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra54ActionPerformed(evt);
            }
        });
        letra54.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra54KeyTyped(evt);
            }
        });

        letra55.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra55.setEnabled(false);
        letra55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra55ActionPerformed(evt);
            }
        });
        letra55.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra55KeyTyped(evt);
            }
        });

        letra51.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra51.setEnabled(false);
        letra51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra51ActionPerformed(evt);
            }
        });
        letra51.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra51KeyTyped(evt);
            }
        });

        comprobar.setBackground(new java.awt.Color(255, 255, 255));
        comprobar.setText("Comprobar");
        comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprobarActionPerformed(evt);
            }
        });

        pistaPalabra.setBackground(new java.awt.Color(255, 255, 255));
        pistaPalabra.setText("Pista de Palabra");
        pistaPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pistaPalabraActionPerformed(evt);
            }
        });

        pistaLetra.setBackground(new java.awt.Color(255, 255, 255));
        pistaLetra.setText("Pista de Letra");
        pistaLetra.setMaximumSize(new java.awt.Dimension(117, 25));
        pistaLetra.setMinimumSize(new java.awt.Dimension(117, 25));
        pistaLetra.setPreferredSize(new java.awt.Dimension(117, 25));
        pistaLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pistaLetraActionPerformed(evt);
            }
        });

        Terminar.setBackground(new java.awt.Color(255, 255, 255));
        Terminar.setText("Terminar Entrenamiento");
        Terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerminarActionPerformed(evt);
            }
        });

        VS.setText("VS");

        jugador2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jugador2.setText("jugador2");

        jugador1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jugador1.setText("jugador1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(letra41, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letra31, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letra51, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letra21, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letra11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(letra42, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(letra43, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(letra44, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(letra52, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(letra53, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(letra54, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(letra12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(letra13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(letra14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(letra32, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(letra33, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(letra22, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(letra23, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(letra24, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(letra34, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(letra55, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letra45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letra35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(letra25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(letra15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(pistaLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 182, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Terminar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(comprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pistaPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(marcadorJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(VS)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marcadorJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugador1)
                    .addComponent(jugador2)
                    .addComponent(VS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcadorJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marcadorJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letra11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letra21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra23, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra24, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra25, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letra31, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra33, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra32, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra34, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra35, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letra41, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra43, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra42, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra44, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra45, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letra51, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra53, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra52, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra54, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra55, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pistaPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pistaLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(Terminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void letra11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra11ActionPerformed

    }//GEN-LAST:event_letra11ActionPerformed

    private void letra13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra13ActionPerformed

    private void letra12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra12ActionPerformed

    private void letra14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra14ActionPerformed

    private void letra15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra15ActionPerformed

    private void letra23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra23ActionPerformed

    private void letra22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra22ActionPerformed

    private void letra24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra24ActionPerformed

    private void letra25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra25ActionPerformed

    private void letra21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra21ActionPerformed

    private void letra33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra33ActionPerformed

    private void letra32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra32ActionPerformed

    private void letra34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra34ActionPerformed

    private void letra35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra35ActionPerformed

    private void letra31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra31ActionPerformed

    private void letra43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra43ActionPerformed

    private void letra42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra42ActionPerformed

    private void letra44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra44ActionPerformed

    private void letra45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra45ActionPerformed

    private void letra41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra41ActionPerformed

    private void letra53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra53ActionPerformed

    private void letra52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra52ActionPerformed

    private void letra54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra54ActionPerformed

    private void letra55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra55ActionPerformed

    private void letra51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra51ActionPerformed


    private void comprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprobarActionPerformed
        String[] letras = new String[5];
        String s;
        Boolean[] esIgual = new Boolean[5];
        for (int i = 0; i < 5; i++) {
            esIgual[i] = false;
        }
        Boolean esIgualEntero = true;
        if (!esEntrenamiento) {
            if (usuario1Jugando) {
                //USUARIO 1
                //Este for recoge las letras escritas en los jtextfield
                for (int i = 0; i < 5; i++) {
                    JTextField aux = gridLetras[contadorFila2];
                    String stringaux = aux.getText().toLowerCase();
                    letras[i] = stringaux;
                    contadorFila2 += 1;
                }

                //Este for es el que comprueba y cambia las casillas de color
                for (int i = 0; i < 5; i++) {
                    if (palabra.contains(letras[i])) {
                        if (palabra.get(i).toLowerCase().equals(letras[i])) {
                            gridLetras[contadorFila].setBackground(Color.green);
                            esIgual[i] = true;
                        } else {
                            gridLetras[contadorFila].setBackground(Color.yellow);
                        }
                    } else {
                        gridLetras[contadorFila].setBackground(Color.gray);
                    }
                    contadorFila += 1;
                }

                //Este for comprueba si se ha acertado la palabra
                for (int i = 0; i < 5 && esIgualEntero; i++) {
                    if (!esIgual[i]) {
                        esIgualEntero = false;
                    }
                }

                if (!esIgualEntero && contadorFila <= 20) {

                    //Este for habilita las 5 casillas siguientes si hay
                    for (int i = 0; i < 5; i++) {
                        gridLetras[this.contadorEnabled].enable();
                        contadorEnabled += 1;
                    }

                }
                if (esIgualEntero && contadorFila <= 20) {
                    switch (contadorFila) {
                        case 5:
                            usuario1.actualizarPuntos(5);
                            partidaJugando.actualizarMarcador1(5);
                            partidaJugando.setIntento1(1, palabraJugada);
                            JOptionPane.showMessageDialog(null, "ACERTASTE a la primera crack, +5 puntos.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 10:
                            usuario1.actualizarPuntos(4);
                            partidaJugando.actualizarMarcador1(4);
                            partidaJugando.setIntento1(2, palabraJugada);
                            JOptionPane.showMessageDialog(null, "ACERTASTE a la segunda, no esta mal, +4 puntos.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 15:
                            usuario1.actualizarPuntos(3);
                            partidaJugando.actualizarMarcador1(3);
                            partidaJugando.setIntento1(3, palabraJugada);
                            JOptionPane.showMessageDialog(null, "ACERTASTE a la tercera chaval, +3 puntos.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 20:
                            usuario1.actualizarPuntos(2);
                            partidaJugando.actualizarMarcador1(2);
                            partidaJugando.setIntento1(4, palabraJugada);
                            JOptionPane.showMessageDialog(null, "ACERTASTE, por poquito casi se te lia, +2 puntitos.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;
                    }
                    if (palabraJugada == palabras) {
                        if (partidaJugando.getMarcador1() > partidaJugando.getMarcador2()) {
                            marcadorJugador1.setText(Integer.toString(partidaJugando.getMarcador1()));
                            marcadorJugador2.setText(Integer.toString(partidaJugando.getMarcador2()));
                            s = "Ha ganado " + usuario1.getNombre() + " con una puntuación de " + partidaJugando.getMarcador1();
                            usuario1.actualizarGanadas(1);
                            usuario2.actualizarPerdidas(1);
                            partidaJugando.setGanadorJugador1(true);
                        } else if (partidaJugando.getMarcador1() < partidaJugando.getMarcador2()) {
                            s = "Ha ganado " + usuario2.getNombre() + " con una puntuación de " + partidaJugando.getMarcador2();
                            usuario1.actualizarPerdidas(1);
                            usuario2.actualizarGanadas(1);
                            partidaJugando.setGanadorJugador1(false);
                        } else {
                            s = "Han quedado empate " + usuario1.getNombre() + " y " + usuario2.getNombre() + " con una puntuación de " + partidaJugando.getMarcador1();
                            usuario1.actualizarEmpatadas(1);
                            usuario2.actualizarEmpatadas(1);
                            partidaJugando.setEmpataron(true);
                        }
                        JOptionPane.showMessageDialog(null, s, "Fin de Partida", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                        //Crear un nuevo menu con todo configurado con lo que ya hay.
                        Menu nuevoMenu = new Menu(almacenPartidas, almacenUsuarios, almacenPalabras, usuario1);
                        nuevoMenu.setVisible(true);
                    } else {
                        //Escoger otra palabra a jugar
                        palabraJugada += 1;
                        Palabra[] aux = partidaJugando.getPalabras();
                        String aux2 = aux[palabraJugada].toString();
                        //AlmacenUsuarios a, Usuario u1, Usuario u2, int numeroPalabras, String pala, Partida p, boolean pistaPalabra, boolean usu1Jugando, int palaJugada
                        partidaCincoLetras otraSesion = new partidaCincoLetras(almacenPalabras, almacenPartidas, almacenUsuarios, usuario1, usuario2, palabras, aux2, index, pistaPalabraNoUsada1, pistaPalabraNoUsada2, false, palabraJugada, primeraLetraOculta);
                        this.setVisible(false);
                        otraSesion.setVisible(true);
                    }
                }
                if (contadorFila == 25) {
                    if (esIgualEntero) {
                        JOptionPane.showMessageDialog(null, "ACERTASTE +1 puntito", "", JOptionPane.INFORMATION_MESSAGE);
                        usuario1.actualizarPuntos(1);
                        partidaJugando.actualizarMarcador1(1);
                        partidaJugando.setIntento1(5, palabraJugada);
                    }
                    if (palabraJugada == palabras) {
                        marcadorJugador1.setText(Integer.toString(partidaJugando.getMarcador1()));
                        marcadorJugador2.setText(Integer.toString(partidaJugando.getMarcador2()));
                        if (partidaJugando.getMarcador1() > partidaJugando.getMarcador2()) {
                            s = "Ha ganado " + usuario1.getNombre() + " con una puntuación de " + partidaJugando.getMarcador1();
                            usuario1.actualizarGanadas(1);
                            usuario2.actualizarPerdidas(1);
                            partidaJugando.setGanadorJugador1(true);
                        } else if (partidaJugando.getMarcador1() < partidaJugando.getMarcador2()) {
                            s = "Ha ganado " + usuario2.getNombre() + " con una puntuación de " + partidaJugando.getMarcador2();
                            usuario1.actualizarPerdidas(1);
                            usuario2.actualizarGanadas(1);
                            partidaJugando.setGanadorJugador1(false);
                        } else {
                            s = "Han quedado empate " + usuario1.getNombre() + " y " + usuario2.getNombre() + " con una puntuación de " + partidaJugando.getMarcador1();
                            usuario1.actualizarEmpatadas(1);
                            usuario2.actualizarEmpatadas(1);
                            partidaJugando.setEmpataron(true);
                        }
                        JOptionPane.showMessageDialog(null, s, "Fin de Partida", JOptionPane.INFORMATION_MESSAGE);

                        this.dispose();
                        //Crear un nuevo menu con todo configurado con lo que ya hay.
                        Menu nuevoMenu = new Menu(almacenPartidas, almacenUsuarios, almacenPalabras, usuario1);
                        nuevoMenu.setVisible(true);
                    } else {
                        //Empezar otra con el otro jugador
                        //Escoger otra palabra a jugar
                        palabraJugada += 1;
                        Palabra[] aux = partidaJugando.getPalabras();
                        String aux2 = aux[palabraJugada].toString();
                        //AlmacenUsuarios a, Usuario u1, Usuario u2, int numeroPalabras, String pala, Partida p, boolean pistaPalabra, boolean usu1Jugando, int palaJugada
                        partidaCincoLetras otraSesion = new partidaCincoLetras(almacenPalabras, almacenPartidas, almacenUsuarios, usuario1, usuario2, palabras, aux2, index, pistaPalabraNoUsada1, pistaPalabraNoUsada2, false, palabraJugada, primeraLetraOculta);
                        this.setVisible(false);
                        otraSesion.setVisible(true);
                    }
                }
                //FIN USUARIO 1
            } else {
                //USUARIO 2
                //Este for recoge las letras escritas en los jtextfield
                for (int i = 0; i < 5; i++) {
                    JTextField aux = gridLetras[contadorFila2];
                    String stringaux = aux.getText().toLowerCase();
                    letras[i] = stringaux;
                    contadorFila2 += 1;
                }

                //Este for es el que comprueba y cambia las casillas de color
                for (int i = 0; i < 5; i++) {
                    if (palabra.contains(letras[i])) {
                        if (palabra.get(i).toLowerCase().equals(letras[i])) {
                            gridLetras[contadorFila].setBackground(Color.green);
                            esIgual[i] = true;
                        } else {
                            gridLetras[contadorFila].setBackground(Color.yellow);
                        }
                    } else {
                        gridLetras[contadorFila].setBackground(Color.gray);
                    }
                    contadorFila += 1;
                }

                //Este for comprueba si se ha acertado la palabra
                for (int i = 0; i < 5 && esIgualEntero; i++) {
                    if (!esIgual[i]) {
                        esIgualEntero = false;
                    }
                }

                if (!esIgualEntero && contadorFila <= 20) {

                    //Este for habilita las 5 casillas siguientes si hay
                    for (int i = 0; i < 5; i++) {
                        gridLetras[this.contadorEnabled].enable();
                        contadorEnabled += 1;
                    }

                }
                if (esIgualEntero && contadorFila <= 20) {
                    switch (contadorFila) {
                        case 5:
                            usuario2.actualizarPuntos(5);
                            partidaJugando.actualizarMarcador2(5);
                            partidaJugando.setIntento2(1, palabraJugada);
                            JOptionPane.showMessageDialog(null, "ACERTASTE a la primera crack, +5 puntos.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 10:
                            usuario2.actualizarPuntos(4);
                            partidaJugando.actualizarMarcador2(4);
                            partidaJugando.setIntento2(2, palabraJugada);
                            JOptionPane.showMessageDialog(null, "ACERTASTE a la segunda, no esta mal, +4 puntos.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 15:
                            usuario2.actualizarPuntos(3);
                            partidaJugando.actualizarMarcador2(3);
                            partidaJugando.setIntento2(3, palabraJugada);
                            JOptionPane.showMessageDialog(null, "ACERTASTE a la tercera chaval, +3 puntos.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 20:
                            usuario2.actualizarPuntos(2);
                            partidaJugando.actualizarMarcador2(2);
                            partidaJugando.setIntento2(4, palabraJugada);
                            JOptionPane.showMessageDialog(null, "ACERTASTE, por poquito casi se te lia, +2 puntitos.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;
                    }
                    if (palabraJugada == palabras) {
                        if (partidaJugando.getMarcador1() > partidaJugando.getMarcador2()) {
                            marcadorJugador1.setText(Integer.toString(partidaJugando.getMarcador1()));
                            marcadorJugador2.setText(Integer.toString(partidaJugando.getMarcador2()));
                            s = "Ha ganado " + usuario1.getNombre() + " con una puntuación de " + partidaJugando.getMarcador1();
                            usuario1.actualizarGanadas(1);
                            usuario2.actualizarPerdidas(1);
                            partidaJugando.setGanadorJugador1(true);
                        } else if (partidaJugando.getMarcador1() < partidaJugando.getMarcador2()) {
                            s = "Ha ganado " + usuario2.getNombre() + " con una puntuación de " + partidaJugando.getMarcador2();
                            usuario1.actualizarPerdidas(1);
                            usuario2.actualizarGanadas(1);
                            partidaJugando.setGanadorJugador1(false);
                        } else {
                            s = "Han quedado empate " + usuario1.getNombre() + " y " + usuario2.getNombre() + " con una puntuación de " + partidaJugando.getMarcador1();
                            usuario1.actualizarEmpatadas(1);
                            usuario2.actualizarEmpatadas(1);
                            partidaJugando.setEmpataron(true);
                        }
                        JOptionPane.showMessageDialog(null, s, "Fin de Partida", JOptionPane.INFORMATION_MESSAGE);

                        this.dispose();
                        //Crear un nuevo menu con todo configurado con lo que ya hay.
                        Menu nuevoMenu = new Menu(almacenPartidas, almacenUsuarios, almacenPalabras, usuario1);
                        nuevoMenu.setVisible(true);
                    } else {
                        //Escoger otra palabra a jugar
                        palabraJugada += 1;
                        Palabra[] aux = partidaJugando.getPalabras();
                        String aux2 = aux[palabraJugada].toString();
                        //AlmacenUsuarios a, Usuario u1, Usuario u2, int numeroPalabras, String pala, Partida p, boolean pistaPalabra, boolean usu1Jugando, int palaJugada
                        partidaCincoLetras otraSesion = new partidaCincoLetras(almacenPalabras, almacenPartidas, almacenUsuarios, usuario1, usuario2, palabras, aux2, index, pistaPalabraNoUsada1, pistaPalabraNoUsada2, true, palabraJugada, primeraLetraOculta);
                        this.setVisible(false);
                        otraSesion.setVisible(true);
                    }
                }
                if (contadorFila == 25) {
                    if (esIgualEntero) {
                        JOptionPane.showMessageDialog(null, "ACERTASTE +1 puntito", "", JOptionPane.INFORMATION_MESSAGE);
                        usuario2.actualizarPuntos(1);
                        partidaJugando.actualizarMarcador2(1);
                        partidaJugando.setIntento2(5, palabraJugada);
                    }
                    if (palabraJugada == palabras) {
                        marcadorJugador1.setText(Integer.toString(partidaJugando.getMarcador1()));
                        marcadorJugador2.setText(Integer.toString(partidaJugando.getMarcador2()));
                        if (partidaJugando.getMarcador1() > partidaJugando.getMarcador2()) {
                            s = "Ha ganado " + usuario1.getNombre() + " con una puntuación de " + partidaJugando.getMarcador1();
                            usuario1.actualizarGanadas(1);
                            usuario2.actualizarPerdidas(1);
                            partidaJugando.setGanadorJugador1(true);
                        } else if (partidaJugando.getMarcador1() < partidaJugando.getMarcador2()) {
                            s = "Ha ganado " + usuario2.getNombre() + " con una puntuación de " + partidaJugando.getMarcador2();
                            usuario1.actualizarPerdidas(1);
                            usuario2.actualizarGanadas(1);
                            partidaJugando.setGanadorJugador1(false);
                        } else {
                            s = "Han quedado empate " + usuario1.getNombre() + " y " + usuario2.getNombre() + " con una puntuación de " + partidaJugando.getMarcador1();
                            usuario1.actualizarEmpatadas(1);
                            usuario2.actualizarEmpatadas(1);
                            partidaJugando.setEmpataron(true);
                        }
                        JOptionPane.showMessageDialog(null, s, "Fin de Partida", JOptionPane.INFORMATION_MESSAGE);

                        this.dispose();
                        //Crear un nuevo menu con todo configurado con lo que ya hay.
                        Menu nuevoMenu = new Menu(almacenPartidas, almacenUsuarios, almacenPalabras, usuario1);
                        nuevoMenu.setVisible(true);
                    } else {
                        //Empezar otra con el otro jugador
                        //Escoger otra palabra a jugar
                        palabraJugada += 1;
                        Palabra[] aux = partidaJugando.getPalabras();
                        String aux2 = aux[palabraJugada].toString();
                        //AlmacenUsuarios a, Usuario u1, Usuario u2, int numeroPalabras, String pala, Partida p, boolean pistaPalabra, boolean usu1Jugando, int palaJugada
                        partidaCincoLetras otraSesion = new partidaCincoLetras(almacenPalabras, almacenPartidas, almacenUsuarios, usuario1, usuario2, palabras, aux2, index, pistaPalabraNoUsada1, pistaPalabraNoUsada2, true, palabraJugada, primeraLetraOculta);
                        this.setVisible(false);
                        otraSesion.setVisible(true);
                    }
                }
                //FIN USUARIO 2
            }
        } else {
            //ENTRENAMIENTO
            //Este for recoge las letras escritas en los jtextfield
            for (int i = 0; i < 5; i++) {
                JTextField aux = gridLetras[contadorFila2];
                String stringaux = aux.getText().toLowerCase();
                letras[i] = stringaux;
                contadorFila2 += 1;
            }

            //Este for es el que comprueba y cambia las casillas de color
            for (int i = 0; i < 5; i++) {
                if (palabra.contains(letras[i])) {
                    if (palabra.get(i).toLowerCase().equals(letras[i])) {
                        gridLetras[contadorFila].setBackground(Color.green);
                        esIgual[i] = true;
                    } else {
                        gridLetras[contadorFila].setBackground(Color.yellow);
                    }
                } else {
                    gridLetras[contadorFila].setBackground(Color.gray);
                }
                contadorFila += 1;
            }

            //Este for comprueba si se ha acertado la palabra
            for (int i = 0; i < 5 && esIgualEntero; i++) {
                if (!esIgual[i]) {
                    esIgualEntero = false;
                }
            }

            if (!esIgualEntero && contadorFila <= 20) {

                //Este for habilita las 5 casillas siguientes si hay
                for (int i = 0; i < 5; i++) {
                    gridLetras[this.contadorEnabled].enable();
                    contadorEnabled += 1;
                }

            }
            if (esIgualEntero && contadorFila <= 20) {
                switch (contadorFila) {
                    case 5:
                        entrenamiento.actualizarPuntos(5);
                        JOptionPane.showMessageDialog(null, "ACERTASTE a la primera crack, +5 puntos.", "", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 10:
                        entrenamiento.actualizarPuntos(4);
                        JOptionPane.showMessageDialog(null, "ACERTASTE a la segunda, no esta mal, +4 puntos.", "", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 15:
                        entrenamiento.actualizarPuntos(3);
                        JOptionPane.showMessageDialog(null, "ACERTASTE a la tercera chaval, +3 puntos.", "", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 20:
                        entrenamiento.actualizarPuntos(2);
                        JOptionPane.showMessageDialog(null, "ACERTASTE, por poquito casi se te lia, +2 puntitos.", "", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                //Escoger otra palabra a jugar
                int contadorCincoLetras = almacenPalabras.getContador5();
                Random r1 = new Random();
                int posicionAleatoria = r1.nextInt(contadorCincoLetras);
                Palabra[] aux = almacenPalabras.getPalabrasCincoLetras();
                String aux2 = aux[posicionAleatoria].toString();
                //AlmacenPalabras pa, Entrenamiento e, String pala, boolean pistaPalabra
                partidaCincoLetras otraSesion = new partidaCincoLetras(almacenPartidas, almacenUsuarios, almacenPalabras, entrenamiento, aux2, pistaPalabraNoUsadaEntrenamiento, primeraLetraOculta);
                this.setVisible(false);
                otraSesion.setVisible(true);
            }
            if (contadorFila == 25) {
                if (esIgualEntero) {
                    JOptionPane.showMessageDialog(null, "ACERTASTE +1 puntito", "", JOptionPane.INFORMATION_MESSAGE);
                    entrenamiento.actualizarPuntos(1);
                }
                //Escoger otra palabra a jugar
                int contadorCincoLetras = almacenPalabras.getContador5();
                Random r1 = new Random();
                int posicionAleatoria = r1.nextInt(contadorCincoLetras);
                Palabra[] aux = almacenPalabras.getPalabrasCincoLetras();
                String aux2 = aux[posicionAleatoria].toString();
                //AlmacenPalabras pa, Entrenamiento e, String pala, boolean pistaPalabra
                partidaCincoLetras otraSesion = new partidaCincoLetras(almacenPartidas, almacenUsuarios, almacenPalabras, entrenamiento, aux2, pistaPalabraNoUsadaEntrenamiento, primeraLetraOculta);
                this.setVisible(false);
                otraSesion.setVisible(true);
            }

        }


    }//GEN-LAST:event_comprobarActionPerformed

    private void letra11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra11KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra11.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra11KeyTyped

    private void letra12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra12KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra12.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra12KeyTyped

    private void letra13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra13KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra13.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra13KeyTyped

    private void letra14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra14KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra14.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra14KeyTyped

    private void letra15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra15KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra15.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra15KeyTyped

    private void letra21KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra21KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra21.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra21KeyTyped

    private void letra22KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra22KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra22.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra22KeyTyped

    private void letra23KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra23KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra23.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra23KeyTyped

    private void letra24KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra24KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra24.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra24KeyTyped

    private void letra25KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra25KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra25.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra25KeyTyped

    private void letra31KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra31KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra31.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra31KeyTyped

    private void letra32KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra32KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra32.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra32KeyTyped

    private void letra33KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra33KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra33.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra33KeyTyped

    private void letra34KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra34KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra34.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra34KeyTyped

    private void letra35KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra35KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra35.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra35KeyTyped

    private void letra41KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra41KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra41.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra41KeyTyped

    private void letra42KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra42KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra42.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra42KeyTyped

    private void letra43KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra43KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra43.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra43KeyTyped

    private void letra44KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra44KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra44.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra44KeyTyped

    private void letra45KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra45KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra45.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra45KeyTyped

    private void letra51KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra51KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra51.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra51KeyTyped

    private void letra52KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra52KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra52.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra52KeyTyped

    private void letra53KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra53KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra53.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra53KeyTyped

    private void letra54KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra54KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra54.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra54KeyTyped

    private void letra55KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra55KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra55.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra55KeyTyped

    private void pistaPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pistaPalabraActionPerformed
        String s;
        if (!esEntrenamiento) {
            if (usuario1Jugando) {
                if (pistaPalabraNoUsada1) {

                    switch (contadorFila) {
                        case 0:
                            for (int i = 0; i < 5; i++) {
                                gridLetras[contadorFila].setBackground(Color.green);
                                gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                                contadorFila += 1;
                            }
                            partidaJugando.actualizarMarcador1(5);
                            partidaJugando.setIntento1(1, palabraJugada);
                            usuario1.actualizarPuntos(5);
                            JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, +2 puntitos crack, siempre usalo la primera.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 5:
                            for (int i = 0; i < 5; i++) {
                                gridLetras[contadorFila].setBackground(Color.green);
                                gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                                contadorFila += 1;
                            }
                            partidaJugando.actualizarMarcador1(4);
                            partidaJugando.setIntento1(2, palabraJugada);
                            usuario1.actualizarPuntos(4);
                            JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, +1 puntitos crack, era mejor usarlo antes.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 10:
                            for (int i = 0; i < 5; i++) {
                                gridLetras[contadorFila].setBackground(Color.green);
                                gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                                contadorFila += 1;
                            }
                            partidaJugando.actualizarMarcador1(3);
                            partidaJugando.setIntento1(3, palabraJugada);
                            usuario1.actualizarPuntos(3);
                            JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, 0 puntitos crack, haberlo usado la primera hombre.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 15:
                            for (int i = 0; i < 5; i++) {
                                gridLetras[contadorFila].setBackground(Color.green);
                                gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                                contadorFila += 1;
                            }
                            partidaJugando.actualizarMarcador1(2);
                            partidaJugando.setIntento1(4, palabraJugada);
                            usuario1.actualizarPuntos(2);
                            JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, -1 puntitos crack, no lo uses en la fila 4 chaval.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 20:
                            for (int i = 0; i < 5; i++) {
                                gridLetras[contadorFila].setBackground(Color.green);
                                gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                                contadorFila += 1;
                            }
                            partidaJugando.actualizarMarcador1(1);
                            partidaJugando.setIntento1(5, palabraJugada);
                            usuario1.actualizarPuntos(1);
                            JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, -2 puntitos crack, acuerdate de que al final no se debe usar tontito.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;
                    }
                    partidaJugando.actualizarMarcador1(-3);
                    usuario1.actualizarPuntos(-3);
                    if (palabraJugada == palabras) {
                        partidaJugando.setPistaPalabra1(false);
                        marcadorJugador1.setText(Integer.toString(partidaJugando.getMarcador1()));
                        marcadorJugador2.setText(Integer.toString(partidaJugando.getMarcador2()));
                        if (partidaJugando.getMarcador1() > partidaJugando.getMarcador2()) {
                            s = "Ha ganado " + usuario1.getNombre() + " con una puntuación de " + partidaJugando.getMarcador1();
                            usuario1.actualizarGanadas(1);
                            usuario2.actualizarPerdidas(1);
                            partidaJugando.setGanadorJugador1(true);
                        } else if (partidaJugando.getMarcador1() < partidaJugando.getMarcador2()) {
                            s = "Ha ganado " + usuario2.getNombre() + " con una puntuación de " + partidaJugando.getMarcador2();
                            usuario1.actualizarPerdidas(1);
                            usuario2.actualizarGanadas(1);
                            partidaJugando.setGanadorJugador1(false);
                        } else {
                            s = "Han quedado empate " + usuario1.getNombre() + " y " + usuario2.getNombre() + " con una puntuación de " + partidaJugando.getMarcador1();
                            usuario1.actualizarEmpatadas(1);
                            usuario2.actualizarEmpatadas(1);
                            partidaJugando.setEmpataron(true);
                        }
                        JOptionPane.showMessageDialog(null, s, "Final Partida", JOptionPane.INFORMATION_MESSAGE);

                        this.dispose();
                        //Crear un nuevo menu con todo configurado con lo que ya hay.
                        Menu nuevoMenu = new Menu(almacenPartidas, almacenUsuarios, almacenPalabras, usuario1);
                        nuevoMenu.setVisible(true);
                    } else {
                        //Empezar otra con el otro jugador
                        //Escoger otra palabra a jugar
                        partidaJugando.setPistaPalabra1(false);
                        pistaPalabraNoUsada1 = false;
                        palabraJugada += 1;
                        Palabra[] aux = partidaJugando.getPalabras();
                        String aux2 = aux[palabraJugada].toString();
                        //AlmacenUsuarios a, Usuario u1, Usuario u2, int numeroPalabras, String pala, Partida p, boolean pistaPalabra1, boolean usu1Jugando, int palaJugada
                        partidaCincoLetras otraSesion = new partidaCincoLetras(almacenPalabras, almacenPartidas, almacenUsuarios, usuario1, usuario2, palabras, aux2, index, pistaPalabraNoUsada1, pistaPalabraNoUsada2, false, palabraJugada, primeraLetraOculta);
                        this.setVisible(false);
                        otraSesion.setVisible(true);
                    }
                }
            } else {
                if (pistaPalabraNoUsada2) {

                    switch (contadorFila) {
                        case 0:
                            for (int i = 0; i < 5; i++) {
                                gridLetras[contadorFila].setBackground(Color.green);
                                gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                                contadorFila += 1;
                            }
                            partidaJugando.actualizarMarcador2(5);
                            partidaJugando.setIntento2(1, palabraJugada);
                            usuario2.actualizarPuntos(5);
                            JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, +2 puntitos crack, siempre usalo la primera.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 5:
                            for (int i = 0; i < 5; i++) {
                                gridLetras[contadorFila].setBackground(Color.green);
                                gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                                contadorFila += 1;
                            }
                            partidaJugando.actualizarMarcador2(4);
                            partidaJugando.setIntento2(2, palabraJugada);
                            usuario2.actualizarPuntos(4);
                            JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, +1 puntitos crack, era mejor usarlo antes.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 10:
                            for (int i = 0; i < 5; i++) {
                                gridLetras[contadorFila].setBackground(Color.green);
                                gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                                contadorFila += 1;
                            }
                            partidaJugando.actualizarMarcador2(3);
                            partidaJugando.setIntento2(3, palabraJugada);
                            usuario2.actualizarPuntos(3);
                            JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, 0 puntitos crack, haberlo usado la primera hombre.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 15:
                            for (int i = 0; i < 5; i++) {
                                gridLetras[contadorFila].setBackground(Color.green);
                                gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                                contadorFila += 1;
                            }
                            partidaJugando.actualizarMarcador2(2);
                            partidaJugando.setIntento2(4, palabraJugada);
                            usuario2.actualizarPuntos(2);
                            JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, -1 puntitos crack, no lo uses en la fila 4 chaval.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 20:
                            for (int i = 0; i < 5; i++) {
                                gridLetras[contadorFila].setBackground(Color.green);
                                gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                                contadorFila += 1;
                            }
                            partidaJugando.actualizarMarcador2(1);
                            partidaJugando.setIntento2(5, palabraJugada);
                            usuario2.actualizarPuntos(1);
                            JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, -2 puntitos crack, acuerdate de que al final no se debe usar tontito.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;
                    }
                    partidaJugando.actualizarMarcador2(-3);
                    usuario2.actualizarPuntos(-3);
                    if (palabraJugada == palabras) {
                        marcadorJugador1.setText(Integer.toString(partidaJugando.getMarcador1()));
                        marcadorJugador2.setText(Integer.toString(partidaJugando.getMarcador2()));
                        partidaJugando.setPistaPalabra2(false);
                        if (partidaJugando.getMarcador1() > partidaJugando.getMarcador2()) {
                            s = "Ha ganado " + usuario1.getNombre() + " con una puntuación de " + partidaJugando.getMarcador1();
                            usuario1.actualizarGanadas(1);
                            usuario2.actualizarPerdidas(1);
                            partidaJugando.setGanadorJugador1(true);
                        } else if (partidaJugando.getMarcador1() < partidaJugando.getMarcador2()) {
                            s = "Ha ganado " + usuario2.getNombre() + " con una puntuación de " + partidaJugando.getMarcador2();
                            usuario1.actualizarPerdidas(1);
                            usuario2.actualizarGanadas(1);
                            partidaJugando.setGanadorJugador1(false);
                        } else {
                            s = "Han quedado empate " + usuario1.getNombre() + " y " + usuario2.getNombre() + " con una puntuación de " + partidaJugando.getMarcador1();
                            usuario1.actualizarEmpatadas(1);
                            usuario2.actualizarEmpatadas(1);
                            partidaJugando.setEmpataron(true);
                        }
                        JOptionPane.showMessageDialog(null, s, "Final Partida", JOptionPane.INFORMATION_MESSAGE);

                        this.dispose();
                        //Crear un nuevo menu con todo configurado con lo que ya hay.
                        Menu nuevoMenu = new Menu(almacenPartidas, almacenUsuarios, almacenPalabras, usuario1);
                        nuevoMenu.setVisible(true);
                    } else {
                        //Empezar otra con el otro jugador
                        //Escoger otra palabra a jugar
                        partidaJugando.setPistaPalabra2(false);
                        pistaPalabraNoUsada2 = false;
                        palabraJugada += 1;
                        Palabra[] aux = partidaJugando.getPalabras();
                        String aux2 = aux[palabraJugada].toString();
                        //AlmacenUsuarios a, Usuario u1, Usuario u2, int numeroPalabras, String pala, Partida p, boolean pistaPalabra, boolean usu1Jugando, int palaJugada
                        partidaCincoLetras otraSesion = new partidaCincoLetras(almacenPalabras, almacenPartidas, almacenUsuarios, usuario1, usuario2, palabras, aux2, index, pistaPalabraNoUsada1, pistaPalabraNoUsada2, true, palabraJugada, primeraLetraOculta);
                        this.setVisible(false);
                        otraSesion.setVisible(true);
                    }
                }
            }
        } else {
            //ENTRENAMIENTO
            //Pista palabra cuando es entrenamiento
            if (pistaPalabraNoUsadaEntrenamiento) {

                switch (contadorFila) {
                    case 0:
                        for (int i = 0; i < 5; i++) {
                            gridLetras[contadorFila].setBackground(Color.green);
                            gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                            contadorFila += 1;
                        }
                        entrenamiento.actualizarPuntos(5);
                        JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, +2 puntitos crack, siempre usalo la primera.", "", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 5:
                        for (int i = 0; i < 5; i++) {
                            gridLetras[contadorFila].setBackground(Color.green);
                            gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                            contadorFila += 1;
                        }
                        entrenamiento.actualizarPuntos(4);
                        JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, +1 puntitos crack, era mejor usarlo antes", "", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 10:
                        for (int i = 0; i < 5; i++) {
                            gridLetras[contadorFila].setBackground(Color.green);
                            gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                            contadorFila += 1;
                        }
                        entrenamiento.actualizarPuntos(3);
                        JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, 0 puntitos crack,haberlo usado la primera hombre. ", "", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 15:
                        for (int i = 0; i < 5; i++) {
                            gridLetras[contadorFila].setBackground(Color.green);
                            gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                            contadorFila += 1;
                        }
                        entrenamiento.actualizarPuntos(2);
                        JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, -1 punto", "", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 20:
                        for (int i = 0; i < 5; i++) {
                            gridLetras[contadorFila].setBackground(Color.green);
                            gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                            contadorFila += 1;
                        }
                        entrenamiento.actualizarPuntos(1);
                        JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, -2 puntitos crack.", "", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                entrenamiento.actualizarPuntos(-3);
                entrenamiento.setPistaPalabraNoUsada(false);
                pistaPalabraNoUsadaEntrenamiento = false;
                //Escoger otra palabra a jugar
                int contadorCincoLetras = almacenPalabras.getContador5();
                Random r1 = new Random();
                int posicionAleatoria = r1.nextInt(contadorCincoLetras);
                Palabra[] aux = almacenPalabras.getPalabrasCincoLetras();
                String aux2 = aux[posicionAleatoria].toString();
                //AlmacenPalabras pa, Entrenamiento e, String pala, boolean pistaPalabra
                partidaCincoLetras otraSesion = new partidaCincoLetras(almacenPartidas, almacenUsuarios, almacenPalabras, entrenamiento, aux2, pistaPalabraNoUsadaEntrenamiento, primeraLetraOculta);
                this.setVisible(false);
                otraSesion.setVisible(true);
            }
        }
    }//GEN-LAST:event_pistaPalabraActionPerformed

    private void pistaLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pistaLetraActionPerformed

        Random r1 = new Random();
        int posicionLetraAleatoria = r1.nextInt(5);
        if (!esEntrenamiento) {
            if (usuario1Jugando) {
                if (pistaLetraNoUsada1) {

                    switch (contadorFila) {
                        case 0:
                            gridLetras[posicionLetraAleatoria].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                            gridLetras[posicionLetraAleatoria].setBackground(Color.green);
                            break;
                        case 5:
                            gridLetras[posicionLetraAleatoria + 5].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                            gridLetras[posicionLetraAleatoria + 5].setBackground(Color.green);
                            break;
                        case 10:
                            gridLetras[posicionLetraAleatoria + 10].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                            gridLetras[posicionLetraAleatoria + 10].setBackground(Color.green);
                            break;
                        case 15:
                            gridLetras[posicionLetraAleatoria + 15].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                            gridLetras[posicionLetraAleatoria + 15].setBackground(Color.green);
                            break;
                        case 20:
                            gridLetras[posicionLetraAleatoria + 20].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                            gridLetras[posicionLetraAleatoria + 20].setBackground(Color.green);
                            break;
                    }
                    JOptionPane.showMessageDialog(null, "Utilizaste comodin de letra, -1 puntito", "", JOptionPane.INFORMATION_MESSAGE);
                    partidaJugando.actualizarMarcador1(-1);
                    usuario1.actualizarPuntos(-1);
                    partidaJugando.setPistaLetra1(false, palabraJugada);
                    pistaLetra.setEnabled(false);
                }
            } else {
                if (pistaLetraNoUsada2) {
                    switch (contadorFila) {
                        case 0:
                            gridLetras[posicionLetraAleatoria].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                            gridLetras[posicionLetraAleatoria].setBackground(Color.green);
                            break;
                        case 5:
                            gridLetras[posicionLetraAleatoria + 5].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                            gridLetras[posicionLetraAleatoria + 5].setBackground(Color.green);
                            break;
                        case 10:
                            gridLetras[posicionLetraAleatoria + 10].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                            gridLetras[posicionLetraAleatoria + 10].setBackground(Color.green);
                            break;
                        case 15:
                            gridLetras[posicionLetraAleatoria + 15].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                            gridLetras[posicionLetraAleatoria + 15].setBackground(Color.green);
                            break;
                        case 20:
                            gridLetras[posicionLetraAleatoria + 20].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                            gridLetras[posicionLetraAleatoria + 20].setBackground(Color.green);
                            break;
                    }
                    JOptionPane.showMessageDialog(null, "Utilizaste comodin de letra, -1 puntito", "", JOptionPane.INFORMATION_MESSAGE);
                    partidaJugando.actualizarMarcador2(-1);
                    usuario2.actualizarPuntos(-1);
                    partidaJugando.setPistaLetra1(false, palabraJugada);
                    pistaLetra.setEnabled(false);
                }
            }
        } else {
            //pista letra cuando es entrenamiento
            switch (contadorFila) {
                case 0:
                    gridLetras[posicionLetraAleatoria].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                    gridLetras[posicionLetraAleatoria].setBackground(Color.green);
                    break;
                case 5:
                    gridLetras[posicionLetraAleatoria + 5].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                    gridLetras[posicionLetraAleatoria + 5].setBackground(Color.green);
                    break;
                case 10:
                    gridLetras[posicionLetraAleatoria + 10].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                    gridLetras[posicionLetraAleatoria + 10].setBackground(Color.green);
                    break;
                case 15:
                    gridLetras[posicionLetraAleatoria + 15].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                    gridLetras[posicionLetraAleatoria + 15].setBackground(Color.green);
                    break;
                case 20:
                    gridLetras[posicionLetraAleatoria + 20].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                    gridLetras[posicionLetraAleatoria + 20].setBackground(Color.green);
                    break;
            }
            JOptionPane.showMessageDialog(null, "Utilizaste comodin de letra, -1 puntito", "", JOptionPane.INFORMATION_MESSAGE);
            entrenamiento.actualizarPuntos(-1);
            pistaLetra.setEnabled(false);
        }


    }//GEN-LAST:event_pistaLetraActionPerformed

    private void TerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminarActionPerformed

        String s = "Acabaste el entrenamiento con: ";
        s = s + entrenamiento.getPuntos() + " puntos y ";
        if (pistaPalabraNoUsadaEntrenamiento) {
            s = s + "sin haber usado la pista de palabra";
        } else {
            s = s + "habiendo usado la pista de palabra";
        }
        JOptionPane.showMessageDialog(null, s, "FIN DE ENTRENAMIENTO", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        Iniciar i = new Iniciar(almacenPartidas, almacenUsuarios, almacenPalabras, true);
        i.setVisible(true);
    }//GEN-LAST:event_TerminarActionPerformed

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
            java.util.logging.Logger.getLogger(partidaCincoLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(partidaCincoLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(partidaCincoLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(partidaCincoLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new partidaCincoLetras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Terminar;
    private javax.swing.JLabel VS;
    private javax.swing.JButton comprobar;
    private javax.swing.JLabel jugador1;
    private javax.swing.JLabel jugador2;
    private javax.swing.JTextField letra11;
    private javax.swing.JTextField letra12;
    private javax.swing.JTextField letra13;
    private javax.swing.JTextField letra14;
    private javax.swing.JTextField letra15;
    private javax.swing.JTextField letra21;
    private javax.swing.JTextField letra22;
    private javax.swing.JTextField letra23;
    private javax.swing.JTextField letra24;
    private javax.swing.JTextField letra25;
    private javax.swing.JTextField letra31;
    private javax.swing.JTextField letra32;
    private javax.swing.JTextField letra33;
    private javax.swing.JTextField letra34;
    private javax.swing.JTextField letra35;
    private javax.swing.JTextField letra41;
    private javax.swing.JTextField letra42;
    private javax.swing.JTextField letra43;
    private javax.swing.JTextField letra44;
    private javax.swing.JTextField letra45;
    private javax.swing.JTextField letra51;
    private javax.swing.JTextField letra52;
    private javax.swing.JTextField letra53;
    private javax.swing.JTextField letra54;
    private javax.swing.JTextField letra55;
    private javax.swing.JTextField marcadorJugador1;
    private javax.swing.JTextField marcadorJugador2;
    private javax.swing.JButton pistaLetra;
    private javax.swing.JButton pistaPalabra;
    // End of variables declaration//GEN-END:variables
}
