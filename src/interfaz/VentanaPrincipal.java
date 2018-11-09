/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import mascota.Sistema;

/**
 *
 * @author usuario
 */
public class VentanaPrincipal extends javax.swing.JFrame {

   
     static Sistema sistema ;
    public VentanaPrincipal(Sistema modelo) {
        initComponents();
        sistema = modelo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NombreMascota1 = new javax.swing.JLabel();
        ImagenMascota1 = new javax.swing.JLabel();
        NombreMascota2 = new javax.swing.JLabel();
        ImagenMascota2 = new javax.swing.JLabel();
        NombreMascota3 = new javax.swing.JLabel();
        ImagenMascota3 = new javax.swing.JLabel();
        NombreMascota4 = new javax.swing.JLabel();
        ImagenMascota4 = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        registrarMascota = new javax.swing.JButton();
        VeterinarioBoton = new javax.swing.JButton();
        calendarioBoton = new javax.swing.JButton();
        ImagenUsuario = new javax.swing.JLabel();
        ImagenDeFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(null);

        NombreMascota1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        NombreMascota1.setText("Nombre mascota 1");
        jPanel1.add(NombreMascota1);
        NombreMascota1.setBounds(100, 360, 120, 30);

        ImagenMascota1.setText("IMAGEN");
        jPanel1.add(ImagenMascota1);
        ImagenMascota1.setBounds(120, 300, 50, 30);

        NombreMascota2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        NombreMascota2.setText("Nombre mascota 2");
        jPanel1.add(NombreMascota2);
        NombreMascota2.setBounds(250, 360, 120, 30);

        ImagenMascota2.setText("IMAGEN");
        jPanel1.add(ImagenMascota2);
        ImagenMascota2.setBounds(270, 300, 50, 30);

        NombreMascota3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        NombreMascota3.setText("Nombre mascota 3");
        jPanel1.add(NombreMascota3);
        NombreMascota3.setBounds(400, 360, 120, 30);

        ImagenMascota3.setText("IMAGEN");
        jPanel1.add(ImagenMascota3);
        ImagenMascota3.setBounds(420, 300, 50, 30);

        NombreMascota4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        NombreMascota4.setText("Nombre mascota 4");
        jPanel1.add(NombreMascota4);
        NombreMascota4.setBounds(550, 360, 120, 30);

        ImagenMascota4.setText("IMAGEN");
        jPanel1.add(ImagenMascota4);
        ImagenMascota4.setBounds(570, 300, 50, 30);

        UsernameLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        UsernameLabel.setText("NOMBRE USUARIO");
        jPanel1.add(UsernameLabel);
        UsernameLabel.setBounds(60, 90, 110, 30);

        registrarMascota.setBackground(new java.awt.Color(153, 204, 255));
        registrarMascota.setForeground(new java.awt.Color(0, 102, 102));
        registrarMascota.setText("Registrar mascota");
        registrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarMascotaActionPerformed(evt);
            }
        });
        jPanel1.add(registrarMascota);
        registrarMascota.setBounds(550, 440, 130, 23);

        VeterinarioBoton.setBackground(new java.awt.Color(153, 204, 255));
        VeterinarioBoton.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        VeterinarioBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veterinaria.jpg"))); // NOI18N
        VeterinarioBoton.setMaximumSize(new java.awt.Dimension(10, 10));
        VeterinarioBoton.setMinimumSize(new java.awt.Dimension(5, 5));
        VeterinarioBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VeterinarioBotonActionPerformed(evt);
            }
        });
        jPanel1.add(VeterinarioBoton);
        VeterinarioBoton.setBounds(430, 100, 120, 30);

        calendarioBoton.setBackground(new java.awt.Color(153, 204, 255));
        calendarioBoton.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        calendarioBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario.jpg"))); // NOI18N
        calendarioBoton.setMaximumSize(new java.awt.Dimension(10, 10));
        calendarioBoton.setMinimumSize(new java.awt.Dimension(5, 5));
        calendarioBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calendarioBotonActionPerformed(evt);
            }
        });
        jPanel1.add(calendarioBoton);
        calendarioBoton.setBounds(300, 100, 120, 30);

        ImagenUsuario.setText("Imagen Usuario (el texto se borra)");
        jPanel1.add(ImagenUsuario);
        ImagenUsuario.setBounds(40, 40, 170, 14);

        ImagenDeFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dog summer.jpg"))); // NOI18N
        jPanel1.add(ImagenDeFondo);
        ImagenDeFondo.setBounds(0, 0, 950, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calendarioBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calendarioBotonActionPerformed
        Calendario calendario = new Calendario(sistema);
        calendario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_calendarioBotonActionPerformed

    private void VeterinarioBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VeterinarioBotonActionPerformed
        Veterinaria vet = new Veterinaria(sistema);
        vet.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VeterinarioBotonActionPerformed

    private void registrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarMascotaActionPerformed
        AltaMascota am = new AltaMascota(sistema);
        am.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registrarMascotaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(sistema).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenDeFondo;
    private javax.swing.JLabel ImagenMascota1;
    private javax.swing.JLabel ImagenMascota2;
    private javax.swing.JLabel ImagenMascota3;
    private javax.swing.JLabel ImagenMascota4;
    private javax.swing.JLabel ImagenUsuario;
    private javax.swing.JLabel NombreMascota1;
    private javax.swing.JLabel NombreMascota2;
    private javax.swing.JLabel NombreMascota3;
    private javax.swing.JLabel NombreMascota4;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JButton VeterinarioBoton;
    private javax.swing.JButton calendarioBoton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registrarMascota;
    // End of variables declaration//GEN-END:variables
}
