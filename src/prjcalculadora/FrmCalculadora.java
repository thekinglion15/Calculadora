/*
 * Created by Gabriel Alexander De León Lizardo
 * Matricula: 100479203
 * Copyright © 2021 Gabriel Alexander De León Lizardo. All rights reserved
 */
package prjcalculadora;

public class FrmCalculadora extends javax.swing.JFrame {
    ClassCalculadora ObjCal = new ClassCalculadora();
    String operacion = "";
    
    public FrmCalculadora() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        //Verifica si se puede resetear el TextField
        ObjCal.PEstaLimpioSet(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtPreviu = new javax.swing.JTextField();
        TxtNum = new javax.swing.JTextField();
        BtnCero = new javax.swing.JButton();
        BtnNegativo = new javax.swing.JButton();
        BtnIgual = new javax.swing.JButton();
        BtnPunto = new javax.swing.JButton();
        BtnLn = new javax.swing.JButton();
        BtnDos = new javax.swing.JButton();
        BtnUno = new javax.swing.JButton();
        BtnSuma = new javax.swing.JButton();
        BtnTres = new javax.swing.JButton();
        BtnLog = new javax.swing.JButton();
        BtnFactorial = new javax.swing.JButton();
        BtnDivision = new javax.swing.JButton();
        BtnPotenY = new javax.swing.JButton();
        BtnNueve = new javax.swing.JButton();
        BtnMulti = new javax.swing.JButton();
        BtnSiete = new javax.swing.JButton();
        BtnOcho = new javax.swing.JButton();
        BtnDiezX = new javax.swing.JButton();
        BtnSeis = new javax.swing.JButton();
        BtnResta = new javax.swing.JButton();
        BtnCuatro = new javax.swing.JButton();
        BtnCinco = new javax.swing.JButton();
        BtnRaizCuad = new javax.swing.JButton();
        BtnAbsoluto = new javax.swing.JButton();
        BtnReciproco = new javax.swing.JButton();
        BtnMod = new javax.swing.JButton();
        BtnExp = new javax.swing.JButton();
        BtnE = new javax.swing.JButton();
        BtnPi = new javax.swing.JButton();
        BtnBorrar = new javax.swing.JButton();
        BtnC = new javax.swing.JButton();
        BtnSec = new javax.swing.JButton();
        BtnTan = new javax.swing.JButton();
        BtnCuadrado = new javax.swing.JButton();
        BtnCE = new javax.swing.JButton();
        Tbn2nd = new javax.swing.JToggleButton();
        BtnCsc = new javax.swing.JButton();
        BtnSin = new javax.swing.JButton();
        BtnCot = new javax.swing.JButton();
        BtnCos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        TxtPreviu.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        TxtPreviu.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtPreviu.setBorder(null);
        TxtPreviu.setFocusable(false);

        TxtNum.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        TxtNum.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtNum.setText("0");
        TxtNum.setBorder(null);
        TxtNum.setFocusable(false);

        BtnCero.setBackground(new java.awt.Color(176, 176, 176));
        BtnCero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnCero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnCero.setText("0");
        BtnCero.setBorder(null);
        BtnCero.setFocusPainted(false);
        BtnCero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCero.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnCero.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnCero.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnCero.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnCero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnCero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_2.png"))); // NOI18N
        BtnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCeroActionPerformed(evt);
            }
        });

        BtnNegativo.setBackground(new java.awt.Color(176, 176, 176));
        BtnNegativo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnNegativo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnNegativo.setText("±");
        BtnNegativo.setBorder(null);
        BtnNegativo.setFocusPainted(false);
        BtnNegativo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnNegativo.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnNegativo.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnNegativo.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnNegativo.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnNegativo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnNegativo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_2.png"))); // NOI18N
        BtnNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNegativoActionPerformed(evt);
            }
        });

        BtnIgual.setBackground(new java.awt.Color(255, 153, 153));
        BtnIgual.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_oscuro_1.png"))); // NOI18N
        BtnIgual.setText("=");
        BtnIgual.setBorder(null);
        BtnIgual.setFocusPainted(false);
        BtnIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnIgual.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnIgual.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnIgual.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnIgual.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnIgual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_oscuro_1.png"))); // NOI18N
        BtnIgual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_oscuro_2.png"))); // NOI18N
        BtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIgualActionPerformed(evt);
            }
        });

        BtnPunto.setBackground(new java.awt.Color(176, 176, 176));
        BtnPunto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnPunto.setText(".");
        BtnPunto.setToolTipText("");
        BtnPunto.setBorder(null);
        BtnPunto.setBorderPainted(false);
        BtnPunto.setFocusPainted(false);
        BtnPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnPunto.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnPunto.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnPunto.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnPunto.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnPunto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnPunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_2.png"))); // NOI18N
        BtnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPuntoActionPerformed(evt);
            }
        });

        BtnLn.setBackground(new java.awt.Color(204, 204, 204));
        BtnLn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnLn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnLn.setText("ln");
        BtnLn.setBorder(null);
        BtnLn.setFocusPainted(false);
        BtnLn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnLn.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnLn.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnLn.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnLn.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnLn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnLn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnLn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLnActionPerformed(evt);
            }
        });

        BtnDos.setBackground(new java.awt.Color(176, 176, 176));
        BtnDos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnDos.setText("2");
        BtnDos.setBorder(null);
        BtnDos.setFocusPainted(false);
        BtnDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnDos.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnDos.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnDos.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnDos.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnDos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnDos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_2.png"))); // NOI18N
        BtnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDosActionPerformed(evt);
            }
        });

        BtnUno.setBackground(new java.awt.Color(176, 176, 176));
        BtnUno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnUno.setText("1");
        BtnUno.setBorder(null);
        BtnUno.setFocusPainted(false);
        BtnUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnUno.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnUno.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnUno.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnUno.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnUno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnUno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_2.png"))); // NOI18N
        BtnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUnoActionPerformed(evt);
            }
        });

        BtnSuma.setBackground(new java.awt.Color(204, 204, 204));
        BtnSuma.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnSuma.setText("+");
        BtnSuma.setBorder(null);
        BtnSuma.setFocusPainted(false);
        BtnSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSuma.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnSuma.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnSuma.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnSuma.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnSuma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnSuma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSumaActionPerformed(evt);
            }
        });

        BtnTres.setBackground(new java.awt.Color(176, 176, 176));
        BtnTres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnTres.setText("3");
        BtnTres.setBorder(null);
        BtnTres.setFocusPainted(false);
        BtnTres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnTres.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnTres.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnTres.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnTres.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnTres.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnTres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_2.png"))); // NOI18N
        BtnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTresActionPerformed(evt);
            }
        });

        BtnLog.setBackground(new java.awt.Color(204, 204, 204));
        BtnLog.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnLog.setText("log");
        BtnLog.setBorder(null);
        BtnLog.setFocusPainted(false);
        BtnLog.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnLog.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnLog.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnLog.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnLog.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnLog.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnLog.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogActionPerformed(evt);
            }
        });

        BtnFactorial.setBackground(new java.awt.Color(204, 204, 204));
        BtnFactorial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnFactorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnFactorial.setText("n!");
        BtnFactorial.setBorder(null);
        BtnFactorial.setFocusPainted(false);
        BtnFactorial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnFactorial.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnFactorial.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnFactorial.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnFactorial.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnFactorial.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnFactorial.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFactorialActionPerformed(evt);
            }
        });

        BtnDivision.setBackground(new java.awt.Color(204, 204, 204));
        BtnDivision.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnDivision.setText("÷");
        BtnDivision.setBorder(null);
        BtnDivision.setFocusPainted(false);
        BtnDivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnDivision.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnDivision.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnDivision.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnDivision.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnDivision.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnDivision.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDivisionActionPerformed(evt);
            }
        });

        BtnPotenY.setBackground(new java.awt.Color(204, 204, 204));
        BtnPotenY.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnPotenY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnPotenY.setText("x^y");
        BtnPotenY.setBorder(null);
        BtnPotenY.setFocusPainted(false);
        BtnPotenY.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnPotenY.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnPotenY.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnPotenY.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnPotenY.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnPotenY.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnPotenY.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnPotenY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPotenYActionPerformed(evt);
            }
        });

        BtnNueve.setBackground(new java.awt.Color(176, 176, 176));
        BtnNueve.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnNueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnNueve.setText("9");
        BtnNueve.setBorder(null);
        BtnNueve.setFocusPainted(false);
        BtnNueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnNueve.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnNueve.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnNueve.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnNueve.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnNueve.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnNueve.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_2.png"))); // NOI18N
        BtnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNueveActionPerformed(evt);
            }
        });

        BtnMulti.setBackground(new java.awt.Color(204, 204, 204));
        BtnMulti.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnMulti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnMulti.setText("x");
        BtnMulti.setBorder(null);
        BtnMulti.setFocusPainted(false);
        BtnMulti.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnMulti.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnMulti.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnMulti.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnMulti.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnMulti.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnMulti.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiActionPerformed(evt);
            }
        });

        BtnSiete.setBackground(new java.awt.Color(176, 176, 176));
        BtnSiete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnSiete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnSiete.setText("7");
        BtnSiete.setBorder(null);
        BtnSiete.setFocusPainted(false);
        BtnSiete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSiete.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnSiete.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnSiete.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnSiete.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnSiete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnSiete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_2.png"))); // NOI18N
        BtnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSieteActionPerformed(evt);
            }
        });

        BtnOcho.setBackground(new java.awt.Color(176, 176, 176));
        BtnOcho.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnOcho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnOcho.setText("8");
        BtnOcho.setBorder(null);
        BtnOcho.setFocusPainted(false);
        BtnOcho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnOcho.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnOcho.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnOcho.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnOcho.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnOcho.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnOcho.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_2.png"))); // NOI18N
        BtnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOchoActionPerformed(evt);
            }
        });

        BtnDiezX.setBackground(new java.awt.Color(204, 204, 204));
        BtnDiezX.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnDiezX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnDiezX.setText("10^x");
        BtnDiezX.setBorder(null);
        BtnDiezX.setFocusPainted(false);
        BtnDiezX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnDiezX.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnDiezX.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnDiezX.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnDiezX.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnDiezX.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnDiezX.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnDiezX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDiezXActionPerformed(evt);
            }
        });

        BtnSeis.setBackground(new java.awt.Color(176, 176, 176));
        BtnSeis.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnSeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnSeis.setText("6");
        BtnSeis.setBorder(null);
        BtnSeis.setFocusPainted(false);
        BtnSeis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSeis.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnSeis.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnSeis.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnSeis.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnSeis.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnSeis.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_2.png"))); // NOI18N
        BtnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeisActionPerformed(evt);
            }
        });

        BtnResta.setBackground(new java.awt.Color(204, 204, 204));
        BtnResta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnResta.setText("-");
        BtnResta.setBorder(null);
        BtnResta.setFocusPainted(false);
        BtnResta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnResta.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnResta.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnResta.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnResta.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnResta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnResta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRestaActionPerformed(evt);
            }
        });

        BtnCuatro.setBackground(new java.awt.Color(176, 176, 176));
        BtnCuatro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnCuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnCuatro.setText("4");
        BtnCuatro.setBorder(null);
        BtnCuatro.setFocusPainted(false);
        BtnCuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCuatro.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnCuatro.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnCuatro.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnCuatro.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnCuatro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnCuatro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_2.png"))); // NOI18N
        BtnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCuatroActionPerformed(evt);
            }
        });

        BtnCinco.setBackground(new java.awt.Color(176, 176, 176));
        BtnCinco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnCinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnCinco.setText("5");
        BtnCinco.setBorder(null);
        BtnCinco.setFocusPainted(false);
        BtnCinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCinco.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnCinco.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnCinco.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnCinco.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnCinco.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_1.png"))); // NOI18N
        BtnCinco.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_claro_2.png"))); // NOI18N
        BtnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCincoActionPerformed(evt);
            }
        });

        BtnRaizCuad.setBackground(new java.awt.Color(204, 204, 204));
        BtnRaizCuad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnRaizCuad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnRaizCuad.setText("√x");
        BtnRaizCuad.setBorder(null);
        BtnRaizCuad.setFocusPainted(false);
        BtnRaizCuad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRaizCuad.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnRaizCuad.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnRaizCuad.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnRaizCuad.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnRaizCuad.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnRaizCuad.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnRaizCuad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRaizCuadActionPerformed(evt);
            }
        });

        BtnAbsoluto.setBackground(new java.awt.Color(204, 204, 204));
        BtnAbsoluto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnAbsoluto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnAbsoluto.setText("|x|");
        BtnAbsoluto.setBorder(null);
        BtnAbsoluto.setFocusPainted(false);
        BtnAbsoluto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAbsoluto.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnAbsoluto.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnAbsoluto.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnAbsoluto.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnAbsoluto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnAbsoluto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnAbsoluto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAbsolutoActionPerformed(evt);
            }
        });

        BtnReciproco.setBackground(new java.awt.Color(204, 204, 204));
        BtnReciproco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnReciproco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnReciproco.setText("1/x");
        BtnReciproco.setBorder(null);
        BtnReciproco.setFocusPainted(false);
        BtnReciproco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnReciproco.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnReciproco.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnReciproco.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnReciproco.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnReciproco.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnReciproco.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnReciproco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReciprocoActionPerformed(evt);
            }
        });

        BtnMod.setBackground(new java.awt.Color(204, 204, 204));
        BtnMod.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnMod.setText("mod");
        BtnMod.setBorder(null);
        BtnMod.setFocusPainted(false);
        BtnMod.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnMod.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnMod.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnMod.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnMod.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnMod.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnMod.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModActionPerformed(evt);
            }
        });

        BtnExp.setBackground(new java.awt.Color(204, 204, 204));
        BtnExp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnExp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnExp.setText("exp");
        BtnExp.setBorder(null);
        BtnExp.setFocusPainted(false);
        BtnExp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnExp.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnExp.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnExp.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnExp.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnExp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnExp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExpActionPerformed(evt);
            }
        });

        BtnE.setBackground(new java.awt.Color(204, 204, 204));
        BtnE.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnE.setText("e");
        BtnE.setBorder(null);
        BtnE.setFocusPainted(false);
        BtnE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnE.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnE.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnE.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnE.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEActionPerformed(evt);
            }
        });

        BtnPi.setBackground(new java.awt.Color(204, 204, 204));
        BtnPi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnPi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnPi.setText("π");
        BtnPi.setBorder(null);
        BtnPi.setFocusPainted(false);
        BtnPi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnPi.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnPi.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnPi.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnPi.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnPi.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnPi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPiActionPerformed(evt);
            }
        });

        BtnBorrar.setBackground(new java.awt.Color(204, 204, 204));
        BtnBorrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnBorrar.setForeground(new java.awt.Color(255, 0, 0));
        BtnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnBorrar.setText("←");
        BtnBorrar.setBorder(null);
        BtnBorrar.setFocusPainted(false);
        BtnBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnBorrar.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnBorrar.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnBorrar.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnBorrar.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnBorrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnBorrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarActionPerformed(evt);
            }
        });

        BtnC.setBackground(new java.awt.Color(204, 204, 204));
        BtnC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnC.setForeground(new java.awt.Color(255, 0, 0));
        BtnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnC.setText("C");
        BtnC.setBorder(null);
        BtnC.setFocusPainted(false);
        BtnC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnC.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnC.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnC.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnC.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCActionPerformed(evt);
            }
        });

        BtnSec.setBackground(new java.awt.Color(204, 204, 204));
        BtnSec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnSec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnSec.setText("sec");
        BtnSec.setBorder(null);
        BtnSec.setFocusPainted(false);
        BtnSec.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSec.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnSec.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnSec.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnSec.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnSec.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnSec.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSecActionPerformed(evt);
            }
        });

        BtnTan.setBackground(new java.awt.Color(204, 204, 204));
        BtnTan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnTan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnTan.setText("tan");
        BtnTan.setBorder(null);
        BtnTan.setFocusPainted(false);
        BtnTan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnTan.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnTan.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnTan.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnTan.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnTan.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnTan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTanActionPerformed(evt);
            }
        });

        BtnCuadrado.setBackground(new java.awt.Color(204, 204, 204));
        BtnCuadrado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnCuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnCuadrado.setText("x²");
        BtnCuadrado.setBorder(null);
        BtnCuadrado.setFocusPainted(false);
        BtnCuadrado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCuadrado.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnCuadrado.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnCuadrado.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnCuadrado.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnCuadrado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnCuadrado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCuadradoActionPerformed(evt);
            }
        });

        BtnCE.setBackground(new java.awt.Color(204, 204, 204));
        BtnCE.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnCE.setForeground(new java.awt.Color(255, 0, 0));
        BtnCE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnCE.setText("CE");
        BtnCE.setBorder(null);
        BtnCE.setFocusPainted(false);
        BtnCE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCE.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnCE.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnCE.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnCE.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnCE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnCE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCEActionPerformed(evt);
            }
        });

        Tbn2nd.setBackground(new java.awt.Color(204, 204, 204));
        Tbn2nd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Tbn2nd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_oscuro_21.png"))); // NOI18N
        Tbn2nd.setText("2nd");
        Tbn2nd.setBorder(null);
        Tbn2nd.setFocusPainted(false);
        Tbn2nd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tbn2nd.setMargin(new java.awt.Insets(2, 8, 2, 8));
        Tbn2nd.setMaximumSize(new java.awt.Dimension(40, 40));
        Tbn2nd.setMinimumSize(new java.awt.Dimension(40, 40));
        Tbn2nd.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_oscuro_22.png"))); // NOI18N
        Tbn2nd.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_oscuro_21.png"))); // NOI18N
        Tbn2nd.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_oscuro_22.png"))); // NOI18N
        Tbn2nd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tbn2ndActionPerformed(evt);
            }
        });

        BtnCsc.setBackground(new java.awt.Color(204, 204, 204));
        BtnCsc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnCsc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnCsc.setText("csc");
        BtnCsc.setBorder(null);
        BtnCsc.setFocusPainted(false);
        BtnCsc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCsc.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnCsc.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnCsc.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnCsc.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnCsc.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnCsc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnCsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCscActionPerformed(evt);
            }
        });

        BtnSin.setBackground(new java.awt.Color(204, 204, 204));
        BtnSin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnSin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnSin.setText("sin");
        BtnSin.setBorder(null);
        BtnSin.setFocusPainted(false);
        BtnSin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSin.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnSin.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnSin.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnSin.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnSin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnSin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSinActionPerformed(evt);
            }
        });

        BtnCot.setBackground(new java.awt.Color(204, 204, 204));
        BtnCot.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnCot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnCot.setText("cot");
        BtnCot.setBorder(null);
        BtnCot.setFocusPainted(false);
        BtnCot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCot.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnCot.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnCot.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnCot.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnCot.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnCot.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnCot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCotActionPerformed(evt);
            }
        });

        BtnCos.setBackground(new java.awt.Color(204, 204, 204));
        BtnCos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnCos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnCos.setText("cos");
        BtnCos.setBorder(null);
        BtnCos.setFocusPainted(false);
        BtnCos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCos.setMargin(new java.awt.Insets(2, 8, 2, 8));
        BtnCos.setMaximumSize(new java.awt.Dimension(40, 40));
        BtnCos.setMinimumSize(new java.awt.Dimension(40, 40));
        BtnCos.setPreferredSize(new java.awt.Dimension(40, 40));
        BtnCos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_1.png"))); // NOI18N
        BtnCos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_medio_2.png"))); // NOI18N
        BtnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(235, Short.MAX_VALUE)
                .addComponent(BtnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TxtPreviu, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Tbn2nd, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BtnE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(BtnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(BtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(BtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(BtnCot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(BtnDiezX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(BtnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(BtnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(BtnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BtnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(BtnSec, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(BtnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(BtnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(BtnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BtnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(BtnCsc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnLn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BtnNegativo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BtnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(56, 56, 56)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BtnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BtnSin, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(BtnCos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BtnRaizCuad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BtnPotenY, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(BtnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(BtnReciproco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BtnFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BtnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(BtnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(BtnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(BtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(BtnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BtnCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BtnAbsoluto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BtnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BtnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(415, Short.MAX_VALUE)
                .addComponent(BtnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtPreviu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)
                    .addComponent(TxtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tbn2nd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(BtnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BtnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BtnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnAbsoluto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(BtnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(BtnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BtnRaizCuad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnReciproco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addComponent(BtnPotenY, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BtnFactorial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addComponent(BtnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BtnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BtnCot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnDiezX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BtnSec, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BtnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BtnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnNegativo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnLn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnCsc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(BtnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTON NUMERO 0
    private void BtnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCeroActionPerformed
        if(ObjCal.PEstaLimpioGet())
        {
            TxtNum.setText("0");
            ObjCal.PEstaLimpioSet(false);
        }
        else
        {
            if(TxtNum.getText().contains("0.") || Double.parseDouble(TxtNum.getText()) > 0)
                TxtNum.setText(TxtNum.getText() + "0");
        }
    }//GEN-LAST:event_BtnCeroActionPerformed

    //BOTON NEGATIVO
    private void BtnNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNegativoActionPerformed
        ObjCal.PUnicoSet(Double.parseDouble(TxtNum.getText()));
        
        ObjCal.POperacionSet("negativo");
        ObjCal.PCalculaOperaciones();

        TxtNum.setText(ObjCal.PResultadoGet() + "");
    }//GEN-LAST:event_BtnNegativoActionPerformed

    ///BOTON IGUAL
    private void BtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIgualActionPerformed
        ObjCal.PNumero2Set(Double.parseDouble(TxtNum.getText()));
        
        operacion += TxtNum.getText();
        TxtPreviu.setText(operacion);
        
        ObjCal.setFormula(operacion);
        ObjCal.PCalculaOperaciones();
        
        ObjCal.PEstaLimpioSet(true);
        TxtNum.setText(ObjCal.PResultadoGet() + "");
    }//GEN-LAST:event_BtnIgualActionPerformed

    //BOTON PUNTO DECIMAL
    private void BtnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPuntoActionPerformed
        if(!TxtNum.getText().contains("."))
        {
            TxtNum.setText(TxtNum.getText() + ".");
            ObjCal.PEstaLimpioSet(false);
        }
    }//GEN-LAST:event_BtnPuntoActionPerformed

    //BOTON LN
    private void BtnLnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLnActionPerformed
        if(!Tbn2nd.isSelected())
        {
            ObjCal.PUnicoSet(Double.parseDouble(TxtNum.getText()));
            TxtPreviu.setText("ln(" + ObjCal.PUnicoGet() + ")");

            ObjCal.POperacionSet("ln");
            ObjCal.PCalculaOperaciones();

            TxtNum.setText(ObjCal.PResultadoGet() + "");
        }        
        else
        {
            ObjCal.PUnicoSet(Double.parseDouble(TxtNum.getText()));
            TxtPreviu.setText("e^" + ObjCal.PUnicoGet());

            ObjCal.POperacionSet("epotenciax");
            ObjCal.PCalculaOperaciones();

            TxtNum.setText(ObjCal.PResultadoGet() + "");
        }
    }//GEN-LAST:event_BtnLnActionPerformed

    //BOTON NUMERO 2
    private void BtnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDosActionPerformed
        if(ObjCal.PEstaLimpioGet())
        {
            TxtNum.setText("2");
            ObjCal.PEstaLimpioSet(false);
        }
        else
        {
            TxtNum.setText(TxtNum.getText() + "2");
        }
    }//GEN-LAST:event_BtnDosActionPerformed

    //BOTON NUMERO 1
    private void BtnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUnoActionPerformed
        if(ObjCal.PEstaLimpioGet())
        {
            TxtNum.setText("1");
            ObjCal.PEstaLimpioSet(false);
        }
        else
        {
            TxtNum.setText(TxtNum.getText() + "1");
        }
    }//GEN-LAST:event_BtnUnoActionPerformed

    //BOTON SUMA
    private void BtnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSumaActionPerformed
        operacion += TxtNum.getText() + "+";
        
        TxtPreviu.setText(operacion);
        TxtNum.setText("");
        
        ObjCal.PEstaLimpioSet(true);
        ObjCal.POperacionSet("suma");
    }//GEN-LAST:event_BtnSumaActionPerformed

    //BOTON NUMERO 3
    private void BtnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTresActionPerformed
        if(ObjCal.PEstaLimpioGet())
        {
            TxtNum.setText("3");
            ObjCal.PEstaLimpioSet(false);
        }
        else
        {
            TxtNum.setText(TxtNum.getText() + "3");
        }
    }//GEN-LAST:event_BtnTresActionPerformed

    //BOTON LOG
    private void BtnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogActionPerformed
        if(!Tbn2nd.isSelected())
        {
            ObjCal.PUnicoSet(Double.parseDouble(TxtNum.getText()));
            TxtPreviu.setText("log(" + ObjCal.PUnicoGet() + ")");

            ObjCal.POperacionSet("log");
            ObjCal.PCalculaOperaciones();

            TxtNum.setText(ObjCal.PResultadoGet() + "");
        }        
        else
        {
            ObjCal.PNumero1Set(Double.parseDouble(TxtNum.getText()));
            TxtPreviu.setText(ObjCal.PNumero1Get() + " log base ");

            ObjCal.PEstaLimpioSet(true);
            ObjCal.POperacionSet("logbasey");
        }
    }//GEN-LAST:event_BtnLogActionPerformed

    //BOTON NUMERO 5
    private void BtnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCincoActionPerformed
        if(ObjCal.PEstaLimpioGet())
        {
            TxtNum.setText("5");
            ObjCal.PEstaLimpioSet(false);
        }
        else
        {
            TxtNum.setText(TxtNum.getText() + "5");
        }
    }//GEN-LAST:event_BtnCincoActionPerformed

    //BOTON NUMERO 4
    private void BtnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCuatroActionPerformed
        if(ObjCal.PEstaLimpioGet())
        {
            TxtNum.setText("4");
            ObjCal.PEstaLimpioSet(false);
        }
        else
        {
            TxtNum.setText(TxtNum.getText() + "4");
        }
    }//GEN-LAST:event_BtnCuatroActionPerformed

    //BOTON RESTA
    private void BtnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRestaActionPerformed
        operacion += TxtNum.getText() + "-";
        
        TxtPreviu.setText(operacion);
        TxtNum.setText("");
        
        ObjCal.PEstaLimpioSet(true);
        ObjCal.POperacionSet("resta");
    }//GEN-LAST:event_BtnRestaActionPerformed

    //BOTON NUMERO 6
    private void BtnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeisActionPerformed
        if(ObjCal.PEstaLimpioGet())
        {
            TxtNum.setText("6");
            ObjCal.PEstaLimpioSet(false);
        }
        else
        {
            TxtNum.setText(TxtNum.getText() + "6");
        }
    }//GEN-LAST:event_BtnSeisActionPerformed
    
    //BOTON 10 A LA POTENCIA X
    private void BtnDiezXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDiezXActionPerformed
        if(!Tbn2nd.isSelected())
        {
            ObjCal.PUnicoSet(Double.parseDouble(TxtNum.getText()));
            TxtPreviu.setText("10^" + ObjCal.PUnicoGet());

            ObjCal.POperacionSet("diezpotenciax");
            ObjCal.PCalculaOperaciones();

            TxtNum.setText(ObjCal.PResultadoGet() + "");
        }        
        else
        {
            ObjCal.PUnicoSet(Double.parseDouble(TxtNum.getText()));
        
            TxtPreviu.setText("2^" + ObjCal.PUnicoGet());
            ObjCal.PEstaLimpioSet(true);

            ObjCal.POperacionSet("dospotenciax");
            ObjCal.PCalculaOperaciones();

            TxtNum.setText(ObjCal.PResultadoGet() + "");
        }
    }//GEN-LAST:event_BtnDiezXActionPerformed

    //BOTON NUMERO 8
    private void BtnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOchoActionPerformed
        if(ObjCal.PEstaLimpioGet())
        {
            TxtNum.setText("8");
            ObjCal.PEstaLimpioSet(false);
        }
        else
        {
            TxtNum.setText(TxtNum.getText() + "8");
        }
    }//GEN-LAST:event_BtnOchoActionPerformed
    
    //BOTON NUMERO 7
    private void BtnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSieteActionPerformed
        if(ObjCal.PEstaLimpioGet())
        {
            TxtNum.setText("7");
            ObjCal.PEstaLimpioSet(false);
        }
        else
        {
            TxtNum.setText(TxtNum.getText() + "7");
        }
    }//GEN-LAST:event_BtnSieteActionPerformed

    //BOTON MULTIPLICACION
    private void BtnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultiActionPerformed
        operacion += TxtNum.getText() + "*";
        
        TxtPreviu.setText(operacion);
        TxtNum.setText("");
        
        ObjCal.PEstaLimpioSet(true);
        ObjCal.POperacionSet("multiplicacion");
    }//GEN-LAST:event_BtnMultiActionPerformed

    //BOTON NUMERO 9
    private void BtnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNueveActionPerformed
        if(ObjCal.PEstaLimpioGet())
        {
            TxtNum.setText("9");
            ObjCal.PEstaLimpioSet(false);
        }
        else
        {
            TxtNum.setText(TxtNum.getText() + "9");
        }
    }//GEN-LAST:event_BtnNueveActionPerformed

    //BOTON POTENCIA A NUMERO Y
    private void BtnPotenYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPotenYActionPerformed
        if(!Tbn2nd.isSelected())
        {
            ObjCal.PNumero1Set(Double.parseDouble(TxtNum.getText()));
            TxtPreviu.setText(ObjCal.PNumero1Get() + "^");

            ObjCal.PEstaLimpioSet(true);
            ObjCal.POperacionSet("potencia");
        }        
        else
        {
            ObjCal.PNumero1Set(Double.parseDouble(TxtNum.getText()));
            TxtPreviu.setText(ObjCal.PNumero1Get() + " yroot ");

            ObjCal.PEstaLimpioSet(true);
            ObjCal.POperacionSet("raizy");
        }
    }//GEN-LAST:event_BtnPotenYActionPerformed

    //BOTON DIVISION
    private void BtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDivisionActionPerformed
        operacion += TxtNum.getText() + "/";
        
        TxtPreviu.setText(operacion);
        TxtNum.setText("");
        
        ObjCal.PEstaLimpioSet(true);
        ObjCal.POperacionSet("division");
    }//GEN-LAST:event_BtnDivisionActionPerformed

    //BOTON FACTORIAL
    private void BtnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFactorialActionPerformed
        ObjCal.PUnicoSet(Double.parseDouble(TxtNum.getText()));
        TxtPreviu.setText(ObjCal.PUnicoGet() + "!");
        
        ObjCal.POperacionSet("factorial");
        ObjCal.PCalculaOperaciones();

        TxtNum.setText(ObjCal.PResultadoGet() + "");
    }//GEN-LAST:event_BtnFactorialActionPerformed

    //BOTON RAIZ CUADRADA
    private void BtnRaizCuadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRaizCuadActionPerformed
        if(!Tbn2nd.isSelected())
        {
            ObjCal.PUnicoSet(Double.parseDouble(TxtNum.getText()));
        
            if(ObjCal.PUnicoGet() >= 0)
            {
                TxtPreviu.setText("√" + ObjCal.PUnicoGet());
                ObjCal.PEstaLimpioSet(true);

                ObjCal.POperacionSet("raiz");
                ObjCal.PCalculaOperaciones();

                TxtNum.setText(ObjCal.PResultadoGet() + "");
            }
            else
            {
                TxtNum.setText("Entrada no válida");
            }
        }        
        else
        {
            ObjCal.PUnicoSet(Double.parseDouble(TxtNum.getText()));
            TxtPreviu.setText("cuberoot(" + ObjCal.PUnicoGet() + ")");
            ObjCal.PEstaLimpioSet(true);

            ObjCal.POperacionSet("raizcubica");
            ObjCal.PCalculaOperaciones();

            TxtNum.setText(ObjCal.PResultadoGet() + "");
        }
    }//GEN-LAST:event_BtnRaizCuadActionPerformed

    //BOTON ABSOLUTO
    private void BtnAbsolutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAbsolutoActionPerformed
        ObjCal.PUnicoSet(Double.parseDouble(TxtNum.getText()));
        TxtPreviu.setText("abs(" + ObjCal.PUnicoGet() + ")");
        
        ObjCal.POperacionSet("absoluto");
        ObjCal.PCalculaOperaciones();

        TxtNum.setText(ObjCal.PResultadoGet() + "");
    }//GEN-LAST:event_BtnAbsolutoActionPerformed

    //BOTON RECIPROCO
    private void BtnReciprocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReciprocoActionPerformed
        ObjCal.PUnicoSet(Double.parseDouble(TxtNum.getText()));
        TxtPreviu.setText("1/" + ObjCal.PUnicoGet());
        
        ObjCal.POperacionSet("reciproco");
        ObjCal.PCalculaOperaciones();

        TxtNum.setText(ObjCal.PResultadoGet() + "");
    }//GEN-LAST:event_BtnReciprocoActionPerformed

    //BOTON MOD
    private void BtnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModActionPerformed
        ObjCal.PNumero1Set(Double.parseDouble(TxtNum.getText()));
        TxtPreviu.setText(ObjCal.PNumero1Get() + " mod ");
        
        ObjCal.PEstaLimpioSet(true);
        ObjCal.POperacionSet("modulo");
    }//GEN-LAST:event_BtnModActionPerformed

    //BOTON EXPONENCIACION NEPERIANA
    private void BtnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExpActionPerformed
        ObjCal.PUnicoSet(Double.parseDouble(TxtNum.getText()));

        ObjCal.POperacionSet("exp");
        ObjCal.PCalculaOperaciones();

        TxtNum.setText(ObjCal.PResultadoGet() + "");
    }//GEN-LAST:event_BtnExpActionPerformed

    //BOTON POTENCIA A LA 2
    private void BtnCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCuadradoActionPerformed
        if(!Tbn2nd.isSelected())
        {
            ObjCal.PUnicoSet(Double.parseDouble(TxtNum.getText()));
        
            TxtPreviu.setText(ObjCal.PUnicoGet() + "^2");
            ObjCal.PEstaLimpioSet(true);

            ObjCal.POperacionSet("cuadrado");
            ObjCal.PCalculaOperaciones();

            TxtNum.setText(ObjCal.PResultadoGet() + "");
        }        
        else
        {
            ObjCal.PUnicoSet(Double.parseDouble(TxtNum.getText()));
        
            TxtPreviu.setText(ObjCal.PUnicoGet() + "^3");
            ObjCal.PEstaLimpioSet(true);

            ObjCal.POperacionSet("cubo");
            ObjCal.PCalculaOperaciones();

            TxtNum.setText(ObjCal.PResultadoGet() + "");
        }
    }//GEN-LAST:event_BtnCuadradoActionPerformed

    //BOTON E
    private void BtnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEActionPerformed
        ObjCal.POperacionSet("e");
        ObjCal.PCalculaOperaciones();
        
        TxtNum.setText(ObjCal.PResultadoGet() + "");
    }//GEN-LAST:event_BtnEActionPerformed

    //BOTON PI
    private void BtnPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPiActionPerformed
        ObjCal.POperacionSet("pi");
        ObjCal.PCalculaOperaciones();
        
        TxtNum.setText(ObjCal.PResultadoGet() + "");
    }//GEN-LAST:event_BtnPiActionPerformed

    //BOTON BORRAR
    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
        if(TxtNum.getText().length() > 0)
        {
            TxtNum.setText(TxtNum.getText().substring(0, TxtNum.getText().length() - 1));
            
            if(TxtNum.getText().length() == 0)
            {
                TxtNum.setText("0");
                ObjCal.PEstaLimpioSet(true);
            }
        }
    }//GEN-LAST:event_BtnBorrarActionPerformed

    //BOTON C
    private void BtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCActionPerformed
        TxtNum.setText("0");
        TxtPreviu.setText("");
        ObjCal.PEstaLimpioSet(true);
        ObjCal.POperacionSet(null);
        ObjCal.PNumero1Set(0);
        ObjCal.PNumero2Set(0);
        ObjCal.PUnicoSet(0);
        ObjCal.PResultadoSet(0);
        
        operacion = "";
    }//GEN-LAST:event_BtnCActionPerformed

    //BOTON SECANTE
    private void BtnSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSecActionPerformed
        ObjCal.PUnicoSet(Double.parseDouble(TxtNum.getText()));
        TxtPreviu.setText("sec(" + ObjCal.PUnicoGet() + ")");
        
        ObjCal.POperacionSet("secante");
        ObjCal.PCalculaOperaciones();

        TxtNum.setText(ObjCal.PResultadoGet() + "");
    }//GEN-LAST:event_BtnSecActionPerformed

    //BOTON TANGENTE
    private void BtnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTanActionPerformed
        ObjCal.PUnicoSet(Double.parseDouble(TxtNum.getText()));
        TxtPreviu.setText("tan(" + ObjCal.PUnicoGet() + ")");
        
        ObjCal.POperacionSet("tangente");
        ObjCal.PCalculaOperaciones();

        TxtNum.setText(ObjCal.PResultadoGet() + "");
    }//GEN-LAST:event_BtnTanActionPerformed

    //BOTON COSENO
    private void BtnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCosActionPerformed
        ObjCal.PUnicoSet(Double.parseDouble(TxtNum.getText()));
        TxtPreviu.setText("cos(" + ObjCal.PUnicoGet() + ")");
        
        ObjCal.POperacionSet("coseno");
        ObjCal.PCalculaOperaciones();

        TxtNum.setText(ObjCal.PResultadoGet() + "");
    }//GEN-LAST:event_BtnCosActionPerformed
    
    //BOTON COTANGENTE
    private void BtnCotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCotActionPerformed
        ObjCal.PUnicoSet(Double.parseDouble(TxtNum.getText()));
        TxtPreviu.setText("cot(" + ObjCal.PUnicoGet() + ")");
        
        ObjCal.POperacionSet("cotangente");
        ObjCal.PCalculaOperaciones();

        TxtNum.setText(ObjCal.PResultadoGet() + "");
    }//GEN-LAST:event_BtnCotActionPerformed

    //BOTON SENO
    private void BtnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSinActionPerformed
        ObjCal.PUnicoSet(Double.parseDouble(TxtNum.getText()));
        TxtPreviu.setText("sin(" + ObjCal.PUnicoGet() + ")");
        
        ObjCal.POperacionSet("seno");
        ObjCal.PCalculaOperaciones();

        TxtNum.setText(ObjCal.PResultadoGet() + "");
    }//GEN-LAST:event_BtnSinActionPerformed

    //BOTON COSECANTE
    private void BtnCscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCscActionPerformed
        ObjCal.PUnicoSet(Double.parseDouble(TxtNum.getText()));
        TxtPreviu.setText("csc(" + ObjCal.PUnicoGet() + ")");
        
        ObjCal.POperacionSet("cosecante");
        ObjCal.PCalculaOperaciones();

        TxtNum.setText(ObjCal.PResultadoGet() + "");
    }//GEN-LAST:event_BtnCscActionPerformed

    //BOTON CE
    private void BtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCEActionPerformed
        TxtNum.setText("0");
        ObjCal.PEstaLimpioSet(true);
    }//GEN-LAST:event_BtnCEActionPerformed

    private void Tbn2ndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tbn2ndActionPerformed
        if(!Tbn2nd.isSelected())
        {
            BtnCuadrado.setText("x²");
            BtnRaizCuad.setText("√x");
            BtnPotenY.setText("x^y");
            BtnDiezX.setText("10^x");
            BtnLog.setText("log");
            BtnLn.setText("ln");
        }        
        else
        {
            BtnCuadrado.setText("x³");
            BtnRaizCuad.setText("3√x");
            BtnPotenY.setText("y√x");
            BtnDiezX.setText("2^x");
            BtnLog.setText("logyx");
            BtnLn.setText("e^x");
        }
    }//GEN-LAST:event_Tbn2ndActionPerformed


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
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAbsoluto;
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton BtnC;
    private javax.swing.JButton BtnCE;
    private javax.swing.JButton BtnCero;
    private javax.swing.JButton BtnCinco;
    private javax.swing.JButton BtnCos;
    private javax.swing.JButton BtnCot;
    private javax.swing.JButton BtnCsc;
    private javax.swing.JButton BtnCuadrado;
    private javax.swing.JButton BtnCuatro;
    private javax.swing.JButton BtnDiezX;
    private javax.swing.JButton BtnDivision;
    private javax.swing.JButton BtnDos;
    private javax.swing.JButton BtnE;
    private javax.swing.JButton BtnExp;
    private javax.swing.JButton BtnFactorial;
    private javax.swing.JButton BtnIgual;
    private javax.swing.JButton BtnLn;
    private javax.swing.JButton BtnLog;
    private javax.swing.JButton BtnMod;
    private javax.swing.JButton BtnMulti;
    private javax.swing.JButton BtnNegativo;
    private javax.swing.JButton BtnNueve;
    private javax.swing.JButton BtnOcho;
    private javax.swing.JButton BtnPi;
    private javax.swing.JButton BtnPotenY;
    private javax.swing.JButton BtnPunto;
    private javax.swing.JButton BtnRaizCuad;
    private javax.swing.JButton BtnReciproco;
    private javax.swing.JButton BtnResta;
    private javax.swing.JButton BtnSec;
    private javax.swing.JButton BtnSeis;
    private javax.swing.JButton BtnSiete;
    private javax.swing.JButton BtnSin;
    private javax.swing.JButton BtnSuma;
    private javax.swing.JButton BtnTan;
    private javax.swing.JButton BtnTres;
    private javax.swing.JButton BtnUno;
    private javax.swing.JToggleButton Tbn2nd;
    private javax.swing.JTextField TxtNum;
    private javax.swing.JTextField TxtPreviu;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
