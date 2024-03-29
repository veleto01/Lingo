package partida;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.Arrays;
import urjc.poo.lingo.Clases.*;
import java.util.*;
import javax.swing.JTextField;
import java.util.Random;
import urjc.poo.lingo.Clases.Partida;
import javax.swing.JOptionPane;
import urjc.poo.lingo.Login.Iniciar;
import urjc.poo.lingo.Login.Menu;

public class partidaSeisLetras extends javax.swing.JFrame {

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
    boolean usuario1Jugando;
    boolean esEntrenamiento;
    Partida partidaJugando;
    boolean pistaLetraNoUsada1;
    boolean pistaLetraNoUsada2;
    boolean pistaPalabraNoUsadaEntrenamiento;
    boolean primeraLetraOculta;
    Entrenamiento entrenamiento;

    public partidaSeisLetras(AlmacenPalabras pa, AlmacenPartidas p, AlmacenUsuarios a, Usuario u1, Usuario u2, int numeroPalabras, String pala, int contadorPartida, boolean pistaPalabra1, boolean pistaPalabra2, boolean usu1Jugando, int palaJugada, boolean pLetraOculta) {
        initComponents();
        gridLetras = new JTextField[30];
        almacenUsuarios = a;
        almacenPartidas = p;
        almacenPalabras = pa;
        usuario1 = u1;
        usuario2 = u2;
        palabras = numeroPalabras;
        palabra = Arrays.asList(pala.split(""));
        contadorFila = 0;
        contadorEnabled = 6;
        contadorFila2 = 0;
        index = contadorPartida;
        palabraJugada = palaJugada;
        pistaPalabraNoUsada1 = pistaPalabra1;
        pistaPalabraNoUsada2 = pistaPalabra2;
        pistaLetraNoUsada1 = true;
        pistaLetraNoUsada2 = true;
        primeraLetraOculta = pLetraOculta;
        partidaJugando = almacenPartidas.getPartida(contadorPartida);
        usuario1Jugando = usu1Jugando;
        esEntrenamiento = false;
        gridLetras[0] = letra11;//0
        gridLetras[1] = letra12;
        gridLetras[2] = letra13;
        gridLetras[3] = letra14;
        gridLetras[4] = letra15;
        gridLetras[5] = letra16;//6
        gridLetras[6] = letra21;
        gridLetras[7] = letra22;
        gridLetras[8] = letra23;
        gridLetras[9] = letra24;
        gridLetras[10] = letra25;
        gridLetras[11] = letra26;//12
        gridLetras[12] = letra31;
        gridLetras[13] = letra32;
        gridLetras[14] = letra33;
        gridLetras[15] = letra34;
        gridLetras[16] = letra35;
        gridLetras[17] = letra36;//18
        gridLetras[18] = letra41;
        gridLetras[19] = letra42;
        gridLetras[20] = letra43;
        gridLetras[21] = letra44;
        gridLetras[22] = letra45;
        gridLetras[23] = letra46;//24
        gridLetras[24] = letra51;
        gridLetras[25] = letra52;
        gridLetras[26] = letra53;
        gridLetras[27] = letra54;
        gridLetras[28] = letra55;
        gridLetras[29] = letra56;//30
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
        if(!primeraLetraOculta && contadorFila < 6) gridLetras[0].setText(palabra.get(0).toUpperCase());
        jugador1.setText(usuario1.getNombre());
        jugador2.setText(usuario2.getNombre());
        marcadorJugador1.setText(Integer.toString(partidaJugando.getMarcador1()));
        marcadorJugador2.setText(Integer.toString(partidaJugando.getMarcador2()));
        marcadorJugador1.setEditable(false);
        marcadorJugador2.setEditable(false);
        this.setLocationRelativeTo(null);

    }

    public partidaSeisLetras(AlmacenPartidas p, AlmacenUsuarios u, AlmacenPalabras pa, Entrenamiento e, String pala, boolean pistaPalabra, boolean pLetraOculta) {

        initComponents();
        gridLetras = new JTextField[30];
        palabra = Arrays.asList(pala.split(""));
        entrenamiento = e;
        almacenPalabras = pa;
        almacenUsuarios = u;
        almacenPartidas = p;
        pistaPalabraNoUsadaEntrenamiento = pistaPalabra;
        primeraLetraOculta = pLetraOculta;
        esEntrenamiento = true;
        contadorFila = 0;
        contadorEnabled = 6;
        contadorFila2 = 0;
        gridLetras[0] = letra11;//0
        gridLetras[1] = letra12;
        gridLetras[2] = letra13;
        gridLetras[3] = letra14;
        gridLetras[4] = letra15;
        gridLetras[5] = letra16;//6
        gridLetras[6] = letra21;
        gridLetras[7] = letra22;
        gridLetras[8] = letra23;
        gridLetras[9] = letra24;
        gridLetras[10] = letra25;
        gridLetras[11] = letra26;//12
        gridLetras[12] = letra31;
        gridLetras[13] = letra32;
        gridLetras[14] = letra33;
        gridLetras[15] = letra34;
        gridLetras[16] = letra35;
        gridLetras[17] = letra36;//18
        gridLetras[18] = letra41;
        gridLetras[19] = letra42;
        gridLetras[20] = letra43;
        gridLetras[21] = letra44;
        gridLetras[22] = letra45;
        gridLetras[23] = letra46;//24
        gridLetras[24] = letra51;
        gridLetras[25] = letra52;
        gridLetras[26] = letra53;
        gridLetras[27] = letra54;
        gridLetras[28] = letra55;
        gridLetras[29] = letra56;//30
        if (!pistaPalabraNoUsadaEntrenamiento) {
            this.pistaPalabra.setEnabled(false);
        }
        if(!primeraLetraOculta && contadorFila < 6) gridLetras[0].setText(palabra.get(0).toUpperCase());
        jugador1.show(false);
        jugador2.show(false);
        VS.show(false);
        marcadorJugador1.show(false);
        marcadorJugador2.show(false);
        this.setTitle("ENTRENAMIENTO");
        this.setLocationRelativeTo(null);
    }

    public partidaSeisLetras() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        letra12 = new javax.swing.JTextField();
        letra13 = new javax.swing.JTextField();
        letra11 = new javax.swing.JTextField();
        letra15 = new javax.swing.JTextField();
        letra16 = new javax.swing.JTextField();
        letra21 = new javax.swing.JTextField();
        letra22 = new javax.swing.JTextField();
        letra23 = new javax.swing.JTextField();
        letra14 = new javax.swing.JTextField();
        letra25 = new javax.swing.JTextField();
        letra26 = new javax.swing.JTextField();
        letra31 = new javax.swing.JTextField();
        letra32 = new javax.swing.JTextField();
        letra24 = new javax.swing.JTextField();
        letra33 = new javax.swing.JTextField();
        letra35 = new javax.swing.JTextField();
        letra36 = new javax.swing.JTextField();
        letra41 = new javax.swing.JTextField();
        letra42 = new javax.swing.JTextField();
        letra43 = new javax.swing.JTextField();
        letra44 = new javax.swing.JTextField();
        letra45 = new javax.swing.JTextField();
        letra46 = new javax.swing.JTextField();
        letra51 = new javax.swing.JTextField();
        letra34 = new javax.swing.JTextField();
        letra53 = new javax.swing.JTextField();
        letra52 = new javax.swing.JTextField();
        letra55 = new javax.swing.JTextField();
        letra56 = new javax.swing.JTextField();
        letra54 = new javax.swing.JTextField();
        comprobar = new javax.swing.JButton();
        pistaPalabra = new javax.swing.JButton();
        pistaLetra = new javax.swing.JButton();
        Terminar = new javax.swing.JButton();
        jugador1 = new javax.swing.JLabel();
        jugador2 = new javax.swing.JLabel();
        VS = new javax.swing.JLabel();
        marcadorJugador1 = new javax.swing.JTextField();
        marcadorJugador2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        letra12.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra12.setToolTipText("");
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

        letra13.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra13.setToolTipText("");
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

        letra15.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra15.setToolTipText("");
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

        letra16.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra16.setToolTipText("");
        letra16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra16ActionPerformed(evt);
            }
        });
        letra16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra16KeyTyped(evt);
            }
        });

        letra21.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra21.setToolTipText("");
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

        letra22.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra22.setToolTipText("");
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

        letra23.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra23.setToolTipText("");
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

        letra14.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra14.setToolTipText("");
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

        letra25.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra25.setToolTipText("");
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

        letra26.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra26.setToolTipText("");
        letra26.setEnabled(false);
        letra26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra26ActionPerformed(evt);
            }
        });
        letra26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra26KeyTyped(evt);
            }
        });

        letra31.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra31.setToolTipText("");
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

        letra32.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra32.setToolTipText("");
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

        letra24.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra24.setToolTipText("");
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

        letra33.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra33.setToolTipText("");
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

        letra35.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra35.setToolTipText("");
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

        letra36.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra36.setToolTipText("");
        letra36.setEnabled(false);
        letra36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra36ActionPerformed(evt);
            }
        });
        letra36.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra36KeyTyped(evt);
            }
        });

        letra41.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra41.setToolTipText("");
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

        letra42.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra42.setToolTipText("");
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

        letra43.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra43.setToolTipText("");
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

        letra44.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra44.setToolTipText("");
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
        letra45.setToolTipText("");
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

        letra46.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra46.setToolTipText("");
        letra46.setEnabled(false);
        letra46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra46ActionPerformed(evt);
            }
        });
        letra46.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra46KeyTyped(evt);
            }
        });

        letra51.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra51.setToolTipText("");
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

        letra34.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra34.setToolTipText("");
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

        letra53.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra53.setToolTipText("");
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
        letra52.setToolTipText("");
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

        letra55.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra55.setToolTipText("");
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

        letra56.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra56.setToolTipText("");
        letra56.setEnabled(false);
        letra56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra56ActionPerformed(evt);
            }
        });
        letra56.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                letra56KeyTyped(evt);
            }
        });

        letra54.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        letra54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        letra54.setToolTipText("");
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

        jugador1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jugador1.setText("jugador1");

        jugador2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jugador2.setText("jugador2");

        VS.setText("VS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(letra33, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letra43, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letra53, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letra23, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letra13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(marcadorJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(letra54, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(letra55, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(letra56, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(letra45, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(letra35, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(letra25, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(letra15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(letra16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(letra46, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(letra26, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(letra36, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(pistaPalabra))
                                .addGap(57, 57, 57))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(letra14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(letra24, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(letra44, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(letra34, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(VS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marcadorJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(145, 145, 145))))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(Terminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pistaLetra)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(letra41, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letra31, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letra21, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letra11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letra51, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(letra52, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(letra42, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(letra32, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(letra22, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(letra12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addComponent(comprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugador1)
                    .addComponent(jugador2)
                    .addComponent(VS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcadorJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marcadorJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letra12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letra21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra23, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra25, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra26, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra24, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letra31, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra32, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra33, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra34, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra35, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra36, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letra46, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra45, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra44, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra43, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra42, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra41, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letra51, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra52, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra53, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra54, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra55, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra56, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pistaPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pistaLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Terminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void letra12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra12ActionPerformed

    }//GEN-LAST:event_letra12ActionPerformed

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

    private void letra13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra13ActionPerformed

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

    private void letra11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra11ActionPerformed

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

    private void letra15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra15ActionPerformed

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

    private void letra16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra16ActionPerformed

    private void letra16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra16KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra16.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra16KeyTyped

    private void letra21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra21ActionPerformed

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

    private void letra22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra22ActionPerformed

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

    private void letra23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra23ActionPerformed

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

    private void letra14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra14ActionPerformed

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

    private void letra25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra25ActionPerformed

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

    private void letra26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra26ActionPerformed

    private void letra26KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra26KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra26.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra26KeyTyped

    private void letra31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra31ActionPerformed

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

    private void letra32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra32ActionPerformed

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

    private void letra24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra24ActionPerformed

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

    private void letra33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra33ActionPerformed

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

    private void letra35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra35ActionPerformed

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

    private void letra36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra36ActionPerformed

    private void letra36KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra36KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra36.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra36KeyTyped

    private void letra41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra41ActionPerformed

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

    private void letra42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra42ActionPerformed

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

    private void letra43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra43ActionPerformed

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

    private void letra44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra44ActionPerformed

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

    private void letra45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra45ActionPerformed

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

    private void letra46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra46ActionPerformed

    private void letra46KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra46KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra46.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra46KeyTyped

    private void letra51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra51ActionPerformed

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

    private void letra34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra34ActionPerformed

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

    private void letra53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra53ActionPerformed

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

    private void letra52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra52ActionPerformed

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

    private void letra55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra55ActionPerformed

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

    private void letra56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra56ActionPerformed

    private void letra56KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_letra56KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        if (letra56.getText().length() >= 1) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_letra56KeyTyped

    private void letra54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letra54ActionPerformed

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

    private void comprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprobarActionPerformed

        String[] letras = new String[6];
        String s;
        Boolean[] esIgual = new Boolean[6];
        for (int i = 0; i < 6; i++) {
            esIgual[i] = false;
        }
        Boolean esIgualEntero = true;
        if (!esEntrenamiento) {
            if (usuario1Jugando) {
                //USUARIO 1
                //Este for recoge las letras escritas en los jtextfield
                for (int i = 0; i < 6; i++) {
                    JTextField aux = gridLetras[contadorFila2];
                    String stringaux = aux.getText().toLowerCase();
                    letras[i] = stringaux;
                    contadorFila2 += 1;
                }

                //Este for es el que comprueba y cambia las casillas de color
                for (int i = 0; i < 6; i++) {
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
                for (int i = 0; i < 6 && esIgualEntero; i++) {
                    if (!esIgual[i]) {
                        esIgualEntero = false;
                    }
                }

                if (!esIgualEntero && contadorFila <= 24) {

                    //Este for habilita las 5 casillas siguientes si hay
                    for (int i = 0; i < 6; i++) {
                        gridLetras[this.contadorEnabled].enable();
                        contadorEnabled += 1;
                    }

                }
                if (esIgualEntero && contadorFila <= 24) {
                    switch (contadorFila) {
                        case 6:
                            usuario1.actualizarPuntos(5);
                            partidaJugando.actualizarMarcador1(5);
                            partidaJugando.setIntento1(1, palabraJugada);
                            JOptionPane.showMessageDialog(null, "ACERTASTE a la primera crack, +5 puntos.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 12:
                            usuario1.actualizarPuntos(4);
                            partidaJugando.actualizarMarcador1(4);
                            partidaJugando.setIntento1(2, palabraJugada);
                            JOptionPane.showMessageDialog(null, "ACERTASTE a la segunda, no esta mal, +4 puntos.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 18:
                            usuario1.actualizarPuntos(3);
                            partidaJugando.actualizarMarcador1(3);
                            partidaJugando.setIntento1(3, palabraJugada);
                            JOptionPane.showMessageDialog(null, "ACERTASTE a la tercera chaval, +3 puntos.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 24:
                            usuario1.actualizarPuntos(2);
                            partidaJugando.actualizarMarcador1(2);
                            partidaJugando.setIntento1(4, palabraJugada);
                            JOptionPane.showMessageDialog(null, "ACERTASTE, por poquito casi se te lia, +2 puntitos.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;
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
                        //Escoger otra palabra a jugar
                        palabraJugada += 1;
                        Palabra[] aux = partidaJugando.getPalabras();
                        String aux2 = aux[palabraJugada].toString();
                        //AlmacenPartidas p, AlmacenUsuarios a, Usuario u1, Usuario u2, int numeroPalabras, String pala, int contadorPartida, boolean pistaPalabra1, boolean pistaPalabra2, boolean usu1Jugando, int palaJugada
                        partidaSeisLetras otraSesion = new partidaSeisLetras(almacenPalabras, almacenPartidas, almacenUsuarios, usuario1, usuario2, palabras, aux2, index, pistaPalabraNoUsada1, pistaPalabraNoUsada2, false, palabraJugada, primeraLetraOculta);
                        this.setVisible(false);
                        otraSesion.setVisible(true);
                    }
                }
                if (contadorFila == 30) {
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
                        partidaSeisLetras otraSesion = new partidaSeisLetras(almacenPalabras, almacenPartidas, almacenUsuarios, usuario1, usuario2, palabras, aux2, index, pistaPalabraNoUsada1, pistaPalabraNoUsada2, false, palabraJugada, primeraLetraOculta);
                        this.setVisible(false);
                        otraSesion.setVisible(true);
                    }
                }
                //FIN USUARIO 1
            } else {
                //USUARIO 2
                //Este for recoge las letras escritas en los jtextfield
                for (int i = 0; i < 6; i++) {
                    JTextField aux = gridLetras[contadorFila2];
                    String stringaux = aux.getText().toLowerCase();
                    letras[i] = stringaux;
                    contadorFila2 += 1;
                }

                //Este for es el que comprueba y cambia las casillas de color
                for (int i = 0; i < 6; i++) {
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
                for (int i = 0; i < 6 && esIgualEntero; i++) {
                    if (!esIgual[i]) {
                        esIgualEntero = false;
                    }
                }

                if (!esIgualEntero && contadorFila <= 24) {

                    //Este for habilita las 5 casillas siguientes si hay
                    for (int i = 0; i < 6; i++) {
                        gridLetras[this.contadorEnabled].enable();
                        contadorEnabled += 1;
                    }

                }
                if (esIgualEntero && contadorFila <= 24) {
                    switch (contadorFila) {
                        case 6:
                            usuario2.actualizarPuntos(5);
                            partidaJugando.actualizarMarcador2(5);
                            partidaJugando.setIntento2(1, palabraJugada);
                            JOptionPane.showMessageDialog(null, "ACERTASTE a la primera crack, +5 puntos.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 12:
                            usuario2.actualizarPuntos(4);
                            partidaJugando.actualizarMarcador2(4);
                            partidaJugando.setIntento2(2, palabraJugada);
                            JOptionPane.showMessageDialog(null, "ACERTASTE a la segunda, no esta mal, +4 puntos.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 18:
                            usuario2.actualizarPuntos(3);
                            partidaJugando.actualizarMarcador2(3);
                            partidaJugando.setIntento2(3, palabraJugada);
                            JOptionPane.showMessageDialog(null, "ACERTASTE a la tercera chaval, +3 puntos.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 24:
                            usuario2.actualizarPuntos(2);
                            partidaJugando.actualizarMarcador2(2);
                            partidaJugando.setIntento2(4, palabraJugada);
                            JOptionPane.showMessageDialog(null, "ACERTASTE, por poquito casi se te lia, +2 puntitos.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;
                    }
                    if (palabraJugada == palabras) {
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
                        //Escoger otra palabra a jugar
                        palabraJugada += 1;
                        Palabra[] aux = partidaJugando.getPalabras();
                        String aux2 = aux[palabraJugada].toString();
                        //AlmacenUsuarios a, Usuario u1, Usuario u2, int numeroPalabras, String pala, Partida p, boolean pistaPalabra, boolean usu1Jugando, int palaJugada
                        partidaSeisLetras otraSesion = new partidaSeisLetras(almacenPalabras, almacenPartidas, almacenUsuarios, usuario1, usuario2, palabras, aux2, index, pistaPalabraNoUsada1, pistaPalabraNoUsada2, true, palabraJugada, primeraLetraOculta);
                        this.setVisible(false);
                        otraSesion.setVisible(true);
                    }
                }
                if (contadorFila == 30) {
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
                        partidaSeisLetras otraSesion = new partidaSeisLetras(almacenPalabras, almacenPartidas, almacenUsuarios, usuario1, usuario2, palabras, aux2, index, pistaPalabraNoUsada1, pistaPalabraNoUsada2, true, palabraJugada, primeraLetraOculta);
                        this.setVisible(false);
                        otraSesion.setVisible(true);
                    }
                }
                //FIN USUARIO 2
            }

        } else {
            //ENTRENAMIENTO
            //Este for recoge las letras escritas en los jtextfield
            for (int i = 0; i < 6; i++) {
                JTextField aux = gridLetras[contadorFila2];
                String stringaux = aux.getText().toLowerCase();
                letras[i] = stringaux;
                contadorFila2 += 1;
            }

            //Este for es el que comprueba y cambia las casillas de color
            for (int i = 0; i < 6; i++) {
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
            for (int i = 0; i < 6 && esIgualEntero; i++) {
                if (!esIgual[i]) {
                    esIgualEntero = false;
                }
            }

            if (!esIgualEntero && contadorFila <= 24) {

                //Este for habilita las 6 casillas siguientes si hay
                for (int i = 0; i < 6; i++) {
                    gridLetras[this.contadorEnabled].enable();
                    contadorEnabled += 1;
                }

            }
            if (esIgualEntero && contadorFila <= 24) {
                switch (contadorFila) {
                    case 6:
                        entrenamiento.actualizarPuntos(5);
                        JOptionPane.showMessageDialog(null, "ACERTASTE a la primera crack, +5 puntos.", "", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 12:
                        entrenamiento.actualizarPuntos(4);
                        JOptionPane.showMessageDialog(null, "ACERTASTE a la segunda, no esta mal, +4 puntos.", "", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 18:
                        entrenamiento.actualizarPuntos(3);
                        JOptionPane.showMessageDialog(null, "ACERTASTE a la tercera chaval, +3 puntos.", "", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 24:
                        entrenamiento.actualizarPuntos(2);
                        JOptionPane.showMessageDialog(null, "ACERTASTE, por poquito casi se te lia, +2 puntitos.", "", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                //Escoger otra palabra a jugar
                int contadorSeisLetras = almacenPalabras.getContador6();
                Random r1 = new Random();
                int posicionAleatoria = r1.nextInt(contadorSeisLetras);
                Palabra[] aux = almacenPalabras.getPalabrasSeisLetras();
                String aux2 = aux[posicionAleatoria].toString();
                //AlmacenPalabras pa, Entrenamiento e, String pala, boolean pistaPalabra
                partidaSeisLetras otraSesion = new partidaSeisLetras(almacenPartidas, almacenUsuarios, almacenPalabras, entrenamiento, aux2, pistaPalabraNoUsadaEntrenamiento, primeraLetraOculta);
                this.setVisible(false);
                otraSesion.setVisible(true);
            }
            if (contadorFila == 30) {
                if (esIgualEntero) {
                    JOptionPane.showMessageDialog(null, "ACERTASTE +1 puntito", "", JOptionPane.INFORMATION_MESSAGE);
                    entrenamiento.actualizarPuntos(1);
                }
                //Escoger otra palabra a jugar
                int contadorSeisLetras = almacenPalabras.getContador6();
                Random r1 = new Random();
                int posicionAleatoria = r1.nextInt(contadorSeisLetras);
                Palabra[] aux = almacenPalabras.getPalabrasSeisLetras();
                String aux2 = aux[posicionAleatoria].toString();
                //AlmacenPalabras pa, Entrenamiento e, String pala, boolean pistaPalabra
                partidaSeisLetras otraSesion = new partidaSeisLetras(almacenPartidas, almacenUsuarios, almacenPalabras, entrenamiento, aux2, pistaPalabraNoUsadaEntrenamiento, primeraLetraOculta);
                this.setVisible(false);
                otraSesion.setVisible(true);
            }
        }

    }//GEN-LAST:event_comprobarActionPerformed

    private void pistaPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pistaPalabraActionPerformed
        String s;
        if (!esEntrenamiento) {
            if (usuario1Jugando) {
                if (pistaPalabraNoUsada1) {
                    switch (contadorFila) {
                        case 0:
                            for (int i = 0; i < 6; i++) {
                                gridLetras[contadorFila].setBackground(Color.green);
                                gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                                contadorFila += 1;
                            }
                            partidaJugando.actualizarMarcador1(5);
                            partidaJugando.setIntento1(1, palabraJugada);
                            usuario1.actualizarPuntos(5);
                            JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, +2 puntitos crack, siempre usalo la primera.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 6:
                            for (int i = 0; i < 6; i++) {
                                gridLetras[contadorFila].setBackground(Color.green);
                                gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                                contadorFila += 1;
                            }
                            partidaJugando.actualizarMarcador1(4);
                            partidaJugando.setIntento1(2, palabraJugada);
                            usuario1.actualizarPuntos(4);
                            JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, +1 puntitos crack, era mejor usarlo antes", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 12:
                            for (int i = 0; i < 6; i++) {
                                gridLetras[contadorFila].setBackground(Color.green);
                                gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                                contadorFila += 1;
                            }
                            partidaJugando.actualizarMarcador1(3);
                            partidaJugando.setIntento1(3, palabraJugada);
                            usuario1.actualizarPuntos(3);
                            JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, 0 puntitos crack,haberlo usado la primera hombre. ", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 18:
                            for (int i = 0; i < 6; i++) {
                                gridLetras[contadorFila].setBackground(Color.green);
                                gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                                contadorFila += 1;
                            }
                            partidaJugando.actualizarMarcador1(2);
                            partidaJugando.setIntento1(4, palabraJugada);
                            usuario1.actualizarPuntos(2);
                            JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, -1 punto", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 24:
                            for (int i = 0; i < 6; i++) {
                                gridLetras[contadorFila].setBackground(Color.green);
                                gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                                contadorFila += 1;
                            }
                            partidaJugando.actualizarMarcador1(1);
                            partidaJugando.setIntento1(5, palabraJugada);
                            usuario1.actualizarPuntos(1);
                            JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, -2 puntitos crack.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;
                    }
                    partidaJugando.actualizarMarcador1(-3);
                    usuario1.actualizarPuntos(-3);
                    if (palabraJugada == palabras) {
                        marcadorJugador1.setText(Integer.toString(partidaJugando.getMarcador1()));
                        marcadorJugador2.setText(Integer.toString(partidaJugando.getMarcador2()));
                        partidaJugando.setPistaPalabra1(false);
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
                        //Creo nueva partidaSeisLetras con todos los parametros casi iguales
                        partidaSeisLetras otraSesion = new partidaSeisLetras(almacenPalabras, almacenPartidas, almacenUsuarios, usuario1, usuario2, palabras, aux2, index, pistaPalabraNoUsada1, pistaPalabraNoUsada2, false, palabraJugada, primeraLetraOculta);
                        this.setVisible(false);
                        otraSesion.setVisible(true);
                    }
                }
            } else {
                if (pistaPalabraNoUsada2) {

                    switch (contadorFila) {
                        case 0:
                            for (int i = 0; i < 6; i++) {
                                gridLetras[contadorFila].setBackground(Color.green);
                                gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                                contadorFila += 1;
                            }
                            partidaJugando.actualizarMarcador2(5);
                            partidaJugando.setIntento2(1, palabraJugada);
                            usuario2.actualizarPuntos(5);
                            JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, +2 puntitos crack, siempre usalo la primera.", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 6:
                            for (int i = 0; i < 6; i++) {
                                gridLetras[contadorFila].setBackground(Color.green);
                                gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                                contadorFila += 1;
                            }
                            partidaJugando.actualizarMarcador2(4);
                            partidaJugando.setIntento2(2, palabraJugada);
                            usuario2.actualizarPuntos(4);
                            JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, +1 puntitos crack, era mejor usarlo antes", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 12:
                            for (int i = 0; i < 6; i++) {
                                gridLetras[contadorFila].setBackground(Color.green);
                                gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                                contadorFila += 1;
                            }
                            partidaJugando.actualizarMarcador2(3);
                            partidaJugando.setIntento2(3, palabraJugada);
                            usuario2.actualizarPuntos(3);
                            JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, 0 puntitos crack,haberlo usado la primera hombre. ", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 18:
                            for (int i = 0; i < 6; i++) {
                                gridLetras[contadorFila].setBackground(Color.green);
                                gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                                contadorFila += 1;
                            }
                            partidaJugando.actualizarMarcador2(2);
                            partidaJugando.setIntento2(4, palabraJugada);
                            usuario2.actualizarPuntos(2);
                            JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, -1 punto", "", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 24:
                            for (int i = 0; i < 6; i++) {
                                gridLetras[contadorFila].setBackground(Color.green);
                                gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                                contadorFila += 1;
                            }
                            partidaJugando.actualizarMarcador2(1);
                            partidaJugando.setIntento2(5, palabraJugada);
                            usuario2.actualizarPuntos(1);
                            JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, -2 puntitos crack.", "", JOptionPane.INFORMATION_MESSAGE);
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
                        partidaSeisLetras otraSesion = new partidaSeisLetras(almacenPalabras, almacenPartidas, almacenUsuarios, usuario1, usuario2, palabras, aux2, index, pistaPalabraNoUsada1, pistaPalabraNoUsada2, true, palabraJugada, primeraLetraOculta);
                        this.setVisible(false);
                        otraSesion.setVisible(true);
                    }
                }
            }
        } else {
            //Pista palabra cuando es entrenamiento
            if (pistaPalabraNoUsadaEntrenamiento) {

                switch (contadorFila) {
                    case 0:
                        for (int i = 0; i < 6; i++) {
                            gridLetras[contadorFila].setBackground(Color.green);
                            gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                            contadorFila += 1;
                        }
                        entrenamiento.actualizarPuntos(5);
                        JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, +2 puntitos crack, siempre usalo la primera.", "", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 6:
                        for (int i = 0; i < 6; i++) {
                            gridLetras[contadorFila].setBackground(Color.green);
                            gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                            contadorFila += 1;
                        }
                        entrenamiento.actualizarPuntos(4);
                        JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, +1 puntitos crack, era mejor usarlo antes", "", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 12:
                        for (int i = 0; i < 6; i++) {
                            gridLetras[contadorFila].setBackground(Color.green);
                            gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                            contadorFila += 1;
                        }
                        entrenamiento.actualizarPuntos(3);
                        JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, 0 puntitos crack,haberlo usado la primera hombre. ", "", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 18:
                        for (int i = 0; i < 6; i++) {
                            gridLetras[contadorFila].setBackground(Color.green);
                            gridLetras[contadorFila].setText(palabra.get(i).toUpperCase());
                            contadorFila += 1;
                        }
                        entrenamiento.actualizarPuntos(2);
                        JOptionPane.showMessageDialog(null, "Utilizaste comodin de palabra, -1 punto", "", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 24:
                        for (int i = 0; i < 6; i++) {
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
                int contadorSeisLetras = almacenPalabras.getContador6();
                Random r1 = new Random();
                int posicionAleatoria = r1.nextInt(contadorSeisLetras);
                Palabra[] aux = almacenPalabras.getPalabrasSeisLetras();
                String aux2 = aux[posicionAleatoria].toString();
                //AlmacenPalabras pa, Entrenamiento e, String pala, boolean pistaPalabra
                partidaSeisLetras otraSesion = new partidaSeisLetras(almacenPartidas, almacenUsuarios, almacenPalabras, entrenamiento, aux2, pistaPalabraNoUsadaEntrenamiento, primeraLetraOculta);
                this.setVisible(false);
                otraSesion.setVisible(true);

            }
        }

    }//GEN-LAST:event_pistaPalabraActionPerformed

    private void pistaLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pistaLetraActionPerformed
        Random r1 = new Random();
        int posicionLetraAleatoria = r1.nextInt(6);
        if (!esEntrenamiento) {
            if (usuario1Jugando) {
                if (pistaLetraNoUsada1) {

                    switch (contadorFila) {
                        case 0:
                            gridLetras[posicionLetraAleatoria].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                            gridLetras[posicionLetraAleatoria].setBackground(Color.green);
                            break;
                        case 6:
                            gridLetras[posicionLetraAleatoria + 6].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                            gridLetras[posicionLetraAleatoria + 6].setBackground(Color.green);
                            break;
                        case 12:
                            gridLetras[posicionLetraAleatoria + 12].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                            gridLetras[posicionLetraAleatoria + 12].setBackground(Color.green);
                            break;
                        case 18:
                            gridLetras[posicionLetraAleatoria + 18].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                            gridLetras[posicionLetraAleatoria + 18].setBackground(Color.green);
                            break;
                        case 24:
                            gridLetras[posicionLetraAleatoria + 24].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                            gridLetras[posicionLetraAleatoria + 24].setBackground(Color.green);
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
                        case 6:
                            gridLetras[posicionLetraAleatoria + 6].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                            gridLetras[posicionLetraAleatoria + 6].setBackground(Color.green);
                            break;
                        case 12:
                            gridLetras[posicionLetraAleatoria + 12].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                            gridLetras[posicionLetraAleatoria + 12].setBackground(Color.green);
                            break;
                        case 18:
                            gridLetras[posicionLetraAleatoria + 18].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                            gridLetras[posicionLetraAleatoria + 18].setBackground(Color.green);
                            break;
                        case 24:
                            gridLetras[posicionLetraAleatoria + 24].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                            gridLetras[posicionLetraAleatoria + 24].setBackground(Color.green);
                            break;
                    }
                    JOptionPane.showMessageDialog(null, "Utilizaste comodin de letra, -1 puntito", "", JOptionPane.INFORMATION_MESSAGE);
                    partidaJugando.actualizarMarcador2(-1);
                    usuario2.actualizarPuntos(-1);
                    partidaJugando.setPistaLetra2(false, palabraJugada);
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
                case 6:
                    gridLetras[posicionLetraAleatoria + 6].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                    gridLetras[posicionLetraAleatoria + 6].setBackground(Color.green);
                    break;
                case 12:
                    gridLetras[posicionLetraAleatoria + 12].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                    gridLetras[posicionLetraAleatoria + 12].setBackground(Color.green);
                    break;
                case 18:
                    gridLetras[posicionLetraAleatoria + 18].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                    gridLetras[posicionLetraAleatoria + 18].setBackground(Color.green);
                    break;
                case 24:
                    gridLetras[posicionLetraAleatoria + 24].setText(palabra.get(posicionLetraAleatoria).toUpperCase());
                    gridLetras[posicionLetraAleatoria + 24].setBackground(Color.green);
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
            java.util.logging.Logger.getLogger(partidaSeisLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(partidaSeisLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(partidaSeisLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(partidaSeisLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new partidaSeisLetras().setVisible(true);
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
    private javax.swing.JTextField letra16;
    private javax.swing.JTextField letra21;
    private javax.swing.JTextField letra22;
    private javax.swing.JTextField letra23;
    private javax.swing.JTextField letra24;
    private javax.swing.JTextField letra25;
    private javax.swing.JTextField letra26;
    private javax.swing.JTextField letra31;
    private javax.swing.JTextField letra32;
    private javax.swing.JTextField letra33;
    private javax.swing.JTextField letra34;
    private javax.swing.JTextField letra35;
    private javax.swing.JTextField letra36;
    private javax.swing.JTextField letra41;
    private javax.swing.JTextField letra42;
    private javax.swing.JTextField letra43;
    private javax.swing.JTextField letra44;
    private javax.swing.JTextField letra45;
    private javax.swing.JTextField letra46;
    private javax.swing.JTextField letra51;
    private javax.swing.JTextField letra52;
    private javax.swing.JTextField letra53;
    private javax.swing.JTextField letra54;
    private javax.swing.JTextField letra55;
    private javax.swing.JTextField letra56;
    private javax.swing.JTextField marcadorJugador1;
    private javax.swing.JTextField marcadorJugador2;
    private javax.swing.JButton pistaLetra;
    private javax.swing.JButton pistaPalabra;
    // End of variables declaration//GEN-END:variables
}
