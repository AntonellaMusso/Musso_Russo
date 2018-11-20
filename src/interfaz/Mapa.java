
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.Date;
import javax.swing.JOptionPane;
import mascota.Actividad;
import mascota.Familiar;
import mascota.Mascota;
import mascota.Sistema;

/**
 *
 * @author usuario
 */
public class Mapa extends javax.swing.JFrame {

    static private Sistema sistema;
    Actividad act;
    boolean cord[][] = new boolean[6][6]; // en realidad de 5 y 5

    public Mapa(Sistema modelo,Actividad actividad) {
        initComponents();
        sistema = modelo;
        desactivarCalles();
        act = actividad;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        guardarBoton = new javax.swing.JButton();
        p33 = new javax.swing.JRadioButton();
        p32 = new javax.swing.JRadioButton();
        p23 = new javax.swing.JRadioButton();
        p22 = new javax.swing.JRadioButton();
        p42 = new javax.swing.JRadioButton();
        p43 = new javax.swing.JRadioButton();
        p40 = new javax.swing.JRadioButton();
        p41 = new javax.swing.JRadioButton();
        p20 = new javax.swing.JRadioButton();
        p21 = new javax.swing.JRadioButton();
        p30 = new javax.swing.JRadioButton();
        p31 = new javax.swing.JRadioButton();
        p01 = new javax.swing.JRadioButton();
        p00 = new javax.swing.JRadioButton();
        p02 = new javax.swing.JRadioButton();
        p03 = new javax.swing.JRadioButton();
        p13 = new javax.swing.JRadioButton();
        p12 = new javax.swing.JRadioButton();
        p10 = new javax.swing.JRadioButton();
        p11 = new javax.swing.JRadioButton();
        p44 = new javax.swing.JRadioButton();
        p34 = new javax.swing.JRadioButton();
        p24 = new javax.swing.JRadioButton();
        p14 = new javax.swing.JRadioButton();
        p04 = new javax.swing.JRadioButton();
        c0001 = new javax.swing.JButton();
        c1011 = new javax.swing.JButton();
        c2021 = new javax.swing.JButton();
        c3031 = new javax.swing.JButton();
        c4041 = new javax.swing.JButton();
        c0102 = new javax.swing.JButton();
        c1112 = new javax.swing.JButton();
        c2122 = new javax.swing.JButton();
        c3132 = new javax.swing.JButton();
        c4142 = new javax.swing.JButton();
        c0304 = new javax.swing.JButton();
        c3334 = new javax.swing.JButton();
        c1314 = new javax.swing.JButton();
        c2324 = new javax.swing.JButton();
        c4344 = new javax.swing.JButton();
        c0203 = new javax.swing.JButton();
        c1213 = new javax.swing.JButton();
        c2223 = new javax.swing.JButton();
        c3233 = new javax.swing.JButton();
        c4243 = new javax.swing.JButton();
        c0010 = new javax.swing.JButton();
        c1020 = new javax.swing.JButton();
        c2030 = new javax.swing.JButton();
        c3040 = new javax.swing.JButton();
        c0111 = new javax.swing.JButton();
        c1121 = new javax.swing.JButton();
        c2131 = new javax.swing.JButton();
        c3141 = new javax.swing.JButton();
        c0212 = new javax.swing.JButton();
        c1222 = new javax.swing.JButton();
        c2232 = new javax.swing.JButton();
        c3242 = new javax.swing.JButton();
        c0313 = new javax.swing.JButton();
        c1323 = new javax.swing.JButton();
        c2333 = new javax.swing.JButton();
        c3343 = new javax.swing.JButton();
        c3444 = new javax.swing.JButton();
        c0414 = new javax.swing.JButton();
        c2434 = new javax.swing.JButton();
        c1424 = new javax.swing.JButton();
        ImagenDeFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(null);

        guardarBoton.setBackground(new java.awt.Color(0, 102, 102));
        guardarBoton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        guardarBoton.setForeground(new java.awt.Color(255, 255, 255));
        guardarBoton.setText("Guardar");
        guardarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(guardarBoton)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(426, Short.MAX_VALUE)
                .addComponent(guardarBoton)
                .addGap(29, 29, 29))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(580, 0, 140, 480);

        p33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p33ActionPerformed(evt);
            }
        });
        jPanel1.add(p33);
        p33.setBounds(420, 110, 20, 21);

        p32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p32ActionPerformed(evt);
            }
        });
        jPanel1.add(p32);
        p32.setBounds(280, 110, 20, 21);

        p23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p23ActionPerformed(evt);
            }
        });
        jPanel1.add(p23);
        p23.setBounds(420, 230, 20, 21);

        p22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p22ActionPerformed(evt);
            }
        });
        jPanel1.add(p22);
        p22.setBounds(280, 230, 20, 21);

        p42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p42ActionPerformed(evt);
            }
        });
        jPanel1.add(p42);
        p42.setBounds(280, 0, 20, 21);

        p43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p43ActionPerformed(evt);
            }
        });
        jPanel1.add(p43);
        p43.setBounds(420, 0, 20, 21);

        p40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p40ActionPerformed(evt);
            }
        });
        jPanel1.add(p40);
        p40.setBounds(0, 0, 20, 21);

        p41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p41ActionPerformed(evt);
            }
        });
        jPanel1.add(p41);
        p41.setBounds(140, 0, 20, 21);

        p20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p20ActionPerformed(evt);
            }
        });
        jPanel1.add(p20);
        p20.setBounds(0, 230, 20, 21);

        p21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p21ActionPerformed(evt);
            }
        });
        jPanel1.add(p21);
        p21.setBounds(140, 230, 20, 21);

        p30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p30ActionPerformed(evt);
            }
        });
        jPanel1.add(p30);
        p30.setBounds(0, 110, 20, 21);

        p31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p31ActionPerformed(evt);
            }
        });
        jPanel1.add(p31);
        p31.setBounds(140, 110, 20, 21);

        p01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p01ActionPerformed(evt);
            }
        });
        jPanel1.add(p01);
        p01.setBounds(140, 460, 20, 21);

        p00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p00ActionPerformed(evt);
            }
        });
        jPanel1.add(p00);
        p00.setBounds(0, 460, 20, 21);

        p02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p02ActionPerformed(evt);
            }
        });
        jPanel1.add(p02);
        p02.setBounds(280, 460, 20, 21);

        p03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p03ActionPerformed(evt);
            }
        });
        jPanel1.add(p03);
        p03.setBounds(420, 460, 20, 21);

        p13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p13ActionPerformed(evt);
            }
        });
        jPanel1.add(p13);
        p13.setBounds(420, 340, 20, 21);

        p12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p12ActionPerformed(evt);
            }
        });
        jPanel1.add(p12);
        p12.setBounds(280, 340, 20, 21);

        p10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p10ActionPerformed(evt);
            }
        });
        jPanel1.add(p10);
        p10.setBounds(0, 340, 20, 21);

        p11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p11ActionPerformed(evt);
            }
        });
        jPanel1.add(p11);
        p11.setBounds(140, 340, 20, 21);

        p44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p44ActionPerformed(evt);
            }
        });
        jPanel1.add(p44);
        p44.setBounds(560, 0, 20, 21);

        p34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p34ActionPerformed(evt);
            }
        });
        jPanel1.add(p34);
        p34.setBounds(560, 110, 20, 21);

        p24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p24ActionPerformed(evt);
            }
        });
        jPanel1.add(p24);
        p24.setBounds(560, 230, 20, 21);

        p14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p14ActionPerformed(evt);
            }
        });
        jPanel1.add(p14);
        p14.setBounds(560, 340, 20, 21);

        p04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p04ActionPerformed(evt);
            }
        });
        jPanel1.add(p04);
        p04.setBounds(560, 460, 20, 21);

        c0001.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(c0001);
        c0001.setBounds(30, 460, 100, 20);

        c1011.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(c1011);
        c1011.setBounds(30, 340, 100, 20);

        c2021.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(c2021);
        c2021.setBounds(30, 230, 100, 20);

        c3031.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(c3031);
        c3031.setBounds(30, 110, 100, 20);

        c4041.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(c4041);
        c4041.setBounds(30, 0, 100, 20);

        c0102.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(c0102);
        c0102.setBounds(170, 460, 100, 20);

        c1112.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(c1112);
        c1112.setBounds(170, 340, 100, 20);

        c2122.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(c2122);
        c2122.setBounds(170, 230, 100, 20);

        c3132.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(c3132);
        c3132.setBounds(170, 110, 100, 20);

        c4142.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(c4142);
        c4142.setBounds(170, 0, 100, 20);

        c0304.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(c0304);
        c0304.setBounds(450, 460, 100, 20);

        c3334.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(c3334);
        c3334.setBounds(450, 110, 100, 20);

        c1314.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(c1314);
        c1314.setBounds(450, 340, 100, 20);

        c2324.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(c2324);
        c2324.setBounds(450, 230, 100, 20);

        c4344.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(c4344);
        c4344.setBounds(450, 0, 100, 20);

        c0203.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(c0203);
        c0203.setBounds(310, 460, 100, 20);

        c1213.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(c1213);
        c1213.setBounds(310, 340, 100, 20);

        c2223.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(c2223);
        c2223.setBounds(310, 230, 100, 20);

        c3233.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(c3233);
        c3233.setBounds(310, 110, 100, 20);

        c4243.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(c4243);
        c4243.setBounds(310, 0, 100, 20);

        c0010.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(c0010);
        c0010.setBounds(0, 360, 20, 100);

        c1020.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(c1020);
        c1020.setBounds(0, 250, 20, 100);

        c2030.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(c2030);
        c2030.setBounds(0, 130, 20, 100);

        c3040.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(c3040);
        c3040.setBounds(0, 20, 20, 100);

        c0111.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(c0111);
        c0111.setBounds(140, 360, 20, 100);

        c1121.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(c1121);
        c1121.setBounds(140, 250, 20, 100);

        c2131.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(c2131);
        c2131.setBounds(140, 130, 20, 100);

        c3141.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(c3141);
        c3141.setBounds(140, 20, 20, 100);

        c0212.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(c0212);
        c0212.setBounds(280, 360, 20, 100);

        c1222.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(c1222);
        c1222.setBounds(280, 250, 20, 100);

        c2232.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(c2232);
        c2232.setBounds(280, 130, 20, 100);

        c3242.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(c3242);
        c3242.setBounds(280, 20, 20, 100);

        c0313.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(c0313);
        c0313.setBounds(420, 360, 20, 100);

        c1323.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(c1323);
        c1323.setBounds(420, 250, 20, 100);

        c2333.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(c2333);
        c2333.setBounds(420, 130, 20, 100);

        c3343.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(c3343);
        c3343.setBounds(420, 20, 20, 100);

        c3444.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(c3444);
        c3444.setBounds(560, 20, 20, 100);

        c0414.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(c0414);
        c0414.setBounds(560, 360, 20, 100);

        c2434.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(c2434);
        c2434.setBounds(560, 130, 20, 100);

        c1424.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(c1424);
        c1424.setBounds(560, 250, 20, 100);

        ImagenDeFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mapa.JPG"))); // NOI18N
        jPanel1.add(ImagenDeFondo);
        ImagenDeFondo.setBounds(0, 0, 950, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 719, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBotonActionPerformed
        //recorremos los 25 puntos
        String cordenadas = "";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (cord[i][j]){
                    cordenadas = cordenadas +" "+ i+j;
                }
            }
        }//termina el recorrido de la matriz
        Actividad actividad;
        Familiar f = act.getFamiliar();
        Mascota m = act.getMascota();
        String descrip = act.getDescripcion();
        Date fecha = act.getFecha();
        int distancia = act.getDistancia();
        String cor = cordenadas;
        actividad = new Actividad(f,m,descrip,fecha,distancia,cor);
        sistema.getListaActividades().add(actividad);
        JOptionPane.showMessageDialog(null, "Paseo registrado!");
        Calendario c = new Calendario(sistema);
        c.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_guardarBotonActionPerformed

    private void p00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p00ActionPerformed
       cord[0][0] = !cord[0][0];
    }//GEN-LAST:event_p00ActionPerformed

    private void p01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p01ActionPerformed
          cord[0][1] = !cord[0][1];
    }//GEN-LAST:event_p01ActionPerformed

    private void p02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p02ActionPerformed
         cord[0][2] = !cord[0][2];
    }//GEN-LAST:event_p02ActionPerformed

    private void p03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p03ActionPerformed
                cord[0][3] = !cord[0][3];
    }//GEN-LAST:event_p03ActionPerformed

    private void p04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p04ActionPerformed
            cord[0][4] = !cord[0][4];
    }//GEN-LAST:event_p04ActionPerformed

    private void p10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p10ActionPerformed
           cord[1][0] = !cord[1][0];
    }//GEN-LAST:event_p10ActionPerformed

    private void p11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p11ActionPerformed
            cord[1][1] = !cord[1][1];
    }//GEN-LAST:event_p11ActionPerformed

    private void p12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p12ActionPerformed
            cord[1][2] = !cord[1][2];
    }//GEN-LAST:event_p12ActionPerformed

    private void p13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p13ActionPerformed
          cord[1][3] = !cord[1][3];
    }//GEN-LAST:event_p13ActionPerformed

    private void p14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p14ActionPerformed
            cord[1][4] = !cord[1][4];
    }//GEN-LAST:event_p14ActionPerformed

    private void p20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p20ActionPerformed
           cord[2][0] = !cord[2][0];
    }//GEN-LAST:event_p20ActionPerformed

    private void p21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p21ActionPerformed
            cord[2][1] = !cord[2][1];
    }//GEN-LAST:event_p21ActionPerformed

    private void p22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p22ActionPerformed
           cord[2][2] = !cord[2][2];
    }//GEN-LAST:event_p22ActionPerformed

    private void p23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p23ActionPerformed
            cord[2][3] = !cord[2][3];
    }//GEN-LAST:event_p23ActionPerformed

    private void p24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p24ActionPerformed
            cord[2][4] = !cord[2][4];
    }//GEN-LAST:event_p24ActionPerformed

    private void p30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p30ActionPerformed
            cord[3][0] = !cord[3][0];
    }//GEN-LAST:event_p30ActionPerformed

    private void p31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p31ActionPerformed
            cord[3][1] = !cord[3][1];
    }//GEN-LAST:event_p31ActionPerformed

    private void p32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p32ActionPerformed
            cord[3][2] = !cord[3][2];
    }//GEN-LAST:event_p32ActionPerformed

    private void p33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p33ActionPerformed
            cord[3][3] = !cord[3][3];
    }//GEN-LAST:event_p33ActionPerformed

    private void p34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p34ActionPerformed
           cord[3][4] = !cord[3][4];
    }//GEN-LAST:event_p34ActionPerformed

    private void p40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p40ActionPerformed
           cord[4][0] = !cord[4][0];
    }//GEN-LAST:event_p40ActionPerformed

    private void p41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p41ActionPerformed
           cord[4][1] = !cord[4][1];
    }//GEN-LAST:event_p41ActionPerformed

    private void p42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p42ActionPerformed
           cord[4][2] = !cord[4][2];
    }//GEN-LAST:event_p42ActionPerformed

    private void p43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p43ActionPerformed
            cord[4][3] = !cord[4][3];
    }//GEN-LAST:event_p43ActionPerformed

    private void p44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p44ActionPerformed
           cord[4][4] = !cord[4][4];
    }//GEN-LAST:event_p44ActionPerformed

    void desactivarCalles() {
        //Horizontales
        c0001.setVisible(false);
        c0102.setVisible(false);
        c0203.setVisible(false);
        c0304.setVisible(false);
        c1011.setVisible(false);
        c1112.setVisible(false);
        c1213.setVisible(false);
        c1314.setVisible(false);
        c2021.setVisible(false);
        c2122.setVisible(false);
        c2223.setVisible(false);
        c2324.setVisible(false);
        c3031.setVisible(false);
        c3132.setVisible(false);
        c3233.setVisible(false);
        c3334.setVisible(false);
        c4041.setVisible(false);
        c4142.setVisible(false);
        c4243.setVisible(false);
        c4344.setVisible(false);
        //Verticales
        c0010.setVisible(false);
        c1020.setVisible(false);
        c2030.setVisible(false);
        c3040.setVisible(false);
        c0111.setVisible(false);
        c1121.setVisible(false);
        c2131.setVisible(false);
        c3141.setVisible(false);
        c0212.setVisible(false);
        c1222.setVisible(false);
        c2232.setVisible(false);
        c3242.setVisible(false);
        c0313.setVisible(false);
        c1323.setVisible(false);
        c2333.setVisible(false);
        c3343.setVisible(false);
        c0414.setVisible(false);
        c1424.setVisible(false);
        c2434.setVisible(false);
        c3444.setVisible(false);

    }

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
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //   new VentanaPrincipal(sistema,username).setVisible(true);.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenDeFondo;
    private javax.swing.JButton c0001;
    private javax.swing.JButton c0010;
    private javax.swing.JButton c0102;
    private javax.swing.JButton c0111;
    private javax.swing.JButton c0203;
    private javax.swing.JButton c0212;
    private javax.swing.JButton c0304;
    private javax.swing.JButton c0313;
    private javax.swing.JButton c0414;
    private javax.swing.JButton c1011;
    private javax.swing.JButton c1020;
    private javax.swing.JButton c1112;
    private javax.swing.JButton c1121;
    private javax.swing.JButton c1213;
    private javax.swing.JButton c1222;
    private javax.swing.JButton c1314;
    private javax.swing.JButton c1323;
    private javax.swing.JButton c1424;
    private javax.swing.JButton c2021;
    private javax.swing.JButton c2030;
    private javax.swing.JButton c2122;
    private javax.swing.JButton c2131;
    private javax.swing.JButton c2223;
    private javax.swing.JButton c2232;
    private javax.swing.JButton c2324;
    private javax.swing.JButton c2333;
    private javax.swing.JButton c2434;
    private javax.swing.JButton c3031;
    private javax.swing.JButton c3040;
    private javax.swing.JButton c3132;
    private javax.swing.JButton c3141;
    private javax.swing.JButton c3233;
    private javax.swing.JButton c3242;
    private javax.swing.JButton c3334;
    private javax.swing.JButton c3343;
    private javax.swing.JButton c3444;
    private javax.swing.JButton c4041;
    private javax.swing.JButton c4142;
    private javax.swing.JButton c4243;
    private javax.swing.JButton c4344;
    private javax.swing.JButton guardarBoton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton p00;
    private javax.swing.JRadioButton p01;
    private javax.swing.JRadioButton p02;
    private javax.swing.JRadioButton p03;
    private javax.swing.JRadioButton p04;
    private javax.swing.JRadioButton p10;
    private javax.swing.JRadioButton p11;
    private javax.swing.JRadioButton p12;
    private javax.swing.JRadioButton p13;
    private javax.swing.JRadioButton p14;
    private javax.swing.JRadioButton p20;
    private javax.swing.JRadioButton p21;
    private javax.swing.JRadioButton p22;
    private javax.swing.JRadioButton p23;
    private javax.swing.JRadioButton p24;
    private javax.swing.JRadioButton p30;
    private javax.swing.JRadioButton p31;
    private javax.swing.JRadioButton p32;
    private javax.swing.JRadioButton p33;
    private javax.swing.JRadioButton p34;
    private javax.swing.JRadioButton p40;
    private javax.swing.JRadioButton p41;
    private javax.swing.JRadioButton p42;
    private javax.swing.JRadioButton p43;
    private javax.swing.JRadioButton p44;
    // End of variables declaration//GEN-END:variables
}
