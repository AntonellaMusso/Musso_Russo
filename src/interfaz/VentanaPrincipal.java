
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import mascota.Familiar;
import mascota.Mascota;
import mascota.Sistema;

/**
 *
 * @author usuario
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    static private Sistema sistema;
    private Familiar username;

    public VentanaPrincipal(Sistema modelo) {
        initComponents();
        sistema = modelo;
        //configuro usuario
        username = sistema.getUsuarioSeleccionado();
        UsernameLabel.setText(username.getNombre());
        ImagenUsuario.setIcon(username.getFoto());
        //configuro mascota
        int numeroMascotas = sistema.getListaMascotas().size();
        //porque se muestran las 4 primeras
        if (numeroMascotas > 4) {
            numeroMascotas = 4;
        }

        switch (numeroMascotas) {
            case 1:
                NombreMascota1.setText(sistema.getListaMascotas().get(0).getNombre());
                pesoLabel1.setText(String.valueOf(sistema.getListaMascotas().get(0).getPeso()));
                alturaLabel1.setText(String.valueOf(sistema.getListaMascotas().get(0).getAltura()));
                comentarioLabel1.setText(sistema.getListaMascotas().get(0).getComentario());
                break;
            case 2:
                //mascota1
                NombreMascota1.setText(sistema.getListaMascotas().get(0).getNombre());
                pesoLabel1.setText(String.valueOf(sistema.getListaMascotas().get(0).getPeso()));
                alturaLabel1.setText(String.valueOf(sistema.getListaMascotas().get(0).getAltura()));
                comentarioLabel1.setText(sistema.getListaMascotas().get(0).getComentario());
                //mascota 2
                NombreMascota2.setText(sistema.getListaMascotas().get(1).getNombre());
                pesoLabel2.setText(String.valueOf(sistema.getListaMascotas().get(1).getPeso()));
                alturaLabel2.setText(String.valueOf(sistema.getListaMascotas().get(1).getAltura()));
                comentarioLabel2.setText(sistema.getListaMascotas().get(1).getComentario());
                break;
            case 3:
                //mascota1
                NombreMascota1.setText(sistema.getListaMascotas().get(0).getNombre());
                pesoLabel1.setText(String.valueOf(sistema.getListaMascotas().get(0).getPeso()));
                alturaLabel1.setText(String.valueOf(sistema.getListaMascotas().get(0).getAltura()));
                comentarioLabel1.setText(sistema.getListaMascotas().get(0).getComentario());
                //mascota 2
                NombreMascota2.setText(sistema.getListaMascotas().get(1).getNombre());
                pesoLabel2.setText(String.valueOf(sistema.getListaMascotas().get(1).getPeso()));
                alturaLabel2.setText(String.valueOf(sistema.getListaMascotas().get(1).getAltura()));
                comentarioLabel2.setText(sistema.getListaMascotas().get(1).getComentario());
                //mascota 3
                NombreMascota3.setText(sistema.getListaMascotas().get(2).getNombre());
                pesoLabel3.setText(String.valueOf(sistema.getListaMascotas().get(2).getPeso()));
                alturaLabel3.setText(String.valueOf(sistema.getListaMascotas().get(2).getAltura()));
                comentarioLabel3.setText(sistema.getListaMascotas().get(2).getComentario());
                break;
            case 4:
                 //mascota1
                NombreMascota1.setText(sistema.getListaMascotas().get(0).getNombre());
                pesoLabel1.setText(String.valueOf(sistema.getListaMascotas().get(0).getPeso()));
                alturaLabel1.setText(String.valueOf(sistema.getListaMascotas().get(0).getAltura()));
                comentarioLabel1.setText(sistema.getListaMascotas().get(0).getComentario());
                //mascota 2
                NombreMascota2.setText(sistema.getListaMascotas().get(1).getNombre());
                pesoLabel2.setText(String.valueOf(sistema.getListaMascotas().get(1).getPeso()));
                alturaLabel2.setText(String.valueOf(sistema.getListaMascotas().get(1).getAltura()));
                comentarioLabel2.setText(sistema.getListaMascotas().get(1).getComentario());
                //mascota 3
                NombreMascota3.setText(sistema.getListaMascotas().get(2).getNombre());
                pesoLabel3.setText(String.valueOf(sistema.getListaMascotas().get(2).getPeso()));
                alturaLabel3.setText(String.valueOf(sistema.getListaMascotas().get(2).getAltura()));
                comentarioLabel3.setText(sistema.getListaMascotas().get(2).getComentario());
                //mascota 4
                NombreMascota4.setText(sistema.getListaMascotas().get(3).getNombre());
                pesoLabel4.setText(String.valueOf(sistema.getListaMascotas().get(3).getPeso()));
                alturaLabel4.setText(String.valueOf(sistema.getListaMascotas().get(3).getAltura()));
                comentarioLabel4.setText(sistema.getListaMascotas().get(3).getComentario());
                break;
        }

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
        comentarioLabel1 = new javax.swing.JLabel();
        pesoLabel1 = new javax.swing.JLabel();
        alturaLabel1 = new javax.swing.JLabel();
        ImagenMascota1 = new javax.swing.JLabel();
        NombreMascota2 = new javax.swing.JLabel();
        pesoLabel2 = new javax.swing.JLabel();
        comentarioLabel2 = new javax.swing.JLabel();
        alturaLabel2 = new javax.swing.JLabel();
        ImagenMascota2 = new javax.swing.JLabel();
        NombreMascota3 = new javax.swing.JLabel();
        pesoLabel3 = new javax.swing.JLabel();
        alturaLabel3 = new javax.swing.JLabel();
        comentarioLabel3 = new javax.swing.JLabel();
        ImagenMascota3 = new javax.swing.JLabel();
        pesoLabel4 = new javax.swing.JLabel();
        alturaLabel4 = new javax.swing.JLabel();
        comentarioLabel4 = new javax.swing.JLabel();
        NombreMascota4 = new javax.swing.JLabel();
        ImagenMascota4 = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        PanelSostieneInfo = new javax.swing.JPanel();
        perfilSeleccionBoton = new javax.swing.JButton();
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
        NombreMascota1.setBounds(90, 260, 120, 30);

        comentarioLabel1.setText("Comentario");
        jPanel1.add(comentarioLabel1);
        comentarioLabel1.setBounds(90, 340, 100, 14);

        pesoLabel1.setText("peso kg");
        jPanel1.add(pesoLabel1);
        pesoLabel1.setBounds(90, 300, 50, 14);

        alturaLabel1.setText("altura cm");
        jPanel1.add(alturaLabel1);
        alturaLabel1.setBounds(90, 320, 50, 14);

        ImagenMascota1.setText("IMAGEN");
        jPanel1.add(ImagenMascota1);
        ImagenMascota1.setBounds(120, 220, 50, 30);

        NombreMascota2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        NombreMascota2.setText("Nombre mascota 2");
        jPanel1.add(NombreMascota2);
        NombreMascota2.setBounds(240, 260, 120, 30);

        pesoLabel2.setText("peso kg");
        jPanel1.add(pesoLabel2);
        pesoLabel2.setBounds(240, 300, 50, 14);

        comentarioLabel2.setText("Comentario");
        jPanel1.add(comentarioLabel2);
        comentarioLabel2.setBounds(240, 340, 100, 14);

        alturaLabel2.setText("altura cm");
        jPanel1.add(alturaLabel2);
        alturaLabel2.setBounds(240, 320, 50, 14);

        ImagenMascota2.setText("IMAGEN");
        jPanel1.add(ImagenMascota2);
        ImagenMascota2.setBounds(270, 220, 50, 30);

        NombreMascota3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        NombreMascota3.setText("Nombre mascota 3");
        jPanel1.add(NombreMascota3);
        NombreMascota3.setBounds(390, 260, 120, 30);

        pesoLabel3.setText("peso kg");
        jPanel1.add(pesoLabel3);
        pesoLabel3.setBounds(390, 300, 50, 14);

        alturaLabel3.setText("altura cm");
        jPanel1.add(alturaLabel3);
        alturaLabel3.setBounds(390, 320, 50, 14);

        comentarioLabel3.setText("Comentario");
        jPanel1.add(comentarioLabel3);
        comentarioLabel3.setBounds(390, 340, 100, 14);

        ImagenMascota3.setText("IMAGEN");
        jPanel1.add(ImagenMascota3);
        ImagenMascota3.setBounds(420, 220, 50, 30);

        pesoLabel4.setText("peso kg");
        jPanel1.add(pesoLabel4);
        pesoLabel4.setBounds(540, 300, 50, 14);

        alturaLabel4.setText("altura cm");
        jPanel1.add(alturaLabel4);
        alturaLabel4.setBounds(540, 320, 50, 14);

        comentarioLabel4.setText("Comentario");
        jPanel1.add(comentarioLabel4);
        comentarioLabel4.setBounds(540, 340, 100, 14);

        NombreMascota4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        NombreMascota4.setText("Nombre mascota 4");
        jPanel1.add(NombreMascota4);
        NombreMascota4.setBounds(540, 260, 120, 30);

        ImagenMascota4.setText("IMAGEN");
        jPanel1.add(ImagenMascota4);
        ImagenMascota4.setBounds(570, 220, 50, 30);

        UsernameLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        UsernameLabel.setText("NOMBRE USUARIO");
        jPanel1.add(UsernameLabel);
        UsernameLabel.setBounds(60, 90, 110, 30);

        PanelSostieneInfo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelSostieneInfoLayout = new javax.swing.GroupLayout(PanelSostieneInfo);
        PanelSostieneInfo.setLayout(PanelSostieneInfoLayout);
        PanelSostieneInfoLayout.setHorizontalGroup(
            PanelSostieneInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        PanelSostieneInfoLayout.setVerticalGroup(
            PanelSostieneInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        jPanel1.add(PanelSostieneInfo);
        PanelSostieneInfo.setBounds(60, 260, 610, 110);

        perfilSeleccionBoton.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        perfilSeleccionBoton.setText("Seleccionar Perfil");
        perfilSeleccionBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilSeleccionBotonActionPerformed(evt);
            }
        });
        jPanel1.add(perfilSeleccionBoton);
        perfilSeleccionBoton.setBounds(20, 440, 150, 25);

        registrarMascota.setBackground(new java.awt.Color(204, 255, 255));
        registrarMascota.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        registrarMascota.setForeground(new java.awt.Color(0, 102, 102));
        registrarMascota.setText("Registrar mascota");
        registrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarMascotaActionPerformed(evt);
            }
        });
        jPanel1.add(registrarMascota);
        registrarMascota.setBounds(550, 440, 140, 25);

        VeterinarioBoton.setBackground(new java.awt.Color(153, 204, 255));
        VeterinarioBoton.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        VeterinarioBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/veterinaria.jpg"))); // NOI18N
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
        calendarioBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendario.jpg"))); // NOI18N
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

        ImagenDeFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dog summer.jpg"))); // NOI18N
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
        AltaMascota altaMascota = new AltaMascota(sistema);
        altaMascota.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registrarMascotaActionPerformed

    private void perfilSeleccionBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilSeleccionBotonActionPerformed
        Perfiles perfiles = new Perfiles(sistema);
        perfiles.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_perfilSeleccionBotonActionPerformed

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
                //   new VentanaPrincipal(sistema,username).setVisible(true);.
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
    private javax.swing.JPanel PanelSostieneInfo;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JButton VeterinarioBoton;
    private javax.swing.JLabel alturaLabel1;
    private javax.swing.JLabel alturaLabel2;
    private javax.swing.JLabel alturaLabel3;
    private javax.swing.JLabel alturaLabel4;
    private javax.swing.JButton calendarioBoton;
    private javax.swing.JLabel comentarioLabel1;
    private javax.swing.JLabel comentarioLabel2;
    private javax.swing.JLabel comentarioLabel3;
    private javax.swing.JLabel comentarioLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton perfilSeleccionBoton;
    private javax.swing.JLabel pesoLabel1;
    private javax.swing.JLabel pesoLabel2;
    private javax.swing.JLabel pesoLabel3;
    private javax.swing.JLabel pesoLabel4;
    private javax.swing.JButton registrarMascota;
    // End of variables declaration//GEN-END:variables
}

