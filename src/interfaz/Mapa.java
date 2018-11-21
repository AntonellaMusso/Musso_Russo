
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JButton;
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
   ArrayList<String> calles; 

    public Mapa(Sistema modelo,Actividad actividad) {
        initComponents();
        sistema = modelo;
        setLocationRelativeTo(null); 
        //desactivarCalles();
        act = actividad;
        calles = new ArrayList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        guardarBoton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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

        guardarBoton.setBackground(new java.awt.Color(255, 255, 255));
        guardarBoton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        guardarBoton.setText("Guardar");
        guardarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBotonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Selecciona las calles");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("recorridas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(guardarBoton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)
                .addComponent(guardarBoton)
                .addGap(29, 29, 29))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(580, 0, 140, 480);

        c0001.setBackground(new java.awt.Color(204, 204, 204));
        c0001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c0001ActionPerformed(evt);
            }
        });
        jPanel1.add(c0001);
        c0001.setBounds(30, 460, 100, 20);

        c1011.setBackground(new java.awt.Color(204, 204, 204));
        c1011.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1011ActionPerformed(evt);
            }
        });
        jPanel1.add(c1011);
        c1011.setBounds(30, 340, 100, 20);

        c2021.setBackground(new java.awt.Color(204, 204, 204));
        c2021.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2021ActionPerformed(evt);
            }
        });
        jPanel1.add(c2021);
        c2021.setBounds(30, 230, 100, 20);

        c3031.setBackground(new java.awt.Color(204, 204, 204));
        c3031.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3031ActionPerformed(evt);
            }
        });
        jPanel1.add(c3031);
        c3031.setBounds(30, 110, 100, 20);

        c4041.setBackground(new java.awt.Color(204, 204, 204));
        c4041.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4041ActionPerformed(evt);
            }
        });
        jPanel1.add(c4041);
        c4041.setBounds(30, 0, 100, 20);

        c0102.setBackground(new java.awt.Color(204, 204, 204));
        c0102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c0102ActionPerformed(evt);
            }
        });
        jPanel1.add(c0102);
        c0102.setBounds(170, 460, 100, 20);

        c1112.setBackground(new java.awt.Color(204, 204, 204));
        c1112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1112ActionPerformed(evt);
            }
        });
        jPanel1.add(c1112);
        c1112.setBounds(170, 340, 100, 20);

        c2122.setBackground(new java.awt.Color(204, 204, 204));
        c2122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2122ActionPerformed(evt);
            }
        });
        jPanel1.add(c2122);
        c2122.setBounds(170, 230, 100, 20);

        c3132.setBackground(new java.awt.Color(204, 204, 204));
        c3132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3132ActionPerformed(evt);
            }
        });
        jPanel1.add(c3132);
        c3132.setBounds(170, 110, 100, 20);

        c4142.setBackground(new java.awt.Color(204, 204, 204));
        c4142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4142ActionPerformed(evt);
            }
        });
        jPanel1.add(c4142);
        c4142.setBounds(170, 0, 100, 20);

        c0304.setBackground(new java.awt.Color(204, 204, 204));
        c0304.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c0304ActionPerformed(evt);
            }
        });
        jPanel1.add(c0304);
        c0304.setBounds(450, 460, 100, 20);

        c3334.setBackground(new java.awt.Color(204, 204, 204));
        c3334.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3334ActionPerformed(evt);
            }
        });
        jPanel1.add(c3334);
        c3334.setBounds(450, 110, 100, 20);

        c1314.setBackground(new java.awt.Color(204, 204, 204));
        c1314.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1314ActionPerformed(evt);
            }
        });
        jPanel1.add(c1314);
        c1314.setBounds(450, 340, 100, 20);

        c2324.setBackground(new java.awt.Color(204, 204, 204));
        c2324.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2324ActionPerformed(evt);
            }
        });
        jPanel1.add(c2324);
        c2324.setBounds(450, 230, 100, 20);

        c4344.setBackground(new java.awt.Color(204, 204, 204));
        c4344.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4344ActionPerformed(evt);
            }
        });
        jPanel1.add(c4344);
        c4344.setBounds(450, 0, 100, 20);

        c0203.setBackground(new java.awt.Color(204, 204, 204));
        c0203.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c0203ActionPerformed(evt);
            }
        });
        jPanel1.add(c0203);
        c0203.setBounds(310, 460, 100, 20);

        c1213.setBackground(new java.awt.Color(204, 204, 204));
        c1213.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1213ActionPerformed(evt);
            }
        });
        jPanel1.add(c1213);
        c1213.setBounds(310, 340, 100, 20);

        c2223.setBackground(new java.awt.Color(204, 204, 204));
        c2223.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2223ActionPerformed(evt);
            }
        });
        jPanel1.add(c2223);
        c2223.setBounds(310, 230, 100, 20);

        c3233.setBackground(new java.awt.Color(204, 204, 204));
        c3233.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3233ActionPerformed(evt);
            }
        });
        jPanel1.add(c3233);
        c3233.setBounds(310, 110, 100, 20);

        c4243.setBackground(new java.awt.Color(204, 204, 204));
        c4243.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4243ActionPerformed(evt);
            }
        });
        jPanel1.add(c4243);
        c4243.setBounds(310, 0, 100, 20);

        c0010.setBackground(new java.awt.Color(204, 204, 204));
        c0010.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c0010ActionPerformed(evt);
            }
        });
        jPanel1.add(c0010);
        c0010.setBounds(0, 360, 20, 100);

        c1020.setBackground(new java.awt.Color(204, 204, 204));
        c1020.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1020ActionPerformed(evt);
            }
        });
        jPanel1.add(c1020);
        c1020.setBounds(0, 250, 20, 100);

        c2030.setBackground(new java.awt.Color(204, 204, 204));
        c2030.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2030ActionPerformed(evt);
            }
        });
        jPanel1.add(c2030);
        c2030.setBounds(0, 130, 20, 100);

        c3040.setBackground(new java.awt.Color(204, 204, 204));
        c3040.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3040ActionPerformed(evt);
            }
        });
        jPanel1.add(c3040);
        c3040.setBounds(0, 20, 20, 100);

        c0111.setBackground(new java.awt.Color(204, 204, 204));
        c0111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c0111ActionPerformed(evt);
            }
        });
        jPanel1.add(c0111);
        c0111.setBounds(140, 360, 20, 100);

        c1121.setBackground(new java.awt.Color(204, 204, 204));
        c1121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1121ActionPerformed(evt);
            }
        });
        jPanel1.add(c1121);
        c1121.setBounds(140, 250, 20, 100);

        c2131.setBackground(new java.awt.Color(204, 204, 204));
        c2131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2131ActionPerformed(evt);
            }
        });
        jPanel1.add(c2131);
        c2131.setBounds(140, 130, 20, 100);

        c3141.setBackground(new java.awt.Color(204, 204, 204));
        c3141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3141ActionPerformed(evt);
            }
        });
        jPanel1.add(c3141);
        c3141.setBounds(140, 20, 20, 100);

        c0212.setBackground(new java.awt.Color(204, 204, 204));
        c0212.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c0212ActionPerformed(evt);
            }
        });
        jPanel1.add(c0212);
        c0212.setBounds(280, 360, 20, 100);

        c1222.setBackground(new java.awt.Color(204, 204, 204));
        c1222.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1222ActionPerformed(evt);
            }
        });
        jPanel1.add(c1222);
        c1222.setBounds(280, 250, 20, 100);

        c2232.setBackground(new java.awt.Color(204, 204, 204));
        c2232.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2232ActionPerformed(evt);
            }
        });
        jPanel1.add(c2232);
        c2232.setBounds(280, 130, 20, 100);

        c3242.setBackground(new java.awt.Color(204, 204, 204));
        c3242.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3242ActionPerformed(evt);
            }
        });
        jPanel1.add(c3242);
        c3242.setBounds(280, 20, 20, 100);

        c0313.setBackground(new java.awt.Color(204, 204, 204));
        c0313.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c0313ActionPerformed(evt);
            }
        });
        jPanel1.add(c0313);
        c0313.setBounds(420, 360, 20, 100);

        c1323.setBackground(new java.awt.Color(204, 204, 204));
        c1323.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1323ActionPerformed(evt);
            }
        });
        jPanel1.add(c1323);
        c1323.setBounds(420, 250, 20, 100);

        c2333.setBackground(new java.awt.Color(204, 204, 204));
        c2333.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2333ActionPerformed(evt);
            }
        });
        jPanel1.add(c2333);
        c2333.setBounds(420, 130, 20, 100);

        c3343.setBackground(new java.awt.Color(204, 204, 204));
        c3343.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3343ActionPerformed(evt);
            }
        });
        jPanel1.add(c3343);
        c3343.setBounds(420, 20, 20, 100);

        c3444.setBackground(new java.awt.Color(204, 204, 204));
        c3444.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3444ActionPerformed(evt);
            }
        });
        jPanel1.add(c3444);
        c3444.setBounds(560, 20, 20, 100);

        c0414.setBackground(new java.awt.Color(204, 204, 204));
        c0414.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c0414ActionPerformed(evt);
            }
        });
        jPanel1.add(c0414);
        c0414.setBounds(560, 360, 20, 100);

        c2434.setBackground(new java.awt.Color(204, 204, 204));
        c2434.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2434ActionPerformed(evt);
            }
        });
        jPanel1.add(c2434);
        c2434.setBounds(560, 130, 20, 100);

        c1424.setBackground(new java.awt.Color(204, 204, 204));
        c1424.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1424ActionPerformed(evt);
            }
        });
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
        String cordenadas = "";
        if (calles.size() != 0){
        for (int i = 0; i < calles.size(); i++) {
            cordenadas += " "+calles.get(i);
        }
        //-------------
        Actividad actividad;
        Familiar f = act.getFamiliar();
        Mascota m = act.getMascota();
        String descrip = act.getDescripcion();
        Date fecha = act.getFecha();
        int distancia = act.getDistancia();
        String cor = cordenadas;
        actividad = new Actividad(f,m,descrip,fecha,distancia,cor);
        //---------------------------
        sistema.getListaActividades().add(actividad);
        JOptionPane.showMessageDialog(null, "  Paseo registrado ! ");
        Calendario c = new Calendario(sistema);
        c.setVisible(true);
        this.setVisible(false);
        }else{
           JOptionPane.showMessageDialog(null, "ninguna callle registrada");
        }
        
    }//GEN-LAST:event_guardarBotonActionPerformed
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
    private void c0001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c0001ActionPerformed
        calles.add("0001");
        c0001.setBackground(Color.BLUE);
    }//GEN-LAST:event_c0001ActionPerformed

    private void c0102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c0102ActionPerformed
        calles.add("0102");
        c0102.setBackground(Color.BLUE);
    }//GEN-LAST:event_c0102ActionPerformed

    private void c0203ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c0203ActionPerformed
        calles.add("0203");
        c0203.setBackground(Color.BLUE);
    }//GEN-LAST:event_c0203ActionPerformed

    private void c0304ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c0304ActionPerformed
        calles.add("0304");
        c0304.setBackground(Color.BLUE);
    }//GEN-LAST:event_c0304ActionPerformed

    private void c0010ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c0010ActionPerformed
        calles.add("0010");
        c0010.setBackground(Color.BLUE);
    }//GEN-LAST:event_c0010ActionPerformed

    private void c0111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c0111ActionPerformed
        calles.add("0111");
        c0111.setBackground(Color.BLUE);
    }//GEN-LAST:event_c0111ActionPerformed

    private void c0212ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c0212ActionPerformed
        calles.add("0212");
        c0212.setBackground(Color.BLUE);
    }//GEN-LAST:event_c0212ActionPerformed

    private void c0313ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c0313ActionPerformed
        calles.add("0313");
        c0313.setBackground(Color.BLUE);
    }//GEN-LAST:event_c0313ActionPerformed

    private void c0414ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c0414ActionPerformed
        calles.add("0414");
        c0414.setBackground(Color.BLUE);
    }//GEN-LAST:event_c0414ActionPerformed

    private void c1011ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1011ActionPerformed
       calles.add("1011");
       c1011.setBackground(Color.BLUE);
    }//GEN-LAST:event_c1011ActionPerformed

    private void c1112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1112ActionPerformed
        calles.add("1112");
        c1112.setBackground(Color.BLUE);
    }//GEN-LAST:event_c1112ActionPerformed

    private void c1213ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1213ActionPerformed
      calles.add("1213");
      c1213.setBackground(Color.BLUE);
    }//GEN-LAST:event_c1213ActionPerformed

    private void c1314ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1314ActionPerformed
        calles.add("1314");
        c1314.setBackground(Color.BLUE);
    }//GEN-LAST:event_c1314ActionPerformed

    private void c1020ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1020ActionPerformed
        calles.add("1020");
        c1020.setBackground(Color.BLUE);
    }//GEN-LAST:event_c1020ActionPerformed

    private void c1121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1121ActionPerformed
       calles.add("1121");
       c1121.setBackground(Color.BLUE);
    }//GEN-LAST:event_c1121ActionPerformed

    private void c1222ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1222ActionPerformed
        calles.add("1222");
         c1222.setBackground(Color.BLUE);
    }//GEN-LAST:event_c1222ActionPerformed

    private void c1323ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1323ActionPerformed
      calles.add("1323");
      c1323.setBackground(Color.BLUE);
    }//GEN-LAST:event_c1323ActionPerformed

    private void c1424ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1424ActionPerformed
       calles.add("1424");
       c1424.setBackground(Color.BLUE);
    }//GEN-LAST:event_c1424ActionPerformed

    private void c2021ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2021ActionPerformed
        calles.add("2021");
        c2021.setBackground(Color.BLUE);
    }//GEN-LAST:event_c2021ActionPerformed

    private void c2122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2122ActionPerformed
        calles.add("2122");
        c2122.setBackground(Color.BLUE);
    }//GEN-LAST:event_c2122ActionPerformed

    private void c2223ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2223ActionPerformed
        calles.add("2223");
        c2223.setBackground(Color.BLUE);
    }//GEN-LAST:event_c2223ActionPerformed

    private void c2324ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2324ActionPerformed
        calles.add("2324");
        c2324.setBackground(Color.BLUE);
    }//GEN-LAST:event_c2324ActionPerformed

    private void c2030ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2030ActionPerformed
      calles.add("2030");
      c2030.setBackground(Color.BLUE);
    }//GEN-LAST:event_c2030ActionPerformed

    private void c2131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2131ActionPerformed
        calles.add("2131");
        c2131.setBackground(Color.BLUE);
    }//GEN-LAST:event_c2131ActionPerformed

    private void c2232ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2232ActionPerformed
        calles.add("2232");
        c2232.setBackground(Color.BLUE);
    }//GEN-LAST:event_c2232ActionPerformed

    private void c2333ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2333ActionPerformed
       calles.add("2333");
       c2333.setBackground(Color.BLUE);
    }//GEN-LAST:event_c2333ActionPerformed

    private void c2434ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2434ActionPerformed
       calles.add("2434");
       c2434.setBackground(Color.BLUE);
    }//GEN-LAST:event_c2434ActionPerformed

    private void c3031ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3031ActionPerformed
        calles.add("3031");
        c3031.setBackground(Color.BLUE);
    }//GEN-LAST:event_c3031ActionPerformed

    private void c3132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3132ActionPerformed
       calles.add("3132");
       c3132.setBackground(Color.BLUE);
    }//GEN-LAST:event_c3132ActionPerformed

    private void c3233ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3233ActionPerformed
        calles.add("3233");
        c3233.setBackground(Color.BLUE);
    }//GEN-LAST:event_c3233ActionPerformed

    private void c3334ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3334ActionPerformed
        calles.add("3334");
        c3334.setBackground(Color.BLUE);
    }//GEN-LAST:event_c3334ActionPerformed

    private void c3040ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3040ActionPerformed
        calles.add("3040");
        c3040.setBackground(Color.BLUE);
    }//GEN-LAST:event_c3040ActionPerformed

    private void c3141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3141ActionPerformed
        calles.add("3141");
        c3141.setBackground(Color.BLUE);
    }//GEN-LAST:event_c3141ActionPerformed

    private void c3242ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3242ActionPerformed
       calles.add("3242");
       c3242.setBackground(Color.BLUE);
    }//GEN-LAST:event_c3242ActionPerformed

    private void c3343ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3343ActionPerformed
        calles.add("3343");
        c3343.setBackground(Color.BLUE);
    }//GEN-LAST:event_c3343ActionPerformed

    private void c3444ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3444ActionPerformed
        calles.add("3444");
        c3444.setBackground(Color.BLUE);
    }//GEN-LAST:event_c3444ActionPerformed

    private void c4041ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4041ActionPerformed
       calles.add("4041");
       c4041.setBackground(Color.BLUE);
    }//GEN-LAST:event_c4041ActionPerformed

    private void c4142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4142ActionPerformed
        calles.add("4142");
        c4142.setBackground(Color.BLUE);
    }//GEN-LAST:event_c4142ActionPerformed

    private void c4243ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4243ActionPerformed
        calles.add("4243");
        c4243.setBackground(Color.BLUE);
    }//GEN-LAST:event_c4243ActionPerformed

    private void c4344ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4344ActionPerformed
        calles.add("4344");
        c4344.setBackground(Color.BLUE);
    }//GEN-LAST:event_c4344ActionPerformed

   

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
