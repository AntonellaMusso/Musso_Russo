
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

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
public class MapaMuestra extends javax.swing.JFrame {

    static private Sistema sistema;
    String cord;
    HashMap<String, JButton> calles;


    public MapaMuestra(Sistema modelo,String cordenadas) {
        initComponents();
        sistema = modelo;
        desactivarCalles();
        cord = cordenadas;         
        calles = new HashMap();
        iniciarHashMap();
        inicializarCalles(cord);//calles las cuales camino
        
    }
    
    void iniciarHashMap(){
        calles.put("0001", c0001);
        calles.put("0010", c0010);
        calles.put("0102", c0102);
        calles.put("0111", c0111);
        calles.put("0203", c0203);
        calles.put("0212", c0212);
        calles.put("0304", c0304);
        calles.put("0313", c0313);
        calles.put("0414", c0414);
        calles.put("1011", c1011);
        calles.put("1020", c1020);
        calles.put("1112", c1112);
        calles.put("1121", c1121);
        calles.put("1213", c1213);
        calles.put("1222", c1222);
        calles.put("1314", c1314);
        calles.put("1323", c1323);
        calles.put("1424", c1424);
        calles.put("2021", c2021);
        calles.put("2030", c2030);
        calles.put("2122", c2122);
        calles.put("2131", c2131);
        calles.put("2223", c2223);
        calles.put("2232", c2232);
        calles.put("2324", c2324);
        calles.put("2333", c2333);
        calles.put("2434", c2434);
        calles.put("3031", c3031);
        calles.put("3040", c3040);
        calles.put("3132", c3132);
        calles.put("3141", c3141);
        calles.put("3233", c3233);
        calles.put("3242", c3242);
        calles.put("3343", c3343);
        calles.put("3444", c3444);
        calles.put("4041", c4041);
        calles.put("4142", c4142);
        calles.put("4243", c4243);
        calles.put("4344", c4344);  
        calles.put("3334", c3334);  
        
        
    }
    
   void inicializarCalles(String cordenadas){
       int hasta = (cordenadas.length()/3)-1;
       int inicio =1;
       int fin = 3;
       for (int i = 0; i < hasta; i++) {
           String pun1 = cordenadas.substring(inicio, fin);
           String pun2 = cordenadas.substring(inicio+3, fin+3);
           String key = pun1+pun2;
           System.out.println("calle a revelar: "+key);    
           if (calles.containsKey(key)){
           calles.get(key).setVisible(true);
           }
           inicio = inicio+3;
           fin = fin+3;
       }
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(580, 0, 140, 480);

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
            java.util.logging.Logger.getLogger(MapaMuestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MapaMuestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MapaMuestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MapaMuestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
